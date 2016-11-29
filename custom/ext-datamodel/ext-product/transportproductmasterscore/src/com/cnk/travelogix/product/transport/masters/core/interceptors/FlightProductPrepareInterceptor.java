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

import de.hybris.platform.catalog.CatalogService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;

import com.cnk.travelogix.product.transport.masters.core.model.FlightProductModel;
import com.cnk.travelogix.product.transport.masters.core.services.FlightProductService;



public class FlightProductPrepareInterceptor implements PrepareInterceptor
{
	private CatalogService catalogService;
	private KeyGenerator keyGenerator;
	@Resource
	private ModelService modelService;
	@Resource
	private FlightProductService flightProductService;

	@Override
	public void onPrepare(final Object model, final InterceptorContext ctx) throws InterceptorException
	{
		if (ctx.isNew(model))
		{
			final FlightProductModel flightProductModel = (FlightProductModel) model;
			if (StringUtils.isNotEmpty(flightProductModel.getCatalogVersion().getCatalog().getCompany().getUid())
					&& StringUtils.isNotEmpty(flightProductModel.getName()))
			{
				String company = flightProductModel.getCatalogVersion().getCatalog().getCompany().getUid();
				company = company.substring(0, 3);
				flightProductModel.setCode(company.concat(flightProductModel.getName().replaceAll(" ", "")));
			}
			generateCommonProductId(flightProductModel);
		}
	}

	protected void generateCommonProductId(final FlightProductModel flightProductModel)
	{
		final List<FlightProductModel> productList = flightProductService
				.findFlightProductByNameFinanceIDIata(flightProductModel.getAirlineIATA(), flightProductModel.getName());
		if (!productList.isEmpty())
		{
			flightProductModel.setCommonProductID(productList.get(0).getCommonProductID());
		}
		else
		{
			flightProductModel.setCommonProductID(keyGenerator.generate().toString());
		}
	}

	public CatalogService getCatalogService()
	{
		return catalogService;
	}

	public void setCatalogService(final CatalogService catalogService)
	{
		this.catalogService = catalogService;
	}

	/**
	 * @return the keyGenerator
	 */
	public KeyGenerator getKeyGenerator()
	{
		return keyGenerator;
	}

	/**
	 * @param keyGenerator
	 *           the keyGenerator to set
	 */
	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}
}
