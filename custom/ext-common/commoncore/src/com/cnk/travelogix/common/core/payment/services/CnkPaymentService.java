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
package com.cnk.travelogix.common.core.payment.services;

import de.hybris.platform.acceleratorservices.payment.PaymentService;
import de.hybris.platform.acceleratorservices.payment.data.PaymentSubscriptionResultItem;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.payment.model.PaymentTransactionModel;

import java.math.BigDecimal;
import java.util.Map;

import com.cnk.travelogix.common.core.payment.data.CodPaymentInfoData;
import com.cnk.travelogix.common.core.payment.data.PaymentSummary;
import com.cnk.travelogix.common.core.payment.ezg.PaymentProvider;
import com.cnk.travelogix.integrations.payment.response.beans.PaymentServiceResponseData;


public interface CnkPaymentService extends PaymentService
{
	/**
	 * @param cardType
	 * @return
	 */
	PaymentProvider getOptimalPaymentProvider(String cardType);

	/**
	 * @param customerModel
	 * @param saveInAccount
	 * @param parameters
	 * @return
	 */
	PaymentSubscriptionResultItem completeHopCapture(CustomerModel customerModel, boolean saveInAccount,
			Map<String, String> parameters);

	/**
	 * @param cart
	 */
	PaymentSummary getPaymentSummary(CartModel cart);

	/**
	 * @param customerModel
	 * @param response
	 * @return
	 */
	BigDecimal completeHopPayment(CustomerModel customerModel, PaymentServiceResponseData response);

	/**
	 * @param customerModel
	 * @param amountToPay
	 * @return
	 */
	BigDecimal completeEzeePayment(CustomerModel customerModel, String amountToPay);

	/**
	 * @param customerModel
	 * @param cod
	 * @param cart
	 * @return
	 */
	void completeCodPayment(CustomerModel customerModel, CodPaymentInfoData cod, CartModel cart);

	/**
	 *
	 */
	void generatePaymentPlan(AbstractOrderModel order);

	/**
	 * @param cart
	 * @param paymentTransactionModel
	 */
	void updatePaymentPlan(CartModel cart, PaymentTransactionModel paymentTransactionModel);

}
