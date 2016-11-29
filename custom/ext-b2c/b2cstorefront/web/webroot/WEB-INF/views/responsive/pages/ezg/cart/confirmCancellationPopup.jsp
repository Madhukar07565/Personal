<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="white_content popupplay posF" id="cancellation" style="top: 0px; padding-top: 10%; padding-bottom: 20px; height: 100%">
	<div class="white_content_inner w80pcnt clearfix" id="cancellationinner">
		<div id="closeCancellationConfirm" class="closeBtn_popup fR"></div>
		<div class="col_12">
			<div class="col_6 brdrRlitGry">
				<h3>Cancellation confirmed</h3>
				<p class="mT20 mB20 txtClrlitGry">Your cancellation request is accepted. You will get the refund within 7 working days.</p>
			</div>
			<div class="col_6">
				<p class="mT20">
					<c:forEach items="${orderData.entries}" var="orderEntryData">
						<c:set var="orderEntryInfoData" value="${orderEntryData.orderEntryInfoData}" />
						
						<c:choose>
							<c:when test="${orderEntryData.orderEntryType.code eq 'HOTEL'}">
								<c:set var="hotelDetailInfoData" value="${orderEntryInfoData.hotelDetailInfoData}" />
								<strong>Hotel </strong>- ${hotelDetailInfoData.hotelName}, ${hotelDetailInfoData.hotelCityName}, ${hotelDetailInfoData.hotelCountryName}| <fmt:formatDate value="${orderData.created}" type="DATE" /> | ${hotelDetailInfoData.numberOfAdult} Adults, ${hotelDetailInfoData.numberOfChild} Child
								<br/>
							</c:when>
			
							<c:when test="${orderEntryData.orderEntryType.code eq 'FLIGHT_GROUP'}">
								<c:set var="flightGroupDetailInfoData" value="${orderEntryInfoData.flightGroupDetailInfoData}" />
								<strong>Flight </strong>- London – Paris –Amsterdam| 10 Sep 2014 | 2 Adults, 1 child (hard code)
								<br/>
							</c:when>
						</c:choose>
					</c:forEach>
					<strong>Booking cancellation request ID</strong> <span id="cancellationRequestId"></span>
				</p>
			</div>
		</div>
		<hr class="litGry mT10">
		<div class="clearfix"></div>
		<p class="pD10 brdrBGry tC">You can now   <span class="location_icon"></span>TRACK and/or  <span class="fS21 fW500">X </span> CANCEL your request from <a href="javascript: void(0);"><span class="bkgDrkGrn txtClrWht pD5">Bookings</span> </a></p>
		<div class="fR mT25">
			<span class="tertiaryBtn_sml"><a href="${fullContextPath}">Go to Home page</a></span>
			<span class="tertiaryBtn_sml"><a href="${fullContextPath}/my-account/bookList">Back to Bookings</a></span>
		</div>
	</div>
</div>