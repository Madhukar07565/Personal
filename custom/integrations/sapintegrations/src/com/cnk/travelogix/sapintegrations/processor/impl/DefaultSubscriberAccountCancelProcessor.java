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

import com.cnk.travelogix.custom.subscribe.account.ObjectFactory;
import com.cnk.travelogix.custom.subscribe.account.ResponseStatus;
import com.cnk.travelogix.custom.subscribe.account.SubscriberAccountCancelRequest;
import com.cnk.travelogix.custom.subscribe.account.SubscriberAccountOperationResponse;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.SubscriberAccountCancelProcessor;


/**
 *
 */
public class DefaultSubscriberAccountCancelProcessor
		extends AbstractRequestProcessor<SubscriberAccountCancelRequest, SubscriberAccountOperationResponse>
		implements SubscriberAccountCancelProcessor
{
	public ObjectFactory getObjectFactory()
	{
		return (ObjectFactory) getDtoObjectFactory();
	}

	@Override
	protected RequestMessage translateRequest(final SubscriberAccountCancelRequest request)
	{
		final RequestMessage requestMessage = new RequestMessage<SubscriberAccountCancelRequest>();
		requestMessage.setRequestObject(getObjectFactory().createSubscriberAccountCancelRequest(request));
		requestMessage.setServiceInterface(SubscriberAccountCancelProcessor.class);
		requestMessage.setSoapAction(getSoapAction());

		return requestMessage;
	}

	@Override
	protected JAXBElement<SubscriberAccountOperationResponse> createErrorResponse()
	{
		final SubscriberAccountOperationResponse subscriberAccountOperationResponse = new SubscriberAccountOperationResponse();
		subscriberAccountOperationResponse.setStatus(ResponseStatus.ERROR);
		subscriberAccountOperationResponse
				.setMessage(getConfigurationService().getConfiguration().getString(getConnectionErrorMessage()));

		return getObjectFactory().createSubscriberAccountCancelResponse(subscriberAccountOperationResponse);
	}

}
