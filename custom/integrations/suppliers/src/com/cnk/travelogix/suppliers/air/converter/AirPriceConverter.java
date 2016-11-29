/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.AirItineraryType;
import org.opentravel.ota._2003._05.AirItineraryType.OriginDestinationOptions;
import org.opentravel.ota._2003._05.AirTripType;
import org.opentravel.ota._2003._05.OTAAirPriceRQ;
import org.opentravel.ota._2003._05.OTAAirPriceRQ.TravelerInfoSummary;
import org.opentravel.ota._2003._05.OTAAirPriceRS;
import org.opentravel.ota._2003._05.POSType;
import org.opentravel.ota._2003._05.PricedItinerariesType;
import org.opentravel.ota._2003._05.PricedItinerariesType.PricedItinerary;
import org.opentravel.ota._2003._05.SourceType;
import org.opentravel.ota._2003._05.SuccessType;
import org.opentravel.ota._2003._05.TPAExtensionsType;
import org.opentravel.ota._2003._05.TravelerInfoSummaryType.PriceRequestInformation;
import org.opentravel.ota._2003._05.TravelerInformationType;
import org.opentravel.ota._2003._05.UniqueIDType;

import com.cnk.travelogix.suppliers.air.data.AirItinerary;
import com.cnk.travelogix.suppliers.air.data.AirPriceRS;
import com.cnk.travelogix.suppliers.air.data.AirPriceRequest;
import com.cnk.travelogix.suppliers.air.data.AirPriceRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirPriceResponse;
import com.cnk.travelogix.suppliers.air.data.AirPriceResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.BookingReferenceID;
import com.cnk.travelogix.suppliers.air.data.TravelerInformation;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
import com.coxandkings.integ.suppl.air.OTAAirPriceRQWrapper;
import com.coxandkings.integ.suppl.air.OTAAirPriceRSWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * @author I077988
 *
 */
public class AirPriceConverter extends AirBaseConverter {

    /**
     * @param requestWrapper
     * @return AirInterfaceRQ
     */
    public AirInterfaceRQ toOTAAirPriceRQ(final AirPriceRequestWrapper requestWrapper) {
	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAAirPriceRQWrapper otaAirPriceRQWrapper;
	final List<AirPriceRequest> airAirPriceRequestsData = requestWrapper.getAirAirPriceRequests();
	for (AirPriceRequest airPriceRequestData : airAirPriceRequestsData) {
	    otaAirPriceRQWrapper = new OTAAirPriceRQWrapper();

	    final SupplierIDType supplierIDType = populateSupplierId(airPriceRequestData.getSupplierID());
	    otaAirPriceRQWrapper.setSupplierID(supplierIDType);
	    otaAirPriceRQWrapper.setSequence(airPriceRequestData.getSequence());

	    final OTAAirPriceRQ otaAirPriceRQ = new OTAAirPriceRQ();
	    otaAirPriceRQ.setVersion(airPriceRequestData.getAirPriceRQ().getVersion());
	    otaAirPriceRQ.setTarget(airPriceRequestData.getAirPriceRQ().getTarget());

	    final POSType pos = new POSType();
	    final SourceType sourceType = new SourceType();
	    pos.getSource().add(sourceType);
	    otaAirPriceRQ.setPOS(pos);

	    final AirItineraryType airItineraryType = new AirItineraryType();
	    final AirItinerary airItineraryData = airPriceRequestData.getAirPriceRQ().getAirItinerary();
	    final List<com.cnk.travelogix.suppliers.air.data.OriginDestinationOption> originDestOptionsData = airItineraryData.getOriginDestinationOptions();
	    final OriginDestinationOptions originDestOptions = populateOriginDestinationOption(originDestOptionsData);
	    airItineraryType.setOriginDestinationOptions(originDestOptions);
	    if (airItineraryData.getDirectionInd() != null) {
		airItineraryType.setDirectionInd(AirTripType.fromValue(airItineraryData.getDirectionInd()));
	    }
	    otaAirPriceRQ.setAirItinerary(airItineraryType);

	    TravelerInformationType travelerInformation;
	    final TravelerInfoSummary travelerInfoSummary = new TravelerInfoSummary();
	    final com.cnk.travelogix.suppliers.air.data.TravelerInfoSummary travelerInfoSummaryData = airPriceRequestData.getAirPriceRQ().getTravelerInfoSummary();
	    if (travelerInfoSummaryData.getAirTraveler() != null) {
		for (TravelerInformation travelerInformationData : travelerInfoSummaryData.getAirTraveler()) {
		    travelerInformation = new TravelerInformationType();
		    travelerInformation.getPassengerTypeQuantity().addAll(populatePassengerTypeQuantity(travelerInformationData.getPassengerTypeQuantity()));
		    travelerInfoSummary.getAirTravelerAvail().add(travelerInformation);
		}
	    }

	    final PriceRequestInformation priceRequestInformation = new PriceRequestInformation();
	    final com.cnk.travelogix.suppliers.air.data.PriceRequestInformation priceReqInfoData = travelerInfoSummaryData.getPriceRequestInformation();
	    if (priceReqInfoData != null)
		priceRequestInformation.setCurrencyCode(priceReqInfoData.getCurrencyCode());

	    travelerInfoSummary.setPriceRequestInformation(priceRequestInformation);

	    final TPAExtensions tpaExtensionsData = travelerInfoSummaryData.getTpaExtensions();
	    if (tpaExtensionsData != null) {
		final TPAExtensionsType tpaExtensionsType = getTPAExtensionsType(tpaExtensionsData, NAMESPACE_AIR);
		travelerInfoSummary.setTPAExtensions(tpaExtensionsType);
	    }

	    otaAirPriceRQ.setTravelerInfoSummary(travelerInfoSummary);
	    otaAirPriceRQWrapper.setOTAAirPriceRQ(otaAirPriceRQ);
	    requestBody.getOTAAirPriceRQWrapper().add(otaAirPriceRQWrapper);
	}
	airInterfaceRQ.setRequestBody(requestBody);
	airInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapper.getRequestHeader()));
	return airInterfaceRQ;
    }

    /**
     * @param airInterfaceRS
     * @return AirPriceResponseWrapper
     */
    public AirPriceResponseWrapper fromOTAAirPriceRS(final AirInterfaceRS airInterfaceRS) {

	final AirPriceResponseWrapper airPriceResponseWrapper = new AirPriceResponseWrapper();
	AirPriceResponse airPriceResponseData;
	final List<AirPriceResponse> airPriceResponsesData = new ArrayList<>();
	final List<OTAAirPriceRSWrapper> otaAirPriceRSWrapperList = airInterfaceRS.getResponseBody().getOTAAirPriceRSWrapper();
	if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAAirPriceRSWrapper otaAirPriceRSWrapper : otaAirPriceRSWrapperList) {
		airPriceResponseData = new AirPriceResponse();
		airPriceResponseData.setSequence(otaAirPriceRSWrapper.getSequence());
		airPriceResponseData.setSupplierID(populateGetSupplierId(otaAirPriceRSWrapper.getSupplierID()));
		final AirPriceRS airPriceRSData = new AirPriceRS();
		final OTAAirPriceRS otaAirPriceRS = otaAirPriceRSWrapper.getOTAAirPriceRS();
		String supplierId = otaAirPriceRSWrapper.getSupplierID().getValue();
		if (!hasError(otaAirPriceRSWrapper.getErrorList())) {
		    airPriceRSData.setTarget(otaAirPriceRS.getTarget());
		    final List<Object> successAndWarningsAndPricedItineraries = otaAirPriceRS.getSuccessAndWarningsAndPricedItineraries();
		    for (Object object : successAndWarningsAndPricedItineraries) {
			if (object instanceof SuccessType) {
			    airPriceRSData.setSuccess(Boolean.TRUE);
			}
			if (object instanceof UniqueIDType) {
			    final UniqueIDType uniqueIDType = (UniqueIDType) object;
			    final BookingReferenceID bookingReferenceIDData = new BookingReferenceID();
			    bookingReferenceIDData.setId(uniqueIDType.getID());
			    bookingReferenceIDData.setType(uniqueIDType.getType());
			    airPriceRSData.setBookingReferenceID(bookingReferenceIDData);
			}
			if (object instanceof PricedItinerariesType) {
			    final PricedItinerariesType pricedItinerariesType = (PricedItinerariesType) object;
			    final List<PricedItinerary> pricedItineraries = pricedItinerariesType.getPricedItinerary();
			    final List<com.cnk.travelogix.suppliers.air.data.PricedItinerary> pricedItinerariesData = getPricedItineraryData(pricedItineraries);
			    airPriceRSData.setPricedItineraries(pricedItinerariesData);
			}
		    }
		    airPriceRSData.setErrors(getErrorsData(otaAirPriceRS.getErrors(), supplierId));
		    airPriceResponseData.setAirPriceRS(airPriceRSData);
		}
		airPriceResponseData.setErrors(getErrorsListData(otaAirPriceRSWrapper.getErrorList(), supplierId));
		airPriceResponsesData.add(airPriceResponseData);
	    }
	}
	airPriceResponseWrapper.setAirPriceResponses(airPriceResponsesData);
	airPriceResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));
	airPriceResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));

	return airPriceResponseWrapper;
    }
}
