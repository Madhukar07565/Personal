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
package com.cnk.travelogix.exception.commonlogging.daos;

/**
 *
 */
import java.util.List;

import com.cnk.travelogix.exception.commonlogging.errorlog.model.TravelogixErrorMasterModel;


/**
 * This interface belongs to the Source Code Trail documented at https://wiki.hybris.com/display/pm/Source+Code+Tutorial
 * An interface for the TravelogixErrorMaster DAO. This incorporates the CRUD functionality we require for our DAO tests
 * to pass.
 */
public interface TravelogixErrorMasterDAO
{
	/**
	 * Return a list of TravelogixErrorMaster models that are currently persisted. If none are found an empty list is
	 * returned.
	 *
	 * @return all TravelogixErrorMasters of system
	 */
	List<TravelogixErrorMasterModel> findTravelogixErrorMasters();

	/**
	 * Finds all TravelogixErrorMasters with given code. If none is found, an empty list will be returned.
	 *
	 * @param code
	 *           the code to search for TravelogixErrorMasters
	 * @return All TravelogixErrorMasters with the given code.
	 */
	List<TravelogixErrorMasterModel> findTravelogixErrorMasterByCode(String code);

	TravelogixErrorMasterModel findTravelogixErrorMasterByCodeFromSupplier(String code);
}
