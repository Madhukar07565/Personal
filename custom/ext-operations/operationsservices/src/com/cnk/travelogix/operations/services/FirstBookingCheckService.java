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

import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;


/**
 * @author C5244544 This is an interface related to FirstBookingCheck
 */
public interface FirstBookingCheckService
{

	/**
	 * This is the method to check whether the supplier is new or not
	 */
	public boolean isNewSupplier(final AbstractOrderEntryModel abstractOrderEntryModel);



	/**
	 * This is the method to check whether the supplier is new or not
	 */
	public boolean isFirstBookingCheckEnabledProd(final AbstractOrderEntryModel abstractOrderEntryModel);

	/**
	 * This is the method to check whether the supplier is new or not and product eligible or not If both are true then
	 * to send an alert to operation's user
	 */
	public boolean checkAndSendFirstBookingSupplierAlert(final OrderModel orderModel);
}
