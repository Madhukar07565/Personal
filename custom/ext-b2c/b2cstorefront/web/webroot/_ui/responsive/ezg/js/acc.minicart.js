ACC.minicart = {

	_autoload : [ "bindLinks" ],

	bindLinks : function() {
		$(document).on("click", "#shoppingCartTab", function(e) {
			e.preventDefault();
			ACC.minicart.showMiniCart();
		});
	},
	
	unbindCloseMiniCart: function(){
		$("#closeB2CMinicart").off("click");
	},
	bindCloseMiniCart: function(){
		$("#closeB2CMinicart").on("click", function(e) {
			e.preventDefault();
			ACC.minicart.closeShoppingCartPanel();
		});
	},
	unbindEntryDelete : function(){
		$("[name=itemToDelete]").off();
	},
	bindEntryDelete : function(){
		$("[name=itemToDelete]").on("click", function(e){
			var entryNumber = $(e.target).data("number");
			ACC.minicart.deleteItem(entryNumber);
		});
	},
	unbindCheckout : function(){
		$('#minicartCheckout').off("click");
	},
	bindCheckout : function(){
		$('#minicartCheckout').on("click", function(e) {
			e.preventDefault();
//			ACC.minicart.miniCartCheckout();
			ACC.minicart.closeShoppingCartPanel();
			window.location.href = ACC.config.contextPath + "/cart";
		});
	},
	/**
	 * TODO enhance this if need support guest checkout.
	 */
	miniCartCheckout : function() {
//		var options = {
//			url : ACC.config.contextPath + "/cart",
//			type : 'GET',
//			success : function(data) {
//				console.log(data);
//				if("checkout-login" == data){
//					ACC.minicart.popupLogin();
//				}else{
//					window.location.href = ACC.config.contextPath + "/cart/checkout";
//				}
//			},
//			error : function() {
//				//alert("Failed to go to cart page");
//				ACC.minicart.popupLogin();
//			}
//		};
//
//		$.ajax(options);
	},
	popupLogin : function(){
		popupwin('loginCont', 'black_overlay');
	},
	
	closeShoppingCartPanel : function(id1) {
		$("#shopping_cart_panel").hide();
		$("#shoppingCartTab").removeClass("sel");
		$(".footerContactDetail").removeClass('activated');
	},
	showMiniCart : function(count) {
		var pCount = $("#miniCartProdCount").html() || count;
		if(pCount == undefined || pCount < 1){
			return false;
		}else {
			var options = {
				url : ACC.config.contextPath + "/cart/miniCart/",
				type : 'GET',
				success : function(data) {
					//1, clear all dom in minicart
					//2, append entry doms to minicart container
					//3, unbind all events
					//4, rebind all events.（delete, checkout）
					
					$("#shopping_cart_panel").empty();
					$("#shopping_cart_panel").append(data);
					$("#shopping_cart_panel").toggle();
					$("#shoppingCartTab").toggleClass("sel");
					$(".footerContactDetail").toggleClass("activated");
					$("#shopping_cart_panel").show();
					
					ACC.minicart.unbindAllEvents();
					ACC.minicart.bindAllEvents();
				},
				error : function() {
					console.log('error happened');
				}
			};
			$.ajax(options);
		}
	},
	unbindAllEvents : function(){
		ACC.minicart.unbindCloseMiniCart();
		ACC.minicart.unbindEntryDelete();
		ACC.minicart.unbindCheckout();
	},
	bindAllEvents : function(){
		ACC.minicart.bindCloseMiniCart();
		ACC.minicart.bindEntryDelete();
		ACC.minicart.bindCheckout();
	},
	deleteItem : function(entryNumber) {
		//TODO validate entry number is number
		var options = {
				url : ACC.config.contextPath + "/cart/remove",
				type : 'POST',
				dataType: "JSON",
				data : {"entryNumber":entryNumber},
				success : function(data) {
					console.log(data);
					if(data && "remove-success" == data.status){
						ACC.minicart.refreshMinicart(data);
					}else{
						console.error("remove failed.");
					}
				},
				error : function() {
					console.error("remove failed.");
				}
			};

		$.ajax(options);
	},
	/**
	 * update item count; refresh minicart content.
	 */
	refreshMinicart : function(data){
		if(data.totalCount == 0){
			$("#miniCartProdCount").html(data.totalCount);
			$("#shopping_cart_panel").empty();
			ACC.minicart.closeShoppingCartPanel();
		}else{
			ACC.minicart.showMiniCart()
			//total count
			$("#miniCartProdCount").html(data.totalCount);
		}
	}
};
