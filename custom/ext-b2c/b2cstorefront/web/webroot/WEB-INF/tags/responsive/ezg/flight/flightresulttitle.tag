<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="type" required="true" %>
<%@ attribute name="theIndex" required="true"%>
<c:set var="viewModel" value="${flightSection1ViewModel}"/>

<div class="tC mB10 fW400">
	<div id='resultTitle${theIndex}'></div>
	<script id="templateTwowayResultTitle${theIndex}" type="text/ractive">
		<span>{{from}}</span> <span class="flight_icon_sml mL5 mR5"></span>
		<span>{{to}}</span> <span>| {{dateTime}}</span>
	</script>
</div>


<script type="text/javascript">

	resultTitle= new Ractive({
		el: '#resultTitle${theIndex}',
		template: '#templateTwowayResultTitle${theIndex}',
		oninit: function (){
			var type = "${type}";
			var index = ${theIndex};
			var titleDetails;
			if(type == "oneway"){
				titleDetails = ${viewModel}.twoway;
				this.set('from',titleDetails.from);
				this.set('to',titleDetails.to);
				this.set("dateTime",getFormatDateStr(titleDetails.startTime));
			}else if(type == "twoway"){
				titleDetails = ${viewModel}.twoway;
				if(index == 0){
					this.set('from',titleDetails.from);
					this.set('to',titleDetails.to);
					this.set("dateTime",getFormatDateStr(titleDetails.startTime));
				}else{
					this.set('from',titleDetails.to);
					this.set('to',titleDetails.from);
					this.set("dateTime",getFormatDateStr(titleDetails.returnTime));
				}
			}else if(type == "multicity"){
				titleDetails = ${viewModel}.multicity[index];
				this.set('from',titleDetails.from);
				this.set('to',titleDetails.to);
				this.set("dateTime",getFormatDateStr(titleDetails.startTime));
			}
		},
		data:{
			'from':'',
			'to':'',
			'dateTime':''
		}
	});
	function getFormatDateStr(dateStr){
		//parse Date
		if(dateStr == ""){
			return " ";
		}
		var date = new Date(dateStr);
		//return formated date string
		return date.getDate() + " " + getMonthName(date) + ", " + getWeekdayName(date);
	}

	function getWeekdayName(date){
		return ["Sun","Mon","Tue","Wed","Thu","Fri","Sat"][date.getDay()];
	}

	function getMonthName(date){
		return ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"][date.getMonth()];
	}
</script>