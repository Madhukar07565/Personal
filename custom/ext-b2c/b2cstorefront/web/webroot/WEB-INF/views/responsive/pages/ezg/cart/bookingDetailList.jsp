<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="bookingDetails" tagdir="/WEB-INF/tags/responsive/ezg/order/detail"%>

<section class="col_8 mB30_sm pL0 col_sm_12 pR0" style="margin-top:8px;">
	<c:forEach items="${orderData.entries}" var="orderEntryData" varStatus="status">
		<c:choose>
			<c:when test="${orderEntryData.orderEntryType.code eq 'HOTEL'}">
				<bookingDetails:hotel hotelOrderEntryData="${orderEntryData}" orderEntryIndex="${status.index}"/>
			</c:when>
			
			<c:when test="${orderEntryData.orderEntryType.code eq 'FLIGHT_GROUP'}">
				<bookingDetails:flight flightGroupOrderEntryData="${orderEntryData}" orderEntryIndex="${status.index}"/>
			</c:when>
			
		</c:choose>
	
	</c:forEach>
</section>