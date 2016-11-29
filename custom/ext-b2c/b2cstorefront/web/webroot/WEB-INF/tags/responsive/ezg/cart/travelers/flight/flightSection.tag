<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="flight"
	tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/flight"%>

<div class="inrContr clearfix posR mB20">

	<!-- Sub Header -->
	<div class="clearfix shopCardHrdr ">
		<h5 class="fL">Flights</h5>
		<img src="${ezgImagesPath }/common/collapse.png" alt="Arrow" class="fR mT5">
	</div>
	<c:if test="${not empty flightGroupInfoList }">
		<div class="shopCardContr dN">
			<p class="txtClrRed pR10 tR">Price has changed based on system availability</p>
			<input type ="hidden" id="flightInfoJson" value ='${flightInfoJson}'/>
			<c:forEach items="${flightGroupInfoList}" var="flightGroup">
				<c:forEach items="${flightGroup.entries}" var="flightInfo" varStatus="status">
					<flight:flightSummary flightOrderEntry="${flightInfo}" index="${status.count}" />
					<flight:flightDetails flightOrderEntry="${flightInfo}" index="${status.count}"/>
				</c:forEach>
				<flight:flightTerms />
				<flight:flightTravelers orderEntryData="${flightGroup}" />
				<flight:flightCrossSellings />
			</c:forEach>
		</div>
	</c:if>
</div>