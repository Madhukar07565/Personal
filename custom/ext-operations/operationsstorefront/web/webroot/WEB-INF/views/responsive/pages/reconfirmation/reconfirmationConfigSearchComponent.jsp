<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="pagination"
	tagdir="/WEB-INF/tags/responsive/nav/pagination"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/responsive/nav"%>
<script type="text/javascript">
	mode = '${mode}';
	confirmationFor = '${confirmationFor}';
	clientTypes = '${clientTypes}';
	recofirmationCutOffType = '${recofirmationCutOffType}';
	recofirmationToBeSentTo = '${recofirmationToBeSentTo}';
	clientCategories = '${clientCategories}';
	clientSubCategories = '${clientSubCategories}';
	productCategoryAndSubCategories = '${productCategoryAndSubCategories}';
	clientGroups = '${clientGroups}';
</script>
<article>


	<div class="main">
		<div class="container" id="CKIL_234485">
			<h1>
<spring:message code="reconfirmation.header.reconfirm.label"/>
			</h1>
			<div class="panel panel-default">
				<div class="panel-heading main-heading"><spring:message code="reconfirmation.search.label"/></div>
				<section class="panel-body form-horizontal">
					<ul class="row">
						<li class="col-md-4">
							<div class="form-group">
								<label class="col-md-5 control-label"><spring:message code="reconfirmation.configurationfor.label"/><span
									class="mandatory">*</span></label>
								<div class="col-md-7">
									<select class="form-control"
										data-bind="options: configurations, value:selectedConfiguration, optionsCaption: 'Choose Configuration', optionsText:'name' ">
									</select>
								</div>
							</div>
						</li>
						<li class="col-md-4">
							<div class="form-group">
								<label class="col-md-5 control-label"><spring:message code="reconfirmation.product.category.label"/></label>
								<div class="col-md-7">
									<select class="form-control"
										data-bind="options: productCategories, value:selectedProductCategory, optionsText:'name', optionsCaption: 'Choose Product Category' ">
									</select>
								</div>
							</div>
						</li>
						<li class="col-md-4">
							<div class="form-group">
								<label class="col-md-5 control-label"><spring:message code="reconfirmation.product.category.sub.type.label"/></label>
								<div class="col-md-7">
									<select class="form-control"
										data-bind="options: $root.selectedProductCategory() ? $root.selectedProductCategory().subCategory : null, value:selectedSubCategory, optionsText:'name' , optionsCaption: 'Choose Product sub Category'">
									</select>
								</div>
							</div>
						</li>
						<li class="col-md-4">
							<div class="form-group">
								<label class="col-md-5 control-label"><spring:message code="reconfirmation.product.name.label"/></label>
								<div class="col-md-7">
									<select class="form-control"
										data-bind="options: products, value:selectedProduct,optionsText:'name', optionsCaption: 'Choose Product Name'">
									</select>
								</div>
							</div>
						</li>
						<li class="col-md-4" >
							<div class="form-group">
								<label class="col-md-5 control-label"><spring:message code="reconfirmation.supplier.name.label"/></label>
								<div class="col-md-7">
									<select class="form-control"
										data-bind="options: supplierNames, value:selectedSupplierName,optionsText:'name', optionsCaption: 'Choose Supplier Name' ,enable: $root.selectedConfiguration() && $root.selectedConfiguration() .code === 'supplier'? true : false">
									</select>
								</div>
							</div>
						</li>
						<li class="col-md-4">
							<div class="form-group">
								<label class="col-md-5 control-label"><spring:message code="reconfirmation.client.type.label"/>
</label>
								<div class="col-md-7">
									<select class="form-control"
										data-bind="options: clientTypes, optionsText:'name', value:selectedClientType, optionsCaption: 'Choose Client Type',enable: $root.selectedConfiguration() && $root.selectedConfiguration() .code === 'client'? true :false">
									</select>
								</div>
							</div>
						</li>
						<li class="col-md-4">
							<div class="form-group">
								<label class="col-md-5 control-label"><spring:message code="reconfirmation.client.category.label"/>
</label>
								<div class="col-md-7">
									<select class="form-control"
										data-bind="options: clientCategories, value:selectedClientCategory,optionsCaption: 'Choose Client Category',optionsText:'name' ,enable: $root.selectedConfiguration() && $root.selectedConfiguration() .code === 'client'? true :false">
									</select>
								</div>
							</div>
						</li>
						<li class="col-md-4">
							<div class="form-group">
								<label class="col-md-5 control-label"><spring:message code="reconfirmation.client.sub.category.label"/>
</label>
								<div class="col-md-7">
									<select class="form-control"
										data-bind="options: clientSubCategories, value:selectedClientSubCategory,optionsCaption: 'Choose Client Sub Category',optionsText:'name' ,enable: $root.selectedConfiguration() && $root.selectedConfiguration() .code === 'client'? true :false">
									</select>
								</div>
							</div>
						</li>
						<li class="col-md-4">
							<div class="form-group">
								<label class="col-md-5 control-label"><spring:message code="reconfirmation.client.name.label"/></label>
								<div class="col-md-7">
									<select class="form-control"
										data-bind="options:clientNames, value:selectedClientName,optionsText:'name', optionsCaption: 'Choose Client Name' ,enable: $root.selectedConfiguration() && $root.selectedConfiguration() .code === 'client'? true :false">
									</select>
								</div>
							</div>
						</li>
						<li class="col-md-4">
							<div class="form-group">
								<label class="col-md-5 control-label"><spring:message code="reconfirmation.client.group.label"/></label>
								<div class="col-md-7">
									<select class="form-control"
										data-bind="options:clientGroups, value:selectedClientGroup,optionsCaption: 'Choose Client Group',optionsText:'name' ,enable: $root.selectedConfiguration() && $root.selectedConfiguration() .code === 'client'? true :false">
									</select>
								</div>
							</div>
						</li>
						<li class="col-md-12">
							<div class="form-group">
								<div class="col-md-2 col-md-offset-7">
									<button class="btn btn-default btn-sm"
										data-bind="click: searchConfiguration"><spring:message code="reconfirmation.button.search.label"/></button>
									<button class="btn btn-default btn-sm"
										data-bind="click: resetForm"><spring:message code="reconfirmation.button.reset.label"/></button>
								</div>
								<div class="col-md-2">
									<div class="form-group show-entries">
										<label class="col-md-4 control-label"><spring:message code="reconfirmation.show.label"/><span
											class="mandatory">*</span></label> <select
											class="col-md-2 form-control">
											<option>25</option>
											<option>30</option>
										</select> <label class="control-label"><spring:message code="reconfirmation.entries.label"/></label>
									</div>
								</div>
							</div>
							<div class="alert alert-danger fade in"
								data-bind="visible: validationError">
				<spring:message code="reconfirmation.search.blank.click.error"/>
							</div>
						</li>
					</ul>
					<div class="table-responsive">
						<table cellpadding="0" cellspacing="0" border="0" valign="top"
							width="100%" class="table-main">
							<thead>
								<tr class="sub-table">
									<th><spring:message code="reconfirmation.result.header.config.id.label"/></th>
									<th><spring:message code="reconfirmation.result.header.creation.date.label"/></th>
									<th><spring:message code="reconfirmation.configurationfor.label"/></th>
									<th><spring:message code="reconfirmation.product.category.label"/></th>
									<th><spring:message code="reconfirmation.product.category.sub.type.label"/></th>
									<th><spring:message code="reconfirmation.product.name.label"/></th>
									<th><spring:message code="reconfirmation.supplier.name.label"/></th>
									<th><spring:message code="reconfirmation.client.type.label"/></th>
									<th><spring:message code="reconfirmation.client.category.label"/></th>
									<th><spring:message code="reconfirmation.client.sub.category.label"/></th>
									<th><spring:message code="reconfirmation.client.name.label"/>/<spring:message code="reconfirmation.client.group.label"/></th>
									<th><spring:message code="reconfirmation.result.header.status.label"/></th>
									<th><spring:message code="reconfirmation.result.header.action.label"/></th>
								</tr>
							</thead>
							<tbody data-bind="foreach: $root.resultantConfigurations">
								<tr>
									<td data-bind="text: code"></td>
									<td data-bind="text: creationTime"></td>
									<td data-bind="text: confirmationFor"></td>
									<td data-bind="text: productCategory.name"></td>
									<td data-bind="text: productCategorySubType.name"></td>
									<td data-bind="text: product.name"></td>
									<td>
										<div data-bind="foreach: supplierReconfirmationConfigs">
											<div data-bind="text: supplier.name"></div>
										</div>
									</td>

									<td>
										<div data-bind="foreach: clientReconfirmationConfigs">
											<div data-bind="text: client.trvlClientType"></div>
										</div>
									</td>

									<td>
										<div data-bind="foreach: clientReconfirmationConfigs">
											<div data-bind="text: client.clientCategory"></div>
										</div>
									</td>
									<td>
										<div data-bind="foreach: clientReconfirmationConfigs">
											<div data-bind="text: client.clientSubCategory"></div>
										</div>
									</td>
									<td>
										<div data-bind="foreach: clientReconfirmationConfigs">
											<div data-bind="text: client.name"></div>
											/
											<div data-bind="text: client.clientGroupCompany"></div>
										</div>
									</td>
									<!-- ko if:active -->
									<td><span aria-hidden="true"
										class="glyphicon glyphicon-star"></span><spring:message code="reconfirmation.activate.link.label"/></td>
									<!-- /ko -->
									<!-- ko if: !active -->
									<td><spring:message code="reconfirmation.deactivate.link.label"/> <span aria-hidden="true"
										class="glyphicon glyphicon-lock"></span></td>
									<!-- /ko -->
									<td><a data-bind="attr: { href: '${pageContext.request.contextPath}/reconfirmation/view/' + code }"><spring:message code="reconfirmation.view.link.label"/></a>
										/ 
										<a data-bind="click: $parent.checkLocked ,attr: { href: '${pageContext.request.contextPath}/reconfirmation/update/' + code }"><spring:message code="reconfirmation.edit.link.label"/></a>
										<!-- ko if:approvalStatus =='CHECK' || approvalStatus =='UNAPPROVED' -->
										<a data-bind="click: $parent.deleteLinkClicked ">/
											<spring:message code="reconfirmation.delete.link.label"/></a> <!-- /ko --> <!-- ko if: approvalStatus =='APPROVED' && active -->
										<a data-trigger="hover" data-bind="click: $parent.doDeactivate" data-toggle="modal" href="#activateDeactivate">/
											<spring:message code="reconfirmation.deactivate.link.label"/></a> <!-- /ko --> <!-- ko if:!active && (approvalStatus =='APPROVED') -->
										<a data-trigger="hover" data-bind="click: $parent.doActivate" data-toggle="modal" href="#activateDeactivate">/
											<spring:message code="reconfirmation.activate.link.label"/></a> <!-- /ko --></td>
								</tr>
							</tbody>
						</table>
					<!--  Activate or Deactivate functionality -->	
							<div class="modal fade" id="activateDeactivate" role="dialog">
								<div class="modal-dialog">
									<!-- Modal content -->
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal">&times;</button>
											<h4 class="modal-title" data-bind="text: $root.activateDeactivate.forActivate() ? 'Activate' : 'Deactivate'"></h4>
										</div>
										<div class="modal-body">
											<div>
												<ul class="row">
													<li class="col-md-12">
														<div class="form-group">
															<label class="col-md-2 control-label">Effective from</label>
															<div class="col-md-10">
																<input type="date" class="form-control" data-bind="date:$root.activateDeactivate.effectiveFromDate()"/>
															</div>
														</div>
													</li>
													<li class="col-md-12">
														<div class="form-group">
															<label class="col-md-2 control-label">Reason</label>
															<div class="col-md-10">
																<textarea class="form-control" data-bind="value:$root.activateDeactivate.reason, valueUpdate:'keyup'"></textarea>
															</div>
														</div>
													</li>
												</ul>
											</div>
										</div>
										<div class="text-right panel-footer">
											<button type="button" class="btn btn-default btn-sm " data-dismiss="modal" data-bind="click: activateDeactivate.actionButtonClicked, text: $root.activateDeactivate.forActivate() ? 'Activate' : 'Deactivate'" type="submit"></button>
											<button type="button" class="btn btn-default " data-dismiss="modal">Cancel</button>
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
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#" aria-label="Next"> <span
								aria-hidden="true">&raquo;</span>
						</a></li>
					</ul>
				</section>
				<div class="text-right panel-footer">
					<a
						data-bind="attr: { href: '${pageContext.request.contextPath}/reconfirmation/add'}"
						class="btn btn-secondary btn-sm" role="button" aria-pressed="true"><spring:message code="reconfirmation.button.add.label"/></a>
					<button class="btn btn-default btn-sm" type="submit"><spring:message code="reconfirmation.button.cancel.label"/></button>
				</div>
			</div>
		</div>
	</div>
</article>
<script type="text/javascript"
	src="${commonResourcePath}/js/reconfirmationConfigurationSearch.js"></script>
	