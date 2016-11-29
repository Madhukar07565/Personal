ACC.bookhotel = {

    _autoload: [
        "bindAddHotelToCartForm",
        "bindBookHotelButton"
    ],

    addToCartForms : $('[name=ezgAddToCartForm]'),
    
    bindBookHotelButton: function () {
    	$(document).on("click", "#bookHotelId", function(e) {
			e.preventDefault();
			ACC.account.loginBetweenBook(
					function(){
						if($(e.target).parent()){
							$(e.target).parent().submit();
						}
					}
			);
		});
    },

    bindAddHotelToCartForm: function () {
    	var time = new Date();
    	$.each(ACC.bookhotel.addToCartForms, function(index, obj){
    		$("<input>",{type:'hidden', val: time.getTime(), name: 'groupId' }).appendTo(obj);
		});
    	
        ACC.bookhotel.addToCartForms.ajaxForm({
			success : ACC.bookhotel.addToCartSuccess,
			error : ACC.bookhotel.addToCartFailed
		});
    },

    addToCartSuccess : function (data){
    	if(data && data.status == "addtocart-success"){
    		console.log("add to cart success!");
        	$("#miniCartProdCount").html(data.totalCount);
        	ACC.minicart.showMiniCart(data.totalCount);
    	}else{
    		console.error("add to cart faield!");
    	}
    	
    },
    addToCartFailed : function (){
    	alert("some error happened, pls check your config.");
    },

//	popupLogin : function(callback){
//		popupwin('loginCont', 'black_overlay',undefined,callback);
//	}
    
};