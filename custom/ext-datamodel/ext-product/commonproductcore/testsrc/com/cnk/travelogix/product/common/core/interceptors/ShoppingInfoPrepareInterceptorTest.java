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

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.cnk.travelogix.product.activity.masters.core.model.ShoppingInfoModel;


/**
 *
 */
@UnitTest
@RunWith(MockitoJUnitRunner.class)
public class ShoppingInfoPrepareInterceptorTest
{
	private ShoppingInfoPrepareInterceptor interceptor;

	@Mock
	private KeyGenerator mockKeyGenerator;

	@Mock
	private InterceptorContext mockInterceptorContext;

	@Before
	public void init() throws JaloSystemException
	{
		MockitoAnnotations.initMocks(this);

		interceptor = new ShoppingInfoPrepareInterceptor();
		interceptor.setKeyGenerator(mockKeyGenerator);
	}

	@Test
	public void testShoppingInfoCodeWithoutNull() throws Exception
	{
		final ShoppingInfoModel shoppingInfo = new ShoppingInfoModel();
		shoppingInfo.setCode("123");
		when(mockKeyGenerator.generate()).thenReturn("0001");
		interceptor.onPrepare(shoppingInfo, mockInterceptorContext);
		assertEquals("ShoppingInfo code wasn't set by prepare interceptor", "123", shoppingInfo.getCode());

	}

	@Test
	public void testShoppingInfoCodeWithNull() throws Exception
	{
		final ShoppingInfoModel shoppingInfo = new ShoppingInfoModel();
		when(mockKeyGenerator.generate()).thenReturn("001");
		interceptor.onPrepare(shoppingInfo, mockInterceptorContext);
		assertEquals("ShoppingInfo code was set by prepare interceptor", "001", shoppingInfo.getCode());
	}

}
