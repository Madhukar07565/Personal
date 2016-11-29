<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<div class="container tabContent clearfix NavNewTab2" style="display:none;">
		<div class="globalSearchBG clearfix">
        <div class="clearfix" id="mainSearchWizard">
          <form method="post" action="/">
		  <p class="clearfix" />
            <ul class="col_12  clearfix">
              <li class="col_7 pL0 clearfix">
				<label>Pickup location</label>
                <input type="text" id="searchCar"  class=" w100pcnt" placeholder="Enter Pickup location" />
              </li>
              <li class="col_5 pR0">
				<label>Pick up date &amp; time</label>
				<input type="text" id="departureDate"  class="dateField fL mR10" placeholder="dd/mm/yyyy" readonly="readonly" />
				<select><option>Time</option></select>
              </li>
            </ul>
			  <!-- Hidden multiway panels -->
            
            <div id="globalSrcToggle">
				<ul class="col_12 clearfix pL0">
				<li class="col_12 pL0">
					<span class="w40pcnt input_fields_wrap"></span>
				</li>
				</ul>
				<ul class="col_12 clearfix">
					<li class="col_7 pL0">
						<label>DropOff at</label>
							<input type="text" id="autosuggest2"  class="w100pcnt" placeholder="Enter DropOff location" />
								<span class="fL mT20 clearfix"><a href="javascript:void(0);" class="add_field_button" style="color:#333;"><span class="addIcon fL mR5"></span><span class="posR" style="vertical-align: -moz-middle-with-baseline;">Add Location</span></a></span>
					</li>
					<li class="col_5 pR0" style="float: right;">
						<label>Drop Off date &amp; time</label>
							<input type="text" id="returnDate"  class="dateField fL mR10" placeholder="dd/mm/yyyy" readonly="readonly" />
								<select><option>Time</option></select>
					</li>
				</ul>
				 <div class="clearfix pL20 mT20">
					 <input type="checkbox"  id="addCar"  onClick="addCarFlight('car'), showToggler()" />
					 <label for="addCar">Add A Return Transfer</label>
				 </div>
				 <div id="carSearchPanel" class="clearfix dN">
					<p class="col_12 mB10 mT10"><span style="font-weight:600;">Houghton Street, London</span> to <span style="font-weight:600;">Heathrow Airport, London</span></p>
					<ul class="col_12 mB10 mT10 pR0 clearfix">
						<li class="col_5 pL0 pR0 clearfix">
							<label>Pick Up Date &amp; Time</label>
								<input id="datepicker9" class=" dateField fL mR10 w50pcnt" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
								<select style="width: 42%;">
									<option value="08:00">08:00</option>
								</select>
						</li>
						<li class="col_5 pL0 pR0 clearfix">
							<label>Drop Off Date &amp; Time</label>
							<input id="datepicker14" class="fL dateField mR10 w50pcnt" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
							<select style="width: 42%;">
								<option value="08:00">08:00</option>
							</select>
						</li>
					</ul>
				 </div>
				<br class="cB" />
				<a href="#" class=" button button-primary fR">Search</a>
			  
				<a href="javascript:void(0);" id="newsearch" class="dN button button-primary fR mR15" style="display:none;">Search package</a> 
			</div>
          </form>
        </div>
		 <div class="globalSrcExpContr dN"> <a href="javascript:void(0);"><span class="globalSrcShow sel">Hide</span></a> </div>
      </div>
	</div>
	