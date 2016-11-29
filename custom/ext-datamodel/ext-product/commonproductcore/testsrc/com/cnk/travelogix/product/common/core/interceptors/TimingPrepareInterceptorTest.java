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

import com.cnk.travelogix.product.activity.masters.core.model.TimingModel;


/**
 *
 */
@UnitTest
@RunWith(MockitoJUnitRunner.class)
public class TimingPrepareInterceptorTest
{
	private TimingPrepareInterceptor interceptor;

	@Mock
	private KeyGenerator mockKeyGenerator;

	@Mock
	private InterceptorContext mockInterceptorContext;

	@Before
	public void init() throws JaloSystemException
	{
		MockitoAnnotations.initMocks(this);

		interceptor = new TimingPrepareInterceptor();
		interceptor.setKeyGenerator(mockKeyGenerator);
	}

	@Test
	public void testTimingCodeWithoutNull()
	{
		final TimingModel timing = new TimingModel();
		timing.setCode("123");
		when(mockKeyGenerator.generate()).thenReturn("0001");
		assertEquals("Timing code wasn't set by prepare interceptor", "123", timing.getCode());

	}

	@Test
	public void testTimingCodeWithNull() throws Exception
	{
		final TimingModel timing = new TimingModel();
		when(mockKeyGenerator.generate()).thenReturn("001");
		interceptor.onPrepare(timing, mockInterceptorContext);
		assertEquals("Timing code was set by prepare interceptor", "001", timing.getCode());

	}

}
