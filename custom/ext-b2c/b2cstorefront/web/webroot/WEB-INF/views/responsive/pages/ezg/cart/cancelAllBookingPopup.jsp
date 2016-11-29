<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ taglib prefix="cancelAll" tagdir="/WEB-INF/tags/responsive/ezg/order/cancelall"%>

<div class="white_content posF popupplay" id="bookpolicy11" style="top:0;padding-top:20px;padding-bottom:20px;height:100%">
	<div class="white_content_inner w90pcnt clearfix" id="bookpolicy11inner">
		<div class="closeBtn_popup fR" onclick="popupclose('bookpolicy11', 'fade')"></div>
		<p class="fW500 fS21 clearfix">Review & confirm cancellation request</p><br/>
		<hr class="litGry"/>
		<p class="fS12">Transaction ID: 2358058 (hard code)</p>
		<p class="fS12">Booking ID: ${orderData.code}</p>
		<p class="fS12">Date of booking: <fmt:formatDate value="${orderData.created}" type="DATE" pattern="MM/DD/YYYY"/></p>
		
		<c:forEach items="${orderData.entries}" var="orderEntryData" varStatus="status">
			<c:choose>
				<c:when test="${orderEntryData.orderEntryType.code eq 'HOTEL'}">
					<cancelAll:hotel hotelOrderEntryData="${orderEntryData}" orderEntryIndex="${status.index}" />
				</c:when>
			
				<c:when test="${orderEntryData.orderEntryType.code eq 'FLIGHT_GROUP'}">
					<cancelAll:flight flightGroupOrderEntryData="${orderEntryData}" orderEntryIndex="${status.index}" />
				</c:when>
			</c:choose>
		</c:forEach>
		
		<ul><li class="bkgLitBlu txtClrDrkGry mT30 fS21 pD10">Confirm Cancellation</li></ul>
		<p class="tR pD10 lH20">
			<c:if test="${not empty orderData.paymentSummaryInfoData && not empty orderData.paymentSummaryInfoData.amountPaid}">
				Amount Paid:   <span class="fW600 fS18">${orderData.paymentSummaryInfoData.amountPaid.formattedValue}</span><br>
			</c:if>
			Cancellation charges:<span class="fW600 fS18"> Rs 6,000 (hard code)</span><br>
			<span class="darkgrey_bg pD5"><span class="fS12 txtClrRed">You will receive the refund in 2 working days.</span>Refund:<span class="fW600 fS21">Rs 13,350 (hard code)</span></span>
		</p>
		<p class="fR primaryBtn mR20 cB"><a href="javascript:void(0);" id="confirmCancellation" bookingId="${orderData.code}">Confirm cancellation</a></p>
	</div>
</div>