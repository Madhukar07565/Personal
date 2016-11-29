/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.XMLGregorianCalendar;

import org.opentravel.ota._2003._05.OTAAirLowFareSearchRQ;
import org.opentravel.ota._2003._05.OTAAirLowFareSearchRS;
import org.opentravel.ota._2003._05.OriginDestinationInformationType.DestinationLocation;
import org.opentravel.ota._2003._05.OriginDestinationInformationType.OriginLocation;
import org.opentravel.ota._2003._05.POSType;
import org.opentravel.ota._2003._05.PricedItinerariesType.PricedItinerary;
import org.opentravel.ota._2003._05.PricedItineraryType.AirItineraryPricingInfo;
import org.opentravel.ota._2003._05.PricingSourceType;
import org.opentravel.ota._2003._05.SourceType;
import org.opentravel.ota._2003._05.TPAExtensionsType;
import org.opentravel.ota._2003._05.TimeInstantType;
import org.opentravel.ota._2003._05.TravelerInfoSummaryType.PriceRequestInformation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.opentravel.ota._2003._05.TravelerInformationType;
import org.springframework.util.StringUtils;

import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchRQ;
import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchRS;
import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchRequest;
import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchResponse;
import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.OriginDestinationInformation;
import com.cnk.travelogix.suppliers.air.data.PassengerTypeQuantity;
import com.cnk.travelogix.suppliers.air.data.TravelPreferences;
import com.cnk.travelogix.suppliers.air.data.TravelerInfoSummary;
import com.cnk.travelogix.suppliers.air.data.TravelerInformation;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
import com.cnk.travelogix.suppliers.task.UpdatePriceInfoTask;

import com.coxandkings.integ.suppl.air.OTAAirLowFareSearchRSWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;

import de.hybris.platform.util.Config;

/**
 * @author I077988
 */
public class AirLowFareSearchConverter extends AirBaseConverter {
	private Logger LOG = LoggerFactory.getLogger(getClass());
	/**
	 * @param request
	 *            AirLowFareSearchRequest
	 * @return AirInterfaceRQ
	 */
	public AirInterfaceRQ toOTAAirLowFareSearchRQ(final AirLowFareSearchRequest request) {
		final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
		final RequestBody requestBody = new RequestBody();
		final OTAAirLowFareSearchRQ otaAirLowFareSearchRQ = new OTAAirLowFareSearchRQ();

		// Populate OTAAirLowFareSearchRQ
		final AirLowFareSearchRQ airLowFareSearchRQ = request.getAirLowFareSearchRQ();
		otaAirLowFareSearchRQ.setTarget(airLowFareSearchRQ.getTarget());
		otaAirLowFareSearchRQ.setVersion(airLowFareSearchRQ.getVersion());
		otaAirLowFareSearchRQ.setPrimaryLangID(airLowFareSearchRQ.getPrimaryLangID());
		otaAirLowFareSearchRQ.setMaxResponses(airLowFareSearchRQ.getMaxResponses());

		final POSType pos = new POSType();
		final SourceType sourceType = new SourceType();
		pos.getSource().add(sourceType);
		otaAirLowFareSearchRQ.setPOS(pos);

		// Mandatory
		final List<OriginDestinationInformation> originDestInfosData = airLowFareSearchRQ.getOriginDestinationInformation();
		final List<org.opentravel.ota._2003._05.OTAAirLowFareSearchRQ.OriginDestinationInformation> originDestInfos = populateOriginDestInfo(originDestInfosData);
		otaAirLowFareSearchRQ.getOriginDestinationInformation().addAll(originDestInfos);

		// Not Mandatory
		final List<TravelPreferences> travelPreferencesData = airLowFareSearchRQ.getTravelPreferences();
		final List<org.opentravel.ota._2003._05.OTAAirLowFareSearchRQ.TravelPreferences> travelPreferences = populateTravelPreferences(travelPreferencesData);
		otaAirLowFareSearchRQ.getTravelPreferences().addAll(travelPreferences);

		// Mandatory
		final TravelerInfoSummary travelerInfoSummaryData = airLowFareSearchRQ.getTravelerInfoSummary();
		final OTAAirLowFareSearchRQ.TravelerInfoSummary travelerInfoSummary = populateTravelerInfoSummary(travelerInfoSummaryData);
		otaAirLowFareSearchRQ.setTravelerInfoSummary(travelerInfoSummary);

		requestBody.setOTAAirLowFareSearchRQ(otaAirLowFareSearchRQ);
		airInterfaceRQ.setRequestBody(requestBody);
		airInterfaceRQ.setRequestHeader(populateRequestHeader(request.getRequestHeader()));
		return airInterfaceRQ;
	}

	/**
	 * @param originDestInfosData
	 * @return travelPreferencesList
	 */
	private List<OTAAirLowFareSearchRQ.OriginDestinationInformation> populateOriginDestInfo(final List<OriginDestinationInformation> originDestInfosData) {
		final List<OTAAirLowFareSearchRQ.OriginDestinationInformation> originDestinationInformations = new ArrayList<>();
		OTAAirLowFareSearchRQ.OriginDestinationInformation orignDestInfo;
		for (OriginDestinationInformation orignDestInfoData : originDestInfosData) {
			orignDestInfo = new OTAAirLowFareSearchRQ.OriginDestinationInformation();
			final TimeInstantType departureDateTime = new TimeInstantType();
			departureDateTime.setValue(orignDestInfoData.getDepartureDateTime());
			orignDestInfo.setDepartureDateTime(departureDateTime);
			final OriginLocation originLocation = new OriginLocation();
			originLocation.setLocationCode(orignDestInfoData.getOriginLocationCode());
			orignDestInfo.setOriginLocation(originLocation);
			final DestinationLocation destinationLocation = new DestinationLocation();
			destinationLocation.setLocationCode(orignDestInfoData.getDestinationLocationCode());
			orignDestInfo.setDestinationLocation(destinationLocation);
			originDestinationInformations.add(orignDestInfo);
		}
		return originDestinationInformations;
	}

	/**
	 * @param travelPreferencesData
	 * @return travelPreferencesList
	 */
	private List<OTAAirLowFareSearchRQ.TravelPreferences> populateTravelPreferences(final List<TravelPreferences> travelPreferencesData) {
		final List<OTAAirLowFareSearchRQ.TravelPreferences> travelPreferencesList = new ArrayList<>();
		if (travelPreferencesData != null && !travelPreferencesData.isEmpty()) {
			OTAAirLowFareSearchRQ.TravelPreferences travelPreferences;
			for (TravelPreferences travelPreferenceData : travelPreferencesData) {
				travelPreferences = new OTAAirLowFareSearchRQ.TravelPreferences();
				travelPreferences.setMaxStopsQuantity(travelPreferenceData.getMaxStopsQuantity());
				travelPreferences.getFlightTypePref().addAll(populateFlightTypePrefs(travelPreferenceData.getFlightTypePref()));
				travelPreferences.getFareRestrictPref().addAll(populateFareRestrictPrefs(travelPreferenceData.getFareRestrictPref()));
				travelPreferences.getCabinPref().addAll(populateCabinPrefs(travelPreferenceData.getCabinPref()));
				travelPreferencesList.add(travelPreferences);
			}
		}
		return travelPreferencesList;
	}

	/**
	 * @param travelerInfoSummaryData
	 * @return travelerInfoSummary
	 */
	private OTAAirLowFareSearchRQ.TravelerInfoSummary populateTravelerInfoSummary(final TravelerInfoSummary travelerInfoSummaryData) {
		final OTAAirLowFareSearchRQ.TravelerInfoSummary travelerInfoSummary = new OTAAirLowFareSearchRQ.TravelerInfoSummary();

		final List<TravelerInformation> travelerInformationsData = travelerInfoSummaryData.getAirTraveler();
		if (travelerInformationsData != null && !travelerInformationsData.isEmpty()) {
			TravelerInformationType travelerInformation;
			for (TravelerInformation travelerInformationData : travelerInformationsData) {
				travelerInformation = new TravelerInformationType();
				final List<PassengerTypeQuantity> passengerTypeQuantitiesData = travelerInformationData.getPassengerTypeQuantity();
				travelerInformation.getPassengerTypeQuantity().addAll(populatePassengerTypeQuantity(passengerTypeQuantitiesData));
				travelerInfoSummary.getAirTravelerAvail().add(travelerInformation);
			}
		}

		final com.cnk.travelogix.suppliers.air.data.PriceRequestInformation priceReqInfoData = travelerInfoSummaryData.getPriceRequestInformation();
		if (priceReqInfoData != null) {
			final PriceRequestInformation priceRequestInformation = new PriceRequestInformation();
			priceRequestInformation.setCurrencyCode(priceReqInfoData.getCurrencyCode());
			final String pricingSource = priceReqInfoData.getPricingSource();
			if (StringUtils.hasText(pricingSource)) {
				priceRequestInformation.setPricingSource(PricingSourceType.fromValue(pricingSource));
			}
			travelerInfoSummary.setPriceRequestInformation(priceRequestInformation);
		}

		final TPAExtensions tpaExtensionsData = travelerInfoSummaryData.getTpaExtensions();
		if (tpaExtensionsData != null) {
			final TPAExtensionsType tpaExtensionsType = getTPAExtensionsType(tpaExtensionsData, NAMESPACE_AIR);
			travelerInfoSummary.setTPAExtensions(tpaExtensionsType);
		}
		return travelerInfoSummary;
	}

	/**
	 * @param airInterfaceRS
	 * @return AirLowFareSearchResponse
	 */
	public AirLowFareSearchResponseWrapper fromOTAAirLowFareSearchRS(final AirInterfaceRS airInterfaceRS) {
		ExecutorService executorService = null;
		boolean activateWorkers = Config.getBoolean("activateCCworkers", false);
		if(activateWorkers) {
			//TODO: validate and then add fixed thread pool if required.
			executorService = Executors.newCachedThreadPool();
		}
		final AirLowFareSearchResponseWrapper airLowFareSearchResponseWrapper = new AirLowFareSearchResponseWrapper();
		AirLowFareSearchResponse airLowFareSearchResponseData;
		final List<AirLowFareSearchResponse> airLowFareSearchResponseesData = new ArrayList<>();
		final List<OTAAirLowFareSearchRSWrapper> otaAirLowFareSearchRSWrapperList = airInterfaceRS.getResponseBody().getOTAAirLowFareSearchRSWrapper();
		if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
			for (OTAAirLowFareSearchRSWrapper otaAirLowFareSearchRSWrapper : otaAirLowFareSearchRSWrapperList) {
				airLowFareSearchResponseData = new AirLowFareSearchResponse();
				String supplierId = otaAirLowFareSearchRSWrapper.getSupplierID().getValue();
				airLowFareSearchResponseData.setSupplierID(populateGetSupplierId(otaAirLowFareSearchRSWrapper.getSupplierID()));

				final AirLowFareSearchRS airLowFareSearchRSData = new AirLowFareSearchRS();
				final OTAAirLowFareSearchRS otaAirLowFareSearchRS = otaAirLowFareSearchRSWrapper.getOTAAirLowFareSearchRS();
				airLowFareSearchRSData.setEchoToken(otaAirLowFareSearchRS.getEchoToken());
				final XMLGregorianCalendar timeStamp = otaAirLowFareSearchRS.getTimeStamp();
				if (timeStamp != null) {
					airLowFareSearchRSData.setTimeStamp(timeStamp.toGregorianCalendar().getTime());
				}
				airLowFareSearchRSData.setTarget(otaAirLowFareSearchRS.getTarget());
				airLowFareSearchRSData.setTargetName(otaAirLowFareSearchRS.getTargetName());
				airLowFareSearchRSData.setVersion(otaAirLowFareSearchRS.getVersion());
				airLowFareSearchRSData.setTransactionIdentifier(otaAirLowFareSearchRS.getTransactionIdentifier());
				airLowFareSearchRSData.setTransactionStatusCode(otaAirLowFareSearchRS.getTransactionStatusCode());
				airLowFareSearchRSData.setPrimaryLangID(otaAirLowFareSearchRS.getPrimaryLangID());
				airLowFareSearchRSData.setAltLangID(otaAirLowFareSearchRS.getAltLangID());

				com.cnk.travelogix.suppliers.air.data.PricedItinerary pricedItineraryData;
				final List<com.cnk.travelogix.suppliers.air.data.PricedItinerary> pricedItinerariesData = new ArrayList<>();
				final List<PricedItinerary> pricedItineraries = otaAirLowFareSearchRS.getPricedItineraries().getPricedItinerary();
				for (PricedItinerary pricedItinerary : pricedItineraries) {
					pricedItineraryData = new com.cnk.travelogix.suppliers.air.data.PricedItinerary();
					pricedItineraryData.setSequenceNumber(pricedItinerary.getSequenceNumber());
					pricedItineraryData.setAirItinerary(getAirItineraryData(pricedItinerary.getAirItinerary()));
					AirItineraryPricingInfo pricingInfo = pricedItinerary.getAirItineraryPricingInfo();

					pricedItineraryData.setAirItineraryPricingInfo(getAirItineraryPricingInfoData(pricingInfo));
					Future<com.cnk.travelogix.suppliers.air.data.PricedItinerary> results = null;
					if(activateWorkers) {
						try{
							UpdatePriceInfoTask updatedPriceInfoTask = new UpdatePriceInfoTask(pricedItineraryData);
							results = executorService.submit(updatedPriceInfoTask);
							pricedItinerariesData.add(results.get());
						}catch(Exception e){
							LOG.error(e.getMessage());
						}
					}else {
						pricedItinerariesData.add(pricedItineraryData);
					}
				}
				airLowFareSearchRSData.setPricedItineraries(pricedItinerariesData);
				airLowFareSearchRSData.setErrors(getErrorsData(otaAirLowFareSearchRS.getErrors(), supplierId));

				airLowFareSearchResponseData.setAirLowFareSearchRS(airLowFareSearchRSData);
				airLowFareSearchResponseesData.add(airLowFareSearchResponseData);
			}
		}
		airLowFareSearchResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));
		airLowFareSearchResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));
		airLowFareSearchResponseWrapper.setAirLowFareSearchResponses(airLowFareSearchResponseesData);
		if(activateWorkers) {
			try{
				executorService.shutdown();
				executorService.awaitTermination(Long.MIN_VALUE, TimeUnit.NANOSECONDS);
			}catch(InterruptedException iee) {
				LOG.error(iee.getMessage(),iee);
			}finally {
				if (!executorService.isTerminated()) {
					LOG.info(getClass() + "executor NOT yet terminated !");
				}
				executorService.shutdownNow();
			}
		}
		return airLowFareSearchResponseWrapper;
	}
}
