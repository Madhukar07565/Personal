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
package com.cnk.travelogix.sapintegrations.factory;

import java.util.Map;

import com.cnk.travelogix.sapintegrations.exception.ServiceNotSupportedException;
import com.cnk.travelogix.sapintegrations.processor.RequestProcessor;


/**
 *
 */
public class DefaultSAPWebServicesFactory implements SAPWebServicesFactory
{
	private Map<Class<RequestProcessor>, RequestProcessor> services;

	/**
	 * @param services
	 *           the services to set
	 */
	public void setServices(final Map<Class<RequestProcessor>, RequestProcessor> services)
	{
		this.services = services;
	}



	@Override
	public <T extends RequestProcessor> T createSAPWebService(final Class<T> servicesInterface) throws ServiceNotSupportedException
	{
		final RequestProcessor service = services.get(servicesInterface);
		if (service == null)
		{
			throw new ServiceNotSupportedException((new StringBuilder("Service not implemented / available: "))
					.append(servicesInterface.getCanonicalName()).toString());
		}
		else
		{
			return (T) service;
		}
	}

}
