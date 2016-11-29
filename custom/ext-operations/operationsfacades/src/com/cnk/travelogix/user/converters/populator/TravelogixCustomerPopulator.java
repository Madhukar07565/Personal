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
package com.cnk.travelogix.user.converters.populator;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.AbstractContactInfoModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.PhoneContactInfoModel;
 

/**
 * This populator is used for populate additional required field form CustomerModel into CustomerData
 *
 * @author C5244543 (Shivraj)
 */
public class TravelogixCustomerPopulator extends CustomerPopulator
{
	//
	@Override
	public void populate(final CustomerModel source, final CustomerData target)
	{
		super.populate(source, target);
		final String phoneNumber = getCustomerPhoneNumber(source);
		target.setContactNumber(phoneNumber);
		//target.setRemarks(source.getRemarks());

		//
	}

	public String getCustomerPhoneNumber(final CustomerModel source)
	{
		String phone = "";
		if (source != null && source.getContactInfos() != null && source.getContactInfos().size() > 0)
		{
			for (final AbstractContactInfoModel contactInfoModel : source.getContactInfos())
			{
				if (contactInfoModel instanceof PhoneContactInfoModel)
				{
					final PhoneContactInfoModel phoneContactInfoModel = (PhoneContactInfoModel) contactInfoModel;
					phone = phoneContactInfoModel.getPhoneNumber();
				}
			}
		}
		return phone;
	}
}
