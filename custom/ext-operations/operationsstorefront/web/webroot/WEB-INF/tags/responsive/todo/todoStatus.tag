<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ attribute name="workflowAction" required="true"
	type="com.cnk.travelogix.operations.data.WorkflowActionData"%>
<%@ attribute name="isTaskOverdue" required="true"%>
<c:choose>
	<c:when test="${fn:length(workflowAction.assignedTo) gt 0}">
		<c:set value="true" var="isAssigned" />
	</c:when>
	<c:otherwise>
		<c:set value="false" var="isAssigned" />
	</c:otherwise>
</c:choose>

<c:choose>

	<c:when test="${isTaskOverdue eq true}">
		Overdue ${workflowAction.overdueDays} days
	</c:when>
	<c:when test="${fn:containsIgnoreCase(workflowAction.taskStatus, 'OPEN') and isAssigned eq true }">
	<c:choose>
	<c:when test="${workflowAction.isRead eq true }">
	${fn:toUpperCase(workflowAction.taskStatus)}
	<a class="pull-right margin-left-5" href="#"><span class="glyphicon glyphicon-folder-open"></span></a>
	</c:when>
	<c:otherwise>
	${fn:toUpperCase(workflowAction.taskStatus)} 
	<a class="pull-right margin-left-5" href="#"><span class="glyphicon glyphicon-folder-close"></span></a>														
	</c:otherwise>
	</c:choose>
	</c:when>
	<c:otherwise>
	${fn:toUpperCase(workflowAction.taskStatus)}
	</c:otherwise>
</c:choose>