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
package com.cnk.travelogix.b2c.services.customer.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNullStandardMessage;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.commerceservices.customer.impl.DefaultCustomerAccountService;
import de.hybris.platform.commerceservices.event.AbstractCommerceUserEvent;
import de.hybris.platform.commerceservices.security.SecureToken;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.b2c.services.customer.B2cCustomerAccountService;
import com.cnk.travelogix.client.config.core.registration.model.B2CRegistrationConfigModel;
import com.cnk.travelogix.client.core.clienttype.model.TravelogixClientTypeModel;
import com.cnk.travelogix.common.core.model.TravellerModel;


/**
 *
 */
public class ExtB2cCustomerAccountService extends DefaultCustomerAccountService implements B2cCustomerAccountService
{
	private static final Logger LOG = Logger.getLogger(ExtB2cCustomerAccountService.class);

	private static final int RANDOM_DATA_LENGTH = 20;
	private static final String B2CRREGISTRATIONCONFIG_QUERY = "select {pk} from {" + B2CRegistrationConfigModel._TYPECODE
			+ "} where {" + B2CRegistrationConfigModel.ENTITYNAME + "} =?clientType";

	@Resource(name = "flexibleSearchService")
	private FlexibleSearchService flexibleSearchService;

	@Override
	public String generateRandomCode()
	{
		final StringBuilder sb = new StringBuilder();
		final Random rand = new Random();
		final Random randData = new Random();
		int data = 0;
		for (int i = 0; i < RANDOM_DATA_LENGTH; i++)
		{
			final int index = rand.nextInt(3);
			switch (index)
			{
				case 0:
					data = randData.nextInt(10);
					sb.append(data);
					break;
				case 1:
					data = randData.nextInt(26) + 65;
					sb.append((char) data);
					break;
				case 2:
					data = randData.nextInt(26) + 97;
					sb.append((char) data);
					break;
			}
		}
		return sb.toString();
	}

	@Override
	public B2CRegistrationConfigModel getB2CRegistrationConfig()
	{
		final TravelogixClientTypeModel travelogixClientType = getBaseStoreService().getCurrentBaseStore()
				.getTravelogixClientType();

		if (travelogixClientType != null)
		{
			final Map<String, String> queryParams = new HashMap<String, String>();
			queryParams.put("clientType", travelogixClientType.getPk().getLongValueAsString());
			final List<B2CRegistrationConfigModel> b2CRegistrationConfig = flexibleSearchService
					.<B2CRegistrationConfigModel> search(B2CRREGISTRATIONCONFIG_QUERY, queryParams).getResult();
			if (b2CRegistrationConfig != null && b2CRegistrationConfig.size() != 0)
			{
				return b2CRegistrationConfig.get(0);
			}
			else
			{
				return null;
			}
		}
		else
		{
			return null;
		}
	}

	@Override
	public String getActivationRandomCode(final String email)
	{
		final CustomerModel customer = getUserService().getUserForUID(email, CustomerModel.class);
		if (customer != null)
		{
			return customer.getActivationRandomCode();
		}
		else
		{
			return null;
		}
	}

	@Override
	public void addTraveller(final TravellerModel travellerModel)
	{
		validateParameterNotNullStandardMessage("travellerModel", travellerModel);
		final CustomerModel customerModel = (CustomerModel) getUserService().getCurrentUser();

		validateParameterNotNullStandardMessage("customerModel", customerModel);
		final Set<TravellerModel> travellers = new HashSet<TravellerModel>(customerModel.getTravellers());

		travellers.add(travellerModel);
		customerModel.setTravellers(travellers);
		getModelService().save(customerModel);
	}

	@Override
	public void deleteTraveller(final String firstName, final String middleName, final String lastName)
	{
		validateParameterNotNullStandardMessage("firstName", firstName);
		validateParameterNotNullStandardMessage("lastName", lastName);
		final CustomerModel customerModel = (CustomerModel) getUserService().getCurrentUser();

		validateParameterNotNullStandardMessage("customerModel", customerModel);
		final Set<TravellerModel> set = new HashSet<TravellerModel>(customerModel.getTravellers());

		for (final TravellerModel travellerModel : set)
		{
			if (StringUtils.equalsIgnoreCase(firstName, travellerModel.getFirstName())
					&& StringUtils.equalsIgnoreCase(middleName, travellerModel.getMiddleName())
					&& StringUtils.equalsIgnoreCase(lastName, travellerModel.getLastName()))
			{
				if (travellerModel.getPhoto() != null)
				{
					getModelService().remove(travellerModel.getPhoto());
				}
				if (travellerModel.getAddress() != null)
				{
					getModelService().remove(travellerModel.getAddress());
				}
				if (CollectionUtils.isNotEmpty(travellerModel.getVisaInfos()))
				{
					getModelService().removeAll(travellerModel.getVisaInfos());
				}
				getModelService().remove(travellerModel);
				getModelService().refresh(customerModel);
				break;
			}
		}
	}

	@Override
	public void updateTraveller(final TravellerModel travellerModel)
	{
		validateParameterNotNullStandardMessage("travellerModel", travellerModel);

		if (travellerModel.getAddress() != null)
		{
			getModelService().save(travellerModel.getAddress());
		}
		getModelService().save(travellerModel);
	}

	@Override
	public TravellerModel getTraveller(final String firstName, final String middleName, final String lastName)
	{
		validateParameterNotNullStandardMessage("firstName", firstName);
		validateParameterNotNullStandardMessage("lastName", lastName);

		final CustomerModel customerModel = (CustomerModel) getUserService().getCurrentUser();
		validateParameterNotNullStandardMessage("customerModel", customerModel);

		final Set<TravellerModel> set = new HashSet<TravellerModel>(customerModel.getTravellers());

		for (final TravellerModel travellerModel : set)
		{
			if (StringUtils.equalsIgnoreCase(firstName, travellerModel.getFirstName())
					&& StringUtils.equalsIgnoreCase(middleName, travellerModel.getMiddleName())
					&& StringUtils.equalsIgnoreCase(lastName, travellerModel.getLastName()))
			{
				return travellerModel;
			}
		}
		return null;
	}

	@Override
	public String processEnableAccount(final CustomerModel customerModel)
	{
		validateParameterNotNullStandardMessage("customerModel", customerModel);
		final long timeStamp = getTokenValiditySeconds() > 0L ? new Date().getTime() : 0L;
		final SecureToken data = new SecureToken(customerModel.getUid(), timeStamp);
		final String token = getSecureTokenService().encryptData(data);
		customerModel.setToken(token);
		getModelService().save(customerModel);
		return token;
	}

	@Override
	public AbstractCommerceUserEvent initializeEvent(final AbstractCommerceUserEvent event, final CustomerModel customerModel)
	{
		event.setBaseStore(getBaseStoreService().getCurrentBaseStore());
		event.setSite(getBaseSiteService().getCurrentBaseSite());
		event.setCustomer(customerModel);
		event.setLanguage(getCommonI18NService().getCurrentLanguage());
		event.setCurrency(getCommonI18NService().getCurrentCurrency());
		return event;
	}

	@Override
	public void register(final CustomerModel customerModel, final String password) throws DuplicateUidException
	{
		registerCustomer(customerModel, password);
	}
}
