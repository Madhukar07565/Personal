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
package com.cnk.travelogix.b2c.facades.wallet.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.cnk.travelogix.b2c.facades.wallet.B2cCreditCardFacade;
import com.cnk.travelogix.b2c.facades.wallet.converters.populator.B2cCreditCardPopulator;
import com.cnk.travelogix.b2c.facades.wallet.converters.populator.B2cCreditCardReversePopulator;
import com.cnk.travelogix.b2c.services.wallet.B2cCreditCardService;
import com.cnk.travelogix.common.core.model.CnkCreditCardModel;
import com.cnk.travelogix.common.core.wallet.data.CreditCardData;


/**
 *
 */
public class ExtB2cCreditCardFacade implements B2cCreditCardFacade
{
	@Resource(name = "b2cCreditCardService")
	private B2cCreditCardService creditCardService;
	@Resource(name = "creditCardPopulator")
	private B2cCreditCardPopulator creditCardPopulator;
	@Resource(name = "creditCardReversePopulator")
	private B2cCreditCardReversePopulator creditCardReversePopulator;

	private boolean isDuplicateCardNumber(final String cardNumber)
	{
		return creditCardService.getCreditCard(cardNumber) != null;
	}

	@Override
	public List<CreditCardData> getCreditCards()
	{
		final List<CreditCardData> creditCardDataList = new ArrayList<>();
		for (final CnkCreditCardModel model : creditCardService.getCreditCards())
		{
			final CreditCardData creditCardData = new CreditCardData();
			creditCardPopulator.populate(model, creditCardData);
			creditCardDataList.add(creditCardData);
		}
		return creditCardDataList;
	}

	@Override
	public void addCreditCard(final CreditCardData creditCardData) throws ValidationFailedException
	{
		if (isDuplicateCardNumber(creditCardData.getCreditCardNumber()))
		{
			throw new ValidationFailedException().addInfo("creditCardNumber", "Duplicate record exists");
		}

		final CnkCreditCardModel creditCardModel = new CnkCreditCardModel();
		creditCardReversePopulator.populate(creditCardData, creditCardModel);
		creditCardService.addCreditCard(creditCardModel);
	}

	@Override
	public void deleteCreditCard(final String cardNumber)
	{
		creditCardService.deleteCreditCard(cardNumber);
	}

	@Override
	public void updateCreditCard(final CreditCardData creditCardData)
	{
		final CnkCreditCardModel newCreditCardModel = creditCardService.getCreditCard(creditCardData.getCreditCardNumber());
		creditCardReversePopulator.populate(creditCardData, newCreditCardModel);
		creditCardService.updateCreditCard(newCreditCardModel);
	}

}
