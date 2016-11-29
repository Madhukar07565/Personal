var ReceiptsViewEdit = function () {

	var self = this;

//    self.displayMode = ko.observable('CLIENT');
    //Populate the entity types
    self.entityTypes = [
      {
        "code": "CLIENT",
        "name": "Client Receipt"
      },
      {
        "code": "SUPPLIER",
        "name": "Supplier Receipt"
      }
    ];
    self.selectedEntityType = ko.observable(self.entityTypes[0].code);
    
    self.selectedEntityType.subscribe(function (newValue) {
        console.log("selectedEntityType.subscribe")	
        
        if(newValue === 'SUPPLIER')
            self.selectedClientReceiptType(null);
        else if(newValue === 'CLIENT')
        {
            self.selectedClientReceiptType(self.clientReceiptTypes[0].code);
            self.supplierNameText(null);
        }
    });

    
    //Populate the receipt types
    self.clientReceiptTypes = [
      {
        "code": "BOOKING RECEIPT",
        "name": "Booking Receipt"
      },
      {
        "code": "ON ACCOUNT RECEIPT",
        "name": "On Account Receipt"
      },
      {
        "code": "SECURITY DEPOSIT RECEIPT",
        "name": "Security Deposit Receipt"
      },
      {
        "code": "DEPOSIT RECEIPT",
        "name": "Deposit Receipt"
      }
    ];
    self.selectedClientReceiptType = ko.observable(self.clientReceiptTypes[0].code);
    
    //Number/ID handling
    self.numberIDText = ko.observable();
    
    //Receipt number handling
    self.receiptNoText = ko.observable();
    
    //Supplier name handling
    self.supplierNameText = ko.observable();

    //Client Types
    self.clientTypes = [
      {
        "code": "B2B",
        "name": "B2B"
      },
      {
        "code": "B2C",
        "name": "B2C"
      }
    ];
    self.selectedClientType = ko.observable(self.clientTypes[0].code);
    
    //Client Categories
    self.clientCategories = [
      {
        "code": "ALLIANCE_PARTNERS",
        "name": "Alliance Partners"
      },
      {
        "code": "FRANCHISEE",
        "name": "Franchisee"
      },
      {
        "code": "CORPORATE",
        "name": "Corporate"
      },
      {
        "code": "INTER_COMPANY",
        "name": "Inter Company"
      },
      {
        "code": "TRAVEL_AGENT",
        "name": "Travel Agent"
      }
    ];
    self.selectedClientCategory = ko.observable();

    //Client Subcategories
    self.clientSubCategories = [
      {
        "code": "BANKS",
        "name": "Banks"
      },
      {
        "code": "CONSORTIUM",
        "name": "Consortim"
      },
      {
        "code": "CORPORATE",
        "name": "Corporate"
      },
      {
        "code": "DISTRIBUTOR",
        "name": "Distributor"
      },
      {
        "code": "FRANCHISEE",
        "name": "Franchisee"
      },
      {
        "code": "GSA",
        "name": "GSA"
      },
      {
        "code": "HBA",
        "name": "HBA"
      },
      {
        "code": "MASTER_FRANCHISEE",
        "name": "Master Franchisee"
      },
      {
        "code": "PORTALS",
        "name": "Portals"
      },
      {
        "code": "PSA",
        "name": "PSA"
      },
      {
        "code": "RETAILS",
        "name": "Retails"
      },
      {
        "code": "SUB_FRANCHISEE",
        "name": "Sub Franchisee"
      },
      {
        "code": "TA",
        "name": "TA"
      }
    ];

    self.selectedClientSubCategory = ko.observable();

    //Payment methods    
    self.paymentMethods = [
      {
        "code": "Payment in Foreign Currency",
        "name": "Payment in Foreign Currency"
      },
      {
        "code": "Payment in functional/Local currency",
        "name": "Payment in functional/Local currency"
      }
    ];
    self.selectedPaymentMethod = ko.observable(self.paymentMethods[0].code);
    
    //Mode of payments
    self.modeOfPayments = [
      {
        "code": "Cash On Delivery",
        "name": "Cash On Delivery"
      },
      {
        "code": "Direct Deposit Cash",
        "name": "Direct Deposit Cash"
      },
      {
        "code": "Cash",
        "name": "Cash"
      },
      {
        "code": "Cheque/DD",
        "name": "Cheque/DD"
      }
    ];
    self.selectedModeOfPayment = ko.observable(self.modeOfPayments[0].code);

    //Currencies
    self.currencies = [
      {
        "isocode": "$",
        "name": "US Dollar",
        "active": "",
        "symbol": ""
      },
      {
        "isocode": "₹",
        "name": "Indian Rupees",
        "active": "",
        "symbol": ""
      }
    ];
    self.selectedCurrency = ko.observable(self.currencies[0].code);

    //Save function
    self.save = function()
    {
        console.log(self.selectedEntityType());
        console.log(self.selectedClientReceiptType());
        console.log(self.numberIDText());
        console.log(self.receiptNoText());
        console.log(self.supplierNameText());
        console.log(self.selectedClientType().code);
        console.log(self.selectedClientCategory().code);
        console.log(self.selectedClientSubCategory().code);
        console.log(self.selectedPaymentMethod().code);
        console.log(self.selectedModeOfPayment().code);
        console.log(self.selectedCurrency().name);
        var body = {
                "entityType":self.selectedEntityType(),
                "receiptType":self.selectedClientReceiptType(),
                "referenceId": self.numberIDText(),
                "travelogixClientDetailsData": {
                  "clientType":self.selectedClientType().code,
                  "clientCategory":self.selectedClientCategory().code,
                  "clientSubCategory":self.selectedClientSubCategory().code,
                  "clientId":"singh",
                  "clientName": "singhname",
                  "passengerName": "singhpass",
                },
                "travelogixPaymentInfoData": {
                  "paymentMethod":"",
                  "paymentCurrency":"",
                  "bankCurrency":"",
                  "MSFCharges":"",
                  "transactionDate":"",
                  "dateOfPayment":"",
                  "modeOfPayment":"",
                  "transactionAmount":"",
                  "paymentStatus":"",
                  "bankName":"",
                  "cardNumber":"",
                  "cardType":"",
                  "fromBankName":"",
                  "toBankName":"",
                  "ifscCode":"",
                  "intermediaryBankSwift":"",
                  "nameOnCard":"",
                  "accountNumber":"",
                  "cvvNumber":"",
                  "expiryOfCard":"",
                  "chequeNo":"",
                  "chequeDate":"",
                  "dateOfDeposit":"",
                  "panCardNumber":"",
                  "reasonOfIssueReceipt":"",
                  "remarks":"",
                },
                "totalReceiptAmount":"",
                "inFavourOf":"",
                "amountReceived":"",
                "receiptCreationDate":"",
                "receiptNumber":"",
                "passengerName":"",
                "receiptAmount":"",
                "roe":"",
                "functionalReceiptAmount":"",
                "unAppliedAmount":"",
                "functionalUnAppliedAmount":"",
                "createdBy":"",
                "receiptStatus":"",
                "receiptType":"",
                "fromDate":"",
                "toDate":"",
                "SupplierReceiptData":{
                  "supplierName":"",
                },
              };
        var data=ko.toJSON(body);
		/*$.ajax = ajax_response('', true);*/

		$.ajax({
			type: "POST",
			contentType : "application/json", 
			url: ACC.config.encodedContextPath + "/receipt/createReceipt",
			data: data,
			dataType : 'json',
			success: function (results) {
				/*var configurations = $.parseJSON(results);
				//self.searchResult(configurations.results);
				console.log("Save Success");*/
				alert("success");
			}
		});
    }
}

$(document).ready(function () {
	//we should have 
	ko.applyBindings(new ReceiptsViewEdit());

});
