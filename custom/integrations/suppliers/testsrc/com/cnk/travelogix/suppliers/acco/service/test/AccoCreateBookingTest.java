package com.cnk.travelogix.suppliers.acco.service.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.suppliers.acco.data.AcceptedPayment;
import com.cnk.travelogix.suppliers.acco.data.Address;
import com.cnk.travelogix.suppliers.acco.data.BasicPropertyInfo;
import com.cnk.travelogix.suppliers.acco.data.CardType;
import com.cnk.travelogix.suppliers.acco.data.CitizenCountryName;
import com.cnk.travelogix.suppliers.acco.data.Comments;
import com.cnk.travelogix.suppliers.acco.data.CountryName;
import com.cnk.travelogix.suppliers.acco.data.CreateBookingRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.CustomerType;
import com.cnk.travelogix.suppliers.acco.data.DateTimeSpanType;
import com.cnk.travelogix.suppliers.acco.data.DepositPayments;
import com.cnk.travelogix.suppliers.acco.data.Email;
import com.cnk.travelogix.suppliers.acco.data.EncryptionType;
import com.cnk.travelogix.suppliers.acco.data.GuaranteePayment;
import com.cnk.travelogix.suppliers.acco.data.GuestCount;
import com.cnk.travelogix.suppliers.acco.data.GuestCountType;
import com.cnk.travelogix.suppliers.acco.data.HotelResReadRequest;
import com.cnk.travelogix.suppliers.acco.data.HotelResRequest;
import com.cnk.travelogix.suppliers.acco.data.HotelReservation;
import com.cnk.travelogix.suppliers.acco.data.ParagraphType;
import com.cnk.travelogix.suppliers.acco.data.PaymentCard;
import com.cnk.travelogix.suppliers.acco.data.PersonName;
import com.cnk.travelogix.suppliers.acco.data.Profile;
import com.cnk.travelogix.suppliers.acco.data.ProfileInfo;
import com.cnk.travelogix.suppliers.acco.data.RatePlans;
import com.cnk.travelogix.suppliers.acco.data.ResGlobalInfo;
import com.cnk.travelogix.suppliers.acco.data.ResGuest;
import com.cnk.travelogix.suppliers.acco.data.Results;
import com.cnk.travelogix.suppliers.acco.data.RoomRate;
import com.cnk.travelogix.suppliers.acco.data.RoomStay;
import com.cnk.travelogix.suppliers.acco.data.RoomType;
import com.cnk.travelogix.suppliers.acco.data.Telephone;
import com.cnk.travelogix.suppliers.acco.data.ThreeDomainSecurity;
import com.cnk.travelogix.suppliers.acco.data.Total;
import com.cnk.travelogix.suppliers.acco.service.SupplierAccoService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;

public class AccoCreateBookingTest {

    public static void main(String[] args) {

	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
	SupplierAccoService accoService = (SupplierAccoService) appContext.getBean("supplierAccoService");


	List<HotelResReadRequest> hotelResReadRequestList = new ArrayList<>();
	CreateBookingRequestWrapper requestWrapper = new CreateBookingRequestWrapper();

	RequestHeader requestHeader = new RequestHeader();
	requestHeader.setSessionID("2");
	requestHeader.setUserID("1");
	requestHeader.setTransactionID("3");

	SupplierCredentials supplierCredential = new SupplierCredentials();
	List<SupplierCredentials> supplierCredentials = new ArrayList<>();
	SupplierID supplierIDHeader = new SupplierID();
	supplierIDHeader.setValue("ATI");
	supplierCredential.setSupplierID(supplierIDHeader);
	supplierCredentials.add(supplierCredential);
	
	Map<String, String> credentialsMap = new HashMap<String, String>();
	credentialsMap.put("AgentID", "EZEGOO");
	credentialsMap.put("Password", "chambers1");
	
	Credentials credentials = new Credentials();

	List<Credential> credentialList = new ArrayList<>();
	for (final Map.Entry<String, String> keyValueMap : credentialsMap.entrySet()) {
	    Credential credential = new Credential();
	    credential.setName(keyValueMap.getKey());
	    credential.setValue(keyValueMap.getValue());
	    credential.setIsEncrypted(false);
	    credentialList.add(credential);
	}
	
	SupplierCredentials supplierCredential1 = new SupplierCredentials();
	SupplierID supplierIDHeader1 = new SupplierID();
	supplierIDHeader1.setValue("AXISROOMS");
	supplierCredential1.setSupplierID(supplierIDHeader1);
	supplierCredentials.add(supplierCredential1);
	
	Map<String, String> credentialsMap1 = new HashMap<String, String>();
	credentialsMap1.put("key", "AXR-EZG");
	credentialsMap1.put("buyer_id", "20");
	
	for (final Map.Entry<String, String> keyValueMap : credentialsMap1.entrySet()) {
	    Credential credential = new Credential();
	    credential.setName(keyValueMap.getKey());
	    credential.setValue(keyValueMap.getValue());
	    credential.setIsEncrypted(false);
	    credentialList.add(credential);
	}
	
	SupplierCredentials supplierCredential11 = new SupplierCredentials();
	SupplierID supplierIDHeader11 = new SupplierID();
	supplierIDHeader11.setValue("TRAVELBULLZ");
	supplierCredential11.setSupplierID(supplierIDHeader11);
	supplierCredentials.add(supplierCredential11);
	
	Map<String, String> credentialsMap11 = new HashMap<String, String>();
	credentialsMap11.put("Username", "EzeegoOneTravel_DEV");
	credentialsMap11.put("Password", "5wphJynXArxNqrTm3ETA9Mg");
	
	for (final Map.Entry<String, String> keyValueMap : credentialsMap11.entrySet()) {
	    Credential credential = new Credential();
	    credential.setName(keyValueMap.getKey());
	    credential.setValue(keyValueMap.getValue());
	    credential.setIsEncrypted(false);
	    credentialList.add(credential);
	}
	credentials.setCredential(credentialList);
	requestHeader.setSupplierCredentials(supplierCredentials);

	requestWrapper.setRequestHeader(requestHeader);
	
	HotelResReadRequest hotelResReadRequestData = new HotelResReadRequest();
	hotelResReadRequestData.setSequence(1);
	SupplierID supplierID = new SupplierID();
	supplierID.setValue("AOT");
	hotelResReadRequestData.setSupplierID(supplierID);
	
	HotelResRequest hotelResRequest = new HotelResRequest();
	hotelResRequest.setResStatus("Book");
	BigDecimal bigDecimal = new BigDecimal("1.0");
	hotelResRequest.setVersion(bigDecimal);
	
	List<HotelReservation> hotelReservations = new ArrayList<>();
	HotelReservation hotelReservation = new HotelReservation();
	hotelReservation.setResStatus("RQ");
	
	List<RoomStay> roomStays = new ArrayList<>();
	RoomStay roomStaysData = new RoomStay();
	GuestCountType guestCountType = new GuestCountType();
	GuestCount guestCount = new GuestCount();
	GuestCount guestCountData = new GuestCount();

	List<GuestCount> guestCounts = new ArrayList<>();

	guestCount.setCount(1);
	guestCount.setAgeQualifyingCode("10");
	guestCount.setResGuestRPH("1");
	
	guestCountData.setCount(1);
	guestCountData.setAgeQualifyingCode("8");
	guestCountData.setResGuestRPH("2");
	guestCountData.setAge(3);
	
	guestCounts.add(guestCount);
	guestCounts.add(guestCountData);
	
	guestCountType.setGuestCount(guestCounts);
	roomStaysData.setGuestCounts(guestCountType);
	
	DateTimeSpanType dateTimeSpanType = new DateTimeSpanType();
	dateTimeSpanType.setStart("2016-07-22");
	dateTimeSpanType.setEnd("2016-07-24");
	roomStaysData.setTimeSpan(dateTimeSpanType);
	
	
	TPAExtensions tPAExtensions = new TPAExtensions();
	Map<String, String> keyValueMap = new HashMap<String, String>();
	keyValueMap.put("RoomCategoryID", "MELACMGMMEL3BRMI");
	tPAExtensions.setKeyValueMap(keyValueMap);
	roomStaysData.setTpaExtensions(tPAExtensions);
	
	Comments comments = new Comments();
	List<ParagraphType> paragraphTypes = new ArrayList<>();
	ParagraphType paragraphType = new ParagraphType();
	paragraphType.setText("This is Test Room.");
	paragraphTypes.add(paragraphType);
	comments.setComment(paragraphTypes);
	roomStaysData.setComments(comments);
	
	roomStays.add(roomStaysData);
	hotelReservation.setRoomStays(roomStays);
	
	List<ResGuest> resGuestsList = new ArrayList<>();
	ResGuest resGuests = new ResGuest();
	resGuests.setResGuestRPH("1");
	resGuests.setPrimaryIndicator(true);
	
	List<ProfileInfo> profileInfos = new ArrayList<>();
	ProfileInfo profileInfo = new ProfileInfo();
	Profile profile = new Profile();
	CustomerType customer = new CustomerType();
	
	List<PersonName> personNames = new ArrayList<>();
	PersonName personName = new PersonName();
	List<String> strings = new ArrayList<>();
	strings.add("Mr.");
	personName.setNamePrefix(strings);
	List<String> strings1 = new ArrayList<>();
	strings1.add("Guest1.");
	personName.setGivenName(strings1);
	personName.setSurname("Surname1");
	personNames.add(personName);
	customer.setPersonName(personNames);
	
	List<Telephone> telephones = new ArrayList<>();
	Telephone telephone = new Telephone();
	telephone.setPhoneNumber("132134654");
	telephones.add(telephone);
	customer.setTelephone(telephones);
	
	List<Email> emails = new ArrayList<>();
	Email email = new Email();
	email.setValue("guest@test.com");
	emails.add(email);
	customer.setEmail(emails);
	
	Address address = new Address();
	List<String> addressLine = new ArrayList<>();
	addressLine.add("221,Baker Street");
	address.setAddressLine(addressLine);
	address.setCityName("London");
	address.setPostalCode("123456");
	/*StateProvType stateProv = new StateProvType();
	stateProv.se
	address.setStateProv(stateProv);*/
	CountryName countryName = new CountryName();
	countryName.setCode("England");
	address.setCountryName(countryName);
	customer.setAddress(address);
	
	profile.setCustomer(customer);
	profileInfo.setProfile(profile);
	profileInfos.add(profileInfo);
	resGuests.setProfiles(profileInfos);
	
	ResGuest resGuests1 = new ResGuest();
	resGuests.setResGuestRPH("2");
	
	List<ProfileInfo> profileInfos1 = new ArrayList<>();
	ProfileInfo profileInfo1 = new ProfileInfo();
	Profile profile1 = new Profile();
	CustomerType customer1 = new CustomerType();
	
	List<PersonName> personNames1 = new ArrayList<>();
	PersonName personName1 = new PersonName();
	List<String> strings11 = new ArrayList<>();
	strings11.add("Master");
	personName1.setNamePrefix(strings11);
	List<String> strings111 = new ArrayList<>();
	strings111.add("Guest1");
	personName1.setGivenName(strings111);
	personName1.setSurname("Child1");
	personNames1.add(personName1);
	customer1.setPersonName(personNames1);
	profile1.setCustomer(customer1);
	profileInfo1.setProfile(profile1);
	profileInfos1.add(profileInfo1);
	resGuests.setProfiles(profileInfos1);
	resGuestsList.add(resGuests);
	resGuestsList.add(resGuests1);
	hotelReservation.setResGuests(resGuestsList);
	
	ResGlobalInfo resGlobalInfo = new ResGlobalInfo();
	DepositPayments depositPayments = new DepositPayments();
	List<GuaranteePayment> payments = new ArrayList<>();
	GuaranteePayment guaranteePayment = new GuaranteePayment();
	List<AcceptedPayment> acceptedPaymentList = new ArrayList<>();
	AcceptedPayment acceptedPayments = new AcceptedPayment();
	PaymentCard paymentCard = new PaymentCard();
	paymentCard.setExpireDate("0517");
	CardType cardType = new CardType();
	cardType.setValue("Mastercard");
	paymentCard.setCardType(cardType);
	paymentCard.setCardHolderName("John Doe");
	EncryptionType cardNumber = new EncryptionType();
	cardNumber.setPlainText("5123456789012346");
	paymentCard.setCardNumber(cardNumber);
	ThreeDomainSecurity threeDomainSecurity = new ThreeDomainSecurity();
	paymentCard.setThreeDomainSecurity(threeDomainSecurity);
	acceptedPayments.setPaymentCard(paymentCard);
	acceptedPaymentList.add(acceptedPayments);
	guaranteePayment.setAcceptedPayments(acceptedPaymentList);
	payments.add(guaranteePayment);
	depositPayments.setGuaranteePayment(payments);
	resGlobalInfo.setDepositPayments(depositPayments);
	
	Total total = new Total();
	total.setCurrencyCode("USD");
	BigDecimal amountAfterTax = new BigDecimal("200");
	total.setAmountAfterTax(amountAfterTax);
	resGlobalInfo.setTotal(total);
	hotelReservation.setResGlobalInfo(resGlobalInfo);
	
	TPAExtensions tPAExtensions1 = new TPAExtensions();
	Map<String, String> keyValueMap1 = new HashMap<String, String>();
	keyValueMap1.put("DeliveryMethod", "EMA");
	keyValueMap1.put("PaymentMethod", "CCC");
	tPAExtensions1.setKeyValueMap(keyValueMap1);
	hotelReservation.setTpaExtensions(tPAExtensions1);
	
	hotelReservations.add(hotelReservation);
	hotelResRequest.setHotelReservations(hotelReservations);
	
    	HotelResReadRequest hotelResReadRequestData1 = new HotelResReadRequest();
    	hotelResReadRequestData1.setSequence(1);
	SupplierID supplierID1 = new SupplierID();
	supplierID1.setValue("AXISROOMS");
	hotelResReadRequestData1.setSupplierID(supplierID1);
	hotelResReadRequestData1.setSequence(2);
	
	HotelResRequest hotelResRequest2 = new HotelResRequest();
	hotelResRequest2.setResStatus("Book");
	hotelResRequest2.setTransactionIdentifier("2323232");
	
	List<HotelReservation> reservations = new ArrayList<>();
	HotelReservation hotelReservation2 = new HotelReservation();
	List<RoomStay> roomStays2 = new ArrayList<>();
	RoomStay roomStay = new RoomStay();
	List<RoomType> roomTypesList = new ArrayList<>();
	RoomType roomTypes = new RoomType();
	roomTypes.setRoomID("12481");
	roomTypesList.add(roomTypes);
	roomStay.setRoomTypes(roomTypesList);
	List<RatePlans> ratePlans = new ArrayList<>();
	RatePlans ratePlansData = new RatePlans();
	ratePlansData.setRatePlanID("8742");
	ratePlans.add(ratePlansData);
	roomStay.setRatePlans(ratePlans);
	List<RoomRate> roomRates = new ArrayList<>();
	RoomRate roomRateData = new RoomRate();
	roomRateData.setRatePlanCode("CP");
	Total total2 = new Total();
	total2.setCurrencyCode("INR");
	BigDecimal amountBeforeTax = new BigDecimal("4480");
	BigDecimal amountAfterTax1 = new BigDecimal("5188");
	total2.setAmountAfterTax(amountAfterTax1);
	total2.setAmountBeforeTax(amountBeforeTax);
	roomRateData.setTotal(total);
	roomStay.setRoomRates(roomRates);
	List<GuestCount> guestCounts2List = new ArrayList<>();
	GuestCountType guestCountType1 = new GuestCountType();
	GuestCount guestCount2 = new GuestCount();
	
	guestCount2.setCount(1);
	guestCount2.setAgeQualifyingCode("10");
	guestCount2.setResGuestRPH("0");
	guestCount2.setAge(22);
	guestCounts2List.add(guestCount2);
	guestCountType1.setGuestCount(guestCounts2List);;
	roomStay.setGuestCounts(guestCountType1);
	
	DateTimeSpanType dateTimeSpanType2 = new DateTimeSpanType();
	dateTimeSpanType2.setStart("2016-07-01");
	dateTimeSpanType2.setEnd("2016-07-04");
	roomStay.setTimeSpan(dateTimeSpanType2);
	
	BasicPropertyInfo basicPropertyInfo = new BasicPropertyInfo();
	basicPropertyInfo.setHotelCode("55423");
	roomStay.setBasicPropertyInfo(basicPropertyInfo);
	
	roomStays2.add(roomStay);
	hotelReservation2.setRoomStays(roomStays2);
	
	
	List<ResGuest> resGuestsList1 = new ArrayList<>();
	ResGuest resGuests2 = new ResGuest();
	resGuests2.setResGuestRPH("0");
	resGuests2.setPrimaryIndicator(true);
	resGuests2.setAgeQualifyingCode("10");
	resGuestsList1.add(resGuests2);
	
	List<ProfileInfo> profileInfos2 = new ArrayList<>();
	ProfileInfo profileInfo2 = new ProfileInfo();
	Profile profile2 = new Profile();
	CustomerType customer2 = new CustomerType();
	
	List<PersonName> personNames2 = new ArrayList<>();
	PersonName personName2 = new PersonName();
	List<String> namePrefix1 = new ArrayList<>();
	namePrefix1.add("Mr");
	personName2.setNamePrefix(namePrefix1);
	List<String> strings22 = new ArrayList<>();
	strings22.add("a");
	personName2.setGivenName(strings22);
	personName2.setSurname("Doe");
	List<String> middleName = new ArrayList<>();
	middleName.add("M");
	personName2.setMiddleName(middleName);
	personNames2.add(personName1);
	customer2.setPersonName(personNames2);
	
	List<Telephone> telephones1 = new ArrayList<>();
	Telephone telephone1 = new Telephone();
	telephone1.setPhoneNumber("2323443");
	telephones1.add(telephone1);
	customer2.setTelephone(telephones1);
	
	List<Email> emails1 = new ArrayList<>();
	Email email1 = new Email();
	email1.setValue("t@den.com");
	emails1.add(email1);
	customer2.setEmail(emails1);
	profile2.setCustomer(customer2);
	profileInfo2.setProfile(profile2);
	profileInfos2.add(profileInfo2);
	hotelReservation2.setResGuests(resGuestsList1);
	
	
	ResGlobalInfo resGlobalInfo2 = new ResGlobalInfo();
	BasicPropertyInfo basicPropertyInfo2 = new BasicPropertyInfo();
	basicPropertyInfo2.setHotelCode("55423");
	resGlobalInfo2.setBasicPropertyInfo(basicPropertyInfo2);
	hotelReservation2.setResGlobalInfo(resGlobalInfo2);
	
	reservations.add(hotelReservation2);
	hotelResRequest2.setHotelReservations(reservations);
	hotelResReadRequestData1.setHotelResRq(hotelResRequest2);
	
	
	
	
	HotelResReadRequest hotelResReadRequestData2 = new HotelResReadRequest();
    	hotelResReadRequestData2.setSequence(1);
	SupplierID supplierID11 = new SupplierID();
	supplierID11.setValue("TRAVELBULLZ");
	hotelResReadRequestData2.setSupplierID(supplierID11);
	hotelResReadRequestData2.setSequence(3);
	
	HotelResRequest hotelResRequest21 = new HotelResRequest();
	hotelResRequest21.setResStatus("Book");
	BigDecimal version = new BigDecimal("1.0");
	hotelResRequest21.setVersion(version);
		
	List<HotelReservation> reservations1 = new ArrayList<>();
	HotelReservation hotelReservation21 = new HotelReservation();
	List<RoomStay> roomStays21 = new ArrayList<>();
	RoomStay roomStay1 = new RoomStay();
	List<RoomType> roomTypesList1 = new ArrayList<>();
	RoomType roomTypes1 = new RoomType();
	roomTypes1.setRoomID("272");
	roomTypesList1.add(roomTypes1);
	roomStay1.setRoomTypes(roomTypesList1);
	
	List<GuestCount> guestCounts2List1 = new ArrayList<>();
	GuestCountType guestCountType11 = new GuestCountType();
	GuestCount guestCount21 = new GuestCount();
	GuestCount guestCount22 = new GuestCount();
	guestCount21.setCount(1);
	guestCount21.setAgeQualifyingCode("10");
	guestCount21.setResGuestRPH("1");
	
	guestCount22.setCount(1);
	guestCount22.setAgeQualifyingCode("8");
	guestCount22.setResGuestRPH("2");
	guestCount22.setAge(3);
	
	guestCounts2List1.add(guestCount21);
	guestCounts2List1.add(guestCount22);
	guestCountType11.setGuestCount(guestCounts2List1);;
	roomStay1.setGuestCounts(guestCountType11);
	
	DateTimeSpanType dateTimeSpanType21 = new DateTimeSpanType();
	dateTimeSpanType21.setStart("2016-06-22");
	dateTimeSpanType21.setEnd("2016-06-24");
	roomStay1.setTimeSpan(dateTimeSpanType21);
	
	BasicPropertyInfo basicPropertyInfo1 = new BasicPropertyInfo();
	basicPropertyInfo1.setHotelCode("237038");
	basicPropertyInfo1.setHotelCityCode("7355");
	Address address2 = new Address();
	CountryName countryName2 = new CountryName();
	countryName2.setCode("SG");
	address2.setCountryName(countryName2);
	basicPropertyInfo1.setAddress(address2);
	roomStay1.setBasicPropertyInfo(basicPropertyInfo1);
	
	//TPA extension is not thr in spec
	
	RoomStay roomStay11 = new RoomStay();
	List<RoomType> roomTypesList11 = new ArrayList<>();
	RoomType roomTypes11 = new RoomType();
	roomTypes11.setRoomID("272");
	roomTypesList11.add(roomTypes11);
	roomStay11.setRoomTypes(roomTypesList11);
	
	List<GuestCount> guestCounts2List11 = new ArrayList<>();
	GuestCountType guestCountType111 = new GuestCountType();
	GuestCount guestCount211 = new GuestCount();
	GuestCount guestCount221 = new GuestCount();
	guestCount211.setCount(1);
	guestCount211.setAgeQualifyingCode("10");
	guestCount211.setResGuestRPH("3");
	
	guestCount221.setCount(1);
	guestCount221.setAgeQualifyingCode("8");
	guestCount221.setResGuestRPH("2");
	guestCount221.setAge(3);
	
	guestCounts2List11.add(guestCount211);
	guestCounts2List11.add(guestCount221);
	guestCountType111.setGuestCount(guestCounts2List11);;
	roomStay11.setGuestCounts(guestCountType111);
	
	DateTimeSpanType dateTimeSpanType211 = new DateTimeSpanType();
	dateTimeSpanType211.setStart("2016-06-22");
	dateTimeSpanType211.setEnd("2016-06-24");
	roomStay11.setTimeSpan(dateTimeSpanType211);
	
	BasicPropertyInfo basicPropertyInfo11 = new BasicPropertyInfo();
	basicPropertyInfo11.setHotelCode("237038");
	basicPropertyInfo11.setHotelCityCode("7355");
	Address address21 = new Address();
	CountryName countryName21 = new CountryName();
	countryName21.setCode("SG");
	address21.setCountryName(countryName21);
	basicPropertyInfo11.setAddress(address21);
	roomStay11.setBasicPropertyInfo(basicPropertyInfo11);
	roomStays21.add(roomStay1);
	roomStays21.add(roomStay11);
	
	hotelReservation21.setRoomStays(roomStays21);
	
	
	List<ResGuest> resGuestsList11 = new ArrayList<>();
	ResGuest resGuests11 = new ResGuest();
	resGuests11.setResGuestRPH("1");
	resGuests11.setPrimaryIndicator(true);
	
	List<ProfileInfo> profileInfos11 = new ArrayList<>();
	ProfileInfo profileInfo11 = new ProfileInfo();
	Profile profile11 = new Profile();
	CustomerType customer11 = new CustomerType();
	
	List<PersonName> personNames11 = new ArrayList<>();
	PersonName personName11 = new PersonName();
	List<String> namePrefix = new ArrayList<>();
	namePrefix.add("Mr.");
	personName11.setNamePrefix(namePrefix);
	List<String> givenName = new ArrayList<>();
	givenName.add("1Watchara");
	personName11.setGivenName(givenName);
	personName11.setSurname("1Pongsri");
	personNames11.add(personName11);
	customer11.setPersonName(personNames11);
	List<CitizenCountryName> citizenCountryNames = new ArrayList<>();
	CitizenCountryName citizenCountryName = new CitizenCountryName();
	citizenCountryName.setCode("SG");
	citizenCountryNames.add(citizenCountryName);
	customer11.setCitizenCountryName(citizenCountryNames);
	
	profile11.setCustomer(customer11);
	profileInfo11.setProfile(profile11);
	profileInfos11.add(profileInfo11);
	resGuests11.setProfiles(profileInfos11);
	
	
	ResGuest resGuests111 = new ResGuest();
	resGuests111.setResGuestRPH("2");
	
	List<ProfileInfo> profileInfos111 = new ArrayList<>();
	ProfileInfo profileInfo111 = new ProfileInfo();
	Profile profile111 = new Profile();
	CustomerType customer111 = new CustomerType();
	
	List<PersonName> personNames111 = new ArrayList<>();
	PersonName personName111 = new PersonName();
	List<String> namePrefix11 = new ArrayList<>();
	namePrefix11.add("Child");
	personName111.setNamePrefix(namePrefix11);
	List<String> givenName1 = new ArrayList<>();
	givenName1.add("2PACHAI");
	personName111.setGivenName(givenName1);
	personName111.setSurname("2Pongsri");
	personNames111.add(personName111);
	customer111.setPersonName(personNames111);
	
	
	profile111.setCustomer(customer111);
	profileInfo111.setProfile(profile111);
	profileInfos111.add(profileInfo111);
	resGuests111.setProfiles(profileInfos111); 
	
	ResGuest resGuests3 = new ResGuest();
	resGuests3.setResGuestRPH("2");
	
	List<ProfileInfo> profileInfos3 = new ArrayList<>();
	ProfileInfo profileInfo3 = new ProfileInfo();
	Profile profile3 = new Profile();
	CustomerType customer3 = new CustomerType();
	
	List<PersonName> personNames3 = new ArrayList<>();
	PersonName personName3 = new PersonName();
	List<String> namePrefix3 = new ArrayList<>();
	namePrefix3.add("Mr.");
	personName3.setNamePrefix(namePrefix3);
	List<String> givenName3 = new ArrayList<>();
	givenName3.add("3Watchara");
	personName3.setGivenName(givenName3);
	personName3.setSurname("2Pongsri");
	personNames3.add(personName3);
	customer3.setPersonName(personNames3);
	
	
	profile3.setCustomer(customer3);
	profileInfo3.setProfile(profile3);
	profileInfos3.add(profileInfo3);
	resGuests3.setProfiles(profileInfos3); 
	
	resGuestsList11.add(resGuests3);
	resGuestsList11.add(resGuests11);
	resGuestsList11.add(resGuests111);
	hotelReservation21.setResGuests(resGuestsList11);
	
	
	ResGlobalInfo resGlobalInfo1 = new ResGlobalInfo();
	DepositPayments depositPayments1 = new DepositPayments();
	List<GuaranteePayment> payments1 = new ArrayList<>();
	GuaranteePayment guaranteePayment1 = new GuaranteePayment();
	List<AcceptedPayment> acceptedPaymentList1 = new ArrayList<>();
	AcceptedPayment acceptedPayments1 = new AcceptedPayment();
	PaymentCard paymentCard1 = new PaymentCard();
	paymentCard1.setExpireDate("1116");
	CardType cardType1 = new CardType();
	cardType1.setValue("VISA");
	paymentCard1.setCardType(cardType1);
	paymentCard1.setCardHolderName("John Doe");
	EncryptionType cardNumber1 = new EncryptionType();
	cardNumber1.setPlainText("4111111111111111");
	paymentCard1.setCardNumber(cardNumber1);
	ThreeDomainSecurity threeDomainSecurity1 = new ThreeDomainSecurity();
	Results results = new Results();
	results.setCavv("989");
	threeDomainSecurity1.setResults(results);
	paymentCard1.setThreeDomainSecurity(threeDomainSecurity1);
	acceptedPayments1.setPaymentCard(paymentCard1);
	acceptedPaymentList1.add(acceptedPayments1);
	guaranteePayment1.setAcceptedPayments(acceptedPaymentList1);
	payments1.add(guaranteePayment1);
	depositPayments1.setGuaranteePayment(payments1);
	resGlobalInfo1.setDepositPayments(depositPayments1);
	
	Total total1 = new Total();
	total1.setCurrencyCode("USD");
	BigDecimal amountAfterTax11 = new BigDecimal("1427");
	total1.setAmountAfterTax(amountAfterTax11);
	resGlobalInfo1.setTotal(total1);
	
	
	BasicPropertyInfo basicPropertyInfo3 = new BasicPropertyInfo();
	basicPropertyInfo3.setHotelCode("205112");
	resGlobalInfo1.setBasicPropertyInfo(basicPropertyInfo3);
	hotelReservation21.setResGlobalInfo(resGlobalInfo1);
	reservations1.add(hotelReservation21);
	hotelResRequest21.setHotelReservations(reservations1);
	hotelResReadRequestData2.setHotelResRq(hotelResRequest21);
	hotelResReadRequestList.add(hotelResReadRequestData1);
	hotelResReadRequestList.add(hotelResReadRequestData);
	hotelResReadRequestList.add(hotelResReadRequestData2);
	requestWrapper.setHotelResReadRequest(hotelResReadRequestList);
	
	accoService.otaAccoCreateBooking(requestWrapper);
    }
}
