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
package com.cnk.travelogix.sapintegrations.processor.impl;

import javax.xml.bind.JAXBElement;

import com.cnk.travelogix.custom.chargeable.itemcharging.ChargeableItemChargeRequest;
import com.cnk.travelogix.custom.chargeable.itemcharging.ChargeableItemChargeResponse;
import com.cnk.travelogix.custom.chargeable.itemcharging.ObjectFactory;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.ItemChargingProcessor;


/**
 *
 */
public class DefaultItemChargingProcessor
		extends AbstractRequestProcessor<ChargeableItemChargeRequest, ChargeableItemChargeResponse>implements ItemChargingProcessor
{
	public ObjectFactory getObjectFactory()
	{
		return (ObjectFactory) getDtoObjectFactory();
	}

	@Override
	protected RequestMessage translateRequest(final ChargeableItemChargeRequest request)
	{
		final RequestMessage requestMessage = new RequestMessage<ChargeableItemChargeRequest>();
		requestMessage.setRequestObject(getObjectFactory().createChargeableItemChargeRequest(request));
		requestMessage.setServiceInterface(ItemChargingProcessor.class);
		requestMessage.setSoapAction(getSoapAction());

		return requestMessage;
	}

	@Override
	protected JAXBElement<ChargeableItemChargeResponse> createErrorResponse()
	{
		// YTODO Auto-generated method stub
		return null;
	}

}
