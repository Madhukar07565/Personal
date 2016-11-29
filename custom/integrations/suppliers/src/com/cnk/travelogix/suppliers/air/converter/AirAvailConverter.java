package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.collections.CollectionUtils;
import org.opentravel.ota._2003._05.CabinAvailabilityType.Meal;
import org.opentravel.ota._2003._05.MarketingCabinType;
import org.opentravel.ota._2003._05.OTAAirAvailRQ;
import org.opentravel.ota._2003._05.OTAAirAvailRS;
import org.opentravel.ota._2003._05.OTAAirAvailRS.OriginDestinationInformation.OriginDestinationOptions;
import org.opentravel.ota._2003._05.OTAAirAvailRS.OriginDestinationInformation.OriginDestinationOptions.OriginDestinationOption;
import org.opentravel.ota._2003._05.OTAAirAvailRS.OriginDestinationInformation.OriginDestinationOptions.OriginDestinationOption.FlightSegment;
import org.opentravel.ota._2003._05.OTAAirAvailRS.OriginDestinationInformation.OriginDestinationOptions.OriginDestinationOption.FlightSegment.BookingClassAvail;
import org.opentravel.ota._2003._05.OriginDestinationInformationType.DestinationLocation;
import org.opentravel.ota._2003._05.OriginDestinationInformationType.OriginLocation;
import org.opentravel.ota._2003._05.POSType;
import org.opentravel.ota._2003._05.SourceType;
import org.opentravel.ota._2003._05.TPAExtensionsType;
import org.opentravel.ota._2003._05.TimeInstantType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cnk.travelogix.suppliers.acco.data.AirAvailResponse;
import com.cnk.travelogix.suppliers.air.data.AirAvailRS;
import com.cnk.travelogix.suppliers.air.data.AirAvailRequest;
import com.cnk.travelogix.suppliers.air.data.AirAvailRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirAvailResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.OriginDestinationInformation;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
import com.coxandkings.integ.suppl.air.OTAAirAvailRQWrapper;
import com.coxandkings.integ.suppl.air.OTAAirAvailRSWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * @author Mayank Sirothia
 */
public class AirAvailConverter extends AirBaseConverter {

    /** The constant LOG. */
    private static final Logger LOG = LoggerFactory.getLogger(AirAvailConverter.class);

    /**
     * @param request
     *            AirAvailRequest
     * @return AirInterfaceRQ
     */
    public AirInterfaceRQ toOTAAirAvailRQ(final AirAvailRequestWrapper request) {

	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	final OTAAirAvailRQWrapper otaAirAvailRQWrapper = new OTAAirAvailRQWrapper();

	final List<AirAvailRequest> airAvailRequestList = request.getAirAvailRequest();
	if (CollectionUtils.isNotEmpty(airAvailRequestList)) {
	    for (final AirAvailRequest airAvailRequestData : airAvailRequestList) {
		final SupplierIDType supplierIDType = new SupplierIDType();
		if (null != airAvailRequestData.getSupplierID()) {
		    supplierIDType.setValue(airAvailRequestData.getSupplierID().getValue());
		    supplierIDType.setMarketType(airAvailRequestData.getSupplierID().getMarketType());
		    otaAirAvailRQWrapper.setSupplierID(supplierIDType);
		}
		otaAirAvailRQWrapper.setSequence(airAvailRequestData.getSequence());
		final OTAAirAvailRQ otaAirAvailRQ = new OTAAirAvailRQ();
		otaAirAvailRQ.setVersion(airAvailRequestData.getAirAvailRQ().getVersion());
		otaAirAvailRQ.setTarget(airAvailRequestData.getAirAvailRQ().getTarget());
		final POSType pos = new POSType();
		final SourceType sourceType = new SourceType();
		pos.getSource().add(sourceType);
		otaAirAvailRQ.setPOS(pos);

		otaAirAvailRQWrapper.setOTAAirAvailRQ(populateOriginDestinationInformation(airAvailRequestData, otaAirAvailRQ));
		requestBody.getOTAAirAvailRQWrapper().add(otaAirAvailRQWrapper);
	    }
	}
	airInterfaceRQ.setRequestBody(requestBody);
	airInterfaceRQ.setRequestHeader(populateRequestHeader(request.getRequestHeader()));
	LOG.info(airInterfaceRQ.toString());
	return airInterfaceRQ;
    }

    /**
     * 
     * @param airAvailRequestData
     * @param otaAirAvailRQ
     */
    private OTAAirAvailRQ populateOriginDestinationInformation(final AirAvailRequest airAvailRequestData, final OTAAirAvailRQ otaAirAvailRQ) {

	final List<OriginDestinationInformation> originDestinationInformationDataList = airAvailRequestData.getAirAvailRQ().getOriginDestinationInformation();
	if (CollectionUtils.isNotEmpty(originDestinationInformationDataList)) {
	    for (final OriginDestinationInformation originDestinationInformationData : originDestinationInformationDataList) {
		final org.opentravel.ota._2003._05.OTAAirAvailRQ.OriginDestinationInformation originDestinationInformation = new OTAAirAvailRQ.OriginDestinationInformation();
		final TimeInstantType departureDateTime = new TimeInstantType();
		departureDateTime.setValue(originDestinationInformationData.getDepartureDateTime());
		originDestinationInformation.setDepartureDateTime(departureDateTime);
		final OriginLocation originLocation = new OriginLocation();
		originLocation.setLocationCode(originDestinationInformationData.getOriginLocationCode());
		originDestinationInformation.setOriginLocation(originLocation);
		final DestinationLocation destinationLocation = new DestinationLocation();
		destinationLocation.setLocationCode(originDestinationInformationData.getDestinationLocationCode());
		originDestinationInformation.setDestinationLocation(destinationLocation);
		originDestinationInformation.setRPH(originDestinationInformationData.getRph());
		otaAirAvailRQ.getOriginDestinationInformation().add(originDestinationInformation);
	    }
	}
	return otaAirAvailRQ;
    }

    /**
     * @param airInterfaceRS
     *            AirInterfaceRS
     * @return AirBookResponseWrapper
     */
    public AirAvailResponseWrapper fromOTAAirAvailRS(final AirInterfaceRS airInterfaceRS) {

	final List<OTAAirAvailRSWrapper> oTAAirAvailRSWrapperList = airInterfaceRS.getResponseBody().getOTAAirAvailRSWrapper();
	AirAvailResponseWrapper airAvailResponseWrapper = new AirAvailResponseWrapper();
	List<AirAvailResponse> airAvailResponses = new ArrayList<>();
	AirAvailResponse airAvailResponse;
	if (CollectionUtils.isNotEmpty(oTAAirAvailRSWrapperList)) {
	    if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
		for (final OTAAirAvailRSWrapper oTAAirAvailRSWrapper : oTAAirAvailRSWrapperList) {
		    String supplierId = oTAAirAvailRSWrapper.getSupplierID().getValue();
		    airAvailResponse = new AirAvailResponse();
		    airAvailResponse.setSequence(oTAAirAvailRSWrapper.getSequence());
		    airAvailResponse.setSupplierID(populateGetSupplierId(oTAAirAvailRSWrapper.getSupplierID()));
		    final OTAAirAvailRS otaAirAvailRS = oTAAirAvailRSWrapper.getOTAAirAvailRS();
		    if (!hasError(oTAAirAvailRSWrapper.getErrorList())) {
		    AirAvailRS airAvailRS = new AirAvailRS();
		    airAvailRS.setVersion(otaAirAvailRS.getVersion());
		    final XMLGregorianCalendar timeStamp = otaAirAvailRS.getTimeStamp();
		    if (timeStamp != null) {
			airAvailRS.setTimeStamp(timeStamp.toGregorianCalendar().getTime());
		    }
		    airAvailRS.setTarget(otaAirAvailRS.getTarget());
		    airAvailRS.setEchoToken(otaAirAvailRS.getEchoToken());
		    airAvailRS.setAltLangID(otaAirAvailRS.getAltLangID());
		    airAvailRS.setSequenceNumber(otaAirAvailRS.getSequenceNmbr());
		    airAvailRS.setPrimaryLangID(otaAirAvailRS.getPrimaryLangID());
		    airAvailRS.setTargetName(otaAirAvailRS.getTargetName());

		    final List<org.opentravel.ota._2003._05.OTAAirAvailRS.OriginDestinationInformation> originDestinationInformations = otaAirAvailRS.getOriginDestinationInformation();
		    final OriginDestinationInformation originDestinationInformationData = getOriginDestinationInformationData(originDestinationInformations);
		    airAvailRS.setOriginDestinationInformation(originDestinationInformationData);
		    airAvailResponse.setAirAvailRS(airAvailRS);
		    }
		    airAvailResponse.setErrors(getErrorsData(otaAirAvailRS.getErrors(), supplierId));
		    airAvailResponses.add(airAvailResponse);
		}
	    }
	}
	airAvailResponseWrapper.setAirAvailResponses(airAvailResponses);
	airAvailResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));
	airAvailResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));
	return airAvailResponseWrapper;
    }

    /**
     * @param originDestinationInformations
     * @return originDestinationInformationData
     */
    private OriginDestinationInformation getOriginDestinationInformationData(
	    final List<org.opentravel.ota._2003._05.OTAAirAvailRS.OriginDestinationInformation> originDestinationInformations) {
	final OriginDestinationInformation originDestinationInformationData = new OriginDestinationInformation();
	final List<com.cnk.travelogix.suppliers.air.data.OriginDestinationOption> originDestinationOptionDataList = new ArrayList<>();
	for (final org.opentravel.ota._2003._05.OTAAirAvailRS.OriginDestinationInformation originDestinationInformation : originDestinationInformations) {
	    final OriginDestinationOptions originDestinationOptions = originDestinationInformation.getOriginDestinationOptions();
	    for (final OriginDestinationOption originDestinationOption : originDestinationOptions.getOriginDestinationOption()) {
		final com.cnk.travelogix.suppliers.air.data.OriginDestinationOption originDestinationOptionData = new com.cnk.travelogix.suppliers.air.data.OriginDestinationOption();
		final List<FlightSegment> flightSegments = originDestinationOption.getFlightSegment();
		final List<com.cnk.travelogix.suppliers.air.data.FlightSegment> flightSegmentDataList = getFlightSegmentData(flightSegments);
		originDestinationOptionData.setFlightSegments(flightSegmentDataList);
		originDestinationOptionDataList.add(originDestinationOptionData);
	    }
	    originDestinationInformationData.setOriginDestinationOptions(originDestinationOptionDataList);
	}
	return originDestinationInformationData;
    }

    /**
     * @param flightSegments
     * @return flightSegmentDataList
     */
    private List<com.cnk.travelogix.suppliers.air.data.FlightSegment> getFlightSegmentData(final List<FlightSegment> flightSegments) {
	com.cnk.travelogix.suppliers.air.data.FlightSegment flightSegmentData;
	final List<com.cnk.travelogix.suppliers.air.data.FlightSegment> flightSegmentDataList = new ArrayList<>();
	for (final FlightSegment flightSegment : flightSegments) {
	    flightSegmentData = new com.cnk.travelogix.suppliers.air.data.FlightSegment();
	    flightSegmentData.setFlightNumber(flightSegment.getFlightNumber());
	    flightSegmentData.setResBookDesigCode(flightSegment.getResBookDesigCode());

	    // TODO : To correct the below attribute.
	    flightSegmentData.setTicket("12345");

	    flightSegmentData.setSmokingAllowed(flightSegment.isSmokingAllowed());

	    final TPAExtensionsType tpaExtensions = flightSegment.getTPAExtensions();
	    if (tpaExtensions != null) {
		final List<String> elementTypes = new ArrayList<>();
		elementTypes.add("ExtendedRPH");
		final TPAExtensions tpaExtensionsData = getTPAExtensionsData(tpaExtensions, elementTypes);
		flightSegmentData.setTpaExtensions(tpaExtensionsData);
	    }
	    flightSegmentData.setArrivalDateTime(flightSegment.getArrivalDateTime().toGregorianCalendar().getTime());
	    flightSegmentData.setDepartureDateTime(flightSegment.getDepartureDateTime().toGregorianCalendar().getTime());
	    flightSegmentData.setStopQuantity(flightSegment.getStopQuantity());
	    flightSegmentData.setDepartureAirport(getDepartureAirportData(flightSegment.getDepartureAirport()));
	    flightSegmentData.setArrivalAirport(getArrivalAirportData(flightSegment.getArrivalAirport()));
	    flightSegmentData.setOperatingAirline(getOperatingAirlineData(flightSegment.getOperatingAirline()));
	    flightSegmentData.setMarketingAirline(getMarketingAirlineData(flightSegment.getMarketingAirline()));
	    flightSegmentData.setEquipmentTypes(getEquipmentTypesData(flightSegment.getEquipment()));
	    flightSegmentData.setBookingClassAvails(getBookingClassAvailsDataForAirAvail(flightSegment.getBookingClassAvail()));

	    List<com.cnk.travelogix.suppliers.air.data.MarketingCabinType> markettingCabinTypeDataList = new ArrayList<>();
	    for (final MarketingCabinType marketingCabinType : flightSegment.getMarketingCabin()) {
		final com.cnk.travelogix.suppliers.air.data.MarketingCabinType marketingCabinTypeData = new com.cnk.travelogix.suppliers.air.data.MarketingCabinType();
		List<com.cnk.travelogix.suppliers.common.data.Meal> mealDataList = new ArrayList<>();
		for (final Meal meal : marketingCabinType.getMeal()) {
		    com.cnk.travelogix.suppliers.common.data.Meal mealData = new com.cnk.travelogix.suppliers.common.data.Meal();
		    mealData.setMealCode(meal.getMealCode());
		    mealDataList.add(mealData);
		}
		marketingCabinTypeData.setMeal(mealDataList);
		markettingCabinTypeDataList.add(marketingCabinTypeData);
	    }
	    flightSegmentData.setMarketingCabin(markettingCabinTypeDataList);
	    flightSegmentDataList.add(flightSegmentData);
	}
	return flightSegmentDataList;
    }

    /**
     * 
     * @param bookingClassAvailList
     * @return bookingClassAvailDataList
     */
    private List<com.cnk.travelogix.suppliers.air.data.BookingClassAvails> getBookingClassAvailsDataForAirAvail(final List<BookingClassAvail> bookingClassAvailList) {
	com.cnk.travelogix.suppliers.air.data.BookingClassAvails bookingClassAvailData;
	final List<com.cnk.travelogix.suppliers.air.data.BookingClassAvails> bookingClassAvailDataList = new ArrayList<>();
	if (CollectionUtils.isNotEmpty(bookingClassAvailList)) {
	    for (final BookingClassAvail bookingClassAvail : bookingClassAvailList) {
		bookingClassAvailData = new com.cnk.travelogix.suppliers.air.data.BookingClassAvails();
		bookingClassAvailData.setResBookDesigCode(bookingClassAvail.getResBookDesigCode());
		bookingClassAvailData.setResBookDesigQuantity(bookingClassAvail.getResBookDesigQuantity());
		bookingClassAvailData.setRph(bookingClassAvail.getRPH());
		bookingClassAvailDataList.add(bookingClassAvailData);
	    }
	}
	return bookingClassAvailDataList;
    }
}
