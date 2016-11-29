<%@ page trimDirectiveWhitespaces="true" %>
<!--=== Top Deals start here ===-->
<div class="white_content popupplay" id="topDeals" style="top: 0px; height: 100%; padding-top: 20px; padding-bottom: 20px; display: none; overflow: auto;">
	<div class="white_content_inner clearfix w80pcnt" id="topDealsinner">
	<div class="popup_close_icon fR" onclick="popupclose('topDeals', 'fade')"></div>
	<div class="pD15 boxContr bkgLitBlu clearfix mT20"><h3 class="tC fW600">Flat <span class="txtClrOrng">10% Cashback</span> on Flights</h3></div>
	<div class="contentPanel grey_bg grey_border clearfix mB20">
		<ul class="flightWayTab mB20 clearfix">
			<li class="first" id="flight_hotel_way13"><a href="javascript:void(0);" onclick="flight_hotel_way10('flight_hotel_way13', 'flight_hotel_wayContr13'),reset()"><span class="oneway_icon" title="One way"></span></a></li>
			<li class="sel" id="flight_hotel_way14"><a href="javascript:void(0);" onclick="flight_hotel_way10('flight_hotel_way14', 'flight_hotel_wayContr14'),reset()"><span class="twoway_icon" title="Return"></span></a></li>
			<li class="last" id="flight_hotel_way15"><a href="javascript:void(0);" onclick="flight_hotel_way10('flight_hotel_way15', 'flight_hotel_wayContr15'),reset()"><span class="multiway_icon"  title="Multi city"></span></a></li>
		</ul>
		<div id="flight_hotel_wayContr13" class="dN">
			<ul class="mB10 clearfix">
				<li class="col_6 pR0 pL0">
					<div class="search-bar grey_border clearfix">
						<input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="owFlightFrom" />
						<input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/destination_from.png" />
					</div>
				</li>
				<li class="col_6 pR0">
					<div class="search-bar grey_border clearfix">
						<input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="owFlightTo" />
						<input type="image" class="toDestination" name="search" alt="Search" title="Search" src="images/destination_to.png" />
					</div>
				</li>
			</ul>
			<ul class="row mB10">
				<li class="col_3">
					<label>Departure</label>
					<input id="datepicker1" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly />
				</li>
				<li class="col_3">
					<label class="txtClrlitGry">Return</label>
					<input id="datepicker2" class="w100pcnt" type="text" placeholder="DD/MM/YYYY" disabled="disabled" />
				</li>
				<li class="col_2 pR10">
					<label>Adult</label>
					<div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="adultCountDec('owAdult')">-</span> <span class="control innerTxtControl" id="owAdult">1</span> <span class="control addMinControl plusControl" onclick="adultCountInc('owAdult')">+</span> </div>
					<input type="text" placeholder="01" maxlength="3" class="w86 aInput1 dN blink " />
					<span class="fS11 fL w100pcnt">12+ yrs</span> </li>
				<li class="col_2 pR10 pL10">
					<label>Children</label>
					<div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="childCountDec('owChild')">-</span> <span class="control innerTxtControl" id="owChild">0</span> <span class="control addMinControl plusControl" onclick="childCountInc('owChild')">+</span> </div>
					<input type="text" placeholder="00" maxlength="3" class="w86 aInput1 dN  blink" />
					<span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li>
				<li class="col_2 pR10 pL0">
					<label>Infant</label>
					<div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="childCountDec('owInfant')">-</span> <span class="control innerTxtControl" id="owInfant">0</span> <span class="control addMinControl plusControl" onclick="childCountInc('owInfant')">+</span> </div>
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
		</div>
		<div id="flight_hotel_wayContr14">
			<ul class="mB10 clearfix">
				<li class="col_6 pR0 pL0">
					<div class="search-bar grey_border clearfix">
						<input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="twflightFrom" />
						<input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/destination_from.png" />
					</div>
				</li>
				<li class="col_6 pR0">
					<div class="search-bar grey_border clearfix">
						<input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="twflightTo" />
						<input type="image" class="toDestination" name="search" alt="Search" title="Search" src="images/destination_to.png" />
					</div>
				</li>
			</ul>
			<ul class="row mB10">
				<li class="col_3">
					<label>Departure</label>
					<input id="datepicker3" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly />
				</li>
				<li class="col_3">
					<label>Return</label>
					<input id="datepicker4" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly />
				</li>
				<li class="col_2 pR10">
					<label>Adult</label>
					<div class="passengerNum2 fL"> <span class="control addMinControl minusControl" onclick="adultCountDec('twAdult')">-</span> <span class="control innerTxtControl" id="twAdult">1</span> <span class="control addMinControl plusControl" onclick="adultCountInc('twAdult')">+</span> </div>
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
		</div>
		<div id="flight_hotel_wayContr15" class="clearfix dN">
			<div id="flightsContainer">
				<ul class="mB10 clearfix">
					<li class="col_8 pR0 pL0">
						<label>Flight 1:</label>
						<div class="search-bar grey_border fL mR20 w47pcnt">
							<input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="mwFlight1From" />
							<input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/destination_from.png" />
						</div>
						<div class="search-bar grey_border fL w47pcnt">
							<input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="mwFlight1To" />
							<input type="image" class="toDestination" name="search" alt="Search" title="Search" src="images/destination_to.png" />
						</div>
					</li>
					<li class="col_3">
						<label>Departure</label>
						<input id="datepicker5" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly />
					</li>
				</ul>
				<ul class="mB10 clearfix">
					<li class="col_8 pR0 pL0">
						<label>Flight 2:</label>
						<div class="search-bar grey_border fL mR20 w47pcnt">
							<input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="mwFlight2From" />
							<input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/destination_from.png" />
						</div>
						<div class="search-bar grey_border fL w47pcnt">
							<input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="mwFlight2To" />
							<input type="image" class="toDestination" name="search" alt="Search" title="Search" src="images/destination_to.png" />
						</div>
					</li>
					<li class="col_3">
						<label>Departure</label>
						<input id="datepicker6" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly />
					</li>
				</ul>
			</div>
			<div class="col_12 clearfix mB10 pR0">
				<div class="fR mT10"><a href="javascript:void(0);"><span class="add_details_icon mR5 fL" onClick="showMultiwayOptions();"></span><span class="posR fL" onClick="showMultiwayOptions();">Add city</span></a></div>
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
		</div>
		<div class="clearfix"></div>
		<div id="searchBtn" class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);" id="srcBtn" onclick="redirectSearch()">Search using this offer</a></div>
	</div>
	<div class="grey_bg grey_border clearfix mT20"><span class="mL10 fW600">ELIGIBILITY OF THE OFFER :</span></div>
		<ul class="grey_border pD10 greyList clearfix">
			<li class="mL10">Flat 60% instant discount on total booking amount up to maximum of Rs. 3000 on hotels in India in a single transaction.</li>
			<li class="mL10">This offer is valid for booking between 27th October and 15th November 2015.</li>
			<li class="mL10">There is no restriction on travel date.</li>
			<li class="mL10">Offer is valid for bookings made using your Master / Visa Credit & Debit Cards or Net Banking only. Payments made through Standard Chartered, HSBC & Citi Credit/Debit card, Oxicash / Paymate or Cash on Delivery options are not eligible under the offer.</li>
			<li class="mL10">Refer Terms & Conditions</li>
			<li class="mL10">To avail the offer enter and validate your promo code 'HOTELS60' on the payment page</li>
		</ul>
	</div>
</div>