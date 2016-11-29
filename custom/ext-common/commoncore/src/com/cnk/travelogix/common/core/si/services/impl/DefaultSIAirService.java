/**
 *
 */
package com.cnk.travelogix.common.core.si.services.impl;

import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightBookingRequest;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightBookingResponse;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightGetAvailabilityAndFareRequest;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightGetAvailabilityAndFareResponse;
import com.cnk.travelogix.common.core.si.services.SIAirService;
import com.cnk.travelogix.suppliers.air.data.AirBookRQ;
import com.cnk.travelogix.suppliers.air.data.AirBookRequest;
import com.cnk.travelogix.suppliers.air.data.AirBookRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirBookResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchRequest;
import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchResponseWrapper;
import com.cnk.travelogix.suppliers.air.service.SupplierAirService;
import de.hybris.platform.servicelayer.dto.converter.Converter;


/**
 * @author i318043
 *
 */
public class DefaultSIAirService implements SIAirService
{

	private SupplierAirService supplierAirService;

	private Converter<SvcIntFlightGetAvailabilityAndFareRequest, AirLowFareSearchRequest> searchRequestConverter;
	private Converter<AirLowFareSearchResponseWrapper, SvcIntFlightGetAvailabilityAndFareResponse> searchResponseConverter;

	public void setSupplierAirService(SupplierAirService supplierAirService) {
		this.supplierAirService = supplierAirService;
	}

	public void setSearchRequestConverter(Converter<SvcIntFlightGetAvailabilityAndFareRequest, AirLowFareSearchRequest> searchRequestConverter) {
		this.searchRequestConverter = searchRequestConverter;
	}

	public void setSearchResponseConverter(Converter<AirLowFareSearchResponseWrapper, SvcIntFlightGetAvailabilityAndFareResponse> searchResponseConverter) {
		this.searchResponseConverter = searchResponseConverter;
	}

	@Override
	public SvcIntFlightGetAvailabilityAndFareResponse search(SvcIntFlightGetAvailabilityAndFareRequest request) {
		SvcIntFlightGetAvailabilityAndFareRequest sourceRequest = request;
		AirLowFareSearchRequest targetRequest = new AirLowFareSearchRequest();
		targetRequest = searchRequestConverter.convert(sourceRequest, targetRequest);

		AirLowFareSearchResponseWrapper sourceResponse = supplierAirService.otaAirLowFareSearchSync(targetRequest);
		SvcIntFlightGetAvailabilityAndFareResponse targetResponse = new SvcIntFlightGetAvailabilityAndFareResponse();
		targetResponse = searchResponseConverter.convert(sourceResponse, targetResponse);

		return targetResponse;
	}

	@Override
	public Object getAncillaryList() {
		return null;
	}

	@Override
	public Object getAvailabilityAndPrice() {
		return null;
	}

	@Override
	public Object reserveInventory() {
		return null;
	}

	/**
	 * from SvcInt request model to int request model
	 * 
	 * convert int response to svcint response model
	 */
	@Override
	public SvcIntFlightBookingResponse createBooking(SvcIntFlightBookingRequest request)
	{
		//TODO  wrapper containes request list(initeray and travller info)
		final AirBookRequestWrapper requestWrapper = new AirBookRequestWrapper();
		requestWrapper.setAirBookRequests(null);
		AirBookRequest reuest1 = new AirBookRequest();
		reuest1.setAirBookRQ(null);
		AirBookRQ airBookRQ = new AirBookRQ();
		
		request.getItineraryList().get(0).getItinerary();
		request.getItineraryList().get(0).getTravelerList();
		airBookRQ.setAirItinerary(null);//one itineray and traveler list.
		airBookRQ.setTravelerInfo(null);
		AirBookResponseWrapper responseWrapper = supplierAirService.otaAirBook(requestWrapper);
		return convert(responseWrapper);
	}

	private SvcIntFlightBookingResponse convert(AirBookResponseWrapper responseWrapper){
		return null;
	}

	@Override
	public Object getCancellationPolicyList() {
		return null;
	}

	@Override
	public Object cancelBooking() {
		return null;
	}
}
