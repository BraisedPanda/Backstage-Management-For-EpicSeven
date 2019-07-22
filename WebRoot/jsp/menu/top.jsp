<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'top.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
		body{
		margin:0;
		padding:0;
		}
		.title{
		 float:left;
		 margin:7px auto 0 20px;
		 color:#eef7f2;
		 font-family:幼圆;
		 font-size:18px;
		}
		.menu{
		
		float:right;
		margin:10px 50px auto auto;
		
		}
		ul{
		list-style:none;
		}
		ul>li{
		float:left;
		margin:10px;
		color:white;
		font-size:16px;
		}
		a{
		text-decoration:none;
		color:white;
		
		
		}
		font{
		color:#41ae3c;
		}
		
		.qu{
		text-align:center;
		width:45px;
		border-radius:10px;
		}
		.qu:hover{
		background:#41ae3c;
		}
		.admin{
		text-decoration:none;
		color:#41ae3c;
		}
	</style>
  </head>
  
  <body>
   <div class="title"><h1>第七史诗后台管理系统</h1></div>
   
   <div class="menu">
   	<ul>
   		<li>你好，管理员<font><a href="#" class="admin">${sessionScope.user.adminName }</a></font></li>
   		<li class="qu"><a href="quit.action" target="_parent">退出</a></li>
   	</ul>
   </div>
   
   
   
  </body>
</html>
