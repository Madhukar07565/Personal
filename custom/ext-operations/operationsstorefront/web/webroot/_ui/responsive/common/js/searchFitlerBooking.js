$(document).ready(function () {
	$( "#subCategSelect" ).change(function() {
		//this does not seems to be a good practice. Revisit 
		console.log("here we go"+ $('#subCategSelect').val());
		var selectedProductSubCategory =  $('#subCategSelect').val();
		setSearchFields(selectedProductSubCategory);
	});
	setSearchFields($('#subCategSelect').val());
});

function setSearchFields(subCategorySelection) {
	console.log("inside"+ subCategorySelection);
	if(subCategorySelection === 'Flights') { 
		$('#flightSearchFields').css("visibility", "visible");
		$('#flightSearchFields').css("display", "initial");
		$('#accomodationSearchFields').css("visibility", "hidden");
		$('#accomodationSearchFields').css("display", "none");
	}
	else if(subCategorySelection === 'Hotels') {
		$('#accomodationSearchFields').css("visibility", "visible");
		$('#accomodationSearchFields').css("display", "initial");
		$('#flightSearchFields').css("visibility", "hidden");
		$('#flightSearchFields').css("display", "none");
	}
	else {
		$('#flightSearchFields').css("visibility", "visible");
		$('#flightSearchFields').css("display", "initial");
		$('#accomodationSearchFields').css("visibility", "hidden");
		$('#accomodationSearchFields').css("display", "none");
	}
}

//setting hidden property values
$(document).ready(function () {
	$( "#saveSearchButton" ).click(function() {
	  //set hidden attributes 
	  var searchName = $('#saveSearchName').val();
	  var defaultSearch = false;
	 if($('#saveSearchDefault').is(':checked')) {
	 console.log("yes");
	 defaultSearch = true;
	 }
	 else {
	 console.log("no");
	 }
	  //set hidden attribute 
	  $( "#hiddenSavedQueryName" ).val(searchName);
	    $( "#hiddenDefaultSearch" ).val(defaultSearch);
	})
	});

/*checking user entered Saved Query name*/
$(document).ready(function(){
    $("#saveSearchName").blur(function(){
    	checkSavedQueryName();
       
    });
});
function checkSavedQueryName() {
	var name = $("#saveSearchName").val();
	
	if(name){
		$.ajax({
			type : "GET",
			contentType : "application/json",
			url : ACC.config.contextPath+'/operations/en/order/check-saved-query',
			data : {name: name},
			dataType : 'json',
			success : function(result) {
				console.log("SUCCESS: ", result);
				//display(result);
				if(result=='1'){
					bootbox.dialog({
						message: "This name already exists. Please enter another",
						buttons: {
							ok: {
								label: "Ok",
								callback: function () {
									// Do nothing
								}
							}
						}
					});
				}//if
				else{
					console.log('Entered Saved query name not existed.');
				}
			},
			error : function(e) {
				console.log("ERROR: ", e);
				display(e);
			}
		});
	}else{
		console.log('user not entered any name');
	}
}


/*Getting product sub categories based on main category selection*/
$(document).ready(function () {
	$( "#categSelect" ).change(function() {
		//this does not seems to be a good practice. Revisit 
		console.log($('#categSelect').val());
    var selectedCategroy = {categoryCode:$('#categSelect').val()}        
    setSubCategory(selectedCategroy);
	});
  setSubCategory($('#categSelect').val());
});

function setSubCategory(categVal) {
//$.ajax = ajax_response('[{"code": "E00Indigo","name": "Indigo"},{"code": "C001ST005","name": "Caravan"},{"code": "C001ST006","name": "Cruise"}]', true);
//make ajax call 
    $.ajax({
					type: "GET",
					url: ACC.config.contextPath+'/operations/en/order/product-sub-categories',
					data:categVal,
					success: function (results) {
						//alert("result : "+results);
						console.log(results);
						//var subCateg = $.parseJSON(results);
            $("#subCategSelect").empty();
            var options = $("#subCategSelect");
            
$.each(results, function() {
    options.append($("<option />").val(this.name).text(this.name));
});

//call sub categ filed selection call
setSearchFields($('#subCategSelect').val());
					},
					error: function() {
					
					}
    });
};



