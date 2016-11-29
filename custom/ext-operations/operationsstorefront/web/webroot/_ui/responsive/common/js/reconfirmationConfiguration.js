function ajax_response(response, success) {
	return function(params) {
		if (success) {
			params.success(response);
		} else {
			params.error(response);
		}
	};
}
var mode;
var confirmationFor;
var clientTypes;
var recofirmationCutOffType;
var recofirmationToBeSentTo;
var clientCategories;
var clientSubCategories;
var productCategoryAndSubCategories;
var clientGroups;
var productCategories;
var productResults;
var continents;
var countries;
var cities;

var ReconfirmationConfigurationModel = function() {
	var self = this;

	self.isEditable = ko.observable(mode);

	self.configurations = ko.observableArray($.parseJSON(confirmationFor));
	self.selectedConfiguration = ko.observable();

	self.productCategories = ko.observableArray($
			.parseJSON(productCategoryAndSubCategories));

	self.selectedProductCategory = ko.observable();
	self.selectedProductSubCategory = ko.observable();

	self.products = ko.observableArray();

	self.selectedProduct = ko.observable();

	self.selectedProductSubType = ko.observable();

	self.selectedProductFlavor = ko.observable();

	this.selectedProductCategory.subscribe(function(newValue) {
		self.products.removeAll();
});

	this.selectedProductSubCategory.subscribe(function(newValue) {
		// ajax call for product name, sub type and flavor
		if(newValue){
		$.ajax({
			type : "GET",
			url : ACC.config.contextPath
					+ '/operations/en/reconfirmation/search-product',
			data : {
				"categoryCode" : '',
				"subCategoryCode" : newValue.code
			},
			success : function(results) {
				self.products(results);
			},
			error : function(error) {
				console.log("Error caught:" + error);

			}
		});
		}
	});
	self.clientTypes = ko.observableArray($.parseJSON(clientTypes));
	self.selectedClientType = ko.observable();

	self.clientCategories = ko.observableArray($.parseJSON(clientCategories));
	self.selectedClientCategory = ko.observable();

	self.clientSubCategories = ko.observableArray($
			.parseJSON(clientSubCategories));
	self.selectedClientSubCategory = ko.observable();

	self.reconfirmationToBeSentTypes = ko.observableArray($
			.parseJSON(recofirmationToBeSentTo));

	self.selectedReconfirmationToBeSentType = ko.observable();

	self.clientNames = ko.observableArray();

	self.selectedClientName = ko.observable();
	self.selectedClientGroup = ko.observable();

	self.selectedClientCategory
			.subscribe(function(newValue) {
				// new value is the selected product category by user. Use
				// newValue.code or newValue.type to pass it to the ajax call.
				// ajax call for product name, sub type and flavor
				// TODO: remove this line while integrating with JSP
				$.ajax = ajax_response(
						'[{"code": "CnkB2BUnit1","name": "Global Travels","clientGroup": "B2BUnit"},{"code": "CnkB2BUnit2","name": "Global Tours","clientGroup": "B2BUnit"}]',
						true);

				$.ajax({
					type : "POST",
					url : "clientNames",
					// data: {…},
					success : function(results) {
						var names = $.parseJSON(results);
						// console.log(names);
						// set this as product array
						self.clientNames(names);
					}
				});
			});

	self.clientGroups = ko.observableArray();
	self.selectedGroup = ko.observable();

	self.selectedClientSubCategory
			.subscribe(function(newValue) {

				// new value is the selected product category by user. Use
				// newValue.code or newValue.type to pass it to the ajax call.
				// ajax call for product name, sub type and flavor
				// TODO: remove this line while integrating with JSP
				//$.ajax = ajax_response('[{"code": "E00Indigo","name": "Indigo","productSubType": [{"code": "C001ST005","name": "CaravanT","productFlavor": [{"code": "C001ST005","name": "Caravan"},{"code": "C001ST006","name": "Cruise"}]},{"code": "C001ST006","name": "Cruise","productFlavor": [{"code": "C001ST005","name": "Caravan"},{"code": "C001ST006","name": "Cruise"}]}]},{"code": "E00Etihad Airways","name": "Etihad Airways","productSubType": [{"code": "C001ST005","name": "CaravanP","productFlavor": [{"code": "C001ST005","name": "Caravan"},{"code": "C001ST006","name": "Cruise"}]},{"code": "C001ST006","name": "Cruise","productFlavor": [{"code": "C001ST005","name": "Caravan"},{"code": "C001ST006","name": "Cruise"}]}]},{"code": "E00Emirates","name": "Emirates","productSubType": [{"code": "C001ST005","name": "CaravanS","productFlavor": [{"code": "C001ST005","name": "Caravan"},{"code": "C001ST006","name": "Cruise"}]},{"code": "C001ST006","name": "Cruise","productFlavor": [{"code": "C001ST005","name": "Caravan"}, {"code": "C001ST006","name": "Cruise"}]}]}]',true);

				$.ajax({
					type : "GET",
					contentType : 'application/json;',
					url : ACC.config.contextPath
							+ '/operations/en/reconfirmation/add-record/search-client',
					 data: {
						 "clientCategory":'',
						 "clientSubCategory":''
					 },
					success : function(results) {
						self.clientNames(results);
						// set this as product array
						// self.products = json;
					}
				});
			});

	self.clientDetails = ko.observableArray();

	self.clientDetailsAdd = function() {
		self.clientDetails.push(this.selectedClientType);
		console.log(this.selectedClientType());
	};

	// Add Reconfirmation record in DB.
	self.saveButtonClicked = function(data) {
		// call your ajax here
		var d1='{"approvalStatus":"CHECK","code":"00018038","active":true,"reason":null,"creationTime":1471628634000,"confirmationFor":"Supplier & Client","lockedBy":null,"product":{"code":"129","name":"Air India"},"productCategory":{"code":"C005","name":"Accommodation"},"productCategorySubType":{"code":"C005ST002","name":"Motels"},"supplierReconfirmationConfigs":[{"supplier":{"name":"GTA","shortName":null,"code":"GTA","supplierType":null,"parentCompany":null,"address":null},"reconfirmationTo":"TO_CLIENT","supplierReconfirmationInterval":{"reconfirmationCutOff":"PRIOR_TO_TRAVEL_DATE","cutoff":7,"cutOffDaysOrHours":"HOURS"}}],"clientReconfirmationConfigs":[{"client":{"uid":"CnkB2BUnit1","name":"Global Tours"},"reconfirmationTo":"TO_SUPPLIER","clientReconfirmationInterval":{"reconfirmationCutOff":"PRIOR_TO_TRAVEL_DATE","cutoff":10,"cutOffDaysOrHours":"HOURS"}}],"reconfirmationintervals":null,"reconfirmationTravelDestinations":[{"inclusion":true,"city":{"cityIsoCode":"JAI","cityName":"Jaipur"},"country":{"isocode":"IN","name":"India","countryCode":"091"},"continent":{"isocode":"AS","name":"Asia","countries":[]}}]}';
		var d2='{"approvalStatus":"CHECK","code":"00018038","active":true,"reason":null,"creationTime":1471628634000,"confirmationFor":"Supplier & Client","lockedBy":{"name":"null","middleName":null,"contactEmail":null,"mobileNumber":null,"defaultCompany":null,"designation":null,"functionalRole":null,"reportingManager":null,"isManager":null,"bu":null,"sbu":null,"salesOffice":null,"salesGroup":null,"roles":[],"defaultBillingAddress":null,"defaultShippingAddress":null,"titleCode":null,"uid":"admin","firstName":"null","lastName":null,"currency":null,"language":{"isocode":"en","name":"English","nativeName":"English","active":true},"displayUid":"admin"},"product":{"code":"124","name":"Air India","url":"/c/Air-India/p/126","description":null,"purchasable":true,"stock":null,"futureStocks":null,"availableForPickup":null,"averageRating":null,"numberOfReviews":null,"summary":null,"manufacturer":null,"variantType":null,"price":null,"baseProduct":null,"images":null,"categories":null,"reviews":null,"classifications":null,"potentialPromotions":null,"variantOptions":null,"baseOptions":[],"volumePricesFlag":null,"volumePrices":null,"productReferences":null,"variantMatrix":null,"priceRange":null,"firstCategoryNameList":null,"multidimensional":null,"keywords":null},"productCategory":{"code":"C003","name":"Accommodation","url":"/Accommodation/c/C002","description":null,"image":null,"parentCategoryName":null,"sequence":0},"productCategorySubType":{"code":"C003ST003","name":"Motels","url":null,"description":null,"image":null,"parentCategoryName":null,"sequence":0,"suppliers":[]},"supplierReconfirmationConfigs":null,"clientReconfirmationConfigs":[{"client":{"uid":"CnkB2BUnit1","name":"Global Tours","members":null,"subGroups":null,"membersCount":null,"unit":null,"active":false,"selected":false,"selectable":false,"reportingOrganization":null,"budgets":null,"orders":null,"costCenters":null,"userGroups":null,"accountManagerGroups":null,"children":null,"administrators":null,"customers":null,"managers":null,"accountManagers":null,"addresses":null,"approvalProcessCode":null,"approvalProcessName":null,"approvers":null,"approverGroups":null,"code":"CnkB2BUnit1","clientCategory":"ALLIANCE_PARTNERS","clientSubCategory":"BANKS","clientGroupCompany":"TATA_GROUP","trvlClientType":"B2B"},"reconfirmationTo":"TO_CLIENT","clientReconfirmationInterval":{"reconfirmationCutOff":"PRIOR_TO_TRAVEL_DATE","cutoff":7,"cutOffDaysOrHours":"DAYS"}}],"reconfirmationintervals":null,"reconfirmationTravelDestinations":[{"inclusion":true,"city":{"cityIsoCode":"JAI","cityName":"Jaipur"},"country":{"isocode":"IN","name":"India","countryCode":"091"},"continent":{"isocode":"AS","name":"Asia","countries":[]}}]}';	
		$.ajax({
			contentType : 'application/json;',
			url : ACC.config.contextPath
					+ '/operations/en/reconfirmation/add-record',
			data : d1,
			type : 'POST',
			dataType : 'json',
			success : function(data) {
				console.log(data);
			},
			error : function(xhr, textStatus, error) {
				console.log("Error");
			}
		});

	};

	// Updating Reconfirmation record in DB.
	self.updateButtonClicked = function(data) {
		// call your ajax here
		var d1='{"approvalStatus":"CHECK","code":"00025004","active":true,"reason":null,"creationTime":1471628634000,"confirmationFor":"Supplier & Client","lockedBy":null,"product":{"code":"129","name":"Air India"},"productCategory":{"code":"C005","name":"Accommodation"},"productCategorySubType":{"code":"C005ST002","name":"Motels"},"supplierReconfirmationConfigs":[{"supplier":{"name":"GTA","shortName":null,"code":"GTA","supplierType":null,"parentCompany":null,"address":null},"reconfirmationTo":"TO_CLIENT","supplierReconfirmationInterval":{"reconfirmationCutOff":"PRIOR_TO_TRAVEL_DATE","cutoff":7,"cutOffDaysOrHours":"HOURS"}}],"clientReconfirmationConfigs":[{"client":{"uid":"CnkB2BUnit1","name":"Global Tours"},"reconfirmationTo":"TO_SUPPLIER","clientReconfirmationInterval":{"reconfirmationCutOff":"PRIOR_TO_TRAVEL_DATE","cutoff":10,"cutOffDaysOrHours":"HOURS"}}],"reconfirmationintervals":null,"reconfirmationTravelDestinations":[{"inclusion":true,"city":{"cityIsoCode":"JAI","cityName":"Jaipur"},"country":{"isocode":"IN","name":"India","countryCode":"091"},"continent":{"isocode":"AS","name":"Asia","countries":[]}}]}';
		var d2='{"approvalStatus":"CHECK","code":"00024000","active":true,"reason":null,"creationTime":1471628634000,"confirmationFor":"Supplier & Client","lockedBy":{"name":"null","middleName":null,"contactEmail":null,"mobileNumber":null,"defaultCompany":null,"designation":null,"functionalRole":null,"reportingManager":null,"isManager":null,"bu":null,"sbu":null,"salesOffice":null,"salesGroup":null,"roles":[],"defaultBillingAddress":null,"defaultShippingAddress":null,"titleCode":null,"uid":"admin","firstName":"null","lastName":null,"currency":null,"language":{"isocode":"en","name":"English","nativeName":"English","active":true},"displayUid":"admin"},"product":{"code":"125","name":"Air India","url":"/c/Air-India/p/126","description":null,"purchasable":true,"stock":null,"futureStocks":null,"availableForPickup":null,"averageRating":null,"numberOfReviews":null,"summary":null,"manufacturer":null,"variantType":null,"price":null,"baseProduct":null,"images":null,"categories":null,"reviews":null,"classifications":null,"potentialPromotions":null,"variantOptions":null,"baseOptions":[],"volumePricesFlag":null,"volumePrices":null,"productReferences":null,"variantMatrix":null,"priceRange":null,"firstCategoryNameList":null,"multidimensional":null,"keywords":null},"productCategory":{"code":"C004","name":"Accommodation","url":"/Accommodation/c/C002","description":null,"image":null,"parentCategoryName":null,"sequence":0},"productCategorySubType":{"code":"C003ST003","name":"Motels","url":null,"description":null,"image":null,"parentCategoryName":null,"sequence":0,"suppliers":[]},"supplierReconfirmationConfigs":null,"clientReconfirmationConfigs":[{"client":{"uid":"CnkB2BUnit1","name":"Global Tours","members":null,"subGroups":null,"membersCount":null,"unit":null,"active":false,"selected":false,"selectable":false,"reportingOrganization":null,"budgets":null,"orders":null,"costCenters":null,"userGroups":null,"accountManagerGroups":null,"children":null,"administrators":null,"customers":null,"managers":null,"accountManagers":null,"addresses":null,"approvalProcessCode":null,"approvalProcessName":null,"approvers":null,"approverGroups":null,"code":"CnkB2BUnit1","clientCategory":"ALLIANCE_PARTNERS","clientSubCategory":"BANKS","clientGroupCompany":"TATA_GROUP","trvlClientType":"B2B"},"reconfirmationTo":"TO_CLIENT","clientReconfirmationInterval":{"reconfirmationCutOff":"PRIOR_TO_TRAVEL_DATE","cutoff":7,"cutOffDaysOrHours":"DAYS"}}],"reconfirmationintervals":null,"reconfirmationTravelDestinations":[{"inclusion":true,"city":{"cityIsoCode":"JAI","cityName":"Jaipur"},"country":{"isocode":"IN","name":"India","countryCode":"091"},"continent":{"isocode":"AS","name":"Asia","countries":[]}}]}';	
		$.ajax({
			contentType : 'application/json;',
			url : ACC.config.contextPath
			+ '/operations/en/reconfirmation/update-record',
			data : d1,
			type : 'POST',
			dataType : 'json',
			success : function(data) {
				console.log(data);
			},
			error : function(xhr, textStatus, error) {
				console.log("Error");
			}
		});
		
	};
	// Releasing Reconfirmation record in DB.
	self.releaseLockButtonClicked = function(data) {
		// call your ajax here
		$.ajax({
			type : 'GET',
			contentType : 'application/json;',
			url : ACC.config.contextPath
			+ '/operations/en/reconfirmation/releaselock',
			data :{
				"rc_code":data.code
			},
			dataType : 'json',
			success : function(data) {
				console.log(data);
			},
			error : function() {
				console.log("Error");
			}
		});
		
	};

	// Approval the Reconfirmation record in DB.
	self.approvalButtonClicked = function(data) {
		// call your ajax here
		$.ajax({
			type : 'GET',
			contentType : 'application/json;',
			url : ACC.config.contextPath
			+ '/operations/en/reconfirmation/approval',
			data :{
				"rc_code":'00019000',
				"remark":'Testing Approval'
			},
			dataType : 'json',
			success : function(data) {
				console.log(data);
			},
			error : function() {
				console.log("Error");
			}
		});
	};

	// Reject the Reconfirmation record in DB.
	self.rejectButtonClicked = function(data) {
		// call your ajax here
		$.ajax({
			type : 'GET',
			contentType : 'application/json;',
			url : ACC.config.contextPath
			+ '/operations/en/reconfirmation/reject',
			data :{
				"rc_code":'00019000',
				"remark":'Testing Reject'
			},
			dataType : 'json',
			success : function(data) {
				console.log(data);
			},
			error : function() {
				console.log("Error");
			}
		});
	};

}

$(document).ready(function() {

	// // we should have
	ko.applyBindings(new ReconfirmationConfigurationModel());
});
