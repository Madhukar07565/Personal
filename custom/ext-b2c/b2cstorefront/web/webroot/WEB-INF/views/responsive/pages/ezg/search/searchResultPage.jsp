<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/ezg/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<template:page pageTitle="${pageTitle}">
	<div class="container">
		<cms:pageSlot position="Section1" var="feature">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
	    <cms:pageSlot position="Section2A" var="feature">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
		<cms:pageSlot position="Section2B" var="feature">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
	</div>
</template:page>