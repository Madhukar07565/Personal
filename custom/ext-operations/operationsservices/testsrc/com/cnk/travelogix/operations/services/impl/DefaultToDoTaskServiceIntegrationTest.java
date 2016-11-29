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

import static org.junit.Assert.assertTrue;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.ServicelayerBaseTest;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.workflow.model.WorkflowActionModel;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;

import com.cnk.travelogix.operations.data.WorkflowActionData;
import com.cnk.travelogix.operations.services.ToDoTaskService;


/**
 *
 *
 */
public class DefaultToDoTaskServiceIntegrationTest extends ServicelayerBaseTest
{

	@Resource
	private UserService userService;

	@Resource
	private ToDoTaskService toDoTaskService;

	@Before
	public void setUp() throws Exception
	{

		final UserModel admin = userService.getAdminUser();
		userService.setCurrentUser(admin);
	}

	/**
	 * Test method for
	 * {@link com.cnk.travelogix.operations.services.impl.DefaultToDoTaskService#createWorkflowTask(com.cnk.travelogix.operations.data.WorkflowActionData)}
	 * .
	 */

	@Test
	public void testCreateWorkflowTask()
	{
		final WorkflowActionData workflowActionData = new WorkflowActionData();
		workflowActionData.setName("test to do task ");
		final WorkflowActionModel todo = toDoTaskService.createWorkflowTask(workflowActionData);
		assertTrue(todo != null);
	}

}
