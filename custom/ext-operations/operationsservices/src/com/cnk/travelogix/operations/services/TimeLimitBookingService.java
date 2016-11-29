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
package com.cnk.travelogix.operations.services;

import de.hybris.platform.core.model.order.OrderModel;

import java.util.Date;
import java.util.List;


/**
 * @author C5244544
 *
 *         This is the main interface for TimeLimit Booking
 */
public interface TimeLimitBookingService
{

	/**
	 * to get list of all the time limit orders without payment
	 */
	public List<OrderModel> getTimeLimitOrders();

	/**
	 * method to update the time limit booking
	 *
	 */
	public void updateTimeLimit(OrderModel orderModel, final Date date);

	public void updateTempTimeLimit(OrderModel orderModel, final Date date);


	/**
	 * method to get all the time limits orders which timeLimit is going to expiry
	 */

	public List<OrderModel> getTimeLimitOrderCancelAlert();

	/**
	 * method to get all the time limits orders which has timeLimit greater than expiry
	 *
	 */
	public List<OrderModel> getTimeLimitOrderAlert();

	public void startTimeLimitBookingWorkflow(OrderModel orderModel);
}
