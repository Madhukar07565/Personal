package com.cnk.travelogix.suppliers.acco.service.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.suppliers.acco.data.AvailRequestSegment;
import com.cnk.travelogix.suppliers.acco.data.Criterion;
import com.cnk.travelogix.suppliers.acco.data.DateTimeSpanType;
import com.cnk.travelogix.suppliers.acco.data.GetDetailsReadRequest;
import com.cnk.travelogix.suppliers.acco.data.GetDetailsRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.GetDetailsResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.GuestCount;
import com.cnk.travelogix.suppliers.acco.data.GuestCountType;
import com.cnk.travelogix.suppliers.acco.data.HotelAvailRQ;
import com.cnk.travelogix.suppliers.acco.data.HotelRef;
import com.cnk.travelogix.suppliers.acco.data.HotelSearchCriteria;
import com.cnk.travelogix.suppliers.acco.data.RoomStayCandidate;
import com.cnk.travelogix.suppliers.acco.service.SupplierAccoService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;

public class GetDetailsTest {
    public static void main(String[] args) {

	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
	SupplierAccoService accoService = (SupplierAccoService) appContext.getBean("supplierAccoService");

	GetDetailsRequestWrapper requestWrapper = new GetDetailsRequestWrapper();

	RequestHeader requestHeader = new RequestHeader();
	requestHeader.setSessionID("2");
	requestHeader.setUserID("1");
	requestHeader.setTransactionID("3");
	Map<String, String> credentialsMap = new HashMap<String, String>();
	credentialsMap.put("Username", "teze3568");
	credentialsMap.put("Password", "teze4875");
	SupplierCredentials supplierCredential = new SupplierCredentials();
	List<SupplierCredentials> supplierCredentials = new ArrayList<>();
	SupplierID supplierIDHeader = new SupplierID();
	supplierIDHeader.setValue("ATI");
	supplierCredential.setSupplierID(supplierIDHeader);
	supplierCredentials.add(supplierCredential);

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

	requestHeader.setSupplierCredentials(supplierCredentials);

	GetDetailsReadRequest getDetailsReadRequest = new GetDetailsReadRequest();
	List<GetDetailsReadRequest> hotelAvailReadRequest = new ArrayList<>();
	getDetailsReadRequest.setSequence(1);
	getDetailsReadRequest.setSupplierID("ATI");

	HotelAvailRQ hotelAvailRQ = new HotelAvailRQ();

	BigDecimal bigDecimal = new BigDecimal("1.0");
	hotelAvailRQ.setVersion(bigDecimal);

	AvailRequestSegment availRequestSegment = new AvailRequestSegment();
	List<AvailRequestSegment> availRequestSegments = new ArrayList<>();
	List<Criterion> criterions = new ArrayList<>();
	HotelSearchCriteria hotelSearchCriteria = new HotelSearchCriteria();

	Criterion criterion = new Criterion();

	HotelRef hotelRef = new HotelRef();
	List<HotelRef> hotelRefs = new ArrayList<>();
	hotelRef.setHotelCode("HNLAQP");
	hotelRefs.add(hotelRef);
	criterion.setHotelRef(hotelRefs);

	DateTimeSpanType dateTimeSpanType = new DateTimeSpanType();
	dateTimeSpanType.setEnd("2016-07-30");
	dateTimeSpanType.setStart("2016-07-25");
	criterion.setStayDateRange(dateTimeSpanType);

	RoomStayCandidate roomStayCandidate = new RoomStayCandidate();
	List<RoomStayCandidate> roomStayCandidates = new ArrayList<>();
	GuestCountType guestCountType = new GuestCountType();

	GuestCount guestCount = new GuestCount();
	GuestCount guestCountData = new GuestCount();

	List<GuestCount> guestCounts = new ArrayList<>();
	guestCount.setAgeQualifyingCode("10");
	guestCount.setCount(1);

	guestCountData.setCount(1);
	guestCountData.setAgeQualifyingCode("8");
	guestCountData.setAge(3);

	guestCounts.add(guestCount);
	guestCounts.add(guestCountData);

	guestCountType.setGuestCount(guestCounts);

	roomStayCandidate.setGuestCounts(guestCountType);
	roomStayCandidates.add(roomStayCandidate);
	criterion.setRoomStayCandidates(roomStayCandidates);

	criterions.add(criterion);
	hotelSearchCriteria.setCriterion(criterions);

	availRequestSegment.setHotelSearchCriteria(hotelSearchCriteria);

	availRequestSegments.add(availRequestSegment);
	hotelAvailRQ.setAvailRequestSegments(availRequestSegments);

	getDetailsReadRequest.setHotelAvailRQ(hotelAvailRQ);
	requestWrapper.setRequestHeader(requestHeader);
	hotelAvailReadRequest.add(getDetailsReadRequest);
	requestWrapper.setGetDetailsReadRequest(hotelAvailReadRequest);

	GetDetailsResponseWrapper response = accoService.otaAccoGetDetails(requestWrapper);
	System.out.println("***************************************************=" + response);
    }
}
