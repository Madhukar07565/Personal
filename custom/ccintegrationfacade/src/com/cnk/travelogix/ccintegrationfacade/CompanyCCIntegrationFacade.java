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
package com.cnk.travelogix.ccintegrationfacade;

import de.hybris.platform.catalog.model.CompanyModel;

import com.cnk.travelogix.ccintegrationfacade.exception.CCIntegrationException;


// TODO: Auto-generated Javadoc
/**
 * This is common interface for all the Company Integration.
 */
public interface CompanyCCIntegrationFacade
{

	/**
	 * Creates the company account.
	 *
	 * @param pCompanyModel
	 *           the company model
	 * @throws CCIntegrationException
	 *            the CC integration exception
	 */
	public void createCompanyAccount(final CompanyModel pCompanyModel) throws CCIntegrationException;
}