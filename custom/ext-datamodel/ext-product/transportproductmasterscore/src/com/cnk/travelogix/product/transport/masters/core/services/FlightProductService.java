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
package com.cnk.travelogix.product.transport.masters.core.services;

import de.hybris.platform.catalog.model.CatalogVersionModel;

import java.util.List;

import com.cnk.travelogix.masterdata.core.iata.model.AirlineIATAItemModel;
import com.cnk.travelogix.product.transport.masters.core.model.FlightProductModel;


/**
 * Product Service
 */
public interface FlightProductService
{
	/**
	 * Find Flight by finace control
	 *
	 * @param financeControlId
	 * @param catalog
	 *
	 * @return List<FlightProductModel>
	 */
	public List<FlightProductModel> findFlightProductByfinanceControlAndCatalog(final String financeControlId,
			final CatalogVersionModel catalog);

	/**
	 * Find Flight by name and IATA
	 *
	 * @param airlineIATA
	 * @param name
	 * @return List<FlightProductModel>
	 */
	public List<FlightProductModel> findFlightProductByNameFinanceIDIata(final AirlineIATAItemModel airlineIATA, String name);
}
