<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="white_content" id="compareHotels" style="display:none;">

</div>
<script id="templeateCompareHotel"  type="text/ractive">
<div class="white_content_inner_all container offWhiteBg" style="padding-top:20px;"> 
	<span class="closeBtn_popup fR" onclick="popupclose('compareHotels', 'fade')"></span>
<div class="clearfix">
  <h2 class="fL">Compare</h2>
  <span class="fR mT15"> 
  	<span class="print fL mR30 "></span> 
  	<span class="download mR30 fL "></span> 
  	<span class="share_icon fL mR30"></span>
  </span>
</div>
<!--=== Start Search Discover holiday ===-->
<div class="row">
  <div class="col_12 clearfix">
  	 <table class="miniTable" style="display:none">
      <tr>
        <td class="first w20pcnt">Property name</td>
        <td class="secTrdW">{{hotelList[0].propertyName}}</td>
        <td class="secTrdW">{{hotelList[1].propertyName}}</td>
        <td>{{hotelList[2].propertyName}}</td>
      </tr>
      <tr>
        <td class="first">Star rating</td>
        <td class="fS16"><span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullnoRatingstar_icon"></span> </td>
        <td class="fS16"><span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullnoRatingstar_icon"></span> </td>
        <td class="fS16"><span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullnoRatingstar_icon"></span></td>
      </tr>
      <tr>
        <td class="first"><span class="mT5 dB">Price</span></td>
        <td class="fS27 pT25"><div class="posR"><span class="rupee">Rs.</span>{{hotelList[0].price}}</div></td>
        <td class="fS27 pT25"><span class="rupee">Rs.</span>{{hotelList[1].price}}</td>
        <td class="fS27 pT25"><div class="posR"><span class="rupee">Rs.</span>{{hotelList[2].price}}</div></td>
      </tr>
    </table>
    <table class="compareTable w100pcnt">
      <tr>
        <th colspan="4" class="last fS16">Hotels details</th>
      </tr>
      <tr class="bdrBNone">
        <td class="first w20pcnt">&nbsp;</td>
        <td><span class="closeBtn_popup_small fR"></span></td>
        <td><span class="closeBtn_popup_small fR"></span></td>
        <td><span class="closeBtn_popup_small fR"></span></td>
      </tr>
      <tr>
        <td class="first">&nbsp;</td>
        <td><img src="${ezgImagesPath}{{hotelList[0].picture}}" alt="Compare1" class="w100pcnt" /></td>
        <td><img src="${ezgImagesPath}{{hotelList[1].picture}}" alt="Compare1" class="w100pcnt" /></td>
        <td><img src="${ezgImagesPath}{{hotelList[2].picture}}" alt="Compare1" class="w100pcnt" /></td>
      </tr>
      <tr>
        <td class="first">Property name</td>
        <td>{{hotelList[0].propertyName}}</td>
        <td>{{hotelList[1].propertyName}}</td>
        <td>{{hotelList[2].propertyName}}</td>
      </tr>
      <tr>
        <td class="first">Star rating</td>
        <td class="fS16"><span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullnoRatingstar_icon"></span></td>
        <td class="fS16"><span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullnoRatingstar_icon"></span></td>
        <td class="fS16"><span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullRatingstar_icon"></span> <span class="fullnoRatingstar_icon"></span></td>
      </tr>
	   <tr>
        <td class="first">Location</td>
        <td class="fS16">{{hotelList[0].location}}</td>
        <td class="fS16">{{hotelList[1].location}}</td>
        <td class="fS16">{{hotelList[2].location}}</td>
      </tr>
	   <tr>
        <td class="first">Trip advisor rating</td>
        <td><span class="mT5 clearfix dB fL"> <img alt="Trip Advisor" src="${ezgImagesPath}/common/ta_logo.png" class="wAuto fL mR5"> <span class="fullRatingstar_icon_circle"></span> <span class="fullRatingstar_icon_circle"></span> <span class="fullRatingstar_icon_circle"></span> <span class="fullRatingstar_icon_circle"></span> <span class="fullnoRatingstar_icon_circle"></span> </span></td>
        <td><span class="mT5 clearfix dB fL"> <img alt="Trip Advisor" src="${ezgImagesPath}/common/ta_logo.png" class="wAuto fL mR5"> <span class="fullRatingstar_icon_circle"></span> <span class="fullRatingstar_icon_circle"></span> <span class="fullRatingstar_icon_circle"></span> <span class="fullRatingstar_icon_circle"></span> <span class="fullnoRatingstar_icon_circle"></span> </span></td>
        <td><span class="mT5 clearfix dB fL"> <img alt="Trip Advisor" src="${ezgImagesPath}/common/ta_logo.png" class="wAuto fL mR5"> <span class="fullRatingstar_icon_circle"></span> <span class="fullRatingstar_icon_circle"></span> <span class="fullRatingstar_icon_circle"></span> <span class="fullRatingstar_icon_circle"></span> <span class="fullnoRatingstar_icon_circle"></span> </span></td>
      </tr>
	  <tr>
        <td class="first"><span class="mT5 dB">Price for 2 Adults,1 Child, 3 Nights</span></td>
        <td class="fS27 pT25"><div class="posR"><span class="rupee">Rs.</span>{{hotelList[0].price}}</div></td>
        <td class="fS27 pT25"><span class="rupee">Rs.</span>{{hotelList[1].price}}</td>
        <td class="fS27 pT25"><div class="posR"><span class="rupee">Rs.</span>{{hotelList[2].price}}</div></td>
      </tr>
     
      <tr>
        <td class="first">Check IN</td>
        <td>{{hotelList[0].checkInTime}}</td>
        <td>{{hotelList[1].checkInTime}}</td>
        <td>{{hotelList[2].checkInTime}}</td>
      </tr>
      <tr>
        <td class="first">Check OUT</td>
        <td>{{hotelList[0].checkOutTime}}</td>
        <td>{{hotelList[1].checkOutTime}}</td>
        <td>{{hotelList[2].checkOutTime}}</td>
      </tr>
      <tr>
        <td class="first">Total no. of rooms</td>
        <td>{{hotelList[0].noOfRooms}}</td>
        <td>{{hotelList[1].noOfRooms}}</td>
        <td>{{hotelList[2].noOfRooms}}</td>
      </tr>
      <tr>
        <td class="first">Floors</td>
        <td>{{hotelList[0].noOfFloors}}</td>
        <td>{{hotelList[1].noOfFloors}}</td>
        <td>{{hotelList[2].noOfFloors}}</td>
      </tr>
      <tr>
        <td class="first">Pay at hotel facility</td>
        <td>{{#if hotelList[0].payAtHotel}}<span class="tick_icon"></span>{{/if}}</td>
        <td>{{#if hotelList[1].payAtHotel}}<span class="tick_icon"></span>{{/if}}</td>
        <td>{{#if hotelList[2].payAtHotel}}<span class="tick_icon"></span>{{/if}}</td>
      </tr>
      <tr>
        <td class="first">Number of people who wishlisted this</td>
        <td><div class="mT5"> <span class="like fL"></span> <span class="like_number fL">230</span> <span class="fL mR2"><img src="${ezgImagesPath}/common/user1.png" alt="User 1" /></span> <span class="fL mR2"><img src="${ezgImagesPath}/common/user3.jpg" alt="User 2" /></span> <span class="fL"><img src="${ezgImagesPath}/common/user4.jpg" alt="User 3" /></span> </div></td>
        <td><div class="mT5"> <span class="like fL"></span> <span class="like_number fL">230</span> <span class="fL mR2"><img src="${ezgImagesPath}/common/user1.png" alt="User 1" /></span> <span class="fL mR2"><img src="${ezgImagesPath}/common/user3.jpg" alt="User 2" /></span> <span class="fL"><img src="${ezgImagesPath}/common/user4.jpg" alt="User 3" /></span> </div></td>
        <td><div class="mT5"> <span class="like fL"></span> <span class="like_number fL">230</span> <span class="fL mR2"><img src="${ezgImagesPath}/common/user1.png" alt="User 1" /></span> <span class="fL mR2"><img src="${ezgImagesPath}/common/user3.jpg" alt="User 2" /></span> <span class="fL"><img src="${ezgImagesPath}/common/user4.jpg" alt="User 3" /></span> </div></td>
      </tr>
      <tr class="bdrNone">
        <td class="last">&nbsp;</td>
        <td class="last">&nbsp;</td>
        <td class="last">&nbsp;</td>
        <td class="last">&nbsp;</td>
      </tr>
      <tr>
        <th colspan="4" class="last fS16">Distance to important landmarks</th>
      </tr>
      <tr>
		<td class="first ">Airport</td>
		<td>{{hotelList[0].airportDistance}} </td>
		<td class="">{{hotelList[1].airportDistance}} </td>
		<td class="">{{hotelList[2].airportDistance}} </td>
	  </tr>
	  <tr>
		<td class="first ">City center</td>
		<td class="">{{hotelList[0].cityCenterDistance}} </td>
		<td class="">{{hotelList[1].cityCenterDistance}} </td>
		<td class="">{{hotelList[2].cityCenterDistance}} </td>
	  </tr>
	  <tr>
		<td class="first ">Nearest local station </td>
		<td class="">{{hotelList[0].locationStationDistance}} </td>
		<td class="">{{hotelList[1].locationStationDistance}} </td>
		<td class="">{{hotelList[2].locationStationDistance}} </td>
	  </tr>
	  <tr>
		<td class="first ">Nearest railway station </td>
		<td class="">{{hotelList[0].railwayStationDistance}} </td>
		<td class="">{{hotelList[1].railwayStationDistance}} </td>
		<td class="">{{hotelList[2].railwayStationDistance}} </td>
	  </tr>
     
      <tr  class="bdrNone">
        <td class="last bdrNone">&nbsp;</td>
        <td class="last bdrNone">&nbsp;</td>
        <td class="last bdrNone">&nbsp;</td>
        <td class="last bdrNone">&nbsp;</td>
      </tr>
      <tr>
        <th colspan="4" class="last fS16">Amenities</th>
      </tr>
         <tr>
			<td class="first "><img src="${ezgImagesPath}/ac_icon.png" alt="Air conditioner" class="fL mR5" />Air conditioner</td>
			<td class="">{{#if hotelList[0].airCondition}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[1].airCondition}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[2].airCondition}}<span class="tick_icon"></span>{{/if}}</td>
		  </tr>
		  <tr>
			<td class="first "><img src="${ezgImagesPath}/bar_service.png" alt="Bar" title="Bar" class="fL mR5" />Bar</td>
			<td class="">{{#if hotelList[0].bar}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[1].bar}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[2].bar}}<span class="tick_icon"></span>{{/if}}</td>
		  </tr>
		  <tr>
			<td class="first "><img src="${ezgImagesPath}/wifi_icon.png" alt="Free wifi" title="Free wifi" class="fL mR5" />Free wifi</td>
			<td class="">{{#if hotelList[0].freewifi}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[1].freewifi}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[2].freewifi}}<span class="tick_icon"></span>{{/if}}</td>
		  </tr>
		  <tr>
			<td class="first "><img src="${ezgImagesPath}/check_in_service.png" alt="24 hr check-in" title="24 hr check-in" class="fL mR5" />24 hr check-in</td>
			<td class="">{{#if hotelList[0].checkIn}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[1].checkIn}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[2].checkIn}}<span class="tick_icon"></span>{{/if}}</td>
		  </tr>
		  <tr>
			<td class="first "><img src="${ezgImagesPath}/gym_icon.png" alt="Gym" title="Gym"  class="fL mR5" />Gym</td>
			<td class="">{{#if hotelList[0].gym}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[1].gym}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[2].gym}}<span class="tick_icon"></span>{{/if}}</td>
		  </tr>
		  <tr>
			<td class="first "><img src="${ezgImagesPath}/pool_service.png" alt="Pool" title="Pool" class="fL mR5" />Pool</td>
			<td class="">{{#if hotelList[0].pool}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[1].pool}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[2].pool}}<span class="tick_icon"></span>{{/if}}</td>
		  </tr>
		  <tr>
			<td class="first "><img src="${ezgImagesPath}/restaurant_icon.png" alt="Restaurant" title="Restaurant" class="fL mR5" />Restaurant</td>
			<td class="">{{#if hotelList[0].restaurant}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[1].restaurant}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[2].restaurant}}<span class="tick_icon"></span>{{/if}}</td>
		  </tr>
		  <tr>
			<td class="first "><img src="${ezgImagesPath}/room_service_icon.png" alt="24 hr room service" title="24 hr room service" class="fL mR5" />24 hr room service</td>
			<td class="">{{#if hotelList[0].rommService}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[1].rommService}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[2].rommService}}<span class="tick_icon"></span>{{/if}}</td>
		  </tr>
		  <tr>
			<td class="first "><img src="${ezgImagesPath}/laundry_service_icon.png" alt="Laundry service" title="Laundry service" class="fL mR5" />Laundry service</td>
			<td class="">{{#if hotelList[0].laundryService}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[1].laundryService}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[2].laundryService}}<span class="tick_icon"></span>{{/if}}</td>
		  </tr>
		  <tr>
			<td class="first "><img src="${ezgImagesPath}/business_center_icon.png" alt="Business Center" title="Business Center" class="fL mR5" />Business center</td>
			<td class="">{{#if hotelList[0].businessCenter}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[1].businessCenter}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[2].businessCenter}}<span class="tick_icon"></span>{{/if}}</td>
		  </tr>
		  <tr>
			<td class="first "><img src="${ezgImagesPath}/coffee_icon.png" alt="Coffee" title="Coffee" class="fL mR5" />Coffee shop</td>
			<td class="">{{#if hotelList[0].coffeeShop}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[1].coffeeShop}}<span class="tick_icon"></span>{{/if}}</td>
			<td class="">{{#if hotelList[2].coffeeShop}}<span class="tick_icon"></span>{{/if}}</td>
		  </tr>
      
      <tr  class="bdrNone">
        <td class="last bdrNone">&nbsp;</td>
        <td class="last bdrNone">&nbsp;</td>
        <td class="last bdrNone">&nbsp;</td>
        <td class="last bdrNone">&nbsp;</td>
      </tr>
      <tr>
        <th colspan="4" class="last fS16">&nbsp;</th>
      </tr>
      <tr>
        <td class="first">&nbsp;</td>
        <td><span class="clearfix mB10 dB"> <a href="javascript:void(0);" class="  button button-primary button-large tC  mB5 mR10 selectRoom">View details</a><input type="hidden" value={{hotelList[0].id}}/> </span><a href="javascript:void(0)">Send enquiry</a><span class="clearfix dB mT15 mL5"> <span class="empty_heart mR10"></span> <span class="share_icon "></span> </span></td>
        <td><span class="clearfix mB10 dB"> <a href="javascript:void(0);" class="  button button-primary button-large tC  mB5 mR10 selectRoom">View details</a><input type="hidden" value={{hotelList[1].id}}/>  </span><a href="javascript:void(0)">Send enquiry</a><span class="clearfix dB mT15 mL5"> <span class="empty_heart mR10"></span> <span class="share_icon "></span> </span></td>
        <td><span class="clearfix mB10 dB"> <a href="javascript:void(0);" class="  button button-primary button-large tC  mB5 mR10 selectRoom">View details</a><input type="hidden" value={{hotelList[2].id}}/>  </span><a href="javascript:void(0)">Send enquiry</a><span class="clearfix dB mT15 mL5"> <span class="empty_heart mR10"></span> <span class="share_icon "></span> </span></td>
      
      </tr>
      <!-- Table ends -->
    </table>
  </div>
</div>
</div>
</script>
<script>
var ractiveHotel = ractiveHotel ? ractiveHotel : {};
$(function(){
	ractiveHotel.compare= new Ractive({
		el:'#compareHotels',
		template:'#templeateCompareHotel',
		data:{
			'hotelList':<c:if test="${not empty hotelList}">${hotelList}</c:if><c:if test="${empty hotelList}">''</c:if>,
			
		}
	});
});
</script>