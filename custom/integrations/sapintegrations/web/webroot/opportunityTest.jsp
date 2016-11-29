<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifTerpOppHeaderData"%>
<%@page import="com.cnk.travelogix.sapintegrations.so.createchange.data.ZIfTerpSoPartnersData"%>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifTerpOpportunityDataResponse"%>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifTerpOpportunityDataRequest"%>
<%@page import="com.cnk.travelogix.sapintegrations.facade.CRMServicesFacade"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.MappingTableOperationResponseData"%>
<%@page import="com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.MaintainMappingTableRequestData"%>
<%@page import="com.cnk.travelogix.sapintegrations.subscribe.account.data.ExternalAccount"%>
<%@page import="com.cnk.travelogix.sapintegrations.subscribe.account.data.ExternalAccountMaintainData"%>
<%@page import="com.cnk.travelogix.sapintegrations.subscribe.account.data.ExternalAccountOperationResponseData"%>
<%@page import="com.cnk.travelogix.sapintegrations.subscribe.account.data.TaxInfo"%>
<%@page import="com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccount"%>
<%@page import="com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountOperationResponseData"%>
<%@page import="com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountMaintainData"%>
<%@page import="java.util.Date"%>
<%@page import="javax.xml.datatype.DatatypeFactory"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="javax.xml.datatype.XMLGregorianCalendar"%>
<%@page import="com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.MappingTableRowOperationResponseData"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.MappingTableRowData"%>
<%@page import="com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.MappingTableRowMaintainRequestData"%>
<%@page import="com.cnk.travelogix.sapintegrations.facade.CCServicesFacade"%>
<%@page import="com.cnk.travelogix.sapintegrations.facade.SAPServicesFacade"%>
<%@page import="de.hybris.platform.core.Registry"%>

<%@page import="com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZttTerpOppItemDataData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifTerpOppItemDataData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZttTerpOppPartnerData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifTerpOppPartnerData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatAccommodationData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatActivitiesData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatAircraftData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatBusData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatCruiseData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatFlightsData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatForexData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatHolidaysData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatInsuranceData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatMotorBikeData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatRailData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdRvSbTuktukLimousinData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatVehicleRentalData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatVehSelfDriveData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatVehicleTransferData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifProdCatVisaData" %>
<html>
	<body>
		<h1>sapintegrations</h1>
		Welcome to my extension.
		
		<%
				
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
		final CRMServicesFacade crmServicesFacade = (CRMServicesFacade) context.getBean("crmServicesFacade");	
		
		ZifTerpOpportunityDataRequest zifTerpOpportunityDataRequest = new ZifTerpOpportunityDataRequest();
		
		ZifTerpOppHeaderData zifTerpOppHeaderData = new ZifTerpOppHeaderData();
		zifTerpOppHeaderData.setContactDate("data");
		zifTerpOppHeaderData.setUniqid("uniqueid");
		XMLGregorianCalendar xmlGregorianCalendarnew = new XMLGregorianCalendarImpl(); 
		xmlGregorianCalendarnew.setDay(2);
		xmlGregorianCalendarnew.setHour(3);
		zifTerpOppHeaderData.setContactTime(xmlGregorianCalendarnew);
		zifTerpOpportunityDataRequest.setOppHeader(zifTerpOppHeaderData);
		
		ZttTerpOppItemDataData zttTerpOppItemDataData = new ZttTerpOppItemDataData();
		ZifTerpOppItemDataData zifTerpOppItemDataData = new ZifTerpOppItemDataData();
		zifTerpOppItemDataData.setAdult("Adult");
		zifTerpOppItemDataData.setCategory("Category 1");
		zifTerpOppItemDataData.setChild("Child");
		zttTerpOppItemDataData.getItem().add(zifTerpOppItemDataData);
		zifTerpOpportunityDataRequest.setOppItem(zttTerpOppItemDataData);
		
		ZttTerpOppPartnerData zttTerpOppPartnerData = new ZttTerpOppPartnerData();
		ZifTerpOppPartnerData zifTerpOppPartnerData = new ZifTerpOppPartnerData();
		zifTerpOppPartnerData.setCrmtMode("Crmt Mode");
		zifTerpOppPartnerData.setItmNumber("Number");
		zifTerpOppPartnerData.setPartnerFunction("Function");
		zifTerpOppPartnerData.setPartnNumb("Partner Number");
		zttTerpOppPartnerData.getItem().add(zifTerpOppPartnerData);
		zifTerpOpportunityDataRequest.setOppPartner(zttTerpOppPartnerData);
		
		ZifProdCatAccommodationData zifProdCatAccommodationData = new ZifProdCatAccommodationData();
		zifProdCatAccommodationData.setCheckInDate("01-01-01");
		zifProdCatAccommodationData.setLocation("Loc");
		zifProdCatAccommodationData.setNoOfAdults("2");
		zifTerpOpportunityDataRequest.setProdCatAccommodation(zifProdCatAccommodationData);
		
		ZifProdCatActivitiesData zifProdCatActivitiesData = new ZifProdCatActivitiesData();
		zifProdCatActivitiesData.setDestination("Bnag");
		zifProdCatActivitiesData.setThemes("themes");
		zifTerpOpportunityDataRequest.setProdCatActivities(zifProdCatActivitiesData);
		
		ZifProdCatAircraftData zifProdCatAircraftData = new ZifProdCatAircraftData();
		zifProdCatAircraftData.setDepartureDate("02-02-02");
		zifProdCatAircraftData.setNoOfPassangers("5");
		zifTerpOpportunityDataRequest.setProdCatAircraft(zifProdCatAircraftData);
		
		ZifProdCatBusData zifProdCatBusData = new ZifProdCatBusData();
		zifProdCatBusData.setFromDate("03-03-03");
		zifProdCatBusData.setNoOfAdults("5");
		zifTerpOpportunityDataRequest.setProdCatBus(zifProdCatBusData);	
		
		ZifProdCatCruiseData zifProdCatCruiseData = new ZifProdCatCruiseData();
		zifProdCatCruiseData.setBudgetPerPerson("per person");
		zifProdCatCruiseData.setCruiseLength("length");
		zifProdCatCruiseData.setCruiseLiner("line");
		zifTerpOpportunityDataRequest.setProdCatCruise(zifProdCatCruiseData);
		
		ZifProdCatFlightsData zifProdCatFlightsData = new ZifProdCatFlightsData();
		zifProdCatFlightsData.setDepartureDate("05-05-05");
		zifProdCatFlightsData.setMeals("meals");
		zifTerpOpportunityDataRequest.setProdCatFlights(zifProdCatFlightsData);
		
		ZifProdCatForexData zifProdCatForexData = new ZifProdCatForexData();
		zifProdCatForexData.setCurrencyToBuySell("currency");
		zifProdCatForexData.setNoOfTraveller("traveller");
		zifTerpOpportunityDataRequest.setProdCatForex(zifProdCatForexData);
		
		ZifProdCatHolidaysData zifProdCatHolidaysData = new ZifProdCatHolidaysData();
		zifProdCatHolidaysData.setAccommodationType("Acco Type");
		zifTerpOpportunityDataRequest.setProdCatHolidays(zifProdCatHolidaysData);
		
		ZifProdCatInsuranceData zifProdCatInsuranceData = new ZifProdCatInsuranceData();
		zifProdCatInsuranceData.setAgeOfAdults("4");
		zifTerpOpportunityDataRequest.setProdCatInsurance(zifProdCatInsuranceData);
		
		ZifProdCatMotorBikeData zifProdCatMotorBikeData = new ZifProdCatMotorBikeData();
		zifProdCatMotorBikeData.setDropOffDate("06-06-06");
		zifProdCatMotorBikeData.setNoOfAdults("9");
		zifTerpOpportunityDataRequest.setProdCatMotorBike(zifProdCatMotorBikeData);
		
		ZifProdCatRailData zifProdCatRailData = new ZifProdCatRailData();
		zifProdCatRailData.setNoOfAdults("4");
		zifTerpOpportunityDataRequest.setProdCatRail(zifProdCatRailData);
		
		ZifProdRvSbTuktukLimousinData zifProdRvSbTuktukLimousinData = new ZifProdRvSbTuktukLimousinData();
		zifProdRvSbTuktukLimousinData.setNoOfPassangers("5");
		zifTerpOpportunityDataRequest.setProdCatRvSbTuktukLimousin(zifProdRvSbTuktukLimousinData);
		
		ZifProdCatVehicleRentalData zifProdCatVehicleRentalData = new ZifProdCatVehicleRentalData();
		zifProdCatVehicleRentalData.setNoOfChildren("3");
		zifTerpOpportunityDataRequest.setProdCatVehicleRental(zifProdCatVehicleRentalData);
		
		ZifProdCatVehSelfDriveData zifProdCatVehSelfDriveData = new ZifProdCatVehSelfDriveData();
		zifProdCatVehSelfDriveData.setNoOfChildren("4");
		zifProdCatVehSelfDriveData.setPickUpDate("09-09-09");
		zifTerpOpportunityDataRequest.setProdCatVehicleSelfDrive(zifProdCatVehSelfDriveData);
		
		ZifProdCatVehicleTransferData zifProdCatVehicleTransferData = new ZifProdCatVehicleTransferData();
		zifProdCatVehicleTransferData.setNoOfChildren("23");
		zifTerpOpportunityDataRequest.setProdCatVehicleTransfer(zifProdCatVehicleTransferData);
		
		ZifProdCatVisaData zifProdCatVisaData = new ZifProdCatVisaData();
		zifProdCatVisaData.setCitizenship("citizen");
		zifTerpOpportunityDataRequest.setProdCatVisa(zifProdCatVisaData);
		
		final ZifTerpOpportunityDataResponse response2 = crmServicesFacade.opportunity(zifTerpOpportunityDataRequest);
		
		out.println(response2.getStatus().getItem().get(0).getStatus());
		out.println(response2.getStatus().getItem().get(0).getMessage());
		%>
	</body>
</html>

