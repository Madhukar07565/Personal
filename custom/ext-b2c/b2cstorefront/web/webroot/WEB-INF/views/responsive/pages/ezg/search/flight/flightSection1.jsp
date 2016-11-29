<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- bread crumb START -->
<ul class="breadCrumb clearfix">
	<li><a href="javascript:void(0);">Home</a></li>
	<li class="divider"></li>
	<li>Flights</li>
</ul>
<!-- bread crumb END -->

<!-- add the 'Not found' information here Start -->
<%-- 
	<p class="bkgLitBlu w100pcnt pD10 mB10 tC clearfix"><span class="mT5">Sorry! We couldn’t find flights for the </span><span class="fW600"> Mumbai - Agra</span><span class="mT5"> sector.<br>Alternatively we are showing results for </span>
	<span class="fW600">Mumbai - Delhi</span>.<span class="mT5"> From Delhi you can take a bus/car to Agra.</span></p>
--%>	
<!-- add the 'Not found' information here End -->
	
<!-- search button & search results summary START -->
<div class="clearfix mB10">
	<span class="col_3 pL0">
		<a href="javascript:void(0);" class="button button-primary fL modSrcBtn w100pcnt"><img src="${ezgImagesPath}/common/right-arrow-wht.png" alt="Arrow" class="mR10">Modify search</a>
	</span>
	<span class="col_7 fL pL10">
		<span class="flight_icon mR10 margin0 mR10 fL"></span><span class="fL" id="flightTitle"></span>
	</span>
	
	<ul class="glToggle fR">
		<li id="viewTab1" class="first sel calFliterShow" onclick="view('viewTab1', 'viewContr1',3)"><span class="tabularView"></span><span class="aro"></span></li>
	    <li id="viewTab2" class="calFliter" onclick="view('viewTab2', 'viewContr2',3)"><span class="calendarView"></span><span class="aro"></span></li>
		<li id="viewTab3" class="last calFliterShow" onclick="view('viewTab3', 'viewContr3',3)"><span class="matrixView"></span><span class="aro"></span></li>	  
    </ul>
        
</div>
<!-- search button & search results summary END -->
<div class="clearfix pL0 pR0 mB20 dN contentPanel">
<c:set var="ractiveFlightSearchContainer" value="divTopSearchFlightSearch" scope="request" />
<c:set var="ractiveFlightSearchTemplate" value="templateTopSearchFlight" scope="request" />
<c:set var="ractiveFlightSearchInstance" value="ractiveTopFlight" scope="request" /> 
<cms:pageSlot position="Search" var="feature">
	<cms:component component="${feature}" />
</cms:pageSlot>
</div>

<script id="templateFlightTitle" type="text/ractive">
	<span class="fL" id="flightTitle">{{flightInfo}} </span>
</script>
<script>
var ractiveFlight = ractiveFlight ? ractiveFlight : {};
$(function() {
	ractiveFlight.title = new Ractive({
		el: '#flightTitle', 
		template: '#templateFlightTitle',
		'oninit': function () {
			if (this.get('flightSection1ViewModel')) {
				var flightSection1ViewModel = this.clone(this.get('flightSection1ViewModel'))
				
				var oneway = flightSection1ViewModel.twoway;
				var twoway = flightSection1ViewModel.twoway;
				var multicityTrips = flightSection1ViewModel.multicity.trips;
				//this.set('accommodation.rooms', flightSection1ViewModel.accommodation.rooms);
				
				var numberOfAdult = flightSection1ViewModel.numberOfAdult;
				var numberOfChild = flightSection1ViewModel.numberOfChild;
				var numberOfInfant = flightSection1ViewModel.numberOfInfant;
				
				
				
				
				var radioSearchFlight = flightSection1ViewModel.radioSearchFlight;
				
				var description = '';
				if(radioSearchFlight == 'oneway'){
					description += oneway.from + ' - ' + oneway.to + ' | ';
					description += oneway.startTime + ' | ';
				}else if(radioSearchFlight == 'twoway'){
					description += twoway.from + ' - ' + twoway.to +  ' - ' + twoway.from + ' | ';
					description += twoway.startTime + ' | '; // + ' - ' +  twoway.returnTime + ' | ';
				}else if(radioSearchFlight == 'multicity'){
					description += oneway.from + ' - ';
					var startTime = oneway.startTime;
					$.each(multicityTrips, function(i, e){
						description += e.from;
						if(i < (multicityTrips.length-1)){
							description += ' - ';
						}
						
					});
					description += ' | ' + startTime +' | ';
				}
				
				description += numberOfAdult + ' Adults, ' + numberOfChild + ' Child, ' + numberOfInfant + ' Infant ';
				this.set('flightInfo', description);
			} 
		},
		'data': {
			'flightSection1ViewModel': <c:if test="${not empty flightSection1ViewModel}">${flightSection1ViewModel}</c:if><c:if test="${empty flightSection1ViewModel}">''</c:if>,

			'flightInfo': ''
		}
	});
	if(ractiveFlight.title.get('flightSection1ViewModel').radioSearchFlight == 'multicity'){
		var tab3AttrClass = $("#viewTab3").attr('class');
		var tab3SpanClass = $("#viewTab3").find('span:first-child').attr('class');
		console.log('tab3SpanClass',tab3SpanClass);
		$("#viewTab2").find('span:first-child').attr('class',tab3SpanClass);
		$("#viewTab2").attr('class',tab3AttrClass);
		$("#viewTab2").attr('onclick','view("viewTab2", "viewContr2",2)');
		$("#viewTab1").attr('onclick','view("viewTab1", "viewContr1",2)');
		$("#viewTab3").remove();
	}
});
</script>

