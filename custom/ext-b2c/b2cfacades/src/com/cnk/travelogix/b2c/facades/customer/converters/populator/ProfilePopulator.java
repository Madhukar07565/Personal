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

import org.apache.commons.lang.StringUtils;
import org.springframework.util.Assert;


/**
 *
 */
public class ProfilePopulator implements Populator<CustomerModel, ProfileData>
{

	private static final String SEPARATOR = ", ";

	@Override
	public void populate(final CustomerModel source, final ProfileData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");

		populateNames(source, target);
		target.setEmailId(source.getDashboardEmail());
		target.setLoginEmailId(source.getUid());
		final List<String> areaCodeList = new ArrayList<>();
		final List<String> mobileNumberList = new ArrayList<>();
		if (source.getContactMobiles() != null)
		{
			for (final String mobileNumber : source.getContactMobiles())
			{
				areaCodeList.add(mobileNumber.split(" ")[0]);
				mobileNumberList.add(mobileNumber.split(" ")[1]);
			}
		}
		target.setAreaCode(areaCodeList);
		target.setMobileNumber(mobileNumberList);
	}

	private void populateNames(final CustomerModel source, final ProfileData target)
	{
		target.setUserName(source.getName());

		if (StringUtils.isNotBlank(source.getName()))
		{
			final String[] names = source.getName().split(SEPARATOR);
			if (names.length >= 3)
			{
				target.setFirstName(names[0]);
				target.setLastName(names[names.length - 1]);
				target.setMiddleName(
						StringUtils.substringBetween(source.getName(), names[0] + SEPARATOR, SEPARATOR + names[names.length - 1]));
			}
			else if (names.length == 2)
			{
				target.setFirstName(names[0]);
				target.setLastName(names[1]);
			}
			else if (names.length == 1)
			{
				target.setFirstName(names[0]);
			}
		}
	}
}
