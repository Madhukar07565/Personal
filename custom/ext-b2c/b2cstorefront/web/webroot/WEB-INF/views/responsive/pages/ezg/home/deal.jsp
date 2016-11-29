<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<section class="deals container clearfix first">
	<div id="tagsHolder" class="tC mB30 <c:if test='${empty selectedType}'>dN</c:if>">
		<span class="fS22 mR10">Traveller type:</span> 
		<span id="selectedTags" class="mB20 tC">
		<form id="removeTravellerType" method="get" action="${encodedContextPath}">
		<c:forEach items="${selectedType}" var="type">
			<span class='userTag'>${type.name}<a href='#' id="${type.code}" class='removeTag'>x</a></span>
			<input type="hidden" id="${type.code}" name="travellerType" value="${type.code}"/>
		</c:forEach>
		</form>
		</span>
		<div class="mT10">(Based on your previous selection)</div>
	</div>
	<h2>
		Deals for travellers like #you
	</h2>
	<ul id="first-carousel" class="first-and-second-carousel jcarousel-skin-tango">
		<c:forEach items="${travellerDeals}" var="travellerDeal">
			<li class="cursor">
			<a href="javascript:void(0);" onclick="popupdeal('topDeals','topDealsinner','fade','${travellerDeal.productCategory}','${travellerDeal.offerName}','${travellerDeal.offerShortDesc}')">
				<h3>
					${travellerDeal.offerType}<span class="like fR mT5"></span>
				</h3> 
				<p>${travellerDeal.offerName}</p>
				<img src="${ezgImagesPath }${travellerDeal.offerImage}" alt="Deal1" />
				<div class="offerContr">
					<h4>
						<a href="javascript:void(0);">Get <span class="rupee">Rs</span>${travellerDeal.saving} cashback </a>
					</h4>
					<h6>${travellerDeal.destination}</h6>
				</div>
				<div class="offerPrice">
					<h4>
						<span class="rupee">Rs</span>${travellerDeal.saving}
					</h4>
					<h6 class="fS11">cashback</h6>
				</div>
			</a>
		</li>
		</c:forEach>
	</ul>
</section>
<div class="white_content posF dN popupplay" id="topDeals" style="top: 0px; height: 100%; padding-top: 20px; padding-bottom: 20px; display: none; overflow: auto;">
	<div class="white_content_inner w80pcnt col_sm_12 clearfix pD20" id="topDealsinner">
		<div class="closeBtn_popup fR" onclick="popupDealclose('topDeals', 'fade','dynamicSearchSection')"></div>
		<div class="pD15 boxContr bkgLitBlu clearfix mT20" id="dynamicHotelSearchSectionTitle">
		</div>
		<div id="dynamicFlightSearchSection" class="dN">
			<c:set var="ractiveFlightSearchContainer" value="divPopupSearchFlightSearch" scope="request" />
			<c:set var="ractiveFlightSearchTemplate" value="templatePopupSearchFlight" scope="request" />
			<c:set var="ractiveFlightSearchInstance" value="ractivePopupFlight" scope="request" /> 
			<cms:pageSlot position="NavigationFlightSearch" var="feature">
				<cms:component component="${feature}" />
			</cms:pageSlot> 
		</div>
		<div id="dynamicHotelSearchSection" class="dN">
			<c:set var="ractiveHotelSearchContainer" value="divPopupSearchHotelSearch" scope="request" />
			<c:set var="ractiveHotelSearchTemplate" value="templatePopupSearchHotel" scope="request" />
			<c:set var="ractiveHotelSearchInstance" value="ractivePopupHotel" scope="request" /> 
			<cms:pageSlot position="NavigationHotelSearch" var="feature">
				<cms:component component="${feature}" />
			</cms:pageSlot> 
		</div>
		<div class="grey_bg grey_border clearfix mT20"><span class="mL10 fW600">ELIGIBILITY OF THE OFFER :</span></div>
		<ul id="dynamicHotelSearchSectionDesc" class="grey_border pD10 greyList clearfix">
		</ul>
	</div>
</div>

<script>
//$('.first-and-second-carousel').jcarousel();
function popupdeal(light, lightInner, fade,searchWidget,offerName,offerDesc) {
	if(searchWidget=='flight'){
		$("#dynamicFlightSearchSection").show();
		$("#dynamicHotelSearchSectionTitle").empty().append("<h3 class='tC fW600'>Flat <span class='txtClrOrng'>"+offerName+"</span> on flights</h3>");
	}
	if(searchWidget=='hotel'){
		$("#dynamicHotelSearchSection").show();
		$("#dynamicHotelSearchSectionTitle").empty().append("<h3 class='tC fW600'>Flat <span class='txtClrOrng'>"+offerName+"</span> on hotels</h3>");
	}
	$("#dynamicHotelSearchSectionDesc").empty().append("<li>"+offerDesc+"</li>");
	document.getElementById(light).style.display = 'block';
	var frame = document.getElementById(fade);
	var htmlheight = document.body.parentNode.scrollHeight;
	var myHeight = document.body.parentNode.clientHeight;

	if (htmlheight < myHeight) {
		var frameheight = myHeight + "px";
		frame.style.height = frameheight;

	} else {
		var frameheight = htmlheight + "px";
		frame.style.height = frameheight;

	}
	document.body.style.overflow = 'hidden';
	document.getElementById(light).style.overflow = 'auto';
	document.getElementById(fade).style.display = 'block';
}

function popupDealclose(light, fade,searchWidget) {
	document.getElementById(light).style.display = 'none';
	document.getElementById(fade).style.display = 'none';
	$("#dynamicFlightSearchSection").hide();
	$("#dynamicHotelSearchSection").hide();
	document.body.style.overflow = 'auto';
}
$(function(){
	$(".removeTag").click(function(){
		var id = $(this).attr("id");
		$("input[id='"+id+"']").remove();
	    $("#removeTravellerType").submit();
	});
});
</script>