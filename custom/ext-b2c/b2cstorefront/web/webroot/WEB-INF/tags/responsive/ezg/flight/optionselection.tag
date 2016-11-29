<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="flight" tagdir="/WEB-INF/tags/responsive/ezg/flight"%>

<%@ attribute name="theFlight" required="true" type="com.cnk.travelogix.common.facades.product.data.flight.FlightData" %>
<%@ attribute name="fareSummary" required="true" type="com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData" %>
<%@ attribute name="theIndex" required="false"  %>
<%@ attribute name="theTabIndex" required="false"  %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<span
	class="priceGrnContr clearfix flightDtlhit flightDtlhit w40pcnt h150">
		
			
              <mark class="mR5 fS12 w100pcnt"><span class="lineThrough"><span class="rupee">Rs. </span>${fareSummary.listPrice}</span><span class="mainPrice"><span class="rupee">Rs. </span>${fareSummary.webPrice}</span>
                Earn 20 points<flight:selection theTabIndex="${theTabIndex }" theIndex="${theIndex }"  theFlight="${theFlight }"/> 
                <span class="dB fL mL10"> <span class=" share_icon fL mR10"></span> <span class="empty_heart fL"></span> </span>  </mark>
		<%-- 
		<c:if test = "not empty ${theFlight.options}">
			<select class="smallDropdown mB10">
			
				<c:forEach items="${theFlight.options}" var="option">
					<option id='${option}'>${option}</option>
					
				</c:forEach>
			
			</select>
		
			<mark class="mR5 fS12 w100pcnt dN">
				<span class="lineThrough"><span class="rupee">Rs.
				</span>4,682</span><span class="mainPrice"><span class="rupee">Rs.
				</span>4,382</span> Earn 20 points<a href="javascript:void(0);"
					class="button button-primary dB mB10 addToCart fL"
					onClick="selectFlight(1,'arrival')">Select</a> <span
					class="dB fL mL10"> <span class=" share_icon fL mR10"></span>
					<span class="empty_heart fL"></span>
				</span>
			</mark>
	</c:if>
	--%>	
</span>