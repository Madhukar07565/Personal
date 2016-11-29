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

import com.cnk.travelogix.client.config.core.partpayment.model.PartPaymentMasterConfigModel;
import com.cnk.travelogix.client.config.services.PartPaymentService;


/**
 * Intercepter to generate parPaymentId whenever a new record is created.
 */
public class PartPaymentPrepareInterceptor implements PrepareInterceptor<PartPaymentMasterConfigModel>
{
	private PartPaymentService partPaymentService;

	@Resource
	private ModelService modelService;

	@Override
	public void onPrepare(final PartPaymentMasterConfigModel partPaymentModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (ctx.isNew(partPaymentModel))
		{
			partPaymentService.generatePartPaymentId(partPaymentModel);
		}
	}

	/**
	 * @return the partPaymentService
	 */
	public PartPaymentService getPartPaymentService()
	{
		return partPaymentService;
	}

	/**
	 * @param partPaymentService
	 *           the partPaymentService to set
	 */
	public void setPartPaymentService(final PartPaymentService partPaymentService)
	{
		this.partPaymentService = partPaymentService;
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
