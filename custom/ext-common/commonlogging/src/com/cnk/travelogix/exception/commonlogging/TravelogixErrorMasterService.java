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
package com.cnk.travelogix.exception.commonlogging;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;

import java.util.List;

import com.cnk.travelogix.exception.commonlogging.customexception.UnknownException;
import com.cnk.travelogix.exception.commonlogging.errorlog.model.TravelogixErrorMasterModel;


public interface TravelogixErrorMasterService
{
	/**
	 * Gets all TravelogixErrorMasters of the system.
	 *
	 * @return all TravelogixErrorMasters of system
	 */
	List<TravelogixErrorMasterModel> getTravelogixErrorMasters();

	/**
	 * Gets the TravelogixErrorMaster for given code.
	 * 
	 * @throws UnknownException
	 *
	 * @throws de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException
	 *            in case more then one TravelogixErrorMaster for given code is found
	 * @throws de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException
	 *            in case no TravelogixErrorMaster for given code can be found
	 */
	TravelogixErrorMasterModel getTravelogixErrorMasterForCode(String code) throws AmbiguousIdentifierException, UnknownException;

}