<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="ancillary" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/hotel/ancillary"%>

<div data-ancillarytype="wifi" >
	
</div>
<%-- 
<c:set var='templateWifiStart' value='<script id="templateWifi" type="text/ractive">'/><c:set var='templateWifiEnd' value='</script>'/>
<ul id="wifiele" class="fieldRow clearfix mB10"></ul>
${templateWifiStart}
	<li class="fL">
	<input type="checkbox" value="checked" class="ancillary1" name="wifi">
         <label class="fS12">Wi Fi</label>
    </li>
    <li class="fL ancillaryshow dN" id="wifiDuration">
      <select id="ancillary2" name="wifiDuration" class="fL mR10">
        <option>Duration</option>
        {{#each wifidays:num}}
        	<option value="{{num+1}}">{{num+1 }} day</option>
        {{/each}}
      </select>
     </li>
	<li class="fR dN" id="wifiPrice">
	   <div class="ancillaryshow">
	   <span class="fS16 srp_famount fR pD10"> <span class="rupee">Rs</span>11,764 </span>
	   </div>
	</li>
${templateWifiEnd} --%>
