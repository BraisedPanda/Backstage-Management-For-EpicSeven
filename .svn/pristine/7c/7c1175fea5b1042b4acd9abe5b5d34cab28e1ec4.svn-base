<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'piechart.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/piechart.css" />
	<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js">
	</script>
	<script>
	window.onload = function(){
	am4core.useTheme(am4themes_animated);

var chart = am4core.create("chartdiv", am4charts.PieChart);

$.ajax({
	type: "get",
	url: "${pageContext.request.contextPath }/testjson.action",
	dataType: "json",
	async: false,
	success: function(result){
		var jsonstr="[]";
		var jsonarray = eval('('+jsonstr+')');
		for(var i=0; i<result.length;i++){
		 var arr  =
    	 {
         "country" :result[i].chartName ,
         "litres" : result[i].value
          }
         jsonarray.push(arr); 
	}
	 	console.log(jsonarray);
		chart.data = jsonarray;

	}
});




var series = chart.series.push(new am4charts.PieSeries());
series.dataFields.value = "litres";
series.dataFields.category = "country";

// this creates initial animation
series.hiddenState.properties.opacity = 1;
series.hiddenState.properties.endAngle = -90;
series.hiddenState.properties.startAngle = -90;

chart.legend = new am4charts.Legend();
	
	}
	

  
	</script>
  </head>
  
  <body>
   <div id="chartdiv"></div>
    <script src="js/core.js"></script>
    <script src="js/charts.js"></script>
    <script src="js/animated.js"></script>
   <!--  <script src="js/piechart1.js"></script> -->
  </body>
</html>
