<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="reconfirmation" tagdir="/WEB-INF/tags/responsive/reconfirmation"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="formElement"
	tagdir="/WEB-INF/tags/responsive/formElement"%>
		<script type="text/javascript" src="${commonResourcePath}/js/reconfirmationConfiguration.js"></script>  

<script type="text/javascript">
	mode = '${mode}';
      confirmationFor = '${confirmationFor}';
      clientTypes = '${clientTypes}';
      recofirmationCutOffType = '${recofirmationCutOffType}';
      recofirmationToBeSentTo = '${recofirmationToBeSentTo}';
      clientCategories ='${clientCategories}';
      clientSubCategories = '${clientSubCategories}';
      productCategoryAndSubCategories = '${productCategoryAndSubCategories}';
      clientGroups = '${clientGroups}';
      continents='${continents}';
      countries='${countries}';
      cities='${cities}';
      
      </script>
<article>
		<div class="main">
			<div class="container">
				<h1>Reconfirmation <span>Configuration</span></h1>
				<div class="panel panel-default">
					<div class="panel-heading main-heading">
						Reconfirmation Configuration - Add/Edit/View
					</div>
							<div class="panel-heading">
						Product Details
					</div>
			
					<reconfirmation:reconfirmationProductDetailsTab/>
					
				<div class="panel-heading " data-bind="visible: $root.selectedConfiguration().code === 'client' || $root.selectedConfiguration().code === 'clientAndSupplier' ? true : false">
						Configure for Client / Customer Reconfirmation
					</div>

					<reconfirmation:clientReconfirmationConfigTab/>				
					
							<div class="panel-heading" data-bind="visible: $root.selectedConfiguration().code === 'supplier' || $root.selectedConfiguration().code === 'clientAndSupplier' ? true : false">
						Configure for Supplier Reconfirmation
			</div>
					<reconfirmation:supplierReconfirmationConfigTab/>
			
						<div class="panel-footer ">
						<ul class="row ">
							<li class="text-right col-md-12 ">
								<div class="margin-bottom ">
									<button type="submit" class="btn btn-default btn-sm " data-bind="click: saveButtonClicked">Save</button>
									<button type="submit" class="btn btn-default btn-sm ">Cancel</button>
									<button type="submit" class="btn btn-default btn-sm" data-bind="click: releaseLockButtonClicked">Release Lock</button>
									<button type="submit" class="btn btn-default btn-sm" data-bind="click: updateButtonClicked">Edit</button>
									<button type="submit" class="btn btn-default btn-sm ">Submit</button>
								</div>
							</li>
							<li>
								<div class="col-md-5 pull-right text-right ">
									<label class="col-md-2 entries ">Remark</label>
									<div class="col-md-6 text-right entries ">
										<input type="text" placeholder="INR XXXX " value=" " class="form-control " />
									</div>
									<div>
										<button type="submit" class="btn btn-default btn-sm" data-bind="click: approvalButtonClicked">Approve</button>
										<button type="submit" class="btn btn-default btn-sm" data-bind="click: rejectButtonClicked">Reject</button>
									</div>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</article>
		