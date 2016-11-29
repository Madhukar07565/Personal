<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<footer class="footer">
	<div class="container clearfix">
		<nav>
			<ul class="footerNav">
				<li><a href="javascript:void(0);" onclick="popupwin('about','aboutinner', 'fade')">About us </a></li>
				<li><a href="javascript:void(0);" onclick="popupwin('brochure','brochureinner', 'fade')">Brochure</a></li>
				<li><a href="javascript:void(0);" onclick="popupwin('room','roominner', 'fade')">Press Room</a></li>
				<li><a href="javascript:void(0);" onclick="popupwin('careers','careersinner', 'fade')">Careers</a></li>
				<li><a href="javascript:void(0);" onclick="popupwin('blog','bloginner', 'fade')">Blog</a></li>
			</ul>
		</nav>
		<nav>
			<ul class="footerNav">
				<li><a href="javascript:void(0);" onclick="popupwin('franchisee','franchiseeinner', 'fade')">Franchisee</a></li>
				<li><a href="javascript:void(0);" onclick="popupwin('agent','agentinner', 'fade')">Travel Agent</a></li>
				<li><a href="javascript:void(0);" onclick="popupwin('corporate','corporateinner', 'fade')">Corporate</a></li>
			</ul>
		</nav>
		<nav>
			<ul class="footerNav">
				<li><a href="javascript:void(0);" onclick="popupwin('faq','faqinner', 'fade')">FAQ's</a></li>
				<li><a href="javascript:void(0);" onclick="popupwin('feedback','feedbackinner', 'fade')">Feedback</a></li>
				<li><a href="javascript:void(0);" onclick="popupwin('contact','contactinner', 'fade')">Contact Us</a></li>
			</ul>
		</nav>
		<nav>
			<ul class="footerNav">
				<li><a href="javascript:void(0);" onclick="popupwin('agreement','agreementinner', 'fade')">User agreement </a></li>
				<li><a href="javascript:void(0);" onclick="popupwin('security','securityinner', 'fade')">Payment security </a></li>
				<li><a href="javascript:void(0);" onclick="popupwin('policy','policyinner', 'fade')">Privacy policy</a></li>
				<li><a href="javascript:void(0);" onclick="popupwin('disclaimer','disclaimerinner', 'fade')">Disclaimer</a></li>
			</ul>
		</nav>
		<div class="clrBoth_portrait"></div>
		<div class="card footerLogoPos">
			<img src="${ezgImagesPath }/common/visa.png" alt="Visa" class="logoLeft" />
			<img src="${ezgImagesPath }/common/anab.png" alt="ANAB" class="logoRight" />
			<div class="cB"></div>
			<img src="${ezgImagesPath }/common/masterCard.png" alt="Master Card" class="logoLeft" />
			<img src="${ezgImagesPath }/common/bsi.png" alt="BSI" class="logoRight" /> 
		</div>
		<div class="contactDetail footerLogoPos fR_portrait">
			<p>Follow us</p>
			<p> <span class="facebook fL"></span> <span class="twitter fL"></span> <span class="in_icon fL"></span> <span class="youtube fL"></span> </p>
			<p>Call: 098675645900</p>
			<p>Toll free: 1800 209 0800</p>
			<label>Newsletter: </label>
			<input type="text" class="fL" placeholder="Enter email">
			<a href="javascript:void(0)" class="primaryBtnSubscribe fR">Go</a> 
		</div>
	</div>
	<cms:pageSlot position="HomepageFooterContactDetail" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="HotelFooterContactDetail" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="FlightOneWayFooterContactDetail" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="FlightTwoWayFooterContactDetail" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="FlightMultiWayFooterContactDetail" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
</footer>
<%-- ENQUIRY EMAIL START --%>
<c:set var='templateEnquiryEmailStart' value='<script id="templateEnquiryEmail" type="text/ractive">'/><c:set var='templateEnquiryEmailEnd' value='</script>'/>
<div id="emailviewpanel" class="white_bg pT10 pB10 dN"></div>
${templateEnquiryEmailStart}
	<div class="container">
		<div class="clearfix grey_bg grey_border contrRow pD10 ">
			<h3 class="fS16 mT10">
				<span class="email_icon fL valign mR10"></span><strong>Get in touch</strong><span class=" fR valign"> <strong>Call our travel experts at
						1800 0000 0000</strong></span>
			</h3>
			<hr class="clearfix" />
			<ul class="col_12 mB10 clearfix">
				<li class="col_6"><input type="text" placeholder="Full Name" class="w100pcnt" value="{{fullname}}" /></li>
				<li class="col_6"><input type="text" placeholder="Sector/Destination/Hotel" class="w100pcnt" value="{{destination}}" /></li>
			</ul>
			<ul class="col_12 mB10 clearfix">
				<li class="col_6"><input type="text" placeholder="Mobile Number" class="w100pcnt" value="{{mobileNo.number}}" /></li>
				<li class="col_6"><input type="text" placeholder="Email Address " class="w100pcnt" value="{{email}}" /></li>
			</ul>
			<p class="pL40 clearfix mB15">What would you like to get in touch about?</p>
			<p class="pL40 clearfix mB15 flightWayTab">
				<span id="emailTab1" class="sel"><a href="#" class="button button-primary fL pD5 mR5" onclick="mail('emailTab1','emailContr1')">Feedback</a></span> <span
					id="emailTab2"><a href="#" class="button button-primary fL pD5 mR5" onclick="mail('emailTab2','emailContr2')">Enquiry</a></span> <span id="emailTab3"><a
					href="#" class="button button-primary fL pD5 mR5" onclick="mail('emailTab3','emailContr3')">Idea</a></span> <span id="emailTab4"><a href="#"
					class="button button-primary fL pD5 mR5" onclick="mail('emailTab4','emailContr4')">Question</a></span> <span id="emailTab5"><a href="#"
					class="button button-primary fL pD5 mR5" onclick="mail('emailTab5','emailContr5')">Praise</a></span> <span id="emailTab6"><a href="#"
					class="button button-primary fL pD5 mR5" onclick="mail('emailTab6','emailContr6')">Complaint</a></span>
			</p>
			<div id="emailContr1">
				<span class="pL40 ">Type of Feedback</span> <span><select class="w50pcnt"><option value="feedback">Service</option>
						<option value="feedback">function</option>
						<option value="feedback">Technology</option>
						<option value="feedback">Staff/Personnel</option></select> </span><br>
				<p class="pL40 clearfix mB5 mT15">Enter your message or feedback below</p>
				<p class="pL40 clearfix mB5 mT15">
					<textarea rows="4" cols="50"></textarea>
				</p>
			</div>
			<div id="emailContr2" class="dN">
				<p class="pL40 clearfix mB5 mT15">Enter your message or feedback below</p>
				<p class="pL40 clearfix mB5 mT15">
					<textarea rows="4" cols="50" value="{{remark}}"></textarea>
				</p>
			</div>
			<div id="emailContr3" class="dN">
				<p class="pL40 clearfix mB5 mT15">Enter your message or feedback below</p>
				<p class="pL40 clearfix mB5 mT15">
					<textarea rows="4" cols="50"></textarea>
				</p>
			</div>
			<div id="emailContr4" class="dN">
				<p class="pL40 clearfix mB5 mT15">Enter your message or feedback below</p>
				<p class="pL40 clearfix mB5 mT15">
					<textarea rows="4" cols="50"></textarea>
				</p>
			</div>
			<div id="emailContr5" class="dN">
				<p class="pL40 clearfix mB5 mT15">Enter your message or feedback below</p>
				<p class="pL40 clearfix mB5 mT15">
					<textarea rows="4" cols="50"></textarea>
				</p>
			</div>
			<div id="emailContr6" class="dN">
				<span class="pL40 ">Type of Complaint</span> <span><select class="w50pcnt"><option value="feedback">Supplier</option>
						<option value="feedback">function</option>
						<option value="feedback">Technology</option>
						<option value="feedback">Competition</option></select> </span><br>
				<p class="pL40 clearfix mB5 mT15">Enter your message or feedback below</p>
				<p class="pL40 clearfix mB5 mT15">
					<textarea rows="4" cols="50"></textarea>
				</p>
			</div>
		    <div class="pL40 clearfix mB15 flightWayTab" id="email_captcha"></div>
			<p class="mT15 clearfix">
				<a href="javascript:void(0);" class="button button-primary fR" on-click="startEmailButtonClick()">Send</a>
			</p>
		</div>
	</div>
<script>
captchaIds = 
{
	emailview_captcha_weidget_id:'',
	chatview_captcha_weidget_id:'',
	callview_captcha_weidget_id:'',
};
	var onloadCallback = function() {
		captchaIds.emailview_captcha_weidget_id = grecaptcha.render('email_captcha', {'sitekey' : "${captchaKeyFrontEnd}",'theme' : "${captchaTheme}",'size' : "${captchaSize}"});
		captchaIds.chatview_captcha_weidget_id = grecaptcha.render('chat_captcha', {'sitekey' : "${captchaKeyFrontEnd}",'theme' : "${captchaTheme}",'size' : "${captchaSize}"});
		captchaIds.callview_captcha_weidget_id = grecaptcha.render('call_captcha', {'sitekey' : "${captchaKeyFrontEnd}",'theme' : "${captchaTheme}",'size' : "${captchaSize}"});
	};
</script>
<script
	src="${captchaUrlFrontEnd}&render=explicit&theme=${captchaTheme}&size=${captchaSize}&hl=${captchaLanguage}" async defer>
</script>
${templateEnquiryEmailEnd}
<script type="text/javascript">
var ractiveEnquiry = ractiveEnquiry ? ractiveEnquiry : {};
$(function() {
ractiveEnquiry.emailPanel = new EnquirySpecificReactive({
	el: '#emailviewpanel',
	template: '#templateEnquiryEmail',
	data: {
		title              : '',
		firstName          : '',
		middleName         : '',
		lastName           : '',
		destination        : '',
		email              : '',
		preferredLandline  : '',
		mobileNo: {
			countryCode    : '',
			areaCode       : '',
			number         : '',
		},
		residentialPhoneNo: {
			countryCode    : '',
			areaCode       : '',
			number         : '',
		},
		officePhoneNo: {
			countryCode    : '',
			areaCode       : '',
			number         : '',
		},
		remark             : '',
	},
	generateDataModelFromViewModel: function () {
		var viewModel = this.clone(this.get());
		delete viewModel.residentialPhoneNo;
		delete viewModel.officePhoneNo;
		delete viewModel.isAgree;
	    viewModel.captcha = grecaptcha.getResponse(captchaIds.emailview_captcha_weidget_id);
		return viewModel;
	},
	startEmailButtonClick : function () {
		var checkOptions = [
		                    { keypath: 'fullname',        required: true, pattern: /,/, errors: { pattern: "First name and last name are mandatory." } },
		                    { keypath: 'destination',     lengthRange: [null, 30] },
		                    { keypath: 'mobileNo.number', required: true, type: 'number' },
		                    { keypath: 'remark',          required: true, lengthRange: [10, 100], label: 'Remark' },
		                    { keypath: 'email',           required: true, type: 'email' }
		                   ];
		if (!this.cnk.validator.check(this, checkOptions)) {
			return;
		}
		if (!grecaptcha.getResponse(captchaIds.emailview_captcha_weidget_id)) {
			this.cnk.showDialog('captcha not passed!');
			return;
		}
		var uri = "${encodedContextPath}/enquiry/exec/email";
		this.cnk.submitForm(uri, { data: this.generateDataModelFromViewModel() }, 'get', true);
		$("#emailviewpanel, #callviewpanel, #chatviewpanel").hide("slow");
	}
});
});
</script>
<%-- ENQUIRY EMAIL END --%>




<%-- ENQUIRY CALL START --%>
<c:set var='templateEnquiryCallStart' value='<script id="templateEnquiryCall" type="text/ractive">'/><c:set var='templateEnquiryCallEnd' value='</script>'/>
<div id="callviewpanel" class="white_bg pT10 pB10 dN"></div>
${templateEnquiryCallStart}
	<div class="container">
		<div class="clearfix grey_bg grey_border contrRow pD10">
			<h3 class="fS16 mT10">
				<span class="call_icon_mid  valign mR10"></span><strong>Click to Call</strong>
				<span class="fR mL20">Call our travel experts at 1800 0000 0000 </span>
			</h3>
			<hr class="clearfix" />
			<ul class="col_12 mB10 clearfix">
				<li class="col_6"><input type="text" placeholder="Sector/Destination/Hotel" class="w100pcnt" value="{{destination}}" /></li>
				<li class="col_6"><input type="text" placeholder="Full Name" class="w100pcnt" value="{{fullname}}" /></li>
			</ul>
			<ul class="col_12 mB10 clearfix">
				<li class="col_6"><input type="text" placeholder="Mobile Number" class="w100pcnt" value="{{mobileNo.number}}" /></li>
				<li class="col_6"><input type="text" placeholder="Email Address " class="w100pcnt" value="{{email}}" /></li>
			</ul>
		    <div class="pL40 clearfix mB15 flightWayTab" id="call_captcha"></div>
			<p class="pD20">
				<input id="agreeEnquiryTAC-4589403" type="checkbox" checked="{{isAgree}}" />
				<label for="agreeEnquiryTAC-4589403">I authorize Ezeego1.com to contact me</label>
				<a href="#" class="button button-primary fR" on-click="startCallButtonClick()">Call</a>
			</p>
		</div>
	</div>
${templateEnquiryCallEnd}
<script type="text/javascript">
var ractiveEnquiry = ractiveEnquiry ? ractiveEnquiry : {};
$(function() {
ractiveEnquiry.callPanel = new EnquirySpecificReactive({
	el: '#callviewpanel',
	template: '#templateEnquiryCall',
	data: {
		title              : '',
		firstName          : '',
		middleName         : '',
		lastName           : '',
		destination        : '',
		mobileNo           : {
			countryCode    : '',
			areaCode       : '',
			number         : '',
		},
		email              : '',
		preferredWayToCall : '',
		residentialPhoneNo : {
			countryCode    : '',
			areaCode       : '',
			number         : '',
		},
		isAgree            : true,
	},
	generateDataModelFromViewModel: function () {
		var viewModel = this.clone(this.get());
		delete viewModel.residentialPhoneNo;
		delete viewModel.isAgree;
		viewModel.captcha = grecaptcha.getResponse(captchaIds.callview_captcha_weidget_id);
		return viewModel;
	},
	startCallButtonClick : function () {
		var checkOptions = [
		                    { keypath: 'destination',     lengthRange: [null, 30] },
		                    { keypath: 'fullname',        required: true, pattern: /,/, errors: { pattern: "First name and last name are mandatory." } },
		                    { keypath: 'mobileNo.number', required: true, type: 'number' },
		                    { keypath: 'email',           required: true, type: 'email' }
		                   ];
		if (!this.cnk.validator.check(this, checkOptions)) {
			return;
		}
		if (!grecaptcha.getResponse(captchaIds.callview_captcha_weidget_id)) {
			this.cnk.showDialog('captcha not passed!');
			return;
		}
		var uri = "${encodedContextPath}/enquiry/exec/clickToCall";
		this.cnk.submitForm(uri, { data: this.generateDataModelFromViewModel() }, 'get', true);
		$("#emailviewpanel, #callviewpanel, #chatviewpanel").hide("slow");
	}
});
});
</script>
<%-- ENQUIRY CALL END --%>


<%-- ENQUIRY CHAT START --%>
<c:set var='templateEnquiryChatStart' value='<script id="templateEnquiryChat" type="text/ractive">'/><c:set var='templateEnquiryChatEnd' value='</script>'/>
<div id="chatviewpanel" class="white_bg pT10 pB10 dN"></div>
${templateEnquiryChatStart}
	<div class="container">
		<div class="clearfix grey_bg grey_border contrRow pD10 ">
			<h3 class="fS16 mT10">
				<span class="chat_icon fL valign mR10"></span><strong>Chat live with our experts</strong>
			</h3>
			<hr class="clearfix" />
			<ul class="col_12 mB10 clearfix">
				<li class="col_6"><input type="text" placeholder="Sector/Destination/Hotel" class="w100pcnt" value="{{destination}}" /></li>
				<li class="col_6"><input type="text" placeholder="Full Name" class="w100pcnt" value="{{fullname}}" /></li>
			</ul>
			<ul class="col_12 mB10 clearfix">
				<li class="col_6"><input type="text" placeholder="Mobile Number" class="w100pcnt" value="{{mobileNo.number}}" /></li>
				<li class="col_6"><input type="text" placeholder="Email Address " class="w100pcnt" value="{{email}}" /></li>
			</ul>
		    <div class="pL40 clearfix mB15 flightWayTab" id="chat_captcha"></div>
			<p class="pD20">
				<input id="agreeEnquiryTAC-8945403" type="checkbox" checked="checked" /><label>I authorize Ezeego1.com to contact me</label>
				<a id="agreeEnquiryTAC-8945403" href="#" class="button button-primary fR" on-click="startChatButtonClick()">Start Chat</a>
			</p>
		</div>
	</div>
${templateEnquiryChatEnd}
<script type="text/javascript">
var ractiveEnquiry = ractiveEnquiry ? ractiveEnquiry : {};
$(function() {
ractiveEnquiry.chatPanel = new EnquirySpecificReactive({
	el: '#chatviewpanel',
	template: '#templateEnquiryChat',
	data: {
		title            : '',
		firstName        : '',
		middleName       : '',
		lastName         : '',
		destination      : '',
		mobileNo         : {
			countryCode  : '',
			areaCode     : '',
			number       : ''
		},
		email            : '',
	},
	generateDataModelFromViewModel: function () {
		var viewModel = this.clone(this.get());
		delete viewModel.isAgree;
		viewModel.captcha = grecaptcha.getResponse(captchaIds.chatview_captcha_weidget_id);
		return viewModel;
	},
	startChatButtonClick : function () {
		var checkOptions = [
		                    { keypath: 'destination',     lengthRange: [null, 30] },
		                    { keypath: 'fullname',        required: true, pattern: /,/, errors: { pattern: "First name and last name are mandatory." } },
		                    { keypath: 'mobileNo.number', required: true, type: 'number' },
		                    { keypath: 'email',           required: true, type: 'email' }
		                   ];
		if (!this.cnk.validator.check(this, checkOptions)) {
			return;
		}
		if (!grecaptcha.getResponse(captchaIds.chatview_captcha_weidget_id)) {
			this.cnk.showDialog('captcha not passed!');
			return;
		}
		var uri = "${encodedContextPath}/enquiry/exec/chat";
		this.cnk.submitForm(uri, { data: this.generateDataModelFromViewModel() }, 'get', true);
		$("#emailviewpanel, #callviewpanel, #chatviewpanel").hide("slow");
	}
});
});
</script>
<%-- ENQUIRY CHAT END --%>

<script type="text/javascript">
$("#emailview, #callview, #chatview").click(function() {
	if ($("#" + this.id + "panel").is(':visible')) {
		$("#" + this.id + "panel").hide("slow");
	} else {
		$("#emailviewpanel, #callviewpanel, #chatviewpanel").hide().removeClass("dN");
		$("#" + this.id + "panel").show("slow");
	}

	switch(this.id)
	{
	case "emailview":
		grecaptcha.reset(captchaIds.emailview_captcha_weidget_id);
		break;
	case "callview":
		grecaptcha.reset(captchaIds.callview_captcha_weidget_id);
		break;
	case "chatview":
		grecaptcha.reset(captchaIds.chatview_captcha_weidget_id);
		break;
	}
});
</script>
