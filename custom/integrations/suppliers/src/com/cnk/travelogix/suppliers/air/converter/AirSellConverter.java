/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.AirItineraryType;
import org.opentravel.ota._2003._05.AirItineraryType.OriginDestinationOptions;
import org.opentravel.ota._2003._05.AirTripType;
import org.opentravel.ota._2003._05.FareType;
import org.opentravel.ota._2003._05.OTAAirPriceRQ;
import org.opentravel.ota._2003._05.OTAAirPriceRQ.TravelerInfoSummary;
import org.opentravel.ota._2003._05.OTAAirPriceRS;
import org.opentravel.ota._2003._05.POSType;
import org.opentravel.ota._2003._05.PassengerTypeQuantityType;
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
import com.cnk.travelogix.suppliers.air.data.PassengerTypeQuantity;
import com.cnk.travelogix.suppliers.air.data.PricingOverview;
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
public class AirSellConverter extends AirBaseConverter {

    /**
     * @param requestWrapper
     * @return AirInterfaceRQ
     */
    public AirInterfaceRQ toOTAAirSellRQ(final AirPriceRequestWrapper requestWrapper) {
	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAAirPriceRQWrapper otaAirPriceRQWrapper;
	final List<AirPriceRequest> airAirPriceRequestsData = requestWrapper.getAirAirPriceRequests();
	for (AirPriceRequest airSellRequestData : airAirPriceRequestsData) {
	    otaAirPriceRQWrapper = new OTAAirPriceRQWrapper();

	    otaAirPriceRQWrapper.setSequence(airSellRequestData.getSequence());

	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(airSellRequestData.getSupplierID().getValue());
	    supplierIDType.setMarketType(airSellRequestData.getSupplierID().getMarketType());
	    otaAirPriceRQWrapper.setSupplierID(supplierIDType);

	    final OTAAirPriceRQ otaAirSellRQ = new OTAAirPriceRQ();
	    otaAirSellRQ.setVersion(airSellRequestData.getAirPriceRQ().getVersion());
	    otaAirSellRQ.setTarget(airSellRequestData.getAirPriceRQ().getTarget());
	    otaAirSellRQ.setTransactionIdentifier(airSellRequestData.getAirPriceRQ().getTransactionIdentifier());
	    otaAirSellRQ.setPrimaryLangID(airSellRequestData.getAirPriceRQ().getPrimaryLangID());

	    final POSType pos = new POSType();
	    final SourceType sourceType = new SourceType();
	    pos.getSource().add(sourceType);
	    otaAirSellRQ.setPOS(pos);

	    final AirItineraryType airItineraryType = new AirItineraryType();
	    final AirItinerary airItineraryData = airSellRequestData.getAirPriceRQ().getAirItinerary();
	    final List<com.cnk.travelogix.suppliers.air.data.OriginDestinationOption> originDestOptionsData = airItineraryData.getOriginDestinationOptions();
	    final OriginDestinationOptions originDestOptions = populateOriginDestinationOption(originDestOptionsData);
	    airItineraryType.setOriginDestinationOptions(originDestOptions);
	    if (airItineraryData.getDirectionInd() != null)
		airItineraryType.setDirectionInd(AirTripType.fromValue(airItineraryData.getDirectionInd()));
	    otaAirSellRQ.setAirItinerary(airItineraryType);

	    TravelerInformationType travelerInformation;
	    final TravelerInfoSummary travelerInfoSummary = new TravelerInfoSummary();
	    final com.cnk.travelogix.suppliers.air.data.TravelerInfoSummary travelerInfoSummaryData = airSellRequestData.getAirPriceRQ().getTravelerInfoSummary();
	    for (TravelerInformation travelerInformationData : travelerInfoSummaryData.getAirTraveler()) {
		travelerInformation = new TravelerInformationType();
		PassengerTypeQuantityType paxTypeQuantity;
		for (PassengerTypeQuantity paxTypeQuantityData : travelerInformationData.getPassengerTypeQuantity()) {
		    paxTypeQuantity = new PassengerTypeQuantityType();
		    paxTypeQuantity.setCode(paxTypeQuantityData.getCode());
		    paxTypeQuantity.setQuantity(paxTypeQuantityData.getQuantity());
		    travelerInformation.getPassengerTypeQuantity().add(paxTypeQuantity);
		}
		travelerInfoSummary.getAirTravelerAvail().add(travelerInformation);
	    }
	    if (travelerInfoSummaryData.getSeatsRequested() != null)
		travelerInfoSummary.getSeatsRequested().addAll(travelerInfoSummaryData.getSeatsRequested());

	    final PriceRequestInformation priceRequestInformationData = new PriceRequestInformation();
	    final com.cnk.travelogix.suppliers.air.data.PriceRequestInformation priceReqInfoData = travelerInfoSummaryData.getPriceRequestInformation();
	    if (priceReqInfoData != null)
		priceRequestInformationData.setCurrencyCode(priceReqInfoData.getCurrencyCode());
	    travelerInfoSummary.setPriceRequestInformation(priceRequestInformationData);

	    final TPAExtensions tpaExtensionsData = travelerInfoSummaryData.getTpaExtensions();
	    if (tpaExtensionsData != null) {
		final TPAExtensionsType tpaExtensionsType = getTPAExtensionsType(tpaExtensionsData, NAMESPACE_AIR);
		travelerInfoSummary.setTPAExtensions(tpaExtensionsType);
	    }

	    otaAirSellRQ.setTravelerInfoSummary(travelerInfoSummary);
	    otaAirPriceRQWrapper.setOTAAirPriceRQ(otaAirSellRQ);
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
    public AirPriceResponseWrapper fromOTAAirSellRS(final AirInterfaceRS airInterfaceRS) {

	final AirPriceResponseWrapper airPriceResponseWrapper = new AirPriceResponseWrapper();
	AirPriceResponse airSellResponseData;
	final List<AirPriceResponse> airPriceResponsesData = new ArrayList<>();
	final List<OTAAirPriceRSWrapper> otaAirPriceRSWrapperList = airInterfaceRS.getResponseBody().getOTAAirPriceRSWrapper();
	if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAAirPriceRSWrapper otaAirPriceRSWrapper : otaAirPriceRSWrapperList) {
		airSellResponseData = new AirPriceResponse();
		airSellResponseData.setSequence(otaAirPriceRSWrapper.getSequence());
		String supplierId = otaAirPriceRSWrapper.getSupplierID().getValue();
		if (!hasError(otaAirPriceRSWrapper.getErrorList())) {
		    final AirPriceRS airSellRSData = new AirPriceRS();
		    final OTAAirPriceRS otaAirPriceRS = otaAirPriceRSWrapper.getOTAAirPriceRS();
		    airSellRSData.setPrimaryLangID(otaAirPriceRS.getPrimaryLangID());
		    airSellRSData.setVersion(otaAirPriceRS.getVersion());
		    final List<Object> successAndWarningsAndPricedItineraries = otaAirPriceRS.getSuccessAndWarningsAndPricedItineraries();
		    for (Object object : successAndWarningsAndPricedItineraries) {
			if (object instanceof SuccessType) {
			    airSellRSData.setSuccess(Boolean.TRUE);
			}
			if (object instanceof UniqueIDType) {
			    final UniqueIDType uniqueIDType = (UniqueIDType) object;
			    final BookingReferenceID bookingReferenceIDData = new BookingReferenceID();
			    bookingReferenceIDData.setId(uniqueIDType.getID());
			    bookingReferenceIDData.setType(uniqueIDType.getType());
			    airSellRSData.setBookingReferenceID(bookingReferenceIDData);
			}
			if (object instanceof OTAAirPriceRS.PricingOverview) {
			    final OTAAirPriceRS.PricingOverview pricingOverview = (OTAAirPriceRS.PricingOverview) object;
			    final FareType fareInfo = pricingOverview.getFareInfo();
			    final PricingOverview pricingOverviewData = getPricingOverviewData(fareInfo);
			    airSellRSData.setPricingOverview(pricingOverviewData);
			}
			if (object instanceof PricedItinerariesType) {
			    final PricedItinerariesType pricedItinerariesType = (PricedItinerariesType) object;
			    final List<PricedItinerary> pricedItineraries = pricedItinerariesType.getPricedItinerary();
			    final List<com.cnk.travelogix.suppliers.air.data.PricedItinerary> pricedItinerariesData = getPricedItineraryData(pricedItineraries);
			    airSellRSData.setPricedItineraries(pricedItinerariesData);
			}
		    }
		    airSellRSData.setErrors(getErrorsData(otaAirPriceRS.getErrors(), supplierId));
		    airSellResponseData.setAirPriceRS(airSellRSData);
		}
		airSellResponseData.setErrors(getErrorsListData(otaAirPriceRSWrapper.getErrorList(), supplierId));
		airPriceResponsesData.add(airSellResponseData);
	    }
	}
	airPriceResponseWrapper.setAirPriceResponses(airPriceResponsesData);
	airPriceResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));
	airPriceResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));

	return airPriceResponseWrapper;
    }

    /**
     * @param fareInfo
     * @return pricingOverviewData
     */
    private PricingOverview getPricingOverviewData(final FareType fareInfo) {
	PricingOverview pricingOverviewData = null;
	if (fareInfo != null) {
	    pricingOverviewData = new PricingOverview();
	    pricingOverviewData.setBaseFare(getBaseFareData(fareInfo.getBaseFare()));
	    pricingOverviewData.setEquivFares(getEquivFaresData(fareInfo.getEquivFare()));
	    pricingOverviewData.setTotalFare(getTotalFareData(fareInfo.getTotalFare()));
	}
	return pricingOverviewData;
    }
}
