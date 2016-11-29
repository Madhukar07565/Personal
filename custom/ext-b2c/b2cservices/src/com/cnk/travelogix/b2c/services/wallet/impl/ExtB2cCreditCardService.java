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
package com.cnk.travelogix.b2c.services.wallet.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import com.cnk.travelogix.b2c.services.wallet.B2cCreditCardService;
import com.cnk.travelogix.common.core.model.CnkCreditCardModel;


/**
 *
 */
public class ExtB2cCreditCardService implements B2cCreditCardService
{
	@Resource
	private ModelService modelService;
	@Resource
	private UserService userService;

	@Override
	public CnkCreditCardModel getCreditCard(final String cardNumber)
	{
		final CustomerModel customerModel = (CustomerModel) userService.getCurrentUser();
		for (final CnkCreditCardModel creditCardModel : customerModel.getCreditCards())
		{
			if (creditCardModel.getCreditCardNumber().equals(cardNumber))
			{
				return creditCardModel;
			}
		}
		// if there is no existing card
		return null;
	}

	@Override
	public void addCreditCard(final CnkCreditCardModel creditCardModel)
	{
		final CustomerModel customerModel = (CustomerModel) userService.getCurrentUser();
		final Set<CnkCreditCardModel> creditCards = new HashSet<CnkCreditCardModel>(customerModel.getCreditCards());
		creditCards.add(creditCardModel);
		customerModel.setCreditCards(creditCards);
		modelService.save(customerModel);
	}

	@Override
	public Set<CnkCreditCardModel> getCreditCards()
	{
		final CustomerModel customerModel = (CustomerModel) userService.getCurrentUser();
		return customerModel.getCreditCards();
	}

	@Override
	public void deleteCreditCard(final String cardNumber)
	{
		final CustomerModel customerModel = (CustomerModel) userService.getCurrentUser();
		for (final CnkCreditCardModel creditCardModel : customerModel.getCreditCards())
		{
			if (creditCardModel.getCreditCardNumber().equals(cardNumber))
			{
				modelService.remove(creditCardModel);
				modelService.refresh(customerModel);
				break;
			}
		}
	}

	@Override
	public void updateCreditCard(final CnkCreditCardModel newCreditCardModel)
	{
		modelService.save(newCreditCardModel);
	}

}
