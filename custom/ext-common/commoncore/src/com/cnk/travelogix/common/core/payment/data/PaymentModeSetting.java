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

import java.util.List;


/**
 * @author i323727
 *
 */
public class PaymentModeSetting
{
	List<String> supportedCreditCardTypes;
	List<String> supportedDebitCardTypes;
	List<String> supportedEmiCardTypes;
	List<String> supportedNetBankingCardTypes;

	List<PaymentModeInfo> supportedCreditCardPaymentModes;
	List<PaymentModeInfo> supportedDebitCardPaymentModes;
	List<PaymentModeInfo> supportedEmiCardPaymentModes;
	List<PaymentModeInfo> supportedNetBankingPaymentModes;

	boolean ezeeBalancesEnabled;
	boolean cashOnDeliveryEnabled;

	/**
	 * @return the supportedCreditCardTypes
	 */
	public List<String> getSupportedCreditCardTypes()
	{
		return supportedCreditCardTypes;
	}

	/**
	 * @param supportedCreditCardTypes
	 *           the supportedCreditCardTypes to set
	 */
	public void setSupportedCreditCardTypes(final List<String> supportedCreditCardTypes)
	{
		this.supportedCreditCardTypes = supportedCreditCardTypes;
	}

	/**
	 * @return the supportedDebitCardTypes
	 */
	public List<String> getSupportedDebitCardTypes()
	{
		return supportedDebitCardTypes;
	}

	/**
	 * @param supportedDebitCardTypes
	 *           the supportedDebitCardTypes to set
	 */
	public void setSupportedDebitCardTypes(final List<String> supportedDebitCardTypes)
	{
		this.supportedDebitCardTypes = supportedDebitCardTypes;
	}

	/**
	 * @return the supportedEmiCardTypes
	 */
	public List<String> getSupportedEmiCardTypes()
	{
		return supportedEmiCardTypes;
	}

	/**
	 * @param supportedEmiCardTypes
	 *           the supportedEmiCardTypes to set
	 */
	public void setSupportedEmiCardTypes(final List<String> supportedEmiCardTypes)
	{
		this.supportedEmiCardTypes = supportedEmiCardTypes;
	}

	/**
	 * @return the supportedNetBankingCardTypes
	 */
	public List<String> getSupportedNetBankingCardTypes()
	{
		return supportedNetBankingCardTypes;
	}

	/**
	 * @param supportedNetBankingCardTypes
	 *           the supportedNetBankingCardTypes to set
	 */
	public void setSupportedNetBankingCardTypes(final List<String> supportedNetBankingCardTypes)
	{
		this.supportedNetBankingCardTypes = supportedNetBankingCardTypes;
	}

	/**
	 * @return the ezeeBalancesEnabled
	 */
	public boolean isEzeeBalancesEnabled()
	{
		return ezeeBalancesEnabled;
	}

	/**
	 * @param ezeeBalancesEnabled
	 *           the ezeeBalancesEnabled to set
	 */
	public void setEzeeBalancesEnabled(final boolean ezeeBalancesEnabled)
	{
		this.ezeeBalancesEnabled = ezeeBalancesEnabled;
	}

	/**
	 * @return the cashOnDeliveryEnabled
	 */
	public boolean isCashOnDeliveryEnabled()
	{
		return cashOnDeliveryEnabled;
	}

	/**
	 * @param cashOnDeliveryEnabled
	 *           the cashOnDeliveryEnabled to set
	 */
	public void setCashOnDeliveryEnabled(final boolean cashOnDeliveryEnabled)
	{
		this.cashOnDeliveryEnabled = cashOnDeliveryEnabled;
	}

	/**
	 * @return the supportedCreditCardPaymentModes
	 */
	public List<PaymentModeInfo> getSupportedCreditCardPaymentModes()
	{
		return supportedCreditCardPaymentModes;
	}

	/**
	 * @param supportedCreditCardPaymentModes
	 *           the supportedCreditCardPaymentModes to set
	 */
	public void setSupportedCreditCardPaymentModes(final List<PaymentModeInfo> supportedCreditCardPaymentModes)
	{
		this.supportedCreditCardPaymentModes = supportedCreditCardPaymentModes;
	}

	/**
	 * @return the supportedDebitCardPaymentModes
	 */
	public List<PaymentModeInfo> getSupportedDebitCardPaymentModes()
	{
		return supportedDebitCardPaymentModes;
	}

	/**
	 * @param supportedDebitCardPaymentModes
	 *           the supportedDebitCardPaymentModes to set
	 */
	public void setSupportedDebitCardPaymentModes(final List<PaymentModeInfo> supportedDebitCardPaymentModes)
	{
		this.supportedDebitCardPaymentModes = supportedDebitCardPaymentModes;
	}

	/**
	 * @return the supportedEmiCardPaymentModes
	 */
	public List<PaymentModeInfo> getSupportedEmiCardPaymentModes()
	{
		return supportedEmiCardPaymentModes;
	}

	/**
	 * @param supportedEmiCardPaymentModes
	 *           the supportedEmiCardPaymentModes to set
	 */
	public void setSupportedEmiCardPaymentModes(final List<PaymentModeInfo> supportedEmiCardPaymentModes)
	{
		this.supportedEmiCardPaymentModes = supportedEmiCardPaymentModes;
	}

	/**
	 * @return the supportedNetBankingPaymentModes
	 */
	public List<PaymentModeInfo> getSupportedNetBankingPaymentModes()
	{
		return supportedNetBankingPaymentModes;
	}

	/**
	 * @param supportedNetBankingPaymentModes
	 *           the supportedNetBankingPaymentModes to set
	 */
	public void setSupportedNetBankingPaymentModes(final List<PaymentModeInfo> supportedNetBankingPaymentModes)
	{
		this.supportedNetBankingPaymentModes = supportedNetBankingPaymentModes;
	}

}
