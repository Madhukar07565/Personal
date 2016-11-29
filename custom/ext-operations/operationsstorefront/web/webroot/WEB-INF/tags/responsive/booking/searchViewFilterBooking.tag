<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true"%>
<%@ attribute name="pageTitle" required="false" rtexprvalue="true"%>
<%@ attribute name="pageCss" required="false" fragment="true"%>
<%@ attribute name="pageScripts" required="false" fragment="true"%>
<%@ attribute name="hideHeaderLinks" required="false"%>

<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="header"
	tagdir="/WEB-INF/tags/responsive/common/header"%>
<%@ taglib prefix="footer"
	tagdir="/WEB-INF/tags/responsive/common/footer"%>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/cart"%>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/responsive/nav"%>
<%@ taglib prefix="booking" tagdir="/WEB-INF/tags/responsive/booking"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<c:url value="/order/searchResult" var="searchResultUrl" />

<article>
	<div class="main">
		<div class="container">
			<h1>
				Booking<span> Search Filter</span>
			</h1>
			<div class="panel panel-default">
				<div class="panel-heading top-radius">Search</div>
				<div class="panel-body landingPage">
					<booking:leftPane />
					<a class="saved-search-arrow"><i
						class="glyphicon glyphicon-menu-left glyphicon-menu-right"></i></a>
					<booking:rightPane/>
				</div>
				<div class="panel-heading titleBold">Search Result</div>
				<booking:searchResult/>
			</div>
		</div>
	</div>
</article>