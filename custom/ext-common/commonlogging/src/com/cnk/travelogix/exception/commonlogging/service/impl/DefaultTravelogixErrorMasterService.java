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
package com.cnk.travelogix.exception.commonlogging.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.exception.commonlogging.TravelogixErrorMasterService;
import com.cnk.travelogix.exception.commonlogging.customexception.UnknownException;
import com.cnk.travelogix.exception.commonlogging.daos.TravelogixErrorMasterDAO;
import com.cnk.travelogix.exception.commonlogging.errorlog.model.TravelogixErrorMasterModel;


public class DefaultTravelogixErrorMasterService implements TravelogixErrorMasterService
{
	private TravelogixErrorMasterDAO travelogixErrorMasterDAO;
	Logger logger = Logger.getLogger(DefaultTravelogixErrorMasterService.class);

	/**
	 * Gets all TravelogixErrorMasters by delegating to {@link TravelogixErrorMasterDAO#findTravelogixErrorMasters()}.
	 */
	@Override
	public List<TravelogixErrorMasterModel> getTravelogixErrorMasters()
	{
		return travelogixErrorMasterDAO.findTravelogixErrorMasters();
	}

	/**
	 * Gets all TravelogixErrorMasters for given code by delegating to
	 * {@link TravelogixErrorMasterDAO#findTravelogixErrorMastersByCode(String)} and then assuring uniqueness of result.
	 */
	@Override
	public TravelogixErrorMasterModel getTravelogixErrorMasterForCode(final String code)
			throws AmbiguousIdentifierException, UnknownException
	{
		final List<TravelogixErrorMasterModel> result = travelogixErrorMasterDAO.findTravelogixErrorMasterByCode(code);
		if (result.isEmpty())
		{
			//logger.info("TravelogixErrorMaster with code '" + code + "' not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException(
					"TravelogixErrorMaster code '" + code + "' is not unique, " + result.size() + " TravelogixErrorMasters found!");
		}
		return result.get(0);
	}

	@Required
	public void setTravelogixErrorMasterDAO(final TravelogixErrorMasterDAO TravelogixErrorMasterDAO)
	{
		this.travelogixErrorMasterDAO = TravelogixErrorMasterDAO;
	}
}
