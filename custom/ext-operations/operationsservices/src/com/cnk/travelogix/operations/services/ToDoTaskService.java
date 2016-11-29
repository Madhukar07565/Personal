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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cnk.travelogix.operations.data.ToDoApprovalTaskData;
import com.cnk.travelogix.operations.data.WorkflowActionData;
import com.cnk.travelogix.operations.data.WorkflowActionSearchData;
import com.cnk.travelogix.orgstructure.core.model.MarketModel;

import de.hybris.platform.catalog.model.CompanyModel;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.workflow.model.WorkflowActionModel;


/**
 *
 */
public interface ToDoTaskService
{
	SearchPageData<WorkflowActionModel> searchTask(final WorkflowActionSearchData data, final PageableData pageableData,
			String user, String status, boolean overdue);

	WorkflowActionModel getTask(String code);

	WorkflowActionModel createWorkflowTask(final WorkflowActionData workflowActionData);

	List<WorkflowActionModel> getNotifications();

	/**
	 * @param notificationCode
	 */
	WorkflowActionModel viewNotification(String notificationCode);

	/**
	 * @param notificationCode
	 */
	void dismissNotification(final String notificationCode);

	/**
	 *
	 */
	SearchResult<ArrayList> getSnapshot();

	/**
	 *
	 */
	boolean assignReassignTasks(String tasks, String user);

	/**
	 * Checks whether a task with same name exists or not
	 *
	 * @param taskName
	 */
	boolean isTaskAlreadyExists(String taskName);

	/**
	 *
	 */
	Map<String, String> getAllCompanyNames();

	/**
	 *
	 */
	Map<String, String> getAllCompanyMarketNames();

	CompanyModel getCompanyByCode(String code);

	/**
	 *
	 */
	MarketModel getMarketByCode(String code);

	/**
	 *
	 */
	List<WorkflowActionModel> getSubTasks(WorkflowActionModel workflowActionModel);

	/**
	 *
	 */
	String approveTask(ToDoApprovalTaskData toDoApprovalTaskData);

	/**
	 *
	 */
	String rejectTask(ToDoApprovalTaskData toDoApprovalTaskData);

	/**
	 *
	 */
	void updateDueDateExpTasks();

	/**
	 *
	 */
	Integer getNumberOfUnassignedTasks();

	/**
	 * @param pageableData
	 * @param workflowActionSearchData
	 *
	 */
	SearchPageData<WorkflowActionModel> getUnassignedTasks(WorkflowActionSearchData workflowActionSearchData,
			PageableData pageableData);

	/**
	 *
	 */
	void updateTaskReadByAssigneeFlag(String taskCode);
}

