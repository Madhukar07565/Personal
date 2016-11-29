$(function(){
	var tableWidth, thWidth, counter=0;

	tableWidth = $('.table-ht').width();

	tableWidth = $('.table-fixed').width();

	$(document).on('click', '.exp-collapse', function(){
		$this = $(this)
		thWidth = 0;
		var selItem = $(this).attr('data-item');

		$this.closest('.travel-list.active .table-ht').addClass('clear-text');
		console.log(tableWidth)
		$('.travel-list.active .table-ht th.'+selItem).each(function(){
			counter = counter + 1;
			thWidth += $('.travel-list.active .table-ht th.'+selItem).outerWidth(true);
			console.log(thWidth)
			$this.closest('.travel-list.active .table-ht').attr('width', tableWidth - thWidth);
		});
		$this.closest('.travel-list.active').find('.'+selItem).css({'text-indent': '-99999999px'});
		$this.closest('.travel-list.active').find('.'+selItem).animate({
			width: "65px"
		});
		$this.closest('.travel-list.active').find('.main-'+selItem).animate({
			width: "65px"
		}); 
		$this.parent().addClass('table-collapse');
		var tableName = $(this).closest('.travel-list').attr('id');
		setTimeout(function(){ fixedColumn(tableName) }, 700);
	});

	$(document).on('click', '.table-collapse .exp-collapse', function(){
		$this = $(this)
		$this.closest('.active.travel-list .table-ht').attr('width', tableWidth);
		var selItem = $(this).attr('data-item');
        $this.closest('.active').find('.'+selItem+','+'.main-'+selItem).animate({
			width: "inherit"
		},function(){
			$this.closest('.active.travel-list .'+selItem + ',' + '.main-'+selItem).removeAttr('style');
			$this.parent().removeClass('table-collapse');
			$(this).removeAttr('style');
			$this.closest('.active').find('.'+selItem).css({'text-indent': 'inherit', 'width': 'inherit'});
			$this.closest('.table-ht').removeClass('clear-text');
		});
		
		var tableName = $(this).closest('.travel-list').attr('id');
		setTimeout(function(){ fixedColumn(tableName) }, 1000);
	});
    fixedColumn('list1');
});

    // Queues list collaps
    
     $(".queues-list-collapse").click(function(){
        $('.gds-queues-left').toggleClass('queues-close'); 
        $(".list-outer").animate({
            width: "toggle"
        });
    });

function fixedColumn(tableName){
	var tableH = $('#'+tableName).find('.table-ht').height();
    console.log(tableH);
    var headerRowH = $('#'+tableName).find('.three-column th').outerHeight();
    tableH = tableH - headerRowH;
	var thH = $('#'+tableName).find('.fixed-row th').outerHeight();
	var firstd = $('#'+tableName).find('.fixed-row  th:eq(0)').outerWidth();
	var secondtd = $('#'+tableName).find('.fixed-row th:eq(1)').outerWidth();
	var tableW = firstd + secondtd;
	$('#'+ tableName).find('.fixed-column').css({ "height": tableH + "px", "width": tableW + "px", 'top': headerRowH});
	$('#'+ tableName).find('.fixed-column th').css({ "height": thH + "px"});
}

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

