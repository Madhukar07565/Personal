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

import java.util.Collections;
import java.util.List;

import com.cnk.travelogix.operations.doas.TimeLimitBookingDAO;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;


/**
 * @author C5244544
 *
 *         This is an implemented class of TimeLimitBookingDAO
 */
public class DefaultTimeLimitBookingDAO implements TimeLimitBookingDAO
{
	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<OrderModel> getTimeLimitOrders()
	{
		final StringBuilder queryString2 = new StringBuilder("SELECT {order.pk} FROM");

		queryString2.append("{orderEntry as oe join OrderProductInfo as orderProduct on {oe.orderProductInfo} = ");
		queryString2.append("{orderProduct.pk}} ,{order as order} where {orderProduct.timeLimitDate} > CURDATE()");
		queryString2.append("AND {order.paymentstatus} = ({{select {PK} from {paymentstatus}  where {code} = 'NOTPAID'}})");

		final FlexibleSearchQuery query2 = new FlexibleSearchQuery(queryString2.toString());
		final SearchResult<OrderModel> res1 = getFlexibleSearchService().search(query2);
		final List<OrderModel> result2 = res1.getResult();
		return result2 == null ? Collections.EMPTY_LIST : result2;
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
