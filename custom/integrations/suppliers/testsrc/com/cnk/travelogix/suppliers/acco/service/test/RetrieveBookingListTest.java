package com.cnk.travelogix.suppliers.acco.service.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.suppliers.acco.data.HotelReadRequest;
import com.cnk.travelogix.suppliers.acco.data.ReadRequests;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingListReadRequest;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingListRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingListResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingRQ;
import com.cnk.travelogix.suppliers.acco.data.SelectionCriteria;
import com.cnk.travelogix.suppliers.acco.service.SupplierAccoService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;

public class RetrieveBookingListTest {
    public static void main(String[] args) {

	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
	SupplierAccoService accoService = (SupplierAccoService) appContext.getBean("supplierAccoService");

	List<RetrieveBookingListReadRequest> retrieveBookingListReadRequest = new ArrayList<>();
	RetrieveBookingListRequestWrapper requestWrapper = new RetrieveBookingListRequestWrapper();

	RequestHeader requestHeader = new RequestHeader();
	requestHeader.setSessionID("1234");
	requestHeader.setUserID("203666");
	requestHeader.setTransactionID("2345");

	SupplierCredentials supplierCredential = new SupplierCredentials();
	List<SupplierCredentials> supplierCredentials = new ArrayList<>();
	SupplierID supplierIDHeader = new SupplierID();
	supplierIDHeader.setValue("string");
	supplierCredential.setSupplierID(supplierIDHeader);
	supplierCredentials.add(supplierCredential);

	Credentials credentials = new Credentials();
	Map<String, String> credentialsMap = new HashMap<String, String>();
	credentialsMap.put("LoginName", "203666");
	credentialsMap.put("Password", "tr.karthik");
	credentialsMap.put("Context", "olympia_europe_tr");
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

	supplierCredential.setCredentials(credentials);

	requestHeader.setSupplierCredentials(supplierCredentials);

	RetrieveBookingListReadRequest bookingReadRequest = new RetrieveBookingListReadRequest();
	bookingReadRequest.setSequence(1);
	SupplierID supplierID = new SupplierID();
	supplierID.setValue("string");
	bookingReadRequest.setSupplierID(supplierID);

	RetrieveBookingRQ retrieveBookingRQ = new RetrieveBookingRQ();

	BigDecimal bigDecimal = new BigDecimal("1.0");
	retrieveBookingRQ.setVersion(bigDecimal);

	ReadRequests readRequests = new ReadRequests();
	List<HotelReadRequest> hotelReadRequests = new ArrayList<>();
	HotelReadRequest hotelReadRequest = new HotelReadRequest();
	hotelReadRequest.setHotelCode("23989");

	List<SelectionCriteria> criterias = new ArrayList<>();
	SelectionCriteria selectionCriteria = new SelectionCriteria();
	selectionCriteria.setEnd("2016-12-21");
	selectionCriteria.setStart("2016-01-01");
	selectionCriteria.setResStatus("Book");
	selectionCriteria.setDateType("CreateDate");
	criterias.add(selectionCriteria);
	hotelReadRequest.setSelectionCriteria(criterias);
	hotelReadRequests.add(hotelReadRequest);
	readRequests.setHotelReadRequest(hotelReadRequests);
	retrieveBookingRQ.setReadRequests(readRequests);

	bookingReadRequest.setRetrieveBookingListRQ(retrieveBookingRQ);

	retrieveBookingListReadRequest.add(bookingReadRequest);
	requestWrapper.setRequestHeader(requestHeader);
	requestWrapper.setRetrieveBookingListReadRequest(retrieveBookingListReadRequest);
	RetrieveBookingListResponseWrapper response = accoService.otaAccoRetrieveBookingList(requestWrapper);
	System.out.println("***************response = " + response);
    }
}
