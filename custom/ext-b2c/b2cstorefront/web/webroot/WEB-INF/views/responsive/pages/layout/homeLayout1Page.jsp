<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template/cnk"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<template:page pageTitle="${pageTitle}">
		
		<div class="mainContainer">
		 	<div id="banner"> 
	      		<cms:pageSlot position="Slide" var="feature">
					<cms:component component="${feature}" />
				</cms:pageSlot>
				
				<cms:pageSlot position="SiteNav" var="feature">
					<cms:component component="${feature}" />
				</cms:pageSlot>  
				
				<cms:pageSlot position="Search" var="feature">
					<cms:component component="${feature}" />
				</cms:pageSlot>
    		</div>
			<cms:pageSlot position="Content" var="feature">
				<cms:component component="${feature}" />
			</cms:pageSlot>
		</div>
		
	
	
	<%-- <cms:pageSlot position="login" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	
	<cms:pageSlot position="forgetPass" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	
	<cms:pageSlot position="signup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	
	<cms:pageSlot position="signupSuccess" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	
	<cms:pageSlot position="meals" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	
	<cms:pageSlot position="forgetPassSuccess" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	
	<cms:pageSlot position="learn" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot> --%>
	
	<template:javaScript/>
		
</template:page>