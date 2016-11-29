<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="flightOrderEntry" required="true" type="de.hybris.platform.commercefacades.order.data.OrderEntryData"%>
<%@ attribute name="index" required="true" type="java.lang.String"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="commonFlightInfoData" value="${flightOrderEntry.orderEntryInfoData.flightDetailInfoData.commonFlightInfoData}"/>
<c:set var="commonFlightDetailList" value="${commonFlightInfoData.commonFlightDetailList}"/>
<section class="ft_results detailContr w100pcnt dN" id="moreInfoCont">
   <span class="show_contr_close fR" id="closeMoreInfo"></span>
   <div class="col_6 pR0 pL10 layover clearfix"> 
   
   <c:forEach items="${commonFlightDetailList}" var="flightDetail" varStatus="status">
   	<c:if test="${not empty flightDetail}">
   	<samp class="go_AI"> 
   		 <span class="pT40">${commonFlightInfoData.airlineIATAData.airlineName }<br/>
      ${commonFlightInfoData.airlineIATAData.accountingCode } ${commonFlightInfoData.airlineIATAData.airlinePrefix}</span> </samp> <dfn> <strong> <small>${flightDetail.fromCity } <br>
       </small> <fmt:formatDate type="date" pattern="HH:MM"  value="${flightDetail.departureTime}"/><br>
      <em class="mT10"><fmt:formatDate type="date" pattern="dd MMM, E"  value="${flightDetail.departureTime}"/>
      Terminal ${flightDetail.fromTerminal }</em> </strong> <ins> <span>${flightDetail.cabinClass}</span> ${flightDetail.duration }<br>
      <span class="fS11">Airbus A380</span> </ins> <strong> <small>${flightDetail.toCity }<br>
       </small>  <fmt:formatDate type="date" pattern="HH:MM"  value="${flightDetail.arrivalTime}"/><br>
      <em class="mT10"><fmt:formatDate type="date" pattern="dd MMM, E"  value="${flightDetail.arrivalTime}"/>
       Terminal ${flightDetail.toTerminal} </em> </strong> </dfn> 
       <c:if test="${!empty commonFlightDetailList[status.index+1]}">
      	<span class="layoverBG fL w100pcnt"></span><br class="cB">
       </c:if>
   	</c:if>
   </c:forEach>
      
   </div>
   <div class="col_5 tR mT10"> <a href="javascript:void(0)" onclick="popupwin('booking_policy','booking_policyinner', 'fade')">Booking policy</a> </div>
</section>