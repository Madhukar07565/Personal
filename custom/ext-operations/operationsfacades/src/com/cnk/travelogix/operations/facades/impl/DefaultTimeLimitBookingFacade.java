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
package com.cnk.travelogix.operations.facades.impl;

import de.hybris.platform.core.model.order.OrderModel;

import java.util.Date;

import javax.annotation.Resource;

import com.cnk.travelogix.operations.facades.TimeLimitBookingFacade;
import com.cnk.travelogix.operations.services.OperationOrderService;
import com.cnk.travelogix.operations.services.TimeLimitBookingService;


/**
 * @author C5244544
 *
 *         This is the implemented class for TimeLimitBookingFacade
 */
public class DefaultTimeLimitBookingFacade implements TimeLimitBookingFacade
{
	private TimeLimitBookingService timeLimitBookingService;

	@Resource(name = "operationOrderService")
	OperationOrderService operationOrderService;

	@Override
	public void updateTimeLimit(final String orderCode, final Date date)
	{
		final OrderModel orderModel = operationOrderService.getOrderByCode(orderCode);
		timeLimitBookingService.updateTempTimeLimit(orderModel, date);
		timeLimitBookingService.startTimeLimitBookingWorkflow(orderModel);
	}

	/**
	 * @return the timeLimitBookingService
	 */
	public TimeLimitBookingService getTimeLimitBookingService()
	{
		return timeLimitBookingService;
	}

	/**
	 * @param timeLimitBookingService
	 *           the timeLimitBookingService to set
	 */
	public void setTimeLimitBookingService(final TimeLimitBookingService timeLimitBookingService)
	{
		this.timeLimitBookingService = timeLimitBookingService;
	}



}
