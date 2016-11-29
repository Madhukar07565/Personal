<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template"
	tagdir="/WEB-INF/tags/responsive/ezg/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<template:page pageTitle="${pageTitle}">
	<!--=== Content Container ===-->
	<section class="container" style="min-height: 350px">
		<div class="row col_6 col_sm_12">
			<h2 class="mT20">Reset your password</h2>
			<p class="mB10">A strong password is a combination of letters,
				punctuation marks and is 6 characters long</p>

			<form:form id="resetPasswordForm">
				<input name="password" type="password"
					placeholder="Enter new password" class="w50pcnt mB5 mark-should-password">
			   	<div id="div_passwordInvalid" class="dN clearfix txtClrRed fS12">
					<spring:theme code="register.pwd.invalid" />
				</div>	
				<input name="passwordRepeat" type="password" placeholder="Confirm password"
					class="w50pcnt mB15 mark-should-password">
				<div id="div_passwordNotMatch" class="dN clearfix txtClrRed fS12">
					<spring:theme code="validation.checkPwd.equals" />
				</div>
				<div class="mB5 clearfix">
                    <input type="checkbox" id="showP4R" name="showP4R" class="mark-switchP"/>
                    <label for="showP4R">show password</label>
                </div>
				<input name="token" type="hidden" value="${token}" />
				<p class="w50pcnt cB">
					<span class="fR smlBtn"><a
						href="javascript:resetPassword('${fullContextPath}');">Login</a></span>
				</p>
			</form:form>
		</div>
	</section>
	<!--=== End Content Container ===-->

	<script type="text/javascript">
		function resetPassword(contextPath) {
			$('#div_passwordInvalid').hide();
			$('#div_passwordNotMatch').hide();
			if($('input[name="password"]').val() != $('input[name="passwordRepeat"]').val()) {
				$('#div_passwordNotMatch').show();
				return;
			}
			$.ajax({
				cache : true,
				type : "POST",
				url : contextPath + '/login/resetpassword',
				data : $('#resetPasswordForm').serialize(),
				async : false,
				success : function(data) {
					if(data.status == "OK") {
						$('#resultMessage').html("Reset password succeeds.");
		        		popupwin('resetPasswordResult', 'black_overlay');
					}else if(typeof(data.map.password) != 'undefined'){
						$('#div_passwordInvalid').show();
						return;
					}else {
						$('#resultMessage').html("Reset password fails. (" + data.map.__message__ + ")");
		        		popupwin('resetPasswordResult', 'black_overlay');
					}
					returnToHome(contextPath);
				}
			});
		}
		
		function returnToHome(contextPath) {
			window.location.href = contextPath + '/';
		}
	</script>
	
	<div class="overlay_content posF" id="resetPasswordResult">
		<div class="login_content_inner">
			<div class="closeBtn_popup fR" onclick="popupclose('resetPasswordResult', 'black_overlay'); returnToHome('${fullContextPath}');"></div>
			<div class="pD10 clearfix pT0">
		          <div class="mB20 fS18 fW600">Reset password</div> 
		          <p id="resultMessage" class="mB10"></p>
		      </div>
		</div>
	</div>
	<div class="black_overlay" id="black_overlay"></div>
</template:page>