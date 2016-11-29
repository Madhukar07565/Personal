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

import de.hybris.platform.commercefacades.user.converters.populator.CountryPopulator;
import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.core.model.c2l.CountryModel;


/**
 *
 */
public class B2cCountryPopulator extends CountryPopulator
{

	@Override
	public void populate(final CountryModel source, final CountryData target)
	{
		super.populate(source, target);
		target.setCountryCode(source.getCountryCode());
	}
}
