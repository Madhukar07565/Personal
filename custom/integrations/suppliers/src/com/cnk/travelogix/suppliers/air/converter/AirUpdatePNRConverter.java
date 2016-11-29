package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.ActionType;
import org.opentravel.ota._2003._05.AddressType;
import org.opentravel.ota._2003._05.AirArrangerType;
import org.opentravel.ota._2003._05.AirItineraryPricingInfoType.ItinTotalFare;
import org.opentravel.ota._2003._05.AirItineraryPricingInfoType.PTCFareBreakdowns;
import org.opentravel.ota._2003._05.AirItineraryType;
import org.opentravel.ota._2003._05.AirItineraryType.OriginDestinationOptions;
import org.opentravel.ota._2003._05.AirItineraryType.OriginDestinationOptions.OriginDestinationOption;
import org.opentravel.ota._2003._05.AirReservationType;
import org.opentravel.ota._2003._05.AirReservationType.Queues;
import org.opentravel.ota._2003._05.AirReservationType.Queues.Queue;
import org.opentravel.ota._2003._05.AirTravelerType.CustLoyalty;
import org.opentravel.ota._2003._05.AirTravelerType.Email;
import org.opentravel.ota._2003._05.AirTravelerType.FlightSegmentRPHs;
import org.opentravel.ota._2003._05.AirTravelerType.Telephone;
import org.opentravel.ota._2003._05.AirTravelerType.TravelerRefNumber;
import org.opentravel.ota._2003._05.BookingPriceInfoType;
import org.opentravel.ota._2003._05.CompanyNameType;
import org.opentravel.ota._2003._05.CountryNameType;
import org.opentravel.ota._2003._05.EMDType;
import org.opentravel.ota._2003._05.FareInfoType.City;
import org.opentravel.ota._2003._05.FareInfoType.FareInfo.Fare;
import org.opentravel.ota._2003._05.FareInfoType.FareInfo.PTC;
import org.opentravel.ota._2003._05.FareInfoType.RuleInfo;
import org.opentravel.ota._2003._05.FareType.FareBaggageAllowance;
import org.opentravel.ota._2003._05.FareType.OriginalIssueInfo;
import org.opentravel.ota._2003._05.FareType.TotalFare;
import org.opentravel.ota._2003._05.FormattedTextTextType;
import org.opentravel.ota._2003._05.FulfillmentType;
import org.opentravel.ota._2003._05.FulfillmentType.PaymentDetails;
import org.opentravel.ota._2003._05.FulfillmentType.PaymentDetails.PaymentDetail;
import org.opentravel.ota._2003._05.OTAAirBookModifyRQ;
import org.opentravel.ota._2003._05.OTAAirBookModifyRQ.AirBookModifyRQ;
import org.opentravel.ota._2003._05.OTAAirBookRS;
import org.opentravel.ota._2003._05.OTAAirBookRS.AirReservation;
import org.opentravel.ota._2003._05.OperatingAirlineType;
import org.opentravel.ota._2003._05.OriginDestinationOptionType.FlightSegment;
import org.opentravel.ota._2003._05.PTCFareBreakdownType;
import org.opentravel.ota._2003._05.PTCFareBreakdownType.Endorsements;
import org.opentravel.ota._2003._05.PTCFareBreakdownType.Endorsements.Endorsement;
import org.opentravel.ota._2003._05.PTCFareBreakdownType.FareBasisCodes;
import org.opentravel.ota._2003._05.PTCFareBreakdownType.FareInfo;
import org.opentravel.ota._2003._05.PTCFareBreakdownType.PassengerFare;
import org.opentravel.ota._2003._05.PassengerTypeQuantityType;
import org.opentravel.ota._2003._05.PaymentCardType;
import org.opentravel.ota._2003._05.PaymentDetailType.PaymentAmount;
import org.opentravel.ota._2003._05.PaymentFormType.LoyaltyRedemption;
import org.opentravel.ota._2003._05.PersonNameType;
import org.opentravel.ota._2003._05.RuleInfoType.ChargesRules;
import org.opentravel.ota._2003._05.SourceType.RequestorID;
import org.opentravel.ota._2003._05.SpecialReqDetailsType;
import org.opentravel.ota._2003._05.SpecialReqDetailsType.SeatRequests;
import org.opentravel.ota._2003._05.SpecialReqDetailsType.SeatRequests.SeatRequest;
import org.opentravel.ota._2003._05.SpecialReqDetailsType.SpecialServiceRequests.SpecialServiceRequest;
import org.opentravel.ota._2003._05.StateProvType;
import org.opentravel.ota._2003._05.SuccessType;
import org.opentravel.ota._2003._05.TPAExtensionsType;
import org.opentravel.ota._2003._05.TicketType;
import org.opentravel.ota._2003._05.TicketingInfoType;
import org.opentravel.ota._2003._05.TravelerInfoType;
import org.opentravel.ota._2003._05.TravelerInfoType.AirTraveler;
import org.opentravel.ota._2003._05.UniqueIDType;
import org.opentravel.ota._2003._05.VoluntaryChangesType;
import org.opentravel.ota._2003._05.VoluntaryChangesType.Penalty;
import org.opentravel.ota._2003._05.WarningsType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cnk.travelogix.suppliers.air.data.Address;
import com.cnk.travelogix.suppliers.air.data.AirBookModify;
import com.cnk.travelogix.suppliers.air.data.AirBookModifyRequest;
import com.cnk.travelogix.suppliers.air.data.AirBookModifyRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirBookRS;
import com.cnk.travelogix.suppliers.air.data.AirBookResponse;
import com.cnk.travelogix.suppliers.air.data.AirBookResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirItinerary;
import com.cnk.travelogix.suppliers.air.data.BookingPriceInfo;
import com.cnk.travelogix.suppliers.air.data.BookingReferenceID;
import com.cnk.travelogix.suppliers.air.data.CompanyName;
import com.cnk.travelogix.suppliers.air.data.CountryName;
import com.cnk.travelogix.suppliers.air.data.Document;
import com.cnk.travelogix.suppliers.air.data.FareBasisCodeType;
import com.cnk.travelogix.suppliers.air.data.FormattedTextType;
import com.cnk.travelogix.suppliers.air.data.Fulfillment;
import com.cnk.travelogix.suppliers.air.data.OperatingAirline;
import com.cnk.travelogix.suppliers.air.data.PTCFareBreakdown;
import com.cnk.travelogix.suppliers.air.data.PassengerTypeQuantity;
import com.cnk.travelogix.suppliers.air.data.PaymentCard;
import com.cnk.travelogix.suppliers.air.data.PersonName;
import com.cnk.travelogix.suppliers.air.data.ProfileRef;
import com.cnk.travelogix.suppliers.air.data.SpecialReqDetail;
import com.cnk.travelogix.suppliers.air.data.SpecialServiceRequests;
import com.cnk.travelogix.suppliers.air.data.StateProv;
import com.cnk.travelogix.suppliers.air.data.TicketingInfo;
import com.cnk.travelogix.suppliers.air.data.TravelerInfo;
import com.cnk.travelogix.suppliers.air.data.UniqueID;
import com.cnk.travelogix.suppliers.common.data.SourceType;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
import com.coxandkings.integ.suppl.air.OTAAirBookModifyRQWrapper;
import com.coxandkings.integ.suppl.air.OTAAirBookRSWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;

/**
 * Converter for AirUpdatePNRConverter
 */
public class AirUpdatePNRConverter extends AirBaseConverter {

    private static final Logger LOG = LoggerFactory.getLogger(AirUpdatePNRConverter.class);

    /**
     * @param requestWrappeer
     * @return airInterfaceRQ
     */
    public AirInterfaceRQ toOTAAirBookModifyRQ(final AirBookModifyRequestWrapper requestWrappeer) {
	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	final AirBookModifyRequest airBookModifyRequestData = requestWrappeer.getAirBookModifyRequest();
	OTAAirBookModifyRQWrapper oTAAirBookModifyRQWrapper = new OTAAirBookModifyRQWrapper();
	if (airBookModifyRequestData != null) {
	    if (airBookModifyRequestData.getSequence() != null)
		oTAAirBookModifyRQWrapper.setSequence(airBookModifyRequestData.getSequence());
	    com.cnk.travelogix.suppliers.air.data.AirBookModifyRQ airBookModifyRq = airBookModifyRequestData.getAirBookModifyRQ();
	    OTAAirBookModifyRQ otaAirBookModifyRQ = new OTAAirBookModifyRQ();
	    org.opentravel.ota._2003._05.POSType posType = new org.opentravel.ota._2003._05.POSType();
	    if (airBookModifyRq.getPos().getSource() != null) {
		for (SourceType sourceT : airBookModifyRq.getPos().getSource()) {
		    org.opentravel.ota._2003._05.SourceType otaSourceType = new org.opentravel.ota._2003._05.SourceType();
		    RequestorID otaReqId = new RequestorID();
		    otaReqId.setType(sourceT.getRequestorID().getType());
		    otaSourceType.setRequestorID(otaReqId);
		    otaSourceType.setPseudoCityCode(sourceT.getPseudoCityCode());
		    otaSourceType.setAgentDutyCode(sourceT.getAgentDutyCode());
		    posType.getSource().add(otaSourceType);
		}
	    }

	    otaAirBookModifyRQ.setPOS(posType);
	    otaAirBookModifyRQ.setVersion(airBookModifyRq.getVersion());
	    if (airBookModifyRq.getTimeStamp() != null) {
		otaAirBookModifyRQ.setTimeStamp(toXMLGregorianCalendar(airBookModifyRq.getTimeStamp()));
	    }
	    otaAirBookModifyRQ.setTarget(airBookModifyRq.getTarget());
	    otaAirBookModifyRQ.setAirBookModifyRQ(populateAirBookModifyRequest(airBookModifyRq.getAirBookModify()));

	    AirReservationType airReservationType = populateAirReservationRequest(airBookModifyRq.getAirReservation());
	    otaAirBookModifyRQ.setAirReservation(airReservationType);

	    oTAAirBookModifyRQWrapper.setOTAAirBookModifyRQ(otaAirBookModifyRQ);
	}
	requestBody.getOTAAirBookModifyRQWrapper().add(oTAAirBookModifyRQWrapper);
	airInterfaceRQ.setRequestBody(requestBody);
	airInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrappeer.getRequestHeader()));

	return airInterfaceRQ;
    }

    private AirBookModifyRQ populateAirBookModifyRequest(AirBookModify airBookModify) {
	AirBookModifyRQ airBookModifyRQ = new AirBookModifyRQ();
	airBookModifyRQ.setModificationType(airBookModify.getModificationType());

	Fulfillment fulfillmentData = airBookModify.getFulfillment();
	FulfillmentType fulfillmentType = new FulfillmentType();
	if (fulfillmentData != null) {
	    com.cnk.travelogix.suppliers.air.data.PaymentDetails paymentDetailData = fulfillmentData.getPaymentDetails();
	    List<com.cnk.travelogix.suppliers.air.data.PaymentDetail> paymentDetailsListData = paymentDetailData.getPaymentDetail();
	    PaymentDetails paymentDetails = new PaymentDetails();
	    for (com.cnk.travelogix.suppliers.air.data.PaymentDetail paymentDetail : paymentDetailsListData) {
		PaymentDetail otaPaymentDetail = new PaymentDetail();
		com.cnk.travelogix.suppliers.air.data.LoyaltyRedemption loyaltyRedemptionData = paymentDetail.getLoyaltyRedemption();
		LoyaltyRedemption loyaltyRedemption = new LoyaltyRedemption();
		loyaltyRedemption.setPromotionCode(loyaltyRedemptionData.getPromotionCode());
		otaPaymentDetail.setLoyaltyRedemption(loyaltyRedemption);
		paymentDetails.getPaymentDetail().add(otaPaymentDetail);
	    }
	    fulfillmentType.setPaymentDetails(paymentDetails);
	}
	airBookModifyRQ.setFulfillment(fulfillmentType);

	TravelerInfo travelerInfoTypeData = airBookModify.getTravelerInfo();
	TravelerInfoType otaTravelerInfoType = new TravelerInfoType();
	List<com.cnk.travelogix.suppliers.air.data.AirTraveler> airTravelersinfoData = travelerInfoTypeData.getAirTravelers();
	for (com.cnk.travelogix.suppliers.air.data.AirTraveler airTraveler : airTravelersinfoData) {
	    AirTraveler otaAirtraveler = new AirTraveler();
	    if (airTraveler.getBirthDate() != null) {
		otaAirtraveler.setBirthDate(toXMLGregorianCalendar(airTraveler.getBirthDate()));
	    }
	    otaAirtraveler.setGender(airTraveler.getGender());
	    otaAirtraveler.setProfileRef(populateAirTraveler(airTraveler.getProfileRef()));
	    com.cnk.travelogix.suppliers.air.data.TravelerRefNumber travelerRefNumberData = airTraveler.getTravelerRefNumber();
	    TravelerRefNumber travelerRefNumber = new TravelerRefNumber();
	    travelerRefNumber.setRPH(travelerRefNumberData.getRph());
	    otaAirtraveler.setTravelerRefNumber(travelerRefNumber);

	    List<PassengerTypeQuantityType> passengerTypeQuantityTypes = populatePassengerTypeQuantity(airTraveler.getPassengerTypeQuantity());
	    for (PassengerTypeQuantityType passengerTypeQuantityType : passengerTypeQuantityTypes) {
		otaAirtraveler.setPassengerTypeQuantity(passengerTypeQuantityType);
	    }

	    List<Address> addressData = airTraveler.getAddresses();
	    org.opentravel.ota._2003._05.AirTravelerType.Address addressType = new org.opentravel.ota._2003._05.AirTravelerType.Address();
	    for (Address address : addressData) {
		addressType.getAddressLine().addAll(address.getAddressLine());
		addressType.setCityName(address.getCityName());
		addressType.setPostalCode(address.getPostalCode());
		StateProv stateProvData = address.getStateProv();
		StateProvType stateProvType = new StateProvType();
		stateProvType.setValue(stateProvData.getValue());
		stateProvType.setStateCode(stateProvData.getStateCode());
		addressType.setStateProv(stateProvType);

		CountryName countryNameData = address.getCountryName();
		CountryNameType countryNameType = new CountryNameType();
		countryNameType.setCode(countryNameData.getCode());
		countryNameType.setValue(countryNameData.getValue());
		addressType.setCountryName(countryNameType);

		otaAirtraveler.getAddress().add(addressType);
	    }

	    otaAirtraveler.getTelephone().addAll(populateTelephoneRequest(airTraveler.getTelephones()));
	    otaAirtraveler.getDocument().addAll(populateDocumetRequest(airTraveler.getDocuments()));

	    List<com.cnk.travelogix.suppliers.air.data.Email> emailsData = airTraveler.getEmails();
	    for (com.cnk.travelogix.suppliers.air.data.Email email : emailsData) {
		Email otaEmail = new Email();
		otaEmail.setEmailType(email.getEmailType());
		otaEmail.setValue(email.getValue());
		otaAirtraveler.getEmail().add(otaEmail);
	    }

	    otaAirtraveler.setPersonName(populatePersonNameRequest(airTraveler.getPersonName()));
	    otaTravelerInfoType.getAirTraveler().add(otaAirtraveler);
	    airBookModifyRQ.setTravelerInfo(otaTravelerInfoType);
	}
	final AirItineraryType airItineraryType = new AirItineraryType();
	final AirItinerary airItineraryData = airBookModify.getAirItinerary();
	final List<com.cnk.travelogix.suppliers.air.data.OriginDestinationOption> originDestOptionsData = airItineraryData.getOriginDestinationOptions();
	final OriginDestinationOptions originDestOptions = populateOriginDestinationOption(originDestOptionsData);
	airItineraryType.setOriginDestinationOptions(originDestOptions);
	airBookModifyRQ.setAirItinerary(airItineraryType);
	airBookModifyRQ.getBookingReferenceID().addAll(populateBookingRef(airBookModify.getBookingReferenceId()));
	return airBookModifyRQ;
    }

    /**
     * @param documentsData
     * @return otaDocuments
     */
    public List<org.opentravel.ota._2003._05.AirTravelerType.Document> populateDocumetRequest(List<Document> documentsData) {
	List<org.opentravel.ota._2003._05.AirTravelerType.Document> otaDocuments = new ArrayList<>();
	for (Document document : documentsData) {
	    org.opentravel.ota._2003._05.AirTravelerType.Document otaDocument = new org.opentravel.ota._2003._05.AirTravelerType.Document();
	    otaDocument.setDocID(document.getDocID());
	    otaDocument.setDocType(document.getDocType());
	    otaDocument.setDocHolderNationality(document.getDocHolderNationality());
	    otaDocuments.add(otaDocument);
	}
	return otaDocuments;
    }

    private AirReservationType populateAirReservationRequest(com.cnk.travelogix.suppliers.air.data.AirReservation airReservation) {
	AirReservationType airReservationType = new AirReservationType();
	if (airReservation != null) {
	    List<TicketingInfo> ticketingInfoData = airReservation.getTicketingInfos();
	    for (TicketingInfo ticketingInfo : ticketingInfoData) {
		TicketingInfoType ticketingInfoType = new TicketingInfoType();
		if (ticketingInfo.getTicketTimeLimit() != null) {
		    ticketingInfoType.setTicketTimeLimit(toXMLGregorianCalendar(ticketingInfo.getTicketTimeLimit()));
		}
		ticketingInfoType.setTicketType(TicketType.valueOf(ticketingInfo.getTicketType()));
		airReservationType.getTicketing().add(ticketingInfoType);
	    }

	    List<com.cnk.travelogix.suppliers.air.data.Queue> queuesData = airReservation.getQueues();
	    Queues queues = new Queues();
	    for (com.cnk.travelogix.suppliers.air.data.Queue queue : queuesData) {
		Queue otaQueue = new Queue();
		otaQueue.setQueueNumber(queue.getQueueNumber());
		queues.getQueue().add(otaQueue);
	    }
	    airReservationType.setQueues(queues);

	    TravelerInfo travelerInfoTypeData = airReservation.getTravelerInfo();
	    TravelerInfoType otaTravelerInfoType = populateTravellerInfo(travelerInfoTypeData);
	    airReservationType.setTravelerInfo(otaTravelerInfoType);

	    FormattedTextType formattedTextType = airReservation.getComment();
	    FormattedTextTextType formattedTextTextType = new FormattedTextTextType();
	    formattedTextTextType.setTextFormat(formattedTextType.getTextFormat());
	    airReservationType.setComment(formattedTextTextType);

	    final AirItineraryType airItineraryType = new AirItineraryType();
	    final AirItinerary airItineraryData = airReservation.getAirItinerary();
	    final List<com.cnk.travelogix.suppliers.air.data.OriginDestinationOption> originDestOptionsData = airItineraryData.getOriginDestinationOptions();
	    final OriginDestinationOptions originDestOptions = populateOriginDestinationOption(originDestOptionsData);
	    airItineraryType.setOriginDestinationOptions(originDestOptions);

	    airItineraryType.setAirItineraryRPH(airItineraryData.getAirItineraryRPH());
	    airReservationType.setAirItinerary(airItineraryType);
	    airReservationType.getBookingReferenceID().addAll(populateBookingRef(airReservation.getBookingReferenceIds()));

	}
	return airReservationType;
    }

    /**
     * @param travelerInfoTypeData
     * @return otaTravelerInfoType
     */
    private TravelerInfoType populateTravellerInfo(TravelerInfo travelerInfoTypeData) {
	TravelerInfoType otaTravelerInfoType = new TravelerInfoType();
	List<com.cnk.travelogix.suppliers.air.data.AirTraveler> airTravelersinfoData = travelerInfoTypeData.getAirTravelers();
	for (com.cnk.travelogix.suppliers.air.data.AirTraveler airTraveler : airTravelersinfoData) {
	    AirTraveler otaAirtraveler = new AirTraveler();
	    otaAirtraveler.setProfileRef(populateAirTraveler(airTraveler.getProfileRef()));

	    CustLoyalty otaCustLoyalty;
	    List<com.cnk.travelogix.suppliers.air.data.CustLoyalty> custLoyaltiesData = airTraveler.getCustLoyalty();
	    for (com.cnk.travelogix.suppliers.air.data.CustLoyalty custLoyaltyData : custLoyaltiesData) {
		otaCustLoyalty = new CustLoyalty();
		otaCustLoyalty.setProgramID(custLoyaltyData.getProgramID());
		otaCustLoyalty.setMembershipID(custLoyaltyData.getMembershipID());
		otaCustLoyalty.setRPH(custLoyaltyData.getRph());
		otaAirtraveler.getCustLoyalty().add(otaCustLoyalty);
	    }
	    otaAirtraveler.setPersonName(populatePersonNameRequest(airTraveler.getPersonName()));

	    List<PassengerTypeQuantity> passengerTypeQuantityData = airTraveler.getPassengerTypeQuantity();
	    for (PassengerTypeQuantity passengerTypeQuantity : passengerTypeQuantityData) {
		PassengerTypeQuantityType passengerTypeQuantityType = new PassengerTypeQuantityType();
		passengerTypeQuantityType.setCode(passengerTypeQuantity.getCode());
		otaAirtraveler.setPassengerTypeQuantity(passengerTypeQuantityType);
	    }
	    List<com.cnk.travelogix.suppliers.air.data.Email> emailsData = airTraveler.getEmails();
	    for (com.cnk.travelogix.suppliers.air.data.Email email : emailsData) {
		Email otaEmail = new Email();
		otaEmail.setEmailType(email.getEmailType());
		otaEmail.setValue(email.getValue());
		otaAirtraveler.getEmail().add(otaEmail);
	    }
	    otaAirtraveler.getTelephone().addAll(populateTelephoneRequest(airTraveler.getTelephones()));
	    otaTravelerInfoType.getAirTraveler().add(otaAirtraveler);
	}

	List<SpecialReqDetail> specialReqDetailsData = travelerInfoTypeData.getSpecialReqDetails();
	for (SpecialReqDetail specialReqDetail : specialReqDetailsData) {
	    SpecialReqDetailsType specialReqDetailsType = new SpecialReqDetailsType();
	    List<com.cnk.travelogix.suppliers.air.data.SeatRequest> seatRequestData = specialReqDetail.getSeatRequests();
	    SeatRequests seatRequests = new SeatRequests();
	    for (com.cnk.travelogix.suppliers.air.data.SeatRequest seatRequest : seatRequestData) {
		SeatRequest otaSeatRequest = new SeatRequest();
		otaSeatRequest.setSeatNumber(seatRequest.getSeatNumber());
		otaSeatRequest.getFlightRefNumberRPHList().addAll(seatRequest.getFlightRefNumberRPH());
		seatRequests.getSeatRequest().add(otaSeatRequest);
	    }
	    specialReqDetailsType.setSeatRequests(seatRequests);

	    SpecialServiceRequests specialServiceRequestsData = specialReqDetail.getSpecialServiceRequests();

	    org.opentravel.ota._2003._05.SpecialReqDetailsType.SpecialServiceRequests otaSpecialServiceRequests = new org.opentravel.ota._2003._05.SpecialReqDetailsType.SpecialServiceRequests();
	    List<com.cnk.travelogix.suppliers.air.data.SpecialServiceRequest> specialServiceRequests = specialServiceRequestsData.getSpecialServiceRequest();
	    for (com.cnk.travelogix.suppliers.air.data.SpecialServiceRequest specialServiceRequest : specialServiceRequests) {
		SpecialServiceRequest otaServiceRequest = new SpecialServiceRequest();
		otaServiceRequest.getTravelerRefNumberRPHList().add(specialServiceRequest.getTravelerRefNumberRPHList().toString());

		CompanyNameType companyNameType = new CompanyNameType();
		CompanyName companyNameData = specialServiceRequest.getAirline();
		companyNameType.setCode(companyNameData.getCode());
		otaServiceRequest.setAirline(companyNameType);
		otaSpecialServiceRequests.getSpecialServiceRequest().add(otaServiceRequest);
	    }
	    specialReqDetailsType.setSpecialServiceRequests(otaSpecialServiceRequests);
	    otaTravelerInfoType.getSpecialReqDetails().add(specialReqDetailsType);
	}
	return otaTravelerInfoType;
    }

    /**
     * @param telephones
     * @return otaTelephone
     */
    public List<Telephone> populateTelephoneRequest(List<com.cnk.travelogix.suppliers.air.data.Telephone> telephones) {
	Telephone otaTelephone;
	List<Telephone> otaTelephones = new ArrayList<>();
	for (com.cnk.travelogix.suppliers.air.data.Telephone telephoneData : telephones) {
	    otaTelephone = new Telephone();
	    otaTelephone.setPhoneNumber(telephoneData.getPhoneNumber());
	    otaTelephone.setLocationCode(telephoneData.getLocationCode());
	    otaTelephone.setPhoneUseType(telephoneData.getPhoneUseType());
	    otaTelephone.setCountryAccessCode(telephoneData.getCountryAccessCode());
	    otaTelephone.setRPH(telephoneData.getRph());
	    otaTelephones.add(otaTelephone);
	}
	return otaTelephones;
    }

    private PersonNameType populatePersonNameRequest(PersonName personNameData) {
	PersonNameType personNameType = new PersonNameType();
	personNameType.getGivenName().addAll(personNameData.getGivenName());
	personNameType.getNamePrefix().addAll(personNameData.getNamePrefix());
	personNameType.getMiddleName().addAll(personNameData.getMiddleName());
	personNameType.setSurname(personNameData.getSurname());
	return personNameType;
    }

    /**
     * @param listBookRefIData
     * @return otaBookingRefList
     */
    public List<org.opentravel.ota._2003._05.AirReservationType.BookingReferenceID> populateBookingRef(List<BookingReferenceID> listBookRefIData) {
	List<org.opentravel.ota._2003._05.AirReservationType.BookingReferenceID> otaBookingRefList = new ArrayList<>();
	org.opentravel.ota._2003._05.AirReservationType.BookingReferenceID otaBookingReferenceID;
	for (BookingReferenceID bookingReferenceID : listBookRefIData) {
	    otaBookingReferenceID = new org.opentravel.ota._2003._05.AirReservationType.BookingReferenceID();
	    otaBookingReferenceID.setID(bookingReferenceID.getId());
	    otaBookingReferenceID.setIDContext(bookingReferenceID.getIdContext());
	    otaBookingReferenceID.setType(bookingReferenceID.getType());
	    TPAExtensions tpaExtensionsData = bookingReferenceID.getTpaExtensions();
	    if (tpaExtensionsData != null) {
		final TPAExtensionsType tpaExtensionsType = getTPAExtensionsType(tpaExtensionsData, NAMESPACE_AIR);
		otaBookingReferenceID.setTPAExtensions(tpaExtensionsType);
	    }
	    otaBookingRefList.add(otaBookingReferenceID);
	}
	return otaBookingRefList;
    }

    private org.opentravel.ota._2003._05.AirTravelerType.ProfileRef populateAirTraveler(ProfileRef profileRefData) {
	org.opentravel.ota._2003._05.AirTravelerType.ProfileRef profileRef = null;
	if (profileRefData != null) {
	    profileRef = new org.opentravel.ota._2003._05.AirTravelerType.ProfileRef();
	    org.opentravel.ota._2003._05.UniqueIDType otaUniqueIdType = new org.opentravel.ota._2003._05.UniqueIDType();
	    com.cnk.travelogix.suppliers.air.data.UniqueID uniqueIDTypeData = profileRefData.getUniqueID();
	    otaUniqueIdType.setID(uniqueIDTypeData.getId());
	    otaUniqueIdType.setType(uniqueIDTypeData.getType());
	    profileRef.setUniqueID(otaUniqueIdType);
	}
	return profileRef;
    }

    /**
     * Response
     * 
     * @param airInterfaceRS
     * @return airBookResponseWrapper
     */
    public AirBookResponseWrapper fromOTAAirBookModifyRS(AirInterfaceRS airInterfaceRS) {
	final AirBookResponseWrapper airBookResponseWrapper = new AirBookResponseWrapper();
	AirBookResponse airBookResponseData;
	final List<AirBookResponse> airBookResponsesData = new ArrayList<>();
	final List<OTAAirBookRSWrapper> otaAirBookRSWrapperList = airInterfaceRS.getResponseBody().getOTAAirBookRSWrapper();
	if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAAirBookRSWrapper otaAirBookRSWrapper : otaAirBookRSWrapperList) {
		airBookResponseData = new AirBookResponse();
		airBookResponseData.setSequence(otaAirBookRSWrapper.getSequence());
		String supplierId = otaAirBookRSWrapper.getSupplierID().getValue();
		if (!hasError(otaAirBookRSWrapper.getErrorList())) {
		    final AirBookRS airBookRSData = new AirBookRS();
		    final OTAAirBookRS otaAirBookRS = otaAirBookRSWrapper.getOTAAirBookRS();
		    airBookRSData.setVersion(otaAirBookRS.getVersion());
		    airBookRSData.setTransactionStatusCode(otaAirBookRS.getTransactionStatusCode());
		    final List<Object> successAndWarningsAndAirReservation = otaAirBookRS.getSuccessAndWarningsAndAirReservation();
		    for (Object object : successAndWarningsAndAirReservation) {
			if (object instanceof SuccessType) {
			    final SuccessType successType = (SuccessType) object;
			    LOG.debug("SuccessType::{}", successType);
			} else if (object instanceof WarningsType) {
			    final WarningsType warningsType = (WarningsType) object;
			    List<com.cnk.travelogix.suppliers.air.data.Warning> warningTypes = populateWarningType(warningsType.getWarning());
			    airBookRSData.setWarnings(warningTypes);
			} else if (object instanceof AirReservation) {
			    final AirReservation airReservation = (AirReservation) object;
			    com.cnk.travelogix.suppliers.air.data.AirReservation airReservationData = populateAirReservationResponse(airReservation);
			    airBookRSData.setAirReservation(airReservationData);
			}
		    }
		    airBookRSData.setErrors(getErrorsData(otaAirBookRS.getErrors(), supplierId));
		    airBookResponseData.setAirBookRS(airBookRSData);
		}
		airBookResponseData.setErrors(getErrorsListData(otaAirBookRSWrapper.getErrorList(), supplierId));
		airBookResponsesData.add(airBookResponseData);
	    }
	}
	airBookResponseWrapper.setAirBookResponses(airBookResponsesData);
	airBookResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));
	airBookResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));

	return airBookResponseWrapper;
    }

    private com.cnk.travelogix.suppliers.air.data.AirReservation populateAirReservationResponse(AirReservation airReservation) {
	com.cnk.travelogix.suppliers.air.data.AirReservation airReservationData = new com.cnk.travelogix.suppliers.air.data.AirReservation();
	airReservationData.setCreateDateTime(getStringAsDate(airReservation.getCreateDateTime()));
	airReservationData.setLastModified(getStringAsDate(airReservation.getLastModified()));

	AirItinerary airItineraryData = populateAirItineraryResponse(airReservation.getAirItinerary());
	airReservationData.setAirItinerary(airItineraryData);

	com.cnk.travelogix.suppliers.air.data.BookingPriceInfo bookingPriceInfoData = getBookingPriceInfoData(airReservation.getPriceInfo());
	airReservationData.setPriceInfo(bookingPriceInfoData);

	TravelerInfo travelerInfoData = populateTravelInfoResponse(airReservation.getTravelerInfo());
	airReservationData.setTravelerInfo(travelerInfoData);

	com.cnk.travelogix.suppliers.air.data.AirArrangerType airArrangerTypeData = populateArrangeTypeResponse(airReservation.getArrangerInfo());
	airReservationData.setArrangerInfo(airArrangerTypeData);

	Fulfillment fulfillmentData = populateFulfilmentResponse(airReservation.getFulfillment());
	airReservationData.setFulfillment(fulfillmentData);

	List<com.cnk.travelogix.suppliers.air.data.EMDType> emdTypesData = populateEMDTypesResponse(airReservation.getEMDInfo());
	airReservationData.setEmdInfo(emdTypesData);

	List<BookingReferenceID> bookingReferenceIDsData = populateBookingReferenceIdsResponse(airReservation.getBookingReferenceID());
	airReservationData.setBookingReferenceIds(bookingReferenceIDsData);
	return airReservationData;
    }

    private BookingPriceInfo getBookingPriceInfoData(BookingPriceInfoType otaBookingPriceInfo) {
	List<ItinTotalFare> otaItinTotalFarelist = otaBookingPriceInfo.getItinTotalFare();
	com.cnk.travelogix.suppliers.air.data.BookingPriceInfo bookingPriceInfoData = new com.cnk.travelogix.suppliers.air.data.BookingPriceInfo();

	List<com.cnk.travelogix.suppliers.air.data.ItinTotalFare> itinTotalFareListData = new ArrayList<>();
	for (ItinTotalFare otaItinTotalFare : otaItinTotalFarelist) {
	    com.cnk.travelogix.suppliers.air.data.ItinTotalFare itinTotalFareData = new com.cnk.travelogix.suppliers.air.data.ItinTotalFare();
	    itinTotalFareData.setBaseFare(getBaseFareData(otaItinTotalFare.getBaseFare()));
	    itinTotalFareData.setEquivFares(getEquivFaresData(otaItinTotalFare.getEquivFare()));

	    PTCFareBreakdowns otaPTCBreakDowns = otaBookingPriceInfo.getPTCFareBreakdowns();
	    List<PTCFareBreakdownType> otaPTCBreakDownsList = otaPTCBreakDowns.getPTCFareBreakdown();
	    List<PTCFareBreakdown> ptcFareBreakdownsListData = new ArrayList<>();
	    for (PTCFareBreakdownType otaPTCFareBreakdown : otaPTCBreakDownsList) {
		PTCFareBreakdown ptcFareBreakdownData = populateGetPtcFareBreakDownData(otaItinTotalFare, itinTotalFareData, otaPTCFareBreakdown);
		ptcFareBreakdownsListData.add(ptcFareBreakdownData);
		// No attributes for passenger fare
	    }
	    List<FareBaggageAllowance> otaFareBaggageAllowances = otaItinTotalFare.getFareBaggageAllowance();
	    List<com.cnk.travelogix.suppliers.air.data.FareBaggageAllowance> fareBaggageAllowancesData = new ArrayList<>();
	    com.cnk.travelogix.suppliers.air.data.FareBaggageAllowance fareBaggageAllowanceData;
	    for (FareBaggageAllowance fareBaggageAllowance : otaFareBaggageAllowances) {
		fareBaggageAllowanceData = new com.cnk.travelogix.suppliers.air.data.FareBaggageAllowance();
		fareBaggageAllowanceData.setUnitOfMeasureQuantity(fareBaggageAllowance.getUnitOfMeasureQuantity());
		fareBaggageAllowanceData.setUnitOfMeasure(fareBaggageAllowance.getUnitOfMeasure());
		fareBaggageAllowancesData.add(fareBaggageAllowanceData);
	    }
	    itinTotalFareData.setFareBaggageAllowance(fareBaggageAllowancesData);
	    itinTotalFareListData.add(itinTotalFareData);
	    bookingPriceInfoData.setPtcFareBreakdowns(ptcFareBreakdownsListData);
	    bookingPriceInfoData.setItinTotalFares(itinTotalFareListData);
	}
	return bookingPriceInfoData;
    }

    /**
     * @param otaItinTotalFare
     * @param itinTotalFareData
     * @param otaPTCFareBreakdown
     * @return populateBookingProceInfoResponse
     */
    private PTCFareBreakdown populateGetPtcFareBreakDownData(ItinTotalFare otaItinTotalFare, com.cnk.travelogix.suppliers.air.data.ItinTotalFare itinTotalFareData,
	    PTCFareBreakdownType otaPTCFareBreakdown) {
	PTCFareBreakdown ptcFareBreakdownData = new PTCFareBreakdown();
	ptcFareBreakdownData.setPricingSource(otaPTCFareBreakdown.getPricingSource().toString());

	TotalFare otaTotalFare = otaItinTotalFare.getTotalFare();
	com.cnk.travelogix.suppliers.air.data.TotalFare totalFareData = new com.cnk.travelogix.suppliers.air.data.TotalFare();

	totalFareData.setAmount(otaTotalFare.getAmount());
	totalFareData.setCurrencyCode(otaTotalFare.getCurrencyCode());
	itinTotalFareData.setTotalFare(totalFareData);

	//no attributes for  passengerFare
	com.cnk.travelogix.suppliers.air.data.OriginalIssueInfo originalIssueInfoData = new com.cnk.travelogix.suppliers.air.data.OriginalIssueInfo();
	OriginalIssueInfo otaOriginalIssueInfo = otaItinTotalFare.getOriginalIssueInfo();
	originalIssueInfoData.setDateOfIssue(getDateGregorianCalendar(otaOriginalIssueInfo.getDateOfIssue()));
	originalIssueInfoData.setIssuingAirlineCode(otaOriginalIssueInfo.getIssuingAirlineCode());
	itinTotalFareData.setOriginalIssueInfo(originalIssueInfoData);

	FareBasisCodes fareBasisCodes = otaPTCFareBreakdown.getFareBasisCodes();
	List<FareBasisCodeType> fareBasisCodeTypesData = new ArrayList<>();
	List<org.opentravel.ota._2003._05.FareBasisCodeType> fareBasisCodesList = fareBasisCodes.getFareBasisCode();
	for (org.opentravel.ota._2003._05.FareBasisCodeType fareBasisCodeType : fareBasisCodesList) {
	    FareBasisCodeType fareBasisCodeTypeData = new FareBasisCodeType();
	    fareBasisCodeTypeData.setNotValidBefore(getDateGregorianCalendar(fareBasisCodeType.getNotValidAfter()));
	    fareBasisCodeTypeData.setFlightSegmentRPH(fareBasisCodeType.getFlightSegmentRPH());
	    fareBasisCodeTypesData.add(fareBasisCodeTypeData);
	}
	ptcFareBreakdownData.setFareBasisCodeTypes(fareBasisCodeTypesData);

	List<PassengerFare> passengerFares = otaPTCFareBreakdown.getPassengerFare();
	List<com.cnk.travelogix.suppliers.air.data.PassengerFare> passengerFaresData = new ArrayList<>();
	for (PassengerFare passengerFare : passengerFares) {
	    com.cnk.travelogix.suppliers.air.data.PassengerFare passengerFareData = new com.cnk.travelogix.suppliers.air.data.PassengerFare();
	    passengerFareData.setInputTicketDesigCode(passengerFare.getInputTicketDesigCode());
	    passengerFaresData.add(passengerFareData);
	}
	ptcFareBreakdownData.setPassengerFares(passengerFaresData);

	Endorsements otaEndorsement = otaPTCFareBreakdown.getEndorsements();

	List<com.cnk.travelogix.suppliers.air.data.Endorsement> endorsementListData = new ArrayList<>();
	com.cnk.travelogix.suppliers.air.data.Endorsements endorsementsData = new com.cnk.travelogix.suppliers.air.data.Endorsements();
	List<Endorsement> otaEndorsementList = otaEndorsement.getEndorsement();
	for (Endorsement endorsement : otaEndorsementList) {
	    com.cnk.travelogix.suppliers.air.data.Endorsement endorsementData = new com.cnk.travelogix.suppliers.air.data.Endorsement();
	    endorsement.setOperation(ActionType.valueOf(endorsementData.getOperation()));
	    endorsementListData.add(endorsementData);
	}
	endorsementsData.setEndorsement(endorsementListData);
	ptcFareBreakdownData.setEndorsements(endorsementsData);

	List<com.cnk.travelogix.suppliers.air.data.FareInfo> fareInfosData = new ArrayList<>();
	List<FareInfo> fareInfos = otaPTCFareBreakdown.getFareInfo();
	com.cnk.travelogix.suppliers.air.data.FareInfo fareInfoData = new com.cnk.travelogix.suppliers.air.data.FareInfo();
	for (FareInfo fareInfo : fareInfos) {
	    List<org.opentravel.ota._2003._05.FareInfoType.FareInfo> otaFareInfos = fareInfo.getFareInfo();
	    for (org.opentravel.ota._2003._05.FareInfoType.FareInfo otaFareInfo : otaFareInfos) {
		List<org.opentravel.ota._2003._05.FareInfoType.FareInfo.Date> datesList = otaFareInfo.getDate();
		com.cnk.travelogix.suppliers.air.data.Date dateDate = null;
		for (org.opentravel.ota._2003._05.FareInfoType.FareInfo.Date date : datesList) {
		    dateDate = new com.cnk.travelogix.suppliers.air.data.Date();
		    dateDate.setDate(date.getDate());
		}
		fareInfoData.setDate(dateDate);

		Fare otaFare = otaFareInfo.getFare();
		com.cnk.travelogix.suppliers.air.data.Fare fareData = new com.cnk.travelogix.suppliers.air.data.Fare();
		fareData.setFareDescription(otaFare.getFareDescription());
		fareInfoData.setFare(fareData);

		List<PTC> otaPtcs = otaFareInfo.getPTC();
		List<com.cnk.travelogix.suppliers.air.data.PTC> ptcsData = new ArrayList<>();
		com.cnk.travelogix.suppliers.air.data.PTC ptcData = null;
		for (PTC ptc : otaPtcs) {
		    ptcData = new com.cnk.travelogix.suppliers.air.data.PTC();
		    ptcData.setPassengerTypeCode(ptc.getPassengerTypeCode());
		}
		ptcsData.add(ptcData);
		fareInfoData.setPtc(ptcsData);
	    }
	    RuleInfo otaRuleInfo = fareInfo.getRuleInfo();
	    com.cnk.travelogix.suppliers.air.data.RuleInfo ruleInfoData = new com.cnk.travelogix.suppliers.air.data.RuleInfo();
	    ChargesRules otaChargesRules = otaRuleInfo.getChargesRules();
	    com.cnk.travelogix.suppliers.air.data.ChargesRules chargesRulesData = new com.cnk.travelogix.suppliers.air.data.ChargesRules();
	    VoluntaryChangesType otaVoluntaryChangesType = otaChargesRules.getVoluntaryChanges();
	    com.cnk.travelogix.suppliers.air.data.VoluntaryChangesType voluntaryChangesTypeData = new com.cnk.travelogix.suppliers.air.data.VoluntaryChangesType();
	    Penalty otaPenalty = otaVoluntaryChangesType.getPenalty();
	    com.cnk.travelogix.suppliers.air.data.Penalty penaltyData = new com.cnk.travelogix.suppliers.air.data.Penalty();
	    penaltyData.setPenaltyType(otaPenalty.getPenaltyType());
	    penaltyData.setCurrencyCode(otaPenalty.getCurrencyCode());
	    penaltyData.setAmount(otaPenalty.getAmount());

	    voluntaryChangesTypeData.setPenalty(penaltyData);
	    chargesRulesData.setVoluntaryChanges(voluntaryChangesTypeData);
	    ruleInfoData.setChargesRules(chargesRulesData);
	    fareInfoData.setRuleInfo(ruleInfoData);

	    com.cnk.travelogix.suppliers.air.data.City cityData = null;
	    List<City> otaCities = fareInfo.getCity();
	    for (City city : otaCities) {
		cityData = new com.cnk.travelogix.suppliers.air.data.City();
		cityData.setLocationCode(city.getLocationCode());
	    }
	    fareInfoData.setCity(cityData);
	    fareInfosData.add(fareInfoData);
	}
	ptcFareBreakdownData.setFareInfos(fareInfosData);
	return ptcFareBreakdownData;
    }

    private AirItinerary populateAirItineraryResponse(AirItineraryType otaAirItinerary) {
	AirItinerary airItineraryData = new AirItinerary();

	airItineraryData.setAirItineraryRPH(otaAirItinerary.getAirItineraryRPH());
	airItineraryData.setDirectionInd(otaAirItinerary.getDirectionInd().toString());

	List<com.cnk.travelogix.suppliers.air.data.OriginDestinationOption> originDestinationOptionDatas = new ArrayList<>();
	OriginDestinationOptions originDestinationOptions = otaAirItinerary.getOriginDestinationOptions();
	List<OriginDestinationOption> otaOriginDestinationOptions = originDestinationOptions.getOriginDestinationOption();
	for (OriginDestinationOption originDestinationOption : otaOriginDestinationOptions) {
	    com.cnk.travelogix.suppliers.air.data.OriginDestinationOption originDestinationOptionData = new com.cnk.travelogix.suppliers.air.data.OriginDestinationOption();
	    List<FlightSegment> otaFlightSegments = originDestinationOption.getFlightSegment();
	    for (FlightSegment otaFlightSegment : otaFlightSegments) {
		com.cnk.travelogix.suppliers.air.data.FlightSegment flightSegmentData = new com.cnk.travelogix.suppliers.air.data.FlightSegment();
		List<com.cnk.travelogix.suppliers.air.data.FlightSegment> flightSegments = new ArrayList<>();
		flightSegmentData.setConnectionType(otaFlightSegment.getConnectionType());
		flightSegmentData.setValidConnectionInd(otaFlightSegment.isValidConnectionInd());
		flightSegmentData.setDepartureDateTime(getDateGregorianCalendar(otaFlightSegment.getDepartureDateTime()));
		flightSegmentData.setFlightNumber(otaFlightSegment.getFlightNumber());
		flightSegmentData.setResBookDesigCode(otaFlightSegment.getResBookDesigCode());
		flightSegmentData.setArrivalDateTime(getDateGregorianCalendar(otaFlightSegment.getArrivalDateTime()));
		flightSegmentData.setETicketEligibility(otaFlightSegment.getETicketEligibility());
		flightSegmentData.setStatus(otaFlightSegment.getStatus());
		flightSegmentData.setDepartureAirport(getDepartureAirportData(otaFlightSegment.getDepartureAirport()));
		flightSegmentData.setArrivalAirport(getArrivalAirportData(otaFlightSegment.getArrivalAirport()));

		OperatingAirlineType operatingAirlineType = otaFlightSegment.getOperatingAirline();
		OperatingAirline operatingAirlineData = new OperatingAirline();
		operatingAirlineData.setFlightNumber(operatingAirlineType.getFlightNumber());
		operatingAirlineData.setCode(operatingAirlineType.getCode());
		operatingAirlineData.setCountryCode(operatingAirlineType.getCountryCode());

		flightSegmentData.setOperatingAirline(operatingAirlineData);

		flightSegmentData.setMarketingAirline(getMarketingAirlineData(otaFlightSegment.getMarketingAirline()));
		flightSegmentData.getBookingClassAvails().addAll(getBookingClassAvailsData(otaFlightSegment.getBookingClassAvails()));
		flightSegments.add(flightSegmentData);
		originDestinationOptionData.setFlightSegments(flightSegments);
		originDestinationOptionData.setRefNumber(originDestinationOption.getRefNumber());
	    }
	    originDestinationOptionDatas.add(originDestinationOptionData);
	    airItineraryData.setOriginDestinationOptions(originDestinationOptionDatas);
	}
	return airItineraryData;
    }

    private TravelerInfo populateTravelInfoResponse(TravelerInfoType otaTravelerInfo) {
	TravelerInfo travelerInfoData = new TravelerInfo();
	List<AirTraveler> otaAirTravelers = otaTravelerInfo.getAirTraveler();
	List<com.cnk.travelogix.suppliers.air.data.AirTraveler> travelersData = new ArrayList<>();
	for (AirTraveler airTraveler : otaAirTravelers) {
	    com.cnk.travelogix.suppliers.air.data.AirTraveler airTravelerData = new com.cnk.travelogix.suppliers.air.data.AirTraveler();
	    airTravelerData.setGender(airTraveler.getGender());
	    airTravelerData.setBirthDate(getDateGregorianCalendar(airTraveler.getBirthDate()));
	    PersonNameType personNameType = airTraveler.getPersonName();
	    PersonName personNameData = new PersonName();
	    personNameData.setNamePrefix(personNameType.getNamePrefix());
	    personNameData.setGivenName(personNameType.getGivenName());
	    personNameData.setSurname(personNameType.getSurname());

	    airTravelerData.setPersonName(personNameData);

	    List<Telephone> telephones = airTraveler.getTelephone();
	    List<com.cnk.travelogix.suppliers.air.data.Telephone> telephonesData = new ArrayList<>();
	    for (Telephone telephone : telephones) {
		com.cnk.travelogix.suppliers.air.data.Telephone telephoneData = new com.cnk.travelogix.suppliers.air.data.Telephone();
		telephoneData.setPhoneNumber(telephone.getPhoneNumber());
		telephoneData.setLocationCode(telephone.getLocationCode());
		telephoneData.setCountryAccessCode(telephone.getCountryAccessCode());
		telephoneData.setPhoneUseType(telephone.getPhoneUseType());
		telephoneData.setRemark(telephone.getRemark());
		telephoneData.setRph(telephone.getRPH());
		telephonesData.add(telephoneData);
	    }
	    airTravelerData.setTelephones(telephonesData);

	    List<Email> otaEmails = airTraveler.getEmail();
	    List<com.cnk.travelogix.suppliers.air.data.Email> emailsData = new ArrayList<>();
	    for (Email email : otaEmails) {
		com.cnk.travelogix.suppliers.air.data.Email emailData = new com.cnk.travelogix.suppliers.air.data.Email();
		emailData.setRph(email.getRPH());
		emailData.setEmailType(email.getEmailType());
		emailsData.add(emailData);
	    }
	    airTravelerData.setEmails(emailsData);

	    List<CustLoyalty> custLoyalties = airTraveler.getCustLoyalty();
	    List<com.cnk.travelogix.suppliers.air.data.CustLoyalty> custLoyaltiesData = new ArrayList<>();
	    for (CustLoyalty custLoyalty : custLoyalties) {
		com.cnk.travelogix.suppliers.air.data.CustLoyalty custLoyaltyData = new com.cnk.travelogix.suppliers.air.data.CustLoyalty();
		custLoyaltyData.setTravelSector(custLoyaltyData.getTravelSector());
		custLoyaltyData.setVendorCode(custLoyalty.getVendorCode());
		custLoyaltyData.setEffectiveDate(getDateGregorianCalendar(custLoyalty.getEffectiveDate()));
		custLoyaltiesData.add(custLoyaltyData);
	    }
	    airTravelerData.setCustLoyalty(custLoyaltiesData);

	    FlightSegmentRPHs flightSegmentType = airTraveler.getFlightSegmentRPHs();
	    com.cnk.travelogix.suppliers.air.data.FlightSegmentRPHs flightSegmentTypeData = new com.cnk.travelogix.suppliers.air.data.FlightSegmentRPHs();
	    flightSegmentType.getFlightSegmentRPH().addAll(flightSegmentTypeData.getFlightSegmentRPH());
	    airTravelerData.setFlightSegmentRPHs(flightSegmentTypeData);

	    PassengerTypeQuantityType passengerTypeQuantityType = airTraveler.getPassengerTypeQuantity();
	    List<PassengerTypeQuantity> passengerTypeQuantities = new ArrayList<>();
	    PassengerTypeQuantity passengerTypeQuantityData = new PassengerTypeQuantity();
	    passengerTypeQuantityData.setAge(passengerTypeQuantityType.getAge());
	    passengerTypeQuantityData.setCode(passengerTypeQuantityType.getCode());
	    passengerTypeQuantities.add(passengerTypeQuantityData);
	    airTravelerData.setPassengerTypeQuantity(passengerTypeQuantities);
	    travelersData.add(airTravelerData);
	}
	travelerInfoData.setAirTravelers(travelersData);

	return travelerInfoData;
    }

    private com.cnk.travelogix.suppliers.air.data.AirArrangerType populateArrangeTypeResponse(AirArrangerType airArrangerType) {
	com.cnk.travelogix.suppliers.air.data.AirArrangerType airArrangerTypeData = new com.cnk.travelogix.suppliers.air.data.AirArrangerType();
	org.opentravel.ota._2003._05.AirArrangerType.ProfileRef otaProfileRef = airArrangerType.getProfileRef();
	ProfileRef profileRefData = new ProfileRef();
	UniqueIDType uniqueIDType = otaProfileRef.getUniqueID();
	UniqueID uniqueIDData = new UniqueID();
	uniqueIDData.setId(uniqueIDType.getType());
	uniqueIDData.setInstance(uniqueIDType.getInstance());
	CompanyNameType companyNameType = uniqueIDType.getCompanyName();
	CompanyName companyNameData = new CompanyName();
	companyNameData.setCode(companyNameType.getCode());
	companyNameData.setCodeContext(companyNameType.getCodeContext());
	companyNameData.setDepartment(companyNameType.getDepartment());
	uniqueIDData.setCompanyName(companyNameData);
	profileRefData.setUniqueID(uniqueIDData);
	airArrangerTypeData.setProfileRef(profileRefData);

	return airArrangerTypeData;
    }

    private Fulfillment populateFulfilmentResponse(FulfillmentType fulfillmentType) {
	Fulfillment fulfillmentData = new Fulfillment();
	PaymentDetails paymentDetails = fulfillmentType.getPaymentDetails();
	com.cnk.travelogix.suppliers.air.data.PaymentDetails paymentDetailsData = new com.cnk.travelogix.suppliers.air.data.PaymentDetails();
	List<com.cnk.travelogix.suppliers.air.data.PaymentDetail> paymentDetailListData = new ArrayList<>();
	List<PaymentDetail> paymentDetailsList = paymentDetails.getPaymentDetail();
	for (PaymentDetail paymentDetail : paymentDetailsList) {
	    com.cnk.travelogix.suppliers.air.data.PaymentDetail paymentDetailData = new com.cnk.travelogix.suppliers.air.data.PaymentDetail();
	    paymentDetailData.setPaymentType(paymentDetail.getPaymentType());
	    paymentDetailData.setRph(paymentDetail.getRPH());
	    paymentDetailData.setGuaranteeTypeCode(paymentDetail.getGuaranteeTypeCode());
	    PaymentCardType paymentCardType = paymentDetail.getPaymentCard();
	    PaymentCard paymentCardData = new PaymentCard();
	    paymentCardData.setExpireDate(paymentCardType.getExpireDate());
	    com.cnk.travelogix.suppliers.air.data.ListPaymentCardIssuer listPaymentCardIssuerData = new com.cnk.travelogix.suppliers.air.data.ListPaymentCardIssuer();
	    //no attribute
	    paymentCardData.setCardType(listPaymentCardIssuerData);

	    paymentCardData.setCardHolderName(paymentCardType.getCardHolderName());
	    AddressType addressType = paymentCardType.getAddress();
	    Address addressData = new Address();
	    addressData.setAddressLine(addressType.getAddressLine());
	    addressData.setCityName(addressType.getCityName());
	    addressData.setPostalCode(addressType.getPostalCode());
	    StateProvType stateProvType = addressType.getStateProv();
	    StateProv stateProvData = new StateProv();
	    stateProvData.setStateCode(stateProvType.getStateCode());
	    addressData.setStateProv(stateProvData);
	    paymentCardData.setAddress(addressData);

	    List<PaymentAmount> paymentAmount = paymentDetail.getPaymentAmount();
	    com.cnk.travelogix.suppliers.air.data.PaymentAmount paymentAmountData = null;
	    for (PaymentAmount otaPaymentAmount : paymentAmount) {
		paymentAmountData = new com.cnk.travelogix.suppliers.air.data.PaymentAmount();
		paymentAmountData.setCurrencyCode(otaPaymentAmount.getCurrencyCode());
		paymentAmountData.setAmount(otaPaymentAmount.getAmount());
	    }
	    paymentDetailData.setPaymentAmount(paymentAmountData);

	    paymentDetailData.setPaymentCard(paymentCardData);
	    paymentDetailListData.add(paymentDetailData);
	}

	paymentDetailsData.setPaymentDetail(paymentDetailListData);
	fulfillmentData.setPaymentDetails(paymentDetailsData);
	return fulfillmentData;
    }

    /**
     * @param emdInfoType
     * @return emdTypesData
     */
    public List<com.cnk.travelogix.suppliers.air.data.EMDType> populateEMDTypesResponse(List<EMDType> emdInfoType) {
	List<com.cnk.travelogix.suppliers.air.data.EMDType> emdTypesData = new ArrayList<>();
	for (EMDType emdType : emdInfoType) {
	    com.cnk.travelogix.suppliers.air.data.EMDType emdTypeData = new com.cnk.travelogix.suppliers.air.data.EMDType();
	    emdTypeData.setOperation(emdType.getOperation().toString());
	    emdTypeData.setSpecificData(emdType.getSpecificData());
	    emdTypeData.setRph(emdType.getRPH());
	    emdTypesData.add(emdTypeData);
	}
	return emdTypesData;
    }

    /**
     * @param bookingReferenceIDs
     * @return bookingReferenceIDsData
     */
    public List<BookingReferenceID> populateBookingReferenceIdsResponse(List<org.opentravel.ota._2003._05.AirReservationType.BookingReferenceID> bookingReferenceIDs) {
	List<BookingReferenceID> bookingReferenceIDsData = new ArrayList<>();
	for (org.opentravel.ota._2003._05.AirReservationType.BookingReferenceID bookingReferenceID : bookingReferenceIDs) {
	    BookingReferenceID bookingReferenceIDData = new BookingReferenceID();
	    bookingReferenceIDData.setId(bookingReferenceID.getID());
	    bookingReferenceIDData.setType(bookingReferenceID.getType());
	    bookingReferenceIDData.setIdContext(bookingReferenceID.getIDContext());
	    bookingReferenceIDsData.add(bookingReferenceIDData);

	}
	return bookingReferenceIDsData;
    }
}
