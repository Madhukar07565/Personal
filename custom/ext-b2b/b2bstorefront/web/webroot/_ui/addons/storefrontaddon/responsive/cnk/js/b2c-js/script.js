//To check if the element exists and then run the relevent code
jQuery.fn.exists = function(){return this.length>0;}
if(!Array.prototype.indexOf) {
    Array.prototype.indexOf = function(needle) {
        for(var i = 0; i < this.length; i++) {
            if(this[i] === needle) {
                return i;
            }
        }
        return -1;
    };
}
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
$(document).ready(function(e) {
    
	//Main document ready function begins here
	
	if( $("#primary_navigation").exists()){
		var offset_pnav = $('#primary_navigation').offset();
		var height_pnav = $('#primary_navigation').height();
		var top_pnav = offset_pnav.top + height_pnav + "px";
		  $("#globalSrc").css( 
		   {
				'position': 'absolute',
				'top': top_pnav
			});
	}
	
	
	if($("#slider").exists()){
		var sudoSlider = $("#slider").sudoSlider({
            // Autoheight is on per default.
        });	
	}
	if($("#slider2").exists()){
		var sudoSlider = $("#slider2").sudoSlider({
            // Autoheight is on per default.
        });	
	}
	function resetSlider() {
  var $slider = $("#slider2");
  $slider.slider("values", 0, initialMinimumValue);
  $slider.slider("values", 1, initialMaximumValue);
}
	if($("#mycarousel2").exists()){
		jQuery('#mycarousel2').jcarousel({
            scroll: 1
        });
	}
	if($("#mycarousel3").exists()){
		jQuery('#mycarousel3').jcarousel({
            scroll: 1
        });
	}
	if($("#downAro").exists()){
		$('#downAro').on('click', function (e) {
		$('#btmTop').animate({'bottom': '-95px'}, 1000);
	});	
	}
	
	if($("#mycarousel1").exists()){
		jQuery('#mycarousel1').jcarousel({
			scroll: 1
		});
	}

	if($("#mycarousel").exists()){
		jQuery('#mycarousel').jcarousel({
		
		start: 1,
		scroll:1,
		wrap: false,
		initCallback: mycarousel_initCallback
		
});
	}
	
	
	//slider function
	
	if(jQuery().slick ){
	$('#bannerSlider, #hotelSlideshow').slick({
				//autoplay: true,
				dots: false,
				arrows: true,
			    //autoplaySpeed: 10000,
				cssEase: 'linear'
			});
	}
	
	
	if(jQuery().slick ){
		if($(".holidayCarousel").exists()){
			$(".holidayCarousel").slick({
						dots: false,
						arrows: true,
						cssEase: 'linear'
					});
			}	
		}
   
	   // auto typing text widget
	   if(jQuery().typed ){
		$("#autoTypeText").typed({
			strings: ['#family','#shopper','#honeymoon','#budget traveller','#first time abroad','#photographer'],
			typeSpeed: 0,
			backSpeed: 0,
			loop: true,
			showCursor: false,
			backDelay: 2000
		  });
	   }
	  
	//Add to cart function
	$(".addToCart").click(function(){
		   
		   $("#shopping_cart_panel").show();
		   $("#shoppingCartTab").addClass('sel');
		   $(".footerContactDetail").addClass("activated");
		  // $("#shopping_cart_panel").delay(3000).fadeOut(800); 
		 setTimeout(function() {
			    $("#shopping_cart_panel").hide(); 
	            $("#shoppingCartTab").removeClass('sel');
				$(".footerContactDetail").removeClass("activated");
           }, 3000);
		   
		   num = parseInt($("#cartCount").text());
			$("#cartCount").text(num+1);
		});
		
		$("#shoppingCartTab").click( function(){
			 $("#shopping_cart_panel").toggle();
			  $("#shoppingCartTab").toggleClass("sel");
			  $(".footerContactDetail").toggleClass("activated");
			})

		$("#selectedTab").click( function(){
			 $("#shopping_cart_panel").toggle();
			  $("#selectedTab").toggleClass("sel");
			  $(".footerContactDetail").toggleClass("activated");
			})
			
		$("#compareTab").click( function(){
			if( $("#show_holiday_panel_top").exists()){
				$("#show_holiday_panel_top").toggle();
				}
			if( $("#show_hotel_panel_top").exists()){
				$("#show_hotel_panel_top").toggle();
				}
			
			if( $("#show_cruise_panel_top").exists()){
				$("#show_cruise_panel_top").toggle();
				}		
			 
			  $("#compareTab").toggleClass("sel");
			  $(".footerContactDetail").toggleClass("activated");
			})	
	
	
	
	// Function to stick the secondry nav to the top as user scrolls  for homepage
	   if($("#primary_navigation").exists()){
	    var stickyRibbonTop = $('#primary_navigation').offset().top;
		$('#primary_navigation_container').show();
		$(window).scroll(function(){
			if( $(window).scrollTop() > stickyRibbonTop ) {
				$('#primary_navigation').addClass('primaryNavfixTop').removeClass('primaryNavigation_fixed');
				
				if( $(".globalSrcExpContr").is(":visible") ){
			     	$('#primary_navigation_container').show();
				}
				else{
					$('#primary_navigation_container').hide();
				}
				
				
				$('#travelDeals').removeClass('showDeals');
				$('.hideContr').hide();
			} else {
				$('#primary_navigation').removeClass('primaryNavfixTop').addClass('primaryNavigation_fixed');
				$('#primary_navigation_container').show();
				$('#travelDeals').addClass('showDeals');
				$('.hideContr').show();
			}
		});
	   }
	   
	  // Function to stick the secondry nav to the top as user scrolls  for all other pages 
	    if($("#primary_navigation_inner").exists()){
	    var stickyRibbonTop = $('#primary_navigation_inner').offset().top;
		//$('#primary_navigation_container').show();
		$(window).scroll(function(){
			if( $(window).scrollTop() > stickyRibbonTop ) {
				$('#primary_navigation_inner').addClass('primaryNavfixTop').removeClass('primaryNavigation_fixed_inner');
			} else {
				$('#primary_navigation_inner').removeClass('primaryNavfixTop').addClass('primaryNavigation_fixed_inner');
				}
		});
	   }
	   
	  	$('#noteContent1').keyup(function() {
		   if($('#charCount1').text() < 100)
				$('#charCount1').text( this.value.replace(/{.*}/g, '').length);
		});
	
		//auto complete functions
		var cities = ['Mumbai, India (BOM)','New Delhi, India (DEL)','Bangalore, India (BLR)','Daman, India  (nearest airport Mumbai, BOM)','Chennai, India (MAA)'];
		if( $().autocomplete){
			$( "#autosuggest1,#autosuggest2, #autosuggest3, #autosuggest4, #autosuggest5, #autosuggest6, #autosuggest7, #autosuggest8, #autosuggest9 , #autosuggest10, #autosuggest11, #autosuggest12, #autosuggest13, #autosuggest14, #autosuggest15, #autosuggest16, #destinationHotelSearch, #destinationHotelSearch1, #owflightFrom,#owflightTo, #owflightFrom1, #owflightTo1, #twflightFrom, #twflightTo, #holidayDest, #destination_port,#hotelName,#hotelName_port, #hotelLoc, #hotelLoc_port, #holidayDest11,#holidayGoingTo, #autosuggest_eurail1, #autosuggest_eurail2, #autosuggest_eurail3, #autosuggest_eurail4, #autosuggest_eurail5, #autosuggest_eurail6, #autosuggest_eurail7, #autosuggest_eurail8, #autosuggest_eurail9, #autosuggest_eurail10, #autosuggest_eurail11, #autosuggest_eurail12, #autosuggest_eurail13, #autosuggest_eurail14, #autosuggest_eurail15, #autosuggest_eurail16, #autosuggest_eurail17, #autosuggest_eurail18, #autosuggest_eurail19, #autosuggest_eurail20, #autosuggest_eurail21" ).autocomplete(
			{
				source: cities,
			    open: function(event, ui) {
                $(this).autocomplete("widget").css({
					"width": 350
				});
            }
	     });
		}
	
	/* Autocomplete function for overlays */	
	if( $().autocomplete){
		$("#holidayGoingTo,#hotelName,#hotelLoc").focus( function(){
			$("#holidayGoingTo,#hotelName,#hotelLoc").autocomplete(
			{
				source: cities,
			    open: function(event, ui) {
					$(this).autocomplete("widget").css({
						"width": 350,
						"z-index":10001
					});
	            }
		     });
		});
	}
	/* End of Autocomplete function for overlays */	
		
		//close autocomplete when user resizes window	
		 $(window).resize(function() {
			$(".ui-autocomplete").css('display', 'none');
		});	
		
		var wishListItems = ['Mumbai, India (BOM)','New Delhi, India (DEL)','Bangalore, India (BLR)','Daman, India ','Chennai, India', 'Australia', 'South africa', 'Singapore'];
		if( $().autocomplete){
			$( "#searchWishlist" ).autocomplete(
			{
				source: wishListItems,
			    open: function(event, ui) {
                $(this).autocomplete("widget").css({
					"width": 350
				});
            }
	     });
		}
		
		$('#travel .ritPnl .heading').on('click', function (e) {
			$(this).parent().find('.header').closest(".contContainer").slideToggle();
			$(this).toggleClass('sel');
			 if ($(this).hasClass('sel')) {
				$(this).find("img").attr('src','images/common/expand.png');		   
			}else{
				$(this).find("img").attr('src','images/common/collapse.png');
			}
		});
		
		
	  // jCarousel Plugin functions
	  if($().jcarousel){
	 $('.first-and-second-carousel').jcarousel();
     $('#third-carousel').jcarousel({
        start: 1,
		scroll:1,
        initCallback: mycarousel_initCallback
    });
     $('#bestflight-carousel').jcarousel({
        start: 1,
		scroll:1,
        initCallback: mycarousel_initCallback
    });
     $('#testmulty').jcarousel({
        start: 1,
		scroll:1,
        initCallback: mycarousel_initCallback
    });
	
	  $('#second-carousel').jcarousel({
        start: 1,
		scroll:1,
        initCallback: mycarousel_initCallback
     });
	  }
	
	//Remove item from cart
	/*$(".removeCartItem_cross").click( function(){
      $(this).closest('.cartItem, shoppingCart_add_mid').remove();
	})
	*/
	
	 //Function to scroll to top on click of greeen arrow
	  $('#toTop, #compare_price').click(function () {
		$('html, body').animate({
			 scrollTop: '0px'
		 },500);
		 return false;
	 });
	 
	 
	
	//Multiple select combo - checkbox + Dropdown
	if($().multipleSelect){
	   
	   $("#multipleAirlines").multipleSelect({
	   placeholder: "Select",
	   selectAllText : "All",
	   selectAllDelimiter: ["",""]
            
        });
	
	}
	
	if($().multipleSelect){
	   
	   $("#multipleBusType").multipleSelect({
	   placeholder: "Select Bus Type",
	   selectAllText : "All",
	   selectAllDelimiter: ["",""]
            
        });
	
	}
$('.ppContr').hide();
	$('.ppContr').eq(0).show();
	$('.ppHrdr').on('click', function (e) {
		 $(this).next('.ppContr').slideToggle();
		 $(this).toggleClass("active");
		 if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/common/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/common/collapse_blu.png');
		}
	});	

	$('.secTab li').on('click', function (e) {
		$(".customScroll").customScrollbar();
	});
	
	$('.ppHrdr').on('click', function (e) {
		$(".customScroll").customScrollbar();
	});	

//Datepicker trigger function
    if($().datepicker){
     // For Dual Calendar
	  $("#datepicker21, #datepicker33, #departureDate, #departureDate1, #departureDate2, #departureDate3, #edepartureDate3, #departureDate4, #edepartureDate4, #departureDate5, #edepartureDate5, #departureDate6, #departureDate7, #departureDate8, #departureDate9, #departureDate10, #departureDate11, #departureDate12, #departureDate13, #departureDate14, #departureDate15,#departureDate16, #departureDate17, #departureDate18, #departureDate19, #departureDate20, #departureDate21, #departureDate22, #departureDate23, #departureDate24, #departureDate125, #departureDate26, #departureDate27, #departureDate28, #departureDate29, #departureDate30, #departureDate31, #returnDate,#returnDate1, #checkinDate, #echeckinDate, #checkoutDate, #echeckoutDate, #checkinDate1, #checkoutDate1, #checkinDate2, #checkoutDate2, #checkinDate3, #checkoutDate3, #checkinDate4, #checkoutDate4, #pickUpDate, #dropOffDate, #twDepartureDate, #twReturnDate, #startDate, #endDate, #departureDate_eurail1, #departureDate_eurail2, #departureDate_eurail3, #departureDate_eurail4, #departureDate_eurail5, #edepartureDate_eurail5, #departureDate_eurail6, #departureDate_eurail7, #departureDate_eurail8" ).datepicker({
		numberOfMonths:2,
		 minDate: 0,
		dateFormat: "d M, y",
		onSelect: function(dateText){
			  $(this).css("color","#333333");		
			  }
	   });
		$("#checkIn, #checkOut, #checkOut1,  #checkIn1, #checkInHotel, #checkOutHotel, #checkIn768_1, checkIn768_2" ).datepicker({
		numberOfMonths:2,
		 minDate: 0,
		dateFormat: "d M, y",
		onSelect: function(dateText){
			  $(this).css("color","#333333");		
			  }
	   });
	   
	   $("#startingDate" ).datepicker({
		 minDate: 0,
		dateFormat: "d M, y",
		onSelect: function(dateText){
			  $(this).css("color","#333333");		
			  }
	   });
	   
		
   }
   
   if($("#fixDates")){
	   $("#fixDates").on('click', function()  {
		   $("#depDate").removeClass("dN")  
		   $("#leaveIn,#upcomingHolidays").addClass("dN")
	   })
   }

   if($("#flexiDates")){
	   $("#flexiDates").on('click', function()  {
		   $("#leaveIn").removeClass("dN")    
		   $("#depDate,#upcomingHolidays").addClass("dN")
	   })
   }

   if($("#holidays")){
	   $("#holidays").on('click', function()  {
		   $("#upcomingHolidays").removeClass("dN")   
		   $("#leaveIn,#depDate").addClass("dN")
	   })
   }

   if($("#weekends")){
	   $("#weekends").on('click', function()  {
		   $("#leaveIn").removeClass("dN")    
		   $("#depDate,#upcomingHolidays").addClass("dN")
	   })
   }
   
   if($(".dd_arrow")){
	   $(".wishlist_ListDD").on('click', function()  {
		   $(".wishlistDDContr").slideToggle("slow");
	   })
   }
   
   
   
   //Tabs functionality
   $('.tabs .tabLinks a').on('click', function(e)  {
        var currentAttrValue = $(this).attr('href');
 		// Show/Hide Tabs
        $('.tabs ' + currentAttrValue).show().siblings().hide();
 
        // Change/remove current tab to active
        $(this).parent('li').addClass('sel').siblings().removeClass('sel');
 
        e.preventDefault();
    });
	
	$('.tabs .tabLinks_01 a').on('click', function(e)  {
        var currentAttrValue1 = $(this).attr('href');
        $('.tabs ' + currentAttrValue1).show().siblings().hide();
        $(this).parent('li').addClass('sel').siblings().removeClass('sel');
        e.preventDefault();
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
		$(".miniTable").width($(".white_content_inner").width());
	});
	 
   //Dynamic table width assignment
	 var container = $(".white_content_inner").width();
	$(".miniTable").width(container);
		   
		   $(window).resize(function(){
			    $(".miniTable").width($(".white_content_inner").width());
			   });
   }
   
  
	
	 
   
   //Delete a column from compare table
   $("table").on("click", ".closeBtn_popup_small", function ( event ) {
			var mainTable = $(this).parent().index() + 1;
		 var count = $(".closeBtn_popup_small").parent().length;
        if(count>2)
        {
			if(count==3)
			{
				$(".closeBtn_popup_small").hide();
			}
			
		$("td", event.delegateTarget).remove(":nth-child(" + mainTable + ")");
		$("table.miniTable td").remove(":nth-child(" + mainTable + ")");
		 }
   });
   
   
	   
  // Slider Function
   if($().slider){
	$( "#slider-departure" ).slider({
		range: true,
		min: 0,
		max: 24,
		values: [ 6, 13 ],
		slide: function( event, ui ) {
		$( "#departure" ).val(ui.values[ 0 ] + ":00 - " + ui.values[ 1 ]+":00 " );
		}
		});
	$( "#departure" ).val( $( "#slider-departure" ).slider( "values", 0 ) +":00 -" + $( "#slider-departure" ).slider( "values", 1 )+":00" );
	
	
	$( "#slider-departure_1" ).slider({
		range: true,
		min: 0,
		max: 24,
		values: [ 6, 13 ],
		slide: function( event, ui ) {
		$( "#departure_1" ).val(ui.values[ 0 ] + ":00 - " + ui.values[ 1 ]+":00 " );
		}
		});
	$( "#departure_1" ).val( $( "#slider-departure_1" ).slider( "values", 0 ) +":00 -" + $( "#slider-departure_1" ).slider( "values", 1 )+":00" );
	
	
	$( "#slider-departure_4" ).slider({
		range: true,
		min: 0,
		max: 24,
		values: [ 6, 13 ],
		slide: function( event, ui ) {
		$( "#departure_1" ).val(ui.values[ 0 ] + ":00 - " + ui.values[ 1 ]+":00 " );
		}
		});
	$( "#departure_4" ).val( $( "#slider-departure_4" ).slider( "values", 0 ) +":00 -" + $( "#slider-departure_4" ).slider( "values", 1 )+":00" );
	$( "#slider-departure_6" ).slider({
		range: true,
		min: 0,
		max: 24,
		values: [ 6, 13 ],
		slide: function( event, ui ) {
		$( "#departure_6" ).val(ui.values[ 0 ] + ":00 - " + ui.values[ 1 ]+":00 " );
		}
		});
	$( "#departure_6" ).val( $( "#slider-departure_6" ).slider( "values", 0 ) +":00 -" + $( "#slider-departure_6" ).slider( "values", 1 )+":00" );
	$( "#slider-departure1" ).slider({
		range: true,
		min: 0,
		max: 24,
		values: [ 6, 13 ],
		slide: function( event, ui ) {
		$( "#departure1" ).val(ui.values[ 0 ] + ":00 - " + ui.values[ 1 ]+":00" );
		}
		});
	$( "#departure1" ).val( $( "#slider-departure1" ).slider( "values", 0 ) +":00 -" + $( "#slider-departure1" ).slider( "values", 1 )+":00" );
	
	
	$( "#slider-return" ).slider({
		range: true,
		min: 0,
		max: 24,
		values: [ 6, 13 ],
		slide: function( event, ui ) {
		$( "#return" ).val(ui.values[ 0 ] + ":00 - " + ui.values[ 1 ]+":00 " );
		}
		});
		
	$("#return").val( $( "#slider-return" ).slider( "values", 0 ) +":00 -" + $( "#slider-return" ).slider( "values", 1 )+":00" );
	
	
	$( "#slider-flightreturn1" ).slider({
		range: true,
		min: 0,
		max: 24,
		values: [ 6, 13 ],
		slide: function( event, ui ) {
		$( "#flightreturn1" ).val(ui.values[ 0 ] + ":00 - " + ui.values[ 1 ]+":00 " );
		}
		});
		
	$("#flightreturn1").val( $( "#slider-flightreturn1" ).slider( "values", 0 ) +":00 -" + $( "#slider-flightreturn1" ).slider( "values", 1 )+":00" );
	
		$( "#slider-hotel" ).slider({
		range: true,
		min: 0,
		max: 24,
		values: [ 6, 13 ],
		slide: function( event, ui ) {
		$( "#hotelreturn" ).val(ui.values[ 0 ] + ":00 - " + ui.values[ 1 ]+":00" );
		}
		});
	$( "#hotelreturn" ).val( $( "#slider-hotel" ).slider( "values", 0 ) +":00 -" + $( "#slider-hotel" ).slider( "values", 1 )+":00" );
	$( "#slider-return1" ).slider({
		range: true,
		min: 0,
		max: 24,
		values: [ 6, 13 ],
		slide: function( event, ui ) {
		$( "#return1" ).val(ui.values[ 0 ] + ":00 - " + ui.values[ 1 ]+":00" );
		}
		});
	$( "#return1" ).val( $( "#slider-return1" ).slider( "values", 0 ) +":00 -" + $( "#slider-return1" ).slider( "values", 1 )+":00" );
	
	
	  $( "#slider-range" ).slider({
				range: true,
				min: 0,
				max: 20000,
				values: [ 0, 10000 ],
				slide: function( event, ui ) {
					 $( "#amount" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
				}
		});
		$( "#amount" ).val( $( "#slider-range" ).slider( "values", 0 ) +" - " + $( "#slider-range" ).slider( "values", 1 ) ); 
                
            $( "#slider-range-port" ).slider({
				range: true,
				min: 0,
				max: 20000,
				values: [ 0, 10000 ],
				slide: function( event, ui ) {
					 $( "#amount-port" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
				}
		});
		$( "#amount-port" ).val( $( "#slider-range-port" ).slider( "values", 0 ) +" - " + $( "#slider-range-port" ).slider( "values", 1 ) ); 
		
		
		$( "#slider-range-max" ).slider({
			  range: "min",
			  min: 0,
			max: 100000,
			   value:38867,
			  slide: function( event, ui ) {
				$( "#priceChange" ).val( ui.value );
			  }
			});
		
	        $("<span class='rupee'>Rs.</span>").insertBefore( "#priceChange" );
			$( "#priceChange" ).val( $( "#slider-range-max" ).slider( "value" ) );
		
		
		    
		
		$( "#slider-range768" ).slider({
				range: true,
				min: 0,
				max: 20000,
				values: [ 0, 10000 ],
				slide: function( event, ui ) {
					 $( "#amount768" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
				}
		});
		$( "#amount768" ).val( $( "#slider-range768" ).slider( "values", 0 ) +" - " + $( "#slider-range768" ).slider( "values", 1 ) ); 
			$( "#slider-crange768" ).slider({
				range: true,
				min: 0,
				max: 20000,
				values: [ 0, 10000 ],
				slide: function( event, ui ) {
					 $( "#camount768" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
				}
		});
		$( "#camount768" ).val( $( "#slider-crange768" ).slider( "values", 0 ) +" - " + $( "#slider-crange768" ).slider( "values", 1 ) ); 
		
		$( "#slider-rang768" ).slider({
				range: true,
				min: 0,
				max: 20000,
				values: [ 0, 10000 ],
				slide: function( event, ui ) {
					 $( "#amt768" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
				}
		});
		$( "#amt768" ).val( $( "#slider-rang768" ).slider( "values", 0 ) +" - " + $( "#slider-rang768" ).slider( "values", 1 ) ); 
	
	$( "#slider-day" ).slider({
		range: true,
		min: 4,
		max: 13,
		values: [ 4, 7 ],
		slide: function( event, ui ) {
		$( "#day" ).val(ui.values[ 0 ] + "D - " + ui.values[ 1 ]+"D" );
		}
		});
		$( "#day" ).val( $( "#slider-day" ).slider( "values", 0 ) +"D - " + $( "#slider-day" ).slider( "values", 1 )+"D" );
		
	$( "#slider-day1" ).slider({
		range: true,
		min: 4,
		max: 13,
		values: [ 4, 7 ],
		slide: function( event, ui ) {
		$( "#day1" ).val(ui.values[ 0 ] + "D - " + ui.values[ 1 ]+"D" );
		}
		});
		$( "#day1" ).val( $( "#slider-day1" ).slider( "values", 0 ) +"D - " + $( "#slider-day1" ).slider( "values", 1 )+"D" );	
		
		$( "#slider-eday1" ).slider({
		range: true,
		min: 4,
		max: 13,
		values: [ 4, 7 ],
		slide: function( event, ui ) {
		$( "#eday1" ).val(ui.values[ 0 ] + "D - " + ui.values[ 1 ]+"D" );
		}
		});
		$( "#eday1" ).val( $( "#slider-eday1" ).slider( "values", 0 ) +"D - " + $( "#slider-eday1" ).slider( "values", 1 )+"D" );	
		
			$( "#slider-cday1" ).slider({
		range: true,
		min: 4,
		max: 13,
		values: [ 4, 7 ],
		slide: function( event, ui ) {
		$( "#cday1" ).val(ui.values[ 0 ] + "D - " + ui.values[ 1 ]+"D" );
		}
		});
		$( "#cday1" ).val( $( "#slider-cday1" ).slider( "values", 0 ) +"D - " + $( "#slider-cday1" ).slider( "values", 1 )+"D" );	
		
		$( "#slider-cday2" ).slider({
		range: true,
		min: 4,
		max: 13,
		values: [ 4, 7 ],
		slide: function( event, ui ) {
		$( "#cday2" ).val(ui.values[ 0 ] + "D - " + ui.values[ 1 ]+"D" );
		}
		});
		$( "#cday2" ).val( $( "#slider-cday2" ).slider( "values", 0 ) +"D - " + $( "#slider-cday2" ).slider( "values", 1 )+"D" );
		
		$( "#slider-cday3" ).slider({
		range: true,
		min: 4,
		max: 13,
		values: [ 4, 7 ],
		slide: function( event, ui ) {
		$( "#cday3" ).val(ui.values[ 0 ] + "D - " + ui.values[ 1 ]+"D" );
		}
		});
		$( "#cday3" ).val( $( "#slider-cday3" ).slider( "values", 0 ) +"D - " + $( "#slider-cday3" ).slider( "values", 1 )+"D" );
	$( "#slider-range-budget" ).slider({
		range: true,
		min: 0,
		max: 100000,
		values: [ 5000, 75000 ],
		slide: function( event, ui ) {
		$( "#amountBudget" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
		}
		});
		$( "#amountBudget" ).val( $( "#slider-range-budget" ).slider( "values", 0 ) +" - " + $( "#slider-range-budget" ).slider( "values", 1 ));	
		
	$( "#slider-range-budget1" ).slider({
		range: true,
		min: 0,
		max: 100000,
		values: [ 5000, 75000 ],
		slide: function( event, ui ) {
		$( "#amountBudget1" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
		}
		});
		$( "#amountBudget1" ).val( $( "#slider-range-budget1" ).slider( "values", 0 ) +" - " + $( "#slider-range-budget1" ).slider( "values", 1 ));		
		
		$( "#slider-range-budget2" ).slider({
		range: true,
		min: 0,
		max: 100000,
		values: [ 5000, 75000 ],
		slide: function( event, ui ) {
		$( "#amountBudget2" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
		}
		});
		$( "#amountBudget2" ).val( $( "#slider-range-budget2" ).slider( "values", 0 ) +" - " + $( "#slider-range-budget2" ).slider( "values", 1 ));		
		
	$( "#slider-range-budget3" ).slider({
		range: true,
		min: 0,
		max: 100000,
		values: [ 5000, 75000 ],
		slide: function( event, ui ) {
		$( "#amountBudget3" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
		}
		});
		$( "#amountBudget3" ).val( $( "#slider-range-budget3" ).slider( "values", 0 ) +" - " + $( "#slider-range-budget3" ).slider( "values", 1 ));	
		$( "#slider-range-budget4" ).slider({
		range: true,
		min: 0,
		max: 100000,
		values: [ 5000, 75000 ],
		slide: function( event, ui ) {
		$( "#amountBudget4" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
		}
		});
		$( "#amountBudget4" ).val( $( "#slider-range-budget4" ).slider( "values", 0 ) +" - " + $( "#slider-range-budget4" ).slider( "values", 1 ));
		$( "#slider-range-budget5" ).slider({
		range: true,
		min: 0,
		max: 100000,
		values: [ 5000, 75000 ],
		slide: function( event, ui ) {
		$( "#amountBudget5" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
		}
		});
		$( "#amountBudget5" ).val( $( "#slider-range-budget5" ).slider( "values", 0 ) +" - " + $( "#slider-range-budget5" ).slider( "values", 1 ));	
		$( "#slider-range-budget6" ).slider({
		range: true,
		min: 0,
		max: 100000,
		values: [ 5000, 75000 ],
		slide: function( event, ui ) {
		$( "#amountBudget6" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
		}
		});
		$( "#amountBudget6" ).val( $( "#slider-range-budget6" ).slider( "values", 0 ) +" - " + $( "#slider-range-budget6" ).slider( "values", 1 ));	
		
			$( "#slider-range-budget7" ).slider({
		range: true,
		min: 0,
		max: 100000,
		values: [ 5000, 75000 ],
		slide: function( event, ui ) {
		$( "#amountBudget7" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
		}
		});
		$( "#amountBudget7" ).val( $( "#slider-range-budget7" ).slider( "values", 0 ) +" - " + $( "#slider-range-budget7" ).slider( "values", 1 ));	
		
	   if( $("#number1").exists()){
	   begin_animation()
	   }
	   
	    if( $("#number1_holiday").exists()){
	   begin_animation_holidays()
		}
	if( $("#number1_hotel").exists()){
	   begin_animation_hotels()
		}
   }
   

/*************************************  Mosaic tile flipping code begins here   *********************************/
// Code for slideshow 1
var _animate  = '';
var active = 1;
function animate() {
    _animate = setInterval(function() { 
      $('#slideshow > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow');
    },  6000);
}

$("#slideshow > div:gt(0)").hide();
animate();


// Code for slideshow 2

var _animate2  = '';
var active2 = 1;
function animate2() {
    _animate2 = setInterval(function() { 
      $('#slideshow2 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow2');
    },  43000);
}


$("#slideshow2 > div:gt(0)").hide();
animate2();


// Code for slideshow 3

var _animate3  = '';
var active3 = 1;
function animate3() {
    _animate3 = setInterval(function() { 
      $('#slideshow3 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow3');
    }, 37000);
}

$("#slideshow3 > div:gt(0)").hide();
animate3();



// Code for slideshow 4

var _animate4  = '';
var active4 = 1;
function animate4() {
    _animate4 = setInterval(function() { 
      $('#slideshow4 > div:first').fadeOut(1000).next().fadeIn(2000).end().appendTo('#slideshow4');
    },  13000);
}

$("#slideshow4 > div:gt(0)").hide();
animate4();

// Code for slideshow 5

var _animate5  = '';
var active5 = 1;
function animate5() {
    _animate5 = setInterval(function() { 
      $('#slideshow5 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow5');
    },  29000);
}



$("#slideshow5 > div:gt(0)").hide();
animate5();

// Code for slideshow 6

var _animate6  = '';
var active6 = 1;
function animate6() {
    _animate6 = setInterval(function() { 
      $('#slideshow6 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow6');
    },  15000);
}



$("#slideshow6 > div:gt(0)").hide();
animate6();

//Code for slideshow 7

var _animate7  = '';
var active7 = 1;
function animate7() {
    _animate7 = setInterval(function() { 
      $('#slideshow7 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow7');
    },  21000);
}

$("#slideshow7 > div:gt(0)").hide();
animate7();

//Code for slideshow 8

var _animate8  = '';
var active8 = 1;
function animate8() {
    _animate8 = setInterval(function() { 
      $('#slideshow8 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow8');
    },  23000);
}

$("#slideshow8 > div:gt(0)").hide();
animate8();



//Code for slideshow 9

var _animate9  = '';
var active9 = 1;
function animate9() {
    _animate9 = setInterval(function() { 
      $('#slideshow9 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow9');
    },  27000);
}


$("#slideshow9 > div:gt(0)").hide();
animate9();

//Code for slideshow 10

var _animate10  = '';
var active10 = 1;
function animate10() {
    _animate10 = setInterval(function() { 
      $('#slideshow10 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow10');
    },  15000);
}




$("#slideshow10 > div:gt(0)").hide();
animate10();


//Code for slideshow 11

var _animate11  = '';
var active11 = 1;
function animate11() {
    _animate11 = setInterval(function() { 
      $('#slideshow11 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow11');
    },  39000);
}

$("#slideshow11 > div:gt(0)").hide();
animate11();

//Code for slideshow 12
var _animate12  = '';
var active12 = 1;
function animate12() {
    _animate12 = setInterval(function() { 
      $('#slideshow12 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow12');
    },  11000);
}

$("#slideshow12 > div:gt(0)").hide();
animate12();

//Code for slideshow 13

var _animate13  = '';
var active13 = 1;
function animate13() {
    _animate13 = setInterval(function() { 
      $('#slideshow13 > div:first').fadeOut(1000).next().fadeIn(200).end().appendTo('#slideshow13');
    },  19000);
}

$("#slideshow13 > div:gt(0)").hide();
animate13();

/**************************************** Mosaic tile flip code ends here *******************************************************/

$('#airlineTab1').on('click', function (e) {
	$("#airlineTabResults1").show();
	$("#airlineTabResults5,#airlineTabResults2,#airlineTabResults3,#airlineTabResults4,#airlineTabResults6,#airlineTabResults7").hide();
	$(this).addClass("sel");
	$("#airlineTab5,#airlineTab2,#airlineTab3,#airlineTab4,#airlineTab6,#airlineTab7").removeClass("sel");
});
$('#airlineTab2').on('click', function (e) {
	$("#airlineTabResults2").show();
	$("#airlineTabResults1,#airlineTabResults5,#airlineTabResults3,#airlineTabResults4,#airlineTabResults6,#airlineTabResults7").hide();
	$(this).addClass("sel");
	$("#airlineTab1,#airlineTab5,#airlineTab3,#airlineTab4,#airlineTab6,#airlineTab7").removeClass("sel");
});
$('#airlineTab3').on('click', function (e) {
	$("#airlineTabResults3").show();
	$("#airlineTabResults1,#airlineTabResults2,#airlineTabResults5,#airlineTabResults4,#airlineTabResults6,#airlineTabResults7").hide();
	$(this).addClass("sel");
	$("#airlineTab1,#airlineTab2,#airlineTab5,#airlineTab4,#airlineTab6,#airlineTab7").removeClass("sel");
});
$('#airlineTab4').on('click', function (e) {
	$("#airlineTabResults4").show();
	$("#airlineTabResults1,#airlineTabResults2,#airlineTabResults3,#airlineTabResults5,#airlineTabResults6,#airlineTabResults7").hide();
	$(this).addClass("sel");
	$("#airlineTab1,#airlineTab2,#airlineTab3,#airlineTab5,#airlineTab6,#airlineTab7").removeClass("sel");
});

$('#airlineTab5').on('click', function (e) {
	$("#airlineTabResults5").show();
	$("#airlineTabResults1,#airlineTabResults2,#airlineTabResults3,#airlineTabResults4,#airlineTabResults6,#airlineTabResults7").hide();
	$(this).addClass("sel");
	$("#airlineTab1,#airlineTab2,#airlineTab3,#airlineTab4,#airlineTab6,#airlineTab7").removeClass("sel");
});

$('#airlineTab6').on('click', function (e) {
	$("#airlineTabResults6").show();
	$("#airlineTabResults1,#airlineTabResults2,#airlineTabResults3,#airlineTabResults4,#airlineTabResults5,#airlineTabResults7").hide();
	$(this).addClass("sel");
	$("#airlineTab1,#airlineTab2,#airlineTab3,#airlineTab4,#airlineTab5,#airlineTab7").removeClass("sel");
});

$('#airlineTab7').on('click', function (e) {
	$("#airlineTabResults7").show();
	$("#airlineTabResults1,#airlineTabResults2,#airlineTabResults3,#airlineTabResults4,#airlineTabResults5,#airlineTabResults6").hide();
	$(this).addClass("sel");
	$("#airlineTab1,#airlineTab2,#airlineTab3,#airlineTab4,#airlineTab5,#airlineTab6").removeClass("sel");
});


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
		
		$( '#custom-next' ).on( 'click', function() {
		cal.gotoNextMonth( updateMonthYear );
		} );
		$( '#custom-prev' ).on( 'click', function() {
		cal.gotoPreviousMonth( updateMonthYear );
		} );
		$( '#custom-current' ).on( 'click', function() {
		cal.gotoNow( updateMonthYear );
		} );
		function updateMonthYear() {				
		$month.html( cal.getMonthName() );
		$year.html( cal.getYear() );
		}
	}
	
	/*if($().calendario)
	{
		var cal = $( '#calendar1' ).calendario( {
			onDayClick : function( $el, $contentEl, dateProperties ) {
				for( var key in dateProperties ) {
					console.log( key + ' = ' + dateProperties[ key ] );
				}
			},
			caldata : codropsEvents
		} ),
		$month = $( '#custom-month1' ).html( cal.getMonthName() ),
		$year = $( '#custom-year1' ).html( cal.getYear() );
		
		$( '#custom-next1' ).on( 'click', function() {
		cal.gotoNextMonth( updateMonthYear );
		} );
		$( '#custom-prev1' ).on( 'click', function() {
		cal.gotoPreviousMonth( updateMonthYear );
		} );
		$( '#custom-current1' ).on( 'click', function() {
		cal.gotoNow( updateMonthYear );
		} );
		function updateMonthYear() {				
		$month.html( cal.getMonthName() );
		$year.html( cal.getYear() );
		}
	}
	if($().calendario)
	{
		var cal = $( '#calendar2' ).calendario( {
			onDayClick : function( $el, $contentEl, dateProperties ) {
				for( var key in dateProperties ) {
					console.log( key + ' = ' + dateProperties[ key ] );
				}
			},
			caldata : codropsEvents
		} ),
		$month = $( '#custom-month2' ).html( cal.getMonthName() ),
		$year = $( '#custom-year2' ).html( cal.getYear() );
		
		$( '#custom-next2' ).on( 'click', function() {
		cal.gotoNextMonth( updateMonthYear );
		} );
		$( '#custom-prev2' ).on( 'click', function() {
		cal.gotoPreviousMonth( updateMonthYear );
		} );
		$( '#custom-current2' ).on( 'click', function() {
		cal.gotoNow( updateMonthYear );
		} );
		function updateMonthYear() {				
		$month.html( cal.getMonthName() );
		$year.html( cal.getYear() );
		}
	}
		if($().calendario)
	{
		var cal = $( '#calendar3' ).calendario( {
			onDayClick : function( $el, $contentEl, dateProperties ) {
				for( var key in dateProperties ) {
					console.log( key + ' = ' + dateProperties[ key ] );
				}
			},
			caldata : codropsEvents
		} ),
		$month = $( '#custom-month3' ).html( cal.getMonthName() ),
		$year = $( '#custom-year3' ).html( cal.getYear() );
		
		$( '#custom-next3' ).on( 'click', function() {
		cal.gotoNextMonth( updateMonthYear );
		} );
		$( '#custom-prev3' ).on( 'click', function() {
		cal.gotoPreviousMonth( updateMonthYear );
		} );
		$( '#custom-current3' ).on( 'click', function() {
		cal.gotoNow( updateMonthYear );
		} );
		function updateMonthYear() {				
		$month.html( cal.getMonthName() );
		$year.html( cal.getYear() );
		}
	}
	if($().calendario)
	{
		var cal = $( '#calendar4' ).calendario( {
			onDayClick : function( $el, $contentEl, dateProperties ) {
				for( var key in dateProperties ) {
					console.log( key + ' = ' + dateProperties[ key ] );
				}
			},
			caldata : codropsEvents
		} ),
		$month = $( '#custom-month4' ).html( cal.getMonthName() ),
		$year = $( '#custom-year4' ).html( cal.getYear() );
		
		$( '#custom-next4' ).on( 'click', function() {
		cal.gotoNextMonth( updateMonthYear );
		} );
		$( '#custom-prev4' ).on( 'click', function() {
		cal.gotoPreviousMonth( updateMonthYear );
		} );
		$( '#custom-current4' ).on( 'click', function() {
		cal.gotoNow( updateMonthYear );
		} );
		function updateMonthYear() {				
		$month.html( cal.getMonthName() );
		$year.html( cal.getYear() );
		}
	}
	if($().calendario)
	{
		var cal = $( '#calendar5' ).calendario( {
			onDayClick : function( $el, $contentEl, dateProperties ) {
				for( var key in dateProperties ) {
					console.log( key + ' = ' + dateProperties[ key ] );
				}
			},
			caldata : codropsEvents
		} ),
		$month = $( '#custom-month5' ).html( cal.getMonthName() ),
		$year = $( '#custom-year5' ).html( cal.getYear() );
		
		$( '#custom-next5' ).on( 'click', function() {
		cal.gotoNextMonth( updateMonthYear );
		} );
		$( '#custom-prev5' ).on( 'click', function() {
		cal.gotoPreviousMonth( updateMonthYear );
		} );
		$( '#custom-current5' ).on( 'click', function() {
		cal.gotoNow( updateMonthYear );
		} );
		function updateMonthYear() {				
		$month.html( cal.getMonthName() );
		$year.html( cal.getYear() );
		}
	}
	if($().calendario)
	{
		var cal = $( '#calendar6' ).calendario( {
			onDayClick : function( $el, $contentEl, dateProperties ) {
				for( var key in dateProperties ) {
					console.log( key + ' = ' + dateProperties[ key ] );
				}
			},
			caldata : codropsEvents
		} ),
		$month = $( '#custom-month6' ).html( cal.getMonthName() ),
		$year = $( '#custom-year6' ).html( cal.getYear() );
		
		$( '#custom-next6' ).on( 'click', function() {
		cal.gotoNextMonth( updateMonthYear );
		} );
		$( '#custom-prev6' ).on( 'click', function() {
		cal.gotoPreviousMonth( updateMonthYear );
		} );
		$( '#custom-current6' ).on( 'click', function() {
		cal.gotoNow( updateMonthYear );
		} );
		function updateMonthYear() {				
		$month.html( cal.getMonthName() );
		$year.html( cal.getYear() );
		}
	}*/
// End of document ready functioon	
});




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



/*******************************************************************************/



function MouseRollover(MyImage, name) {
        MyImage.src = "images/"+name+"_hover.png";
}
function MouseOut(MyImage, name) {
       MyImage.src = "images/"+name+".png";
}

function demo(id1, id2, claNm){
$(function(){
    $(id1).on('mouseenter mouseleave', function(){
        $(id2).toggleClass(claNm);
    });
});
}



function showHideDropdown(id){
	if(document.getElementById(id).style.display == 'block'){
		document.getElementById(id).style.display = 'none'	
	}
	else{
	document.getElementById(id).style.display = 'block'
	}
}


function mycarousel_initCallback(carousel)
{
    carousel.buttonNext.bind('click', function() {
        carousel.startAuto(0);
    });

    carousel.buttonPrev.bind('click', function() {
        carousel.startAuto(0);
    });
	carousel.clip.hover(function() {
        carousel.stopAuto();
    }, function() {
        carousel.startAuto();
    });
};


function selVal(obj, id, ddId){
	aa = obj.innerHTML;
	var decoded = aa.replace(/&amp;/g, '&');
	document.getElementById(id).value = decoded;
	bb = document.getElementById(ddId).getElementsByTagName('li');
	cc = (bb.length)-1;
	for(i=0; i<bb.length; i++){
		if(bb[i].className == 'heading'){
			
		}
		else{
		bb[i].className = ''
		}
		if(i == cc){
			bb[i].className = 'last'
		}
		
	}
	obj.parentNode.className = 'sel'
}

function show_holiday(id){
	if(document.getElementById(id).className == 'overlay'){
		document.getElementById(id).className = '';	
	}
	else{
		document.getElementById(id).className = 'overlay';
	}
	document.getElementById('show_holiday_panel').style.display = 'block';	
}


$(window).scroll(function() {
    if ($(this).scrollTop()) {
        $('#toTop').fadeIn();
		
    } else {
        $('#toTop').fadeOut();
    }
});




$( document ).mouseup( function( e ) {
	if( $( ".selectCont" ).has( e.target ).length === 0 ) {
        $( ".selectCont" ).slideUp('fast');
    }
});

function showMoreOptions(){
	if(document.getElementById('moreOptions').style.display == 'block'){
		document.getElementById('moreOptions').style.display = 'none'
		document.getElementById('moreTab').className = 'more fL posR';	
	}
	else{
		document.getElementById('moreTab').className = 'more fL posR sel';
		document.getElementById('moreOptions').style.display = 'block';
	}
	
	 $(document).mouseup(function (e)
	 {
		var container = $("#moreOptions");
		if (!container.is(e.target) // if the target of the click isn't the container...
			&& container.has(e.target).length === 0) // ... nor a descendant of the container
		{
			if($(".moreOptionsPage").exists()){
	     	$("#moreTab").addClass("sel");
			container.hide();
			}
			else{
			container.hide();
			$("#moreTab").removeClass("sel");
			}
			
			
		}
		
	 });
	 
}

$('body').on('keydown', function( e ) {
    if( e.keyCode == 27 ) {
        $('.popupplay').hide();   
        $('#fade').hide();  
document.body.style.overflow='auto';		
    }
});		
//========================================================= open popup window =======================================
function popupwin(light,lightInner, fade, sourceIds)
 {
 document.getElementById(light).style.display='block';
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
document.body.style.overflow='hidden';
 document.getElementById(light).style.overflow='auto';
 document.getElementById(fade).style.display='block';
   if (sourceId) {
       dialogContainer.find('a#btnConfirm').data('sourceId', sourceId);
     }
	 if(light == "light1"){
	 	$('#noteContent1').val('');
		$('#charCount1').html(0);
	 }
 }
 function popupwin(light,lightInner, fade)
 {
 document.getElementById(light).style.display='block';
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
document.body.style.overflow='hidden';
 document.getElementById(light).style.overflow='auto';
 document.getElementById(fade).style.display='block';

	 if(light == "light1"){
	 	$('#noteContent1').val('');
		$('#charCount1').html(0);
	 }
 }
 
function popupclose(light, fade)
 {
	 document.getElementById(light).style.display='none';
	 document.getElementById(fade).style.display='none';
	  document.body.style.overflow='auto';
 }
 
 
function showHolidayPackage(obj , id){
	//$("#show_holiday_panel").show(); 
	var imgCount = (document.getElementById('thumb1').getElementsByTagName('img') ).length;
	
	
	if(imgCount <= 2)
	{
	$("#selectedHolidays").show();	
	aa = obj.src;
	bb = aa.substring(aa.lastIndexOf('/')+ 1);
	var cc = bb.split('.');
	dd = cc[0];
	span = document.createElement("span");
	span.className = 'close_thumbnil';
	onFn = "deleteThumb('" + dd + "' , '" + id + "')";
	span.setAttribute("onclick",onFn); 
	
	img = document.createElement("IMG");
	img.src = 'images/home/'+dd+'_thumb.jpg';
	img.style.border = '1px solid #fff';
	
	div = document.createElement("div");
	div.className = 'posR fL mR15';
	div.id = dd;
	div.appendChild(img);
	div.appendChild(span);
	
	document.getElementById('thumb1').appendChild(div);
	$("#show_holiday_panel").show();
	$("#toTop").css("bottom","215px");
	document.getElementById(id).style.display = 'block';
	}
	
	
}

function hide_div(){
    $("#thumb1").html("");   
    $("#show_holiday_panel").hide();
	$("#toTop").css("bottom","50px");
}


function close_shopping_cart(){
	$("#shopping_cart_panel").hide();
	$("#shoppingCartTab").removeClass("sel");
	$(".footerContactDetail").removeClass('activated');
	}


function deleteThumb(id,imgid){
	var parent = document.getElementById("thumb1");
	var child = document.getElementById(id);
	parent.removeChild(child);
		document.getElementById(imgid).style.display = 'none';
	if(document.getElementById("thumb1").innerHTML == " "){
		$("#show_holiday_panel").hide();
		 $("#selectedHolidays").hide();
		 $("#toTop").css("bottom","50px");
	}
	
}




/*arrVar = 0;
depVar = 0;
function selectItem(id1, id2,flStat){
	if(flStat == "arr")
	{	
		aa = document.getElementById(id1);
		bb = document.getElementById(id2);
		if(aa.style.display == 'none')
		{
			if(arrVar == 0)
			{
				aa.style.display = 'block';	
				bb.style.backgroundColor ="#eeeeee";
				$("#" + id2).addClass("sel");
				arrVar = 1;
			}
			else{
				for(i=1;i<=4;i++)
				{
					document.getElementById(flStat + "Tick" + i).style.display = "none";
					document.getElementById(flStat + "FlightPlan" + i + "_inner").style.backgroundColor = "transparent";
					$("#" + flStat + "FlightPlan" + i + "_inner").removeClass("sel");
				}
				aa.style.display = 'block';	
				bb.style.backgroundColor ="#eeeeee";
				$("#" + id2).addClass("sel");
				arrVar = 1;
			}
		}
		else{
			aa.style.display = 'none';
			bb.style.backgroundColor = "transparent";
			$("#" + id2).removeClass("sel");
			arrVar = 0;
		}
	}

	if(flStat == "dep")
	{
		aa = document.getElementById(id1);
		bb = document.getElementById(id2);
		if(aa.style.display == 'none')
		{
			if(depVar == 0)
			{
				aa.style.display = 'block';	
				bb.style.backgroundColor ="#eeeeee";
				$("#" + id2).addClass("sel");
				depVar = 1;
			}
			else{
				for(i=1;i<=4;i++)
				{
					document.getElementById(flStat + "Tick" + i).style.display = "none";
					document.getElementById(flStat + "FlightPlan" + i + "_inner").style.backgroundColor = "transparent";
					$("#" + flStat + "FlightPlan" + i + "_inner").removeClass("sel");
				}
				aa.style.display = 'block';	
				bb.style.backgroundColor ="#eeeeee";
				$("#" + id2).addClass("sel");
				arrVar = 1;
			}
		}
		else{
			aa.style.display = 'none';
			bb.style.backgroundColor ="transparent";
			$("#" + id2).removeClass("sel");
			depVar = 0;
		}
	}
	
	if(document.getElementById("depTick1").style.display == "block" && document.getElementById("arrTick1").style.display == "none")
	{
		document.getElementById("show_holiday_panel_top").style.display = "block";
		document.getElementById("depFlightSel").style.display = "block";
		document.getElementById("arrFlightSel").style.display = "none";
		document.getElementById("flightAddIcon").style.display = "none";
		document.getElementById("flightPrice").innerHTML = "5,382";
	}
	
	if(document.getElementById("depTick1").style.display == "none" && document.getElementById("arrTick1").style.display == "block")
	{
		document.getElementById("show_holiday_panel_top").style.display = "block";
		document.getElementById("arrFlightSel").style.display = "block";
		document.getElementById("depFlightSel").style.display = "none";
		document.getElementById("flightAddIcon").style.display = "none";
		document.getElementById("flightPrice").innerHTML = "6,382";
	}
		
	
	if(document.getElementById("depTick1").style.display == "block" && document.getElementById("arrTick1").style.display == "block")
	{
		document.getElementById("show_holiday_panel_top").style.display = "block";
		document.getElementById("arrFlightSel").style.display = "block";
		document.getElementById("depFlightSel").style.display = "block";
		document.getElementById("flightAddIcon").style.display = "block";
		document.getElementById("flightPrice").innerHTML = "11,764";
	}
	
	if(document.getElementById("depTick1").style.display == "none" && document.getElementById("arrTick1").style.display == "none")
	{
		document.getElementById("show_holiday_panel_top").style.display = "none";
		document.getElementById("arrFlightSel").style.display = "none";
		document.getElementById("depFlightSel").style.display = "none";
		document.getElementById("flightAddIcon").style.display = "none";
		document.getElementById("flightPrice").innerHTML = "";
	}
	
}*/


function showRate(rate){
	if(rate == "arv"){
		$("#show_holiday_panel_top,#depFlightSel").show();
		$("#flightPrice").html('5,382');
	}
	if(rate == "dep"){
		$("#show_holiday_panel_top,#depFlightSel,#flightAddIcon,#arrFlightSel").show();
		$("#flightPrice").html('10,746');
	}
}

function hideRate(){
	
	if($("#bom_del").is(":visible")){
		$("#bom_del,#show_holiday_panel_top,#depFlightSel").hide();
		$("#flightPrice").html('');
	}
	else{
		$("#bom_del,#show_holiday_panel_top,#depFlightSel").show();
		$("#flightPrice").html('4,382');
	}
}
function hideRate_01(){
	
	if($("#del_bom").is(":visible")){
		$("#del_bom,#show_holiday_panel_top,#depFlightSel,#flightAddIcon,#arrFlightSel").hide();
		$("#flightPrice").html('');
	}
	else{
		$("#del_bom,#show_holiday_panel_top,#depFlightSel,#flightAddIcon,#arrFlightSel").show();
		$("#flightPrice").html('8,764');
	}
	
}	
	
	
function hideShowAcc(id1, id2)
{
	$("#" + id2).slideToggle("slow");
	$('#'+ id2).toggleClass("active");
		if ($('#'+ id2).hasClass('active')) {
			$('#'+ id1).find('img').attr('src','images/b2c-images/up1.png');		   
		}else{
			$('#'+ id1).find('img').attr('src','images/b2c-images/down1.png');
		}
			  
}



function showContr(id){
	$("#" + id).slideDown();
}

function hideContr(id){
	$("#" + id).slideUp();	
}


function begin_animation(){
		var flightno=parseInt($('#flightnumber').text());
		var amount1=parseInt($('#amount1').text());
		var amount2=parseInt($('#amount2').text());
		$({c:0}).delay(500).animate({c:flightno},{step: function(now){$("#number1").text(Math.round(now))}, duration: 1000,easing: "linear"});
		
		$({c:0}).delay(500).animate({c:amount1},{step: function(now){$("#number2").text(Math.round(now)+',')}, duration: 1000,easing: "linear"});
		$({c:0}).delay(500).animate({c:amount2},{step: function(now){$("#number3").text(Math.round(now))}, duration: 1000,easing: "linear"});
	}
	
function chSrc(tabId, contrId){
	for(i=1; i<=5; i++){
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

function editHolidayDesc(id1,id2, id3)
{
  var x = $("#" + id1).text();
  $("#" + id2).val(x);
  $("#" + id1).hide();
  $("#" + id2).show();
  $("#" + id3).show();
}

function saveHolidayDesc(id1,id2, id3)
{
  var x = $("#" + id2).val();
  $("#" + id1).text(x);
  $("#" + id1).show();
  $("#" + id2).hide();
  $("#" + id3).hide();
  
}

function removediyCont(accHead, accContent)	 
{
	  $("#" + accHead).remove();
	  $("#" + accContent).remove();
}


function hideActionControls(id1, id2)
{
	if($("#" + id2).is(":visible"))
			$("#" + id1).hide();
		else
			$("#" + id1).show();
}

function searchFlight(obj){
	
	switch(obj)
	{
		case "oneway":
			document.getElementById('returnFlightContainer').style.visibility = 'hidden';
			document.getElementById("checkhotel").style.display= "none";
			document.getElementById("checkinreturn").style.visibility = "visible";
			document.getElementById("checkoutreturn").style.visibility = "visible";
			document.getElementById('multiwayAdd').style.display = 'none';
			document.getElementById('multiwayhide2').style.display = 'block';
			document.getElementById('multiwayhide1').style.display = 'block';
			document.getElementById("multiwaySearchDefault").style.display = "none";
			document.getElementById("multiwaySearchDefault1").style.display = "none";
			document.getElementById("checkhotel1").style.display= "none";
			document.getElementById('hotelStay').style.visibility= 'hidden';
			document.getElementById('2nights').style.visibility = 'visible';
			document.getElementById('flightSearchPanel').style.display = 'none';		
			//document.getElementById("multiwaySearchPanel_2").style.display = "none";	
			//document.getElementById("carType").style.display = "none";
			//document.getElementById("noOfCars").style.display = "none";
			//document.getElementById("pickUpDateHolder").style.display = "none";
			//document.getElementById("dropOffDateHolder").style.display = "none";
			$("#multiwaySearchParameters3, #multiwaySearchParameters4, #multiwaySearchParameters5, #multiwaySearchParameters6").hide();
			$("#flightOptionsSearchPanel,#carSearchPanel").hide();
			$("#moreFlightOpton1").removeClass("active");
			$("#plusMinus1").text("+")
			$("#addCar,#addFlight1").prop("checked",false)
			mc = 3
			showHidePanel = 0;
			$("#globalSrcToggle").show();
			$(".globalSrcShow").text("Hide");
			$(".globalSrcShow").addClass("sel");
			
		 
		  
		break;
		case "return":
			document.getElementById('returnFlightContainer').style.visibility = 'visible';
			document.getElementById('multiwayAdd').style.display = 'none';
			document.getElementById("checkinreturn").style.visibility = "hidden";
			document.getElementById("checkoutreturn").style.visibility = "hidden";
			document.getElementById('multiwayhide2').style.display = 'block';
			document.getElementById('multiwayhide1').style.display = 'block';
			document.getElementById("multiwaySearchDefault").style.display = "none";
			document.getElementById("multiwaySearchDefault1").style.display = "none";
			document.getElementById("checkhotel").style.display= "none";
			document.getElementById("checkhotel1").style.display= "none";
			document.getElementById('hotelStay').style.visibility = 'visible';
			document.getElementById('2nights').style.visibility = 'hidden';
			document.getElementById('flightSearchPanel').style.display = 'none';
			//document.getElementById("multiwaySearchPanel_2").style.display = "none";	
			$("#multiwaySearchParameters3, #multiwaySearchParameters4, #multiwaySearchParameters5, #multiwaySearchParameters6").hide();
			$("#flightOptionsSearchPanel,#carSearchPanel").hide();
			$("#moreFlightOpton1").removeClass("active");
			$("#plusMinus1").text("+")
			$("#addCar,#addFlight1").prop("checked",false)
			showHidePanel = 0;
			mc = 3;
			$("#globalSrcToggle").show();
			$(".globalSrcShow").text("Hide");
			$(".globalSrcShow").addClass("sel");
			
			
		break;
		case "multicity":
			document.getElementById('returnFlightContainer').style.visibility = 'hidden';
			document.getElementById('multiwayAdd').style.display = 'block';
			document.getElementById('multiwayhide2').style.display = 'none';
			document.getElementById("checkinreturn").style.visibility= "hidden";
			document.getElementById("checkoutreturn").style.visibility = "hidden";
			document.getElementById('multiwayhide1').style.display = 'none';
			document.getElementById("checkhotel").style.display= "block";
			document.getElementById("checkhotel1").style.display= "block";
			document.getElementById("multiwaySearchDefault").style.display = "block";
			document.getElementById("multiwaySearchDefault1").style.display = "block";
			document.getElementById("hotelStay").style.visibility= 'hidden';
			document.getElementById('2nights').style.visibility = 'hidden';
			document.getElementById('flightSearchPanel').style.display = 'none';
			//document.getElementById("multiwaySearchPanel_2").style.display = "block";	
			document.getElementById("carSearchPanel").style.display = "block";	
			document.getElementById("addFlight1").checked = false;
			$("#flightOptionsSearchPanel").hide();
			$("#moreFlightOpton1").removeClass("active");
			$("#plusMinus1").text("+")
			showHidePanel = 0;
			$("#globalSrcToggle").show();
			$(".globalSrcShow").text("Hide");
			$(".globalSrcShow").addClass("sel");
			
			
			break;
		case "ticket_port":
			document.getElementById('returnFlightContainer').style.visibility = 'hidden';
			document.getElementById('multiwayAdd').style.display = 'block';
			document.getElementById("multiwaySearchDefault").style.display = "block";	
			//document.getElementById("multiwaySearchPanel_2").style.display = "block";	
			document.getElementById("flightSearchPanel").style.display = "none";	
			document.getElementById("carSearchPanel").style.display = "none";	
			document.getElementById("comboOfferTriggers").style.display = "none";
   			document.getElementById("addCar").checked = false;
			document.getElementById("addFlight1").checked = false;	
		break;
		default :	
			document.getElementById('returnFlightContainer').style.display = 'block';
	}
}

function begin_animation_holidays(){
		var holidaynumber=parseInt($('#holidaynumber').text());
		var amount1=parseInt($('#amount1_holiday').text());
		var amount2=parseInt($('#amount2_holiday').text());
		$({c:0}).delay(500).animate({c:holidaynumber},{step: function(now){$("#number1_holiday").text(Math.round(now))}, duration: 1000,easing: "linear"});
		$({c:0}).delay(500).animate({c:amount1},{step: function(now){$("#number2_holiday").text(Math.round(now)+',')}, duration: 1000,easing: "linear"});
		$({c:0}).delay(500).animate({c:amount2},{step: function(now){$("#number3_holiday").text(Math.round(now))}, duration: 1000,easing: "linear"});
	}
	
function begin_animation_hotels(){
		var holidaynumber=parseInt($('#hotelnumber').text());
		var amount1=parseInt($('#amount1_hotel').text());
		var amount2=parseInt($('#amount2_hotel').text());
		$({c:0}).delay(500).animate({c:holidaynumber},{step: function(now){$("#number1_hotel").text(Math.round(now))}, duration: 1000,easing: "linear"});
		$({c:0}).delay(500).animate({c:amount1},{step: function(now){$("#number2_hotel").text(Math.round(now)+',')}, duration: 1000,easing: "linear"});
		$({c:0}).delay(500).animate({c:amount2},{step: function(now){$("#number3_hotel").text(Math.round(now))}, duration: 1000,easing: "linear"});
	}	
	
	

	
	


/*DIY Scripts*/
 function pw() 
{
	return window.innerWidth || document.documentElement.clientWidth || document.body.clientWidth
} 
function mouseX(evt) 
{
	return evt.clientX ? evt.clientX + (document.documentElement.scrollLeft || document.body.scrollLeft) : evt.pageX;
} 
function mouseY(evt) 
{
	return evt.clientY ? evt.clientY + (document.documentElement.scrollTop || document.body.scrollTop) : evt.pageY
}
function popUp(evt,oi) 
{
	if (document.getElementById) 
		{
		var wp = pw();
	   dm = document.getElementById(oi); 
	   ds = dm.style;
	   st = ds.visibility; 
		if (dm.offsetWidth) ew = dm.offsetWidth; 
		else if (dm.clip.width) ew = dm.clip.width; 
		if (st == "visible" || st == "show") 
			{ 
				ds.visibility = "hidden"; 
			} 
		else 
		{
			tv = mouseY(evt) + 20; lv = mouseX(evt) - (ew/4); 
	
			if (lv < 2) lv = 2; 
			else if (lv + ew > wp) lv -= ew/2; lv += 'px';tv += 'px';  ds.left = lv; ds.top = tv; ds.visibility = "visible";
		}
	}
}




 // functions that scrolls to #link
function goToElement(id){
     $('html,body').animate({
        scrollTop: $("#"+id).offset().top - 100},
        'slow');
}
 // functions that scrolls to #link popup
function goToElementpopup(id){
     $('.white_content').animate({
        scrollTop: $("#"+id).offset().top - 100},
        'slow');
}



function checkUncheck(id1, id2)
{
	$("#" + id2).toggle();
	
}

var  showHidePanel;
function showMoreInfo(id1, id2, id3)
{
	 $("#" + id1).toggleClass("active");
	 $("#" + id2).slideToggle();
	 
	  if ($("#" + id1).hasClass('active')) {
		   showHidePanel = 1;
			$("#" + id3).html(" - ");		   
		}else{
			$("#" + id3).html(" + ");
			
			if($("#multicity").is(":checked")){
					if( $("#multiwaySearchParameters3").is(":hidden") &&  $("#multiwaySearchParameters4").is(":hidden") &&  $("#multiwaySearchParameters5").is(":hidden")  ){
							showHidePanel = 0;
					}
			}
			else{
				 if( !$("#addFlight1").is(":checked") &&  !$("#addCar").is(":checked")){showHidePanel = 0;}
			}
			
		}
}


function showMoreInfoHotel(id1, id2, id3) {
	 $("#" + id1).toggleClass("active");
	 $("#" + id2).slideToggle();
	 
	  if ($("#" + id1).hasClass('active')) {
		   showHidePanel = 1;
			$("#" + id3).html(" - ");		   
		}else{
			$("#" + id3).html(" + ");
		}
		
		
		
		if (  (!$("#" + id1).hasClass('active'))  && ( child_Count < 3 )  && ( $("#noOfRooms").val() < 2)  &&  !$("#addFlight1").is(":checked") &&  !$("#addCar").is(":checked") ) {
		   showHidePanel = 0;
		}
		
	}
function showMoreInfodeals(id1, id2, id3) {
	 $("#" + id1).toggleClass("active");
	 $("#" + id2).slideToggle();
	 
	  if ($("#" + id1).hasClass('active')) {
		   showHidePanel = 1;
			$("#" + id3).html(" - ");		   
		}else{
			$("#" + id3).html(" + ");
		}
		
		
		
		if (  (!$("#" + id1).hasClass('active'))  && ( child_Count < 3 )  && ( $("#noOfRooms").val() < 2)  &&  !$("#addFlight1").is(":checked") &&  !$("#addCar").is(":checked") ) {
		   showHidePanel = 0;
		}
		
	}


function dismissMoreInfo(id1, id2, id3)
{
	$("#" + id1).removeClass("active"); 
	$("#" + id2).slideUp();
	
	if ($("#" + id1).hasClass('active')) {
			$("#" + id3).text(" - ");		   
		}else{
			$("#" + id3).text(" + ");
		}
}


function addCarFlight(option){
	if(option == "car"){
		if($("#carSearchPanel").is(":visible")){
			$("#carSearchPanel").hide();
			
			if( (!$("#addFlight1").is(":checked")) && ($("#flightOptionsSearchPanel").is(":hidden"))   && ( $("#noOfRooms").val() < 2) )
			{
				showHidePanel = 0;
			}
			
			
			
			if( (!$("#addFlight1").is(":checked")) && ($("#flightOptionsSearchPanel").is(":hidden"))  && ( child_Count >= 3 )   )
			{
				showHidePanel = 1;
			}
			
			
		}
		else{
			$("#carSearchPanel").show();
			showHidePanel = 1;
			}
	}
	if(option == "Hotel"){
		if($("#hotelStayPanel").is(":visible")){
			$("#hotelStayPanel").hide();
			
			if( (!$("#addHotelStay").is(":checked")) && ($("#hotelOptionsSearchPanel").is(":hidden"))   && ( $("#noOfRooms").val() < 2) )
			{
				showHidePanel = 0;
			}
			
			
			
			if( (!$("#addHotelStay").is(":checked")) && ($("#hotelOptionsSearchPanel").is(":hidden"))  && ( child_Count >= 3 )   )
			{
				showHidePanel = 1;
			}
			
			
		}
		else{
			$("#hotelStayPanel").show();
			showHidePanel = 1;
			}
	}
	
	if(option == "flight"){
		if($("#flightSearchPanel").is(":visible")){
			$("#flightSearchPanel").hide();
		if( (!$("#addFlight1").is(":checked")) && ($("#flightOptionsSearchPanel").is(":hidden")) && ( $("#noOfRooms").val() < 2))
		{
			showHidePanel = 0;
		}
		if( (!$("#addFlight1").is(":checked")) && ($("#flightOptionsSearchPanel").is(":hidden")) && ( child_Count >= 3 ) )
		{
			showHidePanel = 1;
		}
		if( (child_Count < 3) && ( !$("#addFlight1").is(":checked") )    && ( !$("#addFlight1").is(":checked") )  && ( !$("#moreFlightOpton1").hasClass("active") )     ){
		 showHidePanel = 0
		}
		
		}
		else{
			$("#flightSearchPanel").show();
			showHidePanel = 1;
		}
	}
}

function showFlightOptions(){
	if($("#flightOptionsSearchPanel").is(":visible"))
			$("#flightOptionsSearchPanel").hide();
		else
			$("#flightOptionsSearchPanel").show();
}




/*Show more show less*/
(function($) {
    $.fn.shorten = function(settings) {
        "use strict";
     var config = {
            showChars: 200,
            ellipsesText: "...",
            moreText: "View more",
            lessText: "View less",
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
 
 $(".overviewDescription, .featuresList, .holidayDesc").shorten();
 
 
 // Tag cloud add function
function getCheckedTags(){
    $("#tagsHolder").show();
	$("#selectedTags").html('');
	 $('input[name="checkbox_tags"]:checked').each(function() {
	       var selectedTags = this.value;
		   document.getElementById("selectedTags").innerHTML += "<span class='userTag'>" + selectedTags + "<a href='#' class='removeTag'>x</a></span>";
		   
		});
		
  //Dismiss tags
	$("a.removeTag").on("click", function(e){
	e.preventDefault(); 
     $(this).parent().remove();
	 str = $(this).parent().text();
	 n = str.substring(0, str.length - 1);
	 
	 $('input:checkbox[value="' + n + '"]').attr('checked', false);
	 
	 if( $("#selectedTags").html() =="" ){
	    $("#tagsHolder").hide();
	 }

    })
 
	 
	 
}




//Toggle country flag
$('ul#cntList li').on('click', function (e) {
		$('ul#cntList li').removeClass('sel');
		$(this).addClass('sel');
		$('ul#cntList li').find('i:first').removeClass('tickMark black');
		var className = $(this).find('i:last').attr('class');
		$('#selectedFlag').removeClass().addClass(className)
});


//Add multiway flights
var mc = 4;
function showMultiwayOptions(){
	if(mc < 7){
		$('#multiwaySearchParameters' + mc).show();
		mc++;
		showHidePanel = 1;
	}
}

function hideMultiwayOptions(i){
	$("#multiwaySearchParameters" + i).hide();	
	if( $("#multiwaySearchParameters3").is(":hidden") &&  $("#multiwaySearchParameters4").is(":hidden") &&  $("#multiwaySearchParameters5").is(":hidden") &&  $("#multiwaySearchParameters6").is(":hidden") ){
		showHidePanel = 0;
		}
	if(i != 5)
		mc = i++;
		
}


/* Eurail functions  */

function searchEurail(obj){
    switch(obj)
	{
		case "ticket":
			$("#eurailTicketContainer").show();
			$("#eurailPassContainer, #eurailReserveContainer").hide();
		  
		break;
		
		
		case "pass":
			$("#eurailPassContainer").show();
			$("#eurailTicketContainer, #eurailReserveContainer").hide();
			
			
		break;
		
		
		case "reservation":
			$("#eurailReserveContainer").show();
			$("#eurailPassContainer, #eurailTicketContainer").hide();
			
			
			break;
			
	
		
		default :	
			$("#eurailTicketContainer").show();
			$("#eurailPassContainer, #eurailReserveContainer").hide();
	}
	
	
	
}




/* Eurail ticket add city */
var eur1 = 3;
function addCityTicketEurail(){
	if(eur1 < 6){
		$('#eurailTicketCity' + eur1).show();
		eur1++;
	}
}

function hideTicketEurailCity(i){
	$("#eurailTicketCity" + i).hide();	
	if(i != 5)
		eur1 = i++;		
}


/* Eurail Pass add city */
var eur2 = 3;
function addCityPassEurail(){
	if(eur2 < 6){
		$('#eurailPassCity' + eur2).show();
		eur2++;
	}
}

function hidePassEurailCity(i){
	$("#eurailPassCity" + i).hide();	
	if(i != 5)
		eur2 = i++;		
}



/* Eurail Reservation add city */
var eur3 = 3;
function addCityReserveEurail(){
	if(eur3 < 6){
		$('#eurailReserveCity' + eur3).show();
		eur3++;
	}
}

function hideReserveEurailCity(i){
	$("#eurailReserveCity" + i).hide();	
	if(i != 5)
		eur3 = i++;		
}


//Authenticate functions

function loginUser(){
   
   $("#myAccount").hide();
   $("#loggedInUser").show();
   $("#userMenu").hide();
   $("#wishListTab").show();
   
}


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


//set text of the autotype field on click
$(".popularRouteLink").click( function(){
	  var x = $(this).text();
	  $("#autoTypeText").val(x);
	
	})
	

//Follow unfollow button on dashboard page
$(".followButton").click(function () {
    ($(".followButton").text() === "Follow") ? $(".followButton").text("Unfollow") : $(".followButton").text("Follow");
});


//Remove current tile
/*
$(".recycle_icon_wishlist").on("click", function(){
    var currentTileId = $(this).closest('.boxTile').attr('id');
	console.log(currentTileId)
	popupwin('deleteItemConfirmation', 'black_overlay', currentTileId);
  
 })
*/
//var  tileToDelete = currentTileId;
 

	 
function removeFromWishlist(btnConfirm)
 {
	  if (!btnConfirm) {
          return false;
      }

     var sourceId = $(btnConfirm).data('sourceId');
     if (sourceId) {
         var eleToBeDeleted = $('#' + sourceId);
         if (eleToBeDeleted.length) {
             eleToBeDeleted.remove();
         }
     }
	 popupclose('deleteItemConfirmation', 'black_overlay');
  }
 
 
 
function startNewWishlist(){
   popupwin('addtoWishlistContainer', 'black_overlay') ;
   $("#wishlistCategory, #wishListCategorySelect").val("");	 
}
 
var editNo;
function editWishListName(listNo){
	popupwin('editWishlist', 'black_overlay'); 
	$("#editName").val($("#tileHeader" + listNo).text())
	editNo = listNo;
}

function saveWishListName(){
	$("#tileHeader" + editNo).text($("#editName").val()) 
	popupclose('editWishlist', 'black_overlay');
}
  
var wishlistItems = 5;
function createWishlistCategory(){
	wishlistItems++;
    popupclose('addtoWishlistContainer', 'black_overlay');
	
	var wishListValue = $("#wishlistCategory").val();
	var wishlistBucketContent = '<article class="col_4 posR mB40 boxTile" id="wishListCont'+ wishlistItems  +'"><img src="images/wishlist/wishlist_australia.jpg" alt="Hotel" class="brdrWht" /><a href="javascript:void(0)"><div class="wl_innerContr"><h2 class="tC fcGrn tileHeader" id="tileHeader'+ wishlistItems  +'">' + wishListValue + '</h2><span class="fS30 tC dB defaultTxtColor">0</span></div></a><span class="tC dB wishlistIcons"> <span class="share_icon mR10"></span> <span class="edit_icon_wishlist mR10" onClick="editWishListName('+ wishlistItems  +')"></span> <span class="recycle_icon_wishlist"></span> </span></article>'; 
	  
	  $("#wishListTilesContainer").append(wishlistBucketContent);
	  
	  $(".recycle_icon_wishlist").on("click", function(){
		var currentTileId = $(this).closest('.boxTile').attr('id');
			popupwin('deleteItemConfirmation', 'black_overlay', currentTileId);
	 });
}

 $(".recycle_icon_wishlist").on("click", function(){
		var currentTileId = $(this).closest('.boxTile').attr('id');
			popupwin('deleteItemConfirmation', 'black_overlay', currentTileId);
	 });


function editField() {
	var tileHeaderText = $(this).closest('.boxTile').find('.tileHeader').text();
    var editableText = $("<input type='text' class='centeredInput' />");
    editableText.val(tileHeaderText);
	$(this).closest('.boxTile').find('.tileHeader').replaceWith(editableText);
	//editableText.focus();
    editableText.blur(editableTextBlurred);
}

function editableTextBlurred() {
    var html = $(this).val();
    var viewableText = $("<h2 class='fS30 tC fcGrn tileHeader'>");
	viewableText.html(html);
	$(this).replaceWith(viewableText);
    //viewableText.click(editField);	
}

/*$(document).ready(function() {
    $(".edit_icon_wishlist").click(editField);
	
});*/

function view(selTab, selCont, tabs){
	for(i=1; i<=tabs; i++){
		document.getElementById('viewTab'+i).className = '';
		document.getElementById('viewContr'+i).style.display = 'none'
		if(i==1){
			document.getElementById('viewTab'+i).className = 'first';	
		}
		if(tabs == 3 && i == 3){
			document.getElementById('viewTab3').className = 'last';	
		}
		if(tabs == 2 && i == 2){
			document.getElementById('viewTab2').className = 'last';	
		}
	}
		document.getElementById(selTab).className = 'sel';
		if(selTab == 'viewTab1'){
			document.getElementById(selTab).className = 'first sel';
		}
		if(tabs == 3 && selTab == 'viewTab3'){
			document.getElementById("viewTab3").className = 'last sel';	
		}
		if(tabs == 2 && selTab == 'viewTab2'){
			document.getElementById("viewTab2").className = 'last sel';	
		}
		document.getElementById(selCont).style.display = 'block'
}


function viewhotel(selTab, selCont, tabs){
	for(i=1; i<=tabs; i++){
		document.getElementById('viewTab'+i).className = '';
		document.getElementById('viewContr'+i).style.display = 'none'
		if(i==1){
			document.getElementById('viewTab'+i).className = 'first';	
		}
		if(tabs == 3 && i == 3){
			document.getElementById('viewTab3').className = 'last';	
		}
		if(tabs == 2 && i == 2){
			document.getElementById('viewTab2').className = 'last';	
		}
		$('.filterCtr').show();	
			$(".filterOpt").removeClass('col_12');	
	}
		document.getElementById(selTab).className = 'sel';
		if(selTab == 'viewTab1'){
			document.getElementById(selTab).className = 'first sel';
			$('.filterCtr').show();	
			$(".filterOpt").removeClass('col_12');	
		}
		if(tabs == 3 && selTab == 'viewTab3'){
			document.getElementById("viewTab3").className = 'last sel';	
			$('.filterCtr').hide();	
			$(".filterOpt").addClass('col_12');	
			
		}
		if(tabs == 2 && selTab == 'viewTab2'){
			document.getElementById("viewTab2").className = 'last sel';	
			$('.filterCtr').show();	
			$(".filterOpt").removeClass('col_12');	
		}
		document.getElementById(selCont).style.display = 'block'
}




function showHide(divID, imgID){
	
		
		if( document.getElementById('selectContainer1').style.display == "none")
		{
			document.getElementById('addSFlight').style.display = "none";
			document.getElementById('dirImg').src = "images/b2c-images/bin.png";
		document.getElementById('dirImg').style.display = "block";
			document.getElementById('selectContainer1').style.display = "block";
		}
		else{
		document.getElementById('addSFlight').style.display = "block";
			document.getElementById('selectContainer1').style.display = "none";
			document.getElementById('dirImg').src = "images/b2c-images/bin.png";
		document.getElementById('dirImg').style.display = "none";
		
		}
		document.getElementById('selflight1').style.display = 'none';
		document.getElementById('selflightmat1').style.display = 'none';
		document.getElementById('selflight2').style.display = 'none';
		document.getElementById('selflight3').style.display = 'none';
		
		if((document.getElementById('selectContainer1').style.display == 'none') && (document.getElementById('selectContainer2').style.display == 'none'))
	{
		document.getElementById("shopping_cart_panel").style.display = "none";
		document.getElementById("workselect").style.display = "none";
		}
		
		if((document.getElementById('selectContainer1').style.display == 'none') || (document.getElementById('selectContainer2').style.display == 'none'))
		{
		document.getElementById("priceBox").style.display = "block";
		document.getElementById("selectBooking").style.display = "none";
		document.getElementById('compPrice').innerHTML = '18,418';
		}
}
function showHide1(divID, imgID){
	
		
		if( document.getElementById('selectContainer2').style.display == "none")
		{
			document.getElementById('addRFlight').style.display = "none";
			document.getElementById('dirImg2').src = "images/b2c-images/bin.png";
		document.getElementById('dirImg2').style.display = "block";
		
		
		}
		else{
			document.getElementById('addRFlight').style.display = "block";
			document.getElementById('selectContainer2').style.display = "none";
			document.getElementById('dirImg2').src = "images/b2c-images/bin.png";
		document.getElementById('dirImg2').style.display = "none";
		
		}
		
		document.getElementById('selflight4').style.display = 'none';
		document.getElementById('selflight5').style.display = 'none';
		document.getElementById('selflight6').style.display = 'none';
		if((document.getElementById('selectContainer1').style.display == 'none') && (document.getElementById('selectContainer2').style.display == 'none'))
		{
		document.getElementById("shopping_cart_panel").style.display = "none";
		document.getElementById("workselect").style.display = "none";
		}
		if((document.getElementById('selectContainer1').style.display == 'none') || (document.getElementById('selectContainer2').style.display == 'none'))
		{
		document.getElementById("priceBox").style.display = "block";
		document.getElementById("selectBooking").style.display = "none";
		document.getElementById('compPrice').innerHTML = '18,418';
		}
	
}
function close_panel(id)	
{
   $("#"+ id).hide();
if(id == "shopping_cart_panel")  
{ $("#workselect").removeClass('sel');} 
}
function selectFlight(flightNo,path){
	if(path == "arrival"){
		document.getElementById('flightArrival' + flightNo).className = 'srp_flightContr clearfix posR brdrBLitGry';
		document.getElementById('selflight1').style.display = 'block';
		document.getElementById('selflight2').style.display = 'none';
		document.getElementById('selflight3').style.display = 'none';
		document.getElementById('shopping_cart_panel').style.display = 'block';
		
		if(document.getElementById('selectContainer2').innerHTML == ''){
			document.getElementById("addRFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '18,418';
		}
		else{
			document.getElementById("addRFlight").style.display = "none";
			document.getElementById('compPrice').innerHTML = '37,780';
		}
			
		document.getElementById('selectContainer1').innerHTML = '<span class="fL mR10"><img src="images/b2c-images/srp_flight/indigo_sml_logo.jpg" class="mB5" alt="Air India Logo" /><span class="fS12 fcWht dB">Multiple <br>airlines</span></span><span class="clearfix fL mTN5 dB"><span class="clearfix dB"><span class="fcWht fL TrvLocation">Mumbai<br /> 11.30</span><span class="flight_icon_sml fL mTB2LR10"></span><span class="fcWht fL TrvLocation">Delhi<br /> 4.35</span></span><span class="fS11 fcWht dB">3h 5m  | 1 stop </span><span class="fS11 fcWht dB">Reaches 24 Jul, Sun</span></span>';
		document.getElementById("selectContainer1").style.display = "block";
		document.getElementById("addSFlight").style.display = "none";
		document.getElementById("priceBox").style.display = "block";
		document.getElementById('dirImg').style.display = "block";
		
	}
		if(path == "arrival1"){
		document.getElementById('flightArrival' + flightNo).className = 'srp_flightContr clearfix posR brdrBLitGry';
		document.getElementById('selflight2').style.display = 'block';
		document.getElementById('selflight1').style.display = 'none';
		document.getElementById('selflight3').style.display = 'none';
		document.getElementById('shopping_cart_panel').style.display = 'block';
		
		if(document.getElementById('selectContainer2').innerHTML == ''){
			document.getElementById("addRFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '18,418';
		}
		else{
			document.getElementById("addRFlight").style.display = "none";
			document.getElementById('compPrice').innerHTML = '37,780';
		}
			
		document.getElementById('selectContainer1').innerHTML = '<span class="fL mR10"><img src="images/b2c-images/srp_flight/indigo_sml_logo.jpg" class="mB5" alt="Air India Logo" /><span class="fS12 fcWht dB">Multiple <br>airlines</span></span><span class="clearfix fL mTN5 dB"><span class="clearfix dB"><span class="fcWht fL TrvLocation">Mumbai<br /> 11.30</span><span class="flight_icon_sml fL mTB2LR10"></span><span class="fcWht fL TrvLocation">Delhi<br /> 4.35</span></span><span class="fS11 fcWht dB">3h 5m  | 1 stop </span><span class="fS11 fcWht dB">Reaches 24 Jul, Sun</span></span>';
		document.getElementById("selectContainer1").style.display = "block";
		document.getElementById("addSFlight").style.display = "none";
		document.getElementById("priceBox").style.display = "block";
		document.getElementById('dirImg').style.display = "block";
	}
		if(path == "arrival2"){
		document.getElementById('flightArrival' + flightNo).className = 'srp_flightContr clearfix posR brdrBLitGry';
		document.getElementById('selflight3').style.display = 'block';
		document.getElementById('selflight1').style.display = 'none';
		document.getElementById('selflight2').style.display = 'none';
		document.getElementById('shopping_cart_panel').style.display = 'block';
		
		if(document.getElementById('selectContainer2').innerHTML == ''){
			document.getElementById("addRFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '18,418';
		}
		else{
			document.getElementById("addRFlight").style.display = "none";
			document.getElementById('compPrice').innerHTML = '37,780';
		}
			
		document.getElementById('selectContainer1').innerHTML = '<span class="fL mR10"><img src="images/b2c-images/srp_flight/indigo_sml_logo.jpg" class="mB5" alt="Air India Logo" /><span class="fS12 fcWht dB">Multiple <br>airlines</span></span><span class="clearfix fL mTN5 dB"><span class="clearfix dB"><span class="fcWht fL TrvLocation">Mumbai<br /> 11.30</span><span class="flight_icon_sml fL mTB2LR10"></span><span class="fcWht fL TrvLocation">Delhi<br /> 4.35</span></span><span class="fS11 fcWht dB">3h 5m  | 1 stop </span><span class="fS11 fcWht dB">Reaches 24 Jul, Sun</span></span>';
		document.getElementById("selectContainer1").style.display = "block";
		document.getElementById("addSFlight").style.display = "none";
		document.getElementById("priceBox").style.display = "block";
		document.getElementById('dirImg').style.display = "block";
	}
		if(path == "arrivalmat"){
		document.getElementById('flightArrival' + flightNo).className = 'srp_flightContr clearfix posR brdrBLitGry';
		document.getElementById('selflightmat1').style.display = 'block';
		document.getElementById('selflightmat2').style.display = 'none';
		document.getElementById('shopping_cart_panel').style.display = 'block';
		
		if(document.getElementById('selectContainer2').innerHTML == ''){
			document.getElementById("addRFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '18,418';
		}
		else{
			document.getElementById("addRFlight").style.display = "none";
			document.getElementById('compPrice').innerHTML = '37,780';
		}
			
		document.getElementById('selectContainer1').innerHTML = '<span class="fL mR10"><img src="images/b2c-images/srp_flight/indigo_sml_logo.jpg" class="mB5" alt="Air India Logo" /><span class="fS12 fcWht dB">Multiple <br>airlines</span></span><span class="clearfix fL mTN5 dB"><span class="clearfix dB"><span class="fcWht fL TrvLocation">Mumbai<br /> 11.30</span><span class="flight_icon_sml fL mTB2LR10"></span><span class="fcWht fL TrvLocation">Delhi<br /> 4.35</span></span><span class="fS11 fcWht dB">3h 5m  | 1 stop </span><span class="fS11 fcWht dB">Reaches 24 Jul, Sun</span></span>';
		document.getElementById("selectContainer1").style.display = "block";
		document.getElementById("addSFlight").style.display = "none";
		document.getElementById("priceBox").style.display = "block";
		document.getElementById('dirImg').style.display = "block";
	}
	if(path == "return"){
		document.getElementById('flightDeparture' + flightNo).className = 'srp_flightContr clearfix posR brdrBLitGry';
		document.getElementById('selflight4').style.display = 'block';
		document.getElementById('selflight6').style.display = 'none';
		document.getElementById('selflight5').style.display = 'none';
		document.getElementById('shopping_cart_panel').style.display = 'block';
		
		if(document.getElementById('selectContainer1').innerHTML == ""){
			document.getElementById("addSFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '18,418';
		}
		else{
			document.getElementById("addSFlight").style.display = "none";
			document.getElementById('compPrice').innerHTML = '37,780';
		}
			
		document.getElementById('selectContainer2').innerHTML = '<span class="fL mR10"><img src="images/b2c-images/srp_flight/indigo_sml_logo.jpg" class="mB5" alt="Air India Logo" /><span class="fS12 fcWht dB">Multiple <br>airlines</span></span><span class="clearfix fL mTN5 dB"><span class="clearfix dB"><span class="fcWht fL TrvLocation">Mumbai<br /> 11.30</span><span class="flight_icon_sml fL mTB2LR10"></span><span class="fcWht fL TrvLocation">Delhi<br /> 4.35</span></span><span class="fS11 fcWht dB">3h 5m  | 1 stop </span><span class="fS11 fcWht dB">Reaches 24 Jul, Sun</span></span>';
		document.getElementById("selectContainer2").style.display = "block";
		document.getElementById("addRFlight").style.display = "none";
		document.getElementById("priceBox").style.display = "block";
		document.getElementById('dirImg2').style.display = "block";
	}
		if(path == "return1"){
		document.getElementById('flightDeparture' + flightNo).className = 'srp_flightContr clearfix posR brdrBLitGry';
		document.getElementById('selflight5').style.display = 'block';
		document.getElementById('selflight6').style.display = 'none';
		document.getElementById('selflight4').style.display = 'none';
		document.getElementById('shopping_cart_panel').style.display = 'block';
		
		if(document.getElementById('selectContainer1').innerHTML == ""){
			document.getElementById("addSFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '18,418';
		}
		else{
			document.getElementById("addSFlight").style.display = "none";
			document.getElementById('compPrice').innerHTML = '37,780';
		}
			
		document.getElementById('selectContainer2').innerHTML = '<span class="fL mR10"><img src="images/b2c-images/srp_flight/indigo_sml_logo.jpg" class="mB5" alt="Air India Logo" /><span class="fS12 fcWht dB">Multiple <br>airlines</span></span><span class="clearfix fL mTN5 dB"><span class="clearfix dB"><span class="fcWht fL TrvLocation">Mumbai<br /> 11.30</span><span class="flight_icon_sml fL mTB2LR10"></span><span class="fcWht fL TrvLocation">Delhi<br /> 4.35</span></span><span class="fS11 fcWht dB">3h 5m  | 1 stop </span><span class="fS11 fcWht dB">Reaches 24 Jul, Sun</span></span>';
		document.getElementById("selectContainer2").style.display = "block";
		document.getElementById("addRFlight").style.display = "none";
		document.getElementById("priceBox").style.display = "block";
		document.getElementById('dirImg2').style.display = "block";
	}
	if(path == "return2"){
		document.getElementById('flightDeparture' + flightNo).className = 'srp_flightContr clearfix posR brdrBLitGry';
		document.getElementById('selflight6').style.display = 'block';
		document.getElementById('selflight4').style.display = 'none';
		document.getElementById('selflight5').style.display = 'none';
		document.getElementById('shopping_cart_panel').style.display = 'block';
		
		if(document.getElementById('selectContainer1').innerHTML == ""){
			document.getElementById("addSFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '18,418';
		}
		else{
			document.getElementById("addSFlight").style.display = "none";
			document.getElementById('compPrice').innerHTML = '37,780';
		}
			
		document.getElementById('selectContainer2').innerHTML = '<span class="fL mR10"><img src="images/b2c-images/srp_flight/indigo_sml_logo.jpg" class="mB5" alt="Air India Logo" /><span class="fS12 fcWht dB">Multiple <br>airlines</span></span><span class="clearfix fL mTN5 dB"><span class="clearfix dB"><span class="fcWht fL TrvLocation">Mumbai<br /> 11.30</span><span class="flight_icon_sml fL mTB2LR10"></span><span class="fcWht fL TrvLocation">Delhi<br /> 4.35</span></span><span class="fS11 fcWht dB">3h 5m  | 1 stop </span><span class="fS11 fcWht dB">Reaches 24 Jul, Sun</span></span>';
		document.getElementById("selectContainer2").style.display = "block";
		document.getElementById("addRFlight").style.display = "none";
		document.getElementById("priceBox").style.display = "block";
		document.getElementById('dirImg2').style.display = "block";
	}
	$("#cartCount").addClass("sel")
	if((document.getElementById('selectContainer1').innerHTML != '') && (document.getElementById('selectContainer2').innerHTML != ''))
		document.getElementById("selectBooking").style.display = "block";
	else	
		document.getElementById("selectBooking").style.display = "none";
}

function addOneWayFlight(no){
	document.getElementById("depFlightSel").innerHTML = '<span class="fL mR10"><img src="images/b2c-images/srp_flight/indigo_sml_logo.jpg" class="mB5" alt="Air India Logo" /><span class="fS12 fcWht dB">Multiple <br>airlines</span></span><span class="clearfix fL mTN5 dB"><span class="clearfix dB"><span class="fcWht fL TrvLocation">Mumbai<br /> 11.30</span><span class="flight_icon_sml fL mTB2LR10"></span><span class="fcWht fL TrvLocation">Delhi<br /> 4.35</span></span><span class="fS11 fcWht dB">3h 5m  | 1 stop </span><span class="fS11 fcWht dB">Reaches 24 Jul, Sun</span></span> ';
	document.getElementById("priceBox").style.display = "block";
}


if($("#third-carousel").exists()){
	$("#third-carousel li").click(function() {
		$(this).addClass('sel').siblings().removeClass('sel');
	 });
}

if($("#second-carousel").exists()){
	$("#second-carousel li").click(function() {
		$(this).addClass('sel').siblings().removeClass('sel');
	 });
}

var compHolidays = 0;
var compHotels = 0;
var compCruises = 0;
/*function checkThis(hId){
	if(document.getElementById("holiday" + hId).checked == true && addedIds.indexOf(hId) == -1)
	{
		document.getElementById("show_holiday_panel_top").style.display = "block";	
		document.getElementById("searchedResult" + compHolidays).innerHTML = '<div class="fL mR10 mT5 mB5"> <img src="images/common/hotel_thumb.png" alt="Hotel Thumb" /> </div><div class="fL"><div class="fcWht">' + document.getElementById("holidayDest" + hId).innerHTML + '</div><div class="fS11 fcWht">7 Days / 6 Nights</div><div class="fS11 fcWht mB5">Port Blair | Havelock | Neil Island</div><div class="clearfix"><div class="fS22 fW400 fL fcWht"><span class="rupee">Rs</span>86,000</div></div></div>';
		if(compHolidays > 1)
			document.getElementById("compareButton").style.display = "block";
		document.getElementById("compareCount").innerHTML = compHolidays;	
		addedIds[k] = hId;
		compHolidays++;
		k++;
	}
}*/
function checkThis1(hId){
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
		
		a.innerHTML = '<div class="fL mR10 mT5 mB5"> <img src="images/activities/activity1.jpg" alt="Hotel Thumb" /> </div><div class="fL"><div class="fcWht">' + document.getElementById("holidayDest" + hId).innerHTML + '</div><div class="fS11 fcWht">7 Days / 6 Nights</div><div class="fS11 fcWht mB5">Port Blair | Havelock | Neil Island</div><div class="clearfix"><div class="fS22 fW400 fL fcWht"><span class="rupee">Rs</span>86,000</div></div></div>';
		if(compHolidays > 0)
			document.getElementById("compareButton1").style.display = "block";
		compHolidays++;
		document.getElementById("compareCount").innerHTML = compHolidays;	
		$("#compareCount").addClass("sel")
	}
	else{
		document.getElementById("searchedResult" + hId).remove();
		compHolidays--;
		document.getElementById("compareCount").innerHTML = compHolidays;	
		if(compHolidays < 3)
			document.getElementById("compareButton").style.display = "none";
		if(compHolidays == 0){
			document.getElementById("show_holiday_panel_top").style.display = "none";	
			document.getElementById("compareButton").style.display = "none";
			document.getElementById("compareTab").className = "";
			$("#compareCount").removeClass("sel")
		}
	}
}
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
		
		a.innerHTML = '<div class="fL mR10 mT5 mB5"> <img src="images/b2c-images/common/hotel_thumb.png" alt="Hotel Thumb" /> </div><div class="fL"><div class="fcWht">' + document.getElementById("holidayDest" + hId).innerHTML + '</div><div class="fS11 fcWht">7 Days / 6 Nights</div><div class="fS11 fcWht mB5">Port Blair | Havelock | Neil Island</div><div class="clearfix"><div class="fS22 fW400 fL fcWht"><span class="rupee">Rs</span>86,000</div></div></div>';
		if(compHolidays > 1)
			document.getElementById("compareButton").style.display = "block";
		compHolidays++;
		document.getElementById("compareCount").innerHTML = compHolidays;	
		$("#compareCount").addClass("sel")
	}
	else{
		document.getElementById("searchedResult" + hId).remove();
		compHolidays--;
		document.getElementById("compareCount").innerHTML = compHolidays;	
		if(compHolidays < 3)
			document.getElementById("compareButton").style.display = "none";
		if(compHolidays == 0){
			document.getElementById("show_holiday_panel_top").style.display = "none";	
			document.getElementById("compareButton").style.display = "none";
			document.getElementById("compareTab").className = "";
			$("#compareCount").removeClass("sel")
		}
	}
}

function compareHotel(hotelId){
	if(document.getElementById("hotel" + hotelId).checked == true){
		var parent = document.getElementById("search_results");
		document.getElementById("show_hotel_panel_top").style.display = "block";	
		document.getElementById("compareTab").className = "sel";
		$(".footerContactDetail").addClass("activated");
		var a = document.createElement("div");
		a.className = "clearfix col_3 pL0 searchedResult"
		a.id = "searchedResult" + hotelId
		parent.appendChild(a);
		
		a.innerHTML = '<div class="fL mR10 mT5 mB5"> <img src="images/b2c-images/common/hotel_thumb.png" alt="Hotel Thumb" /> </div><div class="fL"><div class="fcWht">' + document.getElementById("hotelName" + hotelId).innerHTML + '</div><div class="fcWht fS11">4 star</div><div class="clearfix"><div class="fS22 fW400 fL fcWht"><span class="rupee">Rs</span>86,000</div></div></div>';
		if(compHotels > 1)
			document.getElementById("compareButton").style.display = "block";
		compHotels++;
		document.getElementById("compareCount").innerHTML = compHotels;	
		$("#compareCount").addClass("sel")
	}
	else{
		document.getElementById("searchedResult" + hotelId).remove();
		compHotels--;
		document.getElementById("compareCount").innerHTML = compHotels;	
		if(compHotels < 3)
			document.getElementById("compareButton").style.display = "none";
		if(compHotels == 0){
			document.getElementById("show_hotel_panel_top").style.display = "none";
			document.getElementById("compareTab").className = "";
			$(".footerContactDetail").removeClass("activated");
			$("#compareCount").removeClass("sel")
		}
	}
	
}


function compareCruise(cruiseId){
	if(document.getElementById("cruise" + cruiseId).checked == true){
		var parent = document.getElementById("search_results");
		document.getElementById("show_cruise_panel_top").style.display = "block";	
		document.getElementById("compareTab").className = "sel";
		$(".footerContactDetail").addClass("activated");
		var a = document.createElement("div");
		a.className = "clearfix col_3 pL0 searchedResult"
		a.id = "searchedResult" + cruiseId
		parent.appendChild(a);
		
		a.innerHTML = '<div class="fL mR10 mT5 mB5"> <img src="images/common/cruise_thumb.jpg" alt="Cruise Thumb" /> </div><div class="fL"><div class="fcWht">' + document.getElementById("cruiseName" + cruiseId).innerHTML + '</div><div class="fcWht fS11">4 star</div><div class="clearfix"><div class="fS22 fW400 fL fcWht"><span class="rupee">Rs</span>86,000</div></div></div>';
		if(compCruises > 1)
			document.getElementById("compareButton").style.display = "block";
		compCruises++;
		document.getElementById("compareCount").innerHTML = compCruises;	
		$("#compareCount").addClass("sel")
	}
	else{
		document.getElementById("searchedResult" + cruiseId).remove();
		compCruises--;
		document.getElementById("compareCount").innerHTML = compCruises;
		if(compCruises < 3)
			document.getElementById("compareButton").style.display = "none";	
		if(compCruises == 0){
			document.getElementById("show_cruise_panel_top").style.display = "none";
			document.getElementById("compareButton").style.display = "none";
			document.getElementById("compareTab").className = "";
			$("#compareCount").removeClass("sel")
		}
	}
	
}

$('.modSrcBtn').on('click', function (e) {
		
		$(".contentPanel").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/common/down-arrow-wht.png');		   
		}else{
			$(this).find('img').attr('src','images/common/right-arrow-wht.png');
		}
	});	
	
	
if( $(".contentPanel").exists() ){	
$(window).resize( function(){
	    if( $(window).width() > 800){
			  $(".contentPanel").hide();
			  $(".modSrcBtn").removeClass('active');
			  $(".modSrcBtn > img").attr("src","images/common/right-arrow-wht.png")
			}
	});	
}

function scrollToTop(){
	$('html, body').animate({
			 scrollTop: '0px'
	 },500);	
}

function scrollToBottom(){
	$('html, body').animate({
			 scrollTop:($(document).height()-700)
	 },500);
}


function resetFields(){
	$("#holidayGoingTo,#hotelName,#hotelLoc").val('');
}


function showtooltip(parentId, tooltipId)
{
   $("#" + tooltipId).toggle();
   
    var parentElementHeight = $("#" + parentId).height();
    var parentElementWidth = $("#" + parentId).width();
	 
   if(parentId == "cardNumber"){
	  var left =  ($("#" + parentId).offset().left) - parentElementWidth + 5 + 'px';
   		var top =  ($("#" + parentId).offset().top) + parentElementHeight + 15 + 'px'; 
   }
   else if(parentId == "cCodeFlight"){
		  var left =  ($("#" + parentId).offset().left) - parentElementWidth + 5 + 'px';
			var top =  ($("#" + parentId).offset().top) + parentElementHeight + 15 + 'px'; 
	   }
   else if(parentId == "hint"){
		  var left =  ($("#" + parentId).offset().left) - parentElementWidth - 100 + 'px';
			var top =  ($("#" + parentId).offset().top) + parentElementHeight + 15 + 'px'; 
	   }
	   else {
		  var left =  ($("#" + parentId).offset().left) - parentElementWidth + 100 + 'px';
			var top =  ($("#" + parentId).offset().top) + parentElementHeight + 25 + 'px';
	   }

   $("#" + tooltipId).css(
      {
	       'left': left,
           'top': top
	  }
   );
   //Give the tooltip a higher z-index incase it is on an overlay
  /* if( $('.black_overlay').is(":visible")){
	     $("#" + tooltipId).css(
			  {
				   'z-index': 1060
			  }
		   );
	   }*/
	   
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
	$("#header2,#header3,#header4,#header5").removeClass('active');
	$("#step1").slideDown('slow');
	$("#step2,#step3,#step4,#step5").slideUp('slow');
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
	$("#header1,#header3,#header4,#header5").removeClass('active');
	$("#step2").slideDown('slow');
	$("#step1,#step3,#step4,#step5").slideUp('slow');
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
	$("#header1,#header2,#header4,#header5").removeClass('active');
	$("#step3").slideDown('slow');
	$("#step2,#step1,#step4,#step5").slideUp('slow');
	$("#header3").siblings("div.heading").removeClass("active noImg");
	$("#header3").next(".accordion .contContainer").slideDown("slow").siblings(".accordion_stepForm .contContainer:visible").slideUp("slow");
	$('html, body').animate({scrollTop: '0px'},500);	
}
function step4(curHrdr, nextHrdr, curContr, nextContr){
	$("#"+curHrdr).removeClass('active noImg');
	$("#"+nextHrdr).addClass('active').removeClass('noImg');
	$("#"+curContr).slideUp('slow');
	$("#"+nextContr).slideDown('slow');
	document.getElementById(curHrdr).onclick = fn_step4;
	$('html, body').animate({scrollTop: '0px'},500);
}

function fn_step4(){
	$("#header4").addClass('active');
	$("#header1,#header2,#header3,#header5").removeClass('active');
	$("#step4").slideDown('slow');
	$("#step2,#step1,#step3,#step5").slideUp('slow');
	$("#header4").siblings("div.heading").removeClass("active noImg");
	$("#header4").next(".accordion .contContainer").slideDown("slow").siblings(".accordion_stepForm .contContainer:visible").slideUp("slow");
	$('html, body').animate({scrollTop: '0px'},500);	
}


function closeComparePanel(id1)
{
	 $("#" + id1).hide();
	 $("#compareTab").removeClass("sel");
	 $(".footerContactDetail").removeClass('activated');
}

function closeShoppingCartPanel(id1)
{
	 $("#" + id1).hide();
	 $("#shoppingCartTab").removeClass("sel");
	 $(".footerContactDetail").removeClass('activated');
}

function closeSelectedPanel(id1)
{
	 $("#" + id1).hide();
	 $("#selectedTab").removeClass("sel");
	 $(".footerContactDetail").removeClass('activated');
}


function populateNames(nameId){
	var title = $("#title" + nameId).html()
	var fname = $("#fName" + nameId).html()
	var lname = $("#lName" + nameId).html()

	$("#title").val(title)
	$("#firstName").val(fname)
	$("#lastName").val(lname)
	$("#travellerList1").hide();
}

function populateCardNumber(cId){
	var x = $("#cardNo" + cId).html()
	$("#card_number").val(x)
	$("#visaListing").hide();
}



if($('#notifyDesc').exists()){
			$(document).scroll(function () {
			var y = $(this).scrollTop();
			if (y > 400) {
				$('#notifyDesc').fadeIn('fast');
			} else {
				$('#notifyDesc').fadeOut('fast');
			}
		});
   }
   
 if($('#addItenary').exists()){
			$(document).scroll(function () {
			var y = $(this).scrollTop();
			if (y > 400) {
				$('#addItenary').fadeIn('fast');
			} else {
				$('#addItenary').fadeOut('fast');
			}
		});
   }  
   
   
   
  $('.diyContr header span.heading').on('click', function (e) {
		 $(this).parent().parent().next('.diy_results').slideToggle();
		 $(this).parent().toggleClass('active');
		$(this).toggleClass('sel');
		 if ($(this).hasClass('sel')) {
			$(this).find('img').attr('src','images/common/expand.png');		   
		}else{
			$(this).find('img').attr('src','images/common/collapse.png');
		}
	}); 
   
   /*Function to edit daywise itenary*/
function editCurrentField(markupId){
	val = document.getElementById("markupVal" + markupId).innerHTML;
	document.getElementById("markup" + markupId).innerHTML = '<input id="markupEdit' + markupId + '" type="text" value="" class="small"><span class="tick_icon mL2" onclick="editFieldValue(' + markupId + ');"></span>';
	
	document.getElementById("markupEdit" + markupId).value = val;
}

function editFieldValue(id){
	document.getElementById("markup" + id).innerHTML = '<h4 class="fL"><span id="markupVal' + id + '">' + document.getElementById("markupEdit" + id).value + '</span></h4><span class="edit_icon mL5" onClick="editCurrentField(' + id + ');"></span>';
}
   
 
    $(".photosLink").click( function(){
	     $("#s1, #s2 , #s3").addClass("pT20").removeClass("pT170");
	  });
 
   
   $(".summaryLink").click( function(){
	     $("#s1").removeClass("pT20").addClass("pT170");
		  $("#s2, #s3").addClass("pT20");
	  });
	  
	 $(".travelPlanLink").click( function(){
		 $("#s2").removeClass("pT20").addClass("pT170");
		 $("#s1, #s3").removeClass("pT170").addClass("pT20");
	   
	  });
	  
	  $(".userReviewsLink").click( function(){
	    $("#s3").removeClass("pT20").addClass("pT170");
		$("#s1, #s2").removeClass("pT170").addClass("pT20");
	  });   
	  
	  
	if($("#s1").exists()){
		  $(window).scroll(function () {

			
			});
		
		}  
	  


	 
/**************  Scroll function for plan page          *****************/

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
	
// Function to  show seleted flight legs in multiway

var slideNumber = 1;

function nextAro() {
	slideNumber++;
	$('.main_carousels').find('.jcarousel-next').trigger('click');
	selectSlide(slideNumber);
	$('.detail_indContr').hide();  //Hide any visible tooltips when clicked next arrow
}
function prevAro() {
	slideNumber--;
	$('.main_carousels').find('.jcarousel-prev').trigger('click');
	selectSlide(slideNumber);
	$('.detail_indContr').hide();  //Hide any visible tooltips when clicked prev arrow
}

function resetClasses() {
	for (var i = 1; i <= 4; i++) {
		$("#fLeg" + i).removeClass("sel");
		$("#multiWayTop" + i).removeClass("sel");
		$("#multiWayMid" + i).removeClass("sel");
		$("#multiWayBtm" + i).removeClass("sel");
		//	document.getElementById('fLeg_port' + i).className = 'wayNum';
		// document.getElementById('multiWayBtm' + i).className = 'wayNum fL';
	}
}

function selectSlide(slideNumber) {
	resetClasses();
	$("#fLeg" + slideNumber).addClass("sel");
	$("#multiWayTop" + slideNumber).addClass("sel");
	$("#multiWayMid" + slideNumber).addClass("sel");
	$("#multiWayBtm" + slideNumber).addClass("sel");
	for(i=1;i<=4;i++){
		$("#flightLegData" + i).slideUp();	
	}
	$("#flightLegData" + slideNumber).slideDown();
}	
var leg = 1;
leg1Added = leg2Added = leg3Added = leg4Added = 0;

function selectMultiFlight(flightLeg){
	document.getElementById('shopping_cart_panel').style.display = 'block';
	$(".footerContactDetail").addClass("activated");
	$("#shoppingCartTab").addClass('sel');
	if(flightLeg == 1){
		document.getElementById("selectFlightLeg1").innerHTML = '<span class="wayNum mR10 fL" id="multiWayBtm1">1</span><div class="fL w72pcnt"> <span class="fL w100pcnt mB5">London- Paris</span> <span class="fL"> <span class="fL"><img src="images/b2c-images/common/carnival_fantasy_logo.jpg" alt="Cruises Logo" class="mR10"><br/><p class="pT0 fs10">Eurostar <br/>9002</p></span> <span class="fL"> 25 Sep 14<br>$ 300 </span><span class="mT5 fR cB"><img src="images/b2c-images/bin.png" alt="delete" onclick="deleteSelect(1)" /></span></span> <div class="  fS30 mTn15 mRn  fR"><b>+</b></div></div>';
		$("#multiWayBtm2,#multiWayBtm3,#multiWayBtm4").removeClass("sel");
		$("#multiWayBtm1").addClass("sel");
		leg1Added = 1;
		document.getElementById("selecteurail1").style.display='none';
		 document.getElementById("selectedover1").style.display='block';
	}
    if(flightLeg == 2){
		document.getElementById("selectFlightLeg2").innerHTML = '<span class="wayNum mR10 fL" id="multiWayBtm2">2</span><div class="fL w72pcnt"> <span class="fL w100pcnt mB5">London- Paris</span> <span class="fL"> <span class="fL"><img src="images/b2c-images/common/carnival_fantasy_logo.jpg" alt="Cruises Logo" class="mR10"><br/><p class="pT0 fs10">Eurostar <br/>9002</p></span> <span class="fL"> 25 Sep 14<br>$300 </span><span class="mT5 fR cB"><img src="images/b2c-images/bin.png" alt="delete" onclick="deleteSelect(2)" /></span> </span><div class="  fS30 mTn15 mRn  fR"><b>+</b></div></div>';
		$("#multiWayBtm1,#multiWayBtm3,#multiWayBtm4").removeClass("sel");
		$("#multiWayBtm2").addClass("sel");
		leg2Added = 1;
		document.getElementById("selecteurail2").style.display='none';
		 document.getElementById("selectedover2").style.display='block';
		
	}
	if(flightLeg == 3){
        document.getElementById("selectFlightLeg3").innerHTML = '<span class="wayNum mR10 fL" id="multiWayBtm3">3</span><div class="fL w72pcnt"> <span class="fL w100pcnt mB5">London- Paris</span> <span class="fL"> <span class="fL"><img src="images/b2c-images/common/carnival_fantasy_logo.jpg" alt="Cruises Logo" class="mR10"><br/><p class="pT0 fs10">Eurostar <br/>9002</p></span> <span class="fL"> 25 Sep 14<br>$ 300 </span><span class="mT5 fR cB"><img src="images/b2c-images/bin.png" alt="delete" onclick="deleteSelect(3)" /></span> </span><div class="  fS30 mTn15 mRn  fR"><b>+</b></div></div> </div>';
		$("#multiWayBtm1,#multiWayBtm2,#multiWayBtm4").removeClass("sel");	
		$("#multiWayBtm3").addClass("sel");
		leg3Added = 1;
		document.getElementById("selecteurail3").style.display='none';
		 document.getElementById("selectedover3").style.display='block';
		
	}
	if(flightLeg == 4){
        document.getElementById("selectFlightLeg4").innerHTML = '<span class="wayNum mR10 fL" id="multiWayBtm4">4</span><div class="fL w72pcnt"> <span class="fL w100pcnt mB5">London- Paris</span> <span class="fL"> <span class="fL"><img src="images/b2c-images/common/carnival_fantasy_logo.jpg" alt="Cruises Logo" class="mR10"><br/><p class="pT0 fs10">Eurostar <br/>9002</p></span> <span class="fL"> 25 Sep 14<br>$ 300 </span><span class="mT5 fR cB"><img src="images/b2c-images/bin.png" alt="delete" onclick="deleteSelect(4)" /></span> </span></div>';
		$("#multiWayBtm1,#multiWayBtm2,#multiWayBtm3").removeClass("sel");
		$("#multiWayBtm4").addClass("sel");
		leg4Added = 1;
		document.getElementById("selecteurail4").style.display='none';
		 document.getElementById("selectedover4").style.display='block';
		

		
	}
	document.getElementById("totalFare").innerHTML = (300*leg);
	if((leg1Added == 1) && (leg2Added == 1) && (leg3Added == 1) && (leg4Added == 1))
		document.getElementById("selectBooking").style.display = "block";
	else
		document.getElementById("selectBooking").style.display = "none";
	leg++;
}
    
function addleg5()
{
$('#slider li:last-child').removeClass('last');
$('#selectFlightLeg5').show();
//$('#test').show();
//$('.nextBtn').css('visibility', 'visible');
//$('.nextBtn').css('opacity', '1');

var content='<li class="first"> <ul class="ft_results"> <li class="flightContrHrdr clearfix"><span id="multiWayMid1" class="wayNum sel mR10 fL">1</span> <span class="fL"><span class="fS18">London – Paris</span> | 24 Jul, Sun | 2 adults</span></li> <li class="flightHeading clearfix"><span class="fL pL20 tL">Sort By</span><span class="deptTime" style="font-size:14px !important;"><a href="javascript:void(0);" style="margin-left:15px;">Departure</a></span><span class="duration"><a href="javascript:void(0);" class="mL30">Duration</a></span><span class="duration"><a href="#" class="mL40">Arrival</a></span><a href="javascript:void(0);"><span class="totalPrice mL15_pcnt" style="font-size:14px !important;">Price<span class="sortAro_up_icon mL5"></span></span></a> </li> <li class="clearfix mB15" id="selecteurail1"> <!-- Listed container --> <span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10" onclick="selectMultiFlight(1)" >Select</a> <span class="fR clearfix dB mT5 mL5"> <span class="share_icon fL mR10"></span></span> </span> <a href="javascript:void(0);" class="dB" id="moreDetailsTrigger1"  onclick="showMoreInfo(\'moreDetailsTrigger1\',\'moreDetailsContainer1\',\'plusMinus1_1\');"><span id="plusMinus1_1">+</span> Details</a></mark> </span></span></li><li class="clearfix mB15 dN"  id="selectedover1"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"><mark class="mR20 bdrRightLightGreen fS12"><select class="smallDropdown"><option>Economy</option><option>Comfort</option><option>Premiere</option></select><span class="mainPrice">$ 4,382</span>Save $ 300</mark><mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class="fR clearfix dB mT5 mL5"> <span class="share_icon fL mR10"></span></span> </span> <a href="javascript:void(0);" class="dB" ><span>+</span> Details</a></mark></span></span></li> <li class="clearfix mB15"> <span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class="fR clearfix dB mT5 mL5"> <span class="share_icon fL mR10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a></mark> </span></span> </li><li class="clearfix mB15"> <span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class="fR clearfix dB mT5 mL5"> <span class="share_icon fL mR10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a></mark> </span></span> </li><li class="clearfix mB15"> <span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class="fR clearfix dB mT5 mL5"> <span class="share_icon fL mR10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a></mark> </span></span> </li><li class="clearfix mB15"> <span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class="fR clearfix dB mT5 mL5"> <span class="share_icon fL mR10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a></mark> </span></span> </li> </ul> </li> <li> <ul class="ft_results"> <li class="flightContrHrdr clearfix"><span id="multiWayMid2" class="wayNum mR10 fL">2</span> <span class="fL"><span class="fS18">Paris – Frankfurt</span> | 24 Jul, Sun | 2 adults</span></li> <li class="flightHeading clearfix"><span class="fL pL20 tL">Sort By</span><span class="deptTime" style="font-size:14px !important;"><a href="javascript:void(0);" style="margin-left:15px;">Departure</a></span><span class="duration"><a href="javascript:void(0);" class="mL30">Duration</a></span><span class="duration"><a href="#" class="mL40">Arrival</a></span><a href="javascript:void(0);"><span class="totalPrice mL15_pcnt" style="font-size:14px !important;">Price<span class="sortAro_up_icon mL5"></span></span></a> </li><li class="clearfix mB15" id="selecteurail2"> <!-- Listed container --> <span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10" onclick="selectMultiFlight(2)">Select</a> <span class=" clearfix dB mT5 mL5"> <span class="share_icon  mL10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a></mark> </span></span> </li><li class="clearfix mB15 dN"  id="selectedover2"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"><mark class="mR20 bdrRightLightGreen fS12"><select class="smallDropdown"><option>Economy</option><option>Comfort</option><option>Premiere</option></select><span class="mainPrice">$ 4,382</span>Save $ 300</mark><mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class="fR clearfix dB mT5 mL5"> <span class="share_icon fL mR10"></span></span> </span> <a href="javascript:void(0);" class="dB" ><span>+</span> Details</a></mark></span></span></li> <li class="clearfix mB15"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class=" clearfix dB mT5 mL5"> <span class="share_icon  mL10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a> </mark> </span></span> </li><li class="clearfix mB15"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a><span class=" clearfix dB mT5 mL5"> <span class="share_icon  mL10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a> </mark> </span></span> </li><li class="clearfix mB15"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class=" clearfix dB mT5 mL5"> <span class="share_icon  mL10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a> </mark> </span></span> </li><li class="clearfix mB15"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class=" clearfix dB mT5 mL5"> <span class="share_icon  mL10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a> </mark> </span></span> </li> </ul> </li> <li> <ul class="ft_results"> <li class="flightContrHrdr clearfix"><span id="multiWayMid3" class="wayNum mR10 fL">3</span> <span class="fL"><span class="fS18">Frankfurt – Zurich</span> | 24 Jul, Sun | 2 adults</span></li><li class="flightHeading clearfix"><span class="fL pL20 tL">Sort By</span><span class="deptTime" style="font-size:14px !important;"><a href="javascript:void(0);" style="margin-left:15px;">Departure</a></span><span class="duration"><a href="javascript:void(0);" class="mL30">Duration</a></span><span class="duration"><a href="#" class="mL40">Arrival</a></span><a href="javascript:void(0);"><span class="totalPrice mL15_pcnt" style="font-size:14px !important;">Price<span class="sortAro_up_icon mL5"></span></span></a> </li> <li class="clearfix mB15" id="selecteurail3"> <span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10" onclick="selectMultiFlight(3)">Select</a><span class=" clearfix dB mT5 mL5"> <span class="share_icon  mL10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a> </mark> </span></span> </li><li class="clearfix mB15 dN"  id="selectedover3"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"><mark class="mR20 bdrRightLightGreen fS12"><select class="smallDropdown"><option>Economy</option><option>Comfort</option><option>Premiere</option></select><span class="mainPrice">$ 4,382</span>Save $ 300</mark><mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class="fR clearfix dB mT5 mL5"> <span class="share_icon fL mR10"></span></span> </span> <a href="javascript:void(0);" class="dB" ><span>+</span> Details</a></mark></span></span></li> <li class="clearfix mB15"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class=" clearfix dB mT5 mL5"> <span class="share_icon  mL10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a> </mark> </span></span> </li> <li class="clearfix mB15"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class=" clearfix dB mT5 mL5"> <span class="share_icon  mL10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a> </mark> </span></span> </li> <li class="clearfix mB15"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a><span class=" clearfix dB mT5 mL5"> <span class="share_icon  mL10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a> </mark> </span></span> </li> <li class="clearfix mB15"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class=" clearfix dB mT5 mL5"> <span class="share_icon  mL10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a> </mark> </span></span> </li> </ul> </li> <li> <ul class="ft_results"> <li class="flightContrHrdr clearfix"><span id="multiWayMid4" class="wayNum mR10 fL">4</span> <span class="fL"><span class="fS18">Frankfurt – Zurich</span> | 24 Jul, Sun | 2 adults</span></li> <li class="flightHeading clearfix"><span class="fL pL20 tL">Sort By</span><span class="deptTime" style="font-size:14px !important;"><a href="javascript:void(0);" style="margin-left:15px;">Departure</a></span><span class="duration"><a href="javascript:void(0);" class="mL30">Duration</a></span><span class="duration"><a href="#" class="mL40">Arrival</a></span><a href="javascript:void(0);"><span class="totalPrice mL15_pcnt" style="font-size:14px !important;">Price<span class="sortAro_up_icon mL5"></span></span></a> </li><li class="clearfix mB15"> <span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10" onclick="selectMultiFlight(4)">Select</a> <span class=" clearfix dB mT5 mL5"> <span class="share_icon  mL10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a> </mark> </span></span> </li> <li class="clearfix mB15" id="selecteurail4"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class=" clearfix dB mT5 mL5"> <span class="share_icon  mL10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a></mark> </span></span> </li><li class="clearfix mB15 dN"  id="selectedover4"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"><mark class="mR20 bdrRightLightGreen fS12"><select class="smallDropdown"><option>Economy</option><option>Comfort</option><option>Premiere</option></select><span class="mainPrice">$ 4,382</span>Save $ 300</mark><mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class="fR clearfix dB mT5 mL5"> <span class="share_icon fL mR10"></span></span> </span> <a href="javascript:void(0);" class="dB" ><span>+</span> Details</a></mark></span></span></li><li class="clearfix mB15"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class=" clearfix dB mT5 mL5"> <span class="share_icon  mL10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a></mark> </span></span> </li> <li class="clearfix mB15"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class="fR clearfix dB mT5 mL5"> <span class="share_icon fL mR10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a></mark> </span></span> </li> <li class="clearfix mB15"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class=" clearfix dB mT5 mL5"> <span class="share_icon  mL10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a></mark> </span></span> </li>  </ul> </li> <li class="last"> <ul class="ft_results"> <li class="flightContrHrdr clearfix"><span id="multiWayMid5" class="wayNum mR10 fL">5</span> <span class="fL"><span class="fS18">London – Paris</span> | 24 Jul, Sun | 2 adults</span></li> <li class="flightHeading clearfix"><span class="fL pL20 tL">Sort By</span><span class="deptTime" style="font-size:14px !important;"><a href="javascript:void(0);" style="margin-left:15px;">Departure</a></span><span class="duration"><a href="javascript:void(0);" class="mL30">Duration</a></span><span class="duration"><a href="#" class="mL40">Arrival</a></span><a href="javascript:void(0);"><span class="totalPrice mL15_pcnt" style="font-size:14px !important;">Price<span class="sortAro_up_icon mL5"></span></span></a> </li><li class="clearfix mB15" id="selecteurail5"> <span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10" onclick="selectMultiFlight(5)">Select</a> <span class="fR clearfix dB mT5 mL5"> <span class="share_icon fL mR10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a></mark> </span></span> </li><li class="clearfix mB15 dN"  id="selectedover5"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"><mark class="mR20 bdrRightLightGreen fS12"><select class="smallDropdown"><option>Economy</option><option>Comfort</option><option>Premiere</option></select><span class="mainPrice">$ 4,382</span>Save $ 300</mark><mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class="fR clearfix dB mT5 mL5"> <span class="share_icon fL mR10"></span></span> </span> <a href="javascript:void(0);" class="dB" ><span>+</span> Details</a></mark></span></span></li><li class="clearfix mB15"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class="fR clearfix dB mT5 mL5"> <span class="share_icon fL mR10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a> </mark> </span></span> </li><li class="clearfix mB15"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class="fR clearfix dB mT5 mL5"> <span class="share_icon fL mR10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a> </mark> </span></span> </li><li class="clearfix mB15"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class="fR clearfix dB mT5 mL5"> <span class="share_icon fL mR10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a> </mark> </span></span> </li><li class="clearfix mB15"><span class="srp_flightContr"><samp class="eurail"><span class="pT40">9002</span></samp><dfn style="width:45%;"> <strong> <small>London St. Pancras</small> 04:00 </strong> <ins class="eurail"> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Paris Paris Nord</small> 04:00 </strong> </dfn> <span class="priceGrnContr clearfix h120"> <mark class="mR20 bdrRightLightGreen fS12"> <select class="smallDropdown"> <option>Economy</option> <option>Comfort</option> <option>Premiere</option> </select> <span class="mainPrice">$ 4,382</span>Save $ 300</mark> <mark> <span class="clearfix dB"> <a href="javascript:void(0);" class="button button-primary fL mB10">Select</a> <span class="fR clearfix dB mT5 mL5"> <span class="share_icon fL mR10"></span></span> </span> <a href="javascript:void(0);" class="dB w100pcnt"><span>+</span> Details</a> </mark> </span></span> </li> </ul> </li>';
 $("#result").html(' <ul id="slider"> </ul> ');
 $("#slider").html(content);
 $("#slider").sudoSlider();
}
$('.shopCardHrdr').on('click', function (e) {
		 $(this).next('.shopCardContr').slideToggle();
		$(this).toggleClass('sel');
		 if ($(this).hasClass('sel')) {
			$(this).find('img').attr('src','images/common/expand.png');		   
		}else{
			$(this).find('img').attr('src','images/common/collapse.png');
		}
	});
	
	
var mins = 10;  //Set the number of minutes you need
    var secs = mins * 60;
    var currentSeconds = 0;
    var currentMinutes = 0;
    if(document.getElementById("timerText"))
		setTimeout('Decrement()',1000);

    function Decrement() {
        currentMinutes = Math.floor(secs / 60);
        currentSeconds = secs % 60;
        if(currentSeconds <= 9) currentSeconds = "0" + currentSeconds;
        secs--;
        document.getElementById("timerText").innerHTML = currentMinutes + ":" + currentSeconds + " Min"; //Set the element id you need the time put into.
        if(secs !== -1) setTimeout('Decrement()',1000);
    }	
	
var roomsAdded = 1;
function showRooms(){
	rooms = document.getElementById("noOfRooms").value;
	if( rooms > 1){
		showHidePanel = 1
		}
	if( (child_Count < 3) && ( !$("#addCar").is(":checked") )    && ( !$("#addFlight1").is(":checked") )  && ( !$("#moreFlightOpton1").hasClass("active") ) && (rooms < 2)   ){
		 showHidePanel = 0
		}	
		
	if(rooms < roomsAdded){
		rRem = roomsAdded - rooms;
		for(i=1;i<=rRem;i++){
			document.getElementById("room" + roomsAdded).innerHTML = '';
			roomsAdded--;	
		}
	}
	else{
		rAdd = rooms - roomsAdded;
		for(r=1;r<=rAdd;r++)
		{
			document.getElementById("room" + (roomsAdded+1)).innerHTML = '<ul class="row mB10 mT15 clearfix"><li class="col_1">&nbsp;</li><li class="col_2 pR0"> <span class="mT30 fL">Room ' + (roomsAdded+1) + ':</span></li><li class="col_2 pL0"><label>Adult</label><div class="adderOuter"> <span  onclick="adultCountDec(\'hAdult_' + (roomsAdded+1) + '\')" class="control addMinControl minusControl cursor fW600">-</span> <span id="hAdult_' + (roomsAdded+1) + '" class="control innerTxtControl">1</span> <span onclick="adultCountInc(\'hAdult_' + (roomsAdded+1) + '\')" class="control addMinControl plusControl cursor fW600">+</span> </div><input type="text" class="w100pcnt dN" maxlength="3" value="1"><span class="fS11 fL w100pcnt">12+ yrs</span></li><li class="col_2 pL0"><label>Children</label><div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600"  onclick="childCountDec(\'hChild_' + (roomsAdded+1) + '\')">-</span> <span class="control innerTxtControl" id="hChild_' + (roomsAdded+1) + '">0</span> <span class="control addMinControl plusControl cursor fW600" onclick="childCountInc(\'hChild_' + (roomsAdded+1) + '\')">+</span> </div><input type="text" class="w100pcnt dN" maxlength="3" value="0"><span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li> </ul><ul class="col_6 pR0 pL0"></ul><ul class="col_6 mB10 pR0 pL0 clearfix"><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_1"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_2"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_3"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_4"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_5"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_6"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_7"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_8"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_9"></li></ul>';
			roomsAdded++;
		}
	}
}

var adult_Count = 1;
var child_Count = 0;

function adultCountInc(id,cntr){
	adult_Count = document.getElementById(id).innerHTML;
	if(adult_Count < 9){
		adult_Count++;
		document.getElementById(id).innerHTML = adult_Count;
	}
}
function adultCountDec(id,cntr){
	adult_Count = document.getElementById(id).innerHTML;
	if(adult_Count > 1){
		adult_Count--;
		document.getElementById(id).innerHTML = adult_Count;
	}
	
}

function childCountInc(id,cntr){
	child_Count = document.getElementById(id).innerHTML;
	if(child_Count < 9){
		child_Count++;
		document.getElementById(id).innerHTML = child_Count;
	}
}
function childCountDec(id,cntr){
	child_Count = document.getElementById(id).innerHTML;
	if(child_Count > 0){
		child_Count--;
		document.getElementById(id).innerHTML = child_Count;
	}
}

function addChild(s){
	document.getElementById("child" + s + "_" + child_Count).innerHTML = '<label>Child ' + child_Count + '</label><select class="w75"><option value="Age">Age</option><option value="1">1</option><option value="2">2</option><option value="3">3</option></select>';
	document.getElementById("child" + s + "_" + child_Count).className = "col_2 mB10 pR0";
	$("select").change(function () {
		$(this).addClass("defaultTextColor");
	});
	
	if( (child_Count >= 3)){
		 showHidePanel = 1
		}
	
	
		
	
}

function remChild(s){
	document.getElementById("child" + s + "_" + (child_Count+1)).innerHTML = '';
	document.getElementById("child" + s + "_" + (child_Count+1)).className = "col_6 pR0";
	if( (child_Count < 3) && ( !$("#addCar").is(":checked") )    && ( !$("#addFlight1").is(":checked") )  && ( !$("#moreFlightOpton1").hasClass("active") )     ){
		 showHidePanel = 0
		}
		
	//check for rooms in decrement
	if( (child_Count < 3) && ($("#noOfRooms").val() > 1) ){
		showHidePanel = 1
		}
	
	
		
}


function showAddedDay(){
	document.getElementById("day6").style.display = "block";
}

function showAddedproduct(){
	document.getElementById("newhotelday1").style.display = "block";
}


function showToggler(){
if( showHidePanel == 1)
	 $(".globalSrcExpContr").show();
else
		$(".globalSrcExpContr").hide(); 
	
}


// Check height of container
/*
 $(".globalSearchBG").click( function(){
	 if( $("#mainSearchWizard").height() > 320){
		   
		}
		else {
			$(".globalSrcExpContr").hide();
	   }
	 });
*/	 

//hide show toggle	 
	$(".globalSrcExpContr").click( function(){
		$("#globalSrcToggle").slideToggle();
		$(".globalSrcShow").toggleClass("sel");
		
		if($(".globalSrcShow").hasClass("sel") ){
			$(".globalSrcShow").text("Hide");
			}
		else{
			$(".globalSrcShow").text("Show");
			}	
		}); 
	 
	 
	 
//On resize dynamically assign widget position	 
$(window).resize(function(e) {
  
  if( $("#primary_navigation").exists()){
   
   var offset_pnav = $('#primary_navigation').offset();
		var height_pnav = $('#primary_navigation').height();
		var top_pnav = offset_pnav.top + height_pnav + "px";
		  $("#globalSrc").css( 
		   {
				'position': 'absolute',
				'top': top_pnav
			});
	
  }
   
});	 


function creatCategory(){
	var categoryValue = $("#createNewCategory").val();	
	
	//$( '<div class="wishlist_List">' + categoryValue + ' </div> ' ).insertBefore($("#createActionCont"));
	$( '<option selected="selected">' + categoryValue + ' </option> ' ).appendTo($("#wishListCategorySelect"));
	
	$("#createNewCategory").val("");
}

var freqFlier = 2
function addFrequentFlierFields()
{
   	if(freqFlier < 6){
		$('#frequentFlierDetail' + freqFlier).show();
		freqFlier++;
	}
	
}


function removeFrequentFlier(i){
	$("#frequentFlierDetail" + i).hide();	
	if(i != 5)
		freqFlier = i++;
		
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
function deleteSelect(id)
{
document.getElementById("selectFlightLeg"+id).innerHTML='<div id="addFlightLeg1" class="addEurail_ActionPnl">Add leg '+id+'</div>';
if(id ==4)
{
leg4Added = 0;
			 document.getElementById("selectedover4").style.display='none';
			 document.getElementById("selecteurail4").style.display='block';
			
}
if(id ==1)
{
leg1Added = 0;
			 document.getElementById("selectedover1").style.display='none';
			  document.getElementById("selecteurail1").style.display='block';
			 
}
if(id ==2)
{
leg2Added = 0;
			 document.getElementById("selectedover2").style.display='none';
			  document.getElementById("selecteurail2").style.display='block';
			
}
if(id ==3)
{
leg3Added = 0;
			 document.getElementById("selectedover3").style.display='none';
			  document.getElementById("selecteurail3").style.display='block';
			  
}
if(id ==5)
{
leg5Added = 0;
			 document.getElementById("selectedover5").style.display='none';
			  document.getElementById("selecteurail5").style.display='block';
			 
}
	leg--;
document.getElementById("totalFare").innerHTML = (-300+300*leg);
	if((leg1Added == 1) && (leg2Added == 1) && (leg3Added == 1) && (leg4Added == 1))
	{
		document.getElementById("selectBooking").style.display = "block";
		
		}
	else
	{
		document.getElementById("selectBooking").style.display = "none";
		}	
	if((leg1Added == 1) || (leg2Added == 1) || (leg3Added == 1) || (leg4Added == 1) || (leg5Added == 1))
	{
		document.getElementById("shopping_cart_panel").style.display = "block";
		}
	else
	{
		document.getElementById('shopping_cart_panel').style.display = "none";
		}
		
}
$(".coupon_dtl").click( function(){
	 var currentCode= $(this).text();
	 $("#cCodeFlight").val(currentCode);
	});
	
	
function setStartingDate(){
	var startDate = $("#startingDate").val();
	$("#startingDateEntry").text(startDate);
	
	}	
	
	/*var leg = 1;
leg1Added = leg2Added = 0;

function selectFlight(flightLeg,row){
	document.getElementById('shopping_cart_panel').style.display = 'block';
	$(".footerContactDetail").addClass("activated");
	$("#shoppingCartTab").addClass('sel');
	if(flightLeg == 1){
		document.getElementById("selectFlightLeg1").innerHTML = '<span class="fL mR10"><img src="images/b2c-images/srp_flight/indigo_sml_logo.jpg" class="mB5" alt="Air India Logo" /><span class="fS12 fcWht dB">Multiple <br>airlines</span></span><span class="clearfix fL mTN5 dB"><span class="clearfix dB"><span class="fcWht fL TrvLocation">Mumbai<br /> 11.30</span><span class="flight_icon_sml fL mTB2LR10"></span><span class="fcWht fL TrvLocation">Delhi<br /> 4.35</span></span><span class="fS11 fcWht dB">3h 5m  | 1 stop </span><span class="fS11 fcWht dB">Reaches next day</span><span class="mT5 fR"><img src="images/b2c-images/bin.png" alt="delete" onclick="deleteSelect2(1)" /></span></span>';
		leg1Added = 1;
		
		 for(i=1;i<4;i++)
	 {if(i== row)
	 document.getElementById("selflight"+row).style.display='block';
	 else
	 document.getElementById("selflight"+i).style.display='none';
	 }
	}
    if(flightLeg == 2){
		document.getElementById("selectFlightLeg2").innerHTML = '<span class="fL mR10"><img src="images/b2c-images/srp_flight/indigo_sml_logo.jpg" class="mB5" alt="Air India Logo" /><span class="fS12 fcWht dB">Multiple <br>airlines</span></span><span class="clearfix fL mTN5 dB"><span class="clearfix dB"><span class="fcWht fL TrvLocation">Mumbai<br /> 11.30</span><span class="flight_icon_sml fL mTB2LR10"></span><span class="fcWht fL TrvLocation">Delhi<br /> 4.35</span></span><span class="fS11 fcWht dB">3h 5m  | 1 stop </span><span class="fS11 fcWht dB">Reaches next day</span><span class="mT5 fR"><img src="images/b2c-images/bin.png" alt="delete" onclick="deleteSelect2(2)" /></span></span>';
		leg2Added = 1;
			document.getElementById("selectBooking").style.display = "block";
		
			 for(i=11;i<14;i++)
	 {if(i== row)
	 document.getElementById("selflight"+row).style.display='block';
	 else
	 document.getElementById("selflight"+i).style.display='none';
	 }
		 
	}
		document.getElementById("totalFare").innerHTML = (300*leg);
	if((leg1Added == 1) && (leg2Added == 1))
		document.getElementById("selectBooking").style.display = "block";
	else
		document.getElementById("selectBooking").style.display = "none";
	leg++;
if((leg1Added == 1) || (leg2Added == 1))
	{
		document.getElementById("workselect").style.display = "table";
		document.getElementById("shopping_cart_panel").style.display = "block";
		}
	else
	{
		document.getElementById("workselect").style.display = "none";
		document.getElementById('shopping_cart_panel').style.display = "none";
		}
	leg++;
 }
 
 
 function deleteSelect2(id)
{
document.getElementById("selectFlightLeg"+id).innerHTML='<div id="addFlightLeg1" class="addFlight_ActionPnl">Add leg '+id+' </div>';
if(id ==1)
{
leg1Added = 0;
 for(i=1;i<4;i++)
			 {
			 document.getElementById("selflight"+i).style.display='none';
			 }
}
if(id ==2)
{
leg2Added = 0;
 for(i=11;i<14;i++)
			 {
			 document.getElementById("selflight"+i).style.display='none';
			 }
}

		leg--;
document.getElementById("totalFare").innerHTML = (-300+300*leg);
	if((leg1Added == 1) && (leg2Added == 1))
	{
		document.getElementById("selectBooking").style.display = "block";
		document.getElementById("priceBox").style.display = "none";
		}
	else
	{
		document.getElementById("selectBooking").style.display = "none";
		document.getElementById("priceBox").style.display = "block";
		}	
	if((leg1Added == 1) || (leg2Added == 1))
	{
		document.getElementById("shopping_cart_panel").style.display = "block";
		}
	else
	{
		document.getElementById('shopping_cart_panel').style.display = "none";
		}
}
*/

function addInfant(s){
	document.getElementById("infant" + s + "_" + infant_Count).innerHTML = '<label>Infant ' + infant_Count + '</label><select class="w75"><option value="Age">Age</option><option value="1">1</option><option value="2">2</option><option value="3">3</option></select>';
	document.getElementById("infant" + s + "_" + infant_Count).className = "col_2 mB10 pR0";
	$("select").change(function () {
		$(this).addClass("defaultTextColor");
	});
	
	if( (infant_Count >= 3)){
		 showHidePanel = 1
		}
	
	
		
	
}

function remInfant(s){
	document.getElementById("infant" + s + "_" + (infant_Count+1)).innerHTML = '';
	document.getElementById("infant" + s + "_" + (infant_Count+1)).className = "col_2 mB10 pR0";
	if( (child_Count < 3) && ( !$("#addCar").is(":checked") )    && ( !$("#addFlight1").is(":checked") )  && ( !$("#moreFlightOpton1").hasClass("active") )     ){
		 showHidePanel = 0
		}
		
	//check for rooms in decrement
	if( (infant_Count < 3) && ($("#noOfRooms").val() > 1) ){
		showHidePanel = 1
		}
	
	
		
}

$(document).ready(function(){
$('.ancillary1').change(function(){
if(this.checked){
$('.ancillaryshow').show();
}
else{
$('.ancillaryshow').hide();
}
});
});

$(document).ready(function(){
$('.ancillary2').change(function(){
if(this.checked){
$('.ancillaryshow2').show();
}
else{
$('.ancillaryshow2').hide();
}
});
});
$(document).ready(function(){
$('.ancillary3').change(function(){
if(this.checked){
$('.ancillaryshow3').show();
}
else{
$('.ancillaryshow3').hide();
}
});
});
$(document).ready(function(){
$('.ancillary4').change(function(){
if(this.checked){
$('.ancillaryshow4').show();
}
else{
$('.ancillaryshow4').hide();
}
});
});
$(document).ready(function(){
$('.ancillary5').change(function(){
if(this.checked){
$('.ancillaryshow5').show();
}
else{
$('.ancillaryshow5').hide();
}
});
});
$(document).ready(function(){
$('.ancillary6').change(function(){
if(this.checked){
$('.ancillaryshow6').show();
}
else{
$('.ancillaryshow6').hide();
}
});
});
$(document).ready(function(){
$('.ancillary7').change(function(){
if(this.checked){
$('.ancillaryshow7').show();
}
else{
$('.ancillaryshow7').hide();
}
});
});
$(document).ready(function(){
$('.ancillary8').change(function(){
if(this.checked){
$('.ancillaryshow8').show();

}
else{
$('.ancillaryshow8').hide();

}
});
});
$(document).ready(function(){
$('.ancillary9').change(function(){
if(this.checked){
$('.ancillaryshow9').show();
}
else{
$('.ancillaryshow9').hide();
}
});
});
$(document).ready(function(){
$('.ancillary10').change(function(){
if(this.checked){
$('.ancillaryshow10').show();
}
else{
$('.ancillaryshow10').hide();
}
});
});
$(document).ready(function(){
$('.ancillary11').change(function(){
if(this.checked){
$('.ancillaryshow11').show();
}
else{
$('.ancillaryshow11').hide();
}
});
});

function check_ancilarry() {
    if(document.getElementById('ancillary2').value == "1") {
        document.getElementById('entry').style.display = 'block';
    } else {
        document.getElementById('entry').style.display = 'none';
    }
}
function addFlyer(id)
{
document.getElementById('addedFlyer'+id).style.display="block";
}

$(document).ready(function(){
$('.baggage_1').change(function(){
if(this.checked){
$('.priceshow_1').show();
}
else{
$('.priceshow_1').hide();
}

});
});

$(document).ready(function () {
	
	$('#childCar1').on('change', function (e) {
		var countcarchild=$('#childCar1').val();
		$('#carchildage1').html('');
		var string='';
		for(i=1;i<=countcarchild;i++)
		{
			string +='<li class="fL pL0 mT10 clearfix"> <label >Child '+i+'</label> <select class="mB10 " id="child_age1" ><option value="null">Age</option><option value="0">0</option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option><option value="9">9</option><option value="10">10</option><option value="11">11</option><option value="12">12</option></select> </li>';
		}
		$('#carchildage1').html(string);

	$('#child_age1').on('change', function (e) {
		var pass_age=$('#child_age1').val();
		if(pass_age == 'null') {
        document.getElementById('check_boosterseat').removeAttribute('checked');
		document.getElementById('check_childseat').removeAttribute('checked');
	} 
    else if(pass_age < '3'){
        document.getElementById('check_boosterseat').setAttribute('checked','');
		$('.priceshow_3').show();
	}
	else {
        document.getElementById('check_childseat').setAttribute('checked','');
		$('.priceshow_2').show();
	}	
    
		});
		
		
		
	});
	
});

	//hide show toggle	 
	$(".globalSrcExpContr5").click( function(){
		$("#globalSrcToggle5").slideToggle();
		$(".globalSrcShow5").toggleClass("sel");
		
		if($(".globalSrcShow5").hasClass("sel") ){
			$(".globalSrcShow5").text("Hide");
			}
		else{
			$(".globalSrcShow5").text("Show");
			}	
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