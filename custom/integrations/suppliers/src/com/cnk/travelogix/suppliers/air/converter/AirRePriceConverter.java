/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.ActionType;
import org.opentravel.ota._2003._05.AirItineraryType;
import org.opentravel.ota._2003._05.AirItineraryType.OriginDestinationOptions;
import org.opentravel.ota._2003._05.AirItineraryType.OriginDestinationOptions.OriginDestinationOption;
import org.opentravel.ota._2003._05.AirTravelerType;
import org.opentravel.ota._2003._05.AirTravelerType.Address;
import org.opentravel.ota._2003._05.AirTravelerType.Document;
import org.opentravel.ota._2003._05.AirTravelerType.Email;
import org.opentravel.ota._2003._05.AirTravelerType.Telephone;
import org.opentravel.ota._2003._05.AirTravelerType.TravelerRefNumber;
import org.opentravel.ota._2003._05.AirTripType;
import org.opentravel.ota._2003._05.BaggageRequestType;
import org.opentravel.ota._2003._05.CountryNameType;
import org.opentravel.ota._2003._05.EncryptionTokenType;
import org.opentravel.ota._2003._05.ListPaymentCardIssuer;
import org.opentravel.ota._2003._05.MealRequestType;
import org.opentravel.ota._2003._05.OTAAirPriceRQ;
import org.opentravel.ota._2003._05.OTAAirPriceRQ.TravelerInfoSummary;
import org.opentravel.ota._2003._05.OTAAirPriceRS;
import org.opentravel.ota._2003._05.POSType;
import org.opentravel.ota._2003._05.PassengerTypeQuantityType;
import org.opentravel.ota._2003._05.PaymentCardType;
import org.opentravel.ota._2003._05.PaymentDetailType;
import org.opentravel.ota._2003._05.PersonNameType;
import org.opentravel.ota._2003._05.PricedItinerariesType;
import org.opentravel.ota._2003._05.PricedItinerariesType.PricedItinerary;
import org.opentravel.ota._2003._05.SourceType;
import org.opentravel.ota._2003._05.SpecialReqDetailsType.OtherServiceInformations;
import org.opentravel.ota._2003._05.SpecialReqDetailsType.OtherServiceInformations.OtherServiceInformation;
import org.opentravel.ota._2003._05.SpecialReqDetailsType.SeatRequests;
import org.opentravel.ota._2003._05.SpecialReqDetailsType.SeatRequests.SeatRequest;
import org.opentravel.ota._2003._05.StateProvType;
import org.opentravel.ota._2003._05.SuccessType;
import org.opentravel.ota._2003._05.TPAExtensionsType;
import org.opentravel.ota._2003._05.TravelerInfoSummaryType.PriceRequestInformation;
import org.opentravel.ota._2003._05.TravelerInformationType;
import org.opentravel.ota._2003._05.UniqueIDType;

import com.cnk.travelogix.suppliers.air.data.AirItinerary;
import com.cnk.travelogix.suppliers.air.data.AirPriceRQ;
import com.cnk.travelogix.suppliers.air.data.AirPriceRS;
import com.cnk.travelogix.suppliers.air.data.AirPriceRequest;
import com.cnk.travelogix.suppliers.air.data.AirPriceRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirPriceResponse;
import com.cnk.travelogix.suppliers.air.data.AirPriceResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirTraveler;
import com.cnk.travelogix.suppliers.air.data.BaggageRequest;
import com.cnk.travelogix.suppliers.air.data.BookingReferenceID;
import com.cnk.travelogix.suppliers.air.data.CountryName;
import com.cnk.travelogix.suppliers.air.data.MealRequest;
import com.cnk.travelogix.suppliers.air.data.PassengerTypeQuantity;
import com.cnk.travelogix.suppliers.air.data.PaymentCard;
import com.cnk.travelogix.suppliers.air.data.PaymentDetail;
import com.cnk.travelogix.suppliers.air.data.PersonName;
import com.cnk.travelogix.suppliers.air.data.StateProv;
import com.cnk.travelogix.suppliers.air.data.TravelerInformation;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
import com.coxandkings.integ.suppl.air.BaggageRequests;
import com.coxandkings.integ.suppl.air.MealRequests;
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
public class AirRePriceConverter extends AirBaseConverter {

    /**
     * @param requestWrapper
     * @return AirInterfaceRQ
     */
    public AirInterfaceRQ toOTAAirRePriceRQ(final AirPriceRequestWrapper requestWrapper) {
	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAAirPriceRQWrapper otaAirPriceRQWrapper;
	final List<AirPriceRequest> airAirPriceRequestsData = requestWrapper.getAirAirPriceRequests();
	for (AirPriceRequest airPriceRequestData : airAirPriceRequestsData) {
	    otaAirPriceRQWrapper = new OTAAirPriceRQWrapper();

	    otaAirPriceRQWrapper.setSequence(airPriceRequestData.getSequence());

	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(airPriceRequestData.getSupplierID().getValue());
	    supplierIDType.setMarketType(airPriceRequestData.getSupplierID().getMarketType());
	    otaAirPriceRQWrapper.setSupplierID(supplierIDType);

	    final OTAAirPriceRQ otaAirPriceRQ = new OTAAirPriceRQ();
	    final AirPriceRQ airPriceRQData = airPriceRequestData.getAirPriceRQ();
	    otaAirPriceRQ.setVersion(airPriceRQData.getVersion());
	    otaAirPriceRQ.setTarget(airPriceRQData.getTarget());
	    if (airPriceRQData.getTimeStamp() != null)
		otaAirPriceRQ.setTimeStamp(toXMLGregorianCalendar(airPriceRQData.getTimeStamp()));
	    otaAirPriceRQ.setTransactionIdentifier(airPriceRQData.getTransactionIdentifier());

	    final POSType pos = new POSType();
	    SourceType sourceType;
	    final com.cnk.travelogix.suppliers.common.data.POSType posData = airPriceRQData.getPos();
	    if (posData != null) {
		final List<com.cnk.travelogix.suppliers.common.data.SourceType> sourcesData = posData.getSource();
		for (com.cnk.travelogix.suppliers.common.data.SourceType sourceData : sourcesData) {
		    sourceType = new SourceType();
		    sourceType.setISOCurrency(sourceData.getIsoCurrency());
		    pos.getSource().add(sourceType);
		}
	    }
	    otaAirPriceRQ.setPOS(pos);

	    final AirItinerary airItineraryData = airPriceRQData.getAirItinerary();
	    final AirItineraryType airItineraryType = populateAirItinerary(airItineraryData);
	    otaAirPriceRQ.setAirItinerary(airItineraryType);

	    final com.cnk.travelogix.suppliers.air.data.TravelerInfoSummary travelerInfoSummaryData = airPriceRQData.getTravelerInfoSummary();
	    final TravelerInfoSummary travelerInfoSummary = populateTravelerInfoSummary(travelerInfoSummaryData);
	    otaAirPriceRQ.setTravelerInfoSummary(travelerInfoSummary);

	    final UniqueIDType uniqueIDType = new UniqueIDType();
	    if (airPriceRQData.getBookingReferenceID() != null) {
		uniqueIDType.setID(airPriceRQData.getBookingReferenceID().getId());
		otaAirPriceRQ.setBookingReferenceID(uniqueIDType);
	    }
	    otaAirPriceRQWrapper.setOTAAirPriceRQ(otaAirPriceRQ);
	    requestBody.getOTAAirPriceRQWrapper().add(otaAirPriceRQWrapper);
	}
	airInterfaceRQ.setRequestBody(requestBody);
	airInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapper.getRequestHeader()));
	return airInterfaceRQ;
    }

    /**
     * @param airItineraryData
     * @return AirItineraryType
     */
    private AirItineraryType populateAirItinerary(final AirItinerary airItineraryData) {
	OriginDestinationOption originDestOption;
	final AirItineraryType airItineraryType = new AirItineraryType();
	final OriginDestinationOptions originDestOptions = new OriginDestinationOptions();
	final List<com.cnk.travelogix.suppliers.air.data.OriginDestinationOption> originDestOptionsData = airItineraryData.getOriginDestinationOptions();
	for (com.cnk.travelogix.suppliers.air.data.OriginDestinationOption originDestOptionData : originDestOptionsData) {
	    originDestOption = populateFlightSegmentRequest(originDestOptionData);
	    originDestOptions.getOriginDestinationOption().add(originDestOption);
	}

	airItineraryType.setOriginDestinationOptions(originDestOptions);
	airItineraryType.setDirectionInd(AirTripType.fromValue(airItineraryData.getDirectionInd()));
	return airItineraryType;
    }

    /**
     * @param travelerInfoSummaryData
     */
    private TravelerInfoSummary populateTravelerInfoSummary(final com.cnk.travelogix.suppliers.air.data.TravelerInfoSummary travelerInfoSummaryData) {
	AirTravelerType airTraveler;
	TravelerInformationType travelerInformation;
	final TravelerInfoSummary travelerInfoSummary = new TravelerInfoSummary();
	for (TravelerInformation travelerInformationData : travelerInfoSummaryData.getAirTraveler()) {
	    travelerInformation = new TravelerInformationType();
	    PassengerTypeQuantityType paxTypeQuantity;
	    for (PassengerTypeQuantity paxTypeQuantityData : travelerInformationData.getPassengerTypeQuantity()) {
		paxTypeQuantity = new PassengerTypeQuantityType();
		paxTypeQuantity.setCode(paxTypeQuantityData.getCode());
		paxTypeQuantity.setQuantity(paxTypeQuantityData.getQuantity());
		travelerInformation.getPassengerTypeQuantity().add(paxTypeQuantity);
	    }
	    final AirTraveler airTravelerData = travelerInformationData.getAirTraveler();
	    airTraveler = new AirTravelerType();
	    if (airTravelerData != null) {
		airTraveler.setBirthDate(toXMLGregorianCalendar(airTravelerData.getBirthDate()));

		airTraveler.setGender(airTravelerData.getGender());
		airTraveler.setPassengerTypeCode(airTravelerData.getPassengerTypeCode());

		final PersonNameType personName = new PersonNameType();
		final PersonName personNameData = airTravelerData.getPersonName();
		personName.getGivenName().addAll(personNameData.getGivenName());
		personName.setSurname(personNameData.getSurname());
		airTraveler.setPersonName(personName);

		Telephone telephone;
		final List<com.cnk.travelogix.suppliers.air.data.Telephone> telephonesData = airTravelerData.getTelephones();
		for (com.cnk.travelogix.suppliers.air.data.Telephone telephonedata : telephonesData) {
		    telephone = new Telephone();
		    telephone.setCountryAccessCode(telephonedata.getCountryAccessCode());
		    telephone.setPhoneNumber(telephonedata.getPhoneNumber());
		    airTraveler.getTelephone().add(telephone);
		}

		Email email;
		final List<com.cnk.travelogix.suppliers.air.data.Email> emailsData = airTravelerData.getEmails();
		for (com.cnk.travelogix.suppliers.air.data.Email emailData : emailsData) {
		    email = new Email();
		    email.setEmailType(emailData.getEmailType());
		    email.setValue(emailData.getValue());
		    airTraveler.getEmail().add(email);
		}

		Address address;
		final List<com.cnk.travelogix.suppliers.air.data.Address> addressData = airTravelerData.getAddresses();
		for (com.cnk.travelogix.suppliers.air.data.Address addresData : addressData) {
		    address = new Address();
		    address.getAddressLine().addAll(addresData.getAddressLine());
		    address.setCityName(addresData.getCityName());
		    address.setPostalCode(addresData.getPostalCode());

		    final StateProvType stateProv = new StateProvType();
		    final StateProv stateProvData = addresData.getStateProv();
		    stateProv.setValue(stateProvData.getValue());
		    stateProv.setStateCode(stateProvData.getStateCode());
		    address.setStateProv(stateProv);

		    final CountryNameType countryName = new CountryNameType();
		    final CountryName countryNameData = addresData.getCountryName();
		    countryName.setValue(countryNameData.getValue());
		    countryName.setCode(countryNameData.getCode());
		    address.setCountryName(countryName);
		    airTraveler.getAddress().add(address);
		}

		Document document;
		final List<com.cnk.travelogix.suppliers.air.data.Document> documentsData = airTravelerData.getDocuments();
		for (com.cnk.travelogix.suppliers.air.data.Document documentData : documentsData) {
		    document = new Document();
		    document.setDocIssueAuthority(documentData.getDocIssueAuthority());
		    document.setDocIssueLocation(documentData.getDocIssueLocation());
		    document.setDocHolderName(documentData.getDocHolderName());
		    document.setDocHolderNationality(documentData.getDocHolderNationality());
		    document.setDocID(documentData.getDocID());
		    document.setDocType(documentData.getDocType());
		    document.setGender(documentData.getGender());
		    document.setBirthDate(toXMLGregorianCalendar(documentData.getBirthDate()));
		    document.setExpireDate(toXMLGregorianCalendar(documentData.getExpireDate()));
		    document.setEffectiveDate(toXMLGregorianCalendar(documentData.getEffectiveDate()));
		    airTraveler.getDocument().add(document);
		}

		final TravelerRefNumber travelerRefNumber = new TravelerRefNumber();
		final com.cnk.travelogix.suppliers.air.data.TravelerRefNumber travelerRefNumberData = airTravelerData.getTravelerRefNumber();
		travelerRefNumber.setRPH(travelerRefNumberData.getRph());
		airTraveler.setTravelerRefNumber(travelerRefNumber);

		travelerInformation.setAirTraveler(airTraveler);
		travelerInfoSummary.getAirTravelerAvail().add(travelerInformation);
	    }
	}
	if (travelerInfoSummaryData.getSeatsRequested() != null)
	    travelerInfoSummary.getSeatsRequested().addAll(travelerInfoSummaryData.getSeatsRequested());

	final PriceRequestInformation priceRequestInformation = new PriceRequestInformation();
	final com.cnk.travelogix.suppliers.air.data.PriceRequestInformation priceReqInfoData = travelerInfoSummaryData.getPriceRequestInformation();
	if (priceReqInfoData != null)
	    priceRequestInformation.setCurrencyCode(priceReqInfoData.getCurrencyCode());
	travelerInfoSummary.setPriceRequestInformation(priceRequestInformation);

	final TPAExtensions tpaExtensionsData = travelerInfoSummaryData.getTpaExtensions();
	final TPAExtensionsType tpaExtensions = populateTPAExtensions(tpaExtensionsData);
	travelerInfoSummary.setTPAExtensions(tpaExtensions);

	final PaymentDetailType paymentDetail = new PaymentDetailType();
	final PaymentDetail paymentDetailData = travelerInfoSummaryData.getPaymentDetail();
	if (paymentDetailData != null) {
	    final PaymentCard paymentCardData = paymentDetailData.getPaymentCard();
	    PaymentCardType paymentCard = new PaymentCardType();
	    paymentCard.setExpireDate(paymentCardData.getExpireDate());
	    final ListPaymentCardIssuer cardType = new ListPaymentCardIssuer();
	    cardType.setCode(paymentCardData.getCardTypeCode());
	    cardType.setDescription(paymentCardData.getCardTypeDescription());
	    paymentCard.setCardType(cardType);
	    paymentCard.setCardHolderName(paymentCardData.getCardHolderName());
	    final EncryptionTokenType encryptionTokenType = new EncryptionTokenType();
	    encryptionTokenType.setPlainText(paymentCardData.getCardNumber());
	    paymentCard.setCardNumber(encryptionTokenType);
	    paymentDetail.setPaymentCard(paymentCard);
	    travelerInfoSummary.setPaymentDetail(paymentDetail);
	}

	return travelerInfoSummary;
    }

    /**
     * @param tpaExtensionsData
     * @return TPAExtensionsType
     */
    private TPAExtensionsType populateTPAExtensions(final TPAExtensions tpaExtensionsData) {
	final TPAExtensionsType tpaExtensions = getTPAExtensionsType(tpaExtensionsData, NAMESPACE_AIR);

	SeatRequest seatRequest;
	final SeatRequests seatRequests = new SeatRequests();
	if (tpaExtensionsData.getKeyObjectMap() != null) {
	    final com.cnk.travelogix.suppliers.air.data.SeatRequests seatRequestsData = (com.cnk.travelogix.suppliers.air.data.SeatRequests) tpaExtensionsData.getKeyObjectMap()
		    .get(com.cnk.travelogix.suppliers.air.data.SeatRequests.class);
	    final List<com.cnk.travelogix.suppliers.air.data.SeatRequest> seatRequestDataList = seatRequestsData.getSeatRequests();
	    for (com.cnk.travelogix.suppliers.air.data.SeatRequest seatRequestData : seatRequestDataList) {
		seatRequest = new SeatRequest();
		seatRequest.setSeatNumber(seatRequestData.getSeatNumber());
		seatRequest.setRowNumber(seatRequestData.getRowNumber());
		seatRequest.getFlightRefNumberRPHList().addAll(seatRequestData.getFlightRefNumberRPH());
		seatRequest.getTravelerRefNumberRPHList().addAll(seatRequestData.getTravelerRefNumberRPH());
		seatRequests.getSeatRequest().add(seatRequest);
	    }
	    tpaExtensions.getAny().add(getElementFromJaxbObject(seatRequests));
	}

	OtherServiceInformation otherServiceInformation;
	final OtherServiceInformations otherServiceInformations = new OtherServiceInformations();
	if (tpaExtensionsData.getKeyObjectMap() != null) {
	    com.cnk.travelogix.suppliers.air.data.OtherServiceInformations otherServiceInformationsData = (com.cnk.travelogix.suppliers.air.data.OtherServiceInformations) tpaExtensionsData
		    .getKeyObjectMap().get(com.cnk.travelogix.suppliers.air.data.OtherServiceInformations.class);
	    final List<com.cnk.travelogix.suppliers.air.data.OtherServiceInformation> otherServiceInformationDataList = otherServiceInformationsData.getOtherServiceInformations();
	    for (com.cnk.travelogix.suppliers.air.data.OtherServiceInformation otherServiceInformationData : otherServiceInformationDataList) {
		otherServiceInformation = new OtherServiceInformation();
		otherServiceInformation.setRPH(otherServiceInformationData.getRph());
		otherServiceInformation.setOperation(ActionType.fromValue(otherServiceInformationData.getOperation()));
		otherServiceInformations.getOtherServiceInformation().add(otherServiceInformation);
	    }
	    tpaExtensions.getAny().add(getElementFromJaxbObject(otherServiceInformations));
	}

	MealRequestType mealRequest;
	final MealRequests mealRequests = new MealRequests();
	if (tpaExtensionsData.getKeyObjectMap() != null) {
	    com.cnk.travelogix.suppliers.air.data.MealRequests mealRequestsData = (com.cnk.travelogix.suppliers.air.data.MealRequests) tpaExtensionsData.getKeyObjectMap()
		    .get(com.cnk.travelogix.suppliers.air.data.MealRequests.class);
	    final List<MealRequest> mealRequestDataList = mealRequestsData.getMealRequests();
	    for (MealRequest mealRequestData : mealRequestDataList) {
		mealRequest = new MealRequestType();
		mealRequest.setDepartureDate(toXMLGregorianCalendar(mealRequestData.getDepartureDate()));
		mealRequest.setFlightNumber(mealRequestData.getFlightNumber());
		mealRequest.setMealCode(mealRequestData.getMealCode());
		mealRequest.setMealQuantity(mealRequestData.getMealQuantity());
		mealRequest.setFlightRefNumberRPHList(mealRequestData.getFlightRefNumberRPH());
		mealRequest.setTravelerRefNumberRPHList(mealRequestData.getTravelerRefNumberRPH());
		mealRequests.getMealRequest().add(mealRequest);
	    }
	    tpaExtensions.getAny().add(getElementFromJaxbObject(mealRequests));
	}

	BaggageRequestType baggageRequest;
	final BaggageRequests baggageRequests = new BaggageRequests();
	if (tpaExtensionsData.getKeyObjectMap() != null) {
	    com.cnk.travelogix.suppliers.air.data.BaggageRequests baggageRequestsData = (com.cnk.travelogix.suppliers.air.data.BaggageRequests) tpaExtensionsData.getKeyObjectMap()
		    .get(com.cnk.travelogix.suppliers.air.data.BaggageRequests.class);
	    final List<BaggageRequest> baggageRequestDataList = baggageRequestsData.getBaggageRequests();
	    for (BaggageRequest baggageRequestData : baggageRequestDataList) {
		baggageRequest = new BaggageRequestType();
		baggageRequest.setFlightNumber(baggageRequestData.getFlightNumber());
		baggageRequest.setBaggageCode(baggageRequestData.getBaggageCode());
		baggageRequest.setBaggageOndGroupId(baggageRequestData.getBaggageOndGroupId());
		baggageRequest.setFlightRefNumberRPHList(baggageRequestData.getFlightRefNumberRPH());
		baggageRequest.setTravelerRefNumberRPHList(baggageRequestData.getTravelerRefNumberRPH());
		baggageRequests.getBaggageRequest().add(baggageRequest);
	    }
	    tpaExtensions.getAny().add(getElementFromJaxbObject(baggageRequests));
	}
	return tpaExtensions;
    }

    /**
     * @param airInterfaceRS
     * @return AirPriceResponseWrapper
     */
    public AirPriceResponseWrapper fromOTAAirRePriceRS(final AirInterfaceRS airInterfaceRS) {

	final AirPriceResponseWrapper airRePriceResponseWrapper = new AirPriceResponseWrapper();
	AirPriceResponse airPriceResponseData;
	final List<AirPriceResponse> airPriceResponsesData = new ArrayList<>();
	final List<OTAAirPriceRSWrapper> otaAirPriceRSWrapperList = airInterfaceRS.getResponseBody().getOTAAirPriceRSWrapper();
	if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAAirPriceRSWrapper otaAirRePriceRSWrapper : otaAirPriceRSWrapperList) {
		airPriceResponseData = new AirPriceResponse();
		airPriceResponseData.setSequence(otaAirRePriceRSWrapper.getSequence());
		airPriceResponseData.setSupplierID(populateGetSupplierId(otaAirRePriceRSWrapper.getSupplierID()));
		final AirPriceRS airRePriceRSData = new AirPriceRS();
		final OTAAirPriceRS otaAirRePriceRS = otaAirRePriceRSWrapper.getOTAAirPriceRS();
		String supplierId = otaAirRePriceRSWrapper.getSupplierID().getValue();
		airRePriceRSData.setTarget(otaAirRePriceRS.getTarget());
		airRePriceRSData.setTimeStamp(getDateGregorianCalendar(otaAirRePriceRS.getTimeStamp()));
		airRePriceRSData.setVersion(otaAirRePriceRS.getVersion());
		airRePriceRSData.setTransactionIdentifier(otaAirRePriceRS.getTransactionIdentifier());
		airRePriceRSData.setPrimaryLangID(otaAirRePriceRS.getPrimaryLangID());
		airRePriceRSData.setAltLangID(otaAirRePriceRS.getAltLangID());
		if (!hasError(otaAirRePriceRSWrapper.getErrorList())) {
		    final List<Object> successAndWarningsAndPricedItineraries = otaAirRePriceRS.getSuccessAndWarningsAndPricedItineraries();
		    for (Object object : successAndWarningsAndPricedItineraries) {
			if (object instanceof SuccessType) {
			    airRePriceRSData.setSuccess(Boolean.TRUE);
			}
			if (object instanceof UniqueIDType) {
			    final UniqueIDType uniqueIDType = (UniqueIDType) object;
			    final BookingReferenceID bookingReferenceIDData = new BookingReferenceID();
			    bookingReferenceIDData.setId(uniqueIDType.getID());
			    bookingReferenceIDData.setType(uniqueIDType.getType());
			    airRePriceRSData.setBookingReferenceID(bookingReferenceIDData);
			}
			if (object instanceof PricedItinerariesType) {
			    final PricedItinerariesType pricedItinerariesType = (PricedItinerariesType) object;
			    final List<PricedItinerary> pricedItineraries = pricedItinerariesType.getPricedItinerary();
			    final List<com.cnk.travelogix.suppliers.air.data.PricedItinerary> pricedItinerariesData = getPricedItineraryData(pricedItineraries);
			    airRePriceRSData.setPricedItineraries(pricedItinerariesData);
			}
		    }
		    airPriceResponseData.setAirPriceRS(airRePriceRSData);
		}
		airPriceResponseData.setErrors(getErrorsListData(otaAirRePriceRSWrapper.getErrorList(), supplierId));
		airPriceResponsesData.add(airPriceResponseData);
	    }
	}
	airRePriceResponseWrapper.setAirPriceResponses(airPriceResponsesData);
	airRePriceResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));
	airRePriceResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));

	return airRePriceResponseWrapper;
    }
}
