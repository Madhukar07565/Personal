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
import java.util.Map;

import com.cnk.travelogix.operation.daos.SupplierDao;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


/**
 * Implementation class of SupplierDao Interface
 *
 * @author C5244543
 */
public class DefaultSupplierDao extends DefaultGenericDao<SupplierModel> implements SupplierDao
{
	public DefaultSupplierDao()
	{
		super("Supplier");
	}

	private DefaultSupplierDao(final String typecode)
	{
		super(typecode);
	}

	@Override
	public SupplierModel findSupplierByCode(final String code)
	{
		SupplierModel model = null;
		final Map params = new HashMap();
		params.put("code", code);
		final List<SupplierModel> models = this.find(params);
		if (models != null)
		{
			model = this.find(params).get(0);
		}
		return model;
	}

	@Override
	public List<SupplierModel> findSuppliers()
	{
		return super.find();
	}
}
