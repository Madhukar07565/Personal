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
package com.cnk.travelogix.b2c.facades.wallet.converters.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.Calendar;

import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.model.CnkCreditCardModel;
import com.cnk.travelogix.common.core.wallet.data.CreditCardData;


/**
 *
 */
public class B2cCreditCardPopulator implements Populator<CnkCreditCardModel, CreditCardData>
{

	@Override
	public void populate(final CnkCreditCardModel source, final CreditCardData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");

		target.setCreditCardNumber(source.getCreditCardNumber());
		target.setCardholderName(source.getCardholderName());
		target.setCardType(source.getCardType().toString());
		target.setCvv(source.getCvv());
		final Calendar c = Calendar.getInstance();
		c.setTime(source.getCcExpiryDate());
		target.setMonth(c.get(Calendar.MONTH));
		target.setYear(c.get(Calendar.YEAR));
	}

}
