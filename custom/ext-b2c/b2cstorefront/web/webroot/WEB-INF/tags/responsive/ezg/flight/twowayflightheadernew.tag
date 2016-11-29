<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="flight" tagdir="/WEB-INF/tags/responsive/ezg/flight"%>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/ezg/cart"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="twowayFlightHeader${tagName}" >
    </div>
    
<script id="templateTwowayFlightHeader${tagName}" type="text/ractive">    
	<li class="clearfix mB15"><span class="srp_flightContr">
			{{#depatureFlight.listOfFlights}}
			<samp class="go_AI">
				<span>{{airlineIATA.airlineName}}  <br /> {{airlineIATA.accountingCode}} {{airlineIATA.airlinePrefix}}
				</span>
			</samp> <dfn>
				<strong> <small>{{fromSection.city}}</small>{{displayDepartureTime}}
				</strong>
				<ins></ins>
				<strong> <small>{{toSection.city}}</small>{{displayArrivalTime}}
				</strong>{{duration}} | {{numberOfStops}} | {{cabinClass}}<br> Reaches on 29 July
			</dfn> <span class="addFlight">+</span> 
			{{/depatureFlight}}

			{{#returnFlight.listOfFlights}}
			<samp class="go_AI">
				<span>{{airlineIATA.airlineName}}  <br /> {{airlineIATA.accountingCode}} {{airlineIATA.airlinePrefix}}
				</span>
			</samp> <dfn>
				<strong> <small>{{fromSection.city}}</small>{{displayDepartureTime}}
				</strong>
				<ins></ins>
				<strong> <small>{{toSection.city}}</small>{{displayArrivalTime}}
				</strong>{{duration}} | {{numberOfStops}} | {{cabinClass}}<br> Reaches on 31 July
				
			</dfn> 
			{{/returnFlight}}
			<span class="priceGrnContr clearfix"> 
				<mark class="mR20 bdrRightLightGreen fS12">
				<%-- fare summary goes here
				<% com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData depatureFareSummary = (com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData)depatureFlight.getFareSummary().get(0); 
				   com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData returnFareSummary = (com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData)returnFlight.getFareSummary().get(0);%>
					<flight:twowayfaresummary depatureFareSummary="<%=depatureFareSummary%>" returnFareSummary="<%=returnFareSummary %>"/>
				 --%>	
							{{# fareSummary}}
								<span class="lineThrough">
   							 	<span class="rupee">Rs.</span>{{fareSummary.listPrice}}</span>
    							<span class="mainPrice">
    							<span class="rupee">Rs.</span>{{fareSummary.webPrice}}</span>Save 
    							<span class="rupee">Rs.</span>{{fareSummary.listPrice - fareSummary.webPrice}}
   								<br/>Earn {{fareSummary.pointEarn}} points 
							{{/fareSummary}}
				</mark>
				<mark>
					<span class="clearfix dB"> 
					<%-- Add to cart goes here
						<% java.util.List cartFlights = new java.util.ArrayList(); cartFlights.add(returnFlight); cartFlights.add(depatureFlight);%>
		                    <cart:addflighttocart flights="<%=cartFlights%>" > <a id="bookFlightId" href="javascript:void(0);" class="button button-primary fL mB10">Book</a> </cart:addflighttocart>
					--%>	
						<a href="javascript:void(0);" on-click="bookFlight([depatureFlight.listOfFlights.0, returnFlight.listOfFlights.0], '${encodedContextPath}')" class="button button-primary fL mB10">Book</a>
						<span
						class="empty_heart fR mT5 mL10"></span> 
						<span
						class="share_icon fR mT5"></span>
					</span>
					
					 <a href="javascript:void(0);" class="addToCart dB mB5"
						on-click="addToFlight([depatureFlight.listOfFlights.0, returnFlight.listOfFlights.0], '${encodedContextPath}')">Add to cart</a> <a
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
				{{#each depatureFlight.listOfFlights.0.flightDetails : theIndex}}
    				<samp class="go_AI">
       					 <span class="pT40">{{airlineIATA.airlineName}}
           					 <br/>
            					{{airlineIATA.accountingCode}} {{depatureFlight.airlineIATA.airlinePrefix}}
       					 </span>
    				</samp>
    				<dfn>
       					 <strong>
            				<small>{{fromSection.city}} 
               					 <br>
            						{{fromSection.terminal}} 
                			</small> {{displayDepartureTime}}
                					<br>
                    			<em class="mT10">{{displayDepartureDate}} {{fromSection.city}} {{fromSection.terminal}} </em>
                			</strong>
                		<ins>
                   			<span>{{cabinClass}}</span> {{duration}}
                    			<br>
                        	<span class="fS11">Airbus A380</span>
                    	</ins>
                    	<strong>
                        	<small>{{toSection.city}}
                          	  <br>
           						 {{toSection.terminal}}
                            </small> {{displayArrivalTime}}
                            <br>
                                <em class="mT10">{{displayArrivalDate}} {{toSection.city}} {{toSection.terminal}} </em>
                            </strong>
                      </dfn>
                      {{# services}}
							{{#each services: i}}
								<span class="mB10 mT5 fL clearfix">
									<span class="{{services[i] == '20kg baggage included'? 'baggage_icon mR5 fL': 'food_small fL'}}"></span>
									<span class="fL fS12 w65pcnt">{{services[i]}}</span>
								</span> 
						
							{{/each}}
						{{/ services}}
                        {{#if (theIndex < depatureFlight.listOfFlights.0.flightDetails.length - 1)}}
                        
                        <span class="layoverBG fL w100pcnt">
                            <span class="layoverBGTime">Layover {{layover}} hrs 25 min</span>
                        </span>
                        {{/if}}
                        <br class="cB">
               {{/each}}
					
				</span>
				 <span class="col_6 mTn10"> 
				 	{{#each returnFlight.listOfFlights.0.flightDetails : theIndex}}
    				<samp class="go_AI">
       					 <span class="pT40">{{airlineIATA.airlineName}}
           					 <br/>
            					{{airlineIATA.accountingCode}} {{airlineIATA.airlinePrefix}}
       					 </span>
    				</samp>
    				<dfn>
       					 <strong>
            				<small>{{fromSection.city}} 
               					 <br>
            						{{fromSection.terminal}} 
                			</small> {{displayDepartureTime}}
                					<br>
                    			<em class="mT10">{{displayDepartureDate}}<br> {{fromSection.city}} {{fromSection.terminal}} </em>
                			</strong>
                		<ins>
                   			<span>{{cabinClass}}</span> {{duration}}
                    			<br>
                        	<span class="fS11">Airbus A380</span>
                    	</ins>
                    	<strong>
                        	<small>{{toSection.city}}
                          	  <br>
           						 {{toSection.terminal}} 
                            </small> {{displayArrivalTime}} 
                            <br>
                                <em class="mT10">{{displayArrivalDate}} {{toSection.city}} {{toSection.terminal}} </em>
                            </strong>
                      </dfn>
                      {{# services}}
							{{#each services: i}}
								<span class="mB10 mT5 fL clearfix">
									<span class="{{services[i] == '20kg baggage included'? 'baggage_icon mR5 fL': 'food_small fL'}}"></span>
									<span class="fL fS12 w65pcnt">{{services[i]}}</span>
								</span> 
						
							{{/each}}
						{{/ services}}
                        
                        {{#if (theIndex < returnFlight.listOfFlights.0.flightDetails.length - 1)}}
                        
                        <span class="layoverBG fL w100pcnt">
                            <span class="layoverBGTime">Layover {{layover}} hrs 25 min</span>
                        </span>
                        {{/if}}
                        <br class="cB">
               {{/each}}
			</span>
			</span>
			
			<%-- fare details goes here 
			<div class="col_6 mT20 pR10 pL75">
			<% com.cnk.travelogix.common.facades.product.data.flight.FareDetailData fare1 = (com.cnk.travelogix.common.facades.product.data.flight.FareDetailData)depatureFlight.getFareDetail().get(0); 
			  com.cnk.travelogix.common.facades.product.data.flight.FareDetailData fare2 = (com.cnk.travelogix.common.facades.product.data.flight.FareDetailData)depatureFlight.getFareDetail().get(0); %>
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
			--%>
				{{#fareDetail}}
				<div class="col_6 mT20 pR10 pL75">
						<ul class=" fareBrkup">
							<li class="heading">FARE BREAKUP<span class="rupee fR">Rs</span></li>
							<li>Base fare<span class="fR">{{baseFare}}</span></li>
							<li>Fuel surcharge<span class="fR">{{fuelSurcharge}}</span></li>
							<li>JN Tax<span class="fR">{{jnTax}}</span></li>
							<li>Psgr. Svc. Fee<span class="fR">{{psgrSvcFee}}</span></li>
							<li class="mB25 clearfix">TOTAL<span
								class="fR fS22 fW600 tR">{{total}}<span
									class="fS12 fW400 dB">{{refundable? 'Refundable' : ''}}</span></span></li>
						</ul>
						{{# theServices}}
							{{#each theServices: i}}
								<span class="mB10 mT5 fL clearfix">
									<span class="{{theServices[i] == '20kg baggage included'? 'baggage_icon mR5 fL': 'food_small fL'}}"></span>
									<span class="fL fS12 w65pcnt">{{theServices[i]}}</span>
								</span> 
						
							{{/each}}
						{{/ theServices}}
				</div>
				{{/fareDetail}}
		</section>
</li>

</script>

<script type="text/javascript">
var ractiveTopFlight = ractiveTopFlight ? ractiveTopFlight : {};
$(function() {
	ractiveTopFlight.twowayFlightHeader = new FlightBookReactive({
		
		el: '#twowayFlightHeader${tagName}',
		template: '#templateTwowayFlightHeader${tagName}',
		
		data: {
			'flights' : ${bestRecommends},
			'depatureFlight' : '',
			'returnFlight' : '',
			'fareSummary': '',
			'fareDetail': '',
			'theServices' : ''
		},
		
		'changeFareType' : function(tabIndex, index, type){
			var flights = this.get('flights');
			var flight = flights[tabIndex].listOfFlights[index];
			flight.selectdFareType = type;
			this.update();
		},
		
		
		oninit: function () {
			var flights = this.get('flights');
			if(!flights) return;
			var depatureFlight = flights[0];
			var returnFlight = flights[1];
			
			var fareSummayDeparture, fareSummayReturn;
			var fareDetailDeparture, fareDetailReturn;
			var selectedTypeDeparture=0, selectedTypeReturn=0;
			
			var services;
			
			if(depatureFlight){
				this.set('depatureFlight', depatureFlight);
				fareSummayDeparture = depatureFlight.listOfFlights[0].fareSummary;
				fareDetailDeparture = depatureFlight.listOfFlights[0].fareDetail;
				selectedTypeDeparture = depatureFlight.listOfFlights[0].selectdFareType;
				services = depatureFlight.listOfFlights[0].services;
			}
			if(returnFlight){
				this.set('returnFlight', returnFlight);
				fareSummayReturn = returnFlight.listOfFlights[0].fareSummary;
				fareDetailReturn = returnFlight.listOfFlights[0].fareDetail;
				selectedTypeReturn = returnFlight.listOfFlights[0].selectdFareType;
				services = returnFlight.listOfFlights[0].services;
			}
			var fareSummary = fareSummayDeparture? fareSummayDeparture[selectedTypeDeparture]: false;
			var fareDetail = fareDetailDeparture? fareDetailDeparture[selectedTypeDeparture]: false;
			if(!fareSummary){
				fareSummary = fareSummayReturn? fareSummayReturn[selectedTypeReturn]: false;
				fareDetail = fareDetailReturn? fareDetailReturn[selectedTypeReturn]: false;
			}else if(fareSummary && fareSummayReturn){
				fareSummary.listPrice = 1*(fareSummary.listPrice) + 1*(fareSummayReturn[selectedTypeReturn].listPrice);
				fareSummary.webPrice = 1*(fareSummary.webPrice) + 1*(fareSummayReturn[selectedTypeReturn].webPrice);				
				fareSummary.pointEarn = 1*(fareSummary.pointEarn) + 1*(fareSummayReturn[selectedTypeReturn].pointEarn);
				<%-- for fare break  --%>
				fareDetail.baseFare = 1*(fareDetail.baseFare) + 1*(fareDetailReturn[selectedTypeReturn].baseFare);
				fareDetail.fuelSurcharge = 1*(fareDetail.fuelSurcharge) + 1*(fareDetailReturn[selectedTypeReturn].fuelSurcharge);
				fareDetail.jnTax = 1*(fareDetail.jnTax) + 1*(fareDetailReturn[selectedTypeReturn].jnTax);
				fareDetail.psgrSvcFee = 1*(fareDetail.psgrSvcFee) + 1*(fareDetailReturn[selectedTypeReturn].psgrSvcFee);
				fareDetail.total = fareSummary.webPrice;
				fareDetail.refundable = true;
			}
			
			this.set('fareSummary', fareSummary);
			this.set('fareDetail', fareDetail);
			this.set('theServices', services);
		},
		
		'refresh': function(data){
			this.set('flights', data);
			this.oninit();
		}
	});
	
	
});

</script>						