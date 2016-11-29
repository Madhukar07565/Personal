<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true"%>
<%@ attribute name="pageTitle" required="false" rtexprvalue="true"%>
<%@ attribute name="pageCss" required="false" fragment="true"%>
<%@ attribute name="pageScripts" required="false" fragment="true"%>
<%@ attribute name="hideHeaderLinks" required="false"%>

<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="header" tagdir="/WEB-INF/tags/responsive/common/header"%>
<%@ taglib prefix="footer" tagdir="/WEB-INF/tags/responsive/common/footer"%>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/cart"%>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/responsive/nav"%>
<%@ taglib prefix="orderList" tagdir="/WEB-INF/tags/responsive/orderList"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
<title>Search and View Filter Booking</title>
<link rel="stylesheet" type="text/css" media="all"
	href="${commonResourcePath}/css/searchViewBooking.css" />
</head>

<c:url value="/order/searchResult" var="searchResultUrl" />

<div class="panel">
	<div class="container-fluid marginspacing">
		<div class="row contentText">
		<orderList:leftPane/>
		 <orderList:midPane/>
		<%-- <orderList:searchFormPage action="${searchResultUrl}"/> --%>
		<orderList:rightPane action="${saveQueryAction}"/>
		</div>
		<orderList:searchResult orderList="${orderList}" />
	</div>
</div>
<c:forEach var="orderData" items="${orderDataList}">
		<b>Code : <c:out value="${orderData.code}"/></b>
</c:forEach><br>