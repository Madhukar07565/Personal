<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Cox and Kings</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/cnk.css" rel="stylesheet">
  <link href = "css/CKIL_235246.css" rel = "stylesheet">
	<link href="css/slick.css" rel="stylesheet">
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/handlebars.js/1.0.rc.1/handlebars.min.js"></script>
  </head>
  <body>
    <header>
		<div class="container">
			<div class="navbar-header">
				<button aria-controls="navbar" aria-expanded="false" data-target="#navbar" data-toggle="collapse" class="navbar-toggle collapsed" type="button">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a href="#" class="navbar-brand"><img src="images/logo-cnk.gif" /></a>
			</div>
			<div class="collapse navbar-collapse" id="navbar">
				<div class="float-right">
					<div class="select-country">Country: <label> <img src="images/flag_india.gif"/> India</label> <i class="icons-dn-arrow"></i></div>
					<ul class="person-dtl">
						<li><i class="glyphicon glyphicon-user"></i> Mr AnilKumar</li>
						<li>
							<div class="mail-head"><i class="glyphicon glyphicon-envelope"></i> anilkumar@gmail.com</div>
							<div class="phone-head"><i class="glyphicon glyphicon-earphone"></i> +91 7453625373</div>
						</li>
					</ul>
				</div>
				<div class="counter-value">
					<div class="col-sm-4 comm-container row">
						<h4>External <span>Communication</span></h4>
						<div class="row">
							<div class="counter">
								<button class="comm-blocks">
									<i class="glyphicon glyphicon-envelope"></i>
									<cite>42</cite>
								</button>
							</div>
							<div class="counter">
								<button class="comm-blocks">
									<i class="glyphicon glyphicon-earphone"></i>
									<cite>4</cite>
								</button>
							</div>
							<div class="counter">
								<button class="comm-blocks">
									<i class="glyphicon glyphicon-user"></i>
									<cite>2</cite>
								</button>
							</div>
							<div class="counter">
								<button class="btn btn-default" type="button">
									<i class="glyphicon glyphicon-plus"></i>
								</button>
							</div>
						</div>
					</div>
					<div class="col-sm-4 comm-container row">
						<h4>Internal <span>Communication</span></h4>
						<div class="row">
							<div class="counter">
								<button class="comm-blocks">
									<i class="glyphicon glyphicon-envelope"></i>
									<cite>42</cite>
								</button>
							</div>
							<div class="counter">
								<button class="btn btn-default" type="button">
									<i class="glyphicon glyphicon-plus"></i>
								</button>
							</div>
						</div>
					</div>
				</div>
				<!--ul class="nav navbar-nav">
					<li class="active"><a href="#">Your Booking</a></li>
					<li><a href="#about">GDS Queue</a></li>
					<li><a href="#contact">Supplier Bill Passing</a></li>
				</ul-->
			</div><!--/.nav-collapse -->
		</div>
	</header>
	<article>
		<div class="main">
			<div class="container">
				<h1>Booking <span>Details</span></h1>
				<!-- Start Booking Overview -->
				<section class="booking-overview clearfix">
					<ul class="nav nav-tabs">
						<li class="active"><a href="#bookingOverview" data-toggle="tab">Booking Overview</a></li>
						<li><a href="#documentation" data-toggle="tab">Documentation</a></li>
						<li><a href="#todoTasks" data-toggle="tab">To Do Tasks</a></li>
					</ul>
					<div class="tab-content">

						<div class="tab-pane fade in active" id="bookingOverview">
						<form class="form-horizontal" id="booking-details-container">
							<script id="booking-details-template" type="text/x-handlebars-template">
								<ul class="container-fluid row element-control">
									<li class="col-md-3">
										<div class="form-group">
										<label class="col-md-12 control-label" for="inputEmail3">Booking Reference No.</label>
										<div class="col-md-12">
											<input type="text" disabled="" value={{booking_details.booking_reference_no}} id="inputEmail3" class="form-control">
										</div>
										</div>
									</li>
									<li class="col-md-3">
									<div class="form-group">
										<label class="col-md-12 control-label" for="inputEmail3">Booking Date Time</label>
										<div class="col-md-12">
											<input type="text" disabled="" value={{booking_details.booking_date_time}} id="inputEmail3" class="form-control">
										</div>
										</div>
									</li>
									<li class="col-md-3">
									<div class="form-group">
										<label class="col-md-12 control-label" for="inputEmail3">QC Status</label>
										<div class="col-md-12">
											<input type="text" disabled="" value={{booking_details.QC_status}} id="inputEmail3" class="form-control">
										</div>
										</div>
									</li>
									<li class="col-md-3">
									<div class="form-group">
										<label class="col-md-12 control-label" for="inputEmail3">SAP File Reference</label>
										<p>{{booking_details.SAP_file_reference}}</p>
										<div class="msg-label col-md-12">
											<i aria-hidden="true" class="glyphicon glyphicon-info-sign"></i>
											<div class="error-msg">Transaction Failure</div>
										</div>
										</div>
									</li>
								</ul>
								<ul class="container-fluid row element-control">
									<li class="col-md-3">
										<div class="form-group">
										<label class="col-md-12 control-label" for="">Travel Request ID</label>
										<div class="col-md-12">
											<a href="#">{{booking_details.travel_request_ID1}}</a>
										</div>
										</div>
									</li>
									<li class="col-md-3">
									<div class="form-group">
										<label class="control-label col-md-12" for="">Travel Request ID</label>
										<div class="col-md-12">
											<a href="#">{{booking_details.travel_request_ID2}}</a>
										</div>
										</div>
									</li>
									<li class="col-md-3">
									<div class="form-group">
										<label class="control-label col-md-12" for="">Client Referral</label>
										<div class="col-md-12">
											<a href="#">{{booking_details.client_referral}}</a>
										</div>
										</div>
									</li>
								</ul>
							</script>
							</form>
						</div>
						<div class="tab-pane fade" id="documentation">
							<!-- <h3>Documentation</h3> -->
							<!-- <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p> -->
              <!-- <link rel="import" href="CKIL_235246.html"> -->

              <!-- Documentation content starts here -->
            <section>
              <table cellpadding="0" cellspacing="0" border="0" valign="top" class="main-table" width="100%">
                <tr class="full-column">
                  <th colspan="4">
                    <label>Documentation</label>
                    <div class="other-events">
                      <label>Booking Reference Number: <span>EZ2343244234</span></label>
                    </div>
                  </th>
                </tr>
              </table>
              <div class="flight-details">
                <div>
                  <table  cellpadding="0" cellspacing="0" border="0" valign="top" class="main-table" width="3890px">
                    <tr>
                      <td valign="top" class="sub-table">
                        <table cellpadding="0" cellspacing="0" border="1" valign="top" width="100%" >
                          <tr>
                            <th colspan="10" class="blankHeader" width="1200px"></th>
                            <th colspan="5"><label>Passport Details</label> <div class="float-right exp-collapse" data-item="spec-info"><i class="glyphicon glyphicon-menu-left"></i></div></th>
                            <th colspan="7"><label>Visa Details</label> <div class="float-right exp-collapse" data-item="price-dtl"><i class="glyphicon glyphicon-menu-left"></i></div></th>
                            <th colspan="2"><label>Status</label>
                            <th colspan="6"><label>Action</label>
                          </tr>
                          <tr >
                            <th rowspan="1" width="80px" >Product Name</th>
                            <th rowspan="1" width="150px">Document Name</th>
                            <th rowspan="1" width="150px">Document by</th>
                            <th rowspan="1" width="180px">Document ID</th>
                            <th rowspan="1" width="60px">Document</th>
                            <th rowspan="1" width="60px">Document Format</th>
                            <th rowspan="1" width="80px">Cut-off Due Date</th>
                            <th rowspan="1" width="150px">Mode of Communication</th>
                            <th rowspan="1" width="120px">Passenger Name</th>
                            <th rowspan="1" width="80px">Document Received Date</th>

                            <th rowspan="1" width="100px">Passport Number</th>
                            <th rowspan="1" width="80px">Passport Date of Issue</th>
                            <th rowspan="1" width="100px">Passport Expiry Date</th>
                            <th rowspan="1" width="80px">Passport Place of Issue</th>
                            <th rowspan="1" width="150px">Nationality</th>


                            <th rowspan="1" width="130px">Country</th>
                            <th rowspan="1" width="130px">Duration of Visa - days</th>
                            <th rowspan="1" width="150px">Visa - Number of entries</th>
                            <th rowspan="1">Type of Visa</th>
                            <th rowspan="1" width="100px">Purpose of Visit</th>
                            <th rowspan="1">Visa Valid From Date </th>
                            <th rowspan="1" width="80px">Visa Valid To Date</th>

                            <th colspan="2" width="200px">Documentation Status</th>

                            <th rowspan="1" width="200px">View</th>
                            <th rowspan="1" width="130px">Edit</th>
                            <th rowspan="1" width="150px">Upload</th>
                            <th rowspan="1">Print</th>
                            <th rowspan="1" width="100px">Copy</th>
                            <th rowspan="1">Communication</th>
                          </tr>

                          <tr>
                            <td rowspan="4">
                                Visa
                            </td>
                            <td rowspan="4">
                                United Kingdom Visa Form
                            </td>
                            <td rowspan="4">
                                Sent- Company to Customer<br>Received- Customer to Company
                            </td>
                            <td rowspan="4">
                                NA
                            </td>
                            <td rowspan="4">
                                Passenger Wise
                            </td>
                            <td rowspan="4">
                                Original
                            </td>
                            <td rowspan="4">
                                20/12/2014
                            </td>
                            <td rowspan="4">
                                Email
                            </td>
                          </tr>

                          <tr>
                            <td>
                                John Smith
                            </td>
                            <td>
                              25/01/2015
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td>
                              United Kingdom
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td>
                              <select>
                                <option selected="true">Verified</option>
                                <option>Rejected</option>
                                <option>Pending</option>
                              </select>
                            </td>
                            <td>
                              <span><input type="text" value="Remarks"></span>
                            </td>
                            <td class="alignLeft">
                              <a href="#">Document Sent</a><br>
                              <a href="#">Document Received</a>
                              <a href="#"><span class="glyphicon glyphicon-remove"></span></a>
                            </td>
                            <td>
                                NA
                            </td>
                            <td>
                              <a href="#">  <span class="glyphicon glyphicon-file" ></span> View</a>
                            </td>
                            <td>
                              <a href="#">
                                <span class="glyphicon glyphicon-print"></span>
                              </a>
                            </td>
                            <td>
                              <a href="#">
                                Copy
                              </a>
                            </td>
                            <td>
                              <a href="#">
                                <span class="glyphicon glyphicon-envelope"></span>
                                1
                              </a>
                              <a href="#">
                                &nbsp;&nbsp;Send
                              </a>
                            </td>
                          </tr>
                          <tr>
                            <td>
                                Jane Smith
                            </td>
                            <td>
                              25/01/2015
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td>
                              United Kingdom
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td>
                              <select>
                                <option selected="true">Verified</option>
                                <option>Rejected</option>
                                <option>Pending</option>
                              </select>
                            </td>
                            <td>
                              <span><input type="text" value="Remarks"></span>
                            </td>
                            <td class="alignLeft">
                              <a href="#">Document Sent</a><br>
                              <a href="#">Document Received</a>
                              <a href="#"><span class="glyphicon glyphicon-remove"></span></a>
                            </td>
                            <td>
                                NA
                            </td>
                            <td>
                              <a href="#">  <span class="glyphicon glyphicon-file" ></span> View</a>
                            </td>
                            <td>
                              <a href="#">
                                <span class="glyphicon glyphicon-print"></span>
                              </a>
                            </td>
                            <td>
                              NA
                            </td>
                            <td>
                              <a href="#">
                                <span class="glyphicon glyphicon-envelope"></span>
                                1
                              </a>
                              <a href="#">
                                &nbsp;&nbsp;Send
                              </a>
                            </td>


                          </tr>
                          <tr>
                            <td>
                                Jill Smith
                            </td>
                            <td>

                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td>
                              United Kingdom
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td>
                              <select>
                                <option>Verified</option>
                                <option>Rejected</option>
                                <option selected="true">Pending</option>
                              </select>
                            </td>
                            <td>
                              <span><input type="text" disabled="true" value="Remarks"></span>
                            </td>
                            <td>
                              <a href="#">Document Sent</a>

                            </td>
                            <td>
                                NA
                            </td>
                            <td>
                              <a href="#">  <span class="glyphicon glyphicon-file" ></span> View</a>
                            </td>
                            <td>
                              <a href="#">
                                <span class="glyphicon glyphicon-print"></span>
                              </a>
                            </td>
                            <td>
                              <a href="#">
                                Copy
                              </a>
                            </td>
                            <td>
                              <a href="#">
                                <span class="glyphicon glyphicon-envelope"></span>
                                1
                              </a>
                              <a href="#">
                                &nbsp;&nbsp;Send
                              </a>
                            </td>


                          </tr>

                          <!-- Second set of rows -->

                          <tr>
                            <td rowspan="4">
                                Visa
                            </td>
                            <td rowspan="4">
                                France Visa Form
                            </td>
                            <td rowspan="4">
                                Sent- Company to Customer<br>Received- Customer to Company
                            </td>
                            <td rowspan="4">
                                NA
                            </td>
                            <td rowspan="4">
                                Passenger Wise
                            </td>
                            <td rowspan="4">
                                Original
                            </td>
                            <td rowspan="4">
                                20/12/2014
                            </td>
                            <td rowspan="4">
                                Email
                            </td>
                          </tr>

                          <tr>
                            <td>
                                John Smith
                            </td>
                            <td>
                              25/01/2015
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td>
                              United Kingdom
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td>
                              <select>
                                <option>Verified</option>
                                <option selected="true">Rejected</option>
                                <option>Pending</option>
                              </select>
                            </td>
                            <td>
                              <span><input type="text" value="Remarks"></span>
                            </td>
                            <td class="alignLeft">
                              <a href="#">Document Sent</a><br>
                              <a href="#">Document Received</a>
                              <a href="#"><span class="glyphicon glyphicon-remove"></span></a>
                            </td>
                            <td>
                                NA
                            </td>
                            <td>
                              <a href="#">  <span class="glyphicon glyphicon-file" ></span> View</a>
                            </td>
                            <td>
                              <a href="#">
                                <span class="glyphicon glyphicon-print"></span>
                              </a>
                            </td>
                            <td>
                              <a href="#">
                                Copy
                              </a>
                            </td>
                            <td>
                              <a href="#">
                                <span class="glyphicon glyphicon-envelope"></span>
                                1
                              </a>
                              <a href="#">
                                &nbsp;&nbsp;Send
                              </a>
                            </td>
                          </tr>
                          <tr>
                            <td>
                                Jane Smith
                            </td>
                            <td>
                              25/01/2015
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td>
                              United Kingdom
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td>
                              <select>
                                <option Pending>Verified</option>
                                <option>Rejected</option>
                                <option>Pending</option>
                              </select>
                            </td>
                            <td>
                              <span><input type="text" value="Remarks"></span>
                            </td>
                            <td class="alignLeft">
                              <a href="#">Document Sent</a><br>
                              <a href="#">Document Received</a>
                              <a href="#"><span class="glyphicon glyphicon-remove"></span></a>
                            </td>
                            <td>
                                NA
                            </td>
                            <td>
                              <a href="#">  <span class="glyphicon glyphicon-file" ></span> View</a>
                            </td>
                            <td>
                              <a href="#">
                                <span class="glyphicon glyphicon-print"></span>
                              </a>
                            </td>
                            <td>
                              NA
                            </td>
                            <td>
                              <a href="#">
                                <span class="glyphicon glyphicon-envelope"></span>
                                1
                              </a>
                              <a href="#">
                                &nbsp;&nbsp;Send
                              </a>
                            </td>


                          </tr>
                          <tr>
                            <td>
                                Jill Smith
                            </td>
                            <td>

                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td>
                              United Kingdom
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <span><input type="text" value=""></span>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td>
                              <select>
                                <option></option>
                                <option>....</option>
                              </select>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td class="set-date">
                              <div class="date-time">
                                <input type="date" value="2014-10-25">
                              </div>
                            </td>
                            <td>
                              <select>
                                <option>Verified</option>
                                <option>Rejected</option>
                                <option selected="true">Pending</option>
                              </select>
                            </td>
                            <td>
                              <span><input type="text"  disabled="true" value="Remarks"></span>
                            </td>
                            <td>
                              <a href="#">Document Sent</a>

                            </td>
                            <td>
                                NA
                            </td>
                            <td>
                              <a href="#">  <span class="glyphicon glyphicon-file" ></span> View</a>
                            </td>
                            <td>
                              <a href="#">
                                <span class="glyphicon glyphicon-print"></span>
                              </a>
                            </td>
                            <td>
                              <a href="#">
                                Copy
                              </a>
                            </td>
                            <td>
                              <a href="#">
                                <span class="glyphicon glyphicon-envelope"></span>
                                1
                              </a>
                              <a href="#">
                                &nbsp;&nbsp;Send
                              </a>
                            </td>


                          </tr>

                          <!-- 3rd set of rows -->

                          <tr>
                            <td rowspan="4">
                                Hotel Novotel
                            </td>
                            <td rowspan="4">
                                Voucher
                            </td>
                            <td rowspan="4">
                                Sent- Company to Customer
                            </td>
                            <td rowspan="4">
                                32456
                            </td>
                            <td rowspan="4">
                                Passenger Wise
                            </td>
                            <td rowspan="4">
                                PDF
                            </td>
                            <td rowspan="4">
                                NA
                            </td>
                            <td rowspan="4">
                                Email
                            </td>
                          </tr>

                          <tr>
                            <td>
                                John Smith
                            </td>
                            <td rowspan="3">
                              NA
                            </td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>

                            <td rowspan="3">
                              <select>
                                <option>Verified</option>
                                <option>Rejected</option>
                                <option selected="true">Pending</option>
                              </select>
                            </td>
                            <td rowspan="3"></td>
                            <td rowspan="3" class="alignLeft">
                              <a href="#">Customer</a><br>
                              <a href="#">MDS</a><br>
                              <a href="#">Supplier</a>

                            </td>
                            <td rowspan="3"><a href="#">Edit</a></td>
                            <td rowspan="3">
                              <a href="#">  <span class="glyphicon glyphicon-file" ></span></a>
                            </td>
                            <td rowspan="3"></td>
                            <td rowspan="3"></td>
                            <td rowspan="3">
                              <a href="#">
                                <span class="glyphicon glyphicon-envelope"></span>
                                1
                              </a>
                              <a href="#">
                                &nbsp;&nbsp;Send
                              </a>
                            </td>

                          </tr>


                          <tr>
                            <td>
                                Jane Smith
                            </td>
                            <!-- <td rowspan="4">
                              NA
                            </td> -->
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>


                          </tr>

                          <tr>
                            <td>
                                Jill Smith
                            </td>
                            <!-- <td rowspan="4">
                              NA
                            </td> -->
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>
                            <td class="disabledCol"></td>


                          </tr>

                            <!-- 4th set of rows -->
                            <tr>
                              <td rowspan="1">
                                  Forex
                              </td>
                              <td rowspan="1">
                                  BTQ
                              </td>
                              <td rowspan="1">

                                    Sent- Company to Customer<br>
                                    Received- Customer to Company

                              </td>
                              <td rowspan="1">
                                  NA
                              </td>
                              <td rowspan="1">
                                  Lead Passenger
                              </td>
                              <td rowspan="1">
                                  PDF
                              </td>
                              <td rowspan="1">
                                  NA
                              </td>
                              <td rowspan="1">
                                  Email
                              </td>

                              <td>
                                  John Smith X 3
                              </td>
                              <td>
                                NA
                              </td>
                              <td class="disabledCol"></td>
                              <td class="disabledCol"></td>
                              <td class="disabledCol"></td>
                              <td class="disabledCol"></td>
                              <td class="disabledCol"></td>
                              <td class="disabledCol"></td>
                              <td class="disabledCol"></td>
                              <td class="disabledCol"></td>
                              <td class="disabledCol"></td>
                              <td class="disabledCol"></td>
                              <td class="disabledCol"></td>
                              <td class="disabledCol"></td>

                              <td rowspan="1">
                                <select>
                                  <option>Verified</option>
                                  <option>Rejected</option>
                                  <option selected="true">Pending</option>
                                </select>
                              </td>
                              <td></td>
                              <td></td>
                              <td></td>
                              <td>
                                <a href="#">  <span class="glyphicon glyphicon-file" ></span></a>
                              </td>
                              <td></td>
                              <td></td>
                              <td>
                                <a href="#">
                                  <span class="glyphicon glyphicon-envelope"></span>
                                  1
                                </a>
                                <a href="#">
                                  &nbsp;&nbsp;Send
                                </a>
                              </td>

                            </tr>



                        </table>
                      </td>
                    </tr>
                  </table>
                </div>

            </section>


            <div class="container marginSpacing">

                    <div class="float-right buttonMargin">
                      <button type="button" class="btn btn-success btn-sm">Save</button>
                      <button type="button" class="btn btn-success btn-sm">Edit</button>
                      <button type="button" class="btn btn-success btn-sm">Release Lock</button>
                      <button type="button" class="btn btn-warning btn-sm">Cancel</button>

                    </div>
            </div>


            <!-- Documentation content ends here -->

						</div>
						<div class="tab-pane fade" id="todoTasks">
							<h3>To Do Tasks</h3>
							<p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam.</p>
						</div>

					</div>
				</section>
				<!-- End Booking Overview & Start Product Summary -->
				<section class="panel panel-default product-view" id="product-summary-container">
				<script id="product-summary-template" type="text/x-handlebars-template">
					<div class="panel-heading">Product Summary</div>
					<div class="panel-body tab-content">

						<div class="product-slide" id="productSummary">
							<div class="product-items flight">
								<div class="item-group">
									<i aria-hidden="true" class="glyphicon glyphicon-plane big-icon"></i>
									<button class="active" data-list="list1">
										<div class="info-head"><i aria-hidden="true" class="glyphicon glyphicon-plane"></i><label>{{product_summary.from_to}}</label></div>
										<div class="info-med">{{product_summary.time}}</div>
										<div class="info-bottom">{{product_summary.name_details}}</div>
									</button>
									<button class="" data-list="list2">
										<div class="info-head"><i aria-hidden="true" class="glyphicon glyphicon-plane"></i><label>{{product_summary.to_from}}</label></div>
										<div class="info-med">{{product_summary.return_time}}</div>
										<div class="info-bottom">{{product_summary.return_name_details}}</div>
									</button>
								</div>
							</div>
							<div class="product-items hotel">
								<div class="item-group">
									<i aria-hidden="true" class="glyphicon glyphicon-bed big-icon"></i>
									<button>
										<div class="info-head"><i aria-hidden="true" class="glyphicon glyphicon-bed"></i><label>{{product_summary.hotel_name}}</label></div>
										<div class="info-med">{{product_summary.hotel_location}} <p> {{product_summary.stay_details}}</p></div>
										<div class="info-bottom">{{product_summary.user_details}}</div>
									</button>
								</div>
							</div>
							<div class="product-items tansport">
								<div class="item-group">
									<i aria-hidden="true" class="glyphicon glyphicon-transfer big-icon"></i>
									<button>
										<div class="info-head"><i aria-hidden="true" class="glyphicon glyphicon-transfer"></i><label>{{product_summary.bus_travel_to}}</label></div>
										<div class="info-med">{{product_summary.bus_travel_date}}</div>
										<div class="info-bottom">{{product_summary.bus_booking_name}}</div>
									</button>
								</div>
							</div>
						</div>
						<ul class="overview-outstading">
							<li class="col-sm-4">
								<div><label>Total Invoice:</label>  {{product_summary.total_invoice}}</div>
							</li>
							<li class="col-sm-4">
								<div><label>Total Collection:</label> {{product_summary.total_invoice}}</div>
							</li>
							<li class="col-sm-4">
								<div><label>Total Outstanding:</label> {{product_summary.total_invoice}}</div>
							</li>
						</ul>

					</div>
				</script>
				</section>
				<!-- End Product Summary & Start Flight Details -->
				<section class="panel panel-default flight-table" id="file-handler-container">
				<script id="file-handler-template" type="text/x-handlebars-template">
						<div class="panel-heading main-heading">
						<label>File Details</label>
						<div class="other-events">
									<label>File Handler: <span>{{file_handler.name}}</span></label>
									<a href="#."><i class="glyphicon glyphicon-info-sign" aria-hidden="true"></i> Flight Time Changed</a>
									<a href="#."><i class="glyphicon glyphicon-info-sign" aria-hidden="true"></i> Amendment</a>
								</div>
							</div>
					<div class="passenger-details panel-body">
						<div id="list1" class="travel-list auto-overflow active">
							<table cellpadding="0" cellspacing="0" border="0" valign="top" class="main-table" width="3890px">
								<tr>
									<td valign="top" class="sub-table" width="1130px">
										<table cellpadding="0" cellspacing="0" border="1" valign="top" width="100%" >
											<tr class="three-column">
												<th colspan="9"><label>Product &amp; Passenger Information</label></th>
												<th colspan="7" class="main-spec-info"><label>Other Special Information</label> <div class="float-right exp-collapse" data-item="spec-info"><i class="glyphicon glyphicon-menu-left"></i></div></th>
												<th colspan="15" class="main-price-dtl"><label>Price Details</label> <div class="float-right exp-collapse" data-item="price-dtl"><i class="glyphicon glyphicon-menu-left"></i></div></th>
												<th rowspan="3"><label>Action</label></th>
											</tr>
											<tr>
												<th rowspan="2" width="180px">Passenger Name</th>
												<th rowspan="2" width="150px">Flight Details</th>
												<th rowspan="2" width="150px">Departure-Arrival Details</th>
												<th rowspan="2" width="180px">Class-RBD-Fare Basis-Ticket No</th>
												<th rowspan="2" width="60px">GDS PNR</th>
												<th rowspan="2" width="60px">Airline PNR</th>
												<th rowspan="2" width="80px">Booking Status</th>
												<th rowspan="2" width="150px">Time Limit Expiry Date</th>
												<th rowspan="2" width="120px">Amendment/Cancellation Date</th>

												<th rowspan="2" width="150px" class="spec-info">D.O.B.</th>
												<th rowspan="2" width="100px" class="spec-info">Meal Preference</th>
												<th rowspan="2" width="100px" class="spec-info">Special Request</th>
												<th rowspan="2" width="80px" class="spec-info">Flight Seat No.</th>
												<th rowspan="2" width="150px" class="spec-info">Credential Name / PCC</th>
												<th rowspan="2" width="80px" class="spec-info">Ticketing PCC</th>
												<th rowspan="2" width="80px" class="spec-info">Inventory</th>

												<th rowspan="2" width="130px" class="price-dtl">Source Supplier</th>
												<th rowspan="2" width="130px" class="price-dtl">Enabler Supplier</th>
												<th rowspan="2" width="150px" class="price-dtl">Refundable/Non-Refundable</th>
												<th colspan="6" class="price-dtl">Selling Price Details</th>
												<th rowspan="2" width="100px" class="price-dtl">Actual Margin Amount</th>
												<th colspan="4" class="price-dtl">Supplier Pricing Details</th>
												<th rowspan="2" width="80px" class="price-dtl">Offers Applied</th>
											</tr>
											<tr>
												<th width="120px" class="price-dtl">Total Selling Price</th>
												<th width="120px" class="price-dtl">Commission</th>
												<th width="60px" class="price-dtl">Discount Value</th>
												<th width="80px" class="price-dtl">Total Net Selling Price</th>
												<th width="200px" class="price-dtl">Company Cancellation Charges</th>
												<th width="150px" class="price-dtl">Company Amendment Charges</th>
												<th width="80px" class="price-dtl">Net Payble to Supplier</th>
												<th width="150px" class="price-dtl">Supplier Cancellation Charges</th>
												<th width="150px" class="price-dtl">Supplier Amendment Charges</th>
												<th width="120px" class="price-dtl">Total Net Payble to Supplier</th>
											</tr>
                                            {{#each file_handler.product_passenger_information1}}
											<tr>
                                                {{#if this.passenger_name}}
												<td rowspan={{this.passenger_name.rowspan}}>{{this.passenger_name.data}}</td>
                                                {{/if}}
                                                {{#if this.flight_details}}
												<td rowspan={{this.flight_details.rowspan}}>
													<div class="block-info">
														<label>Sector</label>
														<span>{{this.flight_details.Sector}}</span>
													</div>
													<div class="block-info">
														<label>Flight Number</label>
														<span><input type="text" value={{this.flight_details.flight_number}} class="form-control"></span>
													</div>
													<div class="block-info">
														<label>(Onward)</label>
													</div>
												</td>
                                                {{/if}}
                                                {{#if this.departure_arrival_details}}
												<td rowspan={{this.departure_arrival_details.rowspan}} class="set-date">
													<label>Departure</label>
													<div class="date-time">
														<input type="date" value={{this.departure_arrival_details.departure1}} class="form-control">
														<input type="date" value={{this.departure_arrival_details.departure2}} class="form-control">
													</div>
													<label>Arrival</label>
													<div class="date-time">
														<input type="date" value={{this.departure_arrival_details.arrival1}} class="form-control">
														<input type="date" value={{this.departure_arrival_details.arrival2}} class="form-control">
													</div>
												</td>
                                                {{/if}}
                                                {{#if this.class_RBD_fareBasis_ticketNo}}
												<td rowspan={{this.class_RBD_fareBasis_ticketNo.rowspan}}>{{this.class_RBD_fareBasis_ticketNo.data}}</td>
                                                {{/if}}
                                                {{#if this.GDS_PNR}}
												<td rowspan={{this.GDS_PNR.rowspan}}>{{this.GDS_PNR.data}}</td>
                                                {{/if}}
                                                {{#if this.airline_PNR}}
												<td rowspan={{this.airline_PNR.rowspan}}>{{this.airline_PNR.data}}</td>
                                                {{/if}}
                                                {{#if this.booking_status}}
												<td rowspan={{this.booking_status.rowspan}}>
													<select class="form-control">
                                                        {{#each this.booking_status.data}}
														<option>{{this}}</option>
                                                        {{/each}}
													</select>
												</td>
                                                {{/if}}
                                                {{#if this.timeLimit_expiry_date}}
												<td rowspan={{this.timeLimit_expiry_date.rowspan}} class="date-time set-date">
													<input type="date" value={{this.timeLimit_expiry_date.data1}} class="form-control">
													<input type="date" value={{this.timeLimit_expiry_date.data2}} class="form-control">
												</td>
                                                {{/if}}
                                                {{#if this.amendment_cancellation_date}}
												<td rowspan={{this.amendment_cancellation_date.rowspan}}> {{this.amendment_cancellation_date.data}} </td>
                                                {{/if}}
                                                {{#if this.DOB}}
												<td rowspan={{this.DOB.rowspan}} class="spec-info set-date"><input type="date" value={{this.DOB.data}} class="form-control" ></td>
                                                {{/if}}
                                                {{#if this.meal_preference}}
												<td rowspan={{this.meal_preference.rowspan}} class="spec-info">
													<select class="form-control">
                                                        {{#each this.meal_preference.data}}
														<option>{{this}}</option>
                                                        {{/each}}
													</select>
												</td>
                                                {{/if}}
                                                {{#if this.special_request}}
												<td rowspan={{this.special_request.rowspan}} class="spec-info"><input type="text" value="{{this.special_request.data}}" class="form-control" /></td>
                                                {{/if}}
												{{#if this.flight_seat_no}}
                                                <td rowspan={{this.flight_seat_no.rowspan}} class="spec-info">{{this.flight_seat_no.data}}</td>
                                                {{/if}}
												{{#if this.credential_name}}
                                                <td rowspan={{this.credential_name.rowspan}} class="spec-info">{{this.credential_name.data}}</td>
                                                {{/if}}
												{{#if this.ticketing_PCC}}
                                                <td rowspan={{this.ticketing_PCC.rowspan}} class="spec-info">
													<select class="form-control">
                                                        {{#each this.ticketing_PCC.data}}
														<option>{{this}}</option>
                                                        {{/each}}
													</select>
												</td>
                                                {{/if}}
												{{#if this.inventory}}
                                                <td rowspan={{this.inventory.rowspan}} class="spec-info">{{this.inventory.data}}</td>
                                                {{/if}}
                                                {{#if this.source_supplier}}
												<td rowspan={{this.source_supplier.rowspan}} rowspan="3" class="price-dtl">{{this.source_supplier.data}}</td>
                                                {{/if}}
												{{#if this.enabler_supplier}}
                                                <td rowspan={{this.enabler_supplier.rowspan}} rowspan="3" class="price-dtl">{{this.enabler_supplier.data}}</td>
                                                {{/if}}
												{{#if this.refundable_nonRefundable}}
                                                <td rowspan={{this.refundable_nonRefundable.rowspan}} class="price-dtl">{{this.refundable_nonRefundable.data}}</td>
                                                {{/if}}
												{{#if this.total_selling_price}}
                                                <td rowspan={{this.total_selling_price.rowspan}} class="price-dtl"><a href="#.">{{this.total_selling_price.data}}</a></td>
                                                {{/if}}
												{{#if this.commission}}
                                                <td rowspan={{this.commission.rowspan}} class="price-dtl"> {{this.commission.data}} </td>
                                                {{/if}}
												{{#if this.discount_value}}
                                                <td rowspan={{this.discount_value.rowspan}} class="price-dtl"> {{this.discount_value.data}} </td>
                                                {{/if}}
												{{#if this.total_net_selling_price}}
                                                <td rowspan={{this.total_net_selling_price.rowspan}} class="price-dtl">{{this.total_net_selling_price.data}}</td>
                                                {{/if}}
												{{#if this.company_cancellation_charges}}
                                                <td rowspan={{this.company_cancellation_charges.rowspan}} class="price-dtl"><input type="text" value="{{this.company_cancellation_charges.data}}" class="form-control" /></td>
                                                {{/if}}
												{{#if this.company_amendment_charges}}
                                                <td rowspan={{this.company_amendment_charges.rowspan}} class="price-dtl"><input type="text" value="{{this.company_amendment_charges.data}}" class="form-control" /></td>
                                                {{/if}}
												{{#if this.actual_margin_amount}}
                                                <td rowspan={{this.actual_margin_amount.rowspan}} class="price-dtl">{{this.actual_margin_amount.data}}</td>
                                                {{/if}}
												{{#if this.net_payble_to_supplier}}
                                                <td rowspan={{this.net_payble_to_supplier.rowspan}} class="price-dtl"><a href="#.">{{this.net_payble_to_supplier.data}}</a></td>
                                                {{/if}}
												{{#if this.supplier_cancellation_charges}}
                                                <td rowspan={{this.supplier_cancellation_charges.rowspan}} class="price-dtl"><input type="text" value="{{this.supplier_cancellation_charges.data}}" class="form-control" /></td>
                                                {{/if}}
												{{#if this.supplier_amendment_charges}}
                                                <td rowspan={{this.supplier_amendment_charges.rowspan}} class="price-dtl"><input type="text" value="{{this.supplier_amendment_charges.data}}" class="form-control" /></td>
                                                {{/if}}
												{{#if this.total_net_payble_to_supplier}}
                                                <td rowspan={{this.total_net_payble_to_supplier.rowspan}} class="price-dtl"><a href="#.">{{this.total_net_payble_to_supplier.data}}</a></td>
                                                {{/if}}
												{{#if this.offers_applied}}
                                                <td rowspan={{this.offers_applied.rowspan}} rowspan="3" class="price-dtl"><a href="#.">{{this.offers_applied.data}}</a></td>
                                                {{/if}}
                                                {{#if this.action}}
												<td rowspan={{this.action.rowspan}} >
													<select class="form-control">
                                                        {{#each this.action.data}}
														<option>{{this}}</option>
                                                        {{/each}}
													</select>
												</td>
                                                {{/if}}
											</tr>
                                            {{/each}}
										</table>
									</td>
								</tr>
							</table>
						</div>
						<div id="list2" class="travel-list ">
							<table  cellpadding="0" cellspacing="0" border="0" valign="top" class="main-table" width="3890px">
								<tr>
									<td valign="top" class="sub-table" width="1130px">
										<table cellpadding="0" cellspacing="0" border="1" valign="top" width="100%" >
											<tr class="three-column">
												<th colspan="9"><label>Product &amp; Passenger Information</label></th>
												<th colspan="7" class="main-spec-info"><label>Other Special Information</label> <div class="float-right exp-collapse" data-item="spec-info"><i class="glyphicon glyphicon-menu-left"></i></div></th>
												<th colspan="15" class="main-price-dtl"><label>Price Details</label> <div class="float-right exp-collapse" data-item="price-dtl"><i class="glyphicon glyphicon-menu-left"></i></div></th>
												<th rowspan="3"><label>Action</label></th>
											</tr>
											<tr>
												<th rowspan="2" width="180px">Passenger Name</th>
												<th rowspan="2" width="150px">Flight Details</th>
												<th rowspan="2" width="150px">Departure-Arrival Details</th>
												<th rowspan="2" width="180px">Class-RBD-Fare Basis-Ticket No</th>
												<th rowspan="2" width="60px">GDS PNR</th>
												<th rowspan="2" width="60px">Airline PNR</th>
												<th rowspan="2" width="80px">Booking Status</th>
												<th rowspan="2" width="150px">Time Limit Expiry Date</th>
												<th rowspan="2" width="120px">Amendment/Cancellation Date</th>

												<th rowspan="2" width="150px" class="spec-info">D.O.B.</th>
												<th rowspan="2" width="100px" class="spec-info">Meal Preference</th>
												<th rowspan="2" width="100px" class="spec-info">Special Request</th>
												<th rowspan="2" width="80px" class="spec-info">Flight Seat No.</th>
												<th rowspan="2" width="150px" class="spec-info">Credential Name / PCC</th>
												<th rowspan="2" width="80px" class="spec-info">Ticketing PCC</th>
												<th rowspan="2" width="80px" class="spec-info">Inventory</th>

												<th rowspan="2" width="130px" class="price-dtl">Source Supplier</th>
												<th rowspan="2" width="130px" class="price-dtl">Enabler Supplier</th>
												<th rowspan="2" width="150px" class="price-dtl">Refundable/Non-Refundable</th>
												<th colspan="6" class="price-dtl">Selling Price Details</th>
												<th rowspan="2" width="100px" class="price-dtl">Actual Margin Amount</th>
												<th colspan="4" class="price-dtl">Supplier Pricing Details</th>
												<th rowspan="2" width="80px" class="price-dtl">Offers Applied</th>
											</tr>
											<tr>
												<th width="120px" class="price-dtl">Total Selling Price</th>
												<th width="120px" class="price-dtl">Commission</th>
												<th width="60px" class="price-dtl">Discount Value</th>
												<th width="80px" class="price-dtl">Total Net Selling Price</th>
												<th width="200px" class="price-dtl">Company Cancellation Charges</th>
												<th width="150px" class="price-dtl">Company Amendment Charges</th>
												<th width="80px" class="price-dtl">Net Payble to Supplier</th>
												<th width="150px" class="price-dtl">Supplier Cancellation Charges</th>
												<th width="150px" class="price-dtl">Supplier Amendment Charges</th>
												<th width="120px" class="price-dtl">Total Net Payble to Supplier</th>
											</tr>
                                            {{#each file_handler.product_passenger_information2}}
											<tr>
                                                {{#if this.passenger_name}}
												<td rowspan={{this.passenger_name.rowspan}}>{{this.passenger_name.data}}</td>
                                                {{/if}}
                                                {{#if this.flight_details}}
												<td rowspan={{this.flight_details.rowspan}}>
													<div class="block-info">
														<label>Sector</label>
														<span>{{this.flight_details.Sector}}</span>
													</div>
													<div class="block-info">
														<label>Flight Number</label>
														<span><input type="text" value={{this.flight_details.flight_number}} class="form-control"></span>
													</div>
													<div class="block-info">
														<label>(Onward)</label>
													</div>
												</td>
                                                {{/if}}
                                                {{#if this.departure_arrival_details}}
												<td rowspan={{this.departure_arrival_details.rowspan}} class="set-date">
													<label>Departure</label>
													<div class="date-time">
														<input type="date" value={{this.departure_arrival_details.departure1}} class="form-control">
														<input type="date" value={{this.departure_arrival_details.departure2}} class="form-control">
													</div>
													<label>Arrival</label>
													<div class="date-time">
														<input type="date" value={{this.departure_arrival_details.arrival1}} class="form-control">
														<input type="date" value={{this.departure_arrival_details.arrival2}} class="form-control">
													</div>
												</td>
                                                {{/if}}
                                                {{#if this.class_RBD_fareBasis_ticketNo}}
												<td rowspan={{this.class_RBD_fareBasis_ticketNo.rowspan}}>{{this.class_RBD_fareBasis_ticketNo.data}}</td>
                                                {{/if}}
                                                {{#if this.GDS_PNR}}
												<td rowspan={{this.GDS_PNR.rowspan}}>{{this.GDS_PNR.data}}</td>
                                                {{/if}}
                                                {{#if this.airline_PNR}}
												<td rowspan={{this.airline_PNR.rowspan}}>{{this.airline_PNR.data}}</td>
                                                {{/if}}
                                                {{#if this.booking_status}}
												<td rowspan={{this.booking_status.rowspan}}>
													<select class="form-control">
                                                        {{#each this.booking_status.data}}
														<option>{{this}}</option>
                                                        {{/each}}
													</select>
												</td>
                                                {{/if}}
                                                {{#if this.timeLimit_expiry_date}}
												<td rowspan={{this.timeLimit_expiry_date.rowspan}} class="date-time set-date">
													<input type="date" value={{this.timeLimit_expiry_date.data1}} class="form-control">
													<input type="date" value={{this.timeLimit_expiry_date.data2}} class="form-control">
												</td>
                                                {{/if}}
                                                {{#if this.amendment_cancellation_date}}
												<td rowspan={{this.amendment_cancellation_date.rowspan}}> {{this.amendment_cancellation_date.data}} </td>
                                                {{/if}}
                                                {{#if this.DOB}}
												<td rowspan={{this.DOB.rowspan}} class="spec-info set-date"><input type="date" value={{this.DOB.data}} class="form-control" ></td>
                                                {{/if}}
                                                {{#if this.meal_preference}}
												<td rowspan={{this.meal_preference.rowspan}} class="spec-info">
													<select class="form-control">
                                                        {{#each this.meal_preference.data}}
														<option>{{this}}</option>
                                                        {{/each}}
													</select>
												</td>
                                                {{/if}}
                                                {{#if this.special_request}}
												<td rowspan={{this.special_request.rowspan}} class="spec-info"><input type="text" value="{{this.special_request.data}}" class="form-control" /></td>
                                                {{/if}}
												{{#if this.flight_seat_no}}
                                                <td rowspan={{this.flight_seat_no.rowspan}} class="spec-info">{{this.flight_seat_no.data}}</td>
                                                {{/if}}
												{{#if this.credential_name}}
                                                <td rowspan={{this.credential_name.rowspan}} class="spec-info">{{this.credential_name.data}}</td>
                                                {{/if}}
												{{#if this.ticketing_PCC}}
                                                <td rowspan={{this.ticketing_PCC.rowspan}} class="spec-info">
													<select class="form-control">
                                                        {{#each this.ticketing_PCC.data}}
														<option>{{this}}</option>
                                                        {{/each}}
													</select>
												</td>
                                                {{/if}}
												{{#if this.inventory}}
                                                <td rowspan={{this.inventory.rowspan}} class="spec-info">{{this.inventory.data}}</td>
                                                {{/if}}
                                                {{#if this.source_supplier}}
												<td rowspan={{this.source_supplier.rowspan}} rowspan="3" class="price-dtl">{{this.source_supplier.data}}</td>
                                                {{/if}}
												{{#if this.enabler_supplier}}
                                                <td rowspan={{this.enabler_supplier.rowspan}} rowspan="3" class="price-dtl">{{this.enabler_supplier.data}}</td>
                                                {{/if}}
												{{#if this.refundable_nonRefundable}}
                                                <td rowspan={{this.refundable_nonRefundable.rowspan}} class="price-dtl">{{this.refundable_nonRefundable.data}}</td>
                                                {{/if}}
												{{#if this.total_selling_price}}
                                                <td rowspan={{this.total_selling_price.rowspan}} class="price-dtl"><a href="#.">{{this.total_selling_price.data}}</a></td>
                                                {{/if}}
												{{#if this.commission}}
                                                <td rowspan={{this.commission.rowspan}} class="price-dtl"> {{this.commission.data}} </td>
                                                {{/if}}
												{{#if this.discount_value}}
                                                <td rowspan={{this.discount_value.rowspan}} class="price-dtl"> {{this.discount_value.data}} </td>
                                                {{/if}}
												{{#if this.total_net_selling_price}}
                                                <td rowspan={{this.total_net_selling_price.rowspan}} class="price-dtl">{{this.total_net_selling_price.data}}</td>
                                                {{/if}}
												{{#if this.company_cancellation_charges}}
                                                <td rowspan={{this.company_cancellation_charges.rowspan}} class="price-dtl"><input type="text" value="{{this.company_cancellation_charges.data}}" class="form-control" /></td>
                                                {{/if}}
												{{#if this.company_amendment_charges}}
                                                <td rowspan={{this.company_amendment_charges.rowspan}} class="price-dtl"><input type="text" value="{{this.company_amendment_charges.data}}" class="form-control" /></td>
                                                {{/if}}
												{{#if this.actual_margin_amount}}
                                                <td rowspan={{this.actual_margin_amount.rowspan}} class="price-dtl">{{this.actual_margin_amount.data}}</td>
                                                {{/if}}
												{{#if this.net_payble_to_supplier}}
                                                <td rowspan={{this.net_payble_to_supplier.rowspan}} class="price-dtl"><a href="#.">{{this.net_payble_to_supplier.data}}</a></td>
                                                {{/if}}
												{{#if this.supplier_cancellation_charges}}
                                                <td rowspan={{this.supplier_cancellation_charges.rowspan}} class="price-dtl"><input type="text" value="{{this.supplier_cancellation_charges.data}}" class="form-control" /></td>
                                                {{/if}}
												{{#if this.supplier_amendment_charges}}
                                                <td rowspan={{this.supplier_amendment_charges.rowspan}} class="price-dtl"><input type="text" value="{{this.supplier_amendment_charges.data}}" class="form-control" /></td>
                                                {{/if}}
												{{#if this.total_net_payble_to_supplier}}
                                                <td rowspan={{this.total_net_payble_to_supplier.rowspan}} class="price-dtl"><a href="#.">{{this.total_net_payble_to_supplier.data}}</a></td>
                                                {{/if}}
												{{#if this.offers_applied}}
                                                <td rowspan={{this.offers_applied.rowspan}} rowspan="3" class="price-dtl"><a href="#.">{{this.offers_applied.data}}</a></td>
                                                {{/if}}
                                                {{#if this.action}}
												<td rowspan={{this.action.rowspan}} >
													<select class="form-control">
                                                        {{#each this.action.data}}
														<option>{{this}}</option>
                                                        {{/each}}
													</select>
												</td>
                                                {{/if}}
											</tr>
                                            {{/each}}
										</table>
									</td>
								</tr>
							</table>
						</div>

					</div>
				</script>
				</section>
				<!-- End Flight Details  & Start Client Payment Details -->
				<section class="panel panel-default" id="client-payment-container">
				<script id="client-payment-template" type="text/x-handlebars-template">
					<div class="panel-heading">
						<label>Client Payment Details</label>

						<div class="other-events">

							<a href="#."><i class="glyphicon glyphicon-info-sign"></i> Notification</a>
						</div>
				</div>
					<div class="panel-body">
						<div class="auto-overflow">
					<table class="client-table" cellpadding="0" cellspacing="0" border="0" width="100%">
						<tr>
							<th rowspan="2" width="9%">Invoice</th>
							<th rowspan="2" width="6%">Invoice Amount</th>
							<th colspan="6">Payment Details</th>
							<th rowspan="2" width="6%">Credit/Debit Note No.</th>
							<th colspan="3" width="23%">Refund Details</th>
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
						{{#each file_handler.client_payment_details}}
						<tr>
							{{#if this.invoice}}
							<td rowspan={{this.invoice.rowspan}}><a href="#">{{this.invoice.no}}</a><p>{{this.invoice.date}}</p></td>
							{{/if}}
							{{#if this.invoice_amount}}
							<td rowspan={{this.invoice_amount.rowspan}}>{{this.invoice_amount.data}}</td>
							{{/if}}
							{{#if this.payment_towards}}
							<td rowspan={{this.payment_towards.rowspan}}>{{this.payment_towards.data}}</td>
							{{/if}}
							{{#if this.payment_date}}
							<td rowspan={{this.payment_date.rowspan}}>{{this.payment_date.data}}</td>
							{{/if}}
							{{#if this.payment_collection}}
							<td rowspan={{this.payment_collection.rowspan}}>{{this.payment_collection.data}}</td>
							{{/if}}
							{{#if this.R_NR}}
							<td rowspan={{this.R_NR.rowspan}}>{{this.R_NR.data}}</td>
							{{/if}}
							{{#if this.receipt_no}}
							<td rowspan={{this.receipt_no.rowspan}}><a href="#.">{{this.receipt_no.data}}</a></td>
							{{/if}}
							{{#if this.payment_status}}
							<td rowspan={{this.payment_status.rowspan}}>{{this.payment_status.data}}</td>
							{{/if}}
							{{#if this.note_no}}
							<td rowspan={{this.note_no.rowspan}}><a href="#.">{{this.note_no.data}}</a></td>
							{{/if}}
							{{#if this.refund_claim_id}}
							<td rowspan={{this.refund_claim_id.rowspan}}><a href="#">{{this.refund_claim_id.data}}</a></td>
							{{/if}}
							{{#if this.refund_amount}}
							<td rowspan={{this.refund_amount.rowspan}}>{{this.refund_amount.data}}</td>
							{{/if}}
							{{#if this.refund_status}}
							<td rowspan={{this.refund_status.rowspan}}>{{this.refund_status.data}}</td>
							{{/if}}
						</tr>
						{{/each}}
					</table>
					</div>
					</div>
				</script>
				</section>
				<!-- End Client Payment Details & Start Supplier Payment Details -->
				<section class="panel panel-default" id="supplier-payment-container">
                <script id="supplier-payment-template" type="text/x-handlebars-template">
					<div class="panel-heading">
						<label>Supplier Payment Details</label>
						<div class="other-events">
							<a href="#."><i class="glyphicon glyphicon-info-sign"></i> Notification</a>
						</div>
						</div>
					<div class="panel-body">
						<div class="auto-overflow">
					<table id="section5Table" class="client-table" cellpadding="0" cellspacing="0" width="100%">
						<tr>
							<th rowspan="2">Supplier Name</th>
							<th rowspan="2">Net Payable to Supplier</th>
							<th colspan="7">Payment Details</th>
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
                        {{#each supplier_payment_details}}
						<tr>
                            {{#if this.supplier_name}}
							<td rowspan={{this.supplier_name.rowspan}}>{{this.supplier_name.data}}</td>
                            {{/if}}
                            {{#if this.net_payable_to_supplier}}
							<td rowspan={{this.net_payable_to_supplier.rowspan}}>{{this.net_payable_to_supplier.data}}</td>
                            {{/if}}
                            {{#if this.type_of_settlement}}
							<td rowspan={{this.type_of_settlement.rowspan}}>{{this.type_of_settlement.data}}</td>
                            {{/if}}
                            {{#if this.payment_due_date}}
							<td rowspan={{this.payment_due_date.rowspan}}>{{this.payment_due_date.data}}</td>
                            {{/if}}
                            {{#if this.amount}}
							<td rowspan={{this.amount.rowspan}}>{{this.amount.data}}</td>
                            {{/if}}
                            {{#if this.payment_date}}
							<td rowspan={{this.payment_date.rowspan}}>{{this.payment_date.data}}</td>
                            {{/if}}
                            {{#if this.payment_advice_ID}}
							<td rowspan={{this.payment_advice_ID.rowspan}}>{{this.payment_advice_ID.data}}</td>
                            {{/if}}
                            {{#if this.payment_ref_no}}
							<td rowspan={{this.payment_ref_no.rowspan}}>{{this.payment_ref_no.data}}</td>
                            {{/if}}
                            {{#if this.status}}
							<td rowspan={{this.status.rowspan}}>{{this.status.data}}</td>
                            {{/if}}
						</tr>
                        {{/each}}
					</table>
					</div>
					</div>
                </script>
				</section>
				<!-- End Supplier Payment Details -->
			</div>
		</div>
	</article>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
	<script src="js/slick.min.js"></script>
	<script src="js/product-slide.js"></script>
	<script src="js/indexPage.js"></script>
  <!-- <script>
  	$(function(){
  		$("#documentation").load("./CKIL_235246.html");
  	});
  </script> -->
  </body>
</html>
