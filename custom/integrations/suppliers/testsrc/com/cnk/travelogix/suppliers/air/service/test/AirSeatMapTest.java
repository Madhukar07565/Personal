package com.cnk.travelogix.suppliers.air.service.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.suppliers.air.data.AirSeatMapRQ;
import com.cnk.travelogix.suppliers.air.data.AirSeatMapRequest;
import com.cnk.travelogix.suppliers.air.data.AirSeatMapRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.FlightSegment;
import com.cnk.travelogix.suppliers.air.data.SeatMapRequest;
import com.cnk.travelogix.suppliers.air.data.SeatMapRequests;
import com.cnk.travelogix.suppliers.air.service.SupplierAirService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;

public class AirSeatMapTest {
    public static void main(String[] args) {
	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
	SupplierAirService airService = (SupplierAirService) appContext.getBean("supplierAirService");

	AirSeatMapRequestWrapper requestWrapper = new AirSeatMapRequestWrapper();

	RequestHeader requestHeader = new RequestHeader();
	requestHeader.setSessionID("Sabre_1");
	requestHeader.setUserID("PERF");
	requestHeader.setTransactionID("Search_1");

	Map<String, String> credentialsMap = new HashMap<String, String>();
	credentialsMap.put("UserID", "nI7CviiNE2c=");
	credentialsMap.put("Password", "eq7vMf+HQB4=");

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

	Map<String, String> OperationURLMap = new HashMap<String, String>();
	OperationURLMap.put("price", "https://testv80.elsyarres.net/service.asmx");
	OperationURLMap.put("sell", "https://testv80.elsyarres.net/service.asmx");
	OperationURLMap.put("book", "https://testv80.elsyarres.net/service.asmx");
	OperationURLMap.put("retrievepnr", "https://testv80.elsyarres.net/service.asmx");
	OperationURLMap.put("seatmap", "https://testv80.elsyarres.net/service.asmx");
	OperationURLMap.put("listbooking", "https://testv80.elsyarres.net/service.asmx");

	List<OperationURL> operationURLList = new ArrayList<>();
	for (final Map.Entry<String, String> keyValueMap : OperationURLMap.entrySet()) {
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

	List<AirSeatMapRequest> airSeatMapRequests = new ArrayList<>();
	AirSeatMapRequest airSeatMapRequest = new AirSeatMapRequest();
	SupplierID supplierID = new SupplierID();
	supplierID.setValue("ELSYARRES");
	airSeatMapRequest.setSupplierID(supplierID);
	airSeatMapRequest.setSequence(1);

	AirSeatMapRQ airSeatMapRQ = new AirSeatMapRQ();
	airSeatMapRQ.setVersion(new BigDecimal("1"));
	airSeatMapRQ.setPrimaryLangID("EN");
	SeatMapRequests seatMapRequests = new SeatMapRequests();
	SeatMapRequest seatMapRequest = new SeatMapRequest();
	List<SeatMapRequest> listSeatMapRequest = new ArrayList<>();

	FlightSegment flightSegment = new FlightSegment();

	TPAExtensions tpaFlightSegment = new TPAExtensions();
	Map<String, String> keyValueMap = new HashMap<>();
	keyValueMap.put("ExtendedRPH", "_4-160701063731-01-1628196-6307|_4-160701063731-01-1628348-5821");
	tpaFlightSegment.setKeyValueMap(keyValueMap);
	flightSegment.setTpaExtensions(tpaFlightSegment);

	seatMapRequest.setFlightSegmentInfo(flightSegment);

	listSeatMapRequest.add(seatMapRequest);
	seatMapRequests.setSeatMapRequest(listSeatMapRequest);
	airSeatMapRQ.setSeatMapRequests(seatMapRequests);

	airSeatMapRequest.setAirSeatMapRQ(airSeatMapRQ);
	airSeatMapRequests.add(airSeatMapRequest);
	requestWrapper.setAirSeatMapRequests(airSeatMapRequests);
	airService.otaAirSeatMap(requestWrapper);

	System.out.println("Success");

    }

}
