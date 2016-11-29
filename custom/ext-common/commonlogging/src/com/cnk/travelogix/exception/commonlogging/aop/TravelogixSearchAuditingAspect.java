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

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.core.context.SecurityContextHolder;

import com.cnk.travelogix.exception.commonlogging.level.TravelogixAuditLogLevel;


/**
 *
 */
@Configurable
@Aspect
public class TravelogixSearchAuditingAspect
{
	/** The logger. */
	Logger logger = Logger.getLogger(TravelogixSearchAuditingAspect.class);

	@Autowired
	private UserService userService;

	@Around("execution(public * *(..)) && @annotation(auditSearchable)")
	public Object profileAuditSearchable(final ProceedingJoinPoint pjp, final AuditSearchable auditSearchable) throws Throwable
	{
		String auditingUsername = "";
		HttpServletRequest request = null;
		final long start = System.currentTimeMillis();
		try
		{
			if (SecurityContextHolder.getContext().getAuthentication() != null)
			{
				auditingUsername = SecurityContextHolder.getContext().getAuthentication().getName();
			}
			logger.log(TravelogixAuditLogLevel.AUDIT, "ACTION Initiated by: " + auditingUsername + " : " + pjp);
			final Object[] arguments = pjp.getArgs();

			for (final Object object : arguments)
			{
				if (!(object instanceof HttpServletRequest))
				{
					continue;
				}
				else
				{
					request = (HttpServletRequest) object;
					break;
				}
			}
			Object output;
			output = pjp.proceed();
			final long elapsedTime = System.currentTimeMillis() - start;
			if (request != null)
			{
				logger.log(TravelogixAuditLogLevel.AUDIT, "ACTION Initiated by: " + auditingUsername + " : " + pjp);
				logger.log(TravelogixAuditLogLevel.AUDIT, "Ip Address: " + request.getRemoteAddr());
				logger.log(TravelogixAuditLogLevel.AUDIT, "SessionId: " + request.getRequestedSessionId());
				logger.log(TravelogixAuditLogLevel.AUDIT, "URI: " + request.getRequestURI());
				logger.log(TravelogixAuditLogLevel.AUDIT, "Secure: " + request.isSecure());

				//				logger.log(TravelogixAuditLogLevel.AUDIT, "getDomain :" + userService.getCurrentUser().getDomain());
				//				logger.log(TravelogixAuditLogLevel.AUDIT, "getCN :" + userService.getCurrentUser().getCN());
				//				logger.log(TravelogixAuditLogLevel.AUDIT, "getDescription :" + userService.getCurrentUser().getDescription());
				//				logger.log(TravelogixAuditLogLevel.AUDIT, "getDisplayName :" + userService.getCurrentUser().getDisplayName());
				//				logger.log(TravelogixAuditLogLevel.AUDIT, "getName :" + userService.getCurrentUser().getName());
				//				logger.log(TravelogixAuditLogLevel.AUDIT, "getDN :" + userService.getCurrentUser().getDN());
				//				logger.log(TravelogixAuditLogLevel.AUDIT, "getName :" + userService.getCurrentUser().getName());
				//				logger.log(TravelogixAuditLogLevel.AUDIT, "getTenantId :" + userService.getCurrentUser().getTenantId());
				//				logger.log(TravelogixAuditLogLevel.AUDIT, "getUid :" + userService.getCurrentUser().getUid());
				//				logger.log(TravelogixAuditLogLevel.AUDIT, "getGroups :" + userService.getCurrentUser().getGroups());
				//				logger.log(TravelogixAuditLogLevel.AUDIT, "getModifiedtime :" + userService.getCurrentUser().getModifiedtime());
			}

			if (pjp.getArgs() != null && pjp.getArgs().length > 0)
			{
				final Object[] objects = pjp.getArgs();
				final Object logObject = objects[0];

				if (logObject instanceof ItemModel)
				{
					final ItemModel obj = (ItemModel) logObject;
					logger.log(TravelogixAuditLogLevel.AUDIT, obj.getClass().getName() + "has been updated by " + auditingUsername);
				}
				else
				{
					final String searchQuery = (String) objects[0];
					logger.log(TravelogixAuditLogLevel.AUDIT, "searchQuery: " + searchQuery);
				}
			}

			logger.log(TravelogixAuditLogLevel.AUDIT, "[\n" + getReqParameterNamesAndValue(request) + "]" + auditingUsername + " == "
					+ auditSearchable.actionType() + " == time elapsed == " + elapsedTime);
			return output;

		}
		catch (final Exception e)
		{
			e.printStackTrace();
			logger.error("Error while writing audit log ", e);

		}
		return null;
	}

	private String getReqParameterNamesAndValue(final HttpServletRequest request)
	{
		final StringBuilder nameValuePair = new StringBuilder();
		if (request != null)
		{
			final Map<String, String[]> params = new HashMap<String, String[]>(request.getParameterMap());
			final Iterator it = params.entrySet().iterator();
			while (it.hasNext())
			{
				final Map.Entry pair = (Map.Entry) it.next();//(a < 0) ? -a : a
				nameValuePair.append("Parameter Name is '" + pair.getKey() + "' and Parameter Value is '"
						+ (pair.getValue() != null ? pair.getValue().toString() : "") + "'\n");
				it.remove(); // avoids a ConcurrentModificationException
			}
			return nameValuePair.toString();
		}
		return "";
	}
}
