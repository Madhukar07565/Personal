<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ attribute name="workflowActionDatas" required="true"
	type="java.util.ArrayList"%>

<div class="navbar navbar-default main-nav" role="navigation">
	<div class="container">
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><i class="glyphicon glyphicon-home"></i>
						Home</a></li>
				<li><a data-toggle="modal" href="#notif"><i
						class="glyphicon glyphicon-exclamation-sign"></i> Notifications <span
						class="badge">${fn:length(workflowActionDatas)}</span></a></li>
			</ul>
			
			<!-- popoup for notifications starts here-->
			<div class="modal fade" id="notif" role="dialog">
				<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Task Notification Summary - User ${fn:length(workflowActionDatas)} (Individual)</h4>
						</div>
						<div class="modal-body">
							<table width="100%" cellspacing="0" cellpadding="0" border="0"
								valign="top" class="table-main">
								<thead>
									<tr>
										<th>Code</th>
										<th>Name</th>
										<th>Status</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<c:if test="${not empty workflowActionDatas}">
										<c:forEach items="${workflowActionDatas}"
											var="workflowActionData">
											<tr>
												<td>
												 <!-- <a href="${request.contextPath}/alert-view/${workflowActionData.code}">   -->
												 <a data-toggle="modal" href="#notifDetails" onclick="javascript:getNotificationDetails('${workflowActionData.code}');"> 
												 <!-- <a href="javascript:getNotificationDetails('${workflowActionData.code}');">   -->
												<c:out value="${workflowActionData.code}" /></a></td>
												<td><c:out value="${workflowActionData.name}" /></td>
												<td><c:out value="${workflowActionData.status}" /></td>
												<td><a href="${request.contextPath}/alert-dismiss/${workflowActionData.code}">Dismiss</a></td>
											</tr>
										</c:forEach>
									</c:if>
								</tbody>
							</table>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- popoup for notification Details starts here-->
			<div class="modal fade" id="notificationDetails" tabindex="-1" role="dialog"  aria-labelledby="mySmallModalLabel" aria-hidden="true" style="margin: 0 auto; width:855px;">
			  <div class="modal-dialog">
			    <div class="modal-content">
			      <div class="modal-header">
			        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
			        <h4 class="modal-title" id="mySmallModalLabel">Notification Detail</h4>
			      </div>
			      <div class="modal-body">
			        <div id="notiDetails" ></div>
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			      </div>
			    </div>
			  </div>
			</div>
		   <!-- popoup for notification Details ends here-->
	</div>
</div>
<script>
 function getNotificationDetails(code)
 {
	 var currentLocation = window.location+"/alert-view/"+code;
 	 $.ajax({
 			dataType: "json",
 			url:currentLocation,
 			type: 'GET',
 			success: function (data)
 			{
				var notiHeaderResults = "'<table width='100%' cellspacing='0' cellpadding='0' border='0' valign='top' class='table-main'><thead><tr><th>Code</th><th>Name</th><th>Status</th><th>Priority</th><th>AssignedUser</tr></thead><tbody>";
				var notiBodyResults = '<tr><td>'+data.code+'</td><td>'+data.name+'</td><td>'+data.status+'</td><td>'+data.priority+'</td><td>'+data.assignedUser+'</td></tbody></table>';
				$( "#notiDetails" ).html(notiHeaderResults+notiBodyResults);
				$("#notificationDetails").modal('show');
 			}
 		}); 
 }

</script>