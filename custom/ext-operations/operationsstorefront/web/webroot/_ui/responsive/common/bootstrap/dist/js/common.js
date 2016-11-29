$(function(){
	var tableWidth, thWidth, counter=0;
	tableWidth = $('.table-fixed').width();
	$(document).on('click', '.exp-collapse', function(){
		$this = $(this)
		thWidth = 0;
		var selItem = $(this).attr('data-item');
        $('.travel-list.active .table-fixed').addClass('clear-text');
        console.log(tableWidth)
		$('.travel-list.active .table-fixed th.'+selItem).each(function(){
            counter = counter + 1;
			thWidth += $('.travel-list.active .table-fixed th.'+selItem).outerWidth(true);
            console.log(thWidth)
			$('.travel-list.active .table-fixed').attr('width', tableWidth - thWidth);
		});
		
        $('.travel-list.active .'+selItem).css({'text-indent': '-99999999px'});
		$('.travel-list.active .'+selItem + ',' + '.travel-list.active .main-'+selItem).animate({
			width: "65px"
		}, function(){
			$this.parent().addClass('table-collapse');
		});
	});
	$(document).on('click', '.table-collapse .exp-collapse', function(){
		$this = $(this)
		$('.active.travel-list .table-fixed').attr('width', tableWidth);
		var selItem = $(this).attr('data-item');
		$('.active .'+selItem + ',' + '.main-'+selItem).animate({
			width: "inherit"
		}, function(){
			$('.active.travel-list .'+selItem + ',' + '.main-'+selItem).removeAttr('style')
			$this.parent().removeClass('table-collapse');
			$('.active .'+selItem).css('text-indent', 'inherit');
			$(this).closest('.table-fixed').removeClass('clear-text');
		});
		
	});
});
