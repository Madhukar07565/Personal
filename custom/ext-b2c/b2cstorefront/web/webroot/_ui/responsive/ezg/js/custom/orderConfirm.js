(function(){
	"use strict";
	
	var $dataSource = $("meta#orderList");

	if($.isEmptyObject($dataSource) || $dataSource.length === 0  ){
		return;
	}
	
	var oOrderData = JSON.parse($dataSource.attr("value"));

	constructData(oOrderData);	


//	var OrderConfirmComponent = Ractive.extend({
//			formatterWithYear: function(date){
//				var aDate =  new Date(date).toString().split(' ');
//				return aDate[2] + " " + aDate[1] + ". " +   aDate[3];
//			   },
//			  formatterDate: function(date){
//				var aDate =  new Date(date).toString().split(' ');
//				return aDate[2] + " " + aDate[1] + ". " +  aDate[0] +". " ;
//			  },
//			  getTime:function(date){
//					var aDate =  new Date(date).toString().split(' ');
//					return aDate[4].slice(0,-3);
//			  },
//			  getWeekDay:function(date){
//				var aDate =  new Date(date).toString().split(' ');
//				return aDate[0];
//			  },
//			  oninit : function(options){
//				
//			  }
//	});
	
	var flightComponent = new Ractive({
      el: '#flight-root',
      template: '#showFligthTemplate',
      data: { 
		  oDataModel: oOrderData,
		  	formatterWithYear: function(date){
				var aDate =  new Date(date).toString().split(' ');
				return aDate[2] + " " + aDate[1] + ". " +   aDate[3];
			   },
			  formatterDate: function(date){
				var aDate =  new Date(date).toString().split(' ');
				return aDate[2] + " " + aDate[1] + ". " +  aDate[0] +". " ;
			  },
			  getTime:function(date){
					var aDate =  new Date(date).toString().split(' ');
					return aDate[4].slice(0,-3);
			  },
			  getWeekDay:function(date){
				var aDate =  new Date(date).toString().split(' ');
				return aDate[0];
			  },
			  renderRate:function(count){

				  var sContent = '';
				  if(Number(count) > 0){
					  for(var i = 0; i < count; i++ ){
						  sContent +=	'<span class="fullRatingstar_icon mB5"></span>';
					  }
				  }
				  return sContent;
			  }
	  } 		   
	});



	function constructData(oOrder){
			
	//	var aFligth = [];

		oOrder.entries.forEach(function(orderEntry){
			
			if(orderEntry.orderEntryType === "FLIGHT_GROUP" ){

				$.extend(orderEntry, {
					aRoute: [],
					adultCount: 0,
					childCount:0,
					departure:null

				});

				orderEntry.entries.forEach(function(flight){
					
					if(flight.orderEntryType === 'FLIGHT'){
						var oTemp = flight.orderEntryInfoData.flightDetailInfoData.commonFlightInfoData;
						if(orderEntry.aRoute.length === 0){
							orderEntry.aRoute.push(oTemp.fromCity);
							orderEntry.aRoute.push(oTemp.toCity);
						}else if(oTemp.fromCity === orderEntry.aRoute[orderEntry.aRoute.length - 1]){
							orderEntry.aRoute.push(oTemp.toCity);
						}

						if(oTemp.commonFlightDetailList.length > 1){
							oTemp.commonFlightDetailList.reduce(function(pre, current){
										pre.timeDiff = 	timeDiff(current.arrivalTime, pre.departureTime);
										return current;
							});
						}
					}
				});
				orderEntry.departure = orderEntry.entries[0].orderEntryInfoData.flightDetailInfoData.commonFlightInfoData.departureTime;
				orderEntry.entries[0].entries.forEach(function(oTicket){
				
					var tempTicket = oTicket.orderEntryInfoData.ticketDetailInfoData.passengerType;
					if(tempTicket.code ==='ADULT'){
						orderEntry.adultCount++;
					}else if(tempTicket.code ==='CHILD'){
						orderEntry.childCount++;
					}
				});
			}else if(orderEntry.orderEntryType === "HOTEL"){

				var hotelInfo = orderEntry.orderEntryInfoData.hotelDetailInfoData;

				switch(hotelInfo.hotelRate){

					case 'ONE': 
						hotelInfo.rateCount=  1;
						break;
					case 'TWO': 
						hotelInfo.rateCount=2;
						break;

					case 'THREE': 
						hotelInfo.rateCount=3;
						break;

					case 'FOUR': 
						hotelInfo.rateCount=4;
						break;
					case 'FIVE': 
						hotelInfo.rateCount=5;

				}



			}
		});

	}
	
	function timeDiff(date1, date2){

		var _time = date1 - date2;

		var _second = _time/1000;

		if(_second > 60){

			var min = Math.floor(_second/60);
			_second = _second%60;

			if(min > 60){

				var hour = Math.floor(min/60);
				min = min%60;
				if(hour > 24){
					var day = Math.floor(hour/60);
					hour = hour%24;
					return  day + " days " + hour + " hours " + min + " min ";

				}else{
					return hour + " hours " + min + " min ";
				}

			}else{

				return min + " min ";
			}

		}else{
			return _second + " seconds ";
		}
	}

})();
