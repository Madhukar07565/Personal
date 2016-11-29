$(function(){
	$(document).on('click', '.saved-search-arrow', function(){
		
		$('#savedSearch').addClass('noWrap').animate({
			width: 'toggle'
		},function(){
		$('.detail-accordion').toggleClass('accordion-expand');
		$('.saved-search-arrow').toggleClass('saved-search-arrow expand-search-arrow')
		});
	});
	$(document).on('click', '.expand-search-arrow', function(){
        $('.detail-accordion').toggleClass('accordion-expand');
		$('#savedSearch').animate({
			width: 'toggle'
		},function(){
			$(this).removeClass('noWrap');
			$('.expand-search-arrow').toggleClass('saved-search-arrow expand-search-arrow')
		});
   });
});
