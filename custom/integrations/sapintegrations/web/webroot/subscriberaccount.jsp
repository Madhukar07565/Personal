<%@page import="com.cnk.travelogix.sapintegrations.subscribe.account.data.TaxInfo"%>
<%@page import="com.cnk.travelogix.sapintegrations.subscribe.account.data.ExternalAccountOperationResponseData"%>
<%@page import="com.cnk.travelogix.sapintegrations.subscribe.account.data.ExternalAccount"%>
<%@page import="com.cnk.travelogix.sapintegrations.subscribe.account.data.ExternalAccountMaintainData"%>
<%@page import="com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountOperationResponseData"%>

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
<html>
<body>
	<h1>Subscriber Account</h1>
	Welcome to my extension.


	<%
	try {
		CCServicesFacade facade = (CCServicesFacade)Registry.getApplicationContext().getBean("ccServicesFacade");
		String id ="101101101101101101101101101101101101101101101101101101101101101101101101101101101101101101101";
		SubscriberAccountMaintainData request1 = new SubscriberAccountMaintainData();
		SubscriberAccount subscriberAccount = new SubscriberAccount();
		subscriberAccount.setDescription("Description.");
		subscriberAccount.setId(id);
		subscriberAccount.setNoTax("");
		subscriberAccount.setSubscriberId(id);
		TaxInfo taxInfo = new TaxInfo();
		//taxInfo.set
		subscriberAccount.setTax(taxInfo);
		request1.setSubscriberAccount(subscriberAccount);
		SubscriberAccountOperationResponseData response1 = facade.subscribeAccMaintain(request1);
		out.println("Suscriber Account Created "+response1.getStatus());
		ExternalAccountMaintainData request2 = new ExternalAccountMaintainData();
		ExternalAccount externalAccount = new ExternalAccount();
		externalAccount.setCurrencyCode("USD");
		externalAccount.setDescription("External Account Description");
		externalAccount.setId(id);
		externalAccount.setSubscriberAccountId(id);
		request2.setExternalAccount(externalAccount);
		ExternalAccountOperationResponseData response2 = facade.externalAccMaintain(request2);
		out.println("External Account Created "+response2.getStatus());
	}catch(Exception e) {
		e.printStackTrace();
	}
		
		
	%>
</body>
</html>

