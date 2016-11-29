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
package com.cnk.travelogix.operations.cronjob;

import de.hybris.platform.commerceservices.event.AbstractCommerceUserEvent;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.JobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.common.facades.alert.service.AlertNotificationService;
import com.cnk.travelogix.operations.facades.events.TimeLimitBookingCancelEvent;
import com.cnk.travelogix.operations.facades.events.TimeLimitBookingEvent;
import com.cnk.travelogix.operations.services.TimeLimitBookingService;


/**
 * @author C5244544
 */
public class TimeLimitBookingCronJob implements JobPerformable<CronJobModel>
{

	@Resource(name = "commonI18NService")
	private CommonI18NService commonI18NService;

	@Resource(name = "timeLimitBookingService")
	private TimeLimitBookingService timeLimitBookingService;

	@Resource(name = "eventService")
	private EventService eventService;

	@Resource(name = "alertNotificationService")
	AlertNotificationService alertNotificationService;

	@Resource(name = "userService")
	UserService userService;

	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(TimeLimitBookingCronJob.class);


	@Override
	public boolean isAbortable()
	{
		return true;
	}

	@Override
	public boolean isPerformable()
	{
		return true;
	}

	@Override
	public PerformResult perform(final CronJobModel arg0)
	{

		if (LOG.isDebugEnabled())
		{
			LOG.debug("*********Time Limit Cron Job ");
		}
		final List<OrderModel> alertsOrders = timeLimitBookingService.getTimeLimitOrderAlert();
		final Iterator iterator = alertsOrders.iterator();
		while (iterator.hasNext())
		{
			final OrderModel order = (OrderModel) iterator.next();

			try
			{
				alertNotificationService.sendNotification(null,
						"Booking with booking id  " + order.getCode() + " is placed with time limit booking", "SUCCESS",
						userService.getAdminUser());
				eventService.publishEvent(initializeEvent(new TimeLimitBookingEvent(), order));
			}
			catch (final Exception e)
			{
				alertNotificationService.sendNotification(null, "", "FAILURE", userService.getAdminUser());
				LOG.error("Exception while saving the JobMonitoring log ", e);
			}
		}
		final List<OrderModel> cancelOrders = timeLimitBookingService.getTimeLimitOrderCancelAlert();
		final Iterator cancelOrdersItr = cancelOrders.iterator();
		while (cancelOrdersItr.hasNext())
		{
			final OrderModel order = (OrderModel) cancelOrdersItr.next();

			try
			{
				alertNotificationService.sendNotification(null,
						"Booking with booking id  " + order.getCode() + " is placed with time limit booking and Its going to cancel",
						"SUCCESS", userService.getAdminUser());
				eventService.publishEvent(initializeEvent(new TimeLimitBookingCancelEvent(), order));
			}
			catch (final Exception e)
			{
				alertNotificationService.sendNotification(null, "", "FAILURE", userService.getAdminUser());
				LOG.error("Exception while saving the JobMonitoring log ", e);
			}
		}

		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}

	/**
	 * initializes an {@link AbstractCommerceUserEvent}
	 *
	 * @param event
	 * @param customerModel
	 * @return the event
	 */
	protected AbstractCommerceUserEvent initializeEvent(final TimeLimitBookingEvent event, final OrderModel order)
	{
		event.setBaseStore(order.getStore());
		event.setSite(order.getSite());
		event.setCustomer((CustomerModel) order.getUser());
		event.setLanguage(commonI18NService.getCurrentLanguage());
		event.setCurrency(commonI18NService.getCurrentCurrency());
		event.setOrder(order);
		return event;
	}

	/**
	 * initializes an {@link AbstractCommerceUserEvent}
	 *
	 * @param event
	 * @param customerModel
	 * @return the event
	 */
	protected AbstractCommerceUserEvent initializeEvent(final TimeLimitBookingCancelEvent event, final OrderModel order)
	{
		event.setBaseStore(order.getStore());
		event.setSite(order.getSite());
		event.setCustomer((CustomerModel) order.getUser());
		event.setLanguage(commonI18NService.getCurrentLanguage());
		event.setCurrency(commonI18NService.getCurrentCurrency());
		event.setOrder(order);
		return event;
	}

}
