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
package com.cnk.travelogix.b2c.services.wallet;

import java.util.Set;

import com.cnk.travelogix.common.core.model.CnkCreditCardModel;


/**
 *
 */
public interface B2cCreditCardService
{
	CnkCreditCardModel getCreditCard(String cardNumber);

	Set<CnkCreditCardModel> getCreditCards();

	void addCreditCard(CnkCreditCardModel creditCardModel);

	void deleteCreditCard(String cardNumber);

	void updateCreditCard(CnkCreditCardModel newCreditCardModel);
}
