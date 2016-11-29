<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="hotelEntry" required="true" type="de.hybris.platform.commercefacades.order.data.OrderEntryData"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="hotel" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/hotel"%>

<c:set value="${hotelEntry.orderEntryInfoData.hotelDetailInfoData }" var="hotel"></c:set>

<div class="clearfix shopCardHrdrSec">
  <div class="fL clearfix pD10"> <span class="fL mR20"><img src="${ezgImagesPath }/common/hotel_thumb.png" alt="Hotel"></span>
    <div class="fL">
      <h4 class="mB5">${hotel.hotelName},${hotel.hotelAddress},${hotel.hotelCountryName}</h4>
      
      <span class="fS16"><fmt:formatDate value="${ hotel.hotelCheckinDate}" type="date" pattern="dd MMM. E." dateStyle="medium"/>, ${hotel.reservationDay } nights</span> 
      <span class=" fS16 mT3 planningdetail">${hotel.numberOfRooms} Rooms</span> 
      <span class=" fS16 mT3 planningdetail">${hotel.numberOfAdult} Adults, ${hotel.numberOfChild} Child</span>
       <a href="javascript:void(0)" data-grpid="${hotel.groupId }" id="moreRoomInfo" class="mT10 pL10" >
       <span id="plusMinus" >+</span>Details</a> 
    </div>
  </div>
  <div class="fR"> <span class="fL pD10 mR10 mT5">
  <hotel:edithotel hotel="${hotel }">
  	<span title="Edit" data-grpid="${hotel.groupId }" data-prodid="${hotel.hotelId }" id="hoteledit" class="edit_icon fL mR8"></span>
  </hotel:edithotel>
  <hotel:deletehotel hotel="${hotel }">
  	<span title="delete" id="hoteldelete" class="recycle_icon_wishlist mT5 fL"></span> 
  </hotel:deletehotel>
  </span> 
  <span class="fS30 srp_famount fR pD10"><span class="rupee">Rs</span>${hotel.priceInfo.costPrice}</span> </div>
</div>