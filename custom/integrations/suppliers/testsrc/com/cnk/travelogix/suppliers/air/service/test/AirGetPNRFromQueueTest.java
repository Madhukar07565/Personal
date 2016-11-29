package com.cnk.travelogix.suppliers.air.service.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.suppliers.air.data.MessageQueueRQ;
import com.cnk.travelogix.suppliers.air.data.MessageQueueRequest;
import com.cnk.travelogix.suppliers.air.data.MessageQueueRequestWrapper;
import com.cnk.travelogix.suppliers.air.service.SupplierAirService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;


public class AirGetPNRFromQueueTest 
{
	public static void main(String[] args) 
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
		SupplierAirService airService = (SupplierAirService) appContext.getBean("supplierAirService");

		MessageQueueRequestWrapper messageQueueRequestWrapper = new MessageQueueRequestWrapper();
		List<MessageQueueRequest> messageQueueRequests = new ArrayList<>();
		final MessageQueueRequest messageQueueRequest = new MessageQueueRequest();
		RequestHeader requestHeader = new RequestHeader();
		requestHeader.setSessionID("123");
		requestHeader.setUserID("Test");
		requestHeader.setTransactionID("10");

		Map<String, String> credentialsMap = new HashMap<String, String>();
		credentialsMap.put("AccountNumber", "MCN001101");
		credentialsMap.put("Username", "EZEXML");
		credentialsMap.put("Password", "EZE2016_xml");

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
		messageQueueRequestWrapper.setRequestHeader(requestHeader);

		
		SupplierID supplierID = new SupplierID();
		supplierID.setValue("MYSTIFLY");
		messageQueueRequest.setSupplierID(supplierID);
		messageQueueRequest.setSequence(1);
		
		MessageQueueRQ messageQueueRQ = new MessageQueueRQ();
		messageQueueRQ.setCategoryID("Booking");
		messageQueueRQ.setTarget("Test");
		messageQueueRequest.setMessageQueueRQ(messageQueueRQ);
		messageQueueRequests.add(messageQueueRequest);
		messageQueueRequestWrapper.setMessageQueueRequest(messageQueueRequests);
		airService.otaMessageQueue(messageQueueRequestWrapper);
	}
}
