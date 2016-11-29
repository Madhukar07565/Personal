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
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import com.cnk.travelogix.product.transport.masters.core.model.AirRouteModel;
import com.cnk.travelogix.product.transport.masters.core.services.RouteIdService;


/**
 *
 */
public class AirRoutePrepareInterceptor implements PrepareInterceptor
{
	private RouteIdService routeIdService;

	@Resource
	private ModelService modelService;

	@Override
	public void onPrepare(final Object model, final InterceptorContext ctx) throws InterceptorException
	{
		if (ctx.isNew(model))
		{
			final AirRouteModel airRouteModel = (AirRouteModel) model;
			routeIdService.generateRouteId(airRouteModel);
		}
		else if (null != ctx.getDirtyAttributes(model).get("code"))
		{
			ctx.getDirtyAttributes(model).get("code").clear();
		}
	}

	public RouteIdService getRouteIdService()
	{
		return routeIdService;
	}

	public void setRouteIdService(final RouteIdService routeIdService)
	{
		this.routeIdService = routeIdService;
	}
}