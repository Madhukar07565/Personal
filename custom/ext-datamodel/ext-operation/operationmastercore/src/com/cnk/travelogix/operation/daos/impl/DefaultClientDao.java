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
package com.cnk.travelogix.operation.daos.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;

import java.util.HashMap;
import java.util.List;

import com.cnk.travelogix.client.core.b2bunit.model.TravelogixB2BUnitModel;
import com.cnk.travelogix.operation.daos.ClientDao;


/**
 * Implementation class of ClientDao Interface
 *
 * @author C5244543
 */
public class DefaultClientDao extends DefaultGenericDao<TravelogixB2BUnitModel> implements ClientDao
{

	public DefaultClientDao()
	{
		this(TravelogixB2BUnitModel._TYPECODE);
	}

	private DefaultClientDao(final String typecode)
	{
		super(typecode);
	}

	@Override
	public TravelogixB2BUnitModel findClientByCode(final String code)
	{
		final HashMap params = new HashMap();
		params.put("uid", code);
		return this.find(params).get(0);
	}

	@Override
	public List<TravelogixB2BUnitModel> findClients()
	{
		return this.find();
	}

	@Override
	public List<TravelogixB2BUnitModel> findClientsForClientCategories(final String clientCategory, final String clientSubCategory)
	{
		final HashMap params = new HashMap();
		if (clientCategory != null && !clientCategory.isEmpty())
		{
			params.put("clientCategory", clientCategory);
		}

		if (clientSubCategory != null && !clientSubCategory.isEmpty())
		{
			params.put("clientSubCategory", clientSubCategory);
		}

		return this.find(params);
	}

}
