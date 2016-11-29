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
package com.cnk.travelogix.operations.log;

import com.cnk.travelogix.exception.commonlogging.aop.AuditSearchable;
import com.cnk.travelogix.exception.commonlogging.aop.AuditSearchable.AuditingSearchActionType;


/**
 *
 */
public class TravelogixLogUtilityService
{
	@AuditSearchable(actionType = AuditingSearchActionType.USER_LOGGED_IN)
	public static String auditQueryLog(final String query)
	{
		return query;
	}

	@AuditSearchable(actionType = AuditingSearchActionType.USER_LOGGED_IN)
	public static Object auditModelLog(final Object model)
	{
		return model;
	}
}
