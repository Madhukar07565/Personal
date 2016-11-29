package com.cnk.travelogix.suppliers.acco.service.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.suppliers.acco.data.CustomerType;
import com.cnk.travelogix.suppliers.acco.data.HotelResModify;
import com.cnk.travelogix.suppliers.acco.data.HotelReservation;
import com.cnk.travelogix.suppliers.acco.data.PersonName;
import com.cnk.travelogix.suppliers.acco.data.Profile;
import com.cnk.travelogix.suppliers.acco.data.ProfileInfo;
import com.cnk.travelogix.suppliers.acco.data.ResGuest;
import com.cnk.travelogix.suppliers.acco.data.UniqueID;
import com.cnk.travelogix.suppliers.acco.data.UpdateRoomHotelResModifyRequest;
import com.cnk.travelogix.suppliers.acco.data.UpdateRoomHotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.service.SupplierAccoService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;

public class UpdateRoomTest {
    public static void main(String[] args) {

   	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
   	SupplierAccoService accoService = (SupplierAccoService) appContext.getBean("supplierAccoService");
   	UpdateRoomHotelResModifyRequestWrapper requestWrapper = new UpdateRoomHotelResModifyRequestWrapper();

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
   	
   	List<UpdateRoomHotelResModifyRequest> updateRoomHotelResModifyRequestList = new ArrayList<>();
   	UpdateRoomHotelResModifyRequest updateRoomHotelResModifyRequest = new UpdateRoomHotelResModifyRequest();
   	updateRoomHotelResModifyRequest.setSequence(1);
   	SupplierID supplierID = new SupplierID();
   	supplierID.setValue("GTA");
   	updateRoomHotelResModifyRequest.setSupplierID(supplierID);
   	
   	
   	HotelResModify hotelResModify = new HotelResModify();
   	hotelResModify.setResStatus("Initiate");
   	BigDecimal bigDecimal = new BigDecimal("1.0");
   	hotelResModify.setVersion(bigDecimal);
   	
   	
   	UniqueID uniqueID = new UniqueID();
	List<UniqueID> uniqueIDs = new ArrayList<>();
	uniqueID.setId("849877");
	uniqueID.setType("14");
	uniqueIDs.add(uniqueID);
	hotelResModify.setUniqueID(uniqueIDs);
	
	List<HotelReservation> hotelResModifies = new ArrayList<>();
	HotelReservation hotelReservation = new HotelReservation();
   	List<ResGuest> guests = new ArrayList<>();
	 ResGuest resGuests = new ResGuest();
	 resGuests.setResGuestRPH("4");
	 
	 List<ProfileInfo> profileInfos = new ArrayList<>();
	 ProfileInfo profileInfo = new ProfileInfo();
	 Profile profile = new Profile();
	
	 CustomerType customer = new CustomerType();
	 
	 List<PersonName> names = new ArrayList<>();
	 PersonName personName = new PersonName();
	 List<String> namePrefix = new ArrayList<>();
	 namePrefix.add("Mr.");
	 personName.setNamePrefix(namePrefix);
	 List<String> givenName = new ArrayList<>();
	 givenName.add("Guest4");
	 personName.setGivenName(givenName);
	 personName.setSurname("Surname4");
	 names.add(personName);
	 customer.setPersonName(names);
	 profile.setCustomer(customer);
	 
	 profileInfo.setProfile(profile);
	 profileInfos.add(profileInfo);
	 resGuests.setProfiles(profileInfos);
	 
	 guests.add(resGuests);
	 hotelReservation.setResGuests(guests);
	 hotelResModifies.add(hotelReservation);
	hotelResModify.setHotelResModifies(hotelResModifies);
   	updateRoomHotelResModifyRequest.setHotelResModifyRq(hotelResModify);
   	updateRoomHotelResModifyRequestList.add(updateRoomHotelResModifyRequest);
   	requestWrapper.setRequestHeader(requestHeader);
   	requestWrapper.setUpdateRoomHotelResModifyRequest(updateRoomHotelResModifyRequestList);
   
   	accoService.otaAccoUpdateRoom(requestWrapper);
   	
   	
    }
}
