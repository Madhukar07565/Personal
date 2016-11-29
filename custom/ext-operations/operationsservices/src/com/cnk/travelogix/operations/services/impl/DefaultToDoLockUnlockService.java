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

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.operations.doas.ToDoTaskDao;
import com.cnk.travelogix.operations.services.ToDoLockUnlockService;


/**
 *
 */
public class DefaultToDoLockUnlockService implements ToDoLockUnlockService<ItemModel>
{

	private static final Logger LOG = Logger.getLogger(DefaultToDoLockUnlockService.class);
	private UserService userService;
	private ToDoTaskDao toDoTaskDao;
	@Resource(name = "modelService")
	private ModelService modelService;

	/**
	 * @return the toDoTaskdao
	 */
	public ToDoTaskDao getToDoTaskDao()
	{
		return toDoTaskDao;
	}

	/**
	 * @param toDoTaskDao
	 *           the toDoTaskdao to set
	 */
	public void setToDoTaskDao(final ToDoTaskDao toDoTaskDao)
	{
		this.toDoTaskDao = toDoTaskDao;
	}


	/**
	 * @return the userService
	 */
	public UserService getUserService()
	{
		return userService;
	}

	/**
	 * @param userService
	 *           the userService to set
	 */
	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}

	@Override
	public void lock(final ItemModel object, final UserModel user)
	{
		object.setProperty("lockedBy", user);
		modelService.save(object);
	}

	@Override
	public void unlock(final ItemModel object, final UserModel user)
	{

		/*
		 * if (object.getProperty("lockedBy") != null && user.getUid().equals(((UserModel)
		 * object.getProperty("lockedBy")).getUid())) { object.setProperty("lockedBy", null); modelService.save(object); }
		 */
		object.setProperty("lockedBy", null);
		modelService.save(object);
	}

	@Override
	public boolean canLock(final ItemModel object)
	{
		return null == object.getProperty("lockedBy");
	}

	@Override
	public boolean canUnlock(final ItemModel object, final UserModel user)
	{
		return object.getProperty("lockedBy") != null && object.getProperty("lockedBy").equals(user);
	}
}
