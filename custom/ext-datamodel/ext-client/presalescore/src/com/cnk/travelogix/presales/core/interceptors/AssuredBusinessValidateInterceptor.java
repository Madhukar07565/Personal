package com.cnk.travelogix.presales.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.util.localization.Localization;

import org.apache.log4j.Logger;

import com.cnk.travelogix.presales.core.service.AssuredBusinessService;
import com.cnk.travelogix.presales.model.AssuredBusinessModel;


/**
 * Validate Intercepter to validate from and To Date.
 */
public class AssuredBusinessValidateInterceptor implements ValidateInterceptor<AssuredBusinessModel>
{
	private AssuredBusinessService assuredBusinessService;

	private static final Logger LOG = Logger.getLogger(AssuredBusinessValidateInterceptor.class.getName());

	@Override
	public void onValidate(final AssuredBusinessModel assuredBusinessModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside onValidate() of  AssuredBusinessValidateInterceptor");
		}

		final boolean isToDateCorrect = assuredBusinessService.validateToDate(assuredBusinessModel);

		if (!isToDateCorrect)
		{
			throw new InterceptorException(Localization.getLocalizedString("assuredBusinessDetails.validTo.error"));
		}

		if (LOG.isDebugEnabled())
		{
			LOG.info("End onValidate() of  AssuredBusinessValidateInterceptor");
		}
	}

	/**
	 * @return the assuredBusinessService
	 */
	public AssuredBusinessService getAssuredBusinessService()
	{
		return assuredBusinessService;
	}

	/**
	 * @param assuredBusinessService
	 *           the assuredBusinessService to set
	 */
	public void setAssuredBusinessService(final AssuredBusinessService assuredBusinessService)
	{
		this.assuredBusinessService = assuredBusinessService;
	}
}
