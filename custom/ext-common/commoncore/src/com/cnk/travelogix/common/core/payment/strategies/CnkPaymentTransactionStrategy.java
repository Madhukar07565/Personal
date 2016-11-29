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
package com.cnk.travelogix.common.core.payment.strategies;

import de.hybris.platform.acceleratorservices.payment.data.OrderInfoData;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.payment.model.PaymentTransactionEntryModel;

import com.cnk.travelogix.common.core.payment.data.PaymentTransactionData;


/**
 *
 *
 */
public interface CnkPaymentTransactionStrategy
{
	PaymentTransactionEntryModel savePaymentTransactionEntry(CustomerModel customerModel, String requestId,
			OrderInfoData orderInfoData);

	void setPaymentTransactionReviewResult(PaymentTransactionEntryModel reviewDecisionEntry, String guid);

	/**
	 *
	 * @param customerModel
	 * @param cart
	 * @param paymentInfoModel
	 * @param txnData
	 * @return PaymentTransactionEntryModel
	 */
	PaymentTransactionEntryModel savePaymentTransactionEntry(CustomerModel customerModel, CartModel cart,
			PaymentInfoModel paymentInfoModel, PaymentTransactionData txnData);
}
