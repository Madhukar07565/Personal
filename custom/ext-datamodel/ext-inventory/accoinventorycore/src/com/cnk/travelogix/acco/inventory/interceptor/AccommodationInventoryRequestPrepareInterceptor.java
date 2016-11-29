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
package com.cnk.travelogix.acco.inventory.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.util.localization.Localization;

import com.cnk.travelogix.acco.inventory.service.AccoInventoryService;
import com.cnk.travelogix.accoinventory.core.model.AccommodationInventoryRequestModel;


// TODO: Auto-generated Javadoc
/**
 * The Class AccommodationInventoryRequestPrepareInterceptor.
 */
public class AccommodationInventoryRequestPrepareInterceptor implements PrepareInterceptor<AccommodationInventoryRequestModel>
{

	/** The Constant LOGGER. */
	private static final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger
			.getLogger(AccommodationInventoryRequestPrepareInterceptor.class);

	/** The acco inventory service. */
	private AccoInventoryService accoInventoryService;

	/**
	 * On prepare.
	 *
	 * @param var1
	 *           the var 1
	 * @param var2
	 *           the var 2
	 * @throws InterceptorException
	 *            the interceptor exception
	 */
	@Override
	public void onPrepare(final AccommodationInventoryRequestModel var1, final InterceptorContext var2) throws InterceptorException
	{
		LOGGER.debug("AccommodationInventoryRequestPrepareInterceptor : onPrepare() : Entering.");

		try
		{
			getAccoInventoryService().generateUniqueId(var1);
		}
		catch (final Exception e)
		{
			throw new InterceptorException(Localization.getLocalizedString("err.accoinvreq.generate.unique.id"), e);
		}

		LOGGER.debug("AccommodationInventoryRequestPrepareInterceptor : onPrepare() : Exiting.");
	}

	/**
	 * Gets the acco inventory service.
	 *
	 * @return the accoInventoryService
	 */
	public AccoInventoryService getAccoInventoryService()
	{
		return accoInventoryService;
	}

	/**
	 * Sets the acco inventory service.
	 *
	 * @param accoInventoryService
	 *           the accoInventoryService to set
	 */
	public void setAccoInventoryService(final AccoInventoryService accoInventoryService)
	{
		this.accoInventoryService = accoInventoryService;
	}
}
