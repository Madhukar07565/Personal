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

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.client.core.model.ClientPaymentOptionModel;


/**
 * Interceptor to generate client payment options ID
 */
public class ClientPaymentOptionPrepareInterceptor implements PrepareInterceptor<ClientPaymentOptionModel>
{
	private final Logger LOG = Logger.getLogger(ClientPaymentOptionPrepareInterceptor.class);

	private KeyGenerator keyGenerator;

	@Override
	public void onPrepare(final ClientPaymentOptionModel clientPaymentOptionModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (ctx.isNew(clientPaymentOptionModel) && StringUtils.isEmpty(clientPaymentOptionModel.getPaymentId()))
		{
			clientPaymentOptionModel.setPaymentId(keyGenerator.generate().toString());
			LOG.debug("Id for Client Payment Options is:" + clientPaymentOptionModel.getPaymentId());
		}

	}

	/**
	 * @return the keyGenerator
	 */
	public KeyGenerator getKeyGenerator()
	{
		return keyGenerator;
	}

	/**
	 * @param keyGenerator
	 *           the keyGenerator to set
	 */
	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}

}
