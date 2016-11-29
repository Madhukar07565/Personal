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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.workflow.WorkflowProcessingService;
import de.hybris.platform.workflow.WorkflowService;
import de.hybris.platform.workflow.WorkflowTemplateService;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowModel;
import de.hybris.platform.workflow.model.WorkflowTemplateModel;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.cnk.travelogix.operations.data.WorkflowActionData;
import com.cnk.travelogix.operations.doas.ToDoTaskDao;
import com.cnk.travelogix.operations.services.OperationOrderService;


/**
 *
 */

@UnitTest
@RunWith(MockitoJUnitRunner.class)
public class DefaultToDoTaskServiceTest
{

	@Mock
	private UserService userService;
	@Mock
	private ToDoTaskDao toDoTaskDao;
	@Mock
	private ModelService modelService;
	@Mock
	private WorkflowTemplateService workflowTemplateService;
	@Mock
	private WorkflowService workflowService;
	@Mock
	private WorkflowProcessingService workflowProcessingService;
	@Mock
	private ProductService productService;
	@Mock
	private OperationOrderService operationOrderService;

	@Mock
	private WorkflowModel workflow;

	private DefaultToDoTaskService toDoTaskService;

	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
		toDoTaskService = new DefaultToDoTaskService();
		toDoTaskService.setUserService(userService);
		toDoTaskService.setToDoTaskDao(toDoTaskDao);
		toDoTaskService.setModelService(modelService);
		toDoTaskService.setWorkflowTemplateService(workflowTemplateService);
		toDoTaskService.setWorkflowService(workflowService);
		toDoTaskService.setWorkflowProcessingService(workflowProcessingService);
		toDoTaskService.setProductService(productService);
		toDoTaskService.setOperationOrderService(operationOrderService);

	}

	@Test
	public void testCreateWorkflowTask()
	{
		final WorkflowActionData workflowActionData = new WorkflowActionData();
		workflowActionData.setName("test To do task");
		workflowActionData.setAssignedUser("testUser");

		final WorkflowTemplateModel mockWorkflowTemplate = mock(WorkflowTemplateModel.class);
		when(workflowTemplateService.getWorkflowTemplateForCode("toDoTaskWorkflowTemplate")).thenReturn(mockWorkflowTemplate);
		final UserModel mockUser = mock(UserModel.class);
		when(userService.getUserForUID(workflowActionData.getAssignedUser())).thenReturn(mockUser);
		final WorkflowModel mockWorkflow = mock(WorkflowModel.class);
		final WorkflowActionModel mockWorkflowAction = mock(WorkflowActionModel.class);
		when(mockWorkflow.getActions()).thenReturn(Arrays.asList(mockWorkflowAction));
		when(toDoTaskService.getWorkflowService().createWorkflow(mockWorkflowTemplate, mockUser)).thenReturn(mockWorkflow);
		assertTrue(toDoTaskService.createWorkflowTask(workflowActionData) != null);
	}

}
