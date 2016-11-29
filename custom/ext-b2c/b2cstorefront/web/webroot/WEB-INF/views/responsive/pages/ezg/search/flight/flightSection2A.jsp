<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="result" value="${flightSection2BViewModel}" />


<!-- Left Search Container begins for 1024 and above-->
    <aside id="asideFacetFlight" class="col_3 portdN pL0">
    </aside>
<!-- Left Search Container begins ends-->
<script id="templateFacetFlight" type="text/ractive">    
{{#if currentFacets}}
      <form class="brdrLitGry">
	{{#currentFacets.0}} 
        <h1>India's largest travel bazaar</h1>
<%-- the fake numbers Starts--%>

<div id="flightnumber" class="dN">${result.totalSize}</div>
	<div id="amount1_flight" class="dN">${result.startAtPrice}</div>
<%-- the fake numbers End--%>

        <section class="lftTocSrcRes"> <span class="fS20" id="number1_flight">55</span> flights starting at<br>
          <span class="fS27 clearfix dB"><span class="rupee">Rs</span><span id="number2_flight"></span> </span> <span class="fS11">Per person, all inclusive</span> </section>
        <section class="lftTocContr"><a href="javascript:void(0)" onclick="popupwin('fareAlert', 'fareAlertinner', 'fade')">Set fare alert</a></section>
    
        <header class="lftTocHeading cursor" id="accHeader2" onclick="hideShowAcc('accHeader2', 'accCont2')">Time Range<img src="${ezgImagesPath}/down1.png" alt="Arrow" class="mL10 fR mT5"></header>
        <ul class="lftTocContr" id="accCont2">
          <li>
		  <label class="dB mB10">{{currentFacets.0.name}}</label>
            <%--<div id="slider-departure"></div>
            <input type="text" id="departure"  readonly="readonly" class="rangeTxt" />--%>
            <div decorator='slider:"currentFacets.0.values[0].value","currentFacets.0.values[1].value","currentFacets.0.values[0].selected", "currentFacets.0.values[1].selected", "submitForm", 24'></div>
				<br>
			<span>{{currentFacets.0.values[0].value}}:00</span> - <span>{{currentFacets.0.values[1].value}}:00</span>

          </li>
			<br/>
		   <li >
            <label class="dB mB10">{{currentFacets.1.name}}</label>
            <div decorator='slider:"currentFacets.1.values[0].value","currentFacets.1.values[1].value","currentFacets.1.values[0].selected", "currentFacets.1.values[1].selected", "submitForm", 24'></div>
				<br>
			<span>{{currentFacets.1.values[0].value}}:00</span> - <span>{{currentFacets.1.values[1].value}}:00</span>
          </li>
        </ul>
	{{/currentFacets.0}}   
	{{#currentFacets.2}}     
        <header class="lftTocHeading clearfix cursor">
          <label class="fL mT5">Price range</label>
		  <span class="fR">
          <select>
            <option value="Rs.">Rs.</option>
            <option value="$">$</option>
          </select>
		  <span onclick="hideShowAcc('accHeader3', 'accCont3')" id="accHeader3" >
		  <img src="${ezgImagesPath}/down1.png" alt="Arrow" class="mL10 mB5">
		  </span>
		  </span>
        </header>
        <ul class="lftTocContr" id="accCont3">
          <li>
            <div decorator='slider:"currentFacets.2.values[0].doubleValue","currentFacets.2.values[1].doubleValue", "currentFacets.2.values[0].selected", "currentFacets.2.values[1].selected","submitForm"'></div>
				<br>
			<span>{{values[0].doubleValue}}</span> - <span>{{values[1].doubleValue}}</span>

            <span class="dB clearfix">
            <input type="checkbox" id="GroupBooking" class="mT10" />
            <label class="mT10 fS13" for="GroupBooking">Show only refundable fares</label>
            </span> </li>
        </ul>
	{{/currentFacets.2}}     
	{{#currentFacets.3}}    
        <header class="lftTocHeading cursor" id="accHeader4" onclick="hideShowAcc('accHeader4', 'accCont4')">No. of stops<img src="${ezgImagesPath}/down1.png" alt="Arrow" class="mR5 fR mT5"></header>
        <ul class="lftTocContr" id="accCont4" style="display:block">
		{{#currentFacets.3.values:index}}        
          <li class="clearfix">
            <input type="checkbox" id="{{code}}" checked="{{selected}}" on-change="submitIt()"/>
            <label class="label" for="nonstop">{{name}}</label>
            <span class="fR"><span class="rupee">Rs.</span>{{value}}</span></li>
		{{/currentFacets.3.values:index}}            
          
        </ul>
	{{/currentFacets.3}}  
	{{#currentFacets.4}}    
        <header class="lftTocHeading cursor" id="accHeader5" onclick="hideShowAcc('accHeader5', 'accCont5')">Class<img src="${ezgImagesPath}/down1.png" alt="Arrow" class="mR5 fR mT5"></header>
        <ul class="lftTocContr" id="accCont5" style="display:block;">
		{{#currentFacets.4.values:index}}             
          <li class="clearfix">
            <input type="checkbox" id="{{code}}" checked="{{selected}}" on-change="submitIt()"/>
            <label class="label" for="firstClass">{{name}}</label>
            <span class="fR"><span class="rupee">Rs.</span>{{value}}</span> </li>
		{{/currentFacets.4.values:index}}            
          
        </ul>
	{{/currentFacets.4}}   
	{{#currentFacets.5}}      
        <header class="lftTocHeading cursor" id="accHeader6" onclick="hideShowAcc('accHeader6', 'accCont6')">Airlines<img src="${ezgImagesPath}/down1.png" alt="Arrow" class="mR5 fR mT5"></header>
        <ul class="lftTocContr" id="accCont6"  style="display:block;">
        {{#currentFacets.5.values:index}} 
          <li class="clearfix">
            <input type="checkbox" id="{{code}}" checked="{{selected}}" on-change="submitForm(5, index)"/>
            <label class="label" for="goBiz">{{name}} ({{count}})</label>
            <span class="fR"><span class="rupee">Rs.</span>{{value}}</span> </li>
		{{/currentFacets.5.values:index}}
         
        </ul>
	{{/currentFacets.5}}          
      </form>
{{/if}}      

</script>

<script type="text/javascript">
var ractiveTopFlight = ractiveTopFlight ? ractiveTopFlight : {};
$(function() {
	ractiveTopFlight.facet = new Ractive({
	el: '#asideFacetFlight',
	template: '#templateFacetFlight',
	oninit: function () {
		var facetList = this.get('history.flightSection2AViewModel');
		var currentSection = this.get('currentSection');
		this.set('currentFacets', facetList[currentSection].facets);
	},
	data: {
		'history': {
			'flightSection2AViewModel': <c:if test="${empty flightSection2AViewModel}">''</c:if><c:if test="${not empty flightSection2AViewModel}">${flightSection2AViewModel}</c:if>
		},
		'currentFacets': '',
		'currentSection': <c:if test="${empty currentSection}">0</c:if><c:if test="${not empty currentSection}">${currentSection}</c:if>
		
	},
	'submitForm': function (facetIndex, index) {
		var airlineitems = this.get('currentFacets.4.values');
		for(var index =0; index < airlineitems.length; index++){
			airlineitems[index].currentSelected = false;	
		}
		this.update();
		ractiveTopFlight.submitForm('facet');
	},
	
	'submitIt': function () {
		
		ractiveTopFlight.submitForm('facet');
	}
});

});

function switchFacet(slideNumber){
	
	var facetList = ractiveTopFlight.facet.get('history.flightSection2AViewModel');
	console.log(facetList);
	ractiveTopFlight.facet.set('currentFacets', facetList[slideNumber].facets);	
	ractiveTopFlight.facet.set('currentSection', slideNumber);
	ractiveTopFlight.facet.update();
}
</script>
    