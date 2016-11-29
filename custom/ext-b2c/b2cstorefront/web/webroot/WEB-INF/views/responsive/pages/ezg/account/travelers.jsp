<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="formElement"
	tagdir="/WEB-INF/tags/desktop/formElement"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme"%>


<c:set value="${customerData.travellers}" var="travellers" scope="page" />
<meta name="travellerList" value="${travellerList}" />
<meta name="titleList" value='${titleList}' />
<meta name="countryList" value="${countryList}" />
<meta name="monthList" value='${monthList}' />
<meta name="customer" value="${customerData.name}"/>

<script type="text/template" id="tplTravellerList">
		<div class="dataTable w100pcnt data-table">
				<div class="data-row" data-cid=<@=model.cid@>>
					<div class="brdrTGray brdrBGrey data-cell tCell1">
						<img src="<@=model.photo.url@>" alt="<@=model.photo.altText@>" width="60" height="60">
					</div>
					<div class="brdrTGray brdrBGrey pT20 data-cell tCell2">
						<p class="mark-tReplace"><@-model.titleName@></p>
						
						<p><@- model.nameFormater(model.firstName,model.middleName,model.lastName )@></p>
						<span class="bkgyellow pD5 mL5 <@=model.showMe?"":"hide-message"@>">Me</span>
					</div>
					<div class="brdrTGray brdrBGrey pT20 data-cell tCell3">
						<span class="edit_icon fL m10 mark-show-detail" data-cid=<@= model.cid@>></span> 
						<a href="javascript:void(0);" class="edit_details"></a> 
						<span class="recycle_icon_wishlist fL m10 mark-delete" data-cid=<@=model.cid@>></span>
					</div>
				</div>
		</div>
</script>

<script type="text/template" id="tplTravellerDetail">
	<div class="edit_detailsContr mT10 clearfix" style="display: none" data-cid="<@=model.cid@>">
				<ul class="mB10 clearfix mT10">
					<li class="col_3 pL0"><label>Name</label></li>
					<li class="col_2 pL0 pR10">
						<select class="w100pcnt" name="<@= model.generateAttrName('title')@>">
							<@ model.titleList.forEach(function(obj){@>
								<option value="<@-obj.code@>" <@-(model.title == obj.code)?"selected":""@> ><@=obj.name@></option>
							<@})@>
						</select>
					</li>
					<li class="col_2 pL0 pR10">
						<input value="<@- model.firstName@>"  name="<@-model.generateAttrName('firstName')@>" class="w100pcnt" type="text" placeholder="First Name" <@= model.cid==-1?'':'disabled'@>>
					</li>

					<li class="col_2 pL0 pR10">
						<input value="<@- model.middleName@>"  name="<@-model.generateAttrName('middleName')@>" class="w100pcnt" type="text" placeholder="Middle Name (optional)" <@= model.cid==-1?'':'disabled'@>>
					</li>
					<li class="col_2 pL0 pR0">
						<input value="<@- model.lastName@>" name="<@-model.generateAttrName('lastName')@>" class="w100pcnt" type="text" placeholder="Last Name" <@= model.cid==-1?'':'disabled'@>>
					</li>
				</ul>
				<ul class="mB10 clearfix">
					<li class="col_3 pL0"><label>Date of Birth</label></li>
					<li class="pL0 fL mB20">
						<input type="text" placeholder="dd/mm/yyyy" name="<@-model.generateAttrName('dateOfBirth')@>"class="dateField w100pcnt mark-date" value="<@=model.dateFormater(model.dateOfBirth)@>">
					</li>
				</ul>
				<ul class="mB10 clearfix brdrBGrey">
					<li class="col_3 pL0"><label>Photo</label></li>
					<li class="col_2 pL0 mark-up-input">
				    	<span class="primaryBtn_sml">
	       			  		<input type="file" id="<@-model.cid@>" name="uploadFiles" accept=".jpg,.png,.jpeg,.gif">
	      			  		<span class="mark-browse-btn"><a href="javascript:void(0);">Browse</a></span>										
      			   		</span>

      			   	</li>
					<li class="col_2 pL0 mark-up-img">
						<img src="<@= model.photo.url||''@>" alt="<@=model.photo.altText@>" width="60" height="60" data-code="<@=model.photo.code@>" >
					</li>

					<li class="col_3 pL0 mark-upload">
						<span class="picName" style="display:none"></span>
						
					</li>
					<li class="col_2 pL0 mark-upload">
						<span class="tertiaryBtn_sml" style="display:none"><a class="mark-up-btn" href="javascript:void(0);">Upload</a></span>
					</li>


				</ul>
				<h4 class="clearfix">
					<strong>Contact Details</strong>
				</h4>
				<ul class="mB10 mT10 clearfix">
					<li class="col_3 pL0"><label>Email</label></li>
					<li class="col_2_half pL0">
						<input value="<@-model.email@>" type="text" class="w100pcnt" name="<@-model.generateAttrName('email')@>" placeholder="Add email address" />
					</li>
				</ul>
				<ul class="mB10 mT10 clearfix">
					<li class="col_3 pL0"><label>Mobile Number</label></li>
					<li class="col_2_half pL0">
						<input value="<@=model.mobileNumber@>" type="text" class="w100pcnt" name="<@-model.generateAttrName('mobileNumber')@>" placeholder="Add mobile number" />
					</li>
				</ul>
				<ul class="mB10 mT10 clearfix">
					<li class="col_3 pL0"><label>Address</label></li>
					<li class="col_5 pL0">
						<input value="<@-model.address.line1@>" type="text" class="w100pcnt" name="<@-model.generateAttrName('address.line1')@>" placeholder="Address (optional)" />
					</li>
				</ul>
				<ul class="mB10 mT10 brdrBGrey pB10 clearfix">
					<li class="col_3 pL0"></li>
					<li class="col_2 pL0">

						<select class="w100pcnt" name="<@-model.generateAttrName('address.country.isocode')@>" data-cid="<@-model.cid@>">
							<@ model.countryList.forEach(function(obj){@>
								<option value="<@-obj.isocode@>" <@-(obj.isocode == model.address.country.isocode)?"selected":""@> ><@=obj.name@></option>
							<@})@>
						</select>
					</li>
					<li class="col_2 pL0">
						<select class="w100pcnt" name="<@-model.generateAttrName('address.region.isocode')@>" data-cid="<@-model.cid@>">
							<option value="<@=model.address.region.isocode@>" selected><@=model.address.region.name@></option>
						</select>
					</li>
					<li class="col_2 pL0">
						<select class="w100pcnt" name="<@-model.generateAttrName('address.city.cityIsoCode')@>" data-cid="<@-model.cid@>">
							<option value="<@=model.address.city.cityIsoCode@>" selected><@=model.address.city.cityName@></option>
						</select>
					</li>
					<li class="col_2 pL0">
						<input type="text" class="w100pcnt" name="<@-model.generateAttrName('address.postalCode')@>" placeholder="ZIP Code" value="<@-model.address.postalCode@>" />
					</li>
				</ul>
				<h4 class="clearfix">
					<strong>Travel Documents</strong>
				</h4>
				<ul class="mB10 mT10 clearfix">
					<li class="col_3 pL0">
						<label>Passport Info</label>
					</li>
					<li class="col_2_half pL0">
						<input type="text" class="w100pcnt" name="<@-model.generateAttrName('passportNumber')@>" placeholder="Passport number (optional)" value="<@-model.passportNumber@>" />
					</li>
					<li class="col_2_half pL0">
					
						<select class="w100pcnt" name="<@-model.generateAttrName('issueCountry')@>">
							<@ model.countryList.forEach(function(obj){@>
								<option value="<@-obj.isocode@>" <@-(obj.isocode == model.issueCountry.isocode)?"selected":""@> ><@=obj.name@></option>
							<@})@>
						</select>
					</li>
				</ul>
				<ul class="mB10 mT10 clearfix">
					<li class="col_3 pL0">
						<label>Valid Till</label>
					</li>
					<li class="col_2_half pL0">
						<select class="w100pcnt" name="<@-model.generateAttrName('__date')@>">
							<@ model.dateList.forEach(function(date){@>
								<option value="<@-date.key@>" <@-(date.key == model.__date)?"selected":""@> ><@-date.value@></option>
							<@})@>
						</select>
					</li>
					<li class="col_2_half pL0">
						<select class="w100pcnt" name="<@-model.generateAttrName('__month')@>">
							<@ model.monthList.forEach(function(month){@>
								<option value="<@-month.key@>" <@-(month.key == model.__month)?"selected":""@> ><@-month.value@></option>
							<@})@>
						</select>
					</li>
					<li class="col_2_half pL0">
						<select class="w100pcnt" name="<@-model.generateAttrName('__year')@>">
							<@ model.yearList.forEach(function(year){@>
								<option value="<@-year.key@>" <@-(year.key == model.__year)?"selected":""@> ><@-year.value@></option>
							<@})@>
						</select>
					</li>
				</ul>
</script>
<script type="text/template" id="tplVisa">
	<ul class="mB10 mT10 clearfix" data-id="<@=model.cid@>"><li class="col_3 pL0">
		<label>Visa Info</label>
		</li>
	<li class="col_2_half pL0">
		<input type="text" class="w100pcnt" name="<@-model.rootName + model.cid + '.country'@>" data-num="<@=model.cid@>" placeholder="Enter Country Name" value="<@-model.country?model.country:""@>" />
		</li>
	</ul>
	<ul class="mB10 mT10 clearfix" data-id="<@=model.cid@>">
	<li class="col_3 pL0"><label>Valid Till</label></li>
	<li class="col_2_half pL0">
	<select class="w100pcnt" name="<@-model.rootName + model.cid + '.__date' @>" data-num="<@=model.cid@>">
			<@ model.dateList.forEach(function(date){@>
				<option value="<@-date.key@>" <@-(date.key == model.__date)?"selected":""@> ><@-date.value@></option>
			<@})@>
	</select>
	</li>
	<li class="col_2_half pL0">
	<select class="w100pcnt" name="<@-model.rootName + model.cid + '.__month' @>" data-num="<@=model.cid@>">
		<@ model.monthList.forEach(function(month){@>
								<option value="<@-month.key@>" <@-(month.key == model.__month)?"selected":""@> ><@-month.value@></option>
							<@})@>
	</select>
	</li>
	<li class="col_2_half pL0">
	<select class="w100pcnt" name="<@-model.rootName + model.cid + '.__year' @>" data-num="<@=model.cid@>">
		<@ model.yearList.forEach(function(year){@>
			<option value="<@-year.key@>" <@-(year.key == model.__year)?"selected":""@> ><@-year.value@></option>
		<@})@>
	</select>
	</li>
	<li class="col_1 pL0 pR0 mT10 remove_field <@= model.showRemove?"":"hide-message"@>">
		<span class="closeBtn_popup fR "></span>
	</li>
	</ul>
</script>

<%--  Day 3 --%>
<div class="clearfix">
	<header class="diy_headerContr clearfix active diy_header">
		<samp class="brdrN">Travelers</samp>
		<span class="heading sel"><img
			src="${ezgImagesPath}/common/expand.png" alt="Arrow" class="fR mT5"></span>
	</header>
</div>
<div class="diy_results  brdrLitGry dN mark-container"
	style="padding: 0 10px 0 10px;">
	<p class="clearfix mT10 mB20">We found ${fn:length(travellers)}
		people you've booked for before. You can add more details for faster
		bookings</p>
	<form id="test">
		<div class="w100pcnt mT20 list-content"></div>
	</form>
	<%-- 
	<c:forEach items="${customerData.travellers}" var="traveller">
		<div class="edit_detailsContr mT10 clearfix" style="display: none">
			<ul class="mB10 clearfix mT10">
				<li class="col_3 pL0"><label>Name</label></li>
				<li class="col_2 pL0 pR10"><select class="w100pcnt"
					id="travellerTitle">
						<c:forEach var="title" items="${titles}">
							<option id="${title.code}" value="${title.code}"
								<c:if test="${title.code eq travellers[0].title}">selected</c:if>>${title.name}</option>
						</c:forEach>
				</select></li>
				<li class="col_3 pL0 pR10"><input
					value="${travellers[0].lastName}" class="w100pcnt" type="text"
					placeholder="First Name"></li>
				<li class="col_3 pL0 pR0"><input
					value="${travellers[0].firstName}" class="w100pcnt" type="text"
					placeholder="Last Name"></li>
			</ul>
			<ul class="mB10 clearfix brdrBGrey">
				<li class="col_3 pL0"><label>Date of Birth</label></li>
				<li class="pL0 fL mB20"><input type="text"
					placeholder="dd/mm/yyyy" id="dob" class="dateField w100pcnt"
					value="<fmt:formatDate value="${travellers[0].dateOfBirth}" type="date" pattern="dd/MM/yyyy"/>">
				</li>
			</ul>
			<h4 class="clearfix">
				<strong>Contact Details</strong>
			</h4>
			<ul class="mB10 mT10 clearfix">
				<li class="col_3 pL0"><label>Email</label></li>
				<li class="col_2_half pL0"><input
					value="${travellers[0].email}" type="text" class="w100pcnt"
					name="Email ID" placeholder="Add email address" /></li>
			</ul>
			<ul class="mB10 mT10 clearfix">
				<li class="col_3 pL0"><label>Mobile Number</label></li>
				<li class="col_2_half pL0"><input
					value="${travellers[0].mobileNumber}" type="text" class="w100pcnt"
					name="Mobile Number" placeholder="Add mobile number" /></li>
			</ul>
			<ul class="mB10 mT10 clearfix">
				<li class="col_3 pL0"><label>Address</label></li>
				<li class="col_5 pL0"><input
					value="${travellers[0].address.companyName}&#44;&nbsp;${travellers[0].address.line2}&#44;&nbsp;${travellers[0].address.line1}"
					type="text" class="w100pcnt" name="Address" placeholder="Address" />
				</li>
			</ul>
			<ul class="mB10 mT10 brdrBGrey pB10 clearfix">
				<li class="col_3 pL0"><label>&nbsp;</label></li>
				<li class="col_2 pL0"><select class="w100pcnt" name="Country">
						<option value="0" selected>${travellers[0].address.country.name}</option>
						<c:forEach var="country" items="${countries}">
							<option id="${country.isocode}" value="${country.isocode}"
								<c:if test="${country.name eq travellers[0].address.country.name}">selected</c:if>>${country.name}</option>
						</c:forEach>
				</select></li>
				<li class="col_2 pL0"><select class="w100pcnt" name="State">
						<option value="0" selected>${travellers[0].address.region.name}</option>
				</select></li>
				<li class="col_2 pL0"><select class="w100pcnt" name="City">
						<option value="0" selected>${travellers[0].address.town}</option>
				</select></li>
				<li class="col_2 pL0"><input type="text" class="w100pcnt"
					name="ZIP Code" placeholder="ZIP Code"
					value="${travellers[0].address.postalCode}" /></li>
			</ul>
			<h4 class="clearfix">
				<strong>Travel Documents</strong>
			</h4>
			<ul class="mB10 mT10 clearfix">
				<li class="col_3 pL0"><label>Passport Info</label></li>
				<li class="col_2_half pL0"><input type="text" class="w100pcnt"
					name="Passport_number" placeholder="Add A Passport number"
					value="${travellers[0].passportNumber}" /></li>
				<li class="col_2_half pL0"><input type="text" class="w100pcnt"
					name="Country" placeholder="Add Issuing Country"
					value="${travellers[0].issueCountry}" /></li>
			</ul>
			<ul class="mB10 mT10 clearfix">
				<li class="col_3 pL0"><label>Valid Till</label></li>
				<li class="col_2_half pL0"><select class="w100pcnt" name="Day">
						<option value="0" selected><fmt:formatDate
								value="${travellers[0].passportExpDate}" type="date"
								pattern="dd" /></option>
				</select></li>
				<li class="col_2_half pL0"><select class="w100pcnt"
					name="Month">
						<option value="0" selected><fmt:formatDate
								value="${travellers[0].passportExpDate}" type="date"
								pattern="MMMM" /></option>
				</select></li>
				<li class="col_2_half pL0"><select class="w100pcnt" name="Year">
						<option selected><fmt:formatDate
								value="${travellers[0].passportExpDate}" type="date"
								pattern="yyyy" /></option>
				</select></li>
			</ul>

			<c:forEach items="${travellers[0].visaInfos}" var="visa">
				<ul class="mB10 mT10 clearfix">
					<li class="col_3 pL0"><label>Visa Info</label></li>
					<li class="col_2_half pL0"><input type="text" class="w100pcnt"
						name="visa" placeholder="Enter Country Name"
						value="${visa.country}" /></li>
				</ul>

				<ul class="mB10 mT10 clearfix">
					<li class="col_3 pL0"><label>Valid Till</label></li>
					<li class="col_2_half pL0"><select class="w100pcnt" name="Day">
							<option selected><fmt:formatDate
									value="${visa.validTill}" type="date" pattern="dd" /></option>
					</select></li>
					<li class="col_2_half pL0"><select class="w100pcnt"
						name="Month">
							<option selected><fmt:formatDate
									value="${visa.validTill}" type="date" pattern="MMMM" /></option>
					</select></li>
					<li class="col_2_half pL0"><select class="w100pcnt"
						name="Year">
							<option selected><fmt:formatDate
									value="${visa.validTill}" type="date" pattern="yyyy" /></option>
					</select></li>
				</ul>
			</c:forEach>

			<ul class="clearfix brdrBGrey pB10 mB10">
				<li class="col_12"><a href="javascript:void(0);"
					id="addcountrybtn" class="fR">+Add</a></li>
				<li class="col_12 pL0 clearfix mT10" id="addcountry"></li>
			</ul>
			<div class=" col_12 mB20 pL0">
				<h4 class="clearfix mB10">
					<strong>Travel Preferences</strong>
				</h4>
				<p class="clearfix mT10">Rank products according to your
					preference. The selected products will appear in your search
					results on a priority.</p>

				<h4 class="mT20 mB10 fL">Product category: Hotel</h4>
				<div class="tertiaryBtn fR mT20 mB10">
					<a href="javascript:void(0);">Restore defaults</a>
				</div>

				<table class="dataTablebtm col_12 mT20 mB20">

					<tr>
						<th class="first">Rank</th>
						<th>Product</th>
						<th>Action</th>
					</tr>

					<tr>
						<td>1</td>
						<td>Hyatt Regency, K.G.Marg, Delhi</td>
						<td><a href="#">Remove</a></td>
					</tr>
					<tr>
						<td class="vMid"><span>2</span> <span class="mL10">Active
								from 2 Oct’14</span></td>
						<td>JW Marriot</td>
						<td><a href="#">Remove</a></td>
					</tr>
					<tr>
						<td>3</td>
						<td>Leela Ambience, Gurgaon</td>
						<td><a href="#">Remove</a></td>
					</tr>

				</table>

				<h4 class="mT20 mB10 fL">Product category: Flight</h4>
				<div class="tertiaryBtn fR mL15 mT20 mB10">
					<a href="javascript:void(0);">Restore defaults</a>
				</div>

				<table class="dataTablebtm col_12 mT20">

					<tr>
						<th class="first">Rank</th>
						<th>Product</th>
						<th>Action</th>
					</tr>

					<tr>
						<td>1</td>
						<td>Jet Airways, All routes</td>
						<td><a href="#">Remove</a></td>
					</tr>
					<tr>
						<td>2</td>
						<td>Etihaad Airways, Dubai-Milan</td>
						<td><a href="#">Remove</a></td>
					</tr>

				</table>

				<div class="col_12 clearfix mT20">
					<div class="fL mT10">
						<a href="javascript:void(0);" class="edit_preferences"> <span
							class="addIcon mR5 fL"></span> <span class="posR fL">Add
								product</span>
						</a>
					</div>
				</div>
				<div class="row clearfix mB20 mT20 edit_preferencesContr"
					style="display: none">
					<div class="col_3 col_sm_6">
						<div class="form">
							<label for="productcategory">Product category</label> <select
								class="mB20 w100pcnt" name="productcategory"
								id="productcategory1">
								<option>Transportation</option>
								<option>Accommodation</option>
								<option>Others</option>
								<option>Holidays</option>
								<option>Activities</option>
							</select>
						</div>
					</div>
					<div class="col_3 col_sm_6">
						<div class="form">
							<label>Product Sub-Category</label> <select class="mB20 w100pcnt"
								id="subctg1">
								<option value="flight1">Flight</option>
								<option value="all1">All</option>
								<option value="car1">Car</option>
								<option value="cruise1">Cruise</option>
								<option value="eurorail1">Rail Europe</option>
								<option value="bus1">Bus</option>
								<option value="holiday1">Holidays</option>
								<option value="activities1">Activities</option>
							</select>
						</div>
					</div>
					<div class="cB"></div>
					<div id="flight1" class="col_12">
						<h4 class="fS16">Country:</h4>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>From</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
							<li class="col_6 pL0"><label>To</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<div class="cB"></div>
						<h4 class="fS16">City:</h4>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>From</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
							<li class="col_6 pL0"><label>To</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Airline Name</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Rank</label> <select
								class="w100pcnt">
									<option>#Rank</option>
							</select></li>
							<li class="col_6 pL0"><label>Effective From</label> <input
								type="text" id="effectivefrom14" class="w100pcnt dateField"
								placeholder="dd/mm/yyyy" readonly=""></li>
						</ul>
						<span class="primaryBtn mT10"><a href="javascript:void(0);">Add</a></span>
					</div>
					<div id="all1" class=" col_12 dN">
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Continent</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
							<li class="col_6 pL0"><label>Country</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<div class="cB"></div>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>City</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
							<li class="col_6 pL0"><label>Chain </label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Brand</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>

							<li class="col_6 pL0"><label>Product Name</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Rank</label> <select
								class="w100pcnt">
									<option>#Rank</option>
							</select></li>
							<li class="col_6 pL0"><label>Effective from</label> <input
								type="text" id="effectivefrom10" class="w100pcnt dateField"
								placeholder="dd/mm/yyyy" readonly=""></li>
						</ul>
						<span class="primaryBtn mT10"><a href="javascript:void(0);">Add</a></span>
					</div>
					<div id="cruise1" class="col_12 dN">
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Destination</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<div class="cB"></div>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Cruise Brand Name</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
							<li class="col_6 pL0"><label>Ship Name</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Rank</label> <select
								class="w100pcnt">
									<option>#Rank</option>
							</select></li>
							<li class="col_6 pL0"><label>Effective from</label> <input
								type="text" id="effectivefrom11" class="w100pcnt dateField"
								placeholder="dd/mm/yyyy" readonly=""></li>
						</ul>
						<span class="primaryBtn mT10"><a href="javascript:void(0);">Add</a></span>
					</div>
					<div id="eurorail1" class="col_12 dN">
						<h4 class="fS16">Sector</h4>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>From</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
							<li class="col_6 pL0"><label>To</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<div class="cB"></div>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Train Name</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Rank</label> <select
								class="w100pcnt">
									<option>#Rank</option>
							</select></li>
							<li class="col_6 pL0"><label>Effective From</label> <input
								type="text" id="effectivefrom12" class="w100pcnt dateField"
								placeholder="dd/mm/yyyy" readonly=""></li>
						</ul>
						<span class="primaryBtn mT10"><a href="javascript:void(0);">Add</a></span>
					</div>
					<div id="bus1" class="col_12 dN">
						<h4 class="fS16">Sector</h4>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>From</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
							<li class="col_6 pL0"><label>To</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<div class="cB"></div>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Bus Name</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
							<li class="col_6 pL0"><label>Features Category</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Rank</label> <select
								class="w100pcnt">
									<option>#Rank</option>
							</select></li>
							<li class="col_6 pL0"><label>Effective From</label> <input
								type="text" id="effectivefrom13" class="w100pcnt dateField"
								placeholder="dd/mm/yyyy" readonly=""></li>
						</ul>
						<span class="primaryBtn mT10"><a href="javascript:void(0);">Add</a></span>
					</div>
					<div id="holiday1" class="col_12 dN">
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Flavour Type</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
							<li class="col_6 pL0"><label>Brand</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<div class="cB"></div>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Destination</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
							<li class="col_6 pL0"><label>Country</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Product Name</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
							<li class="col_6 pL0"><label>Product Flavour Name</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Rank</label> <select
								class="w100pcnt">
									<option>#Rank</option>
							</select></li>
							<li class="col_6 pL0"><label>Effective From</label> <input
								type="text" id="effectivefrom9" class="w100pcnt dateField"
								placeholder="dd/mm/yyyy" readonly=""></li>
						</ul>
						<span class="primaryBtn mT10"><a href="javascript:void(0);">Add</a></span>
					</div>
					<div id="activities1" class="col_12 dN">
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Continent</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
							<li class="col_6 pL0"><label>Country</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<div class="cB"></div>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>City</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Product Name</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
							<li class="col_6 pL0"><label>Product Name Sub Type</label> <select
								class="w100pcnt">
									<option>&nbsp;</option>
							</select></li>
						</ul>
						<ul class="clearfix mB10">
							<li class="col_6 pL0"><label>Rank</label> <select
								class="w100pcnt">
									<option>#Rank</option>
							</select></li>
							<li class="col_6 pL0"><label>Effective From</label> <input
								type="text" id="effectivefrom8" class="w100pcnt dateField"
								placeholder="dd/mm/yyyy" readonly=""></li>
						</ul>
						<span class="primaryBtn mT10"><a href="javascript:void(0);">Add</a></span>
					</div>
				</div>




			</div>
		</div>
	</c:forEach>

	<table class="dataTable w100pcnt mT20">
		<tbody>
			<c:forEach items="${customerData.travellers}" var="traveller">
				<tr>
					<th class="brdrTGray brdrBGrey pT20"><img
						src="${traveller.photo.url}" alt="" width="60" height="60"></th>
					<th class="brdrTGray brdrBGrey pT20">${traveller.titleName}&nbsp;${traveller.lastName}&nbsp;${traveller.firstName}</th>
					<th class="brdrTGray brdrBGrey pT20"><a
						href="javascript:void(0);" class="edit_details"><span
							class="edit_icon fL m10"></span></a> <span
						class="recycle_icon_wishlist fL m10"></span></th>
				</tr>
			</c:forEach>
		</tbody>
	</table>
 --%>
	<div class="mark-new-container">
		<div class="clearfix mT10 mB10 col_12 brdrDashed pD10 tC">
			<a href="javascript:void(0);" class="mark-newTrl">+ Add Traveller</a>
		</div>
	</div>

</div>

<%-- DIY container ends here --%>