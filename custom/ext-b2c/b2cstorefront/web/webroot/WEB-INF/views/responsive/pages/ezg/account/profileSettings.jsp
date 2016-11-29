<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme"%>

<script type="text/javascript">
	$(document).ready(function(){
		ACC.account.disablePages('settingsForm','${fullContextPath}', ${customerData.active});
		$('#reSendActivationLink').prop("href","javascript:ACC.account.reSendEmail('${fullContextPath}');").css("color","#4682B4");
		
		ACC.account.bindSiteSettings('${fullContextPath}');
		var defaultWebsite='${customerData.defaultWebSite.isocode}';
		var language='${customerData.language.isocode}';
		var currency='${customerData.currency.isocode}';

		if(defaultWebsite !=""){
			$('#defaultWebsite').val(defaultWebsite);
			ACC.account.addPreferredLanguages();
			ACC.account.addPreferredCurrencies();
			if(preferredLanguage !=""){
				$('#preferredLanguage').val(language);
			}else{
				$('#preferredLanguage').val('0');
			}
			if(preferredCurrency !=""){
				$('#preferredCurrency').val(currency);
			}else{
				$('#preferredCurrency').val('0');
			}
		}else{
			$('#defaultWebsite').val('0');
		}
				
		$('#countrycode').val('${customerData.defaultCountryCode}');
		var displayCode='+' + '${customerData.defaultCountryCode}';
		$('#countryCodeLbl').html(displayCode);
		$('#newCountryCodeLbl').html(displayCode);
		$('#countryCodeHid').val(displayCode);
	});
	
</script>
	
		<!-- Day 1 -->
        <div class="clearfix">
          <header class="diy_headerContr clearfix diy_header"> <samp class="brdrN w20pcnt fW500 fS16imp">Profile Settings</samp>
            <span class="heading"><img src="${ezgImagesPath}/common/collapse.png" alt="Arrow" class="fR mT5"></span> </header>
          
        </div>
        <ul class="diy_results clearfix">
           <li class="brdrBGrey pB20 mB20 mT20 clearfix">
							<h3>Your login details</h3>
							<div class=" col_12 pL0 pR0 mB20">
								<div class="col_4 col_12-sm pD10">
								Username
								</div>
								<div class="col_8"> 
									<div class="col_12 col_12_sm form  ">
											
											<label class="label" id="userName">${customerData.uid}</label>
											<div class="col_12 col_sm_12">
											 <span class="primaryBtn mT30 col_6_sm"><a href="javascript:void(0);" class="link"  onclick="ACC.account.clearChangeUserNameForm();popupwin('mailid', 'fade'),hideDD()">Change Email ID</a></span>
											 <span class="primaryBtn mT30 col_6_sm"><a href="javascript:void(0);" class="link"  onclick="ACC.account.clearChangePwdForm();popupwin('reset', 'fade'),hideDD()">Change Password</a></span></div>
									</div>
								</div>
							</div>
						  </li>
						  <!--  change password ends-->
						  <!--  site settings starts-->
						  <li class="brdrBGrey pB20 mB20 clearfix">
							
							<div class=" col_12 pL0 pR0 mB20">
								<div class="col_4 col_12-sm pD10">
								Site Settings
								</div>
								<div class="col_8">
									<div class="col_12 col_12_sm form">
									<label for="default_website">Default Website</label>
										<select class="mB20 w100pcnt" name="defaultWebsite" id="defaultWebsite">
											<option value="0" selected>Select A country</option>
											 <c:forEach var="country" items="${countries}" varStatus="status">
											 	<option id="${country.isocode}" value="${country.isocode}">${country.name}</option>
											 </c:forEach>
										</select>
										<p class="fade cB">Select a country specific ezeego1  website you want to use – prices, promotions, offers, customer service details and more will change based on this setting</p>
									</div>									
									
									<div class="col_12 col_12_sm form  ">
										<label for="language">Preferred language</label>
										<select class="mB20 w100pcnt" name="preferredLanguage" id="preferredLanguage">
											<option value="0" selected>Select A Language</option>					
										</select>
										<p class="fade cB"></p>
									</div>
									<div class="col_12 col_12_sm form  ">
										<label for="currency">Preferred currency</label>
										<select class="mB20 w100pcnt" name="preferredCurrency" id="preferredCurrency">
											<option value="0" selected>Select A Currency</option>
										</select>
										<p class="fade cB">Select your preferred currency to see prices in the currency of your choice (All prices are in Indian Rupees by default.</p>
									</div>
									
								</div>
							</div>
						  </li>
						  <!--  site settings ends-->
						<!-- newsletter starts-->
						<li class="brdrBGrey pB20 mB20 clearfix">
							<div class=" col_12 pL0 pR0 mB20">
								<div class="col_4 pD10">Offer &amp; Promotions </div>
								<div class="col_8">
									<c:choose>
										<c:when test="${customerData.subscribe==true}">
											<input type="checkbox" id="subscribe" name="subscribe" checked="checked">
										</c:when>
										<c:otherwise>
											<input type="checkbox" id="subscribe" name="subscribe">
										</c:otherwise>
									</c:choose>
									<label>Get Ezeego1 updates for the best travel deals and latest news</label>
										<div class="col_12 form cB">
											<span class="dB emailcmtext">Subscribed at</span>
	 										<div class="pL0 clearfix cB" id="addemail">
										 	<c:if test="${!empty customerData.emails }">
												<c:forEach var="email" items="${customerData.emails}" varStatus="status">
												 <p  class=" firstemail clearfix">
												 	<span id="editmail3"  class=" mT5 fL"><label> <span id="editmailVal3"> ${email}</span></label>
													 </span>
													 <a class="mL10 mT10 fL fS12_sm remove_field" href="javascript:void(0);" onclick="javascript:ACC.account.unSubscribe(this,'${fullContextPath}','${email}');">UnSubscribe</a>
												 </p>
											   </c:forEach>	
	 										</c:if>
	 										</div>
	 										<c:if test="${empty customerData.emails }">
	 										<div class="col_12 cB mB10 pL0 pR0 hidefirstsmail  clearfix ">
											<label>Enter email ID</label>
											<input type="text" placeholder="Enter Email ID" class="w60pcnt mR10 cB fL" name="subscribeEmail"/>
											 <div class="primaryBtn"><a href="javascript:ACC.account.subscribe('${fullContextPath}','/my-account/addEmail');">Subscribe</a></div>
											</div>
											</c:if>
											<div class="col_12 pL0 clearfix cB">
												<div class="fL mT10"> <a href="javascript:void(0);" class="addEmail ">
												<span class="addIcon mR5 fL"></span> 
												<span class="posR fL">Add another Email ID</span> </a> 
												</div>
											</div>
										 </div>
										 <div class="mB20 mT20 addMoreEmail clearfix" style="display:none">
											<input type="text" class="w60pcnt mR10 cB fL" name="newSubscribeEmail" id="newSubscribeEmail"/>
											 <div class="primaryBtn"><a href="javascript:ACC.account.subscribe('${fullContextPath}','/my-account/addAnotherEmail');">Subscribe</a></div>
										 </div>
										 <div id="div_emailFormatError" class="dN clearfix txtClrRed fS12">
										 <spring:theme code="register.email.invalid"/>
										</div>
										<div id="div_emailExist" class="dN clearfix txtClrRed fS12">
										 <spring:theme code="account.settings.addEmail.exist"/>
										</div>
								</div>
							</div>
						  </li>
						  <!-- newsletter ends-->
						  <!-- Activate sms starts-->
						  <li class="brdrBGrey pB20 mB20 clearfix">
							<div class=" col_12 pL0 pR0 mB20">
								<div class="col_4 col_12-sm pD10">Activate SMS notifications
								<p class="fade">On activating, you will be notified about Ezeego1’s promotional and special offers through SMS.</p>
								
								</div>
								<div class="col_8"> 
									<span class="dB smscmtext">SMS notifications are activated on</span>
									 <div class="clearfix"></div>
									 <div class=" mB20 pL0 clearfix cB" id="addnumber">	  
									 	<c:if test="${!empty customerData.mobiles }">
											<c:forEach var="mobile" items="${customerData.mobiles}" varStatus="status">
											 <p class="clearfix ">
												 <span id="editmail3"  class=" mT5 fL"><label> <span>${mobile}</span></label></span>
												 <a class="mL5 mL0_sm mT5 fS12_sm fL remove_field" href="javascript:void(0);" onclick="javascript:ACC.account.deActivateMobile(this,'${fullContextPath}','${mobile}');">Deactivate</a>
											 </p>
										   </c:forEach>	
 										</c:if>									
									 </div>
									<c:if test="${empty customerData.mobiles }">
									<div class="hidefirstsms">
										<div class="col_12  mL10 cB clearfix ">
											<label for="countrycode">Country Code</label>
											<select class="mB20 w60pcnt" name="countrycode" id="countrycode">
												<c:forEach var="country" items="${countries}" varStatus="status">
												 	<option id="${country.isocode}" value="${country.countryCode}">${country.name} (+${country.countryCode})</option>
												</c:forEach>
											</select>									
										</div>
										<div class="col_12  mL10 cB clearfix ">
											<label class="label">Mobile Number</label><br/>
											<label class="mL0 mR10 cB fL" id="countryCodeLbl"></label>
											<input type="hidden" name="countryCode" id="countryCodeHid"/>
											<input type="text" placeholder="Enter Mobile Number" class="w55pcnt mR10 fL" name="mobile"/>
											 <div class="primaryBtn fL"><a href="javascript:ACC.account.activeMobile('${fullContextPath}','/my-account/addMobile');">Activate</a></div>
											 <div class="clearfix"></div>	
										</div>
									</div>
									</c:if>
									
									<div class="col_12 form ">		
										<div class="col_12 p0 clearfix">
											<div class="mT10"> <a href="javascript:void(0);" class="addPhone">
											<span class="addIcon mR5 fL"></span> 
											<span class="posR fL">Add another Mobile Number</span> </a> 
											</div>
										</div>
										
										<div class="mB20 mT20 addMorePhone clearfix" style="display:none">
											<label class="mL0 mR10 cB fL" id="newCountryCodeLbl">+ 885</label>
										<input type="text" placeholder="Enter Mobile Number" class="w55pcnt mR10 fL" name="newMobile"  id="newMobile"/>
										 <div class="primaryBtn fL"><a href="javascript:ACC.account.activeMobile('${fullContextPath}','/my-account/addAnotherMobile');">Activate</a></div>
										</div>
										
										<div id="div_mobileFormatError" class="dN clearfix txtClrRed fS12">
										 <spring:theme code="account.settings.mobile.invalid"/>
										</div>
										<div id="div_mobileExist" class="dN clearfix txtClrRed fS12">
										 <spring:theme code="account.settings.addMobile.exist"/>
										</div>
									</div>
								</div>
							</div>
						  </li>
						  <!-- Activate sms ends-->
						  <!-- Social link starts-->
						<li class="brdrBGrey pB20 mB20 clearfix">
							<div class=" col_12 pL0 pR0 mB20">
								<div class="col_4 pD10">Login with your social account</div>
								<div class="col_8"> 
									<div class="col_4 mL10 pL0 pR0">Connected Networks</div>
									<div class="col_2 mL10  pL0 pR0">
										 
										 <label><img src="${ezgImagesPath}/common/social_fb.png" width="24" height="24" alt="google" /></label>
									</div>
									<div class="col_2 mL10  pL0 pR0">
										
										<label><img src="${ezgImagesPath}/common/social_google_plus.png" width="24" height="24" alt="google" /></label>
									</div>
								</div>
								<div class="clearfix"></div>
								<div class="col_4 pD10">&nbsp;</div>
								<div class="col_8"> 
								<div class="col_4 mL10 pL0 pR0">Add Networks</div>
								    <div class="col_2 mL10  pL0 pR0">
										
										<label><img src="${ezgImagesPath}/common/social_tw.png" width="24" height="24" alt="twitter" class="valign" /></label>
									</div>
									<div class="col_2 mL10  pL0 pR0">
										 
										 <label><img src="${ezgImagesPath}/common/social_yahoo.png" alt="yahoo" width="24" height="24" /></label>
									</div>
								</div>	
									
								
							</div>
						  </li>
						  <!-- Social link ends-->
						  
						  
						   <!-- Add fav starts-->
						<li class="brdrBGrey pB20 mB20 clearfix">
							<div class=" col_12 pL0 pR0 mB20">
								<div class="col_4 pD10">Add to Favorites</div>
								<div class="col_8"> 
									<div class="col_12 mL10 mT10">
										<input type="checkbox" name="addfav" id="addfav" onclick="ACC.account.addToFavorites('${homeLink}')"/>
										<label for="addfav"><img class="valign" src="${ezgImagesPath}/custom/fav.png" alt="fav" />Add Ezeego1 login page to Favorites.</label>
										<p class="fade mL25 cB">To access your Favorites, visit the Favorites Center.</p>
										<div id="div_addFavorite" class="dN clearfix txtClrRed fS12"></div>
									</div>
								</div>
							</div>
						  </li>
						  <!-- Add fav  ends-->
						   <!-- DEACTIVATE starts-->
						<li class="pB20 mB20 clearfix">
							<div class=" col_12 pL0 pR0 mB20">
								<div class="col_4 pD10">Deactivate your account</div>
								<div class="col_8">
									<span class="mB10">Deactivating your account will remove all the saved personal information & your trip details</span><br/><br/><span class="primaryBtn mT10"><a id="deActivateAccount" href="javascript:popupwin('deactivate', 'fade'),hideDD();">Deactivate account</a></span>
									<c:if test="${customerData.active ==false}">
										<br/><br/><span class="mT10"><a id="reSendActivationLink" href="javascript:void(0)">Resend verification link</a></span>
									</c:if>
									
								</div>
							
							</div>
						</li>
        </ul>