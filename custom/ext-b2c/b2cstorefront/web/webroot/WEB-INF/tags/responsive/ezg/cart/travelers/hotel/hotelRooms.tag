<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>

<%@ attribute name="hotelEntry" required="true" type="de.hybris.platform.commercefacades.order.data.OrderEntryData"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="traveler" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers"%>

<c:set value="${hotelEntry.orderEntryInfoData.hotelDetailInfoData }" var="hotel"></c:set>

<section class="ft_results detailContr w100pcnt dN" id="moreRoomInfoCont" data-grpid="${hotel.groupId }"> 
    <span class="show_contr_close fR" id="closeRoom" data-grpid="${hotel.groupId }"></span>
	<c:forEach items="${hotelEntry.entries }" var="roomEntry" varStatus="status">
		<c:set var="room" value="${roomEntry.orderEntryInfoData.roomDetailInfoData }"></c:set>
      <div class="mB20 clearfix">
        <div class="col_8 pL100  mT20 clearfix"> 
        	<c:if test="${status.first }">
        	<span class="fs16 mB5 w100pcnt fL">Check in: <fmt:formatDate value="${ room.roomCheckinDate}" type="date" pattern="EEEE dd, MMMM yyyy" dateStyle="long"/></span> 
        	</c:if>
			<span class="fL col_6 pL0"> 
				<span class="fL w100pcnt mB5">${room.roomType }</span> 
				<span class="fS12">With Breakfast & dinner ${room.description }<br>
				</span><br/>
				<a href="#" class="fS12">Pricing & Room Info</a> 
			</span> 
			<span class="fL col_6"> <span class="fL w100pcnt mB5">1 Room @ Rs ${roomEntry.basePrice.value } X  ${room.numberOfNight } Nights</span> 
				<span class="fS12">${room.numberOfAdult} Adults, ${room.numberOfChild} Child</span> 
			</span> 
		</div>
        <div class="col_4 mT10"> 
        	<span class="fS30 fR pD10"> 
        		<c:if test="${room.status eq 'NOT_AVAILABLE' }">
        			<div class="fS18 txtClrRed"> not available</div>
        		</c:if>
        		<c:if test="${room.status != 'NOT_AVAILABLE' }">
        		 <span class="rupee">Rs</span> ${room.priceInfo.costPrice }<span class="fS12 dB">Pay now</span> 
        		 </c:if>
        	</span> 
        </div>
      </div>
    </c:forEach>
</section>
