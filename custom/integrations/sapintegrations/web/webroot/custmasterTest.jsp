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
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifTerpPartnerSaveDataRequest" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifTerpPartnerSaveDataResponse" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifErpTtContmastData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifErpStCustmastData" %>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifErpStContmastData" %>
<html>
	<body>
		<h1>sapintegrations</h1>
		Welcome to my extension.

				
				<%
				
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
		final CRMServicesFacade crmServicesFacade = (CRMServicesFacade) context.getBean("crmServicesFacade");	
		
		ZifTerpPartnerSaveDataRequest zifTerpPartnerSaveDataRequest = new ZifTerpPartnerSaveDataRequest();	
		
		ZifErpStCustmastData zifErpStCustmastData = new ZifErpStCustmastData();
		zifErpStCustmastData.setAccAssGrp("Acc Group");
		zifErpStCustmastData.setAddressType("Line1");
		zifErpStCustmastData.setBirthDate("01-10-2012");
		zifErpStCustmastData.setCountryKey("IN");
		zifTerpPartnerSaveDataRequest.setCustomerData(zifErpStCustmastData);
		
		ZifErpTtContmastData zifErpTtContmastData = new ZifErpTtContmastData();
		ZifErpStContmastData zifErpStContmastData = new ZifErpStContmastData();
		zifErpStContmastData.setContAccgrp("contGroup");
		zifErpStContmastData.setContCity("INDIA");
		zifErpStContmastData.setContHouseNo("NO 36");
		zifErpTtContmastData.getItem().add(zifErpStContmastData);
		zifTerpPartnerSaveDataRequest.setContactData(zifErpTtContmastData);
		
		final ZifTerpPartnerSaveDataResponse response2 = crmServicesFacade.partnerSave(zifTerpPartnerSaveDataRequest);
		
		out.println(response2.getStatus().getItem().get(0).getStatus());
		out.println(response2.getStatus().getItem().get(0).getMessage());
		%>
	</body>
</html>

