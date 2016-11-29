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
package com.cnk.travelogix.client.config.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.client.config.core.timelimit.model.TimeLimitMasterConfigModel;
import com.cnk.travelogix.client.config.services.TimeLimitMasterService;




/**
 * Interceptor for @TimeLimitMasterPrepareInterceptor to generate system generated value for TimeLimitMasterId
 */
public class TimeLimitMasterPrepareInterceptor implements PrepareInterceptor<TimeLimitMasterConfigModel>
{
	private TimeLimitMasterService timeLimitMasterService;

	@Resource
	private ModelService modelService;
	private static final Logger LOG = Logger.getLogger(TimeLimitMasterPrepareInterceptor.class);

	@Override
	public void onPrepare(final TimeLimitMasterConfigModel timeLimitMasterConfigModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (ctx.isNew(timeLimitMasterConfigModel))
		{
			timeLimitMasterService.generateTimeLimitMasterId(timeLimitMasterConfigModel);
		}
	}

	/**
	 * @return the timeLimitMasterService
	 */
	public TimeLimitMasterService getTimeLimitMasterService()
	{
		return timeLimitMasterService;
	}

	/**
	 * @param timeLimitMasterService
	 *           the timeLimitMasterService to set
	 */
	public void setTimeLimitMasterService(final TimeLimitMasterService timeLimitMasterService)
	{
		this.timeLimitMasterService = timeLimitMasterService;
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
