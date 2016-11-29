
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="flight" tagdir="/WEB-INF/tags/responsive/ezg/flight"%>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/ezg/cart" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
 
 <c:set var="bestPriceRecommend" value="${flightSection2BViewModel.bestPriceRecommend}" /> 
<c:set var="flights" value="${flightSection2BViewModel.result[0]}" />





<div class="col_9 col_sm_12 pR0 pL0_768"> 

      
      <!-- Tabs Begin here-->
      <div id="viewContr1">
        <h4 class=" fS18 mB10 fW600">Best price recommendation</h4>
         <flight:airlineheader />
         
        <div class="mB20">
			<div id="airlineTabResults1">
				<ul class="ft_results twoway">
					<c:if test ="${bestPriceRecommend[0].listOfFlights.size() > 0 && bestPriceRecommend[1].listOfFlights.size() > 0}">
					<flight:twowayflightheadernew />
					
					</c:if>
				</ul>

				<div class="flightPrntContr brdrRGrey pL0">
					<div class="mB10 clearfix pL15 pR15">
						<flight:twowaycarousel fareCarouselMap="${bestPriceRecommend[0].fareCarouselMap}" selectedItemKey="${bestPriceRecommend[0].selectedItemKey}" theIndex="0"/>
						
						<br class="cB">
						<flight:flightresulttitle type="twoway" theIndex = "0"/>
					</div>
					<ul class="ft_results twowaysrc">
						<flight:sortedby isTwoway="ture" theTabIndex="0"/>
<%-- The search result Starts --%>									
						
						<%-- 
						<c:forEach items="${flights[0].listOfFlights}" var="flight" varStatus="stus">
						
								  <flight:twowayflight theFlight="${flight}" theTabIndex ="0" theIndex="${ stus.index+3}"/>
						</c:forEach>
						--%>
						
						<flight:twowayflightnew  theTabIndex ="0" tagName="allResult"/>
<%-- The search result End --%>							
					</ul>
				</div>
				<div class="flightPrntContr pR0">
					<div class="mB10 clearfix pL15 pR15">
						<flight:twowaycarousel fareCarouselMap="${bestPriceRecommend[1].fareCarouselMap}" selectedItemKey="${bestPriceRecommend[1].selectedItemKey}" theIndex="1"/>
						<br class="cB">
						<flight:flightresulttitle type="twoway" theIndex = "1"/>
					</div>
					<ul class="ft_results twowaysrc">
						<flight:sortedby isTwoway="ture" theTabIndex="1"/>
<%-- The search result Starts --%>	
<%-- 				
					<c:forEach items="${flights[1].listOfFlights}" var="flight" varStatus="stus">

		  <flight:twowayflight theFlight="${flight}" theTabIndex ="1" theIndex="${ stus.index+3}"/>
</c:forEach>
--%>	
<%-- The search result Ends --%>
<flight:twowayflightnew  theTabIndex ="1" tagName="allResult"/>		
					</ul>
				</div>
			</div>

<%--   ********delete the mockup airline tabs******** 
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
        <!--Tabs end here-->
       
      </div>
     <div id="viewContr2" class="dN"> 
			<div class=" clearfix">
              <div class="pD10 bkgLitGrn">
                <div class="custom-header fcBlk clearfix header">
                  <div class="custom-month-year tC fS24"> 
				  <span id="custom-month" class="custom-month txtClrWht"></span> 
				  <span id="custom-year" class="custom-year txtClrWht"></span>
                    <nav> <span id="custom-prev" class="custom-prev"></span> <span id="custom-next" class="custom-next"></span> </nav>
                  </div>
                </div>
              </div>
              <div id="calendar" class="fc-calendar-container"></div>
            </div>
	  </div>
	  <div id="viewContr3" class="dN"> 
	 <section class="mB40 tabs" id="selectionTable3">
							<ul class="tabLinks clearfix">
								<li class="sel"><a href="#Leg1">MUMBAI - DELHI</a></li>
								<li><a href="#Leg2">DELHI - MUMBAI </a></li>
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
          <li class="flightHeading clearfix"><span class="fL pL10 tL">Sort By</span><span class="deptTime" style="font-size:14px !important;"><a href="javascript:void(0);" style="margin-left:15px;">Departure</a></span><span class="duration"><a href="javascript:void(0);" class="mL30">Duration</a></span><span class="duration"><a href="#" class="mL40">Arrival</a></span><a href="javascript:void(0);"><span class="totalPrice mL15_pcnt" style="font-size:14px !important;">Price<span class="sortAro_up_icon mL5"></span></span></a> </li>
<%-- The search result Starts --%>		          
          <flight:onewayflightnew isMultiCity = "false" flights="${flights}" tagName="allResult"/>
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
	</div>
						</section>
	  </div>
    </div>
</div> <%-- This </div> is to end the container <div> --%>

  
<!--=== Shopping cart panel ===-->
<script id="templateTwowayResultFlight" type="text/ractive">
  <div class="container">
    <div class="clearfix fcWht pT20 pB20"> <span class="removeCartItem_cross"></span>
      <div class="col_3 pL0 pR0">
        <div class="addFlight_ActionPnl " id="addSFlight">Add departure flight</div>
     {{#selectedFlights.0}}   
        <div id="selectContainer1" class="p26pcnt fL">

			<span class="fL mR10">
                        <img class="mB5" alt="{{flightAirlineName}}" src="${ezgImagesPath}/srp_flight/indigo_sml_logo.jpg"/>
                        <span class="fS12 fcWht dB"> {{flightAirlineName}} </span>
                    </span>
                    <span class="clearfix fL mTN5 dB">
                        <span class="clearfix dB">
                            <span class="fcWht fL TrvLocation">   {{flightFrom}} <br/> {{displayDepartureTime}} </span>
                            <span class="flight_icon_sml fL mTB2LR10"></span>
                            
							<span class="fcWht fL TrvLocation">  {{flightTo}} <br/> {{displayArrivalTime}} </span>
                        </span>
                        <span class="fS11 fcWht dB"> {{duration}} </span>
						<span class="fS11 fcWht dB"> Reaches {{displayArrivalDate}} </span>
                    </span>
 

		</div>
        
		<span class="mR45 fR"><img src="${ezgImagesPath}/bin.png" alt="" id="dirImg" class="" on-click="deleteFlight(0)" /></span>
{{/selectedFlights.0}}
      </div>
      <div class="col_1 w5pcnt_imp pT10 pR10 pL10 pB10"> <br/>
				<span class="fW600 fS30 mT20">+</span>
      </div>
      <div class="col_3 pL0 pR0">
        <div id="addRFlight" class="addFlight_ActionPnl ">Add return flight</div>
{{#selectedFlights.1}}        
        <div id="selectContainer2" class="p26pcnt fL">

			<span class="fL mR10">
                        <img class="mB5" alt="{{flightAirlineName}}" src="${ezgImagesPath}/srp_flight/indigo_sml_logo.jpg"/>
                        <span class="fS12 fcWht dB"> {{flightAirlineName}} </span>
                    </span>
                    <span class="clearfix fL mTN5 dB">
                        <span class="clearfix dB">
                            <span class="fcWht fL TrvLocation">   {{flightFrom}} <br/> {{displayDepartureTime}} </span>
                            <span class="flight_icon_sml fL mTB2LR10"></span>
                            
							<span class="fcWht fL TrvLocation">  {{flightTo}} <br/> {{displayArrivalTime}} </span>
                        </span>
                        <span class="fS11 fcWht dB"> {{duration}} </span>
						<span class="fS11 fcWht dB"> Reaches {{displayArrivalDate}} </span>
                    </span>

		</div>
        
		<span class="mR45 fR"><img src="${ezgImagesPath}/bin.png" alt="" id="dirImg2" class="{{ selectedFlights.1 == null? 'dN' : ''}}" on-click="deleteFlight(1)" /></span>
{{/selectedFlights.1}} 
      </div>
{{# selectedFlights.0  }}
{{# selectedFlights.1  }}
      <div id="priceBox" class="fL mL20 mTN5 col_2 "><span>Total Price:</span><br>
        <h4 class="mB5"><span class="rupee">Rs</span><span class="fW600" id="compPrice">{{selectedFlights.1.flightPrice *1 + 1* selectedFlights.0.flightPrice}}</span></h4></div>
{{/selectedFlights.1}}
{{/selectedFlights.0}}
      <div id="selectBooking" class="col_2 pL0 clearfix pR0 "> 
		<span class="dB clearfix mB5"> <a class="button button-primary fL mR10" href="javascript:void(0);" on-click="bookFlight()">Book</a>
	 	<span class="share_icon fL mT5"></span> </span> 
		<span class="fW500 fS12 mT10 fL"><a href="javascript:void(0)" class="fcWht" id="compare_price">Compare with best price</a></span>
		<span class="fW500 fS12 mT10 fL"><a href="javascript:void(0)" class="fcWht">Add to cart</a></span> </div>
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
			'legs' : ${fn:length(flightSection2BViewModel.result)},
			'selectedFlights' : new Array( ${fn:length(flightSection2BViewModel.result)} ),
			'contextPath': '${encodedContextPath}'
		},
		selectFlight: function (leg, index, flight) {
			//console.log([index, this.el, this.get('history.section2BDataModel.result.' + index)]);
			$(this.el).show();
			console.log(leg);
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
			 		duration			 :  flight.duration,
			 		displayArrivalDate   :  flight.displayArrivalDate
			 }
			
			var selectedFlights = this.get('selectedFlights');
			
			var toReplaceFlight = selectedFlights.splice(leg, 1, flightModel);
			
			this.update();
			setSelection(leg, index, toReplaceFlight)
			showOrHideBookBtn(selectedFlights);
			
			/* f(!isDeparuteFlight){
				'selectedFlights';
			} */
			
		},
		
		deleteFlight: function(index){
			var selectedFlights = this.get('selectedFlights');
			var toReplaceFlight = selectedFlights.splice(index, 1, null);
			

			deleteSelection(index, toReplaceFlight);
			showOrHideBookBtn(selectedFlights);
		},

		
	});
	function deleteSelection(leg, toReplaceFlight){
		var flightBlankId = leg ==0? 'addSFlight' : 'addRFlight';
		$('#'+flightBlankId).show();
		var flightModel = toReplaceFlight[0];
		if(flightModel){
			$('#selflight'+leg+flightModel.flightIndex).addClass('dN');
			console.log($('#selflight'+leg+flightModel.flightIndex));
		}
	}
	function setSelection(leg, index, toReplaceFlight){
		var flightModel = toReplaceFlight[0];
		
		$('#selflight'+leg+index).removeClass('dN');
		
		var flightBlankId = leg ==0? 'addSFlight' : 'addRFlight';
		$('#'+flightBlankId).hide();
		
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
</script>