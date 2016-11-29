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
package com.cnk.travelogix.operations.services;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ModelService;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.cnk.travelogix.operations.services.impl.TravelogixLockUnlockService;


/**
 * Test case for Lock Unlock Service
 *
 * @author C5244543
 */
@UnitTest
public class TravelogixLockUnlockServiceTest
{
	@Mock
	private ModelService mockModelService;

	@InjectMocks
	private final TravelogixLockUnlockService lockUnlockService = new TravelogixLockUnlockService();

	private ItemModel object;
	private EmployeeModel user;

	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
		object = Mockito.mock(ItemModel.class);
		user = Mockito.mock(EmployeeModel.class);
	}

	/**
	 * This test case to test lock method.
	 */
	@Test
	public void lockTest()
	{
		lockUnlockService.lock(object, user);
		verify(mockModelService).save(object);
	}

	/**
	 * This test case to test unlock method.
	 */

	@Test
	public void unlockWhenLockedByNullTest()
	{
		given(mockModelService.create(ItemModel.class)).willReturn(object);
		given(mockModelService.create(EmployeeModel.class)).willReturn(user);
		given(object.getProperty("lockedBy")).willReturn(null);
		//	object = Mockito.mock(ItemModel.class);
		lockUnlockService.unlock(object, user);

		Assert.assertNull(object.getProperty("lockedBy"));
		//verify(mockModelService).save(object);
	}

	@Test
	public void unlockWhenUIDNullTest()
	{
		final UserModel userModel = Mockito.mock(UserModel.class);
		given(mockModelService.create(UserModel.class)).willReturn(object);
		given(mockModelService.create(EmployeeModel.class)).willReturn(user);
		given(object.getProperty("lockedBy")).willReturn(Boolean.TRUE);
		given(user.getUid()).willReturn("admin");
		given(object.getProperty("lockedBy")).willReturn(userModel);

		lockUnlockService.unlock(object, user);
		Assert.assertNotEquals(user.getUid(), ((UserModel) object.getProperty("lockedBy")).getUid());
	}

	/**
	 * This test case to test canlock method.
	 */
	@Test
	public void canLockTest()
	{
		Assert.assertEquals(Boolean.valueOf(lockUnlockService.canLock(object)), Boolean.TRUE);
	}

	/**
	 * This test case to test canUnlock method.
	 */
	@Test
	public void canUnlockTest()
	{
		Assert.assertEquals(Boolean.valueOf(lockUnlockService.canUnlock(object, user)), Boolean.FALSE);
	}

}
