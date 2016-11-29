package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.AcceptedPaymentsType;
import org.opentravel.ota._2003._05.AcceptedPaymentsType.AcceptedPayment;
import org.opentravel.ota._2003._05.AddressInfoType;
import org.opentravel.ota._2003._05.AddressesType.Address;
import org.opentravel.ota._2003._05.BasicPropertyInfoType;
import org.opentravel.ota._2003._05.BookingRulesType;
import org.opentravel.ota._2003._05.BookingRulesType.BookingRule;
import org.opentravel.ota._2003._05.CancelPenaltiesType;
import org.opentravel.ota._2003._05.CommentType;
import org.opentravel.ota._2003._05.CountryNameType;
import org.opentravel.ota._2003._05.CustomerType.Email;
import org.opentravel.ota._2003._05.DateTimeSpanType;
import org.opentravel.ota._2003._05.GuaranteeType;
import org.opentravel.ota._2003._05.GuaranteeType.GuaranteesAccepted;
import org.opentravel.ota._2003._05.GuaranteeType.GuaranteesAccepted.GuaranteeAccepted;
import org.opentravel.ota._2003._05.HotelResResponseType;
import org.opentravel.ota._2003._05.HotelReservationIDsType;
import org.opentravel.ota._2003._05.HotelReservationIDsType.HotelReservationID;
import org.opentravel.ota._2003._05.HotelReservationType.ResGlobalInfo;
import org.opentravel.ota._2003._05.HotelReservationsType;
import org.opentravel.ota._2003._05.OTAHotelResRQ;
import org.opentravel.ota._2003._05.POSType;
import org.opentravel.ota._2003._05.PaymentCardType;
import org.opentravel.ota._2003._05.PaymentCardType.Telephone;
import org.opentravel.ota._2003._05.PaymentCardType.ThreeDomainSecurity;
import org.opentravel.ota._2003._05.PaymentCardType.ThreeDomainSecurity.Results;
import org.opentravel.ota._2003._05.RateIndicatorType;
import org.opentravel.ota._2003._05.RatePlanType;
import org.opentravel.ota._2003._05.RequiredPaymentsType;
import org.opentravel.ota._2003._05.ResGuestType;
import org.opentravel.ota._2003._05.ResGuestsType;
import org.opentravel.ota._2003._05.RoomStayType.BasicPropertyInfo;
import org.opentravel.ota._2003._05.RoomStayType.RoomTypes;
import org.opentravel.ota._2003._05.RoomStaysType;
import org.opentravel.ota._2003._05.RoomStaysType.RoomStay;
import org.opentravel.ota._2003._05.RoomTypeType;
import org.opentravel.ota._2003._05.SourceType;
import org.opentravel.ota._2003._05.SpecialRequestType;
import org.opentravel.ota._2003._05.SpecialRequestType.SpecialRequest;
import org.opentravel.ota._2003._05.StateProvType;
import org.opentravel.ota._2003._05.TaxType;
import org.opentravel.ota._2003._05.TaxesType;
import org.opentravel.ota._2003._05.TotalType;
import org.opentravel.ota._2003._05.TransactionActionType;
import org.opentravel.ota._2003._05.UniqueIDType;

import com.cnk.travelogix.suppliers.acco.data.CancelPenalty;
import com.cnk.travelogix.suppliers.acco.data.CountryName;
import com.cnk.travelogix.suppliers.acco.data.CreateBookingRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.DepositPayments;
import com.cnk.travelogix.suppliers.acco.data.Guarantee;
import com.cnk.travelogix.suppliers.acco.data.HotelResReadRequest;
import com.cnk.travelogix.suppliers.acco.data.HotelResRequest;
import com.cnk.travelogix.suppliers.acco.data.HotelResResponse;
import com.cnk.travelogix.suppliers.acco.data.HotelResResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelResResponses;
import com.cnk.travelogix.suppliers.acco.data.HotelReservation;
import com.cnk.travelogix.suppliers.acco.data.Occupancy;
import com.cnk.travelogix.suppliers.acco.data.PaymentCard;
import com.cnk.travelogix.suppliers.acco.data.RatePlans;
import com.cnk.travelogix.suppliers.acco.data.RoomType;
import com.cnk.travelogix.suppliers.acco.data.SpecialRequests;
import com.cnk.travelogix.suppliers.acco.data.Success;
import com.cnk.travelogix.suppliers.acco.data.Tax;
import com.cnk.travelogix.suppliers.acco.data.Total;
import com.coxandkings.integ.suppl.acco.OTAHotelResRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAHotelResRSWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * AccoCreateBookingConverter class
 */
public class AccoCreateBookingConverter extends AccoBaseConverter {

    /**
     * @param requestWrapper
     * @return accoInterfaceRQ
     */
    public AccoInterfaceRQ toOTAHotelResRQ(final CreateBookingRequestWrapper requestWrapper) {
	final AccoInterfaceRQ accoInterfaceRQ = new AccoInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAHotelResRQWrapper otaHotelResRQWrapper = new OTAHotelResRQWrapper();
	List<HotelResReadRequest> hotelResReadRequests = requestWrapper.getHotelResReadRequest();
	for (HotelResReadRequest hotelResReadRequest : hotelResReadRequests) {
	    otaHotelResRQWrapper.setSequence(hotelResReadRequest.getSequence());
	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(hotelResReadRequest.getSupplierID().getValue());
	    otaHotelResRQWrapper.setSupplierID(supplierIDType);

	    OTAHotelResRQ hotelResRQ = new OTAHotelResRQ();

	    HotelResRequest hotelResRequestData = hotelResReadRequest.getHotelResRq();
	    hotelResRQ.setTarget(hotelResRequestData.getTarget());
	    hotelResRQ.setVersion(hotelResRequestData.getVersion());
	    if (hotelResRequestData.getResStatus() != null) {
		hotelResRQ.setResStatus(TransactionActionType.fromValue(hotelResRequestData.getResStatus()));
	    }
	    hotelResRQ.setTransactionIdentifier(hotelResRequestData.getTransactionIdentifier());
	    hotelResRQ.setCorrelationID(hotelResRequestData.getCorrelationID());
	    hotelResRQ.getUniqueID().addAll(setUniqueId(hotelResRequestData.getUniqueID()));

	    com.cnk.travelogix.suppliers.common.data.POSType posTypeData = hotelResRequestData.getPos();
	    POSType posType = new POSType();
	    if (posTypeData != null) {
		List<com.cnk.travelogix.suppliers.common.data.SourceType> sourceTypesData = posTypeData.getSource();
		for (com.cnk.travelogix.suppliers.common.data.SourceType sourceType : sourceTypesData) {
		    SourceType otaSourceType = new SourceType();
		    sourceType.setErspUserID(otaSourceType.getERSPUserID());
		    posType.getSource().add(otaSourceType);
		}
	    }
	    hotelResRQ.setPOS(posType);

	    List<HotelReservation> hotelReservationsData = hotelResRequestData.getHotelReservations();
	    HotelReservationsType hotelReservationsType = new HotelReservationsType();
	    for (HotelReservation hotelReservation : hotelReservationsData) {
		org.opentravel.ota._2003._05.HotelReservationsType.HotelReservation hotelReservationType = new org.opentravel.ota._2003._05.HotelReservationsType.HotelReservation();

		List<com.cnk.travelogix.suppliers.acco.data.RoomStay> roomStaysData = hotelReservation.getRoomStays();
		RoomStaysType roomStaysType = new RoomStaysType();
		for (com.cnk.travelogix.suppliers.acco.data.RoomStay roomStay : roomStaysData) {
		    RoomStay otaRoomStayObj = new RoomStay();
		    RoomTypes roomType = getRoomTypes(roomStay);
		    otaRoomStayObj.setRoomTypes(roomType);
		    otaRoomStayObj.setRatePlans(populateRatePlansRequest(roomStay.getRatePlans()));
		    otaRoomStayObj.setRoomRates(getRoomRates(roomStay));
		    otaRoomStayObj.setGuestCounts(setOtaGuestCountType(roomStay.getGuestCounts()));

		    com.cnk.travelogix.suppliers.acco.data.DateTimeSpanType dateTimeSpanTypeData = roomStay.getTimeSpan();
		    DateTimeSpanType dateTimeSpanType = new DateTimeSpanType();
		    dateTimeSpanType.setEnd(dateTimeSpanTypeData.getEnd());
		    dateTimeSpanType.setStart(dateTimeSpanTypeData.getStart());
		    otaRoomStayObj.setTimeSpan(dateTimeSpanType);

		    otaRoomStayObj.getGuarantee().add(populateGuaranteeListData(roomStay.getGuarantee()));

		    BasicPropertyInfo basicPropertyInfoType = new BasicPropertyInfo();
		    com.cnk.travelogix.suppliers.acco.data.BasicPropertyInfo basicPropertyInfoData = roomStay.getBasicPropertyInfo();
		    basicPropertyInfoType.setHotelCityCode(basicPropertyInfoData.getHotelCityCode());
		    basicPropertyInfoType.setHotelCode(basicPropertyInfoData.getHotelCode());
		    com.cnk.travelogix.suppliers.acco.data.Address addressData = basicPropertyInfoData.getAddress();
		    AddressInfoType addressType = new AddressInfoType();
		    CountryNameType countryNameType = new CountryNameType();
		    com.cnk.travelogix.suppliers.acco.data.CountryName countryNameData = addressData.getCountryName();
		    countryNameType.setCode(countryNameData.getCode());
		    addressType.setCountryName(countryNameType);
		    addressType.setCounty(addressData.getCounty());

		    basicPropertyInfoType.setAddress(addressType);
		    otaRoomStayObj.setBasicPropertyInfo(basicPropertyInfoType);

		    otaRoomStayObj.setSpecialRequests(populateSpecialRequestType(roomStay.getSpecialRequests()));

		    CommentType commentType = new CommentType();
		    //paragraph text attribute need to set
		    otaRoomStayObj.setComments(commentType);
		    roomStaysType.getRoomStay().add(otaRoomStayObj);
		}
		ResGuestsType resGuestType = new ResGuestsType();
		List<ResGuestType> resGuestTypes = setOtaResGuestTypeList(hotelReservation.getResGuests());
		resGuestType.getResGuest().addAll(resGuestTypes);
		hotelReservationType.setResGuests(resGuestType);
		hotelReservationType.setResGlobalInfo(populateResGlobalInfo(hotelReservation.getResGlobalInfo()));
		hotelReservationType.setRoomStays(roomStaysType);
		hotelReservationType.setTPAExtensions(populateTpaExtension(hotelReservation.getTpaExtensions()));
		hotelReservationsType.getHotelReservation().add(hotelReservationType);
	    }
	    hotelResRQ.setHotelReservations(hotelReservationsType);
	    otaHotelResRQWrapper.setOTAHotelResRQ(hotelResRQ);
	}

	requestBody.getOTAHotelResRQWrapper().add(otaHotelResRQWrapper);
	accoInterfaceRQ.setRequestBody(requestBody);
	accoInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapper.getRequestHeader()));
	return accoInterfaceRQ;
    }

    private ResGlobalInfo populateResGlobalInfo(com.cnk.travelogix.suppliers.acco.data.ResGlobalInfo globalInfoData) {
	ResGlobalInfo globalInfoType = new ResGlobalInfo();
	RequiredPaymentsType requiredPaymentsType = new RequiredPaymentsType();
	DepositPayments depositPaymentsData = globalInfoData.getDepositPayments();
	org.opentravel.ota._2003._05.RequiredPaymentsType.GuaranteePayment guaranteePayment = new org.opentravel.ota._2003._05.RequiredPaymentsType.GuaranteePayment();
	List<com.cnk.travelogix.suppliers.acco.data.GuaranteePayment> guaranteePaymentDataList = depositPaymentsData.getGuaranteePayment();
	for (com.cnk.travelogix.suppliers.acco.data.GuaranteePayment guaranteePaymentData : guaranteePaymentDataList) {
	    AcceptedPaymentsType acceptedPayment = new AcceptedPaymentsType();
	    List<com.cnk.travelogix.suppliers.acco.data.AcceptedPayment> acceptedPaymentDataList = guaranteePaymentData.getAcceptedPayments();
	    for (com.cnk.travelogix.suppliers.acco.data.AcceptedPayment acceptedPaymentData : acceptedPaymentDataList) {
		AcceptedPayment otaAcceptedPayment = new AcceptedPayment();
		PaymentCard paymentCardData = acceptedPaymentData.getPaymentCard();
		PaymentCardType paymentCardType = new PaymentCardType();
		paymentCardType.setExpireDate(paymentCardData.getExpireDate());
		// No Attribute for card type
		paymentCardType.setCardHolderName(paymentCardData.getCardHolderName());
		paymentCardType.getCardNumber().setPlainText(paymentCardData.getCardNumber().getPlainText());

		ThreeDomainSecurity threeDomainSecurity = new ThreeDomainSecurity();
		com.cnk.travelogix.suppliers.acco.data.ThreeDomainSecurity threeDomainSecurityData = paymentCardData.getThreeDomainSecurity();
		com.cnk.travelogix.suppliers.acco.data.Results resultsData = threeDomainSecurityData.getResults();
		Results results = new Results();
		results.setCAVV(resultsData.getCavv());
		threeDomainSecurity.setResults(results);
		paymentCardType.setThreeDomainSecurity(threeDomainSecurity);
		otaAcceptedPayment.setPaymentCard(paymentCardType);
		acceptedPayment.getAcceptedPayment().add(otaAcceptedPayment);
	    }
	    guaranteePayment.setAcceptedPayments(acceptedPayment);
	}
	TotalType totaltype = new TotalType();
	Total total = globalInfoData.getTotal();
	if (total != null) {
	    totaltype.setAmountAfterTax(total.getAmountAfterTax());
	    totaltype.setCurrencyCode(total.getCurrencyCode());
	    TaxesType taxestype = new TaxesType();
	    List<TaxType> taxTypeList = new ArrayList<>();
	    List<Tax> taxList = total.getTaxes();
	    for (Tax tax : taxList) {
		TaxType taxType = new TaxType();
		taxType.setAmount(tax.getAmount());
		taxTypeList.add(taxType);
	    }
	    totaltype.setTaxes(taxestype);
	}
	globalInfoType.setTotal(totaltype);

	BasicPropertyInfoType propertyInfoType = new BasicPropertyInfoType();
	com.cnk.travelogix.suppliers.acco.data.BasicPropertyInfo basicPropertyInfoData = globalInfoData.getBasicPropertyInfo();
	propertyInfoType.setHotelCode(basicPropertyInfoData.getHotelCode());
	globalInfoType.setBasicPropertyInfo(propertyInfoType);

	requiredPaymentsType.getGuaranteePayment().add(guaranteePayment);
	globalInfoType.setDepositPayments(requiredPaymentsType);
	return globalInfoType;
    }

    private SpecialRequestType populateSpecialRequestType(SpecialRequests specialRequestsData) {
	List<com.cnk.travelogix.suppliers.acco.data.SpecialRequest> specialRequestListData = specialRequestsData.getSpecialRequest();
	SpecialRequestType specialRequestType = new SpecialRequestType();
	for (com.cnk.travelogix.suppliers.acco.data.SpecialRequest specialRequest : specialRequestListData) {
	    SpecialRequest otaSpecialRequest = new SpecialRequest();
	    otaSpecialRequest.setRequestCode(specialRequest.getRequestCode());
	    otaSpecialRequest.setName(specialRequest.getName().toString());
	    specialRequestType.getSpecialRequest().add(otaSpecialRequest);
	}
	return specialRequestType;
    }

    /**
     * 
     * @param guaranteeListData
     * @return guaranteeType
     */
    public GuaranteeType populateGuaranteeListData(List<Guarantee> guaranteeListData) {
	GuaranteeType guaranteeType = null;
	if (guaranteeListData != null) {
	    for (com.cnk.travelogix.suppliers.acco.data.Guarantee guarantee : guaranteeListData) {
		guaranteeType = new GuaranteeType();
		GuaranteesAccepted otaGuaranteesAccepted = new GuaranteesAccepted();
		List<com.cnk.travelogix.suppliers.acco.data.GuaranteeAccepted> guaranteeAcceptedsDataList = guarantee.getGuaranteesAccepted();
		for (com.cnk.travelogix.suppliers.acco.data.GuaranteeAccepted guaranteeAccepted : guaranteeAcceptedsDataList) {
		    GuaranteeAccepted otaGuaranteeAccepted = new GuaranteeAccepted();
		    otaGuaranteeAccepted.setGuaranteeID(guaranteeAccepted.getGuaranteeID());
		    otaGuaranteeAccepted.setGuaranteeIndicator(guaranteeAccepted.getGuaranteeIndicator());
		    otaGuaranteeAccepted.setGuaranteeTypeCode(guaranteeAccepted.getGuaranteeTypeCode());
		    otaGuaranteeAccepted.setNameReqInd(guaranteeAccepted.getNameReqInd());

		    PaymentCardType paymentCardType = new PaymentCardType();
		    PaymentCard paymentCardData = guaranteeAccepted.getPaymentCard();
		    paymentCardType.setCardCode(paymentCardData.getCardCode().getPlainText());
		    paymentCardType.getCardNumber().setPlainText(paymentCardData.getCardNumber().getPlainText());
		    paymentCardType.getSeriesCode().setPlainText(paymentCardData.getSeriesCode());
		    paymentCardType.setExpireDate(paymentCardData.getExpireDate());
		    paymentCardType.setCardHolderName(paymentCardData.getCardHolderName());

		    com.cnk.travelogix.suppliers.acco.data.Address addressData = paymentCardData.getAddress();
		    Address otaAddress = new Address();

		    StateProvType stateProvType = new StateProvType();
		    // No Attribute
		    otaAddress.setStateProv(stateProvType);
		    otaAddress.getAddressLine().addAll(addressData.getAddressLine());
		    otaAddress.setCityName(addressData.getCityName());
		    otaAddress.setPostalCode(addressData.getPostalCode());

		    CountryNameType countryNameType = new CountryNameType();
		    CountryName countryNameData = addressData.getCountryName();
		    countryNameType.setCode(countryNameData.getCode());
		    otaAddress.setCountryName(countryNameType);

		    paymentCardType.setAddress(otaAddress);
		    List<com.cnk.travelogix.suppliers.acco.data.Telephone> telephonesData = paymentCardData.getTelephone();
		    for (com.cnk.travelogix.suppliers.acco.data.Telephone telephoneData : telephonesData) {
			Telephone telephone = new Telephone();
			telephone.setPhoneNumber(telephoneData.getPhoneNumber());
			paymentCardType.getTelephone().add(telephone);
		    }

		    List<com.cnk.travelogix.suppliers.acco.data.Email> emailData = paymentCardData.getEmail();
		    Email otaEmail = new Email();
		    for (com.cnk.travelogix.suppliers.acco.data.Email email : emailData) {
			otaEmail.setValue(email.getValue());
			paymentCardType.getEmail().add(otaEmail);
		    }
		    otaGuaranteeAccepted.setPaymentCard(paymentCardType);
		    otaGuaranteesAccepted.getGuaranteeAccepted().add(otaGuaranteeAccepted);
		}
		guaranteeType.setGuaranteesAccepted(otaGuaranteesAccepted);
	    }
	}
	return guaranteeType;
    }

    org.opentravel.ota._2003._05.RoomStayType.RatePlans populateRatePlansRequest(List<RatePlans> ratePlansData) {
	org.opentravel.ota._2003._05.RoomStayType.RatePlans otaRatePlans = new org.opentravel.ota._2003._05.RoomStayType.RatePlans();
	for (RatePlans ratePlans : ratePlansData) {

	    RatePlanType ratePlanType = new RatePlanType();
	    if (ratePlans.getAvailabilityStatus() != null) {
		ratePlanType.setAvailabilityStatus(RateIndicatorType.fromValue(ratePlans.getAvailabilityStatus()));
	    }
	    ratePlanType.setRatePlanCode(ratePlans.getRatePlanCode());
	    ratePlanType.setRatePlanName(ratePlans.getRatePlanName());
	    ratePlanType.setRatePlanType(ratePlans.getRatePlanType());
	    ratePlanType.setRatePlanID(ratePlans.getRatePlanID());
	    ratePlanType.setRatePlanCode(ratePlans.getRatePlanCode());
	    ratePlanType.setAvailableQuantity(ratePlans.getAvailableQuantity());
	    ratePlanType.setBookingCode(ratePlans.getBookingCode());

	    otaRatePlans.getRatePlan().add(ratePlanType);
	}
	return otaRatePlans;
    }

    /**
     * @param accoInterfaceRS
     * @return response
     */
    public HotelResResponseWrapper fromOTAHotelResRS(final AccoInterfaceRS accoInterfaceRS) {
	final HotelResResponseWrapper responseWrapper = new HotelResResponseWrapper();

	HotelResResponses hotelResResponsesData;
	List<HotelResResponses> hotelResResponsesDataList = new ArrayList<>();
	List<OTAHotelResRSWrapper> otaHoteResRsWrapperList = accoInterfaceRS.getResponseBody().getOTAHotelResRSWrapper();
	for (OTAHotelResRSWrapper otaHotelResModifyRSWrapper : otaHoteResRsWrapperList) {
	    hotelResResponsesData = new HotelResResponses();
	    hotelResResponsesData.setSequence(otaHotelResModifyRSWrapper.getSequence());
	    hotelResResponsesData.setSupplierID(populateGetSupplierId(otaHotelResModifyRSWrapper.getSupplierID()));
	    String otaSupplierID = otaHotelResModifyRSWrapper.getSupplierID().getValue();
	    if (!hasError(otaHotelResModifyRSWrapper.getErrorList())) {
		HotelResResponseType hotelResResponseType = otaHotelResModifyRSWrapper.getOTAHotelResRS();
		HotelResResponse hotelResRsData = new HotelResResponse();
		Success successData = new Success();
		// No Attribute
		hotelResRsData.setSuccess(successData);

		POSType posType = hotelResResponseType.getPOS();
		com.cnk.travelogix.suppliers.common.data.POSType posTypeData = new com.cnk.travelogix.suppliers.common.data.POSType();
		List<SourceType> sourceTypes = posType.getSource();
		List<com.cnk.travelogix.suppliers.common.data.SourceType> sourceListData = new ArrayList<>();
		for (SourceType sourceType : sourceTypes) {
		    com.cnk.travelogix.suppliers.common.data.SourceType sourceTypeData = new com.cnk.travelogix.suppliers.common.data.SourceType();
		    sourceTypeData.setErspUserID(sourceType.getERSPUserID());
		    sourceListData.add(sourceTypeData);
		}
		posTypeData.setSource(sourceListData);
		hotelResRsData.setPos(posTypeData);

		hotelResRsData.setWarnings(getRetreiveBookingWarning(hotelResResponseType.getWarnings()));
		hotelResRsData.setErrors(getErrorsData(hotelResResponseType.getErrors(), otaSupplierID));
		HotelReservationsType hotelReservations = hotelResResponseType.getHotelReservations();

		List<HotelReservation> hotelReservationsListData = new ArrayList<>();
		List<org.opentravel.ota._2003._05.HotelReservationsType.HotelReservation> hotelResRs = hotelReservations.getHotelReservation();
		for (org.opentravel.ota._2003._05.HotelReservationsType.HotelReservation hotelReservation : hotelResRs) {
		    HotelReservation hotelReservationData = new HotelReservation();
		    hotelReservationData.setUniqueID(getUniqueIDData(hotelReservation.getUniqueID()));

		    List<com.cnk.travelogix.suppliers.acco.data.RoomStay> roomStays = new ArrayList<>();
		    RoomStaysType roomStaysType = hotelReservation.getRoomStays();
		    List<RoomStay> roomStaysListData = roomStaysType.getRoomStay();
		    for (RoomStay roomStay : roomStaysListData) {
			com.cnk.travelogix.suppliers.acco.data.RoomStay roomStayData = new com.cnk.travelogix.suppliers.acco.data.RoomStay();
			roomStayData.setRoomStayStatus(roomStay.getRoomStayStatus());
			roomStayData.setMarketCode(roomStay.getMarketCode());
			roomStayData.setIndexNumber(roomStay.getIndexNumber());
			roomStayData.setDiscountCode(roomStay.getDiscountCode());
			roomStayData.setRoomTypes(populateRoomTypesData(roomStay.getRoomTypes()));
			roomStayData.setRoomRates(setRetrieveBookingRoomRateData(roomStay));

			roomStayData.setGuestCounts(getGuestCountsData(roomStay));

			DateTimeSpanType dateTimeSpanType = roomStay.getTimeSpan();
			com.cnk.travelogix.suppliers.acco.data.DateTimeSpanType dateTimeSpanTypeData = new com.cnk.travelogix.suppliers.acco.data.DateTimeSpanType();
			dateTimeSpanTypeData.setEnd(dateTimeSpanType.getEnd());
			dateTimeSpanTypeData.setStart(dateTimeSpanType.getStart());
			roomStayData.setTimeSpan(dateTimeSpanTypeData);

			com.cnk.travelogix.suppliers.acco.data.Total totalData = getTotalData(roomStay.getTotal());
			roomStayData.setTotal(totalData);

			UniqueIDType uniqueIDType = roomStay.getReference();
			com.cnk.travelogix.suppliers.acco.data.UniqueID uniqueIDData = new com.cnk.travelogix.suppliers.acco.data.UniqueID();
			uniqueIDData.setId(uniqueIDType.getID());
			uniqueIDData.setType(uniqueIDType.getType());
			roomStayData.setReference(uniqueIDData);
			roomStayData.setBookingRules(populateBookingRulesTypesListData(roomStay.getBookingRules()));

			roomStayData.setBasicPropertyInfo(getBasicPropertyInfo(roomStay));
			roomStays.add(roomStayData);
		    }
		    hotelReservationData.setRoomStays(roomStays);

		    hotelReservationData.setResGuests(getResGuestsData(hotelReservation.getResGuests()));

		    ResGlobalInfo resGlobalInfo = hotelReservation.getResGlobalInfo();
		    com.cnk.travelogix.suppliers.acco.data.ResGlobalInfo globalInfoData = new com.cnk.travelogix.suppliers.acco.data.ResGlobalInfo();
		    HotelReservationIDsType hotelReservationIDsType = resGlobalInfo.getHotelReservationIDs();
		    List<HotelReservationID> reservationIDs = hotelReservationIDsType.getHotelReservationID();
		    List<com.cnk.travelogix.suppliers.acco.data.HotelReservationID> hotelReservationIDsListData = new ArrayList<>();
		    for (HotelReservationID hotelReservationID : reservationIDs) {
			com.cnk.travelogix.suppliers.acco.data.HotelReservationID hotelReservationIdData = new com.cnk.travelogix.suppliers.acco.data.HotelReservationID();
			hotelReservationIdData.setCancellationDate(getDateGregorianCalendar(hotelReservationID.getCancellationDate()));
			hotelReservationIdData.setResIDDate(getDateGregorianCalendar(hotelReservationID.getResIDDate()));
			hotelReservationIdData.setResIDSource(hotelReservationID.getResIDSource());
			hotelReservationIdData.setResIDType(hotelReservationID.getResIDType());
			hotelReservationIdData.setResIDValue(hotelReservationID.getResIDValue());
			hotelReservationIDsListData.add(hotelReservationIdData);
		    }
		    globalInfoData.setHotelReservationIDs(hotelReservationIDsListData);
		    hotelReservationData.setResGlobalInfo(globalInfoData);
		    hotelReservationsListData.add(hotelReservationData);
		}
		hotelResRsData.setHotelReservations(hotelReservationsListData);
		hotelResResponsesData.setHotelResRs(hotelResRsData);
	    }
	    hotelResResponsesData.setErrors(getErrorsListData(otaHotelResModifyRSWrapper.getErrorList()));
	    hotelResResponsesDataList.add(hotelResResponsesData);
	}
	responseWrapper.getHotelResResponse().addAll(hotelResResponsesDataList);
	responseWrapper.setResponseHeader(populateResponseHeader(accoInterfaceRS.getResponseHeader()));
	responseWrapper.setErrors(getErrorsListData(accoInterfaceRS.getResponseBody().getErrorList()));

	return responseWrapper;
    }

    private List<com.cnk.travelogix.suppliers.acco.data.BookingRulesType> populateBookingRulesTypesListData(BookingRulesType bookingRulesType) {
	List<com.cnk.travelogix.suppliers.acco.data.BookingRulesType> bookingRulesTypesListData = new ArrayList<>();
	List<BookingRule> bookingRulesList = bookingRulesType.getBookingRule();
	for (BookingRule bookingRule : bookingRulesList) {
	    com.cnk.travelogix.suppliers.acco.data.BookingRulesType bookingRulesTypeData = new com.cnk.travelogix.suppliers.acco.data.BookingRulesType();
	    CancelPenaltiesType cancelPenaltiesType = bookingRule.getCancelPenalties();
	    List<CancelPenalty> cancelPenalties = getCancelPenaltyData(cancelPenaltiesType.getCancelPenalty());
	    bookingRulesTypeData.setCancelPenalties(cancelPenalties);
	    bookingRulesTypesListData.add(bookingRulesTypeData);
	}
	return bookingRulesTypesListData;
    }

    private List<RoomType> populateRoomTypesData(RoomTypes roomTypes) {
	List<com.cnk.travelogix.suppliers.acco.data.RoomType> roomTypesData = new ArrayList<>();
	List<RoomTypeType> roomTypeTypes = roomTypes.getRoomType();
	for (RoomTypeType roomTypeType : roomTypeTypes) {
	    com.cnk.travelogix.suppliers.acco.data.RoomType roomTypeData;
	    roomTypeData = populateRoomTypeData(roomTypeType);
	    List<Occupancy> occupancies = getOccupancyData(roomTypeType);
	    roomTypeData.setOccupancy(occupancies);
	    roomTypesData.add(roomTypeData);
	}
	return roomTypesData;
    }
}
