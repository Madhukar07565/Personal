<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<div id="hotelFacetSearchAside" >

</div>
<script id="templateHotelFacetSearchAside" type="text/ractive">
<aside class="col_3 portdN filterCtr pL0">
	<div id="hotelnumber" class="dN">${result.totalSize}</div>
	<div id="amount1_hotel" class="dN">${result.startAtPrice}</div>
      <form class="brdrLitGry">
        <h1 class="lftTocHrdr">India's largest travel bazaar</h1>
        <section class="lftTocSrcRes">
          <p><span class="fS20" id="number1_hotel"></span> hotels starting at</p>
          <p class=" fS27"><span class="">Rs</span><span id="number2_hotel"></span><span id="number3_hotel"></span></p>
        </section>

      	{{#each facetSearch:num}}
			{{#if code=='brand'}}
	 		 <section class="lftTocContr first mT5">
         		 <p class="mB5">{{name}}</p>
         		 <div class="inputFieldContr w100pcnt">
				<c:set var="autoSuggestKeypathName" value="value" scope="request" />
				<cms:pageSlot position="hotelNameSearchBox" var="feature">
					<cms:component component="${feature}"/>
				</cms:pageSlot>
				</div>
       		 </section>
			{{elseif code=='budgetRange'}}
 			 <header class="lftTocHeading clearfix cursor" id="accHeader{{num}}" on-click="hideShowAcc('accHeader'+num, 'accCont'+num)">
          		<label class="fL mT5" >{{name}}</label>
		 		<span class="fR">
          			<select>
            			<option value="Rs.">Rs.</option>
            			<option value="$">$</option>
         			</select>
		  			<img src="${ezgImagesPath}/down1.png" alt="Arrow" class="mL10 mT5">
		  		</span>
        	</header>
        	<section class="lftTocContr" id="accCont{{num}}">
          		<div class="mB15">
           			 <div class="mB10">Starting from</div>
					 <div decorator='slider:"facetSearch.5.values[0].doubleValue","facetSearch.5.values[1].doubleValue","facetSearch.5.values[0].selected","facetSearch.5.values[1].selected","submitForm"'></div>
					 <br>
					 <span>{{values[0].doubleValue}}</span>-<span>{{values[1].doubleValue}}</span>
          		</div>
          		<ul>
					{{#each values:index}}
						{{#if index >1}}
            			<li class="clearfix mB5">
              				<input type="checkbox"  name="name" checked="{{selected}}" on-click="submitForm()"/>
              				<label for="{{code}}" class="">{{value}}</label>
            			</li>
						{{/if}}
					{{/each}}
          		</ul>
        	</section>
			{{elseif code=='location'}}
            <header class="lftTocHeading accHead" id="accHeader{{num}}" 
					 on-click="hideShowAcc('accHeader' + num, 'accCont' + num)">{{name}}
					 <img src="${ezgImagesPath}/down1.png" alt="Arrow" class="mL10 fR mT5">
			</header>
        	<section class="lftTocContr" id="accCont{{num}}">
				<p class="mB5">Search by location</p>
         			 <div class="inputFieldContr mB20">
					<c:set var="autoSuggestKeypathName" value="value" scope="request" />
					<cms:pageSlot position="hotelLocationSearchBox" var="feature">
						<cms:component component="${feature}"/>
					</cms:pageSlot>
					 </div>
          		 <ul>
           			 {{#each values:num}}
						{{#if num > 4}}
						<li class="clearfix mB5 dN">
							<input type="checkbox" checked="{{selected}}" on-click="submitForm()"/><label>{{value}}({{count}})</label>
	            		</li>
						{{else}}
						<li class="clearfix mB5">
							<input type="checkbox" checked="{{selected}}" on-click="submitForm()"/><label>{{value}}({{count}})</label>
	            		</li>
					 {{/if}}
					{{/each}}
					{{#if values.length > 4}}
		            	<li class="clearfix"> <a href="javascript:void(0)" class="fR" on-click="viewAll('accCont'+num)">View all</a> </li>
					{{/if}}
         		 </ul>
					<div class="overlay_content posF" id="testContent" style="display: none;">
					<div class="white_content_inner w30pcnt_npx w70pcnt_sm clearfix" id="testContentInner">
					<div class="closeBtn_popup fR" onclick="popupclose('testContent', 'fade')"></div>
					<label class="heading fW600 fS16">Locations in New Delhi</label> 
					<input type="text" class="w95pcnt mR10 mB10 fL  ui-autocomplete-input" id="hotel12" placeholder="Look for Locations,Landmarks, Areas or Points of Interests" autocomplete="off" style="color: rgb(216, 214, 214);">
					<ul class="w95pcnt">
					{{#each values}}
					<li class="mB5 clearfix"><span class="col_9 pL0 pR0"> <span
					class="fL mR10 "> <input type="checkbox" id="location_port"
						checked="{{selected}}"> <label for="location_port"></label>
					</span> <span class="fL w70pcnt mLN10">{{value}}</span>
					</span> <span class="col_3 pR0 tR">141</span></li> {{/each}}
						<span class="primaryBtn fR mT10 mR20"
					onClick="popupclose('testContent', 'fade')"><a
					href="javascript:void(0);">Search</a></span>
					<span class="tertiaryBtn fR mT10 mR20"><a
					href="javascript:void(0);"
					onclick="popupclose('testContent', 'fade')">Cancel</a></span>
					</ul>
					</div>
				</div>
       		 </section>
			{{else}}
			<header class="lftTocHeading accHead" id="accHeader{{num}}" 
					 on-click="hideShowAcc('accHeader' + num, 'accCont' + num)">{{name}}
					 <img src="${ezgImagesPath}/down1.png" alt="Arrow" class="mL10 fR mT5">
			</header>
	        <section class="lftTocContr" id="accCont{{num}}" style="display:block;">
	          <ul>
				{{#each values:num}}
					{{#if num > 4}}
						<li class="clearfix mB5 dN">
							<input type="checkbox" checked="{{selected}}" on-click="submitForm()"/><label>{{value}}</label>
	            		</li>
					{{else}}
						<li class="clearfix mB5">
							<input type="checkbox" checked="{{selected}}" on-click="submitForm()"/><label>{{value}}</label>
	            		</li>
					{{/if}}
				{{/each}}
				{{#if values.length > 4}}
		            <li class="clearfix"> <a href="javascript:void(0)" class="fR" on-click="viewAll('accCont'+num)">View all</a> </li>
				{{/if}}
	          </ul>
	        </section>
			{{/if}}
      	{{/each}}
      </form>
    </aside>
</script>
<script>
var ractiveTopHotel = ractiveTopHotel ? ractiveTopHotel : {};
$(function() {
ractiveTopHotel.facet = new Ractive({
    el: '#hotelFacetSearchAside',
    template: '#templateHotelFacetSearchAside',
    data: { 
    	'facetSearch':${facetViewJson}
    },
	'hideShowAcc' : function(clickSection, targetSection) {
		console.log(clickSection+"|"+targetSection);
			$("#" + targetSection).slideToggle("slow");
			$('#' + targetSection).toggleClass("active");
			if ($('#' + targetSection).hasClass('active')) {
				$('#' + clickSection).find('img').attr('src',
						ezgImagesPath + '/up1.png');
			} else {
				$('#' + clickSection).find('img').attr('src',
						ezgImagesPath + '/down1.png');
			}
		},
    'viewAll' : function(clickSection){
    	$("#"+clickSection+" li").show();
    	$("#"+clickSection+" li :last").hide();
   		},
   	'submitForm':function(){
   		ractiveTopHotel.submitForm("facetSearch");
   		}
	});
});
</script>
    