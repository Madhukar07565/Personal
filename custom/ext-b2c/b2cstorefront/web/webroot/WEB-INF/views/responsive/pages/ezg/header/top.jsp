<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
 <!--=== Header ===-->
  <header class="header">
    <div class="container clearfix">
      <div class="col_4 col_md_5 col_sm_3 pL0 pR0"> <a href="${fullContextPath}"><img class="logo" src="${ezgImagesPath }/common/logo.png" alt="Ezeego1"/><span class="isoText">ISO 9001: 2008 certified</span></a> </div>
      <div class="col_8 col_md_7 col_sm_7 mT5 pR0 pL0">
        <ul class="globalNav">
          <li>Call: 09867 565 900</li>
          <li class="devider">&nbsp;</li>
          <li>Toll free : 1800 209 0800</li>
        </ul>
        <span class="globalSrc">
        <input type="text" placeholder="Search" class="fL">
        </span>
        <div class="fR clearfix"> 
          
        <sec:authorize ifAnyGranted="ROLE_ANONYMOUS">
          <!-- My account trigger -->
          <div class="globalLogin listMenuLink globalLoginPd" id="myAccount"> <a href="javascript:void(0)">My Account</a> </div>
          
          <!-- My account menu   -->
          <ul  class="userMenu globalLoginPd" id="userMenu">
            <li><a href="${fullContextPath}/register/">Sign up</a></li>
            <li><a href="javascript:void(0);"  onClick="popupwin('loginCont', 'black_overlay')">Login</a></li>
            <li><a href="javascript:void(0);">Manage bookings</a></li>
          </ul>
        </sec:authorize>
        
        <sec:authorize ifNotGranted="ROLE_ANONYMOUS">
          <!-- Logged in trigger -->
          <c:set var="maxNumberChars" value="18"/>
          <c:if test="${fn:length(user.name) gt maxNumberChars}">
              <c:set target="${user}" property="firstName" value="${fn:substring(user.name, 0, maxNumberChars)}..."/>
          </c:if>
          <div class="globalLogin listMenuLink globalLoginPd" id="loggedInUser"> <a href='javascript:void(0);'>${user.name}</a> </div>
          
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
    </div>
    
    <cms:pageSlot position="SectionPop" var="feature">
        <cms:component component="${feature}" />
    </cms:pageSlot>
  </header>
  <!--=== End Header ===--> 