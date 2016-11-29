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

/**
 *
 */
public class PaymentServiceRequest
{

	// this is defined by integration, passed by WP2
	private String gatewayId;

	// for multi pay scenario the amount can be input by customer
	// for full pay scenario getTotalPrice from cart
	private String amount;

	// the currency for the amount, get from the session cart
	private String currency;

	// the cart code, get from the session cart
	private String cartCode;

	/**
	 * @return the amount
	 */
	public String getAmount()
	{
		return amount;
	}

	/**
	 * @param amount
	 *           the amount to set
	 */
	public void setAmount(final String amount)
	{
		this.amount = amount;
	}

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
	 * @return the cartCode
	 */
	public String getCartCode()
	{
		return cartCode;
	}

	/**
	 * @param cartCode
	 *           the cartCode to set
	 */
	public void setCartCode(final String cartCode)
	{
		this.cartCode = cartCode;
	}

}
