<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="flight" tagdir="/WEB-INF/tags/responsive/ezg/flight"%>
<%@ attribute name="theFlight" required="true" type="com.cnk.travelogix.common.facades.product.data.flight.FlightData" %>
<%@ attribute name="theIndex" required="false"  %>
<%@ attribute name="theTabIndex" required="false"  %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<li class="clearfix mB15">
				<div class="selflight dN"
				id="selflight${theTabIndex}${theIndex}">
				<img src="${ezgImagesPath}/custom/black_tick_circle_48x48.png" />
			</div> <span id="flightArrival${theTabIndex}${theIndex}" class="srp_flightContr"> <samp
					class="go_AI">
					<span>${theFlight.airlineIATA.airlineName} 
            <br/>${theFlight.airlineIATA.accountingCode} ${theFlight.airlineIATA.airlinePrefix}</span>
				</samp>
				<dfn>
					<strong> <small>${theFlight.fromSection.city}</small> ${theFlight.departureTime.hours}:${theFlight.departureTime.minutes}</strong>
					<ins></ins>
					<strong> <small>${theFlight.toSection.city}</small> ${theFlight.arrivalTime.hours}:${theFlight.arrivalTime.minutes}
					</strong>${theFlight.duration} | ${theFlight.numberOfStops} } | ${theFlight.cabinClass} |<br>Reaches on ${theFlight.arrivalTime}<br>
					<span class="fL">Non Refundable |</span><a class="dB"
						href="javascript:void(0);" id="moreDetailsTrigger${theTabIndex}${theIndex}"
						onclick="showMoreInfo('moreDetailsTrigger${theTabIndex}${theIndex} ','moreDetailsContainer${theTabIndex}${theIndex}','plusMinus${theTabIndex}${theIndex}');"><span
						id="plusMinus${theTabIndex}${theIndex}"> + </span> Details</a>
				</dfn> 
				<flight:optionselection theFlight="${theFlight}" theTabIndex="${theTabIndex }" theIndex="${theIndex }" fareSummary="<%= (com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData)theFlight.getFareSummary().values().toArray()[0] %>"/>
		</span>
			<section class="detailContr dN" id="moreDetailsContainer${theTabIndex}${theIndex}">
				<span class="show_contr_close fR"
					onclick="dismissMoreInfo('moreDetailsTrigger${theTabIndex}${theIndex}','moreDetailsContainer${theTabIndex}${theIndex}','plusMinus${theTabIndex}${theIndex}')"></span>
				
				<span class="show_contr_Aro"></span> 
				
				<span class="col_12 pR0 pL10 layover clearfix">
				
				<c:forEach items="${theFlight.flightDetails}" var="flightDetail" varStatus="stus">
					<samp
						class="go_AI"></samp> 
					<dfn>
						<strong> <small>${flightDetail.fromSection.city} <br> ${flightDetail.fromSection.terminal}
						</small> ${flightDetail.departureTime.hours}:${flightDetail.departureTime.minutes}<br> 
							<em class="mT10">${flightDetail.departureTime} ${flightDetail.fromSection.city} ${flightDetail.fromSection.terminal}</em>
						</strong>
						<ins>
							<span>${flightDetail.cabinClass}</span> ${flightDetail.duration} <br/>
						</ins>
						<strong> <small>${flightDetail.toSection.city}
                          	  <br>
           						 ${flightDetail.toSection.terminal} 
                            </small> ${flightDetail.arrivalTime.hours}:${flightDetail.arrivalTime.minutes} 
                            <br>
                                <em class="mT10">${flightDetail.arrivalTime} ${flightDetail.toSection.city} ${flightDetail.toSection.terminal} </em>
						</strong>
					</dfn>
					<c:if test="${not stus.last}">
						 <span class="layoverBG fL w100pcnt"><span
							class="layoverBGTime">Layover ${flightDetail.arrivalTime.hours - flightDetail.departureTime.hours} hrs 15 min</span></span><br
						class="cB"> 
					</c:if>
				</c:forEach>	
				
					
				</span>
				<flight:twowayfarebreak fareDetail="<%= (com.cnk.travelogix.common.facades.product.data.flight.FareDetailData)theFlight.getFareDetail().values().toArray()[0] %>" />
				<br class="cB"> <flight:selection theTabIndex="${theTabIndex }" theIndex="${theIndex }"  theFlight="${theFlight }"/>
				 <br class="cB">
				<span class="col_12 mT10 fS12 fL mB10"><a
					href="javascript:void(0);">Booking policy </a></span>
			</section>
</li>