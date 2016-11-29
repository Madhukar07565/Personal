<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<section class="panel-body form-horizontal"
	data-bind="visible: $root.selectedConfiguration().code === 'client' || $root.selectedConfiguration().code === 'clientAndSupplier' ? true : false">
	<fieldset>
		<legend>Client Details</legend>
		<ul class=" row ">
			<li class="col-md-4 ">
				<div class="form-group ">
					<label class="col-md-6 control-label ">Client Type<span
						class="mandatory ">*</span></label>
					<div class="col-md-6 ">
						<select class="form-control"
							data-bind="options: clientTypes, optionsText:'name', value:selectedClientType, optionsCaption: 'Choose Client Type'">
						</select>
					</div>
				</div>
			</li>
			<li class="col-md-4 ">
				<div class="form-group ">
					<label class="col-md-6 control-label ">Client Category</label>
					<div class="col-md-6 ">
						<select class="form-control"
							data-bind="options: clientCategories, optionsText:'name',value:selectedClientCategory, optionsCaption: 'Choose Client Category', optionsText:'code' ">
						</select>
					</div>
				</div>
			</li>
			<li class="col-md-4 ">
				<div class="form-group ">
					<label class="col-md-6 control-label ">Client Category Sub
						Type</label>
					<div class="col-md-6 ">
						<select class="form-control"
							data-bind="options: clientSubCategories,optionsText:'name', value:selectedClientSubCategory, optionsCaption: 'Choose Client Sub Category', optionsText:'code' ">
						</select>
					</div>
				</div>
			</li>
			<li class="col-md-4">
				<div class="form-group">
					<label class="col-md-6 control-label">Client Name</label>
					<div class="col-md-6">
						<select class="form-control"
							data-bind="options: clientNames, value:selectedClientName, optionsCaption: 'Choose Name', optionsText:'name' ">
						</select>
					</div>
				</div>
			</li>
			<li class="col-md-4 ">
				<div class="form-group ">
					<label class="col-md-6 control-label ">Client Group</label>
					<div class="col-md-6 ">
						<select class="form-control"
							data-bind="options: clientNames, value:selectedClientGroup, optionsCaption: 'Choose Group', optionsText:'clientGroup' ">
						</select>
					</div>
				</div>
			</li>
			<li class="col-md-4 ">
				<div class="form-group ">
					<label class="col-md-6 control-label ">Reconfirmation To Be
						Send<span class="mandatory ">*</span>
					</label>
					<div class="col-md-6 ">
						<select class="form-control"
							data-bind="options: reconfirmationToBeSentTypes, value:selectedReconfirmationToBeSentType, optionsCaption: 'Choose Type', optionsText:'code' ">
						</select>
					</div>
				</div>
			</li>
			<li class="col-md-12 text-right ">
				<button class="btn btn-default btn-sm "
					data-bind="click: clientDetailsAdd">Add/Save</button>
			</li>
		</ul>
		<table cellpadding="0 " cellspacing="0 " border="0 " valign="top "
			width="100% " class="table-main margin-top-15 ">
			<thead>
				<tr>
					<th>Client Type</th>
					<th>Client Category</th>
					<th>Client Sub Category</th>
					<th>Client Name or Client Group</th>
					<th>Reconfirmation To be Sent To</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>B2C</td>
					<td>Travel Agent</td>
					<td>Retail</td>
					<td>B2C India</td>
					<td>Client</td>
					<td><a href="# ">Edit</a> / <a href="# ">Delete</a></td>
				</tr>
			</tbody>
		</table>
	</fieldset>
	<fieldset>
		<legend>Client / Customer Reconfirmation Setting</legend>
		<ul class="row ">
			<li class="col-md-4 ">
				<div class="form-group ">
					<label class="col-md-6 control-label ">Reconfirmation
						Cut-off<span class="mandatory ">*</span>
					</label>
					<div class="col-md-6 ">
						<select class="form-control ">
							<option>Select</option>
							<option>Select</option>
						</select>
					</div>
				</div>
			</li>
			<li class="col-md-4 ">
				<div class="form-group ">
					<label class="col-md-5 control-label ">No. of Days/hours<span
						class="mandatory ">*</span></label>
					<div class="col-md-3 ">
						<input type="text " value="2 " class="form-control " />
					</div>
					<div class="col-md-4 ">
						<select class="form-control ">
							<option>Select</option>
							<option>Select</option>
						</select>
					</div>
				</div>
			</li>
			<li class="col-md-4 ">
				<div class="form-group ">
					<button type="submit " class="btn btn-default btn-sm ">Add/Save</button>
				</div>
			</li>
		</ul>
		<table cellpadding="0 " cellspacing="0 " border="0 " valign="top "
			width="100% " class="table-main ">
			<thead>
				<tr>
					<th>Client Type</th>
					<th>Client Category</th>
					<th>Client Sub Category</th>
					<th>Client Name or Client Group</th>
					<th>Reconfirmation To be Sent To</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>B2C</td>
					<td>Travel Agent</td>
					<td>Retail</td>
					<td>B2C India</td>
					<td>Client</td>
					<td><a href="# ">Edit</a> / <a href="# ">Delete</a></td>
				</tr>
			</tbody>
		</table>
	</fieldset>
</section>

