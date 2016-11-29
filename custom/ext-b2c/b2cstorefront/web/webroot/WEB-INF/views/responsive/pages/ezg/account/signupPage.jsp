<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/ezg/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common" %>


<template:page pageTitle="${pageTitle}">
    <!-- Dots navigation begins -->
	<nav id="slidesNavigator">
	    <ul>
	      <li>
	        <p>Discover</p>
	        <a class="screen1" href="#screen1">View</a> </li>
	      <li>
	        <p>Customise</p>
	        <a class="screen2" href="#screen2">View</a> </li>
	      <li>
	        <p>Create</p>
	        <a class="screen3" href="#screen3">View</a> </li>
	      <li>
	        <p>Share</p>
	        <a class="screen4" href="#screen4">View</a> </li>
	      <li>
	        <p>Manage</p>
	        <a class="screen5" href="#screen5">View</a> </li>
	      <li>
	        <p>ezeego1</p>
	        <a class="screen6" href="#screen6">View</a> </li>
	    </ul>
	</nav>
    <!-- Dots navigation ends -->

    <!-- Vertical Slideshow begins -->	
	<section id="screen1" class="slideHolder">
	    <cms:pageSlot position="Section1" var="feature">
	        <cms:component component="${feature}" />
	    </cms:pageSlot>
	</section>
	
	<section id="screen2" class="slideHolder">
	    <cms:pageSlot position="Section2" var="feature">
	        <cms:component component="${feature}" />
	    </cms:pageSlot>
	</section>

    <section id="screen3" class="slideHolder">
	    <cms:pageSlot position="Section3" var="feature">
	        <cms:component component="${feature}" />
	    </cms:pageSlot>	
    </section>

    <section id="screen4" class="slideHolder">
        <cms:pageSlot position="Section4" var="feature">
            <cms:component component="${feature}" />
        </cms:pageSlot>
    </section>

    <section id="screen5" class="slideHolder">
        <cms:pageSlot position="Section5" var="feature">
            <cms:component component="${feature}" />
        </cms:pageSlot>
    </section>

    <section id="screen6" class="slideHolder">
        <cms:pageSlot position="Section6" var="feature">
            <cms:component component="${feature}" />
        </cms:pageSlot>
    </section>
    
    <!-- Vertical Slideshow ends -->
    <div class="cB"></div>
    <script>
    $(document).ready(function() {
    	ACC.parallax.onParalaxLoad();
    });
    </script>
</template:page>