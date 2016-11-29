<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/addons/storefrontaddon/responsive/template" %>
<%@ taglib prefix="header" tagdir="/WEB-INF/tags/addons/storefrontaddon/responsive/header" %>
<%@ taglib prefix="footer" tagdir="/WEB-INF/tags/addons/storefrontaddon/responsive/footer" %>
<%@ taglib prefix="side" tagdir="/WEB-INF/tags/addons/storefrontaddon/responsive/side" %>
<template:page pageTitle="${pageTitle}">
	<!--=== Wrapper ===-->
	<div id="main_container"> 
		<cms:pageSlot position="TopSearch" var="feature"  >
			<cms:component component="${feature}" />
		</cms:pageSlot> 
		<div class="mainContainer">
			<cms:pageSlot position="SiteNav" var="feature"  >
				<cms:component component="${feature}" />
			</cms:pageSlot>  
					
		  	<!--=== Content Container ===-->
			  <div class="clearfix pT25">
			    <div class="container">
		      	<cms:pageSlot position="CnkBody" var="feature"  >
					<cms:component component="${feature}" />
				</cms:pageSlot> 
		     
				<cms:pageSlot position="CnkSide" var="feature"  >
					<cms:component component="${feature}" />
				</cms:pageSlot> 
			    </div>
			  </div>
			  <!--=== End Content Container ===--> 
		</div>
	  	<cms:pageSlot position="CnkFooter" var="feature"  >
			<cms:component component="${feature}" />
		</cms:pageSlot> 
	  <div id="toTop"></div>
	</div>

	<footer:details/>
	<footer:bottombar/>
	<footer:call/>

	<!-- type of default popup start here-->
	<footer:light1/>

	<footer:email/>
	<footer:chat/>
	
	<!-- Send Request popup start here-->
	<footer:sendreq/>
	<!-- end add product-->
	<footer:success/>

	<footer:addcust/>
	<footer:showcust/>
	
	<div class="black_overlay" id="fade"></div>
	<!-- type of default popup end here--> 
	<!--=== End Wrapper ===--> 

	<template:javaScript/>
		
</template:page>