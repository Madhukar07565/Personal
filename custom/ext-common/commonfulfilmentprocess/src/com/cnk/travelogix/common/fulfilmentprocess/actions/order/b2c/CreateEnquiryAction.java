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
package com.cnk.travelogix.common.fulfilmentprocess.actions.order.b2c;

import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.processengine.action.AbstractProceduralAction;
import de.hybris.platform.servicelayer.model.ModelService;

import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.enquiry.services.EnquiryService;
import com.cnk.travelogix.common.core.enquiry.services.EnquiryService.EnquiryFlowState;
import com.cnk.travelogix.common.core.model.BaseEnquiryModel;


public class CreateEnquiryAction extends AbstractProceduralAction<OrderProcessModel>
{
	private static final Logger LOG = Logger.getLogger(CreateEnquiryAction.class);

	private EnquiryService enquiryService;

	@Override
	public void executeAction(final OrderProcessModel process)
	{
		BaseEnquiryModel enquiryModel = modelService.create(BaseEnquiryModel.class);
		enquiryService.createEnquiry(enquiryModel, EnquiryFlowState.AT_PROCEED_FOR_BOOKING);
	}

	/**
	 * @return the enquiryService
	 */
	public EnquiryService getEnquiryService()
	{
		return enquiryService;
	}

	/**
	 * @param enquiryService
	 *           the enquiryService to set
	 */
	public void setEnquiryService(EnquiryService enquiryService)
	{
		this.enquiryService = enquiryService;
	}



}
