<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<div id="${ractiveHotelSearchContainer}">
</div>
<script id="${ractiveHotelSearchTemplate}" type="text/ractive">
<div class="globalSearchBG clearfix" id="${ractiveHotelSearchInstance}">
		<div class="clearfix" id="mainSearchWizard">
			<form method="post" action="/">
				<!-- Row 1 -->
				<ul class="searchFlight clearfix">
					<li class="next hotelDestination hotelD_home" id="hotelDestination">
						<label>Where do you want to go?</label> 
						<c:set var="autoSuggestKeypathName" value="topSearch.destination" scope="request" />
						<cms:pageSlot position="TopSearchBox" var="feature">
							<cms:component component="${feature}"/>
						</cms:pageSlot>
					</li>
					<li class="next hotelDestination hotelD_home">
						<span class="fL mR10 w45pcnt_imp" name="form1"> 
							<label>checkInDate</label> 
                            <input type="text"  data-instanceId="${ractiveHotelSearchInstance}" value="{{topSearch.checkInDate}}" class="w100pcnt dateField hotelCheckInDate" placeholder="dd/mm/yyyy" readonly="readonly" />
						</span> 
						<span class="fL w45pcnt_imp" name="form1"> 
							<label>checkOutDate</label> 
                            <input type="text"  data-instanceId="${ractiveHotelSearchInstance}" value="{{topSearch.checkOutDate}}" class="w100pcnt dateField hotelCheckOutDate" placeholder="dd/mm/yyyy" readonly="readonly"/>
						</span> 
						<span class="w100pcnt fL mT5"> 
							<input id="mydates1" type="checkbox" checked="{{topSearch.fixedDate}}" on-click="disabledDataInput()" /> 
							<label for="mydates1">My dates are not fixed</label>
						</span>
					</li>
					<li class="" style="width:250px;">
						<span class="mT20 dB clearfix">
							<span class="baggage_icon fL mR10"></span> 
							<span class="fL">{{topSearch.nights}}&nbsp;Nights</span>
							 
						</span>
					</li>
				</ul>
				<div id="globalSrcToggle">
					 <div>
						{{#topSearch.hotelSearchRooms.rooms:index}}
                		<ul class="row mB10 mT10 clearfix">
							{{#if index==0 }}
                 			<li id="singleRooms" class="col_2">
                    			<label>Rooms</label>
                    			<select class="w70pcnt" value="{{topSearch.hotelSearchRooms.rooms.length}}" on-change='changeRoomSetting()'>
                      				<option value="1">1</option>
                      				<option value="2">2</option>
                      				<option value="3">3</option>
                    			</select>
                  			</li>
							{{else}}
							<li class="col_2"></li>
							{{/if}}
                  			<li class="col_2 pR0 singleRoom fS14"> <span class="mT30 fL">Room {{index+1}}:</span> 
							</li>
                  			<li class="col_2 pL0 singleRoom">
                   				<label>Adult</label>
                    			<div class="adderOuter"> 
								<span class="control addMinControl minusControl cursor fW600" on-click="decreaseCountFor('topSearch.hotelSearchRooms.rooms','adultCount',index)">-</span> 
								<span class="control innerTxtControl fS14">{{topSearch.hotelSearchRooms.rooms[index].adultCount}}</span> 
								<span class="control addMinControl plusControl cursor fW600" on-click="increaseCountFor('topSearch.hotelSearchRooms.rooms','adultCount', index)">+</span> 
								</div>
                    			<input type="text" placeholder="1" maxlength="3" class="w100pcnt dN" />
                    			<span class="fS11 fL w100pcnt">12+ yrs</span> 
							</li>
                   			<li class="col_2 pL0 singleRoom">
                   				<label>Children</label>
                    			<div class="adderOuter"> 
								<span class="control addMinControl minusControl cursor fW600" on-click="decreaseCountFor('topSearch.hotelSearchRooms.rooms','children',index)">-</span> 
								<span class="control innerTxtControl fS14" id="hChild_1">{{topSearch.hotelSearchRooms.rooms[index].children.length}}</span> 
								<span class="control addMinControl plusControl cursor fW600" on-click="increaseCountFor('topSearch.hotelSearchRooms.rooms','children', index)">+</span> 
								</div>
                    			<input type="text" placeholder="0"  maxlength="3" class="w100pcnt dN"/>
                    			<span class="fS11 fL w100pcnt">2 - 12 yrs</span> 
							</li>
                  		</ul>
						{{/}}
              		</div>
					<div class="flightOption w100pcnt">
						<p class="multipleOption mB10">
							<a href="javascript:void(0)" id="moreHotelOpton1" class="moreHotelOpton1">
								<span id="plusMinusHotel1" class="plusMinus1">+</span> Hotel options </a> (price, rating,accommodation type)
						</p>
						<div class="dN hotelOptionsSearchPanel" id="hotelOptionsSearchPanel">
							<ul class="col_12 clearfix mT10">
								<li class="col_3"><label>Price range</label>
									<div class="fL mR10" style="width:50%;">
										<div decorator='slider:"topSearch.priceFrom","topSearch.priceTo","","",""'></div>
					 					<br>
					 					<span>{{topSearch.priceFrom}}</span>-<span>{{topSearch.priceTo}}</span>
									</div> 
									<select class="fL">
										<option value="Rs.">Rs.</option>
										<option value="$">$</option>
									</select>
								</li>
								<li class="col_3"><label>Star rating</label>
									<ul>
										{{#topSearch.starRateForView}}
										<li class="fL mR5 mB5 stackChkBox">
											<input type="checkbox" name="{{topSearch.starRate}}" value="{{.}}"/> 
											<label>{{.}}</label>
										</li>
										{{/}}
									</ul>
								</li>
								<li class="col_3"><label>Accommodation type</label>
									<dl class="dropdown1">
										<dt>
											<a href="javascript:void(0);" class="grey_border fL" style="width: 100%">
												 <span class="hida">All </span>
											</a> 
												 <span class="downArrow_icon pD5 fL mLN20  mT15 pD15"></span>
										</dt>
										<dd>
											<div class="mutliSelect1">
												<ul class="w100pcnt">
													<li><label>Select property type</label></li>
													{{#topSearch.accTypeForView}}
														<li>
															<input type="checkbox" name="{{topSearch.accType}}" value="{{.}}"/>
															<label>{{.}}</label>
														</li>
													{{/}}
												</ul>
											</div>
										</dd>
									</dl>
								</li>
								<li class="col_3">
									<p class="multiSel cB mT10"></p>
								</li>
							</ul>
						</div>
					</div>
					<div class="cB"></div>
					<br class="cB" />
              		<a href="javascript:void(0);" on-click="submitForm()" class=" button button-primary fR">Search</a> 
				</div>
			</form>
		</div>
</div>
</script>
<script>
var ${ractiveHotelSearchInstance} = ${ractiveHotelSearchInstance} ? ${ractiveHotelSearchInstance} : {};
$(function() {
${ractiveHotelSearchInstance}.search= new Ractive({
	  el: '#${ractiveHotelSearchContainer}',
	  template: '#${ractiveHotelSearchTemplate}',
	  'oninit':function(){
			if(this.get('history.topSearchViewModel')){
				var topSearchViewModel =JSON.parse(JSON.stringify(this.get('history.topSearchViewModel')));
				var newRoomFuc = this.get('topSearch.hotelSearchRooms.newRoom');
				this.set('topSearch',topSearchViewModel);
				this.set('topSearch.hotelSearchRooms.newRoom',newRoomFuc);
			}else{
				this.set('topSearch.hotelSearchRooms.rooms', [this.get('topSearch.hotelSearchRooms.newRoom')()]);
				var today = new Date();
				this.set('topSearch.checkInDate',addDays(today,1));
				this.set('topSearch.checkOutDate',addDays(today,2));
			}
			var nights = this.diffDays(new Date(this.get('topSearch.checkInDate')),new Date(this.get('topSearch.checkOutDate')));
			this.set('night',nights);
	  },
	  'diffDays': function (d1, d2) { 
		  return Math.ceil(Math.abs(d2.getTime() - d1.getTime()) / (1000 * 3600 * 24)); 
		  },
	  data: { 
		  'history':{
			  'topSearchViewModel':<c:if test="${not empty topSearchViewModel}">${topSearchViewModel}</c:if><c:if test="${empty topSearchViewModel}">''</c:if>,
			  'topSearchDataModel':<c:if test="${not empty topSearchDataModel}">${topSearchDataModel}</c:if><c:if test="${empty topSearchDataModel}">''</c:if>
		  },
		  'topSearch':{
			  'destination':'',
			  'checkInDate':'',
			  'checkOutDate':'',
			  'priceFrom':'0',
			  'priceTo':'10000',
			  'fixedDate':false,
			  'noOfRooms':'',
			  'nights':'0',
			  'hotelSearchRooms':{
				  'newRoom':function(){
					return {
						'adultCount':1,
						'children':[],
						'infants':[]
					};  
				  },
				  'rooms':[]
			  },
			  'starRate':[],
		      'starRateForView':[5,4,3,2,1],
		      'accType':[],
		      'accTypeForView':['Bed and Breakfast','Boutique Hotel','Guest House','Heritage Hotel','Home Stay','Resort','Serviced Apartments']
		  }
	  },
	  'generateDataModelFromViewModel':function(){
			var ts =   this.get('topSearch');
			var rooms =[];
			$(this.get('topSearch.hotelSearchRooms.rooms')).each(function(i,v){
				var room = { adultCount: v.adultCount, children: v.children ,infants : v.infants};
				rooms.push(room);
			});
			var basicData = {
					destination:ts.destination,
					checkInDate:ts.checkInDate,
					checkOutDate:ts.checkOutDate,
					fixedDate:ts.fixedDate,
					nights:ts.nights,
					noOfRooms:ts.hotelSearchRooms.rooms.length,
					starRate:ts.starRate,
					accType:ts.accType,
					hotelSearchRooms:rooms
					};
			return basicData;
	  },
	  'decreaseCountFor':function(roomsKeyPath,target,index){
		  this.cnk.roomsService.decreaseCountFor.call(this,roomsKeyPath,target,index);
	  },
	  'increaseCountFor':function(roomsKeyPath,target,index){
		  this.cnk.roomsService.increaseCountFor.call(this,roomsKeyPath,target,index);
	  },
	  'changeRoomSetting':function(){
		  var roomsKeyPath = "topSearch.hotelSearchRooms.rooms";
		  var newRoomKeyPath = "topSearch.hotelSearchRooms.newRoom";
		  this.cnk.roomsService.changeRoomSetting.call(this,roomsKeyPath,newRoomKeyPath);
	  },
	  'disabledDataInput':function(){
		  this.updateModel();
		  if(this.el.id=='divTopSearchHotelSearch'){
			  if(this.get('topSearch.fixedDate')){
				  $(".hotelCheckInDate:first").attr('disabled',"true");
				  $(".hotelCheckOutDate:first").attr('disabled',"true");
			  }else{
				  $(".hotelCheckInDate:first").removeAttr('disabled');
				  $(".hotelCheckOutDate:first").removeAttr('disabled');
			  } 
		  }else{
			  if(this.get('topSearch.fixedDate')){
				  $(".hotelCheckInDate:last").attr('disabled',"true");
				  $(".hotelCheckOutDate:last").attr('disabled',"true");
			  }else{
				  $(".hotelCheckInDate:last").removeAttr('disabled');
				  $(".hotelCheckOutDate:last").removeAttr('disabled');
			  } 
		  }
	  },
	  'submitForm': function () {
		  ${ractiveHotelSearchInstance}.submitForm('topSearch');
	  }
	  
});
${ractiveHotelSearchInstance}.submitForm = function (eventSource,viewType) {
	var searchCtx = this.search;
	var facetCtx = this.facet;
	var filterSearchCtx = this.filterSearch;
	
	if (searchCtx)	searchCtx.updateModel();
	if (facetCtx) facetCtx.updateModel();
	if (filterSearchCtx) filterSearchCtx.updateModel();
	
	var topSearchViewModel = null;//old unchanged data
	var topSearchDataModel = null;//changed data
	var facetViewModel = null;//facet data
	var filterSearchViewModel = null;
	var sortedByCtx = null;
	var selectedCode = null;
	var sortConditionList = null;
	var isAjax = false;
	var method = "post";
	var ajaxCallback;
	var url = '${encodedContextPath}/search/hotel/'+eventSource;
	
	if(eventSource == 'facetSearch'){
		topSearchViewModel = JSON.stringify(searchCtx.get("history.topSearchViewModel"));
		topSearchDataModel = JSON.stringify(searchCtx.get("history.topSearchDataModel"));
		facetViewModel = facetCtx ? JSON.stringify(facetCtx.get("facetSearch")) : '';
		filterSearchCtx.set("filterSearch",facetCtx.get("facetSearch"));
		isAjax= true;
		url=url+"/ajax";
	}else if(eventSource == 'filterSearch'){
		topSearchViewModel = JSON.stringify(searchCtx.get("history.topSearchViewModel"));
		topSearchDataModel = JSON.stringify(searchCtx.get("history.topSearchDataModel"));
		filterSearchViewModel = filterSearchCtx?JSON.stringify(filterSearchCtx.get("filterSearch")) : '';
		facetCtx.set("facetSearch",filterSearchCtx.get("filterSearch"));
		isAjax= true;
		url=url+"/ajax";
	}
	else{
		topSearchViewModel = JSON.stringify(searchCtx.get('topSearch'));
		topSearchDataModel = JSON.stringify(searchCtx.generateDataModelFromViewModel());
	}
	if(viewType=='grid'){
		sortedByCtx = this.gridsortBy;
	}
	if(viewType=='list'){
		sortedByCtx = this.listsortBy;
	}
	if(sortedByCtx){
		sortedByCtx.updateModel();
		selectedCode = sortedByCtx.get("selectedCode");
		sortConditionList = JSON.stringify(sortedByCtx.get('sortConditionList'));
		this.gridsortBy.set("selectedCode",selectedCode);
		this.listsortBy.set("selectedCode",selectedCode);
	}
    var formElementExpressions = '';
	$(['facetViewModel','topSearchViewModel','topSearchDataModel','filterSearchViewModel','selectedCode','sortConditionList','CSRFToken']).each (function (i, e) {
	formElementExpressions += '<input name="#" type="hide" />'.replace('#', e);
	});
	
	var formExpression = '<form action="'+url+'" method="'+method+'"></form>';
	
	$form = $(formExpression).append($(formElementExpressions));
	$form.find('input[name=facetViewModel]').val(facetViewModel);
	$form.find('input[name=topSearchViewModel]').val(topSearchViewModel);
	$form.find('input[name=topSearchDataModel]').val(topSearchDataModel);
	$form.find('input[name=filterSearchViewModel]').val(filterSearchViewModel);
	$form.find('input[name=selectedCode]').val(selectedCode);
	$form.find('input[name=sortConditionList]').val(sortConditionList);
	$form.find('input[name=CSRFToken]').val(ACC.config.CSRFToken);
	if (isAjax) {
		$.ajax({
	           type: method,
	           url: url,
	           data: $form.serialize(),
	           success: function(data)
	           {
	        	   ${ractiveHotelSearchInstance}.gridresult.refresh(data);
	        	   ${ractiveHotelSearchInstance}.listresult.refresh(data);
	        	   ${ractiveHotelSearchInstance}.filterSearch.refresh(data);
	        	   ${ractiveHotelSearchInstance}.recommendgridResult.refresh(data);
	        	   ${ractiveHotelSearchInstance}.recommendlistResult.refresh(data);
	        	   popupclose('filterpop', 'fade');
	           }
		});
	} else {
		validateInputsBeforeSubmit(function(){
			$form.appendTo('body').submit();
		});
	}
	};
	Ractive.defaults.sort = function (viewType,sortedItem){
		if(sortedItem){
			ractiveTopHotel.gridsortBy.set("selectedCode",sortedItem);
		}
		ractiveTopHotel.submitForm("facetSearch",viewType);
	}
	Ractive.defaults.switchShowPrice = function (showType,viewType){
		Ractive.defaults.sort(viewType);
		if(showType=='avg'){
			$(".avg").addClass("showPriceSel");
			$(".tol").removeClass("showPriceSel");
			$(".avgPrice").show();
			$(".totalPrice").hide();
		}else{
			$(".avg").removeClass("showPriceSel");
			$(".tol").addClass("showPriceSel");
			$(".avgPrice").hide();
			$(".totalPrice").show();
		}
	}
	
	var instanceIds = ["ractiveTopHotel","ractivePopupHotel"];
	if($().datepicker){
		for(var i=0;i<instanceIds.length;i++){
			var currentInstanceId = instanceIds[i];
			$("#"+currentInstanceId+" .hotelCheckInDate").datepicker({
				numberOfMonths:2,
				minDate: 0,
				dateFormat: "yy-mm-dd",
				onSelect: function(dateText){
					  $(this).css("color","#333333");
					  var minDate = $(this).datepicker('getDate');
					  currentInstanceId = $(this).data("instanceid");
					  console.log(currentInstanceId)
					  $("#"+currentInstanceId+" .hotelCheckOutDate").datepicker("change", { minDate: minDate });
				   }
			   }); 
			$("#"+currentInstanceId+" .hotelCheckOutDate").datepicker({
				numberOfMonths:2,
				minDate: 0,
				dateFormat: "yy-mm-dd",
				onSelect: function(dateText){
					 $(this).css("color","#333333");
					 var context =  ${ractiveHotelSearchInstance}.search;
					 context.updateModel();
					  var checkinDate =   context.get("topSearch.checkInDate");
					  var checkoutDate =  context.get("topSearch.checkOutDate");
					  if(checkinDate){
						  var diffNights = context.diffDays(new Date(checkinDate),new Date(checkoutDate));
						  context.set('topSearch.nights',diffNights);
						  $("#night").val(diffNights);
					  }
					  currentInstanceId = $(this).data("instanceid");
					  $("#"+currentInstanceId+" .hotelCheckInDate").datepicker("change", { maxDate: checkoutDate });
				   }
			   }); 
		}
	}
		
	setupInputsBlurEventForSearchPage('hotelDestination');
});

function validateInputsBeforeSubmit(callback){
	var isPassValidate = true;
	isPassValidate = !validateInputEmptyValue('li#hotelDestination>div>input',true);
	if(isPassValidate){
		callback();
	}
}

</script>
<c:set var="ractiveHotelSearchContainer" value="" scope="request" />
<c:set var="ractiveHotelSearchTemplate" value="" scope="request" />
<c:set var="ractiveHotelSearchInstance" value="" scope="request" /> 