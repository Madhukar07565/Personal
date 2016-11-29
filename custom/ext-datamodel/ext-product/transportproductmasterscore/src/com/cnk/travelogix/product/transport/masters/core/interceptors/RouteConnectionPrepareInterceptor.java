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

import java.util.Collection;

import org.apache.log4j.Logger;

import com.cnk.travelogix.product.common.core.model.SectorModel;
import com.cnk.travelogix.product.transport.masters.core.model.RouteConnectionModel;


/**
 * Interceptor to set ConnectionId value for RouteConnection
 */
public class RouteConnectionPrepareInterceptor implements PrepareInterceptor
{
	private static final Logger LOG = Logger.getLogger(RouteConnectionPrepareInterceptor.class.getName());

	@Override
	public void onPrepare(final Object model, final InterceptorContext ctx) throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside onPrepare() of  RouteConnectionPrepareInterceptor");
		}

		if (ctx.isNew(model))
		{
			final StringBuilder stringBuilder = new StringBuilder();
			final RouteConnectionModel routeConnection = (RouteConnectionModel) model;
			final Collection<SectorModel> sectors = routeConnection.getSectors();

			int index = 0;

			if (sectors != null)
			{
				for (final SectorModel sector : sectors)
				{

					index = index + 1;
					stringBuilder.append(sector.getFromCity().getName().toLowerCase() + " - ");
					stringBuilder.append(sector.getToCity().getName().toLowerCase());
					if (index != sectors.size())
					{
						stringBuilder.append(" - ");
					}
				}
				routeConnection.setConnectionId(stringBuilder.toString());
			}

		}
		if (LOG.isDebugEnabled())
		{
			LOG.info("End onPrepare() of  RouteConnectionPrepareInterceptor");
		}

	}

}
