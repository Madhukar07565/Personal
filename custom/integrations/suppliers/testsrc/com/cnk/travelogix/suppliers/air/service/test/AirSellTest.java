package com.cnk.travelogix.suppliers.air.service.test;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.suppliers.air.data.Address;
import com.cnk.travelogix.suppliers.air.data.AirItinerary;
import com.cnk.travelogix.suppliers.air.data.AirPriceRQ;
import com.cnk.travelogix.suppliers.air.data.AirPriceRequest;
import com.cnk.travelogix.suppliers.air.data.AirPriceRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirTraveler;
import com.cnk.travelogix.suppliers.air.data.ArrivalAirport;
import com.cnk.travelogix.suppliers.air.data.CountryName;
import com.cnk.travelogix.suppliers.air.data.DepartureAirport;
import com.cnk.travelogix.suppliers.air.data.Document;
import com.cnk.travelogix.suppliers.air.data.Email;
import com.cnk.travelogix.suppliers.air.data.FlightSegment;
import com.cnk.travelogix.suppliers.air.data.OperatingAirline;
import com.cnk.travelogix.suppliers.air.data.OriginDestinationOption;
import com.cnk.travelogix.suppliers.air.data.PassengerTypeQuantity;
import com.cnk.travelogix.suppliers.air.data.PersonName;
import com.cnk.travelogix.suppliers.air.data.Telephone;
import com.cnk.travelogix.suppliers.air.data.TravelerInfoSummary;
import com.cnk.travelogix.suppliers.air.data.TravelerInformation;
import com.cnk.travelogix.suppliers.air.service.SupplierAirService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;

public class AirSellTest {

    public static void main(String[] args) {
	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
	SupplierAirService airService = (SupplierAirService) appContext.getBean("supplierAirService");

	AirPriceRequestWrapper requestWrapper = new AirPriceRequestWrapper();

	RequestHeader requestHeader = new RequestHeader();
	requestHeader.setSessionID("Sabre_1");
	requestHeader.setUserID("PERF");
	requestHeader.setTransactionID("Search_1");

	Map<String, String> credentialsMap = new HashMap<String, String>();
	credentialsMap.put("Username", "SBj3tNir+Ko=");
	credentialsMap.put("Password", "eq7vMf+HQB4=");
	credentialsMap.put("Organization", "uKsgtv3gvfM=");
	credentialsMap.put("PseudoCityCode", "uKsgtv3gvfM=");
	credentialsMap.put("CompanyCode", "GrPsFOYmmr4=");

	List<SupplierCredentials> supplierCredentials = new ArrayList<SupplierCredentials>();
	SupplierCredentials supplierCredential = new SupplierCredentials();
	SupplierID supplierIDHeader = new SupplierID();
	supplierIDHeader.setValue("SABRE");
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

	List<OperationURL> operationURLList = new ArrayList<>();
	OperationURL operationURL = new OperationURL();
	operationURL.setValue("https://sws3-crt.cert.sabre.com/");
	operationURL.setOperation("all");
	operationURLList.add(operationURL);
	credentials.setOperationURL(operationURLList);

	supplierCredential.setCredentials(credentials);
	supplierCredentials.add(supplierCredential);
	requestHeader.setSupplierCredentials(supplierCredentials);
	requestWrapper.setRequestHeader(requestHeader);

	List<AirPriceRequest> airAirPriceRequests = new ArrayList<>();
	AirPriceRequest airAirPriceRequest = new AirPriceRequest();
	SupplierID supplierID = new SupplierID();
	supplierID.setValue("ELSYARRES");
	airAirPriceRequest.setSupplierID(supplierID);
	airAirPriceRequest.setSequence(1);

	AirPriceRQ airPriceRQ = new AirPriceRQ();
	AirItinerary airItinerary = new AirItinerary();
	List<OriginDestinationOption> originDestinationOptions = new ArrayList<>();
	OriginDestinationOption originDestinationOption = new OriginDestinationOption();
	List<FlightSegment> flightSegments = new ArrayList<>();
	FlightSegment flightSegment = new FlightSegment();
	flightSegment.setArrivalDateTime(getDateFromString("2016-07-29"));
	flightSegment.setDepartureDateTime(getDateFromString("2016-07-29"));
	DepartureAirport departureAirport = new DepartureAirport();
	departureAirport.setLocationCode("CGN");
	departureAirport.setCodeContext("Cologne");
	flightSegment.setDepartureAirport(departureAirport);
	ArrivalAirport arrivalAirport = new ArrivalAirport();
	arrivalAirport.setLocationCode("TXL");
	arrivalAirport.setCodeContext("Berlin Tegel");
	flightSegment.setArrivalAirport(arrivalAirport);
	OperatingAirline operatingAirline = new OperatingAirline();
	operatingAirline.setCode("_1");
	operatingAirline.setCompanyShortName("Fake Carrier");
	operatingAirline.setFlightNumber("_11000");
	flightSegment.setOperatingAirline(operatingAirline);

	TPAExtensions tpaExtensions = new TPAExtensions();
	Map<String, String> keyValueMap = new HashMap<>();
	keyValueMap.put("ExtendedRPH", "_4-160701063731-01-1628196-6307|_4-160701063731-01-1628348-5821");
	tpaExtensions.setKeyValueMap(keyValueMap);
	flightSegment.setTpaExtensions(tpaExtensions);

	flightSegments.add(flightSegment);
	originDestinationOption.setFlightSegments(flightSegments);
	originDestinationOptions.add(originDestinationOption);
	airItinerary.setOriginDestinationOptions(originDestinationOptions);
	airPriceRQ.setAirItinerary(airItinerary);

	TravelerInfoSummary travelerInfoSummary = new TravelerInfoSummary();
	List<TravelerInformation> travelerInformations = new ArrayList<>();
	TravelerInformation travelerInformation = new TravelerInformation();
	List<PassengerTypeQuantity> passengerTypeQuantitys = new ArrayList<>();
	PassengerTypeQuantity passengerTypeQuantity = new PassengerTypeQuantity();
	passengerTypeQuantity.setCode("ADT");
	passengerTypeQuantity.setQuantity(new BigInteger("1"));
	passengerTypeQuantitys.add(passengerTypeQuantity);
	travelerInformation.setPassengerTypeQuantity(passengerTypeQuantitys);

	AirTraveler airTraveler = new AirTraveler();
	airTraveler.setGender("Male");
	airTraveler.setBirthDate(getDateFromString("1987-09-24"));
	airTraveler.setPassengerTypeCode("ADT");

	PersonName personName = new PersonName();
	List<String> givenNames = new ArrayList<String>();
	givenNames.add("VK");
	personName.setGivenName(givenNames);
	personName.setSurname("Clv");
	airTraveler.setPersonName(personName);

	List<Telephone> telephones = new ArrayList<>();
	Telephone telephone = new Telephone();
	telephone.setCountryAccessCode("91");
	telephone.setPhoneNumber("9741100668");
	telephones.add(telephone);
	airTraveler.setTelephones(telephones);

	List<Email> emails = new ArrayList<>();
	Email email = new Email();
	email.setValue("abcanj@gmail.com");
	emails.add(email);
	airTraveler.setEmails(emails);

	List<Address> addresses = new ArrayList<>();
	Address address = new Address();
	address.setCityName("Thane");
	address.setPostalCode("401107");
	CountryName countryName = new CountryName();
	countryName.setCode("In");
	countryName.setValue("India");
	address.setCountryName(countryName);
	addresses.add(address);
	airTraveler.setAddresses(addresses);

	List<Document> documents = new ArrayList<>();
	Document doccument = new Document();
	doccument.setDocIssueLocation("Mumbai");
	doccument.setDocID("008810");
	doccument.setDocType("02");
	//doccument.setDocIssueCountry();
	doccument.setEffectiveDate(getDateFromString("2015-01-22"));
	doccument.setExpireDate(getDateFromString("2017-01-22"));
	documents.add(doccument);
	airTraveler.setDocuments(documents);

	//travelerInformation.setAirTraveler(airTraveler);
	travelerInformations.add(travelerInformation);
	travelerInfoSummary.setAirTraveler(travelerInformations);

	TPAExtensions tpaExtensionsTwo = new TPAExtensions();
	travelerInfoSummary.setTpaExtensions(tpaExtensionsTwo);
	airPriceRQ.setTravelerInfoSummary(travelerInfoSummary);

	airAirPriceRequest.setAirPriceRQ(airPriceRQ);
	airAirPriceRequests.add(airAirPriceRequest);

	requestWrapper.setAirAirPriceRequests(airAirPriceRequests);
	airService.otaAirPriceSell(requestWrapper);

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
