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
package com.cnk.travelogix.b2c.services.customer;

import de.hybris.platform.commerceservices.customer.CustomerAccountService;
import de.hybris.platform.core.model.user.CustomerModel;

import com.cnk.travelogix.client.config.core.registration.model.B2CRegistrationConfigModel;
import com.cnk.travelogix.common.core.model.TravellerModel;


/**
 *
 */
public interface B2cCustomerAccountService extends CustomerAccountService
{
	String generateRandomCode();

	String getActivationRandomCode(String email);

	void addTraveller(final TravellerModel travellerModel);

	void deleteTraveller(final String firstName, final String middleName, final String lastName);

	void updateTraveller(final TravellerModel travellerModel);

	B2CRegistrationConfigModel getB2CRegistrationConfig();

	TravellerModel getTraveller(final String firstName, final String middleName, final String lastName);

	String processEnableAccount(final CustomerModel customerModel);
}
