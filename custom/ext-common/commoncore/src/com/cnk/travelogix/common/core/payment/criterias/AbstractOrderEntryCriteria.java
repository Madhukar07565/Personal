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

import de.hybris.platform.core.model.order.AbstractOrderEntryModel;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.cnk.travelogix.common.core.enums.ProductTypeEnum;


/**
 * @author i323727
 *
 */
public abstract class AbstractOrderEntryCriteria implements OrderEntryCriteria
{

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.core.payment.criterias.OrderEntryCriteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<AbstractOrderEntryModel> meetCriteria(final List<AbstractOrderEntryModel> list)
	{
		if (CollectionUtils.isEmpty(list))
		{
			return list;
		}
		final List<AbstractOrderEntryModel> resultList = new ArrayList<>();
		for (final AbstractOrderEntryModel entry : list)
		{
			if (entry.getProductTypeEnum() == getProductType())
			{
				resultList.add(entry);
			}
		}
		return resultList;
	}

	public abstract ProductTypeEnum getProductType();

}
