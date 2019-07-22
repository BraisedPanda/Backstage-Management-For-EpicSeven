<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test01.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script src="/Demo2/WebRoot/js/jquery.min.js"></script>
	<script>
		
		$(function(){
			$("#div1").click = function(){
				alert("1");
				
			}
			
			function test(){
				var div = $(".div1").value();
				$("#div2").innerHTML(div);
				
			}
			
			function count(){
				$("body").children("div");
			}
		});
	</script>
  </head>
  
  <body>
   <div id="div1" name="div1" class="div1">div1</div>
   <div id="div2">div2</div>
   <div id="div3">div3</div>
  </body>
</html>
