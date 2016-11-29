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

import de.hybris.platform.commercefacades.user.converters.populator.CustomerReversePopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import org.apache.commons.lang.BooleanUtils;


/**
 *
 */
public class B2cCustomerReversePopulator extends CustomerReversePopulator
{

	@Override
	public void populate(final CustomerData source, final CustomerModel target) throws ConversionException
	{
		super.populate(source, target);

		if (source.getCurrency() != null && !"0".equals(source.getCurrency().getIsocode()))
		{
			final String isocode = source.getCurrency().getIsocode();
			try
			{
				target.setSessionCurrency(getCommonI18NService().getCurrency(isocode));
			}
			catch (final UnknownIdentifierException e)
			{
				throw new ConversionException("No currency with the code " + isocode + " found.", e);
			}

		}
		if (source.getLanguage() != null && !"0".equals(source.getLanguage().getIsocode()))
		{
			final String isocode = source.getLanguage().getIsocode();
			try
			{
				target.setSessionLanguage(getCommonI18NService().getLanguage(isocode));
			}
			catch (final UnknownIdentifierException e)
			{
				throw new ConversionException("No language with the code " + isocode + " found.", e);
			}

		}
		if (source.getDefaultWebSite() != null && !"0".equals(source.getDefaultWebSite().getIsocode()))
		{
			final String isocode = source.getDefaultWebSite().getIsocode();
			try
			{
				target.setDefaultWebSite(getCommonI18NService().getCountry(isocode));
			}
			catch (final UnknownIdentifierException e)
			{
				throw new ConversionException("No country with the code " + isocode + " found.", e);
			}
		}
		target.setEmails(source.getEmails());
		target.setSubscribe(new Boolean(BooleanUtils.isTrue(source.getSubscribe())));
		target.setMobiles(source.getMobiles());
		target.setDefaultCountryCode(source.getDefaultCountryCode());
		target.setIsActive(new Boolean(source.isActive()));
	}

}
