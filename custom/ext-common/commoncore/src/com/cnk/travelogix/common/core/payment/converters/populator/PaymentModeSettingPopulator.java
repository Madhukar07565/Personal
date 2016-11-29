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
package com.cnk.travelogix.common.core.payment.converters.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.enums.CreditCardType;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.store.BaseStoreModel;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.BooleanUtils;

import com.cnk.travelogix.common.core.enums.PaymentModes;
import com.cnk.travelogix.common.core.payment.data.MsfFee;
import com.cnk.travelogix.common.core.payment.data.PaymentModeInfo;
import com.cnk.travelogix.common.core.payment.data.PaymentModeSetting;


/**
 * @author i323727
 *
 */
public class PaymentModeSettingPopulator implements Populator<BaseStoreModel, PaymentModeSetting>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final BaseStoreModel source, final PaymentModeSetting target) throws ConversionException
	{

		if (source != null && target != null)
		{
			target.setSupportedCreditCardTypes(getStringList(source.getSupportedDebitCardTypes()));
			target.setSupportedDebitCardTypes(getStringList(source.getSupportedDebitCardTypes()));
			target.setSupportedEmiCardTypes(getStringList(source.getSupportedEmiCardTypes()));
			target.setSupportedNetBankingCardTypes(getStringList(source.getSupportedNetBankingCardTypes()));
			target.setCashOnDeliveryEnabled(BooleanUtils.isTrue(source.getCashOnDeliveryEnabled()));
			target.setEzeeBalancesEnabled(BooleanUtils.isTrue(source.getEzeeBalancesEnabled()));
			buildPaymentModeInfo(target);
		}
	}

	private void buildPaymentModeInfo(final PaymentModeSetting target)
	{
		target.setSupportedCreditCardPaymentModes(new ArrayList<>());
		target.setSupportedDebitCardPaymentModes(new ArrayList<>());
		target.setSupportedEmiCardPaymentModes(new ArrayList<>());
		target.setSupportedNetBankingPaymentModes(new ArrayList<>());

		final List<String> ccTypes = target.getSupportedCreditCardTypes();
		if (ccTypes != null)
		{
			ccTypes.forEach(card -> target.getSupportedCreditCardPaymentModes().add(buildCreditCardPaymentMode(card)));
		}

		final List<String> dbTypes = target.getSupportedDebitCardTypes();
		if (dbTypes != null)
		{
			dbTypes.forEach(card -> target.getSupportedDebitCardPaymentModes().add(buildDebitCardPaymentMode(card)));
		}

		final List<String> emiTypes = target.getSupportedEmiCardTypes();
		if (emiTypes != null)
		{
			emiTypes.forEach(card -> target.getSupportedEmiCardPaymentModes().add(buildEmiCardPaymentMode(card)));
		}

		final List<String> nbTypes = target.getSupportedNetBankingCardTypes();
		if (nbTypes != null)
		{
			nbTypes.forEach(card -> target.getSupportedNetBankingPaymentModes().add(buildNetBankingPaymentMode(card)));
		}



	}

	/**
	 * @param cardType
	 * @return
	 */
	private PaymentModeInfo buildNetBankingPaymentMode(final String cardType)
	{
		final PaymentModeInfo mode = new PaymentModeInfo();
		mode.setPaymentMode(PaymentModes.NETBANKING.getCode());
		mode.setCardType(cardType);
		mode.setPgAcquirerFee(getPgaFee());
		mode.setPgEnablerFee(getPgeFee());
		mode.setClientFee(getClientFee());
		return mode;
	}

	/**
	 * @param card
	 * @return
	 */
	private PaymentModeInfo buildEmiCardPaymentMode(final String cardType)
	{
		final PaymentModeInfo mode = new PaymentModeInfo();
		mode.setPaymentMode(PaymentModes.EMI.getCode());
		mode.setCardType(cardType);
		mode.setPgAcquirerFee(getPgaFee());
		mode.setPgEnablerFee(getPgeFee());
		mode.setClientFee(getClientFee());
		return mode;
	}

	private PaymentModeInfo buildCreditCardPaymentMode(final String cardType)
	{
		final PaymentModeInfo mode = new PaymentModeInfo();
		mode.setPaymentMode(PaymentModes.CREDITCARD.getCode());
		mode.setCardType(cardType);
		mode.setPgAcquirerFee(getPgaFee());
		mode.setPgEnablerFee(getPgeFee());
		mode.setClientFee(getClientFee());
		return mode;
	}

	private PaymentModeInfo buildDebitCardPaymentMode(final String cardType)
	{
		final PaymentModeInfo mode = new PaymentModeInfo();
		mode.setPaymentMode(PaymentModes.DEBITCARD.getCode());
		mode.setCardType(cardType);
		mode.setPgAcquirerFee(getPgaFee());
		mode.setPgEnablerFee(getPgeFee());
		mode.setClientFee(getClientFee());
		return mode;
	}


	private MsfFee getPgaFee()
	{
		final MsfFee fee = new MsfFee();
		fee.setAmount(null);
		fee.setCurrency("INR");
		fee.setFeeType("ON_US");
		fee.setPercentage(Double.valueOf(1.5));
		return fee;
	}

	private MsfFee getPgeFee()
	{
		final MsfFee fee = new MsfFee();
		fee.setAmount(null);
		fee.setCurrency("INR");
		fee.setFeeType("ON_US");
		fee.setPercentage(Double.valueOf(1.5));
		return fee;
	}

	private MsfFee getClientFee()
	{
		final MsfFee fee = new MsfFee();
		fee.setAmount(Double.valueOf(100));
		fee.setCurrency("INR");
		fee.setFeeType("ON_US");
		fee.setPercentage(Double.valueOf(1.5));
		return fee;
	}



	private List<String> getStringList(final List<CreditCardType> source)
	{
		final List<String> list = new ArrayList<>();
		if (CollectionUtils.isNotEmpty(source))
		{
			source.forEach(t -> list.add(t.getCode()));
		}
		return list;
	}

}
