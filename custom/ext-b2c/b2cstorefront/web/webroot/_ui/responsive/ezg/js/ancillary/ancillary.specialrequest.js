ACC.ancillary.specialrequest = $.extend({}, ACC.ancillary.base, {

	init : function(){
		ACC.ancillary.model.specialrequest.getInitdata = function() {
			return{
				duration: "",
				price:0
			};
		}	
	    ACC.ancillary.specialrequest.CustomRactive = Ractive.extend({
	        template: "#specialrequestTemplate",
	        data: function() {
	        	return {};
	        },
	        onCheck: function() {
	        },
	        dataChange: function(){
	        	var event = this.event;
	        	var value = $(event.node).val();
	        	console.log("" + event.node.name + ":" + value);
	        }
	    });
		
/**		
		if($("[id=wifiTemplate]").length > 0){
			new WifiDom({
//				el: '#wifiele',
				el: 'div[data-ancillarytype="wifi"]',
				template: '#wifiTemplate',
				data: {
					wifidays  : new Array(30)
				}
			});
		}
**/		
//		var wifiCheckBox = $("[name=wifi]");
//		var wifiDur = $("[name=wifiDuration]");
//		//TODO handle dom as array for multi rooms.
//		wifiCheckBox.change(function(e){
//			e.preventDefault();
//			console.log("select wifi");
//			var me = this;
//			ACC.ancillary.wifi.displayDuration(me);
//		});
//		wifiDur.change(function(e) {
//			e.preventDefault();
//			var days = $(e.target.selectedOptions).val();
//			console.log("select wifi " + days +" days");
//			var price = ACC.ancillary.wifi.calcPrice(days);
//			ACC.ancillary.wifi.save(days);
//			ACC.ancillary.wifi.displayPrice(days);
//		});
	},
	calcPrice : function(days){
		return days*1000;
	},
	save : function(){
		//TODO save wifi and price to room order entry.
	}
});
