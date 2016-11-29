/**
 *
 */
package com.cnk.travelogix.supplier.masters.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.util.localization.Localization;

import org.apache.log4j.Logger;

import com.cnk.travelogix.masterdata.core.model.TravelogixPolicyModel;
import com.cnk.travelogix.supplier.core.daos.services.TravelogixPolicyService;


/**
 * Interceptor to validate duplicacy of ProductCategorySubtype, PolicyType,Policy Category and Policy Name
 *
 */

public class TravelogixPolicyValidateInterceptor implements ValidateInterceptor<TravelogixPolicyModel>
{
	private static final Logger LOG = Logger.getLogger(TravelogixPolicyValidateInterceptor.class);

	TravelogixPolicyService travelogixPolicyService;

	@Override
	public void onValidate(final TravelogixPolicyModel travelogixPolicyModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside the onValidate method of AccoDynamicPolicyValidateInterceptor");
		}

		if (ctx.isNew(travelogixPolicyModel))
		{
			if (((travelogixPolicyModel.getProductCategorySubType() != null) && (travelogixPolicyModel.getPolicyCategory() != null)
					&& (travelogixPolicyModel.getPolicyType() != null) && (travelogixPolicyModel.getName() != null))
					&& (!travelogixPolicyService
							.duplicacyOfSlab(travelogixPolicyModel.getProductCategorySubType(), travelogixPolicyModel.getPolicyType(),
									travelogixPolicyModel.getName(), travelogixPolicyModel.getPolicyCategory())
							.isEmpty()))
			{
				LOG.debug("Record is already exist.");
				throw new InterceptorException(Localization.getLocalizedString("supplier.policy.duplicate"));
			}
		}
	}

	public TravelogixPolicyService getTravelogixPolicyService()
	{
		return travelogixPolicyService;
	}

	public void setTravelogixPolicyService(final TravelogixPolicyService travelogixPolicyService)
	{
		this.travelogixPolicyService = travelogixPolicyService;
	}
}
