$(document).ready(function() {
	
	redrawDotNav();
	
	/* Scroll event handler */
    $(window).bind('scroll',function(e){
    	parallaxScroll();
		redrawDotNav();
    });
    
	/* Next/prev and primary nav btn click handlers */
	$('a.screen1').click(function(){
    	$('html, body').animate({
    		scrollTop:0
    	}, 1000, function() {
	    	parallaxScroll(); // Callback is required for iOS
		});
    	return false;
	});
    $('a.screen2').click(function(){
    	$('html, body').animate({
    		scrollTop:$('#screen2').offset().top
    	}, 1000, function() {
	    	parallaxScroll(); // Callback is required for iOS
		});
    	return false;
    });
    $('a.screen3').click(function(){
    	$('html, body').animate({
    		scrollTop:$('#screen3').offset().top
    	}, 1000, function() {
	    	parallaxScroll(); // Callback is required for iOS
		});
    	return false;
    });
	$('a.screen4').click(function(){
    	$('html, body').animate({
    		scrollTop:$('#screen4').offset().top
    	}, 1000, function() {
	    	parallaxScroll(); // Callback is required for iOS
		});
    	return false;
    });
	
	$('a.screen5').click(function(){
    	$('html, body').animate({
    		scrollTop:$('#screen5').offset().top
    	}, 1000, function() {
	    	parallaxScroll(); // Callback is required for iOS
		});
    	return false;
    });
	
	$('a.screen6').click(function(){
    	$('html, body').animate({
    		scrollTop:$('#screen6').offset().top
    	}, 1000, function() {
	    	parallaxScroll(); // Callback is required for iOS
		});
    	return false;
    });
    
    /* Show/hide dot lav labels on hover */
    $('div#slidesNavigator a').hover(
    	function () {
			$(this).prev('p').show();
		},
		function () {
			$(this).prev('p').hide();
		}
    );
    
	
	//Resize the slider container to window height
	 $('.slideHolder').css('height', window.innerHeight);
	 
});

$(window).resize(function() {
	 //Resize the slider container to window height when the window is resized
    $('.slideHolder').css('height', window.innerHeight);
});
 

/* Scroll the background layers */
function parallaxScroll(){
	var scrolled = $(window).scrollTop();
	$('#parallax-bg1').css('top',(0-(scrolled*.25))+'px');
	$('#parallax-bg2').css('top',(0-(scrolled*.5))+'px');
	$('#parallax-bg3').css('top',(0-(scrolled*.75))+'px');
}

/* Set navigation dots to an active state as the user scrolls */
function redrawDotNav(){
	var section1Top =  0;
	// The top of each section is offset by half the distance to the previous section.
	var section2Top =  $('#screen2').offset().top - (($('#screen3').offset().top - $('#screen2').offset().top) / 2);
	var section3Top =  $('#screen3').offset().top - (($('#screen4').offset().top - $('#screen3').offset().top) / 2);
	var section4Top =  $('#screen4').offset().top - (($('#screen5').offset().top - $('#screen4').offset().top) / 2);
	var section5Top =  $('#screen5').offset().top - (($('#screen6').offset().top - $('#screen5').offset().top) / 2);
	var section6Top =  $('#screen6').offset().top - (($(document).height() - $('#screen6').offset().top) / 2);
	$('nav#slidesNavigator a').removeClass('active');
	if($(document).scrollTop() >= section1Top && $(document).scrollTop() < section2Top){
		$('nav#slidesNavigator a.screen1').addClass('active');
	} else if ($(document).scrollTop() >= section2Top && $(document).scrollTop() < section3Top){
		$('nav#slidesNavigator a.screen2').addClass('active');
	} else if ($(document).scrollTop() >= section3Top && $(document).scrollTop() < section4Top){
		$('nav#slidesNavigator a.screen3').addClass('active');
	} else if ($(document).scrollTop() >= section4Top && $(document).scrollTop() < section5Top){
		$('nav#slidesNavigator a.screen4').addClass('active');
	} else if ($(document).scrollTop() >= section5Top && $(document).scrollTop() < section6Top){
		$('nav#slidesNavigator a.screen5').addClass('active');
	} else if ($(document).scrollTop() >= section6Top){
		$('nav#slidesNavigator a.screen6').addClass('active');
	}
	
}

