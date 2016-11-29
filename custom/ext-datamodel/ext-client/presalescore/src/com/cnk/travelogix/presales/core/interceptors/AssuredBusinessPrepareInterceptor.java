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
package com.cnk.travelogix.presales.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import com.cnk.travelogix.presales.core.service.AssuredBusinessService;
import com.cnk.travelogix.presales.model.AssuredBusinessModel;


/**
 * AssuredBusinessPrepareInterceptor to generate assuredBusinessId
 */
public class AssuredBusinessPrepareInterceptor implements PrepareInterceptor<AssuredBusinessModel>
{
	private AssuredBusinessService assuredBusinessService;

	@Resource
	private ModelService modelService;

	@Override
	public void onPrepare(final AssuredBusinessModel assuredBusinessModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (ctx.isNew(assuredBusinessModel))
		{
			assuredBusinessService.generateAssuredBusinessId(assuredBusinessModel);
		}
	}

	/**
	 * @return the assuredBusinessService
	 */
	public AssuredBusinessService getAssuredBusinessService()
	{
		return assuredBusinessService;
	}

	/**
	 * @param assuredBusinessService
	 *           the assuredBusinessService to set
	 */
	public void setAssuredBusinessService(final AssuredBusinessService assuredBusinessService)
	{
		this.assuredBusinessService = assuredBusinessService;
	}

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}
}
