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
package com.cnk.travelogix.product.transport.masters.core.services.impl;

import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.apache.commons.lang.StringUtils;

import com.cnk.travelogix.product.transport.masters.core.model.AirRouteModel;
import com.cnk.travelogix.product.transport.masters.core.services.RouteIdService;


/**
 * Route Id
 */
public class DefaultRouteIdService implements RouteIdService
{
	private KeyGenerator keyGenerator;

	@Override
	public void generateRouteId(final AirRouteModel airRouteModel)
	{
		String key = "";
		if (StringUtils.isNotEmpty(airRouteModel.getRouteFromCity().getCode())
				&& StringUtils.isNotEmpty(airRouteModel.getRouteToCity().getCode()))
		{
			key = airRouteModel.getRouteFromCity().getCode().concat(airRouteModel.getRouteToCity().getCode())
					.concat(keyGenerator.generate().toString());
			airRouteModel.setCode(key);
		}
	}

	public KeyGenerator getKeyGenerator()
	{
		return keyGenerator;
	}

	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}
}
