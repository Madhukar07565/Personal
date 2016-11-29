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
package com.cnk.travelogix.core.flightview.facade;

import com.cnk.travelogix.core.flightview.datamodels.FlightRegisterRequest;
import com.cnk.travelogix.core.flightview.datamodels.FlightRegisterResponse;
import com.cnk.travelogix.core.flightview.datamodels.UpdateDeliverUrlRequest;
import com.cnk.travelogix.core.flightview.datamodels.UpdateDeliverUrlResponse;

/**
 * @author I313619
 */
public interface FlightViewFacade {

	public UpdateDeliverUrlResponse updateDeliverUrl(
			final UpdateDeliverUrlRequest updateDeliverUrlRequest);

	public FlightRegisterResponse registerFlight(
			final FlightRegisterRequest flightRegisterRequest);

}
