<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/ezg/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<template:page>
<!--=== Wrapper ===-->

	<cms:pageSlot position="GlobalSearch" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
  <!--=== Sticky Navigation Bar ===-->
  <div class="content_container"> 
    <!--=== Start Banner ===-->
    <cms:pageSlot position="Banner" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
    
    <!--=== End Banner ===--> 
    <div class="clearfix"></div>
    <!--=== Start Deals for travellers ===-->
    <cms:pageSlot position="Deal" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
    <!--=== End Deals for travellers ===--> 
    <!--=== Start Popular routes for people (flight) ===-->
    <cms:pageSlot position="PopularRoutesFlight" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
    
    <!--=== End Popular routes for people (flight) ===--> 
	<!--=== Start Popular routes for people (bus) ===-->
    <cms:pageSlot position="PopularRoutesBus" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
    
    <!--=== End Popular routes for people (bus) ===-->
	<!--=== Start Popular routes for people (Cars) ===-->
    <cms:pageSlot position="PopularRoutesCar" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
    
    <!--=== End Popular routes for people (Cars) ===-->
	<!--=== Start Popular routes for people (Rail) ===-->
    <cms:pageSlot position="PopularRoutesRail" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
    
    <!--=== End Popular routes for people(Rail) ===-->
	<!--=== Start Popular routes for people (Cruise) ===-->
    <cms:pageSlot position="PopularRoutesCruise" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
    
    <!--=== End Popular routes for people (Cruise) ===-->
	<!--=== Start Popular routes for people (Forex) ===-->
   <cms:pageSlot position="PopularRoutesForex" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
    
  
  <!--=== End Popular routes for people(Forex) ===-->
	
	<!--=== Start Popular routes for people (Insurance) ===-->
     <cms:pageSlot position="PopularRoutesInsurance" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
    
    <!--=== End Popular routes for people(Insurance) ===--> 
	<!--=== Start Popular routes for people (Visa) ===-->
     <cms:pageSlot position="PopularRoutesVisa" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
    
    
    <!--=== End Popular routes for people(Visa) ===-->
	<!--=== Start Popular routes for people (Flight + Hotel) ===-->
     <cms:pageSlot position="PopularRoutesFlightHotel" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
    
 
  
  <!--=== End Popular routes for people (Flight + Hotel) ===--> 
  <!--=== Start Popular routes for people (Holidays) ===-->
    <cms:pageSlot position="PopularRoutesHoliday" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
    
    
    <!--=== End Popular routes for people (Holidays) ===--> 
	<!--=== Start Popular routes for people (Activities) ===-->
    <cms:pageSlot position="PopularRoutesActivity" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
    
    <!--=== End Popular routes for people (Activities) ===-->
    <!--=== Start Discover holiday ===-->
     <cms:pageSlot position="DiscoverHoliday" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
    <!--=== End Discover holiday ===--> 
    <!--=== Start kind of traveller ===-->
    <cms:pageSlot position="TravellerType" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
    <!--=== End kind of traveller ===--> 
    <!--=== Start not sure ===-->
     <cms:pageSlot position="NotSure" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
    <!--=== End not sure ===--> 
    <!--=== Start Advertisement ===-->
    <cms:pageSlot position="Advertisement" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
    <!--=== End Advertisement ===--> 
  </div>
  <!--=== End Content Container ===--> 
  
  
</template:page>