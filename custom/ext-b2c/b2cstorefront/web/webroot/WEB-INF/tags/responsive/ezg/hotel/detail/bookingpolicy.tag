<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="hotelData" required="true" type="com.cnk.travelogix.common.facades.product.data.hotel.HotelData" %>
<article class="tabContainer pD20 dN" id="Importantinfo">
			<div class=" w100pcnt clearfix">
				<c:forEach items="${hotelData.bookingPolicies}" var="policy">
					<h4>${policy.title}</h4>
					<p class="mT10 mB10">
					${policy.content}
					</p>
				</c:forEach>
			</div>
		</article>