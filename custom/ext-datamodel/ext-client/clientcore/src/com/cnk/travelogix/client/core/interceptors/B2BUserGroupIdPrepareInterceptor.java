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

import de.hybris.platform.b2b.model.B2BUserGroupModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import com.cnk.travelogix.client.core.services.B2BUserGroupService;


/**
 *
 */
public class B2BUserGroupIdPrepareInterceptor implements PrepareInterceptor<B2BUserGroupModel>
{

	private B2BUserGroupService b2bUserGroupIdService;

	@Resource
	private ModelService modelService;

	@Override
	public void onPrepare(final B2BUserGroupModel b2bUserGroupModel, final InterceptorContext ctx) throws InterceptorException
	{
		if (ctx.isNew(b2bUserGroupModel))
		{
			b2bUserGroupIdService.generateB2BUserGroupId(b2bUserGroupModel);
		}
	}

	/**
	 * @return the b2bUserGroupIdService
	 */
	public B2BUserGroupService getB2bUserGroupIdService()
	{
		return b2bUserGroupIdService;
	}

	/**
	 * @param b2bUserGroupIdService
	 *           the b2bUserGroupIdService to set
	 */
	public void setB2bUserGroupIdService(final B2BUserGroupService b2bUserGroupIdService)
	{
		this.b2bUserGroupIdService = b2bUserGroupIdService;
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
