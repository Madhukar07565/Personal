<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
	
				<section class="panel-body form-horizontal">
						<ul class="row">
							<li class="col-md-4">
								<div class="form-group">
									<label class="col-md-6 control-label">Configuration For<span class="mandatory">*</span></label>
									<div class="col-md-6">
										<select class="form-control" data-bind="enable:isEditable,  options: configurations, optionsText:'name', value:selectedConfiguration">
											</select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label class="col-md-6 control-label">Product Category<span class="mandatory ">*</span></label>
									<div class="col-md-6 ">
										<select class="form-control" data-bind="options: productCategories, optionsText:'name', value:selectedProductCategory">
											</select>
									</div>
								</div>
							</li>
							<li class="col-md-4 ">
								<div class="form-group ">
									<label class="col-md-6 control-label ">Product Category Sub Type</label>
									<div class="col-md-6 ">
										<select class="form-control" data-bind="options:  $root.selectedProductCategory() ? $root.selectedProductCategory().subCategory : null, optionsText:'name', value:selectedProductSubCategory, optionsCaption: 'Choose Sub category'">
											</select>
									</div>
								</div>
							</li>
							<li class="col-md-4 ">
								<div class="form-group ">
									<label class="col-md-6 control-label ">Product Name</label>
									<div class="col-md-6 ">
										<select class="form-control" data-bind="options: products, optionsText:'name', value:selectedProduct,optionsCaption: 'Choose Product Name'">
											</select>
									</div>
								</div>
							</li>
							<li class="col-md-4 ">
								<div class="form-group ">
									<label class="col-md-6 control-label ">Product Name Sub Type</label>
									<div class="col-md-6 ">
										<select class="form-control" data-bind="options: selectedProduct, optionsText:'name', value:selectedProductSubType">
											</select>
									</div>
								</div>
							</li>
							<li class="col-md-4 ">
								<div class="form-group ">
									<label class="col-md-6 control-label ">Product Flavor Name</label>
									<div class="col-md-6 ">
										<select class="form-control" data-bind="options: selectedProductSubType, optionsText:'name', value:selectedProductFlavor">
											</select>
									</div>
								</div>
							</li>
						</ul>
					</section>
