/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.sapintegrations.adaptor.impl;

import de.hybris.platform.util.Config;

import java.util.Calendar;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.record.formula.functions.T;
import org.springframework.ws.client.WebServiceIOException;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.cnk.travelogix.sapintegrations.adaptor.RequestExecutor;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.RequestProcessor;


/**
 *
 */
public class SAPRequestExecutor<ResponseType> implements RequestExecutor
{
	private Map<Class<RequestProcessor>, WebServiceTemplate> serviceMappings;
	private static final Logger LOG = Logger.getLogger(SAPRequestExecutor.class);

	public WebServiceTemplate getWebServiceTemplate(final Class<T> serviceInterface)
	{
		return getServiceMappings().get(serviceInterface);
	}

	@Override
	public Object execute(final RequestMessage request)
	{
		ResponseType response = null;
		final boolean isServicesAvailable = Config.getBoolean("sapwebservices.enabled", true);
		final long startTime = Calendar.getInstance().getTimeInMillis();
		try
		{
			if (isServicesAvailable)
			{
				final WebServiceTemplate webServiceTemplate = getWebServiceTemplate(request.getServiceInterface());
				if (webServiceTemplate != null)
				{
					LOG.debug("QUERYING " + webServiceTemplate.getDefaultUri() + " FOR " + request.getSoapAction());
					response = (ResponseType) webServiceTemplate.marshalSendAndReceive(request.getRequestObject(),
							new SoapActionCallback(request.getSoapAction()));
					LOG.debug("response time for SAP WS action : " + request.getSoapAction() + " is :"
							+ new Long(((Calendar.getInstance().getTimeInMillis() - startTime) / 1000) % 60) + " secs.");
				}
				else
				{
					LOG.error("Client WebService not found for interface " + request.getServiceInterface().getName());
				}
			}
		}
		catch (final WebServiceIOException ioe)
		{
			// trigger email
			LOG.info("WebServiceIOException - outage response time for " + request.getSoapAction() + " is : "
					+ new Long(((Calendar.getInstance().getTimeInMillis() - startTime) / 1000) % 60) + " secs.");
			LOG.error(ioe);
		}
		catch (final Exception e)
		{
			LOG.error(getClass() + ".execute() " + e);
		}

		return response;
	}

	/**
	 * @return the serviceMappings
	 */
	public Map<Class<RequestProcessor>, WebServiceTemplate> getServiceMappings()
	{
		return serviceMappings;
	}

	/**
	 * @param serviceMappings
	 *           the serviceMappings to set
	 */
	public void setServiceMappings(final Map<Class<RequestProcessor>, WebServiceTemplate> serviceMappings)
	{
		this.serviceMappings = serviceMappings;
	}

}
