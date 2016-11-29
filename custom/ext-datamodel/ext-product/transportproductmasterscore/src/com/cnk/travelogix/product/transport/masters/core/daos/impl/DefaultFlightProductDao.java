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
package com.cnk.travelogix.product.transport.masters.core.daos.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import com.cnk.travelogix.masterdata.core.iata.model.AirlineIATAItemModel;
import com.cnk.travelogix.product.transport.masters.core.daos.FlightProductDao;
import com.cnk.travelogix.product.transport.masters.core.model.FlightProductModel;


/**
 *
 */
public class DefaultFlightProductDao extends AbstractItemDao implements FlightProductDao
{
	protected static final String FLIGHTPRODUCT_QUERY_FCID_CATALOG = "SELECT {" + FlightProductModel.PK + "} FROM {"
			+ FlightProductModel._TYPECODE + "} WHERE {" + FlightProductModel.FINANCECONTROLID + "} = ?financeControlId and {"
			+ FlightProductModel.CATALOGVERSION + "} = ?catalog";

	protected static final String FLIGHTPRODUCT_QUERY_FCID_IATA_CODE = "SELECT {" + FlightProductModel.PK + "} FROM {"
			+ FlightProductModel._TYPECODE + "} WHERE {" + FlightProductModel.AIRLINEIATA + "} = ?airlineIATA and {"
			+ FlightProductModel.NAME + "[ANY]} = ?name ";


	/**
	 * find flight product using catalog version and financeControlId
	 *
	 */

	@Override
	public List<FlightProductModel> findFlightProductByfinanceControlAndCatalog(final String financeControlId,
			final CatalogVersionModel catalog)
	{
		validateParameterNotNull(catalog, "Catalog must not be null");
		final FlexibleSearchQuery query = new FlexibleSearchQuery(FLIGHTPRODUCT_QUERY_FCID_CATALOG);
		query.addQueryParameter("financeControlId", financeControlId);
		query.addQueryParameter("catalog", catalog);
		final SearchResult<FlightProductModel> result = search(query);
		return result.getResult();
	}

	@Override
	public List<FlightProductModel> findFlightProductByNameFinanceIDIata(final AirlineIATAItemModel airlineIATA, final String name)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(FLIGHTPRODUCT_QUERY_FCID_IATA_CODE);
		query.addQueryParameter("airlineIATA", airlineIATA);
		query.addQueryParameter("name", name);
		final SearchResult<FlightProductModel> result = search(query);
		return result.getResult();
	}
}
