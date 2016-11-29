<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="pagination" tagdir="/WEB-INF/tags/responsive/nav/pagination"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<template:page>

<body>
	<article>
		<div class="main">

			<div class="container">
				<div class="row">
					<div class="col-md-3">
						<h1>Search for Service Order</h1>
					</div>
				</div>

				<c:url value="/serviceorder/search" var="searchURL"></c:url>
				<form:form class="form-horizontal" action="${searchURL}" modelAttribute="serviceOrderSearchForm" method="post">
					<div class="panel panel-default">
						<div class="panel-heading main-heading">Search for Service Order</div>
						<div class="panel-body">
							<ul class="row">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Service Order Type</label>
										<div class="col-md-7">
											<form:select path="serviceOrderType" class="form-control">
                                                <option value="">Select</option>
											    <c:forEach items="${serviceOrderType}" var="soType">
											        <option value="${soType.code}">${soType.name}</option>
											    </c:forEach>
                                            </form:select>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Service Order ID</label>
										<div class="col-md-7">
											<form:input path="serviceOrderId"  type="text" class="form-control"/>
										</div>
									</div>
								</li>								
							</ul>
							<ul class="row">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Supplier Name</label>
										<div class="col-md-7">
											<form:input path="supplierName"  type="text" class="form-control"/>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Supplier ID</label>
										<div class="col-md-7">
											<form:input path="supplierId"  type="text" class="form-control"/>
										</div>
									</div>
								</li>								
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Supplier Currency</label>
										<div class="col-md-7">
											<select class="form-control">
                                                <option>Select</option>
                                            </select>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Supplier Settlement Status </label>
										<div class="col-md-7">
											<select class="form-control">
                                                <option>Select</option>
                                            </select>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Supplier Bill Passing Status</label>
										<div class="col-md-7">
											<select class="form-control">
                                                <option>Select</option>
                                            </select>
										</div>
									</div>
								</li>
								</ul>
							<ul class="row">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Product Category</label>
										<div class="col-md-7">
											<select class="form-control">
                                                <option>Select</option>
                                            </select>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Product Sub Category</label>
										<div class="col-md-7">
											<select class="form-control">
                                                <option>Select</option>
                                            </select>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Product Name</label>
										<div class="col-md-7">
											<select class="form-control">
                                                <option>Select</option>
                                            </select>
										</div>
									</div>
								</li>
							</ul>
							<ul class="row">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Booking Reference Number</label>
										<div class="col-md-7">
											<input type="text" class="form-control">
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">E Ticket ID</label>
										<div class="col-md-7">
											<input type="text" class="form-control">
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Passenger Name</label>
										<div class="col-md-7">
											<input type="text" class="form-control">
										</div>
									</div>
								</li>
							</ul>

							<ul class="row">
								<li class="col-md-4">
								<div class="radio-inline">
                                    <label>
                                        <input type="radio" name="supplierBillPass"> Booking</label>
                                </div>								
                                <div class="radio-inline">
                                    <label>
                                        <input type="radio" name="supplierBillPass">Travel</label>
                                </div>
								</li>
							</ul>
							<ul class="row">
								<li class="col-md-4">
									<div class="form-group">
                                            <label class="col-md-5 control-label">From</label>
                                            <div class="col-md-7">
                                                <input type="date" class="form-control">
                                            </div>
                                        </div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
                                            <label class="col-md-5 control-label">To</label>
                                            <div class="col-md-7">
                                                <input type="date" class="form-control">
                                            </div>
                                        </div>
								</li>
							</ul>
							<div class="margin-top-15 text-center">
								<button class="btn btn-default btn-sm " type="submit">Search</button>
								<button class="btn btn-default btn-sm " type="submit">Reset</button>
							</div>

							<div class="result-service-order">
								<h4>Results of Service Order</h4>

								<div class="form-group show-entries">
									<label class="col-md-4 control-label">Show<span class="mandatory">*<span></span></span>
                                    </label>
									<form:select path="pageSize" class="col-md-2 form-control">
                                        <option value="25">25</option>
                                        <option value="30">30</option>
                                    </form:select>
									<label class="control-label">Entries</label>
								</div>
								<div class="clearfix"></div>

								<div class="table-responsive margin-top-15">
									<table width="100%" cellspacing="0" cellpadding="0" border="0" class="table-main" valign="top">
										<tbody>
											<tr>
												<th colspan="11">&nbsp;</th>
												<th colspan="2">Status</th>
												<th colspan="4">Action</th>
											</tr>
											<tr>
												<th>Select</th>
												<th>Supplier Name</th>
												<th>Provisional Service Order ID</th>
												<th>Provisional Service Liability ID</th>
												<th>Final Service Order ID</th>
												<th>Final Service Liability ID</th>
												<th>Net Amount Payable</th>
												<th>Amount Paid</th>
												<th>Balance Amount Payable</th>
												<th>Difference Supplier Invoice</th>
												<th>Credit Note/ Debit Note</th>
												<th>Payment Advice Status</th>
												<th>Supplier Settlement Status</th>
												<th>Supplier Bill Entry</th>
												<th>Supplier Bill Status</th>
												<th>Payment Advice</th>
												<th>Stop Payment</th>
											</tr>
											<c:forEach items="${searchPageData.results}" var="searchData">
											<tr>
												<td>
													<input type="checkbox">
												</td>
												<td>${searchData.supplierName}</td>
												<td><a href="#viewFinalServiceOrder" data-toggle="modal">${searchData.psoId}</a></td>
                                                <td><a href="#viewFinalSupplierLiability" data-toggle="modal">${searchData.fsoId}</a></td>												
												<td><a href="javascript:void(0)">${searchData.pslId}</a></td>
												<td><a href="javascript:void(0)">${searchData.fslId}</a></td>
												<td>INR ${searchData.netAmountPayable}</td>
												<td>INR ${searchData.amountPaid}</td>
												<td>INR ${searchData.balanceAmountPayable}</td>
												<td>INR ${searchData.differenceSupplierInvoice}</td>
												<td>
													<a href="javascript:void(0)">${searchData.creditDebitNote}</a>
													<br>
													<a href="javascript:void(0)">${searchData.creditDebitNote}</a>
												</td>
												<td>${searchData.paymentAdviceStatus}</td>
												<td>${searchData.supplierSettlementStatus}</td>
												<td><a href="javascript:void(0)">${searchData.supplierBillEntry}</a></td>
												<td>${searchData.supplierBillStatus}</td>
												<td>
													<a href="javascript:void(0)">${searchData.paymentAdvice}</a>
													<br>
													<a href="javascript:void(0)">${searchData.paymentAdvice}</a>
												</td>
												<td>
													<a href="javascript:void(0)">${searchData.stopPayment}</a>
												</td>
											</tr>
											</c:forEach>
											
										</tbody>
									</table>

									<div class="modal fade" id="viewFinalServiceOrder" role="dialog">
										<div class="modal-dialog">
											<!-- Modal content -->
											<div class="modal-content">
												<div class="modal-header">
													<button type="button" class="close" data-dismiss="modal">&times;</button>
													<h4 class="modal-title">Final Service Order</h4>
												</div>
												<div class="modal-body">
                                                    <div class="view-final">
													<form class="form-horizontal">
														<div class="form-group">
															<label class="col-sm-6 control-label">Final Service Order ID</label>
															<div class="col-sm-6">
																<p class="form-control-static">432424</p>
															</div>
														</div>
														<div class="form-group">
															<label class="col-sm-6 control-label">Provisional Service Order ID</label>
															<div class="col-sm-6">
																<p class="form-control-static"><a href="javascript:void(0)">123456</a></p>
															</div>
														</div>
														<div class="form-group">
															<label class="col-sm-6 control-label">Version Number</label>
															<div class="col-sm-6">
																<p class="form-control-static">1.2</p>
															</div>
														</div>
														<div class="form-group">
															<label class="col-sm-6 control-label">Supplier Name</label>
															<div class="col-sm-6">
																<p class="form-control-static">ABC</p>
															</div>
														</div>
														<div class="form-group">
															<label class="col-sm-6 control-label">Product Name</label>
															<div class="col-sm-6">
																<p class="form-control-static">Jet Airways</p>
															</div>
														</div>
														<div class="form-group">
															<label class="col-sm-6 control-label">Status</label>
															<div class="col-sm-6">
																<p class="form-control-static">FSO Generated</p>
															</div>
														</div>
														<div class="form-group">
															<label class="col-sm-6 control-label">Currency</label>
															<div class="col-sm-6">
																<p class="form-control-static">INR</p>
															</div>
														</div>
														<div class="form-group">
															<label class="col-sm-6 control-label">Booking Reference Number</label>
															<div class="col-sm-6">
																<p class="form-control-static"><a href="javascript:void(0)">FZR242342</a></p>
															</div>
														</div>
														<div class="form-group">
															<label class="col-sm-6 control-label">Travel Completion Date</label>
															<div class="col-sm-6">
																<p class="form-control-static">10/10/2014</p>
															</div>
														</div>
														<div class="form-group">
															<label class="col-sm-6 control-label">Payment Advice</label>
															<div class="col-sm-6">
																<p class="form-control-static"><a href="javascript:void(0)">C54321</a></p>
															</div>
														</div>
													</form>
													<div class="table-responsive">
														<table width="100%" cellspacing="0" cellpadding="0" border="0" class="table-main" valign="top">
															<tbody>
																<tr class="sub-table">
																	<th colspan="4">Supplier Pricing</th>
																</tr>
																<tr class="sub-table">
																	<th>Passenger Type</th>
																	<th>Rate per Passenger</th>
																	<th>Number of Passengers</th>
																	<th>Supplier Cost Price</th>
																</tr>
																<tr>
																	<td>Adult</td>
																	<td>1000</td>
																	<td>2</td>
																	<td>INR 5000</td>
																</tr>
																<tr>
																	<td>Child</td>
																	<td>750</td>
																	<td>2</td>
																	<td>INR 2500</td>
																</tr>
																<tr>
																	<td>Infant</td>
																	<td>500</td>
																	<td>1</td>
																	<td>INR 1500</td>
																</tr>
																<tr>
																	<td colspan="3">Cancellation Charges</td>
																	<td>INR 0</td>
																</tr>
																<tr>
																	<td colspan="3">Amendment Charges</td>
																	<td>INR 0</td>
																</tr>
																<tr>
																	<td colspan="3">Supplier Commercials</td>
																	<td>INR 0</td>
																</tr>
																<tr>
																	<td colspan="3">Supplements</td>
																	<td>INR 0</td>
																</tr>
																<tr>
																	<td colspan="3">Surcharges</td>
																	<td>INR 0</td>
																</tr>
																<tr>
																	<td colspan="3">Upgrades</td>
																	<td>INR 1000</td>
																</tr>
																<tr>
																	<td colspan="3">Ancillaries</td>
																	<td>INR 0</td>
																</tr>
																<tr>
																	<td colspan="3">Net Supplier Cost</td>
																	<td>INR 10000</td>
																</tr>
																<tr>
																	<td colspan="3">Amount Paid</td>
																	<td>INR 7000</td>
																</tr>
																<tr>
																	<td colspan="3">Balance amount payable</td>
																	<td>INR 3000</td>
																</tr>
															</tbody>
														</table>
													</div>
													<div class="form-group margin-top-15">
														<label class="col-sm-6 control-label"><strong>Payment Status :</strong></label>
														<div class="col-sm-6">
															<p class="form-control-static">Partially Paid</p>
														</div>
													</div>
                                                    </div>
												</div>
												<div class="text-right panel-footer">
													<button type="button" class="btn btn-default " data-dismiss="modal">Close</button>
												</div>
											</div>
										</div>
									</div>

                                    <div class="modal fade" id="viewFinalSupplierLiability" role="dialog">
										<div class="modal-dialog">
											<!-- Modal content -->
											<div class="modal-content">
												<div class="modal-header">
													<button type="button" class="close" data-dismiss="modal">&times;</button>
													<h4 class="modal-title">Final Supplier Liability</h4>
												</div>
												<div class="modal-body">
                                                    <div class="view-final">
											<form class="form-horizontal">
												<div class="form-group">
													<label class="col-sm-6 control-label">Final Supplier Liability ID</label>
													<div class="col-sm-6">
														<p class="form-control-static">986542</p>
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-6 control-label">Provisional Supplier Liability ID</label>
													<div class="col-sm-6">
														<p class="form-control-static"><a href="javascript:void(0)">552643</a></p>
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-6 control-label">Final Service Order ID</label>
													<div class="col-sm-6">
														<p class="form-control-static"><a href="javascript:void(0)">546548</a></p>
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-6 control-label">Provisional Service Order ID</label>
													<div class="col-sm-6">
														<p class="form-control-static"><a href="javascript:void(0)">987989</a></p>
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-6 control-label">Version Number</label>
													<div class="col-sm-6">
														<p class="form-control-static">1.2</p>
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-6 control-label">Supplier Name</label>
													<div class="col-sm-6">
														<p class="form-control-static">ABC</p>
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-6 control-label">Product Name</label>
													<div class="col-sm-6">
														<p class="form-control-static">Jet Airways</p>
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-6 control-label">Status</label>
													<div class="col-sm-6">
														<p class="form-control-static">FSL Generated</p>
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-6 control-label">Currency</label>
													<div class="col-sm-6">
														<p class="form-control-static">INR</p>
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-6 control-label">Booking Reference Number</label>
													<div class="col-sm-6">
														<p class="form-control-static"><a href="javascript:void(0)">FZR242342</a></p>
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-6 control-label">Travel Completion Date</label>
													<div class="col-sm-6">
														<p class="form-control-static">10/10/2014</p>
													</div>
												</div>
												<div class="form-group">
													<label class="col-sm-6 control-label">Payment Advice</label>
													<div class="col-sm-6">
														<p class="form-control-static"><a href="javascript:void(0)">C23135</a> <a href="javascript:void(0)">C65464</a></p>
													</div>
												</div>
											</form>


											<div class="table-responsive">
												<table width="100%" cellspacing="0" cellpadding="0" border="0" class="table-main" valign="top">
													<tbody>
														<tr class="sub-table">
															<th colspan="4">Supplier Pricing</th>
														</tr>
														<tr class="sub-table">
															<th>Passenger Type</th>
															<th>Rate per Passenger</th>
															<th>Number of Passengers</th>
															<th>Supplier Cost Price</th>
														</tr>
														<tr>
															<td>Adult</td>
															<td>1000</td>
															<td>2</td>
															<td>INR 20000</td>
														</tr>
														<tr>
															<td>Child</td>
															<td>750</td>
															<td>2</td>
															<td>INR 10000</td>
														</tr>
														<tr>
															<td>Infant</td>
															<td>500</td>
															<td>1</td>
															<td>INR 500</td>
														</tr>
														<tr>
															<td colspan="3">Cancellation Charges</td>
															<td>INR 0</td>
														</tr>
														<tr>
															<td colspan="3">Amendment Charges</td>
															<td>INR 0</td>
														</tr>
														<tr>
															<td colspan="3">Supplier Commercials</td>
															<td>INR 0</td>
														</tr>
														<tr>
															<td colspan="3">Supplements</td>
															<td>INR 0</td>
														</tr>
														<tr>
															<td colspan="3">Surcharges</td>
															<td>INR 0</td>
														</tr>
														<tr>
															<td colspan="3">Upgrades</td>
															<td>INR 1000</td>
														</tr>
														<tr>
															<td colspan="3">Ancillaries</td>
															<td>INR 0</td>
														</tr>
														<tr>
															<td colspan="3">Net Supplier Cost</td>
															<td>INR 10000</td>
														</tr>
														<tr>
															<td colspan="3">Amount Paid</td>
															<td>INR 7000</td>
														</tr>
														<tr>
															<td colspan="3">Balance amount payable</td>
															<td>INR 3000</td>
														</tr>
													</tbody>
												</table>
											</div>
											<div class="form-group margin-top-15">
												<label class="col-sm-6 control-label"><strong>Payment Status :</strong></label>
												<div class="col-sm-6">
													<p class="form-control-static">Settled</p>
												</div>
											</div>
										</div>
												</div>
												<div class="text-right panel-footer">
													<button type="button" class="btn btn-default " data-dismiss="modal">Close</button>
												</div>
											</div>
										</div>
									</div>
								</div>

								<ul class="pagination pull-left">
									<li>
										<a aria-label="Previous" href="#">
											<span aria-hidden="true">«</span>
										</a>
									</li>
									<li><a href="#">1</a></li>
									<li><a href="#">2</a></li>
									<li><a href="#">3</a></li>
									<li>
										<a aria-label="Next" href="#">
											<span aria-hidden="true">»</span>
										</a>
									</li>
								</ul>

								<div class="pull-right margin-top-15">
									<button class="btn btn-default btn-sm " type="submit">Commen Payment Advice Generation</button>
									<button class="btn btn-default btn-sm " type="submit">Common Bill Passing</button>
									<button class="btn btn-default btn-sm " type="submit">Stop Payment on Invoice</button>
									<button class="btn btn-default btn-sm " type="submit">Cancel</button>
								</div>
								<div class="clearfix"></div>
							</div>

						</div>
						<div class="panel-footer text-right">
							<button class="btn btn-default btn-sm " type="submit">Submit</button>
							<button class="btn btn-default btn-sm " type="submit">Save</button>
							<button class="btn btn-default btn-sm " type="submit">Cancel</button>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</article>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
</body>

</template:page>