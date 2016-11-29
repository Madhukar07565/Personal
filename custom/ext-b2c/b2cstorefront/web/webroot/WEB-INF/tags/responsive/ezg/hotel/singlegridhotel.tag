<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="hotelDataInfo" required="false" type="com.cnk.travelogix.common.facades.product.data.hotel.HotelData" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<input type="hidden" id="widgetAndFacetSearchJson" value="${fn:escapeXml(querys)}"/>
<article class="gridder-list singleHotel">
	<article class="holidayGrayContrInner">
		<!-- Tag panel begins here-->
		<header class="itemHeader">
			<span class="holiday_tag fL mR10"></span>
			<ul class="fL holidayFntClr">
				{{#each travellerTypes}}
					<li><a href="javascript:void(0)">{{name}}</a></li>
				{{/each}}
			</ul>
		</header>
		<!-- Image and social container begins here-->
		<div class="posR">
			<img class="p_pic" src="${ezgImagesPath}{{hotelPictureUrl[0]}}" alt="Deal2" /> 
			<span class="saveTag_left fL saveRps_left">2 offers available: 10% discount &nbsp; &nbsp; 
				<span class="tagBtm_left fL"> </span>
			</span>
			<span class="socialContainer1 w100pcnt">
				<span class="heart fL mL10 mT3"></span> <span class="fL mR7 mT5"><strong>242</strong></span>
				<span class="fL mR2">
					<img src="${ezgImagesPath}/common/hUser1.png" alt="User1">
				</span> 
				<span class="fL mR2">
					<img src="${ezgImagesPath}/common/hUser2.png" alt="User2">
				</span> 
				<span class="fL">
					<img src="${ezgImagesPath}/common/hUser3.png" alt="User3">
				</span> 
				<span class="fR mR10 mT5">
					<span class="fW600 fcOrng">{{reviews.numReviews}}  viewing</span> 
				</span>
			</span>
		</div>
		<!-- Holiday Description-->
		<div class="hotelDescriptionText">
			<h3 id="hotelName1" class="mB5 fS16 mT3">{{brand}}</h3>
			<input type="hidden" name="hotelRating" value="{{hotelRating}}"/>
			<span class="dB">
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
			<span class="holidayDetailsAro fL"></span> 
		</div>
		<!--Pricing Tab-->
		<div class="priceTab">
			<span class="holidayDetailsAro fL"></span>
			<div class="clearfix">
				<span class="clearfix dB fL mT10"> 
				<span class="share_icon1 fL mR10"></span> 
				<span class="empty_heart fL"></span>
				</span>
				<div class="avgPrice">
					<span class="fR tR">
						<span class="fS12 strikeOut dB">
							<span class="">{{showPrice.currency}}</span>{{showPrice.avgPrice}}
						</span> 
						<span class="fS22"> 
							<span class="">{{showPrice.currency}}</span>{{showPrice.avgPriceAfterDisCount}}
							<span class="faq_sml_icon fL mT5 mL10" style="float: right; margin-top: 8px !important; margin-left: 4px !important;"></span>
						</span>
					</span>
				</div>
				<div class="totalPrice dN">
					<span class="fR tR">
						<span class="fS12 strikeOut dB">
							<span class="">{{showPrice.currency}}</span>{{showPrice.totalPrice}}
						</span> 
						<span class="fS22"> 
							<span class="">{{showPrice.currency}}</span>{{showPrice.totalPriceAfterDisCount}}
							<span class="faq_sml_icon fL mT5 mL10" style="float: right; margin-top: 8px !important; margin-left: 4px !important;"></span>
						</span>
					</span>
				</div>
			</div>
		</div>

		<!-- First portlet content begins here-->
		<div class="gridder-content">
			<!--Header with tags-->
			<header class="expandedViewHeader clearfix mB20">
				<p class="fL mR20">
					<span class="holiday_tag fL"></span> 
					{{#each travellerType}}
						<a href="javascript:void(0)">{{.}}</a>&nbsp;&nbsp;&nbsp;
					{{/each}}
				</p>
				<span class="gridder-close fR"></span>
			</header>
			<ul class="clearfix">
					<li class="col_4 posR pR0">
						<span class="saveTag_left fL saveRps_left">Book now: Get 10 % discount on all rooms
							<span class="tagBtm_left fL"></span>
						</span>
						<div class="dB  image_slider">
							{{#each hotelPictureUrl}}
								<div>
									<img src="${ezgImagesPath}{{.}}"/>
								</div>
							{{/each}}
							<span class="arrowPrevSmall"></span> <span class="arrowNextSmall"></span>
						</div> 
						<span class="clearfix dB mT10 mB10"> 
							<span class="heart fL mT3"></span> 
							<span class="fL mR7 mT5">
								<strong>242</strong>
							</span>
							<span class="fL mR2">
								<img src="${ezgImagesPath}/common/hUser1.png" alt="User1" />
							</span> 
							<span class="fL mR2">
								<img src="${ezgImagesPath}/common/hUser2.png" alt="User2" />
							</span> 
							<span class="fL">
								<img src="${ezgImagesPath}/common/hUser3.png" alt="User3" />
							</span>
						</span>
					</li>
				
				<li class="col_5">
					<h3 class="mB10 fS18">{{brand}}</h3> 
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
					<span class="clearfix dB"> 
						<span class="fL mR10">
							<span class="location_point"></span>
						</span> 
						<span class="fL fS12">{{address}}</span>
					</span> 
					<span class="clearfix pD10 pL0 dB"> 
						{{#each facilities.facilitydetails}}
							<span>{{icon}}</span>
						{{/each}}
					</span> 
					<span class="dB fS22 mB10">${hotelDataInfo.reviews.ranking}</span> 
					<span class="clearfix dB"> 
						<img src="${ezgImagesPath}/common/tripadvisor.png" alt="Trip Advisor" />
						<span class="fS12">(based on {{reviews.numReviews}} reviews)</span>
					</span>
				</li>
				<li class="col_3">
					<span class="fS11 notifyColor mB15 dB">Booked 2 min ago !TODO</span> 
						<strong class="dB mB15">Pay@hotelTODO</strong>
					<span class="strikeOut dB"> 
					<span class="">{{showPrice.currency}}</span>{{showPrice.avgPrice}}</span> 
					<span class="fS27 dB">
						<span class="">{{showPrice.currency}}</span>{{showPrice.avgPriceAfterDisCount}} 
						<span class="faq_sml_icon fL mT5 mL10" style="float: right; margin-top: 12px !important; margin-right: 46px;"></span>
					</span>
					<span class="fS12  dB mB15">Average / Night</span> 
						<a href="javascript:void(0);" class="button button-primary dB mB5 selectRoom">Select room</a> 
						<input type="hidden" value="{{id}}"/> 
						<span class="clearfix dB mT10"> 
						<span class="empty_heart fL mR10"></span> 
						<span class="share_icon fL"></span>
					</span>
				</li> 
			</ul>
		</div>
	</article>
	<span class="mT10 dB"> 
		<input type="checkbox" data-id="{{id}}" name="holidays[]" class="comparePanel" /> 
		<label for="{{id}}">Add to compare</label>
	</span>
</article>
