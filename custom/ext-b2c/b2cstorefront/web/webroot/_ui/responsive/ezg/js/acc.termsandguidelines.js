ACC.termsandguidelines = {

	_autoload : [ "bindForms" ],

	bindForms : function() {

		var termsAndGuidelinesForm = $('#termsAndGuidelinesForm');
		termsAndGuidelinesForm.ajaxForm({
			success : ACC.termsandguidelines.displayCartReview,
			failed : ACC.termsandguidelines.displayError
		});

		$(document).on("click", "#termsAndGuidelinesLink", function(e) {
			e.preventDefault();
			termsAndGuidelinesForm.submit();
		})
	},

	displayError : function() {
		log.error('error happed in terms and guidelines section.');
	},
	displayCartReview : function(result, statusText, xhr, formElement) {
//		$("#step4").empty();
//		$("#step4").append(result);
//		$('.shopCardHrdr').on('click', function (e) {
//			 $(this).next('.shopCardContr').slideToggle();
//			$(this).toggleClass('sel');
//			 if ($(this).hasClass('sel')) {
//				$(this).find('img').attr('src', ezgImagesPath + '/common/expand.png');		   
//			}else{
//				$(this).find('img').attr('src', ezgImagesPath + '/common/collapse.png');
//			}
//		});
//		ACC.cartreview.bindForms();
////		$(document).on("click", "#cartReviewLink", function(e) {
////			e.preventDefault();
////			var cartReviewForm = $('#cartReviewForm');
////			cartReviewForm.submit();
////		});
//		ACC.termsandguidelines.step3('header3', 'header4', 'step3', 'step4');
		window.location.href = ACC.config.contextPath + "/checkout/multi/review";
	},
	

	step3: function(curHrdr, nextHrdr, curContr, nextContr){
		$("#"+curHrdr).removeClass('active noImg');
		$("#"+nextHrdr).addClass('active').removeClass('noImg');
		$("#"+curContr).slideUp('slow');
		$("#"+nextContr).slideDown('slow');
		document.getElementById(curHrdr).onclick = ACC.termsandguidelines.fn_step3;
		$('html, body').animate({scrollTop: '0px'},500);
	},

	fn_step3: function(){
		$("#header3").addClass('active');
		$("#header1,#header2,#header4,#header5").removeClass('active');
		$("#step3").slideDown('slow');
		$("#step2,#step1,#step4,#step5").slideUp('slow');
		$("#header3").siblings("div.heading").removeClass("active noImg");
		$("#header3").next(".accordion .contContainer").slideDown("slow").siblings(".accordion_stepForm .contContainer:visible").slideUp("slow");
		$('html, body').animate({scrollTop: '0px'},500);	
	}

};
