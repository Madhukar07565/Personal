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

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.suppliers.air.data.AirGetSSRQ;
import com.cnk.travelogix.suppliers.air.data.AirGetSSRRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirGetSSRequest;
import com.cnk.travelogix.suppliers.air.data.AirGetSSResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.ArrivalAirport;
import com.cnk.travelogix.suppliers.air.data.DepartureAirport;
import com.cnk.travelogix.suppliers.air.data.FlightSegment;
import com.cnk.travelogix.suppliers.air.data.OperatingAirline;
import com.cnk.travelogix.suppliers.air.data.OriginDestinationInformation;
import com.cnk.travelogix.suppliers.air.data.OriginDestinationOption;
import com.cnk.travelogix.suppliers.air.data.TravelerInfoSummary;
import com.cnk.travelogix.suppliers.air.data.TravelerInformation;
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

import de.hybris.bootstrap.annotations.IntegrationTest;

@IntegrationTest
public class AirGetSSRTest {

    private static final Logger LOG = LoggerFactory.getLogger(AirGetSSRTest.class);

    //    public static void main(String[] args) {
    //@Resource

    @Test
    public void airGetSSRTest() {
	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
	SupplierAirService supplierAirService=(SupplierAirService) appContext.getBean("supplierAirService");	

	AirGetSSRRequestWrapper requestWrapper = new AirGetSSRRequestWrapper();
	//Request Header
	RequestHeader requestHeader = new RequestHeader();
	requestHeader.setUserID("Test");
	requestHeader.setSessionID("123");
	requestHeader.setTransactionID("10");

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
	supplierIDHeader.setValue("AIRARABIA");
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
	List<AirGetSSRequest> airGetSSRequests = new ArrayList<AirGetSSRequest>();
	AirGetSSRequest airGetSSRequest = new AirGetSSRequest();
	SupplierID supplierID = new SupplierID();
	supplierID.setValue("AIRARABIA");
	airGetSSRequest.setSupplierID(supplierID);
	airGetSSRequest.setSequence(1);

	AirGetSSRQ airGetSSRQ = new AirGetSSRQ();
	airGetSSRQ.setVersion(new BigDecimal("1"));
	//POS Type
	final POSType posType=new POSType();
	List<SourceType> sourceTypeList=new ArrayList<>();
	final SourceType sourceType=new SourceType();
	sourceTypeList.add(sourceType);
	posType.setSource(sourceTypeList);
	airGetSSRQ.setPos(posType);

	TravelerInfoSummary travelerInfoSummary = new TravelerInfoSummary();
	List<TravelerInformation> travelerInformations = new ArrayList<>();
	travelerInfoSummary.setAirTraveler(travelerInformations);

	//Origin Destination Information
	final List<OriginDestinationInformation> originDestinationInformationList=new ArrayList<>();
	final OriginDestinationInformation originDestinationInformation=new OriginDestinationInformation();
	originDestinationInformation.setDepartureDateTime("2016-08-20T23:45:00");
	originDestinationInformation.setOriginLocationCode("SHJ");
	originDestinationInformation.setDestinationLocationCode("BOM");

	List<OriginDestinationOption> originDestinationOptions = new ArrayList<>();
	OriginDestinationOption originDestinationOption = new OriginDestinationOption();
	List<FlightSegment> flightSegments = new ArrayList<>();
	FlightSegment flightSegment = new FlightSegment();
	flightSegment.setFlightNumber("5267");
	String string = "2016-08-20";
	Date date = getStringAsDate(string);
	flightSegment.setDepartureDateTime(date);
	string = "2016-08-21";
	date = getStringAsDate(string);
	flightSegment.setArrivalDateTime(date);
	
	DepartureAirport departureAirport = new DepartureAirport();
	departureAirport.setLocationCode("SHJ");
	departureAirport.setTerminal("TerminalX");
	flightSegment.setDepartureAirport(departureAirport);
	ArrivalAirport arrivalAirport = new ArrivalAirport();
	arrivalAirport.setLocationCode("BOM");
	arrivalAirport.setTerminal("TerminalX");
	flightSegment.setArrivalAirport(arrivalAirport);

	OperatingAirline operatingAirline = new OperatingAirline();
	operatingAirline.setFlightNumber("406");
	operatingAirline.setCode("G9");
	operatingAirline.setCompanyShortName("G9");
	flightSegment.setOperatingAirline(operatingAirline);
	
	TPAExtensions tPAExtensions = new TPAExtensions();
	Map<String, String> keyValueMap = new HashMap<String, String>();
	keyValueMap.put("ExtendedRPH", "G9$SHJ/BOM$2005386$20160820234500$20160821041500");
	tPAExtensions.setKeyValueMap(keyValueMap);
	flightSegment.setTpaExtensions(tPAExtensions);
	
	flightSegments.add(flightSegment);
	originDestinationOption.setFlightSegments(flightSegments);
	originDestinationOptions.add(originDestinationOption);
	originDestinationInformation.setOriginDestinationOptions(originDestinationOptions);
	
	originDestinationInformationList.add(originDestinationInformation);
	airGetSSRQ.setOriginDestinationInformation(originDestinationInformationList);
	
	airGetSSRequest.setAirGetSSRQ(airGetSSRQ);
	airGetSSRequests.add(airGetSSRequest);
	requestWrapper.setAirGetSSRequests(airGetSSRequests);

	@SuppressWarnings("unused")
	AirGetSSResponseWrapper responseWrapper = supplierAirService.otaAirGetSSR(requestWrapper);

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
