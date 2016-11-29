<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<section class="routes container clearfix mT50">
	<h2>
		POPULAR/FEATURED FLIGHT ROUTES FOR TRAVELLER LIKE #YOU
		<!-- <a
			href="javascript:void(0);"
			onclick="popupwin('traveller_type', 'black_overlay','fade')">#YOU</a> -->
	</h2>
		<c:forEach items="${popularFlight}" var="flight" varStatus="status">
			<c:if test="${status.index %3 ==0}">
				<div class="col_12 col_sm_12 pL0 pR0">
			</c:if>
				<section class="col_4 pL0 pR0 clearfix">
					<div class="clearfix  col_12 grey_border mT15 pL0 pR0 " style="background: #F4F4F4;">
						<div class="col_4">
							<h2 class="fW600 mT15" style="text-align: center;">
								${flight.day}
								<br> 
								<span class="fW500" style="text-align: center;">${flight.month}</span>
							</h2>
						</div>
						<div class="col_8 pricesrp">
							<h4 class="fR">${flight.fromSector} - ${flight.toSector}</h4>
							<br>
							<p class="fR">
								<span class="rupee">Rs. </span>${flight.webPrice}<br> <span
									class="strikeOut"><span class="rupee">Rs.</span>${flight.listPrice}</span><br>
								<span>
								<a href="###" data-from="${flight.fromSector}" 
											  data-to="${flight.toSector}" 
											  data-flighttype="${flight.flightType}" 
											  data-starttime="${flight.departureTime}"
											  data-endtime="${flight.returnTime}"
											  class="moreFlight moreFlights">${flight.totalBook} more flights</a>
								</span>
							</p>
						</div>
					</div>
				</section>
				<c:if test="${status.index % 3 == 2 }"></div></c:if>
		</c:forEach>
</section>


<script type="text/javascript">
$(function(){
	$(".moreFlights").click(function(){
        var url = "${encodedContextPath}/search/flight/oneway";
        var method = "post";
		var from = $(this).data("from");
		var to = $(this).data("to");
		var startTime = $(this).data("starttime");
		var endTime = $(this).data("endtime");
		var flightType = $(this).data("flighttype")=='ONE_WAY'?'oneway':'twoway';
		var flightSection1ViewModel='{"oneway":{"from":"","to":"","startTime":""},"twoway":{"from":"'+from+'","to":"'+to+'","startTime":"'+startTime+'","returnTime":"'+endTime+'"},"multicity":{"trips":[{"from":"","to":"","startTime":"","isRemovable":false}]},"numberOfAdult":1,"numberOfChild":0,"numberOfInfant":0,"radioSearchFlight":"'+flightType+'","flightClass":"","specificAirline":[],"originalGroupId":""}';
		var flightSection1DataModel='{"flightType":"'+flightType+'","entrys":[{"departureFlightSearchData":{"fromCity":"'+from+'","toCity":"'+to+'","departureDate":"'+endTime+'","numberOfAdult":1,"numberOfChild":0,"numberOfInfant":0,"flightClass":"","specificAirline":[]},"hotelSearchData":null,"returnFlightSearchData":{"fromCity":"'+from+'","toCity":"'+to+'","departureDate":"'+endTime+'","numberOfAdult":1,"numberOfChild":0,"numberOfInfant":0}}],"flightHotelSearchRooms":[]}';
		var formElementExpressions = '';
		$(['flightSection1ViewModel', 'flightSection1DataModel','CSRFToken']).each (function (i, e) {
			formElementExpressions += '<input name="#" type="hide" />'.replace('#', e);
		});
		var formExpression = '<form action="'+url+'" method="'+method+'"></form>';
		$form = $(formExpression).append($(formElementExpressions));
		$form.find('input[name=flightSection1ViewModel]').val(flightSection1ViewModel);
		$form.find('input[name=flightSection1DataModel]').val(flightSection1DataModel);
		$form.find('input[name=CSRFToken]').val(ACC.config.CSRFToken);
		$form.appendTo('body').submit();
	});
});
</script>