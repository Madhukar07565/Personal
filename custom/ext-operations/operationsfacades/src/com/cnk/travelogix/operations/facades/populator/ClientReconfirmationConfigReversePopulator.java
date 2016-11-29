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
package com.cnk.travelogix.operations.facades.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.client.core.b2bunit.model.TravelogixB2BUnitModel;
import com.cnk.travelogix.datamodel.operation.clientreconfirmationconfig.model.ClientReconfirmationConfigModel;
import com.cnk.travelogix.datamodel.operation.reconfirmationinterval.model.ReconfirmationIntervalModel;
import com.cnk.travelogix.masterdata.core.enums.ReconfirmationToBeSentToType;
import com.cnk.travelogix.operations.data.ClientReconfirmationConfigData;
import com.cnk.travelogix.operations.data.ReconfirmationIntervalData;
import com.cnk.travelogix.operations.services.ClientService;


/**
 * Populating ClientReconfirmationConfig model into data.
 *
 * @author C5244543
 */
public class ClientReconfirmationConfigReversePopulator
		implements Populator<ClientReconfirmationConfigData, ClientReconfirmationConfigModel>
{
	@Autowired
	private ClientService clientService;
	@Autowired
	private ModelService modelService;

	@Autowired
	private Converter<ReconfirmationIntervalData, ReconfirmationIntervalModel> reconfirmationIntervalReverseConverter;

	@Override
	public void populate(final ClientReconfirmationConfigData source, final ClientReconfirmationConfigModel target)
			throws ConversionException
	{
		if (source != null)
		{
			target.setReconfirmationTo(ReconfirmationToBeSentToType.valueOf(source.getReconfirmationTo()));
			if (source.getClient() != null)
			{
				target.setClient(getClient(source));
			}
			final ReconfirmationIntervalModel intervalModel = modelService.create(ReconfirmationIntervalModel.class);

			target.setClientReconfirmationInterval(
					reconfirmationIntervalReverseConverter.convert(source.getClientReconfirmationInterval(), intervalModel));

		}
	}

	private TravelogixB2BUnitModel getClient(final ClientReconfirmationConfigData source)
	{
		return clientService.findClientByCode(source.getClient().getCode());
	}
}
