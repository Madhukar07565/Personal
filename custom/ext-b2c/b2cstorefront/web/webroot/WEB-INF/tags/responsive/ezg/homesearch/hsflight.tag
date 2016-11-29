<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="primary_navigation_containerpriNav1" class="container tabContent clearfix">
	<c:set var="ractiveFlightSearchContainer" value="divTopSearchFlightSearch" scope="request" />
	<c:set var="ractiveFlightSearchTemplate" value="templateTopSearchFlight" scope="request" />
	<c:set var="ractiveFlightSearchInstance" value="ractiveTopFlight" scope="request" />
	<cms:pageSlot position="NavigationFlightSearch" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
</div>

