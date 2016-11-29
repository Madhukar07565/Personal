<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="grpEntry" required="true" type="de.hybris.platform.commercefacades.order.data.OrderEntryData"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/cart" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="hotel" value="${grpEntry.orderEntryInfoData.hotelDetailInfoData }"></c:set>
<c:set var="hotelMaster" value="${grpEntry.product }"></c:set>
<c:set var="groupId" value="${grpEntry.orderEntryInfoData.groupId }"></c:set>
<c:set var="price" value="${hotel.priceInfo }"></c:set>
<%-- <c:set var="paymentPlan" value="${grpEntry.paymentPlan }"></c:set> --%>
<c:set var="rooms" value="${grpEntry.entries }"></c:set>

<!--hotel starts-->
	<div class="mB10 bkgLitBlu clearfix" > <span class="fS18 fL pL10 pT5">Hotels</span></div>
    
     <p class="mT10 clearfix brdr">
		<span class="fL w100pcnt">
			<img src="${ezgImagesPath}/hotel3_thumb.jpg" alt="Flight" class="valign fL mR10">
			<span class="fL fS16">
				<span class="fS18 fW500 dB mB5">${hotel.hotelName }, ${hotel.hotelAddress }
				
				
				<c:choose>
					<c:when test="${hotel.hotelRate eq 'ONE' }">
						<c:set var="rate" value="1"/>
					</c:when>
					<c:when test="${hotel.hotelRate eq 'TWO' }">
						<c:set var="rate" value="2"/>
					</c:when>
					<c:when test="${hotel.hotelRate eq 'THREE' }">
						<c:set var="rate" value="3"/>
					</c:when>
					<c:when test="${hotel.hotelRate eq 'FOUR' }">
						<c:set var="rate" value="4"/>
					</c:when>
					<c:when test="${hotel.hotelRate eq 'FIVE' }">
						<c:set var="rate" value="5"/>
					</c:when>
					<c:otherwise>
						<c:set var="rate" value=""/>
					</c:otherwise>
				</c:choose>
				<c:forEach  begin="1" end="${rate }">
					<span class="fullRatingstar_icon mB5"></span>
				</c:forEach>
						
				</span>
				<span><fmt:formatDate value="${ hotel.hotelCheckinDate}" type="date" pattern="dd MMM. E." dateStyle="medium"/>, ${hotel.reservationDay } Nights | ${hotel.numberOfRooms } Rooms | ${hotel.numberOfAdult } Adults ${hotel.numberOfChild }, Child</span><br>
				<span class="fS12">Check in: ${ hotel.hotelCheckinDate} (12:00), Check out: ${ hotel.hotelCheckoutDate} (10:00)</span>
			</span>
			<span class="fR tR">
				<span class="fS21"><span class="rupee">Rs</span> ${price.costPrice }</span>  <br>
				<a href="javascript:void(0)" class="fS12" >Booking policy</a></span>
		</span>
	</p>
	<c:forEach var="roomEntry" items="${rooms }">
	<c:set var="room" value="${roomEntry.orderEntryInfoData.roomDetailInfoData }"></c:set>
	<c:set var="roomPrice" value="${roomEntry.orderEntryInfoData.roomDetailInfoData.priceInfo}"></c:set>
	
	<table class="w100pcnt mT20">
      <tr class="brdrBLitGry">
        <th class="tL pB10" style="padding:5px;">Room Details</th>
        <th class="tL pB10">Supplier reference no.</th>
        <th class="tL pB10">Voucher no.</th>
        <th class="tL pB10">No. of rooms</th>
        <th class="tL pB10">No. of nights</th>
        <th class="tL pB10">Guests</th>
        <th class="tL pB10">Price </th>
		<th class="tL pB10">Status </th>
      </tr>
      <tr class="brdrBLitGry">
        <td class=" valign_top brdrN tL pL0"><span class="dB fS16 fW500">Standard double room</span> With Breakfast &amp; dinner</td>
        <td class=" valign_top  brdrN tL pL0">STG 029 2300 </td>
        <td class=" valign_top  brdrN tL pL0">ABCD021 </td>
        <td class="brdrN valign_top tL fS18 pL0 fW500">1</td>
        <td class="brdrN valign_top tL pL0"><span class="fS18 fW500">${room.numberOfNight }</span></td>
        <td class="brdrN valign_top tL pL0"><span class="fW500">${room.numberOfAdult } Adults, ${room.numberOfChild } Child</span>
        
        <c:set var="travellersEntry" value="${roomEntry.entries }"></c:set>
        <c:forEach var="travellerEntry" items="${travellersEntry }">
        	<c:set var="traveller" value="${travellerEntry.orderEntryInfoData }"></c:set>
        	 <br>${traveller.travellerData.title }&nbsp; ${traveller.travellerData.firstName }&nbsp; ${traveller.travellerData.lastName }
        	 <c:if test="${not empty traveller.travellerData.nonPrimaryTravellerList }">
	        	 <c:forEach var="npTravller" items="${traveller.travellerData.nonPrimaryTravellerList }">
	        	 	<br>${npTravller.title }&nbsp; ${npTravller.firstName }&nbsp; ${npTravller.lastName }
	        	 </c:forEach>
        	 </c:if>
        </c:forEach>
         </td>
        <td class="valign_top  brdrN tL pL0"><span><span class="rupee">Rs. </span>${roomPrice.costPrice }</span></td>
		<td class="brdrN valign_top tL pL0"><span class="fR txtClrGrn  fS16 mB10  fW600 tR">${room.status }</span></td>
      </tr>
     </table>
	<div class="brdrBLitGry clearfix"> <span class="col_8 pD10 pL0"><span class="fW600">Additional services </span><span class="mT5"> :  Car parking for 1 day</span></span> <span class="col_4 tR pD10 pR0"> <span class="mR40 mR10_sm mTN10 dB mT5"><span class="rupee">Rs. </span>300</span> </span> </div>
	</c:forEach>
	 
	<p class="txtClrlitGry mT10 mB20"><strong class="fW600">Inclusions : </strong><br>
			~~ 01-Apr-2014 to 26-Sep-2014~~Valid for 01APR14-26SEP14:- Stay 3 nights and receive the 4th night free (maximum 1 free night).; Booking Code: STAY4PAY3.;~~~~~~ 29-Sep-2014 to 31-Oct-2014~~Valid for 29SEP14-31OCT14:- Stay 3 nights and receive the 4th night free (maximum 1 free night).; Booking Code: STAY4PAY3.;~~~~~~ 09-Nov-2014 to 30-Dec-2014~~Valid for 09NOV14-30DEC14:- Stay 3 nights and receive the 4th night free (maximum 1 free night).; Booking Code: STAY4PAY3.;~~~~~~ 02-Jan-2015 to 18-Jan-2015~~Valid for</p>
	<p class="txtClrlitGry mT10 mB20"><strong class="fW600">Cancellation policy: </strong><br>
			Standard Room 1 Double Bed - Stay Pay
            01-Apr-2014 to 31-Mar-2015Valid for 01APR14-31MAR15:- 1 nights cancellation fee for bookings cancelled 24 hours or less prior to travel or in the event of a no-show.Except valid for.</p>
		<hr class="litGry mT20 mB20 clearfix">			
	 
	<div class="mB10 clearfix"></div>

	