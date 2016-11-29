<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
<%@ attribute name="pageTitle" required="false" rtexprvalue="true" %>
<%@ attribute name="metaDescription" required="false" %>
<%@ attribute name="metaKeywords" required="false" %>
<%@ attribute name="pageCss" required="false" fragment="true" %>
<%@ attribute name="pageScripts" required="false" fragment="true" %>

<%@ taglib prefix="addonScripts" tagdir="/WEB-INF/tags/desktop/common/header" %>
<%@ taglib prefix="analytics" tagdir="/WEB-INF/tags/shared/analytics" %>
<%@ taglib prefix="generatedVariables" tagdir="/WEB-INF/tags/shared/variables" %>
<%@ taglib prefix="debug" tagdir="/WEB-INF/tags/shared/debug" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="htmlmeta" uri="http://hybris.com/tld/htmlmeta" %>   
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/ezg/template"%>
<!doctype html>
<html>
<head>
<title>Your travel, your way!</title>
<meta charset="utf-8">
<meta name="description" content=""/>
<meta name="keywords" content="" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<!-- <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700' rel='stylesheet' type='text/css' />
 --><link rel="stylesheet" href="${ezgCssPath }/style.css" />
<link rel="stylesheet" href="${ezgCssPath }/chosen.css" />
<link rel="stylesheet" href="${ezgCssPath }/custom.css" />
<link rel="stylesheet" href="${ezgCssPath }/responsive.css" />
<link rel="stylesheet" type="text/css" href="${ezgCssPath }/carousel.css" />
<link rel="stylesheet" type="text/css" href="${ezgCssPath }/multiple-select.css" />
<link rel="stylesheet" type="text/css" href="${ezgCssPath }/jquery-ui.css" />
<link rel="stylesheet" type="text/css" href="${ezgCssPath }/gridder.css" />

<script type="text/javascript" src="${ezgJsPath }/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="${ezgJsPath }/respond.js"></script>
<script type="text/javascript" src="${ezgJsPath }/modernizr.js"></script>
<script type="text/javascript" src="${ezgAddonJsPath}/ractive.min.js"></script>
<script type="text/javascript" src="${ezgAddonJsPath}/ractive.cnk.js"></script>


<style>
  .ui-autocomplete-category {
    font-weight: bold;
    padding: .2em .4em;
    margin: .8em 0 .2em;
    line-height: 1.5;
	background:#ecf0f1;
  }
  .ui-autocomplete { width: 400px; }
  </style>
<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
	<script type="text/javascript">
	var ezgImagesPath = "${ezgImagesPath}";
	</script>
	<analytics:analytics/>
	<generatedVariables:generatedVariables/>
</head>

<body >
    <!--=== Wrapper ===-->
	<div id="main_container"> 
        <!--=== Header ===-->
	  	<cms:pageSlot position="EzgTopHeader" var="feature">
		    <cms:component component="${feature}" />
		</cms:pageSlot>
        <!--=== End Header ===--> 
        
        <!--=== Sticky Navigation Bar ===-->
	  	<cms:pageSlot position="EzgNav" var="feature">
			<cms:component component="${feature}" />
		</cms:pageSlot>
		<cms:pageSlot position="EzgTopNav" var="feature">
			<cms:component component="${feature}" />
		</cms:pageSlot>		
		
		<%-- Inject the page body here --%>
		<jsp:doBody/>
		
		<!--=== Footer ===-->
	  	<cms:pageSlot position="EzgFooter" var="feature">
			<cms:component component="${feature}" />
		</cms:pageSlot>
	    <!--=== End Footer ===--> 
    </div>

	<!--=== Start footer details ===-->
	<cms:pageSlot position="EzgFooterDetails" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<!--=== end footer details ===-->

	<cms:pageSlot position="EzgPanels" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>

	<cms:pageSlot position="EzgAccountOverlay" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	
	<div class="black_overlay" id="fade"></div>
	<div id="toTop"></div>

	<!--=== End Wrapper ===--> 
	<template:javaScript/>

</body>
<!-- 
<debug:debugFooter/>
-->
</html>
