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
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set value="true" var="disabled"></c:set>
<c:set value="true" var="isIndividualUser"></c:set>
<c:set value="true" var="isSupervisor"></c:set>
<c:set value="${workflowActionData.status eq 'pending' or workflowActionData.status eq 'completed' }" var="isworkFlowStarted"></c:set>

<c:if test="${toDoViewAction eq true}">
<c:set value="true" var="isAllowedToEditPriority"></c:set>
</c:if>
<c:if test="${toDoEditAction eq true}">	
	<sec:authorize ifNotGranted="ROLE_WFL_SUPERVISORGROUP">
		<c:set value="false" var="isIndividualUser"></c:set>
		<c:set value="true" var="isSupervisor"></c:set>
		
	</sec:authorize>
	<sec:authorize ifAnyGranted="ROLE_WFL_SUPERVISORGROUP">
		<c:set value="true" var="isIndividualUser"></c:set>
		<c:set value="false" var="isSupervisor"></c:set>
		
	</sec:authorize>
</c:if>

<article>
	<div class="main">
		<div class="container" id="CKIL_234485">
		<common:globalMessages />
			<c:url value="/todo/updateToDo" var="searchURL"></c:url>
			<form:form class="control-group-form"
				modelAttribute="workflowActionCreateForm" action="${searchURL}"
				method="post" id="todoeditviewform">

				<form:hidden path="parent" />
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
										<form:select path="companyName" cssClass="form-control" required="true" disabled="${disabled}">
										<option value="">Select</option>
											<c:forEach items="${companies}" var="company">
											<option value="${company.key}"
													${workflowActionCreateForm.companyName eq company.value ? 'selected' : ''}>
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
										<form:select path="companyMarket" cssClass="form-control" required="true" disabled="${disabled}">
											<option value="">Select</option>
											<c:forEach items="${markets}" var="markets">
												<option value="${markets.key}"
													${workflowActionCreateForm.companyMarket eq markets.value ? 'selected' : ''}>${markets.value}</option>
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label class="col-md-5 control-label">Client Type</label>
									<div class="col-md-7">
										<form:select path="clientType" cssClass="form-control" id="clientType" required="true" disabled="${disabled}">
										<option value="">Select</option>
												<c:forEach items="${clientType}" var="cType">
													<option value="${cType.key}"
														${workflowActionCreateForm.clientType eq cType.key ? 'selected' : ''}>${cType.value}</option>
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
												<c:forEach items="${clientCategories}" var="clientCategory">
													<option value="${clientCategory.key}"
														${workflowActionCreateForm.clientCategory eq clientCategory.key ? 'selected' : ''}>${clientCategory.value}</option>
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
												<c:forEach items="${clientSubCategories}" var="clientSubCategory">
													<option value="${clientSubCategory.key}"
														${workflowActionCreateForm.clientSubCategory eq clientSubCategory.key ? 'selected' : ''}>${clientSubCategory.value}</option>
												</c:forEach>
											</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label class="col-md-5 control-label">Product Name</label>
									<div class="col-md-7">
										<%-- <form:select path="product" cssClass="form-control"
											id="toDoTaskProductSelectInput" required="true">
											<option value="${workflowActionCreateForm.product}">${workflowActionCreateForm.product}</option>
										</form:select> --%>
										<form:input path="product" cssClass="form-control" id="toDoTaskProductSelectInput" required="true" disabled="${disabled}"/>
									</div>
								</div>
							</li>
						</ul>

						<ul class="row">
							<li class="col-md-4">
								<div class="form-group">
									<label class="col-md-5 control-label">Reference No.</label>
									<div class="col-md-7">
										<form:input path="orderCode" cssClass="form-control"
											id="toDoCreateOrderInput" required="true" disabled="${disabled}"/>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label class="col-md-5 control-label">Task Type</label>
									<div class="col-md-7">
										<form:select path="taskType" cssClass="form-control" required="true" disabled="${disabled}">
											<option value="">Select</option>
												<c:forEach items="${taskTypes}" var="taskType">
													<option value="${taskType.key}"
														${workflowActionCreateForm.taskType eq taskType.key ? 'selected' : ''}>${taskType.value}</option>
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
									
										<c:if test="${workflowActionCreateForm.parent eq '' }">
											<input disabled value="${workflowActionCreateForm.name}" class="form-control"/>
										</c:if>
										<c:if test="${workflowActionCreateForm.parent ne '' }">
											<form:input path="parent" disabled="true" cssClass="form-control" />
										</c:if>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label class="col-md-5 control-label">Task Name</label>
									<div class="col-md-7">
										<form:input path="name" cssClass="form-control" disabled="${disabled}" />
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label class="col-md-5 control-label">Task Category</label>
									<div class="col-md-7">
										<form:select path="taskCategory" cssClass="form-control" required="true" disabled="${disabled}">
											<option value="">Select</option>
												<c:forEach items="${taskCategories}" var="category">
													<option value="${category.key}"
														${workflowActionCreateForm.taskCategory eq category.key ? 'selected' : ''}>${category.value}</option>
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
										<form:select path="priority" cssClass="form-control" required="true" disabled="${disabled and isAllowedToEditPriority}">
											<option value="">Select</option>
												<c:forEach items="${workflowPriority}" var="priority">
													<option value="${priority.key}"
														${workflowActionCreateForm.priority eq priority.key ? 'selected' : ''}>${priority.value}</option>
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
										<%-- <form:input path="dueDate" type="date"
										cssClass="form-control" />	 --%>
										<form:input type="date" path="dueDate" id="dueDate" cssClass="form-control" required="true" disabled="${disabled and isSupervisor}"/>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label class="col-md-5 control-label">Task Status</label>
									<div class="col-md-7">
										<form:select path="status" cssClass="form-control" disabled="${disabled and toDoViewAction}">
											<option value="">Select</option>
												<c:forEach items="${workflowStatus}" var="status">
													<option value="${status.key}"
														${fn:toUpperCase(workflowActionCreateForm.status eq status.value) ? 'selected' : ''}>${status.value}</option>
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
										<form:select path="functionalArea" cssClass="form-control" required="true" disabled="${disabled and isSupervisor}">
										<option value="">Select</option>
												<c:forEach items="${functionalArea}" var="fArea">
													<option value="${fArea.key}"
														${workflowActionCreateForm.functionalArea eq fArea.key ? 'selected' : ''}>${fArea.value}</option>
												</c:forEach>
											</form:select>
											
									</div>
								</div>
							</li>
							<%-- <li class="col-md-4">
								<div class="form-group">
									<label class="col-md-5 control-label">Locked By</label>
									<div class="col-md-7">
										<form:input path="lockedBy" />
									</div>
								</div>
							</li> --%>
						</ul>
						
						<ul class="row">
							<li class="col-md-4">
								<div class="form-group">
									<label class="col-md-5 control-label">File Handler
										(Primary)</label>
									<div class="col-md-7">
										<form:input path="principal" placeholder="Enter Text"
										cssClass="form-control" disabled="${disabled and isSupervisor}"/>
									</div>
								</div>
							</li>
							<li class="col-md-4">
								<div class="form-group">
									<label class="col-md-5 control-label">File Handler
										(Secondary)</label>
									<div class="col-md-7">
										<form:input path="fileHandler" placeholder="Enter Text"
										cssClass="form-control" disabled="${disabled and isSupervisor }"/>
									</div>
								</div>
							</li>
						</ul>

						<ul class="row">
							<li class="col-md-10">
								<div class="form-group">
									<label class="col-md-2 control-label">Suggested Actions</label>
									<div class="col-md-10">
										<form:input path="action" cssClass="form-control" disabled="${disabled and isIndividualUser}"/>
										
									</div>
								</div>
							</li>
						</ul>


						<ul class="row">
							<li class="col-md-10">
								<div class="form-group">
									<label class="col-md-2 control-label">Notes / Remarks</label>
									<div class="col-md-10">
										<form:textarea path="desc" cssClass="form-control" rows="3" disabled="${disabled and isIndividualUser}"/>
									</div>
								</div>
							</li>
						</ul>

						<ul class="row">
							<li class="text-right col-md-12">
								<div class="margin-bottom">
									<!-- <button type="button" class="btn btn-default btn-sm">Edit</button> -->
									<c:url value="/todo/task/edit/${workflowActionCreateForm.code}"
										var="taskEditURL"></c:url>
									<a href="${taskEditURL}">	
									<button type="button" class="btn btn-default btn-sm"
											${toDoViewAction eq false ? 'disabled' :'' }
											name="workflowActionEditBtn">Edit</button>
									</a>		
									<%-- <button class="btn btn-success btn-sm" type="submit"
										${toDoEditAction eq false ? 'disabled' :'' }
										name="workflowActionCreateBtn">Save</button> --%>
									<button type="submit" class="btn btn-default btn-sm"
											${toDoViewAction eq true ? 'disabled' :'' }
											name="workflowActionCreateBtn">Save</button>	
									<!-- <button type="submit" name="cancel" class="btn btn-default btn-sm">Cancel</button> -->
									
									<spring:url value="/todo/releaseToDo?code=${workflowActionCreateForm.code}&cancel=true"
											var="taskCancelURL"/>
									<a href="${taskCancelURL}">
										<button type="button" class="btn btn-default btn-sm" id="cancelButton">Cancel</button>
									</a>
									<c:url value="/todo/releaseToDo?code=${workflowActionCreateForm.code}"
											var="taskReleaseURL"></c:url>
									<a href="${taskReleaseURL}">	
									<button class="btn btn-success btn-sm" type="button"
										${toDoViewAction eq true ? 'disabled' :'' }
										name="workflowActionReleaseBtn">Release Lock</button>
									</a>		
									<!-- <button type="button" class="btn btn-default btn-sm">Release
										Lock</button> -->
									<c:url value="/todo/task/submit/${workflowActionCreateForm.code}"
										var="taskSubmitURL"></c:url>
									<a href="${taskSubmitURL}">
										<button type="button" class="btn btn-default btn-sm" ${isworkFlowStarted ? '' : 'disabled'}  name="workflowActionSubmitBtn">Submit</button>
									</a>
								</div>
								</form:form>
							</li>
							<li>
								<div class="col-md-5 pull-right text-right">
									<c:url value="/todo/approval" var="approvalURL"></c:url>
									<form action="${approvalURL}" method="get"
										name="approvalForm" id="approvalFormId">

										<label class="col-md-2 entries">Remark</label>
										<div class="col-md-6 text-right entries">
											<input type="hidden" value="${workflowActionCreateForm.code}" name="code">
											<input type="text" placeholder="INR XXXX" value=""
												class="form-control" name="remark">
										</div>
										<div>
											<sec:authorize ifAnyGranted="ROLE_WFL_SUPERVISORGROUP">
												<button type="button"
													class="btn btn-default btn-sm " id="approvalFormApprovalButton" ${isworkFlowStarted ? 'disabled' : ''} >Approve</button>
												<button type="button"
													class="btn btn-default btn-sm " id="approvalFormRejectButton" ${isworkFlowStarted ? 'disabled' : ''} >Reject</button>
											</sec:authorize>
											<sec:authorize ifNotGranted="ROLE_WFL_SUPERVISORGROUP">
												<button type="submit" class="btn btn-success btn-sm"
													disabled>Approve</button>
												<button type="submit" class="btn btn-success btn-sm"
													disabled>Reject</button>
											</sec:authorize>
										</div>
									</form>
								</div>
							</li>
						</ul>
					</section>
				</div>
		</div>
	</div>
</article>
<script type="text/javascript">
/* function myFunction(url) {
    alert("Button URL :\n"+url);
} */
</script>

