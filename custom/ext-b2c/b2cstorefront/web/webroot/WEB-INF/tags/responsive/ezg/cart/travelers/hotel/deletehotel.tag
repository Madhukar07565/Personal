<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true"%>
<%@ attribute name="hotel" required="true" type="com.cnk.travelogix.common.core.cart.data.OrderHotelDetailInfoData"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>

<form name="deleteHotelForm">
<input type="hidden" name="productId" value="${hotel.hotelId }"/>
<input type="hidden" name="groupId" value="${hotel.groupId }"/>
		<jsp:doBody/>
</form>
<!-- <div class="overlay_content posF" id="deleteItemConfirmation" style="display: none;">
	  <div class="white_content_inner popupSml">
	    <div class="closeBtn_popup fR dB" onclick="popupclose('deleteItemConfirmation', 'black_overlay')"></div>
	    <h2 class="mB20 fS18">Are you sure you want to delete this ?</h2>
	    <a href="javascript:void(0)" class="button button-primary mR20 confirmYes" id="btnConfirm" onClick="removeFromWishlist(this)">Yes</a> 
	    <a href="javascript:void(0)" class="button button-secondary" onClick="popupclose('deleteItemConfirmation', 'black_overlay')">No</a> </div>
	</div> -->
	
	