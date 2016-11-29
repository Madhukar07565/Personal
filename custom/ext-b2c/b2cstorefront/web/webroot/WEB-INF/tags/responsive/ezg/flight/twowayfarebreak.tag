<%@ tag language="java" pageEncoding="UTF-8"%>

<%@ attribute name="fareDetail" required="true" type="com.cnk.travelogix.common.facades.product.data.flight.FareDetailData" %>

<div class="col_6 mT20 pL10 pR10">
	<ul class=" fareBrkup">
		<li class="heading">FARE BREAKUP<span class="rupee fR">Rs</span></li>
		<li>Base fare<span class="fR">${fareDetail.baseFare}</span></li>
		<li>Fuel surcharge<span class="fR">${fareDetail.fuelSurcharge}</span></li>
		<li>JN Tax<span class="fR">${fareDetail.jnTax}</span></li>
		<li>Psgr. Svc. Fee<span class="fR">${fareDetail.psgrSvcFee}</span></li>
		<li class="mB25 clearfix">TOTAL<span
			class="fR fS22 fW600 tR">${fareDetail.fuelSurcharge + fareDetail.baseFare + fareDetail.jnTax + fareDetail.psgrSvcFee + fareDetail.serviceTax}<span
				class="fS12 fW400 dB">Refundable</span></span></li>
	</ul>
	<span class="mB10 mT5 fL clearfix"><span
		class="baggage_icon mR5 fL"></span><span
		class="fL fS12 w65pcnt">20kg baggage included</span></span> <span
		class="clearfix"><span class="food_small fL"></span><span
		class="fL mL5 fS12">Meals included</span></span>
</div>
<div class="col_6 expandedGrnCont pT10 pB10 pL10 pR10 dN">
	<ul class="flyBG clearfix">
		<li class="first"><input type="radio" id="fly2"
			checked="checked" name="flyBagSel" /> <label for="fly2">Only
				fly</label> <span class="mL30 fS22"><span class="rupee">Rs.
			</span>37,780</span></li>
		<li><input type="radio" id="flyBag2" name="flyBagSel" />
			<label for="flyBag2">Fly + Bag</label> <span
			class="fS22 mL30"><span class="rupee">Rs. </span>37,780</span>
		</li>
		<li><input type="radio" id="flyBagEat2" name="flyBagSel" />
			<label for="flyBagEat2">Fly + Bag + Eat</label> <span
			class="fS22 mL30"><span class="rupee">Rs. </span>37,780
		</span></li>
	</ul>
</div>
				