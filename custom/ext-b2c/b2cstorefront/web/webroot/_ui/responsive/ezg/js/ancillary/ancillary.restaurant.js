ACC.ancillary.restaurant = $.extend({}, ACC.ancillary.base, {

	init : function(){
		ACC.ancillary.model.restaurant.getInitdata = function() {
			return{
				"meals":[], 
				"price":0
			};
		}	
	    ACC.ancillary.restaurant.CustomRactive = Ractive.extend({
	        template: "#restaurantTemplate",
	        data: function() {
	        	return {"adultNums"  : new Array(5), "childNums": new Array(5)};
	        },
	        onCheck: function() {
	        	var thisClass = this;
	        	var $mealType = $(thisClass.el).find("select[name='mealType']").find("option:selected");
	        	var $numberOfAdult = $(thisClass.el).find("select[name='numberOfAdult']").find("option:selected");
	        	var $numberOfChild = $(thisClass.el).find("select[name='numberOfChild']").find("option:selected");
	        	
	        	var event = this.event;
				if($(event.node).is(":checked")) {
					this.set("restaurant", ACC.ancillary.model.restaurant.getInitdata());
					console.log($(thisClass.el).find("li.ancillaryshow7"));
					$(thisClass.el).find("li.ancillaryshow7").show()
				} else {
					this.set("restaurant", null);
					console.log($(thisClass.el).find("li.ancillaryshow7"));
					$(thisClass.el).find("li.ancillaryshow7").hide();
				}				
	        },
	        dataChange: function(){
	        	var event = this.event;
	        	var value = $(event.node).val();
	        	var meals = this.get("restaurant.meals");
	        	this.set("restaurant.price", 100*meals.length);
	        	console.log(this.get());
	        },
	        removeData: function(num) {
	        	var meals = this.get("restaurant.meals");
	        	meals.splice(num, 1);
	        	this.dataChange();
	        },
	        pushData: function() {
	        	var thisClass = this;
	        	var $mealType = $(thisClass.el).find("select[name='mealType']").find("option:selected");
	        	var $numberOfAdult = $(thisClass.el).find("select[name='numberOfAdult']").find("option:selected");
	        	var $numberOfChild = $(thisClass.el).find("select[name='numberOfChild']").find("option:selected");
	        	if($mealType && $mealType.val() && (($numberOfAdult && $numberOfAdult.val())|| $numberOfChild && $numberOfChild.val())) {
	        		var meals = this.get("restaurant.meals");
	        		meals.push({
	        			mealType: {"code":$mealType.val(), "type":$mealType.html()},
	        			numberOfAdult: $numberOfAdult ? $numberOfAdult.val() : "",
	        			numberOfChild: $numberOfChild ? $numberOfChild.val() : ""
	        		});
	        		$mealType.prop("selected", false);
	        		$numberOfAdult.prop("selected", false);
	        		$numberOfChild.prop("selected", false);
	        	}
	        	this.dataChange();
	        }
	        
	    });
		
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
