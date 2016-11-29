<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!--=== email panel ===-->
  <div class="white_bg pT10 pB10 dN" id="emaildetails">
  <div class="container">
    <div class="col_12 clearfix col_12_sm fR grey_bg clearfix contrRow pD10 " >
	<div class="popup_close_icon fR clearfix" onclick="popupclose('emaildetails', 'fade')"></div>
      <div class="col_12 pL0 w100pcnt">
      
      <h3 class="fS16 mT10"><span class="email_icon fL valign mR10"></span><strong>Get in touch</strong><span class=" fR valign"> <strong>Call our travel experts at 1800 0000 0000</strong></span></h3>
      <hr class="clearfix"/>
	  <ul class="col_12 mB10 clearfix mT10">
	  <li class="col_3"><input type="text" placeholder="Full Name" class="w100pcnt"/></li>
	  <li class="col_3"><input type="text" placeholder="Sector/Destination/Hotel" class="w100pcnt"/></li>
	  
	 
	  <li class="col_3"><input type="text" placeholder="Mobile Number" class="w100pcnt"/></li>
	  <li class="col_3"><input type="text" placeholder="Email Address " class="w100pcnt"/></li>
	  </ul>
	  <p class=" col_3 pL40 clearfix mB10">What would you like to get in touch about?</p>
	  <p class=" col_9 pL40 clearfix mB10 flightWayTab">
	  <span id="emailTab1"  class="sel"><a href="#" class="button button-primary fL pD5 mR15 mT10" onclick="mail('emailTab1','emailContr1')">Feedback</a></span>
	  <span id="emailTab2"><a href="#" class="button button-primary fL pD5 mR15 mT10" onclick="mail('emailTab2','emailContr2')">Enquiry</a></span>
	  <span id="emailTab3"><a href="#" class="button button-primary fL pD5 mR15 mT10" onclick="mail('emailTab3','emailContr3')">Idea</a></span>
	  <span id="emailTab4"><a href="#" class="button button-primary fL pD5 mR15 mT10" onclick="mail('emailTab4','emailContr4')">Question</a></span>
	  <span id="emailTab5"><a href="#" class="button button-primary fL pD5 mR15 mT10" onclick="mail('emailTab5','emailContr5')">Praise</a></span>
	  <span id="emailTab6"><a href="#" class="button button-primary fL pD5 mR15 mT10" onclick="mail('emailTab6','emailContr6')">Complaint</a></span>
	  </p>
	  <div id="emailContr1">
			<span  class="pL40 ">Type of Feedback</span>
			<span><select class="w20pcnt">
                <option value="feedback">Service</option>
				<option value="feedback">function</option>
				<option value="feedback">Technology</option>
				<option value="feedback">Staff/Personnel</option>
				</select>
			</span><br />
			<p class="pL40 clearfix mB5 mT15">Enter your message or feedback below</p>
			<p class="pL40 clearfix mB5 mT15">
			<textarea rows="4" cols="63"></textarea>
			</p>
	  </div>
	  <div id="emailContr2" class="dN">
		<p class="pL40 clearfix mB5 mT10">Enter your message or feedback below</p>
			<p class="pL40 clearfix mB5 mT15">
			<textarea rows="4" cols="63"></textarea>
			</p>
	  </div>
	  <div id="emailContr3" class="dN">
		<p class="pL40 clearfix mB5 mT10">Enter your message or feedback below</p>
			<p class="pL40 clearfix mB5 mT15">
			<textarea rows="4" cols="63"></textarea>
			</p>
	  </div>
	  <div id="emailContr4" class="dN">
		<p class="pL40 clearfix mB5 mT10">Enter your message or feedback below</p>
			<p class="pL40 clearfix mB5 mT15">
			<textarea rows="4" cols="63"></textarea>
			</p>
	  </div>
	  <div id="emailContr5" class="dN">
		<p class="pL40 clearfix mB5 mT10">Enter your message or feedback below</p>
			<p class="pL40 clearfix mB5 mT15">
			<textarea rows="4" cols="63"></textarea>
			</p>
	  </div>
	  <div id="emailContr6" class="dN">
	  <span  class="pL40 ">Type of Complaint</span>
			<span><select class="w20pcnt">
                <option value="feedback">Supplier</option>
				<option value="feedback">function</option>
				<option value="feedback">Technology</option>
				<option value="feedback">Competition</option>
				</select>
			</span><br />
			<p class="pL40 clearfix mB5 mT10">Enter your message or feedback below</p>
			<p class="pL40 clearfix mB5 mT15">
			<textarea rows="4" cols="63"></textarea>
			</p>
	  </div>
	  
	  <p class="mT10 clearfix">
	  <a href="javascript:void(0);" class="button button-primary fR">Send</a>
	  </p>
	  
    
      </div>
    </div>
  </div>
</div>