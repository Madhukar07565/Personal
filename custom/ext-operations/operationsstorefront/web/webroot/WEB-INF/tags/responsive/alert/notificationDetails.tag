<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ attribute name="workflowActionData" required="true"
	type="com.cnk.travelogix.operations.data.WorkflowActionData"%>

<c:if test="${not empty workflowActionData}">
	<div class="modal-body">
		<table width="100%" cellspacing="0" cellpadding="0" border="0"
			valign="top" class="table-main">
			<thead>
				<tr>
					<th>Code</th>
					<th>Name</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>

				<tr>
					<td><c:out value="${notificationData.code}" /></td>
					<td><c:out value="${notificationData.name}" /></td>
					<td><c:out value="${notificationData.status}" /></td>
				</tr>

			</tbody>
		</table>
	</div>
</c:if>