package com.cnk.travelogix.suppliers.air.service.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.cnk.travelogix.suppliers.air.data.AirReadRQ;
import com.cnk.travelogix.suppliers.air.data.AirReadRequest;
import com.cnk.travelogix.suppliers.air.data.AirReadRequestWrapper;
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

public class RetrievePNRTest {
    public static void main(String[] args) {
	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
	SupplierAirService airService = (SupplierAirService) appContext.getBean("supplierAirService");

	AirReadRequestWrapper requestWrapper = new AirReadRequestWrapper();

	RequestHeader requestHeader = new RequestHeader();
	requestHeader.setSessionID("2");
	requestHeader.setUserID("1");
	requestHeader.setTransactionID("3");

	List<SupplierCredentials> supplierCredentials = new ArrayList<>();

	SupplierCredentials supplierCredential1 = new SupplierCredentials();
	SupplierID supplierIDHeader = new SupplierID();
	supplierIDHeader.setValue("AOT");
	supplierCredential1.setSupplierID(supplierIDHeader);
	Credentials credentials = new Credentials();
	Map<String, String> credentialsMap = new HashMap<String, String>();
	credentialsMap.put("AgentID", "EZEGOO");
	credentialsMap.put("Password", "chambers1");

	List<Credential> credentialList = new ArrayList<>();
	for (final Map.Entry<String, String> keyValueMap : credentialsMap.entrySet()) {
	    Credential credential = new Credential();
	    credential.setName(keyValueMap.getKey());
	    credential.setValue(keyValueMap.getValue());
	    credential.setIsEncrypted(false);
	    credentialList.add(credential);
	}
	credentials.setCredential(credentialList);

	List<OperationURL> operationURLList = new ArrayList<>();
	OperationURL operationURL = new OperationURL();
	operationURL.setValue("https://sws3-crt.cert.sabre.com/");
	operationURL.setOperation("all");
	operationURLList.add(operationURL);
	credentials.setOperationURL(operationURLList);

	supplierCredential1.setCredentials(credentials);
	supplierCredentials.add(supplierCredential1);
	requestHeader.setSupplierCredentials(supplierCredentials);

	List<AirReadRequest> airReadRequests = new ArrayList<>();
	AirReadRequest airReadRequest = new AirReadRequest();
	AirReadRQ airReadRQ = new AirReadRQ();
	BigDecimal decimal = new BigDecimal("1");
	airReadRQ.setVersion(decimal);
	airReadRQ.setTarget("Test");
	POSType pos = new POSType();
	List<SourceType> source = new ArrayList<>();
	pos.setSource(source);
	airReadRQ.setPos(pos);
	UniqueID uniqueID = new UniqueID();
	uniqueID.setId("2E3PND");
	uniqueID.setType("299");
	airReadRQ.setUniqueID(uniqueID);
	airReadRequest.setAirReadRQ(airReadRQ);
	requestWrapper.setRequestHeader(requestHeader);
	airReadRequests.add(airReadRequest);
	requestWrapper.setAirReadRequests(airReadRequests);
	airService.otaRetrievePNR(requestWrapper);
    }
}
