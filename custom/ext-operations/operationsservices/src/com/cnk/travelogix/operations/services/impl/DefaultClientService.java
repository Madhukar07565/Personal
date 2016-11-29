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
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.client.core.b2bunit.model.TravelogixB2BUnitModel;
import com.cnk.travelogix.operation.daos.ClientDao;
import com.cnk.travelogix.operations.services.ClientService;


/**
 * Implementation Class of ClientService Interface.
 *
 * @author C5244543
 */
public class DefaultClientService implements ClientService
{
	@Autowired
	private ClientDao clientDao;

	@Override
	public TravelogixB2BUnitModel findClientByCode(final String code)
	{
		return clientDao.findClientByCode(code);
	}

	@Override
	public List<TravelogixB2BUnitModel> findClients()
	{
		final List<TravelogixB2BUnitModel> clientModels = clientDao.findClients();
		if (clientModels != null && !clientModels.isEmpty())
		{
			return clientModels;
		}
		return Collections.emptyList();
	}

	@Override
	public List<TravelogixB2BUnitModel> findClientsForClientCategories(final String clientCategory, final String clientSubCategory)
	{
		final List<TravelogixB2BUnitModel> clientModels = clientDao.findClientsForClientCategories(clientCategory,
				clientSubCategory);
		if (clientModels != null && !clientModels.isEmpty())
		{
			return clientModels;
		}
		return Collections.emptyList();
	}

}
