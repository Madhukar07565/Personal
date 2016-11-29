ACC.ancillary.spa = $.extend({}, ACC.ancillary.base, {

	init : function(){
		ACC.ancillary.model.spa.getInitdata = function() {
			return{
				"services":[], 
				"price":0
			};
		}	
	    ACC.ancillary.spa.CustomRactive = Ractive.extend({
	        template: "#spaTemplate",
	        data: function() {
	        	return {"adultNums"  : new Array(5), "childNums": new Array(5), "durationNums": new Array(5)};
	        },
	        onCheck: function() {
	        	var thisClass = this;
	        	var $serviceType = $(thisClass.el).find("select[name='serviceType']").find("option:selected");
	        	var $numberOfAdult = $(thisClass.el).find("select[name='numberOfAdult']").find("option:selected");
	        	var $numberOfChild = $(thisClass.el).find("select[name='numberOfChild']").find("option:selected");
	        	
	        	var event = this.event;
				if($(event.node).is(":checked")) {
					this.set("spa", ACC.ancillary.model.spa.getInitdata());
					console.log($(thisClass.el).find("li.ancillaryshow8"));
					$(thisClass.el).find("li.ancillaryshow8").show()
				} else {
					this.set("spa", null);
					console.log($(thisClass.el).find("li.ancillaryshow8"));
					$(thisClass.el).find("li.ancillaryshow8").hide();
				}				
	        },
	        dataChange: function(){
	        	var event = this.event;
	        	var value = $(event.node).val();
	        	var services = this.get("spa.services");
	        	this.set("spa.price", 500*services.length);
	        	console.log(this.get());
	        },
	        removeData: function(num) {
	        	var services = this.get("spa.services");
	        	services.splice(num, 1);
	        	this.dataChange();
	        },
	        pushData: function() {
	        	var thisClass = this;
	        	var $serviceType = $(thisClass.el).find("select[name='serviceType']").find("option:selected");
	        	var $duration = $(thisClass.el).find("select[name='duration']").find("option:selected");
	        	var $numberOfAdult = $(thisClass.el).find("select[name='numberOfAdult']").find("option:selected");
	        	var $numberOfChild = $(thisClass.el).find("select[name='numberOfChild']").find("option:selected");
	        	if($serviceType && $serviceType.val() && $duration && $duration.val() && (($numberOfAdult && $numberOfAdult.val())|| $numberOfChild && $numberOfChild.val())) {
	        		var services = this.get("spa.services");
	        		services.push({
	        			serviceType: {"code":$serviceType.val(), "type":$serviceType.html()},
	        			numberOfAdult: $numberOfAdult ? $numberOfAdult.val() : "",
	        			numberOfChild: $numberOfChild ? $numberOfChild.val() : "",
	        			duration: 	$duration.val()
	        		});
	        		$serviceType.prop("selected", false);
	        		$numberOfAdult.prop("selected", false);
	        		$numberOfChild.prop("selected", false);
	        		$duration.prop("selected", false);
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
