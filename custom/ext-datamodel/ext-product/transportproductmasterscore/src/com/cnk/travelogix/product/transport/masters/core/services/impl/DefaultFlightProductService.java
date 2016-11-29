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
package com.cnk.travelogix.product.transport.masters.core.services.impl;

import de.hybris.platform.catalog.model.CatalogVersionModel;

import java.util.List;

import com.cnk.travelogix.masterdata.core.iata.model.AirlineIATAItemModel;
import com.cnk.travelogix.product.transport.masters.core.daos.FlightProductDao;
import com.cnk.travelogix.product.transport.masters.core.model.FlightProductModel;
import com.cnk.travelogix.product.transport.masters.core.services.FlightProductService;


/**
 * Implementation of FlightProductService
 */
public class DefaultFlightProductService implements FlightProductService
{
	FlightProductDao flightProductDao;

	@Override
	public List<FlightProductModel> findFlightProductByfinanceControlAndCatalog(final String financeControlId,
			final CatalogVersionModel catalog)
	{
		return flightProductDao.findFlightProductByfinanceControlAndCatalog(financeControlId, catalog);
	}

	@Override
	public List<FlightProductModel> findFlightProductByNameFinanceIDIata(final AirlineIATAItemModel airlineIATA, final String name)
	{
		return flightProductDao.findFlightProductByNameFinanceIDIata(airlineIATA, name);
	}

	/**
	 * @param flightProductDao
	 *           the flightProductDao to set
	 */
	public void setFlightProductDao(final FlightProductDao flightProductDao)
	{
		this.flightProductDao = flightProductDao;
	}

}
