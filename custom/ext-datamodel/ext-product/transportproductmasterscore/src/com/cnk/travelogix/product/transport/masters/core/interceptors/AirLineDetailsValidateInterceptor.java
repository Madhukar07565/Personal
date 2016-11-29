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
package com.cnk.travelogix.product.transport.masters.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.util.localization.Localization;

import org.apache.log4j.Logger;

import com.cnk.travelogix.product.transport.masters.core.model.AirLineDetailsModel;


/**
 * Interceptor to validate Airline Details <br>
 * <h6>From Flight number</h6> <br>
 * <h6>To Flight number</h6>
 */
public class AirLineDetailsValidateInterceptor implements ValidateInterceptor<AirLineDetailsModel>
{
	private static final Logger LOG = Logger.getLogger(AirLineDetailsValidateInterceptor.class.getName());

	@Override
	public void onValidate(final AirLineDetailsModel airLineDetailsModel, final InterceptorContext ctx) throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside onValidate() of  AirLineDetailsValidateInterceptor");
		}
		if (airLineDetailsModel.getFlightNumberFrom() != null)
		{
			if (airLineDetailsModel.getFlightNumberTo() != null && ((airLineDetailsModel.getFlightNumberTo().intValue()
					- airLineDetailsModel.getFlightNumberFrom().intValue()) < 0))
			{
				throw new InterceptorException(Localization.getLocalizedString("airlinedetails.from.number.validation.message"));
			}
		}
		else
		{
			throw new InterceptorException(Localization.getLocalizedString("airlinedetails.from.number.mandatory"));

		}
		if (LOG.isDebugEnabled())
		{
			LOG.info("End onValidate() of  AirLineDetailsValidateInterceptor");
		}
	}

}