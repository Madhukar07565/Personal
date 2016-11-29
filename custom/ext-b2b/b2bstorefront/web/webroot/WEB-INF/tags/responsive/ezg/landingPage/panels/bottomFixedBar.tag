<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${isBottomFixedBarRequired}">

</c:if>

<!--=== Bottom fixed Bar start ===-->
<div class="btmFix_btmBar btmFix_btmBarPort">
	<div class="container">
		<ul class="bottomFix fR">
			<li class="sel"><a href="javascript:void(0);">Shortlist</a></li>
			<li class="sel"><a href="javascript:void(0);">Cart</a></li>
			<li class="sel posR">
				<a href="javascript:void(0);">
					<span class="fL">Quote</span><span class="shortlistBox mL2" id="sortListNo">0</span>
				</a>
			</li>
			<li class="chat brdrRlitBlu">
				<a href="javascript:void(0);" id="emailview">
					<span class="email_icon mR10 fL"></span> <span class="fL mT5">Email</span>
				</a>
			</li>
			<li class="chat brdrRlitBlu">
				<a href="javascript:void(0);" id="callview">
					<span class="call_icon mR10 fL"></span> <span class="fL mT5"><span class="fR mR30">Call Us</span></span>
				</a>
			</li>
			<li class="chat brdrRN">
				<a href="javascript:void(0);" id="chatview">
					<span class="chat_icon mR10 fL"></span> <span class="fL mT5">Chat</span>
				</a>
			</li>
		</ul>
	</div>
</div>
<!--=== Bottom fixed Bar end ===-->



<!--=== email panel ===-->
<div class="white_bg pT10 pB10 dN footerPanel" id="emailviewpanel"></div>
<c:out value='<script id="templateEnquiryEmail" type="text/ractive">' escapeXml="false" />
	<div class="container">
		<div class="col_12 clearfix col_12_sm fR grey_bg clearfix contrRow pD10 ">
			<div class="popup_close_icon fR clearfix" onclick="$('#emailviewpanel').hide('slow')"></div>
			<div class="col_12 pL0 w100pcnt">
				<h3 class="fS16 mT10">
					<span class="email_icon fL valign mR10"></span><strong>Get in touch</strong><span class=" fR valign"> <strong>Call our travel experts at
							1800 0000 0000</strong></span>
				</h3>
				<hr class="clearfix" />
				<ul class="col_12 mB10 clearfix mT10">
					<li class="col_3"><input type="text" placeholder="Full Name" value="{{fullname}}" class="w100pcnt" /></li>
					<li class="col_3"><input type="text" placeholder="Sector/Destination/Hotel" class="w100pcnt" value="{{destination}}" /></li>
					<li class="col_3"><input type="text" placeholder="Mobile Number" value="{{mobileNo.number}}" class="w100pcnt" /></li>
					<li class="col_3"><input type="text" placeholder="Email Address " value="{{email}}" class="w100pcnt" /></li>
				</ul>
				<p class=" col_3 pL40 clearfix mB10">What would you like to get in touch about?</p>
				<p class=" col_9 pL40 clearfix mB10 flightWayTab">
					<span id="emailTab1" class="sel"><a href="#" class="button button-primary fL pD5 mR15 mT10" onclick="switchMailPanelTab('emailTab1','emailContr1')">Feedback</a></span> <span
						id="emailTab2"><a href="#" class="button button-primary fL pD5 mR15 mT10" onclick="switchMailPanelTab('emailTab2','emailContr2')">Enquiry</a></span> <span
						id="emailTab3"><a href="#" class="button button-primary fL pD5 mR15 mT10" onclick="switchMailPanelTab('emailTab3','emailContr3')">Idea</a></span> <span id="emailTab4"><a
						href="#" class="button button-primary fL pD5 mR15 mT10" onclick="switchMailPanelTab('emailTab4','emailContr4')">Question</a></span> <span id="emailTab5"><a href="#"
						class="button button-primary fL pD5 mR15 mT10" onclick="switchMailPanelTab('emailTab5','emailContr5')">Praise</a></span> <span id="emailTab6"><a href="#"
						class="button button-primary fL pD5 mR15 mT10" onclick="switchMailPanelTab('emailTab6','emailContr6')">Complaint</a></span>
				</p>
				<div id="emailContr1">
					<span class="pL40 ">Type of Feedback</span> <span><select class="w20pcnt">
							<option value="feedback">Service</option>
							<option value="feedback">function</option>
							<option value="feedback">Technology</option>
							<option value="feedback">Staff/Personnel</option>
					</select> </span><br />
					<p class="pL40 clearfix mB5 mT15">Enter your message or feedback below</p>
					<p class="pL40 clearfix mB5 mT15">
						<textarea rows="4" cols="63"></textarea>
					</p>
					<div class="pL40 clearfix mB5 mT15" id="email_captcha1">
					</div>
				</div>
				<div id="emailContr2" class="dN">
					<p class="pL40 clearfix mB5 mT10">Enter your message or feedback below</p>
					<p class="pL40 clearfix mB5 mT15">
						<textarea rows="4" cols="63" value="{{remark}}"></textarea>
					</p>
					<div class="pL40 clearfix mB5 mT15" id="email_captcha2">
					</div>
				</div>
				<div id="emailContr3" class="dN">
					<p class="pL40 clearfix mB5 mT10">Enter your message or feedback below</p>
					<p class="pL40 clearfix mB5 mT15">
						<textarea rows="4" cols="63"></textarea>
					</p>
					<div class="pL40 clearfix mB5 mT15" id="email_captcha3">
					</div>
				</div>
				<div id="emailContr4" class="dN">
					<p class="pL40 clearfix mB5 mT10">Enter your message or feedback below</p>
					<p class="pL40 clearfix mB5 mT15">
						<textarea rows="4" cols="63"></textarea>
					</p>
					<div class="pL40 clearfix mB5 mT15" id="email_captcha4">
					</div>
				</div>
				<div id="emailContr5" class="dN">
					<p class="pL40 clearfix mB5 mT10">Enter your message or feedback below</p>
					<p class="pL40 clearfix mB5 mT15">
						<textarea rows="4" cols="63"></textarea>
					</p>
					<div class="pL40 clearfix mB5 mT15" id="email_captcha5">
					</div>
				</div>
				<div id="emailContr6" class="dN">
					<span class="pL40 ">Type of Complaint</span> <span><select class="w20pcnt">
							<option value="feedback">Supplier</option>
							<option value="feedback">function</option>
							<option value="feedback">Technology</option>
							<option value="feedback">Competition</option>
					</select> </span><br />
					<p class="pL40 clearfix mB5 mT10">Enter your message or feedback below</p>
					<p class="pL40 clearfix mB5 mT15">
						<textarea rows="4" cols="63"></textarea>
					</p>
					<div class="pL40 clearfix mB5 mT15" id="email_captcha6">
					</div>
				</div>
				<p class="mT10 clearfix">
					<a href="javascript:void(0);" on-click="startEmailButtonClick()" class="button button-primary fR">Send</a>
				</p>
			</div>
		</div>
	</div>
<c:out value='</script>' escapeXml="false" />


<div class="white_bg pT10 pB10 dN footerPanel" id="callviewpanel"></div>
<c:out value='<script id="templateEnquiryCall" type="text/ractive">' escapeXml="false" />
	<div class="container">
		<div class="col_12 clearfix col_12_sm fR grey_bg grey_border clearfix contrRow pD10 ">
			<div class="popup_close_icon fR clearfix" onclick="$('#callviewpanel').hide('slow')"></div>
			<div class="col_12 pL0 w100pcnt">
				<div class="w100pcnt mT20 clearfix">
					<span class="call_icon mR10 fL"></span> <span class="fW600 fS21 fL">Click to Call</span><span class="fW600 fS21 fR">Call our travel experts at 1800
						0000 0000 </span>
				</div>
				<hr />
				<div class="clearfix col_12">
					<div class="pR0 pL0 col_6 mT20">
						<input type="text" class="w95pcnt" name="Destination" placeholder="Sector/Destination/Hotel" value="{{destination}}" />
					</div>
					<div class="pR0 pL0 col_5 mT20 mL15">
						<input type="text" class="w95pcnt" name="Destination" placeholder="Full Name" value="{{fullname}}" />
					</div>
				</div>
				<div class="clearfix col_12">
					<div class="pR0 pL0 col_6 mT20">
						<input type="text" class="w95pcnt" name="Destination" placeholder="Mobile Number" value="{{mobileNo.number}}" />
					</div>
					<div class="pR0 pL0 col_5 mT20 mL15">
						<input type="text" class="w95pcnt" name="Destination" placeholder="Email Address" value="{{email}}" />
					</div>
				    <div class="pR0 pL0 col_6 mT20" id="call_captcha">
				    </div>
				</div>
				<div class="fL mT15 mB15 mL20">
					<input type="checkbox" checked="checked" /><label class="label">I authorize Ezeego1.com to contact me</label>
				</div>
				<div class="primaryBtn fR mT15 mB15">
					<a href="javascript:void(0);" on-click="startCallButtonClick()">Call</a>
				</div>
			</div>
		</div>
	</div>
<c:out value='</script>' escapeXml="false" />


<div class="white_bg pT10 pB10 dN footerPanel" id="chatviewpanel"></div>
<c:out value='<script id="templateEnquiryChat" type="text/ractive">' escapeXml="false" />
	<div class="container">
		<div class="col_12 clearfix col_12_sm fR grey_bg grey_border clearfix contrRow pD10 " id="success16">
			<div class="popup_close_icon fR" onclick="$('#chatviewpanel').hide('slow')"></div>
			<div class="col_12 pL0 w100pcnt">
				<div class="w100pcnt clearfix mT20">
					<span class="chat_icon mR10 fL"></span> <span class="fW600 fL fS21 fW600">Chat live with our experts</span>
				</div>
				<hr />
				<div class="clearfix col_12">
					<div class="pR0 pL0 col_6 mT20">
						<input type="text" class="w95pcnt" name="Destination" placeholder="Sector/Destination/Hotel" value="{{destination}}" style="color: rgb(170, 170, 170);" />
					</div>
					<div class="pR0 pL0 col_5 mT20 mL15">
						<input type="text" class="w95pcnt" name="Destination" placeholder="Full Name" value="{{fullname}}" style="color: rgb(170, 170, 170);" />
					</div>
				</div>
				<div class="clearfix col_12">
					<div class="pR0 pL0 col_6 mT20">
						<input type="text" class="w95pcnt" name="Destination" placeholder="Mobile Number" value="{{mobileNo.number}}" style="color: rgb(170, 170, 170);" />
					</div>
					<div class="pR0 pL0 col_5 mT20 mL15">
						<input type="text" class="w95pcnt" name="Destination" placeholder="Email Address" value="{{email}}" style="color: rgb(170, 170, 170);" />
					</div>
				    <div class="pR0 pL0 col_6 mT20" id="chat_captcha">
				    </div>
				</div>
				<div class="fL mT15 mB15 mL20">
					<input type="checkbox" checked="checked" /><label class="label">I authorize Ezeego1.com to contact me</label>
				</div>
				<div class="primaryBtn fR mT15 mB15">
					<a href="javascript:void(0);" on-click="startChatButtonClick()">Start Chat</a>
				</div>
			</div>
		</div>
	</div>
<c:out value='</script>' escapeXml="false" />



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
		viewModel.captcha = grecaptcha.getResponse(captchaIds.emailview_captcha_weidget_ids.currentId);
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
		if (!grecaptcha.getResponse(captchaIds.emailview_captcha_weidget_ids.currentId)) {
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
popupwin('srpEmail', 'Emailinner', 'fade');
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
		grecaptcha.reset(captchaIds.emailview_captcha_weidget_ids.currentId);
		break;
	case "callview":
		grecaptcha.reset(captchaIds.callview_captcha_weidget_id);
		break;
	case "chatview":
		grecaptcha.reset(captchaIds.chatview_captcha_weidget_id);
		break;
	}
});

function switchMailPanelTab(tab, contr) {
	for(var i = 1; i <= 6; i++) {
		var currentTabId = captchaIds.emailview_captcha_weidget_ids["id" + i];
		if("emailTab" + i == tab) {
		    captchaIds.emailview_captcha_weidget_ids.currentId = currentTabId;
		} else {
			grecaptcha.reset(currentTabId); 
		}
		document.getElementById('emailTab'+i).className = '';
		document.getElementById('emailContr'+i).style.display = 'none';
		if (i == 6) {
			document.getElementById('emailTab' + i).className = 'last';	
		}
	}
	document.getElementById(tab).className = 'sel';
	document.getElementById(contr).style.display = 'block'
}
</script>
