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
package com.cnk.travelogix.b2c.facades.customer;

import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.storesession.data.CurrencyData;
import de.hybris.platform.commercefacades.storesession.data.LanguageData;
import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commercefacades.user.data.ProfileData;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.user.CustomerModel;

import java.util.List;
import java.util.Map;

import com.cnk.travelogix.b2c.facades.wallet.impl.ValidationFailedException;
import com.cnk.travelogix.common.core.cart.data.TravellerData;


/**
 *
 */
public interface B2cCustomerFacade extends CustomerFacade
{
	void register(String fullContextPath, final RegisterData registerData) throws DuplicateUidException;

	boolean checkUserExist(String email);

	void sendActivationLinkEmail(final String email, String randomCode);

	void sendActivationLinkEmail(final String fullContextPath, final String email, String randomCode);

	String getRandomCode();

	boolean activateAccount(String email, String randomCode);

	String getHomePageLink(final String fullContextPath);

	List<CountryData> getAllCountryData();

	Map<String, List<LanguageData>> getCountry2Language();

	Map<String, List<CurrencyData>> getCountry2Currency();

	void updateCustomer(final CustomerData customerData);

	boolean emailExist(final String email);

	void saveSubscribeEmail(final String email);

	void removeEmail(final String email);

	boolean mobileExist(final String mobile);

	void saveMobile(final String mobile);

	void removeMobile(final String mobile);

	void deActivateAccount();

	void addTraveller(final TravellerData travellerData) throws ValidationFailedException;

	void deleteTraveller(final String firstName, final String middleName, final String lastName);

	void updateTraveller(final TravellerData travellerData);

	boolean getProfileAutoActivation();

	boolean checkVerLinkExpire(final String email);

	boolean getUserActivationStatus(final String email);

	void sendSuccessRegisterEmail(final String email, final String pwd);

	void updateProfile(ProfileData profileData);

	ProfileData getProfile();

	boolean checkUserFirstLogin();

	void updateCustomerLastLoginTime();

	void processForgetPassword(final String uid);

	void processEnableAccount(final String uid);

	void sendAccountLockedInformingEmail(final String email);

	void createCustomerByCRM(CustomerModel customerModel, String originalPassword) throws DuplicateUidException;

	void updateCustomerByCRM(CustomerModel customerModel);
}
