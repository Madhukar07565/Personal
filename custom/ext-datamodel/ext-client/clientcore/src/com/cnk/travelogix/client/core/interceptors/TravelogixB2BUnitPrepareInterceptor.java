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

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import com.cnk.travelogix.client.core.b2bunit.model.TravelogixB2BUnitModel;


/**
 *
 */
public class TravelogixB2BUnitPrepareInterceptor implements PrepareInterceptor<TravelogixB2BUnitModel>
{
	private KeyGenerator keyGenerator;

	@Override
	public void onPrepare(final TravelogixB2BUnitModel company, final InterceptorContext context) throws InterceptorException
	{
		company.setUid((String) keyGenerator.generate());

	}

	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}
}
