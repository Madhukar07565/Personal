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
 * @author i323727
 *
 */
public class PaymentServiceResponse
{
	// true means all the checksum and relative checks passed, the payment is completed successfully
	private boolean success;

	// detail message about the response, error message when fail, append with fraud check message
	private String message;

	// paytm
	private String gatewayId;

	// PaymentModes creditcard/debitcard/...
	private String paymentMode;

	// PaymentCardType
	private String cardType;

	// amount returned by gateway
	private String amount;

	// OOTB Currency.isocode
	private String currency;

	// return by gateway as a receipt
	private String receiptNo;

	// refer to DecisionsEnum, the fraud check status will be stored in this field, order will be created only if the status is ACCEPT
	private String decision;

	/** card fields start */
	// e.g. ****1111
	private String cardNumber;

	// full name
	private String cardHolder;

	// mm
	private String cardExpiryMonth;

	// yy
	private String cardExpiryYear;
	/** card fields end */

	/** other payment mode info except card to be added later */
	// e.g. ezeeWalletNo etc.

	/**
	 * @return the success
	 */
	public boolean isSuccess()
	{
		return success;
	}

	/**
	 * @param success
	 *           the success to set
	 */
	public void setSuccess(final boolean success)
	{
		this.success = success;
	}

	/**
	 * @return the message
	 */
	public String getMessage()
	{
		return message;
	}

	/**
	 * @param message
	 *           the message to set
	 */
	public void setMessage(final String message)
	{
		this.message = message;
	}

	/**
	 * @return the gatewayId
	 */
	public String getGatewayId()
	{
		return gatewayId;
	}

	/**
	 * @param gatewayId
	 *           the gatewayId to set
	 */
	public void setGatewayId(final String gatewayId)
	{
		this.gatewayId = gatewayId;
	}

	/**
	 * @return the paymentMode
	 */
	public String getPaymentMode()
	{
		return paymentMode;
	}

	/**
	 * @param paymentMode
	 *           the paymentMode to set
	 */
	public void setPaymentMode(final String paymentMode)
	{
		this.paymentMode = paymentMode;
	}

	/**
	 * @return the cardType
	 */
	public String getCardType()
	{
		return cardType;
	}

	/**
	 * @param cardType
	 *           the cardType to set
	 */
	public void setCardType(final String cardType)
	{
		this.cardType = cardType;
	}

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
	 * @return the receiptNo
	 */
	public String getReceiptNo()
	{
		return receiptNo;
	}

	/**
	 * @param receiptNo
	 *           the receiptNo to set
	 */
	public void setReceiptNo(final String receiptNo)
	{
		this.receiptNo = receiptNo;
	}

	/**
	 * @return the decision
	 */
	public String getDecision()
	{
		return decision;
	}

	/**
	 * @param decision
	 *           the decision to set
	 */
	public void setDecision(final String decision)
	{
		this.decision = decision;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber()
	{
		return cardNumber;
	}

	/**
	 * @param cardNumber
	 *           the cardNumber to set
	 */
	public void setCardNumber(final String cardNumber)
	{
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the cardHolder
	 */
	public String getCardHolder()
	{
		return cardHolder;
	}

	/**
	 * @param cardHolder
	 *           the cardHolder to set
	 */
	public void setCardHolder(final String cardHolder)
	{
		this.cardHolder = cardHolder;
	}

	/**
	 * @return the cardExpiryMonth
	 */
	public String getCardExpiryMonth()
	{
		return cardExpiryMonth;
	}

	/**
	 * @param cardExpiryMonth
	 *           the cardExpiryMonth to set
	 */
	public void setCardExpiryMonth(final String cardExpiryMonth)
	{
		this.cardExpiryMonth = cardExpiryMonth;
	}

	/**
	 * @return the cardExpiryYear
	 */
	public String getCardExpiryYear()
	{
		return cardExpiryYear;
	}

	/**
	 * @param cardExpiryYear
	 *           the cardExpiryYear to set
	 */
	public void setCardExpiryYear(final String cardExpiryYear)
	{
		this.cardExpiryYear = cardExpiryYear;
	}

}
