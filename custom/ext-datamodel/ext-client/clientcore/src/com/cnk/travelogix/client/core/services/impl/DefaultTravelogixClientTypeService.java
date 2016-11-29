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
package com.cnk.travelogix.client.core.services.impl;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.client.core.clienttype.model.TravelogixClientTypeModel;
import com.cnk.travelogix.client.core.services.TravelogixClientTypeService;


/**
 * Service to generate client entity name
 */
public class DefaultTravelogixClientTypeService implements TravelogixClientTypeService
{
	private static final Logger LOG = Logger.getLogger(DefaultTravelogixClientTypeService.class);


	@Override
	public void generateClientEntityName(final TravelogixClientTypeModel travelogixClientTypeModel)
	{

		if (StringUtils.isEmpty(travelogixClientTypeModel.getName()))

		{

			final String clientEntityName = travelogixClientTypeModel.getClientType().getCode().substring(0, 3)
					.concat(travelogixClientTypeModel.getLanguage().getName().substring(0, 3));

			travelogixClientTypeModel.setName(clientEntityName);

			LOG.debug(" Generated Client Entity Name is:" + travelogixClientTypeModel.getName());
		}


	}

}
