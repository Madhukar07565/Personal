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
package com.cnk.travelogix.common.storefront.controllers.cms;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cnk.travelogix.common.storefront.controllers.ControllerConstants;
import com.cnk.travelogix.datamodel.operation.components.model.ToDoDetailComponentModel;
import com.cnk.travelogix.operations.facades.ToDoTaskFacade;


/**
 * Controller for CMS ToDoListComponentController
 */
@Controller("ToDoDetailComponentController")
@Scope("tenant")
@RequestMapping(value = ControllerConstants.Actions.Cms.ToDoDetailComponent)
public class ToDoDetailComponentController extends AbstractAcceleratorCMSComponentController<ToDoDetailComponentModel>
{
	
	@Resource(name = "toDoTaskFacade")
	private ToDoTaskFacade toDoTaskFacade;

	@Override
	protected void fillModel(final HttpServletRequest request, final Model model, final ToDoDetailComponentModel component)
	{
		model.addAttribute("component", component);
		model.addAttribute("model", model);
	}
}
