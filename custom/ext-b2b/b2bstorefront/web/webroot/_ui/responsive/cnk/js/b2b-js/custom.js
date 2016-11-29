 // functions that scrolls to #link
function goToElement(id){
     $('html,body').animate({
        scrollTop: $("#"+id).offset().top - 100},
        'slow');
}


function toggleDetails(id)
{ 
$('#toggleDetailsCtr'+id).toggle('slow');

}

function changeCurrency(id)
{ 
var str =$('#CurrencyBtn').val();
if(str == 'Supplier')
{
$('#CurrencyOpt').prop('disabled', 'disabled');
}
else{
$('#CurrencyOpt').removeAttr('disabled');;
}
}
function changeCurrencyport(id)
{ 
var str =$('#CurrencyBtnport').val();
if(str == 'Supplier')
{
$('#CurrencyOptport').prop('disabled', 'disabled');
}
else{
$('#CurrencyOptport').removeAttr('disabled');;
}
}




function resetSliders(name)
{ 
if($("#"+name).length == 1) {
  //it doesn't exist
  var slider = $("#"+name).sudoSlider({});
}

}

//Tabs functionality
   $('.secTab .tab a').on('click', function(e)  {
	   var currentAttrValue = $(this).attr('href');
 		// Show/Hide Tabs
		$(currentAttrValue).show().siblings().hide();
 
        // Change/remove current tab to active
        $(this).parent().parent('li').addClass('sel').siblings().removeClass('sel');
 
        e.preventDefault();
    });



	
	$(document).ready(function () {
	$('#reservationview').on('click', function (e) {
		$("#reservationdetails3").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).text('-  Reservation in 2 Sectors');	   
		}else{
			$(this).text(' +  Reservation in 2 Sectors');
		}
	});	
});
$(".profileShowHide").click( function(){
		     $(this).toggleClass("active");
			 $(this).parent().parent().next(".profileDtlContr").slideToggle('fast');
		    	if($(this).hasClass('active')){
				 $(this).text(" - ");
				 }
			else{
				$(this).text(" + ");
				}	 
			 
		   });
		   
function chSrc(tabId, contrId){
	for(i=1; i<=13; i++){
		document.getElementById('chTab'+i).className='';
		document.getElementById('chContr'+i).style.display = 'none';	
		if(i == 14 )
		{
			document.getElementById('chTab'+i).className='last';
		}
	}
	document.getElementById(tabId).className='sel';
	document.getElementById(contrId).style.display = 'block';
}
$(document).ready(function () {
	
	$('.tfvisa').on('click', function (e) {
		$(".tfoptionvisa").slideToggle("slow");
		$(this).toggleClass("active");
		 if ($(this).hasClass('active')) {
			$(this).text('- Documents required for female applicants');		   
		}else{
			$(this).text('+ Documents required for female applicants');
		}
	});	
	$('#additemgrp').on('click', function (e) {
		$("#newitemgrp").show("slow");
		$('#AddPrdctCntnt').hide("slow");
		 $('#AddPrdct').show();
	
	});	
	$(document).ready(function () {
	$('#AddPrdct').on('click', function (e) {
		 $('#AddPrdctCntnt').show("slow");
		 $('#AddPrdct').hide();
	
	});	
	$("#GroupBooking1,#GroupBooking2,#GroupBooking3").click(function(){
     $('.blink').addClass('bkgLitBlu').delay(800).queue(function(next){
         $(this).removeClass('bkgLitBlu');
         next();
    });
 });
$('#search').on('autocompletechange change', function () {
      alert('You selected: ' + this.value);
	  if(this.value == "Paris")
		$("#newsearch").show();
  });
});
});

$(document).ready(function () {
$('#childActivity1').on('change', function (e) {
		var countchild=$('#childActivity1').val();
		$('#activitychildage1').html('');
		var string='';
		for(i=1;i<=countchild;i++)
		{
			string +='<li class="col_3 pL0  clearfix"> <label >Passenger '+i+'</label> <select class="mB10 "><option>Age</option><option>1</option><option>2</option><option>3</option><option>4</option><option>5</option><option>6</option><option>7</option><option>8</option><option>9</option><option>10</option><option>11</option><option>12</option></select> </li>';
		}
		$('#activitychildage1').html(string);
	});
	
	$('.searchbtn').on('change', function (e) {	
		$("#editbtn").show();
	});	
	
});
$('.searchbtn1').on('click', function (e) {
		
		$( "#editbtn1" ).addClass( "primaryBtn_sml" );
	});	
	$('.searchbtn2').on('click', function (e) {
		
		$( "#editbtn2" ).addClass( "primaryBtn_sml" );
	});	
	$('.searchbtn3').on('click', function (e) {
		
		$( "#editbtn3" ).addClass( "primaryBtn_sml" );
	});
	function compare(){
	
			var box = $('#hotelsShortlist').find(':checkbox:checked');
			if (box.length == 3 ) {
				
			popupclose('shortListHotels', 'fade');
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


var roomsAdded = 1;
function showCabins(){
	Cabin = document.getElementById("noOfRooms").value;
	if(Cabin < roomsAdded){
		rRem = roomsAdded - Cabin;
		for(i=1;i<=rRem;i++){
			document.getElementById("Cabin" + roomsAdded).innerHTML = '';
			roomsAdded--;	
		}	
	}
	else{
		rAdd = Cabin - roomsAdded;
		for(r=1;r<=rAdd;r++)
		{
document.getElementById("room" + (roomsAdded+1)).innerHTML = '<ul class="row mB10 mT15 clearfix"><li class="col_2">&nbsp;</li><li class="col_2 pR0"> <span class="mT30 fL">Cabin ' + (roomsAdded+1) + ':</span></li><li class="col_2 col_2_sm pL0"><label>Adult</label><div class="passengerNum4 fL"><span onclick="adultCountDec(\'hAdult_' + (roomsAdded+1) + '\')" class="control addMinControl minusControl">-</span><span class="control innerTxtControl" id="hAdult_' + (roomsAdded+1) + '">1</span><span onclick="adultCountInc(\'hAdult_' + (roomsAdded+1) + '\')" class="control addMinControl plusControl">+</span></div><input type="text" class="w100pcnt dN" maxlength="3" value="1"><span class="fS11 fL w100pcnt">12+ yrs</span></li><li class="col_1_half col_2_sm  pR0 pL0"><label>Children</label><div class="passengerNum5 fL"> <span onclick="childCountDec(\'hChild_' + (roomsAdded+1) + '\'),remChild(' + (roomsAdded+1) + ')" class="control addMinControl minusControl">-</span> <span class="control innerTxtControl" id="hChild_' + (roomsAdded+1) + '">0</span> <span onclick="childCountInc(\'hChild_' + (roomsAdded+1) + '\'),addChild(' + (roomsAdded+1) + ')" class="control addMinControl plusControl">+</span> </div><input type="text" class="w100pcnt dN" maxlength="3" value="0"><span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li><li class="col_4  pL0 pR0 mB10"><ul><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_1"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_5"></li><li class="col_6 pR0" id="child' + r + '_6"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_7"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_8"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_9"></li></ul></li></ul>';
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
	
	
	
	$('.searchbtn').on('click', function (e) {
		$( "#editbtn" ).removeClass( "disableBtn" );
		$( "#editbtn" ).addClass( "primaryBtn" );
	});	
function selectflighthotel(id)
{
for(i=1;i<5;i++)
{
$('#select'+i).removeClass('tertiaryBtn_sml');
$('#select'+i).addClass('primaryBtn_sml');
$('#select'+i +' a').text('Select');
}
$('#select'+id).removeClass('primaryBtn_sml');
$('#select'+id).addClass('tertiaryBtn_sml');
$('#select'+id +' a').text('Selected');

}

$(document).ready(function () {
	$('.book').on('change', function (e) {
		 $('#btmTop').show();
		
	});
	$('.book').on('click', function (e) {
		 $('#btmTop').show();
		
	});	
	$('.selbook').on('change', function (e) {
		 $('#btmTop').show();
		
	});
	$('.cruisebook').on('change', function (e) {
		 $('#btmTopcruise').show();
		
	});
	  $('.deckview').on('click', function(e)  {
		$('#reviews').removeClass('dN');
		$('#roomsAndRates').addClass('dN');
		$('#room').removeClass('sel');
		$('#deck').addClass('sel');
		
    });
	
	
	
	
	var availableDates = ["9-5-2015","14-5-2015","15-5-2015"];

function available(date) {
  dmy = date.getDate() + "-" + (date.getMonth()+1) + "-" + date.getFullYear();
  if ($.inArray(dmy, availableDates) != -1) {
    return [true, "","Available"];
  } else {
    return [false,"","unAvailable"];
  }
}
$('#date').datepicker({
 numberOfMonths:2,
dateFormat: "dd/mm/yy",
 beforeShowDay: available ,
 });
 
 $('#date').datepicker('setDate', '15/05/2015');
});
 
 

function showtooltipcars(parentId, tooltipId)
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
		  var left =  ($("#" + parentId).offset().left) - parentElementWidth +4 + 'px';
			var top =  ($("#" + parentId).offset().top) + parentElementHeight +0 + 'px';
	   }

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
function showtooltipmap(parentId, tooltipId)
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
		  var left =  ($("#" + parentId).offset().left) - parentElementWidth +700 + 'px';
			var top =  ($("#" + parentId).offset().top) + parentElementHeight +0 + 'px';
	   }

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
function showtooltippass(parentId, tooltipId)
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
		  var left =  ($("#" + parentId).offset().left) - parentElementWidth -4 + 'px';
			var top =  ($("#" + parentId).offset().top) + parentElementHeight -10 + 'px';
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
function showtooltipbus(parentId, tooltipId)
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
		  var left =  ($("#" + parentId).offset().left) - parentElementWidth +27 + 'px';
			var top =  ($("#" + parentId).offset().top) + parentElementHeight - 25 + 'px';
	   }

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
function showtooltippayment(parentId, tooltipId)
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
		  var left =  ($("#" + parentId).offset().left) - parentElementWidth -85 + 'px';
			var top =  ($("#" + parentId).offset().top) + parentElementHeight - 10 + 'px';
	   }

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
function showtooltipEurail(parentId, tooltipId)
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
		  var left =  ($("#" + parentId).offset().left) - parentElementWidth +12 + 'px';
			var top =  ($("#" + parentId).offset().top) + parentElementHeight -2 + 'px';
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
$('.minusCir_icon1').on('click', function (e) {
		$(this).toggleClass("hide");
		 if ($(this).hasClass('hide')) {
			$('.markupContr1').hide();   
			$('#markupBtnText1').text('Show');   
		}else{
			$('.markupContr1').show();   
			$('#markupBtnText1').text('Hide');  
		}
	});	
	
	 $(".viewAllCalendarDates").click( function(){
		  $(this).toggleClass('sel');
		  $(".calendarContainer").toggle();
		  
		   if ($(this).hasClass('sel')) {
			$(this).find('img').attr('src','images/b2b-images/common/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/b2b-images/common/collapse_blu.png');
		}
		  
		
		});
	$('.minusCir_icon_portrait1').on('click', function (e) {
		$(this).toggleClass("hide");
		
		 if ($(this).hasClass("hide")) {
			$('.markupContr_portrait1').hide();   
				$('#markupBtnTextport1').text('Show');   
		}else{
			$('.markupContr_portrait1').show(); 
			$('#markupBtnTextport1').text('Hide');  			
		}
	});
	$('#netfare_port1').on('click', function (e) {
		
		 if ($(this).is(':checked')) {
			$('.commission1').show();   
			
		}else{
			$('.commission1').hide();   
		}
	});	
	
	$('#netfare1').on('click', function (e) {
		
		
		 if  ($(this).is(':checked')) {
			$('.commission1').show();   
		}else{
			$('.commission1').hide();  			
		}
	});
  function showImage(imgName) {
     var curImage = document.getElementById('currentImage');
     var thePath = 'images/b2b-images/activities/';
     var theSource = thePath + imgName;
	 
	 curImage.src = theSource;
     curImage.alt = imgName;
     curImage.title = imgName; 
 }
   function showImage(imgName) {
     var curImage = document.getElementById('currentImagecruise');
     var thePath = 'images/b2b-images/activities/';
     var theSource = thePath + imgName;
	 
	 curImage.src = theSource;
     curImage.alt = imgName;
     curImage.title = imgName; 
 }
 function selectThumnail1(id)
{
for(i=1;i<=6;i++)
{
document.getElementById('Thumbnail'+i).style.border="";
}
document.getElementById('Thumbnail'+id).style.border="#16a085 5px solid";
}
$(document).ready(function () {
	$('#day1').on('click', function (e) {
		$("#dayview1").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/b2b-images/common/collapse_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/b2b-images/common/expand_blu.png');
		}
	});	
});
 $(document).ready(function () {
	$('#day2').on('click', function (e) {
		$("#dayview2").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/b2b-images/common/collapse_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/b2b-images/common/expand_blu.png');
		}
	});	
});
 $(document).ready(function () {
	$('#day3').on('click', function (e) {
		$("#dayview3").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/b2b-images/common/collapse_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/b2b-images/common/expand_blu.png');
		}
	});	
});
$(document).ready(function () {
$('#childActivity').on('change', function (e) {
		var countchild=$('#childActivity').val();
		$('#activitychildage').html('');
		var string='';
		for(i=1;i<=countchild;i++)
		{
			string +='<li class="col_3 pL0  clearfix"> <label >Child '+i+'</label> <select class="mB10 "><option>Age</option><option>1</option><option>2</option><option>3</option><option>4</option><option>5</option><option>6</option><option>7</option><option>8</option><option>9</option><option>10</option><option>11</option><option>12</option></select> </li>';
		}
		$('#activitychildage').html(string);
	});
	
	$('#viewTab2').on("click", function() {
    $('.holidayCarousel').css('display', 'block'); 
    var countslider = $(".holidayCarousel").length;
	for(i=0;i<countslider;i++)
	{
	 $('.holidayCarousel').get(i).slick.setPosition();
	}
});
});

$(document).ready(function () {
	$('#flightview3').on('click', function (e) {
		$("#flightdetails3").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).text('- View Details');	   
		}else{
			$(this).text(' + View Details');
		}
	});	
});
$(document).ready(function () {
	$('#flightview4').on('click', function (e) {
		$("#flightdetails4").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).text('- View Details');	   
		}else{
			$(this).text(' + View Details');
		}
	});	
});
$(document).ready(function () {
	$('#flightview5').on('click', function (e) {
		$("#flightdetails5").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).text('- View Details');	   
		}else{
			$(this).text(' + View Details');
		}
	});	
});
$(document).ready(function () {
	$('#flightview6').on('click', function (e) {
		$("#flightdetails6").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).text('- View Details');	   
		}else{
			$(this).text(' + View Details');
		}
	});	
});
$(document).ready(function () {
	$('#flightview7').on('click', function (e) {
		$("#flightdetails7").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).text('- View Details');	   
		}else{
			$(this).text(' + View Details');
		}
	});	
});
$(document).ready(function () {
	$('#flightview8').on('click', function (e) {
		$("#flightdetails8").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).text('- View Details');	   
		}else{
			$(this).text(' + View Details');
		}
	});	
});
$(document).ready(function () {
	$('#flightview9').on('click', function (e) {
		$("#flightdetails9").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).text('- View Details');	   
		}else{
			$(this).text(' + View Details');
		}
	});	
});
$(document).ready(function () {
	$('#flightview10').on('click', function (e) {
		$("#flightdetails10").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).text('- View Details');	   
		}else{
			$(this).text(' + View Details');
		}
	});	
});
$(document).ready(function () {
	$('#flightview11').on('click', function (e) {
		$("#flightdetails11").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).text('- View Details');	   
		}else{
			$(this).text(' + View Details');
		}
	});	
});
$(document).ready(function () {
	$('#flightview12').on('click', function (e) {
		$("#flightdetails12").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).text('- View Details');	   
		}else{
			$(this).text(' + View Details');
		}
	});	
});
$(document).ready(function () {
	$('#flightview13').on('click', function (e) {
		$("#flightdetails13").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).text('- View Details');	   
		}else{
			$(this).text(' + View Details');
		}
	});	
});
$(document).ready(function () {
$('#applydiscountbtn').click(function (){
if($('.codefield').val() == 'abcdef')
{
$('.invalidcode').hide();
$('#applydiscount').hide();
$('#confirmdiscount').show();
}
else
{
$('.invalidcode').show();
}
});
});
//Tabs functionality
   $('.diyContr .flightWay a').on('click', function(e)  {
        var currentAttrValue = $(this).attr('href');
		// Show/Hide Tabs
        $('.diyContr ' + currentAttrValue).show().siblings().hide();
		$(".flightWay").show();
      // Change/remove current tab to active
        $(this).parent('li').addClass('sel').siblings().removeClass('sel');
        e.preventDefault();
    });

$(function() {

    $('#gname').on('keyup change', function() {
        if (this.value > 70) {
            $('#number').show();
        } else {
            $('#number').hide();
        }
    });    

    
});
$(document).ready(function () {
$('#mop1').change(function (){
	if($('#mop1').is(':checked'))
	$('#optionPanel1').show();
	else
	$('#optionPanel1').hide();
});
$('#mop2').change(function (){
	if($('#mop2').is(':checked'))
	$('#optionPanel2').show();
	else
	$('#optionPanel2').hide();
});
$('#mop3').change(function (){
	if($('#mop3').is(':checked'))
	$('#optionPanel3').show();
	else
	$('#optionPanel3').hide();
});
$('#mop4').change(function (){
	if($('#mop4').is(':checked'))
	$('#optionPanel4').show();
	else
	$('#optionPanel4').hide();
});
$('#mop5').change(function (){
	if($('#mop5').is(':checked'))
	$('#optionPanel5').show();
	else
	$('#optionPanel5').hide();
});
$('#mop6').change(function (){
	if($('#mop6').is(':checked'))
	$('#optionPanel6').show();
	else
	$('#optionPanel6').hide();
});
$('#mop7').change(function (){
	if($('#mop7').is(':checked'))
	$('#optionPanel7').show();
	else
	$('#optionPanel7').hide();
});
$('#mop8').change(function (){
	if($('#mop8').is(':checked'))
	$('#optionPanel8').show();
	else
	$('#optionPanel8').hide();
});
});
$('.matfliterAll').on('click', function( e ) {
	$(".matflitercell").removeClass('bkgGrn');
});
$('.matflitercell').on('click', function( e ) {
	$(".matflitercell").removeClass('bkgGrn');
	$(this).addClass('bkgGrn');
});
function addFlyer(id)
{
document.getElementById('addedFlyer'+id).style.display="block";
}
$(document).ready(function () {
	$('.addMore').on('click', function (e) {
		$(".addMoreDetail").slideToggle("slow");
		$('.add_details_icon').toggleClass("active");
	});	
	$( "#AddPrdct" ).click(function() {
	  $( "#AddPrdctCntnt" ).show("slow");
	  $( "#AddPrdct" ).hide();
	  
	});
	$( "#subadd" ).click(function() {
	  $( "#AddPrdctCntnt" ).hide();
	  $("#AddPrdct").show("slow");
	  $("#product2").show("slow");
	  
	});
});

function showvisit()
{
d = document.getElementById("select_id").value;
if(d == "call")
{
popupwin('call','callinner', 'fade'),hideDD();
}
if(d =="visit")
{
popupwin('visit', 'visitinner','fade'),hideDD();
}
if(d =="customer")
{
popupwin('callcust','callcustinner', 'fade'),hideDD();
}
}
function editpop()
{
d = document.getElementById("innerselect").value;
if(d == "Edit")
{
popupwin('edit','editinner', 'fade'),hideDD();
}
}
function addSecondaryContact(){
if (document.getElementById('secondaryContact').checked == true)
{
$('#secContactContr').show();
}
else{
$('#secContactContr').hide();
}
}
function addAfiliate(){
if (document.getElementById('Affiliate').checked == true)
{
$('#AffiliateContr').show();
}
else{
$('#AffiliateContr').hide();
}
}
$(document).ready(function () {
	$('#addhotelOpt').on('click', function (e) {
		$("#addhotelContr").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/b2b-images/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
		}
	});	
});
 $(document).ready(function () {
	$('#activitycontent1').on('click', function (e) {
		$("#actcontrol1").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/b2b-images/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
		}
	});	
});
 $(document).ready(function () {
	$('#hotelscontent1').on('click', function (e) {
		$("#hotelscontrol1").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/b2b-images/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
		}
	});	
});
$(document).ready(function () {
$('#bookingpolicy').on('click', function (e) {
		$('#bookingdetails').slideToggle("slow");
		$(this).toggleClass("active");
		 if ($(this).hasClass('active')) {
			$(this).text('- View more');		   
		}else{
			$(this).text('+ View more');
		}
	});
	
});
$(function() {
    $( "#datepicker-range1" ).datepicker({
      defaultDate: "+1w",	
	  dateFormat: "dd/mm/yy",
      numberOfMonths: 2,
	  defaultDate: Date.now(),
	  onSelect: function(dateText){
			  $(this).css("color","#333333");	
			  },
      onClose: function( selectedDate ) {
	
        $( "#datepicker-range2" ).datepicker( "option", "minDate", selectedDate );
      }
    }).datepicker("setDate", new Date());
    $( "#datepicker-range2" ).datepicker({
      defaultDate: "+1w",
      numberOfMonths: 2,	
	  dateFormat: "dd/mm/yy",
	  onSelect: function(dateText){
			  $(this).css("color","#333333");		
			  },
      onClose: function( selectedDate ) {

        $( "#datepicker-range1" ).datepicker( "option", "maxDate", selectedDate );
      }
    }).datepicker("setDate", new Date());
  });

function CHANGEBOOKING(tabid, contrid){
for(i=47; i<=48; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==47){
document.getElementById('way'+i).className = 'first';
}
if(i==48){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way47'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way48'){
document.getElementById(tabid).className = 'last sel';
}
}
function changebooking(tabid, contrid){
for(i=5; i<=6; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==5){
document.getElementById('way'+i).className = 'first';
}
if(i==6){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way5'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way6'){
document.getElementById(tabid).className = 'last sel';
}
}

function changecarbooking(tabid, contrid){
for(i=25; i<=26; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==25){
document.getElementById('way'+i).className = 'first';
}
if(i==26){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way25'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way26'){
document.getElementById(tabid).className = 'last sel';
}
}


function changeactivitybooking(tabid, contrid){
for(i=51; i<=52; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==51){
document.getElementById('way'+i).className = 'first';
}
if(i==52){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way51'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way52'){
document.getElementById(tabid).className = 'last sel';
}
}

function addactivitybooking(tabid, contrid){
for(i=53; i<=54; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==53){
document.getElementById('way'+i).className = 'first';
}
if(i==54){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way53'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way54'){
document.getElementById(tabid).className = 'last sel';
}
}

$(document).ready(function () {
	$('.addMore').on('click', function (e) {
		$(".addMoreDetail").slideToggle("slow");
		$('.add_details_icon').toggleClass("active");
	});
	$('.employee').on('click', function (e) {
		$("#employeesetting").show();
		$('#headquatersview').hide();
		$('#branchsetting').hide();
		$('#subagentsetting').hide();
	});
	$('.subagent').on('click', function (e) {
		$("#employeesetting").hide();
		$('#headquatersview').hide();
		$('#branchsetting').hide();
		$('#subagentsetting').show();
	});
	$('.branch').on('click', function (e) {
		$("#employeesetting").hide();
		$('#headquatersview').hide();
		$('#branchsetting').show();
		$('#subagentsetting').hide();
	});
	$('.headquater').on('click', function (e) {
		$("#employeesetting").hide();
		$('#headquatersview').show();
		$('#branchsetting').hide();
		$('#subagentsetting').hide();
	});
	$('.sidebarChckbox').on('click', function (e) {
		if($('#emp1').is(':checked') ||$('#emp2').is(':checked') ||$('#emp3').is(':checked') ||$('#branch1').is(':checked') ||$('#branch2').is(':checked') ||$('#branch3').is(':checked') ||$('#subagent1').is(':checked') ||$('#subagent2').is(':checked') ||$('#subagent3').is(':checked') )
		$(".checkOption").show();
		else
		$(".checkOption").hide();
	});	
});



if( $().sortable){	
	$("#daily_panel").sortable({
		handle: ".title",
		placeholder: "placeholder"
	});
	$("#daily_panel").disableSelection();
	}

if( $().sortable){	
	$("#sales_panel").sortable({
		handle: ".title",
		placeholder: "placeholder"
	});
	$("#sales_panel").disableSelection();
	}

$(document).ready(function() {
 //Select and deselect all checkboxes
 $("#checkAll").click(function () {
 $('.chk').prop('checked', this.checked);
 });
 
   //If one item deselect then checkbox 'checkAll' is UnCheck
   //If all items select individually then checkbox 'checkAll' is Check
   $(".chk").click(function () {
   $("#checkAll").prop('checked', ($('.chk:checked').length == $('.chk').length) ? true : false);   
   });
});
function addflight(tabid, contrid){
for(i=7; i<=8; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==7){
document.getElementById('way'+i).className = 'first';
}
if(i==8){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way7'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way8'){
document.getElementById(tabid).className = 'last sel';
}
}

function add1CAR(tabid, contrid){
for(i=55; i<=56; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==55){
document.getElementById('way'+i).className = 'first';
}
if(i==56){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way55'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way56'){
document.getElementById(tabid).className = 'last sel';
}
}

function add1flight(tabid, contrid){
for(i=29; i<=30; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==29){
document.getElementById('way'+i).className = 'first';
}
if(i==30){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way29'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way30'){
document.getElementById(tabid).className = 'last sel';
}
}

function add1flighthotel(tabid, contrid){
for(i=39; i<=40; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==39){
document.getElementById('way'+i).className = 'first';
}
if(i==40){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way39'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way40'){
document.getElementById(tabid).className = 'last sel';
}
}

function addflightcar(tabid, contrid){
for(i=45; i<=46; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==45){
document.getElementById('way'+i).className = 'first';
}
if(i==46){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way45'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way46'){
document.getElementById(tabid).className = 'last sel';
}
}

function addactivity(tabid, contrid){
for(i=49; i<=50; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==49){
document.getElementById('way'+i).className = 'first';
}
if(i==50){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way49'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way50'){
document.getElementById(tabid).className = 'last sel';
}
}

function changeflight(tabid, contrid){
for(i=13; i<=14; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==13){
document.getElementById('way'+i).className = 'first';
}
if(i==14){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way13'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way14'){
document.getElementById(tabid).className = 'last sel';
}
}

$(document).ready(function () {
$('.morepluschild').on('click', function (e) {
		$('.morepluschildOpt').slideToggle("slow");
		$(this).toggleClass("active");
		 if ($(this).hasClass('active')) {
			$(this).text(' - More (Frequent flyer, meal preference, seat preference, special request');		   
		}else{
			$(this).text(' + More (Frequent flyer, meal preference, seat preference, special request');
		}
	});
	
});
$(document).ready(function () {
$('#ideaspan').click(function(){
		if($('#ideaspan').hasClass('primaryBtn'))
		{
			$('#ideaspan').removeClass("primaryBtn");
			$('#ideaspan').addClass("tertiaryBtn");
		}
		else{
		$('#ideaspan').removeClass("tertiaryBtn");
			$('#ideaspan').addClass("primaryBtn");
		}
	
	});
$('#quetnspan').click(function(){
		if($('#quetnspan').hasClass('primaryBtn'))
		{
			$('#quetnspan').removeClass("primaryBtn");
			$('#quetnspan').addClass("tertiaryBtn");
		}
		else{
		$('#quetnspan').removeClass("tertiaryBtn");
			$('#quetnspan').addClass("primaryBtn");
		}
	
	});
$('#praise').click(function(){
		if($('#praise').hasClass('primaryBtn'))
		{
			$('#praise').removeClass("primaryBtn");
			$('#praise').addClass("tertiaryBtn");
		}
		else{
		$('#praise').removeClass("tertiaryBtn");
			$('#praise').addClass("primaryBtn");
		}
	
	});
$('#complaint').click(function(){
		if($('#complaint').hasClass('primaryBtn'))
		{
			$('#complaint').removeClass("primaryBtn");
			$('#complaint').addClass("tertiaryBtn");
		}
		else{
		$('#complaint').removeClass("tertiaryBtn");
			$('#complaint').addClass("primaryBtn");
		}
	
	});
	
});

/*Flights Services End*/
$(document).ready(function() {
 //Select and deselect all checkboxes
 $(".checkAllCoverage").click(function () {
 $('.chkCoverage').prop('checked', this.checked);
 });
 
   //If one item deselect then checkbox 'checkAll' is UnCheck
   //If all items select individually then checkbox 'checkAll' is Check
   $(".chkCoverage").click(function () {
   $(".checkAllCoverage").prop('checked', ($('.chk:checked').length == $('.chkCoverage').length) ? true : false);   
   });
});
$(document).ready(function() {
 //Select and deselect all checkboxes
 $(".checkAllCoverage3").click(function () {
 $('.chkCoverage3').prop('checked', this.checked);
 });
 
   //If one item deselect then checkbox 'checkAll' is UnCheck
   //If all items select individually then checkbox 'checkAll' is Check
   $(".chkCoverage3").click(function () {
   $(".checkAllCoverage3").prop('checked', ($('.chk:checked').length == $('.chkCoverage3').length) ? true : false);   
   });
});
$(document).ready(function() {
 //Select and deselect all checkboxes
 $(".checkAllCoverage4").click(function () {
 $('.chkCoverage4').prop('checked', this.checked);
 });
 
   //If one item deselect then checkbox 'checkAll' is UnCheck
   //If all items select individually then checkbox 'checkAll' is Check
   $(".chkCoverage4").click(function () {
   $(".checkAllCoverage4").prop('checked', ($('.chk:checked').length == $('.chkCoverage4').length) ? true : false);   
   });
});
$(document).ready(function() {
 //Select and deselect all checkboxes
 $(".checkAllCoverage5").click(function () {
 $('.chkCoverage5').prop('checked', this.checked);
 });
 
   //If one item deselect then checkbox 'checkAll' is UnCheck
   //If all items select individually then checkbox 'checkAll' is Check
   $(".chkCoverage5").click(function () {
   $(".checkAllCoverage5").prop('checked', ($('.chk:checked').length == $('.chkCoverage5').length) ? true : false);   
   });
});
$(document).ready(function() {
 //Select and deselect all checkboxes
 $(".checkAllCoverage6").click(function () {
 $('.chkCoverage6').prop('checked', this.checked);
 });
 
   //If one item deselect then checkbox 'checkAll' is UnCheck
   //If all items select individually then checkbox 'checkAll' is Check
   $(".chkCoverage6").click(function () {
   $(".checkAllCoverage6").prop('checked', ($('.chk:checked').length == $('.chkCoverage6').length) ? true : false);   
   });
});
$(document).ready(function() {
 //Select and deselect all checkboxes
 $(".checkAllCoverage7").click(function () {
 $('.chkCoverage7').prop('checked', this.checked);
 });
 
   //If one item deselect then checkbox 'checkAll' is UnCheck
   //If all items select individually then checkbox 'checkAll' is Check
   $(".chkCoverage7").click(function () {
   $(".checkAllCoverage7").prop('checked', ($('.chk:checked').length == $('.chkCoverage7').length) ? true : false);   
   });
});
$(document).ready(function() {
 //Select and deselect all checkboxes
 $(".checkAllCoverage8").click(function () {
 $('.chkCoverage8').prop('checked', this.checked);
 });
 
   //If one item deselect then checkbox 'checkAll' is UnCheck
   //If all items select individually then checkbox 'checkAll' is Check
   $(".chkCoverage8").click(function () {
   $(".checkAllCoverage8").prop('checked', ($('.chk:checked').length == $('.chkCoverage8').length) ? true : false);   
   });
});
$(document).ready(function() {
 //Select and deselect all checkboxes
 $(".checkAllCoverage1").click(function () {
 $('.chkCoverage1').prop('checked', this.checked);
 });
 
   //If one item deselect then checkbox 'checkAll' is UnCheck
   //If all items select individually then checkbox 'checkAll' is Check
   $(".chkCoverage1").click(function () {
   $(".checkAllCoverage1").prop('checked', ($('.chk:checked').length == $('.chkCoverage1').length) ? true : false);   
   });
});
$(document).ready(function() {
 //Select and deselect all checkboxes
 $(".checkAllCoverage2").click(function () {
 $('.chkCoverage2').prop('checked', this.checked);
 });
 
   //If one item deselect then checkbox 'checkAll' is UnCheck
   //If all items select individually then checkbox 'checkAll' is Check
   $(".chkCoverage2").click(function () {
   $(".checkAllCoverage2").prop('checked', ($('.chk:checked').length == $('.chkCoverage2').length) ? true : false);   
   });
});
function flight_hotel_way(tabid, contrid){
for(i=10; i<=12; i++){
document.getElementById('flight_hotel_way'+i).className = '';
document.getElementById('flight_hotel_wayContr'+i).style.display = 'none'
if(i==10){
document.getElementById('flight_hotel_way'+i).className = 'first';
}
if(i==12){
document.getElementById('flight_hotel_way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'flight_hotel_way10'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'flight_hotel_way12'){
document.getElementById(tabid).className = 'last sel';
}
}

function disable6() {
    document.getElementById("My_Select6").disabled=true;
}
function enable6() {
    document.getElementById("My_Select6").disabled=false;
}
function switchVisible6() {
            if (document.getElementById('My_Select6')) {

                if (document.getElementById('My_Select6').style.display == 'none') {
                    document.getElementById('My_Select6').style.display = 'block';
                    document.getElementById('text7').style.display = 'none';
                }
                else {
                    document.getElementById('My_Select6').style.display = 'none';
                    document.getElementById('text7').style.display = 'block';
                }
            }
}
function disable8() {
    document.getElementById("My_Select8").disabled=true;
}
function enable8() {
    document.getElementById("My_Select8").disabled=false;
}
function switchVisible8() {
            if (document.getElementById('My_Select8')) {

                if (document.getElementById('My_Select8').style.display == 'none') {
                    document.getElementById('My_Select8').style.display = 'block';
                    document.getElementById('text20').style.display = 'none';
                }
                else {
                    document.getElementById('My_Select8').style.display = 'none';
                    document.getElementById('text20').style.display = 'block';
                }
            }
}

function disable9() {
    document.getElementById("My_Select9").disabled=true;
}
function enable9() {
    document.getElementById("My_Select9").disabled=false;
}
function switchVisible9() {
            if (document.getElementById('My_Select9')) {

                if (document.getElementById('My_Select9').style.display == 'none') {
                    document.getElementById('My_Select9').style.display = 'block';
                    document.getElementById('text10').style.display = 'none';
                }
                else {
                    document.getElementById('My_Select9').style.display = 'none';
                    document.getElementById('text10').style.display = 'block';
                }
            }
}

function disable7() {
    document.getElementById("My_Select7").disabled=true;
}
function enable7() {
    document.getElementById("My_Select7").disabled=false;
}
function switchVisible7() {
            if (document.getElementById('My_Select7')) {

                if (document.getElementById('My_Select7').style.display == 'none') {
                    document.getElementById('My_Select7').style.display = 'block';
                    document.getElementById('text11').style.display = 'none';
                }
                else {
                    document.getElementById('My_Select7').style.display = 'none';
                    document.getElementById('text11').style.display = 'block';
                }
            }
}

function disable2() {
    document.getElementById("My_Select3").disabled=true;
}
function enable2() {
    document.getElementById("My_Select3").disabled=false;
}
function switchVisible33() {
            if (document.getElementById('My_Select33')) {

                if (document.getElementById('My_Select33').style.display == 'none') {
                    document.getElementById('My_Select33').style.display = 'block';
                    document.getElementById('text33').style.display = 'none';
                }
                else {
                    document.getElementById('My_Select33').style.display = 'none';
                    document.getElementById('text33').style.display = 'block';
                }
            }
			}
function switchVisible31() {
            if (document.getElementById('baggage31')) {

                if (document.getElementById('baggage31').style.display == 'none') {
                    document.getElementById('baggage31').style.display = 'block';
                    document.getElementById('text31').style.display = 'none';
                }
                else {
                    document.getElementById('baggage31').style.display = 'none';
                    document.getElementById('text31').style.display = 'block';
                }
            }
}

$(document).ready(function(){
$('#baggage31').change(function(){
if(this.value=='1 kg @ Rs 350'){
$('.priceshow').show();
}
else{
$('.priceshow').hide();
}

});
});
function disable3() {
    document.getElementById("My_Select4").disabled=true;
}
function enable3() {
    document.getElementById("My_Select4").disabled=false;
}
function switchVisible4() {
            if (document.getElementById('My_Select4')) {

                if (document.getElementById('My_Select4').style.display == 'none') {
                    document.getElementById('My_Select4').style.display = 'block';
                    document.getElementById('text6').style.display = 'none';
                }
                else {
                    document.getElementById('My_Select4').style.display = 'none';
                    document.getElementById('text6').style.display = 'block';
                }
            }
}
function editMarkupFliter(id)
{
document.getElementById("edit_applybtn"+id).style.display='block';
document.getElementById("edit_markupbtn"+id).style.display='none';
document.getElementById("edit_markuptext"+id).style.display='none';
document.getElementById("edit_markuptextfeild"+id).style.display='block';

}
function editMarkupFliterClose(id)
{
document.getElementById("edit_applybtn"+id).style.display='none';
document.getElementById("edit_markupbtn"+id).style.display='block';
document.getElementById("edit_markuptext"+id).style.display='block';
document.getElementById("edit_markuptextfeild"+id).style.display='none';

}

$('#workselect').on('click', function (e) {
$('#btmTop').show();
$('#workselect').addClass('sel');
});



$('#fetchNetfare').on('change', function (e) {
if($("#fetchNetfare").is(':checked')) {
$('.fetchContr').show();
}else{
$('.fetchContr').hide();
}
});
$('#fetchNetfareport').on('change', function (e) {
if($("#fetchNetfareport").is(':checked')) {
$('.fetchContr').show();
}else{
$('.fetchContr').hide();
}
});
$( ".calFliter" ).click(function() {
$( ".calFliterCtnr" ).hide();
$( "#moresrcContr" ).show();


});
$( ".calFliterShow" ).click(function() {
$( ".calFliterCtnr" ).show();
$( "#moresrcContr" ).hide();

});

$('.matfliterAll').on('click', function( e ) {
$(".matflitercell").removeClass('bkgGrn');
});
$('.matflitercell').on('click', function( e ) {
$(".matflitercell").removeClass('bkgGrn');
$(this).addClass('bkgGrn');
});

$('#oneWayOnward3').on('click', function (e) {
		$("#oneWayOnwardFare3").show();
		$("#oneWayReturnFare3").hide();
		$(this).addClass("sel");
		$("#oneWayReturn3").removeClass("sel");
	});
	
	$('#oneWayReturn3').on('click', function (e) {
		$("#oneWayOnwardFare3").hide();
		$("#oneWayReturnFare3").show();
		$(this).addClass("sel");
		$("#oneWayOnward3").removeClass("sel");
	});
	



function roomlist()
{
var count=document.getElementById("roomcount1");
var limit =count.value;
var str=" ";
if( limit != 0)
{
for(var i=2;i<=limit;i++)
{
str +='<ul class="row mB10 mT15 clearfix"><li class="col_2">&nbsp;</li><li class="col_1_half pR0"> <span class="mT30 fL">Room ' + i + ':</span></li><li class="col_2 pL0"><label>Adult</label><input type="text" class="w100pcnt" maxlength="3" value="1"><span class="fS11 fL">12+ yrs</span></li><li class="col_2 "><label>Children</label><input type="text" class="w100pcnt" maxlength="3" value="0" id="childCount'+i+'" ><span class="fS11 fL">2 - 12 yrs</span> </li><li class="col_4 mB10"><ul id="childage'+i+'"></ul></li></ul>';
}
document.getElementById("newroom").innerHTML = str;
}
}

function agechildlist(a)
{
var count=document.getElementById("childCount"+a);
var limit =count.value;
var str=" ";
for(var i=1;i<=limit;i++)
{
str +="<li class='col_6 mB10 pR0' id='popupchild"+a+"_"+i+"'><label>Child  "+ i +" </label><select><option value='Age'>Age</option><option value=1'>1</option><option value='2'>2</option><option value='3'>3</option></select></li>";
}

document.getElementById("childage"+a).innerHTML = str;
}
//tabslinks
$(document).ready(function () {
$('#gotoreview').on('click', function (e) {
var currentAttrValue = $(this).attr('href');
$('html, body').animate({
scrollTop: $("#shortcut1").offset().top
}, 200);
// Show/Hide Tabs
$('.tabs ' + currentAttrValue).removeClass('dN').siblings().addClass('dN');

// Change/remove current tab to active
$('#shortcut1').parents('li').addClass('sel').siblings().removeClass('sel');
$('#noticeContr4').show();
$('#noticeContr0, #noticeContr1, #noticeContr3, #noticeContr2, #noticeContr5, #noticeContr6, #noticeContr7').addClass('dN');

$('.tabLinks').show();

e.preventDefault();

});

$('#morebtn').on('click', function () {
$('#morereviews').show();
$('#lessbtn').show();
$('#morebtn').hide();
});

$('#lessbtn').on('click', function () {
$('#morereviews').hide();
$('#lessbtn').hide();
$('#morebtn').show();
});

$('#morebtn1').on('click', function () {
$('#morereviews1').show();
$('#lessbtn1').show();
$('#morebtn1').hide();
});

$('#lessbtn1').on('click', function () {
$('#morereviews1').hide();
$('#lessbtn1').hide();
$('#morebtn1').show();
});
$('#morebtn2').on('click', function () {
$('#morereviews2').show();
$('#lessbtn2').show();
$('#morebtn2').hide();
});

$('#lessbtn2').on('click', function () {
$('#morereviews2').hide();
$('#lessbtn2').hide();
$('#morebtn2').show();
});
$('#morebtn3').on('click', function () {
$('#morereviews3').show();
$('#lessbtn3').show();
$('#morebtn3').hide();
});

$('#lessbtn3').on('click', function () {
$('#morereviews3').hide();
$('#lessbtn3').hide();
$('#morebtn3').show();
});
$('#morebtn4').on('click', function () {
$('#morereviews4').show();
$('#lessbtn4').show();
$('#morebtn4').hide();
});

$('#lessbtn4').on('click', function () {
$('#morereviews4').hide();
$('#lessbtn4').hide();
$('#morebtn4').show();
});
$('#morebtn5').on('click', function () {
$('#morereviews5').show();
$('#lessbtn5').show();
$('#morebtn5').hide();
});

$('#lessbtn5').on('click', function () {
$('#morereviews5').hide();
$('#lessbtn5').hide();
$('#morebtn5').show();
});
$('#morebtn6').on('click', function () {
$('#morereviews6').show();
$('#lessbtn6').show();
$('#morebtn6').hide();
});

$('#lessbtn6').on('click', function () {
$('#morereviews6').hide();
$('#lessbtn6').hide();
$('#morebtn6').show();
});

$('#gotoam').on('click', function (e) {
var currentAttrValue = $(this).attr('href');
$('html, body').animate({
scrollTop: $("#amem").offset().top
}, 200);
// Show/Hide Tabs
$('.tabs ' + currentAttrValue).removeClass('dN').siblings().addClass('dN');

// Change/remove current tab to active
$('#shortcut').parents('li').addClass('sel').siblings().removeClass('sel');
$('#noticeContr2').show();
$('#noticeContr0, #noticeContr1 , #noticeContr3, #noticeContr4, #noticeContr5, #noticeContr6, #noticeContr7').addClass('dN');

$('.tabLinks').show();

e.preventDefault();

});
$('#gotodates').on('click', function (e) {
var currentAttrValue = $(this).attr('href');
$('html, body').animate({
scrollTop: $("#redirect").offset().top
}, 200);
// Change/remove current tab to active
$('#redirect').parents('li').addClass('sel').siblings().removeClass('sel');
$('.showcontr3').show();
$('.hidecontr1').hide();
$('.hidecontr2').hide();
$('.hidecontr3').hide();
$('.hidecontr4').hide();
$('.hidecontr5').hide();
$('.hidecontr6').hide();
$('.hidecontr7').hide();
e.preventDefault();

});
});

function bustype(tabid, contrid){
for(i=17; i<=18; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==17){
document.getElementById('way'+i).className = 'first';
}
if(i==18){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way17'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way18'){
document.getElementById(tabid).className = 'last sel';
}
}

function BUSTYPE(tabid, contrid){
for(i=19; i<=20; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==19){
document.getElementById('way'+i).className = 'first';
}
if(i==20){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way19'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way20'){
document.getElementById(tabid).className = 'last sel';
}
}


function cruisecancel(tabid, contrid){
for(i=24; i<=27; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==24){
document.getElementById('way'+i).className = 'first';
}
if(i==27){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way24'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way27'){
document.getElementById(tabid).className = 'last sel';
}
}

$(document).ready(function () {
	$('#portmoresrc3').on('click', function (e) {
		$("#moresrcContr3").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			//$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
			$("#portmoresrc3").html('<a href="javascript:void(0);"><img src="images/b2b-images/expand_blu.png" alt="Arrow" class="mR5 fL mT5">less</a>')	
				   
		}else{
			//$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
			$("#portmoresrc3").html('<a href="javascript:void(0);"><img src="images/b2b-images/collapse_blu.png" alt="Arrow" class="mR5 fL mT5">more</a>')	
		}
	});	
});

$(document).ready(function () {
	$('#portmoresrc4').on('click', function (e) {
		$("#moresrcContr4").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			//$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
			$("#portmoresrc4").html('<a href="javascript:void(0);"><img src="images/b2b-images/expand_blu.png" alt="Arrow" class="mR5 fL mT5">less</a>')	
				   
		}else{
			//$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
			$("#portmoresrc4").html('<a href="javascript:void(0);"><img src="images/b2b-images/collapse_blu.png" alt="Arrow" class="mR5 fL mT5">more</a>')	
		}
	});	
});


function selectThumnail(id)
{
for(i=1;i<10;i++)
{
document.getElementById('Thumbnail'+i).style.border="";
}
document.getElementById('Thumbnail'+id).style.border="#16a085 5px solid";
}

$(document).ready(function(){
$('.myckeckbox2').change(function(){
if(this.checked){
$('.showdate').fadeIn('fast');
$('.enabledate').hide();}
else{
$('.showdate').fadeOut('fast');
$('.enabledate').show();}

});
});

$(document).ready(function(){
$('.myckeckbox1').change(function(){
if(this.checked){
$('.dateshow').show();
$('.enabledate1').hide();}
else{
$('.dateshow').hide();
$('.enabledate1').show();}

});
});

$(document).ready(function(){
$('.myckeckbox').change(function(){
if(this.checked){
$('.datep').show();
$('.hidedate').hide();}
else{
$('.datep').hide();
$('.hidedate').show();}
});
});

function selMainSrc1(tabid, contrid){
for(i=1; i<=5; i++){
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
document.getElementById(tabid).className = 'activitiesTab sel';
document.getElementById(contrid).style.display = 'block'
}
if(tabid == 'globalSrcTab4'){
document.getElementById(tabid).className = 'carTab sel';
document.getElementById(contrid).style.display = 'block'
}
if(tabid == 'globalSrcTab5'){
document.getElementById(tabid).className = 'busTab sel';
document.getElementById(contrid).style.display = 'block'
}

}
$(document).ready(function()
{
$('body').bind('click', function(evt) {
$('#addNav').removeClass('sel');
$('#addOpt').hide();
//reset moreOptions (+)
var moreCont = $('ul#addOpt');
if (moreCont.length) {
moreCont.removeClass('show_options');
}

$('#oneWayOnward1').on('click', function (e) {
$("#oneWayOnwardFare1").show();
$("#oneWayReturnFare1").hide();
$(this).addClass("sel");
$("#oneWayReturn1").removeClass("sel");
});

$('#oneWayReturn1').on('click', function (e) {
$("#oneWayOnwardFare1").hide();
$("#oneWayReturnFare1").show();
$(this).addClass("sel");
$("#oneWayOnward1").removeClass("sel");
});

});
$('#addNav').bind('click', function(evt) {
evt.preventDefault();
evt.stopPropagation();
var optCont = $('ul#addOpt');
if (optCont.hasClass('show_options')) {
optCont.removeClass('show_options').css('display', 'none');
$(this).parent('div').removeClass('sel');
} else {
optCont.addClass('show_options').css('display', 'block');
$(this).parent('div').addClass('sel');
}
});


});

if($().datepicker){
$( "#datepicker13, #datepicker14, #datepicker15, #datepicker16, #datepicker17, #datepicker18, #datepicker19, #datepicker20, #datepicker21, #datepicker22, #datepicker23, #datepicker24, #datepicker25, #datepicker26, #datepicker27, #datepicker28, #datepicker29, #datepicker30, #datepicker31, #datepicker32, #datepicker33, #datepicker34, #datepicker35, #datepicker36, #datepicker37, #datepicker38" ).datepicker({
numberOfMonths:2,
minDate: 0,
dateFormat: "dd/mm/yy",
onSelect: function(dateText){
$(this).css("color","#333333");
}
});
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
$('.eurailopt1').on('click', function (e) {
$('.eurailopt1 ').parents('div').find('.eurailoptdetails1').slideToggle();
$('.eurailopt1').toggleClass("active");
if ($('.eurailopt1').hasClass('active')) {
$('.eurailsymbol').text('-');
}else{
$('.eurailsymbol').text('+');
}
});
$('.showunder').on('click', function (e) {
$(this).parents('div').find('.showunderdetails').slideToggle();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text(' - What is a Rail Pass?');
}else{
$(this).text(' + What is a Rail Pass?');
}
});
$('.showbooking1').on('click', function (e) {
$(this).parents('div').find('.showbookingdetails1').slideToggle();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text(' - How do I know the right rail pass and how many days I should purchase?');
}else{
$(this).text(' + How do I know the right rail pass and how many days I should purchase?');
}
});
$('.showundertrain').on('click', function (e) {
$(this).parents('div').find('.showundertraindetails').slideToggle();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text(' - How long are train tickets valid for?');
}else{
$(this).text(' + How long are train tickets valid for?');
}
});
$('.showbookingtrain').on('click', function (e) {
$(this).parents('div').find('.showbookingtraindetails').slideToggle();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text(' - So, why should I book my ticket from Rail Europe?');
}else{
$(this).text(' + So, why should I book my ticket from Rail Europe?');
}
});
$('.showunderseat').on('click', function (e) {
$(this).parents('div').find('.showunderseatdetails').slideToggle();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text(' - What’s the difference between a seat reservation and a train ticket?');
}else{
$(this).text(' + What’s the difference between a seat reservation and a train ticket?');
}
});
$('.showbookingseat').on('click', function (e) {
$(this).parents('div').find('.showbookingseatdetails').slideToggle();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text(' - Should I buy my seat reservations prior to leaving North America, or can I just get them at the station in Europe?');
}else{
$(this).text(' + Should I buy my seat reservations prior to leaving North America, or can I just get them at the station in Europe?');
}
});

$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper         = $(".add_city_index11"); //Fields wrapper
var add_button      = $(".add_city_button_index11"); //Add button ID

var x1=3;
var x2=21;//initial text box count
var id1=1;
var id2=2;
$(add_button).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields || x2 < max_fields){ //max input box allowed
x1++;
x2++;			//text box increment
id1=1+x1;
id2=2+x2;
$(wrapper).append('<ul class="mB10 clearfix"><li class="col_8 pR0 pL0"><label class="mT10">Flight '+id1+':</label><div class="search-bar grey_border fL mR20 w47pcnt"><input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="mwFlight1From" /><input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/b2b-images/destination_from.png" /></div><div class="search-bar grey_border fL w47pcnt"><input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="mwFlight1To" /><input type="image" class="toDestination" name="search" alt="Search" title="Search" src="images/b2b-images/destination_to.png" /></li><li class="col_3 mT10"><label>Departure</label><input id="datepicker'+id2+'" class="w70pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /></li><li class="col_1 mT30 pR0 remove_field" style="position:absolute;"><span class="popup_close_icon"></span></li></ul>'); //add input box

}


if($().datepicker){
$( "#datepicker21,#datepicker22, #datepicker23, #datepicker24, #datepicker25, #datepicker26, #datepicker27, #datepicker28, #datepicker29, #datepicker30, #datepicker31, #datepicker32, #datepicker33, #datepicker34, #datepicker35, #datepicker36, #datepicker37, #datepicker38, #datepicker39, #datepicker40, #datepicker41, #datepicker42, #datepicker43, #datepicker44, #datepicker44, #datepicker45, #datepicker46, #datepicker47, #datepicker48, #datepicker49, #datepicker50, #datepicker51, #datepicker52, #datepicker53, #datepicker54, #datepicker55, #datepicker56, #datepicker57, #datepicker58, #datepicker59, #datepicker60, #datepicker61, #datepicker62, #datepicker63" ).datepicker({
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
e.preventDefault(); $(this).parent('ul').remove();
})

});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper         = $(".add_city_index"); //Fields wrapper
var add_button      = $(".add_city_button_index"); //Add button ID

var x1=1; //initial text box count
var x2=21;
var x3=38;
var x4=51;
var x5=1;
var x6=1;
var id1=0;
var id2=1;
var id3=1;
var id4=1;
var id5=0;
var id6=0;
$(add_button).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields || x2 < max_fields || x3 < max_fields || x4 < max_fields || x5 < max_fields ||  x6 < max_fields){ //max input box allowed
x1++; //text box increment
x2++;
x3++;
x4++;
x5++;
x6++;
id1=0+x1;
id2=1+x2;
id3=1+x3;
id4=1+x4;
id5=0+x5;
id6=0+x6;
$(wrapper).append('<ul class="mB10 clearfix"><li class="col_8 col_8_sm pR0 pL0"><label class="mT10">Flight '+id1+':</label><div class="search-bar gray_border fL  w47pcnt"><input type="text" class=" w100pcnt" name="searchterm" placeholder="From" id="mwFlight1From" /><input type="image" class="fromDestination mR20 " name="search" alt="Search" title="Search" src="images/b2b-images/destination_from.png" /></div><div class="search-bar gray_border fL w47pcnt"><input type="text" class=" w100pcnt" name="searchterm" placeholder="To" id="mwFlight1To" /><input type="image" class="toDestination mR20" name="search" alt="Search" title="Search" src="images/b2b-images/destination_to.png" /></div></li><li class="col_3 pR0 pL0 mL10"><label class="mT10"> Departure </label><input id="datepicker'+id2+'" class="w80pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /></li><li class="col_3_half col_4_sm mT20 pL0"><input type="checkbox"  id="mycheckbox'+id5+'" onclick="showhoteldate('+id5+')" /><label class=" w100pcnt">Need hotel in Delhi</label></li><li class="col_3 pR0 pL0 mT20 mL200 datep'+id6+'" style="display:none;" ><label>Check-in</label><input id="datepicker'+id3+'" class="w80pcnt dateField " type="text" placeholder="DD/MM/YYYY" readonly  /></li><li class="col_3 pR0 pL0 mT20 mL10 mL10_sm datep'+id6+'" style="display:none;"><label>Check-out</label><input id="datepicker'+id4+'" class="w80pcnt dateField " type="text" placeholder="DD/MM/YYYY" readonly  /></li><li class="col_2 mT20 datep'+id6+'" style="display:none"><label>Night(s)</label><input type="text" class="w100pcnt" id="nights" disabled /><span id="msg"></span></li><li class="col_1 mT30 pR0 remove_field" style="position:absolute;"><span class="popup_close_icon"></span></li></ul>'); //add input box

}



if($().datepicker){
$( "#datepicker21,#datepicker22, #datepicker23, #datepicker24, #datepicker25, #datepicker26, #datepicker27, #datepicker28, #datepicker29, #datepicker30, #datepicker31, #datepicker32, #datepicker33, #datepicker34, #datepicker35, #datepicker36, #datepicker37, #datepicker38, #datepicker39, #datepicker40, #datepicker41, #datepicker42, #datepicker43, #datepicker44, #datepicker44, #datepicker45, #datepicker46, #datepicker47, #datepicker48, #datepicker49, #datepicker50, #datepicker51, #datepicker52, #datepicker53, #datepicker54, #datepicker55, #datepicker56, #datepicker57, #datepicker58, #datepicker59, #datepicker60, #datepicker61, #datepicker62, #datepicker63" ).datepicker({
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
e.preventDefault(); $(this).parent('ul').remove();
})

});
//add card
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper         = $("#addcardfields"); //Fields wrapper
var add_button      = $("#addcardfieldBtn"); //Add button ID

var x1=4; //initial text box count
$(add_button).click(function(e){ //on add input button click
e.preventDefault();//max input box allowed
x1++; //text box increment

$(wrapper).append('<div class=" clearfix" id="card_'+x1+'"> <table  class="dataTablebtm col_12 mT20imp "> <tr> <th class="w215">'+$('#CardHolderName').val()+'</th> <th ><span class="mR10">Transaction limit </span>Rs. <input type="text" class="w50pcnt mL5" name="limit" value="10,00,000" /></th> <th><span class="mR10">Master service fee</span> Rs. <input type="text" class="w50pcnt mL5" name="fee" value="100" /></th> </tr> </table>  <table  class=" dataTable  col_12"> <tr> <td>Card holder name</td> <td>Card number</td> <td>Expiry date</td> <td>Card type</td> </tr> <tr> <td>Mr Amal Mehta</td> <td>XXXX XXXX XXXX 6790</td> <td>09 / 20</td> <td><img src="images/b2b-images/visa.png" alt="card"/></td> </tr> </table> <a href="javascript:void(0);" onclick="popupwin(\'deactivate\',\'deactivateinner\',\'fade\'),remove_card('+x1+')">Remove Card</a> </div>'); //add input box


});
});
$(document).ready(function(){
  $("#addnewcard").click(function(){
    $("#newcard").show();
	$(".addNewCard").hide();
  });

  $("#removenewcard").click(function(){
    $("#newcard").hide();
	$(".addNewCard").show();
  });
});

function remove_card( id)
{
$('#card_'+id).remove();
}
$(document).ready(function(){
$('.myckeckbox2').change(function(){
if(this.checked)
$('.showdate').fadeIn('fast');
else
$('.showdate').fadeOut('fast');

});
});
$(document).ready(function(){
$('.myckeckbox1').change(function(){
if(this.checked)
$('.dateshow').fadeIn('fast');
else
$('.dateshow').fadeOut('fast');

});
});
$(document).ready(function(){
$('.updatePanBtn').click(function(){

$('.updatePan').show();
$('.updatePanCtr').hide();

});
});
$(document).ready(function () {
$('#portmoresrc1').on('click', function (e) {
$("#moresrcContr1").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
//$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
$("#portmoresrc1").html('<a href="javascript:void(0);"><img src="images/b2b-images/expand_blu.png" alt="Arrow" class="mR5 fL mT5">less</a>');

}else{
//$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
$("#portmoresrc1").html('<a href="javascript:void(0);"><img src="images/b2b-images/collapse_blu.png" alt="Arrow" class="mR5 fL mT5">more</a>')	;
}
});
});

$(document).ready(function () {
$('#portmoresrc2').on('click', function (e) {
$("#moresrcContr2").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
//$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
$("#portmoresrc2").html('<a href="javascript:void(0);"><img src="images/b2b-images/expand_blu.png" alt="Arrow" class="mR5 fL mT5">less</a>')	;

}else{
//$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
$("#portmoresrc2").html('<a href="javascript:void(0);"><img src="images/b2b-images/collapse_blu.png" alt="Arrow" class="mR5 fL mT5">more</a>')	;
}
});
});
function showOptions() {
flights.addFlight(true);
}

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

var buildFlightForm = function(DeleteOption) {
var baseCont = $('<ul/>').attr('id', flightContainer + flightCnt).attr('data-flight-count', flightCnt);
baseCont.addClass('mB10 clearfix ' + flightContainerClass);

var flightCont = $('<li/>').addClass('col_8 col_12_sm pR0 pL0');

var lblTag = $('<label/>').text('Flight ' + flightCnt + ':').addClass('mT10');

var flightNameCont1 = $('<div/>').addClass('search-bar fL mR20 w47pcnt');
var flightNameTextBox1 = $('<input/>')
.attr('type', 'text')
.addClass( 'sfield w95pcnt')
.attr('name', 'searchterm')
.attr('placeholder', 'From')
.attr('id', flightFrom + flightCnt)

var flightNameDest1 =$('<input/>')
.attr('type', 'image')
.addClass('fromDestination')
.attr('name', 'search')
.attr('alt', 'Search')
.attr('title', 'Search')
.attr('src', 'images/b2b-images/destination_from.png');
flightNameTextBox1.appendTo(flightNameCont1);
flightNameDest1.appendTo(flightNameCont1);

var flightNameCont2 = $('<div/>').addClass('search-bar fL w47pcnt');

var flightNameTextBox2 = $('<input />')
.attr('type', 'text')
.addClass( 'sfield w95pcnt')
.attr('name', 'searchterm')
.attr('placeholder', 'To')
.attr('id',  flightTo + flightCnt)

var flightNameDest2 =$('<input/>')
.attr('type', 'image')
.addClass('toDestination')
.attr('name', 'search')
.attr('alt', 'Search')
.attr('title', 'Search')
.attr('src', 'images/b2b-images/destination_to.png');
flightNameTextBox2.appendTo(flightNameCont2);
flightNameDest2.appendTo(flightNameCont2);

lblTag.appendTo(flightCont);
flightNameCont1.appendTo(flightCont);
flightNameCont2.appendTo(flightCont);

var departureCont = $('<li/>').addClass('col_2 col_6_sm');
var departureLabel = $('<label/>').text('Departure').addClass('mT10');
var departureDate = $('<input />')
.addClass('w100pcnt dateField')
.attr('id', dtPicker + flightCnt)
.attr('type', 'text')
.css({'width': '130'})
.val('DD/MM/YYYY');
departureLabel.appendTo(departureCont);
departureDate.appendTo(departureCont);

var preferredCont = $('<li/>').addClass('col_2 col_5_sm pL0');
var preferredLabel = $('<label/>').text('Preferred Time').addClass('mT10');
var preferredTime = $('<select/>').addClass('w80pcnt')
.attr('id', flightCnt);

preferredLabel.appendTo(preferredCont);
preferredTime.appendTo(preferredCont);
var option="<option value='8:00AM'>8:00AM</option>";

flightCont.appendTo(baseCont);
departureCont.appendTo(baseCont);
if (DeleteOption) {
var delCont = $('<li/>').addClass('closeMultipleWay').attr('id', flightDel + flightCnt).attr('data-flight-no', flightCnt);
var delLink = $('<div/>').addClass('close_multicity_panel fR');
delLink.appendTo(delCont);
delCont.appendTo(baseCont);
}
if (rootContainer.find('> ul').length) {
rootContainer.find('> ul').last().after(baseCont);
baseCont.appendTo(rootContainer);
} else {
baseCont.prependTo(rootContainer);
}
var str="#"+flightCnt;
$(str).html(option);
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

function twotab(tab, contr){
for(i=1; i<=2; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==4){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}


function myprofile(tab, contr){
for(i=1; i<=6; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==6){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}
function commercials(tab, contr){
for(i=1; i<=3; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==3){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}

function branch(tab, contr){
for(i=8; i<=10; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==10){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}

function srpbus(tab, contr){
for(i=31; i<=36; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==36){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt h56';
document.getElementById(contr).style.display = 'block'
}

function settings(tab, contr){
for(i=1; i<=4; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==4){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}

function agent(tab, contr){
for(i=4; i<=5; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==5){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}
function quoatetab(tab, contr){
for(i=10; i<=12; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==12){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}
function addproducttab(tab, contr){
for(i=1; i<=5; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==5){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}
$("#chkavailable").click(function(){
if($("#loginname").val() == 'admin')
{
$(".success").show();
$(".error").hide();
}
else{
$(".error").show();
$(".success").hide();
}
});

$(document).ready(function () {
$('.AgntInfo').on('click', function (e) {
$(this).next('.AgntInfoCntr').slideToggle();
$('.PayInfoCntr').hide();
$('.KycInfoCntr').hide();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});

$(document).ready(function () {
$('.KycInfo').on('click', function (e) {
$(this).next('.KycInfoCntr').slideToggle();
$('.AgntInfoCntr').hide();
$('.PayInfoCntr').hide();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});

$(document).ready(function () {
$('.PayInfo').on('click', function (e) {
$(this).next('.PayInfoCntr').slideToggle();
$('.AgntInfoCntr').hide();
$('.KycInfoCntr').hide();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});

$(function(){
$('.btn-upload').click(function(e){
e.preventDefault();
$('#file').click();}
);
});
$(function(){
$('.btn-upload1').click(function(e){
e.preventDefault();
$('#file1').click();}
);
});

$(function(){
$('#cheque').show(); // Will show the div
$('#paymentType').change(function(){
var selected = $(this).find(':selected').val();
//alert(selected);
$("#cheque").hide();
$("#cash").hide();
$("#ot").hide();
$("#net").hide();
$("#credit").hide();
$("#vouchers").hide();
$('#' + selected).show();
});
});
function showDiv() {
document.getElementById('addnewsetupdetails').style.display = "block";
}
$('.drop-down-show-hide').hide();

$('#dropDown').change(function(){
$(this).find("option").each(function()
{
$('#' + this.value).hide();
});
$('#' + this.value).show();

});

function addChild(s){
document.getElementById("popupchild" + s + "_" + child_Count).innerHTML = '<label>Child ' + child_Count + '</label><select class="pT0 pB0"><option value="Age">Age</option><option value="1">1</option><option value="2">2</option><option value="3">3</option></select>';
}
function remChild(s){
document.getElementById("popupchild" + s + "_" + (child_Count+1)).innerHTML = '';
}
function addproduct(tabid, contrid){
for(i=1; i<=7; i++){
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

$(document).ready(function () {
$('#editOpt').on('click', function (e) {
$("#editContr").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});

$(document).ready(function () {
$('#hotelOpt1').on('click', function (e) {
$("#hotelContr1").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});

$(document).ready(function () {
$('#hotelOpt2').on('click', function (e) {
$("#hotelContr2").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
document.getElementById('showImage').style.display="none";
document.getElementById('hide').style.display="none";
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
document.getElementById('showImage').style.display="block";
document.getElementById('hide').style.display="block";
}
});
});
$(document).ready(function () {
$('.payFlights').on('click', function (e) {
$('.payFlightsCntr').slideToggle('slow');
$('.payhotelsCntr').hide('slow');
$('.payCarsCntr').hide('slow');
$('.payBusCntr').hide('slow');
$('.payEurailPassCntr').hide('slow');
$('.payEurailTicketCntr').hide('slow');
$('.payCruiseCntr').hide('slow');
$('.payActivityCntr').hide('slow');
$('.payVisaCntr').hide('slow');
$('.payInsuranceCntr').hide('slow');
$('.payFlightHotelCntr').hide('slow');
$('.payFlightHotelCarCntr').hide('slow');
$('.payHolidayCntr').hide('slow');
$('.payForexCntr').hide('slow');
$('.payhotels').removeClass('active');
$('.payhotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCars').removeClass('active');
$('.payCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payBus').removeClass('active');
$('.payBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailPass').removeClass('active');
$('.payEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailTicket').removeClass('active');
$('.payEurailTicket').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payActivity').removeClass('active');
$('.payActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCruise').removeClass('active');
$('.payCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payVisa').removeClass('active');
$('.payVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payInsurance').removeClass('active');
$('.payInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotel').removeClass('active');
$('.payFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotelCar').removeClass('active');
$('.payFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payHoliday').removeClass('active');
$('.payHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payForex').removeClass('active');
$('.payForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}

});
});
$(document).ready(function () {
$('.payhotels').on('click', function (e) {
$('.payhotelsCntr').slideToggle('slow');
$('.payFlightsCntr').hide('slow');
$('.payCarsCntr').hide('slow');
$('.payBusCntr').hide('slow');
$('.payEurailPassCntr').hide('slow');
$('.payEurailTicketCntr').hide('slow');
$('.payCruiseCntr').hide('slow');
$('.payActivityCntr').hide('slow');
$('.payVisaCntr').hide('slow');
$('.payInsuranceCntr').hide('slow');
$('.payFlightHotelCntr').hide('slow');
$('.payFlightHotelCarCntr').hide('slow');
$('.payHolidayCntr').hide('slow');
$('.payForexCntr').hide('slow');
$('.payFlights').removeClass('active');
$('.payFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCars').removeClass('active');
$('.payCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payBus').removeClass('active');
$('.payBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurail').removeClass('active');
$('.payEurail').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payActivity').removeClass('active');
$('.payActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCruise').removeClass('active');
$('.payCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payVisa').removeClass('active');
$('.payVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payInsurance').removeClass('active');
$('.payInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotel').removeClass('active');
$('.payFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotelCar').removeClass('active');
$('.payFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payHoliday').removeClass('active');
$('.payHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payForex').removeClass('active');
$('.payForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}

});
});
$(document).ready(function () {
$('.payCars').on('click', function (e) {
$('.payCarsCntr').slideToggle();
$('.payhotelsCntr').hide('slow');
$('.payFlightsCntr').hide('slow');
$('.payBusCntr').hide('slow');
$('.payEurailPassCntr').hide('slow');
$('.payEurailTicketCntr').hide('slow');
$('.payCruiseCntr').hide('slow');
$('.payActivityCntr').hide('slow');
$('.payVisaCntr').hide('slow');
$('.payInsuranceCntr').hide('slow');
$('.payFlightHotelCntr').hide('slow');
$('.payFlightHotelCarCntr').hide('slow');
$('.payHolidayCntr').hide('slow');
$('.payForexCntr').hide('slow');
$('.payFlights').removeClass('active');
$('.payFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payhotels').removeClass('active');
$('.payhotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payBus').removeClass('active');
$('.payBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurail').removeClass('active');
$('.payEurail').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payActivity').removeClass('active');
$('.payActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCruise').removeClass('active');
$('.payCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payVisa').removeClass('active');
$('.payVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payInsurance').removeClass('active');
$('.payInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotel').removeClass('active');
$('.payFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotelCar').removeClass('active');
$('.payFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payHoliday').removeClass('active');
$('.payHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payForex').removeClass('active');
$('.payForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}

});
});
$(document).ready(function () {
$('.payBus').on('click', function (e) {
$('.payBusCntr').slideToggle('slow');
$('.payhotelsCntr').hide('slow');
$('.payFlightsCntr').hide('slow');
$('.payCarsCntr').hide('slow');
$('.payEurailPassCntr').hide('slow');
$('.payEurailTicketCntr').hide('slow');
$('.payCruiseCntr').hide('slow');
$('.payActivityCntr').hide('slow');
$('.payVisaCntr').hide('slow');
$('.payInsuranceCntr').hide('slow');
$('.payFlightHotelCntr').hide('slow');
$('.payFlightHotelCarCntr').hide('slow');
$('.payHolidayCntr').hide('slow');
$('.payForexCntr').hide('slow');
$('.payFlights').removeClass('active');
$('.payFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payhotels').removeClass('active');
$('.payhotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCars').removeClass('active');
$('.payCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurail').removeClass('active');
$('.payEurail').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payActivity').removeClass('active');
$('.payActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCruise').removeClass('active');
$('.payCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payVisa').removeClass('active');
$('.payVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payInsurance').removeClass('active');
$('.payInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotel').removeClass('active');
$('.payFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotelCar').removeClass('active');
$('.payFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payHoliday').removeClass('active');
$('.payHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payForex').removeClass('active');
$('.payForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}

});
});
$(document).ready(function () {
$('.payEurailPass').on('click', function (e) {
$('.payEurailPassCntr').slideToggle('slow');
$('.payhotelsCntr').hide('slow');
$('.payFlightsCntr').hide('slow');
$('.payCarsCntr').hide('slow');
$('.payBusCntr').hide('slow');
$('.payEurailTicketCntr').hide('slow');
$('.payCruiseCntr').hide('slow');
$('.payActivityCntr').hide('slow');
$('.payVisaCntr').hide('slow');
$('.payInsuranceCntr').hide('slow');
$('.payFlightHotelCntr').hide('slow');
$('.payFlightHotelCarCntr').hide('slow');
$('.payHolidayCntr').hide('slow');
$('.payForexCntr').hide('slow');
$('.payFlights').removeClass('active');
$('.payFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payhotels').removeClass('active');
$('.payhotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCars').removeClass('active');
$('.payCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payBus').removeClass('active');
$('.payBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailTicket').removeClass('active');
$('.payEurailTicket').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payActivity').removeClass('active');
$('.payActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCruise').removeClass('active');
$('.payCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payVisa').removeClass('active');
$('.payVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payInsurance').removeClass('active');
$('.payInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotel').removeClass('active');
$('.payFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotelCar').removeClass('active');
$('.payFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payHoliday').removeClass('active');
$('.payHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payForex').removeClass('active');
$('.payForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}

});
});

$(document).ready(function () {
$('.payEurailTicket').on('click', function (e) {
$('.payEurailTicketCntr').slideToggle('slow');
$('.payhotelsCntr').hide('slow');
$('.payFlightsCntr').hide('slow');
$('.payCarsCntr').hide('slow');
$('.payBusCntr').hide('slow');
$('.payEurailPassCntr').hide('slow');
$('.payCruiseCntr').hide('slow');
$('.payActivityCntr').hide('slow');
$('.payVisaCntr').hide('slow');
$('.payInsuranceCntr').hide('slow');
$('.payFlightHotelCntr').hide('slow');
$('.payFlightHotelCarCntr').hide('slow');
$('.payHolidayCntr').hide('slow');
$('.payForexCntr').hide('slow');
$('.payFlights').removeClass('active');
$('.payFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payhotels').removeClass('active');
$('.payhotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCars').removeClass('active');
$('.payCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payBus').removeClass('active');
$('.payBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailPass').removeClass('active');
$('.payEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payActivity').removeClass('active');
$('.payActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCruise').removeClass('active');
$('.payCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payVisa').removeClass('active');
$('.payVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payInsurance').removeClass('active');
$('.payInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotel').removeClass('active');
$('.payFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotelCar').removeClass('active');
$('.payFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payHoliday').removeClass('active');
$('.payHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payForex').removeClass('active');
$('.payForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}

});
});
$(document).ready(function () {
$('.payCruise').on('click', function (e) {
$('.payCruiseCntr').slideToggle('slow');
$('.payhotelsCntr').hide('slow');
$('.payFlightsCntr').hide('slow');
$('.payCarsCntr').hide('slow');
$('.payBusCntr').hide('slow');
$('.payEurailPassCntr').hide('slow');
$('.payEurailTicketCntr').hide('slow');
$('.payActivityCntr').hide('slow');
$('.payVisaCntr').hide('slow');
$('.payInsuranceCntr').hide('slow');
$('.payFlightHotelCntr').hide('slow');
$('.payFlightHotelCarCntr').hide('slow');
$('.payHolidayCntr').hide('slow');
$('.payForexCntr').hide('slow');
$('.payFlights').removeClass('active');
$('.payFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payhotels').removeClass('active');
$('.payhotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCars').removeClass('active');
$('.payCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payBus').removeClass('active');
$('.payBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payActivity').removeClass('active');
$('.payActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailPass').removeClass('active');
$('.payEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailPassTicket').removeClass('active');
$('.payEurailTicket').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payVisa').removeClass('active');
$('.payVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payInsurance').removeClass('active');
$('.payInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotel').removeClass('active');
$('.payFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotelCar').removeClass('active');
$('.payFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payHoliday').removeClass('active');
$('.payHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payForex').removeClass('active');
$('.payForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}

});
});
$(document).ready(function () {
$('.payActivity').on('click', function (e) {
$('.payActivityCntr').slideToggle('slow');
$('.payhotelsCntr').hide('slow');
$('.payFlightsCntr').hide('slow');
$('.payCarsCntr').hide('slow');
$('.payBusCntr').hide('slow');
$('.payEurailPassCntr').hide('slow');
$('.payEurailTicketCntr').hide('slow');
$('.payCruiseCntr').hide('slow');
$('.payVisaCntr').hide('slow');
$('.payInsuranceCntr').hide('slow');
$('.payFlightHotelCntr').hide('slow');
$('.payFlightHotelCarCntr').hide('slow');
$('.payHolidayCntr').hide('slow');
$('.payForexCntr').hide('slow');
$('.payFlights').removeClass('active');
$('.payFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payhotels').removeClass('active');
$('.payhotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCars').removeClass('active');
$('.payCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payBus').removeClass('active');
$('.payBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCruise').removeClass('active');
$('.payCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailPass').removeClass('active');
$('.payEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailTicket').removeClass('active');
$('.payEurailTicket').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payVisa').removeClass('active');
$('.payVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payInsurance').removeClass('active');
$('.payInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotel').removeClass('active');
$('.payFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotelCar').removeClass('active');
$('.payFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payHoliday').removeClass('active');
$('.payHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payForex').removeClass('active');
$('.payForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}

});
});
$(document).ready(function () {
$('.payVisa').on('click', function (e) {
$('.payVisaCntr').slideToggle('slow');
$('.payhotelsCntr').hide('slow');
$('.payFlightsCntr').hide('slow');
$('.payCarsCntr').hide('slow');
$('.payBusCntr').hide('slow');
$('.payActivityCntr').hide('slow');
$('.payEurailPassCntr').hide('slow');
$('.payEurailTicketCntr').hide('slow');
$('.payCruiseCntr').hide('slow');
$('.payInsuranceCntr').hide('slow');
$('.payFlightHotelCntr').hide('slow');
$('.payFlightHotelCarCntr').hide('slow');
$('.payHolidayCntr').hide('slow');
$('.payForexCntr').hide('slow');
$('.payFlights').removeClass('active');
$('.payFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payhotels').removeClass('active');
$('.payhotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCars').removeClass('active');
$('.payCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payBus').removeClass('active');
$('.payBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCruise').removeClass('active');
$('.payCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailPass').removeClass('active');
$('.payEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailTicket').removeClass('active');
$('.payEurailTicket').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payInsurance').removeClass('active');
$('.payInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotel').removeClass('active');
$('.payFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotelCar').removeClass('active');
$('.payFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payHoliday').removeClass('active');
$('.payHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payForex').removeClass('active');
$('.payForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}

});
});
$(document).ready(function () {
$('.payInsurance').on('click', function (e) {
$('.payInsuranceCntr').slideToggle('slow');
$('.payhotelsCntr').hide('slow');
$('.payFlightsCntr').hide('slow');
$('.payCarsCntr').hide('slow');
$('.payBusCntr').hide('slow');
$('.payEurailPassCntr').hide('slow');
$('.payEurailTicketCntr').hide('slow');
$('.payCruiseCntr').hide('slow');
$('.payVisaCntr').hide('slow');
$('.payFlightHotelCntr').hide('slow');
$('.payFlightHotelCarCntr').hide('slow');
$('.payHolidayCntr').hide('slow');
$('.payForexCntr').hide('slow');
$('.payFlights').removeClass('active');
$('.payFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payhotels').removeClass('active');
$('.payhotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCars').removeClass('active');
$('.payCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payBus').removeClass('active');
$('.payBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCruise').removeClass('active');
$('.payCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailPass').removeClass('active');
$('.payEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailTicket').removeClass('active');
$('.payEurailTicket').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payVisa').removeClass('active');
$('.payVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotel').removeClass('active');
$('.payFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotelCar').removeClass('active');
$('.payFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payHoliday').removeClass('active');
$('.payHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payForex').removeClass('active');
$('.payForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}

});
});
$(document).ready(function () {
$('.payFlightHotel').on('click', function (e) {
$('.payFlightHotelCntr').slideToggle('slow');
$('.payhotelsCntr').hide('slow');
$('.payFlightsCntr').hide('slow');
$('.payCarsCntr').hide('slow');
$('.payBusCntr').hide('slow');
$('.payEurailPassCntr').hide('slow');
$('.payEurailTicketCntr').hide('slow');
$('.payCruiseCntr').hide('slow');
$('.payVisaCntr').hide('slow');
$('.payInsuranceCntr').hide('slow');
$('.payFlightHotelCarCntr').hide('slow');
$('.payHolidayCntr').hide('slow');
$('.payForexCntr').hide('slow');
$('.payFlights').removeClass('active');
$('.payFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payhotels').removeClass('active');
$('.payhotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCars').removeClass('active');
$('.payCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payBus').removeClass('active');
$('.payBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCruise').removeClass('active');
$('.payCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailPass').removeClass('active');
$('.payEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailTicket').removeClass('active');
$('.payEurailTicket').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payVisa').removeClass('active');
$('.payVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payInsurance').removeClass('active');
$('.payInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotelCar').removeClass('active');
$('.payFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payHoliday').removeClass('active');
$('.payHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payForex').removeClass('active');
$('.payForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}

});
});
$(document).ready(function () {
$('.payFlightHotelCar').on('click', function (e) {
$('.payFlightHotelCarCntr').slideToggle('slow');
$('.payhotelsCntr').hide('slow');
$('.payFlightsCntr').hide('slow');
$('.payCarsCntr').hide('slow');
$('.payBusCntr').hide('slow');
$('.payEurailPassCntr').hide('slow');
$('.payEurailTicketCntr').hide('slow');
$('.payCruiseCntr').hide('slow');
$('.payVisaCntr').hide('slow');
$('.payInsuranceCntr').hide('slow');
$('.payFlightHotelCntr').hide('slow');
$('.payHolidayCntr').hide('slow');
$('.payForexCntr').hide('slow');
$('.payFlights').removeClass('active');
$('.payFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payhotels').removeClass('active');
$('.payhotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCars').removeClass('active');
$('.payCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payBus').removeClass('active');
$('.payBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCruise').removeClass('active');
$('.payCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailPass').removeClass('active');
$('.payEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailTicket').removeClass('active');
$('.payEurailTicket').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payVisa').removeClass('active');
$('.payVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payInsurance').removeClass('active');
$('.payInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotel').removeClass('active');
$('.payFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payHoliday').removeClass('active');
$('.payHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payForex').removeClass('active');
$('.payForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}

});
});
$(document).ready(function () {
$('.payHoliday').on('click', function (e) {
$('.payHolidayCntr').slideToggle('slow');
$('.payhotelsCntr').hide('slow');
$('.payFlightsCntr').hide('slow');
$('.payCarsCntr').hide('slow');
$('.payBusCntr').hide('slow');
$('.payEurailPassCntr').hide('slow');
$('.payEurailTicketCntr').hide('slow');
$('.payCruiseCntr').hide('slow');
$('.payVisaCntr').hide('slow');
$('.payInsuranceCntr').hide('slow');
$('.payFlightHotelCntr').hide('slow');
$('.payFlightHotelCarCntr').hide('slow');
$('.payForexCntr').hide('slow');
$('.payFlights').removeClass('active');
$('.payFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payhotels').removeClass('active');
$('.payhotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCars').removeClass('active');
$('.payCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payBus').removeClass('active');
$('.payBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCruise').removeClass('active');
$('.payCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailPass').removeClass('active');
$('.payEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailTicket').removeClass('active');
$('.payEurailTicket').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payVisa').removeClass('active');
$('.payVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payInsurance').removeClass('active');
$('.payInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotel').removeClass('active');
$('.payFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotelCar').removeClass('active');
$('.payFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payForex').removeClass('active');
$('.payForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}

});
});
$(document).ready(function () {
$('.payForex').on('click', function (e) {
$('.payForexCntr').slideToggle('slow');
$('.payhotelsCntr').hide('slow');
$('.payFlightsCntr').hide('slow');
$('.payCarsCntr').hide('slow');
$('.payBusCntr').hide('slow');
$('.payEurailPassCntr').hide('slow');
$('.payEurailTicketCntr').hide('slow');
$('.payCruiseCntr').hide('slow');
$('.payVisaCntr').hide('slow');
$('.payInsuranceCntr').hide('slow');
$('.payFlightHotelCntr').hide('slow');
$('.payFlightHotelCarCntr').hide('slow');
$('.payHolidayCntr').hide('slow');
$('.payFlights').removeClass('active');
$('.payFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payhotels').removeClass('active');
$('.payhotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCars').removeClass('active');
$('.payCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payBus').removeClass('active');
$('.payBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payCruise').removeClass('active');
$('.payCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailPass').removeClass('active');
$('.payEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payEurailTicket').removeClass('active');
$('.payEurailTicket').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payVisa').removeClass('active');
$('.payVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payInsurance').removeClass('active');
$('.payInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotel').removeClass('active');
$('.payFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payFlightHotelCar').removeClass('active');
$('.payFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.payHoliday').removeClass('active');
$('.payHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}

});
});
$(document).ready(function () {
$('.sumFlights').on('click', function (e) {
$(this).next('.sumFlightsCntr').slideToggle('slow');
$('.sumHotelsCntr').hide('slow');
$('.sumCarsCntr').hide('slow');
$('.sumBusCntr').hide('slow');
$('.sumEurailPassCntr').hide('slow');
$('.sumEurailTcktCntr').hide('slow');
$('.sumCruiseCntr').hide('slow');
$('.sumActivityCntr').hide('slow');
$('.sumVisaCntr').hide('slow');
$('.sumInsuranceCntr').hide('slow');
$('.sumFlightHotelCntr').hide('slow');
$('.sumFlightHotelCarCntr').hide('slow');
$('.sumHolidayCntr').hide('slow');
$('.sumForexCntr').hide('slow');
$('.sumHotels').removeClass('active');
$('.sumHotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCars').removeClass('active');
$('.sumCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumBus').removeClass('active');
$('.sumBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailPass').removeClass('active');
$('.sumEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailTckt').removeClass('active');
$('.sumEurailTckt').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumActivity').removeClass('active');
$('.sumActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCruise').removeClass('active');
$('.sumCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumVisa').removeClass('active');
$('.sumVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumInsurance').removeClass('active');
$('.sumInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotel').removeClass('active');
$('.sumFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotelCar').removeClass('active');
$('.sumFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHoliday').removeClass('active');
$('.sumHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumForex').removeClass('active');
$('.sumForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $(".sumFlights").offset().top - 100},
'slow');
});
});

$(document).ready(function () {
$('.sumHotels').on('click', function (e) {
$(this).next('.sumHotelsCntr').slideToggle('slow');
$('.sumFlightsCntr').hide('slow');
$('.sumCarsCntr').hide('slow');
$('.sumBusCntr').hide('slow');
$('.sumEurailPassCntr').hide('slow');
$('.sumEurailTcktCntr').hide('slow');
$('.sumCruiseCntr').hide('slow');
$('.sumActivityCntr').hide('slow');
$('.sumVisaCntr').hide('slow');
$('.sumInsuranceCntr').hide('slow');
$('.sumFlightHotelCntr').hide('slow');
$('.sumFlightHotelCarCntr').hide('slow');
$('.sumHolidayCntr').hide('slow');
$('.sumForexCntr').hide('slow');
$('.sumFlights').removeClass('active');
$('.sumFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCars').removeClass('active');
$('.sumCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumBus').removeClass('active');
$('.sumBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailPass').removeClass('active');
$('.sumEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailTckt').removeClass('active');
$('.sumEurailTckt').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumActivity').removeClass('active');
$('.sumActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCruise').removeClass('active');
$('.sumCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumVisa').removeClass('active');
$('.sumVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumInsurance').removeClass('active');
$('.sumInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotel').removeClass('active');
$('.sumFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotelCar').removeClass('active');
$('.sumFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHoliday').removeClass('active');
$('.sumHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumForex').removeClass('active');
$('.sumForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $(".sumFlights").offset().top - 100},
'slow');
});
});

$(document).ready(function () {
$('.sumCars').on('click', function (e) {
$(this).next('.sumCarsCntr').slideToggle('slow');
$('.sumFlightsCntr').hide('slow');
$('.sumHotelsCntr').hide('slow');
$('.sumBusCntr').hide('slow');
$('.sumEurailPassCntr').hide('slow');
$('.sumEurailTcktCntr').hide('slow');
$('.sumCruiseCntr').hide('slow');
$('.sumActivityCntr').hide('slow');
$('.sumVisaCntr').hide('slow');
$('.sumInsuranceCntr').hide('slow');
$('.sumFlightHotelCntr').hide('slow');
$('.sumFlightHotelCarCntr').hide('slow');
$('.sumHolidayCntr').hide('slow');
$('.sumForexCntr').hide('slow');
$('.sumFlights').removeClass('active');
$('.sumFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHotels').removeClass('active');
$('.sumHotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumBus').removeClass('active');
$('.sumBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailPass').removeClass('active');
$('.sumEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailTckt').removeClass('active');
$('.sumEurailTckt').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumActivity').removeClass('active');
$('.sumActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCruise').removeClass('active');
$('.sumCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumVisa').removeClass('active');
$('.sumVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumInsurance').removeClass('active');
$('.sumInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotel').removeClass('active');
$('.sumFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotelCar').removeClass('active');
$('.sumFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHoliday').removeClass('active');
$('.sumHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumForex').removeClass('active');
$('.sumForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $(".sumHotels").offset().top - 100},
'slow');
});
});

$(document).ready(function () {
$('.sumBus').on('click', function (e) {
$(this).next('.sumBusCntr').slideToggle('slow');
$('.sumFlightsCntr').hide('slow');
$('.sumHotelsCntr').hide('slow');
$('.sumCarsCntr').hide('slow');
$('.sumEurailPassCntr').hide('slow');
$('.sumEurailTcktCntr').hide('slow');
$('.sumCruiseCntr').hide('slow');
$('.sumActivityCntr').hide('slow');
$('.sumVisaCntr').hide('slow');
$('.sumInsuranceCntr').hide('slow');
$('.sumFlightHotelCntr').hide('slow');
$('.sumFlightHotelCarCntr').hide('slow');
$('.sumHolidayCntr').hide('slow');
$('.sumForexCntr').hide('slow');
$('.sumFlights').removeClass('active');
$('.sumFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHotels').removeClass('active');
$('.sumHotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCars').removeClass('active');
$('.sumCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailPass').removeClass('active');
$('.sumEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailTckt').removeClass('active');
$('.sumEurailTckt').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumActivity').removeClass('active');
$('.sumActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCruise').removeClass('active');
$('.sumCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumVisa').removeClass('active');
$('.sumVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumInsurance').removeClass('active');
$('.sumInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotel').removeClass('active');
$('.sumFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotelCar').removeClass('active');
$('.sumFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHoliday').removeClass('active');
$('.sumHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumForex').removeClass('active');
$('.sumForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $(".sumCars").offset().top - 100},
'slow');
});
});
$(document).ready(function () {
$('.sumEurailPass').on('click', function (e) {
$(this).next('.sumEurailPassCntr').slideToggle('slow');
$('.sumFlightsCntr').hide('slow');
$('.sumHotelsCntr').hide('slow');
$('.sumCarsCntr').hide('slow');
$('.sumBusCntr').hide('slow');
$('.sumEurailTcktCntr').hide('slow');
$('.sumCruiseCntr').hide('slow');
$('.sumActivityCntr').hide('slow');
$('.sumVisaCntr').hide('slow');
$('.sumInsuranceCntr').hide('slow');
$('.sumFlightHotelCntr').hide('slow');
$('.sumFlightHotelCarCntr').hide('slow');
$('.sumHolidayCntr').hide('slow');
$('.sumForexCntr').hide('slow');
$('.sumFlights').removeClass('active');
$('.sumFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHotels').removeClass('active');
$('.sumHotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCars').removeClass('active');
$('.sumCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumBus').removeClass('active');
$('.sumBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailTckt').removeClass('active');
$('.sumEurailTckt').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumActivity').removeClass('active');
$('.sumActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCruise').removeClass('active');
$('.sumCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumVisa').removeClass('active');
$('.sumVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumInsurance').removeClass('active');
$('.sumInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotel').removeClass('active');
$('.sumFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotelCar').removeClass('active');
$('.sumFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHoliday').removeClass('active');
$('.sumHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumForex').removeClass('active');
$('.sumForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $(".sumBus").offset().top - 100},
'slow');
});
});

$(document).ready(function () {
$('.sumEurailTckt').on('click', function (e) {
$(this).next('.sumEurailTcktCntr').slideToggle('slow');
$('.sumFlightsCntr').hide('slow');
$('.sumHotelsCntr').hide('slow');
$('.sumCarsCntr').hide('slow');
$('.sumBusCntr').hide('slow');
$('.sumEurailPassCntr').hide('slow');
$('.sumCruiseCntr').hide('slow');
$('.sumActivityCntr').hide('slow');
$('.sumVisaCntr').hide('slow');
$('.sumInsuranceCntr').hide('slow');
$('.sumFlightHotelCntr').hide('slow');
$('.sumFlightHotelCarCntr').hide('slow');
$('.sumHolidayCntr').hide('slow');
$('.sumForexCntr').hide('slow');
$('.sumFlights').removeClass('active');
$('.sumFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHotels').removeClass('active');
$('.sumHotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCars').removeClass('active');
$('.sumCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumBus').removeClass('active');
$('.sumBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailPass').removeClass('active');
$('.sumEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumActivity').removeClass('active');
$('.sumActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCruise').removeClass('active');
$('.sumCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumVisa').removeClass('active');
$('.sumVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumInsurance').removeClass('active');
$('.sumInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotel').removeClass('active');
$('.sumFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotelCar').removeClass('active');
$('.sumFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHoliday').removeClass('active');
$('.sumHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumForex').removeClass('active');
$('.sumForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $(".sumEurailPass").offset().top - 100},
'slow');
});
});

$(document).ready(function () {
$('.sumCruise').on('click', function (e) {
$(this).next('.sumCruiseCntr').slideToggle('slow');
$('.sumFlightsCntr').hide('slow');
$('.sumHotelsCntr').hide('slow');
$('.sumCarsCntr').hide('slow');
$('.sumBusCntr').hide('slow');
$('.sumEurailPassCntr').hide('slow');
$('.sumEurailTcktCntr').hide('slow');
$('.sumActivityCntr').hide('slow');
$('.sumVisaCntr').hide('slow');
$('.sumInsuranceCntr').hide('slow');
$('.sumFlightHotelCntr').hide('slow');
$('.sumFlightHotelCarCntr').hide('slow');
$('.sumHolidayCntr').hide('slow');
$('.sumForexCntr').hide('slow');
$('.sumFlights').removeClass('active');
$('.sumFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHotels').removeClass('active');
$('.sumHotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCars').removeClass('active');
$('.sumCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumBus').removeClass('active');
$('.sumBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailPass').removeClass('active');
$('.sumEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailTckt').removeClass('active');
$('.sumEurailTckt').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumActivity').removeClass('active');
$('.sumActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumVisa').removeClass('active');
$('.sumVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumInsurance').removeClass('active');
$('.sumInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotel').removeClass('active');
$('.sumFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotelCar').removeClass('active');
$('.sumFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHoliday').removeClass('active');
$('.sumHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumForex').removeClass('active');
$('.sumForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $(".sumEurailTckt").offset().top - 100},
'slow');
});
});
$(document).ready(function () {
$('.sumVisa').on('click', function (e) {
$(this).next('.sumVisaCntr').slideToggle('slow');
$('.sumFlightsCntr').hide('slow');
$('.sumHotelsCntr').hide('slow');
$('.sumCarsCntr').hide('slow');
$('.sumBusCntr').hide('slow');
$('.sumEurailPassCntr').hide('slow');
$('.sumEurailTcktCntr').hide('slow');
$('.sumActivityCntr').hide('slow');
$('.sumCruiseCntr').hide('slow');
$('.sumInsuranceCntr').hide('slow');
$('.sumFlightHotelCntr').hide('slow');
$('.sumFlightHotelCarCntr').hide('slow');
$('.sumHolidayCntr').hide('slow');
$('.sumForexCntr').hide('slow');
$('.sumFlights').removeClass('active');
$('.sumFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHotels').removeClass('active');
$('.sumHotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCars').removeClass('active');
$('.sumCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumBus').removeClass('active');
$('.sumBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailPass').removeClass('active');
$('.sumEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailTckt').removeClass('active');
$('.sumEurailTckt').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumActivity').removeClass('active');
$('.sumActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCruise').removeClass('active');
$('.sumCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumInsurance').removeClass('active');
$('.sumInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotel').removeClass('active');
$('.sumFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotelCar').removeClass('active');
$('.sumFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHoliday').removeClass('active');
$('.sumHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumForex').removeClass('active');
$('.sumForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $(".sumCruise").offset().top - 100},
'slow');
});
});
$(document).ready(function () {
$('.sumInsurance').on('click', function (e) {
$(this).next('.sumInsuranceCntr').slideToggle('slow');
$('.sumFlightsCntr').hide('slow');
$('.sumHotelsCntr').hide('slow');
$('.sumCarsCntr').hide('slow');
$('.sumBusCntr').hide('slow');
$('.sumEurailPassCntr').hide('slow');
$('.sumEurailTcktCntr').hide('slow');
$('.sumActivityCntr').hide('slow');
$('.sumCruiseCntr').hide('slow');
$('.sumVisaCntr').hide('slow');
$('.sumFlightHotelCntr').hide('slow');
$('.sumFlightHotelCarCntr').hide('slow');
$('.sumHolidayCntr').hide('slow');
$('.sumForexCntr').hide('slow');
$('.sumFlights').removeClass('active');
$('.sumFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHotels').removeClass('active');
$('.sumHotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCars').removeClass('active');
$('.sumCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumBus').removeClass('active');
$('.sumBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailPass').removeClass('active');
$('.sumEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailTckt').removeClass('active');
$('.sumEurailTckt').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumActivity').removeClass('active');
$('.sumActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCruise').removeClass('active');
$('.sumCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumVisa').removeClass('active');
$('.sumVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotel').removeClass('active');
$('.sumFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotelCar').removeClass('active');
$('.sumFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHoliday').removeClass('active');
$('.sumHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumForex').removeClass('active');
$('.sumForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $(".sumVisa").offset().top - 100},
'slow');
});
});
$(document).ready(function () {
$('.sumFlightHotel').on('click', function (e) {
$(this).next('.sumFlightHotelCntr').slideToggle('slow');
$('.sumFlightsCntr').hide('slow');
$('.sumHotelsCntr').hide('slow');
$('.sumCarsCntr').hide('slow');
$('.sumBusCntr').hide('slow');
$('.sumEurailPassCntr').hide('slow');
$('.sumEurailTcktCntr').hide('slow');
$('.sumActivityCntr').hide('slow');
$('.sumCruiseCntr').hide('slow');
$('.sumVisaCntr').hide('slow');
$('.sumInsuranceCntr').hide('slow');
$('.sumFlightHotelCarCntr').hide('slow');
$('.sumHolidayCntr').hide('slow');
$('.sumForexCntr').hide('slow');
$('.sumFlights').removeClass('active');
$('.sumFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHotels').removeClass('active');
$('.sumHotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCars').removeClass('active');
$('.sumCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumBus').removeClass('active');
$('.sumBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailPass').removeClass('active');
$('.sumEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailTckt').removeClass('active');
$('.sumEurailTckt').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumActivity').removeClass('active');
$('.sumActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCruise').removeClass('active');
$('.sumCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumVisa').removeClass('active');
$('.sumVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumInsurance').removeClass('active');
$('.sumInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotelCar').removeClass('active');
$('.sumFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHoliday').removeClass('active');
$('.sumHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumForex').removeClass('active');
$('.sumForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $(".sumInsurance").offset().top - 100},
'slow');
});
});
$(document).ready(function () {
$('.sumFlightHotelCar').on('click', function (e) {
$(this).next('.sumFlightHotelCarCntr').slideToggle('slow');
$('.sumFlightsCntr').hide('slow');
$('.sumHotelsCntr').hide('slow');
$('.sumCarsCntr').hide('slow');
$('.sumBusCntr').hide('slow');
$('.sumEurailPassCntr').hide('slow');
$('.sumEurailTcktCntr').hide('slow');
$('.sumActivityCntr').hide('slow');
$('.sumCruiseCntr').hide('slow');
$('.sumVisaCntr').hide('slow');
$('.sumInsuranceCntr').hide('slow');
$('.sumFlightHotelCntr').hide('slow');
$('.sumHolidayCntr').hide('slow');
$('.sumForexCntr').hide('slow');
$('.sumFlights').removeClass('active');
$('.sumFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHotels').removeClass('active');
$('.sumHotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCars').removeClass('active');
$('.sumCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumBus').removeClass('active');
$('.sumBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailPass').removeClass('active');
$('.sumEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailTckt').removeClass('active');
$('.sumEurailTckt').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumActivity').removeClass('active');
$('.sumActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCruise').removeClass('active');
$('.sumCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumVisa').removeClass('active');
$('.sumVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumInsurance').removeClass('active');
$('.sumInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotel').removeClass('active');
$('.sumFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHoliday').removeClass('active');
$('.sumHoliday').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumForex').removeClass('active');
$('.sumForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $(".sumFlightHotel").offset().top - 100},
'slow');
});
});
$(document).ready(function () {
$('.sumHoliday').on('click', function (e) {
$(this).next('.sumHolidayCntr').slideToggle('slow');
$('.sumFlightsCntr').hide('slow');
$('.sumHotelsCntr').hide('slow');
$('.sumCarsCntr').hide('slow');
$('.sumBusCntr').hide('slow');
$('.sumEurailPassCntr').hide('slow');
$('.sumEurailTcktCntr').hide('slow');
$('.sumActivityCntr').hide('slow');
$('.sumCruiseCntr').hide('slow');
$('.sumVisaCntr').hide('slow');
$('.sumInsuranceCntr').hide('slow');
$('.sumFlightHotelCntr').hide('slow');
$('.sumFlightHotelCarCntr').hide('slow');
$('.sumForexCntr').hide('slow');
$('.sumFlights').removeClass('active');
$('.sumFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHotels').removeClass('active');
$('.sumHotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCars').removeClass('active');
$('.sumCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumBus').removeClass('active');
$('.sumBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailPass').removeClass('active');
$('.sumEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailTckt').removeClass('active');
$('.sumEurailTckt').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumActivity').removeClass('active');
$('.sumActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCruise').removeClass('active');
$('.sumCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumVisa').removeClass('active');
$('.sumVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumInsurance').removeClass('active');
$('.sumInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotel').removeClass('active');
$('.sumFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotelCar').removeClass('active');
$('.sumFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumForex').removeClass('active');
$('.sumForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $(".sumFlightHotelCar").offset().top - 100},
'slow');
});
});

$(document).ready(function () {
$('.sumForex').on('click', function (e) {
$(this).next('.sumForexCntr').slideToggle('slow');
$('.sumFlightsCntr').hide('slow');
$('.sumHotelsCntr').hide('slow');
$('.sumCarsCntr').hide('slow');
$('.sumBusCntr').hide('slow');
$('.sumEurailPassCntr').hide('slow');
$('.sumEurailTcktCntr').hide('slow');
$('.sumActivityCntr').hide('slow');
$('.sumCruiseCntr').hide('slow');
$('.sumVisaCntr').hide('slow');
$('.sumInsuranceCntr').hide('slow');
$('.sumFlightHotelCntr').hide('slow');
$('.sumFlightHotelCarCntr').hide('slow');
$('.sumFlights').removeClass('active');
$('.sumFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHotels').removeClass('active');
$('.sumHotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCars').removeClass('active');
$('.sumCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumBus').removeClass('active');
$('.sumBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailPass').removeClass('active');
$('.sumEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailTckt').removeClass('active');
$('.sumEurailTckt').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumActivity').removeClass('active');
$('.sumActivity').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCruise').removeClass('active');
$('.sumCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumVisa').removeClass('active');
$('.sumVisa').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumInsurance').removeClass('active');
$('.sumInsurance').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotel').removeClass('active');
$('.sumFlightHotel').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumFlightHotelCar').removeClass('active');
$('.sumFlightHotelCar').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $(".sumForex").offset().top - 100},
'slow');
});
});
function flight_hotel_way1(tabid, contrid){
for(i=3; i<=4; i++){
document.getElementById('flight_hotel_way'+i).className = '';
document.getElementById('flight_hotel_wayContr'+i).style.display = 'none'
if(i==3){
document.getElementById('flight_hotel_way'+i).className = 'first';
}
if(i==4){
document.getElementById('flight_hotel_way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'flight_hotel_way3'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'flight_hotel_way4'){
document.getElementById(tabid).className = 'last sel';
}
}
function flight_hotel_way2(tabid, contrid){
for(i=5; i<=6; i++){
document.getElementById('flight_hotel_way'+i).className = '';
document.getElementById('flight_hotel_wayContr'+i).style.display = 'none'
if(i==5){
document.getElementById('flight_hotel_way'+i).className = 'first';
}
if(i==6){
document.getElementById('flight_hotel_way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'flight_hotel_way5'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'flight_hotel_way6'){
document.getElementById(tabid).className = 'last sel';
}
}
$(document).ready(function () {
$('.sumActivity').on('click', function (e) {
$(this).next('.sumActivityCntr').slideToggle();
$('.sumFlightsCntr').hide();
$('.sumHotelsCntr').hide();
$('.sumCarsCntr').hide();
$('.sumBusCntr').hide();
$('.sumEurailPassCntr').hide();
$('.sumEurailTcktCntr').hide();
$('.sumCruiseCntr').hide();
$('.sumForexCntr').hide()
$('.sumFlights').removeClass('active');
$('.sumFlights').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumHotels').removeClass('active');
$('.sumHotels').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCars').removeClass('active');
$('.sumCars').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumBus').removeClass('active');
$('.sumBus').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailPass').removeClass('active');
$('.sumEurailPass').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumEurailTckt').removeClass('active');
$('.sumEurailTckt').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumCruise').removeClass('active');
$('.sumCruise').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.sumForex').removeClass('active');
$('.sumForex').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});
$('.selCost1').on('click', function (e) {
$(this).parents('li').find('.costDStricture1').slideToggle();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text(' - Cost to Customer');
}else{
$(this).text(' + Cost to Customer');
}
});
$('.selCostAgent1').on('click', function (e) {
$(this).parents('li').find('.costDStricture1').slideToggle();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text(' - Cost to Agency');
}else{
$(this).text(' + Cost to Agency');
}
});
$('.discount').on('click', function (e) {
$(this).parents('li').find('.discountDStricture').slideToggle();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text(' - Discount');
}else{
$(this).text(' + Discount');
}
});
$('.documentmin').on('click', function (e) {
$('.docDStricture1').slideToggle();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text(' - Documents required for students over 18 traveling alone');
}else{
$(this).text(' + Documents required for students over 18 traveling alone');
}
});
$('.selCost').on('click', function (e) {
$(this).parents('li').find('.costDStricture').slideToggle();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).html(' - Cost to <span class="mL10_sm">Customer</span> ');
}else{
$(this).html(' + Cost to <span class="mL10_sm">Customer</span> ');
}
});
$('.selCostAgent').on('click', function (e) {
$(this).parents('li').find('.costDStricture').slideToggle();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).html(' - Cost to<span class="mL10_sm"> Agency </span>');
}else{
$(this).html(' + Cost to<span class="mL10_sm"> Agency </span>');
}
});

if($().datepicker){
$( "#datepicker13, #datepicker14, #datepicker15, #datepicker16, #datepicker17, #datepicker18, #datepicker19, #datepicker20, #datepicker21, #datepicker22, #datepicker23, #datepicker24, #datepicker25, #datepicker26, #datepicker27, #datepicker28, #datepicker29, #datepicker30, #datepicker31, #datepicker32, #datepicker33, #datepicker34, #datepicker35, #datepicker36 #datepicker37, #datepicker38, #datepicker39, #datepicker40, #datepicker41, #datepicker42, #datepicker43, #datepicker44, #datepicker45, #datepicker46, #datepicker47, #datepicker48, #datepicker49, #datepicker50, #datepicker51, #datepicker52, #datepicker53, #datepicker54, #datepicker55, #datepicker56, #datepicker57, #datepicker58, #datepicker59, #datepicker60, #datepicker61, #datepicker62, #datepicker63, #datepicker64, #datepicker65, #datepicker66, #datepicker67, #datepicker68, #datepicker69, #datepicker70, #datepicker71, #datepicker72 " ).datepicker({
numberOfMonths:2,
minDate: 0,
dateFormat: "dd/mm/yy",
onSelect: function(dateText){
$(this).css("color","#333333");
}
});
}



$(document).ready(function () {
$('.moreplus').on('click', function (e) {
$('.moreplusOpt').slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text(' - More (Frequent flyer, meal preference, seat preference, special request)');
}else{
$(this).text(' + More (Frequent flyer, meal preference, seat preference, special request)');
}
});
$('.morepluscruise').on('click', function (e) {
$('.morepluscruiseOpt').slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text(' - More (Dinner Seating, Table Size, special requests)');
}else{
$(this).text(' + More (Dinner Seating, Table Size, special requests)');
}
});

});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addcssreserv2"); //Fields wrapper
var add_button1      = $("#addcssreservbtn2"); //Add button ID
var id2=25;
var x1= 1; //initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=25+x1;
$(wrapper1).append('<ul class="row mB10 clearfix col_10"><li class="col_2_half pR0 valign mT10"><label class="fL">CSS element</label></li><li class="col_3_half pR0 valign "><input type="text" class="w100pcnt"  placeholder="Xoxox xoxoxo xosdsh" /></li><li class="col_2 pR0 valign mT10"><label>Colour</label></li><li class="col_1_half pR0"><select class="w100pcnt bkgDrkGrn"><option selected="">&nbsp;</option></select></li><li class="col_2_half mT10 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;
})
});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addbrowsereserv2"); //Fields wrapper
var add_button1      = $("#addbrowsereservbtn2"); //Add button ID
var id2=25;
var x1= 1; //initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=25+x1;
$(wrapper1).append('<ul class="row mB10 clearfix col_12"><li class="col_2 pR0 valign mT10"><label class="fL">Header elements</label></li><li class="col_1_half pR0"><select class="w100pcnt"><option selected=""></option></select></li><li class="col_2 pR0 valign mT10"><label class="fL">Control Type</label></li><li class="col_1_half pR0"><select class="w100pcnt"><option selected=""></option></select></li><li class="col_2 pR0 mT10"><label class="fL valign">Content</label></li><li class="col_2 pR0"><input type="text" class="w100pcnt"  placeholder="" /></li><li class="col_1 mT10 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;
})
});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addbrowsereserv3"); //Fields wrapper
var add_button1      = $("#addbrowsereservbtn3"); //Add button ID
var id2=25;
var x1= 1; //initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=25+x1;
$(wrapper1).append('<ul class="row mB10 clearfix col_12"><li class="col_2 pR0 valign mT10"><label class="fL">Footer elements</label></li><li class="col_1_half pR0"><select class="w100pcnt"><option selected=""></option></select></li><li class="col_2 pR0 valign mT10"><label class="fL">Control Type</label></li><li class="col_1_half pR0"><select class="w100pcnt"><option selected=""></option></select></li><li class="col_2 pR0 mT10"><label class="fL valign">Content</label></li><li class="col_2 pR0"><input type="text" class="w100pcnt"  placeholder="" /></li><li class="col_1 mT10 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;
})
});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addreserv3"); //Fields wrapper
var add_button1      = $("#addreservbtn3"); //Add button ID
var id2=25;
var x1= 1; //initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=25+x1;
$(wrapper1).append('<ul class="row mB10 clearfix col_12"><li class="col_3 pR0 valign mT10"><label class="fL">Bank name</label></li><li class="col_2 pR0 pL0"><select class="w100pcnt"><option selected="">Axis Bank</option></select></li><li class="col_3 pR0 valign mT10"><label>Key file</label></li><li class="col_3 pR0 pL0"><input type="text" class="w100pcnt"  placeholder="Xoxoxo xoxoxooxoxox" /></li><li class="col_1 mT10 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;
})
});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addreserv4"); //Fields wrapper
var add_button1      = $("#addreservbtn4"); //Add button ID
var id2=25;
var x1= 1; //initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=25+x1;
$(wrapper1).append('<ul class="row mB10 clearfix col_12"><li class="col_1_half pR0 valign mT10"><label class="fL">Name</label></li><li class="col_4 pR0 pL0"><select class="w100pcnt"><option selected="">Tracking code for header</option></select></li><li class="col_1_half pR0 valign mT10"><label>Data</label></li><li class="col_4 pR0 pL0"><input type="text" class="w100pcnt"  placeholder="Tracking code for header" /></li><li class="col_1 mT10 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;
})
});
$(document).ready(function () {
$('.addEmail').on('click', function (e) {
$(".addMoreEmail").slideToggle("slow");
$('.add_Email_icon').toggleClass("active");
});
});
$(document).ready(function () {
$('#removeemail .remove').on('click', function (e) {
$('#removeemail').hide();
});
$('#removesms .remove').on('click', function (e) {
$('#removesms').hide();
});
});

$(document).ready(function () {
$('.addEmail1').on('click', function (e) {
$(".addMoreEmail1").slideToggle("slow");
$('.add_Email_icon1').toggleClass("active");
});
});

$(document).ready(function () {
$('.addPhone').on('click', function (e) {
$(".addMorePhone").slideToggle("slow");
$('.add_Phone_icon').toggleClass("active");
});
});

$(document).ready(function () {
$('.addPhone1').on('click', function (e) {
$(".addMorePhone1").slideToggle("slow");
$('.add_Phone_icon1').toggleClass("active");
});
});

$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addemail"); //Fields wrapper
var add_button1      = $("#addemailbtn"); //Add button ID

var id2=25;
var x1= 1; //initlal text box count
$(add_button1).click(function(e){ //on add input button click
var email_value  =$('#user_email').val();
e.preventDefault();

if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id2=25+x1;
$('.emailcmtext').show();
$(wrapper1).append('<p class="clearfix "><label><span id="editmailVal'+id2+'">'+email_value+'</span> </label></span><span class="remove_field"><a class="mL10 mT10 fS12_sm fL" href="javascript:void(0);" >UnSubscribe</a></p>'); //add input box
id2++;
$(".addMoreEmail").slideToggle("slow");
$('.add_Email_icon').toggleClass("active");
}


});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault();
$(this).parent('p').remove(); x1--;id2--;

if($('#addemail p').length == 0 )
{
$('.emailcmtext').hide();
}
})
});

$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper23         = $("#addnumber"); //Fields wrapper
var add_button23      = $("#addnumberbtn"); //Add button ID
var id2=25;
var x1= 1; //initlal text box count
$(add_button23).click(function(e){ //on add input button click
var sms_value  =$('#user_sms').val();
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id2=25+x1;
$(wrapper23).append('<p class="clearfix "><label> <span>'+sms_value+'</span></label><a class="mL5 mL0_sm mT5 fS12_sm fL remove_field" href="javascript:void(0);">Deactivate</a></p>'); //add input box
$(".addMorePhone").slideToggle("slow");
$('.add_Phone_icon').toggleClass("active");
$('.smscmtext').show();
}
});

$(wrapper23).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); 
$(this).parent('p').remove(); x1--;id2--;
if($('#addnumber p').length == 0 )
{
$('.smscmtext').hide();
}
})

});
/*Function to edit mail in system settings*/
function showMailEdit(editMailId){
val = document.getElementById("editmailVal" + editMailId).innerHTML;
document.getElementById("editmail" + editMailId).innerHTML = '<span class="fL mT5 mR5 ">Subcribed at </span> <input id="mailEdit' + editMailId + '" type="text" value="arztravels@gmail.com" class="w60pcnt"><span class="tick_icon mT5 mL5" onclick="editValue(' + editMailId + ');"></span>';

document.getElementById("mailEdit" + editMailId).value = val;
}


/*Function to edit number in system settings*/
function showNumberEdit(editNumberId){
val = document.getElementById("editnumberVal" + editNumberId).innerHTML;
document.getElementById("editnumber" + editNumberId).innerHTML = '<span class="fL "><span class="mT5 mR5 fL">SMS notifications are activated on </span> <input id="numberEdit' + editNumberId + '" type="text" value="9874563210" class="w30pcnt"><span class="tick_icon mT5 mL5 " onclick="editNumberValue(' + editNumberId + ');"></span></span>';

document.getElementById("numberEdit" + editNumberId).value = val;
}

function editNumberValue(id){
document.getElementById("editnumber" + id).innerHTML = '<label> SMS notifications are activated on <span id="editnumberVal' + id + '">' + document.getElementById("numberEdit" + id).value + '</span></label><span class=" mT5 fL"><a href="javascript:void(0);" onClick="showNumberEdit(' + id + ');"><span class="edit_icon"></span></a></span>';
}
/* preferences */
$(function(){
$('#flight').show(); // Will show the div
$('#subctg').change(function(){
var selected = $(this).find(':selected').val();
//alert(selected);
$("#flight").hide();
$("#all").hide();
$("#cruise").hide();
$("#eurorail").hide();
$("#bus").hide();
$("#holiday").hide();
$("#activities").hide();
$('#' + selected).show();
});
});

$(document).ready(function() {
    $('#selectalltheme').click(function(event) {  //on click 
        if(this.checked) { // check select status
            $('.checkbox1').each(function() { //loop through each checkbox
                this.checked = true;  //select all checkboxes with class "checkbox1"               
            });
        }else{
            $('.checkbox1').each(function() { //loop through each checkbox
                this.checked = false; //deselect all checkboxes with class "checkbox1"                       
            });         
        }
    });
    $('.checkbox1').click(function(event) {  //on click 
       
            $('#selectalltheme').checked = false; //deselect all checkboxes with class "checkbox1"                       
                   
      
    });
    
});

$(document).ready(function() {
    $('.payresponse').click(function(event) {  //on click 
      $('#debitFormReq').hide();
      $('#debitFormResp').show();
    });
    
    $('.payresponsecredit').click(function(event) {  //on click 
      $('#creditFormReq').hide();
      $('#creditFormResp').show();
    });
    
});
$(document).ready(function() {
    $('#instatus').change(function(event) {  //on click 
      if ($('#instatus').val() == "Overdue")
	  {
	  $('.weekCtr').show();
	  }
	  else{ $('.weekCtr').hide();}
    });

});
  
	  
function getSelectedValue(id) {
return $("#" + id).find("dt a span.value").html();
}
 //Start of  MultiDropdown
$(".dropdown1 dt a").on('click', function () {
          $(".dropdown1 dd ul").slideToggle('fast');
      });

      $(".dropdown1 dd ul li a").on('click', function () {
          $(".dropdown1 dd ul").hide();
      });

      function getSelectedValue(id) {
           return $("#" + id).find("dt a span.value").html();
      }

      $(document).bind('click', function (e) {
          var $clicked = $(e.target);
          if (!$clicked.parents().hasClass("dropdown1")) $(".dropdown1 dd ul").hide();
      });


      $('.mutliSelect1 input[type="checkbox"]').on('click', function () {
        
          var title = $(this).closest('.mutliSelect1').find('input[type="checkbox"]').val(),
              title = $(this).val() ;
				if($(this).val() == "All"){
				if(  $(this).is(':checked')) { // check select status
					$('.checkbox1').each(function() { //loop through each checkbox
						this.checked = true;  //select all checkboxes with class "checkbox1"               
					});
				}else{
					$('.checkbox1').each(function() { //loop through each checkbox
						this.checked = false; //deselect all checkboxes with class "checkbox1"                       
					});         
				}
			}
			else{
			$('#proptype1').attr('checked', false);//deselect all checkboxes with class "checkbox1"      
			}
			
		  var count= $('.mutliSelect1 input[type="checkbox"]:checked').size();
		
		  if(count >5)
		  {
			 $('.multiSel').html('');
			 var html = '<span class="grey_bg pD5 fL mR10" >5+ Property type Selected</span>';
              $('.multiSel').append(html);
		  }
		  else{
		  var property = [];
		  $('.multiSel').html('');
			$('.mutliSelect1 input[type="checkbox"]:checked').each(function(){
			property.push($(this).val());
			 if ($(this).is(':checked')) {
			 
              var html = '<span class="bkgWht pD5 fL mR10 clearfix posR" title="' + $(this).val() + '" onclick="deselectdropdown(\'' + $(this).val() + '\')"><button class="remove_searched_parameter" title="Remove">×</button><span >' + $(this).val() + '</span></span>';
              $('.multiSel').append(html);
             // $(".hida").hide();
          } 
          else {
              $('span[title="' + title + '"]').remove();
              var ret = $(".hida");
              $('.dropdown1 dt a').append(ret);
              
          }
			
			});
			 
		  }
		   
		  
		  
      });

	
function deselectdropdown(chkval)
{
 $('span[title="' + chkval + '"]').remove();
if(chkval== "Bed and Breakfast")
{
$('#proptype2').attr('checked', false);
}
if(chkval== "Boutique Hotel")
{
$('#proptype3').attr('checked', false);
}
if(chkval== "Guest House")
{
$('#proptype4').attr('checked', false);
}
if(chkval== "Heritage Hotel")
{
$('#proptype5').attr('checked', false);
}
if(chkval== "Home Stay")
{
$('#proptype6').attr('checked', false);
}
if(chkval== "Resort")
{
$('#proptype7').attr('checked', false);
}
if(chkval== "Serviced Apartments")
{
$('#proptype8').attr('checked', false);
}
}
// End of MultiDropdown


$(document).ready(function() { //maximum input boxes allowed
var wrapper1         = $("#addcsselement"); //Fields wrapper
var add_button1      = $("#addcsselementbtn"); //Add button ID
var id2=25;
var x1= 1; //initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
x1++; //text box increment
id1=25+x1;

$(wrapper1).append('<tr id="cssDel'+(x1+1)+'"><td></td><td class="bkgDrkGrn"></td><td><span class="recyclebin_icon" onclick="deletecss('+(x1+1)+')"></span></td></tr>'); //add input box

$("#tablecss").css('display','table');

 
});


});

$('div#moreNavadd > a').bind('click', function(evt) {
evt.preventDefault();
evt.stopPropagation();
var optCont = $('ul#moreOptadd');
if (optCont.hasClass('show_options')) {
optCont.removeClass('show_options').css('display', 'none');
$(this).parent('div').removeClass('sel');
} else {
optCont.addClass('show_options').css('display', 'block');
$(this).parent('div').addClass('sel');
}
});


$(document).ready(function () {
$('#flightOpt').on('click', function (e) {
$("#flightContr").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});

$(document).ready(function () {
$('#flightOpt1').on('click', function (e) {
$("#flightContr1").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});
$(document).ready(function () {
$('#flightOpt2').on('click', function (e) {
$("#flightContr2").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});
$(document).ready(function () {
$('#flightOpt13').on('click', function (e) {
$("#flightContr13").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});
$(document).ready(function () {
$('#markupOpt').on('click', function (e) {
$("#markupContr").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});
$(document).ready(function () {
$('.firstemailBtn').on('click', function (e) {
$(".firstemail").show();
$(".hidefirstsmail").hide();
$('.emailcmtext').show();

});
});
$(document).ready(function () {
$('.firstsmsBtn').on('click', function (e) {
$(".firstsms").show();
$(".hidefirstsms").hide();
$('.smscmtext').show();

});
});


$(document).ready(function () {
$('#cruiseOpt').on('click', function (e) {
$("#cruiseContr").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});
$(document).ready(function () {
$('#activityOpt').on('click', function (e) {
$("#activityContr").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});


/*Hotel Services*/
$(document).ready(function () {
$('#openhotelair').on('click', function (e) {
$("#hoteladdair").slideToggle("slow");
$("#openhotelair").hide();
});
});
/*Delete Note*/
function deleteNote(id)
{
document.getElementById('delNote'+id).remove();
}
function deletecss(id)
{
document.getElementById('cssDel'+id).remove();
 var count = $('#addcsselement').children('tr').length;
        if(count == 0)
		{$("#tablecss").css('display','none');}
}

function editHearder(id)
{
for(i=1;i<4;i++){
document.getElementById('headerVal'+id +'_'+i).style.display='none';
document.getElementById('editHeader'+id+'_'+i).style.display='block';
}
document.getElementById('headerVal'+id +'_4').style.display='none';
document.getElementById('tickHeader'+id).style.display='inherit';
}
function showHearder(id)
{
for(i=1;i<4;i++){
document.getElementById('headerVal'+id +'_'+i).style.display='block';
document.getElementById('editHeader'+id+'_'+i).style.display='none';
}
document.getElementById('headerVal'+id +'_4').style.display='inherit';
document.getElementById('tickHeader'+id).style.display='none';
}

$(document).ready(function() {
var max_fields      = 20; //maximum input boxes allowed
var wrapper1         = $("#addNote"); //Fields wrapper
var add_button1      = $("#addNoteBtn"); //Add button ID
var id2=25;
var x1= 4; //initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=25+x1;
$(wrapper1).prepend('<li class="ritSection clearfix w245"  id="delNote'+x1+'"><span class="col_9 pL0">'+$('#noteContent').val()+'<br>2 Aug 2014</span> <span class="recyclebin_icon fR" onclick="deleteNote('+x1+')"></span> </li>'); //add input box
}
$('#noteContent').val(' ');
$('#charCount').html('0');

});


});

$(document).ready(function () {
$('#closehoteladdair').on('click', function (e) {
$("#hoteladdair").slideToggle("slow");
$("#openhotelairadded").show();
$("#addedlist").show();

});
});

$(document).ready(function () {
$('#openhotelconc').on('click', function (e) {
$("#hoteladdconc").slideToggle("slow");
$("#openhotelconc").hide();
});
});
$(document).ready(function () {
$('#closehoteladdconc').on('click', function (e) {
$("#hoteladdconc").slideToggle("slow");
$("#openhotelconc").show();


});
});

$(document).ready(function () {
$('#openhotelmeal').on('click', function (e) {
$("#hoteladdmeal").slideToggle("slow");
$("#openhotelmeal").hide();
});
});
$(document).ready(function () {
$('#closehoteladdmeal').on('click', function (e) {
$("#hoteladdmeal").slideToggle("slow");
$("#openhotelmeal").show();


});
});
/*Hotel Services End*/

/*Flights Services*/
$(document).ready(function () {
$('#openflightair').on('click', function (e) {
$("#flightaddair").slideToggle("slow");
$("#openflightair").hide();
});
});
$(document).ready(function () {
$('#closeflightaddair').on('click', function (e) {
$("#flightaddair").slideToggle("slow");
$("#openflightairadded").show();
$("#addedlist").show();

});
});

$(document).ready(function () {
$('#openflightconc').on('click', function (e) {
$("#flightaddconc").slideToggle("slow");
$("#openflightconc").hide();
});
});
$(document).ready(function () {
$('#closeflightaddconc').on('click', function (e) {
$("#flightaddconc").slideToggle("slow");
$("#openflightconc").show();


});
});

$(document).ready(function () {
$('#openflightvip').on('click', function (e) {
$("#flightaddvip").slideToggle("slow");
$("#openflightvip").hide();
});
});
$(document).ready(function () {
$('#closeflightaddvip').on('click', function (e) {
$("#flightaddvip").slideToggle("slow");
$("#openflightvip").show();


});
});
/*Flights Services End*/

if($().slider){
$( "#slider-duration" ).slider({
range: true,
min: 0,
max: 36,
values: [ 0, 5 ],
slide: function( event, ui ) {
$( "#duration" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
}
});
$( "#duration" ).val( $( "#slider-duration" ).slider( "values", 0 ) +" - " + $( "#slider-duration" ).slider( "values", 1 ) );
$( "#slider-duration-port" ).slider({
range: true,
min: 0,
max: 36,
values: [ 0, 5],
slide: function( event, ui ) {
$( "#duration-port" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
}
});
$( "#duration-port" ).val( $( "#slider-duration-port" ).slider( "values", 0 ) +" - " + $( "#slider-duration-port" ).slider( "values", 1 ) );
$( "#slider-range-port1" ).slider({
range: true,
min: 0,
max: 100000,
values: [ 0, 30000 ],
slide: function( event, ui ) {
$( "#amount-port1" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
}
});
$( "#amount-port1" ).val( $( "#slider-range-port1" ).slider( "values", 0 ) +" - " + $( "#slider-range-port1" ).slider( "values", 1 ) );
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
$( "#slider-range2" ).slider({
range: true,
min: 0,
max: 100000,
values: [ 0, 30000 ],
slide: function( event, ui ) {
$( "#amount2" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
}
});
$( "#amount2" ).val( $( "#slider-range2" ).slider( "values", 0 ) +" - " + $( "#slider-range2" ).slider( "values", 1 ) );
$( "#slider-return1" ).slider({
range: true,
min: 0,
max: 24,
values: [ 8, 16 ],
slide: function( event, ui ) {
$( "#return1" ).val(ui.values[ 0 ] + ".00 - " + ui.values[ 1 ]+".00" );
}
});
$( "#return1" ).val( $( "#slider-return1" ).slider( "values", 0 ) +".00 - " + $( "#slider-return1" ).slider( "values", 1 )+".00" );
$( "#slider-range3" ).slider({
range: true,
min: 0,
max: 100000,
values: [ 0, 30000 ],
slide: function( event, ui ) {
$( "#amount3" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
}
});
$( "#amount3" ).val( $( "#slider-range3" ).slider( "values", 0 ) +" - " + $( "#slider-range3" ).slider( "values", 1 ) );

$( "#slider-range2" ).slider({
range: true,
min: 0,
max: 100000,
values: [ 0, 30000 ],
slide: function( event, ui ) {
$( "#amount2" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
}
});
$( "#amount2" ).val( $( "#slider-range2" ).slider( "values", 0 ) +" - " + $( "#slider-range2" ).slider( "values", 1 ) );
$( "#slider-range-dollar" ).slider({
range: "min",
min: 0,
max: 100000,
value:38867,
slide: function( event, ui ) {
$( "#priceChangedol" ).val( ui.value );
}
});
$("<span>&#36;</span>").insertBefore( "#priceChangedol" );
$( "#priceChangedol" ).val( $( "#slider-range-dollar" ).slider( "value" ) );
$( "#slider-range-dollarfare" ).slider({
range: "min",
min: 0,
max: 100000,
value:38867,
slide: function( event, ui ) {
$( "#priceChangedolfare" ).val( ui.value );
}
});
$("<span>&#36;</span>").insertBefore( "#priceChangedolfare" );
$( "#priceChangedolfare" ).val( $( "#slider-range-dollarfare" ).slider( "value" ) );
}
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
var leg = 1;
leg1Added = leg2Added = leg3Added = leg4Added = leg5Added = 0;

function selectMultiEurail(flightLeg){
document.getElementById('btmTop').style.display = 'block';
if(flightLeg == 1){
document.getElementById("selectFlightLeg1").innerHTML = '<samp class="mT5 mR10 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn><span class="wayNum sel  mR10 fL" id="multiWayBtm1">1</span><span class="cB"><span class="fW600">London</span><span class="oneway_icon valign"></span> <span class="fW600">Paris</span><br/><span class="mL15">25th Sep 14</span> <br/><span class="mL15">$ 300</span></dfn>';
leg1Added = 1;
}
if(flightLeg == 2){
document.getElementById("selectFlightLeg2").innerHTML = '<samp class="mT5 mR10 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn><span class="wayNum sel  mR10 fL" id="multiWayBtm1">2</span><span class="cB"><span class="fW600">Paris</span><span class="oneway_icon valign"></span> <span class="fW600">Frankfurt</span><br/><span class="mL15">25th Sep 14</span> <br/><span class="mL15">$ 300</span></dfn>';
leg2Added = 1;
}
if(flightLeg == 3){
document.getElementById("selectFlightLeg3").innerHTML = '<samp class="mT5 mR10 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn><span class="wayNum sel  mR10 fL" id="multiWayBtm1">3</span><span class="cB"><span class="fW600">Frankfurt</span><span class="oneway_icon valign"></span> <span class="fW600">Zurich</span><br/><span class="mL15">25th Sep 14</span> <br/><span class="mL15">$ 300</span></dfn>';
leg3Added = 1;


}
if(flightLeg == 4){
document.getElementById("selectFlightLeg4").innerHTML = '<samp class="mT5 mR10 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn><span class="wayNum sel  mR10 fL" id="multiWayBtm1">4</span><span class="cB"><span class="fW600">London</span><span class="oneway_icon valign"></span> <span class="fW600">Paris</span><br/><span class="mL15">25th Sep 14</span> <br/><span class="mL15">$ 300</span></dfn>';
leg4Added = 1;
popupwin('addleg5pop','addleg5popinner', 'fade');

}
if(flightLeg == 6){
document.getElementById("selectFlightLeg4").innerHTML = '<samp class="mT5 mR10 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn><span class="wayNum sel  mR10 fL" id="multiWayBtm1">4</span><span class="cB"><span class="fW600">London</span><span class="oneway_icon valign"></span> <span class="fW600">Paris</span><br/><span class="mL15">25th Sep 14</span> <br/><span class="mL15">$ 300</span></dfn>';
leg4Added = 1;

}
if(flightLeg == 5){
document.getElementById("selectFlightLeg5").innerHTML = '<samp class="mT5 mR10 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn><span class="wayNum sel  mR10 fL" id="multiWayBtm1">5</span><span class="cB"><span class="fW600">Frankfurt</span><span class="oneway_icon valign"></span> <span class="fW600">Zurich</span><br/><span class="mL15">25th Sep 14</span> <br/><span class="mL15">$ 300</span></dfn>';
leg5Added = 1;
}
}

function addleg5()
{
$('#slider li:last-child').removeClass('last');
$('#selectFlightLeg5').show();
//$('#test').show();
//$('.nextBtn').css('visibility', 'visible');
//$('.nextBtn').css('opacity', '1');

var content='<li class="first"> <ul class="ft_results oneway grey_border"> <li class="flightContrHrdr clearfix"><span id="multiWayMid1" class="wayNum sel mR10 fL">1</span> <span class="fL"><span class="fS18">London - Paris</span> | 24 Jul, Sun | 2 adults</span></li> <li class="flightDtlContr clearfix"> <a href="javascript:void(0);" class="deptTime" style="margin-left:5%">Departure</a><a href="javascript:void(0);" class="deptTime mL12pcnt">Duration</a> <a href="javascript:void(0);" class="ArivTime " style="margin-left:6%">Arrival</a> <a href="javascript:void(0);" class="ArivTime" style="margin-left:20%">Total price<span class="sortAro_up_icon"></span></a> </li> <li class="clearfix pT20 posR brdrBLitGry" id="flightLeg1"><span class="fL w60pcnt"> <cite><a href="javascript:void(0)">Upgrade offer for $ 198 only </a></cite> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="fR mT5 mR20 dB" id="moreDetailsTrigger1"  onclick="showMoreInfo(\'moreDetailsTrigger1\',\'moreDetailsContainer1\',\'plusMinus1_1\');"><span id="plusMinus1_1">+</span> Details</a> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span class="clearfix fL dB" ><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr">Markup <span><a href="javascript:void(0);"><span >&#36; 1,350</span></a><span class="edit_sml_icon mL5"></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL mT15" onclick="selectMultiEurail(1)">Select</a></span></span> </span> <br class="cB">  <section class="detailContr_inner w100pcnt clearfix dN" id="moreDetailsContainer1"> <span class="popup_close_icon fR" onclick="dismissMoreInfo(\'moreDetailsTrigger1\',\'moreDetailsContainer1\',\'plusMinus1_1\')"></span> <span class="detailContr_01"></span> <div class="col_6 pR0 pL10 layover clearfix"> <dfn> <strong> <small>London<br> St. Pancras </small> 05:30 </strong> <ins> <span>Economy</span> 1h 25m </ins> <strong> <small>Amsterdam <br> Paris Nord </small> 06:35 </strong> </dfn> <span class="layoverBG fL w100pcnt"><span class="layoverBGTime">Layover 45 min</span></span><br class="cB"> <dfn> <strong> <small>London St. Pancras</small> 05:10</strong> <ins> <span>Economy</span> 1h 25m</ins> <strong> <small>Amsterdam Paris Nord</small> 06:25 </strong> </dfn> <div class="pD10 cB"> <span class=" fL w100pcnt fW600 mB5 mT20">Ticket Flexibility</span> <span class="fL w100pcnt mB10"> <span class="fL"><input type="radio" id="ticketFlx1" name="options1" checked="checked"><label></label></span> <span class="fL"><a href="#">Non flexible</a><br>Non – refundable, non - exchangeable</span> <span class="fS22 fR"></span> </span> <span class="fL w100pcnt mB10"> <span class="fL"><input type="radio" id="ticketFlx2" name="options1"><label></label></span> <span class="fL"><a href="#">Semi flexible</a><br>Refundable and flexible for a fee</span> <span class="fR">+ <span class="fS30">$88</span></span> </span> <span class="fL w100pcnt mB15"> <span class="fL"><input type="radio" id="ticketFlx3" name="options1"><label></label></span> <span class="fL"><a href="#">Flexible</a><br>Non – refundable, non - exchangeable</span> <span class="fR">+ <span class="fS30">$88</span></span> </span> <a href="javascript:void(0);" class="mT15 mB15 clearfix">Booking policy</a> </div> </div>  <div class="col_6 mL10imp flyBG"> <div class="col_4  pL0 flightCol1"> <ul class="clearfix mB15"> <li> <input type="radio" id="fly1" name="options2"> <label for="fly1">Economy</label> <span class="mL30 fS22">$ 88</span> </li> <li> <input type="radio" id="flyBag1" checked="checked" name="options2"> <label for="flyBag1">Comfort</label> <span class="fS22 mL30">$ 187</span> </li> <li> <input type="radio" id="flyBagEat1" name="options2"> <label for="flyBagEat1">Premiere</label> <span class="fS22 mL30">$ 483</span> </li> </ul> </div> <div class="col_8 mT10"> <dl class="mB15 payment"> <dt class="fW600 fS12imp">FARE BREAKUP</dt> <dd class="fW600 fS12imp">&#36;</dd> <dt class="fS12imp">Base Fare</dt> <dd class="fS12imp">78</dd> <dt class="fS12imp">Taxes	</dt> <dd class="fS12imp">3</dd> <dt class="fS12imp">Total Fare	</dt> <dd class="fS12imp">81</dd> <dt class="fS12imp">Mark Up with Taxes</dt> <dd class="fS12imp">8</dd> <dt class="fS12imp">Cost to Customer	</dt> <dd class="fS12imp">88</dd> <dt class="fS12imp">Commission with TDS (-)</dt> <dd class="fS12imp">10</dd> <dt class="fS12imp">Mark Up with Taxes</dt> <dd class="fS12imp">8</dd> <dt class="fS12imp">Ezeego1 transaction fee with Taxes	</dt> <dd class="fS12imp">2</dd> <dt class="fS12imp">Cost to Agency</dt> <dd class="fS12imp">73</dd> </dl> </div>  </div> <div class="mT20 col_6 fR fS12 lH15"> <ul class="col_12 cB mB20"> <li class="heading fW600">Upgrade offer</li> <li>More spacious recliner seating</li> <li> Choice of drink, beer or wine at your</li> <li>seat</li> <li>Complimentary newspaper</li> <li style="width:86% !important;">More room for luggage  <span class="fS30 fR">+$131</span></li> </ul> <span class="primaryBtn_sml fR tC"> <a href="javascript:void(0);" class="mB10">Upgrade</a> <br/> <span class="pD5 bkgGrn fS12 fW600">Selected</span></span> </div> </section> </li> <li class="clearfix pT20 posR  brdrBLitGry"> <span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="dB fR  mT5 mR20"><span>+</span> Details</a> </span> <span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr">Markup <span><a href="javascript:void(0);"><span id="markupVal2">&#36; 1,350</span></a><span class="edit_sml_icon mL5"></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL">Select</a> </span></span></span><br class="cB"> </li> <li class="clearfix pT20 posR  brdrBLitGry"> <span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="dB fR  mT5 mR20"><span>+</span> Details</a> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr">Markup <span><a href="javascript:void(0);"><span>&#36; 1,350</span></a><span class="edit_sml_icon mL5"></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL">Select</a></span></span> </span> <br class="cB"> </li> <li class="clearfix pT20 posR"> <span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="dB fR  mT5 mR20"><span>+</span> Details</a> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr"> Markup <span><a href="javascript:void(0);"><span>&#36; 1,350</span></a><span class="edit_sml_icon mL5" ></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL">Select</a></span></span></span> <br class="cB"> </li> </ul> </li> <li> <ul class="ft_results oneway grey_border"> <li class="flightContrHrdr clearfix posR"><span id="multiWayMid2" class="wayNum mR10 fL">2</span><span class="fL"><span class="fS18">Paris - Frankfurt</span> | 24 Jul, Sun | 2 adults</span> </li> <li class="flightDtlContr clearfix"> <a href="javascript:void(0);" class="deptTime" style="margin-left:5%">Departure</a><a href="javascript:void(0);" class="deptTime mL12pcnt">Duration</a> <a href="javascript:void(0);" class="ArivTime " style="margin-left:6%">Arrival</a> <a href="javascript:void(0);" class="ArivTime" style="margin-left:20%">Total price<span class="sortAro_up_icon"></span></a> </li> <li class="clearfix pT20 posR brdrBLitGry" id="flightLeg2"><span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="dB fR  mT5 mR20"><span>+</span> Details</a> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr">Markup <span><a href="javascript:void(0);"><span >&#36; 1,350</span></a><span class="edit_sml_icon mL5"></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL" onclick="selectMultiEurail(2)">Select</a></span></span> </span> <br class="cB"> </li> <li class="clearfix pT20 posR  brdrBLitGry"> <span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="dB fR  mT5 mR20"><span>+</span> Details</a> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr">Markup <span><a href="javascript:void(0);"><span>&#36; 1,350</span></a><span class="edit_sml_icon mL5"></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL">Select</a></span></span> <br class="cB"> </li> <li class="clearfix pT20 posR  brdrBLitGry"> <span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="dB fR  mT5 mR20"><span>+</span> Details</a> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr">Markup <span><a href="javascript:void(0);"><span>&#36; 1,350</span></a><span class="edit_sml_icon mL5"></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL">Select</a></span> </span></span> <br class="cB"> </li> <li class="clearfix pT20 posR"> <span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="dB fR  mT5 mR20"><span>+</span> Details</a> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr">Markup<span><a href="javascript:void(0);"><span>&#36; 1,350</span></a><span class="edit_sml_icon mL5" ></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL">Select</a></span></span></span> <br class="cB"> </li> </ul> </li> <li> <ul class="ft_results oneway grey_border"> <li class="flightContrHrdr clearfix"><span id="multiWayMid3" class="wayNum mR10 fL">3</span> <span class="fL"><span class="fS18">Frankfurt - Zurich</span> | 24 Jul, Sun | 2 adults</span></li> <li class="flightDtlContr clearfix"> <a href="javascript:void(0);" class="deptTime" style="margin-left:5%">Departure</a><a href="javascript:void(0);" class="deptTime mL12pcnt">Duration</a> <a href="javascript:void(0);" class="ArivTime " style="margin-left:6%">Arrival</a> <a href="javascript:void(0);" class="ArivTime" style="margin-left:20%">Total price<span class="sortAro_up_icon"></span></a> </li> <li class="clearfix pT20 posR brdrBLitGry" id="flightLeg3"><span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="dB fR  mT5 mR20"><span>+</span> Details</a> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr">Markup <span><a href="javascript:void(0);"><span >&#36; 1,350</span></a><span class="edit_sml_icon mL5"></span></span> </em> </span><span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL" onclick="selectMultiEurail(3)">Select</a></span></span></span> <br class="cB"> </li> <li class="clearfix pT20 posR  brdrBLitGry"> <span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="dB fR  mT5 mR20"><span>+</span> Details</a> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr" >Markup <span><a href="javascript:void(0);"><span>&#36; 1,350</span></a><span class="edit_sml_icon mL5"></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL">Select</a></span></span> </span> <br class="cB"> </li> <li class="clearfix pT20 posR  brdrBLitGry"> <span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="dB fR  mT5 mR20"><span>+</span> Details</a> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr"> Markup <span><a href="javascript:void(0);"><span>&#36; 1,350</span></a><span class="edit_sml_icon mL5"></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL mT15">Select</a></span></span></span> <br class="cB"> </li> <li class="clearfix pT20 posR"> <span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="dB fR  mT5 mR20"><span>+</span> Details</a> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr">Markup <span><a href="javascript:void(0);"><span>&#36; 1,350</span></a><span class="edit_sml_icon mL5" ></span></span> </em> </span><span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL">Select</a></span></span>></span> <br class="cB"> </li> </ul> </li> <li > <ul class="ft_results oneway grey_border"> <li class="flightContrHrdr clearfix last"><span id="multiWayMid4" class="wayNum mR10 fL">4</span><span class="fL"><span class="fS18">London - Paris</span> | 24 Jul, Sun | 2 adults</span></li> <li class="flightDtlContr clearfix"> <a href="javascript:void(0);" class="deptTime" style="margin-left:5%">Departure</a><a href="javascript:void(0);" class="deptTime mL12pcnt">Duration</a> <a href="javascript:void(0);" class="ArivTime " style="margin-left:6%">Arrival</a> <a href="javascript:void(0);" class="ArivTime" style="margin-left:20%">Total price<span class="sortAro_up_icon"></span></a> </li> <li class="clearfix pT20 posR brdrBLitGry" id="flightLeg4"><span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="dB fR  mT5 mR20"><span>+</span> Details</a> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr">Markup <span><a href="javascript:void(0);"><span > &#36; 1,350</span></a><span class="edit_sml_icon mL5"></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL" onclick="selectMultiEurail(4)">Select</a></span></span> </span> <br class="cB"> </li> <li class="clearfix pT20 posR  brdrBLitGry"> <span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="dB fR  mT5 mR20"><span>+</span> Details</a> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr">Save Rs 300<br> Markup <span><a href="javascript:void(0);"><span class="rupee">Rs </span><span>1,350</span></a><span class="edit_sml_icon mL5"></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL mT15">Select</a></span> </span></span> <br class="cB"> </li> <li class="clearfix pT20 posR  brdrBLitGry"> <span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="dB fR  mT5 mR20"><span>+</span> Details</a> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr">Markup <span><a href="javascript:void(0);"><span>&#36; 1,350</span></a><span class="edit_sml_icon mL5"></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL">Select</a></span></span></span> <br class="cB"> </li> <li class="clearfix pT20 posR"> <span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr">Markup <span><a href="javascript:void(0);"><span>&#36; 1,350</span></a><span class="edit_sml_icon mL5" ></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL">Select</a> </span> </span><a href="javascript:void(0);" class="mT20 mR20 dB"><span>+</span> Details</a></span> <br class="cB"> </li> </ul> </li> <li class="last"> <ul class="ft_results oneway grey_border"> <li class="flightContrHrdr clearfix last"><span id="multiWayMid5" class="wayNum mR10 fL">5</span><span class="fL"><span class="fS18">London - Paris</span> | 24 Jul, Sun | 2 adults</span></li> <li class="flightDtlContr clearfix"> <a href="javascript:void(0);" class="deptTime" style="margin-left:5%">Departure</a><a href="javascript:void(0);" class="deptTime mL12pcnt">Duration</a> <a href="javascript:void(0);" class="ArivTime " style="margin-left:6%">Arrival</a> <a href="javascript:void(0);" class="ArivTime" style="margin-left:20%">Total price<span class="sortAro_up_icon"></span></a> </li> <li class="clearfix pT20 posR brdrBLitGry" id="flightLeg5"><span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="dB fR  mT5 mR20"><span>+</span> Details</a> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr">Markup <span><a href="javascript:void(0);"><span > &#36; 1,350</span></a><span class="edit_sml_icon mL5"></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL" onclick="selectMultiEurail(5)">Select</a></span></span> </span> <br class="cB"> </li> <li class="clearfix pT20 posR  brdrBLitGry"> <span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="dB fR  mT5 mR20"><span>+</span> Details</a> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr">Save Rs 300<br> Markup <span><a href="javascript:void(0);"><span class="rupee">Rs </span><span>1,350</span></a><span class="edit_sml_icon mL5"></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL mT15">Select</a></span> </span></span> <br class="cB"> </li> <li class="clearfix pT20 posR  brdrBLitGry"> <span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> <a href="javascript:void(0);" class="dB fR  mT5 mR20"><span>+</span> Details</a> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr">Markup <span><a href="javascript:void(0);"><span>&#36; 1,350</span></a><span class="edit_sml_icon mL5"></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL">Select</a></span></span></span> <br class="cB"> </li> <li class="clearfix pT20 posR"> <span class="fL w60pcnt"> <samp class="mT5 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <span class="pT0">9002</span></samp><dfn class="fL w86pcnt"> <strong class="fL mR20"> <small>London <br/>St. Pancras</small> 11:30 </strong><span class="tC fL mL20 mR20">Economy<br/><span class="oneway_icon"></span> <br/>3h 5m 0 Stop</span>  <strong class="mL20"> <small>Paris <br/>Paris Nord</small> 04:35 </strong></dfn> </span><span class="fL priceGrnContr clearfix mTN20 w40pcnt h120"> <span class="h27 dB"> <select class="select_sml mB5 w40pcnt"> <option value="Economy">Economy</option> <option value="Comfort" selected="selected">Comfort</option> <option value="Premiere">Premiere</option> </select> </span> <span class="fL w50pcnt"> <span><a href="javascript:void(0)" class="fL fS18">&#36;<span class="fW600">88</span></a> <span class="faq_sml_icon fL mT5 mL5"></span></span> <em class="markupContr">Markup <span><a href="javascript:void(0);"><span>&#36; 1,350</span></a><span class="edit_sml_icon mL5" ></span></span> </em> </span> <span class="fR w50pcnt"> <span class="primaryBtn_sml"><a href="javascript:void(0);" class="fL">Select</a> </span> </span><a href="javascript:void(0);" class="mT20 mR20 dB"><span>+</span> Details</a></span> <br class="cB"> </li> </ul> </li>';
$("#result").html(' <ul id="slider"> </ul> ');
$("#slider").html(content);
$("#slider").sudoSlider();
}

function eurailtype(tabid, contrid){
for(i=15; i<=28; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==15){
document.getElementById('way'+i).className = 'first';
}
if(i==28){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way15'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way28'){
document.getElementById(tabid).className = 'last sel';
}
}
function eurailtype1(tabid, contrid){
for(i=15; i<=17; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==15){
document.getElementById('way'+i).className = 'first';
}
if(i==17){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way15'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way17'){
document.getElementById(tabid).className = 'last sel';
}
}


function eurailpasstype(tabid, contrid){
for(i=33; i<=35; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==33){
document.getElementById('way'+i).className = 'first';
}
if(i==35){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way33'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way35'){
document.getElementById(tabid).className = 'last sel';
}
}

function flighthoteltype(tabid, contrid){
for(i=36; i<=38; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==36){
document.getElementById('way'+i).className = 'first';
}
if(i==38){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way36'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way38'){
document.getElementById(tabid).className = 'last sel';
}
}


$(document).ready(function() {
var max_fields3      = 10; //maximum input boxes allowed
var wrapper3         = $("#addfields"); //Fields wrapper
var add_button3      = $("#addfieldbtn"); //Add button ID
var id3=13;
var id4=1;
var x3 = 1;
var x4 = 0;	//initlal text box count
$(add_button3).click(function(e){ //on add input button click
e.preventDefault();
if(x3 < max_fields3 || x4 < max_fields3){ //max input box allowed
x3++; //text box increment
x4++;
id3=13+x3;
id4=1+x4;
$(wrapper3).append('<ul class="mB10 clearfix">  <li class="col_2_half pR0 pL0"><label>Starting from '+id4+'</label><input type="text" class="w95pcnt" name="startfrom" placeholder="From" /></li> <li class="fL pR10"><span class="mT25 oneway_icon"></li><li class="col_2_half pR0 pL0"><label>Going to</label> <input type="text" class="w95pcnt" name="to" placeholder="To" /></li><li class="col_2_half pR0 pL0"><label>Departure</label><input id="datepicker'+id3+'" class="w95pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li><li class="col_2 pR0 pL0"> <label>Time</label><select><option value="08:00">08:00</option> </select> </li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li> </ul>'); //add input box
}
if($().datepicker){
$( "#datepicker13, #datepicker14, #datepicker15, #datepicker16, #datepicker17, #datepicker18, #datepicker19, #datepicker20, #datepicker21, #datepicker22, #datepicker23, #datepicker24, #datepicker25, #datepicker26" ).datepicker({
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
});

$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addfieldsreserv"); //Fields wrapper
var add_button1      = $("#addfieldreservbtn"); //Add button ID
var id1=25;
var x1= 1; //initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=25+x1;
$(wrapper1).append('<ul class="mB10 mT10 clearfix">  <li class="col_2_half pR0 pL0"><label>Starting from</label><input type="text" class="w95pcnt" name="startfrom" placeholder="From" /></li><li class="col_1 pR0"><span class="mT20 tC oneway_icon"></span></li>  <li class="col_2_half pR0 pL0"><label>Going to</label> <input type="text" class="w95pcnt" name="to" placeholder="To" /></li><li class="col_3 pR0 pL0"><label>Departure</label><input id="datepicker'+id1+'" class="w95pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li><li class="col_2 pR0 pL0"> <label>Time</label><select><option value="08:00">08:00</option> </select> </li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li> </ul>'); //add input box
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
});

$(document).ready(function() {
var max_fields      = 40; //maximum input boxes allowed
var wrapper         = $("#addcountry"); //Fields wrapper
var add_button      = $("#addcountrybtn"); //Add button ID
var x = 1; //initlal text box count
$(add_button).click(function(e){ //on add input button click
e.preventDefault();
if(x < max_fields){ //max input box allowed
x++; //text box increment
$(wrapper).append('<ul class="mB10 clearfix"><li class="col_5 pL0"> <label>Country</label><input type="text" class="w95pcnt" name="Country" placeholder="Country" /> </li><li class="col_3"> <label>No. of days</label><select>  <option value="1">1</option>  </select> </li> <li class="col_2 mT30 pR0 remove_field"><span class="popup_close_icon"></span></li> </ul>'); //add input box
}
});
$(wrapper).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x--;
})
});

$(document).ready(function() {
var max_fields3      = 10; //maximum input boxes allowed
var wrapper3         = $("#addfields1"); //Fields wrapper
var add_button3      = $("#addfieldbtn1"); //Add button ID
var id3=13;
var id4=1;
var x3 = 1;
var x4 = 0;	//initlal text box count
$(add_button3).click(function(e){ //on add input button click
e.preventDefault();
if(x3 < max_fields3 || x4 < max_fields3){ //max input box allowed
x3++; //text box increment
x4++;
id3=13+x3;
id4=1+x4;
$(wrapper3).append('<ul class="mB10 clearfix">  <li class="col_2_half pR0 pL0"><label>Starting from '+id4+'</label><input type="text" class="w95pcnt" name="startfrom" placeholder="From" /></li> <li class="fL pR10"><span class="mT25 oneway_icon"></li><li class="col_2_half pR0 pL0"><label>Going to</label> <input type="text" class="w95pcnt" name="to" placeholder="To" /></li><li class="col_2_half pR0 pL0"><label>Departure</label><input id="datepicker'+id3+'" class="w95pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li><li class="col_2 pR0 pL0"> <label>Time</label><select><option value="08:00">08:00</option> </select> </li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li> </ul>'); //add input box
}
if($().datepicker){
$( "#datepicker13, #datepicker14, #datepicker15, #datepicker16, #datepicker17, #datepicker18, #datepicker19, #datepicker20, #datepicker21, #datepicker22, #datepicker23, #datepicker24, #datepicker25, #datepicker26" ).datepicker({
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
});

$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addfieldsreser1"); //Fields wrapper
var add_button1      = $("#addfieldreservbttn1"); //Add button ID
var id1=25;
var x1= 1; //initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=25+x1;
$(wrapper1).append('<ul class="mB10 mT10 clearfix">  <li class="col_2_half pR0 pL0"><label>Starting from</label><input type="text" class="w95pcnt" name="startfrom" placeholder="From" /></li><li class="col_1 pR0"><span class="mT20 tC oneway_icon"></span></li>  <li class="col_2_half pR0 pL0"><label>Going to</label> <input type="text" class="w95pcnt" name="to" placeholder="To" /></li><li class="col_3 pR0 pL0"><label>Departure</label><input id="datepicker'+id1+'" class="w95pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li><li class="col_2 pR0 pL0"> <label>Time</label><select><option value="08:00">08:00</option> </select> </li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li> </ul>'); //add input box
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
});

$(document).ready(function() {
var max_fields      = 40; //maximum input boxes allowed
var wrapper         = $("#addcountry1"); //Fields wrapper
var add_button      = $("#addcountrybtn1"); //Add button ID
var x = 1; //initlal text box count
$(add_button).click(function(e){ //on add input button click
e.preventDefault();
if(x < max_fields){ //max input box allowed
x++; //text box increment
$(wrapper).append('<ul class="mB10 clearfix"><li class="col_5 pL0"> <label>Country</label><input type="text" class="w95pcnt" name="Country" placeholder="Country" /> </li><li class="col_3"> <label>No. of days</label><select>  <option value="1">1</option>  </select> </li> <li class="col_2 mT30 pR0 remove_field"><span class="popup_close_icon"></span></li> </ul>'); //add input box
}
});
$(wrapper).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x--;
})
});
function updateMonthYear() {
$month.html( cal.getMonthName() );
$year.html( cal.getYear() );
}

function selectBus(busNo,path){
if(path == "arrival"){
document.getElementById('busArrival' + busNo).className = 'clearfix posR brdrBLitGry sel';
document.getElementById('btmTop').style.display = 'block';
if(document.getElementById('selectContainer2').innerHTML == ''){
document.getElementById("addRBus").style.display = "block";
document.getElementById('compPrice').innerHTML = '18,418';
}
else{
document.getElementById("addRBus").style.display = "none";
document.getElementById('compPrice').innerHTML = '37,780';
}
document.getElementById('selectContainer1').innerHTML = '<div class="mB10 clearfix"><span class="fW600">MUM<span class="oneway_icon valign"></span>GOA</span> , <span>25 Sep 2014</span></div><div class="col_4 pR0 pL0"><div><span class="diy_bus_icon"></span></div><div class="fS12"><span>Neeta Tours &amp; Travels</span> <br /> </div></div><div class="col_8 pR0 pL0 mTN5"><div class="fS12 mB5">05:30 - 06:35(1h 35mins)</div><div class="fS12">Seat No. - 43, 42</div></div>';
document.getElementById("addSBus").style.display = "none";
}
if(path == "return"){
document.getElementById('busDeparture' + busNo).className = 'clearfix posR brdrBLitGry sel';
document.getElementById('btmTop').style.display = 'block';
if(document.getElementById('selectContainer1').innerHTML == ""){
document.getElementById("addSBus").style.display = "block";
document.getElementById('compPrice').innerHTML = '18,418';
}
else{
document.getElementById("addSBus").style.display = "none";
document.getElementById('compPrice').innerHTML = '37,780';
}
document.getElementById('selectContainer2').innerHTML = '<div class="mB10 clearfix"><span class="fW600">GOA<span class="oneway_icon valign"></span>MUM</span> , <span>28 Sep 2014</span></div><div class="col_4 pR0 pL0"><div><span class="diy_bus_icon"></span></div><div class="fS12"><span>Neeta Tours &amp; Travels</span> <br /> </div></div><div class="col_8 pR0 pL0 mTN5"><div class="fS12 mB5">05:30 - 06:35(1h 35mins)</div><div class="fS12">Seat No. - 43, 42</div></div>';
document.getElementById("addRBus").style.display = "none";
}
if((document.getElementById('selectContainer1').innerHTML != '') && (document.getElementById('selectContainer2').innerHTML != ''))
document.getElementById("selectBooking").style.display = "block";
else
document.getElementById("selectBooking").style.display = "none";
}
if(jQuery().slick ){
$('#bannerSlider, #hotelSlideshow').slick({
//autoplay: true,
dots: false,
arrows: true,
//autoplaySpeed: 10000,
cssEase: 'linear'
});
}

$(document).ready(function () {
$('.selectbuswy').on('click', function (e) {
$("#btmTop").show();

});
});
$(document).ready(function () {
$('#selectview').on('click', function (e) {
$("#selectdetails").show();

});
});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper         = $(".input_fields_wrap"); //Fields wrapper
var add_button      = $(".add_field_button"); //Add button ID

var x = 1; //initlal text box count
$(add_button).click(function(e){ //on add input button click
e.preventDefault();
if(x < max_fields){ //max input box allowed
x++; //text box increment
$(wrapper).append('<ul class="mB10 clearfix"><li class="col_12 pL0 pR0"><label>Via</label><input type="text"  name="startfrom" placeholder="From" style="width:51%" class="fL" /><a href="javascript:void(0);" class="fL mL15 mT5 remove_field"><span class="popup_close_icon"></span> </a></li></ul>'); //add input box
}
});

$(wrapper).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('li').remove(); x--;
})
});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper         = $(".input_fields_wrap1"); //Fields wrapper
var add_button      = $(".add_field_button1"); //Add button ID

var x = 1; //initlal text box count
$(add_button).click(function(e){ //on add input button click
e.preventDefault();
if(x < max_fields){ //max input box allowed
x++; //text box increment
$(wrapper).append('<ul class="mB10 clearfix"><li class="col_12 pL0 pR0"><label>Via</label><input type="text"  name="startfrom" placeholder="From" style="width:51%" class="fL" /><a href="javascript:void(0);" class="fL mL15 mT5 remove_field"><span class="popup_close_icon"></span> </a></li></ul>'); //add input box
}
});

$(wrapper).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('li').remove(); x--;
})
});

if($().datepicker){
$( "#datepicker-inline1, #datepicker-inline2, #datepicker-inline3" ).datepicker({
numberOfMonths:1,
minDate: 0,
dateFormat: "dd/mm/yy",
onSelect: function(dateText){
$(this).css("color","#333333");
}
});
}

$(document).ready(function () {
$('.cruise_detail1').on('click', function (e) {
$('.cruise_detailCntr').slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});

$(document).ready(function () {
$('#cars_detail2').on('click', function (e) {
$('#cars_detailCntr1').slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/search_icon.png');
}else{
$(this).find('img').attr('src','images/b2b-images/search_icon.png');
}
});
});
$(document).ready(function () {
$('#cars_detail3').on('click', function (e) {
$('#cars_detailCntr2').slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/search_icon.png');
}else{
$(this).find('img').attr('src','images/b2b-images/search_icon.png');
}
});
});

$(document).ready(function() {
//Select and deselect all checkboxes
$("#checkAllThemes").click(function () {
$('.chkThemes').prop('checked', this.checked);
});

//If one item deselect then checkbox 'checkAll' is UnCheck
//If all items select individually then checkbox 'checkAll' is Check
$(".chkThemes").click(function () {
$("#checkAllThemes").prop('checked', ($('.chk:checked').length == $('.chkThemes').length) ? true : false);
});
});
$('#hiddenDate').datepicker({
numberOfMonths: 2,
minDate: 0,
dateFormat: "dd M",
onSelect: function (dateText) {
$(this).css("color", "#333333");
$('#datetext').text(dateText);
}
});
$('#pickDate').click(function (e) {
e.preventDefault();
$('#hiddenDate').datepicker('show');

});
$(function() {
$( "#datepicker-6" ).datepicker({
showOn:"button",
buttonImage: "images/b2b-images/common/calendar_icon.png",
buttonImageOnly: true
});
});

$(document).ready(function () {
$('#viewmore').on('click', function (e) {
$("#viewless").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text('- View Less');
}else{
$(this).text(' + View More');
}
});
});
$(document).ready(function () {
$('#portmore').on('click', function (e) {
$("#portless").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text('- View Less');
}else{
$(this).text(' + View More');
}
});
});
$(document).ready(function () {
$('#productmore').on('click', function (e) {
$("#productless").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text('- View Less');
}else{
$(this).text(' + View More');
}
});
});
$(document).ready(function () {
$('#overviewmore').on('click', function (e) {
$("#overviewless").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text('- Read Less');
}else{
$(this).text(' + Read More');
}
});
});
$(document).ready(function () {
$('#productmore1').on('click', function (e) {
$("#productless1").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text('- View Less');
}else{
$(this).text(' + View More');
}
});
});

$(document).ready(function () {
$('#viewlist').on('click', function (e) {
$("#viewmap").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text('View Map');
$("#viewmap").show("slow");
$("#viewmaphide").hide("slow");
}else{
$(this).text('View List');
$("#viewmaphide").show("slow");
$("#viewmap").hide("slow");
}

});
});
$(document).ready(function () {
$('#viewfaq').on('click', function (e) {
$("#faqdetails").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text('Pickup Service: FAQs');
}else{
$(this).text('Pickup Service: FAQs');
}
});
});


function showRoomschange(){
	rooms = document.getElementById("roomCount").value;
	for(i=2;i<=3;i++){
		document.getElementById("rooms" + i).innerHTML = '';	
	}
	if(rooms > 1)
	{
		for(r=2;r<=rooms;r++)
		{
			document.getElementById("rooms" + r).innerHTML = '<ul class="row mB10 mT15 clearfix"><li class="col_2">&nbsp;</li><li class="col_2 pR0"> <span class="mT30 fL">Room ' + r + ':</span></li><li class="col_2 pL0"><label>Adult</label><div class="passengerNum4 fL"><span onclick="adultCount_Decrease1(\'hAdult1_' + r + '\')" class="control addMinControl minusControl">-</span><span class="control innerTxtControl" id="hAdult1_' + r + '">1</span><span onclick="adultCount_Increase1(\'hAdult1_' + r + '\')" class="control addMinControl plusControl">+</span></div><input type="text" class="w100pcnt dN" maxlength="3" value="1"><span class="fS11 fL w100pcnt">12+ yrs</span></li><li class="col_2 pL0"><label>Children</label><div class="passengerNum5 fL"> <span onclick="childCount_Decrease1(\'hChild1_' + r + '\'),rem_Child1(' + r + ')" class="control addMinControl minusControl">-</span> <span class="control innerTxtControl" id="hChild1_' + r + '">0</span> <span onclick="childCount_Increase1(\'hChild1_' + r + '\'),add_Child1(' + r + ')" class="control addMinControl plusControl">+</span> </div><input type="text" class="w100pcnt dN" maxlength="3" value="0"><span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li><li class="col_4 mB10"><ul><li class="col_6 mB10 pR0" id="child' + r + '1"></li><li class="col_6 mB10 pR0" id="child' + r + '2"></li><li class="col_6 mB10 pR0" id="child' + r + '3"></li><li class="col_6 mB10 pR0" id="child' + r + '4"></li><li class="col_6 mB10 pR0" id="child' + r + '5"></li><li class="col_6 mB10 pR0" id="child' + r + '6"></li><li class="col_6 mB10 pR0" id="child' + r + '7"></li><li class="col_6 mB10 pR0" id="child' + r + '8"></li><li class="col_6 mB10 pR0" id="child' + r + '9"></li></ul></li></ul>';
		}
	}
}
 
 var adult_Count = 1;
var child_Count = 0;

function adultCount_Increase1(id,cntr){
	adult_Count = document.getElementById(id).innerHTML;
	if(adult_Count < 9){
		adult_Count++;
		document.getElementById(id).innerHTML = adult_Count;
	}
}
function adultCount_Decrease1(id,cntr){
	adult_Count = document.getElementById(id).innerHTML;
	if(adult_Count > 1){
		adult_Count--;
		document.getElementById(id).innerHTML = adult_Count;
	}
	
}

function childCount_Increase1(id,cntr){
	child_Count = document.getElementById(id).innerHTML;
	if(child_Count < 9){
		child_Count++;
		document.getElementById(id).innerHTML = child_Count;
	}
}
function childCount_Decrease1(id,cntr){
	child_Count = document.getElementById(id).innerHTML;
	if(child_Count > 0){
		child_Count--;
		document.getElementById(id).innerHTML = child_Count;
	}
}

function add_Child1(s){
	document.getElementById("child" + s + "" + child_Count).innerHTML = '<label>Child ' + child_Count + '</label><select><option value="Age">Age</option><option value="1">1</option><option value="2">2</option><option value="3">3</option></select>';
	document.getElementById("child" + s + "" + child_Count).className = "col_6 mB10 pR0";
	$("select").change(function () {
		$(this).addClass("defaultTextColor");
	});
}

function rem_Child1(s){
	document.getElementById("child" + s + "" + (child_Count+1)).innerHTML = '';
	document.getElementById("child" + s + "" + (child_Count+1)).className = "col_6 pR0";
}
 
 


var roomsAdded = 1;
function showCabins(){
rooms = document.getElementById("noOfRooms").value;
if(rooms < roomsAdded){
document.getElementById("room" + roomsAdded).innerHTML = '';
roomsAdded--;
}
else{
rAdd = rooms - roomsAdded;
for(r=1;r<=rAdd;r++)
{
document.getElementById("room" + (roomsAdded+1)).innerHTML = '<ul class="row mB10 mT15 clearfix"><li class="col_2">&nbsp;</li><li class="col_2 pR0"> <span class="mT30 fL">Cabin ' + (roomsAdded+1) + ':</span></li><li class="col_2 pL0"><label>Adult</label><div class="passengerNum4 fL"><span onclick="adultCountDec(\'hAdult_' + (roomsAdded+1) + '\')" class="control addMinControl minusControl">-</span><span class="control innerTxtControl" id="hAdult_' + (roomsAdded+1) + '">1</span><span onclick="adultCountInc(\'hAdult_' + (roomsAdded+1) + '\')" class="control addMinControl plusControl">+</span></div><input type="text" class="w100pcnt dN" maxlength="3" value="1"><span class="fS11 fL w100pcnt">12+ yrs</span></li><li class="col_2 pL0"><label>Children</label><div class="passengerNum5 fL"> <span onclick="childCountDec(\'hChild_' + (roomsAdded+1) + '\')" class="control addMinControl minusControl">-</span> <span class="control innerTxtControl" id="hChild_' + (roomsAdded+1) + '">0</span> <span onclick="childCountInc(\'hChild_' + (roomsAdded+1) + '\')" class="control addMinControl plusControl">+</span> </div><input type="text" class="w100pcnt dN" maxlength="3" value="0"><span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_2"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_3"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_4"></li><li class="col_4 mB10"><ul><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_1"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_2"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_3"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_4"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_5"></li><li class="col_6 pR0" id="child' + r + '_6"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_7"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_8"></li><li class="col_6 pR0" id="child' + (roomsAdded+1) + '_9"></li></ul></li></ul>';
roomsAdded++;
}
}

}


$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper         = $(".input_traveller_wrap"); //Fields wrapper
var add_button      = $(".add_traveller_button"); //Add button ID
var id1=0;
var id2=13
var x1=1; //initlal text box count
var x2=0
$(add_button).click(function(e){ //on add input button click
e.preventDefault();
if(x2 < max_fields){ //max input box allowed
x2++; //text box increment
id1=1+x2;
if(x1<max_fields)
x1++;
id2=13+x1;{
e.preventDefault();
$(wrapper).append('<li class="col_6 mT5 pL0 pR10"><label>Traveller '+id1+'</label><ul class="col_10 mB10 pL20 clearfix"><li class="col_4 pL0 pR10"><select class="pD0"><option value="dd.">dd</option></select></li><li class=" col_4 pL0 pR10"><select class="pD0"><option value="mm">mm</option></select></li><li class="col_4 pL0 pR10"><select><option value="yyyy">yyyy</option></select></li></ul><br/><a href="javascript:void(0);" class="col_2 fR remove_field"><span class="popup_close_icon mB10"></span></a></li>'); //add input box
}
}
if($().datepicker){
$( "#datepicker13, #datepicker14, #datepicker15, #datepicker16, #datepicker17, #datepicker18, #datepicker19, #datepicker20, #datepicker21, #datepicker22, #datepicker23, #datepicker24, #datepicker25, #datepicker26" ).datepicker({
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
});
$(document).ready(function () {
$('#chatview').on('click', function (e) {
$("#chatdetails").slideToggle("slow");
$("#calldetails").hide();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text('Chat');
}else{
$(this).text('Chat');
}
});
});
$(document).ready(function () {
$('#callview').on('click', function (e) {
$("#calldetails").slideToggle("slow");
$("#chatdetails").hide();
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text('Call Us');
}else{
$(this).text('Call Us');
}
});
});

$(document).ready(function() {
//Select and deselect all checkboxes
$("#checkAllCountries").click(function () {
$('.chkCountries').prop('checked', this.checked);
});

//If one item deselect then checkbox 'checkAll' is UnCheck
//If all items select individually then checkbox 'checkAll' is Check
$(".chkCountries").click(function () {
$("#checkAllCountries").prop('checked', ($('.chk:checked').length == $('.chkCountries').length) ? true : false);
});
});

$(document).ready(function() {
//Select and deselect all checkboxes
$("#checkAllCoverage").click(function () {
$('.chkCoverage').prop('checked', this.checked);
});

//If one item deselect then checkbox 'checkAll' is UnCheck
//If all items select individually then checkbox 'checkAll' is Check
$(".chkCoverage").click(function () {
$("#checkAllCoverage").prop('checked', ($('.chk:checked').length == $('.chkCoverage').length) ? true : false);
});
});

function worldtravel(tab, contr){
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
$(document).ready(function () {
$('#visa1view').on('click', function (e) {
$("#visa1details").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text('- View Less');
}else{
$(this).text('+ View More');
}
});
});
$(document).ready(function () {
$('#visa2view').on('click', function (e) {
$("#visa2details").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text('- View Less');
}else{
$(this).text('+ View More');
}
});
});
function showbrowse(id)
{
$('#file'+id).click();
}
function policy(tab, contr){
for(i=1; i<=2; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==3){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}


$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addfieldsreserv1"); //Fields wrapper
var add_button1      = $("#addfieldreservbtn1"); //Add button ID
var id1=15;
var id2=16;
var x1= 1;
var x2= 2;	//initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=15+x1;
id2=16+x2;
$(wrapper1).append('<ul class="mB20 clearfix mT10"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;x2--;id1--;id2--;
})
});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addfieldsreserv7"); //Fields wrapper
var add_button1      = $("#addfieldreservbtn7"); //Add button ID
var id1=15;
var id2=16;
var x1= 1;
var x2= 2;	//initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=15+x1;
id2=16+x2;
$(wrapper1).append('<ul class="mB20 clearfix mT10 "><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;x2--;id1--;id2--;
})
});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addfieldsreserv2"); //Fields wrapper
var add_button1      = $("#addfieldreservbtn2"); //Add button ID
var id1=25;
var id2=26;
var x1= 1;
var x2= 2;	//initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=25+x1;
id2=26+x2;
$(wrapper1).append('<ul class="mB20 clearfix mT10 "><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;x2--;id2--;
})
});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addfieldsreserv3"); //Fields wrapper
var add_button1      = $("#addfieldreservbtn3"); //Add button ID
var id1=35;
var id2=36;
var x1= 1;
var x2= 2;	//initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=35+x1;
id2=36+x2;
$(wrapper1).append('<ul class="mB20 clearfix mT10 "><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;x2--;id2--;
})
});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addfieldsreserv4"); //Fields wrapper
var add_button1      = $("#addfieldreservbtn4"); //Add button ID
var id1=45;
var id2=46;
var x1= 1;
var x2= 2;	//initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=45+x1;
id2=46+x2;
$(wrapper1).append('<ul class="mB20 clearfix mT10 "><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;x2--;id2--;
})
});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addfieldsreserv5"); //Fields wrapper
var add_button1      = $("#addfieldreservbtn5"); //Add button ID
var id1=55;
var id2=56;
var x1= 1;
var x2= 2;	//initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=55+x1;
id2=56+x2;
$(wrapper1).append('<ul class="mB20 clearfix mT10 "><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;x2--;id2--;
})
});

$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addfieldsreserv6"); //Fields wrapper
var add_button1      = $("#addfieldreservbtn6"); //Add button ID
var id1=65;
var id2=66;
var x1= 1;
var x2= 2;	//initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=65+x1;
id2=66+x2;
$(wrapper1).append('<ul class="mB20 clearfix mT10 "><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;x2--;id2--;
})
});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addfieldsreserv8"); //Fields wrapper
var add_button1      = $("#addfieldreservbtn8"); //Add button ID
var id1=65;
var id2=66;
var x1= 1;
var x2= 2;	//initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=65+x1;
id2=66+x2;
$(wrapper1).append('<ul class="mB20 clearfix mT10 mL15"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;x2--;id2--;
})
});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addfieldsreserv9"); //Fields wrapper
var add_button1      = $("#addfieldreservbtn9"); //Add button ID
var id1=65;
var id2=66;
var x1= 1;
var x2= 2;	//initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=65+x1;
id2=66+x2;
$(wrapper1).append('<ul class="mB20 clearfix mT10 mL15"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;x2--;id2--;
})
});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addfieldsreserv10"); //Fields wrapper
var add_button1      = $("#addfieldreservbtn10"); //Add button ID
var id1=65;
var id2=66;
var x1= 1;
var x2= 2;	//initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=65+x1;
id2=66+x2;
$(wrapper1).append('<ul class="mB20 clearfix mT10 mL15"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;x2--;id2--;
})
});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addfieldsreserv11"); //Fields wrapper
var add_button1      = $("#addfieldreservbtn11"); //Add button ID
var id1=65;
var id2=66;
var x1= 1;
var x2= 2;	//initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=65+x1;
id2=66+x2;
$(wrapper1).append('<ul class="mB20 clearfix mT10 mL15"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;x2--;id2--;
})
});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper1         = $("#addfieldsreserv12"); //Fields wrapper
var add_button1      = $("#addfieldreservbtn12"); //Add button ID
var id1=65;
var id2=66;
var x1= 1;
var x2= 2;	//initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields){ //max input box allowed
x1++; //text box increment
id1=65+x1;
id2=66+x2;
$(wrapper1).append('<ul class="mB20 clearfix mT10 mL15"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});

$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;x2--;id2--;
})
});



$(document).ready(function(){
$("#GroupBooking1,#GroupBooking2,#GroupBooking3").click(function(){
     $('.blink').addClass('bkgLitBlu').delay(800).queue(function(next){
         $(this).removeClass('bkgLitBlu');
         next();
    });
 });
$('.myckeckbox').change(function(){
if(this.checked)
$('.datep').fadeIn('fast');
else
$('.datep').fadeOut('fast');

});
});
function flight_hotel_way1(tabid, contrid){
for(i=3; i<=4; i++){
document.getElementById('flight_hotel_way'+i).className = '';
document.getElementById('flight_hotel_wayContr'+i).style.display = 'none'
if(i==3){
document.getElementById('flight_hotel_way'+i).className = 'first';
}
if(i==4){
document.getElementById('flight_hotel_way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'flight_hotel_way3'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'flight_hotel_way5'){
document.getElementById(tabid).className = 'last sel';
}
}
$('.myckeckbox1').click( function() {
var isChecked = this.checked;

if(isChecked) {
$(this).parents("ul:eq(0)").find(".dateshow").prop("disabled",false);

} else {
$(this).parents("ul:eq(0)").find(".dateshow").prop("disabled",true);
}

});


$('.myckeckbox2').click( function() {
var isChecked = this.checked;

if(isChecked) {
$(this).parents("ul:eq(0)").find(".showdate").prop("disabled",false);


} else {
$(this).parents("ul:eq(0)").find(".showdate").prop("disabled",true);
}

});
function showRoom(){
rooms = document.getElementById("roomCount").value;
for(i=2;i<=3;i++){
document.getElementById("rooms" + i).innerHTML = '';
}
if(rooms > 1)
{
for(r=2;r<=rooms;r++)
{
document.getElementById("rooms" + r).innerHTML = '<ul class="row mB10 mT15 clearfix"><li class="col_2">&nbsp;</li><li class="col_2 pR0"> <span class="mT30 fL">Room ' + r + ':</span></li><li class="col_2 pL0"><label>Adult</label><div class="passengerNum4 fL"><span onclick="adultCountDec(\'hAdult_' + r + '\')" class="control addMinControl minusControl">-</span><span class="control innerTxtControl" id="hAdult_' + r + '">1</span><span onclick="adultCountInc(\'hAdult_' + r + '\')" class="control addMinControl plusControl">+</span></div><input type="text" class="w100pcnt dN" maxlength="3" value="1"><span class="fS11 fL w100pcnt">12+ yrs</span></li><li class="col_2 pL0"><label>Children</label><div class="passengerNum5 fL"> <span onclick="childCountDec(\'hChild_' + r + '\'),remChild(' + r + ')" class="control addMinControl minusControl">-</span> <span class="control innerTxtControl" id="hChild_' + r + '">0</span> <span onclick="childCountInc(\'hChild_' + r + '\'),addChild(' + r + ')" class="control addMinControl plusControl">+</span> </div><input type="text" class="w100pcnt dN" maxlength="3" value="0"><span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li><li class="col_4 mB10"><ul><li class="col_6 mB10 pR0" id="child' + r + '_1"></li><li class="col_6 mB10 pR0" id="child' + r + '_2"></li><li class="col_6 mB10 pR0" id="child' + r + '_3"></li><li class="col_6 mB10 pR0" id="child' + r + '_4"></li><li class="col_6 mB10 pR0" id="child' + r + '_5"></li><li class="col_6 mB10 pR0" id="child' + r + '_6"></li><li class="col_6 mB10 pR0" id="child' + r + '_7"></li><li class="col_6 mB10 pR0" id="child' + r + '_8"></li><li class="col_6 mB10 pR0" id="child' + r + '_9"></li></ul></li></ul>';
}
}
}
function show_Rooms(){
rooms = document.getElementById("room_Count").value;
for(i=2;i<=3;i++){
document.getElementById("room_id" + i).innerHTML = '';
}
if(rooms > 1)
{
for(r=2;r<=rooms;r++)
{
document.getElementById("room_id" + r).innerHTML = '<ul class="row mB10 mT15 clearfix"><li class="col_2">&nbsp;</li><li class="col_2 pR0"> <span class="mT30 fL">Room ' + r + ':</span></li><li class="col_1_half col_2_sm pR0 pL0"><label>Adult</label><div class="passengerNum4 fL"><span onclick="adultCountDec(\'hAdult_' + r + '\')" class="control addMinControl minusControl">-</span><span class="control innerTxtControl" id="hAdult_' + r + '">1</span><span onclick="adultCountInc(\'hAdult_' + r + '\')" class="control addMinControl plusControl">+</span></div><input type="text" class="w100pcnt dN" maxlength="3" value="1"><span class="fS11 fL w100pcnt">12+ yrs</span></li><li class="col_1_half col_2_sm pR0 pL0"><label>Children</label><div class="passengerNum5 fL"> <span onclick="childCountDec(\'hChild_' + r + '\'),remChild(' + r + ')" class="control addMinControl minusControl">-</span> <span class="control innerTxtControl" id="hChild_' + r + '">0</span> <span onclick="childCountInc(\'hChild_' + r + '\'),addChild(' + r + ')" class="control addMinControl plusControl">+</span> </div><input type="text" class="w100pcnt dN" maxlength="3" value="0"><span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li><li class="col_4 pL0 pR0 mB10"><ul><li class="col_6 mB10 pR0" id="child' + r + '_1"></li><li class="col_6 mB10 pR0" id="child' + r + '_2"></li><li class="col_6 mB10 pR0" id="child' + r + '_3"></li><li class="col_6 mB10 pR0" id="child' + r + '_4"></li><li class="col_6 mB10 pR0" id="child' + r + '_5"></li><li class="col_6 mB10 pR0" id="child' + r + '_6"></li><li class="col_6 mB10 pR0" id="child' + r + '_7"></li><li class="col_6 mB10 pR0" id="child' + r + '_8"></li><li class="col_6 mB10 pR0" id="child' + r + '_9"></li></ul></li></ul>';
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
document.getElementById("child" + s + "_" + child_Count).innerHTML = '<label>Child ' + child_Count + '</label><select class="pL0 pR5"><option value="Age">Age</option><option value="1">1</option><option value="2">2</option><option value="3">3</option></select>';
document.getElementById("child" + s + "_" + child_Count).className = "col_2 col_4_sm mB10 pR0";
$("select").change(function () {
$(this).addClass("defaultTextColor");
});
}
function remChild(s){
document.getElementById("child" + s + "_" + (child_Count+1)).innerHTML = '';
document.getElementById("child" + s + "_" + (child_Count+1)).className = "col_6 pR0";
}

function chkGroupDetails(i){
if(document.getElementById('GroupBooking' + i).checked == true){
$("#gBookingContr" + i).show();
$("#searchBtn").hide();
$("#searchBtn1").hide();
$("#sendReq").show();
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
$("#searchBtn").show();
$("#searchBtn1").show();
$("#sendReq").hide();
}
}


var adult_Count = 1;
var child_Count = 0;

function adultCountIncrease(id,cntr){
adult_Count = document.getElementById(id).innerHTML;
if(adult_Count < 9){
adult_Count++;
document.getElementById(id).innerHTML = adult_Count;
}
}
function adultCountDecrease(id,cntr){
adult_Count = document.getElementById(id).innerHTML;
if(adult_Count > 1){
adult_Count--;
document.getElementById(id).innerHTML = adult_Count;
}
}

function childCountIncrease(id,cntr){
child_Count = document.getElementById(id).innerHTML;
if(child_Count < 9){
child_Count++;
document.getElementById(id).innerHTML = child_Count;
}
}
function childCountDecrease(id,cntr){
child_Count = document.getElementById(id).innerHTML;
if(child_Count > 0){
child_Count--;
document.getElementById(id).innerHTML = child_Count;
}
}

function addChild1(s){
document.getElementById("child" + s + "" + child_Count).innerHTML = '<label>Child ' + child_Count + '</label><select class="pL0 pR0"><option value="Age">Age</option><option value="1">1</option><option value="2">2</option><option value="3">3</option></select>';
document.getElementById("child" + s + "" + child_Count).className = "col_4 mB10 pR0";
$("select").change(function () {
$(this).addClass("defaultTextColor");
});
}


function infantCountIncrease(id,cntr){
infant_Count = document.getElementById(id).innerHTML;
if(infant_Count < 9){
infant_Count++;
document.getElementById(id).innerHTML = infant_Count;
}
}
function infantCountDecrease(id,cntr){
infant_Count = document.getElementById(id).innerHTML;
if(infant_Count > 0){
infant_Count--;
document.getElementById(id).innerHTML = infant_Count;
}
}
function addInfant1(s){
document.getElementById("infant" + s + "" + infant_Count).innerHTML = '<label>Infant ' + infant_Count + '</label><select class="pL0 pR0"><option value="Age">Age</option><option value="1">1</option><option value="2">2</option><option value="3">3</option></select>';
document.getElementById("infant" + s + "" + infant_Count).className = "col_4 mB10 pR0";
$("select").change(function () {
$(this).addClass("defaultTextColor");
});
}

$(document).ready(function () {
$('.regprofile').on('click', function (e) {
$(this).next('.regprofileContr').slideToggle();
$('.ProfileInfoCntr').hide();
$('.AgntInfoCntr').hide();
$('.KycInfoCntr').hide();
$('.PayInfoCntr').hide();
$('.PayInfo').removeClass('active');
$('.PayInfo').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.AgntInfo').removeClass('active');
$('.AgntInfo').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.KycInfo').removeClass('active');
$('.KycInfo').find('img').attr('src','images/b2b-images/collapse_blu.png');
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});
$(document).ready(function() {
if( $('#myTable').length){
 
    $('#myTable')
        .dataTable( {
		 "order": [],
		     searching: false,
        "columnDefs": [ {
          "targets": 'no-sort',
          "orderable": false,
    } ]
} );
}
} );

function remChild1(s){
document.getElementById("child" + s + "" + (child_Count+1)).innerHTML = '';
document.getElementById("child" + s + "" + (child_Count+1)).className = "col_6 pR0";
}

function remInfant1(s){
document.getElementById("infant" + s + "" + (infant_Count+1)).innerHTML = '';
document.getElementById("infant" + s + "" + (infant_Count+1)).className = "col_6 pR0";
}

function changeroom(tab, contr){
for(i=1; i<=8; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==8){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}

function overview(tab, contr){
for(i=9; i<=13; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==13){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}

function innertabs(tab, contr){
for(i=14; i<=17; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==17){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}

function innertabs1(tab, contr){
for(i=18; i<=21; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==21){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}

function innertabs2(tab, contr){
for(i=22; i<=25; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==25){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}

function changerooms(tab, contr){
for(i=1; i<=7; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==7){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}

function changerooms(tab, contr){
for(i=8; i<=10; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==10){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}

function changeroomstab(tab, contr){
for(i=1; i<=7; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==7){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}
function CHANGEROOM(tab, contr){
for(i=8; i<=14; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==14){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}


function CHANGECARROOM(tab, contr){
for(i=15; i<=21; i++){
document.getElementById('noticeTab'+i).className = 'lftTxt';
document.getElementById('noticeContr'+i).style.display = 'none';
if(i==15){
document.getElementById('noticeTab'+i).className = 'last lftTxt';
}
}
document.getElementById(tab).className = 'sel lftTxt';
document.getElementById(contr).style.display = 'block'
}

$(document).ready(function () {
$('.cruise_detail2').on('click', function (e) {
$('.cruise_detailCntr2').slideToggle("fast");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});
$(document).ready(function () {
$('.cruise_detail3').on('click', function (e) {
$('.cruise_detailCntr3').slideToggle("fast");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});
$(document).ready(function () {
$('.cruise_detail4').on('click', function (e) {
$('.cruise_detailCntr4').slideToggle("fast");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});
$(document).ready(function () {
$('.cruise_detail5').on('click', function (e) {
$('.cruise_detailCntr5').slideToggle("fast");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
});
});


$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper         = $("#addfieldsshop"); //Fields wrapper
var add_button      = $("#addfieldbtnshop"); //Add button ID
var id=23
var x = 1; //initlal text box count
$(add_button).click(function(e){ //on add input button click
e.preventDefault();
if(x < max_fields){ //max input box allowed
x++; //text box increment
$(wrapper).append('<ul class="mT20 clearfix"> <li class="col_3 pL0 mR10"><label>Starting From</label><input type="text" id="mwPassFrom" value="London" name="start" class="w100pcnt" /></li> <li class="col_3 mR10"><label>Going To</label><input type="text" id="mwPassTo" value="Paris" class="w100pcnt" /></li> <li class="col_3 mR10"><label>Departure</label><input id="datepicker'+(x+id)+'" class="w100pcnt dateField" type="text" value="DD/MM/YYYY" readonly /></li> <li class="col_2 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li> </ul>'); //add input box
id++;
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

$(wrapper).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x--;id--;
})
});

$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper         = $(".add_city_index1"); //Fields wrapper
var add_button      = $(".add_city_button_index1"); //Add button ID

var x1=1; //initial text box count
var x2=21;
var x3=38;
var x4=51;
var x5=1;
var x6=1;
var id1=0;
var id2=1;
var id3=1;
var id4=1;
var id5=0;
var id6=0;
$(add_button).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields || x2 < max_fields || x3 < max_fields || x4 < max_fields || x5 < max_fields ||  x6 < max_fields){ //max input box allowed
x1++; //text box increment
x2++;
x3++;
x4++;
x5++;
x6++;
id1=1+x1;
id2=2+x2;
id3=1+x3;
id4=1+x4;
id5=0+x5;
id6=0+x6;
$(wrapper).append('<ul class="mB10 clearfix"><li class="col_8  pR0 pL0"><label class="mT10">Flight '+id1+':</label><div class="pR10 gray_border fL  w50pcnt"><input type="text" class=" w100pcnt" name="searchterm" placeholder="From" id="mwFlight1From" /><input type="image" class="fromDestination mR20 " name="search" alt="Search" title="Search" src="images/b2b-images/destination_from.png" /></div><div class="pR10 gray_border fL w50pcnt"><input type="text" class=" w100pcnt" name="searchterm" placeholder="To" id="mwFlight1To" /><input type="image" class="toDestination mR20" name="search" alt="Search" title="Search" src="images/b2b-images/destination_to.png" /></div></li><li class="col_3  pL0 "><label class="mT10"> Departure </label><input id="datepicker'+id2+'" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /></li><li class="fR mL20 mT45 remove_field" ><span class="popup_close_icon"></span></li><li class="col_4 pL0 mT20"><input type="checkbox"  id="mycheckbox'+id5+'" onclick="showhoteldate('+id5+')" /><label  class=" w100pcnt">Need hotel in Delhi</label></li><li class="col_4 mT10 pL0  datep'+id6+'" style="display:none;" ><label>Check-in</label><input id="datepicker'+id3+'" class="w90pcnt dateField " type="text" placeholder="DD/MM/YYYY" readonly  /></li><li class="col_3 pL0 mT10 datep'+id6+'" style="display:none;"><label>Check-out</label><input id="datepicker'+id4+'" class="w100pcnt dateField " type="text" placeholder="DD/MM/YYYY" readonly  /></li></ul>'); //add input box

}

if($().datepicker){
$( "#datepicker21,#datepicker22, #datepicker23, #datepicker24, #datepicker25, #datepicker26, #datepicker27, #datepicker28, #datepicker29, #datepicker30, #datepicker31, #datepicker32, #datepicker33, #datepicker34, #datepicker35, #datepicker36, #datepicker37, #datepicker38, #datepicker39, #datepicker40, #datepicker41, #datepicker42, #datepicker43, #datepicker44, #datepicker44, #datepicker45, #datepicker46, #datepicker47, #datepicker48, #datepicker49, #datepicker50, #datepicker51, #datepicker52, #datepicker53, #datepicker54, #datepicker55, #datepicker56, #datepicker57, #datepicker58, #datepicker59, #datepicker60, #datepicker61, #datepicker62, #datepicker63" ).datepicker({
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
e.preventDefault(); $(this).parent('ul').remove();
})

});
$(document).ready(function() {
var max_fields      = 10; //maximum input boxes allowed
var wrapper         = $(".add_city_index2"); //Fields wrapper
var add_button      = $(".add_city_button_index2"); //Add button ID

var x1=1; //initial text box count
var x2=21;
var x3=38;
var x4=51;
var x5=1;
var x6=1;
var id1=0;
var id2=1;
var id3=1;
var id4=1;
var id5=0;
var id6=0;
$(add_button).click(function(e){ //on add input button click
e.preventDefault();
if(x1 < max_fields || x2 < max_fields || x3 < max_fields || x4 < max_fields || x5 < max_fields ||  x6 < max_fields){ //max input box allowed
x1++; //text box increment
x2++;
x3++;
x4++;
x5++;
x6++;
id1=1+x1;
id2=2+x2;
id3=1+x3;
id4=1+x4;
id5=0+x5;
id6=0+x6;
$(wrapper).append('<ul class="mB10 clearfix"><li class="col_8  pR0 pL0"><label class="mT10">Flight '+id1+':</label><div class="pR10 gray_border fL  w50pcnt"><input type="text" class=" w100pcnt" name="searchterm" placeholder="From" id="mwFlight1From" /><input type="image" class="fromDestination mR20 " name="search" alt="Search" title="Search" src="images/b2b-images/destination_from.png" /></div><div class="pR10 gray_border fL w50pcnt"><input type="text" class=" w100pcnt" name="searchterm" placeholder="To" id="mwFlight1To" /><input type="image" class="toDestination mR20" name="search" alt="Search" title="Search" src="images/b2b-images/destination_to.png" /></div></li><li class="col_3  pL0 "><label class="mT10"> Departure </label><input id="datepicker'+id2+'" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /></li><li class="fR mL20 mT45 remove_field" ><span class="popup_close_icon"></span></li><li class="col_4 pL0 mT20"><input type="checkbox"  id="mycheckbox'+id5+'" onclick="showhoteldate('+id5+')" /><label  class=" w100pcnt">Need hotel in Delhi</label></li><li class="col_4 mT10 pL0  datep'+id6+'" style="display:none;" ><label>Check-in</label><input id="datepicker'+id3+'" class="w90pcnt dateField " type="text" placeholder="DD/MM/YYYY" readonly  /></li><li class="col_3 pL0 mT10 datep'+id6+'" style="display:none;"><label>Check-out</label><input id="datepicker'+id4+'" class="w100pcnt dateField " type="text" placeholder="DD/MM/YYYY" readonly  /></li></ul>'); //add input box

}
if($().datepicker){
$( "#datepicker21,#datepicker22, #datepicker23, #datepicker24, #datepicker25, #datepicker26, #datepicker27, #datepicker28, #datepicker29, #datepicker30, #datepicker31, #datepicker32, #datepicker33, #datepicker34, #datepicker35, #datepicker36, #datepicker37, #datepicker38, #datepicker39, #datepicker40, #datepicker41, #datepicker42, #datepicker43, #datepicker44, #datepicker44, #datepicker45, #datepicker46, #datepicker47, #datepicker48, #datepicker49, #datepicker50, #datepicker51, #datepicker52, #datepicker53, #datepicker54, #datepicker55, #datepicker56, #datepicker57, #datepicker58, #datepicker59, #datepicker60, #datepicker61, #datepicker62, #datepicker63" ).datepicker({
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
e.preventDefault(); $(this).parent('ul').remove();
})

});
$('.remove_field_default').on("click", function(e){ //user click on remove text

$('.flight1').remove();
});
function showhoteldate(id)
{
if(document.getElementById("mycheckbox"+id).checked)
$('.datep'+id).show();
else
$('.datep'+id).hide();
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
if($().jcarousel){
$('#mycarousel').jcarousel({
auto: 5,
start: 1,
scroll:1,
wrap: 'last',
initCallback: mycarousel_initCallback
});

$('#mycarousel1, #mycarousel2, #mycarousel3').jcarousel({
scroll: 1
});

$('#hotel_detail_carousel').jcarousel({
start: 1,
scroll:1,
});

$('#hotel_deals_carousel').jcarousel({
scroll:4
});
$('#cruise_detail_carousel').jcarousel({
start: 1,
scroll:1,
});
$('#eurail_ticket_carousel').jcarousel({
start: 1,
scroll:1,
});

}

var leg = 1;
leg1Added = leg2Added = leg3Added = leg4Added = 0;
function selectMultiflighthotel(flightLeg){
document.getElementById('btmTop').style.display = 'block';
if(flightLeg == 1){
document.getElementById("selectFlightLeg1").innerHTML = '<span class="wayNum sel mR10" id="multiWayTop1">1</span>BOM - DEL, 25 Sep‘14 <br/><samp class="go_AI mT15"><span>&nbsp;</span></samp><dfn>05.30 – 06.35 <br/>non stop<br/>Indigo 6E 198<br/><a href="javascript:void(0);"  class="fL fW600">Change Flight</a><span class="fR mR40 plus">+</span></dfn><br class="cB"><img src="images/b2b-images/hotel3_thumb.png" alt="" class="fL mT10"/><dfn class="mL15"><a href="javascript:void(0);" class="fW600">Adarsh Hamilton</a><br/>Deluxe  room<br/><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><br/><div class="mR30 mT5"> <span class="mR5"><img alt="Trip Advisor" src="images/b2b-images/ta_logo.jpg"></span> <span class="rating_ct_full_icon"></span> <span class="rating_ct_full_icon"></span> <span class="rating_ct_full_icon"></span> <span class="rating_ct_full_icon"></span> <span class="rating_ct_no_icon"></span> </div><a href="javascript:void(0);" class="fW600">Change Hotel</a></dfn>';
leg1Added = 1;
}
if(flightLeg == 2){
document.getElementById("selectFlightLeg2").innerHTML = '<span class="wayNum sel mR10" id="multiWayTop2">2</span>BOM - DEL, 25 Sep‘14 <br/><samp class="go_AI mT15"><span>&nbsp;</span></samp><dfn>05.30 – 06.35 <br/>non stop<br/>Indigo 6E 198<br/><a href="javascript:void(0);"  class="fL fW600">Change Flight</a><span class="fR mR40 plus">+</span></dfn><br class="cB"><img src="images/b2b-images/hotel3_thumb.png" alt="" class="fL mT10"/><dfn class="mL15"><a href="javascript:void(0);" class="fW600">Adarsh Hamilton</a><br/>Deluxe  room<br/><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><br/><div class="mR30 mT5"> <span class="mR5"><img alt="Trip Advisor" src="images/b2b-images/ta_logo.jpg"></span> <span class="rating_ct_full_icon"></span> <span class="rating_ct_full_icon"></span> <span class="rating_ct_full_icon"></span> <span class="rating_ct_full_icon"></span> <span class="rating_ct_no_icon"></span> </div><a href="javascript:void(0);" class="fW600">Change Hotel</a></dfn>';
leg2Added = 1;

}
if(flightLeg == 3){
document.getElementById("selectFlightLeg3").innerHTML = '<span class="wayNum sel mR10" id="multiWayTop3">3</span>BOM - DEL, 25 Sep‘14 <br/><samp class="go_AI mT15"><span>&nbsp;</span></samp><dfn>05.30 – 06.35 <br/>non stop<br/>Indigo 6E 198<br/><a href="javascript:void(0);"  class="fL fW600">Change Flight</a><span class="fR mR40 plus">+</span></dfn><br class="cB"><img src="images/b2b-images/hotel3_thumb.png" alt="" class="fL mT10"/><dfn class="mL15"><a href="javascript:void(0);" class="fW600">Adarsh Hamilton</a><br/>Deluxe  room<br/><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><br/><div class="mR30 mT5"> <span class="mR5"><img alt="Trip Advisor" src="images/b2b-images/ta_logo.jpg"></span> <span class="rating_ct_full_icon"></span> <span class="rating_ct_full_icon"></span> <span class="rating_ct_full_icon"></span> <span class="rating_ct_full_icon"></span> <span class="rating_ct_no_icon"></span> </div><a href="javascript:void(0);" class="fW600">Change Hotel</a></dfn>';
leg3Added = 1;

}
if(flightLeg == 4){
document.getElementById("selectFlightLeg4").innerHTML = '<span class="wayNum sel mR10" id="multiWayTop4">4</span>BOM - DEL, 25 Sep‘14 <br/><samp class="go_AI mT15"><span>&nbsp;</span></samp><dfn>05.30 – 06.35 <br/>non stop<br/>Indigo 6E 198<br/><a href="javascript:void(0);"  class="fL fW600">Change Flight</a></dfn><br class="cB"><br/><img src="images/b2b-images/hotel3_thumb.png" alt="" class="fL mT"/><dfn class="mL15"><a href="javascript:void(0);" class="fW600">Adarsh Hamilton</a><br/>Deluxe  room<br/><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><span class="rating_star_full_icon"></span><br/><div class="mR30 mT5"> <span class="mR5"><img alt="Trip Advisor" src="images/b2b-images/ta_logo.jpg"></span> <span class="rating_ct_full_icon"></span> <span class="rating_ct_full_icon"></span> <span class="rating_ct_full_icon"></span> <span class="rating_ct_full_icon"></span> <span class="rating_ct_no_icon"></span> </div><a href="javascript:void(0);" class="fW600">Change Hotel</a></dfn>';
leg4Added = 1;

}
};

$(document).ready(function() {
$('.cancelservice1').click(function(){

$(".addServicesContr").addClass("dN")
$("#servicesContainer1,#servicesContainer2,#servicesContainer3").hide();
$()
$("#services1,#services2,#services3").removeClass("sel")
$("#addServiceBtn1 ").addClass('primaryBtn');
$("#addServiceBtn1 ").removeClass('disableBtn');

});
$('.cancelservice2').click(function(){

$(".addServicesContr").addClass("dN")
$("#servicesContainer1,#servicesContainer2,#servicesContainer3").hide();
$("#services1,#services2,#services3").removeClass("sel");
$("#addServiceBtn2 ").addClass('primaryBtn');
$("#addServiceBtn2 ").removeClass('disableBtn');

});
$('.cancelservice3').click(function(){

$(".addServicesContr").addClass("dN")
$("#servicesContainer1,#servicesContainer2,#servicesContainer3").hide();
$("#services1,#services2,#services3").removeClass("sel");
$("#addServiceBtn3 ").addClass('primaryBtn');
$("#addServiceBtn3 ").removeClass('disableBtn');

});
});

function step5(curHrdr, nextHrdr, curContr, nextContr){
$("#"+curHrdr).removeClass('active noImg');
$("#"+nextHrdr).addClass('active').removeClass('noImg');
$("#"+curContr).hide('slow');
$("#"+nextContr).show('slow');
$('html,body').animate({
scrollTop: $(".payVisa").offset().top - 100},
'slow');
document.getElementById(curHrdr).onclick = fn_step5;
}

function fn_step5(){
$("#header5").addClass('active');
$("#header6").removeClass('active');
$("#step5").slideDown('slow');
$("#step6").slideUp('slow');

$("#header5").siblings("header.header").removeClass("active");
$("#header5").next(".accordion .contContainer").slideDown("slow").siblings(".accordion .contContainer:visible").slideUp("slow");

}
//Images change on thumbnail Carousel click
function showImageCruises(imgName) {
var curImage = document.getElementById('currentImage1');
var thePath = 'images/b2b-images/';
var theSource = thePath + imgName;

curImage.src = theSource;
curImage.alt = imgName;
curImage.title = imgName;
}

if($().jcarousel){

$('#cruise_detail_carousel').jcarousel({
start: 1,
scroll:1,
});

}
if($().calendario)
{
var cal = $( '#calendar_oneway' ).calendario( {
onDayClick : function( $el, $contentEl, dateProperties ) {
for( var key in dateProperties ) {
console.log( key + ' = ' + dateProperties[ key ] );
}
},
caldata : codropsEvents
} ),
$month = $( '#custom-month-oneway' ).html( cal.getMonthName() ),
$year = $( '#custom-year-oneway' ).html( cal.getYear() );
$( '#custom-next-oneway' ).on( 'click', function() {
cal.gotoNextMonth( updateMonthYear );
} );
$( '#custom-prev-oneway' ).on( 'click', function() {
cal.gotoPreviousMonth( updateMonthYear );
} );
$( '#custom-current-oneway' ).on( 'click', function() {
cal.gotoNow( updateMonthYear );
} );
function updateMonthYear() {
$month.html( cal.getMonthName() );
$year.html( cal.getYear() );
}
}

if($().calendario)
{
var cal = $( '#calendar_oneway1' ).calendario( {
onDayClick : function( $el, $contentEl, dateProperties ) {
for( var key in dateProperties ) {
console.log( key + ' = ' + dateProperties[ key ] );
}
},
caldata : codropsEvents
} ),
$month = $( '#custom-month-oneway1' ).html( cal.getMonthName() ),
$year = $( '#custom-year-oneway1' ).html( cal.getYear() );
$( '#custom-next-oneway1' ).on( 'click', function() {
cal.gotoNextMonth( updateMonthYear );
} );
$( '#custom-prev-oneway1' ).on( 'click', function() {
cal.gotoPreviousMonth( updateMonthYear );
} );
$( '#custom-current-oneway1' ).on( 'click', function() {
cal.gotoNow( updateMonthYear );
} );
function updateMonthYear() {
$month.html( cal.getMonthName() );
$year.html( cal.getYear() );
}
}

if($().calendario)
{
var cal = $( '#calendar_oneway2' ).calendario( {
onDayClick : function( $el, $contentEl, dateProperties ) {
for( var key in dateProperties ) {
console.log( key + ' = ' + dateProperties[ key ] );
}
},
caldata : codropsEvents
} ),
$month = $( '#custom-month-oneway2' ).html( cal.getMonthName() ),
$year = $( '#custom-year-oneway2' ).html( cal.getYear() );
$( '#custom-next-oneway2' ).on( 'click', function() {
cal.gotoNextMonth( updateMonthYear );
} );
$( '#custom-prev-oneway2' ).on( 'click', function() {
cal.gotoPreviousMonth( updateMonthYear );
} );
$( '#custom-current-oneway2' ).on( 'click', function() {
cal.gotoNow( updateMonthYear );
} );
function updateMonthYear() {
$month.html( cal.getMonthName() );
$year.html( cal.getYear() );
}
}

if($().calendario)
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
	}
	
	
	if($().calendario)
{
var cal = $( '#calendar_oneway3' ).calendario( {
onDayClick : function( $el, $contentEl, dateProperties ) {
for( var key in dateProperties ) {
console.log( key + ' = ' + dateProperties[ key ] );
}
},
caldata : codropsEvents
} ),
$month = $( '#custom-month-oneway3' ).html( cal.getMonthName() ),
$year = $( '#custom-year-oneway3' ).html( cal.getYear() );
$( '#custom-next-oneway3' ).on( 'click', function() {
cal.gotoNextMonth( updateMonthYear );
} );
$( '#custom-prev-oneway3' ).on( 'click', function() {
cal.gotoPreviousMonth( updateMonthYear );
} );
$( '#custom-current-oneway3' ).on( 'click', function() {
cal.gotoNow( updateMonthYear );
} );
function updateMonthYear() {
$month.html( cal.getMonthName() );
$year.html( cal.getYear() );
}
}

	

$(document).ready(function(){
$('#speclReq').change(function(){
if(this.checked){
$('#speclReqText').show();
}
else{
$('#speclReqText').hide();
}
});
});
$(document).ready(function(){
$('#speclReq1').change(function(){
if(this.checked){
$('#speclReqText1').show();
$('#speclReqText1').show();
}
else{
$('#speclReqText1').hide();
$('#speclReqText1').hide();
}

});
});
$(document).ready(function(){
$('.baggage2').change(function(){
if(this.checked){
$('.priceshow1').show();
}
else{
$('.priceshow1').hide();
}
});
});
$(document).ready(function(){
$('.passport').change(function(){
if(this.checked){
$('.passinfo').hide();
}
else{
$('.passinfo').show();
}
});
});

$(document).ready(function(){
$('.visasubmit').change(function(){
if(this.checked){
$('.confirm').show();
}
else{
$('.confirm').hide();
}
});
});

$(document).ready(function(){
$('.view').change(function(){
if(this.checked){
$('.priceshow2').show();
}
else{
$('.priceshow2').hide();
}

});
});
$(document).ready(function(){
$('.editflyer1Btn').click(function(){
$('.flyerAir').hide();
$('.flyerAirfield').show();
$('.flyernum').hide();
$('.flyernumfield').show();
$('.editflyer1Btn').hide();
$('.finishflyer1Btn').show();

});
$('.deleteflyer1Btn').click(function(){
$('#addedFlyer1').html('');

});

$('.finishflyer1Btn').click(function(){
$('.flyerAir').show();
$('.flyerAirfield').hide();
$('.flyernum').show();
$('.flyernumfield').hide();
$('.editflyer1Btn').show();
$('.finishflyer1Btn').hide();

});
});
function selectFlight1(flightNo,path){
	if(path == "arrival"){
		document.getElementById('flightArrival' + flightNo).className = 'clearfix posR brdrBLitGry sel';
		document.getElementById('btmTop').style.display = 'block';
		
		if(document.getElementById('selectContainer2').innerHTML == ''){
			document.getElementById("addRFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '18,418';
		}
		else{
			document.getElementById("addRFlight").style.display = "none";
			document.getElementById('compPrice').innerHTML = '37,780';
		}
			
		document.getElementById('selectContainer1').innerHTML = '<div class="mB10 clearfix"><span class="fW600">BOM – DEL</span> , <span>25 Sep 2014</span></div><div class="col_4 pR0 pL0"><div><img src="images/b2b-images/indigo_vsmllogo_sqr.png" alt="IndiGo logo" /></div><div class="fS12"><span>IndiGo</span> <br /><span>6E 198</span> </div></div><div class="col_8 pR0 pL0 mTN5"><div class="fS12 mB5">05:30 - 06:35</div><div class="fS12">1h 5m | Non stop</div></div>';
		document.getElementById("addSFlight").style.display = "none";
	}
	
	if(path == "return"){
		document.getElementById('flightDeparture' + flightNo).className = 'clearfix posR brdrBLitGry sel';
		document.getElementById('btmTop').style.display = 'block';
		
		if(document.getElementById('selectContainer1').innerHTML == ""){
			document.getElementById("addSFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '18,418';
		}
		else{
			document.getElementById("addSFlight").style.display = "none";
			document.getElementById('compPrice').innerHTML = '2,418';
		}
			
		document.getElementById('selectContainer2').innerHTML = '<div class="mB10 clearfix"><span class="fW600">DEL – BOM</span> , <span>27 Sep 2014</span></div><div class="col_4 pR0 pL0"><div><img src="images/b2b-images/spiceJet_vsmllogo_sqr.png" alt="Spice Jet logo" /></div><div class="fS12"><span>Spice Jet</span><br /><span>SG 153</span></div></div><div class="col_8 pR0 pL0 mTN5"><div class="fS12 mB5">05:30 - 06:35</div><div class="fS12">1h 5m | Non stop</div></div>';
		document.getElementById("addRFlight").style.display = "none";
	}
	if((document.getElementById('selectContainer1').innerHTML != '') && (document.getElementById('selectContainer2').innerHTML != ''))
		document.getElementById("selectBooking").style.display = "block";
	else	
		document.getElementById("selectBooking").style.display = "none";
}

//Function for multiway carousel
function showtooltipWorking(parentId, tooltipId, evt)
{
	$("#" + tooltipId).toggle();
	
	var parentElementHeight = $("#" + parentId).height();
	var parentElementWidth = $("#" + parentId).width();
	
	  var left =  ($("#" + parentId).offset().left) - parentElementWidth + 'px';
	  var top =  ($("#" + parentId).offset().top) - parentElementHeight+ -180 + 'px';
	
	   
	if(navigator.sayswho == 'Firefox 11'){
		
		   var x = document.getElementById(tooltipId);
			
		    x.style.top = ($("#" + parentId).offset().top) + parentElementHeight+ -120 + 'px';
			x.style.left = (evt.clientX - parentElementWidth) +'px';
		
	}
		
	
	else{
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
	
	 //Give the tooltip a higher z-index incase it is on an overlay
   if( $('.black_overlay').is(":visible")){
	     $("#" + tooltipId).css(
			  {
				   'z-index': 1060
			  }
		   );
	   }
}
function disable() {
    document.getElementById("My_Select").disabled=true;
}
function enable() {
    document.getElementById("My_Select").disabled=false;
}
function switchVisible() {
            if (document.getElementById('My_Select')) {

                if (document.getElementById('My_Select').style.display == 'none') {
                    document.getElementById('My_Select').style.display = 'block';
                    document.getElementById('text1').style.display = 'none';
                }
                else {
                    document.getElementById('My_Select').style.display = 'none';
                    document.getElementById('text1').style.display = 'block';
                }
            }
}

function switchVisible() {
            if (document.getElementById('My_Select21')) {

                if (document.getElementById('My_Select21').style.display == 'none') {
                    document.getElementById('My_Select21').style.display = 'block';
                    document.getElementById('text3').style.display = 'none';
                }
                else {
                    document.getElementById('My_Select21').style.display = 'none';
                    document.getElementById('text3').style.display = 'block';
                }
            }
}
function switchVisible22() {
            if (document.getElementById('My_Select22')) {

                if (document.getElementById('My_Select22').style.display == 'none') {
                    document.getElementById('My_Select22').style.display = 'block';
                    document.getElementById('text7').style.display = 'none';
                }
                else {
                    document.getElementById('My_Select22').style.display = 'none';
                    document.getElementById('text7').style.display = 'block';
                }
            }
}
function switchVisible23() {
            if (document.getElementById('My_Select23')) {

                if (document.getElementById('My_Select23').style.display == 'none') {
                    document.getElementById('My_Select23').style.display = 'block';
                    document.getElementById('text15').style.display = 'none';
                }
                else {
                    document.getElementById('My_Select23').style.display = 'none';
                    document.getElementById('text15').style.display = 'block';
                }
            }
}
function switchVisible1() {
            if (document.getElementById('My_Select1')) {

                if (document.getElementById('My_Select1').style.display == 'none') {
                    document.getElementById('My_Select1').style.display = 'block';
                    document.getElementById('text2').style.display = 'none';
                }
                else {
                    document.getElementById('My_Select1').style.display = 'none';
                    document.getElementById('text2').style.display = 'block';
                }
            }
}


function disable() {
    document.getElementById("My_Select1").disabled=true;
}
function editable() {
    document.getElementById("My_Select1").disabled=false;
}

function disable() {
    document.getElementById("myselect1").disabled=true;
}
function enable1() {
    document.getElementById("myselect1").disabled=false;
}

function disable() {
    document.getElementById("myselect11").disabled=true;
}
function editable1() {
    document.getElementById("myselect11").disabled=false;
}
function selectFlight11(flightNo,path){
	if(path == "arrival"){
		document.getElementById('flightArrival' + flightNo).className = 'clearfix posR brdrBLitGry sel';
		document.getElementById('btmTop').style.display = 'block';
		
		if(document.getElementById('selectContainer2').innerHTML == ''){
			document.getElementById("addRFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '18,418';
		}
		else{
			document.getElementById("addRFlight").style.display = "none";
			document.getElementById('compPrice').innerHTML = '37,780';
		}
			
		document.getElementById('selectContainer1').innerHTML = '<div class="mB10 clearfix"><span class="fW600">MUM<span class="oneway_icon valign"></span>GOA</span> , <span>25 Sep 2014</span></div><div class="col_4 pR0 pL0"><div><span class="diy_bus_icon"></span></div><div class="fS12"><span>Neeta Tours &amp; Travels</span> <br /> </div></div><div class="col_8 pR0 pL0 mTN5"><div class="fS12 mB5">05:30 - 06:35(1h 35mins)</div><div class="fS12">Seat No. - 43, 42</div></div>';
		document.getElementById("addSFlight").style.display = "none";
	}
	
	if(path == "return"){
		document.getElementById('flightDeparture' + flightNo).className = 'clearfix posR brdrBLitGry sel';
		document.getElementById('btmTop').style.display = 'block';
		
		if(document.getElementById('selectContainer1').innerHTML == ""){
			document.getElementById("addSFlight").style.display = "block";
			document.getElementById('compPrice').innerHTML = '18,418';
		}
		else{
			document.getElementById("addSFlight").style.display = "none";
			document.getElementById('compPrice').innerHTML = '2,418';
		}
			
		document.getElementById('selectContainer2').innerHTML = '<div class="mB10 clearfix"><span class="fW600">GOA<span class="oneway_icon valign"></span>MUM</span> , <span>28 Sep 2014</span></div><div class="col_4 pR0 pL0"><div><span class="diy_bus_icon"></span></div><div class="fS12"><span>Neeta Tours &amp; Travels</span> <br /> </div></div><div class="col_8 pR0 pL0 mTN5"><div class="fS12 mB5">05:30 - 06:35(1h 35mins)</div><div class="fS12">Seat No. - 43, 42</div></div>';
		document.getElementById("addRFlight").style.display = "none";
	}
	if((document.getElementById('selectContainer1').innerHTML != '') && (document.getElementById('selectContainer2').innerHTML != ''))
		document.getElementById("selectBooking").style.display = "block";
	else	
		document.getElementById("selectBooking").style.display = "none";
}

function addcar(tabid, contrid){
	for(i=9; i<=12; i++){
		document.getElementById('way'+i).className = '';
		document.getElementById('wayContr'+i).style.display = 'none'
		if(i==9){
			document.getElementById('way'+i).className = 'first';	
		}
		if(i==12){
			document.getElementById('way'+i).className = 'last';	
		}
	}
	document.getElementById(tabid).className = 'sel';
	document.getElementById(contrid).style.display = 'block'
	if(tabid == 'way9'){
			document.getElementById(tabid).className = 'first sel';	
		}
		if(tabid == 'way12'){
			document.getElementById(tabid).className = 'last sel';	
		}
}
function addcar2(tabid, contrid){
	for(i=21; i<=23; i++){
		document.getElementById('way'+i).className = '';
		document.getElementById('wayContr'+i).style.display = 'none'
		if(i==21){
			document.getElementById('way'+i).className = 'first';	
		}
		if(i==23){
			document.getElementById('way'+i).className = 'last';	
		}
	}
	document.getElementById(tabid).className = 'sel';
	document.getElementById(contrid).style.display = 'block'
	if(tabid == 'way21'){
			document.getElementById(tabid).className = 'first sel';	
		}
		if(tabid == 'way23'){
			document.getElementById(tabid).className = 'last sel';	
		}
}
function addcar1(tabid, contrid){
	for(i=9; i<=11; i++){
		document.getElementById('way'+i).className = '';
		document.getElementById('wayContr'+i).style.display = 'none'
		if(i==9){
			document.getElementById('way'+i).className = 'first';	
		}
		if(i==11){
			document.getElementById('way'+i).className = 'last';	
		}
	}
	document.getElementById(tabid).className = 'sel';
	document.getElementById(contrid).style.display = 'block'
	if(tabid == 'way9'){
			document.getElementById(tabid).className = 'first sel';	
		}
		if(tabid == 'way11'){
			document.getElementById(tabid).className = 'last sel';	
		}
}


function addflighthotelcar(tabid, contrid){
	for(i=41; i<=44; i++){
		document.getElementById('way'+i).className = '';
		document.getElementById('wayContr'+i).style.display = 'none'
		if(i==41){
			document.getElementById('way'+i).className = 'first';	
		}
		if(i==44){
			document.getElementById('way'+i).className = 'last';	
		}
	}
	document.getElementById(tabid).className = 'sel';
	document.getElementById(contrid).style.display = 'block'
	if(tabid == 'way41'){
			document.getElementById(tabid).className = 'first sel';	
		}
		if(tabid == 'way44'){
			document.getElementById(tabid).className = 'last sel';	
		}
}

function addhotel(tabid, contrid){
for(i=9; i<=10; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==9){
document.getElementById('way'+i).className = 'first';
}
if(i==10){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way9'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way10'){
document.getElementById(tabid).className = 'last sel';
}
}

$('#oneWayOnward2').on('click', function (e) {
		$("#oneWayOnwardFare2").show();
		$("#oneWayReturnFare2").hide();
		$(this).addClass("sel");
		$("#oneWayReturn2").removeClass("sel");
	});
	
	$('#oneWayReturn2').on('click', function (e) {
		$("#oneWayOnwardFare2").hide();
		$("#oneWayReturnFare2").show();
		$(this).addClass("sel");
		$("#oneWayOnward2").removeClass("sel");
	});
	
function addcruise(tabid, contrid){
for(i=3; i<=4; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==3){
document.getElementById('way'+i).className = 'first';
}
if(i==4){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way3'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way4'){
document.getElementById(tabid).className = 'last sel';
}
}

function changecruise(tabid, contrid){
for(i=1; i<=2; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==1){
document.getElementById('way'+i).className = 'first';
}
if(i==2){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way1'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way2'){
document.getElementById(tabid).className = 'last sel';
}
}




function ADDHOTEL(tabid, contrid){
for(i=11; i<=12; i++){
document.getElementById('way'+i).className = '';
document.getElementById('wayContr'+i).style.display = 'none'
if(i==11){
document.getElementById('way'+i).className = 'first';
}
if(i==12){
document.getElementById('way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'way11'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'way12'){
document.getElementById(tabid).className = 'last sel';
}
}
var addedRoomType = 1
function show_SelectedRooms(selectedRoomValue){
	
    if($("#room_Shortlist" + selectedRoomValue).val() > 0)
	{
		document.getElementById("roomSelect2").style.display = "block";
		liElem = document.getElementById("shortlistedRoom" + addedRoomType); // id of each li
		liElem.innerHTML = '<div class="clearfix pL0 searchedResult" id="addedRoom' + selectedRoomValue + '"><div class="fL mR10 mB5"> <img alt="Hotel Thumb" src="images/b2b-images/hotel6_thumb.jpg"> </div><div class="fL"><div class="fcWht">' + document.getElementById("roomType" + selectedRoomValue).innerHTML  + '</div><div class="fcWht fS11">Radisson Blu Dwarka</div><div class="fcWht fS11">Standard Double<br> Room with breakfast</div></div></div>';
		
		var ulElem = document.getElementById("mycarousel3")
		ulElem.appendChild(liElem);
		addedRoomType++;
		
	 }
	 
	 else  if($("#room_Shortlist" + selectedRoomValue).val() == 0){
		 document.getElementById("addedRoom" + selectedRoomValue).remove();
		 addedRoomType--;
		 }
	 
	 
		
}
var addedRoomType = 1
function show_SelectedRooms(selectedRoomValue){
	
    if($("#room_Shortlist" + selectedRoomValue).val() > 0)
	{
		document.getElementById("room_Select").style.display = "block";
		liElem = document.getElementById("shortlistedRoom" + addedRoomType); // id of each li
		liElem.innerHTML = '<div class="clearfix pL0 searchedResult" id="addedRoom' + selectedRoomValue + '"><div class="fL mR10 mB5"> <img alt="Hotel Thumb" src="images/b2b-images/hotel6_thumb.jpg"> </div><div class="fL"><div class="fcWht">' + document.getElementById("roomType" + selectedRoomValue).innerHTML  + '</div><div class="fcWht fS11">Radisson Blu Dwarka</div><div class="fcWht fS11">Standard Double<br> Room with breakfast</div></div></div>';
		
		var ulElem = document.getElementById("mycarousel3")
		ulElem.appendChild(liElem);
		addedRoomType++;
		
	 }
	 
	 else  if($("#room_Shortlist" + selectedRoomValue).val() == 0){
		 document.getElementById("addedRoom" + selectedRoomValue).remove();
		 addedRoomType--;
		 }
	 
	 
		
}
$(document).ready(function () {
	$('.modSrcBtn1').on('click', function (e) {
		
		$(".contentPanel1").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/b2b-images/down-arrow-grey.png');		   
		}else{
			$(this).find('img').attr('src','images/b2b-images/right-arrow-grey.png');
		}
	});	
});

$(document).ready(function () {
	$('#eurailview3').on('click', function (e) {
		$("#euraildetails3").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).text('- View Details');	   
		}else{
			$(this).text(' + View Details');
		}
	});	
});


              $(document).ready(function() {
               
				   $('#next').click(function(){
					 $('#myTable_next').trigger('click');
					  $('#myTable .closeCtr').remove();
					   $('.expandCtr a').html('<img src="images/b2b-images/collapse_blu.png" alt="Arrow" class="mR5 fL mT5">');
				});
                $('#previous').click(function(){
					 $('#myTable_previous').trigger('click');
					  $('#myTable .closeCtr').remove();
					   $('.expandCtr a').html('<img src="images/b2b-images/collapse_blu.png" alt="Arrow" class="mR5 fL mT5">');
				});
                $('.sortclick').click(function(){
				 $('#myTable .closeCtr').remove();
					   $('.expandCtr a').html('<img src="images/b2b-images/collapse_blu.png" alt="Arrow" class="mR5 fL mT5">');
				
				});
                $('#bookingtestBtn').click(function(){
					   $('#bookingtestBtn').toggleClass('active');
					   if( $('#bookingtestBtn').hasClass('active'))
					   {
					    $('#bookingtestBtn a').html('<img src="images/b2b-images/expand_blu.png" alt="Arrow" class="mR5 fL mT5">');
					 $('#bookingtest').after($('#bookingtestCtr').html());
					 $('#bookingtest').addClass('altRow');
					 
					 }
					 else
					 {
					  $('#myTable #adddetaillist').remove();
					   $('#bookingtestBtn a').html('<img src="images/b2b-images/collapse_blu.png" alt="Arrow" class="mR5 fL mT5">');
					   $('#bookingtest').removeClass('altRow');
					  }
				});
                $('#bookingtestBtn1').click(function(){
					   $('#bookingtestBtn1').toggleClass('active');
					   if( $('#bookingtestBtn1').hasClass('active'))
					   {
					    $('#bookingtestBtn1 a').html('<img src="images/b2b-images/expand_blu.png" alt="Arrow" class="mR5 fL mT5">');
					 $('#bookingtest1').after($('#bookingtestCtr1').html());
					 $('#bookingtest1').addClass('altRow');
					 
					 }
					 else
					 {
					  $('#myTable #adddetaillist1').remove();
					   $('#bookingtestBtn1 a').html('<img src="images/b2b-images/collapse_blu.png" alt="Arrow" class="mR5 fL mT5">');
					    $('#bookingtest1').removeClass('altRow');
					  }
				});
				});

$(document).ready(function () {
	$('#hotelOpt3').on('click', function (e) {
		$("#hotelContr3").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src','images/b2b-images/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
		}
	});	
});

function addFLIGHT1(tabid, contrid){
	for(i=57; i<=59; i++){
		document.getElementById('way'+i).className = '';
		document.getElementById('wayContr'+i).style.display = 'none'
		if(i==57){
			document.getElementById('way'+i).className = 'first';	
		}
		if(i==59){
			document.getElementById('way'+i).className = 'last';	
		}
	}
	document.getElementById(tabid).className = 'sel';
	document.getElementById(contrid).style.display = 'block'
	if(tabid == 'way57'){
			document.getElementById(tabid).className = 'first sel';	
		}
		if(tabid == 'way59'){
			document.getElementById(tabid).className = 'last sel';	
		}
}


$('#oneWayOnward11').on('click', function (e) {
		$("#oneWayOnwardFare11").show();
		$("#oneWayReturnFare11").hide();
		$(this).addClass("sel");
		$("#oneWayReturn11").removeClass("sel");
	});
	
	$('#oneWayReturn11').on('click', function (e) {
		$("#oneWayOnwardFare11").hide();
		$("#oneWayReturnFare11").show();
		$(this).addClass("sel");
		$("#oneWayOnward11").removeClass("sel");
	});
	
function Show_Btn(Btn_id) {
            if (false == $(Btn_id).is(':visible')) {
                $(Btn_id).show(0);
            }
            else {
                $(Btn_id).hide(0);
            }
        }

$('.changeroomselect').hide();

$('#dropDown').change(function () {
    $('.changeroomselect').hide();
    $('#roomSelect').show();
    $('#' + this.value).show();
});



var leg = 1;
leg1Added = leg2Added = leg3Added = leg4Added = leg5Added = 0;

function selectMultiEurail(flightLeg){
document.getElementById('btmTop').style.display = 'block';
if(flightLeg == 1){
document.getElementById("selectFlightLeg1").innerHTML = '<span class="wayNum sel  mR10 fL" id="multiWayBtm1">1</span><span class="cB"><span class="fW600">London</span><span class="oneway_icon valign"></span> <span class="fW600">Paris</span><br/><samp class=" w10pcnt  noImg"><img class="mL20" src="images/b2b-images/rail1.jpg" alt=""  /><br/><span class="pT0 mL20">Eurostar 9002</span></samp><dfn><span class="mL50">25th Sep 14</span> <br/><span class="mL50">$ 300</span><div class=" fs20 mTn20 fR"><b>+</b></div></dfn>';
leg1Added = 1;
}
if(flightLeg == 2){
document.getElementById("selectFlightLeg2").innerHTML = '<span class="wayNum sel  mR10 fL" id="multiWayBtm1">2</span><span class="cB"><span class="fW600">Paris</span><span class="oneway_icon valign"></span> <span class="fW600">Frankfurt</span><br/><samp class=" w10pcnt  noImg"><img class="mL20" src="images/b2b-images/rail1.jpg" alt=""  /><br/><span class="pT0 mL20">Eurostar 9002</span></samp><dfn><span class="mL50">25th Sep 14</span> <br/><span class="mL50">$ 300</span><div class=" fs20 mTn20 fR"><b>+</b></div></dfn>';
leg2Added = 1;
}
if(flightLeg == 3){
document.getElementById("selectFlightLeg3").innerHTML = '<span class="wayNum sel  mR10 fL" id="multiWayBtm1">3</span><span class="cB"><span class="fW600">Frankfurt</span><span class="oneway_icon valign"></span> <span class="fW600">Zurich</span><br/><samp class=" w10pcnt  noImg"><img class="mL20" src="images/b2b-images/rail1.jpg" alt=""  /><br/><span class="pT0 mL20">Eurostar 9002</span></samp><dfn><span class="mL50">25th Sep 14</span> <br/><span class="mL50">$ 300</span><div class=" fs20 mTn20 fR"><b>+</b></div></dfn>';
leg3Added = 1;


}
if(flightLeg == 4){
document.getElementById("selectFlightLeg4").innerHTML = '<span class="wayNum sel  mR10 fL" id="multiWayBtm1">4</span><span class="cB"><span class="fW600">London</span><span class="oneway_icon valign"></span> <span class="fW600">Paris</span><br/><samp class=" w10pcnt  noImg"><img class="mL20" src="images/b2b-images/rail1.jpg" alt=""  /><br/><span class="pT0 mL20">Eurostar 9002</span></samp><dfn><span class="mL50">25th Sep 14</span> <br/><span class="mL50">$ 300</span></dfn>';
leg4Added = 1;
popupwin('addleg5pop','addleg5popinner', 'fade');

}
if(flightLeg == 6){
document.getElementById("selectFlightLeg4").innerHTML = '<samp class="mT5 mR10 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <br/><span class="pT0">Eurostar 9002</span></samp><dfn><span class="wayNum sel  mR10 fL" id="multiWayBtm1">4</span><span class="cB"><span class="fW600">London</span><span class="oneway_icon valign"></span> <span class="fW600">Paris</span><br/><span class="mL15">25th Sep 14</span> <br/><span class="mL15">$ 300</span><div class="  fS30 mTn15 mRn  fR"><b>+</b></div></dfn>';
leg4Added = 1;

}
if(flightLeg == 5){
document.getElementById("selectFlightLeg5").innerHTML = '<samp class="mT5 mR10 w10pcnt noImg"><img src="images/b2b-images/rail1.jpg" alt=""  /> <br/><span class="pT0">Eurostar 9002</span></samp><dfn><span class="wayNum sel  mR10 fL" id="multiWayBtm1">5</span><span class="cB"><span class="fW600">Frankfurt</span><span class="oneway_icon valign"></span> <span class="fW600">Zurich</span><br/><span class="mL15">25th Sep 14</span> <br/><span class="mL15">$ 300</span><div class="  fS30 mTn15 mRn  fR"><b>+</b></div></dfn>';
leg5Added = 1;
}
}


$('#selector').change(function () {
  document.getElementById('display').style.display = 'block';
    document.getElementById('display1').style.display = 'none';
});

$(document).ready(function () {
$('#viewlist1').on('click', function (e) {
$("#viewmap1").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text('View Map');
$("#viewmap1").show("slow");
$("#viewmaphide1").hide("slow");
}else{
$(this).text('View List');
$("#viewmaphide1").show("slow");
$("#viewmap1").hide("slow");
}

});
});
$(document).ready(function () {
$('#viewlist_1').on('click', function (e) {
$("#viewmap_1").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text('View Map');
$("#viewmap_1").show("slow");
$("#viewmaphide_1").hide("slow");
}else{
$(this).text('View Directions');
$("#viewmaphide_1").show("slow");
$("#viewmap_1").hide("slow");
}

});
});
$(document).ready(function () {
$('#viewfaq1').on('click', function (e) {
$("#faqdetails1").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).text('Pickup Service: FAQs');
}else{
$(this).text('Pickup Service: FAQs');
}
});
});

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
$('.semiflexi').change(function(){
if(this.checked){
$('.semiflexishow').show();
$('.semiflexihide').hide();
}
else{
$('.semiflexishow').hide();
$('.semiflexihide').show();
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
			string +='<li class="col_3 pL0 mT10 clearfix"> <label >Child '+i+'</label> <select class="mB10 " id="child_age1" ><option value="null">Age</option><option value="0">0</option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option><option value="9">9</option><option value="10">10</option><option value="11">11</option><option value="12">12</option></select> </li>';
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


$(document).ready(function () {
$('.Civitavecchia').on('click', function (e) {
$('.CivitavecchiaCntr').slideToggle('slow');
$('.laspeziaCntr').hide('slow');
$('.cannesCntr').hide('slow');
$('.palmaCntr').hide('slow');
$('.barcelonaCntr').hide('slow');
$('.laspezia').removeClass('active');
$('.laspezia').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.cannes').removeClass('active');
$('.cannes').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.palma').removeClass('active');
$('.palma').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.barcelona').removeClass('active');
$('.barcelona').find('img').attr('src','images/b2b-images/collapse_blu.png');

$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $("#header1").offset().top - 100},
'slow');
});
});
$(document).ready(function () {
$('.laspezia').on('click', function (e) {
$('.laspeziaCntr').slideToggle('slow');
$('.CivitavecchiaCntr').hide('slow');
$('.cannesCntr').hide('slow');
$('.palmaCntr').hide('slow');
$('.barcelonaCntr').hide('slow');
$('.Civitavecchia').removeClass('active');
$('.Civitavecchia').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.cannes').removeClass('active');
$('.cannes').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.palma').removeClass('active');
$('.palma').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.barcelona').removeClass('active');
$('.barcelona').find('img').attr('src','images/b2b-images/collapse_blu.png');

$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $("#header1").offset().top - 100},
'slow');
});
});
$(document).ready(function () {
$('.cannes').on('click', function (e) {
$('.cannesCntr').slideToggle('slow');
$('.laspeziaCntr').hide('slow');
$('.CivitavecchiaCntr').hide('slow');
$('.palmaCntr').hide('slow');
$('.barcelonaCntr').hide('slow');
$('.Civitavecchia').removeClass('active');
$('.Civitavecchia').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.laspezia').removeClass('active');
$('.laspezia').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.palma').removeClass('active');
$('.palma').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.barcelona').removeClass('active');
$('.barcelona').find('img').attr('src','images/b2b-images/collapse_blu.png');

$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $("#header1").offset().top - 100},
'slow');
});
});
$(document).ready(function () {
$('.palma').on('click', function (e) {
$('.palmaCntr').slideToggle('slow');
$('.laspeziaCntr').hide('slow');
$('.cannesCntr').hide('slow');
$('.CivitavecchiaCntr').hide('slow');
$('.barcelonaCntr').hide('slow');
$('.Civitavecchia').removeClass('active');
$('.Civitavecchia').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.laspezia').removeClass('active');
$('.laspezia').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.cannes').removeClass('active');
$('.cannes').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.barcelona').removeClass('active');
$('.barcelona').find('img').attr('src','images/b2b-images/collapse_blu.png');

$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $("#header1").offset().top - 100},
'slow');
});
});
$(document).ready(function () {
$('.barcelona').on('click', function (e) {
$('.barcelonaCntr').slideToggle('slow');
$('.laspeziaCntr').hide('slow');
$('.cannesCntr').hide('slow');
$('.palmaCntr').hide('slow');
$('.CivitavecchiaCntr').hide('slow');
$('.Civitavecchia').removeClass('active');
$('.Civitavecchia').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.laspezia').removeClass('active');
$('.laspezia').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.cannes').removeClass('active');
$('.cannes').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.palma').removeClass('active');
$('.palma').find('img').attr('src','images/b2b-images/collapse_blu.png');

$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $("#header1").offset().top - 100},
'slow');
});
});

function step6(curHrdr, nextHrdr, curContr, nextContr){
$("#"+curHrdr).removeClass('active noImg');
$("#"+nextHrdr).addClass('active').removeClass('noImg');
$("#"+curContr).hide('slow');
$("#"+nextContr).show('slow');
$('html,body').animate({
scrollTop: $(".Civitavecchia").offset().top - 100},
'slow');
document.getElementById(curHrdr).onclick = fn_step6;
}

function fn_step6(){
$("#header6").addClass('active');
$("#header7").removeClass('active');
$("#step6").slideDown('slow');
$("#step7").slideUp('slow');

$("#header6").siblings("header.header").removeClass("active");
$("#header6").next(".accordion .contContainer").slideDown("slow").siblings(".accordion .contContainer:visible").slideUp("slow");

}
$(document).ready(function () {
$('.bikeTour').on('click', function (e) {
$('.bikeTourCntr').slideToggle('slow');
$('.absoluteCntr').hide('slow');
$('.angelsDemonsCntr').hide('slow');
$('.walkingTourCntr').hide('slow');
$('.granTourCntr').hide('slow');
$('.vaticanCntr').hide('slow');
$('.baroqueCntr').hide('slow');
$('.granTourCntr').hide('slow');
$('.yourOwnCntr').hide('slow');
$('.absolute').removeClass('active');
$('.absolute').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.angelsDemons').removeClass('active');
$('.angelsDemons').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.walkingTour').removeClass('active');
$('.walkingTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.granTour').removeClass('active');
$('.granTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.vatican').removeClass('active');
$('.vatican').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.baroque').removeClass('active');
$('.baroque').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.yourOwn').removeClass('active');
$('.yourOwn').find('img').attr('src','images/b2b-images/collapse_blu.png');

$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $("#header1").offset().top - 100},
'slow');
});
});
$(document).ready(function () {
$('.absolute').on('click', function (e) {
$('.absoluteCntr').slideToggle('slow');
$('.bikeTourCntr').hide('slow');
$('.angelsDemonsCntr').hide('slow');
$('.walkingTourCntr').hide('slow');
$('.granTourCntr').hide('slow');
$('.vaticanCntr').hide('slow');
$('.baroqueCntr').hide('slow');
$('.granTourCntr').hide('slow');
$('.yourOwnCntr').hide('slow');
$('.bikeTour').removeClass('active');
$('.bikeTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.angelsDemons').removeClass('active');
$('.angelsDemons').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.walkingTour').removeClass('active');
$('.walkingTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.granTour').removeClass('active');
$('.granTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.vatican').removeClass('active');
$('.vatican').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.baroque').removeClass('active');
$('.baroque').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.yourOwn').removeClass('active');
$('.yourOwn').find('img').attr('src','images/b2b-images/collapse_blu.png');

$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $("#header1").offset().top - 100},
'slow');
});
});
$(document).ready(function () {
$('.angelsDemons').on('click', function (e) {
$('.angelsDemonsCntr').slideToggle('slow');
$('.absoluteCntr').hide('slow');
$('.bikeTourCntr').hide('slow');
$('.walkingTourCntr').hide('slow');
$('.granTourCntr').hide('slow');
$('.vaticanCntr').hide('slow');
$('.baroqueCntr').hide('slow');
$('.granTourCntr').hide('slow');
$('.yourOwnCntr').hide('slow');
$('.absolute').removeClass('active');
$('.absolute').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.bikeTour').removeClass('active');
$('.bikeTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.walkingTour').removeClass('active');
$('.walkingTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.granTour').removeClass('active');
$('.granTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.vatican').removeClass('active');
$('.vatican').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.baroque').removeClass('active');
$('.baroque').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.yourOwn').removeClass('active');
$('.yourOwn').find('img').attr('src','images/b2b-images/collapse_blu.png');

$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $("#header1").offset().top - 100},
'slow');
});
});
$(document).ready(function () {
$('.walkingTour').on('click', function (e) {
$('.walkingTourCntr').slideToggle('slow');
$('.absoluteCntr').hide('slow');
$('.angelsDemonsCntr').hide('slow');
$('.bikeTourCntr').hide('slow');
$('.granTourCntr').hide('slow');
$('.vaticanCntr').hide('slow');
$('.baroqueCntr').hide('slow');
$('.granTourCntr').hide('slow');
$('.yourOwnCntr').hide('slow');
$('.absolute').removeClass('active');
$('.absolute').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.angelsDemons').removeClass('active');
$('.angelsDemons').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.bikeTour').removeClass('active');
$('.bikeTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.granTour').removeClass('active');
$('.granTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.vatican').removeClass('active');
$('.vatican').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.baroque').removeClass('active');
$('.baroque').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.yourOwn').removeClass('active');
$('.yourOwn').find('img').attr('src','images/b2b-images/collapse_blu.png');

$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $("#header1").offset().top - 100},
'slow');
});
});
$(document).ready(function () {
$('.granTour').on('click', function (e) {
$('.granTourCntr').slideToggle('slow');
$('.absoluteCntr').hide('slow');
$('.angelsDemonsCntr').hide('slow');
$('.walkingTourCntr').hide('slow');
$('.bikeTourCntr').hide('slow');
$('.vaticanCntr').hide('slow');
$('.baroqueCntr').hide('slow');
$('.yourOwnCntr').hide('slow');
$('.absolute').removeClass('active');
$('.absolute').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.angelsDemons').removeClass('active');
$('.angelsDemons').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.walkingTour').removeClass('active');
$('.walkingTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.bikeTour').removeClass('active');
$('.bikeTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.vatican').removeClass('active');
$('.vatican').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.baroque').removeClass('active');
$('.baroque').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.yourOwn').removeClass('active');
$('.yourOwn').find('img').attr('src','images/b2b-images/collapse_blu.png');

$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $("#header1").offset().top - 100},
'slow');
});
});

$(document).ready(function () {
$('.vatican').on('click', function (e) {
$('.vaticanCntr').slideToggle('slow');
$('.absoluteCntr').hide('slow');
$('.angelsDemonsCntr').hide('slow');
$('.walkingTourCntr').hide('slow');
$('.granTourCntr').hide('slow');
$('.bikeTourCntr').hide('slow');
$('.baroqueCntr').hide('slow');
$('.granTourCntr').hide('slow');
$('.yourOwnCntr').hide('slow');
$('.absolute').removeClass('active');
$('.absolute').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.angelsDemons').removeClass('active');
$('.angelsDemons').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.walkingTour').removeClass('active');
$('.walkingTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.granTour').removeClass('active');
$('.granTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.bikeTour').removeClass('active');
$('.bikeTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.baroque').removeClass('active');
$('.baroque').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.yourOwn').removeClass('active');
$('.yourOwn').find('img').attr('src','images/b2b-images/collapse_blu.png');

$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $("#header1").offset().top - 100},
'slow');
});
});
$(document).ready(function () {
$('.baroque').on('click', function (e) {
$('.baroqueCntr').slideToggle('slow');
$('.absoluteCntr').hide('slow');
$('.angelsDemonsCntr').hide('slow');
$('.walkingTourCntr').hide('slow');
$('.granTourCntr').hide('slow');
$('.vaticanCntr').hide('slow');
$('.bikeTourCntr').hide('slow');
$('.granTourCntr').hide('slow');
$('.yourOwnCntr').hide('slow');
$('.absolute').removeClass('active');
$('.absolute').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.angelsDemons').removeClass('active');
$('.angelsDemons').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.walkingTour').removeClass('active');
$('.walkingTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.granTour').removeClass('active');
$('.granTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.vatican').removeClass('active');
$('.vatican').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.bikeTour').removeClass('active');
$('.bikeTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.yourOwn').removeClass('active');
$('.yourOwn').find('img').attr('src','images/b2b-images/collapse_blu.png');

$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $("#header1").offset().top - 100},
'slow');
});
});
$(document).ready(function () {
$('.yourOwn').on('click', function (e) {
$('.yourOwnCntr').slideToggle('slow');
$('.absoluteCntr').hide('slow');
$('.angelsDemonsCntr').hide('slow');
$('.walkingTourCntr').hide('slow');
$('.granTourCntr').hide('slow');
$('.vaticanCntr').hide('slow');
$('.baroqueCntr').hide('slow');
$('.granTourCntr').hide('slow');
$('.bikeTourCntr').hide('slow');
$('.absolute').removeClass('active');
$('.absolute').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.angelsDemons').removeClass('active');
$('.angelsDemons').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.walkingTour').removeClass('active');
$('.walkingTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.granTour').removeClass('active');
$('.granTour').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.vatican').removeClass('active');
$('.vatican').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.baroque').removeClass('active');
$('.baroque').find('img').attr('src','images/b2b-images/collapse_blu.png');
$('.bikeTour').removeClass('active');
$('.bikeTour').find('img').attr('src','images/b2b-images/collapse_blu.png');

$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src','images/b2b-images/expand_blu.png');
}else{
$(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
}
$('html,body').animate({
scrollTop: $("#header1").offset().top - 100},
'slow');
});
});


		function get(e)
		{
			if(e==1)
			{
				$('#options').html('<span class="fL w100pcnt mB10"><span class="fL"><input onclick="sub()" type="radio" id="rr1" name="a" value="1" checked /><label></label></span><span class="fL"><a href="#">Non flexible</a><br>Non – refundable, non - exchangeable</span><span class="fS22 fR"></span></span><span class="fL w100pcnt mB10"><span class="fL"><input onclick="sub()" class="semiflexi" type="radio" id="rr2" name="a" value="2" /><label></label></span><span class="fL"><a href="#">Semi flexible</a><br>Refundable and flexible for a fee</span><span class="fR">+ <span class="fW600 fS18">$88</span></span></span><span class="fL w100pcnt mB10"><span class="fL"><input onclick="sub()" type="radio" id="rr3" name="a" value="3" /><label></label></span><span class="fL"><a href="#">Flexible</a><br>Non – refundable, non - exchangeable</span><span class="fR">+ <span class="fW600 fS18">$88</span></span></span>');
			}
			else if(e==2)
			{
				$('#options').html('<span class="fL w100pcnt mB10"><span class="fL"><input onclick="sub()" type="radio" id="rr1" name="a" value="1" checked /><label></label></span><span class="fL"><a href="#">Non flexible</a><br>Non – refundable, non - exchangeable</span><span class="fS22 fR"></span></span><span class="fL w100pcnt mB10"><span class="fL"><input onclick="sub()" class="semiflexi" type="radio" id="rr2" name="a" value="2" /><label></label></span><span class="fL"><a href="#">Semi flexible</a><br>Refundable and flexible for a fee</span><span class="fR">+ <span class="fW600 fS18">$88</span></span></span>');
			}
			else if(e==3)
			{
				$('#options').html('<span class="fL w100pcnt mB10"><span class="fL"><input onclick="sub()" type="radio" id="rr1" name="a" value="1" checked /><label></label></span><span class="fL"><a href="#">Non flexible</a><br>Non – refundable, non - exchangeable</span><span class="fS22 fR"></span></span>');
			}
			var value2 = $('[name=a]:checked').val();
			var  value1= $('[name=r]:checked').val();
			var val = value1 + value2;
			$("#select1").find('option').removeAttr("selected");
			$('#select1').val(val);
		}

	  function sub()
	  {
		var value2 = $('[name=a]:checked').val();
		var  value1= $('[name=r]:checked').val();
		var val = value1 + value2;
		$("#select1").find('option').removeAttr("selected");
		$('#select1').val(val);
	  }
	  function PopulateRad()
	  {
		var sVal =  $('#select1').val();
		var res1 = sVal.charAt(0);
		var res2 = sVal.charAt(1);
		if(res1==1)
			{
				$('#options').html('<span class="fL w100pcnt mB10"><span class="fL"><input onclick="sub()" type="radio" id="rr1" name="a" value="1" checked /><label></label></span><span class="fL"><a href="#">Non flexible</a><br>Non – refundable, non - exchangeable</span><span class="fS22 fR"></span></span><span class="fL w100pcnt mB10"><span class="fL"><input onclick="sub()" class="semiflexi" type="radio" id="rr2" name="a" value="2" /><label></label></span><span class="fL"><a href="#">Semi flexible</a><br>Refundable and flexible for a fee</span><span class="fR">+ <span class="fW600 fS18">$88</span></span></span><span class="fL w100pcnt mB10"><span class="fL"><input onclick="sub()" type="radio" id="rr3" name="a" value="3" /><label></label></span><span class="fL"><a href="#">Flexible</a><br>Non – refundable, non - exchangeable</span><span class="fR">+ <span class="fW600 fS18">$88</span></span></span>');
			}
			else if(res1==2)
			{
				$('#options').html('<span class="fL w100pcnt mB10"><span class="fL"><input onclick="sub()" type="radio" id="rr1" name="a" value="1" checked /><label></label></span><span class="fL"><a href="#">Non flexible</a><br>Non – refundable, non - exchangeable</span><span class="fS22 fR"></span></span><span class="fL w100pcnt mB10"><span class="fL"><input onclick="sub()" type="radio" id="rr2" name="a" value="2" /><label></label></span><span class="fL"><a href="#">Semi flexible</a><br>Refundable and flexible for a fee</span><span class="fR">+ <span class="fW600 fS18">$88</span></span></span>');
			}
			else if(res1==3)
			{
				$('#options').html('<span class="fL w100pcnt mB10"><span class="fL"><input onclick="sub()" type="radio" id="rr1" name="a" value="1" checked /><label></label></span><span class="fL"><a href="#">Non flexible</a><br>Non – refundable, non - exchangeable</span><span class="fS22 fR"></span></span>');
			}
		
		document.getElementById("r"+res1).checked = true;
		document.getElementById("rr"+res2).checked = true;
	  }
      
	  
function paymentCurrencyrupee(){
	document.getElementById("rupee").style.display = 'block'
	document.getElementById("dollar").style.display = 'none'
	}
function paymentCurrencydollar(){
	document.getElementById("dollar").style.display = 'block'
	document.getElementById("rupee").style.display = 'none'
}

function sellForex(){
	document.getElementById("buyforex").style.display = 'none'
	document.getElementById("sellforex").style.display = 'block'
}
function buyForex(){
	document.getElementById("buyforex").style.display = 'block'
	document.getElementById("sellforex").style.display = 'none'
}

function createList(id1,id2,id3)
{
$("#" + id1).toggleClass("active");
$("#" + id2).slideToggle();
if ($("#" + id1).hasClass('active')) {
$("#" + id3).html(" - ");
}else{
$("#" + id3).html(" + ");
}
}

function closeCreatelist(id1, id2, id3)
{
$("#" + id1).removeClass("active");
$("#" + id2).slideUp();
if ($("#" + id1).hasClass('active')) {
$("#" + id3).text(" - ");
}else{
$("#" + id3).text(" + ");
}
}

function showManual(id1,id2)
{
$("#" + id1).toggleClass("active");
$("#" + id2).slideToggle();

}
function showManuallist(id1, id2)
{
$("#" + id1).removeClass("active");
$("#" + id2).slideUp();

}
function showManualEntry(){
	document.getElementById("entryButton").style.display = 'none';
	document.getElementById("entryContr").style.display = 'block';
	document.getElementById("sendbtn").style.display = 'none';
	document.getElementById("savesendbtn").style.display = 'block';
}
function uploadcontact(){
	document.getElementById("entryButton").style.display = 'none';
	document.getElementById("uploadContr").style.display = 'block';
}
function showManualEntry1(){
	document.getElementById("entryContr1").style.display = 'block';
	document.getElementById("entryContr").style.display = 'none';
}

$(document).ready(function() {
var max_fields3      = 10; //maximum input boxes allowed
var wrapper3         = $("#addManulEntry"); //Fields wrapper
var add_button3      = $("#addEntrybtn"); //Add button ID
var id3=13;
var id4=1;
var x3 = 1;
var x4 = 0;	//initlal text box count
$(add_button3).click(function(e){ //on add input button click
e.preventDefault();
if(x3 < max_fields3 || x4 < max_fields3){ //max input box allowed
x3++; //text box increment
x4++;
id3=13+x3;
id4=1+x4;
$(wrapper3).append('<ul class="clearfix mB10 mT10"><li class="col_3 pL0"><label>Name</label><input type="text" class="w100pcnt" placeholder="Amit Trivedi" /></li><li class="col_3 pL0"><label>Email</label><input type="text" class="w100pcnt" placeholder="amit@trivedi.com" /></li><li class="col_3 pL0"><label>Mobile</label><input type="text" class="w100pcnt" placeholder="9874563210" /></li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}

});
$(wrapper3).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x3--;id3--;
})
});

$(document).ready(function() {
var max_fields3      = 10; //maximum input boxes allowed
var wrapper3         = $("#addManulEntry1"); //Fields wrapper
var add_button3      = $("#addEntrybtn1"); //Add button ID
var id3=13;
var id4=1;
var x3 = 1;
var x4 = 0;	//initlal text box count
$(add_button3).click(function(e){ //on add input button click
e.preventDefault();
if(x3 < max_fields3 || x4 < max_fields3){ //max input box allowed
x3++; //text box increment
x4++;
id3=13+x3;
id4=1+x4;
$(wrapper3).append('<ul class="clearfix mB10 mT10"><li class="col_3 pL0"><label>Name</label><input type="text" class="w100pcnt" placeholder="Amit Trivedi" /></li><li class="col_3 pL0"><label>Email</label><input type="text" class="w100pcnt" placeholder="amit@trivedi.com" /></li><li class="col_3 pL0"><label>Mobile</label><input type="text" class="w100pcnt" placeholder="9874563210" /></li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}

});
$(wrapper3).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x3--;id3--;
})
});
$(document).ready(function() {
var max_fields3      = 10; //maximum input boxes allowed
var wrapper3         = $("#addNewSupplier"); //Fields wrapper
var add_button3      = $("#addNewSupplierButton"); //Add button ID
var id3=13;
var id4=1;
var x3 = 1;
var x4 = 0;	//initlal text box count
$(add_button3).click(function(e){ //on add input button click
e.preventDefault();
if(x3 < max_fields3 || x4 < max_fields3){ //max input box allowed
x3++; //text box increment
x4++;
id3=13+x3;
id4=1+x4;
$(wrapper3).append('<span class="clearfix"><span class="col_12 clearfix pL0 mB10"><span class="mT10 col_2">Supplier Type : </span><span class="col_3"><select class="mB10"><option></option></select></span></span><span class="col_12 clearfix pL0 mT10"><span class="mT10 col_2">Supplier Name : </span><span class="col_3"><select><option></option></select></span></span><span class="remove_field fR"><span class="popup_close_icon"></span></span></span>'); //add input box
}

});
$(wrapper3).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('span').remove(); x3--;id3--;
})
});
$(document).ready(function() {
var max_fields3      = 10; //maximum input boxes allowed
var wrapper3         = $("#addManulEntry2"); //Fields wrapper
var add_button3      = $("#addEntrybtn2"); //Add button ID
var id3=13;
var id4=1;
var x3 = 1;
var x4 = 0;	//initlal text box count
$(add_button3).click(function(e){ //on add input button click
e.preventDefault();
});
$(wrapper3).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x3--;id3--;
})
});

function hidecustomerdetails()
{
	$('#custDetail').hide("slow");
}

 
   $('#search1').on('autocompletechange change', function () {

	  if(this.value == "Paris")
		$("#newsearch").show();
		else
		$("#newsearch").hide();
  });

  $(document).ready(function() {
  	$.widget( "custom.catcomplete2", $.ui.autocomplete, {
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
	

	
	$('#autosuggest2').on('click', function (e) {
		 $('#cars_detailCntr1').slideToggle("slow");
		 
	});	
    $( "#search2" ).catcomplete2({
      delay: 0,
      source: data,
	  width: 350
				
    });
  });
  
    });
function changeSelected()
{
$('.option1').addClass('selflight');
$('.option2').removeClass('selflight');
$('.displaySelect1').addClass('dN');
$('.displaySelect').removeClass('dN');
document.getElementById('selectOption').style.display = 'none';
document.getElementById('selectOption1').style.display = 'block';
$('select[name="room-number1"]').prop('disabled',false);
$('select[name="room-number"]').prop('disabled',true);
}

function PopulateInput()
{
    
	var lol = document.getElementById('insert').value;
	var lol1 = lol.charAt(0);
	if(lol == 0 || lol1 == 0)
	{ 
		document.getElementById('error').innerHTML = "<span class='txtClrRed mL50'>*Minimum <span class='rupee'>Rs.</span>1000</span>";
	}
	else if(lol.length < 4)
	{
		document.getElementById('error').innerHTML = "<span class='txtClrRed mL50'>*Minimum <span class='rupee'>Rs.</span>1000</span>";
	}
	else 
	{
		document.getElementById('error').innerHTML = "";
	}
}

var availableCustomers = ['Amit Trivedi', 'Vikram Pandit'];
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
	

	$('#myaccount').on('click', function (e) {
		 $('#myaccountcontr').prop("disabled",true);
	});	
	$('#branch').on('click', function (e) {
		 $('#myaccountcontr').prop("disabled",false);
	});
	$('#subagent').on('click', function (e) {
		 $('#myaccountcontr').prop("disabled",false);
	});
	
function showtooltipcalenderNew(parentId, tooltipId)
{
   $("#" + tooltipId).toggle();
   
    var parentElementHeight = $("#" + parentId).height();
    var parentElementWidth = $("#" + parentId).width();
	 
   var left =  ($("#" + parentId).offset().left)+170+ 'px';
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
function flight_hotel_way10(tabid, contrid){
for(i=13; i<=15; i++){
document.getElementById('flight_hotel_way'+i).className = '';
document.getElementById('flight_hotel_wayContr'+i).style.display = 'none'
if(i==13){
document.getElementById('flight_hotel_way'+i).className = 'first';
}
if(i==15){
document.getElementById('flight_hotel_way'+i).className = 'last';
}
}
document.getElementById(tabid).className = 'sel';
document.getElementById(contrid).style.display = 'block'
if(tabid == 'flight_hotel_way13'){
document.getElementById(tabid).className = 'first sel';
}
if(tabid == 'flight_hotel_way15'){
document.getElementById(tabid).className = 'last sel';
}
}

$(document).ready(function() {
	$('#result1').on('click', function() { 
		$('#result1').remove();
	});
});
function showunder()
{
	document.getElementById('underContr').style.display = 'block';
	document.getElementById('bookingContr').style.display = 'none';
	document.getElementById('bookingtrainContr').style.display = 'none';
	document.getElementById('undertrainContr').style.display = 'none';
	document.getElementById('bookingseatContr').style.display = 'none';
	document.getElementById('underseatContr').style.display = 'none';
}
function showbooking()
{
	document.getElementById('bookingContr').style.display = 'block';
	document.getElementById('bookingseatContr').style.display = 'none';
	document.getElementById('underseatContr').style.display = 'none';
	document.getElementById('bookingtrainContr').style.display = 'none';
	document.getElementById('undertrainContr').style.display = 'none';
	document.getElementById('underContr').style.display = 'none';
	
}
function showundertrain()
{
	document.getElementById('undertrainContr').style.display = 'block';
	document.getElementById('bookingtrainContr').style.display = 'none';
	document.getElementById('bookingContr').style.display = 'none';
	document.getElementById('underContr').style.display = 'none';
	document.getElementById('bookingseatContr').style.display = 'none';
	document.getElementById('underseatContr').style.display = 'none';
}
function showbookingtrain()
{
	document.getElementById('bookingtrainContr').style.display = 'block';
	document.getElementById('bookingseatContr').style.display = 'none';
	document.getElementById('underseatContr').style.display = 'none';
	document.getElementById('bookingContr').style.display = 'none';
	document.getElementById('underContr').style.display = 'none';
	document.getElementById('undertrainContr').style.display = 'none';
	
}
function showunderseat()
{
	document.getElementById('underseatContr').style.display = 'block';
	document.getElementById('undertrainContr').style.display = 'none';
	document.getElementById('bookingtrainContr').style.display = 'none';
	document.getElementById('bookingContr').style.display = 'none';
	document.getElementById('underContr').style.display = 'none';
	document.getElementById('bookingseatContr').style.display = 'none';
	
}
function showbookingseat()
{
	document.getElementById('bookingseatContr').style.display = 'block';
	document.getElementById('underseatContr').style.display = 'none';
	document.getElementById('bookingContr').style.display = 'none';
	document.getElementById('underContr').style.display = 'none';
	document.getElementById('undertrainContr').style.display = 'none';
	document.getElementById('bookingtrainContr').style.display = 'none';
}

function showrailpasses(e)
{
	if(e == '1')
	{
		$('#under').attr('href', 'All_about_rail_passes.html');
	}
	if(e == '2')
	{
		$('#undertrain').attr('href', 'All_about_rail_passes.html');
	}
	if(e == '3')
	{
		$('#underseat').attr('href', 'All_about_rail_passes.html');
	}
}
$(document).ready(function() {
var max_fields      = 3; //maximum input boxes allowed
var wrapper1         = $("#addCity"); //Fields wrapper
var add_button1      = $("#addCitybtn"); //Add button ID
var id1=2;
var id2=56;
var x1= 0;
var x2= 2;	//initlal text box count
$(add_button1).click(function(e){ //on add input button click
e.preventDefault();
if(x1 <= max_fields){ //max input box allowed
x1++; //text box increment
id1=2+x1;
id2=56+x2;
$(wrapper1).append('<ul class="mB10 clearfix"><li class="col_8 pR0 pL0"><label>Flight '+id1+':</label><div class="search-bar grey_border fL mR20 w47pcnt"><input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="mwFlight2From" /><input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/b2b-images/destination_from.png" /></div><div class="search-bar grey_border fL w47pcnt"><input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="mwFlight2To" /><input type="image" class="toDestination" name="search" alt="Search" title="Search" src="images/b2b-images/destination_to.png" /></div></li><li class="col_3">     <label>Departure</label><input id="datepicker10" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly="readonly" /></li><li class="col_1 mT30 pR0 remove_field"><span class="popup_close_icon"></span> </li></ul>'); //add input box
}
});
$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;
})
});

$('ul#moreOptnew > li').bind('click', function(evt) {
	evt.preventDefault();
	evt.stopPropagation();
	var ele = $(this);
	if (ele.find('a').hasClass('link')) {
		return false;
	}
	var optText = ele.find('a').text();
	var tabContainer = $('li#globalSrcTabnew');
	tabContainer.find('a').text(optText);
	if(optText== 'Bus')
	{
	$('#globalSrcContrnew').html('<ul class="flightWayTab  clearfix"> <li class="first sel" id="way17"><a href="javascript:void(0);" onclick="bustype(\'way17\', \'wayContr17\'),reset()"><span class="oneway_icon" title="One way"></span></a></li> <li class="last" id="way18"><a href="javascript:void(0);" onclick="bustype(\'way18\', \'wayContr18\'),reset()"><span class="twoway_icon" title="Return"></span></a></li> </ul> <div id="wayContr17" class="clearfix">  <ul class="mB10 clearfix"> <li class="col_5 pR0 pL0"> <label>&nbsp;</label> <input type="text" class="w95pcnt" name="startfrom" placeholder="From" /> </li> <li class="col_1 pL10 pR0"> <label>&nbsp;</label> <span class="oneway_icon" title="One way"></span> </li> <li class="col_5 pR0 pL0"> <label>&nbsp;</label> <input type="text" class="w95pcnt" name="to" placeholder="To" /> </li> <li class="col_6 pR0 pL0 mT10"> <label>Departure</label> <input id="datepicker30" class="w50pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_6 pR0 pL0 mT10"> <label>Return</label> <input id="datepicker16" class="w50pcnt " type="text" placeholder="DD/MM/YYYY" disabled="disabled" /> </li> </ul> <ul class="row mB10"><li class="col_6"><div><label>Bus type</label><dl class="dropdown1"><dt><a href="javascript:void(0);" class="grey_border fL"><span class="hida">All </span><p class="multiSel1" ></p> </a><span class="downArrow_icon pD5 fL mLN20  mT15 pD15"></span></dt><dd><div class="mutliSelect1"><ul><li><input type="checkbox" value="All"/><label>All</label></li><li><input type="checkbox" value="AC" class="checkbox1"/><label>AC</label></li><li><input type="checkbox" value="Non AC" class="checkbox1"/><label>Non AC</label></li><li><input type="checkbox" value="Sleeper" class="checkbox1"/><label>Sleeper</label></li><li><input type="checkbox" value="Semi-sleeper" class="checkbox1"/><label>Semi-sleeper</label></li></ul></div></dd></dl><p class="multiSel1 cB"></p></div></li><li class="col_6 pR10 pL0  mT30"> <input type="checkbox" /><label>Volvo/ Mercedes only</label> </li> </ul> <div class="cB"></div> <div class="mT40 clearfix"> <input type="checkbox" /> <label class="w50pcnt">Group booking request (6+Pax)</label> </div> </div> <div id="wayContr18" class="clearfix dN">  <ul class="mB10 clearfix"> <li class="col_5 pR0 pL0"> <label>&nbsp;</label> <input type="text" class="w95pcnt" name="startfrom" placeholder="From" /> </li> <li class="col_1 pL10 pR0"> <label>&nbsp;</label> <span class="twoway_icon" title="Return"></span> </li> <li class="col_5 pR0 pL0"> <label>&nbsp;</label> <input type="text" class="w95pcnt" name="to" placeholder="To" /> </li> <li class="col_6 pR0 pL0 mT10"> <label>Departure</label> <input id="datepicker31" class="w50pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_6 pR0 pL0 mT10"> <label>Return</label> <input id="datepicker32" class="w50pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> </ul> <ul class="row mB10"><li class="col_6"><div><label>Bus type</label><dl class="dropdown1"><dt><a href="javascript:void(0);" class="grey_border fL"><span class="hida">All </span><p class="multiSel1" ></p> </a><span class="downArrow_icon pD5 fL mLN20  mT15 pD15"></span></dt><dd><div class="mutliSelect1"><ul><li><input type="checkbox" value="All"/><label>All</label></li><li><input type="checkbox" value="AC" class="checkbox1"/><label>AC</label></li><li><input type="checkbox" value="Non AC" class="checkbox1"/><label>Non AC</label></li><li><input type="checkbox" value="Sleeper" class="checkbox1"/><label>Sleeper</label></li><li><input type="checkbox" value="Semi-sleeper" class="checkbox1"/><label>Semi-sleeper</label></li></ul></div></dd></dl><p class="multiSel1 cB"></p></div></li><li class="col_6 pR10 pL0  mT30"> <input type="checkbox" /><label>Volvo/ Mercedes only</label> </li> </ul> <div class="cB"></div> <div class="mT40"> <input type="checkbox"/> <label class="w50pcnt">Group booking request (6+Pax)</label> </div> </div><div class="clearfix"></div> <span class="fR"><span class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);">Add</a></span><span class="tertiaryBtn fL mT15 mB15 mR10"><a href="javascript:void(0);">Cancel</a></span></span>');
	}
	if(optText== 'Activities')
	{
	$('#globalSrcContrnew').html('<ul class="col_12 clearfix"> <li> <label>Destination</label> <div class="search-bar grey_border clearfix"><input type="text" class="sfield w95pcnt ui-autocomplete-input" name="searchterm" placeholder="From" id="search1" autocomplete="off"> <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/b2b-images/search_icon.png" id="cars_detail2" style="width:16px"></div></li> </ul> <ul class="mT10 mB10 clearfix"><li class="col_6"><div><label>Themes</label><dl class="dropdown1"><dt><a href="javascript:void(0);" class="grey_border fL"><span class="hida">All </span><p class="multiSel1" ></p> </a><span class="downArrow_icon pD5 fL mLN20  mT15 pD15"></span></dt><dd><div class="mutliSelect1"><ul><li><input type="checkbox" value="All"/><label>All</label></li><li><input type="checkbox" value="Bed and Breakfast" class="checkbox1"/><label>Bed and Breakfast</label></li><li><input type="checkbox" value="Boutique Hotel" class="checkbox1"/><label>Boutique Hotel</label></li><li><input type="checkbox" value="Guest House" class="checkbox1"/><label>Guest House</label></li><li><input type="checkbox" value="Heritage Hotel" class="checkbox1" /><label>Heritage Hotel</label></li><li><input type="checkbox" value="Home Stay" class="checkbox1"/><label>Home Stay</label></li><li><input type="checkbox" value="Resort" class="checkbox1"/><label>Resort</label></li><li><input type="checkbox" value="Serviced Apartments" class="checkbox1" /><label>Serviced Apartments</label></li></ul></div></dd></dl><p class="multiSel1 cB"></p></div></li><li class="col_6"> <label>Budget (per person)</label> <div id="slider-range" class="mL10"></div> <input type="text" id="amount" class="rangeTxt" style="background: transparent;" readonly /> </li> </ul> <ul class="mT10 clearfix"><li class="col_6"><div><label>Physical Intensity</label><dl class="dropdown2"><dt><a href="javascript:void(0);" class="grey_border fL"><span class="hidd">All </span><p class="multiSel2" ></p> </a><span class="downArrow_icon pD5 fL mLN20  mT15 pD15"></span></dt><dd><div class="mutliSelect2"><ul><li><input type="checkbox" value="All"/><label>All</label></li><li><input type="checkbox" value="high" class="checkbox1"/><label>High</label></li><li><input type="checkbox" value="medium" class="checkbox1"/><label>Medium</label></li><li><input type="checkbox" value="low" class="checkbox1"/><label>Low</label></li></ul></div></dd></dl><p class="multiSel2 cB"></p></div></li><li class="col_6"> <span class="label fL mB5 mR5">Departure</span> <div class="fL mR15"> <input type="radio" name="domHolidayDate" id="domHolidayTime3" checked="checked"  onclick="holidayDate(\'holidayMonth1\', \'holidayDay1\')"/> <label for="domHolidayTime3"><span class="trvGrp">Month</span></label> </div> <div class="fL  mR15"> <input type="radio" name="domHolidayDate" id="domHolidayTime4" onclick="holidayDate(\'holidayDay1\', \'holidayMonth1\')"/> <label for="domHolidayTime4"><span class="trvGrp">Date</span></label> </div> <select id="holidayMonth1" class="w50pcnt"> <option value="January">January</option> <option value="February">February</option> <option value="March">March</option> <option value="April">April</option> <option value="May">May</option> <option value="June">June</option> <option value="July">July</option> <option value="August">August</option> <option value="September">September</option> <option value="October">October</option> <option value="November">November</option> <option value="December">December</option> </select> <span id="holidayDay1" class="dN"> <input id="datepicker33" class="dateField holidayCal" type="text" placeholder="DD/MM/YYYY" readonly /> </span> </li> </ul><div class="mT40 pL20"> <input type="checkbox">  <label class=" w50pcnt">Group booking request (9+Pax)</label></div><div class="clearfix"></div> <span class="fR"><span class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);">Add</a></span><span class="tertiaryBtn fL mT15 mB15 mR10"><a href="javascript:void(0);">Cancel</a></span></span>');
	}
	if(optText== 'Car')
	{
	$('#globalSrcContrnew').html(' <ul class="mB10 clearfix"> <li class="col_5  pL0"> <label>Pick Up From</label> <div class="search-bar  grey_border clearfix"> <input type="text" class="sfield w95pcnt ui-autocomplete-input" name="searchterm" placeholder="From" id="search" autocomplete="off"> <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/b2b-images/search_icon.png" id="cars_detail1" style="width:16px"> </div> </li> <li class="col_3  pR0 pL0"> <label>Pick Up Date and Time</label> <input id="datepicker34" class="w86pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_2  pR0 pL0 "> <label>&nbsp;</label> <select> <option value="08:00">08:00</option> </select> </li> </ul> <ul class="mB10 mT10 clearfix"> <li class="col_12 pL0"> <span class="input_fields_wrap"></span> </li><li class="col_12 clearfix"><span class="fR mR15 mT10 clearfix"><a href="javascript:void(0);" class="add_field_button"><span class="add_details_icon mR5"></span><span class="posR">Add Location</span></a></span> </li> <li class="col_5  pL0 clearfix"> <label>Drop Off At </label> <div class="search-bar  grey_border clearfix"> <input type="text" class="sfield w95pcnt ui-autocomplete-input" name="searchterm" placeholder="From" id="search" autocomplete="off"> <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/b2b-images/search_icon.png" id="cars_detail1" style="width:16px"> </div> </li> <li class="col_3  pR0 pL0"> <label>Drop Off Date and Time</label> <input id="datepicker35" class="w86pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_2  pR0 pL0"> <label>&nbsp;</label> <select> <option value="08:00">08:00</option> </select> </li><li class="col_2"></li> </ul> <div id="addfields"> </div> <div class="clearfix mT20"> <input type="checkbox" id="addreturntarns" /> <label for="addreturntrans">Add A Return Transfer</label> </div> <div id="addreturntransContr" class="dN"> <span><span class="fW600">Houghton Street,London</span> to  <span class="fW600">Heathrow Airport, London</span><br/> <ul class="mB10 mT20 clearfix"> <li class="col_3 pL0"> <label>Pick Up Date &amp; Time</label> <input id="datepicker36" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_2 pL0"> <label>&nbsp;</label> <select> <option value="08:00">08:00</option> </select></li><li class="col_3  pL0"> <label>Drop Off Date &amp; Time</label> <input id="datepicker37" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_2 pL0 pR0"> <label>&nbsp;</label> <select> <option value="08:00">08:00</option> </select> </li> </ul> </div><div class="clearfix"></div> <span class="fR"><span class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);">Add</a></span><span class="tertiaryBtn fL mT15 mB15 mR10"><a href="javascript:void(0);">Cancel</a></span></span>');
	}
	if(optText== 'Cruise')
	{
	$('#globalSrcContrnew').html('<div class="container"> <ul class="col_12 clearfix pL0 "> <li>  <label>Destination</label> <div class="search-bar grey_border clearfix"><input type="text" class="sfield w95pcnt ui-autocomplete-input" name="searchterm" placeholder="From"  autocomplete="off" > <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/b2b-images/destination_from.png">  </div></li> </ul> <ul class="mT10 mB10 clearfix"> <li class="col_6 pR0 pL0"> <label>Month of departure</label> <select><option>Select one</option> <option>January 2015</option> <option>February 2015</option> <option>March 2015</option></select> </li> <li class="col_6 "> <label>Themes</label> <dl class="dropdown1">  <dt><a href="javascript:void(0);" class="grey_border fL" style=" width: 281px;"> <span class="hida">All </span> <p class="multiSel1" ></p> </a> <span class="downArrow_icon pD5 fR mLN20 mTN20 pD15"></span></dt> <dd><div class="mutliSelect1"><ul style=" width:100%; "><li>	<input type="checkbox" value="All" checked="checked" id="selectalltheme"/><label>All</label></li>	<li><input type="checkbox" value="Bed and Breakfast" checked="checked" class="checkbox1"/><label>Bed and Breakfast</label></li>	<li><input type="checkbox" value="Boutique Hotel" checked="checked" class="checkbox1"/><label>Boutique Hotel</label></li><li><input type="checkbox" value="Guest House" checked="checked" class="checkbox1"/><label>Guest House</label></li><li><input type="checkbox" value="Heritage Hotel" checked="checked" class="checkbox1" /><label>Heritage Hotel</label></li><li><input type="checkbox" value="Home Stay" checked="checked" class="checkbox1"/><label>Home Stay</label></li><li><input type="checkbox" value="Resort" checked="checked" class="checkbox1"/><label>Resort</label></li><li><input type="checkbox" value="Serviced Apartments" checked="checked" class="checkbox1" /><label>Serviced Apartments</label></li></ul></div></dd></dl><p class="multiSel1 cB">  </p>  </li> </ul>   <div id="room143"> <ul class="row mB10 mT15 clearfix"> <li id="singleRooms" class="col_2"> <label>Cabins</label> <select id="noOfRooms" onchange="showCabins();" class="searchbtn"> <option value="1">1</option> <option value="2">2</option> <option value="3">3</option> </select> </li> <li id="groupBookingRooms" class="col_2 dN"> <label>Cabins</label> <select class="searchbtn"> <option value="9">9</option> <option value="10">10</option> <option value="11">11</option> <option value="12">12</option> <option value="13">13</option> <option value="14">14</option> <option value="15">15</option> <option value="16">16</option> <option value="17">17</option> <option value="18">18</option> <option value="19">19</option> <option value="20">20</option> <option value="21">21</option> <option value="22">22</option> <option value="23">23</option> <option value="24">24</option> <option value="25">25</option> <option value="26">26</option> <option value="27">27</option> <option value="28">28</option> <option value="29">29</option> <option value="30">30</option> </select> </li> <li id="groupBookingRooms" class="col_2 dN"> <label>Cabins</label> <select class="searchbtn"> <option value="9">9</option> <option value="10">10</option> <option value="11">11</option> <option value="12">12</option> <option value="13">13</option> <option value="14">14</option> <option value="15">15</option> <option value="16">16</option> <option value="17">17</option> <option value="18">18</option> <option value="19">19</option> <option value="20">20</option> <option value="21">21</option> <option value="22">22</option> <option value="23">23</option> <option value="24">24</option> <option value="25">25</option> <option value="26">26</option> <option value="27">27</option> <option value="28">28</option> <option value="29">29</option> <option value="30">30</option> </select> </li> <li class="col_2 pR0 singleRoom"> <span class="mT30 fL">Cabin 1:</span> </li> <li class="col_2 pL0 singleRoom"> <label>Adult</label> <div class="passengerNum4 fL searchbtn"> <span class="control addMinControl minusControl" onclick="adultCountDec(\'hAdult_143\',1)">-</span> <span id="hAdult_143" class="control innerTxtControl">1</span> <span class="control addMinControl plusControl" onclick="adultCountInc(\'hAdult_143\',1)">+</span> </div> <input type="text" placeholder="1" maxlength="3" class="w100pcnt dN"/> <span class="fS11 fL w100pcnt">12+ yrs</span> </li> <li class="col_1_half col_2_sm  pR0 pL0"> <label>Children</label> <div class="passengerNum5 fL searchbtn"> <span class="control addMinControl minusControl" onclick="childCountDec(\'hChild_143\',1),remChild(1);">-</span> <span id="hChild_143" class="control innerTxtControl">0</span> <span class="control addMinControl plusControl" onclick="childCountInc(\'hChild_143\',1),addChild(1)">+</span> </div> <input type="text" placeholder="0" maxlength="3" class="w100pcnt dN"/> <span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li> <li class="col_2 pR10"> <label>Infant</label><div class="passengerNum1 fL"> <span class="control addMinControl minusControl")">-</span> <span class="control innerTxtControl" id="owInfant">0</span> <span class="control addMinControl plusControl">+</span> </div><input type="text" placeholder="00" maxlength="3" class="w86 aInput1 dN blink" /><span class="fS11 fL w100pcnt">0 - 2 yrs</span> </li><li class="col_4 pR0 pL0 singleRoom"> <ul> <li class="col_6  pR0 pL0" id="child1_1"></li> <li class="col_6 mB10"  id="child1_2"></li> <li class="col_6 pR0 mL10" id="child1_3"></li> <li class="col_6  pR0 mL10"  id="child1_4"></li> <li class="col_6 pR0 mL10" id="child1_5"></li> <li class="col_6  pR0 mL10" id="child1_6"></li> <li class="col_6  pR0 mL10" id="child1_7"></li> <li class="col_6  pR0 mL10" id="child1_8"></li> <li class="col_6  pR0 mL10"  id="child1_9"></li> </ul> </li> </ul> </div> <div id="room243" class="singleRoom"></div> <div id="room343" class="singleRoom"></div><p class="  pB10 clearfix" id="flightOpt"> <a href="javascript:void(0);"><img src="images/b2b-images/collapse_blu.png" alt="Arrow" class="mR5 fL mT5" />Cruise Options</a> (Budget, Star rating, Cruise liner, Cruise length) </p> <div class="clearfix dN" id="flightContr" > <ul class="clearfix"> <li class="col_6"> <label>Budget (per person)</label> <div id="slider-range" class="mL10"></div> <input type="text" id="amount" class="rangeTxt" readonly style="  background: transparent;" />  </li> <li class="col_6 pR0"> <label>Star Rating</label> <div class="fL mR15"> <input type="checkbox" name="check" /> <label><span class="trvGrp">5</span></label> </div> <div class="fL mR15"> <input type="checkbox" name="check" /> <label><span class="trvGrp">4</span></label> </div> <div class="fL mR15"> <input type="checkbox" name="check" /> <label><span class="trvGrp">3</span></label> </div> <div class="fL mR15"> <input type="checkbox" name="check" /> <label><span class="trvGrp">2</span></label> </div> <div class="fL mR15"> <input type="checkbox" name="check" /> <label><span class="trvGrp">1</span></label> </div> </li> </ul> <ul class="mT10 clearfix"> <li class="col_6"> <label>Cruise liner</label> <select><option> All liners</option> <option>Carnival Legend</option> <option>Caribbean Princess</option> <option>Crown Princess</option> </select> </li> <li class="col_6"> <label>Cruise length</label> <select class="pT5"><option> All length</option> <option>1 - 2 Nights</option> <option>3 - 5 Nights</option> <option>6 - 9 Nights</option> </select> </li> </ul> </div> </div><div class="clearfix"></div> <span class="fR"><span class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);">Add</a></span><span class="tertiaryBtn fL mT15 mB15 mR10"><a href="javascript:void(0);">Cancel</a></span></span>');
	}
	if(optText== 'Visa')
	{
	$('#globalSrcContrnew').html('<ul class="col_12 pL0 mT10 mB10 clearfix"> <li class="col_6"> <label>Country</label><div class="search-bar grey_border clearfix"><input type="text" class="sfield w95pcnt ui-autocomplete-input" name="searchterm" placeholder="Enter country"  autocomplete="off" style="color:#000" > <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/b2b-images/destination_from.png" >  </div></li><li class="col_6"> <label>Passport Issued In</label><div class="search-bar grey_border clearfix"><input type="text" class=" txtClrBlk sfield w95pcnt ui-autocomplete-input" name="searchterm"  autocomplete="off" style="color:#000;" > </div></li> </ul><ul class="col_12 pL0 mT10 mB10 clearfix"><li class="col_6"><label>Date Of Issue</label><select class="col_3 mR5"><option>DD</option><option>1</option><option>2</option><option>3</option><option>4</option><option>5</option><option>6</option><option>7</option><option>8</option><option>9</option><option>10</option><option>11</option><option>12</option><option>13</option><option>14</option><option>15</option><option>16</option><option>17</option></select><select class="col_3 mR5"><option>MM</option><option>January</option><option>February</option><option>March</option><option>April</option><option>May</option><option>June</option><option>July</option><option>August</option><option>September</option><option>October</option><option>November</option><option>December</option></select><select class="col_3"><option>YY</option><option>2000</option><option>2001</option><option>2002</option><option>2003</option><option>2004</option><option>2005</option><option>2006</option><option>2007</option><option>2008</option><option>2009</option><option>2010</option><option>2011</option><option>2012</option><option>2013</option><option>2014</option><option>2015</option></select></li><li class="col_6"><label>Expiry Date</label><select class="col_3 mR5"><option>DD</option><option>1</option><option>2</option><option>3</option><option>4</option><option>5</option><option>6</option><option>7</option><option>8</option><option>9</option><option>10</option><option>11</option><option>12</option><option>13</option><option>14</option><option>15</option><option>16</option><option>17</option></select><select class="col_3 mR5"><option>MM</option><option>January</option><option>February</option><option>March</option><option>April</option><option>May</option><option>June</option><option>July</option><option>August</option><option>September</option><option>October</option><option>November</option><option>December</option></select><select class="col_3"><option>YY</option><option>2000</option><option>2001</option><option>2002</option><option>2003</option><option>2004</option><option>2005</option><option>2006</option><option>2007</option><option>2008</option><option>2009</option><option>2010</option><option>2011</option><option>2012</option><option>2013</option><option>2014</option><option>2015</option></select></li></ul><div class="clearfix"></div> <span class="fR"><span class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);">Add</a></span><span class="tertiaryBtn fL mT15 mB15 mR10"><a href="javascript:void(0);">Cancel</a></span></span>');
	}
	if(optText== 'Flights + Hotels + Cars')
	{
	$('#globalSrcContrnew').html('<ul class="flightWayTab mB20 clearfix"> <li class="first" id="flight_hotel_way3"><a href="javascript:void(0);" onclick="flight_hotel_way1(\'flight_hotel_way3\', \'flight_hotel_wayContr3\'),reset()"><span class="oneway_icon" title="One way"></span></a></li> <li class="last sel" id="flight_hotel_way4"><a href="javascript:void(0);" onclick="flight_hotel_way1(\'flight_hotel_way4\', \'flight_hotel_wayContr4\'),reset()"><span class="twoway_icon" title="Return"></span></a></li> </ul> <!--oneway start--> <div id="flight_hotel_wayContr3" class="dN"> <ul class="mB10 clearfix"> <li class="col_6 pR0 pL0"> <div class="search-bar grey_border clearfix"> <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="owFlightFrom1" /> <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/b2b-images/destination_from.png" /> </div> </li> <li class="col_6 pR0"> <div class="search-bar grey_border clearfix"> <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="owFlightTo1" /> <input type="image" class="toDestination" name="search" alt="Search" title="Search" src="images/b2b-images/destination_to.png" /> </div> </li> </ul> <ul class="row mB10 clearfix"> <li class="col_6 pR0"> <label>Departure</label> <input id="datepicker38" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_6"> <label class="txtClrlitGry">Return</label> <input id="datepicker14" class="w100pcnt " type="text" placeholder="DD/MM/YYYY" disabled="disabled" /> </li> </ul> <ul class="row mB10 clearfix"> <li class="col_6 pR0"> <label>Hotel</label> <div class="search-bar grey_border clearfix"> <input type="text" class="sfield city w95pcnt" name="searchterm" placeholder="Enter city" id="hotelDestination1" data-co-field="hotelLocation" /> <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/b2b-images/destination_from.png" /> </div>   </li> <li class="col_12 cB"></li> <li class="col_5  pR0 mT20 " > <label>Check-in</label> <input id="datepicker50" class="w100pcnt dateField enabledate" type="text" placeholder="DD/MM/YYYY"   /> <input id="datepicker39" class="w100pcnt dateField showdate dN" type="text" placeholder="DD/MM/YYYY"  readonly /> </li> <li class="col_5   mT20 " > <label>Check-out</label> <input id="datepicker40" class="w100pcnt dateField " type="text" placeholder="DD/MM/YYYY" readonly /> </li><li class="col_2 pL0 mT20"><label>Night(s)</label><input type="text" class="w100pcnt" id="nights" disabled=""><span id="msg"></span> </li> </ul>  <div id="room1"> <ul class="row mB10 mT15 clearfix"> <li  class="col_2"> <label>Rooms</label> <select id="noOfRooms" onChange="showRoom();"> <option value="1">1</option> <option value="2">2</option> <option value="3">3</option> </select> </li> <li  class="col_2 dN"> <label>Rooms</label> <select> <option value="9">9</option> <option value="10">10</option> <option value="11">11</option> <option value="12">12</option> <option value="13">13</option> <option value="14">14</option> <option value="15">15</option> <option value="16">16</option> <option value="17">17</option> <option value="18">18</option> <option value="19">19</option> <option value="20">20</option> <option value="21">21</option> <option value="22">22</option> <option value="23">23</option> <option value="24">24</option> <option value="25">25</option> <option value="26">26</option> <option value="27">27</option> <option value="28">28</option> <option value="29">29</option> <option value="30">30</option> </select> </li> <li class="col_2 pR0 singleRoom"> <span class="mT30 fL">Room 1:</span> </li> <li class="col_2 pL0 singleRoom"> <label>Adult</label> <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onClick="adultCountDec(\'fhcAdult_1\',1)">-</span> <span id="fhcAdult_1" class="control innerTxtControl">1</span> <span class="control addMinControl plusControl" onClick="adultCountInc(\'fhcAdult_1\',1)">+</span> </div> <input type="text" placeholder="1" maxlength="3" class="aInput5 w100pcnt dN" /> <span class="fS11 fL w100pcnt">12+ yrs</span> </li> <li class="col_2 pL0 singleRoom"> <label>Children</label> <div class="passengerNum5 fL"> <span class="control addMinControl minusControl" onClick="childCountDec(\'fhcChild_1\',1),remChild(1);">-</span> <span id="fhcChild_1" class="control innerTxtControl">0</span> <span class="control addMinControl plusControl" onClick="childCountInc(\'fhcChild_1\',1),addChild(1)">+</span> </div> <input type="text" placeholder="0"  maxlength="3" class="cInput5 w100pcnt dN"/> <span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li> <li class="col_2 pL10"> <label>Infant</label><div class="passengerNum1 fL"> <span class="control addMinControl minusControl")">-</span> <span class="control innerTxtControl" id="owInfant">0</span> <span class="control addMinControl plusControl">+</span> </div><input type="text" placeholder="00" maxlength="3" class="w86 aInput1 dN blink" /><span class="fS11 fL w100pcnt">0 - 2 yrs</span> </li> <li class="col_4 mB10 singleRoom"> <ul> <li class="col_6 mB10 pR0" id="child1_1"></li> <li class="col_6 mB10 pR0" id="child1_2"></li> <li class="col_6 mB10 pR0" id="child1_3"></li> <li class="col_6 mB10 pR0" id="child1_4"></li> <li class="col_6 mB10 pR0" id="child1_5"></li> <li class="col_6 mB10 pR0" id="child1_6"></li> <li class="col_6 mB10 pR0" id="child1_7"></li> <li class="col_6 mB10 pR0" id="child1_8"></li> <li class="col_6 mB10 pR0" id="child1_9"></li> </ul> </li> </ul> </div> <div id="room2" class="singleRoom"></div> <div id="room3" class="singleRoom"></div>  <div class="cB"></div> <span class="clearfix mT10 mB10">An economy car will be added to your search. (You may change your car options later.) </span> <div class="cB"></div> <div class="mT40" onclick="chkGroupDetails(6)"> <input type="checkbox" id="GroupBooking6" /> <label for="GroupBooking6" class=" w50pcnt">Group booking request (9+Pax)</label> </div> <div id="gBookingContr6" class="dN"> <label>Add note <span class="fS12">(Max. 100 characters)</span></label> <textarea maxlength="100" id="noteContent6" class="w100pcnt mB5"></textarea> <span><span id="charCount6">0</span> of 100</span><br> <p class="fS12 mB15">Note : We do not accept group enquiries on Sundays, Holidays and Saturdays after 1300 hrs IST </p> </div>   </div>  <!--twoway start--> <div id="flight_hotel_wayContr4"> <ul class="mB10 clearfix"> <li class="col_6 pR0 pL0"> <div class="search-bar grey_border clearfix"> <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="From" id="twflightFrom1" /> <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/b2b-images/destination_from.png" /> </div> </li> <li class="col_6 pR0"> <div class="search-bar grey_border clearfix"> <input type="text" class="sfield w95pcnt" name="searchterm" placeholder="To" id="twflightTo1" /> <input type="image" class="toDestination" name="search" alt="Search" title="Search" src="images/b2b-images/destination_to.png" /> </div> </li> </ul> <ul class="row mB10 clearfix"> <li class="col_6 pR0"> <label>Departure</label> <input id="datepicker41" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_6"> <label>Return</label> <input id="datepicker42" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> </ul>  <ul class="mB10 clearfix"> <li class="col_6 pR0 pL0"> <label>Hotel</label> <div class="search-bar grey_border clearfix"> <input type="text" class="sfield city w95pcnt" name="searchterm" placeholder="Enter city" id="hotelDestination2" data-co-field="hotelLocation" /> <input type="image" class="fromDestination" name="search" alt="Search" title="Search" src="images/b2b-images/destination_from.png" /> </div>   </li> <li class="col_6 mT30"> <input type="checkbox" class="myckeckbox1" /> <label >Hotel stay at different dates</label> </li> <li class="col_12 cB"></li> <li class="col_5 pL0 pR0 mT20 dateshow dN "> <label>Check-in</label> <input id="datepicker43"  class="w100pcnt dateField "  type="text" placeholder="DD/MM/YYYY" readonly />  </li> <li class="col_5 pR0 mT20 dateshow dN "> <label>Check-out</label><input id="datepicker44"  class="w100pcnt dateField " type="text" placeholder="DD/MM/YYYY" readonly />  </li> <li class="col_2 mT20 dateshow dN"><label>Night(s)</label><input type="text" class="w100pcnt" id="nights" disabled /><span id="msg"></span> </li></ul>  <div id="rooms1"> <ul class="row mB10 mT15 clearfix"> <li id="singleRooms" class="col_2"> <label>Rooms</label> <select id="roomCount" onChange="showRooms();"> <option value="1">1</option> <option value="2">2</option> <option value="3">3</option> </select> </li> <li id="groupBookingRooms" class="col_2 dN"> <label>Rooms</label> <select> <option value="9">9</option> <option value="10">10</option> <option value="11">11</option> <option value="12">12</option> <option value="13">13</option> <option value="14">14</option> <option value="15">15</option> <option value="16">16</option> <option value="17">17</option> <option value="18">18</option> <option value="19">19</option> <option value="20">20</option> <option value="21">21</option> <option value="22">22</option> <option value="23">23</option> <option value="24">24</option> <option value="25">25</option> <option value="26">26</option> <option value="27">27</option> <option value="28">28</option> <option value="29">29</option> <option value="30">30</option> </select> </li> <li class="col_2 pR0 singleRoom"> <span class="mT30 fL">Room 1:</span> </li> <li class="col_2 pL0 singleRoom"> <label>Adult</label> <div class="passengerNum6 fL"> <span class="control addMinControl minusControl" onClick="adultCountDecrease(\'fhcAdult1_1\',1)">-</span> <span id="fhcAdult1_1" class="control innerTxtControl">1</span> <span class="control addMinControl plusControl" onClick="adultCountIncrease(\'fhcAdult1_1\',1)">+</span> </div> <input type="text" placeholder="1" maxlength="3" class="aInput6 w100pcnt dN" /> <span class="fS11 fL w100pcnt">12+ yrs</span> </li> <li class="col_2 pL0 singleRoom"> <label>Children</label> <div class="passengerNum6 fL"> <span class="control addMinControl minusControl" onClick="childCountDecrease(\'fhcChild1_1\',1),remChild1(4);">-</span> <span id="fhcChild1_1" class="control innerTxtControl">0</span> <span class="control addMinControl plusControl" onClick="childCountIncrease(\'fhcChild1_1\',1),addChild1(4)">+</span> </div> <input type="text" placeholder="0"  maxlength="3" class="cInput6 w100pcnt dN"/> <span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li><li class="col_2 pL10"> <label>Infant</label><div class="passengerNum1 fL"> <span class="control addMinControl minusControl")">-</span> <span class="control innerTxtControl" id="owInfant">0</span> <span class="control addMinControl plusControl">+</span> </div><input type="text" placeholder="00" maxlength="3" class="w86 aInput1 dN blink" /><span class="fS11 fL w100pcnt">0 - 2 yrs</span> </li> <li class="col_4 mB10 singleRoom"> <ul> <li class="col_6 mB10 pR0" id="child41"></li> <li class="col_6 mB10 pR0" id="child42"></li> <li class="col_6 mB10 pR0" id="child43"></li> <li class="col_6 mB10 pR0" id="child44"></li> <li class="col_6 mB10 pR0" id="child45"></li> <li class="col_6 mB10 pR0" id="child46"></li> <li class="col_6 mB10 pR0" id="child47"></li> <li class="col_6 mB10 pR0" id="child48"></li> <li class="col_6 mB10 pR0" id="child49"></li> </ul> </li> </ul> </div> <div id="rooms2" class="singleRoom"></div> <div id="rooms3" class="singleRoom"></div> <div class="cB"></div> <span class="clearfix mT10 mB10">An economy car will be added to your search. (You may change your car options later.) </span> <div class="cB"></div> <div class="mT40" onclick="chkGroupDetails(8)"> <input type="checkbox" id="GroupBooking8" /> <label for="GroupBooking8" class=" w50pcnt">Group booking request (9+Pax)</label> </div> <div id="gBookingContr8" class="dN"> <label>Add note <span class="fS12">(Max. 100 characters)</span></label> <textarea maxlength="100" id="noteContent8" class="w100pcnt mB5"></textarea> <span><span id="charCount8">0</span> of 100</span><br> <p class="fS12 mB15">Note : We do not accept group enquiries on Sundays, Holidays and Saturdays after 1300 hrs IST </p> </div> <div class="cB"></div>   </div>  <div class="cB"></div> <span class="fR"><span class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);">Add</a></span><span class="tertiaryBtn fL mT15 mB15 mR10"><a href="javascript:void(0);">Cancel</a></span></span>');
	}
	if(optText== 'Forex')
	{
	$('#globalSrcContrnew').html('<ul class="mB10 clearfix"> <li class="col_3  pL0"><input type="radio" name="options" checked="checked" onclick="buyForex()"/> <label>Buying</label></li> <li class="col_3 pR0 pL0"><input type="radio" name="options" onclick="sellForex();"/> <label>Selling</label></li></ul><ul class="mB10 clearfix"> <li class="col_3 pR0 pL0"> <label>Purpose of Travel</label> <select> <option value="Personal">Personal</option> <option value="Personal">Personal</option> </select> </li> </ul> <ul class="row mB10 clearfix"> <li class="col_4  "> <label>Product</label> <select> <option value="cash">Cash</option> <option value="cash">Cash</option> </select> </li> <li class="col_4  "> <label>Currency</label> <select> <option value="usdollar">US Dollar</option> <option value="euro">Euro</option> </select> </li> <li class="col_4 "> <label>Amount</label> <input type="text" placeholder="Amount" id="forexinpt1" class="w100pcnt" style="color:#000 !important" /> </li> </ul><ul class="row mB10 clearfix "> <li class="col_4 "> &nbsp; </li> <li class="col_4   "> <div class="detailContr"></div> <div class="detailContr_inner tC clearfix"> Rate: Rs. 64.56  </div> </li> <li class="col_4  forexview1_amt dN"> <div class="detailContr"></div> <div class="detailContr_inner tC clearfix"> Amount: <span id="amtshow">1, 04,000</span>  </div> </li> </ul> <ul class="mT20 clearfix"> <li class="clearfix mT10"><span><a href="javascript:void(0);" class="add_traveller_button"><span class="add_details_icon mR5"></span><span class="posR">Add More</span></a></span> </li> </ul> <ul class="row mB10 mT10 clearfix"> <li class="col_4  clearfix"> <label>Pickup location</label> <select> <option value="dadar">Dadar</option> <option value="andheri">Andheri</option> </select> </li> <li class="col_4  clearfix"> <label>Mobile number</label> <input type="text" placeholder="Mobile number" class="w100pcnt " />  </li> <li class="col_4 "> <label>Email Address</label> <input type="text" placeholder="Email Address" class="w100pcnt " /> </li> </ul><div class="cB"></div> <span class="fR"><span class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);">Add</a></span><span class="tertiaryBtn fL mT15 mB15 mR10"><a href="javascript:void(0);">Cancel</a></span></span>');
	}
	
	if(optText== 'Rail')
	{
	$('#globalSrcContrnew').html('<ul class="flightWayTab mB20 clearfix"> <li class="first sel" id="way15"><a href="javascript:void(0);" onclick="eurailtype1(\'way15\', \'wayContr15\'),reset()">Ticket</a></li> <li class="" id="way16"><a href="javascript:void(0);" onclick="eurailtype1(\'way16\', \'wayContr16\'),reset()">Pass</a></li> <li class="last" id="way17"><a href="javascript:void(0);" onclick="eurailtype1(\'way17\', \'wayContr17\'),reset()">Reservation</a></li> </ul> <div id="wayContr15" class="clearfix">  <ul class="mB10 clearfix"> <li class="col_2_half pR0 pL0"> <label>Starting from</label> <input type="text" class="w95pcnt" name="startfrom" placeholder="From" /> </li> <li class="col_1 pR0"> <span class="mT20 tC oneway_icon"> </li> <li class="col_2_half pR0 pL0"> <label>Going to</label> <input type="text" class="w95pcnt" name="to" placeholder="To" /> </li> <li class="col_2_half pR0 pL0"> <label>Departure</label> <input id="datepicker12" class="w90pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_2 pR0 pL0"> <label>Time</label> <select> <option value="08:00">08:00</option> </select> </li> </ul> <div id="addfields"> </div> <div class="fR clearfix mB10  pR0"> <div class="fR mT10"><a href="javascript:void(0);" id="addfieldbtn"><span class="add_details_icon mR5 fL"></span><span class="posR fL" >Add city</span></a></div> </div> <ul class="row mB10">  <li class="col_2 pR10"> <label>Adult</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'owChild5\')">-</span> <span class="control innerTxtControl" id="owChild5">1</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'owChild5\')">+</span> </div> <span class="fS11 fL w100pcnt">26 - 59 yrs</span> </li><li class=" col_2 pR10"> <label>Child</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Child\')">-</span> <span class="control innerTxtControl" id="Child">0</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Child\')">+</span> </div><span class="fS11 fL w100pcnt">0 - 12 yrs</span> </li> <li class="col_2 pR10"> <label>Youth</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Youth\')">-</span> <span class="control innerTxtControl" id="Youth">1</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Youth\')">+</span> </div>  <input type="text" placeholder="00" maxlength="3" class="w86 aInput1 dN" /> <span class="fS11 fL w100pcnt">12 - 26 yrs</span> </li> <li class="col_2 pR10"> <label>Senior</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Senior\')">-</span> <span class="control innerTxtControl" id="Senior">0</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Senior\')">+</span> </div> <span class="fS11 fL w100pcnt">59+ yrs</span> </li> </ul> <div class="cB"></div>  <div class="col_12 fL pL0 mB20 mT20"> <a href="javascript:void(0)" class="eurailopt"> + Eurail options (class, stops, refunds)</a> <section class= " col_12 pL0 pR0 clearfix dN eurailoptdetails" style="display: none;"> <ul class="row clearfix"> <li class="col_4 mT20"> <label>Class</label> <select class="w100pcnt"> <option value="economy">Economy</option> </select> </li> <li class="col_4 pL0 pR0" style="margin-top:50px;"><input type="checkbox"> <label>Show me direct trains only</label> </li> <li class="col_4 pL0 pR0" style="margin-top:50px;"><input type="checkbox"> <label>Show me refundable ticket only</label> </li>  </ul> </section> </div>  </div> <div id="wayContr16" class="dN"> <ul class="mB10 clearfix"> <li class="col_5 pL0"> <label>Country</label> <input type="text" class="w95pcnt" name="Country" placeholder="Country" /> </li> <li class="col_3"> <label>No. of days</label> <select> <option value="1">1</option> </select> </li> </ul> <div id="addcountry"> </div> <div class="col_10 clearfix mB10 mR20"> <div class="mT10 fR"><a href="javascript:void(0);" id="addcountrybtn"><span class="add_details_icon mR5 fL"></span><span class="posR fL">Add Country</span></a></div>  </div>  <ul class="row mB10 clearfix">  <li class="col_2"> <label>Adult</label> <div class="passengerNum2 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'twChild6\')">-</span> <span class="control innerTxtControl" id="twChild6">1</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'twChild6\')">+</span> </div> <span class="fS11 fL w100pcnt">26 - 59 yrs</span> </li><li class=" col_2 pR10"> <label>Child</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Child21\')">-</span> <span class="control innerTxtControl" id="Child21">0</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Child21\')">+</span> </div><span class="fS11 fL w100pcnt">0 - 12 yrs</span> </li> <li class="col_2 pR10"> <label>Youth</label>  <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Youth1\')">-</span> <span class="control innerTxtControl" id="Youth1">1</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Youth1\')">+</span> </div>  <span class="fS11 fL w100pcnt">12 - 26 yrs</span> </li> <li class="col_2 pR10"> <label>Senior</label> <div class="passengerNum2 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Senior1\')">-</span> <span class="control innerTxtControl" id="Senior1">0</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Senior1\')">+</span> </div> <span class="fS11 fL w100pcnt">59+ yrs</span> </li> </ul> <div class="cB"></div> </div> <div id="wayContr17" class="clearfix dN"> <ul class="mB10 clearfix"> <li class="col_6 pR0 pL0"> <label>Select pass</label> <select class="w80pcnt pT5"> <option>Algeria</option> </select> </li>  <li class="col_2 mT20 pR0 pL0"> <input type="radio" name="class" checked="checked"/><label>Economy</label> </li> <li class="col_2 mT20 pR0 pL0"> <input type="radio" name="class" /><label>Comfort</label> </li> <li class="col_2 mT20 pR0 pL0"> <input type="radio" name="class" /><label>Premiere</label> </li> </ul> <ul class="mT20 clearfix"> <li class="col_2_half pR0 pL0"> <label>Starting from</label> <input type="text" class="w95pcnt" name="startfrom" placeholder="From" /> </li> <li class="col_1 pR0"> <span class="mT20 tC oneway_icon"></span> </li> <li class="col_2_half pR0 pL0"> <label>Going to</label> <input type="text" class="w95pcnt" name="to" placeholder="To" /> </li> <li class="col_3 pR0 "> <label>Departure</label> <input id="datepicker13" class="w86pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_2 pR0 pL0"> <label>Time</label> <select> <option value="08:00">08:00</option> </select> </li> </ul> <div id="addfieldsreserv"> </div> <div class="col_12 clearfix mB10 pR0"> <div class="fR mT10"><a href="javascript:void(0);" id="addfieldreservbtn"><span class="add_details_icon mR5 fL"></span><span class="posR fL" >Add city</span></a></div> </div> <ul class="row mB10">  <li class="col_2 pR10"> <label>Adult</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'owChild7\')">-</span> <span class="control innerTxtControl" id="owChild7">1</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'owChild7\')">+</span> </div> <span class="fS11 fL w100pcnt">26 - 59 yrs</span> </li><li class=" col_2 pR10"> <label>Child</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Child32\')">-</span> <span class="control innerTxtControl" id="Child32">0</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Child32\')">+</span> </div><span class="fS11 fL w100pcnt">0 - 12 yrs</span> </li> <li class="col_2 pR10"> <label>Youth</label>  <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Youth3\')">-</span> <span class="control innerTxtControl" id="Youth3">1</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Youth3\')">+</span> </div>  <input type="text" placeholder="00" maxlength="3" class="w86 aInput1 dN" /> <span class="fS11 fL w100pcnt">12 - 26 yrs</span> </li> <li class="col_2 pR10"> <label>Senior</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec(\'Senior3\')">-</span> <span class="control innerTxtControl" id="Senior3">0</span> <span class="control addMinControl plusControl" onclick="cCountInc(\'Senior3\')">+</span> </div> <span class="fS11 fL w100pcnt">59+ yrs</span> </li> </ul>  <div class="cB"></div>  </div><div class="clearfix"></div> <span class="fR"><span class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);">Add</a></span><span class="tertiaryBtn fL mT15 mB15 mR10"><a href="javascript:void(0);">Cancel</a></span></span>');
	}
	if(optText== 'Insurance')
	{
	$('#globalSrcContrnew').html('<ul class="col_12 mT10 mB10 clearfix"><li class="col_4 pL0"><label>Destination</label><select><option>All</option><option>India</option><option>China</option><option>USA</option></select></li><li class="col_4 pL0"><label>Insurance Type</label><select><option>Select</option><option>Corporate</option><option>Leisure</option><option>Senior Citizen</option></select></li><li class="col_4 pL0"><label>No. Of Trips</label><select id="security_question_1" name="security_question_1" onchange="check_dd();"><option value="Single"> Single</option><option value="Multiple"> Multiple</option></select></li></ul><div id="single_entry"><ul class="col_12 mT10 mB10 clearfix"> <li class="col_4_half pL0"> <label>Departure</label> <input id="datepicker45" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_4_half pL0"> <label>Arrival</label> <input id="datepicker46" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_3 pL0"> <label>Day(s)</label> <input type="text" class="w100pcnt" placeholder="0" disabled /></li></ul></div><div id="multiple_entry" style="display:none;"><ul class="col_12 mT10 mB10 clearfix"> <li class="col_4_half pL0"> <label>Start Date</label> <input id="datepicker45" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" readonly /> </li> <li class="col_4_half pL0"> <label>Arrival</label> <input id="datepicker46" class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY" disabled /> </li> <li class="col_3 pL0"> <label>Duration</label> <select><option>30 Days</option><option>45 Days</option><option>60 Days</option></select> </li> </ul> </div><div class="col_2 pR0 mT40"><span class=" mT10 fW500 clearfix">Date Of Birth</span></div> <div class="col_8 pL0"><ul class="col_12 mT10 mB10 clearfix"> <li class="col_12 pL0 pR0 mB10 clearfix cB"><label>Traveller1</label><select class="pD0 fL mR10 w60"><option value="dd.">dd</option> </select>	<select class="pD0 mR10 w60 fL"><option value="mm">mm</option> </select> <select class="fL mR10 w130"><option value="yyyy">yyyy</option> </select> </li> <li class="col_12 pL0 clearfix cB"> <span class="input_traveller_wrap"></span> </li> </ul><span class="dB w100pcnt mT10 mB20 tR clearfix"><a href="javascript:void(0);" class="add_traveller_button"><span class="add_details_icon mR5 valign"></span><span class="posR">Add Traveller</span></a></span> </div><div class="clearfix"></div> <span class="fR"><span class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);">Add</a></span><span class="tertiaryBtn fL mT15 mB15 mR10"><a href="javascript:void(0);">Cancel</a></span>	</span>');
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
			$(this).find('img').attr('src','images/b2b-images/search_icon.png');		   
		}else{
			$(this).find('img').attr('src','images/b2b-images/search_icon.png');
		}
	});	
    $( "#search" ).catcomplete({
      delay: 0,
      source: data,
	  width: 350
				
    });
  });
 
	tabContainer.css('display', 'block').trigger('click');
	$('div#moreNavnew > a').trigger('click');
	var optCont = $('ul#moreOptnew');
	optCont.removeClass('show_options').css('display', 'none');
	$("#moreNavnew").removeClass('sel');
	
		
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
            $(this).find('img').attr('src','images/b2b-images/expand_blu.png');           
        }else{
            $(this).find('img').attr('src','images/b2b-images/collapse_blu.png');
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
function addTab(obj){
	aa = obj.innerHTML;
	var el = document.getElementById("mainNavnew");
	var li = document.createElement("li");
	var fn = 'selMainSrc("globalSrcTabnew", "globalSrcContrnew")';
		li.innerHTML = "<li id='globalSrcTabnew'><a href='javascript:void(0);' onclick='" + fn + "' id='addedTab'>" + aa + "</a></li>";
		if ( $('ul#mainNavnew li').length < 5 ) {
			el.appendChild(li);
		}
	document.getElementById('addedTab').innerHTML = aa;
	if(document.getElementById('moreOptnew').style.display == 'block'){
		document.getElementById('moreOptnew').style.display = 'none';
		document.getElementById('moreNavnew').className = 'addTabNavnew'
	}
	else{
		document.getElementById('moreOptnew').style.display = 'block';
		document.getElementById('moreNavnew').className = 'addTabNavnew sel'	
	}
}
function globalSrc(tab, contr){
	for(i=6; i<=10; i++){
		document.getElementById('globalSrcTab'+i).className = '';
		document.getElementById('globalSrcContr'+i).style.display = 'none';
		if(i==10){
			document.getElementById('globalSrcTab'+i).className = 'last';	
		}
	}
	document.getElementById(tab).className = 'sel';
	document.getElementById(contr).style.display = 'block'
}
//handle tab
$('#mainNavnew li').click(function(evt) {
	evt.preventDefault();
	evt.stopPropagation();
	$('#mainNavnew li').removeClass('sel');
	$('.tab_content_new').css('display', 'none');
	$(this).addClass('sel');
	var content = $(this).attr('data-container');
	$('#' + content).css('display', 'block');
	var optCont = $('ul#moreOptnew');
	optCont.removeClass('show_options').css('display', 'none');
	$("#moreNavnew").removeClass('sel');
});

$('div#moreNavnew > a').bind('click', function(evt) {
        evt.preventDefault();
        evt.stopPropagation();
        var optCont = $('ul#moreOptnew');
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
$(document).ready(function()
{

	
$('body').bind('click', function(evt) {
		$('#productNav, #moreNavnew, #reportNav, #settingNav, #dotproductNav,#addNav').removeClass('sel');
		$('#productOpt, #moreOptnew, #reportOpt, #settingOpt,#addOpt').hide();
		
		/*
		if( $('.hotelMenu').exists()){
			$('#hotelTab1, #hotelTab2, #hotelTab3, #hotelTab4, #hotelTab5').removeClass('sel');
			$('#hotelContr1, #hotelContr2, #hotelContr3, #hotelContr5').hide();
		}
		*/
		
		//reset moreOptions (+)
		var moreCont = $('ul#moreOptnew');
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
function hideDD(){
	if(document.getElementById('moreOptnew').style.display == 'block'){
		document.getElementById('moreOptnew').style.display = 'none';
		document.getElementById('moreNavnew').className = 'addTabNavnew'
	}
	else{
		document.getElementById('moreOptnew').style.display = 'block';
		document.getElementById('moreNavnew').className = 'addTabNavnew sel'	
	}	
}