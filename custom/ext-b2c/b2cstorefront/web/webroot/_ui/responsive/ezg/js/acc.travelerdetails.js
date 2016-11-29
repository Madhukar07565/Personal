ACC.travelerdetails = {

	_autoload : [ "initRules",
				  "bindForms",
	              "populateBirthdayInput",
	              "bindRoomsDetailsLink",
	              "bindFlightDetailsLink",
	              "bindEditHotelLink",
	              "bindDeleteHotelLink",
	              "bindDeleteFlightLink",
	              "bindEditFlightLink",
			   ],

	bindForms : function() {
		var that = this;
		$(document).on("click", "#travelerDetailsButton", function(e) {
			e.preventDefault();
			ACC.travelerdetails.wrapUpdateTravelersInfo();
		});

		
		var timelimit = $("[name=timeLimit]");
		timelimit.change(function(e){
			//e.preventDefault();
			if(e.target.checked){
				e.target.value = true;
			} else{
				e.target.value = false;
			}
		});
	},
	populateBirthdayInput: function(){
		var birthdayInputs = $('input[name=childBirthday]');
		if(birthdayInputs != undefined && birthdayInputs.size() > 0){
			birthdayInputs.combodate();
		}
//		for ( var index in birthdayInputs.toArray()) {
//			var dom = birthdayInputs[index];
//			var nptravelerData = $(dom).combodate();
//		}
	},

	wrapUpdateTravelersInfo:function(){
		
			if(typeof ACC.travellerValidator !== 'function'){
				console.error("current validation depends on travellerValidator, traveller.js should be import first");
				return ACC.travelerdetails.updateTravelersInfo();
			}
		
		var originalF = FormSerializer.serializeObject, that = this;

		$.fn.serializeObject = function(){
			function validate($form){

				var formArray = $form.serializeArray();
				var __name = $form.attr("name");
				var __id = $form.data('index');

				var currentRule = that.ruleConfig[__name];

				function verify(rule, pair){
					var result = that.validator.oRules[rule].call(that,pair.value);
						if(!result){
							that.validator.renderMessage( pair.name, that.validator.message[rule], $form);
						}
					return result;
				}

				formArray.forEach(function(pair){
						if(currentRule[pair.name] ){
							var hasError = false;
							if( $.isArray(currentRule[pair.name])){
								hasError = currentRule[pair.name].some(function(rule){
									return !verify(rule, pair);
								});
							}else{
								hasError = !verify(currentRule[pair.name],pair);
							}						
						hasError &&(formArray.hasError = true);
						}
				});
				return formArray;
			}
			var __pairs = validate(this);
			if(__pairs.hasError){
				return false;
			}else{
				return new FormSerializer($, this).
					addPairs(__pairs).
					serialize();
			}
		};
		ACC.travelerdetails.updateTravelersInfo();
		$.fn.serializeObject = originalF;
	},
	
	updateTravelersInfo : function(){
		var hotelFormData = ACC.travelerdetails.composeTravelerFormData(),
			flightFormData = ACC.travelerdetails.composeFlightTravelerFormData(),
			hotelOptions = {
				url : ACC.config.contextPath + "/checkout/multi/traveler-details/add",
				type : 'POST',
				contentType: "application/json",
				dataType : 'json',
				data : JSON.stringify(hotelFormData)
			},

			flightOptions = {
				url : ACC.config.contextPath + "/checkout/multi/traveler-details/add/flight",
				type : 'POST',
				contentType: "application/json",
				dataType : 'json',
				data : JSON.stringify(flightFormData),
			};

			if(hotelFormData && flightFormData){
				$.when($.ajax(hotelOptions),$.ajax(flightOptions)).then(function(hotelData,flightData){

					if(flightData && flightData[0] === 'update-success' ){
						window.location.href = ACC.config.contextPath + "/checkout/multi/payment";
					}
				}, function(error){
					console.error("update traveler info failed.");
					console.trace&&	console.trace(error);
				});
			}
	},

		composeFlightTravelerFormData : function(){
			var travelerDetailsForms = $("form[name=flightTravelerDetailsForm]");
			var formData = [];
			var travelerDataList = [], hasError = false;
			for ( var index in travelerDetailsForms.toArray()) {
				var dom = travelerDetailsForms[index];
				var travelerData = $(dom).serializeObject();
				if(!travelerData){
					hasError = true;
				}

				if(!hasError){
					travelerDataList = ACC.travelerdetails.getTicketIndexArray(travelerData);
					for(var objIndex in travelerDataList){
						formData.push(travelerDataList[objIndex]);
					}
				}
			}
			var data = {travelers:formData};
			return hasError? !hasError :data;
		},
	
	getTicketIndexArray : function(travelerData){
		var flightInfoJson = $("#flightInfoJson").val();
		var flightInfoObj=jQuery.parseJSON(flightInfoJson);
		var travelerDataList = [];
		$(flightInfoObj).each(function(){
			if($(this.orderEntryInfoData).attr("groupId") == travelerData.groupId){
				var ticketInnerIndex = travelerData.ticketInnerIndex;
				$(this.entries).each(function(){
						$(this.entries).each(function(i,entry){
							var ordeTicket = entry.orderEntryInfoData.ticketDetailInfoData;
							if(i==ticketInnerIndex){
								var cloneObj = {};
								$.extend(cloneObj,travelerData);
								cloneObj.orderEntryNumber = ordeTicket.ticketIndex
								travelerDataList.push(cloneObj);
							}
						});
				});
			}
		});
		return travelerDataList;
	},
	
	composeTravelerFormData : function(){
		var travelerDetailsForms = $("form[name=travelerDetailsForm]");

		var formData = [], hasError = false ;
		for ( var index in travelerDetailsForms.toArray()) {
			var dom = travelerDetailsForms[index];
			var travelerData = $(dom).serializeObject();
			
			if(!travelerData){
				hasError = true;
			}

			var roomIndex = $(dom).data('index');
			var npTravellers = ACC.travelerdetails.composeNPTravelers(roomIndex);
			
			if(!npTravellers){
				hasError = true;
			}

			travelerData.nonPrimaryTravellers = npTravellers;
			
			//compose insurance and tnc flag
			var groupId = $(dom).data('grpid');
			var terms = ACC.travelerdetails.getTermsAndCondition(groupId);
			travelerData.agreeTerms = terms;
			var insurance = ACC.travelerdetails.getInsuranceInfo(groupId);
			travelerData.insurance = insurance;
			
			formData.push(travelerData);
		}
		
		var data = {travelers:formData};
		
		return hasError? !hasError: data;
	},
	getInsuranceInfo : function(groupId){
		var insurance = $("[id=addInsurance]");
		return ACC.travelerdetails.getCheckBoxValue(insurance, groupId);
	},
	getTermsAndCondition : function(groupId){
		var termflagDom = $("[id=tAndC]");
		return ACC.travelerdetails.getCheckBoxValue(termflagDom, groupId);
	},
	getCheckBoxValue : function(domArray, groupId){
		for ( var ele in domArray) {
			if($(domArray[ele]).data('grpid') == groupId){
				if($(domArray[ele]).val() =='on'){
					return true;
				}else{
					return false;
				} 
			}
		}
	},
	composeNPTravelers : function(roomIndex){
		var nonPrimaryChildForm = $("form[name=nonPrimaryChildForm]");
		var nonPrimaryAdultForm = $("form[name=nonPrimaryAdultForm]");
		
		
		var npData = [], hasError = false;
		
		nonPrimaryAdultForm.filter(function(ind, ele ) {
			if($(ele).data('index') == roomIndex){
				var nptravelerData = $(ele).serializeObject();

				if(!nptravelerData){
					hasError = true;
				}
				npData.push(nptravelerData);
			}
		});
		
		nonPrimaryChildForm.filter(function(ind, ele ) {
			if($(ele).data('index') == roomIndex){
				var nptravelerData = $(ele).serializeObject();

				if(!nptravelerData){
					hasError = true;
				}
				npData.push(nptravelerData);
			}
		});
		
		return hasError? !hasError: npData;
	},
	displayUploadDocs : function(result, statusText, xhr, formElement) {
		ACC.travelerdetails.step1('header1', 'header2', 'step1', 'step2');
	},
	
	step1: function(curHrdr, nextHrdr, curContr, nextContr){
		$("#"+curHrdr).removeClass('active noImg');
		$("#"+nextHrdr).addClass('active').removeClass('noImg');
		$("#"+curContr).slideUp('slow');
		$("#"+nextContr).slideDown('slow');
		document.getElementById(curHrdr).onclick = ACC.travelerdetails.fn_step2;
		$('html, body').animate({scrollTop: '0px'},500);
	},

	fn_step2: function(){
		$("#header2").addClass('active');
		$("#header1,#header3,#header4,#header5").removeClass('active');
		$("#step2").slideDown('slow');
		$("#step1,#step3,#step4,#step5").slideUp('slow');
		$("#header2").siblings("div.heading").removeClass("active");
		$("#header2").next(".accordion_stepForm .contContainer").slideDown("slow").siblings(".accordion_stepForm .contContainer:visible").slideUp("slow");
		$('html, body').animate({scrollTop: '0px'},500);
	},
	
	////////show/hide room details//////
	bindRoomsDetailsLink : function(){
		var moreLinks = $("[id=moreRoomInfo]");
		var closeLinks = $("[id=closeRoom]");
		
		var toggleDetails = function(detailLink, groupId){
			$(detailLink).toggleClass("active");
			var moreInfo = $("[id=moreRoomInfoCont][data-grpid=" + groupId + "]");
			$(moreInfo).slideToggle();
			
			if ($(detailLink).hasClass('active')) {
				$("[id=moreRoomInfo][data-grpid=" + groupId + "]>[id=plusMinus]").html(" - ");
			} else {
				$("[id=moreRoomInfo][data-grpid=" + groupId + "]>[id=plusMinus]").html(" + ");
			}
		};
		moreLinks.click(function(e){
			e.preventDefault();
			var detailLink = e.target;
			var groupId = $(e.target).data('grpid');
			toggleDetails(detailLink,groupId);
		});
		closeLinks.click(function(e){
			e.preventDefault();
			var groupId = $(e.target).data('grpid');
			var detailLink = $("[id=moreRoomInfo][data-grpid=" + groupId + "]");
			
			toggleDetails(detailLink,groupId);
		});
	},
	
	/////////////
	
	bindFlightDetailsLink : function(){
		var moreLinks = $("[id=moreInfo]");
		var closeLinks = $("[id=closeMoreInfo]");
		
		var toggleDetails = function(detailLink, moreInfo){
			$(detailLink).toggleClass("active");
			$(moreInfo).slideToggle();
			
			if ($(detailLink).hasClass('active')) {
				$(detailLink).find("#plusMinus").html(" - ");
			} else {
				$(detailLink).find("#plusMinus").html(" + ");
			}
		};
		moreLinks.click(function(e){
			e.preventDefault();
			var detailLink = e.target;
			var moreInfo = $(detailLink).parent().parent().next();
			toggleDetails(detailLink,moreInfo);
		});
		closeLinks.click(function(e){
			e.preventDefault();
			var groupId = $(e.target).data('grpid');
			var detailLink = $("[id=moreRoomInfo][data-grpid=" + groupId + "]");
			
			toggleDetails(detailLink,groupId);
		});
	},
	
	bindEditHotelLink : function(){
		$("[id=hoteledit]").click(function(e){
			e.preventDefault();
			
			ACC.travelerdetails.editHotel(e);
		});
	},
	/**
	 * go to hotel PDP page
	 * TODO, after modify search on hotel details page, keep original group id to identify it's coming from cart page, 
	 * and need to remove original entries.
	 */
	editHotel : function (e){
		var formElementExpressions = '';
		$(['widgetAndFacetSearchJson','originalGroupId','CSRFToken']).each (function (i, e) {
			formElementExpressions += '<input name="#" type="hide" />'.replace('#', e);
		});
		var formdom = e.target.parentElement;
		var formJson = $(formdom).serializeObject();
		
		//create room object
		var room = {};
		room.adultCount = formJson.numberOfAdult;
		room.children = [];
		for (var int = 0; int < Number.parseInt(formJson.numberOfChild); int++) {
			room.children.push("-1")
		}
		room.infants = [];
		//create rooms and push room to rooms
		var rooms = [];
		for (var int = 0; int < Number.parseInt(formJson.numberOfRoom); int++) {
			rooms.push(room);
		}
		formJson.hotelSearchRooms = rooms;
		
		var widgetAndFacetSearchJson = JSON.stringify(formJson);
		var productCode = $(e.target).data('prodid');
		var groupId = $(e.target).data('grpid');
		var formExpression = '<form action="'+ACC.config.encodedContextPath+'/p/hotel/'+productCode+'/query" method="post"></form>';
		$form = $(formExpression).append($(formElementExpressions));
		$form.find('input[name=widgetAndFacetSearchJson]').val(widgetAndFacetSearchJson);
		$form.find('input[name=CSRFToken]').val(ACC.config.CSRFToken);
		$form.find('input[name=originalGroupId]').val(groupId);
		$form.appendTo('body').submit();
	},
	bindDeleteHotelLink : function(){
		$("[id=hoteldelete]").click(function(e){
			e.preventDefault();
			var deleteParam = $(e.target.parentElement).serializeObject();
			//popup confirm
			ACC.travelerdetails.popupConfirm(deleteParam);
			//ACC.travelerdetails.deleteHotel(e);
		});
	},
	popupConfirm : function(params){
		//var currentTileId = $(this).closest('.boxTile').attr('id');
		//popupwin('deleteItemConfirmation', 'black_overlay', 'fade');
		popupwin('recyclebin','recyclebininner', 'fade');
		$("[id=confirmDelete]").click(function(e){
			ACC.travelerdetails.deleteHotel(params);
		});
	},
	deleteHotel : function (params){
		if(params == undefined){
			return false;
		}
		var formElementExpressions = '';
		$(['hotelId','groupId','CSRFToken']).each (function (i, e) {
			formElementExpressions += '<input name="#" type="hide" />'.replace('#', e);
		});
		var productCode = params.productId
		var groupId = params.groupId
		var formExpression = '<form action="'+ACC.config.encodedContextPath+'/cart/remove/hotel" method="post"></form>';
		$form = $(formExpression).append($(formElementExpressions));
		$form.find('input[name=hotelId]').val(productCode);
		$form.find('input[name=CSRFToken]').val(ACC.config.CSRFToken);
		$form.find('input[name=groupId]').val(groupId);
		$form.appendTo('body').submit();
	},
	
	bindDeleteFlightLink: function(){
		$(document).on("click", "#deleteFlight", function(e) {
			var confirmBtn = $("#recyclebin a")[0];
			var cancelBtn = $("#recyclebin a")[1];
			var url= ACC.config.contextPath + "/cart/remove/flight";
			var deleteBtn = $(e.target);
			$(confirmBtn).click(function(e){
				e.preventDefault();
				var form = $("<form></form>");
				form.attr("action", url);
				form.attr("method", "post");
				var len =  deleteBtn.next().val().length;
				var entryNumbersByFlight =deleteBtn.next().val().substr(0,len-1);
				var entryNumbers = [];
				entryNumbers = entryNumbersByFlight.split('_');
				form.append("<input type='hidden' name='flightEntryform' value='"+JSON.stringify(entryNumbers)+"'/>");
				form.append("<input type='hidden' name='CSRFToken' value='"+ACC.config.CSRFToken+"'/>");
				form.appendTo("body").submit();
				form.remove();
			});
			popupwin('recyclebin','recyclebininner', 'fade');
			 
		});
	},
	bindEditFlightLink: function(){
		var flightInfoJson = $("#flightInfoJson").val();
		
		$(document).on("click", "#editFlight", function(e) {
			var confirmBtn = $("#recyclebin a")[0];
			var cancelBtn = $("#recyclebin a")[1];
			var self = e.target;
			var entrys = [];
			var entryContents = {};
			var mutiContents = [];
			var departureFlightSearchData = {};
			var flightInfoObj=jQuery.parseJSON(flightInfoJson);
			var groupId = $(self).parent().find('#flightGroupId').val();
			var sequence = $(self).parent().find('#flightSequence').val();
			var flightSection1DataModel;	
			var journeyType = '';
			$(flightInfoObj).each(function(){
				if($(this.orderEntryInfoData).attr("groupId") == groupId){
					var flightInfoByGroup = $(this.orderEntryInfoData).attr("groupId");
					var numberOfFlight = $(this.entries).length;
					$(this.entries).each(function(){
							var departureFlightSearchData = {};
							var originThis = $(this.orderEntryInfoData.flightDetailInfoData)[0];
							departureFlightSearchData.fromCity = originThis.commonFlightInfoData.fromCity;
							departureFlightSearchData.toCity = originThis.commonFlightInfoData.toCity;
							departureFlightSearchData.departureDate = originThis.commonFlightInfoData.departureTime;
							departureFlightSearchData.flightClass = originThis.commonFlightInfoData.cabinClass;
							journeyType = originThis.journeyType;
														
							var specificAirline = [];
							specificAirline.push(originThis.commonFlightInfoData.airlineIATAData.airlineName)
							departureFlightSearchData.specificAirline = specificAirline;
							var numberOfAdult = 0;
							var numberOfChild = 0;
							var numberOfInfant = 0;
							var ordeTicketList = $(this.entries);
							$(this.entries).each(function(i,entry){
								var ordeTicket = entry.orderEntryInfoData.ticketDetailInfoData;
								if (ordeTicket.passengerType.code === 'CHILD'){
									numberOfChild++;
								} else if (ordeTicket.passengerType.code === 'ADULT'){
									numberOfAdult++;
								} else if (ordeTicket.passengerType.code === 'INFANT'){
									numberOfInfant++;
								}
							});
							departureFlightSearchData.numberOfAdult = numberOfAdult;
							departureFlightSearchData.numberOfChild = numberOfChild;
							departureFlightSearchData.numberOfInfant = numberOfInfant;
							if(journeyType == 'RETURN' && $(this.orderEntryInfoData).attr("sequence")=='2'){
								entryContents.returnFlightSearchData = departureFlightSearchData;
							} else if(journeyType == 'MULTI_CITY'){
								mutiContents.push({'departureFlightSearchData': departureFlightSearchData});
							}
							else
							{
								entryContents.departureFlightSearchData = departureFlightSearchData;
							};
					});
					
				}
			});
			
			if(journeyType == 'ONE_WAY'){
				journeyType = 'oneway';
			}else if(journeyType == 'RETURN'){
				journeyType = 'twoway';
			}else if(journeyType == 'MULTI_CITY'){
				journeyType = 'multicity';
			}
			if(journeyType == 'multicity'){
				flightSection1DataModel = JSON.stringify({'flightType':journeyType,'entrys':mutiContents})
			}else{
				entrys.push(entryContents);
				flightSection1DataModel = JSON.stringify({'flightType':journeyType,'entrys':entrys})
			}
			
			var formElementExpressions = '';
			$(['flightSection1DataModel','originalGroupId','CSRFToken']).each (function (i, e) {
				formElementExpressions += '<input name="#" type="hide" />'.replace('#', e);
			});
			
			var formExpression = '<form action="'+ACC.config.encodedContextPath+'/search/flight/'+journeyType+'" method="post"></form>';
			$form = $(formExpression).append($(formElementExpressions));
			$form.find('input[name=flightSection1DataModel]').val(flightSection1DataModel);
			$form.find('input[name=CSRFToken]').val(ACC.config.CSRFToken);
			$form.find('input[name=originalGroupId]').val(groupId);
			$form.appendTo('body').submit();
			form.remove();
		});
	},
	populateNames : function(nameId) {
		var title = $("#title" + nameId).html()
		var fname = $("#fName" + nameId).html()
		var lname = $("#lName" + nameId).html()

		$("#title").val(title)
		$("#firstName").val(fname)
		$("#lastName").val(lname)
		$("#travellerList1").hide();
	},
	showtooltip : function(parentId, tooltipId) {
		$("#" + tooltipId).toggle();

		var parentElementHeight = $("#" + parentId).height();
		var parentElementWidth = $("#" + parentId).width();

		var left = ($("#" + parentId).offset().left) - parentElementWidth + 100 + 'px';
		var top = ($("#" + parentId).offset().top) + parentElementHeight + 25 + 'px';

		$("#" + tooltipId).css({
			'left' : left,
			'top' : top
		});
		// Give the tooltip a higher z-index incase it is on an overlay
		/*
		 * if( $('.black_overlay').is(":visible")){ $("#" + tooltipId).css( {
		 * 'z-index': 1060 } ); }
		 */

		$(document).mouseup(function(e) {
			var container = $("#" + tooltipId);
			if (!container.is(e.target) // if the target of the click isn't the
										// container...
					&& container.has(e.target).length === 0) // ... nor a
																// descendant of the
																// container
			{
				container.hide();

			}

		});

		$(window).resize(function(e) {
			$("#" + tooltipId).hide();
		});

	},

	initRules:function(){
	
		var basicRule={
					//middleName:'mandatory',
					mobileNumber:["mandatory","numeric"],
					email: ["mandatory", "email"],
			};

		var nameRule = {
			travelerTitle: 'mandatory',
			firstName: 'mandatory',
			lastName:'mandatory',
		};

		this.ruleConfig = {};
		this.ruleConfig.nonPrimaryAdultForm = nameRule;
		this.ruleConfig.nonPrimaryChildForm = $.extend({childBirthday : 'mandatory'},nameRule );
		this.ruleConfig.travelerDetailsForm = $.extend({}, basicRule,nameRule);
		this.ruleConfig.flightTravelerDetailsForm = $.extend({
			passportNumber:'mandatory',
			nationality:'mandatory',
			issueCountry: 'mandatory',
			placeOfIssue:'mandatory'	
		},basicRule,nameRule);

		this.validator = new ACC.travellerValidator({
			config: this.ruleConfig,
			root : $(".contContainer")
		});
		
	},

};
