<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!--Signup overlay container begins here-->
<form:form id="popupSignupForm">
    <div class="overlay_content posF" id="signupContainer">
        <div class="login_content_inner">
            <div class="closeBtn_popup fR" onclick="ACC.account.clearClose('signupContainer', 'black_overlay')"></div>
            <form>
                <h3 class="mB10 fS18 fW600">Sign up with</h3> 
                <div class="mB10 clearfix"> 
                    <a class="fL mL20 brdrRGrey" href="javascript:void(0)"><span class="facebookLogo fL mR20"></span> </a>
                    <a class="fL mL20" href="javascript:void(0)"> <span class="gmailLogo fR"></span> </a>
                </div>
                <p class="tC fW400">or</p>
                <h3 class="mB10 fS18 fW600">Ezeego1</h3>
                <input type="text" placeholder="Enter username" class="w90pcnt mB5" name="email"/>
                <br class="cB"/>
			 	<div id="div_emailError" class="dN clearfix txtClrRed fS12">
			 	<spring:theme code="register.email.invalid"/>
				</div>
				<div id="div_emailExistedError" class="dN clearfix txtClrRed fS12">
			 	<spring:theme code="registration.error.account.exists.title"/>
				</div>
		
                <input type="password" placeholder="Enter password" class="w90pcnt mB5 mark-should-password" name="pwd"/>
                <div id="div_pwdError" class="dN clearfix txtClrRed fS12">
			 	<spring:theme code="register.pwd.invalid"/>
				</div>
                <input type="password" placeholder="Confirm password" class="w90pcnt mB15 mark-should-password"  name="checkPwd" />
                <div id="div_checkPwdError" class="dN clearfix txtClrRed fS12">
			 	<spring:theme code="validation.checkPwd.equals"/>
				</div>
				
	 			<div class="mB5 clearfix">
                    <input type="checkbox" id="_showP" name="_showP" class="mark-switchP"/>
                    <label for="_showP">show password</label>
                </div>	
		
                <div class="mB5 clearfix">
                    <input type="checkbox" id="tAndC" name="tAndC" />
                    <label for="tAndC">I agree to the <a href="javascript:void(0)">Terms &amp; Conditions</a></label>
                </div>
                <div id="div_tAndCError" class="dN clearfix txtClrRed fS12">
			 	<spring:theme code="validation.tAndC.invalid"/>
				</div>
		
                <div class="mB5 clearfix">
                     <input type="checkbox" id="subscribe1" name="subscribe" />
                    <label for="subscribe1">Subscribe to the newsletter, travel offers &amp; deals</label>
                </div>
                
                <div id="div_creationFailed" class="dN clearfix txtClrRed fS12">
				 	<spring:theme code="account.register.creation.failed"/>
				</div>
                
                <a href="javascript:ACC.account.signUp('popupSignupForm', '${fullContextPath}');" class="button button-primary fR mB10">Sign up</a>
                <div class="cB"></div>
                <a href="javascript:void(0)" onclick="ACC.account.clearClose('signupContainer', 'black_overlay'), popupwin('loginCont', 'black_overlay')">Already a member? Login</a>
            </form>
        </div>
    </div>


    <!--sign up success overlay begins here -->
    <div class="overlay_content posF" id="signupSuccess">
    
        <article id="sendActivationEmail" class="login_content_inner">
        <div class="closeBtn_popup fR" id="closeBtn"></div>
        	
            
            <h2 class="mB15 fS18 fW600">Sign up</h2>
            <h3 class="mB15 fS16"> Congratulations!</h3>
        </article>
    </div>
</form:form>

<script type="text/javascript">

</script>


