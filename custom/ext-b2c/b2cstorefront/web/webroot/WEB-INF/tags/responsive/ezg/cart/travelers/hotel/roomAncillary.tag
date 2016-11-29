<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>

<%@ attribute name="roomInfo" required="true" type="com.cnk.travelogix.common.core.cart.data.OrderRoomDetailInfoData" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="ancillary" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/hotel/ancillary"%>

<div class="fieldRow clearfix mB20">
	<div class="clearfix">
		<div class="fL">
			<div class="fW600 fS16 clearfix">
				<span class="fL tL">Ancillary Name</span>
				<span class="fR tR">Price <span class="fS12">(All Inclusive)</span></span>
			</div>
                       <ancillary:wifi/>
                        
                        <ancillary:carparking/>
								
						<ancillary:petstay/>
						
						<ancillary:latecheckout/>
						<ancillary:earlycheckin/>
						
						<ancillary:breakfast/>
						
						<ancillary:restaurant/>
						
						<ancillary:spa/>
						
						<ancillary:transfer/>
						
						<ancillary:activity/>
						
						<ancillary:equipment/>
						
                        <ancillary:specialrequest/>
		</div>
	</div>
</div>