<%@ page trimDirectiveWhitespaces="true"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>

<c:url value="/search/" var="searchUrl" />
<c:url value="/search/autocomplete/${component.uid}"
	var="autocompleteUrl" />
<c:if test="${component.pageType !='HOMEPAGE' }">
	<div class="input-group">
		<spring:theme code="search.placeholder" var="searchPlaceholder" />
		<ycommerce:testId code="header_search_input">
			<input type="text" value="{{${autoSuggestKeypathName}}}"
				class="js-site-search-input-ezg ${component.cssStyle}" name="text"
				maxlength="100" placeholder="${searchPlaceholder}"
				data-options='{"autocompleteUrl" : "${autocompleteUrl}",
							   "minCharactersBeforeRequest" : "${component.minCharactersBeforeRequest}",
							   "waitTimeBeforeRequest" : "${component.waitTimeBeforeRequest}",
							   "displayProductImages" : ${component.displayProductImages}}'>
			<c:if test="${component.showSearchIcon}">
				<div class="search search_l9" style="cursor:pointer" on-click="submitForm()"></div>
			</c:if>
		</ycommerce:testId>
	</div>
	<c:set var="autoSuggestKeypathName" value="" />
</c:if>
<c:if test="${component.pageType =='HOMEPAGE' }">
	<div class="col_3">
		<div class="input-group">
			<input type="text" class="js-site-search-input-ezg fL" name="text" 
				maxlength="100"
				placeholder="${component.searchPlaceholder}"
				data-options='{"autocompleteUrl" : "${autocompleteUrl}",
							   "minCharactersBeforeRequest" : "${component.minCharactersBeforeRequest}",
							   "waitTimeBeforeRequest" : "${component.waitTimeBeforeRequest}",
							   "displayProductImages" : ${component.displayProductImages}}'>
		</div>
		<c:if test="${component.showSearchIcon}">
		<div class="search search_l4"></div>
		</c:if>
	</div>
</c:if>
<style>
.search_l4 {
	left: 40%;
	cursor: pointer;
}
.search_l9 {
	left: 90%;
	cursor: pointer;
}
</style>