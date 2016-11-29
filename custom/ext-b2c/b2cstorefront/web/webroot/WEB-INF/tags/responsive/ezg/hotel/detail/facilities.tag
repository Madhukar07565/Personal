<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="hotelData" required="true" type="com.cnk.travelogix.common.facades.product.data.hotel.HotelData" %>

<article class="tabContainer pD20 dN" id="amenities">
			<div class="col_12 clearfix">
				<div class="col_6">
					<h3 class="pL5">Facilities</h3>
					<ul class="col_6 pL0">
						<c:forEach items="${hotelData.facilities.facilitydetails}" var="facility">
							<li class="pD5">
								<img src="${ezgImagesPath}${facility.icon}" alt="" class="valign mR10" />${facility.name}
							</li>
						</c:forEach>
					</ul>
					<br class="cB">
					<h3 class="mT10">Other Amenities</h3>
					<ul class="clearfix greyList">
						<c:forEach items="${hotelData.facilities.otherAmenities}" var="otherAmen">
						<li class="mL35">${otherAmen.name}</li>
						</c:forEach>
					</ul>
					<br class="cB">
					<h3 class="mT10">Hotel Amenities</h3>
					<ul class="clearfix greyList col_6 pL0">
						<c:forEach items="${hotelData.facilities.hotelAmenities}" varStatus="status" var="hotelAmen">
						<c:if test="${status.index%2==0}">
							<li class="mL35">${hotelAmen.name}</li>
						</c:if>
						</c:forEach>
					</ul>
					<ul class="clearfix greyList col_6 pL0">
						<c:forEach items="${hotelData.facilities.hotelAmenities}" varStatus="status" var="hotelAmen">
						<c:if test="${status.index%2!=0}">
							<li class="mL35">${hotelAmen.name}</li>
						</c:if>
						</c:forEach>
					</ul>
					<br class="cB">
					<h3 class="mT10">Business services</h3>
					<ul class="clearfix greyList">
						<c:forEach items="${hotelData.facilities.businessService}" var="businessService"> 
							<li class="mL35">${businessService.name}</li>
						</c:forEach>
					</ul>
				</div>
				<div class="col_6">
					<c:forEach items="${hotelData.facilities.otherDescriptions}" varStatus="status" var="otherDescriptions"> 
					<div <c:if test='${status.index>1}'> class='dN'</c:if>>
						<p class="mT15 fS16 fW600">${otherDescriptions.title}</p>
						<p class="mT10">${otherDescriptions.description}</p>
					</div>
					</c:forEach>
					<a href="javascript:void(0);" class="fR hotelDetailShowMore">More reviews</a>
				</div>
			</div>
		</article>
		