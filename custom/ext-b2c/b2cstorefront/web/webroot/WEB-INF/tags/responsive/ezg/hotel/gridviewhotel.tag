<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="hotel" tagdir="/WEB-INF/tags/responsive/ezg/hotel"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<div id="viewContr1">
	<input type="hidden" id="widgetAndFacetSearchJson" value="${fn:escapeXml(querys)}" />
	<section class="gridder">
		<c:set var="viewType" value="grid" scope="request"> </c:set>
		<hotel:recommendedhotel/>
		<hotel:sortedby/>
		<hotel:resulthotel/>
	</section>
</div>
