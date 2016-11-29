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
package com.cnk.travelogix.common.facades.order.populators;

import de.hybris.platform.commercefacades.order.data.CartModificationData;
import de.hybris.platform.commercefacades.order.data.CnkCartEntryModificationData;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commerceservices.order.CnkCartEntryModification;
import de.hybris.platform.commerceservices.order.CommerceCartModification;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;


/**
 *
 */
public class CnkCartModificationPopulator implements Populator<CommerceCartModification, CartModificationData>
{
	private Converter<AbstractOrderEntryModel, OrderEntryData> orderEntryConverter;

	protected Converter<AbstractOrderEntryModel, OrderEntryData> getOrderEntryConverter()
	{
		return orderEntryConverter;
	}

	@Required
	public void setOrderEntryConverter(final Converter<AbstractOrderEntryModel, OrderEntryData> orderEntryConverter)
	{
		this.orderEntryConverter = orderEntryConverter;
	}

	@Override
	public void populate(CommerceCartModification source, CartModificationData target) throws ConversionException
	{
//		if (source.getEntry().getOrder() != null)
//		{
//			target.setCartCode(source.getEntry().getOrder().getCode());
//		}
		target.setStatusCode(source.getStatusCode());
		target.setQuantity(source.getQuantity());
		target.setQuantityAdded(source.getQuantityAdded());
		if (source.getEntries() != null && !source.getEntries().isEmpty())
		{
//			target.setCartCode(source.getEntries().get(0).getOrder().getCode());
			List<CnkCartEntryModificationData> entries = new ArrayList<CnkCartEntryModificationData>();
			for (CnkCartEntryModification entry : source.getEntries())
			{
				OrderEntryData entryData = getOrderEntryConverter().convert(entry.getEntry());
				CnkCartEntryModificationData entryMod = new CnkCartEntryModificationData();
				entryMod.setEntry(entryData);
				entryMod.setStatusCode(entry.getStatusCode());
				entries.add(entryMod);
			}
			target.setEntries(entries);
		}
	}

}
