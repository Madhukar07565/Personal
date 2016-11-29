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

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.core.context.SecurityContextHolder;

import com.cnk.travelogix.exception.commonlogging.TravelogixErrorMasterService;
import com.cnk.travelogix.exception.commonlogging.TravelogixSupplierErrorService;
import com.cnk.travelogix.exception.commonlogging.customexception.ApplicationException;
import com.cnk.travelogix.exception.commonlogging.customexception.ITravelogixCustomException;
import com.cnk.travelogix.exception.commonlogging.customexception.SupplierException;
import com.cnk.travelogix.exception.commonlogging.customexception.UnknownException;
import com.cnk.travelogix.exception.commonlogging.errorlog.model.TravelogixErrorMasterModel;
import com.cnk.travelogix.exception.commonlogging.event.TravelogixErrorMasterEvent;
import com.cnk.travelogix.exception.commonlogging.level.TravelogixAuditLogLevel;


@Configurable
@Aspect
public class TravelogixIncidentThrowsAspect
{

	/** The logger. */
	Logger logger = Logger.getLogger(TravelogixIncidentThrowsAspect.class);

	@Autowired
	private TravelogixErrorMasterService travelogixErrorMasterService;

	@Autowired
	private TravelogixSupplierErrorService travelogixSupplierErrorService;

	@Autowired
	private EventService eventService;

	/**
	 * Called between the throw and the catch
	 */
	@AfterThrowing(pointcut = "execution(* com.cnk.travelogix..*.*(String, ..))", throwing = "e")
	public void travelogixAfterThrowing(final JoinPoint joinPoint, final Throwable e)
	{
		final long start = System.currentTimeMillis();
		TravelogixErrorMasterModel errormaster = null;
		final long elapsedTime = System.currentTimeMillis() - start;
		String auditingUsername = "";
		String errorLogMsg = "Print Stack Trace is :\n ";
		String errorCode = "";
		if (e instanceof ITravelogixCustomException)
		{
			try
			{
				if (e instanceof ApplicationException)
				{
					errormaster = travelogixErrorMasterService
							.getTravelogixErrorMasterForCode(((ApplicationException) e).getErrorCode());
				}
				else if (e instanceof SupplierException)
				{
					errorCode = ((SupplierException) e).getErrorCode();
					errormaster = travelogixSupplierErrorService.findTravelogixErrorMasterByCodeFromSupplier(errorCode);
					errorLogMsg = errorLogMsg + ((SupplierException) e).getSupplier();
				}
				else
				{
					// Do Nothing
				}
			}
			catch (final AmbiguousIdentifierException e1)
			{
				// YTODO Auto-generated catch block
				//e1.printStackTrace();
			}
			catch (final UnknownException e1)
			{
				// YTODO Auto-generated catch block
				//e1.printStackTrace();
			}
		}

		logger.log(TravelogixAuditLogLevel.AUDIT,
				"Exception thrown at : " + joinPoint.getSignature().getName() + "() Class//Method");
		if (errormaster != null)
		{
			logger.log(TravelogixAuditLogLevel.AUDIT, "Print Stack Trace for error code " + errormaster.getErrorCode() + " Message :"
					+ errormaster.getPresentationMsg() + " is :\n " + getStackTrace(e));

			if (errormaster.getOperationRequired() != null && errormaster.getOperationRequired().booleanValue() == true)
			{
				logger.log(TravelogixAuditLogLevel.AUDIT, "Event Created Successfully");
				eventService
						.publishEvent(new TravelogixErrorMasterEvent(errormaster.getErrorCode(), errormaster.getPresentationMsg()));
				errorLogMsg = "Print Stack Trace for error code " + errormaster.getErrorCode() + " Message :"
						+ errormaster.getPresentationMsg() + " is :\n ";
			}
		}

		if (SecurityContextHolder.getContext().getAuthentication() != null)
		{
			auditingUsername = SecurityContextHolder.getContext().getAuthentication().getName();
		}
		logger.log(TravelogixAuditLogLevel.AUDIT, errorLogMsg + getStackTrace(e));
		logger.log(TravelogixAuditLogLevel.AUDIT, auditingUsername + "==" + "EXCEPTION_OCCUR" + "==time elapsed==" + elapsedTime);
	}

	private static String getStackTrace(final Throwable exception)
	{
		final StringWriter sw = new StringWriter();
		exception.printStackTrace(new PrintWriter(sw));
		final String stacktrace = sw.toString();
		return stacktrace;
	}

}