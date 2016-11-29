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

import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.exception.commonlogging.TravelogixSupplierErrorService;
import com.cnk.travelogix.exception.commonlogging.daos.TravelogixErrorMasterDAO;
import com.cnk.travelogix.exception.commonlogging.errorlog.model.TravelogixErrorMasterModel;


/**
 *
 */
public class DefaultTravelogixSupplierErrorService implements TravelogixSupplierErrorService
{

	private TravelogixErrorMasterDAO travelogixErrorMasterDAO;

	@Override
	public TravelogixErrorMasterModel findTravelogixErrorMasterByCodeFromSupplier(final String code)
	{
		// YTODO Auto-generated method stub
		return travelogixErrorMasterDAO.findTravelogixErrorMasterByCodeFromSupplier(code);
	}

	@Required
	public void setTravelogixErrorMasterDAO(final TravelogixErrorMasterDAO TravelogixErrorMasterDAO)
	{
		this.travelogixErrorMasterDAO = TravelogixErrorMasterDAO;
	}
}
