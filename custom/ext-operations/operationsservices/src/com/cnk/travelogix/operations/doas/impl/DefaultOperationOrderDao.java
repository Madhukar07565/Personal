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

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import org.apache.log4j.Logger;

import com.cnk.travelogix.operations.doas.OperationOrderDao;


/**
 *
 */
public class DefaultOperationOrderDao implements OperationOrderDao
{
	protected static final Logger LOG = Logger.getLogger(DefaultOperationOrderDao.class);
	final String QUERY_ORDER = "Select {order:PK} from {Order as order} where {order.code} = ?order";

	private FlexibleSearchService flexibleSearchService;

	@Override
	public OrderModel findOrderByCode(final String order)
	{
		validateParameterNotNull(order, "order must not be null");
		final FlexibleSearchQuery query = new FlexibleSearchQuery(QUERY_ORDER);
		query.addQueryParameter("order", order);
		return getFlexibleSearchService().searchUnique(query);
	}

	/**
	 * @return the flexibleSearchService
	 */
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	/**
	 * @param flexibleSearchService
	 *           the flexibleSearchService to set
	 */
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

}
