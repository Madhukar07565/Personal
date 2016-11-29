<%@page import="com.cnk.travelogix.core.livesupporti.client.dto.BannedVisitor"%>
<%@page import="java.util.List"%>
<%@page import="com.cnk.travelogix.core.livesupporti.client.dto.BannedVisitors"%>
<%@page import="com.cnk.travelogix.core.livesupporti.facade.BannedVisitorsFacade"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<html>
	<body>
		<h1>notifications</h1>
		Welcome to my extension.
		
		<%
		
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
		final BannedVisitorsFacade bannedVisitorsFacade = (BannedVisitorsFacade) context.getBean("bannedVisitorsFacade");
		//BannedVisitors response1 = bannedVisitorsFacade.getAllBannedVisitors("1");

		//out.print(response1.data.size());
		
		List<String> list = bannedVisitorsFacade.getBannedIPAddresses();
		out.print(" :::::::::: "+list.size());
		
		BannedVisitor bannedVisitor = bannedVisitorsFacade.getBannedVisitorById(10963);
		out.print(" :::::::::: "+bannedVisitor);
		
		%>
	</body>
</html>

