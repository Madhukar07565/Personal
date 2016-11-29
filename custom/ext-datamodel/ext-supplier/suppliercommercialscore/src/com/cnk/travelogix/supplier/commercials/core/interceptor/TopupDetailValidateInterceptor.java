/**
 *
 */
package com.cnk.travelogix.supplier.commercials.core.interceptor;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.util.localization.Localization;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.commercials.core.advanced.incentiveontopup.model.TopupDetailModel;
import com.cnk.travelogix.supplier.commercials.core.service.TopupDetailService;


/**
 * Class to validate duplicate entries for combination of Currency-Amount-IncentivePercentage
 *
 */
public class TopupDetailValidateInterceptor implements ValidateInterceptor<TopupDetailModel>
{
	private TopupDetailService topupDetailService;
	private static final Logger LOG = Logger.getLogger(TopupDetailValidateInterceptor.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.ValidateInterceptor#onValidate(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onValidate(final TopupDetailModel topupDetailModel, final InterceptorContext ctx) throws InterceptorException
	{
		if (ctx.isNew(topupDetailModel))
		{
			try
			{
				topupDetailService.getTopupDetails(topupDetailModel);
			}
			catch (final DuplicateUidException e)
			{
				LOG.error(e);
				throw new InterceptorException(Localization.getLocalizedString("topupdetail.combination.validation.message"));

			}
		}
	}

	/**
	 * @return the topupDetailService
	 */
	public TopupDetailService getTopupDetailService()
	{
		return topupDetailService;
	}

	/**
	 * @param topupDetailService
	 *           the topupDetailService to set
	 */
	public void setTopupDetailService(final TopupDetailService topupDetailService)
	{
		this.topupDetailService = topupDetailService;
	}


}
