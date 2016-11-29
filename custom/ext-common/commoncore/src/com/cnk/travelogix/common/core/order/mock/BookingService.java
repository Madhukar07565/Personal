/**
 * 
 */
package com.cnk.travelogix.common.core.order.mock;

import de.hybris.platform.core.model.order.AbstractOrderEntryModel;

import java.util.List;
import java.util.Map;


/**
 * @author i323801
 * @param <T>
 *
 */
public interface BookingService<T extends BookingResult>
{
	List<T> bookHotel(List<AbstractOrderEntryModel> entries);

	List<T> bookFlight(List<AbstractOrderEntryModel> entries);

	Map<String, List<BookingResult>> book(Map request);

	
	Map<String, List<BookingResult>> confirm(Map request);

	 
	Map prepareBookingRequest(List<AbstractOrderEntryModel> entries);


	<S> Map<String,List<S>> filterBookingEntries(List<S> entries);
	<S>  List<S> getEligibleBookingEntries(List<S> entries);
	
	
	<S> Map<String,List<S>> handleConfirmResult(Map<String, List<BookingResult>> confirmResults);
	
	<S> Map<String,List<S>> handleBookingResult(Map<String, List<BookingResult>> bookingResults);
}
