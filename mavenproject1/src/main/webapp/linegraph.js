$(document).ready(function(){
	$.ajax({
		url : "http://localhost:8888/TodayTemp",
		type : "GET",
		success : function(data){
			

                        var date = [];
			var temp = [];
			

			for(var i in data) {
				date.push(data[i].date);
				temp.push(data[i].temp);
				
			}

			var chartdata = {
				labels: date,
				datasets: [
					{
						label: "temperature",
						fill: false,
						backgroundColor: "rgba(59, 89, 152, 0.75)",
						borderColor: "rgba(59, 89, 152, 1)",
						pointHoverBackgroundColor: "rgba(59, 89, 152, 1)",
						pointHoverBorderColor: "rgba(59, 89, 152, 1)",
						data: temp
					},
					
				]
			};

			var ctx = $("#mycanvas");

			var LineGraph = new Chart(ctx, {
				type: 'line',
				data: chartdata
			});
		},
		error : function(data) {

		}
	});
});