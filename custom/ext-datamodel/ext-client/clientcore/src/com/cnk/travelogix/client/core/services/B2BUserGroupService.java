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
package com.cnk.travelogix.client.core.services;

import de.hybris.platform.b2b.model.B2BUserGroupModel;


/**
 *
 */
public interface B2BUserGroupService
{
	public void generateB2BUserGroupId(B2BUserGroupModel b2bUserGroupModel);
}