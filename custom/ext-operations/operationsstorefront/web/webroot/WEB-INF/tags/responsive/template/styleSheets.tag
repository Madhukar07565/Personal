<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="cms" tagdir="/WEB-INF/tags/responsive/template/cms" %>

<link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic" />
<c:choose>
	<c:when test="${wro4jEnabled}">
		<link rel="stylesheet" type="text/css" media="all" href="${contextPath}/wro/all_responsive.css" />
		<link rel="stylesheet" type="text/css" media="all" href="${contextPath}/wro/${themeName}_responsive.css" />
		<link rel="stylesheet" type="text/css" media="all" href="${contextPath}/wro/addons_responsive.css" />
	 </c:when>
	<c:otherwise> 
	
		<%-- Theme CSS files --%>
<%-- 		<link rel="stylesheet" type="text/css" media="all" href="${themeResourcePath}/css/style.css"/> --%>
		<%--  AddOn Common CSS files --%>
		
		<!-- start cnk css files -->
		<!-- Bootstrap core CSS -->
   		<link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css'>
   		
    	<%-- Theme cnk files --%>
<%-- 		<link rel="stylesheet" type="text/css" media="all" href="${themeResourcePath}/css/style.css"/> --%>
		
		<!-- Custom styles for this template -->
   		<link rel="stylesheet" type="text/css" media="all" href="${commonResourcePath}/css/home.css"/>
   		
   		<!-- Custom styles for this template Commented by Saood-->
   		<%-- <link rel="stylesheet" type="text/css" media="all" href="${commonResourcePath}/css/signin.css"/> --%>
   		
   		<link rel="stylesheet" type="text/css" media="all" href="${commonResourcePath}/css/booking.css"/>
<%-- 		<link rel="stylesheet" type="text/css" media="all" href="${commonResourcePath}/css/cnkToDo.css"/> --%>
		<link rel="stylesheet" type="text/css" media="all" href="${commonResourcePath}/css/cnk.css"/>
		<link rel="stylesheet" type="text/css" media="all" href="${commonResourcePath}/css/slick.css"/>
		<link rel="stylesheet" type="text/css" media="all" href="${commonResourcePath}/css/font-awesome.min.css"/>
		<link rel="stylesheet" type="text/css" media="all" href="${commonResourcePath}/css/font-awesome.min.css"/>
		
   		
   		
		<!-- end cnk css files -->
		
		<c:forEach items="${addOnCommonCssPaths}" var="addOnCommonCss">
			<link rel="stylesheet" type="text/css" media="all" href="${addOnCommonCss}"/>
		</c:forEach>
	 </c:otherwise>
</c:choose> 

<%--  AddOn Theme CSS files --%>
<c:forEach items="${addOnThemeCssPaths}" var="addOnThemeCss">
	<link rel="stylesheet" type="text/css" media="all" href="${addOnThemeCss}"/>
</c:forEach>

<%-- <link rel="stylesheet" href="${commonResourcePath}/blueprint/print.css" type="text/css" media="print" /> 
<style type="text/css" media="print">
	@IMPORT url("${commonResourcePath}/blueprint/print.css");
</style>
 --%>

<cms:previewCSS cmsPageRequestContextData="${cmsPageRequestContextData}" />
