<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/cart"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common"%>
<%@ taglib prefix="template"
	tagdir="/WEB-INF/tags/responsive/ezg/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>


<template:page>
	<div class="container">
		<div class="col_12 clearfix">
			<div class="clearfix mT10">
				<ul class="breadCrumb clearfix col_5 col_4_half_sm fL pL0 pR0">
					<li><p class="fW500 fS20 clearfix">Booking Details</p> <br>
						<span><a href="${fullContextPath}/my-account/bookList">Back to booking
								list</a></span></li>
				</ul>
			</div>
			<cms:pageSlot position="bookingDetailTopTable" var="feature">
				<cms:component component="${feature}" />
			</cms:pageSlot>
			<cms:pageSlot position="bookingDetailList" var="feature">
				<cms:component component="${feature}" />
			</cms:pageSlot>
			<cms:pageSlot position="bookingHistory" var="feature">
				<cms:component component="${feature}" />
			</cms:pageSlot>
		</div>
	</div>
	<cms:pageSlot position="addBookingFlightAndHotelPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="addBookingFlightPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="addBookingHotelPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="cancelAllBookingPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="cancelBookingBikePopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	v<cms:pageSlot position="cancelBookingBusPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="cancelBookingCarPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="cancelBookingCruisePopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="cancelBookingFlightAndHotelPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="cancelBookingFlightPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="cancelBookingHotelPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="cancelBookingSuperSaverPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="cancelBookingTrainPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="changeBookingFlightAndHotelPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="changeBookingFlightPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="changeBookingHotelPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="confirmCancellationPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="modifySearchFlightPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="postReviewPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="reviewHotelChangeInfoPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="searchHotelPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="reviewConfirmCancelPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="selectSeatPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="postFeedbackPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="bookingPolicyPopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<cms:pageSlot position="paymentSchedulePopup" var="feature">
		<cms:component component="${feature}" />
	</cms:pageSlot>
	<div class="black_overlay" id="fade"></div>
</template:page>

<script type="text/javascript" src="${ezgJsPath }/booking/bookingDetails.js"></script>