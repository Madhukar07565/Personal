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
			CCServicesFacade facade = (CCServicesFacade)Registry.getApplicationContext().getBean("ccServicesFacade");			
			MaintainMappingTableRequestData request1 = new MaintainMappingTableRequestData();
			request1.setOperation("INSERT_UPDATE");
			request1.setId("SMPTTest71");
			request1.setMappingTableClassId("SUPPLIER_COMMERCIAL_MP_CLASS_AIR");
			request1.setSubscriberAccountId("1");
			MappingTableRowData data = new MappingTableRowData();
			Map<String,String> columnnamevalue = new HashMap();
			columnnamevalue.put("SUPPLIER_MARKET", "ABCD1");
			columnnamevalue.put("SUPPLIER_MARKET","Value1");
			columnnamevalue.put("PRODUCT_CATEGORY","Value2");
			columnnamevalue.put("PRODUCT_CATEGORY_SUBTYPE","Value3");
			columnnamevalue.put("COMMERCIAL_HEAD","Value4");
			columnnamevalue.put("COMMERCIAL_TYPE","Value5");
			columnnamevalue.put("COMMERCIAL_DESCRIPTION","Value6");
			columnnamevalue.put("PROVISIONAL/FINAL","Value7");
			columnnamevalue.put("SETTLEMENT_TRANSACTIONWISE","Value8");
			columnnamevalue.put("COMMISSIONABLE/NON-COMMISIONABLE","Value9");
			columnnamevalue.put("TRANSACTIONAL/NON-TRANSACTIONAL","Value10");
			columnnamevalue.put("FIXED/SLAB","Value11");
			columnnamevalue.put("PERCENTAGE/AMOUNT_FIXED","Value12");
			columnnamevalue.put("PERCENTAGE_VALUE_FIXED","Value13");
			columnnamevalue.put("FARE/PRICE_COMPONENT_FIXED","Value14");
			columnnamevalue.put("CURRENCY_FIXED","Value15");
			columnnamevalue.put("AMOUNT_VALUE_FIXED","Value16");
			columnnamevalue.put("SEGMENTS_ACTIVE/PASSIVE/ACTIVE+PASSIVE/OTHER_GDS","Value17");
			columnnamevalue.put("CUMULATIVE","Value18");
			columnnamevalue.put("SLAB_TYPE","Value19");
			columnnamevalue.put("CURRENCY_SLAB_RANGE","Value20");
			columnnamevalue.put("FROM_VALUE","Value21");
			columnnamevalue.put("TO_VALUE","Value22");
			columnnamevalue.put("PERCENTAGE/AMOUNT_SLAB","Value23");
			columnnamevalue.put("PERCENTAGE_VALUE_SLAB","Value24");
			columnnamevalue.put("FARE/PRICE_COMPONENT_SLAB","Value25");
			columnnamevalue.put("CURRENCY_SLAB","Value26");
			columnnamevalue.put("AMOUNT_VALUE_SLAB","Value27");
			columnnamevalue.put("PRODUCT_NAME","Value28");
			columnnamevalue.put("CALCULATION_TYPE","Value29");
			columnnamevalue.put("NET_OFF_COMMERCIAL_HEAD","Value30");
			columnnamevalue.put("CLIENT_TYPE","Value31");
			columnnamevalue.put("CLIENT_GROUP","Value32");
			columnnamevalue.put("CLIENT_NAME","Value33");
			columnnamevalue.put("IATA_NO","Value34");
			data.setId("R1");
			data.setColumnNameValue(columnnamevalue);
			data.setStartDate("2016-11-18T13:47:30");
			data.setEndDate("2017-01-18T13:47:29");
			List<MappingTableRowData> l = new ArrayList();
			l.add(data);
			Map<String,List<MappingTableRowData>> map = new HashMap();
			map.put("SMPTTest7",l);
			request1.setServicesMap(map);
			MappingTableOperationResponseData response1 = facade.createMappingTableMaintain(request1);
			
			out.println(">>>>>>> "+response1.getStatus().value());
			out.println(">>>>>>> "+response1.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}  
	%>
	</body>
</html>

