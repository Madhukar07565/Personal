<%@ tag language="java" pageEncoding="UTF-8"%>

<%@ attribute name="fare1" required="true" type="com.cnk.travelogix.common.facades.product.data.flight.FareDetailData" %>
<%@ attribute name="fare2" required="true" type="com.cnk.travelogix.common.facades.product.data.flight.FareDetailData" %>

	<ul class=" fareBrkup">
		<li class="heading">FARE BREAKUP<span class="rupee fR">Rs</span></li>
		<li>Base fare<span class="fR">${fare1.baseFare + fare2.baseFare }</span></li>
		<li>Fuel surcharge<span class="fR">${fare1.fuelSurcharge + fare2.fuelSurcharge }</span></li>
		<li>JN Tax<span class="fR">${fare1.jnTax + fare2.jnTax }</span></li>
		<li>Psgr. Svc. Fee<span class="fR">${fare1.psgrSvcFee + fare2.psgrSvcFee }</span></li>
		<li class="mB25 clearfix">TOTAL<span
			class="fR fS22 fW600 tR">${fare1.baseFare + fare1.fuelSurcharge + fare1.jnTax + fare1.psgrSvcFee +
			fare2.baseFare + fare2.fuelSurcharge + fare2.jnTax + fare2.psgrSvcFee + fare1.serviceTax + fare2.serviceTax}<span
				class="fS12 fW400 dB">Refundable</span></span></li>
	</ul>