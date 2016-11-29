(function($,_,ACC){
	"use strict";

	var cards = {},
		oEditMeta = {},
		confirmBox;

		$(function () {

			if($("[name='cardInfoList']").length === 0){return;}

			_.templateSettings = {
				interpolate: /\<\@\=(.+?)\@\>/gim,
					evaluate: /\<\@(.+?)\@\>/gim,
					escape: /\<\@\-(.+?)\@\>/gim
			};

			cards = new Cards();
			oEditMeta = {
				aMonthList: cards.aMonthList.slice(),
				aYearList: generateYear(),
				aCardTypeList: cards.aCardTypeList.slice()
			};

			$(".list-content").html(cards.buildCardsContent(oEditMeta));
			cards.initAddMeta();
			$(".add-card-frame").html(cards.buildAddPart());
			attachHandler();

			confirmBox = new Dialog({
				title:"Delete Card",
				desc:"Are you sure you want to delete this card"
			});

		});

		function attachHandler(){

			$("#cards").on("click",function(e){

				var $clickTarget = $(e.target),
					cardnum;

					if(cardnum = $clickTarget.attr("data-cardNum")){
						editPartAnimate.call(this, cardnum);
					}else if($clickTarget.hasClass("add_card") || $clickTarget.parent().hasClass("add_card") ){
						editPartAnimate.call(this, -1);
					}
					e.preventDefault();
					e.stopPropagation();
			});	

			function editPartAnimate(cardnum){
				var $target = $("div[data-number='"+cardnum  +"']", $(this));	
				if($target.css("display") === "block" ){
					$target.slideUp();

				}else{
					$target.slideDown();
					$(".edit_cardContr,.add_cardContr").each(function(index, item){
						var $item = $(item);
						if($item.attr("data-number") !=cardnum&&$item.css("display") === "block"){
							$item.slideUp();
						}
					});
				}
			}

			$("#cards").on("click",".edit-card",function(e){

				var cardNum = $(e.target).attr("data-save-card");
				var $container = $(".edit_cardContr[data-number='"+ cardNum +"']");
				var $parent = $container.parent();
				var oCard = extractInfo($container);

				$.when(cards.update(oCard)).done(function(data){

					if(data && data.status == "OK"){
						var _tpl = cards.buildOneCardRow(oCard,oEditMeta);
						$container.remove();
						$parent.html(_tpl);
					}else{
						if((typeof data.status === "string") && data.status.toUpperCase() === "ERROR"){
								showErrorMessage(data,$container);
						}
					}

				}).fail(function(err){
					if( (typeof err.status === "string") && err.status.toUpperCase() === "ERROR"){
						showErrorMessage(err,$container);

					}else{
						//TODO show global error message
					}

				});	
				e.preventDefault();
				e.stopPropagation();
			});


			$("#cards").on("click",".delete-card",function(e){

				var cardNum = $(e.target).attr("data-cardnum");
				var $parent = $(".edit_cardContr[data-number='"+ cardNum +"']").parent();
				$.when(cards.deleteCard(cardNum)).done(function(data){
					$parent.remove();
				}).fail(function(err){
					//TODO
				});
				e.preventDefault();
				e.stopPropagation();

			});

			$("#cards").on("input", _.throttle(function(e){

				var $self = $(e.target);
				var meta = $self.attr("data-meta");
				var $con = $self.parent().siblings(".show-message");
				var $tgt = $("[data-meta='"+meta +"']", $con );
				if(!$tgt.hasClass("hide-message")){
					$tgt.addClass("hide-message");
				}

			}, 200));

			function showErrorMessage(err, $container){

				if(err.map){
					var aErrorKeys = [];

					Object.keys(err.map).forEach(function(key){
						aErrorKeys.push({
							key: cards.getMetakey(key),
							value: err.map[key]
						});
					});
					aErrorKeys.forEach(function(oMessage){
						var $tar = $("span[data-meta='"+ oMessage.key +"']",$container);
						$tar.text(oMessage.value);
						$tar.removeClass("hide-message");
					});
				}
			}

			$("#cards").on("click",".add-card",function(e){

				var $container = $(".add_cardContr[data-number='-1']");
				var oCard =  extractInfo($container);

				$.when(cards.addCard(oCard)).done(function(data){
					var $parent = $(".list-content");
					var $div = $("<div class='card-row'>");
					$div.html( cards.buildOneCardRow(oCard,oEditMeta));
					$parent.append($div);
					resetEditArea($container);
				}).fail(function(err){
					
					if( (typeof err.status === "string") && err.status.toUpperCase() === "ERROR"){
						showErrorMessage(err,$container);
						
					}else{
						//TODO show global error message
					}
				});
				e.preventDefault();
				e.stopPropagation();
			});

			function extractInfo($container){

				var oCard = {};
				oCard.creditCardNumber = $("[name='card_number']",$container).val();
				oCard.cardholderName = $("[name='name_on_card']",$container).val();
				oCard.month = $("[name='validate_month'] :selected",$container).val();
				oCard.year = $("[name='validate_year'] :selected",$container).val();
				oCard.cvv = $("[name='CVV']",$container).val();
				oCard.cardType = $("[name='card_type'] :selected",$container ).val();
				return oCard;
			}

			function resetEditArea($container){
				$("[name='card_number']",$container).val("");
				$("[name='name_on_card']",$container).val("");
				$("[name='CVV']",$container).val("");
				$("[name='card_type']",$container).val("");
				$("[name='validate_month']",$container).val("-1");
				$("[name='validate_year']",$container).val("Year");
			}
		}

		function Cards(){

			if(!(this instanceof Cards)){
				return new Cards();
			}

			var form =  JSON.parse($("[name='cardInfoList']").attr('value'));
			this.aCardInfo = buildDataList(form.meta,form.data);
			this.aCardTypeList = JSON.parse($("[name='cardTypeList']").attr('value'));
			this.aMonthList = [];
			this.sDisplayTpl = $("#tempalteDisplayPart").html();
			this.sEditTpl = $("#templateEditPart").html();
			this.root =  ACC.config.encodedContextPath + "/my-account/wallet";
			this.__oMeta = buildMeta(form.meta);

			this.formatter = {
				__formatCardType: function(type){ 
					type = type.toLowerCase(); 
					return type === "master"? "mastercard":type;}
			};

			var oMonthList = JSON.parse($("[name='monthList']").attr('value'));
			Object.keys(oMonthList).forEach(bind(function(key){
				this.aMonthList.push({
					key: oMonthList[key],
					value: 	key
				});
			},this));
			this.aMonthList.sort(function(a,b){
				return a.key - b.key;
			});

			function buildDataList  (meta, data){
				return data;				
			}

			function buildMeta(obj){
				var oMeta = {};
				Object.keys(obj).forEach(function(key){
					oMeta[key] = hashKey(key);
				});
				return oMeta;
			}
		
		}

		Cards.prototype.buildCardsContent = function(ometa){
			var sresult = "";
			this.aCardInfo.forEach(bind(function(info){
				sresult += this.wrapRow(this.buildOneCardRow(info, ometa));
			},this));
			return sresult;
		};

		Cards.prototype.wrapRow = function(srow){
			return "<div class='card-row'>" + srow + "</div>";
		};

		Cards.prototype.buildOneCardRow = function(cardinfo,ometa){
			var sresult = "";
			var __o = $.extend({},cardinfo,{
				mode: "edit",
				oMetaData: this.__oMeta
			},ometa );
			return  _.template(this.sDisplayTpl, {"model": $.extend(__o , this.formatter)}) + _.template(this.sEditTpl,{"model": $.extend(__o , this.formatter)});
		};


		Cards.prototype.__checkDuplicate = function(oCard){

			return this.aCardInfo.some(function(item){
				return item.creditCardNumber === oCard.creditCardNumber;
			});
		};

		Cards.prototype.addCard = function(oCard){

			var dtd = $.Deferred();
			var that = this;
			if(this.__checkDuplicate(oCard)){
				return dtd.reject({
					status: "Error",
					map:{
						creditCardNumber:"the card number "+ oCard.creditCardNumber +" already registered"
					}});
			}

			var message = this.validate(oCard);
			if(Object.keys(message).length>0){
			return dtd.reject({
					status: "Error",
					map:message
				});
			}

			var url =  this.root + "/addCard"; 
			postJson(url, oCard).done(function(data){
				if(data.status.toUpperCase() === "OK"){
					that.aCardInfo.push(oCard);
					dtd.resolve(data);
				}else{
					dtd.reject(data);
				}
			}).fail(function(err){
				dtd.reject(err);
			});

			return dtd.promise();

		};
		Cards.prototype.initAddMeta = function(){

			this.oAddMeta = {
				aMonthList: this.aMonthList.slice(),
				aYearList: generateYear(),
				aCardTypeList: cards.aCardTypeList.slice(),
				mode: "add",
				creditCardNumber: -1

			};
			this.oAddMeta.aMonthList.unshift({
				key: -1,
				value: "Month"
			});
			this.oAddMeta.aYearList.unshift("Year");
			this.oAddMeta.aCardTypeList.unshift("");


			//	Object.keys(this.aCardInfo[0]).forEach(bind(function(key){
			//
			//		if(key === "creditCardNumber"){
			//			this.oAddMeta[key] = -1;
			//		}else{
			//			this.oAddMeta[key] = "";
			//		}
			//	},this));

		};

		Cards.prototype.removeCardRecord = function(number){

			this.aCardInfo.splice(_.findIndex(this.aCardInfo, function(item){
				return item.creditCardNumber === number;
			}),1);
		};

		Cards.prototype.deleteCard = function(number){
			var dtd = $.Deferred();
			var url = this.root + "/deleteCard/"+number ; 
			var that = this;
			
			$.when(confirmBox.open()).done(function(){
				postJson(url).done(function(data){

					that.removeCardRecord(number);
					dtd.resolve(data);
				}).fail(function(err){
					dtd.reject(err);
				});
			}).fail(function(){
				dtd.reject();
			});	

			return dtd.promise();
		};

		Cards.prototype.buildAddPart = function(){

			return _.template(this.sEditTpl, {"model": $.extend(this.oAddMeta, this.formatter,{oMetaData: this.__oMeta})});

		};

		Cards.prototype.checkIfSame = function(obj){

			if(typeof obj !== 'object' || obj === null || !obj.creditCardNumber){
				return false;
			}

			var oCard = this.__findCard(obj);

			if(!oCard){
				return false;
			}

			return Object.keys(obj).some(function(item){
				return obj[item] != oCard[item];
			});

		};

		Cards.prototype.__findCard = function(obj){
			return _.find(this.aCardInfo, function(card){
				return card.creditCardNumber === obj.creditCardNumber;
			});

		}; 

		Cards.prototype.__wrapBack = function(obj){

			var __o = this.__findCard(obj);
			Object.keys(__o).forEach(function(key){

				if(obj[key] === undefined){
					obj[key] = __o[key];
				}
			});

			return obj;
		};

		Cards.prototype.getMetakey = function(key){
			
			return this.__oMeta[key];
		};

		Cards.prototype.update = function(obj){
			
			if(!this.checkIfSame(obj)){
				return $.Deferred().reject({
					status: "Error",
					map:{}
				});
			}
			
			var message = this.validate(obj);
			if(Object.keys(message).length>0){

				return $.Deferred().reject({
					status: "Error",
					map:message
				});
			}

			this.__wrapBack(obj);

			var url = this.root + "/updateCard"; 

			return postJson(url, obj);

		};

		Cards.prototype.validate = function(obj){
			var message={};	
			if(!/^\d{12,19}$/.test(obj.creditCardNumber)){
				message.creditCardNumber = "card number is invalidate" ;
			}	

			if(! (new Date(Number(obj.year),Number(obj.month), 1).getTime() - Date.now() > 0)){
				message.month =  "expire date is invalidate" ;
			}

			if(!obj.cardholderName ||obj.cardholderName.length === 0 ){
				message.cardholderName = "Card holder name can not be empty";
			}
			
			if(!obj.cardType){
				message.cardType = "Card type can not be empty";
			}

			if(!obj.cvv){
				message.cvv = "CVV can not be empty";
			}

			return message;
		
		};

		var Dialog = function(ops){
			
			this.title = ops.title || "Confirmation";
			this.description = ops.desc;
			this.__id = "confirmation-dialog";
			this.__fadeID = "fade";
			$("#" +	this.__id ).on("click",".m-cancel",bind(function(e){
					this.close();
					e.stopPropagation();
			},this)).on("click", ".m-confirm" , bind(function(e){
					this.confirm();
					e.stopPropagation();
			},this));
		};

		var dPro = Dialog.prototype;

		dPro.close = function(){
			window.popupclose(this.__id, this.__fadeID);
			this.dtd.reject();
		};

		dPro.open = function(ops){
			
			this.dtd = $.Deferred();
			window.popupwin(this.__id,"",this.__fadeID);
			return this.dtd.promise();
			
		};

		dPro.confirm = function(){
			window.popupclose(this.__id, this.__fadeID);
			this.dtd.resolve();

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

		function bind (fn, context){
			return function(){
				fn.apply(context, [].slice.apply(arguments));
			};
		}
		

		var hashKey = window.btoa || function(key){
				
			var code = "";
			for(var i = 0, j = key.length; i < j; i++){
				code+= key.chatCodeAt(i);
			}
			return code;
		};
		 

		function generateYear(){
			var aYear = [];
			aYear.push((new Date()).getFullYear());

			for(var i = 0; i < 20; i++){
				aYear.push(aYear[i] + 1);
			}	
			return aYear;
		}


		if(!Object.keys){

			Object.keys = function(){
				var hasOwnProper = Object.prototype.hasOwnProperty;
				return function(obj){
					if(typeof obj !== 'object' || obj === null){
						throw new TypeError("arguments should be an non-null Object");
					}

					var _aResult = [];
					for(var attr in obj){
						if(hasOwnProper.call(obj, attr)){
							_aResult.push(attr);
						}
					}

					return _aResult;
				};
			};
		}


})(window.jQuery,window._,window.ACC);


