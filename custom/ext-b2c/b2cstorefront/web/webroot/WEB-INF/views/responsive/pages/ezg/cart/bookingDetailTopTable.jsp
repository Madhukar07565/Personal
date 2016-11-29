<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<table class="w100pcnt mT20 mB10 grey_border col_sm_12">
	<thead>
		<tr>
			<th class="tL pD10">Booking Date:</th>
			<th class="tL pD10">Booking ID</th>
			<th class="tL pD10">Products Booked</th>
			<th class="tL pD10">Price</th>
			<th class="pD5 hov1 tC"><span class="print mL20"></span><br>
				<span class="content fS12 mB0 cB">Download</span>
			</th>
			<th class="tC hov1 pD5">
				<span class="download "></span><br />
				<span class="content fS12 mB0 cB" style="margin-left: -25px;">Print</span>
			</th>
			<th class="tC hov1 pD5">
				<span class="message" style="margin-bottom: 4px;"></span><br>
				<span class="content fS12 mB0 cB" style="margin-left: -10px;">Email</span>
			</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td class="tL  brdrBN">
				<span class="fW600 fS14"><fmt:formatDate value="${orderData.created}" type="BOTH" dateStyle="FULL"/></span><br />Booked by ${currentUserName}
			</td>
			<td class="tL  brdrBN ">
				<span class="mB10">${orderData.code}</span>
			</td>
			<td class="tL brdrBN">
				<span class="fW600 fS14">
					<c:forEach items="${orderData.entries}" var="orderEntryData">
						<c:set var="orderEntryInfoData" value="${orderEntryData.orderEntryInfoData}" />
						
						<c:choose>
							<c:when test="${orderEntryData.orderEntryType.code eq 'HOTEL'}">
								<c:set var="hotelDetailInfoData" value="${orderEntryInfoData.hotelDetailInfoData}" />
								<strong>Hotel </strong>- ${hotelDetailInfoData.hotelName}, ${hotelDetailInfoData.hotelCityName}
								<br/>
							</c:when>
			
							<c:when test="${orderEntryData.orderEntryType.code eq 'FLIGHT_GROUP'}">
								<c:set var="flightGroupDetailInfoData" value="${orderEntryInfoData.flightGroupDetailInfoData}" />
								<strong>Flight </strong>- 
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
								<br/>
							</c:when>
						</c:choose>
					</c:forEach>
				</span>
			</td>
			<td class="tL brdrBN">
				Total: ${orderData.totalPrice.formattedValue}<br/>
				<c:if test="${not empty orderData.paymentSummaryInfoData}">
					<c:set var="paymentSummaryInfoData" value="${orderData.paymentSummaryInfoData}" />
					<c:if test="${not empty paymentSummaryInfoData.amountPaid}">
						Amount paid: ${paymentSummaryInfoData.amountPaid.formattedValue}<br/>
					</c:if>
					<c:if test="${not empty paymentSummaryInfoData.pendingBalanceForFull || not empty paymentSummaryInfoData.pendingBalanceForFull}">
						<c:set var="pendingBalanceForFull" value="${paymentSummaryInfoData.pendingBalanceForFull.value}" />
						<c:set var="pendingBalanceForPart" value="${paymentSummaryInfoData.pendingBalanceForPart.value}" />
						Pending balance payment: <span class="rupee">Rs</span><fmt:formatNumber value="${pendingBalanceForFull + pendingBalanceForPart}" pattern="#,#00.00#"/><br/>
					</c:if>
					<c:if test="${not empty paymentSummaryInfoData.payOnConfirmation}">
						Pay on confirmation: ${paymentSummaryInfoData.payOnConfirmation.formattedValue}<br/>
					</c:if>
					<c:if test="${not empty paymentSummaryInfoData.payAtLocation}">
						Pay at location: ${paymentSummaryInfoData.payAtLocation.formattedValue}<br/>
					</c:if>
				</c:if>
			</td>
<%-- 			<td class="tL brdrBN">
				<c:forEach items="${entryDescriptions}" var="item">
					${item.key} : ${item.value}<br>
				</c:forEach>
			</td>
			<td class="tL brdrBN">
				Amount Paid: Rs. ${amountPaid}<br>Pending Payment: Rs. ${pendingPayment}
			</td> --%>
			<td class="tL fW600 brdrBN ">&nbsp;</td>
			<td class="tL fW600 brdrBN ">&nbsp;</td>
			<td class="tL fW600 brdrBN ">&nbsp;</td>
		</tr>
	</tbody>
	<tbody>
		<tr>
			<td class=" brdrBN " colspan="3"></td>
			<td class="brdrBN" colspan="2">
				<span class="">
					<a href="javascript:void(0);" onclick="popupwin('bookpolicy6','bookpolicy6inner', 'fade')">Balance Payment Schedule </a>
				</span>
				<span class="primaryBtn_sml">
					<a href="javascript:void(0);" class="saveDetail">Pay Now</a>
				</span>
			</td>
			<td class="brdrBN" colspan="2">
				<a href="javascript:void(0);" class="fR" onclick="popupwin('bookpolicy11', 'bookpolicy11inner', 'fade')">Cancel All</a>
			</td>
		</tr>
	</tbody>
</table>