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
package com.cnk.travelogix.product.common.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import com.cnk.travelogix.product.common.core.model.AccommodationModel;
import com.cnk.travelogix.product.common.core.service.AccommodationProductService;


/**
 * AccommodationPrepareInterceptor to generated commonProductId.
 */
public class AccommodationProductPrepareInterceptor implements PrepareInterceptor<AccommodationModel>
{
	private AccommodationProductService companyProductIdService;

	@Resource
	private ModelService modelService;

	@Override
	public void onPrepare(final AccommodationModel accommodationModel, final InterceptorContext ctx)
	{
		if (ctx.isNew(accommodationModel))
		{
			companyProductIdService.generateCompanyProductId(accommodationModel);
		}
	}

	/**
	 * @return the companyProductIdService
	 */
	public AccommodationProductService getCompanyProductIdService()
	{
		return companyProductIdService;
	}

	/**
	 * @param companyProductIdService
	 *           the companyProductIdService to set
	 */
	public void setCompanyProductIdService(final AccommodationProductService companyProductIdService)
	{
		this.companyProductIdService = companyProductIdService;
	}
}
