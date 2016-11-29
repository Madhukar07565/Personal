<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="fareSummary" required="true" type="com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData" %>
	
	<%-- com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData fareSummary = (com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData)((java.util.Map)fareMap).values().toArray()[0]; --%>
	
	<span class="lineThrough">
    <span class="rupee">Rs.</span>${fareSummary.listPrice}</span>
    <span class="mainPrice">
    <span class="rupee">Rs.</span>${fareSummary.webPrice}</span>Save 
    <span class="rupee">Rs.</span>${fareSummary.listPrice - fareSummary.webPrice}
   	<br/>Earn ${fareSummary.pointEarn} points
   	
