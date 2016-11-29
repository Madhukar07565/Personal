<%@page import="com.cnk.travelogix.contract.provisioning.data.ChargingContractItemRevisionAccountAssignment"%>
<%@page import="com.cnk.travelogix.contract.provisioning.data.ChargingContractItemUserTechnicalIdentifier"%>
<%@page import="javax.xml.datatype.DatatypeFactory"%>
<%@page import="com.cnk.travelogix.contract.provisioning.data.ChargingContractItemRevision"%>
<%@page import="com.cnk.travelogix.contract.provisioning.data.ChargingContractRevisionData"%>
<%@page import="com.cnk.travelogix.contract.provisioning.data.MaintainChargingContractRequestData"%>
<%@page import="de.hybris.platform.core.Registry"%>
<%@page import="com.cnk.travelogix.sapintegrations.facade.CCServicesFacade"%>
<%@page import="com.cnk.travelogix.contract.provisioning.data.ContractOperationResponseData" %>
<html>
	<body>
		<h1>Test Contract Provisioning</h1>
		Welcome to my extension.
		<%
		try {
		CCServicesFacade facade = (CCServicesFacade)Registry.getApplicationContext().getBean("ccServicesFacade");
		MaintainChargingContractRequestData request1 = new MaintainChargingContractRequestData();
		ChargingContractRevisionData revisionData = new ChargingContractRevisionData();
		revisionData.setId("ProviderContract7");
		revisionData.setSubscriberAccountId("7");
		ChargingContractItemRevision itemRevision = new ChargingContractItemRevision();
		itemRevision.setChargePlanClassId("Charge_Plan_Test1");
		//itemRevision.setExternalId("Test");
		itemRevision.setId("CI_C2");
		itemRevision.setEnd(DatatypeFactory.newInstance().newXMLGregorianCalendar("2016-08-19T06:14:24"));
		ChargingContractItemUserTechnicalIdentifier user = new ChargingContractItemUserTechnicalIdentifier();
		user.setName("SUPPLIER_ID");
		user.setUserServiceId("7");
		itemRevision.getUserTechnicalIdentifier().add(user);
		ChargingContractItemRevisionAccountAssignment accA = new ChargingContractItemRevisionAccountAssignment();
		accA.setAccountId("7");
		accA.setName("POSTPAID");
		itemRevision.getAccountAssignment().add(accA);
		revisionData.getChargingContractItemRevision().add(itemRevision);
		request1.setChargingContractRevision(revisionData);
		request1.setDate(DatatypeFactory.newInstance().newXMLGregorianCalendar("2016-08-19T06:14:24"));
		ContractOperationResponseData response2 = facade.contractProvisioning(request1);
		out.println(response2.getStatus().value());
		out.println(response2.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}
		%>
	</body>
</html>

