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
package com.cnk.travelogix.services.paymentgateways.request.decorators.impl.common;

import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.user.UserFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.services.paymentgateways.PaymentGatewayService;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestForm;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestFormDecorator;


/**
 *
 */
public class CustomerNameDecorator extends PaymentGatewayRequestFormDecorator
{

	/**
	 * @param paymentGatewayProviderRequestForm
	 */
	public CustomerNameDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
		// YTODO Auto-generated constructor stub
	}

	public CustomerNameDecorator()
	{
		super();
	}

	@Resource(name = "customerFacade")
	private CustomerFacade customerFacade;

	@Resource(name = "userFacade")
	private UserFacade userFacade;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.services.paymentgateways.decorators.PaymentGatewayRequestForm#processAttibuteValue(com.cnk.
	 * travelogix.beans.FormAttribute, java.util.Map)
	 */
	@Override
	public FormAttribute processRequestAttibuteValue(final FormAttribute formAttribute, final Map<String, FormAttribute> valueMap)
	{
		// YTODO Auto-generated method stub

		final CustomerData currCustomerData = customerFacade.getCurrentCustomer();

		if (currCustomerData != null)
		{
			final String customerName = currCustomerData.getFirstName() + "_" + currCustomerData.getLastName();

			if (StringUtils.isNotEmpty(customerName.replace("_", "")))
			{

				updateFormAttributeFlags(formAttribute, customerName);
			}
			else
			{
				updateFormAttributeFlags(formAttribute, PaymentGatewayService.PAYMENT_GATEWAY_EMPTY_STRING);
			}


		}
		return formAttribute;
	}
	//
}
