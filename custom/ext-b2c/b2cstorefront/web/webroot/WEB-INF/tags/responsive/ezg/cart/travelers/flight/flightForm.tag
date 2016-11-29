<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="hotel" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/hotel"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="flight"
	tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/flight"%>
<%@ attribute name="ticketOrderEntry" required="true" type="de.hybris.platform.commercefacades.order.data.OrderEntryData"%>
<%@ attribute name="groupId" required="true" type="java.lang.String"%>
<%@ attribute name="ticketInnerIndex" required="true" type="java.lang.String"%>

<c:set var="orderTicketInfo" value="${ticketOrderEntry.orderEntryInfoData.ticketDetailInfoData}"/>
<form name="flightTravelerDetailsForm" data-index="${orderTicketInfo.ticketIndex}" >
	<input id ="orderEntryNumber" name="orderEntryNumber" type="hidden" value="${orderTicketInfo.ticketIndex}"/>
	<input id ="groupId" name="groupId" type="hidden" value="${groupId}"/>
	<input id ="ticketInnerIndex" name="ticketInnerIndex" type="hidden" value="${ticketInnerIndex}"/>
	<c:set var="flightTraveler" value="${ticketOrderEntry.entries[0].orderEntryInfoData.travellerData}"/>
    <flight:flightTravelerInfo orderTicketInfo="${orderTicketInfo}" flightTraveler="${flightTraveler}"/>
</form>