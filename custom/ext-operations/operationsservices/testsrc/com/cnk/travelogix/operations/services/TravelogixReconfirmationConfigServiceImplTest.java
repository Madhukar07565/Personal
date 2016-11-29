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
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.model.ReconfirmationConfigModel;
import com.cnk.travelogix.operation.reconfirmation.dao.TravelogixReconfirmationConfigDao;
import com.cnk.travelogix.operations.data.ReconfirmationSearchParameterData;
import com.cnk.travelogix.operations.services.impl.TravelogixReconfirmationConfigServiceImpl;


/**
 * This test class used for testing Reconfirmation Config Service methods.
 *
 * @author C5244543
 */
@UnitTest
public class TravelogixReconfirmationConfigServiceImplTest
{
	private static final String CODE = "RECONFIRMATION_CODE";


	@Mock
	private TravelogixReconfirmationConfigDao reconfirmationConfigDao;

	@InjectMocks
	private final TravelogixReconfirmationConfigServiceImpl configServiceImpl = new TravelogixReconfirmationConfigServiceImpl();

	ReconfirmationSearchParameterData reconfirmationSearchParameterData;
	PageableData pageableData;

	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
		reconfirmationSearchParameterData = new ReconfirmationSearchParameterData();
		reconfirmationSearchParameterData.setClientCategory("ClientCategory");
		reconfirmationSearchParameterData.setClientCode("clientCode");
		reconfirmationSearchParameterData.setClientGroup("clientGroup");
		reconfirmationSearchParameterData.setClientSubCategory("clientSubCategory");
		reconfirmationSearchParameterData.setClientType("clientType");
		reconfirmationSearchParameterData.setConfigurationFor("configurationFor");
		reconfirmationSearchParameterData.setProductCategoryCode("productCategoryCode");
		reconfirmationSearchParameterData.setProductCategorySubTypeCode("productCategorySubTypeCode");
		reconfirmationSearchParameterData.setProductCode("productCode");
		reconfirmationSearchParameterData.setSupplierCode("supplierCode");

		pageableData = new PageableData();
		pageableData.setCurrentPage(0);
		pageableData.setPageSize(0);
		pageableData.setSort("sort");
	}

	@Test
	public void getReconfirmationConfigForCodeTest()
	{

		ReconfirmationConfigModel configModel = Mockito.mock(ReconfirmationConfigModel.class);
		given(reconfirmationConfigDao.getReconfirmationConfigForCode(CODE)).willReturn(configModel);

		configModel = configServiceImpl.getReconfirmationConfigForCode(CODE);

		verify(reconfirmationConfigDao).getReconfirmationConfigForCode(CODE);
	}

	@Test
	public void getReconfirmationConfigForCodeReturnNullTest()
	{
		ReconfirmationConfigModel configModel = Mockito.mock(ReconfirmationConfigModel.class);
		configModel = null;
		given(reconfirmationConfigDao.getReconfirmationConfigForCode(CODE)).willReturn(configModel);

		configModel = configServiceImpl.getReconfirmationConfigForCode(CODE);

		verify(reconfirmationConfigDao).getReconfirmationConfigForCode(CODE);
	}



	@Test
	public void getAllReconfirmationConfigsTest()
	{
		SearchPageData<ReconfirmationConfigModel> searchPageDatas = Mockito.mock(SearchPageData.class);
		given(reconfirmationConfigDao.getAllReconfirmationConfigs(reconfirmationSearchParameterData, pageableData))
				.willReturn(searchPageDatas);

		searchPageDatas = configServiceImpl.getAllReconfirmationConfigs(reconfirmationSearchParameterData, pageableData);

		verify(reconfirmationConfigDao).getAllReconfirmationConfigs(reconfirmationSearchParameterData, pageableData);
	}

	@Test
	public void getAllReconfirmationConfigsForClientTest()
	{
		SearchPageData<ReconfirmationConfigModel> searchPageDatas = Mockito.mock(SearchPageData.class);
		reconfirmationSearchParameterData = Mockito.mock(ReconfirmationSearchParameterData.class);

		given(reconfirmationSearchParameterData.getConfigurationFor()).willReturn("Client");
		given(reconfirmationConfigDao.getAllReconfirmationConfigs(reconfirmationSearchParameterData, pageableData))
				.willReturn(searchPageDatas);

		searchPageDatas = configServiceImpl.getAllReconfirmationConfigs(reconfirmationSearchParameterData, pageableData);

		verify(reconfirmationConfigDao).getAllReconfirmationConfigs(reconfirmationSearchParameterData, pageableData);
	}

	@Test
	public void getAllReconfirmationConfigsForSupplierTest()
	{
		SearchPageData<ReconfirmationConfigModel> searchPageDatas = Mockito.mock(SearchPageData.class);
		reconfirmationSearchParameterData = Mockito.mock(ReconfirmationSearchParameterData.class);
		given(reconfirmationSearchParameterData.getConfigurationFor()).willReturn("Supplier");
		given(reconfirmationConfigDao.getAllReconfirmationConfigs(reconfirmationSearchParameterData, pageableData))
				.willReturn(searchPageDatas);

		searchPageDatas = configServiceImpl.getAllReconfirmationConfigs(reconfirmationSearchParameterData, pageableData);

		verify(reconfirmationConfigDao).getAllReconfirmationConfigs(reconfirmationSearchParameterData, pageableData);

	}
}
