<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="flight" tagdir="/WEB-INF/tags/responsive/ezg/flight"%>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/ezg/cart"%>
<%@ attribute name="depatureFlight" required="true" type="com.cnk.travelogix.common.facades.product.data.flight.FlightData" %>
<%@ attribute name="returnFlight" required="true" type="com.cnk.travelogix.common.facades.product.data.flight.FlightData" %>
<%@ attribute name="theIndex" required="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<li class="clearfix mB15"><span class="srp_flightContr">
			<samp class="go_AI">
				<span>${depatureFlight.airlineIATA.airlineName}  <br /> ${depatureFlight.airlineIATA.accountingCode} ${depatureFlight.airlineIATA.airlinePrefix}
				</span>
			</samp> <dfn>
				<strong> <small>${depatureFlight.fromSection.city}</small>${depatureFlight.departureTime.hours}:${depatureFlight.departureTime.minutes}
				</strong>
				<ins></ins>
				<strong> <small>${depatureFlight.toSection.city}</small>${depatureFlight.arrivalTime.hours}:${depatureFlight.arrivalTime.minutes}
				</strong>${depatureFlight.duration} | ${depatureFlight.numberOfStops} | ${depatureFlight.cabinClass}<br> Reaches on 29 July
			</dfn> <span class="addFlight">+</span> 
			
			<samp class="go_AI">
				<span>${returnFlight.airlineIATA.airlineName}  <br /> ${returnFlight.airlineIATA.accountingCode} ${returnFlight.airlineIATA.airlinePrefix}
				</span>
			</samp> <dfn>
				<strong> <small>${returnFlight.fromSection.city}</small>${returnFlight.departureTime.hours}:${returnFlight.departureTime.minutes}
				</strong>
				<ins></ins>
				<strong> <small>${returnFlight.toSection.city}</small>${returnFlight.arrivalTime.hours}:${returnFlight.arrivalTime.minutes}
				</strong>${returnFlight.duration} | ${returnFlight.numberOfStops} | ${returnFlight.cabinClass}<br> Reaches on 31 July
				
			</dfn> <span class="priceGrnContr clearfix"> 
				<mark class="mR20 bdrRightLightGreen fS12">
				<% com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData depatureFareSummary = (com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData)depatureFlight.getFareSummary().values().toArray()[0]; 
				   com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData returnFareSummary = (com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData)returnFlight.getFareSummary().values().toArray()[0];%>
					<flight:twowayfaresummary depatureFareSummary="<%=depatureFareSummary%>" returnFareSummary="<%=returnFareSummary %>"/>
				</mark>
				<mark>
					<span class="clearfix dB"> 
						<% java.util.List cartFlights = new java.util.ArrayList(); cartFlights.add(returnFlight); cartFlights.add(depatureFlight);%>
		                    <cart:addflighttocart flights="<%=cartFlights%>" > <a id="bookFlightId" href="javascript:void(0);" class="button button-primary fL mB10">Book</a> </cart:addflighttocart>
						
						<span
						class="empty_heart fR mT5 mL10"></span> 
						<span
						class="share_icon fR mT5"></span>
					</span>
					
					 <a href="javascript:void(0);" class="addToCart dB mB5"
						onclick="addOneWayFlight(11)">Add to cart</a> <a
						href="javascript:void(0);" class="dB" id="moreDetailsTrigger${theIndex}"
						onclick="showMoreInfo('moreDetailsTrigger${theIndex}','moreDetailsContainer${theIndex}','plusMinus${theIndex}');"><span
						id="plusMinus${theIndex}">+</span> Details</a>
				</mark>
		</span>
	</span>
		<section class="detailContr dN" id="moreDetailsContainer${theIndex}">
			<span class="show_contr_close fR"
				onclick="dismissMoreInfo('moreDetailsTrigger${theIndex}','moreDetailsContainer${theIndex}','plusMinus${theIndex}')"></span>
			<span class="show_contr_Aro"></span> <span
				class="col_12 pR0 pL10 layover clearfix"> 
				
				<span
				class="col_6"> 
				<c:forEach items="${depatureFlight.flightDetails}" var="flightDetail" varStatus="stus">
    				<samp class="go_AI">
       					 <span class="pT40">${depatureFlight.airlineIATA.airlineName}
           					 <br/>
            					${depatureFlight.airlineIATA.accountingCode} ${depatureFlight.airlineIATA.airlinePrefix}
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
					
				</span>
				 <span class="col_6 mTn10"> 
				 	<c:forEach items="${returnFlight.flightDetails}" var="flightDetail" varStatus="stus">
    				<samp class="go_AI">
       					 <span class="pT40">${returnFlight.airlineIATA.airlineName}
           					 <br/>
            					${returnFlight.airlineIATA.accountingCode} ${returnFlight.airlineIATA.airlinePrefix}
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
			</span>
			</span>
			<div class="col_6 mT20 pR10 pL75">
			<% com.cnk.travelogix.common.facades.product.data.flight.FareDetailData fare1 = (com.cnk.travelogix.common.facades.product.data.flight.FareDetailData)depatureFlight.getFareDetail().values().toArray()[0]; 
			  com.cnk.travelogix.common.facades.product.data.flight.FareDetailData fare2 = (com.cnk.travelogix.common.facades.product.data.flight.FareDetailData)depatureFlight.getFareDetail().values().toArray()[1]; %>
				<flight:twowayflightheaderfare fare2="<%=fare2 %>" fare1="<%=fare1 %>"></flight:twowayflightheaderfare>
			</div>
			<div class="col_6 pD10 pT0">
				<span class="mB10 fL clearfix"><span
					class="baggage_icon mR5 fL"></span><span
					class="fL fS12 w65pcnt">20kg baggage included</span></span> <span
					class="clearfix"><span class="food_small fL"></span><span
					class="fL mL5 fS12">Meals included</span></span> <br class="cB">
				<span class="col_12 mT10 fS12 fL mB10"><a
					href="javascript:void(0);">Booking policy </a></span> <br class="cB">
				<a href="javascript:void(0);"
					class="button button-primary fR dB mR10 mT10 mB10 addToCart"
					onClick="selectFlight(1,'arrival')">Book</a>
			</div>
		</section>
</li>
						