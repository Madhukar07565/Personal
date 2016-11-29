ACC.ancillary.carparking = $.extend({}, ACC.ancillary.base, {

	template : {
		html: ''
	},
	init : function(){
		ACC.ancillary.model.carparking.getInitdata = function() {
				return {
				vehicleType: "0",
				price:0,
				startDate:"",
				endDate:""
				};
			}
	    ACC.ancillary.carparking.CustomRactive = Ractive.extend({
	        template: "#carparkingTemplate",	
//	        changeData: function(){
//	        	var event = this.event;
//	        	var value = $(event.node).val();
//	        	console.log("" + event.node.name + ":" + value);
//	        },
			onrender: function() {
				var thisClass = this;
				$(thisClass.el).find( "input[name='parkingStartDate']" ).datepicker({
					numberOfMonths : 1,
					minDate : 0,
					dateFormat : "yy-mm-dd",
					onSelect : function(dateText) {
						$(this).css("color", "#333333");
						thisClass.dataChange();
					}
				});
				$(thisClass.el).find( "input[name='parkingEndDate']" ).datepicker({
					numberOfMonths : 1,
					minDate : 0,
					dateFormat : "yy-mm-dd",
					onSelect : function(dateText) {
						$(this).css("color", "#333333");
						thisClass.dataChange();
					}
				});
			},
			onCheck: function () {
				var thisClass = this;
				var event = this.event;
				if($(event.node).is(":checked")) {
					this.set("carparking", ACC.ancillary.model.carparking.getInitdata());
				} else {
					this.set("carparking.vehicleType", null);
					this.set("carparking", null);
				}
			},
			dataChange: function () {
				var thisClass = this;
				var $selectDom = $(thisClass.el).find("select[name='vehicleType']");
				var optionValue = $selectDom.find("option:selected").val();
				if($selectDom.find("option:selected").val() =="0") {
					// price == 0
				}
				var oneDayInLong = 86400000;
				var startDate = $(thisClass.el).find("input[name='parkingStartDate']").datepicker( "getDate" );
				var startDateInLong = startDate ? startDate.getTime() : 0;
				var endDate = $(thisClass.el).find("input[name='parkingEndDate']").datepicker( "getDate" );
				var endDateInLong = endDate ? endDate.getTime() : 0;
				if(startDateInLong != 0 && endDateInLong != 0 && endDateInLong < startDateInLong) {
					alert("start date should be earlier than end date");
					return;
				}
				console.log("startDate:"+startDate);
				console.log("endDate:"+endDate);
				var days = (endDateInLong - startDateInLong) / oneDayInLong;
				days = days > 0 ?  days : 1;
				var numbers = eval(optionValue) * days ;
				var price = ACC.ancillary.carparking.calcPrice(numbers);
				ACC.ancillary.carparking.save(numbers);
//				this.set("carparking.vehicleType", $selectDom.find("option:selected").attr("name"));
				this.set("carparking.price", numbers);
				return;
				this.updateModel();
				console.log(this.get("carparking"));
			}	        
	        
	      });
		
		var parking = $("[name=carparking]");
		var cartype = $("[name=vehicleType]");
		//TODO handle dom as array for multi rooms.
		parking.change(function(e){
			e.preventDefault();
			var that = this;
			var dom = $('.vehicleType');
			var index = 0;
			ACC.ancillary.carparking.display(that, dom,index); //TODO get all doms and display.
		});
//		cartype.change(function(e) {
//			e.preventDefault();
//			$( "#parkingStartDate" ).datepicker({
//				numberOfMonths : 1,
//				minDate : 0,
//				dateFormat : "yy-mm-dd",
//				onSelect : function(dateText) {
//					$(this).css("color", "#333333");
//				}
//			});
//			$( "#parkingEndDate" ).datepicker({
//				numberOfMonths : 1,
//				minDate : 0,
//				dateFormat : "yy-mm-dd",
//				onSelect : function(dateText) {
//					$(this).css("color", "#333333");
//				}
//			});
//			var numbers = $(e.target.selectedOptions).val();
//			var price = ACC.ancillary.carparking.calcPrice(numbers);
//			ACC.ancillary.carparking.save(numbers);
//			ACC.ancillary.carparking.displayPrice(numbers);
//		});
	},
	display : function(that, dom, index){
		if (that.checked) {
			$(dom[index]).show();
		} else {
			$(dom[index]).hide();
		}
	},
	calcPrice : function(){
		
	},
	displayPrice : function(){
		
	}

});
