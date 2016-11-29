<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="flight" tagdir="/WEB-INF/tags/responsive/ezg/flight"%>

<%@ attribute name="theIndex" required="false"  %>
<%@ attribute name="theTabIndex" required="false"  %>
<%@ attribute name="tagName" required="false"  %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="twowayFlight${tagName}${theTabIndex}" >
    </div>

<script id="templateTwowayFlight${tagName}${theTabIndex}" type="text/ractive">   
{{#if flights}} 

{{#each flights[${theTabIndex}].listOfFlights : theIndex}}    
	<li class="clearfix mB15">
				<div class="selflight dN"
				id="selflight${theTabIndex}{{theIndex}}">
				<img src="${ezgImagesPath}/custom/black_tick_circle_48x48.png" />
			</div> <span id="flightArrival${theTabIndex}{{theIndex}}" class="srp_flightContr"> <samp
					class="go_AI">
					<span>{{airlineIATA.airlineName}} 
            <br/>{{airlineIATA.accountingCode}} {{airlineIATA.airlinePrefix}}</span>
				</samp>
				<dfn>
					<strong> <small>{{fromSection.city}}</small> {{displayDepartureTime}}</strong>
					<ins></ins>
					<strong> <small>{{toSection.city}}</small> {{displayArrivalTime}}
					</strong>{{duration}} | {{numberOfStops}}  | {{cabinClass}} |<br>Reaches on {{displayArrivalDate}}<br>
					<span class="fL">Non Refundable |</span><a class="dB"
						href="javascript:void(0);" id="moreDetailsTrigger${theTabIndex}{{theIndex}}"
						onclick="showMoreInfo('moreDetailsTrigger${theTabIndex}{{theIndex}} ','moreDetailsContainer${theTabIndex}{{theIndex}}','plusMinus${theTabIndex}{{theIndex}}');"><span
						id="plusMinus${theTabIndex}{{theIndex}}"> + </span> Details</a>
				</dfn> 
				<%-- fare summary start --%>
		<%--		<flight:optionselection theFlight="${theFlight}" theTabIndex="${theTabIndex }" theIndex="${theIndex }" fareSummary="<%= (com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData)theFlight.getFareSummary().get(0) %>"/>  --%>
<%-- fare summary goes here <flight:faresummary fareSummary="<%= (com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData)theFlight.getFareSummary().values().toArray()[0] %>"/> --%>
							<%-- fare summary goes here <flight:faresummary fareSummary="<%= (com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData)theFlight.getFareSummary().values().toArray()[0] %>"/> --%>
							
		<span  class="priceGrnContr clearfix flightDtlhit flightDtlhit w40pcnt h150">
			<%-- fare summary Start --%>
              <mark class="mR5 fS12 w100pcnt">
					{{#if fareSummary.length>1}}
								<select class="smallDropdown mB10" value={{selectdFareType}} >
									{{#each fareSummary: optionIndex}}
               					 		<option value='{{optionIndex}}' {{optionIndex== selectdFareType? 'selected': ''}} >{{type}}</option>
									{{/each}}
               					 	
              					</select>
							{{/if}}
							{{# fareSummary[selectdFareType]}}
								<span class="lineThrough">
   							 	<span class="rupee">Rs.</span>{{listPrice}}</span>
    							<span class="mainPrice">
    							<span class="rupee">Rs.</span>{{webPrice}}</span>Save 
    							<span class="rupee">Rs.</span>{{listPrice - webPrice}}
   								<br/>Earn {{pointEarn}} points 
							{{/fareSummary}}
			  </mark>

			<%-- fare summary End --%>
				<a href="javascript:void(0);" class="button button-primary dB mB10 addToCart fL"  on-click="selectTheFlight(${theTabIndex}, theIndex, flights[${theTabIndex}].listOfFlights[theIndex])">Select</a>
				<span class="dB fL mL10"> <span class=" share_icon fL mR10"></span> <span class="empty_heart fL"></span> </span>
		</span>
			<section class="detailContr dN w100pcnt" id="moreDetailsContainer${theTabIndex}{{theIndex}}">
				<span class="show_contr_close fR"
					onclick="dismissMoreInfo('moreDetailsTrigger${theTabIndex}{{theIndex}}','moreDetailsContainer${theTabIndex}{{theIndex}}','plusMinus${theTabIndex}{{theIndex}}')"></span>
				
				<span class="show_contr_Aro"></span> 
				
				<span class="col_12 pR0 pL10 layover clearfix">
				
				{{#each flightDetails : theIndex}}
					<samp
						class="go_AI"></samp> 
					<dfn>
						<strong> <small>{{fromSection.city}} <br> {{fromSection.terminal}}
						</small> {{displayDepartureTime}}<br> 
							<em class="mT10">{{displayDepartureDate}}<br> {{fromSection.city}} {{fromSection.terminal}}</em>
						</strong>
						<ins>
							<span>{{cabinClass}}</span> {{duration}} <br/>
						</ins>
						<strong> <small>{{toSection.city}}
                          	  <br>
           						 {{toSection.terminal}} 
                            </small> {{displayArrivalTime}} 
                            <br>
                                <em class="mT10">{{displayArrivalDate}} {{toSection.city}} {{toSection.terminal}} </em>
						</strong>
					</dfn>
					{{#if (theIndex < flightDetails.length - 1)}}
						 <span class="layoverBG fL w100pcnt"><span class="layoverBGTime">Layover  hrs 15 min</span></span>
					{{/if}}
				{{/each}}	
				
					
				</span>

			<%-- farebreak goes here  --%>
<%--
				<flight:twowayfarebreak fareDetail="<%= (com.cnk.travelogix.common.facades.product.data.flight.FareDetailData)theFlight.getFareDetail().get(0) %>" />
				<br class="cB"> <flight:selection theTabIndex="${theTabIndex }" theIndex="${theIndex }"  theFlight="${theFlight }"/>

--%>
			

			<%-- fare breakup goes here--%>
				{{# fareDetail[selectdFareType]}}
					<div class="col_6 mT20 pL10 pR10">
						<ul class=" fareBrkup">
							<li class="heading">FARE BREAKUP<span class="rupee fR">Rs</span></li>
							<li>Base fare<span class="fR">{{baseFare}}</span></li>
							<li>Fuel surcharge<span class="fR">{{fuelSurcharge}}</span></li>
							<li>JN Tax<span class="fR">{{jnTax}}</span></li>
							<li>Psgr. Svc. Fee<span class="fR">{{psgrSvcFee}}</span></li>
							<li class="mB25 clearfix">TOTAL<span
								class="fR fS22 fW600 tR">{{fareSummary[selectdFareType].webPrice}}<span
									class="fS12 fW400 dB">{{refundable? 'Refundable' : ''}}</span></span></li>
						</ul>
						{{# services}}
							{{#each services: i}}
								<span class="mB10 mT5 fL clearfix">
									<span class="{{services[i] == '20kg baggage included'? 'baggage_icon mR5 fL': 'food_small fL'}}"></span>
									<span class="fL fS12 w65pcnt">{{services[i]}}</span>
								</span> 
						
							{{/each}}
						{{/ services}}
					</div>
					{{#if fareSummary.length>1}}
                        <div class="col_6 expandedGrnCont pT10 pB10 pL10 pR10 ">
                            <ul class="flyBG clearfix">
								{{#each fareSummary: i}}
                                <li class="{{ i == 0? 'first' : ''}}"><input type="radio"
                                    checked="{{i == selectdFareType? 'selected': ''}}" on-click="changeFareType(${theTabIndex}, theIndex, i)"/> <label for="fly2">
										{{type}}</label> <span class="mL30 fS22"><span class="rupee">Rs.
                                    </span>{{webPrice}}</span></li>
								{{/each}}
                                
                            </ul>
                        </div>
					{{/if}}
				{{/fareDetail}}
				<%-- fare breakup End--%>

			
			<br class="cB"/>
			<a href="javascript:void(0);" class="button button-primary fR dB mR10 mT10 mB10 addToCart"  on-click="alert({{flights[${theTabIndex}].listOfFlights[index]}})">Select</a>
				<span class="col_12 mT10 fS12 fL mB10"><a
					href="javascript:void(0);">Booking policy </a></span>
<%-- farebreak end  --%>
			</section>
	</li>

{{/each}}

{{/if}}

</script>

<script type="text/javascript">
var ractiveTopFlight = ractiveTopFlight ? ractiveTopFlight : {};
$(function() {
	ractiveTopFlight.twowayFlight${theTabIndex} = new Ractive({
		
		el: '#twowayFlight${tagName}${theTabIndex}',
		template: '#templateTwowayFlight${tagName}${theTabIndex}',
		oninit: function () {
			console.log(this.get('flights'));
		},
		data: {
			'flights' : ${resultList}
			<%-- 'theTabIndex' : <c:if test="${empty theTabIndex}">0</c:if><c:if test="${not empty theTabIndex}">${resultList}</c:if> --%>
		},
		
		'changeFareType' : function(tabIndex, index, type){
			var flights = this.get('flights');
			var flight = flights[tabIndex].listOfFlights[index];
			flight.selectdFareType = type;
			this.update();
		},
		
		'refresh': function(data){
			this.set('flights', data);
			this.update();
		},
		
		'selectTheFlight' : function(leg, index, flight){
			console.log(ractiveTopFlight.resultList);
			debugger;
			ractiveTopFlight.resultList.selectFlight(leg, index, flight);
			
			//console.log(that);
			//ractiveTopFlight.twowaySelectTheFlight(flight);
		}
	});
	

	
});

</script>