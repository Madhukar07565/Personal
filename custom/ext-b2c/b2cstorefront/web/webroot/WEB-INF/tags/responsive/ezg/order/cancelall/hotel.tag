<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ attribute name="orderEntryIndex" required="true" rtexprvalue="true" %>
<%@ attribute name="hotelOrderEntryData" required="true" rtexprvalue="true" type="de.hybris.platform.commercefacades.order.data.OrderEntryData"%>

<c:set var="hotelOrderEntryInfoData" value="${hotelOrderEntryData.orderEntryInfoData}" />

<c:set var="hotelDetailInfoData" value="${hotelOrderEntryInfoData.hotelDetailInfoData}" />

<ul><li class="bkgLitBlu txtClrDrkGry mT30 fS21 fW600  pD10">Hotel</li></ul>
<ul>
	<li class="col_6 w43pcnt_sm pD10"><span class="fL">
		<img src="${ezgImagesPath}/common/hotel1.jpg" alt="Activity" class="valign fL mR10" style="height: 68px;"></span>
		<p class="fL mL10"><span class="fS18 fS15_sm"> ${hotelDetailInfoData.hotelName}, ${hotelDetailInfoData.hotelCityName}, ${hotelDetailInfoData.hotelCountryName} </span>
			<c:choose>
				<c:when test="${hotelDetailInfoData.hotelRate eq 'ONE' }">
					<c:set var="rate" value="1"/>
				</c:when>
				<c:when test="${hotelDetailInfoData.hotelRate eq 'TWO' }">
					<c:set var="rate" value="2"/>
				</c:when>
				<c:when test="${hotelDetailInfoData.hotelRate eq 'THREE' }">
					<c:set var="rate" value="3"/>
				</c:when>
				<c:when test="${hotelDetailInfoData.hotelRate eq 'FOUR' }">
					<c:set var="rate" value="4"/>
				</c:when>
				<c:when test="${hotelDetailInfoData.hotelRate eq 'FIVE' }">
					<c:set var="rate" value="5"/>
				</c:when>
				<c:otherwise>
					<c:set var="rate" value=""/>
				</c:otherwise>
			</c:choose>
			<c:forEach  begin="1" end="${rate}">
				<span class="fullRatingstar_icon"></span>
			</c:forEach>
			<c:forEach begin="${rate+1}" end="5">
				<span class="fullnoRatingstar_icon"></span>
			</c:forEach>
			<br>
			<span class="fS14 txtClrGry"> <fmt:formatDate value="${orderData.created}" type="DATE" />, ${hotelDetailInfoData.numberOfNight} nights | ${hotelDetailInfoData.numberOfRooms} Rooms | ${hotelDetailInfoData.numberOfAdult} Adults, ${hotelDetailInfoData.numberOfChild} Child</span><br>
			<span class="fS14"> Check in: <fmt:formatDate value="${hotelDetailInfoData.hotelCheckinDate}" type="DATE" />, Check out: <fmt:formatDate value="${hotelDetailInfoData.hotelCheckoutDate}" type="DATE" />  </span>
		</p>
	</li>
	<li class="col_3 col_2_sm pD10 tC">
		<span class="txtClrOrng">Request for cancellation</span><br>
		<span><a href="javascript: void(0);">Booking policy</a></span>
	</li>
	<li class="col_3 w32pcnt_sm pD10">
		<c:if test="${not empty hotelOrderEntryData.paymentSummaryInfoData && not empty hotelOrderEntryData.paymentSummaryInfoData.amountPaid}">
			<span class="txtClrDrkGry fS12_sm">Amount Paid <span class="fW600">${hotelOrderEntryData.paymentSummaryInfoData.amountPaid.formattedValue}</span></span><br/>
		</c:if>
		<span class="txtClrDrkGry fS12_sm">Cancellation charges
		<span class="rupee">Rs </span><span class="fW600">1,764 (hard code)</span><a href="javascript:void(0)" class=" fS18" ><span class="faq_sml_icon mL5"></span></a>
		</span><br/>
		<span class="txtClrDrkGry fS12_sm"> Refund amount  <span class="fW600 txtClrDrkGry">Rs 10,000 (hard code)</span></span>
	</li>
</ul>
<div class="clearfix"></div>
<hr/>
<table class="w100pcnt mT20">
	<tbody>
		<tr>
			<th class="tC bkgLitBlu pD10">Room Details</th>
			<th class="tC bkgLitBlu pD10">No of rooms</th>
			<th class="tC bkgLitBlu pD10">No of nights</th>
			<th class="tC bkgLitBlu pD10">Guests</th>
			<th class="tC bkgLitBlu pD10">Total <span class="rupee">Rs.</span></th>
			<th class="tC bkgLitBlu pD10">Refund <span class="rupee">Rs.</span></th>
		</tr>
		
		<c:forEach items="${hotelOrderEntryData.entries}" var="roomOrderEntryData">
			<c:set var="roomOrderEntryInfoData" value="${roomOrderEntryData.orderEntryInfoData}" />

			<c:set var="roomDetailInfoData" value="${roomOrderEntryInfoData.roomDetailInfoData}" />
			<tr>
				<td class="brdrN tC fS12_sm w27pcnt"><span class="dB fS16 fW500 fS12_sm">${roomDetailInfoData.roomType}</span><span> With Breakfast &amp; dinner (hard code)</span><br><span> Voucher Number: AB098712 (hard code)</span><br><span><a href="#">Pricing and Room Info</a></span></td>
				<td class="fS18 fW500 brdrN tC">1</td>
				<td class="brdrN tC"><span class="fS18 fW500">${roomDetailInfoData.numberOfNight}</span></td>
				<td class="brdrN tC fS12_sm w20pcnt"><span class="fW500">${roomDetailInfoData.numberOfAdult} Adults, ${roomDetailInfoData.numberOfChild} Child</span><br>
					<c:forEach items="${roomOrderEntryData.entries}" var="travellerOrderEntryData">
						<c:set var="travellerOrderEntryInfoData" value="${travellerOrderEntryData.orderEntryInfoData}" />

						<c:set var="travellerDetailInfoData" value="${travellerOrderEntryInfoData.travellerData}" />

						${travellerDetailInfoData.title}&nbsp${travellerDetailInfoData.firstName}&nbsp${travellerDetailInfoData.lastName}<br/>

						<c:forEach items="${travellerDetailInfoData.nonPrimaryTravellerList}" var="nonPrimaryTravellerInfoData">
							${nonPrimaryTravellerInfoData.title}&nbsp${nonPrimaryTravellerInfoData.firstName}&nbsp${nonPrimaryTravellerInfoData.lastName}<br/>
						</c:forEach>

					</c:forEach>
				</td>
				<td class="tC brdrN "><span class="fS18">${roomDetailInfoData.priceInfo.costPrice}</span></td>
				<td class="tC brdrN"><span class="fS18">7600 (hard code)</span></td>
			</tr>
		</c:forEach>
	</tbody>
</table>