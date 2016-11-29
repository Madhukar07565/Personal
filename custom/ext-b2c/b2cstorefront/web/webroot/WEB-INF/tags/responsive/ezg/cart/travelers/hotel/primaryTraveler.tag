<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>

<%@ attribute name="travelerData" required="true" type="com.cnk.travelogix.common.core.cart.data.AccommodationTravellerData"%>
<%@ attribute name="roomInfo" required="true" type="com.cnk.travelogix.common.core.cart.data.OrderRoomDetailInfoData"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="hotel" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/hotel"%>


<div class="posR">
		<span class="clearfix  pD10 w100pcnt dB mB10  "> <span class="clearfix mB5 w100pcnt ">
            <input type="checkbox" name="timeLimit" value="${roomInfo.timeLimit }" <c:if test="${roomInfo.timeLimit }">checked</c:if> />
            <label class="mB0 mT10" style="width:100%">Book on Time limit, expiry 15 June 2015, 2400 hrs GMT </label></span>
		</span>
        <ul class="fieldRow mB20 clearfix">
          <li class="fL">
             <label>Primary Traveller Name*</label>
          </li>
          <li class="fL mR10">
            <hotel:travelerTitle travelerTitle="${travelerData.title}"/>
          </li>
          <li class="fL mR10 w120">
            <input name="firstName" type="text" class="fL w100pcnt" placeholder="First name" value="${travelerData.firstName }" />
          </li>
          <li class="fL mR10 w120">
            <input name="middleName" type="text" class="fL w100pcnt" placeholder="Middle name" value="${travelerData.middleName }" />
          </li>
          <li class="fL w120">
            <input name="lastName" type="text" class="fL w100pcnt" placeholder="Last name" value="${travelerData.lastName }" />
          </li>
        </ul>
    </div> 
    <ul class="fieldRow clearfix mB20">
      <li class="fL">
        <label>Mobile*</label>
      </li>
      <li class="fL mR10">
        <select>
          <option>+91</option>
        </select>
      </li>
      <li class="fL" style="width: 20%">
        <input name="mobileNumber" type="text" class=" selectContLargeInput" placeholder="Enter 10 digit mobile number"  value="${travelerData.mobileNumber }"/>
      </li>
    </ul>
	<ul class="fieldRow clearfix mB20">
        <li class="fL">
          <label>Email*</label>
        </li>
        <li class="fL" style="width: 20%">
          <input name="email" type="text" class=" selectContLargeInput" placeholder="Enter your email id" value="${travelerData.email }" />
        </li>
    </ul>
	<ul class="fieldRow mB20 clearfix">
	    <li class="fL">
	      <label>Nationality</label>
	    </li>
	    <li class="fL mR10">
	      <select name="nationality">
	        <option value="Select">Select</option>
	        <option value="India">India</option>
	      </select>
	    </li>
    </ul>