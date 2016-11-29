<div class="white_content popupplay posF" id="bookpolicy17" style="top: 0px; padding-top: 20px; padding-bottom: 20px; height: 100%">
   <div class="white_content_inner w90pcnt clearfix" id="bookpolicy17inner">
      <div class="closeBtn_popup  fR" onclick="popupclose('bookpolicy17', 'fade')"></div>
      <span class="mL30"><a href="javascript: void(0);"> &lt; Back to Booking change request </a></span>
      <div class="clearfix mB10 col_srpGridList mT30"> <span class="col_3 col_sm_12 pL0"><a href="javascript:void(0);" class="button button-primary fL modSrcBtn2 w100pcnt"><img src="${ezgImagesPath}/common/right-arrow-wht.png" alt="Arrow" class="mR10">Modify search</a></span> </div>
      <div id="primary_navigation_container2" class="clearfix col_srpGridList mB20 contentPanel1 dN" style="z-index: 0; display: none;">
         <div class="globalSearchBG clearfix">
            <form method="post" action="/">
               <ul class="searchFlight clearfix">
                  <li class="next hotelDestination hotelD_home" id="hotelDestinations">
                     <label>Where do you want to go?</label>
                     <input type="text" id="destinationHotelsSearch1" class="w100pcnt ui-autocomplete-input" placeholder="City, area, landmark or hotel name" autocomplete="off">
                  </li>
                  <li class="next hotelDestination hotelD_home"> <span class="fL mR10 w45pcnt">
                     <label>Check in</label>
                     <input type="text" id="returnDate11" class="w100pcnt dateField  hasDatepicker" placeholder="dd/mm/yyyy" readonly="">
                     </span> <span class="fL w45pcnt">
                     <label>Check out</label>
                     <input type="text" id="departureDate_eurail5" class="w100pcnt dateField  hasDatepicker" placeholder="dd/mm/yyyy" readonly="">
                     </span> <span class="w100pcnt fL mT5">
                     <input id="mydates" type="checkbox" checked="checked" name="check">
                     <label for="mydates">My dates are not fixed</label>
                     </span> 
                  </li>
                  <li class="number"> <span class="mT20 dB clearfix"><span class="baggage_icon fL mR10"></span><span class="fL">2 Nights</span></span> </li>
               </ul>
               <div id="room1" class="searchFlight pD10 clearfix">
                  <ul class="row mB10 mT15 clearfix">
                     <li class="col_2 pR0">
                        <label>Rooms</label>
                        <select id="noOfRooms" onchange="showRooms();">
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
                        <div class="adderOuter"> <span onclick="adultCountDec('hAdult_1',1)" class="control addMinControl minusControl cursor fW600">-</span> <span id="hAdult_1" class="control innerTxtControl">1</span> <span onclick="adultCountInc('hAdult_1',1)" class="control addMinControl plusControl cursor fW600">+</span> </div>
                        <input type="text" placeholder="1" maxlength="3" class="w100pcnt dN">
                        <span class="fS11 fL w100pcnt">12+ yrs</span>
                     </li>
                     <li class="col_2 pL0 singleRoom">
                        <label>Children</label>
                        <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="childCountDec('hChild_1',1),remChild(1);">-</span> <span class="control innerTxtControl" id="hChild_1">0</span> <span class="control addMinControl plusControl cursor fW600" onclick="childCountInc('hChild_1',1),addChild(1)">+</span> </div>
                        <input type="text" placeholder="0" maxlength="3" class="w100pcnt dN">
                        <span class="fS11 fL w100pcnt">2 - 12 yrs</span>
                     </li>
                     <li class="col_4 mB10 singleRoom">
                        <ul class="clearfix">
                           <li class="col_3 mB10 pR0" id="child1_1"></li>
                           <li class="col_3 mB10 pR0" id="child1_2"></li>
                           <li class="col_3 mB10 pR0" id="child1_3"></li>
                           <li class="col_3 mB10 pR0" id="child1_4"></li>
                           <li class="col_3 mB10 pR0" id="child1_5"></li>
                           <li class="col_3 mB10 pR0" id="child1_6"></li>
                           <li class="col_3 mB10 pR0" id="child1_7"></li>
                           <li class="col_3 mB10 pR0" id="child1_8"></li>
                           <li class="col_3 mB10 pR0" id="child1_9"></li>
                        </ul>
                     </li>
                  </ul>
               </div>
               <div id="room2" class="additionalRooms"></div>
               <div id="room3" class="additionalRooms"></div>
               <div class="cB"></div>
               <ul class="searchFlight clearfix pT10 dN" id="flightSearchPanel4">
                  <!--searchFlight-->
                  <li class="title">Flight</li>
                  <li>
                     <label>Starting From</label>
                     <input type="text" id="autosuggest16" class="w100pcnt ui-autocomplete-input" placeholder="Mumbai" autocomplete="off">
                  </li>
                  <li class="next">
                     <label>Going to</label>
                     <input type="text" id="autosuggest17" class=" w100pcnt" placeholder="Delhi">
                  </li>
                  <li>
                     <label>Departure</label>
                     <input type="text" id="departureDate13" style="z-index:0;" class="w100pcnt dateField hasDatepicker" placeholder="dd/mm/yyyy" readonly="">
                  </li>
                  <li class="next" id="returnFlightContainer2">
                     <label>Return</label>
                     <input type="text" id="returnDate12" style="z-index:0;" class="w100pcnt dateField hasDatepicker" placeholder="dd/mm/yyyy" readonly="">
                  </li>
                  <li class="number">
                     <label>Adult</label>
                     <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="adultCountDec('hotelAdultNumber')">-</span> <span class="control innerTxtControl" id="hotelAdultNumber">1</span> <span class="control addMinControl plusControl cursor fW600" onclick="adultCountInc('hotelAdultNumber')">+</span> </div>
                  </li>
                  <li class="number">
                     <label>Child (2 - 12 yrs)</label>
                     <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="childCountDec('hotelChildNumber')">-</span> <span class="control innerTxtControl" id="hotelChildNumber">0</span> <span class="control addMinControl plusControl cursor fW600" onclick="childCountInc('hotelChildNumber')">+</span> </div>
                  </li>
                  <li class="number">
                     <label>Infant (0 - 2 yrs)</label>
                     <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="infantCountDec('hotelInfantNumber')">-</span> <span class="control innerTxtControl" id="hotelInfantNumber">0</span> <span class="control addMinControl plusControl cursor fW600" onclick="infantCountInc('hotelInfantNumber')">+</span> </div>
                  </li>
               </ul>
               <ul class="searchFlight clearfix dN pT10" id="multiwaySearchParameters6">
                  <li>
                     <label>Starting From</label>
                     <input type="text" id="autosuggest18" class=" w100pcnt" placeholder="Mumbai">
                  </li>
                  <li class="next">
                     <label>Going to</label>
                     <input type="text" id="autosuggest19" class=" w100pcnt" placeholder="Delhi">
                  </li>
                  <li>
                     <label>Departure</label>
                     <input type="text" id="departureDate12" class="w100pcnt dateField hasDatepicker" placeholder="dd/mm/yyyy" readonly="">
                  </li>
                  <li class="closeMultipleWay">
                     <div onclick="hideMultiwayOptions(5)" class="close_multicity_panel fR"></div>
                  </li>
               </ul>
               <div class="cB"></div>
               <ul class="searchFlight clearfix  pT10 dN" id="carSearchPanel3">
                  <li class="title">Car</li>
                  <li>
                     <label>Pick up point</label>
                     <select class="w100pcnt">
                        <option value="">Select</option>
                        <option value="Location">Location</option>
                        <option value="Hotel">Hotel</option>
                     </select>
                  </li>
                  <li class="next">
                     <label>Drop off point</label>
                     <select class="w100pcnt">
                        <option value="">Select</option>
                        <option value="Location">Location</option>
                        <option value="Hotel">Hotel</option>
                     </select>
                  </li>
                  <li id="pickUpDateHolder1">
                     <label>Pick up date</label>
                     <input type="text" placeholder="dd/mm/yyyy" id="pickUpDate10" class="dateField w100pcnt hasDatepicker" readonly="">
                  </li>
                  <li id="dropOffDateHolder1" class="next">
                     <label>Drop off date</label>
                     <input type="text" placeholder="dd/mm/yyyy" id="dropOffDate10" class="dateField w100pcnt hasDatepicker" readonly="">
                  </li>
                  <li>
                     <label>Pick up time</label>
                     <select class="w100pcnt">
                        <option>12:00 a.m.</option>
                        <option>12:15 a.m.</option>
                        <option>12:30 a.m.</option>
                        <option>12:45 a.m.</option>
                        <option>1:00 a.m.</option>
                        <option>1:15 a.m.</option>
                        <option>1:30 a.m.</option>
                        <option>1:45 a.m.</option>
                        <option>2:00 a.m.</option>
                        <option>2:15 a.m.</option>
                        <option>2:30 a.m.</option>
                        <option>2:45 a.m.</option>
                        <option>3:00 a.m.</option>
                        <option>3:15 a.m.</option>
                        <option>3:30 a.m.</option>
                        <option>3:45 a.m.</option>
                        <option>4:00 a.m.</option>
                        <option>4:15 a.m.</option>
                        <option>4:30 a.m.</option>
                        <option>4:45 a.m.</option>
                        <option>5:00 a.m.</option>
                        <option>5:15 a.m.</option>
                        <option>5:30 a.m.</option>
                        <option>5:45 a.m.</option>
                        <option>6:00 a.m.</option>
                        <option>6:15 a.m.</option>
                        <option>6:30 a.m.</option>
                        <option>6:45 a.m.</option>
                        <option>7:00 a.m.</option>
                        <option>7:15 a.m.</option>
                        <option>7:30 a.m.</option>
                        <option>7:45 a.m.</option>
                        <option>8:00 a.m.</option>
                        <option>8:15 a.m.</option>
                        <option>8:30 a.m.</option>
                        <option>8:45 a.m.</option>
                        <option>9:00 a.m.</option>
                        <option>9:15 a.m.</option>
                        <option>9:30 a.m.</option>
                        <option>9:45 a.m.</option>
                        <option>10:00 a.m.</option>
                        <option>10:15 a.m.</option>
                        <option>10:30 a.m.</option>
                        <option>10:45 a.m.</option>
                        <option>11:00 a.m.</option>
                        <option>11:15 a.m.</option>
                        <option>11:30 a.m.</option>
                        <option>11:45 a.m.</option>
                        <option>12:00 p.m.</option>
                        <option>12:15 p.m.</option>
                        <option>12:30 p.m.</option>
                        <option>12:45 p.m.</option>
                        <option>1:00 p.m.</option>
                        <option>1:15 p.m.</option>
                        <option>1:30 p.m.</option>
                        <option>1:45 p.m.</option>
                        <option>2:00 p.m.</option>
                        <option>2:15 p.m.</option>
                        <option>2:30 p.m.</option>
                        <option>2:45 p.m.</option>
                        <option>3:00 p.m.</option>
                        <option>3:15 p.m.</option>
                        <option>3:30 p.m.</option>
                        <option>3:45 p.m.</option>
                        <option>4:00 p.m.</option>
                        <option>4:15 p.m.</option>
                        <option>4:30 p.m.</option>
                        <option>4:45 p.m.</option>
                        <option>5:00 p.m.</option>
                        <option>5:15 p.m.</option>
                        <option>5:30 p.m.</option>
                        <option>5:45 p.m.</option>
                        <option>6:00 p.m.</option>
                        <option>6:15 p.m.</option>
                        <option>6:30 p.m.</option>
                        <option>6:45 p.m.</option>
                        <option>7:00 p.m.</option>
                        <option>7:15 p.m.</option>
                        <option>7:30 p.m.</option>
                        <option>7:45 p.m.</option>
                        <option>8:00 p.m.</option>
                        <option>8:15 p.m.</option>
                        <option>8:30 p.m.</option>
                        <option>8:45 p.m.</option>
                        <option>9:00 p.m.</option>
                        <option>9:15 p.m.</option>
                        <option>9:30 p.m.</option>
                        <option>9:45 p.m.</option>
                        <option>10:00 p.m.</option>
                        <option>10:15 p.m.</option>
                        <option>10:30 p.m.</option>
                        <option>10:45 p.m.</option>
                        <option>11:00 p.m.</option>
                        <option>11:15 p.m.</option>
                        <option>11:30 p.m.</option>
                        <option>11:45 p.m.</option>
                     </select>
                  </li>
                  <li class="next">
                     <label>Drop off time</label>
                     <select class="w100pcnt">
                        <option>12:00 a.m.</option>
                        <option>12:15 a.m.</option>
                        <option>12:30 a.m.</option>
                        <option>12:45 a.m.</option>
                        <option>1:00 a.m.</option>
                        <option>1:15 a.m.</option>
                        <option>1:30 a.m.</option>
                        <option>1:45 a.m.</option>
                        <option>2:00 a.m.</option>
                        <option>2:15 a.m.</option>
                        <option>2:30 a.m.</option>
                        <option>2:45 a.m.</option>
                        <option>3:00 a.m.</option>
                        <option>3:15 a.m.</option>
                        <option>3:30 a.m.</option>
                        <option>3:45 a.m.</option>
                        <option>4:00 a.m.</option>
                        <option>4:15 a.m.</option>
                        <option>4:30 a.m.</option>
                        <option>4:45 a.m.</option>
                        <option>5:00 a.m.</option>
                        <option>5:15 a.m.</option>
                        <option>5:30 a.m.</option>
                        <option>5:45 a.m.</option>
                        <option>6:00 a.m.</option>
                        <option>6:15 a.m.</option>
                        <option>6:30 a.m.</option>
                        <option>6:45 a.m.</option>
                        <option>7:00 a.m.</option>
                        <option>7:15 a.m.</option>
                        <option>7:30 a.m.</option>
                        <option>7:45 a.m.</option>
                        <option>8:00 a.m.</option>
                        <option>8:15 a.m.</option>
                        <option>8:30 a.m.</option>
                        <option>8:45 a.m.</option>
                        <option>9:00 a.m.</option>
                        <option>9:15 a.m.</option>
                        <option>9:30 a.m.</option>
                        <option>9:45 a.m.</option>
                        <option>10:00 a.m.</option>
                        <option>10:15 a.m.</option>
                        <option>10:30 a.m.</option>
                        <option>10:45 a.m.</option>
                        <option>11:00 a.m.</option>
                        <option>11:15 a.m.</option>
                        <option>11:30 a.m.</option>
                        <option>11:45 a.m.</option>
                        <option>12:00 p.m.</option>
                        <option>12:15 p.m.</option>
                        <option>12:30 p.m.</option>
                        <option>12:45 p.m.</option>
                        <option>1:00 p.m.</option>
                        <option>1:15 p.m.</option>
                        <option>1:30 p.m.</option>
                        <option>1:45 p.m.</option>
                        <option>2:00 p.m.</option>
                        <option>2:15 p.m.</option>
                        <option>2:30 p.m.</option>
                        <option>2:45 p.m.</option>
                        <option>3:00 p.m.</option>
                        <option>3:15 p.m.</option>
                        <option>3:30 p.m.</option>
                        <option>3:45 p.m.</option>
                        <option>4:00 p.m.</option>
                        <option>4:15 p.m.</option>
                        <option>4:30 p.m.</option>
                        <option>4:45 p.m.</option>
                        <option>5:00 p.m.</option>
                        <option>5:15 p.m.</option>
                        <option>5:30 p.m.</option>
                        <option>5:45 p.m.</option>
                        <option>6:00 p.m.</option>
                        <option>6:15 p.m.</option>
                        <option>6:30 p.m.</option>
                        <option>6:45 p.m.</option>
                        <option>7:00 p.m.</option>
                        <option>7:15 p.m.</option>
                        <option>7:30 p.m.</option>
                        <option>7:45 p.m.</option>
                        <option>8:00 p.m.</option>
                        <option>8:15 p.m.</option>
                        <option>8:30 p.m.</option>
                        <option>8:45 p.m.</option>
                        <option>9:00 p.m.</option>
                        <option>9:15 p.m.</option>
                        <option>9:30 p.m.</option>
                        <option>9:45 p.m.</option>
                        <option>10:00 p.m.</option>
                        <option>10:15 p.m.</option>
                        <option>10:30 p.m.</option>
                        <option>10:45 p.m.</option>
                        <option>11:00 p.m.</option>
                        <option>11:15 p.m.</option>
                        <option>11:30 p.m.</option>
                        <option>11:45 p.m.</option>
                     </select>
                  </li>
                  <li id="carType1">
                     <label>Car type</label>
                     <select class="w100pcnt">
                        <option value="">Select</option>
                        <option value="suv">SUV</option>
                        <option value="van">Van</option>
                     </select>
                  </li>
                  <li class="number" id="noOfCars1">
                     <label>No of cars</label>
                     <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="carCountDec('carCount1')">-</span> <span class="control innerTxtControl" id="carCount1">1</span> <span class="control addMinControl plusControl cursor fW600" onclick="carCountInc('carCount1')">+</span> </div>
                  </li>
               </ul>
               <div class="cB"></div>
               <div class="flightOption">
                  <p class="multipleOption mB10"><a href="javascript:void(0)" id="moreFlightOpton4" onclick="showMoreInfo('moreFlightOpton4','flightOptions4SearchPanel','plusMinus4');"><span id="plusMinus4">+</span> Hotel options </a> (price, rating, accommodation type) </p>
                  <div class="dN" id="flightOptions4SearchPanel">
                     <ul class="searchFlight noWidth clearfix mT10">
                        <li class="fligtOpt">
                           <label>Star rating</label>
                           <ul>
                              <li class="fL mR5 mB5 stackChkBox">
                                 <input type="checkbox" name="check" id="fivestar10" checked="checked">
                                 <label for="fivestar">5</label>
                              </li>
                              <li class="fL mR5 mB5 stackChkBox">
                                 <input type="checkbox" name="check" id="fourstar10">
                                 <label for="fourstar">4</label>
                              </li>
                              <li class="fL mR5 mB5 stackChkBox">
                                 <input type="checkbox" name="check" id="threestar10">
                                 <label for="threestar">3</label>
                              </li>
                              <li class="fL mR5 mB5 stackChkBox">
                                 <input type="checkbox" name="check" id="twostar10">
                                 <label for="twostar">2</label>
                              </li>
                              <li class="fL stackChkBox">
                                 <input type="checkbox" name="check" id="onestar10">
                                 <label for="onestar"><span class="trvGrp">1</span></label>
                              </li>
                           </ul>
                        </li>
                        <li class="fligtOpt">
                           <label>Accommodation type</label>
                           <select class="w100pcnt">
                              <option value="botique_hotel">Boutique hotel</option>
                              <option value="casino">Casino</option>
                              <option value="guest_house">Guest house</option>
                              <option value="heritage_hotel">Heritage hotel</option>
                              <option value="home_stay">Home stay</option>
                              <option value="houseboat">Houseboat</option>
                              <option value="resort">Resort</option>
                           </select>
                        </li>
                        <li class="fligtOpt fullW">
                           <label>Price range</label>
                           <div class="fL mR10">
                              <div id="slider-range-budget" class="ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all">
                                 <div class="ui-slider-range ui-widget-header ui-corner-all" style="left: 5%; width: 70%;"></div>
                                 <span class="ui-slider-handle ui-state-default ui-corner-all" tabindex="0" style="left: 5%;"></span><span class="ui-slider-handle ui-state-default ui-corner-all" tabindex="0" style="left: 75%;"></span>
                              </div>
                              <input type="text" id="amountBudget" readonly="" class="rangeTxt inputBGNone">
                           </div>
                           <select class="fL">
                              <option value="Rs.">Rs.</option>
                              <option value="$">$</option>
                           </select>
                        </li>
                     </ul>
                  </div>
               </div>
               <div class="comboOffer clearfix" id="comboOfferTriggers5">
                  <p class="saveOffer clearfix"><span class="dealsTag fL mLN40"></span><span class="fL dB">Save on combo deals:</span></p>
                  <ul class="searchFlightWay">
                     <li>
                        <input type="checkbox" id="addCar4" onclick="addCarFlight1('car');">
                        <label for="addCar4">Add a car</label>
                     </li>
                     <li>
                        <input type="checkbox" id="addFlight3" onclick="addCarFlight1('flight');">
                        <label for="addFlight3">Add a flight</label>
                     </li>
                  </ul>
               </div>
               <br class="cB">
               <a href="flight_srp_oneway.html" class=" button button-primary fR">Search hotels</a>
            </form>
         </div>
      </div>
      <aside class="col_3 portdN pL0">
         <form class="brdrLitGry">
            <h1 class="lftTocHrdr">India's largest travel bazaar</h1>
            <section class="lftTocSrcRes">
               <p><span class="fS20" id="number1_hotel">NaN</span> hotels starting at</p>
               <p class=" fS27"><span class="rupee">Rs</span><span id="number2_hotel">NaN,</span><span id="number3_hotel">NaN</span></p>
               <p class="fS11">Prices are indicative, per person, inclusive of tax</p>
            </section>
            <section class="lftTocContr first mT5">
               <p class="mB5">Search by hotel name</p>
               <div class="inputFieldContr">
                  <input type="text" value="" class="noBdr depInputWidth fL ui-autocomplete-input" id="hotelName" autocomplete="off">
                  <span class="search fR"></span> 
               </div>
            </section>
            <header class="lftTocHeading accHead" id="accHeader15" onclick="hideShowAcc('accHeader15', 'accCont15')">Traveller type</header>
            <section class="lftTocContr" id="accCont15" style="display:block;">
               <ul>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="familyChildren">
                     <label for="familyChildren">Family with Children</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="familyTeens">
                     <label for="familyTeens">Family with Teens</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="largeFamily">
                     <label for="largeFamily">Large Family</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="shopper">
                     <label for="shopper">Shopper</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="honeymooner" checked="checked">
                     <label for="honeymooner">Honeymooner</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="adventureTraveller" checked="checked">
                     <label for="adventureTraveller">Adventure Traveller</label>
                  </li>
                  <li class="clearfix mB15">
                     <input type="checkbox" id="luxuryTraveller" checked="checked">
                     <label for="luxuryTraveller">Luxury Traveller</label>
                  </li>
                  <li class="clearfix"> <a href="javascript:void(0)" class="fR">View all</a> </li>
               </ul>
            </section>
            <header class="lftTocHeading" id="accHeader16" onclick="hideShowAcc('accHeader16', 'accCont16')">Star rating</header>
            <section class="lftTocContr" id="accCont16">
               <ul>
                  <li class="fL mR5 mB5 stackChkBox">
                     <input type="checkbox" name="check" id="fivestar2" checked="checked">
                     <label for="fivestar2">5</label>
                  </li>
                  <li class="fL mR5 mB5 stackChkBox">
                     <input type="checkbox" name="check" id="fourstar2">
                     <label for="fourstar2">4</label>
                  </li>
                  <li class="fL mR5 mB5 stackChkBox">
                     <input type="checkbox" name="check" id="threestar2">
                     <label for="threestar2">3</label>
                  </li>
                  <li class="fL mR5 mB5 stackChkBox">
                     <input type="checkbox" name="check" id="twostar2">
                     <label for="twostar2">2</label>
                  </li>
                  <li class="fL stackChkBox">
                     <input type="checkbox" name="check" id="onestar2">
                     <label for="onestar2"><span class="trvGrp">1</span></label>
                  </li>
               </ul>
               <div class="cB"></div>
            </section>
            <header class="lftTocHeading" id="accHeader17" onclick="hideShowAcc('accHeader17', 'accCont17')">Accommodation type</header>
            <section class="lftTocContr" id="accCont17">
               <ul>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="botiqueHotel">
                     <label for="botiqueHotel">Botique Hotel</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="casino">
                     <label for="casino">Casino</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="guestHouse">
                     <label for="guestHouse">Guest house</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="heritageHotel">
                     <label for="heritageHotel">Heritage hotel</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="homeStay">
                     <label for="homeStay">Home stay</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="houseboat">
                     <label for="houseboat">Houseboat</label>
                  </li>
                  <li class="clearfix mB15">
                     <input type="checkbox" id="resort">
                     <label for="resort">Resort</label>
                  </li>
                  <li class="clearfix"> <a href="javascript:void(0)" class="fR">View all</a> </li>
               </ul>
            </section>
            <header class="lftTocHeading" id="accHeader6b" onclick="hideShowAcc('accHeader6b', 'accCont6b')">Amenities</header>
            <section class="lftTocContr" id="accCont6b">
               <ul>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="highSpeedInternet">
                     <label for="highSpeedInternet">High speed Internet</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="airConditioning" checked="checked">
                     <label for="airConditioning">Air conditioning</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="swimPool" checked="checked">
                     <label for="swimPool">Swimming Pool</label>
                  </li>
                  <li class="clearfix mB15">
                     <input type="checkbox" id="childCare">
                     <label for="childCare">Childcare</label>
                  </li>
                  <li class="clearfix"> <a href="javascript:void(0)" class="fR">View all</a> </li>
               </ul>
            </section>
            <header class="lftTocHeading clearfix cursor" id="accHeader18" onclick="hideShowAcc('accHeader18', 'accCont18')">
               <label class="fL mT5">Budget range</label>
               <select class="fR">
                  <option value="Rs.">Rs.</option>
                  <option value="$">$</option>
               </select>
            </header>
            <section class="lftTocContr" id="accCont18">
               <div class="mB15">
                  <div class="mB10">Starting from</div>
                  <div id="slider-range-budget2" class="ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all">
                     <div class="ui-slider-range ui-widget-header ui-corner-all" style="left: 5%; width: 70%;"></div>
                     <span class="ui-slider-handle ui-state-default ui-corner-all" tabindex="0" style="left: 5%;"></span><span class="ui-slider-handle ui-state-default ui-corner-all" tabindex="0" style="left: 75%;"></span>
                  </div>
                  <input type="text" id="amountBudget2" readonly="" class="rangeTxt">
               </div>
               <ul>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="refundable" checked="checked">
                     <label for="refundable" class="fS12">Hotels with Free Cancelation</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="payHotel" checked="checked">
                     <label for="payHotel" class="fS12">Pay at hotel</label>
                  </li>
               </ul>
            </section>
            <header class="lftTocHeading" id="accHeader19" onclick="hideShowAcc('accHeader19', 'accCont19')">Location </header>
            <section class="lftTocContr" id="accCont19">
               <ul>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="sSingapore">
                     <label for="sSingapore">South Singapore</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="nSingapore">
                     <label for="nSingapore">North Singapore</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="wSingapore">
                     <label for="wSingapore">West Singapore</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="lakeRoad">
                     <label for="lakeRoad">Mandai lake road</label>
                  </li>
                  <li class="clearfix mB15">
                     <input type="checkbox" id="eSingapore">
                     <label for="eSingapore">East Singapore</label>
                  </li>
                  <li class="clearfix"> <a href="javascript:void(0)" class="fR">View all</a> </li>
               </ul>
            </section>
            <header class="lftTocHeading" id="accHeaderHotelChain" onclick="hideShowAcc('accHeaderHotelChain', 'accContHotelChain')">Hotel chain</header>
            <section class="lftTocContr" id="accContHotelChain">
               <ul>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="lemon">
                     <label for="lemon">Lemon</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="ginger">
                     <label for="ginger">Ginger</label>
                  </li>
                  <li class="clearfix mB5">
                     <input type="checkbox" id="taj">
                     <label for="taj">Taj</label>
                  </li>
                  <li class="clearfix mB15">
                     <input type="checkbox" id="marriot">
                     <label for="marriot">Marriot</label>
                  </li>
                  <li class="clearfix"> <a href="javascript:void(0)" class="fR">View all</a> </li>
               </ul>
            </section>
         </form>
      </aside>
      <div class="col_9 col_sm_12 pR0 pL0_768">
         <section class="mB20 portShow dN portdB">
            <div class="col_12">
               <div class="brdrGry clearfix pD10">
                  <div class="clearfix mB10">
                     <ul class="clearfix">
                        <li class="col_4 pL0">
                           <label>Search</label>
                           <div class="inputFieldContr mB15">
                              <input type="text" id="hotelName_port" class="brdrN h25 w80pcnt ui-autocomplete-input" autocomplete="off">
                              <span class="search fR"></span> 
                           </div>
                           <label>Location</label>
                           <input type="text" id="hotelLoc_port" class="w100pcnt ui-autocomplete-input" placeholder="Singapore" autocomplete="off">
                        </li>
                        <li class="col_4">
                           <label>Check in</label>
                           <input id="checkinDate1" class="dateField w100pcnt mB15 hasDatepicker" type="text" placeholder="dd/mm/yyyy">
                           <label>Check Out</label>
                           <input id="checkoutDate1" class="dateField w100pcnt hasDatepicker" type="text" placeholder="dd/mm/yyyy">
                        </li>
                     </ul>
                  </div>
                  <a href="javascript:void(0)" class="dB mB15" id="moreInfo5" onclick="showMoreInfo('moreInfo5','holidyOptions5Container','plusMinus5')"><span id="plusMinus5">+</span> Hotel options</a>
                  <div id="holidyOptions5Container" class="clearfix dN">
                     <ul class="clearfix mB20">
                        <li class="col_4 pL0">
                           <label>Traveller type</label>
                           <ul>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="familyChildren1">
                                 <label for="familyChildren1">Family with Children</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="familyTeens1">
                                 <label for="familyTeens1">Family with Teens</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="largeFamily1">
                                 <label for="largeFamily1">Large Family</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="shopper1">
                                 <label for="shopper1">Shopper</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" checked="checked" id="honeymooner1">
                                 <label for="honeymooner1">Honeymooner</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" checked="checked" id="adventureTraveller1">
                                 <label for="adventureTraveller1">Adventure Traveller</label>
                              </li>
                              <li class="clearfix mB15">
                                 <input type="checkbox" checked="checked" id="luxuryTraveller1">
                                 <label for="luxuryTraveller1">Luxury Traveller</label>
                              </li>
                              <li class="clearfix"> <a class="fR" href="javascript:void(0)">View all</a> </li>
                           </ul>
                        </li>
                        <li class="col_4">
                           <label>Star rating</label>
                           <ul>
                              <li class="mB5 clearfix">
                                 <input type="checkbox" checked="checked" id="fivestar1" name="check1">
                                 <label for="fivestar1">5</label>
                              </li>
                              <li class="mB5 clearfix">
                                 <input type="checkbox" id="fourstar1" name="check">
                                 <label for="fourstar1">4</label>
                              </li>
                              <li class="mB5 clearfix">
                                 <input type="checkbox" id="threestar1" name="check">
                                 <label for="threestar1">3</label>
                              </li>
                              <li class="mB5 clearfix">
                                 <input type="checkbox" id="twostar1" name="check">
                                 <label for="twostar1">2</label>
                              </li>
                              <li class="clearfix">
                                 <input type="checkbox" id="onestar1" name="check">
                                 <label for="onestar1">1</label>
                              </li>
                           </ul>
                        </li>
                        <li class="col_4">
                           <label>Accommodation type</label>
                           <ul>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="botiqueHotel1">
                                 <label for="botiqueHotel1">Botique Hotel</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="casino1">
                                 <label for="casino1">Casino</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="guestHouse1">
                                 <label for="guestHouse1">Guest house</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="heritageHotel1">
                                 <label for="heritageHotel1">Heritage hotel</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="homeStay1">
                                 <label for="homeStay1">Home stay</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="houseboat1">
                                 <label for="houseboat1">Houseboat</label>
                              </li>
                              <li class="clearfix mB15">
                                 <input type="checkbox" id="resort1">
                                 <label for="resort1">Resort</label>
                              </li>
                              <li class="clearfix"> <a class="fR" href="javascript:void(0)">View all</a> </li>
                           </ul>
                        </li>
                     </ul>
                     <ul class="clearfix mB20">
                        <li class="col_4 pL0">
                           <label>Amenities</label>
                           <ul>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="highSpeedInternet1">
                                 <label for="highSpeedInternet1">High speed Internet</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" checked="checked" id="airConditioning1">
                                 <label for="airConditioning1">Air conditioning</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" checked="checked" id="swimPool1">
                                 <label for="swimPool1">Swimming Pool</label>
                              </li>
                              <li class="clearfix mB15">
                                 <input type="checkbox" id="childCare1">
                                 <label for="childCare1">Childcare</label>
                              </li>
                              <li class="clearfix"> <a class="fR" href="javascript:void(0)">View all</a> </li>
                           </ul>
                        </li>
                        <li class="col_4">
                           <span class="clearfix dB">
                              <label class="fL">Budget range</label>
                              <select class="fR">
                                 <option value="Rs.">Rs.</option>
                                 <option value="$">$</option>
                              </select>
                           </span>
                           <div class="mB15">
                              <div class="mB10">Starting from</div>
                              <div id="slider-range-budget1" class="ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all">
                                 <div class="ui-slider-range ui-widget-header ui-corner-all" style="left: 5%; width: 70%;"></div>
                                 <span class="ui-slider-handle ui-state-default ui-corner-all" tabindex="0" style="left: 5%;"></span><span class="ui-slider-handle ui-state-default ui-corner-all" tabindex="0" style="left: 75%;"></span>
                              </div>
                              <input type="text" id="amountBudget1" readonly="" class="rangeTxt">
                           </div>
                           <ul>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="refundable1" checked="checked">
                                 <label for="refundable1">Refundable</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="payHotel1" checked="checked">
                                 <label for="payHotel1">Pay at hotel</label>
                              </li>
                           </ul>
                        </li>
                        <li class="col_4">
                           <label>Location </label>
                           <ul>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="sSingapore1">
                                 <label for="sSingapore1">South Singapore</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="nSingapore1">
                                 <label for="nSingapore1">North Singapore</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="wSingapore1">
                                 <label for="wSingapore1">West Singapore</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="lakeRoad1">
                                 <label for="lakeRoad1">Mandai lake road</label>
                              </li>
                              <li class="clearfix mB15">
                                 <input type="checkbox" id="eSingapore1">
                                 <label for="eSingapore1">East Singapore</label>
                              </li>
                              <li class="clearfix"> <a class="fR" href="javascript:void(0)">View all</a> </li>
                           </ul>
                        </li>
                     </ul>
                     <ul class="clearfix">
                        <li class="col_4 pL0">
                           <label>Hotel chain</label>
                           <ul>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="lemon1">
                                 <label for="lemon1">Lemon</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="ginger1">
                                 <label for="ginger1">Ginger</label>
                              </li>
                              <li class="clearfix mB5">
                                 <input type="checkbox" id="taj1">
                                 <label for="taj1">Taj</label>
                              </li>
                              <li class="clearfix mB15">
                                 <input type="checkbox" id="marriot1">
                                 <label for="marriot1">Marriot</label>
                              </li>
                              <li class="clearfix"> <a class="fR" href="javascript:void(0)">View all</a> </li>
                           </ul>
                        </li>
                     </ul>
                  </div>
                  <span class="dB tR"><a href="javascript:void(0);" class="button button-primary">Search</a></span> 
               </div>
            </div>
         </section>
      </div>
      <div class="col_9 col_sm_12  mLN20 pL0 pR0">
         <!--col_sm_6_69pc--> 
         <!-- Tag Accumulator and View Swithcher-->
         <section class="mB20 pL40 clearfix"> <span class="col_6 col_sm_12 pL0"> <span class="hotelGrn_xl  mR10 fL"></span> <span class="fL w75pcnt">DEL (1 Room, 3 Nights)<br> Mon, 25 Sep – 27 Sep | 2 Adult, 1 Child</span> </span>
         </section>
         <div class="clearfix mB10">
            <h4 class="gridTitle fL pL40 ">Your Current Booking</h4>
            <span class="fR"> Show price: <a href="javascript:void(0)">Avg / night </a> | Total price </span> 
         </div>
         <!-- Holiday Search Results begin here-->
         <div class="w95pcnt">
            <section class="clearfix">
               <article class=" mB60 ">
                  <div class="list-show col_12 pL0 pR0">
                     <!--Header with tags-->
                     <header class="expandedViewHeader clearfix mB20">
                        <p class="fL mR20"> <span class="holiday_tag fL"></span> <a href="javascript:void(0)">honeymooner</a>,<a href="javascript:void(0)"> luxury traveller</a>, <a href="javascript:void(0)">romantic traveller</a> </p>
                     </header>
                     <ul class="clearfix">
                        <li class="col_4 pR0 mT20 clearfix">
                           <span class="saveTag_left fL saveRps_left cB">2 nights free: Book before 15 Aug<span class="tagBtm_left fL"></span></span>
                           <div class="mB15 holidayCarousel holidayCarouselList clearfix cB slick-initialized slick-slider">
                              <div tabindex="0" class="slick-list draggable">
                                 <div style="opacity: 1; width: 1150px; transform: translate3d(-230px, 0px, 0px);" class="slick-track">
                                    <div style="width: 230px;" class="slick-slide slick-cloned"><img src="${ezgImagesPath}/diy/hotel_3.jpg" alt="HotelImage3"></div>
                                    <div style="width: 230px;" class="slick-slide slick-active"><img src="${ezgImagesPath}/diy/hotel_1.jpg" alt="HotelImage1"></div>
                                    <div style="width: 230px;" class="slick-slide"><img src="${ezgImagesPath}/diy/hotel_2.jpg" alt="HotelImage2"></div>
                                    <div style="width: 230px;" class="slick-slide"><img src="${ezgImagesPath}/diy/hotel_3.jpg" alt="HotelImage3"></div>
                                    <div style="width: 230px;" class="slick-slide slick-cloned"><img src="${ezgImagesPath}/diy/hotel_1.jpg" alt="HotelImage1"></div>
                                 </div>
                              </div>
                              <button style="display: block;" type="button" data-role="none" class="slick-prev">Previous</button><button style="display: block;" type="button" data-role="none" class="slick-next">Next</button>
                           </div>
                           <span class="clearfix dB"> <span class="heart fL mL0 mT3"></span> <span class="fL mR7 mT5"><strong>242</strong></span> <span class="fL mR2"><img src="${ezgImagesPath}/common/hUser1.png" alt="User1"></span> <span class="fL mR2"><img src="${ezgImagesPath}/common/hUser2.png" alt="User2"></span> <span class="fL"><img src="${ezgImagesPath}/common/hUser3.png" alt="User3"></span> </span> 
                        </li>
                        <li class="col_5">
                           <h3 class="mB10 fS18">The Park Regency Ocean</h3>
                           <span class="mB10 dB"> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullnoRatingstar_icon"></span> <span>4 star</span> </span> <span class="clearfix dB"> <span class="fL mR10"><span class="location_point"></span></span> <span class="fL fS12"> 3 Bellios Street, Little India, Singapore<br>
                           5.2 km from Airport</span> </span> <span class="clearfix pD10 pL0 dB"> <span class="hotel_facility1_icon mR10"></span> <span class="hotel_facility2_icon mR10"></span> </span> <span class="dB fS22 mB10"> <span class="fcGrn">4.5</span>/5 Excellent </span> <span class="clearfix dB"> <img src="${ezgImagesPath}/common/tripadvisor.png" alt="Trip Advisor"> <img src="${ezgImagesPath}/common/hotelDotcom.png" alt="Hotel Dot Com"> <img src="${ezgImagesPath}/common/holidayiq.png" alt="Holiday IQ"> <span class="fS12">(based on 250 reviews)</span> </span> 
                        </li>
                        <li class="col_3"> <span class="fS11 notifyColor mB15 dB">Booked 2 min ago !</span> <span class="strikeOut dB"><span class="rupee">Rs.</span>9,000</span> <span class="fS27 dB"><span class="rupee">Rs.</span>9,148</span> <span class="fS12  dB mB15">Avg / night</span>  <span class="clearfix dB mT10"> <span class="empty_heart fL mR10"></span> <span class="share_icon fL"></span> </span> </li>
                     </ul>
                  </div>
                  <br class="cB">
                  <span class="addToCompListView">
                  <input type="checkbox" id="holiday1" onclick="checkThis('1')">
                  <label for="holiday1">Add to compare</label>
                  </span> 
               </article>
               <!--  Other search results  -->
               <section class="mB20 clearfix">
                  <h4 class="gridTitle fL pL40">Search results</h4>
                  <select class="fR">
                     <option value="Popularity">Popularity</option>
                     <option value="Price">Price</option>
                     <option value="Recency">Recency</option>
                     <option value="Ezeego1 only">Ezeego1 only</option>
                  </select>
               </section>
               <article class=" mB60 ">
                  <div class="list-show col_12 pL0 pR0">
                     <!--Header with tags-->
                     <header class="expandedViewHeader clearfix mB20">
                        <p class="fL mR20"> <span class="holiday_tag fL"></span> <a href="javascript:void(0)">honeymooner</a>,<a href="javascript:void(0)"> luxury traveller</a>, <a href="javascript:void(0)">romantic traveller</a> </p>
                     </header>
                     <ul class="clearfix">
                        <li class="col_4 pR0 mT20 clearfix">
                           <span class="saveTag_left fL saveRps_left cB">2 nights free: Book before 15 Aug<span class="tagBtm_left fL"></span></span>
                           <div class="mB15 holidayCarousel holidayCarouselList clearfix cB slick-initialized slick-slider">
                              <div tabindex="0" class="slick-list draggable">
                                 <div style="opacity: 1; width: 1150px; transform: translate3d(-230px, 0px, 0px);" class="slick-track">
                                    <div style="width: 230px;" class="slick-slide slick-cloned"><img src="${ezgImagesPath}/diy/hotel_3.jpg" alt="HotelImage3"></div>
                                    <div style="width: 230px;" class="slick-slide slick-active"><img src="${ezgImagesPath}/diy/hotel_1.jpg" alt="HotelImage1"></div>
                                    <div style="width: 230px;" class="slick-slide"><img src="${ezgImagesPath}/diy/hotel_2.jpg" alt="HotelImage2"></div>
                                    <div style="width: 230px;" class="slick-slide"><img src="${ezgImagesPath}/diy/hotel_3.jpg" alt="HotelImage3"></div>
                                    <div style="width: 230px;" class="slick-slide slick-cloned"><img src="${ezgImagesPath}/diy/hotel_1.jpg" alt="HotelImage1"></div>
                                 </div>
                              </div>
                              <button style="display: block;" type="button" data-role="none" class="slick-prev">Previous</button><button style="display: block;" type="button" data-role="none" class="slick-next">Next</button>
                           </div>
                           <span class="clearfix dB"> <span class="heart fL mL0 mT3"></span> <span class="fL mR7 mT5"><strong>242</strong></span> <span class="fL mR2"><img src="${ezgImagesPath}/common/hUser1.png" alt="User1"></span> <span class="fL mR2"><img src="${ezgImagesPath}/common/hUser2.png" alt="User2"></span> <span class="fL"><img src="${ezgImagesPath}/common/hUser3.png" alt="User3"></span> </span> 
                        </li>
                        <li class="col_5">
                           <h3 class="mB10 fS18">The Park Regency Ocean</h3>
                           <span class="mB10 dB"> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullnoRatingstar_icon"></span> <span>4 star</span> </span> <span class="clearfix dB"> <span class="fL mR10"><span class="location_point"></span></span> <span class="fL fS12"> 3 Bellios Street, Little India, Singapore<br>
                           5.2 km from Airport</span> </span> <span class="clearfix pD10 pL0 dB"> <span class="hotel_facility1_icon mR10"></span> <span class="hotel_facility2_icon mR10"></span> </span> <span class="dB fS22 mB10"> <span class="fcGrn">4.5</span>/5 Excellent </span> <span class="clearfix dB"> <img src="${ezgImagesPath}/common/tripadvisor.png" alt="Trip Advisor"> <img src="${ezgImagesPath}/common/hotelDotcom.png" alt="Hotel Dot Com"> <img src="${ezgImagesPath}/common/holidayiq.png" alt="Holiday IQ"> <span class="fS12">(based on 250 reviews)</span> </span> 
                        </li>
                        <li class="col_3"> <span class="fS11 notifyColor mB15 dB">Booked 2 min ago !</span> <span class="strikeOut dB"><span class="rupee">Rs.</span>9,000</span> <span class="fS27 dB"><span class="rupee">Rs.</span>9,148</span> <span class="fS12  dB mB15">Avg / night</span><a href="javascript:void(0);" class="button button-primary dB mB5" onclick="popupclose('search', 'fade'), popupwin('selectRoom', 'fade') ">Select room</a>  <span class="clearfix dB mT10"> <span class="empty_heart fL mR10"></span> <span class="share_icon fL"></span> </span> </li>
                     </ul>
                  </div>
                  <br class="cB">
                  <span class="addToCompListView">
                  <input type="checkbox" onclick="checkThis('1')">
                  <label>Add to compare</label>
                  </span> 
               </article>
               <article class=" mB60 ">
                  <div class="list-show col_12 pL0 pR0">
                     <!--Header with tags-->
                     <header class="expandedViewHeader clearfix mB20">
                        <p class="fL mR20"> <span class="holiday_tag fL"></span> <a href="javascript:void(0)">honeymooner</a>,<a href="javascript:void(0)"> luxury traveller</a>, <a href="javascript:void(0)">romantic traveller</a> </p>
                     </header>
                     <ul class="clearfix">
                        <li class="col_4 pR0 mT20 clearfix">
                           <span class="saveTag_left fL saveRps_left cB">2 nights free: Book before 15 Aug<span class="tagBtm_left fL"></span></span>
                           <div class="mB15 holidayCarousel holidayCarouselList clearfix cB slick-initialized slick-slider">
                              <div tabindex="0" class="slick-list draggable">
                                 <div style="opacity: 1; width: 1150px; transform: translate3d(-230px, 0px, 0px);" class="slick-track">
                                    <div style="width: 230px;" class="slick-slide slick-cloned"><img src="${ezgImagesPath}/diy/hotel_3.jpg" alt="HotelImage3"></div>
                                    <div style="width: 230px;" class="slick-slide slick-active"><img src="${ezgImagesPath}/diy/hotel_1.jpg" alt="HotelImage1"></div>
                                    <div style="width: 230px;" class="slick-slide"><img src="${ezgImagesPath}/diy/hotel_2.jpg" alt="HotelImage2"></div>
                                    <div style="width: 230px;" class="slick-slide"><img src="${ezgImagesPath}/diy/hotel_3.jpg" alt="HotelImage3"></div>
                                    <div style="width: 230px;" class="slick-slide slick-cloned"><img src="${ezgImagesPath}/diy/hotel_1.jpg" alt="HotelImage1"></div>
                                 </div>
                              </div>
                              <button style="display: block;" type="button" data-role="none" class="slick-prev">Previous</button><button style="display: block;" type="button" data-role="none" class="slick-next">Next</button>
                           </div>
                           <span class="clearfix dB"> <span class="heart fL mL0 mT3"></span> <span class="fL mR7 mT5"><strong>242</strong></span> <span class="fL mR2"><img src="${ezgImagesPath}/common/hUser1.png" alt="User1"></span> <span class="fL mR2"><img src="${ezgImagesPath}/common/hUser2.png" alt="User2"></span> <span class="fL"><img src="${ezgImagesPath}/common/hUser3.png" alt="User3"></span> </span> 
                        </li>
                        <li class="col_5">
                           <h3 class="mB10 fS18">The Park Regency Ocean</h3>
                           <span class="mB10 dB"> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullnoRatingstar_icon"></span> <span>4 star</span> </span> <span class="clearfix dB"> <span class="fL mR10"><span class="location_point"></span></span> <span class="fL fS12"> 3 Bellios Street, Little India, Singapore<br>
                           5.2 km from Airport</span> </span> <span class="clearfix pD10 pL0 dB"> <span class="hotel_facility1_icon mR10"></span> <span class="hotel_facility2_icon mR10"></span> </span> <span class="dB fS22 mB10"> <span class="fcGrn">4.5</span>/5 Excellent </span> <span class="clearfix dB"> <img src="${ezgImagesPath}/common/tripadvisor.png" alt="Trip Advisor"> <img src="${ezgImagesPath}/common/hotelDotcom.png" alt="Hotel Dot Com"> <img src="${ezgImagesPath}/common/holidayiq.png" alt="Holiday IQ"> <span class="fS12">(based on 250 reviews)</span> </span> 
                        </li>
                        <li class="col_3"> <span class="fS11 notifyColor mB15 dB">Booked 2 min ago !</span> <span class="strikeOut dB"><span class="rupee">Rs.</span>9,000</span> <span class="fS27 dB"><span class="rupee">Rs.</span>9,148</span> <span class="fS12  dB mB15">Avg / night</span> <a href="javascript:void(0);" class="button button-primary dB mB5">Select room</a>  <span class="clearfix dB mT10"> <span class="empty_heart fL mR10"></span> <span class="share_icon fL"></span> </span> </li>
                     </ul>
                  </div>
                  <br class="cB">
                  <span class="addToCompListView">
                  <input type="checkbox" onclick="checkThis('1')">
                  <label>Add to compare</label>
                  </span> 
               </article>
            </section>
         </div>
      </div>
      <div class="cB"></div>
   </div>
</div>