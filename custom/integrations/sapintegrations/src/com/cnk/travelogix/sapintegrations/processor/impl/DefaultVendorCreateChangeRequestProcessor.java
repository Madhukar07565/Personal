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

import com.cnk.travelogix.custom.ziffm.vendor.createchange.ObjectFactory;
import com.cnk.travelogix.custom.ziffm.vendor.createchange.ZVendorCreateChangeService;
import com.cnk.travelogix.custom.ziffm.vendor.createchange.ZVendorCreateChangeServiceResponse;
import com.cnk.travelogix.custom.ziffm.vendor.createchange.ZifstStatusDoc;
import com.cnk.travelogix.custom.ziffm.vendor.createchange.ZifttStatusDoc;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.VendorCreateChangeRequestProcessor;


/**
 *
 */
public class DefaultVendorCreateChangeRequestProcessor
		extends AbstractRequestProcessor<ZVendorCreateChangeService, ZVendorCreateChangeServiceResponse>
		implements VendorCreateChangeRequestProcessor
{
	public ObjectFactory getObjectFactory()
	{
		return (ObjectFactory) getDtoObjectFactory();
	}

	@Override
	protected RequestMessage translateRequest(final ZVendorCreateChangeService request)
	{
		final RequestMessage requestMessage = new RequestMessage<ZVendorCreateChangeService>();
		requestMessage.setRequestObject(getObjectFactory().createZVendorCreateChangeService(request));
		requestMessage.setServiceInterface(VendorCreateChangeRequestProcessor.class);
		requestMessage.setSoapAction(getSoapAction());

		return requestMessage;
	}

	@Override
	protected JAXBElement<ZVendorCreateChangeServiceResponse> createErrorResponse()
	{
		final ZVendorCreateChangeServiceResponse zVendorCreateChangeServiceResponse = new ZVendorCreateChangeServiceResponse();
		final ZifttStatusDoc ZifttStatusDoc = new ZifttStatusDoc();
		final ZifstStatusDoc zifstStatusDoc = new ZifstStatusDoc();
		zifstStatusDoc.setStatus(getConfigurationService().getConfiguration().getString(getConnectionErrorStatus()));
		zifstStatusDoc.setMessage(getConfigurationService().getConfiguration().getString(getConnectionErrorMessage()));
		ZifttStatusDoc.getItem().add(zifstStatusDoc);
		zVendorCreateChangeServiceResponse.setEtStatus(ZifttStatusDoc);

		return getObjectFactory().createZVendorCreateChangeServiceResponse(zVendorCreateChangeServiceResponse);
	}
}
