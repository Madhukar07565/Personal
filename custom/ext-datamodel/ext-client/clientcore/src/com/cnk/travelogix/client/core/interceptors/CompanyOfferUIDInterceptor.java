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

import com.cnk.travelogix.client.core.companyoffer.model.CompanyOffersModel;
import com.cnk.travelogix.client.core.companyoffers.service.CompanyOfferService;


/**
 * Company offer UID intercepter. This intercepter is created to generate the company offer UID and check whether the
 * duplicate offer already exist or not.
 *
 */
public class CompanyOfferUIDInterceptor implements PrepareInterceptor
{

	@Resource(name = "companyOfferService")
	private CompanyOfferService companyOfferService;

	@Override
	public void onPrepare(final Object model, final InterceptorContext ctx) throws InterceptorException
	{
		boolean valuesExist;
		final CompanyOffersModel companyModel = (CompanyOffersModel) model;


		if (ctx.isNew(model))
		{

			valuesExist = companyOfferService.checkForDuplicateAttibutes(companyModel);

			if (!valuesExist)
			{
				companyOfferService.generateCompanyOfferId(companyModel);
			}
			else
			{
				throw new InterceptorException("Offer with same values already exist");
			}
		}
		if (ctx.isModified(companyModel, "offerName") || ctx.isModified(companyModel, "offerType")
				|| ctx.isModified(companyModel, "offerSubType"))
		{
			valuesExist = companyOfferService.checkForDuplicateAttibutes(companyModel);

			if (valuesExist)
			{
				throw new InterceptorException("Offer with same values already exist");
			}
		}
	}
}
