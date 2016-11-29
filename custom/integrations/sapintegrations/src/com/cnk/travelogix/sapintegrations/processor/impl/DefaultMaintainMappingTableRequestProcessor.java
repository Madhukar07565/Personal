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

import com.cnk.travelogix.custom.mappingtable.maintain.MaintainMappingTableRequest;
import com.cnk.travelogix.custom.mappingtable.maintain.MappingTableOperationResponse;
import com.cnk.travelogix.custom.mappingtable.maintain.ObjectFactory;
import com.cnk.travelogix.custom.mappingtable.maintain.ResponseStatus;
import com.cnk.travelogix.sapintegrations.message.RequestMessage;
import com.cnk.travelogix.sapintegrations.processor.MaintainMappingTableRequestProcessor;


/**
 *
 */
public class DefaultMaintainMappingTableRequestProcessor
		extends AbstractRequestProcessor<MaintainMappingTableRequest, MappingTableOperationResponse>
		implements MaintainMappingTableRequestProcessor
{

	public ObjectFactory getObjectFactory()
	{
		return (ObjectFactory) getDtoObjectFactory();
	}

	@Override
	protected RequestMessage translateRequest(final MaintainMappingTableRequest request)
	{

		final RequestMessage requestMessage = new RequestMessage<MaintainMappingTableRequest>();
		requestMessage.setRequestObject(getObjectFactory().createMappingTableMaintainRequest(request));
		requestMessage.setServiceInterface(MaintainMappingTableRequestProcessor.class);
		requestMessage.setSoapAction(getSoapAction());

		return requestMessage;
	}

	@Override
	protected JAXBElement<MappingTableOperationResponse> createErrorResponse()
	{
		final MappingTableOperationResponse mappingTableOperationResponse = new MappingTableOperationResponse();
		mappingTableOperationResponse.setStatus(ResponseStatus.ERROR);
		mappingTableOperationResponse
				.setMessage(getConfigurationService().getConfiguration().getString(getConnectionErrorMessage()));

		return getObjectFactory().createMappingTableCancelResponse(mappingTableOperationResponse);
	}

}
