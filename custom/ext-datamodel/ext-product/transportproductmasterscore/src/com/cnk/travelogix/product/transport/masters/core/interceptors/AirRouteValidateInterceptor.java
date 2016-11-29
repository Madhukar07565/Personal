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

import java.util.Collection;

import org.apache.log4j.Logger;

import com.cnk.travelogix.product.common.core.model.SectorModel;
import com.cnk.travelogix.product.transport.masters.core.model.AirRouteModel;
import com.cnk.travelogix.product.transport.masters.core.model.RouteConnectionModel;


/**
 * Interceptor to validate sector's from/to country/city with route's from/to country/city
 */
public class AirRouteValidateInterceptor implements ValidateInterceptor<AirRouteModel>
{
	private static final Logger LOG = Logger.getLogger(AirRouteValidateInterceptor.class.getName());

	@Override
	public void onValidate(final AirRouteModel airRouteModel, final InterceptorContext context) throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside onValidate() of  AirRouteValidateInterceptor");
		}

		validateFromToCity(airRouteModel);

		if (LOG.isDebugEnabled())
		{
			LOG.info("End onValidate() of  AirRouteValidateInterceptor");
		}
	}

	private void validateFromToCity(final AirRouteModel airRouteModel) throws InterceptorException
	{
		final RouteConnectionModel routeConnection = airRouteModel.getSectors();
		final Collection<SectorModel> sectors = routeConnection.getSectors();
		final int size = sectors.size();
		int index = 1;

		for (final SectorModel sector : sectors)
		{
			if ((index == 1) && !(sector.getFromCity().getCity().equals(airRouteModel.getRouteFromCity().getCity())))
			{
				throw new InterceptorException(Localization.getLocalizedString("airroutefrom.sectorfrom.city.mismatch"));
			}

			if ((index == size) && !(sector.getToCity().getCity().equals(airRouteModel.getRouteToCity().getCity())))
			{
				throw new InterceptorException(Localization.getLocalizedString("airrouteto.sectorto.city.mismatch"));
			}
			index = index + 1;
		}
	}

}
