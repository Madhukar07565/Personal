var country2Languages;
var allPreferredLanguages;
var country2Currencies;
var allPreferredCurrencies;
var customerData;

(function(){
	
	$(function(){
			
		$("#loginForm").on("click", ".pSwitcher", function(e){
			
			var $target = $(e.target);
			
			if(!$target.hasClass("showPassword") ){
				var $input = $target.siblings("[type='password']");
				$input.attr("type", "text");
				$target.addClass("showPassword");
			}else{
				var $input = $target.siblings("[type='text']");
				$input.attr("type", "password");
				$target.removeClass("showPassword");
			}
			
		});
		
		$("#signupForm, #popupSignupForm, #changePwdForm, #resetPasswordForm").on("click",".mark-switchP",function(e){
			var $target = $(e.target);
			var $delegate = $(e.delegateTarget);
			if($target.is(":checked")){
				$("[type='password']",$delegate ).attr("type","text");
			}else{
				$(".mark-should-password",$delegate ).attr("type","password");
			}
		});
		
		
//		$("#changePwdForm").on("click","#tSPassword",function(e){
//			var $target = $(e.target);
//			var $delegate = $(e.delegateTarget);
//			if($target.is(":checked")){
//				$("[type='password']",$delegate ).attr("type","text");
//			}else{
//				$(".mark-should-password",$delegate ).attr("type","password");
//			}
//			
//		});
		
		


		
	});
	
})();

ACC.account = {

	signUp: function (formId, contextPath){
		ACC.account.hideErrorMsg(formId);
		$.ajax({
            cache: false,
            type: "POST",
            url:contextPath+'/register/signup',
            data:$('#'+formId).find('input[name!="tShowP"][name!="_showP"]').serialize(),
            async: false,
            error: function(request) {
            	$('#'+formId+' #div_creationFailed').show();
            },
            success: function(data) {
            	
            	ACC.account.showMsg(data["email"], '#'+formId + ' #' + 'div_emailError');
            	ACC.account.showMsg(data["emailExisted"], '#'+formId + ' #' + 'div_emailExistedError');
            	ACC.account.showMsg(data["pwd"], '#'+formId + ' #' + 'div_pwdError');
            	ACC.account.showMsg(data["checkPwd"], '#'+formId + ' #' + 'div_checkPwdError');
            	ACC.account.showMsg(data["tAndC"], '#'+formId + ' #' + 'div_tAndCError');
            	
            	if(typeof(data["success"]) !="undefined"){
            		var html;
            		if(data["autoActivation"]=="1"){
            			html="<p class=\"mB10\">You have successfully created your account.</p>";	
            			//redirect page
            			$('#closeBtn').click(
                    			function(){
                    				popupclose('signupSuccess', 'black_overlay');
                    				window.location.href=contextPath+'/my-account/dashboard_edit';
                    			}
                    		);
            		}else{
            			html="<p class=\"mB10\">You have successfully created your account.<br />"+
            			"Please click on the verification link sent to <span class=\"fW400\" id=\"emailLink\" style=\"color:	#000000\"></span></p><br />"+
            			"<p  class=\"mB10\">Did not receive verification link?<br /><a href=\"javascript:ACC.account.reSendEmail('"+contextPath+"')\">Resend verification link</a></p>";
            			//redirect page
            			$('#closeBtn').click(
                    			function(){
                    				popupclose('signupSuccess', 'black_overlay');
                    				window.location.href=contextPath+'/my-account/settings';
                    			}
                    		);
            		}
            		$("#sendActivationEmail").append(html);
            		
            		$('#emailLink').text(data["sendVerLink"]);
            		if(formId==='popupSignupForm'){
            			popupclose('signupContainer', 'black_overlay')
            		}
                	popupwin('signupSuccess', 'black_overlay');
                	
            	}         	
            }
        });
	},

	showMsg: function (errorKey, div_id){
		if(typeof(errorKey) != "undefined"){		
			if (false == $(div_id).is(':visible')){
	            $(div_id).show();
	        }
	        else {
	            $(div_id).hide();
	        }
		}
	},

	hideErrorMsg: function (formId){
		$('#'+formId+' #div_emailError').hide(250);
		$('#'+formId+' #div_emailExistedError').hide(250);
		$('#'+formId+' #div_pwdError').hide(250);
		$('#'+formId+' #div_checkPwdError').hide(250);
		$('#'+formId+' #div_tAndCError').hide(250);
		$('#'+formId+' #div_creationFailed').hide(250);
	},
	
    clearInputValue: function (formId){
    	
    	var $parent = $("#" +formId);
		ACC.account.hideErrorMsg(formId);
		$('input[type!="checkbox"][type!="submit"]',$parent).val("");
		$('input:checkbox',$parent).attr('checked',false);
	},
	
	clearClose:function(formId, coverId){
		var $parent = $("#" +formId);
		this.clearInputValue(formId);
		$(".mark-should-password",$parent ).attr("type","password");
		
		var $password = $(".showPassword", $parent);
		if($password.length > 0){
			$password.removeClass("showPassword");
			$password.prev().attr("type","password");
		}

		popupclose(formId, coverId);
	},
	
	reSendEmail: function (contextPath){
		$.ajax({
	        cache: false,
	        type: "POST",
	        url:contextPath+'/register/reSendEmail',
	        data:{email:$('#emailLink').text()},
	        async: false,
	        error: function(request) {
	            alert("error");
	        }
	       
	    });
	},
	
	changeUserName: function (contextPath){
		$('#changeUserNameForm #div_emailError').hide(250);
		$('#div_checkEmailError').hide(250);
		$('#div_changeUserNameSuccess').hide(250);
		$('#changeUserNameForm #div_oldPwdError').hide(250);
		
		setStartingDate();
		$.ajax({
	        cache: false,
	        type: "POST",
	        url:contextPath+'/my-account/changeUserName',
	        data:$('#changeUserNameForm').serialize(),
	        async: false,
	        success: function(data) {
	        	ACC.account.showMsg(data["newUserName"], '#changeUserNameForm #div_emailError');
	        	ACC.account.showMsg(data["checkNewUserName"], '#div_checkEmailError');
	        	ACC.account.showMsg(data["oldPwdMismatch"], '#changeUserNameForm #div_oldPwdError');
	        	if(typeof(data["success"]) !="undefined"){
	        		ACC.account.showMsg(data["success"], '#div_changeUserNameSuccess');
	        		$('#userName').text(data["changedUserName"]);
	        	}
            }
	    });
	},
	
	
	changePwd: function (contextPath){
		$('#changePwdForm #div_pwdError').hide(250);
		$('#changePwdForm #div_checkPwdError').hide(250);
		$('#changePwdForm #div_oldPwdError').hide(250);
		$('#changePwdForm #div_changePwdSuccess').hide(250);
		setStartingDate();
		$.ajax({
	        cache: false,
	        type: "POST",
	        url:contextPath+'/my-account/changePwd',
	        data:$('#changePwdForm').find("input[name!='tSPassword']").serialize(),
	        async: false,
	        success: function(data) {
	        	ACC.account.showMsg(data["newPwd"], '#changePwdForm #div_pwdError');
	        	ACC.account.showMsg(data["checkNewPwd"], '#changePwdForm #div_checkPwdError');
	        	ACC.account.showMsg(data["oldPwd"], '#changePwdForm #div_oldPwdError');
	        	if(typeof(data["success"]) !="undefined"){
	        		ACC.account.showMsg(data["success"], '#div_changePwdSuccess');
	        	}
            }
	    });
	},
	
	addToFavorites: function (homeLink){
		if($('#addfav').prop('checked')){
			var ctrl = (navigator.userAgent.toLowerCase()).indexOf('mac') != -1 ? 'Command/Cmd' : 'CTRL'; 
		     if (document.all)
		     {  
		      window.external.addFavorite(homeLink, document.title); 
		     }
		     //else if (window.sidebar)
		     //{  
		      //window.sidebar.addPanel(document.title, homeLink,''); 
		    // }
		     else
		     {
		    	 $('#div_addFavorite').text('Add failed.\nPlease try to use ' + ctrl +' + D to add to favorite.');
		    	 if (false == $('#div_addFavorite').is(':visible')){
		            $('#div_addFavorite').show();
		         }
		     }
		}	 
	},
	
	saveSettings: function (contextPath){
		
		var form = {
				language:{ isocode:$("#preferredLanguage").val()}
			   ,currency:{isocode:$("#preferredCurrency").val()}
			   ,defaultWebSite:{isocode: $("#defaultWebsite").val()}
			   ,subscribe:$("#subscribe").is(":checked")
			};
		
		this.traveller.save(form);
//		$.ajax({
//	        type: "POST",
//	        url:contextPath+'/my-account/saveSettings',
//	        data:$('#settingsForm').serialize(),
//	        async: false,
//	        ////success: function(data) {
//	        	
//            //}
//	    });
	},
	
	updateProfile: function (contextPath){
		$('#dashboardEditForm #div_firstNameError').hide();
		$('#dashboardEditForm #div_middleNameError').hide();
		$('#dashboardEditForm #div_lastNameError').hide();
		$('#dashboardEditForm #div_mobileNumberError1').hide();
		$('#dashboardEditForm #div_areaCodeError1').hide();
		$('#dashboardEditForm #div_mobileNumberError2').hide();
		$('#dashboardEditForm #div_areaCodeError2').hide();
		$('#dashboardEditForm #div_mobileNumberError3').hide();
		$('#dashboardEditForm #div_areaCodeError3').hide();
		$('#dashboardEditForm #div_mobileNumberError4').hide();
		$('#dashboardEditForm #div_areaCodeError4').hide();
		$.ajax({
	        cache: true,
	        type: "POST",
	        url:contextPath+'/my-account/dashboard/updateProfile',
	        data:$('#dashboardEditForm').serialize(),
	        async: false,
	        success: function(data) {
	        	if(typeof(data["success"]) != "undefined") {
	        		window.location.href=contextPath+'/my-account/dashboard';
	        	}else{
		        	if(typeof(data["firstName"]) !="undefined"){
		        		$('#dashboardEditForm #div_firstNameError').show();
		        	}
		        	if(typeof(data["middleName"]) !="undefined"){
		        		$('#dashboardEditForm #div_middleNameError').show();
		        	}
		        	if(typeof(data["lastName"]) !="undefined"){
		        		$('#dashboardEditForm #div_lastNameError').show();
		        	}
		        	if(typeof(data["areaCode1"]) !="undefined"){
		        		$('#dashboardEditForm #div_areaCodeError1').show();
		        	}
		        	if(typeof(data["mobileNumber1"]) !="undefined"){
		        		$('#dashboardEditForm #div_mobileNumberError1').show();
		        	}
		        	if(typeof(data["areaCode2"]) !="undefined"){
		        		$('#dashboardEditForm #div_areaCodeError2').show();
		        	}
		        	if(typeof(data["mobileNumber2"]) !="undefined"){
		        		$('#dashboardEditForm #div_mobileNumberError2').show();
		        	}
		        	if(typeof(data["areaCode3"]) !="undefined"){
		        		$('#dashboardEditForm #div_areaCodeError3').show();
		        	}
		        	if(typeof(data["mobileNumber3"]) !="undefined"){
		        		$('#dashboardEditForm #div_mobileNumberError3').show();
		        	}
		        	if(typeof(data["areaCode4"]) !="undefined"){
		        		$('#dashboardEditForm #div_areaCodeError4').show();
		        	}
		        	if(typeof(data["mobileNumber4"]) !="undefined"){
		        		$('#dashboardEditForm #div_mobileNumberError4').show();
		        	}
		        	if(typeof(data["emailId"]) !="undefined"){
		        		$('#dashboardEditForm #div_emailIdError').show();
		        	}
	        	}
            }
	    });
	},

	bindSiteSettings: function(contextPath){
		
		$.ajax({
	        cache: false,
	        type: "POST",
	        url:contextPath+'/my-account/getPreferredLangauge',
	        async: false,
	        success: function(data) {
	        	country2Languages=data;
            }
	    });
		$.ajax({
	        cache: false,
	        type: "POST",
	        url:contextPath+'/my-account/getPreferredCurrency',
	        async: false,
	        success: function(data) {
	        	country2Currencies=data;
            }
	    });
		
		$('#defaultWebsite').change(function(){			
			ACC.account.addPreferredLanguages();			
			ACC.account.addPreferredCurrencies();
		});
		
		$('#countrycode').change(function(){	
			var selectedCountryCode=$('#countrycode option:selected').text();
			var countryCode=selectedCountryCode.slice(selectedCountryCode.indexOf('(')+1,selectedCountryCode.length-1);
			$('#countryCodeLbl').html(countryCode);
			$('#newCountryCodeLbl').html(countryCode);
			$('#countryCodeHid').val(countryCode);
		});
		
	},
	
	addPreferredLanguages: function(){
		$("#preferredLanguage").empty();
		$('#preferredLanguage').append("<option value=\"0\" >Select A Language</option>");
		var countryCode=$('#defaultWebsite').val();
		allPreferredLanguages=country2Languages[countryCode];
		for(var i=0; i<allPreferredLanguages.length; i++){
			$('#preferredLanguage').append("<option value=" + allPreferredLanguages[i].isocode + ">" + allPreferredLanguages[i].name + "</option>");
		}
	},
	
	addPreferredCurrencies: function(){
		$("#preferredCurrency").empty();
		$('#preferredCurrency').append("<option value=\"0\" >Select A Currency</option>");
		var countryCode=$('#defaultWebsite').val();
		allPreferredCurrencies=country2Currencies[countryCode];
		for(var i=0; i<allPreferredCurrencies.length; i++){
			$('#preferredCurrency').append("<option value=" + allPreferredCurrencies[i].isocode + ">" + allPreferredCurrencies[i].name + "</option>");
		}
	},
	
	subscribe: function(contextPath,methodName){
		$('#settingsForm #div_emailFormatError').hide(250);
		$('#settingsForm #div_emailExist').hide(250);
		$.ajax({
	        cache: false,
	        type: "POST",
	        url:contextPath+methodName,
	        data:$('#settingsForm').serialize(),
	        async: false,
	        success: function(data) {
	        	ACC.account.showMsg(data["subscribeEmail"], '#settingsForm #div_emailFormatError');
	        	ACC.account.showMsg(data["emailExist"], '#settingsForm #div_emailExist');
	        	if(typeof(data["success"]) !="undefined"){

	        		$('.emailcmtext').show();
					$('#addemail').show();
	        		var html="<p  class=\" firstemail clearfix\">"+
					 	"<span id=\"editmail3\"  class=\" mT5 fL\"><label> <span id=\"editmailVal3\">"+data["success"]+"</span></label></span>"+
						 "<a class=\"mL10 mT10 fL fS12_sm remove_field\" href=\"javascript:void(0);\" onclick=\"javascript:ACC.account.unSubscribe(this,'"+
						 contextPath+"',"+'\''+data["success"]+"'"+");\">UnSubscribe</a></p>";
					$("#addemail").append(html);
					$(".addMoreEmail").slideToggle("slow");
					$(".hidefirstsmail").hide();
					
	        	}
            }
	    });
	},
	
	unSubscribe: function (element,contextPath, unSubscribeEmail){
		$.ajax({
	        cache: false,
	        type: "POST",
	        url:contextPath+'/my-account/unSubscribe',
	        data:{email:unSubscribeEmail},
	        async: false,
	        success: function(data) {
	        	if(typeof(data["success"]) !="undefined"){
	        		 $(element).parent().remove();
	        	}
            }
	    });
	},
	
	activeMobile: function(contextPath,methodName){
		$('#settingsForm #div_mobileFormatError').hide(250);
		$('#settingsForm #div_mobileExist').hide(250);
		$.ajax({
	        cache: false,
	        type: "POST",
	        url:contextPath+methodName,
	        data:$('#settingsForm').serialize(),
	        async: false,
	        success: function(data) {
	        	ACC.account.showMsg(data["mobile"], '#settingsForm #div_mobileFormatError');
	        	ACC.account.showMsg(data["mobileExist"], '#settingsForm #div_mobileExist');
	        	if(typeof(data["success"]) !="undefined"){
	        		var html="<p class=\"clearfix \"><span id=\"editmail3\"  class=\" mT5 fL\"><label> <span>"+data["success"]+"</span></label></span>"+
	        		"<a class=\"mL5 mL0_sm mT5 fS12_sm fL remove_field\" href=\"javascript:void(0);\" onclick=\"javascript:ACC.account.deActivateMobile(this,'"+
						 contextPath+"',"+'\''+data["success"]+"'"+");\">Deactivate</a></p>";

	        		$("#addnumber").append(html);
	        		$(".addMorePhone").slideToggle("slow");
	        		$(".hidefirstsms").hide();
	        	}
            }
	    });
	},
	
	deActivateMobile: function (element,contextPath, deActiveMobile){
		
		$.ajax({
	        cache: false,
	        type: "POST",
	        url:contextPath+'/my-account/deActivateMobile',
	        data:{mobile:deActiveMobile},
	        async: false,
	        success: function(data) {
	        	if(typeof(data["success"]) !="undefined"){
	        		 $(element).parent().remove();
	        	}
            }
	    });
	},
	
	deActivateAccount: function (contextPath){
		$.ajax({
	        cache: false,
	        type: "POST",
	        url:contextPath + '/my-account/deActivateAccount',
	        async: false,
	        success: function(data) {
	        	popupclose('deactivate', 'fade');
	        	ACC.account.disablePages(contextPath,false);
            }
	    });
	},
	
	disablePages: function(formId,contextPath,active){
		if(active === false){
			$('input').prop("readOnly",true);
			$('select').prop("disabled",true);
			$('#'+formId+' a').prop("href","javascript:void(0)").css("color","#ccc").css("text-decoration","none");
			$('#'+formId+' a').prop("onclick","javascript:void(0)");
			$('#'+formId+' article').unbind();
			$('#'+formId+' span').prop("onclick","javascript:void(0)");
			$('#'+formId+' span').unbind();
			$("input[type='checkbox']").prop("disabled",true);

		}
	},
	
	clearChangeUserNameForm: function(){
		$('#changeUserNameForm')[0].reset();
		$('#changeUserNameForm #div_emailError').hide(250);
		$('#div_checkEmailError').hide(250);
		$('#changeUserNameForm #div_oldPwdError').hide(250);
		$('#div_changeUserNameSuccess').hide(250);
	},
	
	clearChangePwdForm: function(){
		$('#changePwdForm')[0].reset();
		$('#changePwdForm #div_pwdError').hide(250);
		$('#changePwdForm #div_checkPwdError').hide(250);
		$('#changePwdForm #div_oldPwdError').hide(250);
		$('#changePwdForm #div_changePwdSuccess').hide(250);
	},
	
	callback:undefined,
	
	login: function(contextPath){
		$('#div_badCredential').hide(250);
		$('#div_userLocked').hide(250);
		$.ajax({
	        cache: false,
	        type: "POST",
	        url: contextPath +  '/j_spring_security_check',
	        data:$('#loginForm').serialize(),
	        async: false,
	        error: function(data) {
	        	alert('error');
	        },
	        success: function(data) {
	        	if(data["success"] =="1"){
	        		popupclose('loginCont', 'black_overlay'); 
	        		
	        		$('#unAuthorize').hide();
	    	        $('#authorize').show();
	        		
	        		//here is for login between book
	        		if(typeof(ACC.account.callback) !="undefined"){
	        			$('#loginUserName').html(data["userName"]);
	        			ACC.account.callback();
	        			
	        			return;
	        		}

	        		var currentUrl=window.location.href;
	        		if (typeof String.prototype.endsWith != 'function') {
        		       String.prototype.endsWith = function (str){
        		          return this.slice(-str.length) == str;
        		       };
        		     }
	        		
	        		if(currentUrl.endsWith(contextPath+'/')){
	        			if(data["firstLogin"]=="1"){
		        			window.location.href=contextPath+'/my-account/dashboard_edit';
		        		}else if(data["redirect2Settings"]=="1"){
		        			window.location.href=contextPath+'/my-account/settings';
		        		}else{
		        			window.location.href=contextPath+'/';
		        		}
	        		}else{
	        			location.reload();
	        		}
	        	}
	        	else{
	        		if(data["badCredential"]=="1"){
	        			$('#div_badCredential').show(250);
	        		}
	        		if(data["userLocked"]=="1"){
	        			$('#div_userLocked').show(250);
	        		}
        			$('#div_userLocked').html(data["userName"]+' have exhausted all the attempts to login to CNK Account.');
	        	}
            }
	    });
	},
	
	loginBetweenBook: function(callback){
		$.ajax({
			url : ACC.config.contextPath + "/login/checklogin",
			type : 'GET',
			success : function(data) {
				if("success" == data){
					callback();
				}else{
					ACC.account.popupLogin(callback);
				}
			},
			error : function() {
				console.log('error happened during login.');
			}
		});
	},
	
	popupLogin : function(callback){
		popupwin('loginCont', 'black_overlay',undefined,callback);
	}
	
}
