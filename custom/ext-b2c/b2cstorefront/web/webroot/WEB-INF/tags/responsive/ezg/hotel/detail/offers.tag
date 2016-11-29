<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="hotelData" required="true" type="com.cnk.travelogix.common.facades.product.data.hotel.HotelData" %>
<article class="tabContainer pD20 dN" id="offers">
	<c:forEach items="${hotelData.offers}" var="offer">
		<p class="fS18 fW600 clearfix">
			<span class="fL">${offer.title}</span> <span class="fR">Promo
				code: ${offer.promoCode}</span>
		</p>
		<p class="mT10 mB20 lH15 tJ">${offer.content}</p>
	</c:forEach>
</article>
