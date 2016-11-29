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
package com.cnk.travelogix.ccintegrationfacade.populators;

import de.hybris.platform.catalog.model.CompanyModel;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccount;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.TaxInfo;


/**
 * Populating subscriber account fields with Company fields
 */
public class CompanySubscriberAccountPopulator implements Populator<CompanyModel, SubscriberAccount>
{

	/**
	 * Populate.
	 *
	 * @param source
	 *           the source
	 * @param target
	 *           the target
	 * @throws ConversionException
	 *            the conversion exception
	 */
	@Override
	public void populate(final CompanyModel source, final SubscriberAccount target) throws ConversionException
	{
		target.setId(source.getUid());
		target.setSubscriberId(source.getUid());
		target.setDescription(source.getName());
		target.setCurrencyCode(source.getCurrency().getIsocode());
		target.setNoTax("");
		target.setTax(new TaxInfo());
	}

}
