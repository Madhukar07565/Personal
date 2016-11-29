/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.AirItineraryType.OriginDestinationOptions.OriginDestinationOption;
import org.opentravel.ota._2003._05.OTAAirBookRS;
import org.opentravel.ota._2003._05.OTAReadRQ;
import org.opentravel.ota._2003._05.OriginDestinationOptionType.FlightSegment;
import org.opentravel.ota._2003._05.POSType;
import org.opentravel.ota._2003._05.SourceType;
import org.opentravel.ota._2003._05.SuccessType;
import org.opentravel.ota._2003._05.TPAExtensionsType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cnk.travelogix.suppliers.air.data.AirBookRS;
import com.cnk.travelogix.suppliers.air.data.AirBookResponse;
import com.cnk.travelogix.suppliers.air.data.AirBookResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirItinerary;
import com.cnk.travelogix.suppliers.air.data.AirReadReq;
import com.cnk.travelogix.suppliers.air.data.AirReadRequest;
import com.cnk.travelogix.suppliers.air.data.AirReadRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirReservation;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
import com.coxandkings.integ.suppl.air.OTAAirBookRSWrapper;
import com.coxandkings.integ.suppl.air.OTAReadRQWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * @author I077988
 */
public class AirListBookingsConverter extends AirBaseConverter {

    private static final Logger LOG = LoggerFactory.getLogger(AirListBookingsConverter.class);

    /**
     * @param request
     *            AirReadRequest
     * @return AirInterfaceRQ
     */
    public AirInterfaceRQ toOTAReadRQ(final AirReadRequestWrapper request) {

	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	final OTAReadRQWrapper otaReadRQWrapper = new OTAReadRQWrapper();

	final List<AirReadRequest> airListBookingsReadRequest = request.getAirReadRequests();
	for (AirReadRequest airReadRequestData : airListBookingsReadRequest) {
	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(airReadRequestData.getSupplierID().getValue());
	    supplierIDType.setMarketType(airReadRequestData.getSupplierID().getMarketType());
	    otaReadRQWrapper.setSupplierID(supplierIDType);
	    otaReadRQWrapper.setSequence(airReadRequestData.getSequence());
	    final OTAReadRQ otaReadRQ = new OTAReadRQ();
	    otaReadRQ.setVersion(airReadRequestData.getAirReadRQ().getVersion());
	    otaReadRQ.setPrimaryLangID(airReadRequestData.getAirReadRQ().getPrimaryLangID());

	    final POSType pos = new POSType();
	    final SourceType sourceType = new SourceType();
	    pos.getSource().add(sourceType);
	    otaReadRQ.setPOS(pos);

	    OTAReadRQ.ReadRequests.AirReadRequest airReadRequest;
	    final OTAReadRQ.ReadRequests readRequests = new OTAReadRQ.ReadRequests();
	    final List<AirReadReq> airReadReqsData = airReadRequestData.getAirReadRQ().getAirReadReqs();
	    for (AirReadReq AirReadReqData : airReadReqsData) {
		airReadRequest = new OTAReadRQ.ReadRequests.AirReadRequest();
		airReadRequest.setStart(getDateAsString(AirReadReqData.getStart()));
		airReadRequest.setEnd(getDateAsString(AirReadReqData.getEnd()));
		readRequests.getAirReadRequest().add(airReadRequest);
	    }
	    otaReadRQ.setReadRequests(readRequests);
	    otaReadRQWrapper.setOTAReadRQ(otaReadRQ);
	    requestBody.getOTAReadRQWrapper().add(otaReadRQWrapper);
	}

	airInterfaceRQ.setRequestBody(requestBody);
	airInterfaceRQ.setRequestHeader(populateRequestHeader(request.getRequestHeader()));
	return airInterfaceRQ;
    }

    /**
     * @param airInterfaceRS
     *            AirInterfaceRS
     * @return AirBookResponseWrapper
     */
    public AirBookResponseWrapper fromOTAAirBookRS(final AirInterfaceRS airInterfaceRS) {
	final AirBookResponseWrapper airBookResponseWrapper = new AirBookResponseWrapper();
	AirBookResponse airListBookingsResponseData;
	final List<AirBookResponse> airBookResponsesData = new ArrayList<>();
	final List<OTAAirBookRSWrapper> otaAirBookRSWrapperList = airInterfaceRS.getResponseBody().getOTAAirBookRSWrapper();
	if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAAirBookRSWrapper otaAirBookRSWrapper : otaAirBookRSWrapperList) {
		airListBookingsResponseData = new AirBookResponse();
		String supplierId = otaAirBookRSWrapper.getSupplierID().getValue();
		airListBookingsResponseData.setSequence(otaAirBookRSWrapper.getSequence());
		airListBookingsResponseData.setSupplierID(populateGetSupplierId(otaAirBookRSWrapper.getSupplierID()));
		if (!hasError(otaAirBookRSWrapper.getErrorList())) {
		    final AirBookRS airBookRSData = new AirBookRS();
		    final OTAAirBookRS otaAirBookRS = otaAirBookRSWrapper.getOTAAirBookRS();
		    airBookRSData.setVersion(otaAirBookRS.getVersion());
		    airBookRSData.setPrimaryLangID(otaAirBookRS.getPrimaryLangID());
		    final List<Object> successAndWarningsAndAirReservation = otaAirBookRS.getSuccessAndWarningsAndAirReservation();
		    for (Object object : successAndWarningsAndAirReservation) {
			if (object instanceof SuccessType) {
			    final SuccessType successType = (SuccessType) object;
			    LOG.debug("SuccessType::{}", successType);
			}
			if (object instanceof OTAAirBookRS.AirReservation) {
			    final OTAAirBookRS.AirReservation airReservation = (OTAAirBookRS.AirReservation) object;
			    final AirReservation airReservationData = new AirReservation();
			    airReservationData.setCreateDateTime(getStringAsDate(airReservation.getCreateDateTime()));
			    final AirItinerary airItineraryData = new AirItinerary();
			    final List<com.cnk.travelogix.suppliers.air.data.OriginDestinationOption> originDestinationOptionsData = getOrignDestinationOptionsData(
				    airReservation.getAirItinerary().getOriginDestinationOptions().getOriginDestinationOption());
			    airItineraryData.setOriginDestinationOptions(originDestinationOptionsData);
			    airReservationData.setAirItinerary(airItineraryData);
			    airBookRSData.setAirReservation(airReservationData);
			}
		    }
		    airBookRSData.setErrors(getErrorsData(otaAirBookRS.getErrors(), supplierId));
		    airListBookingsResponseData.setAirBookRS(airBookRSData);
		}
		airListBookingsResponseData.setErrors(getErrorsListData(otaAirBookRSWrapper.getErrorList(), supplierId));
		airBookResponsesData.add(airListBookingsResponseData);
	    }
	}

	airBookResponseWrapper.setAirBookResponses(airBookResponsesData);
	airBookResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));
	airBookResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));

	return airBookResponseWrapper;
    }

    /**
     * @param originDestinationOptions
     * @return originDestinationOptionsData
     */
    private List<com.cnk.travelogix.suppliers.air.data.OriginDestinationOption> getOrignDestinationOptionsData(final List<OriginDestinationOption> originDestinationOptions) {
	com.cnk.travelogix.suppliers.air.data.OriginDestinationOption originDestinationOptionData;
	final List<com.cnk.travelogix.suppliers.air.data.OriginDestinationOption> originDestinationOptionsData = new ArrayList<>();
	for (OriginDestinationOption originDestinationOption : originDestinationOptions) {
	    originDestinationOptionData = new com.cnk.travelogix.suppliers.air.data.OriginDestinationOption();
	    final List<FlightSegment> flightSegments = originDestinationOption.getFlightSegment();
	    com.cnk.travelogix.suppliers.air.data.FlightSegment flightSegmentData;
	    final List<com.cnk.travelogix.suppliers.air.data.FlightSegment> flightSegmentsData = new ArrayList<>();
	    for (FlightSegment flightSegment : flightSegments) {
		flightSegmentData = new com.cnk.travelogix.suppliers.air.data.FlightSegment();
		final TPAExtensionsType tpaExtensions = flightSegment.getTPAExtensions();
		if (tpaExtensions != null) {
		    final List<String> elementTypes = new ArrayList<>();
		    elementTypes.add("ExtendedRPH");
		    final TPAExtensions tpaExtensionsData = getTPAExtensionsData(tpaExtensions, elementTypes);
		    flightSegmentData.setTpaExtensions(tpaExtensionsData);
		}
		flightSegmentsData.add(flightSegmentData);
	    }
	    originDestinationOptionData.setFlightSegments(flightSegmentsData);
	    originDestinationOptionsData.add(originDestinationOptionData);
	}
	return originDestinationOptionsData;
    }
}
