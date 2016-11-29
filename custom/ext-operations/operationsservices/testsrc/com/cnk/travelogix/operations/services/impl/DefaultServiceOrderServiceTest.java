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
package com.cnk.travelogix.operations.services.impl;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.cnk.travelogix.operation.serviceorder.model.ServiceOrderModel;
import com.cnk.travelogix.operation.serviceorder.model.SupplierLiabilityModel;
import com.cnk.travelogix.operations.exceptions.ServiceOrderException;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.servicelayer.internal.model.impl.ItemModelCloneCreator;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;


/**
 * This Class contains unit test cases for Service Order Service.
 */
@UnitTest
public class DefaultServiceOrderServiceTest
{
	@Mock
	private ModelService modelService;

	@Mock
	private KeyGenerator keyGenerator;

	@Mock
	private ItemModelCloneCreator cloneCreator;

	@Mock
	private FlexibleSearchService flexibleSearchService;

	@InjectMocks
	DefaultServiceOrderService defaultServiceOrderService = new DefaultServiceOrderService();

	@Before
	public void setup()
	{
		MockitoAnnotations.initMocks(this);
		defaultServiceOrderService.setCloneCreator(cloneCreator);
		defaultServiceOrderService.setFlexibleSearchService(flexibleSearchService);
		defaultServiceOrderService.setKeyGenerator(keyGenerator);
		defaultServiceOrderService.setModelService(modelService);
	}


	@Test
	public void testCreateProvisionalServiceOrder() throws ServiceOrderException
	{
		final AbstractOrderEntryModel entry = new AbstractOrderEntryModel();
		entry.setEntryNumber(Integer.valueOf(1));

		final AbstractOrderModel order = new AbstractOrderModel();
		order.setCode("00000001");

		entry.setOrder(order);
		order.setEntries(Collections.singletonList(entry));
		final ServiceOrderModel serviceOrderModel = new ServiceOrderModel();
		final SupplierLiabilityModel supplierLiabilityModel = new SupplierLiabilityModel();
		Mockito.when(modelService.create(ServiceOrderModel.class)).thenReturn(serviceOrderModel);
		Mockito.when(modelService.create(SupplierLiabilityModel.class)).thenReturn(supplierLiabilityModel);

		defaultServiceOrderService.createProvisionalServiceOrder(order);

	}

	@Test(expected = ServiceOrderException.class)
	public void testCreateProvisionalServiceOrderWithNullOrder() throws ServiceOrderException
	{
		defaultServiceOrderService.createProvisionalServiceOrder(null);
	}

	@Test
	public void testModifyProvisionalServiceOrder() throws ServiceOrderException
	{
		final AbstractOrderEntryModel entry = new AbstractOrderEntryModel();
		entry.setEntryNumber(Integer.valueOf(1));

		final AbstractOrderModel order = new AbstractOrderModel();
		order.setCode("00000001");

		entry.setOrder(order);

		order.setEntries(Collections.singletonList(entry));

		final ServiceOrderModel serviceOrderModel = new ServiceOrderModel();
		serviceOrderModel.setVersionNumber(Double.valueOf(1.0d));

		entry.setLatestServiceOrder(serviceOrderModel);
		final SupplierLiabilityModel supplierLiabilityModel = new SupplierLiabilityModel();
		supplierLiabilityModel.setServiceOrder(serviceOrderModel);

		Mockito.when(modelService.create(SupplierLiabilityModel.class)).thenReturn(supplierLiabilityModel);
		Mockito.when(cloneCreator.copy(serviceOrderModel)).thenReturn(serviceOrderModel);
		Mockito.when(flexibleSearchService.getModelByExample(supplierLiabilityModel)).thenReturn(supplierLiabilityModel);
		defaultServiceOrderService.modifyProvisionalServiceOrder(entry);
	}

	@Test(expected = ServiceOrderException.class)
	public void testModifyProvisionalServiceOrderNullentry() throws ServiceOrderException
	{
		defaultServiceOrderService.modifyProvisionalServiceOrder(null);
	}

	@Test
	public void testCancelProvisionalServiceOrder() throws ServiceOrderException
	{
		final AbstractOrderEntryModel entry = new AbstractOrderEntryModel();
		entry.setEntryNumber(Integer.valueOf(1));

		final AbstractOrderModel order = new AbstractOrderModel();
		order.setCode("00000001");

		entry.setOrder(order);
		order.setEntries(Collections.singletonList(entry));

		final ServiceOrderModel serviceOrderModel = new ServiceOrderModel();
		serviceOrderModel.setVersionNumber(Double.valueOf(1.0d));

		entry.setLatestServiceOrder(serviceOrderModel);
		final SupplierLiabilityModel supplierLiabilityModel = new SupplierLiabilityModel();
		supplierLiabilityModel.setServiceOrder(serviceOrderModel);

		Mockito.when(modelService.create(SupplierLiabilityModel.class)).thenReturn(supplierLiabilityModel);
		Mockito.when(cloneCreator.copy(serviceOrderModel)).thenReturn(serviceOrderModel);

		defaultServiceOrderService.cancelProvisionalServiceOrder(entry);
	}

	@Test(expected = ServiceOrderException.class)
	public void testCancelProvisionalServiceOrderNullentry() throws ServiceOrderException
	{
		defaultServiceOrderService.cancelProvisionalServiceOrder(null);
	}

	@Test
	public void testCreateFinalServiceOrder() throws ServiceOrderException
	{
		final AbstractOrderEntryModel entry = new AbstractOrderEntryModel();
		entry.setEntryNumber(Integer.valueOf(1));

		final AbstractOrderModel order = new AbstractOrderModel();
		order.setCode("00000001");

		entry.setOrder(order);

		order.setEntries(Collections.singletonList(entry));

		final ServiceOrderModel serviceOrderModel = new ServiceOrderModel();
		serviceOrderModel.setVersionNumber(Double.valueOf(1.0d));

		entry.setLatestServiceOrder(serviceOrderModel);
		final SupplierLiabilityModel supplierLiabilityModel = new SupplierLiabilityModel();
		supplierLiabilityModel.setServiceOrder(serviceOrderModel);

		Mockito.when(modelService.create(SupplierLiabilityModel.class)).thenReturn(supplierLiabilityModel);
		Mockito.when(cloneCreator.copy(serviceOrderModel)).thenReturn(serviceOrderModel);

		defaultServiceOrderService.createFinalServiceOrder(entry);

	}

	@Test(expected = ServiceOrderException.class)
	public void testCreateFinalServiceOrderNullentry() throws ServiceOrderException
	{
		defaultServiceOrderService.createFinalServiceOrder(null);
	}

}
