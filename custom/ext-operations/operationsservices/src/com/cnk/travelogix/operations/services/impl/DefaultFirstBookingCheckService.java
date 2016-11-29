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

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.common.facades.alert.service.AlertNotificationService;
import com.cnk.travelogix.operations.doas.TravelogixOperationsDao;
import com.cnk.travelogix.operations.services.FirstBookingCheckService;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;
import com.cnk.travelogix.supplier.mappings.product.model.SupplierProductModel;

import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;


/**
 * @author C5244544
 *
 */
public class DefaultFirstBookingCheckService implements FirstBookingCheckService
{

	@Resource
	ModelService modelService;

	@Resource(name = "userService")
	UserService userService;

	@Resource(name = "travelogixOperationsDao")
	private TravelogixOperationsDao travelogixOperationsDao;

	@Resource(name = "alertNotificationService")
	AlertNotificationService alertNotificationService;
	private static final Logger LOG = Logger.getLogger(DefaultFirstBookingCheckService.class);

	public boolean isNewSupplier(final AbstractOrderEntryModel abstractOrderEntryModel)
	{
		if (null != abstractOrderEntryModel && null != abstractOrderEntryModel.getOrderProductInfo()
				&& null != abstractOrderEntryModel.getOrderProductInfo().getEnablerSupplier())
		{
			return abstractOrderEntryModel.getOrderProductInfo().getEnablerSupplier().getIsNew().booleanValue();
		}
		return false;
	}



	@Override
	public boolean isFirstBookingCheckEnabledProd(final AbstractOrderEntryModel abstractOrderEntryModel)
	{
		boolean isFirstBooking = false;

		if (null != abstractOrderEntryModel.getOrderProductInfo()
				&& null != abstractOrderEntryModel.getOrderProductInfo().getEnablerSupplier())
		{
			final SupplierProductModel supplierProduct = travelogixOperationsDao
					.getSupplierProductForSupplier(abstractOrderEntryModel.getOrderProductInfo().getEnablerSupplier().getCode());
			return isFirstBooking = supplierProduct.getFirstBookingEnabled().booleanValue();
		}
		return isFirstBooking;
	}

	@Override
	public boolean checkAndSendFirstBookingSupplierAlert(final OrderModel orderModel)
	{
		final List<AbstractOrderEntryModel> orderEntries = orderModel.getEntries();
		boolean isNewSupplier = false;
		boolean isFirstBookingEnabledOnProd = false;
		for (final AbstractOrderEntryModel abstractOrderEntryModel : orderEntries)
		{
			isNewSupplier = this.isNewSupplier(abstractOrderEntryModel);
			isFirstBookingEnabledOnProd = this.isFirstBookingCheckEnabledProd(abstractOrderEntryModel);
			if (isNewSupplier && isFirstBookingEnabledOnProd)
			{
				try
				{
					alertNotificationService.sendNotification(null, "Booking with booking id  " + orderModel.getCode()
							+ " is placed with a new supplier and the first booking", "SUCCESS", userService.getAdminUser());
				}
				catch (final Exception e)
				{
					alertNotificationService.sendNotification(null, "", "FAILURE", userService.getAdminUser());
					LOG.error("Exception while saving the JobMonitoring log ", e);
				}
				//make the booking entry as a firstbooking base on above conditions supplier is new and the product also have such claasisfication
				abstractOrderEntryModel.setFirstBooking(Boolean.TRUE);
				modelService.save(abstractOrderEntryModel);

				if (null != abstractOrderEntryModel.getOrderProductInfo()
						&& null != abstractOrderEntryModel.getOrderProductInfo().getEnablerSupplier())
				{
					final SupplierModel supplier = abstractOrderEntryModel.getOrderProductInfo().getEnablerSupplier();
					supplier.setIsNew(Boolean.FALSE);
					modelService.save(supplier);
				}

				return true;
			} //if
		} //fpr
		return false;
	}

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}
}
