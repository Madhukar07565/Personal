<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>

<c:url value="/search/" var="searchUrl"/>
<c:url value="/search/autocomplete/${component.uid}" var="autocompleteUrl"/>

<head>

<link rel="stylesheet" type="text/css" media="all" href="${commonResourcePath}/css/orderList.css"/>

</head>


<div class="container">
	<div class="row top-buffer">
	<div class="row">
<div class="col-md-12 col-sm-12 col-xs-12">
	<form name="search_form_${component.uid}" method="get" action="${searchUrl}">
		<div id="custom-search-input">
			<spring:theme code="text.search" var="searchText"/>
			<label class="control-label skip" for="input_${component.uid}">${searchText}</label>
			<div class="input-group col-md-12">
				<spring:theme code="search.placeholder" var="searchPlaceholder"/>
				<ycommerce:testId code="header_search_input">
					<input 
						id="input_${component.uid}" 
						class="form-control input-lg" 
						type="text" 
						name="text"
						value="" 
						maxlength="100" 
						placeholder="${searchPlaceholder}" 
						data-options='{"autocompleteUrl" : "${autocompleteUrl}","minCharactersBeforeRequest" : "${component.minCharactersBeforeRequest}","waitTimeBeforeRequest" : "${component.waitTimeBeforeRequest}","displayProductImages" : ${component.displayProductImages}}'/>
				</ycommerce:testId>
				<ycommerce:testId code="header_search_button">
					<span class="input-group-btn">
					  <button class="btn btn-info btn-lg" type="button">
					  <!-- <button class="ol_buttion" type="button"> -->
                            <i class="glyphicon glyphicon-search"></i>
                      </button>
                    </span>
				</ycommerce:testId>
			</div>
		</div>
	</form>
</div>
</div></div></div>