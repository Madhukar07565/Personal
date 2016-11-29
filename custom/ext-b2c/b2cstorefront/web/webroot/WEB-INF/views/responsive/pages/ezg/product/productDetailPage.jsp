<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/ezg/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<template:page pageTitle="${pageTitle}">
	<div class="container">
		<div class="row">
			<div class="col_12">
				<cms:pageSlot position="Section1" var="feature">
					<cms:component component="${feature}"/>
				</cms:pageSlot>
				<ul class="clearfix posR bdrPaleGrey bdrBtmNone">
				    <cms:pageSlot position="Section2A" var="feature">
						<cms:component component="${feature}"/>
					</cms:pageSlot>
					<cms:pageSlot position="Section2B" var="feature">
						<cms:component component="${feature}"/>
					</cms:pageSlot>
					<cms:pageSlot position="Section2C" var="feature">
						<cms:component component="${feature}"/>
					</cms:pageSlot>
				</ul>
				<ul class="clearfix pB20 mB40 bdrPaleGrey">
					<cms:pageSlot position="Section3A" var="feature">
						<cms:component component="${feature}"/>
					</cms:pageSlot>
					<cms:pageSlot position="Section3B" var="feature">
						<cms:component component="${feature}"/>
					</cms:pageSlot>
				</ul>
				<cms:pageSlot position="Section4"  var="feature">
					<cms:component component="${feature}"/>
				</cms:pageSlot>
			</div>
		</div>
	</div>
</template:page>