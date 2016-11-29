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
package com.cnk.travelogix.common.core.payment.comparator;

import java.util.Comparator;

import com.cnk.travelogix.common.core.model.PaymentPlanEntryModel;


/**
 * @author i323727
 *
 */
public class PaymentPlanDueDateComparator implements Comparator<PaymentPlanEntryModel>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(final PaymentPlanEntryModel o1, final PaymentPlanEntryModel o2)
	{
		if (o1.getDueDate() == null)
		{
			return 1;
		}
		if (o2.getDueDate() == null)
		{
			return -1;
		}
		return o1.getDueDate().compareTo(o2.getDueDate());
	}

}
