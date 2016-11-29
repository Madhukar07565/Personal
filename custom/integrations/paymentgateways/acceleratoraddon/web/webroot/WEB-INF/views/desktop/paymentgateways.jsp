<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="${contextPath}/_ui/addons/paymentgateways/responsive/common/js/paymentgateways.js"></script>
<title>Payments Gateways Page</title>
</head>
<body>
payment gateway list page
<div id="paymentprovidersList">
<ul>
<c:forEach items="${paymentGatewaysMap}" var="paymentGateway">
<li>
<input type="radio" id="paymentprovider_id" name="paymentprovidersList" value="${paymentGateway.value}" onclick="redirectToPaymentProviderAjax('${paymentGateway.value}')"/>
<label>
${paymentGateway.key}
</label>       
</li>
</c:forEach>
</ul>
</div>
<div id='paymentsubmitform' class='paymentsubmitformclass'>
</div>
	
</body>
</html>