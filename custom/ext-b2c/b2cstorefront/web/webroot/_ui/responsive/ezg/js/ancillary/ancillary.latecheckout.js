ACC.ancillary.latecheckout = $.extend({}, ACC.ancillary.base, {
	init : function(){
		ACC.ancillary.model.latecheckout.getInitdata = function() {
			return{
				checkoutTime: "",
				price:0
			};
		}	
	    ACC.ancillary.latecheckout.CustomRactive = Ractive.extend({
	        template: "#latecheckoutTemplate",
	        data: function() {
	        	return {};
	        },
	        onCheck: function() {
	        	var thisClass = this;
				var event = this.event;
				if($(event.node).is(":checked")) {
					this.set("latecheckout", ACC.ancillary.model.latecheckout.getInitdata());
				} else {
					this.set("latecheckout", null);
				}				
	        },
	        dataChange: function(){
	        	var event = this.event;
	        	var value = $(event.node).val();
	        	this.set("latecheckout.price", 100);
	        	console.log(this.get());
	        }
	    });
		
	},
	calcPrice : function(days){
		return days*1000;
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
