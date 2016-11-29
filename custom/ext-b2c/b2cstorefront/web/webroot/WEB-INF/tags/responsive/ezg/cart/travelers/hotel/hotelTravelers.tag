<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>

<%@ attribute name="hotelEntry" required="true" type="de.hybris.platform.commercefacades.order.data.OrderEntryData"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="hotel" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/hotel"%>
<%@ taglib prefix="ancillary" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/hotel/ancillary"%>

<ancillary:hotelAncillaryTemplate/>

<c:set value="${hotelEntry.orderEntryInfoData.hotelDetailInfoData }" var="hotel"></c:set>

<c:forEach items="${hotelEntry.entries }" var="roomEntry" varStatus="roomstatus">
	<c:set var="roomInfo" value="${roomEntry.orderEntryInfoData.roomDetailInfoData }"></c:set>
	<br class="cB" />
	<!-- room1 form  begins here -->
	<div class="clearfix posR pB30 pT10">
	  <div class="col_2 tC"> <span class="adult_icon_large mB5"></span><br>
	    <span class="fS18">Room ${roomstatus.index + 1}</span><br>
	    <span class="fS12">${roomInfo.roomType} <br/>Without Breakfast</span>
	  </div>
	  <div class="fL posR"> <span class="show_contr_right arrow_right_position"></span> </div>
	  <div class="col_10 pR0">			
	    <div class="formContainer clearfix fL">
	     <hotel:hotelTravelerForm hotel="${hotel }" roomInfo="${roomInfo }" roomEntry="${roomEntry }"/>
	    </div>
	  </div>
	</div>
</c:forEach>