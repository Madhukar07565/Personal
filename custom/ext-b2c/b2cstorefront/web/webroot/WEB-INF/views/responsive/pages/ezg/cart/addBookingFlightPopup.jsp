<div class="white_content posF popupplay" id="bookpolicy5" style="top: 0px; padding-top: 20px; padding-bottom: 20px; height: 100%">
   <div class="white_content_inner w90pcnt_sm w60pcnt pD20 clearfix" id="bookpolicy5inner">
      <div class="closeBtn_popup fR clearfix" onclick="popupclose('bookpolicy5', 'fade')"></div>
      <span class="fW500 fS21 mR15 mT10 mB10 clearfix">Add</span> 
      <section class="mB40 tabs" id="selectionTable23">
         <ul class="tabLinks clearfix">
            <li class="fS8_sm sel"><a href="#wayContr7">Travellers</a></li>
            <li class="fS8_sm"><a href="#wayContr8">Services</a></li>
         </ul>
         <div class="tabsContent">
            <article id="wayContr7" class="clearfix tabContainer pD20" style="display: block;">
               <div class="col_12 pL0 pR0">
                  <ul class="mB10 col_12 pB10  pL0 pR0 grey_border clearfix">
                     <li>
                        <p class="bkgLitBlu fW500 txtClrlitGry pD10 mB10">Select Sectors</p>
                     </li>
                     <li class="fL mR5 pL10 mT10">
                        <input class="" type="checkbox">
                        <label class="label"></label>
                     </li>
                     <li class="col_4_half pR10 pL10 mT5">
                        <span class="fW600  fS16">Mumbai <img src="${ezgImagesPath}/forward_aro.png" alt="forward"> Singapore </span>
                        <br>
                        <span class="fW500 ">Mon,26 </span><span class="fS12"> Dec |10:00- 12:00 | Air India A1 586</span>
                     </li>
                     <li class="fL mR5 mT10">
                        <input class="" type="checkbox">
                        <label class="label"></label>
                     </li>
                     <li class="col_4_half  pR10 pL10 mT5">
                        <span class="fW600  fS16">Singapore <img src="${ezgImagesPath}/forward_aro.png" alt="forward"> Mumbai </span>
                        <br>
                        <span class="fW500">Mon,26 </span><span class="fS12"> Dec |10:00- 12:00 | Air India A1 586</span>
                     </li>
                  </ul>
               </div>
               <div class="clearfix"></div>
               <div class="col_12 mT15 pL0 pR0">
                  <ul class="mB10 clearfix grey_border">
                     <li>
                        <p class="bkgLitBlu txtClrlitGry pD10 mB10">Select Number of Travelers</p>
                     </li>
                     <li class="col_2 pR10 mB10">
                        <label>Adult</label>
                        <div class="passengerNum3 fL clearfix"> <span class="control addMinControl minusControl" onclick="aCountDec('mwAdult')">-</span> <span class="control innerTxtControl" id="mwAdult">1</span> <span class="control addMinControl plusControl" onclick="aCountInc('mwAdult')">+</span> </div>
                        <br class="cB">
                        <input type="text" value="01" maxlength="3" class="w100pcnt aInput3 dN" style="display: none;">
                        <span class="fS11">12+ yrs</span> 
                     </li>
                     <li class="col_2 pR10 pL10 mB10">
                        <label>Children</label>
                        <div class="passengerNum3 fL clearfix"> <span class="control addMinControl minusControl" onclick="cCountDec('mwChild')">-</span> <span class="control innerTxtControl" id="mwChild">0</span> <span class="control addMinControl plusControl" onclick="cCountInc('mwChild')">+</span> </div>
                        <br class="cB">
                        <input type="text" value="00" maxlength="3" class="w100pcnt aInput3 dN" style="display: none;">
                        <span class="fS11">2 - 12 yrs</span> 
                     </li>
                     <li class="col_2 pR10 pL0 mB10 w15pcnt">
                        <label>Infant</label>
                        <div class="passengerNum3 fL clearfix"> <span class="control addMinControl minusControl" onclick="iCountDec('mwInfant')">-</span> <span class="control innerTxtControl" id="mwInfant">0</span> <span class="control addMinControl plusControl" onclick="iCountInc('mwInfant')">+</span> </div>
                        <br class="cB">
                        <input type="text" value="00" maxlength="3" class="w100pcnt aInput3 dN" style="display: none;">
                        <span class="fS11">0 - 2 yrs</span> 
                     </li>
                     <li class="col_3 pR0 pL0">
                        <label>Class</label>
                        <select>
                           <option value="Economy">Economy</option>
                           <option value="Business">Business</option>
                           <option value="First">First</option>
                           <option value="Premium economy">Premium economy</option>
                        </select>
                     </li>
                     <li class="col_3 pR0 mB10">
                        <label>Preferred airline</label>
                        <select>
                           <option value="Any" selected="">Any</option>
                           <option value="GoAir">GoAir</option>
                           <option value="JetAirways">JetAirways</option>
                           <option value="Spice Jet">Spice Jet</option>
                           <option value="IndiGo">IndiGo</option>
                           <option value="AirIndia">AirIndia</option>
                        </select>
                     </li>
                  </ul>
                  <div class="col_12 mT20 pL0 pR0">
                     <div class="fR ">
                        <span class="tertiaryBtn"><a href="javascript:void(0);"><span class="forwardAro mR10"></span>Back to Booking</a></span>
                        <span class="primaryBtn"><a href="javascript:void(0);">Check Availability</a></span>
                     </div>
                  </div>
               </div>
            </article>
            <article id="wayContr8" class="tabContainer clearfix dN" style="display: none;">
               <div class="col_12">
                  <table class="grey_border mT25 w100pcnt">
                     <tbody>
                        <tr>
                           <th class="bkgLitBlu txtClrlitGry pD10 mT10 mB10 tC">
                              <input name="All" class="checkAllCoverage5" type="checkbox"><label class="label"></label>
                           </th>
                           <th class="bkgLitBlu txtClrlitGry pD10 mT10 mB10 tL">Travelers </th>
                           <th class="bkgLitBlu txtClrlitGry pD10 mT10 mB10 tC">PNR </th>
                           <th class="bkgLitBlu txtClrlitGry pD10 mT10 mB10 tC">Insurance Policy </th>
                           <th class="bkgLitBlu txtClrlitGry pD10 mT10 mB10 tC">Fare </th>
                           <th class="bkgLitBlu txtClrlitGry pD10 mT10 mB10 tC">Status </th>
                        </tr>
                        <tr>
                           <td class="brdrBN tC">
                              <input class="chkCoverage5" type="checkbox">
                              <label class="label"></label>
                           </td>
                           <td class="brdrBN">Kanishka Chaudhary</td>
                           <td class="brdrBN tC">MNOP987</td>
                           <td class="brdrBN tC">STG 029 2300</td>
                           <td class="brdrBN tC"><span class="rupee">Rs</span> 9,500</td>
                           <td class="brdrBN tC">Confirmed</td>
                        </tr>
                        <tr>
                           <td class="brdrBN tC">
                              <input class="chkCoverage5" type="checkbox">
                              <label class="label"></label>
                           </td>
                           <td class="brdrBN ">Jayatri Dasgupta</td>
                           <td class="brdrBN tC">MNOP987</td>
                           <td class="brdrBN tC">STG 029 2300</td>
                           <td class="brdrBN tC"><span class="rupee">Rs</span> 9,500</td>
                           <td class="brdrBN tC">Confirmed</td>
                        </tr>
                        <tr>
                           <td class="brdrBN tC">
                              <input class="chkCoverage5" type="checkbox">
                              <label class="label"></label>
                           </td>
                           <td class="brdrBN ">Kavya Chaudhary</td>
                           <td class="brdrBN tC">MNOP987</td>
                           <td class="brdrBN tC">STG 029 2300</td>
                           <td class="brdrBN tC"><span class="rupee">Rs</span> 9,500</td>
                           <td class="brdrBN tC">Confirmed</td>
                        </tr>
                     </tbody>
                  </table>
                  <div class="grey_border pD10 mT30 w100pcnt">
                     <h5><img src="${ezgImagesPath}/common/man.png" alt="man" class="mR5">Adult 1 </h5>
                     <ul class="mB10 clearfix mT10">
                        <li class="col_3 pL0">
                           <label>Traveller Name</label>
                        </li>
                        <li class="col_2 pL0 pR10">
                           <select>
                              <option value="Title.">Title.</option>
                              <option value="Mr.">Mr.</option>
                              <option value="Ms.">Ms.</option>
                              <option value="Mrs.">Mrs.</option>
                           </select>
                        </li>
                        <li class="col_3 pL0 pR10">
                           <input value="" class="w100pcnt" placeholder="First Name" type="text">
                        </li>
                        <li class="col_3 pL0 pR0">
                           <input value="" class="w100pcnt" placeholder="Last Name" type="text">
                        </li>
                     </ul>
                     <p class=" mB10 mT10 fS12_sm clearfix"><a href="javascript:void(0);" class="moreplus1 fL mR10pcnt_sm"> - More (Frequent flyer, meal preference, seat preference, special request)</a></p>
                     <div class="moreplusOpt1 clearfix ">
                        <ul class="mB10 clearfix">
                           <li class="col_3 pL0">
                              <label class="mT10 fS12_sm">Frequent flyer</label>
                           </li>
                           <li class="fL pL0  w20pcnt w30pcnt_sm">
                              <select>
                                 <option>Select airline</option>
                              </select>
                           </li>
                           <li class="col_2_half col_3_sm pL10 pR0">
                              <input class="w100pcnt" placeholder=" Enter number" type="text">
                           </li>
                           <li class="col_2 ">
                              <span class="primaryBtn_sml "> <a href="javascript:void(0)" class="mT5">Add</a> </span> 
                           </li>
                        </ul>
                        <ul class="mB10 clearfix">
                           <li class="col_3 pL0">
                              <label class="mT10 fS12_sm">Meal preference</label>
                           </li>
                           <li class="col_5 col_7_sm  pL0 pR10">
                              <select>
                                 <option>Select meal</option>
                              </select>
                           </li>
                        </ul>
                        <ul class="mB10 clearfix">
                           <li class="col_3 pL0">
                              <label class="mT10 fS12_sm">Seat preference</label>
                           </li>
                           <li class="col_5 pR10 pL0 col_7_sm">
                              <select>
                                 <option>Select seat</option>
                              </select>
                           </li>
                        </ul>
                        <ul class="mT20 mB10 clearfix">
                           <li class="col_3 pL0">
                              <label class="fS12_sm">Special requests</label>
                           </li>
                           <li class="col_5 col_7_sm pL0 pR10">
                              <ul>
                                 <li><input type="checkbox"><label>Wheel Chair </label></li>
                                 <li><input type="checkbox"><label>Medical Assistance</label></li>
                                 <li><input type="checkbox"><label>Other</label></li>
                              </ul>
                              <textarea rows="4" class="w100pcnt mT10 dN"></textarea>
                           </li>
                        </ul>
                     </div>
                     <div class="mB10 mT10">
                        <ul class="mB10  clearfix  ">
                           <li class="col_3 pL0">
                              <label class="mT10 fS12_sm">Add baggage @</label>
                           </li>
                           <li class="col_5 pL0 pR10">
                              <select id="My_Select3" class="dN w100pcnt">
                                 <option>1 kg @ Rs 350</option>
                                 <option>2 kg @ Rs 750</option>
                              </select>
                              <input value="" id="text3" class="w100pcnt" type="text" placeholder="1 kg @ Rs 350" readonly="">
                           </li>
                           <li class="col_4 pL10 mT5  pR0">
                              <span class="fR fS16 mR15  dN"> <span class="rupee">Rs.</span> 350</span>
                              <span class="fL mR10" onclick="switchVisible3()"><span class="fL mR10"><i class="edit_icon"></i></span>
                              <a href="javascript:void(0);" class=""><i class="recycle_icon_wishlist mT5"></i></a>
                              </span>
                           </li>
                        </ul>
                        <ul class="mB10 clearfix ">
                           <li class="col_3 pL0">
                              <label class="mT10 fS12_sm">Add meals  @</label>
                           </li>
                           <li class="col_5 pL0 pR10">
                              <select>
                                 <option selected="">Select</option>
                                 <option>Rs 350/Vegetarian</option>
                              </select>
                           </li>
                           <li class="col_4  pL10 pR0">
                              <span class="fR fS16  dN"> <span class="rupee">Rs.</span> 350</span>
                           </li>
                        </ul>
                     </div>
                     <hr class="litGry mT10 mB10 clearfix">
                     <h5><img src="${ezgImagesPath}/common/child.png" alt="man" class="mR5">Child  1 </h5>
                     <ul class="mB10 clearfix mT30">
                        <li class="col_3 pL0">
                           <label>Traveller Name</label>
                        </li>
                        <li class="col_2 pL0 pR10">
                           <select>
                              <option value="Title.">Title.</option>
                              <option value="Mr.">Mr.</option>
                              <option value="Ms.">Ms.</option>
                              <option value="Mrs.">Mrs.</option>
                           </select>
                        </li>
                        <li class="col_3 pL0 pR10">
                           <input value="" class="w100pcnt" placeholder="First Name" type="text">
                        </li>
                        <li class="col_3 pL0 pR0">
                           <input value="" class="w100pcnt" placeholder="Last Name" type="text">
                        </li>
                     </ul>
                     <p class="mT10 mB20 fS12_sm"><a href="javascript:void(0);" class="morepluschild"> + More (Frequent flyer, meal preference, seat preference, special request</a></p>
                     <div class="morepluschildOpt clearfix dN mT10">
                        <ul class="mB10 clearfix">
                           <li class="col_3 pL10">
                              <label>Frequent flyer</label>
                           </li>
                           <li class="fL pL0 w20pcnt">
                              <select class="w100pcnt">
                                 <option>Select airline</option>
                              </select>
                           </li>
                           <li class="col_4 pL10">
                              <input class="w100pcnt" type="text" placeholder=" Enter number" readonly="">
                           </li>
                           <li class="col_2 pL0">
                              <span class="primaryBtn"> <a href="javascript:void(0)">Add</a> </span> 
                           </li>
                        </ul>
                        <ul class="mB10 clearfix">
                           <li class="col_3 pL10">
                              <label>Meal preference</label>
                           </li>
                           <li class="fL pL0 w20pcnt">
                              <select class="w100pcnt">
                                 <option>Select meal</option>
                              </select>
                           </li>
                        </ul>
                        <ul class="mB10 clearfix">
                           <li class="col_3 pL10">
                              <label>Seat preference</label>
                           </li>
                           <li class="fL pL0 w20pcnt">
                              <select class="w100pcnt">
                                 <option>Select seat</option>
                              </select>
                           </li>
                        </ul>
                        <ul class="mB10 clearfix">
                           <li class="col_3 pL10">
                              <label>Special requests</label>
                           </li>
                           <li class="col_9 pL0">
                              <textarea rows="4" class="w100pcnt"></textarea>
                           </li>
                        </ul>
                     </div>
                     <div class="mB10 mT30 ">
                        <ul class="mB10  clearfix  ">
                           <li class="col_3 pL0">
                              <label class="mT10 fS12_sm">Add baggage @</label>
                           </li>
                           <li class="col_5 pL0 pR10">
                              <select class=" w100pcnt ">
                                 <option selected="">Select</option>
                                 <option>1 kg @ Rs 350</option>
                              </select>
                           </li>
                           <li class="col_4 pL10 mT5  pR0">
                              <span class="fR fS16  dN"> <span class="rupee">Rs.</span> 350</span>
                           </li>
                        </ul>
                        <ul class="mB10 clearfix ">
                           <li class="col_3 pL0">
                              <label class="mT10 fS12_sm">Add meals  @</label>
                           </li>
                           <li class="col_5 pL0 pR10">
                              <select class="w100pcnt">
                                 <option selected="">Select</option>
                                 <option>Rs 350/Vegetarian</option>
                              </select>
                           </li>
                           <li class="col_4  pL10 pR0">
                              <span class="fR fS16  dN"> <span class="rupee">Rs.</span> 350</span>
                           </li>
                        </ul>
                     </div>
                  </div>
                  <div class="col_12 pL0 mT10 pR0 cB">
                     <p class="fR">Total<span class="fS21 fW600 mL10">Rs 800</span></p>
                  </div>
                  <div class="fR mT20 cB">
                     <span class="tertiaryBtn"><a href="javascript:void(0);"><span class="forwardAro mR10"></span>Back to Booking</a></span>
                     <span class="primaryBtn"><a href="javascript:void(0)">Proceed</a></span>
                  </div>
               </div>
               <div class="clearfix"></div>
            </article>
         </div>
      </section>
   </div>
</div>