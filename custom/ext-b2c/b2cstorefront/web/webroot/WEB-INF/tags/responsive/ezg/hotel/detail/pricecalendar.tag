<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="hotelData" required="true" type="com.cnk.travelogix.common.facades.product.data.hotel.HotelData" %>
<article class="tabContainer pD20 dN" id="priceCalendar">
			<h4>Price calendar</h4>
			<div class="clearfix w100pcnt">
				<ul class="row mB10">
					<li class="fL mL20 mR15"><label>Select Room Type <select>
								<option value="Economy">Select Room Type</option>
								<option value="Economy">Double deluxe</option>
								<option value="Economy">Single deluxe</option>
								<option value="Economy">Triple deluxe</option>
						</select>
					</label></li>
					<li class="fL mR15"><label>Select Month <select>
								<option value="march">Select Month</option>
								<option value="march">March 2015</option>
								<option value="jan">January 2015</option>
								<option value="feb">February 2015</option>
						</select>
					</label></li>
				</ul>
				<span class="clearfix fR mT10 mB10">Average / Night</span>
			</div>

			<!-- calender view start -->
			<div class="row mB40 mT10">

				<div class="col_12 clearfix">
					<div class="pD10 bkgLitGrn" style="height:50px;">
						<div class="custom-header clearfix header">
							<div class="custom-month-year tC fS24">
								<span id="custom-month" class="custom-month txtClrWht"></span> <span
									id="custom-year" class="custom-year txtClrWht"></span>
								<nav>
									<span id="custom-prev" class="custom-prev"></span> <span
										id="custom-next" class="custom-next"></span>
								</nav>
							</div>
						</div>
					</div>
					<div id="calendar" class="fc-calendar-container"></div>
				</div>

			</div>
			<!-- calender view end -->
		</article>
<script type="text/javascript">
$(function(){
	$.Calendario.prototype._getBody = function() {
		var d = new Date( this.year, this.month + 1, 0 ),
		// number of days in the month
		monthLength = d.getDate(),
		firstDay = new Date( this.year, this.month, 1 );
		
		// day of the week
		this.startingDay = firstDay.getDay();

		var html = '<div class="fc-body"><div class="fc-row">',
		// fill in the days
		day = 1;
		//change today highlight,today means selected checkin date;
		var checkinDate = ractiveHotel.mdfSearch.get('mdfSearch.checkInDate');
		if(checkinDate){
			this.today = new Date(checkinDate);
		}
		// this loop is for weeks (rows)
		for ( var i = 0; i < 7; i++ ) {
	
			// this loop is for weekdays (cells)
			for ( var j = 0; j <= 6; j++ ) {
	
				var pos = this.startingDay - this.options.startIn,
					p = pos < 0 ? 6 + pos + 1 : pos,
					inner = '',
					today = this.month === this.today.getMonth() && this.year === this.today.getFullYear() && day === this.today.getDate(),
					content = '';
				
				if ( day <= monthLength && ( i > 0 || j >= p ) ) {
	
					inner += '<span class="fc-date">' + day + '</span>';
					//add customize content here
					
					
					inner +='<div><span class="fS18 fW400 w100pcnt fL"><a href="###" class="calPrice"><span class="rupee">Rs</span>3,000</a></span></div>';
					inner +='<div><span class="faq_sml_icon calOffer"></span></div>';
					
					
					inner += '<span class="fc-weekday">' + this.options.weekabbrs[ j + this.options.startIn > 6 ? j + this.options.startIn - 6 - 1 : j + this.options.startIn ] + '</span>';
	
					// this day is:
					var strdate = ( this.month + 1 < 10 ? '0' + ( this.month + 1 ) : this.month + 1 ) + '-' + ( day < 10 ? '0' + day : day ) + '-' + this.year,
						dayData = this.caldata[ strdate ];
	
					if( dayData ) {
						content = dayData;
					}
	
					if( content !== '' ) {
						inner += '<div>' + content + '</div>';
					}
					++day;
				}
				else {
					today = false;
				}
				var cellClasses = today ? 'fc-today ' : '';
				if( content !== '' ) {
					cellClasses += 'fc-content';
				}
				html += cellClasses !== '' ? '<div class="' + cellClasses + '">' : '<div>';
				html += inner;
				html += '</div>';
			}
			// stop making rows if we've run out of days
			if (day > monthLength) {
				this.rowTotal = i + 1;
				break;
			} 
			else {
				html += '</div><div class="fc-row">';
			}
		}
		html += '</div></div>';
		return html;
		}
	if ($().calendario && $('#calendar').length) {
		var cal = $('#calendar').calendario({
					onDayClick : function($el, $contentEl, dateProperties) {
						for ( var key in dateProperties) {
							console.log(key + ' = ' + dateProperties[key]);
						}
					},
					caldata : codropsEvents
				}),
		$month = $( '#custom-month' ).html( cal.getMonthName() );
		$year = $( '#custom-year' ).html( cal.getYear() );
		console.log(cal);
		$('#custom-next').on('click', function() {
			cal.gotoNextMonth(updateMonthYear);
		});
		$('#custom-prev').on('click', function() {
			var currentYear = cal.today.getFullYear();
			var currentMonth = cal.today.getMonth()+1;
			var selectedYear = cal.year;
			var selectedMonth = cal.month;
			if(currentYear==selectedYear){
				if(selectedMonth<currentMonth){
					return false;
				} 
			}
			cal.gotoPreviousMonth(updateMonthYear);
		});
		$('#custom-current').on('click', function() {
			cal.gotoNow(updateMonthYear);
		});
		function updateMonthYear() {
			$month.html(cal.getMonthName());
			$year.html(cal.getYear());
		}
	}
	
	$("body").delegate(".calPrice","click",function(){
		ractiveHotel.submitForm();
	});
	
	$("body").delegate(".calOffer","click",function(){
		alert("special offer info");	
	});
});
</script>