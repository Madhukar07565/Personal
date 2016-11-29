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
package com.cnk.travelogix.common.core.event;

import de.hybris.platform.acceleratorservices.site.AbstractAcceleratorSiteEventListener;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.commerceservices.model.process.StoreFrontCustomerProcessModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.util.ServicesUtil;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;


/**
 * Listener for customer registration events.
 */
public class B2cRegistrationEventListener extends AbstractAcceleratorSiteEventListener<B2cRegisterEvent>
{

	private ModelService modelService;
	private BusinessProcessService businessProcessService;

	protected BusinessProcessService getBusinessProcessService()
	{
		return businessProcessService;
	}

	@Required
	public void setBusinessProcessService(final BusinessProcessService businessProcessService)
	{
		this.businessProcessService = businessProcessService;
	}

	/**
	 * @return the modelService
	 */
	protected ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	@Override
	protected void onSiteEvent(final B2cRegisterEvent registerEvent)
	{
		Map<String, Object> contextParameters;
		StoreFrontCustomerProcessModel storeFrontCustomerProcessModel;

		// start sending activation email process
		if (registerEvent.getEventType() == B2cRegisterEvent.EventType.ACTIVATION)
		{
			contextParameters = new HashMap<>();
			contextParameters.put("randomCode", registerEvent.getRandomCode());
			storeFrontCustomerProcessModel = (StoreFrontCustomerProcessModel) getBusinessProcessService().createProcess(
					"customerActivationEmailProcess-" + registerEvent.getCustomer().getUid() + "-" + System.currentTimeMillis(),
					"customerActivationEmailProcess", contextParameters);
			storeFrontCustomerProcessModel.setSite(registerEvent.getSite());
			storeFrontCustomerProcessModel.setCustomer(registerEvent.getCustomer());
			storeFrontCustomerProcessModel.setLanguage(registerEvent.getLanguage());
			storeFrontCustomerProcessModel.setCurrency(registerEvent.getCurrency());
			storeFrontCustomerProcessModel.setStore(registerEvent.getBaseStore());
			getModelService().save(storeFrontCustomerProcessModel);
			getBusinessProcessService().startProcess(storeFrontCustomerProcessModel);
			return;
		}

		// start sending registration email process
		if (registerEvent.getEventType() == B2cRegisterEvent.EventType.REGISTRATION)
		{
			contextParameters = new HashMap<>();
			contextParameters.put("password", registerEvent.getPassword());
			storeFrontCustomerProcessModel = (StoreFrontCustomerProcessModel) getBusinessProcessService().createProcess(
					"customerRegistrationEmailProcess-" + registerEvent.getCustomer().getUid() + "-" + System.currentTimeMillis(),
					"customerRegistrationEmailProcess", contextParameters);
			storeFrontCustomerProcessModel.setSite(registerEvent.getSite());
			storeFrontCustomerProcessModel.setCustomer(registerEvent.getCustomer());
			storeFrontCustomerProcessModel.setLanguage(registerEvent.getLanguage());
			storeFrontCustomerProcessModel.setCurrency(registerEvent.getCurrency());
			storeFrontCustomerProcessModel.setStore(registerEvent.getBaseStore());
			getModelService().save(storeFrontCustomerProcessModel);
			getBusinessProcessService().startProcess(storeFrontCustomerProcessModel);
		}
	}

	@Override
	protected SiteChannel getSiteChannelForEvent(final B2cRegisterEvent event)
	{
		final BaseSiteModel site = event.getSite();
		ServicesUtil.validateParameterNotNullStandardMessage("event.order.site", site);
		return site.getChannel();
	}
}
