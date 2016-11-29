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
package com.cnk.travelogix.product.common.core.service.impl;

import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.storelocator.GPS;
import de.hybris.platform.storelocator.GeoWebServiceWrapper;
import de.hybris.platform.storelocator.data.AddressData;

import org.apache.log4j.Logger;

import com.cnk.travelogix.product.common.core.service.GeoLocationFinderService;


/**
 * {@link GeoLocationFinderService} Implementation to get Geo points for Address
 */
public class DefaultGeoLocationFinderService implements GeoLocationFinderService
{
	private GeoWebServiceWrapper geoWebServiceWrapper;
	private static final Logger LOG = Logger.getLogger(DefaultGeoLocationFinderService.class);

	@Override
	public void populateGeoLocation(final AddressModel addressModel)
	{
		try
		{
			final GPS resolvedPoint = getGeoWebServiceWrapper().geocodeAddress(generateGeoAddressForSearchQuery(addressModel));
			addressModel.setLatitude(Double.toString(resolvedPoint.getDecimalLatitude()));
			addressModel.setLongitude(Double.toString(resolvedPoint.getDecimalLongitude()));
		}
		catch (final Exception exception)
		{
			LOG.error(exception);
		}
	}

	protected AddressData generateGeoAddressForSearchQuery(final AddressModel addressModel)
	{
		// Create an address data
		final AddressData addressData = new AddressData();
		addressData.setStreet(addressModel.getStreetnumber() + " " + addressModel.getStreetname());
		addressData.setZip(addressModel.getPostalcode());
		addressData.setCity(addressModel.getCity().getName());
		addressData.setCountryCode(addressModel.getCountry().getName());
		return addressData;
	}

	public GeoWebServiceWrapper getGeoWebServiceWrapper()
	{
		return geoWebServiceWrapper;
	}

	public void setGeoWebServiceWrapper(final GeoWebServiceWrapper geoWebServiceWrapper)
	{
		this.geoWebServiceWrapper = geoWebServiceWrapper;
	}
}
