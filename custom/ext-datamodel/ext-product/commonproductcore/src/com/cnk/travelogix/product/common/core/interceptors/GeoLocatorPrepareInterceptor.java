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

import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import java.util.Locale;
import java.util.Map;
import java.util.Set;

import com.cnk.travelogix.product.common.core.service.GeoLocationFinderService;


/**
 * Interceptor for GeoLocatorPrepareInterceptor
 */
public class GeoLocatorPrepareInterceptor implements PrepareInterceptor<AddressModel>
{

	private GeoLocationFinderService geoLocationFinderService;


	@Override
	public void onPrepare(final AddressModel addressModel, final InterceptorContext ctx) throws InterceptorException
	{


		// YTODO Auto-generated method stub
		final Map<String, Set<Locale>> dirtyAttributes = ctx.getDirtyAttributes(addressModel);

		if (ctx.isNew(addressModel) || dirtyAttributes.containsKey("city") || dirtyAttributes.containsKey("country"))
		{
			geoLocationFinderService.populateGeoLocation(addressModel);

		}

	}

	/**
	 * @return the geoLocationFinderService
	 */
	public GeoLocationFinderService getGeoLocationFinderService()
	{
		return geoLocationFinderService;
	}

	/**
	 * @param geoLocationFinderService
	 *           the geoLocationFinderService to set
	 */
	public void setGeoLocationFinderService(final GeoLocationFinderService geoLocationFinderService)
	{
		this.geoLocationFinderService = geoLocationFinderService;
	}


}
