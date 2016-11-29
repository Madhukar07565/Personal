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
package com.cnk.travelogix.exception.commonlogging.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.cnk.travelogix.exception.commonlogging.level.TravelogixAuditLogLevel;


@Aspect
public class CoreAspect
{
	/** The logger. */
	Logger logger = Logger.getLogger(CoreAspect.class);

	@Pointcut("execution(* com.cnk.travelogix.exception.commonlogging.errorlog.model.TravelogixErrorMasterModel.*(..))")
	public void descAspect()
	{
		//
	}

	@Before("descAspect()")
	public void beforeAnyDescriptionGetter(final JoinPoint jp)
	{
		//
	}

	@Around("descAspect()")
	public Object aroundDescriptionGetter(final ProceedingJoinPoint pjp) throws Throwable
	{
		final long startTime = System.nanoTime();
		final Object ret = pjp.proceed();
		final long endTime = System.nanoTime();
		System.out.println("Method " + pjp.getSignature().toShortString() + " took " + (endTime - startTime));
		logger.info("@@@@@@@@@@ TravelogixErrorMasterModel INFOR  @@@@@@@@@@@");
		logger.log(TravelogixAuditLogLevel.AUDIT, "@@@@@@@@@@ TravelogixErrorMasterModel CUSTOM level @@@@@@@@@@@");
		return ret;
	}

}