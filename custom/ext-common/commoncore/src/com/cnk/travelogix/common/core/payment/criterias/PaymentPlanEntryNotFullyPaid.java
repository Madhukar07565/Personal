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

import de.hybris.platform.core.enums.PaymentStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.cnk.travelogix.common.core.model.PaymentPlanEntryModel;


/**
 * @author i323727
 *
 */
public class PaymentPlanEntryNotFullyPaid implements PaymentPlanEntryCriteria
{
	@Override
	public List<PaymentPlanEntryModel> meetCriteria(final List<PaymentPlanEntryModel> list)
	{
		final ArrayList<PaymentPlanEntryModel> result = new ArrayList<PaymentPlanEntryModel>();
		Optional.ofNullable(list).ifPresent(elist -> {
			elist.forEach(entry -> {
				if (entry.getPaymentPlan().getPaymentStatus() == PaymentStatus.PARTPAID)
				{
					final double amount = Optional.ofNullable(entry.getAmount()).orElse(Double.valueOf(0)).doubleValue();
					final double paidAmount = Optional.ofNullable(entry.getPayAmount()).orElse(Double.valueOf(0)).doubleValue();
					if (Double.compare(amount, paidAmount) > 0)
					{
						result.add(entry);
					}
				}
				else if (entry.getPaymentPlan().getPaymentStatus() == PaymentStatus.NOTPAID)
				{
					result.add(entry);
				}
			});
		});
		return result;
	}
}
