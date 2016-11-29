<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="white_content popupplay" id="SendReq" style="top:0%; height:100%; padding-top:20px; padding-bottom:20px;">
  <div class="white_content_inner w70pcnt w90pcnt_sm" id="SendReqinner">
    <span class="popup_close_icon fR" onclick="popupclose('SendReq', 'fade')"></span>
    <span class="pD10">Review your group booking request</span>
	
	<div class="clearfix">
	<div class="cB mT10 grey_border pD15">
		<span class="recyclebin_icon fR mL10"></span>
		<span class="edit_sml_icon fR"></span>
		<p class="fL fW600">Mumbai (BOM)<span class="twoway_icon valign"></span>Singapore (SIN)</p>
		<p class="cB clearfix">12 Adults, 4 Children on 12th December 2014<br/>
		<span class="txtClrOrng">Note:</span> Need wheel chair for 2 senior citizens
		</p>
	</div>
		<div class="cB mT10 grey_border pD15 dN" id="newitemgrp">
		<span class="recyclebin_icon fR mL10"></span>
		<span class="edit_sml_icon fR"></span>
		<p class="fL fW600">Hotel Dwarka, Delhi, India</p>
		<p class="cB clearfix">2 Rooms, 2 Nights, 12-14 December 2014<br/>
		</p>
	</div>
	<p class="mT20 mB20 tC brdrDLitGry pD15" id="AddPrdct"><a href="javascript:void(0)" >+ Add another product</a></p>
	<div class="col_12 col_12_sm mT30 dN" id="AddPrdctCntnt">
			 <div class="customize_holiday clearfix">
             <ul>
              <li id="chTab1"><a href="javascript:void(0)" onclick="chSrc('chTab1', 'chContr1')"><span class="flight"></span><span class="mT10 fS18">Flight</span></a></li>
              <li id="chTab2" class="sel"><a href="javascript:void(0)" onclick="chSrc('chTab2', 'chContr2')"><span class="hotel"></span><span class="mT10 fS18">Hotel</span></a></li>
              <li id="chTab3"><a href="javascript:void(0)" onclick="chSrc('chTab3', 'chContr3')"><span class="activity"></span><span class="mT10 fS18">Activity</span></a></li>
              <li id="chTab4"><a href="javascript:void(0)" onclick="chSrc('chTab4', 'chContr4')"><span class="car"></span><span class="mT10 fS18">Car</span></a></li>
              <li id="chTab5"><a href="javascript:void(0)" onclick="chSrc('chTab5', 'chContr5')"><span class="bus"></span><span class="mT10 fS18">Bus</span></a></li>
            </ul>
          </div>
          <div class="customize_search clearfix" id="chContr1" style="display:none;"></div>
          <div class="customize_search clearfix" id="chContr2" >
			<div class="brdrTrns mT10">
					 <ul class="row mB10 clearfix">
              <li class="col_6 pR0">
                <label>Destination</label>
                <div class="search-bar grey_border clearfix">
                  <input type="text" class="sfield city w95pcnt" name="searchterm" placeholder="Enter city" data-co-field="hotelLocation" />
                  <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="${cnkImagesPath}/destination_from.png" />
                </div>
              </li>
              <li class="col_6">
                <label>Hotel Name (optional)</label>
                <div class="clearfix">
                  <input type="text"   class="w100pcnt" name="searchterm" title="Search" placeholder="Eg. Hilton" />
                </div>
              </li>
            </ul>
            <ul class="row mB10 clearfix">
              <li class="col_3 pR0">
                <label>Check-in</label>
                <input id="datepicker54" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
              </li>
              <li class="col_3 pR0">
                <label>Check-out</label>
                <input id="datepicker55" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
              </li>
              <li class="col_2">
                <label>Night(s)</label>
                <input type="text" class="w100pcnt" />
                </li>
            </ul>
              <div id="popuproom1" class="clearfix">
					  <ul class="row mB10 mT15 clearfix">
						<li class="col_2 col_6_sm">
						  <label>Rooms</label>
						  <input type="text" value="1" maxlength="3" class="w100pcnt"  id="roomcount1" onchange="roomlist()" />
						</li>
						<li class="col_1_half pR0 singleRoom"> <span class="mT30 fL">Room 1:</span> </li>
						<li class="col_2 pL0 singleRoom">
						  <label>Adult</label>
						  <input type="text" value="1" maxlength="3" class="w100pcnt" />
						  <span class="fS11 fL">12+ yrs</span> </li>
						<li class="col_2  singleRoom">
						  <label>Children</label>
						  <input type="text" value="0"  maxlength="3" class="w100pcnt" id="childCount1" />
						  <span class="fS11 fL">2 - 12 yrs</span> </li>
					  <li class="col_4 mB10 singleRoom">
						<div class="clearfix"></div>
						<ul id="childage1">
							
						</ul>
					  </li>
				  </ul>
				  </div>
				  <div id="newroom" class="singleRoom"></div>
            <span class="mT15 clearfix mB15" id="hotelOpt1"> <a href="javascript:void(0);"><img src="${cnkImagesPath}/collapse_blu.png" alt="Arrow" class="mR5 fL mT5"  />Hotel options</a> (Star rating, Property type) </span>
            <ul id="hotelContr1" class="dN mT10 clearfix">
              <li class="col_4">
                <label>Star rating</label>
                <div class="fL mR10">
                  <input type="checkbox" name="check"  />
                  <label><span class="trvGrp">1</span></label>
                </div>
                <div class="fL  mR10">
                  <input type="checkbox" name="check"  />
                  <label><span class="trvGrp">2</span></label>
                </div>
                <div class="fL mR10">
                  <input type="checkbox" name="check"  />
                  <label ><span class="trvGrp">3</span></label>
                </div>
                <div class="fL mR10">
                  <input type="checkbox" name="check"  />
                  <label ><span class="trvGrp">4</span></label>
                </div>
                <div class="fL">
                  <input type="checkbox" name="check"  />
                  <label ><span class="trvGrp">5</span></label>
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
								
							</dd>
						</dl>
					</div>
              </li>
            </ul>
				  <p class="clearfix">
					  <span class="fR primaryBtn"><a href="javascript:void(0);" id="additemgrp">Add</a></span>
					   <span class="fR tertiaryBtn mR10"><a href="#">Cancel</a></span>	
				   </p>
				</div>
            <div class="cB"></div>
          </div>
          <div class="customize_search clearfix" id="chContr3" style="display:none"></div>
          <div class="customize_search clearfix" id="chContr4" style="display:none"></div>
          <div class="customize_search clearfix" id="chContr5" style="display:none"></div>
          <div class="customize_search clearfix" id="chContr6" style="display:none"></div>
          <div class="customize_search clearfix" id="chContr7" style="display:none"></div>
		</div>
	<ul class="clearfix grey_bg pD10 mT20">
		<li class="col_4 col_6_sm mT10 valign">
			<label>Follow up reminder</label>
		</li>
		<li class="col_8 col_6_sm">
			<input id="datepicker44" class="mR10 dateField" type="text" value="DD/MM/YYYY" readonly="readonly" />
			<input type="text" class="w100 mR10 mT10" value="05:30"/>
			<select class="w100 valign">
				<option value="AM">AM </option>
				<option value="PM">PM </option>
			</select>
		</li>
	</ul>
	<textarea rows="8" class="w100pcnt mT20" placeholder="Enter comments or special requests here"></textarea>
	
	<p class="mT10 clearfix">
		<span class="primaryBtn fR clearfix"><a href="javascript:void(0);" onclick="popupclose('SendReq', 'fade'),popupwin('success', 'successinner','fade')">Send</a></span>
		<span class="tertiaryBtn fR mR10"><a href="javascript:void(0);">Cancel</a></span>
	</p>
	
		<div class="cB"></div>
  </div>
  </div>
</div>
