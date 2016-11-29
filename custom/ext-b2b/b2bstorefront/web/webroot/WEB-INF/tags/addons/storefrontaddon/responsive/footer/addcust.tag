<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!--add customer detail start here-->
<div class="white_content popupplay" id="addcustdetail" style="top:0%; height:100%; padding-top:20px; padding-bottom:20px;">
  <div class="white_content_inner w80pcnt w95pcnt_sm" id="addcustdetailinner">
    <span class="popup_close_icon fR" onclick="popupclose('addcustdetail', 'fade')"></span>
    <h3 class="pD10 grey_bg mT20 fW600">Customer Details</h3>
	
	<div class="clearfix">
		<div class="fL" style="width:179px">
			<div class="mT30 tC">
				<img src="${cnkImagesPath}/profile-img.jpg" alt="agent image" /><br/>
				<span class="">
					<input type='file' id='file' name='file' />
					<span class=" btn-upload mR10"><a href="#">change photo</a></span>											
				</span>
			</div>
		</div>
		<div class="col_9 col_12_sm pL0 pR0">
			<ul class=" mB10 clearfix ">
				<li class="fL col_1_half pR0">
					<label>Title</label>
					<select class="pL0"><option>Mr.</option></select>
				</li>
				<li class=" col_4 pR0">
					<label>First Name*</label>
					<input type="text" class="w100pcnt" placeholder="Rahul"/>
				</li>
				<li class="col_2_half pR0">
					<label>Middle Name</label>
					<input type="text" class="w100pcnt" placeholder="D"/>
				</li>
				<li class="col_4 ">
					<label>Last Name*</label>
					<input type="text" class="w100pcnt" placeholder="Sodi"/>
				</li>
			</ul>
			<label class=" mB5 pL20 clearfix ">Gender*</label>
			<ul class=" mB10 pL20 clearfix ">
				<li class="fL  mR20">
					
					<input type="radio" name="gender" /> <label>Male</label>
				</li>
				<li class=" fL mR10">
					<input type="radio"  name="gender"  /><label>Female</label>
				</li>
			
			</ul>
			 <label class="mB10 clearfix pL20">Date of Birth</label>
				<ul class="mB10 pL20 clearfix">
					<li class="col_1_half pL0 pR10">
						   <select class="pD0">
							<option value="dd.">dd</option>
						  </select>
						</li>
						<li class=" col_2 pL0 pR10">
						 <select class="pD0">
							<option value="mm">mm</option>
						  </select>
						</li>
						<li class="col_2 pL0 pR10">
						   <select>
							<option value="yyyy">yyyy</option>
						  </select>
						</li>
				 </ul>
			 <ul class=" mB10 clearfix ">
				<li class="col_4  pR0">
					<label>Marital Status</label>
					<select class="pL0"><option>Married</option></select>
				</li>
				<li class=" col_2 pR0">
					&nbsp;
				</li>
				<li class="col_5 pR0">
					 <label class="mB10 clearfix ">Anniversary Date</label>
				<ul class="mB10  clearfix">
					<li class="col_3 pL0  pR10">
						   <select class="pD0">
							<option value="dd.">dd</option>
						  </select>
						</li>
						<li class=" col_3 pL0  pR10">
						 <select class="pD0">
							<option value="mm">mm</option>
						  </select>
						</li>
						<li class="col_4  pL0 pR10">
						   <select>
							<option value="yyyy">yyyy</option>
						  </select>
						</li>
				 </ul>
				</li>
			</ul>
			 <ul class=" mB10 clearfix ">
				<li class="col_4  pR0">
					<label>Email ID</label>
					<input type="text" class="w100pcnt" placeholder="rahul.sodi@gmail.com"/>
				</li>
				<li class="col_5 pR0 pL5">
				<label class="mB10">&nbsp;</label>
					<a href="javascript:void(0);" class="mT5"><span class="add_details_icon mR5 fL" ></span><span class="posR fL" >Add another</span></a>
				</li>
				
			</ul>
			
			 <ul class=" mB10 clearfix ">
				<li class="col_4  pR0">
					<label>Contact Number (Home)</label>
					<input type="text" class="w100pcnt" placeholder="0120-26563595"/>
				</li>
				<li class=" col_2 pR0 pL5">
					<label class="mB10">&nbsp;</label>
					<a href="javascript:void(0);" class="mT5"><span class="add_details_icon mR5 fL" ></span><span class="posR fL" >Add another</span></a>
				</li>
				<li class="col_4 pR0">
					<label>Contact Number (Office)</label>
					<input type="text" class="w100pcnt" placeholder="0120-26563595"/>
				</li>
				<li class=" col_2 pR0 pL5">
					<label class="mB10">&nbsp;</label>
					<a href="javascript:void(0);" class="mT5"><span class="add_details_icon mR5 fL" ></span><span class="posR fL" >Add another</span></a>
				</li>
			</ul>
			<label class="pL20">Mobile Number</label>
			 <ul class=" mB10 clearfix ">
				<li class="col_4  pR0">
					<input type="text" class="fL w16pcnt mR5" placeholder="91"/>
					<input type="text" class="fL w80pcnt" placeholder="9026562656"/>
				</li>
				<li class="col_5 pR0 pL5 clearfix pT5">
					<a href="javascript:void(0);" class="mT10"><span class="add_details_icon mR5 fL" ></span><span class="posR fL" >Add another</span></a>
				</li>
				
			</ul>
			
			<ul class=" mB10 clearfix ">
				<li class="col_6  pR0">
					<label>Home Address</label>
					<textarea class="w100pcnt"  rows="4" placeholder="442, Main Bahadur Marg, Noida-200721"></textarea>
				</li>
				<li class="col_6 pR0">
					<label>Office Address</label>
					<textarea class="w100pcnt"  rows="4"  placeholder="442,Workers Street,Mumbai-400399"></textarea>
					
				</li>
			</ul>
			
			 <ul class=" mB10 clearfix ">
				<li class="col_4  pR0">
					<label>Designation</label>
					<input type="text" class="w100pcnt" placeholder="Sales Manager"/>
				</li>
				<li class=" col_2 pR0 pL5">
					<label class="mB10">&nbsp;</label>
					
				</li>
				<li class="col_4 pR0">
					<label>Company</label>
					<input type="text" class="w100pcnt" placeholder="TCS"/>
				</li>
				<li class=" col_2 pR0 pL5">
					<label class="mB10">&nbsp;</label>
					
				</li>
			</ul>
			<label class="pL20 mB5"> Customer Identity</label>
			<div class="mB10  clearfix">
				 <ul class="col_3  pR0">
              <li class="clearfix mB5">
                <input type="checkbox" id="Honeymooner" />
                <label for="Honeymooner">Honeymooner</label>
              </li>
              <li class="clearfix mB5">
                <input type="checkbox" id="Birdwatcher" />
                <label for="Birdwatcher">Bird watcher</label>
              </li>
              <li class="clearfix mB5">
                <input type="checkbox" id="Wildlifeenthusiastic" />
                <label for="Wildlifeenthusiastic">Wildlife enthusiastic</label>
              </li>
            </ul>
            <ul class="col_3 pR0">
              <li class="clearfix mB5">
                <input type="checkbox" id="Luxurytraveller" />
                <label for="Luxurytraveller">Luxury traveller</label>
              </li>
              <li class="clearfix mB5">
                <input type="checkbox" id="Historybuff" />
                <label for="Historybuff">History buff</label>
              </li>
              <li class="clearfix mB5">
                <input type="checkbox" id="Romantic" />
                <label for="Romantic">Romantic</label>
              </li>
            </ul>
            <ul class="col_3 pR0">
              <li class="clearfix mB5">
                <input type="checkbox" id="Photographer" />
                <label for="Photographer">Photographer</label>
              </li>
              <li class="clearfix mB5">
                <input type="checkbox" id="BechLover" />
                <label for="BechLover">Bech Lover</label>
              </li>
              <li class="clearfix mB5">
                <input type="checkbox" id="Adventure" />
                <label for="Adventure">Adventure</label>
              </li>
            </ul>
            <ul class="col_3 pR0">
              <li class="clearfix mB5">
                <input type="checkbox" id="NatureLover" />
                <label for="NatureLover">Nature Lover</label>
              </li>
              <li class="clearfix mB5">
                <input type="checkbox" id="Family" />
                <label for="Family">Family</label>
              </li>
              <li class="clearfix mB5">
                <input type="checkbox" id="BudgetTraveller" />
                <label for="BudgetTraveller">Budget Traveller</label>
              </li>
            </ul>
			</div>
			<ul class=" mB10 clearfix ">
				<li class="col_4  pR0">
					<label>Physical Disability</label>
					<select><option>Ampulated left leg</option></select>
				</li>
				<li class="col_5 pR0 pL5 clearfix pT5">
				<label class="">&nbsp;</label>
					<input type="checkbox"/><label>Wheel chair required</label>
				</li>
			</ul>
			<ul class=" mB10 clearfix ">
				<li class="col_6  pR0">
					<label>Best time to Call(Office)</label>
					<ul>
						<li class="fL mR10"><select class="w100"><option>Mon</option><option>Tue</option></select></li>
						<li class="fL fW500 mR10 valign">To</li>
						<li class="fL mR10"><select class="w100"><option>Fri</option><option>Sat</option></select></li>
					</ul>
				</li>
				<li class="col_6 pR0">
					<label>Best time to Visit(Home)</label>
					<ul>
						<li class="fL mR10"><select class="w100"><option>Sun</option><option>Tue</option></select></li>
						<li class="fL fW500 mR10 valign">To</li>
						<li class="fL mR10"><select class="w100"><option>Select</option><option>Sat</option></select></li>
					</ul>
				</li>
			</ul>
			<ul class=" mB10 clearfix ">
				<li class="col_6  pR0">
					
					<ul>
						<li class="fL mR10"><select class="w100"><option>10:00</option><option>10:30</option></select></li>
						<li class="fL fW500 mR10 valign">To</li>
						<li class="fL mR10"><select class="w100"><option>20:00</option><option>20:00</option></select></li>
					</ul>
				</li>
				<li class="col_6 pR0">
					
					<ul>
						<li class="fL mR10"><select class="w100"><option>10:00</option><option>10:30</option></select></li>
						<li class="fL fW500 mR10 valign">To</li>
						<li class="fL mR10"><select class="w100"><option>20:00</option><option>20:00</option></select></li>
					</ul>
				</li>
			</ul>
		</div>
		<div class="clearfix"></div>
		<hr class="mT10 mB10 clearfix"/>
	<p class="mT10 clearfix">
	
		<span class=" fR pD10 mL10"><a href="javascript:void(0);">Cancel</a></span>
			<span class="primaryBtn fR clearfix"><a href="javascript:void(0);" onclick="popupclose('addcustdetail', 'fade')">Save Details</a></span>
	</p>
	
		<div class="cB"></div>
  </div>
  </div>
</div>

<!-- end add custDetail-->