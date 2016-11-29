<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<template:page pageTitle="${pageTitle}">
	<div id="globalMessages">
		<common:globalMessages/>
	</div>

	<cms:pageSlot position="Section1" var="feature">
		<cms:component component="${feature}" element="div" class="span-24 section1 cms_disp-img_slot"/>
	</cms:pageSlot>
	<header class="main-header main-header-md">
		<div class="container">
		  <div class="row">
			   <div class="container-fluid">
	          	<div class="row">			  
		            <div class="col-sm-12 col-md-8">
		            <sec:authorize ifNotGranted="ROLE_ANONYMOUS">
		            <c:set var="maxNumberChars" value="25"/>
					<c:if test="${fn:length(user.firstName) gt maxNumberChars}">
						<c:set target="${user}" property="firstName" value="${fn:substring(user.firstName, 0, maxNumberChars)}..."/>
					</c:if>
		            </sec:authorize>
		              <h3><ycommerce:testId code="header_LoggedUser"><spring:theme code="header.greeting" arguments="${user.firstName},${user.lastName}" htmlEscape="true"/></ycommerce:testId></h3>
		            </div>                          
	            </div>
	          </div>
	       </div>
      </div>
	 </header>
	<div class="container">
		<div class="row">
			<cms:pageSlot position="Section2A" var="feature" element="div" class="col-md-3 col-sm-4 col-xs-6">
				<div class="dummy"></div>
				<cms:component component="${feature}" />
			</cms:pageSlot>
	
			<cms:pageSlot position="Section2B" var="feature" element="div" class="col-md-3 col-sm-4 col-xs-6">
				<div class="dummy"></div>
				<cms:component component="${feature}" />
			</cms:pageSlot>
	
			<cms:pageSlot position="Section2C" var="feature" element="div" class="col-md-3 col-sm-4 col-xs-6">
				<div class="dummy"></div>
				<cms:component component="${feature}" element="div"/>
			</cms:pageSlot>
		</div>
	</div>
<a href="https://operations.local:9002/operationsstorefront/operations/en/my-account/profile">Go to Profile Page</a>
	<cms:pageSlot position="Section3" var="feature" element="div" class="span-24 section3 cms_disp-img_slot">
		<cms:component component="${feature}" />
	</cms:pageSlot>

	<cms:pageSlot position="Section4" var="feature" element="div" class="span-24">
		<cms:component component="${feature}" element="div" class="span-6 section4 small_detail ${(elementPos%4 == 3) ? 'last' : ''}"/>
	</cms:pageSlot>

	<cms:pageSlot position="Section5" var="feature" element="div" class="span-24 section5 cms_disp-img_slot">
		<cms:component component="${feature}" />
	</cms:pageSlot>

</template:page>