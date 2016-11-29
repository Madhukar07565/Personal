<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>

<%@ attribute name="travelerTitle" required="true" type="java.lang.String"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="flight"
	tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/flight"%>

<c:set var="titles" value="${titleData }" />

<select name="travelerTitle">
	<c:forEach items="${titles }" var="title">
		<option value="${title.code }" <c:if test="${title.code eq travelerTitle }">selected</c:if> >${title.name }</option>
	</c:forEach>
</select>