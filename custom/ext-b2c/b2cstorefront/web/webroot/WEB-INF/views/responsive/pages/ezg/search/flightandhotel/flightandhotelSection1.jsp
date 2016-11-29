<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<!-- bread crumb START -->
<ul class="breadCrumb clearfix">
	<li><a href="javascript:void(0);">Home</a></li>
	<li class="divider"></li>
	<li>Flights + Hotels</li>
</ul>
<!-- bread crumb END -->
<!-- search button & search results summary START -->
<div class="clearfix mB10">
	<span class="col_3 pL0">
		<a href="javascript:void(0);" class="button button-primary fL modSrcBtn w100pcnt"><img src="${ezgImagesPath}/common/right-arrow-wht.png" alt="Arrow" class="mR10">Modify search</a>
	</span>
	<span class="col_7 fL pL10">
		<span class="flight_icon mR10 margin0 mR10 fL"></span><span class="diy_hotel_icon margin0 mR10 fL"></span><span class="fL">BOM – DEL | 25 Sep | 2 Adults, 1 Child </span>
	</span>
</div>
<!-- search button & search results summary END -->
<div class="clearfix pL0 pR0 mB20 dN contentPanel">
<cms:pageSlot position="Search" var="feature">
	<cms:component component="${feature}" />
</cms:pageSlot>
</div>