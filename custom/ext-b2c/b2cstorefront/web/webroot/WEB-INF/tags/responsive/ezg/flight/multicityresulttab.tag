<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="flight" tagdir="/WEB-INF/tags/responsive/ezg/flight"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ attribute name="flights" required="true"
	type="com.cnk.travelogix.common.facades.product.data.flight.FlightResultData"%>
<%@ attribute name="theTabIndex" required="false"%>
<%@ attribute name="classString" required="false"%>


<li class="${classString } ">
	<ul class="ft_results">
		<li>
			<div class="mB10 clearfix">
				<div class="col_12">
					<flight:multicitycarousel />
				</div>
			</div>
		</li>
		<li class="flightContrHrdr clearfix">
		<span id="multiWayMid${theTabIndex+1 }" class="wayNum sel mR10 fL">${theTabIndex +1 }</span>
		<div id="multiCityResultTitle${theTabIndex}"></div>
			<script id="templateMultiResultTitle${theTabIndex}" type="text/ractive">
				<span class="fL">	
				<span class="fS18"> {{from}} <span class="flight_icon_sml mL5 mR5"></span>{{to}} | {{arrivalTime}}</span>
				</span>
			</script>
			<script type="text/javascript">
			multiCityResultTitle = new Ractive({
				el: '#multiCityResultTitle${theTabIndex}',
				template: '#templateMultiResultTitle${theTabIndex}',
				oninit: function(){
					var index = ${theTabIndex};
					var titleDetails;
					if(index == 0){
						titleDetails = ${flightSection1ViewModel}.twoway;
					}else{
						titleDetails = ${flightSection1ViewModel}.multicity.trips[index - 1];
					}
					this.set('from',titleDetails.from);
					this.set('to',titleDetails.to);
					this.set('arrivalTime',getFormatDateStr(titleDetails.startTime));
				},
				data: {
					from : '',
					to : '',
					arrivalTime: ""
				},
			});
			function getFormatDateStr(dateStr){
				//parse Date
				if(dateStr == ""){
					return " ";
				}
				var date = new Date(dateStr);
				//return formated date string
				return date.getDate() + " " + getMonthName(date) + ", " + getWeekdayName(date);
			}

			function getWeekdayName(date){
				return ["Sun","Mon","Tue","Wed","Thu","Fri","Sat"][date.getDay()];
			}

			function getMonthName(date){
				return ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"][date.getMonth()];
			}
			</script>
		</li>

		<flight:sortedby theTabIndex="${theTabIndex}" />
		<%-- search result Starts --%>
		<%-- 
										<c:forEach items="${flights.listOfFlights}" var="flight" varStatus="stus">
											
												  <flight:onewayflight theFlight="${flight}" isMultiCity="true" theTabIndex="${theTabIndex }" theIndex="${stus.index  + 1}"/>
											
										</c:forEach>
									--%>

		<flight:onewayflightnew isMultiCity="true"
			flights="${bestPriceRecommend}" theTabIndex="${theTabIndex }"
			tagName="allResult" />
		<%-- search result Ends --%>

	</ul>
</li>
