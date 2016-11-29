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

import com.cnk.travelogix.presales.core.service.ProspectService;
import com.cnk.travelogix.presales.model.ProspectModel;


/**
 * LeadPrepareInterceptor to generate prospectId
 */
public class ProspectPrepareInterceptor implements PrepareInterceptor<ProspectModel>
{
	@Resource
	private ModelService modelService;

	private ProspectService prospectService;

	@Override
	public void onPrepare(final ProspectModel prospectModel, final InterceptorContext ctx) throws InterceptorException
	{
		if (ctx.isNew(prospectModel))
		{
			prospectService.generateProspectId(prospectModel);
		}
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

	/**
	 * @return the prospectService
	 */
	public ProspectService getProspectService()
	{
		return prospectService;
	}

	/**
	 * @param prospectService
	 *           the prospectService to set
	 */
	public void setProspectService(final ProspectService prospectService)
	{
		this.prospectService = prospectService;
	}
}
