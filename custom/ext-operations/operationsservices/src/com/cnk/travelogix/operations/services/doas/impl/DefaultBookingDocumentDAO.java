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
package com.cnk.travelogix.operations.services.doas.impl;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cnk.travelogix.operations.services.daos.BookingDocumentDAO;


/**
 *
 */

@Component(value = "bookingdocumentDAO")
public class DefaultBookingDocumentDAO implements BookingDocumentDAO
{
	private static final Logger LOG = Logger.getLogger(DefaultBookingDocumentDAO.class);

	private FlexibleSearchService flexibleSearchService;

	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}


	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}


	@Override
	public List<OrderModel> findBookingDocumentsByCode(final String code)
	{

		if (LOG.isDebugEnabled())
		{
			LOG.debug(" Query for booking document  ");
		}

		final String queryString = //
				"SELECT {p:" + OrderModel.PK + "}" //
						+ "FROM {" + OrderModel._TYPECODE + " AS p} "//
						+ "WHERE " + "{p:" + OrderModel.CODE + "}=?code ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);

		return flexibleSearchService.<OrderModel> search(query).getResult();
	}



}
