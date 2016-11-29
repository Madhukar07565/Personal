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
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.client.config.core.timelimit.model.TimeLimitMasterConfigModel;
import com.cnk.travelogix.common.core.model.OrderProductInfoModel;
import com.cnk.travelogix.operations.doas.TimeLimitBookingDAO;
import com.cnk.travelogix.operations.services.TimeLimitBookingService;

import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.workflow.WorkflowProcessingService;
import de.hybris.platform.workflow.WorkflowService;
import de.hybris.platform.workflow.WorkflowTemplateService;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowModel;
import de.hybris.platform.workflow.model.WorkflowTemplateModel;


/**
 * @author C5244544
 */
public class DefaultTimeLimitBookingService implements TimeLimitBookingService
{
	private TimeLimitBookingDAO timeLimitBookingDAO;

	@Resource(name = "modelService")
	private ModelService modelService;

	@Autowired
	private WorkflowService workflowService;

	@Autowired
	private WorkflowTemplateService workflowTemplateService;

	@Autowired
	private UserService userService;

	@Autowired
	private WorkflowProcessingService workflowProcessingService;

	@Override
	public List<OrderModel> getTimeLimitOrders()
	{
		return timeLimitBookingDAO.getTimeLimitOrders();
	}

	/**
	 * This is the method to update the timeLimit bookings.
	 */
	@Override
	public void updateTimeLimit(final OrderModel orderModel, final Date date)
	{
		boolean timeLimitExtension;
		if (orderModel.getTimeLimitMasterConfig() != null)
		{
			timeLimitExtension = orderModel.getTimeLimitMasterConfig().getTimeLimitExtension().booleanValue();
			if (timeLimitExtension)
			{
				final List<AbstractOrderEntryModel> orderEntries = orderModel.getEntries();
				final Iterator iterator = orderEntries.iterator();
				while (iterator.hasNext())
				{
					final AbstractOrderEntryModel orderEntry = (AbstractOrderEntryModel) iterator.next();
					final OrderProductInfoModel productInfo = orderEntry.getOrderProductInfo();
					productInfo.setTimeLimitDate(date);
					modelService.save(productInfo);
				}
			}
		}
	}

	/**
	 * method to start the timeLimit booking workflow
	 */
	@Override
	public void startTimeLimitBookingWorkflow(final OrderModel orderModel)
	{
		//Call the workflow
		final WorkflowTemplateModel workflowTemplate = this.workflowTemplateService
				.getWorkflowTemplateForCode("timeLimitBookingWorkflowTemplate");
		final WorkflowModel workflow = this.workflowService.createWorkflow(workflowTemplate, orderModel,
				userService.getAdminUser());
		modelService.save(workflow);
		for (final WorkflowActionModel action : workflow.getActions())
		{
			modelService.save(action);
		}
		this.workflowProcessingService.startWorkflow(workflow);
	}



	@Override
	public List<OrderModel> getTimeLimitOrderCancelAlert()
	{
		final List<OrderModel> orderList = getTimeLimitOrders();
		final List<OrderModel> cancelAlertOrderList = new ArrayList<>();
		final Iterator<OrderModel> iterator = orderList.iterator();
		while (iterator.hasNext())
		{
			final OrderModel orderModel = iterator.next();
			final TimeLimitMasterConfigModel timeLimit = orderModel.getTimeLimitMasterConfig();
			final Date bookingDate = orderModel.getCreationtime();
			final Calendar calendar = Calendar.getInstance();
			calendar.setTime(bookingDate);
			calendar.add(Calendar.DATE, timeLimit.getExpiryNotificationPeriodInDays().intValue());
			calendar.add(Calendar.HOUR, timeLimit.getExpiryNotificationPeriodInHours().intValue());
			if (calendar.after(Calendar.getInstance()))
			{
				cancelAlertOrderList.add(orderModel);// send the order which is cancel
			}
		}
		return cancelAlertOrderList;
	}

	@Override
	public List<OrderModel> getTimeLimitOrderAlert()
	{
		final List<OrderModel> orderList = getTimeLimitOrders();
		final List<OrderModel> alertOrderList = new ArrayList<>();
		final Iterator<OrderModel> iterator = orderList.iterator();
		while (iterator.hasNext())
		{
			final OrderModel orderModel = iterator.next();
			final TimeLimitMasterConfigModel timeLimit = orderModel.getTimeLimitMasterConfig();
			final Date bookingDate = orderModel.getCreationtime();
			final Calendar calendar = Calendar.getInstance();
			calendar.setTime(bookingDate);
			calendar.add(Calendar.DATE, timeLimit.getExpiryNotificationPeriodInDays().intValue());
			calendar.add(Calendar.HOUR, timeLimit.getExpiryNotificationPeriodInHours().intValue());
			if (calendar.before(Calendar.getInstance()))
			{
				alertOrderList.add(orderModel);// send the order which has no cancel alert
			}
		}
		return alertOrderList;
	}


	@Override
	public void updateTempTimeLimit(final OrderModel orderModel, final Date date)
	{
		orderModel.setTempTimeLimit(date);
		modelService.save(orderModel);
	}


	/**
	 * @return the timeLimitBookingDAO
	 */
	public TimeLimitBookingDAO getTimeLimitBookingDAO()
	{
		return timeLimitBookingDAO;
	}

	/**
	 * @param timeLimitBookingDAO
	 *           the timeLimitBookingDAO to set
	 */
	public void setTimeLimitBookingDAO(final TimeLimitBookingDAO timeLimitBookingDAO)
	{
		this.timeLimitBookingDAO = timeLimitBookingDAO;
	}

}
