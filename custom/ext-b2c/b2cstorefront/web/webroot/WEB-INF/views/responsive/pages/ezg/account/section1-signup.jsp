<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme"%>

<div class="slideOneBgImg"></div>
<article class="loginContr">
<form:form id="signupForm">
	<h3 class="mB10 fS18 fW600">Sign up with</h3> 
       <div class="mB10 clearfix"> 
       	<a class="fL mL20 brdrRGrey" href="javascript:void(0)"><span class="facebookLogo fL mR20"></span> </a>
           <a class="fL mL20" href="javascript:void(0)"> <span class="gmailLogo fR"></span> </a>
       </div>
       <p class="tC fW500">or</p>
       <h3 class="mB10 fS18 fW600">Ezeego1</h3>
       
       <!--<form name ="myform">-->
       	<input type="text" class=" w90pcnt mB5 fL" placeholder="Enter Email Address" name="email"/>
	 	<%-- <img src="${ezgImagesPath}/common/ajax-loader.gif" alt="" class="fL mL10 mT5" /> --%>
	 	<br class="cB"/>
	 	<div id="div_emailError" class="dN clearfix txtClrRed fS12">
	 	<spring:theme code="register.email.invalid"/>
		</div>
		<div id="div_emailExistedError" class="dN clearfix txtClrRed fS12">
	 	<spring:theme code="registration.error.account.exists.title"/>
		</div>
        
        	<input type="password" class=" w90pcnt mB5 mark-should-password" placeholder="Enter password" name="pwd"/>
        	<div id="div_pwdError" class="dN clearfix txtClrRed fS12">
		 	<spring:theme code="register.pwd.invalid"/>
			</div>
        	<input type="password" class=" w90pcnt mB15 mark-should-password" placeholder="Confirm password" name="checkPwd" />
        	<div id="div_checkPwdError" class="dN clearfix txtClrRed fS12">
		 	<spring:theme code="validation.checkPwd.equals"/>
			</div>
		<!--</form>-->
	
	    <div class="mB5 clearfix">
           <span class="fL mR10 mT2"><input type="checkbox" id="tShowP" name="tShowP" class="mark-switchP"/><label for="tShowP"></label></span>
           <span class="fL mLN10">show password</span>
       </div>

       <div class="mB5 clearfix">
           <span class="fL mR10 mT2"><input type="checkbox" id="tAndC" name="tAndC" /><label for="tAndC"></label></span>
           <span class="fL mLN10">I agree to the <a href="javascript:void(0)">Terms &amp; Conditions</a></span>
       </div>
       <div id="div_tAndCError" class="dN clearfix txtClrRed fS12">
	 	<spring:theme code="validation.tAndC.invalid"/>
		</div>
       
       <div class="mB5 clearfix">
           <span class="fL mR10 mT2"><input type="checkbox" id="subscribe" name="subscribe" /><label for="subscribe"></label></span>
           <span class="fL mLN10 w72pcnt">Subscribe to the newsletter, travel offers &amp; deals</span>
       </div>
       <div id="div_creationFailed" class="dN clearfix txtClrRed fS12">
	 	<spring:theme code="account.register.creation.failed"/>
		</div>
       
       <a href="javascript:ACC.account.signUp('signupForm', '${fullContextPath}');" class="button button-primary fR mB15" >Sign up</a>
       <div class="cB"></div>
   	<a href="javascript:void(0)" onclick="popupwin('loginCont', 'black_overlay')">Already a member? Login</a>
</form:form>
</article>

<article class="slideOneTextContainer">
    <h2 class="sliderHeading_white textShadow">Discover</h2>
    <h3 class="sliderSubHeading_white">Your kind of holiday</h3>
    <p class="sliderDescription_white">Get inspired with holidays ideas shared by 62,354<br /> people like you </p>
</article>

