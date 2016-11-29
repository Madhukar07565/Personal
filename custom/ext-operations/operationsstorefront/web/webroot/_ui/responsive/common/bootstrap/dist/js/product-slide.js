$(function(){
	$('#productSummary').slick({
		dots: false,
		infinite: false,
		speed: 300,
		slidesToShow: 3,
		slidesToScroll: 1,
	});
	
	$('.product-items .item-group button, #multiple-items button').click(function(){
        var journeyList = $(this).attr('data-list');
        if($('#'+ journeyList).length > 0){
            console.log(journeyList);
            
            $('.sub-item-group-2 button').removeClass('active');
            $('.item-group button').removeClass('active');
            $('.travel-list').removeClass('active');
            $('.travel-list').slideUp();
            $('.travel-mode').hide().removeClass('active');
            $('#'+journeyList).closest('.travel-mode').show().addClass('active');
            $('#'+journeyList).slideDown().addClass('active');
            $(this).addClass('active');
            if(journeyList == "pets2" || journeyList == "multiple-items" || journeyList == "parking" || journeyList == "ronnie" || journeyList == "grimshow")
                {
                    $('#multiple-items').slideDown();
                    $('.product-items button[data-list="multiple-items"]').addClass('active');
                }else
                    {
                        $('#multiple-items').slideUp();
                    }
        }else{
            $('#'+journeyList).closest('.travel-mode').hide().removeClass('active');
            $('#'+journeyList).slideUp().removeClass('active');
        }
	});
    
   /* $('#multiple-items button').click(function(){
        var otherOptions = $(this).attr('data-list');
        console.log(otherOptions);
        $('.sub-item-group-2 button').removeClass('active');
		$(this).addClass('active');
        $('#'+otherOptions).closest('.travel-mode').show().addClass('active');
		$('#'+otherOptions).slideDown().addClass('active');
    });*/
    
});
