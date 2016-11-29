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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;

import com.cnk.travelogix.masterdata.core.model.TravellerProgramModel;
import com.cnk.travelogix.product.transport.masters.core.model.FlightProductModel;
import com.cnk.travelogix.product.transport.masters.core.services.FlightProductService;


/**
 * Interceptor to validate Flight Product <br>
 * <h6>Main airline selection is mandatory for brand airline</h6> <br>
 * <h6>Max TravellerPrograms = 5</h6> Traveller programs should be unique Finance controler id should unique per catalog
 */

public class FlightProductValidateInterceptor implements ValidateInterceptor<FlightProductModel>
{
	private static final Logger LOG = Logger.getLogger(FlightProductValidateInterceptor.class.getName());

	private FlightProductService flightProductService;


	@Override
	public void onValidate(final FlightProductModel flightProduct, final InterceptorContext context) throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside onValidate() of  FlightProductValidateInterceptor");
		}
		validateBrandAirline(flightProduct);
		if ((context.isNew(flightProduct) || context.getDirtyAttributes(flightProduct).containsKey("financeControlId"))
				&& flightProduct.getFinanceControlId() != null
				&& (!flightProductService.findFlightProductByfinanceControlAndCatalog(flightProduct.getFinanceControlId(),
						flightProduct.getCatalogVersion()).isEmpty()))
		{
			LOG.debug("This is finance controler id is duplicated");
			throw new InterceptorException(
					Localization.getLocalizedString("flightproduct.brandairline.financecontrolid.duplicate.ER10"));
		}

		validateTraveller(flightProduct);
		if (LOG.isDebugEnabled())
		{
			LOG.info("End onValidate() of  FlightProductValidateInterceptor");
		}
	}

	/**
	 * See if duplicates travellerprogram exist.
	 */

	static void checkDuplicates(final List<String> list) throws InterceptorException
	{
		for (int i = 0; i < list.size(); i++)
		{
			for (int x = i + 1; x < list.size(); x++)
			{
				if (list.get(i).equals(list.get(x)))
				{
					throw new InterceptorException(
							Localization.getLocalizedString("flightproduct.brandairline.travellerprogram.duplicate"));
				}
			}
		}
	}

	private static void validateTraveller(final FlightProductModel flightProduct) throws InterceptorException
	{
		final Collection<TravellerProgramModel> travellerPrograms = flightProduct.getTravellerPrograms();
		if (travellerPrograms != null)
		{
			if (travellerPrograms.size() > 5)
			{
				throw new InterceptorException(Localization.getLocalizedString("flightproduct.brandairline.travellerprogram.limit"));
			}
			else
			{
				final List<String> pkValues = new ArrayList<String>();
				for (final TravellerProgramModel model : travellerPrograms)
				{
					pkValues.add(model.getPk().toString());
				}
				checkDuplicates(pkValues);
			}
		}
	}

	private static void validateBrandAirline(final FlightProductModel flightProduct) throws InterceptorException
	{
		if (flightProduct.getBrandAirline() != null && flightProduct.getBrandAirline().booleanValue()
				&& flightProduct.getMainAirlineProduct() == null)
		{
			throw new InterceptorException(Localization.getLocalizedString("flightproduct.brandairline.mandatory"));
		}
	}

	/**
	 * @return the flightProductService
	 */
	public FlightProductService getFlightProductService()
	{
		return flightProductService;
	}

	/**
	 * @param flightProductService
	 *           the flightProductService to set
	 */
	public void setFlightProductService(final FlightProductService flightProductService)
	{
		this.flightProductService = flightProductService;
	}

}
