<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="col-md-2" id="savedSearch">
	<div class="panel panel-default row">
		<div class="panel-heading">
			<a class="minLeftPane panel-title" data-toggle="collapse"
				href="#leftPane">Saved search</a>
		</div>
		<div class="panel-body">
			<!-- <ul>
				<li><a href="#">link 1</a></li>
				<li><a href="#">link 2</a></li>
				<li><a href="#">link 3</a></li>
				<li>asda</li>
			</ul> -->
			<ul>
				<c:forEach var="savedQuery" items="${savedQueryList}">
					<li><a href="${request.contextPath}/order/saved-query/${savedQuery.code}"><c:out value="${savedQuery.name}"></c:out></a></li>
				</c:forEach>
			</ul>
		</div>
	</div>
</div>

<%-- <ul>		
<c:forEach var="savedQuery" items="${savedQueryList}">
	<li><a href="#"><c:out value="${savedQuery.code}"></c:out></a></li>
</c:forEach>
</ul> --%>