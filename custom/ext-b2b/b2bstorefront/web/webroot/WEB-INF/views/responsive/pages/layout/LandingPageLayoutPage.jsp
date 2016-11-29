<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/ezg/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<link rel="stylesheet" type="text/css" href="${ezgCssPath }/landingPage.css" />


<template:page>
	<!--=== Content Container ===-->
	<div id="content_container" class="clearfix">
		<div class="container">
			<ul class="brCrmb">
				<li><a href="javascript:void(0);">Products</a></li>
				<li class="last">Flights</li>
			</ul>
			<br class="cB">
			<h1>Flights</h1>
			<cms:pageSlot position="CustomerDetails" var="feature">
				<cms:component component="${feature}" />
			</cms:pageSlot>

			<cms:pageSlot position="TopDealDetails" var="feature">
				<cms:component component="${feature}" />
			</cms:pageSlot>

			<cms:pageSlot position="PromotionDetails" var="feature">
				<cms:component component="${feature}" />
			</cms:pageSlot>
			
			<cms:pageSlot position="FlightAndHotelDeal" var="feature">
				<cms:component component="${feature}" />
			</cms:pageSlot>
		</div>
	</div>
	<!--=== End Content Container ===-->
	
</template:page>

<script type="text/javascript" src="${ezgJsPath}/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="${ezgJsPath}/jquery-ui.min.js"></script>
<script type="text/javascript" src="${ezgJsPath}/jquery.validate.min.js"></script>
<script type="text/javascript" src="${ezgJsPath}/jquery.serializejson.min.js"></script>
<script type="text/javascript" src="${ezgJsPath}/landingPage.validate.js"></script>

<script type="text/javascript" src="${ezgJsPath}/landingPage.js"></script>