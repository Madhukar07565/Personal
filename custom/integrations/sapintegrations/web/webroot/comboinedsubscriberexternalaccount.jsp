<%@page import="com.cnk.travelogix.sapintegrations.subscribe.account.data.TaxInfo"%>
<%@page
	import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="java.util.Date"%>
<%@page import="javax.xml.datatype.DatatypeFactory"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="javax.xml.datatype.XMLGregorianCalendar"%>
<%@page
	import="com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.MappingTableRowOperationResponseData"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page
	import="com.cnk.travelogix.sapintegrations.facade.CCServicesFacade"%>
<%@page
	import="com.cnk.travelogix.sapintegrations.facade.SAPServicesFacade"%>
<%@page import="de.hybris.platform.core.Registry"%>
<%@page import="com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountMaintainData" %>
<%@page import="com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccount" %>
<%@page import="com.cnk.travelogix.sapintegrations.subscribe.account.data.TaxInfo" %>
<%@page import="com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountOperationResponseData" %>
<html>
<body>
	<h1>Subscriber Account</h1>
	Welcome to my extension.


	<%
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
		final CCServicesFacade ccServicesFacade = (CCServicesFacade) context.getBean("ccServicesFacade");
		
		SubscriberAccountMaintainData subscriberAccountMaintainData = new SubscriberAccountMaintainData();
		SubscriberAccount subscriberAccount = new SubscriberAccount();
		subscriberAccount.setCurrencyCode("USD");
		subscriberAccount.setDescription("Desc");
		subscriberAccount.setId("12345");
		subscriberAccount.setSubscriberId("12345");	
		TaxInfo tax = new TaxInfo();
		subscriberAccount.setTax(tax);
		subscriberAccount.setNoTax("");
		subscriberAccountMaintainData.setSubscriberAccount(subscriberAccount);
		SubscriberAccountOperationResponseData response2= ccServicesFacade.subscribeAccMaintain(subscriberAccountMaintainData);
		
		out.println(response2.getStatus().value());
		out.println(response2.getMessage());
	%>
</body>
</html>

