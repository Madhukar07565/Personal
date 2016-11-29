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
package com.cnk.travelogix.b2b.facades.autocomplete.impl;

import de.hybris.platform.commercefacades.user.data.CustomerData;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.cnk.travelogix.b2b.facades.autocomplete.AutoCompleteFacade;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 *
 */
public class CustomerAutoCompleteFacade implements AutoCompleteFacade
{
	private static final Logger LOG = Logger.getLogger(CustomerAutoCompleteFacade.class);

	private final ObjectMapper mapper = new ObjectMapper();

	@Override
	public String getAutocompleteSuggestions(final String term, final int maximum)
	{
		List<CustomerData> customers = new ArrayList<CustomerData>();
		for (int i = 0; i < 20; i++)
		{
			final CustomerData customer = new CustomerData();
			customer.setName("name" + i);
			customer.setUid("uid" + i + "@sample.com");
			customer.setContactNumber("contact" + i);

			List<String> mobiles = new ArrayList<String>();
			mobiles.add(i + "1111111111");
			mobiles.add(i + "2222222222");
			customer.setMobiles(mobiles);

			List<String> emails = new ArrayList<String>();
			emails.add("email" + i + "1@sameple.com");
			emails.add("email" + i + "2@sameple.com");
			customer.setEmails(emails);

			customers.add(customer);
		}

		String result = "";
		try
		{
			result = mapper.writeValueAsString(customers.subList(0, maximum));
		}
		catch (JsonProcessingException e)
		{
			LOG.error("Error during parsing auto complete result", e);
		}

		return result;
	}

}
