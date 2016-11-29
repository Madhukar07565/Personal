jQuery.fn.exists = function(){return this.length>0;}

;(function($) {

    $.fn.Gridder = function(options) {

        var mybloc;
        var gridder = $('<div class="gridder-show"></div>');
        var animationSpeed = 600;
        var animationEasing = "linear";
        var visible = false;
        
        return this.each(function() {

					$('.holidayGrayContrInner,.showContainer').click(function(e) {
						e.preventDefault();
						
						/* Remove any other visible blocks */
						$('.gridder-show').remove();
						
						
		
						/* Show the expanded view after the div which has a class of activeThumb */
						if (!$(this).parent().hasClass('activeThumb')) {
							$('.activeThumb').removeClass('activeThumb');
							$(this).parent().addClass("activeThumb");
						}
						
						
						mybloc = gridder.insertAfter($(this).closest('.gridder-list'));
						
						
						/* EXPANDED OUTPUT */ 
						var currentcontent = $(this).find('.gridder-content').html();
						htmlcontent = "<article class=innerContent>"+ currentcontent+ "</article>";
						
						mybloc.html(htmlcontent);
						
						
						if (!visible) {
							mybloc.find('.innerContent').slideDown(animationSpeed, animationEasing, function() {
								visible = true;
							});
						} else {
							mybloc.find('.innerContent').fadeIn(animationSpeed, animationEasing, function() {
								visible = true;
							});
						}
						
						//attach slick
						var _imageSlider = mybloc.find('.image_slider');
						var _prevArrow = _imageSlider.find('.arrowPrevSmall');
						var _nextArrow = _imageSlider.find('.arrowNextSmall');

						_imageSlider.slick({
							arrows: false,
							dots: false,
							slidesToShow: 1,
							fade: true
						});
						_prevArrow.click(function(evt) {
							evt.stopPropagation();
							_imageSlider.slickPrev();
						});
						_nextArrow.click(function(evt){
							evt.stopPropagation();
							_imageSlider.slickNext();
						});
						
						/* SCROLLS TO CORRECT BLOC */
						
						  
						if($("#768-ported-view").is(':visible')){
							$('html, body').animate({
							scrollTop: $(".gridder-show").position().top + $("#768-ported-view").height()
						  }, 800);
						} 
						else{
							$('html, body').animate({
							scrollTop: $(".gridder-show").position().top
						  }, 800);	
						}
						$('.holidayHrdr').on('click', function (e) {
							$(this).next('.holidayDetailContr').slideToggle();
							$(this).toggleClass("active");
							if ($(this).hasClass('active')) {
								$(this).find('img').attr('src','images/common/expand_blu.png');		   
							}else{
								$(this).find('img').attr('src','images/common/collapse_blu.png');
							}
						});	
						
			});
            
            
					/* CLOSE BUTTON */
					$('.gridder').on('click', '.gridder-close', function() {
						$('.activeThumb').removeClass('activeThumb');
						$('.gridder-show').remove();
					});
					
					
				
		
        });
		
    };
	
})(jQuery);


/*function checkThis(id1){
	alert(id1)
	if(document.getElementById(id1).checked == true){
		document.getElementById(id1).checked = false;
	
	}
	else{
	document.getElementById(id1).checked = true;
	
	}
}*/


function addToCompare()
{
	var checked = $('.gridder :checked').size();
	if( checked == 3)
	{
		$('html, body').animate({scrollTop:0}, 'slow');
		popupwin('compareHolidays', 'fade');
	}
	
}


function removeCompare(id)
{
	document.getElementById(id).style.display = "none";
}

function checkRemovedSearch(){
	 var hidden = $('.searchedResult :hidden').size();
	    if( hidden >= 30){
			$("#show_holiday_penel_top, #compareButton").hide();
		}
		else{
			 $("#show_holiday_penel_top").show();
			}
	
	}


function addToCompareHolidays()
{
	var checked = $('.gridder :checked').size();
	if( checked == 1)
	{
		$("#show_holiday_penel_top, #searchedResult1").show();
	}
	else if( checked == 2){
		$("#show_holiday_penel_top, #searchedResult1, #searchedResult2").show();
		}
    else if( checked == 3){
		$("#show_holiday_penel_top, #searchedResult1, #searchedResult2 , #searchedResult3 , #compareButton").show();
		}		
	
	else  if( checked == 0){
		$("#show_holiday_penel_top, #searchedResult1").hide();
		}	
    		
	
}


	$(function() {
			$('.gridder').Gridder();
			//begin_animation_hotels();
		});
		
		   
						 $('.holidayHrdr').on('click', function (e) {
							 $(this).next('.holidayDetailContr').slideToggle();
							 $(this).toggleClass("active");
							 if ($(this).hasClass('active')) {
								$(this).find('img').attr('src','images/common/expand_blu.png');		   
							}else{
								$(this).find('img').attr('src','images/common/collapse_blu.png');
							}
						});	  
		



