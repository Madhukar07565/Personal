<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--=== Header ===-->
  <header class="ht30"> 
    <!-- Global navigation starts here -->
    
    <div class="container">
      <div class="col_7 globalContact pL0"> <span class="fL mR10">Toll free: 1800 22 1235 / 1800 209 0400 / 098675 65599</span>
        <div class="fL posR"><a title="Change country" class="listMenuLink fL" href="javascript:void(0)"><i id="chngFlag" class="flagIcon in">India</i></a>
          <ul class="listMenu listMenuPicker countryMenu" id="cntList">
            <li class="current"> <a href="javascript:void(0);"><i class="tickMark black"></i>
              <div class="currentCountry">India</div>
              <i class="flagIcon in"></i></a> </li>
            <li> <i></i> <a href="javascript:void(0);">
              <div class="currentCountry">UAE</div>
              <i class="flagIcon ae"></i></a> </li>
            <li> <i></i> <a href="javascript:void(0);">
              <div class="currentCountry">Oman</div>
              <i class="flagIcon om"></i></a> </li>
            <li><i></i><a href="javascript:void(0);">
              <div class="currentCountry">Qatar</div>
              <i class="flagIcon qa"></i></a> </li>
            <li><i></i><a href="javascript:void(0);">
              <div class="currentCountry">Bahrain</div>
              <i class="flagIcon bh"></i></a> </li>
            <li><i></i><a href="javascript:void(0);">
              <div class="currentCountry">Kuwait</div>
              <i class="flagIcon kw"></i></a> </li>
            <li><i></i><a href="javascript:void(0);">
              <div class="currentCountry">Japan</div>
              <i class="flagIcon ja"></i></a> </li>
          </ul>
        </div>
      </div>
      <div class="col_5 pR0 mRn20 pL0">
        <div class="fR posR"><a class="listMenuLink_myaccount fL" href="javascript:void(0)">My account</a>
          <ul class="listMenu listMenuPicker" id="accountList">
            <li class="current"><a href="javascript:void(0);" onClick="popupwin('signup','lightBox')">Signup</a></li>
            <li><a href="javascript:void(0);" onClick="popupwin('logIn','lightBox')">Login</a></li>
            <li><a href="javascript:void(0);">Manage bookings</a></li>
          </ul>
        </div>
        <span class="globalSrc fR">
        <input type="text" class="w90pcnt" placeholder="Search" />
        <span class="srcIcon"></span> </span> </div>
    </div>
    
    <!-- Global navigation end here --> 
  </header>
  <!--=== End Header ===--> 