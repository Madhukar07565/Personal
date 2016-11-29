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
package com.cnk.travelogix.client.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import com.cnk.travelogix.client.core.clienttype.model.TravelogixClientTypeModel;
import com.cnk.travelogix.client.core.services.TravelogixClientTypeService;


/**
 * Interceptor to generate Client entity name
 */
public class TravelogixClientTypePrepareInterceptor implements PrepareInterceptor<TravelogixClientTypeModel>
{

	private TravelogixClientTypeService travelogixClientTypeService;

	@Override
	public void onPrepare(final TravelogixClientTypeModel travelogixClientTypeModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (ctx.isNew(travelogixClientTypeModel))
		{
			travelogixClientTypeService.generateClientEntityName(travelogixClientTypeModel);
		}
	}

	/**
	 * @return the travelogixClientTypeService
	 */
	public TravelogixClientTypeService getTravelogixClientTypeService()
	{
		return travelogixClientTypeService;
	}

	/**
	 * @param travelogixClientTypeService
	 *           the travelogixClientTypeService to set
	 */
	public void setTravelogixClientTypeService(final TravelogixClientTypeService travelogixClientTypeService)
	{
		this.travelogixClientTypeService = travelogixClientTypeService;
	}

}
