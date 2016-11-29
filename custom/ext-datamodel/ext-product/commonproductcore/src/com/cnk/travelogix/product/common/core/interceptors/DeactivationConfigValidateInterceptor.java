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
package com.cnk.travelogix.product.common.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.util.localization.Localization;

import com.cnk.travelogix.product.common.core.model.DeactivationConfigModel;


/**
 * This class helps us to validate/comparing dates
 */
public class DeactivationConfigValidateInterceptor implements ValidateInterceptor<DeactivationConfigModel>
{

	@Override
	public void onValidate(final DeactivationConfigModel deactivationConfig, final InterceptorContext context)
			throws InterceptorException
	{
		if (deactivationConfig.getValidityStartDate() != null && deactivationConfig.getValidityEndDate() != null
				&& deactivationConfig.getValidityStartDate().compareTo(deactivationConfig.getValidityEndDate()) > 0)
		{
			throw new InterceptorException(Localization.getLocalizedString("deactivationConfig.validdates"));
		}
	}

}
