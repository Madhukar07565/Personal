<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!--  Forgot password overlay begins here -->
<div class="overlay_content posF" id="forgotPassword">
<div class="login_content_inner">
<div class="closeBtn_popup fR" onclick="popupclose('forgotPassword', 'black_overlay')"></div>
	<form:form id="requestResetPasswordForm" onsubmit="return false;">
    <h3 class="mB20 fS18 fW600">Forgot password</h3> 
    <p class="mB10">Please enter your e-mail address &amp; we will send you a confirmation mail to reset your password.</p>
    <input name="userId" type="text" placeholder="Enter email address" class="w100pcnt mB15" />
   	<div id="div_userIdError" class="dN clearfix txtClrRed fS12">
		<spring:theme code="account.resetpassword.userId.invalid" />
    </div>	
   <a href="javascript:requestResetPassword('${fullContextPath}');" class="button button-primary fR">Submit</a>
   </form:form>
   <div class="cB"></div>
</div>
</div>

<script type="text/javascript">
function requestResetPassword(contextPath) {
	$('#div_userIdError').hide();
	var userId = $("input[name='userId']").val();
	if(userId == "") {
		$('#div_userIdError').show();
		return;
	}
	$.ajax({
		cache : true,
		type : "POST",
		url : contextPath + '/login/resetrequest',
		data : $('#requestResetPasswordForm').serialize(),
		async : false,
		success : function(data) {
        	if(data.status == "OK") {
        		$("input[name='userId']").val("");
        		popupclose('forgotPassword', 'black_overlay');
        		$('#successMessage').html("We have sent a verification link to " + userId + ".");
        		popupwin('forgotPasswordSuccess', 'black_overlay');
        	}else{
        		$('#div_userIdError').show();
        	}
		}
	});
}
</script>

<!-- Forgot password success -->

<div class="overlay_content posF" id="forgotPasswordSuccess">
	<div class="login_content_inner">
		<div class="closeBtn_popup fR" onclick="popupclose('forgotPasswordSuccess', 'black_overlay')"></div>
		<div class="pD10 clearfix pT0">
	          <div class="mB20 fS18 fW600">Forgot password</div> 
	          <p id="successMessage" class="mB10"></p>
	    </div>
	</div>
</div>

<div class="black_overlay" id="black_overlay"></div>
