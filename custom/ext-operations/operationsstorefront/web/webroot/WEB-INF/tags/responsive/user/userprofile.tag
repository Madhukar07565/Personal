<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="formElement"
	tagdir="/WEB-INF/tags/responsive/formElement"%>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>


<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Cox and Kings</title>
	<!-- Bootstrap -->
	<link href="../css/bootstrap.min.css" rel="stylesheet">
	<link href="../css/cnk.css" rel="stylesheet">
	<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<header>
		<div class="container">
			<div class="navbar-header">
				<a href="/operationsstorefront/operations/en/" class="navbar-brand"><img src="../../images/logo-cnk.gif" /></a>
			</div>
		</div>
	</header>
	<article>
		<div class="main">
			<div class="container">
				<h1>User Profile <span>Edit</span></h1>
				<section class="panel panel-default">
					<div class="panel-heading main-heading">
						User Profile
					</div>
					<section class="panel-body form-horizontal">
						<fieldset class="full-fieldset">
							<legend>Personal Information</legend>
							<ul class="row">
								<li class="col-md-6">
									<div class="form-group">
										<label class="col-md-3 control-label">Employee ID</label>
										<div class="col-md-9">
											<input type="text" class="form-control" value="${employeeDatavalue.displayUid}">
										</div>
									</div>
								</li>
								<li class="col-md-6 ">
									<div class="form-group">
										<label class="col-md-3 control-label">User ID</label>
										<div class="col-md-9">
											<input type="text" class="form-control">
										</div>
									</div>
								</li>
							</ul>
							<ul class="row">
								<li class="col-md-6">
									<div class="form-group">
										<label class="col-md-3 control-label">Full Name</label>
										<div class="col-md-9">
											<input type="text" class="form-control" value="${employeeDatavalue.firstName}">
										</div>
									</div>
								</li>
								<li class="col-md-6">
									<div class="form-group">
										<label class="col-md-3 control-label">Reporting Manager</label>
										<div class="col-md-9">
											<input type="text" class="form-control" value="${employeeDatavalue.reportingManager}">
										</div>
									</div>
								</li>
							</ul>
							<ul class="row">
								<li class="col-md-6">
									<div class="form-group">
										<label class="col-md-3 control-label">Default Company</label>
										<div class="col-md-9">
											<input type="text" class="form-control" value="${employeeDatavalue.defaultCompany}">
										</div>
									</div>
								</li>
								<li class="col-md-6">
									<div class="form-group">
										<label class="col-md-3 control-label">Mobile</label>
										<div class="col-md-9">
											<input type="text" class="form-control" value="${employeeDatavalue.mobileNumber}">
										</div>
									</div>
								</li>
							</ul>
							<ul class="row">
								<li class="col-md-6">
									<div class="form-group">
										<label class="col-md-3 control-label">Email</label>
										<div class="col-md-9">
											<input type="text" class="form-control" value="${employeeDatavalue.contactEmail}">
										</div>
									</div>
								</li>
								<li class="col-md-1 col-md-offset-5">
								</li>
							</ul>
							<ul class="row">
								<li class="col-md-6">
									<div class="form-group">
										<label class="col-md-3 control-label">Designation</label>
										<div class="col-md-9">
											<input type="text" class="form-control" value="${employeeDatavalue.designation}">
										</div>
									</div>
								</li>
								<li class="col-md-6">
									<div class="form-group">
										<label class="col-md-3 control-label">Functional Role</label>
										<div class="col-md-9">
											<input type="text" class="form-control" value="${employeeDatavalue.functionalRole}">
										</div>
									</div>
								</li>
							</ul>
							<ul class="row">
								<li class="col-md-6">
									<div class="form-group">
										<label class="col-md-3 control-label">BU</label>
										<div class="col-md-9">
											<input type="text" class="form-control" value="${employeeDatavalue.bu}">
										</div>
									</div>
								</li>
								<li class="col-md-6">
									<div class="form-group">
										<label class="col-md-3 control-label">SBU</label>
										<div class="col-md-9">
											<input type="text" class="form-control" value="${employeeDatavalue.sbu}">
										</div>
									</div>
								</li>
							</ul>
							<ul class="row">
								<li class="col-md-6">
									<div class="form-group">
										<label class="col-md-3 control-label">Sales Office</label>
										<div class="col-md-9">
											<input type="text" class="form-control"
												value="${employeeDatavalue.salesOffice}">
										</div>
									</div>
								</li>
								<li class="col-md-6">
									<div class="form-group">
										<label class="col-md-3 control-label">Sales Group</label>
										<div class="col-md-9">
											<input type="text" class="form-control"
												value="${employeeDatavalue.salesGroup}">
										</div>
									</div>
								</li>
							</ul>
							<ul class="row">
								<li class="col-md-6">
									<div class="form-group">
										<label class="col-md-3 control-label">Roles</label>
										<div class="col-md-9">
											<c:forEach items="${employeeDatavalue.role}" var="entry">
												<input type="text" class="form-control" value="${entry}" />
											</c:forEach>
										</div>
									</div>
								</li>
							</ul>
						</fieldset>
					</section>
		<%-- 			<section class="panel-body form-horizontal">
						<fieldset class="full-fieldset">
							<legend>Password Settings</legend>
							<ul class="row">
								<li class="col-md-6">
									<div class="form-group">
										<label class="col-md-3 control-label"><a data-toggle="modal" href="#notif">Change Password</a></label>
									</div>
								</li>
								<div class="modal fade" id="notif" role="dialog">
									<div class="modal-dialog">

										<!-- Modal content-->
										<div class="modal-content">
											<div class="modal-header">
												<button type="button" class="close" data-dismiss="modal">&times;</button>
												<h4 class="modal-title">Change Password</h4>
											</div>
											<div class="modal-body">
												<form accept-charset="UTF-8" role="form" class="form-horizontal">

													<div class="form-group">
														<label class="col-md-3 control-label">Old Password</label>
														<div class="col-md-5">
															<input class="form-control" name="password" type="password" value="">
														</div>
													</div>
													<div class="form-group">
														<label class="col-md-3 control-label">New Password</label>
														<div class="col-md-5">
															<input class="form-control" name="password" type="password" value="">
														</div>
														<div class="col-md-4">
															<small><strong>Password Strength</strong></small>
															<div class="progress">
																<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 80%;"></div>
															</div>
															<div class="text-right"><small>Strong</small></div>
														</div>
													</div>

													<div class="form-group">
														<label class="col-md-3 control-label">Retype Password</label>
														<div class="col-md-5">
															<input class="form-control" name="password" type="password" value="">
														</div>
													</div>
												</form>
											</div>
											<div class="modal-footer">
												<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
												<button type="button" class="btn btn-default btn-sm" data-dismiss="modal" type="submit">Submit</button>
											</div>
										</div>

									</div>
								</div>
							</ul>
						</fieldset>
					</section> --%>
					<section class="panel-body form-horizontal">
						<fieldset class="full-fieldset">
							<legend>Widget Settings</legend>
							<div class="container">
								<div class="row">
									<c:forEach items="${compWithUserGroupMemberFlag}" var="entry">
											<div class="col-md-4 checkbox">
													<input type="checkbox" id="${entry.key.uid}"
												name="compname" value="${entry.key.uid}"
												${entry.value}/> ${entry.key.name}
											</div>
									</c:forEach>
								</div>
							</div>

							<%-- <ul class="row">
								<li class="col-md-1 col-md-offset-1">
								</li>
								<li class="col-md-2">
									<div class="form-group ">
										<label class="col-md-3 control-label">Widget</label>
									</div>
								</li>
								<li class="col-md-5">
									<div class="form-group ">
										<label class="col-md-5 control-label">Refresh Frequency</label>
									</div>
								</li>
							</ul>
							<ul class="row ">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Widget-1</label>
										<div class="col-md-7">
											<select class="form-control">
											<option>Task Queue</option>
											<option>Notifications</option>
										</select>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<div class="col-md-7">
											<select class="form-control">
											<option>10 min</option>
											<option>5 min</option>
										</select>
										</div>
									</div>
								</li>
							</ul>
							<ul class="row ">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Widget-2</label>
										<div class="col-md-7">
											<select class="form-control">
											<option>Task Queue</option>
											<option>Notifications</option>
										</select>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<div class="col-md-7">
											<select class="form-control">
											<option>10 min</option>
											<option>5 min</option>
										</select>
										</div>
									</div>
								</li>
							</ul>
							<ul class="row ">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Widget-3</label>
										<div class="col-md-7">
											<select class="form-control">
											<option>Task Queue</option>
											<option>Notifications</option>
										</select>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<div class="col-md-7">
											<select class="form-control">
											<option>10 min</option>
											<option>5 min</option>
										</select>
										</div>
									</div>
								</li>
							</ul>
							<ul class="row ">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Widget-4</label>
										<div class="col-md-7">
											<select class="form-control">
											<option>Task Queue</option>
											<option>Notifications</option>
										</select>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<div class="col-md-7">
											<select class="form-control">
											<option>10 min</option>
											<option>5 min</option>
										</select>
										</div>
									</div>
								</li>
							</ul>
							<ul class="row ">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Widget-5</label>
										<div class="col-md-7">
											<select class="form-control">
											<option>Task Queue</option>
											<option>Notifications</option>
										</select>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<div class="col-md-7">
											<select class="form-control">
											<option>10 min</option>
											<option>5 min</option>
										</select>
										</div>
									</div>
								</li>
							</ul>
							<ul class="row ">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Widget-6</label>
										<div class="col-md-7">
											<select class="form-control">
											<option>Task Queue</option>
											<option>Notifications</option>
										</select>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<div class="col-md-7">
											<select class="form-control">
											<option>10 min</option>
											<option>5 min</option>
										</select>
										</div>
									</div>
								</li>
							</ul>
							<ul class="row ">
								<li class="col-md-4">
									<div class="form-group">
										<label class="col-md-5 control-label">Widget-7</label>
										<div class="col-md-7">
											<select class="form-control">
											<option>Task Queue</option>
											<option>Notifications</option>
										</select>
										</div>
									</div>
								</li>
								<li class="col-md-4">
									<div class="form-group">
										<div class="col-md-7">
											<select class="form-control">
											<option>10 min</option>
											<option>5 min</option>
										</select>
										</div>
									</div>
								</li>
							</ul> --%>
						</fieldset>
					</section>
	<!-- 				<section class="panel-body form-horizontal">
						<fieldset class="full-fieldset">
							<legend>Quicklinks Widget Settings</legend>
							<div class="row">
								<div class="col-md-12">
									<div class="media">
										<div class="media-body">
											<div class="transfer-list">
												<div class="left-selection">
													<label>Available Functions</label>
													<ul>
														<li>Accommodation</li>
														<li>Air Ancillary</li>
													</ul>
												</div>
												<div class="transfer-selection">
													<a href="javascript:void(0)"> >> Add</a> <a
														href="javascript:void(0)">Remove <<</a>
												</div>
												<div class="right-selected">
													<label>Quicklinks</label>
													<ul>
														<li>All India</li>
														<li>Jet Airways</li>
													</ul>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</fieldset>
					</section> -->
					<%-- <div>
						<table>
							<c:forEach items="${compWithUserGroupMemberFlag}" var="entry">
								<tr>
									<td><input type="checkbox" id="${entry.key.uid}"
										name="compname" value="${entry.key.uid}"
										checked="${entry.value}" /> ${entry.key.name}</td>
								</tr>
							</c:forEach>
						</table>
					</div> --%>
					<div class="panel-footer">
						<div class="text-right margin-bottom">
							<button class="btn btn-default btn-sm" type="submit" onclick="saveSelection()">Save</button>
							<button class="btn btn-default btn-sm" type="submit">Cancel</button>
						</div>
					</div>
				</section>
			</div>
		</div>
	</article>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js "></script>
	<script src="../js/bootstrap.min.js "></script>
</body>

</html>
