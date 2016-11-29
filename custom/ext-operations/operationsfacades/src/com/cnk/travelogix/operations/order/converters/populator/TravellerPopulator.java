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
package com.cnk.travelogix.operations.order.converters.populator;

import de.hybris.platform.commercefacades.product.data.ImageData;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.TitleModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import javax.annotation.Resource;

import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.cart.data.TravellerData;
import com.cnk.travelogix.common.core.cart.data.VisaInfoData;
import com.cnk.travelogix.common.core.model.TravellerModel;
import com.cnk.travelogix.common.core.model.VisaInfoModel;


/**
 * @author C5244544
 */
public class TravellerPopulator implements Populator<TravellerModel, TravellerData>
{

	@Resource
	private Converter<AddressModel, AddressData> addressConverter;
	@Resource
	private Converter<VisaInfoModel, VisaInfoData> visaInfoConverter;
	@Resource
	private Converter<MediaModel, ImageData> imageConverter;

	@Override
	public void populate(final TravellerModel source, final TravellerData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");

		final TitleModel title = source.getTitle();
		if (title != null)
		{
			target.setTitle(title.getCode());
			target.setTitleName(title.getName());
		}
		target.setLastName(source.getLastName());
		target.setFirstName(source.getFirstName());
		target.setDateOfBirth(source.getDateOfBirth());
		if(source.getPhoto()!=null)
		{
		target.setPhoto(imageConverter.convert(source.getPhoto()));
		}
		// Contact data
		target.setEmail(source.getEmail());
		target.setMobileNumber(source.getMobileNumber());
		if(source.getAddress()!=null)
		{
		target.setAddress(addressConverter.convert(source.getAddress()));
		}
		// Travel Documents
		target.setPassportNumber(source.getPassportNumber());
		//target.setIssueCountry(source.getIssueCountry());
		target.setPassportExpDate(source.getPassportExpDate());
		if(source.getVisaInfos()!=null)
		{
		target.setVisaInfos(visaInfoConverter.convertAll(source.getVisaInfos()));
		} 
	}
}
