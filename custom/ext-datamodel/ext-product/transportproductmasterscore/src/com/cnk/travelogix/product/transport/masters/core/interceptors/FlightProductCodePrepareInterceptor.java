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

import de.hybris.platform.catalog.CatalogService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;

import com.cnk.travelogix.product.transport.masters.core.model.FlightProductModel;


public class FlightProductCodePrepareInterceptor implements PrepareInterceptor
{
	private CatalogService catalogService;

	@Resource
	private ModelService modelService;

	@Override
	public void onPrepare(final Object model, final InterceptorContext ctx) throws InterceptorException
	{
		final FlightProductModel flightProductModel = (FlightProductModel) model;
		if (StringUtils.isNotEmpty(flightProductModel.getCatalogVersion().getCatalog().getCompany().getUid())
				&& StringUtils.isNotEmpty(flightProductModel.getName()))
		{
			String company = flightProductModel.getCatalogVersion().getCatalog().getCompany().getUid();
			company = company.substring(0, 3);
			flightProductModel.setCode(company.concat(flightProductModel.getName()));
		}
	}

	public CatalogService getCatalogService()
	{
		return catalogService;
	}

	public void setCatalogService(final CatalogService catalogService)
	{
		this.catalogService = catalogService;
	}

}
