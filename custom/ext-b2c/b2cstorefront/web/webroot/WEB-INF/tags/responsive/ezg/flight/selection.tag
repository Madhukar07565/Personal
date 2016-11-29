<%@ tag language="java" pageEncoding="UTF-8"%>

<%@ attribute name="theFlight" required="true" type="com.cnk.travelogix.common.facades.product.data.flight.FlightData" %>
<%@ attribute name="theIndex" required="false"  %>
<%@ attribute name="theTabIndex" required="false"  %>

<a href="javascript:void(0);"
					class="button button-primary fL mB10"
					 onclick="ractiveFlight.resultList.selectFlight(${theTabIndex},${theIndex},'${theFlight.id}','${theFlight.fromSection.city }',
					 '${theFlight.toSection.city }','${theFlight.departureTime.hours }'+':00','${theFlight.arrivalTime.hours }'+':00',7,8,9)">Select</a>