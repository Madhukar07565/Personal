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

import de.hybris.platform.b2b.model.B2BUserGroupModel;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.apache.log4j.Logger;

import com.cnk.travelogix.client.core.services.B2BUserGroupService;


/**
 *
 */
public class DefaultB2BUserGroupService implements B2BUserGroupService
{
	private final Logger LOG = Logger.getLogger(DefaultB2BUserGroupService.class);

	private KeyGenerator keyGenerator;

	@Override
	public void generateB2BUserGroupId(final B2BUserGroupModel b2bUserGroupModel)
	{
		// YTODO Auto-generated method stub

		if (b2bUserGroupModel.getUid() == null)
		{
			b2bUserGroupModel.setUid("CG_M_" + keyGenerator.generate().toString());
			LOG.debug("Id for CilentGroup is:" + b2bUserGroupModel.getUid());
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
