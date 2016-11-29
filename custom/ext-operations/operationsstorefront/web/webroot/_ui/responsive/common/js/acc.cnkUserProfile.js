$(document).ready(function() {
	// set initial state.

/*	$("input[name='compname']").change(function() {
		alert("hii");
		var compId = $(this).val();
		var check;
		if ($(this).is(":checked")) {
			check = true;
		} else {
			check = false;
		}
		var method = "POST";
		$.ajax({
			url : ACC.config.contextPath + '/my-account/saveCompForUserPref',
			data : {
				compId : compId,
				check : check
			},
			type : method,
			success : function(data) {
				alert(data);
			},
			error : function(xhr, textStatus, error) {

			}

		});

	});*/
});

function saveSelection() {
	var x = document.getElementsByName("compname");
	for (var index = x.length-1; index >= 0; index--) {
		var elementID = $(x[index]).attr("id")
		var isChecked = false;
		if (($(x[index]).is(":checked"))) {
			isChecked = true;
			//alert(elementID);
		}
				var method = "POST";
				$.ajax({
					url: ACC.config.contextPath + '/my-account/saveCompForUserPref',
					data: {
						compId: elementID,
						check: isChecked
					},
					type: method,
					success: function (data) {
						//alert(data);
					},
					error: function (xhr, textStatus, error) {}
				});
	}
}
