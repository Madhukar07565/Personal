/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.client.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.util.localization.Localization;

import com.cnk.travelogix.client.core.corporate.policy.model.CorporateTravelPolicyModel;


/**
 * interceptor to validate effective to date
 */
public class CorporateTravelPolicyValidateInterceptor implements ValidateInterceptor<CorporateTravelPolicyModel>
{

	@Override
	public void onValidate(final CorporateTravelPolicyModel corporateTravelPolicyModel, final InterceptorContext ctx)
			throws InterceptorException
	{

		if (corporateTravelPolicyModel.getEffectiveFrom() != null && corporateTravelPolicyModel.getEffectiveTo() != null
				&& corporateTravelPolicyModel.getEffectiveFrom().compareTo(corporateTravelPolicyModel.getEffectiveTo()) >= 0)
		{
			throw new InterceptorException(Localization.getLocalizedString("corporatetravelpolicy.effectiveto.validation"));
		}

	}
}
