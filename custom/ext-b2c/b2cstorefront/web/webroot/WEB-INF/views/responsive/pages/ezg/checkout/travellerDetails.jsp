<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="traveler" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers"%>
<%@ taglib prefix="hotel" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/hotel"%>
<%@ taglib prefix="flight" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/flight"%>


      <section class="contContainer pT20 mB10" id="step1" style="display:block"> 
     	<c:if test="${not empty cartChange }">
	        <div  class="fS18 txtClrRed"> one or more products are not available or price changed.</div>
        </c:if>
      	<c:forEach items="${typeOrder}" var="orderType">
	        <%--  Flight Details One way and Two way  --%>
	      	<c:if test="${orderType eq 'FLIGHT_GROUP' && haveFlight }">
	        	<flight:flightSection/>
	        </c:if>
	         <%--  Hotel Details --%>
	        <c:if test="${orderType eq 'HOTEL' && haveHotel }">
		        <hotel:hotelSection/>
	        </c:if>
	        <%--  Flight+Hotel start Details --%>
	        <c:if test="${haveFlightHotel }">
	       		<traveler:flightHotelTraveler/>
	       </c:if>

		</c:forEach>
        <div class="clearfix mB20">
          <div class="fR">
            <div class="finalTotalAmt pD10 mB10">
              <div>Total:</div>
              <div class="fS30"><span class="rupee">Rs</span>${cartData.totalPrice.value }</div>
            </div>
           
             <a id="travelerDetailsButton" href="javascript:void(0)" class="w100pcnt button button-primary tC" >Continue <%-- <spring:theme code="basket.add.to.basket"/> --%>
             </a>   
          </div>
        </div>
      </section>
     