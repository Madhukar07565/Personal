/*
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 *
 */
package com.cnk.travelogix.common.core.payment.services.impl;

import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderTicketInfoModel;
import com.cnk.travelogix.common.core.model.PaymentPlanEntryModel;
import com.cnk.travelogix.common.core.model.PaymentPlanModel;
import com.cnk.travelogix.common.core.payment.criterias.OrderRoomCriteria;
import com.cnk.travelogix.common.core.payment.criterias.OrderTicketCriteria;
import com.cnk.travelogix.common.core.payment.services.CnkPaymentPlanService;


/**
 * @author i323727
 *
 */
public class CustomCnkPaymentPlanService implements CnkPaymentPlanService
{
	@Override
	public List<PaymentPlanEntryModel> getPaymentPlanEntryFromOrder(final AbstractOrderModel order)
	{
		final List<PaymentPlanEntryModel> planEntryList = new ArrayList<>();
		getPaymentPlanFromOrder(order).forEach(plan -> planEntryList.addAll(plan.getPaymentPlanEntryList()));
		return planEntryList;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.core.payment.services.CnkPaymentPlanService#getTicketByGroupId(de.hybris.platform.core.
	 * model.order.AbstractOrderModel)
	 */
	@Override
	public Map<String, List<AbstractOrderEntryModel>> getTicketByGroupId(final AbstractOrderModel order)
	{
		final Map<String, List<AbstractOrderEntryModel>> resultMap = new HashMap<>();
		Optional.ofNullable(new OrderTicketCriteria().meetCriteria(order.getEntries()))
				.orElse(new ArrayList<AbstractOrderEntryModel>()).forEach(entry -> {
					final OrderTicketInfoModel ticket = (OrderTicketInfoModel) entry.getOrderProductInfo();
					final String groupId = ticket.getOrderFlightDetailInfo().getGroupId();

					final List<AbstractOrderEntryModel> tlist = Optional.ofNullable(resultMap.get(groupId))
							.orElse(new ArrayList<AbstractOrderEntryModel>());
					if (!tlist.contains(entry))
					{
						tlist.add(entry);
					}
					resultMap.put(groupId, tlist);
				});
		return resultMap;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.core.payment.services.CnkPaymentPlanService#getRoomByGroupId(de.hybris.platform.core.
	 * model.order.AbstractOrderModel)
	 */
	@Override
	public Map<String, List<AbstractOrderEntryModel>> getRoomByGroupId(final AbstractOrderModel order)
	{
		final Map<String, List<AbstractOrderEntryModel>> resultMap = new HashMap<>();
		Optional.ofNullable(new OrderRoomCriteria().meetCriteria(order.getEntries()))
				.orElse(new ArrayList<AbstractOrderEntryModel>()).forEach(entry -> {
					final OrderRoomDetailInfoModel room = (OrderRoomDetailInfoModel) entry.getOrderProductInfo();
					final String groupId = room.getGroupId();
					final List<AbstractOrderEntryModel> rlist = Optional.ofNullable(resultMap.get(groupId))
							.orElse(new ArrayList<AbstractOrderEntryModel>());
					if (!rlist.contains(entry))
					{
						rlist.add(entry);
					}
					resultMap.put(groupId, rlist);
				});
		return resultMap;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.core.payment.services.CnkPaymentPlanService#getPaymentPlanFromOrder(de.hybris.platform.
	 * core.model.order.AbstractOrderModel)
	 */
	@Override
	public List<PaymentPlanModel> getPaymentPlanFromOrder(final AbstractOrderModel order)
	{
		final List<PaymentPlanModel> planList = new ArrayList<>();
		getTicketByGroupId(order).forEach((key, value) -> {
			Optional.ofNullable(value).ifPresent(v -> planList
					.add(((OrderTicketInfoModel) v.get(0).getOrderProductInfo()).getOrderFlightDetailInfo().getPaymentPlan()));
		});
		getRoomByGroupId(order).forEach((key, value) -> {
			Optional.ofNullable(value)
					.ifPresent(v -> planList.add(((OrderRoomDetailInfoModel) v.get(0).getOrderProductInfo()).getPaymentPlan()));
		});
		return planList;
	}
}
