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


/**
 *
 */
@FunctionalInterface
public interface OperationOrderService
{
	/**
	 * to get the order details by passing code only
	 *
	 * @param code
	 */
	public OrderModel getOrderByCode(final String code);
}
