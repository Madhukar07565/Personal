ACC.ancillary.breakfast = $.extend({}, ACC.ancillary.base, {

	init : function(){
		ACC.ancillary.model.breakfast.getInitdata = function() {
			return{
				numberOfAdult: "",
				numberOfChild: "",
				price:0
			};
		}	
	    ACC.ancillary.breakfast.CustomRactive = Ractive.extend({
	        template: "#breakfastTemplate",
	        data: function() {
	        	return {"adultNums"  : new Array(5), "childNums": new Array(5)};
	        },
	        onCheck: function() {
	        	var thisClass = this;
				var $selectDom = $(thisClass.el).find("select[name='numberOfAdult']");
				var thisClass = this;
				var event = this.event;
				if($(event.node).is(":checked")) {
					this.set("breakfast", ACC.ancillary.model.breakfast.getInitdata());
				} else {
					this.set("breakfast.numberOfAdult", null);
					this.set("breakfast.numberOfChild", null);
					this.set("breakfast", null);
				}				
	        },
	        dataChange: function(){
	        	var event = this.event;
	        	var value = $(event.node).val();
	        	this.set("breakfast.price", 100);
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
