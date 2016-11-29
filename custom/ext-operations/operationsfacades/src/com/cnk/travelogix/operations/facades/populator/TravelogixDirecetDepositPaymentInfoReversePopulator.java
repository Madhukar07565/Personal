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
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.enums.PaymentModes;
import com.cnk.travelogix.common.core.model.DirectDepositPaymentInfoModel;


/**
 *
 */
public class TravelogixDirecetDepositPaymentInfoReversePopulator
		implements Populator<CCPaymentInfoData, DirectDepositPaymentInfoModel>
{

	@Override
	public void populate(final CCPaymentInfoData source, final DirectDepositPaymentInfoModel target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");

		target.setPaymentMode(PaymentModes.valueOf(source.getModeOfPayment()));
		target.setChequeOrDDIssuingBank(source.getBankName());
		/* target.setChequeOrDDToBank(source.); */
	}
}
