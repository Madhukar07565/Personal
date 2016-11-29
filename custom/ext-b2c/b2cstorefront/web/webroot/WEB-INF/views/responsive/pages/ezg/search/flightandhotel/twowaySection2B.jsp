<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:if test="${fn:length(section2BBeanDataModel.bestPriceRecommend) > 0}">
<c:set var="bestPriceRecommend" value="${section2BBeanDataModel.bestPriceRecommend[0]}" />
<section class="col_9 col_sm_12 pR0 pL0_768"> 
<div class="fS18">Best price recommendation</div>
<div class="cB"></div>
<div class="clearfix"><br class="cB">
    <div class="contrSdo grey_border clearfix mB15">
        <div class="col_9 mB10 pT10 pL10 pR0 w75pcnt">
            <span class="w21pcnt fL mR20"><img src="${ezgImagesPath}/common/hotel3.jpg" class="mB20 clearfix mR10" alt="hotel"><br/>
            <span class="like fL mT0"></span> <span class="mT13 mR5 fS11">${bestPriceRecommend.hotel.reviews.numReviews}</span> <span class="mR2 mT10"><img src="${ezgImagesPath}/common/user7.png" alt="User 7"></span> 
            <span class="mR2 mT10"><img src="${ezgImagesPath}/common/user5.jpg" alt="User 5"></span> <span class="mT10"><img src="${ezgImagesPath}/common/user6.jpg" alt="User 6"></span></span>
            <div class="w21pcnt fL mB20 clearfix mR10">
                <h3 class="fS14 mB5 fW600"><a href="javascript:void(0)" onclick="popupwin('bookpolicy', 'fade')">${bestPriceRecommend.hotel.brand}</a></h3>
                <span class="mT10 fS12">${bestPriceRecommend.hotel.address}</span><br/>
                <span class="fullRatingstar_icon"></span>
                <span class="fullRatingstar_icon"></span>
                <span class="fullRatingstar_icon"></span>
                <span class="fullRatingstar_icon"></span>
                <span class="fullRatingstar_icon"></span><br/>
                <span class="fS11">
                    <img src="${ezgImagesPath}/common/tripadvisor.png" class="w20pcnt" alt="tripadvisor"><br/>${bestPriceRecommend.hotel.reviews.ranking}<br/>(based on ${bestPriceRecommend.hotel.reviews.numReviews} reviews)<br/>
                    <span class="fW600 fS12">Deluxe room</span><br/><br/><br/><br/>
                    <span class="fS12 fW600"><a href="javascript:void(0);" onclick="popupwin('cancellation','cancellationinner', 'fade')">Cancellation policy</a>
                    <br/><a href="javascript:void(0);" onclick="popupwin('bookpolicy1','bookpolicy1inner', 'fade')">Change room </a></span>
            </div>
            <div class="w5pcnt fL mB20 clearfix mR10 mL10">
                <span class="fR mB20 clearfix mR10 addFlight fS22 fW600 mT75">+</span>
            </div>
            <div class="w42pcnt_imp w28pcnt_sm ft_results fL mB20 clearfix mR10 mT6">
            <h4 class="fS11 fW600">Departure Flight</h4>
            <samp class="go_AI w20pcnt mT3"> <span class="fS12">${bestPriceRecommend.departureFlight.airlineIATA.airlineName}<br/>${bestPriceRecommend.departureFlight.flightNumber}</span></samp>
            <span class="fS12 w100pcnt">${bestPriceRecommend.departureFlight.departureTime} - ${bestPriceRecommend.departureFlight.arrivalTime}<br/>${bestPriceRecommend.departureFlight.duration}</span><br class="cB">
            <h4 class=" fS11 fW600">Return  Flight</h4>
            <samp class="go_AI w20pcnt mT3"> <span class="fS12">${bestPriceRecommend.returnFlight.airlineIATA.airlineName}<br/>${bestPriceRecommend.returnFlight.flightNumber}</span></samp>
            <span class="fS12 w100pcnt">${bestPriceRecommend.returnFlight.departureTime} - ${bestPriceRecommend.returnFlight.arrivalTime}<br/>${bestPriceRecommend.returnFlight.duration}</span><br class="cB"><br class="cB">
            <span class="mT5 fS12 fW600"><a href="javascript:void(0)" onclick="popupwin('bookpolicy2','bookpolicy2inner', 'fade')">Change flight </a></span>
            </div>
        </div>
        <div class="col_3 pT10 pricesrp h260 h260_sm w25pcnt_imp">
        <ul>
        <li class="clearfix">
        <span class="dB clearfix fL mB20"><span class="rupee fS14 fW300">Rs </span><span class="strikeOut fW600"> 17,780</span><br/><a href="javascript:void(0)" class="fL fS18"><span class="rupee">Rs </span><span class="fW600"> 17,780</span></a><span class="faq_sml_icon fL mT5 mL10" style="float: right; margin-top:3px !important;margin-left:4px !important;"></span></span></span>
        </li>
        </ul>
        <a href="#" class="button button-primary pD10 w75pcnt mB20 clearfix" onclick="selectMultiFlightreserv(1)">Select</a><br/>
        <a href="#" class="fS14"> Send Enquiry</a><br/>
        <span class="clearfix dB mT5 mL5"> <span class="empty_heart mR10"></span> <span class="share_icon "></span> </span>
        </div>
    </div>
    <!--<p class="clearfix cB mT20"><input type="checkbox" /><label>Add to Compare</label></p>-->
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
    <br class="cB"/>
<c:forEach var="eachItem" items="${section2BBeanDataModel.result}" varStatus="eachItemStatus">
    <div class="contrSdo grey_border clearfix mB15">
        <div class="col_9 mB10 pT10 pL10 pR0 w75pcnt">
            <span class="w21pcnt fL mR20"><img src="${ezgImagesPath}/common/hotel3.jpg" class="mB20 clearfix mR10" alt="hotel"><br/>
            <span class="like fL mT0"></span> <span class="mT13 mR5 fS11">${eachItem.hotel.reviews.numReviews}</span> <span class="mR2 mT10"><img src="${ezgImagesPath}/common/user7.png" alt="User 7"></span> 
            <span class="mR2 mT10"><img src="${ezgImagesPath}/common/user5.jpg" alt="User 5"></span> <span class="mT10"><img src="${ezgImagesPath}/common/user6.jpg" alt="User 6"></span></span>
            <div class="w21pcnt fL mB20 clearfix mR10">
                <h3 class="fS14 mB5 fW600"><a href="javascript:void(0)" onclick="popupwin('bookpolicy', 'fade')">${eachItem.hotel.brand}</a></h3>
                <span class="mT10 fS12">${eachItem.hotel.address}</span><br/> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span><br/><span class="fS11"><img src="${ezgImagesPath}/common/tripadvisor.png" class="w20pcnt" alt="tripadvisor">
                <br/>${eachItem.hotel.reviews.ranking}<br/>(based on ${eachItem.hotel.reviews.numReviews} reviews)<br/><span class="fW600 fS12">Deluxe room</span><br/><br/><br/><br/>
                <span class="mT5 fS12 fW600"><a href="javascript:void(0);">Cancellation policy</a><br/><a href="javascript:void(0)">Change room </a></span>
            </div>
            <div class="w5pcnt fL mB20 clearfix mR10 mL10">
                <span class="fR mB20 clearfix mR10 addFlight fS22 fW600 mT75">+</span>
            </div>
            <div class="w42pcnt_imp w28pcnt_sm ft_results fL mB20 clearfix mR10 mT6">
                <h4 class="fS11 fW600">Departure Flight</h4>
                <samp class="go_AI w20pcnt mT3"> <span class="fS12">${eachItem.departureFlight.airlineIATA.airlineName}<br/>${eachItem.departureFlight.flightNumber}</span></samp>
                <span class="fS12 w100pcnt">${eachItem.departureFlight.departureTime} - ${eachItem.departureFlight.arrivalTime}<br/>${eachItem.departureFlight.duration}</span><br class="cB"/>
                <h4 class=" fS11 fW600">Return  Flight</h4>
                <samp class="go_AI w20pcnt mT3"> <span class="fS12">${eachItem.returnFlight.airlineIATA.airlineName}<br/>${eachItem.returnFlight.flightNumber}</span></samp>
                <span class="fS12 w100pcnt">${eachItem.returnFlight.departureTime} - ${eachItem.returnFlight.arrivalTime}<br/>${eachItem.returnFlight.duration}</span><br/><br/>
                <span class="mT5 fS12 fW600"><a href="javascript:void(0)" >Change flight </a></span>
            </div>
        </div>
        <div class="col_3 pT10 pricesrp h260 h260_sm w25pcnt_imp">
            <ul>
                <li class="clearfix">
                    <span class="dB clearfix fL mB20"><span class="rupee fS14 fW300">Rs </span><span class="strikeOut fW600"> 17,780</span><br><a href="javascript:void(0)" class="fL fS18"><span class="rupee">Rs </span><span class="fW600"> 17,780</span></a><span class="faq_sml_icon fL mT5 mL10" style="float: right; margin-top:3px !important;margin-left:4px !important;"></span></span>
                </li>
            </ul>
            <a href="javascript:ractiveFlightAndHotel.resultList.selectFlightHotel(${eachItemStatus.count - 1});" class="button button-primary pD10 w75pcnt mB20 clearfix">Select</a><br>
            <a href="javascript:void(0);" class="fS14"> Send Enquiry</a><br/>
            <span class="clearfix dB mT5 mL5"> <span class="empty_heart mR10"></span> <span class="share_icon "></span> </span>
        </div>
    </div>
</c:forEach>
<!--<p class="clearfix cB mT20"><input type="checkbox" /><label>Add to Compare</label></p>-->
</div>
</section>
</c:if>
<script id="templateTwowayResultFlightAndHotel" type="text/ractive">
{{#selectedTwowayFlightHotel}}
<div><a onclick="closeShoppingCartPanel('shopping_cart_panel')" href="javascript:void(0);"><span class="close_thumbnail_grey m0"></span></a></div>
<div class="container">
    <span class="removeCartItem_cross"></span>
    <div class="col_7 mB10 pT10 pL10 pR0 w75pcnt fontColorWht">
        <span class="w21pcnt fL mR20"><img src="${ezgImagesPath}/common/hotel3.jpg" class="mB20 clearfix mR10" alt="hotel"><br/>
        <span class="like fL mT0"></span> <span class="mT13 mR5 fS11">242</span> <span class="mR2 mT10"><img src="${ezgImagesPath}/common/user7.png" alt="User 7"></span> 
        <span class="mR2 mT10"><img src="${ezgImagesPath}/common/user5.jpg" alt="User 5"></span> <span class="mT10"><img src="${ezgImagesPath}/common/user6.jpg" alt="User 6"></span></span>
        <div class="w21pcnt fL mB20 clearfix mR10">
            <h3 class="fS14 mB5 fW600"><a href="javascript:void(0)" onclick="popupwin('bookpolicy', 'fade')">{{hotel.brand}}</a></h3>
            <span class="mT10 fS12">{{hotel.address}}</span><br/>
            <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span>
            <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span>
            <span class="fullRatingstar_icon"></span><br/><span class="fS11"><img src="${ezgImagesPath}/common/tripadvisor.png" class="w20pcnt" alt="tripadvisor">
            <br/>{{hotel.reviews.ranking}}<br/>(based on {{hotel.reviews.numReviews}} reviews)<br/>
            <span class="fW600 fS12">Deluxe room</span><br/><br/><br/><br/>
            <span class="mT5 fS12 fW600"><a href="javascript:void(0)">Change hotel </a></span>
        </div>
        <div class="w5pcnt fL clearfix mR10 mT75">
            <span class="fR clearfix mR10 addFlight fS22 fW600">+</span>
        </div>
        <div class="w42pcnt_imp w28pcnt_sm ft_results fL mB20 clearfix mR10 mT6">
            <h4 class="fS11 fW600">Departure Flight</h4>
            <samp class="go_AI w20pcnt mT3"> <span class="fS11 fcWht">{{departureFlight.airlineIATA.airlineName}}<br/>{{departureFlight.flightNumber}}</span></samp>
            <span class="fS11 w100pcnt">{{departureFlight.departureTime}} - {{departureFlight.arrivalTime}}<br/>{{departureFlight.duration}}</span><br class="cB">
            <h4 class=" fS11 fW600">Return  Flight</h4>
            <samp class="go_AI w20pcnt mT3"> <span class="fS11 fcWht">{{returnFlight.airlineIATA.airlineName}}<br/>{{returnFlight.flightNumber}}</span></samp>
            <span class="fS11 w100pcnt">{{returnFlight.departureTime}} - {{returnFlight.arrivalTime}}<br/>{{returnFlight.duration}}</span><br class="cB"><br class="cB">
            <span class="mT5 fS12 fW600"><a href="javascript:void(0)" onclick="popupwin('bookpolicy2','bookpolicy2inner', 'fade')">Change flight </a></span>
        </div>
    </div>
    <div id="priceBox" class="fL mTN5 col_2 dN fcWht" style="display: block;margin-top:20px;">
        <span>Total Price:</span><br>
        <h4 class="mT5"><span class="rupee">Rs</span><span class="fW600" id="compPrice">37,780</span></h4>
    </div>
    <div class="col_2 mT20" style="width:17%;"><a class="button button-primary fL mR10" href="javascript:void(0);">Book</a><span class="empty_heart"></span><span class="share_icon mT5 mL10"></span><span class="fW500 fS12 mT10 fL mR20 "><a href="javascript:void(0)" class="fcWht">Add to cart</a></span>
    </div>
</div>
{{/selectedTwowayFlightHotel}}
</script>
<script type="text/javascript">
var ractiveFlightAndHotel = ractiveFlightAndHotel ? ractiveFlightAndHotel : {};
$(function() {
ractiveFlightAndHotel.resultList = new Ractive({
	el: '#shopping_cart_panel',
	template: '#templateTwowayResultFlightAndHotel',
	oninit: function () {
		if (!$('#shopping_cart_panel').exists()) {
			$('<div id="shopping_cart_panel" class="dN"></div>').appendTo("body");
		}
	},
	data: {
		history: {
			section2BDataModel: <c:if test="${not empty section2BDataModel}">${section2BDataModel}</c:if><c:if test="${empty section2BDataModel}">''</c:if> <%--"${section2BDataModel ? section2BDataModel : ''}"--%>
		},
		selectedTwowayFlightHotel: null
	},
	selectFlightHotel: function (index) {
		console.log([index, this.el, this.get('history.section2BDataModel.result.' + index)]);
		$(this.el).show();
		this.set('selectedTwowayFlightHotel', this.get('history.section2BDataModel.result.' + index));
	}
});
});
</script>

