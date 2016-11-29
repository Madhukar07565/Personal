ACC.ancillary.activity = $.extend({}, ACC.ancillary.base, {

	init : function(){
		ACC.ancillary.model.activity.getInitdata = function() {
			return{
				"activities":[], 
				"price":0
			};
		}	
	    ACC.ancillary.activity.CustomRactive = Ractive.extend({
	        template: "#activityTemplate",
	        data: function() {
	        	return {"adultNums"  : new Array(5), "childNums": new Array(5), "durationNums": new Array(5)};
	        },
			onrender: function() {
				var thisClass = this;
				$(thisClass.el).find( "input[name='issueDate']" ).datepicker({
					numberOfMonths : 1,
					minDate : 0,
					dateFormat : "yy-mm-dd",
					onSelect : function(dateText) {
						$(this).css("color", "#333333");
					}
				});
			},
	        onCheck: function() {
	        	var thisClass = this;
//	        	var $activityType = $(thisClass.el).find("select[name='activityType']").find("option:selected");
//	        	var $numberOfAdult = $(thisClass.el).find("select[name='numberOfAdult']").find("option:selected");
//	        	var $numberOfChild = $(thisClass.el).find("select[name='numberOfChild']").find("option:selected");
	        	
	        	var event = this.event;
				if($(event.node).is(":checked")) {
					this.set("activity", ACC.ancillary.model.activity.getInitdata());
					console.log($(thisClass.el).find("li.ancillaryshow10"));
					$(thisClass.el).find("li.ancillaryshow10").show()
				} else {
					this.set("activity", null);
					$(thisClass.el).find("li.ancillaryshow10").hide();
				}				
	        },
	        dataChange: function(){
	        	var event = this.event;
	        	var value = $(event.node).val();
	        	var activities = this.get("activity.activities");
	        	this.set("activity.price", 500 * activities.length);
	        	console.log(this.get());
	        },
	        removeData: function(num) {
	        	var activities = this.get("activity.activities");
	        	activities.splice(num, 1);
	        	this.dataChange();
	        },
	        pushData: function() {
	        	var thisClass = this;
	        	var $activityType = $(thisClass.el).find("select[name='activityType']").find("option:selected");
	        	var $vehicleType = $(thisClass.el).find("select[name='vehicleType']").find("option:selected");
	        	var $numberOfAdult = $(thisClass.el).find("select[name='numberOfAdult']").find("option:selected");
	        	var $numberOfChild = $(thisClass.el).find("select[name='numberOfChild']").find("option:selected");
	        	var $duration = $(thisClass.el).find("select[name='duration']").find("option:selected");
	        	var $issueDate =  $(thisClass.el).find("input[name='issueDate']");
	        	var $startDate = $(thisClass.el).find("input[name='startDate']");
	        	var $endDate = $(thisClass.el).find("input[name='endDate']");
	        	if($activityType && $activityType.val() && $vehicleType && $vehicleType.val() && (($numberOfAdult && $numberOfAdult.val())|| $numberOfChild && $numberOfChild.val())) {
	        		var activities = this.get("activity.activities");
	        		activities.push({
	        			activityType: {"code":$activityType.val(), "type":$activityType.html()},
	        			numberOfAdult: $numberOfAdult ? $numberOfAdult.val() : "",
	        			numberOfChild: $numberOfChild ? $numberOfChild.val() : "",
	        			vehicleType: {"code":$vehicleType.val(), "type":$vehicleType.html()},
	        			issueDate: $issueDate.val(),
	        			duration:$duration.val(),
	        			startDate:$startDate.val(),
	        			endDate:$endDate.val()
	        		});
	        		$activityType.prop("selected", false);
	        		$numberOfAdult.prop("selected", false);
	        		$numberOfChild.prop("selected", false);
	        		$vehicleType.prop("selected", false);
	        		$duration.prop("selected", false);
	        		$issueDate.val("");
	        		$startDate.val("");
	        		$endDate.val("");
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
