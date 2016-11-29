<div class="white_content posF popupplay" id="bookpolicy46" style="top: 0px; padding-top: 20px; padding-bottom: 20px; height: 100%">
   <div class="white_content_inner w90pcnt clearfix" id="bookpolicy46inner">
      <div class="closeBtn_popup fR clearfix" onclick="popupclose('bookpolicy46', 'fade')"></div>
      <div class="col_12 mT10">
         <p class="fS18 fW600 clearfix mB15">Add</p>
         <section class="mB40 tabs" id="selectionTable17">
            <ul class="tabLinks clearfix">
               <li class="fS8_sm sel"><a href="#addguest"> Guest(s)</a></li>
               <li class="fS8_sm"><a href="#addservice">Services</a></li>
            </ul>
            <div class="tabsContent">
               <article class="tabContainer clearfix pD10" id="addguest" style="display: block;">
                  <div class="col_12 pD10">
                     <div class="grey_border mT20 col_12 col_12_sm pR0 pL0 pB20_imp">
                        <ul class="mB10 clearfix">
                           <li class="col_12 bkgLitBlu txtClrlitGry pD10 mB10">Select Rooms &amp; travelers</li>
                           <li class="col_6 pR0 mT20">
                              <div class="search-bar clearfix w60pcnt">
                                 <input class="sfield ui-autocomplete-input grey_bg w100pcnt" name="searchterm" placeholder="Mumbai" id="holidayDestination_1" autocomplete="off" type="text">
                              </div>
                           </li>
                           <li class="col_6 pR0 mT20">
                              <div class="search-bar clearfix w60pcnt">
                                 <input class="sfield ui-autocomplete-input grey_bg w100pcnt" name="searchterm" placeholder="Delhi" autocomplete="off" type="text">
                              </div>
                           </li>
                        </ul>
                        <div class="cB"></div>
                        <ul class="mB10 clearfix">
                           <li class="col_6 pR0">
                              <label>Depart</label>
                              <input id="datepicker8" class="w60pcnt dateField hasDatepicker" placeholder="DD/MM/YYYY" readonly="" type="text">
                           </li>
                           <li class="col_6 pR0">
                              <label>Return</label>
                              <input id="datepicker22" class="w60pcnt dateField hasDatepicker" placeholder="DD/MM/YYYY" readonly="" type="text">
                           </li>
                        </ul>
                        <div class="cB"></div>
                        <ul class="col_12 mB10 clearfix">
                           <li class="col_6 pR0 pL0">
                              <label>Hotel</label>
                              <div class="search-bar  clearfix w60pcnt">
                                 <input class="sfield ui-autocomplete-input grey_bg w100pcnt" name="searchterm" placeholder="Delhi" autocomplete="off" type="text">
                              </div>
                           </li>
                           <li class="col_6 pL0 pR0 mT20"><input class="chkCoverage w100pcnt" name="All" type="checkbox"><label class="label">Hotel stay at different dates</label></li>
                        </ul>
                        <div class="clearfix"></div>
                        <ul class="mB10 clearfix">
                           <li class="col_6 pR0">
                              <label>Check-in</label>
                              <input id="datepicker23" class="w60pcnt dateField hasDatepicker" placeholder="DD/MM/YYYY" readonly="" type="text">
                           </li>
                           <li class="col_6 pR0">
                              <label>Check-out</label>
                              <input id="datepicker24" class="w60pcnt dateField hasDatepicker" placeholder="DD/MM/YYYY" readonly="" type="text">
                           </li>
                        </ul>
                        <div class="cB"></div>
                        <ul class="mB10 mT15 clearfix">
                           <li id="singleRooms_1" class="col_2">
                              <label>Rooms</label>
                              <select id="noOfRooms_1" onchange="showRooms();" class="w50pcnt">
                                 <option value="1">1</option>
                                 <option value="2">2</option>
                                 <option value="3">3</option>
                              </select>
                           </li>
                           <li id="groupBookingRooms_1" class="col_2 dN">
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
                              <div class="passengerNum4 fL"> <span class="control addMinControl minusControl" onclick="adultCountDec('hAdult4_1',1)">-</span> <span id="hAdult4_1" class="control innerTxtControl">1</span> <span class="control addMinControl plusControl" onclick="adultCountInc('hAdult4_1',1)">+</span> </div>
                              <input type="text" placeholder="1" maxlength="3" class="w100pcnt dN">
                              <span class="fS11 fL w100pcnt">12+ yrs</span> 
                           </li>
                           <li class="col_2 pL0 singleRoom">
                              <label>Children</label>
                              <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onclick="childCountDec('hChild4_1',1),remChild(1);">-</span> <span id="hChild4_1" class="control innerTxtControl">0</span> <span class="control addMinControl plusControl" onclick="childCountInc('hChild4_1',1),addChild(1)">+</span> </div>
                              <input type="text" placeholder="0" maxlength="3" class="w100pcnt dN">
                              <span class="fS11 fL w100pcnt">2 - 12 yrs</span> 
                           </li>
                           <li class="col_4 mB10 singleRoom">
                              <ul>
                                 <li class="col_6 mB10 pR0" id="child4_1"></li>
                                 <li class="col_6 mB10 pR0" id="child4_2"></li>
                                 <li class="col_6 mB10 pR0" id="child4_3"></li>
                                 <li class="col_6 mB10 pR0" id="child4_4"></li>
                                 <li class="col_6 mB10 pR0" id="child4_5"></li>
                                 <li class="col_6 mB10 pR0" id="child4_6"></li>
                                 <li class="col_6 mB10 pR0" id="child4_7"></li>
                                 <li class="col_6 mB10 pR0" id="child4_8"></li>
                                 <li class="col_6 mB10 pR0" id="child4_9"></li>
                              </ul>
                           </li>
                        </ul>
                        <div id="room2_4" class="singleRoom"></div>
                        <div id="room3_4" class="singleRoom"></div>
                        <div class="clearfix"></div>
                     </div>
                  </div>
                  <div class="clearfix"></div>
                  <div class="col_12 mT20">
                     <div class="fR ">
                        <span class="tertiaryBtn"><a href="javascript:void(0);"><span class="forwardAro mR10"></span>Back to Booking</a></span>
                        <span class="primaryBtn"><a href="javascript:void(0);">Search</a></span>
                     </div>
                  </div>
               </article>
               <article class="tabContainer clearfix dN pD10" id="addservice" style="display: none;">
                  <div class="col_12">
                     <p class="fS16"><span class="room_icon mR10"></span>Room 1- Standard Double Room with Breakfast</p>
                     <ul class="mB10 clearfix mT20">
                        <li class="col_3 pL0">
                           <label>Traveller Name</label>
                        </li>
                        <li class="col_2 pL0 pR10" style="margin-left:38px;">
                           <select class="w100pcnt">
                              <option value="Title.">Title.</option>
                              <option value="Mr.">Mr.</option>
                              <option value="Ms.">Ms.</option>
                              <option value="Mrs.">Mrs.</option>
                           </select>
                        </li>
                        <li class="col_2 pL0 pR10">
                           <input value="" class="w100pcnt" type="text" placeholder="First Name">
                        </li>
                        <li class="col_2 pL0 pR0">
                           <input value="" class="w100pcnt" type="text" placeholder="Last Name">
                        </li>
                     </ul>
                     <ul class="mT10 clearfix">
                        <li class="col_1 pL0 pR0"><i class="gift_icon fL mR20"></i></li>
                        <li class="col_3 pL0 pR0 mT10 w20pcnt fS12_sm">
                           <input type="checkbox" name="bag" checked=""><label>Car Parking @</label>
                        </li>
                        <li class="col_2 pL0 pR10 mT10">
                           <select class="w100pcnt">
                              <option>1 day @ Rs 350</option>
                           </select>
                        </li>
                        <li class="col_2 pR0 pL0 mT10">
                           <select id="My_Select17" class="dN w60pcnt">
                              <option>1</option>
                              <option>2</option>
                              <option>3</option>
                           </select>
                           <input value="" id="text18" class="w60pcnt" type="text" placeholder="1" readonly="" style="color: rgb(170, 170, 170);">
                        </li>
                        <li class="col_2_half col_sm_4 pL0 mT10">
                           <span class="fR fS16 mT5">(-) Rs. 600</span>
                           <a href="javascript:void(0);" class="fR"><i class="recycle_icon_wishlist mT5"></i></a>
                           <span onclick="switchVisible17()" class="fR mR10"><i class="edit_icon"></i></span>
                        </li>
                     </ul>
                     <ul class="clearfix mT10">
                        <li class="col_1 pL0 pR0 mT10">&nbsp; </li>
                        <li class="col_7 pL0 pR0 mT10 w20pcnt fS12_sm">
                           <input type="checkbox" name="bag"><label>Wifi</label>
                        </li>
                        <li class="col_2 pL0 mT10">
                        </li>
                     </ul>
                     <ul class="clearfix">
                        <li class="col_1 pL0 pR0 mT10">&nbsp; </li>
                        <li class="col_3 pL0 pR0 mT10 w20pcnt fS12_sm">
                           <input type="checkbox" name="bag"><label>Extra Luggage</label>
                        </li>
                        <li class="col_2 pL0 mT10 pR10">
                           <select class="w100pcnt">
                              <option>20kg day @ Rs 600</option>
                           </select>
                        </li>
                     </ul>
                     <ul class="clearfix mB20">
                        <li class="col_1 pL0 pR0 mT10">&nbsp; </li>
                        <li class="col_3 pL0 pR0 w20pcnt  mT10 fS12_sm">
                           <input type="checkbox" name="special_requests"><label>Special Requests</label>
                        </li>
                        <li class="col_7 pL0 pR0 mT10"><input type="text" name="special_requests" class="w60pcnt" placeholder="Special Request"></li>
                     </ul>
                  </div>
                  <hr class="mT10 mB10">
                  <div class="clearfix"></div>
                  <div class="col_12 cB">
                     <p class="tR pD10 lH20">
                        Amount Paid:   <span class="fW600 fS18">500</span><br>
                        Cancellation charges:<span class="fW600 fS18"> Rs 50</span><br>
                        <span class="darkgrey_bg pD5"><span class="fS12">You will receive the refund in 2 working days.</span>Refund:<span class="fW600 fS21">Rs 450</span></span>
                     </p>
                  </div>
                  <div class="fR mT20 cB">
                     <span class="tertiaryBtn "><a href="javascript:void(0);"><span class="forwardAro mR10"></span>Back to Booking</a></span>
                     <span class="primaryBtn "><a href="javascript:void(0);" onclick="popupclose('bookpolicy46', 'fade'),popupwin('cancellation13', 'cancellation13inner', 'fade')">Proceed</a></span>
                  </div>
               </article>
            </div>
         </section>
      </div>
   </div>
</div>