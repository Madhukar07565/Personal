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
package com.cnk.travelogix.services.paymentgateways.request.decorators;

import java.util.Map;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;






/**
 *
 */
@FunctionalInterface
public interface PaymentGatewayRequestForm
{
	public FormAttribute processRequestAttibuteValue(final FormAttribute formAttribute, final Map<String, FormAttribute> valueMap)
			throws Exception;


}
