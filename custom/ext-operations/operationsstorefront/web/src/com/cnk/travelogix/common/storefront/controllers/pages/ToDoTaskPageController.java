/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *  
 */
package com.cnk.travelogix.common.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cnk.travelogix.client.masters.core.enums.ClientCategory;
import com.cnk.travelogix.client.masters.core.enums.ClientSubCategory;
import com.cnk.travelogix.common.core.enums.AlertPriority;
import com.cnk.travelogix.common.core.enums.FunctionalArea;
import com.cnk.travelogix.common.core.enums.TaskCategory;
import com.cnk.travelogix.common.core.enums.TaskType;
import com.cnk.travelogix.common.core.enums.ToDoTaskStatus;
import com.cnk.travelogix.common.storefront.controllers.ControllerConstants;
import com.cnk.travelogix.common.storefront.forms.ToDoApprovalTaskForm;
import com.cnk.travelogix.common.storefront.forms.WorkflowActionCreateForm;
import com.cnk.travelogix.common.storefront.forms.WorkflowActionSearchForm;
import com.cnk.travelogix.exception.commonlogging.customexception.RecordLockedException;
import com.cnk.travelogix.masterdata.core.enums.ClientType;
import com.cnk.travelogix.operations.data.ToDoApprovalTaskData;
import com.cnk.travelogix.operations.data.ToDoSnapshotData;
import com.cnk.travelogix.operations.data.WorkflowActionData;
import com.cnk.travelogix.operations.data.WorkflowActionSearchData;
import com.cnk.travelogix.operations.employee.data.EmployeeData;
import com.cnk.travelogix.operations.facades.EmployeeFacade;
import com.cnk.travelogix.operations.facades.OrderListFacade;
import com.cnk.travelogix.operations.facades.ToDoTaskFacade;


/**
 * Controller for TO do task page
 */
@Controller
@Scope("tenant")
@RequestMapping(value = "/todo")
public class ToDoTaskPageController extends AbstractSearchPageController
{

	protected static final Logger LOG = Logger.getLogger(ToDoTaskPageController.class);
	private static final String TASK_PATH_VARIABLE_PATTERN = "{taskCode:.*}";
	private static final String TASK_ACTION_VARIABLE_PATTERN = "{taskAction:.*}";
	private static final String TASK_ACT_VARIABLE_PATTERN = "{act:.*}";
	private static final String TASK_ORDER_VARIABLE_PATTERN = "{orderCode:.*}";

	private static final String REDIRECT_TO_TODO_PAGE = "redirect:/todo";
	private static final String RECORD_ADDED_SUCCESSFULLY="todo.task.record.added";
	private static final String RECORD_ALREADY_EXISTS ="todo.task.record.duplicate";
	private static final String RECORD_LOCK_UNLOCK ="todo.task.record.lockunlock";
	private static final String RECORD_LOCKED ="todo.task.record.locked";
	private static final String TASK_WORKFLOW_STARTED = "todo.task.workflow.started";
	private static final String TASK_WORKFLOW_FAILED = "todo.task.workflow.failed";
	private static final String TASK_WORKFLOW_EDIT_NOTALLOWD = "todo.task.workflow.edit.notallowed";
	private static final String ORDER_NOT_FOUND = "todo.task.order.not.found";
	private static final String TO_DO_DETAIL_PAGE = "toDoDetailPage";
	private static final String TO_DO_PAGE = "toDoPage";
	private static final String REASSIGN_ACCESS_DENIED = "todo.task.reassign.access.denied";
	private static final String ONLY_APPROVED_TASKS_ASSIGNED = "todo.task.approved.task.to.be.assigned";
	

	@Resource(name = "toDoTaskFacade")
	private ToDoTaskFacade toDoTaskFacade;

	@Resource
	private OrderListFacade orderListFacade;

	@Resource
	private EnumerationService enumerationService;

	@Resource
	private EmployeeFacade employeeFacade;

	@RequestMapping(value = "/snapshot", method = RequestMethod.GET)
	public String viewSnapshot(@RequestParam(value="wise", defaultValue ="userWise") final String wise, final Model model) throws CMSItemNotFoundException
	{
		final List<ToDoSnapshotData> toDoSnapshotDatas = getToDoTaskFacade().getSnapshot(wise);
		final Integer totalUnassignedTasks=getToDoTaskFacade().getNumberOfUnassignedTasks();
		model.addAttribute("toDoSnapshotDatas", toDoSnapshotDatas);
		model.addAttribute("wise", wise);
		model.addAttribute("unassginedTasks", totalUnassignedTasks);
		storeCmsPageInModel(model, getContentPageForLabelOrId(TO_DO_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(TO_DO_PAGE));
		return ControllerConstants.Views.Pages.ToDoTask.ToDoTaskSnapshotPage;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String findAllToDo(@RequestParam(value = "user", required = false) final String user,
			@RequestParam(value = "status", required = false) final String status,
			@RequestParam(value = "overdue", required = false) final boolean overdue, final Model model)
			throws CMSItemNotFoundException
	{
		final PageableData pageableData = createPageableData(0, 10, null, ShowMode.Page);

		final WorkflowActionSearchForm workflowActionSearchForm = new WorkflowActionSearchForm();
		final SearchPageData<WorkflowActionData> searchPageData = getToDoTaskFacade()
				.searchTasks(populateSearchData(workflowActionSearchForm), pageableData,user,status,overdue);
		model.addAttribute("groupData", groupData(searchPageData));
		model.addAttribute("searchPageData", searchPageData);
		populateModel(model, searchPageData, ShowMode.Page);
		model.addAttribute("workflowActionSearchForm", workflowActionSearchForm);
		storeCmsPageInModel(model, getContentPageForLabelOrId(TO_DO_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(TO_DO_PAGE));
		return ControllerConstants.Views.Pages.ToDoTask.ToDoTaskPage;
	}

	
	@RequestMapping(value = "/unassignedTasks",method = RequestMethod.GET)
	public String findUnassginedTasks(final Model model)
			throws CMSItemNotFoundException
	{
		final PageableData pageableData = createPageableData(0, 10, null, ShowMode.Page);
		final WorkflowActionSearchForm workflowActionSearchForm = new WorkflowActionSearchForm();
		final SearchPageData<WorkflowActionData> searchPageData = getToDoTaskFacade()
				.getUnassignedTasks(populateSearchData(workflowActionSearchForm), pageableData);
		model.addAttribute("groupData", groupData(searchPageData));
		model.addAttribute("searchPageData", searchPageData);
		populateModel(model, searchPageData, ShowMode.Page);
		model.addAttribute("workflowActionSearchForm", workflowActionSearchForm);
		storeCmsPageInModel(model, getContentPageForLabelOrId(TO_DO_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(TO_DO_PAGE));
		return ControllerConstants.Views.Pages.ToDoTask.ToDoTaskPage;
	}

	@RequestMapping(value = "/reAssign", method = RequestMethod.GET)
	public String assignReassignTasks(@RequestParam(value = "tasks") final String tasks, @RequestParam(value = "user") final String user,
			final Model model,final RedirectAttributes redirectModel) throws CMSItemNotFoundException
	{
		try
		{
			if (!getToDoTaskFacade().assignReassignTasks(tasks, user))
			{
				GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.ERROR_MESSAGES_HOLDER, ONLY_APPROVED_TASKS_ASSIGNED);
			}
		}
		catch (AccessDeniedException e)
		{
			GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.ERROR_MESSAGES_HOLDER, e.getMessage());
		}
		storeCmsPageInModel(model, getContentPageForLabelOrId(TO_DO_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(TO_DO_PAGE));
		return REDIRECT_TO_TODO_PAGE;
	}

	@RequestMapping(value = "/approval/" + TASK_ACT_VARIABLE_PATTERN, method = RequestMethod.GET)
	public String approval(@PathVariable("act") final String act, final ToDoApprovalTaskForm form, final Model model)
			throws CMSItemNotFoundException
	{
		final ToDoApprovalTaskData toDoApprovalTaskData = new ToDoApprovalTaskData();
		toDoApprovalTaskData.setCode(form.getCode());
		toDoApprovalTaskData.setRemark(form.getRemark());
		getToDoTaskFacade().unlock(form.getCode());
		if (act.equalsIgnoreCase("approved"))
		{
			final String approved = getToDoTaskFacade().approveTask(toDoApprovalTaskData);
			final Object[] args = new Object[1];
			args[0] = approved;
			GlobalMessages.addMessage(model, GlobalMessages.CONF_MESSAGES_HOLDER, approved, args);
		}
		else
		{
			String reject = getToDoTaskFacade().rejectTask(toDoApprovalTaskData);
			final Object[] args = new Object[1];
			args[0] = reject;
			GlobalMessages.addMessage(model, GlobalMessages.CONF_MESSAGES_HOLDER, reject, args);
		}
		return findAllToDo(null, null, false, model);
	}
	
	@RequestMapping(value = "/task/" + TASK_ACTION_VARIABLE_PATTERN + "/" + TASK_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
	public String task(@PathVariable("taskCode") final String taskCode, @PathVariable("taskAction") final String taskAction,
			final Model model) throws CMSItemNotFoundException, RecordLockedException
	{
		final WorkflowActionData workflowActionData = getToDoTaskFacade().getTask(taskCode);
		
		if (taskAction.equalsIgnoreCase("view"))
		{
			model.addAttribute("toDoViewAction", true);
		}
		else
		{
			model.addAttribute("toDoViewAction", false);
		}
		
		if (taskAction.equalsIgnoreCase("edit"))
		{
			if(!(getToDoTaskFacade().isEditAllowed(taskCode)))
			{
				GlobalMessages.addMessage(model, GlobalMessages.ERROR_MESSAGES_HOLDER, TASK_WORKFLOW_EDIT_NOTALLOWD, null);
				task(taskCode, "view", model);
			}
			
			model.addAttribute("isAllowedToEditPriority", toDoTaskFacade.getPermissionsForEdit(taskCode));
			model.addAttribute("toDoEditAction", true);
		}
		else
		{
			model.addAttribute("toDoEditAction", false);
		}
		
		if(taskAction.equalsIgnoreCase("submit")){
			getToDoTaskFacade().unlock(taskCode);
			final boolean started = getToDoTaskFacade().startWorkflow(taskCode);
			if(started){
				GlobalMessages.addMessage(model, GlobalMessages.CONF_MESSAGES_HOLDER, TASK_WORKFLOW_STARTED, null);
			}
			else
			{
				GlobalMessages.addMessage(model, GlobalMessages.ERROR_MESSAGES_HOLDER, TASK_WORKFLOW_FAILED, null);
			}

			return findAllToDo(null,null,false,model);
		}
		
		if (workflowActionData != null && taskAction.equalsIgnoreCase("edit")) {
   		if (workflowActionData.getLockedBy() == null || workflowActionData.getLockedBy() == "")
   		{
   			getToDoTaskFacade().lock(taskCode);
   		} else {
   			final PageableData pageableData = createPageableData(0, 10, null, ShowMode.Page);
				final WorkflowActionSearchForm workflowActionSearchForm = new WorkflowActionSearchForm();
				final SearchPageData<WorkflowActionData> searchPageData = getToDoTaskFacade()
						.searchTasks(populateSearchData(workflowActionSearchForm), pageableData,null,null,false);
				model.addAttribute("groupData", groupData(searchPageData));
				model.addAttribute("searchPageData", searchPageData);
				populateModel(model, searchPageData, ShowMode.Page);
				model.addAttribute("workflowActionSearchForm", workflowActionSearchForm);
				model.addAttribute("recordLockedMsg", taskCode + " ==> Record is locked");
				storeCmsPageInModel(model, getContentPageForLabelOrId(TO_DO_PAGE));
				setUpMetaDataForContentPage(model, getContentPageForLabelOrId(TO_DO_PAGE));
				final Object[] args = new Object[1];
				args[0] = workflowActionData.getLockedBy();
				GlobalMessages.addMessage(model, GlobalMessages.ERROR_MESSAGES_HOLDER, RECORD_LOCKED, args);
				return ControllerConstants.Views.Pages.ToDoTask.ToDoTaskPage;
   		}
		}
		
		toDoTaskFacade.updateTaskReadByAssigneeFlag(taskCode);
		final WorkflowActionCreateForm form = new WorkflowActionCreateForm();
		model.addAttribute("workflowActionData", workflowActionData);
		populateSearchForm(form, workflowActionData);
		model.addAttribute("workflowActionCreateForm", form);
		storeCmsPageInModel(model, getContentPageForLabelOrId(TO_DO_DETAIL_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(TO_DO_DETAIL_PAGE));
		return ControllerConstants.Views.Pages.ToDoTask.ToDoTaskDetailPage;
	}

	@RequestMapping(value = "/viewSubtasks/"
			+ TASK_PATH_VARIABLE_PATTERN, method = RequestMethod.GET, produces = "application/json")
	public String getSubTasks(@PathVariable("taskCode") final String parentTaskCode, final Model model)
			throws CMSItemNotFoundException
	{
		final List<WorkflowActionData> taskDatas = getToDoTaskFacade().getSubTasks(parentTaskCode);
		model.addAttribute("tasks", taskDatas);
		return ControllerConstants.Views.Fragments.ToDoTask.ToDoSubTasksJson;
	}
	
	@RequestMapping(value = "/searchToDo", method = RequestMethod.POST)
	public String seacrhTasks(final WorkflowActionSearchForm workflowActionSearchForm, final BindingResult result,
			final Model model, final RedirectAttributes redirectModel, @RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "show", defaultValue = "Page") final ShowMode showMode,
			@RequestParam(value = "sort", required = false) final String sortCode) throws CMSItemNotFoundException
	{
		if (result.hasErrors())
		{
			for (ObjectError error : result.getAllErrors())
			{
				LOG.error(error.getCode() + ": " + error.getDefaultMessage());
			}
			GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.CONF_MESSAGES_HOLDER,
					"workflow.action.search.processingError");
		}

		final PageableData pageableData = createPageableData(page, workflowActionSearchForm.getPageSize(), sortCode, showMode);
		final WorkflowActionSearchData workflowActionSearchData = populateSearchData(workflowActionSearchForm);
		final SearchPageData<WorkflowActionData> searchPageData = getToDoTaskFacade().searchTasks(workflowActionSearchData,
				pageableData,null,null,false);
		if (searchPageData == null)
		{
			GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.CONF_MESSAGES_HOLDER, "todo.task.record.norecord.found");
		}
		populateModel(model, searchPageData, showMode);
		model.addAttribute("workflowActionCreateForm", new WorkflowActionCreateForm());
		model.addAttribute("searchPageData", searchPageData);
		model.addAttribute("groupData", groupData(searchPageData));
		model.addAttribute("workflowActionSearchForm", workflowActionSearchForm);
		storeCmsPageInModel(model, getContentPageForLabelOrId(TO_DO_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(TO_DO_PAGE));
		return ControllerConstants.Views.Pages.ToDoTask.ToDoTaskPage;
	}

	@RequestMapping(value = "/createToDo", method = RequestMethod.GET)
	public String getCreatePage(@RequestParam(value = "parent", required = false) final String parent,@RequestParam(value = "order", required = false) final String order,@RequestParam(value = "product", required = false) final String product, final Model model)
			throws CMSItemNotFoundException
	{
		final WorkflowActionCreateForm form = new WorkflowActionCreateForm();
		if (StringUtils.isNotEmpty(parent))
		{
			form.setParent(parent);
		}
		if(StringUtils.isNotEmpty(order)){
			form.setOrderCode(order);
		}
		if(StringUtils.isNoneEmpty(product)){
			form.setProduct(product);
		}
		model.addAttribute("workflowActionCreateForm", form);
		storeCmsPageInModel(model, getContentPageForLabelOrId(TO_DO_DETAIL_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(TO_DO_DETAIL_PAGE));
		return ControllerConstants.Views.Pages.ToDoTask.ToDoTaskCreatePage;
	}

	@RequestMapping(value = "/createToDo", method = RequestMethod.POST)
	public String createTask(final WorkflowActionCreateForm workflowActionCreateForm, final RedirectAttributes redirectModel,
			final Model model) throws CMSItemNotFoundException
	{
		try
		{
			GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.CONF_MESSAGES_HOLDER, RECORD_ADDED_SUCCESSFULLY);
			getToDoTaskFacade().createTasks(populateCreateData(workflowActionCreateForm));
			return REDIRECT_TO_TODO_PAGE;
		}
		catch (DuplicateKeyException e)
		{
			GlobalMessages.addMessage(model, GlobalMessages.ERROR_MESSAGES_HOLDER, RECORD_ALREADY_EXISTS, null);

		}
		catch (UnknownIdentifierException e)
		{
			GlobalMessages.addMessage(model, GlobalMessages.ERROR_MESSAGES_HOLDER, e.getMessage(), null);
		}

		catch (ModelNotFoundException e)
		{
			final Object[] args = new Object[1];
			args[0]=workflowActionCreateForm.getOrderCode();
			GlobalMessages.addMessage(model, GlobalMessages.ERROR_MESSAGES_HOLDER,ORDER_NOT_FOUND,args);
		}
		catch (AccessDeniedException e) {
			GlobalMessages.addMessage(model, GlobalMessages.ERROR_MESSAGES_HOLDER,e.getMessage(),null);
		}
		model.addAttribute("workflowActionCreateForm", workflowActionCreateForm);
		storeCmsPageInModel(model, getContentPageForLabelOrId(TO_DO_DETAIL_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(TO_DO_DETAIL_PAGE));
		return ControllerConstants.Views.Pages.ToDoTask.ToDoTaskCreatePage;
		
	}
	@RequestMapping(value = "/releaseToDo", method = RequestMethod.GET)
	public String releaseTask(@RequestParam(value = "code", required = true) final String code,@RequestParam(value="cancel",defaultValue="false")final boolean isCancel, final RedirectAttributes redirectModel, final Model model)
			throws CMSItemNotFoundException
	{
		final WorkflowActionCreateForm form = new WorkflowActionCreateForm();
		if (code != null && (!code.isEmpty()))
		{
			form.setCode(code);
		}
		getToDoTaskFacade().unlock(form.getCode());
		if(!isCancel){
		GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.CONF_MESSAGES_HOLDER, RECORD_LOCK_UNLOCK);}
		
		return REDIRECT_TO_TODO_PAGE;		
	}

	public void populateSearchForm(final WorkflowActionCreateForm form, WorkflowActionData data)
	{
		if (data != null)
		{
			form.setCode(data.getCode());
			form.setDesc(data.getDesc());
			form.setFileHandler(data.getSecondaryAssignedUser());
			form.setName(data.getName());
			form.setOrderCode(data.getOrder() != null ? data.getOrder().getCode() : "");
			form.setPrincipal(data.getAssignedUser());
			form.setPriority(data.getPriority());
			form.setParent(data.getParent());
			form.setStatus(data.getTaskStatus());
			form.setTaskType(data.getTaskType());
			form.setTaskCategory(data.getTaskCategory());
			form.setProduct(data.getProduct() != null ? data.getProduct().getCode() : "");
			form.setLockedBy(data.getLockedBy());
			form.setDueDate(data.getDueDate());
			form.setClientCategory(data.getClientCategory());
			form.setClientSubCategory(data.getClientSubCategory());
			form.setClientType(data.getClientType());
			form.setFunctionalArea(data.getFunctionalArea());
			form.setCompanyMarket(data.getCompanyMarket());
			form.setCompanyName(data.getCompanyName());
			form.setAction(data.getSuggestedAction());
		}
	}

	/**
	 * @param searchPageData
	 * @return
	 */

	private Map<String, Integer> groupData(SearchPageData<WorkflowActionData> searchPageData)
	{
		Map<String, Integer> group = new HashMap<String, Integer>();
		for (final WorkflowActionData data : searchPageData.getResults())
		{
			if (data.getOrder() != null && data.getOrder().getCode() != null && (!data.getOrder().getCode().isEmpty()))
			{
				Integer value = group.get(data.getOrder().getCode());
				if (value != null)
				{
					group.put(data.getOrder().getCode(), value + 1);
				}
				else
				{
					group.put(data.getOrder().getCode(), 1);
				}
			}
		}
		return group;
	}

	@InitBinder
	public void dataBinding(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	} 

	@RequestMapping(value = "/updateToDo", method = RequestMethod.POST)
	public String updateTask(final WorkflowActionCreateForm workflowActionCreateForm, final RedirectAttributes redirectModel,
			final Model model) throws CMSItemNotFoundException
	{

		try{
			GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.CONF_MESSAGES_HOLDER, "todo.task.record.updated");
			getToDoTaskFacade().unlock(workflowActionCreateForm.getCode());
			getToDoTaskFacade().updateTasks(populateCreateData(workflowActionCreateForm));
			return REDIRECT_TO_TODO_PAGE;
			}
			catch(DuplicateKeyException e){
				GlobalMessages.addMessage(model, GlobalMessages.ERROR_MESSAGES_HOLDER,RECORD_ALREADY_EXISTS, null);
				storeCmsPageInModel(model, getContentPageForLabelOrId(TO_DO_DETAIL_PAGE));
				setUpMetaDataForContentPage(model, getContentPageForLabelOrId(TO_DO_DETAIL_PAGE));
				return ControllerConstants.Views.Pages.ToDoTask.ToDoTaskDetailPage;
			}
	}
	

	@RequestMapping(value = "/toDoOrder/" + TASK_ORDER_VARIABLE_PATTERN, method = RequestMethod.GET, produces = "application/json")
	public String getOrderProducts(@PathVariable("orderCode") final String orderCode, final Model model)
			throws CMSItemNotFoundException
	{
		try
		{
			final OrderData orderData = getOrderListFacade().getOrdersForCode(orderCode);
			final Map<String, String> products = new HashMap<String, String>();
			for (final OrderEntryData orderEntryData : orderData.getEntries())
			{
				final ProductData productData = orderEntryData.getProduct();
				if (productData != null)
				{
					products.put(productData.getCode(), productData.getName());
				}

			}
			model.addAttribute("products", products);
		}
		catch (final UnknownIdentifierException e)
		{
			LOG.info("No Order Found with Code" + orderCode);
			model.addAttribute("toDoError", "No Order Found With " + orderCode);
		}
		return ControllerConstants.Views.Fragments.ToDoTask.ToDoProductJson;
	}


	/**
	 * Creates the DTO object from Form object as the DTO object will be used to pass search information to facade layer.
	 *
	 * @param invoiceSearchForm
	 * @return invoiceSearchData
	 */
	private WorkflowActionSearchData populateSearchData(final WorkflowActionSearchForm workflowActionSearchForm)
	{
		final WorkflowActionSearchData workflowActionSearchData = new WorkflowActionSearchData();
		workflowActionSearchData.setAssignedByMe(workflowActionSearchForm.isAssignedByMe());
		workflowActionSearchData.setAssignedToMe(workflowActionSearchForm.isAssignedToMe());
		workflowActionSearchData.setPriority(workflowActionSearchForm.getPriority());
		workflowActionSearchData.setFileHandler(workflowActionSearchForm.getFileHandler());
		workflowActionSearchData.setName(workflowActionSearchForm.getName());
		workflowActionSearchData.setClientType(workflowActionSearchForm.getClientType());
		workflowActionSearchData.setProductName(workflowActionSearchForm.getProductName());
		workflowActionSearchData.setFunctionalArea(workflowActionSearchForm.getFunctionalArea());
		workflowActionSearchData.setCompanyMarket(workflowActionSearchForm.getCompanyMarket());
		workflowActionSearchData.setCompanyName(workflowActionSearchForm.getCompanyName());
		workflowActionSearchData.setLockedBy(workflowActionSearchForm.getLockedBy());
		workflowActionSearchData.setDueDate(workflowActionSearchForm.getDueDate());
		return workflowActionSearchData;
	}

	/**
	 * Creates the DTO object from Form object as the DTO object will be used to pass search information to facade layer.
	 *
	 * @param invoiceSearchForm
	 * @return invoiceSearchData
	 */
	private WorkflowActionData populateCreateData(final WorkflowActionCreateForm workflowActionCreateForm)
	{
		final WorkflowActionData workflowActionData = new WorkflowActionData();
		workflowActionData.setName(workflowActionCreateForm.getName());
		workflowActionData.setParent(workflowActionCreateForm.getParent());
		workflowActionData.setDesc(workflowActionCreateForm.getDesc());
		workflowActionData.setPriority(workflowActionCreateForm.getPriority().toUpperCase());
		workflowActionData.setAssignedUser(workflowActionCreateForm.getPrincipal());
		final OrderData order = new OrderData();
		order.setCode(workflowActionCreateForm.getOrderCode());
		workflowActionData.setOrder(order);
		workflowActionData.setStatus(workflowActionCreateForm.getStatus().toUpperCase());
		workflowActionData.setSecondaryAssignedUser(workflowActionCreateForm.getFileHandler());
		//workflowActionData.setName(workflowActionCreateForm.getName());
		workflowActionData.setCode(workflowActionCreateForm.getCode());
		workflowActionData.setDueDate(workflowActionCreateForm.getDueDate());
		workflowActionData.setTaskType(workflowActionCreateForm.getTaskType().toUpperCase());
		workflowActionData.setTaskCategory(workflowActionCreateForm.getTaskCategory().toUpperCase());
		workflowActionData.setLockedBy(workflowActionCreateForm.getLockedBy());
		final ProductData productData = new ProductData();
		productData.setCode(workflowActionCreateForm.getProduct());
		workflowActionData.setProduct(productData);
		workflowActionData.setCompanyName(workflowActionCreateForm.getCompanyName());
		workflowActionData.setCompanyMarket(workflowActionCreateForm.getCompanyMarket());
		workflowActionData.setClientCategory(workflowActionCreateForm.getClientCategory());
		workflowActionData.setClientSubCategory(workflowActionCreateForm.getClientSubCategory());
		workflowActionData.setClientType(workflowActionCreateForm.getClientType());
		workflowActionData.setFunctionalArea(workflowActionCreateForm.getFunctionalArea());
		workflowActionData.setSuggestedAction(workflowActionCreateForm.getAction());
		return workflowActionData;
	}

	@ModelAttribute("workflowStatus")
	public Map<String, String> getStatus()
	{
		List<ToDoTaskStatus> todoTaskStatuses = enumerationService.getEnumerationValues(ToDoTaskStatus.class);
		Map<String, String> workflowActionStatusMap = new HashMap<String, String>();
		for (ToDoTaskStatus workflowActionStatus : todoTaskStatuses)
		{
			workflowActionStatusMap.put(workflowActionStatus.getCode(), enumerationService.getEnumerationName(workflowActionStatus));
		}
		return workflowActionStatusMap;
	}

	@ModelAttribute("workflowPriority")
	public Map<String, String> getPriority()
	{
		AlertPriority[] alertPriorities = AlertPriority.values();
		Map<String, String> alertPriorityMap = new HashMap<String, String>();
		for (AlertPriority alertPriority : alertPriorities)
		{
			alertPriorityMap.put(alertPriority.getCode(), enumerationService.getEnumerationName(alertPriority));
		}
		return alertPriorityMap;
	}

	@ModelAttribute("taskTypes")
	public Map<String, String> getTaskType()
	{
		TaskType[] taskTypes = TaskType.values();
		Map<String, String> taskTypeMap = new HashMap<String, String>();
		for (TaskType taskType : taskTypes)
		{
			taskTypeMap.put(taskType.getCode(), enumerationService.getEnumerationName(taskType));
		}
		return taskTypeMap;
	}

	@ModelAttribute("taskCategories")
	public Map<String, String> getTaskCategories()
	{
		TaskCategory[] taskCategories = TaskCategory.values();
		Map<String, String> taskCategoryMap = new HashMap<String, String>();
		for (TaskCategory taskCategory : taskCategories)
		{
			taskCategoryMap.put(taskCategory.getCode(), enumerationService.getEnumerationName(taskCategory));
		}
		return taskCategoryMap;
	}


	@ModelAttribute("reAssignableUser")
	public List<EmployeeData> getReAssignableUser()
	{
		return getEmployeeFacade().getGroupMembers("wfl_group");
	}


	@ModelAttribute("clientType")
	public Map<String,String> getClientType()
	{
		List<ClientType> clientTypes = enumerationService.getEnumerationValues(ClientType.class);
		Map<String, String> clientTypeMap = new HashMap<String, String>();
		for (ClientType clientType : clientTypes)
		{
			clientTypeMap.put(clientType.getCode(), enumerationService.getEnumerationName(clientType));
		}
		return clientTypeMap;
	}

	@ModelAttribute("functionalArea")
	public Map<String,String> getFunctionalArea()
	{
		List<FunctionalArea> fAreas = enumerationService.getEnumerationValues(FunctionalArea.class);
		Map<String, String> fAreasMap = new HashMap<String, String>();
		for (FunctionalArea functionalArea : fAreas)
		{
			fAreasMap.put(functionalArea.getCode(), enumerationService.getEnumerationName(functionalArea));
		}
		return fAreasMap;
	}
	
	@ModelAttribute("clientCategories")
	public Map<String,String> getClientCategories()
	{
		List<ClientCategory> clientCategories = enumerationService.getEnumerationValues(ClientCategory.class);
		Map<String, String> clientCategoriesMap = new HashMap<String, String>();
		for (ClientCategory clientCategory : clientCategories)
		{
			clientCategoriesMap.put(clientCategory.getCode(), enumerationService.getEnumerationName(clientCategory));
		}
		return clientCategoriesMap;
	}
	
	@ModelAttribute("clientSubCategories")
	public Map<String,String> getClientSubCategories()
	{
		List<ClientSubCategory> clientSubCategories = enumerationService.getEnumerationValues(ClientSubCategory.class);
		Map<String, String> clientSubCatMap = new HashMap<String, String>();
		for (ClientSubCategory cSubCat : clientSubCategories)
		{
			clientSubCatMap.put(cSubCat.getCode(), enumerationService.getEnumerationName(cSubCat));
		}
		return clientSubCatMap;
	}
	
	@ModelAttribute("companies")
	public Map<String, String>  getCompanies()
	{
		Map<String, String>  companies = toDoTaskFacade.getAllCompanyNames();
		return companies;
	}
	
	@ModelAttribute("markets")
	public Map<String, String>  getMarkets(){
		Map<String, String>  markets = toDoTaskFacade.getAllCompanyMarketNames();
		return markets;
	}
	
	/**
	 * @return the toDoTaskFacade
	 */
	public ToDoTaskFacade getToDoTaskFacade()
	{
		return toDoTaskFacade;
	}

	/**
	 * @return the orderListFacade
	 */
	public OrderListFacade getOrderListFacade()
	{
		return orderListFacade;
	}

	/**
	 * @return the employeeFacade
	 */
	public EmployeeFacade getEmployeeFacade()
	{
		return employeeFacade;
	}
}
