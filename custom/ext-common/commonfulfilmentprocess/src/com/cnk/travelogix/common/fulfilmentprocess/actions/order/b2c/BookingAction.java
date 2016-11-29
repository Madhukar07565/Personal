/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.cnk.travelogix.common.fulfilmentprocess.actions.order.b2c;

import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.processengine.action.AbstractProceduralAction;
import de.hybris.platform.task.RetryLaterException;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.model.BookingBusinessProcessModel;
import com.cnk.travelogix.common.core.order.mock.BookingResult;
import com.cnk.travelogix.common.core.order.mock.BookingService;


/**
 * check the supplier is online or offline check payment confirm booking
 * 
 * @param <T>
 */
public class BookingAction<T> extends AbstractProceduralAction<OrderProcessModel>
{
	private static final Logger LOG = Logger.getLogger(BookingAction.class);

	private BusinessProcessService businessProcessService;
	private BookingService bookingService;

	/**
	 * operation alway on hotel and flight level List<OrderHotelDetailInfoModel> List<OrderFlightDetailInfoModel>
	 */
	@Override
	public void executeAction(OrderProcessModel process) throws RetryLaterException, Exception
	{
		final OrderModel order = process.getOrder();
		List<AbstractOrderEntryModel> entries = order.getEntries();

		List<AbstractOrderEntryModel> eligibleBookingEntries = bookingService.getEligibleBookingEntries(entries);

		if (!eligibleBookingEntries.isEmpty())
		{
			//startSubProcess(process, eligibleBookingEntries);
			Map confirmRequest = bookingService.prepareBookingRequest(eligibleBookingEntries);
			Map<String, List<BookingResult>> confirmResults = bookingService.confirm(confirmRequest);

			Map bookingRequest = bookingService.handleConfirmResult(confirmResults);
			// do booking
			if (!bookingRequest.isEmpty())
			{
				Map bookingResult = bookingService.book(bookingRequest);
				// add failed items to todolist.
				bookingService.handleBookingResult(bookingResult);
				//TODO start email and other process.
				//startSubProcess(process, bookingResult);
			}
		}
	}

	private void startSubProcess(final OrderProcessModel process, final List<AbstractOrderEntryModel> entries)
	{
		final BookingBusinessProcessModel subProcess = getBusinessProcessService().<BookingBusinessProcessModel> createProcess(

				process.getCode() + "_1", "b2c-online-process");

		subProcess.setParentProcess(process);
		subProcess.setOrderEntries(entries);
		save(subProcess);

		getBusinessProcessService().startProcess(subProcess);

	}

	/**
	 * @return the businessProcessService
	 */
	public BusinessProcessService getBusinessProcessService()
	{
		return businessProcessService;
	}

	/**
	 * @param businessProcessService
	 *           the businessProcessService to set
	 */
	public void setBusinessProcessService(BusinessProcessService businessProcessService)
	{
		this.businessProcessService = businessProcessService;
	}

	@Override
	public Set<String> getTransitions()
	{
		return Transition.getStringValues();
	}

	/**
	 * @return the bookingService
	 */
	public BookingService getBookingService()
	{
		return bookingService;
	}

	/**
	 * @param bookingService
	 *           the bookingService to set
	 */
	public void setBookingService(BookingService bookingService)
	{
		this.bookingService = bookingService;
	}

}
