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
public abstract class AbstractPaymentPlanEntryCriteria implements PaymentPlanEntryCriteria
{
	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.core.payment.criterias.PaymentPlanEntryCriteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<PaymentPlanEntryModel> meetCriteria(final List<PaymentPlanEntryModel> list)
	{
		final ArrayList<PaymentPlanEntryModel> result = new ArrayList<PaymentPlanEntryModel>();
		Optional.ofNullable(list).ifPresent(elist -> {
			elist.forEach(entry -> {
				if (entry.getPaymentPlan().getPaymentStatus() == getPaymentStatus())
				{
					result.add(entry);
				}
			});
		});
		return result;
	}

	public abstract PaymentStatus getPaymentStatus();
}
