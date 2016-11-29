<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!--show customer detail start here-->
<div class="white_content popupplay" id="showcustdetail" style="top:0%; height:100%; padding-top:20px; padding-bottom:20px;">
  <div class="white_content_inner w80pcnt w95pcnt_sm" id="showcustdetailinner">
    <span class="popup_close_icon fR" onclick="popupclose('showcustdetail', 'fade')"></span>
    <h3 class="pD10 grey_bg mT20">Customer Details</h3>
	 <!--=== Start Search Discover holiday ===-->
      <div class="clearfix grey_border pD10">
        <div class="col_2 pL0">
          <img src="${cnkImagesPath}/unknow_reviewer.jpg" alt="Personal Photo" class="mB5" />
          <a href="javascript:void(0);" class="tC">Change photo</a>
        </div>
        <div class="col_10 pR0 col_12_sm">
          <div class="brdrBLitGry pB10 mB10 clearfix">
            <div class="col_6 pL0">
              <span class="fS16 mB5 fL w100pcnt">Mr. Rahul Sodi</span>
              <span class="fS12">Registered since 1 Oct. 2010</span>
            </div>
            <div class="col_6 tR pR0">
              <span class="fS24 mB5 fW600 dB profileShowHide active cursor">-</span>
              <span class="fS12 cursor" onclick="popupclose('showcustdetail', 'fade'),popupwin('addcustdetail','addcustdetailinner','fade')"><span class="edit_icon mR5"></span>Edit details</span>
            </div>
          </div>
          <div class="clearfix profileDtlContr">
            <div class="col_3 brdrRlitGry clearfix">
				<span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Gender:</span>Male</span>
                <span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Age:</span>34</span>
                <span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Birthday:</span>7 Oct 1975</span>
                <span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Anniversary:</span>8 Sept 2000</span>
                <span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Honeymoon:</span>-</span>
                <span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Meal:</span>Jain meal only</span>
            </div>
            <div class="col_3 brdrRlitGry clearfix">
            <span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Email ID:</span><a href="mailto:rahul.sodi@gmail.com">rahul.sodi@gmail.com</a></span>
                <span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Phone: </span>91-9807895768 (Mobile)<br>0120-456785 (Office)<br>0120-847564 (Home)</span>
                <span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Home address:</span>442, Main Bahadur Road, Noida - 201307 </span>
                <span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Office address:</span>L-25, Workers street, Mumbai - 400399</span>
                
            </div>
            <div class="col_3 brdrRlitGry clearfix">
            	<span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Designation:</span>Sales manager</span>
                <span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Company:</span>TCS, Mumbai</span>
                <span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Identity:</span># Family Traveler<br># Foodie<br># Luxury Traveler</span>
                <span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Disability (if any):</span>Amputated left leg<br><span class="txtClrRed">Wheelchair required</span></span>
               
            </div>
            <div class="col_3 clearfix">
            <span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Booking till date:</span><span class="rupee">Rs. </span>2,34,000</span>
                <span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Last booking:</span>:) Happy</span>
                <span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Best time to call: </span>Mon – Fri,  10:00 to 18:00  (Office)</span>
                <span class="mB20 clearfix w100pcnt fL"><span class="txtClrlitGryMid dB">Best time to visit:</span>Sat,  14:00 to 18:00  (Home)</span>
              
            </div>
          </div>
        </div>
      </div>
         <div class="clearfix customerDetail">
         
          <ul class="custDtlTab secTab clearfix">
            <li class="sel">
              <div class="tab"><a href="#overview">Overview</a></div>
            </li>
			<li>
              <div class="tab"><a href="#enquiries">Enquiries</a></div>
            </li>
            <li>
              <div class="tab"><a href="#bookings">Bookings</a></div>
            </li>
            <li>
              <div class="tab"><a href="#communication">Communications</a></div>
            </li>
          </ul>
          <div class="grey_border pD15 clearfix">
          <div id="overview">
            <div class="mB20 clearfix">
              <div class="col_6 pL0 pR0 grey_border">
                <h3 class="pD10 fW600">Notifications</h3>
                <div class="scrollable pD15 scrlH300">
                  <article class="pD10 grey_bg">
                    <p class="mB5"><a href="javascript:void(0);">Enquiry ID 10565LE</a></p>
                    <p class="mB5 txtClrlitGryMid">Flight Dep 29/10/2014 Delhi to Kolkata</p>
                    <p class="mB5 txtClrRed">Follow-up on 2nd Oct, 10 days overdue</p>
                  </article>
                  <article class="pD10">
                    <p class="mB5"><a href="javascript:void(0);">Enquiry ID 10565LE</a></p>
                    <p class="mB5 txtClrlitGryMid">No rooms in booked hotel </p>
                    <p class="mB5">Escalate dispute</p>
                  </article>
                  <article class="pD10 grey_bg">
                    <p class="mB5"><a href="javascript:void(0);">Booking ID 10565LE </a></p>
                    <p class="mB5 txtClrlitGryMid">Trip from Mumbai to Goa, 4/10/2014</p>
                    <p class="mB5">Payment pending</p>
                  </article>
                  <article class="pD10">
                    <p class="mB5"><a href="javascript:void(0);">Enquiry ID 10565LE</a></p>
                    <p class="mB5 txtClrlitGryMid">No rooms in booked hotel </p>
                    <p class="mB5">Escalate dispute</p>
                  </article>
                  <article class="pD10 grey_bg">
                    <p class="mB5"><a href="javascript:void(0);">Booking ID 10565LE </a></p>
                    <p class="mB5 txtClrlitGryMid">Trip from Mumbai to Goa, 4/10/2014</p>
                    <p class="mB5">Payment pending</p>
                  </article>
                </div>
              </div>
              <div class="col_6 pR0">
                <div class="grey_border mB10 clearfix">
                  <div class="col_6 brdrRlitGry pT10 pB10">
                    <h3 class="mB5">Bookings till date</h3>
                    <span class="mB10 dB"><span class="rupee">Rs. </span>Rs 2,34,000</span>
                    <span>Holidays shared: <strong>25</strong></span>
                  </div>
                  <div class="col_6 pT10 pB10 clearfix">
                    <h3 class="mB5">Last booking</h3>
                    <span class="mB10 mT10 dB"><span class="fL mR10"><img src="${cnkImagesPath}/happy_face.png" alt="Happy Face" /></span><span class="fL mT10">Happy</span></span>
                  </div>
                </div>
                <div class="grey_border">
                  <div class="clearfix pD15">
                    <h3 class="fL">Remarks</h3>
                    <span class="fR"><a href="javascript:void(0);" id="moreInfo1" onClick="showMoreInfo('moreInfo1','moreInfoCont1','plusMinus1')"><span id="plusMinus1">+</span> Add remark</a></span>
                  </div>
                   <div id="moreInfoCont1" class="pD15 dN clearfix">
                      <textarea rows="5" class="w100pcnt mB5"></textarea>
                      <div class="primaryBtn fR"><a href="javascript:void(0);" onClick="dismissMoreInfo('moreInfo1','moreInfoCont1','plusMinus1')">Add remark</a></div>
                   </div>
                    <div class="scrollable pD15 scrlH185">
                      <article class="clearfix w90pcnt custDtlRemark">Likes beach holidays and Mauritius in particular. Travels with family usually, give child friendly holidays to him.<br><span class="mT5 dB">01/08/2014</span></article>
                      <article class="clearfix w90pcnt custDtlRemark">Prefers the business class when traveling with family.<br><span class="mT5 dB">28/07/2014</span></article>
                      <article class="clearfix w90pcnt custDtlRemark">Likes beach holidays and Mauritius in particular. Travels with family usually, give child friendly holidays to him.<br><span class="mT5 dB">01/08/2014</span></article>
                      <article class="clearfix w90pcnt custDtlRemark">Prefers the business class when traveling with family.<br><span class="mT5 dB">28/07/2014</span></article>
                      <article class="clearfix w90pcnt custDtlRemark">Likes beach holidays and Mauritius in particular. Travels with family usually, give child friendly holidays to him.<br><span class="mT5 dB">01/08/2014</span></article>
                      <article class="clearfix w90pcnt custDtlRemark">Prefers the business class when traveling with family.<br><span class="mT5 dB">28/07/2014</span></article>
                      <article class="clearfix w90pcnt custDtlRemark">Likes beach holidays and Mauritius in particular. Travels with family usually, give child friendly holidays to him.<br><span class="mT5 dB">01/08/2014</span></article>
                      <article class="clearfix w90pcnt custDtlRemark">Prefers the business class when traveling with family.<br><span class="mT5 dB">28/07/2014</span></article>
                      
                      
                      
                      
                      
                      
                    </div>
                   
                </div>
              </div>
            </div>
             
              
              <div class="col_12 pR0">
                <div class="grey_border mB10 clearfix">
                  <div class="col_6 brdrRlitGry pT10 pB10">
                    <h3 class="mB10">Preferences </h3>
                    <span class="mB20 dB clearfix">
                      <span class="col_2 pR0 pL0"><span class="image_icon"></span></span>
                      <span class="col_10 pL0">Europe, Far East, Australia,Beach destinations</span>
                    </span>
                    <span class="mB20 dB clearfix">
                      <span class="col_2 pR0 pL0"><span class="flight_icon"></span></span>
                      <span class="col_10 pL0">Jet Airways, Emirates, British Airways<br />
                        Class: Business<br />
                        Seat preference: Window, front row</span>
                    </span>
                    <span class="mB20 dB clearfix">
                      <span class="col_2 pR0 pL0"><span class="hotel_icon"></span></span>
                      <span class="col_10 pL0">5 star</span>
                    </span>
                    <span class="dB clearfix">
                      <span class="col_2 pR0 pL0"><span class="other_icon"></span></span>
                      <span class="col_10 pL0">Other requirements:<br />
                        Transfers<br />
                        Calling<br />
                        cardInsurance</span>
                    </span>
                  </div>
                  <div class="col_6 pT10 pB10">
                    <h3 class="mB10">Recommendations </h3>
                    <p class="fS12 txtClrlitGryMid mB10">Ezeego1 recommends products as per the customer’s preferences.</p>
                    <span class="mB20 dB clearfix">
                      <span class="col_2 pR0 pL0"><span class="image_icon"></span></span>
                      <span class="col_10 pL0"><a href="javascript:void(0);">Cantona Islands, Greece</a><br />
                        <span class="rupee">Rs. </span> 58000 per person,3D/4N </span>
                    </span>
                    <span class="mB20 dB clearfix">
                      <span class="col_2 pR0 pL0"><span class="flight_icon"></span></span>
                      <span class="col_10 pL0"><a href="javascript:void(0);">Emirates: Delhi to Dubai</a><br />
                        <span class="rupee">Rs. </span> 18000 per person, business class</span>
                    </span>
                    <span class="mB20 dB clearfix">
                      <span class="col_2 pR0 pL0"><span class="hotel_icon"></span></span>
                      <span class="col_10 pL0">
                        <span class="mB5"><a href="javascript:void(0);">Taj Palace Hotel, Bhutan</a>, <br />
                          <span class="rupee">Rs. </span> 5900 per person per night</span>
                        <span class="mB5"><a href="javascript:void(0);">Leela Kempinski Hotel, Gurgaon</a>, <br />
                          <span class="rupee">Rs. </span> 4500 per person per night</span>
                      </span>
                    </span>
                  </div>
                </div>
              </div>
            </div>
			<div class="dN" id="enquiries">
					 <span class=" mT25">Enquiries for <span class="fW500">15 July 2014 – 15 Aug 2014</span></span>
					  <table id="myTable" class="dataTable w100pcnt mB20">
						<thead>
						  <tr class="tableHrdrHeight">
							<th class="tC headerSortUp w17pcnt sortclick tableHrdrHeight" ><span class="fL">Customer name</span><span class="mL5 fR dB"></span></th>
							<th   class="tC  pL0 pR10  headerSortUp sortclick">Date<span class="mL5 fR w20pcnt">&nbsp;</span></th>
							<th class=" tC no-sort">Enquiry ID</th>
							<th  class="tC no-sort">Products</th>
							<th  class="tC no-sort w140">Status</th>
							<th  class="tC w100 no-sort">Notes</th>
							<th  class="tC no-sort w120">Actions</th>
						  </tr>
						  </thead>
						  <tbody>
						  <tr class="bookingTblCellHit" id="bookingtest">
							<td class=" hand expandCtr"  id="bookingtestBtn"><a href="javascript:void(0);">
							<img src="${cnkImagesPath}/collapse_blu.png" alt="Arrow" class="mR5 fL mT5" /></a>Mr. Amit Trivedi</td>
							<td class="tC">3/08/14</td>
							<td class="tC">q3984y32</td>
							<td>FIT - European Experience<br>
							  <span class="fS12 txtClrlitGry">Aug 10 - 20<br>
							  <span class="rupee">Rs. </span>1,46,567</span><br>
							  <span class="fS12 txtClrlitGry">Mark up :<span class="rupee">Rs. </span>12,000.00</span></td>
							<td><span class="txtClrLitBlu">Call customer </span><br/>15/08/14 at 05:00 PM</td>
							<td class="tC w100" ><span class="fL note_icon mL30pcnt"></span></td>
							<td class="w120">
									<select class="w100pcnt" id="select_id" onchange="showvisit()">
											<option selected="selected">Select</option>
											<option value="call">Call Ezeego1</option>
											<option value="customer">Call Customer</option>
											<option value="visit">Visit Customer</option>
											<option value="view">View Details</option>
											<option value="Close">Close</option>
										</select>
							</td>
						  </tr>
						  
						  <tr class="bookingTblCellHit " id="bookingtest1">
							<td class="hand expandCtr " id="bookingtestBtn1"><a href="javascript:void(0);">
							<img src="${cnkImagesPath}/collapse_blu.png" alt="Arrow" class="mR5 fL mT5" /></a>Ms. Seema Rai </td>
							<td class="tC">1/08/14</td>
							<td class="tC">dgh5486y</td>
							<td>GIT - Shimla<br>
							  <span class="fS12 txtClrlitGry">2D/ 3N </span><br/> <span class="rupee">Rs. </span>1,46,567<br>
							  <span class="fS12 txtClrlitGry">Mark up :<span class="rupee">Rs. </span>12,000.00</span></td>
							 <td><span class="txtClrLitBlu">Call customer </span><br/>15/08/14 at 05:00 PM</td>
						   
							<td class="w100"><span onclick="showtooltipLarge('tooltipTrigge2','noteContr')" id="tooltipTrigge2" class="fL note_icon mL30pcnt"></span></td>
							<td class="w100">
										<select class="w100pcnt">
											<option selected="selected">Select</option>
											<option value="call">Call Ezeego1</option>
											<option value="customer">Call Customer</option>
											<option value="visit">Visit Customer</option>
											<option value="view">View Details</option>
											<option value="Close">Close</option>
										</select>
							</td>
						  </tr>
						  <tr class="bookingTblCellHit">
						   <td class="">Ms. Rajni Mistry</td>
							<td class="tC">25/07/14</td>
							<td class="tC">duh4394p</td>
							<td>Flight Mum - Del<br>
							  <span class="fS12 txtClrlitGry">June 16 - 17 </span><br/> <span class="rupee">Rs. </span>8,35,567<br>
							  <span class="fS12 txtClrlitGry">Mark up :<span class="rupee">Rs. </span>5,400.00</span></td>
							<td><span class="txtClrLitBlu">Customer will call back </span><br/>15/08/14 at 05:00 PM</td>
							<td class="w100"><span class="note_icon mL30pcnt"></span></td>
							<td class="w100">
									<select class="w100pcnt">
											<option selected="selected">Select</option>
											<option value="call">Call Ezeego1</option>
											<option value="customer">Call Customer</option>
											<option value="visit">Visit Customer</option>
											<option value="view">View Details</option>
											<option value="Close">Close</option>
										</select>
							</td>
						  </tr>
						  <tr class="bookingTblCellHit">
						   <td class="">Ms. Imran Mistry</td>
							<td class="tC">25/07/14</td>
							<td class="tC">duh4394p</td>
							<td>Flight Mum - Del<br>
							  <span class="fS12 txtClrlitGry">June 16 - 17 </span><br/> <span class="rupee">Rs. </span>8,35,567<br>
							  <span class="fS12 txtClrlitGry">Mark up :<span class="rupee">Rs. </span>5,400.00</span></td>
							<td><span class="txtClrLitBlu">Customer will call back </span><br/>15/08/14 at 05:00 PM</td>
							<td class="w100"><span class="note_icon mL30pcnt"></span></td>
							<td class="w100">
									<select class="w100pcnt">
											<option selected="selected">Select</option>
											<option value="call">Call Ezeego1</option>
											<option value="customer">Call Customer</option>
											<option value="visit">Visit Customer</option>
											<option value="view">View Details</option>
											<option value="Close">Close</option>
										</select>
							</td>
						  </tr>
						  <tr class="bookingTblCellHit">
						   <td class="">Ms. Rajni Mistry</td>
							<td class="tC">25/07/14</td>
							<td class="tC">duh4394p</td>
							<td>Flight Mum - Del<br>
							  <span class="fS12 txtClrlitGry">June 16 - 17 </span><br/> <span class="rupee">Rs. </span>8,35,567<br>
							  <span class="fS12 txtClrlitGry">Mark up :<span class="rupee">Rs. </span>5,400.00</span></td>
							<td><span class="txtClrLitBlu">Customer will call back </span><br/>15/08/14 at 05:00 PM</td>
							<td class="w100"><span class="note_icon mL30pcnt"></span></td>
							<td class="w100">
									<select class="w100pcnt">
											<option selected="selected">Select</option>
											<option value="call">Call Ezeego1</option>
											<option value="customer">Call Customer</option>
											<option value="visit">Visit Customer</option>
											<option value="view">View Details</option>
											<option value="Close">Close</option>
										</select>
							</td>
						  </tr>
						  <tr class="bookingTblCellHit ">
						   <td class="">Ms. Imran Mistry</td>
							<td class="tC">25/07/14</td>
							<td class="tC">duh4394p</td>
							<td>Flight Mum - Del<br>
							  <span class="fS12 txtClrlitGry">June 16 - 17 </span><br/> <span class="rupee">Rs. </span>8,35,567<br>
							  <span class="fS12 txtClrlitGry">Mark up :<span class="rupee">Rs. </span>5,400.00</span></td>
							<td><span class="txtClrLitBlu">Customer will call back </span><br/>15/08/14 at 05:00 PM</td>
							<td class="w100"><span class="note_icon mL30pcnt"></span></td>
							<td class="w100">
									<select class="w100pcnt">
											<option selected="selected">Select</option>
											<option value="call">Call Ezeego1</option>
											<option value="customer">Call Customer</option>
											<option value="visit">Visit Customer</option>
											<option value="view">View Details</option>
											<option value="Close">Close</option>
										</select>
							</td>
						  </tr>
						  <tr class="bookingTblCellHit">
						   <td class="">Ms. Rajni Mistry</td>
							<td class="tC">25/07/14</td>
							<td class="tC">duh4394p</td>
							<td>Flight Mum - Del<br>
							  <span class="fS12 txtClrlitGry">June 16 - 17 </span><br/> <span class="rupee">Rs. </span>8,35,567<br>
							  <span class="fS12 txtClrlitGry">Mark up :<span class="rupee">Rs. </span>5,400.00</span></td>
							<td><span class="txtClrLitBlu">Customer will call back </span><br/>15/08/14 at 05:00 PM</td>
							<td class="w100"><span class="note_icon mL30pcnt"></span></td>
							<td class="w100">
									<select class="w100pcnt">
											<option selected="selected">Select</option>
											<option value="call">Call Ezeego1</option>
											<option value="customer">Call Customer</option>
											<option value="visit">Visit Customer</option>
											<option value="view">View Details</option>
											<option value="Close">Close</option>
										</select>
							</td>
						  </tr>
						  <tr class="bookingTblCellHit">
						   <td class="">Ms. Imran Mistry</td>
							<td class="tC">25/07/14</td>
							<td class="tC">duh4394p</td>
							<td>Flight Mum - Del<br>
							  <span class="fS12 txtClrlitGry">June 16 - 17 </span><br/> <span class="rupee">Rs. </span>8,35,567<br>
							  <span class="fS12 txtClrlitGry">Mark up :<span class="rupee">Rs. </span>5,400.00</span></td>
							<td><span class="txtClrLitBlu">Customer will call back </span><br/>15/08/14 at 05:00 PM</td>
							<td class="w100"><span class="note_icon mL30pcnt"></span></td>
							<td class="w100">
									<select class="w100pcnt">
											<option selected="selected">Select</option>
											<option value="call">Call Ezeego1</option>
											<option value="customer">Call Customer</option>
											<option value="visit">Visit Customer</option>
											<option value="view">View Details</option>
											<option value="Close">Close</option>
										</select>
							</td>
						  </tr>
						  </tbody>
						</table>
						
			<a href="#" class="fR mT10 mB20">View all</a>
						<table class="dN">
						<thead>
						<tr>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						</tr>
						</thead>
						<tbody id="bookingtestCtr">
							<tr class="closeCtr" id="adddetaillist"> 
							<td colspan="7" class="p0">
							<table class="w100pcnt grey_bg">
							<thead>	
							<tr>
								<th class="tC">Date</th>
								<th class="tC">ID</th>
								<th class="tC">Product</th>
								<th class="tC w140">Status</th>	
								<th class="w100 tC">Notes</th>
								<th class="w120 tC">Actions</th>
							</tr>	
							</thead>	
								
							<tbody>
							<tr>
							<td class="tC">02/06/2014</td>
							<td class="tC">QRF09865g</td>
							<td>Flight-Delhi-London <br/><span class="fS12 txtClrlitGry">Aug 8, <span class="rupee">Rs. </span>7,547.00/ pax </span><a href="#" class="fS11 mL10">See Today’s Deals</a></td>
							<td>Flight only Quote Received </td>	
							 <td ><span class="note_icon mL30pcnt"></span></td>
							<td>
										<select class="w100pcnt defaultTextColor">
												<option selected="">Select</option>
												<option value="book">Book</option>
												<option value="Mail">Mail</option>
												<option value="Edit">Edit</option>
												<option value="Print">Print</option>
												<option value="View">View</option>
												<option value="Close">Close</option>
											</select>		
							</td>
							</tr>
							<tr>
							<td class="tC"> 1/06/14</td>
							<td class="tC">Q310985</td>
							<td>GIT – European Experience<br/><span class="fS12 txtClrlitGry">Aug 10-20 ; <span class="rupee">Rs. </span>38,000.00 </span></td>
							<td>Draft <span class="fS21 fW600 txtClrRed fI">!</span></td>	
							 <td ><span class="note_icon mL30pcnt"></span></td>
							<td>
										<select class="w100pcnt defaultTextColor">
												<option selected="">Select</option>
												<option value="book">Book</option>
												<option value="Mail">Mail</option>
												<option value="Edit">Edit</option>
												<option value="Print">Print</option>
												<option value="View">View</option>
												<option value="Close">Close</option>
											</select>		
							</td>
							</tr>
							
							</tbody>
							</table>
							</td> 
							</tr>
							</tbody>
						<tbody id="bookingtestCtr1">
							<tr class="closeCtr" id="adddetaillist1"> 
							<td colspan="7" class="p0">
								
							<table class="w100pcnt grey_bg">
							<thead>	
							<tr>
								<th class="tC">Date</th>
								<th class="tC">ID</th>
								<th class="tC">Product</th>
								<th class="tC w140">Status</th>	
								<th class="w100 tC">Notes</th>
								<th class="w120 tC">Actions</th>
							</tr>	
							</thead>	
								
							<tbody>
							<tr>
							<td class="tC">02/06/2014</td>
							<td class="tC">QRF09865g</td>
							<td>Flight-Delhi-London <br/><span class="fS12 txtClrlitGry">Aug 8, <span class="rupee">Rs. </span>7,547.00/ pax </span><a href="#" class="fS11 mL10">See Today’s Deals</a></td>
							<td>Flight only Quote Received </td>	
							 <td ><span class="note_icon mL30pcnt"></span></td>
							<td>
										<select class="w100pcnt defaultTextColor">
												<option selected="">Select</option>
												<option value="book">Book</option>
												<option value="Mail">Mail</option>
												<option value="Edit">Edit</option>
												<option value="Print">Print</option>
												<option value="View">View</option>
												<option value="Close">Close</option>
											</select>		
							</td>
							</tr>
							<tr>
							<td class="tC"> 1/06/14</td>
							<td class="tC">Q310985</td>
							<td>GIT – European Experience<br/><span class="fS12 txtClrlitGry">Aug 10-20 ; <span class="rupee">Rs. </span>38,000.00 </span></td>
							<td><span class="mT10">Draft </span><span class="fS21 fW600 txtClrRed fI">!</span></td>	
							 <td ><span class="note_icon mL30pcnt"></span></td>
							<td>
										<select class="w100pcnt defaultTextColor">
												<option selected="">Select</option>
												<option value="book">Book</option>
												<option value="Mail">Mail</option>
												<option value="Edit">Edit</option>
												<option value="Print">Print</option>
												<option value="View">View</option>
												<option value="Close">Close</option>
											</select>		
							</td>
							</tr>
							
							</tbody>
							</table>
							</td> 
							</tr>
							</tbody>
						</table>
			</div>
            <div class="dN" id="bookings">
					<p class="mT10 mB20">Last 10 bookings</p>
    
					  <table class="dataTable w100pcnt   cB  clearfix">
						<thead>
						  <tr class="tableHrdrHeight">
							<th   class="tC  pL0 pR10  headerSortUp sortclick">Date<span class="mL5 fR w20pcnt">&nbsp;</span></th>
							<th class=" tC no-sort">Booking ID</th>
							<th  class="tC no-sort">Product name</th>
							<th  class="tC no-sort">Booking status</th>
							<th  class="tC no-sort">Payment</th>
							<th  class="tC no-sort">Booking amount</th>
							<th  class="tC no-sort dN_sm">Notes</th>
							<th  class="tC no-sort ">Feedback</th>
							<th  class="tC no-sort ">Agent satisfaction</th>
							<th  class="tC no-sort">Details</th>
						  </tr>
						  </thead>
						  <tbody>
						  <tr class="bookingTblCellHit">
							<td>3/08/14</td>
							<td>831-1467515 <br/>handled by <a href="#">Rahul Sharma</a></td>
							<td>FIT - European Experience<br/>
							  <span class="fS12 txtClrlitGry">Aug 10 - 20</span></td>
							<td>Time - Limit </td>
							<td>Partial </td>
							<td class="tR"><span class="rupee">Rs. </span>1,46,567</td>
							<td class="dN_sm" ><span onclick="showtooltipLarge('tooltipTrigge1','noteContr')" id="tooltipTrigge1" class="fL note_icon"></span></td>
							<td><a href="#">Ask for feedback </a></td>
							<td class="tC">- </td>
							<td><a href="#">View Details</a></td>
						  </tr>
						  </tbody>
						  <tr class="bookingTblCellHit altRow">
							<td class="brdrBN">9/09/14</td>
							<td>831-1467515 <br/>handled by <a href="#">Ashish Bhansali</a></td>
							<td>FIT - European Experience<br/>
							  <span class="fS12 txtClrlitGry">Aug 10 - 20</span></td>
							<td>Time - Limit </td>
							<td>Partial </td>
							<td class="tR"><span class="rupee">Rs. </span>1,46,567</td>
							<td class="dN_sm" ><span class="fL note_icon"></span></td>
							<td>Could plan the right itinerary for the client. Thanks! <a href="#">Read full mail </a></td>
							<td class="tC"><img src="${cnkImagesPath}/happy_face.png" alt="Happy Face" style="width:20px" class="mR10">Happy </td>
							<td><a href="#">View Details</a></td>
						  </tr>
						  </tbody>
						</table>
			</div>
            
            <div class="dN" id="communication">
				<div class="col_12 pL0 fL mB10 mT20">
					<section class=" col_12 pL0 clearfix">
						<table class="dataTable w100pcnt   cB  clearfix">
						<thead>
						  <tr class="tableHrdrHeight">
							<th   class="tC  pL0 pR10  headerSortUp sortclick">Date<span class="mL5 fR w20pcnt">&nbsp;</span></th>
							<th class="tC no-sort">Entity</th>
							<th class="tC no-sort">Entity ID</th>
							<th class="tC no-sort">Communication type</th>
							<th class="tC no-sort">Communication details</th>
						  </tr>
						  </thead>
						  <tbody>
						  <tr class="bookingTblCellHit">
							<td>18/11/2015</td>
							<td class="tC">Customer</td>
							<td class="tC">C1004</td>
							<td class="tC">B2C</td>
							<td class="tC">Lorem ipsum dolor sit amet</td>
						  </tr>
						  </tbody>
						  <tr class="bookingTblCellHit altRow">
							<td>18/11/2015</td>
							<td class="tC">Customer</td>
							<td class="tC">C1080</td>
							<td class="tC">B2B</td>
							<td class="tC">Lorem ipsum dolor sit amet</td>
						  </tr>
						  </tbody>
						</table>
					</section>
				</div>
			</div>
          </div>
       
      </div>
      <!--=== End Search Discover holiday ===--> 
  </div>
</div>

<!-- end show custDetail-->