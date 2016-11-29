/**
 *
 */
package com.cnk.travelogix.supplier.commercials.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.util.localization.Localization;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.commercials.core.advanced.termination.model.ReturnOfPayableModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.termination.model.SupplierTerminationFeeCommercialRecordModel;


/**
 * Validate interceptor for SupplierTerminationFeeCommercialRecordValidateInterceptor for period from and to date range
 *
 */
public class SupplierTerminationFeeCommercialRecordValidateInterceptor
		implements ValidateInterceptor<SupplierTerminationFeeCommercialRecordModel>
{
	private static final Logger log = Logger.getLogger(SupplierTerminationFeeCommercialRecordValidateInterceptor.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.ValidateInterceptor#onValidate(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onValidate(final SupplierTerminationFeeCommercialRecordModel terminationFeeCommercialModel,
			final InterceptorContext ctx) throws InterceptorException
	{

		if (log.isDebugEnabled())
		{
			log.info("Inside onValidate() of  TerminationFeeCommercialValidateInterceptor");
		}
		if (terminationFeeCommercialModel.getReturnOfPayables() != null)
		{
			for (final ReturnOfPayableModel returnOfPayable : terminationFeeCommercialModel.getReturnOfPayables())
			{
				if (returnOfPayable.getPeriodFrom() != null && returnOfPayable.getPeriodTo() != null
						&& (returnOfPayable.getPeriodFrom().compareTo(terminationFeeCommercialModel.getValidFrom()) == -1
								|| returnOfPayable.getPeriodTo().compareTo(terminationFeeCommercialModel.getValidTo()) == 1))
				{
					throw new InterceptorException(
							Localization.getLocalizedString("terminationfee.period.daterange.validation.message"));
				}
			}

		}
		if (log.isDebugEnabled())
		{
			log.info("End onValidate() of TerminationFeeCommercialValidateInterceptor");
		}
	}
}
