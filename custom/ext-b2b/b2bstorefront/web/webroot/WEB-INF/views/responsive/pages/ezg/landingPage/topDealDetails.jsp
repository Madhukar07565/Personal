<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="landingPage" tagdir="/WEB-INF/tags/responsive/ezg/landingPage" %>

<section class="pD15 boxContr bkgLitBlu  clearfix mB30">
	<h2 class="pL20">Top Flights Deals</h2>
	<div class="flit_dealContr">
		<ul id="hotel_deals_carousel" class="first-and-second-carousel jcarousel-skin-flightDeal main_carousels">
			<landingPage:topDeal />
			<landingPage:topDeal />
			<landingPage:topDeal />
			<landingPage:topDeal />
			<landingPage:topDeal />
			<landingPage:topDeal />
		</ul>
	</div>
</section>