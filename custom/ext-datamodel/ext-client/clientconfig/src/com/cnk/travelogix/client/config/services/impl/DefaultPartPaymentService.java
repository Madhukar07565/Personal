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
package com.cnk.travelogix.client.config.services.impl;

import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.apache.log4j.Logger;

import com.cnk.travelogix.client.config.core.partpayment.model.PartPaymentMasterConfigModel;
import com.cnk.travelogix.client.config.services.PartPaymentService;


/**
 * Generates id using keyGenerator and set into PartPymentId attribute.
 */
public class DefaultPartPaymentService implements PartPaymentService
{
	private static Logger LOG = Logger.getLogger(DefaultPartPaymentService.class);

	private KeyGenerator keyGenerator;

	@Override
	public void generatePartPaymentId(final PartPaymentMasterConfigModel partPaymentModel)
	{
		if (partPaymentModel.getPartPaymentId() == null)
		{
			partPaymentModel.setPartPaymentId("PPM" + keyGenerator.generate());
			LOG.debug("Generated PPM is -" + partPaymentModel.getPartPaymentId());
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
