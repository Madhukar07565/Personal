<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="cB mT10"></div>
<ul class="flightWayTab mB20 clearfix">
	<li class="first" id="way1"><a href="javascript:void(0);" onclick="way('way1', 'wayContr1'),reset()"><span class="oneway_icon" title="One way"></span></a></li>
	<li class="sel" id="way2"><a href="javascript:void(0);" onclick="way('way2', 'wayContr2'),reset()"><span class="twoway_icon" title="Return"></span></a></li>
	<li class="last" id="way3"><a href="javascript:void(0);" onclick="way('way3', 'wayContr3'),reset()"><span class="multiway_icon"  title="Multi city"></span></a></li>
</ul>
<div id="wayContr1" class="dN">
	<ul class="mB10 clearfix">
		<li class="col_5 pR0 pL0">
			<div class="search-bar grey_border w100pcnt_sm clearfix" style="width:92%">
				<input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="owFlightFrom" />
				<input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/destination_from.png" />
			</div>
		</li>
		<li class="col_6 pR0">
			<div class="search-bar grey_border clearfix w100pcnt_sm " style="width:68%" >
				<input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="owFlightTo" />
				<input type="image" class="toDestination" name="search" alt="Search" title="Search" src="images/destination_to.png" />
			</div>
		</li>
	</ul>
	<ul class="row mB10 clearfix">
		<li class="col_2_half col_3_sm">
			<label>Departure</label>
			<input id="datepicker13" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly />
		</li>
		<li class="col_2_half col_3_sm">
			<label class="txtClrlitGry">Return</label>
			<input id="datepicker14" class="w100pcnt" type="text" placeholder="DD/MM/YYYY" disabled="disabled" />
		</li>
		<li class="col_1_half col_2_sm pR10">
				  <label>Adult</label>
				  <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="adultCountDec('owAdult')">-</span> <span class="control innerTxtControl" id="owAdult">1</span> <span class="control addMinControl plusControl" onclick="adultCountInc('owAdult')">+</span> </div>
				  <input type="text" placeholder="01" maxlength="3" class="w86 aInput1 dN blink " />
				  <span class="fS11 fL w100pcnt">12+ yrs</span>
		</li>
		<li class="col_1_half col_2_sm pR10 pL10">
				  <label>Children</label>
				  <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec('owChild')">-</span> <span class="control innerTxtControl" id="owChild">0</span> <span class="control addMinControl plusControl" onclick="cCountInc('owChild')">+</span> </div>
				  <input type="text" placeholder="00" maxlength="3" class="w86 aInput1 dN  blink" />
				  <span class="fS11 fL w100pcnt">2 - 12 yrs</span>
		</li>
		<li class="col_1_half col_2_sm pR10 pL0">
				  <label>Infant</label>
				  <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec('owInfant')">-</span> <span class="control innerTxtControl" id="owInfant">0</span> <span class="control addMinControl plusControl" onclick="cCountInc('owInfant')">+</span> </div>
				  <input type="text" placeholder="00" maxlength="3" class="w86 aInput1 dN blink" />
				  <span class="fS11 fL w100pcnt">0 - 2 yrs</span>
		</li>
	</ul>
	<ul class="row mB10 clearfix">
		<li class="col_2_half col_3_sm pR0">
			<label>Class</label>
			<select>
				<option value="Economy">Economy</option>
				<option value="Business">Business</option>
				<option value="First">First</option>
				<option value="Premium economy">Premium economy</option>
			</select>
		</li>
		<li class="col_2_half col_3_sm">
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
	<div class="mT20" onclick="chkGroupDetails(1)">
		<input type="checkbox" id="GroupBooking1" />
		<label for="GroupBooking1" class="w50pcnt">Group booking request (9+Pax)</label>
	</div>
	<div id="gBookingContr1" class="dN">
		<textarea maxlength="100" id="noteContent4" class="w100pcnt mB5" placeholder="Add note (Max. 100 characters)"></textarea>
		<span class="fR fS12 dN" id="charText4"><span id="charCount4">100</span> characters left</span><br>
		<p class="fS12 mB15">Note: We do not accept group enquiries on Sundays, Holidays and Saturdays after 1300 hrs IST</p>
	</div>
</div>
<div id="wayContr2">
	<ul class="mB10 clearfix">
		<li class="col_5 pR0 pL0">
			<div class="search-bar grey_border w100pcnt_sm clearfix" style="width:92%">
				<input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="twflightFrom" />
				<input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/destination_from.png" />
			</div>
		</li>
		<li class="col_6 pR0">
			<div class="search-bar grey_border w100pcnt_sm clearfix"  style="width:68%" >
				<input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="twflightTo" />
				<input type="image" class="toDestination" name="search" alt="Search" title="Search" src="images/destination_to.png" />
			</div>
		</li>
	</ul>
	<ul class="row mB10 clearfix">
		<li class="col_2_half col_3_sm">
			<label>Departure</label>
			<input id="datepicker15" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly />
		</li>
		<li class="col_2_half col_3_sm">
			<label>Return</label>
			<input id="datepicker16" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly />
		</li>
		<li class="col_1_half col_2_sm pR10">
			<label>Adult</label>
			<div class="passengerNum2 fL"> <span class="control addMinControl minusControl" onclick="adultCountDec('twAdult')">-</span> <span class="control innerTxtControl" id="twAdult">1</span> <span class="control addMinControl plusControl" onclick="adultCountInc('twAdult')">+</span> </div>
			<input type="text" placeholder="01" maxlength="3" class="w86 aInput2 blink dN  "/>
			<span class="fS11 fL w100pcnt">12+ yrs</span>
		</li>
		<li class="col_1_half col_2_sm pR10 pL10">
			<label>Children</label>
			<div class="passengerNum2 fL"> <span class="control addMinControl minusControl" onclick="cCountDec('twChild')">-</span> <span class="control innerTxtControl" id="twChild">0</span> <span class="control addMinControl plusControl" onclick="cCountInc('twChild')">+</span> </div>
			<input type="text" placeholder="00" maxlength="3" class="w86 aInput2 dN blink "/>
			<span class="fS11 fL w100pcnt">2 - 12 yrs</span>
		</li>
		<li class="col_1_half col_2_sm pR10 pL0">
			<label>Infant</label>
			<div class="passengerNum2 fL"> <span class="control addMinControl minusControl" onclick="cCountDec('twInfant')">-</span> <span class="control innerTxtControl" id="twInfant">0</span> <span class="control addMinControl plusControl" onclick="cCountInc('twInfant')">+</span> </div>
			<input type="text" placeholder="00" maxlength="3" class="w86 aInput2 dN blink "/>
			<span class="fS11 fL w100pcnt">0 - 2 yrs</span>
		</li>
	</ul>
	<ul class="row mB10 clearfix">
		<li class="col_2_half col_3_sm pR0">
			<label>Class</label>
			<select>
				<option value="Economy">Economy</option>
				<option value="Business">Business</option>
				<option value="First">First</option>
				<option value="Premium economy">Premium economy</option>
			</select>
		</li>
		<li class="col_2_half col_3_sm">
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
	<div class="mT20" onclick="chkGroupDetails(2)">
		<input type="checkbox" id="GroupBooking2" />
		<label for="GroupBooking2" class="w50pcnt">Group booking request (9+Pax)</label>
	</div>
	<div id="gBookingContr2" class="dN">
		<textarea maxlength="100" id="noteContent1" class="w100pcnt mB5" placeholder="Add note (Max. 100 characters)"></textarea>
		<span class="fR fS12 dN" id="charText1"><span id="charCount1">100</span> characters left</span><br>
		<p class="fS12 mB15">Note: We do not accept group enquiries on Sundays, Holidays and Saturdays after 1300 hrs IST</p>
	</div>
</div>
<div id="wayContr3" class="clearfix dN">
	<div id="flightsContainer">
		<!-- The user should be allowed to add maximum 6 rows. (TRAV-2) -->
		<c:forEach var="index" begin="1" end="6">
			<c:choose>
				<c:when test="${index > 2}">
					<ul id="citySection${index}" class="mB10 clearfix dN">
				</c:when>
				<c:otherwise>
					<ul id="citySection${index}" class="mB10 clearfix">
				</c:otherwise>
			</c:choose>
						<li class="col_8 pR0 pL0">
							<label>Flight ${index}:</label>
							<div class="search-bar grey_border fL mR20 w47pcnt">
								<input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="mwFlight${index}From" />
								<input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/destination_from.png" />
							</div>
							<div class="search-bar grey_border fL w47pcnt">
								<input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="mwFlight${index}To" />
								<input type="image" class="toDestination" name="search" alt="Search" title="Search" src="images/destination_to.png" />
							</div>
						</li>
						<li class="col_3">
							<label>Departure</label>
							<input id="datepicker5" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly />
						</li>
					</ul>
		</c:forEach>
	</div>
	<div id="addCitySection" class="col_12 clearfix mB10 pR0">
		<div class="fR mT10 mR48"><a href="javascript:void(0);"><span class="add_details_icon mR5 fL" onClick="addCity(6);"></span><span class="posR fL" onClick="addCity(6);">Add city</span></a></div>
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
		<li class="col_1_half col_2_sm pR10 mR5">
			<label>Adult</label>
			<div class="passengerNum3 fL"> <span class="control addMinControl minusControl" onclick="aCountDec('mwAdult')">-</span> <span class="control innerTxtControl" id="mwAdult">1</span> <span class="control addMinControl plusControl" onclick="aCountInc('mwAdult')">+</span> </div>
			<input type="text" placeholder="01" maxlength="3" class="w86 aInput3 dN blink" />
			<span class="fS11 fL w100pcnt">12+ yrs</span>
		</li>
		<li class="col_1_half col_2_sm pR10 pL10 mR5">
			<label>Children</label>
			<div class="passengerNum3 fL"> <span class="control addMinControl minusControl" onclick="cCountDec('mwChild')">-</span> <span class="control innerTxtControl" id="mwChild">0</span> <span class="control addMinControl plusControl" onclick="cCountInc('mwChild')">+</span> </div>
			<input type="text" placeholder="00" maxlength="3" class="w86 aInput3 dN blink" />
			<span class="fS11 fL w100pcnt">2 - 12 yrs</span>
		</li>
		<li class="pL0 pR0 col_1_half col_2_sm">
			<label>Infant</label>
			<div class="passengerNum3 fL"> <span class="control addMinControl minusControl" onclick="cCountDec('mwInfant')">-</span> <span class="control innerTxtControl" id="mwInfant">0</span> <span class="control addMinControl plusControl" onclick="cCountInc('mwInfant')">+</span> </div>
			<input type="text" placeholder="00" maxlength="3" class="w86 aInput3 dN blink" />
			<span class="fS11 fL w100pcnt">0 - 2 yrs</span>
		</li>
	</ul>
	<div class="cB"></div>
	<div class="mT20" onclick="chkGroupDetails(3)">
		<input type="checkbox" id="GroupBooking3" />
		<label for="GroupBooking3" class=" w50pcnt">Group booking request (9+Pax)</label>
	</div>
	<div id="gBookingContr3" class="dN">
		<textarea maxlength="100" id="noteContent2" class="w100pcnt mB5" placeholder="Add note (Max. 100 characters)"></textarea>
		<span class="fR fS12 dN" id="charText2"><span id="charCount2">100</span> characters left</span><br>
		<p class="fS12 mB15">Note: We do not accept group enquiries on Sundays, Holidays and Saturdays after 1300 hrs IST</p>
	</div>
</div>
<div class="cB"></div>
<div id="searchBtn" class="primaryBtn fR mT15 mB15 mR30"><a href="javascript:void(0);" id="srcBtn" onclick="redirectSearch()">Search</a></div>
<div id="sendReq" class="primaryBtn fR mT15 mB15  mR30 dN"><a href="javascript:void(0);" id="sendReqBtn">Send Request</a></div>