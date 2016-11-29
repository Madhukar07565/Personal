<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>

<%-- <c:if test="${requestScope.captcaEnabledForCurrentStore}"> --%>
	<div id="paymentgateways_widget" style="display:none">

			<c:forEach items="${paymentGatewaysList}" var="paymentGateway">
					<INPUT TYPE="radio" NAME="${paymentGateway}" VALUE="${paymentGateway}">A
			</c:forEach>	

	</div>
<%-- </c:if>
 --%>