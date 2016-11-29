<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!--  Enable account overlay begins here -->
<div class="overlay_content posF" id="enableAccount">
	<div class="login_content_inner">
		<div class="closeBtn_popup fR"
			onclick="popupclose('enableAccount', 'black_overlay')"></div>
		<form:form id="requestEnableAccountForm" onsubmit="return false;">
			<h3 class="mB20 fS18 fW600">Enable / unlock account</h3>
			<p class="mB10">Please enter your e-mail address &amp; we will
				send you a confirmation mail to enable / unlock your account.</p>
			<input name="userId_enableAccount" type="text"
				placeholder="Enter email address" class="w100pcnt mB15" />
			<div id="div_userIdError_enableAccount"
				class="dN clearfix txtClrRed fS12">
				<spring:theme code="account.enableAccount.userId.invalid" />
			</div>
			<a href="javascript:requestEnableAccount('${fullContextPath}');"
				class="button button-primary fR">Submit</a>
		</form:form>
		<div class="cB"></div>
	</div>
</div>

<script type="text/javascript">
	function requestEnableAccount(contextPath) {
		$('#div_userIdError_enableAccount').hide();
		var userId = $("input[name='userId_enableAccount']").val();
		if (userId == "") {
			$('#div_userIdError_enableAccount').show();
			return;
		}
		$.ajax({
			cache : true,
			type : "POST",
			url : contextPath + '/login/enableAccountRequest',
			data : $('#requestEnableAccountForm').serialize(),
			async : false,
			success : function(data) {
				if (data.status == "OK") {
					$("input[name='userId_enableAccount']").val("");
					popupclose('enableAccount', 'black_overlay');
					$('#successMessage_enableAccount').html(
							"We have sent a verification link to " + userId
									+ ".");
					popupwin('enableAccountSuccess', 'black_overlay');
				} else {
					$('#div_userIdError_enableAccount').show();
				}
			}
		});
	}
</script>

<!-- Enable account success -->
<div class="overlay_content posF" id="enableAccountSuccess">
	<div class="login_content_inner">
		<div class="closeBtn_popup fR" onclick="popupclose('enableAccountSuccess', 'black_overlay')"></div>
		<div class="pD10 clearfix pT0">
	          <div class="mB20 fS18 fW600">Enable / unlock account</div> 
	          <p id="successMessage_enableAccount" class="mB10"></p>
	    </div>
	</div>
</div>

<div class="black_overlay" id="black_overlay"></div>