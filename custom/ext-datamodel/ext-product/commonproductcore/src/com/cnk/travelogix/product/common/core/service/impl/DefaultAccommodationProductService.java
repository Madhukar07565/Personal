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
package com.cnk.travelogix.product.common.core.service.impl;

import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.product.common.core.model.AccommodationModel;
import com.cnk.travelogix.product.common.core.service.AccommodationProductService;


/**
 * Uses City and Name to generate code and set in Code attribute in Accommodation Model.
 */
public class DefaultAccommodationProductService implements AccommodationProductService
{
	private KeyGenerator keyGenerator;
	private static final Logger LOG = Logger.getLogger(DefaultAccommodationProductService.class);

	@Override
	public void generateCompanyProductId(final AccommodationModel accommodationModel)
	{
		String key = "";
		if (StringUtils.isNotEmpty(accommodationModel.getAddress().getCity().getName())
				&& StringUtils.isNotEmpty(accommodationModel.getName()))
		{
			String city = accommodationModel.getAddress().getCity().getName();
			city = city.substring(0, 3).replaceAll("\\s+", "");
			String name = accommodationModel.getName();
			name = name.substring(0, 3).replaceAll("\\s+", "");

			key = city.concat(name).concat(keyGenerator.generate().toString());
			accommodationModel.setCode(key);
			LOG.debug("Generated CommonproductId for Accomodation :" + accommodationModel.getCode());
		}
	}

	/**
	 * @return the keyGenerator
	 */
	public KeyGenerator getKeyGenerator()
	{
		return keyGenerator;
	}

	/**
	 * @param keyGenerator
	 *           the keyGenerator to set
	 */
	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}
}
