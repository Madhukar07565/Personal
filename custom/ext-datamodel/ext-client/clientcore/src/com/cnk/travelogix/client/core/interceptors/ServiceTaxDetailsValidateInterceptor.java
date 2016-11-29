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

import org.apache.log4j.Logger;

import com.cnk.travelogix.masterdata.core.fiancials.model.ServiceTaxDetailsModel;


/**
 * validateServiceTaxDetails method to validate Service Tax details based on value of serviceTaxEligibilty attribute.
 */
public class ServiceTaxDetailsValidateInterceptor implements ValidateInterceptor<ServiceTaxDetailsModel>
{
	private static final Logger LOG = Logger.getLogger(ServiceTaxDetailsValidateInterceptor.class.getName());

	@Override
	public void onValidate(final ServiceTaxDetailsModel model, final InterceptorContext ctx) throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside onValidate() of  ServiceTaxDetailsValidateInterceptor");
		}

		validateServiceTaxDetails(model);

		if (LOG.isDebugEnabled())
		{
			LOG.info("End onValidate() of  ServiceTaxDetailsValidateInterceptor");
		}
	}

	private void validateServiceTaxDetails(final ServiceTaxDetailsModel model) throws InterceptorException
	{
		if (model.getServiceTaxEligibilty().booleanValue() && model.getServiceTaxNo() == null)
		{
			throw new InterceptorException(Localization.getLocalizedString("travelogixB2BUnit.serviceTaxDetails.serviceTaxNo"));
		}

	}

}
