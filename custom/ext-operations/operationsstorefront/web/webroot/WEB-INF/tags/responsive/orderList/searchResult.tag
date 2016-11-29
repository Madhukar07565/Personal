<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ attribute name="orderList" required="true" type="java.util.ArrayList" %>

<!--Displaying Orders according to the HTML template  -->
	
   
	<!-- Search result table content starts here-->
          <div class="row">
                <p> </p>
          </div>
          <div class="row">
                    <div class="panel panel-default">
                        <div class="panel-heading titleBold">Search Result</div>
                    <table class="table table-bordered">
                    <thead class="contentText tabHead">
                       
                    <tr>
                        <th colspan ="1" rowspan="2" width="10px">
                            <label class="checkbox-inline">
                                <input type="checkbox" value="">Select All
                            </label>
                        </th>
                        <th colspan="1"  rowspan="2">Booking Date & Time
                        <a href="#">
                          <span class="glyphicon glyphicon-filter"></span>
                        </a>
                        <a href="#">
                          <span class="glyphicon glyphicon-sort-by-alphabet"></span>
                        </a>
                        </th>
                        <th colspan="1" rowspan="2">Booking Ref No</th>
                        <th colspan="5" rowspan="1" class="centered">Client Details </th>
                                                

                    </tr>
                    <tr>
                        <th colspan ="1" rowspan="1">Client Name
                        <a href="#">
                          <span class="glyphicon glyphicon-filter"></span>
                        </a>
                        <a href="#">
                          <span class="glyphicon glyphicon-sort-by-alphabet"></span>
                        </a>
                        </th>
                        <th colspan="1"  rowspan="1">Client Type</th>
                        <th colspan="1" rowspan="1">Client Category
                        <a href="#">
                          <span class="glyphicon glyphicon-filter"></span>
                        </a>
                        <a href="#">
                          <span class="glyphicon glyphicon-sort-by-alphabet"></span>
                        </a>
                        </th>
                        <th colspan="1" rowspan="1">Client Sub-Category
                        <a href="#">
                          <span class="glyphicon glyphicon-filter"></span>
                        </a>
                        <a href="#">
                          <span class="glyphicon glyphicon-sort-by-alphabet"></span>
                        </a>
                        </th>
                        <th colspan="1" rowspan="1">Point of Sales
                        <a href="#">
                          <span class="glyphicon glyphicon-filter"></span>
                        </a>
                        <a href="#">
                          <span class="glyphicon glyphicon-sort-by-alphabet"></span>
                        </a>
                        </th>
                    </tr>
    
                    </thead>
                    <tbody class="tabBody centered">
                    
                     <c:forEach items="${orderList}" var="order">
						
	       			
                    <tr>
                        <td colspan ="1" rowspan="1">
                        <label class="checkbox-inline">
                                <input type="checkbox" value="">
                        </label>
                        </td>
                        <td colspan ="1" rowspan="1" class="centered"><c:out value="${order.created}"/><br></td>
                        <td colspan ="1" rowspan="1" class="yelloIcon">
                            <a href="${request.contextPath}/order/${order.code}">
                                <span class="glyphicon glyphicon-unchecked yellowIcon"></span>
                                <c:out value="${order.code}"/></a></td>
                        <td colspan ="1" rowspan="1">-</td>
                        <td colspan ="1" rowspan="1">B2C</td>
                        <td colspan ="1" rowspan="1">-</td>
                        <td colspan ="1" rowspan="1">-</td>
                        <td colspan ="1" rowspan="1">Website</td>
                    </tr>  
                    </c:forEach>
                     
                       
                    </tbody>
                    </table>
                        </div>
           </div>
          </div></div>
          
          <!-- <div class="footer">
   				Footer conter here  ,  ..... Copyright (c) 2016
 		  </div> -->
           
          <%--  <br><br><hr>
           
           <c:forEach items="${orderList}" var="order">
				<c:out value="${order.created}"/>&nbsp &nbsp &nbsp <c:out value="${order.code}"/><hr>
	       </c:forEach> --%>
	
