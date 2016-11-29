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
package com.cnk.travelogix.commons.error.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cnk.travelogix.commons.error.Error.ErrorOrigin;
import com.cnk.travelogix.exception.commonlogging.TravelogixErrorMasterService;
import com.cnk.travelogix.exception.commonlogging.customexception.SupplierException;
import com.cnk.travelogix.exception.commonlogging.customexception.TravelogixException;
import com.cnk.travelogix.exception.commonlogging.errorlog.model.TravelogixErrorMasterModel;


/**
 *
 */
public class DefaultErrorHandler implements ErrorHandler
{

	private TravelogixErrorMasterService errorMasterService;
	private static final Logger LOG = LoggerFactory.getLogger(DefaultErrorHandler.class);

	@Override
	public com.cnk.travelogix.commons.error.Error handleError(final com.cnk.travelogix.commons.error.Error error)
	{
		try
		{
			throwException(error);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
		return analyzeError(error);
	}

	private com.cnk.travelogix.commons.error.Error analyzeError(final com.cnk.travelogix.commons.error.Error error)
	{
		try
		{
			final TravelogixErrorMasterModel errorModel = getErrorMasterService().getTravelogixErrorMasterForCode(error.getCode());

			error.setCode(errorModel.getErrorCode());
			error.setMessage(errorModel.getPresentationMsg());
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
		return error;
	}

	private void throwException(final com.cnk.travelogix.commons.error.Error error) throws Exception
	{
		if (error.getOriginatingFrom() != null && ErrorOrigin.SUPPLIERS.equals(error.getOriginatingFrom()))
		{
			throw new SupplierException(error.getCode(), error.getMessage());
		}
		throw new TravelogixException(error.getCode(), error.getMessage());
	}

	public TravelogixErrorMasterService getErrorMasterService()
	{
		return errorMasterService;
	}

	public void setErrorMasterService(final TravelogixErrorMasterService errorMasterService)
	{
		this.errorMasterService = errorMasterService;
	}
}
