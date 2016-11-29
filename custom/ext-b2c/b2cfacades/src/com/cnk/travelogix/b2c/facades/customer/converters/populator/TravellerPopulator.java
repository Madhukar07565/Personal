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

import de.hybris.platform.commercefacades.product.data.ImageData;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.TitleModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.cart.data.TravellerData;
import com.cnk.travelogix.common.core.cart.data.VisaInfoData;
import com.cnk.travelogix.common.core.model.TravellerModel;
import com.cnk.travelogix.common.core.model.VisaInfoModel;


public class TravellerPopulator implements Populator<TravellerModel, TravellerData>
{

	@Resource
	private Converter<AddressModel, AddressData> travAddressConverter;
	@Resource
	private Converter<VisaInfoModel, VisaInfoData> visaInfoConverter;
	@Resource
	PhotoPopulator photoPopulator;

	@Override
	public void populate(final TravellerModel source, final TravellerData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");

		populateTitle(source, target);
		target.setLastName(source.getLastName());
		target.setFirstName(source.getFirstName());
		target.setMiddleName(source.getMiddleName());
		target.setDateOfBirth(source.getDateOfBirth());
		if (source.getPhoto() != null)
		{
			final ImageData imageData = new ImageData();
			photoPopulator.populate(source.getPhoto(), imageData);
			target.setPhoto(imageData);
		}

		// Contact data
		target.setEmail(source.getEmail());
		target.setMobileNumber(source.getMobileNumber());
		if (source.getAddress() != null)
		{
			target.setAddress(travAddressConverter.convert(source.getAddress()));
		}

		// Travel Documents
		target.setPassportNumber(source.getPassportNumber());
		populateIssueCountry(source, target);

		target.setPassportExpDate(source.getPassportExpDate());
		if (CollectionUtils.isNotEmpty(source.getVisaInfos()))
		{
			target.setVisaInfos(visaInfoConverter.convertAll(source.getVisaInfos()));
		}
	}

	private void populateTitle(final TravellerModel source, final TravellerData target)
	{
		final TitleModel title = source.getTitle();
		if (title != null)
		{
			target.setTitle(title.getCode());
			target.setTitleName(title.getName());
		}
	}

	private void populateIssueCountry(final TravellerModel source, final TravellerData target)
	{
		final CountryModel countryModel = source.getIssueCountry();
		if (countryModel != null)
		{
			final CountryData countryData = new CountryData();
			countryData.setIsocode(countryModel.getIsocode());
			countryData.setName(countryModel.getName());
			target.setIssueCountry(countryData);
		}
	}
}
