<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="flight" tagdir="/WEB-INF/tags/responsive/ezg/flight"%>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/ezg/cart"%>

<%@ attribute name="flights" required="true" type="com.cnk.travelogix.common.facades.product.data.flight.FlightResultData" %>
<%@ attribute name="theIndex" required="false"  %>
<%@ attribute name="theTabIndex" required="false"  %>
<%@ attribute name="isMultiCity" required="false"  %>
<%@ attribute name="tagName" required="false"  %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="onewayFlight${tagName}${theTabIndex }" > Loading... Please wait
    </div>


<script id="templateOnewayFlight${tagName}${theTabIndex }" type="text/ractive">   
{{#if flights}} 

{{#each flights[theTabIndex].listOfFlights : theIndex}}
	<li class="clearfix mB15" id="${theTabIndex}{{theIndex}}">
			<div class="selflight dN" id="selflight${theTabIndex}{{theIndex}}" >
						<img src="${ezgImagesPath}/custom/black_tick_circle_48x48.png" />
					</div>
			<span class="srp_flightContr">
        			<samp class="go_AI">
		            <span>{{airlineIATA.airlineName}} 
		            <br/>{{airlineIATA.accountingCode}} {{airlineIATA.airlinePrefix}}</span>
		        </samp>
		        <dfn>
		            <strong>
		            
		            <small>{{fromSection.city}}</small>{{displayDepartureTime}}</strong>
		            <ins>
            		<span>{{cabinClass}}</span>{{duration}}</ins>
            		<strong>
            		<small>{{toSection.city}}</small>{{displayArrivalTime}}</strong>
		        </dfn>
		        <span class="priceGrnContr clearfix">
		            <mark class="mR20 bdrRightLightGreen fS12">
			          <%-- fare summary goes here <flight:faresummary fareSummary="<%= (com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData)theFlight.getFareSummary().values().toArray()[0] %>"/> --%>
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
						<%-- fare summary End --%>
		            </mark>
			            <mark>
			                <span class="clearfix dB">
			                	<c:if test="${ isMultiCity }"> 
			                		<%-- <flight:selection theTabIndex="${theTabIndex }" theIndex="{{theIndex }}"  theFlight="${theFlight }"/> --%>
									<span class="dB clearfix mB10"> <a href="javascript:void(0);" on-click="selectTheFlight(theTabIndex, theIndex, flights[theTabIndex].listOfFlights[theIndex])" class="button button-primary fL mB10" >Select</a> 
			                	</c:if>
			                	<c:if test="${! isMultiCity }">
									<%--
				                	<% java.util.List cartFlights = new java.util.ArrayList(); cartFlights.add(theFlight);%>
				                    <cart:addflighttocart flights="<%=cartFlights%>" > <a id="bookFlightId" href="javascript:void(0);" class="button button-primary fL mB10">Book</a> </cart:addflighttocart>
									--%>
									 <span class="dB clearfix mB10"> <a href="javascript:void(0);" on-click="bookFlight([flights[theTabIndex].listOfFlights[theIndex]], contextPath)" class="button button-primary fL mB10" >Book</a> 
			                    </c:if>
			                    <span class="empty_heart fR mT5 mL10"></span>
			                    <span class="share_icon fR mT5"></span>
			                </span>
							<c:if test="${ isMultiCity !=true }"> 
			                	<a href="javascript:void(0);" class="addToCart dB mB5" on-click="addToFlight([flights[theTabIndex].listOfFlights[theIndex]], contextPath)">Add to cart</a>
			                </c:if>
							<a href="javascript:void(0);" class="dB" id="moreDetailsTrigger${tagName}${theTabIndex}{{theIndex}}" onclick="showMoreInfo('moreDetailsTrigger${tagName}${theTabIndex}{{theIndex}}','moreDetailsContainer${tagName}${theTabIndex}{{theIndex}}','plusMinus${tagName}${theTabIndex}{{theIndex}}');">
			                <span id="plusMinus${tagName}${theTabIndex}{{theIndex}}">+</span>Details</a>
			            </mark>
		          </span> 
		      </span>

			<!-- Expanded view-->
            <section class="ft_results detailContr w100pcnt dN" id="moreDetailsContainer${tagName}${theTabIndex}{{theIndex}}">
                <span class="show_contr_close fR" onclick="dismissMoreInfo('moreDetailsTrigger${tagName}${theTabIndex}{{theIndex}}','moreDetailsContainer${tagName}${theTabIndex}{{theIndex}}','plusMinus${tagName}${theTabIndex}{{theIndex}}')"></span>
                <span class="show_contr_Aro"></span>
                <div class="col_6 pR0 pL10 layover clearfix">
                    {{#each flightDetails : theIndex}}
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
                                      <em class="mT10">{{displayArrivalDate}}<br> {{toSection.city}} {{toSection.terminal}} </em>
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
                              {{#if (theIndex < flightDetails.length - 1)}}
                              
                              <span class="layoverBG fL w100pcnt">
                                  <span class="layoverBGTime">Layover {{arrivalTime.hours-departureTime.hours}} hrs 25 min</span>
                              </span>
                              {{/if}}
                              <br class="cB">
                     {{/each}}

                </div>
                
                <%-- fare breakup goes here--%>
				{{# fareDetail[selectdFareType]}}
					<div class="col_3 mT10">
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
                        <div class="col_3 pB10 expandedGrnCont  ">
                            <ul class="flyBG clearfix mB15">
								{{#each fareSummary: i}}
                                <li class="{{ i == 0? 'first' : ''}}"><input type="radio"
                                    checked="{{i == selectdFareType? 'selected': ''}}" on-click="changeFareType(theTabIndex, theIndex, i)"/> <label for="fly2">
										{{type}}</label> <span class="mL30 fS22"><span class="rupee">Rs.
                                    </span>{{webPrice}}</span></li>
								{{/each}}
                                
                            </ul>
                        </div>
					{{/if}}
				{{/fareDetail}}
				<%-- fare breakup End--%>

				<%--
                <flight:farebreak fareDetail="<%= (com.cnk.travelogix.common.facades.product.data.flight.FareDetailData)theFlight.getFareDetail().values().toArray()[0] %>" 
                  isMultiCity="${isMultiCity }" theTabIndex="${theTabIndex }" theIndex="${theIndex }"  theFlight="${theFlight }"/>
                 --%> 
            </section>
		
  </li>      

{{/each}}

{{/if}}

</script>
    
<script type="text/javascript">
var ractiveTopFlight = ractiveTopFlight ? ractiveTopFlight : {};
$(function() {
	ractiveTopFlight.flight${tagName}${theTabIndex} = new FlightBookReactive({
		
		el: '#onewayFlight${tagName}${theTabIndex }',
		template: '#templateOnewayFlight${tagName}${theTabIndex }',
		oninit: function () {
			console.log(this.get('flights'));
		},
		data: {
			'flights' : <c:if test="${tagName == 'bestPrice'}">${bestRecommends}</c:if><c:if test="${tagName == 'allResult'}">${resultList}</c:if>,
			'contextPath': '${encodedContextPath}',
			'theTabIndex' : <c:if test="${empty theTabIndex}">0</c:if><c:if test="${not empty theTabIndex}">${theTabIndex}</c:if>
		},
		
		'changeFareType' : function(tabIndex, index, type){
			var flights = this.get('flights');
			var flight = flights[tabIndex].listOfFlights[index];
			flight.selectdFareType = type;
			this.update();
		},
		'refresh': function(data){
			console.log('airline header click ${tagName}');
			 console.log(data);
			ractiveTopFlight.flight${tagName}${theTabIndex}.set('flights', data);
			ractiveTopFlight.flight${tagName}${theTabIndex}.update();
		},
		
		'selectTheFlight' : function(leg, index, flight){
			console.log(flight);
			ractiveTopFlight.resultList.selectFlight(leg, index, flight);
			
			//console.log(that);
			//ractiveTopFlight.twowaySelectTheFlight(flight);
		}
	});
});

</script>