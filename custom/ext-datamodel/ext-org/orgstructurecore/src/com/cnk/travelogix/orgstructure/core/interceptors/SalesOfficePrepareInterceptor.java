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


package com.cnk.travelogix.orgstructure.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.apache.log4j.Logger;

import com.cnk.travelogix.orgstructure.core.sales.model.SalesOfficeModel;



/**
 * Intercepter to generate uid for Sales Office
 */
public class SalesOfficePrepareInterceptor implements PrepareInterceptor<SalesOfficeModel>
{
	private KeyGenerator keyGenerator;

	private static final Logger LOG = Logger.getLogger(SalesOfficePrepareInterceptor.class);

	@Override
	public void onPrepare(final SalesOfficeModel salesOfficeModel, final InterceptorContext arg1) throws InterceptorException
	{
		if (arg1.isNew(salesOfficeModel))
		{
			salesOfficeModel.setUid(keyGenerator.generate().toString());
			LOG.debug("Set new uid for SalesOffice Model -" + salesOfficeModel.getUid());
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
