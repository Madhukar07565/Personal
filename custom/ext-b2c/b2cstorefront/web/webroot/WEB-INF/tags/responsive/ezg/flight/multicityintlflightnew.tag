<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ attribute name="flights" required="true" type="java.util.List" %>
<%@ attribute name="tagName" required="false"  %>

<div id="multicityIntlFlight${tagName}" > Loading... Please wait
</div>

<script id="templateMulticityIntlFlight${tagName}" type="text/ractive">
{{#flights : groupIndex}}
<li class="clearfix mB15">
  	<div class="srp_flightContr">
	{{#listOfFlights : flightIndex}}
		{{#if flightIndex == 0}}
			<span>
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
			  </span>
			
			<span id="span_fareBook${tagName}" class="priceGrnContr w40pcnt_imp  clearfix">
			<mark class="mR20 bdrRightLightGreen fS12">
				{{#if fareSummary.length>1}}
					<select class="smallDropdown mB10" value={{selectdFareType}} >
						{{#each fareSummary: optionIndex}}
               				<option value='{{optionIndex}}' {{optionIndex== selectdFareType? 'selected': ''}} >{{type}}</option>
						{{/each}}	 	
              		</select>
				{{/if}}
				{{#fareSummary[0]}}
					<span class="lineThrough"><span class="rupee">Rs. </span>{{listPrice}}</span>
					<span class="mainPrice"><span class="rupee">Rs. </span>{{webPrice}}</span>
					Save 
					<span class="rupee">Rs. </span>{{listPrice - webPrice}}<br>
			  		Earn {{pointEarn}} points
				{{/fareSummary}}
			</mark>
			<mark>
				<span class="clearfix dB">
					<a href="javascript:void(0);" class="button button-primary fL mB10">Book</a> 
					<span class="empty_heart fR mT5 mL10"></span> 
					<span class="share_icon fR mT5"></span> 
				</span> 
				<a href="javascript:void(0);" class="addToCart dB mB5" onClick="addOneWayFlight(11)">Add to cart</a> 
				<a href="javascript:void(0);" class="dB" id="moreDetailsTrigger${tagName}{{groupIndex}}"  onclick="showMoreInfo('moreDetailsTrigger${tagName}{{groupIndex}}','moreDetailsContainer${tagName}{{groupIndex}}','plusMinus${tagName}{{groupIndex}}');"><span id="plusMinus${tagName}{{groupIndex}}">+</span> Details</a> 
			</mark>
			</span> 
		{{else}}
			<div class="clearfix cB">
			  <span>
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
			  </span>
			  <span id="span_padding${tagName}{{groupIndex}}{{flightIndex}}" class="priceGrnContr w40pcnt_imp  clearfix" style="background:#a5ebdf;"></span>
			 </div> 
		{{/if}}
	{{/listOfFlights}}
	</div>	

	<!-- Expanded view-->
		<section class="ft_results detailContr w100pcnt dN" id="moreDetailsContainer${tagName}{{groupIndex}}"> <span class="show_contr_close fR" onclick="dismissMoreInfo('moreDetailsTrigger${tagName}{{groupIndex}}','moreDetailsContainer${tagName}{{groupIndex}}','plusMinus${tagName}{{groupIndex}}')"></span> 
		  <div class="col_6 pR0 pL10 layover clearfix"> 
		  		{{#listOfFlights : flightIndex}}
		  			{{#flightDetails : flightDetailIndex}}
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
	                    			<em class="mT10">{{departureTime}} {{fromSection.city}} {{fromSection.terminal}} </em>
	                			</strong>
	                		<ins>
	                   			<span>{{cabinClass}}</span> {{duration}}
	                    			<br>
	                        	<span class="fS11">{{cabinClass}}</span>
	                    	</ins>
	                    	<strong>
	                        	<small>{{toSection.city}}
	                          	  <br>
	           						 {{toSection.terminal}} 
	                            </small> {{displayArrivalTime}} 
	                            <br>
	                                <em class="mT10">{{arrivalTime}} {{toSection.city}} {{toSection.terminal}} </em>
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
                          {{#if ((flightIndex < flights[groupIndex].listOfFlights.length - 1) || (flightDetailIndex < flights[groupIndex].listOfFlights[flightIndex].flightDetails.length - 1)) }}
		                      <span class="layoverBG fL w100pcnt">
		                      		<span class="layoverBGTime">Layover {{layover}}</span>
		                      </span>
                          {{/if}}
                          <br class="cB">
		  			{{/flightDetails}}
				{{/listOfflights}}	
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
{{/flights}}
</script>

<script type="text/javascript">
var ractiveTopFlight = ractiveTopFlight ? ractiveTopFlight : {};
$(function() {
	ractiveTopFlight.multicityIntlflight${tagName}${theTabIndex} = new FlightBookReactive({
		el : '#multicityIntlFlight${tagName}${theIndex}',
		template : '#templateMulticityIntlFlight${tagName}${theIndex}',
		data : {
			'flights' : <c:if test="${tagName == 'bestPrice'}">${bestRecommends}</c:if><c:if test="${tagName == 'allResult'}">${resultList}</c:if>,
			'contextPath': '${encodedContextPath}',
			'theTabIndex' : <c:if test="${empty theTabIndex}">0</c:if><c:if test="${not empty theTabIndex}">${theTabIndex}</c:if>,
			'tagName' : '${tagName}',
			'fareSummarys' : []
		},
		oninit : function(){
			console.log('flights:',this.get('flights'));
			this.setFareSummarys();
		},
		oncomplete : function(){
			var span_height = $('span#span_fareBook${tagName}').first().outerHeight();
			console.log('span#span_fareBook${tagName}',span_height);
			$('span[id^="span_padding${tagName}"]').css('height',span_height);
		},
		'addUpFareSummary' : function(target,source){
			target.listPrice += source.listPrice;
			target.pointEarn += source.pointEarn;
			target.webPrice += source.webPrice;
		},
		'setFareSummarys' : function(){
			console.log(this.get('flights')[1]);
			var flightGroups = this.get('flights');
			fareSummary = [];
			for(var groupIndex in flightGroups){
				var listOfFlights = flightGroups[groupIndex].listOfFlights;
				//console.log('listOfFlights'+groupIndex,flightGroups[groupIndex]);
				//var fareSummary = [];
				for(var flightIndex in listOfFlights){
					console.log("flight"+groupIndex+''+flightIndex,listOfFlights[flightIndex]);
					var fareSummary = listOfFlights[flightIndex].fareSummary;
					
					if(flightIndex == 0){
						this.get('fareSummarys').push(fareSummary);
					}else{
						for(var summaryIndex in fareSummary){
							
						}
					}
				}
			}
		}
	});
});

</script>