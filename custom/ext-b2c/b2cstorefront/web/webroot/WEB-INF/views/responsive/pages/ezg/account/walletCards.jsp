<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<meta name="cardInfoList" value='${cardList}'/>
<meta name="monthList" value='${monthList}'/>
<meta name="cardTypeList" value='${cardTypeList}'/>

<script type="text/template" id="tempalteDisplayPart">
				 <ul class="clearfix mT20 mB20" data-number="<@-model.creditCardNumber@>">
					  <li class="col_2 pL0 pR0">
						  <span class="<@-model.__formatCardType(model.cardType)@>_icon"></span>
					  </li>
					  <li class="col_5 pL0 pR0">
						  <span class="fL"><spring:theme code="payment.cardNumber"/> : <@-model.creditCardNumber@></span><br/>
						  <span class="fL"><spring:theme code="payment.nameOnCard"/> : <@-model.cardholderName@></span><br/>
					 	  <span class="fL"><spring:theme code="payment.expiryDate"/> : <@=model.month -0 + 1 @>/<@-model.year@></span>
					  </li>
					  <li class="col_3 pL0 pR0">
						  <span class="edit_icon fL edit_card" data-cardNum="<@-model.creditCardNumber@>"></span>
						  <span class="recycle_icon_wishlist mL10 mT5 valign delete-card" data-cardNum="<@-model.creditCardNumber@>"></span>
					  </li>
				  </ul>
</script>


<script type="text/template" id="templateEditPart">
<div class="<@=model.mode@>_cardContr clearfix dN" data-number="<@-model.creditCardNumber@>">
<ul class="mT20 clearfix">
	<li class="col_3 pL0 pR0"><spring:theme code="payment.cardNumber"/></li>
	<li class="col_3 pL0 pR0">
        <input type="text" name="card_number" data-meta="<@=model.oMetaData.creditCardNumber@>" style="width:100%;"  <@-(model.mode === "edit")?"disabled":""@> value="<@=model.creditCardNumber>0?model.creditCardNumber:''@>">
	</li>
<li class="col_3 pL0 pR0 show-message lh30 txtClrRed"><span class="pL15 nowrapT" data-meta="<@=model.oMetaData.creditCardNumber@>"></span></li>
</ul>

<ul class="mT20 clearfix">
	<li class="col_3 pL0 pR0"><spring:theme code="payment.cardType"/></li>
	<li class="col_3 pL0 pR0">
       <select class="w100pcnt" name="card_type" data-meta="<@=model.oMetaData.cardType@>">
			<@ model.aCardTypeList.forEach(function(obj){@>
				<option value="<@-obj@>" <@-(model.cardType == obj)?"selected":""@> ><@-obj@></option>
			<@})@>
		</select>
	</li>
<li class="col_3 pL0 pR0 show-message lh30 txtClrRed"><span class="pL15 nowrapT" data-meta="<@=model.oMetaData.cardType@>"></span></li>
</ul>
<ul class="mT20 clearfix">
	<li class="col_3 pL0 pR0"><spring:theme code="payment.nameOnCard"/></li>
	<li class="col_3 pL0 pR0">
		<input type="text" class="w100pcnt" data-meta="<@=model.oMetaData.cardholderName@>" name="name_on_card" value="<@- _.escape(model.cardholderName)@>"/>
	</li>
	<li class="col_3 pL0 pR0 show-message lh30 txtClrRed"><span class="pL15 nowrapT" data-meta="<@=model.oMetaData.cardholderName@>"></span></li>
</ul>
<ul class="mT20 clearfix">
	<li class="col_3 pL0 pR0"><spring:theme code="payment.expiryDate"/></li>
	<li class="col_3 pL0 pR0">
		<select class="w100pcnt" name="validate_month" data-meta="<@=model.oMetaData.month@>">
			<@ model.aMonthList.forEach(function(obj){@>
				<option value="<@-obj.key@>" <@-(model.month == obj.key)?"selected":""@> ><@-obj.value@></option>
			<@})@>
		</select>
	</li>
	<li class="col_3 pL0 pR0 mL10">
		<select class="w100pcnt" name="validate_year" data-meta="<@=model.oMetaData.month@>">

			<@ model.aYearList.forEach(function(obj){@>
				<option value="<@-obj@>" <@-(model.year == obj)?"selected":""@> ><@=obj@></option>
			<@})@>

		</select>
	</li>
	<li class="col_2_half pL0 pR0 show-message lh30 txtClrRed nowrapT"><span class="pL15 " data-meta="<@=model.oMetaData.month@>"></span></li>
</ul>
<ul class="mT20 clearfix">
	<li class="col_3 pL0 pR0">CVV</li>
	<li class="col_3 pL0 pR0">
		<input type="text" class="w100pcnt" name="CVV" data-meta="<@=model.oMetaData.cvv@>" value="<@-model.cvv@>">
	</li>
	<li class="col_3 pL0 pR0 show-message lh30 txtClrRed"><span class="pL15 nowrapT" data-meta="<@=model.oMetaData.cvv@>"></span></li>
</ul>
<p class="clearfix mT20 fR"><span class="primaryBtn"><a href="#" class="save-card <@-model.mode@>-card" data-save-card="<@-model.creditCardNumber@>"><spring:theme code="button.save.card"/></a></span></p>
</div>
</script>


		<article class="tabContainer clearfix pD20" id="cards"> 	 
			  <p class="clearfix mT20 mB20 fS18">Introducing single click travel bookings</p>
		  <p class="clearfix">Store your card details and spare yourself the tedium of typing every time. Your payment information is securely protected with 128 bit encryption and can not be misused.<br/>Use Wallet for safe, blazingly fast bookings</p>
		  <p class="bkgDrkGry clearfix mT20 mB20"><img src="${ezgImagesPath}/custom/lock_icon.jpg" alt="lock icon" class="fL mR20" /><span class="tC"><span class="fW600">100% Security Guaranteed</span><br/> Your card details will be stored using world-class encryption technology<br/>Our payment system is PCI DSS certified (a highly stringent data security standard followed by VISA, MasterCard and Amex)</span></p>
		  <h4>Your Card Details</h4>
		  <%-- show card lists put here--%>
		  <div class="list-content"></div>
		  
		  <hr/>
		   <a href="javascript:void(0);" class="add_card clearfix mB20">
			<span class="addIcon mR5 fL"></span> 
			<span class="posR fL"><spring:theme code="wallet.add.another"/></span> 
		   </a>
		   <%-- add card frame put here--%>
		 <div class="add-card-frame"></div>
		
	</article>
	 <div class="white_content" id="confirmation-dialog" style="display:none; position:fixed">
    <div class="white_content_inner popupSml">
      <div class="closeBtn_popup fR m-cancel"></div>
      <div class="fS20 mB10"><spring:theme code="wallet.delete.card.title"/></div>
	  <p class="clearfix"><spring:theme code="wallet.delete.card.desc"/></p>
      <span class="smlBtn fL mT20"><a href="javascript:void(0);" class="m-confirm"><spring:theme code="button.text.confirm"/></a></span>
	  <span class="smlBtn fL mL10 mT20 "><a href="javascript:void(0);" class="m-cancel"><spring:theme code="checkout.multi.cancel"/></a></span>
      
      <div class="cB"></div>
    </div>
  </div>
            