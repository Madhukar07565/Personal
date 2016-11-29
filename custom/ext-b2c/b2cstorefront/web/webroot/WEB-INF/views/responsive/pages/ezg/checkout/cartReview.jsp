<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

       
       <c:if test="${flight }">
        <div class="inrContr clearfix posR mB20"> 
          
          <!-- Sub Header -->
          <div class="clearfix shopCardHrdr ">
            <h5 class="fL">Flights</h5>
            <img src="${ezgImagesPath }/common/collapse.png" alt="Arrow" class="fR mT5"> </div>
          <div class="clearfix posR mB20 shopCardContr dN"> 
            <!-- Section begins -->
            <div class="clearfix shopCardHrdrSec">
              <div class="fL clearfix pD10"> <span class="fS18">MUM</span> <span class="flight_icon_sml  mT5 mL10 mR10"></span> <span class=" fS18">DEL </span> <span class=" fS16 mT3 planningdetail">24 Jul, Sun </span> <span class=" fS16 mT3 planningdetail">1 Adult, 1 child</span> <a href="javascript:void(0)" id="moreInfor1" class="mT10 pL10"><span id="plusMinusr1">+</span>Details</a> </div>
              <div class="fR"> <span class="fL pD10 mR10 mT5"><span title="Edit" class="edit_icon fL"></span> </span> <span class="fS30 srp_famount fR pD10"><span class="rupee">Rs</span>10,382</span> </div>
            </div>
            
            <!-- Expanded view-->
            <section class="ft_results detailContr w100pcnt dN" id="moreInfoContr1"> <span class="show_contr_close fR" onclick="dismissMoreInfo('moreInfo6','moreInfoCont6','plusMinus6')"></span> <span class="show_contr_Aro"></span>
              <div class="col_6 pR0 pL10 layover clearfix"> <samp class="go_AI"> <span class="pT40">Indigo<br/>
                6E 198</span> </samp> <dfn> <strong> <small>Mumbai <br>
                MUM </small> 05:30<br>
                <em class="mT10">25 Sep, Sun
                Chatrapati Shivaji Airport,Terminal 1B</em> </strong> <ins> <span>Economy</span> 1h 5m Nonstop<br>
                <span class="fS11">Airbus A380</span> </ins> <strong> <small>Ahmedabad<br>
                ABD </small> 06:35<br>
                <em class="mT10">25 Sep, Sun
                Devi Ahilya Bai Holkar </em> </strong> </dfn> <span class="layoverBG fL w100pcnt"><span class="layoverBGTime">Layover 22 hrs 45 min</span></span><br class="cB">
                <samp class="go_AI"></samp> <dfn> <strong> <small>Ahmedabad<br>
                ABD </small> 05:10<br>
                <em>26 Sep, Sun
                Devi Ahilya Bai Holkar </em> </strong> <ins> <span>Economy</span> 1h 5m Nonstop<br>
                <span class="fS11">Airbus A380</span> </ins> <strong> <small>Delhi <br>
                DEL </small> 06:25<br>
                <em>26 Sep, Mon
                Indira Gandhi Airport,Terminal3</em> </strong> </dfn> </div>
              <div class="col_5 mT10"> <a href="javascript:void(0)" onclick="popupwin('booking_policy','booking_policyinner', 'fade')">Booking policy</a> </div>
            </section>
            
            <!-- Second Flight-->
            <div class="clearfix fL w100pcnt shopCardHrdrSec">
              <div class="fL clearfix pD10"> <span class="fS18">DEL</span> <span class="flight_icon_sml  mT5 mL10 mR10"></span> <span class=" fS18">MUM </span> <span class=" fS16 mT3 planningdetail">25 Jul, Mon </span> <span class=" fS16 mT3 planningdetail">1 Adult, 1 child</span> <a href="javascript:void(0)" id="moreInfor2" class="mT10 pL10"><span id="plusMinusr2">+</span>Details</a> </div>
              <div class="fR"> <span class="fL pD10 mR10 mT5"><span title="Edit" class="edit_icon fL"></span> </span> <span class="fS30 srp_famount fR pD10"><span class="rupee">Rs</span><span id="flightTotalAmount">11,764</span></span> </div>
            </div>
            
            <!-- Expanded View Detail-->
            <section class="ft_results detailContr w100pcnt dN" id="moreInfoContr2"> <span class="show_contr_close fR" onclick="dismissMoreInfo('moreInfo7','moreInfoCont7','plusMinus7')"></span> <span class="show_contr_Aro"></span>
              <div class="col_6 pR0 pL10 layover clearfix"> <samp class="go_AI"> <span class="pT40">Indigo<br/>
                6E 198</span> </samp> <dfn> <strong> <small>Mumbai <br>
                MUM </small> 05:30<br>
                <em class="mT10">25 Sep, Sun
                Chatrapati Shivaji Airport,Terminal 1B</em> </strong> <ins> <span>Economy</span> 1h 5m Nonstop<br>
                <span class="fS11">Airbus A380</span> </ins> <strong> <small>Delhi<br>
                DEL </small> 06:35<br>
                <em class="mT10">25 Sep, Sun
                Devi Ahilya Bai Holkar </em> </strong> </dfn> </div>
              <div class="col_5 mT10"> <a href="javascript:void(0)" onclick="popupwin('booking_policy', 'booking_policyinner', 'fade')">Booking policy</a> </div>
            </section>
           <section class="ft_results detailContr w100pcnt pD5">
			 <h4  class="mL10 fW600">Travellers</h4>
			 </section>
            <table class="mB20 w100pcnt dataTable">
			<thead>
				<tr>
					<th colspan="2" class="whiteBg">Type</th>
					<th class="whiteBg">Name</th>
					<th class="whiteBg">Services</th>
					<th class="whiteBg">&nbsp;</th>
					<th class="whiteBg">Price</th>
				</tr>
			</thead>
			<tbody>
              <tr>
                <td><span class="adult_icon_small"></span></td>
                <td>Adult 1</td>
                <td>Mr Abey Kuruvilla</td>
                <td>Veg meals @ <span class="rupee">Rs</span>300<span title="Delete" class="recycle_icon_wishlist mT5 mL10"></span><br/><br/>1 kg baggage @ <span class="rupee">Rs</span>300<span title="Delete" class="recycle_icon_wishlist mT5 mL10"></span></td>
                <td><span title="Edit" class="edit_icon fL mR8"></span><span title="Delete" class="recycle_icon_wishlist mT5 fL"></span></td>
                <td><div class="fS30 tR"><span class="rupee">Rs</span>660</div></td>
              </tr>
              <tr>
                <td><span class=" child_icon_small"></span></td>
                <td>Child 1</td>
                <td>Ms Priya Kuruvilla</td>
                 <td>Veg meals @ <span class="rupee">Rs</span>300<span title="Delete" class="recycle_icon_wishlist mT5 mL10"></span></td>
                <td><span title="Edit" class="edit_icon fL mR8"></span><span title="Delete" class="recycle_icon_wishlist mT5 fL"></span></td>
                <td><div class="fS30 tR"><span class="rupee">Rs</span>660</div></td>
              </tr>
              <tr>
                <td><span class=" umbrella_small"></span></td>
                <td colspan="3">Domestic <a href="javascript:void(0)">Travel Insurance</a> added @ Rs 195/person for 1 adult and 1 child</td>
                <td><span title="Edit" class="edit_icon fL mR8"></span><span title="Delete" class="recycle_icon_wishlist mT5 fL"></span></td>
                <td><div class="fS30 tR"><span class="rupee">Rs</span>360</div></td>
              </tr>
			<tbody/>
            </table>
           <div class="clearfix mT20">
              <div class="fR">
              </div>
            </div>
            
          </div>
        </div>
       </c:if>
       <c:if test="${haveHotel }">
        <!--  Hotel Details -->
        <div class="inrContr clearfix posR mB20"> 
          
          <!-- Sub Header -->
          <div class="clearfix shopCardHrdr ">
            <h5 class="fL"> Hotels</h5>
            <img src="${ezgImagesPath }/common/collapse.png" alt="Arrow" class="fR mT5"> </div>
          
          	<c:if test="${not empty hotelData }">
			<c:forEach items="${hotelData  }" var="hotelinfo">
	          <div class="clearfix shopCardContr dN"> 
	            <!-- Section begins -->
	            <div class="clearfix shopCardHrdrSec">
	              <div class="fL clearfix pD10"> <span class="fL mR20"><img src="${ezgImagesPath }/common/hotel_thumb.png" alt="Hotel"></span>
	                <div class="fL">
	                  <h4 class="mB5">${hotelinfo.hotelName},${hotelinfo.hotelCityName},${hotelinfo.hotelCountryName}</h4>
	                  <span class="fS16">${hotelinfo.hotelCheckinDate }, ${hotelinfo.reservationDay } nights</span> <span class=" fS16 mT3 planningdetail">${hotelinfo.numberOfRooms } Rooms</span> 
	                  <span class=" fS16 mT3 planningdetail">${hotelinfo.numberOfAdult} Adults ${hotelinfo.numberOfChild}, Child</span> 
	                  	<a href="javascript:void(0)" id="moreInfor3" class="mT10 pL10"><span id="plusMinusr3">+</span>Details</a> 
	                  </div>
	              </div>
	              <div class="fR"> <span class="fL pD10 mR10 mT5"><span title="Edit" class="edit_icon fL"></span> </span> 
	              <span class="fS30 srp_famount fR pD10"> <span class="rupee">Rs</span>${hotelinfo.priceInfo.costPrice } 
	              <span class="fS12 dB">Pay now, refundable</span> </span> </div>
	            </div>
	            
	            <!-- Expanded view-->
	            <section class="ft_results detailContr w100pcnt dN" id="moreInfoContr3"> <span class="show_contr_close fR" onclick="dismissMoreInfo('moreInfo8','moreInfoCont8','plusMinus8')"></span> <span class="show_contr_Aro"></span>
	              <c:forEach items="${hotelinfo.roomDetailInfoList }" var="room" varStatus="status">
	              <div class="mB20 clearfix">
	                <div class="col_8 pL100  mT20 clearfix"> 
	                	<c:if test="${status.first }">
	                		<span class="fs16 mB5 w100pcnt fL">Check in: <fmt:formatDate value="${ room.roomCheckinDate}" type="date" pattern="EEEE dd, MMMM yyyy" dateStyle="long"/></span> 
	                	</c:if>
	                	<span class="fL col_6 pL0"> <span class="fL w100pcnt mB5">${room.roomType }</span> 
	                	<span class="fS12">With Breakfast & dinner ${room.description }<br>
	                  On request/ pay later </span> </span> 
	                  <span class="fL col_6"> <span class="fL w100pcnt mB5">1 Room @ Rs 4000 X  ${room.numberOfNight } Nights</span> 
	                  <span class="fS12">${room.numberOfAdult} Adults, ${room.numberOfChild} Child</span> </span> 
	                </div>
	                <div class="col_4 mT10"> <span class="fS30 fR pD10"> 
	                <span class="rupee">Rs</span>${room.priceInfo.costPrice } <span class="fS12 dB">Pay now</span> </span> 
	                </div>
	              </div>
	              </c:forEach>
	            </section>
				<section class="ft_results detailContr w100pcnt pD5">
				 <h4  class="mL10 fW600">Travellers</h4>
				 </section>
	            <table class="mB20 w100pcnt dataTable">
				<thead>
					<tr>
						<th colspan="2" class="whiteBg">Room Type</th>
						<th class="whiteBg">Type</th>
						<th class="whiteBg">Name</th>
						<th class="whiteBg">&nbsp;</th>
						
					</tr>
				</thead>
				<c:forEach items="${hotelinfo.roomDetailInfoList }" var="room" varStatus="status">
					
					<tr>
	                <td><span class="bed_small mT10"></span></td>
	                <td>Room ${status.index+1 } - ${room.roomType } <br/>Without Breakfast</td>
	                <td>Adult 1</td>
	                <td>Mr ${room.hotelTraveler.firstName } &nbsp;${room.hotelTraveler.lastName }</td>
	                <td><span title="Edit" class="edit_icon fL mR8"></span><span title="Delete" class="recycle_icon_wishlist mT5 fL"></span></td>
	                <td>&nbsp;</td>
	              </tr>
	              <c:forEach items="${room.hotelTraveler.nonPrimaryTravellerList }" var="nonPr" varStatus="nonStatus">
	              <tr>
	                <td></td>
	                <td>&nbsp;</td>
	                <c:if test="${empty nonPr.dateOfBirth }">
	                	<td>Adult ${nonStatus.index + 2 }</td>
	                </c:if>
	                <c:if test="${not empty nonPr.dateOfBirth }">
	                	<td>Child ${nonStatus.index + 2 - room.numberOfAdult}</td>
	                </c:if>
	                <td>Mrs ${nonPr.firstName }&nbsp; ${nonPr.lastName }</td>
	                <td>&nbsp;</td>
	                <td>&nbsp;</td>
	              </tr>
	              </c:forEach>
				</c:forEach>
	              
	            </table>
	             <div class="clearfix mT20">
	              <div class="fR">
	              </div>
	            </div>
	          </div>
          </c:forEach>
          </c:if>
        </div>
	   </c:if>
		<c:if test="${flightAndHotel }">
		<!--  flight+hotel Details -->
		<div class="inrContr clearfix posR mB20"> <!-- Sub Header -->
          <div class="clearfix shopCardHrdr ">
            <h5 class="fL">Flight + Hotel</h5>
            <img src="${ezgImagesPath }/common/collapse.png" alt="Arrow" class="fR mT5"> </div>
          <div class="shopCardContr pD10 dN"> 
				<span class=" fS16 mT3">MUM-DEL-JAI-DEL-MUM</span>	
				<span class=" fS16 mT3 planningdetail">24 Jul – 27 Jul</span>
				<span class=" fS16 mT3 planningdetail">Room 1 – 2 Adults, 1 child</span>
				<span class=" fS16 mT3 planningdetail">Room 2 – 2 Adults</span>				
				<div class="fR"> <span class="fL pD10 mR10 mT5"><span title="Edit" class="edit_icon fL"></span> </span> <span class="fS30 srp_famount fR pD10"> <span class="rupee">Rs</span>44,764 </span> </div>
				<section class="ft_results mT20 "> 
             <div class="col_5 pR0 pL10 layover clearfix">
				<div class="clearfix "> <span class="fS18">MUM</span> <span class="flight_icon_sml  mT5 mL10 mR10"></span> <span class=" fS18">DEL </span> <span class=" fS16 mT3 planningdetail">24 Jul, Mon </span>
				</div>
				<samp class="go_AI"> <span class="pT40">Indigo<br>
                6E 198</span> </samp> <dfn> <strong> <small>Mumbai <br>
                MUM </small> 05:30<br>
                <em class="mT10">25 Sep, Sun
                Chatrapati Shivaji Airport,Terminal 1B</em> </strong> <ins> <span>Economy</span> 1h 5m Nonstop<br>
                <span class="fS11">Airbus A380</span> </ins> <strong> <small>Ahmedabad<br>
                ABD </small> 06:35<br>
                <em class="mT10">25 Sep, Sun
                Devi Ahilya Bai Holkar </em> </strong> </dfn> 
			</div>
			<div class="fL clearfix pR0 pL0 col_5"> 
				<div class="clearfix pD10"> <span class="fS16">Hotel  in Delhi<span class=" fS14 mT3 planningdetail">24 Jul, Mon </span>
				</span></div>
				<span class="fL mR10"><img src="${ezgImagesPath }/common/hotel_thumb.png" alt="Hotel"></span>
                <div class="fL w63pcnt">
                  <h5 class="mB5">Adarsh Hamilton</h5>
                  <span class="fS14 mB5">City  center,  near MG Road, Delhi</span> <br> <span class=" fS14 mT3">24 Jul, Mon </span> <span class=" fS16 mT3 planningdetail">1 Night </span><span class=" fS14 mT3 planningdetail">Room 1 – 2 Adults, 1 Child</span><span class=" fS14 mT3 planningdetail">Room 2 – 2 Adults</span>  </div>
             </div>
			 <div class="fR col_2"> 
				<span class="fL pD10 mR10 mT5"><span title="Edit" class="edit_icon fL"></span> </span> 
			 </div>
			 <div class="cB"></div>
			 <div class="col_12 fS30imp tC pL0 pR0 plus">+</div>
			  <div class="cB"></div>
			  <div class="col_5 pR0 pL10 layover clearfix">
				<div class="clearfix pD10 "> <span class="fS18">DEL</span> <span class="flight_icon_sml  mT5 mL10 mR10"></span> <span class=" fS18">JAI </span> <span class=" fS16 mT3 planningdetail">24 Jul, Mon </span>
				</div>
				<samp class="go_AI"> <span class="pT40">Indigo<br>
                6E 198</span> </samp> <dfn> <strong> <small>Delhi <br>
                DEL </small> 05:30<br>
                <em class="mT10">25 Sep, Sun
                Chatrapati Shivaji Airport,Terminal 1B</em> </strong> <ins> <span>Economy</span> 1h 5m Nonstop<br>
                <span class="fS11">Airbus A380</span> </ins> <strong> <small>Jaipur<br>
                JAI </small> 06:35<br>
                <em class="mT10">25 Sep, Sun
                Devi Ahilya Bai Holkar </em> </strong> </dfn>
			</div>
			<div class="fL clearfix pR0 pL0 col_5"> 
				<div class="clearfix pD10"> <span class="fS16">Hotel  in Jaipur<span class=" fS14 mT3 planningdetail">24 Jul, Mon </span>
				</span></div>
				<span class="fL mR10"><img src="${ezgImagesPath }/common/hotel_thumb.png" alt="Hotel"></span>
                <div class="fL w63pcnt">
                  <h5 class="mB5">Adarsh Hamilton</h5>
                  <span class="fS14 mB5">City  center,  near MG Road, Delhi</span> <br> <span class=" fS14 mT3">24 Jul, Mon </span> <span class=" fS16 mT3 planningdetail">1 Night </span><span class=" fS14 mT3 planningdetail">Room 1 – 2 Adults, 1 Child</span><span class=" fS14 mT3 planningdetail">Room 2 – 2 Adults</span>  </div>
             </div>
			 <div class="fR col_2"> 
				<span class="fL pD10 mR10 mT5"><span title="Edit" class="edit_icon fL"></span> </span> 
			 </div>
			  <div class="cB"></div>
			 <div class="col_12 fS30imp tC pL0 pR0 plus">+</div>
			  <div class="cB"></div>
			    <div class="col_5 pR0 pL10 layover clearfix">
				<div class="clearfix pD10 "> <span class="fS18">JAI</span> <span class="flight_icon_sml  mT5 mL10 mR10"></span> <span class=" fS18">DEL </span> <span class=" fS16 mT3 planningdetail">24 Jul, Mon </span>
				</div>
				<samp class="go_AI"> <span class="pT40">Indigo<br>
                6E 198</span> </samp> <dfn> <strong> <small>Jaipur <br>
                JAI </small> 05:30<br>
                <em class="mT10">25 Sep, Sun
                Chatrapati Shivaji Airport,Terminal 1B</em> </strong> <ins> <span>Economy</span> 1h 5m Nonstop<br>
                <span class="fS11">Airbus A380</span> </ins> <strong> <small>Delhi<br>
                DEL </small> 06:35<br>
                <em class="mT10">25 Sep, Sun
                Devi Ahilya Bai Holkar </em> </strong> </dfn>
			</div>
			<div class="fL clearfix pR0 pL0 col_5"> 
				<div class="clearfix pD10"> <span class="fS16">Hotel  in Delhi<span class=" fS14 mT3 planningdetail">24 Jul, Mon </span>
				</span></div>
				<span class="fL mR10"><img src="${ezgImagesPath }/common/hotel_thumb.png" alt="Hotel"></span>
                <div class="fL w63pcnt">
                  <h5 class="mB5">Adarsh Hamilton</h5>
                  <span class="fS14 mB5">City  center,  near MG Road, Delhi</span> <br> <span class=" fS14 mT3">24 Jul, Mon </span> <span class=" fS16 mT3 planningdetail">1 Night </span><span class=" fS14 mT3 planningdetail">Room 1 – 2 Adults, 1 Child</span><span class=" fS14 mT3 planningdetail">Room 2 – 2 Adults</span>  </div>
             </div>
			 <div class="fR col_2"> 
				<span class="fL pD10 mR10 mT5"> <span title="Edit" class="edit_icon fL"></span> </span> 
			 </div>
			  <div class="cB"></div>
			 <div class="col_12 fS30imp tC pL0 pR0 plus">+</div>
			  <div class="cB"></div>
			      <div class="col_10 pR0 pL10 layover clearfix">
				<div class="clearfix pD10 "> <span class="fS18">JAI</span> <span class="flight_icon_sml  mT5 mL10 mR10"></span> <span class=" fS18">DEL </span> <span class=" fS16 mT3 planningdetail">24 Jul, Mon </span>
				</div>
				<samp class="go_AI"> <span class="pT40">Indigo<br>
                6E 198</span> </samp> <dfn> <strong> <small>Jaipur <br>
                JAI </small> 05:30<br>
                <em class="mT10">25 Sep, Sun
                Chatrapati Shivaji Airport,Terminal 1B</em> </strong> <ins> <span>Economy</span> 1h 5m Nonstop<br>
                <span class="fS11">Airbus A380</span> </ins> <strong> <small>Delhi<br>
                DEL </small> 06:35<br>
                <em class="mT10">25 Sep, Sun
                Devi Ahilya Bai Holkar </em> </strong> </dfn>
			</div>
			
			 <div class="fR col_2"> 
				<span class="fL pD10 mR10 mT5"><span title="Edit" class="edit_icon fL"></span> </span> 
			 </div>
			  <div class="cB"></div>
			  <section class="ft_results detailContr w100pcnt pD5">
			 <h4  class="mL10 fW600">Travellers</h4>
			 </section>
			  <table class="mB20 w100pcnt dataTable">
			  <thead>
				<tr>
					<th colspan="2" class="whiteBg">Type</th>
					<th class="whiteBg">Name</th>
					<th class="whiteBg">Services</th>
					<th class="whiteBg">&nbsp;</th>
					<th class="whiteBg">Price</th>
					
				</tr>
			</thead>
              <tbody>
			  <tr>
                <td><span class="adult_icon_small"></span></td>
                <td>Adult 1</td>
                <td>Mr Abey Kuruvilla</td>
                <td>Veg meals <span title="Delete" class="recycle_icon_wishlist mT5 mL10"></span></td>
                <td><span title="Edit" class="edit_icon fL mR8"></span><span title="Delete" class="recycle_icon_wishlist mT5 fL"></span></td>
                <td><div class="fS30 tR"><span class="rupee">Rs</span>660</div></td>
              </tr>
			  
			  <tr>
                <td><span class=" umbrella_small"></span></td>
                <td colspan="3">Domestic <a href="javascript:void(0)">Travel Insurance</a> added @ Rs 195/person for 1 adult and 1 child</td>
                <td><span title="Edit" class="edit_icon fL mR8"></span><span title="Delete" class="recycle_icon_wishlist mT5 fL"></span></td>
                <td><div class="fS30 tR"><span class="rupee">Rs</span>360</div></td>
              </tr>
            
				</tbody>
			</table>  
            </section>
          </div>
        </div>
		</c:if>
		<div class="clearfix"> 
			<div class="fR clearfix mB20">
	          <div class="finalTotalAmt pD10 mB10">
	            <div>Total:</div>
	            <div class="fS30"><span class="rupee">Rs</span>${cartData.totalPrice.value }</div>
	          </div>
	          
	          <form:form method="post" id="cartReviewForm"   action="${contextPath}/checkout/multi/review">
				<input type="hidden" maxlength="3" size="1" id="qty" name="qty" class="qty js-qty-selector-input" value="1">
				<input type="hidden" name="productCodePost" value="1303"/><!-- ${product.code} -->
				
				<a id="cartReviewLink" href="javascript:void(0)" class="w100pcnt button button-primary tC">Continue</a> 
			</form:form>
			</div>
         </div>
      
     