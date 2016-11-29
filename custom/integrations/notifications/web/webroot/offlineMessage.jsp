<%@page import="com.cnk.travelogix.core.livesupporti.client.dto.OfflineMessage"%>
<%@page import="java.util.List"%>
<%@page import="com.cnk.travelogix.core.livesupporti.client.dto.OfflineMessages"%>
<%@page import="com.cnk.travelogix.core.livesupporti.facade.OfflineMessagefacade"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<html>
	<body>
		<h1>notifications</h1>
		Welcome to my extension.
		
		<%
		
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
		final OfflineMessagefacade offlineMessagefacade = (OfflineMessagefacade) context.getBean("offlineMessagefacade");
		//BannedVisitors response1 = bannedVisitorsFacade.getAllBannedVisitors("1");

		//out.print(response1.data.size());
		
		OfflineMessages offlineMessages = offlineMessagefacade.getAllOffLineMessages("1");
		out.print(" :::::::::: "+offlineMessages + ":::::::::::::::::::::" + offlineMessages.data); 
		
		out.print("</br>");
		out.print("</br>");
		out.print("</br>");
		
		OfflineMessage offlineMessage = offlineMessagefacade.getOffLineMessageById(120);
		out.print(" :::::::::: "+offlineMessage);
		
		%>
	</body>
</html>

