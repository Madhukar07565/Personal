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
				final ZifTerpComplaintsDataRequest zifTerpComplaintsDataRequest = new ZifTerpComplaintsDataRequest();
				final ZifTerpComplaintsHeaderData zifTerpComplaintsHeaderData = new ZifTerpComplaintsHeaderData();
				zifTerpComplaintsHeaderData.setCategory("cccc");
				zifTerpComplaintsHeaderData.setCode("Code");
				zifTerpComplaintsHeaderData.setCodegruppe("Code G");
				zifTerpComplaintsHeaderData.setDescription("Desc");
				zifTerpComplaintsHeaderData.setKatalogart("Kata");
				zifTerpComplaintsHeaderData.setNotes("Notes");
				zifTerpComplaintsHeaderData.setProcessType("Process Type");
				zifTerpComplaintsHeaderData.setReferenceDocumentNo("Ref Doc No");
				zifTerpComplaintsHeaderData.setServiceOrg("Service");
				zifTerpComplaintsHeaderData.setServiceOrgResp("Service Org");
				zifTerpComplaintsHeaderData.setUniqid("Uid");

				zifTerpComplaintsDataRequest.setCompHeader(zifTerpComplaintsHeaderData);
				final ZttTerpComplaintsItemsData zttTerpComplaintsItemsData = new ZttTerpComplaintsItemsData();
				final ZifTerpComplaintsItemsData zifTerpComplaintsItemsData = new ZifTerpComplaintsItemsData();
				zifTerpComplaintsItemsData.setCategory("Cat");
				zifTerpComplaintsItemsData.setItemNumber("Item Number");
				zifTerpComplaintsItemsData.setMaterial("Mat");
				zttTerpComplaintsItemsData.getItem().add(zifTerpComplaintsItemsData);
				zifTerpComplaintsDataRequest.setCompItem(zttTerpComplaintsItemsData);

				final ZttTerpComplaintsPartnersData zttTerpComplaintsPartnersData = new ZttTerpComplaintsPartnersData();
				final ZifTerpComplaintsPartnersData zifTerpComplaintsPartnersData = new ZifTerpComplaintsPartnersData();
				zifTerpComplaintsPartnersData.setItmNumber("123456");
				zifTerpComplaintsPartnersData.setPartnerFunction("ppppppp");
				zifTerpComplaintsPartnersData.setPartnNumb("123456");
				zttTerpComplaintsPartnersData.getItem().add(zifTerpComplaintsPartnersData);
				zifTerpComplaintsDataRequest.setCompPartners(zttTerpComplaintsPartnersData);
				final ZifTerpComplaintsDataResponse response1 = crmServicesFacade.complaintsFeedback(zifTerpComplaintsDataRequest);
				
				out.println(response1.getStatus().getItem().get(0).getStatus());
				out.println(response1.getStatus().getItem().get(0).getMessage());
%>
	</body>
</html>

