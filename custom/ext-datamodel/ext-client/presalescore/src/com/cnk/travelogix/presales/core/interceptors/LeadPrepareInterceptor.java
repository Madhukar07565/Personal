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

import com.cnk.travelogix.presales.core.service.LeadService;
import com.cnk.travelogix.presales.model.LeadModel;


/**
 * LeadPrepareInterceptor to generate leadId
 */
public class LeadPrepareInterceptor implements PrepareInterceptor<LeadModel>
{
	@Resource
	private ModelService modelService;

	private LeadService leadService;

	@Override
	public void onPrepare(final LeadModel leadModel, final InterceptorContext ctx) throws InterceptorException
	{
		if (ctx.isNew(leadModel))
		{
			leadService.generateLeadId(leadModel);
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
	 * @return the leadService
	 */
	public LeadService getLeadService()
	{
		return leadService;
	}

	/**
	 * @param leadService
	 *           the leadService to set
	 */
	public void setLeadService(final LeadService leadService)
	{
		this.leadService = leadService;
	}
}
