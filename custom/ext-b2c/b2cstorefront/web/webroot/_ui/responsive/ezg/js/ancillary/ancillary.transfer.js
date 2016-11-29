ACC.ancillary.transfer = $.extend({}, ACC.ancillary.base, {

	init : function(){
		ACC.ancillary.model.transfer.getInitdata = function() {
			return{
				"transfers":[], 
				"price":0
			};
		}	
	    ACC.ancillary.transfer.CustomRactive = Ractive.extend({
	        template: "#transferTemplate",
	        data: function() {
	        	return {"adultNums"  : new Array(5), "childNums": new Array(5)};
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
//	        	var $transferType = $(thisClass.el).find("select[name='transferType']").find("option:selected");
//	        	var $numberOfAdult = $(thisClass.el).find("select[name='numberOfAdult']").find("option:selected");
//	        	var $numberOfChild = $(thisClass.el).find("select[name='numberOfChild']").find("option:selected");
	        	
	        	var event = this.event;
				if($(event.node).is(":checked")) {
					this.set("transfer", ACC.ancillary.model.transfer.getInitdata());
					console.log($(thisClass.el).find("li.ancillaryshow9"));
					$(thisClass.el).find("li.ancillaryshow9").show()
				} else {
					this.set("transfer", null);
					console.log($(thisClass.el).find("li.ancillaryshow9"));
					$(thisClass.el).find("li.ancillaryshow9").hide();
				}				
	        },
	        dataChange: function(){
	        	var event = this.event;
	        	var value = $(event.node).val();
	        	var transfers = this.get("transfer.transfers");
	        	this.set("transfer.price", 500*transfers.length);
	        	console.log(this.get());
	        },
	        removeData: function(num) {
	        	var transfers = this.get("transfer.transfers");
	        	transfers.splice(num, 1);
	        	this.dataChange();
	        },
	        pushData: function() {
	        	var thisClass = this;
	        	var $transferType = $(thisClass.el).find("select[name='transferType']").find("option:selected");
	        	var $vehicleType = $(thisClass.el).find("select[name='vehicleType']").find("option:selected");
	        	var $numberOfAdult = $(thisClass.el).find("select[name='numberOfAdult']").find("option:selected");
	        	var $numberOfChild = $(thisClass.el).find("select[name='numberOfChild']").find("option:selected");
	        	var $issueDate =  $(thisClass.el).find("input[name='issueDate']");
	        	if($transferType && $transferType.val() && $vehicleType && $vehicleType.val() && (($numberOfAdult && $numberOfAdult.val())|| $numberOfChild && $numberOfChild.val())) {
	        		var transfers = this.get("transfer.transfers");
	        		transfers.push({
	        			transferType: {"code":$transferType.val(), "type":$transferType.html()},
	        			numberOfAdult: $numberOfAdult ? $numberOfAdult.val() : "",
	        			numberOfChild: $numberOfChild ? $numberOfChild.val() : "",
	        			vehicleType: {"code":$vehicleType.val(), "type":$vehicleType.html()},
	        			issueDate: $issueDate.val()
	        		});
	        		$transferType.prop("selected", false);
	        		$numberOfAdult.prop("selected", false);
	        		$numberOfChild.prop("selected", false);
	        		$vehicleType.prop("selected", false);
	        		$issueDate.val("");
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
