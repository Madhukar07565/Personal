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
package com.cnk.travelogix.operations.facades.process.email.context;

import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.apache.log4j.Logger;

import com.cnk.travelogix.datamodel.model.operation.model.TimeLimitBookingProcessModel;


/**
 * @author C5244544
 */
public class TimeLimitBookingEmailContext extends AbstractEmailContext<TimeLimitBookingProcessModel>
{
	private String customerUid;
	private Converter<OrderModel, OrderData> orderConverter;
	private OrderData orderData;
	private String orderCode;
	private String orderGuid;
	private String storeName;

	private static final Logger LOG = Logger.getLogger(TimeLimitBookingEmailContext.class);

	@Override
	public void init(final TimeLimitBookingProcessModel timeLimitBookingProcessModel, final EmailPageModel emailPageModel)
	{
		super.init(timeLimitBookingProcessModel, emailPageModel);
		orderData = getOrderConverter().convert(timeLimitBookingProcessModel.getOrder());
		orderCode = timeLimitBookingProcessModel.getOrder().getCode();
		orderGuid = timeLimitBookingProcessModel.getOrder().getGuid();
		storeName = timeLimitBookingProcessModel.getOrder().getStore().getName();
		customerUid = timeLimitBookingProcessModel.getOrder().getUser().getUid();
	}

	@Override
	protected BaseSiteModel getSite(final TimeLimitBookingProcessModel businessProcessModel)
	{
		return businessProcessModel.getSite();
	}

	@Override
	protected CustomerModel getCustomer(final TimeLimitBookingProcessModel businessProcessModel)
	{
		return businessProcessModel.getCustomer();
	}

	@Override
	protected LanguageModel getEmailLanguage(final TimeLimitBookingProcessModel businessProcessModel)
	{
		return businessProcessModel.getLanguage();
	}



	/**
	 * @return the customerUid
	 */
	public String getCustomerUid()
	{
		return customerUid;
	}

	/**
	 * @param customerUid
	 *           the customerUid to set
	 */
	public void setCustomerUid(final String customerUid)
	{
		this.customerUid = customerUid;
	}





	/**
	 * @return the orderConverter
	 */
	public Converter<OrderModel, OrderData> getOrderConverter()
	{
		return orderConverter;
	}


	/**
	 * @param orderConverter
	 *           the orderConverter to set
	 */
	public void setOrderConverter(final Converter<OrderModel, OrderData> orderConverter)
	{
		this.orderConverter = orderConverter;
	}


	/**
	 * @return the orderData
	 */
	public OrderData getOrderData()
	{
		return orderData;
	}


	/**
	 * @param orderData
	 *           the orderData to set
	 */
	public void setOrderData(final OrderData orderData)
	{
		this.orderData = orderData;
	}


	/**
	 * @return the orderCode
	 */
	public String getOrderCode()
	{
		return orderCode;
	}


	/**
	 * @param orderCode
	 *           the orderCode to set
	 */
	public void setOrderCode(final String orderCode)
	{
		this.orderCode = orderCode;
	}


	/**
	 * @return the orderGuid
	 */
	public String getOrderGuid()
	{
		return orderGuid;
	}


	/**
	 * @param orderGuid
	 *           the orderGuid to set
	 */
	public void setOrderGuid(final String orderGuid)
	{
		this.orderGuid = orderGuid;
	}


	/**
	 * @return the storeName
	 */
	public String getStoreName()
	{
		return storeName;
	}


	/**
	 * @param storeName
	 *           the storeName to set
	 */
	public void setStoreName(final String storeName)
	{
		this.storeName = storeName;
	}



}
