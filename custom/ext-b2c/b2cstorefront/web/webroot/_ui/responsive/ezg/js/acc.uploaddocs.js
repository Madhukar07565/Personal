ACC.uploaddocs = {

	_autoload : [ "bindForms" ],

	bindForms : function() {

		var uploadDocsForm = $('#uploadDocsForm');
		uploadDocsForm.ajaxForm({
			success : ACC.uploaddocs.displayTermsAndGuidelines,
			failed : ACC.uploaddocs.displayError
		});
		
		$(document).on("click", "#uploadDocsLink", function(e) {
			e.preventDefault();
			window.location.href = ACC.config.contextPath + "/checkout/multi/terms";
		})
		
		
		$(document).on("click", "#btn-upload", function(e) {
			e.preventDefault();
			$("#btn-upload").parent().parent().find('input[type=FILE]').click();
		})
		
		$(document).on("click", "#btn-upload1", function(e) {
			e.preventDefault();
			$("#btn-upload1").parent().parent().find('input[type=FILE]').click();
		})

		$(document).on("click", "a[id^='uploadBtn']", function(e) {
			var btnSml = $(e.target).parent().siblings('.primaryBtn_sml');
			var fileType = $(btnSml).find('input[type="hidden"]').val();
			var uploadFileId  = $(e.target).parent().parent().find("input[type='file']").attr('id')
			$.ajaxFileUpload({
				url : ACC.config.contextPath+"/checkout/multi/upload-docs/upload",
				fileElementId : uploadFileId,
				data: {"CSRFToken":ACC.config.CSRFToken,"fileType":fileType},
				dataType: "json",
				success : function(data, status) {
					alert("File uploade successfully.");
				},
				error : function(data, status) {
					alert("Cannot upload this file.");
				}	
			});
		})

	},

	displayError : function() {
		log.error('error happed in upload documents section.');
	},
	displayTermsAndGuidelines : function(result, statusText, xhr, formElement) {
		ACC.uploaddocs.step2('header2', 'header3', 'step2', 'step3');
	},
	

	step2: function(curHrdr, nextHrdr, curContr, nextContr){
		$("#"+curHrdr).removeClass('active noImg');
		$("#"+nextHrdr).addClass('active').removeClass('noImg');
		$("#"+curContr).slideUp('slow');
		$("#"+nextContr).slideDown('slow');
		document.getElementById(curHrdr).onclick = ACC.uploaddocs.fn_step2;
		$('html, body').animate({scrollTop: '0px'},500);
	},

	fn_step2: function(){
		$("#header2").addClass('active');
		$("#header1,#header3,#header4,#header5").removeClass('active');
		$("#step2").slideDown('slow');
		$("#step1,#step3,#step4,#step5").slideUp('slow');
		$("#header2").siblings("div.heading").removeClass("active");
		$("#header2").next(".accordion_stepForm .contContainer").slideDown("slow").siblings(".accordion_stepForm .contContainer:visible").slideUp("slow");
		$('html, body').animate({scrollTop: '0px'},500);
	},

};
