<div class="white_content posF popupplay" id="bookpolicy19" style="top: 0px; padding-top: 20px; padding-bottom: 20px; height: 100%">
   <div class="white_content_inner w90pcnt clearfix" id="bookpolicy19inner">
      <div class="closeBtn_popup  fR" onclick="popupclose('bookpolicy19', 'fade')"></div>
      <div class="fS18 pB10 fW600 mB10">Add</div>
      <br>
      <section class="mB40 tabs" id="selectionTable5">
         <ul class="tabLinks clearfix">
            <li class="fS8_sm sel"><a href="#hotelsrooms">Rooms</a></li>
            <li class="fS8_sm"><a href="#hotelservices">Services</a></li>
         </ul>
         <div class="tabsContent">
            <article class="tabContainer clearfix" id="hotelsrooms" style="display: block;">
               <!-- hotelsrooms tab begins  -->
               <div class="clearfix pD10">
                  <p class="fS18 pB10 fW600 mB10 mT20">Trident Hotel, Delhi, India</p>
                  <div class="grey_border mT20 col_12 col_12_sm pR0 pL0 pB20_imp">
                     <ul class="mB10 clearfix">
                        <li class="bkgLitBlu txtClrlitGry pD10 mB10 tL">Select Rooms</li>
                        <li class="col_3 pR0">
                           <label>Check-in</label>
                           <input type="text" id="checkinDate13" placeholder="dd/mm/yyyy" class="dateField mB10 w100pcnt hasDatepicker" readonly="">
                        </li>
                        <li class="col_3 pR0">
                           <label>Check-out</label>
                           <input type="text" id="checkoutDate14" class="w100pcnt dateField  hasDatepicker" placeholder="DD/MM/YYYY" readonly="">
                        </li>
                     </ul>
                     <div class="cB"></div>
                     <div id="rooms2">
                        <ul class="mB10 mT15 clearfix">
                           <li id="singleRoomss" class="col_2 mL20">
                              <label>Rooms</label>
                              <select id="noOfRooms2" onchange="showRoomsHotel()">
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
                              <div class="adderOuter"> <span onclick="adultCountDec1('hAdult5_1',1)" class="control addMinControl minusControl cursor fW600">-</span> <span id="hAdult5_1" class="control innerTxtControl">1</span> <span onclick="adultCountInc1('hAdult5_1',1)" class="control addMinControl plusControl cursor fW600">+</span> </div>
                              <input type="text" placeholder="1" maxlength="3" class="w100pcnt dN">
                              <span class="fS11 fL w100pcnt">12+ yrs</span> 
                           </li>
                           <li class="col_2 pL0 singleRoom">
                              <label>Children</label>
                              <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onclick="childCount_Decrease1('hChild3_3',1),rem_Child1(1);">-</span> <span id="hChild3_3" class="control innerTxtControl">0</span> <span class="control addMinControl plusControl" onclick="childCount_Increase1('hChild3_3',1),add_Child1(1)">+</span> </div>
                              <input type="text" placeholder="0" maxlength="3" class="w100pcnt dN">
                              <span class="fS11 fL w100pcnt">2 - 12 yrs</span> 
                           </li>
                           <li class="col_4 mB10 singleRoom">
                              <ul>
                                 <li class="col_6 mB10 pR0" id="child1_001"></li>
                                 <li class="col_6 mB10 pR0" id="child1_002"></li>
                                 <li class="col_6 mB10 pR0" id="child1_003"></li>
                                 <li class="col_6 mB10 pR0" id="child1_004"></li>
                                 <li class="col_6 mB10 pR0" id="child1_005"></li>
                                 <li class="col_6 mB10 pR0" id="child1_006"></li>
                                 <li class="col_6 mB10 pR0" id="child1_007"></li>
                                 <li class="col_6 mB10 pR0" id="child1_008"></li>
                                 <li class="col_6 mB10 pR0" id="child1_009"></li>
                              </ul>
                           </li>
                        </ul>
                     </div>
                     <div id="rooms42" class="singleRoom"></div>
                     <div id="rooms52" class="singleRoom"></div>
                     <div class="cB"></div>
                     <a href="javascript:void(0)" class="dB mB15 mL15" id="moreInfo6" onclick="showMoreInfo('moreInfo6','holidyOptions6Container','plusMinus6')"><span id="plusMinus6">+</span>Hotel options (Star rating, Property type)</a>
                     <div id="holidyOptions6Container" class="clearfix dN">
                        <ul class="clearfix mB20">
                           <li class="col_6">
                              <label>Star rating</label>
                              <div class="fL mR10">
                                 <input name="check" id="rate21" type="checkbox">
                                 <label for="rate1"><span class="trvGrp">1</span></label>
                              </div>
                              <div class="fL  mR10">
                                 <input name="check" id="rate32" type="checkbox">
                                 <label for="rate2"><span class="trvGrp">2</span></label>
                              </div>
                              <div class="fL mR10">
                                 <input name="check" id="rate23" type="checkbox">
                                 <label for="rate3"><span class="trvGrp">3</span></label>
                              </div>
                              <div class="fL mR10">
                                 <input name="check" id="rate24" type="checkbox">
                                 <label for="rate4"><span class="trvGrp">4</span></label>
                              </div>
                              <div class="fL">
                                 <input name="check" id="rate25" type="checkbox">
                                 <label for="rate5"><span class="trvGrp">5</span></label>
                              </div>
                           </li>
                           <li class="col_6 mB20">
                              <label>Property type<br>
                              <span class="fS12">(For multiple section press Ctrl and select options)</span></label>
                              <select multiple="multiple" id="hotelPtypeadd" class="h100 w100pcnt">
                                 <option value="All" selected="selected">All</option>
                                 <option value="Bed and Breakfast">Bed and Breakfast</option>
                                 <option value="Boutique Hotel">Boutique Hotel</option>
                                 <option value="Guest House">Guest House</option>
                                 <option value="Heritage Hotel">Heritage Hotel</option>
                                 <option value="Home Stay">Home Stay</option>
                                 <option value="Resort">Resort</option>
                                 <option value="Serviced Apartments">Serviced Apartments</option>
                              </select>
                           </li>
                        </ul>
                     </div>
                     <div class="clearfix"></div>
                  </div>
                  <div class="fR mT20 mB10">
                     <span class="tertiaryBtn "><a href="#"><span class="forwardAro mR10"></span>Back to Booking</a></span>
                     <span class="primaryBtn "><a href="javascript:void(0);">Search</a></span>
                  </div>
               </div>
            </article>
            <article class="tabContainer pD20 dN" id="hotelservices" style="display: none;">
               <!-- Services tab begins  -->
               <div id="wayContr10" class="clearfix">
                  <div class="col_12">
                     <p class="fS16"><span class="hotel_small mR10"></span>Room 1- Standard Double Room with Breakfast</p>
                     <ul class="mB10 clearfix mT10">
                        <li class="col_2 pL0">
                           <label>Traveller Name</label>
                        </li>
                        <li class="col_1 ">
                           <select>
                              <option value="Title.">Title.</option>
                              <option value="Mr.">Mr.</option>
                              <option value="Ms.">Ms.</option>
                              <option value="Mrs.">Mrs.</option>
                           </select>
                        </li>
                        <li class="col_3 pL0 pR10">
                           <input value="" class="w100pcnt" type="text" placeholder="First Name">
                        </li>
                        <li class="col_3 pL0 pR0">
                           <input value="" class="w100pcnt" type="text" placeholder="Last Name">
                        </li>
                     </ul>
                     <ul class="mT10 clearfix">
                        <li class="col_1 pL0 pR0"><i class="baggage_icon fL mR20"></i></li>
                        <li class="col_3 pL0 pR0 w20pcnt fS12_sm">
                           <input type="checkbox" name="bag" checked=""><label>Car Parking @</label>
                        </li>
                        <li class="col_3">
                           <select class="w100pcnt">
                              <option>1 day @ Rs 350</option>
                           </select>
                        </li>
                        <li class="col_2 pR0 pL0">
                           <select id="My_Select6" class="dN w60pcnt">
                              <option>1</option>
                              <option>2</option>
                              <option>3</option>
                           </select>
                           <input value="" id="text7" class="w60pcnt" type="text" placeholder="1" readonly="" style="color: rgb(170, 170, 170);">
                        </li>
                        <li class="col_3_half pL0">
                           <span class="fR fS16">(-) Rs. 450</span>
                           <a href="javascript:void(0);" class="fR mT5"><i class="recycle_icon_wishlist"></i></a>
                           <span onclick="switchVisible6()" class="fR mR10"><i class="edit_icon"></i></span>
                        </li>
                     </ul>
                     <ul class="clearfix">
                        <li class="col_1 pL0 pR0 mT10">&nbsp; </li>
                        <li class="col_3 pL0 pR0 w20pcnt fS12_sm">
                           <input type="checkbox" name="bag"><label>Wi-Fi @</label>
                        </li>
                        <li class="col_3 mT10">
                           <select class="w100pcnt">
                              <option>1 day @ Rs 350</option>
                           </select>
                        </li>
                        <li class="col_2 pR0 pL0 mT10">
                           <select class="w60pcnt">
                              <option>1 day</option>
                           </select>
                        </li>
                     </ul>
                     <ul class="clearfix">
                        <li class="col_1 pL0 pR0 mT10">&nbsp; </li>
                        <li class="col_3 pL0 pR0 w20pcnt  mT10 fS12_sm">
                           <input type="checkbox" name="special_requests"><label>Special Requests</label>
                        </li>
                        <li class="col_5 mT10"><input type="text" name="special_requests" class="w77pcnt mL20" placeholder="Special Request"></li>
                     </ul>
                  </div>
                  <hr class="mT10 mB10">
                  <div class="clearfix"></div>
                  <div class="col_12 cB">
                     <p class="tR pD10 lH20">
                        Amount Paid:   <span class="fW600 fS18"><span class="rupees"></span> 500</span>
                     </p>
                  </div>
                  <div class="fR mT20 cB">
                     <span class="tertiaryBtn "><a href="javascript:void(0);"><span class="forwardAro mR10"></span>Back to Booking</a></span>
                     <span class="primaryBtn "><a href="#" onclick="popupclose('bookpolicy19', 'fade'),popupwin('cancellation3', 'cancellation3inner', 'fade')">Proceed</a></span>
                  </div>
               </div>
            </article>
         </div>
      </section>
   </div>
</div>