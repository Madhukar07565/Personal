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
import com.cnk.travelogix.client.core.b2bunit.model.TravelogixB2BUnitModel;


/**
 * The Interface ClientCCIntegrationFacade.
 */

public interface ClientCCIntegrationFacade
{

	/**
	 * Creates the client account.
	 *
	 * @param pTravelogixB2BUnitModel
	 *           the travelogix B 2 B unit model
	 * @throws CCIntegrationException
	 *            the CC integration exception
	 */
	public void createClientAccount(final TravelogixB2BUnitModel pTravelogixB2BUnitModel) throws CCIntegrationException;
}
