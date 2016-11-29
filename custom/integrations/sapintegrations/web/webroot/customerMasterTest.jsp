<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifErpTtContmastData"%>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifErpStCustmastData"%>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifTerpPartnerSaveDataResponse"%>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifTerpPartnerSaveDataRequest"%>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZifTerpComplaintsDataResponse"%>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZifTerpComplaintsPartnersData"%>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZttTerpComplaintsPartnersData"%>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZifTerpComplaintsItemsData"%>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZttTerpComplaintsItemsData"%>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZifTerpComplaintsHeaderData"%>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZifTerpComplaintsDataRequest"%>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.b2b.data.ZifErpStContmastB2BData"%>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.b2b.data.ZifErpStCustmastB2BData"%>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.b2b.data.ZifErpTtContmastB2BData"%>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.b2b.data.ZifTerpPartnerSaveB2BDataResponse"%>
<%@page import="com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.b2b.data.ZifTerpPartnerSaveB2BDataRequest"%>
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
<html>
	<body>
		<h1>sapintegrations</h1>
		Welcome to my extension.
		
				<%				
				
				WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
				final CRMServicesFacade crmServicesFacade = (CRMServicesFacade) context.getBean("crmServicesFacade");
				final ZifTerpPartnerSaveDataRequest zifTerpPartnerSaveDataRequest = new ZifTerpPartnerSaveDataRequest();
				ZifErpStCustmastData zifErpStCustmastData = new ZifErpStCustmastData();
				zifErpStCustmastData.setObjectTask("I");
				zifErpStCustmastData.setLegacyBp("MM00082");
				zifErpStCustmastData.setCategory("1");
				zifErpStCustmastData.setBpRole("CRM000");
				zifErpStCustmastData.setCustAccgrp("RETL");
				zifErpStCustmastData.setCompCode("C000");
				zifErpStCustmastData.setSalesOrg("O 50000610");
				zifErpStCustmastData.setDistChannel("C1");
				zifErpStCustmastData.setDivision("C1");
				zifErpStCustmastData.setName1("Praveen");
				zifErpStCustmastData.setSearchTerm("Praveen");
				zifErpStCustmastData.setCountryKey("IN");
				zifErpStCustmastData.setReccAcc("221011");
				zifErpStCustmastData.setCustStatGrp("1");
				zifErpStCustmastData.setDelivPlant("C000");
				zifErpStCustmastData.setRelCreate("X");
				zifErpStCustmastData.setPlanGrp("C000");
				
				zifTerpPartnerSaveDataRequest.setCustomerData(zifErpStCustmastData);
				ZifErpTtContmastData zifErpTtContmastData = new ZifErpTtContmastData();
				zifTerpPartnerSaveDataRequest.setContactData(zifErpTtContmastData);
				/* final ZifTerpPartnerSaveDataResponse response1 = crmServicesFacade.partnerSave(zifTerpPartnerSaveDataRequest); */

				ZifTerpPartnerSaveB2BDataRequest zifTerpPartnerSaveB2BDataRequest = new ZifTerpPartnerSaveB2BDataRequest();
				ZifErpTtContmastB2BData zifErpTtContmastB2BData = new ZifErpTtContmastB2BData();
				ZifErpStCustmastB2BData zifErpStCustmastB2BData = new ZifErpStCustmastB2BData();
				zifTerpPartnerSaveB2BDataRequest.setContactData(zifErpTtContmastB2BData);
				zifTerpPartnerSaveB2BDataRequest.setCustomerData(zifErpStCustmastB2BData);
				
				ZifTerpPartnerSaveB2BDataResponse response3 = crmServicesFacade.partnerSaveB2B(zifTerpPartnerSaveB2BDataRequest);
				out.println(response3.getStatus().getItem().get(0).getStatus());	
				out.println(response3.getStatus().getItem().get(0).getMessage());					
				out.println("\n-----------------------------------------");
		
		
		
		%>
	</body>
</html>

