
package com.cnk.travelogix.client.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import com.cnk.travelogix.client.core.mid.model.MerchantIdentificationDetailsModel;
import com.cnk.travelogix.client.core.services.MerchantIdentificationDetailService;


/**
 * MIDPrepareInterceptor to generate MIDNumber
 */
public class MerchantIdentificationDetailsPrepareInterceptor implements PrepareInterceptor<MerchantIdentificationDetailsModel>
{
	@Resource
	private ModelService modelService;

	private MerchantIdentificationDetailService merchantIdentificationService;

	@Override
	public void onPrepare(final MerchantIdentificationDetailsModel merchantIdentificationDetailsModel,
			final InterceptorContext ctx) throws InterceptorException
	{
		if (ctx.isNew(merchantIdentificationDetailsModel))
		{
			merchantIdentificationService.generateMIDNumber(merchantIdentificationDetailsModel);
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

	/**
	 * @return the merchantIdentificationService
	 */
	public MerchantIdentificationDetailService getMerchantIdentificationService()
	{
		return merchantIdentificationService;
	}

	/**
	 * @param merchantIdentificationService
	 *           the merchantIdentificationService to set
	 */
	public void setMerchantIdentificationService(final MerchantIdentificationDetailService merchantIdentificationService)
	{
		this.merchantIdentificationService = merchantIdentificationService;
	}
}
