<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<li class="col_3 col_2_half fR col_sm_12 pR0 pD10 hotelPricingDetails">
	<span class="detailBlock tC"> 
		<span class="dB mB5 mT5 fS11 notifyColor">Booked 2 min ago !</span> 
		<span class="fS12 mB25 dB fcOrng">250 people viewing this</span>
	</span>
	<span class="detailBlock mT20 tC clearfix"> 
		<span class="fS27 dB">
				<span>${hotelData.showPrice.currency}</span>
				<span>${hotelData.showPrice.avgPrice}</span>
		</span>
		<span class="faq_sml_icon fL mT5 mL10" style="margin-top: -26px !important; float: right; margin-right: 66px;"></span>
		<%-- <span class="fS11 mB10 dB">${hotelData.priceInfo.otherDescription}</span>  --%>
		<span class="mB10 dB">${hotelSearchData.noOfRooms} room, ${hotelSearchData.nights} nights <br /> Standard Double Room</span>
	</span> 
	<span class="detailBlock clearfix"> 
		<a href="#roomsAndRates" class="button button-primary fL mR20"  id="shtroomsAndRates">Select room</a> 
		<span class="share_icon fL mR10 mT5"></span> 
		<span class="empty_heart fL mT5"></span>
	</span>
</li>