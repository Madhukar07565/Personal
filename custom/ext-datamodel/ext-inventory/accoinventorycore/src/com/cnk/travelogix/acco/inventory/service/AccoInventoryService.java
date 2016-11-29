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
package com.cnk.travelogix.acco.inventory.service;

import com.cnk.travelogix.accoinventory.core.model.AccommodationInventoryRequestModel;


/**
 *
 */
public interface AccoInventoryService
{

	/**
	 * Generate unique id.
	 *
	 * @param pAccoInvReq
	 *           the acco inv req
	 */
	void generateUniqueId(final AccommodationInventoryRequestModel pAccoInvReq);
}
