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

import javax.annotation.Resource;

import com.cnk.travelogix.client.core.companyoffer.model.RedemptionCompanyOffersModel;
import com.cnk.travelogix.client.core.companyoffers.service.CompanyOfferService;


/**
 *
 */
public class RedemptionOfferConstructUIDInterceptor implements PrepareInterceptor
{
	@Resource(name = "companyOfferService")
	private CompanyOfferService companyOfferService;

	@Override
	public void onPrepare(final Object model, final InterceptorContext ctx) throws InterceptorException
	{

		final RedemptionCompanyOffersModel redemptionModel = (RedemptionCompanyOffersModel) model;
		if (ctx.isNew(model))
		{
			companyOfferService.generateRedumptionConstructOfferId(redemptionModel);
		}

	}

}
