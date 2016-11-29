<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ attribute name="flights" required="true" type="com.cnk.travelogix.common.facades.product.data.flight.FlightResultData" %>
<%@ attribute name="tagName" required="false"  %>
<%@ attribute name="theIndex" required="false"  %>

<li class="clearfix mB15">
  <div class="srp_flightContr"> 
	<c:forEach items="${flights.listOfFlights}" var="theFlight" varStatus="stus">
		<c:if test="${stus.index == 0 }">
			<span>
			  	<samp class="go_AI">
		            <span>${theFlight.airlineIATA.airlineName} 
		            <br/>${theFlight.airlineIATA.accountingCode} ${theFlight.airlineIATA.airlinePrefix}</span>
		        </samp>
		        <dfn>
		            <strong>
		            
		            <small>${theFlight.fromSection.city}</small>${theFlight.departureTime.hours}:${theFlight.departureTime.minutes}</strong>
		            <ins>
		            <span>${theFlight.cabinClass}</span>${theFlight.duration}</ins>
		            <strong>
		            <small>${theFlight.toSection.city}</small>${theFlight.arrivalTime.hours}:${theFlight.arrivalTime.minutes}</strong>
		        </dfn>
			  </span>
			
			<span id="span_fareBook${tagName}${theIndex}" class="priceGrnContr w40pcnt_imp  clearfix">
			<mark class="mR20 bdrRightLightGreen fS12"><span class="lineThrough"><span class="rupee">Rs. </span>4,682</span><span class="mainPrice"><span class="rupee">Rs. </span>4,382</span>Save <span class="rupee">Rs. </span>300<br>
			  Earn 20 points</mark>
			<mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Book</a> <span class="empty_heart fR mT5 mL10"></span> <span class="share_icon fR mT5"></span> </span> <a href="javascript:void(0);" class="addToCart dB mB5" onClick="addOneWayFlight(11)">Add to cart</a> <a href="javascript:void(0);" class="dB" id="moreDetailsTrigger0"  onclick="showMoreInfo('moreDetailsTrigger0','moreDetailsContainer0','plusMinus0');"><span id="plusMinus0">+</span> Details</a> </mark>
			</span> 
		</c:if>
		<c:if test="${stus.index > 0 }">
			<div class="clearfix cB">
			  <span>
			  	<samp class="go_AI">
		            <span>${theFlight.airlineIATA.airlineName} 
		            <br/>${theFlight.airlineIATA.accountingCode} ${theFlight.airlineIATA.airlinePrefix}</span>
		        </samp>
		        <dfn>
		            <strong>
		            
		            <small>${theFlight.fromSection.city}</small>${theFlight.departureTime.hours}:${theFlight.departureTime.minutes}</strong>
		            <ins>
		            <span>${theFlight.cabinClass}</span>${theFlight.duration}</ins>
		            <strong>
		            <small>${theFlight.toSection.city}</small>${theFlight.arrivalTime.hours}:${theFlight.arrivalTime.minutes}</strong>
		        </dfn>
			  </span>
			  <span id="span_padding${tagName}${theIndex}" class="priceGrnContr w40pcnt_imp  clearfix" style="background:#a5ebdf;"></span>
			 </div> 
		</c:if>
	  </c:forEach>
	  
		
</div>
		
		
	
	  
		
		<!-- Expanded view-->
		<section class="ft_results detailContr w100pcnt dN" id="moreDetailsContainer0"> <span class="show_contr_close fR" onclick="dismissMoreInfo('moreDetailsTrigger0','moreDetailsContainer0','plusMinus0')"></span> 
		  <div class="col_6 pR0 pL10 layover clearfix"> 
		  		<c:forEach items="${flights.listOfFlights}" var="theFlight" varStatus="flightStus">
		  			<c:forEach items="${theFlight.flightDetails}" var="flightDetail" varStatus="detailsStus">
		  				<samp class="go_AI">
	       					 <span class="pT40">${flightDetail.airlineIATA.airlineName}
	           					 <br/>
	            					${flightDetail.airlineIATA.accountingCode} ${flightDetail.airlineIATA.airlinePrefix}
	       					 </span>
    					</samp>
    					<dfn>
	       					 <strong>
	            				<small>${flightDetail.fromSection.city} 
	               					 <br>
	            						${flightDetail.fromSection.terminal} 
	                			</small> ${flightDetail.departureTime.hours}:${flightDetail.departureTime.minutes}
	                					<br>
	                    			<em class="mT10">${flightDetail.departureTime} ${flightDetail.fromSection.city} ${flightDetail.fromSection.terminal} </em>
	                			</strong>
	                		<ins>
	                   			<span>${flightDetail.cabinClass}</span> ${flightDetail.duration}
	                    			<br>
	                        	<span class="fS11">${flightDetail.cabinClass}</span>
	                    	</ins>
	                    	<strong>
	                        	<small>${flightDetail.toSection.city}
	                          	  <br>
	           						 ${flightDetail.toSection.terminal} 
	                            </small> ${flightDetail.arrivalTime.hours}:${flightDetail.arrivalTime.minutes} 
	                            <br>
	                                <em class="mT10">${flightDetail.arrivalTime} ${flightDetail.toSection.city} ${flightDetail.toSection.terminal} </em>
	                            </strong>
	                      </dfn>
	                      <span class="mB10 clearfix dB">
		                      <span class="baggage_icon mR5 fL"></span>
		                      <span class="fS12 fL">20kg baggage included</span>
	                      </span>
	                      <span class="clearfix dB mB10">
	                          <span class="food_small fL"></span>
	                          <span class="fL mL5 fS12">Meals included</span>
                          </span><%-- This is the splider--%>
                          <c:if test="${(not flightStus.last) || (not detailsStus.last)}">
		                      <span class="layoverBG fL w100pcnt">
		                      		<span class="layoverBGTime">Layover ${flightDetail.layover}</span>
		                      </span>
                          </c:if>
                          <br class="cB">
		  			</c:forEach>
             
				</c:forEach>	
		  </div>
		  <div class="col_5 mT10">
			<ul class="fareBrkup">
			  <li class="heading">FARE BREAKUP<span class="rupee fR">Rs</span></li>
			  <li>Base fare<span class="fR">2230</span></li>
			  <li>Fuel surcharge<span class="fR">1950</span></li>
			  <li>JN Tax<span class="fR">150</span></li>
			  <li>Psgr. Svc. Fee<span class="fR">250</span></li>
			  <li>Service tax<span class="fR">250</span></li>
			  <li class="mB25 clearfix"><strong>TOTAL</strong><span class="fR fS22 fW600 tR">4382<span class="fS12 fW400 dB">Refundable</span></span></li>
			</ul>
			<div class="mT20 fS12 mB20"><a href="javascript:void(0);" onclick="popupwin('booking_policy', 'booking_policyinner', 'fade')">Booking policy </a></div>
			<span class="dB clearfix mB10"> <a href="javascript:void(0);" class="button button-primary fL mR10">Book</a> <span class="fL clearfix dB mT5 mL5"> <span class="share_icon fL mR10"></span> <span class="empty_heart fR"></span> </span> </span> <a href="javascript:void(0);" class="dB addToCart" onclick="addOneWayFlight(1)">Add to cart</a> </div>
		</section>
	  </li>
<script type="text/javascript">
//var ractiveTopFlight = ractiveTopFlight ? ractiveTopFlight : {};
$(function() {
	//pad empty span
	var span_height = $('span#span_fareBook${tagName}${theIndex}').outerHeight();
	$('span#span_padding${tagName}${theIndex}').css('height',span_height);
	console.log('${tagName}${theIndex}');
});

</script>