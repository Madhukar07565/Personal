//1, get ancillary and get user's selections. 2, populate data to dom.
// 3, bind event to dom 4, get user's input. 5, save the change to back end. 
// 6, calculate total ? refresh page?
ACC.ancillary = $.extend({}, ACC.ancillary, {

	_autoload : [ "bindRequiredAncillary" ],
	model : {
		wifi : null,
		pet: null,
		carparking : null

	},
	bindRequiredAncillary : function(){
		if(ACC.config.cartsection == "CART_TRAVELERS"){
			ACC.ancillary.getAncillaryData();
		}
	},
	
	initAncillary : function(){
		
		if(ACC.ancillary.model){
			var result = ACC.ancillary.model;
			var roomList = [];
			console.log("result:");
			console.log(result);
			
			if(result.roomIndex >= 0) {
				// for 1 room only
				roomList.push(result);
			} else if(result.roomList){
				roomList = result.roomList;
			}
			// YTODO_CL 
//			var roomList = JSON.parse(JSON.stringify(roomList));
//			var roomList = JSON.parse('[{"specialrequest":"I want something to be special request.","wifi":{"ancillaryType":"WIFI","duration":"10"},"activity":{"ancillaryType":"ACTIVITY","activityName":"play football","vehicleType":{"code":"MINI","type":"HotelVehicleType"},"numberOfAdult":"1","numberOfChild":"2","issueDate":"2016-09-10","duration":"2 hours","startDate":"2016-09-01","endDate":"2016-09-02"},"spa":{"ancillaryType":"SPA","searviceType":{"code":"TYPE1","type":"HotelSpaServiceType"},"numberOfAdult":"1","numberOfChild":"2","duration":"4"},"restaurant":[{"ancillaryType":"RESTAURANT","mealType":{"code":"MEAL1","type":"HotelMealType"},"numberOfAdult":"2","numberOfChild":"2"}],"equipment":{"ancillaryType":"EQUIPMENT","equipmentName":"Camera","vehicleType":{"code":"LUXARY","type":"HotelVehicleType"},"duration":"3 days","startDate":"2016-09-01","endDate":"2016-09-02","quantity":10},"transfer":{"ancillaryType":"TRANSFER","transferType":{"code":"TRANSFER1","type":"HotelTransferType"},"vehicleType":{"code":"ECONOMY","type":"HotelVehicleType"},"numberOfAdult":"2","numberOfChild":"3","issueDate":"2016-09-10"},"petstay":{"ancillaryType":"PET","numberOfPets":"1"},"earlycheckin":{"ancillaryType":"EARLY_CHECK_IN","checkInTime":"10:20"},"carparking":{"ancillaryType":"CAR_PARKING","vehicleType":{"code":"MINI","type":"HotelVehicleType"},"startDate":"2016-09-10","endDate":"2016-09-11"},"latecheckout":{"ancillaryType":"LATE_CHECK_OUT","checkoutTime":"11:28"},"breakfast":{"ancillaryType":"BREAKFAST","numberOfAdult":"1","numberOfChild":"2"},"roomIndex":0},{"specialrequest":null,"wifi":null,"activity":null,"spa":null,"restaurant":null,"equipment":null,"transfer":null,"petstay":null,"earlycheckin":null,"carparking":null,"latecheckout":null,"breakfast":null,"roomIndex":1}]');
/*********************************************************** start ******************************************************
			var roomList = 
				[
				    {
				        "specialrequest": "I want something to be special request.",
				        "wifi": {
				            "ancillaryType": "WIFI",
				            "duration": "10"
				        },
				        "activity": {
				            "ancillaryType": "ACTIVITY",
				            "activities": [{
					            "activityType": {
					            	"code": "ACTP1",
					            	"type":	"play football"
					            },
					            "vehicleType": {
					                "code": "MINI",
					                "type": "HotelVehicleType"
					            },
					            "numberOfAdult": "1",
					            "numberOfChild": "2",
					            "issueDate": "2016-09-10",
					            "duration": "2 hours",
					            "startDate": "2016-09-01",
					            "endDate": "2016-09-02"
					        }],
				        },				        
				        "spa": {
				        	"services" : [{
				        		"serviceType": {
				                "code": "TYPE1",
				                "type": "HotelSpaServiceType"
					            },
					            "numberOfAdult": "1",
					            "numberOfChild": "2",
					            "duration": "4"
				        	}],
				            "ancillaryType": "SPA",
				            "price":100
				        },
				        "restaurant": 
				            {
				                "ancillaryType": "RESTAURANT",
				                "meals":[
							                {
							                "mealType": {
							                    "code": "MEAL1",
							                    "type": "HotelMealType"
							                },
							                "numberOfAdult": "2",
							                "numberOfChild": "2"
							                }
						                ],
				                "price":200
				            }
				        ,
				        "equipment": {
				            "ancillaryType": "EQUIPMENT",
				            "equipments":[{
								"equipmentType": {
					                "code": "TYPE1",
					                "type": "HotelSpaServiceType"
						         }, 				
					            "vehicleType": {
					                "code": "LUXARY",
					                "type": "HotelVehicleType"
					            },
					            "duration": "3 days",
					            "startDate": "2016-09-01",
					            "endDate": "2016-09-02",
					            "quantity": 10
				            }],
				        },
				        "transfer": {
				            "ancillaryType": "TRANSFER",
				            "transfers": [{
					            "transferType": {
					                "code": "TRANSFER1",
					                "type": "HotelTransferType"
					            },
					            "vehicleType": {
					                "code": "ECONOMY",
					                "type": "HotelVehicleType"
					            },
					            "numberOfAdult": "2",
					            "numberOfChild": "3",
					            "issueDate": "2016-09-10"
				            }]
				        },
				        "petstay": {
				            "ancillaryType": "PET",
				            "numberOfPets": "1"
				        },
				        "earlycheckin": {
				            "ancillaryType": "EARLY_CHECK_IN",
				            "checkInTime": "10:20"
				        },
				        "carparking": {
				            "ancillaryType": "CAR_PARKING",
				            "vehicleType": {
				                "code": "MINI",
				                "type": "HotelVehicleType"
				            },
				            "startDate": "2016-09-10",
				            "endDate": "2016-09-11"
				        },
				        "latecheckout": {
				            "ancillaryType": "LATE_CHECK_OUT",
				            "checkoutTime": "11:28"
				        },
				        "breakfast": {
				            "ancillaryType": "BREAKFAST",
				            "numberOfAdult": "1",
				            "numberOfChild": "2"
				        },
				        "roomIndex": 0
				    },
				    {
				        "specialrequest": null,
				        "wifi": null,
				        "activity": null,
				        "spa": null,
				        "restaurant": null,
				        "equipment": null,
				        "transfer": null,
				        "petstay": null,
				        "earlycheckin": null,
				        "carparking": null,
				        "latecheckout": null,
				        "breakfast": null,
				        "roomIndex": 1
				    }
				];
************************************************* end ************************************************************/			
			var roomList = []; 
			
			$("form[name='ancillaryForm']").each(function(idx, ele) {
				roomList.push( {
			        "specialrequest": null,
			        "wifi": null,
			        "activity": null,
			        "spa": null,
			        "restaurant": null,
			        "equipment": null,
			        "transfer": null,
			        "petstay": null,
			        "earlycheckin": null,
			        "carparking": null,
			        "latecheckout": null,
			        "breakfast": null,
			        "roomIndex": $(ele).attr("data-index")
			    });
			});
			
			for(var i = 0; i < roomList.length; i++) {
				var ancillaryMap = roomList[i];
				var roomIndex = ancillaryMap.roomIndex;
				console.group("---------------------------- room ["+ roomIndex + "] start ----------------------------");
				//only init required ancillary
				$.each(ancillaryMap, function(key, value){
					console.log(key+":");
					console.log(value);
					if(key != "roomIndex" && ACC.ancillary[key] && ACC.ancillary[key].init && !ACC.ancillary[key].CustomRactive){
						ACC.ancillary[key].init();
					}
					var vel = $("form[name='ancillaryForm'][data-index='"+roomIndex+"']").find("div[data-ancillarytype='"+key+"']");
					if(ACC.ancillary[key] && ACC.ancillary[key].CustomRactive) {
						var customRactive = new ACC.ancillary[key].CustomRactive({el: vel});
						customRactive.set(key, value);
					}
				});
				console.groupEnd();
			}
			
		}
		
		// if model is array, else if model is object
		// new ACC.ancillary.carparking.CustomRactive({'el':'div[data-ancillarytype="carparking"]'});
	},
	
	getAncillaryData : function() {
		var options = {
			url : ACC.config.contextPath + "/checkout/multi/ancillary/hotel",
			type : 'GET',
			success : function(data) {
				if(data){
					ACC.ancillary.model = data;
					ACC.ancillary.initAncillary();
				}else{
					console.error('get empty ancillary.');
				}
				
			},
			error : function() {
				console.error('failed to get hotels ancillary.');
			}
		};

		$.ajax(options);
	},
	base : {
		onLoad : function(){
			
		},
		onSelect : function(){
			
		},
		calcPrice : function(){
			
		},
		validate : function(){
			
		},
		add : function(){
			
		},
		save : function(){
			
		},
		display : function(that, dom, index){
			console.log('in base display.');
			if (that.checked) {
				dom[index].show();
			} else {
				dom[index].hide();
			}
		},
		displayPrice : function(){
			
		}
	}

});
