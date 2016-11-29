<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:if test="${fn:length(section2BBeanDataModel.bestPriceRecommend) > 0}">
<c:set var="bestPriceRecommend" value="${section2BBeanDataModel.bestPriceRecommend[0]}" />
<section class="col_9 col_sm_12 pR0 pL0_768">
<div class="fS18">Best price recommendation</div>
<div class="cB"></div>
<!-- Tabs Begin here-->
<div class="clearfix">
<br class="cB">
<div class="contrSdo grey_border pT10 clearfix mB15">
    <div class="clearfix">
        <div class="col_10 main_carousels mB10">
            <ul id="mycarousel1" class="first-and-second-carousel jcarousel-skin-eurail ft_results Multicity">
                <c:forEach var="eachItem" items="${bestPriceRecommend.listOfFlightHotel}" varStatus="eachStatus">
                    <li class="w205">
                        <span class="wayNum ${eachStatus.count == 1 ? "sel" : ""} mR10 fL" id="multiWayTop1">${eachStatus.count}</span>
                        <div class="fL w81pcnt"> <span class="fL w100pcnt mB5">${eachItem.departureFlight.fromSection.city} - ${eachItem.departureFlight.toSection.city}, ${eachItem.departureFlight.departureTime}</span><samp class="go_AI mh40 mL10 mw30"></samp>
                            <br /><span class="fL mL10 fS11">${eachItem.departureFlight.duration}<br><span class="fS13">
                            <a href="javascript:void(0);" onclick="popupwin('bookpolicy2','bookpolicy2inner', 'fade')" class="fS12">Change Flight</a> </span></span> <span class="addFlight mL30">+</span><br class="mT10">
                            <span class="fL mT10"> <span class="fL"><img src="${ezgImagesPath}/hotel3_thumb.jpg" alt="" class="fL mT10 mL10 mR10"></span> <span class="fL">${hotel.brand}<br>
                            Deluxe room<br><span class="fullRatingstar_icon"></span><span class="fullRatingstar_icon"></span><span class="fullRatingstar_icon"></span><br>
                            <a href="javascript:void(0);" onclick="popupwin('cancellation','cancellationinner', 'fade')" class="fS12">Cancellation policy</a><br>
                            <a href="javascript:void(0);" onclick="popupwin('bookpolicy1','bookpolicy1inner', 'fade')" class="fS12">Change Room</a> </span> </span>
                        </div>
                    </li>
                </c:forEach>
            </ul>
        </div>
        <div class="col_2 pT10 pricesrp h246 h246_sm mTN10">
            <ul>
                <li class="clearfix">
                    <span class="dB clearfix fL mB20"><span class="rupee fS14 fW300">Rs </span><span class="strikeOut fW600"> 17,780</span><br><a href="javascript:void(0)" class="fL fS18"><span class="rupee">Rs </span><span class="fW600"> 17,780</span></a><span class="faq_sml_icon fL mT5 mL10" style="float: right; margin-top: -19px !important;margin-right: 3px;"></span></span>
                </li>
            </ul>
            <a href="#" class="button button-primary pD10 w75pcnt mB20 clearfix">Select</a><br>
            <a href="#" class="fS14"> Send Enquiry</a><br/>
            <span class="clearfix dB mT5 mL5"> <span class="empty_heart mR10"></span> <span class="share_icon "></span> </span>
        </div>
    </div>
</div>
<section class="mT10 clearfix">
    <h4 class="gridTitle fL fW600">Search results</h4>
    <span class="fR">
        <h4 class="fS16 fL mR5 fW600">Sort by:</h4>
        <select class="fR">
            <option value="">Select</option>
            <option>Popularity</option>
            <option>Price (low to high)</option>
            <option>Recommended</option>
        </select>
    </span>
</section>
<div class="clearfix"></div>
<br class="cB">


<div class="row pL20 posR">
    <div class="ovrFH mR20">
        <ul id="slider">
<%-- Iterate flight legs START --%>
<c:forEach var="flightAndHotelMulticityItem" items="${section2BBeanDataModel.result}" varStatus="multicityItemStatus" >
    <li class='${multicityItemStatus.count == 1 ? "first" : "" } ${fn:length(section2BBeanDataModel.result) == multicityItemStatus.count ? "last" : "" }'>
        <ul class="ft_results">
            <%-- Each flight leg info summary START --%>
            <li class="flightContrHrdr clearfix"><span id="multiWayMid1" class='wayNum ${multicityItemStatus.count == 1 ? "sel" : ""} mR10 fL'>${multicityItemStatus.count}</span> <span class="fL"><span class="fS18">London - Paris</span> , 25 Sep 2014, 2 adults 1 child</span></li>
            <%-- Each flight leg info summary END --%>
    <%-- Each flight leg data list START --%>
    <c:forEach var="eachItem" items="${flightAndHotelMulticityItem.listOfFlightHotel}" varStatus="eachItemStatus" >
                <li class="clearfix mB15">
                    <div class="contrSdo grey_border clearfix mB15">
                        <div class="col_9 mB10 pT10 pL10 pR0 w75pcnt">
                            <span class="w20pcnt fL mR20"><img src="${ezgImagesPath}/common/hotel3.jpg" class="mB20 clearfix mR10" alt="hotel"><br/>
                            <span class="like fL mT0"></span> <span class="mT13 mR5 fS11">${eachItem.hotel.reviews.numReviews}</span> <span class="mR2 mT10"><img src="${ezgImagesPath}/common/user7.png" alt="User 7"></span> 
                            <span class="mR2 mT10"><img src="${ezgImagesPath}/common/user5.jpg" alt="User 5"></span> <span class="mT10"><img src="${ezgImagesPath}/common/user6.jpg" alt="User 6"></span></span>
                            <div class="w21pcnt fL mB20 clearfix mR10">
                                <h3 class="fS14 mB5 fW600"><a href="javascript:void(0)" onclick="popupwin('bookpolicy', 'fade')">${eachItem.hotel.brand}</a></h3>
                                <span class="mT10 fS12">${eachItem.hotel.address}</span><br/> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <br/><span class="fS11"><img src="${ezgImagesPath}/common/tripadvisor.png" class="w20pcnt" alt="tripadvisor">
                                <br/>${eachItem.hotel.reviews.ranking}<br/>(based on ${eachItem.hotel.reviews.numReviews} reviews)<br/><span class="fW600 fS12">Deluxe room</span><br/>
                                <span class="mT5 fS12 fW600"><a href="javascript:void(0);" onclick="popupwin('cancellation','cancellationinner', 'fade')">Cancellation policy</a><br/><a href="javascript:void(0)" onclick="popupwin('bookpolicy1','bookpolicy1inner', 'fade')" >Change room </a></span>
                            </div>
                            <div class="w5pcnt mT50 fL mB20 clearfix mR10 mL10">
                                <div class="mLN60 fS27 fW600">+</div>
                            </div>
                            <div class="w42pcnt ft_results fL mB20 clearfix mR10" style="margin-top:4px;">
                                <h4 class="fS11 fW600">Flight</h4>
                                <samp class="go_AI w20pcnt mT3"> <span class="fS12">${eachItem.returnFlight.airlineIATA.airlineName}<br/>${eachItem.returnFlight.flightNumber}</span></samp>
                                <span class="fS12 w100pcnt">${eachItem.returnFlight.departureTime} - ${eachItem.returnFlight.arrivalTime}<br/>${eachItem.returnFlight.duration}</span>
                                <br class="cB">
                                <br>
                                <br>
                                <br>
                                <br>
                                <br>
                                <br>
                                <span class="mT70 fS12 fW600"><a href="javascript:void(0)" onclick="popupwin('bookpolicy2','bookpolicy2inner', 'fade')">Change flight </a></span>
                            </div>
                        </div>
                        <div class="col_3 pT10 pricesrp h213 h207_sm w25pcnt_imp">
                            <ul>
                                <li class="clearfix">
                                    <span class="dB clearfix fL mB20"><span class="rupee fS14 fW300">Rs </span><span class="strikeOut fW600"> 17,780</span><br><a href="javascript:void(0)" class="fL fS18"><span class="rupee">Rs </span><span class="fW600"> 17,780</span></a><span class="faq_sml_icon fL mT5 mL10" style="float: right; margin-top: 3px !important;margin-left: 4px !important;"></span></span>
                                </li>
                            </ul>
                            <a href="javascript:ractiveFlightAndHotel.resultList.selectFlightHotel(${multicityItemStatus.count - 1}, ${eachItemStatus.count - 1});" class="button button-primary pD10 w75pcnt mB20 clearfix">Select</a><br>
                            <a href="#" class="fS14"> Send Enquiry</a><br/>
                            <span class="clearfix dB mT5 mL5"> <span class="empty_heart mR10"></span> <span class="share_icon "></span> </span>
                        </div>
                    </div>
                </li>
    </c:forEach>
    <%-- Each flight leg data list END --%>
        </ul>
    </li>
</c:forEach>
<%-- Iterate flight legs END --%>
        </ul>
    </div>
</div>






</div>
</section>
</c:if>
<script id="templateMulticityResultFlightAndHotel" type="text/ractive">
<div><a onclick="closeShoppingCartPanel('shopping_cart_panel')" href="javascript:void(0);"><span class="close_thumbnail_grey m0"></span></a></div>
<div class="container">
    <span class="removeCartItem_cross"></span>
    <div class="col_8 main_carousels mB10 fcWht pT20 pB20 ">
        <ul id="mycarousel2" class="first-and-second-carousel jcarousel-skin-eurail">
{{#each selectedMulticityFlightHotels:index}}
            <li>
                {{#if this}}
                    <div class="fL">
                        <span class="wayNum mR10" id="multiWayTop1">{{index + 1}}</span>
                        BOM - DEL, 25 Sep‘14
                        <br />
                        <img src="${ezgImagesPath}/srp_flight/indigo_sml_logo.jpg" class="mB5 fL mR15 mT10" alt="Air India Logo">
                        <span class="fL w48pcnt_imp fS11 mT10">
                        {{departureFlight.departureTime}} - {{departureFlight.arrivalTime}}<br/>{{departureFlight.duration}}<br>{{departureFlight.airlineIATA.airlineName}}<br/>{{departureFlight.flightNumber}}<br/><br/>
                        <a href="javascript:void(0);">Change Flight</a>
                        </span>
                        <br class="cB">
                        <span class="addFlight mT10 mB10 fR fS30">+</span>
                        <br class="cB">
                        <img src="${ezgImagesPath}/hotel3_thumb.jpg" alt="" class="mB5 fL w20pcnt">
                        <span class="fL mL10 w48pcnt_imp fS11">
                        <a href="javascript:void(0);">{{hotel.brand}}</a>
                        <br>
                        <span class="fullRatingstar_icon"></span>
                        <span class="fullRatingstar_icon"></span>
                        <span class="fullRatingstar_icon"></span>
                        <span class="fullRatingstar_icon"></span>
                        <br>
                        <span class="fS11 fontColorWht">
                        <img src="${ezgImagesPath}/common/tripadvisor.png" class="w20pcnt" alt="tripadvisor">
                        <br/>{{hotel.reviews.ranking}}<br/>(based on {{hotel.reviews.numReviews}} reviews)<br/>
                        </span>
                        <br />Deluxe room<br><a href="javascript:void(0);">Change Hotel</a>
                        </span>
                    </div>
                {{else}}
                    <div id="addFlightLeg1" class="addEurail_ActionPnl">Add leg {{index + 1}}</div>
                {{/if}}
            </li>
{{/each}}
        </ul>
    </div>
    <div id="selectBooking" class="fL col_4 pL0 pR0 pT20 pB20 fcWht {{totalPrice < 0 ? 'dN' : ''}}">
        <div class="fL mTN5 col_6 dN fcWht" style="display: block;margin-top:20px;">
            <span>Total Price:</span><br>
            <h4 class="mT5"><span class="rupee">Rs</span><span class="fW600" id="compPrice">{{totalPrice}}</span></h4>
        </div>
        <div class="col_6 mT20"><a class="button button-primary fL mR10" href="javascript:void(0);">Book</a><span class="empty_heart"></span><span class="share_icon mT5 mL10"></span><span class="fW500 fS12 mT10 fL mR20 "><a href="javascript:void(0)" class="fcWht">Add to cart</a></span>
        </div>
    </div>
</div>
</script>
<script type="text/javascript">
var ractiveFlightAndHotel = ractiveFlightAndHotel ? ractiveFlightAndHotel : {};
$(function() {
ractiveFlightAndHotel.resultList = new Ractive({
	el: '#shopping_cart_panel',
	template: '#templateMulticityResultFlightAndHotel',
	oninit: function () {
		if (!$('#shopping_cart_panel').exists()) {
			$('<div id="shopping_cart_panel" class="dN"></div>').appendTo("body");
		}
	},
	computed: {
		totalPrice: function () {
			var allFlightHotels = this.get('selectedMulticityFlightHotels');
			var validSize = 0;
			for (var i in allFlightHotels) {
				if (allFlightHotels[i]) {
					validSize++;
				}
			}
			return 1000 * validSize + Math.floor(Math.random() * 900) + 100;
		}
	},
	data: {
		history: {
			section2BDataModel: <c:if test="${not empty section2BDataModel}">${section2BDataModel}</c:if><c:if test="${empty section2BDataModel}">''</c:if> <%--"${section2BDataModel ? section2BDataModel : ''}"--%>
		},
		selectedMulticityFlightHotels: new Array( ${fn:length(section2BBeanDataModel.result)} )
	},
	selectFlightHotel: function (flightLegIndex, flightIndex) {
		console.log([flightLegIndex, flightIndex, this.el, this.get('history.section2BDataModel.result.' + flightLegIndex),
		             this.get('history.section2BDataModel.result.' + flightLegIndex + '.listOfFlightHotel.' + flightIndex)]);
		$(this.el).show();
		var selectedFlightHotel = this.get('history.section2BDataModel.result.' + flightLegIndex + '.listOfFlightHotel.' + flightIndex);
		this.set('selectedMulticityFlightHotels.' + flightLegIndex, selectedFlightHotel);
	}
});
});
</script>


