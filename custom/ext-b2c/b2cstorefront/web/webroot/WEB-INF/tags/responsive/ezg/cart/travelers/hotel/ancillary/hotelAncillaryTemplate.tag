<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>

<%-- <%@ attribute name="travelerTitle" required="true" type="java.lang.String"%> --%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="ancillary" tagdir="/WEB-INF/tags/responsive/ezg/cart/travelers/hotel/ancillary"%>


<%-- template for wifi --%>
<c:out value="<script id='wifiTemplate' type='text/ractive'>" escapeXml="false"/>
<ul class="fieldRow clearfix mB10">
	<li class="fL">
	<input type="checkbox" value="checked"  {{#wifi}} checked="checked" {{/wifi}}  class="ancillary1" name="wifi"  on-click="onCheck()" >
         <label class="fS12">Wi Fi</label>
    </li>
    <li class="fL ancillaryshow {{^wifi}}dN{{/wifi}}" id="wifiDuration">
      <select name="wifiDuration" value='{{wifi.duration}}' class="fL mR10" on-change="dataChange()">
        <option>Duration</option>
        {{#each wifidays:num}}
        	<option value="{{num+1}}" {{# wifi.duration==num+1}} selected="selected" {{/}}>{{num+1 }} day</option>
        {{/each}}
      </select>
     </li>
	<li class="fR {{^wifi}}dN{{/wifi}}" id="wifiPrice">
	   <div class="ancillaryshow">
	   <span class="fS16 srp_famount fR pD10"> <span class="rupee">Rs</span><span name="price">{{wifi.price}}</span></span>
	   </div>
	</li>
</ul>	
<c:out value="</script>" escapeXml="false"/>

<%-- template for car parking --%>
<c:out value="<script id='carparkingTemplate' type='text/ractive'>" escapeXml="false"/>
	<ul class="fieldRow clearfix mB20">
		<li>
			<input type="checkbox" value="checked" on-click="onCheck()"  {{#carparking}} checked="checked" {{/carparking}} class="ancillary2" name="carparking"/>
	        <label>Car Parking</label>
		</li>
		<li class="fL mR10 ancillaryshow2 vehicleType {{^carparking}}dN{{/carparking}}">
			<select class="mR10" name="vehicleType" on-change="dataChange()" value="{{carparking.vehicleType}}">
				<option name="vehicleType0" value="0" >Vehicle Type</option>
	            <option name="vehicleType1" value="100" {{#carparking.vehicleType == "100"}} selected {{/}} >Type 1</option>
				<option name="vehicleType2" value="200" {{#carparking.vehicleType == "200"}} selected {{/}} >Type 2</option>
			</select>
		</li>
		<li class="fL mR10 ancillaryshow2    vehicleType {{^carparking}}dN{{/carparking}}">
			<input name="parkingStartDate" class="w100pcnt dateField" on-change="dataChange()" type="text" value="{{carparking.startDate}}" placeholder="DD/MM/YYYY" readonly />
		</li>
		<li class="fL ancillaryshow2  vehicleType {{^carparking}}dN{{/carparking}}">
				<input name="parkingEndDate" class="w100pcnt dateField" on-change="dataChange()"  type="text" value="{{carparking.endDate}}" placeholder="DD/MM/YYYY" readonly />
		</li>
		<li class="fR ancillaryshow2 {{^carparking}}dN{{/carparking}}">
				   <span class="fS16 srp_famount fR pD10"> <span class="rupee">Rs</span><span name="price">{{carparking.price}}</span></span>
		</li>
	</ul>
<c:out value="</script>" escapeXml="false"/>

<c:out value="<script id='petstayTemplate' type='text/ractive'>" escapeXml="false"/>
	<ul class="fieldRow clearfix mB20">
	<li><input type="checkbox" {{#petstay}} checked="checked" {{/petstay}} class="ancillary3" on-click="onCheck()"  name="petstay" /> 
		<label>Pet Stay</label></li>
	<li class="fL ancillaryshow3 {{^petstay}}dN{{/petstay}} petNumbers">
	<select class="mR10" name="numberOfPets"  value='{{petstay.numberOfPets}}' on-change="dataChange()" >
			<option>Number Of Pets</option>
			{{#each petsNum:num}}
        	<option value="{{num+1}}" {{# petstay.numberOfPets==num+1}} selected="selected" {{/}}>{{num+1 }}</option>
        	{{/each}}
	</select></li>
	<li class="fR ancillaryshow3 {{^petstay}}dN{{/petstay}} petprice"><span
		class="fS16 srp_famount fR pD10"> <span class="rupee">Rs</span><span name="price">{{petstay.price}}</span>
	</span></li>
</ul>
<c:out value="</script>" escapeXml="false"/>

<c:out value="<script id='latecheckoutTemplate' type='text/ractive'>" escapeXml="false"/>
	<ul class="fieldRow clearfix mB20">
		<li><input type="checkbox" value="checked"  {{#latecheckout}} checked="checked" {{/latecheckout}} name="latecheckout" on-click="onCheck()"  class="ancillary4" />
			<label>Late Check Out</label></li>
		<li class="fL ancillaryshow4  {{^latecheckout}}dN{{/latecheckout}} "><input type="text"
			name="checkoutTime" placeholder="Check Out Time" value="{{latecheckout.checkoutTime}}" on-change="dataChange()" /></li>
		<li class="fR ancillaryshow4  {{^latecheckout}}dN{{/latecheckout}} "><span
			class="fS16 srp_famount fR pD10"> <span class="rupee">Rs</span><span name="price">{{latecheckout.price}}</span>
		</span></li>
	</ul>
<c:out value="</script>" escapeXml="false"/>

<c:out value="<script id='earlycheckinTemplate' type='text/ractive'>" escapeXml="false"/>
	<ul class="fieldRow clearfix mB20">
		<li><input type="checkbox" value="checked"  {{#earlycheckin}} checked="checked" {{/earlycheckin}} on-click="onCheck()"  class="ancillary5" />
			<label>Early Check In</label></li>
		<li class="fL ancillaryshow5  {{^earlycheckin}}dN{{/earlycheckin}} "><input type="text"  value="{{earlycheckin.checkInTime}}"
			name="checkInTime" placeholder="Check In Time" /></li>
		<li class="fR ancillaryshow5 {{^earlycheckin}}dN{{/earlycheckin}} "><span
			class="fS16 srp_famount fR pD10"> <span class="rupee">Rs</span><span name="price">{{earlycheckin.price}}</span>
		</span></li>
	</ul>
<c:out value="</script>" escapeXml="false"/>

<c:out value="<script id='breakfastTemplate' type='text/ractive'>" escapeXml="false"/>
	<ul class="fieldRow clearfix mB20">
		<li><input type="checkbox" value="checked"  {{#breakfast}} checked="checked" {{/breakfast}} on-click="onCheck()"  class="ancillary6" />
			<label>Breakfast</label></li>
		<li class="fL mR10 ancillaryshow6 {{^breakfast}}dN{{/breakfast}} ">
		<select name="numberOfAdult" value='{{breakfast.numberOfAdult}}' on-change="dataChange()">
				<option value="">Number of Adults</option>
					{{#each adultNums:num}}
						<option value="{{num+1}}" {{# breakfast.numberOfAdult==num+1}} selected="selected" {{/}}>{{num+1 }}</option>
					{{/each}}				
		</select></li>
		<li class="fL mR10 ancillaryshow6  {{^breakfast}}dN{{/breakfast}} ">
			<select name="numberOfChild" value='{{breakfast.numberOfChild}}' on-change="dataChange()">
					<option value="">Number of Child</option>
					{{#each childNums:num}}
						<option value="{{num+1}}" {{# breakfast.numberOfChild==num+1}} selected="selected" {{/}}>{{num+1 }}</option>
					{{/each}}
			</select>
		</li>
		<li class="fR ancillaryshow6  {{^breakfast}}dN{{/breakfast}} "><span
			class="fS16 srp_famount fR pD10"> <span class="rupee">Rs</span><span name="price">{{breakfast.price}}</span></span>
		</li>
	</ul>
<c:out value="</script>" escapeXml="false"/>


<c:out value="<script id='restaurantTemplate' type='text/ractive'>" escapeXml="false"/>
	<ul class="fieldRow clearfix mB20">
		<li><input type="checkbox" value="checked" class="ancillary7" {{#restaurant}} checked="checked" {{/restaurant}} on-click="onCheck()" />
			<label>Restaurant</label></li>
		<li class="fL mR10 ancillaryshow7 {{^restaurant}}dN{{/restaurant}} "><select name="mealType">
					<option value="">Meal Type</option>
					<option value="HotelMeal">Type 1</option>
			</select></li>
		<li class="fL mR10 ancillaryshow7 {{^restaurant}}dN{{/restaurant}} "><select name="numberOfAdult">
					<option value="">Number of Adult</option>
					{{#each adultNums:num}}
						<option value="{{num+1}}"  >{{num+1 }}</option>
					{{/each}}
			</select></li>
		<li class="fL mR10 ancillaryshow7 {{^restaurant}}dN{{/restaurant}} "><select name="numberOfChild">
				<option value="">Number of Child</option>
				{{#each childNums:num}}
					<option value="{{num+1}}" >{{num+1 }}</option>
				{{/each}}
		</select></li>
		<li class="fL ancillaryshow7 {{^restaurant}}dN{{/restaurant}} " ><a href="javascript:void(0);"
			class="w100pcnt button button-primary addServicesBtn"
			on-click="pushData()">Add</a></li>
		<li class="fR ancillaryshow7 dN"><span
			class="fS16 srp_famount fR pD10"> <span class="rupee">Rs</span><span name="price">{{restaurant.price}}</span>
		</span></li>
	</ul>
	
	<div class="ancillaryshow7">
		{{#each restaurant.meals:num}}
			<ul class="fieldRow clearfix mB20 {{^restaurant.meals}}dN{{/}}" id="addedFlyer2">
				<li><label>Added Ancillary</label></li>
					<li class="fL">Meal Type : {{mealType.type}}<br /> For {{#numberOfAdult}} {{numberOfAdult}} Adults {{/}} {{#numberOfAdult && numberOfChild}},{{/}}
						{{#numberOfChild}} {{numberOfChild}} Child {{/}}
					</li>
					<li class="fL"><span title="delete"
						class="recycle_icon_wishlist mT5 fL" on-click="removeData(num)"></span></li>
			</ul>
		{{/each}}
	</div>
<c:out value="</script>" escapeXml="false"/>


<c:out value="<script id='spaTemplate' type='text/ractive'>" escapeXml="false"/>
	<ul class="fieldRow clearfix mB20">
		<li><input type="checkbox" value="checked" class="ancillary8" {{#spa}} checked="checked" {{/spa}} on-click="onCheck()"  />
			<label>Spa</label></li>
		<li class="fL mR10 ancillaryshow8 {{^spa}}dN{{/spa}} "><select name="serviceType">
				<option value="">Service Type</option>
				<option value="TYPE1">Type 1</option>
		</select></li>
		<li class="fL mR10 ancillaryshow8 {{^spa}}dN{{/spa}} "><select name="duration">
				<option value="">Duration</option>
				{{#each durationNums:num}}
					<option value="{{num+1}}"  >{{num+1 }}</option>
				{{/each}}
		</select></li>
		<li class="fL mR10 ancillaryshow8 {{^spa}}dN{{/spa}} "><select name="numberOfAdult">
				<option value="">Number of Adult</option>
				{{#each adultNums:num}}
					<option value="{{num+1}}"  >{{num+1 }}</option>
				{{/each}}
		</select></li>
		<li class="fL mR10 ancillaryshow8 {{^spa}}dN{{/spa}} "><select name="numberOfChild">
				<option value="">Number of Child</option>
				{{#each childNums:num}}
					<option value="{{num+1}}" >{{num+1 }}</option>
				{{/each}}
		</select></li>
		<li class="fL ancillaryshow8 {{^spa}}dN{{/spa}} "><a href="javascript:void(0);"
			class="w100pcnt button button-primary addServicesBtn" on-click="pushData()">Add</a></li>
		<li class="fR ancillaryshow8 {{^spa}}dN{{/spa}} "><span
			class="fS16 srp_famount fR pD10"> <span class="rupee">Rs</span><span name="price">{{spa.price}}</span>
		</span></li>
	</ul>
	<div class="ancillaryshow8">
		{{#each spa.services:num}}
			<ul class="fieldRow clearfix mB20 {{^spa.services}}dN{{/}}" >
				<li><label>Added Ancillary</label></li>
					<li class="fL">Service Type : {{serviceType.type}}<br /> For {{#numberOfAdult}} {{numberOfAdult}} Adults {{/}} {{#numberOfAdult && numberOfChild}},{{/}}
						{{#numberOfChild}} {{numberOfChild}} Child {{/}} {{duration}}
					</li>
					<li class="fL"><span title="delete"
						class="recycle_icon_wishlist mT5 fL" on-click="removeData(num)"></span></li>
			</ul>
		{{/each}}
	</div>	
<c:out value="</script>" escapeXml="false"/>



<c:out value="<script id='transferTemplate' type='text/ractive'>" escapeXml="false"/>
	<ul class="fieldRow clearfix mB20">
		<li><input type="checkbox" value="checked" class="ancillary9" {{#transfer}} checked="checked" {{/transfer}} on-click="onCheck()"  />
			<label>Transfer</label></li>
		<li class="fL mR10 ancillaryshow9 {{^transfer}}dN{{/}}"><select name="transferType">
				<option value="">Transfer Type</option>
				<option value="HotelTransferType">Type 1</option>
		</select></li>
		<li class="fL mR10 ancillaryshow9 {{^transfer}}dN{{/}}"><select name="vehicleType">
				<option value="">Vehicle Type</option>
				<option value="HotelVehicleType">Type 1</option>
		</select></li>
		<li class="fL mR10 ancillaryshow9 {{^transfer}}dN{{/}}"><select name="numberOfAdult">
				<option value="">Number of Adult</option>
				{{#each adultNums:num}}
					<option value="{{num+1}}"  >{{num+1 }}</option>
				{{/each}}
		</select></li>
		<li class="fL mR10 ancillaryshow9 {{^transfer}}dN{{/}}"><select name="numberOfChild">
				<option value="">Number of Child</option>
				{{#each childNums:num}}
					<option value="{{num+1}}" >{{num+1 }}</option>
				{{/each}}
		</select></li>
		<li class="fL mR10 mT10 ancillaryshow9 {{^transfer}}dN{{/}}"><input name="issueDate"
			class="w100pcnt dateField" type="text" placeholder="DD/MM/YYYY"
			readonly /></li>
		<li class="fL mT10 ancillaryshow9 {{^transfer}}dN{{/}}"><a
			href="javascript:void(0);"
			class="w100pcnt button button-primary addServicesBtn"  on-click="pushData()">Add</a></li>
		<li class="fR ancillaryshow9 {{^transfer}}dN{{/}}"><span
			class="fS16 srp_famount fR pD10"> <span class="rupee">Rs</span><span name="price">{{transfer.price}}</span>
		</span></li>
	</ul>
	<div class="ancillaryshow9">
		{{#each transfer.transfers:num}}
			<ul class="fieldRow clearfix mB20 {{^transfer.transfers}}dN{{/}}" >
				<li><label>Added Ancillary</label></li>
					<li class="fL">Transfer Type : {{transferType.type}}<br />Vehicle Type :  {{vehicleType.type}}, For {{#numberOfAdult}} {{numberOfAdult}} Adults {{/}} {{#numberOfAdult && numberOfChild}},{{/}}
						{{#numberOfChild}} {{numberOfChild}} Child {{/}} on {{issueDate}}
					</li>
					<li class="fL"><span title="delete"
						class="recycle_icon_wishlist mT5 fL" on-click="removeData(num)"></span></li>
			</ul>
		{{/each}}
	</div>		
<c:out value="</script>" escapeXml="false"/>


<c:out value="<script id='activityTemplate' type='text/ractive'>" escapeXml="false"/>
	<ul class="fieldRow clearfix mB20">
		<li><input type="checkbox" value="checked" class="ancillary10" {{#activity}} checked="checked" {{/activity}} on-click="onCheck()"   />
			<label>Activity</label></li>
		<li class="fL mR10 ancillaryshow10 {{^activity}}dN{{/activity}} "><select name="activityType">
				<option value="">Activity Name</option>
				<option value="AType1">Type 1</option>
		</select></li>
		<li class="fL mR10 ancillaryshow10 {{^activity}}dN{{/activity}} "><select name="vehicleType">
				<option value="">Vehicle Type</option>
				<option value="v1">Type 1</option>
		</select></li>
		<li class="fL mR10 ancillaryshow10 {{^activity}}dN{{/activity}} "><select name="numberOfAdult">
				<option value="">Number of Adult</option>
				{{#each adultNums:num}}
					<option value="{{num+1}}"  >{{num+1 }}</option>
				{{/each}}
		</select></li>
		<li class="fL mR10 ancillaryshow10 {{^activity}}dN{{/activity}} "><select name="numberOfChild">
				<option value="">Number of Child</option>
				{{#each childNums:num}}
					<option value="{{num+1}}" >{{num+1 }}</option>
				{{/each}}
		</select></li>
		<li class="fL mR10 mT10 ancillaryshow10 {{^activity}}dN{{/activity}} "><input
			class="w100pcnt dateField" type="text" name="issueDate"
			placeholder="DD/MM/YYYY" readonly /></li>
		<li class="fL mR10 ancillaryshow8 {{^activity}}dN{{/activity}} "><select name="duration">
				<option value="">Duration</option>
				{{#each durationNums:num}}
					<option value="{{num+1}}"  >{{num+1 }}</option>
				{{/each}}
		</select></li>
		<li class="fL mR10 mT10 ancillaryshow10 {{^activity}}dN{{/activity}} "><input type="text" name="startDate"
			placeholder="From" /></li>
		<li class="fL mR10 mT10 ancillaryshow10 {{^activity}}dN{{/activity}} "><input type="text" name="endDate"
			placeholder="To" /></li>
		<li class="fL mT10 ancillaryshow10 {{^activity}}dN{{/activity}} "><a
			href="javascript:void(0);"
			class="w100pcnt button button-primary addServicesBtn"  on-click="pushData()">Add</a></li>
		<li class="fR ancillaryshow10 {{^activity}}dN{{/activity}} "><span
			class="fS16 srp_famount fR pD10"> <span class="rupee">Rs</span><span name="price">{{activity.price}}</span>
		</span></li>
	</ul>
	<div class="ancillaryshow10">
		{{#each activity.activities:num}}
			<ul class="fieldRow clearfix mB20 {{^activity.activities}}dN{{/}}" >
				<li><label>Added Ancillary</label></li>
					<li class="fL">Activity Type : {{activityType.type}}<br />Vehicle Type :  {{vehicleType.type}}, For {{#numberOfAdult}} {{numberOfAdult}} Adults {{/}} {{#numberOfAdult && numberOfChild}},{{/}}
						{{#numberOfChild}} {{numberOfChild}} Child {{/}} on {{issueDate}}, "duration:" {{duration}}, {{startDate}}-{{endDate}}
					</li>
					<li class="fL"><span title="delete"
						class="recycle_icon_wishlist mT5 fL" on-click="removeData(num)"></span></li>
			</ul>
		{{/each}}
	</div>	
<c:out value="</script>" escapeXml="false"/>


<c:out value="<script id='equipmentTemplate' type='text/ractive'>" escapeXml="false"/>
	<ul class="fieldRow clearfix mB20">
		<li><input type="checkbox" value="checked" class="ancillary11"  {{#equipment}} checked="checked" {{/equipment}} on-click="onCheck()"   />
			<label>Equipment</label></li>
		<li class="fL mR10 ancillaryshow11 {{^equipment}}dN{{/equipment}} "><select name="equipmentType">
				<option value="">Equipment Name</option>
				<option value="ET1">Equipment Type 1</option>
		</select></li>
		<li class="fL mR10 ancillaryshow11 {{^equipment}}dN{{/equipment}} "><select name="vehicleType">
				<option value="">Vehicle Type</option>
				<option value="VT1">Vehicle Type 1</option>
		</select></li>
		<li class="fL mR10 ancillaryshow11 {{^equipment}}dN{{/equipment}} "><select name="duration">
				<option value="">Duration</option>
				{{#each durationNums:num}}
					<option value="{{num+1}}"  >{{num+1 }}</option>
				{{/each}}
		</select></li>
		<li class="fL mR10 ancillaryshow11 {{^equipment}}dN{{/equipment}} "><input type="text" name="startDate"
			placeholder="From" /></li>
		<li class="fL mR10 mT10 ancillaryshow11 {{^equipment}}dN{{/equipment}} "><input type="text" name="endDate"
			placeholder="To" /></li>
		<li class="fL mR10 mT10 ancillaryshow11 {{^equipment}}dN{{/equipment}} "><input type="text" name="quantity"
			placeholder="Quantity" /></li>
		<li class="fL mT10 ancillaryshow11 {{^equipment}}dN{{/equipment}} "><a
			href="javascript:void(0);"
			class="w100pcnt button button-primary addServicesBtn"  on-click="pushData()">Add</a></li>
		<li class="fR ancillaryshow11 {{^equipment}}dN{{/equipment}} "><span
			class="fS16 srp_famount fR pD10"> <span class="rupee">Rs</span><span name="price">{{equipment.price}}</span>
		</span></li>
	</ul>
	<div class="ancillaryshow11">
		{{#each equipment.equipments:num}}
			<ul class="fieldRow clearfix mB20 {{^equipment.equipments}}dN{{/}}" >
				<li><label>Added Ancillary</label></li>
					<li class="fL">Equipment Type : {{equipmentType.type}}<br />Vehicle Type :  {{vehicleType.type}}, 
						"duration:" {{duration}}, {{startDate}}-{{endDate}}, quantity: {{quantity}}
					</li>
					<li class="fL"><span title="delete"
						class="recycle_icon_wishlist mT5 fL" on-click="removeData(num)"></span></li>
			</ul>
		{{/each}}
	</div>		
<c:out value="</script>" escapeXml="false"/>

<c:out value="<script id='specialrequestTemplate' type='text/ractive'>" escapeXml="false"/>
	<ul class="fieldRow clearfix mB20">
		<li><label>Special request </label></li>
		<li class="fL w50pcnt"><textarea on-change="dataChange()"
				placeholder="Please enter any special request that you may have (e.g. late check in, twin beds,Etc.)"
				value={{specialrequest}} 
				rows="4" class="w100pcnt"></textarea> <span class="fS12 dB cB">We
				will pass your special requests along to your hotel but please note
				that we cannot guarantee these requests, and they may incur
				additional charges.</span></li>
	</ul>
<c:out value="</script>" escapeXml="false"/>


<c:out value="<script id='xxxTemplate' type='text/ractive'>" escapeXml="false"/>
<c:out value="</script>" escapeXml="false"/>
