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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.access.AccessDeniedException;

import com.cnk.travelogix.client.masters.core.enums.ClientCategory;
import com.cnk.travelogix.client.masters.core.enums.ClientSubCategory;
import com.cnk.travelogix.common.core.enums.AlertPriority;
import com.cnk.travelogix.common.core.enums.FunctionalArea;
import com.cnk.travelogix.common.core.enums.TaskCategory;
import com.cnk.travelogix.common.core.enums.TaskType;
import com.cnk.travelogix.common.core.enums.ToDoTaskStatus;
import com.cnk.travelogix.masterdata.core.enums.ClientType;
import com.cnk.travelogix.operations.data.ToDoApprovalTaskData;
import com.cnk.travelogix.operations.data.WorkflowActionData;
import com.cnk.travelogix.operations.data.WorkflowActionSearchData;
import com.cnk.travelogix.operations.doas.ToDoTaskDao;
import com.cnk.travelogix.operations.log.TravelogixLogUtilityService;
import com.cnk.travelogix.operations.services.OperationOrderService;
import com.cnk.travelogix.operations.services.ToDoTaskService;
import com.cnk.travelogix.orgstructure.core.model.MarketModel;

import de.hybris.platform.catalog.model.CompanyModel;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.workflow.WorkflowProcessingService;
import de.hybris.platform.workflow.WorkflowService;
import de.hybris.platform.workflow.WorkflowTemplateService;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;
import de.hybris.platform.workflow.model.WorkflowModel;
import de.hybris.platform.workflow.model.WorkflowTemplateModel;


/**
 *
 */
public class DefaultToDoTaskService implements ToDoTaskService
{

	private static final Logger LOG = Logger.getLogger(DefaultToDoTaskService.class);
	private static final String TODO_TASK_WORKFLOW_TEMPLATE = "toDoTaskWorkflowTemplate";
	private static final String SAME_USER_NOT_ALLOWED = "todo.user.notallowed.sameuser";
	private static final String APPROVE_TASK = "todo.task.approve";
	private static final String USER_NOT_ALLOWED = "todo.user.notallowed";
	private static final String REJECT_TASK = "todo.task.rejected";
	private static final String ROLE_SUPERVISOR_GROUP = "wfl_supervisorGroup";
	private static final String REASSIGN_ACCESS_DENIED = "todo.task.reassign.access.denied";

	private UserService userService;
	private ToDoTaskDao toDoTaskDao;
	private ModelService modelService;
	private WorkflowTemplateService workflowTemplateService;
	private WorkflowService workflowService;
	private WorkflowProcessingService workflowProcessingService;
	//	private ToDoLockUnlockService todoLockUnlockService;
	private ProductService productService;
	private OperationOrderService operationOrderService;


	@Override
	public SearchPageData<WorkflowActionModel> searchTask(final WorkflowActionSearchData data, final PageableData pageableData,
			final String user, final String status, final boolean overdue)
	{
		// YTODO Auto-generated method stub
		return getToDoTaskDao().searchTasks(data, pageableData, user, status, overdue);
	}

	@Override
	public WorkflowActionModel getTask(final String code)
	{
		// YTODO Auto-generated method stub
		return getToDoTaskDao().findTask(code);
	}


	@Override
	public WorkflowActionModel createWorkflowTask(final WorkflowActionData workflowActionData)
	{
		if (StringUtils.isNotEmpty(workflowActionData.getName()) && isTaskAlreadyExists(workflowActionData.getName()))
		{
			throw new DuplicateKeyException("Task with name :" + workflowActionData.getName() + " already exists");
		}
		else
		{
			WorkflowActionModel parent = null;
			if (workflowActionData.getParent() != null && (!workflowActionData.getParent().isEmpty()))
			{
				parent = getTask(workflowActionData.getParent());
			}

			final WorkflowTemplateModel workflowTemplate = this.workflowTemplateService
					.getWorkflowTemplateForCode(TODO_TASK_WORKFLOW_TEMPLATE);

			final WorkflowModel workflow = this.workflowService.createWorkflow(workflowTemplate, getUserService().getCurrentUser());
			modelService.save(workflow);

			final WorkflowActionModel action = workflow.getActions().get(0);

			action.setName(workflowActionData.getName());
			action.setDescription(workflowActionData.getDesc());
			action.setSuggestedAction(workflowActionData.getSuggestedAction());
			action.setTaskStatus(ToDoTaskStatus.NEW);


			if (parent != null)
			{
				action.setParent(parent);
			}
			if (StringUtils.isNotEmpty(workflowActionData.getAssignedUser()))
			{
				final UserModel approver = getUserService().getUserForUID(workflowActionData.getAssignedUser());
				if (toDoTaskDao.isSupervisor(approver))
				{
					action.setPrincipalAssigned(approver);
				}
				else
				{
					throw new AccessDeniedException("todo.task.assign.approver");
				}
			}
			else
			{
				action.setPrincipalAssigned(getUserService().getUserGroupForUID(ROLE_SUPERVISOR_GROUP));
			}

			// added order in workflow action
			if (workflowActionData.getOrder() != null && workflowActionData.getOrder().getCode() != null
					&& (!workflowActionData.getOrder().getCode().isEmpty()))
			{
				action.setOrder(getOperationOrderService().getOrderByCode(workflowActionData.getOrder().getCode()));
			}

			// added product in workflow action
			if (workflowActionData.getProduct() != null && workflowActionData.getProduct().getCode() != null
					&& (!workflowActionData.getProduct().getCode().isEmpty()))
			{
				action.setProduct(getProductService().getProductForCode(workflowActionData.getProduct().getCode()));
			}

			// update Priority of workflow
			if (StringUtils.isNotEmpty(workflowActionData.getPriority()))
			{
				action.setAlertPriority(AlertPriority.valueOf(workflowActionData.getPriority()));
			}

			// update TaskType of workflow
			if (StringUtils.isNotEmpty(workflowActionData.getTaskType()))
			{
				action.setTaskType(TaskType.valueOf(workflowActionData.getTaskType()));
			}

			// update TaskCategory of workflow
			if (StringUtils.isNotEmpty(workflowActionData.getTaskCategory()))
			{
				action.setTaskCategory(TaskCategory.valueOf(workflowActionData.getTaskCategory()));
			}


			// update clientType of workflow
			if (StringUtils.isNotEmpty(workflowActionData.getClientType()))
			{
				action.setClientType(ClientType.valueOf(workflowActionData.getClientType()));
			}

			// update functionalArea of workflow
			if (StringUtils.isNotEmpty(workflowActionData.getFunctionalArea()))
			{
				action.setFunctionalArea(FunctionalArea.valueOf(workflowActionData.getFunctionalArea()));
			}

			// update Company of workflow
			if (StringUtils.isNotEmpty(workflowActionData.getCompanyName()))
			{
				action.setCompany(getCompanyByCode(workflowActionData.getCompanyName()));
			}

			// update Market of workflow
			if (StringUtils.isNotEmpty(workflowActionData.getCompanyMarket()))
			{
				action.setMarket(getMarketByCode(workflowActionData.getCompanyMarket()));
			}

			// update clientCategory of workflow
			if (StringUtils.isNotEmpty(workflowActionData.getClientCategory()))
			{
				action.setClientCategory(ClientCategory.valueOf(workflowActionData.getClientCategory()));
			}

			// update clientSubCategory of workflow
			if (StringUtils.isNotEmpty(workflowActionData.getClientSubCategory()))
			{
				action.setClientSubCategory(ClientSubCategory.valueOf(workflowActionData.getClientSubCategory()));
			}

			if (StringUtils.isNotEmpty(workflowActionData.getSecondaryAssignedUser()))
			{
				action.setSecondaryAssignedUser(userService.getUserForUID(workflowActionData.getSecondaryAssignedUser()));
			}
			if (workflowActionData.getDueDate() != null)
			{
				//final long nowMillis = System.currentTimeMillis();
				//action.setDueDate(new Date(nowMillis - nowMillis % 1000));
				action.setDueDate(workflowActionData.getDueDate());
			}

			modelService.save(action);
			TravelogixLogUtilityService.auditModelLog(action);
			// this.workflowProcessingService.startWorkflow(workflow);

			return action;
		}

	}

	@Override
	public List<WorkflowActionModel> getNotifications()
	{
		return getToDoTaskDao().findNotifications();
	}

	/**
	 *
	 * @param notificationCode
	 */
	@Override
	public WorkflowActionModel viewNotification(final String notificationCode)
	{
		WorkflowActionModel workflowActionModel = null;
		workflowActionModel = getToDoTaskDao().findNotification(notificationCode);
		workflowActionModel.setAlertRead(Boolean.TRUE);
		try
		{
			modelService.save(workflowActionModel);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occurred while saving notification : " + notificationCode + "-" + e.getMessage(), e);
		}
		return workflowActionModel;
	}

	/**
	 * @param notificationCode
	 */
	@Override
	public void dismissNotification(final String notificationCode)
	{
		WorkflowActionModel workflowActionModel = null;
		workflowActionModel = getToDoTaskDao().findNotification(notificationCode);
		workflowActionModel.setAlertRead(Boolean.TRUE);
		try
		{
			modelService.save(workflowActionModel);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occurred while removing notification : " + notificationCode + "-" + e.getMessage(), e);
		}
	}


	@Override
	public SearchResult<ArrayList> getSnapshot()
	{
		return getToDoTaskDao().findSnapShot();
	}

	@Override
	public boolean assignReassignTasks(final String tasks, final String user)
	{
		final UserModel userModel = getUserService().getUserForUID(user);
		final UserModel currentUser = getUserService().getCurrentUser();
		for (final WorkflowActionModel action : getToDoTaskDao().findTasks(tasks))
		{
			if (action.getAssignedTo() != null && !action.getAssignedTo().equals(userModel) && !toDoTaskDao.isSupervisor(currentUser)
					&& !action.getAssignedTo().equals(currentUser) && (action.getTaskStatus().equals(ToDoTaskStatus.NEW)
							|| action.getTaskStatus().equals(ToDoTaskStatus.UNDER_APPROVAL)))
			{
				throw new AccessDeniedException(REASSIGN_ACCESS_DENIED);
			}
			if (action.getTaskStatus().equals(ToDoTaskStatus.NEW) || action.getTaskStatus().equals(ToDoTaskStatus.UNDER_APPROVAL))
			{
				return false;
			}
			action.setAssignedBy(currentUser);
			action.setPrincipalAssigned(userModel);
			action.setAssignedTo(userModel);
			modelService.save(action);
		}
		return true;
	}

	@Override
	public Map<String, String> getAllCompanyNames()
	{
		final SearchResult<ArrayList> results = toDoTaskDao.getAllCompaniesByName();
		final Map<String, String> companies = new HashMap<String, String>();
		for (final ArrayList<String> company : results.getResult())
		{
			companies.put(company.get(0), company.get(1));
		}
		return companies;
	}

	@Override
	public Map<String, String> getAllCompanyMarketNames()
	{
		final SearchResult<ArrayList> results = toDoTaskDao.getAllCompanyMarketsByName();
		final Map<String, String> markets = new HashMap<String, String>();
		for (final ArrayList<String> market : results.getResult())
		{
			markets.put(market.get(0), market.get(1));
		}
		return markets;
	}

	@Override
	public CompanyModel getCompanyByCode(final String code)
	{
		return toDoTaskDao.getCompanyByCode(code);
	}

	@Override
	public MarketModel getMarketByCode(final String code)
	{
		return toDoTaskDao.getMarketByCode(code);
	}

	@Override
	public List<WorkflowActionModel> getSubTasks(final WorkflowActionModel workflowActionModel)
	{
		return getToDoTaskDao().findSubTasks(workflowActionModel);
	}

	@Override
	public void updateDueDateExpTasks()
	{
		final List<WorkflowActionModel> workflowActionModels = getToDoTaskDao().findDueDateExpTasks();
		LOG.info("workflowActionModels size : " + workflowActionModels.size());

		for (final WorkflowActionModel workflowActionModel : workflowActionModels)
		{
			final Calendar cal = Calendar.getInstance();
			cal.setTime(workflowActionModel.getDueDate());
			cal.add(Calendar.DATE, 5);
			final Date newDueDate = cal.getTime();
			workflowActionModel.setDueDate(newDueDate);

			LOG.info("primary user : " + workflowActionModel.getPrincipalAssigned());
			LOG.info("secondary user : " + workflowActionModel.getSecondaryAssignedUser());
			workflowActionModel.setPrincipalAssigned(workflowActionModel.getSecondaryAssignedUser());
			try
			{
				modelService.save(workflowActionModel);
			}
			catch (final Exception e)
			{
				LOG.error("Exception occurred while updating due date for notification : " + workflowActionModel.getCode() + "-"
						+ e.getMessage());
				e.printStackTrace();
			}
		}
	}

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
	public boolean isTaskAlreadyExists(final String taskName)
	{
		if (CollectionUtils.isNotEmpty(toDoTaskDao.getTasksByName(taskName)))
		{
			return true;
		}
		return false;
	}

	@Override
	public String approveTask(final ToDoApprovalTaskData toDoApprovalTaskData)
	{
		final UserModel currentUser = getUserService().getCurrentUser();
		if (toDoTaskDao.isSupervisor(currentUser))
		{
			final WorkflowActionModel task = getToDoTaskDao().findTask(toDoApprovalTaskData.getCode());
			if (task.getOwner().equals(currentUser))
			{
				return SAME_USER_NOT_ALLOWED;
			}
			task.setRemark(toDoApprovalTaskData.getRemark());
			try
			{
				WorkflowDecisionModel decided = null;
				for (final WorkflowDecisionModel decision : task.getDecisions())
				{
					if (decision.getCode().equalsIgnoreCase("TD001"))
					{
						decided = decision;
					}
				}
				getWorkflowProcessingService().decideAction(task, decided);
				task.setTaskStatus(ToDoTaskStatus.OPEN);
				modelService.save(task);
				return APPROVE_TASK;
			}
			catch (final Exception e)
			{
				//	e.printStackTrace();
				return e.getMessage();
			}
		}
		return USER_NOT_ALLOWED;
	}

	@Override
	public String rejectTask(final ToDoApprovalTaskData toDoApprovalTaskData)
	{
		final UserModel currentUser = getUserService().getCurrentUser();
		if (toDoTaskDao.isSupervisor(currentUser))
		{
			final WorkflowActionModel task = getToDoTaskDao().findTask(toDoApprovalTaskData.getCode());
			if (task.getOwner().equals(currentUser))
			{
				return SAME_USER_NOT_ALLOWED;
			}
			task.setRemark(toDoApprovalTaskData.getRemark());
			try
			{
				WorkflowDecisionModel decided = null;
				for (final WorkflowDecisionModel decision : task.getDecisions())
				{
					if (decision.getCode().equalsIgnoreCase("TD002"))
					{
						decided = decision;
					}
				}
				getWorkflowProcessingService().decideAction(task, decided);
				task.setPrincipalAssigned(task.getOwner());
				getModelService().save(task);
				return REJECT_TASK;
			}
			catch (final Exception e)
			{
				//	e.printStackTrace();
				return e.getMessage();
			}
		}
		return "todo.user.notallowed";
	}

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	/**
	 * @return the workflowTemplateService
	 */
	public WorkflowTemplateService getWorkflowTemplateService()
	{
		return workflowTemplateService;
	}

	/**
	 * @param workflowTemplateService
	 *           the workflowTemplateService to set
	 */
	public void setWorkflowTemplateService(final WorkflowTemplateService workflowTemplateService)
	{
		this.workflowTemplateService = workflowTemplateService;
	}

	/**
	 * @return the workflowService
	 */
	public WorkflowService getWorkflowService()
	{
		return workflowService;
	}

	/**
	 * @param workflowService
	 *           the workflowService to set
	 */
	public void setWorkflowService(final WorkflowService workflowService)
	{
		this.workflowService = workflowService;
	}

	/**
	 * @return the workflowProcessingService
	 */
	public WorkflowProcessingService getWorkflowProcessingService()
	{
		return workflowProcessingService;
	}

	/**
	 * @param workflowProcessingService
	 *           the workflowProcessingService to set
	 */
	public void setWorkflowProcessingService(final WorkflowProcessingService workflowProcessingService)
	{
		this.workflowProcessingService = workflowProcessingService;
	}

	/**
	 * @return the operationOrderService
	 */
	public OperationOrderService getOperationOrderService()
	{
		return operationOrderService;
	}

	/**
	 * @param operationOrderService
	 *           the operationOrderService to set
	 */
	public void setOperationOrderService(final OperationOrderService operationOrderService)
	{
		this.operationOrderService = operationOrderService;
	}

	/**
	 * @return the productService
	 */
	public ProductService getProductService()
	{
		return productService;
	}

	/**
	 * @param productService
	 *           the productService to set
	 */
	public void setProductService(final ProductService productService)
	{
		this.productService = productService;
	}

	@Override
	public Integer getNumberOfUnassignedTasks()
	{
		return toDoTaskDao.getNumberOfUnassignedTasks();
	}

	@Override
	public SearchPageData<WorkflowActionModel> getUnassignedTasks(final WorkflowActionSearchData workflowActionSearchData,
			final PageableData pageableData)
	{
		return getToDoTaskDao().getUnassginedTasks(workflowActionSearchData, pageableData);
	}

	@Override
	public void updateTaskReadByAssigneeFlag(final String taskCode)
	{
		if (toDoTaskDao.findTask(taskCode) != null)
		{
			final WorkflowActionModel task = toDoTaskDao.findTask(taskCode);
			if (task.getTaskStatus().equals(ToDoTaskStatus.OPEN) && (task.getAssignedTo() != null)
					&& (task.getAssignedTo().equals(userService.getCurrentUser())))
			{
				task.setReadbyAssignedUser(Boolean.TRUE);
				modelService.save(task);
			}
		}
	}
}
