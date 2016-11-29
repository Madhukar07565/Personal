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
package com.cnk.travelogix.operations.doas.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.operations.doas.TravelogixOperationsDao;
import com.cnk.travelogix.supplier.mappings.product.model.SupplierProductModel;


/**
 * DAO to use across the operations module
 */
public class TravelogixOperationsDaoImpl implements TravelogixOperationsDao
{
	protected static final Logger LOG = Logger.getLogger(TravelogixOperationsDaoImpl.class);
	final String GET_SUPPLIERPRODUCT_ON_SUPPLIER = "Select {sp:PK} from {SupplierProduct as sp} where {sp.supplier} = ?supplier";

	@Resource(name = "flexibleSearchService")
	private FlexibleSearchService flexibleSearchService;

	@Override
	public SupplierProductModel getSupplierProductForSupplier(final String supplier)
	{
		validateParameterNotNull(supplier, "supplier must not be null");
		final FlexibleSearchQuery query = new FlexibleSearchQuery(GET_SUPPLIERPRODUCT_ON_SUPPLIER);
		query.addQueryParameter("supplier", supplier);
		return flexibleSearchService.searchUnique(query);
	}

}
