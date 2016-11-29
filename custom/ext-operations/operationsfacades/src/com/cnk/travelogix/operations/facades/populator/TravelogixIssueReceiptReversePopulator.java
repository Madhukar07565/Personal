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
import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.client.core.b2bunit.model.TravelogixB2BUnitModel;
import com.cnk.travelogix.common.core.enums.ReceiptType;
import com.cnk.travelogix.common.core.model.receipts.TravelogixPaymentReceiptModel;
import com.cnk.travelogix.operations.data.TravelogixClientDetailsData;
import com.cnk.travelogix.operations.data.TravelogixPaymentReceiptData;


/**
 *
 */
public class TravelogixIssueReceiptReversePopulator
		implements Populator<TravelogixPaymentReceiptData, TravelogixPaymentReceiptModel>
{
	@Autowired
	private Converter<TravelogixClientDetailsData, TravelogixB2BUnitModel> travelogixClientDetailsReverseConverter;

	@Autowired
	private Converter<CCPaymentInfoData, PaymentInfoModel> travelogixPaymentInfoReverseConverter;


	@Override
	public void populate(final TravelogixPaymentReceiptData source, final TravelogixPaymentReceiptModel target)
			throws ConversionException
	{
		/*
		 * final TravelogixClientDetailsData travelogixClientDetailsData = source.getTravelogixClientDetailsData(); final
		 * TravelogixB2BUnitModel travelogixB2BUnitModel = travelogixClientDetailsReverseConverter
		 * .convert(travelogixClientDetailsData); System.out.println(travelogixB2BUnitModel); final CCPaymentInfoData
		 * ccPaymentInfoData = source.getTravelogixPaymentInfoData(); final PaymentInfoModel paymentInfoModel =
		 * travelogixPaymentInfoReverseConverter.convert(ccPaymentInfoData);
		 */
		final CCPaymentInfoData ccPaymentInfoData = source.getTravelogixPaymentInfoData();

		target.setCode(source.getReceiptNumber());
		target.setCreationtime(source.getReceiptCreationDate());
		//target.setPaymentInfo(paymentInfoModel);
		target.setAmount(source.getReceiptAmount());
		target.setInFavourOf(source.getInFavourOf());
		target.setReceiptType(ReceiptType.valueOf(source.getReceiptType()));
		//	target.setPaymentMethod(PaymentMethodType.valueOf(ccPaymentInfoData.getPaymentMethod()));
		//	target.setRemarks(ccPaymentInfoData.getRemarks());
		target.getPaymentTransaction().setCreationtime(ccPaymentInfoData.getTransactionDate());
		target.setFunctionalAmount(source.getFunctionalReceiptAmount());
		//	target.getPaymentTransaction().setCode(ccPaymentInfoData.getTransactionReferenceNo());

		/* target.getCurrency().setName(ccPaymentInfoData.getPaymentCurrency); */
		//TODO need to discuss with madhura for currency
		//target.setRoe(g);
	}
}

