<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<div class="container tabContent clearfix NavNewTab4" style="display:none;">
		<div class="globalSearchBG clearfix">
        <div class="clearfix" id="mainSearchWizard">
          <form method="post" action="/">
            <ul class="searchFlightWay clearfix">
				  <li class="pL0 col_12 col_sm_12">
					<label>What type of traveller are you?</label>
					 <ul class="col_4">
					  <li class="clearfix mB5">
						<input type="checkbox"/>
						<label>Family with children</label>
					  </li>
					  <li class="clearfix mB5">
						<input type="checkbox"/>
						<label>Family with teens</label>
					  </li>
					  <li class="clearfix mB5">
						<input type="checkbox"/>
						<label>Large family</label>
					  </li>
					</ul>
					 <ul class="col_4">
					  <li class="col_12 clearfix mB5">
						<input type="checkbox"/>
						<label>Shopper</label>
					  </li>
					  <li class="col_12 clearfix mB5">
						<input type="checkbox"/>
						<label>Honeymooner</label>
					  </li>
					  <li class="col_12 clearfix mB5">
						<input type="checkbox"/>
						<label>First time abroad</label>
					  </li>
					</ul>
					 <ul class="col_4">
					  <li class="clearfix mB5">
						<input type="checkbox"/>
						<label>Budget traveller</label>
					  </li>
					  <li class="clearfix mB5">
						<input type="checkbox"/>
						<label>Adventure traveller</label>
					  </li>
					  <li class="clearfix mB5">
						<input type="checkbox"/>
						<label>Luxury traveller</label>
					  </li>
					</ul>
				  </li>		
              
            </ul>
			<ul class="clearfix">
			<li class="col_7 pL0">
               <label>Destination :</label>
                <input type="text" id="autosuggest1" placeholder="Destination" style="width: 88%;"/>
              </li>
			  <li class="col_3 pL0" style="margin-left: 82px;">
                  <label style="margin-left: 11px;">Departure month :</label>
                  <select class="w80pcnt" style="margin-left: 11px;">
                    <option>Select</option>
                   <option>January 2015</option>
					<option>February 2015</option>
					<option>March 2015</option></select>
                  </select>
                </li>
			  </ul>
              <br class="cB" />
            
            <div id="globalSrcToggle">
			<div class="    clearfix">  
				  <div id="cabin1">
                <ul class="row mB10 mT10 clearfix">
                  <li id="singleCabins" class="col_1 col_sm_2">
                    <label>Cabins</label>
                    <select id="noOfCabins" onChange="showCabins(), showToggler()">
                      <option value="1">1</option>
                      <option value="2">2</option>
                      <option value="3">3</option>
                    </select>
                  </li>
                  <li id="groupBookingRooms" class="col_1 col_sm_2 dN">
                    <label>Cabins</label>
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
                  <li class="col_1_half col_sm_2 pR0 singleRoom"> <span class="mT30 fL">Cabin 1:</span> </li>
                  <li class="col_1_half col_sm_2 pL0 singleRoom">
                    <label>Adult</label>
                    <div class="adderOuter"> <span  onClick="adultCountDec('hAdult_1',1)" class="control addMinControl minusControl cursor fW600">-</span> <span id="hAdult_1" class="control innerTxtControl">1</span> <span onClick="adultCountInc('hAdult_1',1)" class="control addMinControl plusControl cursor fW600">+</span> </div>
                    <input type="text" placeholder="1" maxlength="3" class="w100pcnt dN" />
                    <span class="fS11 fL w100pcnt">12+ yrs</span> </li>
                 <li class="col_2 singleRoom pL0">
                    <label>Children</label>
                    <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600"  onClick="childCountDec('hChild_1',1),remChild(1), showToggler();">-</span> <span class="control innerTxtControl" id="hChild_1">0</span> <span class="control addMinControl plusControl cursor fW600" onClick="childCountInc('hChild_1',1),addChild(1), showToggler()">+</span> </div>
                    <input type="text" placeholder="0"  maxlength="3" class="w100pcnt dN"/>
                    <span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li>
				   <!--<li class="number">
					<label>Infant</label>
					<div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onClick="infantCountDec('hInfant_1',1),remInfant(1), showToggler();">-</span> <span class="control innerTxtControl" id="hInfant_1">0</span> <span class="control addMinControl plusControl cursor fW600" onClick="infantCountInc('hInfant_1',1),addInfant(1), showToggler()">+</span> </div>
					<input type="text" placeholder="0"  maxlength="3" class="w100pcnt dN"/>
					<span class="fS11 fL">0-2 yrs</span> 
				  </li>-->
                 </ul>
			  <!--<ul class="col_6 pR0 pL0"></ul>
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
                </ul>-->
              </div>
              <div id="cabin2" class="singleRoom"></div>
              <div id="cabin3" class="singleRoom"></div>
			  </div>
				<div class="cB"></div>
              <div class="flightOption  w100pcnt">
                <p class="multipleOption mB10">
				<a href="javascript:void(0)" id="moreCruiseOpton1" onClick="showMoreInfoCruise('moreCruiseOpton1','cruiseOptionsSearchPanel','plusMinusCruise1');">
				<span id="plusMinusCruise1">+</span> Cruise options </a>(Budget,Star rating, Cruise liner, Cruise length )</p>
                <div class="dN" id="cruiseOptionsSearchPanel">
                  <ul class="col_12 clearfix mT10">
                    
					<li class="col_2 pL0  fligtOpt">
                      <label>Budget (per person)</label>
                      <div class="fL mR10">
                        <div id="slider-range-budget3"></div>
                        <input type="text" id="amountBudget3" readonly="readonly" class="rangeTxt inputBGNone" />
                      </div>
                    </li>
					<li class="col_3 pL0 fligtOpt">
                      <label>Star rating</label>
                      <ul>
                        <li class="fL mR5 mB5 stackChkBox">
                          <input type="checkbox" name="check" id="fivestar_1" checked="checked" />
                          <label for="fivestar_1">5</label>
                        </li>
                        <li class="fL mR5 mB5 stackChkBox">
                          <input type="checkbox" name="check" id="fourstar_1" />
                          <label for="fourstar_1">4</label>
                        </li>
                        <li class="fL mR5 mB5 stackChkBox">
                          <input type="checkbox" name="check" id="threestar_1" />
                          <label for="threestar_1">3</label>
                        </li>
                        <li class="fL mR5 mB5 stackChkBox">
                          <input type="checkbox" name="check" id="twostar_1" />
                          <label for="twostar_1">2</label>
                        </li>
                        <li class="fL stackChkBox">
                          <input type="checkbox" name="check" id="onestar_1" />
                          <label for="onestar_1"><span class="trvGrp">1</span></label>
                        </li>
                      </ul>
                    </li>
                    <li class="col_3  pL0 fligtOpt">
                      <label>Cruise liner</label>
                      <select class="w100pcnt">
                        <option value="All">All</option>
                        <option value="star cruises">Star cruises</option>
                      </select>
                    </li>
                    
                    <li class="col_3 fligtOpt  pR0">
                      <label>Cruise length</label>
                      <select class="w100pcnt">
                        <option value="All length">All length</option>
                       <option>1 - 2 Nights</option>
						<option>3 - 5 Nights</option>
						<option>6 - 9 Nights</option>
                      </select>
                    </li>
                  </ul>
                </div>
              </div>
			  
              <br class="cB" />
              <a href="flight_srp_oneway.html" class=" button button-primary fR">Search</a> </div>
          </form>
        </div>
        <div class="globalSrcExpContr dN"> <a href="javascript:void(0);"><span class="globalSrcShow sel">Hide</span></a> </div>
      </div>
	</div>
	