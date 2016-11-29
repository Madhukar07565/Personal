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
<%@page import="com.cnk.travelogix.sapintegrations.so.createchange.data.ZifTerpSalesOrderDataRequest" %>
<%@page import="com.cnk.travelogix.sapintegrations.so.createchange.data.ZifTerpSoHeaderData" %>
<%@page import="com.cnk.travelogix.sapintegrations.so.createchange.data.ZttTerpSoPartnersData" %>
<%@page import="com.cnk.travelogix.sapintegrations.so.createchange.data.ZifTerpSalesOrderDataResponse" %>
<%@page import="com.cnk.travelogix.sapintegrations.so.createchange.data.ZttTerpSoConditionsData" %>
<%@page import="com.cnk.travelogix.sapintegrations.so.createchange.data.ZifTerpSoConditionsData" %>
<%@page import="com.cnk.travelogix.sapintegrations.so.createchange.data.ZttTerpSoItemData" %>
<%@page import="com.cnk.travelogix.sapintegrations.so.createchange.data.ZifTerpSoItemData" %>
<html>
	<body>
		<h1>sapintegrations</h1>
		Welcome to my extension.

				
				<%
				
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
		final CRMServicesFacade crmServicesFacade = (CRMServicesFacade) context.getBean("crmServicesFacade");	
		
		ZifTerpSalesOrderDataRequest zifTerpSalesOrderDataRequest = new ZifTerpSalesOrderDataRequest();
		
		ZifTerpSoHeaderData zifTerpSoHeaderData = new ZifTerpSoHeaderData();	
		zifTerpSoHeaderData.setCampaignCode("101");
		zifTerpSoHeaderData.setCrmtMode("Model");
		zifTerpSoHeaderData.setDistChannel("Medium");
		zifTerpSoHeaderData.setDivision("SOUTH");
		zifTerpSalesOrderDataRequest.setSoHeader(zifTerpSoHeaderData);
		
		ZttTerpSoPartnersData zttTerpSoPartnersData = new ZttTerpSoPartnersData();	
		ZIfTerpSoPartnersData zIfTerpSoPartnersData = new ZIfTerpSoPartnersData();
		zIfTerpSoPartnersData.setItmNumber("123456");
		zIfTerpSoPartnersData.setPartnerFunction("ppppppp");
		zIfTerpSoPartnersData.setPartnNumb("123456");
		zttTerpSoPartnersData.getItem().add(zIfTerpSoPartnersData);
		zifTerpSalesOrderDataRequest.setSoPartners(zttTerpSoPartnersData);
		
		ZttTerpSoConditionsData zttTerpSoConditionsData = new ZttTerpSoConditionsData();
		ZifTerpSoConditionsData zifTerpSoConditionsData = new ZifTerpSoConditionsData();
		zifTerpSoConditionsData.setCondType("condtype");
		//zifTerpSoConditionsData.setCondValue(value);
		zifTerpSoConditionsData.setCrmtMode("crmtmode");
		zifTerpSoConditionsData.setCurrency("IN");
		zifTerpSoConditionsData.setItmNumber("010101");
		zttTerpSoConditionsData.getItem().add(zifTerpSoConditionsData);
		zifTerpSalesOrderDataRequest.setSoConditions(zttTerpSoConditionsData);
		
		ZttTerpSoItemData zttTerpSoItemData = new ZttTerpSoItemData();
		ZifTerpSoItemData zifTerpSoItemData = new ZifTerpSoItemData();
		zifTerpSoItemData.setAdult("Adult");
		zifTerpSoItemData.setCategory("Cat1");
		zifTerpSoItemData.setChild("Child1");
		zifTerpSoItemData.setItmNumber("000001");
		zttTerpSoItemData.getItem().add(zifTerpSoItemData);
		zifTerpSalesOrderDataRequest.setSoItems(zttTerpSoItemData);
		final ZifTerpSalesOrderDataResponse response2 = crmServicesFacade.createChangeSalesOrder(zifTerpSalesOrderDataRequest);
		
		out.println(response2.getStatus().getItem().get(0).getStatus());
		out.println(response2.getStatus().getItem().get(0).getMessage());
		%>
	</body>
</html>

