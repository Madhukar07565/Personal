/**
 *
 */
package com.cnk.travelogix.common.core.order.mock;

import de.hybris.platform.core.enums.OrderStatus;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cnk.travelogix.common.core.enums.ProductTypeEnum;
import com.cnk.travelogix.common.core.model.BookingResponseAttributeModel;
import com.cnk.travelogix.common.core.model.OrderFlightDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderHotelDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderProductInfoModel;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderTicketInfoModel;
import com.cnk.travelogix.common.core.si.services.SIAirService;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntBookingItinerary;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightBookingRequest;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightBookingResponse;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


/**
 * @author i323801
 *
 */
public class BookingServiceImpl implements BookingService
{
	private MockSupplierCheckService supplierCheckService;
	private PaymentCheckService paymentCheckService;
	private ModelService modelService;

	private SIAirService siAirService;
	
	@Override
	public List<BookingResult> bookHotel(final List entries)
	{
		return createBookingResult(entries);
	}

	/**
	 * from UI model to SvcInt request model
	 * 
	 * convert svcint response model to UI models
	 */
	@Override
	public List<BookingResult> bookFlight(final List entries)//entries are OrderFlightDetailInfoModel
	{
//		SvcIntFlightBookingRequest request = new SvcIntFlightBookingRequest();
//		request.setItineraryList(null);
//		SvcIntBookingItinerary i = new SvcIntBookingItinerary();
////		i.setItinerary(null);
////		i.setTravelerList(null);
//		
//		SvcIntFlightBookingResponse response = siAirService.createBooking(request);
//		return convert(response);
		return createBookingResult(entries);
	}

	private List<BookingResult> convert(SvcIntFlightBookingResponse response)
	{
		return createBookingResult(null);
	}
	private <T> List<BookingResult> createBookingResult(final List<T> request)
	{
		final List<BookingResult> results = new ArrayList<BookingResult>();

		for (final T entry : request)
		{
			final BookingResult<T> result = new BookingResult<T>();
			result.setStatus("success");
			result.setEntry(entry);
			results.add(result);
		}
		return results;
	}

	@Override
	public Map book(final Map request)
	{
		final Map<String, List<BookingResult>> results = new HashMap<String, List<BookingResult>>();
		if (request != null)
		{
			final List<OrderHotelDetailInfoModel> hotels = (List<OrderHotelDetailInfoModel>) request.get("hotel");
			final List<OrderFlightDetailInfoModel> flights = (List<OrderFlightDetailInfoModel>) request.get("flight");

			if (!hotels.isEmpty())
			{
				results.put("hotel", bookHotel(hotels));
			}

			if (!flights.isEmpty())
			{
				results.put("flight", bookFlight(flights));
			}
		}
		return results;
	}

	private <T> List<BookingResult> confirm(final List<T> request)
	{
		final List<BookingResult> results = new ArrayList<BookingResult>();

		for (final T entry : request)
		{
			final BookingResult<T> result = new BookingResult<T>();
			result.setStatus("success");
			result.setEntry(entry);
			results.add(result);
		}
		return results;
	}

	@Override
	public Map<String, List<BookingResult>> confirm(final Map request)
	{
		final Map<String, List<BookingResult>> results = new HashMap<String, List<BookingResult>>();
		if (request != null)
		{
			final List<OrderHotelDetailInfoModel> hotels = (List<OrderHotelDetailInfoModel>) request.get("hotel");
			final List<OrderFlightDetailInfoModel> flights = (List<OrderFlightDetailInfoModel>) request.get("flight");

			if (!hotels.isEmpty())
			{
				results.put("hotel", confirm(hotels));
			}

			if (!flights.isEmpty())
			{
				results.put("flight", confirm(flights));
			}
		}
		return results;
	}


	@Override
	public Map prepareBookingRequest(final List entries)
	{
		final Map<String, List> m = new HashMap();

		final List flightList = new ArrayList();
		final List hotelList = new ArrayList();
		m.put("hotel", hotelList);
		m.put("flight", flightList);

		for (final AbstractOrderEntryModel entry : (List<AbstractOrderEntryModel>) entries)
		{
			final ProductTypeEnum prodType = entry.getProductTypeEnum();
			final OrderProductInfoModel prod = entry.getOrderProductInfo();
			//String grpId = prod.getGroupId();
			if (prodType.equals(ProductTypeEnum.ROOM))
			{
				final OrderRoomDetailInfoModel room = (OrderRoomDetailInfoModel) prod;
				final OrderHotelDetailInfoModel hotel = room.getOrderHotelDetailInfo();
				if (!hotelList.contains(hotel))
				{
					hotelList.add(hotel);
				}
			}
			else if (prodType.equals(ProductTypeEnum.TICKET))
			{
				final OrderTicketInfoModel ticket = (OrderTicketInfoModel) prod;
				final OrderFlightDetailInfoModel flight = ticket.getOrderFlightDetailInfo();
				if (!flightList.contains(flight))
				{
					flightList.add(flight);
				}
			}
		}

		return m;
	}

	/**
	 * @param order
	 *           entry list
	 * @return Map<String, List<Object>: key :"hotel"/"flight"/"todos"
	 *
	 */

	@Override
	public Map<String, List<AbstractOrderEntryModel>> filterBookingEntries(final List entries)
	{

		final Map<String, List<AbstractOrderEntryModel>> map = new HashMap<String, List<AbstractOrderEntryModel>>();
		final List<AbstractOrderEntryModel> toCreateTodoEntries = new ArrayList<AbstractOrderEntryModel>();
		final List<AbstractOrderEntryModel> eligibleBookingEntries = new ArrayList<AbstractOrderEntryModel>();

		for (final AbstractOrderEntryModel entry : (List<AbstractOrderEntryModel>) entries)
		{
			final OrderProductInfoModel prod = entry.getOrderProductInfo();
			final SupplierModel supplier = prod.getEnablerSupplier();

			final String type = supplierCheckService.checkSupplier(supplier);
			if ("ONLINE".equals(type))
			{
				if (paymentCheckService.eligibleBooking(entry))
				{
					eligibleBookingEntries.add(entry);
				}
				else
				{
					toCreateTodoEntries.add(entry);
				}
			}
			else if ("OFFLINE".equals(type))
			{
				toCreateTodoEntries.add(entry);
			}
		}

		map.put("eligibleBookingEntries", eligibleBookingEntries);
		map.put("toCreateTodoEntries", toCreateTodoEntries);
		return map;
	}


	@Override
	public List getEligibleBookingEntries(final List entries)
	{
		final List<AbstractOrderEntryModel> eligibleBookingEntries = new ArrayList<AbstractOrderEntryModel>();

		for (final AbstractOrderEntryModel entry : (List<AbstractOrderEntryModel>) entries)
		{
			final OrderProductInfoModel prod = entry.getOrderProductInfo();
			final SupplierModel supplier = prod.getEnablerSupplier();

			final String type = supplierCheckService.checkSupplier(supplier);
			if ("ONLINE".equals(type))
			{
				if (paymentCheckService.eligibleBooking(entry))
				{
					eligibleBookingEntries.add(entry);
				}
			}
		}

		return eligibleBookingEntries;
	}

	/**
	 * filter confirm result, return success hotel/flight list and to create todo task list.
	 */
	@Override
	public Map handleConfirmResult(final Map confirmResults)
	{
		final Map<String, List> m = new HashMap();

		final List<BookingResult> hotelResults = (List<BookingResult>) confirmResults.get("hotel");
		final List<BookingResult> flightResults = (List<BookingResult>) confirmResults.get("flight");

		m.put("hotel", parseConfirmResults(hotelResults));
		m.put("flight", parseConfirmResults(flightResults));

		return m;
	}

	private List parseConfirmResults(final List<BookingResult> hotelResults)
	{
		final List list = new ArrayList();
		if (hotelResults != null && !hotelResults.isEmpty())
		{
			for (final BookingResult result : hotelResults)
			{
				final Object entry = result.getEntry();
				if ("success".equals(result.getStatus()))
				{
					//TODO
					updateStatus(entry);
					list.add(entry);
				}
				else
				{
					//TODO set booking attribute as confirmed failed for todo task
					updateBookingAttributes(entry);
				}
			}
		}
		return list;
	}

	/**
	 * Booking failure
	 * 
	 * @param t
	 */
	private <T> void addBookingAttribute(final T t)
	{
		final BookingResponseAttributeModel attribute = modelService.create(BookingResponseAttributeModel.class);
		attribute.setCode("BF");
		attribute.setName("Booking failure");
		if (t instanceof OrderFlightDetailInfoModel)
		{
			final OrderFlightDetailInfoModel flight = (OrderFlightDetailInfoModel) t;
			List<BookingResponseAttributeModel> list = flight.getBookingResponseAttributes();
			if (list == null)
			{
				list = new ArrayList<BookingResponseAttributeModel>();
				flight.setBookingResponseAttributes(list);
			}

			list.add(attribute);
		}
		else if (t instanceof OrderRoomDetailInfoModel)
		{
			final OrderRoomDetailInfoModel room = (OrderRoomDetailInfoModel) t;
			List<BookingResponseAttributeModel> list = room.getBookingResponseAttributes();
			if (list == null)
			{
				list = new ArrayList<BookingResponseAttributeModel>();
				room.setBookingResponseAttributes(list);
			}
			list.add(attribute);
		}
		//modelService.save(t);
	}

	private void updateBookingAttributes(final Object entry)
	{
		if (entry instanceof OrderFlightDetailInfoModel)
		{
			final OrderFlightDetailInfoModel flight = (OrderFlightDetailInfoModel) entry;
			flight.setOrderStatus(OrderStatus.ON_REQUEST);
			addBookingAttribute(flight);
			modelService.save(flight);
		}
		else if (entry instanceof OrderHotelDetailInfoModel)
		{
			final OrderHotelDetailInfoModel hotel = (OrderHotelDetailInfoModel) entry;
			final List<OrderRoomDetailInfoModel> rooms = hotel.getOrderRoomDetailInfo();
			if (rooms != null && !rooms.isEmpty())
			{
				for (final OrderRoomDetailInfoModel room : rooms)
				{
					room.setOrderStatus(OrderStatus.ON_REQUEST);
					addBookingAttribute(room);
				}
				modelService.saveAll(rooms);
			}
		}
	}

	private void updateStatus(final Object entry)
	{
		if (entry instanceof OrderFlightDetailInfoModel)
		{
			final OrderFlightDetailInfoModel flight = (OrderFlightDetailInfoModel) entry;
			flight.setOrderStatus(OrderStatus.CONFIRMED);
			modelService.save(flight);
		}
		else if (entry instanceof OrderHotelDetailInfoModel)
		{
			final OrderHotelDetailInfoModel hotel = (OrderHotelDetailInfoModel) entry;
			hotel.setOrderStatus(OrderStatus.CONFIRMED);
			modelService.save(hotel);
			final List<OrderRoomDetailInfoModel> rooms = hotel.getOrderRoomDetailInfo();
			if (rooms != null && !rooms.isEmpty())
			{
				for (final OrderRoomDetailInfoModel room : rooms)
				{
					room.setOrderStatus(OrderStatus.CONFIRMED);
				}
				modelService.saveAll(rooms);
			}
		}
	}

	@Override
	public Map handleBookingResult(final Map bookingResults)
	{
		//TODO SI should seperate logic, use same code handle mock result.
		return handleConfirmResult(bookingResults);
	}

	/**
	 * @return the supplierCheckService
	 */
	public MockSupplierCheckService getSupplierCheckService()
	{
		return supplierCheckService;
	}

	/**
	 * @param supplierCheckService
	 *           the supplierCheckService to set
	 */
	public void setSupplierCheckService(final MockSupplierCheckService supplierCheckService)
	{
		this.supplierCheckService = supplierCheckService;
	}

	/**
	 * @return the paymentCheckService
	 */
	public PaymentCheckService getPaymentCheckService()
	{
		return paymentCheckService;
	}

	/**
	 * @param paymentCheckService
	 *           the paymentCheckService to set
	 */
	public void setPaymentCheckService(final PaymentCheckService paymentCheckService)
	{
		this.paymentCheckService = paymentCheckService;
	}

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	/**
	 * @return the siAirService
	 */
	public SIAirService getSiAirService()
	{
		return siAirService;
	}

	/**
	 * @param siAirService the siAirService to set
	 */
	public void setSiAirService(SIAirService siAirService)
	{
		this.siAirService = siAirService;
	}




}
