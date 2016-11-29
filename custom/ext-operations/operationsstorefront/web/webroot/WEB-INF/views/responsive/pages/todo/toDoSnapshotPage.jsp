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


<template:todopage>
	<br><br>
	<article>
		<div class="main">
			<div class="container">
				<div class="panel panel-default">
					<c:url value="/todo/snapshot" var="snapShotURL"></c:url>
					<form:form class="form-horizontal" action="${snapShotURL}" id="snapShotFromID" method="get" >
						<div class="panel-body">
							<div class="row">
								<sec:authorize ifAnyGranted="ROLE_WFL_SUPERVISORGROUP">
									<div class="col-md-6">
										<div class="panel panel-default">
											<c:url value="/todo/snapshot" var="snapShotURL"></c:url>
											<div class="panel-heading">Task Notification Summary -
												Supervisor</div>
												<ul>
													<li><label class="radio-inline snapShotFormRadio"> <input
															type="radio" value="statusWise" name="wise" checked
															data-bind="checked: displayMode">Status wise
													</label> <label class="radio-inline snapShotFormRadio"> <input type="radio"
															value="userWise" name="wise" ${wise eq 'userWise' ? 'checked' : ''}
															data-bind="checked: displayMode">User wise
													</label></li>
												</ul>
											<div class="panel-body">
												<table width="100%" cellspacing="0" cellpadding="0"
													border="0" valign="top" class="table-main">
													<thead>
														<tr>
															<th>Assigned To</th>
															<th>Status</th>															
															<th>Count</th>
															<th>OverDue Count</th>
														</tr>
													</thead>
													<c:if test="${wise eq 'statusWise'}">
														<tbody>
															<c:forEach items="${toDoSnapshotDatas}"
																var="toDoSnapshotData">
																<tr class="warning">
																	<td colspan="2">
																		<div class="italic-ttl">${toDoSnapshotData.status}</div>
																	</td>																	
																	<td>
																	<spring:url value="/todo?status=${toDoSnapshotData.status}" var="toDoStatusWiseUrl"/>																	
																	<a href="${toDoStatusWiseUrl}" class="view-all">${toDoSnapshotData.count}</a></td>
																	<td><c:choose>
																			<c:when test="${toDoSnapshotData.overdueCount gt 0}">
																				<spring:url value="/todo?status=${toDoSnapshotData.status}&overdue=true" var="toDoStatusWiseOverdueUrl"/>																	
																				<a href="${toDoStatusWiseOverdueUrl}" class="view-all">${toDoSnapshotData.overdueCount}</a>
																			</c:when>
																			<c:otherwise>
																			${toDoSnapshotData.overdueCount}
																			</c:otherwise>
																	</c:choose></td>
																</tr>

																<c:forEach items="${toDoSnapshotData.tasks}" var="task">
																	<tr>
																		<td>&nbsp;</td>
																		<td>${task.user}</td>
																		<td>${task.count}</td>
																		<td><c:if test="${task.overdueCount gt 0}">${task.overdueCount}</c:if></td>
																		
																	</tr>

																</c:forEach>

															</c:forEach>
															<tr class="warning">
																<td colspan="2">
																	<div class="italic-ttl">UNASSIGNED</div>
																</td>
																<td>&nbsp;</td>
																<td><c:choose>
																		<c:when test="${unassginedTasks gt 0}">
																			<spring:url value="/todo/unassignedTasks" var="unassignedTasksURL"></spring:url>
																			<a href="${unassignedTasksURL}" class="view-all">${unassginedTasks}</a>
																		</c:when>
																		<c:otherwise>
																	${unassginedTasks}
																</c:otherwise>
																	</c:choose></td>
															</tr>
															<tr>
																<td>&nbsp;</td>
																<td>&nbsp;</td>
																<td>&nbsp;</td>
																<td><c:url value="/todo" var="toDoUrl"></c:url> <a
																	href="${toDoUrl}" class="view-all">View All</a></td>
															</tr>
														</tbody>
													</c:if>
													<c:if test="${wise eq 'userWise'}">
														<tbody>
															<c:forEach items="${toDoSnapshotDatas}"
																var="toDoSnapshotData">
																<tr class="warning">
																	<td colspan="2">
																		<div class="italic-ttl">${toDoSnapshotData.user}</div>
																	</td>																	
																	<td>
																	<spring:url value="/todo?user=${toDoSnapshotData.user}" var="toDoUserWiseUrl"/>
																	<a href="${toDoUserWiseUrl}" class="view-all">${toDoSnapshotData.count}</a></td>
																	<td><c:choose>
																			<c:when test="${toDoSnapshotData.overdueCount gt 0}">
																			<spring:url value="/todo?user=${toDoSnapshotData.user}&overdue=true" var="toDoUserWiseOverdueUrl"/>																			
																				<a href="${toDoUserWiseOverdueUrl}" class="view-all">${toDoSnapshotData.overdueCount}</a>
																			</c:when>
																			<c:otherwise>
																			${toDoSnapshotData.overdueCount}
																			</c:otherwise>
																		</c:choose></td>
																</tr>

																<c:forEach items="${toDoSnapshotData.tasks}" var="task">
																	<tr>
																		<td>&nbsp;</td>
																		<td>${task.status}</td>
																		<td>${task.count}</td>
																		<td><c:if test="${task.overdueCount gt 0}">${task.overdueCount}</c:if></td>
																		
																	</tr>

																</c:forEach>

															</c:forEach>
															<tr class="warning">
																<td colspan="2">
																	<div class="italic-ttl">UNASSIGNED</div>
																</td>
																<td>&nbsp;</td>
																<td><c:choose>
																		<c:when test="${unassginedTasks gt 0}">
																			<spring:url value="/todo/unassignedTasks" var="unassignedTasksURL"></spring:url>
																			<a href="${unassignedTasksURL}" class="view-all">${unassginedTasks}</a>
																		</c:when>
																		<c:otherwise>
																	${unassginedTasks}
																</c:otherwise>
																	</c:choose></td>
															</tr>
															
															<tr>
																<td>&nbsp;</td>
																<td>&nbsp;</td>
																<td>&nbsp;</td>
																<td><c:url value="/todo" var="toDoUrl"></c:url> <a
																	href="${toDoUrl}" class="view-all">View All</a></td>
															</tr>
														</tbody>
													</c:if>
												</table>
											</div>
										</div>
									</div>
								</sec:authorize>
								<sec:authorize ifNotGranted="ROLE_WFL_SUPERVISORGROUP">
									<div class="col-md-6">
										<div class="panel panel-default">

											<div class="panel-heading">Task Notification Summary -
												${toDoSnapshotData.user} (Individual)</div>
											<div class="panel-body">
												<table width="100%" cellspacing="0" cellpadding="0"
													border="0" valign="top" class="table-main">
													<thead>
														<tr>
															<th>Status</th>
															<th>Count</th>
															<th>OverDue</th>
														</tr>
													</thead>
													<tbody>
														<c:choose>
															<c:when test="${not empty toDoSnapshotDatas }">
																<c:forEach items="${toDoSnapshotDatas}"
																	var="toDoSnapshotData">
																	<c:forEach items="${toDoSnapshotData.tasks}" var="task">
																		<tr>
																			<td>${task.status}</td>
																			<td>${task.count}</td>
																			<td><c:if test="${task.overdueCount gt 0}">${task.overdueCount}</c:if></td>
																		</tr>
																	</c:forEach>
																
																<tr class="warning">
																	<td>&nbsp;</td>
																	<spring:url value="/todo"
																		var="toDoIndividualUrl" />
																	<spring:url
																		value="/todo?overdue=true"
																		var="toDoIndividualOverdueUrl" />
																	<td><a href="${toDoIndividualUrl}"
																		class="view-all">${toDoSnapshotData.count}</a></td>

																	<td><c:choose>
																			<c:when test="${toDoSnapshotData.overdueCount gt 0}">
																				<spring:url
																					value="/todo?status=${toDoSnapshotData.status}&overdue=true"
																					var="toDoStatusWiseOverdueUrl" />
																				<a href="${toDoIndividualOverdueUrl}"
																					class="view-all">${toDoSnapshotData.overdueCount}</a>
																			</c:when>
																			<c:otherwise>
																			${toDoSnapshotData.overdueCount}
																			</c:otherwise>
																		</c:choose></td>

																</tr>
																</c:forEach>
																<tr class="warning">
																<td>
																	<div class="italic-ttl">UNASSIGNED</div>
																</td>
																
																<td><c:choose>
																		<c:when test="${unassginedTasks gt 0}">
																		<spring:url value="/todo/unassignedTasks" var="unassignedTasksURL"></spring:url>
																			<a href="${unassignedTasksURL}" class="view-all">${unassginedTasks}</a>
																		</c:when>
																		<c:otherwise>
																	${unassginedTasks}
																</c:otherwise>
																	</c:choose></td>
																<td>&nbsp;</td>
															</tr>
															
																<tr>
																	<td>&nbsp;</td>
																	<td>&nbsp;</td>
																	<td><c:url value="/todo" var="toDoUrl"></c:url> <a
																		href="${toDoUrl}" class="view-all">View All</a></td>
																</tr>
															</c:when>
															<c:otherwise>
																<tr class="warning">
																	<td colspan="3"><spring:theme code="todo.task.no.tasks.assgined"/></td>
																</tr>
																<tr>
																	<td>&nbsp;</td>
																	<td>&nbsp;</td>
																	<td><c:url value="/todo" var="toDoUrl"></c:url> <a
																		href="${toDoUrl}" class="view-all">View All</a></td>
																</tr>
															</c:otherwise>
														</c:choose>
													</tbody>
												</table>
											</div>

										</div>
									</div>
								</sec:authorize>
							</div>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</article>
</template:todopage>
