//To check if the element exists and then run the relevent code
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

jQuery.fn.exists = function(){return this.length>0;}

$(document).ready(function () {
	
	/*
    if( $(".flightsTab").exists()){
		  var parentWidth = $('ul.flightsTab').width();
		  $(window).resize( function (){
			   if($(window).width() > 768){
			   $("#hotelContrAll").width(parentWidth - 20 + "px");
			   }
			  });
		}
	*/
	
	/*
	$("#shortListRooms").on('click',function(){
		$("#shortListNo").html(1)
	
	})
	*/
	
$('body').on('keydown', function( e ) {
    if( e.keyCode == 27 ) {
        $('.popupplay').hide();   
        $('#fade').hide();  
document.body.style.overflow='auto';		
    }
});
	$('.search_icon').on('click', function (e) {
		//$("#searchBox").show();
		$('#searchBox').toggle('slow');
	});	

	$('.addCust').on('click', function (e) {
		$("#custDetail").slideDown("slow");
		$(this).addClass('disLink');
	});	


	$('.saveDetail').on('click', function (e) {
		$("#custDetail").slideUp("slow");
		$(this).addClass('disLink');
	});	

	$('.close_portlet_icon').on('click', function (e) {
		$(this).parent().parent().parent().hide();
	});	

	$('.collapse_portlet_icon').on('click', function (e) {
		$(this).parent().parent().next('.portletInner').slideToggle();
		$(this).toggleClass('exp');
	});	

	$('.secHead').on('click', function (e) {
		$(this).toggleClass('sel');
		$(this).next('.secContr').slideToggle();
	});	

    $('.glSelect').hide();
	$('.selectDropdown').on('click', function (e) {
        e.preventDefault();
		if ($(this).children('.glSelect').is(":hidden")) {
			
            $(this).children('.glSelect').slideDown("fast");
        } else {
            $(this).children('ul.glSelect').slideUp("fast");
        }
    });
	$('ul.glSelect li a').on('click', function (e){
		$('ul.glSelect li').removeClass('sel');
		$(this).parent().parent().siblings().val($(this).data('value'))
		$(this).parent().addClass('sel');
	});


	$("select").change(function () {
		$(this).addClass("defaultTextColor");
	});
	//$("select").change();
	
	 //close autocomplete when user resizes window
	$(window).resize(function() {
		$(".ui-autocomplete, .ui-datepicker").css('display', 'none');
	}); 
	
	
	$('.customerSaveDetail').on('click', function (e) {
		$("#custDetail").slideUp('fast')
		$("#newCustDetail").slideDown('fast')
		$("#addCustContr").hide();
	});
	
	$('.addMore').on('click', function (e) {
		$(".addMoreDetail").slideToggle("slow");
		$('.add_details_icon').toggleClass("active");
	});	
	
	if($().customScrollbar){
	$('.showScroll').on('click', function (e) {
		$(".customScroll").customScrollbar();
	});	
	}
	
	$('.portViewDD').hide();	
	$('.portViewTab').on('click', function (e) {
		
		$(this).next('.portViewDD').slideToggle();
		
		
		$(this).parent().siblings().find(".portViewTab").removeClass("active");
		$(this).parent().siblings().find(".portViewTab img").attr("src","images/collapse_blu.png");
		$(this).parent().siblings().find(".portViewDD").hide();
		
		
		 $(this).toggleClass("active");
		 if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/collapse_blu.png');
		}
        return false;
	});	
	
	if($().customScrollbar){
		$(".customScroll").customScrollbar();
	}
	
	
	//sudo slider for multiway
	if($().sudoSlider){
		 $("#slider").sudoSlider();
		
		}
	//Dynamic table width assignment
	
	   if($(".dataTable").exists()){
		   
		    var container = $(".container").width();
		    $(".stickTable").width(container);
		   
		   $(window).resize(function(){
			    $(".stickTable").width($(".container").width());
			   })
        }	
	
	
	if($(".paymentSummary").exists()){
		var container = $(".container").width();
		$(".stickPayment").width(container);
	   
	   $(window).resize(function(){
			$(".stickPayment").width($(".container").width());
		   })
	}	
	
	
	
	if($(".paymentSummary").exists()){
		var container = $(".container").width();
		$(".stickPayment").width(container);
	   
	   $(window).resize(function(){
			$(".stickPayment").width($(".container").width());
		   })
	}
	
	
		
	
	
	
	
	
	
	/*if($("#paymentSummary").exists()){
	    var stickyRibbonTop = $('#paymentSummary').offset().top;
		
		
		$(window).scroll(function(){
			if( $(window).scrollTop() > stickyRibbonTop ) {
				$('#paymentSummary').addClass('stickyPayment').removeClass('paymentSummaryFixed');
			} else {
				$('#paymentSummary').removeClass('stickyPayment').addClass('paymentSummaryFixed');
			}
		});
		
	   }*/
	
	
	//Dynamic docking table in holiday product details
	if( $('.cost').exists()){
		
		 if( $(window).width() < 1000){
				$(document).scroll(function () {
				var y = $(this).scrollTop();
				if (y > 700){
					$('.cost').fadeIn('fast');
				} else {
					$('.cost').fadeOut('fast');
				}
			
			});
		 }
                 
                 $(document).scroll(function(){
                            if($(window).width() > 800){
				 $("#costPanel768").hide();
                          } 
                             
                         });
		
	
	var tempWidth = $(".contentPanel").width();		
	$(".cost").width(tempWidth);
	
			
		$(window).resize(function() {
			$(".cost").width(tempWidth);
			 if($(window).width() > 1000){
				 $("#costPanel768").hide();
                          }
			 $(document).scroll(function(){
                            if($(window).width() > 800){
				 $("#costPanel768").hide();
                          } 
                             
                         });
			  
		});
			
			
	
		
	}
	
	
	
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
	
	
	if($().datepicker){
	$( "#datepicker1, #datepicker2, #datepicker3, #datepicker4, #datepicker5, #datepicker6, #datepicker7, #datepicker8, #datepicker9, #datepicker10, #datepicker11, #datepicker12" ).datepicker({
		numberOfMonths:2,
		 minDate: 0,
		dateFormat: "dd/mm/yy",
		onSelect: function(dateText){
			  $(this).css("color","#333333");		
			  }
		});
	}
		
	if( $().sortable){	
	$("#right_panel").sortable({
		handle: ".title",
		placeholder: "placeholder"
	});
	$("#right_panel").disableSelection();
	}
    //newly added segment
    $('.toggle_menu').toggleMenu();
	$('.toggle_submenu').toggleSubMenu();
   
	//publish the customer.search event
    $('body').off('customer.search');
    $('body').on('customer.search', function(evt, data) {
        evt.preventDefault();
        evt.stopPropagation();
        if (!data.hasOwnProperty('content')) {
            return false;
        }
        var newCustomerLink = $('#addCustContr').find('a.cusStatus');
        var oldCustomerLink = $('#existingCustContr').find('a.cusStatus');
        if (!data['content'].length) {
            newCustomerLink.show();
            oldCustomerLink.hide();
        } else {
            newCustomerLink.hide();
            oldCustomerLink.show();
        }
    });
    $('body').off('customer.hideforms');
    $('body').on('customer.hideforms', function(evt) {
        evt.preventDefault();
        evt.stopPropagation();
        var newForm = $('#custDetail');
        var oldForm = $('#custDetail_fill');
        if (newForm.is(':visible')) {
           newForm.hide();
        }
        if (oldForm.is(':visible')) {
            oldForm.hide();
        }
    });

    

	function showMultiwayOptions() {
    	flights.addFlight(true);
	}
	
    var availableTags = ['Mumbai, India (BOM)','New Delhi, India (DEL)','Bangalore, India (BLR)','Daman, India  (nearest airport Mumbai, BOM)','Chennai, India (MAA)'];

var availablePackages = ['European Experience','European Glimpse','Magnificient Europe'];

if($().autocomplete){
$( "#owFlightFrom,#owFlightTo,#twflightFrom,#twflightTo,#mwFlight1From,#mwFlight1To,#mwFlight2From,#mwFlight2To,#mwFlight3From,#mwFlight3To,#mwFlight4From,#mwFlight4To,#mwFlight5From,#mwFlight5To,#hotelDestination,#holidayDestination,#cityLocation,#dropLocation,#pickLocation").autocomplete({
		source: availableTags,
		delay: 400
	});

	$( "#oneWayDestination,#oneWaySource" ).autocomplete({
		source: availableTags
	});
	
	$( "#sourceFlight,#destinationFlight, #destination" ).autocomplete({
		source: availableTags
	});
	
	$( "#multiWaySource1,#multiWayDestination1,#multiWaySource2,#multiWayDestination2" ).autocomplete({
		source: availableTags
	});
	
	$( "#holidayDestination" ).autocomplete({
		source: availableTags
	});
	
	$( "#packageName,#packageName_port" ).autocomplete({
		source: availablePackages
	});
	
	$("#hubs").on('change',function(e){
		if(this.value == "Delhi")
			$("#hubPrice1").html("4,40,500")
		if(this.value == "Pondicherry")
			$("#hubPrice1").html("4,20,000")
		if(this.value == "Bangalore")
			$("#hubPrice1").html("4,35,745")
		if(this.value == "Dehradun")
			$("#hubPrice1").html("4,40,000")			
		if(this.value == "Mumbai")
			$("#hubPrice1").html("4,37,796")	
	});
	
	
	
	$('.git_type').on('click', function (e) {
		$('.listingDDContrProj').hide();
		$(this).parent().children('.listingDDContrProj').show();
	});	
	
	$('.close').on('click', function (e) {
		$(this).parent().hide();
	});	
}

	$("#hotelDestination").blur(function(){
	  if(($("#hotelDestination").val() == "")){
		  $("input#hotelLocation").attr('disabled','disabled').val("");
		  }
	})

	var availableTagsHotel = ['ITC Maurya Sheraton','Taj Mahal Palace','Oberoi hotels','Taj Lake Palace','Wildflower Hall','Leela Palace Kempinski'];
	if($().autocomplete){
	$( "#hotelLocation, #hotel, #hotel_port" ).autocomplete({
		source: availableTagsHotel
	});
	}

	/*var availableCustomers = ['9867484567    Amit Trivedi    amit@gmail.com', '9867485050    Vikram Pandit    vikpan@gmail.com'];
	if($().autocomplete){
	$("#custId").autocomplete({
		source: availableCustomers,
		delay: 400,
		response: function(event, ui) {
			$('body').trigger('customer.search', [ui]);
		},
		search: function(evt, ui) {
			$('body').trigger('customer.hideforms');
		},
		select: function (event, ui) {
			showCustomerDetails('existing');
		}
	});
	
	}*/
	var availableCustomers = ['9867484567    Amit Trivedi    amit@gmail.com    B2C', '9867485050    Vikram Pandit    vikpan@gmail.com    B2C'];
	if($().autocomplete){
	$("#custId1").autocomplete({
		source: availableCustomers,
		delay: 400,
		response: function(event, ui) {
			$('body').trigger('customer.search', [ui]);
		},
		search: function(evt, ui) {
			$('body').trigger('customer.hideforms');
		},
		select: function (event, ui) {
			showCustomerDetails('existing');
		}
	});
	
	}
	
	$('.minusCir_icon').on('click', function (e) {
		$(this).toggleClass("hide");
		 if ($(this).hasClass('hide')) {
			$('.markupContr').hide();   
			$('#markupBtnText').text('Show');   
		}else{
			$('.markupContr').show();   
			$('#markupBtnText').text('Hide');  
		}
	});	
	
	$('.minusCir_icon_portrait').on('click', function (e) {
		$(this).toggleClass("hide");
		
		 if ($(this).hasClass("hide")) {
			$('.markupContr_portrait').hide();   
				$('#markupBtnTextport').text('Show');   
		}else{
			$('.markupContr_portrait').show(); 
			$('#markupBtnTextport').text('Hide');  			
		}
	});
	$('#netfare_port').on('click', function (e) {
		
		 if ($(this).is(':checked')) {
			$('.commission').show();   
			
		}else{
			$('.commission').hide();   
		}
	});	
	
	$('#netfare').on('click', function (e) {
		
		
		 if  ($(this).is(':checked')) {
			$('.commission').show();   
		}else{
			$('.commission').hide();  			
		}
	});
	
	
	$('aside section label.heading').on('click', function (e) {
		$(this).toggleClass('sel');
		$(this).next('aside section div.srcOptions').slideToggle();
	});
	
	$('.diyContr header strong.heading').on('click', function (e) {
		 $(this).parent().next('.diy_results').slideToggle();
		$(this).toggleClass('sel');
		 if ($(this).hasClass('sel')) {
			$(this).find('img').attr('src','images/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/collapse_blu.png');
		}
	});
	
	$('.selFlight').on('click', function (e) {
		$(this).parents('li').find('.flightDStricture').slideToggle();
		$(this).toggleClass("active");
		 if ($(this).hasClass('active')) {
			$(this).text('- Details');		   
		}else{
			$(this).text('+ Details');
		}
	});
	
	$('.selHotel').on('click', function (e) {
		$('.hotelExStructure').slideToggle();
		$(this).toggleClass("active");
		 if ($(this).hasClass('active')) {
			$(this).text('- Details');		   
		}else{
			$(this).text('+ Details');
		}
	});
	
	$('.selRoom').on('click', function (e) {
		$(this).parents('li').find('.hotelDetailContr').slideToggle();
	});
	
	$('.selFlight_multi').on('click', function (e) {
		$(this).closest('li').find('.flightDStricture').slideToggle();
		$(this).toggleClass("active");
		 if ($(this).hasClass('active')) {
			$(this).text('- Details');		   
		}else{
			$(this).text('+ Details');
		}
	});	
	
	if($().jcarousel){
		$('#mycarousel').jcarousel({
		auto: 5,
		start: 1,
		scroll:1,
		wrap: 'last',
		initCallback: mycarousel_initCallback
		});
		
		$('#mycarousel1, #mycarousel2, #mycarousel3,#mycarouselbstair').jcarousel({
            scroll: 1
        });
		  $('#hotel_detail_carousel').jcarousel({
			start: 1,
			scroll:1,
		  });
		  $('#template_carousel').jcarousel({
			start: 1,
			scroll:1,
		  });
		  
		   $('#hotel_deals_carousel').jcarousel({
			start: 1,
			scroll:1,
	    	});
		
		
	}
	
	if($().jcarousel){
		$('#mycarousel_1').jcarousel({
		auto: 5,
		start: 1,
		scroll:1,
		wrap: 'last',
		initCallback: mycarousel_initCallback
		});
		
		$('#mycarousel1, #mycarousel2, #mycarousel3,#mycarouselbstair').jcarousel({
            scroll: 1
        });
		  $('#hotel_detail_carousel').jcarousel({
			start: 1,
			scroll:1,
		  });
		  $('#template_carousel').jcarousel({
			start: 1,
			scroll:1,
		  });
		  
		   $('#hotel_deals_carousel_1').jcarousel({
			start: 1,
			scroll:1,
	    	});
		
		
	}
	
	if($().multipleSelect){
	   
	   $("#multipleBusType").multipleSelect({
	   placeholder: "Select Bus Type",
	   selectAllText : "All",
	   selectAllDelimiter: ["",""]
            
        });
	
	}
	
	if($().slider){
		$( "#slider-range" ).slider({
			range: true,
			min: 0,
			max: 100000,
			values: [ 0, 30000 ],
			slide: function( event, ui ) {
				$( "#amount" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
			}
		});
		$( "#amount" ).val( $( "#slider-range" ).slider( "values", 0 ) +" - " + $( "#slider-range" ).slider( "values", 1 ) );
	
		
		$( "#slider-range-port" ).slider({
			range: true,
			min: 0,
			max: 100000,
			values: [ 0, 30000 ],
			slide: function( event, ui ) {
				$( "#amount-port" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
			}
		});
		
		
		$( "#amount-port" ).val( $( "#slider-range-port" ).slider( "values", 0 ) +" - " + $( "#slider-range-port" ).slider( "values", 1 ) );
		
		$( "#slider-range-port5" ).slider({
			range: true,
			min: 0,
			max: 100000,
			values: [ 0, 30000 ],
			slide: function( event, ui ) {
				$( "#amount-port5" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
			}
		});
		
		
		$( "#amount-port5" ).val( $( "#slider-range-port5" ).slider( "values", 0 ) +" - " + $( "#slider-range-port5" ).slider( "values", 1 ) );
		
		$( "#slider-range-port3" ).slider({
			range: true,
			min: 0,
			max: 100000,
			values: [ 0, 30000 ],
			slide: function( event, ui ) {
				$( "#amount-port3" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
			}
		});
		
		
		$( "#amount-port3" ).val( $( "#slider-range-port3" ).slider( "values", 0 ) +" - " + $( "#slider-range-port3" ).slider( "values", 1 ) );
		
		
		$( "#slider-depature" ).slider({
			range: true,
			min: 0,
			max: 24,
			values: [ 4, 12 ],
			slide: function( event, ui ) {
				$( "#depature" ).val(ui.values[ 0 ] + ".00 - " + ui.values[ 1 ]+".00" );
			}
		});
		$( "#depature" ).val( $( "#slider-depature" ).slider( "values", 0 ) +".00 - " + $( "#slider-depature" ).slider( "values", 1 )+".00" );
		
		$( "#slider-arrive3" ).slider({
			range: true,
			min: 0,
			max: 24,
			values: [ 4, 12 ],
			slide: function( event, ui ) {
				$( "#arrive3" ).val(ui.values[ 0 ] + ".00 - " + ui.values[ 1 ]+".00" );
			}
		});
		$( "#arrive3" ).val( $( "#slider-arrive3" ).slider( "values", 0 ) +".00 - " + $( "#slider-arrive3" ).slider( "values", 1 )+".00" );
		
		
		$( "#slider-depature-port" ).slider({
			range: true,
			min: 0,
			max: 24,
			values: [ 4, 12 ],
			slide: function( event, ui ) {
				$( "#depature-port" ).val(ui.values[ 0 ] + ".00 - " + ui.values[ 1 ]+".00" );
			}
		});
		$( "#depature-port" ).val( $( "#slider-depature-port" ).slider( "values", 0 ) +".00 - " + $( "#slider-depature-port" ).slider( "values", 1 )+".00" );

		$( "#slider-depature-port2" ).slider({
			range: true,
			min: 0,
			max: 24,
			values: [ 4, 12 ],
			slide: function( event, ui ) {
				$( "#depature-port2" ).val(ui.values[ 0 ] + ".00 - " + ui.values[ 1 ]+".00" );
			}
		});
		$( "#depature-port2" ).val( $( "#slider-depature-port2" ).slider( "values", 0 ) +".00 - " + $( "#slider-depature-port2" ).slider( "values", 1 )+".00" );

          $( "#slider-return" ).slider({
			range: true,
			min: 0,
			max: 24,
			values: [ 8, 16 ],
			slide: function( event, ui ) {
			$( "#return" ).val(ui.values[ 0 ] + ".00 - " + ui.values[ 1 ]+".00" );
			}
			});
			$( "#return" ).val( $( "#slider-return" ).slider( "values", 0 ) +".00 - " + $( "#slider-return" ).slider( "values", 1 )+".00" );

		
			$( "#slider-return-port" ).slider({
				range: true,
				min: 0,
				max: 24,
				values: [ 8, 16 ],
				slide: function( event, ui ) {
				$( "#return-port" ).val(ui.values[ 0 ] + ".00 - " + ui.values[ 1 ]+".00" );
			}
			});
			$( "#return-port" ).val( $( "#slider-return-port" ).slider( "values", 0 ) +".00 - " + $( "#slider-return-port" ).slider( "values", 1 )+".00" );

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
  
	}
	
	$('#oneWayOnward').on('click', function (e) {
		$("#oneWayOnwardFare").show();
		$("#oneWayReturnFare").hide();
		$(this).addClass("sel");
		$("#oneWayReturn").removeClass("sel");
	});
	
	$('#oneWayReturn').on('click', function (e) {
		$("#oneWayOnwardFare").hide();
		$("#oneWayReturnFare").show();
		$(this).addClass("sel");
		$("#oneWayOnward").removeClass("sel");
	});
	
	$('#multiwayLeg1').on('click', function (e) {
		$("#mwLeg1Details").show();
		$("#mwLeg2Details,#mwLeg3Details,#mwLeg4Details").hide();
		$(this).addClass("sel");
		$("#multiwayLeg2,#multiwayLeg3,#multiwayLeg4").removeClass("sel");
	});
	$('#multiwayLeg2').on('click', function (e) {
		$("#mwLeg2Details").show();
		$("#mwLeg1Details,#mwLeg3Details,#mwLeg4Details").hide();
		$(this).addClass("sel");
		$("#multiwayLeg1,#multiwayLeg3,#multiwayLeg4").removeClass("sel");
	});
	$('#multiwayLeg3').on('click', function (e) {
		$("#mwLeg3Details").show();
		$("#mwLeg1Details,#mwLeg2Details,#mwLeg4Details").hide();
		$(this).addClass("sel");
		$("#multiwayLeg1,#multiwayLeg2,#multiwayLeg4").removeClass("sel");
	});
	$('#multiwayLeg4').on('click', function (e) {
		$("#mwLeg4Details").show();
		$("#mwLeg1Details,#mwLeg2Details,#mwLeg3Details").hide();
		$(this).addClass("sel");
		$("#multiwayLeg1,#multiwayLeg2,#multiwayLeg3").removeClass("sel");
	});	
	
	$('#airlineTab1').on('click', function (e) {
		$("#airlineTabResults1").show();
		$("#airlineTabResults2,#airlineTabResults3,#airlineTabResults4,#airlineTabResults5,#airlineTabResults6,#airlineTabResults7").hide();
		$(this).addClass("sel");
		$("#airlineTab2,#airlineTab3,#airlineTab4,#airlineTab5,#airlineTab6,#airlineTab7").removeClass("sel");
	});
	$('#airlineTab2').on('click', function (e) {
		$("#airlineTabResults2").show();
		$("#airlineTabResults1,#airlineTabResults3,#airlineTabResults4,#airlineTabResults5,#airlineTabResults6,#airlineTabResults7").hide();
		$(this).addClass("sel");
		$("#airlineTab1,#airlineTab3,#airlineTab4,#airlineTab5,#airlineTab6,#airlineTab7").removeClass("sel");
	});
	$('#airlineTab3').on('click', function (e) {
		$("#airlineTabResults3").show();
		$("#airlineTabResults1,#airlineTabResults2,#airlineTabResults4,#airlineTabResults5,#airlineTabResults6,#airlineTabResults7").hide();
		$(this).addClass("sel");
		$("#airlineTab1,#airlineTab2,#airlineTab4,#airlineTab5,#airlineTab6,#airlineTab7").removeClass("sel");
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
		$("#airlineTabResults1,#airlineTabResults2,#airlineTabResults3,#airlineTabResults5,#airlineTabResults4,#airlineTabResults7").hide();
		$(this).addClass("sel");
		$("#airlineTab1,#airlineTab2,#airlineTab3,#airlineTab5,#airlineTab4,#airlineTab7").removeClass("sel");
	});
	
	$('#airlineTab7').on('click', function (e) {
		$("#airlineTabResults7").show();
		$("#airlineTabResults1,#airlineTabResults2,#airlineTabResults3,#airlineTabResults5,#airlineTabResults6,#airlineTabResults4").hide();
		$(this).addClass("sel");
		$("#airlineTab1,#airlineTab2,#airlineTab3,#airlineTab4,#airlineTab6,#airlineTab7").removeClass("sel");
	});
	
	//grey container header expend collapse
	$('.srcHrdr').on('click', function (e) {
		 $(this).next('.srcContr').slideToggle();
		 $(this).toggleClass("active");
		 if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/collapse_blu.png');
		}
	});	
	
	
	$('.holidayHrdr').on('click', function (e) {
		 $(this).next('.holidayDetailContr').slideToggle();
		 $(this).toggleClass("active");
		 if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/collapse_blu.png');
		}
	});	
	
	
	
	$("#hotelsShortlist,#holidaysShortlist").on('click','.remCF',function(){
        $(this).parent().parent().remove();
		var count = $("#slHolidayCount").html();
		$("#slHolidayCount").html(count-1)
		var count1 = $("#slHotelCount").html();
		$("#slHotelCount").html(count1-1)
		if((count-1) == 0){
			$("#noSLItems").show();
			$("#shortListItems .tertiaryBtn_sml").hide();
		}
		if((count1-1) == 0){
			$("#noSLHItems").show();
			$("#shortListHotels .tertiaryBtn_sml").hide();
		}
    });
	
	$(".clearSL").click( function(){
		$("#holidaysShortlist tr").remove();
		$("#slHolidayCount").html(0);
		$("#shortListItems .tertiaryBtn_sml").hide();
		$("#noSLItems").show();
	});
	
	$(".clearSLH").click( function(){
		$("#hotelsShortlist tr").remove();
		$("#slHotelCount").html(0);
		$("#shortListHotels .tertiaryBtn_sml").hide();
		$("#noSLHItems").show();
	})
	
	$('.expPnl').on('click', function (e) {
		$(this).parent().next('.expContr').slideToggle();
		$(this).toggleClass("active");
		 if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/collapse_blu.png');
		}
	});
	
	
	$('.parentPanel').on('click', function (e) {
		$(this).next('.childContr').slideToggle();
		$(this).toggleClass("active");
		 if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/collapse_blu.png');
		}
	});
	
	
	$('.ppContr').hide();
	$('.ppContr').eq(0).show();
	$('.ppHrdr').on('click', function (e) {
		 $(this).next('.ppContr').slideToggle();
		 $(this).toggleClass("active");
		 if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/collapse_blu.png');
		}
	});	

	$('.secTab li').on('click', function (e) {
		$(".customScroll").customScrollbar();
	});
	
	$('.ppHrdr').on('click', function (e) {
		$(".customScroll").customScrollbar();
	});	

	var $items = $('ul.srpOfferTab>li');
		$items.click(function() {
			$items.removeClass('sel');
			$(this).addClass('sel');
		
			var index = $items.index($(this));
			$('.diyContrs .diyContr').hide().eq(index).show();
		}).eq(0).click();


	/* Hotel product landing page */
	var hotelsDestinationList = ['Mumbai, India (BOM)','New Delhi, India (DEL)','Bangalore, India (BLR)','Daman, India  (nearest airport Mumbai, BOM)','Chennai, India (MAA)'];
	if($().autocomplete){
		$("#hotel_destination").autocomplete({
			source: hotelsDestinationList,
			delay: 400,
			select: function (event, ui) {
				showFilters('destination',ui.item.value);
			}
		});
	}
	
	var hotelsNamesList = ['ITC Maurya Sheraton','Taj Mahal Palace','Oberoi hotels','Taj Lake Palace','Wildflower Hall','Leela Palace Kempinski'];
	if($().autocomplete){
		$("#hotel_name").autocomplete({
			source: hotelsNamesList,
			delay: 400,
			select: function (event, ui) {
				showFilters('hotel',ui.item.value);
			}
		});
	}
});

function offer(tab, contr){
	for(i=1; i<=2; i++){
		document.getElementById('offerTab'+i).className = '';
		document.getElementById('offerContr'+i).style.display = 'none';
		if(i==2){
			document.getElementById('offerTab'+i).className = 'last';	
		}
	}
	document.getElementById(tab).className = 'sel';
	document.getElementById(contr).style.display = 'block'
}

function hotelOfferTab(tab, contr){
	for(i=3; i<=4; i++){
		document.getElementById('offerTab'+i).className = '';
		document.getElementById('offerContr'+i).style.display = 'none';
		if(i==4){
			document.getElementById('offerTab'+i).className = 'last';	
		}
	}
	document.getElementById(tab).className = 'sel';
	document.getElementById(contr).style.display = 'block'
}

function offersrc(tab, contr){
	for(i=1; i<=4; i++){
		document.getElementById('offerSrcTab'+i).className = '';
		document.getElementById('offerSrcContr'+i).style.display = 'none';
		if(i==1){
			document.getElementById('offerSrcTab1').className = 'first';	
		}
		if(i==4){
			document.getElementById('offerSrcTab4').className = 'last';	
		}
	}
	if(tab == "offerSrcTab4")
		document.getElementById(tab).className = 'last sel';
	else if(tab == "offerSrcTab1")
		document.getElementById(tab).className = 'first sel';	
	else
		document.getElementById(tab).className = 'sel';		
	document.getElementById(contr).style.display = 'block'
}

function notice(tab, contr){
	for(i=1; i<=2; i++){
		document.getElementById('noticeTab'+i).className = 'lftTxt';
		document.getElementById('noticeContr'+i).style.display = 'none';
		if(i==2){
			document.getElementById('noticeTab'+i).className = 'last lftTxt';	
		}
	}
	document.getElementById(tab).className = 'sel lftTxt';
	document.getElementById(contr).style.display = 'block'
}

function globalSrc(tab, contr){
	for(i=1; i<=5; i++){
		document.getElementById('globalSrcTab'+i).className = '';
		document.getElementById('globalSrcContr'+i).style.display = 'none';
		if(i==5){
			document.getElementById('globalSrcTab'+i).className = 'last';	
		}
	}
	document.getElementById(tab).className = 'sel';
	document.getElementById(contr).style.display = 'block'
}

function globalSrF(tab, contr){
	for(i=1; i<=3; i++){
		document.getElementById('globalSrcFTab'+i).className = '';
		document.getElementById('globalSrcFContr'+i).style.display = 'none';
		if(i==1){
			document.getElementById('globalSrcTab'+i).className = 'first';	
		}
		if(i==3){
			document.getElementById('globalSrcTab'+i).className = 'last';	
		}
	}
	document.getElementById(tab).className = 'sel';
	document.getElementById(contr).style.display = 'block'
}



function moreOption(moreTab, moreContr, clsNm, evt){
    var cont = $('#' + moreTab);
	if(document.getElementById(moreContr).style.display == 'block'){
		document.getElementById(moreContr).style.display = 'none';
		cont.removeClass('tab_selected sel');
	
	}
	else{
		document.getElementById(moreContr).style.display = 'block';
        cont.addClass('tab_selected sel');
		  if($("#moreOpt").exists()){
				if($("#moreOpt").is(":visible")){
				  $("#moreOpt").hide();
				 $("#moreNav").removeClass("sel");
			}
		}
		//document.getElementById(moreTab).className = clsNm + ' sel'
	}
    if (evt) {
        evt.returnValue = false;
        evt.cancelBubble = true;
    }
}


var mouse_is_inside = false;

$(document).ready(function()
{
$('body').bind('click', function(evt) {
		$('#productNav, #moreNav, #reportNav, #settingNav, #dotproductNav,#addNav').removeClass('sel');
		$('#productOpt, #moreOpt, #reportOpt, #settingOpt,#addOpt').hide();
		
		/*
		if( $('.hotelMenu').exists()){
			$('#hotelTab1, #hotelTab2, #hotelTab3, #hotelTab4, #hotelTab5').removeClass('sel');
			$('#hotelContr1, #hotelContr2, #hotelContr3, #hotelContr5').hide();
		}
		*/
		
		//reset moreOptions (+)
		var moreCont = $('ul#moreOpt');
		if (moreCont.length) {
			moreCont.removeClass('show_options');
		}
		//ellipsis navigation
		var ellipsisMenu = $('#dotproductNav');
	
		if ((ellipsisMenu.length && ellipsisMenu.hasClass('tab_selected'))) {
			ellipsisMenu.removeClass('tab_selected');
			ellipsisMenu.find('#dotprimaryNav').hide();
		}

   });
   
   
    $("body").mousedown(function(evt){
        evt.stopPropagation();
    });
	
	
});


function groupBooking(){
	if(document.getElementById('GroupBooking').checked == true){
		document.getElementById('sABooking').style.display = 'none'
		document.getElementById('sCBooking').style.display = 'none'
		document.getElementById('sIBooking').style.display = 'none'
		document.getElementById('gABooking').style.display = 'block'
		document.getElementById('gCBooking').style.display = 'block'
		document.getElementById('gIBooking').style.display = 'block'
		document.getElementById('gBookingontr').style.display = 'block'
		document.getElementById('srcBtn').innerHTML = 'Send request'
	}
	else{
		document.getElementById('sABooking').style.display = 'block'
		document.getElementById('sCBooking').style.display = 'block'
		document.getElementById('sIBooking').style.display = 'block'
		document.getElementById('gABooking').style.display = 'none'
		document.getElementById('gCBooking').style.display = 'none'
		document.getElementById('gIBooking').style.display = 'none'
		document.getElementById('gBookingontr').style.display = 'none'
		document.getElementById('srcBtn').innerHTML = 'Search'
	}
}


function findPos(obj) {
	
	var curleft = 0; var curtop = 0;
	i=0;
	if (obj.offsetParent)
	{
	do {
			curleft += obj.offsetLeft;
			curtop += obj.offsetTop;
		} while (obj = obj.offsetParent);
	}
	return [curleft,curtop];
}



function showpop(obj,lyr)
{ 


	var coors = findPos(obj);
	
   var x = document.getElementById(lyr);

	
	if (lyr == "fareDetails" || lyr == "fareDetailsWithPrice" )
	{		
		if(x.style.display == "block"){
			x.style.display = "none";
			return;	
		}
	}
	
	
	if (lyr == "srpDetailContr")
	{		
		x.style.top = coors[1] + 14 + 'px';	
		x.style.left = coors[0] + 0 + 'px';
	}
	if (lyr == "fareDetails")
	{		
		x.style.top = coors[1] + 25 + 'px';	
		x.style.left = coors[0] + -60 + 'px';
	}
	if (lyr == "fareDetailsWithPrice")
	{		
		x.style.top = coors[1] + 25 + 'px';	
		x.style.left = coors[0] + -60 + 'px';
	}
	
	if (lyr == "fareDetails3Options")
	{		
		x.style.top = coors[1] + 25 + 'px';	
		x.style.left = coors[0] + -60 + 'px';
	}
	if (lyr == "srpHotelInfoContr")
	{		
		x.style.top = coors[1] + 14 + 'px';	
		x.style.left = coors[0] + -165 + 'px';
	}
	if (lyr == "noteContr")
	{		
		$('#noteContent').val('');
		$('#charCount').html(0);
		x.style.top = coors[1] + 34 + 'px';	
		x.style.left = coors[0] + -180 + 'px';
	}
	if (lyr == "hotelRoomDtl")
	{		
		x.style.top = coors[1] + 30 + 'px';	
		x.style.left = coors[0] + 0 + 'px';
	}
	if (lyr == "ageInsuranceDtl")
	{		
		x.style.top = coors[1] + 34 + 'px';	
		x.style.left = coors[0] + -180 + 'px';
	}
	x.style.display = "block";


}

/*
function showpop(obj,lyr)
{
 var coors = findPos(obj);
 var x = document.getElementById(lyr);
 
  $('#' + lyr).position({
            of: $(obj),
            my: 'center top',
            at: 'center center'
        });
 
 
 if (lyr == "srpDetailContr")
 {  
  x.style.top = coors[1] + 14 + 'px';
  x.style.left = coors[0] + 0 + 'px';
 }
 if (lyr == "srpInfoContr")
 {  
  //x.style.top = coors[1] + 14 + 'px';
  //x.style.left = coors[0] + -110 + 'px';
       
 }
 
 
 if (lyr == "srpHotelInfoContr")
 {  
  x.style.top = coors[1] + 14 + 'px'; 
  x.style.left = coors[0] + -165 + 'px';
 }
 if (lyr == "noteContr")
 {  
  x.style.top = coors[1] + 34 + 'px'; 
  x.style.left = coors[0] + -180 + 'px';
 }
 if (lyr == "hotelRoomDtl")
 {  
  x.style.top = coors[1] + 30 + 'px'; 
  x.style.left = coors[0] + 0 + 'px';
 }
 if (lyr == "ageInsuranceDtl")
 {  
  x.style.top = coors[1] + 34 + 'px'; 
  x.style.left = coors[0] + -180 + 'px';
 }
 x.style.display = "block";
}

*/

function hidepop(obj,lyr)
{
	var x = document.getElementById(lyr);
	x.style.display = "none";	
}

function selMainSrc(tabid, contrid){
	for(i=1; i<=4; i++){
		document.getElementById('globalSrcTab'+i).className = '';
		document.getElementById('globalSrcContr'+i).style.display = 'none'	
	}
	if(tabid == 'globalSrcTab1'){
		document.getElementById(tabid).className = 'sel';
	document.getElementById(contrid).style.display = 'block'
	}
	if(tabid == 'globalSrcTab2'){
		document.getElementById(tabid).className = 'hotelTab sel';
	document.getElementById(contrid).style.display = 'block'
	}
	if(tabid == 'globalSrcTab3'){
		document.getElementById(tabid).className = 'hotel_flightTab sel';
	document.getElementById(contrid).style.display = 'block'
	}
	if(tabid == 'globalSrcTab4'){
		document.getElementById(tabid).className = 'holidayTab sel';
	document.getElementById(contrid).style.display = 'block'
	}
	
}



function way(tabid, contrid){
	for(i=1; i<=3; i++){
		document.getElementById('way'+i).className = '';
		document.getElementById('wayContr'+i).style.display = 'none'
		if(i==1){
			document.getElementById('way'+i).className = 'first';	
		}
		if(i==3){
			document.getElementById('way'+i).className = 'last';	
		}
	}
	document.getElementById(tabid).className = 'sel';
	document.getElementById(contrid).style.display = 'block'
	if(tabid == 'way1'){
			document.getElementById(tabid).className = 'first sel';	
		}
		if(tabid == 'way3'){
			document.getElementById(tabid).className = 'last sel';	
		}
}

//========================================================= open popup window =======================================
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
 
 }
 
function popupclose(light, fade)
 {
	 document.getElementById(light).style.display='none';
	 document.getElementById(fade).style.display='none';
	  document.body.style.overflow='auto';
 }
 	
function calloutclose(light){
	document.getElementById(light).style.display='none';
}



$('input[type="text"]').each(function(i){
    var defaultValue = $(this).val();

    $(this).focus(function(){
		if($(this).val() == defaultValue)
        {
            $(this).val('');
			$(this).val('').css('color','#3d3d3d');
        }
    });

    $(this).blur(function(){
        if($(this).val().length == 0)
        {
            $(this).val(defaultValue);
			$(this).val(defaultValue).css('color','#D8D6D6');
        }
    });
});

$(document).ready(function () {
	$('.city').on('keyup',function(){
    $('#hotelInput').removeClass('dis_inputField');
	$('#hotelInput').children().removeAttr('disabled');
	});
});



function chkGroupDetails(i){
	if(document.getElementById('GroupBooking' + i).checked == true){
		$("#gBookingContr" + i).show();
		
		if(i != 4){
			$(".passengerNum" + i).hide();
			$(".aInput" + i).show();
			$(".cInput" + i).show();
			$(".iInput" + i).show();
		}
		else{
			$("#groupBookingRooms").show();
			$("#singleRooms").hide();
			$(".singleRoom").hide();	
		}
		$("#searchBtn1").hide();
		$("#searchBtn2").hide();
		$("#searchBtn3").hide();
		$("#searchBtn4").hide();
		$("#sendReq").show();
	}
	else{
		$("#gBookingContr" + i).hide();
		if(i != 4){
			$(".passengerNum" + i).show();
			$(".aInput" + i).hide();
			$(".cInput" + i).hide();
			$(".iInput" + i).hide();
		}
		else{
			$("#groupBookingRooms").hide();	
			$("#singleRooms").show();
			$(".singleRoom").show();	
		}
		$("#searchBtn1").show();
		$("#searchBtn2").show();
		$("#searchBtn3").show();
		$("#searchBtn4").show();
		$("#sendReq").hide();	
	}
}


function holidayDate(showContr, hideContr){
	document.getElementById(showContr).style.display = 'block';
	document.getElementById(hideContr).style.display = 'none';
}


var aCount = 1;
var cCount = 0;
var iCount = 0;

function aCountInc(id){
	if(aCount < 9){
		aCount++;
		document.getElementById(id).innerHTML = aCount;
	}
}
function aCountDec(id){
	if(aCount > 1){
		aCount--;
		document.getElementById(id).innerHTML = aCount;
	}
	
}

function cCountInc(id){
	if(cCount < 9){
		cCount++;
		document.getElementById(id).innerHTML = cCount;
	}
}
function cCountDec(id){
	if(cCount > 0){
		cCount--;
		document.getElementById(id).innerHTML = cCount;
	}
}

function iCountInc(id){
	if(iCount < 9){
		iCount++;
		document.getElementById(id).innerHTML = iCount;
	}
}
function iCountDec(id){
	if(iCount > 0){
		iCount--;
		document.getElementById(id).innerHTML = iCount;
	}
}

function reset() {
    window.aCount = 1;
	window.cCount = 0;
	window.iCount = 0;
	$("#owAdult,#twAdult,#mwAdult").html(1);
	$("#owChild,#twChild,#mwChild").html(0);
	$("#owInfant,#twInfant,#mwInfant").html(0);
	$("#sendReq").hide();
	$("#searchBtn").show();
	$("#gBookingContr1,#gBookingContr2,#gBookingContr3").hide();
	$(".passengerNum1,.passengerNum2,.passengerNum3").show();
	$(".aInput1,.aInput2,.aInput3").hide();
	$(".cInput1,.cInput2,.cInput3").hide();
	$(".iInput1,.iInput2,.iInput3").hide(); 
}


function addTab(obj){
	aa = obj.innerHTML;
	var el = document.getElementById("mainNav");
	var li = document.createElement("li");
	var fn = 'selMainSrc("globalSrcTab5", "globalSrcContr5")';
		li.innerHTML = "<li id='globalSrcTab5'><a href='javascript:void(0);' onclick='" + fn + "' id='addedTab'>" + aa + "</a></li>";
		if ( $('ul#mainNav li').length < 5 ) {
			el.appendChild(li);
		}
	document.getElementById('addedTab').innerHTML = aa;
	if(document.getElementById('moreOpt').style.display == 'block'){
		document.getElementById('moreOpt').style.display = 'none';
		document.getElementById('moreNav').className = 'addTabNav'
	}
	else{
		document.getElementById('moreOpt').style.display = 'block';
		document.getElementById('moreNav').className = 'addTabNav sel'	
	}
}

function hideDD(){
	if(document.getElementById('moreOpt').style.display == 'block'){
		document.getElementById('moreOpt').style.display = 'none';
		document.getElementById('moreNav').className = 'addTabNav'
	}
	else{
		document.getElementById('moreOpt').style.display = 'block';
		document.getElementById('moreNav').className = 'addTabNav sel'	
	}	
}



$( document ).mouseup( function( e ) {
	if( $( ".selectCont" ).has( e.target ).length === 0 ) {
        $( ".selectCont" ).slideUp('fast');
    }
});

$( document ).mouseup( function( e ) {
	if( $( ".selectCont_sml" ).has( e.target ).length === 0 ) {
        $( ".selectCont_sml" ).slideUp('fast');
    }
});



function chkPayment(obj){
	aa = obj.id;
	if(aa == 'totalAmt'){
		document.getElementById('balPayment').style.display = 'none'
	}
	else{
		document.getElementById('balPayment').style.display = 'block'
	}
}


$('input.disabled').attr('ignore','true').css({
    'pointer-events':'none'
});


function showFilters(filter,val){
	if(filter == "destination")
	{
		document.getElementById("hotelContr1").style.display = "none";
		document.getElementById("hotelContrAll").style.display = "block";	
		document.getElementById("hotelContrAll").innerHTML += '<span class="grey_bg pD5 fL mR20 posR" id="result2">' + val + '<button class="remove_searched_parameter" title="Remove">&times;</button></span>';
		document.getElementById("hotelTab1").className = "sel";
		$('#result2').on('click', function() { 
			$('#result2').remove();
		});
	}
	if(filter == "hotel")
	{
		document.getElementById("hotelContr3").style.display = "none";
		document.getElementById("hotelContrAll").style.display = "block";	
		document.getElementById("hotelContrAll").innerHTML += '<span class="grey_bg pD5 fL mR20 posR" id="result3">' + val + '<button class="remove_searched_parameter" title="Remove">&times;</button></span>';
		document.getElementById("hotelTab3").className = "sel";
		$('#result3').on('click', function() { 
			$('#result3').remove();
		});
		
	}
	if(filter == "star")
	{
			document.getElementById("hotelContr5").style.display = "none";
			document.getElementById("hotelContrAll").style.display = "block";	
			document.getElementById("hotelContrAll").innerHTML += '<span class="grey_bg pD5 fL mR20 posR" id="result5">Luxury<button class="remove_searched_parameter" title="Remove">&times;</button></span>';
			document.getElementById("hotelTab5").className = "sel";
			$('#result5').on('click', function() { 
				$('#result5').remove();
			});
	}
	if(filter == "special")
	{
			document.getElementById("hotelContr5").style.display = "none";
			document.getElementById("hotelContrAll").style.display = "block";	
			document.getElementById("hotelContrAll").innerHTML += '<span class="grey_bg pD5 fL mR20 posR" id="result5">Special<button class="remove_searched_parameter" title="Remove">&times;</button></span>';
			document.getElementById("hotelTab5").className = "sel";		
	}
	if(filter == "winter")
	{
			document.getElementById("hotelContr4").style.display = "none";
			document.getElementById("hotelContrAll").style.display = "block";	
			document.getElementById("hotelContrAll").innerHTML += '<span class="grey_bg pD5 fL mR20 posR" id="result4">Winter<button class="remove_searched_parameter" title="Remove">&times;</button></span>';
			document.getElementById("hotelTab4").className = "sel";		
	}
	if(filter == "summer")
	{
			document.getElementById("hotelContr4").style.display = "none";
			document.getElementById("hotelContrAll").style.display = "block";	
			document.getElementById("hotelContrAll").innerHTML += '<span class="grey_bg pD5 fL mR20 posR" id="result4">Summer<button class="remove_searched_parameter" title="Remove">&times;</button></span>';
			document.getElementById("hotelTab4").className = "sel";		
	}
	if(filter == "rainy")
	{
			document.getElementById("hotelContr4").style.display = "none";
			document.getElementById("hotelContrAll").style.display = "block";	
			document.getElementById("hotelContrAll").innerHTML += '<span class="grey_bg pD5 fL mR20 posR" id="result4">Rainy<button class="remove_searched_parameter" title="Remove">&times;</button></span>';
			document.getElementById("hotelTab4").className = "sel";		
	}
	if(filter == "Honeymoon")
	{
			document.getElementById("hotelContr2").style.display = "none";
			document.getElementById("hotelContrAll").style.display = "block";	
			document.getElementById("hotelContrAll").innerHTML += '<span class="grey_bg pD5 fL mR20 posR" id="result4">Honeymoon<button class="remove_searched_parameter" title="Remove">&times;</button></span>';
			document.getElementById("hotelTab2").className = "sel";		
	}
	if(filter == "Adventure")
	{
			document.getElementById("hotelContr2").style.display = "none";
			document.getElementById("hotelContrAll").style.display = "block";	
			document.getElementById("hotelContrAll").innerHTML += '<span class="grey_bg pD5 fL mR20 posR" id="result4">Adventure<button class="remove_searched_parameter" title="Remove">&times;</button></span>';
			document.getElementById("hotelTab2").className = "sel";		
	}
	if(filter == "Beach")
	{
			document.getElementById("hotelContr2").style.display = "none";
			document.getElementById("hotelContrAll").style.display = "block";	
			document.getElementById("hotelContrAll").innerHTML += '<span class="grey_bg pD5 fL mR20 posR" id="result4">Beach<button class="remove_searched_parameter" title="Remove">&times;</button></span>';
			document.getElementById("hotelTab2").className = "sel";		
	}
	if(filter == "Lastminute")
	{
			document.getElementById("hotelContr3").style.display = "none";
			document.getElementById("hotelContrAll").style.display = "block";	
			document.getElementById("hotelContrAll").innerHTML += '<span class="grey_bg pD5 fL mR20 posR" id="result4">Last minute<button class="remove_searched_parameter" title="Remove">&times;</button></span>';
			document.getElementById("hotelTab3").className = "sel";		
	}
	if(filter == "Combo")
	{
			document.getElementById("hotelContr3").style.display = "none";
			document.getElementById("hotelContrAll").style.display = "block";	
			document.getElementById("hotelContrAll").innerHTML += '<span class="grey_bg pD5 fL mR20 posR" id="result4"><Combo<button class="remove_searched_parameter" title="Remove">&times;</button></span>';
			document.getElementById("hotelTab3").className = "sel";		
	}
	if(filter == "Special1")
	{
			document.getElementById("hotelContr3").style.display = "none";
			document.getElementById("hotelContrAll").style.display = "block";	
			document.getElementById("hotelContrAll").innerHTML += '<span class="grey_bg pD5 fL mR20 posR" id="result4">Special<button class="remove_searched_parameter" title="Remove">&times;</button></span>';
			document.getElementById("hotelTab3").className = "sel";		
	}
	
	$('#result1').on('click', function() { 
		$('#result1').remove();
	});
	$('#result2').on('click', function() { 
		$('#result2').remove();
	});
	$('#result3').on('click', function() { 
		$('#result3').remove();
	});
}

$(document).ready(function () {
	$('.headerHideControl').on('click', function (e) {
		var title = 'Hide header'; 
		$(this).toggleClass('sel');
		if( $(this).hasClass('sel')){
			title = 'Show header';
		}
		$(this).attr('title', title);
		$('#globalNav').toggleClass('dN');
		$('.logoContr').toggleClass('dN');
		$('.travelerName').toggleClass('dN');
	});	
})

function holidayDate(id1, id2){
	document.getElementById(id1).style.display = 'block'
	document.getElementById(id2).style.display = 'none'
}

function redirectSearch(){
	if(document.getElementById('globalSrcTab2').className == 'hotelTab sel'){
		window.location.href = 'srp_hotels.html'
	}
	else if(document.getElementById('globalSrcTab4').className == 'holidayTab sel'){
		window.location.href = 'srp_holidays.html'
	}
	else if(document.getElementById("globalSrcTab1").className == "sel")
	{
		if(document.getElementById('way1').className == 'first sel'){
			window.location.href = 'srp_flights_oneway.html'
		}
		else if(document.getElementById('way2').className == 'sel'){
			window.location.href = 'srp_flights_twoway.html'
		}
		else if(document.getElementById('way3').className == 'last sel'){
			window.location.href = 'srp_flights_multiway.html'
		}	
	}
}

$(document).ready(function () {
	$('#hotelOpt').on('click', function (e) {
		$("#hotelContr").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/collapse_blu.png');
		}
	});	
});


$(document).ready(function () {
$('#holidayOpt').on('click', function (e) {
		$("#holidayContr").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/collapse_blu.png');
		}
	});	
});

/* modified search */
$(document).ready(function () {
	$('.modSrcBtn').on('click', function (e) {
		
		$(".contentPanel").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/down-arrow-grey.png');		   
		}else{
			$(this).find('img').attr('src','images/right-arrow-grey.png');
		}
	});	
});

/* portrait flight search more */

$(document).ready(function () {
	$('#portmoresrc').on('click', function (e) {
		$("#moresrcContr").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			//$(this).find('img').attr('src','images/expand_blu.png');
			$("#portmoresrc").html('<a href="javascript:void(0);"><img src="images/expand_blu.png" alt="Arrow" class="mR5 fL mT5">less</a>')	
				   
		}else{
			//$(this).find('img').attr('src','images/collapse_blu.png');
			$("#portmoresrc").html('<a href="javascript:void(0);"><img src="images/collapse_blu.png" alt="Arrow" class="mR5 fL mT5">more</a>')	
		}
	});	
});

/* tax & fee more */

$(document).ready(function () {
	
	$('.tf').on('click', function (e) {
		$(".tfoption").slideToggle("slow");
		$(this).toggleClass("active");
		 if ($(this).hasClass('active')) {
			$(this).text('- Taxes & fees');		   
			$('.tftotal').hide();		   
		}else{
			$(this).text('+ Taxes & fees');
			$('.tftotal').show();		  
		}
	});	
});

function addFlight(dest){
	$("#btmTop").show();
	if(dest == "to"){
		$("#flightTo").show();
		$("#bookFlightSource").attr('classname','clearfix pT20 posR brdrBLitGry sel');
	}
	else if(dest == "from"){
		$("#flightFrom").show();
		$("#bookFlightDestination").attr('classname','clearfix pT20 posR brdrBLitGry sel');
	}
	
	if((document.getElementById("flightTo").style.display == "block") && (document.getElementById("flightFrom").style.display == "block"))
		document.getElementById("flightRate").innerHTML = "75,560"
	else	
		document.getElementById("flightRate").innerHTML = "37,780"
	$("#totalPrice,#bookFlight").show();
}

function chooseFlight(i){
	orgClassName = document.getElementById("flightLeg" + i).className;
	document.getElementById("flightLeg" + i).className = orgClassName + " sel";
	
	if ((document.getElementById("flightLeg1").className.indexOf('sel') >= 0) && (document.getElementById("flightLeg2").className.indexOf('sel') >= 0) && (document.getElementById("flightLeg3").className.indexOf('sel') >= 0) && (document.getElementById("flightLeg4").className.indexOf('sel') >= 0)) {
		$("#btmTop").show();
	}
}

function showFareEdit(markupId){
	val = document.getElementById("markupVal" + markupId).innerHTML;
	document.getElementById("markup" + markupId).innerHTML = '<span class="rupee">Rs </span><input id="markupEdit' + markupId + '" type="text" value="" class="w38pcnt small"><span class="tick_icon mL2" onclick="editValue(' + markupId + ');"></span>';
	
	document.getElementById("markupEdit" + markupId).value = val;
}

function editValue(id){
	document.getElementById("markup" + id).innerHTML = '<a href="javascript:void(0);"><span class="rupee">Rs </span><span id="markupVal' + id + '">' + document.getElementById("markupEdit" + id).value + '</span></a><span class="edit_sml_icon mL5" onClick="showFareEdit(' + id + ');"></span>';
}


/*Function to edit daywise itenary*/
function editCurrentField(markupId){
	val = document.getElementById("markupVal" + markupId).innerHTML;
	document.getElementById("markup" + markupId).innerHTML = '<input id="markupEdit' + markupId + '" type="text" value="" class="small"><span class="tick_icon mL2" onclick="editFieldValue(' + markupId + ');"></span>';
	
	document.getElementById("markupEdit" + markupId).value = val;
}

function editFieldValue(id){
	document.getElementById("markup" + id).innerHTML = '<h4 class="fL"><span id="markupVal' + id + '">' + document.getElementById("markupEdit" + id).value + '</span></h4><span class="edit_icon mL5" onClick="editCurrentField(' + id + ');"></span>';
}




function showCustomerDetails(val){
	if(val == "new"){
		$('#custDetail').show("slow");
		$('#custDetail_fill').hide();
		$('#newCustDetail').hide();
		
	}
	else if(val == "existing"){
		$('#custDetail').hide();
		$('#newCustDetail').hide();
		$('#custDetail_fill').show("slow");
	}
}
/*var c = 3;
function showMultiwayOptions_old(){
	if(c < 6){
		$("#addCity" + c).show();
		c++;	
	}
}*/
function showMultiwayOptions() {
	flights.addFlight(true);
}

function hideMultiwayOptions(i){
	$("#addCity" + i).slideUp();	
	if(i != 5)
		c = i++;
}

var roomsAdded = 1;
function showRooms(){
	rooms = document.getElementById("noOfRooms").value;
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
			document.getElementById("room" + (roomsAdded+1)).innerHTML = '<ul class="row mB10 mT15 clearfix"><li class="col_2">&nbsp;</li><li class="col_2 pR0"> <span class="mT30 fL">Room ' + (roomsAdded+1) + ':</span></li><li class="col_2 col_2_sm  pR0 pL0"><label>Adult</label><div class="passengerNum4 fL"><span onclick="adultCountDec(\'hAdult_' + (roomsAdded+1) + '\')" class="control addMinControl minusControl">-</span><span class="control innerTxtControl" id="hAdult_' + (roomsAdded+1) + '">1</span><span onclick="adultCountInc(\'hAdult_' + (roomsAdded+1) + '\')" class="control addMinControl plusControl">+</span></div><input type="text" class="w100pcnt dN" maxlength="3" value="1"><span class="fS11 fL w100pcnt">12+ yrs</span></li><li class="col_1_half col_2_sm  pR0 pL0"><label>Children</label><div class="passengerNum5 fL"> <span onclick="childCountDec(\'hChild_' + (roomsAdded+1) + '\'),remChild(' + (roomsAdded+1) + ')" class="control addMinControl minusControl">-</span> <span class="control innerTxtControl" id="hChild_' + (roomsAdded+1) + '">0</span> <span onclick="childCountInc(\'hChild_' + (roomsAdded+1) + '\'),addChild(' + (roomsAdded+1) + ')" class="control addMinControl plusControl">+</span> </div><input type="text" class="w100pcnt dN" maxlength="3" value="0"><span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li><li class="col_4  pL0 pR0 mB10"><ul><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_1"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_2"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_3"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_4"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_5"></li><li class="col_6 pR0" id="child' + r + '_6"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_7"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_8"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_9"></li></ul></li></ul>';
			roomsAdded++;
		}
	}
	
	
	
	
	/*for(i=2;i<=3;i++){
		document.getElementById("room" + i).innerHTML = '';	
	}
	if(rooms > 1)
	{
		for(r=2;r<=rooms;r++)
		{
			document.getElementById("room" + r).innerHTML = '<ul class="row mB10 mT15 clearfix"><li class="col_2">&nbsp;</li><li class="col_2 pR0"> <span class="mT30 fL">Room ' + r + ':</span></li><li class="col_2 pL0"><label>Adult</label><div class="passengerNum4 fL"><span onclick="adultCountDec(\'hAdult_' + r + '\')" class="control addMinControl minusControl">-</span><span class="control innerTxtControl" id="hAdult_' + r + '">1</span><span onclick="adultCountInc(\'hAdult_' + r + '\')" class="control addMinControl plusControl">+</span></div><input type="text" class="w100pcnt dN" maxlength="3" value="1"><span class="fS11 fL w100pcnt">12+ yrs</span></li><li class="col_2 pL0"><label>Children</label><div class="passengerNum5 fL"> <span onclick="childCountDec(\'hChild_' + r + '\'),remChild(' + r + ')" class="control addMinControl minusControl">-</span> <span class="control innerTxtControl" id="hChild_' + r + '">0</span> <span onclick="childCountInc(\'hChild_' + r + '\'),addChild(' + r + ')" class="control addMinControl plusControl">+</span> </div><input type="text" class="w100pcnt dN" maxlength="3" value="0"><span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li><li class="col_4 mB10"><ul><li class="col_6 pR0" id="child' + r + '_1"></li><li class="col_6 pR0" id="child' + r + '_2"></li><li class="col_6 pR0" id="child' + r + '_3"></li><li class="col_6 pR0" id="child' + r + '_4"></li><li class="col_6 pR0" id="child' + r + '_5"></li><li class="col_6 pR0" id="child' + r + '_6"></li><li class="col_6 pR0" id="child' + r + '_7"></li><li class="col_6 pR0" id="child' + r + '_8"></li><li class="col_6 pR0" id="child' + r + '_9"></li></ul></li></ul>';
		}
	}*/
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
	document.getElementById("child" + s + "_" + child_Count).innerHTML = '<label>Child ' + child_Count + '</label><select class="w75 pL0 pR5"><option value="Age">Age</option><option value="1">1</option><option value="2">2</option><option value="3">3</option></select>';
	document.getElementById("child" + s + "_" + child_Count).className = "col_6 mB10 pR0";
	$("select").change(function () {
		$(this).addClass("defaultTextColor");
	});
}

function remChild(s){
	document.getElementById("child" + s + "_" + (child_Count+1)).innerHTML = '';
	document.getElementById("child" + s + "_" + (child_Count+1)).className = "col_6 pR0";
}

function showNoteContainer(){
	if($('#noteContainer').is(':hidden')){
		$('#noteContent').val('');
		$('#charCount').html(0);
		$("#noteContainer").slideDown("slow");
		$('#noteText').html('Hide note')
	}
	else{
		$("#noteContainer").slideUp("slow");
		$('#noteText').html('Add note')
	}
}
// toggle menu
(function($){
    $.fn.toggleMenu = function() {
        var self = this;
        var showHide = function(ele) {
            var shClass = 'show_menu_item';
            var menuItemPanel = ele.find('.menu_items');
            if (ele.hasClass('sel')) {
                ele.removeClass('sel');
                menuItemPanel.removeClass(shClass).css('display', 'none');
				
            } else {
                $(self).removeClass('sel');
                ele.addClass('sel');
                var menuPanels = $(self).find('.menu_items');
                menuPanels.removeClass(shClass).css('display', 'none');
                menuItemPanel.addClass(shClass).css('display', 'block');
				if( $("#moreOpt").exists()){
					if($("#moreOpt").is(":visible")){
					  $("#moreOpt").hide();
					 $("#moreNav").removeClass("sel");
				  }
				}
            }
        };

        return this.each(function() {
            var ele = $(this);
            ele.bind('click', function(evt) {
                evt.stopPropagation();
                evt.preventDefault();
                showHide(ele);
                return false;
            });
        });
    }
})(jQuery)


$(document).mouseup(function (e)
 {
	var dest = $(".destTabOpen");
	if (!dest.is(e.target) // if the target of the click isn't the container...
		&& dest.has(e.target).length === 0) // ... nor a descendant of the container
	{
		dest.hide();
		dest.parent().removeClass("sel");	
	}
	
 });
 

 
 

// toggle sub menu
var selTab = '';
(function($){
    $.fn.toggleSubMenu = function() {
        var self1 = this.parent();
        var showHide1 = function(ele1) {
            var shClass1 = 'show_menu_item';
			var selectedId = ele1.attr("id");
            var menuItemPanel1 = ele1.parent().find('.menu_items');
			if (ele1.hasClass('sel')) 
			{
				if(ele1.find(".searchFieldContainer").exists()){
						$(".searchFieldContainer input").blur( function(){
							$(this).parent().parent().closest("li.toggle_submenu").removeClass("sel");
							$(".searchFieldContainer").hide();
						});
				}
				else{
					ele1.removeClass('sel');
					menuItemPanel1.removeClass(shClass1).css('display', 'none');
				}
			} else {
				$(self1).removeClass('sel');
				ele1.parent().addClass('sel');
				var menuPanels1 = $(self1).find('.menu_items');
				menuPanels1.removeClass(shClass1).css('display', 'none');
				menuItemPanel1.addClass(shClass1).css('display', 'block');
			}
        };

        return this.each(function() {
            var ele2 = $(this);
            ele2.bind('click', function(evt) {
                evt.stopPropagation();
                evt.preventDefault();
                showHide1(ele2);
                return false;
            });
        });
    }
})(jQuery)


/*var selTab = '';
(function($){
    $.fn.toggleSubMenu = function() {
        var self1 = this;
        var showHide1 = function(ele1) {
            var shClass1 = 'show_menu_item';
			var selectedId = ele1.attr("id");
            var menuItemPanel1 = ele1.find('.menu_items');
			if(ele1.attr("id") == "hotelTab1")
			{
				if(document.getElementById("hotelTab1_h").value != "")
					document.getElementById("hotelContr1").style.display = "block";	
				
				if(document.getElementById("hotelTab1_h").value == "show"){
					document.getElementById("hotelContr1").style.display = "none";
					document.getElementById("hotelTab1").className ="toggle_submenu searchMenuTab"
					document.getElementById("hotelTab1_h").value = "";
				}
				else
				{
					if (ele1.hasClass('sel')) 
					{
						if(ele1.find(".searchFieldContainer").exists()){
								$(".searchFieldContainer input").blur( function(){
									$(this).parent().parent().closest("li.toggle_submenu").removeClass("sel");
									$(".searchFieldContainer").hide();
								});
						}
						else{
							ele1.removeClass('sel');
							menuItemPanel1.removeClass(shClass1).css('display', 'none');
						}
					} else {
						$(self1).removeClass('sel');
						ele1.addClass('sel');
						var menuPanels1 = $(self1).find('.menu_items');
						menuPanels1.removeClass(shClass1).css('display', 'none');
						menuItemPanel1.addClass(shClass1).css('display', 'block');
						document.getElementById(selectedId + "_h").value = "show"
						document.getElementById("hotel_destination").focus();
					}
				}
			}
			else{
			
				if (ele1.hasClass('sel')) 
				{
					if(ele1.find(".searchFieldContainer").exists()){
							$(".searchFieldContainer input").blur( function(){
								$(this).parent().parent().closest("li.toggle_submenu").removeClass("sel");
								$(".searchFieldContainer").hide();
							});
					}
					else{
						ele1.removeClass('sel');
						menuItemPanel1.removeClass(shClass1).css('display', 'none');
					}
				} else {
					$(self1).removeClass('sel');
					ele1.addClass('sel');
					var menuPanels1 = $(self1).find('.menu_items');
					menuPanels1.removeClass(shClass1).css('display', 'none');
					menuItemPanel1.addClass(shClass1).css('display', 'block');
					document.getElementById(selectedId + "_h").value = "show"
				}
			}
        };

        return this.each(function() {
            var ele2 = $(this);
            ele2.bind('click', function(evt) {
                evt.stopPropagation();
                evt.preventDefault();
                showHide1(ele2);
                return false;
            });
        });
    }
})(jQuery)*/


function showCustomer(ev){
	if(ev == 9)
	{
		document.getElementById("existingCustContr").style.display = "block";
		document.getElementById("addCustContr").style.display = "none";
	}
	else if(ev == "f")
	{
		document.getElementById("existingCustContr").style.display = "none";
		document.getElementById("addCustContr").style.display = "block";
	}
}
//add flights and destinations

var flightForm = (function(opts) {
    var options = $.extend({}, opts);
    if (!options.hasOwnProperty('container')) {
        return false;
    }

    var rootContainer = $('#'+ options.container);
    if (!rootContainer.length) {
        return false;
    }
    var flightCnt = 3;
    var flightContainerClass = 'flight_container';
    var flightContainer = 'flightContainer';
    var dtPicker = 'datepickerForFlight';
    var flightFromClass = 'flight_from';
    var flightFrom = 'mwflightFrom';
    var flightToClass ='flight_to';
    var flightTo = 'mwFlightTo';
    var flightDelClass ='del_flight';
    var flightDel = 'delFlight';

    var availableRoutes = ['Mumbai, India (BOM)','New Delhi, India (DEL)','Bangalore, India (BLR)','Daman, India  (nearest airport Mumbai, BOM)','Chennai, India (MAA)'];

    var buildFlightForm = function(withDeleteOption) {
        var baseCont = $('<ul/>').attr('id', flightContainer + flightCnt).attr('data-flight-count', flightCnt);
        baseCont.addClass('mB10 clearfix ' + flightContainerClass);

        var flightCont = $('<li/>').addClass('col_8 pR0 pL0');

        var lblTag = $('<label/>').text('Flight ' + flightCnt + ':');

        var flightNameCont1 = $('<div/>').addClass('search-bar grey_border fL mR20 w47pcnt');
        var flightNameTextBox1 = $('<input/>')
            .attr('type', 'text')
            .addClass('sfield w95pcnt ' + flightFromClass)
            .attr('name', 'searchterm')
            .attr('placeholder', 'From')
            .attr('id', flightFrom + flightCnt)

        var flightNameDest1 =$('<input/>')
            .attr('type', 'image')
            .addClass('fromDestination')
            .attr('name', 'search')
            .attr('alt', 'Search')
            .attr('title', 'Search')
            .attr('src', 'images/destination_from.png');
        flightNameTextBox1.appendTo(flightNameCont1);
        flightNameDest1.appendTo(flightNameCont1);

        var flightNameCont2 = $('<div/>').addClass('search-bar grey_border fL w47pcnt');

        var flightNameTextBox2 = $('<input />')
            .attr('type', 'text')
            .addClass('sfield w95pcnt ' + flightToClass)
            .attr('name', 'searchterm')
            .attr('placeholder', 'To')
            .attr('id',  flightTo + flightCnt)

        var flightNameDest2 =$('<input/>')
            .attr('type', 'image')
            .addClass('toDestination')
            .attr('name', 'search')
            .attr('alt', 'Search')
            .attr('title', 'Search')
            .attr('src', 'images/destination_to.png');
        flightNameTextBox2.appendTo(flightNameCont2);
        flightNameDest2.appendTo(flightNameCont2);

        lblTag.appendTo(flightCont);
        flightNameCont1.appendTo(flightCont);
        flightNameCont2.appendTo(flightCont);

        var departureCont = $('<li/>').addClass('col_3');
        var departureLabel = $('<label/>').text('Departure');
        var departureDate = $('<input />')
            .addClass('w100pcnt dateField')
            .attr('id', dtPicker + flightCnt)
            .attr('type', 'text')
            .css({'width': '130'})
            .val('DD/MM/YYYY');
        departureLabel.appendTo(departureCont);
        departureDate.appendTo(departureCont);

        flightCont.appendTo(baseCont);
        departureCont.appendTo(baseCont);
        if (withDeleteOption) {
            var delCont = $('<li/>').addClass('closeMultipleWay').attr('id', flightDel + flightCnt).attr('data-flight-no', flightCnt);
            var delLink = $('<div/>').addClass('close_multicity_panel fL  ');
            delLink.appendTo(delCont);
            delCont.appendTo(baseCont);
        }
        if (rootContainer.find('> ul').length) {
            rootContainer.find('> ul').last().after(baseCont);
            baseCont.appendTo(rootContainer);
        } else {
            baseCont.prependTo(rootContainer);
        }
    };

    var bindEventsToControls = function(fCnt) {
        if (fCnt === undefined) {
            fCnt = flightCnt;
        }
        var _flightFrom = $('#' + flightFrom + fCnt);
        _flightFrom.autocomplete({
            source: availableRoutes,
            delay: 400,
			focus: function( event, ui ) {
				    $(this).css("color","#333333");	
				},
			select: function( event, ui ) {
				    $(this).css("color","#333333");	
				}
        });
        var _flightTo = $('#' + flightTo + fCnt);
        _flightTo.autocomplete({
            source: availableRoutes,
            delay: 400,
			focus: function( event, ui ) {
				    $(this).css("color","#333333");	
				},
			select: function( event, ui ) {
				    $(this).css("color","#333333");	
				}
        });
        var _dtPicker = $('#' + dtPicker + fCnt);
        _dtPicker.datepicker('destroy');
        _dtPicker.datepicker({
            numberOfMonths:2,
            minDate: 0,
            dateFormat: "dd/mm/yy",
            onSelect: function(dateText){
                $(this).css("color","#333333");
            }
        });
        var delFlight = $('#' + flightDel + fCnt);
        if (delFlight.length) {
            delFlight.unbind('click');
            delFlight.bind('click', function(evt) {
                evt.stopPropagation();
                removeFlight(+($(this).attr('data-flight-no')));
            });
        }
    };

    var removeFlight = function(flightNo) {
        var fc = $('#' + flightContainer + flightNo);
        if (fc.length) {
            var fcParent = fc.parent();
            fcParent.find(fc).remove();
            flightCnt -= 1;
            resetFlightNumber((flightNo + 1));
        }
    };

    var resetFlightNumber = function(resetFrom) {
        if (resetFrom === undefined) {
            resetFrom = 1;
        }
        var fCnt = resetFrom;
        $('.' + flightContainerClass).each(function(idx) {
            var ele = $(this);
            var flNo = +(ele.attr('data-flight-count'));
            if (flNo < resetFrom) {
                return;
            }
            var cFNo = fCnt - 1;
            ele.attr('data-flight-count', cFNo).attr('id', flightContainer + cFNo);
            ele.find('li:first-child > label').text('Flight ' + cFNo + ':');
            ele.find('#' + flightFrom + fCnt)
                .attr('id', flightFrom + cFNo);
            ele.find('#' + flightTo + fCnt)
                .attr('id', flightTo + cFNo);
            ele.find('#' + dtPicker + fCnt)
                .attr('id', dtPicker + cFNo);
            ele.find('#' + flightDel + fCnt)
                .attr('id', flightDel + cFNo).attr('data-flight-no', cFNo);
            bindEventsToControls(cFNo);
            fCnt += 1;
        });
    };
    var addFlightToForm = function(withDeleteOption) {
        if (!withDeleteOption) {
            withDeleteOption = false;
        }
        buildFlightForm(withDeleteOption);
        bindEventsToControls();
        flightCnt += 1;
    };

    return {
        init: function() {
            //addFlightToForm();
            //addFlightToForm();
        },
        addFlight: function(withDeleteOption) {
            addFlightToForm(withDeleteOption);
        },
        removeFlight: function(flightNo) {
            removeFlight(flightNo);
        }
    }
});

$('#noteContent').keyup(function() {
   if($('#charCount').text() < 100)
		$('#charCount').text( this.value.replace(/{.*}/g, '').length);
});

$('#noteContent1').keyup(function() {
   if($('#charCount1').text() > 0)
		$('#charCount1').text( 100- this.value.replace(/{.*}/g, '').length);
	
		if($('#charCount1').text()=='100')
		{$('#charText1').hide(); }
		else{
		$('#charText1').show();
		}
});
$('#noteContent2').keyup(function() {
   if($('#charCount2').text() > 0)
		$('#charCount2').text(  100- this.value.replace(/{.*}/g, '').length);
		if($('#charCount2').text()=='100')
		{$('#charText2').hide(); }
		else{
		$('#charText2').show();
		}
		
});
$('#noteContent3').keyup(function() {
   if($('#charCount3').text() < 100)
		$('#charCount3').text(   this.value.replace(/{.*}/g, '').length);
});
$('#noteContent4').keyup(function() {
   if($('#charCount4').text() > 0)
		$('#charCount4').text(  100- this.value.replace(/{.*}/g, '').length);
		if($('#charCount4').text()=='100')
		{$('#charText4').hide(); }
		else{
		$('#charText4').show();
		}
});
$('#noteContent5').keyup(function() {
   if($('#charCount5').text() < 100)
		$('#charCount5').text( this.value.replace(/{.*}/g, '').length);
});
//handle options in the last tab item (+)
//handle options in the last tab item (+)
$('ul#moreOpt > li').bind('click', function(evt) {
	evt.preventDefault();
	evt.stopPropagation();
	var ele = $(this);
	if (ele.find('a').hasClass('link')) {
		return false;
	}
	var optText = ele.find('a').text();
	var tabContainer = $('li#globalSrcTab5');
	tabContainer.find('a').text(optText);
	if(optText== 'Bus')
	{
	$('#globalSrcContr5').html('<ul class="flightWayTab  clearfix"> <li class="first sel" id="way17"><a href="javascript:void(0);" onclick="bustype(\'way17\', \'wayContr17\'),reset()"><span class="oneway_icon" title="One way"></span></a></li> <li class="last" id="way18"><a href="javascript:void(0);" onclick="bustype(\'way18\', \'wayContr18\'),reset()"><span class="twoway_icon" title="Return"></span></a></li> </ul> <div id="wayContr17" class="clearfix">  <ul class="mB10 clearfix"> <li class="col_5 pR0 pL0"> <label>&nbsp;</label> <input type="text" class="w95pcnt" name="startfrom" placeholder="From" /> </li> <li class="col_1 pL10 pR0"> <label>&nbsp;</label> <span class="oneway_icon" title="One way"></span> </li> <li class="col_5 pR0 pL0"> <label>&nbsp;</label> <input type="text" class="w95pcnt" name="to" placeholder="To" /> </li> <li class="col_6 pR0 pL0 mT10"> <label>Departure</label> <input id="datepicker30" class="w50pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_6 pR0 pL0 mT10"> <label>Return</label> <input id="datepicker16" class="w50pcnt " type="text" placeholder="DD/MM/YYYY" disabled="disabled" /> </li> </ul> <ul class="row mB10"><li class="col_6"><div><label>Bus type</label><dl class="dropdown1"><dt><a href="javascript:void(0);" class="grey_border fL"><span class="hida">All </span><p class="multiSel1" ></p> </a><span class="downArrow_icon pD5 fL mLN20  mT15 pD15"></span></dt><dd><div class="mutliSelect1"><ul><li><input type="checkbox" value="All"/><label>All</label></li><li><input type="checkbox" value="AC" class="checkbox1"/><label>AC</label></li><li><input type="checkbox" value="Non AC" class="checkbox1"/><label>Non AC</label></li><li><input type="checkbox" value="Sleeper" class="checkbox1"/><label>Sleeper</label></li><li><input type="checkbox" value="Semi-sleeper" class="checkbox1"/><label>Semi-sleeper</label></li></ul></div></dd></dl><p class="multiSel1 cB"></p></div></li><li class="col_6 pR10 pL0  mT30"> <input type="checkbox" /><label>Volvo/ Mercedes only</label> </li> </ul> <div class="cB"></div> <div class="mT40 clearfix"> <input type="checkbox" /> <label class="w50pcnt">Group booking request (6+Pax)</label> </div> </div> <div id="wayContr18" class="clearfix dN">  <ul class="mB10 clearfix"> <li class="col_5 pR0 pL0"> <label>&nbsp;</label> <input type="text" class="w95pcnt" name="startfrom" placeholder="From" /> </li> <li class="col_1 pL10 pR0"> <label>&nbsp;</label> <span class="twoway_icon" title="Return"></span> </li> <li class="col_5 pR0 pL0"> <label>&nbsp;</label> <input type="text" class="w95pcnt" name="to" placeholder="To" /> </li> <li class="col_6 pR0 pL0 mT10"> <label>Departure</label> <input id="datepicker31" class="w50pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_6 pR0 pL0 mT10"> <label>Return</label> <input id="datepicker32" class="w50pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> </ul> <ul class="row mB10"><li class="col_6"><div><label>Bus type</label><dl class="dropdown1"><dt><a href="javascript:void(0);" class="grey_border fL"><span class="hida">All </span><p class="multiSel1" ></p> </a><span class="downArrow_icon pD5 fL mLN20  mT15 pD15"></span></dt><dd><div class="mutliSelect1"><ul><li><input type="checkbox" value="All"/><label>All</label></li><li><input type="checkbox" value="AC" class="checkbox1"/><label>AC</label></li><li><input type="checkbox" value="Non AC" class="checkbox1"/><label>Non AC</label></li><li><input type="checkbox" value="Sleeper" class="checkbox1"/><label>Sleeper</label></li><li><input type="checkbox" value="Semi-sleeper" class="checkbox1"/><label>Semi-sleeper</label></li></ul></div></dd></dl><p class="multiSel1 cB"></p></div></li><li class="col_6 pR10 pL0  mT30"> <input type="checkbox" /><label>Volvo/ Mercedes only</label> </li> </ul> <div class="cB"></div> <div class="mT40"> <input type="checkbox"/> <label class="w50pcnt">Group booking request (6+Pax)</label> </div> </div><div class="clearfix"></div> <div class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);">Search </a></div>');
	}
	if(optText== 'Activities')
	{
	$('#globalSrcContr5').html('<ul class="col_12 clearfix"> <li> <label>Destination</label> <div class="search-bar grey_border clearfix"><input type="text" class="sfield w95pcnt ui-autocomplete-input" name="searchterm" placeholder="From" id="search1" autocomplete="off"> <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/search_icon.png" id="cars_detail2" style="width:16px"></div></li> </ul> <ul class="mT10 mB10 clearfix"><li class="col_6"><div><label>Themes</label><dl class="dropdown1"><dt><a href="javascript:void(0);" class="grey_border fL"><span class="hida">All </span><p class="multiSel1" ></p> </a><span class="downArrow_icon pD5 fL mLN20  mT15 pD15"></span></dt><dd><div class="mutliSelect1"><ul><li><input type="checkbox" value="All"/><label>All</label></li><li><input type="checkbox" value="Bed and Breakfast" class="checkbox1"/><label>Bed and Breakfast</label></li><li><input type="checkbox" value="Boutique Hotel" class="checkbox1"/><label>Boutique Hotel</label></li><li><input type="checkbox" value="Guest House" class="checkbox1"/><label>Guest House</label></li><li><input type="checkbox" value="Heritage Hotel" class="checkbox1" /><label>Heritage Hotel</label></li><li><input type="checkbox" value="Home Stay" class="checkbox1"/><label>Home Stay</label></li><li><input type="checkbox" value="Resort" class="checkbox1"/><label>Resort</label></li><li><input type="checkbox" value="Serviced Apartments" class="checkbox1" /><label>Serviced Apartments</label></li></ul></div></dd></dl><p class="multiSel1 cB"></p></div></li><li class="col_6"> <label>Budget (per person)</label> <div id="slider-range" class="mL10"></div> <input type="text" id="amount" class="rangeTxt" style="background: transparent;" readonly /> </li> </ul> <ul class="mT10 clearfix"><li class="col_6"><div><label>Physical Intensity</label><dl class="dropdown2"><dt><a href="javascript:void(0);" class="grey_border fL"><span class="hidd">All </span><p class="multiSel2" ></p> </a><span class="downArrow_icon pD5 fL mLN20  mT15 pD15"></span></dt><dd><div class="mutliSelect2"><ul><li><input type="checkbox" value="All"/><label>All</label></li><li><input type="checkbox" value="high" class="checkbox1"/><label>High</label></li><li><input type="checkbox" value="medium" class="checkbox1"/><label>Medium</label></li><li><input type="checkbox" value="low" class="checkbox1"/><label>Low</label></li></ul></div></dd></dl><p class="multiSel2 cB"></p></div></li><li class="col_6"> <span class="label fL mB5 mR5">Departure</span> <div class="fL mR15"> <input type="radio" name="domHolidayDate" id="domHolidayTime3" checked="checked"  onclick="holidayDate(\'holidayMonth1\', \'holidayDay1\')"/> <label for="domHolidayTime3"><span class="trvGrp">Month</span></label> </div> <div class="fL  mR15"> <input type="radio" name="domHolidayDate" id="domHolidayTime4" onclick="holidayDate(\'holidayDay1\', \'holidayMonth1\')"/> <label for="domHolidayTime4"><span class="trvGrp">Date</span></label> </div> <select id="holidayMonth1" class="w50pcnt"> <option value="January">January</option> <option value="February">February</option> <option value="March">March</option> <option value="April">April</option> <option value="May">May</option> <option value="June">June</option> <option value="July">July</option> <option value="August">August</option> <option value="September">September</option> <option value="October">October</option> <option value="November">November</option> <option value="December">December</option> </select> <span id="holidayDay1" class="dN"> <input id="datepicker33" class="dateField holidayCal" type="text" placeholder="DD/MM/YYYY" readonly /> </span> </li> </ul><div class="mT40 pL20"> <input type="checkbox">  <label class=" w50pcnt">Group booking request (9+Pax)</label></div><div class="clearfix"></div> <div class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);">Search </a></div>');
	}
	if(optText== 'Car')
	{
	$('#globalSrcContr5').html(' <ul class="mB10 clearfix"> <li class="col_5  pL0"> <label>Pick Up From</label> <div class="search-bar  grey_border clearfix"> <input type="text" class="sfield w95pcnt ui-autocomplete-input" name="searchterm" placeholder="From" id="search" autocomplete="off"> <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/search_icon.png" id="cars_detail1" style="width:16px"> </div> </li> <li class="col_3  pR0 pL0"> <label>Pick Up Date and Time</label> <input id="datepicker34" class="w86pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_2  pR0 pL0 "> <label>&nbsp;</label> <select> <option value="08:00">08:00</option> </select> </li> </ul> <ul class="mB10 mT10 clearfix"> <li class="col_12 pL0"> <span class="input_fields_wrap"></span> </li><li class="col_12 clearfix"><span class="fR mR15 mT10 clearfix"><a href="javascript:void(0);" class="add_field_button"><span class="add_details_icon mR5"></span><span class="posR">Add Location</span></a></span> </li> <li class="col_5  pL0 clearfix"> <label>Drop Off At </label> <div class="search-bar  grey_border clearfix"> <input type="text" class="sfield w95pcnt ui-autocomplete-input" name="searchterm" placeholder="From" id="search" autocomplete="off"> <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/search_icon.png" id="cars_detail1" style="width:16px"> </div> </li> <li class="col_3  pR0 pL0"> <label>Drop Off Date and Time</label> <input id="datepicker35" class="w86pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_2  pR0 pL0"> <label>&nbsp;</label> <select> <option value="08:00">08:00</option> </select> </li><li class="col_2"></li> </ul> <div id="addfields"> </div> <div class="clearfix mT20"> <input type="checkbox" id="addreturntarns" /> <label for="addreturntrans">Add A Return Transfer</label> </div> <div id="addreturntransContr" class="dN"> <span><span class="fW600">Houghton Street,London</span> to  <span class="fW600">Heathrow Airport, London</span><br/> <ul class="mB10 mT20 clearfix"> <li class="col_3 pL0"> <label>Pick Up Date &amp; Time</label> <input id="datepicker36" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_2 pL0"> <label>&nbsp;</label> <select> <option value="08:00">08:00</option> </select></li><li class="col_3  pL0"> <label>Drop Off Date &amp; Time</label> <input id="datepicker37" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_2 pL0 pR0"> <label>&nbsp;</label> <select> <option value="08:00">08:00</option> </select> </li> </ul> </div><div class="clearfix"></div> <div class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);" id="newsearch" class="dN mR15" style="display:none;">Search package</a> <a href="javascript:void(0);">Search </a></div>');
	}
	if(optText== 'Cruise')
	{
	$('#globalSrcContr5').html('<div class="container"> <ul class="col_12 clearfix pL0 "> <li>  <label>Destination</label> <div class="search-bar grey_border clearfix"><input type="text" class="sfield w95pcnt ui-autocomplete-input" name="searchterm" placeholder="From"  autocomplete="off" > <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/destination_from.png">  </div></li> </ul> <ul class="mT10 mB10 clearfix"> <li class="col_6 pR0 pL0"> <label>Month of departure</label> <select><option>Select one</option> <option>January 2015</option> <option>February 2015</option> <option>March 2015</option></select> </li> <li class="col_6 "> <label>Themes</label> <dl class="dropdown1">  <dt><a href="javascript:void(0);" class="grey_border fL" style=" width: 281px;"> <span class="hida">All </span> <p class="multiSel1" ></p> </a> <span class="downArrow_icon pD5 fR mLN20 mTN20 pD15"></span></dt> <dd><div class="mutliSelect1"><ul style=" width:100%; "><li>	<input type="checkbox" value="All" checked="checked" id="selectalltheme"/><label>All</label></li>	<li><input type="checkbox" value="Bed and Breakfast" checked="checked" class="checkbox1"/><label>Bed and Breakfast</label></li>	<li><input type="checkbox" value="Boutique Hotel" checked="checked" class="checkbox1"/><label>Boutique Hotel</label></li><li><input type="checkbox" value="Guest House" checked="checked" class="checkbox1"/><label>Guest House</label></li><li><input type="checkbox" value="Heritage Hotel" checked="checked" class="checkbox1" /><label>Heritage Hotel</label></li><li><input type="checkbox" value="Home Stay" checked="checked" class="checkbox1"/><label>Home Stay</label></li><li><input type="checkbox" value="Resort" checked="checked" class="checkbox1"/><label>Resort</label></li><li><input type="checkbox" value="Serviced Apartments" checked="checked" class="checkbox1" /><label>Serviced Apartments</label></li></ul></div></dd></dl><p class="multiSel1 cB">  </p>  </li> </ul>   <div id="room143"> <ul class="row mB10 mT15 clearfix"> <li id="singleRooms" class="col_2"> <label>Cabins</label> <select id="noOfRooms" onchange="showCabins();" class="searchbtn"> <option value="1">1</option> <option value="2">2</option> <option value="3">3</option> </select> </li> <li id="groupBookingRooms" class="col_2 dN"> <label>Cabins</label> <select class="searchbtn"> <option value="9">9</option> <option value="10">10</option> <option value="11">11</option> <option value="12">12</option> <option value="13">13</option> <option value="14">14</option> <option value="15">15</option> <option value="16">16</option> <option value="17">17</option> <option value="18">18</option> <option value="19">19</option> <option value="20">20</option> <option value="21">21</option> <option value="22">22</option> <option value="23">23</option> <option value="24">24</option> <option value="25">25</option> <option value="26">26</option> <option value="27">27</option> <option value="28">28</option> <option value="29">29</option> <option value="30">30</option> </select> </li> <li id="groupBookingRooms" class="col_2 dN"> <label>Cabins</label> <select class="searchbtn"> <option value="9">9</option> <option value="10">10</option> <option value="11">11</option> <option value="12">12</option> <option value="13">13</option> <option value="14">14</option> <option value="15">15</option> <option value="16">16</option> <option value="17">17</option> <option value="18">18</option> <option value="19">19</option> <option value="20">20</option> <option value="21">21</option> <option value="22">22</option> <option value="23">23</option> <option value="24">24</option> <option value="25">25</option> <option value="26">26</option> <option value="27">27</option> <option value="28">28</option> <option value="29">29</option> <option value="30">30</option> </select> </li> <li class="col_2 pR0 singleRoom"> <span class="mT30 fL">Cabin 1:</span> </li> <li class="col_2 pL0 singleRoom"> <label>Adult</label> <div class="passengerNum4 fL searchbtn"> <span class="control addMinControl minusControl" onclick="adultCountDec(\'hAdult_143\',1)">-</span> <span id="hAdult_143" class="control innerTxtControl">1</span> <span class="control addMinControl plusControl" onclick="adultCountInc(\'hAdult_143\',1)">+</span> </div> <input type="text" placeholder="1" maxlength="3" class="w100pcnt dN"/> <span class="fS11 fL w100pcnt">12+ yrs</span> </li> <li class="col_1_half col_2_sm  pR0 pL0"> <label>Children</label> <div class="passengerNum5 fL searchbtn"> <span class="control addMinControl minusControl" onclick="childCountDec(\'hChild_143\',1),remChild(1);">-</span> <span id="hChild_143" class="control innerTxtControl">0</span> <span class="control addMinControl plusControl" onclick="childCountInc(\'hChild_143\',1),addChild(1)">+</span> </div> <input type="text" placeholder="0" maxlength="3" class="w100pcnt dN"/> <span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li> <li class="col_4 pR0 pL0 singleRoom"> <ul> <li class="col_6  pR0 pL0" id="child1_1"></li> <li class="col_6 mB10"  id="child1_2"></li> <li class="col_6 pR0 mL10" id="child1_3"></li> <li class="col_6  pR0 mL10"  id="child1_4"></li> <li class="col_6 pR0 mL10" id="child1_5"></li> <li class="col_6  pR0 mL10" id="child1_6"></li> <li class="col_6  pR0 mL10" id="child1_7"></li> <li class="col_6  pR0 mL10" id="child1_8"></li> <li class="col_6  pR0 mL10"  id="child1_9"></li> </ul> </li> </ul> </div> <div id="room243" class="singleRoom"></div> <div id="room343" class="singleRoom"></div><p class="  pB10 clearfix" id="flightOpt"> <a href="javascript:void(0);"><img src="images/collapse_blu.png" alt="Arrow" class="mR5 fL mT5" />Cruise Options</a> (Budget, Star rating, Cruise liner, Cruise length) </p> <div class="clearfix dN" id="flightContr" > <ul class="clearfix"> <li class="col_6"> <label>Budget (per person)</label> <div id="slider-range" class="mL10"></div> <input type="text" id="amount" class="rangeTxt" readonly style="  background: transparent;" />  </li> <li class="col_6 pR0"> <label>Star Rating</label> <div class="fL mR15"> <input type="checkbox" name="check" /> <label><span class="trvGrp">5</span></label> </div> <div class="fL mR15"> <input type="checkbox" name="check" /> <label><span class="trvGrp">4</span></label> </div> <div class="fL mR15"> <input type="checkbox" name="check" /> <label><span class="trvGrp">3</span></label> </div> <div class="fL mR15"> <input type="checkbox" name="check" /> <label><span class="trvGrp">2</span></label> </div> <div class="fL mR15"> <input type="checkbox" name="check" /> <label><span class="trvGrp">1</span></label> </div> </li> </ul> <ul class="mT10 clearfix"> <li class="col_6"> <label>Cruise liner</label> <select><option> All liners</option> <option>Carnival Legend</option> <option>Caribbean Princess</option> <option>Crown Princess</option> </select> </li> <li class="col_6"> <label>Cruise length</label> <select class="pT5"><option> All length</option> <option>1 - 2 Nights</option> <option>3 - 5 Nights</option> <option>6 - 9 Nights</option> </select> </li> </ul> </div> </div><div class="clearfix"></div> <div class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);">Search </a></div>');
	}
	if(optText== 'Visa')
	{
	$('#globalSrcContr5').html('<ul class="col_12 pL0 mT10 mB10 clearfix"> <li class="col_6"> <label>Country</label><div class="search-bar grey_border clearfix"><input type="text" class="sfield w95pcnt ui-autocomplete-input" name="searchterm" placeholder="Enter country"  autocomplete="off" style="color:#000" > <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/destination_from.png" >  </div></li><li class="col_6"> <label>Passport Issued In</label><div class="search-bar grey_border clearfix"><input type="text" class=" txtClrBlk sfield w95pcnt ui-autocomplete-input" name="searchterm"  autocomplete="off" style="color:#000;" > </div></li> </ul><ul class="col_12 pL0 mT10 mB10 clearfix"><li class="col_6"><label>Date Of Issue</label><select class="col_3 mR5"><option>DD</option><option>1</option><option>2</option><option>3</option><option>4</option><option>5</option><option>6</option><option>7</option><option>8</option><option>9</option><option>10</option><option>11</option><option>12</option><option>13</option><option>14</option><option>15</option><option>16</option><option>17</option></select><select class="col_3 mR5"><option>MM</option><option>January</option><option>February</option><option>March</option><option>April</option><option>May</option><option>June</option><option>July</option><option>August</option><option>September</option><option>October</option><option>November</option><option>December</option></select><select class="col_3"><option>YY</option><option>2000</option><option>2001</option><option>2002</option><option>2003</option><option>2004</option><option>2005</option><option>2006</option><option>2007</option><option>2008</option><option>2009</option><option>2010</option><option>2011</option><option>2012</option><option>2013</option><option>2014</option><option>2015</option></select></li><li class="col_6"><label>Expiry Date</label><select class="col_3 mR5"><option>DD</option><option>1</option><option>2</option><option>3</option><option>4</option><option>5</option><option>6</option><option>7</option><option>8</option><option>9</option><option>10</option><option>11</option><option>12</option><option>13</option><option>14</option><option>15</option><option>16</option><option>17</option></select><select class="col_3 mR5"><option>MM</option><option>January</option><option>February</option><option>March</option><option>April</option><option>May</option><option>June</option><option>July</option><option>August</option><option>September</option><option>October</option><option>November</option><option>December</option></select><select class="col_3"><option>YY</option><option>2000</option><option>2001</option><option>2002</option><option>2003</option><option>2004</option><option>2005</option><option>2006</option><option>2007</option><option>2008</option><option>2009</option><option>2010</option><option>2011</option><option>2012</option><option>2013</option><option>2014</option><option>2015</option></select></li></ul> 	<div class="clearfix"></div> <div class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);">Search </a></div>');
	}
	if(optText== 'Flights + Hotels + Cars')
	{
	$('#globalSrcContr5').html('<ul class="flightWayTab mB20 clearfix"> <li class="first" id="flight_hotel_way3"><a href="javascript:void(0);" onclick="flight_hotel_way1(\'flight_hotel_way3\', \'flight_hotel_wayContr3\'),reset()"><span class="oneway_icon" title="One way"></span></a></li> <li class="last sel" id="flight_hotel_way4"><a href="javascript:void(0);" onclick="flight_hotel_way1(\'flight_hotel_way4\', \'flight_hotel_wayContr4\'),reset()"><span class="twoway_icon" title="Return"></span></a></li> </ul> <!--oneway start--> <div id="flight_hotel_wayContr3" class="dN"> <ul class="mB10 clearfix"> <li class="col_6 pR0 pL0"> <div class="search-bar grey_border clearfix"> <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="owFlightFrom1" /> <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/destination_from.png" /> </div> </li> <li class="col_6 pR0"> <div class="search-bar grey_border clearfix"> <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="owFlightTo1" /> <input type="image" class="toDestination" name="search" alt="Search" title="Search" src="images/destination_to.png" /> </div> </li> </ul> <ul class="row mB10 clearfix"> <li class="col_6 pR0"> <label>Departure</label> <input id="datepicker38" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_6"> <label class="txtClrlitGry">Return</label> <input id="datepicker14" class="w100pcnt " type="text" placeholder="DD/MM/YYYY" disabled="disabled" /> </li> </ul> <ul class="row mB10 clearfix"> <li class="col_6 pR0"> <label>Hotel</label> <div class="search-bar grey_border clearfix"> <input type="text" class="sfield city w95pcnt" name="searchterm" placeholder="Enter city" id="hotelDestination1" data-co-field="hotelLocation" /> <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/destination_from.png" /> </div>   </li> <li class="col_12 cB"></li> <li class="col_5  pR0 mT20 " > <label>Check-in</label> <input id="datepicker50" class="w100pcnt dateField enabledate" type="text" placeholder="DD/MM/YYYY"   /> <input id="datepicker39" class="w100pcnt dateField showdate dN" type="text" placeholder="DD/MM/YYYY"  readonly /> </li> <li class="col_5   mT20 " > <label>Check-out</label> <input id="datepicker40" class="w100pcnt dateField " type="text" placeholder="DD/MM/YYYY" readonly /> </li><li class="col_2 pL0 mT20"><label>Night(s)</label><input type="text" class="w100pcnt" id="nights" disabled=""><span id="msg"></span> </li> </ul>  <div id="room1"> <ul class="row mB10 mT15 clearfix"> <li  class="col_2"> <label>Rooms</label> <select id="noOfRooms" onChange="showRoom();"> <option value="1">1</option> <option value="2">2</option> <option value="3">3</option> </select> </li> <li  class="col_2 dN"> <label>Rooms</label> <select> <option value="9">9</option> <option value="10">10</option> <option value="11">11</option> <option value="12">12</option> <option value="13">13</option> <option value="14">14</option> <option value="15">15</option> <option value="16">16</option> <option value="17">17</option> <option value="18">18</option> <option value="19">19</option> <option value="20">20</option> <option value="21">21</option> <option value="22">22</option> <option value="23">23</option> <option value="24">24</option> <option value="25">25</option> <option value="26">26</option> <option value="27">27</option> <option value="28">28</option> <option value="29">29</option> <option value="30">30</option> </select> </li> <li class="col_2 pR0 singleRoom"> <span class="mT30 fL">Room 1:</span> </li> <li class="col_2 pL0 singleRoom"> <label>Adult</label> <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onClick="adultCountDec(\'fhcAdult_1\',1)">-</span> <span id="fhcAdult_1" class="control innerTxtControl">1</span> <span class="control addMinControl plusControl" onClick="adultCountInc(\'fhcAdult_1\',1)">+</span> </div> <input type="text" placeholder="1" maxlength="3" class="aInput5 w100pcnt dN" /> <span class="fS11 fL w100pcnt">12+ yrs</span> </li> <li class="col_2 pL0 singleRoom"> <label>Children</label> <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onClick="childCountDec(\'fhcChild_1\',1),remChild(1);">-</span> <span id="fhcChild_1" class="control innerTxtControl">0</span> <span class="control addMinControl plusControl" onClick="childCountInc(\'fhcChild_1\',1),addChild(1)">+</span> </div> <input type="text" placeholder="0"  maxlength="3" class="cInput5 w100pcnt dN"/> <span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li> <li class="col_2 pL10"> <label>Infant</label><div class="passengerNum1 fL"> <span class="control addMinControl minusControl")">-</span> <span class="control innerTxtControl" id="owInfant">0</span> <span class="control addMinControl plusControl">+</span> </div><input type="text" placeholder="00" maxlength="3" class="w86 aInput1 dN blink" /><span class="fS11 fL w100pcnt">0 - 2 yrs</span> </li> <li class="col_4 mB10 singleRoom"> <ul> <li class="col_6 mB10 pR0" id="child1_1"></li> <li class="col_6 mB10 pR0" id="child1_2"></li> <li class="col_6 mB10 pR0" id="child1_3"></li> <li class="col_6 mB10 pR0" id="child1_4"></li> <li class="col_6 mB10 pR0" id="child1_5"></li> <li class="col_6 mB10 pR0" id="child1_6"></li> <li class="col_6 mB10 pR0" id="child1_7"></li> <li class="col_6 mB10 pR0" id="child1_8"></li> <li class="col_6 mB10 pR0" id="child1_9"></li> </ul> </li> </ul> </div> <div id="room2" class="singleRoom"></div> <div id="room3" class="singleRoom"></div>  <div class="cB"></div> <span class="clearfix mT10 mB10">An economy car will be added to your search. (You may change your car options later.) </span> <div class="cB"></div> <div class="mT40" onclick="chkGroupDetails(6)"> <input type="checkbox" id="GroupBooking6" /> <label for="GroupBooking6" class=" w50pcnt">Group booking request (9+Pax)</label> </div> <div id="gBookingContr6" class="dN"> <label>Add note <span class="fS12">(Max. 100 characters)</span></label> <textarea maxlength="100" id="noteContent6" class="w100pcnt mB5"></textarea> <span><span id="charCount6">0</span> of 100</span><br> <p class="fS12 mB15">Note : We do not accept group enquiries on Sundays, Holidays and Saturdays after 1300 hrs IST </p> </div>   </div>  <!--twoway start--> <div id="flight_hotel_wayContr4"> <ul class="mB10 clearfix"> <li class="col_6 pR0 pL0"> <div class="search-bar grey_border clearfix"> <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="twflightFrom1" /> <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/destination_from.png" /> </div> </li> <li class="col_6 pR0"> <div class="search-bar grey_border clearfix"> <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="twflightTo1" /> <input type="image" class="toDestination" name="search" alt="Search" title="Search" src="images/destination_to.png" /> </div> </li> </ul> <ul class="row mB10 clearfix"> <li class="col_6 pR0"> <label>Departure</label> <input id="datepicker41" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_6"> <label>Return</label> <input id="datepicker42" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> </ul>  <ul class="mB10 clearfix"> <li class="col_6 pR0 pL0"> <label>Hotel</label> <div class="search-bar grey_border clearfix"> <input type="text" class="sfield city w95pcnt" name="searchterm" placeholder="Enter city" id="hotelDestination2" data-co-field="hotelLocation" /> <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/destination_from.png" /> </div>   </li> <li class="col_6 mT30"> <input type="checkbox" class="myckeckbox1" /> <label >Hotel stay at different dates</label> </li> <li class="col_12 cB"></li> <li class="col_5 pL0 pR0 mT20 dateshow dN "> <label>Check-in</label> <input id="datepicker43"  class="w100pcnt dateField "  type="text" placeholder="DD/MM/YYYY" readonly />  </li> <li class="col_5 pR0 mT20 dateshow dN "> <label>Check-out</label><input id="datepicker44"  class="w100pcnt dateField " type="text" placeholder="DD/MM/YYYY" readonly />  </li> <li class="col_2 mT20 dateshow dN"><label>Night(s)</label><input type="text" class="w100pcnt" id="nights" disabled /><span id="msg"></span> </li></ul>  <div id="rooms1"> <ul class="row mB10 mT15 clearfix"> <li id="singleRooms" class="col_2"> <label>Rooms</label> <select id="roomCount" onChange="showRooms();"> <option value="1">1</option> <option value="2">2</option> <option value="3">3</option> </select> </li> <li id="groupBookingRooms" class="col_2 dN"> <label>Rooms</label> <select> <option value="9">9</option> <option value="10">10</option> <option value="11">11</option> <option value="12">12</option> <option value="13">13</option> <option value="14">14</option> <option value="15">15</option> <option value="16">16</option> <option value="17">17</option> <option value="18">18</option> <option value="19">19</option> <option value="20">20</option> <option value="21">21</option> <option value="22">22</option> <option value="23">23</option> <option value="24">24</option> <option value="25">25</option> <option value="26">26</option> <option value="27">27</option> <option value="28">28</option> <option value="29">29</option> <option value="30">30</option> </select> </li> <li class="col_2 pR0 singleRoom"> <span class="mT30 fL">Room 1:</span> </li> <li class="col_2 pL0 singleRoom"> <label>Adult</label> <div class="passengerNum6 fL"> <span class="control addMinControl minusControl" onClick="adultCountDecrease(\'fhcAdult1_1\',1)">-</span> <span id="fhcAdult1_1" class="control innerTxtControl">1</span> <span class="control addMinControl plusControl" onClick="adultCountIncrease(\'fhcAdult1_1\',1)">+</span> </div> <input type="text" placeholder="1" maxlength="3" class="aInput6 w100pcnt dN" /> <span class="fS11 fL w100pcnt">12+ yrs</span> </li> <li class="col_2 pL0 singleRoom"> <label>Children</label> <div class="passengerNum6 fL"> <span class="control addMinControl minusControl" onClick="childCountDecrease(\'fhcChild1_1\',1),remChild1(4);">-</span> <span id="fhcChild1_1" class="control innerTxtControl">0</span> <span class="control addMinControl plusControl" onClick="childCountIncrease(\'fhcChild1_1\',1),addChild1(4)">+</span> </div> <input type="text" placeholder="0"  maxlength="3" class="cInput6 w100pcnt dN"/> <span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li><li class="col_2 pL10"> <label>Infant</label><div class="passengerNum1 fL"> <span class="control addMinControl minusControl")">-</span> <span class="control innerTxtControl" id="owInfant">0</span> <span class="control addMinControl plusControl">+</span> </div><input type="text" placeholder="00" maxlength="3" class="w86 aInput1 dN blink" /><span class="fS11 fL w100pcnt">0 - 2 yrs</span> </li> <li class="col_4 mB10 singleRoom"> <ul> <li class="col_6 mB10 pR0" id="child41"></li> <li class="col_6 mB10 pR0" id="child42"></li> <li class="col_6 mB10 pR0" id="child43"></li> <li class="col_6 mB10 pR0" id="child44"></li> <li class="col_6 mB10 pR0" id="child45"></li> <li class="col_6 mB10 pR0" id="child46"></li> <li class="col_6 mB10 pR0" id="child47"></li> <li class="col_6 mB10 pR0" id="child48"></li> <li class="col_6 mB10 pR0" id="child49"></li> </ul> </li> </ul> </div> <div id="rooms2" class="singleRoom"></div> <div id="rooms3" class="singleRoom"></div> <div class="cB"></div> <span class="clearfix mT10 mB10">An economy car will be added to your search. (You may change your car options later.) </span> <div class="cB"></div> <div class="mT40" onclick="chkGroupDetails(8)"> <input type="checkbox" id="GroupBooking8" /> <label for="GroupBooking8" class=" w50pcnt">Group booking request (9+Pax)</label> </div> <div id="gBookingContr8" class="dN"> <label>Add note <span class="fS12">(Max. 100 characters)</span></label> <textarea maxlength="100" id="noteContent8" class="w100pcnt mB5"></textarea> <span><span id="charCount8">0</span> of 100</span><br> <p class="fS12 mB15">Note : We do not accept group enquiries on Sundays, Holidays and Saturdays after 1300 hrs IST </p> </div> <div class="cB"></div>   </div>  <div class="cB"></div> <div id="searchBtn" class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);" id="srcBtn" onclick="redirectSearch()">Search</a></div>');
	}
	if(optText== 'Forex')
	{
	$('#globalSrcContr5').html('<ul class="mB10 clearfix"> <li class="col_3  pL0"><input type="radio" name="options" checked="checked" onclick="buyForex()"/> <label>Buying</label></li> <li class="col_3 pR0 pL0"><input type="radio" name="options" onclick="sellForex();"/> <label>Selling</label></li></ul><ul class="mB10 clearfix"> <li class="col_3 pR0 pL0"> <label>Purpose of Travel</label> <select> <option value="Personal">Personal</option> <option value="Personal">Personal</option> </select> </li> </ul> <ul class="row mB10 clearfix"> <li class="col_4  "> <label>Product</label> <select> <option value="cash">Cash</option> <option value="cash">Cash</option> </select> </li> <li class="col_4  "> <label>Currency</label> <select> <option value="usdollar">US Dollar</option> <option value="euro">Euro</option> </select> </li> <li class="col_4 "> <label>Amount</label> <input type="text" placeholder="Amount" id="forexinpt1" class="w100pcnt" style="color:#000 !important" /> </li> </ul><ul class="row mB10 clearfix "> <li class="col_4 "> &nbsp; </li> <li class="col_4   "> <div class="detailContr"></div> <div class="detailContr_inner tC clearfix"> Rate: Rs. 64.56  </div> </li> <li class="col_4  forexview1_amt dN"> <div class="detailContr"></div> <div class="detailContr_inner tC clearfix"> Amount: <span id="amtshow">1, 04,000</span>  </div> </li> </ul> <ul class="mT20 clearfix"> <li class="clearfix mT10"><span><a href="javascript:void(0);" class="add_traveller_button"><span class="add_details_icon mR5"></span><span class="posR">Add More</span></a></span> </li> </ul> <ul class="row mB10 mT10 clearfix"> <li class="col_4  clearfix"> <label>Pickup location</label> <select> <option value="dadar">Dadar</option> <option value="andheri">Andheri</option> </select> </li> <li class="col_4  clearfix"> <label>Mobile number</label> <input type="text" placeholder="Mobile number" class="w100pcnt " />  </li> <li class="col_4 "> <label>Email Address</label> <input type="text" placeholder="Email Address" class="w100pcnt " /> </li> </ul><div class="cB"></div> <div  class="primaryBtn fR mT15 mB15" id="buyforex"><a href="javascript:void(0);" >Buy Forex</a></div> <div  class="primaryBtn fR mT15 mB15 dN" id="sellforex"><a href="javascript:void(0);" >Sell Forex</a></div>');
	}
	
	if(optText== 'Rail')
	{
	$('#globalSrcContr5').html('<ul class="flightWayTab mB20 clearfix"> <li class="first sel" id="way15"><a href="javascript:void(0);" onclick="eurailtype1(\'way15\', \'wayContr15\'),reset()">Ticket</a></li> <li class="" id="way16"><a href="javascript:void(0);" onclick="eurailtype1(\'way16\', \'wayContr16\'),reset()">Pass</a></li> <li class="last" id="way17"><a href="javascript:void(0);" onclick="eurailtype1(\'way17\', \'wayContr17\'),reset()">Reservation</a></li> </ul> <div id="wayContr15" class="clearfix">  <ul class="mB10 clearfix"> <li class="col_2_half pR0 pL0"> <label>Starting from</label> <input type="text" class="w95pcnt" name="startfrom" placeholder="From" /> </li> <li class="col_1 pR0"> <span class="mT20 tC oneway_icon"> </li> <li class="col_2_half pR0 pL0"> <label>Going to</label> <input type="text" class="w95pcnt" name="to" placeholder="To" /> </li> <li class="col_2_half pR0 pL0"> <label>Departure</label> <input id="datepicker12" class="w90pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_2 pR0 pL0"> <label>Time</label> <select> <option value="08:00">08:00</option> </select> </li> </ul> <div id="addfields"> </div> <div class="fR clearfix mB10  pR0"> <div class="fR mT10"><a href="javascript:void(0);" id="addfieldbtn"><span class="add_details_icon mR5 fL"></span><span class="posR fL" >Add city</span></a></div> </div> <ul class="row mB10">  <li class="col_2 pR10"> <label>Adult</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'owChild5\')">-</span> <span class="control innerTxtControl" id="owChild5">1</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'owChild5\')">+</span> </div> <span class="fS11 fL w100pcnt">26 - 59 yrs</span> </li><li class=" col_2 pR10"> <label>Child</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Child\')">-</span> <span class="control innerTxtControl" id="Child">0</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Child\')">+</span> </div><span class="fS11 fL w100pcnt">0 - 12 yrs</span> </li> <li class="col_2 pR10"> <label>Youth</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Youth\')">-</span> <span class="control innerTxtControl" id="Youth">1</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Youth\')">+</span> </div>  <input type="text" placeholder="00" maxlength="3" class="w86 aInput1 dN" /> <span class="fS11 fL w100pcnt">12 - 26 yrs</span> </li> <li class="col_2 pR10"> <label>Senior</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Senior\')">-</span> <span class="control innerTxtControl" id="Senior">0</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Senior\')">+</span> </div> <span class="fS11 fL w100pcnt">59+ yrs</span> </li> </ul> <div class="cB"></div>  <div class="col_12 fL pL0 mB20 mT20"> <a href="javascript:void(0)" class="eurailopt"> + Eurail options (class, stops, refunds)</a> <section class= " col_12 pL0 pR0 clearfix dN eurailoptdetails" style="display: none;"> <ul class="row clearfix"> <li class="col_4 mT20"> <label>Class</label> <select class="w100pcnt"> <option value="economy">Economy</option> </select> </li> <li class="col_4 pL0 pR0" style="margin-top:50px;"><input type="checkbox"> <label>Show me direct trains only</label> </li> <li class="col_4 pL0 pR0" style="margin-top:50px;"><input type="checkbox"> <label>Show me refundable ticket only</label> </li>  </ul> </section> </div>  </div> <div id="wayContr16" class="dN"> <ul class="mB10 clearfix"> <li class="col_5 pL0"> <label>Country</label> <input type="text" class="w95pcnt" name="Country" placeholder="Country" /> </li> <li class="col_3"> <label>No. of days</label> <select> <option value="1">1</option> </select> </li> </ul> <div id="addcountry"> </div> <div class="col_10 clearfix mB10 mR20"> <div class="mT10 fR"><a href="javascript:void(0);" id="addcountrybtn"><span class="add_details_icon mR5 fL"></span><span class="posR fL">Add Country</span></a></div>  </div>  <ul class="row mB10 clearfix">  <li class="col_2"> <label>Adult</label> <div class="passengerNum2 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'twChild6\')">-</span> <span class="control innerTxtControl" id="twChild6">1</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'twChild6\')">+</span> </div> <span class="fS11 fL w100pcnt">26 - 59 yrs</span> </li><li class=" col_2 pR10"> <label>Child</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Child21\')">-</span> <span class="control innerTxtControl" id="Child21">0</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Child21\')">+</span> </div><span class="fS11 fL w100pcnt">0 - 12 yrs</span> </li> <li class="col_2 pR10"> <label>Youth</label>  <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Youth1\')">-</span> <span class="control innerTxtControl" id="Youth1">1</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Youth1\')">+</span> </div>  <span class="fS11 fL w100pcnt">12 - 26 yrs</span> </li> <li class="col_2 pR10"> <label>Senior</label> <div class="passengerNum2 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Senior1\')">-</span> <span class="control innerTxtControl" id="Senior1">0</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Senior1\')">+</span> </div> <span class="fS11 fL w100pcnt">59+ yrs</span> </li> </ul> <div class="cB"></div> </div> <div id="wayContr17" class="clearfix dN"> <ul class="mB10 clearfix"> <li class="col_6 pR0 pL0"> <label>Select pass</label> <select class="w80pcnt pT5"> <option>Algeria</option> </select> </li>  <li class="col_2 mT20 pR0 pL0"> <input type="radio" name="class" checked="checked"/><label>Economy</label> </li> <li class="col_2 mT20 pR0 pL0"> <input type="radio" name="class" /><label>Comfort</label> </li> <li class="col_2 mT20 pR0 pL0"> <input type="radio" name="class" /><label>Premiere</label> </li> </ul> <ul class="mT20 clearfix"> <li class="col_2_half pR0 pL0"> <label>Starting from</label> <input type="text" class="w95pcnt" name="startfrom" placeholder="From" /> </li> <li class="col_1 pR0"> <span class="mT20 tC oneway_icon"></span> </li> <li class="col_2_half pR0 pL0"> <label>Going to</label> <input type="text" class="w95pcnt" name="to" placeholder="To" /> </li> <li class="col_3 pR0 "> <label>Departure</label> <input id="datepicker13" class="w86pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_2 pR0 pL0"> <label>Time</label> <select> <option value="08:00">08:00</option> </select> </li> </ul> <div id="addfieldsreserv"> </div> <div class="col_12 clearfix mB10 pR0"> <div class="fR mT10"><a href="javascript:void(0);" id="addfieldreservbtn"><span class="add_details_icon mR5 fL"></span><span class="posR fL" >Add city</span></a></div> </div> <ul class="row mB10">  <li class="col_2 pR10"> <label>Adult</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'owChild7\')">-</span> <span class="control innerTxtControl" id="owChild7">1</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'owChild7\')">+</span> </div> <span class="fS11 fL w100pcnt">26 - 59 yrs</span> </li><li class=" col_2 pR10"> <label>Child</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Child32\')">-</span> <span class="control innerTxtControl" id="Child32">0</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Child32\')">+</span> </div><span class="fS11 fL w100pcnt">0 - 12 yrs</span> </li> <li class="col_2 pR10"> <label>Youth</label>  <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Youth3\')">-</span> <span class="control innerTxtControl" id="Youth3">1</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Youth3\')">+</span> </div>  <input type="text" placeholder="00" maxlength="3" class="w86 aInput1 dN" /> <span class="fS11 fL w100pcnt">12 - 26 yrs</span> </li> <li class="col_2 pR10"> <label>Senior</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Senior3\')">-</span> <span class="control innerTxtControl" id="Senior3">0</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Senior3\')">+</span> </div> <span class="fS11 fL w100pcnt">59+ yrs</span> </li> </ul>  <div class="cB"></div>  </div><div class="clearfix"></div> <div class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);">Search </a></div>');
	}
	if(optText== 'Insurance')
	{
	$('#globalSrcContr5').html('<ul class="col_12 mT10 mB10 clearfix"><li class="col_4 pL0"><label>Destination</label><select><option>All</option><option>India</option><option>China</option><option>USA</option></select></li><li class="col_4 pL0"><label>Insurance Type</label><select><option>Select</option><option>Corporate</option><option>Leisure</option><option>Senior Citizen</option></select></li><li class="col_4 pL0"><label>No. Of Trips</label><select id="security_question_1" name="security_question_1" onchange="check_dd();"><option value="Single"> Single</option><option value="Multiple"> Multiple</option></select></li></ul><div id="single_entry"><ul class="col_12 mT10 mB10 clearfix"> <li class="col_4_half pL0"> <label>Departure</label> <input id="datepicker45" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_4_half pL0"> <label>Arrival</label> <input id="datepicker46" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_3 pL0"> <label>Day(s)</label> <input type="text" class="w100pcnt" placeholder="0" disabled /></li></ul></div><div id="multiple_entry" style="display:none;"><ul class="col_12 mT10 mB10 clearfix"> <li class="col_4_half pL0"> <label>Start Date</label> <input id="datepicker45" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_4_half pL0"> <label>Arrival</label> <input id="datepicker46" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" disabled /> </li> <li class="col_3 pL0"> <label>Duration</label> <select><option>30 Days</option><option>45 Days</option><option>60 Days</option></select> </li> </ul> </div><div class="col_2 pR0 mT40"><span class=" mT10 fW500 clearfix">Date Of Birth</span></div> <div class="col_8 pL0"><ul class="col_12 mT10 mB10 clearfix"> <li class="col_12 pL0 pR0 mB10 clearfix cB"><label>Traveller1</label><select class="pD0 fL mR10 w60"><option value="dd.">dd</option> </select>	<select class="pD0 mR10 w60 fL"><option value="mm">mm</option> </select> <select class="fL mR10 w130"><option value="yyyy">yyyy</option> </select> </li> <li class="col_12 pL0 clearfix cB"> <span class="input_traveller_wrap"></span> </li> </ul><span class="dB w100pcnt mT10 mB20 tR clearfix"><a href="javascript:void(0);" class="add_traveller_button"><span class="add_details_icon mR5 valign"></span><span class="posR">Add Traveller</span></a></span> </div><div class="clearfix"></div> <div class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);">Generate Quote</a></div>');
	$('#searchBtn').hide();
	}
	$.widget( "custom.catcomplete", $.ui.autocomplete, {
    _create: function() {
      this._super();
      this.widget().menu( "option", "items", "> :not(.ui-autocomplete-category)" );
    },
    _renderMenu: function( ul, items ) {
		 ul.append( "<li class='ui-autocomplete-category' style='color:#fff;'><span class='button-primary mR10 pD5 fcwht'>Railways</span><span class=' button-primary mR10 pD5'>Airports</span><span class=' button-primary mR10 pD5 '>Area</span><span class=' button-primary mR10 pD5 '>Landmark</span><span class=' button-primary mR10 pD5'>Ports</span></li>" );
      var that = this,
        currentCategory = "";
      $.each( items, function( index, item ) {
	  
        var li;
        if ( item.category != currentCategory ) {
          ul.append( "<li class='ui-autocomplete-category'>" + item.category + "</li>" );
          currentCategory = item.category;
        }
        li = that._renderItemData( ul, item );
        if ( item.category ) {
          li.attr( "aria-label", item.category + " : " + item.label );
        }
      });
    }
	
  });
 
 $.widget( "custom.catcomplete1", $.ui.autocomplete, {
    _create: function() {
      this._super();
      this.widget().menu( "option", "items", "> :not(.ui-autocomplete-category)" );
    },
    _renderMenu: function( ul, items ) {
		
      var that = this,
        currentCategory = "";
      $.each( items, function( index, item ) {
	  
        var li;
        if ( item.category != currentCategory ) {
          ul.append( "<li class='ui-autocomplete-category grey_bg pD5 mL10 mT10 fW600' style='margin-right:10px !important;'>" + item.category + "</li>" );
          currentCategory = item.category;
        }
        li = that._renderItemData( ul, item );
        if ( item.category ) {
          li.attr( "aria-label", item.category + " : " + item.label );
		}
      });
	  ul.append('<li class="col_12 clearfix mB10"><p class="button-primary tC w100pcnt pD5"><a href="javascript:void(0);" style="color:#fff !important;">Find more results</a></p></li>');
    }
	
  });

	  $(function() {
    var data = [
      { label: "Paris", category: "" },
      { label: "City 1 Country 1", category: "Destination" },
      { label: "City 2 Country 1", category: "Destination" },
      { label: "City 3 Country 2", category: "Destination" },
      { label: "Experience Listing1 City1", category: "Experience" },
      { label: "Experience Listing2 Country1", category: "Experience" },
      { label: "Experience Listing3 Region1", category: "Experience" },
      { label: "Activity Listing 1 City 1 ", category: "Activities" },
      { label: "Activity Listing 2 City 2 ", category: "Activities" },
      { label: "Activity Listing 3 City 3  ", category: "Activities" }
    ];
	

	
	$('#autosuggest1').on('click', function (e) {
		 $('#cars_detailCntr1').slideToggle("slow");
		 
	});	
    $( "#search1" ).catcomplete1({
      delay: 0,
      source: data,
	  width: 350
				
    });
  });
 
$(".dropdown1 dt a").on('click', function () {
$(".dropdown1 dd ul").slideToggle('fast');
});
$(".dropdown1 dt span").on('click', function () {
$(".dropdown1 dt a").trigger('click');
});

$(".dropdown1 dd ul li a").on('click', function () {
$(".dropdown1 dd ul").hide();
});
$('.mutliSelect1 input[type="checkbox"]').on('click', function () {
        
          var title = $(this).closest('.mutliSelect1').find('input[type="checkbox"]').val(),
              title = $(this).val() + " ";
        
          if ($(this).is(':checked')) {
		
          } 
          else {
              $('span[title="' + title + '"]').remove();
              var ret = $(".hida");
              $('.dropdown1 dt a').append(ret);
              
          }  
		  $('.multiSel1').html('');
			 $( ".chk" ).each(function( ) {
				 if ($('#checkAll').is(':checked')) {
				 var all = '<span title="' + title + '">' + title + '</span>';
				 $('.multiSel1').html(all);
					  }
				else{
					if ($(this).is(':checked')) {
					title = $(this).val() + " ";
						
				    var html = '<span title="' + title + '">' + title + '</span>';
				 $('.multiSel1').append(html);
				}
				}
				
			 });
		  
		  var n = $( ".multiSel1 span" ).length;
		  if(n>0)
		  $('.multiSelStatus').html('</span>Selected themes</span>');
		  else
		  $('.multiSelStatus').html('<span>Select themes</span>');
		
      });
	  
$(".dropdown2 dt a").on('click', function () {
$(".dropdown2 dd ul").slideToggle('fast');
});
$(".dropdown2 dt span").on('click', function () {
$(".dropdown2 dt a").trigger('click');
});

$(".dropdown2 dd ul li a").on('click', function () {
$(".dropdown2 dd ul").hide();
});
$('.mutliSelect2 input[type="checkbox"]').on('click', function () {
        
          var title = $(this).closest('.mutliSelect2').find('input[type="checkbox"]').val(),
              title = $(this).val() + " ";
        
          if ($(this).is(':checked')) {
		
          } 
          else {
              $('span[title="' + title + '"]').remove();
              var ret = $(".hidd");
              $('.dropdown2 dt a').append(ret);
              
          }  
		  $('.multiSel2').html('');
			 $( ".chk" ).each(function( ) {
				 if ($('#checkAll').is(':checked')) {
				 var all = '<span title="' + title + '">' + title + '</span>';
				 $('.multiSel2').html(all);
					  }
				else{
					if ($(this).is(':checked')) {
					title = $(this).val() + " ";
						
				    var html = '<span title="' + title + '">' + title + '</span>';
				 $('.multiSel2').append(html);
				}
				}
				
			 });
		  
		  var n = $( ".multiSel2 span" ).length;
		  if(n>0)
		  $('.multiSelStatus1').html('</span>Selected themes</span>');
		  else
		  $('.multiSelStatus1').html('<span>Select themes</span>');
		
      });
  	$('#forexinpt1').on('change', function (e) {
		
		 $('#amtshow').html($('#forexinpt1').val() *64);
				
		$('.forexview1_amt').show("slow");
		
		 
	
	});
	  $('#search').on('autocompletechange change', function () {

	  if(this.value == "Paris")
		$("#newsearch").show();
		else
		$("#newsearch").hide();
  });
    $('.myckeckbox2').change(function(){
        if(this.checked){
            $('.showdate').fadeIn('fast');
            $('.enabledate').hide();}
        else{
            $('.showdate').fadeOut('fast');
            $('.enabledate').show();}

    });
	
	 $('.myckeckbox1').change(function(){
        if(this.checked){
            $('.dateshow').show();
            $('.enabledate1').hide();}
        else{
            $('.dateshow').hide();
            $('.enabledate1').show();}

    });
	  $('.myckeckbox').change(function(){
        if(this.checked){
            $('.datep').show();
            $('.hidedate').hide();}
        else{
            $('.datep').hide();
		  $('.hidedate').show();}
    });
  $('.secTab li').on('click', function (e) {
		$(".customScroll").customScrollbar();
	});
	
	$('.ppHrdr').on('click', function (e) {
		$(".customScroll").customScrollbar();
	});	

	var $items = $('ul.srpOfferTab>li');
		$items.click(function() {
			$items.removeClass('sel');
			$(this).addClass('sel');
		
			var index = $items.index($(this));
			$('.diyContrs .diyContr').hide().eq(index).show();
		}).eq(0).click();
		
   $('#addreturntarns').on('change', function (e) {
	if($(this).is(":checked"))
			 $('#addreturntransContr').show();
			 else
			$('#addreturntransContr').hide();
	
	});
	  $(function() {
    var data = [
      { label: "Paris", category: "" },
      { label: "Charles de Gaulle Airport", category: "Airports" },
      { label: "Orly Airport", category: "Airports" },
      { label: "Beauvais Tille Airport", category: "Airports" },
      { label: "Paris – Le Bourget Airport ", category: "Airports" },
      { label: "Chalons Vatry Airport", category: "Airports" },
      { label: "Gare D’Austerlitz", category: "Railway stations" },
      { label: "Gare de Bercy", category: "Railway stations" },
      { label: "Gare de Lyon", category: "Railway stations" },
      { label: "Gare Montparnasse ", category: "Railway stations" },
      { label: "Gare Saint Lazare", category: "Railway stations" },
      { label: "Bastille", category: "Area" },
      { label: "Montparnasse", category: "Area" },
      { label: "Belleville ", category: "Area" }
    ];
	
	
var max_fields12      = 40; //maximum input boxes allowed
var wrapper12         = $("#addcountry"); //Fields wrapper
var add_button12      = $("#addcountrybtn"); //Add button ID
var x = 1; //initlal text box count
$(add_button12).click(function(e){ //on add input button click
e.preventDefault();
if(x < max_fields12){ //max input box allowed
x++; //text box increment
$(wrapper12).append('<ul class="mB10 clearfix"><li class="col_5 pL0"> <label>Country</label><input type="text" class="w95pcnt" name="Country" placeholder="Country" /> </li><li class="col_3"> <label>No. of days</label><select>  <option value="1">1</option>  </select> </li> <li class="col_2 mT30 pR0 remove_field"><span class="popup_close_icon"></span></li> </ul>'); //add input box
}
});

$(wrapper12).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x--;
});
 var max_fields      = 40; //maximum input boxes allowed
    var wrapper         = $(".input_fields_wrap"); //Fields wrapper
    var add_button      = $(".add_field_button"); //Add button ID
    
    var x = 1; //initlal text box count
    $(add_button).click(function(e){ //on add input button click
        e.preventDefault();
        if(x < max_fields){ //max input box allowed
            x++; //text box increment
            $(wrapper).append('<ul class="mB10 clearfix"><li class="col_12 pL0 pR0"><label>Via</label><input type="text"  name="startfrom" placeholder="From" style="width:50%" class="fL" /><a href="javascript:void(0);" class="fL mL15 mT5 remove_field"><span class="popup_close_icon"></span></a></li></ul>'); //add input box
        }
    });
    
    $(wrapper).on("click",".remove_field", function(e){ //user click on remove text
        e.preventDefault(); $(this).parent('li').remove(); x--;
    })
	
	$('#cars_detail1').on('click', function (e) {
		 $('#cars_detailCntr').slideToggle("slow");
		 $(this).toggleClass("active");
		 if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/search_icon.png');		   
		}else{
			$(this).find('img').attr('src','images/search_icon.png');
		}
	});	
    $( "#search" ).catcomplete({
      delay: 0,
      source: data,
	  width: 350
				
    });
  });
 
	tabContainer.css('display', 'block').trigger('click');
	$('div#moreNav > a').trigger('click');
	var optCont = $('ul#moreOpt');
	optCont.removeClass('show_options').css('display', 'none');
	$("#moreNav").removeClass('sel');
	
		
		 var max_fields      = 40; //maximum input boxes allowed
    var wrapper         = $(".input_fields_wrap"); //Fields wrapper
    var add_button      = $(".add_field_button"); //Add button ID
    
    var x = 1; //initlal text box count
    $(add_button).click(function(e){ //on add input button click
        e.preventDefault();
        if(x < max_fields){ //max input box allowed
            x++; //text box increment
            $(wrapper).append('<ul class="mB10 clearfix"><li class="col_12 pL0 pR0"><label>Via</label><input type="text" class="w51pcntimp" name="startfrom" placeholder="From" /><a href="javascript:void(0);" class="fR remove_field">Remove</a></li></ul>'); //add input box
        }
    });
    
    $(wrapper).on("click",".remove_field", function(e){ //user click on remove text
        e.preventDefault(); $(this).parent('li').remove(); x--;
    })
	if($().slider){
		$( "#slider-range" ).slider({
			range: true,
			min: 0,
			max: 100000,
			values: [ 0, 30000 ],
			slide: function( event, ui ) {
				$( "#amount" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
			}
		});
		$( "#amount" ).val( $( "#slider-range" ).slider( "values", 0 ) +" - " + $( "#slider-range" ).slider( "values", 1 ) );
	}
	$('.eurailopt').on('click', function (e) {
$(this).parents('div').find('.eurailoptdetails').slideToggle();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text(' - Eurail options (class, stops, refunds)');
}else{
$(this).text(' + Eurail options (class, stops, refunds)');
}
});


 var max_fields      = 40; //maximum input boxes allowed
    var wrapper         = $(".input_traveller_wrap"); //Fields wrapper
    var add_button      = $(".add_traveller_button"); //Add button ID
    var id1=0;
	var id2=80
	var x1=1; //initlal text box count
    var x2=0
    $(add_button).click(function(e){ //on add input button click
        e.preventDefault();
        if(x2 < max_fields){ //max input box allowed
            x2++; //text box increment
			id1=1+x2;
			if(x1<max_fields)
			x1++;
			id2=80+x1;{
			e.preventDefault();
            $(wrapper).append('<li class="col_12 mB10 pL0 pR0 clearfix"><label>Traveller '+id1+'</label><select class="pD0 fL mR10 w60"><option value="dd.">dd</option> </select>	<select class="pD0 mR10 w60 fL"><option value="mm">mm</option> </select> <select class="fL mR10 w130"><option value="yyyy">yyyy</option> </select><a href="javascript:void(0);" class="fL  remove_field"><span class="popup_close_icon"></span></a></li>'); //add input box
			}
        }
		if($().datepicker){
$( "#datepicker81, #datepicker82, #datepicker83, #datepicker84, #datepicker85, #datepicker86, #datepicker87, #datepicker88, #datepicker89, #datepicker90, #datepicker91, #datepicker92, #datepicker93, #datepicker94" ).datepicker({
		numberOfMonths:2,
		 minDate: 0,
		dateFormat: "dd/mm/yy",
		onSelect: function(dateText){
			  $(this).css("color","#333333");		
			  }
		});
		}
    });
    
    $(wrapper).on("click",".remove_field", function(e){ //user click on remove text
        e.preventDefault(); $(this).parent('li').remove(); x2--;
    })
 
var max_fields3      = 10; //maximum input boxes allowed
var wrapper3         = $("#addfields"); //Fields wrapper
var add_button3      = $("#addfieldbtn"); //Add button ID
var id3=60;
var id4=1;
var x3 = 1;
var x4 = 0;	//initlal text box count
$(add_button3).click(function(e){ //on add input button click
e.preventDefault();
if(x3 < max_fields3 || x4 < max_fields3){ //max input box allowed
x3++; //text box increment
x4++;
id3=60+x3;
id4=1+x4;
$(wrapper3).append('<ul class="mB10 clearfix">  <li class="col_2_half pR0 pL0"><label>Starting from '+id4+'</label><input type="text" class="w95pcnt" name="startfrom" placeholder="From" /></li> <li class="col_1 pR0"><span class="mT25 oneway_icon"></li><li class="col_2_half pR0 pL0"><label>Going to</label> <input type="text" class="w95pcnt" name="to" placeholder="To" /></li><li class="col_2_half pR0 pL0"><label>Departure</label><input id="datepicker'+id3+'" class="w90pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li><li class="col_2 pR0 pL0"> <label>Time</label><select><option value="08:00">08:00</option> </select> </li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li> </ul>'); //add input box
}
if($().datepicker){
$( "#datepicker61, #datepicker62, #datepicker63, #datepicker64, #datepicker65, #datepicker66, #datepicker67, #datepicker68, #datepicker69, #datepicker70, #datepicker72, #datepicker71, #datepicker72, #datepicker73" ).datepicker({
numberOfMonths:2,
minDate: 0,
dateFormat: "dd/mm/yy",
onSelect: function(dateText){
$(this).css("color","#333333");
}
});
}
});
$(wrapper3).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x3--;id3--;
})

	
var max_fields      = 40; //maximum input boxes allowed
var wrapper1         = $("#addfieldsreserv"); //Fields wrapper
var add_button1      = $("#addfieldreservbtn"); //Add button ID
var id1=25;
var x1= 1; //initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=25+x1;
$(wrapper1).append('<ul class="mB10 mT10 clearfix">  <li class="col_2_half pR0 pL0"><label>Starting from</label><input type="text" class="w95pcnt" name="startfrom" placeholder="From" /></li><li class="col_1 pR0"><span class="mT20 tC oneway_icon"></span></li>  <li class="col_2_half pR0 pL0"><label>Going to</label> <input type="text" class="w95pcnt" name="to" placeholder="To" /></li><li class="col_3 pR0 "><label>Departure</label><input id="datepicker'+id1+'" class="w86pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li><li class="col_2 pR0 pL0"> <label>Time</label><select><option value="08:00">08:00</option> </select> </li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li> </ul>'); //add input box
}
if($().datepicker){
$( "#datepicker25, #datepicker26, #datepicker27, #datepicker28, #datepicker29, #datepicker30, #datepicker31, #datepicker32, #datepicker33, #datepicker34, #datepicker35, #datepicker36, #datepicker37, #datepicker38" ).datepicker({
numberOfMonths:2,
minDate: 0,
dateFormat: "dd/mm/yy",
onSelect: function(dateText){
$(this).css("color","#333333");
}
});
}
});
$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;
})



$(document).ready(function () {
    $('#flightOpt').on('click', function (e) {
        $("#flightContr").slideToggle("slow");
        $(this).toggleClass("active");
        if ($(this).hasClass('active')) {
            $(this).find('img').attr('src','images/expand_blu.png');           
        }else{
            $(this).find('img').attr('src','images/collapse_blu.png');
			}
    });
});	
if($().datepicker){
$( "#datepicker8,#datepicker9,#datepicker13,#datepicker14,#datepicker15,#datepicker17,#datepicker18,#datepicker19,#datepicker20,#datepicker21,#datepicker22,#datepicker23,#datepicker24,#datepicker26,#datepicker25,#datepicker28,#datepicker28,#datepicker30,#datepicker31,#datepicker32,#datepicker33,#datepicker34,#datepicker35,#datepicker36,#datepicker37,#datepicker38,#datepicker39,#datepicker40,#datepicker41,#datepicker42,#datepicker43,#datepicker44,#datepicker45,#datepicker46,#datepicker47,#datepicker48,#datepicker49,#datepicker50,#datepicker51,#datepicker52,#datepicker53,#datepicker54,#datepicker55,#datepicker56,#datepicker57,#datepicker58,#datepicker59,#datepicker60" ).datepicker({
		numberOfMonths:2,
		 minDate: 0,
		dateFormat: "dd/mm/yy",
		onSelect: function(dateText){
			  $(this).css("color","#333333");		
			  }
		});
		}
});

//handle tab
$('#mainNav li').click(function(evt) {
	evt.preventDefault();
	evt.stopPropagation();
	$('#mainNav li').removeClass('sel');
	$('.tab_content').css('display', 'none');
	$(this).addClass('sel');
	var content = $(this).attr('data-container');
	$('#' + content).css('display', 'block');
	var optCont = $('ul#moreOpt');
	optCont.removeClass('show_options').css('display', 'none');
	$("#moreNav").removeClass('sel');
});

$('div#moreNav > a').bind('click', function(evt) {
        evt.preventDefault();
        evt.stopPropagation();
        var optCont = $('ul#moreOpt');
        if (optCont.hasClass('show_options')) {
            optCont.removeClass('show_options').css('display', 'none');
            $(this).parent('div').removeClass('sel');
        } else {
            optCont.addClass('show_options').css('display', 'block');
            $(this).parent('div').addClass('sel');
			$("#dotproductNav").removeClass('sel');
			$("#dotprimaryNav").hide();
			
			$(".toggle_menu").removeClass("sel");
			$(".menu_items").hide();
        }
    });
	
	
	
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
	}
		document.getElementById(selTab).className = 'sel';
		if(selTab == 'viewTab1'){
			document.getElementById(selTab).className = 'first sel';
			$('.filterCtr').show();	
			$(".filterOpt").removeClass('col_12');			
		}
		if(tabs == 3 && selTab == 'viewTab3'){
			document.getElementById("viewTab3").className = 'last sel';	
		}
		if(tabs == 2 && selTab == 'viewTab2'){
			document.getElementById("viewTab2").className = 'last sel';	
			$('.filterCtr').hide();	
				$(".filterOpt").addClass('col_12');
		}
		document.getElementById(selCont).style.display = 'block'
}

function mycarousel_initCallback(carousel)
{
    // Disable autoscrolling if the user clicks the prev or next button.
    carousel.buttonNext.bind('click', function() {
        carousel.startAuto(0);
    });

    carousel.buttonPrev.bind('click', function() {
        carousel.startAuto(0);
    });

    // Pause autoscrolling if the user moves with the cursor over the clip.
    carousel.clip.hover(function() {
        carousel.stopAuto();
    }, function() {
        carousel.startAuto();
    });
};

var quote = 0;
function addQuote(h){
	if(document.getElementById("shortlist" + h).checked == true)
		quote++;
	else if(document.getElementById("shortlist" + h).checked == false)	
		quote--;
	$("#shortListNo").html(quote)	
}
function showHide(divID, imgID){
	
		
		if( document.getElementById('selectContainer1').style.display == "none")
		{
			document.getElementById('addSFlight').style.display = "none";
			document.getElementById('dirImg').src = "Images/bin.png";
		document.getElementById('dirImg').style.display = "block";
			document.getElementById('selectContainer1').style.display = "block";
		}
		else{
		document.getElementById('addSFlight').style.display = "block";
			document.getElementById('selectContainer1').style.display = "none";
			document.getElementById('dirImg').src = "Images/bin.png";
		document.getElementById('dirImg').style.display = "none";
		
		}
		document.getElementById('selflight1').style.display = 'none';
		document.getElementById('selflight3').style.display = 'none';
		document.getElementById('selflight4').style.display = 'none';
		document.getElementById('selflight5').style.display = 'none';
		
		if((document.getElementById('selectContainer1').style.display == 'none') && (document.getElementById('selectContainer2').style.display == 'none'))
	{
		document.getElementById("btmTop").style.display = "none";
		document.getElementById("workselect").style.display = "none";
		}
		if((document.getElementById('selectContainer1').style.display == 'none') || (document.getElementById('selectContainer2').style.display == 'none'))
		{
		document.getElementById("selectBookingdisabled").style.display = "block";
		document.getElementById("selectBooking").style.display = "none";
		document.getElementById('compPrice').innerHTML = '18,418';
		}
}
function showHide1(divID, imgID){
	
		
		if( document.getElementById('selectContainer2').style.display == "none")
		{
			document.getElementById('addRFlight').style.display = "none";
			document.getElementById('dirImg2').src = "Images/bin.png";
		document.getElementById('dirImg2').style.display = "block";
		
		
		}
		else{
			document.getElementById('addRFlight').style.display = "block";
			document.getElementById('selectContainer2').style.display = "none";
			document.getElementById('dirImg2').src = "Images/bin.png";
		document.getElementById('dirImg2').style.display = "none";
		
		}
		
		document.getElementById('selflight2').style.display = 'none';
		document.getElementById('selflight6').style.display = 'none';
		document.getElementById('selflight7').style.display = 'none';
		document.getElementById('selflight8').style.display = 'none';
		if((document.getElementById('selectContainer1').style.display == 'none') && (document.getElementById('selectContainer2').style.display == 'none'))
		{
		document.getElementById("btmTop").style.display = "none";
		document.getElementById("workselect").style.display = "none";
		}
		if((document.getElementById('selectContainer1').style.display == 'none') || (document.getElementById('selectContainer2').style.display == 'none'))
		{
		document.getElementById("selectBookingdisabled").style.display = "block";
		document.getElementById("selectBooking").style.display = "none";
		document.getElementById('compPrice').innerHTML = '18,418';
		}
	
}
function selectFlight(flightNo,path){
	if(path == "arrival"){
		document.getElementById('flightArrival' + flightNo).className = 'clearfix posR brdrBLitGry ';
		document.getElementById('selflight1').style.display = 'block';
		document.getElementById('selflight3').style.display = 'none';
		document.getElementById('selflight4').style.display = 'none';
		document.getElementById('selflight5').style.display = 'none';
		document.getElementById('btmTop').style.display = 'block';
		
		if(document.getElementById('selectContainer2').style.display  == 'none'){
			document.getElementById("addRFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '2,418';
		}
		else{
			document.getElementById('compPrice').innerHTML = '37,780';
		}
			
		document.getElementById('selectContainer1').innerHTML = '<div class="mB10 clearfix"><span class="fW600">BOM – DEL</span> , <span>25 Sep 2014</span></div><div class="col_4 pR0 pL0"><div><img src="images/indigo_vsmllogo_sqr.png" alt="IndiGo logo" /></div><div class="fS12"><span>IndiGo</span> <br /><span>6E 198</span> </div></div><div class="col_8 pR0 pL0 mTN5"><div class="fS12 mB5">05:30 - 06:35</div><div class="fS12">1h 5m | Non stop</div></div>';
		document.getElementById("selectContainer1").style.display = "block";
		document.getElementById("addSFlight").style.display = "none";
			document.getElementById('dirImg').style.display = "block";
	}if(path == "arrivalmat"){
		document.getElementById('flightArrival' + flightNo).className = 'clearfix posR brdrBLitGry ';
		document.getElementById('selflightmat1').style.display = 'block';
		document.getElementById('btmTop').style.display = 'block';
		
		if(document.getElementById('selectContainer2').style.display  == 'none'){
			document.getElementById("addRFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '2,418';
		}
		else{
			document.getElementById('compPrice').innerHTML = '37,780';
		}
			
		document.getElementById('selectContainer1').innerHTML = '<div class="mB10 clearfix"><span class="fW600">BOM – DEL</span> , <span>25 Sep 2014</span></div><div class="col_4 pR0 pL0"><div><img src="images/indigo_vsmllogo_sqr.png" alt="IndiGo logo" /></div><div class="fS12"><span>IndiGo</span> <br /><span>6E 198</span> </div></div><div class="col_8 pR0 pL0 mTN5"><div class="fS12 mB5">05:30 - 06:35</div><div class="fS12">1h 5m | Non stop</div></div>';
		document.getElementById("selectContainer1").style.display = "block";
		document.getElementById("addSFlight").style.display = "none";
			document.getElementById('dirImg').style.display = "block";
	}
	if(path == "arrival1"){
		document.getElementById('flightArrival' + flightNo).className = 'clearfix posR brdrBLitGry ';
		document.getElementById('selflight3').style.display = 'block';
		document.getElementById('selflight1').style.display = 'none';
		document.getElementById('selflight4').style.display = 'none';
		document.getElementById('selflight5').style.display = 'none';
		document.getElementById('btmTop').style.display = 'block';
		
		if(document.getElementById('selectContainer2').style.display  == 'none'){
			document.getElementById("addRFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '2,418';
		}
		else{
			document.getElementById('compPrice').innerHTML = '37,780';
		}
			
		document.getElementById('selectContainer1').innerHTML = '<div class="mB10 clearfix"><span class="fW600">BOM – DEL</span> , <span>25 Sep 2014</span></div><div class="col_4 pR0 pL0"><div><img src="images/indigo_vsmllogo_sqr.png" alt="IndiGo logo" /></div><div class="fS12"><span>IndiGo</span> <br /><span>6E 198</span> </div></div><div class="col_8 pR0 pL0 mTN5"><div class="fS12 mB5">05:30 - 06:35</div><div class="fS12">1h 5m | Non stop</div></div>';
		document.getElementById("selectContainer1").style.display = "block";
		document.getElementById("addSFlight").style.display = "none";
			document.getElementById('dirImg').style.display = "block";
	}
	if(path == "arrival2"){
		document.getElementById('flightArrival' + flightNo).className = 'clearfix posR brdrBLitGry ';
		document.getElementById('selflight4').style.display = 'block';
		document.getElementById('selflight3').style.display = 'none';
		document.getElementById('selflight1').style.display = 'none';
		document.getElementById('selflight5').style.display = 'none';
		document.getElementById('btmTop').style.display = 'block';
		
		if(document.getElementById('selectContainer2').style.display  == 'none'){
			document.getElementById("addRFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '2,418';
		}
		else{
			document.getElementById('compPrice').innerHTML = '37,780';
		}
			
		document.getElementById('selectContainer1').innerHTML = '<div class="mB10 clearfix"><span class="fW600">BOM – DEL</span> , <span>25 Sep 2014</span></div><div class="col_4 pR0 pL0"><div><img src="images/indigo_vsmllogo_sqr.png" alt="IndiGo logo" /></div><div class="fS12"><span>IndiGo</span> <br /><span>6E 198</span> </div></div><div class="col_8 pR0 pL0 mTN5"><div class="fS12 mB5">05:30 - 06:35</div><div class="fS12">1h 5m | Non stop</div></div>';
		document.getElementById("selectContainer1").style.display = "block";
		document.getElementById("addSFlight").style.display = "none";
		document.getElementById('dirImg').style.display = "block";
	}
	if(path == "arrival3"){
		document.getElementById('flightArrival' + flightNo).className = 'clearfix posR brdrBLitGry ';
		document.getElementById('selflight5').style.display = 'block';
		document.getElementById('selflight3').style.display = 'none';
		document.getElementById('selflight4').style.display = 'none';
		document.getElementById('selflight1').style.display = 'none';
		document.getElementById('btmTop').style.display = 'block';
		
		if(document.getElementById('selectContainer2').style.display  == 'none'){
			document.getElementById("addRFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '2,418';
		}
		else{
			document.getElementById('compPrice').innerHTML = '37,780';
		}
			
		document.getElementById('selectContainer1').innerHTML = '<div class="mB10 clearfix"><span class="fW600">BOM – DEL</span> , <span>25 Sep 2014</span></div><div class="col_4 pR0 pL0"><div><img src="images/indigo_vsmllogo_sqr.png" alt="IndiGo logo" /></div><div class="fS12"><span>IndiGo</span> <br /><span>6E 198</span> </div></div><div class="col_8 pR0 pL0 mTN5"><div class="fS12 mB5">05:30 - 06:35</div><div class="fS12">1h 5m | Non stop</div></div>';
		document.getElementById("selectContainer1").style.display = "block";
		document.getElementById("addSFlight").style.display = "none";
		document.getElementById('dirImg').style.display = "block";
	}
	if(path == "return"){
		document.getElementById('flightDeparture' + flightNo).className = 'clearfix posR brdrBLitGry ';
		document.getElementById('selflight2').style.display = 'block';
		document.getElementById('selflight6').style.display = 'none';
		document.getElementById('selflight7').style.display = 'none';
		document.getElementById('selflight8').style.display = 'none';
		document.getElementById('btmTop').style.display = 'block';
		
		if(document.getElementById('selectContainer1').style.display  == 'none'){
			document.getElementById("addSFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '18,418';
		}
		else{
			document.getElementById('compPrice').innerHTML = '2,418';
		}
			
		document.getElementById('selectContainer2').innerHTML = '<div class="mB10 clearfix"><span class="fW600">DEL – BOM</span> , <span>27 Sep 2014</span></div><div class="col_4 pR0 pL0"><div><img src="images/spiceJet_vsmllogo_sqr.png" alt="Spice Jet logo" /></div><div class="fS12"><span>Spice Jet</span><br /><span>SG 153</span></div></div><div class="col_8 pR0 pL0 mTN5"><div class="fS12 mB5">05:30 - 06:35</div><div class="fS12">1h 5m | Non stop</div></div>';
		document.getElementById("selectContainer2").style.display = "block";
		document.getElementById("addRFlight").style.display = "none";
		document.getElementById('dirImg2').style.display = "block";
	}
	
	if(path == "return2"){
		document.getElementById('flightDeparture' + flightNo).className = 'clearfix posR brdrBLitGry ';
		document.getElementById('selflight6').style.display = 'block';
		document.getElementById('selflight2').style.display = 'none';
		document.getElementById('selflight7').style.display = 'none';
		document.getElementById('selflight8').style.display = 'none';
		document.getElementById('btmTop').style.display = 'block';
		
		if(document.getElementById('selectContainer1').style.display  == 'none'){
			document.getElementById("addSFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '18,418';
		}
		else{
			document.getElementById('compPrice').innerHTML = '2,418';
		}
			
		document.getElementById('selectContainer2').innerHTML = '<div class="mB10 clearfix"><span class="fW600">DEL – BOM</span> , <span>27 Sep 2014</span></div><div class="col_4 pR0 pL0"><div><img src="images/spiceJet_vsmllogo_sqr.png" alt="Spice Jet logo" /></div><div class="fS12"><span>Spice Jet</span><br /><span>SG 153</span></div></div><div class="col_8 pR0 pL0 mTN5"><div class="fS12 mB5">05:30 - 06:35</div><div class="fS12">1h 5m | Non stop</div></div>';
		document.getElementById("selectContainer2").style.display = "block";
		document.getElementById("addRFlight").style.display = "none";
			document.getElementById('dirImg2').style.display = "block";
	}
	if(path == "return3"){
		document.getElementById('flightDeparture' + flightNo).className = 'clearfix posR brdrBLitGry ';
		document.getElementById('selflight7').style.display = 'block';
		document.getElementById('selflight6').style.display = 'none';
		document.getElementById('selflight2').style.display = 'none';
		document.getElementById('selflight8').style.display = 'none';
		document.getElementById('btmTop').style.display = 'block';
		
		if(document.getElementById('selectContainer1').style.display  == 'none'){
			document.getElementById("addSFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '18,418';
		}
		else{
			document.getElementById('compPrice').innerHTML = '2,418';
		}
			
		document.getElementById('selectContainer2').innerHTML = '<div class="mB10 clearfix"><span class="fW600">DEL – BOM</span> , <span>27 Sep 2014</span></div><div class="col_4 pR0 pL0"><div><img src="images/spiceJet_vsmllogo_sqr.png" alt="Spice Jet logo" /></div><div class="fS12"><span>Spice Jet</span><br /><span>SG 153</span></div></div><div class="col_8 pR0 pL0 mTN5"><div class="fS12 mB5">05:30 - 06:35</div><div class="fS12">1h 5m | Non stop</div></div>';
		document.getElementById("selectContainer2").style.display = "block";
		document.getElementById("addRFlight").style.display = "none";
			document.getElementById('dirImg2').style.display = "block";
	}
	if(path == "return4"){
		document.getElementById('flightDeparture' + flightNo).className = 'clearfix posR brdrBLitGry ';
		document.getElementById('selflight8').style.display = 'block';
		document.getElementById('selflight6').style.display = 'none';
		document.getElementById('selflight7').style.display = 'none';
		document.getElementById('selflight2').style.display = 'none';
		document.getElementById('btmTop').style.display = 'block';
		
		if(document.getElementById('selectContainer1').style.display  == 'none'){
			document.getElementById("addSFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '18,418';
		}
		else{
			document.getElementById('compPrice').innerHTML = '2,418';
		}
			
		document.getElementById('selectContainer2').innerHTML = '<div class="mB10 clearfix"><span class="fW600">DEL – BOM</span> , <span>27 Sep 2014</span></div><div class="col_4 pR0 pL0"><div><img src="images/spiceJet_vsmllogo_sqr.png" alt="Spice Jet logo" /></div><div class="fS12"><span>Spice Jet</span><br /><span>SG 153</span></div></div><div class="col_8 pR0 pL0 mTN5"><div class="fS12 mB5">05:30 - 06:35</div><div class="fS12">1h 5m | Non stop</div></div>';
		document.getElementById("selectContainer2").style.display = "block";
		document.getElementById("addRFlight").style.display = "none";
			document.getElementById('dirImg2').style.display = "block";
	}
	if((document.getElementById('selectContainer1').innerHTML != '') && (document.getElementById('selectContainer2').innerHTML != ''))
	{
		document.getElementById("selectBooking").style.display = "block";
		document.getElementById("selectBookingdisabled").style.display = "none";
		}
	else	
		document.getElementById("selectBooking").style.display = "none";
		
		document.getElementById("workselect").style.display = "table";
		
		
}


// get the max height of a collection of elements using map
var maxHeight = Math.max.apply(null, $(".sameHeight").map(function ()
{
    return $(this).outerHeight();
}).get());
// set all divs to the same height
$('.sameHeight').css({ height: maxHeight + 'px' });




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
            document.getElementById('fLeg' + i).className = 'wayNum';
			document.getElementById('fLeg_port' + i).className = 'wayNum';
            document.getElementById('multiWayTop' + i).className = 'wayNum fL';
            document.getElementById('multiWayMid' + i).className = 'wayNum fL';
           // document.getElementById('multiWayBtm' + i).className = 'wayNum fL';
        }
    }

    function selectSlide(slideNumber) {
        resetClasses();
        document.getElementById('fLeg' + slideNumber).className = 'wayNum sel';
		document.getElementById('fLeg_port' + slideNumber).className = 'wayNum sel';
        document.getElementById('multiWayTop' + slideNumber).className = 'wayNum sel fL';
        document.getElementById('multiWayMid' + slideNumber).className = 'wayNum sel fL';
        //document.getElementById('multiWayBtm' + slideNumber).className = 'wayNum sel fL';
    }
	
//Hide the datepicker when clicked outside
if( $().datepicker ){
$(document).on("click", function(e) {
    var elem = $(e.target);
    if(!elem.hasClass("hasDatepicker") && 
        !elem.hasClass("ui-datepicker") && 
        !elem.hasClass("ui-icon") && 
        !elem.hasClass("ui-datepicker-next") && 
        !elem.hasClass("ui-datepicker-prev") && 
        !$(elem).parents(".ui-datepicker").length){
            $('.hasDatepicker').datepicker('hide');
    }
});
}

	$(window).resize(function() {
		$(".detail_indContr").hide();
	}); 


 
var leg = 1;
leg1Added = leg2Added = leg3Added = leg4Added = 0;

 
function selectMultiFlight(flightLeg,row){
	document.getElementById('btmTop').style.display = 'block';

	if(flightLeg == 1){
		document.getElementById("selectFlightLeg1").innerHTML = '<div class="fW600 fS21  fR"><br/>+</div><samp class="go_AI"> <span>IndiGo <br />6E 198 </span> </samp> <dfn style="width:73%"><span class="wayNum mR10" id="multiWayBtm1">1</span>Thursday, 25th Sep<br><strong> <small>BOM</small> 05:30 </strong> <ins> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Del</small> 06:35 </strong></dfn> <span class="mT5 fR"><img src="images/bin.png" alt="delete" onclick="deleteSelect(1)" /></span>';
		leg1Added = 1;
			 for(i=11;i<15;i++)
	 {if(i== row)
	 document.getElementById("selectedover"+row).style.display='block';
	 else
	 document.getElementById("selectedover"+i).style.display='none';
	 }
	
 $(document).ready(function () {
	
	$('.nextBtn').trigger('click');
	});
	}

    if(flightLeg == 2){
		document.getElementById("selectFlightLeg2").innerHTML = '<div class="fW600 fS21  fR"><br/>+</div><samp class="go_AI"> <span>IndiGo <br />6E 198 </span> </samp> <dfn  style="width:73%"><span class="wayNum" id="multiWayBtm2">2</span>Thursday, 25th Sep<br><strong> <small>BOM</small> 05:30 </strong> <ins> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Del</small> 06:35 </strong> </dfn><span class="mT5 fR"><img src="images/bin.png" alt="delete" onclick="deleteSelect(2)" /></span>';
		leg2Added = 1;
			 for(i=21;i<25;i++)
	 {if(i== row)
	 document.getElementById("selectedover"+row).style.display='block';
	 else
	 document.getElementById("selectedover"+i).style.display='none';
	 }
		 $(document).ready(function () {
	
	$('.nextBtn').trigger('click');
	});
	}
	if(flightLeg == 3){
        document.getElementById("selectFlightLeg3").innerHTML = '<div class="fW600 fS21  fR"><br/>+</div><samp class="go_AI"> <span>IndiGo <br />6E 198 </span> </samp> <dfn  style="width:73%"><span class="wayNum" id="multiWayBtm3">3</span>Thursday, 25th Sep<br><strong> <small>BOM</small> 05:30 </strong> <ins> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Del</small> 06:35 </strong> </dfn><span class="mT5 fR"><img src="images/bin.png" alt="delete" onclick="deleteSelect(3)" /></span>';
		leg3Added = 1;
			 for(i=31;i<35;i++)
			 {if(i== row)
			 document.getElementById("selectedover"+row).style.display='block';
			 else
			 document.getElementById("selectedover"+i).style.display='none';
			 }
			  $(document).ready(function () {
	
	$('.nextBtn').trigger('click');
	});
	}
	if(flightLeg == 4){
        document.getElementById("selectFlightLeg4").innerHTML = '<div class="fW600 fS21  fR"><br/>+</div><samp class="go_AI"> <span>IndiGo <br />6E 198 </span> </samp> <dfn style="width:73%"><span class="wayNum" id="multiWayBtm4">4</span>Thursday, 27th Sep<br><strong> <small>DEL</small> 04:00 </strong> <ins> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>BOM</small> 05:30 </strong> </dfn><span class="mT5 fR"><img src="images/bin.png" alt="delete" onclick="deleteSelect(4)" /></span>';
		leg4Added = 1;
			 for(i=41;i<45;i++)
	 {if(i== row)
	 document.getElementById("selectedover"+row).style.display='block';
	 else
	 document.getElementById("selectedover"+i).style.display='none';
	 }
		
	}
	
	document.getElementById("totalFare").innerHTML = (37780*leg);

	
	if((leg1Added == 1) && (leg2Added == 1) && (leg3Added == 1) && (leg4Added == 1))
	{
		document.getElementById("selectBooking").style.display = "block";
		document.getElementById("selectBookingdisabled").style.display = "none";
		}
	else
	{
		document.getElementById("selectBooking").style.display = "none";
		document.getElementById("selectBookingdisabled").style.display = "block";
		}	
	if((leg1Added == 1) || (leg2Added == 1) || (leg3Added == 1) || (leg4Added == 1))
	{
		document.getElementById("workselect").style.display = "table";
		document.getElementById("btmTop").style.display = "block";
		}
	else
	{
		document.getElementById("workselect").style.display = "none";
		document.getElementById('btmTop').style.display = "none";
		}
	leg++;

}
function hide(id){
document.getElementById("product"+id).style.display = 'none';
}
function hide1(id){
document.getElementById("product"+id).style.display = 'none';
}

function deleteSelect(id)
{
document.getElementById("selectFlightLeg"+id).innerHTML='<div id="addFlightLeg1" class="addFlight">Add leg '+id+'  <br/>BOM - DEL</div>';
if(id ==4)
{
leg4Added = 0;
 for(i=41;i<45;i++)
			 {
			 document.getElementById("selectedover"+i).style.display='none';
			 }
}if(id ==1)
{
leg1Added = 0;
 for(i=11;i<15;i++)
			 {
			 document.getElementById("selectedover"+i).style.display='none';
			 }
}if(id ==2)
{
leg2Added = 0;
 for(i=21;i<25;i++)
			 {
			 document.getElementById("selectedover"+i).style.display='none';
			 }
}if(id ==3)
{
leg3Added = 0;
 for(i=31;i<35;i++)
			 {
			 document.getElementById("selectedover"+i).style.display='none';
			 }
}
	leg--;
document.getElementById("totalFare").innerHTML = (37780*leg);
		
	if((leg1Added == 1) && (leg2Added == 1) && (leg3Added == 1) && (leg4Added == 1))
	{
		document.getElementById("selectBooking").style.display = "block";
		document.getElementById("selectBookingdisabled").style.display = "none";
		}
	else
	{
		document.getElementById("selectBooking").style.display = "none";
		document.getElementById("selectBookingdisabled").style.display = "block";
		}	
	if((leg1Added == 1) || (leg2Added == 1) || (leg3Added == 1) || (leg4Added == 1))
	{
		document.getElementById("workselect").style.display = "table";
		document.getElementById("btmTop").style.display = "block";
		}
	else
	{
		document.getElementById("workselect").style.display = "none";
		document.getElementById('btmTop').style.display = "none";
		}
}

//Funtion to detect browser and version

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


//Function for multiway carousel
function showtooltipMultiway(parentId, tooltipId, evt)
{
	$("#" + tooltipId).toggle();
	
	var parentElementHeight = $("#" + parentId).height();
	var parentElementWidth = $("#" + parentId).width();
	
	  var left =  ($("#" + parentId).offset().left) - parentElementWidth + 'px';
	  var top =  ($("#" + parentId).offset().top) + parentElementHeight + 'px';
	
	   
	if(navigator.sayswho == 'Firefox 11'){
		
		   var x = document.getElementById(tooltipId);
			
		    x.style.top = ($("#" + parentId).offset().top) + parentElementHeight + 'px';
			x.style.left = (evt.clientX - parentElementWidth) +'px';
		
	}
		
	
	else{
	   $("#" + tooltipId).css(
		  {
			   'left': left,
			   'top': top  	  
		  }
	   );
	 
	    
	   
	  $(window).resize(function(e) {
        $("#" + tooltipId).hide();
    }); 
     
	}
	
	 //Give the tooltip a higher z-index incase it is on an overlay
   if( $('.black_overlay').is(":visible")){
	     $("#" + tooltipId).css(
			  {
				   'z-index': 1060
			  }
		   );
	   }
}

function showtooltip(parentId, tooltipId)
{
   $("#" + tooltipId).toggle();
   
    var parentElementHeight = $("#" + parentId).height();
    var parentElementWidth = $("#" + parentId).width();
	 
   var left =  ($("#" + parentId).offset().left)-40+ 'px';
   var top =  ($("#" + parentId).offset().top) + parentElementHeight -10 + 'px';
   
   $("#" + tooltipId).css(
      {
	       'left': left,
           'top': top
	  }
   );
   //Give the tooltip a higher z-index incase it is on an overlay
   if( $('.black_overlay').is(":visible")){
	     $("#" + tooltipId).css(
			  {
				   'z-index': 1060
			  }
		   );
	   }
  
	   
	  $(window).resize(function(e) {
        $("#" + tooltipId).hide();
    }); 
	   
   $(document).mouseup(function (e)
	 {
		var container = $("#" + tooltipId);
		if (!container.is(e.target) // if the target of the click isn't the container...
			&& container.has(e.target).length === 0) // ... nor a descendant of the container
		{
			container.hide();
			
		}
		
	 });   
}
function showtooltipvisa(parentId, tooltipId)
{
   $("#" + tooltipId).toggle();
   
    var parentElementHeight = $("#" + parentId).height();
    var parentElementWidth = $("#" + parentId).width();
	 
   var left =  ($("#" + parentId).offset().left)-105+ 'px';
   var top =  ($("#" + parentId).offset().top) + parentElementHeight -10 + 'px';
   
   $("#" + tooltipId).css(
      {
	       'left': left,
           'top': top
	  }
   );
   //Give the tooltip a higher z-index incase it is on an overlay
   if( $('.black_overlay').is(":visible")){
	     $("#" + tooltipId).css(
			  {
				   'z-index': 1060
			  }
		   );
	   }
  
	   
	  $(window).resize(function(e) {
        $("#" + tooltipId).hide();
    }); 
	   
   $(document).mouseup(function (e)
	 {
		var container = $("#" + tooltipId);
		if (!container.is(e.target) // if the target of the click isn't the container...
			&& container.has(e.target).length === 0) // ... nor a descendant of the container
		{
			container.hide();
			
		}
		
	 });   
}

function showtooltipcalender(parentId, tooltipId)
{
   $("#" + tooltipId).toggle();
   
    var parentElementHeight = $("#" + parentId).height();
    var parentElementWidth = $("#" + parentId).width();
	 
   var left =  ($("#" + parentId).offset().left)+75+ 'px';
   var top =  ($("#" + parentId).offset().top) + parentElementHeight -10 + 'px';
   
   $("#" + tooltipId).css(
      {
	       'left': left,
           'top': top
	  }
   );
   //Give the tooltip a higher z-index incase it is on an overlay
   if( $('.black_overlay').is(":visible")){
	     $("#" + tooltipId).css(
			  {
				   'z-index': 1060
			  }
		   );
	   }
  
	   
	  $(window).resize(function(e) {
        $("#" + tooltipId).hide();
    }); 
	   
  
}



function showtooltiptimelimit(parentId, tooltipId)
{
   $("#" + tooltipId).toggle();
   
    var parentElementHeight = $("#" + parentId).height();
    var parentElementWidth = $("#" + parentId).width();
	 
   var left =  ($("#" + parentId).offset().left)- parentElementWidth + 'px';
   var top =  ($("#" + parentId).offset().top) + parentElementHeight + 'px';
   
   $("#" + tooltipId).css(
      {
	       'left': left,
           'top': top
	  }
   );
   //Give the tooltip a higher z-index incase it is on an overlay
   if( $('.black_overlay').is(":visible")){
	     $("#" + tooltipId).css(
			  {
				   'z-index': 1060
			  }
		   );
	   }
	   
	   
	  $(window).resize(function(e) {
        $("#" + tooltipId).hide();
    }); 
	   
   $(document).mouseup(function (e)
	 {
		var container = $("#" + tooltipId);
		if (!container.is(e.target) // if the target of the click isn't the container...
			&& container.has(e.target).length === 0) // ... nor a descendant of the container
		{
			container.hide();
			
		}
		
	 });   
}





function showtooltipLarge(parentId, tooltipId)
{
   $("#" + tooltipId).toggle();
   
    var parentElementHeight = $("#" + parentId).height();
    var parentElementWidth = $("#" + parentId).width();
	 
   var left =  ($("#" + parentId).offset().left) - 110 + 'px';
   var top =  ($("#" + parentId).offset().top) + parentElementHeight + 'px';
   
   $("#" + tooltipId).css(
      {
	       'left': left,
           'top': top
	  }
   );
   
   //Give the tooltip a higher z-index incase it is on an overlay
     if( $('.black_overlay').is(":visible")){
	     $("#" + tooltipId).css(
			  {
				   'z-index': 1060
			  }
		   );
	   }
	   
	 
   
}

if($('.compareTable').exists()){
			$('.white_content').scroll(function () {
				
			var y = $(this).scrollTop();
			if (y > 360) {
				$('.compareTable').fadeIn('fast');
			} else {
				$('.compareTable').fadeOut('fast');
			}
		});
   }

 //Delete a column from compare table
   $("table").on("click", ".removeFromCompare", function ( event ) {
	    var compareTable = $(this).parent().index() + 1;
		 var count = $(".removeFromCompare").parent().length;
        if(count>2)
        {
            $("td", event.delegateTarget).remove(":nth-child(" + compareTable + ")");
            $("table.compareTable  td").remove(":nth-child(" + compareTable + ")");
        }
        else{alert("Cannot Delete");}
	});
	
function loadHolidays(holidayPortal,holiday){
	var hName = $("#holidayName" + holidayPortal + "_" + holiday).html();
	$("#holidayDest" + holidayPortal).html(hName)
	
	if(holiday == 1)
		$("#flightAvailable,#activitiesAvailable,#hotelsAvailable,#foodAvailable,#transfersAvailable,#insurancesAvailable").show();
	if(holiday == 2){
		$("#flightAvailable,#activitiesAvailable,#hotelsAvailable,#foodAvailable,#transfersAvailable").show();
		$("#insurancesAvailable").hide();
	}
	if(holiday == 3){
		$("#flightAvailable,#activitiesAvailable,#hotelsAvailable,#transfersAvailable").show();
		$("#foodAvailable,#insurancesAvailable").hide();
	}
	if(holiday == 4){
		$("#flightAvailable,#activitiesAvailable,#hotelsAvailable,#foodAvailable,#insurancesAvailable").show();			
		$("#transfersAvailable").hide();
	}
}


$(window).scroll(function() {
    if ($(this).scrollTop()) {
        $('#toTop').fadeIn();
		
    } else {
        $('#toTop').fadeOut();
    }
});

//Function to scroll to top on click of greeen arrow
	  $('#toTop,#openShortlist, #btn1, .scrollToTop').click(function () {
		$('html, body').animate({
			 scrollTop: '0px'
		 },500);
		 return false;
	 });



function chngVal(obj){
	aa = obj.value;
	window.location.href = aa;
		
}

var shortListedHotel = 0;
/*function compareHotel(compareHotelNo){
	document.getElementById('shortList').style.display = 'block';
	document.getElementById('sortListedName').style.display = "block";
	document.getElementById("clearSlistedItems").style.display = "block";
	document.getElementById("compareSL").style.display = "block";
	document.getElementById('noItems').style.display = "none";
	if(document.getElementById("compare" + compareHotelNo).checked == true)
	{
		document.getElementById('sortListedName').innerHTML += '<div id="shortlistedHotel' + compareHotelNo + '" class=" mB5"><input type="checkbox" name="check" id="slhName' + shortListedHotel + '" checked="checked" /><label for="slhName' + compareHotelNo + '">' + document.getElementById("hotelName" + compareHotelNo).innerHTML + ' &nbsp;&nbsp;<span class="rupee">Rs. </span>' + document.getElementById("hotelPrice" + compareHotelNo).innerHTML + '</label></div>'
		shortListedHotel++;
	}
	else{
		document.getElementById("shortlistedHotel" + compareHotelNo).remove();
		shortListedHotel--;
	}
	if(shortListedHotel == 0){
		document.getElementById('noItems').style.display = "block";
		document.getElementById("clearSlistedItems").style.display = "none";
		document.getElementById("compareSL").style.display = "none";
		document.getElementById('sortListedName').style.display = "none";
		
	}
	document.getElementById('shortListNo').innerHTML = shortListedHotel;
}*/
// var addedHotel = 1;
// function compareHotel(compareHotelNo)
// {
	// if(document.getElementById("compare" + compareHotelNo).checked == true)
	// {
		// document.getElementById('shortlistItemsPanel').style.display = 'block';
	
		// liElem = document.getElementById("shortlisted" + addedHotel);
		// liElem.innerHTML = '<div class="clearfix pL0 searchedResult" id="searchedResult' + compareHotelNo + '"><div class="fL mR10 mT5 mB5"> <img alt="Hotel Thumb" src="images/common/hotel_thumb.png"> </div><div class="fL"><div class="fcWht">' + document.getElementById("hotelName" + compareHotelNo).innerHTML  + '</div><div class="fcWht fS11">Delhi, India</div><div class="fcWht fS11">Standard Double Room with breakfast, 2 nights</div><div class="clearfix"><div class="fS22 fW400 fL fcWht"><span class="rupee">Rs</span>' + document.getElementById("hotelPrice" + compareHotelNo).innerHTML  + '</div></div></div></div>';
		// var ulElem = document.getElementById("mycarousel2")
		// ulElem.appendChild(liElem);
		// addedHotel++;
	// }
	
	// else{
		// document.getElementById("searchedResult" + compareHotelNo).remove();
		// addedHotel--;
		// if(addedHotel == 1){
			// document.getElementById('shortlistItemsPanel').style.display = 'none';	
		// }
	// }
	// document.getElementById("shortListNo").innerHTML = (addedHotel-1)
// }




function emptyShortList(){
	document.getElementById('noItems').style.display = "block";
	document.getElementById("clearSlistedItems").style.display = "none";
	document.getElementById("compareSL").style.display = "none";
	document.getElementById('sortListedName').style.display = "none";
	document.getElementById('sortListedName').innerHTML = "";
	document.getElementById('shortListNo').innerHTML = 0;
	for(i=1;i<=3;i++){
		document.getElementById("compare" + i).checked = false;	
	}
	shortListedItem = 0;
}



//Images change on thumbnail Carousel click
 function showImage(imgName) {
     var curImage = document.getElementById('currentImage');
     var thePath = 'images/';
     var theSource = thePath + imgName;
	 
	 curImage.src = theSource;
     curImage.alt = imgName;
     curImage.title = imgName; 
 }


 //Tabs functionality
   $('.tabs .tabLinks a').on('click', function(e)  {
        var currentAttrValue = $(this).attr('href');
 
        // Show/Hide Tabs
        $('.tabs ' + currentAttrValue).removeClass('dN').siblings().addClass('dN');
 
        // Change/remove current tab to active
        $(this).parents('li').addClass('sel').siblings().removeClass('sel');
		
        $('.tabLinks').show();  
		
        e.preventDefault();
    });
   

	
	
/*Show more show less text auto cut off*/
(function($) {
    $.fn.shorten = function(settings) {
        "use strict";
     var config = { showChars: 200,  ellipsesText: "...",  moreText: "Read more +", lessText: "Read less -",errMsg: null, force: false};
        if (settings) { $.extend(config, settings);}
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
                    $this.parent().prev().prev().show();
                    $this.parent().prev().hide();

                } else {
                    $this.addClass('less');
                    $this.html(config.lessText);
                    $this.parent().prev().prev().hide();
                    $this.parent().prev().show();
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
                if (c.indexOf('<') >= 0)
                {
                    var inTag = false; 
                    var bag = ''; 
                    var countChars = 0; 
                    var openTags = []; 
                    var tagName = null;

                    for (var i = 0, r = 0; r <= config.showChars; i++) {
                        if (content[i] == '<' && !inTag) {
                            inTag = true;

                           
                            tagName = content.substring(i + 1, content.indexOf('>', i));

                           
                            if (tagName[0] == '/') {


                                if (tagName != '/' + openTags[0]) {
                                    config.errMsg = 'ERROR en HTML: the top of the stack should be the tag that closes';
                                } else {
                                    openTags.shift(); 
                                }

                            } else {
                               
                                if (tagName.toLowerCase() != 'br') {
                                    openTags.unshift(tagName); 
                                }
                            }
                        }
                        if (inTag && content[i] == '>') {
                            inTag = false;
                        }

                        if (inTag) { bag += content.charAt(i); } 
                        else {
                            r++;
                            if (countChars <= config.showChars) {
                                bag += content.charAt(i); 
                                countChars++;
                            } else 
                            {
                                if (openTags.length > 0) // I have unclosed tags
                                {
                                   for (j = 0; j < openTags.length; j++) {
                                        bag += '</' + openTags[j] + '>'; 
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
                    '</div><span><a href="javascript://nop/" class="morelink" style="margin-top: 0px;">' + config.moreText + '</a></span>';

                $this.html(html);
                $this.find(".allcontent").hide(); 
                $('.shortcontent p:last', $this).css('margin-bottom', 0); 
            }
        });
  };

})(jQuery);


//Function to cut off the text
$(".overviewDescription, .landmarksNearby").shorten();

function showContr(tabid, id){
	
	
	/*for(i=1;i<=5;i++){
		document.getElementById("hotelTab" + i).className = "";
		document.getElementById("hotelContr" + i).style.display = "none";
	}
	if(document.getElementById(tabid).className == "sel"){
		document.getElementById(tabid).className = ""
		document.getElementById(id).style.display = 'none';
	}
	else{
		document.getElementById(tabid).className = "sel";
		document.getElementById(id).style.display = 'block';	
	}*/
/*	document.getElementById(tabid).className = "sel";
	$(this).parent().addClass('sel');
	document.getElementById(id).style.display = 'block';
	document.getElementById(tabid).className = 'sel';	*/
}

function showSelectedPanel(){
	document.getElementById("roomSelect").style.display = "block";	
	document.getElementById("shortListNo").innerHTML = 1;
	document.getElementById("selectedRoomContent").innerHTML = '<div class="col_7 pL10 pR0 pB10  pT10"><div id="selectContainer1" class="clearfix"><div class="fL"><img src="images/hotel6_thumb.jpg"></div><div class="fL mL10"><span class="fW600"><a href="javascript:void(0)">Radisson Blue Dwarka</a></span><br><span class="fS12">Superior room</span><br><span class="fS12">Standard room with breakfast</span></div></div></div><div class="col_2_half pL0 pR10"><div class="bkgGrn pT10 pB10 clearfix h100"><div class="col_12 pR0 pL10"><div class="fS18"><div class="clearfix mB5"><div class="fL mR10"><a href="javascript:void(0)"><span class="rupee">Rs </span><span class="fW600" id="compPrice">17,780</span></a></div><div class="faq_sml_icon fL mT5"></div></div></div><span >Markup <span id="markup3"><a href="javascript:void(0);"><span class="rupee">Rs </span><span id="markupVal3">1,450</span></a><span class="edit_sml_icon mL5" onClick="showFareEdit(3);"></span></span> </span></div></div></div><div id="selectBooking" class="col_2_half pL0 pT10 clearfix pR0"><span class="primaryBtn_sml mR10 mTN5 mB15"><a href="javascript:void(0);">Book</a></span><br class="cB"><a href="javascript:void(0)" class="mR20 fL fS12 mT5">Add to cart</a><a href="javascript:void(0)" class="mR20 fL fS12 mT5" onclick="close_panel(\'roomSelect\')">Add to quote</a><br class="cB"><span class="fW500 fS12 mT5 fL"><a href="javascript:void(0)" onClick="scrollToTop()">Compare with best price</a></span></div>';
	
}




var addedRoomType = 1
function showSelectedRooms(selectedRoomValue){
	
    if($("#roomShortlist" + selectedRoomValue).val() > 0)
	{
		document.getElementById("roomSelect").style.display = "block";
		liElem = document.getElementById("shortlistedRoom" + addedRoomType); // id of each li
		liElem.innerHTML = '<div class="clearfix fL pL0 searchedResult" id="addedRoom' + selectedRoomValue + '"><div class="fL mR10 mB5"> <img alt="Hotel Thumb" src="images/hotel6_thumb.jpg"> </div><div class="fL"><div class="fcWht fW600 fS11">Radisson Blu Dwarka</div><div class="fcWht fS11">Standard Double<br> Room with breakfast</div><div class="fcWht fS11">2 Rooms</div></div><div class="mT5 dB fR mL10"><img src="images/bin.png" alt="delete" ></div></div>';
		
		var ulElem = document.getElementById("mycarousel3")
		ulElem.appendChild(liElem);
		addedRoomType++;
		if(addedRoomType>1)
		{
		liElem.innerHTML +='<div class="fL w5pcnt_imp pT10 pR10 pL10 pB10"><br><span class="fW600 fS21 mT20">+</span>  </div>';
		}
		
	 }
	 
	 else  if($("#roomShortlist" + selectedRoomValue).val() == 0){
		 document.getElementById("addedRoom" + selectedRoomValue).remove();
		 addedRoomType--;
		 }
		 
	   if(document.getElementById('roomShortlist' + selectedRoomValue).value > '0'){
			document.getElementById('addhighlight').className = "highlight";
		 }
	  else{
			document.getElementById('addhighlight').className = "";
			document.getElementById('roomSelect').style.display = "none";
			document.getElementById('mycarousel3').innerHTML = " ";
		 }
		 
		 
		 
	 
		
}




function selectFlightHotel(){
	document.getElementById("flightHotelSelect").style.display = "block";
	document.getElementById("selectedFlightHotel").innerHTML = '<div class="col_3 pL10 pR0 pB10 pT10"><div id="selectedHotelThumb1" class="fL"><img src="images/hotel6_thumb.jpg"></div><div class="fL mL10 hotelDetailContent"><span class="fW600"><a id="selectedHotelName1" href="javascript:void(0)">Radisson Blue Dwarka</a></span><br><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><span class="rating_star_no_icon"></span><span class="fS12">4 Star</span><br><span class="fS12" id="selectedHotelLocation1">Airport Zone/ Mahipalpur Road</span><br><span class="fS12" id="selectedHotelRoom1">Superior room</span><br><span><a href="javascript:void(0)">Change hotel</a></span></div></div><div class="col_1 tC pL0 pR0 plus pT30">+</div><div class="col_3 pL0 pR0 pT10 pB10"><div class="mB10 clearfix"><span class="fW600">Departure flight</span><br><span class="fW600" id="selectedDepFlight1">BOM – DEL</span> , <span id="selectedDepFlightDate1">25 Sep 2014</span></div><div class="col_4 pR0 pL0"><div><img src="images/indigo_vsmllogo_sqr.png" alt="IndiGo logo" /></div><div class="fS12"><span id="selectedDepAirline1">IndiGo</span> <br /><span id="selectedDepFlightNo1">G8- 116</span> </div></div><div class="col_8 pR0 pL0 mTN5"><div class="fS12 mB5" id="selectedDepTime1">04:00 – 06:15</div><div class="fS12" id="selectedDepDuration1">02h 15m | Non stop</div></div></div><div class="col_3 pL0 pR0 pT10 pB10"><div class="mB10 clearfix"><span class="fW600">Arrival flight</span><br><span class="fW600" id="selectedArrFlight1">BOM – DEL</span> , <span id="selectedArrFlightDate1">25 Sep 2014</span></div><div class="col_4 pR0 pL0"><div><img src="images/indigo_vsmllogo_sqr.png" alt="IndiGo logo" /></div><div class="fS12"><span id="selectedArrAirline1">IndiGo</span> <br /><span id="selectedArrFlightNo1">G8- 116</span> </div></div><div class="col_8 pR0 pL0 mTN5"><div class="fS12 mB5" id="selectedArrTime1">04:00 – 06:15</div><div class="fS12" id="selectedArrDuration1">02h 15m | Non stop</div></div></div><div class="col_2 pL0 pR0 fR"><div class="bkgGrn pT10 pB10 clearfix"><div class="col_12 pR0 pL10"><div class="fS18"><div class="clearfix mB5"><div class="fL"><a href="javascript:void(0)"><span class="rupee">Rs </span><span class="fW600" id="compPrice">40,780</span></a></div><div class="faq_sml_icon fL mT5 mL5"></div></div></div><div class="fS12 clearfix mB15">for 2 Adults, 1 Child, 3 Nights</div><span >Markup <span id="markup3"><a href="javascript:void(0);"><span class="rupee">Rs </span><span id="markupVal3">1,650</span></a><span class="edit_sml_icon mL5" onClick="showFareEdit(3);"></span></span> </span><br><a href="javascript:void(0)" class="mR20 fL fS12 mT10">Shortlist</a><span class="primaryBtn_sml mR10 fL mT10 mB15"><a href="javascript:void(0);">Book</a></span></div><br class="cB"></div></div>';	
}

// JavaScript Document
var mins = 0.5;  //Set the number of minutes you need
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
        if(secs !== -1) 
		setTimeout('Decrement()',1000);
		else
		popupwin('sesnexp','sesnexpinner','fade');
    }
	

function showPaymentOptions(opt){
for(i=1;i<=6;i++){
		if(document.getElementById("mop" + i).checked == true)
		{
			document.getElementById("optionPanel" + i).style.display = "block";
			
			}
		else		
		{
			
			document.getElementById("optionPanel" + i).style.display = "none";
			}
	}
	
	document.getElementById("amtDue" ).style.display = "block";
	//document.getElementById('tL1').scrollIntoView()+100;
}

$('.payOptslide').on('click', function(){
     $('html,body').animate({
        scrollTop: $("#tL1").offset().top - 100},
        'fast');
});
$('.showpayBtn').on('click', function(){
     $('html,body').animate({
        scrollTop: $("#step2").offset().top -200},
        'fast');
});

$('.portViewTabPay').on('click', function (e) {
		$(this).siblings('.portViewPay').slideToggle();
		 $(this).toggleClass("active");
		 if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/collapse_blu.png');
		}
        return false;
	});	
	
function showConfirmationPanel(id){
for(i=1;i<=6;i++){
		if(document.getElementById("mop6").checked == true)
		{
		popupwin('offpay','offpayinner','fade');
		}
		if(document.getElementById("mop" + i).checked == true)
			document.getElementById("optionPanelPaid" + i).style.display = "block";
		else	
			{		
			
			
			}
			document.getElementById("optionPanel" + i).style.display = "none";
			document.getElementById("mop" + i).checked = false;
	}

}


if( $("#paymentSummary").exists()){
	
	 $(window).load( function(){
		  $("#paymentSummary").width($("#formContainer").width());
		  });
		  
	 $(window).resize( function(){
		   $("#paymentSummary").width($("#formContainer").width());
		 });	  
	}
	
function viewPaymentDetails(viewId){
	if(document.getElementById("viewPanel" + viewId).style.display == "block"){
		$("#viewPanel" + viewId).slideUp();
		document.getElementById("vDetail" + viewId).innerHTML = "+";
	}
	else{
		$("#viewPanel" + viewId).slideDown();
		document.getElementById("vDetail" + viewId).innerHTML = "-";	
	}
}


function step1(curHrdr, nextHrdr, curContr, nextContr){
	$("#"+curHrdr).removeClass('active');
	$("#"+nextHrdr).addClass('active').removeClass('noImg');
	$("#"+curContr).slideUp('slow');
	$("#"+nextContr).slideDown('slow');
	
	  $('html,body').animate({
        scrollTop: $("#step1").offset().top - 100},
        'slow');
	document.getElementById(curHrdr).onclick = fn_step1;
}

function fn_step1(){
	$("#header1").addClass('active');
	$("#header2").removeClass('active');
	$("#step1").slideDown('slow');
	$("#step2").slideUp('slow');
	$("#header1").siblings("header.header").removeClass("active");
	$("#header1").next(".accordion .contContainer").slideDown("slow").siblings(".accordion .contContainer:visible").slideUp("slow");
}

function step2(curHrdr, nextHrdr, curContr, nextContr){
	$("#"+curHrdr).removeClass('active noImg');
	$("#"+nextHrdr).addClass('active').removeClass('noImg');
	$("#"+curContr).slideUp('slow');
	$("#"+nextContr).slideDown('slow');
	document.getElementById(curHrdr).onclick = fn_step2;
	  $('html,body').animate({
        scrollTop: $("#step2").offset().top - 100},
        'slow');
}

function fn_step2(){
	$("#header2").addClass('active');
	$("#header3").removeClass('active');
	$("#step2").slideDown('slow');
	$("#step3").slideUp('slow');
	$("#header2").siblings("header.header").removeClass("active");
	$("#header2").next(".accordion .contContainer").slideDown("slow").siblings(".accordion .contContainer:visible").slideUp("slow");
}


function step3(curHrdr, nextHrdr, curContr, nextContr){
	$("#"+curHrdr).removeClass('active noImg');
	$("#"+nextHrdr).addClass('active').removeClass('noImg');
	$("#"+curContr).slideUp('slow');
	$("#"+nextContr).slideDown('slow');
	document.getElementById(curHrdr).onclick = fn_step3;
		  $('html,body').animate({
        scrollTop: $("#step3").offset().top - 100},
        'slow');
}

function fn_step3(){
	$("#header3").addClass('active');
	$("#header4").removeClass('active');
	$("#step3").slideDown('slow');
	$("#step4").slideUp('slow');
	$("#header3").siblings("header.header").removeClass("active noImg");
	$("#header3").next(".accordion .contContainer").slideDown("slow").siblings(".accordion .contContainer:visible").slideUp("slow");	
}

function groupBookingToggle(id)
{
	 if( $("#"+ id).is(":checked")){
		 $("#modifySearchBtn").addClass("dN");
		 $("#sendRequestBtn").removeClass("dN");
		 }
		else{
	     $("#modifySearchBtn").removeClass("dN");
		 $("#sendRequestBtn").addClass("dN");
		} 
	}
	
	
function close_panel(id)	
{
   $("#"+ id).hide();
if(id == "btmTop")  
{ $("#workselect").removeClass('sel');} 
}


function holidayType(tabid, contrid){
	for(i=1; i<=2; i++){
		document.getElementById('holidayType'+i).className = '';
		document.getElementById('holidayTypeContr'+i).style.display = 'none'
		if(i==1){
			document.getElementById('holidayType'+i).className = 'first';	
		}
		if(i==2){
			document.getElementById('holidayType'+i).className = 'last';	
		}
	}
	document.getElementById(tabid).className = 'sel';
	document.getElementById(contrid).style.display = 'block'
	if(tabid == 'holidayType1'){
			document.getElementById(tabid).className = 'first sel';	
		}
		if(tabid == 'holidayType2'){
			document.getElementById(tabid).className = 'last sel';	
		}
}



		/*var $serviceTabBtn = $('.addServicesBtn');
		$serviceTabBtn.click(function() {
			$serviceTabBtn.parent().removeClass('sel');
			$(this).parent().addClass('sel');
			$('.addServicesBtn').show();
			$(this).hide();
		var index = $serviceTabBtn.index($(this));
			$('.addServicesContr .addServicesCnt').hide().eq(index).show();
		}).eq(0).click();*/
		
function addServices(){
	$("#addedServices").show();
	$(".addServices").removeClass("sel")
	$("#addServiceBtn1").removeClass("disableBtn");
	$("#addServiceBtn1").addClass("primaryBtn");
	$("#addServiceBtn1 a").css('background','#49af9a')
	$("#addServiceBtn1").removeAttr("style")
	$("#addServiceBtn1").parent('div').removeAttr("onclick")
	$(".addServicesContr").addClass("dN")
	$(".addServiceBtnTxt").html("Added")
	
	
}
function deleteServices(serviceNo){
	$("#addedServices").hide();
	$("#addServiceBtn1 a").removeAttr("style")
	$("#addServiceBtn1").parent('div').attr("onclick","showServices(1)")

	$(".addServiceBtnTxt").html("Add")
	
	
}

function showServices(serviceNo){
	$(".addServicesContr").removeClass("dN") 
	$("#servicesContainer1,#servicesContainer2,#servicesContainer3").hide();
	$("#services1,#services2,#services3").removeClass("sel")
	$("#addServiceBtn1,#addServiceBtn2,#addServiceBtn3").removeClass("disableBtn");
	$("#addServiceBtn1,#addServiceBtn2,#addServiceBtn3").addClass("primaryBtn");
	$("#servicesContainer" + serviceNo).show();
	$("#services" + serviceNo).addClass("sel") ;
	$("#addServiceBtn" + serviceNo  ).removeClass("primaryBtn");
	$("#addServiceBtn" + serviceNo  ).addClass("disableBtn");
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

$(".holidayDetailContr li a").click(function(){ $(this).parent().parent().addClass("fW600").siblings().removeClass("fW600"); });


/*$(".remove_searched_parameter").click( function(){
	  $(this).parent().parent().remove();
	});
*/
function scrollToTop(){
	$('html, body').animate({
			 scrollTop: '0px'
	 },500);	
}

function getShortListedRooms(){
  var count1 = parseFloat($("#roomShortlist1").val());	
  var count2 = parseFloat($("#roomShortlist2").val());	
  var count3 = parseFloat($("#roomShortlist3").val());	
  totalCount = Number(count1 + count2+ count3);
  
  var existingCount = parseFloat($("#shortListNo").text());
  if( $("#compare1").is(":checked") || $("#compare2").is(":checked") || $("#compare3").is(":checked") || $("#compare4").is(":checked")){
	var updatedCount  = Number(totalCount + existingCount);  
  }
  else{
	var updatedCount  = Number(totalCount);  
  }
  
  
  $("#shortListNo").text(updatedCount);
  
}
var addedHoliday = 1;
function compareHolidays(compareHolidaysNo)
{
	if(document.getElementById("compare" + compareHolidaysNo).checked == true)
	{
		document.getElementById('shortlistItemsPanel').style.display = 'block';
	
		liElem = document.getElementById("shortlisted" + addedHoliday);
		liElem.innerHTML = '<div class="clearfix pL0 searchedResult" id="searchedResults' + compareHolidaysNo + '"><div class="fL"><div class="fcWht fW600 fS18 ">' + document.getElementById("holidayDest" + compareHolidaysNo).innerHTML  + '</div><div class="fcWht fS11">Holiday type: GIT</div><div class="fcWht fS11">Brochure included</div><div class="clearfix"><div class="fS22 fW400 fL fcWht"><span class="rupee">Rs</span>' + document.getElementById("hubprice" + compareHolidaysNo).innerHTML  + '</div></div></div></div>';
		var ulElem = document.getElementById("mycarousel2")
		ulElem.appendChild(liElem);
		addedHoliday++;
	}
	
	else{
		document.getElementById("searchedResults" + compareHolidaysNo).remove();
		addedHoliday--;
		if(addedHoliday == 1){
			document.getElementById('shortlistItemsPanel').style.display = 'none';	
		}
	}
	document.getElementById("shortListNo").innerHTML = (addedHoliday-1)
}
function addtoCart(id)
{

$("#mycarousel2").jcarousel('add',id,'<li class="clearfix fL pD5 pL0 searchedResult" style="width:285px" id="selectContainer'+id+'"><samp class="go_AI"> <span>IndiGo <br>6E 198 </span> </samp> <dfn>Thursday, 25th Sep<br><strong> <small>BOM</small> 05:30 </strong> <ins> <span>Economy</span> 1h 5m Nonstop</ins> <strong> <small>Del</small> 06:35 </strong> </dfn><div class="fW600 fS21 mL10 mR10  fR">+</div><img src="Images/bin.png" class="fR dB" alt="" id="dirImg2" onclick="removeFrmCart('+id+')" /></li>');
  
 $('#mycarousel2').jcarousel('reload');
  $("#shortlistItemsPanel").show();
		   $("#shoppingcart").addClass('sel');
		   $(".btmFix_btmBar").addClass("activated");
		   
}
function removeFrmCart(id)
{
$('#selectContainer'+id).remove();
var countli = $("#cart li").length;
		
		   num = parseInt($("#cartCount").text());
			$("#cartCount").text(num-1);
}
//Add to cart function
	$(".addToCart").click(function(){
		   
		   $("#shortlistItemsPanel").show();
		   $("#shoppingcart").addClass('sel');
		   $(".btmFix_btmBar").addClass("activated");
		  // $("#shopping_cart_panel").delay(3000).fadeOut(800); 
		
		   
		});
		
		/*insurance dropdown */
function check_dd() {
    if(document.getElementById('security_question_1').value == "Single") {
        document.getElementById('single_entry').style.display = 'block';
    } else {
        document.getElementById('single_entry').style.display = 'none';
    }
	if(document.getElementById('security_question_1').value == "Multiple") {
        document.getElementById('multiple_entry').style.display = 'block';
    } else {
        document.getElementById('multiple_entry').style.display = 'none';
    }
}

$(".dropdown2 dt a").on('click', function () {
$(".dropdown2 dd ul").slideToggle('fast');
});
$(".dropdown2 dt span").on('click', function () {
$(".dropdown2 dt a").trigger('click');
});

$(".dropdown2 dd ul li a").on('click', function () {
$(".dropdown2 dd ul").hide();
});
$('.mutliSelect2 input[type="checkbox"]').on('click', function () {
        
          var title = $(this).closest('.mutliSelect2').find('input[type="checkbox"]').val(),
              title = $(this).val() + " ";
        
          if ($(this).is(':checked')) {
		
          } 
          else {
              $('span[title="' + title + '"]').remove();
              var ret = $(".hidd");
              $('.dropdown2 dt a').append(ret);
              
          }  
		  $('.multiSel2').html('');
			 $( ".chk" ).each(function( ) {
				 if ($('#checkAll').is(':checked')) {
				 var all = '<span title="' + title + '">' + title + '</span>';
				 $('.multiSel2').html(all);
					  }
				else{
					if ($(this).is(':checked')) {
					title = $(this).val() + " ";
						
				    var html = '<span title="' + title + '">' + title + '</span>';
				 $('.multiSel2').append(html);
				}
				}
				
			 });
		  
		  var n = $( ".multiSel2 span" ).length;
		  if(n>0)
		  $('.multiSelStatus1').html('</span>Selected themes</span>');
		  else
		  $('.multiSelStatus1').html('<span>Select themes</span>');
		
      });
	  function compare(){
	
			var box = $('#hotelsShortlist').find(':checkbox:checked');
			if (box.length == 3 ) {
				
			//popupclose('shortListHotels', 'fade');
			popupwin('compareHotels','compareHotelsinner','fade');
			
			}
			else{
		
			if (box.length == 2 ) {
				
		       popupclose('shortListHotels', 'fade');
			popupwin('compareHotels','compareHotelsinner','fade');
                      
			
			}
			else{
				alert("Kindly select 2-3 items"+box.length);
				}
				
					
			}
		
	}
	
	$(document).ready(function() {
var max_fields21      = 40; //maximum input boxes allowed
var wrapper21         = $("#addRoomOpt"); //Fields wrapper
var add_button21      = $("#addRoomOptbtn"); //Add button ID
var x = 1; //initlal text box count
var id4=1;
var x4 = 0;
$(add_button21).click(function(e){ //on add input button click
e.preventDefault();
if(x < max_fields21 || x4 < max_fields21){ //max input box allowed
x++; //text box increment
x4++;
id4=1+x4;
$(wrapper21).append('<ul class="mT10 grey_bg pD10"><li class="col_11 clearfix mB10 fW600 fL">Room '+id4+'</li><li class="col_1 remove_field"><span class="fR popup_close_icon"></span></li><li class="mT10 mB10 clearfix"><ul class="col_6 pL0"><li class="col_4"><label>Adults</label><select><option>1</option><option>2</option><option>3</option></select></li><li class="col_8"><label>Room type</label><select><option>Deluxe double room</option></select></li></ul><ul class="col_3 tR"><li><label>&nbsp;</label><span><span class="rupee">Rs</span> 25,000</span></li></ul><ul class="col_3 tR"><li><label>&nbsp;</label><span><span class="rupee">Rs</span> 50,000</span></li></ul></li><li class=" mB10 clearfix"><ul class="col_6 pL0"><li class="col_4 "><label>Child</label><select><option>1</option><option>2</option><option>3</option></select></li><li class="col_4 pR10"><label>Child 1</label><select class="p0"><option>1yrs</option><option>2yrs</option><option>3yrs</option></select></li><li class="col_4 pL10"><label>Child 2</label><select class="p0"><option>1yrs</option><option>2yrs</option><option>3yrs</option></select></li></ul><ul class="col_3 tR"><li><label>&nbsp;</label><span><span class="rupee">Rs</span> 8,500</li></ul><ul class="col_3 tR"><li><label>&nbsp;</label><span><span class="rupee">Rs</span> 17,000</li></ul></li></ul>'); //add input box
}
});
$(wrapper21).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x--;
})
});



function showDetails(e)
{
if (e=="1") {
document.getElementById('pickUpLocContr').style.display="block";
document.getElementById('routeMapContr').style.display="none";
document.getElementById('driveDirContr').style.display="none";
}
else if (e=="2") {
document.getElementById('pickUpLocContr').style.display="none";
document.getElementById('routeMapContr').style.display="block";
document.getElementById('driveDirContr').style.display="none";
}
else if(e=="3") {
document.getElementById('pickUpLocContr').style.display="none";
document.getElementById('routeMapContr').style.display="none";
document.getElementById('driveDirContr').style.display="block";
}
}