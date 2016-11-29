<div class="darkgrey_bg pD10 clearfix">
	<label class="fL mR10 mT10">Customer</label>
	<span class="search-bar globalSrchW fL mR10">
		<input type="text" class="sfield w100pcnt custSrcInput" name="searchterm" id="custId"  placeholder="Enter name, email or phone number" />
		<input type="image" class="searchbutton" name="search" alt="Search" title="Search" src="images/search_icon.png" />
	</span> 
	<span id="addCustContr" class="addCustContr"> <a href="javascript:void(0);" class=" fL mT10 fW600" onClick="showCustomerDetails('new')"> <span class="add_customer_icon mR5 fL mTN5 "></span>Add customer details</a></span> 
	<span id="existingCustContr" style="display:none"> <span class="add_customer_icon mR5 fL"></span> <span class="fL mT10"><a href="javascript:void(0);" onclick="showCustomerDetails('existing')" class="cusStatus">Existing customer details</a></span> </span>
</div>

<ul class="dN pT20 pB10 clearfix" id="customerSummary">
	<li class="col_3">
		<span class="mB5 txtClrlitGry clearfix w100pcnt">Customer name</span>
		<span class="customerName" style="word-break:break-all;"></span>
	</li>
	<li class="col_3 pR10">
		<span class="mB5 txtClrlitGry clearfix w100pcnt">Email</span>
		<span class="customerEmail" style="word-break:break-all;"></span>
	</li>
	<li class="col_3 pR10">
		<span class="mB5 txtClrlitGry clearfix w100pcnt">Mobile number</span>
		<span class="customerMobileNumber" style="word-break:break-all;"></span>
	</li>
	<li class="col_3">
		<span class="popup_close_icon fR clearfix" onclick="hideCustomerSummary()"></span>
		<a href="javascript:void(0)" class="mT10 mB10 clearfix" onclick="popupwin('addcustdetail','addcustdetailinner','fade')">+ Details</a>
	</li>
</ul>
<ul class="dN pT20 pB10 clearfix" id="newCustDetail">
	<li class="col_4">
		<span class="mB5 txtClrlitGry clearfix w100pcnt">Customer name</span>
		<span>Mr. Amit Trivedi</span>
	</li>
	<li class="col_4 pR10">
		<span class="mB5 txtClrlitGry clearfix w100pcnt">Email</span>
		<span><a href="mailto:amit.t@yahoomail.com">amit.t@yahoomail.com</a></span>
	</li>
	<li class="col_4 pR10">
		<span class="mB5 txtClrlitGry clearfix w100pcnt">Mobile number</span>
		<span>9867484567</span>
	</li>
</ul>
<form id="custDetail" class="brdrTrans pT10 dN"">
	<span class="popup_close_icon  fR clearfix" onclick="hidecustomerdetails();"></span>
	<ul class="mB10 w100pcnt fL clearfix">
		<li class="col_2 pR10 pL0">
			<label>Title</label>
			<select class="titleDropDownList" ></select>
		</li>
		<li class="col_3_half pL0 pR10">
			<label>First name*</label>
			<input name="firstName" type="text" class="w100pcnt" />
		</li>
		<li class="col_3 pL0 pR10">
			<label>Middle name</label>
			<input name="middleName" type="text" class="w100pcnt"/>
		</li>
		<li class="col_3_half pL0">
			<label>Last name*</label>
			<input name="lastName" type="text" class="w100pcnt" />
		</li>
	</ul>

	<ul class="row col_12 pL0  mB10 fL">
		<li class="col_6 pR10 ">
			<label>Email</label>
			<input name="email" type="text" class="w100pcnt" />
		</li>
		<li class="col_5 pL0 pR10">
			<label>Mobile no.</label>
			<input name="mobileNumber" type="text" class="w80pcnt" />
		</li>
	</ul>
	<ul class="row col_12 pL0  mB10 fL">
		<li class="col_6 pR10 ">
			<label>City</label>
			<!-- <select ><option disabled="disabled">Select City</option></select> -->
			<select class="cityDropDownList" ></select>
		</li>
		<li class="col_5 pL0 pR10">
			<label>Pin Code</label>
			<input name="pinCode" type="text" class="w80pcnt" />
		</li>
	</ul>
	<br class="cB" />
	<a href="javascript:void(0)" class="mT10 mB10 clearfix" onclick="popupwin('addcustdetail','addcustdetailinner','fade')">+ Add more details</a>
	<br class="cB" />
	<!-- <div class="tertiaryBtn fR mT15 mB15 customerSaveDetail"><a href="javascript:void(0);" onclick="saveCustomer('custDetail')">Save details</a></div> -->
	<div class="tertiaryBtn fR mT15 mB15"><a href="javascript:void(0);" onclick="submitForm('custDetail')">Save details</a></div>
	<div class="cB"></div>
</form>

<!--
<div id="custDetail_fill" class="brdrTrns pT20 pB10 clearfix" style="display:none">
	<ul class="row">
		<li class="col_4">
			<span class="mB5 txtClrlitGry clearfix w100pcnt">Customer name</span>
			<span>Mr. Amit Trivedi</span>
		</li>
		<li class="col_4 pR10">
			<span class="mB5 txtClrlitGry clearfix w100pcnt">Email</span>
			<span><a href="mailto:amit.t@yahoomail.com">amit.t@yahoomail.com</a></span>
		</li>
		<li class="col_4 pR10">
			<span class="mB5 txtClrlitGry clearfix w100pcnt">Mobile number</span>
			<span>9867484567</span>
		</li>
	</ul>
</div>
-->