<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="col_3 col_md_7 col_sm_7 mT5 pR0 pL0">
        <div class="fR clearfix"> 
        
        <div class="fL posR" id="unAuthorize">
          <!-- My account trigger -->
          <div class="globalLogin listMenuLink globalLoginPd" id="myAccount"> <a href="javascript:void(0)" id="logInUserName">My Account</a> </div>       
          <!-- My account menu   -->
          <ul  class="userMenu globalLoginPd" id="userMenu">
            <li><a href="${fullContextPath}/register/">Sign up</a></li>
            <li><a href="javascript:void(0);"  onClick="popupwin('loginCont', 'black_overlay')">Login</a></li>
            <li><a href="javascript:void(0);">Manage bookings</a></li>
          </ul>
        </div>
        
        <div class="fL posR" id="authorize">
          <!-- Logged in trigger -->
          <c:set var="maxNumberChars" value="18"/>
          <c:if test="${fn:length(user.name) gt maxNumberChars}">
              <c:set target="${user}" property="firstName" value="${fn:substring(user.name, 0, maxNumberChars)}..."/>
          </c:if>
          <div class="globalLogin listMenuLink globalLoginPd" id="loggedInUser"> <a href='javascript:void(0);' id="loginUserName">${user.name}</a> </div>
          
          <!-- Logged in menu -->
          <ul class="loggedInMenu" id="loggedInMenu">
            <li><a href="${fullContextPath}/cart" class="shoppingCartTrigger">Shopping cart <span></span></a></li>
            <li><a href="${fullContextPath}/my-account/bookList">Bookings</a></li>
            <li class="horzDivider"></li>
            <li><a href="javascript:void(0)">Reports <span class="circle_text">2</span></a></li>
            <li><a href="javascript:void(0)">Shared holidays</a></li>
            <li class="horzDivider"></li>
            <li><a href="javascript:void(0)">Inbox <span class="circle_text">1</span></a></li>
            <li><a href="${fullContextPath}/my-account/wishlist">Wishlist</a></li>
            <li><a href="${fullContextPath}/my-account/dashboard">Profile</a></li>
            <li><a href="${fullContextPath}/my-account/wallet">Wallet</a></li>
            <li class="horzDivider"></li>
            <li><a href="javascript:void(0)">Help</a></li>
            <li><a href="${fullContextPath}/my-account/settings">Settings</a></li>
            <li><a href="${fullContextPath}/logout">Logout</a></li>
          </ul>
        </div>
        
         <sec:authorize ifAnyGranted="ROLE_ANONYMOUS"> 
	        <script type="text/javascript">
	        $('#unAuthorize').show();
	        $('#authorize').hide();
	        </script>
		 </sec:authorize>
		
         <sec:authorize ifNotGranted="ROLE_ANONYMOUS">
          	<script type="text/javascript">
          	$('#unAuthorize').hide();
	        $('#authorize').show();
	        </script>
         </sec:authorize>

          <div class="fL posR countryDropdownPadding" id="countryTrigger"><a title="Change country" class="countryList fL" href="javascript:void(0)"> <i id="selectedFlag" class="flagIcon in">India</i></a>
            <ul class="listMenu" id="cntList">
              <li class="sel"><a href="javascript:void(0);">India<i class="flagIcon in"></i></a></li>
              <li><a href="javascript:void(0);">UAE<i class="flagIcon ae"></i></a></li>
              <li><a href="javascript:void(0);">Oman<i class="flagIcon om"></i></a></li>
              <li><a href="javascript:void(0);">Qatar<i class="flagIcon qa"></i></a></li>
              <li><a href="javascript:void(0);">Bahrain<i class="flagIcon bh"></i></a></li>
              <li><a href="javascript:void(0);">Kuwait<i class="flagIcon kw"></i></a></li>
              <li><a href="javascript:void(0);">Saudi Arabia<i class="flagIcon sa"></i></a></li>
            </ul>
          </div>
        </div>
      </div>
      