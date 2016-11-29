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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.operation.daos.SupplierDao;
import com.cnk.travelogix.operations.services.SupplierService;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


/**
 * Implementation class of SupplierService Interface.
 *
 * @author C5244543
 */
public class DefaultSupplierService implements SupplierService
{
	@Autowired
	private SupplierDao supplierDao;

	@Override
	public SupplierModel findSupplierByCode(final String code)
	{
		return supplierDao.findSupplierByCode(code);
	}

	@Override
	public List<SupplierModel> findSuppliers()
	{
		List<SupplierModel> supplierModels = new ArrayList<>();
		supplierModels = supplierDao.findSuppliers();

		if (supplierModels != null && !supplierModels.isEmpty())
		{
			return supplierModels;
		}
		return Collections.emptyList();

	}

}
