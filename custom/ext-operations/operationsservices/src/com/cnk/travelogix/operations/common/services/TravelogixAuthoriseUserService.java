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
package com.cnk.travelogix.operations.common.services;

/**
 * This service interface is used for checking authorize user or not.
 *
 * @author C5244543
 */
public interface TravelogixAuthoriseUserService
{
	boolean isCreator(String userGroup_Uid);

	boolean isApprover(String userGroup_Uid);
}
