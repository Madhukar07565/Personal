package com.cnk.travelogix.suppliers.air.service.test;

import java.math.BigDecimal;
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

import com.cnk.travelogix.suppliers.air.data.AirItinerary;
import com.cnk.travelogix.suppliers.air.data.AirPriceRQ;
import com.cnk.travelogix.suppliers.air.data.AirPriceRequest;
import com.cnk.travelogix.suppliers.air.data.AirPriceRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.ArrivalAirport;
import com.cnk.travelogix.suppliers.air.data.DepartureAirport;
import com.cnk.travelogix.suppliers.air.data.FlightSegment;
import com.cnk.travelogix.suppliers.air.data.OperatingAirline;
import com.cnk.travelogix.suppliers.air.data.OriginDestinationOption;
import com.cnk.travelogix.suppliers.air.data.PassengerTypeQuantity;
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

public class AirPriceTest {

    public static void main(String[] args) {
	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
	SupplierAirService airService = (SupplierAirService) appContext.getBean("supplierAirService");

	AirPriceRequestWrapper requestWrapper = new AirPriceRequestWrapper();

	RequestHeader requestHeader = new RequestHeader();
	requestHeader.setSessionID("123");
	requestHeader.setUserID("Test");
	requestHeader.setTransactionID("10");

	Map<String, String> credentialsMap = new HashMap<String, String>();
	credentialsMap.put("Username", "4MgGHbPKz6U=");
	credentialsMap.put("Password", "axGEzV07h0NIPM4R38rGRw=");
	credentialsMap.put("AccountNumber", "v40VzSBj3tNirmknWJtriarBbYN33g==");
	

	List<SupplierCredentials> supplierCredentials = new ArrayList<SupplierCredentials>();
	SupplierCredentials supplierCredential = new SupplierCredentials();
	SupplierID supplierIDHeader = new SupplierID();
	supplierIDHeader.setValue("MYSTIFLY");
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
	Map<String, String> operationUrlMap = new HashMap<String, String>();
	operationUrlMap.put("getsession", "http://testapi.myfarebox.com/V2/OnePoint.svc");
	operationUrlMap.put("search", "http://testapi.myfarebox.com/V2/OnePoint.svc");
	operationUrlMap.put("price", "http://testapi.myfarebox.com/V2/OnePoint.svc");
	operationUrlMap.put("farerule", "http://testapi.myfarebox.com/V2/OnePoint.svc");
	operationUrlMap.put("issueticket", "http://testapi.myfarebox.com/V2/OnePoint.svc");
	operationUrlMap.put("book", "http://testapi.myfarebox.com/V2/OnePoint.svc");
	operationUrlMap.put("retrievepnr", "http://testapi.myfarebox.com/V2/OnePoint.svc");
	operationUrlMap.put("messagequeue", "http://testapi.myfarebox.com/V2/OnePoint.svc");
	operationUrlMap.put("removemessagequeue", "http://testapi.myfarebox.com/V2/OnePoint.svc");
	
	List<OperationURL> operationURLList = new ArrayList<>();
	for (final Map.Entry<String, String> keyValueMap : operationUrlMap.entrySet()) {
	OperationURL operationURL = new OperationURL();
	operationURL.setValue(keyValueMap.getValue());
	operationURL.setOperation(keyValueMap.getKey());
	operationURLList.add(operationURL);
	credentials.setOperationURL(operationURLList);
	}

	supplierCredential.setCredentials(credentials);
	supplierCredentials.add(supplierCredential);
	requestHeader.setSupplierCredentials(supplierCredentials);
	requestWrapper.setRequestHeader(requestHeader);

	List<AirPriceRequest> airAirPriceRequests = new ArrayList<>();
	AirPriceRequest airAirPriceRequest = new AirPriceRequest();
	SupplierID supplierID = new SupplierID();
	supplierID.setValue("MYSTIFLY");
	airAirPriceRequest.setSupplierID(supplierID);
	airAirPriceRequest.setSequence(1);

	AirPriceRQ airPriceRQ = new AirPriceRQ();
	airPriceRQ.setVersion(new BigDecimal("1"));
	airPriceRQ.setTarget("Test");
	AirItinerary airItinerary = new AirItinerary();
	airItinerary.setDirectionInd("OneWay");
	List<OriginDestinationOption> originDestinationOptionsList = new ArrayList<>();
	OriginDestinationOption originDestinationOption = new OriginDestinationOption();
	List<FlightSegment> flightSegments = new ArrayList<>();
	FlightSegment flightSegment = new FlightSegment();
	flightSegment.setArrivalDateTime(getDateFromString("2016-07-11"));
	flightSegment.setDepartureDateTime(getDateFromString("2016-07-11"));
	BigInteger bigInteger = new BigInteger("0");
	flightSegment.setStopQuantity(bigInteger);
	flightSegment.setFlightNumber("5267");
	DepartureAirport departureAirport = new DepartureAirport();
	departureAirport.setLocationCode("LHR");
	flightSegment.setDepartureAirport(departureAirport);
	ArrivalAirport arrivalAirport = new ArrivalAirport();
	arrivalAirport.setLocationCode("DUS");
	flightSegment.setArrivalAirport(arrivalAirport);
	OperatingAirline operatingAirline = new OperatingAirline();
	operatingAirline.setCode("AB");
	operatingAirline.setFlightNumber("5267");
	flightSegment.setOperatingAirline(operatingAirline);
	flightSegments.add(flightSegment);
	
	FlightSegment flightSegment1 = new FlightSegment();
	flightSegment1.setArrivalDateTime(getDateFromString("2016-07-11"));
	flightSegment1.setDepartureDateTime(getDateFromString("2016-07-11"));
	BigInteger bigInteger1 = new BigInteger("0");
	flightSegment1.setStopQuantity(bigInteger1);
	flightSegment1.setFlightNumber("7480");
	DepartureAirport departureAirport1 = new DepartureAirport();
	departureAirport1.setLocationCode("DUS");
	flightSegment1.setDepartureAirport(departureAirport1);
	ArrivalAirport arrivalAirport1 = new ArrivalAirport();
	arrivalAirport1.setLocationCode("JFK");
	flightSegment1.setArrivalAirport(arrivalAirport1);
	OperatingAirline operatingAirline1 = new OperatingAirline();
	operatingAirline1.setCode("AB");
	operatingAirline1.setFlightNumber("7480");
	flightSegment1.setOperatingAirline(operatingAirline1);
	flightSegments.add(flightSegment1);
	
	originDestinationOption.setFlightSegments(flightSegments);
	originDestinationOptionsList.add(originDestinationOption);
	airItinerary.setOriginDestinationOptions(originDestinationOptionsList);
	airPriceRQ.setAirItinerary(airItinerary);

	TravelerInfoSummary travelerInfoSummary = new TravelerInfoSummary();
	
	List<TravelerInformation> airTravelerList = new ArrayList<>();
	TravelerInformation airTraveler = new TravelerInformation();
	List<PassengerTypeQuantity> passengerTypeQuantities = new ArrayList<>();
	PassengerTypeQuantity passengerTypeQuantity = new PassengerTypeQuantity();
	passengerTypeQuantity.setCode("ADT");
	passengerTypeQuantity.setQuantity(new BigInteger("2"));
	passengerTypeQuantities.add(passengerTypeQuantity);
	airTraveler.setPassengerTypeQuantity(passengerTypeQuantities);
	airTravelerList.add(airTraveler);
	
	TravelerInformation airTraveler1 = new TravelerInformation();
	List<PassengerTypeQuantity> passengerTypeQuantities2 = new ArrayList<>();
	PassengerTypeQuantity passengerTypeQuantity1 = new PassengerTypeQuantity();
	passengerTypeQuantity1.setCode("INF");
	passengerTypeQuantity1.setQuantity(new BigInteger("2"));
	passengerTypeQuantities2.add(passengerTypeQuantity1);
	airTraveler1.setPassengerTypeQuantity(passengerTypeQuantities2);
	airTravelerList.add(airTraveler1);
	travelerInfoSummary.setAirTraveler(airTravelerList);
	
	TPAExtensions tpaTravelInfo = new TPAExtensions();
	Map<String, String> keyValueMap = new HashMap<>();
	keyValueMap.put("TripType", "OneWay");
	keyValueMap.put("NearbyDepartures", "false");
	keyValueMap.put("NearbyDestinations", "false");
	tpaTravelInfo.setKeyValueMap(keyValueMap);
	travelerInfoSummary.setTpaExtensions(tpaTravelInfo);
	
	airPriceRQ.setTravelerInfoSummary(travelerInfoSummary);
	airAirPriceRequest.setAirPriceRQ(airPriceRQ);
	
	AirPriceRequest airAirPriceRequest1 = new AirPriceRequest();
	SupplierID supplierID1 = new SupplierID();
	supplierID1.setValue("ELSYARRES");
	airAirPriceRequest1.setSupplierID(supplierID1);
	airAirPriceRequest1.setSequence(2);

	AirPriceRQ airPriceRQ1 = new AirPriceRQ();
	airPriceRQ1.setVersion(new BigDecimal("8.2"));
	airPriceRQ1.setTarget("Test");
	airPriceRQ1.setPrimaryLangID("EN");
	AirItinerary airItinerary1 = new AirItinerary();
	List<OriginDestinationOption> originDestinationOptionsList1 = new ArrayList<>();
	OriginDestinationOption originDestinationOption1 = new OriginDestinationOption();
	List<FlightSegment> flightSegments1 = new ArrayList<>();
	FlightSegment flightSegment11 = new FlightSegment();
	flightSegment11.setArrivalDateTime(getDateFromString("2016-07-09"));
	flightSegment11.setDepartureDateTime(getDateFromString("2016-07-09"));
	BigInteger bigInteger11 = new BigInteger("0");
	flightSegment11.setStopQuantity(bigInteger11);
	DepartureAirport departureAirport11 = new DepartureAirport();
	departureAirport11.setLocationCode("CGN");
	departureAirport11.setCodeContext("Cologne");
	flightSegment11.setDepartureAirport(departureAirport11);
	ArrivalAirport arrivalAirport11 = new ArrivalAirport();
	arrivalAirport11.setLocationCode("TXL");
	arrivalAirport11.setCodeContext("Berlin Tegel");
	flightSegment11.setArrivalAirport(arrivalAirport11);
	OperatingAirline operatingAirline11 = new OperatingAirline();
	operatingAirline11.setCode("_1");
	operatingAirline11.setFlightNumber("_11000");
	operatingAirline11.setCompanyShortName("Fake Carrier");
	flightSegment11.setOperatingAirline(operatingAirline11);
	
	TPAExtensions tpaFlightSegment = new TPAExtensions();
	Map<String, String> keyValueMap1 = new HashMap<>();
	keyValueMap1.put("ExtendedRPH", "_4-160701063731-01-1628196-6307|_4-160701063731-01-1628348-5821");
	tpaFlightSegment.setKeyValueMap(keyValueMap1);
	flightSegment11.setTpaExtensions(tpaFlightSegment);
	
	flightSegments1.add(flightSegment11);
	
	originDestinationOption1.setFlightSegments(flightSegments1);
	originDestinationOptionsList1.add(originDestinationOption1);
	airItinerary1.setOriginDestinationOptions(originDestinationOptionsList1);
	airPriceRQ1.setAirItinerary(airItinerary1);

	
	TravelerInfoSummary travelerInfoSummary1 = new TravelerInfoSummary();
	
	List<TravelerInformation> airTravelerList1 = new ArrayList<>();
	TravelerInformation airTraveler2 = new TravelerInformation();
	List<PassengerTypeQuantity> passengerTypeQuantity21 = new ArrayList<>();
	PassengerTypeQuantity passengerTypeQuantity2 = new PassengerTypeQuantity();
	passengerTypeQuantity2.setCode("ADT");
	passengerTypeQuantity2.setQuantity(new BigInteger("2"));
	passengerTypeQuantity21.add(passengerTypeQuantity2);
	airTraveler2.setPassengerTypeQuantity(passengerTypeQuantity21);
	airTravelerList1.add(airTraveler2);
	
	TravelerInformation airTraveler11 = new TravelerInformation();
	PassengerTypeQuantity passengerTypeQuantity11 = new PassengerTypeQuantity();
	passengerTypeQuantity11.setCode("CHD");
	passengerTypeQuantity11.setQuantity(new BigInteger("1"));
	airTraveler11.setPassengerTypeQuantity(passengerTypeQuantity21);
	airTravelerList1.add(airTraveler11);
	travelerInfoSummary1.setAirTraveler(airTravelerList1);
	
	TravelerInformation airTraveler111 = new TravelerInformation();
	List<PassengerTypeQuantity> passengerTypeQuantities3 = new ArrayList<>();
	PassengerTypeQuantity passengerTypeQuantity111 = new PassengerTypeQuantity();
	passengerTypeQuantity111.setCode("INF");
	passengerTypeQuantity111.setQuantity(new BigInteger("1"));
	passengerTypeQuantities3.add(passengerTypeQuantity111);
	airTraveler111.setPassengerTypeQuantity(passengerTypeQuantities3);
	airTravelerList1.add(airTraveler111);
	travelerInfoSummary1.setAirTraveler(airTravelerList1);
	
	TPAExtensions tpaTravelInfo1 = new TPAExtensions();
	Map<String, String> keyValueMap11 = new HashMap<>();
	keyValueMap11.put("TripType", "Return");
	keyValueMap11.put("NearbyDepartures", "false");
	keyValueMap11.put("NearbyDestinations", "false");
	tpaTravelInfo1.setKeyValueMap(keyValueMap11);
	travelerInfoSummary1.setTpaExtensions(tpaTravelInfo1);
	
	airPriceRQ1.setTravelerInfoSummary(travelerInfoSummary1);
	airAirPriceRequest1.setAirPriceRQ(airPriceRQ1);
	airAirPriceRequests.add(airAirPriceRequest);
	airAirPriceRequests.add(airAirPriceRequest1);
	requestWrapper.setAirAirPriceRequests(airAirPriceRequests);
	airService.otaAirPrice(requestWrapper);

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
