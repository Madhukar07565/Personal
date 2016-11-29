<!-- Earnings Pie Script -->	
		var doughnutData = [
				{
					value: 300,
					color:"rgba(151,187,205,1)",
					highlight: "rgba(151,187,205,1)",
					label: "Red"
				},
				{
					value: 50,
					color: "#FDB45C",
					highlight: "#FDB45C",
					label: "Green"
				}

			];
			var randomScalingFactor = function(){ return Math.round(Math.random()*100)};
<!-- Commission Bar Script -->
	var CommissionBar = {
		labels : ["","","",""],
		datasets : [
			{
				fillColor : "rgba(055,160,215,1)",
				strokeColor : "rgba(220,220,220,0.8)",
				highlightFill: "rgba(220,220,220,0.75)",
				highlightStroke: "rgba(220,220,220,1)",
				data : [2,4,2,3]
			}
		]

	}
<!-- Top Up Bar Script -->
	var TopUpBar = {
		labels : ["","","",""],
		datasets : [
			{
				fillColor : "#16a086",
				strokeColor : "rgba(220,220,220,0.8)",
				highlightFill: "rgba(220,220,220,0.75)",
				highlightStroke: "rgba(220,220,220,1)",
				data : [2,4,2,3]
			}
		]

	}
<!-- Time Wise Bar Script -->	
	var TimeWiseBar = {
		labels : ["","","","","",""],
		datasets : [
			{
				fillColor : "rgba(055,160,215,1)",
				strokeColor : "rgba(220,220,220,0.8)",
				highlightFill: "rgba(220,220,220,0.75)",
				highlightStroke: "rgba(220,220,220,1)",
				data : [2,4,2,3,4,2]
			}
		]

	}
	
<!-- Sub-Agents Bar Script -->	
	var SubAgentsBar = {
		labels : ["","","",""],
		datasets : [
			{
				fillColor : "rgba(055,160,215,1)",
				strokeColor : "rgba(220,220,220,0.8)",
				highlightFill: "rgba(220,220,220,0.75)",
				highlightStroke: "rgba(220,220,220,1)",
				data : [2,4,2,3]
			}
		]

	}
	
<!-- Employees Bar Script -->	
	var EmployeesBar = {
		labels : ["","","",""],
		datasets : [
			{
				fillColor : "rgba(055,160,215,1)",
				strokeColor : "rgba(220,220,220,0.8)",
				highlightFill: "rgba(220,220,220,0.75)",
				highlightStroke: "rgba(220,220,220,1)",
				data : [2,4,2,3]
			}
		]

	}
	
	
<!-- branches Bar Script -->	
	var BranchesBar = {
		labels : ["","","",""],
		datasets : [
			{
				fillColor : "rgba(055,160,215,1)",
				strokeColor : "rgba(220,220,220,0.8)",
				highlightFill: "rgba(220,220,220,0.75)",
				highlightStroke: "rgba(220,220,220,1)",
				data : [2,4,2,3]
			}
		]

	}
<!-- Products Pie Chart Script -->	
	var pieData = [
				{
					value: 300,
					color:"#F7464A",
					highlight: "#FF5A5E",
					label: "Holidays"
				},
				{
					value: 50,
					color: "#46BFBD",
					highlight: "#5AD3D1",
					label: "Hotels"
				},
				{
					value: 100,
					color: "#FDB45C",
					highlight: "#FFC870",
					label: "Flights"
				},
				{
					value: 40,
					color: "#949FB1",
					highlight: "#A8B3C5",
					label: "Flights + Hotels"
				},
				{
					value: 40,
					color: "#46BFBD",
					highlight: "#5AD3D1",
					label: "Bus"
				},
				{
					value: 120,
					color: "#4D5360",
					highlight: "#616774",
					label: "Car"
				},
				{
					value: 20,
					color: "#949FB1",
					highlight: "#A8B3C5",
					label: "Rail"
				}

			];

			window.onload = function(){
				var ctx = document.getElementById("chart-area").getContext("2d");
				window.myDoughnut = new Chart(ctx).Doughnut(doughnutData, {responsive : true});
				var atx = document.getElementById("CE").getContext("2d");
				window.myBar = new Chart(atx).Bar(CommissionBar, {responsive : true});
				var btx = document.getElementById("TopUp").getContext("2d");
				window.myBar = new Chart(btx).Bar(TopUpBar, {responsive : true});
				var timewise = document.getElementById("TimeWise").getContext("2d");
				window.myBar = new Chart(timewise).Bar(TimeWiseBar, {responsive : true});
				var products = document.getElementById("productChart").getContext("2d");
				window.myPie = new Chart(products).Pie(pieData);
				var SubAgents = document.getElementById("SubAgents").getContext("2d");
				window.myBar = new Chart(SubAgents).Bar(SubAgentsBar, {responsive : true});
				var Employee = document.getElementById("Employee").getContext("2d");
				window.myBar = new Chart(Employee).Bar(EmployeesBar, {responsive : true});
				var Branches = document.getElementById("Branches").getContext("2d");
				window.myBar = new Chart(Branches).Bar(BranchesBar, {responsive : true});
			};


