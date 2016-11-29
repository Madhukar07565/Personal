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

import de.hybris.platform.commercefacades.user.converters.populator.AddressReversePopulator;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.HashSet;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.cart.data.TravellerData;
import com.cnk.travelogix.common.core.cart.data.VisaInfoData;
import com.cnk.travelogix.common.core.model.TravellerModel;
import com.cnk.travelogix.common.core.model.VisaInfoModel;


public class TravellerReversePopulator implements Populator<TravellerData, TravellerModel>
{
	@Resource
	private UserService userService;
	@Resource
	private AddressReversePopulator travAddressReversePopulator;
	@Resource
	private ModelService modelService;
	@Resource
	private Converter<VisaInfoData, VisaInfoModel> visaInfoReverseConverter;
	@Resource
	private CommonI18NService commonI18NService;
	@Resource
	private FlexibleSearchService flexibleSearchService;


	@Override
	public void populate(final TravellerData source, final TravellerModel target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");

		populateTitle(source, target);
		target.setLastName(StringUtils.trimToNull(source.getLastName()));
		target.setFirstName(StringUtils.trimToNull(source.getFirstName()));
		target.setMiddleName(StringUtils.trimToNull(source.getMiddleName()));
		target.setDateOfBirth(source.getDateOfBirth());

		if (source.getPhoto() != null)
		{
			final MediaModel icm = new MediaModel();
			icm.setCode(source.getPhoto().getCode());
			target.setPhoto(flexibleSearchService.getModelByExample(icm));
		}

		// Contact data
		target.setEmail(StringUtils.trimToNull(source.getEmail()));
		target.setMobileNumber(StringUtils.trimToNull(source.getMobileNumber()));
		populateAddress(source, target);

		// Travel Documents
		target.setPassportNumber(StringUtils.trimToNull(source.getPassportNumber()));
		populateIssueCountry(source, target);

		target.setPassportExpDate(source.getPassportExpDate());
		target.setVisaInfos(new HashSet(visaInfoReverseConverter.convertAll(source.getVisaInfos())));
	}

	private void populateTitle(final TravellerData source, final TravellerModel target)
	{
		if (StringUtils.isNotBlank(source.getTitle()))
		{
			target.setTitle(userService.getTitleForCode(source.getTitle()));
		}
		else
		{
			target.setTitle(null);
		}
	}

	private void populateAddress(final TravellerData source, final TravellerModel target)
	{
		if (target.getAddress() == null)
		{
			if (source.getAddress() != null)
			{
				final AddressModel address = modelService.create(AddressModel.class);
				travAddressReversePopulator.populate(source.getAddress(), address);
				address.setOwner(target);
				target.setAddress(address);
			}
		}
		else
		{
			travAddressReversePopulator.populate(source.getAddress(), target.getAddress());
		}
	}

	private void populateIssueCountry(final TravellerData source, final TravellerModel target)
	{
		if (source.getIssueCountry() != null)
		{
			final String isocode = source.getIssueCountry().getIsocode();
			if (StringUtils.isNotBlank(isocode))
			{
				final CountryModel countryModel = commonI18NService.getCountry(isocode);
				target.setIssueCountry(countryModel);
			}
		}
	}
}
