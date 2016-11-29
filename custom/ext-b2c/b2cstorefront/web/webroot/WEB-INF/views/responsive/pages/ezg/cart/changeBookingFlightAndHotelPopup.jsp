<div class="white_content posF popupplay" id="bookpolicy45" style="top: 0px; padding-top: 20px; padding-bottom: 20px; height: 100%">
   <div class="white_content_inner w90pcnt clearfix" id="bookpolicy45inner">
      <div class="closeBtn_popup fR" onclick="popupclose('bookpolicy45', 'fade')"></div>
      <p class="fW500 fS21 clearfix">Change Booking</p>
      <br>
      <div class="clearfix">
         <div class="col_8 col_sm_12">
            <ul>
               <li>Ezeego1 allows amendment up to 2 hours before ‘travel’ in 3 easy steps:</li>
               <li>1.Select Dates</li>
               <li>2.Review Selection</li>
               <li>3.Pay Difference</li>
            </ul>
            <div class="grey_border mT20 col_12 col_12_sm pR0 pL0 pB20_imp">
               <ul class="mB10 clearfix">
                  <li class="bkgLitBlu txtClrlitGry pD10 mB10 tL">Select sector(s), travel dates</li>
               </ul>
               <div class="cB"></div>
               <ul class="clearfix pT10 pD10 dB">
                  <li class="col_5">
                     <label>Flight 1:</label>
                     <input autocomplete="off" class="w100pcnt ui-autocomplete-input" placeholder="From" type="text">
                  </li>
                  <li class="next col_3">
                     <label>&nbsp;</label>
                     <input autocomplete="off" class="w100pcnt ui-autocomplete-input" placeholder="To" type="text">
                  </li>
                  <li class="col_3">
                     <label>Depart</label>
                     <input id="datepicker21" class="w100pcnt dateField hasDatepicker" placeholder="dd/mm/yyyy" readonly="" type="text">
                  </li>
                  <li class="next cB mT10 col_5">
                     <input checked="" type="checkbox">
                     <label class="fS12">Need hotel in Delhi</label>
                  </li>
                  <li class="mT10 col_3">
                     <label>Check in</label>
                     <input id="checkinDate2" class="w100pcnt dateField hasDatepicker" placeholder="dd/mm/yyyy" readonly="" type="text">
                  </li>
                  <li class="col_3 mT10">
                     <label>Check out</label>
                     <input id="checkoutDate2" class="w100pcnt dateField hasDatepicker" placeholder="dd/mm/yyyy" readonly="" type="text">
                  </li>
               </ul>
               <div class="add_city_index11">
                  <ul class="mB10 clearfix">
                     <li class="col_5"><label>Flight 2:</label><input autocomplete="off" class="w100pcnt ui-autocomplete-input" placeholder="From" type="text"></li>
                     <li class="next col_3"><label>&nbsp;</label><input autocomplete="off" class="w100pcnt ui-autocomplete-input" placeholder="To" type="text"></li>
                     <li class="col_3"><label>Depart</label><input id="datepicker23" class="w100pcnt dateField hasDatepicker" placeholder="dd/mm/yyyy" readonly="" type="text"></li>
                     <li class="next cB mT10 col_5"><input type="checkbox"><label class="fS12">Need hotel in Delhi</label></li>
                     <li class="mT10 col_3"><label>Check in</label><input id="datepicker40" class="w100pcnt dateField hasDatepicker" placeholder="dd/mm/yyyy" readonly="" type="text"></li>
                     <li class="mT10 col_3"><label>Check out</label><input id="datepicker53" class="w100pcnt dateField hasDatepicker" placeholder="dd/mm/yyyy" readonly="" type="text"></li>
                     <li class="col_1 mT30 pR0 remove_field"><span class="show_contr_close"></span></li>
                  </ul>
               </div>
               <div class="clearfix mB15 mT10 mL20"> <span class="add_city_button_index11 mR5 fL addIcon"></span> <span class="fL mT10 cursor">Add city</span> </div>
               <div class="searchFlight pD10 clearfix mL20">
                  <ul class="row mB10 mT15 clearfix">
                     <li id="singleRooms2_1" class="col_2">
                        <label>Rooms</label>
                        <select id="room_Count1" onchange="show_Rooms();" class="w50pcnt">
                           <option value="1">1</option>
                           <option value="2">2</option>
                           <option value="3">3</option>
                        </select>
                     </li>
                     <li id="groupBookingRooms2_1" class="col_2 dN">
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
                        <div class="passengerNum4 fL"> <span class="control addMinControl minusControl" onclick="adultCountDecrease('hAdult2_5',1)">-</span> <span id="hAdult2_5" class="control innerTxtControl">1</span> <span class="control addMinControl plusControl" onclick="adultCountIncrease('hAdult2_5',1)">+</span> </div>
                        <input type="text" placeholder="1" maxlength="3" class="w100pcnt dN">
                        <span class="fS11 fL w100pcnt">12+ yrs</span> 
                     </li>
                     <li class="col_2 pL0 singleRoom">
                        <label>Children</label>
                        <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onclick="childCountDecrease('hChild2_5',1),remChild2(7);">-</span> <span id="hChild2_5" class="control innerTxtControl">0</span> <span class="control addMinControl plusControl" onclick="childCountIncrease('hChild2_5',1),addChild2(7)">+</span> </div>
                        <input type="text" placeholder="0" maxlength="3" class="w100pcnt dN">
                        <span class="fS11 fL w100pcnt">2 - 12 yrs</span> 
                     </li>
                     <li class="col_4 mB10 singleRoom">
                        <ul>
                           <li class="col_6 mB10 pR0" id="child5_11"></li>
                           <li class="col_6 mB10 pR0" id="child5_12"></li>
                           <li class="col_6 mB10 pR0" id="child5_13"></li>
                           <li class="col_6 mB10 pR0" id="child5_14"></li>
                           <li class="col_6 mB10 pR0" id="child5_15"></li>
                           <li class="col_6 mB10 pR0" id="child5_16"></li>
                           <li class="col_6 mB10 pR0" id="child5_17"></li>
                           <li class="col_6 mB10 pR0" id="child5_18"></li>
                           <li class="col_6 mB10 pR0" id="child5_19"></li>
                        </ul>
                     </li>
                  </ul>
               </div>
               <div id="room_id2_5" class="singleRoom"></div>
               <div id="room_id3_5" class="singleRoom"></div>
               <div class="cB"></div>
               <div class="clearfix"></div>
               <div class="fR mT20 mB20">
                  <span class="tertiaryBtn "><a href="#"><span class="forwardAro mR10"></span>Back to Booking</a></span>
                  <span class="primaryBtn "><a href="javascript:void(0);">Search</a></span>
               </div>
            </div>
         </div>
         <aside class="col_4 col_sm_12 pR0 mB10" style="margin-top:8px;">
            <div class="bkgLitBlu pD10">
               <p class="fW500 fS21 clearfix mL10">Booking Policy</p>
               <p class="mB15 mL10 mT10 fS12">Flight + Hotel Change Fee</p>
               <p class="mL10 lineH20 fS12 ">
                  Adult: Rs. 1500/adult<br>
                  Child: Rs. 1500/Childo<br>
                  Infant: Rs. 0
               </p>
               <br>
               <p class="mL10 lineH20 fS12 ">
                  Flight + Hotel change fee will be deducted after you confirm changes and the balance refunded to your account in 7 working days.
               </p>
               <br>
               <p class="mL10 lineH20 fS12 ">
                  Read completed<a href="javascript: void(0);"> Booking Policy</a><br>
               </p>
            </div>
         </aside>
      </div>
   </div>
</div>