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
		
<%
			try {
				CCServicesFacade facade = (CCServicesFacade) Registry
						.getApplicationContext().getBean("ccServicesFacade");
				MaintainMappingTableRequestData request1 = new MaintainMappingTableRequestData();
				request1.setOperation("INSERT_UPDATE");
				request1.setId("Service_Tax1");
				request1.setMappingTableClassId("MP_CLASS_SERVICE_TAX");
				request1.setSubscriberAccountId("7");
				MappingTableRowData data = new MappingTableRowData();
				Map<String, String> columnnamevalue = new HashMap();

				columnnamevalue.put("COMPANY", "ABCD1");
				columnnamevalue.put("PRODUCT_DIVISION", "ABCD1");
				columnnamevalue.put("PRODUCT", "ABCD1");
				columnnamevalue.put("MARKET", "ABCD1");
				columnnamevalue.put("CUSTOMER_TYPE", "ABCD1");
				columnnamevalue.put("SERVICE_TAX_%", "2");
				columnnamevalue.put("SERVICE_TAX_ON", "ABCD1");
				columnnamevalue.put("EDUCATION_CESS_%", "2");
				columnnamevalue.put("HIGHER_EDUCATION_CESS_%", "2");
				columnnamevalue.put("SURCHARGE_%", "2");
				columnnamevalue.put("SWACHH_BHARAT_CESS_%", "2");
				columnnamevalue.put("KRISHI_KALYAN_CESS_%", "2");
				columnnamevalue.put("OTHER1_%", "2");
				columnnamevalue.put("OTHER2_%", "2");
				columnnamevalue.put("OTHER3_%", "2");

				data.setId("R1");
				data.setColumnNameValue(columnnamevalue);
				data.setStartDate("2016-11-18T13:47:30");
				data.setEndDate("2017-01-18T13:47:29");
				List<MappingTableRowData> l = new ArrayList();
				l.add(data);
				Map<String, List<MappingTableRowData>> map = new HashMap();
				map.put("Service_Tax1", l);
				request1.setServicesMap(map);
				MappingTableOperationResponseData response1 = facade
						.createMappingTableMaintain(request1);

				out.println(">>>>>>> " + response1.getStatus());
			} catch (Exception e) {
				e.printStackTrace();
			}
		%>
	</body>
</html>

