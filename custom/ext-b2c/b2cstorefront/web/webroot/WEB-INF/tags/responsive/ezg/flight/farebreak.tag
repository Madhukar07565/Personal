<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="flight" tagdir="/WEB-INF/tags/responsive/ezg/flight"%>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/ezg/cart"%>

<%@ attribute name="fareDetail" required="false" type="com.cnk.travelogix.common.facades.product.data.flight.FareDetailData" %>
<%@ attribute name="theFlight" required="true" type="com.cnk.travelogix.common.facades.product.data.flight.FlightData" %>
<%@ attribute name="theIndex" required="false"  %>
<%@ attribute name="theTabIndex" required="false"  %>
<%@ attribute name="isMultiCity" required="false"  %>

<div class="col_5 mT10"> 
  <ul class="fareBrkup"> 
    <li class="heading">FARE BREAKUP
      <span class="rupee fR">Rs</span>
    </li>  
    <li>Base fare
      <span class="fR">${fareDetail.baseFare}</span>
    </li>  
    <li>Fuel surcharge
      <span class="fR">${fareDetail.fuelSurcharge}</span>
    </li>  
    <li>JN Tax
      <span class="fR">${fareDetail.jnTax}</span>
    </li>  
    <li>Psgr. Svc. Fee
      <span class="fR">${fareDetail.psgrSvcFee}</span>
    </li>  
    <li>Service tax
      <span class="fR">${fareDetail.serviceTax}</span>
    </li>  
    <li class="mB25 clearfix">
      <strong>TOTAL</strong>
      <span class="fR fS22 fW600 tR">${fareDetail.fuelSurcharge + fareDetail.baseFare + fareDetail.jnTax + fareDetail.psgrSvcFee + fareDetail.serviceTax}
        <span class="fS12 fW400 dB">Refundable</span>
      </span>
    </li> 
  </ul>  
  <div class="mT20 fS12 mB20">
    <a href="javascript:void(0);" onclick="popupwin('booking_policy', 'booking_policyinner', 'fade')">Booking policy</a>
  </div>  
  <span class="dB clearfix mB10"> 
    			<c:if test="${ isMultiCity }"> 
              		<flight:selection theTabIndex="${theTabIndex }" theIndex="${theIndex }"  theFlight="${theFlight }"/> 
              	</c:if>
              	<c:if test="${! isMultiCity }">
               	<% java.util.List cartFlights = new java.util.ArrayList(); cartFlights.add(theFlight);%>
                   <cart:addflighttocart flights="<%=cartFlights%>" > <a id="bookFlightId" href="javascript:void(0);" class="button button-primary fL mB10">Book</a> </cart:addflighttocart>
                </c:if>
                <br/>
      <span class="fL clearfix dB mT5 mL5"> 
	      <span class="share_icon fL mR10"></span>  
	      <span class="empty_heart fR"></span> 
      </span>  
  </span>  
  <a href="javascript:void(0);" class="dB addToCart" onclick="addOneWayFlight(1)">Add to cart</a> 
</div>