<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="hotelDetail" tagdir="/WEB-INF/tags/responsive/ezg/hotel/detail"%>
<section class="mB40 tabs" id="selectionTable">
	<ul class="tabLinks clearfix">
		<li class="sel"><a href="#roomsAndRates" id="roomsAndRates">Rooms and rates</a></li>
		<li><a href="#amenities" id="test">Facilities</a></li>
		<li><a href="#inAndAroundHotel">In and around hotel</a></li>
		<li><a href="#priceCalendar">Price calendar</a></li>
		<li><a href="#reviews">Reviews</a></li>
		<li><a href="#offers">Offers</a></li>
		<li><a href="#Importantinfo">Booking policy </a></li>
	</ul>
	<div class="tabsContent">
		<hotelDetail:roomandrate hotelData="${hotelData}" hotelSearchData="${hotelSearchData}"/>
		<hotelDetail:facilities hotelData="${hotelData}"/>
		<hotelDetail:inandaround hotelData="${hotelData}"/>
		<hotelDetail:pricecalendar hotelData="${hotelData}"/>
		<hotelDetail:reviews hotelData="${hotelData}"/>
		<hotelDetail:offers hotelData="${hotelData}"/>
		<hotelDetail:bookingpolicy hotelData="${hotelData}"/>
	</div>
</section>
