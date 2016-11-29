<%@page
	import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="java.util.Date"%>
<%@page import="javax.xml.datatype.DatatypeFactory"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="javax.xml.datatype.XMLGregorianCalendar"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="de.hybris.platform.core.Registry"%>
<%@page
	import="com.cnk.travelogix.core.livesupporti.facade.WebHookFacade"%>
<%@page import="com.cnk.travelogix.core.livesupporti.client.dto.WebHook"%>
<html>
<body>
	<h1>WebHook Test</h1>
	Welcome to my extension.

	<%
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
		final WebHookFacade webHookFacade = (WebHookFacade) context.getBean("webHookFacade");

		/* List<WebHook> hooks = webHookFacade.getAllWebHooks(); */
		WebHook webHook = webHookFacade.getWebHookByID("123456");
		webHookFacade.deleteWebHook("123456"); 
	%>
</body>
</html>