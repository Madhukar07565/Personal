<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="primary_navigation_containerpriNav2" class="container tabContent clearfix" style="display: none;">
	<c:set var="ractiveHotelSearchContainer" value="divTopSearchHotelSearch" scope="request" />
	<c:set var="ractiveHotelSearchTemplate" value="templateTopSearchHotel" scope="request" />
	<c:set var="ractiveHotelSearchInstance" value="ractiveTopHotel" scope="request" /> 
	<cms:pageSlot position="NavigationHotelSearch" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
</div>
