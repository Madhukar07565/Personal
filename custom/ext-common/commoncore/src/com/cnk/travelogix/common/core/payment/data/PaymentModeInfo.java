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
public class PaymentModeInfo
{
	// refer to PaymentModes
	private String paymentMode;
	// icic/ visa/...
	private String cardType;
	// payment gateway fee
	private MsfFee pgEnablerFee;
	// payment acquirer bank fee
	private MsfFee pgAcquirerFee;
	// client paying fee
	private MsfFee clientFee;

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
	 * @return the pgEnablerFee
	 */
	public MsfFee getPgEnablerFee()
	{
		return pgEnablerFee;
	}

	/**
	 * @param pgEnablerFee
	 *           the pgEnablerFee to set
	 */
	public void setPgEnablerFee(final MsfFee pgEnablerFee)
	{
		this.pgEnablerFee = pgEnablerFee;
	}

	/**
	 * @return the pgAcquirerFee
	 */
	public MsfFee getPgAcquirerFee()
	{
		return pgAcquirerFee;
	}

	/**
	 * @param pgAcquirerFee
	 *           the pgAcquirerFee to set
	 */
	public void setPgAcquirerFee(final MsfFee pgAcquirerFee)
	{
		this.pgAcquirerFee = pgAcquirerFee;
	}

	/**
	 * @return the clientFee
	 */
	public MsfFee getClientFee()
	{
		return clientFee;
	}

	/**
	 * @param clientFee
	 *           the clientFee to set
	 */
	public void setClientFee(final MsfFee clientFee)
	{
		this.clientFee = clientFee;
	}
}
