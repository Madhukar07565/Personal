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
import com.cnk.travelogix.suppliers.air.data.PriceRequestInformation;
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

public class AirRePriceTest {
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
	
	/*PriceRequestInformation priceRequestInformation = new PriceRequestInformation();
	priceRequestInformation.set
	travelerInfoSummary.setPriceRequestInformation(priceRequestInformation);*/
	
	TPAExtensions tpaTravelInfo = new TPAExtensions();
	Map<String, String> keyValueMap = new HashMap<>();
	keyValueMap.put("TripType", "OneWay");
	keyValueMap.put("NearbyDepartures", "false");
	keyValueMap.put("NearbyDestinations", "false");
	tpaTravelInfo.setKeyValueMap(keyValueMap);
	travelerInfoSummary.setTpaExtensions(tpaTravelInfo);
	
	airPriceRQ.setTravelerInfoSummary(travelerInfoSummary);
	airAirPriceRequest.setAirPriceRQ(airPriceRQ);
	airAirPriceRequests.add(airAirPriceRequest);
	requestWrapper.setAirAirPriceRequests(airAirPriceRequests);
	airService.otaAirRePrice(requestWrapper);
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
