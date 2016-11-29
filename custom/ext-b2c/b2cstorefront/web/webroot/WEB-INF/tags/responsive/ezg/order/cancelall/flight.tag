<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ attribute name="orderEntryIndex" required="false" rtexprvalue="true" %>
<%@ attribute name="flightGroupOrderEntryData" required="false" rtexprvalue="true" type="de.hybris.platform.commercefacades.order.data.OrderEntryData"%>

<c:set var="flightGroupInfoData" value="${flightGroupOrderEntryData.orderEntryInfoData}" />
<c:set var="flightGroupDetailInfoData" value="${flightGroupInfoData.flightGroupDetailInfoData}" />

<ul><li class="bkgLitBlu txtClrDrkGry mT30 fS21 fW600  pD10">Flight</li></ul>
<ul class=" mT20 brdrTGry clearfix">
	<li class="fS18 col_6 w43pcnt_sm pD10">
	<span class="fS15_sm">
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
		| ${flightGroupDetailInfoData.numberOfAdult} Adults, ${flightGroupDetailInfoData.numberOfChild} Child
	</span></li>
	<li class="col_3 col_3_sm pD10 tC">
		<span class="txtClrOrng">Request for cancellation</span><br/>
		<span><a href="javascript: void(0);">Booking policy</a></span>
	</li>
	<li class="col_3 w32pcnt_sm pD10">
		<c:if test="${not empty flightGroupOrderEntryData.paymentSummaryInfoData && not empty flightGroupOrderEntryData.paymentSummaryInfoData.amountPaid}">
			<span class="txtClrDrkGry fS12_sm">Amount Paid <span class="fW600">${flightGroupOrderEntryData.paymentSummaryInfoData.amountPaid.formattedValue}</span></span><br/>
		</c:if>
		<span class="txtClrDrkGry fS12_sm">Cancellation charges
		<span class="rupee">Rs </span><span class="fW600">1,764 (hard code)</span><a href="javascript:void(0)" class=" fS18" ><span class="faq_sml_icon mL5"></span></a></span><br/>
		<span class="txtClrDrkGry fS12_sm"> Refund amount  <span class="fW600 txtClrDrkGry">Rs 10,000 (hard code)</span></span>
	</li>
</ul>
<hr class="litGry"/>
<c:forEach items="${flightGroupOrderEntryData.entries}" var="flightOrderEntryData">
	<c:set var="flightOrderEntryInfoData" value="${flightOrderEntryData.orderEntryInfoData}" />
		
	<c:set var="flightDetailInfoData" value="${flightOrderEntryInfoData.flightDetailInfoData}" />
		
	<c:set var="commonFlightInfoData" value="${flightDetailInfoData.commonFlightInfoData}" />
	
	<ul class="ft_results">
		<li class="col_2 col_sm_2 mT30 txtClrlitGry"><img src="${ezgImagesPath}/common/indigo_logo_sqr.jpg" alt="indigo" /> ICE67CE (hard code)</li>
		<li class="col_3 col_sm_3 mT30 txtClrlitGry">
			<span>${commonFlightInfoData.fromCity} </span> <br/> <span class="fS21"><fmt:formatDate value="${commonFlightInfoData.departureTime}" type="TIME" /></span> <br/> <span class="fS12"><fmt:formatDate value="${commonFlightInfoData.departureTime}" type="DATE" /><br/>${commonFlightInfoData.fromAirport},Terminal ${commonFlightInfoData.fromTerminal}</span>
		</li>
		<li class="col_2 col_sm_2 mT30 txtClrlitGry fS12 "><ins> <span>${commonFlightInfoData.cabinClass}</span>${commonFlightInfoData.duration}</ins></li>
		<li class="col_2 col_sm_2 mT30 txtClrlitGry">
			<span>${commonFlightInfoData.toCity} </span> <br/> <span class="fS21"><fmt:formatDate value="${commonFlightInfoData.arrivalTime}" type="TIME" /></span> <br/> <span class="fS12"><fmt:formatDate value="${commonFlightInfoData.arrivalTime}" type="DATE" /><br/>${commonFlightInfoData.toAirport},Terminal ${commonFlightInfoData.toTerminal}</span>
		</li>
		<li class="col_3 col_sm_3 mT30 txtClrlitGry fS12 "><span class="fR">Refund Amount: Rs. 11,500 (hard code)</span></li>
	</ul>
	<div class="clearfix"></div>
	
	<ul class="brdrTGry">
		<li class="col_2 col_sm_2 mT30 txtClrlitGry"><img src="${ezgImagesPath}/common/umbrella.png" alt="indigo" /> ICE67CE</li>
		<li class="col_6 col_sm_6 mT30 txtClrlitGry">Domestic Travel Insurance added @ Rs 195/person</li>
	</ul>
	<div class="clearfix"></div>
	<hr class="litGry"/>
	<div class="clearfix"></div>
	<table class="w100pcnt mT20 mB15 ">
		<thead>
			<tr class="brdrBGry">
				<th class="tL pD5">Traveller details</th>
				<th class="tL pD5">Customer Name</th>
				<th class="tL pD5">PNR number</th>
				<th class="tL pD5">Insurance policy no</th>
				<th class="tL pD5">Additional services</th>
				<th class="tL pD5">Total Fare (Rs.)</th>
				<th class="tL pD5">Refund (Rs.)</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${flightOrderEntryData.entries}" var="ticketOrderEntryData" varStatus="ticketStatus">
				<c:set var="ticketOrderEntryInfoData" value="${ticketOrderEntryData.orderEntryInfoData}" />
				<c:set var="ticketDetailInfoData" value="${ticketOrderEntryInfoData.ticketDetailInfoData}" />
					
				<c:set var="travellerOrderEntryData" value="${ticketOrderEntryData.entries}" />
				<c:forEach items="${ticketOrderEntryData.entries}" var="travellerOrderEntryData">
					<c:set var="travellerOrderEntryInfoData" value="${travellerOrderEntryData.orderEntryInfoData}" />
					<c:set var="travellerDetailInfoData" value="${travellerOrderEntryInfoData.travellerData}" />
					<tr class="brdrBGry">
						<td class="brdrBN"><img src="${ezgImagesPath}/common/man.png" alt="man" /></td>
						<td class="brdrBN">${travellerDetailInfoData.titleName} ${travellerDetailInfoData.firstName} ${travellerDetailInfoData.lastName}</td>
						<td class="brdrBN">${ticketDetailInfoData.pnr}</td>
						<td class="brdrBN">STG 029 2300 (hard code) ${ticketStatus.index}</td>
						<td class="brdrBN">Baggage 10kg Lounge access (hard code) ${ticketStatus.index}</td>
						<td class="brdrBN">11,000 (hard code) ${ticketStatus.index}</td>
						<td class="brdrBN">1,000 (hard code) ${ticketStatus.index}<a href="javascript:void(0)" class=" fS18"><span class="faq_sml_icon mL5"></span></a></td>
					</tr>
				</c:forEach>
			</c:forEach>
		</tbody>
	</table>
</c:forEach>
