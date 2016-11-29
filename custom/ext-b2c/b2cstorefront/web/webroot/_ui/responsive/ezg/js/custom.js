//added by aizijie start
var firtPn5 = $("#priNav5").data("name");
$(".showHideTab").on("click",function(){
	var pn5 = $("#priNav5").data("name");
	var name = $(this).data("name");
	var index = $(this).data("index");
	console.log(firtPn5+"|"+pn5+"|"+name+"|"+index);
	$('#priNav5').html('<a href="javascript:void(0);"><span class="morePnl' + index + ' fL" style="top:16px"></span>' + name + '</a>');
	$("#mainNav li").parent().find('li').removeClass("sel");
	$("#priNav5").addClass("sel").data("name",name);
	$("#primary_navigation_containerpriNav5").addClass("dN");
	$("#primary_navigation_containerpriNav5").removeAttr("id");
	if(firtPn5==name){
		$(".special5").attr('id', 'primary_navigation_containerpriNav5');
	}else{
		$(".NavNewTab" + index).attr('id', 'primary_navigation_containerpriNav5');
	}
	$(".tabContent").each(function() {
		$(this).hide();
	});
	$("#primary_navigation_containerpriNav5").show();
	$("#moreOptions").hide();
	$(this).data("name",pn5).html('<a href="javascript:void(0);"><span class="morePnl'+index+' fL"></span>'+pn5+'</a>');
});
//added by aizijie end
$('#nametigger').on('click', function(e)  {
		// Show/Hide Tabs
		$('.tabs ' + '#seat').show().siblings().hide();

		// Change/remove current tab to active
		$('#selectOpt').parent('li').addClass('sel').siblings().removeClass('sel');

		e.preventDefault();
	});
	$('#selectbank').on('change', function(e)  {
		$('#city').show();
	});
	function shytravel()
	{
		document.getElementById('itenararyadded').style.display = 'block';
		document.getElementById('btnTravel').style.display = 'none';
	}
	//if ($('#nav-anchor1').exists())
	//{

	//$(window).scroll(function(){
	//var window_top = $(window).scrollTop() + 12; // the "12" should equal the margin-top value for nav.stick
	//var div_top = $('#nav-anchor1').offset().top;
	//if (window_top > div_top) {
	//	$('nav.secNav1').addClass('stick').removeClass("row");
	//} else {
	//$('nav.secNav1').removeClass('stick').addClass("row");
	//}
	//	});




	//} 
	function showMoreMembers(){
		if(document.getElementById('moreMember').style.display == 'block'){
			document.getElementById('moreMember').style.display = 'none'
			document.getElementById('moreMemberTab').className = 'morediy fL posR';	
		}
		else{
			document.getElementById('moreMemberTab').className = 'morediy fL posR sel';
			document.getElementById('moreMember').style.display = 'block';
		}

		$(document).mouseup(function (e)
							{
								var container = $("#moreMember");
								if (!container.is(e.target) // if the target of the click isn't the container...
									&& container.has(e.target).length === 0) // ... nor a descendant of the container
								{
									if($(".moreOptionsPage").exists()){
										$("#moreMemberTab").addClass("sel");
										container.hide();
									}
									else{
										container.hide();
										$("#moreMemberTab").removeClass("sel");
									}


								}

							});

	}
	$('#addmember').on('click', function (e) {

		$('#addOpt').toggle('slow');
	});
	$('.wishBtn').on('click', function (e) {

		$('#show_wish_panel_top').show();
	});
	$('.viewedBtn').on('click', function (e) {

		$('#show_cruise_panel_top').show();
	});
	//infant count increment
	function infantCountIncr(id,cntr){
		infant_Count = document.getElementById(id).innerHTML;
		if(infant_Count < 9){
			infant_Count++;
			document.getElementById(id).innerHTML = infant_Count;
		}
	}

	//Infant count decrement
	function infantCountDecr(id,cntr){
		infant_Count = document.getElementById(id).innerHTML;
		if(infant_Count > 0){
			infant_Count--;
			document.getElementById(id).innerHTML = infant_Count;
		}
	}

	$(".viewAllCalendarDates").click( function(){
		$(this).toggleClass('sel');
		$(".calendarContainer").toggle();

		if ($(this).hasClass('sel')) {
			$(this).find('img').attr('src', ezgImagesPath + '/common/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src', ezgImagesPath + '/common/collapse_blu.png');
		}


	});

	$('#forexinpt1').on('change', function (e) {

		$('#amtshow').html($('#forexinpt1').val() *64);

		$('.forexview1_amt').show("slow");
	});
	
function calloutclose(light){
	document.getElementById(light).style.display='none';
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
});
function mail(tab, contr){
	for(i=1; i<=6; i++){
		document.getElementById('emailTab'+i).className = '';
		document.getElementById('emailContr'+i).style.display = 'none';
		if(i==6){
			document.getElementById('emailTab'+i).className = 'last';	
		}
	}
	document.getElementById(tab).className = 'sel';
	document.getElementById(contr).style.display = 'block'
}
$(document).ready(function () {
$('#flightOpt1').on('click', function (e) {
$("#flightContr1").slideToggle("slow");
$(this).toggleClass("active");
if ($(this).hasClass('active')) {
$(this).find('img').attr('src', ezgImagesPath + '/common/expand_blu.png');
}else{
$(this).find('img').attr('src', ezgImagesPath + '/common/collapse_blu.png');
}
});
});

	
$(document).ready(function() {
$('.cancelservice1').click(function(){

$(".addServicesContr").addClass("dN")
$("#servicesContainer1,#servicesContainer2,#servicesContainer3").hide();
$()
$("#services1,#services2,#services3").removeClass("sel")
$("#addServiceBtn1 ").addClass('button-primary');

});
$('.cancelservice2').click(function(){

$(".addServicesContr").addClass("dN")
$("#servicesContainer1,#servicesContainer2,#servicesContainer3").hide();
$("#services1,#services2,#services3").removeClass("sel");
$("#addServiceBtn2 ").addClass('button-primary');

});
$('.cancelservice3').click(function(){

$(".addServicesContr").addClass("dN")
$("#servicesContainer1,#servicesContainer2,#servicesContainer3").hide();
$("#services1,#services2,#services3").removeClass("sel");
$("#addServiceBtn3 ").addClass('button-primary');

});
});	
function addServices(){
	$("#addedServices").show();
	$(".addServices").removeClass("sel")
	$("#addServiceBtn1").removeClass("button-primary");
	$("#addServiceBtn1").addClass("button-secondary");
	$("#addServiceBtn1").parent('div').removeAttr("onclick")
	$(".addServicesContr").addClass("dN")
	$(".addServiceBtnTxt").html("Added")
	
	
}
function deleteServices(serviceNo){
	$("#addedServices").hide();
	$("#addServiceBtn1 ").removeClass("button-secondary");
	$("#addServiceBtn1 ").addClass("button-primary");
	$("#addServiceBtn1").parent('div').attr("onclick","showServices(1)");
	$(".addServicesContr").addClass("dN")
	$("#servicesContainer1,#servicesContainer2,#servicesContainer3").hide();
	$(".addServiceBtnTxt").html("Add");
	$(".addServices").removeClass("sel")
	
}

function showServices(serviceNo){
	$(".addServicesContr").removeClass("dN") 
	$("#servicesContainer1,#servicesContainer2,#servicesContainer3").hide();
	$("#services1,#services2,#services3").removeClass("sel")
	$("#addServiceBtn1,#addServiceBtn2,#addServiceBtn3").removeClass("button-primary ");
	$("#addServiceBtn1,#addServiceBtn2,#addServiceBtn3").addClass("button-primary ");
	$("#servicesContainer" + serviceNo).show();
	$("#services" + serviceNo).addClass("sel") ;
	$("#addServiceBtn" + serviceNo  ).removeClass("button-primary");
}



$(document).ready(function () {
    $('#gname').on('keyup change', function() {
        if (this.value > 70) {
            $('#number').show();
        } else {
            $('#number').hide();
        }
    });   
    $('#addInsurance').on('change', function() {
        if ($('#addInsurance').is(':checked')) {
            $('.insurance_add').show();
        } else {
            $('.insurance_add').hide();
        }
    });
    $('#addBaggage2').on('change', function() {
        if ($('#addBaggage2').val() == '1' ) {
            $('.addbag2').show();
        } else {
            $('.addbag2').hide();
        }
    });   
	
   $('.diyContr .flightWay a').on('click', function(e)  {
        var currentAttrValue = $(this).attr('href');
		// Show/Hide Tabs
        $('.diyContr ' + currentAttrValue).show().siblings().hide();
		$(".flightWay").show();
      // Change/remove current tab to active
        $(this).parent('li').addClass('sel').siblings().removeClass('sel');
        e.preventDefault();
    });
	
$('#childActivity1').on('change', function (e) {
		var countchild=$('#childActivity1').val();
		$('#activitychildage1').html('');
		var string='';
		for(i=1;i<=countchild;i++)
		{
			string +='<li class="col_3 pL0  clearfix"> <label >Child '+i+'</label> <select class="mB10 "><option>Age</option><option>1</option><option>2</option><option>3</option><option>4</option><option>5</option><option>6</option><option>7</option><option>8</option><option>9</option><option>10</option><option>11</option><option>12</option></select> </li>';
		}
		$('#activitychildage').html(string);

	});	
	function addServices(){
		$("#addedServices").show();
		$(".addServices").removeClass("sel")
		$("#addServiceBtn1").removeClass("button-primary");
		$("#addServiceBtn1").addClass("button-secondary");
		$("#addServiceBtn1").parent('div').removeAttr("onclick")
		$(".addServicesContr").addClass("dN")
		$(".addServiceBtnTxt").html("Added")


	}
	function deleteServices(serviceNo){
		$("#addedServices").hide();
		$("#addServiceBtn1 ").removeClass("button-secondary");
		$("#addServiceBtn1 ").addClass("button-primary");
		$("#addServiceBtn1").parent('div').attr("onclick","showServices(1)");
		$(".addServicesContr").addClass("dN")
		$("#servicesContainer1,#servicesContainer2,#servicesContainer3").hide();
		$(".addServiceBtnTxt").html("Add");
		$(".addServices").removeClass("sel")

	}

	function showServices(serviceNo){
		$(".addServicesContr").removeClass("dN") 
		$("#servicesContainer1,#servicesContainer2,#servicesContainer3").hide();
		$("#services1,#services2,#services3").removeClass("sel")
		$("#addServiceBtn1,#addServiceBtn2,#addServiceBtn3").removeClass("button-primary ");
		$("#addServiceBtn1,#addServiceBtn2,#addServiceBtn3").addClass("button-primary ");
		$("#servicesContainer" + serviceNo).show();
		$("#services" + serviceNo).addClass("sel") ;
		$("#addServiceBtn" + serviceNo  ).removeClass("button-primary");
	}



	$(document).ready(function () {
		$('#gname').on('keyup change', function() {
			if (this.value > 70) {
				$('#number').show();
			} else {
				$('#number').hide();
			}
		});   
		$('#addInsurance').on('change', function() {
			if ($('#addInsurance').is(':checked')) {
				$('.insurance_add').show();
			} else {
				$('.insurance_add').hide();
			}
		});
		$('#addBaggage2').on('change', function() {
			if ($('#addBaggage2').val() == '1' ) {
				$('.addbag2').show();
			} else {
				$('.addbag2').hide();
			}
		});   

		$('.diyContr .flightWay a').on('click', function(e)  {
			var currentAttrValue = $(this).attr('href');
			// Show/Hide Tabs
			$('.diyContr ' + currentAttrValue).show().siblings().hide();
			$(".flightWay").show();
			// Change/remove current tab to active
			$(this).parent('li').addClass('sel').siblings().removeClass('sel');
			e.preventDefault();
		});

		$('#childActivity1').on('change', function (e) {
			var countchild=$('#childActivity1').val();
			$('#activitychildage1').html('');
			var string='';
			for(i=1;i<=countchild;i++)
			{
				string +='<li class="col_3 pL0  clearfix"> <label >Child '+i+'</label> <select class="mB10 "><option>Age</option><option>1</option><option>2</option><option>3</option><option>4</option><option>5</option><option>6</option><option>7</option><option>8</option><option>9</option><option>10</option><option>11</option><option>12</option></select> </li>';
			}
			$('#activitychildage').html(string);
		});	
		$('#childActivity').on('change', function (e) {
			var countchild=$('#childActivity').val();
			$('#activitychildage').html('');
			var string='';
			for(i=1;i<=countchild;i++)
			{
				string +='<li class="col_4 pL0  clearfix"> <label >Passenger '+i+'</label> <select class="mB10 "><option>Age</option><option>1</option><option>2</option><option>3</option><option>4</option><option>5</option><option>6</option><option>7</option><option>8</option><option>9</option><option>10</option><option>11</option><option>12</option></select> </li>';
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
		$('.selDocument').on('click', function (e) {
			$(this).parents('li').find('.costDStricture').slideToggle();
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text(' - Documents required for students over 18 traveling alone');		   
			}else{
				$(this).text(' + Documents required for students over 18 traveling alone');
			}
		});
	});
	$(document).ready(function () {
		$('#holidayview').on('click', function (e) {
			$("#holidaydetails").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('- More (Frequent flyer, meal preference, seat preference, special requests');	   
			}else{
				$(this).text('+ More (Frequent flyer, meal preference, seat preference, special requests');
			}
		});	
	});
	$(document).ready(function () {
		$('#emailsignup').on('keyup', function (e) {
			$('#div_1').show();
		});	
	});
	$(document).ready(function () {
		$('#flighthotelview').on('click', function (e) {
			$("#flighthoteldetails").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('- More (Frequent flyer, meal preference, seat preference, special requests');	   
			}else{
				$(this).text('+ More (Frequent flyer, meal preference, seat preference, special requests');
			}
		});	
	});
	$(function(){
		$('#btn-upload').click(function(e){
			e.preventDefault();
			$('#file').click();}
							  );
	});
	$(function(){
		$('#btn-upload1').click(function(e){
			e.preventDefault();
			$('#file1').click();}
							   );
	});
	$(function(){
		$('#btn-upload2').click(function(e){
			e.preventDefault();
			$('#file2').click();}
							   );
	});
	function showbrowse(id)
	{
		$('#file'+id).click();
	}

	function addtoCart(id)
	{

		$("#mycarousel2").jcarousel('add',id,'<li class="clearfix fL pD5 pL0 searchedResult" style="width:285px" id="selectContainer'+id+'"><div class="fL mR10 mT5 mB5"> <img src="images/activities/activity1.jpg" alt="Hotel Thumb"> </div><div class="fL"><div class="fcWht">Bangkok forest bike tour</div><div class="fS11 fcWht">7 Days / 6 Nights</div><div class="fS11 fcWht mB5">Port Blair | Havelock | Neil Island</div><div class="clearfix"><div class="fS22 fW400 fL fcWht"><span class="rupee">Rs</span>86,000</div></div></div><img src="Images/bin.png" class="fR dB" alt="" id="dirImg2" onclick="removeFrmCart('+id+')" /></li>');

		$('#mycarousel2').jcarousel('reload');
		$("#shopping_cart_panel").show();
		$("#shoppingCartTab").addClass('sel');
		$(".footerContactDetail").addClass("activated");
		$('#priceBox').show();
	}
	function removeFrmCart(id)
	{
		$('#selectContainer'+id).remove();
		var countli = $("#cart li").length;
		if(countli == 0)
			{
				$('#priceBox').hide();
				$("#shopping_cart_panel").hide();
				$("#shoppingCartTab").removeClass('sel');
				$(".footerContactDetail").removeClass("activated");
			}
	}
	$(document).ready(function() {
		var max_fields      = 10; //maximum input boxes allowed
		var wrapper         = $(".add_city_index11"); //Fields wrapper
		var add_button      = $(".add_city_button_index11"); //Add button ID
		var x1=1; //initial text box count
		var x2=21;
		var x3=38;
		var x4=51;
		var id1=0;
		var id2=1;
		var id3=1;
		var id4=1;
		$(add_button).click(function(e){ //on add input button click
			e.preventDefault();
			if(x1 < max_fields || x2 < max_fields || x3 < max_fields || x4 < max_fields){ //max input box allowed
				x1++; //text box increment
				x2++;
				x3++;
				x4++;			//text box increment
				id1=0+x1;
				id2=1+x2;
				id3=1+x3;
				id4=1+x4;
				$(wrapper).append('<ul class="mB10 clearfix"><li class="col_5"><label>Flight '+id1+':</label><input autocomplete="off" class="w100pcnt ui-autocomplete-input" placeholder="From" type="text"></li><li class="next col_3"><label>&nbsp;</label><input autocomplete="off" class="w100pcnt ui-autocomplete-input" placeholder="To" type="text"></li><li class="col_3"><label>Depart</label><input id="datepicker'+id2+'" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="" type="text"></li><li class="next cB mT10 col_5"><input type="checkbox"><label class="fS12">Need hotel in Delhi</label></li><li class="mT10 col_3"><label>Check in</label><input id="datepicker'+id3+'" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="" type="text"></li><li class="mT10 col_3"><label>Check out</label><input id="datepicker'+id4+'" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="" type="text"></li><li class="col_1 mT30 pR0 remove_field"><span class="show_contr_close"></span></li></ul>'); //add input box

			}

		});


		$(wrapper).on("click",".remove_field", function(e){ //user click on remove text
			e.preventDefault(); $(this).parent('ul').remove(); x1--;x2--;id1--;id2--;x3--;x3--;id4--;id4--;
		})

	});

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
				$(wrapper1).append('<ul class="mB20 clearfix mT10 mL20"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="show_contr_close"></span> </li></ul>'); //add input box
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
				$(wrapper1).append('<ul class="mB20 clearfix mT10 mL20"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="show_contr_close"></span> </li></ul>'); //add input box
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
				$(wrapper1).append('<ul class="mB20 clearfix mT10 mL20"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="show_contr_close"></span> </li></ul>'); //add input box
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
				$(wrapper1).append('<ul class="mB20 clearfix mT10 mL20"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="show_contr_close"></span> </li></ul>'); //add input box
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
				$(wrapper1).append('<ul class="mB20 clearfix mT10 mL20"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="show_contr_close"></span> </li></ul>'); //add input box
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
				$(wrapper1).append('<ul class="mB20 clearfix mT10 mL20"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="show_contr_close"></span> </li></ul>'); //add input box
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
				$(wrapper1).append('<ul class="mB20 clearfix mT10 mL20"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="show_contr_close"></span> </li></ul>'); //add input box
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
		var id1=75;
		var id2=76;
		var x1= 1;
		var x2= 2;	//initlal text box count
		$(add_button1).click(function(e){ //on add input button click
			e.preventDefault();
			if(x1 < max_fields){ //max input box allowed
				x1++; //text box increment
				id1=75+x1;
				id2=76+x2;
				$(wrapper1).append('<ul class="mB20 clearfix mT10 mL20"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="show_contr_close"></span> </li></ul>'); //add input box
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
		var id1=85;
		var id2=86;
		var x1= 1;
		var x2= 2;	//initlal text box count
		$(add_button1).click(function(e){ //on add input button click
			e.preventDefault();
			if(x1 < max_fields){ //max input box allowed
				x1++; //text box increment
				id1=85+x1;
				id2=86+x2;
				$(wrapper1).append('<ul class="mB20 clearfix mT10 mL20"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="show_contr_close"></span> </li></ul>'); //add input box
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
		var id1=95;
		var id2=96;
		var x1= 1;
		var x2= 2;	//initlal text box count
		$(add_button1).click(function(e){ //on add input button click
			e.preventDefault();
			if(x1 < max_fields){ //max input box allowed
				x1++; //text box increment
				id1=95+x1;
				id2=96+x2;
				$(wrapper1).append('<ul class="mB20 clearfix mT10 mL20"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="show_contr_close"></span> </li></ul>'); //add input box
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
		var id1=105;
		var id2=106;
		var x1= 1;
		var x2= 2;	//initlal text box count
		$(add_button1).click(function(e){ //on add input button click
			e.preventDefault();
			if(x1 < max_fields){ //max input box allowed
				x1++; //text box increment
				id1=105+x1;
				id2=106+x2;
				$(wrapper1).append('<ul class="mB20 clearfix mT10 mL20"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="show_contr_close"></span> </li></ul>'); //add input box
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
		var id1=115;
		var id2=116;
		var x1= 1;
		var x2= 2;	//initlal text box count
		$(add_button1).click(function(e){ //on add input button click
			e.preventDefault();
			if(x1 < max_fields){ //max input box allowed
				x1++; //text box increment
				id1=115+x1;
				id2=116+x2;
				$(wrapper1).append('<ul class="mB20 clearfix mT10 mL20"><li class="col_4 pR10 pL0 mT15"><input type="text" class="w100pcnt"name="upload" value="Upload" style="color: rgb(170, 170, 170);"></li><li class="col_6 pR10 pL0"><label>&nbsp;</label><span class="primaryBtn_sml"><input type="file" id="file'+id1+'" name="file"><span id="btn-upload'+id2+'"><a href="javascript:void(0);" onclick="showbrowse('+id1+')">Browse</a></span></span><span class="tertiaryBtn_sml mL5"><a href="#">Upload</a></span></li><li class="col_1 mT30 pR0 remove_field"><span class="show_contr_close"></span> </li></ul>'); //add input box
			}
		});

		$(wrapper1).on("click",".remove_field", function(e){ //user click on remove text
			e.preventDefault(); $(this).parent('ul').remove(); x1--;id1--;x2--;id2--;
		})
	});
	function showtooltip2(parentId, tooltipId)
	{
		$("#" + tooltipId).toggle();

		var parentElementHeight = $("#" + parentId).height();
		var parentElementWidth = $("#" + parentId).width();

		if(parentId == "cardNumber2"){
			var left =  ($("#" + parentId).offset().left) - parentElementWidth + 5 + 'px';
			var top =  ($("#" + parentId).offset().top) + parentElementHeight + 15 + 'px'; 
		}
		else if(parentId == "cCodeFlight2"){
			var left =  ($("#" + parentId).offset().left) - parentElementWidth + 5 + 'px';
			var top =  ($("#" + parentId).offset().top) + parentElementHeight + 15 + 'px'; 
		}
		else if(parentId == "hint2"){
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
	function populateCardNumber2(cId){
		var x = $("#cardsNos" + cId).html()
		$("#card_number2").val(x)
		$("#visaListing2").hide();
	}


	function showtooltip1(parentId, tooltipId)
	{
		$("#" + tooltipId).toggle();

		var parentElementHeight = $("#" + parentId).height();
		var parentElementWidth = $("#" + parentId).width();

		if(parentId == "cardNumber1"){
			var left =  ($("#" + parentId).offset().left) - parentElementWidth + 5 + 'px';
			var top =  ($("#" + parentId).offset().top) + parentElementHeight + 15 + 'px'; 
		}
		else if(parentId == "cCodeFlight1"){
			var left =  ($("#" + parentId).offset().left) - parentElementWidth + 5 + 'px';
			var top =  ($("#" + parentId).offset().top) + parentElementHeight + 15 + 'px'; 
		}
		else if(parentId == "hint1"){
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
	function populateCardNumber1(cId){
		var x = $("#cardsNo" + cId).html()
		$("#card_number1").val(x)
		$("#visaListing1").hide();
	}
	$('.drop-down-show-hide').hide();

	$('#dropDown1').change(function(){
		$(this).find("option").each(function()
									{
										$('#' + this.value).hide();
									});
									$('#' + this.value).show();

	});
	function disable() {
		document.getElementById("My_Select2").disabled=true;
	}
	function enable() {
		document.getElementById("My_Select2").disabled=false;
	}
	function switchVisible2() {
		if (document.getElementById('My_Select2')) {

			if (document.getElementById('My_Select2').style.display == 'none') {
				document.getElementById('My_Select2').style.display = 'block';
				document.getElementById('texts2').style.display = 'none';
			}
			else {
				document.getElementById('My_Select2').style.display = 'none';
				document.getElementById('texts2').style.display = 'block';
			}
		}
	}
	$(document).ready(function () {
		$('#hotelscontent1').on('click', function (e) {
			$("#hotelscontrol1").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).find('img').attr('src', ezgImagesPath + '/common/expand_blu.png');		   
			}else{
				$(this).find('img').attr('src', ezgImagesPath + '/common/collapse_blu.png');
			}
		});	
	});
	$(document).ready(function () {
		$('#day1').on('click', function (e) {
			$("#dayview1").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).find('img').attr('src', ezgImagesPath + '/common/collapse_blu.png');		   
			}else{
				$(this).find('img').attr('src', ezgImagesPath + '/common/expand_blu.png');
			}
		});	
	});
	$(document).ready(function () {
		$('#day2').on('click', function (e) {
			$("#dayview2").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).find('img').attr('src', ezgImagesPath + '/common/collapse_blu.png');		   
			}else{
				$(this).find('img').attr('src', ezgImagesPath + '/common/expand_blu.png');
			}
		});	
	});
	$(document).ready(function () {
		$('#day3').on('click', function (e) {
			$("#dayview3").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).find('img').attr('src', ezgImagesPath + '/common/collapse_blu.png');		   
			}else{
				$(this).find('img').attr('src', ezgImagesPath + '/common/expand_blu.png');
			}
		});	
	});
	function showImage(imgName) {
		var curImage = document.getElementById('currentImage');
		var thePath = 'images/activities/';
		var theSource = thePath + imgName;

		curImage.src = theSource;
		curImage.alt = imgName;
		curImage.title = imgName; 
	}

	function selectThumnail(id)
	{
		for(i=1;i<6;i++)
		{
			document.getElementById('Thumbnail'+i).style.border="";
		}
		document.getElementById('Thumbnail'+id).style.border="#16a085 5px solid";
	}

	//Add to cart function
	//	$(".addToCart").click(function(){
	//		   
	//		   $("#shopping_cart_panel1").show();
	//		   $("#shoppingCartTab1").addClass('sel');
	//		   $(".footerContactDetail").addClass("activated");
	//		  // $("#shopping_cart_panel").delay(3000).fadeOut(800); 
	//		 setTimeout(function() {
	//			    $("#shopping_cart_panel1").hide(); 
	//	            $("#shoppingCartTab1").removeClass('sel');
	//				$(".footerContactDetail").removeClass("activated");
	//           }, 3000);
	//		   
	//		   num = parseInt($("#cartCount").text());
	//			$("#cartCount").text(num+1);
	//		});
	$(document).ready(function () {
		$('#activitycontent1').on('click', function (e) {
			$("#actcontrol1").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).find('img').attr('src', ezgImagesPath + '/common/expand_blu.png');		   
			}else{
				$(this).find('img').attr('src', ezgImagesPath + '/common/collapse_blu.png');
			}
		});	
	});
	$(document).ready(function () {
		$('#hotelOpt').on('click', function (e) {
			$("#hotelContr").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).find('img').attr('src', ezgImagesPath + '/common/expand_blu.png');		   
			}else{
				$(this).find('img').attr('src', ezgImagesPath + '/common/collapse_blu.png');
			}
		});	
	});
	$(document).ready(function () {
		$('#busview3').on('click', function (e) {
			$("#busdetails3").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('- View Details');	   
			}else{
				$(this).text(' + View Details');
			}
		});	
	});
	$(document).ready(function () {
		$('#busview').on('click', function (e) {
			$("#busdetails").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('- View Details');	   
			}else{
				$(this).text(' + View Details');
			}
		});	
	});
	$(document).ready(function () {
		$('#busview1').on('click', function (e) {
			$("#busdetails1").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('- View Details');	   
			}else{
				$(this).text(' + View Details');
			}
		});	
	});
	$(document).ready(function () {
		$('#busview2').on('click', function (e) {
			$("#busdetails2").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('- View Details');	   
			}else{
				$(this).text(' + View Details');
			}
		});	
	});
	$(document).ready(function () {
		$('#busview4').on('click', function (e) {
			$("#busdetails4").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('- View Details');	   
			}else{
				$(this).text(' + View Details');
			}
		});	
	});
	$(document).ready(function () {
		$('#busview5').on('click', function (e) {
			$("#busdetails5").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('- View Details');	   
			}else{
				$(this).text(' + View Details');
			}
		});	
	});
	$(document).ready(function () {
		$('#busview6').on('click', function (e) {
			$("#busdetails6").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('- View Details');	   
			}else{
				$(this).text(' + View Details');
			}
		});	
	});
	$(document).ready(function () {
		$('#busview7').on('click', function (e) {
			$("#busdetails7").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('- View Details');	   
			}else{
				$(this).text(' + View Details');
			}
		});	
	});
	$(document).ready(function () {
		$('#busview8').on('click', function (e) {
			$("#busdetails8").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('- View Details');	   
			}else{
				$(this).text(' + View Details');
			}
		});	
	});
	$(document).ready(function () {
		$('#busview9').on('click', function (e) {
			$("#busdetails9").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('- View Details');	   
			}else{
				$(this).text(' + View Details');
			}
		});	
	});
	$(document).ready(function () {
		$('#busview10').on('click', function (e) {
			$("#busdetails10").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('- View Details');	   
			}else{
				$(this).text(' + View Details');
			}
		});	
	});
	$(document).ready(function () {
		$('#review').on('click', function (e) {
			$("#reviewdetails").show("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('More Review');	   
			}else{
				$(this).text('More Review');
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

	$(document).ready(function () {
		$('.moreplus1').on('click', function (e) {
			$('.moreplusOpt1').slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text(' - More (Frequent flyer, meal preference, seat preference, special request');		   
			}else{
				$(this).text(' + More (Frequent flyer, meal preference, seat preference, special request');
			}
		});

	});

	$(document).ready(function () {
		$('.morepluschild').on('click', function (e) {
			$('.morepluschildOpt').slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text(' + More (Frequent flyer, meal preference, seat preference, special request');		   
			}else{
				$(this).text(' - More (Frequent flyer, meal preference, seat preference, special request');
			}
		});

	});
	$(document).ready(function () {
		$('#Hotelview1').on('click', function (e) {
			$("#Hoteldetails1").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('- View Details');	   
			}else{
				$(this).text(' + View Details');
			}
		});	
	});
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

	function switchVisible3() {
		if (document.getElementById('My_Select3')) {

			if (document.getElementById('My_Select3').style.display == 'none') {
				document.getElementById('My_Select3').style.display = 'block';
				document.getElementById('text3').style.display = 'none';
			}
			else {
				document.getElementById('My_Select3').style.display = 'none';
				document.getElementById('text3').style.display = 'block';
			}
		}
	}
	function switchVisible4() {
		if (document.getElementById('My_Select4')) {

			if (document.getElementById('My_Select4').style.display == 'none') {
				document.getElementById('My_Select4').style.display = 'block';
				document.getElementById('text4').style.display = 'none';
			}
			else {
				document.getElementById('My_Select4').style.display = 'none';
				document.getElementById('text4').style.display = 'block';
			}
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
				document.getElementById('text8').style.display = 'none';
			}
			else {
				document.getElementById('My_Select7').style.display = 'none';
				document.getElementById('text8').style.display = 'block';
			}
		}
	}

	function switchVisible8() {
		if (document.getElementById('My_Select8')) {

			if (document.getElementById('My_Select8').style.display == 'none') {
				document.getElementById('My_Select8').style.display = 'block';
				document.getElementById('text9').style.display = 'none';
			}
			else {
				document.getElementById('My_Select8').style.display = 'none';
				document.getElementById('text9').style.display = 'block';
			}
		}
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
	function switchVisible10() {
		if (document.getElementById('My_Select10')) {

			if (document.getElementById('My_Select10').style.display == 'none') {
				document.getElementById('My_Select10').style.display = 'block';
				document.getElementById('text11').style.display = 'none';
			}
			else {
				document.getElementById('My_Select10').style.display = 'none';
				document.getElementById('text11').style.display = 'block';
			}
		}
	}
	function switchVisible11() {
		if (document.getElementById('My_Select11')) {

			if (document.getElementById('My_Select11').style.display == 'none') {
				document.getElementById('My_Select11').style.display = 'block';
				document.getElementById('text12').style.display = 'none';
			}
			else {
				document.getElementById('My_Select11').style.display = 'none';
				document.getElementById('text12').style.display = 'block';
			}
		}
	}
	function switchVisible12() {
		if (document.getElementById('My_Select12')) {

			if (document.getElementById('My_Select12').style.display == 'none') {
				document.getElementById('My_Select12').style.display = 'block';
				document.getElementById('text13').style.display = 'none';
			}
			else {
				document.getElementById('My_Select12').style.display = 'none';
				document.getElementById('text13').style.display = 'block';
			}
		}
	}
	function switchVisible13() {
		if (document.getElementById('My_Select13')) {

			if (document.getElementById('My_Select13').style.display == 'none') {
				document.getElementById('My_Select13').style.display = 'block';
				document.getElementById('text14').style.display = 'none';
			}
			else {
				document.getElementById('My_Select13').style.display = 'none';
				document.getElementById('text14').style.display = 'block';
			}
		}
	}
	function switchVisible14() {
		if (document.getElementById('My_Select14')) {

			if (document.getElementById('My_Select14').style.display == 'none') {
				document.getElementById('My_Select14').style.display = 'block';
				document.getElementById('text15').style.display = 'none';
			}
			else {
				document.getElementById('My_Select14').style.display = 'none';
				document.getElementById('text15').style.display = 'block';
			}
		}
	}
	function switchVisible15() {
		if (document.getElementById('My_Select15')) {

			if (document.getElementById('My_Select15').style.display == 'none') {
				document.getElementById('My_Select15').style.display = 'block';
				document.getElementById('text16').style.display = 'none';
			}
			else {
				document.getElementById('My_Select15').style.display = 'none';
				document.getElementById('text16').style.display = 'block';
			}
		}
	}
	function switchVisible16() {
		if (document.getElementById('My_Select16')) {

			if (document.getElementById('My_Select16').style.display == 'none') {
				document.getElementById('My_Select16').style.display = 'block';
				document.getElementById('text17').style.display = 'none';
			}
			else {
				document.getElementById('My_Select16').style.display = 'none';
				document.getElementById('text17').style.display = 'block';
			}
		}
	}
	function switchVisible17() {
		if (document.getElementById('My_Select17')) {

			if (document.getElementById('My_Select17').style.display == 'none') {
				document.getElementById('My_Select17').style.display = 'block';
				document.getElementById('text18').style.display = 'none';
			}
			else {
				document.getElementById('My_Select17').style.display = 'none';
				document.getElementById('text18').style.display = 'block';
			}
		}
	}
	function switchVisible18() {
		if (document.getElementById('My_Select18')) {

			if (document.getElementById('My_Select18').style.display == 'none') {
				document.getElementById('My_Select18').style.display = 'block';
				document.getElementById('text19').style.display = 'none';
			}
			else {
				document.getElementById('My_Select18').style.display = 'none';
				document.getElementById('text19').style.display = 'block';
			}
		}
	}
	function showRooms121(){
		rooms = document.getElementById("roomCount121").value;
		for(i=2;i<=3;i++){
			document.getElementById("rooms" + i).innerHTML = '';	
		}
		if(rooms > 1)
			{
				for(r=2;r<=rooms;r++)
				{
					document.getElementById("rooms" + r).innerHTML = '<ul class="row mB10 mT15 clearfix"><li class="col_2">&nbsp;</li><li class="col_2 pR0"> <span class="mT30 fL">Room ' + r + ':</span></li><li class="col_2 pL0"><label>Adult</label><div class="passengerNum4 fL"><span onclick="adultCountDecrease(\'hAdult1_' + r + '\')" class="control addMinControl minusControl">-</span><span class="control innerTxtControl" id="hAdult1_' + r + '">1</span><span onclick="adultCountIncrease(\'hAdult1_' + r + '\')" class="control addMinControl plusControl">+</span></div><input type="text" class="w100pcnt dN" maxlength="3" value="1"><span class="fS11 fL w100pcnt">12+ yrs</span></li><li class="col_2 pL0"><label>Children</label><div class="passengerNum5 fL"> <span onclick="childCountDecrease(\'hChild1_' + r + '\'),remChild1(' + r + ')" class="control addMinControl minusControl">-</span> <span class="control innerTxtControl" id="hChild1_' + r + '">0</span> <span onclick="childCountIncrease(\'hChild1_' + r + '\'),addChild1(' + r + ')" class="control addMinControl plusControl">+</span> </div><input type="text" class="w100pcnt dN" maxlength="3" value="0"><span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li><li class="col_4 mB10"><ul><li class="col_6 mB10 pR0" id="child' + r + '51"></li><li class="col_6 mB10 pR0" id="child' + r + '52"></li><li class="col_6 mB10 pR0" id="child' + r + '53"></li><li class="col_6 mB10 pR0" id="child' + r + '54"></li><li class="col_6 mB10 pR0" id="child' + r + '55"></li><li class="col_6 mB10 pR0" id="child' + r + '56"></li><li class="col_6 mB10 pR0" id="child' + r + '57"></li><li class="col_6 mB10 pR0" id="child' + r + '58"></li><li class="col_6 mB10 pR0" id="child' + r + '59"></li></ul></li></ul>';
				}
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
		document.getElementById("child" + s + "" + child_Count).innerHTML = '<label>Child ' + child_Count + '</label><select><option value="Age">Age</option><option value="1">1</option><option value="2">2</option><option value="3">3</option></select>';
		document.getElementById("child" + s + "" + child_Count).className = "col_6 mB10 pR0";
		$("select").change(function () {
			$(this).addClass("defaultTextColor");
		});
	}

	function remChild1(s){
		document.getElementById("child" + s + "" + (child_Count+1)).innerHTML = '';
		document.getElementById("child" + s + "" + (child_Count+1)).className = "col_6 pR0";
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
					document.getElementById("room_id" + r).innerHTML = '<ul class="mB10 mT15 clearfix"><li class="col_2 pL0 pR0">&nbsp;</li><li class="col_2 pR0 singleRoom"> <span class="mT30 fL">Room ' + r + ':</span></li><li class="col_2 pL0"><label>Adult</label><div class="passengerNum4 fL"><span onclick="adultCountDecrease(\'hAdult1' + r + '\')" class="control addMinControl minusControl">-</span><span class="control innerTxtControl" id="hAdult1' + r + '">1</span><span onclick="adultCountIncrease(\'hAdult1' + r + '\')" class="control addMinControl plusControl">+</span></div><input type="text" class="w100pcnt dN" maxlength="3" value="1"><span class="fS11 fL w100pcnt">12+ yrs</span></li><li class="col_2 pL0"><label>Children</label><div class="passengerNum5 fL"> <span onclick="child_Count_Decrease(\'hChild2_' + r + '\'),remChild2(' + r + ')" class="control addMinControl minusControl">-</span> <span class="control innerTxtControl" id="hChild2_' + r + '">0</span> <span onclick="child_Count_Increase(\'hChild2_' + r + '\'),addChild2(' + r + ')" class="control addMinControl plusControl">+</span> </div><input type="text" class="w100pcnt dN" maxlength="3" value="0"><span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li><li class="col_4 mB10"><ul><li class="col_6 mB10 pR0" id="child' + r + '_11"></li><li class="col_6 mB10 pR0" id="child' + r + '_12"></li><li class="col_6 mB10 pR0" id="child' + r + '_13"></li><li class="col_6 mB10 pR0" id="child' + r + '_14"></li><li class="col_6 mB10 pR0" id="child' + r + '_15"></li><li class="col_6 mB10 pR0" id="child' + r + '_16"></li><li class="col_6 mB10 pR0" id="child' + r + '_17"></li><li class="col_6 mB10 pR0" id="child' + r + '_18"></li><li class="col_6 mB10 pR0" id="child' + r + '_19"></li></ul></li></ul>';
				}
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

	function child_Count_Increase(id,cntr){
		child_Count = document.getElementById(id).innerHTML;
		if(child_Count < 9){
			child_Count++;
			document.getElementById(id).innerHTML = child_Count;
		}
	}
	function child_Count_Decrease(id,cntr){
		child_Count = document.getElementById(id).innerHTML;
		if(child_Count > 0){
			child_Count--;
			document.getElementById(id).innerHTML = child_Count;
		}
	}

	function addChild2(s){
		document.getElementById("child" + s + "_1" + child_Count).innerHTML = '<label>Child ' + child_Count + '</label><select><option value="Age">Age</option><option value="1">1</option><option value="2">2</option><option value="3">3</option></select>';
		document.getElementById("child" + s + "_1" + child_Count).className = "col_6 mB10 pR0";
		$("select").change(function () {
			$(this).addClass("defaultTextColor");
		});
	}
	$(document).ready(function () {
		$('#hotelOpt1').on('click', function (e) {
			$("#hotelContr1").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).find('img').attr('src', ezgImagesPath + '/common/expand_blu.png');		   
			}else{
				$(this).find('img').attr('src', ezgImagesPath + '/common/collapse_blu.png');
			}
		});	
	});
	function remChild2(s){
		document.getElementById("child" + s + "_1" + (child_Count+1)).innerHTML = '';
		document.getElementById("child" + s + "_1" + (child_Count+1)).className = "col_6 pR0";
	}
	/* for add room in hotel*/
	var roomsAddedNew = 1;
	function showRoomsNew(){
		roomsNew = document.getElementById("noOfRoomsNew").value;
		if(roomsNew < roomsAddedNew){
			rRemNew = roomsAddedNew - roomsNew;
			for(i=1;i<=rRemNew;i++){
				document.getElementById("roomNew" + roomsAddedNew).innerHTML = '';
				roomsAddedNew--;	
			}
		}
		else{
			rAddNew = roomsNew - roomsAddedNew;
			for(rNew=1;rNew<=rAddNew;rNew++)
			{
				document.getElementById("roomNew" + (roomsAddedNew+1)).innerHTML = '<ul class="row mB10 mT15 clearfix"><li class="col_2">&nbsp;</li><li class="col_2 pR0"> <span class="mT30 fL">Room ' + (roomsAddedNew+1) + ':</span></li><li class="col_2 pL0"><label>Adult</label><div class="passengerNum4 fL"><span onclick="adultCountDec1(\'hAdult5_' + (roomsAddedNew+1) + '\')" class="control addMinControl minusControl">-</span><span class="control innerTxtControl" id="hAdult5_' + (roomsAddedNew+1) + '">1</span><span onclick="adultCountInc1(\'hAdult5_' + (roomsAddedNew+1) + '\')" class="control addMinControl plusControl">+</span></div><input type="text" class="w100pcnt dN" maxlength="3" value="1"><span class="fS11 fL w100pcnt">12+ yrs</span></li><li class="col_2 pL0"><label>Children</label><div class="passengerNum5 fL"> <span onclick="childCountDec1(\'hChild5_' + (roomsAddedNew+1) + '\'),remChild5(' + (roomsAddedNew+1) + ')" class="control addMinControl minusControl">-</span> <span class="control innerTxtControl" id="hChild5_' + (roomsAddedNew+1) + '">0</span> <span onclick="childCountInc1(\'hChild5_' + (roomsAddedNew+1) + '\'),addChild5(' + (roomsAddedNew+1) + ')" class="control addMinControl plusControl">+</span> </div><input type="text" class="w100pcnt dN" maxlength="3" value="0"><span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li><li class="col_4 mB10"><label>Infant</label><div class="adderOuter"><span class="control addMinControl minusControl cursor fW600" onClick="infantCountDec(\'hInfant_1'+(roomsAddedNew+1) + '\'),remInfant(1), showToggler();">-</span> <span class="control innerTxtControl" id="hInfant5_' + (roomsAddedNew+1) + '">0</span> <span class="control addMinControl plusControl cursor fW600" onClick="infantCountInc(\'hInfant_1'+(roomsAddedNew+1) + '\'),addInfant(1), showToggler()">+</span></div><span class="fS11 fL">0-2 yrs</span></li><li class="col_4 mB10"><ul><li class="col_6 pR0" id="child' + (roomsAddedNew+1) + '_21"></li><li class="col_6 pR0" id="child' + (roomsAddedNew+1) + '_22"></li><li class="col_6 pR0" id="child' + (roomsAddedNew+1) + '_23"></li><li class="col_6 pR0" id="child' + (roomsAddedNew+1) + '_24"></li><li class="col_6 pR0" id="child' + (roomsAddedNew+1) + '_25"></li><li class="col_6 pR0" id="child' + r + '_26"></li><li class="col_6 pR0" id="child' + (roomsAddedNew+1) + '_27"></li><li class="col_6 pR0" id="child' + (roomsAddedNew+1) + '_28"></li><li class="col_6 pR0" id="child' + (roomsAddedNew+1) + '_29"></li></ul></li>';
				roomsAddedNew++;
			}
		}

	}
	var adult_Count = 1;
	var child_Count = 0;

	function adultCountInc1(id,cntr){
		adult_Count = document.getElementById(id).innerHTML;
		if(adult_Count < 9){
			adult_Count++;
			document.getElementById(id).innerHTML = adult_Count;
		}
	}
	function adultCountDec1(id,cntr){
		adult_Count = document.getElementById(id).innerHTML;
		if(adult_Count > 1){
			adult_Count--;
			document.getElementById(id).innerHTML = adult_Count;
		}

	}

	function childCountInc1(id,cntr){
		child_Count = document.getElementById(id).innerHTML;
		if(child_Count < 9){
			child_Count++;
			document.getElementById(id).innerHTML = child_Count;
		}
	}
	function childCountDec1(id,cntr){
		child_Count = document.getElementById(id).innerHTML;
		if(child_Count > 0){
			child_Count--;
			document.getElementById(id).innerHTML = child_Count;
		}
	}

	function addChild5(s){
		document.getElementById("child" + s + "_" + child_Count).innerHTML = '<label>Child ' + child_Count + '</label><select class="w75"><option value="Age">Age</option><option value="1">1</option><option value="2">2</option><option value="3">3</option></select>';
		document.getElementById("child" + s + "_" + child_Count).className = "col_2 mB10 pR0";
		$("select").change(function () {
			$(this).addClass("defaultTextColor");
		});
	}

	function remChild5(s){
		document.getElementById("child" + s + "_" + (child_Count+1)).innerHTML = '';
		document.getElementById("child" + s + "_" + (child_Count+1)).className = "col_6 pR0";
	}

	var roomsAdded = 1;
	function showCabins(){
		rooms = document.getElementById("noOfCabins").value;
		if( rooms > 1){
			showHidePanel = 1
		}

		if(rooms < roomsAdded){
			rRem = roomsAdded - rooms;
			for(i=1;i<=rRem;i++){
				document.getElementById("cabin" + roomsAdded).innerHTML = '';
				roomsAdded--;	
			}
		}
		else{
			rAdd = rooms - roomsAdded;
			for(r=1;r<=rAdd;r++)
			{
				document.getElementById("cabin" + (roomsAdded+1)).innerHTML = '<ul class="row mB10 mT15 clearfix"><li class="col_1 col_sm_2">&nbsp;</li><li class="col_1_half col_sm_2  pR0"> <span class="mT30 fL">Cabin ' + (roomsAdded+1) + ':</span></li><li class="col_1_half col_sm_2  pL0"><label>Adult</label><div class="adderOuter"> <span  onclick="adultCountDec(\'hAdult_' + (roomsAdded+1) + '\')" class="control addMinControl minusControl cursor fW600">-</span> <span id="hAdult_' + (roomsAdded+1) + '" class="control innerTxtControl">1</span> <span onclick="adultCountInc(\'hAdult_' + (roomsAdded+1) + '\')" class="control addMinControl plusControl cursor fW600">+</span> </div><input type="text" class="w100pcnt dN" maxlength="3" value="1"><span class="fS11 fL w100pcnt">12+ yrs</span></li><li class="col_2 singleRoom pL0"> <label>Children</label><div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600"  onClick="childCountDec(\'hChild_' + (roomsAdded+1) + '\'),remChild(' + (roomsAdded+1) + ')">-</span> <span class="control innerTxtControl" id="hChild_' + (roomsAdded+1) + '">0</span> <span class="control addMinControl plusControl cursor fW600" onclick="childCountInc(\'hChild_' + (roomsAdded+1) + '\'),addChildCabins(' + (roomsAdded+1) + '),showToggler()">+</span> </div><input type="text" placeholder="0"  maxlength="3" class="w100pcnt dN"/>                    <span class="fS11 fL w100pcnt">2 - 12 yrs</span> </li></ul>';
				roomsAdded++;
			}
		}
	}			

	function addChildCabins(s){
		document.getElementById("child" + s + "_" + child_Count).innerHTML = '<label>Child ' + child_Count + '</label><select class="w75"><option value="Age">Age</option><option value="1">1</option><option value="2">2</option><option value="3">3</option></select>';
		document.getElementById("child" + s + "_" + child_Count).className = "col_4 col_sm_6 mB10 pR0";
		$("select").change(function () {
			$(this).addClass("defaultTextColor");
		});

		if( (child_Count >= 3)){
			showHidePanel = 1
		}




	}
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
		var max_fields      = 10; //maximum input boxes allowed
		var wrapper         = $("#addfieldspass"); //Fields wrapper
		var add_button      = $("#addpassfieldbtn"); //Add button ID
		var id=23
		var x = 1; //initlal text box count
		$(add_button).click(function(e){ //on add input button click
			e.preventDefault();
			if(x < max_fields){ //max input box allowed
				x++; //text box increment
				$(wrapper).append('<ul class="mB10 mT10 clearfix"><li class="col_6 mT10"><input type="text" placeholder="Enter Country" class="w100pcnt"/></li><li class="col_2 mT10 pR0 pL0"><select><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option></select></li><li class="col_1 pR0 remove_field"><span class="show_contr_close"></span> </li></ul>'); //add input box
				id++;
			}
		});

		$(wrapper).on("click",".remove_field", function(e){ //user click on remove text
			e.preventDefault(); $(this).parent('ul').remove(); x--;id--;
		})
	});

	function searchFlight11(obj){
		switch(obj)
		{
			case "oneway11":
				document.getElementById('returnFlightContainer11').style.visibility = 'hidden';
				document.getElementById('multiwayAdd11').style.display = 'none';
				document.getElementById("multiwaySearchDefault11").style.display = "none";	
				document.getElementById("comboOfferTriggers11").style.display = "block";	
				document.getElementById("flightSearchPanel11").style.display = "none";	
				//document.getElementById("comboOfferTriggers").style.display = "block";
				$("#multiwaySearchParameters3, #multiwaySearchParameters4, #multiwaySearchParameters5").hide();
				$("#add11").prop("checked",false)
				mc = 3
				break;
			case "return11":
				document.getElementById('returnFlightContainer11').style.visibility = 'visible';
				document.getElementById('multiwayAdd11').style.display = 'none';
				document.getElementById("multiwaySearchDefault11").style.display = "none";	
				document.getElementById("comboOfferTriggers11").style.display = "block";	
				document.getElementById("flightSearchPanel11").style.display = "none";	
				//document.getElementById("multiwaySearchPanel_2").style.display = "none";	
				//document.getElementById("comboOfferTriggers").style.display = "block";
				//document.getElementById("carType").style.display = "block";
				//document.getElementById("noOfCars").style.display = "block";
				//document.getElementById("pickUpDateHolder").style.display = "block";
				//document.getElementById("dropOffDateHolder").style.display = "block";
				$("#multiwaySearchParameters3, #multiwaySearchParameters4, #multiwaySearchParameters5").hide();
				$("#add11").prop("checked",false)
				mc = 3
				break;
			case "multicity11":
				document.getElementById('returnFlightContainer11').style.visibility = 'hidden';
				document.getElementById('multiwayAdd11').style.display = 'block';
				document.getElementById("multiwaySearchDefault11").style.display = "block";	
				document.getElementById("comboOfferTriggers11").style.display = "none";
				//document.getElementById("multiwaySearchPanel_2").style.display = "block";	
				document.getElementById("flightSearchPanel11").style.display = "none";	
				//document.getElementById("carSearchPanel").style.display = "none";	
				document.getElementById("comboOfferTriggers11").style.display = "block";
				document.getElementById("add11").checked = false;
				document.getElementById("addFlight11").checked = false;
				break;
			default :	
				document.getElementById('returnFlightContainer11').style.display = 'block';
		}
	}

	//Add multiway flights
	var mc = 3;
	function showMultiwayOptions11(){
		if(mc < 6){
			$('#multiwaySearchParameters' + mc).show();
			mc++;
		}
	}

	function hideMultiwayOptions11(i){
		$("#multiwaySearchParameters" + i).slideUp();	
		if(i != 5)
			mc = i++;
	}


	function addFlight11()
	{
		if($("#add11").is(":checked")){
			$("#flightSearchPanel11").show();
		}
		else{
			$("#flightSearchPanel11").hide();
		}	 	
	}
	function searchEurail1(obj){
		switch(obj)
		{
			case "ticket1":
				$("#eurailTicketContainer1").show();
				$("#eurailPassContainer1, #eurailReserveContainer1").hide();

				break;


			case "pass1":
				$("#eurailPassContainer1").show();
				$("#eurailTicketContainer1, #eurailReserveContainer1").hide();


				break;


			case "reservation1":
				$("#eurailReserveContainer1").show();
				$("#eurailPassContainer1, #eurailTicketContainer1").hide();


				break;



			default :	
				$("#eurailTicketContainer1").show();
				$("#eurailPassContainer1, #eurailReserveContainer1").hide();
		}



	}
	//for eurail tickit
	function searchFlight10(obj){

		switch(obj)
		{
			case "oneway10":
				document.getElementById('returnFlightContainer10').style.visibility = 'hidden';
				document.getElementById("checkhotel").style.display= "none";
				document.getElementById("checkinreturn").style.visibility = "visible";
				document.getElementById("checkoutreturn").style.visibility = "visible";
				document.getElementById('multiwayAdd10').style.display = 'none';
				document.getElementById('multiwayhide2').style.display = 'block';
				document.getElementById('multiwayhide1').style.display = 'block';
				document.getElementById("multiwaySearchDefault10").style.display = "none";
				//document.getElementById("multiwaySearchDefault1").style.display = "none";
				document.getElementById("checkhotel1").style.display= "none";
				document.getElementById('hotelStay').style.visibility= 'hidden';
				document.getElementById('2nights').style.visibility = 'visible';
				document.getElementById('flightSearchPanel20').style.visibility= 'hidden';			
				//document.getElementById("multiwaySearchPanel_2").style.display = "none";	
				//document.getElementById("carType").style.display = "none";
				//document.getElementById("noOfCars").style.display = "none";
				//document.getElementById("pickUpDateHolder").style.display = "none";
				//document.getElementById("dropOffDateHolder").style.display = "none";
				$("#multiwaySearchParameters20, #multiwaySearchParameters21, #multiwaySearchParameters22").hide();
				$("#flightOptionsSearchPanel20").hide();
				$("#moreFlightOpton20").removeClass("active");
				$("#eplusMinus2_0").text("+")
				$("#addCar20,#addFlight20").prop("checked",false)
				mc = 3
				showHidePanel = 0;
				$("#globalSrcToggle10").show();
				$(".globalSrcShow10").text("Hide");
				$(".globalSrcShow10").addClass("sel");



				break;
			case "return10":
				document.getElementById('returnFlightContainer10').style.visibility = 'visible';
				document.getElementById('multiwayAdd10').style.display = 'none';
				document.getElementById("checkinreturn").style.visibility = "hidden";
				document.getElementById("checkoutreturn").style.visibility = "hidden";
				document.getElementById('multiwayhide2').style.display = 'block';
				document.getElementById('multiwayhide1').style.display = 'block';
				document.getElementById("multiwaySearchDefault10").style.display = "none";
				//document.getElementById("multiwaySearchDefault1").style.display = "none";
				document.getElementById("checkhotel").style.display= "none";
				document.getElementById("checkhotel1").style.display= "none";
				document.getElementById('hotelStay').style.visibility = 'visible';
				document.getElementById('2nights').style.visibility = 'hidden';
				document.getElementById('flightSearchPanel20').style.visibility= 'hidden';
				//document.getElementById("multiwaySearchPanel_2").style.display = "none";	
				$("#multiwaySearchParameters20, #multiwaySearchParameters21, #multiwaySearchParameters22").hide();
				$("#flightOptionsSearchPanel20").hide();
				$("#moreFlightOpton20").removeClass("active");
				$("#eplusMinus2_0").text("+")
				$("#addCar20,#addFlight20").prop("checked",false)
				showHidePanel = 0;
				mc = 3;
				$("#globalSrcToggle10").show();
				$(".globalSrcShow10").text("Hide");
				$(".globalSrcShow10").addClass("sel");


				break;
			case "multicity10":
				document.getElementById('returnFlightContainer10').style.visibility = 'hidden';
				document.getElementById('multiwayAdd10').style.display = 'block';
				document.getElementById('multiwayhide2').style.display = 'none';
				document.getElementById("checkinreturn").style.visibility= "hidden";
				document.getElementById("checkoutreturn").style.visibility = "hidden";
				document.getElementById('multiwayhide1').style.display = 'none';
				document.getElementById("checkhotel").style.display= "block";
				document.getElementById("checkhotel1").style.display= "block";
				document.getElementById("multiwaySearchDefault10").style.display = "block";
				//document.getElementById("multiwaySearchDefault1").style.display = "block";
				document.getElementById("hotelStay").style.visibility= 'hidden';
				document.getElementById('2nights').style.visibility = 'hidden';
				document.getElementById('flightSearchPanel20').style.visibility= 'hidden';
				//document.getElementById("multiwaySearchPanel_2").style.display = "block";	
				//document.getElementById("carSearchPanel20").style.display = "none";	
				document.getElementById("addFlight20").checked = false;
				$("#flightOptionsSearchPanel20").hide();
				$("#moreFlightOpton20").removeClass("active");
				$("#eplusMinus2_0").text("+")
				showHidePanel = 0;
				$("#globalSrcToggle10").show();
				$(".globalSrcShow10").text("Hide");
				$(".globalSrcShow10").addClass("sel");


				break;

			default :	
				document.getElementById('returnFlightContainer10').style.display = 'block';
		}
	}

	function searchFlight2(obj){

		switch(obj)
		{
			case "oneway2":
				document.getElementById('multiwayAdd12').style.display = 'none';
				$("#multiwaySearchParameters13, #multiwaySearchParameters14, #multiwaySearchParameters15").hide();
				$("#flightOptionsSearchPanel2,#carSearchPanel2,#flightSearchPanel22").hide();
				$("#moreFlightOpton19").removeClass("active");
				$("#eplusMinus1_9").text("+")
				$("#addCar12,#addFlight12").prop("checked",false)
				mc = 3
				showHidePanel = 0;
				$("#globalSrcToggle12").show();
				$(".globalSrcShow12").text("Hide");
				$(".globalSrcShow12").addClass("sel");



				break;
			case "return2":
				document.getElementById('multiwayAdd12').style.display = 'none';	
				document.getElementById("carType12").style.display = "block";
				document.getElementById("noOfCars12").style.display = "block";
				$("#multiwaySearchParameters13, #multiwaySearchParameters14, #multiwaySearchParameters15").hide();
				$("#flightOptionsSearchPanel12,#carSearchPanel12,#flightSearchPanel22").hide();
				$("#moreFlightOpton19").removeClass("active");
				$("#eplusMinus1_9").text("+")
				$("#addCar12,#addFlight12").prop("checked",false)
				showHidePanel = 0;
				mc = 3;
				$("#globalSrcToggle12").show();
				$(".globalSrcShow12").text("Hide");
				$(".globalSrcShow12").addClass("sel");


				break;
			case "multicity2":
				document.getElementById('multiwayAdd12').style.display = 'block';
				document.getElementById("flightSearchPanel22").style.display = "none";	
				document.getElementById("carSearchPanel12").style.display = "none";	
				document.getElementById("addCar12").checked = false;
				document.getElementById("addFlight12").checked = false;
				$("#flightOptionsSearchPanel12").hide();
				$("#moreFlightOpton19").removeClass("active");
				$("#eplusMinus1_9").text("+")
				showHidePanel = 0;
				$("#globalSrcToggle12").show();
				$(".globalSrcShow12").text("Hide");
				$(".globalSrcShow12").addClass("sel");


				break;
			case "ticket_port2":
				document.getElementById('returnFlightContainer12').style.visibility = 'hidden';
				document.getElementById('multiwayAdd12').style.display = 'block';
				document.getElementById("multiwaySearchDefault12").style.display = "block";	
				//document.getElementById("multiwaySearchPanel_2").style.display = "block";	
				document.getElementById("flightSearchPanel22").style.display = "none";	
				document.getElementById("carSearchPanel12").style.display = "none";	
				document.getElementById("comboOfferTriggers12").style.display = "none";
				document.getElementById("addCar12").checked = false;
				document.getElementById("addFlight12").checked = false;	
				break;
			default :	
				document.getElementById('returnFlightContainer12').style.display = 'block';
		}
	}
	//end

	function searchFlight1(obj){

		switch(obj)
		{
			case "oneway1":
				document.getElementById('multiwayAdd11').style.display = 'none';
				$("#multiwaySearchParameters16, #multiwaySearchParameters17, #multiwaySearchParameters18").hide();
				$("#flightOptionsSearchPanel1,#carSearchPanel1,#flightSearchPanel12").hide();
				$("#moreFlightOpton1").removeClass("active");
				$("#plusMinus1").text("+")
				$("#addCar11,#addFlight11").prop("checked",false)
				mc = 3
				showHidePanel = 0;
				$("#globalSrcToggle11").show();
				$(".globalSrcShow11").text("Hide");
				$(".globalSrcShow11").addClass("sel");



				break;
			case "return1":
				document.getElementById('multiwayAdd11').style.display = 'none';	
				document.getElementById("carType11").style.display = "block";
				document.getElementById("noOfCars11").style.display = "block";
				$("#multiwaySearchParameters16, #multiwaySearchParameters17, #multiwaySearchParameters18").hide();
				$("#flightOptionsSearchPanel11,#carSearchPanel11,#flightSearchPanel12").hide();
				$("#moreFlightOpton11").removeClass("active");
				$("#eplusMinus1").text("+")
				$("#addCar11,#addFlight11").prop("checked",false)
				showHidePanel = 0;
				mc = 3;
				$("#globalSrcToggle11").show();
				$(".globalSrcShow11").text("Hide");
				$(".globalSrcShow11").addClass("sel");


				break;
			case "multicity1":
				document.getElementById('multiwayAdd11').style.display = 'block';
				document.getElementById("flightSearchPanel12").style.display = "none";	
				document.getElementById("carSearchPanel11").style.display = "none";	
				document.getElementById("addCar11").checked = false;
				document.getElementById("addFlight11").checked = false;
				$("#flightOptionsSearchPanel11").hide();
				$("#moreFlightOpton11").removeClass("active");
				$("#eplusMinus1").text("+")
				showHidePanel = 0;
				$("#globalSrcToggle11").show();
				$(".globalSrcShow11").text("Hide");
				$(".globalSrcShow11").addClass("sel");


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
				document.getElementById('text9').style.display = 'none';
			}
			else {
				document.getElementById('My_Select8').style.display = 'none';
				document.getElementById('text9').style.display = 'block';
			}
		}
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
		$('#bookingflight').on('click', function (e) {
			$("#flightboookdetails").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('- View Less');	   
			}else{
				$(this).text('+ View More');
			}
		});	
	});
	function addFlyer(id)
	{
		document.getElementById('addedFlyer1').style.display="block";
	}
	$(document).ready(function () {
		$('#flightbooking').on('click', function (e) {
			$("#flightbookingdetails").slideToggle("slow");
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
	$(document).ready(function () {
		$('#flightOpt').on('click', function (e) {
			$("#flightContr").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).find('img').attr('src', ezgImagesPath + '/common/expand_blu.png');		   
			}else{
				$(this).find('img').attr('src', ezgImagesPath + '/common/collapse_blu.png');
			}
		});	
	});
	$(document).ready(function () {
		$('#cruiseOpt').on('click', function (e) {
			$("#cruiseContr").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).find('img').attr('src', ezgImagesPath + '/common/expand_blu.png');		   
			}else{
				$(this).find('img').attr('src', ezgImagesPath + '/common/collapse_blu.png');
			}
		});	
	});
	$(document).ready(function () {
		$('.selDocument1').on('click', function (e) {
			$(this).parents('li').find('.costDStricture1').slideToggle();
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text(' - Documents required for students over 18 traveling alone');		   
			}else{
				$(this).text(' + Documents required for students over 18 traveling alone');
			}
		});
	});
	$(document).ready(function () {
		$('.selDocument2').on('click', function (e) {
			$(this).parents('li').find('.costDStricture2').slideToggle();
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text(' - Documents required for female applicants');		   
			}else{
				$(this).text(' + Documents required for female applicants');
			}
		});
	});
	$('.addMore').on('click', function (e) {
		$(".addMoreDetail").slideToggle("slow");
		$('.add_details_icon').toggleClass("active");
	});	

	$(document).ready(function () {
		$('.addEmail').on('click', function (e) {
			$(".addMoreEmail").slideToggle("slow");
			$('.add_Email_icon').toggleClass("active");
			$("#newSubscribeEmail").val('');
		});	
	});
	$(document).ready(function () {
		$('.addPhone').on('click', function (e) {
			$(".addMorePhone").slideToggle("slow");
			$('.add_Phone_icon').toggleClass("active");
			$("#newMobile").val('');
		});	
	});
	$(document).ready(function () {
		$('.edit_details').on('click', function (e) {
			$(".edit_detailsContr").slideToggle("slow");
			$('.add_Phone_icon').toggleClass("active");
		});	
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
				$(wrapper).append('<ul class="mB10 clearfix"><li class="col_3 pL0"><label>Visa Info</label></li><li class="col_2_half pL0"><input type="text" class="w100pcnt" name="visa" placeholder="Enter Country Name" /></li><li class="col_6">&nbsp;</li><br/><br/><li class="col_3 pL0 mT10"><label>Valid Till</label></li><li class="col_2_half pL0 mT10"><select class="w100pcnt"><option>Date</option></select></li><li class="col_2_half pL0 mT10"><select class="w100pcnt"><option>Month</option></select></li><li class="col_2_half pL0 mT10"><select class="w100pcnt"><option>Year</option></select></li><li class="col_1 pL0 pR0 mT10 remove_field"><span class="closeBtn_popup fR "></span></li></ul>'); //add input box
			}

		});

		$(wrapper).on("click",".remove_field", function(e){ //user click on remove text
			e.preventDefault(); $(this).parent('ul').remove(); x--;
		})


	});
	$(function(){
		$('#flight').show(); // Will show the div
		$('#subctg').change(function(){
			var selected = $(this).find(':selected').val();
			//alert(selected);
			$("#flight").hide();
			$("#all").hide();
			$("#car").hide();
			$("#cruise").hide();
			$("#eurorail").hide();
			$("#bus").hide();
			$("#holiday").hide();
			$("#activities").hide();
			$('#' + selected).show();
		});
	});
	$('.drop-down-show-hide').hide();

	$('#dropDown').change(function(){
		$(this).find("option").each(function()
									{
										$('#' + this.value).hide();
									});
									$('#' + this.value).show();

	});
	$(function(){
		$('#flight1').show(); // Will show the div
		$('#subctg1').change(function(){
			var selected = $(this).find(':selected').val();
			//alert(selected);
			$("#flight1").hide();
			$("#all1").hide();
			$("#cruise1").hide();
			$("#eurorail1").hide();
			$("#bus1").hide();
			$("#holiday1").hide();
			$("#activities1").hide();
			$('#' + selected).show();
		});
	});

	//Start of  MultiDropdown
	$(function() {
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
						var html = '<span class="grey_bg pD5 fL mR10 w100pcnt" >5+ Accomodation type Selected</span>';
						$('.multiSel').append(html);
					}
					else{
						var property = [];
						$('.multiSel').html('');
						$('.mutliSelect1 input[type="checkbox"]:checked').each(function(){
							property.push($(this).val());
							if ($(this).is(':checked')) {

								var html = '<span class="bkgWht pD5 fL mT5 mB5 mR10 posR" title="' + $(this).val() + '"><button class="remove_searched_parameter" id="'+$(this).val()+'" title="Remove">×</button><span >' + $(this).val() + '</span></span>';
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

	$("body").delegate(".remove_searched_parameter","click",function(event){
		event.preventDefault();
		var chkval = $(this).attr("id");
		console.log(chkval);
		$('span[title="' + chkval + '"]').remove();
		$('input[value="'+chkval+'"]').attr('checked', false);
	});
});
		// End of MultiDropdown
	$(document).ready(function() {
		var max_fields      = 10; //maximum input boxes allowed
		var wrapper         = $(".input_fields_wrap"); //Fields wrapper
		var add_button      = $(".add_field_button"); //Add button ID

		var x = 1; //initlal text box count
		$(add_button).click(function(e){ //on add input button click
			e.preventDefault();
			if(x < max_fields){ //max input box allowed
				x++; //text box increment
				$(wrapper).append('<ul class="clearfix"><li class="col_8 w40pcnt  pR0"><label>Via (Location)</label><input type="text" class="w100pcnt fL" name="startfrom" placeholder="Enter Location" /><div class="close_multicity_panel fR" style="margin-right: -63px;margin-top: -17px;"></div></li></ul>'); //add input box



			}
		});

		$(wrapper).on("click",".close_multicity_panel", function(e){ //user click on remove text
			e.preventDefault(); $(this).parent('li').remove(); x--;
			if(x = 0)
				{
					document.getElementById('.input_fields_wrap').style.display = "none";
				}
		})
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
		$('#viewlist2').on('click', function (e) {
			$("#viewmap2").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('View Map');	
				$("#viewmap2").show("slow");
				$("#viewmaphide2").hide("slow");
			}else{
				$(this).text('View Directions');
				$("#viewmaphide2").show("slow");
				$("#viewmap2").hide("slow");
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
	$(document).ready(function(){
		$('.myckeckbox1').change(function(){
			if(this.checked)
				{
					$('.myckeckbox2,.myckeckbox3,.myckeckbox4,.myckeckbox5,.myckeckbox6,.myckeckbox7,.myckeckbox8').prop('checked', true);
					$('.chkThemes1,.chkThemes2,.chkThemes3,.chkThemes4,.chkThemes5,.chkThemes6,.chkThemes7').fadeIn('fast');
				}
				else
					{
						$('.myckeckbox2,.myckeckbox3,.myckeckbox4,.myckeckbox5,.myckeckbox6,.myckeckbox7,.myckeckbox8').attr('checked', false);
						$('.chkThemes1,.chkThemes2,.chkThemes3,.chkThemes4,.chkThemes5,.chkThemes6,.chkThemes7').fadeOut('fast');
					}
		});
	});
	$(document).ready(function(){
		$('.myckeckbox2').change(function(){
			if(this.checked)
				$('.chkThemes1').fadeIn('fast');
			else
				$('.chkThemes1').fadeOut('fast');

		});
	});
	$(document).ready(function(){
		$('.myckeckbox3').change(function(){
			if(this.checked)
				$('.chkThemes2').fadeIn('fast');
			else
				$('.chkThemes2').fadeOut('fast');

		});
	});
	$(document).ready(function(){
		$('.myckeckbox4').change(function(){
			if(this.checked)
				$('.chkThemes3').fadeIn('fast');
			else
				$('.chkThemes3').fadeOut('fast');

		});
	});$(document).ready(function(){
		$('.myckeckbox5').change(function(){
			if(this.checked)
				$('.chkThemes4').fadeIn('fast');
			else
				$('.chkThemes4').fadeOut('fast');

		});

	});$(document).ready(function(){
		$('.myckeckbox6').change(function(){
			if(this.checked)
				$('.chkThemes5').fadeIn('fast');
			else
				$('.chkThemes5').fadeOut('fast');

		});
	});$(document).ready(function(){
		$('.myckeckbox7').change(function(){
			if(this.checked)
				$('.chkThemes6').fadeIn('fast');
			else
				$('.chkThemes6').fadeOut('fast');

		});
	});$(document).ready(function(){
		$('.myckeckbox8').change(function(){
			if(this.checked)
				$('.chkThemes7').fadeIn('fast');
			else
				$('.chkThemes7').fadeOut('fast');

		});
	});

	$(document).ready(function(){
		$('.closemyckeckbox2').click(function(){
			$('.myckeckbox2').attr('checked', false); 
			$('.chkThemes1').fadeOut('fast');
		});
	});
	$(document).ready(function(){
		$('.closemyckeckbox3').click(function(){
			$('.myckeckbox3').attr('checked', false); 
			$('.chkThemes2').fadeOut('fast');
		});
	});
	$(document).ready(function(){
		$('.closemyckeckbox4').click(function(){
			$('.myckeckbox4').attr('checked', false); 
			$('.chkThemes3').fadeOut('fast');
		});
	});
	$(document).ready(function(){
		$('.closemyckeckbox5').click(function(){
			$('.myckeckbox5').attr('checked', false); 
			$('.chkThemes4').fadeOut('fast');
		});
	});$(document).ready(function(){
		$('.closemyckeckbox6').click(function(){
			$('.myckeckbox6').attr('checked', false); 
			$('.chkThemes5').fadeOut('fast');
		});
	});$(document).ready(function(){
		$('.closemyckeckbox7').click(function(){
			$('.myckeckbox7').attr('checked', false); 
			$('.chkThemes6').fadeOut('fast');
		});
	});
	$(document).ready(function(){
		$('.closemyckeckbox8').click(function(){
			$('.myckeckbox8').attr('checked', false); 
			$('.chkThemes7').fadeOut('fast');
		});
	});

	$('.extraopt').on('click', function (e) {
		$(this).next('.extraoptContr').slideToggle();
		$(this).toggleClass('sel');
		if ($(this).hasClass('sel')) {
			$(this).find('img').attr('src', ezgImagesPath + '/common/expand_blu.png');		   
		}else{
			$(this).find('img').attr('src', ezgImagesPath + '/common/collapse_blu.png');
		}
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
		$('.baggage3').change(function(){
			if(this.checked){
				$('.priceshow2').show();
			}
			else{
				$('.priceshow2').hide();
			}

		});
	});
	$(document).ready(function(){
		$('.baggage4').change(function(){
			if(this.checked){
				$('.priceshow3').show();
			}
			else{
				$('.priceshow3').hide();
			}

		});
	});
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
					$(wrapper).append('<li class="col_6 col_sm_6 pL0 pR0 mT5"><label>Traveller '+id1+'</label><input id="datepicker'+id2+'" class="w50pcnt dateField" type="text"placeholder="DD/MM/YYYY" readonly /><br/><div class="close_multicity_panel fR" style="margin-right: 180px ;margin-top: -48px;"></div></li>'); //add input box
				}
			}
		});

		$(wrapper).on("click",".close_multicity_panel", function(e){ //user click on remove text
			e.preventDefault(); $(this).parent('li').remove(); x2--;
		})
	});

	// Slider Function
	if($().slider){

		$( "#slider-departure_hotel" ).slider({
			range: true,
			min: 0,
			max: 24,
			values: [ 6, 13 ],
			slide: function( event, ui ) {
				$( "#departure_hotel" ).val(ui.values[ 0 ] + ":00 - " + ui.values[ 1 ]+":00 " );
			}
		});
		$( "#departure_hotel" ).val( $( "#slider-departure_hotel" ).slider( "values", 0 ) +":00 -" + $( "#slider-departure_hotel" ).slider( "values", 1 )+":00" );


		$( "#slider-departure_2" ).slider({
			range: true,
			min: 0,
			max: 24,
			values: [ 6, 13 ],
			slide: function( event, ui ) {
				$( "#departure_2" ).val(ui.values[ 0 ] + ":00 - " + ui.values[ 1 ]+":00 " );
			}
		});
		$( "#departure_2" ).val( $( "#slider-departure_2" ).slider( "values", 0 ) +":00 -" + $( "#slider-departure_2" ).slider( "values", 1 )+":00" );
		$( "#slider-departure_3" ).slider({
			range: true,
			min: 0,
			max: 24,
			values: [ 6, 13 ],
			slide: function( event, ui ) {
				$( "#departure_3" ).val(ui.values[ 0 ] + ":00 - " + ui.values[ 1 ]+":00 " );
			}
		});
		$( "#departure_3" ).val( $( "#slider-departure_3" ).slider( "values", 0 ) +":00 -" + $( "#slider-departure_3" ).slider( "values", 1 )+":00" );
		$( "#slider-departure_5" ).slider({
			range: true,
			min: 0,
			max: 24,
			values: [ 6, 13 ],
			slide: function( event, ui ) {
				$( "#departure_5" ).val(ui.values[ 0 ] + ":00 - " + ui.values[ 1 ]+":00 " );
			}
		});
		$( "#departure_5" ).val( $( "#slider-departure_5" ).slider( "values", 0 ) +":00 -" + $( "#slider-departure_5" ).slider( "values", 1 )+":00" );

		$( "#slider-range2" ).slider({
			range: true,
			min: 0,
			max: 200000,
			values: [ 50000, 75000 ],
			slide: function( event, ui ) {
				$( "#amount3" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
			}
		});
		$( "#amount3" ).val( $( "#slider-range2" ).slider( "values", 0 ) +" - " + $( "#slider-range2" ).slider( "values", 1 ) ); 

		$( "#slider-erange2" ).slider({
			range: true,
			min: 0,
			max: 200000,
			values: [ 50000, 75000 ],
			slide: function( event, ui ) {
				$( "#erange2" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
			}
		});
		$( "#erange2" ).val( $( "#slider-erange2" ).slider( "values", 0 ) +" - " + $( "#slider-erange2" ).slider( "values", 1 ) ); 

		$( "#slider-erange2_1" ).slider({
			range: true,
			min: 0,
			max: 200000,
			values: [ 50000, 75000 ],
			slide: function( event, ui ) {
				$( "#erange2_1" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
			}
		});
		$( "#erange2_1" ).val( $( "#slider-erange2_1" ).slider( "values", 0 ) +" - " + $( "#slider-erange2_1" ).slider( "values", 1 ) ); 

		$( "#slider-flightrange2" ).slider({
			range: true,
			min: 0,
			max: 200000,
			values: [ 50000, 75000 ],
			slide: function( event, ui ) {
				$( "#flightrange2" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
			}
		});
		$( "#flightrange2" ).val( $( "#slider-flightrange2" ).slider( "values", 0 ) +" - " + $( "#slider-flightrange2" ).slider( "values", 1 ) ); 
		$( "#slider-flightrange3" ).slider({
			range: true,
			min: 0,
			max: 200000,
			values: [ 50000, 75000 ],
			slide: function( event, ui ) {
				$( "#flightrange3" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
			}
		});
		$( "#flightrange3" ).val( $( "#slider-flightrange3" ).slider( "values", 0 ) +" - " + $( "#slider-flightrange3" ).slider( "values", 1 ) ); 

		$( "#slider-range4" ).slider({
			range: true,
			min: 0,
			max: 200000,
			values: [ 50000, 75000 ],
			slide: function( event, ui ) {
				$( "#amount5" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
			}
		});
		$( "#amount5" ).val( $( "#slider-range4" ).slider( "values", 0 ) +" - " + $( "#slider-range4" ).slider( "values", 1 ) ); 
		$( "#slider-cruise2" ).slider({
			range: true,
			min: 0,
			max: 200000,
			values: [ 50000, 75000 ],
			slide: function( event, ui ) {
				$( "#cruiseamount3" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
			}
		});
		$( "#cruiseamount3" ).val( $( "#slider-cruise2" ).slider( "values", 0 ) +" - " + $( "#slider-cruise2" ).slider( "values", 1 ) ); 
		$( "#slider-cruise" ).slider({
			range: true,
			min: 0,
			max: 200000,
			values: [ 50000, 75000 ],
			slide: function( event, ui ) {
				$( "#cruiseslider" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
			}
		});
		$( "#cruiseslider" ).val( $( "#slider-cruise" ).slider( "values", 0 ) +" - " + $( "#slider-cruise" ).slider( "values", 1 ) ); 
		$( "#slider-ranges768" ).slider({
			range: true,
			min: 0,
			max: 20000,
			values: [ 0, 10000 ],
			slide: function( event, ui ) {
				$( "#amounts768" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
			}
		});
		$( "#amounts768" ).val( $( "#slider-ranges768" ).slider( "values", 0 ) +" - " + $( "#slider-ranges768" ).slider( "values", 1 ) ); 

		$( "#slider-range-port2" ).slider({
			range: true,
			min: 0,
			max: 200000,
			values: [ 5000, 75000 ],
			slide: function( event, ui ) {
				$( "#amount-port3" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
			}
		});
		$( "#amount-port3" ).val( $( "#slider-range-port2" ).slider( "values", 0 ) +" - " + $( "#slider-range-port2" ).slider( "values", 1 ) ); 
		$( "#slider-day2" ).slider({
			range: true,
			min: 4,
			max: 13,
			values: [ 4, 7 ],
			slide: function( event, ui ) {
				$( "#day2" ).val(ui.values[ 0 ] + "D - " + ui.values[ 1 ]+"D" );
			}
		});
		$( "#day2" ).val( $( "#slider-day2" ).slider( "values", 0 ) +"D - " + $( "#slider-day2" ).slider( "values", 1 )+"D" );
		$( "#slider-day3" ).slider({
			range: true,
			min: 4,
			max: 13,
			values: [ 4, 7 ],
			slide: function( event, ui ) {
				$( "#day3" ).val(ui.values[ 0 ] + "D - " + ui.values[ 1 ]+"D" );
			}
		});
		$( "#day3" ).val( $( "#slider-day3" ).slider( "values", 0 ) +"D - " + $( "#slider-day3" ).slider( "values", 1 )+"D" );

		$( "#slider-eday3" ).slider({
			range: true,
			min: 4,
			max: 13,
			values: [ 4, 7 ],
			slide: function( event, ui ) {
				$( "#eday3" ).val(ui.values[ 0 ] + "D - " + ui.values[ 1 ]+"D" );
			}
		});
		$( "#eday3" ).val( $( "#slider-eday3" ).slider( "values", 0 ) +"D - " + $( "#slider-eday3" ).slider( "values", 1 )+"D" );
		$( "#slider-eday3_2" ).slider({
			range: true,
			min: 4,
			max: 13,
			values: [ 4, 7 ],
			slide: function( event, ui ) {
				$( "#eday3_2" ).val(ui.values[ 0 ] + "D - " + ui.values[ 1 ]+"D" );
			}
		});
		$( "#eday3_2" ).val( $( "#slider-eday3_2" ).slider( "values", 0 ) +"D - " + $( "#slider-eday3_2" ).slider( "values", 1 )+"D" );


		$( "#slider-eday3_1" ).slider({
			range: true,
			min: 4,
			max: 13,
			values: [ 4, 7 ],
			slide: function( event, ui ) {
				$( "#eday3_1" ).val(ui.values[ 0 ] + "D - " + ui.values[ 1 ]+"D" );
			}
		});
		$( "#eday3_1" ).val( $( "#slider-eday3_1" ).slider( "values", 0 ) +"D - " + $( "#slider-eday3_1" ).slider( "values", 1 )+"D" );


		$( "#slider-range-port12" ).slider({
			range: true,
			min: 0,
			max: 200000,
			values: [ 5000, 75000 ],
			slide: function( event, ui ) {
				$( "#amount-port12" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
			}
		});
		$( "#amount-port12" ).val( $( "#slider-range-port12" ).slider( "values", 0 ) +" - " + $( "#slider-range-port12" ).slider( "values", 1 ) ); 


		$( "#slider-range-eport12" ).slider({
			range: true,
			min: 0,
			max: 200000,
			values: [ 5000, 75000 ],
			slide: function( event, ui ) {
				$( "#amount-port12" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
			}
		});
		$( "#amount-eport12" ).val( $( "#slider-range-eport12" ).slider( "values", 0 ) +" - " + $( "#slider-range-eport12" ).slider( "values", 1 ) ); 

		$( "#slider-range3" ).slider({
			range: true,
			min: 0,
			max: 3000,
			values: [ 0, 1000 ],
			slide: function( event, ui ) {
				$( "#amount4" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
			}
		});
		$( "#amount4" ).val( $( "#slider-range3" ).slider( "values", 0 ) +" - " + $( "#slider-range3" ).slider( "values", 1 ) ); 

		$( "#slider-range5" ).slider({
			range: true,
			min: 0,
			max: 3000,
			values: [ 0, 1000 ],
			slide: function( event, ui ) {
				$( "#amounts5" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
			}
		});
		$( "#amount5" ).val( $( "#slider-range5" ).slider( "values", 0 ) +" - " + $( "#slider-range5" ).slider( "values", 1 ) ); 
		$( "#slider-range6" ).slider({
			range: true,
			min: 0,
			max: 3000,
			values: [ 0, 1000 ],
			slide: function( event, ui ) {
				$( "#amount6" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ]);
			}
		});
		$( "#amount6" ).val( $( "#slider-range6" ).slider( "values", 0 ) +" - " + $( "#slider-range6" ).slider( "values", 1 ) ); 
		$( "#slider-return-port" ).slider({
			range: true,
			min: 0,
			max: 24,
			values: [ 6, 13 ],
			slide: function( event, ui ) {
				$( "#return-port" ).val(ui.values[ 0 ] + ":00 - " + ui.values[ 1 ]+":00 " );
			}
		});

		$("#return-port").val( $( "#slider-return-port" ).slider( "values", 0 ) +":00 -" + $( "#slider-return-port" ).slider( "values", 1 )+":00" );

		$( "#slider-return2" ).slider({
			range: true,
			min: 0,
			max: 24,
			values: [ 6, 13 ],
			slide: function( event, ui ) {
				$( "#return2" ).val(ui.values[ 0 ] + ":00 - " + ui.values[ 1 ]+":00" );
			}
		});
		$( "#return2" ).val( $( "#slider-return2" ).slider( "values", 0 ) +":00 -" + $( "#slider-return2" ).slider( "values", 1 )+":00" );
		$( "#slider-return3" ).slider({
			range: true,
			min: 0,
			max: 24,
			values: [ 6, 13 ],
			slide: function( event, ui ) {
				$( "#return3" ).val(ui.values[ 0 ] + ":00 - " + ui.values[ 1 ]+":00" );
			}
		});
		$( "#return3" ).val( $( "#slider-return3" ).slider( "values", 0 ) +":00 -" + $( "#slider-return3" ).slider( "values", 1 )+":00" );
	}

	if($().jcarousel){
		$('#mycarousel').jcarousel({
			auto: 7,
			start: 1,
			scroll:1,
			wrap: 'last',
			initCallback: mycarousel_initCallback
		});

		$('#mycarousel1, #mycarousel2, #mycarousel3, #mycarousel4, #mycarousel5').jcarousel({
			scroll: 1
		});

		$('#hotel_detail_carousel').jcarousel({
			start: 1,
			scroll:1,
		});

		$('#hotel_deals_carousel').jcarousel({
			scroll:4
		});


	}
	if($('#hiddenDate').length){
		$('#hiddenDate').datepicker({
			numberOfMonths: 2,
			minDate: 0,
			dateFormat: "dd M",
			onSelect: function (dateText) {
				$(this).css("color", "#333333");
				$('#datetext').text(dateText);
			}
		});

	}
	$('#pickDate').click(function (e) {
		e.preventDefault();
		$('#hiddenDate').datepicker('show');

	});

	function selectCar(path){
		if(path == "selcar"){

			document.getElementById('shopping_cart_panel1').style.display = 'block';
		}

	}

	function selectBus(path){
		if(path == "arrival"){

			document.getElementById('shopping_cart_panel').style.display = 'block';

			if(document.getElementById('selectContainer2').innerHTML == ''){
				document.getElementById("addRFlight").style.display = "block";
				document.getElementById('compPrice').innerHTML = '18,418';
			}
			else{
				document.getElementById("addRFlight").style.display = "none";
				document.getElementById('compPrice').innerHTML = '37,780';
			}

			document.getElementById('selectContainer1').innerHTML = '<span class="mR45 fR"><img src="Images/bin.png" alt="" id="dirImg"  ></span><span class="fL mR10"><span class="bus_xl fL"></span><span class="clearfix fL mTN5 dB fcWht">BOM	GOA, 25 Sep ‘14</span><span class="fS11 fcWht dB">Seat No. 43, 42 </span><span class="fS11 fcWht dB">05.30 – 06.35 (1h 05m ) <br/>Neeta tours and travels</span></span>';
			document.getElementById("addSFlight").style.display = "none";
			document.getElementById("priceBox").style.display = "block";
		}

		if(path == "return"){	document.getElementById('shopping_cart_panel').style.display = 'block';

			if(document.getElementById('selectContainer1').innerHTML == ""){
				document.getElementById("addSFlight").style.display = "block";
				document.getElementById('compPrice').innerHTML = '18,418';
			}
			else{
				document.getElementById("addSFlight").style.display = "none";
				document.getElementById('compPrice').innerHTML = '37,780';
			}

			document.getElementById('selectContainer2').innerHTML = '<span class="mR45 fR"><img src="Images/bin.png" alt="" id="dirImg"  ></span><span class="fL mR10"><span class="bus_xl fL"></span><span class="clearfix fL mTN5 dB">BOM	GOA, 25 Sep ‘14</span><span class="fS11 fcWht dB">Seat No. 43, 42 </span><span class="fS11 fcWht dB">05.30 – 06.35 (1h 05m ) <br/>Neeta tours and travels</span></span>';
			document.getElementById("addRFlight").style.display = "none";
			document.getElementById("priceBox").style.display = "block";
		}
		$("#cartCount").addClass("sel")
		if((document.getElementById('selectContainer1').innerHTML != '') && (document.getElementById('selectContainer2').innerHTML != ''))
			document.getElementById("selectBooking").style.display = "block";
		else	
			document.getElementById("selectBooking").style.display = "none";
	}


	/* Eurail ticket add city */
	var eur4 = 7;
	function addCityTicketEurail1(){
		if(eur4 < 10){
			$('#eurailTicketCity' + eur4).show();
			eur4++;
		}
	}

	function hideTicketEurailCity1(i){
		$("#eurailTicketCity" + i).hide();	
		if(i != 9)
			eur4 = i++;		
	}


	/* Eurail Pass add city */
	var eur5 = 7;
	function addCityPassEurail1(){
		if(eur5 < 10){
			$('#eurailPassCity' + eur5).show();
			eur5++;
		}
	}

	function hidePassEurailCity1(i){
		$("#eurailPassCity" + i).hide();	
		if(i != 9)
			eur5 = i++;		
	}



	/* Eurail Reservation add city */
	var eur6 = 7;
	function addCityReserveEurail1(){
		if(eur6 < 10){
			$('#eurailReserveCity' + eur6).show();
			eur6++;
		}
	}

	function hideReserveEurailCity1(i){
		$("#eurailReserveCity" + i).hide();	
		if(i != 9)
			eur6 = i++;		
	}



	$(document).ready(function () {
		$('#moreFlightOptons1').on('click', function (e) {
			$("#flightOptionsSearchPanel1").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('- Eurail options');	   
			}else{
				$(this).text(' + Eurail options');
			}
		});	
	});

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
	$(document).ready(function () {
		$('#reservationview').on('click', function (e) {
			$("#reservationdetails3").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('- Reservation in 2 Sectors');	   
			}else{
				$(this).text(' + Reservation in 2 Sectors');
			}
		});	
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

	var leg = 1;
	leg1Added = leg2Added = leg3Added = leg4Added = 0;

	function selectMultiFlightreserv1(flightLeg){
		document.getElementById('shopping_cart_panel').style.display = 'block';
		$(".footerContactDetail").addClass("activated");
		$("#shoppingCartTab").addClass('sel');
		if(flightLeg == 1){
			document.getElementById("selectFlightLeg1").innerHTML = '<div class="fL"><span class="wayNum mR10" id="multiWayTop1">1</span>BOM - DEL, 25 Sep‘14 <br/><img src="images/srp_flight/indigo_sml_logo.jpg" class="mB5 fL mR15 mT10" alt="Air India Logo"><span class="fL w48pcnt_imp fS11 mT10">05.30 – 06.35 <br>non stop<br>Indigo 6E 198<br><a href="javascript:void(0);">Change Flight</a></span><br class="cB"><span class="addFlight mT10 mB10 fR fS30">+</span><br class="cB"><img src="images/hotel3_thumb.jpg" alt="" class="mB5 fL w20pcnt"><span class="fL mL10 w48pcnt_imp fS11"><a href="javascript:void(0);">Adarsh Hamilton</a><br><span class="fullRatingstar_icon"></span><span class="fullRatingstar_icon"></span><span class="fullRatingstar_icon"></span><span class="fullRatingstar_icon"></span><br><span class="fS11 fontColorWht"><img src="images/common/tripadvisor.png" class="w20pcnt" alt="tripadvisor"><br/>4.5/5 Excellent<br/>(based on 250 reviews)</span><br/>Deluxe room<br><a href="javascript:void(0);">Change Hotel</a></span></div>';
			$("#multiWayBtm2,#multiWayBtm3,#multiWayBtm4").removeClass("sel");
			$("#multiWayBtm1").addClass("sel");
			leg1Added = 1;
		}
		if(flightLeg == 2){
			document.getElementById("selectFlightLeg2").innerHTML = '<div class="fL"><span class="wayNum mR10" id="multiWayTop1">1</span>BOM - DEL, 25 Sep‘14 <br/><img src="images/srp_flight/indigo_sml_logo.jpg" class="mB5 fL mR15 mT10" alt="Air India Logo"><span class="fL w48pcnt_imp fS11 mT10">05.30 – 06.35 <br>non stop<br>Indigo 6E 198<br><a href="javascript:void(0);">Change Flight</a></span><br class="cB"><span class="addFlight mT10 mB10 fR fS30">+</span><br class="cB"><img src="images/hotel3_thumb.jpg" alt="" class="mB5 fL mL10 w20pcnt"><span class="fL mL10 w48pcnt_imp fS11"><a href="javascript:void(0);">Adarsh Hamilton</a><br><span class="fullRatingstar_icon"></span><span class="fullRatingstar_icon"></span><span class="fullRatingstar_icon"></span><span class="fullRatingstar_icon"></span><br><span class="fS11 fontColorWht"><img src="images/common/tripadvisor.png" class="w20pcnt" alt="tripadvisor"><br/>4.5/5 Excellent<br/>(based on 250 reviews)</span><br/>Deluxe room<br><a href="javascript:void(0);">Change Hotel</a></span></div>';
			$("#multiWayBtm1,#multiWayBtm3,#multiWayBtm4").removeClass("sel");
			$("#multiWayBtm2").addClass("sel");
			leg2Added = 1;

		}
		if(flightLeg == 3){
			document.getElementById("selectFlightLeg3").innerHTML = '<div class="fL"><span class="wayNum mR10" id="multiWayTop1">1</span>BOM - DEL, 25 Sep‘14 <br/><img src="images/srp_flight/indigo_sml_logo.jpg" class="mB5 fL mR15 mT10" alt="Air India Logo"><span class="fL w48pcnt_imp fS11 mT10">05.30 – 06.35 <br>non stop<br>Indigo 6E 198<br><a href="javascript:void(0);">Change Flight</a></span><br class="cB"><span class="addFlight mT10 mB10 fR fS30">+</span><br class="cB"><img src="images/hotel3_thumb.jpg" alt="" class="mB5 fL mL10 w20pcnt"><span class="fL mL10 w48pcnt_imp fS11"><a href="javascript:void(0);">Adarsh Hamilton</a><br><span class="fullRatingstar_icon"></span><span class="fullRatingstar_icon"></span><span class="fullRatingstar_icon"></span><span class="fullRatingstar_icon"></span><br><span class="fS11 fontColorWht"><img src="images/common/tripadvisor.png" class="w20pcnt" alt="tripadvisor"><br/>4.5/5 Excellent<br/>(based on 250 reviews)</span><br/>Deluxe room<br><a href="javascript:void(0);">Change Hotel</a></span></div>';
			$("#multiWayBtm1,#multiWayBtm2,#multiWayBtm4").removeClass("sel");	
			$("#multiWayBtm3").addClass("sel");
			leg3Added = 1;

		}
		if(flightLeg == 4){
			document.getElementById("selectFlightLeg4").innerHTML = '<div class="fL"><span class="wayNum mR10" id="multiWayTop1">1</span>BOM - DEL, 25 Sep‘14 <br/><img src="images/srp_flight/indigo_sml_logo.jpg" class="mB5 fL mR15 mT10" alt="Air India Logo"><span class="fL w48pcnt_imp fS11 mT10">05.30 – 06.35 <br>non stop<br>Indigo 6E 198<br><a href="javascript:void(0);">Change Flight</a></span><br class="cB"><span class="addFlight mT10 mB10 fR fS30">+</span><br class="cB"><img src="images/hotel3_thumb.jpg" alt="" class="mB5 fL mL10 w20pcnt"><span class="fL mL10 w48pcnt_imp fS11"><a href="javascript:void(0);">Adarsh Hamilton</a><br><span class="fullRatingstar_icon"></span><span class="fullRatingstar_icon"></span><span class="fullRatingstar_icon"></span><span class="fullRatingstar_icon"></span><br><span class="fS11 fontColorWht"><img src="images/common/tripadvisor.png" class="w20pcnt" alt="tripadvisor"><br/>4.5/5 Excellent<br/>(based on 250 reviews)</span><br/>Deluxe room<br><a href="javascript:void(0);">Change Hotel</a></span></div>';
			$("#multiWayBtm1,#multiWayBtm2,#multiWayBtm3").removeClass("sel");
			$("#multiWayBtm4").addClass("sel");
			leg4Added = 1;

		}


		if((leg1Added == 1) && (leg2Added == 1) && (leg3Added == 1) && (leg4Added == 1))
			document.getElementById("selectBooking").style.display = "block";
		else
			document.getElementById("selectBooking").style.display = "none";
		document.getElementById("cartCount").innerHTML = leg;	
		$("#cartCount").addClass("sel")
		leg++;
	}
	var leg = 1;
	leg1Added = leg2Added = leg3Added = leg4Added = 0;

	function selectMultiFlightreserv(flightLeg){
		document.getElementById('shopping_cart_panel').style.display = 'block';
		$(".footerContactDetail").addClass("activated");
		$("#shoppingCartTab").addClass('sel');
		if(flightLeg == 1){
			document.getElementById("selectFlightLeg1").innerHTML = '<span class="wayNum mR10 fL" id="multiWayBtm1">1</span><div class="fL w72pcnt"> <span class="fL w100pcnt mB5">London- Paris</span> <span class="fL"> <span class="fL"><img src="images/common/carnival_fantasy_logo.jpg" alt="Cruises Logo" class="mR10"></span> <span class="fL"> 25 Sep 14<br>$ 300 </span> <span class="mT5 fR cB"><img src="images/bin.png" alt="delete" onclick="deleteSelect(1)" /></span></span> </div>';
			$("#multiWayBtm2,#multiWayBtm3,#multiWayBtm4").removeClass("sel");
			$("#multiWayBtm1").addClass("sel");
			leg1Added = 1;
			document.getElementById("selecteurail1").style.display='none';
			document.getElementById("selectedover1").style.display='block';
		}
		if(flightLeg == 2){
			document.getElementById("selectFlightLeg2").innerHTML = '<span class="wayNum mR10 fL" id="multiWayBtm2">2</span><div class="fL w72pcnt"> <span class="fL w100pcnt mB5">London- Paris</span> <span class="fL"> <span class="fL"><img src="images/common/carnival_fantasy_logo.jpg" alt="Cruises Logo" class="mR10"></span> <span class="fL"> 25 Sep 14<br>$ 300 </span><span class="mT5 fR cB"><img src="images/bin.png" alt="delete" onclick="deleteSelect(2)" /></span> </span> </div>';
			$("#multiWayBtm1,#multiWayBtm3,#multiWayBtm4").removeClass("sel");
			$("#multiWayBtm2").addClass("sel");
			leg2Added = 1;
			document.getElementById("selecteurail2").style.display='none';
			document.getElementById("selectedover2").style.display='block';
		}
		if(flightLeg == 3){
			document.getElementById("selectFlightLeg3").innerHTML = '<span class="wayNum mR10 fL" id="multiWayBtm3">3</span><div class="fL w72pcnt"> <span class="fL w100pcnt mB5">London- Paris</span> <span class="fL"> <span class="fL"><img src="images/common/carnival_fantasy_logo.jpg" alt="Cruises Logo" class="mR10"></span> <span class="fL"> 25 Sep 14<br>$ 300 </span><span class="mT5 fR cB"><img src="images/bin.png" alt="delete" onclick="deleteSelect(3)" /></span> </span> </div>';
			$("#multiWayBtm1,#multiWayBtm2,#multiWayBtm4").removeClass("sel");	
			$("#multiWayBtm3").addClass("sel");
			leg3Added = 1;
			document.getElementById("selecteurail3").style.display='none';
			document.getElementById("selectedover3").style.display='block';
		}
		if(flightLeg == 4){
			document.getElementById("selectFlightLeg4").innerHTML = '<span class="wayNum mR10 fL" id="multiWayBtm4">4</span><div class="fL w72pcnt"> <span class="fL w100pcnt mB5">London- Paris</span> <span class="fL"> <span class="fL"><img src="images/common/carnival_fantasy_logo.jpg" alt="Cruises Logo" class="mR10"></span> <span class="fL"> 25 Sep 14<br>$ 300 </span><span class="mT5 fR cB"><img src="images/bin.png" alt="delete" onclick="deleteSelect(4)" /></span> </span> </div>';
			$("#multiWayBtm1,#multiWayBtm2,#multiWayBtm3").removeClass("sel");
			$("#multiWayBtm4").addClass("sel");
			leg4Added = 1;
			document.getElementById("selecteurail4").style.display='none';
			document.getElementById("selectedover4").style.display='block';
		}

		document.getElementById("totalFare").innerHTML = (300*leg);


		if((leg1Added == 1) && (leg2Added == 1) && (leg3Added == 1) && (leg4Added == 1))
			{
				document.getElementById("selectBooking").style.display = "block";
			}
			else
				{
					document.getElementById("selectBooking").style.display = "none";
				}	
				if((leg1Added == 1) || (leg2Added == 1) || (leg3Added == 1) || (leg4Added == 1))
					{
						document.getElementById("shopping_cart_panel").style.display = "block";
					}
					else
						{
							document.getElementById('shopping_cart_panel').style.display = "none";
						}
						leg++;
	}


	var leg = 1;
	leg1Added = leg2Added = leg3Added = leg4Added = 0;

	function selectMultiFlightact(flightLeg,row){
		document.getElementById('shopping_cart_panel').style.display = 'block';
		$(".footerContactDetail").addClass("activated");
		$("#shoppingCartTab").addClass('sel');
		if(flightLeg == 1){
			document.getElementById("selectFlightLeg1").innerHTML = '<span class="wayNum mR10 fL" id="multiWayBtm1">1</span><div class=" w5pcnt_imp  fR  ">	<br/><span class="fW600 fS30 mT20">+</span>  </div><div class="fL fS12 w75pcnt"><span class="fL mR10"><img src="images/srp_flight/indigo_sml_logo.jpg" class="mB5" alt="Air India Logo"><span class="fS12 fcWht dB">Air India AI 349</span></span><span class="clearfix fL mTN5 dB"><span class="clearfix dB"><span class="fcWht fL ">Mumbai<br> 11.30</span><span class="flight_icon_sml fL mTB2LR10"></span><span class="fcWht fL ">Delhi<br> 4.35</span></span><span class="fS11 fcWht dB">3h 5m  </span><span class="fS11 fcWht dB">non stop</span></span><span class="mT5 fR cB"><img src="images/bin.png" alt="delete" onclick="deleteSelect1(1)" /></span> </div>';
			leg1Added = 1;
			$("#multiWayBtm2,#multiWayBtm3,#multiWayBtm4").removeClass("sel");
			$("#multiWayBtm1").addClass("sel");

			for(i=1;i<3;i++)
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
			document.getElementById("selectFlightLeg2").innerHTML = '<span class="wayNum mR10 fL" id="multiWayBtm2">2</span><div class=" w5pcnt_imp  fR  ">	<br/><span class="fW600 fS30 mT20">+</span>  </div><div class="fL w72pcnt"> <span class="fL mR10"><img src="images/srp_flight/indigo_sml_logo.jpg" class="mB5" alt="Air India Logo"><span class="fS12 fcWht dB">Air India AI 349</span></span><span class="clearfix fL mTN5 dB"><span class="clearfix dB"><span class="fcWht fL ">Mumbai<br> 11.30</span><span class="flight_icon_sml fL mTB2LR10"></span><span class="fcWht fL ">Delhi<br> 4.35</span></span><span class="fS11 fcWht dB">3h 5m  </span><span class="fS11 fcWht dB">non stop</span></span><span class="mT5 fR"><img src="images/bin.png" alt="delete" onclick="deleteSelect1(2)" /></span></div>';
			leg2Added = 1;
			$("#multiWayBtm1,#multiWayBtm3,#multiWayBtm4").removeClass("sel");
			$("#multiWayBtm2").addClass("sel");

			for(i=11;i<13;i++)
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
			document.getElementById("selectFlightLeg3").innerHTML = '<span class="wayNum mR10 fL" id="multiWayBtm3">3</span><div class=" w5pcnt_imp  fR  ">	<br/><span class="fW600 fS30 mT20">+</span>  </div><div class="fL w72pcnt"> <span class="fL mR10"><img src="images/srp_flight/indigo_sml_logo.jpg" class="mB5" alt="Air India Logo"><span class="fS12 fcWht dB">Air India AI 349</span></span><span class="clearfix fL mTN5 dB"><span class="clearfix dB"><span class="fcWht fL ">Mumbai<br> 11.30</span><span class="flight_icon_sml fL mTB2LR10"></span><span class="fcWht fL ">Delhi<br> 4.35</span></span><span class="fS11 fcWht dB">3h 5m  </span><span class="fS11 fcWht dB">non stop</span></span><span class="mT5 fR"><img src="images/bin.png" alt="delete" onclick="deleteSelect1(3)" /></span></div>';
			leg3Added = 1;
			$("#multiWayBtm2,#multiWayBtm1,#multiWayBtm4").removeClass("sel");
			$("#multiWayBtm3").addClass("sel");

			for(i=21;i<23;i++)
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
			document.getElementById("selectFlightLeg4").innerHTML = '<span class="wayNum mR10 fL" id="multiWayBtm4">4</span><div class="fL w72pcnt"> <span class="fL mR10"><img src="images/srp_flight/indigo_sml_logo.jpg" class="mB5" alt="Air India Logo"><span class="fS12 fcWht dB">Air India AI 349</span></span><span class="clearfix fL mTN5 dB"><span class="clearfix dB"><span class="fcWht fL ">Mumbai<br> 11.30</span><span class="flight_icon_sml fL mTB2LR10"></span><span class="fcWht fL ">Delhi<br> 4.35</span></span><span class="fS11 fcWht dB">3h 5m  </span><span class="fS11 fcWht dB">non stop</span></span><span class="mT5 fR"><img src="images/bin.png" alt="delete" onclick="deleteSelect1(4)" /></span></div>';
			leg4Added = 1;
			document.getElementById("selectBooking").style.display = "block";
			$("#multiWayBtm1,#multiWayBtm3,#multiWayBtm2").removeClass("sel");
			$("#multiWayBtm4").addClass("sel");

			for(i=31;i<33;i++)
			{if(i== row)
				document.getElementById("selectedover"+row).style.display='block';
			else
				document.getElementById("selectedover"+i).style.display='none';
			}
			$(document).ready(function () {

				$('.nextBtn').trigger('click');
			});
		}
		document.getElementById("totalFare").innerHTML = (300*leg);
		if((leg1Added == 1) && (leg2Added == 1) && (leg3Added == 1) && (leg4Added == 1))
			document.getElementById("selectBooking").style.display = "block";
		else
			document.getElementById("selectBooking").style.display = "none";
		leg++;
		if((leg1Added == 1) || (leg2Added == 1) || (leg3Added == 1) || (leg4Added == 1))
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

	function deleteSelect1(id)
	{
		document.getElementById("selectFlightLeg"+id).innerHTML='<div id="addFlightLeg1" class="addFlight_ActionPnl">Add leg '+id+' </div>';
		if(id ==4)
			{
				leg4Added = 0;
				for(i=31;i<33;i++)
				{
					document.getElementById("selectedover"+i).style.display='none';
				}
			}if(id ==1)
				{
					leg1Added = 0;
					for(i=1;i<2;i++)
					{
						document.getElementById("selectedover"+i).style.display='none';
					}
				}if(id ==2)
					{
						leg2Added = 0;
						for(i=11;i<13;i++)
						{
							document.getElementById("selectedover"+i).style.display='none';
						}
					}if(id ==3)
						{
							leg3Added = 0;
							for(i=21;i<23;i++)
							{
								document.getElementById("selectedover"+i).style.display='none';
							}
						}
						leg--;
						document.getElementById("totalFare").innerHTML = (-300+300*leg);
						if((leg1Added == 1) && (leg2Added == 1) && (leg3Added == 1) && (leg4Added == 1))
							{
								document.getElementById("selectBooking").style.display = "block";
								document.getElementById("priceBox").style.display = "none";
							}
							else
								{
									document.getElementById("selectBooking").style.display = "none";
									document.getElementById("priceBox").style.display = "block";
								}	
								if((leg1Added == 1) || (leg2Added == 1) || (leg3Added == 1) || (leg4Added == 1))
									{
										document.getElementById("shopping_cart_panel").style.display = "block";
									}
									else
										{
											document.getElementById('shopping_cart_panel').style.display = "none";
										}
	}
	$(document).ready(function () {
		$('#firstbtn').on('click', function (e) {
			$("#firstalert").show();
			$("#secalert").hide();
			$("#thirdalert").hide();

		});
	});
	$(document).ready(function () {
		$('#secondbtn').on('click', function (e) {
			$("#secalert").show();
			$("#firstalert").hide();
			$("#thirdalert").hide();

		});
	});
	$(document).ready(function () {
		$('#thirdbtn').on('click', function (e) {
			$("#thirdalert").show();
			$("#firstalert").hide();
			$("#secalert").hide();

		});
	});
	var  showHidePanel;
	function showMoreInfo1(id1, id2, id3)
	{
		$("#" + id1).toggleClass("active");
		$("#" + id2).slideToggle();

		if ($("#" + id1).hasClass('active')) {
			showHidePanel = 1;
			$("#" + id3).html(" - ");		   
		}else{
			$("#" + id3).html(" + ");

			if($("#multicity").is(":checked")){
				if( $("#multiwaySearchParameters6").is(":hidden") &&  $("#multiwaySearchParameters7").is(":hidden") &&  $("#multiwaySearchParameters8").is(":hidden")  ){
					showHidePanel = 0;
				}
			}
			else{
				if( !$("#addFlight1").is(":checked") &&  !$("#addCar").is(":checked")){showHidePanel = 0;}
			}
		}	
	}
	if($('#slider-range-sec').length){
		$( "#slider-range-sec" ).slider({
			range: "min",
			min: 0,
			max: 100000,
			value:38867,
			slide: function( event, ui ) {
				$( "#priceChangesec" ).val( ui.value );
			}
		});

		$("<span class='rupee'>Rs.</span>").insertBefore( "#priceChangesec" );
		$( "#priceChangesec" ).val( $( "#slider-range-sec" ).slider( "value" ) );
	}

	if($('#slider-range-sec').length){
		$( "#slider-range-third" ).slider({
			range: "min",
			min: 0,
			max: 100000,
			value:38867,
			slide: function( event, ui ) {
				$( "#priceChangethird" ).val( ui.value );
			}
		});

		$("<span class='rupee'>Rs.</span>").insertBefore( "#priceChangethird" );
		$( "#priceChangethird" ).val( $( "#slider-range-third" ).slider( "value" ) );
	}
	$(".globalSrcExpContr1").click( function(){
		$("#globalSrcToggle1").slideToggle();
		$(".globalSrcShow1").toggleClass("sel");

		if($(".globalSrcShow1").hasClass("sel") ){
			$(".globalSrcShow1").text("Hide");
		}
		else{
			$(".globalSrcShow1").text("Show");
		}	
	});
	// Function to stick the secondry nav to the top as user scrolls  for homepage
	if($("#primary_navigation1").length){
		var stickyRibbonTop = $('#primary_navigation1').offset().top;
		$('#primary_navigation_container1').show();
		$(window).scroll(function(){
			if( $(window).scrollTop() > stickyRibbonTop ) {
				$('#primary_navigation1').addClass('primaryNavfixTop').removeClass('primaryNavigation_fixed');

				if( $(".globalSrcExpContr1").is(":visible") ){
					$('#primary_navigation_container1').show();
				}
				else{
					$('#primary_navigation_container1').hide();
				}


				$('#travelDeals').removeClass('showDeals');
				$('.hideContr').hide();
			} else {
				$('#primary_navigation1').removeClass('primaryNavfixTop').addClass('primaryNavigation_fixed');
				$('#primary_navigation_container1').show();
				$('#travelDeals1').addClass('showDeals');
				$('.hideContr').show();
			}
		});
	}

	// Function to stick the secondry nav to the top as user scrolls  for all other pages 
	if($("#primary_navigation_inner1").length){
		var stickyRibbonTop = $('#primary_navigation_inner1').offset().top;
		//$('#primary_navigation_container').show();
		$(window).scroll(function(){
			if( $(window).scrollTop() > stickyRibbonTop ) {
				$('#primary_navigation_inner1').addClass('primaryNavfixTop').removeClass('primaryNavigation_fixed_inner');
			} else {
				$('#primary_navigation_inner1').removeClass('primaryNavfixTop').addClass('primaryNavigation_fixed_inner');
			}
		});
	}
	$('.modSrcBtn1').on('click', function (e) {

		$(".contentPanel1").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src', ezgImagesPath + '/common/down-arrow-wht.png');		   
		}else{
			$(this).find('img').attr('src', ezgImagesPath + '/common/right-arrow-wht.png');
		}
	});	


	if( $(".contentPanel1").length ){	
		$(window).resize( function(){
			if( $(window).width() > 800){
				$(".contentPanel1").hide();
				$(".modSrcBtn1").removeClass('active');
				$(".modSrcBtn1 > img").attr("src","images/common/right-arrow-wht.png")
			}
		});	
	}
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
	$(document).ready(function () {
		$('#markupOpt').on('click', function (e) {
			$("#markupContr").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).find('img').attr('src', ezgImagesPath + '/expand_blu.png');
			}else{
				$(this).find('img').attr('src', ezgImagesPath + '/collapse_blu.png');
			}
		});
	});
	function view1(selTab, selCont, tabs){
		for(i=1; i<=tabs; i++){
			document.getElementById('viewTab'+i).className = '';
			document.getElementById('viewContr'+i).style.display = 'none'
			if(i==4){
				document.getElementById('viewTab'+i).className = 'first';	
			}
			if(tabs == 6 && i == 6){
				document.getElementById('viewTab3').className = 'last';	
			}
			if(tabs == 5 && i == 5){
				document.getElementById('viewTab2').className = 'last';	
			}
		}
		document.getElementById(selTab).className = 'sel';
		if(selTab == 'viewTab4'){
			document.getElementById(selTab).className = 'first sel';
		}
		if(tabs == 6 && selTab == 'viewTab6'){
			document.getElementById("viewTab6").className = 'last sel';	
		}
		if(tabs == 5 && selTab == 'viewTab5'){
			document.getElementById("viewTab5").className = 'last sel';	
		}
		document.getElementById(selCont).style.display = 'block'
	}
	function searchBus(obj){

		switch(obj)
		{
			case "oneway1":
				document.getElementById('returnFlightContainer1').style.visibility = 'hidden';
				//document.getElementById("multiwaySearchPanel_2").style.display = "none";	
				document.getElementById("comboOfferTriggers1").style.display = "block";
				$("#multiwaySearchParameters3, #multiwaySearchParameters4, #multiwaySearchParameters5").hide();
				//document.getElementById("carType").style.display = "none";
				//document.getElementById("noOfCars").style.display = "none";
				$("#flightOptionsSearchPanel,#carSearchPanel,#flightSearchPanel1").hide();
				//document.getElementById("pickUpDateHolder").style.display = "none";
				//document.getElementById("dropOffDateHolder").style.display = "none";
				$("#moreFlightOpton1").removeClass("active");
				$("#plusMinus1").text("+")
				$("#addCar,#addFlight2").prop("checked",false)
				mc = 3
				showHidePanel = 0;
				$("#globalSrcToggle1").show();
				$(".globalSrcShow").text("Hide");
				$(".globalSrcShow").addClass("sel");



				break;
			case "returns":
				document.getElementById('returnFlightContainer1').style.visibility = 'visible';	
				//document.getElementById("multiwaySearchPanel_2").style.display = "none";	
				document.getElementById("comboOfferTriggers1").style.display = "block";
				$("#multiwaySearchParameters3, #multiwaySearchParameters4, #multiwaySearchParameters5").hide();
				$("#flightOptionsSearchPanel,#carSearchPanel,#flightSearchPanel1").hide();
				$("#moreFlightOpton1").removeClass("active");
				$("#plusMinus1").text("+")
				$("#addCar,#addFlight2").prop("checked",false)
				showHidePanel = 0;
				mc = 3;
				$("#globalSrcToggle1").show();
				$(".globalSrcShow").text("Hide");
				$(".globalSrcShow").addClass("sel");


				break;
			default :	
				document.getElementById('returnFlightContainer1').style.display = 'block';
		}
	}
	// Function to stick the secondry nav to the top as user scrolls  for homepage
	if($("#primary_navigation2").length){
		var stickyRibbonTop = $('#primary_navigation2').offset().top;
		$('#primary_navigation_container2').show();
		$(window).scroll(function(){
			if( $(window).scrollTop() > stickyRibbonTop ) {
				$('#primary_navigation2').addClass('primaryNavfixTop').removeClass('primaryNavigation_fixed');

				if( $(".globalSrcExpContr2").is(":visible") ){
					$('#primary_navigation_container2').show();
				}
				else{
					$('#primary_navigation_container2').hide();
				}


				$('#travelDeals').removeClass('showDeals');
				$('.hideContr').hide();
			} else {
				$('#primary_navigation2').removeClass('primaryNavfixTop').addClass('primaryNavigation_fixed');
				$('#primary_navigation_container2').show();
				$('#travelDeals2').addClass('showDeals');
				$('.hideContr').show();
			}
		});
	}

	// Function to stick the secondry nav to the top as user scrolls  for all other pages 
	if($("#primary_navigation_inner2").length){
		var stickyRibbonTop = $('#primary_navigation_inner2').offset().top;
		//$('#primary_navigation_container').show();
		$(window).scroll(function(){
			if( $(window).scrollTop() > stickyRibbonTop ) {
				$('#primary_navigation_inner2').addClass('primaryNavfixTop').removeClass('primaryNavigation_fixed_inner');
			} else {
				$('#primary_navigation_inner2').removeClass('primaryNavfixTop').addClass('primaryNavigation_fixed_inner');
			}
		});
	}
	$('.modSrcBtn2').on('click', function (e) {

		$(".contentPanel1").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src', ezgImagesPath + '/common/down-arrow-wht.png');		   
		}else{
			$(this).find('img').attr('src', ezgImagesPath + '/common/right-arrow-wht.png');
		}
	});	


	if( $(".contentPanel1").length ){	
		$(window).resize( function(){
			if( $(window).width() > 800){
				$(".contentPanel1").hide();
				$(".modSrcBtn2").removeClass('active');
				$(".modSrcBtn2 > img").attr("src","images/common/right-arrow-wht.png")
			}
		});	
	}

	//for car
	// Function to stick the secondry nav to the top as user scrolls  for homepage
	if($("#primary_navigation2").length){
		var stickyRibbonTop = $('#primary_navigation3').offset().top;
		$('#primary_navigation_container3').show();
		$(window).scroll(function(){
			if( $(window).scrollTop() > stickyRibbonTop ) {
				$('#primary_navigation3').addClass('primaryNavfixTop').removeClass('primaryNavigation_fixed');

				if( $(".globalSrcExpContr3").is(":visible") ){
					$('#primary_navigation_container3').show();
				}
				else{
					$('#primary_navigation_container3').hide();
				}


				$('#travelDeals').removeClass('showDeals');
				$('.hideContr').hide();
			} else {
				$('#primary_navigation3').removeClass('primaryNavfixTop').addClass('primaryNavigation_fixed');
				$('#primary_navigation_container3').show();
				$('#travelDeals3').addClass('showDeals');
				$('.hideContr').show();
			}
		});
	}

	// Function to stick the secondry nav to the top as user scrolls  for all other pages 
	if($("#primary_navigation_inner3").length){
		var stickyRibbonTop = $('#primary_navigation_inner3').offset().top;
		//$('#primary_navigation_container').show();
		$(window).scroll(function(){
			if( $(window).scrollTop() > stickyRibbonTop ) {
				$('#primary_navigation_inner3').addClass('primaryNavfixTop').removeClass('primaryNavigation_fixed_inner');
			} else {
				$('#primary_navigation_inner3').removeClass('primaryNavfixTop').addClass('primaryNavigation_fixed_inner');
			}
		});
	}
	$('.modSrcBtn3').on('click', function (e) {

		$(".contentPanel1").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src', ezgImagesPath + '/common/down-arrow-wht.png');		   
		}else{
			$(this).find('img').attr('src', ezgImagesPath + '/common/right-arrow-wht.png');
		}
	});	


	if( $(".contentPanel1").length ){	
		$(window).resize( function(){
			if( $(window).width() > 800){
				$(".contentPanel1").hide();
				$(".modSrcBtn3").removeClass('active');
				$(".modSrcBtn3 > img").attr("src","images/common/right-arrow-wht.png")
			}
		});	
	}
	//for cruise
	// Function to stick the secondry nav to the top as user scrolls  for homepage
	if($("#primary_navigation4").length){
		var stickyRibbonTop = $('#primary_navigation4').offset().top;
		$('#primary_navigation_container4').show();
		$(window).scroll(function(){
			if( $(window).scrollTop() > stickyRibbonTop ) {
				$('#primary_navigation4').addClass('primaryNavfixTop').removeClass('primaryNavigation_fixed');

				if( $(".globalSrcExpContr4").is(":visible") ){
					$('#primary_navigation_container4').show();
				}
				else{
					$('#primary_navigation_container4').hide();
				}


				$('#travelDeals').removeClass('showDeals');
				$('.hideContr').hide();
			} else {
				$('#primary_navigation4').removeClass('primaryNavfixTop').addClass('primaryNavigation_fixed');
				$('#primary_navigation_container4').show();
				$('#travelDeals4').addClass('showDeals');
				$('.hideContr').show();
			}
		});
	}

	// Function to stick the secondry nav to the top as user scrolls  for all other pages 
	if($("#primary_navigation_inner4").length){
		var stickyRibbonTop = $('#primary_navigation_inner4').offset().top;
		//$('#primary_navigation_container').show();
		$(window).scroll(function(){
			if( $(window).scrollTop() > stickyRibbonTop ) {
				$('#primary_navigation_inner4').addClass('primaryNavfixTop').removeClass('primaryNavigation_fixed_inner');
			} else {
				$('#primary_navigation_inner4').removeClass('primaryNavfixTop').addClass('primaryNavigation_fixed_inner');
			}
		});
	}
	$('.modSrcBtn4').on('click', function (e) {

		$(".contentPanel1").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src', ezgImagesPath + '/common/down-arrow-wht.png');		   
		}else{
			$(this).find('img').attr('src', ezgImagesPath + '/common/right-arrow-wht.png');
		}
	});	


	if( $(".contentPanel1").length ){	
		$(window).resize( function(){
			if( $(window).width() > 800){
				$(".contentPanel1").hide();
				$(".modSrcBtn4").removeClass('active');
				$(".modSrcBtn4 > img").attr("src","images/common/right-arrow-wht.png")
			}
		});	
	}
	//for Eurail pass
	// Function to stick the secondry nav to the top as user scrolls  for homepage
	if($("#primary_navigation5").length){
		var stickyRibbonTop = $('#primary_navigation5').offset().top;
		$('#primary_navigation_container5').show();
		$(window).scroll(function(){
			if( $(window).scrollTop() > stickyRibbonTop ) {
				$('#primary_navigation5').addClass('primaryNavfixTop').removeClass('primaryNavigation_fixed');

				if( $(".globalSrcExpContr5").is(":visible") ){
					$('#primary_navigation_container5').show();
				}
				else{
					$('#primary_navigation_container5').hide();
				}


				$('#travelDeals5').removeClass('showDeals');
				$('.hideContr').hide();
			} else {
				$('#primary_navigation5').removeClass('primaryNavfixTop').addClass('primaryNavigation_fixed');
				$('#primary_navigation_container5').show();
				$('#travelDeals5').addClass('showDeals');
				$('.hideContr').show();
			}
		});
	}

	// Function to stick the secondry nav to the top as user scrolls  for all other pages 
	if($("#primary_navigation_inner5").length){
		var stickyRibbonTop = $('#primary_navigation_inner5').offset().top;
		//$('#primary_navigation_container').show();
		$(window).scroll(function(){
			if( $(window).scrollTop() > stickyRibbonTop ) {
				$('#primary_navigation_inner5').addClass('primaryNavfixTop').removeClass('primaryNavigation_fixed_inner');
			} else {
				$('#primary_navigation_inner5').removeClass('primaryNavfixTop').addClass('primaryNavigation_fixed_inner');
			}
		});
	}
	$('.modSrcBtn5').on('click', function (e) {

		$(".contentPanel1").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src', ezgImagesPath + '/common/down-arrow-wht.png');		   
		}else{
			$(this).find('img').attr('src', ezgImagesPath + '/common/right-arrow-wht.png');
		}
	});	


	if( $(".contentPanel1").length ){	
		$(window).resize( function(){
			if( $(window).width() > 800){
				$(".contentPanel1").hide();
				$(".modSrcBtn5").removeClass('active');
				$(".modSrcBtn5 > img").attr("src","images/common/right-arrow-wht.png")
			}
		});	
	}
	//for Eurail tickit
	// Function to stick the secondry nav to the top as user scrolls  for homepage
	if($("#primary_navigation6").length){
		var stickyRibbonTop = $('#primary_navigation6').offset().top;
		$('#primary_navigation_container6').show();
		$(window).scroll(function(){
			if( $(window).scrollTop() > stickyRibbonTop ) {
				$('#primary_navigation6').addClass('primaryNavfixTop').removeClass('primaryNavigation_fixed');

				if( $(".globalSrcExpContr6").is(":visible") ){
					$('#primary_navigation_container6').show();
				}
				else{
					$('#primary_navigation_container6').hide();
				}


				$('#travelDeals6').removeClass('showDeals');
				$('.hideContr').hide();
			} else {
				$('#primary_navigation6').removeClass('primaryNavfixTop').addClass('primaryNavigation_fixed');
				$('#primary_navigation_container6').show();
				$('#travelDeals6').addClass('showDeals');
				$('.hideContr').show();
			}
		});
	}

	// Function to stick the secondry nav to the top as user scrolls  for all other pages 
	if($("#primary_navigation_inner6").length){
		var stickyRibbonTop = $('#primary_navigation_inner6').offset().top;
		//$('#primary_navigation_container').show();
		$(window).scroll(function(){
			if( $(window).scrollTop() > stickyRibbonTop ) {
				$('#primary_navigation_inner6').addClass('primaryNavfixTop').removeClass('primaryNavigation_fixed_inner');
			} else {
				$('#primary_navigation_inner6').removeClass('primaryNavfixTop').addClass('primaryNavigation_fixed_inner');
			}
		});
	}
	$('.modSrcBtn6').on('click', function (e) {

		$(".contentPanel1").slideToggle("slow");
		$(this).toggleClass("active");
		if ($(this).hasClass('active')) {
			$(this).find('img').attr('src', ezgImagesPath + '/common/down-arrow-wht.png');		   
		}else{
			$(this).find('img').attr('src', ezgImagesPath + '/common/right-arrow-wht.png');
		}
	});	


	if( $(".contentPanel1").length ){	
		$(window).resize( function(){
			if( $(window).width() > 800){
				$(".contentPanel1").hide();
				$(".modSrcBtn6").removeClass('active');
				$(".modSrcBtn6 > img").attr("src","images/common/right-arrow-wht.png")
			}
		});	
	}

	function addCarFlight1(option){
		if(option == "car"){
			if($("#carSearchPanel3").is(":visible")){
				$("#carSearchPanel3").hide();

				if( (!$("#addFlight3").is(":checked")) && ($("#flightOptions4SearchPanel").is(":hidden"))   && ( $("#noOfRooms").val() < 2) )
					{
						showHidePanel = 0;
					}



					if( (!$("#addFlight3").is(":checked")) && ($("#flightOptions4SearchPanel").is(":hidden"))  && ( child_Count >= 3 )   )
						{
							showHidePanel = 1;
						}


			}
			else{
				$("#carSearchPanel3").show();
				showHidePanel = 1;
			}
		}

		if(option == "flight"){
			if($("#flightSearchPanel4").is(":visible")){
				$("#flightSearchPanel4").hide();
				if( (!$("#addCar4").is(":checked")) && ($("#flightOptions4SearchPanel").is(":hidden")) && ( $("#noOfRooms").val() < 2))
					{
						showHidePanel = 0;
					}
					if( (!$("#addCar4").is(":checked")) && ($("#flightOptions4SearchPanel").is(":hidden")) && ( child_Count >= 3 ) )
						{
							showHidePanel = 1;
						}
						if( (child_Count < 3) && ( !$("#addCar4").is(":checked") )    && ( !$("#addFlight3").is(":checked") )  && ( !$("#moreFlightOpton4").hasClass("active") ) && (rooms < 2)    ){
							showHidePanel = 0
						}

			}
			else{
				$("#flightSearchPanel4").show();
				showHidePanel = 1;
			}
		}

	}

	function Show_Btn(Btn_id) {
		if (false == $(Btn_id).is(':visible')) {
			$(Btn_id).show(0);
		}
		else {
			$(Btn_id).hide(0);
		}
	}

	$(document).ready(function () {
		$('#addview1').on('click', function (e) {
			$("#addview1details").slideToggle("slow");
			$(this).toggleClass("active");
			if ($(this).hasClass('active')) {
				$(this).text('+ More (Frequent flyer, meal preference, seat preference, special request');	   
			}else{
				$(this).text('- More (Frequent flyer, meal preference, seat preference, special request');
			}
		});	
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

	function searchFlight2(obj){

		switch(obj)
		{
			case "oneway2":
				document.getElementById('returnFlightContainer2').style.visibility = 'hidden';
				document.getElementById('checkinreturn2').style.visibility = 'visible';
				document.getElementById('checkoutreturn2').style.visibility = 'visible';
				document.getElementById('2nights2').style.display="block";
				document.getElementById('hotelStay2').style.display="none";

				break;
			case "return2":
				document.getElementById('returnFlightContainer2').style.visibility = 'visible';
				document.getElementById('checkinreturn2').style.visibility = 'hidden';
				document.getElementById('checkoutreturn2').style.visibility = 'hidden';
				document.getElementById('2nights2').style.display="none";
				document.getElementById('hotelStay2').style.display="block";
				break;
			default :	
				document.getElementById('returnFlightContainer2').style.display = 'block';
		}
	}


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

	$.widget( "custom.catcomplete", $.ui.autocomplete, {
		_create: function() {
			this._super();
			this.widget().menu( "option", "items", "> :not(.ui-autocomplete-category)" );
		},
		_renderMenu: function( ul, items ) {

			ul.addClass('w495');
			var that = this,
				currentCategory = "";
				$.each( items, function( index, item ) {

					var li;
					if ( item.category != currentCategory ) {
						ul.append( "<li class='ui-autocomplete-category bkgLitGry pD5 mL10 mT10 fW600' style='width:475px;'>" + item.category + "</li>" );
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
			$('#cars_detailCntr').slideToggle("slow");

		});	
		$( "#search" ).catcomplete({
			delay: 0,
			source: data,
			width: 350

		});
	});

	$('.btn-toggle').click(function() {
		$(this).find('.btn').toggleClass('active');  

		if ($(this).find('.btn-primary').size()>0) {
			$(this).find('.btn').toggleClass('btn-primary');
		}
		if ($(this).find('.btn-danger').size()>0) {
			$(this).find('.btn').toggleClass('btn-danger');
		}
		if ($(this).find('.btn-success').size()>0) {
			$(this).find('.btn').toggleClass('btn-success');
		}
		if ($(this).find('.btn-info').size()>0) {
			$(this).find('.btn').toggleClass('btn-info');
		}

		$(this).find('.btn').toggleClass('btn-default');

	});

	//$('form').submit(function(){
	//	alert($(this["options"]).val());
	//    return false;
	//});

	function changeSelected()
	{
		$('.option1').addClass('sel');
		$('.option2').removeClass('sel');
		document.getElementById('selectOption').style.display = 'none';
		document.getElementById('selectOption1').style.display = 'block';
		$('select[name="room-number1"]').prop('disabled',false);
		$('select[name="room-number"]').prop('disabled',true);
	}

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

	$("#mydates").click(function () {
		if (!$(this).is(':checked')) {
			$('#echeckinDate10').datepicker(this.checked ? "disable" : "enable");
			$('#endDate10').datepicker(this.checked ? "disable" : "enable");
		}
		else {
			$('#echeckinDate10').datepicker(this.checked ? "disable" : "disable");
			$('#endDate10').datepicker(this.checked ? "disable" : "disable");
		}
	});

	$(function(){

		$(".t").bind("click",function(){
			$(".t").each(function(){
				$(this).removeClass("sel");
			});
			$(this).addClass("sel");
			$(".tabContent").each(function(){
				$(this).hide();
			});
			var id = $(this).attr("id");
			$("#primary_navigation_container"+id).show();


		});


	});

	function searchFlightNew(obj){

		switch(obj)
		{
			case "oneway5":
				document.getElementById('returnFlightContainer5').style.visibility = 'hidden';
				document.getElementById("checkhotel").style.display= "none";
				document.getElementById("checkinreturn5").style.display= "block";
				document.getElementById("checkoutreturn5").style.display = "block";
				document.getElementById('multiwayAdd5').style.display = 'none';
				document.getElementById('multiwayhideNew').style.display = 'block';
				document.getElementById('multiwayhideNew1').style.display = 'block';
				document.getElementById("multiwaySearchDefaultNew").style.display = "none";
				document.getElementById("multiwaySearchDefault1").style.display = "none";
				document.getElementById("checkhotel1").style.display= "none";
				document.getElementById('hotelStay').style.visibility= 'hidden';
				document.getElementById('2nights').style.display = 'block';
				document.getElementById('flightSearchPanel').style.visibility= 'hidden';			
				//document.getElementById("multiwaySearchPanel_2").style.display = "none";	
				//document.getElementById("carType").style.display = "none";
				//document.getElementById("noOfCars").style.display = "none";
				//document.getElementById("pickUpDateHolder").style.display = "none";
				//document.getElementById("dropOffDateHolder").style.display = "none";
				$("#multiwaySearchParameters1, #multiwaySearchParameters2, #multiwaySearchParameters3").hide();
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
			case "return5":
				document.getElementById('returnFlightContainer5').style.visibility = 'visible';
				document.getElementById('multiwayAdd5').style.display = 'none';
				document.getElementById("checkinreturn5").style.display= "none";
				document.getElementById("checkoutreturn5").style.display = "none";
				document.getElementById('multiwayhideNew').style.display = 'block';
				document.getElementById('multiwayhideNew1').style.display = 'block';
				document.getElementById("multiwaySearchDefaultNew").style.display = "none";
				document.getElementById("multiwaySearchDefault1").style.display = "none";
				document.getElementById("checkhotel").style.display= "none";
				document.getElementById("checkhotel1").style.display= "none";
				document.getElementById('hotelStay').style.visibility = 'visible';
				document.getElementById('2nights').style.display = 'none';
				document.getElementById('flightSearchPanel').style.visibility= 'hidden';
				//document.getElementById("multiwaySearchPanel_2").style.display = "none";	
				$("#multiwaySearchParameters1, #multiwaySearchParameters2, #multiwaySearchParameters3").hide();
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
			case "multicity5":
				document.getElementById('returnFlightContainer5').style.visibility = 'hidden';
				document.getElementById('multiwayAdd5').style.display = 'block';
				document.getElementById('multiwayhideNew').style.display = 'none';
				document.getElementById("checkinreturn5").style.display= "none";
				document.getElementById("checkoutreturn5").style.display = "none";
				document.getElementById('multiwayhideNew1').style.display = 'none';
				document.getElementById("checkhotel").style.display= "block";
				document.getElementById("checkhotel1").style.display= "block";
				document.getElementById("multiwaySearchDefaultNew").style.display = "block";
				document.getElementById("multiwaySearchDefault1").style.display = "block";
				document.getElementById("hotelStay").style.visibility= 'hidden';
				document.getElementById('2nights').style.display = 'none';
				document.getElementById('flightSearchPanel').style.visibility= 'hidden';
				//document.getElementById("multiwaySearchPanel_2").style.display = "block";	
				document.getElementById("carSearchPanel").style.display = "block";	
				document.getElementById("addFlight1").checked = false;
				$("#flightOptionsSearchPanel").hide();
				$("#moreFlightOpton1").removeClass("active");
				$("#plusMinus1").text("+")
				showHidePanel = 0;
				$("#globalSrcToggle5").show();
				$(".globalSrcShow5").text("Hide");
				$(".globalSrcShow5").addClass("sel");


				break;
			default :	
				document.getElementById('returnFlightContainer5').style.display = 'block';
		}
	}

	var mc = 1;
	function showMultiwayOptionsNew(){

		if(mc < 4){
			$('#multiwaySearchParametersNew' + mc).show();
			mc++;
			showHidePanel = 1;
		}
	}


	function hideMultiwayOptionsNew(i){
		$("#multiwaySearchParametersNew" + i).hide();	
		if( $("#multiwaySearchParametersNew1").is(":hidden") &&  $("#multiwaySearchParametersNew2").is(":hidden") &&  $("#multiwaySearchParametersNew3").is(":hidden")  ){
			showHidePanel = 0;
		}
		if(i != 5)
			mc = i++;

	}



	var mc = 1;
	function showMultiwayOptionsForex(){

		if(mc < 4){
			$('#multiwaySearchParametersForex' + mc).show();
			mc++;
			showHidePanel = 1;
		}
	}

	function searchFlight20(obj){

		switch(obj)
		{
			case "oneway20":
				document.getElementById('returnFlightContainer20').style.visibility = 'hidden';
				document.getElementById('hotelStay2').style.visibility= 'hidden';
				document.getElementById('2nights2').style.display = 'block';
				document.getElementById('flightSearchPanel4').style.display = 'none';
				document.getElementById("checkinreturn2").style.display = 'block';
				document.getElementById("checkoutreturn2").style.display = 'block';



				break;
			case "return20":
				document.getElementById('returnFlightContainer20').style.visibility = 'visible';
				document.getElementById('hotelStay2').style.visibility = 'visible';
				document.getElementById('2nights2').style.display = 'none';
				document.getElementById('flightSearchPanel4').style.display = 'none';
				document.getElementById("checkinreturn2").style.display = 'none';
				document.getElementById("checkoutreturn2").style.display = 'none';


				break;
			case "ticket_port":
				document.getElementById('returnFlightContainer20').style.visibility = 'hidden';

				break;
			default :	
				document.getElementById('returnFlightContainer20').style.display = 'block';
		}
	}
	function hideMultiwayOptionsForex(i){
		$("#multiwaySearchParametersForex" + i).hide();	
		if( $("#multiwaySearchParametersForex1").is(":hidden") &&  $("#multiwaySearchParametersForex2").is(":hidden") &&  $("#multiwaySearchParametersForex3").is(":hidden")  ){
			showHidePanel = 0;
		}
		if(i != 5)
			mc = i++;

	}
	function selForex(){
		document.getElementById("changetext").innerHTML = "Sell Forex";
	}
	function buyForex(){
		document.getElementById("changetext").innerHTML = "Buy Forex";
	}


	function showMoreInfoHolidays(id1, id2, id3) {
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

	function showMoreInfoActivity(id1, id2, id3) {
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
	function showMoreInfoRail(id1, id2, id3) {
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
	function showMoreInfoCruise(id1, id2, id3) {
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
	if($().multipleSelect){

		$("#multipleAirlines1").multipleSelect({
			placeholder: "Select",
			selectAllText : "All",
			selectAllDelimiter: ["",""]

		});

	}
	function addCar20(option){
		if(option == "flight"){
			if($("#flightSearchPanel20").is(":visible")){
				$("#flightSearchPanel20").hide();
				if( (!$("#addFlight20").is(":checked")) && ($("#flightOptionsSearchPanel20").is(":hidden")) && ( $("#noOfRooms12").val() < 2))
					{
						showHidePanel = 0;
					}
					if( (!$("#addFlight20").is(":checked")) && ($("#flightOptionsSearchPanel20").is(":hidden")) && ( child_Count >= 3 ) )
						{
							showHidePanel = 1;
						}
						if( (child_Count < 3) && ( !$("#addFlight20").is(":checked") )    && ( !$("#addFlight20").is(":checked") )  && ( !$("#moreFlightOpton20").hasClass("active") )     ){
							showHidePanel = 0
						}

			}
			else{
				$("#flightSearchPanel20").show();
				showHidePanel = 1;
			}
		}
	}	
	function showToggler1(){
		if( showHidePanel == 1)
			$(".globalSrcExpContr10").show();
		else
			$(".globalSrcExpContr10").hide(); 

	}

	//Add multiway flights
	var mcv = 3;
	function showMultiwayOptions10(){
		if(mcv < 6){
			$('#multiwaySearchParameters' + mcv).show();
			mcv++;
			showHidePanel = 1;
		}
	}

	function hideMultiwayOptions10(i){
		$("#multiwaySearchParameters" + i).hide();	
		if( $("#multiwaySearchParameters20").is(":hidden") &&  $("#multiwaySearchParameters21").is(":hidden") &&  $("#multiwaySearchParameters22").is(":hidden")  ){
			showHidePanel = 0;
		}
		if(i != 5)
			mcv = i++;

	}
	var  showHidePanel;
	function showMoreInfo20(id1, id2, id3)
	{
		$("#" + id1).toggleClass("active");
		$("#" + id2).slideToggle();

		if ($("#" + id1).hasClass('active')) {
			showHidePanel = 1;
			$("#" + id3).html(" - ");		   
		}else{
			$("#" + id3).html(" + ");

			if($("#multicity10").is(":checked")){
				if( $("#multiwaySearchParameters20").is(":hidden") &&  $("#multiwaySearchParameters21").is(":hidden") &&  $("#multiwaySearchParameters22").is(":hidden")  ){
					showHidePanel = 0;
				}
			}
			else{
				if( !$("#addFlight20").is(":checked") &&  !$("#addCar20").is(":checked")){showHidePanel = 0;}
			}

		}
	}


	function showtextarea()
	{
		if ($('#text').is(':checked'))
			{
				document.getElementById('textarea').style.display = 'block';
			}
			else
				{
					document.getElementById('textarea').style.display = 'none';
				}
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
				$(wrapper1).prepend('<li class="ritSection clearfix w245"  id="delNote'+x1+'"><span class="col_9 pL0">'+$('#noteContent').val()+'<br>2 Aug 2014</span> <span class="closeBtn_popup_small fR" onclick="deleteNote('+x1+')"></span> </li>'); //add input box
			}
			$('#noteContent').val(' ');
			$('#charCount').html('0');

		});
	});
	function deleteNote(id)
	{
		document.getElementById('delNote'+id).remove();
	}

})
