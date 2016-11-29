<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="hotel" tagdir="/WEB-INF/tags/responsive/ezg/hotel"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="viewContr2" class="dN clearfix">
	<section class="clearfix">
		<c:set var="viewType" value="list" scope="request"> </c:set>
		<hotel:recommendedhotel/>
		<hotel:sortedby/>
		<hotel:resulthotel/>
	</section>
</div>