<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- template container --%>
<div id="divSearchFlightAndHotel"></div>
<script id="templateSearchFlightAndHotel" type="text/ractive">
    <div class="globalSearchBG clearfix">
        <div class="clearfix" id="mainSearchWizard">
          <form method="post" action="/">

            <!-- Search options for one-way / two-way / multicity START -->
			<ul class="searchFlightWay clearfix">
              <li>
                <input type="radio" value="oneway" name="{{serviceType}}"/>
                <label for="oneway">One way</label>
              </li>
              <li>
                <input type="radio" value="twoway" name="{{serviceType}}"/>
                <label for="return">Return</label>
              </li>
              <li>
                <input type="radio" value="multicity" name="{{serviceType}}"/>
                <label for="multicity">Multi city</label>
              </li>
            </ul>
            <!-- Search options for one-way / two-way / multicity END -->

    <!-- ONE-WAY -->
								<div class="{{serviceType == 'oneway' ? '' : 'dN'}}">
									<!-- flight trip of one-way or two-way START -->
								    <ul class="searchFlight clearfix">
						              <li>
						                <label>Starting From</label>
						                <input type="text" value="{{oneway.from}}"  class=" w100pcnt" placeholder="Mumbai"/>
						              </li>
						              <li class="next">
						                <label>Going to</label>
						                <input type="text" value="{{oneway.to}}" class=" w100pcnt" placeholder="Delhi"/>
						              </li>
						              <li>
						                <label>Departure</label>
						                <input type="text" value="{{oneway.startTime}}" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
						              </li>
									</ul>
									<!-- flight trip of one-way or two-way END -->
									<!-- check in/out for hotel START -->
									<ul class="searchFlight clearfix">
										<li class="next hotelDestination">
						                  <label>Where do you want to stay?</label>
						                  <input type="text" value="{{oneway.hotel}}"  class="w100pcnt" placeholder="City, area, landmark or hotel name"/>
						                </li>
										<li id="checkinreturn">
						                <label>Check in</label>
						                <input type="text" value="{{oneway.checkInDate}}" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
										</li>
									   <li id="checkoutreturn">
						                <label>Check out</label>
						                <input type="text" value="{{oneway.checkOutDate}}" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
						              </li>
									  <li class="next mT35" id="2nights">
						                <span class="baggage_icon fL mR10"></span><span class="fL">2 Nights</span>
						              </li>
						            </ul>
									<!-- check in/out for hotel END -->
								</div>

	<!-- TWO-WAY -->
								<div class="{{serviceType == 'twoway' ? '' : 'dN'}}">
									<!-- flight trip of one-way or two-way START -->
								    <ul class="searchFlight clearfix">
						              <li>
						                <label>Starting From</label>
						                <input type="text" value="{{twoway.from}}"  class=" w100pcnt" placeholder="Mumbai"/>
						              </li>
						              <li class="next">
						                <label>Going to</label>
						                <input type="text" value="{{twoway.to}}" class=" w100pcnt" placeholder="Delhi"/>
						              </li>
						              <li>
						                <label>Departure</label>
						                <input type="text" value="{{twoway.startTime}}" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
						              </li>
						              <li class="next" id="returnFlightContainer">
						                <label>Return</label>
						                <input type="text" value="{{twoway.returnTime}}" class=" w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
						              </li>
									</ul>
									<!-- flight trip of one-way or two-way END -->
									<!-- check in/out for hotel START -->
									<ul class="searchFlight clearfix">
									  <li class="next hotelDestination">
						                  <label>Where do you want to stay?</label>
						                  <input type="text" value="{{twoway.hotel}}" class="w100pcnt" placeholder="City, area, landmark or hotel name"/>
						              </li>
									<ul class="searchFlight clearfix">
						            </ul>
									  <li class="w50pcnt mT20">
						                  <input type="checkbox" checked="{{twoway.isFlightDiffersHotel}}"/>
						                  <label for="addFlight1">Hotel stay at different dates</label>
						              </li>
						            </ul>
									<ul class="searchFlight clearfix {{twoway.isFlightDiffersHotel ? '' : 'dN'}}">
									  <li id="checkinreturn">
						                <label>Check in</label>
						                <input type="text" value="{{twoway.checkInDate}}" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
									  </li>
									   <li id="checkoutreturn">
						                <label>Check out</label>
						                <input type="text" value="{{twoway.checkOutDate}}" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
						              </li>
									  <li class="next mT35">
						                <span class="baggage_icon fL mR10"></span><span class="fL">2 Nights</span>
						              </li>
									</ul>
									<!-- check in/out for hotel END -->
								</div>

	<!-- MULTI-CITY -->
								<div class="{{serviceType == 'multicity' ? '' : 'dN'}}">
									{{#multicity.trips:tripIndex}}
									<!-- flight trip of one-way or two-way START -->
								    <ul class="searchFlight clearfix">
						              <li>
						                <label>Starting From</label>
						                <input type="text" value="{{from}}"  class=" w100pcnt" placeholder="Mumbai"/>
						              </li>
						              <li class="next">
						                <label>Going to</label>
						                <input type="text" value="{{to}}" class=" w100pcnt" placeholder="Delhi"/>
						              </li>
						              <li>
						                <label>Departure</label>
						                <input type="text" decorator="datepicker" value="{{startTime}}" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
						              </li>
									</ul>
									<!-- flight trip of one-way or two-way END -->
									<!-- check in/out for hotel START -->
									<ul class="searchFlight clearfix pT10">
            						    <li class="w20pcnt">
            						        <input id="Need hotel in Delhi{{tripIndex}}" type="checkbox" checked="{{needHotel}}"/>
            						        <label for="Need hotel in Delhi{{tripIndex}}">Need hotel in Delhi</label>
            						    </li>
										<li class="next w50pcnt {{needHotel ? '' : 'dN'}}">
											<ul class="clearfix">
												<li>
													<label>Check in</label>
														<input decorator="datepicker" type="text" value="{{checkInDate}}" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
												</li>
												<li>
													<label>Check out</label>
														<input decorator="datepicker" type="text" value="{{checkOutDate}}" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
												</li>
												<li class="mT35">
													<span class="baggage_icon fL mR10"></span><span class="fL">2 Nights</span>
												</li>
											</ul>
										</li>
		                				<li class="closeMultipleWay {{(needHotel && tripIndex > 1) ? '' : 'dN'}}">
		                				    <div on-click="splice('multicity.trips', tripIndex, 1)" class="close_multicity_panel fL"></div>
						                </li>
									</ul>
									{{/multicity.trips}}
									<!-- check in/out for hotel END -->
								</div>

			<!-- common settings for rooms START -->
            <div id="globalSrcToggle">
              <div class="clearfix mB15 mT10 {{(serviceType != 'multicity' || multicity.trips.length == 6) ? 'dN' : ''}}" on-click="push('multicity.trips', multicity.newTrip(true))"> <span class="addIcon fL"></span> <span class="fL mT10 cursor">Add city</span> </div>
              <div class="clearfix mB15 mT10">
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
              {{#children:childIndex}}<li class="col_2 pR0"><label>Child {{1 + childIndex}}</label>
              <select value="{{children[childIndex]}}" class="w75"><option value="-1">Age</option>
              <option value="2">2</option><option value="3">3</option><option value="1">4</option><option value="5">5</option><option value="6">6</option>
              <option value="7">7</option><option value="8">8</option><option value="9">9</option><option value="10">10</option><option value="11">11</option>
              <option value="12">12</option></select></li>{{/children}}
              </ul>
					<ul class="col_6 pR0 pL0"></ul>
              <ul class="col_6 mB10 pR0 pL0 singleRoom clearfix">
              {{#infants:infantIndex}}<li class="col_2 pR0"><label>Infant {{1 + infantIndex}}</label>
              <select value="{{infants[infantIndex]}}" class="w75"><option value="-1">Age</option><option value="0">0</option><option value="1">1</option><option value="2">2</option></select></li>{{/infants}}
              </ul>
              </div>{{/accommodation.rooms}}

              <a href="javascript:void(0);" on-click="submitForm()" class=" button button-primary fR">Search</a> 
			</div>
			<!-- common settings for rooms END -->
          </form>
        </div>
        <!-- "hide" button at bottom START -->
        <div class="globalSrcExpContr"> <a href="javascript:void(0);"><span class="globalSrcShow sel">Hide</span></a> </div>
        <!-- "hide" button at bottom END -->
    </div>
</script>
<script>
var ractiveFlightAndHotel = ractiveFlightAndHotel ? ractiveFlightAndHotel : {};
$(function() {
ractiveFlightAndHotel.search = new Ractive({
	el: '#divSearchFlightAndHotel',
	template: '#templateSearchFlightAndHotel',
	'oninit': function () {
		if (this.get('history.section1ViewModel')) {
			var section1ViewModel = this.clone(this.get('history.section1ViewModel'));
			this.set('oneway', section1ViewModel.oneway);
			this.set('twoway', section1ViewModel.twoway);
			this.set('multicity.trips', section1ViewModel.multicity.trips);
			this.set('accommodation.rooms', section1ViewModel.accommodation.rooms);
			this.set('serviceType', section1ViewModel.serviceType);
		} else {
			this.set('multicity.trips', [this.get('multicity.newTrip')(), this.get('multicity.newTrip')()]);
			this.set('accommodation.rooms', [this.get('accommodation.newRoom')()]);
		}
	},
	// view model
	'data': {
		'fn': {
		  'diffDays': function (d1, d2) { return Math.ceil(Math.abs(d2.getTime() - d1.getTime()) / (1000 * 3600 * 24)); }
		},
		'history': {
			'section1ViewModel': <c:if test="${not empty section1ViewModel}">${section1ViewModel}</c:if><c:if test="${empty section1ViewModel}">''</c:if>,
 			'section1DataModel': <c:if test="${not empty section1DataModel}">${section1DataModel}</c:if><c:if test="${empty section1DataModel}">''</c:if>
		},
		'oneway': {
		  'from': '',
		  'to': '',
		  'startTime': '',
		  'hotel': '',
		  'checkInDate': '',
		  'checkOutDate': ''
		},
		'twoway': {
		  'from': '',
		  'to': '',
		  'startTime': '',
		  'returnTime': '',
		  'isFlightDiffersHotel': false,
		  'hotel': '',
		  'checkInDate': '',
		  'checkOutDate': ''
		},
		'multicity': {
		  'newTrip': function (isRemovable) {
			  isRemovable = !!isRemovable;
		        return {
		  		  'from': '',
		  		  'to': '',
		  		  'startTime': '',
		  		  'needHotel': true,
		  		  'checkInDate': '',
		  		  'checkOutDate': '',
		  		  'isRemovable': isRemovable
	   		  };
		  },
		  'trips': []
		},
		'accommodation': {
		  'newRoom': function () {
			  return {
		  		  'adultCount': 1,
		  		  'children': [],
		  		  'infants': []
	   		  };
		  },
		  'rooms': []
		},
		'serviceType': 'twoway' // default search option
	},
	'changeRoomSetting': function () {
		this.cnk.roomsService.changeRoomSetting.call(this, 'accommodation.rooms', 'accommodation.newRoom');
	},
	'increaseCountFor': function (target, roomIndex) {
		this.cnk.roomsService.increaseCountFor.call(this, 'accommodation.rooms', target, roomIndex);
	},
	'decreaseCountFor': function (target, roomIndex) {
		this.cnk.roomsService.decreaseCountFor.call(this, 'accommodation.rooms', target, roomIndex);
	},
	'generateDataModelFromViewModel': function () {
		var that = this;
		var currentStrategy = that.get('serviceType');

		var vm = that.get(currentStrategy);
		var dataModelCreationStrategy =
		{
			'oneway': function() {
				var flightDeparture = createFlightSearchData(vm.from, vm.to, vm.startTime);
				var hotelSearchData = createHotelSearchData(vm.hotel, vm.checkInDate, vm.checkOutDate);
				var entry = createEntry(flightDeparture, hotelSearchData);
				return createDataModel([entry]);
			},
			'twoway': function() {
				var flightDeparture = createFlightSearchData(vm.from, vm.to, vm.startTime);
				var hotelSearchData = null;
				if (vm.isFlightDiffersHotel) {
					hotelSearchData = createHotelSearchData(vm.to, vm.checkInDate, vm.checkOutDate);
				} else {
					hotelSearchData = createHotelSearchData(vm.to, vm.startTime, vm.returnTime);
				}
				var flightReturn = createFlightSearchData(vm.to, vm.from, vm.returnTime);
				var entry = createEntry(flightDeparture, hotelSearchData, flightReturn);
				return createDataModel([entry]);
			},
			'multicity': function () {
				var entrys = [];
				$(vm.trips).each(function(i, e) {
					var flightDeparture = createFlightSearchData(e.from, e.to, e.startTime);
					var hotelSearchData = null;
					if (e.needHotel) {
						hotelSearchData = createHotelSearchData(e.to, e.checkInDate, e.checkOutDate);
					}
					var entry = createEntry(flightDeparture, hotelSearchData);
					entrys.push(entry);
				});
				return createDataModel(entrys);
			}
		};
		return dataModelCreationStrategy[currentStrategy]();
		
		function createDataModel(entrys) {
			return { entrys: entrys, flightHotelSearchRooms : createFlightHotelSearchRooms() };
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
		function createFlightSearchData(from, to, date) {
			return {fromCity: from, toCity: to, departureDate: date}
		}
		function createHotelSearchData(destination, inDate, outDate) {
			return {destination: destination, checkInDate: inDate, checkOutDate: outDate};
		}
	},
	'submitForm': function () {
		ractiveFlightAndHotel.submitForm('search');
	}
});
ractiveFlightAndHotel.submitForm = function (eventSource) {
	var searchCtx = this.search;
	var facetCtx = this.facet;
	if (facetCtx) facetCtx.updateModel();
	searchCtx.updateModel();

	var section1ViewModel = null;
	var section1DataModel = null;
	if (eventSource == 'facet') {
		section1ViewModel = JSON.stringify(searchCtx.get('history.section1ViewModel'));
		section1DataModel = JSON.stringify(searchCtx.get('history.section1DataModel'));
	} else {
		section1ViewModel = JSON.stringify(tidyou(searchCtx.get()));
		section1DataModel = JSON.stringify(tidyou(searchCtx.generateDataModelFromViewModel()));
	}
	var section2ADataModel = facetCtx ? JSON.stringify(facetCtx.get('section2AViewModel')) : '';
	var formElementExpressions = '';
	$(['section1ViewModel', 'section1DataModel', 'section2ADataModel', 'CSRFToken']).each (function (i, e) {
		formElementExpressions += '<input name="#" type="hidden" />'.replace('#', e);
	});
	var formExpression = '<form action="${encodedContextPath}/search/flight_and_hotel/#" method="post"></form>';
	formExpression = formExpression.replace('#', searchCtx.get('serviceType'));
	$form = $(formExpression).append($(formElementExpressions));
	$form.find('input[name=section1ViewModel]').val(section1ViewModel);
	$form.find('input[name=section1DataModel]').val(section1DataModel);
	$form.find('input[name=section2ADataModel]').val(section2ADataModel);
	$form.find('input[name=CSRFToken]').val(ACC.config.CSRFToken);
	$form.appendTo('body').submit();
	
	function tidyou(object) {
		delete object.fn;
		delete object.history;
		return object;
	}
};
});
</script>
