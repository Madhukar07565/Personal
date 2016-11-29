<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="theFlight" required="true" type="com.cnk.travelogix.common.facades.product.data.flight.FlightData" %>
<%@ attribute name="theTabIndex" required="true"%>
<samp class="go_AI" style="width: 20%">
            <span>${theFlight.airlineIATA.airlineName} 
            <br/>${theFlight.airlineIATA.accountingCode} ${theFlight.airlineIATA.airlinePrefix}</span>
        </samp>
        <dfn style="width: 60%">
        	<span class="wayNum" id="multiWayTop${ theTabIndex}">${ theTabIndex}</span> <br />
            <strong>
            
            <small>${theFlight.fromSection.city}</small>${theFlight.departureTime.hours}:${theFlight.departureTime.minutes}</strong>
            <ins></ins>
            
            <strong>
            <small>${theFlight.toSection.city}</small>${theFlight.arrivalTime.hours}:${theFlight.arrivalTime.minutes}</strong>
            ${theFlight.duration}  <br> 
        </dfn>
												
												
											
											