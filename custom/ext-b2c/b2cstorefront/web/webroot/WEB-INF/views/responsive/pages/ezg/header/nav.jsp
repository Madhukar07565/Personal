<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>

 <!--=== only for home page ===-->
<div class="primaryNavigation_fixed" id="primary_navigation">
    <nav>
      <div class="container">
        <ul class="lftPnl fL" id="mainNav">
		  <li id="priNav1" onClick="goToElement('bannerSlider');" class="t sel"><a href="javascript:void(0);"><span class="lftPnl1 fL "></span>Flights</a></li>
          <li id="priNav2" onClick="goToElement('bannerSlider');" class="t"><a href="javascript:void(0);"><span class="lftPnl2 fL"></span>Hotels</a></li>
          <li id="priNav3" onClick="goToElement('bannerSlider');" class="t"><a href="javascript:void(0);"><span class="lftPnl3 fL"></span>Flights + Hotels</a></li>
          <li id="priNav4" onClick="goToElement('bannerSlider');" class="t"><a href="javascript:void(0);"><span class="lftPnl4 fL"></span>Holidays</a></li>
          <li id="priNav5" onClick="goToElement('bannerSlider');" class="t"><a href="javascript:void(0);"><span class="lftPnl5 fL"></span>Activities</a></li>
        </ul>
        <div class="more fL posR" id="moreTab">
        <a href="javascript:void(0);" onclick="showMoreOptions()">More<span class="moreAro"></span></a>
          <div class="moreOptionsContainer">
            <ul id="moreOptions" class="dropdown-menu" style="display:none;">
<!-- 			  <li class="sel dN" id="activityDisplay"><a href="javascript:void(0);" onClick="addnewtab(1,'Activities')"><span class="morePnl1 fL"></span>Activities</a></li>
 -->              <li class="sel"><a href="javascript:void(0);" onClick="addnewtab(2,'Bus')"><span class="morePnl1 fL"></span>Bus</a></li>
              <li><a href="javascript:void(0);" onClick="addnewtab(3,'Car')"><span class="morePnl2 fL"></span>Car</a></li>
              <li><a href="javascript:void(0);" onClick="addnewtab(4,'Rail')"><span class="morePnl3 fL"></span>Rail</a></li>
              <li><a href="javascript:void(0);" onClick="addnewtab(5,'Cruise')"><span class="morePnl4 fL"></span>Cruise</a></li>
			  <li><a href="javascript:void(0);" onClick="addnewtab(6,'Flight + Hotel + Car')"><span class="morePnl5 fL"></span>Flight + Hotel + Car</a></li>
			  <li><a href="javascript:void(0);" onClick="addnewtab(7,'Forex')"><span class="morePnl5 fL"></span>Forex</a></li>
              <li><a href="javascript:void(0);" onClick="addnewtab(8,'Insurance')"><span class="morePnl6 fL"></span>Insurance</a></li>
              <li><a href="javascript:void(0);" onClick="addnewtab(9,'Visa')"><span class="morePnl7 fL"></span>Visa</a></li>
            </ul>
          </div>
        </div>
        <a href="javascript:void(0);" class="shareHolidayBtn">Share your holiday<span>Get followers. Make money.</span></a> </div>
    </nav>
  </div>
  
 
