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
package com.cnk.travelogix.product.transport.masters.core.services;

import com.cnk.travelogix.product.transport.masters.core.model.AirRouteModel;


/**
 * Route ID
 */
public interface RouteIdService
{
	/**
	 * this method will generate unique route id
	 *
	 * @param airRouteModel
	 */
	public void generateRouteId(AirRouteModel airRouteModel);
}
