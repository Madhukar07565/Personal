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
package com.cnk.travelogix.operations.services.impl;

import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.user.impl.DefaultUserService;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.operations.daos.OperationUserDao;
import com.cnk.travelogix.operations.services.OperationUserService;


/**
 *
 */
public class DefaultOperationUserService extends DefaultUserService implements OperationUserService
{

	private OperationUserDao operationUserDao;

	@Override
	public List<UserModel> getGroupMembers(final String groupId)
	{
		final UserGroupModel userGroupModel = getUserGroupForUID(groupId);
		final List<UserModel> userModel = new ArrayList<UserModel>();
		for (final EmployeeModel model : getOperationUserDao().findAllEmployee())
		{
			if (model.getAllGroups().contains(userGroupModel))
			{
				userModel.add(model);
			}
		}
		return userModel;
	}

	/**
	 * @return the operationUserDao
	 */
	public OperationUserDao getOperationUserDao()
	{
		return operationUserDao;
	}

	/**
	 * @param operationUserDao
	 *           the operationUserDao to set
	 */
	public void setOperationUserDao(final OperationUserDao operationUserDao)
	{
		this.operationUserDao = operationUserDao;
	}

}
