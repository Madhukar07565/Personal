<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="hotelData" required="true" type="com.cnk.travelogix.common.facades.product.data.hotel.HotelData" %>
<article class="tabContainer pD20 dN" id="reviews">
	<div class="col_12 clearfix">

		<div class="col_6 clearfix">
			<p class="clearfix">
				<span class="fL"> <img
					src="${ezgImagesPath}/common/Trip_Advisor.png" alt=""
					class="valign">
				</span> <span class="fS18 fL mT10 mB10">of hotels in Zurich<br>
					<span class="fS12 txtClrlitGry">based on the TripAdvisor
						Popularity Index</span>
				</span>
			</p>

			<hr class="brdrBLitGry mT10 mB10">
			<h4>What to expect :</h4>
			<ul class="clearfix mT15">
				<li class="col_11 pL0 mB5">
					<c:forEach begin="1" end="${hotelData.reviews.overallRating}">
						<span class="fullRatingstar_icon_circle fL"></span>
					</c:forEach> 
					<c:forEach begin="1" end="${5-hotelData.reviews.overallRating}">
						<span class="fullnoRatingstar_icon_circle fL"></span>
					</c:forEach> 
						<span class="fL mL10">Overall ratings (based on  ${hotelData.reviews.numReviews}reviews)</span>
				</li>
				<li class="col_11 pL0 mB5">
					<c:forEach begin="1" end="${hotelData.reviews.locationRating}">
						<span class="fullRatingstar_icon_circle fL"></span>
					</c:forEach> 
					<c:forEach begin="1" end="${5-hotelData.reviews.locationRating}">
						<span class="fullnoRatingstar_icon_circle fL"></span>
					</c:forEach> 
					<span class="fL mL10">Location</span></li>
				<li class="col_11 pL0 mB5">
					<c:forEach begin="1" end="${hotelData.reviews.roomsRating}">
						<span class="fullRatingstar_icon_circle fL"></span>
					</c:forEach> 
					<c:forEach begin="1" end="${5-hotelData.reviews.roomsRating}">
						<span class="fullnoRatingstar_icon_circle fL"></span>
					</c:forEach> 
					<span class="fL mL10">Rooms</span></li>
				<li class="col_11 pL0 mB5">
					<c:forEach begin="1" end="${hotelData.reviews.serviceRating}">
						<span class="fullRatingstar_icon_circle fL"></span>
					</c:forEach> 
					<c:forEach begin="1" end="${5-hotelData.reviews.serviceRating}">
						<span class="fullnoRatingstar_icon_circle fL"></span>
					</c:forEach> 
					<span class="fL mL10">Service</span></li>
				<li class="col_11 pL0 mB5">
					<c:forEach begin="1"  end="${hotelData.reviews.valueRating}">
						<span class="fullRatingstar_icon_circle fL"></span>
					</c:forEach> 
					<c:forEach begin="1" end="${5-hotelData.reviews.valueRating}">
						<span class="fullnoRatingstar_icon_circle fL"></span>
					</c:forEach> 
					<span class="fL mL10">Value</span></li>
				<li class="col_11 pL0 mB5">
					<c:forEach begin="1"  end="${hotelData.reviews.cleanlinessRating}">
						<span class="fullRatingstar_icon_circle fL"></span>
					</c:forEach> 
					<c:forEach begin="1" end="${5-hotelData.reviews.cleanlinessRating}">
						<span class="fullnoRatingstar_icon_circle fL"></span>
					</c:forEach>
					<span class="fL mL10">Cleanliness</span></li>
			</ul>
			<hr class="brdrBLitGry mT15 mB10">
			<span class="txtClrlitGry">Powered by<img
				src="${ezgImagesPath}/common/tripadvisor.jpg" alt="" class="valign"></span>
		</div>
		<div class="col_6">
			<c:forEach items="${hotelData.reviews.reviewContent}" varStatus="status" var="reviewContent">
			<div <c:if test="${status.index>4}">class='dN'</c:if>>
				<p class="mT10 clearfix">
				<span class="fL">
					<span class="fW600">${reviewContent.title}</span><br> 
					<span class="fS12">by ${reviewContent.author} on ${reviewContent.reviewDate} </span>
				</span> 
				<span class="fR fW600">
					<span class="rating_ct_full_icon"></span> 
					<span class="rating_ct_full_icon"></span> 
					<span class="rating_ct_full_icon"></span>
					<span class="rating_ct_no_icon"></span>
					<span class="rating_ct_no_icon"></span>
				</span>
				</p>
				<p class="mT15 mB15">
					${reviewContent.content}
				</p>
				<hr class="litGry mT10 mB15">
			</div>
			</c:forEach>
			<a href="javascript:void(0);" class="fR hotelDetailShowMore">More reviews</a>
		</div>
	</div>
</article>
