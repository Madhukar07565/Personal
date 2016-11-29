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
package com.cnk.travelogix.b2c.facades.customer.converters.populator;

import de.hybris.platform.commercefacades.user.data.ProfileData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;


/**
 *
 */
public class ProfileReversePopulator implements Populator<ProfileData, CustomerModel>
{

	@Override
	public void populate(final ProfileData source, final CustomerModel target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");

		if ("".equals(source.getMiddleName().trim()))
		{
			target.setName(source.getFirstName().trim() + ", " + source.getLastName().trim());
		}
		else
		{
			target.setName(source.getFirstName().trim() + ", " + source.getMiddleName().trim() + ", " + source.getLastName().trim());
		}

		final List<String> contactMobiles = new ArrayList<>();
		for (int i = 0; i < source.getAreaCode().size(); i++)
		{
			if (source.getAreaCode().get(i) != "")
			{
				final String combinedMobileNumber = source.getAreaCode().get(i) + " " + source.getMobileNumber().get(i);
				if (!contactMobiles.contains(combinedMobileNumber))
				{
					contactMobiles.add(combinedMobileNumber);
				}
			}
		}
		target.setContactMobiles(contactMobiles);
		target.setDashboardEmail(source.getEmailId());
	}
}
