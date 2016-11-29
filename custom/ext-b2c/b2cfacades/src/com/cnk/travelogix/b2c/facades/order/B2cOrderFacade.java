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
package com.cnk.travelogix.b2c.facades.order;

import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.core.enums.OrderStatus;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.store.BaseStoreModel;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.model.OrderProductInfoModel;
import com.cnk.travelogix.common.core.order.CNKCustomerAccountService;
import com.cnk.travelogix.common.core.order.OrderSearchCondition;
import com.cnk.travelogix.common.facades.order.impl.CNKDefaultOrderFacade;


public class B2cOrderFacade extends CNKDefaultOrderFacade
{
	private static final Logger LOG = Logger.getLogger(B2cOrderFacade.class);

	private static final String ORDER_NOT_FOUND_FOR_BASE_STORE = "Order with guid %s not found in current BaseStore";

	private static final String ORDER_ENTRY_NOT_FOUND_FOR_BASE_STORE = "Order entry with guid %s not found in current BaseStore";

	@Override
	public OrderData getGroupedOrderDetailsForCode(final String code)
	{
		Assert.isTrue(StringUtils.isNotBlank(code), "Code can not be NULL.");

		if (LOG.isDebugEnabled())
		{
			LOG.debug(String.format("Get order details for the given code [%s]", code));
		}

		final OrderData orderData = super.getOrderDetailsForCode(code);

		if (CollectionUtils.isEmpty(orderData.getEntries()))
		{
			throw new UnknownIdentifierException(String.format("Order with guid %s not found for current user in current BaseStore",
					code));
		}

		final OrderData groupedOrderData = getGroupOrderEntryConverter().convert(orderData);
		getPaymentPlanForOrderConverter().convert(groupedOrderData, groupedOrderData);

		return groupedOrderData;

	}

	@Override
	public SearchPageData<OrderData> searchOrder(final OrderSearchCondition osc, final PageableData pageableData)
	{
		final CustomerModel currentCustomer = (CustomerModel) getUserService().getCurrentUser();
		final BaseStoreModel currentBaseStore = getBaseStoreService().getCurrentBaseStore();
		final SearchPageData<OrderModel> orderList = ((CNKCustomerAccountService) getCustomerAccountService()).searchBookingList(
				currentCustomer, currentBaseStore, osc, pageableData);

		final SearchPageData<OrderData> sourceList = new SearchPageData<OrderData>();
		sourceList.setPagination(orderList.getPagination());
		sourceList.setSorts(orderList.getSorts());
		sourceList.setResults(Converters.convertAll(orderList.getResults(), getOrderConverter()));

		return convertPageData(sourceList, getGroupOrderEntryConverter());
	}

	@Override
	public void updateOrderStatus(final String code, final OrderStatus orderStatus)
	{
		final OrderModel orderModel = getOrderModelForCode(code);

		// Update order model's status.
		orderModel.setStatus(orderStatus);
		getModelService().save(orderModel);

		// Update order entry model's status.
		final List<AbstractOrderEntryModel> orderEntries = orderModel.getEntries();
		if (CollectionUtils.isEmpty(orderEntries))
		{
			throw new UnknownIdentifierException(String.format(ORDER_ENTRY_NOT_FOUND_FOR_BASE_STORE, orderModel.getCode()));
		}
		orderEntries.forEach(orderEntry -> {
			final OrderProductInfoModel orderProductInfoModel = orderEntry.getOrderProductInfo();
			if (orderProductInfoModel != null)
			{
				orderProductInfoModel.setOrderStatus(orderStatus);
			}
			getModelService().save(orderProductInfoModel);
		});
	}

	/**
	 * Get order model for code.
	 */
	private OrderModel getOrderModelForCode(final String code)
	{
		OrderModel orderModel = null;

		try
		{
			orderModel = getCustomerAccountService().getOrderForCode(code, getBaseStoreService().getCurrentBaseStore());
		}
		catch (final ModelNotFoundException e)
		{
			throw new UnknownIdentifierException(String.format(ORDER_NOT_FOUND_FOR_BASE_STORE, code));
		}

		if (orderModel == null)
		{
			throw new UnknownIdentifierException(String.format(ORDER_NOT_FOUND_FOR_BASE_STORE, code));
		}

		return orderModel;
	}
}
