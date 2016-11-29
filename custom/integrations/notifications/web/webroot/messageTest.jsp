<%@page import="com.cnk.travelogix.core.livesupporti.client.dto.ChatHistory"%>
<%@page import="java.util.List"%>
<%@page import="com.cnk.travelogix.core.livesupporti.client.dto.ChatHistories"%>
<%@page import="com.cnk.travelogix.core.livesupporti.facade.ChathistoryFacade"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<html>
	<body>
		<h1>notifications</h1>
		Welcome to my extension.
		
		<%
		
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
		final ChathistoryFacade chathistoryFacade = (ChathistoryFacade) context.getBean("chathistoryFacade");
		//BannedVisitors response1 = bannedVisitorsFacade.getAllBannedVisitors("1");

		//out.print(response1.data.size());
		
		/* ChatHistories chatHistories = chathistoryFacade.getAllChathistories("1");
		out.print(" :::::::::: "+chatHistories); */
		ChatHistories chatHistories = chathistoryFacade.getAllChathistories("1");
		out.print(" :::::::::: "+chatHistories + " :::::::::: " + chatHistories.data);
		
		out.print("</br>");
		out.print("</br>");
		out.print("</br>");
		
		/* List<String> chatHistoryList = chathistoryFacade.getAllChatHistoryAgentDate(1,"psaxena23@gmail.com","2010-03-09T19:18:57Z","2016-03-09T19:18:57Z",1);
		out.print(" :::::::::: "+chatHistoryList); */
		
		//ChatHistory chatHistory = chathistoryFacade.getAllChatHistoryAgentDate(1,"psaxena23@gmail.com","2010-03-09T19:18:57Z","2016-03-09T19:18:57Z",1);
		ChatHistories cHistories = chathistoryFacade.getAllChatHistoryAgentDate(1,"psaxena23@gmail.com","2010-03-09T19:18:57Z","2016-03-09T19:18:57Z",1);
		out.print(">>>>>>>>> " + cHistories + ">>>>>>>>> "  + cHistories.data);
		%>
	</body>
</html>

