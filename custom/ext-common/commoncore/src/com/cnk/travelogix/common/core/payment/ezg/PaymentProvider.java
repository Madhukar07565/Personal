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
package com.cnk.travelogix.common.core.payment.ezg;

import java.util.Map;

import com.cnk.travelogix.common.core.payment.data.PaymentServerSetting;
import com.cnk.travelogix.common.core.payment.data.PaymentServiceResponse;


/**
 *
 */
public interface PaymentProvider
{

	public String getCode();

	public Map<String, String> getPaymentFields(final String cartCode, final String amount, final String receiptResponseURL);

	PaymentServerSetting getPaymentServerSetting();

	public PaymentServiceResponse interpretPaymentResponse(Map<String, String> fields);


	/**
	 * @param fields
	 * @param response
	 */
	void populateCardInfo(Map<String, String> fields, PaymentServiceResponse response);


}
