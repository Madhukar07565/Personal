<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ attribute name="orderEntryIndex" required="true" rtexprvalue="true" %>
<%@ attribute name="hotelOrderEntryData" required="true" rtexprvalue="true" type="de.hybris.platform.commercefacades.order.data.OrderEntryData"%>

<c:set var="hotelOrderEntryInfoData" value="${hotelOrderEntryData.orderEntryInfoData}" />

<c:set var="hotelDetailInfoData" value="${hotelOrderEntryInfoData.hotelDetailInfoData}" />

<div class="clearfix pT20 col_12 grey_border grey_bg mT15 ">
	<div class="fL  col_6 txtClrlitGryMid mB15 pL0">
		<span class="hotelGrn_xl fL mB150 mR20 mL10"></span>
		<span class="fW600">${hotelDetailInfoData.hotelName},</span>
		<span class="fs12">${hotelDetailInfoData.hotelCityName}| ${hotelDetailInfoData.numberOfRooms} Rooms | ${hotelDetailInfoData.numberOfAdult} Adults, ${hotelDetailInfoData.numberOfChild} Child</span>
		<span class="fW600 mL5"><fmt:formatDate value="${hotelDetailInfoData.hotelCheckinDate}" type="DATE" /></span><br>
		<span class="fS12">Booking Date: <fmt:formatDate value="${orderData.created}" type="DATE" /></span><br>
		
		<c:if test="${not empty hotelOrderEntryData.paymentSummaryInfoData}">
			<c:set var="amountPaid" value="${hotelOrderEntryData.paymentSummaryInfoData.amountPaid}" />
			<c:set var="pendingBalanceForFull" value="${hotelOrderEntryData.paymentSummaryInfoData.pendingBalanceForFull}" />
			<c:set var="pendingBalanceForPart" value="${hotelOrderEntryData.paymentSummaryInfoData.pendingBalanceForPart}" />
			<c:set var="payOnConfirmation" value="${hotelOrderEntryData.paymentSummaryInfoData.payOnConfirmation}" />
			<c:set var="payAtLocation" value="${hotelOrderEntryData.paymentSummaryInfoData.payAtLocation}" />
			<c:if test="${not empty pendingBalanceForFull || not empty pendingBalanceForPart || not empty payOnConfirmation || not empty payAtLocation}">
				<span class="txtClrOrng fW600">!</span><span class="txtClrGrn mL10">Pending Payment</span><br>
			</c:if>
			<c:if test="${not empty payAtLocation}">
				<span>Pay @ Hotel ${payAtLocation.formattedValue}</span><br>
			</c:if>
			<c:if test="${not empty amountPaid}">
				<span class="txtClrBlk">Amount paid <span class="fW600">${amountPaid.formattedValue}</span> </span>
			</c:if>
			<br>Via Credit Card 123XXXXXXXX09 (hard code)<br>
		</c:if>
		<span><a href="javascript:void(0);" class="mT20 fS12" onclick="popupwin('postreview', 'postreviewinner', 'fade')">Review</a></span>|
		<span><a href="javascript:void(0);" class="mT20 fS12">Feedback</a></span>
	</div>
	<div class=" col_6 txtClrlitGryMid pL0 pR0">
		<div class="clearfix fR mB15">
			<span class="fL tC mR10 hov1"><span class="print mL20"></span><br><span class="content fS12 mB0 cB">Download</span></span>
			<span class="fL mR10 hov1"><span class="download"></span><br/><span class="content fS12 mB0 cB" style="left:0px !important;">Print</span></span>
			<span class="fL tR mR10 hov1"><span class="message" style="margin-right: -8px;"></span><br><span class="content fS12 mB0 cB" style="margin-left:-10px; left:13px !important;">Email</span></span>
		</div>
		<div class="clearfix cB">
			<span class="fR"><a href="javascript:void(0);" class="viewDetails" buttonBlockId="hotelButtons${orderEntryIndex}" detailsBlockId="hotelDetails${orderEntryIndex}">+View Details</a></span>
		</div>
		<div class="clearfix cB fR dN mB20 mT20" id="hotelButtons${orderEntryIndex}">
			<span class="tertiaryBtn_sml"><a href="#" onclick="popupwin('bookpolicy19', 'bookpolicy19inner', 'fade')">Add</a></span>
			<span class="tertiaryBtn_sml"><a href="#" onclick="popupwin('bookpolicy16', 'bookpolicy16inner', 'fade')">Change</a></span>
			<span class="tertiaryBtn_sml"><a href="#" onclick="popupwin('bookpolicy14', 'bookpolicy14inner', 'fade')">Cancel</a></span>
		</div>
	</div>
</div>

<div id="hotelDetails${orderEntryIndex}" class="grey_border dN">
	<div class="clearfix  col_12 pD20">
		<div class="brdrDBtmLitGry clearfix">
			<div class="mT10 mB15 col_3 pL0 pR0">
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
				<span class="fL mR10"><img src="${ezgImagesPath}/common/ta_logo.jpg" alt="Trip Advisor"></span>
				<c:forEach  begin="1" end="${rate}">
					<span class="fullRatingstar_icon_circle fR mT5"></span>
				</c:forEach>
				<c:forEach begin="${rate+1}" end="5">
					<span class="fullnoRatingstar_icon_circle fR mT5"></span>
				</c:forEach>
				<br/>
				<span> <a href="javascript:void(0);">270 reviews (hard code)</a></span>
			</div>
			<div class="mT10 mB15 col_5 pL0 pR0">
				<span class="fS12">${hotelDetailInfoData.hotelAddress}</span><br/>
				<span> <a href="javascript:void(0);">View on Map</a></span>
			</div>
			<div class="mT10 mB15 col_2 pL0 ">
				<span class="fS12">Check In</span><br/>
				<span class="fS18 fW500"><fmt:formatDate value="${hotelDetailInfoData.hotelCheckinDate}" type="TIME" /></span><br/>
				<span class="fS12"><fmt:formatDate value="${hotelDetailInfoData.hotelCheckinDate}" type="DATE" /></span>
			</div>
			<div class="mT10 mB15 col_2  pR0">
				<span class="fS12">Check Out</span><br/>
				<span class="fS18 fW500"><fmt:formatDate value="${hotelDetailInfoData.hotelCheckoutDate}" type="TIME" /></span><br/>
				<span class="fS12"><fmt:formatDate value="${hotelDetailInfoData.hotelCheckoutDate}" type="DATE" /></span>
			</div>
		</div>
		<div class="clearfix"></div>
		<c:forEach items="${hotelOrderEntryData.entries}" var="roomOrderEntryData">
			<c:set var="roomOrderEntryInfoData" value="${roomOrderEntryData.orderEntryInfoData}" />

			<c:set var="roomDetailInfoData" value="${roomOrderEntryInfoData.roomDetailInfoData}" />
			<ul class="col_12 pL0 pR0 mT15 clearfix">
				<li class="col_2 pR0 pL0 fS12_sm">
					<span class="fL "><img src="${ezgImagesPath}/common/hotel_5.png" alt="Hotel"></span>
				</li>
				<li class="col_6  pR0 fS12_sm tL">
					<span class="w86pcnt txtClrlitGry">${roomDetailInfoData.roomType}</span><br>
					<span class="txtClrlitGry w86pcnt">With Breakfast &amp; dinner (hard code)</span><br>
					<a href="javascript:void(0);">Pricing and Room Info</a>
				</li>
				<li class="col_4 pL0 pR0 fS12_sm "><span class="txtClrOrng fR">${roomDetailInfoData.status}</span><br>
					<span class="fW500  fR">
						<c:if test="${not empty roomOrderEntryData.paymentSummaryInfoData}">
							<table>
								<c:set var="paymentSummaryInfoData" value="${roomOrderEntryData.paymentSummaryInfoData}" />
								<c:if test="${not empty paymentSummaryInfoData.amountPaid}">
									<tr>
										<td>Amount paid:</td>
										<td>${paymentSummaryInfoData.amountPaid.formattedValue}</td>
									</tr>
									<%-- Amount paid: ${paymentSummaryInfoData.amountPaid.formattedValue}<br/> --%>
								</c:if>
								<c:if test="${not empty paymentSummaryInfoData.pendingBalanceForFull}">
									<tr>
										<td>Pending balance payment:</td>
										<td>${paymentSummaryInfoData.pendingBalanceForFull.formattedValue}</td>
									</tr>
									<%-- Pending balance payment: ${paymentSummaryInfoData.pendingBalanceForFull.formattedValue}<br/> --%>
								</c:if>
								<c:if test="${not empty paymentSummaryInfoData.pendingBalanceForPart}">
									<tr>
										<td>Pending balance payment:</td>
										<td>${paymentSummaryInfoData.pendingBalanceForPart.formattedValue}</td>
									</tr>
									<%-- Pending balance payment: ${paymentSummaryInfoData.pendingBalanceForPart.formattedValue}<br/> --%>
								</c:if>
								<c:if test="${not empty paymentSummaryInfoData.payOnConfirmation}">
									<tr>
										<td>Pay on confirmation:</td>
										<td>${paymentSummaryInfoData.payOnConfirmation.formattedValue}</td>
									</tr>
									<%-- Pay on confirmation: ${paymentSummaryInfoData.payOnConfirmation.formattedValue}<br/> --%>
								</c:if>
								<c:if test="${not empty paymentSummaryInfoData.payAtLocation}">
									<tr>
										<td>Pay at location:</td>
										<td>${paymentSummaryInfoData.payAtLocation.formattedValue}</td>
										</tr>
									<%-- Pay at location: ${paymentSummaryInfoData.payAtLocation.formattedValue}<br/> --%>
								</c:if>
							</table>
						</c:if>
						
					</span>
				</li>
			</ul>
			<table class=" col_12 mT15">
				<tbody>
					<tr>
						<th class="bkgLitBlu txtClrlitGry pD10 mT10 mB10 tC">Voucher Number </th>
						<th class="bkgLitBlu txtClrlitGry pD10 mT10 mB10 tC">No of Rooms </th>
						<th class="bkgLitBlu txtClrlitGry pD10 mT10 mB10 tC">No of Nights </th>
						<th class="bkgLitBlu txtClrlitGry pD10 mT10 mB10 tC">Guests</th>
						<th class="bkgLitBlu txtClrlitGry pD10 mT10 mB10 tC">Status </th>
					</tr>
					<tr>
						<td class="bB tC brdrN">ABO98712 (hard code)</td>
						<td class="bB tC brdrN">1</td>
						<td class="bB tC brdrN">${roomDetailInfoData.numberOfNight}</td>
						<td class="bB tC brdrN">
							<span class="fS16 fW600" >${roomDetailInfoData.numberOfAdult} Adults, ${roomDetailInfoData.numberOfChild} Child</span><br/>
							<c:forEach items="${roomOrderEntryData.entries}" var="travellerOrderEntryData">
								<c:set var="travellerOrderEntryInfoData" value="${travellerOrderEntryData.orderEntryInfoData}" />

								<c:set var="travellerDetailInfoData" value="${travellerOrderEntryInfoData.travellerData}" />

								${travellerDetailInfoData.firstName}&nbsp${travellerDetailInfoData.lastName}<br/>

								<c:forEach items="${travellerDetailInfoData.nonPrimaryTravellerList}" var="nonPrimaryTravellerInfoData">
									${nonPrimaryTravellerInfoData.firstName}&nbsp${nonPrimaryTravellerInfoData.lastName}<br/>
								</c:forEach>

							</c:forEach>
						</td>
						<td class="bB tC brdrN">${roomDetailInfoData.status}</td>
					</tr>
				</tbody>
			</table>
			<hr class="mB15 brdrDLitGry"/>
		</c:forEach>
	</div>
</div>
