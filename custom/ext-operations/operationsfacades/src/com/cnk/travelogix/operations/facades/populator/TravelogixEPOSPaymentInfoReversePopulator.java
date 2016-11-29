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
package com.cnk.travelogix.operations.facades.populator;

import de.hybris.platform.commercefacades.order.data.CCPaymentInfoData;
import de.hybris.platform.commerceservices.converter.Populator;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;


/**
 *
 */
public class TravelogixEPOSPaymentInfoReversePopulator implements Populator<CCPaymentInfoData, PaymentInfoModel>
{

	@Override
	public void populate(final CCPaymentInfoData source, final PaymentInfoModel target) throws ConversionException
	{
		/*
		 * if (source.getModeOfPayment().equalsIgnoreCase("cashondelivery")) { final CashOnDeliveryPaymentInfoModel
		 * cashOnDeliveryPaymentInfoModel = new CashOnDeliveryPaymentInfoModel();
		 * cashOnDeliveryPaymentInfoModel.setCreationtime(source.getDateOfPayment());
		 * cashOnDeliveryPaymentInfoModel.setPaymentMode(PaymentModes.valueOf(source.getModeOfPayment()));
		 * //cashOnDeliveryPaymentInfoModel.setDenomination(source.getde); } if
		 * (source.getModeOfPayment().equalsIgnoreCase("creditcard")) { final CreditCardPaymentInfoModel
		 * cardPaymentInfoModel = new CreditCardPaymentInfoModel();
		 * cardPaymentInfoModel.setCreationtime(source.getDateOfPayment());
		 * cardPaymentInfoModel.setPaymentMode(PaymentModes.valueOf(source.getModeOfPayment()));
		 * cardPaymentInfoModel.setNumber(source.getCardNumber());
		 * cardPaymentInfoModel.setType(CreditCardType.valueOf(source.getCardType()));
		 * //cardPaymentInfoModel.setCcOwner(source); cardPaymentInfoModel.setValidToMonth(source.getExpiryMonth());
		 * cardPaymentInfoModel.setValidFromYear(source.getExpiryYear()); }
		 */
	}
}
