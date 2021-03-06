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
package com.cnk.travelogix.operation.daos;

import java.util.List;

import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


/**
 * Supplier Dao Interface
 *
 * @author C5244543
 */
public interface SupplierDao
{
	SupplierModel findSupplierByCode(final String code);

	List<SupplierModel> findSuppliers();
}
