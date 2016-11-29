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

import com.cnk.travelogix.client.core.b2bunit.model.TravelogixB2BUnitModel;
import com.cnk.travelogix.operation.daos.ClientDao;
import com.cnk.travelogix.operations.services.impl.DefaultClientService;


/**
 * Test class for Client Service.
 *
 * @author C5244543
 */
@UnitTest
public class ClientServiceTest
{
	@Mock
	private ClientDao clientDao;
	@InjectMocks
	private final DefaultClientService clientService = new DefaultClientService();

	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * This test class to test all clients.
	 */
	@Test
	public void findClientsTest()
	{

		final TravelogixB2BUnitModel b2bUnitModel = Mockito.mock(TravelogixB2BUnitModel.class);
		List<TravelogixB2BUnitModel> b2bUnitModels = new ArrayList<>();
		b2bUnitModels.add(b2bUnitModel);
		given(clientDao.findClients()).willReturn(b2bUnitModels);

		b2bUnitModels = clientService.findClients();

		verify(clientDao).findClients();

		Assert.assertEquals(1, b2bUnitModels.size());

	}

	/**
	 * This test class when there is no supplier.
	 */
	@Test
	public void findClientsWhenClientIsEmpty()
	{
		List<TravelogixB2BUnitModel> b2bUnitModels = new ArrayList<>();
		b2bUnitModels.clear();
		given(clientDao.findClients()).willReturn(b2bUnitModels);

		b2bUnitModels = clientService.findClients();

		verify(clientDao).findClients();

		Assert.assertEquals(0, b2bUnitModels.size());
	}

	/**
	 * This test class to test find supplier for Code.
	 */
	@Test
	public void findClientTest()
	{
		final String code = "123456";

		TravelogixB2BUnitModel b2bUnitModel = Mockito.mock(TravelogixB2BUnitModel.class);
		given(clientDao.findClientByCode(code)).willReturn(b2bUnitModel);

		b2bUnitModel = clientService.findClientByCode(code);

		verify(clientDao).findClientByCode(code);

		Assert.assertNotNull(b2bUnitModel);
	}

	/**
	 * This test class to test not find supplier for Code.
	 */
	@Test
	public void findClientWhenClientIsEmpty()
	{
		final String code = "123456";

		TravelogixB2BUnitModel b2bUnitModel = Mockito.mock(TravelogixB2BUnitModel.class);
		b2bUnitModel = null;
		given(clientDao.findClientByCode(code)).willReturn(b2bUnitModel);

		b2bUnitModel = clientService.findClientByCode(code);

		verify(clientDao).findClientByCode(code);

		Assert.assertNull(b2bUnitModel);

	}


}
