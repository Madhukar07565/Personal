<%@page import="com.cnk.travelogix.suppliers.air.data.AirLowFareSearchResponseWrapper"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="com.cnk.travelogix.suppliers.common.data.TPAExtensions"%>
<%@page import="com.cnk.travelogix.suppliers.air.data.PriceRequestInformation"%>
<%@page import="com.cnk.travelogix.suppliers.air.data.PassengerTypeQuantity"%>
<%@page import="com.cnk.travelogix.suppliers.air.data.TravelerInformation"%>
<%@page import="com.cnk.travelogix.suppliers.air.data.TravelerInfoSummary"%>
<%@page import="com.cnk.travelogix.suppliers.air.data.CabinPref"%>
<%@page import="java.math.BigInteger"%>
<%@page import="com.cnk.travelogix.suppliers.air.data.FlightTypePref"%>
<%@page import="com.cnk.travelogix.suppliers.air.data.TravelPreferences"%>
<%@page import="com.cnk.travelogix.suppliers.air.data.OriginDestinationInformation"%>
<%@page import="com.cnk.travelogix.suppliers.common.data.OperationURL"%>
<%@page import="com.cnk.travelogix.suppliers.common.data.Credential"%>
<%@page import="com.cnk.travelogix.suppliers.common.data.Credentials"%>
<%@page import="com.cnk.travelogix.suppliers.common.data.SupplierID"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.cnk.travelogix.suppliers.common.data.SupplierCredentials"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.cnk.travelogix.suppliers.common.data.RequestHeader"%>
<%@page import="com.cnk.travelogix.suppliers.air.data.AirLowFareSearchRQ"%>
<%@page import="com.cnk.travelogix.suppliers.air.data.AirLowFareSearchRequest"%>
<%@page import="com.cnk.travelogix.suppliers.air.service.SupplierAirService"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="de.hybris.platform.core.Registry"%>
<html>
	<body>
		<h1>suppliers</h1>
		Welcome to my extension.
	<%

	ApplicationContext appContext = Registry.getApplicationContext();
	SupplierAirService airService = (SupplierAirService) appContext.getBean("supplierAirService");

	AirLowFareSearchRequest myrequest = new AirLowFareSearchRequest();
	AirLowFareSearchRQ airLowFareSearchRQ = new AirLowFareSearchRQ();
	RequestHeader requestHeader = new RequestHeader();
	requestHeader.setSessionID("Sabre_1");
	requestHeader.setUserID("PERF");
	requestHeader.setTransactionID("Search_1");

	Map<String, String> credentialsMap = new HashMap();
	credentialsMap.put("Username", "SBj3tNir+Ko=");
	credentialsMap.put("Password", "eq7vMf+HQB4=");
	credentialsMap.put("Organization", "uKsgtv3gvfM=");
	credentialsMap.put("PseudoCityCode", "uKsgtv3gvfM=");
	credentialsMap.put("CompanyCode", "GrPsFOYmmr4=");

	List<SupplierCredentials> supplierCredentials = new ArrayList();
	SupplierCredentials supplierCredential = new SupplierCredentials();
	SupplierID supplierID = new SupplierID();
	supplierID.setValue("SABRE");
	supplierCredential.setSupplierID(supplierID);

	Credentials credentials = new Credentials();

	List<Credential> credentialList = new ArrayList();
	for (final Map.Entry<String, String> keyValueMap : credentialsMap.entrySet()) {
	    Credential credential = new Credential();
	    credential.setName(keyValueMap.getKey());
	    credential.setValue(keyValueMap.getValue());
	    credential.setIsEncrypted(true);
	    credentialList.add(credential);
	}
	credentials.setCredential(credentialList);

	List<OperationURL> operationURLList = new ArrayList();
	OperationURL operationURL = new OperationURL();
	operationURL.setValue("https://sws3-crt.cert.sabre.com/");
	operationURL.setOperation("all");
	operationURLList.add(operationURL);
	credentials.setOperationURL(operationURLList);

	supplierCredential.setCredentials(credentials);
	supplierCredentials.add(supplierCredential);
	requestHeader.setSupplierCredentials(supplierCredentials);
	myrequest.setRequestHeader(requestHeader);

	List<OriginDestinationInformation> originDestinationInformations = new ArrayList();
	OriginDestinationInformation OriginDestinationInformation = new OriginDestinationInformation();
	OriginDestinationInformation.setDepartureDateTime("2016-08-10T00:00:00");
	OriginDestinationInformation.setDestinationLocationCode("DEL");
	OriginDestinationInformation.setOriginLocationCode("BOM");
	originDestinationInformations.add(OriginDestinationInformation);
	airLowFareSearchRQ.setOriginDestinationInformation(originDestinationInformations);

	List<TravelPreferences> travelPreferences = new ArrayList();
	TravelPreferences travelPreference = new TravelPreferences();
	List<FlightTypePref> flightTypePrefs = new ArrayList();
	FlightTypePref flightTypePref = new FlightTypePref();
	//flightTypePref.setFlightType("Direct");
	flightTypePref.setMaxConnections(new BigInteger("10"));
	flightTypePrefs.add(flightTypePref);
	travelPreference.setFlightTypePref(flightTypePrefs);

	travelPreference.setMaxStopsQuantity(1);

	//travelPreference.s

	List<CabinPref> cabinPrefs = new ArrayList();
	CabinPref cabinPref = new CabinPref();
	cabinPref.setCabin("Economy");
	cabinPrefs.add(cabinPref);
	travelPreference.setCabinPref(cabinPrefs);
	travelPreferences.add(travelPreference);
	airLowFareSearchRQ.setTravelPreferences(travelPreferences);

	TravelerInfoSummary travelerInfoSummary = new TravelerInfoSummary();

	List<TravelerInformation> travelerInformations = new ArrayList();
	TravelerInformation travelerInformation = new TravelerInformation();
	List<PassengerTypeQuantity> passengerTypeQuantitys = new ArrayList();
	PassengerTypeQuantity PassengerTypeQuantity = new PassengerTypeQuantity();
	PassengerTypeQuantity.setCode("ADT");
	PassengerTypeQuantity.setQuantity(new BigInteger("2"));
	passengerTypeQuantitys.add(PassengerTypeQuantity);
	travelerInformation.setPassengerTypeQuantity(passengerTypeQuantitys);
	travelerInformations.add(travelerInformation);
	//travelerInfoSummary.setTravelerInformation(travelerInformations);

	PriceRequestInformation priceRequestInformation = new PriceRequestInformation();
	priceRequestInformation.setCurrencyCode("INR");
	priceRequestInformation.setPricingSource("Published");
	travelerInfoSummary.setPriceRequestInformation(priceRequestInformation);

	TPAExtensions tpaExtensions = new TPAExtensions();
	Map<String, String> keyValueMap = new HashMap();
	keyValueMap.put("TripType", "OneWay");
	keyValueMap.put("NearbyDepartures", "false");
	keyValueMap.put("NearbyDestinations", "false");
	tpaExtensions.setKeyValueMap(keyValueMap);
	travelerInfoSummary.setTpaExtensions(tpaExtensions);

	airLowFareSearchRQ.setTravelerInfoSummary(travelerInfoSummary);
	airLowFareSearchRQ.setVersion(new BigDecimal("1"));
	airLowFareSearchRQ.setTarget("Test");

	myrequest.setAirLowFareSearchRQ(airLowFareSearchRQ);

	final AirLowFareSearchResponseWrapper response1 = airService.otaAirLowFareSearchSync(myrequest);
	out.println(response1.getAirLowFareSearchResponses().get(0).getAirLowFareSearchRS().getErrors().get(0).getCode());
	System.out.println("Success");
	 %>
	</body>
</html>

