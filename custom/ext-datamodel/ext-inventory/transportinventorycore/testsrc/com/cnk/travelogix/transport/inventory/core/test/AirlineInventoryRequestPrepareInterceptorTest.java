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
package com.cnk.travelogix.transport.inventory.core.test;

/**
 *
 */

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

import com.cnk.travelogix.common.inventory.air.interceptors.AirlineInventoryRequestPrepareInterceptor;
import com.cnk.travelogix.transport.inventory.core.service.AirlineInventoryRequestIdService;
import com.cnk.travelogix.transportinventory.core.model.AirlineInventoryRequestModel;


@UnitTest
@RunWith(MockitoJUnitRunner.class)
public class AirlineInventoryRequestPrepareInterceptorTest
{
	private AirlineInventoryRequestPrepareInterceptor interceptor;

	@Mock
	private AirlineInventoryRequestIdService airlineInventoryRequestIdService;


	@Mock
	private KeyGenerator mockKeyGenerator;

	@Mock
	private InterceptorContext mockInterceptorContext;

	@Before
	public void init() throws JaloSystemException
	{
		MockitoAnnotations.initMocks(this);

		interceptor = new AirlineInventoryRequestPrepareInterceptor();

		interceptor.setAirlineinventoryRequestservice(airlineInventoryRequestIdService);
	}

	@Test
	public void testAirlineInventoryRequestCodeWithoutNull()
	{
		final AirlineInventoryRequestModel airlineinv = new AirlineInventoryRequestModel();
		airlineinv.setCode("INVREQ-123");
		when(mockKeyGenerator.generate()).thenReturn("0001");
		assertEquals("AirlineInventoryRequest code wasn't set by prepare interceptor", "INVREQ-123", airlineinv.getCode());

	}

	@Test
	public void testAirlineInventoryRequestCodeWithNull() throws Exception
	{
		final AirlineInventoryRequestModel airlineinv = new AirlineInventoryRequestModel();
		airlineinv.setActive(Boolean.TRUE);
		when(mockKeyGenerator.generate()).thenReturn("INVREQ-456");
		when(Boolean.valueOf(mockInterceptorContext.isNew(airlineinv))).thenReturn(Boolean.TRUE);
		interceptor.onPrepare(airlineinv, mockInterceptorContext);
		assertEquals("AirlineInventoryRequest code was set by prepare interceptor", "INVREQ-456", airlineinv.getCode());

	}

}
