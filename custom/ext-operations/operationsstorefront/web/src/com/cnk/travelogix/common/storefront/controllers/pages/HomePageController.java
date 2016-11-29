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
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.commercefacades.user.data.UserGroupData;
import de.hybris.platform.servicelayer.session.SessionService;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cnk.travelogix.common.facades.account.CnKAccountFacade;
import com.cnk.travelogix.exception.commonlogging.aop.Auditable;
import com.cnk.travelogix.exception.commonlogging.aop.Auditable.AuditingActionType;
import com.cnk.travelogix.operations.data.WorkflowActionData;
import com.cnk.travelogix.operations.employee.data.EmployeeData;
import com.cnk.travelogix.operations.facades.EmployeeFacade;
import com.cnk.travelogix.operations.facades.ToDoTaskFacade;


/**
 * Controller for home page
 */
@Controller
@Scope("tenant")
@RequestMapping("/")
public class HomePageController extends AbstractPageController
{
	private static final Logger LOG = Logger.getLogger(HomePageController.class);
	private static final String NOTIFICATION_CODE_PATH_VARIABLE_PATTERN = "{notificationCode:.*}";
	@Resource(name = "toDoTaskFacade")
	private ToDoTaskFacade toDoTaskFacade;
	
	@Resource(name = "cnKAccountFacade")
	private CnKAccountFacade cnKAccountFacade;
	
	@Resource(name = "employeeFacade")
	private EmployeeFacade employeeFacade;

	@RequestMapping(method = RequestMethod.GET)
	@Auditable(actionType = AuditingActionType.USER_LOGGED_IN)
	public String home(@RequestParam(value = "logout", defaultValue = "false") final boolean logout, final Model model,
			final RedirectAttributes redirectModel) throws CMSItemNotFoundException
	{
		//need to get employee from current login user 
				final EmployeeData employeeData = employeeFacade.getCurrentEmployee();
				List<UserGroupData>  companies = employeeData.getCompanies();
				model.addAttribute("userCompanies", companies);
				
		WorkflowActionData workflowActionData = (WorkflowActionData) model.asMap().get("notificationData");
		if (null != workflowActionData)
		{
			model.addAttribute("workflowActionData", workflowActionData);
		}

		List<WorkflowActionData> workflowActionDatas = null;
		if (logout)
		{
			GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.INFO_MESSAGES_HOLDER, "account.confirmation.signout.title");
			return REDIRECT_PREFIX + ROOT;
		}
		workflowActionDatas = toDoTaskFacade.getNotifications();
		model.addAttribute("workflowActionDatas", workflowActionDatas);
		storeCmsPageInModel(model, getContentPageForLabelOrId(null));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(null));
		updatePageTitle(model, getContentPageForLabelOrId(null));

		return getViewForPage(model);
	}

	@ResponseBody
	@RequestMapping(value = "/alert-view/" + NOTIFICATION_CODE_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
	public WorkflowActionData viewNotification(@PathVariable("notificationCode") String notificationCode, Model model,
			RedirectAttributes redirectModel)
	{
		WorkflowActionData workflowActionData = toDoTaskFacade.viewNotification(notificationCode);
		redirectModel.addFlashAttribute("notificationData", workflowActionData);
		//return REDIRECT_PREFIX + ROOT;
		return workflowActionData;
	}

	@RequestMapping(value = "/alert-dismiss/" + NOTIFICATION_CODE_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
	public String dismissNotification(@PathVariable("notificationCode") String notificationCode, Model model)
	{
		toDoTaskFacade.dismissNotification(notificationCode);
		return REDIRECT_PREFIX + ROOT;
	}

	protected void updatePageTitle(final Model model, final AbstractPageModel cmsPage)
	{
		storeContentPageTitleInModel(model, getPageTitleResolver().resolveHomePageTitle(cmsPage.getTitle()));
	}
	
	
	@RequestMapping(value = "/storecompanyUid", method = RequestMethod.GET)
	@ResponseBody
	public String setCompanyUid(@RequestParam("companyUid") String companyUid, Model model){
		LOG.info("in storecompany details method");
		cnKAccountFacade.storeCompanyDetailsInSession(companyUid);
		
		//String company = (String) sessionService.getAttribute("companyUid");
		LOG.debug("successfully company deatils stored in session");
		return companyUid;
		
	}
}
