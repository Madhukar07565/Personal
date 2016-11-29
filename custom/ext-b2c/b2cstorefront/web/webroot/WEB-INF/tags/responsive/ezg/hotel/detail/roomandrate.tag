<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/ezg/cart" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ attribute name="hotelData" required="true" type="com.cnk.travelogix.common.facades.product.data.hotel.HotelData" %>
<%@ attribute name="hotelSearchData" required="true" type="com.cnk.travelogix.common.facades.product.data.HotelSearchData" %>

<input type="hidden" id="widgetAndFacetSearchJson" value="${fn:escapeXml(widgetAndFacetSearchJson)}"/>
<article class="tabContainer clearfix" id="roomsAndRates">
			<!--  Top results filter begins  -->
			<c:forEach items="${hotelSearchData.hotelSearchRooms}" varStatus="status"  var="room">
				<ul class="clearfix pT20 pB20 h_tab_ser" >
					<li class="col_2 col_sm_6">
						<c:if test="${status.index==0}">
							<label>Check in</label> 
							<span class="fW400"><fmt:formatDate value="${hotelSearchData.checkInDate}"  pattern="yyyy-MM-dd" /></span>
						</c:if>
						
					</li>
					<li class="col_2 col_sm_6">
						<c:if test="${status.index==0}">
						<label>Check out</label> 
						<span class="fW400"><fmt:formatDate value="${hotelSearchData.checkOutDate}"  pattern="yyyy-MM-dd" /></span>
						</c:if>
					</li>
					<li class="number col_2">
						<c:if test="${status.index==0}">
						<span class="mT20 dB clearfix">
							<span class="baggage_icon fL mR10">
							</span> <span class="fL">${hotelSearchData.nights} Nights</span>
						</span>
						</c:if>
					</li>
					<li class="col_1_half col_sm_2 pR0 mT20_768">
						<c:if test="${status.index==0}">
						<label>No of Rooms</label>
						<span class="fW400">${hotelSearchData.noOfRooms}</span>
						</c:if>
					</li>
					<li class="col_1 col_sm_2 pR0 mT20_768">
						<label>&nbsp;</label> 
						<span class="fW400">Room${(status.index+1)}:</span>
					</li>
					<li class="col_1 col_sm_2 pR0 mT20_768">
						<label>Adults</label> 
						<span class="fW400">${room.adultCount}</span>
					</li>
					<li class="col_1 col_sm_3 pR0 mT20_768">
						<label>Children</label>
						<span class="fW400">${fn:length(room.children)}</span>
					</li>
					<c:if test="${status.index==(hotelSearchData.noOfRooms-1)}">
					<li class="col_1_half col_sm_3 pR0 mT20_768">
						<a href="javascript:void(0);" class="button button-primary button-small mT20 fS12" id="modifybtn">Modify Search</a>
					</li>
					</c:if>
				</ul>
			</c:forEach>
			
			
			<div class="clearfix dN" id="hotelDetailModifySearch">
			</div>
			<!--  Top results filter ends  -->
			<ul>
				<c:forEach items="${hotelData.rooms}" var="hotelRoom">
					<li class="clearfix pB20 pT20 posR">
						<h5 class="col_12 mB10">
							<strong>${hotelRoom.roomType}</strong>-${hotelRoom.roomOccupacy} 
						</h5> 
						<span class="col_12 mB5 dB">
							<img  src="${ezgImagesPath}/wifi_icon.png" class="valign mR10"> 
							<c:forEach items="${hotelRoom.roomAmenities }" var="amenity">
								<img src="${ezgImagesPath}${amenity.name}" class="valign mR10"/>
							</c:forEach>
						</span> 
						<span class="saveTag fR saveRps">${hotelRoom.roomOffer.title}
							<span class="tagBtm fR"></span>
						</span>

						<div id="hotelSlideshow" class="col_4 mB10 clearfix">
							<c:forEach items="${hotelRoom.pictures}" var="picture">
								<div>
									<img src="${ezgImagesPath}${picture}"/>
								</div>
							</c:forEach>
						</div> 
						
						<span class="col_8 pL0"> 
							<c:forEach items="${hotelRoom.roomDetails}" var="roomDetail">
								<span class="w100pcnt clearfix bdrBtmLighterGrey pB10 dB" style="margin-top:10px;"> 
									<span class="clearfix col_4">
										<span class="fL">${roomDetail.option}<br /> 
											<a href="javascript:void(0)" class="fS12">Pricing &amp; Room Info</a>
										</span> 
										<span class="countNotification notifyColor"> ${roomDetail.numLeft} left </span>
									</span> 
									<span class="col_4"> 
										<span class="fS22 dB">
											<span class="">${roomDetail.showPrice.currency}</span>${roomDetail.showPrice.avgPrice}
										</span>
										<span class="faq_sml_icon fL mT5 mL10" style="margin-top: -23px !important; float: right; margin-right: 108px;"></span>
										<span class="fS11 mB20 dB">Average / Night</span> 
										<c:if test="${roomDetail.payAtHotel }">
											<span class="fcGrn">Pay at hotel</span> 
										</c:if>
										<c:if test="${roomDetail.freeCancelation }">
											<a href="javascript:void(0)" class="dB">FREE Cancellation <br /> 
												<span class="fS12">${roomDetail.cancelDate}</span>
											</a>
										</c:if>
									</span> 
									<span class="col_4 pL0 pR0"> 
										<cart:addhoteltocart hotelRoom="${roomDetail}">
											<select class="fL mR20" name="numberOfRoom">
												<option>1</option>
												<option>2</option>
												<option>3</option>
											</select> 
											<a id="bookHotelId" href="javascript:void(0)" class="button button-primary button-small fL">Book</a>
										</cart:addhoteltocart>
										<br class="cB" />
									</span>
								</span> 
							</c:forEach>
						</span>
					</li>
				</c:forEach>
			</ul>
		</article>
		<script id="templateHotelDetailModifySearch" type="text/ractive">
				<ul class="clearfix pT20 pB20">
					<li class="col_2_half col_sm_4"><label>Check in</label> <input
						type="text" id="checkinDate" placeholder="dd/mm/yyyy" value="{{mdfSearch.checkInDate}}"
						class="dateField mB10" readonly /></li>
					<li class="col_2_half col_sm_4"><label>Check out</label> <input
						type="text" id="checkoutDate" placeholder="dd/mm/yyyy" value="{{mdfSearch.checkOutDate}}"
						class="dateField mB10" readonly /></li>
					<li class="number"><span class="mT20 dB clearfix"> <span
							class="baggage_icon fL mR10"></span> <span class="fL">{{mdfSearch.nights}}
								Nights</span>
					</span></li>
				</ul>
				{{#mdfSearch.hotelSearchRooms.rooms:index}}
				<ul class="clearfix">
					{{#if index==0 }}
					<li class="col_1 pR0"><label>Rooms</label> 
						<select id="noOfRooms" value="{{mdfSearch.hotelSearchRooms.rooms.length}}" on-change='changeRoomSetting()'>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
						</select>
					</li>
					{{else}}
					<li class="col_1 pR0"></li>
					{{/if}}
					<li class="col_2 pR0"><span class="mT30 fL">Room {{index+1}}:</span></li>
					<li class="col_2 pL0"><label>Adult</label>
						<div class="adderOuter">
							<span class="control addMinControl minusControl cursor fW600" on-click="decreaseCountFor('mdfSearch.hotelSearchRooms.rooms','adultCount',index)">-</span>
							<span class="control innerTxtControl">{{mdfSearch.hotelSearchRooms.rooms[index].adultCount}}</span> 
							<span class="control addMinControl plusControl cursor fW600" on-click="increaseCountFor('mdfSearch.hotelSearchRooms.rooms','adultCount', index)">+</span>
						</div> 
						<input type="text" placeholder="1" maxlength="3" class="w100pcnt dN"> 
						<span class="fS11 fL w100pcnt">12+ yrs</span>
					</li>
					<li class="col_2 pL0 "><label>Children</label>
						<div class="adderOuter">
							<span class="control addMinControl minusControl cursor fW600" on-click="decreaseCountFor('mdfSearch.hotelSearchRooms.rooms','children',index)">-</span> 
							<span class="control innerTxtControl">{{mdfSearch.hotelSearchRooms.rooms[index].children.length}}</span> 
							<span class="control addMinControl plusControl cursor fW600" on-click="increaseCountFor('mdfSearch.hotelSearchRooms.rooms','children',index)">+</span>
						</div> 
						<input type="text" placeholder="0" maxlength="3" class="w100pcnt dN"> 
						<span class="fS11 fL w100pcnt">2 - 12 yrs</span>
					</li>
				</ul>
			
				<ul class="col_5 pR0 pL0"></ul>
				<ul class="col_7 mT10 pR0 pL0 singleRoom clearfix">
				{{#children:childIndex}}
					<li class="col_2 pR0"><label>Child {{1 + childIndex}}</label>
              		<select value="{{children[childIndex]}}" class="w75">
						<option value="-1">Age</option>
              			<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
              			<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
             			<option value="12">12</option>
					</select>
					</li>
				{{/children}}
				</ul>
				{{/}}
				<p class="clearfix">
					<a href="javascript:void(0)" class="button button-primary button-small fR mR10" on-click="submitForm()">Search</a>
				</p>
</script>
<script>
var ractiveHotel = ractiveHotel ? ractiveHotel : {};
//$(function() {
ractiveHotel.mdfSearch= new Ractive({
	  el: '#hotelDetailModifySearch',
	  template: '#templateHotelDetailModifySearch',
	  'oninit':function(){
		 var initMdySearchData =JSON.parse(this.get('initData.initMdySearchData'));
		 this.set('mdfSearch.checkInDate',initMdySearchData.checkInDate);
		 this.set('mdfSearch.checkOutDate',initMdySearchData.checkOutDate);
		 this.set('mdfSearch.nights',initMdySearchData.nights);
		 this.set('mdfSearch.hotelSearchRooms.rooms',initMdySearchData.hotelSearchRooms);
	  },
	  data:{
		 'initData':{
			 'initMdySearchData':'${mdfSearchDataModel}'
		 },
		 'mdfSearch':{
			  'checkInDate':'',
			  'checkOutDate':'',
			  'nights':'0',
			  'productId':'${hotelSearchData.productId}',
			  'hotelSearchRooms':{
				  'newRoom':function(){
					return {
						'adultCount':1,
						'children':[],
						'infants':[]
					};  
				  },
				  'rooms':[]
			  }
		  }
	  	},
		  'decreaseCountFor':function(roomsKeyPath,target,index){
			  this.cnk.roomsService.decreaseCountFor.call(this,roomsKeyPath,target,index);
		  },
		  'increaseCountFor':function(roomsKeyPath,target,index){
			  this.cnk.roomsService.increaseCountFor.call(this,roomsKeyPath,target,index);
		  },
		  'changeRoomSetting':function(){
			  var roomsKeyPath = "mdfSearch.hotelSearchRooms.rooms";
			  var newRoomKeyPath = "mdfSearch.hotelSearchRooms.newRoom";
			  this.cnk.roomsService.changeRoomSetting.call(this,roomsKeyPath,newRoomKeyPath);
		  },
		  'diffDays': function (d1, d2) { 
			  return Math.ceil(Math.abs(d2.getTime() - d1.getTime()) / (1000 * 3600 * 24)); 
			  },
	  	 'submitForm': function () {
			  ractiveHotel.submitForm();
		  }
	});
	ractiveHotel.submitForm = function () {
		var mdfSearch = this.mdfSearch;
		var rooms = mdfSearch.get('mdfSearch.hotelSearchRooms.rooms');
		var productId = mdfSearch.get('mdfSearch.productId');
		mdfSearch.set('mdfSearch.hotelSearchRooms',rooms);
		mdfSearch.updateModel();
		mdfSearchDataModel = JSON.stringify(mdfSearch.get('mdfSearch'));
		var formElementExpressions = '';
		$(['widgetAndFacetSearchJson','mdfSearchDataModel','CSRFToken']).each (function (i, e) {
		formElementExpressions += '<input name="#" type="hide" />'.replace('#', e);
		});
		var formExpression = '<form action="${encodedContextPath}/p/hotel/'+productId+'/query" method="post"></form>';
		$form = $(formExpression).append($(formElementExpressions));
		$form.find('input[name=widgetAndFacetSearchJson]').val($('#widgetAndFacetSearchJson').val());
		$form.find('input[name=mdfSearchDataModel]').val(mdfSearchDataModel);
		$form.find('input[name=CSRFToken]').val(ACC.config.CSRFToken);
		$form.appendTo('body').submit();
	}
	$(function(){
		$("#checkinDate").datepicker({
			numberOfMonths:2,
			minDate: 0,
			dateFormat: "yy-mm-dd",
			onSelect: function(e){
				  $(this).css("color","#333333");
				  var minDate = $(this).datepicker('getDate');
				  currentInstanceId = $(this).data("instanceid");
				  $("#checkoutDate").datepicker("change", { minDate: minDate });
			   }
		   }); 
		$("#checkoutDate").datepicker({
			numberOfMonths:2,
			minDate: 0,
			dateFormat: "yy-mm-dd",
			onSelect: function(e){
				 $(this).css("color","#333333");
				 var context =  ractiveHotel.mdfSearch;
				 context.updateModel();
				  var checkinDate =   context.get("mdfSearch.checkInDate");
				  var checkoutDate =  context.get("mdfSearch.checkOutDate");
				  if(checkinDate){
					  var diffNights = context.diffDays(new Date(checkinDate),new Date(checkoutDate));
					  context.set('mdfSearch.nights',diffNights);
				  }
				  currentInstanceId = $(this).data("instanceid");
				  $("#checkinDate").datepicker("change", { maxDate: checkoutDate });
			   }
		   }); 
	});
//});
</script>