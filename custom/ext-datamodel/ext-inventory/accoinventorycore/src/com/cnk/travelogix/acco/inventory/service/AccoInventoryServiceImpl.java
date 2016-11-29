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
package com.cnk.travelogix.acco.inventory.service;

import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.apache.commons.validator.GenericValidator;

import com.cnk.travelogix.accoinventory.core.model.AccommodationInventoryRequestModel;


// TODO: Auto-generated Javadoc
/**
 * The Class AccoInventoryServiceImpl.
 */
public class AccoInventoryServiceImpl implements AccoInventoryService
{

	/** The Constant LOGGER. */
	private static final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(AccoInventoryServiceImpl.class);

	/** The key generator. */
	private KeyGenerator keyGenerator;

	/**
	 * Generate unique id.
	 *
	 * @param pAccoInvReqModel
	 *           the acco inv req
	 */
	@Override
	public void generateUniqueId(final AccommodationInventoryRequestModel pAccoInvReqModel)
	{
		LOGGER.debug("AccoInventoryServiceImpl : generateUniqueId() : Entering.");

		StringBuffer key = new StringBuffer("INVREQ- ");
		if (pAccoInvReqModel.getCode() == null || GenericValidator.isBlankOrNull(pAccoInvReqModel.getCode()))
		{
			key = key.append(keyGenerator.generate().toString());
			pAccoInvReqModel.setCode(key.toString().trim());

			LOGGER.debug("AccoInventoryServiceImpl : generateUniqueId() : Code genereated : " + pAccoInvReqModel.getCode());
		}
		LOGGER.debug("AccoInventoryServiceImpl : generateUniqueId() : Exiting.");
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
