<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="landingPage" tagdir="/WEB-INF/tags/responsive/ezg/landingPage" %>
<%@ taglib prefix="flightLandingPage" tagdir="/WEB-INF/tags/responsive/ezg/landingPage/flight" %>

<section class="contentPanel grey_bg grey_border clearfix mB20">
	<landingPage:addCustomerDetails />
	<flightLandingPage:flightSearch />
</section>
 