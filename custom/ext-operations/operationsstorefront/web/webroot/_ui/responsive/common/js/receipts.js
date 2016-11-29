var entityTypes;
var clientTypes;
var	receiptType;
var	clientCategories;
var	clientSubCategories;
var	receiptStatus;
var	dateTypes;
var	receiptData;


function ajax_response(response, success) {
	return function (params) {
		if (success) {
			params.success(response);
		} else {
			params.error(response);
		}
	};
}

var Receipts = function () {

	var self = this;
	self.validationError = ko.observable(false);
	self.fromDate = ko.observable();
    self.toDate = ko.observable();
    
    self.receipts = [{
	"EntityType": {
    	"code": "CLIENT",
    	"name": "Client",
		"ReceiptType": [{
			"code": "BOOKING_RECEIPT",
			"name": "BOOKING RECEIPT"
		}, {
			"code": "ON_ACCOUNT_RECEIPT",
			"name": "ON ACCOUNT RECEIPT"
		}, {
			"code": "SECURITY_DEPOSIT_RECEIPT",
			"name": "SECURITY DEPOSIT RECEIPT"
		}, {
			"code": "DEPOSIT_RECEIPT",
			"name": "DEPOSIT RECEIPT"
		}],
		"referenceId": [{
			"code": "Booking_Reference_No",
			"name": "Booking Reference No"
		}, {
			"code": "Receipt_No",
			"name": "ReceiptNo"
		}, {
			"code": "Commercial_Statement_ID",
			"name": "Commercial Statement ID"
		}],
		"dateType": [{
			"code": "BOOKING_DATE",
			"name": "Booking Date"
		}, {
			"code": "TRAVEL_DATE",
			"name": "Travel Date"
		}]
	}
}, {
	"EntityType": {
    	"code": "SUPPLIER",
    	"name": "Supplier",
		"ReceiptType": [{
			"code": "EXTERNAL_SUPPLIER_RECEIPT",
			"name": "EXTERNAL SUPPLIER RECEIPT"
		}, {
			"code": "INTERNAL_SUPPLIER_RECEIPT",
			"name": "INTERNAL SUPPLIER RECEIPT"
		}],
		"referenceId": [{
			"code": "Payment Advice No",
			"name": "Payment Advice No"
		}, {
			"code": "Imprest_No",
			"name": "Imprest No"
		}, {
			"code": "Receipt_No",
			"name": "Receipt No"
		}, {
			"code": "General_Invoice ",
			"name": "General Invoice "
		}, {
			"code": "Commercial_Statement_ID",
			"name": "Commercial Statement ID"
		}]
	}
}];
    
self.selectedEntityType = ko.observable(self.receipts[0].EntityType.code);
self.selectedReceiptType = ko.observable(self.receipts[0].EntityType.ReceiptType[0].code);
self.selectedReferenceId = ko.observable();
self.selectedDateType = ko.observable(self.receipts[0].EntityType.dateType[0].code);

self.receiptTypesMatchingSelectedEntityType =  function(value) {
    for (var x in self.receipts) {     
    var object = self.receipts[x];
    if (object.EntityType.code === value) {
        return object.EntityType.ReceiptType;       
        }
    }
}

self.referenceIdsMatchingSelectedEntityType =  function(value) {
    for (var x in self.receipts) {     
    var object = self.receipts[x];
    if (object.EntityType.code === value) {
        return object.EntityType.referenceId;       
        }
    }
}

self.dateTypesMatchingSelectedEntityType =  function(value) {
    for (var x in self.receipts) {     
    var object = self.receipts[x];
    if (object.EntityType.code === value) {
                    console.log(object.EntityType.dateType);
        return object.EntityType.dateType;       
        }
    }
}

this.selectedEntityType.subscribe(function (newValue) {
		console.log("selectedEntityType");
	});
    
self.clientTypes = ko.observableArray($.parseJSON(clientTypes)); 
self.selectedClientType = ko.observable();
    
self.clientCategories = ko.observableArray($.parseJSON(clientCategories)); 
self.selectedClientCategory = ko.observable();

self.clientSubCategories = ko.observableArray($.parseJSON(clientSubCategories));
self.selectedClientSubCategory = ko.observable();

self.receiptStatus = ko.observableArray($.parseJSON(receiptStatus));
self.selectedReceiptStatus = ko.observable(); 

// Client number ID focus handling
self.clientCustomerIDText = ko.observable();
self.clientNameText = ko.observable();
self.hasFocusClientNumberID = ko.observable(true);
self.clientReceiptSelection = ko.observableArray();
    
this.hasFocusClientNumberID.subscribe(function (newValue) {
	
    if (!newValue && self.clientCustomerIDText()) {
	var body = {
            "referenceId": self.selectedReferenceId(),
            "receiptNumber": self.clientCustomerIDText(),
			"clientName":self.clientNameText(),
			"receiptType":self.selectedReceiptType,
		  };
    	var data = ko.toJSON(body);
		$.ajax({
			type: "POST",
			contentType : 'application/json;',
			url: ACC.config.contextPath + '/operations/en/receipt/search',
			data: data,
			success: function (results) {
				var configurations = results;
				self.clientNameText(configurations.results[0].travelogixClientDetailsData.clientName);
				self.selectedClientType(configurations.results[0].travelogixClientDetailsData.clientType[0].code);
				self.selectedClientCategory(configurations.results[0].travelogixClientDetailsData.clientCategory[0].code);
				self.selectedClientSubCategory(configurations.results[0].travelogixClientDetailsData.clientSubCategory[0].code);
				self.selectedReceiptStatus(configurations.results[0].receiptStatus[0].code);
				self.fromDate(moment(configurations.results[0].receiptCreationDate));
				self.toDate(moment(configurations.results[0].receiptCreationDate));
				console.log("Search results");
			},
			error: function(xht, textStatus, ex)
			{
				console.log("Error! Please check your provided values");
			}
		});
    }
});

self.resetReceiptForm = function () {
	self.validationError(false);
	self.clientReceiptSelection(null);
	self.selectedEntityType(null);
	self.selectedReceiptType(null);
	self.selectedClientType(null);
	self.selectedClientCategory(null);
	self.selectedClientSubCategory(null);
	self.selectedReceiptStatus(null);
};

self.searchResult = ko.observableArray();

self.searchPriorityConfiguration = function () {
	if(self.searchPriorityConfiguration){
    	var body = {
		  "entityType":self.selectedEntityType() ? self.selectedEntityType() : null,
		  "receiptType": self.selectedReceiptType() ? self.selectedReceiptType() : null,
          "referenceId": self.selectedReferenceId()? self.selectedReferenceId() : null,
          "receiptNumber": self.clientCustomerIDText() ? self.clientCustomerIDText() :null,
          "clientType": self.selectedClientType() ? self.selectedClientType().code : null,
  		  "clientCategory": self.selectedClientCategory() ? self.selectedClientCategory().code : null,
  		  "clientSubCategory": self.selectedClientSubCategory() ? self.selectedClientSubCategory().code : null,
		  "clientName": self.clientNameText() ? self.clientNameText() : null,
		  "receiptStatus": self.selectedReceiptStatus() ? self.selectedReceiptStatus().code : null,
		  "dateType": self.selectedDateType() ? self.selectedDateType() : null,
	      "fromDate":self.fromDate() ? self.fromDate() : null,
		  "toDate":self.toDate() ? self.toDate() : null,
		  "pageSize": null
		 };
	var data = ko.toJSON(body);
	var size=25;
	var currentPage=0;

	$.ajax({
			type: "POST",
			contentType : 'application/json;',
			url: ACC.config.contextPath + '/operations/en/receipt/search?size='+size+"&page="+currentPage+"&show=Page",
			data: data,
			success: function (results) {
				var configurations = results;
				self.searchResult(configurations.results);
				console.log(configurations.results);
				console.log("Search results");
			},
			error: function(xht, textStatus, ex)
			{
				console.log("error");
			}
		});
    }
		else{
			self.validationError(true);
		}
	};

self.receiptNumberPopup = {
    receiptData:ko.observableArray(),

    receiptNumberClicked:function(data)
    {
        var receiptNumberDetails = [{ 'receiptNumber': data.receiptNumber,
        							'CCPaymentInfoData': [{ 'Mode of Payment': { 'modeOfPayment': data.receiptNumber } }],
        							'pos': data.pos,
        							'travelogixClientDetailsData': { 'clientName': data.travelogixClientDetailsData.clientName}
        }];
        console.log(data);
    	 self.receiptNumberPopup.receiptData(receiptNumberDetails);
    }
   }

self.numberIDPopup = {
    numberIDData:ko.observableArray(),

    numberIDClicked:function(data)
    {
        console.log("numberIDClicked");
        var referenceDetails = [{ 'referenceId': data.receiptNumber,
        						'bookingDate':data.receiptCreationDate,
        						'receiptCreationDate':data.receiptCreationDate									
        					}];
        self.numberIDPopup.numberIDData(referenceDetails);
    }
   }

self.invoicePopup={

	    invoiceData:ko.observableArray(),
	    invoiceClicked:function(data)
	    {
	    	console.log("invoiceClicked");
	        var invoiceDetails = [{
	        	'code' : data.invoiceData[0] !=null ?data.invoiceData[0].code:null,
	        	'totalCost': data.invoiceData[0] !=null ?data.invoiceData[0].totalCost:null,
	        	'bookingRefNo': data.invoiceData[0] !=null ?data.invoiceData[0].bookingRefNo:null,
	        	'outstandingAmount': data.invoiceData[0] !=null ?data.invoiceData[0].outstandingAmount:null,
	        	'totalAppliedAmount': data.invoiceData[0] !=null ?data.invoiceData[0].totalAppliedAmount:null,
	        }];
	        self.invoicePopup.invoiceData(invoiceDetails);
	    }
}

self.remarksPopup={
		remarksData:ko.observableArray(),
		remarksClicked:function(data){
			console.log("remarksClicked");
			var remarksDetails = [{ 'contactEmail': data.remarksData[0] != null ?data.remarksData[0].createdBy.contactEmail:null,
					}];
			self.remarksPopup.remarksData(remarksDetails);
		}
}

}

$(document).ready(function () {
	// we should have
	ko.applyBindings(new Receipts());
	$('#popoverData').popover();
});
