<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/cart" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="order" tagdir="/WEB-INF/tags/responsive/ezg/order"%>
<meta id="orderList" value="${orderDataJson}"/>
  <!--=== Start Deals for travellers ===-->
  <div class="container">
    <ul class="breadCrumb clearfix">
      <li><a href="javascript:void(0);">Home</a></li>
      <li class="divider"></li>
      <li><a href="javascript:void(0);">My account</a></li>
      <li class="divider"></li>
      <li>Bookings</li>
    </ul>
	
	<h3 class="fW500">Thank you for booking with Ezeego1</h3>
    <div class="pB10 bdrBtmDarkGrey mB10">Your bookings have been confirmed.</div>
    <div class="mB10 clearfix"> <span class="mB10 fL">Booking ID: ${orderData.code }</span> 
    <span class="fR fS12">Date of booking:<fmt:formatDate value="${orderData.created}" dateStyle="medium" timeStyle="short" type="both"/>
    </span> </div>
		<div id='flight-root'></div>
		
		<c:set var='showFligthTemplateStart' value='<script id="showFligthTemplate" type="text/ractive">'/>
		<c:set var='showFligthTemplateEnd' value='</script>'/>
${showFligthTemplateStart}


{{#each oDataModel.entries}}
{{# {group: .}}}
	{{#if group.orderEntryType ==="FLIGHT_GROUP" }}
		{{> flightTemplate}}
	{{else}}
		{{> hotelTemplate}}
	{{/if}}
{{/}}
{{/each}}
{{> paymentTemplate}}

{{#partial flightTemplate}}
<div class="mB10 bkgLitBlu clearfix">
<span class="fS18 fL pL10 pT5">Flight</span>
</div>

<div class="bdrFullLightGrey clearfix posR mB20">
{{#each group.entries:indexFlight}}
{{# {flight: .}}}


{{#if indexFlight === 0}}
<div class="clearfix pD10">

	{{#each group.aRoute:indexRout}}
		{{# {cityName:.}}}
			<span class="fS18">{{cityName}}</span> 
			{{#if indexRout !== group.aRoute.length -1 }}
				<span class="oneway_icon  mB5"></span> 
			{{/if}}
		{{/}}
	{{/each}}
		|<span class="mT5 ">{{formatterDate(group.departure)}}</span> |
		<span class=" fS16 mT3">{{group.adultCount}} Adult, {{group.childCount}} Child</span>
</div>
{{/if}}


<section class="ft_results w100pcnt">
	<div class="col_8 pR0 pL10 layover clearfix">
		
	{{#each flight.orderEntryInfoData.flightDetailInfoData.commonFlightInfoData.commonFlightDetailList}}
		<samp class="go_AI">
			<span class="pT40">{{group.product.name}}<br /> 6E 198</span>
		</samp>
		<dfn>
			<strong class="w20pcnt"> 
				<small>{{fromCity}} <br></small> 
				{{ getTime(departureTime)}} 
				<em>{{ getWeekDay(departureTime)}}
					<br>{{ formatterWithYear(departureTime)}}
					<br> {{fromCity}} Airport {{fromAirport}},Terminal {{fromTerminal}} 
				</em>
			</strong>
			
			<ins style="text-align: left; color: #999;" class="tC mT20">
				<span class="mL40">{{cabinClass}}</span>
				<span class="mL40"> {{duration}}</span>
			</ins>
			<strong> 
				<small>{{toCity}}<br> </small> 
				{{getTime(arrivalTime)}} <br>
				<em>{{getWeekDay(arrivalTime)}}
					<br />{{formatterWithYear(arrivalTime)}}
					<br> {{toCity}} Airport {{toAirport}},Terminal {{toTerminal}} 
				</em>
			</strong>
		</dfn>
		{{#if timeDiff}}
			<span class="layoverBG fL mL10pcnt w60pcnt">
				<span class="layoverBGTime L30pcnt">Layover {{timeDiff}}</span>
			</span><br class="cB">
		{{/if}}
	{{/each }}
	</div>
	
	<div class="col_4 pR0">  <%-- for price and status --%>
		<dl>
			<dt>
				<span class="fL"> 
					{{#if flight.orderEntryInfoData.flightDetailInfoData.commonFlightInfoData.priceInfo}}
						<span class="col_4 tR"> 
							<span class="fS21 w100pcnt dB">
								<span class="rupee">Rs</span>
							</span>
						</span>
						<span class="fS21">{{flight.orderEntryInfoData.flightDetailInfoData.commonFlightInfoData.priceInfo.costPrice}}</span> 
					{{/if}}	
					<br />
					<span class="fS12">Refundable</span><br /> 
					<a href="javascript:void(0)" class="fS12">Booking policy</a>
				</span> 
				<span class="fR tC txtClrGrn mB10 fW600 mR10">Confirmed</span>
			</dt>
			<dd></dd>
		</dl>
	</div>
	
</section>
<div class="cB"></div>

{{#if indexFlight === group.entries.length - 1}}
<div class="mT20 clearfix">
	<span class="col_8 mT10"> <span class=" umbrella_small"></span>
		<span>Domestic Travel Insurance added @ Rs 195/person</span>
	</span> <span class="col_4 tR"> <span class="fS21 w100pcnt dB"><span
			class="rupee">Rs</span>300</span>
	</span>
</div>
<div class="mB20 clearfix">
	<span class="col_8 mT10"> 
		<span>Airport Transfer added @Rs 600/person</span>
	</span> 
	<span class="col_4 tR"> 
		<span class="fS21 w100pcnt dB">
			<span class="rupee">Rs</span>600
		</span>
	</span>
</div>
<div class="cB"></div>
{{else}}
<hr class="litGry mT10 mB10">
{{/if}}
{{/}}
{{/each}}
</div>

<table class="dataTableBtm w100pcnt">
	<tr class="brdrBLitGry">
		<th colspan="2" class="tL" style="padding: 5px;">Traveller details</th>
		<th class="tL">Class</th>
		<th class="tL">PNR number</th>
		<th class="tL">Ticket number</th>
		<th class="tL">Insurance policy no</th>
	</tr>
	<tr class="brdrBLitGry">
		<td class="tL brdrN"><span class="adult_icon_small"></span></td>
		<td class="tL brdrN pL0">Mr Abey Kuruvilla</td>
		<td class="tL brdrN pL0">Economy</td>
		<td class="tL brdrN pL0"><a href="#">COE7W4</a></td>
		<td class="tL brdrN pL0">123456789</td>
		<td class="tL brdrN pL0"><a href="#">STG 029 2300</a></td>

	</tr>
</table>
<div class="mB10 mT20 clearfix"></div>
{{/partial}}

{{#partial hotelTemplate}}
	<div class="mB10 bkgLitBlu clearfix" > <span class="fS18 fL pL10 pT5">Hotels</span></div>
    
     <p class="mT10 clearfix brdr">
		{{#with group.orderEntryInfoData.hotelDetailInfoData}}
		<span class="fL w100pcnt">
			<img src="${ezgImagesPath}/hotel3_thumb.jpg" alt="Flight" class="valign fL mR10">
			<span class="fL fS16">
				
				<span class="fS18 fW500 dB mB5">{{hotelName}}, {{hotelAddress}}
				{{{renderRate(rateCount)}}}
				</span>
				<span>{{formatterDate(hotelCheckinDate)}}, {{reservationDay}} Nights | {{numberOfRooms}} Rooms | {{numberOfAdult}} Adults {{numberOfChild}}, Child</span><br>
				<span class="fS12">Check in: {{formatterWithYear(hotelCheckinDate)}} (12:00), Check out: {{formatterWithYear(hotelCheckoutDate)}} (10:00)</span>
				
			</span>
			<span class="fR tR">
				<span class="fS21"><span class="rupee">Rs</span> {{priceInfo.costPrice}}</span>  <br>
				<a href="javascript:void(0)" class="fS12" >Booking policy</a></span>
		</span>
		{{/with}}
	</p>

	{{#each group.entries}}
		{{# {room:.}}}
			{{#with room.orderEntryInfoData.roomDetailInfoData}}
	
	<table class="w100pcnt mT20">
      <tr class="brdrBLitGry">
        <th class="tL pB10" style="padding:5px;">Room Details</th>
        <th class="tL pB10">Supplier reference no.</th>
        <th class="tL pB10">Voucher no.</th>
        <th class="tL pB10">No. of rooms</th>
        <th class="tL pB10">No. of nights</th>
        <th class="tL pB10">Guests</th>
        <th class="tL pB10">Price </th>
		<th class="tL pB10">Status </th>
      </tr>
      <tr class="brdrBLitGry">
        <td class=" valign_top brdrN tL pL0"><span class="dB fS16 fW500">Standard double room</span> With Breakfast &amp; dinner</td>
        <td class=" valign_top  brdrN tL pL0">STG 029 2300 </td>
        <td class=" valign_top  brdrN tL pL0">ABCD021 </td>
        <td class="brdrN valign_top tL fS18 pL0 fW500">1</td>
        <td class="brdrN valign_top tL pL0"><span class="fS18 fW500">{{numberOfNight }}</span></td>
        <td class="brdrN valign_top tL pL0"><span class="fW500">{{numberOfAdult }} Adults, {{numberOfChild }} Child</span>
        
			{{#each room.entries}}
				{{# {traveller:.}}}
        	 	{{#with traveller.orderEntryInfoData.travellerData}}
        	
        		 <br>{{title}}&nbsp; {{firstName}}&nbsp; {{lastName}}
					{{#if nonPrimaryTravellerList}}
						{{#each nonPrimaryTravellerList}}	
							<br>{{title }}&nbsp; {{firstName }}&nbsp; {{lastName }}
						{{/each}}
					{{/if}}
       			{{/with}}
				{{/}}
			{{/each}}
         </td>
        <td class="valign_top  brdrN tL pL0"><span><span class="rupee">Rs. </span>{{priceInfo.costPrice}}</span></td>
		<td class="brdrN valign_top tL pL0"><span class="fR txtClrGrn  fS16 mB10  fW600 tR">{{status.code}}</span></td>
      </tr>
     </table>
	<div class="brdrBLitGry clearfix"> <span class="col_8 pD10 pL0"><span class="fW600">Additional services </span><span class="mT5"> :  Car parking for 1 day</span></span> <span class="col_4 tR pD10 pR0"> <span class="mR40 mR10_sm mTN10 dB mT5"><span class="rupee">Rs. </span>300</span> </span> </div>
	{{/with}}
	{{/}}
	{{/each}}
	 
	<p class="txtClrlitGry mT10 mB20"><strong class="fW600">Inclusions : </strong><br>
			~~ 01-Apr-2014 to 26-Sep-2014~~Valid for 01APR14-26SEP14:- Stay 3 nights and receive the 4th night free (maximum 1 free night).; Booking Code: STAY4PAY3.;~~~~~~ 29-Sep-2014 to 31-Oct-2014~~Valid for 29SEP14-31OCT14:- Stay 3 nights and receive the 4th night free (maximum 1 free night).; Booking Code: STAY4PAY3.;~~~~~~ 09-Nov-2014 to 30-Dec-2014~~Valid for 09NOV14-30DEC14:- Stay 3 nights and receive the 4th night free (maximum 1 free night).; Booking Code: STAY4PAY3.;~~~~~~ 02-Jan-2015 to 18-Jan-2015~~Valid for</p>
	<p class="txtClrlitGry mT10 mB20"><strong class="fW600">Cancellation policy: </strong><br>
			Standard Room 1 Double Bed - Stay Pay
            01-Apr-2014 to 31-Mar-2015Valid for 01APR14-31MAR15:- 1 nights cancellation fee for bookings cancelled 24 hours or less prior to travel or in the event of a no-show.Except valid for.</p>
		<hr class="litGry mT20 mB20 clearfix">			
	 
	<div class="mB10 clearfix"></div>

{{/partial}}

{{#partial paymentTemplate}}
	<hr class="mB20 mT10">
	<p class="tR pD10 lH15">
		Total: <span class="fW600 fS18 mL10">{{oDataModel.totalPrice.formattedValue}}</span><br/>
		{{#with oDataModel.paymentSummaryInfoData}}
			{{#if amountPaid}}
				Amount paid: <span class="fW600 fS18 mL10">{{amountPaid.formattedValue}}</span><br/>
			{{/if}}
		
			{{#if pendingBalanceForFull || pendingBalanceForPart}}
				<c:set var="pendingBalanceForFull" value="${orderData.paymentSummaryInfoData.pendingBalanceForFull.value}" />
				<c:set var="pendingBalanceForPart" value="${orderData.paymentSummaryInfoData.pendingBalanceForPart.value}" />
				Pending balance payment: <span class="fW600 fS18 mL10"><fmt:formatNumber value="${pendingBalanceForFull + pendingBalanceForPart}" pattern="#,#00.00#"/></span><br/>
			{{/if}}
		
			{{#if payOnConfirmation}}
				Pay on confirmation : <span class="fW600 fS18 mL10">{{payOnConfirmation.formattedValue}}</span><br/>
			{{/if}}
		
			{{#if payAtLocation}}
				Pay at location : <span class="fW600 fS18 mL10">{{payAtLocation.formattedValue}}</span>
			{{/if}}
		{{/with}}
	</p>
{{/partial}}


${showFligthTemplateEnd}
	
	<div class="mB10 clearfix"></div>
			 
    <div class=" mT40 mB40 clearfix"> <span class="fL"> <span class="call_icon_mid mR10"></span> <span class="chart_icon_mid"></span> </span> <span class="fR"> <span class="email_icon_mid mR10"></span> <span class="download_icon_mid mR10"></span> <span class="print_icon_mid"></span> </span> </div>
   <%--  <order:peopleBooked/> --%>
  </div>
  