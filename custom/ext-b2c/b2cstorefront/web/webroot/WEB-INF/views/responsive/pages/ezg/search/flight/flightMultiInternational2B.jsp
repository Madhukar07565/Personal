<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="flight" tagdir="/WEB-INF/tags/responsive/ezg/flight"%>

<c:set var="bestPriceRecommend" value="${flightSection2BViewModel.bestPriceRecommend[0]}" /> 
<c:set var="flights" value="${flightSection2BViewModel.result}" />

<div class="col_9 col_sm_12 pR0 pL0_768"> 
      <div id="viewContr1">
        <h4 class=" fS18 mB10 fW600">Best price recommendation</h4>
		
       
        <div class="mB20">
		<div>
           <ul class="ft_results" >
				  <flight:multiinternationalflight flights="${bestPriceRecommend}" tagName="bestPrice" />
			</ul>
			 <div class="mB10 clearfix">
          <div class="col_12">
            <%-- <flight:twowaycarousel fareCarouselMap="${bestPriceRecommend.fareCarouselMap}"/> --%>
          </div>
        </div>
        <span class="tC mB10 fW400 w100pcnt fL">Mumbai <span class="flight_icon_sml mL5 mR5"></span> London <span class="flight_icon_sml mL5 mR5"></span>Sydney <span class="flight_icon_sml mL5 mR5"></span>Mumbai | 25th Jul, Sun - 30th Jul, Sun - 2nd Oct, Fri </span> <br class="cB">
        <ul class="ft_results">
          <li class="flightHeading clearfix"><span class="fL pL10 tL">Sort By</span><span class="deptTime" style="font-size:14px !important;"><a href="javascript:void(0);" style="margin-left:15px;">Departure</a></span><span class="duration"><a href="javascript:void(0);" class="">Duration</a></span><span class="duration"><a href="#" class="">Arrival</a></span><a href="javascript:void(0);"><span class="totalPrice mL15_pcnt" style="font-size:14px !important;">Price<span class="sortAro_up_icon mL5"></span></span></a> </li>
          
			<%-- <flight:multiinternationalflight flights="${flights}" tagName="allResult"/> --%>
			<flight:multicityintlflightnew flights="${flights}" tagName="allResult"/>
         
        </ul>
		</div>
			
        </div>
       
       
      </div>
</div>
