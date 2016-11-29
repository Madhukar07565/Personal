<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="flight" tagdir="/WEB-INF/tags/responsive/ezg/flight"%>

<%-- <c:if test="${fn:length(section2BDataModel.bestPriceRecommend) > 0}"> --%>
 <c:set var="bestPriceRecommend" value="${flightSection2BViewModel.bestPriceRecommend[0]}" /> 
<c:set var="flights" value="${flightSection2BViewModel.result[0]}" />

<section class="col_9 col_sm_12 pR0 pL0_768"> 
    
      
      <section class="clearfix mB5">
       
      </section>
      <div id="viewContr1">
        <h4 class=" fS18 mB10 fW600">Best price recommendation</h4>		
             <flight:airlineheader />
        <div id="onewayAirlineResultTabs" class="mB20">
        </div>
        
    
		<div id="airlineTabResults1">
           <ul class="ft_results" >
           	<c:if test ="${bestPriceRecommend.listOfFlights.size() > 0}">
          		
          		<flight:onewayflightnew isMultiCity = "false" flights="${bestPriceRecommend}" tagName="bestPrice"/>
          	</c:if>	
     	   </ul>
		<%-- the flat calendar--%>	
		       <div class="mB10 clearfix">
		          <div class="col_12">
		            <flight:twowaycarousel fareCarouselMap="${bestPriceRecommend.fareCarouselMap}" selectedItemKey="${bestPriceRecommend.selectedItemKey}" theIndex="0"/>
		          </div>
		        
		        <!-- <span class="tC mB10 fW400 w100pcnt fL">Mumbai <span class="flight_icon_sml mL5 mR5"></span>Delhi | 29 Jul, Sun</span> -->
		        <span class="w100pcnt fL">
		        <flight:flightresulttitle type="oneway" theIndex = "0"/>
				</span>
		        <br class="cB">
		<%-- the search results--%>	        
				<ul class="ft_results">
		
		          <flight:sortedby theTabIndex="0"/>

				  <flight:onewayflightnew isMultiCity = "false" flights="${flights}" tagName="allResult"/>

		         
		        </ul>
		    </div>
		</div>
	</div>
		
<%--   *******This tabs are not deeded any more******

      <div  id="airlineTabResults2" class="dN">
        <ul  class="ft_results  pD10 brdrGry">
        <li>New Tab Content </li>
        </ul>
      </div>
      <div  id="airlineTabResults3" class="dN">
        <ul  class="ft_results  pD10 brdrGry">
        <li>New Tab Content </li>
        </ul>
      </div>
      <div  id="airlineTabResults4" class="dN">
        <ul  class="ft_results  pD10 brdrGry">
        <li>New Tab Content </li>
        </ul>
      </div>
      <div  id="airlineTabResults5" class="dN">
        <ul  class="ft_results  pD10 brdrGry">
        <li>New Tab Content </li>
        </ul>
      </div>
      <div  id="airlineTabResults6" class="dN">
        <ul  class="ft_results  pD10 brdrGry">
        <li>New Tab Content </li>
        </ul>
      </div>
      <div  id="airlineTabResults7" class="dN">
        <ul  class="ft_results  pD10 brdrGry">
        <li>New Tab Content </li>
        </ul>
      </div>
         
  --%>      
       


	<div id="viewContr2" class="dN"> 
			<div class=" clearfix">
              <div class="pD10 bkgLitGrn">
                <div class="custom-header fcBlk clearfix header">
                  <div class="custom-month-year tC fS24"> 
				  <span id="custom-month" class="custom-month txtClrWht"></span> 
				  <span id="custom-year" class="custom-year txtClrWht"></span>
                    <nav> <span id="custom-prev" class="custom-prev"></span> <span id="custom-next" class="custom-next"></span> </nav>
                  </div>
                </div>
              </div>
              <div id="calendar" class="fc-calendar-container"></div>
              <div>
				<ul class="ft_results">
					<li class="flightHeading clearfix"><span class="fL pL10 tL">Sort By</span><span class="deptTime" style="font-size:14px !important;"><a href="javascript:void(0);" style="margin-left:15px;">Departure</a></span><span class="duration"><a href="javascript:void(0);" class="mL30">Duration</a></span><span class="duration"><a href="#" class="mL30">Arrival</a></span><a href="javascript:void(0);"><span class="totalPrice mL15_pcnt" style="font-size:14px !important;">Price<span class="sortAro_up_icon mL5"></span></span></a> </li>
					<flight:onewayflightnew isMultiCity = "false" flights="${flights}" tagName="allResult" />
				</ul>
              </div>
            </div>
	  </div>
      
	  
	    <div id="viewContr3" class="dN"> 
			<div class="row mB20 mTN1">
				<div class="col_12 clearfix">
				<div class=" col_2 pL0 pR0 mB20">
                  <div class="tblHrdrDiv tC matfliterAll"><a href="javascript:void(0)">All</a></div>
                  <div class="tblCellDiv firstCol tL">00.00 - 06.00</div>
                  <div class="tblCellDiv firstCol tL">02.00 - 12.00</div>
                  <div class="tblCellDiv firstCol tL">12.00 - 18.00</div>
                  <div class="tblCellDiv firstCol last tL">18.00 - 24.00</div>
                </div>
                <div class="col_10 pL0 pR0 mB20" >
<%-- The Onward fare table result Starts --%>	                
               		<flight:onwardfaretable/>
<%-- The Onward fare table Ends --%>	
                </div>
				<div class="clearfix"></div>
				<ul class="ft_results">
			      <li class="flightHeading clearfix"><span class="fL pL10 tL">Sort By</span><span class="deptTime" style="font-size:14px !important;"><a href="javascript:void(0);" style="margin-left:15px;">Departure</a></span><span class="duration"><a href="javascript:void(0);" class="mL30">Duration</a></span><span class="duration"><a href="#" class="mL30">Arrival</a></span><a href="javascript:void(0);"><span class="totalPrice mL15_pcnt" style="font-size:14px !important;">Price<span class="sortAro_up_icon mL5"></span></span></a> </li>
			         
    
							<flight:onewayflightnew isMultiCity = "false" flights="${flights}" tagName="allResult"/>
					  
			    </ul>
					
			</div>
          </div>
	  </div>
    </section>

 <%-- </c:if> --%>