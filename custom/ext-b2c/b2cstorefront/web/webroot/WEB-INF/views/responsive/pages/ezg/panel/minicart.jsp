<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
  <div id="minicartcontainer" class="container" >
    <div class="clearfix fcWht pT20 pB20">
      <ul id="second-carousel" class="first-and-second-carousel jcarousel-skin-matrix " >
    <c:forEach items="${cart.entries }" var="rootEntry" varStatus="status">
	    <c:if test="${rootEntry.orderEntryType eq 'HOTEL'}">
	    	<c:set value="${rootEntry.orderEntryInfoData.hotelDetailInfoData}" var="hotelInfo"/>
	   
	   		<c:forEach items="${rootEntry.entries}" var="roomEntry"  >
	    		<c:set var="roomInfo" value="${roomEntry.orderEntryInfoData.roomDetailInfoData }"></c:set>
	    		<c:if test="${roomEntry.orderEntryType eq 'HOTEL_ROOM' }">
			     <div class="col_3_half pL0 clearfix" id="minicartEntryDivId_${roomEntry.entryNumber }">
					  <span class="mL10 fR"><img src="${ezgImagesPath }/bin.png" alt="" name="itemToDelete" data-number=${roomEntry.entryNumber }></span>
					  <span class="fL"><img src="${ezgImagesPath }/common/hotel_thumb.png" alt="Hotel Thumb"></span>
			          <span class="fL mL10"><span class="fW600 fS14">${hotelInfo.hotelName }</span>
				          <br>
				          <span class="fS12">${hotelInfo.hotelAddress }<br> Standard Double Room <br>with breakfast, ${roomInfo.numberOfNight } nights</span>
				          <br>
				          <span class="fW600 fS14"><span class="rupee">Rs</span>${roomEntry.totalPrice.value }</span>
			          </span>
			      </div>
			      </c:if>
			      <c:if test="${roomEntry.entryNumber != totalItems-1}">
			       <div class="col_1 pL0 pR0" style="width:4%;" id="minicartEntryPlusSymbo_${roomEntry.entryNumber }">
						<br>
						<span class="fW600 fS30 mT20">+</span>
			       </div>
			      </c:if>
	    	</c:forEach>
	    </c:if>
	    <c:if test="${rootEntry.orderEntryType eq 'FLIGHT_GROUP'}">
	    	<c:forEach items="${rootEntry.entries}" var="flightEntry"  >
	    		<c:forEach items="${flightEntry.entries}" var="ticketEntry">
	    			<c:if test="${ticketEntry.orderEntryType eq 'FLIGHT_TICKET' }">
	    					<c:set var="commonFlightInfo" value="${ticketEntry.orderEntryInfoData.ticketDetailInfoData.commonFlightInfoData}"/>
							<li style="width:550px !important" id="minicartEntryDivId_${ticketEntry.entryNumber }">
								<div class="fL cursor mR10 mT5 mB5 w100pcnt">
									<span class="fL mR10"> 
										<img class="mB5" alt="{{flightAirlineName}}" src="${ezgImagesPath}/srp_flight/indigo_sml_logo.jpg" /> 
										<span class="fS12 fcWht dB">${commonFlightInfo.airlineIATAData.airlineName } </span>
									</span> 
									<span class="clearfix fL dB"> 
										<span class="clearfix dB"> 
											<span class="fcWht fL TrvLocation">${commonFlightInfo.fromCity} <br /> <fmt:formatDate type="date" pattern="dd MMM, E"  value="${commonFlightInfo.departureTime}"/> </span>
											<span class="flight_icon_sml fL mTB2LR10"></span>
											<span class="fcWht fL TrvLocation"> ${commonFlightInfo.toCity} <br /><fmt:formatDate type="date" pattern="dd MMM, E"  value="${commonFlightInfo.arrivalTime}"/> </span>
										</span> 
										<span class="fcWht dB"> ${commonFlightInfo.fromCity}${commonFlightInfo.toCity}<fmt:formatDate type="date" pattern="dd MMM, E"  value="${commonFlightInfo.departureTime}"/> </span>
 									</span>
									<span class="mR35 fR"><img src="${ezgImagesPath}/bin.png" name="itemToDelete" alt="" data-number=${ticketEntry.entryNumber } />
									</span>
								</div>
							</li>
							<c:if test="${roomEntry.entryNumber != totalItems-1}">
								<li class="col_1 w5pcnt_imp pT10 pR10 pL10 pB10" style="width:80px;" id="minicartEntryPlusSymbo_${ticketEntry.entryNumber }">
									<br /> <span class="fW600 fS30 mT20">+</span>
								</li>
							</c:if>
						</c:if>
	    		</c:forEach>
	    	</c:forEach>
	    </c:if>
	    
	    
    </c:forEach>
      <li class="col_2 fL mL20 actionShoppingCart">
        <h4 class="mB10 mL40" id="minicartTotalPrice"><span class="rupee">Rs</span>${cart.totalPrice.value }</h4>
        <a id="minicartCheckout" href="javascript:void(0);" class="button button-primary button-large fR dB">Check out</a> 
       </li>
    </ul>
  </div>
  <a href="javascript:void(0);" id="closeB2CMinicart"><span class="close_thumbnail_grey m0"></span></a>
  </div>
<script>
	$(function(){
		$('.first-and-second-carousel').jcarousel();
	})
</script>