<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="leftPane" class="col-md-2 leftPane panel-collapse">
	<div class="panel-heading titleBold">
		<a class="minLeftPane" data-toggle="collapse" href="#leftPane">Saved
			search </a>
	</div>
	<p></p>
	<ul>
		<c:forEach var="savedQuery" items="${savedQueryList}">
			<li><a
				href="${request.contextPath}/order/saved-query/${savedQuery.code}"><c:out
						value="${savedQuery.name}"></c:out></a></li>
		</c:forEach>
	</ul>

	<%-- <ul>
		<cms:pageSlot position="Section2A" var="feature">
			<cms:component element="li" component="${feature}" />
		</cms:pageSlot>
		<li>asda</li>
	</ul> --%>



</div>

