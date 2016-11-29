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
package com.cnk.travelogix.operations.doas.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.enums.TaskCategory;
import com.cnk.travelogix.common.core.enums.ToDoTaskStatus;
import com.cnk.travelogix.operations.data.WorkflowActionSearchData;
import com.cnk.travelogix.operations.doas.ToDoTaskDao;
import com.cnk.travelogix.operations.log.TravelogixLogUtilityService;
import com.cnk.travelogix.orgstructure.core.model.MarketModel;

import de.hybris.platform.catalog.model.CompanyModel;
import de.hybris.platform.commerceservices.search.flexiblesearch.PagedFlexibleSearchService;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.PaginationData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.security.PrincipalGroupModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.internal.dao.GenericDao;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.workflow.model.WorkflowActionModel;


/**
 *
 */
public class DefaultToDoTaskDao implements ToDoTaskDao
{

	protected static final Logger LOG = Logger.getLogger(DefaultToDoTaskDao.class);
	private UserService userService;
	private PagedFlexibleSearchService pagedFlexibleSearchService;
	private FlexibleSearchService flexibleSearchService;
	private ModelService modelService;
	private GenericDao<CompanyModel> companyGenericDao;
	private GenericDao<MarketModel> marketGenericDao;
	private ProductService productService;
	private EnumerationService enumerationService;
	private static final String ROLE_SUPERVISOR_GROUP = "wfl_supervisorGroup";



	private final String QUERY_ACTION_SEARCH_BASE = "SELECT {actions:PK} action, {actions:activated} activated, {actions:comment} actioncomment, {workflows:PK} workflow FROM {WORKFLOWACTION as actions}, {Workflow as workflows}, {ToDoTaskStatus as status}, {AlertPriority as priority},{ClientType as clientType},{FunctionalArea as functionalArea} WHERE {actions:workflow}={workflows:pk} AND {actions:taskStatus}= {status.pk} AND {actions:alertPriority}= {priority.pk}  AND {actions:parent} IS NULL AND {actions:clientType}={clientType.pk} and {actions:functionalArea}={functionalArea.pk}";
	private final String ROLE_APPEND_QUERY = " AND ({actions:principalAssigned}=?user OR {actions:owner}=?user OR {actions:principalAssigned} IN (?allgroups))";
	private final String ROLE_APPEND_QUERY_BY_USER = " AND {actions:principalAssigned}=?user";
	private final String ROLE_APPEND_QUERY_SUPERVISOR = " order by {actions:order}, action";
	private final String ROLE_APPEND_QUERY_ASSIGNED_TO_ME = " AND ({actions:principalAssigned}=?user OR {actions:principalAssigned} IN (?allgroups))";
	private final String ROLE_APPEND_QUERY_ASSIGNED_BY_ME = " AND ({actions:assignedBy}=?user OR {actions:principalAssigned} IN (?allgroups))";
	private final String QUERY_GET_TASK_BY_CODE = "SELECT {PK} from {WORKFLOWACTION} where {CODE}=?code";
	private final String QUERY_GET_TASK_BY_NAME = "SELECT {PK} from {WORKFLOWACTION} where {NAME}=?name";
	private final String QUERY_FIND_SUBTASKS = "SELECT {PK} from {WORKFLOWACTION} where {parent} = ?parent";
	//private final String QUERY_ACTION_SEARCH_BASE = "SELECT {actions:PK} action, {actions:activated} activated, {actions:comment} actioncomment, {workflows:PK} workflow FROM {WORKFLOWACTION as actions}, {Workflow as workflows}, {WorkflowActionStatus as status} WHERE {actions:workflow}={workflows:pk} AND {actions:status}= {status.pk}";
	private final String QUERY_GET_ALL_NOTIFICATIONS = "SELECT {PK} from {WORKFLOWACTION as actions} where {actions:alertRead}=false AND {actions:isAlert}=true AND {actions:principalAssigned}=?user";
	private final String QUERY_GET_NOTIFICATION_BY_CODE = "SELECT {PK} from {WORKFLOWACTION} where {CODE}=?code";
	private final String QUERY_DISMISS_NOTIFICATION_BY_CODE = "SELECT {PK} from {WORKFLOWACTION} where {CODE}=?code";
	private final String QUERY_VIEW_SNAPSHOT_USER = "Select {taskStatus:name},COUNT({action:pk}),COUNT(case when {action:duedate} < CURDATE() then 1 else null end) from {workflowaction as action},{ToDoTaskStatus as taskStatus},{Principal as user},{TaskType as taskType} where {action:taskStatus} = {taskStatus:pk} and {action:principalAssigned}={user:pk} and {action:taskType}={taskType.pk} and {taskType:code}!='SUB_TASK' and ({action:assignedBy} = ?user OR {action:owner} =?user or {action:principalAssigned} =?user) group by {taskStatus:name}";
	private final String QUERY_VIEW_SNAPSHOT_SUPERVISOR = "Select {user:uid},{status:name},COUNT({action:pk}),COUNT(case when {action:duedate} < CURDATE() then 1 else null end)from {workflowaction as action},{ToDoTaskStatus as status},{Principal as user},{TaskType as taskType}  where {action:taskStatus} = {status:pk} and {action:principalAssigned}={user:pk} and {action:taskType}={taskType.pk} and {taskType:code}!='SUB_TASK' group by {user:uid},{status:name}";
	private final String QUERY_FIND_SPECIFIC_TASKS = "SELECT {PK} from {WORKFLOWACTION} where {CODE} IN (?tasks)";
	private final String QUERY_GET_ALL_COMPANIES_BY_NAME_UID = "SELECT {UID},{NAME} from {COMPANY}";
	private final String QUERY_GET_ALL_MARKETS_BY_NAME_UID = "SELECT {UID},{NAME} from {MARKET}";
	private final String QUERY_GET_ALL_DUE_DATE_EXP_TASKS = "SELECT {PK} from {WORKFLOWACTION} where {duedate}<now()";
	private final String QUERY_GET_NUMBER_OF_UNASSIGNED_TASKS = "Select COUNT({action:pk}) from {workflowaction as action},{TaskCategory as taskCategory},{ToDoTaskStatus as taskStatus} where {action:taskCategory}={taskCategory:pk} and {action:taskStatus}={taskStatus:pk} and {action:assignedTo} is NULL and {taskStatus:code}=?taskStatus and {taskCategory:code}=?taskCategory";
	private final String QUERY_GET_UNASSIGNED_TASKS = "Select {action:pk} from {workflowaction as action},{TaskCategory as taskCategory},{ToDoTaskStatus as taskStatus} where {action:taskCategory}={taskCategory:pk} and {action:taskStatus}={taskStatus:pk} and  {action:assignedTo} is NULL and {taskStatus:code}=?taskStatus and {taskCategory:code}=?taskCategory";
	private final String QUERY_CREATER_USER = " and {action:owner}=?user";
	private final String SORT_BY_ORDER = " order by {action:order}";

	@Override
	public SearchPageData<WorkflowActionModel> searchTasks(final WorkflowActionSearchData seachData,
			final PageableData pageableData, final String taskUser, final String status, final boolean overdue)
	{
		final UserModel user = getUserService().getCurrentUser();
		final StringBuilder query = new StringBuilder(QUERY_ACTION_SEARCH_BASE);
		final Map queryParams = new HashMap();
		SearchPageData<WorkflowActionModel> result = new SearchPageData<WorkflowActionModel>();

		if (StringUtils.isNotEmpty(status))
		{
			query.append(" AND {status.name} = ?status");
			queryParams.put("status", status);
		}
		if (overdue)
		{
			query.append(" AND {actions:duedate} < CURDATE()");
		}
		if (StringUtils.isNotEmpty(seachData.getPriority()))
		{
			query.append(" AND {priority.code} = ?priority");
			queryParams.put("priority", seachData.getPriority());
		}

		if (StringUtils.isNotEmpty(seachData.getClientType()))
		{
			query.append(" AND {clientType.code} = ?clientType");
			queryParams.put("clientType", seachData.getClientType());
		}

		if (StringUtils.isNotEmpty(seachData.getFunctionalArea()))
		{
			query.append(" AND {functionalArea.code} = ?functionalArea");
			queryParams.put("functionalArea", seachData.getFunctionalArea());
		}

		if (StringUtils.isNotEmpty(seachData.getCompanyName()))
		{
			query.append(" AND {company} = ?company");
			queryParams.put("company", getCompanyByCode(seachData.getCompanyName()));
		}

		if (StringUtils.isNotEmpty(seachData.getCompanyMarket()))
		{
			query.append(" AND {market} = ?market");
			queryParams.put("market", getMarketByCode(seachData.getCompanyMarket()));
		}

		if (StringUtils.isNotEmpty(seachData.getProductName()))
		{
			try
			{
				final ProductModel product = productService.getProductForCode(seachData.getProductName());
				if (product != null)
				{
					query.append(" AND {product} = ?product");
					queryParams.put("product", product);
				}
			}
			catch (final UnknownIdentifierException e)
			{
				LOG.info("Product Not Found");
				final PaginationData paginationData = new PaginationData();
				paginationData.setCurrentPage(0);
				paginationData.setNumberOfPages(0);
				paginationData.setTotalNumberOfResults(0);
				result.setPagination(new PaginationData());
				return result;
			}
		}

		if (StringUtils.isNotEmpty(seachData.getName()))
		{
			query.append(" AND {actions:name}= ?name");
			queryParams.put("name", seachData.getName());
		}

		if (StringUtils.isNotEmpty(seachData.getFileHandler()))
		{
			try
			{
				final UserModel secondaryAssignedUser = getUserService().getUserForUID(seachData.getFileHandler());

				query.append(" AND {actions:secondaryAssignedUser}= ?secondaryAssignedUser");
				queryParams.put("secondaryAssignedUser", secondaryAssignedUser);
			}
			catch (final Exception e)
			{
				LOG.error(e.getMessage(), e);
			}
		}

		if ((seachData.isAssignedByMe() && seachData.isAssignedToMe())
				|| (!seachData.isAssignedByMe() && !seachData.isAssignedToMe()))
		{
			if (!isSupervisor(user))
			{
				query.append(ROLE_APPEND_QUERY);
			}
		}

		else if (seachData.isAssignedToMe())
		{
			query.append(ROLE_APPEND_QUERY_ASSIGNED_TO_ME);
		}
		else if (seachData.isAssignedByMe())
		{
			query.append(ROLE_APPEND_QUERY_ASSIGNED_BY_ME);
		}
		if (StringUtils.isNotEmpty(taskUser))
		{
			try
			{
				final UserModel queriedUser = getUserService().getUserForUID(taskUser);
				query.append(ROLE_APPEND_QUERY_BY_USER);
				queryParams.put("user", queriedUser);

			}
			catch (final UnknownIdentifierException e)
			{
				query.append(ROLE_APPEND_QUERY_BY_USER);
				final UserGroupModel queriedGroup = getUserService().getUserGroupForUID(taskUser);
				queryParams.put("user", queriedGroup);
			}
		}
		else
		{
			queryParams.put("user", user);
		}
		query.append(ROLE_APPEND_QUERY_SUPERVISOR);
		queryParams.put("allgroups", user.getAllGroups());
		result = getPagedFlexibleSearchService().search(query.toString(), queryParams, pageableData);
		TravelogixLogUtilityService.auditQueryLog(query.toString());
		return result;
	}

	@Override
	public WorkflowActionModel findTask(final String code)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(QUERY_GET_TASK_BY_CODE);
		query.addQueryParameter("code", code);
		return getFlexibleSearchService().searchUnique(query);
	}

	@Override
	public SearchResult<ArrayList> findSnapShot()
	{
		final UserModel user = getUserService().getCurrentUser();
		if (isSupervisor(user))
		{
			final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(QUERY_VIEW_SNAPSHOT_SUPERVISOR);
			fQuery.setResultClassList(Arrays.asList(String.class, String.class, String.class, String.class));
			return getFlexibleSearchService().search(fQuery);
		}
		final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(QUERY_VIEW_SNAPSHOT_USER);
		fQuery.addQueryParameter("user", user);
		fQuery.setResultClassList(Arrays.asList(String.class, String.class, String.class));
		return getFlexibleSearchService().search(fQuery);
	}

	@Override
	public List<WorkflowActionModel> findTasks(final String tasks)
	{
		final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(QUERY_FIND_SPECIFIC_TASKS);
		fQuery.addQueryParameter("tasks", Arrays.asList(tasks.split(",")));
		final SearchResult<WorkflowActionModel> searchResult = getFlexibleSearchService().search(fQuery);
		final List<WorkflowActionModel> workflowActionModels = searchResult.getResult();
		return workflowActionModels;
	}

	/**
	 * Getting list of Notifications
	 */
	@Override
	public List<WorkflowActionModel> findNotifications()
	{
		final UserModel user = getUserService().getCurrentUser();
		final Map queryParams = new HashMap();
		queryParams.put("user", user);
		//queryParams.put("allgroups", user.getAllGroups());

		final SearchResult<WorkflowActionModel> searchResult = getFlexibleSearchService().search(QUERY_GET_ALL_NOTIFICATIONS,
				queryParams);
		final List<WorkflowActionModel> workflowActionModels = searchResult.getResult();
		return workflowActionModels;
	}

	/**
	 * Find Notification by code
	 *
	 * @param notificationCode
	 */
	@Override
	public WorkflowActionModel findNotification(final String notificationCode)
	{
		final Map queryParams = new HashMap();
		queryParams.put("code", notificationCode);
		final SearchResult<WorkflowActionModel> results = getFlexibleSearchService().search(QUERY_GET_NOTIFICATION_BY_CODE,
				queryParams);
		if (null != results.getResult() && !results.getResult().isEmpty())
		{
			return results.getResult().get(0);
		}
		return null;
	}

	/**
	 * Remove Notification by code
	 *
	 * @param notificationCode
	 */
	@Override
	public WorkflowActionModel dismissNotification(final String notificationCode)
	{
		final Map queryParams = new HashMap();
		queryParams.put("code", notificationCode);

		final SearchResult<WorkflowActionModel> results = getFlexibleSearchService().search(QUERY_DISMISS_NOTIFICATION_BY_CODE,
				queryParams);
		if (null != results.getResult() && !results.getResult().isEmpty())
		{
			return results.getResult().get(0);
		}
		return null;
	}


	@Override
	public List<WorkflowActionModel> getTasksByName(final String taskName)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(QUERY_GET_TASK_BY_NAME);
		query.addQueryParameter("name", taskName);
		final SearchResult<WorkflowActionModel> results = getFlexibleSearchService().search(query);
		List<WorkflowActionModel> workFlowActions = new ArrayList<>();
		if (results != null)
		{
			workFlowActions = results.getResult();
		}
		return workFlowActions;
	}

	@Override
	public SearchResult<ArrayList> getAllCompaniesByName()
	{
		final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(QUERY_GET_ALL_COMPANIES_BY_NAME_UID);
		fQuery.setResultClassList(Arrays.asList(String.class, String.class));
		return getFlexibleSearchService().search(fQuery);
	}

	@Override
	public SearchResult<ArrayList> getAllCompanyMarketsByName()
	{
		final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(QUERY_GET_ALL_MARKETS_BY_NAME_UID);
		fQuery.setResultClassList(Arrays.asList(String.class, String.class));
		return getFlexibleSearchService().search(fQuery);
	}

	@Override
	public CompanyModel getCompanyByCode(final String code)
	{
		final List<CompanyModel> companies = companyGenericDao.find(Collections.singletonMap(CompanyModel.UID, code));
		if (companies.size() > 1)
		{
			throw new AmbiguousIdentifierException("Found " + companies.size() + " companies for " + code);
		}
		return CollectionUtils.isEmpty(companies) ? null : companies.get(0);
	}

	@Override
	public MarketModel getMarketByCode(final String code)
	{
		final List<MarketModel> markets = marketGenericDao.find(Collections.singletonMap(MarketModel.UID, code));
		if (markets.size() > 1)
		{
			throw new AmbiguousIdentifierException("Found " + markets.size() + " markets for " + code);
		}
		return CollectionUtils.isEmpty(markets) ? null : markets.get(0);
	}

	@Override
	public List<WorkflowActionModel> findSubTasks(final WorkflowActionModel parent)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(QUERY_FIND_SUBTASKS);
		query.addQueryParameter("parent", parent);
		final SearchResult<WorkflowActionModel> results = getFlexibleSearchService().search(query);
		List<WorkflowActionModel> workFlowActions = new ArrayList<>();
		if (results != null)
		{
			workFlowActions = results.getResult();
		}
		return workFlowActions;
	}

	@Override
	public SearchPageData<WorkflowActionModel> findTaskByOrderReference(final String code)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkflowActionModel> findDueDateExpTasks()
	{
		final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(QUERY_GET_ALL_DUE_DATE_EXP_TASKS);
		final SearchResult<WorkflowActionModel> searchResult = flexibleSearchService.search(fQuery);
		final List<WorkflowActionModel> workflowActionModels = searchResult.getResult();
		return workflowActionModels;
	}

	/**
	 * @return the pagedFlexibleSearchService
	 */
	public PagedFlexibleSearchService getPagedFlexibleSearchService()
	{
		return pagedFlexibleSearchService;
	}

	/**
	 * @param pagedFlexibleSearchService
	 *           the pagedFlexibleSearchService to set
	 */
	public void setPagedFlexibleSearchService(final PagedFlexibleSearchService pagedFlexibleSearchService)
	{
		this.pagedFlexibleSearchService = pagedFlexibleSearchService;
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
	 * @return the flexibleSearchService
	 */
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	/**
	 * @param flexibleSearchService
	 *           the flexibleSearchService to set
	 */
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
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
	 * @return the companyGenericDao
	 */
	public GenericDao<CompanyModel> getCompanyGenericDao()
	{
		return companyGenericDao;
	}

	/**
	 * @param companyGenericDao
	 *           the companyGenericDao to set
	 */
	public void setCompanyGenericDao(final GenericDao<CompanyModel> companyGenericDao)
	{
		this.companyGenericDao = companyGenericDao;
	}

	/**
	 * @return the marketGenericDao
	 */
	public GenericDao<MarketModel> getMarketGenericDao()
	{
		return marketGenericDao;
	}

	/**
	 * @param marketGenericDao
	 *           the marketGenericDao to set
	 */
	public void setMarketGenericDao(final GenericDao<MarketModel> marketGenericDao)
	{
		this.marketGenericDao = marketGenericDao;
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
		String query = new String(QUERY_GET_NUMBER_OF_UNASSIGNED_TASKS);
		final Map queryParams = new HashMap();

		if (!isSupervisor(getUserService().getCurrentUser()))
		{
			query = query + QUERY_CREATER_USER;
			queryParams.put("user", getUserService().getCurrentUser());
		}
		queryParams.put("taskCategory", TaskCategory.USER_CREATED.getCode());
		queryParams.put("taskStatus", ToDoTaskStatus.OPEN.getCode());
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(query);
		fsq.setResultClassList(Arrays.asList(Integer.class));
		fsq.addQueryParameters(queryParams);
		final SearchResult<Integer> results = getFlexibleSearchService().search(fsq);
		return results.getResult().get(0);
	}

	@Override
	public SearchPageData<WorkflowActionModel> getUnassginedTasks(final WorkflowActionSearchData workflowActionSearchData,
			final PageableData pageableData)
	{
		final StringBuilder query = new StringBuilder(QUERY_GET_UNASSIGNED_TASKS);
		final Map queryParams = new HashMap();
		SearchPageData<WorkflowActionModel> result = new SearchPageData<WorkflowActionModel>();

		if (!isSupervisor(getUserService().getCurrentUser()))
		{
			query.append(QUERY_CREATER_USER);
			queryParams.put("user", getUserService().getCurrentUser());
		}
		query.append(SORT_BY_ORDER);
		queryParams.put("taskCategory", TaskCategory.USER_CREATED.getCode());
		queryParams.put("taskStatus", ToDoTaskStatus.OPEN.getCode());
		result = getPagedFlexibleSearchService().search(query.toString(), queryParams, pageableData);
		TravelogixLogUtilityService.auditQueryLog(query.toString());
		return result;
	}

	/**
	 * @return the enumerationService
	 */
	public EnumerationService getEnumerationService()
	{
		return enumerationService;
	}

	/**
	 * @param enumerationService
	 *           the enumerationService to set
	 */
	public void setEnumerationService(final EnumerationService enumerationService)
	{
		this.enumerationService = enumerationService;
	}

	@Override
	public boolean isSupervisor(final UserModel user)
	{
		for (final PrincipalGroupModel principalGroupModel : user.getAllGroups())
		{
			if (principalGroupModel.getUid().equals(ROLE_SUPERVISOR_GROUP))
			{
				return true;
			}
		}
		return false;
	}

}
