<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ attribute name="fareCarouselMap" required="true" type="java.util.Map" %>
<%@ attribute name="theIndex" required="false"  %>
<%@ attribute name="selectedItemKey" required="false"  %>
<ul id="third-carousel"
	class="first-and-second-carousel jcarousel-skin-flight-twoway">
	<c:forEach items="${fareCarouselMap}" var="fareCarouselEntry" varStatus="status">
		<c:if test="${fareCarouselEntry.key == selectedItemKey}">
		<li class="tC sel" onclick="submitCarouselForm(${theIndex} , '${fareCarouselEntry.key}')"> 
			<span id="fareCarousel${theIndex}-${status.index}" >${fareCarouselEntry.key }</span
			><span class="fS18 fW400 w100pcnt fL"><span class="rupee">Rs</span>${fareCarouselEntry.value.webPrice }
			</span></li>
		</c:if>
		<c:if test="${fareCarouselEntry.key != selectedItemKey}">
			<li class="tC " onclick="submitCarouselForm(${theIndex}, '${fareCarouselEntry.key}')" > 
			<span id="fareCarousel${theIndex}-${status.index}" >${fareCarouselEntry.key }</span>
			<span class="fS18 fW400 w100pcnt fL"><span class="rupee">Rs</span>${fareCarouselEntry.value.webPrice }
			</span></li>
		</c:if>
	</c:forEach>
	
	
</ul>

<script type="text/javascript">
var ractiveFlight = ractiveFlight ? ractiveFlight : {};
$(function() {
	


	//alert( document.getElementById('fareCarousel0').innerHTML);
	submitCarouselForm = function(index, startDate) {
	        ractiveTopFlight.changeStartDate('twoway', index, startDate);
	        ractiveTopFlight.submitForm('search');
	
	}
	ractiveTopFlight.changeStartDate = function (type, index, startDate){
		var that = this.search;
		if(type == 'oneway'){
			var ow = that.get('oneway');
			ow.startTime = startDate;
			that.update();
		}else if(type == 'twoway'){
			var tw = that.get('twoway');
			if(index == 0){
				tw.startTime= startDate;
			}else{
				tw.returnTime = startDate;
			}
			
		}else if(type == 'multicity'){
			var tw = that.get('multicity.trips[' + index + ']');
			tw.startTime = startDate;
		}
		that.update();
	};
	
	var innerStr;
	var element;
	for(var i = 0 ; i < ${fareCarouselMap.size()} ; i++){
		element = document.getElementById('fareCarousel'+${theIndex}+ '-' + i); 
		innerStr = element.innerHTML;
		//alert(innerStr);
		element.innerHTML = getFormatDateStr(innerStr);
	}
});

function setFormatDate(elementId,dateStr){
	document.getElementById(elementId).innerHTML = getFormatDateStr(dateStr);
}

function getFormatDateStr(dateStr){
	if(dateStr == ""){
		return " ";
	}
	var date = new Date(dateStr);
	return date.getDate() + " " + getMonthName(date) + ", " + getWeekdayName(date);
}

function getWeekdayName(date){
	return ["Sun","Mon","Tue","Wed","Thu","Fri","Sat"][date.getDay()];
}

function getMonthName(date){
	return ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"][date.getMonth()];
}


</script>