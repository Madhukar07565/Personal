<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
<%@ attribute name="pageTitle" required="false" rtexprvalue="true" %>
<%@ attribute name="metaDescription" required="false" %>
<%@ attribute name="metaKeywords" required="false" %>
<%@ attribute name="pageCss" required="false" fragment="true" %>
<%@ attribute name="pageScripts" required="false" fragment="true" %>

<%@ taglib prefix="template" tagdir="/WEB-INF/tags/addons/storefrontaddon/responsive/template" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="htmlmeta" uri="http://hybris.com/tld/htmlmeta" %>   
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Cox & Kings</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body >
	<template:javaScript/>
	<div id="main_container"> 
		 <cms:pageSlot position="TopHeader" var="feature">
			<cms:component component="${feature}" />
		</cms:pageSlot> 
		<div class="mainContainer">
			 <cms:pageSlot position="SiteNav" var="feature"  >
				<cms:component component="${feature}" />
			</cms:pageSlot>
			<%-- Inject the page body here --%>
			<jsp:doBody/>
		</div>
	 	<cms:pageSlot position="Footer" var="feature">
			<cms:component component="${feature}" />
		</cms:pageSlot>
 	</div>
	<template:styleSheet/>
</body>
</html>
