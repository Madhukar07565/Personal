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
package com.cnk.travelogix.core.flightview.client;

import com.cnk.travelogix.core.flightview.datamodels.FlightRegisterRequest;
import com.cnk.travelogix.core.flightview.fnbclient.dto.FlightRegisterResponse;
import com.cnk.travelogix.core.flightview.fnbclient.dto.FlightViewUpdateDeliverUrlResponse;

/**
 * @author I313619
 */
public interface FlightViewRestClient {

	public FlightViewUpdateDeliverUrlResponse updateDeliverUrl(
			final String deliverUrl);

	public FlightRegisterResponse registerFlight(
			final FlightRegisterRequest flightRegisterRequest);
}
