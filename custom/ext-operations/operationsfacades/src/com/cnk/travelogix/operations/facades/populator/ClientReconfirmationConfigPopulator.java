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

import com.cnk.travelogix.client.core.b2bunit.model.TravelogixB2BUnitModel;
import com.cnk.travelogix.datamodel.operation.clientreconfirmationconfig.model.ClientReconfirmationConfigModel;
import com.cnk.travelogix.datamodel.operation.reconfirmationinterval.model.ReconfirmationIntervalModel;
import com.cnk.travelogix.operations.data.ClientReconfirmationConfigData;
import com.cnk.travelogix.operations.data.ReconfirmationIntervalData;
import com.cnk.travelogix.operations.data.TravelogixB2BUnitData;


/**
 * Populating ClientReconfirmationConfig model into data.
 *
 * @author C5244543
 */
public class ClientReconfirmationConfigPopulator
		implements Populator<ClientReconfirmationConfigModel, ClientReconfirmationConfigData>
{
	private Converter<TravelogixB2BUnitModel, TravelogixB2BUnitData> travelogixB2BUnitConverter;
	private Converter<ReconfirmationIntervalModel, ReconfirmationIntervalData> reconfirmationIntervalConverter;

	@Override
	public void populate(final ClientReconfirmationConfigModel source, final ClientReconfirmationConfigData target)
			throws ConversionException
	{
		if (source != null)
		{
			target.setReconfirmationTo(source.getReconfirmationTo().getCode());
			target.setClient(travelogixB2BUnitConverter.convert(source.getClient()));
			target.setClientReconfirmationInterval(
					reconfirmationIntervalConverter.convert(source.getClientReconfirmationInterval()));
		}
	}

	/**
	 * @return the travelogixB2BUnitConverter
	 */
	public Converter<TravelogixB2BUnitModel, TravelogixB2BUnitData> getTravelogixB2BUnitConverter()
	{
		return travelogixB2BUnitConverter;
	}

	/**
	 * @param travelogixB2BUnitConverter
	 *           the travelogixB2BUnitConverter to set
	 */
	public void setTravelogixB2BUnitConverter(
			final Converter<TravelogixB2BUnitModel, TravelogixB2BUnitData> travelogixB2BUnitConverter)
	{
		this.travelogixB2BUnitConverter = travelogixB2BUnitConverter;
	}

	/**
	 * @param reconfirmationIntervalConverter
	 *           the reconfirmationIntervalConverter to set
	 */
	public void setReconfirmationIntervalConverter(
			final Converter<ReconfirmationIntervalModel, ReconfirmationIntervalData> reconfirmationIntervalConverter)
	{
		this.reconfirmationIntervalConverter = reconfirmationIntervalConverter;
	}


}
