package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.AcceptedPaymentsType;
import org.opentravel.ota._2003._05.AcceptedPaymentsType.AcceptedPayment;
import org.opentravel.ota._2003._05.CommissionType;
import org.opentravel.ota._2003._05.CommissionType.CommissionableAmount;
import org.opentravel.ota._2003._05.CustomerType;
import org.opentravel.ota._2003._05.CustomerType.CitizenCountryName;
import org.opentravel.ota._2003._05.EncryptionTokenType;
import org.opentravel.ota._2003._05.HotelReservationType;
import org.opentravel.ota._2003._05.HotelReservationType.ResGlobalInfo;
import org.opentravel.ota._2003._05.ListPaymentCardIssuer;
import org.opentravel.ota._2003._05.OTAReadRQ;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;
import org.opentravel.ota._2003._05.OTAResRetrieveRS.ReservationsList;
import org.opentravel.ota._2003._05.PaymentCardType;
import org.opentravel.ota._2003._05.PaymentCardType.ThreeDomainSecurity;
import org.opentravel.ota._2003._05.PaymentCardType.ThreeDomainSecurity.Results;
import org.opentravel.ota._2003._05.PersonNameType;
import org.opentravel.ota._2003._05.ProfileType;
import org.opentravel.ota._2003._05.ProfilesType;
import org.opentravel.ota._2003._05.ProfilesType.ProfileInfo;
import org.opentravel.ota._2003._05.RequiredPaymentsType;
import org.opentravel.ota._2003._05.RequiredPaymentsType.GuaranteePayment;
import org.opentravel.ota._2003._05.ResGuestType;
import org.opentravel.ota._2003._05.ResGuestsType;
import org.opentravel.ota._2003._05.ServiceType;
import org.opentravel.ota._2003._05.ServicesType;
import org.opentravel.ota._2003._05.UniqueIDType;

import com.cnk.travelogix.suppliers.acco.data.DepositPayments;
import com.cnk.travelogix.suppliers.acco.data.EncryptionType;
import com.cnk.travelogix.suppliers.acco.data.HotelReservation;
import com.cnk.travelogix.suppliers.acco.data.OnRequestBookingUpdateReadRequest;
import com.cnk.travelogix.suppliers.acco.data.OnRequestBookingUpdateRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.OnRequestBookingUpdateResponse;
import com.cnk.travelogix.suppliers.acco.data.OnRequestBookingUpdateResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.PaymentCard;
import com.cnk.travelogix.suppliers.acco.data.PersonName;
import com.cnk.travelogix.suppliers.acco.data.Profile;
import com.cnk.travelogix.suppliers.acco.data.ResGuest;
import com.cnk.travelogix.suppliers.acco.data.ResRetrieveRS;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingRQ;
import com.cnk.travelogix.suppliers.acco.data.RoomStay;
import com.cnk.travelogix.suppliers.acco.data.Total;
import com.cnk.travelogix.suppliers.acco.data.UniqueID;
import com.cnk.travelogix.suppliers.acco.data.Warning;
import com.coxandkings.integ.suppl.acco.OTAReadRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAReadRSWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * On Request Booking Update Converter
 */
public class OnRequestBookingUpdateConverter extends AccoBaseConverter {

    /**
     * @param request
     * @return accoInterfaceRQ
     */
    public AccoInterfaceRQ toOTAReadRQ(OnRequestBookingUpdateRequestWrapper request) {
	final AccoInterfaceRQ accoInterfaceRQ = new AccoInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAReadRQWrapper otaReadRQWrapper = new OTAReadRQWrapper();

	List<OnRequestBookingUpdateReadRequest> bookingReadRequests = request.getOnRequestBookingUpdateReadRequest();
	for (OnRequestBookingUpdateReadRequest onRequestBookingReadRequest : bookingReadRequests) {
	    otaReadRQWrapper.setSequence(onRequestBookingReadRequest.getSequence());

	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(onRequestBookingReadRequest.getSupplierID().getValue());
	    supplierIDType.setMarketType(onRequestBookingReadRequest.getSupplierID().getMarketType());
	    otaReadRQWrapper.setSupplierID(supplierIDType);

	    OTAReadRQ otaReadRQ = new OTAReadRQ();
	    RetrieveBookingRQ retrieveBookingRQData = onRequestBookingReadRequest.getOnRequestBookingUpdateRQ();

	    UniqueIDType uniqueID = new UniqueIDType();
	    com.cnk.travelogix.suppliers.acco.data.UniqueID uniqueIDData = retrieveBookingRQData.getUniqueID();
	    uniqueID.setID(uniqueIDData.getId());
	    uniqueID.setType(uniqueIDData.getType());

	    otaReadRQ.setTarget(retrieveBookingRQData.getTarget());
	    otaReadRQ.setVersion(retrieveBookingRQData.getVersion());
	    otaReadRQ.setTransactionIdentifier(retrieveBookingRQData.getTransactionIdentifier());
	    otaReadRQ.setUniqueID(uniqueID);

	    otaReadRQWrapper.setOTAReadRQ(otaReadRQ);
	    requestBody.getOTAReadRQWrapper().add(otaReadRQWrapper);
	}
	accoInterfaceRQ.setRequestBody(requestBody);
	accoInterfaceRQ.setRequestHeader(populateRequestHeader(request.getRequestHeader()));
	return accoInterfaceRQ;
    }

    /**
     * @param accoInterfaceRS
     * @return responseWrapper
     */
    public OnRequestBookingUpdateResponseWrapper fromOTAReadRS(AccoInterfaceRS accoInterfaceRS) {
	OnRequestBookingUpdateResponseWrapper responseWrapper = new OnRequestBookingUpdateResponseWrapper();
	OnRequestBookingUpdateResponse onRequestBookingUpdateResponseData = null;
	final List<OnRequestBookingUpdateResponse> onRequestBookingUpdateResponsesData = new ArrayList<>();

	final List<OTAReadRSWrapper> otaReadWrapperList = accoInterfaceRS.getResponseBody().getOTAReadRSWrapper();
	if (!hasError(accoInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAReadRSWrapper otaReadRSWrapper : otaReadWrapperList) {
		onRequestBookingUpdateResponseData = new OnRequestBookingUpdateResponse();
		onRequestBookingUpdateResponseData.setSupplierID(populateGetSupplierId(otaReadRSWrapper.getSupplierID()));
		onRequestBookingUpdateResponseData.setSequence(otaReadRSWrapper.getSequence());
		ResRetrieveRS onRequestBookingUpdateRS = new ResRetrieveRS();
		if (!hasError(otaReadRSWrapper.getErrorList())) {
		    OTAResRetrieveRS otaReadRQ = otaReadRSWrapper.getOTAResRetrieveRS();
		    onRequestBookingUpdateRS.setVersion(otaReadRQ.getVersion());

		    List<Warning> warningsData = new ArrayList<>();
		    List<Warning> warningData = getRetreiveBookingWarning(otaReadRQ.getWarnings());
		    warningsData.addAll(warningData);
		    onRequestBookingUpdateRS.setWarnings(warningsData);

		    List<HotelReservation> hotelReservations = new ArrayList<>();
		    com.cnk.travelogix.suppliers.acco.data.ReservationsList reservationsListData = new com.cnk.travelogix.suppliers.acco.data.ReservationsList();

		    ReservationsList reservationsList = otaReadRQ.getReservationsList();
		    List<HotelReservationType> hotelReservationTypes = reservationsList.getHotelReservation();
		    for (HotelReservationType hotelReservationType : hotelReservationTypes) {
			HotelReservation hotelReservationData = new HotelReservation();

			hotelReservationData.setResStatus(hotelReservationType.getResStatus());
			hotelReservationData.setCreateDateTime(getDateGregorianCalendar(hotelReservationType.getCreateDateTime()));

			List<com.cnk.travelogix.suppliers.acco.data.RoomStay> roomStaysData = new ArrayList<>();
			hotelReservationType.getRoomStays();
			List<RoomStay> roomStay = getRetrieveBookingRoomStayData(hotelReservationType);
			roomStaysData.addAll(roomStay);
			hotelReservationData.setRoomStays(roomStaysData);

			List<com.cnk.travelogix.suppliers.acco.data.UniqueID> uniqueIDs = new ArrayList<>();
			List<UniqueID> uniqueID = getUniqueIDData(hotelReservationType.getUniqueID());
			uniqueIDs.addAll(uniqueID);
			hotelReservationData.setUniqueID(uniqueIDs);

			ServicesType service = hotelReservationType.getServices();
			List<ServiceType> services = service.getService();
			List<com.cnk.travelogix.suppliers.acco.data.ServiceType> servicesData = new ArrayList<>();
			com.cnk.travelogix.suppliers.acco.data.ServiceType serviceData = new com.cnk.travelogix.suppliers.acco.data.ServiceType();
			for (ServiceType serviceType : services) {
			    serviceData.setId(serviceType.getID());
			    serviceData.setType(serviceType.getType());
			}
			servicesData.add(serviceData);
			hotelReservationData.setServices(servicesData);

			ResGuestsType guestsType = hotelReservationType.getResGuests();
			List<ResGuestType> resGuests = guestsType.getResGuest();
			List<ResGuest> resGuestsData = new ArrayList<>();
			ResGuest resGuest = new ResGuest();
			for (ResGuestType resGuestType : resGuests) {
			    resGuest.setResGuestRPH(resGuestType.getResGuestRPH());
			    resGuest.setPrimaryIndicator(resGuestType.isPrimaryIndicator());
			    resGuest.setAgeQualifyingCode(resGuestType.getAgeQualifyingCode());
			    ProfilesType profilesType = resGuestType.getProfiles();
			    List<com.cnk.travelogix.suppliers.acco.data.ProfileInfo> profilesInfoData = getProfileInfoData(profilesType);
			    resGuest.setProfiles(profilesInfoData);
			}
			resGuestsData.add(resGuest);

			hotelReservationData.setResGuests(resGuestsData);

			ResGlobalInfo resGlobalInfo = hotelReservationType.getResGlobalInfo();
			com.cnk.travelogix.suppliers.acco.data.ResGlobalInfo globalInfoData = new com.cnk.travelogix.suppliers.acco.data.ResGlobalInfo();

			RequiredPaymentsType depositPayments = resGlobalInfo.getDepositPayments();
			DepositPayments depositPaymentsData = getDepositPaymentData(depositPayments);
			globalInfoData.setDepositPayments(depositPaymentsData);

			Total totalType = getTotalData(resGlobalInfo.getTotal());
			globalInfoData.setTotal(totalType);

			CommissionType totalCommissions = resGlobalInfo.getTotalCommissions();
			com.cnk.travelogix.suppliers.acco.data.Commission commissionData = new com.cnk.travelogix.suppliers.acco.data.Commission();
			CommissionableAmount commissionableAmount = totalCommissions.getCommissionableAmount();
			com.cnk.travelogix.suppliers.acco.data.CommissionableAmount commissionableAmountData = new com.cnk.travelogix.suppliers.acco.data.CommissionableAmount();
			commissionableAmountData.setAmount(commissionableAmount.getAmount());
			commissionableAmountData.setCurrencyCode(commissionableAmount.getCurrencyCode());
			commissionData.setCommissionableAmount(commissionableAmountData);
			globalInfoData.setTotalCommissions(commissionData);
			hotelReservationData.setResGlobalInfo(globalInfoData);
			hotelReservations.add(hotelReservationData);
		    }
		    reservationsListData.setHotelReservation(hotelReservations);
		    onRequestBookingUpdateRS.setReservationsList(reservationsListData);
		}
		onRequestBookingUpdateResponseData.setErrors(getErrorsListData(otaReadRSWrapper.getErrorList(), otaReadRSWrapper.getSupplierID().getValue()));
		onRequestBookingUpdateResponseData.setOnRequestBookingUpdateResponseRS(onRequestBookingUpdateRS);
	    }
	}

	onRequestBookingUpdateResponsesData.add(onRequestBookingUpdateResponseData);
	responseWrapper.setOnRequestBookingUpdateResponses(onRequestBookingUpdateResponsesData);
	responseWrapper.setErrors(getErrorsListData(accoInterfaceRS.getResponseBody().getErrorList()));
	responseWrapper.setResponseHeader(populateResponseHeader(accoInterfaceRS.getResponseHeader()));

	return responseWrapper;
    }

    /**
     * @param depositPayments
     * @return depositPaymentsData
     */
    private DepositPayments getDepositPaymentData(RequiredPaymentsType depositPayments) {
	DepositPayments depositPaymentsData = new DepositPayments();
	List<com.cnk.travelogix.suppliers.acco.data.GuaranteePayment> guaranteePaymentsData = new ArrayList<>();
	com.cnk.travelogix.suppliers.acco.data.GuaranteePayment guaranteePaymentData = new com.cnk.travelogix.suppliers.acco.data.GuaranteePayment();
	List<GuaranteePayment> guaranteePayments = depositPayments.getGuaranteePayment();
	for (GuaranteePayment guaranteePayment : guaranteePayments) {
	    List<com.cnk.travelogix.suppliers.acco.data.AcceptedPayment> acceptedPayments = new ArrayList<>();
	    com.cnk.travelogix.suppliers.acco.data.AcceptedPayment acceptedPaymentData = new com.cnk.travelogix.suppliers.acco.data.AcceptedPayment();
	    AcceptedPaymentsType acceptedPaymentType = guaranteePayment.getAcceptedPayments();
	    List<AcceptedPayment> acceptedPaymentsList = acceptedPaymentType.getAcceptedPayment();
	    for (AcceptedPayment acceptedPayment : acceptedPaymentsList) {

		PaymentCardType paymentCardType = acceptedPayment.getPaymentCard();
		PaymentCard paymentCardData = new PaymentCard();
		paymentCardData.setExpireDate(paymentCardType.getExpireDate());

		ListPaymentCardIssuer cardType = paymentCardType.getCardType();
		com.cnk.travelogix.suppliers.acco.data.CardType cardTypeData = new com.cnk.travelogix.suppliers.acco.data.CardType();
		cardTypeData.setCode(cardType.getCode());
		cardTypeData.setValue(cardType.getValue());
		paymentCardData.setCardType(cardTypeData);

		paymentCardData.setCardHolderName(paymentCardType.getCardHolderName());

		EncryptionTokenType encryptionType = paymentCardType.getCardNumber();
		EncryptionType encryptionTypeData = new EncryptionType();
		encryptionTypeData.setPlainText(encryptionType.getPlainText());
		paymentCardData.setCardNumber(encryptionTypeData);

		ThreeDomainSecurity threeDomainSecurity = paymentCardType.getThreeDomainSecurity();
		com.cnk.travelogix.suppliers.acco.data.ThreeDomainSecurity threeDomainSecurityData = new com.cnk.travelogix.suppliers.acco.data.ThreeDomainSecurity();
		Results results = threeDomainSecurity.getResults();
		com.cnk.travelogix.suppliers.acco.data.Results resultsData = new com.cnk.travelogix.suppliers.acco.data.Results();
		resultsData.setCavv(results.getCAVV());
		threeDomainSecurityData.setResults(resultsData);
		paymentCardData.setThreeDomainSecurity(threeDomainSecurityData);

		acceptedPaymentData.setPaymentCard(paymentCardData);

	    }
	    acceptedPayments.add(acceptedPaymentData);
	    guaranteePaymentData.setAcceptedPayments(acceptedPayments);
	    guaranteePaymentsData.add(guaranteePaymentData);
	}
	depositPaymentsData.setGuaranteePayment(guaranteePaymentsData);
	return depositPaymentsData;
    }

    /**
     * @param profilesType
     * @return profilesInfoData
     */
    private List<com.cnk.travelogix.suppliers.acco.data.ProfileInfo> getProfileInfoData(ProfilesType profilesType) {
	List<com.cnk.travelogix.suppliers.acco.data.ProfileInfo> profilesInfoData = new ArrayList<>();
	com.cnk.travelogix.suppliers.acco.data.ProfileInfo profileInfoData = new com.cnk.travelogix.suppliers.acco.data.ProfileInfo();

	List<ProfileInfo> profileInfos = profilesType.getProfileInfo();
	for (ProfileInfo profileInfo : profileInfos) {
	    ProfileType profile = profileInfo.getProfile();
	    Profile profileData = new Profile();
	    profileData.setRph(profile.getRPH());
	    com.cnk.travelogix.suppliers.acco.data.CustomerType customerData = new com.cnk.travelogix.suppliers.acco.data.CustomerType();
	    CustomerType customer = profile.getCustomer();

	    List<PersonName> personNamesData = new ArrayList<>();
	    PersonName personName = new PersonName();
	    List<PersonNameType> personNameTypes = customer.getPersonName();
	    for (PersonNameType personNameType : personNameTypes) {
		personName.setGivenName(personNameType.getGivenName());
		personName.setMiddleName(personNameType.getMiddleName());
		personName.setNamePrefix(personNameType.getNamePrefix());
		personName.setSurname(personNameType.getSurname());
		personName.setSurnamePrefix(personNameType.getSurnamePrefix());
		personName.setNameTitle(personNameType.getNameTitle());
		personName.setNameSuffix(personNameType.getNameSuffix());
	    }
	    personNamesData.add(personName);
	    customerData.setPersonName(personNamesData);

	    List<com.cnk.travelogix.suppliers.acco.data.CitizenCountryName> citizenCountrysName = new ArrayList<>();
	    com.cnk.travelogix.suppliers.acco.data.CitizenCountryName citizenCountryNameData = new com.cnk.travelogix.suppliers.acco.data.CitizenCountryName();
	    List<CitizenCountryName> citizenCountrysNames = customer.getCitizenCountryName();
	    for (CitizenCountryName citizenCountryName : citizenCountrysNames) {
		citizenCountryNameData.setCode(citizenCountryName.getCode());
	    }
	    citizenCountrysName.add(citizenCountryNameData);
	    customerData.setCitizenCountryName(citizenCountrysName);
	    profileData.setCustomer(customerData);

	    profileInfoData.setProfile(profileData);
	}
	profilesInfoData.add(profileInfoData);
	return profilesInfoData;
    }

}
