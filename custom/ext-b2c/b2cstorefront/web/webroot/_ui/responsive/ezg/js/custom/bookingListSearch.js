(function(){
	"use strict";

	var __initData = {
		bookingID: null,
		passengerName: null,
		productName: null,
		bookingStatus: null,
		productType: null
	};

	var orderMeta = document.getElementById("orderDataJson");
	
	if(!orderMeta){
		return ;
	}

	var oOrderList = orderMeta.getAttribute("value")? JSON.parse(orderMeta.getAttribute("value")):[];
	var oPagination = initPaginData(oOrderList.pagination);
	var aOrderList = initOrderList(oOrderList);

	var queryComponent = new Ractive({
      el: '.query-section',
      template: '#queryTemplate',
      data:{
		queryModel: __initData,
		paginModel: oPagination
	  }
	
	});

	queryComponent.on({
		'search':handleSearch,
		'prev next':handlePaging
	});

	$(function(){
			$("#datepicker-from, #datepicker-to").datepicker({
			dateFormat: "dd/mm/yy",
			numberOfMonths: 2,
			maxDate: new Date(),
			onSelect:function(date, ins){
						
			}
		});
	
	}
);

	function handlePaging(e){
			e.original.preventDefault();
			if([].indexOf.call(e.node.classList, 'page-enable')>=0){
				var oPage = this.get('paginModel');	
				handleSearch.call(this, e, e.name==='prev'?oPage.currentPage -1 :oPage.currentPage +1 );				
			}
	}

	function handleSearch(e){

		var oData = this.get("queryModel");

		if(arguments.length > 1){
			oData.page = arguments[1];
		}
		$.when($.ajax({
			url: ACC.config.contextPath+'/my-account/bookList/search', 
			type:'GET',
			dataType:'json',
			data:this.get("queryModel")

		})).done(function(oData){

			if(getType.isArray(oData.results)){
				oPagination =initPaginData( oData.pagination);
				listComponent.set("listModel", initOrderList(oData));
				queryComponent.set("paginModel", oPagination);

			}
		}).fail(function(error){
			console.log(error);

		});
	}


	var listComponent = new Ractive({
      el: '.list-section',
      template: '#listTemplate',
      data: { listModel: aOrderList,
			formatterWithYear: function(date){
				var aDate =  new Date(date).toString().split(' ');
				return aDate[2] + " " + aDate[1] + ". " +   aDate[3];
			   },
			  formatterDate: function(date){
				var aDate =  new Date(date).toString().split(' ');
				return aDate[2] + " " + aDate[1] + ". " +  aDate[0] +". " ;
			  }
	  
	  } 
								   
	});

	function initOrderList(oList){
		var aList = oList.results;

		if(!aList){
			return [];
		}
		 aList.forEach(function(order){
			
			 order.entries.forEach(function(group){
					if(group.orderEntryType !== "HOTEL"){
						group.entries.forEach(function(flight){
							
							flight.entries.forEach(function(ticket){
								var _type = ticket.orderEntryInfoData.ticketDetailInfoData.passengerType;
								if(_type.code ==="ADULT"){
									flight.adultCount?flight.adultCount++:flight.adultCount = 1 ;
								}else if(_type.code ==="CHILD"){
									flight.childCount?flight.childCount++ : flight.childCount = 1 ;

								}
							});
						});
					}
				});
		});
		return aList;
	
	}

	function initPaginData(oPagin){

		oPagin.isFirst = oPagin.currentPage === 0;
		oPagin.isLast = oPagin.currentPage + 1 === oPagin.numberOfPages;
		oPagin.from = oPagin.currentPage * oPagin.pageSize + 1;
		oPagin.to = oPagin.isLast? oPagin.totalNumberOfResults :  (oPagin.currentPage+1) * oPagin.pageSize;

		return oPagin;
	}


	var aTypes =['Array', 'String', 'Function'];

	for(var i = 0, j =aTypes.length; i < j; i++ ){
	  
		getType["is" +aTypes[i]] = (function(_type){

			return function(o){
				return  getType(o, _type);
			};

			
		})(aTypes[i]);
	}
	
	function getType(x, target ){
	
	 return Object.prototype.toString.call(x).slice(8).slice(0,-1) === target;
	}
	
})();
