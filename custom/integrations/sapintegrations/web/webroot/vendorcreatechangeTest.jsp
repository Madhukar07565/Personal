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

<%@page import="com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data.ZVendorCreateChangeServiceDataRequest" %>
<%@page import="com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data.ZvendorInputData" %>
<%@page import="com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data.ZVendorCreateChangeServiceDataResponse" %>
<%@page import="com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data.ZbankDetailTtData" %>
<%@page import="com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data.ZbankDetailData" %>
<html>
	<body>
		<h1>sapintegrations</h1>
		Welcome to my extension.

				
				<%
				
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
		final SAPServicesFacade sapServicesFacade = (SAPServicesFacade) context.getBean("sapServicesFacade");	
		
		ZVendorCreateChangeServiceDataRequest zVendorCreateChangeServiceDataRequest = new ZVendorCreateChangeServiceDataRequest();
		
		
		ZvendorInputData zvendorInputData = new ZvendorInputData();
		zvendorInputData.setUniqid("UNIQUE1");
		//zvendorInputData.setBegru("Begur1");
		//zvendorInputData.setCity1("Bang");
		//zvendorInputData.setLangu("EN");
		//zvendorInputData.setAkont("Akont");
		//zvendorInputData.setAltkn("Altkn");
		//zvendorInputData.setCity1("Bnag");
		//zvendorInputData.setCountry("India");
		//zvendorInputData.setFaxNumber("123");
		//zvendorInputData.setKalsk("kalsk");
		//zvendorInputData.setLangu("langu");
		//zvendorInputData.setLebre("lkebre");
		zvendorInputData.setLifnr("1002018412");
		zvendorInputData.setBukrs("C000");
		zvendorInputData.setEkorg("CKPO");
		zvendorInputData.setName1("Yahoo!!!!");
		zvendorInputData.setSperr("U");
		zvendorInputData.setSperm("X");
		zvendorInputData.setPernr("PP");
		
		
	 	ZbankDetailTtData zbankDetailTtData = new ZbankDetailTtData();
	 	ZbankDetailData zbankDetailData = new ZbankDetailData();
// 	 	zbankDetailData.setBank("HDFC");
// 	 	zbankDetailData.setBankl01("Bank01");
// 	 	zbankDetailData.setBankn01("Bankn01");
// 	 	zbankDetailData.setBanks01("bankso1");
// 	 	zbankDetailData.setBrnch("Branch1");
// 	 	zbankDetailData.setBvtyp("BVT");
// 	 	zbankDetailData.setKoinh01("koin");
// 	 	zbankDetailData.setOrt01("ort");
// 	 	zbankDetailData.setPostCode1("571236");
// 	 	zbankDetailData.setProvz("Provz");
// 	 	zbankDetailData.setSwift("swift");
// 	 	zbankDetailData.setStrSuppl4("suppl");
// 	 	zbankDetailData.setStrSuppl3("suppl3");
// 	 	zbankDetailData.setProvz("PRO");
	 	
	 	zbankDetailTtData.getItem().add(zbankDetailData);
	 	zvendorInputData.setBank(zbankDetailTtData); 	
	 		 	
	 	zVendorCreateChangeServiceDataRequest.setIsVendorInput(zvendorInputData);		
		
		final ZVendorCreateChangeServiceDataResponse response2 = sapServicesFacade.createChangeVendor(zVendorCreateChangeServiceDataRequest);
		out.println(response2.getEtStatus().getItem().get(0).getStatus());
		out.println(response2.getEtStatus().getItem().get(0).getMessage());
		out.println();
		%>
	</body>
</html>

