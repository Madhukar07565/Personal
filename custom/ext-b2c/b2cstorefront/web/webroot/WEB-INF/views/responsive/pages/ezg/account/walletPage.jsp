<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/ezg/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<template:page pageTitle="${pageTitle}">
<form:form id="walletForm">
  <section class="col_12 clearfix mT40 mB40 tabs" id="selectionTable">
	<cms:pageSlot position="Section1" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<div class="tabsContent">
		<cms:pageSlot position="Section2A" var="feature">
			<cms:component component="${feature}" />
		</cms:pageSlot>
		<cms:pageSlot position="Section2B" var="feature">
			<cms:component component="${feature}" />
		</cms:pageSlot>
		<cms:pageSlot position="Section2C" var="feature">
			<cms:component component="${feature}" />
		</cms:pageSlot>
	</div>
  </section>
</form:form>
</template:page>

<script type="text/javascript">
$(document).ready(function(){
	ACC.account.disablePages('walletForm','${fullContextPath}', ${active})
});
</script>