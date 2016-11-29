<%@page import="com.cnk.travelogix.sapintegrations.accdocpost.data.TableOfZifstVendor"%>
<%@page import="com.cnk.travelogix.sapintegrations.accdocpost.data.TableOfZifstCustomer"%>
<%@page import="com.cnk.travelogix.sapintegrations.accdocpost.data.TableOfZifstGlacc"%>
<%@page import="com.cnk.travelogix.sapintegrations.accdocpost.data.ZifstDochead"%>
<%@page import="com.cnk.travelogix.sapintegrations.accdocpost.data.ZIffmAccountDocumentResponse"%>
<%@page import="com.cnk.travelogix.sapintegrations.accdocpost.data.ZIffmAccountDocument"%>
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
		Welcome to Account Document.

				
				<%
				
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
		final SAPServicesFacade sapServicesFacade = (SAPServicesFacade) context.getBean("sapServicesFacade");	
		
		ZIffmAccountDocument zIffmAccountDocument = new ZIffmAccountDocument();
		ZifstDochead zifstDochead = new ZifstDochead();
		
		zIffmAccountDocument.setIDocheader(zifstDochead);
		TableOfZifstGlacc tableOfZifstGlacc = new TableOfZifstGlacc();
		zIffmAccountDocument.setItAccountgl(tableOfZifstGlacc);
		TableOfZifstCustomer tableOfZifstCustomer = new TableOfZifstCustomer();
		zIffmAccountDocument.setItCustomer(tableOfZifstCustomer);
		TableOfZifstVendor tableOfZifstVendor = new TableOfZifstVendor();
		zIffmAccountDocument.setItVendor(tableOfZifstVendor);
		final ZIffmAccountDocumentResponse response2 = sapServicesFacade.accDocPost(zIffmAccountDocument);
		//out.println(response2.getEStatus().getItem().get(0).getStatus());
		out.println(response2.getEStatus().getItem().get(0).getMessage());
		%>
	</body>
</html>

