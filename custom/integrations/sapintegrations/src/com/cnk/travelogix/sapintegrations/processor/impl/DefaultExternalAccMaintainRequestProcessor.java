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

import com.cnk.travelogix.custom.subscribe.account.ExternalAccountMaintainRequest;
import com.cnk.travelogix.custom.subscribe.account.ExternalAccountOperationResponse;
import com.cnk.travelogix.custom.subscribe.account.ObjectFactory;
import com.cnk.travelogix.custom.subscribe.account.ResponseStatus;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.ExternalAccMaintainRequestProcessor;


/**
 *
 */
public class DefaultExternalAccMaintainRequestProcessor
		extends AbstractRequestProcessor<ExternalAccountMaintainRequest, ExternalAccountOperationResponse>
		implements ExternalAccMaintainRequestProcessor
{

	public ObjectFactory getObjectFactory()
	{
		return (ObjectFactory) getDtoObjectFactory();
	}

	@Override
	protected RequestMessage translateRequest(final ExternalAccountMaintainRequest request)
	{
		final RequestMessage requestMessage = new RequestMessage<ExternalAccountMaintainRequest>();
		requestMessage.setRequestObject(getObjectFactory().createExternalAccountMaintainRequest(request));
		requestMessage.setServiceInterface(ExternalAccMaintainRequestProcessor.class);
		requestMessage.setSoapAction(getSoapAction());

		return requestMessage;
	}

	@Override
	protected JAXBElement<ExternalAccountOperationResponse> createErrorResponse()
	{
		final ExternalAccountOperationResponse externalAccountOperationResponse = new ExternalAccountOperationResponse();
		externalAccountOperationResponse.setStatus(ResponseStatus.ERROR);
		externalAccountOperationResponse
				.setMessage(getConfigurationService().getConfiguration().getString(getConnectionErrorMessage()));

		return getObjectFactory().createExternalAccountCancelResponse(externalAccountOperationResponse);
	}


}
