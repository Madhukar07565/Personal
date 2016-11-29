<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form id="hostedOrderPagePostForm" name="hostedOrderPagePostForm" action="${hostedOrderPageData.postUrl}" method="POST">
	<div id="postFormItems">
		<dl>
			<c:forEach items="${hostedOrderPageData.parameters}" var="entry" varStatus="status">
				<c:choose>
					<c:when test="${hopDebugMode}">
						<dt><label for="${entry.key}" class="required"><c:out value="${entry.key}"/></label></dt>
						<dd><input type="text" id="${entry.key}" name="${entry.key}" value="${entry.value}" tabindex="${status.count + 1}"/></dd>
					</c:when>
					<c:otherwise>
						<input type="hidden" id="${entry.key}" name="${entry.key}" value="${entry.value}" />
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</dl>
	</div>
	<c:if test="${hopDebugMode}">
		<div class="rightcol">
			<spring:theme code="checkout.multi.hostedOrderPostPage.button.submit" var="submitButtonLabel"/>
			<input id="button.submit" class="submitButtonText" type="submit" title="${submitButtonLabel}" value="${submitButtonLabel}"/>
		</div>
	</c:if>
</form>
