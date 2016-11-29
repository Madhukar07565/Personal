<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<template:todopage>

	<cms:pageSlot position="ToDoDetail" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>

</template:todopage>
