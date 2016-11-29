<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="booking" tagdir="/WEB-INF/tags/responsive/booking" %>

<script type="text/javascript">
//console.log("Hi");
/* $("#saveButton").click(function(object){
	console.log("Hellosss");
//	console.log($('#you').val());
//	console.log($('#timerID').val());
	});
 */

 $( "#saveButton" ).on('click', function() { 
	 alert( "Handler for .click() called." ); 
	 });
//Hassahdk
 </script>

<body class="page-homepage pageType-ContentPage template-pages-layout-landingLayout2Page pageLabel-homepage language-en"> 
  <main data-currency-iso-code="USD">
    <header class="main-header main-header-md">
      <div class="nav-top hidden-xs hidden-sm">
        <div class="container-fluid">
          <div class="row">
            <div class="col-sm-12 col-md-2">
              <small>Booking Details</small>
			<ul class="pager">
  			</ul>	
            </div>
            <div class="col-sm-12 col-md-3 comm">
              <small>External Communication</small>
              <div class="btn-group btn-group-sm" role="group" aria-label="...">
                <button type="button" class="btn btn-default">
                  <span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>
                  <a href="#"><span class="badge">42</span></a>
                </button>
                <button type="button" class="btn btn-default">
                  <span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>
                  <a href="#"><span class="badge">4</span></a>
                </button>
                <button type="button" class="btn btn-default">
                  <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                  <a href="#"><span class="badge">2</span></a>
                </button>
                <button type="button" class="btn btn-default">
                  <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                </button>
              </div>
            </div>
            <div class="col-sm-1"></div>
            <div class="col-sm-12 col-md-2 comm">
              <small>Internal Communication</small>
              <br>
              <div class="btn-group btn-group-sm" role="group" aria-label="...">
                <button type="button" class="btn btn-default">
                  <span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>
                  <a href="#"><span class="badge">42</span></a>
                </button>
              </div>
            </div>            
            <div class="col-sm-12 col-md-1">
              <div class="btn-group btn-group-sm" role="group" aria-label="...">
                <small><a>Ezeego1</a> &nbspIndia</small>
              </div>
            </div>
			<div class="col-sm-12 col-md-2">
            <div class="col-sm-12 col-md-2">
              <div class="container">
                <div class="row">
                  <div class="col-sm-12 col-md-3">
                    <small>Mr AnilKumar</small>
                  </div>
                </div>
                <div class="row">
                  <div class="col-sm-12 col-md-4">
                    <span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>
                    <small>anilkumar@gmail.com</small>
                  </div>
                </div>
                <div class="row">
                  <div class="col-sm-12 col-md-4">
                    <span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>
                    <small>+91 7453625373</small>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      </div>
    </header>
   

<div class="container-fluid section1">
 <div id="productTabs">
	 
	<div class="tabHead"><spring:theme code="cnk.booking.overview" /></div>
	<div class="tabBody"><booking:bookingOverviewTab/></div>
	
	<div class="tabHead"><spring:theme code="cnk.booking.documentation" /></div>
	<div class="tabBody"><booking:bookingDocumentationTab/> </div>
	
	<div class="tabHead"><spring:theme code="cnk.booking.todotasks" /></div>
	<div class="tabBody"><booking:bookingToDoTaskTab/></div>
	
 </div> 
</div>

<div class="container-fluid section2">
      <div class="row">
        <ul class="nav nav-tabs" style="display: inline;">
          <li class="active"><a data-toggle="tab" href="#productSummary">Product Summary</a>
          </li>
        </ul>
        <div class="tab-content">
          <div id="productSummary" class="tab-pane fade in active">
            <ul class="list-inline scroller">
              <div class="list-inline-item list-group">
                <span class="glyphicon glyphicon-plane"  aria-hidden="true"></span>
                <button class="active">
                <div class="itemCell">
                    <div>
                      <span class="glyphicon glyphicon-plane"  aria-hidden="true"></span>
                    <p>DEL - BOM</p>
                    <p>25 Sep 14 12:00 PM</p>
                      <p>Mr A Kumar x 2 | 2 Adults</p>
                    </div> 
                  </div>
                  <li class="divider"></li>
                  <div class="itemCell bottomCell">
                    <div>
                      <span class="glyphicon glyphicon-plane"  aria-hidden="true"></span>
                    <p>BOM - DEL</p>
                    <p>22 Sep 14 10:00 AM</p>
                      <p>Mr A Kumar x 3 | 2 Adults, 1 Child</p>
                    </div> 
                </div>
                </button>
              </div>
              <li class="divider"></li>
              <div class="list-inline-item list-group">
                <span class="glyphicon glyphicon-bed"  aria-hidden="true"></span>
                <button>
                <div class="itemCell">
                    <div>
                      <span class="glyphicon glyphicon-bed"  aria-hidden="true"></span>
                    <p>Hotel Hilton</p>
                    <p>New Delhi | 3 nights | 1 Triple Room</p>
                      <p>Mr A Kumar x 3 | 2 Adults, 1 Child</p>
                    </div> 
                </div>
                </button>
              </div>
              <li class="divider"></li>
              <div class="list-inline-item list-group">
                <span class="glyphicon glyphicon-transfer"  aria-hidden="true"></span>
                <button>
                <div class="itemCell">
                    <div>
                      <span class="glyphicon glyphicon-transfer"  aria-hidden="true"></span>
                    <p>Mumbai - Lonavala</p>
                    <p>23 Sep 14 07:30 AM</p>
                      <p>Mrs R Shah x 2 | 2 Adults</p>
                    </div> 
                </div>
                </button>
              </div>
              <li class="nav-divider"></li>
              
            </ul>
            <div class="list-group" style=" display: inline-block">
                <ul><li class="list-group-item">
                  <p>Total Invoice = Rs. 45, 900</p>
                </li>
              <li class="list-group-item">
                  <p>Total Collection = Rs. 20, 900</p>
                </li>
              <li class="list-group-item">
                  <p>Total Outstanding = Rs. 25,000</p>
                </li></ul>
              </div>
          </div>
        </div>
      </div>
    </div>
    
<div class="container-fluid section3">
      <div class="row">
        <div class="tab-content">
          <div id="clientPaymentDetails" class="tab-pane fade in active">
<!-- End Flight Details  & Start Client Payment Details -->
									
									<!-- 	Started -->
										
												<div class="passenger-details panel-body ">
													<div id="list1 " class="travel-list auto-overflow active ">
														<div class="table-responsive ">
															<table cellpadding="0 " cellspacing="0 " border="1 " valign="top " class="table-main table-fixed " width="3890 ">
																<thead>
																	<tr class="three-column ">
																		<th colspan="9 "><label>Product &amp; Passenger Information</label></th>
																		<th colspan="7 " class="main-spec-info "><label>Other Special Information</label>
																			<div class="float-right exp-collapse " data-item="spec-info "><i class="glyphicon glyphicon-menu-left "></i></div>
																		</th>
																		<th colspan="15 " class="main-price-dtl "><label>Price Details</label>
																			<div class="float-right exp-collapse " data-item="price-dtl "><i class="glyphicon glyphicon-menu-left "></i></div>
																		</th>
																		<th rowspan="3 "><label>Action</label></th>
																	</tr>
																	<tr>
																		<th rowspan="2 ">Passenger Name</th>
																		<th rowspan="2 ">Flight Details</th>
																		<th rowspan="2 ">Departure-Arrival Details</th>
																		<th rowspan="2 ">Class-RBD-Fare Basis-Ticket No</th>
																		<th rowspan="2 ">GDS PNR</th>
																		<th rowspan="2 ">Airline PNR</th>
																		<th rowspan="2 ">Booking Status</th>
																		<th rowspan="2 ">Time Limit Expiry Date</th>
																		<th rowspan="2 ">Amendment/Cancellation Date</th>

																		<th rowspan="2 " class="spec-info ">D.O.B.</th>
																		<th rowspan="2 " class="spec-info ">Meal Preference</th>
																		<th rowspan="2 " class="spec-info ">Special Request</th>
																		<th rowspan="2 " class="spec-info ">Flight Seat No.</th>
																		<th rowspan="2 " class="spec-info ">Credential Name / PCC</th>
																		<th rowspan="2 " class="spec-info ">Ticketing PCC</th>
																		<th rowspan="2 " class="spec-info ">Inventory</th>

																		<th rowspan="2 " class="price-dtl ">Source Supplier</th>
																		<th rowspan="2 " class="price-dtl ">Enabler Supplier</th>
																		<th rowspan="2 " class="price-dtl ">Refundable/Non-Refundable</th>
																		<th colspan="6 " class="price-dtl ">Selling Price Details</th>
																		<th rowspan="2 " class="price-dtl ">Actual Margin Amount</th>
																		<th colspan="4 " class="price-dtl ">Supplier Pricing Details</th>
																		<th rowspan="2 " class="price-dtl ">Offers Applied</th>
																	</tr>
																	<tr>
																		<th class="price-dtl ">Total Selling Price</th>
																		<th class="price-dtl ">Commission</th>
																		<th class="price-dtl ">Discount Value</th>
																		<th class="price-dtl ">Total Net Selling Price</th>
																		<th class="price-dtl ">Company Cancellation Charges</th>
																		<th class="price-dtl ">Company Amendment Charges</th>
																		<th class="price-dtl ">Net Payble to Supplier</th>
																		<th class="price-dtl ">Supplier Cancellation Charges</th>
																		<th class="price-dtl ">Supplier Amendment Charges</th>
																		<th class="price-dtl ">Total Net Payble to Supplier</th>
																	</tr>
																</thead>
																<tbody>
																
																	<tr>
																		
																		<td rowspan={{this.passenger_name.rowspan}}>{{this.passenger_name.data}}</td>
																	
																		<td rowspan={{this.flight_details.rowspan}}>
																			<div class="block-info ">
																				<label>Sector</label>
																				<span></span>
																			</div>
																			<div class="block-info ">
																				<label>Flight Number</label>
																				<span><input type="text " value={{this.flight_details.flight_number}} class="form-control "></span>
																			</div>
																			<div class="block-info ">
																				<label>(Onward)</label>
																			</div>
																		</td>
																		{{/if}} {{#if this.departure_arrival_details}}
																		<td rowspan={{this.departure_arrival_details.rowspan}} class="set-date ">
																			<label>Departure</label>
																			<div class="date-time ">
																				<input type="date " value={{this.departure_arrival_details.departure1}} class="form-control ">
																				<input type="date " value={{this.departure_arrival_details.departure2}} class="form-control ">
																			</div>
																			<label>Arrival</label>
																			<div class="date-time ">
																				<input type="date " value={{this.departure_arrival_details.arrival1}} class="form-control ">
																				<input type="date " value={{this.departure_arrival_details.arrival2}} class="form-control ">
																			</div>
																		</td>
																		<td rowspan={{this.class_RBD_fareBasis_ticketNo.rowspan}}>{{this.class_RBD_fareBasis_ticketNo.data}}</td>
																		{{/if}} {{#if this.GDS_PNR}}
																		<td rowspan={{this.GDS_PNR.rowspan}}>{{this.GDS_PNR.data}}</td>
																		{{/if}} {{#if this.airline_PNR}}
																		<td rowspan={{this.airline_PNR.rowspan}}>{{this.airline_PNR.data}}</td>
																		{{/if}} {{#if this.booking_status}}
																		<td rowspan={{this.booking_status.rowspan}}>
																			<select class="form-control ">
                                                        {{#each this.booking_status.data}}
                                                        <option>{{this}}</option>
                                                        {{/each}}
                                                    </select>
																		</td>
																			
																		<!--Saood-->
																		<td rowspan={{this.timeLimit_expiry_date.rowspan}} class="date-time set-date" >
																			<input type="date " value="12/09/2012" class="form-control" id="timerID">
																		</td>
																		
																		
																		
																		
																		
																		
																		
																		
																		{{/if}} {{#if this.amendment_cancellation_date}}
																		<td rowspan={{this.amendment_cancellation_date.rowspan}}> {{this.amendment_cancellation_date.data}} </td>
																		{{/if}} {{#if this.DOB}}
																		<td rowspan={{this.DOB.rowspan}} class="spec-info set-date "><input type="date " value={{this.DOB.data}} class="form-control opaque "></td>
																		{{/if}} {{#if this.meal_preference}}
																		<td rowspan={{this.meal_preference.rowspan}} class="spec-info ">
																			<select class="form-control opaque ">
                                                        {{#each this.meal_preference.data}}
                                                        <option>{{this}}</option>
                                                        {{/each}}
                                                    </select>
																		</td>
																		{{/if}} {{#if this.special_request}}
																		<td rowspan={{this.special_request.rowspan}} class="spec-info "><input type="text " value="{{this.special_request.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if this.flight_seat_no}}
																		<td rowspan={{this.flight_seat_no.rowspan}} class="spec-info ">{{this.flight_seat_no.data}}</td>
																		{{/if}} {{#if this.credential_name}}
																		<td rowspan={{this.credential_name.rowspan}} class="spec-info ">{{this.credential_name.data}}</td>
																		{{/if}} {{#if this.ticketing_PCC}}
																		<td rowspan={{this.ticketing_PCC.rowspan}} class="spec-info ">
																			<select class="form-control opaque ">
                                                        {{#each this.ticketing_PCC.data}}
                                                        <option>{{this}}</option>
                                                        {{/each}}                                                        
                                                    </select>
																		</td>
																		{{/if}} {{#if this.inventory}}
																		<td rowspan={{this.inventory.rowspan}} class="spec-info ">{{this.inventory.data}}</td>
																		{{/if}} {{#if this.source_supplier}}
																		<td rowspan={{this.source_supplier.rowspan}} rowspan="3 " class="price-dtl ">{{this.source_supplier.data}}</td>
																		{{/if}} {{#if this.enabler_supplier}}
																		<td rowspan={{this.enabler_supplier.rowspan}} rowspan="3 " class="price-dtl ">{{this.enabler_supplier.data}}</td>
																		{{/if}} {{#if this.refundable_nonRefundable}}
																		<td rowspan={{this.refundable_nonRefundable.rowspan}} class="price-dtl ">{{this.refundable_nonRefundable.data}}</td>
																		{{/if}} {{#if this.total_selling_price}}
																		<td rowspan={{this.total_selling_price.rowspan}} class="price-dtl "><a href="#. ">{{this.total_selling_price.data}}</a></td>
																		{{/if}} {{#if this.commission}}
																		<td rowspan={{this.commission.rowspan}} class="price-dtl "> {{this.commission.data}} </td>
																		{{/if}} {{#if this.discount_value}}
																		<td rowspan={{this.discount_value.rowspan}} class="price-dtl "> {{this.discount_value.data}} </td>
																		{{/if}} {{#if this.total_net_selling_price}}
																		<td rowspan={{this.total_net_selling_price.rowspan}} class="price-dtl ">{{this.total_net_selling_price.data}}</td>
																		{{/if}} {{#if this.company_cancellation_charges}}
																		<td rowspan={{this.company_cancellation_charges.rowspan}} class="price-dtl "><input type="text " value="{{this.company_cancellation_charges.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if this.company_amendment_charges}}
																		<td rowspan={{this.company_amendment_charges.rowspan}} class="price-dtl "><input type="text " value="{{this.company_amendment_charges.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if_eq this.actual_margin_amount 'INR 4000'}}
																		<td rowspan={{this.actual_margin_amount.rowspan}} class="price-dtl ">{{this.actual_margin_amount.data}}
																			<i class="glyphicon glyphicon-plus "></i></td>
																		{{else}}
																		<td rowspan={{this.actual_margin_amount.rowspan}} class="price-dtl ">{{this.actual_margin_amount.data}}
																			<i class="glyphicon glyphicon-minus "></i></td>
																		{{/if_eq}} {{#if this.net_payble_to_supplier}}
																		<td rowspan={{this.net_payble_to_supplier.rowspan}} class="price-dtl "><a href="#. ">{{this.net_payble_to_supplier.data}}</a></td>
																		{{/if}} {{#if this.supplier_cancellation_charges}}
																		<td rowspan={{this.supplier_cancellation_charges.rowspan}} class="price-dtl "><input type="text " value="{{this.supplier_cancellation_charges.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if this.supplier_amendment_charges}}
																		<td rowspan={{this.supplier_amendment_charges.rowspan}} class="price-dtl "><input type="text " value="{{this.supplier_amendment_charges.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if this.total_net_payble_to_supplier}}
																		<td rowspan={{this.total_net_payble_to_supplier.rowspan}} class="price-dtl "><a href="#. ">{{this.total_net_payble_to_supplier.data}}</a></td>
																		{{/if}} {{#if this.offers_applied}}
																		<td rowspan={{this.offers_applied.rowspan}} rowspan="3 " class="price-dtl "><a href="#. ">{{this.offers_applied.data}}</a></td>
																		{{/if}} {{#if this.action}}
																		<td rowspan={{this.action.rowspan}}>
																		<!-- Saood -->
																			<select class="form-control" id = "tlbselect">
                                                        <option>UPDATE-TIME-LIMIT</option>
                                                         <option>EXTEND-LIMIT</option>
                                                    </select>
																		</td>
																		{{/if}}
																	</tr>
																	{{/each}}
																</tbody>
															</table>
														</div>
													</div>
													<div id="list2 " class="travel-list ">
														<div class="table-responsive ">
															<table cellpadding="0 " cellspacing="0 " border="1 " valign="top " class="table-main table-fixed " width="3890 ">
																<thead>
																	<tr class="three-column ">
																		<th colspan="9 "><label>Product &amp; Passenger Information</label></th>
																		<th colspan="7 " class="main-spec-info "><label>Other Special Information</label>
																			<div class="float-right exp-collapse " data-item="spec-info "><i class="glyphicon glyphicon-menu-left "></i></div>
																		</th>
																		<th colspan="15 " class="main-price-dtl "><label>Price Details</label>
																			<div class="float-right exp-collapse " data-item="price-dtl "><i class="glyphicon glyphicon-menu-left "></i></div>
																		</th>
																		<th rowspan="3 "><label>Action</label></th>
																	</tr>
																	<tr>
																		<th rowspan="2 ">Passenger Name</th>
																		<th rowspan="2 ">Flight Details</th>
																		<th rowspan="2 ">Departure-Arrival Details</th>
																		<th rowspan="2 ">Class-RBD-Fare Basis-Ticket No</th>
																		<th rowspan="2 ">GDS PNR</th>
																		<th rowspan="2 ">Airline PNR</th>
																		<th rowspan="2 ">Booking Status</th>
																		<th rowspan="2 ">Time Limit Expiry Date</th>
																		<th rowspan="2 ">Amendment/Cancellation Date</th>

																		<th rowspan="2 " class="spec-info ">D.O.B.</th>
																		<th rowspan="2 " class="spec-info ">Meal Preference</th>
																		<th rowspan="2 " class="spec-info ">Special Request</th>
																		<th rowspan="2 " class="spec-info ">Flight Seat No.</th>
																		<th rowspan="2 " class="spec-info ">Credential Name / PCC</th>
																		<th rowspan="2 " class="spec-info ">Ticketing PCC</th>
																		<th rowspan="2 " class="spec-info ">Inventory</th>

																		<th rowspan="2 " class="price-dtl ">Source Supplier</th>
																		<th rowspan="2 " class="price-dtl ">Enabler Supplier</th>
																		<th rowspan="2 " class="price-dtl ">Refundable/Non-Refundable</th>
																		<th colspan="6 " class="price-dtl ">Selling Price Details</th>
																		<th rowspan="2 " class="price-dtl ">Actual Margin Amount</th>
																		<th colspan="4 " class="price-dtl ">Supplier Pricing Details</th>
																		<th rowspan="2 " class="price-dtl ">Offers Applied</th>
																	</tr>
																	<tr>
																		<th class="price-dtl ">Total Selling Price</th>
																		<th class="price-dtl ">Commission</th>
																		<th class="price-dtl ">Discount Value</th>
																		<th class="price-dtl ">Total Net Selling Price</th>
																		<th class="price-dtl ">Company Cancellation Charges</th>
																		<th class="price-dtl ">Company Amendment Charges</th>
																		<th class="price-dtl ">Net Payble to Supplier</th>
																		<th class="price-dtl ">Supplier Cancellation Charges</th>
																		<th class="price-dtl ">Supplier Amendment Charges</th>
																		<th class="price-dtl ">Total Net Payble to Supplier</th>
																	</tr>
																</thead>
																<tbody>
																	{{#each file_handler.product_passenger_information2}}
																	<tr>
																		{{#if this.passenger_name}}
																		<td rowspan={{this.passenger_name.rowspan}}>{{this.passenger_name.data}}</td>
																		{{/if}} {{#if this.flight_details}}
																		<td rowspan={{this.flight_details.rowspan}}>
																			<div class="block-info ">
																				<label>Sector</label>
																				<span>{{this.flight_details.Sector}}</span>
																			</div>
																			<div class="block-info ">
																				<label>Flight Number</label>
																				<span><input type="text " value={{this.flight_details.flight_number}} class="form-control "></span>
																			</div>
																			<div class="block-info ">
																				<label>(Onward)</label>
																			</div>
																		</td>
																		{{/if}} {{#if this.departure_arrival_details}}
																		<td rowspan={{this.departure_arrival_details.rowspan}} class="set-date ">
																			<label>Departure</label>
																			<div class="date-time ">
																				<input type="date " value={{this.departure_arrival_details.departure1}} class="form-control ">
																				<input type="date " value={{this.departure_arrival_details.departure2}} class="form-control ">
																			</div>
																			<label>Arrival</label>
																			<div class="date-time ">
																				<input type="date " value={{this.departure_arrival_details.arrival1}} class="form-control ">
																				<input type="date " value={{this.departure_arrival_details.arrival2}} class="form-control ">
																			</div>
																		</td>
																		{{/if}} {{#if this.class_RBD_fareBasis_ticketNo}}
																		<td rowspan={{this.class_RBD_fareBasis_ticketNo.rowspan}}>{{this.class_RBD_fareBasis_ticketNo.data}}</td>
																		{{/if}} {{#if this.GDS_PNR}}
																		<td rowspan={{this.GDS_PNR.rowspan}}>{{this.GDS_PNR.data}}</td>
																		{{/if}} {{#if this.airline_PNR}}
																		<td rowspan={{this.airline_PNR.rowspan}}>{{this.airline_PNR.data}}</td>
																		{{/if}} {{#if this.booking_status}}
																		<td rowspan={{this.booking_status.rowspan}}>
																			<select class="form-control ">
                                                            {{#each this.booking_status.data}}
                                                            <option>{{this}}</option>
                                                            {{/each}}
                                                        </select>
																		</td>
																		{{/if}} {{#if this.timeLimit_expiry_date}}
																		<td rowspan={{this.timeLimit_expiry_date.rowspan}} class="date-time set-date ">
																			<input type="date " value={{this.timeLimit_expiry_date.data1}} class="form-control ">
																			<input type="date " value={{this.timeLimit_expiry_date.data2}} class="form-control ">
																		</td>
																		{{/if}} {{#if this.amendment_cancellation_date}}
																		<td rowspan={{this.amendment_cancellation_date.rowspan}}> {{this.amendment_cancellation_date.data}} </td>
																		{{/if}} {{#if this.DOB}}
																		<td rowspan={{this.DOB.rowspan}} class="spec-info set-date "><input type="date " value={{this.DOB.data}} class="form-control opaque "></td>
																		{{/if}} {{#if this.meal_preference}}
																		<td rowspan={{this.meal_preference.rowspan}} class="spec-info ">
																			<select class="form-control opaque ">
                                                            {{#each this.meal_preference.data}}
                                                            <option>{{this}}</option>
                                                            {{/each}}
                                                        </select>
																		</td>
																		{{/if}} {{#if this.special_request}}
																		<td rowspan={{this.special_request.rowspan}} class="spec-info "><input type="text " value="{{this.special_request.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if this.flight_seat_no}}
																		<td rowspan={{this.flight_seat_no.rowspan}} class="spec-info ">{{this.flight_seat_no.data}}</td>
																		{{/if}} {{#if this.credential_name}}
																		<td rowspan={{this.credential_name.rowspan}} class="spec-info ">{{this.credential_name.data}}</td>
																		{{/if}} {{#if this.ticketing_PCC}}
																		<td rowspan={{this.ticketing_PCC.rowspan}} class="spec-info ">
																			<select class="form-control opaque ">
                                                            {{#each this.ticketing_PCC.data}}
                                                            <option>{{this}}</option>
                                                            {{/each}}                                                        
                                                        </select>
																		</td>
																		{{/if}} {{#if this.inventory}}
																		<td rowspan={{this.inventory.rowspan}} class="spec-info ">{{this.inventory.data}}</td>
																		{{/if}} {{#if this.source_supplier}}
																		<td rowspan={{this.source_supplier.rowspan}} rowspan="3 " class="price-dtl ">{{this.source_supplier.data}}</td>
																		{{/if}} {{#if this.enabler_supplier}}
																		<td rowspan={{this.enabler_supplier.rowspan}} rowspan="3 " class="price-dtl ">{{this.enabler_supplier.data}}</td>
																		{{/if}} {{#if this.refundable_nonRefundable}}
																		<td rowspan={{this.refundable_nonRefundable.rowspan}} class="price-dtl ">{{this.refundable_nonRefundable.data}}</td>
																		{{/if}} {{#if this.total_selling_price}}
																		<td rowspan={{this.total_selling_price.rowspan}} class="price-dtl "><a href="#. ">{{this.total_selling_price.data}}</a></td>
																		{{/if}} {{#if this.commission}}
																		<td rowspan={{this.commission.rowspan}} class="price-dtl "> {{this.commission.data}} </td>
																		{{/if}} {{#if this.discount_value}}
																		<td rowspan={{this.discount_value.rowspan}} class="price-dtl "> {{this.discount_value.data}} </td>
																		{{/if}} {{#if this.total_net_selling_price}}
																		<td rowspan={{this.total_net_selling_price.rowspan}} class="price-dtl ">{{this.total_net_selling_price.data}}</td>
																		{{/if}} {{#if this.company_cancellation_charges}}
																		<td rowspan={{this.company_cancellation_charges.rowspan}} class="price-dtl "><input type="text " value="{{this.company_cancellation_charges.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if this.company_amendment_charges}}
																		<td rowspan={{this.company_amendment_charges.rowspan}} class="price-dtl "><input type="text " value="{{this.company_amendment_charges.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if_eq this.actual_margin_amount 'INR 4000'}}
																		<td rowspan={{this.actual_margin_amount.rowspan}} class="price-dtl ">{{this.actual_margin_amount.data}}
																			<i class="glyphicon glyphicon-plus "></i></td>
																		{{else}}
																		<td rowspan={{this.actual_margin_amount.rowspan}} class="price-dtl ">{{this.actual_margin_amount.data}}
																			<i class="glyphicon glyphicon-minus "></i></td>
																		{{/if_eq}} {{#if this.net_payble_to_supplier}}
																		<td rowspan={{this.net_payble_to_supplier.rowspan}} class="price-dtl "><a href="#. ">{{this.net_payble_to_supplier.data}}</a></td>
																		{{/if}} {{#if this.supplier_cancellation_charges}}
																		<td rowspan={{this.supplier_cancellation_charges.rowspan}} class="price-dtl "><input type="text " value="{{this.supplier_cancellation_charges.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if this.supplier_amendment_charges}}
																		<td rowspan={{this.supplier_amendment_charges.rowspan}} class="price-dtl "><input type="text " value="{{this.supplier_amendment_charges.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if this.total_net_payble_to_supplier}}
																		<td rowspan={{this.total_net_payble_to_supplier.rowspan}} class="price-dtl "><a href="#. ">{{this.total_net_payble_to_supplier.data}}</a></td>
																		{{/if}} {{#if this.offers_applied}}
																		<td rowspan={{this.offers_applied.rowspan}} rowspan="3 " class="price-dtl "><a href="#. ">{{this.offers_applied.data}}</a></td>
																		{{/if}} {{#if this.action}}
																		<td rowspan={{this.action.rowspan}}>
																			<select class="form-control ">
                                                            {{#each this.action.data}}
                                                            <option>{{this}}</option>
                                                            {{/each}}                                                         
                                                        </select>
																		</td>
																		{{/if}}
																	</tr>
																	{{/each}}
																</tbody>
															</table>
														</div>
													</div>
												</div>
									<!-- End -->
<div class="tab-content ">
									<div class="tab-pane fade in active " id="flightDetails ">
										<section class="panel panel-default flight-table" id="file-handler-container">
											<script id="file-handler-template" type="text/x-handlebars-template">
												<div class="panel-heading main-heading ">
													<label>Flight Details</label>
													<div class="other-events ">
														<label>File Handler: <span>{{file_handler.name}}</span></label>
														<a href="ckil-238816/ckil-238816-flight-timing-changes.html "><i class="glyphicon glyphicon-info-sign " aria-hidden="true "></i> Flight Time Changed</a>
														<a href="#. "><i class="glyphicon glyphicon-info-sign " aria-hidden="true "></i> Amendment</a>
													</div>
												</div>
												<div class="passenger-details panel-body ">
													<div id="list1 " class="travel-list auto-overflow active ">
														<div class="table-responsive ">
															<table cellpadding="0 " cellspacing="0 " border="1 " valign="top " class="table-main table-fixed " width="3890 ">
																<thead>
																	<tr class="three-column ">
																		<th colspan="9 "><label>Product &amp; Passenger Information</label></th>
																		<th colspan="7 " class="main-spec-info "><label>Other Special Information</label>
																			<div class="float-right exp-collapse " data-item="spec-info "><i class="glyphicon glyphicon-menu-left "></i></div>
																		</th>
																		<th colspan="15 " class="main-price-dtl "><label>Price Details</label>
																			<div class="float-right exp-collapse " data-item="price-dtl "><i class="glyphicon glyphicon-menu-left "></i></div>
																		</th>
																		<th rowspan="3 "><label>Action</label></th>
																	</tr>
																	<tr>
																		<th rowspan="2 ">Passenger Name</th>
																		<th rowspan="2 ">Flight Details</th>
																		<th rowspan="2 ">Departure-Arrival Details</th>
																		<th rowspan="2 ">Class-RBD-Fare Basis-Ticket No</th>
																		<th rowspan="2 ">GDS PNR</th>
																		<th rowspan="2 ">Airline PNR</th>
																		<th rowspan="2 ">Booking Status</th>
																		<th rowspan="2 ">Time Limit Expiry Date</th>
																		<th rowspan="2 ">Amendment/Cancellation Date</th>

																		<th rowspan="2 " class="spec-info ">D.O.B.</th>
																		<th rowspan="2 " class="spec-info ">Meal Preference</th>
																		<th rowspan="2 " class="spec-info ">Special Request</th>
																		<th rowspan="2 " class="spec-info ">Flight Seat No.</th>
																		<th rowspan="2 " class="spec-info ">Credential Name / PCC</th>
																		<th rowspan="2 " class="spec-info ">Ticketing PCC</th>
																		<th rowspan="2 " class="spec-info ">Inventory</th>

																		<th rowspan="2 " class="price-dtl ">Source Supplier</th>
																		<th rowspan="2 " class="price-dtl ">Enabler Supplier</th>
																		<th rowspan="2 " class="price-dtl ">Refundable/Non-Refundable</th>
																		<th colspan="6 " class="price-dtl ">Selling Price Details</th>
																		<th rowspan="2 " class="price-dtl ">Actual Margin Amount</th>
																		<th colspan="4 " class="price-dtl ">Supplier Pricing Details</th>
																		<th rowspan="2 " class="price-dtl ">Offers Applied</th>
																	</tr>
																	<tr>
																		<th class="price-dtl ">Total Selling Price</th>
																		<th class="price-dtl ">Commission</th>
																		<th class="price-dtl ">Discount Value</th>
																		<th class="price-dtl ">Total Net Selling Price</th>
																		<th class="price-dtl ">Company Cancellation Charges</th>
																		<th class="price-dtl ">Company Amendment Charges</th>
																		<th class="price-dtl ">Net Payble to Supplier</th>
																		<th class="price-dtl ">Supplier Cancellation Charges</th>
																		<th class="price-dtl ">Supplier Amendment Charges</th>
																		<th class="price-dtl ">Total Net Payble to Supplier</th>
																	</tr>
																</thead>
																<tbody>
																	{{#each file_handler.product_passenger_information1}}
																	<tr>
																		{{#if this.passenger_name}}
																		<td rowspan={{this.passenger_name.rowspan}}>{{this.passenger_name.data}}</td>
																		{{/if}} {{#if this.flight_details}}
																		<td rowspan={{this.flight_details.rowspan}}>
																			<div class="block-info ">
																				<label>Sector</label>
																				<span>{{this.flight_details.Sector}}</span>
																			</div>
																			<div class="block-info ">
																				<label>Flight Number</label>
																				<span><input type="text " value={{this.flight_details.flight_number}} class="form-control "></span>
																			</div>
																			<div class="block-info ">
																				<label>(Onward)</label>
																			</div>
																		</td>
																		{{/if}} {{#if this.departure_arrival_details}}
																		<td rowspan={{this.departure_arrival_details.rowspan}} class="set-date ">
																			<label>Departure</label>
																			<div class="date-time ">
																				<input type="date " value={{this.departure_arrival_details.departure1}} class="form-control ">
																				<input type="date " value={{this.departure_arrival_details.departure2}} class="form-control ">
																			</div>
																			<label>Arrival</label>
																			<div class="date-time ">
																				<input type="date " value={{this.departure_arrival_details.arrival1}} class="form-control ">
																				<input type="date " value={{this.departure_arrival_details.arrival2}} class="form-control ">
																			</div>
																		</td>
																		{{/if}} {{#if this.class_RBD_fareBasis_ticketNo}}
																		<td rowspan={{this.class_RBD_fareBasis_ticketNo.rowspan}}>{{this.class_RBD_fareBasis_ticketNo.data}}</td>
																		{{/if}} {{#if this.GDS_PNR}}
																		<td rowspan={{this.GDS_PNR.rowspan}}>{{this.GDS_PNR.data}}</td>
																		{{/if}} {{#if this.airline_PNR}}
																		<td rowspan={{this.airline_PNR.rowspan}}>{{this.airline_PNR.data}}</td>
																		{{/if}} {{#if this.booking_status}}
																		<td rowspan={{this.booking_status.rowspan}}>
																			<select class="form-control ">
                                                        {{#each this.booking_status.data}}
                                                        <option>{{this}}</option>
                                                        {{/each}}
                                                    </select>
																		</td>
																		{{/if}} {{#if this.timeLimit_expiry_date}}
																		<td rowspan={{this.timeLimit_expiry_date.rowspan}} class="date-time set-date ">
																			<input type="date " value={{this.timeLimit_expiry_date.data1}} class="form-control ">
																			<input type="date " value={{this.timeLimit_expiry_date.data2}} class="form-control ">
																		</td>
																		{{/if}} {{#if this.amendment_cancellation_date}}
																		<td rowspan={{this.amendment_cancellation_date.rowspan}}> {{this.amendment_cancellation_date.data}} </td>
																		{{/if}} {{#if this.DOB}}
																		<td rowspan={{this.DOB.rowspan}} class="spec-info set-date "><input type="date " value={{this.DOB.data}} class="form-control opaque "></td>
																		{{/if}} {{#if this.meal_preference}}
																		<td rowspan={{this.meal_preference.rowspan}} class="spec-info ">
																			<select class="form-control opaque ">
                                                        {{#each this.meal_preference.data}}
                                                        <option>{{this}}</option>
                                                        {{/each}}
                                                    </select>
																		</td>
																		{{/if}} {{#if this.special_request}}
																		<td rowspan={{this.special_request.rowspan}} class="spec-info "><input type="text " value="{{this.special_request.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if this.flight_seat_no}}
																		<td rowspan={{this.flight_seat_no.rowspan}} class="spec-info ">{{this.flight_seat_no.data}}</td>
																		{{/if}} {{#if this.credential_name}}
																		<td rowspan={{this.credential_name.rowspan}} class="spec-info ">{{this.credential_name.data}}</td>
																		{{/if}} {{#if this.ticketing_PCC}}
																		<td rowspan={{this.ticketing_PCC.rowspan}} class="spec-info ">
																			<select class="form-control opaque ">
                                                        {{#each this.ticketing_PCC.data}}
                                                        <option>{{this}}</option>
                                                        {{/each}}                                                        
                                                    </select>
																		</td>
																		{{/if}} {{#if this.inventory}}
																		<td rowspan={{this.inventory.rowspan}} class="spec-info ">{{this.inventory.data}}</td>
																		{{/if}} {{#if this.source_supplier}}
																		<td rowspan={{this.source_supplier.rowspan}} rowspan="3 " class="price-dtl ">{{this.source_supplier.data}}</td>
																		{{/if}} {{#if this.enabler_supplier}}
																		<td rowspan={{this.enabler_supplier.rowspan}} rowspan="3 " class="price-dtl ">{{this.enabler_supplier.data}}</td>
																		{{/if}} {{#if this.refundable_nonRefundable}}
																		<td rowspan={{this.refundable_nonRefundable.rowspan}} class="price-dtl ">{{this.refundable_nonRefundable.data}}</td>
																		{{/if}} {{#if this.total_selling_price}}
																		<td rowspan={{this.total_selling_price.rowspan}} class="price-dtl "><a href="#. ">{{this.total_selling_price.data}}</a></td>
																		{{/if}} {{#if this.commission}}
																		<td rowspan={{this.commission.rowspan}} class="price-dtl "> {{this.commission.data}} </td>
																		{{/if}} {{#if this.discount_value}}
																		<td rowspan={{this.discount_value.rowspan}} class="price-dtl "> {{this.discount_value.data}} </td>
																		{{/if}} {{#if this.total_net_selling_price}}
																		<td rowspan={{this.total_net_selling_price.rowspan}} class="price-dtl ">{{this.total_net_selling_price.data}}</td>
																		{{/if}} {{#if this.company_cancellation_charges}}
																		<td rowspan={{this.company_cancellation_charges.rowspan}} class="price-dtl "><input type="text " value="{{this.company_cancellation_charges.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if this.company_amendment_charges}}
																		<td rowspan={{this.company_amendment_charges.rowspan}} class="price-dtl "><input type="text " value="{{this.company_amendment_charges.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if_eq this.actual_margin_amount 'INR 4000'}}
																		<td rowspan={{this.actual_margin_amount.rowspan}} class="price-dtl ">{{this.actual_margin_amount.data}}
																			<i class="glyphicon glyphicon-plus "></i></td>
																		{{else}}
																		<td rowspan={{this.actual_margin_amount.rowspan}} class="price-dtl ">{{this.actual_margin_amount.data}}
																			<i class="glyphicon glyphicon-minus "></i></td>
																		{{/if_eq}} {{#if this.net_payble_to_supplier}}
																		<td rowspan={{this.net_payble_to_supplier.rowspan}} class="price-dtl "><a href="#. ">{{this.net_payble_to_supplier.data}}</a></td>
																		{{/if}} {{#if this.supplier_cancellation_charges}}
																		<td rowspan={{this.supplier_cancellation_charges.rowspan}} class="price-dtl "><input type="text " value="{{this.supplier_cancellation_charges.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if this.supplier_amendment_charges}}
																		<td rowspan={{this.supplier_amendment_charges.rowspan}} class="price-dtl "><input type="text " value="{{this.supplier_amendment_charges.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if this.total_net_payble_to_supplier}}
																		<td rowspan={{this.total_net_payble_to_supplier.rowspan}} class="price-dtl "><a href="#. ">{{this.total_net_payble_to_supplier.data}}</a></td>
																		{{/if}} {{#if this.offers_applied}}
																		<td rowspan={{this.offers_applied.rowspan}} rowspan="3 " class="price-dtl "><a href="#. ">{{this.offers_applied.data}}</a></td>
																		{{/if}} {{#if this.action}}
																		<td rowspan={{this.action.rowspan}}>
																			<select class="form-control ">
                                                        {{#each this.action.data}}
                                                        <option>{{this}}</option>
                                                        {{/each}}                                                         
                                                    </select>
																		</td>
																		{{/if}}
																	</tr>
																	{{/each}}
																</tbody>
															</table>
														</div>
													</div>
													<div id="list2 " class="travel-list ">
														<div class="table-responsive ">
															<table cellpadding="0 " cellspacing="0 " border="1 " valign="top " class="table-main table-fixed " width="3890 ">
																<thead>
																	<tr class="three-column ">
																		<th colspan="9 "><label>Product &amp; Passenger Information</label></th>
																		<th colspan="7 " class="main-spec-info "><label>Other Special Information</label>
																			<div class="float-right exp-collapse " data-item="spec-info "><i class="glyphicon glyphicon-menu-left "></i></div>
																		</th>
																		<th colspan="15 " class="main-price-dtl "><label>Price Details</label>
																			<div class="float-right exp-collapse " data-item="price-dtl "><i class="glyphicon glyphicon-menu-left "></i></div>
																		</th>
																		<th rowspan="3 "><label>Action</label></th>
																	</tr>
																	<tr>
																		<th rowspan="2 ">Passenger Name</th>
																		<th rowspan="2 ">Flight Details</th>
																		<th rowspan="2 ">Departure-Arrival Details</th>
																		<th rowspan="2 ">Class-RBD-Fare Basis-Ticket No</th>
																		<th rowspan="2 ">GDS PNR</th>
																		<th rowspan="2 ">Airline PNR</th>
																		<th rowspan="2 ">Booking Status</th>
																		<th rowspan="2 ">Time Limit Expiry Date</th>
																		<th rowspan="2 ">Amendment/Cancellation Date</th>

																		<th rowspan="2 " class="spec-info ">D.O.B.</th>
																		<th rowspan="2 " class="spec-info ">Meal Preference</th>
																		<th rowspan="2 " class="spec-info ">Special Request</th>
																		<th rowspan="2 " class="spec-info ">Flight Seat No.</th>
																		<th rowspan="2 " class="spec-info ">Credential Name / PCC</th>
																		<th rowspan="2 " class="spec-info ">Ticketing PCC</th>
																		<th rowspan="2 " class="spec-info ">Inventory</th>

																		<th rowspan="2 " class="price-dtl ">Source Supplier</th>
																		<th rowspan="2 " class="price-dtl ">Enabler Supplier</th>
																		<th rowspan="2 " class="price-dtl ">Refundable/Non-Refundable</th>
																		<th colspan="6 " class="price-dtl ">Selling Price Details</th>
																		<th rowspan="2 " class="price-dtl ">Actual Margin Amount</th>
																		<th colspan="4 " class="price-dtl ">Supplier Pricing Details</th>
																		<th rowspan="2 " class="price-dtl ">Offers Applied</th>
																	</tr>
																	<tr>
																		<th class="price-dtl ">Total Selling Price</th>
																		<th class="price-dtl ">Commission</th>
																		<th class="price-dtl ">Discount Value</th>
																		<th class="price-dtl ">Total Net Selling Price</th>
																		<th class="price-dtl ">Company Cancellation Charges</th>
																		<th class="price-dtl ">Company Amendment Charges</th>
																		<th class="price-dtl ">Net Payble to Supplier</th>
																		<th class="price-dtl ">Supplier Cancellation Charges</th>
																		<th class="price-dtl ">Supplier Amendment Charges</th>
																		<th class="price-dtl ">Total Net Payble to Supplier</th>
																	</tr>
																</thead>
																<tbody>
																	{{#each file_handler.product_passenger_information2}}
																	<tr>
																		{{#if this.passenger_name}}
																		<td rowspan={{this.passenger_name.rowspan}}>{{this.passenger_name.data}}</td>
																		{{/if}} {{#if this.flight_details}}
																		<td rowspan={{this.flight_details.rowspan}}>
																			<div class="block-info ">
																				<label>Sector</label>
																				<span>{{this.flight_details.Sector}}</span>
																			</div>
																			<div class="block-info ">
																				<label>Flight Number</label>
																				<span><input type="text " value={{this.flight_details.flight_number}} class="form-control "></span>
																			</div>
																			<div class="block-info ">
																				<label>(Onward)</label>
																			</div>
																		</td>
																		{{/if}} {{#if this.departure_arrival_details}}
																		<td rowspan={{this.departure_arrival_details.rowspan}} class="set-date ">
																			<label>Departure</label>
																			<div class="date-time ">
																				<input type="date " value={{this.departure_arrival_details.departure1}} class="form-control ">
																				<input type="date " value={{this.departure_arrival_details.departure2}} class="form-control ">
																			</div>
																			<label>Arrival</label>
																			<div class="date-time ">
																				<input type="date " value={{this.departure_arrival_details.arrival1}} class="form-control ">
																				<input type="date " value={{this.departure_arrival_details.arrival2}} class="form-control ">
																			</div>
																		</td>
																		{{/if}} {{#if this.class_RBD_fareBasis_ticketNo}}
																		<td rowspan={{this.class_RBD_fareBasis_ticketNo.rowspan}}>{{this.class_RBD_fareBasis_ticketNo.data}}</td>
																		{{/if}} {{#if this.GDS_PNR}}
																		<td rowspan={{this.GDS_PNR.rowspan}}>{{this.GDS_PNR.data}}</td>
																		{{/if}} {{#if this.airline_PNR}}
																		<td rowspan={{this.airline_PNR.rowspan}}>{{this.airline_PNR.data}}</td>
																		{{/if}} {{#if this.booking_status}}
																		<td rowspan={{this.booking_status.rowspan}}>
																			<select class="form-control ">
                                                            {{#each this.booking_status.data}}
                                                            <option>{{this}}</option>
                                                            {{/each}}
                                                        </select>
																		</td>
																		{{/if}} {{#if this.timeLimit_expiry_date}}
																		<td rowspan={{this.timeLimit_expiry_date.rowspan}} class="date-time set-date ">
																			<input type="date " value={{this.timeLimit_expiry_date.data1}} class="form-control ">
																			<input type="date " value={{this.timeLimit_expiry_date.data2}} class="form-control ">
																		</td>
																		{{/if}} {{#if this.amendment_cancellation_date}}
																		<td rowspan={{this.amendment_cancellation_date.rowspan}}> {{this.amendment_cancellation_date.data}} </td>
																		{{/if}} {{#if this.DOB}}
																		<td rowspan={{this.DOB.rowspan}} class="spec-info set-date "><input type="date " value={{this.DOB.data}} class="form-control opaque "></td>
																		{{/if}} {{#if this.meal_preference}}
																		<td rowspan={{this.meal_preference.rowspan}} class="spec-info ">
																			<select class="form-control opaque ">
                                                            {{#each this.meal_preference.data}}
                                                            <option>{{this}}</option>
                                                            {{/each}}
                                                        </select>
																		</td>
																		{{/if}} {{#if this.special_request}}
																		<td rowspan={{this.special_request.rowspan}} class="spec-info "><input type="text " value="{{this.special_request.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if this.flight_seat_no}}
																		<td rowspan={{this.flight_seat_no.rowspan}} class="spec-info ">{{this.flight_seat_no.data}}</td>
																		{{/if}} {{#if this.credential_name}}
																		<td rowspan={{this.credential_name.rowspan}} class="spec-info ">{{this.credential_name.data}}</td>
																		{{/if}} {{#if this.ticketing_PCC}}
																		<td rowspan={{this.ticketing_PCC.rowspan}} class="spec-info ">
																			<select class="form-control opaque ">
                                                            {{#each this.ticketing_PCC.data}}
                                                            <option>{{this}}</option>
                                                            {{/each}}                                                        
                                                        </select>
																		</td>
																		{{/if}} {{#if this.inventory}}
																		<td rowspan={{this.inventory.rowspan}} class="spec-info ">{{this.inventory.data}}</td>
																		{{/if}} {{#if this.source_supplier}}
																		<td rowspan={{this.source_supplier.rowspan}} rowspan="3 " class="price-dtl ">{{this.source_supplier.data}}</td>
																		{{/if}} {{#if this.enabler_supplier}}
																		<td rowspan={{this.enabler_supplier.rowspan}} rowspan="3 " class="price-dtl ">{{this.enabler_supplier.data}}</td>
																		{{/if}} {{#if this.refundable_nonRefundable}}
																		<td rowspan={{this.refundable_nonRefundable.rowspan}} class="price-dtl ">{{this.refundable_nonRefundable.data}}</td>
																		{{/if}} {{#if this.total_selling_price}}
																		<td rowspan={{this.total_selling_price.rowspan}} class="price-dtl "><a href="#. ">{{this.total_selling_price.data}}</a></td>
																		{{/if}} {{#if this.commission}}
																		<td rowspan={{this.commission.rowspan}} class="price-dtl "> {{this.commission.data}} </td>
																		{{/if}} {{#if this.discount_value}}
																		<td rowspan={{this.discount_value.rowspan}} class="price-dtl "> {{this.discount_value.data}} </td>
																		{{/if}} {{#if this.total_net_selling_price}}
																		<td rowspan={{this.total_net_selling_price.rowspan}} class="price-dtl ">{{this.total_net_selling_price.data}}</td>
																		{{/if}} {{#if this.company_cancellation_charges}}
																		<td rowspan={{this.company_cancellation_charges.rowspan}} class="price-dtl "><input type="text " value="{{this.company_cancellation_charges.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if this.company_amendment_charges}}
																		<td rowspan={{this.company_amendment_charges.rowspan}} class="price-dtl "><input type="text " value="{{this.company_amendment_charges.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if_eq this.actual_margin_amount 'INR 4000'}}
																		<td rowspan={{this.actual_margin_amount.rowspan}} class="price-dtl ">{{this.actual_margin_amount.data}}
																			<i class="glyphicon glyphicon-plus "></i></td>
																		{{else}}
																		<td rowspan={{this.actual_margin_amount.rowspan}} class="price-dtl ">{{this.actual_margin_amount.data}}
																			<i class="glyphicon glyphicon-minus "></i></td>
																		{{/if_eq}} {{#if this.net_payble_to_supplier}}
																		<td rowspan={{this.net_payble_to_supplier.rowspan}} class="price-dtl "><a href="#. ">{{this.net_payble_to_supplier.data}}</a></td>
																		{{/if}} {{#if this.supplier_cancellation_charges}}
																		<td rowspan={{this.supplier_cancellation_charges.rowspan}} class="price-dtl "><input type="text " value="{{this.supplier_cancellation_charges.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if this.supplier_amendment_charges}}
																		<td rowspan={{this.supplier_amendment_charges.rowspan}} class="price-dtl "><input type="text " value="{{this.supplier_amendment_charges.data}} " class="form-control opaque " /></td>
																		{{/if}} {{#if this.total_net_payble_to_supplier}}
																		<td rowspan={{this.total_net_payble_to_supplier.rowspan}} class="price-dtl "><a href="#. ">{{this.total_net_payble_to_supplier.data}}</a></td>
																		{{/if}} {{#if this.offers_applied}}
																		<td rowspan={{this.offers_applied.rowspan}} rowspan="3 " class="price-dtl "><a href="#. ">{{this.offers_applied.data}}</a></td>
																		{{/if}} {{#if this.action}}
																		<td rowspan={{this.action.rowspan}}>
																			<select class="form-control ">
                                                            {{#each this.action.data}}
                                                            <option>{{this}}</option>
                                                            {{/each}}                                                         
                                                        </select>
																		</td>
																		{{/if}}
																	</tr>
																	{{/each}}
																</tbody>
															</table>
														</div>
													</div>
												</div>
											</script>
										</section>
									</div>
									<!-- End Flight Details  & Start Client Payment Details -->
									<div class="tab-pane fade " id="clientPaymentDetails ">
										<section class="panel panel-default " id="client-payment-container ">
											<script id="client-payment-template" type="text/x-handlebars-template">
												<div class="panel-heading ">
													<label>Client Payment Details</label>
													<div class="other-events ">
														<a href="#. "><i class="glyphicon glyphicon-info-sign "></i> Notification</a>
													</div>
													<div class="other-events pull-right ">
														Total Outstanding Amount = <input type="text " class="form-control " value="NZD 266 " disabled=" ">
													</div>
													<div class="other-events pull-right ">
														Total Collection =
														<p class="form-control ">NZD 2000, INR 300000 </p>
													</div>
												</div>
												<div class="panel-body ">
													<div class="table-responsive ">
														<table class="table-main wrap-text " cellpadding="0 " cellspacing="0 " border="0 " width="100% ">
															<thead>
																<tr>
																	<th rowspan="2 ">Invoice</th>
																	<th rowspan="2 ">Invoice Amount</th>
																	<th colspan="6 ">Payment Details</th>
																	<th rowspan="2 ">Credit/Debit Note No.</th>
																	<th colspan="3 ">Refund Details</th>
																</tr>
																<tr>
																	<th>Payment Towards</th>
																	<th>Payment Date</th>
																	<th>Payment Collection</th>
																	<th>Refundable/Non-Refundable</th>
																	<th>Receipt No.</th>
																	<th>Payment Status</th>
																	<th>Refund Claim ID</th>
																	<th>Refund Amount</th>
																	<th>Refund Status</th>
																</tr>
															</thead>
															<tbody>
																{{#each file_handler.client_payment_details}}
																<tr>
																	{{#if this.invoice}}
																	<td rowspan={{this.invoice.rowspan}}><a href="# ">{{this.invoice.no}}</a>
																		<p>{{this.invoice.date}}</p>
																	</td>
																	{{/if}} {{#if this.invoice_amount}}
																	<td rowspan={{this.invoice_amount.rowspan}}>{{this.invoice_amount.data}}</td>
																	{{/if}} {{#if this.payment_towards}}
																	<td rowspan={{this.payment_towards.rowspan}}>{{this.payment_towards.data}}</td>
																	{{/if}} {{#if this.payment_date}}
																	<td rowspan={{this.payment_date.rowspan}}>{{this.payment_date.data}}</td>
																	{{/if}} {{#if this.payment_collection}}
																	<td rowspan={{this.payment_collection.rowspan}}>{{this.payment_collection.data}}</td>
																	{{/if}} {{#if this.R_NR}}
																	<td rowspan={{this.R_NR.rowspan}}>{{this.R_NR.data}}</td>
																	{{/if}} {{#if this.receipt_no}}
																	<td rowspan={{this.receipt_no.rowspan}}><a href="#. ">{{this.receipt_no.data}}</a></td>
																	{{/if}} {{#if this.payment_status}}
																	<td rowspan={{this.payment_status.rowspan}}>{{this.payment_status.data}}</td>
																	{{/if}} {{#if this.note_no}}
																	<td rowspan={{this.note_no.rowspan}}><a href="#. ">{{this.note_no.data}}</a></td>
																	{{/if}} {{#if this.refund_claim_id}}
																	<td rowspan={{this.refund_claim_id.rowspan}}><a href="# ">{{this.refund_claim_id.data}}</a></td>
																	{{/if}} {{#if this.refund_amount}}
																	<td rowspan={{this.refund_amount.rowspan}}>{{this.refund_amount.data}}</td>
																	{{/if}} {{#if this.refund_status}}
																	<td rowspan={{this.refund_status.rowspan}}>{{this.refund_status.data}}</td>
																	{{/if}}
																</tr>
																{{/each}}
															</tbody>
														</table>
													</div>
												</div>
											</script>
										</section>
									</div>
									<!-- End Client Payment Details & Start Supplier Payment Details -->
									<div class="tab-pane fade " id="supplierPaymentDetails ">
										<section class="panel panel-default " id="supplier-payment-container ">
											<script id="supplier-payment-template" type="text/x-handlebars-template">
												<div class="panel-heading main-heading ">
													<label>Supplier Payment Details</label>
													<div class="other-events ">
														<a href="#. "><i class="glyphicon glyphicon-info-sign "></i> Notification</a>
													</div>
													<div class="other-events pull-right padding-top-5 ">
														Balance Amount Due = INR 34475
													</div>
													<div class="other-events pull-right padding-top-5 ">
														<a href="# ">Total Amount Paid = INR 11475</a>
													</div>
												</div>
												<div class="panel-body ">
													<div class="table-responsive ">
														<table id="section5Table " class="table-main " cellpadding="0 " cellspacing="0 " width="100% ">
															<thead>
																<tr>
																	<th rowspan="2 ">Supplier Name</th>
																	<th rowspan="2 ">Net Payable to Supplier</th>
																	<th colspan="7 ">Payment Details</th>
																</tr>
																<tr>
																	<th>Type of Settlement</th>
																	<th>Payment Due Date</th>
																	<th>Amount</th>
																	<th>Payment Date</th>
																	<th>Payment Advice ID</th>
																	<th>Payment Ref No.</th>
																	<th>Status</th>
																</tr>
																<thead>
																	<tbody>
																		{{#each supplier_payment_details}}
																		<tr>
																			{{#if this.supplier_name}}
																			<td rowspan={{this.supplier_name.rowspan}}>{{this.supplier_name.data}}</td>
																			{{/if}} {{#if this.net_payable_to_supplier}}
																			<td rowspan={{this.net_payable_to_supplier.rowspan}}>{{this.net_payable_to_supplier.data}}</td>
																			{{/if}} {{#if this.type_of_settlement}}
																			<td rowspan={{this.type_of_settlement.rowspan}}>{{this.type_of_settlement.data}}</td>
																			{{/if}} {{#if this.payment_due_date}}
																			<td rowspan={{this.payment_due_date.rowspan}}>{{this.payment_due_date.data}}</td>
																			{{/if}} {{#if this.amount}}
																			<td rowspan={{this.amount.rowspan}}>{{this.amount.data}}</td>
																			{{/if}} {{#if this.payment_date}}
																			<td rowspan={{this.payment_date.rowspan}}>{{this.payment_date.data}}</td>
																			{{/if}} {{#if this.payment_advice_ID}}
																			<td rowspan={{this.payment_advice_ID.rowspan}}>{{this.payment_advice_ID.data}}</td>
																			{{/if}} {{#if this.payment_ref_no}}
																			<td rowspan={{this.payment_ref_no.rowspan}}>{{this.payment_ref_no.data}}</td>
																			{{/if}} {{#if this.status}}
																			<td rowspan={{this.status.rowspan}}>{{this.status.data}}</td>
																			{{/if}}
																		</tr>
																		{{/each}}
																	</tbody>
														</table>
													</div>
												</div>
											</script>


										</section>
									</div>


          </div>
        </div>
     </div>
  </div>
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

<div class="container-fluid section4">
      <div class="row">
        <div class="tab-content">
          <div id="clientPaymentDetails" class="tab-pane fade in active">
            <div class="panel panel-default">
  <!-- Default panel contents -->
  <div class="panel-heading">
    <ul class="list-inline"> 
      <li class="list-inline-item"><h5>Client Payment Details&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h5> </li>
      <span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>
      <li class="list-inline-item">Notification </li>
    </ul>
  </div>           
  <table class="table table-bordered" style="padding:0; margin: 0;">
    <thead style="padding:0; margin: 0;">
      <tr>
        <th colspan ="1" rowspan="2" style="border-top: none;"><b>Invoice</b></th>
        <th colspan="1" rowspan="2" style="  word-wrap:break-word;"><b>Invoice Amount</b></th>
        <th colspan="6" style="text-align:center;"><b>Payment Details</b></th>
        <th colspan="1" style="text-align:center;"><b>Credit/Debit Note No.</b></th>
        <th colspan="3" style="text-align:center;"><b>Refund Details</b></th>
      </tr>
    </thead>
<thead style="padding:0; margin: 0;">
      <tr>
        <th rowspan ="0" colspan="1" style="border-top: none;"></th>
        <th colspan="1" style="border-top: none;"></th>
        <th colspan="1"><b>Payment Towards</b></th>
        <th colspan="1"><b>Payment Date</b></th>
        <th colspan="1"><b>Payment Collection</b></th>
        <th colspan="1"><b>Refundable/Non-Refundable</b></th>
        <th colspan="1"><b>Receipt No.</b></th>
        <th colspan="1"><b>Payment Status</b></th>
        <th colspan="1" style="border-top: none;"></th>
        <th colspan="1"><b>Refund Claim ID</b></th>
        <th colspan="1"><b>Refund Amount</b></th>
        <th colspan="1"><b>Refund Status</b></th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td colspan="1" rowspan="2"><a href="#">PIBTINR14-000000001/01</a><p>25-Oct-2014</p></td>
        <td colspan="1" rowspan="2">INR 28000</td>
        <td colspan="1" rowspan="1">Initial Deposit of 10000</td>
        <td>12 Oct 2014</td>
        <td>INR 10000, 12 Oct 2014 Wire Transfer</td>
        <td>Refundable</td>
        <td><a href="#">1234</a></td>
        <td>Payment Realized</td>
        <td><a href="#">CR34527</a></td>
        <td rowspan="2"><a href="#">1234</a></td>
        <td rowspan="2">INR 500</td>
        <td rowspan = "2">Processed</td>
      </tr>
      <tr>
        <td>Balance Payment of INR 18000</td>
        <td><input type="date" value="2014-10-25"></td>
        <td> - </td>
        <td> - </td>
        <td>&nbsp;</td>
        <td>Pending</td>
        <td> - </td>
      </tr>
      <tr>
        <td colspan="1" rowspan="1"><a href="#">PIBTINR14-000000001/02</a><p>25-Oct-2014</p></td>
        <td colspan="1" rowspan="1">INR 28000</td>
        <td colspan="1" rowspan="1">Full Payment</td>
        <td>12 Oct 2014</td>
        <td>INR 10000, 12 Oct 2014 Credit Card</td>
        <td>Refundable</td>
        <td><a href="#">3232</a></td>
        <td>Payment Realized</td>
        <td><a href="#">-</a></td>
        <td rowspan="1">-</td>
        <td rowspan="1">-</td>
        <td rowspan = "1">-</td>
      </tr>
    </tbody>
  </table>
</div>
</div>
          </div>
        </div>
    </div>

 <div class="container-fluid section5">
      <div class="row">
        <div class="tab-content">
          <div id="supplierPaymentDetails" class="tab-pane fade in active">
          <div class="panel panel-default">
  <!-- Default panel contents -->
  <div class="panel-heading">
    <ul class="list-inline"> 
      <li class="list-inline-item"><h5>Supplier Payment Details&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h5> </li>
      <span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>
      <li class="list-inline-item">Notification </li>
    </ul>
  </div>           
  <table id="section5Table" class="table table-bordered" style="padding:0; margin: 0;">
    <thead style="padding:0; margin: 0;">
      <tr>
        <th colspan ="1" rowspan="2" style="border-top: none;"><b>Supplier Name</b></th>
        <th colspan="1" rowspan="2" style="word-wrap:break-word;"><b>Net Payable to Supplier</b></th>
        <th colspan="6" style="text-align:center;"><b>Payment Details</b></th>
      </tr>
    </thead>
    <thead style="padding:0; margin: 0;">
      <tr>
        <th rowspan ="0" colspan="1" style="border-top: none;"></th>
        <th colspan="1" style="border-top: none;"></th>
        <th colspan="1"><b>Type of Settlement</b></th>
        <th colspan="1"><b>Payment Due Date</b></th>
        <th colspan="1"><b>Amount</b></th>
        <th colspan="1"><b>Payment Date</b></th>
        <th colspan="1"><b>Payment Advice ID</b></th>
        <th colspan="1"><b>Payment Ref No.</b></th>
        <th colspan="1"><b>Status</b></th>
      </tr>
    </thead>
    <tbody>
    <tr>
        <td colspan="1" rowspan="2">Jet Airways</td>
        <td colspan="1" rowspan="2">INR 45900</td>
        <td colspan="1" rowspan="1">Credit</td>
        <td>25 Oct 2014</td>
        <td>INR 34425</td>
        <td>-</td>
        <td>&nbsp;</td>
        <td>-</td>
        <td>Pending</td>
      </tr>
      <tr>
        <td colspan="1" rowspan="1">Credit</td>
        <td>12 Oct 2014</td>
        <td>INR 11475</td>
        <td>12 Oct 2014</td>
        <td><a href="#">1234</a></td>
        <td>3211</td>
        <td>Paid</td>
      </tr>
    </tbody>
  </table>
</div>
          </div>
        </div>
     </div>
  </div>
 
 <!-- <div class="footer" style="border-top:;
    margin: ;
    padding: 25px 0 0 0;
    clear: both">
 </div> -->

<div class="panel-footer outer-border">
								<ul class="row">
									<li class="text-right col-md-12">
										<div class="margin-bottom">
											<button id="saveButton" type="button" class="btn btn-primary btn-sm">Save</button>
											<button class="btn btn-default btn-sm " type="submit ">Cancel</button>
											<button class="btn btn-default btn-sm disabled " type="submit ">Release Lock</button>
											<button class="btn btn-default btn-sm disabled " type="submit ">Edit</button>
											<button class="btn btn-default btn-sm " type="submit ">Submit</button>
										</div>
									</li>
									<li>
										<div class="col-md-5 pull-right text-right ">
											<label class="col-md-2 entries ">Remark</label>
											<div class="col-md-6 text-right entries ">
												<input type="text " class="form-control " value=" " placeholder="INR XXXX ">
											</div>
											<div>
												<button class="btn btn-default btn-sm disabled " type="submit ">Approve</button>
												<button class="btn btn-default btn-sm disabled " type="submit ">Reject</button>
											</div>
										</div>
									</li>
								</ul>
							</div>
 
 
 		<button id="saveButton" type="submit" class="btn btn-primary btn-sm">Save</button>
</body>									
 
 
 <!--html content  -->
  <%-- <div class="container-fluid section1">
   <div class="row">
	<ul class="nav nav-tabs">
          <li class="active"><a data-toggle="tab" href="#bookingOverview"><spring:theme code="cnk.booking.details" /></a></li>
          <li><a data-toggle="tab" href="#documentation"><spring:theme code="cnk.booking.documentation" /></a></li>
          <li><a data-toggle="tab" href="#todoTasks"><spring:theme code="cnk.booking.todotasks" /></a></li>
    </ul>
	<div class="tab-content">
		<booking:bookingOverviewTab/>
		<booking:bookingDocumentationTab/>
		<booking:bookingToDoTaskTab/>
	</div>
   </div>
   </div> --%>

