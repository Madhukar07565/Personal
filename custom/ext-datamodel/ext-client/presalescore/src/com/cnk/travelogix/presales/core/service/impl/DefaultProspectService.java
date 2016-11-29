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
package com.cnk.travelogix.presales.core.service.impl;

import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.apache.log4j.Logger;

import com.cnk.travelogix.presales.core.service.ProspectService;
import com.cnk.travelogix.presales.model.ProspectModel;


/**
 * Generates code using keyGenerator and set into prospectId attribute.
 */
public class DefaultProspectService implements ProspectService
{
	private static final Logger LOG = Logger.getLogger(DefaultProspectService.class);

	private KeyGenerator keyGenerator;

	@Override
	public void generateProspectId(final ProspectModel prospectModel)
	{
		if (prospectModel.getProspectId() == null)
		{
			prospectModel.setProspectId("PROS" + keyGenerator.generate());
			LOG.debug("Set new code for Prospect Model -" + prospectModel.getProspectId());
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
