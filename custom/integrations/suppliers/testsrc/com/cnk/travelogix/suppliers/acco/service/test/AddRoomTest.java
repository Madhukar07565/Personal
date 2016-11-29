package com.cnk.travelogix.suppliers.acco.service.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.suppliers.acco.data.AddRoomHotelResModifyRequest;
import com.cnk.travelogix.suppliers.acco.data.AddRoomHotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.AddRoomHotelResModifyResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.Comments;
import com.cnk.travelogix.suppliers.acco.data.CustomerType;
import com.cnk.travelogix.suppliers.acco.data.DateTimeSpanType;
import com.cnk.travelogix.suppliers.acco.data.Email;
import com.cnk.travelogix.suppliers.acco.data.GuestCount;
import com.cnk.travelogix.suppliers.acco.data.GuestCountType;
import com.cnk.travelogix.suppliers.acco.data.HotelResModify;
import com.cnk.travelogix.suppliers.acco.data.HotelReservation;
import com.cnk.travelogix.suppliers.acco.data.ParagraphType;
import com.cnk.travelogix.suppliers.acco.data.PersonName;
import com.cnk.travelogix.suppliers.acco.data.Profile;
import com.cnk.travelogix.suppliers.acco.data.ProfileInfo;
import com.cnk.travelogix.suppliers.acco.data.RatePlans;
import com.cnk.travelogix.suppliers.acco.data.ResGuest;
import com.cnk.travelogix.suppliers.acco.data.RoomStay;
import com.cnk.travelogix.suppliers.acco.data.RoomType;
import com.cnk.travelogix.suppliers.acco.data.UniqueID;
import com.cnk.travelogix.suppliers.acco.service.SupplierAccoService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;

public class AddRoomTest {
    public static void main(String[] args) {

	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
	SupplierAccoService accoService = (SupplierAccoService) appContext.getBean("supplierAccoService");
	AddRoomHotelResModifyRequestWrapper requestWrapper = new AddRoomHotelResModifyRequestWrapper();

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

	/*
	 * SupplierCredentials supplierCredential2 = new SupplierCredentials();
	 * supplierCredential2.setSupplierID("JACOB"); Credentials credentials3
	 * = new Credentials(); List<Credentials> credentialsList2 = new
	 * ArrayList<>(); credentials3.setName("LICENCEKEY");
	 * credentials3.setValue("E322B0A6-156E-4BA7-9A03-CD51E8992EBD");
	 * credentials3.setIsEncrypted(false);
	 * credentialsList2.add(credentials3);
	 * supplierCredential2.setCredentials(credentialsList2);
	 * supplierCredentials.add(supplierCredential2);
	 */
	

	List<AddRoomHotelResModifyRequest> hotelResModifyRequestList = new ArrayList<>();
	AddRoomHotelResModifyRequest hotelResModifyRequest = new AddRoomHotelResModifyRequest();
	SupplierID supplierID = new SupplierID();
	supplierID.setValue("AOT");
	hotelResModifyRequest.setSupplierID(supplierID);
	hotelResModifyRequest.setSequence(1);

	HotelResModify hotelResModify = new HotelResModify();

	BigDecimal versionNumber = new BigDecimal("1.0");
	hotelResModify.setVersion(versionNumber);
	hotelResModify.setResStatus("Modify");

	List<UniqueID> uniqueIDs = new ArrayList<UniqueID>();
	UniqueID uniqueID = new UniqueID();
	uniqueID.setId("AIEFAO2472");
	uniqueID.setType("14");
	uniqueIDs.add(uniqueID);
	hotelResModify.setUniqueID(uniqueIDs);

	List<HotelReservation> hotelReservationList = new ArrayList<HotelReservation>();
	HotelReservation hotelReservation = new HotelReservation();

	hotelReservation.setResStatus("RQ");

	List<RoomStay> roomStayList = new ArrayList<RoomStay>();
	RoomStay roomStay1 = new RoomStay();
	GuestCountType guestCountType = new GuestCountType();
	List<GuestCount> guestCountList = new ArrayList<GuestCount>();

	GuestCount GuestCount1 = new GuestCount();
	GuestCount1.setResGuestRPH("1");
	GuestCount1.setAgeQualifyingCode("10");
	GuestCount1.setCount(1);
	guestCountList.add(GuestCount1);

	GuestCount GuestCount2 = new GuestCount();
	GuestCount1.setResGuestRPH("2");
	GuestCount2.setAgeQualifyingCode("8");
	GuestCount2.setAge(3);
	GuestCount2.setCount(1);
	guestCountList.add(GuestCount2);
	guestCountType.setGuestCount(guestCountList);
	roomStay1.setGuestCounts(guestCountType);

	DateTimeSpanType dateTimeSpanType = new DateTimeSpanType();
	dateTimeSpanType.setEnd("2016-08-30");
	dateTimeSpanType.setStart("2016-08-4");
	roomStay1.setTimeSpan(dateTimeSpanType);

	TPAExtensions tpaExtensions = new TPAExtensions();
	//tpaExtensions.se
	roomStay1.setTpaExtensions(tpaExtensions);

	Comments comments = new Comments();
	List<ParagraphType> comment = new ArrayList<>();
	ParagraphType paragraph = new ParagraphType();
	paragraph.setText("This is Test Room");
	comment.add(paragraph);
	comments.setComment(comment);
	roomStay1.setComments(comments);
	roomStayList.add(roomStay1);
	hotelReservation.setRoomStays(roomStayList);

	List<ResGuest> resGuests = new ArrayList<>();
	ResGuest resGuest = new ResGuest();
	List<ProfileInfo> profiles = new ArrayList<>();
	ProfileInfo profile1 = new ProfileInfo();
	Profile profile = new Profile();
	List<PersonName> personNameList = new ArrayList<>();
	PersonName personName = new PersonName();
	List<String> names = new ArrayList<>();
	String name = "Master";
	names.add(name);
	personName.setNamePrefix(names);
	List<String> givennames = new ArrayList<>();
	String givenname = "Guest1";
	names.add(givenname);
	personName.setGivenName(givennames);
	personName.setSurname("Child1");
	personNameList.add(personName);
	CustomerType customer = new CustomerType();
	customer.setPersonName(personNameList);
	profile.setCustomer(customer);
	profile1.setProfile(profile);
	profiles.add(profile1);
	resGuest.setProfiles(profiles);
	resGuests.add(resGuest);

	ResGuest resGuest1 = new ResGuest();
	List<ProfileInfo> profiles1 = new ArrayList<>();
	ProfileInfo profileInfo2 = new ProfileInfo();
	Profile profile2 = new Profile();
	List<PersonName> personNameList1 = new ArrayList<>();
	PersonName personName1 = new PersonName();
	List<String> names1 = new ArrayList<>();
	String name1 = "Master";
	names1.add(name1);
	personName1.setNamePrefix(names1);
	List<String> givennames1 = new ArrayList<>();
	String givenname1 = "Guest1";
	names1.add(givenname1);
	personName1.setGivenName(givennames1);
	personName1.setSurname("Child1");
	personNameList1.add(personName1);
	CustomerType customer1 = new CustomerType();
	customer1.setPersonName(personNameList1);
	profile2.setCustomer(customer1);
	profileInfo2.setProfile(profile2);
	profiles1.add(profileInfo2);
	resGuest1.setProfiles(profiles1);
	resGuests.add(resGuest1);
	hotelReservation.setResGuests(resGuests);

	hotelReservationList.add(hotelReservation);
	hotelResModify.setHotelResModifies(hotelReservationList);

	hotelResModifyRequest.setHotelResModifyRq(hotelResModify);
	hotelResModifyRequestList.add(hotelResModifyRequest);

	AddRoomHotelResModifyRequest hotelResModifyRequest1 = new AddRoomHotelResModifyRequest();
	SupplierID supplierID1 = new SupplierID();
	supplierID1.setValue("JACOB");
	hotelResModifyRequest1.setSupplierID(supplierID);
	hotelResModifyRequest1.setSequence(2);

	HotelResModify hotelResModify1 = new HotelResModify();

	BigDecimal versionNumber1 = new BigDecimal(1.0);
	hotelResModify1.setVersion(versionNumber1);
	hotelResModify1.setResStatus("Modify");
	hotelResModify1.setTransactionIdentifier("Test1234567");

	List<UniqueID> uniqueIDs1 = new ArrayList<UniqueID>();
	UniqueID uniqueID1 = new UniqueID();
	uniqueID1.setId("JCJA2135028");
	uniqueID1.setType("14");
	uniqueIDs1.add(uniqueID1);
	hotelResModify1.setUniqueID(uniqueIDs1);

	List<HotelReservation> hotelReservationList1 = new ArrayList<HotelReservation>();
	HotelReservation hotelReservation1 = new HotelReservation();

	List<UniqueID> uniqueIDsList = new ArrayList<>();
	UniqueID id = new UniqueID();
	id.setId("6026");
	id.setType("10");
	uniqueIDsList.add(id);
	UniqueID id1 = new UniqueID();
	id1.setId("1182993");
	id1.setType("16");
	uniqueIDsList.add(id1);
	hotelReservation1.setUniqueID(uniqueIDsList);

	List<RoomStay> roomStayList1 = new ArrayList<RoomStay>();
	RoomStay roomStay2 = new RoomStay();

	List<RoomType> roomTypes = new ArrayList<>();
	RoomType roomType = new RoomType();
	roomType.setRoomID("34253");
	roomTypes.add(roomType);
	roomStay2.setRoomTypes(roomTypes);

	List<RatePlans> ratePlans = new ArrayList<>();
	RatePlans ratePlane = new RatePlans();
	ratePlane.setRatePlanCode("721620");
	ratePlans.add(ratePlane);
	roomStay2.setRatePlans(ratePlans);

	DateTimeSpanType dateTimeSpanType1 = new DateTimeSpanType();
	dateTimeSpanType1.setEnd("2016-08-30");
	dateTimeSpanType1.setStart("2016-08-4");
	roomStay2.setTimeSpan(dateTimeSpanType1);
	roomStayList1.add(roomStay2);
	hotelReservation1.setRoomStays(roomStayList1);

	List<ResGuest> resGuests1 = new ArrayList<>();
	ResGuest resGuest2 = new ResGuest();
	resGuest2.setAgeQualifyingCode("10");
	List<ProfileInfo> profiles2 = new ArrayList<>();
	ProfileInfo profileInfo1 = new ProfileInfo();
	Profile profile3 = new Profile();
	List<PersonName> personNameList2 = new ArrayList<>();
	PersonName personName2 = new PersonName();
	List<String> names2 = new ArrayList<>();
	String name2 = "Mr";
	names2.add(name2);
	personName2.setNameTitle(names2);
	;
	List<String> givennames2 = new ArrayList<>();
	String givenname2 = "Joseph";
	names2.add(givenname2);
	personName2.setGivenName(givennames2);
	personName2.setSurname("Smith");
	personNameList2.add(personName2);
	CustomerType customer2 = new CustomerType();
	customer2.setPersonName(personNameList2);
	List<Email> emailList = new ArrayList<>();
	Email email = new Email();
	email.setValue("joseph@test.cc.co");
	emailList.add(email);
	customer2.setEmail(emailList);
	profile3.setCustomer(customer2);
	profileInfo1.setProfile(profile3);
	profiles2.add(profileInfo1);
	resGuest2.setProfiles(profiles2);
	resGuests1.add(resGuest2);
	hotelReservation1.setResGuests(resGuests1);
	hotelReservationList1.add(hotelReservation1);
	hotelResModify1.setHotelResModifies(hotelReservationList1);
	hotelResModifyRequest1.setHotelResModifyRq(hotelResModify1);
	hotelResModifyRequestList.add(hotelResModifyRequest1);
	requestWrapper.setAddRoomHotelResModifyRequest(hotelResModifyRequestList);
	requestWrapper.setRequestHeader(requestHeader);
	AddRoomHotelResModifyResponseWrapper response = accoService.otaAccoAddRoom(requestWrapper);
	System.out.println("***************************************************=" + response);
    }
}
