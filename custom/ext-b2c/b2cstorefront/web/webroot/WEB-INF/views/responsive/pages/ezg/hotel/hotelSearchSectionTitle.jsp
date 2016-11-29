<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- bread crumb START -->
<ul class="breadCrumb clearfix">
	<li><a href="${encodedContextPath}">Home</a></li>
	<li class="divider"></li>
	<li>Hotels</li>
</ul>
<div class="clearfix mB10 ">
	<span class="col_3 pL0">
		<a href="javascript:void(0);"class="button button-primary fL modSrcBtn w100pcnt">
		<img src="${ezgImagesPath}/common/right-arrow-wht.png" alt="Arrow" class="mR10">Modifysearch</a>
	</span> 
	<span class="col_7 pL20"> 
		<span class="hotelGrn_xl  mR10 fL"></span> 
		<span class="fL w75pcnt">${view_destination} (${view_nights} nights) <fmt:formatDate value="${view_checkInDate}" type="date"/> - <fmt:formatDate value="${view_checkOutDate}" type="date"/> | ${view_rooms} rooms, ${view_adults} adults,${view_childs} child</span>
	</span>
	<ul class="glToggle fR">
		<li id="viewTab1" class="first sel" onclick="viewhotel('viewTab1', 'viewContr1',3)">
			<span class="listView"></span>
			<span class="aro"></span>
		</li>
		<li id="viewTab2" onclick="viewhotel('viewTab2', 'viewContr2',3)">
			<span class="tabularView"></span>
			<span class="aro"></span>
		</li>
		<li id="viewTab3" onclick="viewhotel('viewTab3', 'viewContr3',3)"class="mapview">
			<span class="locationView"></span>
			<span class="aro"></span>
		</li>
	</ul>
</div>
<div id="primary_navigation_container"
	class="clearfix col_srpGridList mB20 contentPanel dN">
	<c:set var="ractiveHotelSearchContainer" value="divTopSearchHotelSearch" scope="request" />
	<c:set var="ractiveHotelSearchTemplate" value="templateTopSearchHotel" scope="request" />
	<c:set var="ractiveHotelSearchInstance" value="ractiveTopHotel" scope="request" /> 
	<cms:pageSlot position="Search" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
</div>