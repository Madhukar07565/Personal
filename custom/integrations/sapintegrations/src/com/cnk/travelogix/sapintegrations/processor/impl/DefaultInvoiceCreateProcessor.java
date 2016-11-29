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

import com.cnk.travelogix.custom.zifwsb.invoice.create.ObjectFactory;
import com.cnk.travelogix.custom.zifwsb.invoice.create.ZIffmBillDocCreate;
import com.cnk.travelogix.custom.zifwsb.invoice.create.ZIffmBillDocCreateResponse;
import com.cnk.travelogix.custom.zifwsb.invoice.create.ZifstStatusDoc;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.InvoiceCreateProcessor;


/**
 *
 */
public class DefaultInvoiceCreateProcessor extends AbstractRequestProcessor<ZIffmBillDocCreate, ZIffmBillDocCreateResponse>
		implements InvoiceCreateProcessor
{
	public ObjectFactory getObjectFactory()
	{
		return (ObjectFactory) getDtoObjectFactory();
	}



	@Override
	protected RequestMessage translateRequest(final ZIffmBillDocCreate request)
	{
		final RequestMessage requestMessage = new RequestMessage<ZIffmBillDocCreate>();
		requestMessage.setRequestObject(getObjectFactory().createZIffmInvoice(request));
		requestMessage.setServiceInterface(InvoiceCreateProcessor.class);
		requestMessage.setSoapAction(getSoapAction());

		return requestMessage;
	}

	@Override
	protected JAXBElement<ZIffmBillDocCreateResponse> createErrorResponse()
	{
		final ZIffmBillDocCreateResponse zIffmBillDocCreateResponse = new ZIffmBillDocCreateResponse();
		final ZifstStatusDoc zifstStatusDoc = new ZifstStatusDoc();
		zifstStatusDoc.setStatus(getConfigurationService().getConfiguration().getString(getConnectionErrorStatus()));
		zifstStatusDoc.setMessage(getConfigurationService().getConfiguration().getString(getConnectionErrorMessage()));
		zIffmBillDocCreateResponse.setStatus(zifstStatusDoc);

		return getObjectFactory().createZIffmInvoiceSaveResponse(zIffmBillDocCreateResponse);
	}

}
