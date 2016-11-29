<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>

<div id="primary_navigation_containerpriNav3" class="container tabContent clearfix" style="display:none;">
<cms:pageSlot position="NavigationFlightAndHotel" var="feature">
	<cms:component component="${feature}" />
</cms:pageSlot>
</div>
<%--
<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<div id="primary_navigation_containerpriNav3" class="container tabContent clearfix" style="display:none;">
       <div class="globalSearchBG clearfix">
        <div class="clearfix" id="mainSearchWizard">
          <form method="post" action="/">
            <!-- Row 0 -->
			<ul class="searchFlightWay clearfix">
              <li>
                <input type="radio" onclick="searchFlightNew('oneway5'), showToggler()"  id="oneway5" name="radio1"/>
                <label for="oneway">One way</label>
              </li>
              <li>
                <input type="radio" onclick="searchFlightNew('return5'), showToggler()" checked="checked" id="return5" name="radio1"/>
                <label for="return">Return</label>
              </li>
              <li>
                <input type="radio" onclick="searchFlightNew('multicity5'), showToggler()" id="multicity5" name="radio1"/>
                <label for="multicity">Multi city</label>
              </li>
            </ul>
			
		     <ul class="searchFlight clearfix" id="multiwayhideNew">
              <li>
                <label>Starting From</label>
                <input type="text" id="autosuggest1"  class=" w100pcnt" placeholder="Mumbai"/>
              </li>
              <li class="next">
                <label>Going to</label>
                <input type="text" id="autosuggest2" class=" w100pcnt" placeholder="Delhi"/>
              </li>
              <li>
                <label>Departure</label>
                <input type="text" id="departureDate"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
              </li>
			  
              <li class="next" id="returnFlightContainer5">
                <label>Return</label>
                <input type="text" id="returnDate"  class=" w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
              </li>
			</ul>
            <!-- Row 1 -->
			<ul class="searchFlight clearfix" id="multiwayhideNew1">
				<li class="next hotelDestination" id="hotelDestination">
                  <label>Where do you want to stay?</label>
                  <input type="text" id="destinationHotelSearch"  class="w100pcnt" placeholder="City, area, landmark or hotel name"/>
                </li>
				<li id="checkinreturn5" class="dN">
                <label>Check in</label>
                <input type="text" id="checkinDate4"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
				</li>
			   <li id="checkoutreturn5" class="dN">
                <label>Check out</label>
                <input type="text" id="checkoutDate4"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
              </li>
			  <li class="next mT35 dN" id="2nights">
                <span class="baggage_icon fL mR10"></span><span class="fL">2 Nights</span>
              </li>
			  <li class="w100pcnt mT20 clearfix" id="hotelStay">
                    <input type="checkbox" id="addFlight1" onClick="addCarFlight('Hotel'), showToggler()"/>
                    <label for="addFlight1">Hotel stay at different dates</label>
              </li>
			</ul>
			
			<ul class="w50pcnt searchFlight clearfix dN pT10" id="hotelStayPanel">
                <li id="checkinreturn">
                <label>Check in</label>
                <input type="text" id="checkinDate4"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
				</li>
			   <li id="checkoutreturn">
                <label>Check out</label>
                <input type="text" id="checkoutDate4"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
              </li>
			  <li class="next mT35" id="2nights">
                <span class="baggage_icon fL mR10"></span><span class="fL">2 Nights</span>
              </li>
            </ul>
			   
			<ul class="searchFlight clearfix dN" id="multiwaySearchDefaultNew">
              <li>
                <label>Starting From</label>
                <input type="text" id="autosuggest3"  class=" w100pcnt" placeholder="Mumbai"/>
              </li>
              <li class="next mL20_imp">
                <label>Going to</label>
                <input type="text" id="autosuggest4" class=" w100pcnt" placeholder="Delhi"/>
              </li>
              <li>
                <label>Departure</label>
                <input type="text" id="departureDate2"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
              </li>
			</ul>
			
			<ul class="searchFlight clearfix dN pT10" id="checkhotel">
                <li class="w20pcnt">
                    <input type="checkbox" checked/>
                    <label for="addCar">Need hotel in Delhi</label>
                </li>
				<li class="next w50pcnt">
					<ul class="clearfix">
						<li>
							<label>Check in</label>
								<input type="text" id="checkinDate1"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
						</li>
						<li>
							<label>Check out</label>
								<input type="text" id="checkoutDate1"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
						</li>
						<li class="mT35">
							<span class="baggage_icon fL mR10"></span><span class="fL">2 Nights</span>
						</li>
					</ul>
				</li>
			</ul>
			<ul class="searchFlight clearfix dN pT10" id="multiwaySearchDefault1">
              <li>
                <label>Starting From</label>
                <input type="text" id="autosuggest3"  class=" w100pcnt" placeholder="Mumbai"/>
              </li>
              <li class="next mL20_imp">
                <label>Going to</label>
                <input type="text" id="autosuggest4" class=" w100pcnt" placeholder="Delhi"/>
              </li>
              <li>
                <label>Departure</label>
                <input type="text" id="departureDate2"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
              </li>
			</ul>
			
			<ul class="searchFlight clearfix dN pT10" id="checkhotel1">
                <li class="w20pcnt">
                    <input type="checkbox" checked/>
                    <label for="addCar">Need hotel in Delhi</label>
                </li>
				<li class="next w50pcnt">
					<ul class="clearfix">
						<li>
							<label>Check in</label>
								<input type="text" id="checkinDate1"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
						</li>
						<li>
							<label>Check out</label>
								<input type="text" id="checkoutDate1"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
						</li>
						<li class="mT35">
							<span class="baggage_icon fL mR10"></span><span class="fL">2 Nights</span>
						</li>
					</ul>
				</li>
			</ul>
			
			
            <div id="globalSrcToggle5">
			
              <ul class="searchFlight clearfix  dN pT10" id="multiwaySearchParametersNew1">
                <li>
                  <label>Starting From</label>
                  <input type="text" id="autosuggest7"  class=" w100pcnt" placeholder="Mumbai"/>
                </li>
                <li class="next mL20_imp">
                  <label>Going to</label>
                  <input type="text" id="autosuggest8" class=" w100pcnt" placeholder="Delhi"/>
                </li>
                <li>
                  <label>Departure</label>
                  <input type="text" id="departureDate3"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
                </li>
				<li class="next cB" style="width:144px !important;">
                  <input type="checkbox"  />
				  <label class="fS12">Need hotel in Delhi</label>
                </li>
				<li>
                <label>Check in</label>
                <input type="text" id="departureDate6"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
              </li>
			   <li class="mL20_imp">
                <label>Check out</label>
                <input type="text" id="departureDate7"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
              </li>
                <li class="closeMultipleWay">
                  <div onclick="hideMultiwayOptionsNew(1), showToggler()" class="close_multicity_panel fR"></div>
                </li>
              </ul>
              <ul class="searchFlight clearfix dN pT10" id="multiwaySearchParametersNew2">
                <li>
                  <label>Starting From</label>
                  <input type="text" id="autosuggest9"  class=" w100pcnt" placeholder="Mumbai"/>
                </li>
                <li class="next mL20_imp">
                  <label>Going to</label>
                  <input type="text" id="autosuggest10" class=" w100pcnt" placeholder="Delhi"/>
                </li>
                <li>
                  <label>Departure</label>
                  <input type="text" id="departureDate5"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
                </li>
				<li class="next cB" style="width:144px !important;">
                  <input type="checkbox"  />
				  <label class="fS12">Need hotel in Delhi</label>
                </li>
				<li>
                <label>Check in</label>
                <input type="text" id="checkinDate5"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
              </li>
			   <li class="mL20_imp">
                <label>Check out</label>
                <input type="text" id="checkoutDate5"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
              </li>
			   <li class="closeMultipleWay">
                  <div onclick="hideMultiwayOptionsNew(2), showToggler()" class="close_multicity_panel fR"></div>
                </li>
              </ul>
              <ul class="searchFlight clearfix dN pT10" id="multiwaySearchParametersNew3">
                <li>
                  <label>Starting From</label>
                  <input type="text" id="autosuggest11"  class=" w100pcnt" placeholder="Mumbai"/>
                </li>
                <li class="next mL20_imp">
                  <label>Going to</label>
                  <input type="text" id="autosuggest12" class=" w100pcnt" placeholder="Delhi"/>
                </li>
                <li>
                  <label>Departure</label>
                  <input type="text" id="departureDate9"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
                </li>
				<li class="next cB" style="width:144px !important;">
                  <input type="checkbox" />
				  <label class="fS12">Need hotel in Delhi</label>
                </li>
				<li>
                <label>Check in</label>
                <input type="text" id="checkinDate6"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
              </li>
			   <li class="mL20_imp">
                <label>Check out</label>
                <input type="text" id="checkoutDate6"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
              </li>
                <li class="closeMultipleWay">
                  <div onclick="hideMultiwayOptionsNew(3), showToggler()" class="close_multicity_panel fR"></div>
                </li>
              </ul>
              <div class="clearfix mB15 dN mT10" id="multiwayAdd5" onClick="showMultiwayOptionsNew()" > <span class="addIcon fL"></span> <span class="fL mT10 cursor" >Add city</span> </div>
              <div id="roomNew1" class="searchFlight">
                <ul class="row mB10 mT10 clearfix">
                   <li id="singleRooms1" class="col_2">
                    <label>Rooms</label>
                    <select id="noOfRoomsNew" class="w70pcnt" onChange="showRoomsNew(), showToggler()">
                      <option value="1">1</option>
                      <option value="2">2</option>
                      <option value="3">3</option>
                    </select>
                  </li>
                  <li id="groupBookingRooms" class="col_2 dN">
                    <label>Rooms</label>
                    <select>
                      <option value="9">9</option>
                      <option value="10">10</option>
                      <option value="11">11</option>
                      <option value="12">12</option>
                      <option value="13">13</option>
                      <option value="14">14</option>
                      <option value="15">15</option>
                      <option value="16">16</option>
                      <option value="17">17</option>
                      <option value="18">18</option>
                      <option value="19">19</option>
                      <option value="20">20</option>
                      <option value="21">21</option>
                      <option value="22">22</option>
                      <option value="23">23</option>
                      <option value="24">24</option>
                      <option value="25">25</option>
                      <option value="26">26</option>
                      <option value="27">27</option>
                      <option value="28">28</option>
                      <option value="29">29</option>
                      <option value="30">30</option>
                    </select>
                  </li>
                  <li class="col_2 pR0 singleRoom"> <span class="mT30 fL">Room 1:</span> </li>
                  <li class="col_2 pL0 pR0 singleRoom">
                    <label>Adult</label>
                    <div class="adderOuter"> <span  onClick="adultCountDec('hAdult_1',1)" class="control addMinControl minusControl cursor fW600">-</span> <span id="hAdult_1" class="control innerTxtControl">1</span> <span onClick="adultCountInc('hAdult_1',1)" class="control addMinControl plusControl cursor fW600">+</span> </div>
                    <input type="text" placeholder="1" maxlength="3" class="w100pcnt dN" />
                    <span class="fS11 fL w100pcnt">12+ yrs</span> </li>
					<li class="col_2 pL0 singleRoom">
                    <label>Children</label>
                    <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600"  onClick="childCountDec1('hChild_1',1),remChild5(1), showToggler();">-</span> <span class="control innerTxtControl" id="hChild_1">0</span> <span class="control addMinControl plusControl cursor fW600" onClick="childCountInc1('hChild_1',1),addChild5(1), showToggler()">+</span> </div>
                    <input type="text" placeholder="0"  maxlength="3" class="w100pcnt dN"/>
                    <span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li>
					 <li class="col_4 mB10">
					<label>Infant</label>
					<div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onClick="infantCountDec('hInfant_1',1),remInfant(1), showToggler();">-</span> <span class="control innerTxtControl" id="hInfant_1">0</span> <span class="control addMinControl plusControl cursor fW600" onClick="infantCountInc('hInfant_1',1),addInfant(1), showToggler()">+</span> </div>
					<input type="text" placeholder="0"  maxlength="3" class="w100pcnt dN"/>
					<span class="fS11 fL">0-2 yrs</span> 
				  </li>
                 </ul>
			     <ul class="col_6 pR0 pL0"></ul>
			  <ul class="col_6 mB10 pR0 pL0 singleRoom clearfix">
                      <li class="col_2 pR0" id="child1_1"></li>
                      <li class="col_2 pR0" id="child1_2"></li>
                      <li class="col_2 pR0" id="child1_3"></li>
                      <li class="col_2 pR0" id="child1_4"></li>
                      <li class="col_2 pR0" id="child1_5"></li>
                      <li class="col_2 pR0" id="child1_6"></li>
                      <li class="col_2 pR0" id="child1_7"></li>
                      <li class="col_2 pR0" id="child1_8"></li>
                      <li class="col_2 pR0" id="child1_9"></li>
                    </ul>
					<ul class="col_6 pR0 pL0"></ul>
                <ul class="col_6 mB10 pR0 pL0 singleRoom clearfix">
                      <li class="col_2 pR0" id="infant1_1"></li>
                      <li class="col_2 pR0" id="infant1_2"></li>
                      <li class="col_2 pR0" id="infant1_3"></li>
                      <li class="col_2 pR0" id="infant1_4"></li>
                      <li class="col_2 pR0" id="infant1_5"></li>
                      <li class="col_2 pR0" id="infant1_6"></li>
                      <li class="col_2 pR0" id="infant1_7"></li>
                      <li class="col_2 pR0" id="infant1_8"></li>
                      <li class="col_2 pR0" id="infant1_9"></li>
               </ul>
              </div>
              <div id="roomNew2" class="singleRoom"></div>
              <div id="roomNew3" class="singleRoom"></div>
           
           
              <div class="cB"></div>
              
              <a href="javascript:void(0);" class=" button button-primary fR">Search</a> 
			</div>
          </form>
        </div>
        <div class="globalSrcExpContr5 dN"> <a href="javascript:void(0);"><span class="globalSrcShow5 sel">Hide</span></a> </div>
      </div>
    </div>
--%>