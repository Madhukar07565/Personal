/**
 *
 */
package com.cnk.travelogix.datamodel.supplier.rates.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.model.AbstractTravelogixSupplierOfferModel;
import com.cnk.travelogix.masterdata.core.enums.ApprovalWorkFlowStatus;


/**
 * <li>To create the unique offer Id for each offer created</li>
 * <li>To validate effective from date</li>
 *
 */
public class TravelogixSupplierOfferRemoveInterceptor implements RemoveInterceptor
{
	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.servicelayer.interceptor.RemoveInterceptor#onRemove(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onRemove(final Object model, final InterceptorContext ctx) throws InterceptorException
	{
		final AbstractTravelogixSupplierOfferModel travelLogixModel = (AbstractTravelogixSupplierOfferModel) model;

		if (ApprovalWorkFlowStatus.QC_PENDING.getCode().equalsIgnoreCase(travelLogixModel.getWorkFlowStatus().getCode()))
		{
			throw new InterceptorException("Offer can't be delete because it has submitted for approval");
		}
	}
}
