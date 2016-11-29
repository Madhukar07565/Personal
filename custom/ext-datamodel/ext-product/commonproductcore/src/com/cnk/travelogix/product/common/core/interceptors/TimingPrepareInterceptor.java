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
package com.cnk.travelogix.product.common.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.apache.log4j.Logger;

import com.cnk.travelogix.product.activity.masters.core.model.TimingModel;


/**
 * Interceptor to generate code for Timing Item
 */
public class TimingPrepareInterceptor implements PrepareInterceptor<TimingModel>
{
	private KeyGenerator keyGenerator;
	private static final Logger LOG = Logger.getLogger(TimingPrepareInterceptor.class);


	@Override
	public void onPrepare(final TimingModel timingModel, final InterceptorContext ctx) throws InterceptorException
	{
		if (timingModel.getCode() == null)
		{
			timingModel.setCode(keyGenerator.generate().toString());
			LOG.debug("Set new code for Timing Model -" + timingModel.getCode());
		}

	}

	public KeyGenerator getKeyGenerator()
	{
		return keyGenerator;
	}

	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}

}
