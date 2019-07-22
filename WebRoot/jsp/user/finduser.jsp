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
    
    <title>My JSP 'finduser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
	*{
	padding:0;
	margin:0;
	}
	.form{
	text-align:center;
	margin-top:30px;
	}
	.text{
	width:350px;
	height:40px;
	font-size:18px;
	border-radius:10px;
	outline:none;
	}
	.submit{
	height:40px;
	background:#3c9566;
	width:80px;
	color:white;
	margin-left:-3px;
	border:none;
	font-size:18px;
	border-radius:10px;
	}
	#submit2{
	background:#f43e06;
	}
	.submit:hover{
	cursor:pointer;
	}
	select{
	width:130px;
	height:40px;
	font-size:14px;
	border-radius:10px;
	outline:none;
	}
	.top{
	font-size:20px;
	border-bottom:1px solid gray;
	width:1200px;
	margin-top:10px;
	height:30px;
	}
	.add{
	margin-left:20px;
	text-align:center;
	background:#983680;
	color:white;
	border-radius:10px;
	width:150px;
	}
</style>
  </head>
  
  <body>
   <div class="top">
  		<p class="add">查找用户</p>
  	</div>
  <div class="form">
    <form  method="post" action="<c:url value='/findUser.action?currentPage=1'/>">
    	<select name="select">
    		<option value="username" selected="selected" >按用户名查找</option>
    		<option value="uid" >按用户名id查找</option>
    		<option value="email">按邮箱查找</option>
    		<option value="phonenumber">按手机号码查询</option>
    	</select>
    	<input type="text"  class="text" name="username">
    	<input type="submit" value="搜索" class="submit">
    	
    </form> 
    
   </div>
   
  </body>
</html>
