<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/ezg/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common" %>

<template:page pageTitle="${pageTitle}">

<div id="globalMessages">
  <common:globalMessages/>
</div>

<section class="container" style="min-height:350px">
  <div class="row col_6 col_sm_12">   
    <cms:pageSlot position="MesContent" var="feature">
      <cms:component component="${feature}"/>
    </cms:pageSlot>   

    <cms:pageSlot position="PwdContent" var="feature">
      <cms:component component="${feature}"/>
    </cms:pageSlot>
  </div>
</section>

</template:page>
  

