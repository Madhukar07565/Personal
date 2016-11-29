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


import com.cnk.travelogix.ccintegrationfacade.exception.CCIntegrationException;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


/**
 * This is common interface for all the Supplier Integration
 */
public interface SupplierCCIntegrationFacade
{
	/**
	 * Creates the supplier account.
	 *
	 * @param pSupplierModel
	 *           the supplier model
	 * @throws CCIntegrationException
	 *            the CC integration exception
	 */

	public void createSupplierAccount(final SupplierModel pSupplierModel) throws CCIntegrationException;
}
