<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%-- template container --%>
<div id="${ractiveFlightSearchContainer}"></div>

<script id="${ractiveFlightSearchTemplate}" type="text/ractive">
    <div class="globalSearchBG clearfix" id="${ractiveFlightSearchInstance}">
        <div class="clearfix" id="mainSearchWizard">
          <form method="post" action="/">
            <!-- Search options for one-way / two-way / multicity START -->
			<ul class="searchFlightWay clearfix">
              <li>
                <input type="radio" value="oneway" name="{{radioSearchFlight}}"/>
                <label for="oneway">One way</label>
              </li>
              <li>
                <input type="radio" value="twoway" name="{{radioSearchFlight}}"/>
                <label for="return">Return</label>
              </li>
              <li>
                <input type="radio" value="multicity" name="{{radioSearchFlight}}"/>
                <label for="multicity">Multi city</label>
              </li>
            </ul>
            <!-- Search options for one-way / two-way / multicity END -->

    <!-- First line of the search parameter -->
								<div >
									<!-- flight trip of one-way or two-way START -->
								    <ul class="searchFlight clearfix">

						              <li id="searchFlightFrom0">
                                        <label>Starting From</label>
										<c:set var="autoSuggestKeypathName" value="twoway.from" scope="request" />
										<cms:pageSlot position="FlightSearchFromSection" var="feature">
											<cms:component component="${feature}"/>
										</cms:pageSlot>
                                      </li>
                                      <li class="next" id="searchFlightTo0">
                                        <label>Going to</label>
										<c:set var="autoSuggestKeypathName" value="twoway.to" scope="request" />
										<cms:pageSlot position="FlightSearchToSection" var="feature">
											<cms:component component="${feature}"/>
										</cms:pageSlot>
                                      </li>
                                      <li>
                                        <label>Departure</label>
                                        <input type="text"  data-instanceId="${ractiveFlightSearchInstance}" value="{{twoway.startTime}}" class="w100pcnt dateField flightDepartureTime" placeholder="dd/mm/yyyy" readonly="readonly" />
									</li>
									
                                      <li class="next" style="visibility : {{radioSearchFlight == 'twoway' ? 'visible' : 'hidden'}}" id="returnFlightContainer">
                                        <label>Return</label>
                  						<input type="text" data-instanceId="${ractiveFlightSearchInstance}" value="{{twoway.returnTime}}" class="w100pcnt dateField flightReturnTime" placeholder="dd/mm/yyyy" readonly="readonly" />
									 </li>
								
                                      <li class="number">
                                        <label>Adult</label>
                                        <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" on-click="decreaseCount('numberOfAdult')">-</span> <span class="control innerTxtControl" id="AdultNumber">{{numberOfAdult}}</span> <span class="control addMinControl plusControl cursor fW600" on-click="increaseCount('numberOfAdult')">+</span> </div><span class="fS11 fL w100pcnt">12+ yrs</span>
                                      </li>
                                      <li class="number">
                                        <label>Child</label>
                                        <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" on-click="decreaseCount('numberOfChild')">-</span> <span class="control innerTxtControl" id="ChildNumber">{{numberOfChild}}</span> <span class="control addMinControl plusControl cursor fW600" on-click="increaseCount('numberOfChild')">+</span> </div><span class="fS11 fL w100pcnt">2 - 12 yrs</span>
                                      </li>
                                      <li class="number">
                                        <label>Infant</label>
                                        <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" on-click="decreaseCount('numberOfInfant')">-</span> <span class="control innerTxtControl" id="InfantNumber">{{numberOfInfant}}</span> <span class="control addMinControl plusControl cursor fW600" on-click="increaseCount('numberOfInfant')">+</span> </div><span class="fS11 fL w100pcnt">0 - 2 yrs</span>
                                      </li>
									</ul>
									<!-- flight trip of one-way or two-way END -->
									
								</div>

	<!-- MULTI-CITY -->
				<div class="{{radioSearchFlight == 'multicity' ? '' : 'dN'}}">
					{{#multicity.trips:tripIndex}}
						 <ul class="searchFlight clearfix" id="multiwaySearchParameters3">
                			<li id="searchFlightFrom{{tripIndex + 1}}">
                 				 <label>Starting From</label>
                 				<%-- <input type="text" id="autosuggest7"  value="{{from}}" class=" w100pcnt" placeholder="Mumbai"/>--%>
									<c:set var="autoSuggestKeypathName" value="from" scope="request" />
									<cms:pageSlot position="FlightSearchFromSection" var="feature">
										<cms:component component="${feature}"/>
									</cms:pageSlot>
                			</li>
                			<li class="next" id="searchFlightTo{{tripIndex + 1}}">
                 				 <label>Going to</label>
									<c:set var="autoSuggestKeypathName" value="to" scope="request" />
									<cms:pageSlot position="FlightSearchToSection" var="feature">
										<cms:component component="${feature}"/>
									</cms:pageSlot>
                 				<%-- <input type="text" id="autosuggest8" value="{{to}}" class=" w100pcnt" placeholder="Delhi"/>--%>
                			</li>
                			<li>
                  				<label>Departure</label>
                  				<input type="text" decorator="datepicker"  value="{{startTime}}" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
                			</li>
                			<li class="closeMultipleWay {{(tripIndex > 0) ? '' : 'dN'}}">
                  				<div on-click="removeFlight(tripIndex)" class="close_multicity_panel mL20 fL mT5"></div>
                			</li>
             			 </ul>
								
					{{/multicity.trips}}
				</div>

<!-- common settings for flight START -->
            <div id="globalSrcToggle">
              		<div class="clearfix {{radioSearchFlight != 'multicity' ? 'dN' : ''}} mB15 mT10 w9pcnt" on-click="pushNewFlight()"> <span class="addIcon fL"></span> <span class="fL mT10 cursor">Add city</span> </div>
                     <div class="cB"></div>

<!-- Flight option start -->

			<div class="flightOption w100pcnt">
                <p class="multipleOption mB10"><a href="javascript:void(0)" id="moreFlightOpton1" class="moreFlightOpton1">
				<span id="plusMinus1" class="plusMinus1">+</span> Flight options</a> (class, airline, stops, refunds) </p>
                <div class="dN flightOptionsSearchPanel" id="flightOptionsSearchPanel">
                  <ul class="col_12 pL0 pR0 clearfix mT10">
                    <li class="col_2_half pL0">
                      <label>Class</label>
                      <select class="w100pcnt" id= "selectClass" value="{{flightClass}}" on-change="changeClass()"> 
                        <option value="">Select</option>
                        <option value="Economy">Economy</option>
                        <option value="Business">Business</option>
                      </select>
                    </li>
                    <li class="col_2_half">
                      <label>Airline</label>
                      <select class="w100pcnt multipleAirlines" multiple id="multipleAirlines" value="{{specificAirline}}" on-change="changeSpecificAirline()">
                        <option value="Jet Airways">Jet Airways</option>
                        <option value="Air India">Air India</option>
                        <option value="Air Asia">Air Asia</option>
                        <option value="Go Air">Go Air</option>
                        <option value="Indigo">Indigo</option>
                      </select>
                    </li>
					<li class="col_3_half mT35"> <input type="checkbox" id="directFlight"/>
                    <label for="directFlight">Show me direct flights only</label></li>
					<li class="col_3_half mT35"><input type="checkbox" id="refundFlight"/>
                    <label for="refundFlight">Show me refundable fares only</label></li>
                  </ul>
                </div>
              </div>

<!-- Add hotel -->
<%--
					<div class="comboOffer clearfix" id="comboOfferTriggers11">
               			 <p class="saveOffer clearfix"><span class="dealsTag fL mLN40"></span><span class="fL dB">Save on combo deals:</span></p>
                		 <ul class="searchFlightWay">
                  			<li>
                    			<input type="checkbox" id="add11" checked="{{needHotel}}" onClick="addFlight11(), showToggler()" />
                    			<label for="add11">Add hotels</label>
                  			</li>
                		</ul>
              		</div>
				
				</div>
				

		

	<!-- common settings for rooms START -->
            <div id="globalSrcToggle" class="{{needHotel ? '' : 'dN'}}">
             <br class="cB" />
				<ul class="searchFlight clearfix dN pT10" id="flightSearchPanel11">
                <!--searchFlight-->
                <li class="title">Hotels</li>
                <li class="next hotelDestination" id="hotelDestination">
                  <label>Where do you want to go?</label>
                  <input type="text" id="destinationHotelSearch" value="{{accommodation.hotelDestination}}" class="w100pcnt" placeholder="City, area, landmark or hotel name" />
                </li>
                <li>
                  <label>Check in</label>
                  <input type="text" id="checkinDate" value="{{accommodation.checkInDate}}" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
                </li>
                <li class="next">
                  <label>Check out</label>
                  <input type="text" id="checkoutDate" value="{{accommodation.checkOutDate}}" class=" w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
                </li>
				</ul>
              <div class="clearfix">
                    <label>Rooms</label>
                    <select value="{{accommodation.rooms.length}}" on-change="changeRoomSetting()">
                      <option value="1">1</option>
                      <option value="2">2</option>
                      <option value="3">3</option>
                    </select>
              </div>
              {{#accommodation.rooms:roomIndex}}<div class="clearfix searchFlight">
                <ul class="row mB10 mT10 clearfix">
                  <li id="singleRooms" class="col_2">
                  </li>
                  <li id="groupBookingRooms" class="col_2 dN">
                    <label>Rooms</label>
                    <select>
                      <option value="9">9</option>
                      <option value="10">10</option>
                      <option value="11">11</option>
                      <option value="12">12</option>
                    </select>
                  </li>
                  <li class="col_2 pR0 singleRoom"> <span class="mT30 fL">Room {{1 + roomIndex}}:</span> </li>
                  <li class="col_2 pL0 singleRoom">
                    <label>Adult</label>
                    <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" on-click="decreaseCountFor('adultCount', roomIndex)">-</span> <span class="control innerTxtControl">{{accommodation.rooms[roomIndex].adultCount}}</span> <span class="control addMinControl plusControl cursor fW600" on-click="increaseCountFor('adultCount', roomIndex)">+</span> </div>
                    <input type="text" placeholder="1" maxlength="3" class="w100pcnt dN" />
                    <span class="fS11 fL w100pcnt">12+ yrs</span> </li>
				  <li class="col_2 singleRoom">
                    <label>Children</label>
                    <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" on-click="decreaseCountFor('children', roomIndex)">-</span> <span class="control innerTxtControl">{{accommodation.rooms[roomIndex].children.length}}</span> <span class="control addMinControl plusControl cursor fW600" on-click="increaseCountFor('children', roomIndex)">+</span> </div>
                    <input type="text" placeholder="0"  maxlength="3" class="w100pcnt dN"/>
                    <span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li>
				   <li class="number">
					<label>Infant</label>
					<div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" on-click="decreaseCountFor('infants', roomIndex)">-</span> <span class="control innerTxtControl">{{accommodation.rooms[roomIndex].infants.length}}</span> <span class="control addMinControl plusControl cursor fW600" on-click="increaseCountFor('infants', roomIndex)">+</span> </div>
					<input type="text" placeholder="0"  maxlength="3" class="w100pcnt dN"/>
					<span class="fS11 fL">0-2 yrs</span> 
				  </li>
			  </ul>
					<ul class="col_6 pR0 pL0"></ul>
			  <ul class="col_6 mB10 pR0 pL0 singleRoom clearfix">
              {{#children:childIndex}}<li class="col_2 pR0"><label>Child {{1 + childIndex}}</label><select value="{{children[childIndex]}}" class="w75"><option value="Age">Age</option><option value="1">1</option><option value="2">2</option><option value="3">3</option></select></li>{{/children}}
              </ul>
					<ul class="col_6 pR0 pL0"></ul>
              <ul class="col_6 mB10 pR0 pL0 singleRoom clearfix">
              {{#infants:infantIndex}}<li class="col_2 pR0"><label>Infant {{1 + infantIndex}}</label><select value="{{infants[infantIndex]}}" class="w75"><option value="Age">Age</option><option value="1">1</option><option value="2">2</option><option value="3">3</option></select></li>{{/infants}}
              </ul>
              </div>{{/accommodation.rooms}}

              
			</div>
--%>
	<!-- common settings for rooms END -->
			<br class="cB" />
			<a href="javascript:void(0);" on-click="submitForm()" class=" button button-primary fR">Search</a> 
		 </form>
        </div>

        <!-- "hide" button at bottom START -->
        <div class="globalSrcExpContr"> <a href="javascript:void(0);"><span class="globalSrcShow sel">Hide</span></a> </div>
        <!-- "hide" button at bottom END -->
    </div>
</script>


<script>
var ${ractiveFlightSearchInstance} = ${ractiveFlightSearchInstance} ? ${ractiveFlightSearchInstance} : {};
$(function() {
	var calendar = new Object();
	${ractiveFlightSearchInstance}.search = new Ractive({
		el: '#${ractiveFlightSearchContainer}',
		template: '#${ractiveFlightSearchTemplate}',
		'oninit': function () {
			

			if (this.get('history.flightSection1ViewModel')) {
				var flightSection1ViewModel = this.clone(this.get('history.flightSection1ViewModel'))
				this.set('oneway', flightSection1ViewModel.oneway);
				this.set('twoway', flightSection1ViewModel.twoway);
				this.set('multicity.trips', flightSection1ViewModel.multicity.trips);
				//this.set('accommodation.rooms', flightSection1ViewModel.accommodation.rooms);
				
				this.set('numberOfAdult', flightSection1ViewModel.numberOfAdult);
				this.set('numberOfChild', flightSection1ViewModel.numberOfChild);
				this.set('numberOfInfant', flightSection1ViewModel.numberOfInfant);
				this.set('flightClass', flightSection1ViewModel.flightClass);
				this.set('specificAirline', flightSection1ViewModel.specificAirline);
				this.set('radioSearchFlight', flightSection1ViewModel.radioSearchFlight);
				
			} else {
				this.set('multicity.trips', [this.get('multicity.newTrip')()]);
				//this.set('accommodation.rooms', [this.get('accommodation.newRoom')()]);
				var today = new Date();
				this.set('twoway.startTime',addDays(today,1));
				this.set('twoway.returnTime',addDays(today,2));
			}
		},
		
		
		// view model
		data: {
			'fn': {
			  'diffDays': function (d1, d2) { return Math.ceil(Math.abs(d2.getTime() - d1.getTime()) / (1000 * 3600 * 24)); }
			},
			'history': {
				'flightSection1ViewModel': <c:if test="${not empty flightSection1ViewModel}">${flightSection1ViewModel}</c:if><c:if test="${empty flightSection1ViewModel}">''</c:if>,
	 			'flightSection1DataModel': <c:if test="${not empty flightSection1DataModel}">${flightSection1DataModel}</c:if><c:if test="${empty flightSection1DataModel}">''</c:if>,
	 			'flightSortDataModel': <c:if test="${not empty flightSortDataModel}">${flightSortDataModel}</c:if><c:if test="${empty flightSortDataModel}">''</c:if>
			},
			'oneway': {
			  'from': '',
			  'to': '',
			  'startTime': ''
			},
			'twoway': {
			  'from': '',
			  'to': '',
			  'startTime': '',
			  'returnTime': ''
			},
			'multicity': {
			  'newTrip': function (startDate,isRemovable) {
				  startDate = startDate ? startDate : addDays(new Date(),1);
				  //console.log('multicity.newTrip',startDate);
				  isRemovable = !!isRemovable;
			        return {
			  		  'from': '',
			  		  'to': '',
			  		  'startTime': startDate,
			  		  'isRemovable': isRemovable
		   		  };
			  },
			  'trips': []
			},

			'numberOfAdult' : 1 ,  // default adult 1
			'numberOfChild' : 0 ,  // default child 0
			'numberOfInfant': 0 ,  // default infant 0
			'radioSearchFlight': 'twoway', // default search option
			//'needHotel': false,    // default hotel option
			'flightClass': '',           // class of the airline
			'specificAirline': '',  // specific airline company,
			'originalGroupId':<c:if test="${not empty originalGroupId}">'${originalGroupId}'</c:if><c:if test="${empty originalGroupId}">''</c:if> //add by panhui for TRAV-66
		},
		

		'changeClass': function(){
			var keypath = 'flightClass';
			var flightClass = this.get(keypath);
			this.set(keypath, flightClass);
		},
		'changeSpecificAirline': function(){
			var keypath = 'changeSpecificAirline';
			var flightClass = this.get(keypath);
			this.set(keypath, flightClass);
		},
		'pushNewFlight':function(){
			this.push('multicity.trips', this.get('multicity.newTrip')());
			var tripLen = this.get('multicity.trips').length;
			validateTripNum(this);
			addInputBlurEventForSearchPage('searchFlightFrom',tripLen);
			addInputBlurEventForSearchPage('searchFlightTo',tripLen);
			 $search = $(".js-site-search-input-ezg");
			 if($search.length>0){
				$search.ezgautocomplete()
			 }
		},
		'removeFlight':function(tripIndex){
			this.splice('multicity.trips', tripIndex, 1);
			validateTripNum(this);
		},

		'increaseCount': function (target) {
			var keypath = target;
			console.log(['increaseCount', keypath]);
			this.add(keypath, 1);	
		},
		'decreaseCount': function (target) {
			var keypath =  target;
			console.log(['decreaseCount', keypath]);
			this.subtract(keypath, 1);
			
		},
		'generateDataModelFromViewModel': function () {
			var that = this;
			var currentStrategy = that.get('radioSearchFlight');
			var vm = that.get(currentStrategy);
			that.updateModel();
			var numberOfAdult = that.get('numberOfAdult');
			var numberOfChild= that.get('numberOfChild');
			var numberOfInfant = that.get('numberOfInfant');
			//var hotel = that.get('accommodation');
			//var needHotel = that.get('needHotel');
			var flightClass = that.get('flightClass');
			var specificAirline = that.get('specificAirline');
			//console.log(hotel);
			var dataModelCreationStrategy =
			{
				'oneway': function() {
					vm = that.get('twoway');
					var flightDeparture = createFlightSearchData(vm.from, vm.to, vm.startTime, numberOfAdult, numberOfChild, numberOfInfant, flightClass, specificAirline);				
					var hotelSearchData = null;
					/* if(needHotel){
						hotelSearchData = createHotelSearchData(hotel.hotelDestination, hotel.checkInDate, hotel.checkOutDate);
					} */
					var entry = createEntry(flightDeparture, hotelSearchData);
					return createDataModel([entry], 'oneway');
				},
				'twoway': function() {
					var flightDeparture = createFlightSearchData(vm.from, vm.to, vm.startTime, numberOfAdult, numberOfChild, numberOfInfant, flightClass, specificAirline);
					var hotelSearchData = null;
					/* if(needHotel){
						hotelSearchData = createHotelSearchData(hotel.hotelDestination, hotel.checkInDate, hotel.checkOutDate);
					} */
					var flightReturn = createFlightSearchData(vm.to, vm.from, vm.returnTime, numberOfAdult, numberOfChild, numberOfInfant);
					var entry = createEntry(flightDeparture, hotelSearchData, flightReturn);
					return createDataModel([entry], 'twoway');
				},
				'multicity': function () {
					var entrys = [];
					var oneway = that.get('twoway'); //need to add the one way entry. Then the new entries for multi way.
					var onewayFlightDeparture = createFlightSearchData(oneway.from, oneway.to, oneway.startTime, numberOfAdult, numberOfChild, numberOfInfant, flightClass, specificAirline);
					entrys.push(createEntry(onewayFlightDeparture, null));
					$(vm.trips).each(function(i, e) {
						var flightDeparture = createFlightSearchData(e.from, e.to, e.startTime, numberOfAdult, numberOfChild, numberOfInfant, flightClass, specificAirline);
						var hotelSearchData = null;
						/* if (needHotel) {
							hotelSearchData = createHotelSearchData(hotel.hotelDestination, hotel.checkInDate, hotel.checkOutDate);
						} */
						var entry = createEntry(flightDeparture, hotelSearchData);
						entrys.push(entry);
					});
					
					return createDataModel(entrys, 'multicity');
				}
			};
			return dataModelCreationStrategy[currentStrategy]();
			
			function createDataModel(entrys, type) {
				return {flightType: type, entrys: entrys, flightHotelSearchRooms : createFlightHotelSearchRooms() };
			}
			function createFlightHotelSearchRooms() {
				var rooms = [];
				$(that.get('accommodation.rooms')).each(function(i, e) {
					var room = { adultCount: e.adultCount, children: e.children, infants: e.infants };
					rooms.push(room);
				});
				return rooms;
			}
			function createEntry(flightDeparture, hotel, flightReturn) {
				return {
					departureFlightSearchData: flightDeparture, hotelSearchData: hotel, returnFlightSearchData: flightReturn
				};
			}
			function createFlightSearchData(from, to, date, adult, child, infant, flightClass, specificAirline) {
				return {fromCity: from, toCity: to, departureDate: date, numberOfAdult: adult, numberOfChild: child, numberOfInfant: infant, flightClass: flightClass, specificAirline: specificAirline}
			}
			function createHotelSearchData(searchText, inDate, outDate) {
				return {searchText: searchText, checkInDate: inDate, checkOutDate: outDate};
			}
		},
		'submitForm': function (eventSource) {
			${ractiveFlightSearchInstance}.submitForm('search');
		}

	});

	
	
	${ractiveFlightSearchInstance}.submitForm = function (eventSource) {
		var searchCtx = this.search;
		var facetCtx = this.facet;
		if (facetCtx) facetCtx.updateModel();
		searchCtx.updateModel();

		var section1ViewModel = null;
		var section1DataModel = null;
		var flightSortDataModel = null;
		var section2ADataModel = null;
			
		var isAjax = false;
				
		if (eventSource == 'facet' || eventSource == 'sorted') {
			section1ViewModel = JSON.stringify(searchCtx.get('history.flightSection1ViewModel'));
			section1DataModel = JSON.stringify(searchCtx.get('history.flightSection1DataModel'));
			flightSortDataModel = JSON.stringify(searchCtx.get('history.flightSortDataModel'));
			section2ADataModel = facetCtx ? JSON.stringify(facetCtx.get('history.flightSection2AViewModel')) : '';
			
			isAjax = true;
		} else {
			section1ViewModel = JSON.stringify(tidyou(searchCtx.get()));
			section1DataModel = JSON.stringify(tidyou(searchCtx.generateDataModelFromViewModel()));

		}
		
		var formElementExpressions = '';
		$(['flightSection1ViewModel', 'flightSection1DataModel', 'flightSection2AViewModel', 'flightSortDataModel', 'CSRFToken']).each (function (i, e) {
			formElementExpressions += '<input name="#" type="hidden" />'.replace('#', e);
		});
		
		var url = '${encodedContextPath}/search/flight/#';
		var flightTypeStr = searchCtx.get('radioSearchFlight');
		//flightTypeStr = flightTypeStr == 'multicity' ? 'multicity-intl' : flightTypeStr;
		url = url.replace('#', flightTypeStr);
		console.log(url);
		if(isAjax){
			url = url+'/ajax';
		}
		var formExpression = '<form action="' + url +'" method="post"></form>';
				
		$form = $(formExpression).append($(formElementExpressions));
		$form.find('input[name=flightSection1ViewModel]').val(section1ViewModel);
		$form.find('input[name=flightSection1DataModel]').val(section1DataModel);
		$form.find('input[name=flightSection2AViewModel]').val(section2ADataModel);
		$form.find('input[name=flightSortDataModel]').val(flightSortDataModel);
		$form.find('input[name=CSRFToken]').val(ACC.config.CSRFToken);
		
		/* var flightType = searchCtx.get('radioSearchFlight');
		console.log('flightType',flightType); */
		if(isAjax){
			$.ajax({
		           type: 'post',
		           url: url,
		           data: $form.serialize(),
		           success: function(data)
		           {
		        	   ${ractiveFlightSearchInstance}.refresh(searchCtx.get('radioSearchFlight'), data);
		           }
			});
		}else{
			$form.appendTo('body');
			validateInputCitysBeforeSubmit(searchCtx,function(){
				$form.submit();
			});
		}
		
		function tidyou(object) {
			delete object.fn;
			delete object.history;
			return object;
		}
	};
	
	${ractiveFlightSearchInstance}.refresh = function(flightType, data){
		
		console.log('flightSearch.jsp flightType',flightType);
		 if(flightType == 'oneway'){
			 
			${ractiveFlightSearchInstance}.flightbestPrice.refresh(data.bestPriceRecommend);
			${ractiveFlightSearchInstance}.flightallResult.refresh(data.result);
		}else if(flightType == 'twoway'){
			${ractiveFlightSearchInstance}.twowayFlightHeader.refresh(data.bestPriceRecommend);
			${ractiveFlightSearchInstance}.twowayFlight0.refresh(data.result);
			${ractiveFlightSearchInstance}.twowayFlight1.refresh(data.result);
		}else{
			${ractiveFlightSearchInstance}.flightMulticityHeader.refresh(data.bestPriceRecommend);
			${ractiveFlightSearchInstance}.flightMulticityFareSummary.refresh(data.bestPriceRecommend);
			for(var i = 0; i < data.result.length; i++){
				${ractiveFlightSearchInstance}['flightallResult' + i].refresh(data.result);
			}
		} 
	}
	
	validateTripNum();
	var numOfTrips = ${ractiveFlightSearchInstance}.search.get('multicity.trips').length;
	setupInputsBlurEventForSearchPage('searchFlightFrom',numOfTrips);
	setupInputsBlurEventForSearchPage('searchFlightTo',numOfTrips);
});
function validateTripNum(searchRactive){
	searchRactive = searchRactive ? searchRactive : ${ractiveFlightSearchInstance}.search;
	if(searchRactive){
		if(searchRactive.get('radioSearchFlight') != 'multicity'){
			$("div.clearfix .mB15.mT10").addClass('dN');
			return;
		}
		if(searchRactive.get('multicity.trips').length >= 5){
			$("div.clearfix .mB15.mT10").addClass('dN');
		}else{
			$("div.clearfix .mB15.mT10").removeClass('dN');
		}
	}
}

function validateInputCitysBeforeSubmit(searchCtx,callback){
	var isPassValidate = true;
	var fromSelectorStr = 'li#searchFlightFrom0>div>input';
	var toSelectorStr ='li#searchFlightTo0>div>input';
	isPassValidate = isPassValidate & !validateInputEmptyValue(fromSelectorStr,true);
	isPassValidate = isPassValidate & !validateInputEmptyValue(toSelectorStr,true);
	isPassValidate = isPassValidate & !validateSameInputValue(fromSelectorStr,toSelectorStr);
	//console.log('isPassValidate',isPassValidate);
	if(searchCtx.get('radioSearchFlight') == 'multicity'){
		var tripsLen = searchCtx.get('multicity.trips').length;
		for(var i = 1 ; i <= tripsLen ; i++){
			fromSelectorStr = 'li#searchFlightFrom' + i + '>div>input';
			isPassValidate = isPassValidate & !validateInputEmptyValue(fromSelectorStr,true);
			toSelectorStr = 'li#searchFlightTo' + i + '>div>input';
			isPassValidate = isPassValidate & !validateInputEmptyValue(toSelectorStr,true);
			isPassValidate = isPassValidate & !validateSameInputValue(fromSelectorStr,toSelectorStr);
		}
	}
	if(isPassValidate){
		callback();
	}
}

function validateSameInputValue(fromSelector,toSelector){
	var fromInputElement = $(fromSelector).filter(":visible");
	var toInputElement = $(toSelector).filter(":visible");
	if(fromInputElement.val() == "" || toInputElement.val() == ""){
		return false;
	}
	var isEqual = fromInputElement.val() == toInputElement.val();
	if(isEqual){
		toInputElement.addClass("err");
		toInputElement.attr("placeholder","should different with From");
		toInputElement.val("");
	}
	return isEqual;
}

$(document).ready(function(e) {
	var instanceIds = ["ractiveTopFlight","ractivePopupFlight"];
	if($().datepicker){
		for(var i=0;i<instanceIds.length;i++){
			var currentInstanceId = instanceIds[i];
			var searchCtx = ${ractiveFlightSearchInstance}.search;
			var flightType= searchCtx.get("radioSearchFlight");
			 $("#"+currentInstanceId+" .flightDepartureTime").datepicker({
					numberOfMonths:2,
					minDate:0,
					dateFormat: "yy-mm-dd",
					onSelect: function(dateText){
						  $(this).css("color","#333333");
						  if(flightType == 'twoway'){
							  var minDate = $(this).datepicker('getDate');
							  currentInstanceId = $(this).data("instanceid");
							  $("#"+currentInstanceId+" .flightReturnTime").datepicker("change", { minDate: minDate });
						  }
					   }
				   });
			  $("#"+currentInstanceId+" .flightReturnTime").datepicker({
				numberOfMonths:2,
				minDate:0,
				dateFormat: "yy-mm-dd",
				onSelect: function(dateText){
					  $(this).css("color","#333333");
					  if(flightType == 'twoway'){
						  var maxDate = $(this).datepicker('getDate');
						  currentInstanceId = $(this).data("instanceid");
						  $("#"+currentInstanceId+" .flightDepartureTime").datepicker("change", { maxDate: maxDate });
					  }
				   }
			   });
	  }
	}
});
</script>
<c:set var="ractiveFlightSearchContainer" value="" scope="request" />
<c:set var="ractiveFlightSearchTemplate" value="" scope="request" />
<c:set var="ractiveFlightSearchInstance" value="" scope="request" />