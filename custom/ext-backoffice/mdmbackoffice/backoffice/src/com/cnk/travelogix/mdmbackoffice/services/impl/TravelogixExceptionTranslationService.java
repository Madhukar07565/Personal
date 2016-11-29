/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.services.impl;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hybris.cockpitng.service.ExceptionTranslationHandler;
import com.hybris.cockpitng.service.impl.DefaultExceptionTranslationService;


/**
 * To modify the Error messages coming from handler
 */
public class TravelogixExceptionTranslationService extends DefaultExceptionTranslationService
{
	private static final Logger LOG = LoggerFactory.getLogger(TravelogixExceptionTranslationService.class);


	/**
	 *
	 * Override toString() from DefaultExceptionTranslationService to modify error messages received from Interceptors
	 */
	@Override
	public String toString(final Throwable exception)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("Start toString() of TravelogixExceptionTranslationService");
		}
		for (final ExceptionTranslationHandler exceptionTranslationHandler : getExceptionHandlers())
		{
			if (exceptionTranslationHandler.canHandle(exception))
			{
				return exceptionTranslationHandler.toString(exception).contains("]:")
						? StringUtils.substringAfterLast(exceptionTranslationHandler.toString(exception), "]:")
						: exceptionTranslationHandler.toString(exception);
			}
		}
		if (LOG.isDebugEnabled())
		{
			LOG.debug("Default Handler is" + getDefaultHandler().toString());
			LOG.debug("Befor return error message, received from Default handler");
		}
		if (getDefaultHandler().toString(exception).contains("]:"))
		{
			return StringUtils.substringAfterLast(getDefaultHandler().toString(exception), "]:");
		}
		else
		{
			return getDefaultHandler().toString(exception);
		}

	}
}
