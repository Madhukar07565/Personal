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
package com.cnk.travelogix.common.inventory.air.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import org.apache.log4j.Logger;

import com.cnk.travelogix.transport.inventory.core.service.AirlineInventoryRequestIdService;
import com.cnk.travelogix.transportinventory.core.model.AirlineInventoryRequestModel;


/**
 *
 */
public class AirlineInventoryRequestPrepareInterceptor implements PrepareInterceptor<AirlineInventoryRequestModel>
{

	private static final Logger LOG = Logger.getLogger(AirlineInventoryRequestPrepareInterceptor.class.getName());
	private AirlineInventoryRequestIdService airlineinventoryRequestservice;

	/**
	 * @return the airlineinventoryRequestservice
	 */
	public AirlineInventoryRequestIdService getAirlineinventoryRequestservice()
	{
		return airlineinventoryRequestservice;
	}

	/**
	 * @param airlineinventoryRequestservice
	 *           the airlineinventoryRequestservice to set
	 */
	public void setAirlineinventoryRequestservice(final AirlineInventoryRequestIdService airlineinventoryRequestservice)
	{
		this.airlineinventoryRequestservice = airlineinventoryRequestservice;
	}



	@Override
	public void onPrepare(final AirlineInventoryRequestModel airlinemodel, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside onPrepare() of  AirlineInventoryRequestPrepareInterceptor");
		}

		if (ctx.isNew(airlinemodel))
		{
			airlineinventoryRequestservice.generateAirlineInventoryRequestId(airlinemodel);
		}
		if (LOG.isDebugEnabled())
		{
			LOG.info("End onPrepare() of  AirlineInventoryRequestPrepareInterceptor");
		}

	}

}
