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
package com.cnk.travelogix.product.transport.masters.core.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;
import de.hybris.platform.servicelayer.model.ModelService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.cnk.travelogix.product.transport.masters.core.interceptors.AirRoutePrepareInterceptor;
import com.cnk.travelogix.product.transport.masters.core.model.AirRouteModel;
import com.cnk.travelogix.product.transport.masters.core.services.RouteIdService;


@UnitTest
@RunWith(MockitoJUnitRunner.class)
public class AirRoutePrepareInterceptorTest
{
	private AirRoutePrepareInterceptor interceptor;

	@Mock
	private RouteIdService routeIdService;

	@Mock
	private ModelService modelService;

	@Mock
	private KeyGenerator mockKeyGenerator;

	@Mock
	private InterceptorContext mockInterceptorContext;

	@Before
	public void init() throws JaloSystemException
	{
		MockitoAnnotations.initMocks(this);

		interceptor = new AirRoutePrepareInterceptor();
		interceptor.setRouteIdService(routeIdService);
	}

	@Test
	public void testAirRouteCodeWithoutNull()
	{
		final AirRouteModel airRoute = new AirRouteModel();
		airRoute.setCode("123");
		when(mockKeyGenerator.generate()).thenReturn("0001");
		assertEquals("Timing code wasn't set by prepare interceptor", "123", airRoute.getCode());

	}

	@Test
	public void testAirRouteCodeWithNull() throws Exception
	{
		final AirRouteModel airRoute = new AirRouteModel();
		when(mockKeyGenerator.generate()).thenReturn("001");
		interceptor.onPrepare(airRoute, mockInterceptorContext);
		assertEquals("Timing code was set by prepare interceptor", "001", airRoute.getCode());

	}

}
