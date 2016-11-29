<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/desktop/nav" %>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/desktop/formElement" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common" %>
<%@ taglib prefix="multi-checkout" tagdir="/WEB-INF/tags/desktop/checkout/multi" %>
<%@ taglib prefix="address" tagdir="/WEB-INF/tags/desktop/address" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>

<c:if test="${not empty paymentFormUrl}">
	<c:choose>
		<c:when test="${cardType eq 'Amex'}">
			<form id="silentOrderPostForm" name="silentOrderPostForm"  class="create_update_payment_form" action="${paymentFormUrl}" method="POST">
			
			<c:forEach items="${silentOrderPageData.parameters}" var="entry" varStatus="status">
				<input type="hidden" id="${entry.key}" name="${entry.key}" value="${entry.value}" />
			</c:forEach>
								
								
				<%-- <c:forEach></c:forEach>
				<input type="hidden" name="vpc_ReturnURL" value="${silentOrderPageData.parameters['receiptResponseURL']}"/>
				<input type="hidden" name="vpc_Version" value="${silentOrderPageData.parameters['paymentServerVersion']}"/>
				
				<input type="hidden" name="vpc_OrderInfo" value="${silentOrderPageData.parameters['cartCode']}"/>
				<input type="hidden" name="vpc_MerchTxnRef" value="${silentOrderPageData.parameters['transactionCode']}"/>
				<input type="hidden" name="vpc_Amount" value="${silentOrderPageData.parameters['amount']}"/>
				<input type="hidden" name="vpc_Amount" value="1000"/>
				
				<input type="hidden" name="vpc_Command" value="${silentOrderPageData.parameters['command']}"/>
				<input type="hidden" name="vpc_Merchant" value="${silentOrderPageData.parameters['mearchantId']}"/>
				<input type="hidden" name="vpc_SecureHash" value="${silentOrderPageData.parameters['secureHash']}"/>
				<input type="hidden" name="vpc_AccessCode" value="${silentOrderPageData.parameters['mearchantAccessCode']}"/>
				<input type="hidden" name="vpc_Locale" value="${silentOrderPageData.parameters['mearchantLocale']}"/>
				<input type="hidden" name="vpc_card" value="${cardType}"/>
				<c:if test="${ !empty silentOrderPageData.parameters['cardNumber'] }">
					<input type="hidden" name="vpc_CardNum" value="${silentOrderPageData.parameters['cardNumber']}"/>
					<input type="hidden" name="vpc_CardExp" value="${silentOrderPageData.parameters['cardExpiry']}"/>
					<input type="hidden" name="vpc_CardSecurityCode" value="${silentOrderPageData.parameters['cardSecurityCode']}"/>
					<input type="hidden" name="vpc_BillTo_Fullname" value="${silentOrderPageData.parameters['accountHolderName']}"/>
				</c:if> --%>
			</form>
		</c:when>
	</c:choose>
</c:if>
