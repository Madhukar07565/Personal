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

import javax.validation.ValidationException;

import org.apache.log4j.Logger;

import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;
import com.cnk.travelogix.product.common.core.model.SectorModel;
import com.cnk.travelogix.product.transport.masters.core.model.RouteConnectionModel;


/**
 * Interceptor to validate Route Connection <br>
 * <h6>Max Sectors = 3</h6>
 */
public class RouteConnectionValidateInterceptor implements ValidateInterceptor<RouteConnectionModel>
{
	private static final Logger LOG = Logger.getLogger(RouteConnectionValidateInterceptor.class.getName());

	@Override
	public void onValidate(final RouteConnectionModel routeConnection, final InterceptorContext context)
			throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside onValidate() of  RouteConnectionValidateInterceptor");
		}

		final Collection<SectorModel> sectors = routeConnection.getSectors();

		//validateSectorFields(sectors);

		if (sectors == null || sectors.size() < 2 || sectors.size() > 3)
		{
			throw new InterceptorException(Localization.getLocalizedString("routeconnection.sectors.limit"));
		}

		validateSectorToFields(sectors);
		if (LOG.isDebugEnabled())
		{
			LOG.info("End onValidate() of  RouteConnectionValidateInterceptor");
		}
	}

	private static void validateSectorFields(final Collection<SectorModel> sectors) throws InterceptorException
	{
		if (sectors != null)
		{
			int index = 0;
			for (final SectorModel sector : sectors)
			{
				if ((index < 2) && ((sector.getFromCity() == null) || (sector.getToCity() == null)))
				{
					throw new ValidationException(Localization.getLocalizedString("routeconnection.sectors.from.to.city"));
				}
				index = index + 1;
			}
		}
	}

	private static void validateSectorToFields(final Collection<SectorModel> sectors) throws InterceptorException
	{
		if (sectors != null)
		{
			//final int size = sectors.size();
			int index = 1;
			for (final SectorModel sector : sectors)
			{
				CityModel fromCity = sector.getFromCity().getCity();

				if (index == 1)
				{
					fromCity = sector.getToCity().getCity();
				}
				if ((index == 2) && !(sector.getFromCity().getCity().equals(fromCity)))
				{
					throw new InterceptorException(Localization.getLocalizedString("route.sector.from.to.city"));
				}
				else
				{
					fromCity = sector.getToCity().getCity();
				}

				if ((index == 3) && !(sector.getFromCity().getCity().equals(fromCity)))
				{
					throw new InterceptorException(Localization.getLocalizedString("route.sector.from.to.city"));
				}
				index = index + 1;
			}
		}
	}
}

