function redirectToPaymentProviderAjax(providerName) {

	var dt = new Date();
	var paymentUserSelectedData = {
		      "paymentGatewayId" : providerName,
		      "paymentMode" :$("#selectionTable").find("article:visible").attr("name"),
		      "cardType" : $("#selectionTable").find("article:visible").find("input[type='radio']:checked").attr("name"),
		     "amount" :$("#cartSummary").find("input[name='payNowAmount']").val(),
		      //"amount" :"4.00",
		      "currency" :"INR",
		      //"orderId":$("#cartSummary").find("input[name='cartCode']").val(),
		      "orderId" :"ORDTEST"+$("#cartSummary").find("input[name='cartCode']").val()+dt.getHours() + dt.getMinutes() +dt.getSeconds(),
		      "currentBaseSiteURL" : $(location). attr("href")
		   }
		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : ACC.config.encodedContextPath+'/checkout/multi/payment/paymentgateways/getPaymentProviderForm',
			timeout : 100000,
			dataType : 'json',
			data: JSON.stringify(paymentUserSelectedData),
			success : function(data) {	
				if(data!=null){
					if((isDynamicSubmit(data))){
					dynamicSubmitForm(data);
					}else{
					defaultSubmitForm(data);
					}
				}else{
					console.log("EMPTY !!");
				}
				
			},
			error : function(e) {
				console.log("ERROR: ", e);
				//display(e);
			},
			done : function(e) {
				console.log("DONE");
			}
		});
	
	}

function defaultSubmitForm(form){	
	$("<div id='paymentsubmitform'>" +form).appendTo('.container');
}

function executeFunctionByName(functionName, context /*, args */) {
	  var args = [].slice.call(arguments).splice(2);
	  var namespaces = functionName.split(".");
	  var func = namespaces.pop();
	  for(var i = 0; i < namespaces.length; i++) {
	    context = context[namespaces[i]];
	  }
	  return context[func].apply(context, args);
	}

function isDynamicSubmit(form){	
	var flag = (form.toLowerCase().indexOf("script=") >= 0);
	return flag;
}

function dynamicSubmitForm(form){
	var startIndex = form.indexOf("script=");
	var scriptFunctionName = form.substring(startIndex+7,form.indexOf("</script>"));
	//hdfcSubmitScript(form);
	executeFunctionByName(scriptFunctionName, window, form);
}

function getValueForThisKey(form,key,value){
	var startingIndex = form.indexOf(key);
	startingIndex = startingIndex + (key.length) +2;
	var tempForm = form.substring(startingIndex,form.length);
	startingIndex = tempForm.indexOf(value);
	startingIndex = startingIndex + value.length +2;
	tempForm = tempForm.substring(startingIndex,form.length);
	var lastIndex = 0;
	var i=0;
	for(i=0;(tempForm.substring(i,i+1)!="'");i++){	
		//alert(tempForm.substring(i,i+1)!="'");
		lastIndex = i;
	}	
	return tempForm.substring(0,lastIndex+1);
}

function hdfcSubmitScript(form){
	var url = getValueForThisKey(form,"redirectURL","value");
	window.location = url;
}
