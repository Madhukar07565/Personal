<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme"%>

    <span class="clearfix mT10 fR">
		<span class="primaryBtn fL mR10 mT10"><a href="javascript:ACC.account.saveSettings('${fullContextPath}');">Save Settings</a></span>
		<span class="tertiaryBtn fL mR10 mT10"><a href="javascript:void(0);">Discard Changes</a></span>
	</span>
    <br class="cB">


	<!-- add a note start-->
	  <div class="white_content posF" id="light1">
	    <div class="white_content_inner popupSml">
	      <div class="closeBtn_popup fR" onclick="popupclose('light1', 'fade')"></div>
	      <div class="fS20 mB10">Add a note</div>
	      <div class="mB5">
	        <textarea id="noteContent1" cols="5" rows="5" maxlength="100" class="w100pcnt" placeholder="This is a great way to"></textarea>
	      </div>
	      <div class="cB"></div>
	      <span><span id="charCount1">0</span> of 100</span><br>
	      <div class="smlBtn mT10"><a href="javascript:void(0);" onClick="popupclose('light1', 'fade')">Add</a></div>
	      
	      <!--=== End Search Discover holiday ===-->
	      <div class="cB"></div>
	    </div>
	  </div>
	  <!-- add a note end--> 
	  
	  <!--customise holiday Overlay begins here-->
	  <div class="white_content portrait768" id="customHoliday">
	    <div class="white_content_inner" id="customHolidayInner">
	      <div class="col_12 col_sm_12">
	        <h2 class="mB25 fL">Add</h2>
	        <div class="fR closeBtn_popup mT10" onclick="popupclose('customHoliday','fade')"></div>
	        <div class="cB"></div>
	        <!-- screen1 start -->
	        <div id="ch_screen1">
	          <div class="tC col_2 customize_holiday_add cursor" onclick="popupclose('customHoliday','fade'),popupwin('light2', 'fade')"> <span class="addDay_icon cursor"></span>
	            <div class="fS20 mT10"><a href="javascript:void(0)">Day</a></div>
	          </div>
	          <div class="cB"></div>
	          <div class="fS20 mT20 mB25 tC">or</div>
	          <div class="cB"></div>
	          <div class="customize_holiday clearfix">
	            <ul>
	              <li id="chTab1"><a href="javascript:void(0)" onclick="chSrc('chTab1', 'chContr1')"><span class="flight"></span><span class="mT10 fS18">Flight</span></a></li>
	              <li id="chTab2"><a href="javascript:void(0)" onclick="chSrc('chTab2', 'chContr2')"><span class="hotel"></span><span class="mT10 fS18">Hotel</span></a></li>
	              <li id="chTab3"><a href="javascript:void(0)" onclick="chSrc('chTab3', 'chContr3')"><span class="activity"></span><span class="mT10 fS18">Activity</span></a></li>
	              <li id="chTab4"><a href="javascript:void(0)" onclick="chSrc('chTab4', 'chContr4')"><span class="car"></span><span class="mT10 fS18">Car</span></a></li>
	              <li id="chTab5"><a href="javascript:void(0)" onclick="chSrc('chTab5', 'chContr5')"><span class="bus"></span><span class="mT10 fS18">Bus</span></a></li>
	            </ul>
	          </div>
	          <div class="customize_search clearfix" id="chContr1" style="display:none;"></div>
	          <div class="customize_search clearfix" id="chContr2" style="display:none;">
	            <ul class="searchFlight clearfix">
	              <li class="group1">
	                <label>Destination</label>
	                <input type="text" id="holidayGoingTo"  class=" w100pcnt" placeholder="Singapore">
	              </li>
	              <li class="group1">
	                <label>Check in</label>
	                <input type="text" id="departureDate"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly>
	              </li>
	              <li class="group1">
	                <label>Check out</label>
	                <input type="text" id="returnDate"  class=" w100pcnt dateField" placeholder="dd/mm/yyyy" readonly>
	              </li>
	              <li class="group2">
	                <label>Rooms</label>
	                <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="adultCountDec('roomNumber1')">-</span> <span class="control innerTxtControl" id="roomNumber1">1</span> <span class="control addMinControl plusControl cursor fW600" onclick="adultCountInc('roomNumber1')">+</span> </div>
	              </li>
	              <li class="group2">
	                <label>Adult</label>
	                <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="adultCountDec('AdultNumber1')">-</span> <span class="control innerTxtControl" id="AdultNumber1">1</span> <span class="control addMinControl plusControl cursor fW600" onclick="adultCountInc('AdultNumber1')">+</span> </div>
	              </li>
	              <li class="number group2 mR0">
	                <label>Children</label>
	                <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="childCountDec('ChildNumber1')">-</span> <span class="control innerTxtControl" id="ChildNumber1">0</span> <span class="control addMinControl plusControl cursor fW600" onclick="childCountInc('ChildNumber1')">+</span> </div>
	              </li>
	              <li class="last"> <a href="javascript:void(0);" class=" button button-primary fL mT20" onclick="popupclose('customHoliday','fade'),popupwin('searchResults','fade'),scrollToTop();">Search</a> </li>
	            </ul>
	            <div class="cB"></div>
	          </div>
	          <div class="customize_search clearfix" id="chContr3" style="display:none"></div>
	          <div class="customize_search clearfix" id="chContr4" style="display:none"></div>
	          <div class="customize_search clearfix" id="chContr5" style="display:none"></div>
	          <div class="customize_search clearfix" id="chContr6" style="display:none"></div>
	          <div class="customize_search clearfix" id="chContr7" style="display:none"></div>
	        </div>
	        <!-- screen1 end --> 
	        
	      </div>
	      <div class="cB"></div>
	    </div>
	  </div>
	  <!--customise holiday Overlay ends here--> 
	  
	  <!-- Search results overlay begins here -->
	  
	  <!-- Search results overlay ends here -->
	  
	  
	  
	  <!-- Search results detail overlay ends here --> 
	  
	  <!-- add a day start-->
	  <div class="white_content" id="light2">
	    <div class="white_content_inner popupSml">
	      <div class="closeBtn_popup fR" onclick="popupclose('light2', 'fade')"></div>
	      <div class="fS20 mB10">Add a day</div>
	      <div class="clearfix mB10">
	        <div class="fL mR20 mT5 clearfix">
	          <input type="radio" name="dayType" id="beforeDay" />
	          <label for="beforeDay">Before</label>
	        </div>
	        <div class="fL mR20  mT5 clearfix">
	          <input type="radio" name="dayType" id="afterDay" />
	          <label for="afterDay">After</label>
	        </div>
	        <div class="fL">
	          <select>
	            <option value="Day 1">Day 1</option>
	            <option value="Day 2">Day 2</option>
	            <option value="Day 3">Day 3</option>
	            <option value="Day 4">Day 4</option>
	            <option value="Day 5">Day 5</option>
	          </select>
	        </div>
	      </div>
	      <div class="cB"></div>
	      <div class="smlBtn mT20"><a href="javascript:void(0);" onclick="popupclose('light2', 'fade')">Submit</a></div>
	      
	      <!--=== End Search Discover holiday ===-->
	      <div class="cB"></div>
	    </div>
	  </div>
	  <!-- add a day end--> 
 
    
    <!--  Change Password date -->
     <form:form id="changePwdForm">
	  <div class="white_content" id="reset" style="display:none">
	    <div class="white_content_inner popupSml">
	      <div class="closeBtn_popup fR" onclick="ACC.account.clearClose('reset', 'fade')"></div>
	      <div class="fS20 mB10">Change Password</div>
		  <p class="clearfix">A strong password is a combination of letters, punctuation marks and is 8 characters long.</p>
		  <input type="password" class="mT10 mark-should-password" name="oldPwd" placeholder="Enter Old Password" /><br/>
		  <div id="div_oldPwdError" class="dN clearfix txtClrRed fS12">
		  	<spring:theme code="account.settings.oldPwd.mismatch"/>
		  </div>
		  <input type="password" class="mT10 mark-should-password" name="newPwd" placeholder="Enter New Password" /><br/>
		  <div id="div_pwdError" class="dN clearfix txtClrRed fS12">
		  	<spring:theme code="register.pwd.invalid"/>
		  </div>
		  <input type="password" class="mT10 mark-should-password" name="checkNewPwd" placeholder="Confirm Password" />
		  <div id="div_checkPwdError" class="dN clearfix txtClrRed fS12">
		 	<spring:theme code="account.settings.checkPwd.equals"/>
		  </div>
		  
		   <div class="mB5 clearfix mT5">
           <span class="fL mR10 mT2"><input type="checkbox" id="tSPassword" name="tSPassword" class="mark-switchP"/><label for=""tSPassword""></label></span>
           <span class="fL mLN10">show password</span>
       		</div>
		  
		  <br class="cB"/>
	  
		  <div id="div_changePwdSuccess" class="dN clearfix txtClrRed fS12">
		 	<spring:theme code="account.settings.changePwd.success"/>
		  </div>
	      <div class="smlBtn mT20"><a href="javascript:ACC.account.changePwd('${fullContextPath}');">change</a></div>
	            
	      <div class="cB"></div>
	    </div>
	  </div>
	  </form:form>
	  <!-- end change password date -->
    
    <!-- change emailid container -->
    <form:form id="changeUserNameForm">
	   <div class="white_content" id="mailid" style="display:none">
	    <div class="white_content_inner popupSml">
	      <div class="closeBtn_popup fR" onclick="popupclose('mailid', 'fade')"></div>
	      <div class="fS20 mB10">Change User Name</div>
		  <p class="clearfix"></p>
	      <input type="text" class="mT10" name="newUserName" id="newUserName" placeholder="Enter New Email ID" /><br/>
	      <div id="div_emailError" class="dN clearfix txtClrRed fS12">
		  	<spring:theme code="register.email.invalid"/>
		  </div>
		  <input type="text" class="mT10" name="checkNewUserName" id="checkNewUserName" placeholder="Confirm Email ID" /><br/>
		  <div id="div_checkEmailError" class="dN clearfix txtClrRed fS12">
		  	<spring:theme code="account.settings.checkUserName.equals"/>
		  </div>
		  <input type="password" class="mT10" name="currentPwd" id="currentPwd" placeholder="Enter Current Password" />
		  <br class="cB"/>
		  		  
		  <div id="div_changeUserNameSuccess" class="dN clearfix txtClrRed fS12">
		 	<spring:theme code="account.settings.changeUserName.success"/>
		  </div>
		   <div id="div_oldPwdError" class="dN clearfix txtClrRed fS12">
		  	<spring:theme code="account.settings.oldPwd.mismatch"/>
		  </div>
	      <div class="smlBtn mT20"><a href="javascript:ACC.account.changeUserName('${fullContextPath}');">change</a></div>
	            
	      <div class="cB"></div>
	    </div>
	  </div>
	</form:form>
	<!-- End change emailid container -->
    
    <!-- Deactivate account overlay -->
   	<div class="white_content" id="deactivate" style="display:none; position:fixed">
    <div class="white_content_inner popupSml">
      <div class="closeBtn_popup fR" onclick="popupclose('deactivate', 'fade')"></div>
      <div class="fS20 mB10">Deavtivate account</div>
	  <p class="clearfix">Are you sure you want to deactivate your account</p>
      <span class="smlBtn fL mT20"><a href="javascript:ACC.account.deActivateAccount('${fullContextPath}');" >Confirm</a></span>
	  <span class="smlBtn fL mL10 mT20"><a href="javascript:void(0);" onclick="popupclose('deactivate', 'fade'), setStartingDate()">Cancel</a></span>
      
      
      <div class="cB"></div>
    </div>
  </div>
<!-- End Deactivate account overlay -->