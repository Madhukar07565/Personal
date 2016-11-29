ACC.hotel= {
	bindAll: function ()
	{
		$('#modifybtn').click(function(){
			$('#hotelDetailModifySearch').show();
			$('.h_tab_ser').hide();
		});
		$('.hotelDetailShowMore').click(function(){
			if($(this).hasClass("hideViews")){
				$(this).prevAll('div.dN').hide();
				$(this).text(' More reviews').removeClass('hideViews');
			}else{
				$(this).prevAll('div').show();
				$(this).text('Hide reviews').addClass('hideViews');
			}
		});
		$("body").delegate(".selectRoom","click", function(){
			var formElementExpressions = '';
			var widgetAndFacetSearchJson = $("#widgetAndFacetSearchJson").val();
			var productCode = $(this).next("input[type='hidden']").val();
			$(['widgetAndFacetSearchJson','CSRFToken']).each (function (i, e) {
				formElementExpressions += '<input name="#" type="hide" />'.replace('#', e);
			});
			var formExpression = '<form action="'+ACC.config.encodedContextPath+'/p/hotel/'+productCode+'/query" method="post"></form>';
			$form = $(formExpression).append($(formElementExpressions));
			$form.find('input[name=widgetAndFacetSearchJson]').val(widgetAndFacetSearchJson);
			$form.find('input[name=CSRFToken]').val(ACC.config.CSRFToken);
			$form.appendTo('body').submit();
		});
		$('#shtroomsAndRates').on('click', function(e)  {
		    var currentAttrValue = $(this).attr('href');
		    $('.tabs ' + currentAttrValue).show().siblings().hide();
		 
		    // Change/remove current tab to active
		    $('#roomsAndRates').parent('li').addClass('sel').siblings().removeClass('sel');
		                goToElementWithoutCheck('selectionTable')
		    e.preventDefault();
		});
		
		$('#shtamenities').on('click', function(e)  {
	        var currentAttrValue = $(this).attr('href');
	                               
	        $('.tabs ' + currentAttrValue).show().siblings().hide();
	        // Change/remove current tab to active
	        $('#test').parent('li').addClass('sel').siblings().removeClass('sel');
	        goToElementWithoutCheck('selectionTable')
	        e.preventDefault();
		});
		
		$(".comparePanel").change(function(){
			var hotelId = $(this).data("id");
			if(hotelIds.length<3){
				if(this.checked){
					hotelIds.push(hotelId);
					var parent = document.getElementById("search_results");
					document.getElementById("show_hotel_panel_top").style.display = "block";
					document.getElementById("compareTab").className = "sel";
					$(".footerContactDetail").addClass("activated");
					var a = document.createElement("div");
					a.className = "clearfix col_3 pL0 searchedResult"
					a.id = "searchedResult" + hotelId
					parent.appendChild(a);
					
					var $targetparent = $(this).parents("article.singleHotel");
					var img = $targetparent.find("img.p_pic").first().attr("src");
					var price = $targetparent.find(".priceTable .totalPrice").html();
					var star = $targetparent.find("input[name='hotelRating']").val();
					a.innerHTML = '<div class="fL mR10 mT5 mB5" style="height:62px;width:74px;"> <img src='+img+'> </div><div class="fL"><div class="fcWht">'
					+ '</div><div class="fcWht fS11">'+star+' star</div><div class="clearfix"><div class="fS22 fW400 fL fcWht"><span>'+price+'</span></div></div></div>';
					if (compHotels > 1)
						document.getElementById("compareButton").style.display = "block";
					compHotels++;
					document.getElementById("compareCount").innerHTML = compHotels;
					$("#compareCount").addClass("sel")
				}else{
					var index = hotelIds.indexOf(hotelId);
					if(index > -1){
						hotelIds.splice(index, 1);
					}
					document.getElementById("searchedResult" + hotelId).remove();
					compHotels--;
					document.getElementById("compareCount").innerHTML = compHotels;
					if (compHotels < 3)
						document.getElementById("compareButton").style.display = "none";
					if (compHotels == 0) {
						document.getElementById("show_hotel_panel_top").style.display = "none";
						document.getElementById("compareTab").className = "";
						$(".footerContactDetail").removeClass("activated");
						$("#compareCount").removeClass("sel")
					}
				}
			}
		});
	},
	popup:function(viewContent,fade){
		var htmlheight = document.body.parentNode.scrollHeight;
		var myHeight = document.body.parentNode.clientHeight;
		document.getElementById(fade).style.height = htmlheight+"px";
		document.getElementById(fade).style.display = 'block';
		document.getElementById(fade).style.overflow= 'auto';
		$("#"+viewContent).show();
		window.scroll(0,0);
	},
	goToElementWithoutCheck:function(id) {
        $('html,body').animate({
                        scrollTop : $("#" + id).offset().top - 100
        }, 'slow');
	},
	compareViewList:function(){
		$.ajax({
	        type: 'get',
	        url: ACC.config.encodedContextPath+'/search/comparehotel/ajax',
	        traditional:true,
	        data:{"hotelIds":hotelIds},
	        dataType:"json",
	        success: function(data)
	        {
	        	ractiveHotel.compare.set("hotelList",data);
	        	ACC.hotel.popup("compareHotels", "fade");
				closeComparePanel('show_hotel_panel_top');
	        }
		});
	}
	 
}
var hotelIds = new Array();
$(document).ready(function() {
	ACC.hotel.bindAll();
});

$(document).ready(
		function() {
			$('.pagination').jqPagination(
					{
						current_page : 1,
						paged : function(page) {
							var url = ACC.config.encodedContextPath
									+ "/search/hotel/facetSearch/ajax";
							var jsonParamObj = {
								"topSearchDataModel" : ractiveTopHotel.search
										.get("history.topSearchDataModel"),
								"facetViewModel" : ractiveTopHotel.facet
										.get("facetSearch"),
								"pageNumber" : page
							}
							getPagingData(url, jsonParamObj, "post",
									pagingSetData);
						}
					});
			function pagingSetData(data) {
				ractiveTopHotel.gridresult.set("hotelList", data.result);
			}
		});