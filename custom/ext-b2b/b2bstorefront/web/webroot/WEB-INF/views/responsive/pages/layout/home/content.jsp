<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="col_8 col_12_sm mB30_sm pL0">
        <section class="contentPanel grey_bg  grey_border">
          <div class="darkgrey_bg pD10 clearfix">
            <label class="fL mR10 mT10">Customer</label>
            <span class="search-bar globalSrchW fL mR10">
            <input type="text" class="sfield w100pcnt custSrcInput" name="searchterm" id="custId1" />
            <input type="image" class="searchbutton" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/search_icon.png" />
            </span> <span id="addCustContr" class="addCustContr"> <a href="javascript:void(0);" class=" fW600 fL mT10 " onClick="showCustomerDetails('new')"> <span class="add_customer_icon mR5 fL mTN5"></span>Add customer details</a></span> <span id="existingCustContr" style="display:none"> <span class="add_customer_icon mR5 fL"></span> <span class="fL mT10"><a href="javascript:void(0);" onclick="showCustomerDetails('existing')" class="cusStatus">Existing customer details</a></span> </span> </div>
          <ul class="row dN pT20 pB10 clearfix" id="newCustDetail">
            <li class="col_4"> <span class="mB5 txtClrlitGry clearfix w100pcnt">Customer name</span> <span>Mr. Amit Trivedi</span> </li>
            <li class="col_4 pR10"> <span class="mB5 txtClrlitGry clearfix w100pcnt">Email</span> <span><a href="mailto:amit.t@yahoomail.com">amit.t@yahoomail.com</a></span> </li>
            <li class="col_4 pR10"> <span class="mB5 txtClrlitGry clearfix w100pcnt">Mobile number</span> <span>9867484567</span> </li>
          </ul>
          <div id="custDetail" class="brdrTrans grey_bg pR10 pL10 pT10 dN">
			<span class="popup_close_icon  fR clearfix" onclick="hidecustomerdetails();"></span>
            <ul class="row mB10 fL">
              <li class="col_2 pR10">
                <label>Title</label>
                <select>
                  <option>Mr.</option>
                  <option>Ms.</option>
                  <option>Mrs.</option>
                </select>
              </li>
              <li class="col_3_half pL0 pR10">
               <span class="fW500">First Name</span><span class="fS12">*</span>
                <input type="text" class="w100pcnt mT5"/>
              </li>
              <li class="col_3 pL0 pR10">
                <label>Middle name</label>
                <input type="text" class="w100pcnt"/>
              </li>
              <li class="col_3_half pL0">
                <span class="fW500">Last Name</span><span class="fS12">*</span>
                <input type="text" class="w100pcnt mT5"/>
              </li>
            </ul>
            <ul class="row col_12 pL0  mB10 fL">
              <li class="col_6 pR10 ">
                <label>Email</label>
                <input type="text" class="w100pcnt"/>
              </li>
              <li class="col_5 pL0 pR10">
                <label>Mobile no.</label>
                <input type="text" class="w80pcnt"/>
              </li>
            </ul>
            <ul class="row col_12 pL0  mB10 fL">
              <li class="col_6 pR10 ">
                <label>City</label>
                <select ><option disabled="disabled">Select City</option></select>
              </li>
              <li class="col_5 pL0 pR10">
                <label>Pin Code</label>
                <input type="text" class="w80pcnt"/>
              </li>
            </ul>
			<br class="cB" />
			<a href="javascript:void(0)" class="mT10 mB10 clearfix" onclick="popupwin('addcustdetail','addcustdetailinner','fade')">+ Add more details</a>
            <br class="cB" />
            <div class="tertiaryBtn fR mT15 mB15 customerSaveDetail"><a href="javascript:void(0);">Save details</a></div>
            <div class="cB"></div>
          </div>
          <div id="custDetail_fill" class="brdrTrns pT20 pB10 clearfix" style="display:none">
		  <span class="fR"><a href="javascript:void(0)" class="mR10 mB10 fL clearfix">Login as Employee</a>
		  <a href="javascript:void(0)" class=" mB10 fR clearfix" onclick="popupwin('showcustdetail','showcustdetailinner','fade')">+ Details</a></span>
		  
            <ul class="row cB clearfix">
              <li class="col_3"> <span class="mB5 txtClrlitGry clearfix w100pcnt">Customer name</span> <span>Mr. Amit Trivedi</span> </li>
              <li class="col_3 pR10"> <span class="mB5 txtClrlitGry clearfix w100pcnt">Email</span> <span><a href="mailto:amit.t@yahoomail.com">amit.t@yahoomail.com</a></span> </li>
              <li class="col_3 pR10"> <span class="mB5 txtClrlitGry clearfix w100pcnt">Mobile number</span> <span>9867484567</span> </li>
			  <li class="col_3 pR10"> <span class="mB5 txtClrlitGry clearfix w100pcnt">Customer type</span> <span>B2C</span> </li>
            </ul>
          </div>
          <div class="cB mT10"></div>
          <nav class="tabNavContainer mB10 clearfix">
            <ul class="tabNav" id="mainNav">
              <li class="sel" id="globalSrcTab1" data-container="globalSrcContr1"><a href="javascript:void(0);" style="font-size:14px ; padding: 10px 15px 10px;">Flights</a></li>
              <li id="globalSrcTab2" data-container="globalSrcContr2"><a href="javascript:void(0);" style="font-size:14px; padding: 10px 15px 10px;" class="hotelTab">Hotels</a></li>
              <li id="globalSrcTab3" data-container="globalSrcContr3"><a href="javascript:void(0);" style="font-size:14px; padding: 10px 15px 10px;" class="hotel_flightTab">Flights + Hotels</a></li>
              <li id="globalSrcTab4" data-container="globalSrcContr4"><a href="javascript:void(0);" style="font-size:14px; padding: 10px 15px 10px;" class="holidayTab">Holidays</a></li>
              <li id="globalSrcTab5" data-container="globalSrcContr5" style="display: none;"><a href="javascript:void(0);"  style="font-size:14px ; padding: 10px 15px 10px;" class=""></a></li>
            </ul>
            <div class="posR fL">
              <div class="addTabNav" id="moreNav"><a href="javascript:void(0);">+</a></div>
              <div class="moreContrOuter">
                <ul class="morePnl dN" id="moreOpt">
                  <li><a href="javascript:void(0);">Activities</a></li>
                  <li><a href="javascript:void(0);">Bus</a></li>
                  <li><a href="javascript:void(0);">Car</a></li>
                  <li><a href="javascript:void(0);">Rail</a></li>
                  <li><a href="javascript:void(0);">Cruise</a></li>
                  <li><a href="javascript:void(0);">Insurance</a></li>
                  <li><a href="javascript:void(0);">Flights + Hotels + Cars</a></li>
                  <li><a href="javascript:void(0);">Visa</a></li>
                  <li><a href="javascript:void(0);">Forex</a></li>
                  <li class="mT15"><a href="javascript:void(0);" class="link"  onclick="popupwin('light1', 'light1inner', 'fade'),hideDD()">Set my defaults</a></li>
                </ul>
              </div>
            </div>
          </nav>
          <!--start flight search -->
          <div id="globalSrcContr1" class="tab_content ">
            <ul class="flightWayTab mB20 clearfix">
              <li class="first" id="way1"><a href="javascript:void(0);" onclick="way('way1', 'wayContr1'),reset()"><span class="oneway_icon" title="One way"></span></a></li>
              <li class="sel" id="way2"><a href="javascript:void(0);" onclick="way('way2', 'wayContr2'),reset()"><span class="twoway_icon" title="Return"></span></a></li>
              <li class="last" id="way3"><a href="javascript:void(0);" onclick="way('way3', 'wayContr3'),reset()"><span class="multiway_icon"  title="Multi city"></span></a></li>
            </ul>
            <div id="wayContr1" class="dN">
              <ul class="mB10 clearfix">
                <li class="col_6 pR0 pL0">
                  <div class="search-bar grey_border clearfix">
                    <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="owFlightFrom" />
                    <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_from.png" />
                  </div>
                </li>
                <li class="col_6 pR0">
                  <div class="search-bar grey_border clearfix">
                    <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="owFlightTo" />
                    <input type="image" class="toDestination" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_to.png" />
                  </div>
                </li>
              </ul>
              <ul class="row mB10">
                <li class="col_3">
                  <label>Departure</label>
                  <input id="datepicker1" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
                </li>
                <li class="col_3">
                  <label class="txtClrlitGry">Return</label>
                  <input id="datepicker2" class="w100pcnt" type="text" placeholder="DD/MM/YYYY" disabled="disabled" />
                </li>
                <li class="col_2 pR10">
                  <label>Adult</label>
                  <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="aCountDec('owAdult')">-</span> <span class="control innerTxtControl" id="owAdult">1</span> <span class="control addMinControl plusControl" onclick="aCountInc('owAdult')">+</span> </div>
                  <input type="text" placeholder="01" maxlength="3" class="w86 aInput1 dN blink " />
                  <span class="fS11 fL w100pcnt">12+ yrs</span> </li>
                <li class="col_2 pR10 pL10">
                  <label>Children</label>
                  <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec('owChild')">-</span> <span class="control innerTxtControl" id="owChild">0</span> <span class="control addMinControl plusControl" onclick="cCountInc('owChild')">+</span> </div>
                  <input type="text" placeholder="00" maxlength="3" class="w86 aInput1 dN  blink" />
                  <span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li>
                <li class="col_2 pR10 pL0">
                  <label>Infant</label>
                  <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec('owInfant')">-</span> <span class="control innerTxtControl" id="owInfant">0</span> <span class="control addMinControl plusControl" onclick="cCountInc('owInfant')">+</span> </div>
                  <input type="text" placeholder="00" maxlength="3" class="w86 aInput1 dN blink" />
                  <span class="fS11 fL w100pcnt">0 - 2 yrs</span> </li>
              
              </ul>
              <ul class="row mB10">
                <li class="col_3 pR0">
                  <label>Class</label>
                  <select>
                    <option value="Economy">Economy</option>
                    <option value="Business">Business</option>
                    <option value="First">First</option>
                    <option value="Premium economy">Premium economy</option>
                  </select>
                </li>
                <li class="col_3 pR0">
                  <label>Preferred airline</label>
                  <select>
                    <option value="All airlines" selected>All airlines</option>
                    <option value="GoAir">GoAir</option>
                    <option value="JetAirways">JetAirways</option>
                    <option value="Spice Jet">Spice Jet</option>
                    <option value="IndiGo">IndiGo</option>
                    <option value="JetKonnect">JetKonnect</option>
                    <option value="AirIndia">AirIndia</option>
                  </select>
                </li>
              </ul>
              <div class="cB"></div>
              <div class="mT40" onclick="chkGroupDetails(1)">
                <input type="checkbox" id="GroupBooking1" />
                <label for="GroupBooking1" class="w50pcnt">Group booking request (9+Pax)</label>
              </div>
              <div id="gBookingContr1" class="dN">
				<textarea maxlength="100" id="noteContent4" class="w100pcnt mB5" placeholder="Add note (Max. 100 characters)"></textarea>
                <span class="fR fS12 dN" id="charText4"><span id="charCount4">100</span> characters left</span><br/>
                <p class="fS12 mB15">Note: We do not accept group enquiries on Sundays, Holidays and Saturdays after 1300 hrs IST</p>
              </div>
            </div>
            <div id="wayContr2">
              <ul class="mB10 clearfix">
                <li class="col_6 pR0 pL0">
                  <div class="search-bar grey_border clearfix">
                    <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="twflightFrom" />
                    <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_from.png" />
                  </div>
                </li>
                <li class="col_6 pR0">
                  <div class="search-bar grey_border clearfix">
                    <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="twflightTo" />
                    <input type="image" class="toDestination" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_to.png" />
                  </div>
                </li>
              </ul>
              <ul class="row mB10">
                <li class="col_3">
                  <label>Departure</label>
                  <input id="datepicker3" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
                </li>
                <li class="col_3">
                  <label>Return</label>
                  <input id="datepicker4" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
                </li>
                <li class="col_2 pR10">
                  <label>Adult</label>
                  <div class="passengerNum2 fL"> <span class="control addMinControl minusControl" onclick="aCountDec('twAdult')">-</span> <span class="control innerTxtControl" id="twAdult">1</span> <span class="control addMinControl plusControl" onclick="aCountInc('twAdult')">+</span> </div>
                  <input type="text" placeholder="01" maxlength="3" class="w86 aInput2 blink dN  "/>
                  <span class="fS11 fL w100pcnt">12+ yrs</span> </li>
                <li class="col_2 pR10 pL10">
                  <label>Children</label>
                  <div class="passengerNum2 fL"> <span class="control addMinControl minusControl" onclick="cCountDec('twChild')">-</span> <span class="control innerTxtControl" id="twChild">0</span> <span class="control addMinControl plusControl" onclick="cCountInc('twChild')">+</span> </div>
                  <input type="text" placeholder="00" maxlength="3" class="w86 aInput2 dN blink "/>
                  <span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li>
                <li class="col_2 pR10 pL0">
                  <label>Infant</label>
                  <div class="passengerNum2 fL"> <span class="control addMinControl minusControl" onclick="cCountDec('twInfant')">-</span> <span class="control innerTxtControl" id="twInfant">0</span> <span class="control addMinControl plusControl" onclick="cCountInc('twInfant')">+</span> </div>
                  <input type="text" placeholder="00" maxlength="3" class="w86 aInput2 dN blink "/>
                  <span class="fS11 fL w100pcnt">0 - 2 yrs</span> </li>
              </ul>
              <ul class="row mB10">
                <li class="col_3 pR0">
                  <label>Class</label>
                  <select>
                    <option value="Economy">Economy</option>
                    <option value="Business">Business</option>
                    <option value="First">First</option>
                    <option value="Premium economy">Premium economy</option>
                  </select>
                </li>
                <li class="col_3 pR0">
                  <label>Preferred airline</label>
                  <select>
                    <option value="All airlines" selected>All airlines</option>
                    <option value="GoAir">GoAir</option>
                    <option value="JetAirways">JetAirways</option>
                    <option value="Spice Jet">Spice Jet</option>
                    <option value="IndiGo">IndiGo</option>
                    <option value="JetKonnect">JetKonnect</option>
                    <option value="AirIndia">AirIndia</option>
                  </select>
                </li>
              </ul>
              <div class="cB"></div>
              <div class="mT40" onclick="chkGroupDetails(2)">
                <input type="checkbox" id="GroupBooking2" />
                <label for="GroupBooking2" class="w50pcnt">Group booking request (9+Pax)</label>
              </div>
              <div id="gBookingContr2" class="dN">
                <textarea maxlength="100" id="noteContent1" class="w100pcnt mB5" placeholder="Add note (Max. 100 characters)"></textarea>
                <span class="fR fS12 dN" id="charText1"><span id="charCount1">100</span> characters left</span><br />
                <p class="fS12 mB15">Note: We do not accept group enquiries on Sundays, Holidays and Saturdays after 1300 hrs IST</p>
              </div>
            </div>
            <div id="wayContr3" class="clearfix dN">
              <div id="flightsContainer">
                <ul class="mB10 clearfix">
                  <li class="col_8 pR0 pL0">
                    <label>Flight 1:</label>
                    <div class="search-bar grey_border fL mR20 w47pcnt">
                      <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="mwFlight1From" />
                      <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_from.png" />
                    </div>
                    <div class="search-bar grey_border fL w47pcnt">
                      <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="mwFlight1To" />
                      <input type="image" class="toDestination" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_to.png" />
                    </div>
                  </li>
                  <li class="col_3">
                    <label>Departure</label>
                    <input id="datepicker5" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
                  </li>
                </ul>
                <ul class="mB10 clearfix">
                  <li class="col_8 pR0 pL0">
                    <label>Flight 2:</label>
                    <div class="search-bar grey_border fL mR20 w47pcnt">
                      <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="mwFlight2From" />
                      <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_from.png" />
                    </div>
                    <div class="search-bar grey_border fL w47pcnt">
                      <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="mwFlight2To" />
                      <input type="image" class="toDestination" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_to.png" />
                    </div>
                  </li>
                  <li class="col_3">
                    <label>Departure</label>
                    <input id="datepicker6" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
                  </li>
                </ul>
              </div>
			  <div class="col_12 clearfix pL0 pR0" id="addCity"></div>
              <div class="col_12 clearfix mB10 pR0">
                <div class="fR mT10" ><a href="javascript:void(0);"  id="addCitybtn"><span class="add_details_icon mR5 fL"></span><span class="posR fL">Add city</span></a></div>
              </div>
              <ul class="mB10 clearfix">
                <li class="col_3 pR0 pL0">
                  <label>Class</label>
                  <select>
                    <option value="Economy">Economy</option>
                    <option value="Business">Business</option>
                    <option value="First">First</option>
                    <option value="Premium economy">Premium economy</option>
                  </select>
                </li>
                <li class="col_3 pR0">
                  <label>Preferred airline</label>
                  <select>
                    <option value="All airlines" selected>All airlines</option>
                    <option value="GoAir">GoAir</option>
                    <option value="JetAirways">JetAirways</option>
                    <option value="Spice Jet">Spice Jet</option>
                    <option value="IndiGo">IndiGo</option>
                    <option value="JetKonnect">JetKonnect</option>
                    <option value="AirIndia">AirIndia</option>
                  </select>
                </li>
                <li class="col_2 pR10 mR5">
                  <label>Adult</label>
                  <div class="passengerNum3 fL"> <span class="control addMinControl minusControl" onclick="aCountDec('mwAdult')">-</span> <span class="control innerTxtControl" id="mwAdult">1</span> <span class="control addMinControl plusControl" onclick="aCountInc('mwAdult')">+</span> </div>
                  <input type="text" placeholder="01" maxlength="3" class="w86 aInput3 dN blink" />
                  <span class="fS11 fL w100pcnt">12+ yrs</span> </li>
                <li class="col_2 pR10 pL10 mR5">
                  <label>Children</label>
                  <div class="passengerNum3 fL"> <span class="control addMinControl minusControl" onclick="cCountDec('mwChild')">-</span> <span class="control innerTxtControl" id="mwChild">0</span> <span class="control addMinControl plusControl" onclick="cCountInc('mwChild')">+</span> </div>
                  <input type="text" placeholder="00" maxlength="3" class="w86 aInput3 dN blink" />
                  <span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li>
                <li class="pL0 pR0 col_1_half">
                  <label>Infant</label>
                   <div class="passengerNum3 fL"> <span class="control addMinControl minusControl" onclick="cCountDec('mwInfant')">-</span> <span class="control innerTxtControl" id="mwInfant">0</span> <span class="control addMinControl plusControl" onclick="cCountInc('mwInfant')">+</span> </div>
                  <input type="text" placeholder="00" maxlength="3" class="w86 aInput3 dN blink" />
                  <span class="fS11 fL w100pcnt">0 - 2 yrs</span> </li>
              </ul>
              <div class="cB"></div>
              <div class="mT40" onclick="chkGroupDetails(3)">
                <input type="checkbox" id="GroupBooking3" />
                <label for="GroupBooking3" class=" w50pcnt">Group booking request (9+Pax)</label>
              </div>
              <div id="gBookingContr3" class="dN">
              <textarea maxlength="100" id="noteContent2" class="w100pcnt mB5" placeholder="Add note (Max. 100 characters)"></textarea>
                <span class="fR fS12 dN" id="charText2"><span id="charCount2">100</span> characters left</span><br />
                <p class="fS12 mB15">Note: We do not accept group enquiries on Sundays, Holidays and Saturdays after 1300 hrs IST</p>
              </div>
            </div>
            <div class="cB"></div>
			<div id="searchBtn1" class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);" id="srcBtn1" onclick="redirectSearch()">Search</a></div>
          </div>
          <!--end flight search --> 
          <!--start Hotel search -->
          <div id="globalSrcContr2" class="dN tab_content">
            <ul class="row mB10 clearfix">
              <li class="col_6 pR0">
                <label>Destination</label>
                <div class="search-bar  grey_border clearfix">
              <input type="text" class="sfield city w95pcnt" name="searchterm" placeholder="Enter city" id="hotelDestination" data-co-field="hotelLocation" />
              <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_from.png" />
            </div>
              </li>
              <li class="col_6">
                <label>Hotel Name (optional)</label>
                <div class="clearfix" id="hotelInput">
              <input type="text" id="hotelLocation"  class="w100pcnt" name="searchterm" title="Search" placeholder="Eg. Hilton" disabled="disabled" />
            </div>
              </li>
            </ul>
            <ul class="row mB10 clearfix">
              <li class="col_3 pR0">
                <label>Check-in</label>
                <input id="datepicker7" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
              </li>
              <li class="col_3 pR0">
                <label>Check-out</label>
                <input id="datepicker8" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
              </li>
              <li class="col_2">
                <label>Night(s)</label>
                <input type="text" class="w100pcnt" id="nights" disabled />
                <span id="msg"></span> </li>
            </ul>
            <div id="room1">
              <ul class="row mB10 mT15 clearfix">
                <li id="singleRooms" class="col_2">
                  <label>Rooms</label>
                  <select id="noOfRooms" onChange="showRooms();">
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
                <li class="col_2 pL0 singleRoom">
                  <label>Adult</label>
                  <div class="passengerNum4 fL"> <span class="control addMinControl minusControl" onClick="adultCountDec('hAdult_1',1)">-</span> <span id="hAdult_1" class="control innerTxtControl">1</span> <span class="control addMinControl plusControl" onClick="adultCountInc('hAdult_1',1)">+</span> </div>
                  <input type="text" placeholder="1" maxlength="3" class="w100pcnt aInput4 dN" />
                  <span class="fS11 fL w100pcnt">12+ yrs</span> </li>
                <li class="col_1_half col_2_sm pL0 singleRoom">
                  <label>Children</label>
                  <div class="passengerNum4 fL"> <span class="control addMinControl minusControl" onClick="childCountDec('hChild_1',1)">-</span> <span id="hChild_1" class="control innerTxtControl">0</span> <span class="control addMinControl plusControl" onClick="childCountInc('hChild_1',1)">+</span> </div>
                  <input type="text" placeholder="0"  maxlength="3" class="w100pcnt cInput4 dN"/>
                  <span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li>
				   
                <li class="col_4  singleRoom clearfix">
                  <ul class="clearfix">
                    <li class="col_6 mB10 pR0" id="child1_1"></li>
                    <li class="col_6 mB10 pR0" id="child1_2"></li>
                    <li class="col_6 mB10 pR0" id="child1_3"></li>
                    <li class="col_6 mB10 pR0" id="child1_4"></li>
                    <li class="col_6 mB10 pR0" id="child1_5"></li>
                    <li class="col_6 mB10 pR0" id="child1_6"></li>
                    <li class="col_6 mB10 pR0" id="child1_7"></li>
                    <li class="col_6 mB10 pR0" id="child1_8"></li>
                    <li class="col_6 mB10 pR0" id="child1_9"></li>
                  </ul>
                </li>
              </ul>
            </div>
            <div id="room2" class="singleRoom"></div>
            <div id="room3" class="singleRoom"></div>
            <span class="mT15 clearfix mB15" id="hotelOpt"> <a href="javascript:void(0);"><img src="_ui/desktop/cnk/images/b2b-images/collapse_blu.png" alt="Arrow" class="mR5 fL mT5" />Hotel options</a> (Star rating, Property type) </span>
            <ul id="hotelContr" class="dN mT10">
              <li class="col_6">
                <label>Star rating</label>
                <div class="fL mR10">
                  <input type="checkbox" name="check" id="rate1" />
                  <label for="rate1"><span class="trvGrp">1</span></label>
                </div>
                <div class="fL  mR10">
                  <input type="checkbox" name="check" id="rate2" />
                  <label for="rate2"><span class="trvGrp">2</span></label>
                </div>
                <div class="fL mR10">
                  <input type="checkbox" name="check" id="rate3" />
                  <label for="rate3"><span class="trvGrp">3</span></label>
                </div>
                <div class="fL mR10">
                  <input type="checkbox" name="check" id="rate4" />
                  <label for="rate4"><span class="trvGrp">4</span></label>
                </div>
                <div class="fL">
                  <input type="checkbox" name="check" id="rate5" />
                  <label for="rate5"><span class="trvGrp">5</span></label>
                </div>
              </li>
              <li class="col_6">
				<div>
                <label>Property type</label>
                 <dl class="dropdown1"> 
						  <dt>
							<a href="javascript:void(0);" class="grey_border fL">
							  <span class="hida">All </span>   
								<p class="multiSel1" >
								</p>  
							 </a>
							 <span class="downArrow_icon pD5 fL mLN20  mT15 pD15"></span>
							</dt>
						  <dd>
								<div class="mutliSelect1">
									<ul>
										<li>
											<input type="checkbox" value="All" id="selectalltheme"/><label>All</label></li>
									
										<li>
											<input type="checkbox" value="Bed and Breakfast" class="checkbox1"/><label>Bed and Breakfast</label></li>
										
										<li>
											<input type="checkbox" value="Boutique Hotel" class="checkbox1"/><label>Boutique Hotel</label></li>
										
										<li>
											<input type="checkbox" value="Guest House" class="checkbox1"/><label>Guest House</label></li>
										
										<li>
											<input type="checkbox" value="Heritage Hotel" class="checkbox1" /><label>Heritage Hotel</label></li>
										<li>
											<input type="checkbox" value="Home Stay" class="checkbox1"/><label>Home Stay</label></li>
										
										<li>
											<input type="checkbox" value="Resort" class="checkbox1"/><label>Resort</label></li>
										
										<li>
											<input type="checkbox" value="Serviced Apartments" class="checkbox1" /><label>Serviced Apartments</label></li>
										
									</ul>
								</div>
							</dd>
						</dl>
						<p class="multiSel1 cB">
							  </p>  
							  </div>
              </li>
            </ul>
             <div class="mT40">
                <input type="checkbox" />
                <label class=" w50pcnt">Group booking request (9+Pax)</label>
              </div>
			<div id="searchBtn2" class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);" id="srcBtn2" onclick="redirectSearch()">Search</a></div>
          </div>
          <!--end Hotel search --> 
          <!--start Flight+Hotel search -->
          <div id="globalSrcContr3" class="dN tab_content">
              <ul class="flightWayTab mB20 clearfix">
                <li class="first" id="flight_hotel_way10"><a href="javascript:void(0);" onclick="flight_hotel_way('flight_hotel_way10', 'flight_hotel_wayContr10'),reset()"><span class="oneway_icon" title="One way"></span></a></li>
                <li class="sel" id="flight_hotel_way11"><a href="javascript:void(0);" onclick="flight_hotel_way('flight_hotel_way11', 'flight_hotel_wayContr11'),reset()"><span class="twoway_icon" title="Return"></span></a></li>
                <li class="last" id="flight_hotel_way12"><a href="javascript:void(0);" onclick="flight_hotel_way('flight_hotel_way12', 'flight_hotel_wayContr12'),reset()"><span class="multiway_icon"  title="Multi city"></span></a></li>
              </ul>
			<!--oneway start-->
			    <div id="flight_hotel_wayContr10" class="dN">
                <ul class="mB10 clearfix">
                  <li class="col_6 pR0 pL0">
                    <div class="search-bar grey_border clearfix">
                      <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="owFlightFrom1" />
                      <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_from.png" />
                    </div>
                  </li>
                  <li class="col_6 pR0">
                    <div class="search-bar grey_border clearfix">
                      <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="owFlightTo1" />
                      <input type="image" class="toDestination" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_to.png" />
                    </div>
                  </li>
                </ul>
                <ul class="row mB10 clearfix">
                  <li class="col_6 pR0">
                    <label>Departure</label>
                    <input id="datepicker13" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
                  </li>
                  <li class="col_6">
                    <label class="txtClrlitGry">Return</label>
                    <input id="datepicker14" class="w100pcnt " type="text" placeholder="DD/MM/YYYY" disabled="disabled" />
                  </li>
                </ul>
				 <ul class="row mB10 clearfix">
					<li class="col_6 pR0">
					  <label>Hotel</label>
					  <div class="search-bar grey_border clearfix">
						<input type="text" class="sfield city w95pcnt" name="searchterm" placeholder="Enter city" id="hotelDestination1" data-co-field="hotelLocation" />
						<input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_from.png" />
					  </div>
					  
					  
					</li>
				  <li class="col_12 cB"></li>
				<li class="col_5  pR0 mT20 "  >
                    <label>Check-in</label>
                    <input id="datepicker25" class="w100pcnt showdate dateField" type="text" placeholder="DD/MM/YYYY"  readonly="readonly" />
                  </li>
                  <li class="col_5 pR0 mT20 " >
                    <label>Check-out</label>
                     <input id="datepicker16" class="w100pcnt dateField " type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
                  </li>
				  <li class="col_2 mT20">
					<label>Night(s)</label>
					<input type="text" class="w100pcnt" id="nights" disabled />
					<span id="msg"></span> 
				  </li>
                </ul>
				
			<div>
	           <ul class="row mB10 mT15 clearfix">
                <li  class="col_2">
                  <label>Rooms</label>
                  <select  >
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                  </select>
                </li>
                <li  class="col_2 dN">
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
                <li class="col_2 pL0 singleRoom">
                  <label>Adult</label>
                  <div class="passengerNum4 fL"> <span class="control addMinControl minusControl" onClick="adultCountDec('fhAdult_1',1)">-</span> <span id="fhAdult_1" class="control innerTxtControl">1</span> <span class="control addMinControl plusControl" onClick="adultCountInc('fhAdult_1',1)">+</span> </div>
                  <input type="text" placeholder="1" maxlength="3" class="w100pcnt dN" />
                  <span class="fS11 fL w100pcnt">12+ yrs</span> </li>
                <li class="col_2 pL0 singleRoom">
                  <label>Children</label>
                  <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onClick="childCountDec('fhChild_1',1),remChild(1);">-</span> <span id="fhChild_1" class="control innerTxtControl">0</span> <span class="control addMinControl plusControl" onClick="childCountInc('fhChild_1',1),addChild(1)">+</span> </div>
                  <input type="text" placeholder="0"  maxlength="3" class="w100pcnt dN"/>
                  <span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li>
				  <li class="col_1_half col_sm_2 pL0 singleRoom">
                  <label>Infant</label>
                  <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onClick="cCountDec('holInfant')">-</span> <span class="control innerTxtControl" id="holInfant">0</span> <span class="control addMinControl plusControl" onClick="cCountInc('holInfant')">+</span> </div>
                  <input type="text" placeholder="00" maxlength="3" class="w100pcnt aInput dN" >
                  <span class="fS11 fL w100pcnt">0 - 2 yrs</span> </li>
                  <li class="col_4 mB10 singleRoom">
                  </li>
              </ul>
            </div>
				
                <div class="cB"></div>
				<div class="mT40">
                    <input type="checkbox" id="GroupBooking8" />
                    <label for="GroupBooking8" class=" w50pcnt">Group booking request (9+Pax)</label>
                  </div>
				 
               
              </div>
			  
			  <!--twoway start-->
              <div id="flight_hotel_wayContr11">
                <ul class="mB10 clearfix">
                  <li class="col_6 pR0 pL0">
                    <div class="search-bar grey_border clearfix">
                      <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="twflightFrom1" />
                      <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_from.png" />
                    </div>
                  </li>
                  <li class="col_6 pR0">
                    <div class="search-bar grey_border clearfix">
                      <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="twflightTo1" />
                      <input type="image" class="toDestination" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_to.png" />
                    </div>
                  </li>
                </ul>
                <ul class="row mB10 clearfix">
                  <li class="col_6 pR0">
                    <label>Departure</label>
                    <input id="datepicker17" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
                  </li>
                  <li class="col_6">
                    <label>Return</label>
                    <input id="datepicker18" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
                  </li>
                </ul>
				
               <ul class="mB10 pL0 pR0 clearfix">
				<li class="col_6 pR0 pL0">
                  <label>Hotel</label>
                  <div class="search-bar grey_border clearfix">
                    <input type="text" class="sfield city w95pcnt" name="searchterm" placeholder="Enter city" id="hotelDestination2" data-co-field="hotelLocation" />
                    <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_from.png" />
                  </div>
				  
				  
                </li>
				<li class="col_6 mT30">
					<input type="checkbox" class="myckeckbox1" />
					<label >Hotel stay at different dates</label>
				  </li>
				<li class="col_12 cB"></li>
				<li class="col_5 pL0 pR0 mT20 dateshow dN"  >
                    <label>Check-in</label>
                    <input id="datepicker25" class="w100pcnt showdate dateField" type="text" placeholder="DD/MM/YYYY"  readonly="readonly" />
                  </li>
                  <li class="col_5 pR0 mT20 dateshow dN " >
                    <label>Check-out</label>
                     <input id="datepicker16" class="w100pcnt dateField " type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
                  </li>
				  <li class="col_2 pR0 mT20 dateshow dN">
					<label>Night(s)</label>
					<input type="text" class="w100pcnt" id="nights" disabled />
					<span id="msg"></span> 
				  </li>
                </ul>
				
					<div id="rooms1">
	              <ul class="row mB10 mT15 clearfix">
                <li id="singleRooms1" class="col_2">
                  <label>Rooms</label>
                  <select id="roomCount" onChange="showRooms();">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                  </select>
                </li>
                <li id="groupBookingRooms1" class="col_2 dN">
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
                <li class="col_2 pL0 singleRoom">
                  <label>Adult</label>
                  <div class="passengerNum4 fL"> <span class="control addMinControl minusControl" onClick="adultCountDecrease('hAdult1_1',1)">-</span> <span id="hAdult1_1" class="control innerTxtControl">1</span> <span class="control addMinControl plusControl" onClick="adultCountIncrease('hAdult1_1',1)">+</span> </div>
                  <input type="text" placeholder="1" maxlength="3" class="w100pcnt dN" />
                  <span class="fS11 fL w100pcnt">12+ yrs</span> 
				  </li>
                <li class="col_2 pL0 singleRoom">
                  <label>Children</label>
                  <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onClick="childCountDecrease('hChild1_1',1),remChild1(4);">-</span> <span id="hChild1_1" class="control innerTxtControl">0</span> <span class="control addMinControl plusControl" onClick="childCountIncrease('hChild1_1',1),addChild1(4)">+</span> </div>
                  <input type="text" placeholder="0"  maxlength="3" class="w100pcnt dN"/>
                  <span class="fS11 fL w100pcnt">2 - 12 yrs</span> 
				  </li>
				   <li class="col_2 col_sm_2 pL0 singleRoom">
                  <label>Infant</label>
                  <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onClick="infantCountDecrease('hInfant1_1',1),remInfant1(4);">-</span> <span id="hInfant1_1" class="control innerTxtControl" id="holInfant">0</span> <span class="control addMinControl plusControl" onClick="infantCountIncrease('hInfant1_1',1),addInfant1(4)">+</span> </div>
                  <input type="text" placeholder="00" maxlength="3" class="w100pcnt aInput dN" >
                  <span class="fS11 fL w100pcnt">0 - 2 yrs</span> </li>
                  <li class="col_6 mB10 singleRoom">
                  	<ul>
                        <li class="col_6 mB10 pR0" id="child41"></li>
                        <li class="col_6 mB10 pR0" id="child42"></li>
                        <li class="col_6 mB10 pR0" id="child43"></li>
                        <li class="col_6 mB10 pR0" id="child44"></li>
                        <li class="col_6 mB10 pR0" id="child45"></li>
                        <li class="col_6 mB10 pR0" id="child46"></li>
                        <li class="col_6 mB10 pR0" id="child47"></li>
                        <li class="col_6 mB10 pR0" id="child48"></li>
                        <li class="col_6 mB10 pR0" id="child49"></li>
					</ul>	
                  </li>
				   <li class="col_6 mB10 singleRoom">
                  	<ul>
                        <li class="col_6 mB10 pR0" id="infant41"></li>
                        <li class="col_6 mB10 pR0" id="infant42"></li>
                        <li class="col_6 mB10 pR0" id="infant43"></li>
                        <li class="col_6 mB10 pR0" id="infant44"></li>
                        <li class="col_6 mB10 pR0" id="infant45"></li>
                        <li class="col_6 mB10 pR0" id="infant46"></li>
                        <li class="col_6 mB10 pR0" id="infant47"></li>
                        <li class="col_6 mB10 pR0" id="infant48"></li>
                        <li class="col_6 mB10 pR0" id="infant49"></li>
					</ul>	
                  </li>
              </ul>
              </div>
			   <div id="rooms2" class="singleRoom"></div>
              <div id="rooms3" class="singleRoom"></div>
			   <div class="cB"></div>
				<div class="mT40" >
                    <input type="checkbox" id="GroupBooking6" />
                    <label for="GroupBooking6" class=" w50pcnt">Group booking request (9+Pax)</label>
                  </div>
                 
                <div class="cB"></div>
               
                 
              </div>
			<!--3way start-->
              <div id="flight_hotel_wayContr12" class="clearfix dN">
                 <div id="flightsContainer2">
                <ul class="mB10 clearfix">
					<li class="col_8 col_12_sm pR0 pL0">
                    <label class="mT10">Flight 1:</label>
                    <div class="search-bar gray_border fL  w47pcnt " style="  background: transparent;">
                      <input type="text" class=" w100pcnt" name="searchterm" placeholder="From" id="mwFlight1From3" />
                      <input type="image" class="fromDestination mR20 " name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_from.png" />
                    </div>
                    <div class="search-bar gray_border fL w47pcnt" style="  background: transparent;">
                      <input type="text" class=" w100pcnt" name="searchterm" placeholder="To" id="mwFlight1To3" />
                      <input type="image" class="toDestination mR20" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_to.png" />
                    </div>
                  </li>
                  <li class="col_3 pR0 pL0">
                    <label class="mT10">Departure</label>
                    <input id="datepicker21" class="w80pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
                  </li>
				 <li class="col_4 mT10  pL0  clearfix">
                    <input type="checkbox" class="myckeckbox "  checked="checked"/>
                    <label>Need hotel in Delhi</label>
                 </li>
				<li class="col_3  pR0 mT20 "  >
                    <label>Check-in</label>
                    <input id="datepicker25" class="w100pcnt showdate dateField" type="text" placeholder="DD/MM/YYYY"  readonly="readonly" />
                  </li>
                  <li class="col_3 pR0 mT20 " >
                    <label>Check-out</label>
                     <input id="datepicker16" class="w100pcnt dateField " type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
                  </li>
				  <li class="col_2 mT20">
					<label>Night(s)</label>
					<input type="text" class="w100pcnt" id="nights" disabled />
					<span id="msg"></span> 
				  </li>
				</ul>
                <ul class="mB10 clearfix">
					<li class="col_8 col_12_sm pR0 pL0">
                    <label class="mT10">Flight 2:</label>
                    <div class="search-bar gray_border fL  w47pcnt" style="  background: transparent;">
                      <input type="text" class=" w100pcnt" name="searchterm" placeholder="From"  />
                      <input type="image" class="fromDestination mR20 " name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_from.png" />
                    </div>
                    <div class="search-bar gray_border fL w47pcnt" style="  background: transparent;">
                      <input type="text" class=" w100pcnt" name="searchterm" placeholder="To"  />
                      <input type="image" class="toDestination mR20" name="search" alt="Search" title="Search" src="_ui/desktop/cnk/images/b2b-images/destination_to.png" />
                    </div>
                  </li>
                  <li class="col_3 pR0 pL0">
                    <label class="mT10">Departure</label>
                    <input id="datepicker42" class="w80pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
                  </li>
				 <li class="col_4 mT10 pL0  clearfix">
                    <input type="checkbox" class="myckeckbox "  checked="checked"/>
                    <label>Need hotel in Delhi</label>
                 </li>
				<li class="col_3  pR0 mT20 "  >
                    <label>Check-in</label>
                    <input id="datepicker25" class="w100pcnt showdate dateField" type="text" placeholder="DD/MM/YYYY"  readonly="readonly" />
                  </li>
                  <li class="col_3 pR0 mT20 " >
                    <label>Check-out</label>
                     <input id="datepicker16" class="w100pcnt dateField " type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
                  </li>
				  <li class="col_2 mT20">
					<label>Night(s)</label>
					<input type="text" class="w100pcnt" id="nights" disabled />
					<span id="msg"></span> 
				  </li>
				</ul>
                  </div>
				  <div class="add_city_index"></div>
               <div class="col_12 clearfix mB10 pR0">
                  <div class="fR mT10"><a href="javascript:void(0);" ><span class="add_details_icon mR5 fL"></span><span class=" mR5 fL" >Add city</span></a></div>
                </div>
				
				<div class="cB"></div>
				
                <div id="room_id1">
	              <ul class="row mB10 mT15 clearfix">
                <li id="singleRooms2" class="col_2">
                  <label>Rooms</label>
                  <select id="room_Count" onChange="show_Rooms();">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                  </select>
                </li>
                <li id="groupBookingRooms2" class="col_2 dN">
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
                <li class="col_2 pL0 singleRoom">
                  <label>Adult</label>
                  <div class="passengerNum4 fL"> <span class="control addMinControl minusControl" onClick="adultCountDecrease('hAdult2_1',1)">-</span> <span id="hAdult2_1" class="control innerTxtControl">1</span> <span class="control addMinControl plusControl" onClick="adultCountIncrease('hAdult2_1',1)">+</span> </div>
                  <input type="text" placeholder="1" maxlength="3" class="w100pcnt dN" />
                  <span class="fS11 fL w100pcnt">12+ yrs</span> 
				  </li>
                <li class="col_2 pL0 singleRoom">
                  <label>Children</label>
                  <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onClick="childCountDecrease('hChild2_1',1),remChild2(7);">-</span> <span id="hChild2_1" class="control innerTxtControl">0</span> <span class="control addMinControl plusControl" onClick="childCountIncrease('hChild2_1',1),addChild2(7)">+</span> </div>
                  <input type="text" placeholder="0"  maxlength="3" class="w100pcnt dN"/>
                  <span class="fS11 fL w100pcnt">2 - 12 yrs</span> 
				  </li>
				   <li class="col_1_half col_sm_2 pL0 singleRoom">
                  <label>Infant</label>
                  <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onClick="cCountDec('holInfant')">-</span> <span class="control innerTxtControl" id="holInfant">0</span> <span class="control addMinControl plusControl" onClick="cCountInc('holInfant')">+</span> </div>
                  <input type="text" placeholder="00" maxlength="3" class="w100pcnt aInput dN" >
                  <span class="fS11 fL w100pcnt">0 - 2 yrs</span> </li>
                  <li class="col_4 mB10 singleRoom">
                  	<ul>
                        <li class="col_6 mB10 pR0" id="child7_11"></li>
                         <li class="col_6 mB10 pR0" id="child7_12"></li>
                          <li class="col_6 mB10 pR0" id="child7_13"></li>
                          <li class="col_6 mB10 pR0" id="child7_14"></li>
                          <li class="col_6 mB10 pR0" id="child7_15"></li>
                          <li class="col_6 mB10 pR0" id="child7_16"></li>
                          <li class="col_6 mB10 pR0" id="child7_17"></li>
                          <li class="col_6 mB10 pR0" id="child7_18"></li>
                          <li class="col_6 mB10 pR0" id="child7_19"></li>
					</ul>	
                  </li>
              </ul>
              </div>
			   <div id="room_id2" class="singleRoom"></div>
              <div id="room_id3" class="singleRoom"></div>
			  
               
				 <div class="cB"></div>
				<div class="mT40">
                    <input type="checkbox" id="GroupBooking7" />
                    <label for="GroupBooking7" class=" w50pcnt">Group booking request (9+Pax)</label>
                  </div>
                
                <div class="cB"></div>
              </div>
			   <div id="searchBtn3" class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);" id="srcBtn3" onclick="redirectSearch()">Search</a></div>
		  </div>
          <!--end Flight+Hotel search --> 
          <!--start Holiday search -->
          <div id="globalSrcContr4" class="tab_content dN">
            <ul class="mB10 clearfix">
              <li class="fL">
                <div class="fL mR15">
                  <input type="radio" name="domHoliday" id="domHoliday1" />
                  <label for="domHoliday1"><span class="trvGrp">Group</span></label>
                </div>
                <div class="fL mR15">
                  <input type="radio" name="domHoliday" id="domHoliday2" checked="checked" />
                  <label for="domHoliday2"><span class="trvGrp">All</span></label>
                </div>
              </li>
            </ul>
            <div id="holidayTypeContr1">
              <ul class="mB10 clearfix">
                <li class="col_8 pR0 pL0">
                  <label>Destination</label>
                  <div class="search-bar side-by-side clearfix" style="background:none !important;">
                 <select data-placeholder="Destination" class="chosen-select" multiple tabindex="4">
            <option value=""></option>
            <option value="United States">United States</option>
            <option value="United Kingdom">United Kingdom</option>
            <option value="Afghanistan">Afghanistan</option>
            <option value="Aland Islands">Aland Islands</option>
            <option value="Albania">Albania</option>
            <option value="Algeria">Algeria</option>
            <option value="American Samoa">American Samoa</option>
            <option value="Andorra">Andorra</option>
            <option value="Angola">Angola</option>
            <option value="Anguilla">Anguilla</option>
            <option value="Antarctica">Antarctica</option>
            <option value="Antigua and Barbuda">Antigua and Barbuda</option>
            <option value="Argentina">Argentina</option>
            <option value="Armenia">Armenia</option>
            <option value="Aruba">Aruba</option>
            <option value="Australia">Australia</option>
            <option value="Austria">Austria</option>
            <option value="Azerbaijan">Azerbaijan</option>
            <option value="Bahamas">Bahamas</option>
            <option value="Bahrain">Bahrain</option>
            <option value="Bangladesh">Bangladesh</option>
            <option value="Barbados">Barbados</option>
            <option value="Belarus">Belarus</option>
            <option value="Belgium">Belgium</option>
            <option value="Belize">Belize</option>
            <option value="Benin">Benin</option>
            <option value="Bermuda">Bermuda</option>
            <option value="Bhutan">Bhutan</option>
            <option value="Bolivia, Plurinational State of">Bolivia, Plurinational State of</option>
            <option value="Bonaire, Sint Eustatius and Saba">Bonaire, Sint Eustatius and Saba</option>
            <option value="Bosnia and Herzegovina">Bosnia and Herzegovina</option>
            <option value="Botswana">Botswana</option>
            <option value="Bouvet Island">Bouvet Island</option>
            <option value="Brazil">Brazil</option>
            <option value="British Indian Ocean Territory">British Indian Ocean Territory</option>
            <option value="Brunei Darussalam">Brunei Darussalam</option>
            <option value="Bulgaria">Bulgaria</option>
            <option value="Burkina Faso">Burkina Faso</option>
            <option value="Burundi">Burundi</option>
            <option value="Cambodia">Cambodia</option>
            <option value="Cameroon">Cameroon</option>
            <option value="Canada">Canada</option>
            <option value="Cape Verde">Cape Verde</option>
            <option value="Cayman Islands">Cayman Islands</option>
            <option value="Central African Republic">Central African Republic</option>
            <option value="Chad">Chad</option>
            <option value="Chile">Chile</option>
            <option value="China">China</option>
            <option value="Christmas Island">Christmas Island</option>
            <option value="Cocos (Keeling) Islands">Cocos (Keeling) Islands</option>
            <option value="Colombia">Colombia</option>
            <option value="Comoros">Comoros</option>
            <option value="Congo">Congo</option>
            <option value="Congo, The Democratic Republic of The">Congo, The Democratic Republic of The</option>
            <option value="Cook Islands">Cook Islands</option>
            <option value="Costa Rica">Costa Rica</option>
            <option value="Cote D&apos;ivoire">Cote D'ivoire</option>
            <option value="Croatia">Croatia</option>
            <option value="Cuba">Cuba</option>
            <option value="Curacao">Curacao</option>
            <option value="Cyprus">Cyprus</option>
            <option value="Czech Republic">Czech Republic</option>
            <option value="Denmark">Denmark</option>
            <option value="Djibouti">Djibouti</option>
            <option value="Dominica">Dominica</option>
            <option value="Dominican Republic">Dominican Republic</option>
            <option value="Ecuador">Ecuador</option>
            <option value="Egypt">Egypt</option>
            <option value="El Salvador">El Salvador</option>
            <option value="Equatorial Guinea">Equatorial Guinea</option>
            <option value="Eritrea">Eritrea</option>
            <option value="Estonia">Estonia</option>
            <option value="Ethiopia">Ethiopia</option>
            <option value="Falkland Islands (Malvinas)">Falkland Islands (Malvinas)</option>
            <option value="Faroe Islands">Faroe Islands</option>
            <option value="Fiji">Fiji</option>
            <option value="Finland">Finland</option>
            <option value="France">France</option>
            <option value="French Guiana">French Guiana</option>
            <option value="French Polynesia">French Polynesia</option>
            <option value="French Southern Territories">French Southern Territories</option>
            <option value="Gabon">Gabon</option>
            <option value="Gambia">Gambia</option>
            <option value="Georgia">Georgia</option>
            <option value="Germany">Germany</option>
            <option value="Ghana">Ghana</option>
            <option value="Gibraltar">Gibraltar</option>
            <option value="Greece">Greece</option>
            <option value="Greenland">Greenland</option>
            <option value="Grenada">Grenada</option>
            <option value="Guadeloupe">Guadeloupe</option>
            <option value="Guam">Guam</option>
            <option value="Guatemala">Guatemala</option>
            <option value="Guernsey">Guernsey</option>
            <option value="Guinea">Guinea</option>
            <option value="Guinea-bissau">Guinea-bissau</option>
            <option value="Guyana">Guyana</option>
            <option value="Haiti">Haiti</option>
            <option value="Heard Island and Mcdonald Islands">Heard Island and Mcdonald Islands</option>
            <option value="Holy See (Vatican City State)">Holy See (Vatican City State)</option>
            <option value="Honduras">Honduras</option>
            <option value="Hong Kong">Hong Kong</option>
            <option value="Hungary">Hungary</option>
            <option value="Iceland">Iceland</option>
            <option value="India">India</option>
            <option value="Indonesia">Indonesia</option>
            <option value="Iran, Islamic Republic of">Iran, Islamic Republic of</option>
            <option value="Iraq">Iraq</option>
            <option value="Ireland">Ireland</option>
            <option value="Isle of Man">Isle of Man</option>
            <option value="Israel">Israel</option>
            <option value="Italy">Italy</option>
            <option value="Jamaica">Jamaica</option>
            <option value="Japan">Japan</option>
            <option value="Jersey">Jersey</option>
            <option value="Jordan">Jordan</option>
            <option value="Kazakhstan">Kazakhstan</option>
            <option value="Kenya">Kenya</option>
            <option value="Kiribati">Kiribati</option>
            <option value="Korea, Democratic People&apos;s Republic of">Korea, Democratic People's Republic of</option>
            <option value="Korea, Republic of">Korea, Republic of</option>
            <option value="Kuwait">Kuwait</option>
            <option value="Kyrgyzstan">Kyrgyzstan</option>
            <option value="Lao People&apos;s Democratic Republic">Lao People's Democratic Republic</option>
            <option value="Latvia">Latvia</option>
            <option value="Lebanon">Lebanon</option>
            <option value="Lesotho">Lesotho</option>
            <option value="Liberia">Liberia</option>
            <option value="Libya">Libya</option>
            <option value="Liechtenstein">Liechtenstein</option>
            <option value="Lithuania">Lithuania</option>
            <option value="Luxembourg">Luxembourg</option>
            <option value="Macao">Macao</option>
            <option value="Macedonia, The Former Yugoslav Republic of">Macedonia, The Former Yugoslav Republic of</option>
            <option value="Madagascar">Madagascar</option>
            <option value="Malawi">Malawi</option>
            <option value="Malaysia">Malaysia</option>
            <option value="Maldives">Maldives</option>
            <option value="Mali">Mali</option>
            <option value="Malta">Malta</option>
            <option value="Marshall Islands">Marshall Islands</option>
            <option value="Martinique">Martinique</option>
            <option value="Mauritania">Mauritania</option>
            <option value="Mauritius">Mauritius</option>
            <option value="Mayotte">Mayotte</option>
            <option value="Mexico">Mexico</option>
            <option value="Micronesia, Federated States of">Micronesia, Federated States of</option>
            <option value="Moldova, Republic of">Moldova, Republic of</option>
            <option value="Monaco">Monaco</option>
            <option value="Mongolia">Mongolia</option>
            <option value="Montenegro">Montenegro</option>
            <option value="Montserrat">Montserrat</option>
            <option value="Morocco">Morocco</option>
            <option value="Mozambique">Mozambique</option>
            <option value="Myanmar">Myanmar</option>
            <option value="Namibia">Namibia</option>
            <option value="Nauru">Nauru</option>
            <option value="Nepal">Nepal</option>
            <option value="Netherlands">Netherlands</option>
            <option value="New Caledonia">New Caledonia</option>
            <option value="New Zealand">New Zealand</option>
            <option value="Nicaragua">Nicaragua</option>
            <option value="Niger">Niger</option>
            <option value="Nigeria">Nigeria</option>
            <option value="Niue">Niue</option>
            <option value="Norfolk Island">Norfolk Island</option>
            <option value="Northern Mariana Islands">Northern Mariana Islands</option>
            <option value="Norway">Norway</option>
            <option value="Oman">Oman</option>
            <option value="Pakistan">Pakistan</option>
            <option value="Palau">Palau</option>
            <option value="Palestinian Territory, Occupied">Palestinian Territory, Occupied</option>
            <option value="Panama">Panama</option>
            <option value="Papua New Guinea">Papua New Guinea</option>
            <option value="Paraguay">Paraguay</option>
            <option value="Peru">Peru</option>
            <option value="Philippines">Philippines</option>
            <option value="Pitcairn">Pitcairn</option>
            <option value="Poland">Poland</option>
            <option value="Portugal">Portugal</option>
            <option value="Puerto Rico">Puerto Rico</option>
            <option value="Qatar">Qatar</option>
            <option value="Reunion">Reunion</option>
            <option value="Romania">Romania</option>
            <option value="Russian Federation">Russian Federation</option>
            <option value="Rwanda">Rwanda</option>
            <option value="Saint Barthelemy">Saint Barthelemy</option>
            <option value="Saint Helena, Ascension and Tristan da Cunha">Saint Helena, Ascension and Tristan da Cunha</option>
            <option value="Saint Kitts and Nevis">Saint Kitts and Nevis</option>
            <option value="Saint Lucia">Saint Lucia</option>
            <option value="Saint Martin (French part)">Saint Martin (French part)</option>
            <option value="Saint Pierre and Miquelon">Saint Pierre and Miquelon</option>
            <option value="Saint Vincent and The Grenadines">Saint Vincent and The Grenadines</option>
            <option value="Samoa">Samoa</option>
            <option value="San Marino">San Marino</option>
            <option value="Sao Tome and Principe">Sao Tome and Principe</option>
            <option value="Saudi Arabia">Saudi Arabia</option>
            <option value="Senegal">Senegal</option>
            <option value="Serbia">Serbia</option>
            <option value="Seychelles">Seychelles</option>
            <option value="Sierra Leone">Sierra Leone</option>
            <option value="Singapore">Singapore</option>
            <option value="Sint Maarten (Dutch part)">Sint Maarten (Dutch part)</option>
            <option value="Slovakia">Slovakia</option>
            <option value="Slovenia">Slovenia</option>
            <option value="Solomon Islands">Solomon Islands</option>
            <option value="Somalia">Somalia</option>
            <option value="South Africa">South Africa</option>
            <option value="South Georgia and The South Sandwich Islands">South Georgia and The South Sandwich Islands</option>
            <option value="South Sudan">South Sudan</option>
            <option value="Spain">Spain</option>
            <option value="Sri Lanka">Sri Lanka</option>
            <option value="Sudan">Sudan</option>
            <option value="Suriname">Suriname</option>
            <option value="Svalbard and Jan Mayen">Svalbard and Jan Mayen</option>
            <option value="Swaziland">Swaziland</option>
            <option value="Sweden">Sweden</option>
            <option value="Switzerland">Switzerland</option>
            <option value="Syrian Arab Republic">Syrian Arab Republic</option>
            <option value="Taiwan, Province of China">Taiwan, Province of China</option>
            <option value="Tajikistan">Tajikistan</option>
            <option value="Tanzania, United Republic of">Tanzania, United Republic of</option>
            <option value="Thailand">Thailand</option>
            <option value="Timor-leste">Timor-leste</option>
            <option value="Togo">Togo</option>
            <option value="Tokelau">Tokelau</option>
            <option value="Tonga">Tonga</option>
            <option value="Trinidad and Tobago">Trinidad and Tobago</option>
            <option value="Tunisia">Tunisia</option>
            <option value="Turkey">Turkey</option>
            <option value="Turkmenistan">Turkmenistan</option>
            <option value="Turks and Caicos Islands">Turks and Caicos Islands</option>
            <option value="Tuvalu">Tuvalu</option>
            <option value="Uganda">Uganda</option>
            <option value="Ukraine">Ukraine</option>
            <option value="United Arab Emirates">United Arab Emirates</option>
            <option value="United Kingdom">United Kingdom</option>
            <option value="United States">United States</option>
            <option value="United States Minor Outlying Islands">United States Minor Outlying Islands</option>
            <option value="Uruguay">Uruguay</option>
            <option value="Uzbekistan">Uzbekistan</option>
            <option value="Vanuatu">Vanuatu</option>
            <option value="Venezuela, Bolivarian Republic of">Venezuela, Bolivarian Republic of</option>
            <option value="Viet Nam">Viet Nam</option>
            <option value="Virgin Islands, British">Virgin Islands, British</option>
            <option value="Virgin Islands, U.S.">Virgin Islands, U.S.</option>
            <option value="Wallis and Futuna">Wallis and Futuna</option>
            <option value="Western Sahara">Western Sahara</option>
            <option value="Yemen">Yemen</option>
            <option value="Zambia">Zambia</option>
            <option value="Zimbabwe">Zimbabwe</option>
          </select>
                  </div>
                </li>
                <li class="col_4 pT30 pR0">
                  <input type="checkbox" name="domHoliday1" id="domHolidayDest1" />
                  <label for="domHolidayDest1" class=""><span class="trvGrp">With flight</span></label>
                </li>
              </ul>
              <ul class="mB10 clearfix">
               <li class="col_6 pL0">
				<div>
                <label>Themes</label>
                 <dl class="dropdown1"> 
						  <dt>
							<a href="javascript:void(0);" class="grey_border fL">
							  <span class="hida">All </span>   
								<p class="multiSel1" >
								</p>  
							 </a>
							 <span class="downArrow_icon pD5 fL mLN20  mT15 pD15"></span>
							</dt>
						  <dd>
								<div class="mutliSelect1">
									<ul>
										<li>
											<input type="checkbox" value="All" id="selectalltheme"/><label>All</label></li>
									
										<li>
											<input type="checkbox" value="Bed and Breakfast" class="checkbox1"/><label>Bed and Breakfast</label></li>
										
										<li>
											<input type="checkbox" value="Boutique Hotel" class="checkbox1"/><label>Boutique Hotel</label></li>
										
										<li>
											<input type="checkbox" value="Guest House" class="checkbox1"/><label>Guest House</label></li>
										
										<li>
											<input type="checkbox" value="Heritage Hotel" class="checkbox1" /><label>Heritage Hotel</label></li>
										<li>
											<input type="checkbox" value="Home Stay" class="checkbox1"/><label>Home Stay</label></li>
										
										<li>
											<input type="checkbox" value="Resort" class="checkbox1"/><label>Resort</label></li>
										
										<li>
											<input type="checkbox" value="Serviced Apartments" class="checkbox1" /><label>Serviced Apartments</label></li>
										
									</ul>
								</div>
							</dd>
						</dl>
						<p class="multiSel1 cB">
							  </p>  
							  </div>
              </li>
                <li class="col_6 pL0">
                  <label>Budget per person</label>
                  <select class="fL mR10 noWidth">
                    <option value="INR">INR</option>
                    <option value="Euro">Euro</option>
                    <option value="Pound">Pound</option>
                  </select>
                  <input class="fL w35pcnt" type="text" placeholder="50,000" maxlength="8" />
                </li>
              </ul>
              <ul class="clearfix mB20">
                <li class="col_3 pR0 pL0">
                  <label>No. of days</label>
                  <select class="w60">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                  </select>
                </li>
                <li class="col_6"> <span class="label fL mB5 mR5">Departure</span>
                  <div class="fL mR15">
                    <input type="radio" name="domHolidayDate" id="domHolidayTime1" checked="checked"  onclick="holidayDate('holidayMonth', 'holidayDay')"/>
                    <label for="domHolidayTime1"><span class="trvGrp">Month</span></label>
                  </div>
                  <div class="fL  mR15">
                    <input type="radio" name="domHolidayDate" id="domHolidayTime2" onclick="holidayDate('holidayDay', 'holidayMonth')"/>
                    <label for="domHolidayTime2"><span class="trvGrp">Date</span></label>
                  </div>
                  <select id="holidayMonth" class="w50pcnt">
                    <option value="January">January</option>
                    <option value="February">February</option>
                    <option value="March">March</option>
                    <option value="April">April</option>
                    <option value="May">May</option>
                    <option value="June">June</option>
                    <option value="July">July</option>
                    <option value="August">August</option>
                    <option value="September">September</option>
                    <option value="October">October</option>
                    <option value="November">November</option>
                    <option value="December">December</option>
                  </select>
                  <span id="holidayDay" class="dN">
                  <input id="datepicker12" class="dateField holidayCal" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
                  </span> </li>
              </ul>
            </div>
            <span class="clearfix" id="holidayOpt"> <a href="javascript:void(0);"><img src="_ui/desktop/cnk/images/b2b-images/collapse_blu.png" alt="Arrow" class="mR5 fL mT5" />More options</a> (Travellers, Property Type, Accommodation Star rating) </span>
            <div id="holidayContr" class="dN mT10">
              <ul class="mB10 clearfix">
                <li class="col_2 pR10">
                  <label>Adult</label>
                  <div class="passengerNum4 fL"> <span class="control addMinControl minusControl" onClick="aCountDec('holAdult')">-</span> <span class="control innerTxtControl" id="holAdult">1</span> <span class="control addMinControl plusControl" onClick="aCountInc('holAdult')">+</span> </div>
                  <input type="text" placeholder="01" maxlength="3" class="w100pcnt aInput dN" />
                  <span class="fS11 fL w100pcnt">12+ yrs</span> </li>
                <li class="col_2 pR10 pL10">
                  <label>Children</label>
                  <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onClick="cCountDec('holChild')">-</span> <span class="control innerTxtControl" id="holChild">0</span> <span class="control addMinControl plusControl" onClick="cCountInc('holChild')">+</span> </div>
                  <input type="text" placeholder="00" maxlength="3" class="w100pcnt aInput dN" />
                  <span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li>
              
				 <li class="col_2 pR10 pL0">
                  <label>Infant</label>
                  <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onClick="cCountDec('holInfant')">-</span> <span class="control innerTxtControl" id="holInfant">0</span> <span class="control addMinControl plusControl" onClick="cCountInc('holInfant')">+</span> </div>
                  <input type="text" placeholder="00" maxlength="3" class="w100pcnt aInput dN" >
                  <span class="fS11 fL w100pcnt">0 - 2 yrs</span> </li>
                <li class="col_6 pR10 pL0">
                  <label>Property type</label>
                  <dl class="dropdown2"> 
						  <dt>
							<a href="javascript:void(0);" class="grey_border fL">
							  <span class="hidd">All </span>   
								<p class="multiSel2" >
								</p>  
							 </a>
							 <span class="downArrow_icon pD5 fL mLN20  mT15 pD15"></span>
							</dt>
						  <dd>
								<div class="mutliSelect2">
									<ul>
										<li>
											<input type="checkbox" value="All" checked="checked"/><label>All</label></li>
									
										<li>
											<input type="checkbox" value="Bed and Breakfast" checked="checked" class="checkbox1"/><label>Bed and Breakfast</label></li>
										
										<li>
											<input type="checkbox" value="Boutique Hotel" checked="checked" class="checkbox1"/><label>Boutique Hotel</label></li>
										
										<li>
											<input type="checkbox" value="Guest House" checked="checked" class="checkbox1"/><label>Guest House</label></li>
										
										<li>
											<input type="checkbox" value="Heritage Hotel" checked="checked" class="checkbox1" /><label>Heritage Hotel</label></li>
										<li>
											<input type="checkbox" value="Home Stay" checked="checked" class="checkbox1"/><label>Home Stay</label></li>
										
										<li>
											<input type="checkbox" value="Resort" checked="checked" class="checkbox1"/><label>Resort</label></li>
										
										<li>
											<input type="checkbox" value="Serviced Apartments" checked="checked" class="checkbox1" /><label>Serviced Apartments</label></li>
										
									</ul>
								</div>
							</dd>
						</dl>
						<p class="multiSel2 cB">
							  </p>  
                </li>
              </ul>
              <ul class="cB mT10 clearfix">
                <li class="col_6 pR0"> <p class=" pD5 mB5">Accommodation Star rating</p>
                  <div class="fL mR15">
                    <input type="checkbox" name="check" id="star_rate1" />
                    <label for="star_rate1"><span class="trvGrp">1</span></label>
                  </div>
                  <div class="fL mR15">
                    <input type="checkbox" name="check" id="star_rate2" />
                    <label for="star_rate2"><span class="trvGrp">2</span></label>
                  </div>
                  <div class="fL mR15">
                    <input type="checkbox" name="check" id="star_rate3" />
                    <label for="star_rate3"><span class="trvGrp">3</span></label>
                  </div>
                  <div class="fL mR15">
                    <input type="checkbox" name="check" id="star_rate4" />
                    <label for="star_rate4"><span class="trvGrp">4</span></label>
                  </div>
                  <div class="fL">
                    <input type="checkbox" name="check" id="star_rate5" />
                    <label for="star_rate5"><span class="trvGrp">5</span></label>
                  </div>
                </li>
              </ul>
            </div>
            <div class="clearfix fL w100pcnt mT40 clearfix">
              <input type="checkbox" id="GroupBooking9" />
              <label for="GroupBooking9">Group booking request (8+ rooms) </label>
            </div>
			 <div id="searchBtn4" class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);" id="srcBtn4" onclick="redirectSearch()">Search</a></div>
          </div>
          <!--end Holiday search --> 
          <!--start Flight+Hotel search -->
          <div id="globalSrcContr5" class="dN tab_content"> New Tab Content </div>
          <!--end Flight+Hotel search -->
         
          <div id="sendReq" class="primaryBtn fR mT15 mB15 dN"><a href="javascript:void(0);" id="sendReqBtn"  onclick="popupwin('SendReq','SendReqinner', 'fade')">Send Request</a></div>
          <div class="cB"></div>
        </section>
		<!--<div class="pL0 col_12_sm mT30 mB30 portlet_sml">
          <section class="contentPanel clearfix" style="z-index:0">
              <div class="heading clearfix cursorMove title">
              <div class="headingTop"></div>
              <h2 class="fL w80pcnt cursorMove">Get the best exchange rates</h2>
              <div class="fR mT10 mR15"> <span class="collapse_portlet_icon" title="Collapse"></span></div>
            </div>
            <div class="grey-skin   mT15  portletInner " tabindex="-1">
			<div class="viewport" >
			<div class="overview" >
					<ul >		
						<li class="col_4 pD10   tC">CURRENCY </li>
						<li class="col_4 pD10   tC">BUY </li>
						<li class="col_4 pD10   tC">SELL</li>
					</ul>
					<ul >
						<li class="col_4 pD10 bB tC bkgLitBlu">US Dollar (USD)</li>
						<li class="col_4 pD10 bB tC bkgLitBlu">64.1</li>
						<li class="col_4 pD10 bB tC bkgLitBlu">62.75</li>
						
					</ul>
					<ul >
						<li class="col_4 pD10 bB tC bkgLitBlu">Sterling Pound (GBP)</li>
						<li class="col_4 pD10 bB tC bkgLitBlu">96.8</li>
						<li class="col_4 pD10 bB tC bkgLitBlu">95.15</li>
						
					</ul>
					<ul>
						<li class="col_4 pD10 bB tC bkgLitBlu">Euro (EUR)</li>
						<li class="col_4 pD10 bB tC bkgLitBlu">71.35</li>
						<li class="col_4 pD10 bB tC bkgLitBlu">70.25</li>
						
					</ul>
					<ul >
						<li class="col_4 pD10 bB tC bkgLitBlu">Swiss Franc (CHF)</li>
						<li class="col_4 pD10 bB tC bkgLitBlu">68.85</li>
						<li class="col_4 pD10 bB tC bkgLitBlu">67.2</li>	
					</ul>
					<ul >
						<li class="col_4 pD10 bB tC bkgLitBlu">Australian Dollar (AUD)</li>
						<li class="col_4 pD10 bB tC bkgLitBlu">50.5</li>
						<li class="col_4 pD10 bB tC bkgLitBlu">49.15</li>	
					</ul>
					<ul >
						<li class="col_4 pD10 bB tC bkgLitBlu">Canadian Dollar (CAD)</li>
						<li class="col_4 pD10 bB tC bkgLitBlu">53.1</li>
						<li class="col_4 pD10 bB tC bkgLitBlu">51.55</li>	
					</ul>
				
            </div>
			</div>
			</div>
          </section>
        </div>-->
      </div>