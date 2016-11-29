$(document).keydown(function(event){
	if(event && (event.keyCode == 27 || event.keyCode == 96)){
		window.location.href = window.location;
	}
});

$('.viewDetails').on('click', function (e) {
	$("#" + $(this).attr("detailsBlockId")).slideToggle("slow");
	$(this).toggleClass("active");
	if ($(this).hasClass('active')) {
		$(this).text('- View Details');
		$("#" + $(this).attr("buttonBlockId")).show();
	}else{
		$(this).text(' + View Details');
		$("#" + $(this).attr("buttonBlockId")).hide();
	}
});	

$('#confirmCancellation').on('click', function (e) {
	var bookingId = $(this).attr("bookingId");
	
	$.when($.ajax({
		url: ACC.config.contextPath+'/cancelBooking/'+bookingId, 
		type:'PUT',
		dataType:'json',
	})).done(function(data){
		$('#cancellationRequestId').text(data);
		popupclose('bookpolicy11', 'fade');
		popupwin('cancellation', 'cancellationinner', 'fade');
	}).fail(function(error){
		console.log(error);
	});
});

$('#closeCancellationConfirm').on('click', function (e) {
	window.location.href = window.location;
})
