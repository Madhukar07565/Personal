<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ attribute name="orderEntryIndex" required="true" rtexprvalue="true" %>
<%@ attribute name="flightGroupOrderEntryData" required="true" rtexprvalue="true" type="de.hybris.platform.commercefacades.order.data.OrderEntryData"%>

<c:set var="flightGroupInfoData" value="${flightGroupOrderEntryData.orderEntryInfoData}" />
<c:set var="flightGroupDetailInfoData" value="${flightGroupInfoData.flightGroupDetailInfoData}" />

<div class="clearfix pT20 pB10 col_12 grey_border grey_bg mT15">
	<div class="fL  col_6 txtClrlitGryMid pL0">
		<span class="flight_icon fL mB112 mR10 mT0"></span>
		<span class="fW600">
			<c:forEach items="${flightGroupDetailInfoData.flightPathList}" var="flightPath">
				<c:choose>
					<c:when test="${flightPath eq '-'}" >
						&nbsp${flightPath}&nbsp
					</c:when>
					<c:when test="${flightPath eq ','}" >
						${flightPath}&nbsp
					</c:when>
					<c:otherwise>
						${flightPath}
					</c:otherwise>
				</c:choose>
			</c:forEach>
			| ${flightGroupDetailInfoData.numberOfAdult} Adults, ${flightGroupDetailInfoData.numberOfChild} Child <br>
			<fmt:formatDate value="${flightGroupDetailInfoData.departureTime}" type="DATE" /> - <fmt:formatDate value="${flightGroupDetailInfoData.arrivalTime}" type="DATE" />
		</span><br>
		<span class="fS12">Booking Date: <fmt:formatDate value="${orderData.created}" type="DATE" /></span><br>
		<c:if test="${not empty flightGroupOrderEntryData.paymentSummaryInfoData && not empty flightGroupOrderEntryData.paymentSummaryInfoData.amountPaid}">
			<span class="txtClrBlk">Amount paid <span class="fW600">${flightGroupOrderEntryData.paymentSummaryInfoData.amountPaid.formattedValue} </span></span>
		</c:if>
		<br>Via Credit Card 123XXXXXXXX09(hard code) <br>
		<a href="javascript:void(0);" class="mT20 fS12" onclick="popupwin('postfeedback', 'postfeedbackinner', 'fade')">Feedback</a>
	</div>
	<div class="col_6 txtClrlitGryMid pL0 pR0">
		<div class="clearfix fR mB15">
			<span class="fL tC mR10 hov1"><span class="print mL20"></span><br><span class="content fS12 mB0 cB">Download</span></span>
			<span class="fL mR10 hov1"><span class="download"></span><br/><span class="content fS12 mB0 cB" style="left:0px !important;">Print</span></span>
			<span class="fL tR mR10 hov1"><span class="message" style="margin-right: -8px;"></span><br><span class="content fS12 mB0 cB" style="margin-left:-10px; left:13px !important;">Email</span></span>
		</div>
		<div class="clearfix cB fR">
			<span class="fR"><a href="javascript:void(0);" class="viewDetails" buttonBlockId="flightButtons${orderEntryIndex}" detailsBlockId="flightDetails${orderEntryIndex}">+View Details</a></span>
		</div>
		<div class="clearfix cB fR dN mB20 mT20" id="flightButtons${orderEntryIndex}">
			<span class="tertiaryBtn_sml"><a href="javascript:void(0)" onclick="popupwin('bookpolicy5', 'bookpolicy5inner', 'fade')">Add</a></span>
			<span class="tertiaryBtn_sml"><a href="javascript:void(0)" onclick="popupwin('bookpolicy3', 'bookpolicy3inner', 'fade')">Change</a></span>
			<span class="tertiaryBtn_sml"><a href="javascript:void(0)" onclick="popupwin('bookpolicy1', 'bookpolicy1inner', 'fade')">Cancel</a></span>
		</div>
	</div>	
</div>
<div class="cB"></div>
<div id="flightDetails${orderEntryIndex}" class="grey_border col_12 pD20 dN">
	<c:forEach items="${flightGroupOrderEntryData.entries}" var="flightOrderEntryData">
		<c:set var="flightOrderEntryInfoData" value="${flightOrderEntryData.orderEntryInfoData}" />
		
		<c:set var="flightDetailInfoData" value="${flightOrderEntryInfoData.flightDetailInfoData}" />
		
		<c:set var="commonFlightInfoData" value="${flightDetailInfoData.commonFlightInfoData}" />
		
		<div class="clearfix cB mT10 mB15">
			<span class="fS16 fW600 dB mB5 clearfix">${commonFlightInfoData.fromCity}  -> ${commonFlightInfoData.toCity} | <fmt:formatDate value="${commonFlightInfoData.departureTime}" type="DATE" />
			<span class="fR clearfix"><span class="fS12"> Refundable </span>  |<a href="javascript:void(0)" class="fS12 txtClrLitBlu" onclick="popupwin('bookpolicy7', 'bookpolicy7inner', 'fade')">Booking Policy </a> | <a href="javascript:void(0);" class="fS12 txtClrLitBlu seatchange" onclick="popupwin('selectseat', 'selectseatinner', 'fade')">Select Seat</a></span></span>
		</div>
		
		<ul class="col_12 pL0 pR0 mL25 mT15 clearfix">
			<li class="col_2 pR0 pL0 fS12_sm">
				<span class="fL "><img src="${ezgImagesPath}/common/ai_sml_logo.jpg" alt="" class="mR10"></span><span class="fL fW500">${commonFlightInfoData.airlineIATAData.airlineName}<br>${commonFlightInfoData.airlineIATAData.accountingCode} ${commonFlightInfoData.airlineIATAData.airlinePrefix}</span>
			</li>
			<li class="col_3 pL0 pR0 fS12_sm tL">
				<span class="w86pcnt fW500">${commonFlightInfoData.fromCity} </span><span class="fW600 mL25 fS18"> <fmt:formatDate value="${commonFlightInfoData.departureTime}" type="TIME" /></span><br>
				<span class="txtClrMidGry">${commonFlightInfoData.fromAirport}<br> Terminal ${commonFlightInfoData.fromTerminal} <br> <fmt:formatDate value="${commonFlightInfoData.departureTime}" type="DATE" /> </span>
			</li>
			<li class="col_1 col_1_sm pL0 pR0">
				<c:set var="durationArray" value="${fn:split(commonFlightInfoData.duration, ' ')}" />
				<span class="txtClrlitGry fS12">${durationArray[0]}</span><br>
				<span class="oneway_icon"></span>
			</li>
			<li class="col_3 pL0 pR0 fS12_sm mR30">
				<span class="w86pcnt fW500">${commonFlightInfoData.toCity} </span><span class="fW600 mL25 fS18"><fmt:formatDate value="${commonFlightInfoData.arrivalTime}" type="TIME" /></span><br>
				<span class="txtClrlitGry">${commonFlightInfoData.toAirport}<br> Terminal ${commonFlightInfoData.toTerminal}<br><fmt:formatDate value="${commonFlightInfoData.arrivalTime}" type="DATE" /></span>
			</li>
			<li class="col_2 pL25 fS12_sm fR"><span class="txtClrOrng">Confirmed (hard code)</span><br><span class="rupee">Rs</span>${flightDetailInfoData.priceInfo.costPrice}</li>
		</ul>
		
		<p class="fS16 fW600  mB5 clearfix">Traveler Details</p>
		<table class="mT10 col_12">
			<tbody>
				<tr>
					<th class="bkgLitBlu txtClrlitGry pD12 mT10 mB10 tC">Name </th>
					<th class="bkgLitBlu txtClrlitGry pD12 mT10 mB10 tC pR0">PNR </th>
					<th class="bkgLitBlu txtClrlitGry pD12 mT10 mB10 tC pL0 pR0">Insurance Policy </th>
					<th class="bkgLitBlu txtClrlitGry pD12 mT10 mB10 tC w24pcnt">Additional Services</th>
					<th class="bkgLitBlu txtClrlitGry pD12 mT10 mB10 tC">Fare </th>
					<th class="bkgLitBlu txtClrlitGry pD12 mT10 mB10 tC">Status </th>
				</tr>
				
				<c:forEach items="${flightOrderEntryData.entries}" var="ticketOrderEntryData" varStatus="ticketStatus">
					<c:set var="ticketOrderEntryInfoData" value="${ticketOrderEntryData.orderEntryInfoData}" />
					<c:set var="ticketDetailInfoData" value="${ticketOrderEntryInfoData.ticketDetailInfoData}" />
					
					<c:set var="travellerOrderEntryData" value="${ticketOrderEntryData.entries}" />
					<c:forEach items="${ticketOrderEntryData.entries}" var="travellerOrderEntryData">
						<c:set var="travellerOrderEntryInfoData" value="${travellerOrderEntryData.orderEntryInfoData}" />
						<c:set var="travellerDetailInfoData" value="${travellerOrderEntryInfoData.travellerData}" />
						
						<tr>
							<td class="brdrBN valign_top pD5 w22pcnt">${travellerDetailInfoData.firstName} ${travellerDetailInfoData.lastName}</td>
							<td class="brdrBN valign_top">${ticketDetailInfoData.pnr}</td>
							<td class="brdrBN valign_top">STG 029 2300(hard code)</td>
							<td class="brdrBN valign_top tC"><span>Baggage 10 Kg(hard code), <br>Lounge Access(hard code)</span></td>
							<td class="brdrBN valign_top pL0 pR0"><span class="rupee">Rs</span>${ticketDetailInfoData.priceInfo.costPrice}</td>
							<td class="brdrBN valign_top">${ticketDetailInfoData.status}</td>
						</tr>
					</c:forEach>
					
					<c:if test="${ticketStatus.index eq 0}">
						<tr>
							<td colspan="3" class="brdrBN txtClrlitGry fS12 pD5"><span class="fW600">Special Request:</span> Seat preferred near the doors for Sr. citizen.</td>
						</tr>
					</c:if>
					
				</c:forEach>
			</tbody>
		</table>
	</c:forEach>
</div>