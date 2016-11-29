<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
<%@ attribute name="pageTitle" required="false" rtexprvalue="true" %>
<%@ attribute name="pageCss" required="false" fragment="true" %>
<%@ attribute name="pageScripts" required="false" fragment="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="spheader" tagdir="/WEB-INF/tags/addons/operationssecureportaladdon/desktop/common/spheader" %>
<%@ taglib prefix="footer" tagdir="/WEB-INF/tags/desktop/common/footer" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common" %>

<spring:htmlEscape defaultHtmlEscape="true"/>
<template:master pageTitle="${pageTitle}">
    <jsp:attribute name="pageCss">
        <jsp:invoke fragment="pageCss"/>
    </jsp:attribute>

    <jsp:attribute name="pageScripts">
        <jsp:invoke fragment="pageScripts"/>
    </jsp:attribute>

    <jsp:body>
        
        <a id="skip-to-content"></a>
        <div class="container">
        	<spheader:header/>
            <common:globalMessages/>
            <jsp:doBody/>
         </div>
         <%-- <footer:footer/> --%>
    </jsp:body>
</template:master>
