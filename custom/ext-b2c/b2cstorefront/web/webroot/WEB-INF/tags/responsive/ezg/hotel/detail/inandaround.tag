<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="hotelData" required="true" type="com.cnk.travelogix.common.facades.product.data.hotel.HotelData" %>

<article class="tabContainer pD20 dN" id="inAndAroundHotel">
			<input type="hidden" name="longitude" value="${hotelData.marker.longitude}"/>
			<input type="hidden" name="latitude" value="${hotelData.marker.latitude}"/>
			<div class="col_12 clearfix">
				<div class="col_6">
					<h3>In and around hotel</h3>
					<ul class="greyList col_6 col_12_sm">
					<c:forEach items="${hotelData.landmarksNearby}" var="landMark">
						<li>${landMark.name}</li>
					</c:forEach>
					</ul>
					<ul class="col_6 col_12_sm">
						<c:forEach items="${hotelData.landmarksNearby}" var="landMark">
						<li class="pD5">${landMark.distance}</li>
						</c:forEach>
					</ul>
				</div>
				<div class="col_6 col_12_sm" id="switchMap">
					 <div id="googleMap" style="width:100%;height:300px;"></div>
					 <br> 
					 <a href="javascript:void(0);" id="pdp_sight" class="button button-primary fL mT10 mR5 fS12">Sights</a> 
					 <a href="javascript:void(0);" id="shopping_mall" class="button button-primary fL mT10 mR5 fS12">Shopping</a> 
					 <a href="javascript:void(0);" id="restaurant" class="button button-primary fL mT10 mR5 fS12"> &nbsp; Eat &nbsp; </a> 
					 <a href="javascript:void(0);" id="night_club" class="button button-primary fL mT10 mR5 fS12">Nightlife</a> 
					 <a href="javascript:void(0);" id="lodging" class="button button-primary fL mT10 fS12">Hotels</a>
				</div>
			</div>
		</article>
		<script type="text/javascript">
		var longitude = $("input[name='longitude']").val();
		var latitude = $("input[name='latitude']").val();
		var shopping = [ "shopping_mall", "department_store", "clothing_store", "store", "shoe_store", "convenience_store" ];
		var restaurant = [ "restaurant" ];
		var nightlife = [ "bar", "night_club" ];
		var hotels = [ "lodging" ];
			$("#switchMap a").click(
					function() {
						var switchType = $(this).attr("id");
						if(switchType == 'pdp_sight'){
							initMap(longitude, latitude, []);
						}else if (switchType == 'shopping_mall') {
							initMap(longitude, latitude, shopping);
						} else if (switchType == 'restaurant') {
							initMap(longitude, latitude, restaurant);
						} else if (switchType == 'night_club') {
							initMap(longitude, latitude, nightlife);
						} else if (switchType == 'lodging') {
							initMap(longitude, latitude, hotels);
						}
					});

			function initMap(longitude, latitude, nearBy) {
				$("#googleMap").empty();
				if(!nearBy){
					nearBy=[];
				}
				var position;
				if (longitude && latitude) {
					position = {
						lat : parseFloat(latitude),
						lng : parseFloat(longitude)
					};
				} else {
					position = {
						lat : 39.929772,
						lng : 121.470671
					};
				}
				var map = new google.maps.Map(document
						.getElementById('googleMap'), {
					zoom : 15,
					center : position,
					mapTypeControl : false,
					zoomControl : true,
					scaleControl : true,
					streetViewControl : true
				});
				//view content start
				var contentString = "";
				var hotelInfowindow = new google.maps.InfoWindow({
					content : contentString
				});
				var hotelMarker = new google.maps.Marker({
					position : position,
					map : map,
					title : '',
					draggable : true,
					animation : google.maps.Animation.DROP,
				});
				hotelInfowindow.open(map, hotelMarker);
				hotelMarker.addListener('click', function() {
					hotelInfowindow.open(map, hotelMarker);
				});
				//end
				if(nearBy.length>0){
				//for near by function start
					var newrByInfowindow = new google.maps.InfoWindow();
					var service = new google.maps.places.PlacesService(map);
					service.nearbySearch({
						location : position,
						radius : 500,
						type : nearBy
					}, callback);
	
					function callback(results, status) {
						if (status === google.maps.places.PlacesServiceStatus.OK) {
							for (var i = 0; i < results.length; i++) {
								createMarker(results[i]);
							}
						}
					}
					function createMarker(place) {
						var placeLoc = place.geometry.location;
						var nearBymarker = new google.maps.Marker({
							map : map,
							position : place.geometry.location
						});
						 google.maps.event.addListener(nearBymarker, 'click', function() {
						   newrByInfowindow.setContent(place.name);
						   newrByInfowindow.open(map, this);
						   });
					}
				//end
				}
			}

			$('.tabs .tabLinks a')
					.on(
							'click',
							function(e) {
								var currentAttrValue = $(this).attr('href');
								// Show/Hide Tabs
								$('.tabs ' + currentAttrValue).show().siblings().hide();
								// Change/remove current tab to active
								$(this).parent('li').addClass('sel').siblings()
										.removeClass('sel');
								e.preventDefault();

								var longitude = $("input[name='longitude']")
										.val();
								var latitude = $("input[name='latitude']")
										.val();
								initMap(longitude, latitude);
							});
		</script>
		
		<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA1kC8H8NH5rTr2oO7j0yS1YVkSN5HQ7KM&libraries=places&callback=initMap&language=zh" async defer></script>