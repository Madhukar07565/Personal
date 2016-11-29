<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
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
<%@page import="com.cnk.travelogix.core.livesupporti.facade.AgentFacade" %>
<%@page import="com.cnk.travelogix.core.livesupporti.client.dto.Agents" %>
<%@page import="com.cnk.travelogix.core.livesupporti.client.dto.Agent" %>

<html>
	<body>
		<h1>Agent Test</h1>
		Welcome to my extension.
		
		<%						
				WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
				final AgentFacade agentFacade = (AgentFacade) context.getBean("agentFacade");
				
				Agent agent = new Agent();
		
				agent.setEmail("wifi@email.com");
				agent.setFirstName("f nmae");
				agent.setLastName("l name");
				agent.setGroups(null);
				agent.setJobTitle("no job");
				agent.setName("my name");
				agent.setPassword("password");
				agent.setCurrentpassword("password");
				
				/*List<Agent> response2  = agentFacade.getAllAgents(); */
				/*  Agent response3 = agentFacade.getAgentByID("12345678"); */
				/*  Agent response4 = agentFacade.createAgent(agent); */
				  Agent response5 =  agentFacade.updateAgent(agent, "120516");
				  /*agentFacade.deleteAgent("120270"); */
				
	
		%>
	</body>
</html>