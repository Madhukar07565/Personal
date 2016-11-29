package com.cnk.travelogix.suppliers.acco.service.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.suppliers.acco.data.HotelCancelRQ;
import com.cnk.travelogix.suppliers.acco.data.HotelCancelReadRequest;
import com.cnk.travelogix.suppliers.acco.data.HotelCancelResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelCancelWrapper;
import com.cnk.travelogix.suppliers.acco.data.UniqueID;
import com.cnk.travelogix.suppliers.acco.service.SupplierAccoService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;

public class HotelCancelConvertorTest {
    public static void main(String[] args) {

	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
	SupplierAccoService accoService = (SupplierAccoService) appContext.getBean("supplierAccoService");

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

	HotelCancelWrapper hotelCancelWrapper = new HotelCancelWrapper();
	hotelCancelWrapper.setRequestHeader(requestHeader);

	HotelCancelReadRequest hotelCancelReadRequest = new HotelCancelReadRequest();
	List<HotelCancelReadRequest> hotelDetailsReadRequests = new ArrayList<>();
	hotelCancelReadRequest.setSequence(1);
	SupplierID supplierID = new SupplierID();
	supplierID.setValue("ATI");
	hotelCancelReadRequest.setSupplierID(supplierID);

	HotelCancelRQ hotelCancelRQ = new HotelCancelRQ();

	UniqueID uniqueID = new UniqueID();
	List<UniqueID> uniqueIDs = new ArrayList<>();
	uniqueID.setId("5145317");
	uniqueID.setType("14");
	uniqueIDs.add(uniqueID);
	hotelCancelRQ.setUniqueID(uniqueIDs);

	BigDecimal bigDecimal = new BigDecimal("1.0");
	hotelCancelRQ.setVersion(bigDecimal);

	hotelCancelRQ.setCancelType("Cancel");
	hotelCancelReadRequest.setHotelCancelRQ(hotelCancelRQ);
	hotelDetailsReadRequests.add(hotelCancelReadRequest);

	hotelCancelWrapper.setHotelCancelReadRequest(hotelDetailsReadRequests);

	HotelCancelResponseWrapper response = accoService.otaAccoCancelBooking(hotelCancelWrapper);
	System.out.println("********************* response = " + response);

    }
}
