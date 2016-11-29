$(function() {
	$('.taskview').click(function() {
		var currentTD = this;
		if ($(".childOf_" + this.id).length == 0) {
			$.ajax({
				url : ACC.config.contextPath + "/todo/viewSubtasks/" + this.id,
				success : function(result) {
					$.each(result['tasks'], function(obj) {
						$(currentTD).closest("tr").after(result['tasks'][obj]);
					});
					$(currentTD).find('i').toggleClass('fa-minus');
					var selValue = $(currentTD).attr('data-target');
					$(selValue).slideToggle();
				}
			});
		} else {
			$(currentTD).find('i').toggleClass('fa-minus');
			var selValue = $(currentTD).attr('data-target');
			$(selValue).slideToggle();
		}

	});
});