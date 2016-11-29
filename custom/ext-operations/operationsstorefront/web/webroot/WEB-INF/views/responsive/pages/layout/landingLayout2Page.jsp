<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="alert" tagdir="/WEB-INF/tags/responsive/alert"%>

<template:page pageTitle="${pageTitle}">
	<div id="globalMessages">
		<common:globalMessages />
	</div>

	<cms:pageSlot position="Section1" var="feature">
		<cms:component component="${feature}" element="div"
			class="span-24 section1 cms_disp-img_slot" />
	</cms:pageSlot>

	<alert:notificationSummary workflowActionDatas="${workflowActionDatas}" />
	<alert:notificationDetails workflowActionData="${workflowActionData}" />
	<div class="container">
		<div class="row">
			<cms:pageSlot position="Section2A" var="feature" element="div"
				class="col-md-3 col-sm-4 col-xs-6">
				<div class="dummy"></div>
				<cms:component component="${feature}" />
			</cms:pageSlot>

			<cms:pageSlot position="Section2B" var="feature" element="div"
				class="col-md-3 col-sm-4 col-xs-6">
				<div class="dummy"></div>
				<cms:component component="${feature}" />
			</cms:pageSlot>

			<cms:pageSlot position="Section2C" var="feature" element="div"
				class="col-md-3 col-sm-4 col-xs-6">
				<div class="dummy"></div>
				<cms:component component="${feature}" element="div" />
			</cms:pageSlot>
		
			<cms:pageSlot position="Section2D" var="feature" element="div" class="col-md-3 col-sm-4 col-xs-6">
				<div class="dummy"></div>
				<cms:component component="${feature}" element="div"/>
			</cms:pageSlot>
			
			<cms:pageSlot position="Section3" var="feature" element="div"
				class="col-md-3 col-sm-4 col-xs-6">
				<div class="dummy"></div>
				<cms:component component="${feature}" />
			</cms:pageSlot>
			
			<cms:pageSlot position="Section3B" var="feature" element="div"
				class="col-md-3 col-sm-4 col-xs-6">
				<div class="dummy"></div>
				<cms:component component="${feature}" />
			</cms:pageSlot>
			
			<cms:pageSlot position="Section4" var="feature" element="div"
				class="col-md-3 col-sm-4 col-xs-6">
				<div class="dummy"></div>
				<cms:component component="${feature}" element="div"
					class="span-6 section4 small_detail ${(elementPos%4 == 3) ? 'last' : ''}" />
			</cms:pageSlot>

			<cms:pageSlot position="Section5" var="feature" element="div"
				class="col-md-3 col-sm-4 col-xs-6">
				<div class="dummy"></div>
				<cms:component component="${feature}" />
			</cms:pageSlot>
		</div>
		<div>
			<select id="select_company">
				<c:forEach items="${userCompanies}" var="company">
					<option value="${company.uid}">${company.name}</option>
				</c:forEach>
			</select>
		</div>
	</div>

	<a href="${pageContext.request.contextPath}/my-account/profile">Go
		to Profile Page</a>
	<br>
	<a href="${pageContext.request.contextPath}/todo">Go
		to To Do Page</a>
	<br>

</template:page>