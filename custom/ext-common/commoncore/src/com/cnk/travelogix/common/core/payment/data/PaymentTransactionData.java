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

import de.hybris.platform.payment.enums.PaymentTransactionType;


/**
 * @author i323727
 *
 */
public class PaymentTransactionData
{
	private String modeOfPayment;
	private double amount;
	/* 25/04/2015 */
	private String dateOfPayment;

	private PaymentTransactionType type;

	private String paymentProvider;

	/**
	 * @return the modeOfPayment
	 */
	public String getModeOfPayment()
	{
		return modeOfPayment;
	}

	/**
	 * @param modeOfPayment
	 *           the modeOfPayment to set
	 */
	public void setModeOfPayment(final String modeOfPayment)
	{
		this.modeOfPayment = modeOfPayment;
	}

	/**
	 * @return the amount
	 */
	public double getAmount()
	{
		return amount;
	}

	/**
	 * @param amount
	 *           the amount to set
	 */
	public void setAmount(final double amount)
	{
		this.amount = amount;
	}

	/**
	 * @return the dateOfPayment
	 */
	public String getDateOfPayment()
	{
		return dateOfPayment;
	}

	/**
	 * @param dateOfPayment
	 *           the dateOfPayment to set
	 */
	public void setDateOfPayment(final String dateOfPayment)
	{
		this.dateOfPayment = dateOfPayment;
	}

	/**
	 * @return the type
	 */
	public PaymentTransactionType getType()
	{
		return type;
	}

	/**
	 * @param type
	 *           the type to set
	 */
	public void setType(final PaymentTransactionType type)
	{
		this.type = type;
	}

	/**
	 * @return the paymentProvider
	 */
	public String getPaymentProvider()
	{
		return paymentProvider;
	}

	/**
	 * @param paymentProvider
	 *           the paymentProvider to set
	 */
	public void setPaymentProvider(final String paymentProvider)
	{
		this.paymentProvider = paymentProvider;
	}
}
