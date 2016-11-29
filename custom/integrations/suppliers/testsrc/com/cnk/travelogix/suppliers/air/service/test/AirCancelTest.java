package com.cnk.travelogix.suppliers.air.service.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.suppliers.air.data.AirCancelResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirCancellRQ;
import com.cnk.travelogix.suppliers.air.data.AirCancellRequest;
import com.cnk.travelogix.suppliers.air.data.AirCancellRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.EndLocation;
import com.cnk.travelogix.suppliers.air.data.OriginAndDestinationSegment;
import com.cnk.travelogix.suppliers.air.data.SpecialRequests;
import com.cnk.travelogix.suppliers.air.data.StartLocation;
import com.cnk.travelogix.suppliers.air.data.UniqueID;
import com.cnk.travelogix.suppliers.air.data.Verification;
import com.cnk.travelogix.suppliers.air.service.SupplierAirService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;

public class AirCancelTest {

    public static void main(String[] args) {

	@SuppressWarnings("resource")
	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
	SupplierAirService airService = (SupplierAirService) appContext.getBean("supplierAirService");

	AirCancellRequestWrapper airCancellRequestWrapper = new AirCancellRequestWrapper();

	RequestHeader requestHeader = new RequestHeader();
	requestHeader.setSessionID("123");
	requestHeader.setUserID("Test");
	requestHeader.setTransactionID("10");

	Map<String, String> credentialsMap = new HashMap<String, String>();
	credentialsMap.put("DomainCode", "WWW");
	credentialsMap.put("Password", "Indigo@2016");
	credentialsMap.put("AgentName", "OTI004");

	List<SupplierCredentials> supplierCredentials = new ArrayList<SupplierCredentials>();
	SupplierCredentials supplierCredential = new SupplierCredentials();
	SupplierID supplierIDHeader = new SupplierID();
	supplierIDHeader.setValue("INDIGO");
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
	airCancellRequestWrapper.setRequestHeader(requestHeader);

	List<AirCancellRequest> airCancelsRequest = new ArrayList<AirCancellRequest>();
	AirCancellRequest airCancellRequest = new AirCancellRequest();
	SupplierID supplierID = new SupplierID();
	supplierID.setValue("INDIGO");
	supplierID.setMarketType("INDIGO");
	airCancellRequest.setSupplierID(supplierID);
	airCancellRequest.setSequence(1);

	//AirCancel RQ
	AirCancellRQ airCancelRQ = new AirCancellRQ();
	airCancelRQ.setCancelType("Cancel");
	BigDecimal version = new BigDecimal("1");
	airCancelRQ.setVersion(version);
	//-----------------------------
	List<UniqueID> uniqueIDs = new ArrayList<UniqueID>();
	UniqueID uniqueID = new UniqueID();
	uniqueID.setIdContext("SSR");
	uniqueID.setId("LYE7UT");
	uniqueID.setType("14");

	TPAExtensions tPAExtensions = new TPAExtensions();
	Map<String, String> keyValueMap = new HashMap<String, String>();
	keyValueMap.put("ExtendedRPH", "6E~ 546~ ~~BLR~07/16/2016 00:15~HYD~07/16/2016 01:15~");
	keyValueMap.put("FlightNumber", "546");
	keyValueMap.put("CarrierCode", "6E");
	Map<Class<?>, Object> keyObjectMap = new HashMap<Class<?>, Object>();
	com.cnk.travelogix.suppliers.air.data.SSRs ssrs = new com.cnk.travelogix.suppliers.air.data.SSRs();
	List<SpecialRequests> specialRequests = new ArrayList<SpecialRequests>();
	SpecialRequests specialRequest = new SpecialRequests();
	specialRequest.setNumber(1);
	specialRequest.setSsrCode("XBPA");
	specialRequest.setServiceQuantity(1);

	List<String> flightRefNumberRPHLists = new ArrayList<String>();
	String flightRefnumber = "1";
	flightRefNumberRPHLists.add(flightRefnumber);
	specialRequest.setFlightRefNumberRPHList(flightRefNumberRPHLists);

	List<String> travelerRefNumberRPHLists = new ArrayList<String>();
	String travelerRefNumber = "1";
	travelerRefNumberRPHLists.add(travelerRefNumber);
	specialRequest.setTravelerRefNumberRPHList(travelerRefNumberRPHLists);

	specialRequests.add(specialRequest);
	ssrs.setSsrs(specialRequests);
	keyObjectMap.put(com.cnk.travelogix.suppliers.air.data.SSRs.class, ssrs);

	tPAExtensions.setKeyValueMap(keyValueMap);
	tPAExtensions.setKeyObjectMap(keyObjectMap);

	uniqueID.setTpaExtensions(tPAExtensions);
	uniqueIDs.add(uniqueID);
	airCancelRQ.setUniqueIDs(uniqueIDs);
	//-----------------------------------
	Verification verification = new Verification();
	StartLocation startlocation1 = new StartLocation();
	startlocation1.setLocationCode("BLR");
	startlocation1.setAssociatedDateTime(new Date(2016 - 07 - 16));
	EndLocation endLocation1 = new EndLocation();
	endLocation1.setLocationCode("HYD");
	endLocation1.setAssociatedDateTime(new Date(2016 - 06 - 15));
	verification.setStartLocation(startlocation1);
	verification.setEndLocation(endLocation1);
	airCancelRQ.setVerification(verification);

	List<OriginAndDestinationSegment> originAndDestinationSegments = new ArrayList<OriginAndDestinationSegment>();
	OriginAndDestinationSegment originAndDestinationSegment = new OriginAndDestinationSegment();
	StartLocation startlocation = new StartLocation();
	startlocation.setLocationCode("BLR");
	//startlocation.setAssociatedDateTime(new Date(2016-07-16));	
	EndLocation endLocation = new EndLocation();
	endLocation.setLocationCode("HYD");
	//endLocation.setAssociatedDateTime(new Date(2016-06-15));
	originAndDestinationSegment.setOriginLocation(startlocation);
	originAndDestinationSegment.setDestinationLocation(endLocation);
	originAndDestinationSegments.add(originAndDestinationSegment);
	airCancelRQ.setOriginAndDestinationSegment(originAndDestinationSegments);
	//Air Cancel RQ

	airCancellRequest.setAirCancellRQ(airCancelRQ);
	airCancelsRequest.add(airCancellRequest);
	airCancellRequestWrapper.setAirCancellRequests(airCancelsRequest);
	airCancellRequestWrapper.setRequestHeader(requestHeader);

	final AirCancelResponseWrapper response = airService.otaAirCancel(airCancellRequestWrapper);
	System.out.println("Response : " + response.toString());
    }
}
