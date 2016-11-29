<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="flightLandingPage" tagdir="/WEB-INF/tags/responsive/ezg/landingPage/flight" %>

<section class="col_8 col_12_sm mB30_sm pL0">
	<ul class="srpOfferTab secTab clearfix">
		<li class="sel col_2 pL0 pR0 m0" id="secTab1">
			<div class="tabsec tC h67"><a href="#sectors"><span class="destination_icon"></span><br/>Sectors</a></div>
		</li>
		<li id="secTab2" class="col_2 m0 pL0 pR0">
			<div class="tabsec tC pD4imp h67"><a href="#lastMinute"><span class="destination_icon"></span><br/>Last Minute</a></div>
		</li>
		<li id="secTab3" class="col_2 pL0 m0 pR0">
			<div class="tabsec pD5imp tC h67"><a href="#deals"><span class="destination_icon"></span><br/>Deals</a></div>
		</li>
		<li id="secTab4" class="col_2 pL0 pR0 m0">
			<div class="tabsec tC h67"><a href="#airlines"><span class="destination_icon"></span><br/>Airlines</a></div>
		</li>
		
		<p class="fR mT30"><a href="javascript:void(0);" onclick="popupwin('fareAlert','fareAlertinner', 'fade')">Set a fare alert</a></p>
	</ul>
	<div class="grey_border pD15 clearfix diyContrs">
		<flightLandingPage:sectorsPromotion />
		<flightLandingPage:lastMinutePromotion />
		<flightLandingPage:dealsPromotion />
		<flightLandingPage:airlinesPromotion />
	</div>
</section>

