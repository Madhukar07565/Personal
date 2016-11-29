<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="flight" tagdir="/WEB-INF/tags/responsive/ezg/flight"%>

 <c:set var="bestPriceRecommend" value="${flightSection2BViewModel.bestPriceRecommend}" /> 
<c:set var="flights" value="${flightSection2BViewModel.result}" />

<section class="col_9 col_sm_12 pR0 pL0_768"> 
      
     
      <div id="viewContr1">
        <h4 class=" fS18 mB10 fW600">Best price recommendation</h4>
        <flight:airlineheader />
        </ul>
        <div class="mB20">
			<div id="airlineTabResults1" >
				<ul class="ft_results twoway">
					<li class="clearfix mB15">
						<div class="srp_flightContr grey_border clearfix"
							style="display: block">
							<div style="width: 64%; float: left">
								
									
									<%-- 
										<c:forEach items="${bestPriceRecommend}" var="flightResultData" varStatus="stus">
										<li>
											<c:if test ="${flightResultData.listOfFlights.size() > 0 }">
												<flight:multicityflightheader theFlight="${flightResultData.listOfFlights[0]}" theTabIndex="${ stus.index+1}"/>
											</c:if>	
											
											<c:if test="${not stus.last}">													
												<span class="addFlight">+</span>
											</c:if>
											</li>
										</c:forEach>
										--%>
									
									
								<div id="multicityFlightHeader${tagName}" >
    </div>
        

									<div id="multicityFlightHeader${tagName}" >
    </div>

<flight:multicityflightheadernew/>

              
              
								

							</div>
							<%-- fare summary go here --%>
							<flight:multicityfaresummary></flight:multicityfaresummary>
						</div>

					</li>

				</ul>

				<!--Tabs end here-->
				<div class="row pL20 posR">
					<div class="ovrFH mR20">
						<ul id="slider">
<%--the multi city search reuslt Starts--%>
<%-- *** TODO: use the loop correctly --%>	
					
						<c:forEach items="${flights}" var="flight" varStatus="stus">
							
								<c:if test="${stus.first}"><flight:multicityresulttab flights="${flight}" theTabIndex="${stus.index }" classString="first"></flight:multicityresulttab></c:if>
								<c:if test="${stus.last}"><flight:multicityresulttab flights="${flight}" theTabIndex="${stus.index }" classString="last"></flight:multicityresulttab></c:if>
								<c:if test="${(not stus.last) && (not stus.first)}"><flight:multicityresulttab flights="${flight}" theTabIndex="${stus.index }" classString=""></flight:multicityresulttab></c:if>
							
						</c:forEach>	
<%--the multi city search reuslt Ends--%>						
							
						</ul>
					</div>
				</div>
			</div>
			
<%-- delete the tabs 
			<div  id="airlineTabResults2" class="dN">
			  <ul  class="ft_results  pD10 brdrGry">
				<li>New Tab Content </li>
			  </ul>
			</div>
			<div  id="airlineTabResults3" class="dN">
			  <ul  class="ft_results  pD10 brdrGry">
				<li>New Tab Content </li>
			  </ul>
			</div>
			<div  id="airlineTabResults4" class="dN">
			  <ul  class="ft_results  pD10 brdrGry">
				<li>New Tab Content </li>
			  </ul>
			</div>
			<div  id="airlineTabResults5" class="dN">
			  <ul  class="ft_results  pD10 brdrGry">
				<li>New Tab Content </li>
			  </ul>
			</div>
			<div  id="airlineTabResults6" class="dN">
			  <ul  class="ft_results  pD10 brdrGry">
				<li>New Tab Content </li>
			  </ul>
			</div>
			<div  id="airlineTabResults7" class="dN">
			  <ul  class="ft_results  pD10 brdrGry">
				<li>New Tab Content </li>
			  </ul>
			</div>
--%>			
        </div>
       
    </div>
        <div id="viewContr2" class="dN"> 
		<section class="mB40 tabs" id="selectionTable3">
							<ul class="tabLinks clearfix">
								<li class="sel"><a href="#Leg1">Leg1</a></li>
								<li><a href="#Leg2">Leg2</a></li>
								<li><a href="#Leg3">Leg3</a></li>
								<li><a href="#Leg4">Leg4</a></li>
							</ul>
	<div class="tabsContent">
		<article class="tabContainer clearfix" id="Leg1"> 
		<div class="col_12 clearfix">
				<div id="oneWayOnwardFare" class="pD10 clearfix">
				<div class=" col_2 pL0 pR0 mB20">
                  <div class="tblHrdrDiv tC matfliterAll"><a href="javascript:void(0)">All</a></div>
                  <div class="tblCellDiv firstCol tL">00.00 - 06.00</div>
                  <div class="tblCellDiv firstCol tL">02.00 - 12.00</div>
                  <div class="tblCellDiv firstCol tL">12.00 - 18.00</div>
                  <div class="tblCellDiv firstCol last tL">18.00 - 24.00</div>
                </div>
                <div class="col_10 pL0 pR0 mB20" >
<%-- The Onward fare table result Starts --%>	                
               		<flight:onwardfaretable/>
<%-- The Onward fare table Ends --%>	
                </div>
				<div class="cB clearfix"></div>
				<ul class="ft_results">
          <li class="flightHeading clearfix"><span class="fL pL10 tL">Sort By</span><span class="deptTime" style="font-size:14px !important;"><a href="javascript:void(0);" style="margin-left:15px;">Departure</a></span><span class="duration"><a href="javascript:void(0);" class="mL30">Duration</a></span><span class="duration"><a href="#" class="mL30">Arrival</a></span><a href="javascript:void(0);"><span class="totalPrice mL15_pcnt" style="font-size:14px !important;">Price<span class="sortAro_up_icon mL5"></span></span></a> </li>
<%-- The search result Starts --%>		          
          <flight:onewayflightnew isMultiCity = "false" flights="${flights[0]}" tagName="allResult"/>
<%-- The search result Ends --%>
        </ul>
					</div>
					 <div id="oneWayReturnFare" class="grey_border pD10 clearfix dN"> Return fare goes here </div>
				</div>
		</article>
			<!-- hotels tab End  -->
			<article class="tabContainer pD20 dN" id="Leg2">
			Leg 2 fare goes here 
			</article>
			<article class="tabContainer pD20 dN" id="Leg3">
			Leg 3 fare goes here 
			</article>
			<article class="tabContainer pD20 dN" id="Leg4">
			Leg 4 fare goes here 
			</article>
	</div>
						</section>
		
		
		</div>
    </section>

</div> <%-- This </div> is to end the container <div> --%>
    <!--=== Shopping cart panel ===-->
<!--=== Shopping cart panel ===-->
<script id="templateTwowayResultFlight" type="text/ractive">
  <div class="container">
    <div class="col_9 main_carousels mB10 fcWht pT20 pB20"> <span class="removeCartItem_cross"></span>
      
<ul id="mycarousel2" class="first-and-second-carousel jcarousel-skin-eurail">
 {{#selectedFlights: selectIndex}}
	<li id="selectFlightLeg1" class="jcarousel-item jcarousel-item-horizontal jcarousel-item-{{selectIndex+1}} jcarousel-item-{{selectIndex+1}}-horizontal" jcarouselindex="{{selectIndex}}" style="float: left; list-style: none;">
		{{#!flightAirlineName}}
		<div id="addFlightLeg{{selectIndex}}" class="addFlight_ActionPnl">Add leg {{selectIndex+1}}</div>
		{{/flightAirlineName}}
	
{{#flightAirlineName}}
		  <span class="wayNum mR10 fL sel" id="multiWayBtm{{selectIndex + 1}}">{{selectIndex + 1}}</span>
		  
{{#if  selectIndex != (selectedFlights.length-1)}}
		    <span class="fW600 fS30 mT20 fR">+</span>
{{/if}}
		 <%--<div class=" w5pcnt_imp  fR  ">--%>
		   <%-- <br> --%>

		  <div class="fL fS12 w72pcnt">
		    <span class="fL mR10">
		      <img src="${ezgImagesPath}/srp_flight/indigo_sml_logo.jpg" class="mB5" alt="Air India Logo">
		      <span class="fS12 fcWht dB">{{flightAirlineName}} {{flightNumber}}</span></span>
		    <span class="clearfix fL dB"> <%-- mTN5 --%>
		      <span class="clearfix dB">
		        <span class="fcWht fL ">{{flightFrom}}
		          <br>{{displayDepartureTime}}</span>
		        <span class="flight_icon_sml fL mTB2LR10"></span>
		        <span class="fcWht fL ">{{flightTo}}
		          <br>{{displayArrivalTime}}</span>
			 </span>
		      <span class="fS11 fcWht dB">{{displayDuration}}</span>
		      <span class="fS11 fcWht dB">{{displayNumberOfStops}}</span></span>
		    <span class="mT5 fR cB">
		      <img src="${ezgImagesPath}/bin.png" alt="delete" on-click="deleteFlight(selectIndex)"></span>
		  </div>

{{/flightAirlineName}}		

	</li>
{{/selectedFlights}}   

</ul>
   </div>

      <div class="fL col_3 pL0 pR0 pT20 pB20 fcWht">
      <div class="fL w50pcnt" id="priceBox"><span>Total Price:</span><br><span class="fL mR5 fS18"><span class="rupee">Rs</span></span> <h4 id="totalFare" class="mB10 fL">{{totalPrice}}</h4></div>
      <div class="fL" id="selectBooking" > <span class="clearfix dB"> <a class="button button-primary fL mB10" href="javascript:void(0);" on-click="bookSelectedFlights()">Book</a> <span class=" share_icon fR mT5 mL10"></span> </span> <a class="dB fcWht" href="javascript:void(0);"> Add to cart</a></div>
    </div>
 
    <a href="javascript:void(0);" onclick="closeSelectedPanel('shopping_cart_panel')"><span class="close_thumbnail_grey m0"></span></a> 
</div>

</script>
<script type="text/javascript">
var ractiveTopFlight = ractiveTopFlight ? ractiveTopFlight : {};
	$(function() {
		
		ractiveTopFlight.resultList = new FlightBookReactive({
		el: '#shopping_cart_panel',
		template: '#templateTwowayResultFlight',
		oninit: function () {
			if (!$('#shopping_cart_panel').exists()) {
				$('<div id="shopping_cart_panel" class="dN"></div>').appendTo("body");
			}
		},
		data: {
			'currentLeg': 0,
			'totalPrice': 0,
			'legs' : ${fn:length(flightSection2BViewModel.result)},
			'selectedFlights' : new Array( ${fn:length(flightSection2BViewModel.result)} ),
			'prevButton': '${ezgImagesPath}/common/btn_aro_prev.png',
			'nextButton': '${ezgImagesPath}/common/btn_aro_next.png'
		},
		selectFlight: function (leg, index, flight) {
			//console.log([index, this.el, this.get('history.section2BDataModel.result.' + index)]);
			
			
			var flightModel = { id :  flight.id,
					flightFrom 			 :  flight.fromSection.city,
					flightTo			 :  flight.toSection.city,
					flightDepartureTime  :  flight.departureTime,
					flightArraivalTime   :  flight.arraivalTime,
					flightDescription    :  flight.fromSection.city+flight.toSection.city+flight.departureTime,
					flightAirlineName    :  flight.airlineIATA.airlineName,
					flightAirlineUrl     :  flight.airlineIATA.airlineName,
					flightIndex          :  index,
					flightPrice          :  flight.fareSummary[flight.selectdFareType].webPrice,
			        selectdFareType      :  flight.selectdFareType,
			 		displayDepartureTime :  flight.displayDepartureTime,   
			 		displayArrivalTime   :  flight.displayArrivalTime,
			 		flightNumber         :  flight.flightNumber,
			 		displayDuration      :  flight.displayDuration,
			 		displayNumberOfStops :  flight.displayNumberOfStops
			};
			
			var selectedFlights = this.get('selectedFlights');
			var totalPrice = this.get('totalPrice');
			totalPrice += 1* flightModel.flightPrice;
			
			var toReplaceFlight = selectedFlights.splice(leg, 1, flightModel);
			if(toReplaceFlight[0]){
				totalPrice = totalPrice - toReplaceFlight[0].flightPrice;
			}
			this.set('totalPrice', totalPrice);
			this.update();
			setSelection(leg, index, toReplaceFlight)
			showOrHideBookBtn(selectedFlights);
			$(this.el).show();
			/* f(!isDeparuteFlight){
				'selectedFlights';
			} */
			
		},
		
		deleteFlight: function(index){
			console.log(index);
			var selectedFlights = this.get('selectedFlights');
			var toReplaceFlight = selectedFlights.splice(index, 1, null);
			
			if(toReplaceFlight){
				var totalPrice = this.get('totalPrice');
				totalPrice = totalPrice - toReplaceFlight[0].flightPrice;
				console.log('totalPrice = ' + totalPrice);
				this.set('totalPrice', totalPrice? totalPrice: 0);
			}
			deleteSelection(index, toReplaceFlight);
			showOrHideBookBtn(selectedFlights);
		},
		bookSelectedFlights : function(){
			this.bookFlight(this.get('selectedFlights'), '${encodedContextPath}');
			//this.bookFlight();
		}
		
	});
	function deleteSelection(leg, toReplaceFlight){
		/* var flightBlankId = leg ==0? 'addSFlight' : 'addRFlight';
		$('#'+flightBlankId).show(); */
		
		var flightModel = toReplaceFlight[0];
		console.log($('#selflight'+leg+flightModel.flightIndex));
		if(flightModel){
			$('#selflight'+leg+flightModel.flightIndex).addClass('dN');
			console.log($('#selflight'+leg+flightModel.flightIndex));
		}
	}
	function setSelection(leg, index, toReplaceFlight){
		var flightModel = toReplaceFlight[0];
		
		$('#selflight'+leg+index).removeClass('dN');
		
		//$('#addFlightLeg'+leg).hide();
		
		if(flightModel){
			$('#selflight'+leg+flightModel.flightIndex).addClass('dN');
		}
		
	
	}
	function showOrHideBookBtn(selectedFlights){
		var shouldShow = true;
		var selected = 0;
		$.each(selectedFlights, function(i, e){
			if(!e){
				shouldShow = false;
				
			}else{
				selected++;
			}		
		});
		
		if(shouldShow){
			$('#selectBooking').show();
		}else{
			$('#selectBooking').hide();
		}
		
		$('#cartCount').text(selected);
	}
	
	
});
	$(document).load(function(){
		alert('done');
	});
	
</script>
<!--=== End Shopping cart panel===--> 