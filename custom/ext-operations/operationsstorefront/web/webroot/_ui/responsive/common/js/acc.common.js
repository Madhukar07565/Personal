ACC.common = {
	currentCurrency: "USD",
	processingMessage: $("<img src='" + ACC.config.commonResourcePath + "/images/spinner.gif'/>"),


	blockFormAndShowProcessingMessage: function (submitButton)
	{
		var form = submitButton.parents('form:first');
		form.block({ message: ACC.common.processingMessage });
	},
	refreshScreenReaderBuffer: function ()
	{
		// changes a value in a hidden form field in order
		// to trigger a buffer update in a screen reader
		$('#accesibility_refreshScreenReaderBufferField').attr('value', new Date().getTime());
	}
};





/* Extend jquery with a postJSON method */
jQuery.extend({
	postJSON: function (url, data, callback)
	{
		return jQuery.post(url, data, callback, "json");
	}
});

// add a CSRF request token to POST ajax request if its not available
$.ajaxPrefilter(function (options, originalOptions, jqXHR)
{
	// Modify options, control originalOptions, store jqXHR, etc
	if (options.type === "post" || options.type === "POST")
	{
		var noData = (typeof options.data === "undefined");
		if (noData || options.data.indexOf("CSRFToken") === -1)
		{
			options.data = (!noData ? options.data + "&" : "") + "CSRFToken=" + ACC.config.CSRFToken;
		}
	}
});


function mySearch(){
	var body = {
			"referenceId": self.selectedRreferenceId() ? self.selectedRreferenceId().code : "",
			"receiptNumber": self.receiptNumber() ? self.receiptNumber().code : "",	
	};
	$.ajax({
		type: 'POST',
		url: ACC.config.encodedContextPath + "/receipt/search",
		dataType : 'json',
		data: body,
		success: function(data)
		{
			console.log("success");
		},
		error: function(xht, textStatus, ex)
		{
			console.log("error");
		}

	});
}

$('#ftRec').on('change', function () {
	var receiptReference = $('input[name=c-rec]:checked', '#chk11').val();
    var receiptNumber = $('#ftRec').val();
    $.ajax({
    	type: 'POST',
        url: ACC.config.encodedContextPath + "/receipt/search-receipt",
        dataType : 'json',
        data :{
			'receiptReference' : receiptReference,
			'receiptNumber' : receiptNumber,
		},
        success: function (data) {
        	console.log(data);
            $('#txt1').val(data.value1); //value1 would be something like an attribute value with the data
            $('#txt2').val(data.value2); //value1 would be something like an attribute value with the data
        },
        error: function () {
        	console.log("error");
        }
    })
});