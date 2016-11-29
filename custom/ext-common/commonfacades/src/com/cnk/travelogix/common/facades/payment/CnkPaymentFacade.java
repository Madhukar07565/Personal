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
package com.cnk.travelogix.common.facades.payment;

import de.hybris.platform.acceleratorfacades.payment.PaymentFacade;
import de.hybris.platform.acceleratorfacades.payment.data.PaymentSubscriptionResultData;
import de.hybris.platform.acceleratorservices.payment.data.PaymentData;

import java.util.Map;

import com.cnk.travelogix.common.core.payment.data.AjaxResult;
import com.cnk.travelogix.common.core.payment.data.CodPaymentInfoData;
import com.cnk.travelogix.common.core.payment.data.PaymentModeSetting;
import com.cnk.travelogix.integrations.payment.response.beans.PaymentServiceResponseData;


/**
 * @author i323727
 *
 */
public interface CnkPaymentFacade extends PaymentFacade
{

	/**
	 * @return
	 */
	PaymentModeSetting getPaymentModeSetting();

	/**
	 * @param cardType
	 * @param responseUrl
	 * @param amount
	 * @param cartCode
	 * @return
	 */
	PaymentData prepareHopOrderPageData(String cartCode, String cardType, String amount, String responseUrl);

	/**
	 * @param resultMap
	 * @param b
	 * @return
	 */
	PaymentSubscriptionResultData completeHopCapture(Map<String, String> resultMap, boolean b);

	/**
	 * @param amountToPay
	 * @return amountToPayNow, remaining amount to pay
	 */
	String completeEzeeCapture(String amountToPay);

	/**
	 *
	 * @param response
	 * @return redirect URL
	 */
	String completeHopPayment(PaymentServiceResponseData response);

	/**
	 * @param cod
	 * @return
	 */
	String completeCodPayment(CodPaymentInfoData cod);

	/**
	 *
	 */
	void generatePaymentPlan();

	/**
	 * @param setting
	 * @param result
	 * @param paymentMode
	 * @param cardType
	 * @param amount
	 */
	void calculatePaymentFee(PaymentModeSetting setting, AjaxResult result, String paymentMode, String cardType, Double amount);
}
