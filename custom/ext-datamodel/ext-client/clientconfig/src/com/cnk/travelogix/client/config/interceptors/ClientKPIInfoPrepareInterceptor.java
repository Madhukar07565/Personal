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

import com.cnk.travelogix.client.config.core.model.KPIInfoModel;
import com.cnk.travelogix.client.config.services.ClientKPIService;


/**
 * Interceptor for ClientKPIInfoPrepareInterceptor
 */
public class ClientKPIInfoPrepareInterceptor implements PrepareInterceptor<KPIInfoModel>
{
	private ClientKPIService clientKPIService;

	@Resource
	private ModelService modelService;

	@Override
	public void onPrepare(final KPIInfoModel kpiinfomodel, final InterceptorContext ctx) throws InterceptorException
	{
		if (ctx.isNew(kpiinfomodel))
		{
			clientKPIService.generateKPIInfoId(kpiinfomodel);
		}
	}

	/**
	 * @return the clientKPIService
	 */
	public ClientKPIService getClientKPIService()
	{
		return clientKPIService;
	}

	/**
	 * @param clientKPIService
	 *           the clientKPIService to set
	 */
	public void setClientKPIService(final ClientKPIService clientKPIService)
	{
		this.clientKPIService = clientKPIService;
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
