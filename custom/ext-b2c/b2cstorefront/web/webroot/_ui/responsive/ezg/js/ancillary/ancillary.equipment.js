ACC.ancillary.equipment = $.extend({}, ACC.ancillary.base, {

	init : function(){
		ACC.ancillary.model.equipment.getInitdata = function() {
			return{
				"equipments":[], 
				"price":0
			};
		}	
	    ACC.ancillary.equipment.CustomRactive = Ractive.extend({
	        template: "#equipmentTemplate",
	        data: function() {
	        	return {"durationNums": new Array(5)};
	        },
			onrender: function() {
				var thisClass = this;
			},
	        onCheck: function() {
	        	var thisClass = this;
//	        	var $equipmentType = $(thisClass.el).find("select[name='equipmentType']").find("option:selected");
//	        	var $numberOfAdult = $(thisClass.el).find("select[name='numberOfAdult']").find("option:selected");
//	        	var $numberOfChild = $(thisClass.el).find("select[name='numberOfChild']").find("option:selected");
	        	
	        	var event = this.event;
				if($(event.node).is(":checked")) {
					this.set("equipment", ACC.ancillary.model.equipment.getInitdata());
					$(thisClass.el).find("li.ancillaryshow11").show()
				} else {
					this.set("equipment", null);
					$(thisClass.el).find("li.ancillaryshow11").hide();
				}				
	        },
	        dataChange: function(){
	        	var event = this.event;
	        	var value = $(event.node).val();
	        	var equipments = this.get("equipment.equipments");
	        	this.set("equipment.price", 500 * equipments.length);
	        	console.log(this.get());
	        },
	        removeData: function(num) {
	        	var equipments = this.get("equipment.equipments");
	        	equipments.splice(num, 1);
	        	this.dataChange();
	        },
	        pushData: function() {
	        	var thisClass = this;
	        	var $equipmentType = $(thisClass.el).find("select[name='equipmentType']").find("option:selected");
	        	var $vehicleType = $(thisClass.el).find("select[name='vehicleType']").find("option:selected");
	        	var $duration = $(thisClass.el).find("select[name='duration']").find("option:selected");
	        	var $startDate = $(thisClass.el).find("input[name='startDate']");
	        	var $endDate = $(thisClass.el).find("input[name='endDate']");
	        	var $quantity = $(thisClass.el).find("input[name='quantity']");
	        	if($equipmentType && $equipmentType.val() && $vehicleType && $vehicleType.val() ) {
	        		var equipments = this.get("equipment.equipments");
	        		equipments.push({
	        			equipmentType: {"code":$equipmentType.val(), "type":$equipmentType.html()},
	        			vehicleType: {"code":$vehicleType.val(), "type":$vehicleType.html()},
	        			duration:$duration.val(),
	        			startDate:$startDate.val(),
	        			endDate:$endDate.val(),
	        			quantity: $quantity.val()
	        		});
	        		$equipmentType.prop("selected", false);
	        		$vehicleType.prop("selected", false);
	        		$duration.prop("selected", false);
	        		$startDate.val("");
	        		$endDate.val("");
	        		$quantity.val("");
	        	}
	        	this.dataChange();
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
