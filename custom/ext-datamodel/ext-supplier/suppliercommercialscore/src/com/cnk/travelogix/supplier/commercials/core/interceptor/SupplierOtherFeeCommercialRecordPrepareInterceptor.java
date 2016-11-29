/**
 *
 */
package com.cnk.travelogix.supplier.commercials.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.model.ModelService;

import com.cnk.travelogix.masterdata.core.enums.ApprovalWorkFlowStatus;
import com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.model.SupplierOtherFeeCommercialRecordModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.paymentadvice.model.PaymentAdviceForOtherFeeModel;


/**
 * Preparing PaymentAdviceForOtherFeeModel on approval of OtherFeeCommercialModel
 *
 */
public class SupplierOtherFeeCommercialRecordPrepareInterceptor implements PrepareInterceptor<SupplierOtherFeeCommercialRecordModel>
{
	ModelService modelService;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.PrepareInterceptor#onPrepare(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onPrepare(final SupplierOtherFeeCommercialRecordModel otherFeeCommercialModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (otherFeeCommercialModel.getWorkFlowStatus() == ApprovalWorkFlowStatus.PUBLISH)
		{
			final PaymentAdviceForOtherFeeModel paymentAdviceForOtherFeeModel = modelService
					.create(PaymentAdviceForOtherFeeModel.class);
			paymentAdviceForOtherFeeModel.setCommercial(otherFeeCommercialModel);
		}
	}

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

}
