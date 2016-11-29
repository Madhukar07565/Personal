<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/ezg/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<template:page pageTitle="${pageTitle}">
	<!--=== Content Container ===-->
	<form:form id="dashboardEditForm">
	<div class="bkgLitBlu pB40 clearfix">
		<img src="${ezgImagesPath}/dashboard/dashboard_banner.jpg"
			alt="Banner" class="w100pcnt posR">

		<div class="container pB40 clearfix">
			<!-- Left toc nav begins here-->
			<aside class="col_3 col_sm_4 mTN230 pL0">
				<cms:pageSlot position="LeftNavTop" var="feature">
					<cms:component component="${feature}" />
				</cms:pageSlot>
			</aside>

			<!-- Right Side Content begins here-->
			<section class="col_9 col_sm_6_67pc">
				<cms:pageSlot position="RightContentTop" var="feature">
					<cms:component component="${feature}" />
				</cms:pageSlot>
				<cms:pageSlot position="RightContentBottom" var="feature">
					<cms:component component="${feature}" />
				</cms:pageSlot>
			</section>
			<hr class="mB20 cB clearfix">
			<p class="fR">
				<a href="javascript:ACC.account.updateProfile('${fullContextPath}');" class="button button-primary mR10">Save
					My Profile</a><a href="./dashboard" class="button">Cancel</a>
			</p>
		</div>
		<!--=== End Deals for travellers ===-->

	</div>
	</form:form>
	<!--=== End Content Container ===-->
</template:page>

<script type="text/javascript">
$(document).ready(function(){
	ACC.account.disablePages('dashboardEditForm','${fullContextPath}', ${active})
});
</script>