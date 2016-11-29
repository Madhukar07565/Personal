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
package com.cnk.travelogix.product.transport.masters.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import org.apache.log4j.Logger;

import com.cnk.travelogix.product.transport.masters.core.model.AirLineDetailsModel;
import com.cnk.travelogix.product.transport.masters.core.model.FlightProductModel;


/**
 * Prepare Airline Details model before save <br>
 * <h6>Airline type if not already set</h6>
 */
public class AirLineDetailsPrepareInterceptor implements PrepareInterceptor<AirLineDetailsModel>
{
	private static final Logger LOG = Logger.getLogger(AirLineDetailsPrepareInterceptor.class.getName());

	@Override
	public void onPrepare(final AirLineDetailsModel model, final InterceptorContext ctx) throws InterceptorException
	{
		if (model.getOwner() instanceof FlightProductModel)
		{
			if (LOG.isDebugEnabled())
			{
				LOG.debug("Areparing Airline Details for " + model.getOwner().getItemtype());
			}
			if (model.getAirlineType() == null)
			{
				model.setAirlineType(((FlightProductModel) model.getOwner()).getAirlineType());
			}
		}
	}
}