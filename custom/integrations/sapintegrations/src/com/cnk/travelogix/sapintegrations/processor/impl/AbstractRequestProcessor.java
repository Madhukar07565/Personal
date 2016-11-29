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
package com.cnk.travelogix.sapintegrations.processor.impl;


import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.util.Config;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.sapintegrations.adaptor.RequestExecutor;
import com.cnk.travelogix.sapintegrations.dto.factory.DTOObjectFactory;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.RequestProcessor;



public abstract class AbstractRequestProcessor<RequestType, ResponseType> implements RequestProcessor<RequestType, ResponseType>
{
	private static final String CONNECTION_ERROR_STATUS = "sapws.connection.error.status";
	private static final String CONNECTION_ERROR_MESSAGE = "sapws.connection.error.message";

	private RequestExecutor queryExecutor;
	private DTOObjectFactory dtoObjectFactory;
	private String soapAction;

	@Autowired
	private ConfigurationService configurationService;

	public DTOObjectFactory getDtoObjectFactory()
	{
		return dtoObjectFactory;
	}

	public void setDtoObjectFactory(final DTOObjectFactory dtoObjectFactory)
	{
		this.dtoObjectFactory = dtoObjectFactory;
	}

	@Override
	public ResponseType processRequest(final Object request)
	{
		final RequestMessage requestMessage = translateRequest((RequestType) request);
		final JAXBElement<ResponseType> responseString = (JAXBElement<ResponseType>) getQueryExecutor().execute(requestMessage);
		if ((responseString == null || responseString.getValue() == null) && Config.getBoolean("mockSOAServices", false))
		{
			return mockResponse((RequestType) requestMessage.getRequestObject().getValue());
		}
		return translateResponse(responseString);

	}

	protected abstract RequestMessage translateRequest(RequestType request);

	protected abstract JAXBElement<ResponseType> createErrorResponse();

	protected ResponseType translateResponse(final JAXBElement<ResponseType> reply)
	{
		if (reply == null || reply.getValue() == null)
		{
			return createErrorResponse().getValue();
		}

		return reply.getValue();
	}

	protected ResponseType mockResponse(@SuppressWarnings("unused") final RequestType request)
	{
		return createErrorResponse().getValue();
	}

	/**
	 * @return the soapAction
	 */
	public String getSoapAction()
	{
		return soapAction;
	}

	/**
	 * @param soapAction
	 *           the soapAction to set
	 */
	public void setSoapAction(final String soapAction)
	{
		this.soapAction = soapAction;
	}

	/**
	 * @return the queryExecutor
	 */
	public RequestExecutor getQueryExecutor()
	{
		return queryExecutor;
	}

	/**
	 * @param queryExecutor
	 *           the queryExecutor to set
	 */
	public void setQueryExecutor(final RequestExecutor queryExecutor)
	{
		this.queryExecutor = queryExecutor;
	}

	public ConfigurationService getConfigurationService()
	{
		return configurationService;
	}

	public void setConfigurationService(final ConfigurationService configurationService)
	{
		this.configurationService = configurationService;
	}

	public static String getConnectionErrorStatus()
	{
		return CONNECTION_ERROR_STATUS;
	}

	public static String getConnectionErrorMessage()
	{
		return CONNECTION_ERROR_MESSAGE;
	}

	/**
	 * @return the requestExecutor
	 */

}
