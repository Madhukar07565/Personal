<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 

	<div class="mT20 mB40">
		<div class="mT20 mB20">
			<label class=" fW500">Your Name </label>
			<input name="firstName" type="text" placeholder="First Name" value="${profileData.firstName}" style="width:15%;" />
			<input name="middleName" type="text" placeholder="Middle Name" value="${profileData.middleName}" style="width:15%;" />
			<input name="lastName" type="text" placeholder="Last Name" value="${profileData.lastName}" style="width:15%;" />
			<div id="div_firstNameError" class="dN clearfix txtClrRed fS12">
	 			<spring:theme code="account.profile.firstname.invalid" />
			</div>	
			<div id="div_middleNameError" class="dN clearfix txtClrRed fS12">
	 			<spring:theme code="account.profile.middlename.invalid" />
			</div>	
			<div id="div_lastNameError" class="dN clearfix txtClrRed fS12">
	 			<spring:theme code="account.profile.lastname.invalid" />
			</div>	
		</div>

		<div class="col_12  pL0 pR0 clearfix">
			<h5 class="mB20">What Type of Traveller You Are:</h5>

			<ul class=" col_3 pL0">
				<li><input type="checkbox" name="chk1"><label>Honeymooner</label></li>
				<li class="mT10"><input type="checkbox" name="chk1"><label>Bird
						Watcher</label></li>
				<li class="mT10"><input type="checkbox" name="chk1"><label>Wildlife
						enthusiast</label></li>
			</ul>
			<ul class=" col_3 pL0">
				<li><input type="checkbox" name="chk1"><label>Luxury
						Traveller</label></li>
				<li class="mT10"><input type="checkbox" name="chk1"><label>History
						Buff</label></li>
				<li class="mT10"><input type="checkbox" name="chk1"><label>Romantic</label></li>
			</ul>
			<ul class=" col_3 pL0">
				<li><input type="checkbox" name="chk1"><label>Photographer</label></li>
				<li class="mT10"><input type="checkbox" name="chk1"><label>Beach
						lover</label></li>
				<li class="mT10"><input type="checkbox" name="chk1"><label>Adventure</label></li>
			</ul>
			<ul class=" col_3 pL0">
				<li><input type="checkbox" name="chk1"><label>Nature
						lover</label></li>
				<li class="mT10"><input type="checkbox" name="chk1"><label>Family</label></li>
				<li class="mT10"><input type="checkbox" name="chk1"><label>Budget
						Traveller</label></li>
			</ul>
		</div>
		<div class="   clearfix pL0 pR0 mT20">
			<label class=" mB10">Suggest a Tag </label><input type="text"
				placeholder="Enter Keyword" class="w60pcnt"
				style="margin-right: 40px;"><a href="javascript:void(0)"
				class="button button-primary button-small">Submit</a>
		</div>
		<div class="   clearfix pL0 pR0 mT20">
			<label class=" mB10">From </label><input type="text"
				placeholder="Mumbai,India" class="w60pcnt">
		</div>
		<div class="  clearfix pL0 pR0 mT20">
			<label class="mB10">Current City </label><input type="text"
				placeholder="California,USAs" class="w60pcnt">
		</div>
		

		
		<div class="searchFlight clearfix pL0 pR0 mT20"
			id="multiwaySearchDefault">
			<label class=" mB10 ">Mobile </label> <input name="areaCode[0]"
				type="text" placeholder="+91" value="${profileData.areaCode[0]}" class="mR10" style="width: 5%;" /> <input
				name="mobileNumber[0]" class="selectContLargeInput"  placeholder="Enter 10 digit mobile number" 
				value="${profileData.mobileNumber[0]}" type="text"
				style="width: 54%;">
		</div>
		<div id="div_areaCodeError1" class="dN clearfix txtClrRed fS12">
			<spring:theme code="account.profile.areacode.invalid" />
		</div>
		<div id="div_mobileNumberError1" class="dN clearfix txtClrRed fS12">
			<spring:theme code="account.profile.mobilenumber.invalid" />
		</div>

		<div id="globalSrcToggle" class="clearfix">
			<div class="searchFlight clearfix dN pT10"
				id="mobileNumber_div2">
				<span> <input name="areaCode[1]" type="text" placeholder="+91" class="mR10"
					style="width: 5%;" value="${profileData.areaCode[1]}"><input name="mobileNumber[1]" class="selectContLargeInput"
					placeholder="Enter 10 digit mobile number" type="text"
					style="width: 54%;" value="${profileData.mobileNumber[1]}">
				</span> <span class="closeMultipleWay"> <span
					onclick="clearAndHideMobileNumber(2)" class="close_multicity_panel fR"
					style="margin-top: -16px; margin-right: 230px;"></span>
				</span>
			</div>
			<div id="div_areaCodeError2" class="dN clearfix txtClrRed fS12">
	 			<spring:theme code="account.profile.areacode.invalid" />
			</div>
			<div id="div_mobileNumberError2" class="dN clearfix txtClrRed fS12">
	 			<spring:theme code="account.profile.mobilenumber.invalid" />
			</div>			
			<div class="searchFlight clearfix dN pT10"
				id="mobileNumber_div3">
				<span> <input name="areaCode[2]" type="text" placeholder="+91" class="mR10"
					style="width: 5%;" value="${profileData.areaCode[2]}"><input name="mobileNumber[2]" class="selectContLargeInput"
					placeholder="Enter 10 digit mobile number" type="text"
					style="width: 54%;" value="${profileData.mobileNumber[2]}">
				</span> <span class="closeMultipleWay"> <span
					onclick="clearAndHideMobileNumber(3)" class="close_multicity_panel fR"
					style="margin-top: -16px; margin-right: 230px;"></span>
				</span>
			</div>
			<div id="div_areaCodeError3" class="dN clearfix txtClrRed fS12">
	 			<spring:theme code="account.profile.areacode.invalid" />
			</div>
			<div id="div_mobileNumberError3" class="dN clearfix txtClrRed fS12">
	 			<spring:theme code="account.profile.mobilenumber.invalid" />
			</div>
			<div class="searchFlight clearfix dN pT10"
				id="mobileNumber_div4">
				<span> <input name="areaCode[3]" type="text" placeholder="+91" class="mR10"
					style="width: 5%;" value="${profileData.areaCode[3]}"><input name="mobileNumber[3]" class="selectContLargeInput"
					placeholder="Enter 10 digit mobile number" type="text"
					style="width: 54%;" value="${profileData.mobileNumber[3]}">
				</span> <span class="closeMultipleWay"> <span
					onclick="clearAndHideMobileNumber(4)" class="close_multicity_panel fR"
					style="margin-top: -16px; margin-right: 230px;"></span>
				</span>
			</div>
			<div id="div_areaCodeError4" class="dN clearfix txtClrRed fS12">
	 			<spring:theme code="account.profile.areacode.invalid" />
			</div>
			<div id="div_mobileNumberError4" class="dN clearfix txtClrRed fS12">
	 			<spring:theme code="account.profile.mobilenumber.invalid" />
			</div>
			<div class="fL mT10 clearfix   mB15 mT10" id="multiwayAdd"
				onclick="showMoreMobileNumbers();"
				style="margin-right: 68px;">
				<span class="addIcon fL"></span> <span class="fL mT10 cursor"><a
					href="javascript:void(0)">Add another mobile field</a></span>
			</div>
		</div>
		
		<script type="text/javascript">
			// show essential input box to display existing mobile numbers
			for(var i=2; i<=${fn:length(profileData.mobileNumber)}; i++) {
				$("#mobileNumber_div" + i).show();
			}
		</script>

		<div class=" cB   clearfix pL0 pR0 mT20">
			<label class=" mB10">Email ID </label><input name="emailId"
				type="text" placeholder="radhikas@gmail.com" value="${profileData.emailId}" class="w60pcnt">
			<div id="div_emailIdError" class="dN clearfix txtClrRed fS12">
	 			<spring:theme code="account.profile.emailId.invalid" />
			</div>
		</div>
		<div class="   clearfix pL0 pR0 mT20">
			<label class=" mB10 ">Personal Website </label><input type="text"
				placeholder="www.traveljunkietrip.com" class="w60pcnt">
		</div>
		<div class="   clearfix pL0 pR0 mT20">
			<span class=" mB10 fW500">Deactivate Your Account </span><br> <span>Deactivating
				your account will remove all the saved personal information &amp;
				your trip details</span>
		</div>
		<div class="    clearfix pL0 pR0 mT20">
			<a href="javascript:void(0);">Deactivate Your Account</a>
		</div>
	</div>