<%@ tag language="java" pageEncoding="UTF-8"%>

<%@ attribute name="depatureFareSummary" required="true" type="com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData" %>
<%@ attribute name="returnFareSummary" required="true" type="com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData" %>

	<span class="lineThrough"><span class="rupee">Rs.
	</span>${returnFareSummary.listPrice + depatureFareSummary.listPrice}</span><span class="mainPrice"><span class="rupee">Rs.
	</span>${returnFareSummary.webPrice + depatureFareSummary.webPrice}</span>Save <span class="rupee">Rs. </span>${returnFareSummary.listPrice + depatureFareSummary.listPrice - returnFareSummary.webPrice - depatureFareSummary.webPrice}<br>
	 Earn ${returnFareSummary.pointEarn + depatureFareSummary.pointEarn} points