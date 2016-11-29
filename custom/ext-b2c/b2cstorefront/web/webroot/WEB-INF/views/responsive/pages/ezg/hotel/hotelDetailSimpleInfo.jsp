<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<li class="col_3 col_sm_12 pR0 pT15">
	<h3 class="mB10">${hotelData.brand}</h3> 
	<span class="detailBlock">
		<span class="dB mB10">
			<c:if test="${hotelData.hotelRating==1}">
				<span class="fullRatingstar_icon"></span> 
				<span class="fullnoRatingstar_icon"></span> 
				<span class="fullnoRatingstar_icon"></span> 
				<span class="fullnoRatingstar_icon"></span> 
				<span class="fullnoRatingstar_icon"></span> 
			</c:if>
			<c:if test="${hotelData.hotelRating==2}">
				<span class="fullRatingstar_icon"></span> 
				<span class="fullRatingstar_icon"></span> 
				<span class="fullnoRatingstar_icon"></span> 
				<span class="fullnoRatingstar_icon"></span> 
				<span class="fullnoRatingstar_icon"></span> 
			</c:if>
			<c:if test="${hotelData.hotelRating==3}">
				<span class="fullRatingstar_icon"></span> 
				<span class="fullRatingstar_icon"></span> 
				<span class="fullRatingstar_icon"></span> 
				<span class="fullnoRatingstar_icon"></span> 
				<span class="fullnoRatingstar_icon"></span> 
			</c:if>
			<c:if test="${hotelData.hotelRating==4}">
				<span class="fullRatingstar_icon"></span> 
				<span class="fullRatingstar_icon"></span> 
				<span class="fullRatingstar_icon"></span> 
				<span class="fullRatingstar_icon"></span> 
				<span class="fullnoRatingstar_icon"></span> 
			</c:if>
			<c:if test="${hotelData.hotelRating==5}">
				<span class="fullRatingstar_icon"></span> 
				<span class="fullRatingstar_icon"></span> 
				<span class="fullRatingstar_icon"></span> 
				<span class="fullRatingstar_icon"></span> 
				<span class="fullRatingstar_icon"></span> 
			</c:if>
		</span> 
		<span class="mB20 clearfix dB">
			<span>${hotelData.address}</span> 
			<span class="clearfix dB mT5" onClick="popupwin('hotelMapView','hotelMapViewinner', 'fade')">
		</span>
		</span> 
	</span> 
	<span class="detailBlock amenitiesDetails mB15"> 
		<span class="mB5 dB">
			<c:forEach	var="facility" items="${hotelData.facilities.facilitydetails}" begin="0" end="2">
					<span>${facility.icon}</span>
			</c:forEach>
		</span> 
		<a href="#amenities" id="shtamenities">More facilities</a>
	</span> 
	<span class="detailBlock"> 
		<span class="mB5 fS22">4.5/5 Excellent</span> 
		<span class="mB5 dB"> 
			<img src="${ezgImagesPath}/common/tripadvisor.png" alt="Trip Advisor" />
		</span> 
		<span class="mB20 dB">(based on 250 reviews)</span> 
		<span class="clearfix dB mB10"> 
			<span class="like mL0 fL"></span> 
			<span class="mT13 fL mR5">230</span> 
			<img src="${ezgImagesPath}/common/user1.png" alt="User 1" class="fL mR2" /> 
			<img src="${ezgImagesPath}/common/user3.jpg" alt="User 2" class="fL mR2" /> 
			<img src="${ezgImagesPath}/common/user4.jpg" alt="User 3" class="fL mR2" />
		</span>
	</span>
</li>