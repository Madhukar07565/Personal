<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="flightOrderEntry" required="true" type="de.hybris.platform.commercefacades.order.data.OrderEntryData"%>
<%@ attribute name="index" required="true" type="java.lang.String"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="flight"
	tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/flight"%>

<c:set var="commonFlightInfo" value="${flightOrderEntry.orderEntryInfoData.flightDetailInfoData.commonFlightInfoData}"/>

<c:set var="adultNumber" value="0"/>
<c:set var="childNumber" value="0"/>
<c:set var="infantNumber" value="0"/>

<c:set var="ticketIndexArray"/>
<c:forEach var="orderTicketParentNode" items="${flightOrderEntry.entries}">
	<c:set var="orderTicket" value="${orderTicketParentNode.orderEntryInfoData.ticketDetailInfoData}"/>
	<c:if test="${not empty orderTicket.passengerType}">
		<c:set var="ticketIndexArray" value="${ticketIndexArray}${ orderTicket.ticketIndex}_"/>
		<c:choose>
    		<c:when test="${orderTicket.passengerType eq 'ADULT'}">	
    			<c:set var="adultNumber" value="${adultNumber+1 }"/>
    		</c:when>
    		<c:when test="${orderTicket.passengerType eq 'CHILD'}">	
    			<c:set var="childNumber" value="${childNumber+1 }"/>
    		</c:when>
    		<c:when test="${orderTicket.passengerType eq 'INFANT'}">	
    			<c:set var="infantNumber" value="${infantNumber+1 }"/>
    		</c:when>
    	</c:choose>
	</c:if>
</c:forEach>



<div class="clearfix shopCardHrdrSec">
   <div class="fL clearfix pD10"> 
   		<span class="fS18">${commonFlightInfo.fromCity}</span> 
   		<span class="flight_icon_sml  mT5 mL10 mR10"></span>
   		<span class=" fS18">${commonFlightInfo.toCity} </span>
   		<span class=" fS16 mT3 planningdetail"><fmt:formatDate type="date" pattern="dd MMM, E"  value="${commonFlightInfo.departureTime}"/>  </span>
   		<span class=" fS16 mT3 planningdetail"><c:if test="${adultNumber>0}">${adultNumber} Adult, </c:if> <c:if test="${childNumber>0}">${childNumber} child</c:if><c:if test="${infantNumber> 0}">, ${infantNumber} infant</c:if></span>
   		<a href="javascript:void(0)" id="moreInfo" class="mT10 pL10">
   		<span id="plusMinus">+</span>Details</a> 
	</div>
   <div class="fR">
   		<span class="fL pD10 mR10 mT5">
   		<span title="Edit" id="editFlight" class="edit_icon fL mR8"></span> 
   		<span title="delete" id="deleteFlight" class="recycle_icon_wishlist mT5 fL"></span> 
   		<input type="hidden" id="ticketIndexArray" value="${ticketIndexArray}"/>
		<input type="hidden" id="flightGroupId" value="${flightOrderEntry.orderEntryInfoData.flightDetailInfoData.groupId}"/>
  		<input type="hidden" id="flightSequence" value="${flightOrderEntry.orderEntryInfoData.flightDetailInfoData.sequence}"/> 
   		</span> <span class="fS30 srp_famount fR pD10">
   		<span class="rupee">Rs</span>${commonFlightInfo.priceInfo.costPrice}</span> 
   	</div>
</div>