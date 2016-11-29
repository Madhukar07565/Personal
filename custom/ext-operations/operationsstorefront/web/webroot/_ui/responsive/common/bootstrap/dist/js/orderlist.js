var orderllistData = {
    "orders": [

        {
            "time": "15/06/2015 10:30",
            "reference_no": "EZR-123456",
			"ref_url": "http://google.com",
            "client_detail": {
				"name": "AKG Global",
				"type": "B2C",
				"category": "Travel Agent",
				"sub_category": "TA",
				"point_of_sale": "Website"				
			},
			"company_details": "EZeego 1 Market - India SBU/BU",
			"assign": "Tom Jones"
        },

        {
            "time": "15/03/2015 10:30",
            "reference_no": "EZR-0887696",
			"ref_url": "http://google.com",
            "client_detail": {
				"name": "Trident Travel",
				"type": "-",
				"category": "Travel Agent",
				"sub_category": "TA",
				"point_of_sale": "Website"				
			},
			"company_details": "EZeego 1 Market - India SBU/BU",
			"assign": "-"
        },

        {
            "time": "11/06/2015 10:30",
            "reference_no": "EZR-308483",
			"ref_url": "http://google.com",
            "client_detail": {
				"name": "View Tours",
				"type": "B2C",
				"category": "-",
				"sub_category": "-",
				"point_of_sale": "Website"				
			},
			"company_details": "EZeego 1 Market - India SBU/BU",
			"assign": "-"
        }
    ]
}


var ORDERLIST_METHOD ={

        handlerData:function(){

            var templateSource   = $("#orderList-template").html(),

                template = Handlebars.compile(templateSource),

                orderlistHTML = template(orderllistData);

           $('#my-container').html(orderlistHTML);
            console.log($("#orderList-template"))
        }

};

$(document).ready(function(){

    ORDERLIST_METHOD.handlerData();
});

Handlebars.registerHelper("counter", function (index){
    return index + 1;
});

Handlebars.registerHelper('link', function(my_link, textShown) {
	var result = "<a href='" + my_link + "'>'"+textShown+"'</a>";
	return new Handlebars.SafeString(result);
});