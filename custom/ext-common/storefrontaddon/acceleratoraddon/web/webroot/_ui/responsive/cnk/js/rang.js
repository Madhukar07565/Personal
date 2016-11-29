if($().slider){
		//slider range
		$( "#slider-range1" ).slider({
		range: true,
		min: 0,
		max: 100000,
		values: [ 0, 30000 ],
		slide: function( event, ui ) {
		$( "#amount" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
		}
		});
		$( "#amount" ).val( $( "#slider-range1" ).slider( "values", 0 ) +" - " + $( "#slider-range1" ).slider( "values", 1 ) );
		
		$( "#slider-day" ).slider({
			range: true,
			min: 4,
			max: 15,
			values: [ 3, 10 ],
			slide: function( event, ui ) {
			$( "#day" ).val(ui.values[ 0 ] + "D - " + ui.values[ 1 ]+"D" );
			}
			});
			$( "#day" ).val( $( "#slider-day" ).slider( "values", 0 ) +"D - " + $( "#slider-day" ).slider( "values", 1 )+"D" );
			
		$( "#slider-day1" ).slider({
			range: true,
			min: 4,
			max: 15,
			values: [ 3, 10 ],
			slide: function( event, ui ) {
			$( "#day1" ).val(ui.values[ 0 ] + "D - " + ui.values[ 1 ]+"D" );
			}
			});
			$( "#day1" ).val( $( "#slider-day1" ).slider( "values", 0 ) +"D - " + $( "#slider-day1" ).slider( "values", 1 )+"D" );	
		
		$( "#budget-slider-range1" ).slider({
			range: true,
			min: 30000,
			max: 100000,
			values: [ 50000, 75000 ],
			slide: function( event, ui ) {
			$( "#budget-amount" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
			}
			});
			$( "#budget-amount" ).val( $( "#budget-slider-range1" ).slider( "values", 0 ) +" - " + $( "#budget-slider-range1" ).slider( "values", 1 ) );
		
		   }	