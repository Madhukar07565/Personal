<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<section class="routes container clearfix mT50">
	<h2>
		Featured hotels for people like <a href="javascript:void(0);"
			onclick="popupwin('traveller_type', 'black_overlay','fade')">#you</a>
	</h2>
	<div class="col_12 col_sm_12 pL0 pR0">
		<c:forEach items="${popularHotel}" var="hotelCity" varStatus="status">
			<c:if test="${status.index % 2 == 0}">
				<div class="col_6 col_sm_12">
			</c:if>
				<h3 >${hotelCity.city}</h3>
				<c:forEach items="${hotelCity.hotelList}" var="hotel">
					<article class="clearfix">
						<div class="col_3 pR0 pL0">
							<a href="###" >
							<img data-hotelid = "hotel_001"  data-checkindate ="${hotel.checkInDate}" data-checkoutdate = "${hotel.checkOutDate}"
								 data-city = "${hotelCity.city}"  
								 data-original="${ezgImagesPath }/common/hotel1.jpg" alt="Hotel" class="fL popularHolImg">
							</a>
						</div>
						<div class="col_6 pR0">
							<h4>
								<a href="###" data-hotelid = "hotel_001" data-checkindate ="${hotel.checkInDate}" data-checkoutdate = "${hotel.checkOutDate}" data-city = "${hotelCity.city}" class="popularHolName">${hotel.hotelName}</a>
							</h4>
							<h5>${hotel.hotelLocation}</h5>
							<span class="dB mT10">
								<c:forEach begin="1" end="${hotel.hotelStarRating}">
										<span class="fullRatingstar_icon"></span>
								</c:forEach>
								<c:forEach begin="1" end="${5-hotel.hotelStarRating}">
										<span class="fullnoRatingstar_icon"></span>
								</c:forEach>
							</span>
						</div>
						<div class="col_3 pR0">
							<p class="fR">
								<span class="rupee">Rs. </span>${hotel.hotelListPrice}<br> 
								<span class="strikeOut"><span class="rupee">Rs.</span>${hotel.hotelWebPrice }</span>
							</p>
						</div>
					</article>
				</c:forEach>
				<a href="###" data-city="${hotelCity.city}" data-checkIndate = "${hotelCity.startTime}"  data-checkOutDate ="${hotelCity.endTime}" class="moreFlight mB40 moreHotels">${hotelCity.totalBook} more hotels </a>
			<c:if test="${status.index % 2 == 1}">
				</div>
			</c:if>
		</c:forEach>
	</div>
</section>
<script type="text/javascript" src="${ezgJsPath}/moment.js"></script>

<script type="text/javascript">
$(function(){
	$(".moreHotels").click(function(){
		var city = $(this).data("city");
		var checkInDate  = $(this).data("checkindate");
		var checkOutDate = $(this).data("checkoutdate");
		var topSearchViewModel='{"destination":"'+city+'","checkInDate":"'+checkInDate+'","checkOutDate":"'+checkOutDate+'","priceFrom":"0","priceTo":"10000","fixedDate":false,"noOfRooms":"","nights":"0","hotelSearchRooms":{"rooms":[{"adultCount":1,"children":[],"infants":[]}]},"starRate":[],"starRateForView":[5,4,3,2,1],"accType":[],"accTypeForView":["Bed and Breakfast","Boutique Hotel","Guest House","Heritage Hotel","Home Stay","Resort","Serviced Apartments"]}';
		var topSearchDataModel='{"destination":"'+city+'","checkInDate":"'+checkInDate+'","checkOutDate":"'+checkOutDate+'","fixedDate":false,"nights":"0","noOfRooms":1,"starRate":[],"accType":[],"hotelSearchRooms":[{"adultCount":1,"children":[],"infants":[]}]}';
		var url = "${encodedContextPath}/search/hotel/topSearch";
		var method = "post";
		var formElementExpressions = '';
		$(['topSearchDataModel','topSearchViewModel','CSRFToken']).each (function (i, e) {
			formElementExpressions += '<input name="#" type="hide" />'.replace('#', e);
		});
		var formExpression = '<form action="'+url+'" method="'+method+'"></form>';
		$form = $(formExpression).append($(formElementExpressions));
		$form.find('input[name=topSearchDataModel]').val(topSearchDataModel);
		$form.find('input[name=topSearchViewModel]').val(topSearchViewModel);
		$form.find('input[name=CSRFToken]').val(ACC.config.CSRFToken);
		$form.appendTo('body').submit();
	});
	$(".popularHolImg,.popularHolName").click(function(){
			var hotelId = $(this).data("hotelid");
			var checkInDate = $(this).data("checkindate");
			var checkOutDate = $(this).data("checkoutdate");
			var widgetAndFacetSearchJson = '{"pageNum":1,"pageSize":10,"supplierId":null,"productId":null,"facets":null,"sortConditionList":null,"destination":"","checkInDate":"'+checkInDate+'","checkOutDate":"'+checkOutDate+'","priceFrom":null,"priceto":null,"fixedDate":false,"noOfRooms":1,"nights":0,"starRate":[],"accType":[],"hotelSearchRooms":[{"adultCount":1,"children":[],"infants":[]}]}';
			var url = ACC.config.encodedContextPath+"/p/hotel/"+hotelId+"/query";
			var method = "post";
			var formElementExpressions = '';
			$(['widgetAndFacetSearchJson','CSRFToken']).each (function (i, e) {
				formElementExpressions += '<input name="#" type="hide" />'.replace('#', e);
			});
			var formExpression = '<form action="'+url+'" method="'+method+'"></form>';
			$form = $(formExpression).append($(formElementExpressions));
			$form.find('input[name=widgetAndFacetSearchJson]').val(widgetAndFacetSearchJson);
			$form.find('input[name=CSRFToken]').val(ACC.config.CSRFToken);
			$form.appendTo('body').submit();
	});
});
</script>

