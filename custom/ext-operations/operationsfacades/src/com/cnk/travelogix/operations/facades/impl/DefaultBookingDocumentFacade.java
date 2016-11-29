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
package com.cnk.travelogix.operations.facades.impl;

import de.hybris.platform.core.model.order.OrderModel;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.BooleanUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.client.config.core.model.DocumentSettingModel;
import com.cnk.travelogix.operations.bookingdocument.data.BookingDocumentData;
import com.cnk.travelogix.operations.facades.BookingDocumentFacade;
import com.cnk.travelogix.operations.services.inter.BookingDocumentService;


/**
 *
 */
public class DefaultBookingDocumentFacade implements BookingDocumentFacade
{

	private static final Logger LOG = Logger.getLogger(DefaultBookingDocumentFacade.class);

	private BookingDocumentService bookingDocumentService;


	/**
	 * @return the bookingDocumentService
	 */
	public BookingDocumentService getBookingDocumentService()
	{
		return bookingDocumentService;
	}


	public void setBookingDocumentService(final BookingDocumentService bookingDocumentService)
	{
		this.bookingDocumentService = bookingDocumentService;
	}


	@Override
	public BookingDocumentData getBookingDocument(final String code)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("Booking Document Code is " + code);
		}

		OrderModel order = null;
		final BookingDocumentData bookingDocumentData = new BookingDocumentData();
		final List<DocumentSettingModel> handOverDocument = new ArrayList<DocumentSettingModel>();
		final List<DocumentSettingModel> customerDocument = new ArrayList<DocumentSettingModel>();
		if (code != null)
		{
			order = bookingDocumentService.getBookingDocumentForCode(code);
			if (order != null)
			{
				for (final DocumentSettingModel documentSettingModel : order.getDocumentSettings())
				{
					if (BooleanUtils.isTrue(documentSettingModel.getHandoverDocument()))
					{
						handOverDocument.add(documentSettingModel);
					}
					else
					{
						customerDocument.add(documentSettingModel);
					}
				}
			}
		}
		else
		{
			throw new IllegalArgumentException("Document with code " + code + "not found");
		}
		return bookingDocumentData;
	}


}
