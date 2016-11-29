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
package com.cnk.travelogix.product.common.core.service;

import de.hybris.platform.core.model.user.AddressModel;


/**
 * To get Geo location for given Address.
 */
public interface GeoLocationFinderService
{
	/**
	 * GeoLocation (lat and lang) for given {@link AddressModel} and update address Model
	 *
	 * @param addressModel
	 */
	public void populateGeoLocation(AddressModel addressModel);
}
