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
package com.cnk.travelogix.sapintegrations.message;


import javax.xml.bind.JAXBElement;

import org.apache.poi.hssf.record.formula.functions.T;


/**
 *
 */
public class RequestMessage<RequestType>
{
	private JAXBElement<RequestType> requestObject;
	private Class<T> serviceInterface;
	private String soapAction;

	/**
	 * @return the requestObject
	 */
	public JAXBElement<RequestType> getRequestObject()
	{
		return requestObject;
	}

	/**
	 * @param requestObject
	 *           the requestObject to set
	 */
	public void setRequestObject(final JAXBElement<RequestType> requestObject)
	{
		this.requestObject = requestObject;
	}

	/**
	 * @return the portalInterface
	 */
	public Class<T> getServiceInterface()
	{
		return serviceInterface;
	}

	/**
	 * @param portalInterface
	 *           the portalInterface to set
	 */
	public void setServiceInterface(final Class<T> serviceInterface)
	{
		this.serviceInterface = serviceInterface;
	}

	/**
	 * @return the soapAction
	 */
	public String getSoapAction()
	{
		return soapAction;
	}

	/**
	 * @param soapAction
	 *           the soapAction to set
	 */
	public void setSoapAction(final String soapAction)
	{
		this.soapAction = soapAction;
	}
}
