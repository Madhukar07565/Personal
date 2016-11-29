ACC.payment = {

	_autoload : [ "bindForms" ],

	bindForms : function() {

		var ezgPaymentForm = $('#ezgPaymentForm');
//		ezgPaymentForm.ajaxForm({
//			success : ACC.payment.displayConfirmation,
//			failed : ACC.payment.displayError
//		});

		$(document).on("click", "#paymentLink", function(e) {
			e.preventDefault();
			ezgPaymentForm.submit();
		})

		$(document).on("click", "#paymentLink", function(e) {
			e.preventDefault();
			ezgPaymentForm.submit();
		})
	},

	displayError : function() {
		log.error('error happed in payment section.');
	},
	displayConfirmation : function(result, statusText, xhr, formElement) {

	},
	
	addPaymentMethod : function() {
		var $selectedBankRadio = $("#selectionTable").find("article:visible").find("input[type='radio']:checked");
		var cardType = $selectedBankRadio.attr("name");
		var modeOfPayment = $(".tabsContent").find("article:visible").attr("id");
		
		var card = $selectedBankRadio.val();
		if(!card && modeOfPayment != "cod") {
			alert("not supported, please select another payment method!");
			return;
		} 
		var isChecked = $("#tandC2").is(":checked");
		if(!isChecked) {
			alert("Booking Policy and Terms and Conditions should be checked before place order.");
			return;
		}
		var coddata = null;
		if(modeOfPayment == "cod") {
			coddata = {};
			$("#selectionTable").find("article:visible").find("input[type='text']").each(function(idx, ele) {
				coddata[$(ele).attr("name")] = $(ele).val();
			});
		}
		var creditcard = null;
		if(modeOfPayment == "creditcard") {
			creditcard = {};
			creditcard["cardType"] = cardType;
		}
		var emi = null;
		if(modeOfPayment == "emi") {
			emi = {};
			emi["cardType"] = cardType;
		}
		
		var amountToPay = $("#orderPrice").val();
		var myData = {
			"modeOfPayment": modeOfPayment,	
			"amountToPay" : amountToPay,
			"creditcard" : creditcard,
			"emi" : emi,
			"cod": coddata
			
		};
		if(modeOfPayment == "cod") {
			return this.formSubmit(myData);
		}
		
		$.ajax({
			type : "POST",
			url : ACC.config.encodedContextPath + "/checkout/multi/payment/add",
			async : true,
//			contentType: "application/x-www-form-urlencoded",
			contentType : "application/json",
			data : JSON.stringify(myData),
			dataType : "text",
			success : function(text) {
				$("#hostedOrderPostFormWrapper").html(text);
				$("#hostedOrderPagePostForm").submit();
			},
			error : function() {
				alert("error");
			},
			complete : function(msg) {
				
			}
		});			
	},
	formSubmit: function(data) {
		var objArray = [];
		var keyPath = null;
		this.loopJson(data, keyPath, objArray);
		objArray.push({"key": "CSRFToken", "value": ACC.config.CSRFToken});
		var form = "";
		for(var i = 0; i < objArray.length; i++) {
			form += "<input type='hidden' name='" + objArray[i].key + "'" + " value='" + objArray[i].value + "'/>"; 
		}
		$("#codPaymentForm").html(form);
		$("#codPaymentForm").submit();
	},
	ezeePay : function() {
		var modeOfPayment = $(".tabsContent").find("article:visible").attr("id");
		var amountToPay = $("#ezeeAmount").val();
		if(!amountToPay || eval(amountToPay) <= 0) {
			alert("Please enter the amount, e.g. 1000");
			return;
		}
		var myData = {
				"modeOfPayment": modeOfPayment,	
				"cardType" : "",
				"amountToPay" : amountToPay
		};
		$.ajax({
			type : "POST",
			url : ACC.config.encodedContextPath + "/checkout/multi/payment/ezee",
			async : true,
			contentType: "application/x-www-form-urlencoded",
//			contentType : "application/json",
			data : myData,
			dataType : "json",
			success : function(data) {
				if(data.status) {
					$("#orderTotalPrice").html(data.result.amountToPayNow);
				}
			},
			error : function() {
				alert("error");
			},
			complete : function(msg) {
				
			}
		});			
	},
	
	applyCoupon:function(id1,id2,id3,id4)
	{
		if( $("#" + id1).val() == "" ){
			alert("Please input coupon code");
			return;
		}
		var myData = {
			"voucherCode":	$("#" + id1).val().trim()
		};
		$.ajax({
			type : "POST",
			url : ACC.config.encodedContextPath + "/checkout/multi/payment/redeem",
			async : true,
			contentType: "application/x-www-form-urlencoded",
//			contentType : "application/json",
			data : myData,
			dataType : "json", //xml, json, script, html
			success : function(ajaxResult) {
				if(ajaxResult.status) {
					$("#" + id2).show();
					$("#" + id3).hide();
					$("#" + id4).html(ajaxResult.result);
				} else {
					$("#" + id2).hide();
					$("#" + id3).show();
				}
			},
			error : function() {
				alert("system error, please try again later");
			},
			complete : function(msg) {
				
			}
		});		
		
//			var number = $("#" + id4).text();
//			number = number.replace(/,/g, "");
			
//			$({number: 1000}).animate({number: 10764}, {
//				duration: 1200,
//				easing: 'linear',
//				step: function() { 
//					var updatedNum = $('#' + id4).text(parseFloat(Math.ceil(this.number*100)/100).toFixed(0));
//					var formattedNumber = $('#' + id4).text().replace(/(\d)(?=(\d{3})+(?!\d))/g, "$1,");
//					$('#' + id4).text(formattedNumber);
//				}
//			});
			
			
		
	},
	loopJson: function (o, keyPath, objArray) {
		console.log("keyPath is: " + keyPath);
		if(!o) {
			return;
		}
		if(o instanceof Object) {
			for(k in o) {
				var innerKeyPath = "";
				if(keyPath) {
					innerKeyPath = keyPath + "." + k;
				} else {
					innerKeyPath = k;
				}
				this.loopJson(o[k], innerKeyPath, objArray);
			}
		} else {
			objArray.push({"key": keyPath, "value": o});
		}			
	}
};

