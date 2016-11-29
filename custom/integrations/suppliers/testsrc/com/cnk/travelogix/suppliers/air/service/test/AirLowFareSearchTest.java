/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.air.service.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.client.RestTemplate;

import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchRQ;
import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchRequest;
import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.CabinPref;
import com.cnk.travelogix.suppliers.air.data.FlightTypePref;
import com.cnk.travelogix.suppliers.air.data.OriginDestinationInformation;
import com.cnk.travelogix.suppliers.air.data.PassengerTypeQuantity;
import com.cnk.travelogix.suppliers.air.data.PriceRequestInformation;
import com.cnk.travelogix.suppliers.air.data.TravelPreferences;
import com.cnk.travelogix.suppliers.air.data.TravelerInfoSummary;
import com.cnk.travelogix.suppliers.air.data.TravelerInformation;
import com.cnk.travelogix.suppliers.air.service.SupplierAirService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;

/**
 * @author I077988
 *
 */
public class AirLowFareSearchTest {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * @param args
     */
    public static void main(String[] args) {

	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
	SupplierAirService airService = (SupplierAirService) appContext.getBean("supplierAirService");

	AirLowFareSearchRequest request = new AirLowFareSearchRequest();
	AirLowFareSearchRQ airLowFareSearchRQ = new AirLowFareSearchRQ();
	RequestHeader requestHeader = new RequestHeader();
	requestHeader.setSessionID("Sabre_1");
	requestHeader.setUserID("PERF");
	requestHeader.setTransactionID("Search_1");

	Map<String, String> credentialsMap = new HashMap<String, String>();
	credentialsMap.put("Username", "SBj3tNir+Ko=");
	credentialsMap.put("Password", "eq7vMf+HQB4=");
	credentialsMap.put("Organization", "uKsgtv3gvfM=");
	credentialsMap.put("PseudoCityCode", "uKsgtv3gvfM=");
	credentialsMap.put("CompanyCode", "GrPsFOYmmr4=");

	List<SupplierCredentials> supplierCredentials = new ArrayList<SupplierCredentials>();
	SupplierCredentials supplierCredential = new SupplierCredentials();
	SupplierID supplierID = new SupplierID();
	supplierID.setValue("SABRE");
	supplierCredential.setSupplierID(supplierID);

	Credentials credentials = new Credentials();

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
	supplierCredentials.add(supplierCredential);
	requestHeader.setSupplierCredentials(supplierCredentials);
	request.setRequestHeader(requestHeader);

	List<OriginDestinationInformation> originDestinationInformations = new ArrayList<>();
	OriginDestinationInformation OriginDestinationInformation = new OriginDestinationInformation();
	OriginDestinationInformation.setDepartureDateTime("2016-08-10T00:00:00");
	OriginDestinationInformation.setDestinationLocationCode("DEL");
	OriginDestinationInformation.setOriginLocationCode("BOM");
	originDestinationInformations.add(OriginDestinationInformation);
	airLowFareSearchRQ.setOriginDestinationInformation(originDestinationInformations);

	List<TravelPreferences> travelPreferences = new ArrayList<>();
	TravelPreferences travelPreference = new TravelPreferences();
	List<FlightTypePref> flightTypePrefs = new ArrayList<>();
	FlightTypePref flightTypePref = new FlightTypePref();
	//flightTypePref.setFlightType("Direct");
	flightTypePref.setMaxConnections(new BigInteger("10"));
	flightTypePrefs.add(flightTypePref);
	travelPreference.setFlightTypePref(flightTypePrefs);

	travelPreference.setMaxStopsQuantity(1);

	//travelPreference.s

	List<CabinPref> cabinPrefs = new ArrayList<>();
	CabinPref cabinPref = new CabinPref();
	cabinPref.setCabin("Economy");
	cabinPrefs.add(cabinPref);
	travelPreference.setCabinPref(cabinPrefs);
	travelPreferences.add(travelPreference);
	airLowFareSearchRQ.setTravelPreferences(travelPreferences);

	TravelerInfoSummary travelerInfoSummary = new TravelerInfoSummary();

	List<TravelerInformation> travelerInformations = new ArrayList<>();
	TravelerInformation travelerInformation = new TravelerInformation();
	List<PassengerTypeQuantity> passengerTypeQuantitys = new ArrayList<>();
	PassengerTypeQuantity PassengerTypeQuantity = new PassengerTypeQuantity();
	PassengerTypeQuantity.setCode("ADT");
	PassengerTypeQuantity.setQuantity(new BigInteger("2"));
	passengerTypeQuantitys.add(PassengerTypeQuantity);
	travelerInformation.setPassengerTypeQuantity(passengerTypeQuantitys);
	travelerInformations.add(travelerInformation);
	travelerInfoSummary.setAirTraveler(travelerInformations);

	PriceRequestInformation priceRequestInformation = new PriceRequestInformation();
	priceRequestInformation.setCurrencyCode("INR");
	priceRequestInformation.setPricingSource("Published");
	travelerInfoSummary.setPriceRequestInformation(priceRequestInformation);

	TPAExtensions tpaExtensions = new TPAExtensions();
	Map<String, String> keyValueMap = new HashMap<String, String>();
	keyValueMap.put("TripType", "OneWay");
	keyValueMap.put("NearbyDepartures", "false");
	keyValueMap.put("NearbyDestinations", "false");
	tpaExtensions.setKeyValueMap(keyValueMap);
	travelerInfoSummary.setTpaExtensions(tpaExtensions);

	airLowFareSearchRQ.setTravelerInfoSummary(travelerInfoSummary);
	airLowFareSearchRQ.setVersion(new BigDecimal("1"));
	airLowFareSearchRQ.setTarget("Test");

	request.setAirLowFareSearchRQ(airLowFareSearchRQ);

	final AirLowFareSearchResponseWrapper response = airService.otaAirLowFareSearchSync(request);

	System.out.println("Success");
    }
}
