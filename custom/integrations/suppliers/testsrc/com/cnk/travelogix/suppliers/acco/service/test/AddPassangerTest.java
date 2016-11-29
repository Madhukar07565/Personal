package com.cnk.travelogix.suppliers.acco.service.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.suppliers.acco.data.AddRoomHotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.GuestCount;
import com.cnk.travelogix.suppliers.acco.data.GuestCountType;
import com.cnk.travelogix.suppliers.acco.data.HotelResModify;
import com.cnk.travelogix.suppliers.acco.data.HotelResModifyRequest;
import com.cnk.travelogix.suppliers.acco.data.HotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelReservation;
import com.cnk.travelogix.suppliers.acco.data.RoomStay;
import com.cnk.travelogix.suppliers.acco.data.UniqueID;
import com.cnk.travelogix.suppliers.acco.service.SupplierAccoService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;

public class AddPassangerTest {
    public static void main(String[] args) {

  	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
  	SupplierAccoService accoService = (SupplierAccoService) appContext.getBean("supplierAccoService");
  	HotelResModifyRequestWrapper requestWrapper = new HotelResModifyRequestWrapper();

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
  	
  	List<HotelResModifyRequest> hotelResModifyRequests = new ArrayList<>();
  	HotelResModifyRequest hotelResModifyRequest = new HotelResModifyRequest();
  	hotelResModifyRequest.setSequence(1);
  	SupplierID supplierID = new SupplierID();
  	supplierID.setValue("AxisRooms");
  	hotelResModifyRequest.setSupplierID(supplierID);
  	
  	HotelResModify hotelResModify = new HotelResModify();
  	BigDecimal version = new BigDecimal("1.0");
  	hotelResModify.setVersion(version);
  	
  	List<HotelReservation> hotelResModifies = new ArrayList<>();
  	HotelReservation hotelReservation = new HotelReservation();
  	
  	UniqueID uniqueID = new UniqueID();
	List<UniqueID> uniqueIDs = new ArrayList<>();
	uniqueID.setId("ARK00082ANO7");
	uniqueID.setType("14");
	uniqueIDs.add(uniqueID);
	hotelReservation.setUniqueID(uniqueIDs);
	
	List<RoomStay> roomStays = new ArrayList<>();
	RoomStay roomStay = new RoomStay();
	GuestCountType guestCounts = new GuestCountType();
	
	List<GuestCount> guestCount = new ArrayList<>();
	
	GuestCount guestCountData = new GuestCount();
	guestCountData.setCount(1);
	guestCountData.setAgeQualifyingCode("10");
	guestCount.add(guestCountData);
	
	GuestCount guestCountData1 = new GuestCount();
	guestCountData1.setCount(1);
	guestCountData1.setAgeQualifyingCode("8");
	guestCountData1.setAge(5);
	guestCount.add(guestCountData1);
	
	guestCounts.setGuestCount(guestCount);
 	roomStay.setGuestCounts(guestCounts);
 	roomStays.add(roomStay);
	hotelReservation.setRoomStays(roomStays);
	hotelResModifies.add(hotelReservation);
  	hotelResModify.setHotelResModifies(hotelResModifies);
  	hotelResModifyRequest.setHotelResModifyRq(hotelResModify);
  	hotelResModifyRequests.add(hotelResModifyRequest);
  	requestWrapper.setHotelResModifyRequest(hotelResModifyRequests);
  	requestWrapper.setRequestHeader(requestHeader);
  	accoService.otaAccoAddPassenger(requestWrapper);
    }
}
