<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true"%>
<%@ attribute name="hotel" required="true" type="com.cnk.travelogix.common.core.cart.data.OrderHotelDetailInfoData"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>

<form name="editHotelForm">

<input type="hidden" name="productId" value="${hotel.hotelId }"/>
<input type="hidden" name="numberOfAdult" value="${hotel.numberOfAdult }"/>
<input type="hidden" name="numberOfChild" value="${hotel.numberOfChild }"/>
<input type="hidden" name="checkInDate" value="<fmt:formatDate value="${ hotel.hotelCheckinDate}" type="date" pattern="yy-MM-dd" />"/>
<input type="hidden" name="checkOutDate" value="<fmt:formatDate value="${ hotel.hotelCheckoutDate}" type="date" pattern="yy-MM-dd" />"/>
<input type="hidden" name="nights" value="${hotel.reservationDay}"/>
<input type="hidden" name="noOfRooms" value="${hotel.numberOfRooms }"/>
		
		<jsp:doBody/>
</form>