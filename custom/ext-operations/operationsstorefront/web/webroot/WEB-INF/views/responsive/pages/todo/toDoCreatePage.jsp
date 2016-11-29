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
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<template:todopage>
	<article>
		<div class="main">
			<div class="container" id="CKIL_234485">
					<common:globalMessages />
				<c:url value="/todo/createToDo" var="searchURL"></c:url>
				<form:form class="control-group-form"
					modelAttribute="workflowActionCreateForm" action="${searchURL}"
					method="post">

					<form:hidden path="code" />
					<h1>View / Add / Edit Task Details</h1>
					<div class="panel panel-default">
						<div class="panel-heading main-heading">View / Add / Edit
							Task Details</div>
						<section class="panel-body form-horizontal">
							<ul class="row">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Company Name</label>
										<div class="col-md-7">
										<form:select path="companyName" cssClass="form-control" required="true">
										<option value="">Select</option>
											<c:forEach items="${companies}" var="company">
												<option value="${company.key}"
													${workflowActionCreateForm.companyName eq company ? 'selected' : ''}>
													<c:choose>
														<c:when test="${not empty company.value}">${company.value}</c:when>
														<c:otherwise>${company.key}</c:otherwise>
													</c:choose>
												</option>
											</c:forEach>
										</form:select>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Company Market</label>
										<div class="col-md-7">
											<form:select path="companyMarket" cssClass="form-control" required="true">
										<option value="">Select</option>
											<c:forEach items="${markets}" var="markets">
												<option value="${markets.key}"
													${workflowActionCreateForm.companyMarket eq markets ? 'selected' : ''}>${markets.value}</option>
											</c:forEach>
										</form:select>										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Client Type</label>
										<div class="col-md-7">
										<form:select path="clientType" cssClass="form-control" required="true" id="clientType">
										<option value="">Select</option>
												<c:forEach items="${clientType}" var="cType">
													<option value="${cType.key}"
														${workflowActionCreateForm.clientType eq cType ? 'selected' : ''}>${cType.value}</option>
												</c:forEach>
											</form:select>											
										</div>
									</div>
								</li>								
							</ul>

							<ul class="row">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Client Category</label>
										<div class="col-md-7">
											<form:select path="clientCategory" cssClass="form-control" id="clientCategory" disabled="true">
												<option value="">Select</option>
												<c:forEach items="${clientCategories}" var="clientCategory">
													<option value="${clientCategory.key}"
														${workflowActionCreateForm.clientCategory eq clientCategory ? 'selected' : ''}>${clientCategory.value}</option>
												</c:forEach>
											</form:select>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Client Sub
											Category</label>
										<div class="col-md-7">
											<form:select path="clientSubCategory" cssClass="form-control" id="clientSubCategory" disabled="true">
												<option value="">Select</option>
												<c:forEach items="${clientSubCategories}" var="clientSubCategory">
													<option value="${clientSubCategory.key}"
														${workflowActionCreateForm.clientSubCategory eq clientSubCategory ? 'selected' : ''}>${clientSubCategory.value}</option>
												</c:forEach>
											</form:select>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Product Name</label>
										<div class="col-md-7">
											<%-- <form:select path="product" cssClass="form-control" id="toDoTaskProductSelectInput"  required="true">
												<option value="">Select</option>
											</form:select> --%>
											<c:choose>
											<c:when test="${fn:length(workflowActionCreateForm.product) gt 0 and fn:length(workflowActionCreateForm.parent) gt 0}">
											<form:input path="product" cssClass="form-control"  readOnly="true" id="toDoTaskProductSelectInput" required="true" /> 
											</c:when>
											<c:otherwise>
											<form:input path="product" cssClass="form-control"  id="toDoTaskProductSelectInput" required="true" /> 
											</c:otherwise>
										</c:choose>
										</div>
									</div>
								</li>
							</ul>

							<ul class="row">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Reference No.</label>
										<div class="col-md-7">										
										<c:choose>
											<c:when test="${fn:length(workflowActionCreateForm.orderCode) gt 0 and fn:length(workflowActionCreateForm.parent) gt 0}">
											<form:input path="orderCode" cssClass="form-control" id="toDoCreateOrderInput" required="true" readOnly="true"/>
											</c:when>
											<c:otherwise>
											<form:input path="orderCode" cssClass="form-control" id="toDoCreateOrderInput" required="true"/>
											</c:otherwise>
										</c:choose>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Task Type</label>
										<div class="col-md-7">
											<form:select path="taskType" cssClass="form-control" required="true">
											<option value="">Select</option>
												<c:forEach items="${taskTypes}" var="taskType">
													<option value="${taskType.key}"
														${workflowActionCreateForm.taskType eq taskType ? 'selected' : ''}>${taskType.value}</option>
												</c:forEach>
											</form:select>
										</div>
									</div>
								</li>
							</ul>

							<ul class="row">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Main Task Name</label>
										<div class="col-md-7">
										<c:choose>
											<c:when test="${fn:length(workflowActionCreateForm.parent) eq 0}">
											<input disabled class="form-control"/>
											</c:when>
											<c:otherwise>
												<form:input path="parent" readOnly="true" cssClass="form-control"/>
											</c:otherwise>
										</c:choose>
											
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Task Name</label>
										<div class="col-md-7">
											<form:input path="name" cssClass="form-control" required="true"/>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Task Catgeory</label>
										<div class="col-md-7">
											<form:select path="taskCategory" cssClass="form-control" required="true">
												<c:forEach items="${taskCategories}" var="category">
													<option value="${category.key}"
														${workflowActionCreateForm.taskCategory eq category ? 'selected' : ''}>${category.value}</option>
												</c:forEach>
											</form:select>
										</div>
									</div>
								</li>
							</ul>

							<ul class="row">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Priority</label>
										<div class="col-md-7">
											<form:select path="priority" cssClass="form-control" required="true">
											<option value="">Select</option>
												<c:forEach items="${workflowPriority}" var="priority">
													<option value="${priority.key}"
														${workflowActionCreateForm.priority eq priority ? 'selected' : ''}>${priority.value}</option>
												</c:forEach>
											</form:select>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Due Date & Time</label>
										<div class="col-md-7">
											<%-- <input type="date" class="form-control"
												value="${workflowActionData.dueDate}"> --%>
											<fmt:formatDate value="${workflowActionCreateForm.dueDate}" var="dateString" pattern="MM/dd/yyyy" />
											<form:input type="date" path="dueDate" id="dueDate" value="${dateString}" cssClass="form-control" required="true"/>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Task Status</label>
										<div class="col-md-7">
											<form:select path="status" cssClass="form-control" readOnly="true">
											<option value="">Select</option>
												<c:forEach items="${workflowStatus}" var="status">
													<option value="${fn:toUpperCase(status.key)}"
														${status.key eq 'NEW' ? 'selected' : ''}>${status.value}</option>
												</c:forEach>
											</form:select>
										</div>
									</div>
								</li>
							</ul>

							<ul class="row">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Functional Area</label>
										<div class="col-md-7">
										<form:select path="functionalArea" cssClass="form-control" required="true">
										<option value="">Select</option>
												<c:forEach items="${functionalArea}" var="fArea">
													<option value="${fArea.key}"
														${workflowActionCreateForm.functionalArea eq fArea ? 'selected' : ''}>${fArea.value}</option>
												</c:forEach>
											</form:select>												
										</div>
									</div>
								</li>
							</ul>

							<ul class="row">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">File Handler
											(Primary)</label>
										<div class="col-md-7">
											<form:input path="principal" placeholder="Enter Text"
											cssClass="form-control" />
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">File Handler
											(Secondary)</label>
										<div class="col-md-7">
											<form:input path="fileHandler" placeholder="Enter Text"
											cssClass="form-control" />
										</div>
									</div>
								</li>
							</ul>

							<ul class="row">
								<li class="col-md-10">
									<div class="form-group">
										<label class="col-md-2 control-label">Suggested
											Actions</label>
										<div class="col-md-10">
											<form:input type="text" path="action" class="form-control"/>
										</div>
									</div>
								</li>
							</ul>


							<ul class="row">
								<li class="col-md-10">
									<div class="form-group">
										<label class="col-md-2 control-label">Notes / Remarks</label>
										<div class="col-md-10">
											<form:textarea path="desc" cssClass="form-control" rows="3" />
										</div>
									</div>
								</li>
							</ul>

							<ul class="row">
								<li class="text-right col-md-12">
									<div class="margin-bottom">
										<button type="submit" class="btn btn-default btn-sm" disabled>Edit</button>
										<!-- <button class="btn btn-success btn-sm" type="submit"
											name="workflowActionCreateBtn">Save</button> -->
										<button type="submit" class="btn btn-default btn-sm"
											${toDoViewAction eq true ? 'disabled' :'' }
											name="workflowActionCreateBtn">Save</button>	
										<a href="${pageContext.request.contextPath}/todo"><button type="button" class="btn btn-default btn-sm" id="cancelButton">Cancel</button></a>
										<button type="submit" class="btn btn-success btn-sm" disabled>Release
											Lock</button>
										<!-- <button type="submit" class="btn btn-default btn-sm">Submit</button> -->
										<button type="submit" class="btn btn-default btn-sm" disabled name="workflowActionCancelBtn">Submit</button>
									</div>
								</li>
								<li>
									<div class="col-md-5 pull-right text-right">
										<label class="col-md-2 entries">Remark</label>
										<div class="col-md-6 text-right entries">
											<input type="text" placeholder="INR XXXX" value=""
												class="form-control">
										</div>
										<div>
											<sec:authorize ifAnyGranted="ROLE_WFL_SUPERVISORGROUP">
												<button type="submit"  disabled="disabled" class="btn btn-default btn-sm">Approve</button>
												<button type="submit" disabled="disabled" class="btn btn-default btn-sm">Reject</button>
											</sec:authorize>
											<sec:authorize ifNotGranted="ROLE_WFL_SUPERVISORGROUP">
												<button type="submit" disabled="disabled" class="btn btn-success btn-sm" disabled>Approve</button>
												<button type="submit" disabled="disabled" class="btn btn-success btn-sm" disabled>Reject</button>
											</sec:authorize>
										</div>
									</div>
								</li>
							</ul>


						</section>
					</div>
				</form:form>
			</div>
		</div>
	</article>
</template:todopage>