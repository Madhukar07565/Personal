var EnquirySpecificReactive = Ractive.extend({
	computed: {
		fullname: {
			set: function (fullname) {
				this.cnk.setFirstMiddleLastNames(fullname, this.get());
				this.update();
			},
			get: function () {
				var viewModel = this.get();
				return this.cnk.getDisplayNames( [ viewModel.firstName, viewModel.middleName, viewModel.lastName ] );
			}
		}
	}
});

var FlightBookReactive = Ractive.extend({
	
	
	bookFlight : function(theSelectedFlights, contextPath){
		var resultCtx = ractiveTopFlight.resultList;
		var searchCtx = ractiveTopFlight.search;
		
		var selectedFlights;
		var contextPath = contextPath;
		if(theSelectedFlights && theSelectedFlights.length){
			selectedFlights = theSelectedFlights;
			
		}else{
			selectedFlights = resultCtx.get('selectedFlights');
			contextPath = resultCtx.get('contextPath');
		}
	
		
		
		var numberOfAdult = searchCtx.get('numberOfAdult' );
		var numberOfChild = searchCtx.get('numberOfChild' );
		var numberOfInfant = searchCtx.get('numberOfInfant');
		var journeyType = searchCtx.get('radioSearchFlight');
		
		var originalGroupId = searchCtx.get('originalGroupId');
		
		var formElementExpressions = '';
		$(['numberOfAdult', 'numberOfChild', 'numberOfInfant', 'isBooking', 'journeyType', 'originalGroupId','CSRFToken']).each (function (i, e) {
			formElementExpressions += '<input name="#" type="hidden" />'.replace('#', e);
		});
		
		$.each(selectedFlights, function(i, e){
			formElementExpressions += '<input name="flightIds[' + i + ']" type="hidden" value="' + selectedFlights[i].id + '"/>';
			formElementExpressions += '<input name="selectedFareTypes[' + i + ']" type="hidden" value="' + selectedFlights[i].selectdFareType + '"/>'
		});
		
		var formExpression = '<form action="' + contextPath +'/cart/book/flight" method="post"></form>';
		
		$form = $(formExpression).append($(formElementExpressions));
		$form.find('input[name=numberOfAdult]').val(numberOfAdult);
		$form.find('input[name=numberOfChild]').val(numberOfChild);
		$form.find('input[name=numberOfInfant]').val(numberOfInfant);
		$form.find('input[name=journeyType]').val(journeyType);
		$form.find('input[name=originalGroupId]').val(originalGroupId);
		
		$form.find('input[name=isBooking]').val(false);
		$form.find('input[name=CSRFToken]').val(ACC.config.CSRFToken);

		
		ACC.account.loginBetweenBook(function(){
			$form.appendTo('body').submit();
		})

		console.log("fsgrewgrewgregrew");
	},
	addToFlight : function(theSelectedFlights, contextPath){
		var resultCtx = ractiveTopFlight.resultList;
		var searchCtx = ractiveTopFlight.search;
		
		var selectedFlights;
		var contextPath = contextPath;
		if(theSelectedFlights && theSelectedFlights.length){
			selectedFlights = theSelectedFlights;
			
		}else{
			selectedFlights = resultCtx.get('selectedFlights');
			contextPath = resultCtx.get('contextPath');
		}
	
		
		
		var numberOfAdult = searchCtx.get('numberOfAdult' );
		var numberOfChild = searchCtx.get('numberOfChild' );
		var numberOfInfant = searchCtx.get('numberOfInfant');
		var journeyType = searchCtx.get('radioSearchFlight');
		
		var originalGroupId = searchCtx.get('originalGroupId');
		
		var formElementExpressions = '';
		$(['numberOfAdult', 'numberOfChild', 'numberOfInfant', 'isBooking', 'journeyType', 'originalGroupId','CSRFToken']).each (function (i, e) {
			formElementExpressions += '<input name="#" type="hidden" />'.replace('#', e);
		});
		
		$.each(selectedFlights, function(i, e){
			formElementExpressions += '<input name="flightIds[' + i + ']" type="hidden" value="' + selectedFlights[i].id + '"/>';
			formElementExpressions += '<input name="selectedFareTypes[' + i + ']" type="hidden" value="' + selectedFlights[i].selectdFareType + '"/>';
		});
		
		var formExpression = '<form action="' + contextPath +'/cart/add/flight" method="post" id="addTocartForm"></form>';
		
		$form = $(formExpression).append($(formElementExpressions));
		$form.find('input[name=numberOfAdult]').val(numberOfAdult);
		$form.find('input[name=numberOfChild]').val(numberOfChild);
		$form.find('input[name=numberOfInfant]').val(numberOfInfant);
		$form.find('input[name=journeyType]').val(journeyType);
		$form.find('input[name=originalGroupId]').val(originalGroupId);
		
		$form.find('input[name=isBooking]').val(false);
		$form.find('input[name=CSRFToken]').val(ACC.config.CSRFToken);
		$form.appendTo('body');
		
		
		$("#addTocartForm").ajaxForm({
			success : function (data){
		    	if(data && data.status == "addtocart-success"){
		    		console.log("add to cart success!");
		        	$("#miniCartProdCount").html(data.totalCount);
		        	ACC.minicart.showMiniCart(data.totalCount);
		    	}else{
		    		console.error("add to cart faield!");
		    	}
		    	
		 },
			error : function (){
		    	popupwin('loginCont', 'black_overlay');
		    }
		});
		ACC.account.loginBetweenBook(function(){
				$form.submit();
				$form.remove();
			}	
		);
	}

});

Ractive.decorators.slider = function(decoratedDom, minKeypath, maxKeypath,minSelectedKeypath,maxSelectedKeypath, stopCallback, givenMax) {
	var that = this;
	var minValue = that.get(minKeypath);
	var maxValue = that.get(maxKeypath);
//	if (!/^[0-9]+$/.test(minValue + "")) {
//		minValue = 0;
//	}
//	if (!/^[0-9]+$/.test(maxValue + "")) {
//		maxValue = 10000;
//	}
	this.set(minKeypath, minValue);
	this.set(maxKeypath, maxValue);
	if ($.fn.slider) {
		$(decoratedDom).slider({
			range : true,
			min : 0,
			max : (givenMax == null? 20000 : givenMax),
			values : [ minValue, maxValue ],
			slide : function(event, ui) {
				that.set(minKeypath, ui.values[0]);
				that.set(maxKeypath, ui.values[1]);
				if(maxSelectedKeypath && minSelectedKeypath){
					that.set(minSelectedKeypath,true);
					that.set(maxSelectedKeypath,true);
				}
			},
			stop : function(event, ui) {
				if (0 == (that.get(minKeypath) - minValue) && 0 == (that.get(maxKeypath) - maxValue)) {
					return;
				} else {
					that[stopCallback]();
				}
			}
		});
	}
	return {
		teardown : function() {
			$(decoratedDom).datepicker('destroy');
		}
	};
};

Ractive.decorators.datepicker = function(decoratedDom) {
	var that = this;
	if ($.fn.datepicker) {
		$(decoratedDom).datepicker({
			numberOfMonths : 2,
			minDate : 0,
			dateFormat : "yy-mm-dd",
			onSelect : function(dateText) {
				$(this).css("color", "#333333");
				that.updateModel();
			}
		});
	}
	return {
		teardown : function() {
			$(decoratedDom).datepicker('destroy');
		}
	};
};

Ractive.defaults.clone = function (object) {
	return JSON.parse(JSON.stringify(object));
};

Ractive.defaults.cnk = {
	formatString: function () {
	    var args = arguments;
	    var counter = 1;
	    function replaceCallback(match) {
	    	try {
	    		return typeof args[counter] != 'undefined' ? args[counter] : match;
	    	} finally {
	    		counter++;
	    	}
	    }
	    return args[0].replace(/%s/g, replaceCallback);
	},
	showDialog: function (message, title, typeInfoWarnError, callbackFunction) {
		// FIXME it will be implemented later when style is confirmed
		alert(message);
	},
	getDisplayNames: function (names) {
		var displayNames = [];
		for (var i = 0; i < names.length; i++) {
			if (names[i]) {
				displayNames.push(names[i]);
			}
		}
		return displayNames.join(", ");
	},
	setFirstMiddleLastNames: function (fullname, targetJson, propNames) {
		if (!propNames) {
			propNames = "firstName,middleName,lastName".split(',');
		}
		var names = this.getFirstMiddleLastNames(fullname);
		for (var i = 0; i < propNames.length; i++) {
			targetJson[propNames[i]] = names[i];
		}
	},
	getFirstMiddleLastNames: function (fullname) {
		if (!fullname || /^\s*$/.test(fullname) || /^[\W_]+$/.test(fullname)) {
			return ["", "", ""];
		}
		
		var dummyNames = fullname.trim().split(/[_\W]+/g);
		var names = [];
		for (var i = 0; i < dummyNames.length; i++) {
			if (dummyNames[i]) {
				names.push(dummyNames[i]);
			}
		}
		
		if (names.length >= 3) {
			return [names[0], names.slice(1, names.length - 1).join(" ").trim(), names[names.length - 1]];
		} else if (names.length == 2) {
			return [names[0], "", names[names.length - 1]];
		} else {
			return [names[0], "", ""];
		}
	},
	validator: {
		check: function (ractiveInstance, options) {
			/*
			 * {
			 *   type: 'Number'
			 *   required: true,
			 *   numberRange: [100, null],
			 *   pattern: /^9[0-9]+$/,
			 * * * * * * * * * * * * * * * * * * * * * 
			 *   label: 'label/placeholder/customizing',
			 *   keypath: "test.name",
			 *   autoTrim: true,
			 *   errors:
			 *   {
			 *     required: 'HI THERE, [%s] ARE REQUIRED!',
			 *     pattern: 'The format of %s should be YYMMDD.'
			 *   }
			 * }
			 */
			if (!(options instanceof Array)) {
				throw "options must be an array!";
			}
			var errorNodeMessageArray = [];
			for (var i = 0; i < options.length; i++) {
				var option = options[i];
				var val = ractiveInstance.get(option.keypath);
				if (typeof val == "string") {
					val = val.trim();
				}
				// auto detect label name - starts
				var label = option['label'];
				if (!label) {
					try {
						var refNode = ractiveInstance._twowayBindings[option.keypath][0].element.node;
						var ref$Label = !!refNode.id ? $("label[for=" + refNode.id + "]") : "";
						if (ref$Label && ref$Label.length) {
							label = ref$Label.text();
						} else {
							label = refNode.placeholder;
						}
					} catch (e) { }
				}
				// auto detect label name - ends
				for (var attr in option) {
					if (['errors', 'keypath', 'label', 'autoTrim'].indexOf(attr) > -1) {
						continue;
					}
					var checker = this.optionCheckers["_" + attr];
					if (!checker) {
						throw "_" + attr + ". No such a specified checker, please fix it!"
					}
					var error = checker(val, option[attr]);
					if (!!error && option.errors && option.errors[attr]) {
						error = option.errors[attr];
					}
					if (!error) {
						continue;
					}
					var domNode = ractiveInstance._twowayBindings[option.keypath][0].element.node;
					var nodePos = errorNodeMessageArray.indexOf(domNode);
					var nodeMessages = null;
					if (nodePos < 0) {
						errorNodeMessageArray.push(domNode);
						nodePos = errorNodeMessageArray.length - 1;
						errorNodeMessageArray.push([]);
					}
					nodeMessages = errorNodeMessageArray[nodePos + 1];
					nodeMessages.push(ractiveInstance.cnk.formatString(error, label));
				}
			}
			// create effect for error inputs
			for (var i = 0; i < errorNodeMessageArray.length; i += 2) {
				try {
					if (0 == i) {
						errorNodeMessageArray[i].focus();
					}
					var errorMessages = "<font color=red>" + errorNodeMessageArray[i + 1].join("<br>") + "</font>";
					var $node = $(errorNodeMessageArray[i]);
					$node.effect('highlight', {color: 'Crimson'}, 6000).attr('title', '').tooltip( { content: errorMessages } ).tooltip('open');
				} catch (e) {
					console.error(e);
				}
				noErrs = false;
			}
			return errorNodeMessageArray.length == 0;
		},
		optionCheckers : {
			_type: function (val, expectation) {
				switch (expectation) {
					case 'number':
						if (typeof val == 'number') {
						} else if (!/^[1-9][0-9]*([.][0-9]+)?$/.test(val)) {
							return 'Number type is required for %s.';
						}
						break;
					case 'email':
						var regex = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
						if (!regex.test(val)) {
							return 'Email format is incorrect for %s.';
						}
						break;
					default:
						throw 'Type [' + val + '] is not supported for now, fix it yourself:)';
				}
			},
			_required: function (val) {
				if (val == null || val == undefined || (new String(val).length) == 0) {
					return '%s is mandatory.';
				}
			},
			_lengthRange: function (val, expectation) {
				var min = (typeof expectation[0] == 'number') ? expectation[0] : undefined;
				var max = (typeof expectation[1] == 'number') ? expectation[1] : undefined;
				val = new String(val);
				if (min != undefined && val.length < min) {
					return 'Min length of %s cannot be less than ' + min;
				}
				if (max != undefined && val.length > max) {
					return 'Max length of %s cannot be greater than ' + max;
				}
			},
			_numberRange: function (val, expectation) {
				var min = (typeof expectation[0] == 'number') ? expectation[0] : undefined;
				var max = (typeof expectation[1] == 'number') ? expectation[1] : undefined;
				if (min != undefined && val < min) {
					return 'Min value of %s cannot be less than ' + min;
				}
				if (max != undefined && val > max) {
					return 'Max value of %s cannot be greater than ' + max;
				}
			},
			_pattern: function (val, expectation) {
				if (!(expectation instanceof RegExp)) {
					throw 'pattern check can only work with RegExp object';
				}
				if (!expectation.test(val)) {
					return '%s donot match pattern ' + new String(expectation);
				}
			}
		}
	},
	submitForm: function (uri, jsonParamObj, method, isAjax, ajaxCallback) {
		method = method || 'post';
		jsonParamObj = jsonParamObj || {};
		if (method == 'post') {
			jsonParamObj.CSRFToken = ACC.config.CSRFToken;
		}
		
		var hiddenInputs = [];
		for (var propName in jsonParamObj) {
			hiddenInputs.push('<input name="#" type="hidden" />'.replace('#', propName)); 
		}
		var formExpression = '<form action="' + uri + '" method="' + method +  '"></form>';
		$form = $(formExpression).append(hiddenInputs.join(''));
		for (var propName in jsonParamObj) {
			$form.find('input[name=' + propName + ']').val(JSON.stringify(jsonParamObj[propName]));
		}
		
		if (isAjax) {
			$.ajax({
		           type: method,
		           url: uri,
		           data: $form.serialize(),
		           success: function(data)
		           {
		        	   if (ajaxCallback) {
		        		   ajaxCallback(data);
		        	   }
		           }
			});
		} else {
			$form.appendTo('body').submit();
		}
	},
	roomsService : {
		changeRoomSetting : function(roomsKeypath, newRoomKeypath) {
			var rooms = this.get(roomsKeypath);
			for (var i = 0; i < rooms.length; i++) {
				console.log(!rooms[0]);
				if (!rooms[i]) {
					this.set(roomsKeypath + '[' + i + ']', this.get(newRoomKeypath)());
				}
			}
			this.set(roomsKeypath, rooms);
		},
		increaseCountFor : function(roomsKeypath, target, roomIndex) {
			var keypath = roomsKeypath + '[' + roomIndex + '].' + target;
			var isPaxCountMatched = Ractive.defaults.cnk.roomsService.isPaxCountMatched(
					this.get(roomsKeypath + '[' + roomIndex + '].adultCount'),
					this.get(roomsKeypath + '[' + roomIndex + '].children').length,
					this.get(roomsKeypath + '[' + roomIndex + '].infants').length, target, true);
			if (!isPaxCountMatched) {
				return;
			}
			if (target.indexOf('adultCount') > -1) {
				console.log("keypath:" + this.get(keypath));
				if (this.get(keypath) == 9) {
					return;
				}
				this.add(keypath, 1);
			} else {
				// handle children and infants
				var childrenSize = this.get(roomsKeypath + '[' + roomIndex + '].children').length;
				var infantsSize = this.get(roomsKeypath + '[' + roomIndex + '].infants').length;
				if (childrenSize + infantsSize == 9) {
					return;
				}
				if (target == 'children' && childrenSize == 8) {
					return;
				}
				this.push(keypath, -1); // -1 means Age
			}
		},
		decreaseCountFor : function(roomsKeypath, target, roomIndex) {
			var keypath = roomsKeypath + '[' + roomIndex + '].' + target;
			var isPaxCountMatched = Ractive.defaults.cnk.roomsService.isPaxCountMatched(
					this.get(roomsKeypath + '[' + roomIndex + '].adultCount'), 
					this.get(roomsKeypath + '[' + roomIndex + '].children').length,
					this.get(roomsKeypath + '[' + roomIndex + '].infants').length, target, false);
			if (!isPaxCountMatched) {
				return;
			}
			if (target.indexOf('adultCount') > -1) {
				if (this.get(keypath) > 1) {
					this.subtract(keypath, 1);
				}
			} else {
				this.pop(keypath);
			}
		},
		isPaxCountMatched : function(adultCount, childCount, infantCount, target, isIncreasing) {
			if (isIncreasing) {
				if (target.indexOf('adult') > -1) {
					adultCount++;
				} else if (target.indexOf('child') > -1) {
					childCount++;
				} else if (target.indexOf('infant') > -1) {
					infantCount++;
				}
			} else {
				if (target.indexOf('adult') > -1) {
					adultCount--;
				} else if (target.indexOf('child') > -1) {
					childCount--;
				} else if (target.indexOf('infant') > -1) {
					infantCount--;
				}
			}
			if (adultCount == 0 || adultCount == 10) {
				return false;
			}
			try {
				var PAX_COUNT_RULES = {};
				for (var i = 1; i <= 9; i++)
					PAX_COUNT_RULES[i] = {
						'children' : (9 - i),
						'infants' : i
					};
				var incRule = PAX_COUNT_RULES[adultCount];
				var targetChildCount = PAX_COUNT_RULES[adultCount]['children'];
				var targetInfantCount = PAX_COUNT_RULES[adultCount]['infants'];
				return (childCount <= targetChildCount && infantCount <= targetInfantCount);
			} catch (e) {
				console.error(e);
				return false;
			}
		}
	}
};
