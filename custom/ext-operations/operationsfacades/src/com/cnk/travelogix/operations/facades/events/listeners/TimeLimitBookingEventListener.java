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
package com.cnk.travelogix.operations.facades.events.listeners;

import de.hybris.platform.acceleratorservices.site.AbstractAcceleratorSiteEventListener;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.util.ServicesUtil;

import org.apache.log4j.Logger;

import com.cnk.travelogix.datamodel.model.operation.model.TimeLimitBookingProcessModel;
import com.cnk.travelogix.operations.cronjob.TimeLimitBookingCronJob;
import com.cnk.travelogix.operations.facades.events.TimeLimitBookingEvent;


/**
 * @author C5244544
 */
public class TimeLimitBookingEventListener extends AbstractAcceleratorSiteEventListener<TimeLimitBookingEvent>
{

	private BusinessProcessService businessProcessService;
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(TimeLimitBookingCronJob.class);

	@Override
	protected void onSiteEvent(final TimeLimitBookingEvent timeLimitBookingEvent)
	{
		final TimeLimitBookingProcessModel timeLimitBookingProcessModel = (TimeLimitBookingProcessModel) getBusinessProcessService()
				.createProcess("TimeLimitBooking -" + timeLimitBookingEvent.getCustomer().getUid() + "-" + System.currentTimeMillis(),
						"timeLimitBookingAlertEmailProcess");
		timeLimitBookingProcessModel.setOrder(timeLimitBookingEvent.getOrder());
		timeLimitBookingProcessModel.setCustomer(timeLimitBookingEvent.getCustomer());
		timeLimitBookingProcessModel.setCurrency(timeLimitBookingEvent.getCurrency());
		timeLimitBookingProcessModel.setLanguage(timeLimitBookingEvent.getLanguage());
		timeLimitBookingProcessModel.setSite(timeLimitBookingEvent.getSite());
		timeLimitBookingProcessModel.setStore(timeLimitBookingEvent.getBaseStore());
		getBusinessProcessService().startProcess(timeLimitBookingProcessModel);

	}



	@Override
	protected SiteChannel getSiteChannelForEvent(final TimeLimitBookingEvent timeLimitBookingEvent)
	{
		final OrderModel order = timeLimitBookingEvent.getOrder();
		ServicesUtil.validateParameterNotNullStandardMessage("event.order", order);
		final BaseSiteModel site = order.getSite();
		ServicesUtil.validateParameterNotNullStandardMessage("event.order.site", site);
		return site.getChannel();
	}

	/**
	 * @return the businessProcessService
	 */
	public BusinessProcessService getBusinessProcessService()
	{
		return businessProcessService;
	}

	/**
	 * @param businessProcessService
	 *           the businessProcessService to set
	 */
	public void setBusinessProcessService(final BusinessProcessService businessProcessService)
	{
		this.businessProcessService = businessProcessService;
	}



}
