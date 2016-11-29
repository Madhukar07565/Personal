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
package com.cnk.travelogix.operations.doas;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.operations.data.WorkflowActionSearchData;
import com.cnk.travelogix.orgstructure.core.model.MarketModel;

import de.hybris.platform.catalog.model.CompanyModel;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.workflow.model.WorkflowActionModel;


/**
 *
 */
public interface ToDoTaskDao
{

	SearchPageData<WorkflowActionModel> searchTasks(final WorkflowActionSearchData seachData, final PageableData pageableData,
			String user, String status, boolean overdue);

	WorkflowActionModel findTask(final String code);


	SearchPageData<WorkflowActionModel> findTaskByOrderReference(final String code);

	List<WorkflowActionModel> findNotifications();

	/**
	 * @param notificationCode
	 */
	WorkflowActionModel findNotification(String notificationCode);

	/**
	 * @param notificationCode
	 */
	WorkflowActionModel dismissNotification(String notificationCode);

	SearchResult<ArrayList> findSnapShot();

	/**
	 *
	 */
	List<WorkflowActionModel> findTasks(String tasks);

	/**
	 * Get All the Tasks Based on Task Name
	 *
	 * @param taskName
	 */
	List<WorkflowActionModel> getTasksByName(String taskName);


	/**
	 *
	 */
	SearchResult<ArrayList> getAllCompanyMarketsByName();

	/**
	 *
	 */
	SearchResult<ArrayList> getAllCompaniesByName();

	/**
	 *
	 */
	CompanyModel getCompanyByCode(String code);

	/**
	 *
	 */
	MarketModel getMarketByCode(String code);

	/**
	 *
	 */
	List<WorkflowActionModel> findSubTasks(WorkflowActionModel workflowActionModel);

	/**
	 *
	 */
	List<WorkflowActionModel> findDueDateExpTasks();

	Integer getNumberOfUnassignedTasks();

	/**
	 * @param pageableData
	 * @param workflowActionSearchData
	 *
	 */
	SearchPageData<WorkflowActionModel> getUnassginedTasks(WorkflowActionSearchData workflowActionSearchData,
			PageableData pageableData);

	/**
	 * @param approver
	 *
	 */
	boolean isSupervisor(UserModel approver);

}
