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
package com.cnk.travelogix.common.core.payment.data;

/**
 * @author i323727
 *
 */
public class MsfFee
{
	// different market, currency is different
	private String currency;
	// high priority
	private Double amount;
	// low priority
	private Double percentage;
	// ON_US/ OFF_US
	private String feeType;

	/**
	 * @return the currency
	 */
	public String getCurrency()
	{
		return currency;
	}

	/**
	 * @param currency
	 *           the currency to set
	 */
	public void setCurrency(final String currency)
	{
		this.currency = currency;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount()
	{
		return amount;
	}

	/**
	 * @param amount
	 *           the amount to set
	 */
	public void setAmount(final Double amount)
	{
		this.amount = amount;
	}

	/**
	 * @return the percentage
	 */
	public Double getPercentage()
	{
		return percentage;
	}

	/**
	 * @param percentage
	 *           the percentage to set
	 */
	public void setPercentage(final Double percentage)
	{
		this.percentage = percentage;
	}

	/**
	 * @return the feeType
	 */
	public String getFeeType()
	{
		return feeType;
	}

	/**
	 * @param feeType
	 *           the feeType to set
	 */
	public void setFeeType(final String feeType)
	{
		this.feeType = feeType;
	}

}
