<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="viewContr3" class="clearfix dN">
</div>
<script id="templateGoogleMapList" type="text/ractive" >
<div class="clearfix mB10 mT20">
 		<section class="col_4 col_5_sm  brdrLitGry pL0 pR0 clearfix">
			<p class="mB10 pL10 mT10 fS16 portdN ">
				<a href="javascript:void(0)"
					onclick="popupwin('filterpop','filterpopinner','fade')">
					Filters</a>
			<%--<hr class="litGry clearfix mB5">--%>
			</p>
			<div class=" fS12">
				<span><a href="###" on-click="sort('grid','Price')">Price (low-high)</a></span> | <span class="mL15"><a href="###" on-click="sort('grid','hotelRating')">Star Rating (low-high)</a> </span>
				<hr class="litGry clearfix mB5">
			</div>
			{{#each hotelList:num}}
				<article class="pD10 clearfix hotelInfo">
					<input type="hidden" name="hotelId" value="{{id}}"/>
					<input type="hidden" name="longitude" value="{{marker.longitude}}"/>
					<input type="hidden" name="latitude" value="{{marker.latitude}}"/>
					<p class="w40pcnt fL pR10 pT10">
						<img src="${ezgImagesPath}{{hotelPictureUrl[0]}}" alt="hotel" class="mB10" />
						<span class="clearfix  pL0 dB"> 
							<span class="hotel_facility1_icon mR10"></span> 
							<span class="hotel_facility2_icon mR10"></span>
						</span>
					</p>
					<p class="w60pcnt fL pT10">
						<span class=" dB  fS16">{{brand}}</span> 
							<span class="mB10 dB"> 
							{{#if hotelRating==1}}
								<span class="fullRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
							{{/if}}
							{{#if hotelRating==2}}
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
							{{/if}}
							{{#if hotelRating==3}}
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
							{{/if}}
							{{#if hotelRating==4}}
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
							{{/if}}
							{{#if hotelRating==5}}
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
							{{/if}}
							</span> 
							<span class="dB  mB15">4.5/5 Excellent </span> 
							<span class="fS16 fL dB">
								<span class="">{{showPrice.currency}}</span>
											   {{showPrice.avgPriceAfterDisCount}}
							</span>
							<span class="faq_sml_icon mT5 mL10"></span> 
							<span class="fS12  dB ">Average / Night</span> 
							<span class="fS11 notifyColor mB15 dB ">Booked 2 min ago !</span>
					</p>
					<p class="fS12">
						<input type="checkbox" data-id="{{id}}" class="comparePanel" /> 
						<label for="{{id}}">Add to compare</label>
					</p>
				</article>
				<div class="mapdetail dN" >
				<div id="{{id}}">
					<article class="pD10">
						<span class="saveTag_left fL saveRps_left">2 offers available: 10% discount &nbsp; &nbsp;<span class="tagBtm_left fL"></span>
						</span>
						<br>
						<p class="w40pcnt fL pR10">
							<img src="${ezgImagesPath}{{hotelPictureUrl[0]}}" style="width:80px;height:100px;"/> <span
								class="clearfix  pL0 dB"> <span
								class="hotel_facility1_icon mR10"></span> <span
								class="hotel_facility2_icon mR10"></span>
							</span>
						</p>
						<p class="w60pcnt fL ">
							<span class=" dB  fS16">{{brand}}</span> 
							<span class="mB10 dB"> 
							{{#if hotelRating==1}}
								<span class="fullRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
							{{/if}}
							{{#if hotelRating==2}}
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
							{{/if}}
							{{#if hotelRating==3}}
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
							{{/if}}
							{{#if hotelRating==4}}
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullnoRatingstar_icon"></span> 
							{{/if}}
							{{#if hotelRating==5}}
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
								<span class="fullRatingstar_icon"></span> 
							{{/if}}
							</span>
							<span class="dB  mB15">4.5/5 Excellent </span> 
							<span class="fS16 fL dB">
								<span class="">{{showPrice.currency}}</span>
											   {{showPrice.avgPriceAfterDisCount}}</span>
							<span class="faq_sml_icon mT5 mL10" style=""></span> 
							<span class="fS12  dB ">Average / Night</span> 
							<span class="fS11 notifyColor mB15 dB ">Booked 2 min ago !</span> 
							<a href="javascript:void(0);" class="button button-primary selectRoom">Select room</a>
							<input type="hidden" value="{{id}}"/> 
						</p>
					</article>
				</div>
				</div>
			{{/each}}
		</section>
		<div class="col_8 col_7_sm pR0">
			<ul class="mB10 clearfix">
				<li class="col_6 pR0 pL0"><input type="text"
					class=" ui-autocomplete-input"
					placeholder="Search by hotel name/Chain/landmark"
					autocomplete="off"></li>
				<li class="col_6 pR0">
					<select>
						<option>Select area</option>
						<option>North Goa</option>
						<option>South Goa</option>
						<option>Panjim</option>
						<option>City Centre</option>
						<option>Airport</option>
						<option>Old Goa</option>
					</select>
				</li>
			</ul>
		</div>
		<div id="googleMap" class="col_8 pR0" style="height:800px;"> </div> 
	 </div> 

<div class="white_content posF  popupplay" id="filterpop" style="top: 0; padding-top: 20px; padding-bottom: 20px; height: 100%">
	<div class="white_content_inner w70pcnt w90pcnt_sm clearfix" id="filterpopinner">
		<div class="closeBtn_popup fR mR10 mT5" onclick="popupclose('filterpop', 'fade')"></div>
		<div class="clearfix"></div>
		<div class="clearfix ">
			<section class="mB20   ">
				<div class="col_12">
					<h3>Filters</h3>
					<div class="brdrGry clearfix pD10" id="hotelMapFilterSearch">
						{{#if filterSearch}}
							{{#filterSearch.0}}	
								<div class="clearfix mB10">
									<ul class="clearfix">
										<li class="col_4 pL0">
										<label>Search by hotel name</label>
										<div class="inputFieldContr mB15">
 										<input type="text" value="{{filterSearch.0.values[0].value}}" class="brdrN h25 w80pcnt"/>
           								<span class="search fR " style="cursor:pointer" on-click="submitForm()"></span>
										</div>
										</li>
									</ul>
								</div>
						{{/#filterSearch.0}}
			<ul class="clearfix mB20">
			{{#each filterSearch:index}}
			{{#if index>0 && index<4}}
					<li class="col_4 pL0"><label>{{code}}</label>
						<ul style="overflow-y: auto !important; height: 200px">
							{{#each values}}
							<li class="clearfix mB5">
								<input type="checkbox" checked="{{selected}}">
								<label>{{value}}</label>
							</li>
							{{/each}}
						</ul>
					</li>
			{{/if}}
			{{/each}}
			</ul>
			<ul class="clearfix mB20">
			{{#each filterSearch:index}}
			{{#if index>3 && index <7}}
						{{#if code =='budgetRange'}}
				 <li class="col_4"> 
					<span class="clearfix dB">
                  		<label class="fL">{{name}}</label>
                  		<select class="mL10">
                   		<option value="Rs.">Rs.</option>
                    	<option value="$">$</option>
                  		</select>
                  	</span>
                  <div class="mB15">
                    <div class="mB10">Starting from</div>
                     <div decorator='slider:"filterSearch.5.values[0].doubleValue","filterSearch.5.values[1].doubleValue","filterSearch.5.values[0].selected","filterSearch.5.values[1].selected","submitForm"'></div>
					 <br>
					 <span>{{values[0].doubleValue}}</span>-<span>{{values[1].doubleValue}}</span>
                  </div>
                 <ul>
					{{#each values:index}}
						{{#if index >1}}
            			<li class="clearfix mB5">
              				<input type="checkbox"  name="name" checked="{{selected}}"/>
              				<label for="{{code}}" class="">{{value}}</label>
            			</li>
						{{/if}}
					{{/each}}
          		</ul>
                </li>
				{{else}}
					<li class="col_4 pL0"><label>{{code}}</label>
						<ul style="overflow-y: auto !important; height: 200px">
							{{#each values}}
							<li class="clearfix mB5">
								<input type="checkbox" checked="{{selected}}">
								<label>{{value}}</label>
							</li>
							{{/each}}
						</ul>
					</li>
				{{/if}}
			{{/if}}
			{{/each}}
			</ul>
			<ul class="clearfix mB20">
			{{#each filterSearch:index}}
			{{#if index>6 && index <10}}
				
					<li class="col_4 pL0"><label>{{code}}</label>
						<ul style="overflow-y: auto !important; height: 200px">
							{{#each values}}
							<li class="clearfix mB5">
								<input type="checkbox" checked="{{selected}}">
								<label>{{value}}</label>
							</li>
							{{/each}}
						</ul>
					</li>
			{{/if}}
			{{/each}}
			</ul>
	{{/if}}
	<span class="dB tR">
	<a href="javascript:void(0);" on-click="submitForm()" class="button button-primary">Apply</a></span>
					</div>
				</div>
			</section>
		</div>
	</div>
</div>
</script>
<script>
var ractiveTopHotel = ractiveTopHotel ? ractiveTopHotel : {};
$(function() {
	ractiveTopHotel.filterSearch = new Ractive({
	    el: '#viewContr3',
	    template: '#templateGoogleMapList',
	    data: { 
	    	'filterSearch':${filterSearchViewJson},
	    	'hotelList':${hotelList},
	    	'markers':${markers}
	    },
	    'refresh':function(data){
			var hotelList=data.result;
			var bestrecommands=data.bestPriceRecommend;
			this.set("hotelList",hotelList);
			this.set("hotelRecommendList",bestrecommands);
			this.updateModel(); 
		},
	   	'submitForm':function(){
	   		ractiveTopHotel.submitForm("filterSearch");
	   		}
		});
		$(".hotelInfo").not(".compareCheckbox").click(function() {
			var hotelId = $(this).find("input[name='hotelId']").val();
			var longitude = $(this).find("input[name='longitude']").val();
			var latitude = $(this).find("input[name='latitude']").val();
			initMap(hotelId,longitude,latitude);
		});
	}); 
	function initMap(hotelId,longitude,latitude,markers) {
		$("#googleMap").empty();
		var position;
		if(longitude && latitude){
			position = {
					lat : parseFloat(latitude),
					lng : parseFloat(longitude)
				};
		}else{
			var lat = markers[0].latitude;
			var lng = markers[0].longitude;
			position = {
					lat : parseFloat(lat),
					lng : parseFloat(lng)
				};
		}
		var map = new google.maps.Map(document.getElementById('googleMap'), {
			zoom : 10,
			center : position,
		});
		var contentString = "";
		if (hotelId) {
			contentString = $("#" + hotelId).html();
		}
		var hotelInfowindow = new google.maps.InfoWindow({
			content : contentString
		});
		var hotelMarker, i;
		if(markers){
			 for (i = 0; i < markers.length; i++) {  
				 var lat = parseFloat(markers[i].latitude);
				 var lon = parseFloat(markers[i].longitude);
				  hotelMarker = new google.maps.Marker({
			        position: new google.maps.LatLng(lat,lon),
			        map: map
			      });
			}
		}else{
			hotelMarker = new google.maps.Marker({
				position : position,
				map : map,
			});
		}
		hotelMarker.addListener('click', function() {
			hotelInfowindow.open(map, hotelMarker);
        });
	}

	function viewhotel(selTab, selCont, tabs) {
		for (i = 1; i <= tabs; i++) {
			document.getElementById('viewTab' + i).className = '';
			document.getElementById('viewContr' + i).style.display = 'none'
			if (i == 1) {
				document.getElementById('viewTab' + i).className = 'first';
			}
			if (tabs == 3 && i == 3) {
				document.getElementById('viewTab3').className = 'last';
			}
			if (tabs == 2 && i == 2) {
				document.getElementById('viewTab2').className = 'last';
			}
			$('.filterCtr').show();
			$(".filterOpt").removeClass('col_12');
		}
		document.getElementById(selTab).className = 'sel';
		if (selTab == 'viewTab1') {
			document.getElementById(selTab).className = 'first sel';
			$('.filterCtr').show();
			$(".filterOpt").removeClass('col_12');
		}
		if (tabs == 3 && selTab == 'viewTab3') {
			document.getElementById("viewTab3").className = 'last sel';
			$('.filterCtr').hide();
			$(".filterOpt").addClass('col_12');
		}
		if (tabs == 2 && selTab == 'viewTab2') {
			document.getElementById("viewTab2").className = 'last sel';
			$('.filterCtr').show();
			$(".filterOpt").removeClass('col_12');
		}
		document.getElementById(selCont).style.display = 'block';
		var markers = ${markers};
		
		if(selTab == 'viewTab3')
		initMap(null,null,null,markers);
	}
</script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA1kC8H8NH5rTr2oO7j0yS1YVkSN5HQ7KM&libraries=places&callback=initMap&language=zh" async defer></script>