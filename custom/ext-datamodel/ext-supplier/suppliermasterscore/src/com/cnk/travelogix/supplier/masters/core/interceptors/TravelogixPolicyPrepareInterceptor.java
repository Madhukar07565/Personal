/**
 *
 */
package com.cnk.travelogix.supplier.masters.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import com.cnk.travelogix.masterdata.core.model.TravelogixPolicyModel;
import com.cnk.travelogix.supplier.masters.core.services.PolicyIdService;


/**
 * Injecting policyidservices to generate policy id
 *
 */

public class TravelogixPolicyPrepareInterceptor implements PrepareInterceptor<TravelogixPolicyModel>
{


	private PolicyIdService policyIdService;

	@Resource
	private ModelService modelService;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.PrepareInterceptor#onPrepare(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onPrepare(final TravelogixPolicyModel travelogixPolicyModel, final InterceptorContext arg1)
			throws InterceptorException
	{
		policyIdService.generatePolicyId(travelogixPolicyModel);

	}

	/**
	 * @return the policyIdService
	 */
	public PolicyIdService getPolicyIdService()
	{
		return policyIdService;
	}

	/**
	 * @param policyIdService
	 *           the policyIdService to set
	 */
	public void setPolicyIdService(final PolicyIdService policyIdService)
	{
		this.policyIdService = policyIdService;
	}


}
