/*
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 *
 */
package com.cnk.travelogix.common.core.payment.criterias;

import java.util.List;

import com.cnk.travelogix.common.core.model.PaymentPlanEntryModel;


/**
 * @author i323727
 *
 */
public interface PaymentPlanEntryCriteria
{
	public List<PaymentPlanEntryModel> meetCriteria(List<PaymentPlanEntryModel> list);
}
