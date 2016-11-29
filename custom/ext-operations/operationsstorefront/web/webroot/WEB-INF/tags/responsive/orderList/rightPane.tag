<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="action" required="true" type="java.lang.String"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="formElement"
	tagdir="/WEB-INF/tags/responsive/formElement"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="rightPane" class="col-md-10 rightPane">
	<div class="panel-group" id="accordion">
	 <form:form method="POST" modelAttribute="searchFilterForm"
			action="${request.contextPath}/order/saved-query" class="form">
			<div class="panel panel-default panePadding">
				<div class="panel-heading titleBold">
					<a data-toggle="collapse" data-parent="#accordion" href="#pane1">Booking
						Details </a>
				</div>
			<div id="pane1" class="panel-collapse collapse">
					<div class="row marginSpacing">
						<div class="form-group">
							<formElement:formInputBox idKey="searchPage.bookingDetails.bookingRefNumber"
								labelKey="searchPage.bookingDetails.bookingRefNumber"
								path="bookingRefNumber" inputCSS="col-md-2"
								labelCSS="control-label col-md-2" />
						</div>
						<div class="form-group">
							<formElement:formInputBox idKey="searchPage.bookingDetails.bookingDateFrom"
								labelKey="searchPage.bookingDetails.bookingDateFrom"
								path="bookingDateFrom" inputCSS="col-md-2"
								labelCSS="control-label col-md-2" />
						</div>
						<div class="form-group">
							<formElement:formInputBox idKey="searchPage.bookingDetails.bookingDateTo"
								labelKey="searchPage.bookingDetails.bookingDateTo"
								path="BookingDateTo" inputCSS="col-md-2"
								labelCSS="control-label col-md-2" />
						</div>
						<div class="form-group">
							<form:select path="assignment" >
								<form:option value="UnAssigned" disabled="true"/>
								<c:forEach items="${employeeList}"	var="employee">
									<form:option code="${employee.displayUid}" value="${employee.name}" />
								</c:forEach>
							</form:select>
						</div>
						<div class="form-group">
							<formElement:formInputBox
								idKey="searchPage.bookingDetails.userName"
								labelKey="searchPage.bookingDetails.userName" path="userName" inputCSS="col-md-2"
								labelCSS="control-label col-md-2"/>
						</div>
					</div>
					<div class="row marginSpacing">
						<div class="form-group">
							<form:select path="bookingType">
								<form:option value="Time Limit Booking" disabled="true"/>
								<c:forEach items="${bookingTypeValues}"	var="bookingType">
									<form:option code="${bookingType.key}" value="${bookingType.value}" />
								</c:forEach>
							</form:select>
						</div>
						<div class="form-group">
							<form:select path="bookingStatus">
								<form:option value="Please select a status" disabled="true"/>
								<c:forEach items="${bookingStatusValues}"	var="bookingStatus">
									<form:option code="${bookingStatus.key}" value="${bookingStatus.value}" />
								</c:forEach>
							</form:select>
						</div>
						<div class="form-group">
							<%-- <formElement:formSelectBox labelKey="" items="" idKey="" path=""/> --%>
							<form:select path="bookingPriority">
								<form:option value="Please select a priority" disabled="true"/>
								<c:forEach items="${bookingPriorityValues}"	var="bookingPriorityValue">
									<form:option code="${bookingPriorityValue.key}" value="${bookingPriorityValue.value}" />
								</c:forEach>
							</form:select>
						</div>
						<div class="form-group">
							<formElement:formInputBox
								idKey="searchPage.bookingDetails.financialControlId"
								labelKey="searchPage.bookingDetails.financialControlId"
								path="financialControlId" />
						</div>
					</div> 
				</div> 
			</div>
			<!--pane1 ends  -->
			<!--pane3 starts  -->
			<%-- <div class="panel panel-default">
          		<div class="panel-heading titleBold">
               		<a data-toggle="collapse" data-parent="#accordion" href="#pane3">Company Details </a></div>
         		<div id="pane3" class="panel-collapse collapse">
				<div class="row marginSpacing">
					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.companyDetails.suppName"
							labelKey="searchPage.companyDetails.suppName" path="groupOfCompany" />
					</div>

					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.companyDetails.serviceOT"
							labelKey="searchPage.companyDetails.serviceOT" path="groupOfCompany" />
					</div>
					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.companyDetails.suppBillPassingStatus"
							labelKey="searchPage.companyDetails.suppBillPassingStatus"
							path="groupOfCompany" />
					</div>
				</div>
				
               </div>
            </div>  --%>
            <!--pane3 ends  -->
			<br><br>
			<formElement:formInputBox idKey="savedQueryName"
				labelKey="searchPage.savedQueryName" path="savedQueryName"
				inputCSS="col-md-2" labelCSS="control-label col-md-2" />

			<ycommerce:testId code="save_criteria_button">
				<button type="submit" class="btn btn-success">Save Search</button>
			</ycommerce:testId>
		</form:form>
	</div>
	<p class="alignRight">
		<button type="button" class="btn btn-success">Search</button>
		&nbsp;&nbsp;&nbsp;
		<button type="button" class="btn btn-primary">Reset</button>
		&nbsp;&nbsp;&nbsp;
		<button type="button" class="btn btn-danger">Cancel</button>
	</p>
</div>



<%-- <c:forEach   var="bookingPriority" items="${bookingPriorityValues}">
	key : <c:out value="${bookingPriority.key}"/> , Value : <c:out value="${bookingPriority.value}"/>
</c:forEach><br>

<c:forEach   var="bookingStatus" items="${bookingStatusValues}">
	key : <c:out value="${bookingStatus.key}"/> , Value : <c:out value="${bookingStatus.value}"/>
</c:forEach><br>

<c:forEach   var="bookingType" items="${bookingTypeValues}">
	key : <c:out value="${bookingType.key}"/> , Value : <c:out value="${bookingType.value}"/>
</c:forEach><br>


<c:forEach   var="employee" items="${employeeList}">
	uid : <c:out value="${employee.displayUid}"/> , name : <c:out value="${employee.name}"/>
</c:forEach> --%>
<!-- <head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
    $("#savedQueryName").blur(function(){
    	checkSavedQueryName();
       
    });
});

function checkSavedQueryName(){
	 var name=$("#savedQueryName").val();
	alert("checkSavedQueryName : "+name)
	
	$.ajax({
		type : "GET",
		contentType : "application/json",
		url : "https://operations.local:9002/operationsstorefront/operations/en/order/check-saved-query",
		data : {name: name},
		dataType : 'json',
		success : function(result) {
			alert("result : "+result)
			console.log("SUCCESS: ", result);
			display(result);
		},
		error : function(e) {
			console.log("ERROR: ", e);
			display(e);
		}
	});
}
</script>
</head> -->

