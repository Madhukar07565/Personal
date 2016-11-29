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
package com.cnk.travelogix.operations.facades.impl;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.core.model.security.PrincipalGroupModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.workflow.WorkflowProcessingService;
import de.hybris.platform.workflow.WorkflowService;
import de.hybris.platform.workflow.WorkflowTemplateService;
import de.hybris.platform.workflow.enums.WorkflowActionStatus;
import de.hybris.platform.workflow.model.WorkflowActionModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import com.cnk.travelogix.common.core.enums.AlertPriority;
import com.cnk.travelogix.common.core.enums.TaskCategory;
import com.cnk.travelogix.common.core.enums.TaskType;
import com.cnk.travelogix.common.core.enums.ToDoTaskStatus;
import com.cnk.travelogix.operations.data.ToDoApprovalTaskData;
import com.cnk.travelogix.operations.data.ToDoSnapshotData;
import com.cnk.travelogix.operations.data.ToDoSnapshotTaskData;
import com.cnk.travelogix.operations.data.WorkflowActionData;
import com.cnk.travelogix.operations.data.WorkflowActionSearchData;
import com.cnk.travelogix.operations.facades.ToDoTaskFacade;
import com.cnk.travelogix.operations.services.OperationOrderService;
import com.cnk.travelogix.operations.services.ToDoLockUnlockService;
import com.cnk.travelogix.operations.services.ToDoTaskService;


/**
 *
 */
public class DefaultToDoTaskFacade implements ToDoTaskFacade
{
	private static final String ROLE_SUPERVISOR = "wfl_supervisorGroup";

	private ToDoTaskService toDoTaskService;

	private ToDoLockUnlockService todoLockUnlockService;

	private Converter<WorkflowActionModel, WorkflowActionData> toDoTaskConverter;

	private ModelService modelService;
	private UserService userService;
	private WorkflowTemplateService workflowTemplateService;
	private WorkflowService workflowService;
	private WorkflowProcessingService workflowProcessingService;
	private ProductService productService;
	private OperationOrderService operationOrderService;

	@Override
	public SearchPageData<WorkflowActionData> searchTasks(final WorkflowActionSearchData data, final PageableData pageableData,
			final String user, final String status, final boolean overdue)
	{
		final SearchPageData<WorkflowActionModel> models = getToDoTaskService().searchTask(data, pageableData, user, status,
				overdue);
		return convertPageData(models, getToDoTaskConverter());
	}

	protected <S, T> SearchPageData<T> convertPageData(final SearchPageData<S> source, final Converter<S, T> converter)
	{
		final SearchPageData<T> result = new SearchPageData<T>();
		result.setPagination(source.getPagination());
		result.setSorts(source.getSorts());
		result.setResults(Converters.convertAll(source.getResults(), converter));
		return result;
	}

	@Override
	public WorkflowActionData getTask(final String code) //throws RecordLockedException
	{
		final WorkflowActionModel model = getToDoTaskService().getTask(code);
		if (model == null)
		{
			return null;
		}

		if (model.getLockedBy() != null)
		{
			//throw new RecordLockedException("ERROR013",
			//"Record is Locked by : " + model.getLockedBy().getName() + ", please try after sometime or release the lock");
		}
		return getToDoTaskConverter().convert(model);
	}

	/**
	 * Getting list of notifications
	 */
	@Override
	public List<WorkflowActionData> getNotifications()
	{
		List<WorkflowActionData> workflowActionDatas;
		final List<WorkflowActionModel> workflowActionModels = getToDoTaskService().getNotifications();
		workflowActionDatas = populate(workflowActionModels);
		return workflowActionDatas;
	}

	/**
	 * @param notificationCode
	 */
	@Override
	public WorkflowActionData viewNotification(final String notificationCode)
	{
		final WorkflowActionModel workflowActionModel = getToDoTaskService().viewNotification(notificationCode);
		return populate(workflowActionModel);
	}

	/**
	 * @param notificationCode
	 */
	@Override
	public void dismissNotification(final String notificationCode)
	{
		getToDoTaskService().dismissNotification(notificationCode);
	}

	/**
	 * Converting List of WorkflowActionModel to list of WorkflowActionData
	 */
	public List<WorkflowActionData> populate(final List<WorkflowActionModel> workflowActionModels)
	{
		List<WorkflowActionData> workflowActionDatas;
		workflowActionDatas = new ArrayList<>();
		final Iterator<WorkflowActionModel> iterator = workflowActionModels.iterator();
		while (iterator.hasNext())
		{
			final WorkflowActionModel workflowActionModel = iterator.next();
			final WorkflowActionData workflowActionData = new WorkflowActionData();
			populateModelToData(workflowActionModel, workflowActionData);
			workflowActionDatas.add(workflowActionData);
		}
		return workflowActionDatas;
	}

	public void populateAll(final List<WorkflowActionModel> workflowActionModels,
			final List<WorkflowActionData> workflowActionDatas)
	{
		final Iterator<WorkflowActionModel> iterator = workflowActionModels.iterator();
		while (iterator.hasNext())
		{
			final WorkflowActionModel workflowActionModel = iterator.next();
			final WorkflowActionData workflowActionData = new WorkflowActionData();
			populate(workflowActionModel, workflowActionData);
			workflowActionDatas.add(workflowActionData);
		}
	}

	public void populate(final WorkflowActionModel workflowActionModel, final WorkflowActionData workflowActionData)
	{
		workflowActionData.setName(workflowActionModel.getName());
		workflowActionData.setPriority(workflowActionModel.getAlertPriority().getCode());
		workflowActionData.setAssignedUser(workflowActionModel.getPrincipalAssigned().getUid());
		workflowActionData.setDesc(workflowActionModel.getDescription());
		//workflowActionData.setOrder(workflowActionModel.getOrder());
		workflowActionData.setDueDate(workflowActionModel.getDueDate());
		workflowActionData.setStatus(workflowActionModel.getStatus().toString());
		workflowActionData.setSecondaryAssignedUser(workflowActionModel.getSecondaryAssignedUser().getUid());
	}


	@Override
	public void updateTasks(final WorkflowActionData workflowActionData)
	{
		if (StringUtils.isNotEmpty(workflowActionData.getName())
				&& toDoTaskService.isTaskAlreadyExists(workflowActionData.getName()))
		{
			//throw new DuplicateKeyException("Task with name :" + workflowActionData.getName() + " already exists");
		}
		final WorkflowActionModel task = getToDoTaskService().getTask(workflowActionData.getCode());
		if (workflowActionData.getParent() != null && (!workflowActionData.getParent().isEmpty()))
		{
			final WorkflowActionModel parent = getToDoTaskService().getTask(workflowActionData.getParent());
			task.setParent(parent);
		}

		// added order in workflow action
		if (workflowActionData.getOrder() != null && workflowActionData.getOrder().getCode() != null
				&& (!workflowActionData.getOrder().getCode().isEmpty()))
		{
			task.setOrder(getOperationOrderService().getOrderByCode(workflowActionData.getOrder().getCode()));
		}

		// added product in workflow action
		if (workflowActionData.getProduct() != null && workflowActionData.getProduct().getCode() != null
				&& (!workflowActionData.getProduct().getCode().isEmpty()))
		{
			task.setProduct(getProductService().getProductForCode(workflowActionData.getProduct().getCode()));
		}

		task.setName(workflowActionData.getName());
		task.setDescription(workflowActionData.getDesc());
		task.setSuggestedAction(workflowActionData.getSuggestedAction());

		// update status of workflow
		if (ToDoTaskStatus.valueOf(workflowActionData.getStatus()) != null)
		{
			task.setTaskStatus(ToDoTaskStatus.valueOf(workflowActionData.getStatus()));
		}

		// update Priority of workflow
		if (AlertPriority.valueOf(workflowActionData.getPriority()) != null)
		{
			task.setAlertPriority(AlertPriority.valueOf(workflowActionData.getPriority()));
		}

		// update TaskType of workflow
		if (TaskType.valueOf(workflowActionData.getTaskType()) != null)
		{
			task.setTaskType(TaskType.valueOf(workflowActionData.getTaskType()));
		}

		// update TaskCategory of workflow
		if (TaskCategory.valueOf(workflowActionData.getTaskCategory()) != null)
		{
			task.setTaskCategory(TaskCategory.valueOf(workflowActionData.getTaskCategory()));
		}

		//update TaskCategory of workflow. Put condition if its edit.
		if (userService.getCurrentUser() != null && "EDIT_LOCK".equals(workflowActionData.getLockedBy()))
		{
			task.setLockedBy(userService.getCurrentUser());
		}
		else
		{
			task.setLockedBy(null);
		}

		if (workflowActionData.getDueDate() != null)
		{
			//final long nowMillis = System.currentTimeMillis();
			//task.setDueDate(new Date(nowMillis - nowMillis % 1000));
			task.setDueDate(workflowActionData.getDueDate());
		}

		getModelService().save(task);
	}

	public void populateModelToData(final WorkflowActionModel workflowActionModel, final WorkflowActionData workflowActionData)
	{
		if (null != workflowActionModel.getCode())
		{
			workflowActionData.setCode(workflowActionModel.getCode());
		}
		if (null != workflowActionModel.getName())
		{
			workflowActionData.setName(workflowActionModel.getName());
		}
		if (null != workflowActionModel.getAlertPriority())
		{
			workflowActionData.setPriority(workflowActionModel.getAlertPriority().getCode());
		}
		if (null != workflowActionModel.getDescription())
		{
			workflowActionData.setDesc(workflowActionModel.getDescription());
		}
		if (null != workflowActionModel.getStatus())
		{
			workflowActionData.setStatus(workflowActionModel.getStatus().toString());
		}
		if (null != workflowActionModel.getDueDate())
		{
			workflowActionData.setDueDate(workflowActionModel.getDueDate());
		}
		if (null != workflowActionModel.getPrincipalAssigned())
		{
			workflowActionData.setAssignedUser(workflowActionModel.getPrincipalAssigned().getUid());
		}
		if (null != workflowActionModel.getSecondaryAssignedUser())
		{
			workflowActionData.setSecondaryAssignedUser(workflowActionModel.getSecondaryAssignedUser().getUid());
		}
	}

	public WorkflowActionData populate(final WorkflowActionModel workflowActionModel)
	{
		WorkflowActionData workflowActionData;
		workflowActionData = new WorkflowActionData();

		if (null != workflowActionModel.getCode())
		{
			workflowActionData.setCode(workflowActionModel.getCode());
		}
		if (null != workflowActionModel.getName())
		{
			workflowActionData.setName(workflowActionModel.getName());
		}
		if (null != workflowActionModel.getAlertPriority())
		{
			workflowActionData.setPriority(workflowActionModel.getAlertPriority().getCode());
		}
		if (null != workflowActionModel.getDescription())
		{
			workflowActionData.setDesc(workflowActionModel.getDescription());
		}
		if (null != workflowActionModel.getStatus())
		{
			workflowActionData.setStatus(workflowActionModel.getStatus().toString());
		}
		if (null != workflowActionModel.getDueDate())
		{
			workflowActionData.setDueDate(workflowActionModel.getDueDate());
		}
		if (null != workflowActionModel.getPrincipalAssigned())
		{
			workflowActionData.setAssignedUser(workflowActionModel.getPrincipalAssigned().getUid());
		}
		if (null != workflowActionModel.getSecondaryAssignedUser())
		{
			workflowActionData.setSecondaryAssignedUser(workflowActionModel.getSecondaryAssignedUser().getUid());
		}
		return workflowActionData;
	}


	@Override
	public List<ToDoSnapshotData> getSnapshot(final String wise)
	{
		final SearchResult<ArrayList> results = getToDoTaskService().getSnapshot();
		final List<ToDoSnapshotData> snapshotDatas = new ArrayList<ToDoSnapshotData>();
		final UserModel currentUser = userService.getCurrentUser();
		if (!getUserService().getAllUserGroupsForUser(currentUser).contains(getUserService().getUserGroupForUID(ROLE_SUPERVISOR)))
		{
			return getSnapshotForIndividual(results);
		}
		if (wise.equalsIgnoreCase("userWise"))
		{
			for (final ArrayList<String> snapShot : results.getResult())
			{

				final ToDoSnapshotTaskData toDoSnapshotTaskData = new ToDoSnapshotTaskData();
				toDoSnapshotTaskData.setCount(new Integer(snapShot.get(2)));
				toDoSnapshotTaskData.setStatus(snapShot.get(1));
				toDoSnapshotTaskData.setOverdueCount(new Integer(snapShot.get(3)));

				boolean flag = false;
				for (final ToDoSnapshotData toDoSnapshotData : snapshotDatas)
				{
					if (toDoSnapshotData.getUser().equals(snapShot.get(0)))
					{
						final List<ToDoSnapshotTaskData> toDoSnapshotTaskDatas = toDoSnapshotData.getTasks();
						toDoSnapshotTaskDatas.add(toDoSnapshotTaskData);
						toDoSnapshotData.setTasks(toDoSnapshotTaskDatas);
						toDoSnapshotData
								.setCount(new Integer(toDoSnapshotData.getCount().intValue() + Integer.parseInt(snapShot.get(2))));
						toDoSnapshotData.setOverdueCount(
								new Integer(toDoSnapshotData.getOverdueCount().intValue() + Integer.parseInt(snapShot.get(3))));

						flag = true;
						continue;
					}
				}
				if (!flag)
				{
					final ToDoSnapshotData snapshotData = new ToDoSnapshotData();
					snapshotData.setUser(snapShot.get(0));
					snapshotData.setCount(new Integer(snapShot.get(2)));
					snapshotData.setOverdueCount(new Integer(snapShot.get(3)));
					final List<ToDoSnapshotTaskData> toDoSnapshotTaskDatas = new ArrayList<ToDoSnapshotTaskData>();
					toDoSnapshotTaskDatas.add(toDoSnapshotTaskData);
					snapshotData.setTasks(toDoSnapshotTaskDatas);
					snapshotDatas.add(snapshotData);
				}

			}
		}
		if (wise.equalsIgnoreCase("statusWise"))
		{
			for (final ArrayList<String> snapShot : results.getResult())
			{

				final ToDoSnapshotTaskData toDoSnapshotTaskData = new ToDoSnapshotTaskData();
				toDoSnapshotTaskData.setCount(new Integer(snapShot.get(2)));
				toDoSnapshotTaskData.setUser(snapShot.get(0));
				toDoSnapshotTaskData.setOverdueCount(new Integer(snapShot.get(3)));


				boolean flag = false;
				for (final ToDoSnapshotData toDoSnapshotData : snapshotDatas)
				{
					if (toDoSnapshotData.getStatus().equals(snapShot.get(1)))
					{
						final List<ToDoSnapshotTaskData> toDoSnapshotTaskDatas = toDoSnapshotData.getTasks();
						toDoSnapshotTaskDatas.add(toDoSnapshotTaskData);
						toDoSnapshotData.setTasks(toDoSnapshotTaskDatas);
						toDoSnapshotData
								.setCount(new Integer(toDoSnapshotData.getCount().intValue() + Integer.parseInt(snapShot.get(2))));
						toDoSnapshotData.setOverdueCount(
								new Integer(toDoSnapshotData.getOverdueCount().intValue() + Integer.parseInt(snapShot.get(3))));
						flag = true;
						continue;
					}
				}
				if (!flag)
				{
					final ToDoSnapshotData snapshotData = new ToDoSnapshotData();
					snapshotData.setStatus(snapShot.get(1));
					snapshotData.setCount(new Integer(snapShot.get(2)));
					snapshotData.setOverdueCount(new Integer(snapShot.get(3)));

					final List<ToDoSnapshotTaskData> toDoSnapshotTaskDatas = new ArrayList<ToDoSnapshotTaskData>();
					toDoSnapshotTaskDatas.add(toDoSnapshotTaskData);
					snapshotData.setTasks(toDoSnapshotTaskDatas);
					snapshotDatas.add(snapshotData);
				}

			}
		}
		return snapshotDatas;
	}

	/**
	 *
	 */
	private List<ToDoSnapshotData> getSnapshotForIndividual(final SearchResult<ArrayList> results)
	{
		final List<ToDoSnapshotData> snapshotDatas = new ArrayList<ToDoSnapshotData>();
		final ToDoSnapshotData toDoSnapshotData = new ToDoSnapshotData();
		final List<ToDoSnapshotTaskData> tasks = new ArrayList<>();
		Integer totalNumberOfTasks = new Integer(0);
		Integer totalNumberOfOverdueTasks = new Integer(0);
		for (final ArrayList<String> snapShot : results.getResult())
		{
			final ToDoSnapshotTaskData toDoSnapshotTaskData = new ToDoSnapshotTaskData();
			toDoSnapshotTaskData.setStatus(snapShot.get(0));
			toDoSnapshotTaskData.setCount(new Integer(snapShot.get(1)));
			toDoSnapshotTaskData.setOverdueCount(new Integer(snapShot.get(2)));
			totalNumberOfOverdueTasks += new Integer(snapShot.get(2));
			totalNumberOfTasks += new Integer(snapShot.get(1));

			tasks.add(toDoSnapshotTaskData);
		}
		if (CollectionUtils.isNotEmpty(tasks))
		{
			toDoSnapshotData.setTasks(tasks);
			toDoSnapshotData.setCount(totalNumberOfTasks);
			toDoSnapshotData.setOverdueCount(totalNumberOfOverdueTasks);
			snapshotDatas.add(toDoSnapshotData);
		}
		return snapshotDatas;
	}

	@Override
	public WorkflowActionData createTasks(final WorkflowActionData workflowActionData)
	{
		return getToDoTaskConverter().convert(getToDoTaskService().createWorkflowTask(workflowActionData));
	}

	@Override
	public void lock(final String taskCode)
	{
		final WorkflowActionModel task = getToDoTaskService().getTask(taskCode);
		getTodoLockUnlockService().lock(task, userService.getCurrentUser());
	}

	@Override
	public void unlock(final String taskCode)
	{
		final WorkflowActionModel task = getToDoTaskService().getTask(taskCode);
		getTodoLockUnlockService().unlock(task, userService.getCurrentUser());
	}

	@Override
	public boolean canLock(final String taskCode)
	{
		final WorkflowActionModel task = getToDoTaskService().getTask(taskCode);
		return getTodoLockUnlockService().canLock(task);
	}

	@Override
	public boolean canUnlock(final String taskCode)
	{
		final WorkflowActionModel task = getToDoTaskService().getTask(taskCode);
		return getTodoLockUnlockService().canUnlock(task, userService.getCurrentUser());
	}

	@Override
	public Map<String, String> getAllCompanyNames()
	{
		return toDoTaskService.getAllCompanyNames();
	}

	@Override
	public Map<String, String> getAllCompanyMarketNames()
	{
		return toDoTaskService.getAllCompanyMarketNames();
	}

	@Override
	public void updateDueDateExpTasks()
	{
		getToDoTaskService().updateDueDateExpTasks();
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
	 * @return the toDoTaskService
	 */
	public ToDoTaskService getToDoTaskService()
	{
		return toDoTaskService;
	}

	/**
	 * @param toDoTaskService
	 *           the toDoTaskService to set
	 */
	public void setToDoTaskService(final ToDoTaskService toDoTaskService)
	{
		this.toDoTaskService = toDoTaskService;
	}


	/**
	 * @return the toDoTaskConverter
	 */
	public Converter<WorkflowActionModel, WorkflowActionData> getToDoTaskConverter()
	{
		return toDoTaskConverter;
	}


	/**
	 * @param toDoTaskConverter
	 *           the toDoTaskConverter to set
	 */
	public void setToDoTaskConverter(final Converter<WorkflowActionModel, WorkflowActionData> toDoTaskConverter)
	{
		this.toDoTaskConverter = toDoTaskConverter;
	}

	/**
	 * @return the todoLockUnlockService
	 */
	public ToDoLockUnlockService getTodoLockUnlockService()
	{
		return todoLockUnlockService;
	}

	/**
	 * @param todoLockUnlockService
	 *           the todoLockUnlockService to set
	 */
	public void setTodoLockUnlockService(final ToDoLockUnlockService todoLockUnlockService)
	{
		this.todoLockUnlockService = todoLockUnlockService;
	}

	@Override
	public WorkflowActionData findTask(final String code)
	{
		final WorkflowActionModel model = getToDoTaskService().getTask(code);
		if (model == null)
		{
			return null;
		}

		return getToDoTaskConverter().convert(model);
	}

	@Override
	public boolean assignReassignTasks(final String tasks, final String user)
	{
		return getToDoTaskService().assignReassignTasks(tasks, user);
	}

	@Override
	public boolean startWorkflow(final String taskCode)
	{
		try
		{
			final WorkflowActionModel workflowAction = getToDoTaskService().getTask(taskCode);
			if (workflowAction.getTaskStatus().equals(ToDoTaskStatus.UNDER_APPROVAL)
					&& workflowAction.getOwner().equals(workflowAction.getPrincipalAssigned()))
			{
				workflowAction.setPrincipalAssigned(getUserService().getUserGroupForUID(ROLE_SUPERVISOR));
			}
			final boolean result = workflowProcessingService.startWorkflow(workflowAction.getWorkflow());
			workflowAction.setTaskStatus(ToDoTaskStatus.UNDER_APPROVAL);
			getModelService().save(workflowAction);
			return result;
		}
		catch (final Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<WorkflowActionData> getSubTasks(final String parentTaskCode)
	{
		final WorkflowActionModel workflowActionModel = getToDoTaskService().getTask(parentTaskCode);

		if (workflowActionModel != null)
		{
			final List<WorkflowActionModel> subTasks = getToDoTaskService().getSubTasks(workflowActionModel);
			return getToDoTaskConverter().convertAll(subTasks);
		}
		return null;
	}

	@Override
	public String approveTask(final ToDoApprovalTaskData toDoApprovalTaskData)
	{
		return getToDoTaskService().approveTask(toDoApprovalTaskData);
	}

	@Override
	public String rejectTask(final ToDoApprovalTaskData toDoApprovalTaskData)
	{
		return getToDoTaskService().rejectTask(toDoApprovalTaskData);
	}

	@Override
	public boolean getPermissionsForEdit(final String code)
	{
		final UserModel currentUser = userService.getCurrentUser();
		for (final PrincipalGroupModel principalGroupModel : currentUser.getAllGroups())
		{
			if (principalGroupModel.getUid().equals(ROLE_SUPERVISOR))
			{
				return false;
			}
		}
		if (getToDoTaskService().getTask(code).getOwner().equals(currentUser))
		{
			return false;
		}
		return true;
	}

	@Override
	public Integer getNumberOfUnassignedTasks()
	{
		return toDoTaskService.getNumberOfUnassignedTasks();
	}

	@Override
	public SearchPageData<WorkflowActionData> getUnassignedTasks(final WorkflowActionSearchData workflowActionSearchData,
			final PageableData pageableData)
	{
		final SearchPageData<WorkflowActionModel> unassignedTasks = toDoTaskService.getUnassignedTasks(workflowActionSearchData,
				pageableData);
		return convertPageData(unassignedTasks, getToDoTaskConverter());
	}

	@Override
	public boolean isEditAllowed(final String taskCode)
	{
		final WorkflowActionModel model = getToDoTaskService().getTask(taskCode);
		final UserModel currentUser = userService.getCurrentUser();
		if (model.getStatus().equals(WorkflowActionStatus.IN_PROGRESS) && currentUser.equals(model.getOwner()))
		{
			return false;
		}
		return true;
	}

	@Override
	public void updateTaskReadByAssigneeFlag(final String taskCode)
	{
		toDoTaskService.updateTaskReadByAssigneeFlag(taskCode);
	}
}
