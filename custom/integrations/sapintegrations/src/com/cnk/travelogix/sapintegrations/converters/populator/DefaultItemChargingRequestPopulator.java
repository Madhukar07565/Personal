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
package com.cnk.travelogix.sapintegrations.converters.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.cnk.travelogix.custom.chargeable.itemcharging.ChargeableItem;
import com.cnk.travelogix.custom.chargeable.itemcharging.ChargeableItemChargeContext;
import com.cnk.travelogix.custom.chargeable.itemcharging.ChargeableItemChargeRequest;
import com.cnk.travelogix.custom.chargeable.itemcharging.ChargingOutputContext;
import com.cnk.travelogix.custom.chargeable.itemcharging.ChargingResultContext;
import com.cnk.travelogix.custom.chargeable.itemcharging.ChargingResultOnErrorContext;
import com.cnk.travelogix.custom.chargeable.itemcharging.SenderContext;
import com.cnk.travelogix.custom.chargeable.itemcharging.StringUniqueIdentifier;
import com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargeableItemChargeContextData;
import com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargeableItemChargeRequestData;
import com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargeableItemData;
import com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargeableItemProperty;
import com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargeableItemUserProperties;
import com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargingOutputContextData;
import com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargingResultContextData;
import com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargingResultOnErrorContextData;
import com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.SenderContextData;


/**
 *
 */
public class DefaultItemChargingRequestPopulator
		implements Populator<ChargeableItemChargeRequestData, ChargeableItemChargeRequest>
{

	@Override
	public void populate(final ChargeableItemChargeRequestData source, final ChargeableItemChargeRequest target)
			throws ConversionException
	{
		final ChargeableItem chargeableItem = new ChargeableItem();
		final StringUniqueIdentifier uniqId = new StringUniqueIdentifier();
		final ChargeableItemData chargeableItemData = source.getChargeableItem();
		final ChargeableItemChargeContext chargeableItemChargeContext = new ChargeableItemChargeContext();
		final ChargeableItemChargeContextData context = source.getContext();
		final com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.StringUniqueIdentifier uniqueIdentifier = chargeableItemData
				.getUid();
		final ChargeableItemUserProperties userProperties = chargeableItemData.getUserProperties();
		final com.cnk.travelogix.custom.chargeable.itemcharging.ChargeableItemUserProperties userPropertiesData = new com.cnk.travelogix.custom.chargeable.itemcharging.ChargeableItemUserProperties();
		for (final ChargeableItemProperty charItemProperty : userProperties.getProperty())
		{
			final com.cnk.travelogix.custom.chargeable.itemcharging.ChargeableItemProperty charItemPrData = new com.cnk.travelogix.custom.chargeable.itemcharging.ChargeableItemProperty();
			charItemPrData.setDateValue(charItemProperty.getDateValue());
			charItemPrData.setName(charItemProperty.getName());
			charItemPrData.setNumberValue(charItemProperty.getNumberValue());
			charItemPrData.setStringValue(charItemProperty.getStringValue());
			userPropertiesData.getProperty().add(charItemPrData);
		}
		uniqId.setType(uniqueIdentifier.getType());
		uniqId.setValue(uniqueIdentifier.getValue());
		chargeableItem.setName(chargeableItemData.getName());
		chargeableItem.setConsumptionDate(chargeableItemData.getConsumptionDate());
		chargeableItem.setServiceId(chargeableItemData.getServiceId());
		chargeableItem.setUid(uniqId);
		chargeableItem.setUserTechnicalId(chargeableItemData.getUserTechnicalId());
		chargeableItem.setUserProperties(userPropertiesData);
		updateContextData(context, chargeableItemChargeContext);
		target.setContext(chargeableItemChargeContext);
		target.setChargeableItem(chargeableItem);
	}

	private void updateContextData(final ChargeableItemChargeContextData source, final ChargeableItemChargeContext target)
	{
		final ChargingOutputContextData chargingOutputContext = source.getChargingOutputContext();
		final ChargingOutputContext outputContext = new ChargingOutputContext();
		outputContext.setChargeableItemExported(chargingOutputContext.isChargeableItemExported());
		final ChargingResultContextData chargingResultContext = source.getChargingResultContext();
		final ChargingResultContext resultContext = new ChargingResultContext();
		final ChargingResultOnErrorContextData chargingResultOnErrorContext = source.getChargingResultOnErrorContext();
		final ChargingResultOnErrorContext errorContext = new ChargingResultOnErrorContext();
		final SenderContextData senderInfo = source.getSenderInfo();
		final SenderContext senderInfoContext = new SenderContext();
		senderInfoContext.setJobId(senderInfo.getJobId());
		errorContext.setNotificationReturned(chargingResultOnErrorContext.isNotificationReturned());
		resultContext.setAccountInfoReturned(chargingResultContext.isAccountInfoReturned());
		resultContext.setAccountOperationReturned(chargingResultContext.isAccountOperationReturned());
		resultContext.setChargeableItemInfoReturned(chargingResultContext.isChargeableItemInfoReturned());
		resultContext.setChargedItemReturned(chargingResultContext.isChargedItemReturned());
		resultContext.setChargingContractInfoReturned(chargingResultContext.isChargingContractInfoReturned());
		resultContext.setChargingProcessInfoReturned(chargingResultContext.isChargingProcessInfoReturned());
		resultContext.setNotificationReturned(chargingResultContext.isNotificationReturned());
		target.setChargingOutputContext(outputContext);
		target.setChargingResultOnErrorContext(errorContext);
		target.setChargingResultContext(resultContext);
		target.setSenderInfo(senderInfoContext);
	}
}
