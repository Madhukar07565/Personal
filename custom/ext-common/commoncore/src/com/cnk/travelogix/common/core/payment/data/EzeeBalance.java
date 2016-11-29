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
package com.cnk.travelogix.common.core.payment.data;

import java.math.BigDecimal;


/**
 * @author i323727
 *
 */
public class EzeeBalance
{
	BigDecimal remainingAmount;

	/**
	 * @return the remainingAmount
	 */
	public BigDecimal getRemainingAmount()
	{
		return remainingAmount;
	}

	/**
	 * @param remainingAmount
	 *           the remainingAmount to set
	 */
	public void setRemainingAmount(final BigDecimal remainingAmount)
	{
		this.remainingAmount = remainingAmount;
	}

}
