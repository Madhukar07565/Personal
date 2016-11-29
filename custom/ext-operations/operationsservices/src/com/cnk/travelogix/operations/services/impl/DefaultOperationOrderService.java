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
package com.cnk.travelogix.operations.services.impl;

import de.hybris.platform.core.model.order.OrderModel;

import com.cnk.travelogix.operations.doas.OperationOrderDao;
import com.cnk.travelogix.operations.services.OperationOrderService;


/**
 *
 */
public class DefaultOperationOrderService implements OperationOrderService
{

	private OperationOrderDao operationOrderDao;

	@Override
	public OrderModel getOrderByCode(final String code)
	{
		return getOperationOrderDao().findOrderByCode(code);
	}

	/**
	 * @return the operationOrderDao
	 */
	public OperationOrderDao getOperationOrderDao()
	{
		return operationOrderDao;
	}

	/**
	 * @param operationOrderDao
	 *           the operationOrderDao to set
	 */
	public void setOperationOrderDao(final OperationOrderDao operationOrderDao)
	{
		this.operationOrderDao = operationOrderDao;
	}


}
