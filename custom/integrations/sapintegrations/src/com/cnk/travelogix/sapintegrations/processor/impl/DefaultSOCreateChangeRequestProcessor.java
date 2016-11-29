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

import com.cnk.travelogix.custom.so.createchange.ObjectFactory;
import com.cnk.travelogix.custom.so.createchange.ZifTerpSalesOrder;
import com.cnk.travelogix.custom.so.createchange.ZifTerpSalesOrderResponse;
import com.cnk.travelogix.custom.so.createchange.ZifTerpSoStatus;
import com.cnk.travelogix.custom.so.createchange.ZttTerpSoStatus;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.SOCreateChangeRequestProcessor;


/**
 *
 */
public class DefaultSOCreateChangeRequestProcessor extends AbstractRequestProcessor<ZifTerpSalesOrder, ZifTerpSalesOrderResponse>
		implements SOCreateChangeRequestProcessor
{
	public ObjectFactory getObjectFactory()
	{
		return (ObjectFactory) getDtoObjectFactory();
	}

	@Override
	protected RequestMessage translateRequest(final ZifTerpSalesOrder request)
	{
		final RequestMessage requestMessage = new RequestMessage<ZifTerpSalesOrder>();
		requestMessage.setRequestObject(getObjectFactory().createZifTerpSalesOrder(request));
		requestMessage.setServiceInterface(SOCreateChangeRequestProcessor.class);
		requestMessage.setSoapAction(getSoapAction());

		return requestMessage;
	}

	@Override
	protected JAXBElement<ZifTerpSalesOrderResponse> createErrorResponse()
	{
		final ZifTerpSalesOrderResponse zifTerpSalesOrderResponse = new ZifTerpSalesOrderResponse();
		final ZttTerpSoStatus zttTerpSoStatus = new ZttTerpSoStatus();
		final ZifTerpSoStatus zifTerpSoStatus = new ZifTerpSoStatus();
		zifTerpSoStatus.setStatus(getConfigurationService().getConfiguration().getString(getConnectionErrorStatus()));
		zifTerpSoStatus.setMessage(getConfigurationService().getConfiguration().getString(getConnectionErrorMessage()));
		zttTerpSoStatus.getItem().add(zifTerpSoStatus);
		zifTerpSalesOrderResponse.setStatus(zttTerpSoStatus);

		return getObjectFactory().createZifTerpSalesOrderResponse(zifTerpSalesOrderResponse);
	}

}
