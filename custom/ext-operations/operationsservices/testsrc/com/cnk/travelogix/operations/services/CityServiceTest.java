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
package com.cnk.travelogix.operations.services;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import de.hybris.bootstrap.annotations.UnitTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;
import com.cnk.travelogix.operation.daos.CityDao;
import com.cnk.travelogix.operations.services.impl.DefaultCityService;


/**
 * Test class for Client Service.
 *
 * @author C5244543
 */
@UnitTest
public class CityServiceTest
{
	@Mock
	private CityDao cityDao;
	@InjectMocks
	private final DefaultCityService cityService = new DefaultCityService();

	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * This test class to test all clients.
	 */
	@Test
	public void findCitiesTest()
	{

		final CityModel cityModel = Mockito.mock(CityModel.class);
		List<CityModel> cityModels = new ArrayList<>();
		cityModels.add(cityModel);
		given(cityDao.findCities()).willReturn(cityModels);

		cityModels = cityService.findCities();

		verify(cityDao).findCities();

		Assert.assertEquals(1, cityModels.size());

	}

	/**
	 * This test class when there is no supplier.
	 */
	@Test
	public void findCitiesWhenCityIsEmpty()
	{
		List<CityModel> cityModels = new ArrayList<>();
		cityModels.clear();
		given(cityDao.findCities()).willReturn(cityModels);

		cityModels = cityService.findCities();

		verify(cityDao).findCities();

		Assert.assertEquals(0, cityModels.size());
	}

	/**
	 * This test class to test find supplier for Code.
	 */
	@Test
	public void findCityForCodeTest()
	{
		final String isocode = "DE";
		CityModel cityModel = Mockito.mock(CityModel.class);
		given(cityDao.findCityByIsocode(isocode)).willReturn(cityModel);

		cityModel = cityService.findCityByIsocode(isocode);

		verify(cityDao).findCityByIsocode(isocode);

		Assert.assertNotNull(cityModel);
	}

	/**
	 * This test class to test not find supplier for Code.
	 */
	@Test
	public void findCityForCodeWhenCityIsEmpty()
	{
		final String isocode = "DE";
		CityModel cityModel = Mockito.mock(CityModel.class);
		cityModel = null;
		given(cityDao.findCityByIsocode(isocode)).willReturn(cityModel);

		cityModel = cityService.findCityByIsocode(isocode);

		verify(cityDao).findCityByIsocode(isocode);

		Assert.assertNull(cityModel);
	}


}
