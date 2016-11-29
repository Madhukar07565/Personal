<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="traveler" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers"%>
  
  <span class="clearfix shopCardHrdrSec pD10 w100pcnt dB fL mB30"> 
			<span class="clearfix mB5 w100pcnt fL"> 
				<span class="fL mR5">
				<input type="checkbox"  />
				<label class="mB0">Book on <a href="javascript:void(0)"> Time limit</a>. Time Limit Expiry 15 June 2015, 2400 hrs GMT</label>
				</span> 
			</span>
			<span class="fS12_sm mB10 fL"><input type="checkbox" checked class="valign"><label>Make <a href="javascript:void(0);" onclick="popupwin('schedule','scheduleinner', 'fade')"> Part payment </a>(Confirm booking by paying minimum Rs. 1000.
						Balance to be paid before 9 June 15.  )</label></span>
			<span class="fR"><span class="rupee">Rs.</span>&nbsp;<input type="text" placeholder="1000" onchange="PopulateInput();"  id="insert"><p id="error"></p></span >
			<span class="clearfix mB5 mT10 w100pcnt fL"> <span class="fL mR5">
            <input type="checkbox" id="addInsurance" checked="checked"/>
            <label for="addInsurance" class="mB0">Add travel insurance from ICICI Lombard @ Rs 129/person. </label>
            </span> <a href="javascript:void(0)" class="fL">View benefits</a><span class=" srp_famount fR pD10 fS30 insurance_add"><span class="rupee">Rs</span>129</span> </span>
			<span class="mT10  fL" id="termsAndCond">
            <input type="checkbox" id="tAndC" />
            <label for="tAndC" class="mB0">I agree to the <a href="javascript:void(0)">Terms &amp; Conditions</a>. These passengers are between 2 &amp; 70 years of age</label>
            </span> </span>