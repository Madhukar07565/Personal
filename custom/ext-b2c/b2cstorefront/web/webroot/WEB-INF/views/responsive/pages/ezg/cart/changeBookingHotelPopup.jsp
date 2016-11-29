<div class="white_content posF popupplay" id="bookpolicy16" style="top: 0px; padding-top: 20px; padding-bottom: 20px; height: 100%">
   <div class="white_content_inner w90pcnt_sm w70pcnt clearfix" id="bookpolicy16inner">
      <div class="closeBtn_popup  fR" onclick="popupclose('bookpolicy16', 'fade')"></div>
      <p class="fW600 fS20 clearfix">Change</p>
      <br>
      <section class="mB40 tabs" id="selectionTable3">
         <ul class="tabLinks clearfix">
            <li class="sel"><a href="#hotels">Hotels</a></li>
            <li><a href="#rooms">Rooms</a></li>
         </ul>
         <div class="tabsContent">
            <article class="tabContainer clearfix" id="hotels">
               <!-- hotels tab begins  -->
               <div class="clearfix pD10">
                  <div class="col_8 col_sm_12 mT20">
                     <ul>
                        <li>Ezeego1 offers instant stress free cancellations up to 2 hours before ‘Check-in’ in 3 easy steps:</li>
                        <li>1.Select Rooms</li>
                        <li>2.Review Selection</li>
                        <li>3.Confirm</li>
                     </ul>
                     <p class="mT20 mB20">Destination:<span class="fS18 fW500 txtClrDrkGry"> Delhi, India </span></p>
                     <div class="grey_border mT20 col_12 col_12_sm pR0 pL0 pB20_imp">
                        <ul class="mB10 clearfix">
                           <li class="bkgLitBlu txtClrlitGry pD10 mB10 tL">Select Rooms</li>
                           <li class="col_3 pR0">
                              <label>Check-in</label>
                              <input id="datepicker5" class="w100pcnt dateField hasDatepicker" type="text" placeholder="DD/MM/YYYY" readonly="">
                           </li>
                           <li class="col_3 pR0">
                              <label>Check-out</label>
                              <input id="datepicker6" class="w100pcnt dateField hasDatepicker" type="text" placeholder="DD/MM/YYYY" readonly="">
                           </li>
                        </ul>
                        <div class="cB"></div>
                        <div id="room_id1" class="searchFlight pD20 clearfix">
                           <ul class="row mB10 mT15 clearfix">
                              <li id="singleRooms2" class="col_2">
                                 <label>Rooms</label>
                                 <select id="room_Count" onchange="show_Rooms();" class="w100pcnt">
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
                                 <div class="passengerNum4 fL"> <span class="control addMinControl minusControl" onclick="adultCountDecrease('hAdult2_1',1)">-</span> <span id="hAdult2_1" class="control innerTxtControl">1</span> <span class="control addMinControl plusControl" onclick="adultCountIncrease('hAdult2_1',1)">+</span> </div>
                                 <input type="text" placeholder="1" maxlength="3" class="w100pcnt dN">
                                 <span class="fS11 fL w100pcnt">12+ yrs</span> 
                              </li>
                              <li class="col_2 pL0 singleRoom">
                                 <label>Children</label>
                                 <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onclick="childCountDecrease('hChild2_1',1),remChild2(7);">-</span> <span id="hChild2_1" class="control innerTxtControl">0</span> <span class="control addMinControl plusControl" onclick="childCountIncrease('hChild2_1',1),addChild2(7)">+</span> </div>
                                 <input type="text" placeholder="0" maxlength="3" class="w100pcnt dN">
                                 <span class="fS11 fL w100pcnt">2 - 12 yrs</span> 
                              </li>
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
                        <span class="mT20 clearfix mB20 cB" id="hotelOpt1"> <a href="javascript:void(0);"><img src="${ezgImagesPath}/common/collapse_blu.png" alt="Arrow" class="mL20 fL mT5">Hotel options</a> (Star rating, Property type) </span>
                        <div class="cB"></div>
                        <ul id="hotelContr1" class="dN mT10 cB mB20">
                           <li class="col_6">
                              <label>Star rating</label>
                              <div class="fL mR10">
                                 <input type="checkbox" name="check" id="rate1">
                                 <label for="rate1"><span class="trvGrp">1</span></label>
                              </div>
                              <div class="fL  mR10">
                                 <input type="checkbox" name="check" id="rate2">
                                 <label for="rate2"><span class="trvGrp">2</span></label>
                              </div>
                              <div class="fL mR10">
                                 <input type="checkbox" name="check" id="rate3">
                                 <label for="rate3"><span class="trvGrp">3</span></label>
                              </div>
                              <div class="fL mR10">
                                 <input type="checkbox" name="check" id="rate4">
                                 <label for="rate4"><span class="trvGrp">4</span></label>
                              </div>
                              <div class="fL">
                                 <input type="checkbox" name="check" id="rate5">
                                 <label for="rate5"><span class="trvGrp">5</span></label>
                              </div>
                           </li>
                           <li class="col_6">
                              <label>Property type<br>
                              <span class="fS12">(For multiple section press Ctrl and select options)</span></label>
                              <select multiple="multiple" id="hotelPtype" class="h100 w80pcnt">
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
                        <div class="clearfix"></div>
                     </div>
                     <div class="fR mT20 mB10">
                        <span class="tertiaryBtn "><a href="#"><span class="forwardAro mR10"></span>Back to Booking</a></span>
                        <span class="primaryBtn "><a href="#" onclick="popupclose('bookpolicy16', 'fade'),popupwin('bookpolicy17', 'bookpolicy17inner', 'fade')">Search</a></span>
                     </div>
                  </div>
                  <aside class="col_4 col_sm_12 pR0 mB10" style="margin-top:8px;">
                     <div class="bkgLitBlu pD10">
                        <p class="fW500 fS21 clearfix mL10">Booking Policy</p>
                        <p class="mB15 mL10 mT10">Hotel Change Fee Rs. 1500 per room</p>
                        <p class="mL10 lineH20 fS12 ">
                           Hotel change fee will be deducted after you<br>
                           confirm changes and the balance refunded to<br>
                           your account in 7 working days.<br>
                           Read completed<a href="javascript: void(0);"> Booking Policy</a><br>
                        </p>
                     </div>
                     <div class="bkgLitBlu mT25">
                        <p class="mL10 lineH20 pD10 fS12"><span class="txtClrOrng">important Information:</span>
                           Guests for whom there are no changes can check in with the same voucher.
                        </p>
                        <br>
                     </div>
                  </aside>
               </div>
            </article>
            <!-- hotels tab End  -->
            <article class="tabContainer pD20 dN" id="rooms">
               <!-- Services tab begins  -->
               <div class="clearfix pD10">
                  <div class="col_9 col_sm_12 mT20">
                     <ul>
                        <li>Ezeego1 offers instant stress free cancellations up to 2 hours before ‘Check-in’ in 3 easy steps:</li>
                        <li>1.Select Rooms</li>
                        <li>2.Review Selection</li>
                        <li>3.Confirm</li>
                     </ul>
                     <p class="fW600 fS20 mT20 clearfix">Trident Hotel, Delhi, India</p>
                     <br>
                     <div class="grey_border mT20 clearfix col_12 col_12_sm pR0 pL0">
                        <ul class="mB10 clearfix">
                           <li class="bkgLitBlu txtClrlitGry pD10 mB10 tL">Select Dates and Number of Rooms</li>
                           <li class="col_3 pR0">
                              <label>Check-in</label>
                              <input id="datepicker32" class="w100pcnt dateField  hasDatepicker" type="text" placeholder="DD/MM/YYYY" readonly="">
                           </li>
                           <li class="col_3 pR0">
                              <label>Check-out</label>
                              <input id="datepicker33" class="w100pcnt dateField  hasDatepicker" type="text" placeholder="DD/MM/YYYY" readonly="">
                           </li>
                        </ul>
                        <div class="clearfix">
                           <ul class="mB10 mT15 clearfix">
                              <li class="col_1"><span>
                                 <input type="checkbox" name="change"><label></label>
                                 </span>
                              </li>
                              <li class="col_3">
                                 <span class="fL "><img src="${ezgImagesPath}/hotel_5.png" alt="Hotel"></span>
                              </li>
                              <li class="col_3 col_sm_4 pL10 pR0 fS12_sm tL">
                                 <span class="w86pcnt txtClrlitGry">Standard double room</span><br>
                                 <span class="txtClrlitGry w86pcnt">With Breakfast &amp; dinner </span><br>
                                 <a href="javascript:void(0);">Pricing and Room Info</a>
                              </li>
                           </ul>
                           <ul class="mB10 mT15 clearfix">
                              <li class="col_2 singleRoom">
                                 <label>Adult</label>
                                 <div class="passengerNum4 fL"> <span class="control addMinControl minusControl" onclick="adultCountDecrease('hAdult3_1',1)">-</span> <span id="hAdult3_1" class="control innerTxtControl">1</span> <span class="control addMinControl plusControl" onclick="adultCountIncrease('hAdult3_1',1)">+</span> </div>
                                 <input type="text" placeholder="1" maxlength="3" class="w100pcnt dN">
                                 <span class="fS11 fL w100pcnt">12+ yrs</span> 
                              </li>
                              <li class="col_2 pL0 singleRoom">
                                 <label>Children</label>
                                 <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onclick="childCount_Decrease1('hChild3_1',1),rem_Child1(5);">-</span> <span id="hChild1_3" class="control innerTxtControl">0</span> <span class="control addMinControl plusControl" onclick="childCount_Increase1('hChild3_1',1),add_Child1(5)">+</span> </div>
                                 <input type="text" placeholder="0" maxlength="3" class="w100pcnt dN">
                                 <span class="fS11 fL w100pcnt">2 - 12 yrs</span> 
                              </li>
                           </ul>
                        </div>
                        <hr class="brdrBLitGry">
                        <div class="clearfix">
                           <ul class="mB10 mT15 clearfix">
                              <li class="col_1"><span>
                                 <input type="checkbox" name="change"><label></label>
                                 </span>
                              </li>
                              <li class="col_3">
                                 <span class="fL "><img src="${ezgImagesPath}/hotel_5.png" alt="Hotel"></span>
                              </li>
                              <li class="col_3 pL0 pR0 fS12_sm tL">
                                 <span class="w86pcnt txtClrlitGry">Standard double room</span><br>
                                 <span class="txtClrlitGry w86pcnt">With Breakfast &amp; dinner </span><br>
                              </li>
                           </ul>
                           <ul class="mB10 mT15 clearfix">
                              <li class="col_2 singleRoom">
                                 <label>Adult</label>
                                 <div class="passengerNum4 fL"> <span class="control addMinControl minusControl" onclick="adultCount_Decrease1('hAdult1_2',1)">-</span> <span id="hAdult1_2" class="control innerTxtControl">1</span> <span class="control addMinControl plusControl" onclick="adultCount_Increase1('hAdult1_2',1)">+</span> </div>
                                 <input type="text" placeholder="1" maxlength="3" class="w100pcnt dN">
                                 <span class="fS11 fL w100pcnt">12+ yrs</span> 
                              </li>
                              <li class="col_2 pL0 singleRoom">
                                 <label>Children</label>
                                 <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onclick="childCount_Decrease1('hChild1_2',1),rem_Child1(5);">-</span> <span id="hChild1_2" class="control innerTxtControl">0</span> <span class="control addMinControl plusControl" onclick="childCount_Increase1('hChild1_2',1),add_Child1(5)">+</span> </div>
                                 <input type="text" placeholder="0" maxlength="3" class="w100pcnt dN">
                                 <span class="fS11 fL w100pcnt">2 - 12 yrs</span> 
                              </li>
                              <li class="col_4 mB10 singleRoom">
                                 <ul>
                                    <li class="col_6 mB10 pR0" id="child51"></li>
                                    <li class="col_6 mB10 pR0" id="child52"></li>
                                    <li class="col_6 mB10 pR0" id="child53"></li>
                                    <li class="col_6 mB10 pR0" id="child54"></li>
                                    <li class="col_6 mB10 pR0" id="child55"></li>
                                    <li class="col_6 mB10 pR0" id="child56"></li>
                                    <li class="col_6 mB10 pR0" id="child57"></li>
                                    <li class="col_6 mB10 pR0" id="child58"></li>
                                    <li class="col_6 mB10 pR0" id="child59"></li>
                                 </ul>
                              </li>
                           </ul>
                        </div>
                     </div>
                     <div class="fR mT20 mB10">
                        <span class="tertiaryBtn "><a href="#"><span class="forwardAro mR10"></span>Back to Booking</a></span>
                        <span class="primaryBtn "><a href="#" onclick="popupclose('bookpolicy16', 'fade'),popupwin('bookpolicy18', 'bookpolicy18inner', 'fade')">Cancel</a></span>
                     </div>
                  </div>
                  <aside class="col_3 col_sm_12 pR0 mB10" style="margin-top:8px;">
                     <div class="bkgLitBlu pD10">
                        <p class="fW500 fS21 clearfix mL10">Booking Policy</p>
                        <br>
                        <p class="mL10 lineH20 fS12 ">
                           In case of round trip discounted fares, partial cancellation is not allowed
                        </p>
                        <p class="mT10 mL10 lineH20 fS12 mB10">Hotel Cancellation Fee Rs. 1500 per room</p>
                        <p class="mL10 lineH20 fS12 ">Hotel cancellation fee will be deducted after<br> you confirm cancellation and the balance<br> refunded to your account in 7 working days.</p>
                        <p class="mT10 mL10 lineH20 fS12 mB10">
                           Read completed<a href="javascript: void(0);"> Booking Policy</a><br>
                        </p>
                     </div>
                     <div class="bkgLitBlu mT25">
                        <p class="mL10 lineH20 pD10 fS12"><span class="txtClrOrng">important Information:</span>
                           Guests for whom there are no changes can check in with the same voucher
                        </p>
                        <p class="mT10 mL10 pD10 lineH20 fS12">To modify the number of guests in a room, select 'Change’ instead of 'Cancel'</p>
                     </div>
                  </aside>
               </div>
            </article>
         </div>
      </section>
   </div>
</div>