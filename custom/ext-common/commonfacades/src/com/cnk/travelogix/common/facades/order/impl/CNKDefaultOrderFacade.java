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
package com.cnk.travelogix.common.facades.order.impl;

import de.hybris.platform.store.services.BaseStoreService;
import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commercefacades.order.impl.DefaultOrderFacade;
import de.hybris.platform.commerceservices.customer.CustomerAccountService;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.core.enums.OrderStatus;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;

import jersey.repackaged.com.google.common.base.Preconditions;

import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.order.OrderSearchCondition;
import com.cnk.travelogix.common.facades.order.CNKOrderFacade;

import jersey.repackaged.com.google.common.base.Preconditions;


/**
 *
 */
public class CNKDefaultOrderFacade extends DefaultOrderFacade implements CNKOrderFacade
{
	private static final Logger LOG = Logger.getLogger(CNKDefaultOrderFacade.class);
	private Converter<OrderData, OrderData> groupOrderEntryConverter;
	private Converter<OrderData, OrderData> paymentPlanForOrderConverter;
	private ModelService modelService;

	public OrderData getGroupedOrderDetailsForCode(final String code)
	{
		Preconditions.checkNotNull(null, "should not be invoked, and move B2CFacade implementation here");
		return null;
	}

	/**
	 * @return the groupOrderEntryConverter
	 */
	public Converter<OrderData, OrderData> getGroupOrderEntryConverter()
	{
		return groupOrderEntryConverter;
	}

	/**
	 * @param groupOrderEntryConverter
	 *           the groupOrderEntryConverter to set
	 */
	public void setGroupOrderEntryConverter(final Converter<OrderData, OrderData> groupOrderEntryConverter)
	{
		this.groupOrderEntryConverter = groupOrderEntryConverter;
	}

	public SearchPageData<OrderData> searchOrder(final OrderSearchCondition osc, final PageableData pageableData)
	{

		Preconditions.checkNotNull(null, "should not be invoked, and move B2CFacade implementation here");
		return null;
		//		final CustomerModel currentCustomer = (CustomerModel) getUserService().getCurrentUser();
		//		final BaseStoreModel currentBaseStore = getBaseStoreService().getCurrentBaseStore();
		//		final SearchPageData<OrderModel> orderList = ((CNKCustomerAccountService) getCustomerAccountService())
		//				.searchBookingList(currentCustomer, currentBaseStore, osc, pageableData);
		//		return convertPageData(orderList, getOrderHistoryConverter());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cnk.travelogix.common.facades.order.CNKOrderFacade#updateOrderStatus(de.hybris.platform.core.model.order.
	 * OrderModel, de.hybris.platform.core.enums.OrderStatus)
	 */
	@Override
	public void updateOrderStatus(final String code, final OrderStatus orderStatus)
	{
		Preconditions.checkNotNull(null, "should not be invoked, and move B2CFacade implementation here");
	}

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService the modelService to set
	 */
	public void setModelService(ModelService modelService)
	{
		this.modelService = modelService;
	}

	/**
	 * @return the paymentPlanForOrderConverter
	 */
	public Converter<OrderData, OrderData> getPaymentPlanForOrderConverter()
	{
		return paymentPlanForOrderConverter;
	}

	/**
	 * @param paymentPlanForOrderConverter the paymentPlanForOrderConverter to set
	 */
	public void setPaymentPlanForOrderConverter(Converter<OrderData, OrderData> paymentPlanForOrderConverter)
	{
		this.paymentPlanForOrderConverter = paymentPlanForOrderConverter;
	}





}
