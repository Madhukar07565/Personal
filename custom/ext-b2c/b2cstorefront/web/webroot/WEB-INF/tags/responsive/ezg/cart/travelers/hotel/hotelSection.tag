<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="hotel" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/hotel"%>
<%@ taglib prefix="ancillary" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/hotel/ancillary"%>

<div class="inrContr clearfix posR mB20"> 
	<!-- Sub Header -->
	<div class="clearfix shopCardHrdr ">
	  <h5 class="fL">Hotels</h5>
	  <img src="${ezgImagesPath }/common/collapse.png" alt="Arrow" class="fR mT5"> 
	</div>
	<c:if test="${not empty hotelData }">
		<ancillary:hotelAncillaryTemplate/>
		<c:forEach items="${hotelData  }" var="hotel">
			<div class="shopCardContr dN" style="display: none;"> 
			
	            <!-- Section begins -->
	            <hotel:hotelSummary hotelEntry="${hotel }"/>
	            
	            <!-- Expanded view-->
	            <hotel:hotelRooms hotelEntry="${hotel }"/>
	            
				<hotel:hotelTerms hotelEntry="${hotel }"/>
	            
	            <hotel:hotelTravelers hotelEntry="${hotel }"/>
	            
	            <hotel:hotelCrossSellings/>
			</div>
		</c:forEach>
	</c:if>  
</div>
	