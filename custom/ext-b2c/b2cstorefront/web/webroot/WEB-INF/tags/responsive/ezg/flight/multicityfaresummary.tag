<%@ tag language="java" pageEncoding="UTF-8"%>


<div id="multicityFlightFareSummary" >
    </div>
  
 <script id="multicityFlightFareSummaryTemplate" type="text/ractive">    
    {{#fareSummary}}
						<div class="priceGrnContr  clearfix ">
								<mark class="mR20 bdrRightLightGreen fS12">
									<span class="lineThrough">
									<span class="rupee">Rs.
									</span>{{listPrice}}</span>
									<span class="mainPrice"><span class="rupee">Rs.
									</span>{{webPrice}}</span>Save 
									<span class="rupee">Rs. </span>{{listPrice - webPrice}}<br> Earn {{pointEarn}}
									points
								</mark>
								<mark>
									<span class="clearfix dB"> 
										<a href="javascript:void(0);"
										class="button button-primary fL mB10" on-click="bookMultiFlight()">Book</a>
										
										 <span
										class="empty_heart fR mT5 mL10"></span> <span
										class="share_icon fR mT5"></span>
									</span> <a href="javascript:void(0);" class="addToCart dB mB5"
										on-click="addMultiFlight()">Add to cart</a> <a
										href="javascript:void(0);" class="dB"><span>+</span>
										Details</a>
								</mark>
							</div>
	{{/fareSummary}}	
					
</script>

<script type="text/javascript">
var ractiveTopFlight = ractiveTopFlight ? ractiveTopFlight : {};
$(function() {
	ractiveTopFlight.flightMulticityFareSummary = new FlightBookReactive({
		
		el: '#multicityFlightFareSummary',
		template: '#multicityFlightFareSummaryTemplate',
		oninit: function () {
			console.log('gtrhtwrgrewgrwgrwegrewgrew');
			var flights = this.get('flights');
			var fareSummary = {listPrice : 0, webPrice : 0, pointEarn : 0};
			for(var i = 0; i < flights.length; i++){
				var flightDatas = flights[i].listOfFlights;
				for(var j = 0; j < flightDatas.length; j++){
					if(flightDatas[j]){
						if(flightDatas[j].fareSummary[flightDatas[j].selectdFareType]){
						fareSummary.listPrice += 1 * flightDatas[j].fareSummary[flightDatas[j].selectdFareType].listPrice;
						console.log(1 * flightDatas[j].fareSummary[flightDatas[j].selectdFareType].listPrice);
						fareSummary.webPrice += 1 * flightDatas[j].fareSummary[flightDatas[j].selectdFareType].webPrice;
						console.log(1 * flightDatas[j].fareSummary[flightDatas[j].selectdFareType].webPrice);
						fareSummary.pointEarn += 1 * flightDatas[j].fareSummary[flightDatas[j].selectdFareType].pointEarn;
						}
					}
				}
			}
			this.set('fareSummary', fareSummary);
			this.update();
		},
		data: {
			'flights' : ${bestRecommends},
			'fareSummary' : ''
		},
		'changeFareType' : function(tabIndex, index, type){
			var flights = this.get('flights');
			var flight = flights[tabIndex].listOfFlights[index];
			flight.selectdFareType = type;
			this.update();
		},
		
		'refresh' : function(data){
			this.set('flights', data);
			this.oninit();
		},
		
		'bookMultiFlight' : function(){
			var flights = this.get('flights');
			var fareSummary = {listPrice : 0, webPrice : 0, pointEarn : 0};
			var selectedFlights = new Array();
			for(var i = 0; i < flights.length; i++){
				var flightDatas = flights[i].listOfFlights;
				for(var j = 0; j < flightDatas.length; j++){
					if(flightDatas[j]){
						selectedFlights.push(flightDatas[j]);
					}
					
				}
			}
			this.bookFlight(selectedFlights, '${encodedContextPath}');
		},
		addMultiFlight: function(){
			var flights = this.get('flights');
			var fareSummary = {listPrice : 0, webPrice : 0, pointEarn : 0};
			var selectedFlights = new Array();
			for(var i = 0; i < flights.length; i++){
				var flightDatas = flights[i].listOfFlights;
				for(var j = 0; j < flightDatas.length; j++){
					if(flightDatas[j]){
						selectedFlights.push(flightDatas[j]);
					}
					
				}
			}
			this.addToFlight(selectedFlights, '${encodedContextPath}');
		}
		
	});
	
});



</script>								