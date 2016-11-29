<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/ezg/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<template:page pageTitle="${pageTitle}">
	<form:form id="wishlistForm">
	<cms:pageSlot position="Section1" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>

	<cms:pageSlot position="Section2" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	</form:form>

</template:page>

<script type="text/javascript">
$(document).ready(function(){
	ACC.account.disablePages('wishlistForm','${fullContextPath}', ${active})
});
</script>