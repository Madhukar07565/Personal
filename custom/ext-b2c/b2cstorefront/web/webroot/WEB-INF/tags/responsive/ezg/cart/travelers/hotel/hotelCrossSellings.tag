<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="traveler" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers"%>

<c:if test="${haveCrossSellings }">
            <!-- Add additional to your trip begins here-->
            <div class="clearfix pB30">
              <div class="col_2 fL fS18 fcGrn"> Add to your Trip </div>
              <div class="col_10">
                <div class="tC fL mR20">
                  <div class="additionalOptions mB10"> <span class="car_xl mB10"></span>
                    <div>Airport transfers <br />
                      @ <span class="rupee">Rs.</span>600 / person</div>
                  </div>
                  <a href="javascript:void(0)" class="w100pcnt button button-primary">Add</a> </div>
                
              </div>
			  
            </div>
            <!-- Add additional to your trip ends here --> 
            </c:if>