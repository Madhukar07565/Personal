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

import com.cnk.travelogix.presales.core.service.LeadService;
import com.cnk.travelogix.presales.model.LeadModel;


/**
 * Generates code using keyGenerator and set into leadId attribute.
 */
public class DefaultLeadService implements LeadService
{
	private static final Logger LOG = Logger.getLogger(DefaultLeadService.class);

	private KeyGenerator keyGenerator;

	@Override
	public void generateLeadId(final LeadModel leadModel)
	{
		if (leadModel.getLeadId() == null)
		{
			leadModel.setLeadId("LEAD" + keyGenerator.generate());
			LOG.debug("Set new code for Lead Model -" + leadModel.getLeadId());
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
