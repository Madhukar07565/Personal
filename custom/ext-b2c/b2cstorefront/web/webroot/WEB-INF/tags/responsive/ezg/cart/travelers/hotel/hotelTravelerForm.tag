<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="hotel" required="true" type="com.cnk.travelogix.common.core.cart.data.OrderHotelDetailInfoData"%>
<%@ attribute name="roomEntry" required="true" type="de.hybris.platform.commercefacades.order.data.OrderEntryData"%>
<%@ attribute name="roomInfo" required="true" type="com.cnk.travelogix.common.core.cart.data.OrderRoomDetailInfoData"%>
<%@ taglib prefix="hotel" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/hotel"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form name="travelerDetailsForm" data-grpid="${hotel.groupId }" data-index="${roomInfo.roomIndex }" >
	<c:if test="${not empty roomInfo }" >
		<c:set var="travelerData" value="${roomEntry.entries[0].orderEntryInfoData.travellerData }"/>
		<c:set var="orderEntryNumber" value="${roomInfo.roomIndex }"/>
		<c:set var="hotelId" value="${roomInfo.hotelId }"/>
		<c:set var="roomId" value="${roomInfo.roomId }"/>
	</c:if>
	
	<input hidden="true" name="orderEntryNumber" type="text"  value="${orderEntryNumber }"/>
	<input hidden="true" name="roomId" type="text"  value="${roomInfo.roomId }"/>
	
    <hotel:primaryTraveler roomInfo="${roomInfo}" travelerData="${travelerData }"/>
</form>

<hotel:nonPrimaryTravelers travelerData="${travelerData }" roomInfo="${roomInfo }"/>

<form name="ancillaryForm" data-grpid="${hotel.groupId }" data-index="${roomInfo.roomIndex }">
    <hotel:roomAncillary roomInfo="${roomInfo }"/>
</form> 

<!-- traveller list -->
<!-- <div id="travellerList1" class="clearfix fL travellerList dN">
  <div class="travellerListAro"></div>
  <div class=" brdrGry clearfix fL">
    <ul class="travellerListing">
      <li class="fW600">Select from traveller list</li>
      <li onClick="populateNames(1)"><span id="title1">Mr.</span><span id="fName1"> Ashish</span><span id="lName1"> Kumar</span> </li>
      <li onClick="populateNames(2)"><span id="title2">Mrs.</span><span id="fName2"> Veena</span><span id="lName2"> Kumar</span> </li>
      <li onClick="populateNames(3)"><span id="title3">Ms.</span><span id="fName3"> Riya</span><span id="lName3"> Kumar</span> </li>
      <li onClick="populateNames(4)"><span id="title4">Mast.</span><span id="fName4"> Rahul</span><span id="lName4"> Kumar</span> </li>
    </ul>
  </div>
</div> -->