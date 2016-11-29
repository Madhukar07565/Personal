<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/cart" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<spring:url value="/my-account/order/" var="orderDetailsUrl"/>
<c:set var="searchUrl" value="/my-account/orders?sort=${searchPageData.pagination.sort}"/>


					
<c:if test="${not empty orderDataList}">
	<c:forEach items="${orderDataList}" var="order">
	<div class="bdrFullLightGrey clearfix posR mB20">
		<div class="clearfix pD10  bkgLitBlu">
			<span class="col_4">
				<span class="fS16">Booking Id:</span> 
				<span class="fcLitGry fW400  fS16 ">${order.code} </span> 
			</span>
			<span class="col_4">
				<span class=" fS16 mT3 ">Date of booking : </span> 
				<span class=" fS16 fcLitGry fW400">
					<fmt:formatDate value="${order.created}" dateStyle="medium" timeStyle="short" type="both"/>
				</span>
			</span>
			<span class=" col_4">
				<span class=" fS16 mT3 fR">Booking Amount :
					<span class=" fS16 fcLitGry fW400 ">
						<span class="rupee">Rs</span>
						${order.totalPriceWithTax.value}
					</span>
				</span>
			</span>
		</div>
		
		
		<c:forEach items="${order.entries}" var="orderEntry">
		<!-- Expanded View Detail-->
		<section class="ft_results w100pcnt">
			<div class="col_8 pR0 pL10 layover clearfix">
				<h4 class="mT15">Hotels</h4>
			</div>
			
			<div class="cB"></div>
			<div class="col_8 clearfix pD5 mT10">
				<span class="col_2 pD0"><img
					src="${ezgImagesPath}/common/hotel_small.jpg" alt=""></span>
					<span>${orderEntry.product.name }</span><br>
				<span class=" fS16 mT3 ">${hotelData.checkInDate }. ${nights } nights </span> <span
					class=" fS16 mT3 planningdetail">${hotelData.noOfRooms } Rooms </span> <span
					class=" fS16 mT3 planningdetail">${hotelData.adultNo } Adults ${hotelData.childNo }, Child</span><br>
			</div>
			<div class="col_4 mT10 clearfix">
				<span class=" fS16 mT3 fR">Status :<span
					class=" fS16 txtClrGrn pD5  fW400 ">Confirmed</span></span><%-- ${order.status.code } --%>
					<br>  

			</div>
			<div class="cB"></div>

			<div class="cB"></div>
			<div class="col_12 mT10 clearfix brdrBLitGry">

				<span class="fR"> <a href="#"><img
						src="${ezgImagesPath}/custom/print.png" alt=""></a>
				</span> <span class="fR"> <a href="#"><img
						src="${ezgImagesPath}/custom/download.png" alt=""></a>
				</span> <span class="fR"> <a href="#"><img
						src="${ezgImagesPath}/custom/mail.png" alt=""></a>
				</span>
			</div>
		</section>
		</c:forEach>
		
		
		<div class="cB"></div>
	</div>
	</c:forEach>
</c:if>