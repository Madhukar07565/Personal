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
package com.cnk.travelogix.client.core.services.impl;

import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.apache.log4j.Logger;

import com.cnk.travelogix.client.core.mid.model.MerchantIdentificationDetailsModel;
import com.cnk.travelogix.client.core.services.MerchantIdentificationDetailService;


/**
 * Service class generates unique MIDNumber using keyGenerator
 */
public class DefaultMerchantIdentificationDetailService implements MerchantIdentificationDetailService
{
	private static final Logger LOG = Logger.getLogger(DefaultMerchantIdentificationDetailService.class);

	private KeyGenerator keyGenerator;

	@Override
	public void generateMIDNumber(final MerchantIdentificationDetailsModel merchantIdentificationDetailsModel)
	{
		if (merchantIdentificationDetailsModel.getMidNumber() == null)
		{
			final String mId = (String) keyGenerator.generate();
			merchantIdentificationDetailsModel.setMidNumber(Integer.valueOf(mId));
			LOG.debug("MIDNumber is is:" + merchantIdentificationDetailsModel.getMidNumber());
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
