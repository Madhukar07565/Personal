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
package com.cnk.travelogix.client.config.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.util.localization.Localization;

import java.math.BigDecimal;

import org.apache.log4j.Logger;

import com.cnk.travelogix.client.config.core.model.MLMDistributionModel;


/**
 * Total of parent and child percentage should not exceed 100.
 */
public class MLMDistributionValidateInterceptor implements ValidateInterceptor<MLMDistributionModel>
{
	private static final Logger LOG = Logger.getLogger(MLMDistributionValidateInterceptor.class.getName());

	@Override
	public void onValidate(final MLMDistributionModel mlmDistributionModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside onValidate() of  MLMDistributionValidateInterceptor");
		}
		validateDistributionPercentage(mlmDistributionModel);
		if (LOG.isDebugEnabled())
		{
			LOG.info("End onValidate() of  MLMDistributionValidateInterceptor");
		}
	}

	private void validateDistributionPercentage(final MLMDistributionModel mlmDistributionModel) throws InterceptorException
	{
		final BigDecimal temp = new BigDecimal("100");
		final BigDecimal parentDistribution = mlmDistributionModel.getParentDistribution();
		final BigDecimal childDistribution = mlmDistributionModel.getChildDistribution();

		if (parentDistribution != null && parentDistribution.add(childDistribution).compareTo(temp) == 1)
		{
			throw new InterceptorException(Localization.getLocalizedString("mlm.distribution.total"));
		}
	}

}
