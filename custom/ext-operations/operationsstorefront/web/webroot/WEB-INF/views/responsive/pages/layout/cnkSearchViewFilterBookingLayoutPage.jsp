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

<%@ taglib prefix="orderList" tagdir="/WEB-INF/tags/responsive/orderList"%>
<%@ taglib prefix="booking" tagdir="/WEB-INF/tags/responsive/booking"%>
<c:url value="/order/searchResult" var="searchResultUrl" />

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE = edge">
	<meta name="viewport" content="width = device-width, initial-scale=1">
	<title>Search and View Filter Booking</title>
</head>

<template:page pageTitle="${pageTitle}">

	 <%-- <orderList:headerContent/> --%> 
	 <booking:headerContent/>
	
	<div id="globalMessages">
		<common:globalMessages />
	</div>
	
	<cms:pageSlot position="Section1" var="feature">
		<cms:component component="${feature}" element="div"
			class="span-24 section1 cms_disp-img_slot" />
	</cms:pageSlot>
	
	<%-- <orderList:searchViewPage/> --%>
	 <booking:searchViewFilterBooking/>
	
	<cms:pageSlot position="Section3" var="feature" 
		class="span-24 section3 cms_disp-img_slot">
		<cms:component component="${feature}" />
	</cms:pageSlot>

</template:page>

