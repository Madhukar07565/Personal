<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<!-- Left Search Container begins for 1024 and above-->
    <aside id="asideFacetFlightAndHotel" class="col_3 portdN pL0">
    </aside>
    <!-- Left Search Container begins ends-->
<script id="templateFacetFlightAndHotel" type="text/ractive">
{{#if section2AViewModel}}
      <form class="brdrLitGry">
{{#section2AViewModel.0}}
        <h1>India's largest travel bazaar</h1>
        <section class="lftTocSrcRes"> <span class="fS20" id="number1"></span> Flights & Hotels starting at<br>
          <span class="fS27 clearfix dB"><span class="rupee">Rs</span><span id="number2"></span> <span id="number3"></span></span> <span class="fS11">Per person, all inclusive</span> </section>
          <header class="lftTocHeading clearfix cursor" id="accHeader3" onclick="hideShowAcc('accHeader3', 'accCont3')">
          <label class="fL mT5" onclick="hideShowAcc('accHeader3', 'accCont3')">Price range</label><img src="${ezgImagesPath}/down1.png" alt="Arrow" class="mR5 fR mT5">
          </header>
          <ul class="lftTocContr" id="accCont3">
            <li><div decorator='slider:"section2AViewModel.0.values[0].value","section2AViewModel.0.values[1].value","section2AViewModel.0.values[0].selected","section2AViewModel.0.values[1].selected","submitForm"'></div><input type="text" value="{{values[0].value + "-" + values[1].value}}" readonly="" class="rangeTxt"></li>
          </ul>
{{/section2AViewModel.0}}
{{#section2AViewModel.1}}
		 <header class="lftTocHeading" id="accHeader1" onclick="hideShowAcc('accHeader1', 'accCont1')">Star rating<img src="${ezgImagesPath}/down1.png" alt="Arrow" class="mR5 fR mT5"></header>
          <ul class="lftTocContr clearfix" id="accCont1">
{{#section2AViewModel.1.values}}
            <li class="fL mR5 mB5 stackChkBox">
              <input type="checkbox" id="{{code}}" checked="{{selected}}" on-change="submitForm()" /><label for="{{code}}">{{name}}</label>
            </li>
{{/section2AViewModel.1.values}}
          </ul>
{{/section2AViewModel.1}}
{{#section2AViewModel.2}}
		  <header class="lftTocHeading" id="accHeader9" onclick="hideShowAcc('accHeader9', 'accCont9')">Search by hotel name<img src="${ezgImagesPath}/down1.png" alt="Arrow" class="mR5 fR mT5"></header>
          <ul class="lftTocContr clearfix" id="accCont9">
{{#section2AViewModel.2.values:index}}
            <li class="mB5 clearfix">
                    <input style="color: rgb(170, 170, 170);" class="w75pcnt mR10 fL" placeholder="Search by hotel name" value="{{value}}" type="text" />
                    <span class="primaryBtn fR" on-click="submitForm()"><a href="javascript:void(0);">Go</a></span> </li>
{{/section2AViewModel.2.values:index}}
          </ul>
{{/section2AViewModel.2}}
{{#section2AViewModel.3}}
	<header class="lftTocHeading cursor" id="accHeader4" onclick="hideShowAcc('accHeader4', 'accCont4')">Search by location<img src="${ezgImagesPath}/down1.png" alt="Arrow" class="mR5 fR mT5"></header>
    <ul class="lftTocContr" id="accCont4" style="display:block">
{{#section2AViewModel.3.values.0}}
		<li class="mB5 clearfix">
        	<input style="color: rgb(170, 170, 170);" class="w75pcnt mR10 fL" placeholder="Enter locality or region" value="{{value}}" type="text">
        	<span class="primaryBtn fR" on-click="submitForm()"><a href="javascript:void(0);">Go</a></span>
		</li>
{{/section2AViewModel.3.values.0}}
{{#section2AViewModel.3.values:index}}{{#if index > 0}}
        <li class="clearfix {{(0 <= index && index <= CONFIG.DEFAULT_FACET_SIZE) ? '' : 'dN'}}"><input type="checkbox" checked="{{selected}}" on-change="submitForm()" /><label class="label">{{name}}</label></li>
{{/if}}{{/section2AViewModel.3.values:index}}
{{#if this.values.length > CONFIG.DEFAULT_FACET_SIZE}}
		<li class="clearfix">
			<a href="javascript:void(0);" onclick="$(this).hide().closest('ul').find('li').show();" class="button button-primary pL10 pR10 mL10">Show all {{section2AViewModel.3.values.length - 1}} locations</a>
		</li>
{{/if}}
	</ul>
{{/section2AViewModel.3}}
{{#section2AViewModel:indexVar}}
	{{#if (4 <= indexVar && indexVar <=7)}}
		<header class="lftTocHeading cursor" id="accHeader{{934 + indexVar}}" onclick="hideShowAcc('accHeader{{934 + indexVar}}', 'accCont{{934 + indexVar}}')">
            {{name}}<img src="${ezgImagesPath}/down1.png" alt="Arrow" class="mR5 fR mT5">
        </header>
        <ul class="lftTocContr" id="accCont{{934 + indexVar}}" style="display:block;">
            {{#this.values:indexVar}}
            <li class="clearfix {{(0 <= indexVar && indexVar < CONFIG.DEFAULT_FACET_SIZE) ? '' : 'dN'}}">
                <input type="checkbox" checked="{{selected}}" on-change="submitForm()" /><label class="label">{{name}}</label>
            </li>
            {{/this.values}}
            {{#if this.values.length > CONFIG.DEFAULT_FACET_SIZE}}
			<li class="clearfix">
            	<a href="javascript:void(0);" onclick="$(this).hide().closest('ul').find('li').show();" class="button button-primary pL10 pR10 mL10">Show all {{this.values.length}} {{name}}</a>
			</li>
		    {{/if}}
        </ul>
	{{/if}}
{{/section2AViewModel}}

      </form>
{{/if}}
</script>
<script type="text/javascript">
var ractiveFlightAndHotel = ractiveFlightAndHotel ? ractiveFlightAndHotel : {};
$(function() {
ractiveFlightAndHotel.facet = new Ractive({
	el: '#asideFacetFlightAndHotel',
	template: '#templateFacetFlightAndHotel',
	oninit: function () {
	},
	data: {
		'CONFIG': {
			'DEFAULT_FACET_SIZE': 3
		},
		'history': {
			'section2AViewModel': <c:if test="${empty section2AViewModel}">''</c:if><c:if test="${not empty section2AViewModel}">${section2AViewModel}</c:if>
		},
		'section2AViewModel': <c:if test="${empty section2AViewModel}">''</c:if><c:if test="${not empty section2AViewModel}">${section2AViewModel}</c:if>
	},
	'submitForm': function () {
		ractiveFlightAndHotel.submitForm('facet');
	}
});
});
</script>