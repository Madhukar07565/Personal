var mode;
var confirmationFor;
var clientTypes;
var recofirmationCutOffType;
var recofirmationToBeSentTo;
var clientCategories;
var clientSubCategories;
var productCategoryAndSubCategories;
var clientGroups;
var productResults;

function ajax_response(response, success) {
	return function (params) {
		if (success) {
			params.success(response);
		} else {
			params.error(response);
		}
	};
}


var ReconfirmationConfigurationSearchModel = function () {

	var self = this;

	self.validationError = ko.observable(false);

	self.configurations = ko.observableArray($.parseJSON(confirmationFor));	
	self.configurations.destroy( function (someItem) {return someItem.code == "clientAndSupplier" } )
	self.selectedConfiguration = ko.observable();

	self.selectedConfiguration.subscribe(function (newValue) {
		self.validationError(false);
	});


	self.productCategories = ko.observableArray($.parseJSON(productCategoryAndSubCategories));
	
	self.selectedProductCategory = ko.observable();
	self.selectedSubCategory = ko.observable();


	self.products = ko.observableArray();
	self.selectedProduct = ko.observable();

	self.supplierNames = ko.observableArray();
	self.selectedSupplierName = ko.observable();
	self.supplierQuery = "";

	self.selectedSubCategory.subscribe(function (newValue) {
		if(newValue){
			$.ajax({
				type : "GET",
				url : ACC.config.contextPath
						+ '/operations/en/reconfirmation/search-product',
				data : {
					"subCategoryCode" : newValue.code
				},
				success : function(results) {
					self.products(results);
				},
				error : function(error) {
					console.log("Error Got it:" + error);

				}
			});
			}
		self.tryRetrievingSuppliers();
	});

	self.selectedProduct.subscribe(function (newValue) {
		if(self.selectedConfiguration().code ==='supplier'){
		self.tryRetrievingSuppliers();
		}
	});
	self.selectedProductCategory.subscribe(function (newValue) {
	if(self.selectedConfiguration().code ==='supplier'){
		self.tryRetrievingSuppliers();
	}
	});

	self.selectedSubCategory.subscribe(function (newValue) {
		if(self.selectedConfiguration().code ==='supplier'){
			self.tryRetrievingSuppliers();
		}
	});

	self.tryRetrievingSuppliers = function () {
		if ( self.selectedSubCategory() || self.productCategories()) {
			// compose supplier query
				$.ajax({
						type : "GET",
						url : ACC.config.contextPath
								+ '/operations/en/reconfirmation/search-supplier',
						data : {
							"categoryCode": self.selectedProductCategory()!=null ?self.selectedProductCategory().code:null,
							"subCategoryCode" : self.selectedSubCategory()!=null ?self.selectedSubCategory().code:null,
						},
								success: function (results) {
						self.supplierNames(results);
					}
				});
		}
	};

	self.clientTypes = ko.observableArray($.parseJSON(clientTypes));
	self.selectedClientType = ko.observable();


	self.clientCategories = ko.observableArray($.parseJSON(clientCategories));
	self.selectedClientCategory = ko.observable();

	self.clientSubCategories = ko.observableArray($.parseJSON(clientSubCategories));
	self.selectedClientSubCategory = ko.observable();

	self.clientGroups = ko.observableArray($.parseJSON(clientGroups));
	self.selectedClientGroup = ko.observable();

	self.clientNames = ko.observableArray();
	self.selectedClientName = ko.observable();
	self.clientNameQuery = "";



	self.selectedClientCategory.subscribe(function (newValue) {
		if(self.selectedConfiguration().code ==='client'){
		self.tryRetrievingClientName();
		}
	});

	self.selectedClientSubCategory.subscribe(function (newValue) {
		if(self.selectedConfiguration().code ==='client'){
			self.tryRetrievingClientName();
		}
		});

	self.tryRetrievingClientName = function () {
		if (self.selectedClientSubCategory() && self.selectedClientCategory()) {
			var query = self.selectedClientCategory().code + self.selectedClientSubCategory().code;
			if (self.clientNameQuery && self.clientNameQuery === query) {
				// do nothing
			} else {

				$.ajax({
					type : "GET",
					url : ACC.config.contextPath
							+ '/operations/en/reconfirmation/search-client',
					data : {
						"clientCategory": self.selectedClientCategory().code,
						"clientSubCategory" : self.selectedClientSubCategory().code
					},
					success: function (results) {
						self.clientNames(results);
						self.clientNameQuery = query;
					}
				});
			}
		}
	};
	
	self.selectedGroup = ko.observable();

	self.clientDetails = ko.observableArray();

	self.resultantConfigurations = ko.observableArray();

	self.searchConfiguration = function () {

		// check whether mandatory fields are filled
		if (self.selectedConfiguration()) {
			// Compose Parameter
			var body = {
				"configurationFor": self.selectedConfiguration().code,
				"productCategoryCode": self.selectedProductCategory() ? self.selectedProductCategory().code : null,
				"productCategorySubTypeCode": self.selectedSubCategory() ? self.selectedSubCategory().code : null,
				"productCode": self.selectedProduct() ? self.selectedProduct().code : null,
				"supplierCode": self.selectedSupplierName() ? self.selectedSupplierName().code : null,
				"clientType": self.selectedClientType() ? self.selectedClientType().code : null,
				"clientCategory": self.selectedClientCategory() ? self.selectedClientCategory().code : null,
				"clientSubCategory": self.selectedClientSubCategory() ? self.selectedClientSubCategory().code : null,
				"clientCode": self.selectedClientName() ? self.selectedClientName().code : null ,
				"clientGroup": self.selectedClientGroup() ? self.selectedClientGroup().code : null,
				"pageSize": null
			};
var data = ko.toJSON(body);
var size=25;
var currentPage=0;
			$.ajax({
				type : 'POST',
				contentType : 'application/json;',
				url : ACC.config.contextPath
						+ "/operations/en/reconfirmation/search?size="+size+"&page="+currentPage+"&show=Page",
				data : data,
				dataType : 'json',
				success: function (datas) {
		//		console.log("Search results"+ko.toJSON(datas));
			 var configurations = datas;
			 self.resultantConfigurations(configurations.results);
				}
			});
		} else {
			// display mandatory validation
			self.validationError(true);
		}
	};

	self.resetForm = function () {
		// display mandatory validation
		self.validationError(false);
		self.resultantConfigurations.removeAll();
		self.selectedConfiguration(null);
		self.selectedProductCategory(null);
		self.selectedSubCategory(null);
		self.selectedProduct(null);
		self.selectedSupplierName(null);
		self.selectedClientType(null);
		self.selectedClientCategory(null);
		self.selectedClientSubCategory(null);
		self.selectedClientGroup(null);
	};

// activate deactivate reconfirmation config record.
	self.activateDeactivate = {
		forActivate: ko.observable(),
		effectiveFromDate: ko.observable(),
		reason: ko.observable(),
		code:null,
		actionButtonClicked: function (data) {
			//make ajax call
			//var payload = "{'effectiveFromDate':'12/12/2016','status':'true','reason':'I want to deactivate that why...!!','code':'00011003'}";
			var payload = {
			//	effectiveFromDate:moment(this.activateDeactivate.effectiveFromDate()).format("YYYY MM DD, hh:mm:ss"),
				effectiveFromDate:moment(this.activateDeactivate.effectiveFromDate()).format("YYYY-MM-DD hh:mm:ss"),
			//	effectiveFromDate:this.activateDeactivate.effectiveFromDate(),
				reason:this.activateDeactivate.reason(), 
				status:this.activateDeactivate.forActivate(),
				rcCode:this.activateDeactivate.code};
				var dump = JSON.stringify(payload);
				$.ajax({
					type: "POST",
					contentType : 'application/json;',
					url: ACC.config.contextPath + "/operations/en/reconfirmation/activate",
					data:dump,
					dataType : 'json',
					success: function (results) {
						console.log(results);
					},
					error: function() {
					console.log("Error cought...!!");
					}
				});
		}		
	}
	
	this.doActivate = function(data) {
        console.log("called for Activate " + data.code);
		self.activateDeactivate.code = data.code;
		//TODO: set activate deactivate depending on the selected data
		self.activateDeactivate.forActivate(true);
		self.activateDeactivate.effectiveFromDate(new Date());
		self.activateDeactivate.reason(self.activateDeactivate.rcCode);
        return true;
    }
	
	this.doDeactivate = function(data) {
        console.log("called for Deactivate " + data.code);
		self.activateDeactivate.code = data.code;
		//TODO: set activate deactivate depending on the selected data
		self.activateDeactivate.forActivate(false);
		self.activateDeactivate.effectiveFromDate(new Date());
		self.activateDeactivate.reason(self.activateDeactivate.rcCode);
        return true;
    }
	
	// checking record is locked by someone fo editing or not .
		self.checkLocked = function(data) {
		if(data.lockedBy!=null){
			bootbox.dialog( {
				message: 'The record cannot be edited and is locked by <<'+data.lockedBy.uid+'>> and not allow the user to edit.'
			});
		}else{
			return true;
	}
	return false;
    }

	// call for deleting the record
	self.deleteLinkClicked = function (data) {
	console.log(data.code);
		bootbox.dialog( {
			message: "Are you sure you want to remove/delete the entry?",
			buttons:  {
				no: {
					label: "No",
					callback: function () {
						// Do nothing
						}
					}, 
				yes: {
				label: "Yes",
				callback: function () {
					$.ajax({
						type : "GET",
						url : ACC.config.contextPath
								+ "/operations/en/reconfirmation/delete/" + data.code,
						success : function(results) {
							console.log(results);
						},
						error : function(error) {
							console.log("Error Got it:" + error);
						}
					});
					}
				}
			}
		});
		
		return false;
	};
}

$(document).ready(function () {
	// we should have
	ko.applyBindings(new ReconfirmationConfigurationSearchModel());
});
