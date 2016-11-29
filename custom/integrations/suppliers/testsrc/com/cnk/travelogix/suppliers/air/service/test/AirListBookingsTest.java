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

import com.cnk.travelogix.suppliers.air.data.AirBookResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirReadRQ;
import com.cnk.travelogix.suppliers.air.data.AirReadReq;
import com.cnk.travelogix.suppliers.air.data.AirReadRequest;
import com.cnk.travelogix.suppliers.air.data.AirReadRequestWrapper;
import com.cnk.travelogix.suppliers.air.service.SupplierAirService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;

public class AirListBookingsTest {

    public static void main(String[] args) {
	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
	SupplierAirService airService = (SupplierAirService) appContext.getBean("supplierAirService");

	AirReadRequestWrapper request = new AirReadRequestWrapper();

	RequestHeader requestHeader = new RequestHeader();
	requestHeader.setSessionID("Sabre_1");
	requestHeader.setUserID("PERF");
	requestHeader.setTransactionID("Search_1");

	Map<String, String> credentialsMap = new HashMap<String, String>();
	credentialsMap.put("UserID", "nI7CviiNE2c=");
	credentialsMap.put("Password", "MH7i6qheRlJu6P89OhF1pg==");

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
	operationURL.setValue("https://testv80.elsyarres.net/service.asmx");
	operationURL.setOperation("listbooking");
	operationURLList.add(operationURL);
	credentials.setOperationURL(operationURLList);

	supplierCredential.setCredentials(credentials);
	supplierCredentials.add(supplierCredential);
	requestHeader.setSupplierCredentials(supplierCredentials);
	request.setRequestHeader(requestHeader);

	List<AirReadRequest> airReadRequests = new ArrayList<>();
	AirReadRequest airReadRequest = new AirReadRequest();
	SupplierID supplierID = new SupplierID();
	supplierID.setValue("ELSYARRES");
	airReadRequest.setSupplierID(supplierID);
	airReadRequest.setSequence(1);

	AirReadRQ airReadRQ = new AirReadRQ();
	airReadRQ.setVersion(new BigDecimal("8.2"));
	airReadRQ.setPrimaryLangID("EN");

	List<AirReadReq> airReadReqs = new ArrayList<>();
	AirReadReq airReqdReq = new AirReadReq();
	airReqdReq.setStart(getDateFromString("2016-07-20"));
	airReqdReq.setEnd(getDateFromString("2016-07-25"));
	airReadReqs.add(airReqdReq);
	airReadRQ.setAirReadReqs(airReadReqs);
	airReadRequest.setAirReadRQ(airReadRQ);
	airReadRequests.add(airReadRequest);
	request.setAirReadRequests(airReadRequests);

	final AirBookResponseWrapper response = airService.otaListBookings(request);

	System.out.println("Success");
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
