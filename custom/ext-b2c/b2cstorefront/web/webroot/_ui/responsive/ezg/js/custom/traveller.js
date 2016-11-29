(function(){
	"use strict";

	$(function(){
		if($("[name='travellerList']").length === 0){return;}
		_.templateSettings = {
			interpolate: /\<\@\=(.+?)\@\>/gim,
				evaluate: /\<\@(.+?)\@\>/gim,
				escape: /\<\@\-(.+?)\@\>/gim
		};

		oTraveller = new Traveller();
		window.ACC.account.traveller = oTraveller;
		oValidator = new Validator({
			config:oTraveller.config

		});

		$(".list-content").html(oTraveller.createListTable());
		$(".mark-new-container").append($(oTraveller.createNewTrlSection()));

		attachListener();

	});
	var oTraveller,oValidator;

	function attachListener(){
		$(".mark-container").on("click",".mark-show-detail",function(e){
			var cid = $(e.target).attr("data-cid");

			var $target = $("div.edit_detailsContr[data-cid='"+cid+"']", $(e.delegateTarget));

			if($target.css("display") === "block"){
				$target.slideUp();
			}else{
				$(".edit_detailsContr", $(e.delegateTarget)).each(function(index, item){
					var $item = $(item);
					if($item.css("display") === "block"){
						$item.slideUp();
					}
				});
				$target.slideDown();
			}
			e.stopPropagation();
			e.preventDefault();
		});
		$(".mark-container").on("click",".mark-addvisa",function(e){

			e.stopPropagation();
			e.preventDefault();
			var $container = $(e.target).parent().next(),
				rootName =$(e.target).parent().attr("data-root") ;

				var index = 0;
				$container.children("[data-id]").each(function(_index, ele){
					var inx = Number($(ele).attr("data-id"));
					index = inx >index?inx:index;				
		
				});

				var $visa = $(oTraveller.generateEmptyVisaUI(true, index+1,rootName));
				$container.append( $visa );
		});

		$(".mark-container").on("click",".closeBtn_popup",function(e){
			e.stopPropagation();
			e.preventDefault();
			var $parent = $(e.target).parent().parent();
			$parent.siblings("[data-id='" + $parent.attr("data-id") + "']").remove();
			$parent.remove();

		});

		$(".mark-container").on("click",".mark-delete",function(e){
			e.stopPropagation();
			e.preventDefault();
			var $parent = $(e.target).parents(".data-table");
			$parent.next().remove();
			$parent.remove();

		});

	
		$(".mark-container").on("click",".mark-browse-btn",function(e){
			e.preventDefault();
			$(e.target).parent().siblings('input[type=FILE]').click();
		});

			$(".mark-container").on("change","input[type='file']",function(e){
				
				var fileName = e.target.files[0]?e.target.files[0].name:null;
				if(fileName){
					var $frame = $(e.target).parent().parent().siblings(".mark-upload");
					$frame.find(".picName").text(fileName);
					$frame.find("span").css("display","inline-block");
				}

			});
		
		$(".mark-container").on("click", "a.mark-up-btn", function(e) {
			var btnSml = $(e.target).parent().parent().siblings('.mark-up-input');
			var $uploadInput =  btnSml.find("input[type='file']");

			if($uploadInput.prop("files").length === 0){
				return false;
			}
			
			var uploadFileId  = $uploadInput.attr('id');
			var $img = $(e.target).parent().parent().siblings('.mark-up-img').find("img");
			

			$.ajaxFileUpload({
				url : ACC.config.contextPath+"/fileUpload",
				fileElementId : uploadFileId,
				data: {"CSRFToken":ACC.config.CSRFToken},
				dataType: "json",
				success : function(data, status) {
					if(data.status === "OK"){
						 
						 $img.attr({
							src: data.map.URL,
							alt:data.map.text,
							"data-code": data.map.code
						 
						 });

						 $img.parent().siblings(".mark-upload").find("span").css("display","none");
						 $uploadInput.val("");
						
					}else{
							 $img.parent().siblings(".mark-upload").find("span").css("display","none");
						 $uploadInput.val("");

						console.error(data.message);
					}
				},
				error : function(data, status) {
						 $img.parent().siblings(".mark-upload").find("span").css("display","none");
							 $uploadInput.val("");
						console.error(data.message);

				}	
			});
		});

		$(".mark-container").on("change","[name*='address.country']",function(e){
			e.stopPropagation();
			e.preventDefault();

			var $target = $(e.target),
				country = $target.val() || "IN",
				cid = $target.attr("data-cid");

				buildOptions([
					{
						type: "region",
						$root: $target.parent().next().children("select")
					},
					{
						type:"city",
						$root: $target.parent().next().next().children("select")
					}
				], country);

		});

		$(".mark-container").on("change","[name*='.title']",function(e){

			var title = $(e.target).find(":selected").text();
			var code = 	 $(e.target).find(":selected").val();
			var $pnt = $(e.target).parents(".edit_detailsContr").prev();
			title = code !== ''? title: '';
			$(".mark-tReplace",$pnt ).text(title);

		});

		$( ".mark-container" ).on( "input",":text,[type='password'], select, textarea, [type='radio'],[type='checkbox']",function(e){
			if($(e.target).next(".error-message").length > 0){
				$(e.target).next(".error-message").remove();
				$(e.target).removeClass("bdError");
			}
		});

		$(".mark-new-container").on("click",".mark-addTrl",function(e){
				
			var $target = $(e.delegateTarget),
				oo = {cid: -1, action: "C"};

				oTraveller.__coverValue(oo, $target );
				var _cid = oTraveller.generateCid(oo);
				if(_.find(oTraveller.aOriginDataList, function(oo){ return oo.cid == _cid})){

					var aMessage = [{
						cid: -1,
						message: "duplicated user name",
						field: "firstName"
					}];
					oValidator.showErrorMessage(aMessage,{
						format: function(oMessage){ return oMessage.message;},
						resolveField:oTraveller.oInfo.generateAttrName
					}, locateError(oTraveller.oInfo.generateAttrName));
					return false;
				}
				var aErrors = oValidator.verify(oo);
				
				if(aErrors.length > 0){
					oValidator.showErrorMessage(aErrors,{resolveField:oTraveller.oInfo.generateAttrName},locateError(oTraveller.oInfo.generateAttrName));
					return false;
				}
				oTraveller.addNew(oo);
				oTraveller.clearNew($target);
				$target.children(".edit_detailsContr").slideUp();

		});

		function buildOptions(aList, country){

			aList.forEach(function(opl){

				var _list = opl.type.split(".");

				opl.type = _list.length >= 2?_list[_list.length -2]:opl.type;
				var method = "get" + capitalWord(opl.type) + "List";
				$.when(oTraveller[method].call(oTraveller, country)).done(function(data){
					opl.$root.empty();
					data.forEach(function(obj){

						var _value = obj.cityIsoCode?obj.cityIsoCode:obj.isocode,
							_text = obj.cityName?obj.cityName:obj.name;

							var $opt = $("<option>").val(_value);
							$opt.text(_text);
							opl.$root.append($opt);
					});
				});
			});
		}

		$(".mark-container").on("click","[name*='address.region'],[name*='address.city']",function(e){
			e.stopPropagation();
			e.preventDefault();

			var $target = $(e.target),
				cid = $target.attr("data-cid"),
				type = $target.attr("name"),
				country = $("[name='travellers:"+cid+".address.country.isocode']").val(),
				value = $target.val(),
				notRefresh = $target.children().length > 1 ;

				if(!notRefresh){
						buildOptions([
							{
								type: type,
								$root:  $target
							}
						],country);

							$target.val(value);
						}
		});

		$(".mark-newTrl").on('click',function(e){
			
			var $new=$(e.target).parent().next();
				
			if($new.css("display") === "none"){
				$new.slideDown();
			}

			$(".list-content > .edit_detailsContr").each(function(index,ele){
				if($(ele).css("display") === "block"){
					$(ele).slideUp();
					 return;
				}
			});
			
		});

		$(".mark-date").datepicker({
			dateFormat: "dd/mm/yy",
			maxDate: new Date(),
			changeYear:true,
			changeMonth:true,
			defaultDate: $(this).val()?$(this).val(): new Date(),
			onSelect: function(date, ins){ 
				if(date){
					var $input = $(ins.input);
					if($input.next(".error-message").length > 0){
						$input .next(".error-message").remove();
						$input .removeClass("bdError");	
					}
				}
			}
		});

	}

	var Traveller = function(){
		if(!(this instanceof Traveller)){
			return new Traveller();
		}

		var form = JSON.parse($("[name='travellerList']").attr("value"));
		this.__oMeta = this.buildMeta(form.meta);
		this.tplList =  $("#tplTravellerList").html();
		this.tplEditTravel =  $("#tplTravellerDetail").html();
		this.tplVisa = $("#tplVisa").html();
		this.aTplAddVisa = [
			'<ul class="clearfix brdrBGrey pB10 mB10"><li class="col_12" data-root="<@-model.root@>"><a href="javascript:void(0);" class="fR mark-addvisa">',
			'+Add',
			'</a></li><li class="col_12 pL0 clearfix mT10 mark-visa-container">',
			'</li>',
			'</ul></div>'
		];

		this.oRegionCache = {};
		this.oCityCache = {};
		this.me = tempGenerateCustomerCid($("[name='customer']").attr("value"), bind(this.generateCid, this)); 
		this.aOriginDataList = this.buildDataList(form.data);
		this.root =  ACC.config.encodedContextPath + "/my-account";

		this.oInfo = {
			titleList: generateTitleList(),
			countryList: generateCountryList(),
			yearList: generateYear(), 
			dateList:  generateDate(),
			monthList: buildMonthList(),
			dateFormater: function(date){ 
				if(!date) return "";
				var cDate = new Date(date); 
				var dates = [];
				dates.push(cDate.getDate());
				dates.push(cDate.getMonth()-0+1);
				dates.push(cDate.getUTCFullYear());
				return dates.join("/");
			},
			generateAttrName:function(attrName, root){return root? root +  this.cid + "." + attrName :"travellers:"+ this.cid + "." + attrName;},
			nameFormater:function(){  
			
				var aNames = [].slice.call(arguments);
				_.remove(aNames, function(oName){ return !oName || oName.trim().length === 0; });
				return aNames.join(", ");
			}	

		};	

		this.config = [
			 {key:"title", value: "mandatory"}
			,{key:"firstName",value:"mandatory"}
			,{key:"lastName",value:"mandatory"}
			,{key:"dateOfBirth",value:["mandatory"]}
			,{key:"email",value: ["mandatory", "email"]}
			,{key:"mobileNumber",value:["mandatory","numeric"]}
			,{key:"address.country.isocode",value:"mandatory"}
			,{key:"address.region.isocode",value:"mandatory"}
			,{key:"address.city.cityIsoCode",value:"mandatory"}
			,{key:"address.postalCode",value:"mandatory"}
			,{key:"visaInfos:.country",value:"mandatory"}

		];

		clearTemplate();

		function clearTemplate(){
			$("[name='travellerList']").remove();
			$("#tplTravellerList").remove();
			$("#tplTravellerDetail").remove();
			$("#tplVisa").remove();
			$("[name='titleList']").remove();
			$("[name='countryList']").remove();
			$("[name='monthList']").remove();
			$("[name='customer']").remove();

		}

		function tempGenerateCustomerCid(name, generator){
			
			return generator.apply(this, name.split(", "));
		
		}

		function buildMonthList(){

			var aMon = [];
			var oMonthList = JSON.parse($("[name='monthList']").attr('value'));
			Object.keys(oMonthList).forEach(function(key){
				aMon.push({
					key: oMonthList[key],
					value: 	key
				});
			});
			
			aMon.sort(function(a,b){ return a.key - b.key;});

			aMon.unshift({
				key: null,
				value: "Month"
			});
			return aMon;

		}
		function generateHash(obj, oMeta){

			Object.keys(obj).forEach(function(key){

				var _type = getType(obj[key]);

				if(_type === "Object"){
					oMeta[key] = {}	;
					generateHash(obj[key],oMeta[key]);
				}else if(_type === "Array"){
					oMeta[key] = [{}];
					generateHash(obj[key][0],oMeta[key][0]);
				}else{
					oMeta[key] = hashKey(key);

				}
			});
		}
	};

	var pro = Traveller.prototype;

	pro.buildDataList = function(data){
		var that = this;
		data&&data.forEach(function(_data){
			that.buildData(_data);
		});
		return data;

	};
	pro.buildMeta = function(obj){
	
			populateData(obj);
			obj.cid = -1;
			obj.visaInfos[0].cid = 0;

			this.__setDefaultValue(obj);
			
			return obj;

	};

	pro.buildData = function(data){
		populateData(data);
		data.cid = this.generateCid(data);
		data.photo = data.photo || {};

		data.visaInfos =data.visaInfos  || [];
		
		this.__setDefaultValue(data);
		return data;
	};

	pro.__setDefaultValue = function(data){

		var photo = data.photo =  data.photo || {};
		
		data.issueCountry = data.issueCountry || {};

		var address = data.address = data.address || {};

		if(!address.country || !address.country.isocode){
			address.country = {
			
			isocode: null,
			name:"Country(Optional)" 
			};

		}

		if(!address.region || !address.region.isocode )	{
			address.region = {
				isocode:null,
				name: "Region"
			};
		}

		if(!address.city || !address.city.cityIsoCode){
			address.city =  {
				cityIsoCode: null,
				cityName:"City"
			};
		}
	};

	pro.generateCid = function(obj){
			
		var first, last;
		var aName = [];

		if(arguments.length === 1&& getType(arguments[0]) === "Object"){
			obj.firstName.toLowerCase()&&aName.push(obj.firstName.toLowerCase());
			obj.middleName&&obj.middleName.toLowerCase()&&aName.push(obj.middleName.toLowerCase());
			obj.lastName.toLowerCase()&&aName.push(obj.lastName.toLowerCase());
		} else {
			aName = [].slice.call(arguments);
			aName.forEach(function(v, i, a) {
				a[i] = v.toLowerCase()
			});
		}
		return hashKey(aName.join("|"));
	};

	pro.addNew = function(oo){

		this.buildData(oo);

		
		var sTpl =this.createOneTravel(oo);	
		
		$(".list-content").append($(sTpl));
	
	};
	
	pro.clearNew = function($root){
			
		$("input, select", $root).val('');
	//	$("[name*='title']", $root).val('dr');
	//	$("[name *= 'address.country.isocode']", $root).val('IN');
		$(".mark-visa-container", $root).empty();
		var $img = $("img[data-code]",$root).attr({
			src:'',
			alt:'',
			code:''
		});	
		
		$(".mark-upload", $root).find("span").css("display","none");
		
	};

	pro.save = function(form){

		var $root = $(".list-content"),
			that = this,
			aTravellers = [],
			aDateError = [];

				$(".data-row",$root).each(function(inx, row){

					var cid = $(row).attr("data-cid");

					var index = _.findIndex(that.aOriginDataList, function(o){ return o.cid == cid; });

					if(index >= 0){
						//update
						var otrl = _.cloneDeep(that.aOriginDataList[index]);
					aDateError = aDateError.concat(	that.__coverValue(otrl, $(".edit_detailsContr[data-cid='"+ cid +"']",$root )));
						aTravellers.push(otrl);  // easy to find deleted item, remove the same before post

					}else{
						var oo = {action:"C", cid: cid};
					aDateError = aDateError.concat(	that.__coverValue(oo, $(".edit_detailsContr[data-cid='"+ cid +"']",$root )));
						aTravellers.push(oo);
					}

				});

				var aValidations = [];

				aTravellers.forEach(function(oo){
					aValidations=aValidations.concat(oValidator.verify(oo));

				});

				aValidations = aValidations.concat(aDateError);

				if(aValidations.length > 0){
					oValidator.showErrorMessage(aValidations, {resolveField:oTraveller.oInfo.generateAttrName},locateError(oTraveller.oInfo.generateAttrName));
					return ;
				}
				var aDelete = _.filter(this.aOriginDataList, function(oD){

					var __o =	_.find(aTravellers, function(oT){
						return oD.cid == oT.cid;
					});
					return __o === undefined;

				});

				aDelete.forEach(function(item){
					item.action = "D";
				});

				aTravellers = aTravellers.concat(aDelete);


				_.remove(aTravellers, function(oT){
					return !oT.action; 
				});

				form.travellers = aTravellers;
				
				var dfd  = $.Deferred();

				$.when(postJson(this.root + "/saveSettings", form)).done(function(data){

					if(data.status === "OK"){
						aTravellers.forEach(function(oTravel){

							if(oTravel.action === "C"){
								oTravel.action = null;
								that.buildData(oTravel);
								that.aOriginDataList.push(oTravel);

							}else if(oTravel.action === "U"){
								oTravel.action = null;

								populateData(oTravel);

								var _oOld = _.find(that.aOriginDataList, function(o){ return o.cid === oTravel.cid;});
								
								if(shouldUpdate(oTravel, _oOld)){
									updateListRow(oTravel);	
									
								}
								_.remove(that.aOriginDataList, function(o){
									return o.cid === oTravel.cid;
								});

								that.aOriginDataList.push(oTravel);

							}else{
								oTravel.action = null;
								_.remove(that.aOriginDataList, function(o){
									return o.cid === oTravel.cid;
								});
							}

						});
						
						messageBox({message:"Save Success"});
						dfd.resolve();

					}else{
						if(data.map){
							var aMessage = [];
							Object.keys(data.map).forEach(function(key){
								
								aMessage.push({
									field: key,
									message: data.map[key]
								});
							
							});
							oValidator.showErrorMessage(aMessage, { format:function(oMessage){ return oMessage.message;} },locateError() );
						}
					}

					function updateListRow(oObject){
							var _proto = {
								showMe: oTraveller.me===oObject.cid
							};

							if(!oObject.photo){
								oObject.photo = {};
							}

							
							var oModel =  $.extend(_proto ,oObject, oTraveller.oInfo);
							$(".data-table [data-cid='" + oObject.cid +"']", $root).parent().empty().append($(oTraveller.createOneListArea(oModel)).children());

					}
					function shouldUpdate(oNew, oOld){
						
						if(oNew.photo === null && oOld.photo === null){
							
								return false;
							}
							if(oNew.photo === null &&oOld.photo !== null || oNew.photo !== null &&oOld.photo === null ){
								return true;
							}
							if(oNew.photo.code === oOld.photo.code){
								return false;
							}else{
								return true;
							}
						
						}

				}).fail(function(err){
					if(err && err.status > 400){
						console.error(err.statusText);
					}
					dfd.reject(err);
				});

				return dfd.promise();

	};

	pro.__coverValue = function(oTrl,$root){
		
		var aDateError = [];     // this is only for date format validation, like 31-02-2016 is invalidate
		var $title = $("[name='"+oTraveller.oInfo.generateAttrName.call(oTrl,"title") +"'] :selected", $root);
		oTrl.title = __assign(	oTrl.title , $title.val(),oTrl);
		oTrl.titleName = __assign(	oTrl.titleName, $title.text(), oTrl);
		oTrl.lastName = __assign(oTrl.lastName, $("[name='"+oTraveller.oInfo.generateAttrName.call(oTrl,"lastName")+"']",$root).val(), oTrl);
		oTrl.firstName =  __assign(oTrl.firstName, $("[name='"+oTraveller.oInfo.generateAttrName.call(oTrl,"firstName")+"']",$root).val(), oTrl);
		oTrl.middleName =  __assign(oTrl.middleName, $("[name='"+oTraveller.oInfo.generateAttrName.call(oTrl,"middleName")+"']",$root).val(), oTrl);

		oTrl.email =  __assign(oTrl.email,$("[name='"+ oTraveller.oInfo.generateAttrName.call(oTrl,"email") +"']",$root).val(), oTrl);
		oTrl.mobileNumber =  __assign(oTrl.mobileNumber,$("[name='"+oTraveller.oInfo.generateAttrName.call(oTrl,"mobileNumber") +"']",$root).val(), oTrl);

		var tempDay = $("[name='"+ oTraveller.oInfo.generateAttrName.call(oTrl,"dateOfBirth")+"']", $root).val();

		var aBirDay =null,  bDay = null;
		if(tempDay){
			aBirDay = tempDay.split("/");
		}

		if(aBirDay&&aBirDay.length === 3){
			bDay = new Date(aBirDay[2],aBirDay[1]-1,aBirDay[0]).getTime();
		}
		oTrl.dateOfBirth =  __assign(oTrl.dateOfBirth,bDay, oTrl);

		var oAddress = oTrl.address?oTrl.address:oTrl.address={};
		oAddress.line1 =__assign(oAddress.line1, $('[name="'+oTraveller.oInfo.generateAttrName.call(oTrl,"address.line1") +'"]', $root).val(), oTrl);

		var oCountry =  oTrl.address.country?oTrl.address.country: oTrl.address.country={} ;
		var $country =  $("[name='"+ oTraveller.oInfo.generateAttrName.call(oTrl,"address.country.isocode")+"'] :selected", $root);
		oCountry.isocode =__assign(oCountry.isocode, $country.val(), oTrl);
		oCountry.name =__assign(oCountry.name, $country.text(), oTrl);

		var oRegion =  oTrl.address.region?oTrl.address.region:oTrl.address.region={};
		var $region =  $("[name='"+oTraveller.oInfo.generateAttrName.call(oTrl,"address.region.isocode") +"'] :selected", $root);
		oRegion.isocode = __assign(oRegion.isocode, $region.val(), oTrl);
		oRegion.name =  __assign(	oRegion.name, $region.text(), oTrl);

		var oCity =  oTrl.address.city?oTrl.address.city:oTrl.address.city={} ;
		var $city =  $("[name='"+ oTraveller.oInfo.generateAttrName.call(oTrl,"address.city.cityIsoCode")+"'] :selected", $root);
		oCity.cityIsoCode = __assign(oCity.cityIsoCode, $city.val(), oTrl);
		oCity.cityName = __assign(oCity.cityName,$city.text(), oTrl);

		oAddress.postalCode = __assign(oAddress.postalCode, $("[name='"+ oTraveller.oInfo.generateAttrName.call(oTrl,"address.postalCode") +"']",$root).val(), oTrl);
		oTrl.passportNumber=__assign(oTrl.passportNumber, $("[name='"+oTraveller.oInfo.generateAttrName.call(oTrl,"passportNumber") +"']",$root).val(), oTrl);


		var oPhoto = oTrl.photo =  oTrl.photo || {};
		var photoCode = $("img[data-code]",$root).attr("data-code");

		if(photoCode){
			oPhoto.code =  __assign(oPhoto.code ,photoCode, oTrl);
			oPhoto.url = $("img[data-code]",$root).attr("src");
			oPhoto.altText = $("img[data-code]",$root).attr("alt");
		}else{
			oTrl.photo = null;      //TODO deal with delete photo
		}	

		var oIssue = oTrl.issueCountry = oTrl.issueCountry || {};
		var $issue =  $("[name='"+ oTraveller.oInfo.generateAttrName.call(oTrl,"issueCountry")+"'] :selected", $root);
		oIssue.isocode = __assign(oIssue.isocode, $issue.val(), oTrl);
		oIssue.name = __assign(oIssue.name, $issue.text(), oTrl);

		var pDay = $("[name='" +oTraveller.oInfo.generateAttrName.call(oTrl,"__date")+ "'] :selected",$root ).val(),
			pMonth = $("[name='"+oTraveller.oInfo.generateAttrName.call(oTrl,"__month") +"'] :selected",$root ).val(),
			pYear = $("[name='"+oTraveller.oInfo.generateAttrName.call(oTrl,"__year") +"'] :selected",$root ).val(),
			passportDate = null ;

			if($.isNumeric(pDay)&&$.isNumeric(pMonth)&&$.isNumeric(pYear)){
				var _tempDate = new Date(pYear,pMonth,pDay);
				passportDate = _tempDate.getTime();
				
				if(pDay != _tempDate.getDate() || pMonth !=_tempDate.getMonth()){    // verify date, this is adhoc validation 
					aDateError.push({
						field: "__date",
						cid:oTrl.cid,
						rule: "date"
					});
				}
			}

			oTrl.passportExpDate= __assign(oTrl.passportExpDate,passportDate, oTrl );

			var aVisa = [],
				$visaDate = $("select[name*=visaInfos]",$root);

				$("input[name*=visaInfos]",$root).each(function(inx, ele){

					var country = $(ele).val();
					var oVisa = {
						country: country,
						cid: $(ele).attr("data-num")
					};
					var name = $(ele).attr("name");
					name = name.slice(0, name.lastIndexOf("."));
					var date = $visaDate.filter("[name='"+ name + ".__date']").val(),
						month = $visaDate.filter("[name='"+name + ".__month']").val(),
						year = $visaDate.filter("[name='"+name + ".__year']").val();	

						if($.isNumeric(date)&&$.isNumeric(date)&&$.isNumeric(year)){
							var _tempDate = new Date(year, month, date);
							oVisa.validTill = _tempDate.getTime();
							if(date !=_tempDate.getDate() || month != _tempDate.getMonth() ){
								aDateError.push({
									field:  "visaInfos:" + oVisa.cid  + ".__date",
									cid:oTrl.cid,
									rule: "date"	
								});
							}
							
						}
						aVisa.push(oVisa);

					});

					if(!oTrl.action){
						if(oTrl.visaInfos.length !== aVisa.length ){
							oTrl.action = "U";
						}else{
							var _diff=aVisa.some(function(visa){

								var _result =_.find(oTrl.visaInfos,function(o){
									return o.country === visa.country && (o.validTill == visa.validTill);  // must ==, since it could be null or undefined
								} );	
								return (typeof _result === "undefined");
							});
							if(_diff){
								oTrl.action = "U";
							}
						}
					}
					oTrl.visaInfos = aVisa;
					return aDateError;

					function __assign(left , right,oTrl){

						var _ui = left?left:""; 
						if(!oTrl.action && left != right && _ui != right){
							oTrl.action = "U";
						}
						return right;
					}

	};

	pro.getRegionList = function(country){

		var $dfd = $.Deferred(),
			that = this;

			if(this.oRegionCache[country]){
				return $dfd.resolve(this.oRegionCache[country]);
			}

			$.when($.ajax({
				type: "GET",
				url: this.root + "/regions",
				async: false,
				dataType: "json",
				data:{"countryISO":country}
			})).done(function(data){
				data.unshift({
					isocode: null,
					name:"Region"
				});

				that.oRegionCache[country] = data;
				$dfd.resolve(data);

			});

			return $dfd;
	};

	pro.getCityList = function(country){

		var $dfd = $.Deferred(),
			that = this;
			if(this.oCityCache[country]){
				return $dfd.resolve(this.oCityCache[country]);
			}

			$.when( $.ajax({
				type: "GET",
				url: this.root + "/cities",
				async: false,
				dataType: "json",
				data:{"countryISO":country}
			})).done(function(data){
				data.unshift({
					cityIsoCode: null,
					cityName:"City"
				});

				that.oCityCache[country] = data;
				$dfd.resolve(data);

			});

			return $dfd;

	};

	pro.createListTable = function(){

		var that = this;
		return  this.aOriginDataList.reduce(bind(this.createOneTravel, this),"");
	};

	pro.createOneTravel = function(pre, obj){

		if(getType(pre) === "Object"){
			obj = pre;
			pre = '';
		}
			var _proto = {
				showMe: oTraveller.me===obj.cid
			};

			var oModel =  $.extend(_proto ,obj, this.oInfo);

			pre += this.createOneListArea(oModel) + this.createOneEditArea(oModel);
			return this.__createVisa(pre, obj );
	};

	pro.createOneListArea = function(oModel){
	
		return  _.template(this.tplList, {"model": oModel });
	};

	pro.createOneEditArea = function(oModel){
			return  _.template(this.tplEditTravel, {"model": oModel });

	};


	pro.__createVisa = function(sTpl, obj){
	
			var __sAddVisaFrame = arguments[2] ||this.aTplAddVisa.slice(), that = this,
				rootName = this.oInfo.generateAttrName.call(obj,"visaInfos:");

				if(obj.visaInfos.length > 0){
					 sTpl+= this.generateVisaUI(obj.visaInfos[0],0 ,rootName );
					var sVisa = '';

					sVisa= obj.visaInfos.slice(1).reduce(function(_pre, visa, index){
						visa.showRemove = true;
						return _pre+=that.generateVisaUI(visa, index+1,rootName);
					},sVisa);
					__sAddVisaFrame.splice(__sAddVisaFrame.length-2,0,sVisa);
					return sTpl+=_.template(__sAddVisaFrame.join(''), {"model": {"root": rootName}}) ;

				}else{
					 sTpl+= this.generateEmptyVisaUI(false, 0,rootName );
					return sTpl +=_.template(__sAddVisaFrame.join(''), {"model": {"root": rootName}}) ;
				}
	
	};

	pro.createNewTrlSection = function(){

		var obj = $.extend({},this.__oMeta, this.oInfo);
		var _aTpl = this.aTplAddVisa.slice();
		   _aTpl.splice(_aTpl.length -1, 0 , '<span class="primaryBtn mT10"><a href="javascript:void(0);"  class="mark-addTrl">Add Traveller</a></span>');
		 var sNew =  _.template(this.tplEditTravel, {"model":  obj});
		
		return this.__createVisa(sNew, obj,_aTpl);

	};

	pro.generateEmptyVisaUI = function(showRemove, index ,rootName){
		var oModel = {
			showRemove: showRemove,
			//			index: index
		};
		Object.keys(this.__oMeta.visaInfos[0]).forEach(function(key){
			oModel[key] = null;
		});
		return this.generateVisaUI(oModel, index,rootName);

	};

	pro.generateVisaUI = function(oModel, index, rootName){
		oModel.cid = index;
		return _.template(this.tplVisa, {"model": $.extend({rootName: rootName},oModel, this.oInfo)});
	};

	function generateCountryList(){
		var aList =	JSON.parse($("[name='countryList']").attr("value"));	
		aList.unshift({
			isocode: null,
			name:"Country" 
		});
		return aList;
	}

	function generateTitleList(){
	
	var aList =	JSON.parse($("[name='titleList']").attr("value"))	
		aList.unshift({
			code: null,
			name: "Title"
		});
		return aList;

	}

	function generateYear(){
		var aList = generateNumberObject(20, (new Date()).getFullYear());
		aList.unshift({
			key: null,
			value: "Year"

		});
		return aList;
	}

	function generateDate(){

		var aList = generateNumberObject(31, 1);
		aList.unshift({
			key: null,
			value: "Date"
		});

		return aList;
	}

	function generateNumber(count, initValue){
		var aList = [];
		for(var i = initValue, j = 0; j < count ; i++, j++){
			aList.push(i);
		}
		return aList;
	}

	function generateNumberObject(count, initValue){
		var aList = [];
		for(var i = initValue, j = 0; j < count ; i++, j++){
			aList.push({
				key: i,
				value:i
			});
		}
		return aList;
	}


	function populateData(obj){

		translateDateField(obj, "passportExpDate");
		obj.visaInfos&&	obj.visaInfos.forEach(function(info){
			translateDateField(info,"validTill");
		});
	}

	function translateDateField(obj, fieldName){
		if(obj[fieldName] && obj[fieldName] !== "null"){
			var oDate = new Date(obj[fieldName]);
			obj.__date = oDate.getDate();
			obj.__month = oDate.getMonth();
			obj.__year = oDate.getYear() + 1900;
		}else{
			obj.__date = -1;
			obj.__month = -1;
			obj.__year = -1;
		}
	}

//	function buildOptions(aList, $root){
//
//		aList.forEach(function(obj){
//
//			var $opt = $("<option>").val(obj.isocode);
//			$opt.text(obj.name);
//			$root.append($opt );
//
//		});
//
//	}

	function capitalWord(text){
		return text.charAt(0).toUpperCase() + text.slice(1);	
	}


	function hashKey (key){

		if(getType(key) !== "String"){
			throw new TypeError("arguments should be String");
		}

		var hash = 0, i, chr, len;
		for (i = 0, len = key.length; i < len; i++) {
			chr   = key.charCodeAt(i);
			hash  = ((hash << 5) - hash) + chr;
			hash |= 0; // Convert to 32bit integer
		}
		return hash;

	};


	function postJson(url, obj, ops){

		var _ops = $.extend({}, ops|| {}, {
			url: url,
			type:"POST",
			contentType: "application/json; charset=utf-8",
			headers:{
				CSRFToken: ACC.config.CSRFToken
			}
		});

		obj&&(_ops.data = JSON.stringify(obj));

		return $.ajax(_ops);

	}

	function getType(obj){
		return Object.prototype.toString.call(obj).replace(/.*\s(.*)]$/, "$1");

	}
	
	function bind (fn, context){
			return function(){
				return	fn.apply(context, [].slice.apply(arguments));
			};
		}

	function Validator(oConfig){

		this.message={
			mandatory: "This field is required"
			,email:"Please enter valid email address"
			,date: "Please supply valid date"
			,numeric:"Please enter valid number"
		};

		this.oRules={
			mandatory: function(val){ 
							if(val === null ||val === undefined){ 
								return false; 
							} 
							if(typeof val === 'string'){
								return val.trim().length > 0;
							}else{
								return (val + '').length >0 ;
							}
						}
			,email: function(val){ return /^[a-zA-Z0-9.!#$%&'*+\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$/.test(val);}
			,numeric:function(val){ return /^\d+$/.test(val);  }
		};

		this.oConfig = oConfig;

		if(	this.oConfig.root && this.oConfig.root.length > 0){
		
			this.__attacheHandler($(this.oConfig.root));
		}
	}

	Validator.prototype.verify = function(oo){

		var aValidations = [],
			that = this;

			function __resolveValues(parentKey, key ,oo,aRR){

				var _val = oo;
				var kks = 	key.split(".");

				var result = kks.some(function(part , inx){
					if(part.indexOf(":") >= 0){
						_val =  _val[part.slice(0,part.length-1)];
						var nKey = kks.slice(inx+1).join(".");

						_val.forEach(function(_oo){

							var nextKey = parentKey.length > 0? parentKey + "." +part + _oo.cid:part + _oo.cid ;
							__resolveValues(nextKey,nKey,_oo, aRR);

						});
						return true;
					}else{
						parentKey = parentKey.length ===0 ? part: parentKey+"."+ part;
						_val = _val[part];
					}

				});
				if(!result){
					aRR.push({
						key: parentKey,
						value: _val

					});

				}
			}

			this.oConfig.config.some(function(oCon){
				var aTargets = [];

				__resolveValues('', oCon.key, oo, aTargets);

				aTargets.forEach(function(_pair){

					if(getType(oCon.value) === "Array"){
						oCon.value.some(function(rule){
							if(!that.oRules[rule].call(null,_pair.value)){
								aValidations.push({
									cid: oo.cid,
									field:_pair.key,
									rule: rule
								});
								return true;
							}
						});
					}
					else{
						if(!that.oRules[oCon.value].call(null, _pair.value)){
							aValidations.push({
								cid: oo.cid,
								field:_pair.key,
								rule: oCon.value
							});
						}
					}
				});

			});

			return aValidations;

	};

	Validator.prototype.showErrorMessage = function (aMessages, options, cb){


		if(typeof options === 'function'){
			cb = options;
			options = null;
		}

		var ops = {
			resolveField: this.fieldResolver,
			format: function(oMsg){ return this.message[oMsg.rule]; }
		};

		ops = $.extend(ops, options||{});		

		var that= this;
		aMessages.forEach(function(oMessage){
			var attName = ops.resolveField?ops.resolveField.call(oMessage, oMessage.field): oMessage.field;
			that.renderMessage(attName,ops.format.call(that, oMessage) );
		});

		if(cb){
			cb.call(null,aMessages);
		}
	};

	Validator.prototype.renderMessage = function(attName, message, $parent){
			var $target =$parent?  $("[name='"+attName+"']",$parent):$("[name='"+attName+"']") ;
			var $label = $target.next();
			if($label.hasClass("error-message")){
				$label.text(message);
			}else{
				$target.addClass("bdError").after($("<lable class='error-message nowrapT txtClrRed pT5'>").text(message));
			}
	
	};

	Validator.prototype.__attacheHandler = function($root){
	
		$root.on( "input",":text,[type='password'], select, textarea, [type='radio'],[type='checkbox']",function(e){
			if($(e.target).next(".error-message").length > 0){
				$(e.target).next(".error-message").remove();
				$(e.target).removeClass("bdError");
			}
		});

	};

	function locateError(resolver){
		return function(aMessages){
			var __o = {};

			aMessages.forEach(function(oMessage){
			
					var attName = resolver? resolver.call(oMessage, oMessage.field): oMessage.field;
					var _aMatched = attName.match(/^[^:\.]*:([^.]*)\..*/);
					attName = _aMatched? _aMatched[1]:attName;
					if(typeof __o[attName] ==='undefined'){
						__o[attName] = attName;
					}			
			});
			
			Object.keys(__o).forEach(function(key){
				$(".edit_detailsContr[data-cid='"+ key +"']").css({"display":"block"}).slideDown();
			});
				
		
		};
	
	}
	
	function messageBox(oConfig){

		var transitionTime = 4000;
		var _handler;
		var boxEle = document.querySelector(".tmp-messagebox");
		if(boxEle === null){
			boxEle = document.createElement("div");
			boxEle.className = "tmp-messagebox";
			var message = document.createElement("div");
			message.className = "tmp-message";

			var messageContent =  document.createElement("span");
			messageContent.className = "tmp-message-content";
			message.appendChild(messageContent);

			var button = document.createElement("span");
			button.appendChild(document.createTextNode("X"));
			button.className = "tmp-message-btn";
			message.appendChild(button);

			boxEle.appendChild(message);
			document.querySelector("body").appendChild(boxEle);

			$("body").on("click", ".tmp-message-btn", function(e){
				e.stopPropagation();
				clearTimeout(_handler);
				remove();
			});
			_handler = showMessage(oConfig);
			messageBox = showMessage;

		}

		function showMessage(oConfig){

			var boxEle = document.querySelector(".tmp-messagebox");

			if(	boxEle.style.display === "block"){
				console.error("exceeds message interval is 4s");
				return;
			}
			boxEle.style.display = "block";

			function innerShow(__time){
				var messageEle = boxEle.firstChild.firstChild;
				if(messageEle.hasChildNodes()){
					messageEle.removeChild(messageEle.firstChild);
				}
				messageEle.appendChild(document.createTextNode(oConfig.message));
				boxEle.firstChild.className += " show-tmp-message";
				_handler = setTimeout(remove, __time);

			}
			setTimeout(function(){   innerShow(transitionTime);  }, 50);
		}
		function remove(){
			boxEle.firstChild.className = boxEle.firstChild.className.replace(/(.*)\sshow-tmp-message(.*)/,"$1$2");
			var transitionName = transitionEnd();
			if(transitionName){
				$(boxEle.firstChild).one(transitionName, function(){
					boxEle.style.display = "none";
				});

			}else{
				setTimeout(function(){
					boxEle.style.display = "none";
				}, 1000);
			}

			function transitionEnd() {
				var el = document.createElement('div');
				var transEndEventNames = {
					WebkitTransition : 'webkitTransitionEnd',
					MozTransition    : 'transitionend',
					OTransition      : 'oTransitionEnd otransitionend',
					transition       : 'transitionend'
				};
				for (var name in transEndEventNames) {
					if (el.style[name] !== undefined) {
						return transEndEventNames[name];
					}
				}
				return false;
			}
		}
	}
	window.ACC.travellerValidator = Validator;

})();
