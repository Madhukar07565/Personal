/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.cnk.travelogix.common.fulfilmentprocess.actions.order.b2c;

import de.hybris.platform.core.enums.OrderStatus;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.common.core.enums.ProductTypeEnum;
import com.cnk.travelogix.common.core.model.OrderProductInfoModel;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderTicketInfoModel;
import com.cnk.travelogix.common.fulfilmentprocess.CheckOrderService;


public class CheckOrderAction extends AbstractSimpleDecisionAction<OrderProcessModel>
{
	private static final Logger LOG = Logger.getLogger(CheckOrderAction.class);


	@Override
	public Transition executeAction(final OrderProcessModel process)
	{
		final OrderModel order = process.getOrder();

		if (order == null)
		{
			LOG.error("Missing the order, exiting the process");
			return Transition.NOK;
		}

		if (!order.getCalculated().booleanValue())
		{
			// Order must be calculated
			setOrderStatus(order, OrderStatus.CHECKED_INVALID);
			return Transition.NOK;
		}
		if (order.getEntries().isEmpty())
		{
			// Order must have some lines
			setOrderStatus(order, OrderStatus.CHECKED_INVALID);
			return Transition.NOK;
		}

		setOrderStatus(order, OrderStatus.ON_REQUEST);
		setEntriesStatus(order.getEntries());
		return Transition.OK;
	}

	/**
	 * update status of entry
	 * @param entries
	 */
	private void setEntriesStatus(List<AbstractOrderEntryModel> entries)
	{
		for (AbstractOrderEntryModel entry : entries)
		{
			OrderProductInfoModel prod = entry.getOrderProductInfo();

			ProductTypeEnum prodTyep = entry.getProductTypeEnum();
			if (ProductTypeEnum.ROOM.equals(prodTyep))
			{
				OrderRoomDetailInfoModel room = (OrderRoomDetailInfoModel) prod;
				room.setOrderStatus(OrderStatus.ON_REQUEST);
			}
			if (ProductTypeEnum.TICKET.equals(prodTyep))
			{
				OrderTicketInfoModel ticket = (OrderTicketInfoModel) prod;
				ticket.getOrderFlightDetailInfo().setOrderStatus(OrderStatus.ON_REQUEST);
			}
		}
	}
}
