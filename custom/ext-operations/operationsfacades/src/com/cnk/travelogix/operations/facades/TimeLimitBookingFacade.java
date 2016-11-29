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
package com.cnk.travelogix.operations.facades;

import java.util.Date;


/**
 * @author C5244544
 */
public interface TimeLimitBookingFacade
{
	/**
	 * updated time for time limit booking
	 */
	public void updateTimeLimit(String orderCode, Date date);

}
