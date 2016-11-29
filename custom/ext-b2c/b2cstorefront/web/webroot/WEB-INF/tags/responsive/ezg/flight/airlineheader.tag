<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


 <ul  id="bestflight-carousel" class="srpOfferTab  first-and-second-carousel jcarousel-skin-flightRecomd mR10  fS12 clearfix cB">
		</ul>
<script id="templateFacet2BFlight" type="text/ractive">

{{#flightSection2AViewModel.5}} 
          <li id="airlineTab1" class="" on-click="submitForm()" >

            <div class="tab">Best price<br />
              <span class="fS12">(All airlines)</span></div>
          </li>
{{/flightSection2AViewModel.5}}   
      


{{#flightSection2AViewModel.5.values: index}}           
          <li id="airlineTab{{index+2}}" on-click="submitForm(index)"  class="{{currentSelected ? 'sel' : ''}}">
            <div class="tab clearfix" > <%--<img src="images/srp_flight/sj_sml_logo.jpg" alt="Spice Jet Logo"  class="fL mR10"/>--%> <span class="fL mTN5">{{name}}<br />
              <span class="rupee fW600">Rs </span><span class="fW600">{{value}}</span></span> </div>
          </li>
{{/flightSection2AViewModel.5.values: index}} 
        

</script>
<script type="text/javascript">


var ractiveFlight = ractiveFlight ? ractiveFlight : {};
$(function() {
	ractiveFlight.facet2B = new Ractive({
		el: '#bestflight-carousel',
		template: '#templateFacet2BFlight',
		oninit: function () {
		},
		data: {
			'history': {
				'flightSection2AViewModel': <c:if test="${empty flightSection2AViewModel}">''</c:if><c:if test="${not empty flightSection2AViewModel}">${flightSection2AViewModel}</c:if>
			},
			'flightSection2AViewModel': <c:if test="${empty flightSection2AViewModel}">''</c:if><c:if test="${not empty flightSection2AViewModel}">${flightSection2AViewModel}</c:if>
		},
		'submitForm': function (currentSelected) {
			//actually submit the facet data to controller
			var airlineitems = ractiveFlight.facet.get('flightSection2AViewModel.5.values');
			for(var index =0; index < airlineitems.length; index++){
				if(index == currentSelected){
					airlineitems[index].currentSelected = true;
					airlineitems[index].selected = true;
				}else{
					airlineitems[index].currentSelected = false;
					airlineitems[index].selected = false;
				}
			}
			//var currentItem = ractiveFlight.facet.get('flightSection2AViewModel.4.values.'+currentSelected);
			//currentItem.currentSelected = true;
			this.update();
			ractiveFlight.submitForm('facet');
		}
	});
	
});


</script>  