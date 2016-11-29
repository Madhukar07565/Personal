<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>

<%@ attribute name="flightTraveler" required="false" type="com.cnk.travelogix.common.core.cart.data.FlightTravellerData"%>
<%@ attribute name="orderTicketInfo" required="true" type="com.cnk.travelogix.common.core.cart.data.OrderTicketInfoData"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="flight"
	tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/flight"%>
	
              <div class="col_10 pR0">
                <div class="formContainer clearfix fL">
                  <div class="posR">
                    <ul class="fieldRow mB20 clearfix">
                      <li class="fL">
                        <label>Traveller name*</label>
                      </li>
                      <li class="fL mR10">
                       <flight:flightTravelerTitle travelerTitle="${flightTraveler.title}"/>
                      </li>
                      <li class="fL mR10 w120">
                        <input type="text" class="fL w100pcnt" placeholder="First name" id="firstName" name="firstName" value="${flightTraveler.firstName}"/>
                      </li>
                      <li class="fL mR10 w120">
                        <input type="text" class="fL w100pcnt" placeholder="Middle name(optional)" name="middleName"  value="${flightTraveler.middleName}"/>
                      </li>
                      <li class="fL w120">
                        <input type="text" class="fL w100pcnt" placeholder="Last name" id="lastName" name="lastName" value="${flightTraveler.lastName}" />
                      </li>
                    </ul>
                  </div>
                  <flight:flightBirthday/>
                  <ul class="fieldRow mB20 clearfix">
                    <li class="fL">
                      <label>Passport Number*</label>
                    </li>
                    <li class="fL" style="width:20%">
                      <input type="text" name="passportNumber" placeholder="Enter passport number" value="${flightTraveler.passportNumber}"  />
                    </li>
                  </ul>
                 <flight:flightPassportExpiry/>
                  <ul class="fieldRow mB20 clearfix">
                    <li class="fL">
                      <label>Nationality*</label>
                    </li>
                    <li class="fL mR10">
						<select name="nationality">
							<option>India</option>
							<option>Pakistan</option>
						  </select>
                    </li>
                  
                  </ul>
                  <ul class="fieldRow mB20 clearfix">
                    <li class="fL">
                      <label>Issuing Country*</label>
                    </li>
                    <li class="fL mR10">
						<select name="issueCountry">
							<option>India</option>
							<option>Pakistan</option>
						  </select>
                    </li>
                  
                  </ul>
				  <ul class="fieldRow mB20 clearfix">
                    <li class="fL">
                      <label>Place Of Issue*</label>
                    </li>
                    <li class="fL mR10">
						<select name="placeOfIssue">
							<option>Select</option>
							<option>Mumbai</option>
							<option>Bangalore</option>
						  </select>
                    </li>
                  
                  </ul>
				  <c:if test="${orderTicketInfo.passengerType eq 'ADULT' }">
	                  <ul class="fieldRow clearfix mB20">
	                    <li class="fL">
	                      <label>Mobile*</label>
	                    </li>
	                    <li class="fL mR10">
	                      <select>
	                        <option>+91</option>
	                      </select>
	                    </li>
	                    <li class="fL" style="width: 20%">
	                      <input type="text" class=" selectContLargeInput" placeholder="Enter 10 digit mobile number" name="mobileNumber" value="${flightTraveler.mobileNumber}"  />
	                    </li>
	                  </ul>
	                  <ul class="fieldRow clearfix mB20">
	                    <li class="fL">
	                      <label>Email*</label>
	                    </li>
	                    <li class="fL" style="width: 20%">
	                      <input type="text" placeholder="Email" name="email" value="${flightTraveler.email}"/>
	                    </li>
	                  </ul>
                  </c:if>
					<div class="fieldRow clearfix mB20"> <span class="mB20 clearfix dB"><a href="javascript:void(0)" id="moreInfo4" onclick="showMoreInfo('moreInfo4','moreInfoCont4','plusMinus4')" ><span id="plusMinus4">+</span> More (Frequent flyer, meal preference, seat preference, special requests) </a></span>
                    <div id="moreInfoCont4" class="dN">
                      <ul class="fieldRow clearfix mB20">
                        <li class="fL">
                          <label>Frequent flyer</label>
                        </li>
                        <li class="fL mR10">
                          <select>
                            <option>Air india</option>
                            <option>Jet Airways</option>
                          </select>
                        </li>
                        <li class="fL">
                          <input type="text" placeholder="Enter number"  />
                        </li>
                      </ul>
                      
                      <!--  Additional frequent flier fields -->
                      <ul class="fieldRow clearfix mB20 dN" id="frequentFlierDetail2">
                        <li class="fL">
                          <label>&nbsp;</label>
                        </li>
                        <li class="fL mR10">
                          <select>
                            <option>Air india</option>
                            <option>Jet Airways</option>
                          </select>
                        </li>
                        <li class="fL">
                          <input type="text" placeholder="Enter number"  />
                        </li>
                        <li class="fL remove_frequent_flier" title="Remove" onClick="removeFrequentFlier(2)"></li>
                      </ul>
                      <ul class="fieldRow clearfix mB20 dN" id="frequentFlierDetail3">
                        <li class="fL">
                          <label>&nbsp;</label>
                        </li>
                        <li class="fL mR10">
                          <select>
                            <option>Air india</option>
                            <option>Jet Airways</option>
                          </select>
                        </li>
                        <li class="fL">
                          <input type="text" placeholder="Enter number"  />
                        </li>
                        <li class="fL remove_frequent_flier" title="Remove" onClick="removeFrequentFlier(3)"></li>
                      </ul>
                      <ul class="fieldRow clearfix mB20 dN" id="frequentFlierDetail4">
                        <li class="fL">
                          <label>&nbsp;</label>
                        </li>
                        <li class="fL mR10">
                          <select>
                            <option>Air india</option>
                            <option>Jet Airways</option>
                          </select>
                        </li>
                        <li class="fL">
                          <input type="text" placeholder="Enter number"  />
                        </li>
                        <li class="fL remove_frequent_flier" title="Remove" onClick="removeFrequentFlier(4)"></li>
                      </ul>
                      <ul class="fieldRow clearfix mB20 dN" id="frequentFlierDetail5">
                        <li class="fL">
                          <label>&nbsp;</label>
                        </li>
                        <li class="fL mR10">
                          <select>
                            <option>Air india</option>
                            <option>Jet Airways</option>
                          </select>
                        </li>
                        <li class="fL">
                          <input type="text" placeholder="Enter number"  />
                        </li>
                        <li class="fL remove_frequent_flier" title="Remove" onClick="removeFrequentFlier(5)"></li>
                      </ul>
                      
                      <!--Frequent flier adder Adder -->
                      <ul class="fieldRow clearfix mB20" onClick="addFrequentFlierFields()">
                        <li class="fL">
                          <label>&nbsp;</label>
                        </li>
                       <li class="fL addIcon"></li>
                        <li class="fL"><label class="cursor">Add</label></li>
                        
                      </ul>
                      
                      
                      <ul class="fieldRow clearfix mB20">
                        <li class="fL">
                          <label>Meal preference</label>
                        </li>
                        <li class="fL">
                          <select>
                            <option value="350">Rs. 350 / Vegetarian</option>
                            <option>Rs. 750 / Vegetarian</option>
                          </select>
                        </li>
                      </ul>
                      <ul class="fieldRow clearfix mB20">
                        <li class="fL">
                          <label>Seat preference</label>
                        </li>
                        <li class="fL">
                          <select>
                            <option>Select seat</option>
                          </select>
                        </li>
                      </ul>
                      <ul class="fieldRow clearfix mB20">
                        <li class="fL">
                          <label>Special requests</label>
                        </li>
                        <li class="fL">
							<ul class="clearfix">
								<li class="clearfix"><input type="checkbox"><label>Wheel Chair </label></li>
								<li class="clearfix "><input type="checkbox"><label  style="width:100%">Medical Assistance</label></li>
								<li class="clearfix"><input type="checkbox" id="text" onclick="showtextarea();"><label>Other</label></li>
							</ul>
							<textarea id="textarea" class="dN" cols="25" rows="5"></textarea>
						
                        </li>
                      </ul>
                    </div>
					 <div class="fieldRow clearfix">
                        <div class="fL">
                          <ul class="mB20 clearfix w100pcnt">
                            <li class="fL">
                              <label for="addBaggage2" class="fS12">Add Baggage @</label>
                            </li>
                            <li class="fL mR10">
                              <select id="addBaggage2">
                                <option>Select</option>
                                <option value="1">1 kg @ Rs. 350</option>
                                <option>2 kg @ Rs. 700</option>
                              </select>
                            </li>
                            <li class="fL mT5"> <a href="javascript:void(0)">Baggage policy</a> </li>
                          </ul>
                          <ul class=" mB20 clearfix">
                            <li class="fL">
                              <label>Add meals @</label>
                            </li>
                            <li class="fL">
                              <select>
								 <option>Select</option>
                                <option>Rs. 350 / Vegetarian</option>
                                <option>Rs. 750 / Vegetarian</option>
                              </select>
                            </li>
                          </ul>
                        </div>
                        <div class="srp_famount fR pD10 baggagePricing addbag2 dN fS30"> <span class="rupee">Rs</span>350 </div>
                      </div>
					
                  </div>
                </div>
                </div>