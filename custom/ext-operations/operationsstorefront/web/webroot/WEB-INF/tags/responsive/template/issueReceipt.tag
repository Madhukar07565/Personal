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
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/responsive/formElement"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="${commonResourcePath}/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="${commonResourcePath}/js/receiptsViewEdit.js"></script>

 <article>
        <div class="main">
            <div class="container">


                <div class="row">
                    <div class="col-md-3">
                        <h1>Issue/View Receipt</h1>
                    </div>
                    <div class="col-md-9 row">
                        <div class="counter-value">
                            <div class="col-sm-4 comm-container">
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
                            <div class="col-sm-4 comm-container">
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
                            <div class="col-sm-2 comm-container">
                                <a href="javascript:void(0)" class="text-center fa-dispatch"><i class="fa fa-shopping-cart"></i> <br> Dispatch</a>
                            </div>
                            <div class="col-sm-2 comm-container">
                                <h4>Company</h4>
                                <h5><a href="javascript:void(0)"><strong>Ezeego 1</strong></a> (India)</h5>
                            </div>
                        </div>
                    </div>
                </div>
                <form class="form-horizontal">
                    <div class="panel panel-default">
                        <div class="panel-heading main-heading">Issue/View Receipt</div>
                        <!-- Start Coupon Details -->
                        <section class="panel-body">
                            <ul>
                                <li>
                                    <div class="form-group">
                                        <div class="col-md-10 col-md-offset-2" data-bind="foreach:entityTypes">
                                            <label class="radio-inline">
                                                <input type="radio" name="optradio" data-bind="checked: $root.selectedEntityType, value:code"><span data-bind="text:name"></span>
                                            </label>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="form-group" >
                                        <div class="col-md-10 col-md-offset-2" data-bind="visible: selectedEntityType() === 'CLIENT' ? true : false, foreach:clientReceiptTypes">
                                        <!--<div class="col-md-10 col-md-offset-2">-->
                                            
                                            <label class="radio-inline">
                                                <input type="radio" name="r-type" data-bind="checked: $root.selectedClientReceiptType, value:code"><span data-bind="text:name"></span>
                                            </label>

<!--
                                            <label class="radio-inline">
                                                <input type="radio" name="r-type">Booking Receipt
                                            </label>
                                            <label class="radio-inline">
                                                <input type="radio" name="r-type">On Account Receipt
                                            </label>
                                            <label class="radio-inline">
                                                <input type="radio" name="r-type">Security Deposit Receipt
                                            </label>
                                            <label class="radio-inline">
                                                <input type="radio" name="r-type">Deposit Receipt
                                            </label>
-->

                                        </div>
                                    </div>
                                </li>
                            </ul>
                            <ul>
                                <li>
                                    <div class="form-group">
                                        <label class="col-md-2 control-label">Number / ID</label>
                                        <div class="col-md-4">
                                            <input type="text" class="form-control" placeholder="" data-bind="value:numberIDText">
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="form-group">
                                        <label class="col-md-2 control-label">Receipt No.</label>
                                        <div class="col-md-4">
                                            <input type="text" class="form-control" placeholder="" data-bind="value:receiptNoText">
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="form-group" data-bind="visible: selectedEntityType() === 'SUPPLIER' ? true : false">
                                        <label class="col-md-2 control-label">Supplier Name</label>
                                        <div class="col-md-4">
                                            <input type="text" class="form-control" placeholder="" data-bind="value:supplierNameText" >
                                        </div>
                                    </div>
                                </li>
                            </ul>

                            <div class="row">
                                <div class="col-md-8" data-bind="visible: selectedEntityType() === 'CLIENT' ? true : false">
                                    <fieldset>
                                        <legend> Client Details</legend>

                                        <div class="table-responsive">
                                            <table width="100%" cellspacing="0" cellpadding="0" border="0" class="table-main" valign="top">
                                                <tbody>
                                                    <tr class="sub-table">
                                                        <th>Client Type</th>
                                                        <th>Client Category</th>
                                                        <th>Client Sub Category</th>
                                                        <th>Client Name</th>
                                                        <th>Passenger Name</th>
                                                    </tr>
                                                    <tr>
                                                        <td>
										                  <select class="form-control" data-bind="options:clientTypes, optionsText:'name', value:selectedClientType">
											             </select>

                                                        </td>
                                                        <td>
										                  <select class="form-control" data-bind="options:clientCategories, optionsText:'name', value:selectedClientCategory">
											             </select>
                                                        </td>
                                                        <td>
										                  <select class="form-control" data-bind="options:clientSubCategories, optionsText:'name', value:selectedClientSubCategory">
											             </select>
                                                        </td>
                                                        <td>
                                                            <input type="text" class="form-control">
                                                        </td>
                                                        <td>
                                                            <input type="text" class="form-control">
                                                        </td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>

                                    </fieldset>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-8">
                                    <fieldset>
                                        <legend>Product Details</legend>

                                        <div class="table-responsive">
                                            <table width="100%" cellspacing="0" cellpadding="0" border="0" class="table-main" valign="top">
                                                <tbody>
                                                    <tr class="sub-table">
                                                        <th>Product Category</th>
                                                        <th>Product Sub Category</th>
                                                        <th>Product Name</th>
                                                        <th>Product Name Sub Type</th>
                                                        <th>Product Flavour Name</th>
                                                    </tr>
                                                    <tr>
                                                        <td>Accommodation</td>
                                                        <td>Hotel</td>
                                                        <td>Hotel Novotel</td>
                                                        <td>-</td>
                                                        <td>-</td>
                                                    </tr>
                                                    <tr>
                                                        <td>Activities</td>
                                                        <td>Tour & Sightseeing</td>
                                                        <td>Sentosa Tours</td>
                                                        <td>Sentosa with Dinner</td>
                                                        <td>-</td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>

                                    </fieldset>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-12">
                                    <fieldset>
                                        <legend>Payment Details</legend>

                                        <div class="table-responsive">
                                            <table width="1600px" cellspacing="0" cellpadding="0" border="0" class="table-main" valign="top">
                                                <tbody>
                                                    <tr class="sub-table">
                                                        <th>Infavour of</th>
                                                        <th>Payment Method</th>
                                                        <th>Currency</th>
                                                        <th>ROE</th>
                                                        <th>Receipt Date</th>
                                                        <th>Transaction Date</th>
                                                        <th>Receipt Amount (Transaction Amount)</th>
                                                        <th>MSF Charges</th>
                                                        <th>Total Receipt Amount</th>
                                                        <th>Functional Amount</th>
                                                    </tr>
                                                    <tr>
                                                        <td>
                                                            <input type="number" class="form-control">
                                                        </td>
                                                        <td>
										                  <select class="form-control" data-bind="options:paymentMethods, optionsText:'name', value:selectedPaymentMethod">
											             </select>
                                                        </td>
                                                        <td>
										                  <select class="form-control" data-bind="options:currencies, optionsText:'name', value:selectedCurrency">
											             </select>
                                                        </td>
                                                        <td>
                                                            <input type="text" disabled class="form-control">
                                                        </td>
                                                        <td>
                                                            <input type="date" class="form-control">
                                                        </td>
                                                        <td>
                                                            <input type="text" disabled class="form-control">
                                                        </td>
                                                        <td>
                                                            <input type="number" class="form-control">
                                                        </td>
                                                        <td>
                                                            <input type="number" class="form-control">
                                                        </td>
                                                        <td>
                                                            <input type="text" disabled class="form-control">
                                                        </td>
                                                        <td>
                                                            <input type="text" disabled class="form-control">
                                                        </td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>

                                        <ul class="margin-top-15">
                                            <li>
                                                <div class="form-group">
                                                    <label class="col-md-2 control-label">Date of Payment</label>
                                                    <div class="col-md-4">
                                                        <input type="date" class="form-control">
                                                    </div>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="form-group">
                                                    <label class="col-md-2 control-label">Mode of Payment</label>
                                                    <div class="col-md-4">
										                  <select class="form-control" data-bind="options:modeOfPayments, optionsText:'name', value:selectedModeOfPayment">
                                                        </select>
                                                    </div>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="form-group">
                                                    <label class="col-md-2 control-label">Currency</label>
                                                    <div class="col-md-4">
                                                        <select class="form-control">
                                                            <option>Select</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="form-group">
                                                    <label class="col-md-2 control-label">Amount Received</label>
                                                    <div class="col-md-4">
                                                        <input type="text" class="form-control">
                                                    </div>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="form-group">
                                                    <label class="col-md-2 control-label">Payment Status</label>
                                                    <div class="col-md-4">
                                                        <select class="form-control">
                                                            <option>Select</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </li>

                                        </ul>

                                        <div class="row">
                                            <div class="col-md-6 margin-top-30">
                                                <div class="form-horizontal">
                                                    <!--<div class="form-group">
                                                        <label class="col-md-6 control-label">Payment Type</label>
                                                        <div class="col-md-6">
                                                            <select class="form-control">
                                                                <option>Credit Card</option>
                                                            </select>
                                                        </div>
                                                    </div>-->
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Bank Name</label>
                                                        <div class="col-md-6">
                                                            <select class="form-control">
                                                                <option>ICICI Bank</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Card Number</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Card Type</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="Visa" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Name On Card</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="Mr. A Kumar" class="form-control">
                                                        </div>
                                                    </div>
                                                    <!--<div class="form-group">
                                                        <label class="col-md-6 control-label">Currency</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="INR" disabled="" class="form-control">
                                                        </div>
                                                    </div>-->
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">CVV Number</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="5000" class="form-control">
                                                        </div>
                                                    </div>
                                                    <!--<div class="form-group">
                                                        <label class="col-md-6 control-label">Payment Ref. No.</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="12345" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Transaction ID</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="TR1321313" class="form-control">
                                                        </div>
                                                    </div>-->
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Expiry of Card</label>
                                                        <div class="col-md-6">
                                                            <input type="date" class="form-control">
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                           <!-- <div class="col-md-6 margin-top-30">
                                                <div class="form-horizontal">
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Payment Type</label>
                                                        <div class="col-md-6">
                                                            <select class="form-control">
                                                                <option>Wire Transfer</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Deposited Bank Name</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="ICICI Bank" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Cheque / DD No.</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="523223" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Account Number</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="5493635164404" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Cheque / DD Date</label>
                                                        <div class="col-md-6">
                                                            <input type="date" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Currency</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="INR" disabled="" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Amount</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="5000" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Payment Ref No.</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="5000" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Transaction ID</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="TR1321313" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Date of Payment</label>
                                                        <div class="col-md-6">
                                                            <input type="date" class="form-control">
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="clearfix"></div>

                                            <div class="col-md-6 margin-top-30">
                                                <div class="form-horizontal">
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Payment Type</label>
                                                        <div class="col-md-6">
                                                            <select class="form-control">
                                                                <option>Wire Transfer / NFT</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">From Bank Name</label>
                                                        <div class="col-md-6">
                                                            <select class="form-control">
                                                                <option>ICICI Bank</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">To Bank Name</label>
                                                        <div class="col-md-6">
                                                            <select class="form-control">
                                                                <option>HDFC Bank</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Account Number</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="5493635164404" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">SWIFT / IFSC</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="ICI123456" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Intermediary Bank SWIFT / IFSC Code</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="43902" class="form-control">
                                                        </div>
                                                    </div>

                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Currency</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="INR" disabled="" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Amount</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="5000" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Payment Ref No.</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="5000" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Transaction ID</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="TR1321313" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Date of Payment</label>
                                                        <div class="col-md-6">
                                                            <input type="date" class="form-control">
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="col-md-6 margin-top-30">
                                                <div class="form-horizontal">
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Payment Type</label>
                                                        <div class="col-md-6">
                                                            <select class="form-control">
                                                                <option>Cash</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Deposited Bank Name</label>
                                                        <div class="col-md-6">
                                                            <select class="form-control">
                                                                <option>ICICI Bank</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Account Number</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="5493635164404" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Currency</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="INR" disabled="" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Amount</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="5000" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Payment Ref No.</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="5000" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Transaction ID</label>
                                                        <div class="col-md-6">
                                                            <input type="text" value="TR1321313" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="col-md-6 control-label">Date of Payment</label>
                                                        <div class="col-md-6">
                                                            <input type="date" class="form-control">
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>-->
                                        </div>

                                        <ul class="margin-top-15">
                                            <li>
                                                <div class="form-group" data-bind="visible: selectedEntityType() === 'CLIENT' ? true : false" >
                                                    <label class="col-md-2 control-label">Pan Card Details</label>
                                                    <div class="col-md-8">
                                                        <label class="radio-inline">
                                                            <input type="radio" name="payment-opt"> Client
                                                        </label>
                                                        <label class="radio-inline">
                                                            <input type="radio" name="payment-opt"> Passanger
                                                        </label>
                                                    </div>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="form-group" data-bind="visible: selectedEntityType() === 'client' ? true : false">
                                                    <label class="col-md-2 control-label">Pan Card Number</label>
                                                    <div class="col-md-4">
                                                        <input type="text" class="form-control">
                                                    </div>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="form-group">
                                                    <label class="col-md-2 control-label">Reason for Issuing Receipt</label>
                                                    <div class="col-md-4">
                                                        <textarea class="form-control"></textarea>
                                                    </div>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="form-group">
                                                    <label class="col-md-2 control-label">Remarks</label>
                                                    <div class="col-md-4">
                                                        <input type="text" class="form-control">
                                                    </div>
                                                </div>
                                            </li>

                                        </ul>
                                    </fieldset>
                                </div>
                            </div>

                        </section>
                        <!-- End Unutilized Coupons List & Start Summary of Charges -->
                        <div class="panel-footer text-right">
                            <button type="submit" class="btn btn-default btn-sm ">Email Receipt</button>
                            <button type="submit" class="btn btn-default btn-sm ">Print Receipt</button>
                            <button type="submit" class="btn btn-default btn-sm ">Apply Receipt</button>
                            <button type="submit" class="btn btn-default btn-sm ">Unapply Receipt</button>
                            <button type="submit" class="btn btn-default btn-sm ">Reverse Receipt</button>
                            <button type="submit" class="btn btn-default btn-sm " data-bind="click:save">Save</button>
                            <button type="submit" class="btn btn-default btn-sm ">Cancel</button>
                        </div>

                        <!-- End Summary of Charges -->
                    </div>
                </form>
            </div>
        </div>

    </article>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
	<script src="../lib/knockout-3.4.0.js"></script>
	<script src="../js/receiptsViewEdit.js"></script>