$(document).ready(function() {
	$("#custDetail").validate({
		onsubmit:true,
		submitHandler: function(form) {
			var customer = $('#custDetail').serializeJSON();
			$.ajax({
				url : ACC.config.contextPath + "/ezgsave/customer",
				type : "POST",
				dataType : "json",
				data: JSON.stringify(customer),
				error : function(request) {
					alert("Connection error");
				},
				success : function(data) {
					if (customer.middleName) {
						$(".customerName").text(customer.firstName + " " + customer.middleName + " " + customer.lastName);
					} else {
						$(".customerName").text(customer.firstName + " " + customer.lastName);
					}
					$(".customerEmail").text(customer.email);
					$(".customerMobileNumber").text(customer.mobileNumber);
					$("#customerSummary").slideDown('fast');
					$("#addCustContr").hide();
					$("#custDetail").hide();
				}
			});
		},
		rules: {
			firstName: {
				required: true,
				noSpecialChar: true
			},
			middleName: {
				noSpecialChar: true
			},
			lastName: {
				required: true,
				noSpecialChar: true
			},
			email: {
				required: true,
				email: true
			},
			mobileNumber: {
				required: true,
				noSpecialChar: true,
				number: true
			},
			pinCode: {
				required: true,
				noSpecialChar: true,
			}
		}
	});
	
	var components = [ "titleDropDownList", "cityDropDownList" ];
	$.ajax({
		url : ACC.config.contextPath + "/ezgsearch/dropdownlist",
		type : "GET",
		dataType : "json",
		traditional:true,
		data : {
			components : components
		},
		success : function(data) {
			for(var i in components) {
				var component = components[i];
				var contents = data[component];
				if (contents.length == 0) {
					$("." + component).append("<option disabled=\"disabled\">Select Record</option>");
				} else {
					for (var j in contents) {
						$("." + component).append("<option>" + contents[j] + "</option>");
					}
				}
			}
		}
	});
});

$(".addAnotherFieldButton").click(function(e) {
	e.preventDefault();
	var fieldName = $(this).attr("id");
	var field = $("." + fieldName + ":first");

	field.parent().append(field.clone(true));
});

$("#custId").autocomplete({
	minLength: 3,
	cacheLength: 1,
	matchContains: true,
	autoFocus: true,
	position: {my: "left top", at:"left bottom"},
	source : function(request, response) {
		$.ajax({
			url: ACC.config.contextPath + "/ezgsearch/autocomplete",
			type : "GET",
			dataType: "json",
			data: {
				component: "customer",
				term: request.term,
				maximum: 10
			},
			success: function(data) {
				return response($.parseJSON(data));
			}
		});
	},
	select : function(event, ui) {
		$(".customerName").text(ui.item.name);
		$(".customerEmail").text(ui.item.emails[0]);
		$(".customerMobileNumber").text(ui.item.mobiles[0]);
		$("#customerSummary").slideDown('fast');
		$("#addCustContr").hide();
		$("#custDetail").hide();
	}
})
.data( "ui-autocomplete" )._renderItem = function( ul, item ) {
	return $("<li>").append(item.name + " " +item.uid + " " + item.mobiles[0]).appendTo(ul);
};

function hideCustomerSummary() {
	$("#customerSummary").slideUp('fast');
	$("#addCustContr").show();

	// Reset custDetail from.
	$("#custDetail")[0].reset();
}

function addCity(totalCount) {
	var shownCount = totalCount - $("#flightsContainer > ul:hidden").length + 1;
	$("#citySection" + shownCount).show();
	
	if (shownCount == totalCount) {
		$("#addCitySection").hide();
	}
}

function adultCountDec(id) {
	var component = $("#" + id);
	var currentCount = component.text();
	if (currentCount > 1) {
		component.text(Number(currentCount) - 1);
	}
}

function adultCountInc(id) {
	var component = $("#" + id);
	var currentCount = component.text();
	if (currentCount < 9) {
		component.text(Number(currentCount) + 1);
	}
}

function submitForm(formId) {
	$('#' + formId).submit();
}

