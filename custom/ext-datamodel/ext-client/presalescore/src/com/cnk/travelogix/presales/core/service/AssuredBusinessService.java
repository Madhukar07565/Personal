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
package com.cnk.travelogix.presales.core.service;

import com.cnk.travelogix.presales.model.AssuredBusinessModel;


/**
 * Interface having abstract methods
 */
public interface AssuredBusinessService
{
	/**
	 * @param assuredBusinessModel
	 */
	public void generateAssuredBusinessId(AssuredBusinessModel assuredBusinessModel);

	/**
	 * @param assuredBusinessModel
	 * @return true or false
	 */
	public boolean validateToDate(AssuredBusinessModel assuredBusinessModel);
}
