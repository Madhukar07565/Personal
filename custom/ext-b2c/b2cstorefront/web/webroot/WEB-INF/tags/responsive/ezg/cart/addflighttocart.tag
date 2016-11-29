<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ attribute name="flights" required="true" type="java.util.List"%>
<%@ attribute name="numberOfAdult" required="false" type="java.lang.Integer"%>
<%@ attribute name="numberOfChild" required="false" type="java.lang.Integer"%>
<%@ attribute name="numberOfInfant" required="false" type="java.lang.Integer"%>
 
<form:form method="post" id="ezgAddFlightToCartForm" name="ezgAddFlightToCartForm" action="${contextpath }/b2cstorefront/ezginb2c/en/cart/book/flight" modelAttribute="addFlightToCartForm">

<input type="hidden" id="numberOfAdult" name="numberOfAdult" value="2"/>
<input type="hidden" id="numberOfChild" name="numberOfChild" value="2"/>
<input type="hidden" id="numberOfInfant" name="numberOfInfant" value="0"/>
<input type="hidden" id="booking" name="booking" value="true"/>

<c:forEach items="${flights}" var="flight" varStatus="status">
	<input type="hidden" id="flights[${status.index}].flightNumber" name="flights[${status.index}].flightNumber" value="${flight.flightNumber}"/>
	<input type="hidden" id="flights[${status.index}].cabinClass" name="flights[${status.index}].cabinClass" value="${flight.cabinClass}"/>
	<input type="hidden" id="flights[${status.index}].departureTime" name="flights[${status.index}].departureTime" value="${flight.departureTime}"/>
	<input type="hidden" id="flights[${status.index}].arrivalTime" name="flights[${status.index}].arrivalTime" value="${flight.arrivalTime}"/>
	<input type="hidden" id="flights[${status.index}].fromCity" name="flights[${status.index}].fromCity" value="${flight.fromSection.city}"/>
	<input type="hidden" id="flights[${status.index}].toCity" name="flights[${status.index}].toCity" value="${flight.toSection.city}"/>
	<input type="hidden" id="flights[${status.index}].fromTerminal" name="flights[${status.index}].fromTerminal" value="${flight.fromSection.terminal}"/>
	<input type="hidden" id="flights[${status.index}].toTerminal" name="flights[${status.index}].toTerminal" value="${flight.toSection.terminal}"/>
	<input type="hidden" id="flights[${status.index}].duration" name="flights[${status.index}].duration" value="${flight.duration}"/>
	<input type="hidden" id="flights[${status.index}].airlineIATA.airlineName" name="flights[${status.index}].airlineIATA.airlineName" value="${flight.airlineIATA.airlineName}"/>
	<input type="hidden" id="flights[${status.index}].airlineIATA.accountingCode" name="flights[${status.index}].airlineIATA.accountingCode" value="${flight.airlineIATA.accountingCode}"/>
	<input type="hidden" id="flights[${status.index}].airlineIATA.airlinePrefix" name="flights[${status.index}].airlineIATA.airlinePrefix" value="${flight.airlineIATA.airlinePrefix}"/>
	<%-- <input type="hidden" id="flights[${status.index}].priceInfoData.costPrice" name="flights[${status.index}].priceInfoData.costPrice" value="${flight.fareSummary['fly'].webPrice}"/> --%>
	<c:if test="${not empty flight.flightDetails}">
		<c:forEach items="${flight.flightDetails}" var="flightDetail" varStatus="stat">
			<input type="hidden" id="flights[${status.index}].flightDetails[${stat.index}].cabinClass" name="flights[${status.index}].flightDetails[${stat.index}].cabinClass" value="${flightDetail.cabinClass}"/>
			<input type="hidden" id="flights[${status.index}].flightDetails[${stat.index}].fromCity" name="flights[${status.index}].flightDetails[${stat.index}].fromCity" value="${flightDetail.fromSection.city}"/>
			<input type="hidden" id="flights[${status.index}].flightDetails[${stat.index}].toCity" name="flights[${status.index}].flightDetails[${stat.index}].toCity" value="${flightDetail.toSection.city}"/>
			<input type="hidden" id="flights[${status.index}].flightDetails[${stat.index}].fromTerminal" name="flights[${status.index}].flightDetails[${stat.index}].fromTerminal" value="${flightDetail.fromSection.terminal}"/>
			<input type="hidden" id="flights[${status.index}].flightDetails[${stat.index}].toTerminal" name="flights[${status.index}].flightDetails[${stat.index}].toTerminal" value="${flightDetail.toSection.terminal}"/>
			<input type="hidden" id="flights[${status.index}].flightDetails[${stat.index}].departureTime" name="flights[${status.index}].flightDetails[${stat.index}].departureTime" value="${flightDetail.departureTime}"/>
			<input type="hidden" id="flights[${status.index}].flightDetails[${stat.index}].arrivalTime" name="flights[${status.index}].flightDetails[${stat.index}].arrivalTime" value="${flightDetail.arrivalTime}"/>
			<input type="hidden" id="flights[${status.index}].flightDetails[${stat.index}].duration" name="flights[${status.index}].flightDetails[${stat.index}].duration" value="${flightDetail.duration}"/>
		</c:forEach>
	</c:if>
</c:forEach>


<c:if test="${empty showAddToCart ? true : showAddToCart}">
	<c:set var="buttonType">submit</c:set>
	<ycommerce:testId code="addToCartButton">
		<jsp:doBody/>
	</ycommerce:testId>
</c:if>
</form:form>