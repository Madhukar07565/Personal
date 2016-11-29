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
	data-bind="visible: $root.selectedConfiguration().code === 'supplier' || $root.selectedConfiguration().code === 'clientAndSupplier' ? true : false">
	<div class="form-horizontal row ">
		<div class="col-md-6 ">
			<fieldset>
				<legend>Supplier Details</legend>
				<ul>
					<li>
						<div class="form-group ">
							<label class="col-md-5 control-label ">Supplier Name<span
								class="mandatory ">*</span></label>
							<div class="col-md-4 ">
								<select class="form-control ">
									<option>Select</option>
									<option>Select</option>
								</select>
							</div>
						</div>
					</li>
					<li>
						<div class="form-group ">
							<label class="col-md-5 control-label ">Reconfirmation To
								be Sent to<span class="mandatory ">*</span>
							</label>
							<div class="col-md-4 ">
								<select class="form-control ">
									<option>Select</option>
									<option>Select</option>
								</select>
							</div>
							<div class="col-md-3 ">
								<button type="submit " class="btn btn-default btn-sm ">Add/Save</button>
							</div>
						</div>
					</li>
				</ul>
				<table cellpadding="0 " cellspacing="0 " border="0 " valign="top "
					width="100% " class="table-main ">
					<thead>
						<tr>
							<th>Supplier Name</th>
							<th>Reconfirmation To be Sent to</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Desiya</td>
							<td>Service Provider</td>
							<td><a href="# ">Edit</a> / <a href="# ">Delete</a></td>
						</tr>
					</tbody>
				</table>
			</fieldset>
		</div>
		<div class="col-md-6 ">
			<fieldset>
				<legend>Travel Destination</legend>
				<ul>
					<li><label class="radio-inline"> <input type="radio"
							name="optradio ">Inclusion
					</label> <label class="radio-inline"> <input type="radio"
							name="optradio ">Exclusion
					</label></li>
					<li class="margin-top-15 ">
						<div class="form-group ">
							<label class="col-md-5 control-label ">Destination/Continent</label>
							<div class="col-md-4 ">
								<select class="form-control ">
									<option>Select</option>
									<option>Select</option>
								</select>
							</div>
						</div>
					</li>
					<li>
						<div class="form-group ">
							<label class="col-md-5 control-label ">Country</label>
							<div class="col-md-4 ">
								<select class="form-control ">
									<option>Select</option>
									<option>Select</option>
								</select>
							</div>
						</div>
					</li>
					<li>
						<div class="form-group ">
							<label class="col-md-5 control-label ">City</label>
							<div class="col-md-4 ">
								<select class="form-control ">
									<option>Select</option>
									<option>Select</option>
								</select>
							</div>
							<div class="col-md-1 moveupfourpx ">
								<button type="submit " class="btn btn-default btn-sm ">Add/Save</button>
							</div>
						</div>
					</li>
				</ul>
				<table cellpadding="0 " cellspacing="0 " border="0 " valign="top "
					width="100% " class="table-main ">
					<thead>
						<tr>
							<th>Inclusion/Exclusion</th>
							<th>Destination/Continent</th>
							<th>Country</th>
							<th>City</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Inclusion</td>
							<td>Asia</td>
							<td>India</td>
							<td>Mumbai</td>
							<td><a href="# ">Edit</a> / <a href="# ">Delete</a></td>
						</tr>
					</tbody>
				</table>
			</fieldset>
		</div>
		<div class="col-md-12 ">
			<fieldset>
				<legend>Supplier Reconfirmation Setting</legend>
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
							<th>Reconfirmation #</th>
							<th>Reconfirmation Cut Off</th>
							<th>No. of Days/hours</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>B2C</td>
							<td>Travel Agent</td>
							<td>Retail</td>
							<td><a href="# ">Edit</a> / <a href="# ">Delete</a></td>
						</tr>
					</tbody>
				</table>
			</fieldset>

		</div>
	</div>
</section>
