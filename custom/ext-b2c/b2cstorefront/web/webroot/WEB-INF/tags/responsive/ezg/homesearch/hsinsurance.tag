<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<div class="container tabContent clearfix NavNewTab7" style="display:none;">
		<div class="globalSearchBG clearfix">
        <div class="clearfix" id="mainSearchWizard">
          <form method="post" action="/">
            <ul class="col_12 clearfix">
				<li class="col_4  col_sm_6 clearfix" id="hotelDestination">
					<label>Where do you want to go?</label>
					<input type="text" id="destinationHotelSearch"  class="w100pcnt" placeholder="Destination"/>
				 </li>
				 <li class="col_4 col_sm_6  clearfix">
                    <label>Insurance Type</label>
					<select class="w100pcnt">
						<option>Select</option>
						<option>Corporate</option>
						<option>Leisure</option>
						<option>Senior Citizen</option>
					</select>
				</li>
				  <li class="col_4 col_sm_6  clearfix">
                    <label>No. of Trips</label>
					<select  id="security_question_1" name="security_question_1" onchange="check_dd();" class="w100pcnt">
						<option value="Single">Single</option>
						<option value="Multiple">Multiple</option>
					</select>
				</li>
				</ul>
				<div id="single_entry">
				<ul class="col_12 clearfix">
				 <li class="col_4 col_sm_6 clearfix">
					<label>Departure</label>
					<input type="text" id="checkinDate"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" /></li>
					<li class="col_4 col_sm_6 clearfix">
					<label>Arrival</label>
					<input type="text" id="endDate"  class=" w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
					
				</li>
				 <li class=" col_4 col_sm_6 clearfix"> 
				 <label>Days</label>
				  <input type="text" placeholder="1" maxlength="3" class="w100pcnt" disabled/>
				 </li>
            </ul>
			</div>
			<div id="multiple_entry" style="display:none">
				<ul class="col_12 clearfix">
				 <li class="col_4 col_sm_6 clearfix">
					<label>Start Date</label>
					<input type="text" id="checkinDate"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" /></li>
					<li class="col_4 col_sm_6 clearfix">
					<label>Arrival</label>
					<input type="text" id="endDate"  class=" w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" disabled />
					
				</li>
				 <li class=" col_4 col_sm_6 clearfix"> 
				 <label>Duration</label>
				  <select>
					<option>30 Days</option>
					<option>45 Days</option>
					<option>60 Days</option>
				  </select>
				 </li>
            </ul>
			</div>
			<p class="mT10 mB10 clearfix mL40">Date of Birth :</p>
			<ul class="col_12 mT10 mB10 clearfix mL20">
				<li class="col_6 col_sm_6 pL0 pR0 mB20">
				<label>Traveller 1</label>
                  <input id="datepicker13" class="dateField w49pcnt" type="text" placeholder="DD/MM/YYYY" readonly="readonly" />
				</li>
				<li class="col_6 col_sm_6 clearfix mT25 valign pR0 pL0"><span class="mT10 mB20 clearfix ">
				<a href="javascript:void(0);" class="add_traveller_button" style="color:#333;"><span class="addIcon fL"></span>
				<span class="posR valign">Add Traveller</span></a></span></li>
				<li class="col_12 pL0">
				<span class="input_traveller_wrap"></span>
				</li>
			</ul>
            
              <br class="cB" />
              <a href="#" class=" button button-primary fR">Search</a>
          </form>
        </div>
        <div class="globalSrcExpContr dN"> <a href="javascript:void(0);"><span class="globalSrcShow sel">Hide</span></a> </div>
      </div>
	</div>
