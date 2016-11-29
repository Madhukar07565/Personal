<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${isSrpBottomFixedBarRequired}">

</c:if>

<!-- start mail-->
<div class="white_content popupplay" id="srpEmail" style="top: 0%; height: 100%; padding-top: 20px; padding-bottom: 20px;">
</div>
<c:out value='<script id="templateEnquirySrpEmail" type="text/ractive">' escapeXml="false" />
	<div class="white_content_inner w70pcnt w90pcnt_sm" id="Emailinner">
		<span class="popup_close_icon fR" onclick="popupclose('srpEmail', 'fade');"></span> <span>Ask Ezeego1</span>





		{{#productInfoList}}
		<div class="cB mT10 grey_border pD15">
			<span class="recyclebin_icon fR mL10" on-click="removeProduct(this)"></span>
			<span class="edit_sml_icon fR" on-click="editDataAtProductPanel(this)"></span>
			<p class="fL fW600">
				<span class="mR15">{{destination}}</span>
			</p>
			<p class="cB clearfix">from {{checkInDate}} to {{checkOutDate}}</p>
		</div>
		{{/productInfoList}}





		<p class="mT20 mB20 tC brdrDLitGry pD15" id="AddPrdct">
			<a href="javascript:void(0)" on-click="addDataAtProductPanel()">+ Add another product</a>
		</p>
		<div class="col_12 col_12_sm mT30 {{isProductPanelShow ? '' : 'dN'}}" id="AddPrdctCntnt">
			<div class="customize_holiday clearfix">
				<ul>
					<li id="chTab1"><a href="javascript:void(0)" onclick="chSrc('chTab1', 'chContr1')"><span class="flight"></span><span class="mT10 fS18">Flight</span></a></li>
					<li id="chTab2" class="sel"><a href="javascript:void(0)" onclick="chSrc('chTab2', 'chContr2')"><span class="hotel"></span><span class="mT10 fS18">Hotel</span></a></li>
					<li id="chTab3"><a href="javascript:void(0)" onclick="chSrc('chTab3', 'chContr3')"><span class="activity"></span><span class="mT10 fS18">Activity</span></a></li>
					<li id="chTab4"><a href="javascript:void(0)" onclick="chSrc('chTab4', 'chContr4')"><span class="car"></span><span class="mT10 fS18">Car</span></a></li>
					<li id="chTab5"><a href="javascript:void(0)" onclick="chSrc('chTab5', 'chContr5')"><span class="bus"></span><span class="mT10 fS18">Bus</span></a></li>
				</ul>
			</div>
			<div class="customize_search clearfix" id="chContr1" style="display: none;"></div>
			<div class="customize_search clearfix" id="chContr2">
				<div class="brdrTrns mT10">
					<ul class="row mB10 clearfix">
						<li class="col_6 pR0"><label for="idProductPanelDataDestination">Destination</label>
							<div class="clearfix">
								<input id="idProductPanelDataDestination" type="text" class="w100pcnt" value="{{productPanelData.destination}}" placeholder="Enter city" />
							</div></li>
						<li class="col_6"><label>Hotel Name (optional)</label>
							<div class="clearfix">
								<input type="text" class="w100pcnt" value="{{productPanelData.hotelName}}" title="Search" placeholder="Eg. Hilton" />
							</div>
							</li>
					</ul>
					<ul class="row mB10 clearfix">
						<li class="col_3 pR0"><label for="idProductPanelDataCheckInDate">Check-in</label>
						<input id="idProductPanelDataCheckInDate" decorator="datepicker" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" value="{{productPanelData.checkInDate}}" readonly="readonly" /></li>
						<li class="col_3 pR0"><label for="idProductPanelDataCheckOutDate">Check-out</label>
						<input id="idProductPanelDataCheckOutDate" decorator="datepicker" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" value="{{productPanelData.checkOutDate}}" readonly="readonly" /></li>
						<li class="col_2"><label>Night(s)</label> <input type="text" class="w100pcnt" /></li>
					</ul>
					<div id="popuproom1" class="clearfix">
						<ul class="row mB10 mT15 clearfix">
							<li class="col_2 col_6_sm"><label>Rooms</label><input type="text" value="1" maxlength="3" class="w100pcnt" id="roomcount1" value="{{noOfRooms}}" />
							</li>
							<li class="col_1_half pR0 singleRoom"><span class="mT30 fL">Room 1:</span></li>
							<li class="col_2 pL0 singleRoom">
								<label>Adult</label>
								<input type="text" placeholder="1" maxlength="3" class="w100pcnt" />
								<span class="fS11 fL">12+ yrs</span></li>
							<li class="col_2  singleRoom">
								<label>Children</label>
								<input type="text" placeholder="0" maxlength="3" class="w100pcnt" id="childCount1" />
								<span class="fS11 fL">2 - 12 yrs</span></li>
							<li class="col_4 mB10 singleRoom">
								<div class="clearfix"></div>
								<ul id="childage1">
								</ul>
							</li>
						</ul>
					</div>
					<div id="newroom" class="singleRoom"></div>
					<span class="mT15 clearfix mB15" id="hotelOpt1">
						<a href="javascript:void(0);" on-click="toggleProductOptionPanel()">
							<img src="${ezgImagesPath}/{{isProductOptionPanelShow ? 'expand' : 'collapse'}}_blu.png" alt="Arrow" class="mR5 fL mT5" />Hotel options
						</a>
						(Star rating, Property type)
					</span>
					<ul id="hotelContr1" class="{{isProductOptionPanelShow ? '' : 'dN'}} mT10 clearfix">
						<li class="col_4"><label>Star rating</label>
							{{#productPanelData.starRate:index}}
							<div class="fL mR10">
								<input type="checkbox" checked="{{.}}" /> <label><span class="trvGrp">{{index + 1}}</span></label>
							</div>
							{{/productPanelData.starRate}}
						</li>
						<li class="col_6">
							<div>
								<label>Property type</label>
								<dl class="dropdown1">
									<dt>
										<a href="javascript:void(0);" class="grey_border fL"> <span class="hida">All </span>
											<p class="multiSel1"></p>
										</a> <span class="downArrow_icon pD5 fL mLN20  mT15 pD15"></span>
									</dt>
									<dd></dd>
								</dl>
							</div>
						</li>
					</ul>
					<p class="clearfix">
						<span class="fR primaryBtn"><a href="javascript:void(0);" on-click="saveDataAtProductPanel()" id="additemgrp">Add</a></span> <span class="fR tertiaryBtn mR10"><a href="#" on-click="cancelDataAtProductPanel()">Cancel</a></span>
					</p>
				</div>
				<div class="cB"></div>
			</div>
			<div class="customize_search clearfix" id="chContr3" style="display: none"></div>
			<div class="customize_search clearfix" id="chContr4" style="display: none"></div>
			<div class="customize_search clearfix" id="chContr5" style="display: none"></div>
			<div class="customize_search clearfix" id="chContr6" style="display: none"></div>
			<div class="customize_search clearfix" id="chContr7" style="display: none"></div>
		</div>
		<ul class="clearfix grey_bg mT10 pD10">
			<li class="col_4 col_6_sm mT10 valign"><label>Follow up reminder</label></li>
			<li class="col_8 col_6_sm">
				<input decorator="datepicker" class="mR10 dateField" type="text" placeholder="DD/MM/YYYY" />
				<input type="text" class="w100 mR10" placeholder="05:30">
				<select class="w100 valign">
					<option value="AM">AM</option>
					<option value="PM">PM</option>
				</select>
			</li>
		</ul>
		<textarea rows="8" class="w100pcnt mT20" placeholder="Enter comments or special requests here" value="{{remark}}"></textarea>
		<ul class="mB20 clearfix mT10">
			<li class="col_5 pR10 pL0"><label>Attach a document</label> <input type="text" class="w100pcnt" name="upload" placeholder="Attachment" /></li>
			<li class="col_7 pR10 pL0"><label>&nbsp;</label> <span class=""> <input type='file' id='file1' name='file1' /> <span class=" btn-upload1"><a
						href="#">Browse</a></span>
			</span> <span class="tertiaryBtn_sml"><a href="#">Upload</a></span></li>
		</ul>
		<div class="mB20 clearfix mT10" id="srpemail_captcha"></div>
		<p class="mT10">
			<span class="primaryBtn fR mB20"><a href="javascript:void(0);" on-click="startEmailButtonClick()">Send</a></span> <span class="tertiaryBtn fR mR10 mB20"><a
				href="javascript:void(0);" onclick="popupclose('srpEmail', 'fade')">Cancel</a></span>
		</p>
		<div class="cB"></div>
	</div>
<c:out value='</script>' escapeXml="false" />
<script>
    captchaIds = 
           {
    		emailview_captcha_weidget_ids:
    		{
    			currentId : '',
    			id1 : '',
                id2 : '',
    			id3 : '',
                id4 : '',
                id5 : '',
                id6 : '',
    		},
    		chatview_captcha_weidget_id:'',
    		callview_captcha_weidget_id:'',
    		srpemailview_captcha_weidget_id:''
           };
	var onloadCallback = function(){
		captchaIds.srpemailview_captcha_weidget_id = grecaptcha.render('srpemail_captcha', {'sitekey' : "${captchaKeyFrontEnd}",'theme' : "${captchaTheme}",'size' : "${captchaSize}"});
		captchaIds.emailview_captcha_weidget_ids.id1 = grecaptcha.render('email_captcha1', {'sitekey' : "${captchaKeyFrontEnd}",'theme' : "${captchaTheme}",'size' : "${captchaSize}"});
		captchaIds.emailview_captcha_weidget_ids.id2 = grecaptcha.render('email_captcha2', {'sitekey' : "${captchaKeyFrontEnd}",'theme' : "${captchaTheme}",'size' : "${captchaSize}"});
		captchaIds.emailview_captcha_weidget_ids.id3 = grecaptcha.render('email_captcha3', {'sitekey' : "${captchaKeyFrontEnd}",'theme' : "${captchaTheme}",'size' : "${captchaSize}"});
		captchaIds.emailview_captcha_weidget_ids.id4 = grecaptcha.render('email_captcha4', {'sitekey' : "${captchaKeyFrontEnd}",'theme' : "${captchaTheme}",'size' : "${captchaSize}"});
		captchaIds.emailview_captcha_weidget_ids.id5 = grecaptcha.render('email_captcha5', {'sitekey' : "${captchaKeyFrontEnd}",'theme' : "${captchaTheme}",'size' : "${captchaSize}"});
		captchaIds.emailview_captcha_weidget_ids.id6 = grecaptcha.render('email_captcha6', {'sitekey' : "${captchaKeyFrontEnd}",'theme' : "${captchaTheme}",'size' : "${captchaSize}"});
		captchaIds.chatview_captcha_weidget_id = grecaptcha.render('chat_captcha', {'sitekey' : "${captchaKeyFrontEnd}",'theme' : "${captchaTheme}",'size' : "${captchaSize}"});
		captchaIds.callview_captcha_weidget_id = grecaptcha.render('call_captcha', {'sitekey' : "${captchaKeyFrontEnd}",'theme' : "${captchaTheme}",'size' : "${captchaSize}"});
		captchaIds.emailview_captcha_weidget_ids.currentId = captchaIds.emailview_captcha_weidget_ids.id1;//emailTab1
	};
</script>
<script
	src="${captchaUrlFrontEnd}&render=explicit&hl=${captchaLanguage}" async defer>
</script>
<!-- end mail-->

<div class="white_content popupplay" id="emailsendsuccess">
	<div class="white_content_inner popupSml" id="emailsendsuccessinner">
		<div class="popup_close_icon fR" onclick="popupclose('emailsendsuccess', 'fade')"></div>
		<div class="clearfix">
			<p class="col_6 col_12_sm brdrRlitGry lH15 mT15" style="min-height: 50px;">
				<span class="fW600">Your quote has been sent</span><br /> You quote has been delivered to the Ezeego1.
			</p>
			<p class="col_6 col_12_sm lH15" style="min-height: 50px;">
				<span class="fW600">Customer Name :</span><span class="mL10">Amit Trivedi</span><br />
				<span class="fW600">Enquiry ID:</span><span class="mL10">560–2590345</span><br />
				<span class="fW600">Quote ID :</span><span class="mL10">2/A</span><br />
			</p>
			<hr class="litGry mT20" />
			<div class="clearfix"></div>
			<p class="tC mT10 lH15">
				You can now<img src="images/destination_from.png" alt="track" class="mL5 mR5 valign" />TRACK and/or X CANCEL your request from <a
					href="javascript:void(0);" class="grey_border pD3">Enquiries</a>
			</p>
			<hr class="litGry mT20 mB20 clearfix" />
			<span class="primaryBtn fR "><a href="javascript:void(0);" onclick="popupclose('emailsendsuccess', 'fade'),hideDD()">Close</a></span> <span
				class="primaryBtn fR mR20"><a href="javascript:void(0);">Go to Home page</a></span>
		</div>
	</div>
</div>


<script type="text/javascript">
var ractiveEnquiry = ractiveEnquiry ? ractiveEnquiry : {};
$(function() {
ractiveEnquiry.srpEmailPanel = new EnquirySpecificReactive({
	el: '#srpEmail',
	template: '#templateEnquirySrpEmail',
	data: {
		title              : '',
		firstName          : '',
		middleName         : '',
		lastName           : '',
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
		productInfoList    : [],
		// Below are UI elements
		isProductPanelShow : false,
		isProductOptionPanelShow: false,
		productPanelStatus: 'NIL',
		productPanelData: { },
	},
	switchProductPanelStatus: function (statusCode, product) {
		// ADD  -> business logic -> NIL
		// EDIT -> business logic -> NIL
		var productPanelStatus = this.get('productPanelStatus');
		if (productPanelStatus != 'NIL' && statusCode != 'NIL') {
			this.cnk.showDialog('You have data in editing! Please cancel it then try again.');
			return;
		}
		this.set('productPanelStatus', statusCode);
		switch (statusCode) {
			case 'START-ADD':
				this.set('productPanelData', product);
				this.set('isProductPanelShow', true);
				break;
			case 'START-EDIT':
				this.set('productPanelData', product);
				this.set('isProductPanelShow', true);
				break;
			case 'NIL':
				this.set('productPanelData', {});
				this.set('isProductPanelShow', false);
				this.set('isProductOptionPanelShow', false);
				break;
			default:
				break;
		}
		this.update();
	},
	removeProduct: function (product) {
		var productInfoList = this.get('productInfoList');
		for (var i = 0; i < productInfoList.length; i++) {
			if (productInfoList[i].id == product.id) {
				break;
			}
		}
		this.splice('productInfoList', i, 1);
		this.update();
	},
	addDataAtProductPanel: function () {
		this.switchProductPanelStatus('START-ADD', this.createHotelProduct());
	},
	editDataAtProductPanel: function (product) {
		this.switchProductPanelStatus('START-EDIT', this.clone(product));
	},
	cancelDataAtProductPanel: function (product) {
		this.switchProductPanelStatus('NIL', product);
	},
	saveDataAtProductPanel: function () {
		this.updateModel();
		var checkOptions = [
		                    { keypath: 'productPanelData.destination',          required: true },
		                    { keypath: 'productPanelData.checkInDate',          required: true },
		                    { keypath: 'productPanelData.checkOutDate',         required: true }
		                   ];
		if (!this.cnk.validator.check(this, checkOptions)) {
			return;
		}
		var editProduct = this.get('productPanelData');
		var productInfoList = this.get('productInfoList');
		// check if the product in productPanelData is already existing in productInfoList
		var isNewProduct = true;
		for (var i = 0; i < productInfoList.length; i++) {
			console.log(productInfoList[i]);
			if (productInfoList[i].id == editProduct.id) {
				isNewProduct = false;
				break;
			}
		}
		console.log(['isNewProduct', isNewProduct]);
		if (isNewProduct) {
			this.push('productInfoList', editProduct);
			this.set('isProductPanelShow', false);
			this.set('isProductOptionPanelShow', false);
			this.set('productPanelData', {});
		} else {
			productInfoList[i] = editProduct;
		}
		this.update();
		this.switchProductPanelStatus('NIL');
	},
	toggleProductOptionPanel: function (product) {
		this.set('isProductOptionPanelShow', !this.get('isProductOptionPanelShow'));
	},
	createFlightProduct: function () {
		return {
// 			fromTerminal : String
// 			toTerminal : String
// 			fromCity : String
// 			toCity : String
// 			departureDate : Date
// 			numberOfAdult : Integer
// 			numberOfChild : Integer
// 			numberOfInfant : Integer
// 			flightClass : String
// 			specificAirline : String[]
		};
	},
	createHotelProduct: function () {
		return {
			id: (new Date() - 0),
			productType: 'hotel',
			destination : '',
			hotelName: '',
			checkInDate : '',
			checkOutDate : '',
			nights : '',
			noOfRooms : 1,
			starRate : [false, false, false, false, false],
			hotelSearchRooms : [ {adults: 1, children: 1} ]
		};
	},
	generateDataModelFromViewModel: function () {
		var viewModel = this.clone(this.get());
		delete viewModel.residentialPhoneNo;
		delete viewModel.officePhoneNo;
		delete viewModel.isAgree;
		viewModel.captcha = grecaptcha.getResponse(captchaIds.srpemailview_captcha_weidget_id);
		grecaptcha.reset(captchaIds.srpemailview_captcha_weidget_id);
		return viewModel;
	},
	startEmailButtonClick : function () {
		var checkOptions = [
		                    { keypath: 'remark',          required: true, lengthRange: [10, 100], label: 'Remark' }
		                   ];
		if (!this.cnk.validator.check(this, checkOptions)) {
			return;
		}
		if (!grecaptcha.getResponse(captchaIds.srpemailview_captcha_weidget_id)) {
		    this.cnk.showDialog('captcha not passed!');
			return;
		}
		var uri = "${encodedContextPath}/enquiry/exec/email";
		this.cnk.submitForm(uri, { data: this.generateDataModelFromViewModel() }, 'get', true);
		popupclose('srpEmail', 'fade');
		popupwin('emailsendsuccess', 'emailsendsuccessinner','fade');
	}
});
});
//function chSrc() {}
</script>