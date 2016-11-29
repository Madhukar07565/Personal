package com.cnk.travelogix.suppliers.air.service.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.suppliers.air.data.Address;
import com.cnk.travelogix.suppliers.air.data.AirBookRQ;
import com.cnk.travelogix.suppliers.air.data.AirBookRequest;
import com.cnk.travelogix.suppliers.air.data.AirBookRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirBookResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirItinerary;
import com.cnk.travelogix.suppliers.air.data.AirTraveler;
import com.cnk.travelogix.suppliers.air.data.ArrivalAirport;
import com.cnk.travelogix.suppliers.air.data.CountryName;
import com.cnk.travelogix.suppliers.air.data.DepartureAirport;
import com.cnk.travelogix.suppliers.air.data.Document;
import com.cnk.travelogix.suppliers.air.data.Email;
import com.cnk.travelogix.suppliers.air.data.FlightSegment;
import com.cnk.travelogix.suppliers.air.data.MarketingAirline;
import com.cnk.travelogix.suppliers.air.data.OperatingAirline;
import com.cnk.travelogix.suppliers.air.data.OriginDestinationOption;
import com.cnk.travelogix.suppliers.air.data.PersonName;
import com.cnk.travelogix.suppliers.air.data.ProfileRef;
import com.cnk.travelogix.suppliers.air.data.StateProv;
import com.cnk.travelogix.suppliers.air.data.Telephone;
import com.cnk.travelogix.suppliers.air.data.TravelerRefNumber;
import com.cnk.travelogix.suppliers.air.data.UniqueID;
import com.cnk.travelogix.suppliers.air.service.SupplierAirService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;

public class AirBookTest {

    private static final Logger LOG = LoggerFactory.getLogger(AirBookTest.class);

    public static void main(String[] args) {

	@SuppressWarnings("resource")
	ApplicationContext appContext = new ClassPathXmlApplicationContext("suppliers-spring.xml");
	SupplierAirService airService = (SupplierAirService) appContext.getBean("supplierAirService");


AirBookRequestWrapper requestWrapper = new AirBookRequestWrapper();
	//Request Header
	RequestHeader requestHeader = new RequestHeader();
	requestHeader.setSessionID("sabre_1");
	requestHeader.setUserID("PERF");
	requestHeader.setTransactionID("book_1");

	Map<String, String> credentialsMap = new HashMap<String, String>();
	credentialsMap.put("Username", "SBj3tNir+Ko=");
	credentialsMap.put("Password", "eq7vMf+HQB4=");
	credentialsMap.put("Organization", "uKsgtv3gvfM=");
	credentialsMap.put("PseudoCityCode", "uKsgtv3gvfM=");
	credentialsMap.put("CompanyCode", "GrPsFOYmmr4=");
	credentialsMap.put("Profile", "LJ+MQSljMOo=");
	credentialsMap.put("ETS", "LJ+MQSljMOo=");
	credentialsMap.put("QNumber", "c5eO3GlJp6g=");
	credentialsMap.put("OQNumber", "c5eO3GlJp6g=");
	credentialsMap.put("DQNumber", "HisckbeABCc=");
	

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
	//Request Body
	List<AirBookRequest> airBookRequests = new ArrayList<AirBookRequest>();
	AirBookRequest airBookRequest = new AirBookRequest();
	SupplierID supplierID = new SupplierID();
	supplierID.setValue("SABRE");
	airBookRequest.setSupplierID(supplierID);
	airBookRequest.setSequence(1);

	AirBookRQ airBookRQ = new AirBookRQ();
	airBookRQ.setVersion(new BigDecimal("1"));
	airBookRQ.setTarget("Test");

	//AirItinerary
	AirItinerary airItinerary = new AirItinerary();
	FlightSegment flightSegment = new FlightSegment();
	flightSegment.setStatus("NN");
	flightSegment.setConnectionType("OTH");
	flightSegment.setFlightNumber("355");
	String string = "2016-08-12";
	Date date = getStringAsDate(string);
	flightSegment.setDepartureDateTime(date);

	string = "2016-08-12";

	date = getStringAsDate(string);
	flightSegment.setResBookDesigCode("W");
	flightSegment.setArrivalDateTime(date);
	flightSegment.setStopQuantity(BigInteger.valueOf(0));

	DepartureAirport departureAirport = new DepartureAirport();
	departureAirport.setLocationCode("BOM");
	flightSegment.setDepartureAirport(departureAirport);
	ArrivalAirport arrivalAirport = new ArrivalAirport();
	arrivalAirport.setLocationCode("BOM");
	flightSegment.setArrivalAirport(arrivalAirport);
	OperatingAirline operatingAirline = new OperatingAirline();
	operatingAirline.setFlightNumber("355");
	operatingAirline.setCode("9W");
	flightSegment.setOperatingAirline(operatingAirline);
	MarketingAirline marketingAirline = new MarketingAirline();
	marketingAirline.setCode("9W");
	flightSegment.setMarketingAirline(marketingAirline);
	OriginDestinationOption originDestOptionData = new OriginDestinationOption();
	List<FlightSegment> flightSegments = new ArrayList<FlightSegment>();
	flightSegments.add(flightSegment);
	originDestOptionData.setFlightSegments(flightSegments);
	List<OriginDestinationOption> originDestinationOptions = new ArrayList<OriginDestinationOption>();
	originDestinationOptions.add(originDestOptionData);
	airItinerary.setOriginDestinationOptions(originDestinationOptions);
	airBookRQ.setAirItinerary(airItinerary);

	// TraveleInfo
	List<AirTraveler> travelerInfo = new ArrayList<AirTraveler>();
	AirTraveler airTraveler = new AirTraveler();
	string = "1986-03-13";
	Date birthDate = getStringAsDate(string);
	airTraveler.setBirthDate(birthDate);
	PersonName personName = new PersonName();
	
	List<String> givenNames = new ArrayList<String>();
	String givenName = new String("Bhantu Mr");
	givenNames.add(givenName);
	personName.setGivenName(givenNames);
	personName.setSurname("Jadhav");
	airTraveler.setPersonName(personName);
	
	List<Telephone> telephones = new ArrayList<>();
	Telephone telephone = new Telephone();
	telephone.setPhoneNumber("911234567890");
	telephone.setLocationCode("BOM");
	telephone.setPhoneUseType("B");
	telephones.add(telephone);
	airTraveler.setTelephones(telephones);
	List<Email> emails = new ArrayList<>();
	Email email = new Email();
	email.setValue("Bhantu@gmail.com");
	emails.add(email);
	airTraveler.setEmails(emails);

	Address address = new Address();
	address.setCityName("Mumbai");
	List<String> addressLine = new ArrayList<>();
	addressLine.add("Urmi estate");
	address.setAddressLine(addressLine);
	/*StreetNmbr streetNmbr = new StreetNmbr();
	streetNmbr.set
	address.setStreetNmbr(streetNmbr);*/
	address.setPostalCode("560045");
	CountryName countryName = new CountryName();
	countryName.setCode("IN");
	address.setCountryName(countryName);
	List<Address> addresses = new ArrayList<Address>();
	addresses.add(address);
	airTraveler.setAddresses(addresses);
	
	TravelerRefNumber travelerRefNumber = new TravelerRefNumber();
	travelerRefNumber.setRph("0");
	airTraveler.setTravelerRefNumber(travelerRefNumber);
	travelerInfo.add(airTraveler);
	
	AirTraveler airTraveler1 = new AirTraveler();
	Date birthDate1 = getStringAsDate("2013-03-13");
	airTraveler1.setBirthDate(birthDate1);
	airTraveler1.setPassengerTypeCode("CHD");
	PersonName personName1 = new PersonName();
	
	List<String> givenNames1 = new ArrayList<String>();
	String givenName1 = new String("akshay");
	givenNames1.add(givenName1);
	personName1.setGivenName(givenNames1);
	personName1.setSurname("Mahadik");
	List<String> namePrefix = new ArrayList<String>();
	namePrefix.add("Mr");
	personName1.setNamePrefix(namePrefix);
	airTraveler1.setPersonName(personName1);
	
	List<Telephone> telephones1 = new ArrayList<>();
	Telephone telephone1 = new Telephone();
	telephone1.setPhoneNumber("9167600973");
	telephone1.setCountryAccessCode("91");
	telephones1.add(telephone1);
	airTraveler1.setTelephones(telephones1);
	List<Email> emails1 = new ArrayList<>();
	Email email1 = new Email();
	email1.setValue("amey.mahadik@coxandkings.com");
	emails1.add(email1);
	airTraveler1.setEmails(emails1);

	Address address1 = new Address();
	address1.setCityName("Mumbai");
	List<String> addressLine1 = new ArrayList<>();
	addressLine1.add("23 B Pallavi CHS Azad Road Andheri East");
	address1.setAddressLine(addressLine1);
	/*StreetNmbr streetNmbr = new StreetNmbr();
	streetNmbr.set
	address.setStreetNmbr(streetNmbr);*/
	address1.setPostalCode("400069");
	CountryName countryName1 = new CountryName();
	countryName1.setCode("IN");
	countryName1.setValue("INDIA");
	address1.setCountryName(countryName1);
	StateProv stateProv = new StateProv();
	stateProv.setStateCode("MH");
	address1.setStateProv(stateProv);
	List<Address> addresses1 = new ArrayList<Address>();
	addresses1.add(address1);
	airTraveler1.setAddresses(addresses1);
	List<Document> documents = new ArrayList<>();
	Document document = new Document();
	document.setDocIssueAuthority("Indian Passport Office");
	document.setDocIssueLocation("Mumbai");
	document.setDocHolderNationality("IN");
	document.setDocID("G056737");
	document.setDocType("2");
	document.setGender("Male");
	document.setBirthDate(getStringAsDate("2013-03-13"));
	document.setEffectiveDate(getStringAsDate("2007-08-13"));
	document.setExpireDate(getStringAsDate("2017-08-13"));
	document.setDocHolderName("Akshay Mahadik");
	documents.add(document);
	airTraveler1.setDocuments(documents);
	TravelerRefNumber travelerRefNumber1 = new TravelerRefNumber();
	travelerRefNumber1.setRph("1");
	airTraveler1.setTravelerRefNumber(travelerRefNumber1);
	travelerInfo.add(airTraveler1);
	
	
	AirTraveler airTraveler11 = new AirTraveler();
	Date birthDate11 = getStringAsDate("2016-01-01");
	airTraveler11.setBirthDate(birthDate11);
	airTraveler11.setPassengerTypeCode("INF");
	ProfileRef profileRef = new ProfileRef();
	UniqueID uniqueID = new UniqueID();
	uniqueID.setId("0");
	uniqueID.setType("16");
	profileRef.setUniqueID(uniqueID);
	airTraveler11.setProfileRef(profileRef);
	PersonName personName11 = new PersonName();
	
	List<String> givenNames11 = new ArrayList<String>();
	String givenName11 = new String("Chintu Mr");
	givenNames11.add(givenName11);
	personName11.setGivenName(givenNames11);
	personName11.setSurname("Jadhav");
	airTraveler11.setPersonName(personName11);
	
	List<Telephone> telephones11 = new ArrayList<>();
	Telephone telephone11 = new Telephone();
	telephone11.setPhoneNumber("911234567892");
	telephone11.setPhoneUseType("B");
	telephone11.setLocationCode("BOM");
	telephones11.add(telephone11);
	airTraveler11.setTelephones(telephones11);
	List<Email> emails11 = new ArrayList<>();
	Email email11 = new Email();
	email11.setValue("aChintu@gmail.com");
	emails11.add(email11);
	airTraveler11.setEmails(emails11);

	Address address11 = new Address();
	address11.setCityName("Mumbai");
	List<String> addressLine11 = new ArrayList<>();
	addressLine11.add("Urmi estate");
	address11.setAddressLine(addressLine11);
	/*StreetNmbr streetNmbr = new StreetNmbr();
	streetNmbr.set
	address.setStreetNmbr(streetNmbr);*/
	address11.setPostalCode("560045");
	CountryName countryName11 = new CountryName();
	countryName11.setCode("IN");
	address11.setCountryName(countryName11);
	
	List<Address> addresses11 = new ArrayList<Address>();
	addresses11.add(address11);
	airTraveler11.setAddresses(addresses11);
	
	TravelerRefNumber travelerRefNumber11 = new TravelerRefNumber();
	travelerRefNumber11.setRph("2");
	airTraveler11.setTravelerRefNumber(travelerRefNumber11);
	travelerInfo.add(airTraveler11);

	airBookRQ.setTravelerInfo(travelerInfo);
	
	TPAExtensions tPAExtensions = new TPAExtensions();
	Map<String, String> keyValueMap = new HashMap<String, String>();
	keyValueMap.put("TripType", "OneWay");
	tPAExtensions.setKeyValueMap(keyValueMap);
	airBookRQ.setTpaExtensions(tPAExtensions);
	airBookRequest.setAirBookRQ(airBookRQ);
	airBookRequests.add(airBookRequest);
	requestWrapper.setAirBookRequests(airBookRequests);

	@SuppressWarnings("unused")
	AirBookResponseWrapper responseWrapper = airService.otaAirBook(requestWrapper);

    }

    public static Date getStringAsDate(String date) {
	final DateFormat dateFormatObj = new SimpleDateFormat("yyyy-MM-dd");
	Date fomattedDate = null;
	try {
	    fomattedDate = dateFormatObj.parse(date);
	} catch (ParseException e) {
	    LOG.warn("#getStringAsDate Error: {}", e.getMessage(), e);
	}
	LOG.debug("Formatted Date: {}", fomattedDate);
	return fomattedDate;
    }

    /**
     * @param date
     * @return XMLGregorianCalendar
     */
    public static XMLGregorianCalendar toXMLGregorianCalendar(final Date date) {
	XMLGregorianCalendar xmlGrogerianCalendar = null;
	try {
	    final GregorianCalendar gregorianCalendar = new GregorianCalendar();
	    gregorianCalendar.setTime(date);
	    xmlGrogerianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
	} catch (Exception e) {
	    LOG.warn("#toXMLGregorianCalendar Error: {}", e.getMessage(), e);
	}
	return xmlGrogerianCalendar;
    }

}
