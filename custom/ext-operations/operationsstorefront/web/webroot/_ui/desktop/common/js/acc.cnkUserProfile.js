$(document).ready(function() {
	// set initial state.

	$("input[name='compname']").change(function() {
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

	});

});
