package com.cnk.travelogix.suppliers.acco.service.test;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.suppliers.acco.data.ChildsAge;
import com.cnk.travelogix.suppliers.acco.data.GetPoliciesRQ;
import com.cnk.travelogix.suppliers.acco.data.GetPoliciesReadRequest;
import com.cnk.travelogix.suppliers.acco.data.GetPoliciesRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.GetPoliciesResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.Room;
import com.cnk.travelogix.suppliers.acco.data.RoomClass;
import com.cnk.travelogix.suppliers.acco.data.SupplierRefOne;
import com.cnk.travelogix.suppliers.acco.service.SupplierAccoService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;

public class GetPoliciesTest {
    public static void main(String[] args) {

	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
	SupplierAccoService accoService = (SupplierAccoService) appContext.getBean("supplierAccoService");

	List<GetPoliciesReadRequest> getPoliciesReadRequests = new ArrayList<>();
	GetPoliciesRequestWrapper requestWrapper = new GetPoliciesRequestWrapper();

	RequestHeader requestHeader = new RequestHeader();
	requestHeader.setSessionID("2");
	requestHeader.setUserID("1");
	requestHeader.setTransactionID("3");

	SupplierCredentials supplierCredential = new SupplierCredentials();
	List<SupplierCredentials> supplierCredentials = new ArrayList<>();
	SupplierID supplierIDHeader = new SupplierID();
	supplierIDHeader.setValue("TRAVELBULLZ");
	supplierCredential.setSupplierID(supplierIDHeader);
	supplierCredentials.add(supplierCredential);

	Credentials credentials = new Credentials();
	Map<String, String> credentialsMap = new HashMap<String, String>();
	credentialsMap.put("Username", "EzeegoOneTravel_DEV");
	credentialsMap.put("Password", "5wphJynXArxNqrTm3ETA9Mg");
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

	GetPoliciesReadRequest getPoliciesReadRequest = new GetPoliciesReadRequest();
	getPoliciesReadRequest.setSequence(1);
	SupplierID supplierID = new SupplierID();
	supplierID.setValue("TRAVELBULLZ");
	getPoliciesReadRequest.setSupplierID(supplierID);

	GetPoliciesRQ getPoliciesRQ = new GetPoliciesRQ();
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
	String date1 = "2015-07-20";
	String date2 = "2015-07-21";
	Date checkInDate;
	try {
	    checkInDate = simpleDateFormat.parse(date1);
	    getPoliciesRQ.setCheckInDate(checkInDate);
	} catch (ParseException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	Date checkOutDate;
	try {
	    checkOutDate = simpleDateFormat.parse(date2);
	    getPoliciesRQ.setCheckOutDate(checkOutDate);
	} catch (ParseException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	getPoliciesRQ.setCityID("7355");
	getPoliciesRQ.setCountryID("SG");

	/*
	 * getPoliciesRQ.setFlagAvail(flagAvail);
	 * getPoliciesRQ.setHbookingID("");
	 */
	getPoliciesRQ.setHotelID("205112");
	getPoliciesRQ.setInternalCode("");
	BigInteger bigInteger = new BigInteger("81");
	getPoliciesRQ.setNationalityID(bigInteger);
	/*
	 * getPoliciesRQ.setPaxPassport(""); getPoliciesRQ.setResNo("");
	 */

	RoomClass roomClass = new RoomClass();
	roomClass.setCurrencyCode("USD");
	BigInteger totalPrice = new BigInteger("45");
	roomClass.setTotalPrice(totalPrice);
	List<Room> rooms = new ArrayList<>();
	Room room = new Room();
	BigInteger productID = new BigInteger("258");
	room.setProductID(productID);
	BigInteger childs = new BigInteger("0");
	room.setChilds(childs);
	BigInteger adults = new BigInteger("2");
	room.setAdults(adults);
	BigInteger mapRoomID = new BigInteger("0");
	room.setMapRoomID(mapRoomID);
	BigInteger agreementID = new BigInteger("58");
	room.setAgreementID(agreementID);
	room.setSupplierCode("TPXv43");

	List<SupplierRefOne> supplierRef = new ArrayList<>();
	SupplierRefOne supplierRefOne = new SupplierRefOne();
	BigInteger id1 = new BigInteger("1");
	supplierRefOne.setId(id1);
	supplierRefOne.setValue("m+E2Bjfjqu0LuCEwb5pP4b93tDHSwLUsOnkG3nH27DF/Qwaj/EIGOAAOHBQn3MVy");

	SupplierRefOne supplierRefTwo = new SupplierRefOne();
	BigInteger id2 = new BigInteger("6");
	supplierRefTwo.setId(id2);
	supplierRefTwo.setValue("7zDzxW0GioD5fytTxvcbLagyGlJlgHvcKQ3L1ZMiXmo=");

	SupplierRefOne supplierRefThree = new SupplierRefOne();
	BigInteger id = new BigInteger("7");
	supplierRefThree.setId(id);
	supplierRefThree.setValue(
		"YP1ky71V9lXHWTi52wY1Ssg3NC0P3JIczmfsF2LguVgY6hKK6lNaFu2NH0jZbN7Hjmr wR9f0oCctE1hs6xFx6jMG7ngeKv7njKRL9rFyJKBLnoTSWkLriCMr1KUC3yvwrvZu9e1HmDXlP0AtDYsWDOpXoLj4BW m62iNYFU2w14wBRHqeAdjO17slywDyyWT1Ue22PbY0WK9gLyoE 1yJTViWNamI42EjyZgijXIpL/QSl2TVNnwJJiJ/gFM38knX8wptXgryz0kORHqfuJaYxcogR5tD3zv9a5Ju/sEyt4yP/c4JSb9bDxof3hOsvTxwHKEzGpd7gA4 YLLOyCRrcVX7H1vjHnfPvppDIfglF27jUSQkRGa9cdVgtarGV3LIm7ZHc0hPQaR7OVCbsF9YWPQA0 L3fhdTf I8Tggqmm1BWp1AaJMAGpPu0OVDwZskLF8MSMfeaTBWNplmL6Slp7VSi5YEqu7Mqotl8/rZai7kNFc0M90eeVBEJ4XL5BbzxU/LZXBSkvac0RdtYj5D2QHfJ80z2eg5D1eB7dP9w8 OuuEjuWGwwF6beatYN1GJGarmKpohwXHiMf7k iQQ==");

	supplierRef.add(supplierRefOne);
	supplierRef.add(supplierRefTwo);
	supplierRef.add(supplierRefThree);
	room.setSupplierRef(supplierRef);

	Room room1 = new Room();
	BigInteger productID1 = new BigInteger("257");
	room1.setProductID(productID1);
	BigInteger childs1 = new BigInteger("2");
	room1.setChilds(childs1);
	BigInteger adults1 = new BigInteger("1");
	room1.setAdults(adults1);
	ChildsAge childsAge = new ChildsAge();
	List<BigInteger> ages = new ArrayList<>();
	BigInteger age1 = new BigInteger("3");
	BigInteger age2 = new BigInteger("4");
	ages.add(age1);
	ages.add(age2);
	childsAge.setAge(ages);
	room1.setChildsAge(childsAge);

	BigInteger mapRoomID1 = new BigInteger("0");
	room1.setMapRoomID(mapRoomID1);
	BigInteger agreementID1 = new BigInteger("58");
	room1.setAgreementID(agreementID1);
	room1.setSupplierCode("TPXv43");

	List<SupplierRefOne> supplierRef1 = new ArrayList<>();
	SupplierRefOne supplierRefOne1 = new SupplierRefOne();
	BigInteger id11 = new BigInteger("1");
	supplierRefOne1.setId(id11);
	supplierRefOne1.setValue("npat5fNAyevc4ETOkTxEeVM6fcaDBPKcLLyukw7Kk6K++5c2BU340ul+zAdl3SP0");

	SupplierRefOne supplierRefTwo1 = new SupplierRefOne();
	BigInteger id21 = new BigInteger("6");
	supplierRefTwo1.setId(id21);
	supplierRefTwo1.setValue("7zDzxW0GioD5fytTxvcbLagyGlJlgHvcKQ3L1ZMiXmo=");

	SupplierRefOne supplierRefThree1 = new SupplierRefOne();
	BigInteger id111 = new BigInteger("7");
	supplierRefThree1.setId(id111);
	supplierRefThree1.setValue(
		"YP1ky71V9lXHWTi52wY1Ssg3NC0P3JIczmfsF2LguVgY6hKK6lNaFu2NH0jZbN7Hjmr wR9f0oCctE1hs6xFx6jMG7ngeKv7njKRL9rFyJKBLnoTSWkLriCMr1KUC3yvwrvZu9e1HmDXlP0AtDYsWDOpXoLj4BW m62iNYFU2w14wBRHqeAdjO17slywDyyWT1Ue22PbY0WK9gLyoE 1yJTViWNamI42EjyZgijXIpL/QSl2TVNnwJJiJ/gFM38knX8wptXgryz0kORHqfuJaYxcogR5tD3zv9a5Ju/sEyt4yP/c4JSb9bDxof3hOsvTxwHKEzGpd7gA4 YLLOyCRrcVX7H1vjHnfPvppDIfglF27jUSQkRGa9cdVgtarGV3LIm7ZHc0hPQaR7OVCbsF9YWPQA0 L3fhdTf I8Tggqmm1BWp1AaJMAGpPu0OVDwZskLF8MSMfeaTBWNplmL6Slp7VSi5YEqu7Mqotl8/rZai7kNFc0M90eeVBEJ4XL5BbzxU/LZXBSkvac0RdtYj5D2QHfJ80z2eg5D1eB7dP9w8 OuuEjuWGwwF6beatYN1GJGarmKpohwXHiMf7k iQQ==");

	supplierRef1.add(supplierRefOne1);
	supplierRef1.add(supplierRefTwo1);
	supplierRef1.add(supplierRefThree1);

	room1.setSupplierRef(supplierRef1);
	rooms.add(room);
	rooms.add(room1);
	roomClass.setRooms(rooms);
	getPoliciesRQ.setRoomClass(roomClass);

	getPoliciesRQ.setSupplier("TPXv43");

	getPoliciesReadRequest.setGetPoliciesRQ(getPoliciesRQ);
	getPoliciesReadRequests.add(getPoliciesReadRequest);

	requestWrapper.setRequestHeader(requestHeader);
	requestWrapper.setGetPoliciesReadRequest(getPoliciesReadRequests);
	GetPoliciesResponseWrapper response = accoService.otaAccoGetPolicies(requestWrapper);
	System.out.println("***************response = " + response);
    }
}
