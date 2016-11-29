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

import com.cnk.travelogix.presales.core.service.ChecklistService;
import com.cnk.travelogix.presales.model.ChecklistModel;


/**
 * Generates code using key generator and sets the code into implementationChecklistId
 */
public class DefaultChecklistService implements ChecklistService
{
	private KeyGenerator keyGenerator;

	@Override
	public void generateImplementationChecklistId(final ChecklistModel checklistModel)
	{
		if (checklistModel.getImplementationChecklistId() == null)
		{
			checklistModel.setImplementationChecklistId(keyGenerator.generate().toString());
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
