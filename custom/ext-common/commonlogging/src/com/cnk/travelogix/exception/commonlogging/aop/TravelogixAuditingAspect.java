package com.cnk.travelogix.exception.commonlogging.aop;

import de.hybris.platform.core.model.security.PrincipalGroupModel;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
 * The Class TravelogixAuditingAspect.
 */
@Configurable
@Aspect
public class TravelogixAuditingAspect
{

	/** The logger. */
	Logger logger = Logger.getLogger(TravelogixAuditingAspect.class);


	@Autowired
	private UserService userService;

	/**
	 * Profile.
	 *
	 * @param pjp
	 *           the pjp
	 * @param auditable
	 *           the auditable
	 * @return the object
	 * @throws Throwable
	 *            the throwable
	 */
	@Around("execution(public * *(..)) && @annotation(auditable)")
	public Object profile(final ProceedingJoinPoint pjp, final Auditable auditable) throws Throwable
	{

		HttpServletRequest request = null;
		final long start = System.currentTimeMillis();
		String auditingUsername = "";

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

			if (request != null)
			{
				logger.log(TravelogixAuditLogLevel.AUDIT, "Ip Address: " + request.getRemoteAddr());
				logger.log(TravelogixAuditLogLevel.AUDIT, "SessionId: " + request.getRequestedSessionId());
				logger.log(TravelogixAuditLogLevel.AUDIT, "URI: " + request.getRequestURI());
				//logger.log(TravelogixAuditLogLevel.AUDIT, "Secure: " + request.isSecure());
			}
			logger.log(TravelogixAuditLogLevel.AUDIT, "getDomain :" + userService.getCurrentUser().getDomain());

			final Set<PrincipalGroupModel> principalGroupModels = userService.getCurrentUser().getAllgroups();
			if (principalGroupModels != null && principalGroupModels.size() > 0)
			{
				final Iterator iter = principalGroupModels.iterator();
				while (iter.hasNext())
				{
					final PrincipalGroupModel principalGroupModel = (PrincipalGroupModel) iter.next();
					logger.log(TravelogixAuditLogLevel.AUDIT,
							"Group Id :" + principalGroupModel.getUid() + ", Group Name :" + principalGroupModel.getDisplayName());
				}
			}
			final long elapsedTime = System.currentTimeMillis() - start;
			logger.log(TravelogixAuditLogLevel.AUDIT, "[" + getReqParameterNamesAndValue(request) + "]" + auditingUsername + " == "
					+ auditable.actionType() + " == time elapsed == " + elapsedTime);

			return output;

		}
		catch (final Exception e)
		{
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
