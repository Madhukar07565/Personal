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

import de.hybris.platform.acceleratorservices.payment.data.CustomerInfoData;
import de.hybris.platform.acceleratorservices.payment.data.PaymentInfoData;
import de.hybris.platform.acceleratorservices.payment.data.SubscriptionInfoData;
import de.hybris.platform.core.model.order.payment.CreditCardPaymentInfoModel;
import de.hybris.platform.core.model.order.payment.DebitPaymentInfoModel;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;

import com.cnk.travelogix.common.core.model.CodPaymentInfoModel;
import com.cnk.travelogix.common.core.payment.data.CodPaymentInfoData;
import com.cnk.travelogix.integrations.payment.response.beans.PaymentServiceResponseData;


/**
 * A strategy for creating and persisting {@link CreditCardPaymentInfoModel}
 *
 */
public interface CnkPaymentInfoCreateStrategy
{

	/** for multiple step payment, e.g. authorization first, then purchase start */
	CreditCardPaymentInfoModel createCreditCardPaymentInfo(final SubscriptionInfoData subscriptionInfo,
			final PaymentInfoData paymentInfo, final AddressModel billingAddress, final CustomerModel customerModel,
			final boolean saveInAccount);

	CreditCardPaymentInfoModel saveSubscription(CustomerModel customerModel, CustomerInfoData customerInfoData,
			SubscriptionInfoData subscriptionInfo, PaymentInfoData paymentInfoData, boolean saveInAccount);

	/** for 1 step payment, purchase in 1 step start */

	/**
	 * @param subscriptionId
	 * @param paymentInfo
	 * @param billingAddress
	 * @param customerModel
	 * @param saveInAccount
	 * @return new CreditCardPaymentInfoModel
	 */
	CreditCardPaymentInfoModel createCreditCardPaymentInfo(String subscriptionId, PaymentInfoData paymentInfo,
			AddressModel billingAddress, CustomerModel customerModel, boolean saveInAccount);

	/**
	 * @param customerModel
	 * @param paymentServiceResponse
	 * @param paymentInfoData
	 * @param saveInAccount
	 * @return
	 */
	PaymentInfoModel saveHopPaymentInfo(CustomerModel customerModel, PaymentServiceResponseData paymentServiceResponse,
			PaymentInfoData paymentInfoData, boolean saveInAccount);

	/**
	 * @param receiptNo
	 * @param paymentInfo
	 * @param billingAddress
	 * @param customerModel
	 * @param saveInAccount
	 * @return
	 */
	DebitPaymentInfoModel createDebitCardPaymentInfo(String receiptNo, PaymentInfoData paymentInfo, AddressModel billingAddress,
			CustomerModel customerModel, boolean saveInAccount);

	/**
	 * @param customerModel
	 * @param customerInfoData
	 * @param paymentInfoData
	 * @param b
	 * @return
	 */
	PaymentInfoModel saveEzeePaymentInfo(CustomerModel customerModel, CustomerInfoData customerInfoData,
			PaymentInfoData paymentInfoData, boolean b);

	/**
	 * @param customerModel
	 * @param customerInfoData
	 * @param cod
	 * @return
	 */
	CodPaymentInfoModel createCodPaymentInfo(CustomerModel customerModel, CodPaymentInfoData cod);
}
