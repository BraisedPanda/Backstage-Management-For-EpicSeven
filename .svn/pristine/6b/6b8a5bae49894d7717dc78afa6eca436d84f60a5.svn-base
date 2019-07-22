<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'message.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
	.message{
	margin:0 auto;
	text-align:center;
	margin-top:100px;
	width:600px;
	height:180px;
	border:1px solid #a7a8bd;
	}
	.text{
	margin-top:50px;
	}
	p{
	font-size:13px;
	margin-top:60px;
	color:#207f4c;
	}
	a{
	color:#207f4c;
	}
</style>
  </head>
  
  <body>
  <div class="message">
  	<div class="text">
    <h3>${message }</h3>
    <p><a href="findAllGoods.action?currentPage=1">页面将在3秒后自动跳转，若没有跳转，点击这里手动跳转</a></p>
    </div>
   </div>
   <% 
	response.setHeader("Refresh", "3;url=findAllGoods.action?currentPage=1"); 
	%>
  </body>
</html>
