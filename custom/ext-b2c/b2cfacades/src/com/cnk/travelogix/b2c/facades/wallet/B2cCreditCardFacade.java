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
package com.cnk.travelogix.b2c.facades.wallet;

import java.util.List;

import com.cnk.travelogix.b2c.facades.wallet.impl.ValidationFailedException;
import com.cnk.travelogix.common.core.wallet.data.CreditCardData;


/**
 *
 */
public interface B2cCreditCardFacade
{
	List<CreditCardData> getCreditCards();

	void addCreditCard(CreditCardData creditCardData) throws ValidationFailedException;

	void deleteCreditCard(String cardNumber);

	void updateCreditCard(CreditCardData creditCardData);
}
