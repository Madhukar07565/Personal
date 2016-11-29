/**
 *
 */
package com.cnk.travelogix.supplier.rates.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.util.localization.Localization;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.rates.model.DiscretionaryDiscountModel;


public class DiscretionaryDiscountValidateInterceptor implements ValidateInterceptor<DiscretionaryDiscountModel>
{
	private final static Logger LOG = Logger.getLogger(DiscretionaryDiscountValidateInterceptor.class.getName());

	/*
	 * Intercepter to validate Discount value in DiscretionaryDiscount <br> <h6>Total Discount Allocated</h6> <br>
	 * <h6>Discount Allocated</h6>
	 */

	@Override
	public void onValidate(final DiscretionaryDiscountModel discretionaryDiscountModel, final InterceptorContext arg1)
			throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside onValidate() of  DiscretionaryDiscountValidateInterceptor");
		}
		if (discretionaryDiscountModel.getTotalDiscountAllocated() != null
				&& discretionaryDiscountModel.getUnallocatedDiscount() != null)
		{
			if (discretionaryDiscountModel.getTotalDiscountAllocated().doubleValue() <= discretionaryDiscountModel
					.getUnallocatedDiscount().doubleValue())
			{
				throw new InterceptorException(Localization.getLocalizedString("supplierrate.definition.validate.error.message"));
			}
		}
		if (LOG.isDebugEnabled())
		{
			LOG.info("End onValidate() of  DiscretionaryDiscountValidateInterceptor");
		}
	}
}
