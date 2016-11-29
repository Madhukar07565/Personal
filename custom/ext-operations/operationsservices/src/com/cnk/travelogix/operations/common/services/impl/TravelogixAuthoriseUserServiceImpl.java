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
package com.cnk.travelogix.operations.common.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.operations.common.services.TravelogixAuthoriseUserService;

import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.user.UserService;


/**
 * This is implementation class of TravelogixAuthoriseUserService interface.
 *
 * @author C5244543
 */
public class TravelogixAuthoriseUserServiceImpl implements TravelogixAuthoriseUserService
{
	@Autowired
	private UserService userService;

	@Override
	public boolean isCreator(final String userGroup_Uid)
	{
		boolean isCreator = false;
		final UserModel curentUser = userService.getCurrentUser();
		if (curentUser instanceof EmployeeModel)
		{
			final EmployeeModel employee = (EmployeeModel) curentUser;
			final UserGroupModel userGroup = userService.getUserGroupForUID(userGroup_Uid);
			if (null != employee.getGroups() && employee.getGroups().contains(userGroup))
			{
				isCreator = true;
			}
		}
		return isCreator;
	}

	@Override
	public boolean isApprover(final String userGroup_Uid)
	{
		boolean isApprover = false;
		final UserModel curentUser = userService.getCurrentUser();
		if (curentUser instanceof EmployeeModel)
		{
			final EmployeeModel employee = (EmployeeModel) curentUser;
			final UserGroupModel userGroup = userService.getUserGroupForUID(userGroup_Uid);
			if (null != employee.getGroups() && employee.getGroups().contains(userGroup))
			{
				isApprover = true;
			}
		}
		return isApprover;
	}
}
