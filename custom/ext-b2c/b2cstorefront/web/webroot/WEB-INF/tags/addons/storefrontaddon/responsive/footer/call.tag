<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

  <div class="white_bg pT10 pB10 dN" id="calldetails">
  <div class="container">
    <div class="col_12 clearfix col_12_sm fR grey_bg grey_border clearfix contrRow pD10 ">
	<div class="popup_close_icon fR clearfix" onclick="popupclose('calldetails', 'fade')"></div>
      <div class="col_12 pL0 w100pcnt">
        <div class="w100pcnt mT20 clearfix"><span class="call_icon mR10 fL"></span> <span class="fW600 fS21 fL">Click to Call</span><span class="fW600 fS21 fR">Call our travel experts at 1800 0000 0000 </span></div>
		<hr/>
		<div class="clearfix col_12">
		<div class="pR0 pL0 col_6 mT20">
					  <input type="text" class="w95pcnt" name="Destination" placeholder="Sector/Destination/Hotel" />
            </div>
			<div class="pR0 pL0 col_5 mT20 mL15">
					  <input type="text" class="w95pcnt" name="Destination" placeholder="Full Name"/>
            </div>
			</div>
			<div class="clearfix col_12">
		<div class="pR0 pL0 col_6 mT20">
					  <input type="text" class="w95pcnt" name="Destination" placeholder="Mobile Number"/>
            </div>
			<div class="pR0 pL0 col_5 mT20 mL15">
					  <input type="text" class="w95pcnt" name="Destination" placeholder="Email Address"/>
            </div>
			</div>
			<div class="fL mT15 mB15 mL20"><input type="checkbox" checked="checked"/><label class="label">I authorize Ezeego1.com to contact me</label></div>
			<div class="primaryBtn fR mT15 mB15"><a href="javascript:void(0);">Call</a></div>
      </div>
    </div>
  </div>
</div>