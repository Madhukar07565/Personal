<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 

<section class="followerContr">
	<span class="lftTocSrcResHrdr"> <img
		src="${ezgImagesPath}/dashboard/profile_image1.jpg"
		alt="Radhika Smith">
	</span> <span class="clearfix follower"> <span class="dB mB15"><a
			href="javascript:void(0);" class="button  w120">Edit photo</a></span> <span
		class="posR dB clearfix"><span
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
