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
package com.cnk.travelogix.common.core.payment.services;

import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;

import java.util.List;
import java.util.Map;

import com.cnk.travelogix.common.core.model.PaymentPlanEntryModel;
import com.cnk.travelogix.common.core.model.PaymentPlanModel;


/**
 * @author i323727
 *
 */
public interface CnkPaymentPlanService
{
	/**
	 *
	 * @param order
	 * @return All payment plan entries
	 */
	List<PaymentPlanEntryModel> getPaymentPlanEntryFromOrder(AbstractOrderModel order);

	/**
	 *
	 * @param order
	 * @return All payment plan
	 */
	List<PaymentPlanModel> getPaymentPlanFromOrder(AbstractOrderModel order);

	/**
	 * @param order
	 * @return map with key ["groupId"] and value[List&lt;OrderTicketInfoModel&gt;]
	 */
	Map<String, List<AbstractOrderEntryModel>> getTicketByGroupId(AbstractOrderModel order);

	/**
	 * @param order
	 * @return map with key ["groupId"] and value ["List&lt;OrderRoomDetailInfoModel&gt;"]
	 */
	Map<String, List<AbstractOrderEntryModel>> getRoomByGroupId(AbstractOrderModel order);
}
