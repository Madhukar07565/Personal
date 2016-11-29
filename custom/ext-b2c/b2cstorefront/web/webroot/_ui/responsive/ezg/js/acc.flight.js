ACC.flight={
		
	_autoload: [
	    //"bindToAddToCartForm",
	    "enableAddToCartButton"
	],	
		        
    enableAddToCartButton: function () {        
    	$(document).on("click", "#bookFlightId", function(e) {
			e.preventDefault();
			
			var options = {
				url : ACC.config.contextPath + "/cart/checklogin",
				type : 'GET',
				success : function(data) {
					console.log(data);
					if("success" == data){
						 var addToCartForm = $('#ezgAddFlightToCartForm');
						 addToCartForm.submit();
						
					}else{
						ACC.bookhotel.popupLogin();
					}
				},
				error : function() {
					ACC.bookhotel.popupLogin();
				}
			};
	
			$.ajax(options);
			
		});
        
    },

   

    bindToAddToCartForm: function () {
        var addToCartForm = $('#ezgAddFlightToCartForm');
		addToCartForm.ajaxForm({
			success : ACC.bookhotel.bookHotelCart,
			error : ACC.bookhotel.popupLogin
		});
    },
	
};