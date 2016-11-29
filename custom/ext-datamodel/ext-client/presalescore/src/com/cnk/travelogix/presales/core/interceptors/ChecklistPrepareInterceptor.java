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

import com.cnk.travelogix.presales.core.service.ChecklistService;
import com.cnk.travelogix.presales.model.ChecklistModel;


/**
 * Interceptor for @ChecklistPrepareInterceptor to generate system generated value for implementationChecklistId
 */
public class ChecklistPrepareInterceptor implements PrepareInterceptor<ChecklistModel>
{
	private ChecklistService checklistService;

	@Resource
	private ModelService modelService;


	@Override
	public void onPrepare(final ChecklistModel checklistModel, final InterceptorContext ctx) throws InterceptorException
	{
		if (ctx.isNew(checklistModel))
		{
			checklistService.generateImplementationChecklistId(checklistModel);
		}
	}

	/**
	 * @return the checklistService
	 */
	public ChecklistService getChecklistService()
	{
		return checklistService;
	}

	/**
	 * @param checklistService
	 *           the checklistService to set
	 */
	public void setChecklistService(final ChecklistService checklistService)
	{
		this.checklistService = checklistService;
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
