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
package com.cnk.travelogix.supplier.credentials.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.credentials.core.indents.model.CreditDepositIndentModel;


/**
 * Interceptor to generate unique code in combination of Items type's first 3 letters & a randomly generated number
 */
public class CreditDepositIndentInterceptor implements PrepareInterceptor<CreditDepositIndentModel>
{


	@Resource
	private ModelService modelService;

	private KeyGenerator keyGenerator;

	String key = "";

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



	@Override
	public void onPrepare(final CreditDepositIndentModel creditDepositIndentModel, final InterceptorContext arg1)
			throws InterceptorException
	{
		final Logger log = Logger.getLogger(CreditDepositIndentInterceptor.class);
		if (StringUtils.isNotEmpty(creditDepositIndentModel.getSupplier().getCommonUid().toString()))
		{

			final String itemType = creditDepositIndentModel._TYPECODE;

			key = itemType.substring(0, 3).concat("-").concat(keyGenerator.generate().toString());
			creditDepositIndentModel.setCode(key.toUpperCase());
			log.debug("Generated code for Code ID is  " + creditDepositIndentModel.getCode());

		}

	}

}
