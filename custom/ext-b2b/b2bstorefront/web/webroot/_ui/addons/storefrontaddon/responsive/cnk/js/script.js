//========================================================= open popup window =======================================

Element.prototype.remove = function() {
    this.parentElement.removeChild(this);
}
NodeList.prototype.remove = HTMLCollection.prototype.remove = function() {
    for(var i = 0, len = this.length; i < len; i++) {
        if(this[i] && this[i].parentElement) {
            this[i].parentElement.removeChild(this[i]);
        }
    }
}
function popupwin(light, fade)
 {

document.getElementById(light).style.display = 'block';
	var frame = document.getElementById(fade);
	
	var htmlheight = document.body.parentNode.scrollHeight;
	 
	var myHeight = document.body.parentNode.clientHeight;
				
		 if ( htmlheight < myHeight )
		 {
			 var frameheight = myHeight + "px";
			 frame.style.height = frameheight;
			 
		 }
		 else
		 {
			 var frameheight = htmlheight + "px";
			 frame.style.height = frameheight;
			 
		 }

 document.getElementById(fade).style.display='block';
 }

function popupclose(light, fade)
 {
	 document.getElementById(light).style.display='none';
	 document.getElementById(fade).style.display='none';
 }

jQuery.fn.exists = function(){return this.length>0;}


$(document).ready(function() {
	
	$("select").change(function () {
		$(this).addClass("defaultTextColor");
	});
	
	$("#compareTab").click( function(){
	 $("#show_holiday_panel_top").toggle();
	  $("#compareTab").toggleClass("sel");
	  $(".footerContactDetail").toggleClass("activated");
	})
	
	
	$("#tab2").click(function(){
		$("#tab1").removeClass("sel")
		$("#tab2").addClass("sel")
		$("#listViewContainer").show()
		$("#gridViewContainer").hide()
	});
	$("#tab1").click(function(){
		$("#tab2").removeClass("sel")
		$("#tab1").addClass("sel")
		$("#listViewContainer").hide()
		$("#gridViewContainer").show()
	});
	//banner
	if($().slick){
	   $('#bannerCarousel, #hotelSlideshow').slick({
				dots: false,
				arrows: true,
			    cssEase: 'linear'
			});
	}
		
	if($().datepicker){
		 $( "#checkInDate, #checkOutDate, #checkinDate2, #checkinDate2_port, #departureDate, #returnDate, #returnDate1, #checkinDate, #checkoutDate, #pickUpDate, #dropOffDate, #checkinDateHotelAdd, #checkoutDateHotelAdd, #airportTransfersDate1, #airportTransfersDate2" ).datepicker({
			numberOfMonths:2,
		 	minDate: 0,
			dateFormat: "d M, y",
			onSelect: function(dateText){
			  $(this).css("color","#333333");		
			  }
		   });
	}	
	
	if($().datepicker){
		$( "#dob, #dob1" ).datepicker({
			dateFormat: "d M, y",
			onSelect: function(dateText){
			  $(this).css("color","#333333");		
			}
		});
	}
		$('.more').on('click', function (e) {
		$("#additionalSearch").slideToggle("fast");		
		$("#holidaySearchBtn").slideToggle(1);
		if($("#flightsAndHotelsSearchBtn").exists()){
			 $("#flightsAndHotelsSearchBtn").slideToggle(1);
		}
		$(this).toggleClass("sel");
	});	
	
	$('.more1').on('click', function (e) {
		//$(this).parentsUntil(".destination").siblings(".add_search").slideToggle("fast");		
		$(".add_search").slideToggle("fast");		
		$(".holidaySearchBtn1").slideToggle(1);
		if($("#flightsAndHotelsSearchBtn").exists()){
			 $("#flightsAndHotelsSearchBtn").slideToggle(1);
		}
		$(this).toggleClass("sel");
	});
	$(document).ready(function(){
	  $(".holiday_page").show();
	   $(".dest_page, .theme_page, .all_product_page, .flight_page, .hotel_page, .active_page, .bus_page, .cruis_page, .rail_page").hide();
	$('.cnk_hoiday').click(function(){
	   $(".holiday_page").show();
	   $(".dest_page, .theme_page, .all_product_page, .flight_page, .hotel_page, .active_page, .bus_page, .cruis_page, .rail_page").hide();
	});
	$('.cnk_dest').click(function(){
	   $(".dest_page").show();
	   $(".holiday_page, .theme_page, .all_product_page, .flight_page, .hotel_page, .active_page, .bus_page, .cruis_page, .rail_page").hide();
	});
	$('.cnk_theme').click(function(){
	   $(".theme_page").show();
	   $(".holiday_page, .dest_page, .all_product_page, .flight_page, .hotel_page, .active_page, .bus_page, .cruis_page, .rail_page").hide();
	});
	$('.cnk_Collection').click(function(){
	   $(".holiday_page").show();
	   $(".dest_page, .theme_page, .all_product_page, .flight_page, .hotel_page, .active_page, .bus_page, .cruis_page, .rail_page").hide();
	  
	});
	$('.cnk_flight').click(function(){
	   $(".all_product_page, .flight_page").show();
	   $(".holiday_page, .dest_page, .theme_page, .hotel_page, .active_page, .bus_page, .cruis_page, .rail_page").hide();
	});
	$('.cnk_hotels').click(function(){
	   $(".all_product_page, .hotel_page").show();
	   $(".holiday_page, .dest_page, .theme_page, .flight_page, .active_page, .bus_page, .cruis_page, .rail_page").hide();
	});
	$('.cnk_activ').click(function(){
	   $(".all_product_page, .active_page").show();
	   $(".holiday_page, .dest_page, .theme_page, .flight_page, .hotel_page, .bus_page, .cruis_page, .rail_page").hide();
	});
	$('.cnk_bus').click(function(){
	   $(".all_product_page, .bus_page ").show();
	   $(".holiday_page, .dest_page, .theme_page, .flight_page, .hotel_page, .active_page, .cruis_page, .rail_page").hide();
	});
	$('.cnk_cruis').click(function(){
	   $(".all_product_page, .cruis_page ").show();
	   $(".holiday_page, .dest_page, .theme_page, .flight_page, .hotel_page, .active_page, .bus_page, .rail_page").hide();
	});
	$('.cnk_rail').click(function(){
	   $(".all_product_page, .rail_page").show();
	   $(".holiday_page, .dest_page, .theme_page, .flight_page, .hotel_page, .active_page, .bus_page, .cruis_page").hide();
	});
	$('.comm_product').click(function(){
	   $(".all_product_page").show();
	   $(".holiday_page, .dest_page, .theme_page, .flight_page, .hotel_page, .active_page, .bus_page, .cruis_page, .rail_page").hide();
	});
	});
	
	$('.listMenuLink').on('click', function (e) {
		$("#cntList").slideToggle("fast");
		if($("#accountList").is(":visible")){
			$("#accountList").hide();
			}
		
		if( $("#reportOpt").is(":visible") ){
			$("#reportOpt").hide(); 
			$("#moreArrow").removeClass("sel");
			}
	});
	
	
		$('.listMenuLink_myaccount').on('click', function (e) {
		$("#accountList").slideToggle("fast");
		 if($("#reportOpt").is(":visible")){
			   $("#reportOpt").hide();
			   $("#moreArrow").removeClass("sel");
			 }
			 
		 if($("#cntList").is(":visible")){
			   $("#cntList").hide();
			 }
	});

		
		
	/*Custom calendar function*/	
	if($().calendario)
	{
		var cal = $( '#calendar' ).calendario( {
			onDayClick : function( $el, $contentEl, dateProperties ) {
				for( var key in dateProperties ) {
					console.log( key + ' = ' + dateProperties[ key ] );
				}
			},
			caldata : codropsEvents
		} ),
		$month = $( '#custom-month' ).html( cal.getMonthName() ),
		$year = $( '#custom-year' ).html( cal.getYear() );
		
		$(".fc-row div").click( function(){
		$(this).addClass("fc-selected").siblings().removeClass("fc-selected");
			$('.fc-body div').not(this).each(function(){
			 $(this).removeClass("fc-selected");
			});
		});
		
		$( '#custom-next' ).on( 'click', function() {
		cal.gotoNextMonth( updateMonthYear );
		   $(".fc-row div").click( function(){
			$(this).addClass("fc-selected").siblings().removeClass("fc-selected");
				$('.fc-body div').not(this).each(function(){
				 $(this).removeClass("fc-selected");
				});
			});
		
		} );
		$( '#custom-prev' ).on( 'click', function() {
		cal.gotoPreviousMonth( updateMonthYear );
		   	$(".fc-row div").click( function(){
			$(this).addClass("fc-selected").siblings().removeClass("fc-selected");
				$('.fc-body div').not(this).each(function(){
				 $(this).removeClass("fc-selected");
				});
			});

		
		} );
		$( '#custom-current' ).on( 'click', function() {
		cal.gotoNow( updateMonthYear );
		} );
		function updateMonthYear() {				
		$month.html( cal.getMonthName() );
		$year.html( cal.getYear() );
		}
	}
		
		
		
	if($().slider){
		//slider range
		$( "#slider-range" ).slider({
		range: true,
		min: 0,
		max: 100000,
		values: [ 0, 30000 ],
		slide: function( event, ui ) {
		$( "#amount1" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
		}
		});
		$( "#amount1" ).val( $( "#slider-range" ).slider( "values", 0 ) +" - " + $( "#slider-range" ).slider( "values", 1 ) );
		
		$( "#slider-day" ).slider({
			range: true,
			min: 4,
			max: 15,
			values: [ 3, 10 ],
			slide: function( event, ui ) {
			$( "#day" ).val(ui.values[ 0 ] + "D - " + ui.values[ 1 ]+"D" );
			}
			});
			$( "#day" ).val( $( "#slider-day" ).slider( "values", 0 ) +"D - " + $( "#slider-day" ).slider( "values", 1 )+"D" );
			
		$( "#slider-day1" ).slider({
			range: true,
			min: 4,
			max: 15,
			values: [ 3, 10 ],
			slide: function( event, ui ) {
			$( "#day1" ).val(ui.values[ 0 ] + "D - " + ui.values[ 1 ]+"D" );
			}
			});
			$( "#day1" ).val( $( "#slider-day1" ).slider( "values", 0 ) +"D - " + $( "#slider-day1" ).slider( "values", 1 )+"D" );	
		
		$( "#budget-slider-range" ).slider({
			range: true,
			min: 30000,
			max: 100000,
			values: [ 50000, 75000 ],
			slide: function( event, ui ) {
			$( "#budget-amount" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
			}
			});
			$( "#budget-amount" ).val( $( "#budget-slider-range" ).slider( "values", 0 ) +" - " + $( "#budget-slider-range" ).slider( "values", 1 ) );
		
		   }
		//autocomplete
		if($().slider){
		//slider range
		$( "#slider-range1" ).slider({
		range: true,
		min: 0,
		max: 100000,
		values: [ 0, 30000 ],
		slide: function( event, ui ) {
		$( "#amount1" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
		}
		});
		$( "#amount1" ).val( $( "#slider-range1" ).slider( "values", 0 ) +" - " + $( "#slider-range1" ).slider( "values", 1 ) );
		
		$( "#slider-day" ).slider({
			range: true,
			min: 4,
			max: 15,
			values: [ 3, 10 ],
			slide: function( event, ui ) {
			$( "#day" ).val(ui.values[ 0 ] + "D - " + ui.values[ 1 ]+"D" );
			}
			});
			$( "#day" ).val( $( "#slider-day" ).slider( "values", 0 ) +"D - " + $( "#slider-day" ).slider( "values", 1 )+"D" );
			
		$( "#slider-day1" ).slider({
			range: true,
			min: 4,
			max: 15,
			values: [ 3, 10 ],
			slide: function( event, ui ) {
			$( "#day1" ).val(ui.values[ 0 ] + "D - " + ui.values[ 1 ]+"D" );
			}
			});
			$( "#day1" ).val( $( "#slider-day1" ).slider( "values", 0 ) +"D - " + $( "#slider-day1" ).slider( "values", 1 )+"D" );	
		
		$( "#budget-slider-range1" ).slider({
			range: true,
			min: 30000,
			max: 100000,
			values: [ 50000, 75000 ],
			slide: function( event, ui ) {
			$( "#budget-amount" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
			}
			});
			$( "#budget-amount" ).val( $( "#budget-slider-range1" ).slider( "values", 0 ) +" - " + $( "#budget-slider-range1" ).slider( "values", 1 ) );
		
		   }	
		var availableTags = ['Mumbai, India (BOM)','New Delhi, India (DEL)','Bangalore, India (BLR)','Daman, India  (nearest airport Mumbai, BOM)','Chennai, India (MAA)'];
		if( $().autocomplete){
		$( "#holiday, #startDestination, #endDestination, #origin, #destination_port, #origin_port, #holidayGoingTo, #destinationHotelSearch" ).autocomplete({
			source: availableTags,
			open: function(event, ui){
				$(this).autocomplete("widget").css({
					"width": 350
				});
				}
		});
		}
		
		
   if( $(".childCount").exists() )		
		{
		$(".childCount").change( function(){
						 if( $(this).val() == 1){
							 $(this).parent().parent().next().show();
							 $(this).parent().parent().next().next().hide();
							 $(this).parent().parent().next().next().next().hide();
							 }
						if( $(this).val() == 2){
							 $(this).parent().parent().next().next().show();
							 $(this).parent().parent().next().next().next().hide();
							 }
						if( $(this).val() == 3){
							 $(this).parent().parent().next().show();
							 $(this).parent().parent().next().next().show();
							 $(this).parent().parent().next().next().next().show();
							 }	 	 
		            });
	
        }
		
		
if ($('#nav-anchor').exists())
	{
		
	 $(window).scroll(function(){
				var window_top = $(window).scrollTop() + 12; // the "12" should equal the margin-top value for nav.stick
				var div_top = $('#nav-anchor').offset().top;
					if (window_top > div_top) {
						$('nav.secNav').addClass('stick').removeClass("row");
					} else {
						$('nav.secNav').removeClass('stick').addClass("row");
					}
			});
			
			$("nav.secNav a").click(function(evn){
				evn.preventDefault();
				$('html,body').scrollTo(this.hash, this.hash); 
			});
			var aChildren = $("nav.secNav li").children(); // find the a children of the list items
			var aArray = []; // create the empty aArray
			for (var i=0; i < aChildren.length; i++) {    
				var aChild = aChildren[i];
				var ahref = $(aChild).attr('href');
				aArray.push(ahref);
			} // this for loop fills the aArray with attribute href values
			
			$(window).scroll(function(){
				var windowPos = $(window).scrollTop(); // get the offset of the window from the top of page
				var windowHeight = $(window).height(); // get the height of the window
				var docHeight = $(document).height();
				
				for (var i=0; i < aArray.length; i++) {
					var theID = aArray[i];
					var divPos = $(theID).offset().top; // get the offset of the div from the top of page
					var divHeight = $(theID).height(); // get the height of the div in question
					if (windowPos >= divPos && windowPos < (divPos + divHeight)) {
						$("a[href='" + theID + "']").addClass("nav-active");
					} else {
						$("a[href='" + theID + "']").removeClass("nav-active");
					}
				}
				
				if(windowPos + windowHeight == docHeight) {
					if (!$("nav.secNav li:last-child a").hasClass("nav-active")) {
						var navActiveCurrent = $(".nav-active").attr("href");
						$("a[href='" + navActiveCurrent + "']").removeClass("nav-active");
						$("nav.secNav li:last-child a").addClass("nav-active");
					}
				}
			});
			
	}		
//end document ready	
}); 
$(".highlightsLink").click( function(){
	     $("#s1, #s2 , #s3").addClass("pT20").removeClass("pT100");
		 $("#sTop").addClass("pT100");
	  });
 
   
   $(".travelPlanLink").click( function(){
	     $("#s1").addClass("pT100").removeClass("pT20");
		  $("#sTop, #s2, #s3").removeClass("pT100");
	  });
	  
	 $(".inclusiveLink").click( function(){
		 $("#s2").addClass("pT100").removeClass("pT20");
		 $("#sTop, #s1, #s3").removeClass("pT100");
	   
	  });
	  
	  $(".rateDatesLink").click( function(){
	    $("#s3").addClass("pT100").removeClass("pT20");
		$("#stop, #s1, #s2").removeClass("pT100");
	  });   
	  
	  
	if($("#s1").exists()){
		  $(window).scroll(function () {
			});
		
		}  
	  
$(".primaryMore").click(function(e) {
    e.stopPropagation();
	$("#moreArrow").toggleClass("sel");
	$("#reportOpt").slideToggle("fast");
	
	if( $("#accountList").is(":visible")){
		 $("#accountList").hide();
		}
	 if($("#cntList").is(":visible")){
			   $("#cntList").hide();
			 }
	
});	

$("body").click(function() {
    $("#cntList").hide();
	$("#accountList").hide();
	$("#reportOpt").hide();
	$("#moreArrow").removeClass("sel");
	
	/*
	if(document.getElementById('moreArrow').className == 'moreArrow moreArrowDwn sel'){
		document.getElementById('moreArrow').className = 'moreArrow moreArrowDwn'	
	}
	*/
	/*else{
		document.getElementById('moreArrow').className = 'moreArrow moreArrowDwn sel'
	}*/
	
});

$(".listMenuLink").click(function(e) {
    e.stopPropagation();
});
$(".listMenuLink_myaccount").click(function(e) {
    e.stopPropagation();
});
	
$(document).ready(function () {
	$('ul.countryMenu li').on('click', function (e) {
		$('ul.countryMenu li').removeClass('current');
		$(this).addClass('current');
		$('ul.countryMenu li').find('i:first').removeClass('tickMark black');
		$(this).find('i:first').addClass('tickMark black')
		var className = $(this).find('i:last').attr('class');
		$('#chngFlag').removeClass().addClass(className)
		
	});
});

//close autocomplete when user resizes window 
   $(window).resize(function() {
   $(".ui-autocomplete").css('display', 'none');
  });

navigator.sayswho= (function(){
    var ua= navigator.userAgent, tem, 
    M= ua.match(/(opera|chrome|safari|firefox|msie|trident(?=\/))\/?\s*(\d+)/i) || [];
    if(/trident/i.test(M[1])){
        tem=  /\brv[ :]+(\d+)/g.exec(ua) || [];
        return 'IE '+(tem[1] || '');
    }
    if(M[1]=== 'Chrome'){
        tem= ua.match(/\bOPR\/(\d+)/)
        if(tem!= null) return 'Opera '+tem[1];
    }
    M= M[2]? [M[1], M[2]]: [navigator.appName, navigator.appVersion, '-?'];
    if((tem= ua.match(/version\/(\d+)/i))!= null) M.splice(1, 1, tem[1]);
    return M.join(' ');
})();


if(navigator.sayswho == 'Firefox 11'){
	$("#grid1, #grid2, #grid3, #grid4").removeClass('grid');
	}
	
	
	
// Stepper control incrementer function
var adult_Count = 1;
var room_Count = 1;
var car_Count = 1;
var child_Count = 0;
var infant_Count = 0;


//Adult count increment
function adultCountInc(id,cntr){
	adult_Count = document.getElementById(id).innerHTML;
	if(adult_Count < 9){
		adult_Count++;
		document.getElementById(id).innerHTML = adult_Count;
	}
}

//Adult count decrement
function adultCountDec(id,cntr){
	adult_Count = document.getElementById(id).innerHTML;
	if(adult_Count > 1){
		adult_Count--;
		document.getElementById(id).innerHTML = adult_Count;
	}
	
}

//Child count increment
function childCountInc(id,cntr){
	child_Count = document.getElementById(id).innerHTML;
	if(child_Count < 9){
		child_Count++;
		document.getElementById(id).innerHTML = child_Count;
	}
}

//Child count decrement
function childCountDec(id,cntr){
	child_Count = document.getElementById(id).innerHTML;
	if(child_Count > 0){
		child_Count--;
		document.getElementById(id).innerHTML = child_Count;
	}
}



//infant count increment
function infantCountInc(id,cntr){
	infant_Count = document.getElementById(id).innerHTML;
	if(infant_Count < 9){
		infant_Count++;
		document.getElementById(id).innerHTML = infant_Count;
	}
}

//Infant count decrement
function infantCountDec(id,cntr){
	infant_Count = document.getElementById(id).innerHTML;
	if(infant_Count > 0){
		infant_Count--;
		document.getElementById(id).innerHTML = infant_Count;
	}
}


//Room count increment
function roomCountInc(id,cntr){
	room_Count = document.getElementById(id).innerHTML;
	if(room_Count < 9){
		room_Count++;
		document.getElementById(id).innerHTML = room_Count;
	}
}

//Room count decrement
function roomCountDec(id,cntr){
	room_Count = document.getElementById(id).innerHTML;
	if(room_Count > 1){
		room_Count--;
		document.getElementById(id).innerHTML = room_Count;
	}
	
}


//Car count increment
function carCountInc(id,cntr){
	car_Count = document.getElementById(id).innerHTML;
	if(car_Count < 9){
		car_Count++;
		document.getElementById(id).innerHTML = car_Count;
	}
}

//Car count decrement
function carCountDec(id,cntr){
	car_Count = document.getElementById(id).innerHTML;
	if(car_Count > 1){
		car_Count--;
		document.getElementById(id).innerHTML = car_Count;
	}
	
}	


/*Show more show less*/
(function($) {
    $.fn.shorten = function(settings) {
        "use strict";
     var config = {
            showChars: 300,
            ellipsesText: "...",
            moreText: "Read more",
            lessText: "Read less",
            errMsg: null,
            force: false
        };

        if (settings) {
            $.extend(config, settings);
        }

        if ($(this).data('jquery.shorten') && !config.force) {
            return false;
        }
        $(this).data('jquery.shorten', true);

        $(document).off("click", '.morelink');

        $(document).on({
            click: function() {

                var $this = $(this);
                if ($this.hasClass('less')) {
                    $this.removeClass('less');
                    $this.html(config.moreText);
                    $this.parent().prev().prev().show(); // shortcontent
                    $this.parent().prev().hide(); // allcontent

                } else {
                    $this.addClass('less');
                    $this.html(config.lessText);
                    $this.parent().prev().prev().hide(); // shortcontent
                    $this.parent().prev().show(); // allcontent
                }
                return false;
            }
        }, '.morelink');

        return this.each(function() {
            var $this = $(this);

            var content = $this.html();
            var contentlen = $this.text().length;
            if (contentlen > config.showChars) {
                var c = content.substr(0, config.showChars);
                if (c.indexOf('<') >= 0) // If there's HTML don't want to cut it
                {
                    var inTag = false; // I'm in a tag?
                    var bag = ''; // Put the characters to be shown here
                    var countChars = 0; // Current bag size
                    var openTags = []; // Stack for opened tags, so I can close them later
                    var tagName = null;

                    for (var i = 0, r = 0; r <= config.showChars; i++) {
                        if (content[i] == '<' && !inTag) {
                            inTag = true;

                            // This could be "tag" or "/tag"
                            tagName = content.substring(i + 1, content.indexOf('>', i));

                            // If its a closing tag
                            if (tagName[0] == '/') {


                                if (tagName != '/' + openTags[0]) {
                                    config.errMsg = 'ERROR en HTML: the top of the stack should be the tag that closes';
                                } else {
                                    openTags.shift(); // Pops the last tag from the open tag stack (the tag is closed in the retult HTML!)
                                }

                            } else {
                                // There are some nasty tags that don't have a close tag like <br/>
                                if (tagName.toLowerCase() != 'br') {
                                    openTags.unshift(tagName); // Add to start the name of the tag that opens
                                }
                            }
                        }
                        if (inTag && content[i] == '>') {
                            inTag = false;
                        }

                        if (inTag) { bag += content.charAt(i); } // Add tag name chars to the result
                        else {
                            r++;
                            if (countChars <= config.showChars) {
                                bag += content.charAt(i); // Fix to ie 7 not allowing you to reference string characters using the []
                                countChars++;
                            } else // Now I have the characters needed
                            {
                                if (openTags.length > 0) // I have unclosed tags
                                {
                                    //console.log('They were open tags');
                                    //console.log(openTags);
                                    for (j = 0; j < openTags.length; j++) {
                                        //console.log('Cierro tag ' + openTags[j]);
                                        bag += '</' + openTags[j] + '>'; // Close all tags that were opened

                                        // You could shift the tag from the stack to check if you end with an empty stack, that means you have closed all open tags
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    c = $('<div/>').html(bag + '<span class="ellip">' + config.ellipsesText + '</span>').html();
                }else{
                    c+=config.ellipsesText;
                }

                var html = '<div class="shortcontent">' + c +
                    '</div><div class="allcontent">' + content +
                    '</div><span><a href="javascript://nop/" class="morelink">' + config.moreText + '</a></span>';

                $this.html(html);
                $this.find(".allcontent").hide(); // Hide all text
                $('.shortcontent p:last', $this).css('margin-bottom', 0); //Remove bottom margin on last paragraph as it's likely shortened
            }
        });

    };

})(jQuery);


//$(".moreDescription").shorten( {showChars: 220});

/*

$('.moreTxtLink').on('click', function (e) {
        var txtContainer = $('.moreTxt');
		txtContainer.toggleClass('sel');
		
		if($(".moreTxt").hasClass('sel')){
			$(".moreTxtLink").text("Read less");
		}
		else{
			$(".moreTxtLink").text("Read more")
			}
		
        var txtContHeight = txtContainer.height();
        var nextParent = txtContainer.parents('li').next();
        var nextParentOffset = nextParent.offset();
        var newTop = txtContainer.hasClass('sel') ? txtContHeight : (txtContHeight * -1);
        var itemContainer = nextParent.parent();
        itemContainer.height(itemContainer.height() + newTop);
        nextParent.offset({top: nextParentOffset.top + newTop});

	});

*/



var showHideInfo = function(ele, eleHeight) {
      var txtContHeight = eleHeight || ele.height();
      var nextParent = ele.parents('li').next();
      var nextParentOffset = nextParent.offset();
      var newTop = ele.is(':visible') ? txtContHeight : (txtContHeight * -1);
      var itemContainer = nextParent.parent();
      itemContainer.height(itemContainer.height() + newTop);
      nextParent.offset({top: nextParentOffset.top + newTop});
    };

	$('.moreTxtLink').on('click', function (e) {
        var txtContainer = $('.moreTxt');
		txtContainer.toggleClass('sel');
			if($(".moreTxt").hasClass('sel')){
				$(".moreTxtLink").text("Read less");
			  }
			 else{
				$(".moreTxtLink").text("Read more")
				}
		showHideInfo(txtContainer);
	});

		  $('.clickable_images').on('click', function(evt) {
			evt.stopPropagation();
			$(this).find(".tileParent").toggleClass('sel');
			var ele = $(this);
			var content = ele.parent().attr('data-content');
			var contentContainer = $('#' + content);
			if (!contentContainer.length) {
			  return false;
			}
			if (contentContainer.is(':visible')) {
			  contentContainer.hide();
			} else {
			  contentContainer.show();
			}
			showHideInfo(contentContainer, contentContainer.outerHeight());
		  });


    $(".viewAllCalendarDates").click( function(){
		  $(this).toggleClass('sel');
		  $(this).next(".calendarContainer").toggle();
		  
		   if ($(this).hasClass('sel')) {
			$(this).find('img').attr('src','images/common/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/common/collapse_blu.png');
		}
		  
		
		});
		
		
function showMoreInfo(id1, id2, id3)
{
	 $("#" + id1).toggleClass("active");
	 $("#" + id2).slideToggle();
	 
	  if ($("#" + id1).hasClass('active')) {
			$("#" + id3).html(" - ");		   
		}else{
			$("#" + id3).html(" + ");
		}
		
	
}
function hideShowAcc(id1, id2)
{
	$("#" + id2).slideToggle();
}

var cloneCount = 1;
$(".addRoom").click( function(){
	cloneCount++;

	$("#roomDetail1, #roomDetail2, #roomDetail3, #roomDetail4, #roomDetail5").clone().insertBefore("#roomAdder").filter('[id]').each(function() { 
                        this.id = this.id + "_"  +cloneCount;
                       $(this).find(".roomCount").text(cloneCount);
					   
					   $(".removeAdded").click( function(){
						     //var tr = $(this).closest("tr");
                             //tr.add(tr.next()).add(tr.next().next()).remove();
						   });
					   
					   $("select").change(function () {
							$(this).addClass("defaultTextColor");
						});
						
						$(".childCount").change( function(){
						 if( $(this).val() == 1){
							 $(this).parent().parent().next().show();
							 $(this).parent().parent().next().next().hide();
							 $(this).parent().parent().next().next().next().hide();
							 }
						if( $(this).val() == 2){
							 $(this).parent().parent().next().next().show();
							 $(this).parent().parent().next().next().next().hide();
							 }
						if( $(this).val() == 3){
							 $(this).parent().parent().next().show();
							 $(this).parent().parent().next().next().show();
							 $(this).parent().parent().next().next().next().show();
							 }	 	 
						})	;
						
 
               });
	
	
	});
	

	
	
	
if($('#notifyDesc').exists()){
			$(document).scroll(function () {
				
			var y = $(this).scrollTop();
			if (y > 560) {
				$('#notifyDesc').fadeIn('fast');
			} else {
				$('#notifyDesc').fadeOut('fast');
			}
		});
   }

var compHolidays = 0;
function checkThis(hId){
	if(document.getElementById("holiday" + hId).checked == true)
	{
		var parent = document.getElementById("search_results");
		document.getElementById("show_holiday_panel_top").style.display = "block";	
		document.getElementById("compareTab").className = "sel";
		$(".footerContactDetail").addClass("activated");
		var a = document.createElement("div");
		a.className = "clearfix col_3 pL0 searchedResult"
		a.id = "searchedResult" + hId
		parent.appendChild(a);
		
		a.innerHTML = '<div class="fL mR10 mT5 mB5"> <img src="images/common/hotel_thumb' + hId + '.png" alt="Hotel Thumb" /> </div><div class="fL"><div class="fcWht">' + document.getElementById("holidayDest" + hId).innerHTML + '</div><div class="fS11 fcWht">7 Days / 6 Nights</div><div class="fS11 fcWht mB5">Port Blair | Havelock | Neil Island</div><div class="clearfix"><div class="fS22 fW400 fL fcWht"><span class="rupee">Rs</span>86,000</div></div></div>';
		if(compHolidays > 0){
			document.getElementById("compareButton").style.display = "block";
		}
		
		compHolidays++;
		document.getElementById("compareCount").innerHTML = compHolidays;	
	}
	else{
		document.getElementById("searchedResult" + hId).remove();
		compHolidays--;
		document.getElementById("compareCount").innerHTML = compHolidays;	
		if(compHolidays == 0){
			document.getElementById("show_holiday_panel_top").style.display = "none";	
			document.getElementById("compareButton").style.display = "none";
			document.getElementById("compareTab").className = "";
		}
		if(compHolidays == 1){
			document.getElementById("compareButton").style.display = "none";
			}
		
	}
}   


//Tabs functionality
   $('.daysTab a').on('click', function(e)  {
        var currentAttrValue = $(this).attr('href');
 		// Show/Hide Tabs
        $('.tabs ' + currentAttrValue).show().siblings().hide();
 
        // Change/remove current tab to active
        $(this).parent('li').addClass('sel').siblings().removeClass('sel');
 
        e.preventDefault();
    });
	
//Tabs functionality
   $('.tabLinks a').on('click', function(e)  {
        var currentAttrValue = $(this).attr('href');
 		// Show/Hide Tabs
        $('.tabsContent ' + currentAttrValue).show().siblings().hide();
 
        // Change/remove current tab to active
        $(this).parent('li').addClass('sel').siblings().removeClass('sel');
 
        e.preventDefault();
    });
	
	
	$('.plantabLinks a').on('click', function(e)  {
        var currentAttrValue = $(this).attr('href');
		
 		// Show/Hide Tabs
        $('.tabLinksContr ' + currentAttrValue).show().siblings().hide();
 
        // Change/remove current tab to active
        $(this).parent('li').addClass('sel').siblings().removeClass('sel');
 
        e.preventDefault();
    });
	
	
/*Show more show less*/
(function($) {
    $.fn.shorten = function(settings) {
        "use strict";
     var config = {
            showChars: 200,
            ellipsesText: "...",
            moreText: "Read more",
            lessText: "Read less",
            errMsg: null,
            force: false
        };

        if (settings) {
            $.extend(config, settings);
        }

        if ($(this).data('jquery.shorten') && !config.force) {
            return false;
        }
        $(this).data('jquery.shorten', true);

        $(document).off("click", '.morelink');

        $(document).on({
            click: function() {

                var $this = $(this);
                if ($this.hasClass('less')) {
                    $this.removeClass('less');
                    $this.html(config.moreText);
                    $this.parent().prev().prev().show(); // shortcontent
                    $this.parent().prev().hide(); // allcontent

                } else {
                    $this.addClass('less');
                    $this.html(config.lessText);
                    $this.parent().prev().prev().hide(); // shortcontent
                    $this.parent().prev().show(); // allcontent
                }
                return false;
            }
        }, '.morelink');

        return this.each(function() {
            var $this = $(this);

            var content = $this.html();
            var contentlen = $this.text().length;
            if (contentlen > config.showChars) {
                var c = content.substr(0, config.showChars);
                if (c.indexOf('<') >= 0) // If there's HTML don't want to cut it
                {
                    var inTag = false; // I'm in a tag?
                    var bag = ''; // Put the characters to be shown here
                    var countChars = 0; // Current bag size
                    var openTags = []; // Stack for opened tags, so I can close them later
                    var tagName = null;

                    for (var i = 0, r = 0; r <= config.showChars; i++) {
                        if (content[i] == '<' && !inTag) {
                            inTag = true;

                            // This could be "tag" or "/tag"
                            tagName = content.substring(i + 1, content.indexOf('>', i));

                            // If its a closing tag
                            if (tagName[0] == '/') {


                                if (tagName != '/' + openTags[0]) {
                                    config.errMsg = 'ERROR en HTML: the top of the stack should be the tag that closes';
                                } else {
                                    openTags.shift(); // Pops the last tag from the open tag stack (the tag is closed in the retult HTML!)
                                }

                            } else {
                                // There are some nasty tags that don't have a close tag like <br/>
                                if (tagName.toLowerCase() != 'br') {
                                    openTags.unshift(tagName); // Add to start the name of the tag that opens
                                }
                            }
                        }
                        if (inTag && content[i] == '>') {
                            inTag = false;
                        }

                        if (inTag) { bag += content.charAt(i); } // Add tag name chars to the result
                        else {
                            r++;
                            if (countChars <= config.showChars) {
                                bag += content.charAt(i); // Fix to ie 7 not allowing you to reference string characters using the []
                                countChars++;
                            } else // Now I have the characters needed
                            {
                                if (openTags.length > 0) // I have unclosed tags
                                {
                                    //console.log('They were open tags');
                                    //console.log(openTags);
                                    for (j = 0; j < openTags.length; j++) {
                                        //console.log('Cierro tag ' + openTags[j]);
                                        bag += '</' + openTags[j] + '>'; // Close all tags that were opened

                                        // You could shift the tag from the stack to check if you end with an empty stack, that means you have closed all open tags
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    c = $('<div/>').html(bag + '<span class="ellip">' + config.ellipsesText + '</span>').html();
                }else{
                    c+=config.ellipsesText;
                }

                var html = '<div class="shortcontent">' + c +
                    '</div><div class="allcontent">' + content +
                    '</div><span><a href="javascript://nop/" class="morelink">' + config.moreText + '</a></span>';

                $this.html(html);
                $this.find(".allcontent").hide(); // Hide all text
                $('.shortcontent p:last', $this).css('margin-bottom', 0); //Remove bottom margin on last paragraph as it's likely shortened
            }
        });

    };

})(jQuery);
 
 $(".holidayDesc, .overviewDescription, .featuresList").shorten();
 
 $('.shopCardHrdr').on('click', function (e) {
		 $(this).next('.shopCardContr').slideToggle();
		$(this).toggleClass('sel');
		 if ($(this).hasClass('sel')) {
			$(this).find('img').attr('src','images/common/expand.png');		   
		}else{
			$(this).find('img').attr('src','images/common/collapse.png');
		}
	});
 
 
function chSrc(tabId, contrId){
	for(i=1; i<=7; i++){
		document.getElementById('chTab'+i).className='';
		document.getElementById('chContr'+i).style.display = 'none';	
		if(i == 7 )
		{
			document.getElementById('chTab'+i).className='last';
		}
	}
	document.getElementById(tabId).className='sel';
	document.getElementById(contrId).style.display = 'block';
}

function step1(curHrdr, nextHrdr, curContr, nextContr){
	$("#"+curHrdr).removeClass('active');
	$("#"+nextHrdr).addClass('active').removeClass('noImg');
	$("#"+curContr).slideUp('slow');
	$("#"+nextContr).slideDown('slow');
	document.getElementById(curHrdr).onclick = fn_step1;
	$('html, body').animate({scrollTop: '0px'},500);
}

function fn_step1(){
	$("#header1").addClass('active');
	$("#header2").removeClass('active');
	$("#step1").slideDown('slow');
	$("#step2").slideUp('slow');
	$("#header1").siblings("div.heading").removeClass("active");
	$("#header1").next(".accordion_stepForm .contContainer").slideDown("slow").siblings(".accordion_stepForm .contContainer:visible").slideUp("slow");
	$('html, body').animate({scrollTop: '0px'},500);
}

function step2(curHrdr, nextHrdr, curContr, nextContr){
	$("#"+curHrdr).removeClass('active noImg');
	$("#"+nextHrdr).addClass('active').removeClass('noImg');
	$("#"+curContr).slideUp('slow');
	$("#"+nextContr).slideDown('slow');
	document.getElementById(curHrdr).onclick = fn_step2;
	$('html, body').animate({scrollTop: '0px'},500);
}

function fn_step2(){
	$("#header2").addClass('active');
	$("#header3").removeClass('active');
	$("#step2").slideDown('slow');
	$("#step3").slideUp('slow');
	$("#header2").siblings("div.heading").removeClass("active");
	$("#header2").next(".accordion_stepForm .contContainer").slideDown("slow").siblings(".accordion_stepForm .contContainer:visible").slideUp("slow");
	$('html, body').animate({scrollTop: '0px'},500);
}


function step3(curHrdr, nextHrdr, curContr, nextContr){
	$("#"+curHrdr).removeClass('active noImg');
	$("#"+nextHrdr).addClass('active').removeClass('noImg');
	$("#"+curContr).slideUp('slow');
	$("#"+nextContr).slideDown('slow');
	document.getElementById(curHrdr).onclick = fn_step3;
	$('html, body').animate({scrollTop: '0px'},500);
}

function fn_step3(){
	$("#header3").addClass('active');
	$("#header4").removeClass('active');
	$("#step3").slideDown('slow');
	$("#step4").slideUp('slow');
	$("#header3").siblings("div.heading").removeClass("active noImg");
	$("#header3").next(".accordion .contContainer").slideDown("slow").siblings(".accordion_stepForm .contContainer:visible").slideUp("slow");
	$('html, body').animate({scrollTop: '0px'},500);	
}


function resetFields(){
	$("#holidayGoingTo").val('');
}

  $('.diyContr header span.heading').on('click', function (e) {
		 $(this).parent().parent().next().slideToggle();
		 $(this).parent().toggleClass('active');
		$(this).toggleClass('sel');
		 if ($(this).hasClass('sel')) {
			$(this).find('img').attr('src','images/common/expand.png');		   
		}else{
			$(this).find('img').attr('src','images/common/collapse.png');
		}
	});
	
	
	$('.diyContr_plan header span.heading').on('click', function (e) {
		 $(this).parent().next().next().slideToggle();
		 $(this).toggleClass('sel');
		 if ($(this).hasClass('sel')) {
			$(this).find('img').attr('src','images/common/expand.png');		   
		}else{
			$(this).find('img').attr('src','images/common/collapse.png');
		}
	});
	
function editCurrentField(markupId){
	val = document.getElementById("markupVal" + markupId).innerHTML;
	document.getElementById("markup" + markupId).innerHTML = '<input id="markupEdit' + markupId + '" type="text" value="" class="small"><span class="tick_icon mL2" onclick="editFieldValue(' + markupId + ');"></span>';
	
	document.getElementById("markupEdit" + markupId).value = val;
}

function editFieldValue(id){
	document.getElementById("markup" + id).innerHTML = '<h4 class="fL"><span id="markupVal' + id + '">' + document.getElementById("markupEdit" + id).value + '</span></h4><span class="edit_icon fL mR15 mL15" onClick="editCurrentField(' + id + ');"></span>';
}

function scrollToTop(){
	$('html, body').animate({
			 scrollTop: '0px'
	 },500);	
}



function startSlideshow(){
	if(jQuery().slick ){
	$('.hotelSlideshow').slick({
				dots: false,
				arrows: true,
			    //autoplaySpeed: 10000,
				cssEase: 'linear'
			});
	}
	}
	
 // functions that scrolls to #link
function goToElement(id){
     $('html,body').animate({
        scrollTop: $("#"+id).offset().top - 100},
        'slow');
}	
	
	
//Delete a column from compare table
   $("table").on("click", ".closeBtn_popup_small", function ( event ) {
		var mainTable = $(this).parent().index() + 1;
		$("td", event.delegateTarget).remove(":nth-child(" + mainTable + ")");
		$("table.miniTable td").remove(":nth-child(" + mainTable + ")");
   });
   
   
//compare page popup docking
   if($('.miniTable').exists()){
	   $(document).scroll(function () {
		var y = $(this).scrollTop();
		if (y > 400) {
			$('.miniTable').fadeIn('fast');
		} else {
			$('.miniTable').fadeOut('fast');
		}
		$(".miniTable").width($(".container").width() + 20 + 'px');
	});
	 
   //Dynamic table width assignment
	 var container = $(".container").width();
	$(".miniTable").width(container + 20 + 'px');
		   
		   $(window).resize(function(){
			    $(".miniTable").width($(".container").width() + 20 + 'px');
			   });
   }
   
   
    if($('#dockTable').exists()){
	   $(document).scroll(function () {
		var y = $(this).scrollTop();
		if (y > 400) {
			$('#dockTable').fadeIn('fast');
		} else {
			$('#dockTable').fadeOut('fast');
		}
		$("#dockTable").width($(".container").width());
	});
	 
   //Dynamic table width assignment
	 var container = $(".container").width();
	$(".miniTable").width(container);
		   
		   $(window).resize(function(){
			    $(".miniTable").width($(".container").width());
			   });
   }
   
   
   
   
   
$("table").on("click", ".closeBtn_popup_small", function ( event ) {
		var mainTable = $(this).parent().index() + 1;
		$("td", event.delegateTarget).remove(":nth-child(" + mainTable + ")");
		$("table.miniTable td").remove(":nth-child(" + mainTable + ")");
   });
   
  function closeComparePanel(){
	  $('#show_holiday_panel_top').hide();
	  $("#compareTab").removeClass("sel");
	  $(".footerContactDetail").removeClass("activated");
	  } 
   
function addChild(s){
	document.getElementById("child" + s + "_" + child_Count).innerHTML = '<label>Child ' + child_Count + '</label><select class="w75"><option value="Age">Age</option><option value="1">1</option><option value="2">2</option><option value="3">3</option></select>';
	document.getElementById("child" + s + "_" + child_Count).className = "fL mB10 pR10 pL0";
	$("select").change(function () {
		$(this).addClass("defaultTextColor");
	});
}

function remChild(s){
	document.getElementById("child" + s + "_" + (child_Count+1)).innerHTML = '';
	document.getElementById("child" + s + "_" + (child_Count+1)).className = "col_6 pR0";
}

var roomsAdded = 1;
function showRooms(){
	
	var span = document.createElement("span");
	span.className = "clearfix dB mB10 col_5 pL0 cB pR0";
	span.id = "room" + (roomsAdded+1)
	span.innerHTML = '<span class="fL mR10 mT30"><label>Room ' + (roomsAdded+1) + '</label></span><span class="fL mR10"><label>Adults 12+ yrs</label><span class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="adultCountDec(\'AdultNumber' + (roomsAdded+1) + '\')">-</span> <span class="control innerTxtControl" id="AdultNumber' + (roomsAdded+1) + '">1</span> <span class="control addMinControl plusControl cursor fW600" onclick="adultCountInc(\'AdultNumber' + (roomsAdded+1) + '\')">+</span></span></span><span class="fL"><label>Child (2 - 12 yrs)</label><span class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="childCountDec(\'ChildNumber' + (roomsAdded+1) + '\'),remChild(' + (roomsAdded+1) + ')">-</span> <span class="control innerTxtControl" id="ChildNumber' + (roomsAdded+1) + '">0</span> <span class="control addMinControl plusControl cursor fW600" onclick="childCountInc(\'ChildNumber' + (roomsAdded+1) + '\'),addChild(' + (roomsAdded+1) + ')">+</span> </span></span></span>';
	
	var span1 = document.createElement("span");
	span1.className = "fL col_6";
	span1.id = "childAge" + (roomsAdded+1);
	span1.innerHTML = '<ul><li class="fL mB10 pR0" id="child' + (roomsAdded+1) + '_1"></li><li class="fL mB10 pR0" id="child' + (roomsAdded+1) + '_2"></li><li class="fL mB10 pR0" id="child' + (roomsAdded+1) + '_3"></li><li class="fL mB10 pR0" id="child' + (roomsAdded+1) + '_4"></li><li class="fL mB10 pR0" id="child' + (roomsAdded+1) + '_5"></li><li class="fL mB10 pR0" id="child' + (roomsAdded+1) + '_6"></li><li class="fL mB10 pR0" id="child' + (roomsAdded+1) + '_7"></li><li class="fL mB10 pR0" id="child' + (roomsAdded+1) + '_8"></li><li class="fL mB10 pR0" id="child' + (roomsAdded+1) + '_9"></li></ul>';
	
	var span2 = document.createElement("span");
	span2.className = "fL col_1 mT20";
	span2.id = "removeRoom" + (roomsAdded+1);
	span2.innerHTML = '<span class="fL col_1"><span class="fL close_icon" onclick="removeRoom(' + (roomsAdded+1) + ')"></span></span>';
	
	var parent = document.getElementById("addMoreRooms1");
	parent.appendChild(span);
	parent.appendChild(span2);
	parent.appendChild(span1);
	
	roomsAdded++;
}

function removeRoom(roomNo){
	document.getElementById("room" + roomNo).remove();
	document.getElementById("childAge" + roomNo).remove();
	document.getElementById("removeRoom" + roomNo).remove();
}

function searchFlight(obj){
	switch(obj)
	{
		case "oneway":
			document.getElementById('returnFlightContainer').style.visibility = 'hidden';
			document.getElementById('multiwayAdd').style.display = 'none';
			document.getElementById("multiwaySearchDefault").style.display = "none";	
			document.getElementById("comboOfferTriggers").style.display = "block";	
			document.getElementById("flightSearchPanel").style.display = "none";	
			//document.getElementById("comboOfferTriggers").style.display = "block";
			$("#multiwaySearchParameters3, #multiwaySearchParameters4, #multiwaySearchParameters5").hide();
			$("#addCar").prop("checked",false)
			mc = 3
		break;
		case "return":
			document.getElementById('returnFlightContainer').style.visibility = 'visible';
			document.getElementById('multiwayAdd').style.display = 'none';
			document.getElementById("multiwaySearchDefault").style.display = "none";	
			document.getElementById("comboOfferTriggers").style.display = "block";	
			document.getElementById("flightSearchPanel").style.display = "none";	
			//document.getElementById("multiwaySearchPanel_2").style.display = "none";	
			//document.getElementById("comboOfferTriggers").style.display = "block";
			//document.getElementById("carType").style.display = "block";
			//document.getElementById("noOfCars").style.display = "block";
			//document.getElementById("pickUpDateHolder").style.display = "block";
			//document.getElementById("dropOffDateHolder").style.display = "block";
			$("#multiwaySearchParameters3, #multiwaySearchParameters4, #multiwaySearchParameters5").hide();
			$("#addCar").prop("checked",false)
			mc = 3
		break;
		case "multicity":
			document.getElementById('returnFlightContainer').style.visibility = 'hidden';
			document.getElementById('multiwayAdd').style.display = 'block';
			document.getElementById("multiwaySearchDefault").style.display = "block";	
			document.getElementById("comboOfferTriggers").style.display = "none";
			//document.getElementById("multiwaySearchPanel_2").style.display = "block";	
			document.getElementById("flightSearchPanel").style.display = "none";	
			//document.getElementById("carSearchPanel").style.display = "none";	
			document.getElementById("comboOfferTriggers").style.display = "block";
   			document.getElementById("addCar").checked = false;
			document.getElementById("addFlight1").checked = false;
		break;
		default :	
			document.getElementById('returnFlightContainer').style.display = 'block';
	}
}

//Add multiway flights
var mc = 3;
function showMultiwayOptions(){
	if(mc < 6){
		$('#multiwaySearchParameters' + mc).show();
		mc++;
	}
}

function hideMultiwayOptions(i){
	$("#multiwaySearchParameters" + i).slideUp();	
	if(i != 5)
		mc = i++;
}


function addCarFlight()
{
     if($("#addCar").is(":checked")){
		 $("#flightSearchPanel").show();
		 }
	else{
		$("#flightSearchPanel").hide();
		}	 	
}

function addHotelFlight()
{
     if($("#addHotel").is(":checked")){
		 $("#addHotelSearchPanel").show();
		 }
	else{
		$("#addHotelSearchPanel").hide();
		}	 	
}


function showtooltip(parentId, tooltipId)
{
   $("#" + tooltipId).toggle();
   
    var parentElementHeight = $("#" + parentId).height();
    var parentElementWidth = $("#" + parentId).width();
	
	  if(parentId == "cCodeFlight"){
		  var left =  ($("#" + parentId).offset().left) - parentElementWidth + 5 + 'px';
			var top =  ($("#" + parentId).offset().top) + parentElementHeight + 15 + 'px'; 
	   }
	  
	   else {
		 var left =  ($("#" + parentId).offset().left) - parentElementWidth + 104 + 'px';
		  var top =  ($("#" + parentId).offset().top) + parentElementHeight + 25 + 'px'; 
	   }
   
		$("#" + tooltipId).css(
		  {
			   'left': left,
			   'top': top
		  }
       );
  
  
	   
	 $(document).mouseup(function (e)
	 {
		var container = $("#" + tooltipId);
		if (!container.is(e.target) // if the target of the click isn't the container...
			&& container.has(e.target).length === 0) // ... nor a descendant of the container
		{
			container.hide();
			
		}
		
	 });   
	   
	  $(window).resize(function(e) {
        $("#" + tooltipId).hide();
    }); 
	   
   
}


function populateNames(nameId){
	var title = $("#title" + nameId).html()
	var fname = $("#fName" + nameId).html()
	var lname = $("#lName" + nameId).html()

	$("#title").val(title).addClass("defaultTextColor")
	$("#firstName").val(fname)
	$("#lastName").val(lname)
	$("#travellerList1").hide();
}



function showServices(serviceNo){
	$(".addServicesContr").removeClass("dN") 
	$("#servicesContainer1,#servicesContainer2,#servicesContainer3").hide();
	$("#services1,#services2,#services3").removeClass("sel")
	$("#servicesContainer" + serviceNo).show();
	$("#services" + serviceNo).addClass("sel") 
}

$("#special_request1").click(function(){
if($("#special_request1").is(":checked"))
	$("#spReqCont2").show()	
else
	$("#spReqCont2").hide()	
});

$("#special_request").click(function(){
if($("#special_request").is(":checked"))
	$("#spReqCont1").show()	
else
	$("#spReqCont1").hide()	
});


function removeItemFlight(id1, id2)
{
	$("#"+ id1).remove();
	$("#" + id2).remove();
	popupclose('removeFlight', 'lightBox');
	
}


function applyCoupon(id1,id2,id3,id4)
{
	if( $("#" + id1).val() == "" ){
		$("#" + id2).hide();
		$("#" + id3).show();
		}
	else{
		$("#" + id2).show();
		$("#" + id3).hide();
		
		var number = $("#" + id4).text();
		number = number.replace(/,/g, "");
		
		$({number: 1000}).animate({number: 10764}, {
			duration: 1200,
			easing: 'linear',
			step: function() { 
				var updatedNum = $('#' + id4).text(parseFloat(Math.ceil(this.number*100)/100).toFixed(0));
				var formattedNumber = $('#' + id4).text().replace(/(\d)(?=(\d{3})+(?!\d))/g, "$1,");
				$('#' + id4).text(formattedNumber);
			}
		});
		
		
		}	
	
}
function checkUncheck(id1, id2)
{
	$("#" + id2).toggle();
	
}


$(".datesListing li a").click( function(){
	$(this).parent().addClass("sel").siblings().removeClass("sel");
});




$.scrollTo = $.fn.scrollTo = function(x, y, options){
    if (!(this instanceof $)) return $.fn.scrollTo.apply($('html, body'), arguments);

    options = $.extend({}, {
        gap: {
            x: 0,
            y: 0
        },
        animation: {
            easing: 'swing',
            duration: 600,
            complete: $.noop,
            step: $.noop
        }
    }, options);

    return this.each(function(){
        var elem = $(this);
        elem.stop().animate({
            scrollLeft: !isNaN(Number(x)) ? x : $(y).offset().left + options.gap.x,
            scrollTop: !isNaN(Number(y)) ? y : $(y).offset().top + options.gap.y
        }, options.animation);
    });
};	


$(".coupon_dtl").click( function(){
	 var currentCode= $(this).text();
	 $("#cCodeFlight").val(currentCode);
	})

//Main menu toggle

$("#myAccount").click(function(e){
	$("#userMenu").slideToggle();
	if($('#cntList').is(":visible")){
		     	$('#cntList').hide();
			}
	e.stopPropagation();
})

$(document).click(function(){
    $('#userMenu').hide();
});

	
//Logged in menu	
$("#loggedInUser").click(function(e){
		$("#loggedInMenu").slideToggle();
		if($('#cntList').is(":visible")){
		     	$('#cntList').hide();
			}
		e.stopPropagation();
})	

$(document).click(function(){
    $('#loggedInMenu').hide();
});


//Country trigger toggle
$("#countryTrigger").click(function(e){
		$("#cntList").slideToggle();
		if($('#userMenu').is(":visible")){
		     	$('#userMenu').hide();
			}
		if($('#loggedInMenu').is(":visible")){
		     	$('#loggedInMenu').hide();
			}	
		e.stopPropagation();
})	

$(document).click(function(){
    $('#cntList').hide();
});

	   
