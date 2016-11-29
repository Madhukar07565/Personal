<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ attribute name="theTabIndex" required="true"  type="java.lang.Integer" %>
<%@ attribute name="isTwoway" required="false"  type="java.lang.Boolean" %>

<div id="sortedDiv${theTabIndex}" ></div>

<script id="templateSortedDiv${theTabIndex}" type="text/ractive">

{{#sortedConditionList[${theTabIndex}]}}
<li class="flightHeading clearfix">
<c:if test="${empty isTwoway}" >
	<span class="fL pL10 tL">Sort By</span>
</c:if>	
{{#each sortedConditionList[${theTabIndex}].conditions : index}}
	{{#!selected}}
	<span class="duration">
		<a href="javascript:void(0);" class="mL30" on-click='submit(index, desc)'>{{name}}</a>
	</span>
 	{{/selected}}
	
	{{#selected}}
	<a href="javascript:void(0);" on-click='submit(index, !desc)'>
		<span class="totalPrice mL15_pcnt" style="font-size:14px !important;">
			{{name}}
			<span class="sortAro_{{desc? 'down': 'up'}}_icon mL5">
			</span>
		</span>
	</a> 
	{{/selected}}
{{/each}}
</li>
{{/sortedConditionList}}


</script>

<script type="text/javascript">
var ractiveTopFlight = ractiveTopFlight ? ractiveTopFlight : {};
$(function() {
	ractiveTopFlight.sorted${theTabIndex} = new Ractive({
		el: '#sortedDiv${theTabIndex}',
		template: '#templateSortedDiv${theTabIndex}',
		
		data: {
			'sortedConditionList': ${flightSortDataModel} 
		},
	
		submit: function(index, desc){
			
			var sortedConditionList = this.get('sortedConditionList');
			
			var isSelected = sortedConditionList[${theTabIndex}].conditions[index].selected;
			if(!isSelected){
				sortedConditionList[${theTabIndex}].conditions.forEach(function(e){
					e.selected = false;
				});
			}else{
				sortedConditionList[${theTabIndex}].conditions[index].desc = desc;
			}
			sortedConditionList[${theTabIndex}].conditions[index].selected = true;
			
			
			var searchCtx = ractiveTopFlight.search;
			
			//update sort
			this.set('sortedConditionList', sortedConditionList);
			this.update();
			
			
			//ajax call for sorting
			searchCtx.set('history.flightSortDataModel', sortedConditionList);
			ractiveTopFlight.submitForm('sorted');
		}
	});
	
});

</script>
	