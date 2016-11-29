ACC.ancillary.earlycheckin = $.extend({}, ACC.ancillary.base, {

	init : function(){
		ACC.ancillary.model.earlycheckin.getInitdata = function() {
			return{
				checkInTime: "",
				price:0
			};
		}	
	    ACC.ancillary.earlycheckin.CustomRactive = Ractive.extend({
	        template: "#earlycheckinTemplate",
	        data: function() {
	        	return {};
	        },
	        onCheck: function() {
	        	var thisClass = this;
				var event = this.event;
				if($(event.node).is(":checked")) {
					this.set("earlycheckin", ACC.ancillary.model.earlycheckin.getInitdata());
				} else {
					this.set("earlycheckin", null);
				}				
	        },
	        dataChange: function(){
	        	var event = this.event;
	        	var value = $(event.node).val();
	        	this.set("earlycheckin.price", 100);
	        	console.log(this.get());
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
	displayDuration : function(me) {
		if (me.checked) {
			$('#wifiDuration').show();
		} else {
			$('#wifiDuration').hide();
		}
	},
	displayPrice : function(days) {
		if (days > 0) {
			$('#wifiPrice').show();
		} else {
			$('#wifiPrice').hide();
		}
	},
	save : function(){
		//TODO save wifi and price to room order entry.
	}
});
