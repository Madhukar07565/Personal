<%@ page trimDirectiveWhitespaces="true" contentType="application/json" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

{ "tasks" : [
<c:forEach items="${tasks}" var="task" varStatus="taskStatus">
		"<tr class='childOf_${task.parent}'><td class='conceal ${task.parent}'><input type='checkbox' value='${task.code}'></td><td class='conceal ${task.parent}'> <c:url value='/order/${workflowAction.order.code}' var='orderUrl'></c:url> <a href='${orderUrl}'>${task.order.code} </a> </td><td class='conceal ${task.parent}'>&nbsp;</td><td class='conceal ${task.parent}'>${task.product.name}</td><td class='conceal ${task.parent}'>${task.name}</td><td class='conceal ${task.parent}'>${task.priority}</td><td class='conceal ${task.parent}'> ${task.secondaryAssignedUser}</td><td class='conceal ${task.parent}'>${task.assignedUser}</td><td class='conceal ${task.parent}'>${task.companyName},${task.companyMarket}</td><td class='conceal ${task.parent}'>${fn:toUpperCase(task.taskStatus)}</td><td class='conceal ${task.parent}'><c:url value='/todo/task/view/${task.code}' var='detailURL'></c:url> <a href='${detailURL}'> View </a> / <c:url value='/todo/task/edit/${task.code}' var='editURL'></c:url> <a href='${editURL}'> Edit </a> </td> </tr>"<c:if test="${not taskStatus.last}">,</c:if>
</c:forEach>
] }
