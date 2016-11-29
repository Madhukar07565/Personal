<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="action" required="false" type="java.lang.String"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="formElement"
	tagdir="/WEB-INF/tags/responsive/formElement"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

 <div id="rightPane" class="col-md-10 detail-accordion rightPane">
	
	<form:form action="${request.contextPath}/order/saved-query" modelAttribute="searchFilterForm" method="POST" class="form-horizontal">
		<div class="panel-group row padding-left-15" id="accordion">
		<!--Start Booking Details section  -->
			<div class="panel panel-default">
				<div class="panel-heading" role="tab" id="headingOne">
					<h4 class="panel-title">
						<a role="button" data-toggle="collapse" data-parent="#accordion"
							href="#pane1">Booking Details </a> <a
							class="pull-right detail-info collapsed" role="button"
							data-toggle="collapse" data-parent="#accordion" href="#pane1"><i
							class="glyphicon glyphicon-menu-right glyphicon-menu-down"></i></a>
					</h4>
				</div>
				<div id="pane1" class="panel-collapse collapse" role="tabpanel"
					aria-labelledby="pane1">
					<div class="panel-body">
						<ul class="row">
							<li class="col-md-4">
								<div class="form-group">
									<label for="suppName" class="control-label col-md-6">Booking
										Reference #</label>
									<div class="col-md-6">
											<form:input id="bookingRefNumber" path="bookingRefNumber" class="form-control" placeholder="Ener Text" value=""/>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="serviceOT" class="control-label col-md-6">Assignment</label>
									<div class="col-md-6">
										<form:select id="assignment" path="assignment" class="form-control">
											<form:option code="Select" value="Select" disabled="true"/>
											<form:option code="Assigned" value="Assigned" selected="true"/>
											<form:option code="UnAssigned" value="UnAssigned"/>
										</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="serviceOT" class="control-label col-md-6">User
										Name</label>
									<div class="col-md-6">
										<form:input id="userName" path="userName" class="form-control" placeholder="Ener Text" value=""/>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="serviceOT" class="control-label col-md-6">Booking
										Date Form</label>
									<div class="col-md-6">
										<form:input path="bookingDateFrom" type="date" class="form-control"/>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="billPassStatus" class="control-label col-md-6">Booking
										Date To</label>
									<div class="col-md-6">
										<input type="date" value="" class="form-control" />
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="bookRefNo" class="control-label col-md-6">Booking
										Type</label>
									<div class="col-md-6">
										<form:select path="bookingType" class="form-control">
											<form:option value="Time Limit Booking" disabled="true"/>
											<c:forEach items="${bookingTypeValues}"	var="bookingType">
												<form:option code="${bookingType.key}" value="${bookingType.value}" />
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="bookingstatus" class="control-label col-md-6">Booking
										Status</label>
									<div class="col-md-6">
										<form:select path="bookingStatus" class="form-control">
											<form:option value="Time Limit Booking" disabled="true"/>
											<c:forEach items="${bookingStatusValues}" var="bookingStatus">
												<form:option code="${bookingStatus.key}" value="${bookingStatus.value}" />
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="priority" class="control-label col-md-6">Priority</label>
									<div class="col-md-6">
										<form:select path="bookingPriority" class="form-control">
											<form:option value="Time Limit Booking" disabled="true"/>
											<c:forEach items="${bookingPriorityValues}"	var="bookingPriorityValue">
												<form:option code="${bookingPriorityValue.key}" value="${bookingPriorityValue.value}" />
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="financialID" class="control-label col-md-6">Financial
										Control ID</label>
									<div class="col-md-6">
										<form:input class="form-control" id="pmtAdvDateFrom" path="financialControlId" placeholder="Enter Text" value=""/>
									</div>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<!--End Booking Detail section  -->
			<!--Start Product Detail section  -->
						<div class="panel panel-default">
				<div class="panel-heading" role="tab" id="headingOne">
					<h4 class="panel-title">
						<a role="button" data-toggle="collapse" data-parent="#accordion"
							href="#pane2">Product Details</a> <a
							class="pull-right detail-info collapsed" role="button"
							data-toggle="collapse" data-parent="#accordion" href="#pane2"><i
							class="glyphicon glyphicon-menu-right glyphicon-menu-down"></i></a>
					</h4>
				</div>
				<div id="pane2" class="panel-collapse collapse" role="tabpanel"
					aria-labelledby="pane2">
					<div class="panel-body">
						<ul class="row">
							<li class="col-md-4">
								<div class="form-group">
									<label for="suppName" class="control-label col-md-6">Product
										Category</label>
									<div class="col-md-6">
										<select class="form-control" id="categSelect">
    										<c:forEach var="categoryMap" items="${categoriesMap}">
    											<option value="${categoryMap.key.code}">${categoryMap.key.name}</option>
    										</c:forEach>
										</select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="serviceOT" class="control-label col-md-6">Product
										Category Sub Type</label>
									<div class="col-md-6">
										<select class="form-control" id="subCategSelect">
										</select>
									</div>
								</div>
							</li>
						</ul>
						<ul class="row" id="flightSearchFields">
							<li class="col-md-4">
								<div class="form-group">
									<label for="TravDateForm" class="control-label col-md-6">Travel
										Date Form</label>
									<div class="col-md-6">
										<input id="" type="date" class="form-control" placeholder="">
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="TravDateTo" class="control-label col-md-6">Travel
										Date To</label>
									<div class="col-md-6">
										<input id="" type="date" class="form-control" placeholder="">
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="serorderdateTo" class="control-label col-md-6">Supplier
										Name</label>
									<div class="col-md-6">
											<form:input id="" path="supplierCode" class="form-control" placeholder="Type here."/>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="GdsPnr" class="control-label col-md-6">GDS
										PNR</label>
									<div class="col-md-6">
										<input id="" type=text class="form-control"
											placeholder="Type here">
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="airlinePNR" class="control-label col-md-6">Airline
										PNR</label>
									<div class="col-md-6">
										<input id="" type=text class="form-control"
											placeholder="Type here">
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="" class="control-label col-md-6">Ticket
										Number</label>
									<div class="col-md-6">
										<input id="" type=dropdown class="form-control"
											placeholder="Type here">
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="airline" class="control-label col-md-6">Airline</label>
									<div class="col-md-6">
										<select id="" class="form-control">
											<option>option 1</option>
										</select>
									</div>
								</div>
							</li>
						</ul>
						<ul class="row" id="accomodationSearchFields">
							<li class="col-md-4">
								<div class="form-group">
									<label for="TravDateForm" class="control-label col-md-6">Country</label>
									<div class="col-md-6">
										<select class="form-control">
											<option>select</option>
										</select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="TravDateTo" class="control-label col-md-6">City</label>
									<div class="col-md-6">
										<select class="form-control">
											<option>select</option>
										</select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="serorderdateTo" class="control-label col-md-6">Product
										Name</label>
									<div class="col-md-6">
										<select class="form-control">
											<option>select</option>
										</select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="GdsPnr" class="control-label col-md-6">Supplier
										Name</label>
									<div class="col-md-6">
										<select class="form-control">
											<option>select</option>
										</select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="airlinePNR" class="control-label col-md-6">Supplier
										Reference Number</label>
									<div class="col-md-6">
										<select class="form-control">
											<option>select</option>
										</select>
									</div>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<!--End Product Detail section  -->
			<!--Start Company Details section  -->
						<div class="panel panel-default">
				<div class="panel-heading" role="tab" id="headingOne">
					<h4 class="panel-title">
						<a role="button" data-toggle="collapse" data-parent="#accordion"
							href="#pane3">Company Details</a> <a
							class="pull-right detail-info collapsed" role="button"
							data-toggle="collapse" data-parent="#accordion" href="#pane3"><i
							class="glyphicon glyphicon-menu-right glyphicon-menu-down"></i></a>
					</h4>
				</div>
				<div id="pane3" class="panel-collapse collapse">
					<div class="panel-body">
						<ul class="row">
							<li class="col-md-4">
								<div class="form-group">
									<label for="suppName" class="control-label col-md-6">Group
										of Companies</label>
									<div class="col-md-6">
										<form:select id="" path="groupOfCompanyUid" class="form-control">
											<form:option value="Select" disabled="true"/>
											<c:forEach var="groupOfCompanies" items="${groupOfCompaniesData}">
												<form:option code="${groupOfCompanies.uid}" value="${groupOfCompanies.name}"></form:option>
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="serviceOT" class="control-label col-md-6">Group
										Company</label>
									<div class="col-md-6">
										<form:select id="" path="groupCompanyUid" class="form-control">
											<form:option value="Select" disabled="true"/>
											<c:forEach var="groupCompanyData" items="${groupCompaniesData}">
												<form:option code="${groupCompanyData.uid}" value="${groupCompanyData.name}"></form:option>
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="companyName" class="control-label col-md-6">Company
										Name</label>
									<div class="col-md-6">
										<form:select id="" path="companyUid" class="form-control">
											<form:option value="Select" disabled="true"/>
											<c:forEach var="companyData" items="${companiesData}">
												<form:option code="${companyData.uid}" value="${companyData.name}"></form:option>
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="cmpmarket" class="control-label col-md-6">Company
										Market</label>
									<div class="col-md-6">
										<form:select id="" path="marketUid" class="form-control">
											<form:option value="Select" disabled="true"/>
											<c:forEach var="marketData" items="${marketsData}">
												<form:option code="${marketData.uid}" value="${marketData.name}"></form:option>
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="SBU" class="control-label col-md-6">SBU</label>
									<div class="col-md-6">
										<form:select path="sbu" class="form-control">
											<c:forEach var="sbuData" items="${sbuDatas}">
												<form:option code="${sbuData.uid}" value="${sbuData.name}"/>
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="BU" class="control-label col-md-6">BU</label>
									<div class="col-md-6">
										<form:select path="bu" class="form-control">
											<c:forEach var="buData" items="${buDatas}">
												<form:option code="${buData.uid}" value="${buData.name}"/>
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<!--End Company Details section  -->
			<!--Start Client&Passenger Details section  -->
						<div class="panel panel-default">
				<div class="panel-heading" role="tab" id="headingOne">
					<h4 class="panel-title">
						<a role="button" data-toggle="collapse" data-parent="#accordion"
							href="#pane4">Client &amp; Passenger Details</a> <a
							class="pull-right detail-info collapsed" role="button"
							data-toggle="collapse" data-parent="#accordion" href="#pane4"><i
							class="glyphicon glyphicon-menu-right glyphicon-menu-down"></i></a>
					</h4>
				</div>
				<div id="pane4" class="panel-collapse collapse">
					<div class="panel-body">
						<ul class="row">
							<li class="col-md-4">
								<div class="form-group">
									<label for="clientType" class="control-label col-md-6">Client
										Type</label>
									<div class="col-md-6">
										<form:select path="clientType" class="form-control">
											<c:forEach var="clientType" items="${clientTypeMap}">
												<form:option code="${clientType.key}" value="${clientType.value}"/>
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="clientCat" class="control-label col-md-6">Client
										Category</label>
									<div class="col-md-6">
										<form:select path="clientCategory" class="form-control">
											<c:forEach var="clientCategory" items="${clientCategoryMap}">
												<form:option code="${clientCategory.key}" value="${clientCategory.value}"/>
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="clientSubCat" class="control-label col-md-6">Client
										Sub Category</label>
									<div class="col-md-6">
										<form:select path="clientSubCategory" class="form-control">
											<c:forEach var="clientSubCategory" items="${clientSubCategoryMap}">
												<form:option code="${clientSubCategory.key}" value="${clientSubCategory.value}"/>
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="clientName" class="control-label col-md-6">Client
										Name</label>
									<div class="col-md-6">
										<input id="" type="text" class="form-control"
											placeholder="Type here">
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="passName" class="control-label col-md-6">Passenger
										Name</label>
									<div class="col-md-6">
										<form:input id="" path="travellerName" class="form-control" placeholder="Type here"/>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="passName" class="control-label col-md-6">Phone
										Number</label>
									<div class="col-md-6">
										<form:input id="" path="travellerPhoneNumber" class="form-control" placeholder="Type here"/>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label for="emailID" class="control-label col-md-6">Email
										ID</label>
									<div class="col-md-6">
										<form:input id="" path="travellerEmailId" class="form-control" placeholder="Type here"/>
									</div>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<!--End Client&Passenger Details section  -->
			<form:hidden id="hiddenSavedQueryName" path="savedQueryName"/>
			<form:hidden id="hiddenDefaultSearch" path="defaultSearch"/>
			
		</div>
		
		<div class="col-md-12">
			<div class="col-md-4 col-md-offset-5">
				<!-- <button class="btn btn-default btn-sm" type="submit">Search</button>
				<button class="btn btn-default btn-sm" type="submit">Reset</button>
				<button class="btn btn-default btn-sm" type="submit">Cancel</button> -->
				<a href="#" class="btn btn-default btn-sm" >Search</a>
				<a href="#" class="btn btn-default btn-sm" >Reset</a>
				<a href="#" class="btn btn-default btn-sm" >Cancel</a>
				<a href="#saveSearch" data-toggle="modal" 
					class="btn btn-secondary btn-sm" role="button" aria-pressed="true">Save</a>
				<!-- <button class="btn btn-default btn-sm" type="submit">Save</button> -->	
					
			</div>
			<div class="modal fade" id="saveSearch" role="dialog">
				<div class="modal-dialog">
					<!-- Modal content -->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Save Search</h4>
						</div>
						<div class="modal-body">
							<div class="panel panel-default">
								<section class="panel-body">
									<div class="form-horizontal">
										<ul class="row">
											<li class="col-md-12">
												<div class="form-group">
													<label class="col-md-3 control-label">Search Name</label>
													<div class="col-md-5">
															<input type="text" id="saveSearchName" class="form-control"
															data-bind="enable:clientReferral.isEditable, textInput:clientReferral.passengerName">
													</div>
												</div>
											</li>
											<li class="col-md-12"><label
												class="col-md-3 control-label">Default Search</label>
												<div class="col-md-2">
													<input type="checkbox" id="saveSearchDefault" class="custom-control-input">
												</div></li>
										</ul>
									</div>
								</section>
							</div>
							<div class="modal-footer">
								<button id="saveSearchButton" type="submit" class="btn btn-default btn-sm">Save
									Search</button>
								<button type="button" class="btn btn-default "
									data-dismiss="modal">Cancel</button>
							</div>
						</div>

					</div>

				</div>
			</div>
			<div class="col-md-3">
				<div class="form-group show-entries">
					<label class="col-md-4 control-label">Show<span
						class="mandatory">*<span></span></span></label> <select
						class="col-md-2 form-control">
						<option>25</option>
						<option>30</option>
					</select> <label class="control-label">Entries</label>
				</div>
			</div>
		</div>
		</form:form>
</div>
