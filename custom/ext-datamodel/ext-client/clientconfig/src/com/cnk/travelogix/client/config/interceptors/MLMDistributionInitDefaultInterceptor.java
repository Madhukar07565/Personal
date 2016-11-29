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

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import java.util.Date;

import org.apache.log4j.Logger;

import com.cnk.travelogix.client.config.core.model.MLMDistributionModel;


/**
 * To set effective date as current date by default.
 */
public class MLMDistributionInitDefaultInterceptor implements InitDefaultsInterceptor<MLMDistributionModel>
{
	private static final Logger LOG = Logger.getLogger(MLMDistributionInitDefaultInterceptor.class.getName());

	@Override
	public void onInitDefaults(final MLMDistributionModel mlmDistributionModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		LOG.debug("Entering onInitDefaults() of MLMDistributionInitDefaultInterceptor");
		mlmDistributionModel.setEffectiveFrom(new Date());
		LOG.debug("Exit onInitDefaults() of MLMDistributionInitDefaultInterceptor");
	}

}
