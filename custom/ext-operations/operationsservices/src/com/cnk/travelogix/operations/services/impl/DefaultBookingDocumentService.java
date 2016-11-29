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
package com.cnk.travelogix.operations.services.impl;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.operations.services.daos.BookingDocumentDAO;
import com.cnk.travelogix.operations.services.inter.BookingDocumentService;


/**
 *
 */
public class DefaultBookingDocumentService implements BookingDocumentService
{

	private static final Logger LOG = Logger.getLogger(DefaultBookingDocumentService.class);

	private BookingDocumentDAO bookingDocumentDAO;


	/**
	 * @return the bookingDocumentDAO
	 */
	public BookingDocumentDAO getBookingDocumentDAO()
	{
		return bookingDocumentDAO;
	}

	@Override
	public OrderModel getBookingDocumentForCode(final String code) throws AmbiguousIdentifierException, UnknownIdentifierException
	{

		if (LOG.isDebugEnabled())
		{
			LOG.debug(" Gets all the documents for the given code ");
		}
		final List<OrderModel> result = bookingDocumentDAO.findBookingDocumentsByCode(code);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Document with code '" + code + "' not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException(
					"Document code '" + code + "' is not unique, " + result.size() + " documents found!");
		}

		return result.get(0);
	}

	@Required
	public void setBookingDocumentDAO(final BookingDocumentDAO bookingDocumentDAO)
	{
		this.bookingDocumentDAO = bookingDocumentDAO;
	}


}
