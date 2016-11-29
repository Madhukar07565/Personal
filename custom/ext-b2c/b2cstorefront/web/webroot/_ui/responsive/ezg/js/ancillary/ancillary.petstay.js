ACC.ancillary.petstay = $.extend({}, ACC.ancillary.base, {

	init : function(){
		var petstay = $("[name=petstayInput]");
		var petnumber = $("[name=petNumbersSelection]");
		
		
		ACC.ancillary.model.petstay.getInitdata = function() {
			return {
				numberOfPets: "",
				price:0
			};
		} 
			
	    ACC.ancillary.petstay.CustomRactive = Ractive.extend({
	        template: "#petstayTemplate",
	        data: function() {
	        	return {petsNum: new Array(2)};
	        },
	        onCheck: function() {
	        	var thisClass = this;
				var $selectDom = $(thisClass.el).find("select[name='numberOfPets']");
				var thisClass = this;
				var event = this.event;
				if($(event.node).is(":checked")) {
					this.set("petstay", ACC.ancillary.model.petstay.getInitdata());
				} else {
					this.set("petstay.numberOfPets", null);
					this.set("petstay", null);
				}				
	        },
	        dataChange: function(){
	        	var event = this.event;
	        	var value = $(event.node).val();
	        	this.set("petstay.price", 100);
	        	console.log("" + event.node.name + ":" + value);
	        }
	    });
		
		
//		//TODO handle dom as array for multi rooms.
//		petstay.change(function(e){
//			e.preventDefault();
//			console.log("select pet stay");
//			var that = this;
//			ACC.ancillary.petstay.displayPetNumber(that);
//		});
//		petnumber.change(function(e) {
//			e.preventDefault();
//			var numbers = $(e.target.selectedOptions).val();
//			console.log("select " + numbers +" pets");
//			var price = ACC.ancillary.petstay.calcPrice(numbers);
//			ACC.ancillary.petstay.save(numbers);
//			ACC.ancillary.petstay.displayPrice(numbers);
//		});
	},
	calcPrice : function(days){
		return days*1000;
	},
	displayPetNumber : function(that) {
		if (that.checked) {
			$('.petNumbers').show();
		} else {
			$('.petNumbers').hide();
		}
	},
	displayPrice : function(petnumbers){
		if (petnumbers > 0) {
			$('.petprice').show();
		} else {
			$('.petprice').hide();
		}
	},
	save : function(){
		//TODO save pet stay and price to room order entry.
	}
	
});
