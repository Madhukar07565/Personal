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
package com.cnk.travelogix.operations.services;

import java.util.List;

import com.cnk.travelogix.operation.serviceorder.model.ServiceOrderModel;
import com.cnk.travelogix.operations.data.ServiceOrderSearchParameterData;
import com.cnk.travelogix.operations.exceptions.ServiceOrderException;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;


/**
 * This interface provides contract for all the service order related functionalities.
 */
public interface ServiceOrderService
{
	/**
	 * This method creates new provisional service order for order entries.
	 */
	List<ServiceOrderModel> createProvisionalServiceOrder(AbstractOrderModel order) throws ServiceOrderException;

	/**
	 * This method creates new version of Provisional Service Orders whenever there is any modification/amendments in the
	 * booking. Also it updates the status of older service orders to Cancel state.
	 */
	void modifyProvisionalServiceOrder(AbstractOrderEntryModel entry) throws ServiceOrderException;

	/**
	 * This method creates new version of Provisional Service Orders whenever there is cancellation of PSO. Also it
	 * updates the status of older service orders to Cancel state.
	 */
	void cancelProvisionalServiceOrder(AbstractOrderEntryModel entry) throws ServiceOrderException;

	/**
	 * This method will create Final Service Order from latest Service Order.
	 */
	ServiceOrderModel createFinalServiceOrder(AbstractOrderEntryModel entry) throws ServiceOrderException;

	/**
	 * This method handles the cancellation of Final Service Orders.
	 */
	void cancelFinalServiceOrder(AbstractOrderEntryModel entry) throws ServiceOrderException;

	SearchPageData<ServiceOrderModel> searchServiceOrders(ServiceOrderSearchParameterData searchData, PageableData pageableData);
}
