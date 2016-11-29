<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="flight" tagdir="/WEB-INF/tags/responsive/ezg/flight"%>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/ezg/cart"%>
<%@ attribute name="theFlight" required="true" type="com.cnk.travelogix.common.facades.product.data.flight.FlightData" %>
<%@ attribute name="theIndex" required="false"  %>
<%@ attribute name="theTabIndex" required="false"  %>
<%@ attribute name="isMultiCity" required="false"  %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<li class="clearfix mB15" id="${theTabIndex}${theIndex}">
<div class="selflight dN" id="selflight${theTabIndex}${theIndex}" >
						<img src="${ezgImagesPath}/custom/black_tick_circle_48x48.png" />
					</div>
    <span class="srp_flightContr">
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
        <span class="priceGrnContr clearfix">
            <mark class="mR20 bdrRightLightGreen fS12">
	            <flight:faresummary fareSummary="<%= (com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData)theFlight.getFareSummary().values().toArray()[0] %>"/> 
            </mark>
	            <mark>
	                <span class="clearfix dB">
	                	<c:if test="${ isMultiCity }"> 
	                		<flight:selection theTabIndex="${theTabIndex }" theIndex="${theIndex }"  theFlight="${theFlight }"/> 
	                	</c:if>
	                	<c:if test="${! isMultiCity }">
		                	<% java.util.List cartFlights = new java.util.ArrayList(); cartFlights.add(theFlight);%>
		                    <cart:addflighttocart flights="<%=cartFlights%>" > <a id="bookFlightId" href="javascript:void(0);" class="button button-primary fL mB10">Book</a> </cart:addflighttocart>
	                    </c:if>
	                    <span class="empty_heart fR mT5 mL10"></span>
	                    <span class="share_icon fR mT5"></span>
	                </span>
	                <a href="javascript:void(0);" class="addToCart dB mB5" onClick="addOneWayFlight(11)">Add to cart</a>
	                <a href="javascript:void(0);" class="dB" id="moreDetailsTrigger${theTabIndex}${theIndex}" onclick="showMoreInfo('moreDetailsTrigger${theTabIndex}${theIndex}','moreDetailsContainer${theTabIndex}${theIndex}','plusMinus${theTabIndex}${theIndex}');">
	                <span id="plusMinus${theTabIndex}${theIndex}">+</span>Details</a>
	            </mark>
          </span> 
      </span>
            <!-- Expanded view-->
      <section class="ft_results detailContr w100pcnt dN" id="moreDetailsContainer${theTabIndex}${theIndex}">
          <span class="show_contr_close fR" onclick="dismissMoreInfo('moreDetailsTrigger${theTabIndex}${theIndex}','moreDetailsContainer${theTabIndex}${theIndex}','plusMinus${theTabIndex}${theIndex}')"></span>
          <span class="show_contr_Aro"></span>
          <div class="col_6 pR0 pL10 layover clearfix">
              <c:forEach items="${theFlight.flightDetails}" var="flightDetail" varStatus="stus">
    				<samp class="go_AI">
       					 <span class="pT40">${theFlight.airlineIATA.airlineName}
           					 <br/>
            					${theFlight.airlineIATA.accountingCode} ${theFlight.airlineIATA.airlinePrefix}
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
                        	<span class="fS11">Airbus A380</span>
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
                        <c:if test="${not stus.last}">
                        
                        <span class="layoverBG fL w100pcnt">
                            <span class="layoverBGTime">Layover ${flightDetail.arrivalTime.hours-flightDetail.departureTime.hours} hrs 25 min</span>
                        </span>
                        </c:if>
                        <br class="cB">
               </c:forEach> 

          </div>
          
          <%-- fare breakup--%>
          <flight:farebreak fareDetail="<%= (com.cnk.travelogix.common.facades.product.data.flight.FareDetailData)theFlight.getFareDetail().values().toArray()[0] %>" 
          	isMultiCity="${isMultiCity }" theTabIndex="${theTabIndex }" theIndex="${theIndex }"  theFlight="${theFlight }"/>
      </section>
  </li>      
    
</li>