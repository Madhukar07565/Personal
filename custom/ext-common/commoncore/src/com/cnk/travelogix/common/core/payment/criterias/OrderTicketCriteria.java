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

import com.cnk.travelogix.common.core.enums.ProductTypeEnum;


/**
 * @author i323727
 *
 */
public class OrderTicketCriteria extends AbstractOrderEntryCriteria
{

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.core.payment.criterias.AbstractOrderEntryCriteria#getProductType()
	 */
	@Override
	public ProductTypeEnum getProductType()
	{
		return ProductTypeEnum.TICKET;
	}

}
