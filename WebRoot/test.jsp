<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js">
	</script>
	<script>
		$(function(){
			$("ul").on("click","li",function(){
				$(this).parent().append("<li>"+"6.啪啪啪"+"</li>");
				$(this).css("text-decoration","line-through");
				$(this).css("color","red");
			});
		
		});
	</script>
  </head>
  
  <body>
    	<ul>
    		<li>1.洗衣服</li>
    		<li>2.做饭</li>
    		<li>3.烧水</li>
    		<li>4.烧菜</li>
    		<li>5.洗碗</li>
    		
    	</ul>
  </body>
</html>
