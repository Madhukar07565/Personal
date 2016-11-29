ACC.cartreview = {

	_autoload : [ "bindForms" ],

	bindForms : function() {

		var cartReviewForm = $('#cartReviewForm');
		cartReviewForm.ajaxForm({
			success : ACC.cartreview.displayPayment,
			failed : ACC.cartreview.displayError
		});

		$(document).on("click", "#cartReviewLink", function(e) {
			e.preventDefault();
//			cartReviewForm.submit();
			ACC.cartreview.displayPayment();
		});
	},

	displayError : function() {
		log.error('error happed in review section.');
	},
	displayPayment : function(result, statusText, xhr, formElement) {
//		$("#step5").empty();
//		$("#step5").append(result);
//		$('.shopCardHrdr').on('click', function (e) {
//			 $(this).next('.shopCardContr').slideToggle();
//			$(this).toggleClass('sel');
//			 if ($(this).hasClass('sel')) {
//				$(this).find('img').attr('src', ezgImagesPath + '/common/expand.png');		   
//			}else{
//				$(this).find('img').attr('src', ezgImagesPath + '/common/collapse.png');
//			}
//		});
//		ACC.cartreview.step4('header4', 'header5', 'step4', 'step5');
		window.location.href = ACC.config.contextPath + "/checkout/multi/payment";
	},
	

	step4 : function(curHrdr, nextHrdr, curContr, nextContr){
		$("#"+curHrdr).removeClass('active noImg');
		$("#"+nextHrdr).addClass('active').removeClass('noImg');
		$("#"+curContr).slideUp('slow');
		$("#"+nextContr).slideDown('slow');
		document.getElementById(curHrdr).onclick = ACC.cartreview.fn_step4;
		$('html, body').animate({scrollTop: '0px'},500);
	},

	fn_step4 : function(){
		$("#header4").addClass('active');
		$("#header1,#header2,#header3,#header5").removeClass('active');
		$("#step4").slideDown('slow');
		$("#step2,#step1,#step3,#step5").slideUp('slow');
		$("#header4").siblings("div.heading").removeClass("active noImg");
		$("#header4").next(".accordion .contContainer").slideDown("slow").siblings(".accordion_stepForm .contContainer:visible").slideUp("slow");
		$('html, body').animate({scrollTop: '0px'},500);	
	}

};
