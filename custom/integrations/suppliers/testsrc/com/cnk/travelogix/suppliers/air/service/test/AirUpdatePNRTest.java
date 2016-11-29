package com.cnk.travelogix.suppliers.air.service.test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.suppliers.air.data.CountryName;
import com.cnk.travelogix.suppliers.air.data.Document;
import com.cnk.travelogix.suppliers.air.data.Address;
import com.cnk.travelogix.suppliers.air.data.AirBookModify;
import com.cnk.travelogix.suppliers.air.data.AirBookModifyRQ;
import com.cnk.travelogix.suppliers.air.data.AirBookModifyRequest;
import com.cnk.travelogix.suppliers.air.data.AirBookModifyRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirBookResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirItinerary;
import com.cnk.travelogix.suppliers.air.data.AirTraveler;
import com.cnk.travelogix.suppliers.air.data.BookingReferenceID;
import com.cnk.travelogix.suppliers.air.data.Email;
import com.cnk.travelogix.suppliers.air.data.FlightSegment;
import com.cnk.travelogix.suppliers.air.data.FormattedTextType;
import com.cnk.travelogix.suppliers.air.data.OriginDestinationOption;
import com.cnk.travelogix.suppliers.air.data.PassengerTypeQuantity;
import com.cnk.travelogix.suppliers.air.data.PersonName;
import com.cnk.travelogix.suppliers.air.data.ProfileRef;
import com.cnk.travelogix.suppliers.air.data.StateProv;
import com.cnk.travelogix.suppliers.air.data.Telephone;
import com.cnk.travelogix.suppliers.air.data.TravelerInfo;
import com.cnk.travelogix.suppliers.air.data.TravelerRefNumber;
import com.cnk.travelogix.suppliers.air.data.UniqueID;
import com.cnk.travelogix.suppliers.air.service.SupplierAirService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.POSType;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SourceType;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;

public class AirUpdatePNRTest {
    public static void main(String[] args) {
	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
	SupplierAirService airService = (SupplierAirService) appContext.getBean("supplierAirService");

	AirBookModifyRequestWrapper request = new AirBookModifyRequestWrapper();

	AirBookModifyRequest airbookmodifyrequest = new AirBookModifyRequest();

	RequestHeader requestHeader = new RequestHeader();
	requestHeader.setSessionID("addpax");
	requestHeader.setUserID("aswartha");
	requestHeader.setTransactionID("2waytest");

	Map<String, String> credentialsMap = new HashMap<String, String>();
	credentialsMap.put("CarrierCode", "SbONUaS32aE=");
	credentialsMap.put("LogonID", "EibTq0yoY6aqGhn/c4fsuQ==");
	credentialsMap.put("Password", "D90fGods8eA=");
	credentialsMap.put("IATACode", "rl11wPH01HJFmrQyCF4gkg==");
	credentialsMap.put("UserName", "NLMJgS+AwXg=");
	credentialsMap.put("Password1", "81M/EiU64J0QjZ2xrmvrxQ==");
	credentialsMap.put("LFID", "2Dyi23lTqClF6n4m1kKslQ==");

	List<SupplierCredentials> supplierCredentials = new ArrayList<SupplierCredentials>();
	SupplierCredentials supplierCredential = new SupplierCredentials();
	SupplierID supplierIDHeader = new SupplierID();
	supplierIDHeader.setValue("GOAIR");
	supplierCredential.setSupplierID(supplierIDHeader);

	Credentials credentials = new Credentials();

	List<Credential> credentialList = new ArrayList<>();
	for (final Map.Entry<String, String> keyValueMap : credentialsMap.entrySet()) {
	    Credential credential = new Credential();
	    credential.setName(keyValueMap.getKey());
	    credential.setValue(keyValueMap.getValue());
	    credential.setIsEncrypted(true);
	    credentialList.add(credential);
	}
	credentials.setCredential(credentialList);


	Map<String, String> operationURLMap = new HashMap<String, String>();
	operationURLMap.put("search", "http://g8.connectpoint.uat.radixx.com/ConnectPoint.Pricing.svc");
	operationURLMap.put("price", "http://g8.connectpoint.uat.radixx.com/ConnectPoint.Pricing.svc");
	operationURLMap.put("ssr", "http://g8.connectpoint.uat.radixx.com/ConnectPoint.Pricing.svc");
	operationURLMap.put("seatmap", "http://g8.connectpoint.uat.radixx.com/ConnectPoint.Flight.svc");
	operationURLMap.put("book", "http://g8.connectpoint.uat.radixx.com/ConnectPoint.Reservation.svc");
	operationURLMap.put("payment", "http://g8.connectpoint.uat.radixx.com/ConnectPoint.Fulfillment.svc");
	operationURLMap.put("retrievepnr", "http://g8.connectpoint.uat.radixx.com/ConnectPoint.Reservation.svc");
	operationURLMap.put("updatepnr", "http://g8.connectpoint.uat.radixx.com/ConnectPoint.Reservation.svc");
	operationURLMap.put("modifypnr", "http://g8.connectpoint.uat.radixx.com/ConnectPoint.Reservation.svc");
	operationURLMap.put("cancel", "http://g8.connectpoint.uat.radixx.com/ConnectPoint.Reservation.svc");
	operationURLMap.put("retrievefarequotedaterange", "http://g8.connectpoint.uat.radixx.com/ConnectPoint.Pricing.svc");
	operationURLMap.put("getsession", "http://g8.connectpoint.uat.radixx.com/ConnectPoint.Security.svc");
	operationURLMap.put("logintravelagency", "http://g8.connectpoint.uat.radixx.com/ConnectPoint.TravelAgents.svc");



	List<OperationURL> operationURLList = new ArrayList<>();
	for (final Map.Entry<String, String> keyValueMap : operationURLMap.entrySet()) {
	OperationURL operationURL = new OperationURL();
	operationURL.setValue(keyValueMap.getValue());
	operationURL.setOperation(keyValueMap.getKey());
	operationURLList.add(operationURL);
	}
	credentials.setOperationURL(operationURLList);

	supplierCredential.setCredentials(credentials);
	supplierCredentials.add(supplierCredential);
	requestHeader.setSupplierCredentials(supplierCredentials);
	request.setRequestHeader(requestHeader);

	AirBookModifyRQ airBookModifyRQ  = new AirBookModifyRQ();
	BigDecimal bigDecimal = new BigDecimal("1");
	airBookModifyRQ.setVersion(bigDecimal);
	airBookModifyRQ.setTarget("Test");

	POSType pos = new POSType();
	List<SourceType> source = new ArrayList<>();
	pos.setSource(source);
	airBookModifyRQ.setPos(pos);

	AirBookModify airBookModify = new AirBookModify();
	airBookModify.setModificationType("9");
	AirItinerary airItinerary = new AirItinerary();
	List<OriginDestinationOption> originDestinationOptions = new ArrayList<>();
	OriginDestinationOption destinationOption = new OriginDestinationOption();

	List<FlightSegment> flightSegments = new ArrayList<>();
	FlightSegment flightSegment = new FlightSegment();
	flightSegment.setDepartureDateTime(getDateFromString("2016-07-20"));
	flightSegment.setFareBasisCode("1");
	TPAExtensions tpaFlightSegment = new TPAExtensions();
	Map<String, String> keyValueMap = new HashMap<>();
	keyValueMap.put("ExtendedRPH", "42742");
	keyValueMap.put("QuoteID", "na");
	tpaFlightSegment.setKeyValueMap(keyValueMap);
	flightSegment.setTpaExtensions(tpaFlightSegment);

	FlightSegment flightSegment1 = new FlightSegment();
	flightSegment1.setDepartureDateTime(getDateFromString("2016-07-24"));
	flightSegment1.setFareBasisCode("33");
	TPAExtensions tpaFlightSegment1 = new TPAExtensions();
	Map<String, String> keyValueMap1 = new HashMap<>();
	keyValueMap1.put("ExtendedRPH", "41051");
	keyValueMap1.put("QuoteID", "na");
	tpaFlightSegment1.setKeyValueMap(keyValueMap1);
	flightSegment1.setTpaExtensions(tpaFlightSegment1);

	flightSegments.add(flightSegment);
	flightSegments.add(flightSegment1);
	destinationOption.setFlightSegments(flightSegments);
	originDestinationOptions.add(destinationOption);
	airItinerary.setOriginDestinationOptions(originDestinationOptions);

	airBookModify.setAirItinerary(airItinerary);

	TravelerInfo travelerInfo = new TravelerInfo();
	List<AirTraveler> airTravelers = new ArrayList<>();
	AirTraveler traveller = new AirTraveler();
	traveller.setBirthDate(getDateFromString("1989-12-19"));
	traveller.setGender("MALE");

	ProfileRef profile = new ProfileRef();
	UniqueID uid = new UniqueID();
	uid.setId("41761029");
	uid.setType("1");
	profile.setUniqueID(uid);
	traveller.setProfileRef(profile);

	PersonName personName = new PersonName();
	List<String> gName = new ArrayList<>();
	gName.add("Newpassenger");
	List<String> nameP = new ArrayList<>();
	nameP.add("MR.");
	List<String> mName = new ArrayList<>();
	mName.add("Testpassengerst");
	personName.setGivenName(gName);
	personName.setNamePrefix(nameP);
	personName.setMiddleName(mName);
	personName.setSurname("test");
	traveller.setPersonName(personName);


	List<Telephone> telephones = new ArrayList<>();
	Telephone telephone = new Telephone();
	telephone.setPhoneNumber("9999988888");
	telephone.setCountryAccessCode("91");
	telephones.add(telephone);
	traveller.setTelephones(telephones);

	List<Email> emails = new ArrayList<>();
	Email email = new Email();
	email.setValue("awartha@gmail.com");
	emails.add(email);
	traveller.setEmails(emails);

	List<Address> addresses = new ArrayList<>();
	Address address = new Address();
	List<String> addressLine = new ArrayList<>();
	addressLine.add("milatryroad");
	addressLine.add("marol");

	address.setCityName("mumbai");
	address.setPostalCode("400081");

	StateProv stateProv = new StateProv();
	stateProv.setStateCode("MH");
	stateProv.setValue("MH");
	address.setStateProv(stateProv);

	CountryName countryName = new CountryName();
	countryName.setCode("IN");
	countryName.setValue("INDIA");
	address.setCountryName(countryName);

	address.setAddressLine(addressLine);
	addresses.add(address);
	traveller.setAddresses(addresses);

	List<Document> documents = new ArrayList<>();
	Document document = new Document();
	document.setDocID("B122411");
	document.setDocHolderNationality("IN");
	documents.add(document);
	traveller.setDocuments(documents);

	List<PassengerTypeQuantity> passengerTypeQuantities = new ArrayList<>();
	PassengerTypeQuantity passengerTypeQuantity = new PassengerTypeQuantity();
	passengerTypeQuantity.setAge(35);
	passengerTypeQuantity.setCode("ADT");
	passengerTypeQuantities.add(passengerTypeQuantity);
	traveller.setPassengerTypeQuantity(passengerTypeQuantities);

	TravelerRefNumber travelerRefNumber = new TravelerRefNumber();
	travelerRefNumber.setRph("11");
	traveller.setTravelerRefNumber(travelerRefNumber);

	airTravelers.add(traveller);
	travelerInfo.setAirTravelers(airTravelers);
	airBookModify.setTravelerInfo(travelerInfo);

	FormattedTextType comment = new FormattedTextType();
	comment.setTextFormat("addpax");
	airBookModify.setComment(comment);

	List<BookingReferenceID> bookingReferenceId = new ArrayList<>();
	BookingReferenceID bookingReferenceIDs = new BookingReferenceID();
	bookingReferenceIDs.setId("2E3PND");
	bookingReferenceIDs.setType("299");
	bookingReferenceId.add(bookingReferenceIDs);
	airBookModify.setBookingReferenceId(bookingReferenceId);

	airBookModifyRQ.setAirBookModify(airBookModify);
	airbookmodifyrequest.setAirBookModifyRQ(airBookModifyRQ);
	request.setAirBookModifyRequest(airbookmodifyrequest);
	request.setRequestHeader(requestHeader);

	AirBookResponseWrapper response = airService.otaAirBookModifyUpdatePNR(request);
	System.out.println("*******************response************* = "+response);
    }

    private static Date getDateFromString(String s) {
	//String s = "03/24/2013 21:54";
	Date date = null;
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	try {
	    date = simpleDateFormat.parse(s);
	    System.out.println("date : " + simpleDateFormat.format(date));
	} catch (ParseException ex) {
	    System.out.println("Exception " + ex);
	}
	return date;
    }
}
