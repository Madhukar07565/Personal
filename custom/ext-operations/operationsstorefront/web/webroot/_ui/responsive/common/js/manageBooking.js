var clientType;
var passengerName;
var passengerInformation;
var referredBy;
var refereeDetails;
function ManageBooking() {
console.log("sassadadd"+clientType);
	var self = this;
console.log(clientType);
	self.clientReferral = {
		isEditable: ko.observable(false),
		passengerName: ko.observable(passengerName),
		passengerInformation: ko.observable(passengerInformation),
		referredBy: ko.observable(referredBy),
		referreDetails: ko.observable(refereeDetails),
		clientTypes: ko.observableArray($.parseJSON(clientType)),
		selectedClientType: ko.observable(),
		editButtonClicked: function (data) {
			data.clientReferral.isEditable(true);
		}
	}
}

$(document).ready(function () {
	var model = new ManageBooking();
	//	model.clientReferral.clientTypes =clientType;
		/*[
		  {
		    "code": "VIP",
		    "name": "VIP"
		  },
		  {
		    "code": "CIP",
		     "name": "CIP"
		  },
		  {
		    "code": "RepeatClient",
		     "name": "RepeatClient"
		  },
		  {
		    "code": "CorporateStatus",
		    "name": "CorporateStatus"
		  }
		];*/
	ko.applyBindings(model);
});


