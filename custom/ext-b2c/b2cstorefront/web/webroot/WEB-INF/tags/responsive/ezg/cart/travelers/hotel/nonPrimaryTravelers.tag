<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="travelerData" required="true" type="com.cnk.travelogix.common.core.cart.data.AccommodationTravellerData"%>
<%@ attribute name="roomInfo" required="true" type="com.cnk.travelogix.common.core.cart.data.OrderRoomDetailInfoData"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="hotel" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/hotel"%>

	<c:if test="${not empty travelerData }">
		<c:set var="firstName" value="${travelerData.firstName }"/>
		<c:set var="lastName" value="${travelerData.lastName }"/>
		<c:set var="travelerTitle" value="${travelerData.title }"/>
		<c:set var="mobileNumber" value="${travelerData.mobileNumber }"/>
		<c:set var="email" value="${travelerData.email }"/>
		<c:set var="nationality" value="${travelerData.nationality }"/>
		<c:set var="specialrequest" value="${travelerData.specialrequest }"/>
		
		<c:if test="${not empty travelerData.nonPrimaryTravellerList }">
			<c:set var="numberOfNonPrimaryTraveller" value="${fn:length(travelerData.nonPrimaryTravellerList)}"/>
		</c:if>
	</c:if>

    <c:if test="${not empty travelerData.nonPrimaryTravellerList }">
		<c:forEach items="${travelerData.nonPrimaryTravellerList}" var="nonPrimaryTraveller" varStatus="status" >
			<c:choose>
				<c:when test="${ empty nonPrimaryTraveller.dateOfBirth }">
					<c:set var="nonPAdultNumber" value="${status.index+1 }"></c:set>
				</c:when>
			</c:choose>
		</c:forEach>
		<c:set var="childNumber" value="${fn:length(travelerData.nonPrimaryTravellerList) - nonPAdultNumber }"></c:set>
	</c:if>
    
    <c:choose>
    	<c:when test="${not empty travelerData.nonPrimaryTravellerList }">
    		<c:forEach  items="${travelerData.nonPrimaryTravellerList} "  var="npTraveller" varStatus="status">
    			<c:if test="${status.index lt nonPAdultNumber-1 }">
    				<ul class="fieldRow mB20 clearfix">
			        <li class="fL">
			          <label>Traveller ${status.index + 1 }*</label>
			        </li>
			        <li class="fL mR10">
			          <hotel:travelerTitle travelerTitle="${title }"/>
			        </li>
			        <li class="fL mR10 w120">
			          <input name="firstName" value="${travelerData.nonPrimaryTravellerList[status.index].firstName}" type="text" class="fL w100pcnt" placeholder="First name" 
			          id="firstNamehotel1" onClick="showtooltip('firstNamehotel1','travellerList1')" />
			        </li>
			        <li class="fL w120">
			          <input name="lastName" value="${travelerData.nonPrimaryTravellerList[status.index].lastName}" type="text" class="fL w100pcnt" placeholder="Last name"  />
			        </li>
			       </ul>
    			</c:if>
				<c:if test="${status.index gt nonPAdultNumber-1 }">	
			          <ul class="fieldRow mB20 clearfix">
				        <li class="fL">
				          <label>Child ${status.index + 1 }*</label>
				        </li>
				        <li class="fL mR10">
				          <hotel:travelerTitle travelerTitle="${title }"/>
				        </li>
				       <li class="fL mR10 w120">
				          <input name="firstName" value="${travelerData.nonPrimaryTravellerList[status.index].firstName}" type="text" class="fL w100pcnt" placeholder="First name" 
				          id="firstNamehotel1" onClick="showtooltip('firstNamehotel1','travellerList1')" />
				        </li>
				        <li class="fL w120">
				          <input name="lastName" value="${travelerData.nonPrimaryTravellerList[status.index].lastName}" type="text" class="fL w100pcnt" placeholder="Last name"  />
				        </li> 
				       </ul>       
			          <hotel:travelerBirthday travelerTitle=""/>
			    </c:if>
			</c:forEach>
    	</c:when>
    	<c:otherwise>
	    	<c:if test="${roomInfo.numberOfAdult gt 1 }">
				 <c:forEach  begin="1" end="${roomInfo.numberOfAdult - 1 }" varStatus="status">
				 	<form name="nonPrimaryAdultForm" data-index="${roomInfo.roomIndex }"  >     
						<ul class="fieldRow mB20 clearfix">
					       <li class="fL">
					         <label>Traveller ${status.index + 1 }*</label>
					       </li>
					       <li class="fL mR10">
					         <hotel:travelerTitle travelerTitle="${title }"/>
					       </li>
					       <li class="fL mR10 w120">
					         <input name="firstName" type="text" class="fL w100pcnt" placeholder="First name" 
					         id="firstNamehotel" onClick="showtooltip('firstNamehotel','travellerList1')" value="${secondTravelerFirstName }"/>
					       </li>
					       <li class="fL w120">
					         <input name="lastName" type="text" class="fL w100pcnt" placeholder="Last name" value="${secondTravelerLastName }"/>
					       </li>
					     </ul>
				     </form>
				</c:forEach>
		    </c:if>
    
		    <c:if test="${roomInfo.numberOfChild gt 0 }">
				<c:forEach    begin="1" end="${roomInfo.numberOfChild }" varStatus="status">
					<form name="nonPrimaryChildForm" data-index="${roomInfo.roomIndex }"  >
						<ul class="fieldRow mB20 clearfix">
					        <li class="fL">
					          <label>Child ${status.index }*</label>
					        </li>
					        <li class="fL mR10">
					          <hotel:travelerTitle travelerTitle="${title }"/>
					        </li>
					        <li class="fL mR10 w120">
					          <input name="firstName" value="${childFirstName }" type="text" class="fL w100pcnt" placeholder="First name" 
					          id="firstNamehotel1" onClick="showtooltip('firstNamehotel1','travellerList1')" />
					        </li>
					        <li class="fL w120">
					          <input name="lastName" value="${childLastName }" type="text" class="fL w100pcnt" placeholder="Last name"  />
					        </li>
				       </ul>
				                 
				       <hotel:travelerBirthday travelerTitle=""/>
			         </form>
				</c:forEach>
			</c:if>
    	</c:otherwise>
    </c:choose>