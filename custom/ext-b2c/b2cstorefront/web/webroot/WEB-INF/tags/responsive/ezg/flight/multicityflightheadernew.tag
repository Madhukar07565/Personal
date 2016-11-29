<%@ tag language="java" pageEncoding="UTF-8"%>


<div id="multicityFlightHeader" >
    </div>

<script id="multicityFlightHeaderTemplate" type="text/ractive">     
<ul id="testmulty"
									class="first-and-second-carousel jcarousel-skin-flightRecomd ">
{{#each flights : theIndex}} 

{{#each listOfFlights }}  
    <li>
		<samp class="go_AI" style="width: 20%">
            <span>{{airlineIATA.airlineName}} 
            <br/>{{airlineIATA.accountingCode}} {{airlineIATA.airlinePrefix}}</span>
        </samp>
        <dfn style="width: 60%">
        	<span class="wayNum" id="multiWayTop{{theIndex+1}}">{{theIndex+1}}</span> <br />
            <strong>
            
            <small>{{fromSection.city}}</small>{{displayDepartureTime}}</strong>
            <ins></ins>
            
            <strong>
            <small>{{toSection.city}}</small>{{displayArrivalTime}}</strong>
            {{duration}}  <br> 
        </dfn>
	</li>
												
{{/each}}

{{/each}}												
</ul>
</script>	
											
<script type="text/javascript">
var ractiveTopFlight = ractiveTopFlight ? ractiveTopFlight : {};
$(function() {
	ractiveTopFlight.flightMulticityHeader = new Ractive({
		
		el: '#multicityFlightHeader',
		template: '#multicityFlightHeaderTemplate',
		oninit: function () {
			console.log(this.get('flights'));
			
		},
		data: {
			'flights' : ${bestRecommends},
			
		},
		'changeFareType' : function(tabIndex, index, type){
			var flights = this.get('flights');
			var flight = flights[tabIndex].listOfFlights[index];
			flight.selectdFareType = type;
			this.update();
		},
		
		'refresh' : function(data){
			this.set('flights', data);
		}
	});
	
	
});



</script>									