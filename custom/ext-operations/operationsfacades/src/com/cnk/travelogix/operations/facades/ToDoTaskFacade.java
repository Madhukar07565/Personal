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
package com.cnk.travelogix.operations.facades;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;

import java.util.List;
import java.util.Map;

import com.cnk.travelogix.exception.commonlogging.customexception.RecordLockedException;
import com.cnk.travelogix.operations.data.ToDoApprovalTaskData;
import com.cnk.travelogix.operations.data.ToDoSnapshotData;
import com.cnk.travelogix.operations.data.WorkflowActionData;
import com.cnk.travelogix.operations.data.WorkflowActionSearchData;


/**
 *
 */
public interface ToDoTaskFacade
{
	public SearchPageData<WorkflowActionData> searchTasks(final WorkflowActionSearchData data, final PageableData pageableData,
			String user, String status, boolean overdue);

	public WorkflowActionData getTask(final String code) throws RecordLockedException;

	public WorkflowActionData findTask(final String code);


	/**
	 *
	 */
	public WorkflowActionData createTasks(WorkflowActionData populateCreateData);

	/**
	 *
	 */
	public void updateTasks(WorkflowActionData populateCreateData);

	List<WorkflowActionData> getNotifications();

	/**
	 * @param notificationCode
	 */
	WorkflowActionData viewNotification(String notificationCode);

	/**
	 * @param notificationCode
	 */
	void dismissNotification(final String notificationCode);

	/**
	 *
	 */
	public List<ToDoSnapshotData> getSnapshot(final String wise);

	void lock(String taskCode);

	/**
	 * Unlock a Object for editing
	 *
	 * @param object
	 * @param user
	 */
	void unlock(String taskCode);

	/**
	 * Can perform locking
	 *
	 * @param object
	 * @return boolean value
	 */
	boolean canLock(String taskCode);

	/**
	 * Can perform unlock
	 *
	 * @param object
	 * @param user
	 * @return boolean value
	 */
	boolean canUnlock(String taskCode);

	/**
	 *
	 */
	boolean assignReassignTasks(String tasks, String user);

	boolean startWorkflow(final String taskCode);


	/**
	 *
	 */
	Map<String, String> getAllCompanyNames();

	/**
	 *
	 */
	Map<String, String> getAllCompanyMarketNames();

	/**
	 *
	 */
	public List<WorkflowActionData> getSubTasks(String parentTaskCode);

	/**
	 *
	 */
	public String approveTask(ToDoApprovalTaskData toDoApprovalTaskData);

	/**
	 *
	 */
	public String rejectTask(ToDoApprovalTaskData toDoApprovalTaskData);

	/**
	 *
	 */
	void updateDueDateExpTasks();


	boolean getPermissionsForEdit(String code);

	/**
	 *
	 */
	Integer getNumberOfUnassignedTasks();

	/**
	 * @param pageableData
	 * @param workflowActionSearchData
	 *
	 */
	SearchPageData<WorkflowActionData> getUnassignedTasks(WorkflowActionSearchData workflowActionSearchData,
			PageableData pageableData);

	/**
	 *
	 */
	void updateTaskReadByAssigneeFlag(String taskCode);

	/**
	 *
	 */
	boolean isEditAllowed(String taskCode);

}
