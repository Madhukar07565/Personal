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
package com.cnk.travelogix.exception.commonlogging.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cnk.travelogix.exception.commonlogging.daos.TravelogixErrorMasterDAO;
import com.cnk.travelogix.exception.commonlogging.errorlog.model.SupplierErrorModel;
import com.cnk.travelogix.exception.commonlogging.errorlog.model.TravelogixErrorMasterModel;


@Component(value = "travelogixErrorMasterDAO")
public class DefaultTravelogixErrorMasterDAO implements TravelogixErrorMasterDAO
{
	/**
	 * We use hybris' FlexibleSearchService for running queries against the database
	 *
	 * @see "https://wiki.hybris.com/display/release5/FlexibleSearch"
	 */
	@Autowired
	private FlexibleSearchService flexibleSearchService;

	/**
	 * Finds all TravelogixErrorMasters by performing a FlexibleSearch using the {@link FlexibleSearchService}.
	 */
	@Override
	public List<TravelogixErrorMasterModel> findTravelogixErrorMasters()
	{
		// Build a query for the flexible search.
		final String queryString = //
				"SELECT {p:" + TravelogixErrorMasterModel.PK + "} "//
						+ "FROM {" + TravelogixErrorMasterModel._TYPECODE + " AS p} ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		// Note that we could specify paginating logic by providing a start and count variable (commented out below)
		// This can provide a safeguard against returning very large amounts of data, or hogging the database when there are
		// for example millions of items being returned.
		// As we know that there are only a few persisted TravelogixErrorMasters in this use case we do not need to provide this.

		//query.setStart(start);
		//query.setCount(count);

		// Return the list of TravelogixErrorMasterModels.
		return flexibleSearchService.<TravelogixErrorMasterModel> search(query).getResult();
	}

	/**
	 * Finds all TravelogixErrorMasters by given code by performing a FlexibleSearch using the
	 * {@link FlexibleSearchService}.
	 */
	@Override
	public List<TravelogixErrorMasterModel> findTravelogixErrorMasterByCode(final String errorCode)
	{
		final String queryString = //
				"SELECT {p:" + TravelogixErrorMasterModel.PK + "} " //
						+ "FROM {" + TravelogixErrorMasterModel._TYPECODE + " AS p} "//
						+ "WHERE " + "{p:" + TravelogixErrorMasterModel.ERRORCODE + "}=?errorCode ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("errorCode", errorCode);

		return flexibleSearchService.<TravelogixErrorMasterModel> search(query).getResult();
	}

	@Override
	public TravelogixErrorMasterModel findTravelogixErrorMasterByCodeFromSupplier(final String errorCode)
	{
		TravelogixErrorMasterModel travelogixErrorMasterModel = null;
		SupplierErrorModel supplierErrorModel = null;
		final String queryString = //
				"SELECT {p:" + SupplierErrorModel.PK + "} " //
						+ "FROM {" + SupplierErrorModel._TYPECODE + " AS p} "//
						+ "WHERE " + "{p:" + SupplierErrorModel.SUPPLIERERRORCODE + "}=?errorCode ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("errorCode", errorCode);

		//final Set<SupplierErrorModel> supplierErrorModels = (Set<SupplierErrorModel>) flexibleSearchService
		//		.<SupplierErrorModel> search(query).getResult();

		final List<SupplierErrorModel> supplierErrorModels = flexibleSearchService.<SupplierErrorModel> search(query).getResult();
		if (supplierErrorModels != null && supplierErrorModels.size() > 0)
		{
			//final Iterator iter = supplierErrorModels.iterator();

			for (final SupplierErrorModel supplierErrorsModel : supplierErrorModels)
			{
				supplierErrorModel = supplierErrorsModel;
				break;
			}
			//			while (iter.hasNext())
			//			{
			//				supplierErrorModel = (SupplierErrorModel) iter.next();
			//				break;
			//			}

			if (supplierErrorModel != null)
			{
				final List<TravelogixErrorMasterModel> trvlogixErrorModel = new ArrayList<TravelogixErrorMasterModel>();
				trvlogixErrorModel.addAll(supplierErrorModel.getTravelogixErrorMasters());
				travelogixErrorMasterModel = trvlogixErrorModel.get(0);
				//return (TravelogixErrorMasterModel) supplierErrorModel.getTravelogixErrorMasters();
			}
		}

		return travelogixErrorMasterModel;
	}
}
