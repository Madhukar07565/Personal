<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="orderEntryData" required="true"
	type="de.hybris.platform.commercefacades.order.data.OrderEntryData"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="flight"
	tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/flight"%>

<c:set var="ticketOrderEntries" value="${orderEntryData.entries[0].entries}"/>
<c:set var="groupId" value="${orderEntryData.entries[0].orderEntryInfoData.flightDetailInfoData.groupId}"/>
<c:set var="adultNumber" value="0"/>
<c:set var="childNumber" value="0"/>
	<c:forEach items="${ticketOrderEntries}" var="ticketOrderEntry" varStatus="status">
	<c:set var="orderTicket" value="${ticketOrderEntry.orderEntryInfoData.ticketDetailInfoData}"/>
		<c:if test="${orderTicket.passengerType != 'INFANT'}">
			<div class="clearfix  pB30">
				<div class="col_2 tC">
					<c:choose>
						<c:when test="${orderTicket.passengerType eq 'ADULT'}">
							<c:set var="adultNumber" value="${adultNumber+1}"/>
							<span class="adult_icon_large mB5"></span><br> 
							<span class="fS18">Adult ${adultNumber} </span><br>
						</c:when>
						<c:when test="${orderTicket.passengerType eq 'CHILD'}">
							<c:set var="childNumber" value="${childNumber+1}"/>
							<span class="child_icon_large mB5"></span><br> 
							<span class="fS18">Child ${childNumber}</span><br>
						</c:when>
					</c:choose>
				</div>
				<div class="fL posR">
					<span class="show_contr_right arrow_right_position"></span>
				</div>
				<flight:flightForm ticketOrderEntry="${ticketOrderEntry}" groupId="${groupId}" ticketInnerIndex="${status.index}" />
			</div>
		</c:if>
	</c:forEach>