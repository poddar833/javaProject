<%-- 
    Document   : home
    Created on : Apr 27, 2017, 5:49:19 PM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<title>Day Temperature</title>
		<style>
			.chart-container {
				width: 640px;
				height: auto;
			}
		</style>
		
</head>
	<body>
			<div class="chart-container">
				<canvas id="mycanvas"></canvas>
			</div>
			
			
			<script type="text/javascript" src="jquery-3.2.1.min.js"></script>
			<script type="text/javascript" src="Chart.min.js"></script>
			<script type="text/javascript" src="linegraph.js"></script>
	</body>
</html>