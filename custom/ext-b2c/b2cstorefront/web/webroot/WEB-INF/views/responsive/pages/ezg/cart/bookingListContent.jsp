<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/cart"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format"%>
<%@ taglib prefix="booking" tagdir="/WEB-INF/tags/responsive/ezg/cart/booking"%>

<meta id="orderDataJson" value="${orderDataJson}">
<script type="text/javascript">
function hideShowAcc(id1, id2)
{
	$('#'+id2).slideToggle("slow");
	$('#'+id2).toggleClass("active");
		if ($('#'+ id2).hasClass('active')) {
			$('#'+ id1).find('img').attr('src','${ezgImagesPath}/up1.png');		   
		}else{
			$('#'+ id1).find('img').attr('src','${ezgImagesPath}/down1.png');
		}
}
</script>
<div class="container" id="container">
	<section class="query-section"></section>
	<section class="list-section"></section>
</div>


<script id='queryTemplate' type='text/ractive'>
<h3 class="fcGry mT15 mB15">Bookings</h3>
<section style="padding:10px 10px 5px 10px" class="clearfix  brdrLitGry " >
		<h5 class="fL mR10">Search for Booking</h5>
		<a href="javascript:void(0);" class="fL mB10" id="booking" onclick="hideShowAcc('booking', 'bookinginner')"><img src="${ezgImagesPath}/down1.png" alt="Arrow"></a>
		<ul class="clearfix cB dN " id="bookinginner"
			style="display: none;">
			<li class="col_3 mB10"><label>Booking ID</label> 
			<input type="text" class="w90pcnt" value="{{queryModel.bookingID}}"></li>
			<li class="col_3 mB10"><label>From</label> 
				<input type="text" id="datepicker-from" class="dateField w90pcnt" placeholder="dd/mm/yyyy"
				readonly="readonly"></li>
			<li class="col_3 mB10"><label>Product name</label> 
				<input type="text" class="w90pcnt" value="{{queryModel.productName}}"></li>
			<li class="col_3 mB10"><label>Booking status</label> 
				<select class="w90pcnt" value="{{queryModel.bookingStatus}}">
					<option value='' >--select--</option>
					<c:forEach  var="item" items="${orderStatus}">
						<option value="${item.key}">${item.value}</option>
					</c:forEach>
				</select>
			</li>
			<li class="col_3 mB10"><label>Passenger name</label> 
				<input type="text" class="w90pcnt" value="{{queryModel.passengerName}}"></li>
			<li class="col_3 mB10"><label>To</label> 
				<input type="text" id="datepicker-to" class="dateField w90pcnt" placeholder="dd/mm/yyyy"
				readonly="readonly"></li>
			<li class="col_3 mB10"><label>Product type</label> 
				<select class="pT0 pB0 w90pcnt" value="{{queryModel.productType}}">
					<option value=''>--select--</option>
					<c:forEach  var="item" items="${productTypes}">
						<option value="${item.key}">${item.value}</option>
					</c:forEach>
				</select></li>
			<li class="col_3 mB10"><label>Payment</label> 
				<select class="w90pcnt">
					<option value=''>--select--</option>
					<option>Paid</option>
					<option>Refund</option>
				</select></li>
			<a href="#" class=" button button-primary fR" on-click= 'search'>Search</a>
		</ul>
	</section>
	<div class="clearfix mB10">
		<span class="fL mT15">Bookings for 
			<span class="fW500">15 July 2014 -€“ 15 Aug 2014</span>
		</span> 
		<span class=" fR mT15"> 
			<span class="fL grey_bg pD5 mB15">{{paginModel.from}} - {{paginModel.to}} 
				<span class="fcLitGry">of {{paginModel.totalNumberOfResults}}</span>
			</span> 
			<span class="frArrow pD5 "><img src="${ezgImagesPath}/common/next-arrow.png" alt="forward" class="mR10 fR {{paginModel.isLast?'':'page-enable'}}" style="margin-top: 12px;" on-click= 'next'></span> 
			<span class="frArrow pD5 "><img	src="${ezgImagesPath}/common/back-arrow.png" alt="forward" class="mR10 mT10 {{paginModel.isFirst?'':'page-enable'}}" on-click= 'prev'></span>
		</span> 
		<br class="cB">
	</div>
</script>


<script id='listTemplate' type='text/ractive'>
{{#each listModel}}
{{# {outerOrder:. }}}  <%-- this is the order --%>
	<div class="bdrFullLightGrey clearfix posR mB20">
		<div class="clearfix pD10  bkgLitBlu">
			<span class="col_4">
				<span class="fS16">Booking Id:</span> 
				<span class="fcLitGry fW400  fS16 "><a href="${fullContextPath}/bookingDetail/{{code}}">{{code}}</a></span> 
			</span>
			<span class="col_4">
				<span class=" fS16 mT3 ">Date of booking : </span> 
				<span class=" fS16 fcLitGry fW400">
					{{ formatterWithYear(created)}}
				</span>
			</span>
			<span class=" col_4">
				<span class=" fS16 mT3 fR">Booking Amount :
					<span class=" fS16 fcLitGry fW400 ">
						<!-- <span class="rupee">Rs</span> <span class="">$</span>-->
						{{totalPriceWithTax.formattedValue}}
					</span>
				</span>
			</span>
		</div>
		
		{{#each entries}}
			{{# {group:.}}} 				<%-- this is the group  (hotel)--%>
			{{#if orderEntryType === 'HOTEL'}}
				<section class="ft_results w100pcnt">
					<div class="col_8 pR0 pL10 layover clearfix">
						<h4 class="mT15">Hotels</h4>
					</div>
					<div class="col_4 mT10"> 
						{{#if outerOrder.status.code==="CANCELLED"}}
							 <span class=" fS16 mT3 fR">Date of cancellation:  :<span class=" fS16 fcLitGry fW400 ">15 Oct. 2014</span></span>
						{{else}}
							
							<span class="fS14 dB"> <span class=" fS16 mT3 fR">Amount :<span class=" fS16 fcLitGry fW400 "> 
								{{#if orderEntryInfoData.hotelDetailInfoData.priceInfo}}
									<span class="rupee">Rs</span>{{orderEntryInfoData.hotelDetailInfoData.priceInfo.costPrice}}
								{{/if}}
								</span></span></span>
							
						{{/if}}
					</div>
					<div class="cB"></div>
					<div class="col_8 clearfix pD5 mT10">
						<span class="col_2 pD0"><img src="${ezgImagesPath}/common/hotel_small.jpg" alt=""></span>
							<span>{{product.name}}</span><br>
						<span class=" fS16 mT3 ">{{formatterDate(orderEntryInfoData.hotelDetailInfoData.hotelCheckinDate)}} {{orderEntryInfoData.hotelDetailInfoData.reservationDay}} nights </span> 
						<span class=" fS16 mT3 planningdetail">{{orderEntryInfoData.hotelDetailInfoData.numberOfRooms}} Rooms </span> 
						<span class=" fS16 mT3 planningdetail">{{orderEntryInfoData.hotelDetailInfoData.numberOfAdult}} Adults, {{orderEntryInfoData.hotelDetailInfoData.numberOfChild}} Child</span><br>
					</div>
					<div class="col_4 mT10 clearfix">
						<span class=" fS16 mT3 fR">Status : 
							{{#if outerOrder.status.code ==="COMPLETED"}}
								<span class=" fS16 confirm pD5  fW400 ">Confirmed</span>
							{{else}}
								<span class=" fS16 txtClrRed pD5  fW400 ">{{outerOrder.statusDisplay}}</span>
							{{/if}}
						</span><br>  
					</div>
					<div class="cB"></div>
					<div class="cB"></div>
					<div class="col_12 mT10 clearfix brdrBLitGry">
						<span class="fR"> <a href="#"><img
								src="${ezgImagesPath}/custom/print.png" alt=""></a>
						</span> <span class="fR"> <a href="#"><img
								src="${ezgImagesPath}/custom/download.png" alt=""></a>
						</span> <span class="fR"> <a href="#"><img
								src="${ezgImagesPath}/custom/mail.png" alt=""></a>
						</span>
					</div>
				</section>
			
			{{else}}								<%-- this is the group  (flight-group)--%>
				<section class="ft_results w100pcnt">
	        		<div class="col_8 pR0 pL10 layover clearfix">
						<h4 class="mT15">Flight</h4> </div>
	        		<div class="col_4 mT10"> <span class="fS14 dB"> 
	        			<span class=" fS16 mT3 fR">Amount :<span class=" fS16 fcLitGry fW400 ">{{basePrice.formattedValue}}</span></span></span> </div>
	    
	      			<div class="cB"></div>
	      			<div class="col_8 clearfix pD5 mT10">
						{{#each entries}}		<%-- this is the flight  --%>
							<div>
	      					<span><img src="${ezgImagesPath}/srp_flight/indigo_sml_logo.jpg" alt="" /></span> <span class="fS18">{{orderEntryInfoData.flightDetailInfoData.commonFlightInfoData.fromCity}}</span> 
							<span class="flight_icon_sml  mT5 mL10 mR10"></span> 
							<span class=" fS18">{{orderEntryInfoData.flightDetailInfoData.commonFlightInfoData.toCity}} </span> 
							<span class=" fS16 mT3 planningdetail">{{formatterDate(orderEntryInfoData.flightDetailInfoData.commonFlightInfoData.departureTime)}} </span> 
							<span class="fS16 planningdetail">
								{{#if adultCount}}
									{{adultCount}} Adult
								{{/if}} 
								{{#if adultCount && childCount}}
									 , 
								{{/if}} 
								{{#if childCount}}
									{{childCount}} child
								{{/if}} 
								</span>
							</div>
						{{/each}}
		 			</div>
		  			<div class="col_4 mT10 clearfix"> <span class="fS14 dB"> <span class=" fS16 mT3 fR">Status :<span class=" fS16 confirm pD5  fW400 ">Confirmed</span></span></span> </div>
		   			<div class="cB"></div>
	      			<div class="col_12 mT10 clearfix brdrBLitGry">
						  <span class="fR">
							<a href="#"><img src="${ezgImagesPath}/custom/print.png" alt="" /></a>
						  </span>
						   <span class="fR">
							<a href="#"><img src="${ezgImagesPath}/custom/download.png" alt="" /></a>
						  </span>
						   <span class="fR">
							<a href="#"><img src="${ezgImagesPath}/custom/mail.png" alt="" /></a>
						  </span>
		  			</div>
		   		</section>	
			{{/if}}
		{{/}}		<%-- end of the group --%>
		{{/each}}
		<div class="cB"></div>
	</div>
{{/}}		<%-- end of the order --%>
{{/each}}

</script>
<script type="text/javascript" src="${ezgJsPath}/custom/bookingListSearch.js"></script>