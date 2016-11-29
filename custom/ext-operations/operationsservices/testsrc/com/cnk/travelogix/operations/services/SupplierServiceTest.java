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

import com.cnk.travelogix.operation.daos.SupplierDao;
import com.cnk.travelogix.operations.services.impl.DefaultSupplierService;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


/**
 * Test case for Supplier Service.
 *
 * @author C5244543
 */
@UnitTest
public class SupplierServiceTest
{

	@Mock
	private SupplierDao supplierDao;

	@InjectMocks
	private final DefaultSupplierService defaultSupplierService = new DefaultSupplierService();



	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * This test class to test all suppliers.
	 */
	@Test
	public void findSuppliersTest()
	{

		final SupplierModel supplierModel = Mockito.mock(SupplierModel.class);
		List<SupplierModel> supplierModels = new ArrayList<>();
		supplierModels.add(supplierModel);
		given(supplierDao.findSuppliers()).willReturn(supplierModels);

		supplierModels = defaultSupplierService.findSuppliers();

		verify(supplierDao).findSuppliers();

		Assert.assertEquals(1, supplierModels.size());

	}

	/**
	 * This test class when there is no supplier.
	 */
	@Test
	public void findSuppliersWhenSupplierIsEmpty()
	{

		List<SupplierModel> supplierModels = new ArrayList<>();
		supplierModels.clear();
		given(supplierDao.findSuppliers()).willReturn(supplierModels);
		supplierModels = defaultSupplierService.findSuppliers();

		verify(supplierDao).findSuppliers();

		Assert.assertEquals(0, supplierModels.size());
	}

	/**
	 * This test class to test find supplier for Code.
	 */
	@Test
	public void findSupplierTest()
	{
		final String code = "123456";
		SupplierModel supplierModel = Mockito.mock(SupplierModel.class);

		given(supplierDao.findSupplierByCode(code)).willReturn(supplierModel);
		supplierModel = defaultSupplierService.findSupplierByCode(code);

		verify(supplierDao).findSupplierByCode(code);
		Assert.assertNotNull("NULL POINTER GET", supplierModel);
	}

	/**
	 * This test class to test not find supplier for Code.
	 */
	@Test
	public void findSupplierWhenSupplierIsEmpty()
	{
		final String code = "123456";
		SupplierModel supplierModel = Mockito.mock(SupplierModel.class);
		supplierModel = null;
		given(supplierDao.findSupplierByCode(code)).willReturn(supplierModel);
		supplierModel = defaultSupplierService.findSupplierByCode(code);

		verify(supplierDao).findSupplierByCode(code);
		Assert.assertNull("NULL POINTER GET", supplierModel);

	}

}
