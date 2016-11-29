<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="template"
	tagdir="/WEB-INF/tags/addons/storefrontaddon/responsive/template"%>
<%@ taglib prefix="header"
	tagdir="/WEB-INF/tags/addons/storefrontaddon/responsive/header"%>
<%@ taglib prefix="footer"
	tagdir="/WEB-INF/tags/addons/storefrontaddon/responsive/footer"%>
<%@ taglib prefix="side"
	tagdir="/WEB-INF/tags/addons/storefrontaddon/responsive/side"%>
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
		<cms:pageSlot position="Section3" var="feature">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
	</div>
	
</template:page>
