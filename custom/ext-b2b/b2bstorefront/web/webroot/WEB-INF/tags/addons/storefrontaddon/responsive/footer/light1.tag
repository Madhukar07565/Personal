<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="white_content t40Pcnt popupplay" id="light1">
  <div class="white_content_inner popupSml" id="light1inner">
    <div class="popup_close_icon fR" onclick="popupclose('light1', 'fade')"></div>
    <h3>Set default search (any 4)</h3>
    <div class="container clearfix"> 
      <!--=== Start Search Discover holiday ===-->
      <div class="row clearfix mB20">
        <div class="col_4_half pL0">
          <div class="mB5">
            <input type="checkbox" name="checkbox" id="flights" checked="checked" />
            <label for="flights">Flights</label>
          </div>
          <div class="mB5">
            <input type="checkbox" name="checkbox" id="hotels" checked="checked" />
            <label for="hotels">Hotels</label>
          </div>
          <div class="mB5">
            <input type="checkbox" name="checkbox" id="flights_hotels" checked="checked" />
            <label for="flights_hotels">Flights + Hotels</label>
          </div>
          <div class="mB5">
            <input type="checkbox" name="checkbox" id="flights_hotels_cars"  />
            <label for="flights_hotels_cars">Flights + Hotels +Cars</label>
          </div>
          <div class="mB5">
            <input type="checkbox" name="checkbox" id="Forex"  />
            <label for="Forex">Forex</label>
          </div>
        </div>
        <div class="col_4_half">
          <div class="mB5">
            <input type="checkbox" name="checkbox" id="holidays" checked="checked" />
            <label for="holidays">Holidays</label>
          </div>
          <div class="mB5">
            <input type="checkbox" name="checkbox" id="activities" />
            <label for="activities">Activities</label>
          </div>
          <div class="mB5">
            <input type="checkbox" name="checkbox" id="bus" />
            <label for="bus">Bus</label>
          </div>
          <div class="mB5">
            <input type="checkbox" name="checkbox" id="visa" />
            <label for="visa">Visa</label>
          </div>
        </div>
        <div class="col_3 pR0">
          <div class="mB5">
            <input type="checkbox" name="checkbox" id="car" />
            <label for="car">Car</label>
          </div>
          <div class="mB5">
            <input type="checkbox" name="checkbox" id="eurail" />
            <label for="eurail">Eurail</label>
          </div>
          <div class="mB5">
            <input type="checkbox" name="checkbox" id="cruise" />
            <label for="cruise">Cruise</label>
          </div>
          <div class="mB5">
            <input type="checkbox" name="checkbox" id="insurance" />
            <label for="insurance">Insurance</label>
          </div>
        </div>
      </div>
      <div class="primaryBtn fR"><a href="javascript:void(0);" onClick="popupclose('light1', 'fade')">Save</a></div>
    </div>
    <!--=== End Search Discover holiday ===--> 
  </div>
</div>