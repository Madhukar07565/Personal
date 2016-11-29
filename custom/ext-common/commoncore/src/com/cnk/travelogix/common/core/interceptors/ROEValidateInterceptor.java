package com.cnk.travelogix.common.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import java.util.Collection;

import com.cnk.travelogix.supplier.core.enums.ROEType;
import com.cnk.travelogix.supplier.core.supplier.model.ROEDetailsModel;
import com.cnk.travelogix.supplier.core.supplier.model.ROEModel;
import com.cnk.travelogix.supplier.core.supplier.model.TravelogixROEModel;


/**
 *
 */

/**
 * @author I320212
 *
 */
public class ROEValidateInterceptor implements ValidateInterceptor<TravelogixROEModel>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.ValidateInterceptor#onValidate(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onValidate(final TravelogixROEModel travelogixROEModel, final InterceptorContext arg1) throws InterceptorException
	{
		if (travelogixROEModel.getRoeType().equals(ROEType.SUPPLIER_REMITTANCE_ROE)
				&& (travelogixROEModel.getSupplierName() == null))
		{
			throw new InterceptorException("Supplier Name is Mandatory");
		}

		if (travelogixROEModel.getRoeType().equals(ROEType.PRODUCT_ROE))
		{
			if (travelogixROEModel.getProductCategory() == null)
			{
				throw new InterceptorException("Product category is mandatory");
			}
			if (travelogixROEModel.getProductCategorySubType() == null)
			{
				throw new InterceptorException("Product Category SubType is Mandatory");
			}
		}

		if (null != travelogixROEModel.getRoeType() && travelogixROEModel.getCompanyMarket() == null)
		{
			throw new InterceptorException("Please select at least one company market");
		}

		if (!(travelogixROEModel.getRoeType().equals(ROEType.DAILY_ROE)
				|| travelogixROEModel.getRoeType().equals(ROEType.INTERBANK_ROE)) && travelogixROEModel.getEffectiveToDate() == null)
		{
			throw new InterceptorException("Please select one Effective To Date");
		}

		if (travelogixROEModel.getRoeType().equals(ROEType.DAILY_ROE) && null != travelogixROEModel.getRoeies())
		{
			final Collection<ROEModel> roeModel = travelogixROEModel.getRoeies();
			for (final ROEModel model : roeModel)
			{
				final Collection<ROEDetailsModel> roeDetailsModel = model.getRoedetail();
				for (final ROEDetailsModel detailsModel : roeDetailsModel)
				{
					if (detailsModel.getBuyingROE() == null)
					{
						throw new InterceptorException("Buying ROE is Mandatory");
					}
					if (detailsModel.getSellingROE() == null)
					{
						throw new InterceptorException("SellingROE is Mandatory");
					}
				}
			}
		}
	}
}
