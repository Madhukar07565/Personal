<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<li class="col_6">
	<div class="clearfix mT20">
		<h3 class="fL">Landmarks nearby</h3>
		<div class="fR clearfix"
			onClick="popupGoogleMap('hotelMapView','hotelMapViewinner', 'fade')">
			<span class="location_point_green fL mR5 mT5"></span><span
				class="fL mT5"><a href="javascript:void(0)">See on map</a></span>
		</div>
	</div>
	<ul class="greyList featuresList">
		<c:forEach items="${hotelData.landmarksNearby}" var="landmark">
			<li>${landmark.distance} from ${landmark.name}</li>
		</c:forEach>
	</ul>
</li>


<div class="overlay_content posF" id="hotelMapView">
	<div class="white_content_inner_map portrait768" id="hotelMapViewinner">
		<div class="closeBtn_popup fR" onclick="popupclose('hotelMapView', 'fade')"></div>
		<div class="pD10 clearfix pT0">
			<h3 class="mB10">The Park Regency</h3>
			<span class="mB10 dB"> 
				<span class="fullRatingstar_icon"></span>
				<span class="fullRatingstar_icon"></span> 
				<span class="fullRatingstar_icon"></span> 
				<span class="fullRatingstar_icon"></span> 
				<span class="fullnoRatingstar_icon"></span>
			</span> 
			<div style="height:400px;">
			
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
</script>