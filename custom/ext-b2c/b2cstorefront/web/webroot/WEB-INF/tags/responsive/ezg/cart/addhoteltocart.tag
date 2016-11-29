<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true"%>
<%@ attribute name="hotelDataInfo" required="false" type="com.cnk.travelogix.common.facades.product.data.hotel.HotelData" %>
<%@ attribute name="hotelRoom" required="true" type="com.cnk.travelogix.common.facades.product.data.hotel.RoomDetailData" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>

<form:form method="post" name="ezgAddToCartForm"   action="${contextpath }/b2cstorefront/ezginb2c/en/cart/add/hotel">

<input type="hidden" name="hotelId" value="${hotelData.id }"/>
<c:if test="${not empty originalGroupId}">
<input type="hidden" name="originalGroupId" value="${originalGroupId }"/>
<input type="hidden" name="editMode" value="true"/>
</c:if>
<input type="hidden" name="roomId" value="${hotelRoom.roomId }"/>
<input type="hidden" name="roomType" value="DOUBLE_ROOM"/><!-- ${roomDetail.roomType } -->
<input type="hidden" name="numberOfAdult" value="2"/>
<input type="hidden" name="numberOfChild" value="1"/>
<input type="hidden" name="checkInDate" value="<fmt:formatDate value="${hotelSearchData.checkInDate}" type="date"/>"/>
<input type="hidden" name="checkOutDate" value="<fmt:formatDate value="${hotelSearchData.checkOutDate}" type="date"/>"/>
<input type="hidden" name="numberOfNight" value="${hotelSearchData.nights}"/>
<!-- <input type="hidden" name="numberOfRoom" value="1"/> -->
<c:if test="${empty showAddToCart ? true : showAddToCart}">
	<c:set var="buttonType">submit</c:set>
	<ycommerce:testId code="addToCartButton">
		<jsp:doBody/>
	</ycommerce:testId>
</c:if>
</form:form>