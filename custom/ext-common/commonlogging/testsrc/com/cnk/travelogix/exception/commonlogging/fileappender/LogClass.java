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
package com.cnk.travelogix.exception.commonlogging.fileappender;

import org.apache.log4j.Logger;

import com.cnk.travelogix.exception.commonlogging.aop.CoreAspect;
import com.cnk.travelogix.exception.commonlogging.level.TravelogixAuditLogLevel;


public class LogClass
{
	private static Logger log = Logger.getLogger(CoreAspect.class);

	public static void main(final String[] args)
	{
		log.setLevel(TravelogixAuditLogLevel.AUDIT);

		log.trace("Trace Message!");
		log.debug("Debug Message!");
		log.info("Info Message!");
		log.warn("Warn Message!");
		log.error("Error Message!");
		log.fatal("Fatal Message!");
	}
}