function ManageBooking() {

	var self = this;

	self.clientReferral = {
		isEditable: ko.observable(false),
		passengerName: ko.observable("Jayant"),
		passengerInformation: ko.observable("Trip"),
		referredBy: ko.observable("Shivraj"),
		referreDetails: ko.observable("Alam"),
		clientTypes: ko.observableArray(),
		selectedClientType: ko.observable(),
		editButtonClicked: function (data) {
			data.clientReferral.isEditable(true);
		}
	}
}

$(document).ready(function () {
	var model = new ManageBooking();
	model.clientReferral.clientTypes = [{
			code: "code1",
			name: "Client 1"
	}, {
			code: "code2",
			name: "Client 2"
		}
	];
	ko.applyBindings(model);
});


function updateTimeLimitAjax() {
	var data = {}
	var d = new Date();

	$.ajax({
		type : "GET",
		contentType : "application/json",
		url : contextPath+"/order/AIR-1234/updateTimeLimit",
		data: {
			orderCode: "AIR-1234",
			updatedDate: d,
		 },

		dataType : 'json',
		timeout : 100000,
		success : function(data) {
			console.log("SUCCESS: ", data);
			display(data);
		},
		error : function(e) {
			console.log("ERROR: ", e);
			display(e);
		},
		done : function(e) {
			console.log("DONE");
		}
	});
}
