<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/ezg/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<template:page pageTitle="${pageTitle}">
	<div class="container clearfix mT20"> 
		<!-- BredCrumb Nav begins here -->
    	<div class="clearfix mB10"><img src="${ezgImagesPath}/custom/settings.png" width="24" height="24" alt="" /><span class="fS22 fW500 mL5"> Settings</span> </div>
    	<!-- Travel container begins here-->
    	<div id="travel" class="mB80"> 
      
		    <!-- DIY container begins here -->
		    <div class="diyContr">
		    <form:form id="settingsForm">
		    	<cms:pageSlot position="Section1" var="feature">
					<cms:component component="${feature}" />
				</cms:pageSlot>
				<cms:pageSlot position="Section2" var="feature">
					<cms:component component="${feature}" />
				</cms:pageSlot>
				<cms:pageSlot position="Section3" var="feature">
					<cms:component component="${feature}" />
				</cms:pageSlot>
				<cms:pageSlot position="Section4" var="feature">
					<cms:component component="${feature}" />
				</cms:pageSlot>
				</form:form>
				<cms:pageSlot position="Section5" var="feature">
					<cms:component component="${feature}" />
				</cms:pageSlot>
		    </div>
	    </div>
	</div>

<script type="text/javascript">
	var ezgImagePath='${ezgImagesPath}';
</script>


</template:page>