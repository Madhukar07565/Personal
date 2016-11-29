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
package com.cnk.travelogix.core.flightview.facade.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.core.flightview.client.FlightViewRestClient;
import com.cnk.travelogix.core.flightview.datamodels.FlightRegisterRequest;
import com.cnk.travelogix.core.flightview.datamodels.FlightRegisterResponse;
import com.cnk.travelogix.core.flightview.datamodels.UpdateDeliverUrlRequest;
import com.cnk.travelogix.core.flightview.datamodels.UpdateDeliverUrlResponse;
import com.cnk.travelogix.core.flightview.facade.FlightViewFacade;
import com.cnk.travelogix.core.flightview.fnbclient.dto.FlightViewUpdateDeliverUrlResponse;

/**
 * @author I313619
 */
public class FlightViewFacadeImpl implements FlightViewFacade {

	private static final Logger LOG = LoggerFactory
			.getLogger(FlightViewFacadeImpl.class);

	private static final String SUCCESS = "false";
	private static final String ERROR = "Error Occured";

	@Autowired
	private FlightViewRestClient flightViewRestClient;

	@Override
	public UpdateDeliverUrlResponse updateDeliverUrl(
			UpdateDeliverUrlRequest updateDeliverUrlRequest) {
		UpdateDeliverUrlResponse updateDeliverUrlResponse = new UpdateDeliverUrlResponse();
		try {
			FlightViewUpdateDeliverUrlResponse flightViewUpdateDeliverUrlResponse = flightViewRestClient
					.updateDeliverUrl(updateDeliverUrlRequest.getDeliveryUrl());
			updateDeliverUrlResponse
					.setSuccess(flightViewUpdateDeliverUrlResponse.getSuccess());
			updateDeliverUrlResponse
					.setError(flightViewUpdateDeliverUrlResponse.getError());
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			updateDeliverUrlResponse.setSuccess(SUCCESS);
			updateDeliverUrlResponse.setError(ERROR);
		}
		return updateDeliverUrlResponse;
	}

	@Override
	public FlightRegisterResponse registerFlight(
			FlightRegisterRequest flightRegisterRequest) {
		FlightRegisterResponse reponse = new FlightRegisterResponse();
		try {
			com.cnk.travelogix.core.flightview.fnbclient.dto.FlightRegisterResponse flightRegisterResponse = flightViewRestClient
					.registerFlight(flightRegisterRequest);
			reponse.setSuccess(flightRegisterResponse.getSuccess());
			reponse.setError(flightRegisterResponse.getError());
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			reponse.setSuccess(SUCCESS);
			reponse.setError(ERROR);
		}
		return reponse;
	}
}
