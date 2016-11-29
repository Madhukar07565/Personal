<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 

<section class="followerContr">
	<span class="lftTocSrcResHrdr"> <img
		src="${ezgImagesPath}/dashboard/profile_image1.jpg"
		alt="Radhika Smith">
	</span> <span class="clearfix follower"> <span class="dB mB15"><a
			href="dashboard_edit" class="button button-primary w120">Edit</a></span>
		<span class="posR dB clearfix"><span
			class="circle_text notificationCount">5</span><span
			class="mail_dashboard"></span></span>
	</span>
	<ul class="mL20 clearfix">
		<li class="clearfix pT10 pB10"><span
			class="mobile_dashboard_icon fL"></span><span class="fL mT10">${profileData.areaCode[0]} - ${fn:substring(profileData.mobileNumber[0], 0, 5)}&nbsp;${fn:substring(profileData.mobileNumber[0], 5, 10)}</span></li>
		<li class="clearfix pT10 pB10"><span
			class="email_dashboard_icon fL"></span><a
			href="mailto:${profileData.loginEmailId}">${profileData.loginEmailId}</a></li>
		<li class="clearfix pT10 pB10"><span
			class="tweet_dashboard_icon fL"></span><a href="javascript:void(0);"
			class="mT5 fL">@traveljunkie</a></li>
		<li class="clearfix pT10 pB10"><span
			class="facebook_dashboard_icon fL"></span><a
			href="javascript:void(0);" class="fL">facebook.com/radhikas</a></li>
		<li class="clearfix tC pB20"><a href="javascript:void(0);"><strong>www.traveljunkietrip.com</strong></a></li>
	</ul>
</section>
<section class="pLR10 sm_pLR0 mT50 whiteBg ">
	<article class="mL20 mR20">
		<h4 class="mB10">Recent Bookings</h4>
		<ul class="recentList mB20 ">
			<li class="clearfix"><span class="airplaneGrn airplaneAdj"></span><a
				href="javascript:void(0)" class="info">22 Jul, 2013 BOM-DEL ,
					Jet airways</a></li>
			<li class="clearfix"><span class=" hotel_small hotelAdj"></span><a
				href="javascript:void(0)" class="info">22 Jul, 2013 The Grand
					Budapest Hotel </a></li>
			<li class="clearfix"><span class="baggage_icon baggageAdj"></span><a
				href="javascript:void(0)" class="info">14 Jan, 2013 Hongkong
					Dhamaka</a></li>
		</ul>
		<a href="javascript:void(0)" class="fR mB10">View all</a> <br
			class="cB">
	</article>
</section>