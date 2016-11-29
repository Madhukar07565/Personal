<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/cart" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<c:set var="url1" value="${encodedContextPath}/cart"></c:set>
<c:set var="url2" value="${encodedContextPath}/checkout/multi/upload-docs"></c:set>
<c:set var="url3" value="${encodedContextPath}/checkout/multi/terms"></c:set>
<c:set var="url4" value="${encodedContextPath}/checkout/multi/review"></c:set>
<c:set var="url5" value="${encodedContextPath}/checkout/multi/payment"></c:set>

<c:choose> 
	<c:when test="${section eq 'CART_TRAVELERS' }">
		<c:set var="active1" value="active"></c:set>
		<c:set var="url1" value=""/>
		<c:set var="url2" value=""/>
		<c:set var="url3" value=""/>
		<c:set var="url4" value=""/>
		<c:set var="url5" value=""/>		
	</c:when> 
	<c:when test="${section eq 'CART_UPLOADDOCS' }">
		<c:set var="active2" value="active"></c:set>
		<c:set var="url2" value=""/>
		<c:set var="url3" value=""/>
		<c:set var="url4" value=""/>
		<c:set var="url5" value=""/>
	</c:when> 
	<c:when test="${section eq 'CART_TERMS' }">
		<c:set var="active3" value="active"></c:set>
		<c:set var="url3" value=""/>
		<c:set var="url4" value=""/>
		<c:set var="url5" value=""/>
	</c:when> 
	<c:when test="${section eq 'CART_REVIEW' }">
		<c:set var="active4" value="active"></c:set>
		<c:set var="url4" value=""/>
		<c:set var="url5" value=""/>
	</c:when> 
	<c:when test="${section eq 'CART_PAYMENT' }">
		<c:set var="active5" value="active"></c:set>
		<c:set var="url5" value=""/>
	</c:when> 
	<c:otherwise></c:otherwise> 
</c:choose>      
      
  <!--=== Content Container ===-->
  <div class="container">
    <ul class="breadCrumb clearfix">
      <li><a href="javascript:void(0);">Home</a></li>
      <li class="divider"></li>
      <li><a href="javascript:void(0);">My account</a></li>
      <li class="divider"></li>
      <li>Shopping cart</li>
    </ul>
    <div class="clearfix">
      <h3 class="fL">Shopping cart</h3>
      <c:set var="expireTime" value="${minExpireTime}"></c:set>
      <c:set var="formatedMinExpireTime" value="${formatedMinExpireTime}"></c:set>
      <span class="fR"><c:if test="${haveHotel || haveFlight }"> Shopping cart refreshes in <span class="fS18 txtClrRed" id="countdown" data-time="${expireTime }" >${formatedMinExpireTime}</span> min </c:if>
	      <span class="posR">
		      <span class="shopping_cart"></span>
		      <span class="circle_text shopCartNum" id="cartCount">${empty minicartProdCount?0:minicartProdCount }</span>
	      </span> 
      </span> 
      </div>
    <div class="accordion_stepForm"> 
    
      <!-- Travellers details begins here-->
      <div class="clearfix heading ${active1} <c:if test='${empty url1  }'> noImg </c:if>" id="header1" <c:if test="${not empty url1  }">onclick="window.location.href='${url1}'"</c:if>>
        <h4><span class="stepNo">1</span><span class="planningdetail">Travellers Details</span></h4>
      </div>
      <c:if test="${active1 != null}">
		<cms:pageSlot position="TravellerDetails" var="feature">
		       <cms:component component="${feature}" />
		</cms:pageSlot>
      </c:if>
      <!-- Travellers details ends here--> 
      
      <c:if test="${haveVisa }">
       <!-- Upload documents details begins here-->
      <div class="clearfix heading ${active2} <c:if test='${empty url2  }'> noImg </c:if>" id="header2" <c:if test="${not empty url2  }">onclick="window.location.href='${url2}'" </c:if>>
        <h4><span class="stepNo">2</span><span class="planningdetail">Upload documents</span></h4>
      </div>
      <c:if test="${active2 != null}">
	      <cms:pageSlot position="UploadDocs" var="feature">
	            <cms:component component="${feature}" />
	      </cms:pageSlot>
      </c:if>
     </c:if>
      <c:if test="${haveInsurance }">
	  <!-- Terms & guidelines details begins here-->
      <div class="clearfix heading ${active3} <c:if test='${empty url3  }'> noImg </c:if>" id="header3" <c:if test="${not empty url3  }">onclick="window.location.href='${url3}'" </c:if>>
        <h4><span class="stepNo">3</span><span class="planningdetail">Terms & guidelines</span></h4>
      </div> 
      <c:if test="${active3 != null}">
	      <cms:pageSlot position="TermsAndGuidelines" var="feature">
	              <cms:component component="${feature}" />
	      </cms:pageSlot>
      </c:if>
      </c:if>
      <!-- Review details begins here-->
      <%-- <div class="clearfix heading ${active4} <c:if test='${empty url4  }'> noImg </c:if>" id="header4" <c:if test="${not empty url4  }"> onclick="window.location.href='${url4}'" </c:if>>
        <h4><span class="stepNo">2</span><span class="planningdetail">Review</span></h4>
      </div>
      <c:if test="${active4 != null}">
	      	<div>
			      <cms:pageSlot position="CartReview" var="feature">
			              <cms:component component="${feature}" />
			      </cms:pageSlot>
	      	</div>
	   </c:if> --%>   
      <!-- Review details ends here--> 
      
      <!-- Payment section begins here -->
      <div class="clearfix heading ${active5} <c:if test='${empty url5  }'> noImg </c:if>"  id="header5" <c:if test="${not empty url5  }">onclick="window.location.href='${url5}'" </c:if>>
        <h4><span class="stepNo">2</span><span class="planningdetail">Payment</span></h4>
      </div>
 	  <c:if test="${active5 != null}">
      	<cms:pageSlot position="Payment" var="feature">
              <cms:component component="${feature}" />
        </cms:pageSlot>
      </c:if>
    </div>
       <!--  Payment section ends here --> 
    </div>
  <div class="cB"></div>
 
  
  <!--=== End Content Container ===--> 


