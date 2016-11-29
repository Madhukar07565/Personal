<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<header class="main-header main-header-md">	
  <div class="container">
	  <div class="row">
		   <div class="container-fluid">
          <div class="row">			  
            <div class="col-sm-12 col-md-8">
              <h3><sec:authorize ifNotGranted="ROLE_ANONYMOUS">
		            <c:set var="maxNumberChars" value="25"/>
					<c:if test="${fn:length(user.firstName) gt maxNumberChars}">
						<c:set target="${user}" property="firstName" value="${fn:substring(user.firstName, 0, maxNumberChars)}..."/>
					</c:if>
		            </sec:authorize>
		              <ycommerce:testId code="header_LoggedUser"><h3><spring:theme code="header.greeting" arguments="${user.firstName},${user.lastName}" htmlEscape="true"/></h3></ycommerce:testId>
		           </h3>
            </div>                          
            </div>
          </div>
        </div>
      </div>
	  </header>

<template:page pageTitle="${pageTitle}">
	<div id="globalMessages">
		<common:globalMessages/>
	</div>
	<cms:pageSlot position="Section1" var="feature">
		<cms:component component="${feature}" element="div" class="span-24 section1 cms_disp-img_slot"/>
	</cms:pageSlot>
	<div class="span-24 section2">
		<cms:pageSlot position="Section2A" var="feature" element="div" class="span-4 zone_a cms_disp-img_slot">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
		<cms:pageSlot position="Section2B" var="feature" element="div" class="span-20 zone_b last">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
	</div>
	<cms:pageSlot position="Section3" var="feature" element="div" class="span-24 section3 cms_disp-img_slot">
		<cms:component component="${feature}"/>
	</cms:pageSlot>
	<!-- <a href="bookingDetailsPage">Get Booking Details</a> -->
	
	<!-- <div class="container">
	<div class="row top-buffer">
	
	<div class="row">		
		<div class="col-md-12 col-sm-12 col-xs-12">		
			<table class="table table-striped">
  <thead>
    <tr>
      <th><b>#</b></th>
      <th><b>Date and Time</b></th>
      <th><b>Reference number</b></th>
      <th colspan="5"><b>Client Details</b></th>		
	<th><b>Company Details</b></th><th><b>Assign</b></th>		
    </tr>
  </thead>
				<thead>
    <tr>
      <th></th>
		<th></th>
		<th></th>
      <th><b>Name</b></th>
      <th><b>Type</b></th>
      <th><b>Category</b></th>
		<th><b>Sub category</b></th>
	<th><b>Point of sale</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>15/06/2015 10:30</td>
		<td><a href="bookingDetailsPage">EZR-123456</a></td>
      <td>AKG Global</td>
		<td>B2C</td>
<td>Travel Agent</td>
		<td>TA</td>
<td>Website</td>
<td>EZeego 1 Market - India SBU/BU</td>
		<td>Tom Jones</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>15/03/2015 10:30</td>
		<td><a href="bookingDetailsPage">EZR-0887696</a></td>
      <td>Trident Travel</td>
		<td>-</td>
<td>Travel Agent</td>	
		<td>TA</td>
<td>Website</td>
<td>EZeego 1 Market - India SBU/BU</td>
<td>-</td>		
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>11/06/2015 10:30</td>
      <td><a href="bookingDetailsPage">EZR-308483</a></td>
      <td>View Tours</td>
<td>B2C</td>
<td>-</td>
		<td>-</td>
<td>Website</td>
<td>EZeego 1 Market - India SBU/BU</td>
<td>-</td>		
    </tr>
  </tbody>
</table>
		</div>
	</div>
	
	</div></div>
	
	<br><br><br><hr>
	 -->
	
	<%--  <c:forEach items="${orderList}" var="order">
		<c:out value="${order.created}"/>&nbsp &nbsp &nbsp <c:out value="${order.code}"/><hr>
	</c:forEach> --%>
	
	<!--Displaying Orders according to the HTML template  -->
	
	<div class="container">
	<div class="row top-buffer">
	
	<div class="row">		
		<div class="col-md-12 col-sm-12 col-xs-12">		
			<table class="table table-striped">
  <thead>
  <tr>
      <th><b>#</b></th>
      <th><b>Date and Time</b></th>
      <th><b>Reference number</b></th>
      <th colspan="5"><b>Client Details</b></th>		
	<th><b>Company Details</b></th><th><b>Assign</b></th>		
    </tr>
  </thead>
  <thead>
    <tr>
      <th></th>
		<th></th>
		<th></th>
      <th><b>Name</b></th>
      <th><b>Type</b></th>
      <th><b>Category</b></th>
		<th><b>Sub category</b></th>
	<th><b>Point of sale</b></th>
    </tr>
  </thead>
  
  <tbody>
  <c:forEach items="${orderList}" var="order">
    <tr>
      <th scope="row">1</th>
      <td><c:out value="${order.created}"/></td>
		<td><a href="${pageContext.request.contextPath}/bookingDetailsPage"><c:out value="${order.code}"/></a></td>
      <td>AKG Global</td>
		<td>B2C</td>
<td>Travel Agent</td>
		<td>TA</td>
<td>Website</td>
<td>EZeego 1 Market - India SBU/BU</td>
		<td>Tom Jones</td>
    </tr>
    </c:forEach>
  </tbody>
  
</table>
</div></div>
	
	</div></div>
	
	
	
</template:page>