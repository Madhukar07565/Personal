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

import com.cnk.travelogix.client.config.core.document.model.DocumentManagementModel;
import com.cnk.travelogix.client.config.services.DocumentManagementService;


/**
 * Generates code using keyGenerator and set into documentId attribute.
 */
public class DefaultDocumentManagementService implements DocumentManagementService
{
	private final Logger LOG = Logger.getLogger(DefaultDocumentManagementService.class);

	private KeyGenerator keyGenerator;

	@Override
	public void generateDocumentId(final DocumentManagementModel documentManagementModel)
	{
		if (documentManagementModel.getDocumentId() == null)
		{
			documentManagementModel.setDocumentId("DOC" + keyGenerator.generate().toString());
			LOG.debug("Set new code for DocumentManagement Model -" + documentManagementModel.getDocumentId());
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
