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
<%@ taglib prefix="todo" tagdir="/WEB-INF/tags/responsive/todo"%>


<c:set var="showAllTask"
	value="${(workflowActionSearchForm.assignedToMe eq true && workflowActionSearchForm.assignedByMe eq true) || (workflowActionSearchForm.assignedToMe eq false && workflowActionSearchForm.assignedByMe eq false)}"></c:set>
<c:set var="showAssignedByMe"
	value="${workflowActionSearchForm.assignedToMe eq false && workflowActionSearchForm.assignedByMe eq true}"></c:set>
<c:set var="showAssignedToMe"
	value="${workflowActionSearchForm.assignedToMe eq true && workflowActionSearchForm.assignedByMe eq false}"></c:set>
<article>
	<div class="main">
		<div class="container" id="CKIL_234485">
			<h1>To Do Task List View</h1>
			<div id="globalMessages">
				<common:globalMessages />
			</div>
			<c:url value="/todo/searchToDo" var="searchURL"></c:url>
			<div class="panel panel-default">
				<div class="panel-heading main-heading">To Do Task List View</div>
				<section class="panel-body form-horizontal">
					<form:form class="control-group-form" id="WorkflowActionSearchForm"
						modelAttribute="workflowActionSearchForm" action="${searchURL}"
						method="post">

						<form:hidden path="assignedToMe" id="assignedToMeInput" />
						<form:hidden path="assignedByMe" id="assignedByMeInput" />

						<ul class="row">
							<li class="col-md-3">
								<div class="form-group">
									<label class="col-md-5 control-label">Company Name</label>
									<div class="col-md-7">
										<form:select path="companyName" cssClass="form-control">
										<option value=""></option>
											<c:forEach items="${companies}" var="company">
												<option value="${company.key}"
													${workflowActionSearchForm.companyName eq company.key ? 'selected' : ''}>
													<c:choose>
														<c:when test="${not empty company.value}">${company.value}</c:when>
														<c:otherwise>${company.key }</c:otherwise>
													</c:choose>
												</option>
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-3">
								<div class="form-group">
									<label class="col-md-5 control-label">Company Market</label>
									<div class="col-md-7">
										<form:select path="companyMarket" cssClass="form-control">
										<option value=""></option>
											<c:forEach items="${markets}" var="market">
												<option value="${market.key}"
													${workflowActionSearchForm.companyMarket eq fn:toUpperCase(market.key) ? 'selected' : ''}>${market.value}</option>
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-3">
								<div class="form-group">
									<label class="col-md-5 control-label">Client Type</label>
									<div class="col-md-7">
										<form:select path="clientType" cssClass="form-control">
										<option value=""></option>
											<c:forEach items="${clientType}" var="cType">
												<option value="${cType.key}"
													${workflowActionSearchForm.clientType eq fn:toUpperCase(cType.key) ? 'selected' : ''}>${cType.value}</option>
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-3">
								<div class="form-group">
									<label class="col-md-5 control-label">Functional Area</label>
									<div class="col-md-7">										
										<form:select path="functionalArea" cssClass="form-control">
											<option value=""></option>
											<c:forEach items="${functionalArea}" var="fArea">
												<option value="${fArea.key}"
													${workflowActionSearchForm.functionalArea eq fn:toUpperCase(fArea.key) ? 'selected' : ''}>${fArea.value}</option>
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
						</ul>
						<ul class="row">
							<li class="col-md-3">
								<div class="form-group">
									<label class="col-md-5 control-label">Product Name</label>
									<div class="col-md-7">
										<form:input path="productName" cssClass="form-control"
											placeholder="Enter Product Code" />
									</div>
								</div>
							</li>
							<li class="col-md-3">
								<div class="form-group">
									<label class="col-md-5 control-label">Task Name</label>
									<div class="col-md-7">
										<!-- <select class="form-control">
											<option>Confirm TL Booking</option>									
										</select> -->
										<form:input path="name" cssClass="form-control"
											placeholder="Enter Text" />
									</div>
								</div>
							</li>
							<li class="col-md-3">
								<div class="form-group">
									<label class="col-md-5 control-label">Priority</label>
									<div class="col-md-7">
										<form:select path="priority" cssClass="form-control">
											<option value=""></option>
											<c:forEach items="${workflowPriority}" var="priority">
												<option value="${priority.key}"
													${workflowActionSearchForm.priority eq fn:toUpperCase(priority.value)? 'selected' : ''}>${priority.value}</option>
											</c:forEach>
										</form:select>
									</div>
								</div>
							</li>
							<li class="col-md-3">
								<div class="form-group">
									<label class="col-md-5 control-label">File Handler</label>
									<div class="col-md-7">
										<form:input path="fileHandler" placeholder="Enter Text"
											cssClass="form-control" />
									</div>
								</div>
							</li>
						</ul>
						<ul class="row">
							<li class="col-md-12">
								<div class="form-group">
									<div class="col-md-2 text-right col-md-offset-8">
										<button class="btn btn-default btn-sm" type="submit"
											name="workflowActionSearchBtn">Search</button>
										<button class="btn btn-default btn-sm" type="reset">Reset</button>
									</div>
									<div class="col-md-2 pull-right">
										<div class="form-group show-entries">
											<label class="col-md-4 control-label">Show<span
												class="mandatory">*</span></label>
											<form:select path="pageSize" cssClass="col-md-2 form-control"
												id="toDoPaginationPazeSizeSelect">
												<option
													${searchPageData.pagination.pageSize eq 10 ? 'selected' :''}>10</option>
												<option
													${searchPageData.pagination.pageSize eq 20 ? 'selected' :''}>20</option>
												<option
													${searchPageData.pagination.pageSize eq 30 ? 'selected' :''}>30</option>
											</form:select>
											<label class="control-label">Entries</label>
										</div>
									</div>
								</div>
							</li>
						</ul>
					</form:form>
					<ul class="nav nav-tabs">
						<li class="${showAllTask eq true ? 'active' : ''}"><a
							href="#mytasks" id="myTask" data-toggle="tab">My Tasks</a></li>
						<li class="${showAssignedByMe eq true ? 'active' : ''}"><a
							href="#assignedbyme" id="assignedByMe" data-toggle="tab">Assigned
								by me</a></li>
						<li class="${showAssignedToMe eq true ? 'active' : ''}"><a
							href="#assignedtome" id="assignedToMe" data-toggle="tab">Assign
								to me</a></li>
					</ul>
					<div class="tab-content">
						<div
							class="tab-pane fade in ${showAllTask eq true ? 'active' : ''}"
							id="mytasks">
							<c:if test="${showAllTask}">
								<h4>Total Tasks :
									${searchPageData.pagination.totalNumberOfResults}</h4>
								<div class="table-responsive">
									<table cellspacing="0" cellpadding="0" border="0"
										class="table-main" valign="top" width="2000px;">
										<thead>
											<tr class="sub-table">
												<th>Assign</th>
												<th>Booking Ref. No.</th>
												<th>Client Name <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th>Product Name <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th>Task Name <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th>Priority <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<!-- <th>Functional Area
													<a class="pull-right margin-left-5" href="#"><span class="glyphicon glyphicon-sort-by-alphabet"></span></a>
													<a class="pull-right" href="#"><span class="glyphicon glyphicon-filter"></span></a>
												</th> -->
												<th>File Handler <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th>Assigned <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th>Company & Market</th>
												<th>Status <a class="pull-right margin-left-5" href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th colspan="2" width="400">Action</th>
											</tr>
										</thead>
										<tbody>
											<c:set var="groupRef" value="0"></c:set>
											<c:set var="assignToFlag" value="false"></c:set>
											<c:forEach items="${searchPageData.results}"
												var="workflowAction">
												<c:choose>
														<c:when test="${fn:containsIgnoreCase(workflowAction.taskStatus,'Overdue')}">
															<c:set value="true" var="isTaskOverdue"/>														
														</c:when>
														<c:otherwise>
															<c:set value="false" var="isTaskOverdue"/>														
														</c:otherwise>
												</c:choose>
						
												
												<tr class=" ${isTaskOverdue eq true ? 'warning' :'' }">
													<td><input type="checkbox" value="${workflowAction.code}" name="assignCheckbox"> </td>
													<c:if
														test="${groupData[workflowAction.order.code] eq null}">
														<td></td>
													</c:if>

													<c:if
														test="${workflowAction.order.code ne null && (groupRef eq 0) || (groupRef ne workflowAction.order.code)}">
														<spring:url value="/order/${workflowAction.order.code}" var="orderUrl"></spring:url>
														<td rowspan="${groupData[workflowAction.order.code]}"><a
															href="${orderUrl}">${workflowAction.order.code}</a>
														</td>
														<c:set var="groupRef"
															value="${workflowAction.order.code}"></c:set>
													</c:if>

													<td></td>
													<td>${workflowAction.product.name}</td>
															<td class="taskview" data-target=".${workflowAction.code}" id="${workflowAction.code}" >[<i
														class="fa fa-plus" aria-hidden="true"></i>]&nbsp; ${workflowAction.name}
													</td>
													<td>${workflowAction.priority}</td>
													<!-- <td>Operations</td> -->
													<td>${workflowAction.secondaryAssignedUser}</td>
													<td><c:choose>
															<c:when test="${fn:length(workflowAction.assignedTo) eq 0 and fn:containsIgnoreCase(workflowAction.taskStatus, 'OPEN')}"></c:when>
															<c:otherwise>${workflowAction.assignedUser}</c:otherwise>
													</c:choose></td>
													<td>${workflowAction.companyName}, ${workflowAction.companyMarket}</td>
													<td>													
													<todo:todoStatus workflowAction="${workflowAction}" isTaskOverdue="${isTaskOverdue}"/>													
													</td>
													<td><c:url
															value="/todo/task/view/${workflowAction.code}"
															var="detailURL"></c:url> <a href="${detailURL}"> View
													</a> &nbsp; / &nbsp; <c:url
															value="/todo/task/edit/${workflowAction.code}"
															var="detailURL"></c:url> <a href="${detailURL}"> Edit
													</a> &nbsp; /&nbsp; 
													<c:url value="/todo/createToDo?parent=${workflowAction.code}&order=${workflowAction.order.code}&product=${workflowAction.product.code}"	var="createURL"></c:url> 
													<a href="${createURL}">
															Create SubTask </a></td>
													<c:if test="${assignToFlag eq false}">
														<c:set value="true" var="assignToFlag"></c:set>
														<td
															rowspan="${searchPageData.pagination.totalNumberOfResults}">Assign
															to <br>
															<c:url var="reAssignURL" value="/todo/reAssign" ></c:url>
															<form action="${reAssignURL}" method="get" id="reAssignFrom" >
															<div class="outer" >
																<select class="form-control" name="user" id="reAssignSelectbox">
																	<c:forEach items="${reAssignableUser}" var="user">
																		<option value="${user.uid}">${user.firstName}&nbsp;${user.lastName}</option>
																	</c:forEach>
																</select>
																<input type="hidden" value="" name="tasks" id="reAssignTasksHidden">
															</div>
															<button type="submit" class="btn btn-default btn-sm" id="reAssignSubmit">Confirm</button>
															</form>	
														</td>
													</c:if>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>

								<div class="clearfix">
									<div class="pull-left">
										<pagination:pageSelectionPagination
											searchUrl="/todo/searchToDo"
											searchPageData="${workflowAction}"
											numberPagesShown="${numberPagesShown}"
											themeMsgKey="${themeMsgKey}" />
									</div>
									<div class="pull-right text-right margin-top-15">
										<c:url value="/todo/createToDo" var="createURL"></c:url>
										<form action="${createURL}" method="get">
											<button type="submit" class="btn btn-default btn-sm">Add</button>
											<c:url value="/todo/snapshot" var="returnUrl"></c:url>
											<a href="${returnUrl}">
												<button type="button" class="btn btn-default btn-sm">Cancel</button>
											</a>
										</form>
									</div>
								</div>
							</c:if>
						</div>
						<div
							class="tab-pane fade in ${showAssignedByMe eq true ? 'active' : ''}">
							<c:if test="${showAssignedByMe}">
								<h4>Total Tasks :
									${searchPageData.pagination.totalNumberOfResults}</h4>
								<div class="table-responsive">
									<table cellspacing="0" cellpadding="0" border="0"
										class="table-main" valign="top" width="2000px;">
										<thead>
											<tr class="sub-table">
												<th>Assign</th>
												<th>Booking Ref. No.</th>
												<th>Client Name <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th>Product Name <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th>Task Name <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th>Priority <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<!-- <th>Functional Area
													<a class="pull-right margin-left-5" href="#"><span class="glyphicon glyphicon-sort-by-alphabet"></span></a>
													<a class="pull-right" href="#"><span class="glyphicon glyphicon-filter"></span></a>
												</th> -->
												<th>File Handler <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th>Assigned <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th>Company & Market</th>
												<th>Status <a class="pull-right margin-left-5" href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th colspan="2" width="400">Action</th>
											</tr>
										</thead>
										<tbody>
											<c:set var="groupRef" value="0"></c:set>
											<c:set var="assignToFlag" value="false"></c:set>
											<c:forEach items="${searchPageData.results}"
												var="workflowAction">
												<tr>
													<td><input type="checkbox" value="${workflowAction.code}" name="assignCheckbox"> <a href="#" class="taskChildRefrence" id="task_${workflowAction.code}">>></a> </td>
													<c:if
														test="${groupData[workflowAction.order.code] eq null}">
														<td></td>
													</c:if>

													<c:if
														test="${workflowAction.order.code ne null && (groupRef eq 0) || (groupRef ne workflowAction.order.code)}">
														<spring:url value="/order/${workflowAction.order.code}" var="orderUrl"></spring:url>
														
														<td rowspan="${groupData[workflowAction.order.code]}"><a
															href="${orderUrl}">${workflowAction.order.code}</a>
														</td>
														<c:set var="groupRef"
															value="${workflowAction.order.code}"></c:set>
													</c:if>

													<td></td>
													<td></td>
													<td>${workflowAction.name}</td>
													<td>${workflowAction.priority}</td>
													<!-- <td>Operations</td> -->
													<td>${workflowAction.secondaryAssignedUser}</td>
													<td>${workflowAction.assignedUser}</td>
													<td>${workflowAction.companyName}, ${workflowAction.companyMarket}</td>
													<td>
													<todo:todoStatus workflowAction="${workflowAction}" isTaskOverdue="${isTaskOverdue}"/>													
													</td>
													<td><c:url
															value="/todo/task/view/${workflowAction.code}"
															var="detailURL"/> <a href="${detailURL}"> View
															/ Edit </a> &nbsp; &nbsp; | &nbsp; &nbsp;<c:url
															value="/todo/createToDo?parent=${workflowAction.code}&order=${workflowAction.order.code}&product=${workflowAction.product.code}"
															var="createURL"></c:url> <a href="${createURL}">
															Create SubTask </a></td>

														<c:if test="${assignToFlag eq false}">
														<c:set value="true" var="assignToFlag"></c:set>
														<td
															rowspan="${searchPageData.pagination.totalNumberOfResults}">Assign
															to <br>
															<c:url var="reAssignURL" value="/todo/reAssign" ></c:url>
															<form action="${reAssignURL}" method="get" id="reAssignFrom" >
															<div class="outer" >
																<select class="form-control" name="user" id="reAssignSelectbox">
																	<c:forEach items="${reAssignableUser}" var="user">
																		<option value="${user.uid}">${user.firstName}&nbsp;${user.lastName}</option>
																	</c:forEach>
																</select>
																<input type="hidden" value="" name="tasks" id="reAssignTasksHidden">
															</div>
															<button type="submit" class="btn btn-default btn-sm" id="reAssignSubmit">Confirm</button>
															</form>	
														</td>
													</c:if>

												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>

								<div class="clearfix">
									<div class="pull-left">
										<pagination:pageSelectionPagination
											searchUrl="/todo/searchToDo"
											searchPageData="${workflowAction}"
											numberPagesShown="${numberPagesShown}"
											themeMsgKey="${themeMsgKey}" />
									</div>
									<div class="pull-right text-right margin-top-15">
										<c:url value="/todo/createToDo" var="createURL"></c:url>
										<form action="${createURL}" method="get">
											<button type="submit" class="btn btn-default btn-sm">Add</button>
											<c:url value="/todo/snapshot" var="returnUrl"></c:url>
											<a href="${returnUrl}">
												<button type="button" class="btn btn-default btn-sm">Cancel</button>
											</a>										
										</form>
									</div>
								</div>
							</c:if>
						</div>
						<div
							class="tab-pane fade in ${showAssignedToMe eq true ? 'active' : ''}">
							<c:if test="${showAssignedToMe}">
								<h4>Total Tasks :
									${searchPageData.pagination.totalNumberOfResults}</h4>
								<div class="table-responsive">
									<table cellspacing="0" cellpadding="0" border="0"
										class="table-main" valign="top" width="2000px;">
										<thead>
											<tr class="sub-table">
												<th>Assign</th>
												<th>Booking Ref. No.</th>
												<th>Client Name <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th>Product Name <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th>Task Name <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th>Priority <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<!-- <th>Functional Area
													<a class="pull-right margin-left-5" href="#"><span class="glyphicon glyphicon-sort-by-alphabet"></span></a>
													<a class="pull-right" href="#"><span class="glyphicon glyphicon-filter"></span></a>
												</th> -->
												<th>File Handler <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th>Assigned <a class="pull-right margin-left-5"
													href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th>Company & Market</th>
												<th>Status <a class="pull-right margin-left-5" href="#"><span
														class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
													class="pull-right" href="#"><span
														class="glyphicon glyphicon-filter"></span></a>
												</th>
												<th colspan="2" width="400">Action</th>
											</tr>
										</thead>
										<tbody>
											<c:set var="groupRef" value="0"></c:set>
											<c:set var="assignToFlag" value="false"></c:set>
											<c:forEach items="${searchPageData.results}"
												var="workflowAction">
												<tr>
													<td><input type="checkbox" value="${workflowAction.code}" name="assignCheckbox"> <a href="#" class="taskChildRefrence" id="task_${workflowAction.code}">>></a> </td>
													<c:if
														test="${groupData[workflowAction.order.code] eq null}">
														<td></td>
													</c:if>

													<c:if
														test="${workflowAction.order.code ne null && (groupRef eq 0) || (groupRef ne workflowAction.order.code)}">
														<spring:url value="/order/${workflowAction.order.code}" var="orderUrl"></spring:url>
														
														<td rowspan="${groupData[workflowAction.order.code]}"><a
															href="${orderUrl}">${workflowAction.order.code}</a>
														</td>
														<c:set var="groupRef"
															value="${workflowAction.order.code}"></c:set>
													</c:if>

													<td></td>
													<td></td>
													<td>${workflowAction.name}</td>
													<td>${workflowAction.priority}</td>
													<!-- <td>Operations</td> -->
													<td>${workflowAction.secondaryAssignedUser}</td>
													<td>${workflowAction.assignedUser}</td>
													<td>${workflowAction.companyName}, ${workflowAction.companyMarket}</td>
													<td>
													<todo:todoStatus workflowAction="${workflowAction}" isTaskOverdue="${isTaskOverdue}"/>													
													</td>
													<td><c:url
															value="/todo/task/view/${workflowAction.code}"
															var="detailURL"></c:url> <a href="${detailURL}"> View
															/ Edit </a> &nbsp; &nbsp; | &nbsp; &nbsp;
															<c:url
															value="/todo/createToDo?parent=${workflowAction.code}&order=${workflowAction.order.code}&product=${workflowAction.product.code}"
															var="createURL"></c:url> 
															<a href="${createURL}">
															Create SubTask </a></td>


													<c:if test="${assignToFlag eq false}">
														<c:set value="true" var="assignToFlag"></c:set>
														<td
															rowspan="${searchPageData.pagination.totalNumberOfResults}">Assign
															to <br>
															<c:url var="reAssignURL" value="/todo/reAssign" ></c:url>
															<form action="${reAssignURL}" method="get" id="reAssignFrom" >
															<div class="outer" >
																<select class="form-control" name="user" id="reAssignSelectbox">
																	<c:forEach items="${reAssignableUser}" var="user">
																		<option value="${user.uid}">${user.firstName}&nbsp;${user.lastName}</option>
																	</c:forEach>
																</select>
																<input type="hidden" value="" name="tasks" id="reAssignTasksHidden">
															</div>
															<button type="submit" class="btn btn-default btn-sm" id="reAssignSubmit">Confirm</button>
															</form>	
														</td>
													</c:if>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>

								<div class="clearfix">
									<div class="pull-left">
										<pagination:pageSelectionPagination
											searchUrl="/todo/searchToDo"
											searchPageData="${workflowAction}"
											numberPagesShown="${numberPagesShown}"
											themeMsgKey="${themeMsgKey}" />
									</div>
									<div class="pull-right text-right margin-top-15">
										<c:url value="/todo/createToDo" var="createURL"></c:url>
										<form action="${createURL}" method="get">
											<button type="submit" class="btn btn-default btn-sm">Add</button>
											<c:url value="/todo/snapshot" var="returnUrl"></c:url>
											<a href="${returnUrl}">
												<button type="button" class="btn btn-default btn-sm">Cancel</button>
											</a>
										</form>
									</div>
								</div>
							</c:if>
						</div>

					</div>
				</section>
			</div>
		</div>
	</div>
</article>

