<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true"%>
<%@ attribute name="pageTitle" required="false" rtexprvalue="true"%>

<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="header"
	tagdir="/WEB-INF/tags/responsive/common/header"%>
<%@ taglib prefix="footer"
	tagdir="/WEB-INF/tags/responsive/common/footer"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="formElement"
	tagdir="/WEB-INF/tags/responsive/formElement"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script type="text/javascript" src="${commonResourcePath}/js/receipts.js"></script>
<script type="text/javascript">
	entityTypes = '${entityTypes}';
	clientTypes = '${clientTypes}';
	receiptType = '${receiptType}';
	clientCategories = '${clientCategories}';
	clientSubCategories = '${clientSubCategories}';
	receiptStatus = '${receiptStatus}';
	dateTypes = '${dateType}'
	receiptData = '${receiptData}';
</script>

<body>
	<div id="globalMessages">
		<common:globalMessages/>
	</div>
	<article>
		<div class="main">
			<div class="container">
				<div class="row">
					<div class="col-md-3">
						<h1><spring:theme code="receipt.text" text="Receipt"/></h1>
					</div>
				</div>
				<form class="form-horizontal">
					<div class="panel panel-default">
						<div class="panel-heading main-heading"><spring:theme code="receipt.text.search" text="Search Receipt"/></div>
						<!-- Start Coupon Details -->
						<section class="panel-body">
							<ul>
								<li>
									<div class="form-group">
										<label class="col-md-2 control-label"> <spring:theme
												code="receipt.text.entity" text="Entity Type" /></label>
										<div class="col-md-8" data-bind="foreach:receipts">
											<label class="radio-inline"> <input type="radio"
												name="optradio"
												data-bind="checked: $root.selectedEntityType, value:EntityType.code"><span
												data-bind="text:EntityType.name"></span>
											</label>
											<!--<label class="radio-inline">
												<input type="radio" value="supplier" name="optradio" data-bind="checked: displayMode">Supplier                          
                                            </label>-->
										</div>
									</div>
								</li>
								<li>
									<div class="form-group" data-bind="visible: $root.selectedEntityType() === 'CLIENT' ? true : false">
										<label class="col-md-2 control-label"><spring:theme
												code="receipt.text.receipt.textType" text="Receipt Type" /></label>
										<!--										<div class="col-md-8" data-bind="foreach:selectedEntityType() === 'client' ? receipts[0].ReceiptType : receipts[1].ReceiptType  ">-->
										<div class="col-md-8"
											data-bind="foreach:receiptTypesMatchingSelectedEntityType(selectedEntityType())">

											<!--<div class="col-md-8" data-bind="foreach:$root.receipts[indexOfReceipt(selectedEntityType)].ReceiptType">-->

											<label class="radio-inline"> <input type="radio"
												name="r-type"
												data-bind="checked: $root.selectedReceiptType, value:code"><span
												data-bind="text:name"></span>
											</label>
										</div>
									</div>
								</li>
							</ul>

							<div class="row">
								<div class="col-md-12">
									<fieldset>
										<legend
											data-bind="text: $root.selectedEntityType() === 'CLIENT' ? 'Search Client Receipts' : 'Search Supplier Receipts'"></legend>

										<div class="col-md-8"
											data-bind="foreach:referenceIdsMatchingSelectedEntityType(selectedEntityType())">
											<label class="radio-inline"> <input type="radio"
												name="c-rec"
												data-bind="checked: $root.selectedReferenceId, value:code">
												<span data-bind="text:name"></span>
											</label> 
										</div>
										<br> <br>
										<ul
											data-bind="visible: $root.selectedEntityType() === 'CLIENT' ? true : false">
											<li>
												<div class="form-group">
													<label class="col-md-2 control-label"><spring:theme
															code="receipt.text.numberId" text="Number / ID" /></label>
													<div class="col-md-5">
														<input class="form-control"
															data-bind="value:clientCustomerIDText, hasFocus: hasFocusClientNumberID">
													</div>
												</div>
											</li>
											<li>
												<div class="form-group">
													<label class="col-md-2 control-label"><spring:theme
															code="receipt.text.clientType" text="Client Type" /></label>
													<div class="col-md-5">
														<select class="form-control"
															data-bind="options:clientTypes, optionsText:'name', value:selectedClientType, optionsValue:'code', optionsCaption: 'Choose Client Type'">
														</select>
													</div>
												</div>
											</li>
											<li>
												<div class="form-group">
													<label class="col-md-2 control-label"><spring:theme
															code="receipt.text.clientCategory" text="Client Category" /></label>
													<div class="col-md-5">
														<select class="form-control"
															data-bind="options:clientCategories, optionsText:'name', value:selectedClientCategory, optionsValue:'code', optionsCaption: 'Choose Client Category'">
														</select>

													</div>
												</div>
											</li>
											<li>
												<div class="form-group">
													<label class="col-md-2 control-label"><spring:theme
															code="receipt.text.clientSubCategory"
															text="Client Sub Category" /> </label>
													<div class="col-md-5">
														<select class="form-control"
															data-bind="options:clientSubCategories, optionsText:'name', value:selectedClientSubCategory, optionsValue:'code', optionsCaption: 'Choose Client Sub Category'">
														</select>
													</div>
												</div>
											</li>
											<li>
												<div class="form-group">
													<label class="col-md-2 control-label"><spring:theme
															code="receipt.text.clientName" text="Client Name" /></label>
													<div class="col-md-5">
														<input type="text" placeholder="Auto Suggest"
															class="form-control" data-bind ="value:clientNameText">
													</div>
												</div></li>
											<li>
												<div class="form-group">
													<label class="col-md-2 control-label"><spring:theme
															code="receipt.text.passengeName" text="Passenger Name" />
													</label>
													<div class="col-md-5">
														<input type="text" class="form-control">
													</div>
												</div>
											</li>
											<li>
												<div class="form-group">
													<label class="col-md-2 control-label"><spring:theme
															code="receipt.text.receiptStatus" text="Receipt Status" />
													</label>
													<div class="col-md-5">
														<select class="form-control" data-bind="options:receiptStatus, optionsText:'name',optionsValue:'code', value:selectedReceiptStatus, optionsCaption: 'Choose Receipt Status'">
															
														</select>
													</div>
												</div>
											</li>
											<li data-bind="visible:selectedReceiptType()=== 'BOOKING_RECEIPT' ? true : false">
												<div class="form-group">
													<div class="col-md-5 col-md-offset-2"
														data-bind="foreach:dateTypesMatchingSelectedEntityType(selectedEntityType())">

														<label class="radio-inline"> <input type="radio"
															name="b-date"
															data-bind="checked: $root.selectedDateType, value:code"><span
															data-bind="text:name"></span></label>
													</div>
												</div>
												
										<!-- 	</li>
											<li> -->
												<div class="form-group">
													<label class="col-md-2 control-label"><spring:theme
															code="receipt.text.fromDate" text="From Date" /></label>
													<div class="col-md-5">
														<input type="date" class="form-control" data-bind="date:fromDate"/>
													</div>
												</div>
												
										<!-- 	</li>
											<li> -->
											
												<div class="form-group">
													<label class="col-md-2 control-label"><spring:theme
															code="receipt.text.toDate" text="To Date" /></label>
													<div class="col-md-5">
														<input type="date" class="form-control" data-bind="date:toDate"/>
													</div>
												</div>
											</li>
										</ul>
										<ul
											data-bind="visible: $root.selectedEntityType() === 'SUPPLIER' ? true : false">
											<li>
												<div class="form-group">
													<label class="col-md-2 control-label"><spring:theme code="receipt.text.numberId" text="Number / ID" /></label>
													<div class="col-md-5">
														<input type="text" class="form-control">
													</div>
												</div>
											</li>
											<li>
												<div class="form-group">
													<label class="col-md-2 control-label"><spring:theme code="receipt.text.supplier.name" text="Supplier Name" /></label>
													<div class="col-md-5">
														<select class="form-control">
															<option>Select</option>
														</select>
													</div>
												</div>
											</li>
											<li>
												<div class="form-group">
													<label class="col-md-2 control-label"><spring:theme code="receipt.text.receiptStatus" text="Receipt Status"/>
														</label>
													<div class="col-md-5">
														<select class="form-control" data-bind="options:receiptStatus, optionsText:'name', value:selectedReceiptStatus">
														</select>
													</div>
												</div>
											</li>

											<li>
												<div class="form-group">
													<label class="col-md-2 control-label"><spring:theme code="" text="Receipt Creation From" /></label>
													<div class="col-md-5">
														<input type="date" class="form-control">
													</div>
												</div>
											</li>
											<li>
												<div class="form-group">
													<label class="col-md-2 control-label"><spring:theme code="" text="Receipt Creation To" /></label>
													<div class="col-md-5">
														<input type="date" class="form-control">
													</div>
												</div>
											</li>
										</ul>
									</fieldset>
								</div>

							</div>
							<div>

								<div class="form-group">
									<div class="col-md-2 col-md-offset-8">
										<button type="submit" class="btn btn-default btn-sm"
											data-bind="click: searchPriorityConfiguration"><spring:theme code="receipt.text.search" text="Search"/></button>
										<button class="btn btn-default btn-sm" data-bind="click: resetReceiptForm"><spring:theme code="receipt.text.reset" text="Reset"/></button>
									</div>
									<div class="col-md-2">
										<div class="form-group show-entries">
											<label class="col-md-4 control-label"><spring:theme code="receipt.show.label" text="Show"/><span
												class="mandatory">*<span></span></span>
											</label> <select class="col-md-2 form-control">
												<option>25</option>
												<option>30</option>
											</select> <label class="control-label"><spring:theme code="receipt.entries.label" text="Entries"/></label>
										</div>
									</div>
								</div>
								<div class="alert alert-danger fade in" data-bind="visible: validationError">
									<spring:message code="reconfirmation.search.blank.click.error"/>
							</div>
							</div>
						</section>
						<section class="panel-body">
							<div class="table-responsive">
								<table cellpadding="0" cellspacing="0" border="0" valign="top"
									width="2500px" class="table-main">
									<thead>
										<tr>
											<th><spring:theme code="receipt.text.receiptCreation" text="Receipt Creation Date"/></th>
											<th><spring:theme code="receipt.text.receipt" text="Receipt No"/><a href="#" class="inline-block"><span
													class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
												href="#" class="inline-block"><span
													class="glyphicon glyphicon-filter"></span></a></th>
											<th><spring:theme code="receipt.text.numberId" text="Number/ID"/> <a href="#" class="inline-block"><span
													class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
												href="#" class="inline-block"><span
													class="glyphicon glyphicon-filter"></span></a></th>
											<th><spring:theme code="receipt.text.clientDetails" text="Client Details / Supplier"/> <a href="#"
												class="inline-block"><span
													class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
												href="#" class="inline-block"><span
													class="glyphicon glyphicon-filter"></span></a></th>
											<th><spring:theme code="receipt.text.passengeName" text="Passenger Name"/> <a href="#" class="inline-block"><span
													class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
												href="#" class="inline-block"><span
													class="glyphicon glyphicon-filter"></span></a></th>
											<th><spring:theme code="receipt.text.productDetails" text="Product Details"/></th>
											<th><spring:theme code="receipt.text.receiptAmount" text="Receipt Amount"/></th>
											<th><spring:theme code="receipt.text.roe" text="ROE"/></th>
											<th><spring:theme code="receipt.text.functionalAmount" text="Functional Receipt Amount"/></th>
											<th><spring:theme code="receipt.text.unappliedAmount" text="Unapplied Amount"/></th>
											<th><spring:theme code="receipt.text.functionalUnAmount" text="Functional Unapplied Amount"/></th>
											<th><spring:theme code="receipt.text.createdBy" text="Created By"/></th>
											<th><spring:theme code="receipt.text.receiptStatus" text="Receipt Status"/></th>
											<th><spring:theme code="receipt.text.print" text="Print"/></th>
											<th><spring:theme code="receipt.text.communication" text="Communication"/></th>
										</tr>
									</thead>

									<tbody data-bind="foreach: $root.searchResult">
										<tr>
											<td data-bind="date: receiptCreationDate,dateFormat: 'DD-MM-YY'"></td>
											<td><a
												data-bind="text: receiptNumber, click:$root.receiptNumberPopup.receiptNumberClicked"
												data-toggle="modal" href="#receiptDetails"></a></td>
											<td><a
												data-bind="text: referenceId, click:$root.numberIDPopup.numberIDClicked"
												data-toggle="modal" href="#bookingDetails"></a></td>
											<td><span data-bind="text: travelogixClientDetailsData.clientName"></span><br>
												<span data-bind="text: travelogixClientDetailsData.clientId"></span><br>
												<span data-bind="text: "></span><br>
												<span data-bind="text: "></span>
											</td>
											<td data-bind="text: passengerName"></td>
											<td> <span data-bind="text: travelogixProductData.categories"></span><br>
												<span data-bind="text: travelogixProductData.categories"></span><br>
												<span data-bind="text: travelogixProductData.name"></span><br>
												<span data-bind="text: travelogixProductData.code"></span>
											</td>
											<td data-bind="text: receiptAmount"></td>
											<td data-bind="text: roe"></td>
											<td data-bind="text: functionalReceiptAmount"></td>
											<td data-bind="text: functionalUnAppliedAmount"></td>
											<td data-bind="text: unAppliedAmount"></td>
											<td data-bind="text: createdBy"></td>
											<td data-bind="text: receiptStatus[0].name"></td>
											<td><a data-bind="click:$root.invoicePopup.invoiceClicked" data-toggle="modal" href="#invoiceDetails">
											<i class="fa fa-print fa-2x"></i></a></td>
											<td><a data-bind="click:$root.remarksPopup.remarksClicked" data-toggle="modal" href="#remarks"><i
													class="fa fa-envelope fa-2x"></i><spring:theme code="receipt.text.send" text="Send"/></a></td>
										</tr>
									</tbody>
								</table>
								<div class="modal fade" id="receiptDetails" role="dialog">
									<div class="modal-dialog">
										<!-- Modal content -->
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal">&times;</button>
												<h4 class="modal-title">Receipt Details</h4>
											</div>
											<div class="modal-body">
												<div class="panel panel-default">
													<div class="table-responsive">
														<table cellpadding="0" cellspacing="0" border="0"
															valign="top" width="100%" class="table-main">
															<thead>
																<tr>
																	<th><spring:theme code="receipt.text.receipt" text="Receipt No"/></th>
																	<th><spring:theme code="receipt.text.receiptDetails.modeOfPayment" text="Mode of payment"/></th>
																	<th><spring:theme code="receipt.text.receiptDetails.pos" text="POS Details"/></th>
																	<th><spring:theme code="receipt.text.receiptDetails.instrument" text="Instrument Details"/></th>
																</tr>
															</thead>
															<tbody
																data-bind="foreach: $root.receiptNumberPopup.receiptData">
																<tr>
																	<td data-bind="text: receiptNumber"></td>
																	<td data-bind="text: pos"><a href="javascript:void(0)"></a></td>
																	<td data-bind="text: pos"><a href="javascript:void(0)"></a></td>
																	<td data-bind="text: travelogixClientDetailsData.clientName"></td>
																</tr>
															</tbody>
														</table>
													</div>
												</div>
											</div>
										</div>

									</div>
								</div>
								<div class="modal fade" id="bookingDetails" role="dialog">
									<div class="modal-dialog">
										<!-- Modal content -->
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal">&times;</button>
												<h4 class="modal-title"><spring:theme code="receipt.text.bookingDetails" text="Booking Details"/></h4>
											</div>
											<div class="modal-body">
												<div class="panel panel-default">
													<div class="table-responsive">
														<table cellpadding="0" cellspacing="0" border="0"
															valign="top" width="100%" class="table-main">
															<thead>
																<tr>
																	<th><spring:theme code="receipt.text.bookingDetails.bookingRef" text="Booking Ref No"/></th>
																	<th><spring:theme code="receipt.text.bookingDetails.bookingDate" text="Booking Date"/></th>
																	<th><spring:theme code="receipt.text.bookingDetails.travelFromToDate" text="Travel From to Date"/></th>
																</tr>
															</thead>
															<tbody
																data-bind="foreach: $root.numberIDPopup.numberIDData">
																<tr>
																
																	<td data-bind="text: referenceId"></td>
																	<td data-bind="date: bookingDate,dateFormat: 'DD-MM-YY'"><a href="javascript:void(0)"></a></td>
																	<td data-bind="date: receiptCreationDate,dateFormat: 'DD-MM-YY'"><a href="javascript:void(0)"></a></td>
																</tr>
															</tbody>
														</table>
													</div>
												</div>
											</div>
										</div>

									</div>
								</div>
								<div class="modal fade" id="invoiceDetails" role="dialog">
									<div class="modal-dialog">
										<!-- Modal content -->
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal">&times;</button>
												<h4 class="modal-title"><spring:theme code="receipt.text.invoice" text="Invoice Details"/></h4>
											</div>
											<div class="modal-body">
												<div class="panel panel-default">
													<div class="table-responsive">
														<table cellpadding="0" cellspacing="0" border="0"
															valign="top" width="100%" class="table-main">
															<thead>
																<tr>
																	<th><spring:theme code="receipt.text.invoice.number" text="Invoice No"/></th>
																	<th><spring:theme code="receipt.text.invoice.amount" text="Invoice Amount"/></th>
																	<th><spring:theme code="receipt.text.invoice.roe" text="ROE"/></th>
																	<th><spring:theme code="receipt.text.invoice.functionalInvoice" text="Functional Invoice Amt"/></th>
																	<th><spring:theme code="receipt.text.invoice.appliedAmount" text="Applied Amt"/></th>
																	<th><spring:theme code="receipt.text.invoice.outAmt" text="Out Amt"/></th>
																	<th><spring:theme code="receipt.text.invoice.outstandingAmount" text="Outstanding Amt"/></th>
																</tr>
															</thead>
															<tbody data-bind="foreach: $root.invoicePopup.invoiceData">
																<tr>
																	<td data-bind="text: code"></td>
																	<td data-bind="text: totalCost"></td>
																	<td data-bind="text: "></td>
																	<td data-bind="text: totalAppliedAmount"></td>
																	<td data-bind="text: totalAppliedAmount"></td>
																	<td data-bind="text: outstandingAmount"></td>
																	<td data-bind="text: outstandingAmount"></td>
																</tr>
															</tbody>
														</table>
													</div>
												</div>
											</div>
										</div>

									</div>
								</div>
								<div class="modal fade" id="remarks" role="dialog">
									<div class="modal-dialog">
										<!-- Modal content -->
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal">&times;</button>
												<h4 class="modal-title"><spring:theme code="receipt.text.remarks" text="Remarks"/></h4>
											</div>
											<div class="modal-body" data-bind="foreach: $root.remarksPopup.remarksData">
												<div>
													<ul class="row">
														<li class="col-md-12">
															<div class="form-group">
																<label class="col-md-2 control-label"><spring:theme code="receipt.text.remarks.user1" text="User 1"/></label>
																<div class="col-md-10" data-bind="text: contactEmail">
																	<textarea class="form-control"></textarea>
																</div>
															</div>
														</li>
														<li class="col-md-12">
															<div class="form-group">
																<label class="col-md-2 control-label"><spring:theme code="receipt.text.remarks.user2" text="User 2"/></label>
																<div class="col-md-10" data-bind="text: ">
																	<textarea class="form-control"></textarea>
																</div>
															</div>
														</li>
													</ul>
												</div>
											</div>
										</div>

									</div>
								</div>
							</div>
							<ul class="pagination margin-top-15">
								<li><a href="#" aria-label="Previous"> <span
										aria-hidden="true">&laquo;</span>
								</a></li>
								<li><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#" aria-label="Next"> <span
										aria-hidden="true">&raquo;</span>
								</a></li>
							</ul>
						</section>
						<!-- End Unutilized Coupons List & Start Summary of Charges -->
						<div class="panel-footer text-right">
							<button type="submit" class="btn btn-default btn-sm ">Issue
								Receipt</button>
							<a
								href="${pageContext.request.contextPath}/receipt/issueReceiptPage">issuereceipt</a>
							<button type="submit" class="btn btn-default btn-sm ">Cancel</button>
						</div>

						<!-- End Summary of Charges -->
					</div>
				</form>
			</div>
		</div>

	</article>
</body>