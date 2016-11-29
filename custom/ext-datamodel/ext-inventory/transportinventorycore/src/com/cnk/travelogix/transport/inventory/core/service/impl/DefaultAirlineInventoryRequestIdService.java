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
package com.cnk.travelogix.transport.inventory.core.service.impl;

import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.transport.inventory.core.service.AirlineInventoryRequestIdService;
import com.cnk.travelogix.transportinventory.core.model.AirlineInventoryRequestModel;


/**
 *
 */
public class DefaultAirlineInventoryRequestIdService implements AirlineInventoryRequestIdService
{
	private static final Logger LOG = Logger.getLogger(DefaultAirlineInventoryRequestIdService.class.getName());
	private KeyGenerator keyGenerator;

	@Override
	public void generateAirlineInventoryRequestId(final AirlineInventoryRequestModel airlinemodel)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside generateAirlineInventoryRequestId() of  DefaultAirlineInventoryRequestIdService");
		}
		StringBuffer key = new StringBuffer("INVREQ- ");
		if (airlinemodel.getCode() == null || StringUtils.isEmpty(airlinemodel.getCode()))
		{
			key = key.append(keyGenerator.generate().toString());
			airlinemodel.setCode(key.toString());
		}
		if (LOG.isDebugEnabled())
		{
			LOG.info("End generateAirlineInventoryRequestId() of  DefaultAirlineInventoryRequestIdService");
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
