<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>   

<!--Login overlay container begins here-->
<div class="overlay_content posF" id="loginCont">
<div class="login_content_inner">
<div class="closeBtn_popup fR" onclick="ACC.account.clearClose('loginCont', 'black_overlay')"></div>

<form:form id="loginForm" >
  <c:if test="${sessionScope.allowThirdParty== true }">
  <h3 class="mB10 fS18 fW600">Login with</h3> 
  <div class="mB10 clearfix"> 
  	<c:if test="${fn:containsIgnoreCase(sessionScope.allowedThirdPatries, 'FACEBOOK')}"> <a class="fL mL20 brdrRGrey" href="javascript:void(0)"><span class="facebookLogo fL mR20"></span> </a></c:if>
    <c:if test="${fn:containsIgnoreCase(sessionScope.allowedThirdPatries, 'GOOGLE')}"><a class="fL mL20" href="javascript:void(0)"> <span class="gmailLogo fR"></span> </a></c:if>
  </div>
  <p class="tC fW400">or</p>
  </c:if>
  <h3 class="mB10 fS18 fW600">Ezeego1</h3>
  
  <input type="text" name="j_username" placeholder="Enter username" class="w100pcnt mB5" />
  <div class="password-box">
  <input type="password" name="j_password" placeholder="Enter password" class="w100pcnt mB15" />
  <span class="pSwitcher"></span>
  </div>
  <c:if test="${sessionScope.allowRememberMe== true }">
  <div class="mB5 clearfix">
	  <input type="checkbox" name="_spring_security_remember_me" id="rememberMe" />
	  <label for="rememberMe">Remember me</label>
  </div>
  </c:if> 
  
  <p><a href="javascript:void(0)" onclick="popupclose('loginCont', 'black_overlay'), popupwin('forgotPassword', 'black_overlay')" class="fL">Forgot password?</a></p><br />
  <div class="cB"></div>
  
  <div id="div_badCredential" class="dN clearfix txtClrRed fS12">
  <spring:theme code="account.login.credential.invalid" />
  </div>
  <div id="div_userLocked" class="dN clearfix txtClrRed fS12">	
  </div>
  
  <a href="javascript:ACC.account.login('${fullContextPath}');" class="button button-primary fR mB10">Login</a>
   
  <!--<input type="submit" value="login" class="button button-primary fR mB10" onclick="ACC.account.login();">-->
  
  <div class="cB"></div>
  <a href="javascript:void(0)" onclick="ACC.account.clearClose('loginCont', 'black_overlay');popupwin('signupContainer', 'black_overlay');">New user? Create an account</a>
</form:form>
</div>
</div>

