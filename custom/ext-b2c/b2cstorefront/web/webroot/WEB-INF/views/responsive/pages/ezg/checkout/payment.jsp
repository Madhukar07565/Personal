<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/cart" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/ezg/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/cart" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="htmlmeta" uri="http://hybris.com/tld/htmlmeta" %>   
<%@ taglib prefix="tmpl" tagdir="/WEB-INF/tags/desktop/template" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<style type="text/css">
.dollar {
	display:none;
}

.partpay {
	display:none;
}

.fullpay {
	
}
</style>
        <div class="clearfix brdrBLitGry pTB10LR15">
          <div class="col_12 clearfix">
            <div class="fL mR20">
              <span class="fL alert alert-success mR20 dN" id="cCodeSuccessFlight">Coupon code applied successfully</span>
              <span class="fL alert alert-danger mR20 dN" id="cCodeFailFlight">Invalid coupon code</span>
               <span class="fL mR20">
                <input type="text" placeholder="Apply coupon code" id="cCodeFlight" onclick="showtooltip('cCodeFlight','alertAutoSug')" />
                </span>
                
                 <a href="javascript:void(0)" class="button button-primary fL mR10" onclick="ACC.payment.applyCoupon('cCodeFlight','cCodeSuccessFlight','cCodeFailFlight', 'orderTotalPrice')">Apply</a> 
               </div>
          </div>
        </div>
       <div class="clearfix pTB10LR15 ">
          <div class="fL fS18 fcGrn"> Choose your preferred mode of payment </div>
        </div>
       <div class="clearfix mB40 brdrBLitGry pTB10LR15">
          <div class="col_12">
            <div class="fL mR20">
              <label class="mR20 label">Pay </label>
              <input type="text" class="w250" placeholder="Minimum payment Rs 2000/-" />
              <span>&amp; balance later</span> </div>
            <div class="fL mT5"> <a href="javascript:void(0)">Learn more</a> </div>
          </div>
        </div>

        <div class="col_8 col_sm_12 tab">
          <section class="mB40 tabs" id="selectionTable">
            <ul class="tabLinks clearfix">
             <%--
	            <c:if test="${paymentModeSetting.ezeeBalancesEnabled}">
				  <li class="sel fS13imp"><a href="#ezeebal">Ezee Balances</a></li>
				</c:if>
              --%>
              <li class="sel fS13imp"><a href="#creditcard">Credit cards</a></li>
              <li class="fS13imp"><a href="#debitcard">Debit card</a></li>
              <li class="fS13imp"><a href="#netbanking">Net banking </a></li>
              <li class="fS13imp"><a href="#emi">On EMI</a></li>
              <c:if test="${paymentModeSetting.cashOnDeliveryEnabled}">
              	<li class="fS13imp"><a href="#cod">Cash on delivery</a></li>
              </c:if>
            </ul>
            <div class="tabbedForm tabsContent mB20">
            <%--
            
			<article id="ezeebal"  class="tabContainer clearfix pD20" name="ezeebal">
			
				<span class="clearfix">Available balance in your account <span class="mL10"><span class="rupee">Rs.</span><fmt:formatNumber value="${ezeeBalance.remainingAmount}" pattern="#,#00.#"/></span><br>
				<span class="clearfix"><span class="clearfix">Do you wish to utilize this amount for your booking?</span></span>
				<br>
                <div class="fieldRow clearfix mB20">
                  <label>Enter amount</label>
                  <div class="fL mR20">
                    <input type="text" id="ezeeAmount" placeholder="Rs. 2000" />
                  </div>
                </div>
                <a class="tC button button-primary fL" href="javascript:void(0)" onclick="ACC.payment.ezeePay()">Confirm</a>
              </article>
              --%> 
              <article id="creditcard" class="tabContainer clearfix pD20" name="creditcard">
                <div class="fieldRow clearfix mB20">
				<%-- 
				<p class="txtClrRed clearfix mB15" style="display:none;">Your Card Details are invalid!</p>
                  <label>Credit card number</label>
                  <div class="fL mR20">
                    <input type="text" id="card_number" placeholder="Enter number" />
                  </div>
                  <div class="fL"> <span class="ezeeWallet_icon"></span> </div>
                  <div class="fL mT5 mR20 dB" id="cardNumber"> <a href="javascript:void(0)" onClick="showtooltip('cardNumber','visaListing')">EzeeWallet</a> </div>
                  <div class="fL visa_icon mR10 mT5"></div>
                  <div class="fL amex_icon mR10 mT5"></div>
                  <div class="fL mastercard_icon mR10 mT5"></div>
                </div>
                <div class="fieldRow clearfix mB20">
                  <label>Card holder</label>
                  <div class="fL">
                    <input type="text" class="w250" placeholder="Enter name" />
                  </div>
                </div>
                <div class="fieldRow clearfix mB20">
                  <label>Expiry Date</label>
                  <select class="fL mR10">
                    <option>Jan</option>
                    <option>Feb</option>
                    <option>Mar</option>
                    <option>Apr</option>
                    <option>May</option>
                  </select>
                  <select class="fL">
                    <option>2014</option>
                    <option>2015</option>
                    <option>2016</option>
                    <option>2017</option>
                    <option>2018</option>
                  </select>
                </div>
                <div class="fieldRow clearfix mB20">
                  <label>CVV</label>
                  <div class="fL clearfix">
                    <div class="mB20 clearfix w100pcnt">
                      <input type="text"/>
                    </div>
                    <div class="clearfix mB5">
                      <div class="fL mR20"><img src="${ezgImagesPath }/common/cvv.png" alt="cvv" /></div>
                      <div class="fL fS12 w250">The CVV is the last 3-digits printed on the signature panel on the back of the card.</div>
                    </div>
                    <span class="bkgLitBlu pD5 fS12">Convenience fee of Rs 100 is applicable</span> </div>
                </div>
                <div class="fieldRow clearfix">
                  <input type="checkbox" id="saveThis" />
                  <label for="saveThis" class="w100pcnt">Save this credit card details to and make single-click payments</label>
                </div> 
                --%>
				<div class="w100pcnt dB clearfix">
					<div class="mT20">
						<span class="fW600 cB">Choose your card</span></label>
					</div>
				</div>	
				<ul class="col_12 mB10 dB clearfix mT20 pL0 pR0">
					<c:forEach items="${paymentModeSetting.supportedCreditCardTypes}" var="entry" varStatus="status">
						<li class="col_2 pL0 pR0">
							<span class="fL">
								<input type="radio" name="creditcard" value="${entry}" class="mT8 mL2 fL L0" paymentGatewayId="paytm"/>
								<label class="fL mR5 w20pcnt">&nbsp;</label>
								<img src="${ezgImagesPath }/${entry}.png" alt="${fn:toUpperCase(entry)}" class="fL mT5 w35pcnt"/>
							</span>
						</li>
					</c:forEach>
				</ul>
              </article>
              <article class="dN pD20 tabContainer" id="debitcard" name="debitcard">
				<div class="fieldRow clearfix mB20">
                  <label>Debit card number</label>
                  <div class="fL mR20">
                    <input type="text" id="card_number1" placeholder="Enter number" />
                  </div>
                  <div class="fL"> <span class="ezeeWallet_icon"></span> </div>
                  <div class="fL mT5 mR20 dB" id="cardNumber1"> <a href="javascript:void(0)" onClick="showtooltip1('cardNumber1','visaListing1')">EzeeWallet</a> </div>
                  <div class="fL visa_icon mR10 mT5"></div>
                  <div class="fL amex_icon mR10 mT5"></div>
                  <div class="fL mastercard_icon mR10 mT5"></div>
                </div>
                <div class="fieldRow clearfix mB20">
                  <label>Card holder</label>
                  <div class="fL">
                    <input type="text" class="w250" placeholder="Enter name" />
                  </div>
                </div>
                <div class="fieldRow clearfix mB20">
                  <label>Expiry Date</label>
                  <select class="fL mR10">
                    <option>Jan</option>
                    <option>Feb</option>
                    <option>Mar</option>
                    <option>Apr</option>
                    <option>May</option>
                  </select>
                  <select class="fL">
                    <option>2014</option>
                    <option>2015</option>
                    <option>2016</option>
                    <option>2017</option>
                    <option>2018</option>
                  </select>
                </div>
                <div class="fieldRow clearfix mB20">
                  <label>CVV</label>
                  <div class="fL clearfix">
                    <div class="mB20 clearfix w100pcnt">
                      <input type="text"/>
                    </div>
                    <div class="clearfix mB5">
                      <div class="fL mR20"><img src="${ezgImagesPath }/common/cvv.png" alt="cvv" /></div>
                      <div class="fL fS12 w250">The CVV is the last 3-digits printed on the signature panel on the back of the card.</div>
                    </div>
                    <span class="bkgLitBlu pD5 fS12">Convenience fee of Rs 100 is applicable</span> </div>
                </div>
                <div class="fieldRow clearfix">
                  <input type="checkbox" id="saveThis1" />
                  <label for="saveThis" class="w100pcnt">Save this credit card details to and make single-click payments</label>
                </div>
				<div class="w100pcnt dB clearfix">
					<div class="mT20">
						<span class="fW600 cB">Choose your card</span></label>
					</div>
				</div>	
				<ul class="col_12 mB10 dB clearfix mT20 pL0 pR0">
					<c:forEach items="${paymentModeSetting.supportedDebitCardTypes}" var="entry" varStatus="status">
						<li class="col_2 pL0 pR0">
							<span class="fL">
								<input type="radio" name="debitcard" value="${entry}" class="mT8 mL2 fL L0"/>
								<label class="fL mR5 w20pcnt">&nbsp;</label>
								<img src="${ezgImagesPath }/${entry}.png" alt="${fn:toUpperCase(entry)}" class="fL mT5 w35pcnt"/>
							</span>
						</li>
					</c:forEach>
				</ul>
			  </article>
              <article class="dN pD20 tabContainer" id="netbanking" name="netbanking">
				<div class="fieldRow clearfix mB20">
					<p class="clearfix mB15">Popular banks</p>
					<div class="clearfix col_12">
						<ul class="clearfix col_12">
							<c:set var="endIndex" value="5"/>
							<c:if test="${fn:length(paymentModeSetting.supportedNetBankingCardTypes) lt 6}">
								<c:set var="endIndex" value="${fn:length(paymentModeSetting.supportedNetBankingCardTypes)-1}"/>
							</c:if>
							<c:forEach items="${paymentModeSetting.supportedNetBankingCardTypes}" var="entry" begin="0" end="${endIndex}" varStatus="status">
								<li class="col_4">
									<input type="radio" name="netbanking"><label><img src="${ezgImagesPath }/${entry}.png" alt="${fn:toUpperCase(entry)} Bank"></label>
								</li>
							</c:forEach>						
						</ul>
					</div>
					<div class="clearfix col_12">
					<ul class="clearfix col_12 mB20">
						<li class="col_4 mT10">All other banks</li>
						<li class="col_7">
							<select class="w100pcnt" name="netbanking">
								<c:if test="${fn:length(paymentModeSetting.supportedNetBankingCardTypes) gt 6}">
									<c:forEach items="${paymentModeSetting.supportedNetBankingCardTypes}" var="entry" begin="6" end="${fn:length(paymentModeSetting.supportedNetBankingCardTypes)-1}" varStatus="status">
										<option value="${entry}"><c:out value="${fn:toUpperCase(entry)}" /> Bank</option>
									</c:forEach>		
								</c:if>
								<!-- <option>Dena Bank</option>
								<option>Bank of India</option>
								<option>Union Bank</option>
								<option>Punjab National Bank</option>
								<option>TJSB Bank</option> -->
							</select>
						</li>
						</ul>
						<P class="bkgLitBlu pD5 fS12 w45pcnt mL30">Convenience fee of Rs 100 is applicable</P>
					</div>
					
				</div>
			  </article>
               <article class="dN pD20 tabContainer" id="emi" name="emi">
				<div class="fieldRow clearfix mB20">
					<label>Select a bank</label>
					<div class="mR20">
							<select id="selectbank" name="emicard">
								<c:forEach items="${paymentModeSetting.supportedEmiCardTypes}" var="entry"  varStatus="status">
									<option value="${entry}">
										<c:choose>
											<c:when test="${entry eq 'axis'}">
												<c:out value="Axis" /> 
											</c:when>
											<c:when test="${entry eq 'citi'}">
												<c:out value="Citi" /> 
											</c:when>
											<c:when test="${entry eq 'kotak'}">
												<c:out value="Kotak Mahindra" /> 
											</c:when>
											<c:otherwise>
												<c:out value="${fn:toUpperCase(entry)}" /> 	
											</c:otherwise>
										</c:choose>
										Bank</option>
								</c:forEach>	
							</select>
					</div>
				</div>
				<div class="clearfix col_12 dN" id="city">
					<ul class="clearfix col_12">
						<li class="col_4 mL16pcnt">
							<input type="radio" name="choosebank"><label><span class="fW600">3 Months</span><br>
							<span class="mL30">Rs 7,289/month</span></label>
						</li>
						<li class="col_4"><input type="radio" name="choosebank"><label><span class="fW600">6 Months</span><br>
							<span class="mL30">Rs 4,289/month</span></label></li>
					</ul>
				</div>
					<div class="fieldRow clearfix mB20">	
                  <label>Credit  card number</label>
                  <div class="fL mR20">
                    <input type="text" id="card_number2" placeholder="Enter number" />
                  </div>
                  <div class="fL"> <span class="ezeeWallet_icon"></span> </div>
                  <div class="fL mT5 mR20 dB" id="cardNumber2"> <a href="javascript:void(0)" onClick="showtooltip2('cardNumber2','visaListing2')">EzeeWallet</a> </div>
                  <div class="fL visa_icon mR10 mT5"></div>
                  <div class="fL amex_icon mR10 mT5"></div>
                  <div class="fL mastercard_icon mR10 mT5"></div>
                </div>
                
                <div class="fieldRow clearfix mB20">
                  <label>Expiry Date</label>
                  <select class="fL mR10">
                    <option>Jan</option>
                    <option>Feb</option>
                    <option>Mar</option>
                    <option>Apr</option>
                    <option>May</option>
                  </select>
                  <select class="fL">
                    <option>2014</option>
                    <option>2015</option>
                    <option>2016</option>
                    <option>2017</option>
                    <option>2018</option>
                  </select>
                </div>
				<div class="fieldRow clearfix mB20">
                  <label>Card holder</label>
                  <div class="fL">
                    <input type="text" class="w250" placeholder="Enter name" />
                  </div>
                </div>
                <div class="fieldRow clearfix mB20">
                  <label>CVV</label>
                  <div class="fL clearfix">
                    <div class="mB20 clearfix w100pcnt">
                      <input type="text"/>
                    </div>
                    <div class="clearfix mB5">
                      <div class="fL mR20"><img src="${ezgImagesPath }/common/cvv.png" alt="cvv" /></div>
                      <div class="fL fS12 w250">The CVV is the last 3-digits printed on the signature panel on the back of the card.</div>
                    </div>
                    <span class="bkgLitBlu pD5 fS12">Convenience fee of Rs 100 is applicable</span> </div>
                </div>
                <div class="fieldRow clearfix">
                  <input type="checkbox" id="saveThis2" />
                  <label for="saveThis" class="w100pcnt">Save this credit card details to and make single-click payments</label>
                </div>
				
			  </article> 
              <article class="dN pD20 tabContainer" id="cod" name="cod">
				
                <div class="fieldRow clearfix mB20">
				<p class="clearfix col_12">Enter your delivery address</p>
                  <ul class="col_12 pL0 pR0 clearfix mT10 mB10">
					<li class="col_12 clearfix">
						<input type="text" placeholder="Street" name="street" class="w100pcnt">
					</li>
					</ul>
					<ul class="col_12 pL0 pR0 clearfix mT10 mB10">
					<li class="col_6">
						<input type="text" placeholder="City" name="city"  class="w100pcnt">
					</li>
					<li class="col_6">
						<input type="text" placeholder="State" name="state" class="w100pcnt">
					</li>
					</ul>
					<ul class="col_12 pL0 pR0 clearfix mT10 mB10">
					<li class="col_6">
						<input type="text" placeholder="Pin/Zip Code" name="postalcode" class="w100pcnt">
					</li>
					<li class="col_6">
						<input type="text" placeholder="Country" name="country" class="w100pcnt">
					</li>
				  </ul>
				   <p class="bkgLitBlu pD5 fS12 mL20 w45pcnt">Convenience fee of Rs 100 is applicable</p>
                </div>
			  </article>
            </div>
            <div class="clearfix">
              <input type="checkbox" id="tandC2" />
              <label for="tandC2" class="fS12">I understand and agree to  the rules and restrictions of this fare, <a href="javascript:void(0)">Booking Policy</a> and <a href="javascript:void(0)">Terms and Conditions</a> </label>
            </div>
          </section>
        </div>
        <div class="col_4 col_sm_12">
          <div class="boxContr clearfix mT40 ">
            <div class="header clearfix title">
              <div class=" fS18">Booking Summary</div>
            </div>
            <div class="row mT15 ">
              <div class="col_12">
              	<c:if test="${not empty cartData }">
          			<c:set var="cartTotalPrice" value="0"></c:set>
          			<c:set var="cartPayNowPrice" value="0"></c:set>
              		<c:forEach items="${cartData.entries }" var="entry">
              			<c:if test="${flightEntry }">
              				   <div class="row brdrBGrey mB10">
				                  <div class="mB20  clearfix">
				                    <div class="col_8  pR0">
				                      <div class="fL mR10 mT5"> <img src="${ezgImagesPath }/srp_flight/indigo_sml_logo.jpg" alt="Indigo Logo"> </div>
				                      <div class="fL clearfix">
				                        <div class="clearfix"><span class="fL">DEL - MUM - DEL</span></div>
				                        <div class="fS12">1 Adult, 1 child</div>
				                        <div class="fS12">+ Domestic travel insurance</div>
				                      </div>
				                    </div>
				                    <div class="col_4 pL0 ">
				                      <div class="partpay tR">Pay Now <br/><span class="fS18"><span class="rupee">Rs </span>6,764</span></div>
				                      <div class=" tR">Total <br/><span class=""><span class="rupee">Rs </span>11,764</span></div>
				                    </div>
				                  </div>
				                </div>
              			</c:if>
              			<c:if test="${entry.orderEntryType == 'HOTEL' }">
              			<div class="row brdrBGrey mB10">
		                  <div class="mB20  clearfix">
		                    <div class="col_8  pR0">
		                      <div class="fL mR10 mT5"><span class="diy_hotel_icon margin0  "></span>  </div>
		                      <div class="fL clearfix">
		                        <div class="clearfix">
		                        	<span class="fL"> 
		                        		${entry.orderEntryInfoData.hotelDetailInfoData.hotelName}
		                        	</span>
		                        </div>
								<c:set var="entryTotalPrice" value="0"></c:set>
								<c:set var="entryPayNowPrice" value="0"></c:set>
		                        <c:if test="${entry.orderEntryType == 'HOTEL' }">
		                        	<c:set var = "numberOfRooms" value="${fn:length(entry.entries)}"></c:set>
		                        	<c:set var = "totalNumberOfAdult" value="0"></c:set>
		                        	<c:set var = "totalNumberOfChild" value="0"></c:set>
			                        <c:forEach items="${entry.entries }" var="roomi">
										<c:set var="entryTotalPrice" value="${entryTotalPrice + roomi.totalPrice.value}"></c:set>
										<c:set var="entryPayNowPrice" value="${entryPayNowPrice + roomi.totalPrice.value}"></c:set>
										<c:set var="totalNumberOfAdult" value="${totalNumberOfAdult + roomi.orderEntryInfoData.roomDetailInfoData.numberOfAdult}"></c:set>
										<c:set var="totalNumberOfChild" value="${totalNumberOfChild + roomi.orderEntryInfoData.roomDetailInfoData.numberOfChild}"></c:set>
			                        </c:forEach>
				                    <div class="fS12">${numberOfRooms} Rooms | ${totalNumberOfAdult} Adults, ${totalNumberOfChild} Child </div>
		                        </c:if>
		                      </div>
		                    </div>
		                    <div class="col_4 pL0 ">
		                      <div class="partpay tR">Pay Now <br/><span class="fS18"><span class="rupee">Rs </span> <span class="dollar">$</span>${entryTotalPrice }</span></div>
		                      <div class=" tR">Total <br/><span class=""><span class="rupee">Rs </span> <span class="dollar">$</span>${entryPayNowPrice }</span></div>
		                   	  <c:set var = "cartTotalPrice" value="${cartTotalPrice+ entryTotalPrice}" ></c:set>
		                   	  <c:set var = "cartPayNowPrice" value="${cartPayNowPrice+ entryPayNowPrice}" ></c:set>
		                    </div>
		                  </div>
		                </div>
		                </c:if>
						<c:if test="${entry.orderEntryType == 'FLIGHT_GROUP' }">
							<c:forEach items="${entry.entries }" var="flighti">
		              			<div class="row brdrBGrey mB10">
				                  <div class="mB20  clearfix">
				                    <div class="col_8  pR0">
				                      <div class="fL mR10 mT5"><span class="diy_hotel_icon margin0  "></span>  </div>
				                      <div class="fL clearfix">
				                        <div class="clearfix">
				                        	<span class="fL"> 
				                        		<c:set var="commonFlightInfo" value="${flighti.orderEntryInfoData.flightDetailInfoData.commonFlightInfoData}"></c:set>
				                        		<c:set var="flightDetailInfoData" value="${flighti.orderEntryInfoData.flightDetailInfoData}"></c:set>
				                        		${commonFlightInfo.fromCity}-${commonFlightInfo.toCity}
				                        		<%-- ${flighti.orderEntryInfoData.sequence} --%>
				                        	</span>
				                        </div>
				                        
				                        
										<c:set var="entryTotalPrice" value="0"></c:set>
										<c:set var="entryPayNowPrice" value="0"></c:set>
										<c:set var="entryTotalPrice" value="${entryTotalPrice + flightDetailInfoData.priceInfo.costPrice }"></c:set>
										<c:set var="entryPayNowPrice" value="${entryPayNowPrice + flightDetailInfoData.priceInfo.costPrice }"></c:set>
										
			                        	<c:set var = "totalNumberOfAdult" value="0"></c:set>
			                        	<c:set var = "totalNumberOfChild" value="0"></c:set>
				                        <c:forEach items="${flighti.entries}" var="ticketi">
											<c:if test="${ticketi.orderEntryInfoData.ticketDetailInfoData.passengerType.code == 'ADULT' }">
												<c:set var = "totalNumberOfAdult" value="${totalNumberOfAdult+1}"></c:set>
											</c:if>
											<c:if test="${ticketi.orderEntryInfoData.ticketDetailInfoData.passengerType.code == 'CHILD' }">
												<c:set var = "totalNumberOfChild" value="${totalNumberOfChild+1}"></c:set>
											</c:if>
											<c:if test="${ticketi.orderEntryInfoData.ticketDetailInfoData.passengerType.code == 'INFANT' }"></c:if>
				                        </c:forEach>
					                    <div class="fS12">${totalNumberOfAdult} Adults, ${totalNumberOfChild} Child </div>
				                      </div>
				                    </div>
				                    <div class="col_4 pL0 ">
				                      <div class="partpay tR">Pay Now <br/><span class="fS18"><span class="rupee">Rs </span> <span class="dollar">$</span>${entryTotalPrice }</span></div>
				                      <div class=" tR">Total <br/><span class=""><span class="rupee">Rs </span> <span class="dollar">$</span>${entryPayNowPrice }</span></div>
				                   	  <c:set var = "cartTotalPrice" value="${cartTotalPrice+ entryTotalPrice}" ></c:set>
				                   	  <c:set var = "cartPayNowPrice" value="${cartPayNowPrice+ entryPayNowPrice}" ></c:set>
				                    </div>
				                  </div>
				                </div>
			                </c:forEach>
		                </c:if>		                
              		</c:forEach>
              	</c:if>
              </div>
            </div>
			  <div class="clearfix pT10     ">
            <div class="fL pT10 partpay"> Pay Now </div>
            <div class="fR  fS30 partpay"> <span class="rupee">Rs.</span> <span class="dollar">$</span><span id="orderPayNowPrice"><fmt:formatNumber value="${cartPayNowPrice}" pattern="#,#00.##"/></span> </div>
            <div class="fL pT10 "> Total </div>
            <div class="fR  fS30 "> <span class="rupee">Rs.</span> <span class="dollar">$</span><span id="orderTotalPrice">${cartTotalPrice}</span> </div>
			<input type="hidden" id="orderPrice" value='<c:out value="${cartTotalPrice}"></c:out>'>
          </div>
		 	 <a href="javascript:void(0);" style="display:none;" class=" fS12 pB15 fR clearfix">Balance payment Schedule</a>
          </div>
		  
        
          <div class="clearfix"> 
          <form:form method="post" id="ezgPaymentForm"   action="${contextPath}/checkout/multi/payment/placeOrder">
			<input type="hidden" maxlength="3" size="1" id="qty" name="securityCode" class="qty js-qty-selector-input" value="325">
			<input type="hidden" name="termsCheck" value="true"/><!-- ${product.code} -->
			
		  </form:form>
		  <form:form method="post" id="codPaymentForm"   action="${contextPath}/checkout/multi/payment/cod">
		  </form:form>
			<!-- <a id="paymentLink" class="w120 mT20 tC button button-primary fR"  href="javascript:void(0)">Pay</a> -->
			<a id="payNow" class="w120 mT20 tC button button-primary fR"  href="javascript:void(0)" onclick="ACC.payment.addPaymentMethod()">Pay</a>
			<div id="silentOrderPostFormWrapper">
			
			</div>
			<div id="hostedOrderPostFormWrapper">
			
			</div>
          </div>
          <div class="clearfix" id="cartSummary" style="display:block;">
					<input type="hidden" name="cartCode" value="${cartData.code}">
              		<input type="hidden" name="currency" value="${cartData.totalPrice.currencyIso}">
              		<input type="hidden" name="payNowAmount" value="${cartData.totalPrice.value}">             
          	<jsp:include page="/checkout/multi/payment/paymentgateways" />  
		  </div>          
        </div>