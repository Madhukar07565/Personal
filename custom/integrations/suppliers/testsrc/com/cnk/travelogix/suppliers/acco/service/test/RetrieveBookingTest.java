package com.cnk.travelogix.suppliers.acco.service.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingRQ;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingReadRequest;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingWrapper;
import com.cnk.travelogix.suppliers.acco.data.UniqueID;
import com.cnk.travelogix.suppliers.acco.service.SupplierAccoService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;

public class RetrieveBookingTest {
    public static void main(String[] args) {

	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
	SupplierAccoService accoService = (SupplierAccoService) appContext.getBean("supplierAccoService");

	List<RetrieveBookingReadRequest> retrieveBookingReadRequests = new ArrayList<>();
	RetrieveBookingWrapper requestWrapper = new RetrieveBookingWrapper();

	RequestHeader requestHeader = new RequestHeader();
	requestHeader.setSessionID("2");
	requestHeader.setUserID("1");
	requestHeader.setTransactionID("3");

	SupplierCredentials supplierCredential = new SupplierCredentials();
	List<SupplierCredentials> supplierCredentials = new ArrayList<>();
	SupplierID supplierIDHeader = new SupplierID();
	supplierIDHeader.setValue("ATI");
	supplierCredential.setSupplierID(supplierIDHeader);
	supplierCredentials.add(supplierCredential);

	Credentials credentials = new Credentials();
	Map<String, String> credentialsMap = new HashMap<String, String>();
	credentialsMap.put("UserName", "teze3568");
	credentialsMap.put("Password", "teze4875");
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

	requestHeader.setSupplierCredentials(supplierCredentials);

	RetrieveBookingReadRequest bookingReadRequest = new RetrieveBookingReadRequest();
	bookingReadRequest.setSequence(1);
	SupplierID supplierID = new SupplierID();
	supplierID.setValue("ATI");
	bookingReadRequest.setSupplierID(supplierID);

	RetrieveBookingRQ retrieveBookingRQ = new RetrieveBookingRQ();

	BigDecimal bigDecimal = new BigDecimal("1.0");
	retrieveBookingRQ.setVersion(bigDecimal);

	UniqueID uniqueID = new UniqueID();
	uniqueID.setId("5145317");
	uniqueID.setType("14");
	retrieveBookingRQ.setUniqueID(uniqueID);

	bookingReadRequest.setRetrieveBookingRQ(retrieveBookingRQ);

	retrieveBookingReadRequests.add(bookingReadRequest);
	requestWrapper.setRequestHeader(requestHeader);
	requestWrapper.setRetrieveBookingReadRequest(retrieveBookingReadRequests);
	RetrieveBookingResponseWrapper response = accoService.otaAccoRetrieveBooking(requestWrapper);
	System.out.println("***************response = " + response);
    }
}
