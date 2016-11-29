<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<article class=" mB60 ">
	<div class="list-show col_12 pL0 pR0">
		<!--Header with tags-->
		<header class="expandedViewHeader clearfix mB20">
			<p class="fL mR20">
				{{#each travellerTypes}}
					<a href="javascript:void(0)">{{name}}</a>&nbsp;&nbsp;&nbsp;
				{{/each}}
			</p>
		</header>
			<ul class="clearfix">
			<li class="col_4 pR0 mT20 clearfix"><span
				class="saveTag_left fL saveRps_left cB">2 nights free: Book
					before 15 Aug<span class="tagBtm_left fL"></span>
			</span>
				<div class="mB15 holidayCarousel holidayCarouselList clearfix cB">
						<img class="p_pic dN" src="${ezgImagesPath}{{hotelPictureUrl[0]}}"/>
							{{#each hotelPictureUrl}}
								<div>
									<img src="${ezgImagesPath}{{.}}"/>
								</div>
							{{/each}}
				</div> <span class="clearfix dB"> <span class="heart fL mL0 mT3"></span>
					<span class="fL mR7 mT5"><strong>242</strong></span> <span
					class="fL mR2"><img src="${ezgImagesPath}/common/hUser1.png"
						alt="User1"></span> <span class="fL mR2"><img
						src="${ezgImagesPath}/common/hUser2.png" alt="User2"></span> <span class="fL"><img
						src="${ezgImagesPath}/common/hUser3.png" alt="User3"></span>
			</span></li>
			<li class="col_4">
				<h3 class="mB10 fS18">{{brand}}</h3>
				<input type="hidden" name="hotelRating" value="{{hotelRating}}"/>
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
					<span class="fL mR10"><span class="location_point"></span></span> 
					<span class="fL fS12">{{address}}
				</span>
			</span> <span class="clearfix pD10 pL0 dB"> <span
					class="hotel_facility1_icon mR10"></span> 
					<span
					class="hotel_facility2_icon mR10"></span>
					<span
					class="hotel_facility3_icon mR10"></span>
					<span
					class="hotel_facility4_icon mR10"></span>
					<span
					class="hotel_facility5_icon mR10"></span>
			</span> <span class="dB fS22 mB10"> 4.5/5 Excellent </span> <span
				class="clearfix dB"> <img src="${ezgImagesPath}/common/tripadvisor.png"
					alt="Trip Advisor" /> <span class="fS12">(based on 250
						reviews)</span>
			</span>
			</li>
			<li class="col_4">
				<span class="fS11 notifyColor mB15 dB">Booked 2 min ago !</span> 
				<strong class="dB">Pay@hotel</strong>
				<span>Free Cancellation</span>
				<span class="fS12 mL5">until 17 Aug</span>
				<div class="avgPrice">
					<div class="priceTable">
					<span class="strikeOut dB">
						<span class="">{{showPrice.currency}}</span>{{showPrice.avgPrice}}
					</span> 
					<span class="fS27 dB">
						<span>{{showPrice.currency}}{{showPrice.avgPriceAfterDisCount}}</span>
						<span class="faq_sml_icon mL10" style="margin-right: 56px;"></span>
					</span> 
					</div>
					<span class="fS12  dB mB15">Average / Night</span> 
				</div>
				<div class="totalPrice dN">
					<div class="priceTable">
					<span class="strikeOut dB">
						<span class="">{{showPrice.currency}}</span>{{showPrice.totalPrice}}</span> 
					<span class="fS27 dB">
						<span>{{showPrice.currency}}{{showPrice.totalPriceAfterDisCount}}</span>
						<span class="faq_sml_icon mL10" style="margin-right: 56px;"></span>
					</span> 
				</div>
				<span class="fS12  dB mB15">Total Price</span> 
				</div>
				
				<span class="clearfix dB mT10"> 
					<a href="javascript:void(0);" class="button button-primary dB mB5 selectRoom">Select room</a> 
					<input type="hidden" value="{{id}}"/> 
					<span class="empty_heart fL mR10"></span> 
					<span class="share_icon1 fL"></span>
				</span>
			</li>
		</ul>
	</div>
	<br class="cB"> <span class="addToCompListView"> <input
		type="checkbox" data-id="{{id}}" class="comparePanel"> <label
		for="{{id}}">Add to compare</label>
	</span>
</article>
