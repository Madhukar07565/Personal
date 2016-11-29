<%@ page trimDirectiveWhitespaces="true" contentType="application/json" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

{ "products": {
<c:forEach items="${products}" var="map" varStatus="mapStatus">
		"${map.key}": "${map.value}" <c:if test="${not mapStatus.last}">,</c:if>
</c:forEach>
}, "error" : "${toDoError}" }
