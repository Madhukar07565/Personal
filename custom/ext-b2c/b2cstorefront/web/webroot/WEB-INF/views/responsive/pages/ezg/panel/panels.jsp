<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/cart"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="list" uri="/WEB-INF/common/tld/list.tld" %>

<!--=== Top Deals start here ===-->

<!--=== Top Deals end here ===-->

<div class="white_content posF  popupplay" id="Learn"
	style="padding-top: 20px; padding-bottom: 20px; height: 100%">
	<div class="white_content_inner w45pcnt col_sm_12 clearfix"
		id="learninner">
		<div class="closeBtn_popup fR" onclick="popupclose('Learn', 'fade')"></div>
		<p>Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet Lorem
			ipsum dolor sit amet Lorem ipsum dolor sit amet Lorem ipsum dolor sit
			amet Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet</p>
	</div>
</div>
<!-- type of traveller popup start here-->
<div class="white_content posF dN popupplay" id="traveller_type">
		<div class="white_content_inner clearfix container" id="traveller_typeinner">
		<div class="closeBtn_popup fR" onclick="popupclose('traveller_type', 'fade')"></div>
		<h2>What type of traveller are you?</h2>
		<form:form action="${encodedContextPath}" method="get">
		<div class="clearfix">
			<c:forEach var="type" varStatus="status" items="${travellerType}">
				<c:if test="${status.index % 3 == 0}">
					<div class="col_4">
				</c:if>
				<div class="mB5">
					<input type="checkbox" name="travellerType" id="${type.code}"
						value="${type.code}"  <c:if test='${list:contains(selectedType, type)}'>checked="checked"</c:if>/> <label for="${type.code}">${type.name}</label>
				</div>
				<c:if test="${status.index % 3 == 2}">
					</div>
				</c:if>
			</c:forEach>
		</div>
		<div class="tC mT20">
			<input type="submit" class="button button-primary button-large" value="GO"/>
		</div>
		</form:form>
	</div>
</div>
<!--=== Start Show holiday panel ===-->
<div id="show_holiday_panel" style="display: none;">
	<div class="container">
		<div class="show_holiday_inner clearfix">
			<div class="fL mR15 thumbHolder" id="thumb1"></div>
			<a href="javascript:void(0);"
				class="button button-primary button-large dB mT20 fL mL10">Show
				holidays</a>
		</div>
	</div>
	<a href="javascript:void(0);" onclick="hide_div()"><span
		class="close_thumbnail_grey m0"></span></a>
</div>
<!--=== End Show holiday panel ===-->



<!--=== Shopping cart panel ===-->
<sec:authorize access="hasRole('ROLE_CUSTOMERGROUP')">
	<div id="shopping_cart_panel" style="display: none;">
		<cms:pageSlot position="MiniCart" var="feature">
			<cms:component component="${feature}" />
		</cms:pageSlot>
	</div>
</sec:authorize>
<!--=== End Shopping cart panel===-->
