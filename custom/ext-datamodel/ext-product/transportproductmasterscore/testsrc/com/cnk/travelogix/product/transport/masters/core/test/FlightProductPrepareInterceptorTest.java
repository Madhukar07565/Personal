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
import de.hybris.platform.catalog.CatalogService;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.model.ModelService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.cnk.travelogix.product.transport.masters.core.interceptors.FlightProductPrepareInterceptor;
import com.cnk.travelogix.product.transport.masters.core.model.FlightProductModel;


@UnitTest
@RunWith(MockitoJUnitRunner.class)
public class FlightProductPrepareInterceptorTest
{
	private FlightProductPrepareInterceptor interceptor;

	@Mock
	private CatalogService catalogService;

	@Mock
	private ModelService modelService;

	@Mock
	private InterceptorContext mockInterceptorContext;

	public void init() throws JaloSystemException
	{
		MockitoAnnotations.initMocks(this);

		interceptor = new FlightProductPrepareInterceptor();
		interceptor.setCatalogService(catalogService);
	}

	@Test
	public void testTimingCodeWithoutNull()
	{
		final FlightProductModel flightcode = new FlightProductModel();
		flightcode.setCode("Ezee");
		when(flightcode.getCatalogVersion().getCatalog().getCompany().getUid()).thenReturn("Ezeego1");
		assertEquals("Flight product code wasn't set by prepare interceptor", "Ezee", flightcode.getCode());

	}

	@Test
	public void testTimingCodeWithNull() throws Exception
	{
		final FlightProductModel flightcode = new FlightProductModel();
		when(flightcode.getCatalogVersion().getCatalog().getCompany().getUid()).thenReturn("Ezeego1");
		interceptor.onPrepare(flightcode, mockInterceptorContext);
		assertEquals("Flight product code was set by prepare interceptor", "Ezee", flightcode.getCode());
	}

}
